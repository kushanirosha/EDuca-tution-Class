import {Component, OnInit} from '@angular/core';
import {AuthService} from "../../services/auth.service";
import {Router} from "@angular/router";
import {FormBuilder, FormGroup, Validator, Validators} from "@angular/forms";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})

export class LoginComponent implements OnInit{
  loginForm : FormGroup;

  constructor(private authService : AuthService,
              private router : Router,
              private fb : FormBuilder){}

  ngOnInit():void {
    this.authService.loginStatus.subscribe((loginStatus) =>{
      if (loginStatus){
        this.router.navigate(['/admin/dashboard'])
      }else {
        alert("Invalid Username or Password!.... ")
      }
    });
    this.loginForm = this.fb.group({
      username: ['',Validators.required],
      password: ['',Validators.required]
    })
  }
  onLogin(){
    let data = this.loginForm.getRawValue();

    if (data.username == 'Admin' && data.password =='AD@123'){
      this.authService.login(true);
    }else {
      this.authService.login(false);
    }

    console.log("data",data)

  }
}
