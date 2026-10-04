package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBD {
    private com.aspose.words.internal.zzZOX zzXec;
    private zzU0 zzYUi;
    private zzZRA zzYUj;
    private com.aspose.words.internal.zzZOX zzYUn;

    private zzYBD() {
    }

    private String zzVK(int i, int i2) throws Exception {
        StringBuilder sb = new StringBuilder(i);
        int iZzXL = this.zzYUj.zzXL(i2, 0);
        int iZzMT = this.zzYUi.zzMT(iZzXL);
        if (iZzMT == -1) {
            return "";
        }
        int start = iZzXL - this.zzYUi.zzMS(iZzMT).zzZYG().getStart();
        while (i > 0 && iZzMT < this.zzYUi.getCount()) {
            zzTZ zztzZzMS = this.zzYUi.zzMS(iZzMT);
            int i3 = zztzZzMS.zzZtf;
            int length = zztzZzMS.zzZYG().getLength();
            if (start > 0) {
                i3 += (zztzZzMS.zzZte ? 2 : 1) * start;
                length -= start;
            }
            this.zzYUn.zzq().zzH(i3);
            if (length > i) {
                length = i;
            }
            sb.append((zztzZzMS.zzZte ? this.zzYUn : this.zzXec).zzQG(length));
            i -= length;
            iZzMT++;
            start = 0;
        }
        return sb.toString();
    }

    private boolean zzW(com.aspose.words.internal.zzZOP zzzop, Document document) throws Exception {
        com.aspose.words.internal.zzSP zzsp = new com.aspose.words.internal.zzSP(zzzop);
        com.aspose.words.internal.zzSK zzskZzr = zzsp.zzS9().zzr("WordDocument");
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzskZzr, com.aspose.words.internal.zzZO0.zzhU());
        zzZRA zzzra = new zzZRA(zzzox, null, 0);
        this.zzYUj = zzzra;
        if (zzzra.zzZgY()) {
            return false;
        }
        zzZRA zzzra2 = this.zzYUj;
        if (zzzra2.zzYHs) {
            return false;
        }
        zzzra2.zzM(zzzox, 0);
        this.zzYUn = new com.aspose.words.internal.zzZOX(zzskZzr, zzZZ7.zzWB(true));
        this.zzXec = new com.aspose.words.internal.zzZOX(zzskZzr, zzZZ7.zzWB(false));
        this.zzYUi = new zzU0(this.zzYUj, new com.aspose.words.internal.zzZOX(zzsp.zzS9().zzr(this.zzYUj.zzZgZ())), false);
        document.appendChild(new Section(document));
        document.getFirstSection().appendChild(new Body(document));
        Body body = document.getFirstSection().getBody();
        body.appendParagraph(zzVK(this.zzYUj.zzYGY, 0));
        body.appendParagraph(zzVK(this.zzYUj.zzYGX, 1));
        body.appendParagraph(zzVK(this.zzYUj.zzYGW, 2));
        body.appendParagraph(zzVK(this.zzYUj.zzYGU, 3));
        body.appendParagraph(zzVK(this.zzYUj.zzYGT, 4));
        body.appendParagraph(zzVK(this.zzYUj.zzYGS, 5));
        body.appendParagraph(zzVK(this.zzYUj.zzYGR, 6));
        new zzZZD(null).zzZ(zzsp.zzS9().zzs("\u0005SummaryInformation"), zzsp.zzS9().zzs("\u0005DocumentSummaryInformation"), document.getBuiltInDocumentProperties(), document.getCustomDocumentProperties());
        return true;
    }

    public static boolean zzX(com.aspose.words.internal.zzZOP zzzop, Document document) throws Exception {
        return new zzYBD().zzW(zzzop, document);
    }
}
