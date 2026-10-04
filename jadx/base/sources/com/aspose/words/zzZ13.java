package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class zzZ13 {
    private com.aspose.words.internal.zzZQ4 zzG8;
    private int zzTL;
    private zzZ13 zzY1S;
    private com.aspose.words.internal.zzZXH zzY1T;
    private boolean zzY1U;
    private float zzY1V;
    private float zzY1W;
    private zzZ13 zzY1X;
    private boolean zzY1Y;
    private zzYEF zzY1Z;
    private OfficeMath zzY20;
    private zzZ14 zzY21;
    private float zzY22;
    private com.aspose.words.internal.zzG zzY23;
    private float zzY24;
    boolean zzY25;
    private float zzY26;
    private float zzY27;
    private com.aspose.words.internal.zzPM zzYX;
    private ArrayList<zzZ13> zzZc;
    private zzYEF zzZsP;
    String zzjy;

    public zzZ13(zzZ14 zzz14, OfficeMath officeMath) {
        this(zzz14, officeMath, zzZ7R.zzZ(officeMath, 1), true);
    }

    private static boolean zzK(zzYEF zzyef) {
        if (zzyef.contains(235) && com.aspose.words.internal.zzZKO.equals((zzU1) zzyef.zzPk(235), zzU1.zzMW(131075)) && zzyef.contains(400)) {
            return false;
        }
        return zzyef.zzS(zzYEF.zzXq6);
    }

    private boolean zzTj(boolean z) {
        int i = this.zzTL;
        if (i < 0) {
            return false;
        }
        if ((z && i == 0) || (!z && i == this.zzY1X.zzZc.size() - 1)) {
            return false;
        }
        zzYZP zzyzp = (zzYZP) com.aspose.words.internal.zzZKW.zzZ(this.zzY1X.zzZc.get(z ? this.zzTL - 1 : this.zzTL + 1), zzYZP.class);
        if (zzyzp == null) {
            return false;
        }
        char cCharAt = zzyzp.getText().charAt(z ? zzyzp.getText().length() - 1 : 0);
        return zzZ15.zzYt(cCharAt) || !zzZ15.zzYv(cCharAt) || zzyzp.zzZsP.zzYdI();
    }

    private static void zzY(com.aspose.words.internal.zzZQ4 zzzq4, zzZ0E zzz0e, com.aspose.words.internal.zzZG zzzg) {
        zzZ(com.aspose.words.internal.zzZPY.zzG(zzzq4.getX(), zzzq4.zzZn() / 2.0f), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn() / 2.0f), !zzz0e.zzYEU(), zzzg);
        zzZ(com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw() / 2.0f, zzzq4.getY()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw() / 2.0f, zzzq4.zzZn()), !zzz0e.zzYET(), zzzg);
        zzZ(com.aspose.words.internal.zzZPY.zzG(zzzq4.getX(), zzzq4.getY()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()), !zzz0e.zzYES(), zzzg);
        zzZ(com.aspose.words.internal.zzZPY.zzG(zzzq4.getX(), zzzq4.zzZn()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.getY()), !zzz0e.zzYEV(), zzzg);
    }

    private boolean zzYGp() {
        return ((Boolean) this.zzZsP.zzPj(750)).booleanValue();
    }

    private float zzYGw() throws Exception {
        return zzIp(getFontName());
    }

    private void zzYGx() {
        zzZ13 zzz13;
        zzZ13 zzz132 = this.zzY1X;
        if (zzz132 == null || zzz132.zzYG8().getMathObjectType() != 8) {
            return;
        }
        zzZ11.zzX(this, 3.0f);
        zzZ13 zzz133 = this.zzY1X.zzY1X;
        if (zzz133 != null) {
            if (zzz133.zzYG8().getMathObjectType() == 23) {
                zzZ11.zzZ(this, 3.0f);
            } else if (zzz133.zzYG8().getMathObjectType() == 6 && (zzz13 = zzz133.zzY1X) != null && (zzz13 instanceof zzZ16)) {
                zzZ11.zzW(this, 3.0f);
            }
        }
    }

    private void zzYGy() {
        OfficeMath officeMath;
        if (zzYG9() || this.zzZc.size() <= 0 || (officeMath = this.zzY20) == null) {
            return;
        }
        if (officeMath.zzZsL().getMathObjectType() == 1 || this.zzY20.zzZsL().getMathObjectType() == 0) {
            Border border = this.zzZc.get(0).zzZsP.getBorder();
            if (border.isVisible()) {
                float lineWidth = (float) border.getLineWidth();
                com.aspose.words.internal.zzZQ4 zzzq4 = this.zzG8;
                float f = lineWidth / 2.0f;
                zzzq4.zzH(f, -f);
                com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4);
                com.aspose.words.internal.zzOU zzou = new com.aspose.words.internal.zzOU(border.zz8Q().isEmpty() ? zzZy() : border.zz8Q(), lineWidth);
                float[] fArrZzOR = Border.zzOR(border.getLineStyle());
                if (fArrZzOR != null) {
                    zzou.zzW(fArrZzOR);
                }
                zzzgZzW.zzX(zzou);
                this.zzY23.zzX(zzzgZzW);
            }
        }
    }

    private void zzYGz() throws Exception {
        zzYGy();
        OfficeMath officeMath = this.zzY20;
        if (officeMath != null) {
            if (officeMath.zzZsL().getMathObjectType() == 4 || this.zzY20.zzZsL().getMathObjectType() == 3) {
                float fZzPg = zzZr().zzPg() / 30.0f;
                com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
                zzzg.zzX(new com.aspose.words.internal.zzOU(new com.aspose.words.internal.zzOI(zzZy()), fZzPg));
                if (this.zzY20.zzZsL().getMathObjectType() == 4) {
                    zzt(zzzg);
                } else {
                    zzs(zzzg);
                }
                this.zzY23.zzX(zzzg);
            }
        }
    }

    private com.aspose.words.internal.zzPV zzYKP() {
        zzZ13 zzz13 = this;
        while (zzz13.zzZsP.zzYKP().isEmpty() && zzz13.zzZsP.getShading().zzYbK().isEmpty() && zzz13.zzZc.size() != 0) {
            int mathObjectType = zzz13.zzY20.zzZsL().getMathObjectType();
            if (mathObjectType != 1 && mathObjectType != 0) {
                return zzz13.zzZsP.zzYKP();
            }
            zzz13 = zzz13.zzZc.get(0);
        }
        return zzz13.zzZsP.zzYKP().isEmpty() ? zzz13.zzZsP.getShading().zzYbK() : zzz13.zzZsP.zzYKP();
    }

    private void zzYm(float f) {
        this.zzY27 = Math.max(this.zzY27, f);
    }

    private void zzs(com.aspose.words.internal.zzZG zzzg) throws Exception {
        zzZ0F zzz0f = (zzZ0F) this.zzY20.zzZsL();
        if (this.zzG8.isEmpty()) {
            this.zzG8 = new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzZr().zzPf() - (zzZr().getDescentPoints() / 2.0f), zzZr().zzPf() / 2.0f);
        }
        float fZzZo = zzz0f.getPosition() == 0 ? this.zzG8.zzZo() : this.zzG8.zzZn();
        com.aspose.words.internal.OooO00o.OooO00o(zzzg, com.aspose.words.internal.zzP5.zzS(com.aspose.words.internal.zzZPY.zzG(this.zzG8.zzZm(), fZzZo), com.aspose.words.internal.zzZPY.zzG(this.zzG8.zzkw(), fZzZo)));
    }

    private void zzt(com.aspose.words.internal.zzZG zzzg) throws Exception {
        if (zzYG9()) {
            com.aspose.words.internal.OooO00o.OooO00o(zzzg, com.aspose.words.internal.zzP5.zzK(this.zzG8));
            return;
        }
        zzZ0E zzz0e = (zzZ0E) this.zzY20.zzZsL();
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(this.zzG8.getX() - 2.0f, this.zzG8.getY() - 2.0f, this.zzG8.getWidth() + 4.0f, this.zzG8.getHeight() + (this.zzG8.getHeight() <= zzZr().zzPg() ? 2.0f : 4.0f));
        zzZ(zzzq4, zzz0e, zzzg);
        zzY(zzzq4, zzz0e, zzzg);
        zzYGx();
    }

    public final String getFontName() {
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzjy)) {
            this.zzjy = zzYGv();
        }
        return this.zzjy;
    }

    public final float getFontSize() {
        return (float) (((double) (zzZz() ? this.zzZsP.zzYL6() : this.zzZsP.getSize())) / 2.0d);
    }

    public final float getHeight() {
        return this.zzG8.getHeight();
    }

    public final int getIndex() {
        return this.zzTL;
    }

    public final float getWidth() {
        return this.zzG8.getWidth();
    }

    public final boolean isInline() {
        return zzYOL.zzi(this.zzY20);
    }

    public void layoutChildren() throws Exception {
        for (zzZ13 zzz13 : this.zzZc) {
            zzz13.zzZE4();
            zzV(zzz13);
            zzYm(zzz13.zzYGg());
        }
    }

    public final void scale(float f, float f2) {
        if (this.zzY23.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(this.zzY23);
        }
        this.zzY23.zzZO().zzZ(f, f2, 1);
        this.zzG8 = this.zzY23.zzZO().zzO(this.zzG8);
        this.zzY26 *= f2;
    }

    public final com.aspose.words.internal.zzH zzG0() {
        return this.zzY21.zzZMR();
    }

    public final void zzI(com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzG8 = zzzq4;
    }

    public final float zzIp(String str) throws Exception {
        com.aspose.words.internal.zzZXH zzzxhZzPl = this.zzY21.zztv().zzY(str, getFontSize(), zzza()).zzPl();
        return zzzxhZzPl.zzJ((zzzxhZzPl.zzHR() ? zzzxhZzPl.zzpt() : zzzxhZzPl.zzpu()).zzHV(), zzZr().zzPg());
    }

    public final ArrayList<zzZ13> zzQw() {
        return this.zzZc;
    }

    public final void zzR(float f) {
        scale(f, f);
    }

    public final void zzTi(boolean z) {
        this.zzY1U = z;
    }

    public final void zzU(zzZ13 zzz13) {
        this.zzY1X = zzz13;
    }

    public final void zzV(zzZ13 zzz13) throws Exception {
        float height = this.zzG8.getHeight() - this.zzY26;
        float height2 = zzz13.zzG8.getHeight() - zzz13.zzYGq();
        float fZzYGq = this.zzY26 > zzz13.zzYGq() ? this.zzY26 : zzz13.zzYGq();
        this.zzY26 = fZzYGq;
        if (height <= height2) {
            height = height2;
        }
        float f = fZzYGq + height;
        if (com.aspose.words.internal.zzAN.zzR(this.zzG8.getHeight(), f)) {
            this.zzG8 = new com.aspose.words.internal.zzZQ4(this.zzG8.getX(), this.zzG8.getY(), this.zzG8.getWidth(), f);
        }
    }

    public final float zzYG0() {
        return zzYG4().getFontSize();
    }

    public final float zzYG1() throws Exception {
        return zzYG4().zzZr().zzPc();
    }

    public final float zzYG2() throws Exception {
        return zzYG4().zzYG5();
    }

    public final com.aspose.words.internal.zzPM zzYG3() throws Exception {
        return zzYG4().zzZr();
    }

    public final zzZ13 zzYG4() {
        if (this.zzY1S == null) {
            this.zzY1S = zzZ11.zzK(this);
        }
        return this.zzY1S;
    }

    public final float zzYG5() throws Exception {
        if (Float.isNaN(this.zzY1V)) {
            this.zzY1V = zzYGw() / 2.0f;
        }
        return this.zzY1V;
    }

    public final boolean zzYG6() {
        OfficeMath officeMath = this.zzY20;
        return officeMath != null && officeMath.zzZsL().getMathObjectType() == 0;
    }

    public final boolean zzYG7() {
        zzZ13 zzz13 = this.zzY1X;
        return zzz13 != null && zzz13.zzYG6();
    }

    public final OfficeMath zzYG8() {
        OfficeMath officeMath = this.zzY20;
        if (officeMath != null) {
            return officeMath;
        }
        zzZ13 zzz13 = this.zzY1X;
        if (zzz13 == null) {
            return null;
        }
        return zzz13.zzY20;
    }

    public final boolean zzYG9() {
        return zzYGa() || zzYGb();
    }

    public final void zzYGA() throws Exception {
        this.zzY23 = (com.aspose.words.internal.zzG) com.aspose.words.internal.zzF.zzZ(this.zzY23);
    }

    public final void zzYGB() throws Exception {
        com.aspose.words.internal.zzPV zzpvZzYKP = zzYKP();
        if (zzpvZzYKP.isEmpty() || com.aspose.words.internal.zzZPW.zzYF(this.zzG8.getSize())) {
            return;
        }
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzYGt());
        zzzgZzW.zzY(new com.aspose.words.internal.zzOI(zzpvZzYKP));
        this.zzY23.zzZ(0, zzzgZzW);
    }

    public void zzYGC() throws Exception {
    }

    public void zzYGD() throws Exception {
    }

    public final boolean zzYGa() {
        return (zzYG8() == null || zzYG8().zzYrX() == null || !zzYG8().zzYrX().zzYGa()) ? false : true;
    }

    public final boolean zzYGb() {
        return (zzYG8() == null || zzYG8().zzYrX() == null || !zzYG8().zzYrX().zzYGb()) ? false : true;
    }

    public final boolean zzYGc() {
        return zzTj(true);
    }

    public final boolean zzYGd() {
        return zzTj(false);
    }

    public final boolean zzYGe() throws Exception {
        return zzYGf() != null && "Cambria Math".equals(zzYGf().getFullFontName());
    }

    public final com.aspose.words.internal.zzZXH zzYGf() throws Exception {
        if (this.zzY1T == null) {
            this.zzY1T = this.zzY21.zztv().zzN("Cambria Math", zzza());
        }
        return this.zzY1T;
    }

    public final float zzYGg() throws Exception {
        if (this.zzY27 < 0.0f) {
            this.zzY27 = Math.max(this.zzY27, zzZ11.zzG(zzYG4().zzZr()));
        }
        return this.zzY27;
    }

    public final boolean zzYGh() {
        return this.zzY1U;
    }

    public final float zzYGi() {
        return this.zzY1W;
    }

    public final zzZ14 zzYGj() {
        return this.zzY21;
    }

    public final OfficeMath zzYGk() {
        return this.zzY20;
    }

    public final zzYEF zzYGl() {
        if (zzYGb()) {
            return this.zzZsP;
        }
        if (this.zzY1Z == null) {
            zzYEF zzyef = (zzYEF) this.zzZsP.zzbn();
            this.zzY1Z = zzyef;
            zzyef.setName("Cambria Math");
        }
        return this.zzY1Z;
    }

    public final int zzYGm() {
        return this.zzZsP.getSize();
    }

    public final com.aspose.words.internal.zzG zzYGn() {
        return this.zzY23;
    }

    public final float zzYGo() {
        return this.zzY24;
    }

    public final float zzYGq() throws Exception {
        if (Float.isNaN(this.zzY26)) {
            this.zzY26 = this.zzG8.getHeight() / 2.0f;
        }
        return this.zzY26;
    }

    public final zzZ13 zzYGr() {
        return this.zzY1X;
    }

    public boolean zzYGs() {
        return true;
    }

    public com.aspose.words.internal.zzZQ4 zzYGt() throws Exception {
        return this.zzG8;
    }

    public boolean zzYGu() {
        for (OfficeMath officeMath = this.zzY20; officeMath != null; officeMath = (OfficeMath) com.aspose.words.internal.zzZKW.zzZ(officeMath.getParentNode(), OfficeMath.class)) {
            if (officeMath.zzYGb() || zzK(officeMath.zzZYh())) {
                return false;
            }
        }
        return !zzK(this.zzZsP);
    }

    public String zzYGv() {
        if (zzYGu()) {
            return "Cambria Math";
        }
        Theme themeZzZqI = this.zzY21.zzYGE() == null ? null : this.zzY21.zzYGE().zzZqI();
        if (!this.zzZsP.zzYdP().zzZYI() && zzZz()) {
            return this.zzZsP.zzYdP().getName();
        }
        int iZzZ7n = this.zzZsP.zzVE(400) ? this.zzZsP.zzZ7n() : 3;
        return iZzZ7n != 1 ? iZzZ7n != 2 ? iZzZ7n != 3 ? zzU1.zzZ(this.zzZsP.zzYdQ(), themeZzZqI) : zzU1.zzZ(this.zzZsP.zzYdS(), themeZzZqI) : zzU1.zzZ(this.zzZsP.zzYdP(), themeZzZqI) : zzU1.zzZ(this.zzZsP.zzYdR(), themeZzZqI);
    }

    public void zzYHg() throws Exception {
        zzZ10.zzV(this, this.zzY1W);
        layoutChildren();
        for (zzZ13 zzz13 : this.zzZc) {
            com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
            zzg.zzX((com.aspose.words.internal.zzZL) zzz13.zzY23);
            this.zzY23.zzX((com.aspose.words.internal.zzZL) zzg);
            float fZzYGq = zzYGq() - zzz13.zzYGq();
            if (zzg.zzZO() == null) {
                com.aspose.words.internal.OooO0O0.OooO00o(zzg);
            }
            zzg.zzZO().zzY(this.zzY22, fZzYGq, 1);
            if (Float.isNaN(this.zzY24)) {
                if (zzz13.zzYGp()) {
                    this.zzY24 = this.zzY22;
                } else if (!Float.isNaN(zzz13.zzY24)) {
                    this.zzY24 = this.zzY22 + zzz13.zzY24;
                }
            }
            this.zzY22 = zzz13.zzG8.getWidth() + this.zzY22;
        }
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(this.zzG8.getX(), this.zzG8.getY(), this.zzY22, this.zzG8.getHeight());
        this.zzG8 = zzzq4;
        if (!zzzq4.isEmpty() || this.zzY1Y) {
            return;
        }
        long jZz6 = zzZr().zz6(com.aspose.words.internal.zzZVS.zzS7(zzZr().zzPl().zzpP().zzoT().zzZD()));
        this.zzG8 = new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, Float.intBitsToFloat((int) jZz6), com.aspose.words.internal.zzZPW.zzYz(jZz6));
    }

    public final void zzYn(float f) {
        this.zzY1W = f;
    }

    public final void zzYo(float f) {
        this.zzY24 = f;
    }

    public final void zzYp(float f) throws Exception {
        this.zzY26 = f;
    }

    public final float zzYq(float f) {
        return ((float) com.aspose.words.internal.zzZKQ.zzZa(f * r0)) / this.zzZsP.getSize();
    }

    public void zzZ(zzZ13 zzz13) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZc, zzz13);
        zzz13.zzY1X = this;
        zzz13.zzTL = this.zzZc.size() - 1;
    }

    public final void zzZE4() throws Exception {
        if (this.zzY25) {
            zzYHg();
            zzYGD();
            zzYGC();
            zzYGz();
            zzYGB();
            this.zzY25 = false;
        }
    }

    public final zzYEF zzZYh() {
        return this.zzZsP;
    }

    public final com.aspose.words.internal.zzZQ4 zzZj() {
        return this.zzG8;
    }

    public final com.aspose.words.internal.zzPM zzZr() throws Exception {
        com.aspose.words.internal.zzPM zzpm = this.zzYX;
        if (zzpm == null || !com.aspose.words.internal.zzZKN.equals(zzpm.zzPh(), getFontName())) {
            this.zzYX = this.zzY21.zztv().zzY(getFontName(), getFontSize(), zzza());
        }
        return this.zzYX;
    }

    public final com.aspose.words.internal.zzPV zzZy() {
        return com.aspose.words.internal.zzPV.zzZ(this.zzZsP.zzZy(), com.aspose.words.internal.zzPV.zzHZ) ? com.aspose.words.internal.zzPV.zzKa : this.zzZsP.zzZy();
    }

    public final boolean zzZz() {
        return this.zzZsP.zzYdM().toBool();
    }

    public final OfficeMath zzc(int... iArr) {
        OfficeMath officeMath = this.zzY20;
        if (officeMath != null) {
            return zzZ(officeMath, iArr);
        }
        zzZ13 zzz13 = this.zzY1X;
        if (zzz13 != null) {
            return zzZ11.zzU(zzz13.zzY20.zzZsL().getMathObjectType(), iArr) ? this.zzY1X.zzY20 : zzZ(this.zzY1X.zzY20, iArr);
        }
        return null;
    }

    public final boolean zzd(int... iArr) {
        return zzc(iArr) != null;
    }

    public final boolean zze(int... iArr) {
        OfficeMath officeMathZzc = zzc(iArr);
        return officeMathZzc == null || zzZ(officeMathZzc, iArr) == null;
    }

    public final com.aspose.words.internal.zzH3 zztv() {
        return this.zzY21.zztv();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int zzza() {
        if ("Cambria Math".equals(getFontName())) {
            return 0;
        }
        boolean bool = this.zzZsP.zzYe1().toBool();
        ?? r0 = bool;
        if (this.zzZsP.zzYe0().toBool()) {
            r0 = (bool ? 1 : 0) | 2;
        }
        return this.zzZsP.getUnderline() != 0 ? r0 | 4 : r0;
    }

    public zzZ13(zzZ14 zzz14, OfficeMath officeMath, byte b) {
        this(zzz14, officeMath, zzZ7R.zzZ(officeMath, 1), false);
    }

    public zzZ13(zzZ14 zzz14, zzYEF zzyef) {
        this(zzz14, null, zzyef, true);
    }

    public zzZ13(zzZ14 zzz14, OfficeMath officeMath, zzYEF zzyef, boolean z) {
        this.zzY27 = -1.0f;
        this.zzY26 = Float.NaN;
        this.zzY25 = true;
        this.zzY24 = Float.NaN;
        this.zzZc = new ArrayList<>();
        this.zzY1Y = true;
        this.zzY1W = Float.NaN;
        this.zzY1V = Float.NaN;
        this.zzG8 = com.aspose.words.internal.zzZQ4.zz2T;
        this.zzG8 = new com.aspose.words.internal.zzZQ4();
        this.zzY23 = new com.aspose.words.internal.zzG();
        this.zzY21 = zzz14;
        this.zzY20 = officeMath;
        this.zzZsP = zzyef;
        this.zzY1Y = z;
        this.zzTL = -1;
    }

    private static OfficeMath zzZ(OfficeMath officeMath, int... iArr) {
        while (officeMath.getParentNode() != null && officeMath.getParentNode().getNodeType() == 35) {
            officeMath = (OfficeMath) officeMath.getParentNode();
            if (zzZ11.zzU(officeMath.zzZsL().getMathObjectType(), iArr)) {
                return officeMath;
            }
        }
        return null;
    }

    private static void zzZ(com.aspose.words.internal.zzZQ4 zzzq4, zzZ0E zzz0e, com.aspose.words.internal.zzZG zzzg) {
        zzZ(com.aspose.words.internal.zzZPY.zzG(zzzq4.getX(), zzzq4.getY()), com.aspose.words.internal.zzZPY.zzG(zzzq4.getX(), zzzq4.zzZn()), zzz0e.zzYEX(), zzzg);
        zzZ(com.aspose.words.internal.zzZPY.zzG(zzzq4.getX(), zzzq4.getY()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.getY()), zzz0e.zzYEY(), zzzg);
        zzZ(com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.getY()), com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()), zzz0e.zzYEW(), zzzg);
        zzZ(com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()), com.aspose.words.internal.zzZPY.zzG(zzzq4.getX(), zzzq4.zzZn()), zzz0e.zzYEZ(), zzzg);
    }

    private static void zzZ(long j, long j2, boolean z, com.aspose.words.internal.zzZG zzzg) {
        if (z) {
            return;
        }
        com.aspose.words.internal.OooO00o.OooO00o(zzzg, com.aspose.words.internal.zzP5.zzS(j, j2));
    }
}
