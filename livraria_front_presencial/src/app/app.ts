import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [
    RouterOutlet,
  ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('livraria-front');
<<<<<<< HEAD
}
=======
}
>>>>>>> b15b50bb03fb037d686ec359afd2f5184eecb831
