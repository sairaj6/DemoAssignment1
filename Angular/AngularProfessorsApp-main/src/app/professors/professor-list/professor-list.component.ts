import { Component, OnInit } from '@angular/core';
import {ProfessorService } from '../../shared/professor.service';
@Component({
  selector: 'app-professor-list',
  templateUrl: './professor-list.component.html',
  styleUrls: ['./professor-list.component.scss']
})
export class ProfessorListComponent implements OnInit {

  constructor(public professorService:ProfessorService) { }

  ngOnInit(): void {
    this.getAllProfessors();
  }
  getAllProfessors()
  {
    this.professorService.getAllProfessors();
  }

}
