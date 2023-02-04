import { Studet } from './student';
import { Course } from './Course';

export class Progress {
    id: number = 0;
    completedQuestions: number = 0;
    student: Studet = new Studet;
    course: Course = new Course;
    percentageCompleted: number = 0;
}