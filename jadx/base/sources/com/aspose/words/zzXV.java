package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXV {
    private double zzZBQ;
    private Border zzZBR;

    public zzXV(zzPS zzps, int i, String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        Border border = new Border();
        this.zzZBR = border;
        zzR1.zzZ(zzps, i, border);
        this.zzZBQ = zzps.zzSH(str);
    }

    public final int getLineStyle() {
        return this.zzZBR.getLineStyle();
    }

    public final boolean isVisible() {
        return this.zzZBR.isVisible();
    }

    public final double zz83() {
        if (zz84()) {
            return this.zzZBQ;
        }
        return 0.0d;
    }

    public final boolean zz84() {
        return !com.aspose.words.internal.zzAN.zzZC(this.zzZBQ);
    }

    public final void zzP(Border border) {
        if (zz84()) {
            border.zzZ4(this.zzZBQ);
        }
    }

    public final void zzQ(Border border) {
        if (this.zzZBR.isVisible()) {
            border.setLineStyle(this.zzZBR.getLineStyle());
            border.setLineWidth(this.zzZBR.getLineWidth());
            border.zzm(this.zzZBR.zz8Q());
        }
    }
}
