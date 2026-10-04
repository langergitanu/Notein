package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZY1 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("customXmlPr");
    private zzY6G zzYP8;
    private zzZXA zzYPn;
    private int zzYw;

    public zzZY1(zzZXA zzzxa, int i) {
        this(zzzxa, i, null);
    }

    private void zzO(zzYVB zzyvb) throws Exception {
        int i = this.zzYw;
        if (i == 1) {
            this.zzYPn.zzF(zzyvb);
            return;
        }
        if (i == 2) {
            zzZWW.zzZl2().zzF(zzyvb);
        } else if (i == 3) {
            zzZWD.zzV(zzyvb, this.zzYP8);
        } else {
            if (i != 4) {
                throw new IllegalStateException("Unexpected custom XML markup level.");
            }
            zzZWT.zzV(zzyvb, this.zzYP8);
        }
    }

    public final void zzY(zzYVB zzyvb) throws Exception {
        zzyvb.zzZ(1, 9, "Violation of i4i's patent #5,787,449. Custom xml will no longer be supported.");
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzyu4ZzZsD.zzj();
        while (zzyu4ZzZsD.zzQ("customXml")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 0) {
                zzO(zzyvb);
            }
        }
    }

    public zzZY1(zzZXA zzzxa, int i, zzY6G zzy6g) {
        this.zzYPn = zzzxa;
        this.zzYw = i;
        this.zzYP8 = zzy6g;
    }
}
