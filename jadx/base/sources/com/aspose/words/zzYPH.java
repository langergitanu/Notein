package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.miui.penengine.p596e.C18773h;
import com.orion.penkit.tools.DrawToolFactory;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPH {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("style-name", "boolean-value", FirebaseAnalytics.Param.CURRENCY, "date-value", "string-value", "time-value", "value", "value-type", "content-validation-name", "formula", "number-columns-repeated", "protect", "protected", "id", "number-columns-spanned", "number-rows-spanned", "number-matrix-columns-spanned", "number-matrix-rows-spanned", "scene", "a", "caption", "circle", "connector", "control", "custom-shape", "ellipse", "frame", "g", "line", "measure", "page-thumbnail", "path", "polygon", "polyline", DrawToolFactory.LASSO_TYPE_RECT, "regular-polygon", "annotation", "cell-range-source", "detective", "table", "alphabetical-index", "bibliography", "change", "change-end", "change-start", C18773h.f57233c, "illustration-index", "list", "numbered-paragraph", "object-index", ContextChain.TAG_PRODUCT, "section", "soft-page-break", "table-index", "table-of-content", "user-index");

    private static void zz2(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq9ZzYuT.zzj();
        while (zzyq9ZzYuT.zzQ("covered-table-cell")) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
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
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                    zzyq7.zzZ(1, true, "table:covered-table-cell");
                    break;
                default:
                    zzyq7.zzYi("table:covered-table-cell", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
    }

    private static void zz3(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    zzyq7.zzZ(256, false, "table:covered-table-cell");
                    break;
                default:
                    zzyq7.zzYi("table:covered-table-cell", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
    }

    private static void zzY(zzYQ7 zzyq7, Cell cell) {
        if (!(cell.zzZYq() instanceof Paragraph) || zzyq7.zzYuy()) {
            return;
        }
        ((Paragraph) cell.zzZYq()).zzZYj().remove(1220);
    }

    public static void zzZ(zzYQ7 zzyq7, zzYPI zzypi, zzYQ4 zzyq4, boolean z) throws Exception {
        if (z) {
            zz3(zzyq7);
            zz2(zzyq7);
            return;
        }
        zzYTE zzyte = new zzYTE();
        zzyte.zzA(new Cell(zzyq7.getDocument()));
        zzyq7.zzE5(null);
        zzZ(zzyq7, zzyte);
        if (!com.aspose.words.internal.zzZYD.zzXk(zzyq7.zzYuP())) {
            zzyq7.zzE5(zzyq4.zzYul());
        }
        zzYPG zzypg = (zzYPG) zzyq7.zzYuS().zzY(zzyq7.zzYuP(), "table-cell", zzyq7.zzYuO(), true);
        if (zzypg != null && zzypg.zz6G() != null) {
            zzypg.zz6G().zzY((zzZS) zzyte.zz6C().zz6G());
        }
        zzZ(zzyq7, zzyte.zz6C());
        zzyq4.zzZ(zzyte);
        zzZ(zzypi.zzYtu().getCount(), zzyq4, zzyte);
    }

    private static void zzZ(int i, zzYQ4 zzyq4, zzYTE zzyte) {
        for (int i2 = 1; i2 < zzyte.zzBx() && zzyq4.getCount() < i; i2++) {
            zzYTE zzyte2 = new zzYTE();
            zzyte2.setHorizontalMerge(2);
            zzyte2.setVerticalMerge(zzyte.getVerticalMerge());
            zzyte2.zzOk(zzyte.zzBx());
            zzyte2.zzOj(zzyte.getRowSpan());
            zzyq4.zzZ(zzyte2);
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzYTE zzyte) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzyq7.zzV(zzyq9ZzYuT)) {
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 16:
                    case 17:
                        zzyq7.zzZ(256, false, "table:table-cell");
                        break;
                    case 6:
                        zzyte.setValue(zzyq9ZzYuT.getValue());
                        break;
                    case 14:
                        zzyte.zzOk(zzyq9ZzYuT.zzb());
                        zzyte.setHorizontalMerge(1);
                        break;
                    case 15:
                        zzyte.zzOj(zzyq9ZzYuT.zzb());
                        zzyte.setVerticalMerge(1);
                        break;
                    default:
                        zzyq7.zzYi("table:table-cell", zzyq9ZzYuT.getLocalName());
                        break;
                }
            }
        }
    }

    private static void zzZ(zzYQ7 zzyq7, Cell cell) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq9ZzYuT.zzj();
        zzYP5.zzZ(zzyq7, zzyq9ZzYuT.getLocalName(), cell);
        zzY(zzyq7, cell);
    }
}
