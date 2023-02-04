import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { StudentComponent } from './pages/student/student.component';

const routes: Routes = [
  {path: 'index', component: HomeComponent},
  {path: 'student', component: StudentComponent},
  {path: '', redirectTo: '/index', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
