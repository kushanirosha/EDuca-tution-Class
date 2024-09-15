import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  loginStatus = new Subject<boolean>();

  constructor() {}

  login(status: boolean): void {
    setTimeout(() => {
      this.loginStatus.next(status);
    }, 3000);
  }
}
