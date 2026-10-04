package com.aspose.words.internal;

import com.aspose.words.Cluster;
import com.aspose.words.Glyph;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzPM {
    private String zzHA;
    private zzZVX zzHB;
    private float zzHC;
    private float zzHD;
    private int zzHE;
    private int zzHF;
    private int zzHG;
    private int zzHH;
    private boolean zzHI;
    private boolean zzHJ;
    private boolean zzHK;
    private zzH4 zzHL;
    private float zzHM;
    private int zzHN;
    private zzZXH zzHO;

    public zzPM(float f, int i, zzZXH zzzxh, boolean z, boolean z2, boolean z3) {
        this(f, i, zzzxh, z, z2, z3, false, false, false);
    }

    private float getAscentRawPoints() {
        return zzPm().getAscentRawPoints();
    }

    private float getUnderlinePosition() {
        return zzY4(this.zzHO.zzpr());
    }

    private float getUnderlineThickness() {
        return zzY4(this.zzHO.zzpq());
    }

    private float zzOR() {
        return this.zzHO.zzpK();
    }

    private float zzOS() {
        return this.zzHO.zzpM();
    }

    private float zzOT() {
        return this.zzHO.zzpL();
    }

    private float zzOU() {
        return this.zzHO.zzpN();
    }

    private float zzOV() {
        return zzOU() / this.zzHO.zzpO();
    }

    private float zzOW() {
        return zzOT() / this.zzHO.zzpO();
    }

    private float zzPa() {
        return (this.zzHM + 2.0f) - getDescentPoints();
    }

    private zzH4 zzPm() {
        if (this.zzHL == null) {
            this.zzHL = this.zzHK ? new zzZXA(this.zzHO, this.zzHM, zzPj(), this.zzHJ) : new zzZXE(this.zzHO, this.zzHM, zzPj(), this.zzHJ, this.zzHI);
        }
        return this.zzHL;
    }

    private boolean zzY3(int i) {
        int i2 = i / 2;
        int i3 = i / 4;
        int i4 = i2 + i3;
        int i5 = (i / 3) + 1;
        int iZzZ = zzZ(zzOU(), i);
        int iZzZ2 = zzZ(zzOT(), i);
        int iZzZ3 = zzZ(zzOS(), i);
        int iZzZ4 = zzZ(zzOR(), i);
        return i5 <= iZzZ && iZzZ <= i && i5 <= iZzZ2 && iZzZ2 <= i && iZzZ4 >= 0 && iZzZ4 <= i2 && i3 <= iZzZ3 && iZzZ3 <= i4;
    }

    public final float getAscentPoints() {
        return zzPm().getAscentPoints();
    }

    public final float getDescentPoints() {
        return zzPm().getDescentPoints();
    }

    public final float getDescentRawPoints() {
        return zzPm().getDescentRawPoints();
    }

    public final float getLineSpacingPoints() {
        return zzPm().getLineSpacingPoints();
    }

    public final int zz5(String str) {
        return zzSA.zzn(zz7(str));
    }

    public final long zz6(String str) {
        return zzZPW.zzG(zz7(str), zzPf());
    }

    public final float zz7(String str) {
        return zzPm().getTextWidthPoints(str, this.zzHM);
    }

    public final String zzOQ() {
        if (!zzZYD.zzXk(this.zzHA)) {
            this.zzHA = zzZXH.zzT(new String[]{this.zzHO.getFullFontName(), this.zzHO.zzPh(), zzJB.zzWD(this.zzHN)});
        }
        return this.zzHA;
    }

    public final zzZVX zzOX() {
        if (this.zzHB == null) {
            this.zzHB = this.zzHO.zzI7() ? new zzZVX(getDescentPoints(), -getUnderlinePosition(), this.zzHM / 20.0f) : new zzZVX(-getUnderlinePosition(), getUnderlineThickness());
        }
        return this.zzHB;
    }

    public final boolean zzOY() {
        return this.zzHO.zzOY();
    }

    public final boolean zzOZ() {
        return this.zzHO.zzI7();
    }

    public final zzPM zzP(float f) {
        return new zzPM(f, this.zzHN, this.zzHO, this.zzHK, this.zzHJ, this.zzHI);
    }

    public final float zzP0() {
        return this.zzHC;
    }

    public final float zzP1() {
        return this.zzHD;
    }

    public final int zzP2() {
        if (this.zzHH == -1) {
            this.zzHH = zzP5() + zzP6();
        }
        return this.zzHH;
    }

    public final int zzP3() {
        return zzSA.zzn(getDescentRawPoints());
    }

    public final int zzP4() {
        return zzSA.zzn(getAscentRawPoints());
    }

    public final int zzP5() {
        if (this.zzHE == -1) {
            this.zzHE = zzSA.zzn(getDescentPoints());
        }
        return this.zzHE;
    }

    public final int zzP6() {
        if (this.zzHF == -1) {
            this.zzHF = zzSA.zzn(getAscentPoints());
        }
        return this.zzHF;
    }

    public final int zzP7() {
        return zzSA.zzn(zzY4(this.zzHO.zzpO() / 2));
    }

    public final int zzP8() {
        if (this.zzHG == -1) {
            this.zzHG = zzSA.zzn(getLineSpacingPoints());
        }
        return this.zzHG;
    }

    public final int zzP9() {
        return zzSA.zzn(zzPa());
    }

    public final int zzPb() {
        return zzSA.zzn(zzPc());
    }

    public final float zzPc() {
        return (getDescentPoints() + getAscentPoints()) - this.zzHM;
    }

    public final int zzPd() {
        return zzP8() - zzP2();
    }

    public final float zzPe() {
        return getLineSpacingPoints() - zzPf();
    }

    public final float zzPf() {
        return getDescentPoints() + getAscentPoints();
    }

    public final float zzPg() {
        return this.zzHM;
    }

    public final String zzPh() {
        return this.zzHO.zzPh();
    }

    public final boolean zzPi() {
        return ((this.zzHN & 2) == 0 || this.zzHO.isItalic()) ? false : true;
    }

    public final boolean zzPj() {
        return ((this.zzHN & 1) == 0 || this.zzHO.isBold()) ? false : true;
    }

    public final int zzPk() {
        return this.zzHN;
    }

    public final zzZXH zzPl() {
        return this.zzHO;
    }

    public final int zzQ(float f) {
        return this.zzHO.zzI(f, this.zzHM);
    }

    public final void zzR(float f) {
        zzPm().setAscentPoints(zzPm().getAscentPoints() * f);
        zzPm().setAscentRawPoints(zzPm().getAscentRawPoints() * f);
        zzPm().setDescentPoints(zzPm().getDescentPoints() * f);
        zzPm().setDescentRawPoints(zzPm().getDescentRawPoints() * f);
        zzPm().setLineSpacingPoints(zzPm().getLineSpacingPoints() * f);
        this.zzHM *= f;
        this.zzHG = -1;
        this.zzHH = -1;
        this.zzHF = -1;
        this.zzHE = -1;
    }

    public final float zzY4(int i) {
        return this.zzHO.zzJ(i, this.zzHM);
    }

    public final int zzY5(int i) {
        return zzSA.zzn(zzY7(i));
    }

    public final float zzY6(int i) {
        return zzPm().getRawCharWidthPoints(i, this.zzHM);
    }

    public final float zzY7(int i) {
        return zzPm().getCharWidthPoints(i, this.zzHM);
    }

    public final void zzZ(zzH4 zzh4) {
        if (zzh4 == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: metrics");
        }
        if (this.zzHL != null) {
            throw new IllegalStateException("Font metrics already initialized.");
        }
        this.zzHL = zzh4;
    }

    public zzPM(float f, int i, zzZXH zzzxh, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.zzHH = -1;
        this.zzHG = -1;
        this.zzHF = -1;
        this.zzHE = -1;
        if (zzzxh == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: trueTypeFont");
        }
        this.zzHO = zzzxh;
        this.zzHN = i;
        this.zzHK = z;
        this.zzHJ = z2;
        this.zzHI = z3;
        this.zzHD = (zzzxh.zzpF() * 2.0f) / this.zzHO.zzpO();
        this.zzHC = (this.zzHO.zzpF() / 2.0f) / this.zzHO.zzSF(32);
        this.zzHM = (z4 || z5 || z6) ? zzZ(f, z4, z5, z6) : f;
    }

    public final Cluster[] zzZ(String str, float f) {
        ArrayList arrayList = new ArrayList(str.length());
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        while (itOooO00o.hasNext()) {
            int iIntValue = ((Integer) itOooO00o.next()).intValue();
            zzZQG.zzZ((ArrayList<Cluster>) arrayList, new Cluster(new int[]{iIntValue}, new Glyph[]{new Glyph(this.zzHO.zzpP().zzSx(iIntValue).getGlyphIndex(), (short) zzQ(zzY7(iIntValue) + f), (short) 0, (short) 0)}));
        }
        return (Cluster[]) arrayList.toArray(new Cluster[0]);
    }

    public zzPM(float f, int i, zzZXH zzzxh) {
        this(f, i, zzzxh, false, true, false);
    }

    private float zzZ(float f, boolean z, boolean z2, boolean z3) {
        float fZzt = zzSA.zzt(f);
        float fZzOV = zzOV();
        float fZzOW = zzOW();
        if (z2 || z3) {
            if (!zzY3((int) fZzt)) {
                fZzt *= 0.6f;
                if (fZzt < 2.0f) {
                    fZzt = 2.0f;
                }
            } else if (z2) {
                fZzt *= fZzOV;
            } else if (z3) {
                fZzt *= fZzOW;
            }
        }
        if (z) {
            fZzt *= 0.8f;
        }
        return (float) (((double) ((int) zzZKQ.zzR(fZzt, 0))) / 2.0d);
    }

    private int zzZ(float f, int i) {
        return (int) zzZKQ.zzR(this.zzHO.zzJ(f, i), 0);
    }
}
