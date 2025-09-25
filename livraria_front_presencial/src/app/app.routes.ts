import { Routes } from '@angular/router';
import { HomePage } from './components/home-page/home-page';

export const routes: Routes = [
    // Para acessar o componente, vamos declarar uma rota para ele
{path: "home", component: HomePage },
{path: "", redirectTo: "/home", pathMatch: 'full'}
];


