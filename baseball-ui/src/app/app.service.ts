import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { CanActivate } from '@angular/router';
// import { AuthService } from ''

@Injectable()
export class AppService {
  authenticated = false;

  constructor(private http: HttpClient) {
  }

  authenticate(credentials, callback) {
    const headers = new HttpHeaders(credentials ? {
      authorization: 'basic ' + btoa(credentials.username + ':' + credentials.password)} : {});

      this.http.get('server/user', {headers: headers}).subscribe(response => {
        if(response['name']) {
          this.authenticated = true;
        } else {
          this.authenticated = false;
        }
        return callback && callback();
      });
  }
}
