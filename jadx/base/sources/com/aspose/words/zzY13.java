package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes6.dex */
final class zzY13 extends zzYUT {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("pPr", "listPr", "permStart", "permEnd", "br", ContextChain.TAG_PRODUCT, "tbl");
    private zzY1B zzWV5;
    private zzY14 zzWV7;

    public zzY13(zzY14 zzy14, zzY1B zzy1b) {
        this.zzWV7 = zzy14;
        this.zzWV5 = zzy1b;
    }

    private boolean zzY(zzYVB zzyvb, Paragraph paragraph) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        if (zzyvb.zzZmj() && !zzp(zzyvb)) {
            zzyvb.zzZ(1, 13, "Violation of i4i's patent #5,787,449. Custom xml will no longer be supported.");
            return false;
        }
        switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
            case 0:
                break;
            case 1:
                this.zzWV7.zzW(zzyu4ZzZsD, paragraph.zzZYj());
                break;
            case 2:
                zzYVA.zzD(zzyvb);
                break;
            case 3:
                zzYVA.zzC(zzyvb);
                break;
            case 4:
                Run run = new Run(zzyvb.getDocument());
                run.setText(Character.toString(zzYUN.zzR(zzyu4ZzZsD, run.zzZYh())));
                zzyvb.zzXB(run);
                break;
            case 5:
            case 6:
                zzo(zzyvb);
                break;
            default:
                this.zzWV5.zzF(zzyvb);
                break;
        }
        return false;
    }

    private void zzo(zzYVB zzyvb) throws Exception {
        CompositeNode compositeNodeZzYz7 = zzyvb.zzYz7();
        zzyvb.zzR(new Body(zzyvb.getDocument()));
        int iZzTP = zzUR.zzTP(zzyvb.zzZsD().getLocalName());
        if (iZzTP == 5) {
            zzL(zzyvb);
        } else {
            if (iZzTP != 6) {
                throw new IllegalStateException("Unexpected tagName.");
            }
            zzY0Q.zzY(zzyvb);
        }
        zzyvb.zzXC(zzyvb.zzYz7().getFirstChild());
        zzyvb.zzR(compositeNodeZzYz7);
    }

    private static boolean zzp(zzYVB zzyvb) {
        if (zzyvb.zzZmv()) {
            return "oMathPara".equals(zzyvb.zzZsD().getLocalName()) || "oMath".equals(zzyvb.zzZsD().getLocalName());
        }
        return false;
    }

    @Override // com.aspose.words.zzYUT
    public final boolean zzL(zzYVB zzyvb) throws Exception {
        Paragraph paragraph = new Paragraph(zzyvb.getDocument());
        zzyvb.zzT(paragraph);
        zzyvb.zzYz9();
        zzyvb.zzYBZ();
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        boolean z = false;
        while (zzyu4ZzZsD.zzQ(ContextChain.TAG_PRODUCT)) {
            if (zzY(zzyvb, paragraph)) {
                z = true;
            }
        }
        zzZMI.zzi((Paragraph) zzyvb.zzYz7());
        zzyvb.zzS(paragraph.zzZYj(), 1);
        zzyvb.zztj(8);
        return z;
    }
}
