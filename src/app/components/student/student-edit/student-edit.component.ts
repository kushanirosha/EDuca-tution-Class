import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-student-edit',
  templateUrl: './student-edit.component.html',
  styleUrls: ['./student-edit.component.scss']
})
export class StudentEditComponent implements OnInit{

  constructor(private router :Router){

  }

  ngOnInit(): void {

  }

  goBack(){
    this.router.navigate(['/admin/student/students'])
  }
}
