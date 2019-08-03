package com.company.mvc;

import com.company.mvc.dto.DtoMC;
import com.company.mvc.dto.DtoVC;

import java.util.Scanner;

public class View {
    private Scanner scn = new Scanner(System.in);
    private Controller controller = new Controller();


    public void renderView(){
        System.out.println("Введите Логин");
        String inputLogin = scn.nextLine();
        System.out.println("Введите пароль");
        String inputPasswd = scn.nextLine();

        if(controller.checkResult(new DtoMC(inputLogin, inputPasswd)).isAuth()){
            System.out.println("ура");

        }
        else {
            System.out.println("пара лониг пароль не верные");
            renderView();
        }

    }


}
