import {Component} from "angular2/core";
import {NavbarComponent} from './navbar-component'
@Component({
    selector: 'main-page',
    templateUrl: '/app/views/main-page.html',
    directives: [<any>NavbarComponent]
})
export class MainPageComponent {

}