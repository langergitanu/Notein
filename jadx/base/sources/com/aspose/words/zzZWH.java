package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWH extends zzYUE {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(ContextChain.TAG_PRODUCT, "tbl", "bookmarkStart", "bookmarkEnd", "commentRangeStart", "commentRangeEnd", "permStart", "permEnd", "moveFromRangeStart", "moveFromRangeEnd", "moveToRangeStart", "moveToRangeEnd", "customXmlDelRangeStart", "customXmlInsRangeStart", "customXmlMoveFromRangeStart", "customXmlMoveToRangeStart", "customXmlDelRangeEnd", "customXmlInsRangeEnd", "customXmlMoveFromRangeEnd", "customXmlMoveToRangeEnd", "sdt", "customXml", "altChunk", "br", "pict", "drawing", "sectPr");
    private zzZX0 zzYNa;

    public zzZWH(zzZX0 zzzx0) {
        this.zzYNa = zzzx0;
    }

    @Override // com.aspose.words.zzYUE
    public final void zzF(zzYVB zzyvb) throws Exception {
        CompositeNode compositeNodeZzYz7;
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        boolean zZzL = false;
        switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
            case 0:
                zZzL = this.zzYNa.zzL(zzyvb);
                break;
            case 1:
                zzZWD.zzY(zzyvb);
                break;
            case 2:
                zzZYE.zzS(zzyvb);
                break;
            case 3:
                zzZYE.zzR(zzyvb);
                break;
            case 4:
                zzZY7.zzQ(zzyvb);
                break;
            case 5:
                zzZY7.zzP(zzyvb);
                break;
            case 6:
                zzYVA.zzD(zzyvb);
                break;
            case 7:
                zzYVA.zzC(zzyvb);
                break;
            case 8:
                zzZYI.zzZ(zzyvb, true);
                break;
            case 9:
                zzZYI.zzY(zzyvb, true);
                break;
            case 10:
                zzZYI.zzZ(zzyvb, false);
                break;
            case 11:
                zzZYI.zzY(zzyvb, false);
                break;
            case 12:
            case 13:
                zzZYI.zzV(zzyvb);
                break;
            case 14:
            case 15:
                zzZYI.zzU(zzyvb);
                break;
            case 16:
            case 17:
            case 18:
            case 19:
                zzZYI.zzT(zzyvb);
                break;
            case 20:
                zzZWW.zzZl7().zzY(zzyvb);
                break;
            case 21:
                zzZWW.zzZl5().zzY(zzyvb);
                break;
            case 22:
                zzZYJ.zzY(zzyvb);
                break;
            case 23:
                zzyu4ZzZsD.zzYyz().append(zzYUN.zzR(zzyu4ZzZsD, new zzYEF()));
                break;
            case 24:
            case 25:
                if (zzyvb.zzYz7().zzT(new Run(zzyvb.getDocument()))) {
                    compositeNodeZzYz7 = null;
                } else {
                    compositeNodeZzYz7 = zzyvb.zzYz7();
                    zzyvb.zzR(new Paragraph(zzyvb.getDocument()));
                }
                zzZWW.zzZl1().zzL(zzyvb, new zzYEF());
                zzyvb.zzh(zzyvb.zzYz7().getFirstChild(), compositeNodeZzYz7);
                if (compositeNodeZzYz7 != null) {
                    zzyvb.zzR(compositeNodeZzYz7);
                }
                break;
            case 26:
                zzyvb.zzSA(false);
                break;
            default:
                zzG(zzyvb);
                break;
        }
        if (zZzL) {
            if (zzyvb.zzYz7().getNodeType() == 3) {
                zzyvb.zzYz3();
            } else {
                zzyvb.zzTG("Unexpected section break, ignored.");
            }
        }
    }

    @Override // com.aspose.words.zzYUE
    public final void zzG(zzYVB zzyvb) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzyu4ZzZsD.zzj();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            zzF(zzyvb);
        }
    }
}
