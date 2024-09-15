import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AdminLayoutComponent} from "./components/admin-layout/admin-layout.component";
import {LoginComponent} from "./components/login/login.component";
import {StudentsComponent} from "./components/student/students/students.component";
import {DashboardComponent} from "./components/dashboard/dashboard.component";
import {StudentAddEditComponent} from "./components/student/student-add-edit/student-add-edit.component";
import {CalculateComponent} from "./components/calculate/calculate.component";
import {AboutUsComponent} from "./components/about-us/about-us.component";
import {StudentEditComponent} from "./components/student/student-edit/student-edit.component";

const routes: Routes = [
  {
    path:'',
    redirectTo:'login',
    pathMatch:'full'
  },

  {
    path:'login',
    component:LoginComponent
  },
  {
    path:'admin',
    component:AdminLayoutComponent,
    children:[
      {
       path:'dashboard',
       component:DashboardComponent
      },
      {
        path:'student',
        children:[
          {
          path:'students',
          component:StudentsComponent
          },
          {
            path:'add-edit',
            component:StudentAddEditComponent
          },
          {
            path:'student-edit',
            component:StudentEditComponent
          }
          ]
      },
      {
        path:'calculate',
        component: CalculateComponent
      },

      {
        path:'about-us',
        component: AboutUsComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
