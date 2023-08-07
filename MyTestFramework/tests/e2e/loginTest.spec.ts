import { test, expect } from '@playwright/test';
import { PlaywrightDevPage } from './login.po.ts';

test('@smoke Launch Url', async({page})=> {
    const login = new PlaywrightDevPage(page);
    await login.goToLoginPage();
    await login.inputName('Gayathri');
    await login.inputEmail('123@gmail.com');
    await login.inputPhone('7639196033');
    await login.inputAddress('abc');
    await login.selectGenderFemale();
    await page.waitForTimeout(70000);
});