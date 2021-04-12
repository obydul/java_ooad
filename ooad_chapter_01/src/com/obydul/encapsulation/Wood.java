package com.obydul.encapsulation;


public enum Wood {
    BANGLADESHI_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

    @Override
    public String toString() {
        switch(this){
            case BANGLADESHI_ROSEWOOD : return "Bangladeshi Rosewood";
            case BRAZILIAN_ROSEWOOD : return "Brazilian Rosewood";
            case MAHOGANY : return "Mahogany";
            case MAPLE : return "Maple";
            case COCOBOLO : return "Cocobolo";
            case CEDAR : return "Cedar";
            case ADIRONDACK : return "Adirondack";
            case ALDER : return "Alder";
            case SITKA : return "Sitka";
            default: return "unspecified";
        }
    }
    
    
    
}
