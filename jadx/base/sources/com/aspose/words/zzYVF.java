package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYVF {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("cnfStyle", "tcW", "gridSpan", "hmerge", "hMerge", "vmerge", "vMerge", "tcBorders", "shd", "noWrap", "hideMark", "tcMar", "textFlow", "textDirection", "tcFitText", "vAlign", ContextChain.TAG_PRODUCT, "tblHeader", "tcPr", "top", "bottom", "left", "right", "tl2br", "tr2bl", "insideH", "insideV", "start", "end");
    private zzYUT zzXUp;

    public zzYVF(zzYUT zzyut) {
        this.zzXUp = zzyut;
    }

    private static void zzZ(zzYU4 zzyu4, zzWP zzwp) {
        String localName = zzyu4.getLocalName();
        while (zzyu4.zzQ(localName)) {
            if ("hmerge".equals(zzyu4.getLocalName()) || "hMerge".equals(zzyu4.getLocalName())) {
                zzY(zzyu4, zzwp);
            } else {
                zzyu4.zzYyH();
            }
        }
    }

    public final void zzY(zzYVB zzyvb, zzWP zzwp) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzyu4ZzZsD.zzj();
        if (zzyvb.zzYyZ().zzZrB()) {
            zzZ(zzyu4ZzZsD, zzwp);
            return;
        }
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 0:
                    zzyu4ZzZsD.zzYyH();
                    break;
                case 1:
                    zzwp.zzZ(zzyu4ZzZsD.zzX(zzyvb.zzZqn()));
                    break;
                case 2:
                    int iZzYyE = zzyu4ZzZsD.zzYyE();
                    zzwp.zzQ(3900, Integer.valueOf(iZzYyE != 0 ? iZzYyE : 1));
                    break;
                case 3:
                case 4:
                    zzY(zzyu4ZzZsD, zzwp);
                    break;
                case 5:
                case 6:
                    String strZzV = zzyu4ZzZsD.zzV("val", null);
                    if (strZzV == null) {
                        strZzV = "continue";
                    }
                    zzwp.zzQ(3030, Integer.valueOf(zzYUB.zzH1(strZzV)));
                    break;
                case 7:
                    zzZ(zzyvb, zzwp, zzyvb.zzZqn());
                    break;
                case 8:
                    zzwp.zzQ(3170, zzyu4ZzZsD.zzYyA());
                    break;
                case 9:
                    zzwp.zzQ(3180, Boolean.valueOf(!zzyu4ZzZsD.zzYyD()));
                    break;
                case 10:
                    zzwp.zzQ(3220, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 11:
                    zzZ(zzyu4ZzZsD, zzwp, zzyvb.zzZqn());
                    break;
                case 12:
                case 13:
                    zzwp.zzQ(3050, Integer.valueOf(zzY8T.zzP(zzyu4ZzZsD.zzV("val", null), zzyvb.zzZqn())));
                    break;
                case 14:
                    zzwp.zzQ(3190, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 15:
                    zzwp.zzQ(3060, Integer.valueOf(zzYUB.zzH0(zzyu4ZzZsD.zzV("val", null))));
                    break;
                case 16:
                    this.zzXUp.zzL(zzyvb);
                    break;
                case 17:
                    zzyvb.zzXUg.zzQ(4040, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 18:
                    zzY(zzyvb, zzwp);
                    break;
                default:
                    if (!zzZ(zzyu4ZzZsD.getLocalName(), zzyvb, zzwp)) {
                        zzyu4ZzZsD.zzk();
                    }
                    break;
            }
        }
        if (zzwp.getHorizontalMerge() == 2) {
            zzwp.remove(3020);
        }
    }

    public abstract boolean zzZ(String str, zzYVB zzyvb, zzWP zzwp) throws Exception;

    private static void zzZ(zzYVB zzyvb, zzWP zzwp, zzYO3 zzyo3) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzQ("tcBorders")) {
            String localName = zzyu4ZzZsD.getLocalName();
            switch (zzUR.zzTP(localName)) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    zzwp.zzQ(zzYU3.zzGL(localName), zzyu4ZzZsD.zzYyB());
                    break;
                case 27:
                case 28:
                    zzyo3.zzYrc();
                    zzwp.zzQ(zzYU3.zzGL(localName), zzyu4ZzZsD.zzYyB());
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, zzWP zzwp, zzYO3 zzyo3) {
        while (zzyu4.zzQ("tcMar")) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 27) {
                zzyo3.zzYrc();
                zzZ(zzyu4, zzwp, 3090, zzyo3);
            } else if (iZzTP != 28) {
                switch (iZzTP) {
                    case 19:
                        zzZ(zzyu4, zzwp, 3070, zzyo3);
                        break;
                    case 20:
                        zzZ(zzyu4, zzwp, 3080, zzyo3);
                        break;
                    case 21:
                        zzZ(zzyu4, zzwp, 3090, zzyo3);
                        break;
                    case 22:
                        zzZ(zzyu4, zzwp, 3100, zzyo3);
                        break;
                    default:
                        zzyu4.zzk();
                        break;
                }
            } else {
                zzyo3.zzYrc();
                zzZ(zzyu4, zzwp, 3100, zzyo3);
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, zzWP zzwp, int i, zzYO3 zzyo3) {
        PreferredWidth preferredWidthZzX = zzyu4.zzX(zzyo3);
        if (preferredWidthZzX.zzYmF() != 0) {
            zzwp.zzQ(i, Integer.valueOf(preferredWidthZzX.zzYmE()));
        }
    }

    public static void zzY(zzYU4 zzyu4, zzWP zzwp) {
        String strZzV = zzyu4.zzV("val", null);
        if (strZzV == null) {
            strZzV = "continue";
        }
        zzwp.zzQ(3040, Integer.valueOf(zzYUB.zzH1(strZzV)));
    }
}
