package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0T extends zzYUE {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(ContextChain.TAG_PRODUCT, "tbl", "annotation", "sectPr", "binData", "pict", "permStart", "permEnd", "br", "ftr", "hdr");
    private zzY1B zzWV5;

    public zzY0T(zzY1B zzy1b) {
        this.zzWV5 = zzy1b;
    }

    private void zzl(zzYVB zzyvb) throws Exception {
        CompositeNode compositeNodeZzYz7 = zzyvb.zzYz7();
        zzyvb.zzR(new Paragraph(zzyvb.getDocument()));
        this.zzWV5.zzF(zzyvb);
        zzyvb.zzh(zzyvb.zzYz7().getFirstChild(), compositeNodeZzYz7);
        zzyvb.zzR(compositeNodeZzYz7);
    }

    @Override // com.aspose.words.zzYUE
    public final void zzF(zzYVB zzyvb) throws Exception {
        zzY(zzyvb, null);
    }

    @Override // com.aspose.words.zzYUE
    public final void zzG(zzYVB zzyvb) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzyu4ZzZsD.zzj();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            zzY(zzyvb, null);
        }
    }

    public final void zzY(zzYVB zzyvb, zzZ3Z zzz3z) throws Exception {
        boolean zZzL;
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        if (zzyvb.zzZmj()) {
            zzyvb.zzZ(1, 13, "Violation of i4i's patent #5,787,449. Custom xml will no longer be supported.");
        } else {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 0:
                    zZzL = zzY11.zzXSv().zzL(zzyvb);
                    break;
                case 1:
                    zzY0Q.zzY(zzyvb);
                    zZzL = false;
                    break;
                case 2:
                    zzY1U.zzY(zzyvb);
                    zZzL = false;
                    break;
                case 3:
                    zzyvb.zzSA(true);
                    zZzL = false;
                    break;
                case 4:
                    zzyvb.zzZml();
                    zZzL = false;
                    break;
                case 5:
                    zzl(zzyvb);
                    zZzL = false;
                    break;
                case 6:
                    zzYVA.zzD(zzyvb);
                    zZzL = false;
                    break;
                case 7:
                    zzYVA.zzC(zzyvb);
                    zZzL = false;
                    break;
                case 8:
                    Run run = new Run(zzyvb.getDocument());
                    run.setText(Character.toString(zzYUN.zzR(zzyu4ZzZsD, run.zzZYh())));
                    zzyvb.zzh(run, null);
                    zZzL = false;
                    break;
                case 9:
                case 10:
                    zzY0U.zzm(zzyvb);
                    zZzL = false;
                    break;
                default:
                    zzG(zzyvb);
                    zZzL = false;
                    break;
            }
            if (zzz3z != null) {
                zzz3z.zzYX(zzyu4ZzZsD.zz5());
            }
            if (zZzL) {
                zzyvb.zzYz3();
            }
        }
        zzyvb.zzYz8();
    }
}
