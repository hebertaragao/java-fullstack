import { Routes } from '@angular/router';
import { Home } from './components/home/home';

export const routes: Routes = [
    // Para acessar o componente, vamos declarar uma rota para ele
{path: "home", component: Home },
{path: "", redirectTo: "/home", pathMatch: 'full'}
];


