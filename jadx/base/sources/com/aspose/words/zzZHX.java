package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHX {
    private zzZK3 zzYqv;
    private com.aspose.words.internal.zzZQC<zzZ> zzYqw = new com.aspose.words.internal.zzZQC<>();
    private zzZYY zzYsX;
    private boolean zzZ1;
    private com.aspose.words.internal.zzH3 zzwm;

    public static class zzZ {
        private double zzYqt;
        private zzZIG zzYqu;

        public zzZ(zzZIG zzzig, double d) {
            this.zzYqu = zzzig;
            this.zzYqt = d;
        }

        public final void zzWY(double d) {
            this.zzYqt -= d;
        }

        public final double zzZ27() {
            return this.zzYqt;
        }

        public final zzZIG zzZ28() {
            return this.zzYqu;
        }
    }

    public zzZHX(int i, zzZYY zzzyy, zzZK3 zzzk3, com.aspose.words.internal.zzH3 zzh3) {
        this.zzZ1 = i == 51;
        this.zzYsX = zzzyy;
        this.zzYqv = zzzk3;
        this.zzwm = zzh3;
    }

    private float zzY(String str, Font font) throws Exception {
        return this.zzwm.zzY(font.getName(), (float) font.getSize(), font.zzza()).zz7(str);
    }

    private boolean zzZ29() {
        if (!this.zzZ1) {
            return false;
        }
        int iZzZUt = this.zzYsX.zzZUt();
        return (iZzZUt == 0 || iZzZUt == 2) && this.zzYsX.zzZUC().zzSx("width") != null;
    }

    public final void zzS(zzZIG zzzig) throws Exception {
        if (zzZ29()) {
            this.zzYqv.zzZ4o();
            if (zzLP.zzY(this.zzYsX.zzZUC(), this.zzYsX.zzZUQ())) {
                double dZzSH = this.zzYsX.zzZUC().zzSH("width");
                if (dZzSH <= 0.0d) {
                    return;
                }
                this.zzYqw.push(new zzZ(zzzig, dZzSH));
            }
        }
    }

    public final String zzZ(zzZIG zzzig, Font font) throws Exception {
        if (!zzZ29()) {
            return "";
        }
        this.zzYqv.zzZ4o();
        zzZ zzzPeek = this.zzYqw.size() > 0 ? this.zzYqw.peek() : null;
        if (zzzPeek != null && zzzPeek.zzZ28() == zzzig) {
            this.zzYqw.pop();
            if (zzzPeek.zzZ27() > 0.0d) {
                return com.aspose.words.internal.zzZKN.zzS(ControlChar.SPACE_CHAR, com.aspose.words.internal.zzAN.zzZG(zzzPeek.zzZ27() / ((double) zzY(ControlChar.zzZs5, font))));
            }
        }
        return "";
    }

    public final void zzZ(String str, Font font) throws Exception {
        if (this.zzYqw.size() > 0) {
            float fZzY = zzY(str, font);
            Iterator<zzZ> it = this.zzYqw.iterator();
            while (it.hasNext()) {
                it.next().zzWY(fZzY);
            }
        }
    }
}
