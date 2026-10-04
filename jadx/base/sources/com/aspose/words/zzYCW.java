package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYCW {
    private zzLS zzYRS;
    private Document zzZEY;

    public zzYCW(Document document, zzLS zzls) {
        this.zzZEY = document;
        this.zzYRS = zzls;
    }

    private static void zzY(Section section, zzPS zzps) {
        zzYCZ zzyczZzYvR = section.zzYvR();
        int pageWidth = zzyczZzYvR.getPageWidth();
        int pageHeight = zzyczZzYvR.getPageHeight();
        int iZzZ = zzZ(zzps, "margin-top", pageHeight);
        if (iZzZ >= 0) {
            zzyczZzYvR.zzvT(iZzZ);
        }
        int iZzZ2 = zzZ(zzps, "margin-right", pageWidth);
        if (iZzZ2 >= 0) {
            zzyczZzYvR.zzHi(iZzZ2);
        }
        int iZzZ3 = zzZ(zzps, "margin-bottom", pageHeight);
        if (iZzZ3 >= 0) {
            zzyczZzYvR.zzvS(iZzZ3);
        }
        int iZzZ4 = zzZ(zzps, "margin-left", pageWidth);
        if (iZzZ4 >= 0) {
            zzyczZzYvR.zzHj(iZzZ4);
        }
    }

    private static int zzZ(zzPS zzps, String str, int i) {
        zzPT zzptZzSx = zzps.zzSx(str);
        if (zzptZzSx == null || zzptZzSx.zzZWj().getCount() > 1) {
            return Integer.MIN_VALUE;
        }
        zzL4 zzl4ZzZVx = zzptZzSx.zzZWj().zzZVx();
        if (zzl4ZzZVx.getValueType() == 5) {
            return (int) Math.round((((zzMU) zzl4ZzZVx).getDoubleValue() / 100.0d) * ((double) i));
        }
        double dZzL = zzL5.zzL(zzl4ZzZVx);
        if (com.aspose.words.internal.zzAN.zzL(dZzL, -1.7976931348623157E308d)) {
            return Integer.MIN_VALUE;
        }
        return com.aspose.words.internal.zzSA.zzr(dZzL);
    }

    public final Document getDocument() {
        return this.zzZEY;
    }

    public abstract void zzA(Section section);

    public final void zzB(Section section) {
        if (this.zzYRS.isEmpty()) {
            return;
        }
        if (this.zzYRS.zzZUC().zzSx("page") != null) {
            zzPS zzpsZzZUh = this.zzYRS.zzZUh();
            zzZ(section, zzpsZzZUh);
            zzY(section, zzpsZzZUh);
        }
        zzA(section);
    }

    public final zzLS zzYc7() {
        return this.zzYRS;
    }

    public abstract void zzYc8();

    public abstract void zzZ(Section section, zzPS zzps);
}
