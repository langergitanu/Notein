package com.aspose.words;

import com.aspose.words.internal.C22243OooO0Oo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzXX {
    private zzXW zzZC3;
    private zzXW zzZC4;
    private zzXW zzZC5;
    private zzXW zzZC6;
    private zzXW zzZC7;
    private int zzZC9;
    private zzXU zzZC8 = new zzXU();
    private ArrayList<zzXW> zzEG = new ArrayList<>();

    public zzXX(int i) {
        this.zzZC9 = i;
    }

    private zzXW zz8v() {
        zzXW zzxw = new zzXW();
        com.aspose.words.internal.zzZQG.zzZ(this.zzEG, zzxw);
        return zzxw;
    }

    private void zz8w() {
        if (this.zzZC9 != 2) {
            return;
        }
        float fMin = 2.1474836E9f;
        float fMax = -2.1474836E9f;
        for (zzXW zzxwZz8f = this.zzZC7; zzxwZz8f != null; zzxwZz8f = zzxwZz8f.zz8f()) {
            fMin = Math.min(fMin, Float.intBitsToFloat((int) zzxwZz8f.zzZE()));
            fMax = Math.max(fMax, Float.intBitsToFloat((int) zzxwZz8f.zz8g().zzZE()) - fMin);
        }
        for (zzXW zzxwZz8f2 = this.zzZC7; zzxwZz8f2 != null; zzxwZz8f2 = zzxwZz8f2.zz8f()) {
            zzxwZz8f2.zzA(com.aspose.words.internal.zzZPY.zzG(fMin, com.aspose.words.internal.zzZPY.zzYC(zzxwZz8f2.zzZE())));
            zzxwZz8f2.zz8g().zzA(com.aspose.words.internal.zzZPY.zzG(fMin + fMax, com.aspose.words.internal.zzZPY.zzYC(zzxwZz8f2.zzZE())));
        }
    }

    private void zz8x() {
        zz8w();
        for (zzXW zzxwZzZ = this.zzZC7; zzxwZzZ != null; zzxwZzZ = zzZ(zzxwZzZ)) {
            for (zzXW zzxwZz8g = zzxwZzZ; zzxwZz8g != null; zzxwZz8g = zzxwZz8g.zz8g()) {
                zzxwZz8g.zz8x();
            }
        }
    }

    private void zzW(zzZ71 zzz71) {
        for (zzXW zzxwZzZ = this.zzZC7; zzxwZzZ != null; zzxwZzZ = zzZ(zzxwZzZ)) {
            for (zzXW zzxwZz8g = zzxwZzZ; zzxwZz8g != null; zzxwZz8g = zzxwZz8g.zz8g()) {
                if (zzxwZz8g.zz8l() != null && zzxwZz8g.zz8l().isVisible() && zzxwZz8g.zz8j() != null) {
                    this.zzZC8.zzZ(zzxwZz8g, zzxwZz8g.zz8j(), this.zzZC9 == 0, zzz71);
                }
                if (zzxwZz8g.zz8k() != null && zzxwZz8g.zz8k().isVisible() && zzxwZz8g.zz8i() != null) {
                    this.zzZC8.zzZ(zzxwZz8g, zzxwZz8g.zz8i(), this.zzZC9 == 0, zzz71);
                }
            }
        }
    }

    private static com.aspose.words.internal.zzZQ4 zzX(com.aspose.words.internal.zzZQ4 zzzq4, Border border, Border border2, Border border3, Border border4) {
        float x = zzzq4.getX();
        float y = zzzq4.getY();
        float width = zzzq4.getWidth();
        float height = zzzq4.getHeight();
        if (border.getShadow()) {
            x += border.zz8S();
            width -= border.zz8S();
        }
        if (border2.getShadow()) {
            width -= border2.zz8S();
        }
        if (border3.getShadow()) {
            y += border3.zz8S();
            height -= border3.zz8S();
        }
        if (border4.getShadow()) {
            height -= border4.zz8S();
        }
        return new com.aspose.words.internal.zzZQ4(x, y, width, height);
    }

    private void zzY(com.aspose.words.internal.zzZQ4 zzzq4, Border border, Border border2, Border border3, Border border4) {
        com.aspose.words.internal.zzZQ4 zzzq4ZzX = zzX(zzzq4, border, border2, border3, border4);
        long jZzG = com.aspose.words.internal.zzZPY.zzG(zzzq4ZzX.getX(), zzzq4ZzX.getY());
        zzYm(jZzG);
        zzYl(jZzG);
        zzzq4ZzX.getY();
        zzZ(zzzq4ZzX.zzkw(), border3);
        zzZI(zzzq4ZzX.getX());
        zzY(zzzq4ZzX.zzkw(), border3);
        zzX(zzzq4ZzX.getHeight(), border);
    }

    private void zzYl(long j) {
        if (com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(this.zzZC6.zzZE()) > 0.005f) {
            zzXW zzxwZz8v = zz8v();
            this.zzZC3 = zzxwZz8v;
            zzxwZz8v.zzA(j);
            this.zzZC6.zzV(this.zzZC3);
            this.zzZC3.zzW(this.zzZC6);
            this.zzZC3.zzT(Border.zzZCe);
            zz8z();
        }
    }

    private void zzYm(long j) {
        if (this.zzZC6 == null) {
            zzXW zzxwZz8v = zz8v();
            this.zzZC6 = zzxwZz8v;
            zzxwZz8v.zzA(j);
            this.zzZC7 = this.zzZC6;
        }
    }

    private void zzZI(float f) {
        zzXW zzxwZzZF;
        zzXW zzxwZz8g;
        zzXW zzxwZzZG = this.zzZC6;
        while (f - Float.intBitsToFloat((int) zzxwZzZG.zzZE()) > 0.005f && !zzxwZzZG.zz8s()) {
            zzxwZzZG = zzxwZzZG.zz8g();
        }
        if (Math.abs(f - Float.intBitsToFloat((int) zzxwZzZG.zzZE())) < 0.005f) {
            zzxwZz8g = zzxwZzZG.zz8g();
        } else if (f > Float.intBitsToFloat((int) zzxwZzZG.zzZE())) {
            zzxwZzZG = zzxwZzZG.zzZG(f);
            com.aspose.words.internal.zzZQG.zzZ(this.zzEG, zzxwZzZG);
            zzxwZzZG.zzU(Border.zzZCe);
            zzxwZz8g = null;
        } else {
            if (zzxwZzZG.zz8t()) {
                zzxwZzZF = zzxwZzZG.zzZF(f);
                com.aspose.words.internal.zzZQG.zzZ(this.zzEG, zzxwZzZF);
                zzxwZzZG.zzU(Border.zzZCe);
            } else {
                zzxwZzZF = zzxwZzZG.zzZF(f);
                com.aspose.words.internal.zzZQG.zzZ(this.zzEG, zzxwZzZF);
                zzxwZzZF.zzU(zzxwZzZG.zz8p());
            }
            zzXW zzxw = zzxwZzZG;
            zzxwZzZG = zzxwZzZF;
            zzxwZz8g = zzxw;
        }
        this.zzZC6 = zzxwZzZG;
        this.zzZC5 = zzxwZz8g;
    }

    private void zzra() {
        this.zzEG.clear();
        this.zzZC7 = null;
        this.zzZC6 = null;
        this.zzZC5 = null;
        this.zzZC4 = null;
        this.zzZC3 = null;
    }

    public final boolean zz8u() {
        return this.zzZC7 != null;
    }

    public final com.aspose.words.internal.zzG zz8y() {
        if (!zz8u()) {
            return null;
        }
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzZ71 zzz71 = new zzZ71(zzg, new zzZ6R());
        zz8x();
        zzY(zzz71);
        zzX(zzz71);
        zzW(zzz71);
        zzra();
        return zzg;
    }

    public final void zz8z() {
        if (this.zzZC6 == null) {
            return;
        }
        zzXW zzxw = this.zzZC3;
        this.zzZC6 = zzxw;
        this.zzZC5 = zzxw.zz8g();
        this.zzZC4 = null;
    }

    public final void zzE(com.aspose.words.internal.zzG zzg) {
        if (zz8u()) {
            zzZ(new zzZ71(zzg, new zzZ6R()));
        }
    }

    public final void zzZ(com.aspose.words.internal.zzZQ4 zzzq4, Border border, Border border2, Border border3, Border border4) {
        zzY(zzzq4, border, border2, border3, border4);
        zzY(border2, border4);
    }

    public final void zzZH(float f) {
        for (zzXW zzxwZzZ = this.zzZC7; zzxwZzZ != null; zzxwZzZ = zzZ(zzxwZzZ)) {
            for (zzXW zzxwZz8g = zzxwZzZ; zzxwZz8g != null; zzxwZz8g = zzxwZz8g.zz8g()) {
                zzxwZz8g.zzF(0.0f, f);
            }
        }
    }

    public final void zzZ(com.aspose.words.internal.zzZQ4 zzzq4, Border border, Border border2, Border border3, Border border4, Border border5, Border border6, int i) {
        zzY(zzzq4, border, border2, border3, border4);
        this.zzZC6.zzR(border5);
        this.zzZC6.zzOM(i);
        this.zzZC4.zzS(border6);
        zzY(border2, border4);
    }

    private void zzZ(float f, Border border) {
        if (this.zzZC5 == null) {
            zzXW zzxwZz8v = zz8v();
            this.zzZC5 = zzxwZz8v;
            zzxwZz8v.zzA(com.aspose.words.internal.zzZPY.zzG(f, com.aspose.words.internal.zzZPY.zzYC(this.zzZC6.zzZE())));
            this.zzZC5.zzU(border);
            this.zzZC6.zzX(this.zzZC5);
            this.zzZC5.zzY(this.zzZC6);
        }
    }

    private void zzY(Border border, Border border2) {
        zzXW zzxwZzX = zzX(border2, border);
        zzXW zzxw = this.zzZC5;
        this.zzZC6 = zzxw;
        this.zzZC5 = zzxw.zz8g();
        this.zzZC4 = zzxwZzX;
    }

    private void zzY(float f, Border border) {
        zzXW zzxwZzZG = this.zzZC5;
        zzXW zzxw = this.zzZC6;
        while (zzxwZzZG != null && f - Float.intBitsToFloat((int) zzxwZzZG.zzZE()) > 0.005f) {
            zzxwZzZG.zzU(Border.zzZ(zzxwZzZG.zz8p(), border));
            zzxw = zzxwZzZG;
            zzxwZzZG = zzxwZzZG.zz8g();
        }
        if (zzxwZzZG == null) {
            zzxwZzZG = zzxw.zzZG(f);
            com.aspose.words.internal.zzZQG.zzZ(this.zzEG, zzxwZzZG);
            zzxwZzZG.zzU(border);
        } else if (Math.abs(f - Float.intBitsToFloat((int) zzxwZzZG.zzZE())) < 0.005f) {
            zzxwZzZG.zzU(Border.zzZ(zzxwZzZG.zz8p(), border));
        } else {
            zzXW zzxwZzZG2 = zzxw.zzZG(f);
            com.aspose.words.internal.zzZQG.zzZ(this.zzEG, zzxwZzZG2);
            zzxwZzZG2.zzU(Border.zzZ(zzxwZzZG.zz8p(), border));
            zzxwZzZG = zzxwZzZG2;
        }
        this.zzZC5 = zzxwZzZG;
    }

    public final void zzZ(zzZ71 zzz71) {
        if (zz8u()) {
            zz8x();
            zzY(zzz71);
            zzX(zzz71);
            zzW(zzz71);
            zzra();
        }
    }

    private void zzX(float f, Border border) {
        zzXW zzxw = this.zzZC4;
        if (zzxw == null) {
            zzXW zzxwZz8v = zz8v();
            this.zzZC4 = zzxwZz8v;
            zzxwZz8v.zzA(C22243OooO0Oo.OooO00o(f, Float.intBitsToFloat((int) this.zzZC6.zzZE()), this.zzZC6.zzZE()));
            this.zzZC4.zzT(border);
            this.zzZC6.zzV(this.zzZC4);
            this.zzZC4.zzW(this.zzZC6);
            this.zzZC3 = this.zzZC4;
            return;
        }
        zzxw.zzT(Border.zzZ(zzxw.zz8n(), border));
    }

    private static zzXW zzZ(zzXW zzxw) {
        zzXW zzxwZz8f;
        do {
            zzxwZz8f = zzxw.zz8f();
            zzxw = zzxw.zz8g();
            if (zzxwZz8f != null) {
                break;
            }
        } while (zzxw != null);
        if (zzxwZz8f == null) {
            return null;
        }
        return zzxwZz8f.zz85();
    }

    private zzXW zzX(Border border, Border border2) {
        zzXW zzxwZz8v = zz8v();
        zzxwZz8v.zzA(com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) this.zzZC5.zzZE()), com.aspose.words.internal.zzZPY.zzYC(this.zzZC4.zzZE())));
        zzxwZz8v.zzU(border);
        zzxwZz8v.zzT(border2);
        this.zzZC5.zzV(zzxwZz8v);
        zzxwZz8v.zzW(this.zzZC5);
        this.zzZC4.zzX(zzxwZz8v);
        zzxwZz8v.zzY(this.zzZC4);
        return zzxwZz8v;
    }

    private void zzY(zzZ71 zzz71) {
        for (zzXW zzxwZzZ = this.zzZC7; zzxwZzZ != null; zzxwZzZ = zzZ(zzxwZzZ)) {
            for (zzXW zzxwZz8g = zzxwZzZ; zzxwZz8g != null; zzxwZz8g = zzxwZz8g.zz8g()) {
                if (zzxwZz8g.zz8r()) {
                    zzXW zzxw = zzxwZz8g;
                    for (zzXW zzxwZz8f = zzxwZz8g.zz8f(); zzxwZz8f != null; zzxwZz8f = zzxwZz8f.zz8f()) {
                        if (!zzxw.zz8m().isVisible()) {
                            zzxw = zzxwZz8f;
                        } else if (!zzxwZz8f.zz8c()) {
                            this.zzZC8.zzZ(zzxw, zzxwZz8f, this.zzZC9 == 0, zzz71);
                            zzxw = zzxwZz8f;
                        }
                    }
                }
            }
        }
    }

    private void zzX(zzZ71 zzz71) {
        for (zzXW zzxwZzZ = this.zzZC7; zzxwZzZ != null; zzxwZzZ = zzZ(zzxwZzZ)) {
            zzXW zzxw = zzxwZzZ;
            for (zzXW zzxwZz8g = zzxwZzZ.zz8g(); zzxwZz8g != null; zzxwZz8g = zzxwZz8g.zz8g()) {
                if (!zzxw.zz8o().isVisible()) {
                    zzxw = zzxwZz8g;
                } else if (!zzxwZz8g.zz8d()) {
                    this.zzZC8.zzZ(zzxw, zzxwZz8g, this.zzZC9 == 0, zzz71);
                    zzxw = zzxwZz8g;
                }
            }
        }
    }
}
