package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXA extends zzYV1 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("bookmarkStart", "bookmarkEnd", "commentRangeStart", "commentRangeEnd", "permStart", "permEnd", "subDoc", "r", "hyperlink", "smartTag", "del", "ins", "moveFromRangeStart", "moveFromRangeEnd", "moveToRangeStart", "moveToRangeEnd", "moveFrom", "moveTo", "customXmlDelRangeStart", "customXmlInsRangeStart", "customXmlMoveFromRangeStart", "customXmlMoveToRangeStart", "customXmlDelRangeEnd", "customXmlInsRangeEnd", "customXmlMoveFromRangeEnd", "customXmlMoveToRangeEnd", "sdt", "customXml", "oMath", "oMathPara", "altChunk", "numPr", "fldData", "bdo", "dir");
    private zzZWJ zzYNG;
    private zzZXB zzYNH;
    private zzZYI zzYNI;

    public zzZXA(zzZXB zzzxb, zzZWJ zzzwj) {
        this.zzYNH = zzzxb;
        this.zzYNG = zzzwj;
    }

    @Override // com.aspose.words.zzYV1
    public final void zzX(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzYEF zzyef2 = zzyef != null ? (zzYEF) zzyef.zzbn() : new zzYEF();
        switch (zzUR.zzTP(zzyvb.zzZsD().getLocalName())) {
            case 0:
                zzZYE.zzS(zzyvb);
                break;
            case 1:
                zzZYE.zzR(zzyvb);
                break;
            case 2:
                zzZY7.zzQ(zzyvb);
                break;
            case 3:
                zzZY7.zzP(zzyvb);
                break;
            case 4:
                zzYVA.zzD(zzyvb);
                break;
            case 5:
                zzYVA.zzC(zzyvb);
                break;
            case 6:
                zzyvb.zzXB(new SubDocument(zzyvb.getDocument(), com.aspose.words.internal.zzZVR.zz2(((Document) zzyvb.getDocument()).getOriginalFileName(), com.aspose.words.internal.zzZVR.zzWt(zzyvb.zzY9(zzyvb.zzZsD().zzV("id", ""))))));
                break;
            case 7:
                zzZWW.zzZl1().zzW(zzyvb, zzyef2);
                break;
            case 8:
                this.zzYNH.zzY(zzyvb);
                break;
            case 9:
                this.zzYNG.zzY(zzyvb);
                break;
            case 10:
                this.zzYNI.zzX(zzyvb);
                break;
            case 11:
                this.zzYNI.zzW(zzyvb);
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
                this.zzYNI.zzX(zzyvb, false);
                break;
            case 17:
                this.zzYNI.zzX(zzyvb, true);
                break;
            case 18:
            case 19:
                zzZYI.zzV(zzyvb);
                break;
            case 20:
            case 21:
                zzZYI.zzU(zzyvb);
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                zzZYI.zzT(zzyvb);
                break;
            case 26:
                zzZWW.zzZl8().zzY(zzyvb);
                break;
            case 27:
                zzZWW.zzZl6().zzY(zzyvb);
                break;
            case 28:
                zzZX7.zzM(zzyvb);
                break;
            case 29:
                zzZX7.zzN(zzyvb);
                break;
            case 30:
                zzZYJ.zzY(zzyvb);
                break;
            case 31:
                if (zzyvb.zzYz7().getNodeType() == 8) {
                    zzZWW.zzZl3().zzZ(zzyvb, ((Paragraph) zzyvb.zzYz7()).zzZYj());
                }
                break;
            case 32:
                zzYV8.zzB(zzyvb);
                break;
            case 33:
            case 34:
                zzZYF.zzZ(zzyvb, this);
                break;
            default:
                if (!zzZWW.zzZl1().zzL(zzyvb, zzyef2)) {
                    zzY(zzyvb, null);
                }
                break;
        }
    }

    @Override // com.aspose.words.zzYV1
    public final void zzY(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzyu4ZzZsD.zzj();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            zzX(zzyvb, zzyef);
        }
    }

    public final void zzZ(zzZYI zzzyi) {
        this.zzYNI = zzzyi;
    }
}
