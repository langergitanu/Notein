package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZY {
    private boolean zzWTA;
    private double zzWTB;
    private boolean zzWTC;
    private double zzWTD;
    private boolean zzWTE;
    private double zzWTF;
    private double zzYoM;

    private zzXZY() {
    }

    private void zzVS(double d) {
        this.zzWTD = d;
        this.zzWTC = !com.aspose.words.internal.zzAN.zzZD(d);
    }

    private void zzVT(double d) {
        this.zzWTB = d;
        this.zzWTA = true;
    }

    private void zzVU(double d) {
        this.zzWTF = d;
        this.zzWTE = !com.aspose.words.internal.zzAN.zzZD(d);
    }

    public static zzXZY zzXR(Paragraph paragraph) {
        zzZ45 zzz45ZzZx = zzZ45.zzZx(paragraph);
        zzXZY zzxzy = new zzXZY();
        zzxzy.zzVU(zzz45ZzZx.getLeftIndent());
        double leftIndent = (zzz45ZzZx.getLeftIndent() - zzz45ZzZx.zzYNW()) - zzz45ZzZx.zzZ19();
        zzxzy.zzYoM = leftIndent;
        if (leftIndent <= 0.0d) {
            leftIndent = 0.0d;
        }
        zzxzy.zzVT(leftIndent);
        zzxzy.zzVS(zzz45ZzZx.zzYNV() - zzz45ZzZx.getLeftIndent());
        return zzxzy;
    }

    public final boolean zzXRM() {
        return this.zzWTC;
    }

    public final double zzXRN() {
        return this.zzWTD;
    }

    public final boolean zzXRO() {
        return this.zzWTA;
    }

    public final double zzXRP() {
        return this.zzWTB;
    }

    public final double zzXRQ() {
        return this.zzWTF;
    }

    public final double zzZ1a() {
        return this.zzYoM;
    }
}
