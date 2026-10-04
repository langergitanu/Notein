package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzCU implements zzZCH, zzZD1, Cloneable {
    private zzW3 zzZEs;
    private Font zzZEt;
    private com.aspose.words.internal.zzZYG<zz82> zzZEy;
    private boolean zzZy8;
    private zzEH zzZyA;
    private zzCL zzZyC;
    private zzZCO zzZyD;
    private zzD9 zzZyx;
    private zzCM zzZyy;
    private int zzZy6 = 1;
    private int zzZy5 = 1;

    public zzCU(zzZCO zzzco) {
        this.zzZyD = zzzco;
    }

    private static zz30 zzZ(zz11 zz11Var) {
        Iterator<zz4A> it = zz11Var.zzMi().iterator();
        while (it.hasNext()) {
            Iterator<zz47> it2 = it.next().zzMf().iterator();
            if (it2.hasNext()) {
                return it2.next().zzZx5();
            }
        }
        return zz11Var.zzMi().get(0).zzZxo();
    }

    private zz30 zzZHc() {
        zz30 zz30Var = new zz30();
        zz30Var.zzX(zz0K.zzXh(this.zzZyD.getDefaultFontSize()));
        zz30Var.setBold(false);
        zz30Var.zzWO(false);
        zz30Var.setUnderline(0);
        zz30Var.zzH5(0);
        zz30Var.zzZ(new zz0K(this.zzZyD.getChartSpace().zz33() ? 0 : 1200));
        zz30Var.zzY(new zz0K(0));
        zz30Var.zzXu(0.0d);
        zz2Q zz2q = new zz2Q();
        zz2q.setValue(12);
        zz5C zz5c = new zz5C();
        zz5c.setValue(0.65d);
        zz5B zz5b = new zz5B();
        zz5b.setValue(0.35d);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz5C>) zz2q.zzZNX(), zz5c);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz5B>) zz2q.zzZNX(), zz5b);
        zz30Var.setFill(new zz1C(zz2q));
        return zz30Var;
    }

    private zz11 zzZHd() {
        zz11 zz11Var = new zz11();
        if (this.zzZyD.getChartSpace().zz33()) {
            zzY(zz11Var.zzZtK());
        }
        zz30 zz30VarZz3C = zzaS().zz3C();
        if (zz30VarZz3C == null || zz30VarZz3C.isEmpty()) {
            zz30VarZz3C = zzZHc();
        }
        zz4A zz4a = new zz4A((byte) 0);
        zz4a.zzZxp().zzWS(true);
        zz4a.zzZxp().zzX(zz30VarZz3C.zzZw2());
        zz4a.zzY(new zz31());
        zz11Var.zzY(zz4a);
        return zz11Var;
    }

    private void zzZHe() {
        if (this.zzZyy == null) {
            this.zzZyy = new zzCM();
        }
        if (this.zzZyy.zzZGw() == null) {
            this.zzZyy.zzY(zzZHd());
        }
    }

    private zzW3 zzaS() {
        if (this.zzZEs == null) {
            this.zzZEs = new zzW3(this, this.zzZyD.getChartSpace());
        }
        return this.zzZEs;
    }

    @Override // com.aspose.words.zzZD1
    public Object fetchSpecialDefaultRunPropertyValue(int i) {
        if (i == 190) {
            return Integer.valueOf(com.aspose.words.internal.zzSA.zzt(this.zzZyD.getDefaultFontSize()));
        }
        return null;
    }

    @Override // com.aspose.words.zzZD1
    public String generateItemText() {
        return this.zzZyD.getDefaultTitleText();
    }

    @Override // com.aspose.words.zzZD1
    public zzCL getCollectionTxPr() {
        return null;
    }

    @Override // com.aspose.words.zzZCH
    public com.aspose.words.internal.zzZYG<zz82> getExtensions() {
        return this.zzZEy;
    }

    public final Font getFont() {
        if (this.zzZEt == null) {
            this.zzZEt = new Font(zzaS(), this.zzZyD.getChartSpace().zzZyb().getDocument());
        }
        return this.zzZEt;
    }

    @Override // com.aspose.words.zzZD1
    public zzD9 getItemSpPr() {
        return zzaQ();
    }

    @Override // com.aspose.words.zzZD1
    public zzCM getItemTx() {
        return this.zzZyy;
    }

    @Override // com.aspose.words.zzZD1
    public zzCL getItemTxPr() {
        return zzaR();
    }

    public final boolean getOverlay() {
        return this.zzZy8;
    }

    public final String getText() {
        zzCM zzcm = this.zzZyy;
        return zzcm == null ? this.zzZyD.getDefaultTitleText() : zzcm.getText();
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZCH
    public void setExtensions(com.aspose.words.internal.zzZYG<zz82> zzzyg) {
        this.zzZEy = zzzyg;
    }

    @Override // com.aspose.words.zzZD1
    public void setItemTxPr(zzCL zzcl) {
        this.zzZyC = zzcl;
    }

    public final void setOverlay(boolean z) {
        this.zzZy8 = z;
    }

    public final void setText(String str) {
        zzCL zzcl;
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            if (this.zzZyy == null && ((zzcl = this.zzZyC) == null || zzcl.isEmpty())) {
                return;
            } else {
                str = this.zzZyD.getDefaultTitleText();
            }
        }
        zzZHe();
        zz30 zz30VarZzZ = zzZ(this.zzZyy.zzZGw());
        ArrayList<zz4A> arrayListZzMi = this.zzZyy.zzZGw().zzMi();
        while (arrayListZzMi.size() != 1) {
            Class.getSimpleName();
        }
        zz4A zz4a = arrayListZzMi.get(0);
        zz4a.zzMf().clear();
        zz31 zz31Var = new zz31(zz30VarZzZ.zzZw2());
        zz4a.zzY(zz31Var);
        this.zzZyy.zzX(null);
        zz31Var.setText(str);
    }

    public final int zz2V() {
        return this.zzZy5;
    }

    public final int zz2W() {
        return this.zzZy6;
    }

    public final zzCM zz3u() {
        return this.zzZyy;
    }

    public final zzEH zz3y() {
        return this.zzZyA;
    }

    public final void zzNQ(int i) {
        this.zzZy5 = i;
    }

    public final void zzNR(int i) {
        this.zzZy6 = i;
    }

    public final void zzY(zzZCO zzzco) {
        this.zzZyD = zzzco;
    }

    public final void zzZHf() {
        if (this.zzZyy != null || zzaR().zzMi().size() > 0) {
            return;
        }
        zzaR().zzZGq();
        zzaR().zzZGt().zzZxp().zzX(zzZHc());
        zzaR().zzZGt().zzZxp().zzWS(true);
    }

    public zzCU zzZMt() {
        zzCU zzcu = (zzCU) memberwiseClone();
        zzY(zzcu);
        return zzcu;
    }

    public final zzD9 zzaQ() {
        if (this.zzZyx == null) {
            this.zzZyx = new zzD9();
        }
        return this.zzZyx;
    }

    public final zzCL zzaR() {
        if (this.zzZyC == null) {
            this.zzZyC = new zzCL();
        }
        return this.zzZyC;
    }

    public final void zzY(zzCU zzcu) {
        zzD9 zzd9 = this.zzZyx;
        if (zzd9 != null) {
            zzcu.zzZyx = zzd9.zzZI4();
        }
        zzCM zzcm = this.zzZyy;
        if (zzcm != null) {
            zzcu.zzZyy = zzcm.zzZGB();
        }
        zzCL zzcl = this.zzZyC;
        if (zzcl != null) {
            zzcu.zzZyC = zzcl.zzZGr();
        }
        zzEH zzeh = this.zzZyA;
        if (zzeh != null) {
            zzcu.zzZyA = zzeh.zzZLr();
        }
        com.aspose.words.internal.zzZYG<zz82> zzzyg = this.zzZEy;
        if (zzzyg != null) {
            zzcu.zzZEy = zz80.zzN(zzzyg);
        }
    }

    public final void zzZ(zzEH zzeh) {
        this.zzZyA = zzeh;
    }

    public final void zzZ(zzD9 zzd9) {
        this.zzZyx = zzd9;
    }

    public final void zzZ(zzCM zzcm) {
        this.zzZyy = zzcm;
    }

    private static void zzY(zz10 zz10Var) {
        zz10Var.zzGN(1);
        zz10Var.zzWJ(true);
    }
}
