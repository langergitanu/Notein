package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.miui.penengine.p596e.C18773h;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRJ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(ContextChain.TAG_PRODUCT, C18773h.f57233c, "list", "table", "section", "tracked-changes", "change", "change-start", "change-end", "user-field-decls", "region-center", "region-left", "region-right", "alphabetical-index-auto-mark-file", "dde-connection-decls", "index-title", "sequence-decls", "variable-decls");

    private static void zzW(zzYQ7 zzyq7, String str) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if ("display".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(256, false, str);
            }
        }
    }

    public static void zzZ(zzYQ7 zzyq7, zzYR0 zzyr0, String str) throws Exception {
        zzYQK zzyqk = (zzYQK) com.aspose.words.internal.zzZKW.zzZ(zzyq7.zzYuS().zzY(zzyr0.zzYvy(), null, zzyq7.zzYuO(), true), zzYQK.class);
        if (zzyqk == null) {
            return;
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzyr0.zzYvx()) && com.aspose.words.internal.zzZKN.zzW(str, "-left", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            return;
        }
        HeaderFooter headerFooter = new HeaderFooter(zzyq7.getDocument(), zzZ(zzyr0, str));
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        zzYRI zzyriZzYvf = com.aspose.words.internal.zzZKN.zzS(str, "header", i) ? zzyqk.zzYvf() : zzyqk.zzYve();
        zzYCZ zzyczZzYvR = zzyriZzYvf != null ? zzyriZzYvf.zzYvR() : null;
        if (com.aspose.words.internal.zzZKN.zzW(str, "-left", i)) {
            zzyq7.getDocument().zzZpV().zzYVX = true;
        }
        if (zzyczZzYvR != null) {
            zzyczZzYvR.zzY(zzyr0.zzYBx().zzYvR());
        }
        if (com.aspose.words.internal.zzZKN.zzW(str, "-first", i)) {
            zzyr0.zzYBx().getPageSetup().setDifferentFirstPageHeaderFooter(true);
        }
        zzW(zzyq7, str);
        zzZ(zzyq7, zzyr0, str, headerFooter);
        headerFooter.isLinkedToPrevious(false);
        zzyr0.zzYBx().getHeadersFooters().add(headerFooter);
    }

    private static void zzZ(zzYQ7 zzyq7, zzYR0 zzyr0, String str, HeaderFooter headerFooter) throws Exception {
        zzyq7.zzYuw().clear();
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ(str)) {
            String localName = zzyq9ZzYuT.getLocalName();
            if (zzYOU.zzDJ(localName)) {
                if (!zzYP2.zzY(zzyq7, headerFooter, zzyr0, str)) {
                    zzyq7.zzYuT().zzk();
                }
            } else {
                switch (zzUR.zzTP(localName)) {
                    case 0:
                    case 1:
                        zzYQC.zzZ(zzyq7, localName, headerFooter);
                        break;
                    case 2:
                        zzYR8.zzZ(zzyq7, headerFooter, null);
                        break;
                    case 3:
                        zzYPC.zzV(zzyq7, headerFooter);
                        break;
                    case 4:
                        zzYP5.zzZ(zzyq7, "section", headerFooter);
                        break;
                    case 5:
                        zzYOX.zzJ(zzyq7);
                        break;
                    case 6:
                        Paragraph paragraph = new Paragraph(zzyq7.getDocument());
                        headerFooter.appendChild(paragraph);
                        zzYT9.zzZ(zzyq7, paragraph);
                        break;
                    case 7:
                        zzYT9.zzY(zzyq7);
                        break;
                    case 8:
                        zzYT9.zzX(zzyq7);
                        break;
                    case 9:
                        zzYOV.zzZO(zzyq7);
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        zzyq7.zzZ(1, true, str);
                        break;
                    default:
                        zzyq9ZzYuT.zzk();
                        break;
                }
            }
        }
    }

    private static int zzZ(zzYR0 zzyr0, String str) {
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        boolean zZzS = com.aspose.words.internal.zzZKN.zzS(str, "header", i);
        return com.aspose.words.internal.zzZKN.zzW(str, "-left", i) ? zZzS ? 0 : 2 : (com.aspose.words.internal.zzZYD.zzXk(zzyr0.zzYvx()) || com.aspose.words.internal.zzZKN.zzW(str, "-first", i)) ? zZzS ? 4 : 5 : zZzS ? 1 : 3;
    }
}
