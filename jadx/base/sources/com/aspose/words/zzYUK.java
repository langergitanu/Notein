package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18437z2;
import com.miui.penengine.p596e.C18773h;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYUK {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("rsidSect", C18437z2.f56754h, "pgSz", "pgMar", "paperSrc", "pgBorders", "lnNumType", "pgNumType", "cols", "formProt", "vAlign", "noEndnote", "titlePg", "textDirection", "textFlow", "bidi", "rtlGutter", "docGrid", "br", "footnoteColumns", ContextChain.TAG_PRODUCT, "tbl", "bookFoldPrinting", "bookFoldRevPrinting", "mirrorMargins", "printTwoOnOne", "w", C18773h.f57233c, "orient", "code", "top", "right", "bottom", "left", "header", "footer", "gutter", "first", "other", "zOrder", "z-order", "display", "offsetFrom", "offset-from", "front", "back", "countBy", "count-by", "start", "distance", "restart", "fmt", "chapStyle", "chap-style", "chapSep", "chap-sep", "num", "sep", "space", "equalWidth", "col", "linePitch", "line-pitch", "charSpace", "char-space");

    private static TextColumn zzF(zzYU4 zzyu4, zzYO3 zzyo3) {
        TextColumn textColumn = new TextColumn();
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 26) {
                textColumn.zzjM(zzyu4.zzT(zzyo3));
            } else if (iZzTP != 58) {
                zzyu4.zzZ(65536, 0, zzyu4.getLocalName());
            } else {
                textColumn.zzjL(zzyu4.zzT(zzyo3));
            }
        }
        return textColumn;
    }

    private static void zzW(zzYU4 zzyu4, zzYCZ zzycz, zzYO3 zzyo3) {
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 56:
                    zzycz.zzQ(2350, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 57:
                    zzycz.zzQ(EditingLanguage.FRENCH_BELGIUM, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 58:
                    zzycz.zzQ(2370, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 59:
                    zzycz.zzQ(2360, Boolean.valueOf(zzyu4.zz8()));
                    break;
                default:
                    zzyu4.zzZ(65536, 0, zzyu4.getLocalName());
                    break;
            }
        }
        zzY5Y zzy5y = new zzY5Y();
        while (zzyu4.zzQ("cols")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 60) {
                zzyu4.zzZ(65536, 0, zzyu4.getLocalName());
            } else {
                zzy5y.zzZ(zzF(zzyu4, zzyo3));
            }
        }
        if (zzy5y.getCount() > 0) {
            zzycz.zzQ(2380, zzy5y);
        }
    }

    private static void zzX(zzYU4 zzyu4, zzYCZ zzycz, zzYO3 zzyo3) {
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 46:
                case 47:
                    zzycz.zzQ(2120, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 48:
                    zzycz.zzQ(2180, Integer.valueOf(zzyu4.zzb() + 1));
                    break;
                case 49:
                    zzycz.zzQ(2400, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 50:
                    zzycz.zzQ(EditingLanguage.MALAY_BRUNEI_DARUSSALAM, Integer.valueOf(zzYUL.zzH7(zzyu4.getValue())));
                    break;
                default:
                    zzyu4.zzZ(65536, 0, zzyu4.getLocalName());
                    break;
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, zzYCZ zzycz, zzYO3 zzyo3) {
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 26:
                    zzycz.zzQ(2260, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 27:
                    zzycz.zzQ(2270, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 28:
                    zzycz.zzQ(2210, Integer.valueOf(zzYUL.zzH4(zzyu4.getValue())));
                    break;
                case 29:
                    zzycz.zzQ(2090, Integer.valueOf(zzyu4.zzb()));
                    break;
                default:
                    zzyu4.zzZ(65536, 0, zzyu4.getLocalName());
                    break;
            }
        }
    }

    private static void zzu(zzYVB zzyvb) throws Exception {
        zzZXB zzzxb = new zzZXB();
        zzZXA zzzxa = new zzZXA(zzzxb, new zzZWJ());
        zzzxb.zzZ(zzzxa);
        new zzZX0(zzZWW.zzZl3(), zzzxa).zzL(zzyvb);
    }

    public final void zzY(zzYVB zzyvb, zzYCZ zzycz) throws Exception {
        zzYVB zzyvb2;
        zzYCZ zzycz2;
        zzYVB zzyvb3;
        int iZzGV;
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYO3 zzyo3ZzZqn = zzyvb.zzZqn();
        boolean z = zzycz.getCount() > 0;
        boolean z2 = ((Section) zzyvb.zzYz7().getAncestor(2)).getHeadersFooters().getCount() > 0;
        if (zzyvb.zzZmh()) {
            while (zzyu4ZzZsD.zzi()) {
                if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) == 0 && (iZzGV = zzYU3.zzGV(zzyu4ZzZsD.getValue())) != Integer.MIN_VALUE) {
                    zzycz.zzQ(2250, Integer.valueOf(iZzGV));
                }
            }
        }
        while (zzyu4ZzZsD.zzQ("sectPr")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 1:
                    zzyvb2 = zzyvb;
                    zzycz2 = zzycz;
                    zzycz2.zzQ(2030, Integer.valueOf(zzYUL.zzH3(zzyu4ZzZsD.zzV("val", null))));
                    zzyvb = zzyvb2;
                    zzycz = zzycz2;
                    break;
                case 2:
                    zzZ(zzyu4ZzZsD, zzycz, zzyo3ZzZqn);
                    break;
                case 3:
                    zzY(zzyu4ZzZsD, zzycz, zzyo3ZzZqn);
                    break;
                case 4:
                    zzZ(zzyu4ZzZsD, zzycz);
                    break;
                case 5:
                    zzY(zzyu4ZzZsD, zzycz);
                    break;
                case 6:
                    zzX(zzyu4ZzZsD, zzycz, zzyo3ZzZqn);
                    break;
                case 7:
                    zzX(zzyvb, zzycz);
                    break;
                case 8:
                    zzW(zzyu4ZzZsD, zzycz, zzyo3ZzZqn);
                    break;
                case 9:
                    zzyvb2 = zzyvb;
                    zzycz2 = zzycz;
                    zzycz2.zzQ(2390, Boolean.valueOf(!zzyu4ZzZsD.zzYyD()));
                    zzyvb = zzyvb2;
                    zzycz = zzycz2;
                    break;
                case 10:
                    zzyvb2 = zzyvb;
                    zzycz2 = zzycz;
                    zzycz2.zzQ(2340, Integer.valueOf(zzYUL.zzH9(zzyu4ZzZsD.zzV("val", null))));
                    zzyvb = zzyvb2;
                    zzycz = zzycz2;
                    break;
                case 11:
                    zzyvb2 = zzyvb;
                    zzycz2 = zzycz;
                    zzycz2.zzQ(2100, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    zzyvb = zzyvb2;
                    zzycz = zzycz2;
                    break;
                case 12:
                    zzyvb2 = zzyvb;
                    zzycz2 = zzycz;
                    zzycz2.zzQ(2040, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    zzyvb = zzyvb2;
                    zzycz = zzycz2;
                    break;
                case 13:
                    zzyvb3 = zzyvb;
                    zzycz.zzQ(2440, Integer.valueOf(zzY5T.zzjJ(zzY8T.zzP(zzyu4ZzZsD.zzV("val", null), zzyo3ZzZqn))));
                    zzyvb = zzyvb3;
                    break;
                case 14:
                    zzyvb3 = zzyvb;
                    zzycz.zzQ(2440, Integer.valueOf(zzY5T.zzjJ(zzY8T.zzP(zzyu4ZzZsD.zzV("val", null), zzyo3ZzZqn))));
                    zzyvb = zzyvb3;
                    break;
                case 15:
                    zzyvb2 = zzyvb;
                    zzycz2 = zzycz;
                    zzycz2.zzQ(2450, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    zzyvb = zzyvb2;
                    zzycz = zzycz2;
                    break;
                case 16:
                    zzyvb2 = zzyvb;
                    zzycz2 = zzycz;
                    zzycz2.zzQ(2410, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    zzyvb = zzyvb2;
                    zzycz = zzycz2;
                    break;
                case 17:
                    zzX(zzyu4ZzZsD, zzycz);
                    break;
                case 18:
                    zzyvb2 = zzyvb;
                    zzycz2 = zzycz;
                    zzyu4ZzZsD.zzYyz().append(zzYUN.zzR(zzyu4ZzZsD, new zzYEF()));
                    zzyvb = zzyvb2;
                    zzycz = zzycz2;
                    break;
                case 19:
                    zzyvb2 = zzyvb;
                    zzycz2 = zzycz;
                    int iZzYyE = zzyu4ZzZsD.zzYyE();
                    if (iZzYyE > 0) {
                        zzycz2.zzQ(2540, Integer.valueOf(iZzYyE));
                        zzyo3ZzZqn.zzYr6();
                    }
                    zzyvb = zzyvb2;
                    zzycz = zzycz2;
                    break;
                case 20:
                    zzu(zzyvb);
                    break;
                case 21:
                    zzZWD.zzY(zzyvb);
                    break;
                case 22:
                case 23:
                case 24:
                case 25:
                    zzyvb3 = zzyvb;
                    zzYUI.zzZ(zzyvb3, zzyvb3.getDocument().zzZpV());
                    zzyvb = zzyvb3;
                    break;
                default:
                    zzZ(zzyu4ZzZsD.getLocalName(), zzyvb, zzycz, z, z2);
                    break;
            }
        }
    }

    public abstract void zzZ(String str, zzYVB zzyvb, zzYCZ zzycz, boolean z, boolean z2) throws Exception;

    private static void zzX(zzYVB zzyvb, zzYCZ zzycz) {
        int iZzyK;
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 48) {
                switch (iZzTP) {
                    case 51:
                        if (zzyvb.zzZmh()) {
                            iZzyK = zzZXP.zzNm(zzyu4ZzZsD.getValue());
                        } else {
                            iZzyK = zzY1K.zzyK(zzyu4ZzZsD.getValue());
                        }
                        zzycz.setPageNumberStyle(iZzyK);
                        break;
                    case 52:
                    case 53:
                        zzycz.setHeadingLevelForChapter(zzyu4ZzZsD.zzb());
                        break;
                    case 54:
                    case 55:
                        zzycz.setChapterPageSeparator(zzYUL.zzH8(zzyu4ZzZsD.getValue()));
                        break;
                    default:
                        zzyu4ZzZsD.zzZ(65536, zzyvb.zzZmh() ? 9 : 13, zzyu4ZzZsD.getLocalName());
                        break;
                }
            } else {
                zzycz.setPageStartingNumber(zzyu4ZzZsD.zzb());
                zzycz.zzYcu();
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, zzYCZ zzycz) {
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 37) {
                zzycz.zzQ(EditingLanguage.PORTUGUESE_PORTUGAL, Integer.valueOf(zzyu4.zzb()));
            } else if (iZzTP != 38) {
                zzyu4.zzZ(65536, 0, zzyu4.getLocalName());
            } else {
                zzycz.zzQ(2080, Integer.valueOf(zzyu4.zzb()));
            }
        }
    }

    private static void zzX(zzYU4 zzyu4, zzYCZ zzycz) {
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP != 1) {
                switch (iZzTP) {
                    case 61:
                    case 62:
                        zzycz.zzQ(2170, Integer.valueOf(zzyu4.zzb()));
                        break;
                    case 63:
                    case 64:
                        zzycz.zzQ(2420, Integer.valueOf(zzyu4.zzb()));
                        break;
                    default:
                        zzyu4.zzZ(65536, 0, zzyu4.getLocalName());
                        break;
                }
            } else {
                zzycz.zzQ(2430, Integer.valueOf(zzYUL.zzHc(zzyu4.getValue())));
            }
        }
    }

    private static void zzY(zzYU4 zzyu4, zzYCZ zzycz, zzYO3 zzyo3) {
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 30:
                    zzycz.zzQ(2300, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 31:
                    zzycz.zzQ(2290, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 32:
                    zzycz.zzQ(2310, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 33:
                    zzycz.zzQ(2280, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 34:
                    zzycz.zzQ(2320, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 35:
                    zzycz.zzQ(2330, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 36:
                    zzycz.zzQ(2312, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                default:
                    zzyu4.zzZ(65536, 0, zzyu4.getLocalName());
                    break;
            }
        }
    }

    private static void zzY(zzYU4 zzyu4, zzYCZ zzycz) {
        while (zzyu4.zzi()) {
            com.aspose.words.internal.zzZHW zzzhw = zzUR;
            switch (zzzhw.zzTP(zzyu4.getLocalName())) {
                case 39:
                case 40:
                    int iZzTP = zzzhw.zzTP(zzyu4.getValue());
                    if (iZzTP == 44) {
                        zzycz.zzQ(2230, Boolean.TRUE);
                    } else if (iZzTP != 45) {
                        zzyu4.zzZ(65536, 0, zzyu4.getValue());
                    } else {
                        zzycz.zzQ(2230, Boolean.FALSE);
                    }
                    break;
                case 41:
                    zzycz.zzQ(2220, Integer.valueOf(zzYUL.zzH5(zzyu4.getValue())));
                    break;
                case 42:
                case 43:
                    zzycz.zzQ(2240, Integer.valueOf(zzYUL.zzH6(zzyu4.getValue())));
                    break;
                default:
                    zzyu4.zzZ(65536, 0, zzyu4.getLocalName());
                    break;
            }
        }
        while (zzyu4.zzQ("pgBorders")) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 30:
                    zzycz.zzQ(2130, zzyu4.zzYyB());
                    break;
                case 31:
                    zzycz.zzQ(2160, zzyu4.zzYyB());
                    break;
                case 32:
                    zzycz.zzQ(2150, zzyu4.zzYyB());
                    break;
                case 33:
                    zzycz.zzQ(2140, zzyu4.zzYyB());
                    break;
                default:
                    zzyu4.zzZ(65536, 0, zzyu4.getLocalName());
                    break;
            }
        }
    }
}
