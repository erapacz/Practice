import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {
username: string;
password: string;

  constructor(private router: Router, private http: HttpClient) { }

  ngOnInit() {
  }

  login() {
    // return this.http.get('/server/api/v1/players/secured');
    if(this.username == 'eric' && this.password == '123') {
    this.router.navigate(['admin']);
  }else {
    alert("Invalid credentials")
  }
  }
}
