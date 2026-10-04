package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes6.dex */
final class zzZX0 extends zzYUT {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("pPr", "rPr", "paraId", "textId", "rsidDel", "rsidP", "rsidR", "rsidRDefault", "rsidRPr");
    private zzZX1 zzYNx;
    private zzZXA zzYPn;

    public zzZX0(zzZX1 zzzx1, zzZXA zzzxa) {
        this.zzYNx = zzzx1;
        this.zzYPn = zzzxa;
    }

    private static void zzZ(zzYVB zzyvb, Paragraph paragraph) {
        int iZzGV;
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 2) {
                int iZzGV2 = zzYU3.zzGV(zzyu4ZzZsD.getValue());
                if (iZzGV2 > 0) {
                    ((zzZXT) com.aspose.words.internal.zzZKW.zzZ(zzyvb, zzZXT.class)).zzZ(iZzGV2, paragraph);
                }
            } else if (iZzTP == 3) {
                paragraph.zzqt(zzYU3.zzGV(zzyu4ZzZsD.getValue()));
            } else if (iZzTP == 5) {
                int iZzGV3 = zzYU3.zzGV(zzyu4ZzZsD.getValue());
                if (iZzGV3 != Integer.MIN_VALUE) {
                    paragraph.zzZYj().zzQ(1580, Integer.valueOf(iZzGV3));
                }
            } else if (iZzTP == 6) {
                int iZzGV4 = zzYU3.zzGV(zzyu4ZzZsD.getValue());
                if (iZzGV4 != Integer.MIN_VALUE) {
                    paragraph.zzYp5().zzQ(40, Integer.valueOf(iZzGV4));
                }
            } else if (iZzTP == 7) {
                int iZzGV5 = zzYU3.zzGV(zzyu4ZzZsD.getValue());
                if (iZzGV5 != Integer.MIN_VALUE) {
                    zzyu4ZzZsD.zzsX(iZzGV5);
                }
            } else if (iZzTP == 8 && (iZzGV = zzYU3.zzGV(zzyu4ZzZsD.getValue())) != Integer.MIN_VALUE) {
                paragraph.zzYp5().zzQ(30, Integer.valueOf(iZzGV));
            }
        }
    }

    @Override // com.aspose.words.zzYUT
    public final boolean zzL(zzYVB zzyvb) throws Exception {
        Paragraph paragraph = new Paragraph(zzyvb.getDocument());
        zzyvb.zzT(paragraph);
        zzYUN.zzM(zzyvb, new zzYEF());
        zzyvb.zzYz9();
        zzyvb.zzYBZ();
        zzyvb.zzXA(paragraph);
        if (zzyvb.zzXUh.getCount() > 0) {
            zzyvb.zzXUh.zzY(paragraph.zzZYj());
            zzyvb.zzXUf.zzY(paragraph.zzYp5());
            zzyvb.zzXUh.clear();
            zzyvb.zzXUf.clear();
        }
        if (!zzyvb.zzYyZ().zzZrB()) {
            zzZ(zzyvb, paragraph);
        }
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzyu4ZzZsD.zzj();
        boolean zZzY = false;
        while (zzyu4ZzZsD.zzQ(ContextChain.TAG_PRODUCT)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                zZzY = this.zzYNx.zzY(zzyvb, paragraph.zzZYj(), paragraph.zzYp5());
            } else if (iZzTP != 1) {
                this.zzYPn.zzF(zzyvb);
            } else {
                zzZWW.zzZl1().zzL(zzyvb, paragraph.zzYp5());
            }
        }
        zzyvb.zzS(paragraph.zzZYj(), 1);
        zzyu4ZzZsD.zzsX(0);
        zzyvb.zzYz7();
        zzyu4ZzZsD.zzXy(zzyvb.zzYz7());
        zzZMI.zzi((Paragraph) zzyvb.zzYz7());
        zzyvb.zztj(8);
        return zZzY;
    }
}
