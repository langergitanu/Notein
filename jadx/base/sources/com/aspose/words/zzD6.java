package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzD6 {
    private zzDP zzZa2;
    private zzEM zzZa3;
    private ShapeBase zzZa4;
    private zz30 zzZa5;
    private zzDI zzZyQ;
    private zzD8 zzZz1;
    private float zzjo;
    private float zzjp;
    private float zzvA;
    private float zzvB;
    float zzZa6 = com.aspose.words.internal.zzSA.zzp(1.5d);
    private ArrayList<zz0A> zzZa1 = new ArrayList<>();
    private zzD7 zzZa0 = new zzD7(this);

    private zzD6(ShapeBase shapeBase, zzDI zzdi) {
        this.zzZa4 = shapeBase;
        this.zzZz1 = (zzD8) com.aspose.words.internal.zzZKW.zzZ(shapeBase.zzY9i(), zzD8.class);
        this.zzZyQ = zzdi;
    }

    private static void zzP(Document document) {
        document.getStyles().zzY37().zznc(131075);
        document.getCompatibilityOptions().setUseFELayout(true);
    }

    private static void zzQ(Document document) {
        document.getStyles().zzY37().zznc(131076);
        document.getCompatibilityOptions().setUseFELayout(false);
    }

    private static boolean zzR(Document document) {
        return document.getCompatibilityOptions().getUseFELayout() && document.getStyles().zzY37().zzYdR().zzZYI() && document.getStyles().zzY37().zzYdT() == 131075;
    }

    private void zzS(ShapeBase shapeBase) throws Exception {
        zzZ(((zz6Z) shapeBase.zzY9i()).zzZAk());
        for (ShapeBase shapeBase2 : shapeBase.getChildNodes(0, false)) {
            if (shapeBase2.zzY9i() instanceof zz6Z) {
                zzS(shapeBase2);
            }
            if (shapeBase2.zzY9i() instanceof zz2O) {
                zzZ(((zz2O) shapeBase2.zzY9i()).zzZAk());
            }
        }
    }

    private void zzT(ShapeBase shapeBase) throws Exception {
        if (shapeBase == null) {
            return;
        }
        zz2O zz2o = (zz2O) com.aspose.words.internal.zzZKW.zzZ(shapeBase.zzY9i(), zz2O.class);
        if (zz2o != null) {
            zzZ(zz2o.zzZAk());
        } else if (((zz6Z) com.aspose.words.internal.zzZKW.zzZ(shapeBase.zzY9i(), zz6Z.class)) != null) {
            zzS(shapeBase);
        }
    }

    private long zzU(ShapeBase shapeBase) {
        if (shapeBase.zzY9l() == 0) {
            return shapeBase.zzY9j();
        }
        return com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) * Float.intBitsToFloat((int) shapeBase.zzY9j()), com.aspose.words.internal.zzZPW.zzYz(this.zzZyQ.zzZIz()) * com.aspose.words.internal.zzZPY.zzYC(shapeBase.zzY9j()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayList<ChartAxis> zzXB(boolean z) {
        ArrayList<ChartAxis> arrayList = new ArrayList<>();
        for (zzGK zzgk : zz45().zzZJf()) {
            if (zzgk.zzZPc()) {
                zzZCR zzzcr = (zzZCR) zzgk;
                zzZ(arrayList, zzzcr.zzZPt(), z);
                zzZ(arrayList, zzzcr.zzZPs(), z);
            }
        }
        return arrayList;
    }

    public static com.aspose.words.internal.zzZL zzZ(ShapeBase shapeBase, zzDI zzdi) throws Exception {
        zzD6 zzd6 = new zzD6(shapeBase, zzdi);
        Document documentZzZpS = zzdi.zzZIB().getDocument().zzZpS();
        boolean zZzR = zzR(documentZzZpS);
        if (zZzR) {
            try {
                zzQ(documentZzZpS);
            } catch (Throwable th) {
                if (zZzR) {
                    zzP(documentZzZpS);
                }
                throw th;
            }
        }
        zzd6.zzZNw();
        if (zZzR) {
            zzP(documentZzZpS);
        }
        zzdi.zzsD().zzQ(true);
        return zzdi.zzsD();
    }

    private com.aspose.words.internal.zzZG zzZC(com.aspose.words.internal.zzZQ4 zzzq4) {
        if (!this.zzZz1.zzZHP()) {
            return com.aspose.words.internal.zzZG.zzW(zzzq4);
        }
        float fMin = Math.min(Math.min(254000.0f, zzzq4.getHeight()), zzzq4.getWidth());
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5);
        com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5(new com.aspose.words.internal.zzZQ4(zzzq4.zzZm(), zzzq4.zzZo(), fMin, fMin), 180.0d, 90.0d);
        com.aspose.words.internal.zzQ5 zzq52 = new com.aspose.words.internal.zzQ5(new com.aspose.words.internal.zzZQ4(zzzq4.zzkw() - fMin, zzzq4.zzZo(), fMin, fMin), 270.0d, 90.0d);
        com.aspose.words.internal.zzQ5 zzq53 = new com.aspose.words.internal.zzQ5(new com.aspose.words.internal.zzZQ4(zzzq4.zzkw() - fMin, zzzq4.zzZn() - fMin, fMin, fMin), 0.0d, 90.0d);
        com.aspose.words.internal.zzQ5 zzq54 = new com.aspose.words.internal.zzQ5(new com.aspose.words.internal.zzZQ4(zzzq4.zzZm(), zzzq4.zzZn() - fMin, fMin, fMin), 90.0d, 90.0d);
        zzp5.zzZ(zzq5);
        zzp5.zzZ(zzq52);
        zzp5.zzZ(zzq53);
        zzp5.zzZ(zzq54);
        zzp5.zze(true);
        return zzzg;
    }

    private com.aspose.words.internal.zzZQ4 zzZD(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        float f = 0.0f;
        float fZz3N = 0.0f;
        for (ChartAxis chartAxis : zz45().zz3G()) {
            if (!chartAxis.zz40() && !chartAxis.getHidden()) {
                if (chartAxis.zz3U() == 3 && !chartAxis.zz3W()) {
                    float fZz3N2 = chartAxis.zz3N() + chartAxis.zzZr().getAscentPoints();
                    f += fZz3N2;
                    fZz3N += fZz3N2;
                } else if (chartAxis.zz3U() == 0 && chartAxis.zz3W()) {
                    fZz3N = chartAxis.zz3N() + chartAxis.zz3P() + fZz3N;
                }
            }
        }
        float x = zzzq4.getX() - this.zzZa6;
        float width = (this.zzZa6 * 2.0f) + zzzq4.getWidth();
        float y = this.zzZa2.zz44().getY() - f;
        float height = this.zzZa2.zz44().getHeight() + fZz3N + this.zzZa6;
        if (height < zzzq4.getHeight()) {
            y = zzzq4.getY();
            height = this.zzZa6 + zzzq4.getHeight();
        }
        return new com.aspose.words.internal.zzZQ4(x, y, width, height);
    }

    private void zzZHA() throws Exception {
        ArrayList<ChartAxis> arrayList = new ArrayList();
        com.aspose.words.internal.zzZQG.zzZ(arrayList, (Iterable) zzXB(true));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, (Iterable) zzXB(false));
        for (ChartAxis chartAxis : arrayList) {
            zzZ(chartAxis, false);
            zzZ(chartAxis, true);
        }
    }

    private void zzZHB() throws Exception {
        zz50 zz50Var = new zz50(this.zzZyQ.zzZIB());
        for (ShapeBase shapeBase : this.zzZa4.getChildNodes(0, false)) {
            long jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) * Float.intBitsToFloat((int) shapeBase.zzY9k()), com.aspose.words.internal.zzZPW.zzYz(this.zzZyQ.zzZIz()) * com.aspose.words.internal.zzZPY.zzYC(shapeBase.zzY9k()));
            long jZzU = zzU(shapeBase);
            zz07 zz07VarZzZTh = shapeBase.zzY9i().zzZTh();
            boolean zZzYd = zzDG.zzYd(zz07VarZzZTh.zzZCC().zzZQQ());
            float height = (float) (zZzYd ? zz07VarZzZTh.getHeight() : zz07VarZzZTh.getWidth());
            float width = (float) (zZzYd ? zz07VarZzZTh.getWidth() : zz07VarZzZTh.getHeight());
            float fAbs = Math.abs(Float.intBitsToFloat((int) jZzU) - Float.intBitsToFloat((int) jZzG));
            float fAbs2 = Math.abs(com.aspose.words.internal.zzZPY.zzYC(jZzU) - com.aspose.words.internal.zzZPY.zzYC(jZzG));
            if (!com.aspose.words.internal.zzAN.zzf(fAbs) || !com.aspose.words.internal.zzAN.zzf(fAbs2)) {
                double d = com.aspose.words.internal.zzAN.zzf(height) ? 1.0d : fAbs / height;
                double d2 = com.aspose.words.internal.zzAN.zzf(width) ? 1.0d : fAbs2 / width;
                zz07 zz07VarZzZAi = zz07VarZzZTh.zzZAi();
                zz07VarZzZTh.setWidth(zz07VarZzZTh.getWidth() * d);
                zz07VarZzZTh.setHeight(zz07VarZzZTh.getHeight() * d2);
                zzZ(zz07VarZzZTh, jZzG, zZzYd);
                zzT(shapeBase);
                this.zzZyQ.zzsD().zzX(zz4Z.zzN(shapeBase).zzZ(zz50Var));
                shapeBase.zzY9i().zzZ(zz07VarZzZAi);
            }
        }
    }

    private void zzZHC() throws Exception {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzZ(com.aspose.words.internal.zzP8.zzM(zzZHx()));
        this.zzZyQ.zzA(zzg);
        this.zzZa0.zzZHF();
        zzZ(this.zzZz1.zzZHX());
        this.zzZa3 = zzZHz();
        zzZHA();
        this.zzZa2 = new zzDP(this.zzZz1.zzZHX(), this.zzZyQ, zzZHx());
    }

    private void zzZHD() {
        Iterator<zzGK> it = zz45().zzZJe().iterator();
        while (it.hasNext()) {
            it.next().zzZPn();
        }
    }

    private void zzZHE() throws Exception {
        if (this.zzZz1.zzZHX().zz45().zzZJb()) {
            this.zzZa3 = new zzEM(this.zzZz1, this.zzZyQ, this.zzZa3.zzZLA());
        }
    }

    private zz30 zzZHw() throws Exception {
        if (this.zzZa5 == null) {
            zz30 zz30Var = new zz30();
            this.zzZa5 = zz30Var;
            zz30Var.zzZ(new zz7P());
            this.zzZa5.zzZvQ().zzOH(this.zzZyQ.zzZIB().getThemeProvider().getFontName(131073));
            if (!com.aspose.words.internal.zzZYD.zzXk(this.zzZa5.zzZvQ().zzZAY())) {
                this.zzZa5.zzZvQ().zzOH("Calibri");
            }
            this.zzZa5.setFill(new zz1C(this.zzZyQ.zzZIB().getThemeProvider().getThemeColor(12)));
        }
        return this.zzZa5;
    }

    private com.aspose.words.internal.zzZQ4 zzZHx() {
        return new com.aspose.words.internal.zzZQ4(this.zzvB, this.zzvA, zzZKC(), zzZKB());
    }

    private void zzZHy() throws Exception {
        com.aspose.words.internal.zzZG zzzgZzZC = zzZC(zzZHx());
        zzDG.zzZ(zzzgZzZC, this.zzZz1.zzaQ(), (zzE3) null, this.zzZyQ.zzZIC().zzZMO(), 0);
        this.zzZyQ.zzsD().zzX(zzzgZzZC);
    }

    private zzEM zzZHz() throws Exception {
        zzEH zzeh = null;
        if (this.zzZz1.zzZHX().getLegend() != null && this.zzZz1.zzZHX().getLegend().zz3y() != null) {
            zzEH zzehZz3y = this.zzZz1.zzZHX().getLegend().zz3y();
            this.zzZz1.zzZHX().getLegend().zzZ((zzEH) null);
            zzeh = zzehZz3y;
        }
        zzEM zzem = new zzEM(this.zzZz1, this.zzZyQ, zzZHx());
        this.zzZa0.zzZ(zzem);
        if (zzeh == null) {
            return zzem;
        }
        this.zzZz1.zzZHX().getLegend().zzZ(zzeh);
        return new zzEM(this.zzZz1, this.zzZyQ, zzZHx());
    }

    private float zzZKB() {
        return Math.max(com.aspose.words.internal.zzZPW.zzYz(this.zzZyQ.zzZIz()) - (this.zzvA + this.zzjp), 0.0f);
    }

    private float zzZKC() {
        return Math.max(Float.intBitsToFloat((int) this.zzZyQ.zzZIz()) - (this.zzvB + this.zzjo), 0.0f);
    }

    private void zzZNw() throws Exception {
        zzZHD();
        zzZHy();
        zzZHC();
        com.aspose.words.internal.zzG zzgZzYs = this.zzZa2.zzYs();
        zzZHE();
        this.zzZa3.zzZNw();
        zzz(zzgZzYs);
        zzZHB();
        this.zzZyQ.zzZI();
    }

    private void zzz(com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4Zz44 = zz45().zzZQD() ? this.zzZa2.zz44() : this.zzZa2.zzZIX();
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) zzg);
        if (!zz45().zzZQD()) {
            zzzq4ZzZ = zzZHx();
        } else if (zz45().zzZPc()) {
            zzzq4ZzZ = zzZD(zzzq4ZzZ);
        }
        Iterator<zz0A> it = this.zzZa1.iterator();
        while (it.hasNext()) {
            it.next().zzE(zzzq4ZzZ, zzzq4Zz44);
        }
    }

    public final zzDI zz43() {
        return this.zzZyQ;
    }

    public final zzDT zz45() {
        return this.zzZz1.zzZHX().zz45();
    }

    public final void zzYY(float f) {
        this.zzjp = f;
    }

    public final void zzYZ(float f) {
        this.zzjo = f;
    }

    public final void zzZ0(float f) {
        this.zzvB = f;
    }

    public final void zzZ1(float f) {
        this.zzvA = f;
    }

    public final float zzZm() {
        return this.zzvB;
    }

    public final float zzZn() {
        return this.zzjp;
    }

    public final float zzZo() {
        return this.zzvA;
    }

    public final float zzkw() {
        return this.zzjo;
    }

    private static void zzZ(zz07 zz07Var, long j, boolean z) {
        float fIntBitsToFloat;
        float fZzQb;
        com.aspose.words.internal.zzZQ4 zzzq4ZzY = com.aspose.words.internal.zzJ6.zzY(zz07Var.zzZv(), (float) zz07Var.zzZCC().zzZQQ());
        if (z) {
            fIntBitsToFloat = Float.intBitsToFloat((int) j);
            fZzQb = zzzq4ZzY.getX();
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) j);
            fZzQb = (float) zz07Var.zzQb();
        }
        zz07Var.offset(fIntBitsToFloat - fZzQb, com.aspose.words.internal.zzZPY.zzYC(j) - (z ? zzzq4ZzY.getY() : (float) zz07Var.zzYm()));
    }

    private void zzZ(zz0J zz0j) throws Exception {
        if (zz0j == null) {
            return;
        }
        Iterator<zz4A> it = zz0j.zzZCZ().zzMi().iterator();
        while (it.hasNext()) {
            it.next().zzZxp().zzZHc().zzU(zzZHw());
        }
    }

    private void zzZ(zzZCO zzzco) throws Exception {
        if (zzzco.isVisible()) {
            this.zzZa0.zzZHG();
            zzCS zzcs = new zzCS(zzzco, this.zzZyQ, zzZHx());
            this.zzZa0.zzZ(zzcs, false);
            this.zzZa0.zzZ(zzcs);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzCS>) this.zzZa1, zzcs);
        }
    }

    private void zzZ(ChartAxis chartAxis, boolean z) throws Exception {
        zz0A zzhb;
        AxisDisplayUnit displayUnit = z ? chartAxis.getDisplayUnit() : chartAxis;
        boolean z2 = z && chartAxis.getDisplayUnit().zzb1();
        if (displayUnit.isVisible()) {
            if (!zz45().zzZQD()) {
                this.zzZa0.zzc(displayUnit.getTitlePosition(), z2);
            }
            if (z) {
                zzhb = new zzHD(chartAxis.getDisplayUnit(), this.zzZyQ, zzZHx());
            } else {
                zzhb = new zzHB(chartAxis, this.zzZyQ, zzZHx());
            }
            this.zzZa0.zzZ(zzhb, z2);
            com.aspose.words.internal.zzZQG.zzZ(this.zzZa1, zzhb);
        }
    }

    private static void zzZ(ArrayList<ChartAxis> arrayList, ChartAxis chartAxis, boolean z) {
        if (chartAxis.zz40() != z || arrayList.contains(chartAxis)) {
            return;
        }
        if (chartAxis.getHidden()) {
            arrayList.add(0, chartAxis);
        } else {
            arrayList.add(chartAxis);
        }
    }
}
