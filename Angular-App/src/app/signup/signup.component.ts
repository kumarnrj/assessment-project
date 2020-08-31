import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import {MdbCardComponent,ModalModule} from 'angular-bootstrap-md';


@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})
export class SignupComponent implements OnInit {

  firstname:string='';
  lastname;string='';
  email:string='';
  password:string='';
  mobile:number;

  url ='http://localhost:8080/api/customer';


 
  constructor(private http:HttpClient) { }

  ngOnInit(): void {
  }

  postData(){
   let postedData={
      "id": 102,
      "email": this.email,
      "password": this.password,
      "mobile": this.mobile,
      "firstName": this.firstname,
      "lastName": this.lastname
      }
    this.http.post(this.url,postedData).toPromise().then(data=>{
      console.log("successful");
    })
    alert("Succusfully Registered");
  
    
    
  }

}
