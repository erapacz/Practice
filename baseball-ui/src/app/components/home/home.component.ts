import { Component, OnInit } from '@angular/core';
import { PlayerService } from '../../services/player.service';
// import { AppService } from '../../app.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  public players;

  constructor(private playerService: PlayerService) { }

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
}
