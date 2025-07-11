package com.manacode_dev.hexcode;

public class StatBlock {
    public int str, dex, intel, foc, vit, def, res;

    public StatBlock(int str, int dex, int intel, int foc, int vit, int def, int res) {
        this.str = str;
        this.dex = dex;
        this.intel = intel;
        this.foc = foc;
        this.vit = vit;
        this.def = def;
        this.res = res;
    }

    @Override
    public String toString() {
        return "STR: " + str + ", DEX: " + dex + ", INT: " + intel +
                ", FOC: " + foc + ", VIT: " + vit + ", DEF: " + def + ", RES: " + res;
    }
}