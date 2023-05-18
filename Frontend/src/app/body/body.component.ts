import { Component } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-body',
  templateUrl: './body.component.html',
  styleUrls: ['./body.component.css']
})
export class BodyComponent {
isPlanned!:boolean
isActual!:boolean

constructor(private dataService:DataService){}

OnplannedClick(){
  this.isPlanned=true
}
OnactualClick(){
  this.isActual=true
}

}
