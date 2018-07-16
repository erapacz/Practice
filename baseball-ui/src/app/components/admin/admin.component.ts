import { Component, OnInit } from '@angular/core';
import { PlayerService } from '../../services/player.service';
import { AppService } from '../../app.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  public players;

  constructor(private playerService: PlayerService, private http: HttpClient, private router: Router, private app: AppService) { }

  ngOnInit() {
    this.getPlayers();
  }

  getPlayers() {
    this.playerService.getPlayers().subscribe(
      data => {this.players = data, console.log(this.players)},
      err => console.error(err),
      () => console.log('players loaded')
    );
  }

  logout() {
    this.http.post('server/logout', {}).subscribe(data => {
      this.app.authenticated = false;
      this.router.navigateByUrl('');
    });
  }
  authenticated() {
    return this.app.authenticated;
  };
}
