import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Progress } from 'src/app/models/progress';
import { ProgressService } from 'src/app/services/progress.service';
import { Studet } from '../../models/student';
import { Course } from '../../models/Course';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  id: number = 0;
  studentId: number = 0;
  courseId: number = 0;
  show: boolean = false;

  progress: Progress[] = [];
  progressStudent: Progress = new Progress();
  studentList: Studet[] = [];
  courseList: Course[] = [];

  constructor(private progressService: ProgressService) { }

  ngOnInit(): void {
    this.progressService.getStudentList().subscribe(data => this.studentList = data as Studet[])
    this.progressService.getCourseList().subscribe(data => this.courseList = data as Course[])
  }

  findStudents(form: NgForm): void {
    this.progressService.getAllStudentById(form.value.id).subscribe({
      next: (response) => {
        this.progress = response.data as Progress[];
      }, error: (err) => {
        this.progress = [];
        console.log(err);
      }
    })

  }

  findStudentByCourse(formCourse: NgForm) {
    this.progressService.getProgressByStudentIdAndCourseId(formCourse.value.id, formCourse.value.courseId).subscribe({
      next: (response) => {
        this.progressStudent = response.data as Progress;
        console.log(this.progressStudent);
        this.show = true;
      }, error: (err) => {
        alert("Data Not Found")
        console.log(err);
      }
    })
    
  }

}
