
import {Component} from "angular2/core";
import {RouteConfig} from "angular2/router";
import {TasksComponent} from "./tasks-component";
import {HelpersComponent} from "./helpers-component";
import {AlgorithmsComponent} from "./algorithms-component";
import {ROUTER_DIRECTIVES} from "angular2/router";
import {HomePageComponent} from "./homepage-component";
@Component({
    selector: 'app',
    templateUrl: '/app/views/app.html',
    directives: [ROUTER_DIRECTIVES]
})
@RouteConfig([
    {path: '/', name: 'HomePage', component: HomePageComponent, useAsDefault: true},
    {path:'/taks', name:'Tasks', component:TasksComponent},
    {path: '/helpers', name: 'Helpers', component: HelpersComponent},
    {path: '/algorithms', name: 'Algorithms', component: AlgorithmsComponent}
])
export class AppComponent {

}