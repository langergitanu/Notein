package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYMP {
    private static void zzO(ParagraphFormat paragraphFormat, zzPS zzps) {
        zzL4 zzl4ZzV = zzV(zzps, "vertical-align");
        if (zzl4ZzV != null && zzl4ZzV.getValueType() == 0) {
            paragraphFormat.setBaselineAlignment(zzL5.zzS5(((zzOT) zzl4ZzV).getValue()));
        }
    }

    private static void zzP(ParagraphFormat paragraphFormat, zzPS zzps) {
        if (paragraphFormat.isListItem()) {
            return;
        }
        double dZzSH = zzps.zzSH("text-indent");
        if (com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
            double dZzSC = zzps.zzSC("text-indent");
            if (!com.aspose.words.internal.zzAN.zzZC(dZzSC)) {
                dZzSH = (dZzSC * 612.0d) / 100.0d;
            }
        }
        if (com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
            return;
        }
        paragraphFormat.setFirstLineIndent(((double) ((short) com.aspose.words.internal.zzSA.zzr(dZzSH))) / 20.0d);
    }

    private static void zzQ(ParagraphFormat paragraphFormat, zzPS zzps) {
        zzL4 zzl4ZzV = zzV(zzps, "writing-mode");
        if (zzl4ZzV != null && zzl4ZzV.getValueType() == 0) {
            paragraphFormat.zzqr(zzL5.zzS6(((zzOT) zzl4ZzV).getValue()));
        }
    }

    private static void zzR(ParagraphFormat paragraphFormat, zzPS zzps) {
        zzL4 zzl4ZzV = zzV(zzps, "widows");
        if (zzl4ZzV != null && zzl4ZzV.getValueType() == 3) {
            paragraphFormat.setWidowControl(zzl4ZzV.getDoubleValue() > 0.0d);
        }
    }

    private static void zzS(ParagraphFormat paragraphFormat, zzPS zzps) {
        zzL4 zzl4ZzV = zzV(zzps, "orphans");
        if (zzl4ZzV != null && zzl4ZzV.getValueType() == 3) {
            paragraphFormat.setWidowControl(zzl4ZzV.getDoubleValue() > 0.0d);
        }
    }

    private static void zzT(ParagraphFormat paragraphFormat, zzPS zzps) {
        zzL4 zzl4ZzV = zzV(zzps, "page-break-after");
        if (zzl4ZzV == null) {
            return;
        }
        paragraphFormat.setKeepWithNext(zzl4ZzV.zzP(zzL4.zzZnf));
    }

    private static void zzU(ParagraphFormat paragraphFormat, zzPS zzps) {
        zzL4 zzl4ZzV = zzV(zzps, "page-break-before");
        if (zzl4ZzV == null) {
            return;
        }
        paragraphFormat.setPageBreakBefore(zzl4ZzV.zzP(zzL4.zzZmZ));
    }

    private static zzL4 zzV(zzPS zzps, String str) {
        zzPT zzptZzSx = zzps.zzSx(str);
        if (zzptZzSx == null) {
            return null;
        }
        zzptZzSx.zzZWj().getCount();
        return zzptZzSx.zzZWj().zzZVx();
    }

    private static void zzW(ParagraphFormat paragraphFormat, zzPS zzps) throws Exception {
        zzZ("padding-top", 3, paragraphFormat, zzps);
        zzZ("padding-right", 2, paragraphFormat, zzps);
        zzZ("padding-bottom", 0, paragraphFormat, zzps);
        zzZ("padding-left", 1, paragraphFormat, zzps);
    }

    private static void zzX(ParagraphFormat paragraphFormat, zzPS zzps) throws Exception {
        zzW(paragraphFormat, zzps);
        zzV(paragraphFormat, zzps);
        zzU(paragraphFormat, zzps);
        zzT(paragraphFormat, zzps);
        zzS(paragraphFormat, zzps);
        zzR(paragraphFormat, zzps);
        zzQ(paragraphFormat, zzps);
        zzP(paragraphFormat, zzps);
        zzO(paragraphFormat, zzps);
        zzP2.zzZ(zzps, paragraphFormat);
    }

    public abstract void zzY(ParagraphFormat paragraphFormat, zzLS zzls) throws Exception;

    public abstract void zzY(ParagraphFormat paragraphFormat, zzPS zzps) throws Exception;

    public final void zzZ(ParagraphFormat paragraphFormat, zzLS zzls) throws Exception {
        if (zzls.zzZUu().zzYr7 != 0) {
            paragraphFormat.setBidi(zzls.zzZUu().zzYr7 == 2);
        }
        zzPS zzpsZzZUC = zzls.zzZUC();
        zzR1.zzZ(zzpsZzZUC, paragraphFormat);
        zzLP.zzZ(zzpsZzZUC, paragraphFormat.getBidi(), paragraphFormat);
        zzX(paragraphFormat, zzpsZzZUC);
        zzZ(paragraphFormat, new zzRV(zzls.zzZUq().zzZjL()));
        zzX(paragraphFormat);
        zzY(paragraphFormat, zzls);
    }

    private static void zzV(ParagraphFormat paragraphFormat, zzPS zzps) {
        zzL4 zzl4ZzV = zzV(zzps, "page-break-inside");
        if (zzl4ZzV == null) {
            return;
        }
        paragraphFormat.setKeepTogether(zzl4ZzV.zzP(zzL4.zzZnf));
    }

    public final void zzZ(ParagraphFormat paragraphFormat, zzPS zzps) throws Exception {
        zzR1.zzZ(zzps, paragraphFormat);
        zzLP.zzZ(zzps, false, paragraphFormat);
        zzX(paragraphFormat, zzps);
        zzZ(paragraphFormat, new zzRV(zzps));
        zzX(paragraphFormat);
        zzY(paragraphFormat, zzps);
    }

    private static void zzX(ParagraphFormat paragraphFormat) {
        int styleIdentifier = paragraphFormat.getStyleIdentifier() - 1;
        if (styleIdentifier < 0 || styleIdentifier >= 6) {
            return;
        }
        paragraphFormat.setOutlineLevel(styleIdentifier);
    }

    private static void zzZ(String str, int i, ParagraphFormat paragraphFormat, zzPS zzps) throws Exception {
        zzL4 zzl4ZzV = zzV(zzps, str);
        if (zzl4ZzV == null) {
            return;
        }
        double dZzL = zzL5.zzL(zzl4ZzV);
        if (com.aspose.words.internal.zzAN.zzL(dZzL, -1.7976931348623157E308d)) {
            return;
        }
        paragraphFormat.getBorders().getByBorderType(i).zzZ4(dZzL);
    }

    private static void zzZ(ParagraphFormat paragraphFormat, zzRV zzrv) {
        zzrv.zzY(paragraphFormat.getShading());
    }
}
