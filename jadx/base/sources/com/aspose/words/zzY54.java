package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY54 {
    private int zzWe;
    private zzZ5S zzX27;
    private zzY57 zzX28;
    private boolean zzX29 = false;

    public zzY54(zzY57 zzy57, zzZ5S zzz5s) {
        this.zzX28 = zzy57;
        this.zzX27 = zzz5s;
    }

    private static boolean zzXH(char c) {
        return (c == '\f' || c == 14 || com.aspose.words.internal.zzZKU.zzG(c)) ? false : true;
    }

    public final int zzZ(Run run, Paragraph paragraph) throws Exception {
        if (this.zzX29) {
            return -1;
        }
        for (int i = 0; i < run.getText().length(); i++) {
            zzZ(i, run, paragraph);
            if (this.zzX29) {
                break;
            }
        }
        return this.zzWe;
    }

    private void zzZ(int i, Run run, Paragraph paragraph) throws Exception {
        if (zzXH(run.getText().charAt(i)) && !run.zzYUU()) {
            this.zzWe = this.zzX28.zzXUX().zzZ(run, this.zzX27, paragraph);
            this.zzX29 = true;
        }
    }
}
