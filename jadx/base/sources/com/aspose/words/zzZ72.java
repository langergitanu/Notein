package com.aspose.words;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ72 extends zzZ61 {
    private HashMap<String, com.aspose.words.internal.zzG> zzYgB;
    private com.aspose.words.internal.zzZQC<com.aspose.words.internal.zzZQ4> zzYgC;
    private boolean zzYgD;
    private boolean zzYgE;
    private zzYDQ zzYgF;
    private zzZAI zzYgG;
    private zzZD0 zzYgH;
    private com.aspose.words.internal.zzZQC<zzXX> zzYgI;
    private zzXX zzYgJ;
    private zzXX zzYgK;
    private zzZ71 zzZFF;
    private zzZ5G zzZFG;

    public zzZ72() {
        this(new zzYTZ(), false, false);
    }

    private void zzD(Iterable<zzY3C> iterable) {
        for (zzY3C zzy3c : iterable) {
            this.zzZFF.zzS(zzu(zzy3c.zz1y(), zzy3c.zzZS6()));
        }
    }

    private void zzT(zzZ6P zzz6p) throws Exception {
        if (zzz6p.zzYSD()) {
            this.zzZFF.zzL(this.zzYgG.zzZ2g());
            String str = com.aspose.words.internal.zzZKN.format("B{0}x{1}", Integer.valueOf(((zzYN8) zzz6p.zzYgm).getWidth()), Integer.valueOf(((zzYN8) zzz6p.zzYgm).getHeight()));
            com.aspose.words.internal.zzG zzgZzZ = (com.aspose.words.internal.zzG) com.aspose.words.internal.zzQW.zzZ(this.zzYgB, str, (Object) null);
            if (zzgZzZ == null) {
                zzgZzZ = zzYT.zzZ(zzz6p);
                this.zzYgB.put(str, zzgZzZ);
            }
            com.aspose.words.internal.zzZS zzzs = new com.aspose.words.internal.zzZS(WarningType.HINT);
            zzzs.setTag(str);
            zzzs.zzX(zzgZzZ.zzZJ());
            this.zzZFF.zzS(zzzs);
            this.zzZFF.zzZI();
        }
    }

    private void zzU(zzZ6N zzz6n) throws Exception {
        if (zzz6n.zzYSu()) {
            this.zzYgK.zz8z();
            this.zzYgK.zzZ(zzz6n.zzYSl(), zzz6n.zz8p(), zzz6n.zz8o(), zzz6n.zz8n(), zzz6n.zz8m());
            if (zzz6n.zzYSt()) {
                return;
            }
        }
        this.zzYgK.zzZ(this.zzZFF);
    }

    private void zzW(zzZ6P zzz6p) throws Exception {
        zzZYW zzzywZzab = zzz6p.zzYgm.zzab();
        if (zzzywZzab.zzZoQ()) {
            throw new IllegalStateException("Page rendering has already started");
        }
        try {
            boolean z = true;
            zzz6p.zzYgm.zzab().zzWx(true);
            zzYS.zzZ(zzz6p.zzYgm, 10);
            Shape backgroundShape = zzz6p.zzYfy.getBackgroundShape();
            if (backgroundShape == null || !backgroundShape.getFilled()) {
                z = false;
            }
            if (z) {
                this.zzZFF.zzU(backgroundShape.zzY9J().zzX(null));
            }
            this.zzZFG = new zzZ5G(this.zzZFF, this.zzYgG, zzz6p.zzYfy.zzZqy(), this.zzYgE);
            this.zzYgK = new zzXX(2);
            this.zzYgJ = new zzXX(3);
            zzYMD.zzs(zzz6p.zzYgm);
            zzz6p.zzZ(this);
            com.aspose.words.internal.zz7 zz7VarZzYTS = zzz6p.zzYSG() ? (com.aspose.words.internal.zz7) com.aspose.words.internal.zzZKW.zzZ(this.zzZFF.zzYTS().zzN(0), com.aspose.words.internal.zz7.class) : this.zzZFF.zzYTS();
            zzYMD zzymd = zzz6p.zzYgm;
            zzF.zzZ(zz7VarZzYTS, (zzYN8) zzymd, zzymd.zza7().zzYMw());
            zz7.zzP(zz7VarZzYTS);
            zzYTZ();
            if (z) {
                this.zzZFF.zzZ7c();
            }
            zzYS.zzZ(zzz6p.zzYgm, 11);
            zzzywZzab.zzWx(false);
        } catch (Throwable th) {
            zzzywZzab.zzWx(false);
            throw th;
        }
    }

    private void zzX(zzZ6Z zzz6z) throws Exception {
        if (zzz6z.zzYTF() != Integer.MIN_VALUE) {
            ArrayList<zzYCP> arrayList = new ArrayList<>();
            zzZNL zzznlZzYF = ((zzYN8) ((zzUZ) zzz6z.zzYgm).zzZZJ()).zzYF(false);
            if (zzznlZzYF != null) {
                for (zzZNO zzzno : zzznlZzYF) {
                    if (zzzno.zzZ99() == 21595 || zzzno.zzZ99() == 21537) {
                        com.aspose.words.internal.zzZQ5 zzzq5ZzO = zzz6z.zzO(zzzno);
                        if (zzz6z.zzYTF() > zzzq5ZzO.getX() && zzz6z.zzYTF() < zzzq5ZzO.getRight()) {
                            com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzYCP(zzzq5ZzO.getY(), zzzq5ZzO.getBottom()));
                        }
                    }
                }
            }
            ArrayList<zzYCP> arrayListZzZ1 = new zzYCP(zzz6z.zzYTD(), zzz6z.zzYTD() + zzz6z.zzYTE()).zzZ1(arrayList);
            float fZzYTF = zzz6z.zzYTF() / 1000.0f;
            for (zzYCP zzycp : arrayListZzZ1) {
                com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(com.aspose.words.internal.zzZPY.zzG(fZzYTF, zzycp.getStart() / 1000.0f), com.aspose.words.internal.zzZPY.zzG(fZzYTF, zzycp.getEnd() / 1000.0f));
                zzzgZzZ.zzX(new com.aspose.words.internal.zzOU(com.aspose.words.internal.zzPV.zzKa));
                this.zzZFF.zzS(zzzgZzZ);
            }
        }
    }

    private void zzY(zzZ6O zzz6o) throws Exception {
        if (zzz6o == null) {
            return;
        }
        this.zzYgJ.zz8z();
        this.zzYgJ.zzZ(zzz6o.zzYSx(), zzz6o.zz8p(), zzz6o.zz8o(), zzz6o.zz8n(), zzz6o.zz8m());
        if (this.zzYgJ.zz8u()) {
            this.zzZFF.zzL(this.zzYgG.zzZ2g());
            this.zzYgJ.zzZ(this.zzZFF);
            this.zzZFF.zzZI();
        }
    }

    private zzXX zzYTW() {
        return this.zzYgI.peek();
    }

    private void zzYTZ() throws Exception {
        int colorMode = this.zzZFF.zzYTR().zzYTe().getColorMode();
        if (colorMode != 0) {
            if (colorMode != 1) {
                throw new IllegalArgumentException();
            }
            com.aspose.words.internal.zz3.zzZ(this.zzZFF.zzYTS(), new com.aspose.words.internal.zzZY());
        }
    }

    private void zzZ(zzZ6P zzz6p, float f, float f2) throws Exception {
        if (zzz6p == null) {
            return;
        }
        this.zzZFF.zzP(com.aspose.words.internal.zzZPY.zzG(f, f2), false);
        zzW(zzz6p);
        this.zzZFF.zzZI();
    }

    private void zzZv(ArrayList<zzZ6Q> arrayList) {
        if (arrayList == null) {
            return;
        }
        for (zzZ6Q zzz6q : arrayList) {
            if (zzz6q != null && com.aspose.words.internal.zzZYD.zzXk(com.aspose.words.internal.zzZKN.zzTX(zzz6q.getTitle()))) {
                this.zzZFF.zzS(new com.aspose.words.internal.zzZI(this.zzZFF.zzXB(0L), zzz6q.getLevel(), zzz6q.getTitle()));
            }
        }
    }

    public static com.aspose.words.internal.zzZG zzu(long j, long j2) {
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(j, j2);
        zzzgZzZ.zzX(new com.aspose.words.internal.zzOU(com.aspose.words.internal.zzPV.zzKa));
        return zzzgZzZ;
    }

    private void zzy1(int i) {
        if (this.zzYgH != null) {
            return;
        }
        this.zzYgH = (this.zzYgD && i == 2) ? new zzUV(this) : new zzUU(this);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzV(zzZ6P zzz6p) throws Exception {
        zzZ6O zzz6oZzYSK;
        if (zzz6p.zzYSG()) {
            this.zzZFF.zzP(com.aspose.words.internal.zzZPY.zzG(0.0f, 0.0f), false);
        }
        zzT(zzz6p);
        if (zzz6p.zzYSG()) {
            this.zzYgH.zzZ(zzz6p, this.zzZFF);
        }
        if (((zzUZ) ((zzYN8) zzz6p.zzYgm).zz6x()) == null || (zzz6oZzYSK = zzz6p.zzYSK()) == null || zzz6oZzYSK.zzYSw()) {
            return;
        }
        zzY(zzz6oZzYSK);
    }

    @Override // com.aspose.words.zzZ61
    public final boolean zzYTT() {
        return this.zzYgE;
    }

    public final zzZAI zzYTU() {
        return this.zzYgG;
    }

    public final zzZ71 zzYTV() {
        return this.zzZFF;
    }

    @Override // com.aspose.words.zzZ61
    public final void zzYTX() {
        this.zzZFF.zzZI();
    }

    @Override // com.aspose.words.zzZ61
    public final void zzYTY() {
        this.zzZFF.zzZI();
    }

    @Override // com.aspose.words.zzZ61
    public final void zzy2(int i) {
        this.zzZFF.zzy0(i);
    }

    public zzZ72(zzZAI zzzai, boolean z, boolean z2) {
        this.zzYgI = new com.aspose.words.internal.zzZQC<>();
        this.zzYgC = new com.aspose.words.internal.zzZQC<>();
        this.zzYgB = new HashMap<>();
        this.zzYgF = new zzYDQ(this, zzzai);
        this.zzYgG = zzzai;
        this.zzYgE = z;
        this.zzYgD = z2;
    }

    @Override // com.aspose.words.zzZ61
    public final void zzZ(zzZ6Y zzz6y) throws Exception {
        this.zzZFF.zzP(zzz6y.zzZT(), false);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzZ(zzZ6Z zzz6z) throws Exception {
        this.zzZFF.zzP(zzz6z.zzZT(), false);
    }

    public static void zzZ(zzXX zzxx, zzWT zzwt) throws Exception {
        zzZ(zzxx, zzwt, zzZ70.zzJ(zzwt));
    }

    @Override // com.aspose.words.zzZ61
    public final void zzZ(zzZ6U zzz6u) throws Exception {
        zzYS.zzZ(zzz6u.zzYgm, 10);
        this.zzZFG.zzX(zzz6u);
        this.zzYgF.zzW(zzz6u);
    }

    private void zzV(zzZ70 zzz70) throws Exception {
        if (zzz70.zzYTO() != 3) {
            return;
        }
        new zzZ70(zzWK.zzO((zzWT) zzz70.zzYgm), (zzWT) zzz70.zzYgm).zzZ(this);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzU(zzZ6P zzz6p) throws Exception {
        zzZ6O zzz6oZzYSK;
        if (((zzUZ) ((zzYN8) zzz6p.zzYgm).zz6x()) != null && (zzz6oZzYSK = zzz6p.zzYSK()) != null && zzz6oZzYSK.zzYSw()) {
            zzY(zzz6oZzYSK);
        }
        zzYJE.zzZ(zzz6p, this.zzZFF, this);
        if (zzz6p.zzYSG()) {
            this.zzYgH.zzY(zzz6p, this.zzZFF);
        }
        if (!this.zzZFF.zzYTR().zzYSV().isEmpty()) {
            this.zzZFF.zzU(new com.aspose.words.internal.zzZQ4(zzz6p.zzZm(), zzz6p.zzZo(), zzz6p.getWidth(), zzz6p.getHeight()), this.zzZFF.zzYTR().zzYSV());
        }
        if (zzz6p.zzYSG()) {
            ((com.aspose.words.internal.zzHR) com.aspose.words.internal.zzZKW.zzZ(this.zzZFF.zzYTS(), com.aspose.words.internal.zzHR.class)).zzW(zzz6p.zzNb());
            this.zzZFF.zzZI();
        }
    }

    @Override // com.aspose.words.zzZ61
    public final void zzY(zzZ6Z zzz6z) throws Exception {
        this.zzYgK.zzZ(this.zzZFF);
        this.zzZFF.zzZI();
        if (!this.zzZFF.zzYTR().zzYSU().isEmpty()) {
            this.zzZFF.zzU(new com.aspose.words.internal.zzZQ4(zzz6z.zzZm(), zzz6z.zzZo(), zzz6z.getWidth(), zzz6z.getHeight()), this.zzZFF.zzYTR().zzYSU());
        }
        zzX(zzz6z);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzZ(zzZ64 zzz64) {
        this.zzZFG.zzV(zzz64);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzZ(zzZ6F zzz6f) {
        this.zzZFG.zzV(zzz6f);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzZ(zzZ69 zzz69) throws Exception {
        this.zzZFG.zzY(zzz69);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzZ(zzZ65 zzz65) {
        this.zzZFG.zzV(zzz65);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzZ(zzZ6B zzz6b) throws Exception {
        this.zzZFG.zzY(zzz6b);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzV(zzZ6N zzz6n) throws Exception {
        this.zzYgG.zzZ2n();
        this.zzYgF.zzYR7();
        this.zzZFF.zzZI();
        zzD(zzz6n.zzYSk());
        this.zzYgG.zzZ2f();
        zzU(zzz6n);
        this.zzYgG.zzZ2e();
        this.zzZFF.zzZ7c();
        if (!this.zzZFF.zzYTR().zzYSX().isEmpty()) {
            this.zzZFF.zzU(zzz6n.zzYSx(), this.zzZFF.zzYTR().zzYSX());
        }
        this.zzZFF.zzZI();
        this.zzYgG.zzY(zzz6n);
        this.zzYgF.zzY(zzz6n);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzY(zzZ6V zzz6v) throws Exception {
        this.zzYgG.zzZ(zzz6v);
        this.zzZFF.zzP(zzz6v.zzZT(), false).zzZ(com.aspose.words.internal.zzP8.zzM(zzz6v.zzbL()));
    }

    @Override // com.aspose.words.zzZ61
    public final void zzZ(zzZ68 zzz68) throws Exception {
        this.zzZFG.zzX(zzz68);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzX(zzZ6V zzz6v) throws Exception {
        this.zzYgK.zzZ(this.zzZFF);
        this.zzZFF.zzZI();
        if (zzz6v.isHeader() && !this.zzZFF.zzYTR().zzYST().isEmpty()) {
            this.zzZFF.zzU(new com.aspose.words.internal.zzZQ4(zzz6v.zzZm(), zzz6v.zzZo(), zzz6v.getWidth(), zzz6v.getHeight()), this.zzZFF.zzYTR().zzYST());
        } else if (!zzz6v.isHeader() && !this.zzZFF.zzYTR().zzYSS().isEmpty()) {
            this.zzZFF.zzU(new com.aspose.words.internal.zzZQ4(zzz6v.zzZm(), zzz6v.zzZo(), zzz6v.getWidth(), zzz6v.getHeight()), this.zzZFF.zzYTR().zzYSS());
        }
        this.zzYgG.zzZ2o();
    }

    @Override // com.aspose.words.zzZ61
    public final void zzZ(zzZ6G zzz6g) throws Exception {
        if (zzz6g.zzZou()) {
            this.zzZFG.zzY(zzz6g);
        }
    }

    @Override // com.aspose.words.zzZ61
    public final void zzZ(zzZ6C zzz6c) throws Exception {
        this.zzZFG.zzY(zzz6c);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzY(zzZ6M zzz6m) {
        try {
            zzYIA zzyia = (zzYIA) zzz6m.zzYgm;
            if (zzyia.zzYjB()) {
                int iZzXYi = ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzXYi();
                float f = iZzXYi / 1000.0f;
                this.zzZFF.zzP(com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) zzz6m.zzZT()), com.aspose.words.internal.zzZPY.zzYC(zzz6m.zzZT()) - f), false).zzZ(com.aspose.words.internal.zzP8.zzM(com.aspose.words.internal.zzSA.zzY(zz5.zzZ(((zzYIC) ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzZXZ()).zz6x(), iZzXYi))));
                for (zzYIC zzyic = (zzYIC) ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzZXZ(); zzyic != null && zzyic.zzBz(); zzyic = (zzYIC) zzyic.zzYTp()) {
                    new zzZ6M(zzyic.zz6x(), (byte) 0).zzZ(this);
                }
                zzYTW().zzZH(-f);
                this.zzZFF.zzZI();
            }
            this.zzYgF.zzZ(zzz6m);
            this.zzYgG.zzZ(zzz6m);
            this.zzZFF.zzP(zzz6m.zzZT(), false);
            zzYTW().zz8z();
            if (((zzYIC) zzyia.zza9()).zzYk4()) {
                zz5.zzZ(zzyia, zzz6m.zzZm(), zzz6m.zzZo(), zzYTW());
                Shading shading = ((zzYIC) zzyia.zza9()).zzYk1().zzYMW().getShading();
                this.zzZFF.zzU(shading);
                com.aspose.words.internal.zzZQ4 zzzq4ZzL = zzYIB.zzL(zzyia);
                com.aspose.words.internal.zzZG zzzgZzZ = zzYCM.zzZ(zzzq4ZzL, shading);
                if (zzzgZzZ != null) {
                    com.aspose.words.internal.zz7 zz7VarZzZ2g = this.zzYgG.zzZ2g();
                    zz7VarZzZ2g.zzX(zzzgZzZ);
                    this.zzZFF.zzS(zz7VarZzZ2g);
                }
                this.zzYgC.push(zzzq4ZzL);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.aspose.words.zzZ61
    public final void zzZ(zzZ66 zzz66) throws Exception {
        this.zzZFG.zzYR3();
        this.zzYgF.zzZ(zzz66);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzZ(zzZ6D zzz6d) throws Exception {
        this.zzZFG.zzY(zzz6d);
    }

    public final com.aspose.words.internal.zzZH zzZ(zzZ6P zzz6p, zzZ6R zzz6r) throws Exception {
        com.aspose.words.internal.zzZH zzzh = new com.aspose.words.internal.zzZH(com.aspose.words.internal.zzSA.zzE(((zzYN8) zzz6p.zzYgm).getSize()), ((zzYN8) zzz6p.zzYgm).getPaperTray(), ((zzYN8) zzz6p.zzYgm).zzZ3());
        this.zzZFF = new zzZ71(zzzh, zzz6r);
        this.zzYgG.zzZ(zzzh.getSize(), this.zzZFF);
        zzy1(zzz6r.getCommentDisplayMode());
        zzW(zzz6p);
        this.zzYgG.zzG3();
        return zzzh;
    }

    @Override // com.aspose.words.zzZ61
    public final void zzW(zzZ6S zzz6s) {
        this.zzZFF.zzZI();
        if (zzz6s.zzYgm instanceof zzYVR) {
            this.zzYgG.zzZ2m();
        }
        if (zzz6s.zzYgm instanceof zzUN) {
            this.zzYgG.zzZ2i();
        }
        if (zzz6s.zzYgm instanceof zzYVM) {
            this.zzYgG.zzZ2k();
        }
    }

    @Override // com.aspose.words.zzZ61
    public final void zzX(zzZ63 zzz63) throws Exception {
        this.zzYgF.zzZ(zzz63);
        this.zzYgG.zzZ(zzz63);
        this.zzZFF.zzP(zzz63.zzZT(), false);
        this.zzYgI.push(new zzXX(0));
    }

    @Override // com.aspose.words.zzZ61
    public final void zzW(zzZ63 zzz63) throws Exception {
        this.zzZFF.zzL(this.zzYgG.zzZ2g());
        zzYTW().zzZ(this.zzZFF);
        this.zzZFF.zzZI();
        this.zzYgI.pop();
        this.zzZFF.zzZI();
        this.zzYgG.zzY(zzz63);
        this.zzYgF.zzY(zzz63);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzX(zzZ6M zzz6m) throws Exception {
        this.zzZFF.zzZI();
        if (((zzYIC) ((zzYIA) zzz6m.zzYgm).zza9()).zzYk4()) {
            this.zzZFF.zzZ7c();
        }
        this.zzYgF.zzW(zzz6m);
        if (((zzYIC) ((zzYIA) zzz6m.zzYgm).zza9()).zzYk4()) {
            this.zzYgC.pop();
        }
    }

    public final com.aspose.words.internal.zzZH zzZ(zzZ6P zzz6p, zzZ6P zzz6p2, long j, int i, zzZ6R zzz6r) throws Exception {
        float height;
        float width;
        int i2 = (int) j;
        boolean z = Float.intBitsToFloat(i2) >= com.aspose.words.internal.zzZPW.zzYz(j);
        float fMax = Math.max(Float.intBitsToFloat(i2), com.aspose.words.internal.zzZPW.zzYz(j)) / 2.0f;
        com.aspose.words.internal.zzZH zzzh = new com.aspose.words.internal.zzZH(j, i, !z);
        this.zzZFF = new zzZ71(zzzh, zzz6r);
        this.zzYgG.zzZ(zzzh.getSize(), this.zzZFF);
        float f = 0.0f;
        if (zzz6p != null) {
            if (z) {
                width = fMax - zzz6p.getWidth();
                height = 0.0f;
            } else {
                height = fMax - zzz6p.getHeight();
                width = 0.0f;
            }
            zzZ(zzz6p, width, height);
        }
        if (zzz6p2 != null) {
            if (!z) {
                fMax = 0.0f;
                f = fMax;
            }
            zzZ(zzz6p2, fMax, f);
        }
        this.zzYgG.zzG3();
        return zzzh;
    }

    @Override // com.aspose.words.zzZ61
    public final void zzW(zzZ70 zzz70) {
        try {
            this.zzZFF.zzZI();
            if (zzz70.zz2M()) {
                this.zzZFF.zzZI();
            }
            if (zzz70.zzYTN()) {
                if (((zzYIC) ((zzWV) ((zzWT) zzz70.zzYgm).zza9()).zza9()).zzYk4()) {
                    if (zzz70.zzYTO() == 1) {
                        com.aspose.words.internal.zzZQ4 zzzq4ZzW = zzWU.zzW((zzWT) zzz70.zzYgm);
                        zzXX zzxx = new zzXX(0);
                        zzZ(zzxx, (zzWT) zzz70.zzYgm, zzzq4ZzW);
                        zzxx.zzZ(this.zzZFF);
                    }
                } else {
                    zzZ(zzYTW(), (zzWT) zzz70.zzYgm);
                }
            } else if (zzz70.zzYTO() == 4 && ((zzYIC) ((zzWV) ((zzWT) zzz70.zzYgm).zza9()).zza9()).zzYk4()) {
                zzXX zzxx2 = new zzXX(0);
                zzWT zzwt = (zzWT) zzz70.zzYgm;
                int columnIndex = ((zzWV) zzwt.zza9()).getColumnIndex();
                zzYIA zzyia = (zzYIA) zzwt.zzZZJ();
                zzWV zzwvZzpd = ((zzYIC) zzyia.zza9()).zzpd(columnIndex);
                zzWT zzwt2 = (zzWT) zzyia.zz6x();
                while (((zzWV) zzwt2.zza9()) != zzwvZzpd) {
                    zzwt2 = (zzWT) zzwt2.zz5Z();
                }
                zz5.zzZ(zzwt2, zzxx2, zzz70.zzZo());
                zzxx2.zzZ(this.zzZFF);
            }
            if (zzz70.zz2M()) {
                this.zzZFF.zzZ7c();
            }
            this.zzYgG.zzY(zzz70);
            this.zzYgF.zzY(zzz70);
            zzV(zzz70);
            if (zzz70.zz2M()) {
                this.zzYgC.pop();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.aspose.words.zzZ61
    public final void zzX(zzZ70 zzz70) throws Exception {
        this.zzYgF.zzZ(zzz70);
        this.zzYgG.zzZ(zzz70);
        if (!zzz70.zz2M()) {
            this.zzZFF.zzP(zzz70.zzZT(), false);
            return;
        }
        this.zzZFF.zzU(zzz70.getShading());
        com.aspose.words.internal.zzZG zzzgZzZ = zzYCM.zzZ(zzz70.zzYTP(), zzz70.getShading());
        if (zzzgZzZ != null) {
            com.aspose.words.internal.zz7 zz7VarZzZ2g = this.zzYgG.zzZ2g();
            zz7VarZzZ2g.zzX(zzzgZzZ);
            this.zzZFF.zzS(zz7VarZzZ2g);
        }
        com.aspose.words.internal.zzZS zzzsZzy0 = this.zzZFF.zzy0(33554432);
        zzH zzh = new zzH(zzz70.zzbL(), this.zzZFF.zzP(zzz70.zzZT(), false));
        zzzsZzy0.setTag(zzh);
        com.aspose.words.internal.zzZQ4 zzzq4ZzYTQ = zzz70.zzYTQ();
        if (zzz70.zz6c()) {
            zzh.zzs(((zzWT) zzz70.zzYgm).zzr((com.aspose.words.internal.zzP9) null));
            zzzq4ZzYTQ = com.aspose.words.internal.zzZQ4.zz2T;
        }
        this.zzYgC.push(zzzq4ZzYTQ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzZ(zzXX zzxx, zzWT zzwt, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        Border borderZzV;
        Border borderZzV2;
        int i;
        zzwt.zza9();
        if (zzwt.isSink()) {
            Ref ref = new Ref(null);
            Ref ref2 = new Ref(null);
            zzWK.zzZ(zzwt, (Ref<zzWT>) ref, (Ref<zzWT>) ref2);
            ref.get();
            zzWT zzwt2 = (zzWT) ref2.get();
            borderZzV = zzZ70.zzV(zzwt2, 6);
            borderZzV2 = zzZ70.zzV(zzwt2, 7);
        } else {
            borderZzV = zzZ70.zzV(zzwt, 6);
            borderZzV2 = zzZ70.zzV(zzwt, 7);
        }
        Border border = borderZzV2;
        Border border2 = borderZzV;
        int iZz6m = ((zzWV) zzwt.zza9()).zz6m();
        if (iZz6m != 0) {
            boolean zZzYnZ = zzwt.zzZZJ().zzYnZ();
            boolean zZzYnY = zzwt.zzZZJ().zzYnY();
            i = ((zZzYnZ || iZz6m == 1) && (zZzYnY || iZz6m == 3)) ? 0 : (zZzYnZ && iZz6m == 2) ? 1 : zZzYnY ? 3 : iZz6m;
        }
        zzxx.zzZ(zzzq4, zzZ70.zzV(zzwt, 1), zzZ70.zzV(zzwt, 2), zzZ70.zzV(zzwt, 3), zzZ70.zzV(zzwt, 0), border2, border, i);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzY(zzZ6U zzz6u) throws Exception {
        this.zzYgF.zzV(zzz6u);
        this.zzZFG.zzYR7();
        zzYS.zzZ(zzz6u.zzYgm, 11);
    }

    @Override // com.aspose.words.zzZ61
    public final void zzX(zzZ6N zzz6n) throws Exception {
        this.zzYgF.zzZ(zzz6n);
        this.zzYgG.zzZ(zzz6n);
        this.zzZFF.zzy0(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        zzW(zzz6n);
        this.zzZFF.zzP(zzz6n.zzZT(), zzz6n.zzYSg());
        zzZv(zzz6n.zzYSv());
    }

    @Override // com.aspose.words.zzZ61
    public final void zzX(zzZ6S zzz6s) throws Exception {
        if (zzz6s.zzYgm instanceof zzYVR) {
            this.zzYgG.zzZ(zzz6s);
        }
        if (zzz6s.zzYgm instanceof zzUN) {
            this.zzYgG.zzZ2j();
        }
        if (zzz6s.zzYgm instanceof zzYVM) {
            this.zzYgG.zzY(zzz6s);
        }
        com.aspose.words.internal.zzG zzgZzP = this.zzZFF.zzP(zzz6s.zzZT(), false);
        if (zzz6s.zzbK()) {
            zzgZzP.zzZ(com.aspose.words.internal.zzP8.zzM(zzz6s.zzbL()));
        }
        if (zzz6s.zzNb() != null) {
            zzgZzP.zzW(zzz6s.zzNb());
        }
    }

    private void zzW(zzZ6N zzz6n) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4Peek;
        this.zzZFF.zzU(zzz6n.getShading());
        if (((zzZ55) zzz6n.zzYgm).zzYQ9()) {
            return;
        }
        if (((zzZ37) ((zzYMM) ((zzZ55) zzz6n.zzYgm).zza9()).zzYTt()).zzTV(true).isFloating() || this.zzZFF.zzQ(zzz6n.getShading())) {
            if (this.zzYgC.size() > 0) {
                zzzq4Peek = this.zzYgC.peek();
            } else {
                zzzq4Peek = com.aspose.words.internal.zzZQ4.zz2T;
            }
            ArrayList arrayList = new ArrayList(zzz6n.zzYSm().getCount());
            for (int i = 0; i < zzz6n.zzYSm().getCount(); i++) {
                com.aspose.words.internal.zzZQ4 zzzq4ZzT7 = zzz6n.zzYSm().zzT7(i);
                if (!zzzq4Peek.isEmpty()) {
                    zzzq4ZzT7 = com.aspose.words.internal.zzZQ4.zzU(zzzq4ZzT7, zzzq4Peek);
                }
                com.aspose.words.internal.zzZG zzzgZzZ = zzYCM.zzZ(zzzq4ZzT7, zzz6n.getShading());
                if (zzzgZzZ != null) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZG>) arrayList, zzzgZzZ);
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
            this.zzYgG.zzZ2f();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.zzZFF.zzS((com.aspose.words.internal.zzZG) it.next());
            }
            this.zzYgG.zzZ2e();
        }
    }
}
