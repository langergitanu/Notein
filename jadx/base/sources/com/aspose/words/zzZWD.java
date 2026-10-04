package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWD {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("tblPr", "tblGrid", ContextChain.TAG_PRODUCT, TranslateLanguage.TURKISH, "bookmarkStart", "bookmarkEnd", "commentRangeStart", "commentRangeEnd", "permStart", "permEnd", "customXmlDelRangeStart", "customXmlInsRangeStart", "customXmlMoveFromRangeStart", "customXmlMoveToRangeStart", "customXmlDelRangeEnd", "customXmlInsRangeEnd", "customXmlMoveFromRangeEnd", "customXmlMoveToRangeEnd", "sdt", "customXml", "moveFromRangeStart", "moveFromRangeEnd", "moveToRangeStart", "moveToRangeEnd");

    private static void zzE(zzYVB zzyvb) throws Exception {
        zzyvb.zztj(5);
        new zzZX0(new zzZX1(new zzZWS(), new zzZWM()), new zzZXA(new zzZXB(), new zzZWJ())).zzL(zzyvb);
        zzyvb.zzT(new Table(zzyvb.getDocument()));
    }

    public static void zzV(zzYVB zzyvb, zzY6G zzy6g) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYO3 zzyo3ZzZqn = zzyvb.zzZqn();
        switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
            case 0:
                zzZWE.zzU(zzyvb, zzy6g);
                break;
            case 1:
                if (!zzyvb.zzYyZ().zzZrB()) {
                    zzYUA.zzW(zzyu4ZzZsD, ((Table) zzyvb.zzYz7()).zzZYf(), zzyo3ZzZqn);
                } else {
                    zzyu4ZzZsD.zzYyH();
                }
                break;
            case 2:
                zzE(zzyvb);
                break;
            case 3:
                zzZWT.zzX(zzyvb, zzy6g);
                break;
            case 4:
                zzZYE.zzS(zzyvb);
                break;
            case 5:
                zzZYE.zzR(zzyvb);
                break;
            case 6:
                zzZY7.zzQ(zzyvb);
                break;
            case 7:
                zzZY7.zzP(zzyvb);
                break;
            case 8:
                zzYVA.zzD(zzyvb);
                break;
            case 9:
                zzYVA.zzC(zzyvb);
                break;
            case 10:
            case 11:
                zzZYI.zzV(zzyvb);
                break;
            case 12:
            case 13:
                zzZYI.zzU(zzyvb);
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                zzZYI.zzT(zzyvb);
                break;
            case 18:
                zzZWW.zzW(zzy6g).zzY(zzyvb);
                break;
            case 19:
                CompositeNode compositeNodeZzYz7 = zzyvb.zzYz7();
                int count = compositeNodeZzYz7.getCount();
                zzZWW.zzU(zzy6g).zzY(zzyvb);
                if (compositeNodeZzYz7 == zzyvb.zzYz7() && count == compositeNodeZzYz7.getCount()) {
                    Table table = (Table) zzyvb.zzYz7();
                    zzyvb.zztj(5);
                    zzyvb.zzT(new Paragraph(zzyvb.getDocument()));
                    zzyvb.zztj(8);
                    Table table2 = new Table(zzyvb.getDocument());
                    zzZ(table, table2);
                    zzyvb.zzT(table2);
                    break;
                }
                break;
            case 20:
                zzZYI.zzZ(zzyvb, true);
                break;
            case 21:
                zzZYI.zzY(zzyvb, true);
                break;
            case 22:
                zzZYI.zzZ(zzyvb, false);
                break;
            case 23:
                zzZYI.zzY(zzyvb, false);
                break;
            default:
                zzW(zzyvb, zzy6g);
                break;
        }
    }

    public static void zzW(zzYVB zzyvb, zzY6G zzy6g) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzyu4ZzZsD.zzj();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            zzV(zzyvb, zzy6g);
        }
    }

    public static void zzY(zzYVB zzyvb) throws Exception {
        zzyvb.zzT(new Table(zzyvb.getDocument()));
        zzY6G zzy6g = new zzY6G();
        zzy6g.zzXXq();
        Table table = (Table) zzyvb.zzYz7();
        zzyvb.zzXA(table);
        zzW(zzyvb, zzy6g);
        zzyvb.zztj(5);
        if (zzyvb.zzYyZ().zzZrB()) {
            return;
        }
        zzyvb.zzj(table);
    }

    private static void zzZ(Table table, Table table2) {
        Object obj = table.zzZYf().get(5103);
        if (obj != null) {
            com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
            zzdb.zzX((com.aspose.words.internal.zzDB) obj);
            table2.zzZYf().zzQ(5103, zzdb);
        }
        Object obj2 = table.zzZYf().get(5107);
        if (obj2 != null) {
            table2.zzZYf().zzQ(5107, ((zzZCY) obj2).deepCloneComplexAttr());
        }
    }
}
