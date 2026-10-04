package com.aspose.words;

import com.orion.penkit.tools.DrawToolFactory;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQY {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("page-layout-name", "next-style-name", "style-name", "header", "header-left", "footer", "footer-left", "footer-first", "header-first", "animate", "animateColor", "animateMotion", "animateTransform", "audio", "command", "iterate", "par", "seq", "set", "transitionFilter", "scene", "a", "caption", "circle", "connector", "control", "custom-shape", "ellipse", "frame", "g", "layer-set", "line", "measure", "page-thumbnail", "path", "polygon", "polyline", DrawToolFactory.LASSO_TYPE_RECT, "regular-polygon", "forms", "notes");

    public static void zzJ(zzYQ7 zzyq7) throws Exception {
        zzYR0 zzyr0 = new zzYR0();
        zzX(zzyq7, zzyr0);
        zzY(zzyq7, zzyr0);
        if (com.aspose.words.internal.zzZYD.zzXk(zzyr0.zzYvx())) {
            if (!zzyr0.zzYBx().zzYvR().getDifferentFirstPageHeaderFooter()) {
                zzyr0.zzYBx().zzYvR().setDifferentFirstPageHeaderFooter(true);
            } else if (zzZ(zzyq7, zzyr0)) {
                return;
            }
        }
        zzyq7.zzYuR().zzZ(zzyr0);
        zzW(zzyq7, zzyr0);
    }

    private static void zzW(zzYQ7 zzyq7, zzYR0 zzyr0) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("master-page")) {
            String localName = zzyq9ZzYuT.getLocalName();
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    zzYRJ.zzZ(zzyq7, zzyr0, localName);
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                    zzyq7.zzZ(1, true, "style:master-page");
                    break;
                default:
                    zzyq7.zzYuT().zzk();
                    break;
            }
        }
    }

    private static void zzX(zzYQ7 zzyq7, zzYR0 zzyr0) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzYQ7.zzZ(zzyq9ZzYuT, zzyr0)) {
                int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
                if (iZzTP == 0) {
                    zzyr0.zzEs(zzyq9ZzYuT.getValue());
                } else if (iZzTP == 1) {
                    zzyr0.zzEr(zzYOU.zzDr(zzyq9ZzYuT.getValue()));
                } else if (iZzTP != 2) {
                    zzyq7.zzYi("master-page", zzyq9ZzYuT.getLocalName());
                } else {
                    zzyq7.zzZ(256, false, "style:master-page");
                }
            }
        }
    }

    private static void zzY(zzYQ7 zzyq7, zzYR0 zzyr0) {
        zzYQK zzyqk = (zzYQK) com.aspose.words.internal.zzZKW.zzZ(zzyq7.zzYuS().zzY(zzyr0.zzYvy(), null, zzyq7.zzYuO(), true), zzYQK.class);
        zzyr0.zzK(new Section(zzyq7.getDocument(), (zzyqk == null || zzyqk.zzYvR() == null) ? new zzYCZ() : zzyqk.zzYvR()));
    }

    private static boolean zzZ(zzYQ7 zzyq7, zzYR0 zzyr0) {
        zzYR0 zzyr0ZzEq = zzyq7.zzYuR().zzEq(zzyr0.zzYvx());
        return zzyr0ZzEq != null && com.aspose.words.internal.zzZKN.zzX(zzyr0ZzEq.zzYvx(), zzyr0.getName(), com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
    }
}
