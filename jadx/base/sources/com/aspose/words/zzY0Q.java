package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0Q {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("tblPr", "tblGrid", TranslateLanguage.TURKISH, "annotation", "permStart", "permEnd", "tbl", ContextChain.TAG_PRODUCT, "sectPr");

    private static void zzM(zzYVB zzyvb, zzY6G zzy6g) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
        if (iZzTP == 6) {
            zzj(zzyvb);
            zzY(zzyvb);
            zzyvb.zzT(new Table(zzyvb.getDocument()));
        } else if (iZzTP == 7) {
            zzj(zzyvb);
            zzY11.zzXSx().zzF(zzyvb);
            zzyvb.zzT(new Table(zzyvb.getDocument()));
        } else {
            if (iZzTP == 8) {
                zzyu4ZzZsD.zzYyH();
                return;
            }
            zzyvb.zzZ(16777216, 13, com.aspose.words.internal.zzZKN.format("Unexpected element '{0}:{1}' at table level while reading WordML file.", zzyu4ZzZsD.getPrefix(), zzyu4ZzZsD.getLocalName()));
            String localName = zzyu4ZzZsD.getLocalName();
            while (zzyu4ZzZsD.zzQ(localName)) {
                zzV(zzyvb, zzy6g);
            }
        }
    }

    private static void zzN(zzYVB zzyvb, zzY6G zzy6g) throws Exception {
        while (zzyvb.zzZsD().zzQ("tbl")) {
            zzV(zzyvb, zzy6g);
        }
    }

    private static void zzV(zzYVB zzyvb, zzY6G zzy6g) throws Exception {
        zzYU4 zzyu4ZzZsD;
        do {
            zzyu4ZzZsD = zzyvb.zzZsD();
            zzyu4ZzZsD.zzj();
            if (!zzyvb.zzZmj()) {
                int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
                if (iZzTP == 0) {
                    zzY0R.zzY(zzy6g, zzyvb);
                    return;
                }
                if (iZzTP == 1) {
                    if (zzyvb.zzYyZ().zzZrB()) {
                        zzyu4ZzZsD.zzYyH();
                        return;
                    } else {
                        zzYUA.zzW(zzyu4ZzZsD, ((Table) zzyvb.zzYz7()).zzZYf(), null);
                        return;
                    }
                }
                if (iZzTP == 2) {
                    zzY0Z.zzX(zzyvb, zzy6g);
                    return;
                }
                if (iZzTP == 3) {
                    zzY1U.zzY(zzyvb);
                    return;
                }
                if (iZzTP == 4) {
                    zzYVA.zzD(zzyvb);
                    return;
                } else if (iZzTP != 5) {
                    zzM(zzyvb, zzy6g);
                    return;
                } else {
                    zzYVA.zzC(zzyvb);
                    return;
                }
            }
            zzyvb.zzZ(1, 13, "Violation of i4i's patent #5,787,449. Custom xml will no longer be supported.");
        } while (zzyu4ZzZsD.zzQ(zzyu4ZzZsD.getLocalName()));
        zzj(zzyvb);
        zzyvb.zzYz7().zzA(new Paragraph(zzyvb.getDocument()));
        zzk(zzyvb);
    }

    public static void zzY(zzYVB zzyvb) throws Exception {
        zzk(zzyvb);
        zzN(zzyvb, new zzY6G());
        zzj(zzyvb);
    }

    private static void zzj(zzYVB zzyvb) throws Exception {
        Table table = (Table) zzyvb.zzYz7();
        zzyvb.zztj(5);
        if (table.getFirstRow() == null) {
            table.remove();
        } else {
            if (zzyvb.zzYyZ().zzZrB()) {
                return;
            }
            zzyvb.zzj(table);
        }
    }

    private static void zzk(zzYVB zzyvb) {
        zzyvb.zzT(new Table(zzyvb.getDocument()));
    }
}
