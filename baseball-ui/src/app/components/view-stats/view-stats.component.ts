import { Component, OnInit } from '@angular/core';
import { PlayerService } from '../../services/player.service';
import { ActivatedRoute } from '@angular/router';
// import { AppService } from '../../app.service';

@Component({
  selector: 'app-view-stats',
  templateUrl: './view-stats.component.html',
  styleUrls: ['./view-stats.component.css']
})
export class ViewStatsComponent implements OnInit {

  public player;
  public player1;

  constructor(private playerService: PlayerService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.getPlayer(this.route.snapshot.params.number);
  }

  getPlayer(number: number) {
    this.playerService.getPlayer(number).subscribe(
      data => {
        this.player = data[0][1], console.log(this.player);
        this.player1 = data[0][0], console.log(this.player1);
      },
      err => console.error(err),
      () => console.log('player loaded')
    );
  }
}
