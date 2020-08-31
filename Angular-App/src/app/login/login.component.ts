import { Component, OnInit ,Output,EventEmitter} from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {FormControl, FormGroup, Validators} from "@angular/forms";

import {Router,Navigation} from '@angular/router';
import { Routes, RouterModule } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  Email:string='';
  Pwd:string='';
  
  url ='http://localhost:8080/api/customer';

  res=[];
  
  constructor(private http:HttpClient,private router: Router) { }

  validatingForm: FormGroup;

    
  ngOnInit() {
    this.validatingForm = new FormGroup({
      loginFormModalEmail: new FormControl('', Validators.email),
      loginFormModalPassword: new FormControl('', Validators.required)
    });
  }

  get loginFormModalEmail() {
    return this.validatingForm.get('loginFormModalEmail');
  }

  get loginFormModalPassword() {
    return this.validatingForm.get('loginFormModalPassword');
  }

  getData(){
    let obs=this.http.get(this.url);
    obs.subscribe((response)=>{
      for(let i=0;i<response.length;i++){
        
        if(this.Email==response[i].email && this.Pwd==response[i].password){
         
          this.router.navigate([('/home')]);
          
        }
        alert("Enter valid Email or Password");
       
      }
    
      
      
    })
    
  }
 
  
  

}
