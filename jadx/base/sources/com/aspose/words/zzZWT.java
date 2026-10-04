package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWT {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("rsidTr", "paraId", "textId", "tblPrEx", "trPr", "tc", "bookmarkStart", "bookmarkEnd", "commentRangeStart", "commentRangeEnd", "permStart", "permEnd", "moveFromRangeStart", "moveFromRangeEnd", "moveToRangeStart", "moveToRangeEnd", "customXmlDelRangeStart", "customXmlInsRangeStart", "customXmlMoveFromRangeStart", "customXmlMoveToRangeStart", "customXmlDelRangeEnd", "customXmlInsRangeEnd", "customXmlMoveFromRangeEnd", "customXmlMoveToRangeEnd", "sdt", "customXml", ContextChain.TAG_PRODUCT);

    private static void zzJ(zzYVB zzyvb) throws Exception {
        Cell cell = new Cell(zzyvb.getDocument());
        zzyvb.zzT(cell);
        zzZWW.zzZl2().zzF(zzyvb);
        zzyvb.zztj(7);
        cell.getFirstParagraph();
        cell.getLastParagraph();
        zzyvb.zzZd(cell.getFirstParagraph());
        cell.remove();
    }

    public static void zzV(zzYVB zzyvb, zzY6G zzy6g) throws Exception {
        switch (zzUR.zzTP(zzyvb.zzZsD().getLocalName())) {
            case 3:
                zzZWE.zzR(zzyvb, zzy6g);
                break;
            case 4:
                zzZWU.zzX(zzyvb, zzy6g);
                break;
            case 5:
                zzZWW.zzZl0().zzY(zzyvb);
                if (zzyvb.zzYz7() != null && zzyvb.zzYz7().getNodeType() == 6) {
                    zzyvb.zzS(((Row) zzyvb.zzYz7()).getLastCell());
                    break;
                }
                break;
            case 6:
                zzZYE.zzS(zzyvb);
                break;
            case 7:
                zzZYE.zzR(zzyvb);
                break;
            case 8:
                zzZY7.zzQ(zzyvb);
                break;
            case 9:
                zzZY7.zzP(zzyvb);
                break;
            case 10:
                zzYVA.zzD(zzyvb);
                break;
            case 11:
                zzYVA.zzC(zzyvb);
                break;
            case 12:
                zzZYI.zzZ(zzyvb, true);
                break;
            case 13:
                zzZYI.zzY(zzyvb, true);
                break;
            case 14:
                zzZYI.zzZ(zzyvb, false);
                break;
            case 15:
                zzZYI.zzY(zzyvb, false);
                break;
            case 16:
            case 17:
                zzZYI.zzV(zzyvb);
                break;
            case 18:
            case 19:
                zzZYI.zzU(zzyvb);
                break;
            case 20:
            case 21:
            case 22:
            case 23:
                zzZYI.zzT(zzyvb);
                break;
            case 24:
                zzZWW.zzV(zzy6g).zzY(zzyvb);
                break;
            case 25:
                zzZWW.zzT(zzy6g).zzY(zzyvb);
                break;
            case 26:
                zzJ(zzyvb);
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

    public static void zzX(zzYVB zzyvb, zzY6G zzy6g) throws Exception {
        zzY6G zzy6g2 = (zzY6G) zzy6g.zzbn();
        Row row = new Row(zzyvb.getDocument(), zzy6g2);
        zzyvb.zzT(row);
        if (!zzyvb.zzYyZ().zzZrB()) {
            zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
            while (zzyu4ZzZsD.zzi()) {
                int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
                if (iZzTP == 0) {
                    int iZzGV = zzYU3.zzGV(zzyu4ZzZsD.getValue());
                    if (iZzGV != Integer.MIN_VALUE) {
                        zzy6g2.zzQ(4400, Integer.valueOf(iZzGV));
                    }
                } else if (iZzTP == 1) {
                    row.zzqu(zzYU3.zzGV(zzyu4ZzZsD.getValue()));
                } else if (iZzTP == 2) {
                    row.zzqt(zzYU3.zzGV(zzyu4ZzZsD.getValue()));
                }
            }
        }
        zzW(zzyvb, zzy6g2);
        zzyvb.zzS(row);
        if (zzyvb.zzXUg.getCount() > 0) {
            zzyvb.zzXUg.zzY(zzy6g2);
            zzyvb.zzXUg.clear();
        }
        zzyvb.zztj(6);
        if (zzyvb.zzYyZ().zzZrB()) {
            return;
        }
        zzYUA.zzZ(row, zzyvb.zzXUk);
    }
}
