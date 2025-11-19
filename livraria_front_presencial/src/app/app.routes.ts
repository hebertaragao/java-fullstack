<<<<<<< HEAD
import { Routes } from '@angular/router';
import { HomePage } from './components/home-page/home-page';
import { LivrosPage } from './components/livros-page/livros-page';

export const routes: Routes = [
    { path: "home", component: HomePage },
    { path: "livros", component: LivrosPage },
    { path: "", redirectTo: "/home", pathMatch: 'full' }, 
];
=======
import {Routes} from '@angular/router';
import {HomePage} from './components/home-page/home-page';
import {LivrosPage} from './components/livros-page/livros-page';

export const routes: Routes = [
    { path: "home", component: HomePage},
    { path: "livros", component: LivrosPage},
    { path: "", redirectTo: "/home", pathMatch: 'full'},
];
>>>>>>> b15b50bb03fb037d686ec359afd2f5184eecb831
