package com.aspose.words;

import androidx.appcompat.widget.C21532OooOOo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zz7C extends zz7X {
    private GradientStopCollection zzZ3j;
    private ArrayList<zz7B> zzZ3k;
    private zz3Z zzZ3l;
    private ArrayList<zz7B> zzZ3m;
    private zzZCE zzZ3n;
    private boolean zzZ3o;
    private int zzZgn;
    private boolean zzZgt;

    public zz7C() {
    }

    private static zzZCE zzS(zzGR zzgr) throws Exception {
        zz7C zz7c = (zz7C) com.aspose.words.internal.zzZKW.zzZ(zzgr.zzZTj().zzZu6().zzW(zzgr), zz7C.class);
        if (zz7c != null) {
            return zz7c.zzZAz();
        }
        return null;
    }

    private com.aspose.words.internal.zzPI[] zzT(zzGR zzgr) throws Exception {
        if (zzZAA().size() == 0) {
            return null;
        }
        com.aspose.words.internal.zzPI[] zzpiArrZzZAC = zzZAC();
        zzY(zzpiArrZzZAC, zzgr);
        zzZ(zzpiArrZzZAC, zzgr);
        return zzV(zzW(zzpiArrZzZAC));
    }

    private com.aspose.words.internal.zzZQ4 zzU(zzGR zzgr) {
        return this.zzZ3l != null ? zzZAy().zzZu(zzgr.zzZPK()) : zzgr.zzZPK();
    }

    private com.aspose.words.internal.zzPI[] zzZAC() {
        int size = zzZAA().size();
        if (zzZAr()) {
            size++;
        }
        if (zzZAq()) {
            size++;
        }
        return new com.aspose.words.internal.zzPI[size];
    }

    private boolean zzZAq() {
        return (zzZAs() == null || com.aspose.words.internal.zzAN.zzL(zzZAs().getPosition(), 1.0d)) ? false : true;
    }

    private boolean zzZAr() {
        return (zzZAt() == null || com.aspose.words.internal.zzAN.zzZD(zzZAt().getPosition())) ? false : true;
    }

    private zz7B zzZAs() {
        if (zzZAu().size() == 0) {
            return null;
        }
        return zzZAu().get(zzZAu().size() - 1);
    }

    private zz7B zzZAt() {
        if (zzZAu().size() == 0) {
            return null;
        }
        return zzZAu().get(0);
    }

    private ArrayList<zz7B> zzZAu() {
        if (this.zzZ3k == null) {
            ArrayList<zz7B> arrayListZzY = com.aspose.words.internal.zzZQG.zzY(zzZAA());
            this.zzZ3k = arrayListZzY;
            Collections.sort(arrayListZzY);
        }
        return this.zzZ3k;
    }

    private zz7B zzZAv() {
        if (zzZAA().size() == 0) {
            return null;
        }
        return zzZAA().get(zzZAA().size() - 1);
    }

    private zz7B zzZAw() {
        if (zzZAA().size() == 0) {
            return null;
        }
        return zzZAA().get(0);
    }

    @Override // com.aspose.words.zz7X
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        zz7C zz7c = (zz7C) obj;
        return zz7c.zzZgt == this.zzZgt && zz7c.zzZgn == this.zzZgn && com.aspose.words.internal.zzZKO.equals(zz7c.zzZAy(), zzZAy()) && com.aspose.words.internal.zzZKO.equals(zz7c.zzZAz(), zzZAz()) && com.aspose.words.internal.zzBP.zzX(zz7c.zzZAA(), zzZAA());
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final int getFillType() {
        zz44 zz44Var = (zz44) com.aspose.words.internal.zzZKW.zzZ(zzZAz(), zz44.class);
        if (zz44Var != null) {
            return zz44Var.zzZwY();
        }
        zz5S zz5s = (zz5S) com.aspose.words.internal.zzZKW.zzZ(zzZAz(), zz5S.class);
        if (zz5s != null) {
            return zz5s.zzZRC() ? 7 : 10;
        }
        return 4;
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final int getGradientStyle() {
        zzZCE zzzce = this.zzZ3n;
        if (zzzce == null) {
            return -1;
        }
        return zzzce.getGradientStyle();
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final int getGradientVariant() {
        ArrayList<zz7B> arrayList;
        zzZCE zzzce = this.zzZ3n;
        if (zzzce == null || (arrayList = this.zzZ3m) == null) {
            return 0;
        }
        return zzzce.zzZZ(arrayList);
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final double getOpacity() {
        return super.getOpacity();
    }

    @Override // com.aspose.words.zz7X
    public int hashCode() {
        int iHashCode = (((super.hashCode() ^ zzZAy().hashCode()) ^ this.zzZgn) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzZgt)) ^ zzZAz().hashCode();
        Iterator<zz7B> it = zzZAA().iterator();
        while (it.hasNext()) {
            iHashCode ^= it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final void setOpacity(double d) {
        for (zz7B zz7b : zzZAA()) {
            if (zz7b.zzZQX() != null) {
                zz7b.zzZQX().zzY0(d);
            }
        }
    }

    public final void zz2(ArrayList<zz7B> arrayList) {
        this.zzZ3m = arrayList;
    }

    public final void zzLB(int i) {
        this.zzZgn = i;
    }

    @Override // com.aspose.words.zz7X
    public final void zzO(zzBW zzbw) {
        if (zzZAv() != null) {
            zzZAv().zzZ(zzbw);
        }
    }

    @Override // com.aspose.words.zz7X
    public final void zzP(zzBW zzbw) {
        if (zzZAw() != null) {
            zzZAw().zzZ(zzbw);
        }
    }

    @Override // com.aspose.words.zz7X
    public final void zzV(zzBW zzbw) {
        Iterator<zz7B> it = zzZAA().iterator();
        while (it.hasNext()) {
            it.next().zzZQX().zzV(zzbw);
        }
    }

    @Override // com.aspose.words.zz7X
    public final void zzW(zzZ90 zzz90) {
        ArrayList<zz7B> arrayList = this.zzZ3m;
        if (arrayList != null) {
            for (zz7B zz7b : arrayList) {
                if (zz7b.zzZQX().zzZHs() == 5) {
                    zz7b.zzZ(((zz2Q) zz7b.zzZQX()).zzS(zzz90));
                }
            }
        }
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final Shading zzX(zzGR zzgr) throws Exception {
        return zzYCL.zzZI((zzZAt() == null ? zzBW.zzZ8e : zzZAt().zzZQX()).zzZ(zzgr.getThemeProvider(), zzgr.zzZPL()));
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final void zzXV(double d) {
        zz5S zz5s = (zz5S) com.aspose.words.internal.zzZKW.zzZ(zzZAz(), zz5S.class);
        if (zz5s != null) {
            zz5s.zzU(zzHK.zzYR(d));
        }
    }

    @Override // com.aspose.words.zz7X
    public final com.aspose.words.internal.zzPV zzY(zzGR zzgr) throws Exception {
        return zzZAA().size() > 0 ? zzZAA().get(0).zzZQX().zzZ(zzgr.getThemeProvider(), zzgr.zzZPL()) : com.aspose.words.internal.zzPV.zzKa;
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final void zzY6(boolean z) {
        this.zzZgt = z;
    }

    @Override // com.aspose.words.zz7X
    public final com.aspose.words.internal.zzPY zzZ(zzGR zzgr) throws Exception {
        this.zzZ3k = null;
        boolean z = this.zzZgt;
        zzZCE zzzceZzS = zzS(zzgr);
        if (this.zzZ3o || zzzceZzS == null) {
            zzzceZzS = zzZAz();
        }
        if (zzzceZzS == null) {
            return com.aspose.words.internal.zzPY.zzPJ();
        }
        zzzceZzS.zzQ(zzgr);
        com.aspose.words.internal.zzZQ4 zzzq4ZzU = zzU(zzgr);
        if (com.aspose.words.internal.zzAN.zzf(zzzq4ZzU.getWidth()) && com.aspose.words.internal.zzAN.zzf(zzzq4ZzU.getHeight())) {
            return com.aspose.words.internal.zzPY.zzPJ();
        }
        com.aspose.words.internal.zzPL zzplZzZ = zzzceZzS.zzZ(new com.aspose.words.internal.zzZQ4(zzzq4ZzU.getX(), zzzq4ZzU.getY(), com.aspose.words.internal.zzAN.zzf(zzzq4ZzU.getWidth()) ? 1.0f : zzzq4ZzU.getWidth(), com.aspose.words.internal.zzAN.zzf(zzzq4ZzU.getHeight()) ? 1.0f : zzzq4ZzU.getHeight()), zzgr, z);
        zzplZzZ.zzY(zzT(zzgr));
        zzplZzZ.zzXR(3);
        return zzplZzZ;
    }

    public final ArrayList<zz7B> zzZAA() {
        if (this.zzZ3m == null) {
            this.zzZ3m = new ArrayList<>();
        }
        return this.zzZ3m;
    }

    public final int zzZAB() {
        return this.zzZgn;
    }

    public final GradientStopCollection zzZAx() {
        if (this.zzZ3j == null) {
            this.zzZ3j = new GradientStopCollection(this, getThemeProvider());
        }
        return this.zzZ3j;
    }

    public final zz3Z zzZAy() {
        if (this.zzZ3l == null) {
            this.zzZ3l = new zz3Z();
        }
        return this.zzZ3l;
    }

    public final zzZCE zzZAz() {
        if (this.zzZ3n == null) {
            this.zzZ3n = new zz5S();
        }
        return this.zzZ3n;
    }

    @Override // com.aspose.words.zz7X
    public final zzBW zzZBm() {
        if (zzZAv() == null) {
            return null;
        }
        return zzZAv().zzZQX();
    }

    @Override // com.aspose.words.zz7X
    public final zzBW zzZBn() {
        if (zzZAw() == null) {
            return null;
        }
        return zzZAw().zzZQX();
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final double zzZBu() {
        zz5S zz5s = (zz5S) com.aspose.words.internal.zzZKW.zzZ(zzZAz(), zz5S.class);
        if (zz5s != null) {
            return zz5s.zzZyG().zzZQQ();
        }
        return 0.0d;
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final zzZLE[] zzZBw() {
        return zzZZZ.zzY(zzZAu(), getThemeProvider());
    }

    @Override // com.aspose.words.zz7X
    public final int zzZQ4() {
        return 1;
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final boolean zzZQ5() {
        return this.zzZgt;
    }

    @Override // com.aspose.words.zz7X
    public final zz7X zzZQ6() {
        zz7C zz7c = new zz7C();
        zz7c.zzZgt = this.zzZgt;
        zz7c.zzZgn = this.zzZgn;
        Iterator<zz7B> it = zzZAA().iterator();
        while (it.hasNext()) {
            zz7c.zzZAA().add(it.next().zzZAp());
        }
        zz7c.zzZ(zzZAz().zzZyI());
        zz7c.zzZ3l = zzZAy().zzZwI();
        return zz7c;
    }

    public zz7C(zzBW zzbw, zzBW zzbw2, int i, int i2, zzZ90 zzz90) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                zzZ(new zz5S(i, i2, zzz90));
                this.zzZ3m = zz5S.zzZ(zzbw, zzbw2, i2);
                return;
            case 5:
                zzZ(new zz44(i, i2, zzz90));
                this.zzZ3m = zz44.zzY(zzbw, zzbw2);
                this.zzZ3l = zz44.zzHh(i2);
                return;
            case 6:
                zzZ(new zz44(i, i2, zzz90));
                this.zzZ3m = zz44.zzY(zzbw, zzbw2, i2);
                return;
            default:
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "The specified value is out of range.\r\nParameter name: style\r\nParameter value: "));
        }
    }

    private static com.aspose.words.internal.zzPI[] zzV(com.aspose.words.internal.zzPI[] zzpiArr) {
        if (zzpiArr.length != 2) {
            return zzpiArr;
        }
        com.aspose.words.internal.zzPV zzpvZzZy = zzpiArr[0].zzZy();
        com.aspose.words.internal.zzPV zzpvZzZy2 = zzpiArr[1].zzZy();
        return new com.aspose.words.internal.zzPI[]{new com.aspose.words.internal.zzPI(zzpvZzZy, 0.0f), new com.aspose.words.internal.zzPI(com.aspose.words.internal.zzPS.zzZ(zzpvZzZy, zzpvZzZy2, 0.2f), 0.2f), new com.aspose.words.internal.zzPI(com.aspose.words.internal.zzPS.zzZ(zzpvZzZy, zzpvZzZy2, 0.4f), 0.4f), new com.aspose.words.internal.zzPI(com.aspose.words.internal.zzPS.zzZ(zzpvZzZy, zzpvZzZy2, 0.6f), 0.6f), new com.aspose.words.internal.zzPI(com.aspose.words.internal.zzPS.zzZ(zzpvZzZy, zzpvZzZy2, 0.8f), 0.8f), new com.aspose.words.internal.zzPI(zzpvZzZy2, 1.0f)};
    }

    private void zzY(com.aspose.words.internal.zzPI[] zzpiArr, zzGR zzgr) throws Exception {
        if (zzZAr()) {
            zzpiArr[0] = zzZAt().zzZ(0.0f, zzgr.getThemeProvider(), zzgr.zzZPL());
        }
        if (zzZAq()) {
            zzpiArr[zzpiArr.length - 1] = zzZAs().zzZ(1.0f, zzgr.getThemeProvider(), zzgr.zzZPL());
        }
    }

    private com.aspose.words.internal.zzPI[] zzW(com.aspose.words.internal.zzPI[] zzpiArr) {
        return !zzZAz().zzZyH() ? zzpiArr : zzZVJ.zzU(zzpiArr);
    }

    public final void zzX(zz3Z zz3z) {
        this.zzZ3l = zz3z;
    }

    private void zzZ(com.aspose.words.internal.zzPI[] zzpiArr, zzGR zzgr) throws Exception {
        boolean zZzZAr = zzZAr();
        for (int i = 0; i < zzZAu().size(); i++) {
            zzpiArr[(zZzZAr ? 1 : 0) + i] = zzZAu().get(i).zzY(zzgr.getThemeProvider(), zzgr.zzZPL());
        }
    }

    public final void zzZ(zzZCE zzzce) {
        this.zzZ3n = zzzce;
        this.zzZ3o = true;
    }
}
