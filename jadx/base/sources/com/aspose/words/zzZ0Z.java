package com.aspose.words;

import Oooo0.C20855OooooOO;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0Z extends zzZ13 {
    private static int[] zzY1H = {12, 11, 25, 24};
    private float zzY1C;
    private float zzY1D;
    private boolean zzY1E;
    private zzZ13 zzY1F;
    private zzZ13 zzY1G;

    public zzZ0Z(zzZ14 zzz14, OfficeMath officeMath) throws Exception {
        super(zzz14, officeMath);
        this.zzY1E = true;
        this.zzY1D = zzZ11.zzI(zzZr());
        this.zzY1C = zzZ11.zzH(zzZr());
        this.zzY1G = new zzZ13(zzz14, officeMath, (byte) 0);
        this.zzY1F = new zzZ13(zzz14, officeMath, (byte) 0);
    }

    private void zzQ(float f, float f2, float f3, float f4) {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        zzzg.zzX(new com.aspose.words.internal.zzOU(new com.aspose.words.internal.zzOI(zzZy()), zzYG0() * 0.062f));
        com.aspose.words.internal.OooO00o.OooO00o(zzzg, com.aspose.words.internal.zzP5.zzS(com.aspose.words.internal.zzZPY.zzG(f, f2), com.aspose.words.internal.zzZPY.zzG(f3, f4)));
        zzYGn().zzX(zzzg);
    }

    private void zzT(zzZ18 zzz18) {
        if (zzZDx()) {
            zzz18.zzYi(zzYG0() * 0.14f);
        } else if (zzZ11.zzP(this)) {
            zzz18.zzYi(0.0f);
        } else {
            zzz18.zzYi(zzYG0() * 0.34f);
        }
    }

    private zzZ0B zzYFQ() {
        return (zzZ0B) zzYGk().zzZsL();
    }

    private void zzYFR() throws Exception {
        zzZ11.zzW(this.zzY1G, zzYG3().zzPf(), zzYG2());
        zzZ11.zzW(this.zzY1F, zzYG3().zzPf(), zzYG2());
        zzZ0M zzz0m = new zzZ0M(zzYGj(), zzYGk(), 2);
        super.zzZ(zzz0m);
        zzZ0L zzz0l = new zzZ0L(zzYGj(), zzz0m, zzYGk());
        zzz0m.zzZ(zzz0l);
        zzz0l.zzZ(this.zzY1G);
        zzz0l.zzZ(this.zzY1F);
        this.zzY1G.zzZE4();
        this.zzY1F.zzZE4();
        float height = (((this.zzY1F.zzZj().getHeight() + this.zzY1G.zzYGq()) - this.zzY1F.zzYGq()) * 7.0f) / 8.0f;
        float fMax = Math.max(0.0f, this.zzY1F.zzYGq() - this.zzY1G.zzYGq());
        float width = this.zzY1G.zzZj().getWidth();
        float size = (zzZYh().getSize() * 0.29f) + width;
        zzz0m.zzYj(size - width);
        super.zzYHg();
        zzYp(this.zzY1G.zzYGq());
        float size2 = zzZYh().getSize() * 0.04f;
        zzQ(width + size2, height, size - size2, fMax);
    }

    private void zzYFS() throws Exception {
        float size = zzZYh().getSize() * 0.21f;
        zzZ0M zzz0m = new zzZ0M(zzYGj(), zzYGk(), 2);
        zzz0m.zzYi(zzYG0() * 0.062f);
        zzz0m.zzYj(size);
        super.zzZ(zzz0m);
        zzZ0L zzz0l = new zzZ0L(zzYGj(), zzz0m, zzYGk());
        zzz0m.zzZ(zzz0l);
        zzZ0L zzz0l2 = new zzZ0L(zzYGj(), zzz0m, zzYGk());
        zzz0m.zzZ(zzz0l2);
        zzz0l.zzZ(this.zzY1G);
        zzz0l.zzZ(new zzZ13(zzYGj(), zzYGk()));
        zzz0l2.zzZ(new zzZ13(zzYGj(), zzYGk()));
        zzz0l2.zzZ(this.zzY1F);
        super.zzYHg();
        zzYp(this.zzY1G.getHeight());
        float fZzYGq = zzYGq() - (((size / 2.0f) + this.zzY1G.getWidth()) * (-2.6666667f));
        float fOooO00o = C20855OooooOO.OooO00o(this.zzY1F.getHeight(), 5.0f, 6.0f, (zzYG0() * 0.062f) + this.zzY1G.getHeight());
        float height = (this.zzY1G.getHeight() * 1.0f) / 6.0f;
        zzQ((fOooO00o - fZzYGq) / (-2.6666667f), fOooO00o, (height - fZzYGq) / (-2.6666667f), height);
    }

    private void zzYFT() throws Exception {
        zzZ11.zzZ(this.zzY1F, (zzz(this.zzY1F) ? -0.03f : zzZDx() ? zzy(this.zzY1F) ? this.zzY1E ? 0.17f : -0.07f : this.zzY1E ? 0.13f : 0.025f : (!zzZ11.zzP(this) || isInline()) ? 0.06f : 0.08f) * zzYG0());
    }

    private void zzYFU() throws Exception {
        zzZ11.zzY(this.zzY1G, zzYG0() * ((!zzz(this.zzY1G) || this.zzY1G.zzQw().get(0).getHeight() - this.zzY1G.zzQw().get(0).zzYGq() <= zzYG5() * 1.5f) ? (!zzZDx() || zzy(this.zzY1G)) ? 0.074f : 0.0f : -0.01f));
    }

    private void zzYFV() {
        if (zzZDx()) {
            this.zzY1G.scale(this.zzY1C, this.zzY1D);
            this.zzY1F.scale(this.zzY1C, this.zzY1D);
        }
    }

    private void zzYFW() throws Exception {
        zzZ18 zzz18 = new zzZ18(zzYGj(), zzYGk());
        super.zzZ(zzz18);
        zzT(zzz18);
        zzz18.zzZ(this.zzY1G);
        zzz18.zzZ(this.zzY1F);
        float descentPoints = zzYG3().getDescentPoints();
        float fZzPc = zzYG3().zzPc();
        zzZ11.zzW(this.zzY1G, zzYG2() + descentPoints, 0.0f);
        float fZzYG2 = ((zzYG2() * 2.0f) - fZzPc) - (zzYG0() * 0.06f);
        zzZ11.zzW(this.zzY1F, fZzYG2, fZzYG2 - zzYG2());
        this.zzY1G.zzZE4();
        this.zzY1F.zzZE4();
        zzYFV();
        zzYFU();
        zzYFT();
        super.zzYHg();
        zzYk(zzz18.zzYFn());
        zzYl(zzz18.zzYFn());
    }

    private void zzYk(float f) throws Exception {
        zzYp(this.zzY1G.getHeight());
        zzYp(zzYGq() + (zzZDx() ? (-zzYG0()) * this.zzY1D * 0.1f : (f * 0.5f) - (zzYG0() * (zzZ11.zzL(this) ? -0.006f : 0.087f))));
    }

    private void zzYl(float f) {
        if (this.zzY1E) {
            float fOooO00o = OooOO0.OooO0O0.OooO00o(f, 0.5f, this.zzY1G.getHeight(), zzZ11.zzO(this) ? zzYG0() * 0.01f : 0.0f);
            zzQ(0.0f, fOooO00o, getWidth(), fOooO00o);
        }
    }

    private boolean zzZDx() {
        return isInline() && zze(zzY1H);
    }

    private boolean zzy(zzZ13 zzz13) throws Exception {
        return com.aspose.words.internal.zzAN.zzR(zzz13.getHeight(), zzZr().zzPf() * (zzZDx() ? this.zzY1D : 1.0f));
    }

    private boolean zzz(zzZ13 zzz13) throws Exception {
        if (zzZ11.zzP(this)) {
            return false;
        }
        return com.aspose.words.internal.zzAN.zzP(zzz13.getHeight(), zzZr().zzPf() * 1.05f);
    }

    @Override // com.aspose.words.zzZ13
    public final void zzYGC() {
        if (zzYGb() || zzZ11.zzN(this)) {
            return;
        }
        zzZ11.zzQ(this);
    }

    @Override // com.aspose.words.zzZ13
    public final void zzYGD() {
        if (zzYGb() || zzZ11.zzN(this)) {
            return;
        }
        zzZ11.zzR(this);
    }

    @Override // com.aspose.words.zzZ13
    public final boolean zzYGs() {
        return false;
    }

    @Override // com.aspose.words.zzZ13
    public final void zzYHg() throws Exception {
        int iZzYEN = zzYFQ().zzYEN();
        if (iZzYEN != 1) {
            if (iZzYEN == 2) {
                this.zzY1E = false;
            } else if (iZzYEN == 3) {
                zzYFS();
            }
            zzYFW();
        } else {
            zzYFR();
        }
        if (zzYG7()) {
            zzZ11.zzT(this);
        }
    }

    @Override // com.aspose.words.zzZ13
    public final void zzZ(zzZ13 zzz13) {
        int mathObjectType = zzz13.zzYGk().zzZsL().getMathObjectType();
        if (mathObjectType == 11) {
            this.zzY1F.zzZ(zzz13);
        } else {
            if (mathObjectType != 12) {
                throw new IllegalArgumentException("Fraction element can have only numerator and denominator parts.");
            }
            this.zzY1G.zzZ(zzz13);
        }
    }
}
