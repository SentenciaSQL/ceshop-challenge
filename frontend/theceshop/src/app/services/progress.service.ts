import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { environment } from '../../environments/environment';
import { Progress } from '../models/progress';
import { Studet } from '../models/student';
import { Course } from '../models/Course';

@Injectable({
  providedIn: 'root'
})
export class ProgressService {

  private url = environment.url;

  constructor(private http: HttpClient) { }

  getAllStudentById(studenId: number): Observable<any> {
    return this.http.get<Progress>(`${this.url}/progress/${studenId}`).pipe(
      catchError(e => {
        return throwError(() => new Error(e));
      })
    );
  }

  getProgressByStudentIdAndCourseId(studenId: number, courseId: number): Observable<any> {
    return this.http.get<Progress>(`${this.url}/progress/${studenId}/${courseId}`).pipe(
      catchError(e => {
        return throwError(() => new Error(e));
      })
    );
  }

  getStudentList() : Observable<any>{
    return this.http.get<Studet>(`${this.url}/students`).pipe(
      catchError(e => {
        return throwError(() => new Error(e));
      })
    );
  }

  getCourseList() : Observable<any>{
    return this.http.get<Course>(`${this.url}/courses`).pipe(
      catchError(e => {
        return throwError(() => new Error(e));
      })
    );
  }
}
