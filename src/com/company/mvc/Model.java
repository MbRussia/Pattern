package com.company.mvc;

import com.company.mvc.dto.DtoMC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Model {
    private FileInputStream fileInputStream;
    private Properties properties;

    public DtoMC getData() {
        DtoMC dtoMC = new DtoMC();
        try {
            fileInputStream = new FileInputStream("src/com/company/mvc/data.properties");
            properties = new Properties();
            properties.load(fileInputStream);

            dtoMC.setLogin(properties.getProperty("db.login", "loginNotFound"));
            dtoMC.setPasswd(properties.getProperty("db.passwd", "passwdNotFound"));
            return dtoMC;
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        } catch (IOException e) {
            System.out.println("прочесть нет возможности");
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
