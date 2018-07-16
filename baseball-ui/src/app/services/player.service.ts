import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json'})
};

@Injectable()
export class PlayerService {

  constructor(private http:HttpClient) { }

  getPlayers() {
    return this.http.get('/server/api/v1/players/secured');
  }

  getPlayer(number: number) {
    return this.http.get('/server/api/v1/players/secured/stats/' + number);
  }
}
