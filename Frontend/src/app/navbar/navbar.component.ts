import { Component } from '@angular/core';
import { FormGroup,FormBuilder,FormControl} from '@angular/forms';
import { DataService } from '../data.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {
 massage!:string;
 welcome!:boolean
 uploadForm:FormGroup
 file!:File
 constructor(private formBuilder:FormBuilder,private service:DataService){
      this.uploadForm = this.formBuilder.group({
        projectName:new FormControl(['']),
        monthName: new FormControl(['']),
        employeeName: new FormControl(['']),
        projectFile: File,
        monthFile: new FormControl([null])
      });
 }

 ngOnInit():void{

 }

 OnSubmit(){
  this.welcome=true;
  this.file = this.uploadForm.value.projectFile;
  console.log(this.file)
  this.massage=this.uploadForm.value.employeeName;
  this.service.getProjectNames(this.file).subscribe(res=>{
    console.log(res);
  });
 }

}
