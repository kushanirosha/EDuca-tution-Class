import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.scss']
})
export class StudentsComponent implements OnInit{

  student: any = [];

  constructor(private router : Router){}

  ngOnInit(): void {

  }

  addEditStudent(student:any){
    console.log("student",student)
    this.router.navigate(['/admin/student/add-edit'])
  }

  editStudent(student:any){
    console.log("student",student)
    this.router.navigate(['/admin/student/student-edit'])
  }

}
