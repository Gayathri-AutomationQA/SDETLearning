import { expect, type Locator, type Page } from '@playwright/test';

export class PlaywrightDevPage {
    readonly page: Page;
    readonly name: Locator;
    readonly email: Locator;
    readonly phone: Locator;
    readonly address: Locator;
    readonly genderMale: Locator;
    readonly genderFemale: Locator;
  
    constructor(page: Page) {
      this.page = page;
      this.name = page.locator('//input[@id="name"]');
      this.email = page.locator('//input[@id="email"]');
      this.phone = page.locator('//input[@id="phone"]');
      this.address = page.locator('//textarea[@id="textarea"]');
      this.genderMale = page.locator('//input[@id="male"]');
      this.genderFemale = page.locator('//input[@id="female"]');

    }
    async goToLoginPage() {
        await this.page.goto('https://testautomationpractice.blogspot.com/');
    }

    async inputName(name:string){
        await this.name.fill(name);
    }
    async inputEmail(email:string){
        await this.email.fill(email);
    }
    async inputPhone(phone:string){
        await this.phone.fill(phone);
    }
    async inputAddress(address:string){
        await this.address.fill(address);
    }
    async selectGenderMale(){
        await this.genderMale.click();
    }
    async selectGenderFemale(){
        await this.genderMale.click();
    }
}