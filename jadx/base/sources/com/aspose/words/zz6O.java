package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz6O extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("id", "tgtFrame", "tooltip", "action", "endSnd", "highlightClick", "history", "invalidUrl", "extLst", "snd");
    private zzYU4 zzZ7n;
    private zzZXT zzZfi;

    private zz6O(zzZXT zzzxt) {
        this.zzZfi = zzzxt;
        this.zzZ7n = zzzxt.zzZsD();
    }

    public static zz6P zz7(zzZXT zzzxt) throws Exception {
        return new zz6O(zzzxt).zzZzT();
    }

    private zz6P zzZzT() throws Exception {
        String localName = this.zzZ7n.getLocalName();
        zz6P zz6p = new zz6P();
        while (this.zzZ7n.zzi()) {
            int iZzTP = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP == 0) {
                zz6p.setId(this.zzZfi.zzY9(this.zzZ7n.getValue()));
            } else if (iZzTP == 1) {
                zz6p.zzOv(this.zzZ7n.getValue());
            } else if (iZzTP != 2) {
                zz39.zzI(this.zzZ7n);
            } else {
                zz6p.zzOu(this.zzZ7n.getValue());
            }
        }
        while (this.zzZ7n.zzQ(localName)) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) != 8) {
                zz39.zzL(this.zzZ7n);
            } else {
                zz6p.setExtensions(zz81.zzd(this.zzZfi));
            }
        }
        return zz6p;
    }
}
