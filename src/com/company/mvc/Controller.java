package com.company.mvc;


import com.company.mvc.dto.DtoMC;
import com.company.mvc.dto.DtoVC;

public class Controller {
    private Model model = new Model();

    public DtoVC checkResult(DtoMC dtoMC) {
        DtoVC dtoVC = new DtoVC();
        dtoVC.setAuth(false);
        if (dtoMC.getLogin() == null && dtoMC.getPasswd() == null) {
            return dtoVC;
        }

        DtoMC dtoMCNew = model.getData();
        if (dtoMCNew.getLogin().equals(dtoMC.getLogin()) && dtoMCNew.getPasswd().equals(dtoMC.getPasswd())) {
            dtoVC.setAuth(true);
            return dtoVC;
        }
        return dtoVC;
    }
}
