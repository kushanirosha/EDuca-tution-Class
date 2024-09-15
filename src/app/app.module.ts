import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { AdminLayoutComponent } from './components/admin-layout/admin-layout.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { StudentsComponent } from './components/student/students/students.component';
import {HttpClient, HttpClientModule} from "@angular/common/http";
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { StudentAddEditComponent } from './components/student/student-add-edit/student-add-edit.component';
import { CalculateComponent } from './components/calculate/calculate.component';
import { AboutUsComponent } from './components/about-us/about-us.component';
import { StudentEditComponent } from './components/student/student-edit/student-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AdminLayoutComponent,
    StudentsComponent,
    DashboardComponent,
    StudentAddEditComponent,
    CalculateComponent,
    AboutUsComponent,
    StudentEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
