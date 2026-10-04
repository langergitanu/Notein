package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ62 {
    private float zzYf1;
    private float zzYf2;
    private com.aspose.words.internal.zzPV zzYf3;
    private com.aspose.words.internal.zzPV zzYf4;
    private com.aspose.words.internal.zzPV zzYf5;
    private Font zzYf6;
    private zzZ6H zzYf7;
    private zzY47 zzYf9;
    private float zzkF = 0.0f;
    private ArrayList<zzY46> zzYf8 = new ArrayList<>();

    public zzZ62(zzZ6H zzz6h, com.aspose.words.internal.zzPV zzpv) throws Exception {
        this.zzYf9 = new zzY47(zzz6h);
        zzZ(zzz6h, zzpv);
    }

    private static int zzX(zzZ6H zzz6h) {
        if (zzz6h.getFont().getPosition() < 0.0d) {
            return 0;
        }
        if (zzz6h.getFont().getPosition() != 0.0d || zzz6h.getFont().getSubscript()) {
            return (zzz6h.getFont().getSubscript() || zzz6h.getFont().getSuperscript()) ? 2 : 1;
        }
        return 0;
    }

    public final boolean zzW(zzZ6H zzz6h) {
        int iZzX = zzX(zzz6h);
        return zzz6h.getFont().getHidden() != this.zzYf6.getHidden() || !(zzz6h.getFont().getHidden() || this.zzYf6.getHidden() || zzz6h.getFont().getUnderline() == this.zzYf6.getUnderline()) || iZzX != zzX(this.zzYf7) || iZzX == 2 || (iZzX == 1 && !com.aspose.words.internal.zzAN.zzL(zzz6h.getFont().getPosition(), this.zzYf7.getFont().getPosition()));
    }

    public final void zzY(zzZ6H zzz6h) throws Exception {
        this.zzkF = Math.max(this.zzkF, com.aspose.words.internal.zzZPY.zzYC(zzz6h.zzZT()));
        this.zzYf9.zzA(zzz6h);
        this.zzYf7 = zzz6h;
        zzY(zzz6h, true);
    }

    public final zz0R zzYRr() {
        return this.zzYf7.zz14().zzYRr();
    }

    public final zzY47 zzYRs() {
        return this.zzYf9;
    }

    public final float zzYRt() {
        return this.zzkF;
    }

    public final void zzZ(zzZ6H zzz6h, com.aspose.words.internal.zzPV zzpv) throws Exception {
        this.zzYf6 = zzz6h.getFont();
        this.zzYf5 = zzpv;
        this.zzYf4 = zzZ5G.zzO(zzz6h);
        this.zzYf3 = zzZ5G.zzP(zzz6h);
        this.zzYf2 = Float.MAX_VALUE;
        this.zzYf1 = -3.4028235E38f;
        zzY(zzz6h, true);
    }

    public final boolean zzY(zzZ6H zzz6h, com.aspose.words.internal.zzPV zzpv) {
        return (com.aspose.words.internal.zzPV.zzZ(zzpv, this.zzYf5) && zzz6h.getFont().getEmboss() == this.zzYf6.getEmboss() && zzz6h.getFont().getEngrave() == this.zzYf6.getEngrave() && zzz6h.getFont().getShadow() == this.zzYf6.getShadow()) ? false : true;
    }

    public final void zzZ(zzZ6H zzz6h, boolean z) throws Exception {
        zzY(zzz6h, z);
        com.aspose.words.internal.zzZQG.zzZ(this.zzYf8, new zzY46(this, this.zzYf6, this.zzYf5, this.zzYf4, this.zzYf3, this.zzYf2, this.zzYf1));
    }

    private void zzY(zzZ6H zzz6h, boolean z) throws Exception {
        float fIntBitsToFloat = Float.intBitsToFloat((int) zzz6h.zzZT());
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) zzz6h.zzZT()) + zzz6h.zzYRR();
        if (z) {
            this.zzYf2 = Math.min(this.zzYf2, fIntBitsToFloat);
            this.zzYf1 = Math.max(this.zzYf1, fIntBitsToFloat2);
        } else if (fIntBitsToFloat2 > this.zzYf1) {
            this.zzYf1 = fIntBitsToFloat;
        }
    }

    public final void zzZ(zzZ6H zzz6h, boolean z, zzZ71 zzz71) throws Exception {
        zzZ(zzz6h, z);
        for (int i = 0; i < this.zzYf8.size(); i++) {
            this.zzYf8.get(i).zzS(zzz71);
        }
    }
}
