package com.aspose.words;

import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz7X implements zzZAW, zzZCY {
    private zzZAV zzZ3V;
    private zzZ90 zzZxX;

    public static zz7X zzId(int i) {
        switch (i) {
            case 0:
                return new zzH0();
            case 1:
                return new zz7C();
            case 2:
                return new zz70();
            case 3:
                return new zz54();
            case 4:
                return new zz41();
            case 5:
                return new zz1C();
            case 6:
                return new zz19();
            default:
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "null\r\nParameter name: type\r\nParameter value: "));
        }
    }

    @Override // com.aspose.words.zzZCY
    public zzZCY deepCloneComplexAttr() {
        return zzZQ6();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return com.aspose.words.internal.zzZ4.zzW(this, obj) && ((zz7X) obj).zzZQ4() == zzZQ4();
    }

    @Override // com.aspose.words.zzZAW
    public int getFillType() {
        return 0;
    }

    @Override // com.aspose.words.zzZAW
    public int getGradientStyle() {
        return -1;
    }

    @Override // com.aspose.words.zzZAW
    public int getGradientVariant() {
        return 0;
    }

    @Override // com.aspose.words.zzZAW
    public byte[] getImageBytes() throws Exception {
        return null;
    }

    @Override // com.aspose.words.zzZAW
    public boolean getOn() {
        return true;
    }

    @Override // com.aspose.words.zzZAW
    public double getOpacity() {
        zzHV zzhvZzZFG;
        if (zzZBn() == null || (zzhvZzZFG = zzZBn().zzZFG()) == null) {
            return 1.0d;
        }
        return zzhvZzZFG.getValue();
    }

    public final zzZ90 getThemeProvider() {
        zzZ90 zzz90 = this.zzZxX;
        if (zzz90 != null) {
            return zzz90;
        }
        zzZAV zzzav = this.zzZ3V;
        if (zzzav != null) {
            return zzzav.getFillableThemeProvider();
        }
        return null;
    }

    public int hashCode() {
        return zzZQ4();
    }

    @Override // com.aspose.words.zzZCY
    public boolean isInheritedComplexAttr() {
        return false;
    }

    @Override // com.aspose.words.zzZAW
    public final void setImageBytes(byte[] bArr) {
        if (zzZQ4() == 0) {
            ((zzH0) this).zzZQ1().zzYt(bArr);
        }
    }

    @Override // com.aspose.words.zzZAW
    public void setOn(boolean z) {
        if (z) {
            return;
        }
        this.zzZ3V.setFill(new zz54());
    }

    @Override // com.aspose.words.zzZAW
    public void setOpacity(double d) {
        if (zzZBn() != null) {
            zzZBn().zzY0(d);
        }
    }

    @Override // com.aspose.words.zzZAW
    public final com.aspose.words.internal.zzPV zz8Q() {
        return zzZBn() != null ? zzZBn().zzZ(getThemeProvider(), (zzZCM) null) : com.aspose.words.internal.zzPV.zzHZ;
    }

    @Override // com.aspose.words.zzZAW
    public final void zzIc(int i) {
    }

    public void zzO(zzBW zzbw) {
    }

    public void zzP(zzBW zzbw) {
    }

    public void zzV(zzBW zzbw) {
    }

    public void zzW(zzZ90 zzz90) {
        zz2Q zz2q = (zz2Q) com.aspose.words.internal.zzZKW.zzZ(zzZBn(), zz2Q.class);
        if (zz2q != null) {
            zzP(zz2q.zzS(zzz90));
        }
        zz2Q zz2q2 = (zz2Q) com.aspose.words.internal.zzZKW.zzZ(zzZBm(), zz2Q.class);
        if (zz2q2 != null) {
            zzO(zz2q2.zzS(zzz90));
        }
    }

    @Override // com.aspose.words.zzZAW
    public abstract Shading zzX(zzGR zzgr) throws Exception;

    @Override // com.aspose.words.zzZAW
    public void zzXV(double d) {
    }

    public abstract com.aspose.words.internal.zzPV zzY(zzGR zzgr) throws Exception;

    @Override // com.aspose.words.zzZAW
    public void zzY6(boolean z) {
        throw new IllegalStateException("The specified value is out of range.");
    }

    public com.aspose.words.internal.zzPY zzZ(zzGR zzgr) throws Exception {
        return com.aspose.words.internal.zzPY.zzPJ();
    }

    public zzBW zzZBm() {
        return null;
    }

    public zzBW zzZBn() {
        return null;
    }

    @Override // com.aspose.words.zzZAW
    public final int zzZBo() {
        return 0;
    }

    @Override // com.aspose.words.zzZAW
    public final double zzZBp() {
        return 0.0d;
    }

    @Override // com.aspose.words.zzZAW
    public final double zzZBq() {
        return 0.0d;
    }

    @Override // com.aspose.words.zzZAW
    public final void zzZBr() {
    }

    @Override // com.aspose.words.zzZAW
    public final boolean zzZBs() {
        return false;
    }

    public final zzZAV zzZBt() {
        return this.zzZ3V;
    }

    @Override // com.aspose.words.zzZAW
    public double zzZBu() {
        return 0.0d;
    }

    @Override // com.aspose.words.zzZAW
    public final double zzZBv() {
        zzHV zzhvZzZFG;
        if (zzZBm() == null || (zzhvZzZFG = zzZBm().zzZFG()) == null) {
            return 1.0d;
        }
        return zzhvZzZFG.getValue();
    }

    @Override // com.aspose.words.zzZAW
    public zzZLE[] zzZBw() {
        return null;
    }

    @Override // com.aspose.words.zzZAW
    public final com.aspose.words.internal.zzPV zzZBx() {
        return zzZBm() != null ? zzZBm().zzZ(getThemeProvider(), (zzZCM) null) : com.aspose.words.internal.zzPV.zzHZ;
    }

    @Override // com.aspose.words.zzZAW
    public final com.aspose.words.internal.zzPV zzZBy() {
        return zzZBn() != null ? zzZBn().zzY(getThemeProvider()) : com.aspose.words.internal.zzPV.zzHZ;
    }

    public abstract int zzZQ4();

    @Override // com.aspose.words.zzZAW
    public boolean zzZQ5() {
        return false;
    }

    public abstract zz7X zzZQ6();

    @Override // com.aspose.words.zzZAW
    public final void zzi(com.aspose.words.internal.zzPV zzpv) {
        zzO(zz6S.zzh(zzpv));
    }

    @Override // com.aspose.words.zzZAW
    public final void zzm(com.aspose.words.internal.zzPV zzpv) {
        zzP(zz6S.zzh(zzpv));
    }

    public final void zzV(zzZ90 zzz90) {
        this.zzZxX = zzz90;
    }

    @Override // com.aspose.words.zzZAW
    public final void zzZ(zzZAV zzzav) {
        this.zzZ3V = zzzav;
    }
}
