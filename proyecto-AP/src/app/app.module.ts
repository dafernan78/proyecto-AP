import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './componentss/header/header.component';
import { LogoAPComponent } from './componentss/logo-ap/logo-ap.component';
import { RedesComponent } from './componentss/redes/redes.component';
import { FondoComponent } from './componentss/fondo/fondo.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoAPComponent,
    RedesComponent,
    FondoComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
