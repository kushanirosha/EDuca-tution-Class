import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-student-add-edit',
  templateUrl: './student-add-edit.component.html',
  styleUrls: ['./student-add-edit.component.scss']
})
export class StudentAddEditComponent implements OnInit{

  constructor(private router :Router){

  }

  ngOnInit(): void {

  }

  goBack(){
    this.router.navigate(['/admin/student/students'])
  }
}
