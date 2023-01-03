import { Injectable } from '@angular/core';
import { Professor } from './professor';
import {HttpClient} from '@angular/common/http';
import {environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root'
})
export class ProfessorService {
  //variable
  professors:Professor[];
  constructor(private httpClient : HttpClient) { }

  getAllProfessors()
  {
    this.httpClient.get(environment.apiUrl+'/api/professors').toPromise()
    .then((response)=>{
      console.log(response);
      this.professors=response as Professor[];
    },(error)=>{
      console.log(error);
    });
  }
}
