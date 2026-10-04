package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZXH {
    private zzK7 zzAk;
    private zzJG zzAl;
    private int zzAr;
    private boolean zzAs;
    private boolean zzAt;
    private String zzF3;
    private boolean zza7;
    private boolean zza8;
    private boolean zza9;
    private int zzaA;
    private int zzaB;
    private int zzaC;
    private zzZX5 zzaD;
    private String zzaE;
    private String zzaF;
    private String zzaG;
    private boolean zzaH;
    private boolean zzaI;
    private boolean zzaJ;
    private boolean zzaa;
    private short zzab;
    private short zzac;
    private boolean zzad;
    private zzK0 zzae;
    private zzK0 zzaf;
    private zzK0 zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private zzZYV<Integer> zzak;
    private String zzal;
    private int zzam;
    private boolean zzan;
    private zzGR zzao;
    private float zzap;
    private int zzaq;
    private int zzar;
    private int zzas;
    private int zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private int zzax;
    private int zzay;
    private int zzaz;

    public static String zzT(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            zzZNH.zzU(sb, strArr[i]);
            if (i < strArr.length - 1) {
                sb.append('-');
            }
        }
        return sb.toString();
    }

    private String zzpo() {
        byte[] bArr = new byte[16];
        zzZ1.zzZ(this.zzF3.hashCode(), bArr, 0);
        zzZ1.zzZ(this.zzAr, bArr, 4);
        zzZ1.zzZ(this.zzaF.hashCode(), bArr, 8);
        return zzZKN.format("{0}.{1}", new zzZOZ(bArr).toString("D"), this.zzAs ? "otf" : "ttf");
    }

    public final String getFileName() {
        zzGR zzgr = this.zzao;
        if (zzgr == null) {
            return null;
        }
        zzGT zzgt = (zzGT) zzZKW.zzZ(zzgr, zzGT.class);
        return zzgt != null ? zzgt.getFileName() : zzpo();
    }

    public final String getFullFontName() {
        return this.zzaF;
    }

    public final int getStyle() {
        return this.zzAr;
    }

    public final boolean isBold() {
        return (this.zzAr & 1) != 0;
    }

    public final boolean isEmbedded() {
        return this.zzah;
    }

    public final boolean isItalic() {
        return (this.zzAr & 2) != 0;
    }

    public final zzK7 zzHB() {
        return this.zzAk;
    }

    public final zzJG zzHC() {
        return this.zzAl;
    }

    public final boolean zzHG() {
        return this.zzAs;
    }

    public final boolean zzHH() {
        return this.zzAt;
    }

    public final boolean zzHP() {
        return this.zza8;
    }

    public final boolean zzHQ() {
        return this.zza9;
    }

    public final boolean zzHR() {
        return this.zzad;
    }

    public final int zzHS() {
        return this.zzae.zzHU() + this.zzae.zzHV();
    }

    public final int zzHT() {
        return this.zzae.zzHT();
    }

    public final int zzHU() {
        return this.zzae.zzHU();
    }

    public final int zzHV() {
        return this.zzae.zzHV();
    }

    public final int zzI(float f, float f2) {
        return zzAN.zzZG((this.zzaC / f2) * f);
    }

    public final boolean zzI7() {
        return this.zzaj;
    }

    public final float zzJ(float f, float f2) {
        return f / (this.zzaC / f2);
    }

    public final void zzM(short s) {
        this.zzab = s;
    }

    public final void zzN(short s) {
        this.zzac = s;
    }

    public final boolean zzOY() {
        return this.zzai;
    }

    public final void zzP(zzZYV<Integer> zzzyv) {
        this.zzak = zzzyv;
    }

    public final String zzPh() {
        return this.zzF3;
    }

    public final boolean zzSC(int i) {
        return this.zzAl.zzWM(i);
    }

    public final void zzSD(int i) {
        this.zzam = i;
    }

    public final int zzSE(int i) {
        return this.zzaD.zzSx(i).zzoY();
    }

    public final int zzSF(int i) {
        return this.zzaD.zzSx(i).zzoZ();
    }

    public final void zzSG(int i) {
        this.zzaq = i;
    }

    public final void zzSH(int i) {
        this.zzar = i;
    }

    public final void zzSI(int i) {
        this.zzas = i;
    }

    public final void zzSJ(int i) {
        this.zzat = i;
    }

    public final void zzSK(int i) {
        this.zzau = i;
    }

    public final void zzSL(int i) {
        this.zzav = i;
    }

    public final void zzSM(int i) {
        this.zzaA = i;
    }

    public final void zzSN(int i) {
        this.zzaw = i;
    }

    public final void zzSO(int i) {
        this.zzax = i;
    }

    public final void zzSP(int i) {
        this.zzay = i;
    }

    public final void zzSQ(int i) {
        this.zzaz = i;
    }

    public final void zzSR(int i) {
        this.zzaB = i;
    }

    public final void zzSS(int i) {
        this.zzaC = i;
    }

    public final boolean zzVe() {
        return this.zzaI;
    }

    public final void zzW(zzZX5 zzzx5) {
        this.zzaD = zzzx5;
    }

    public final void zzWN(int i) {
        this.zzAr = i;
    }

    public final String zzWU(String str) {
        StringBuilder sb = new StringBuilder();
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        while (itOooO00o.hasNext()) {
            int iIntValue = ((Integer) itOooO00o.next()).intValue();
            zzZX9 zzzx9ZzSy = !this.zzaD.zzC(iIntValue, false) ? this.zzaD.zzSy(iIntValue) : null;
            if (zzzx9ZzSy != null) {
                iIntValue = zzzx9ZzSy.zzZD();
            }
            zzZNH.zzU(sb, zzZVS.zzS7(iIntValue));
        }
        return sb.toString();
    }

    public final void zzX(zzK0 zzk0) {
        this.zzae = zzk0;
    }

    public final void zzY(zzK0 zzk0) {
        this.zzaf = zzk0;
    }

    public final void zzZ(zzZXB zzzxb) {
        this.zzF3 = zzzxb.zzPh();
        this.zzaG = zzzxb.zzp3();
        this.zzaF = zzzxb.getFullFontName();
        this.zzaE = zzZYD.zzXk(zzzxb.zzp2()) ? zzzxb.zzp2() : zzzxb.getFullFontName();
    }

    public final void zzZR(float f) {
        this.zzap = f;
    }

    public final zzJO zzZk(boolean z) {
        return zzZ(z, false, false);
    }

    public final void zzZl(boolean z) {
        this.zzad = z;
    }

    public final void zzZm(boolean z) {
        this.zzai = z;
    }

    public final void zzZn(boolean z) {
        this.zzaj = z;
    }

    public final void zzZo(boolean z) {
        this.zzAt = z;
    }

    public final void zzZp(boolean z) {
        this.zza7 = z;
    }

    public final void zzZq(boolean z) {
        this.zza9 = z;
    }

    public final void zzZr(boolean z) {
        this.zza8 = z;
    }

    public final void zzZs(boolean z) {
        this.zzaa = z;
    }

    public final void zzZt(boolean z) {
        this.zzan = z;
    }

    public final void zzZu(boolean z) {
        this.zzaI = z;
    }

    public final void zzZv(boolean z) {
        this.zzaH = z;
    }

    public final boolean zzpA() {
        return this.zzan;
    }

    public final zzGR zzpB() {
        return this.zzao;
    }

    public final zzZYV<Integer> zzpC() {
        return this.zzak;
    }

    public final void zzpD() {
        this.zzAs = true;
    }

    public final boolean zzpE() {
        return this.zzaH;
    }

    public final int zzpF() {
        return this.zzaq;
    }

    public final int zzpG() {
        return this.zzas;
    }

    public final int zzpH() {
        return this.zzat;
    }

    public final int zzpI() {
        return this.zzau;
    }

    public final int zzpJ() {
        return this.zzav;
    }

    public final int zzpK() {
        return this.zzaw;
    }

    public final int zzpL() {
        return this.zzax;
    }

    public final int zzpM() {
        return this.zzay;
    }

    public final int zzpN() {
        return this.zzaz;
    }

    public final int zzpO() {
        return this.zzaC;
    }

    public final zzZX5 zzpP() {
        return this.zzaD;
    }

    public final String zzpQ() {
        return this.zzaE;
    }

    public final zzJO zzpn() {
        return this.zzAs ? new zzJN(this, false) : new zzJK(this, false);
    }

    public final void zzpp() {
        this.zzaJ = true;
    }

    public final short zzpq() {
        return this.zzab;
    }

    public final short zzpr() {
        return this.zzac;
    }

    public final zzK0 zzps() {
        return this.zzae;
    }

    public final zzK0 zzpt() {
        return this.zzaf;
    }

    public final zzK0 zzpu() {
        return this.zzag;
    }

    public final void zzpv() {
        this.zzah = true;
    }

    public final String zzpw() {
        if (!zzZYD.zzXk(this.zzal)) {
            this.zzal = zzT(new String[]{this.zzaF, this.zzF3, zzJB.zzWD(this.zzAr)});
        }
        return this.zzal;
    }

    public final int zzpx() {
        return this.zzam;
    }

    public final boolean zzpy() {
        return this.zza7;
    }

    public final boolean zzpz() {
        return this.zzaa;
    }

    public final float zzup() {
        return this.zzap;
    }

    public final int zzur() {
        return this.zzar;
    }

    public final void zzX(zzJG zzjg) {
        this.zzAl = zzjg;
    }

    public final void zzX(zzK7 zzk7) {
        this.zzAk = zzk7;
    }

    public final void zzZ(zzGR zzgr) {
        this.zzao = zzgr;
    }

    public final void zzZ(zzK0 zzk0) {
        this.zzag = zzk0;
    }

    public final zzJO zzZ(boolean z, boolean z2, boolean z3) {
        if (z) {
            return new zzJM(this);
        }
        if (this.zzAs) {
            return new zzJN(this, z2);
        }
        return new zzJL(this, z3);
    }
}
