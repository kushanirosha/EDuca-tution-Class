import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from "@angular/forms";

@Component({
  selector: 'app-calculate',
  templateUrl: './calculate.component.html',
  styleUrls: ['./calculate.component.scss']
})
export class CalculateComponent implements OnInit {

  calculateForm: FormGroup;

  constructor(private fb: FormBuilder) {}

  ngOnInit(): void {
    this.calculateForm = this.createForm();
  }

  createForm() {
    return this.fb.group({
      firstValue: ['', [Validators.required]],
      secondValue: ['', [Validators.required]],
      answer: ['', [Validators.required]]
    });
  }

  action(type: string) {
    let data = this.calculateForm.getRawValue();
    let firstValue = Number(data.firstValue);
    let secondValue = Number(data.secondValue);

    let answer = null;

    if (type == 'add') {
      answer = firstValue + secondValue;
    } else if (type == 'minus') {
      answer = firstValue - secondValue;
    } else if (type == 'multiply') {
      answer = firstValue * secondValue;
    } else if (type == 'divide') {
      answer = firstValue / secondValue;
    }

    this.calculateForm.controls['answer'].setValue(answer);
  }

  clear(){
    this.calculateForm.setValue({
      firstValue:'',
      secondValue:'',
      answer:''
    })
  }
}
