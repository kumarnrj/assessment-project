import { Component, OnInit,Input, EventEmitter, Output } from '@angular/core';
import {RouterLink} from '@angular/router'
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {

 loginStatus=false;
  constructor() { }

  ngOnInit(): void {
  }
  fireEvent(){
    this.loginStatus=true;
  }
  
}
