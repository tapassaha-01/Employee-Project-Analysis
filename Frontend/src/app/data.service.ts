import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http:HttpClient) { }
  url:string = "http://localhost:8080/entryPoint/";


    getProjectNames(file:File){
    const formData = new FormData();
        
      formData.append('file', file);
      console.log(formData)
    return this.http.post(this.url+'addExcel',formData);
  }
}
