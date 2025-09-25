import { Component } from '@angular/core';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-home-page',
  imports: [],
  templateUrl: './home-page.html',
  styleUrl: './home-page.css'
})
export class HomePage {

  constructor(private router: Router){}

  navigateToLivrosPage(){
    this.router.navigate(['/livros']);

  }

}
