package com.example.pwmobile2;

public class resP1 {
    String Cat,Gen,Edad,EstCiv,Antiguedad,Escolaridad;
    String Plaza,OtroPlaza,Discapacidad,TipoDisc;
    String SectorPob,TipoSector,OtroSector;
    String CT1,CT2,CT3,CT4;
    String HorInicio,HorFinal;
    public resP1(){}

    public resP1(String cat, String gen, String edad, String estCiv, String antiguedad, String escolaridad, String plaza, String otroPlaza, String discapacidad, String tipoDisc, String sectorPob, String tipoSector, String otroSector, String CT1, String CT2, String CT3, String CT4, String horInicio, String horFinal) {
        this.Cat = cat;
        this.Gen = gen;
        this.Edad = edad;
        this.EstCiv = estCiv;
        this.Antiguedad = antiguedad;
        this.Escolaridad = escolaridad;
        this.Plaza = plaza;
        this.OtroPlaza = otroPlaza;
        this.Discapacidad = discapacidad;
        this.TipoDisc = tipoDisc;
        this.SectorPob = sectorPob;
        this.TipoSector = tipoSector;
        this.OtroSector = otroSector;
        this.CT1 = CT1;
        this.CT2 = CT2;
        this.CT3 = CT3;
        this.CT4 = CT4;
        HorInicio = horInicio;
        HorFinal = horFinal;
    }

    public String getCat() {
        return Cat;
    }

    public String getGen() {
        return Gen;
    }

    public String getEdad() {
        return Edad;
    }

    public String getEstCiv() {
        return EstCiv;
    }

    public String getAntiguedad() {
        return Antiguedad;
    }

    public String getEscolaridad() {
        return Escolaridad;
    }

    public String getPlaza() {
        return Plaza;
    }

    public String getOtroPlaza() {
        return OtroPlaza;
    }

    public String getDiscapacidad() {
        return Discapacidad;
    }

    public String getTipoDisc() {
        return TipoDisc;
    }

    public String getSectorPob() {
        return SectorPob;
    }

    public String getTipoSector() {
        return TipoSector;
    }

    public String getOtroSector() {
        return OtroSector;
    }

    public String getCT1() {
        return CT1;
    }

    public String getCT2() {
        return CT2;
    }

    public String getCT3() {
        return CT3;
    }

    public String getCT4() {
        return CT4;
    }

    public String getHorInicio() {
        return HorInicio;
    }

    public String getHorFinal() {
        return HorFinal;
    }
}
