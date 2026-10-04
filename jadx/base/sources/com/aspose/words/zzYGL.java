package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGL {
    private zzYHZ zzXuG;
    private int zzXuH = 0;
    private zzYHB zzXuI;
    private zzYEM zzXwl;

    public zzYGL(zzYEM zzyem) {
        this.zzXwl = zzyem;
        this.zzXuG = zzyem.zzYfW();
    }

    private boolean zzYhS() {
        return com.aspose.words.internal.zzZKN.equals(zzU1.zzZ(this.zzXuI.zzYiF(), this.zzXwl.getDocument().zzZqI()), zzYEF.zzYdx());
    }

    private int zzYhT() {
        if (this.zzXuI.zzYix()) {
            this.zzXuH = 2;
            return 0;
        }
        if (zzU1.zzZ(this.zzXuI.zzYiG(), this.zzXuI.zzYiE()) && (this.zzXuI.zzYiF() == null || zzYhS())) {
            this.zzXuH = 0;
            return 0;
        }
        if (com.aspose.words.internal.zzZ4.zzX(this.zzXuI.zzYiG(), this.zzXuI.zzYiE())) {
            this.zzXuH = 1;
            return 3;
        }
        if (com.aspose.words.internal.zzZ4.zzX(this.zzXuI.zzYiG(), this.zzXuI.zzYiF())) {
            this.zzXuH = 0;
            return 2;
        }
        if (com.aspose.words.internal.zzZ4.zzX(this.zzXuI.zzYiE(), this.zzXuI.zzYiF())) {
            this.zzXuH = 3;
            return 1;
        }
        if (this.zzXuI.zzZ7n() == 1) {
            this.zzXuH = 1;
            return 6;
        }
        if (this.zzXuI.zzZ7n() == 2 || this.zzXuI.zzYiE() != null) {
            this.zzXuH = 0;
            return 5;
        }
        this.zzXuH = 3;
        return 4;
    }

    private void zzZ(String str, zzU1 zzu1, String str2, zzU1 zzu12, String str3) throws Exception {
        this.zzXuG.zzCD(str);
        zzYFM.zzZ(this.zzXwl, true, zzu1);
        this.zzXuG.zzCD(str2);
        zzYFM.zzZ(this.zzXwl, true, zzu12);
        this.zzXuG.zzCD(str3);
    }

    public final void reset() {
        this.zzXuH = 0;
    }

    public final int zzYhR() {
        return this.zzXuH;
    }

    public final void zzZ(zzYHB zzyhb) throws Exception {
        this.zzXuH = 0;
        this.zzXuI = zzyhb;
        switch (zzYhT()) {
            case 1:
                this.zzXuG.zzCD("\\loch");
                break;
            case 2:
                this.zzXuG.zzCD("\\hich");
                break;
            case 3:
                this.zzXuG.zzCD("\\dbch");
                break;
            case 4:
                zzZ("\\hich", this.zzXuI.zzYiE(), "\\dbch", this.zzXuI.zzYiF(), "\\loch");
                break;
            case 5:
                zzZ("\\loch", this.zzXuI.zzYiG(), "\\dbch", this.zzXuI.zzYiF(), "\\hich");
                break;
            case 6:
                zzZ("\\loch", this.zzXuI.zzYiG(), "\\hich", this.zzXuI.zzYiE(), "\\dbch");
                break;
        }
    }
}
