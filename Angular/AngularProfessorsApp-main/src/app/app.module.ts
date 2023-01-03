import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProfessorsComponent } from './professors/professors.component';
import { ProfessorListComponent } from './professors/professor-list/professor-list.component';
import { HttpClientModule } from '@angular/common/http';
import {ProfessorService } from './shared/professor.service';

@NgModule({
  declarations: [
    AppComponent,
    ProfessorsComponent,
    ProfessorListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [ProfessorService],
  bootstrap: [AppComponent]
})
export class AppModule { }
