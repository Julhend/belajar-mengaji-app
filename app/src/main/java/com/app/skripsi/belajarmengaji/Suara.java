package com.app.skripsi.belajarmengaji;

import java.util.Random;


public class Suara {
    private int listsuara[] = {
            R.raw.tanwin_fatah_ban,
            R.raw.tanwin_fatah_dan,
            R.raw.tanwin_fatah_fan,
            R.raw.tanwin_fatah_ghon,
            R.raw.tanwin_fatah_an,
            R.raw.tanwin_fatah_man,
            R.raw.tanwin_fatah_qon,
            R.raw.tanwin_fatah_tan,
            R.raw.tanwin_fatah_san,
            R.raw.tanwin_fatah_syan,
            R.raw.tanwin_domah_khun,
            R.raw.tanwin_domah_wun,
            R.raw.tanwin_domah_tsun,
            R.raw.tanwin_domah_jun,


//            R.drawable.pop_fatahtain_ban,
//            R.drawable.pop_fatahtain_dan,
//            R.drawable.pop_fatahtain_fan,
//            R.drawable.pop_fatahtain_ghan,
//            R.drawable.pop_fatahtain_an,
//            R.drawable.pop_fatahtain_ma,
//            R.drawable.pop_fatahtain_qan,
//            R.drawable.pop_fatahtain_tan,
//            R.drawable.pop_fatahtain_san,
//            R.drawable.pop_fatahtain_syan,
//            R.drawable.pop_domahtain_khu,
//            R.drawable.pop_domahtain_wun,
//            R.drawable.pop_domahtain_tsun,
//            R.drawable.pop_domahtain_jun,

};

    private int listhuruf2[] = {
            R.drawable.tain_ban,
            R.drawable.tain_dan,
            R.drawable.tain_fan,
            R.drawable.tain_ghon,
            R.drawable.tain_an,
            R.drawable.tain_man,
            R.drawable.tain_qon,
            R.drawable.tain_tan,
            R.drawable.tain_san,
            R.drawable.tain_syan,
            R.drawable.domah_tain_kha,
            R.drawable.domah_tain_wawu,
            R.drawable.domah_tain_tsa,
            R.drawable.domah_tain_ja,
    };

    public int[] getlist(){
        return listsuara;
    }
    public int[] getlist2(){
        return listhuruf2;
    }

    public int getrandomhuruf(){
        int rnd = new Random().nextInt(listsuara.length);
        return rnd;
    }

    public int getSuara(int i){
        return listsuara[i];
    }

    public int getimagejwbn(int i){
        return listhuruf2[i];
    }

    public int getjumlah(){
        return listsuara.length;
    }
    public int getjumlah2(){
        return listhuruf2.length;
    }
}

