package com.ipn.spring.dao;

import com.ipn.spring.pojo.PM;
import java.util.List;

public interface IPMDAO {

    public boolean crearPM(PM pm);

    public PM leerPMId(Integer idPM);

    public List<PM> leerPMs();

    public boolean actualizarPm(PM pm);

    public boolean borrarPM(Integer idPM);
}
