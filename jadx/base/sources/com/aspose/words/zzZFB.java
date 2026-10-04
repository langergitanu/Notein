package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFB {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("left", "auto", "center", "line-edge", "right", "distribute-letter", "distribute-space");
    private boolean zzYmt = false;
    private zzYEJ zzYmu = new zzYEJ();
    private zzZK3 zzYqv;
    private DocumentBuilder zzZwh;

    public zzZFB(DocumentBuilder documentBuilder, zzPS zzps, boolean z) {
        this.zzZwh = documentBuilder;
        this.zzYqv = new zzZK3(documentBuilder, z);
        int iZzTP = zzUR.zzTP(zzps.zzSF("ruby-align"));
        if (iZzTP == 0) {
            this.zzYmu.zzZGm = 3;
            return;
        }
        if (iZzTP == 1 || iZzTP == 2 || iZzTP == 3) {
            this.zzYmu.zzZGm = 0;
            return;
        }
        if (iZzTP == 4) {
            this.zzYmu.zzZGm = 4;
        } else if (iZzTP != 5) {
            this.zzYmu.zzZGm = 2;
        } else {
            this.zzYmu.zzZGm = 1;
        }
    }

    public final void flush() throws Exception {
        if (this.zzYmu.zzYe6().getCount() <= 0 || this.zzYmu.zzYe7().getCount() <= 0) {
            this.zzYqv.zzZ4o();
            return;
        }
        Run run = new Run(this.zzZwh.getDocument(), "", this.zzZwh.zzZpG());
        run.zzZYh().zzQ(885, this.zzYmu);
        this.zzZwh.insertNode(run);
    }

    public final boolean isEmpty() {
        return this.zzYqv.isEmpty();
    }

    public final void zzVi(boolean z) {
        this.zzYmt = z;
    }

    public final void zzZ(String str, zzYEF zzyef, com.aspose.words.internal.zzY5 zzy5, boolean z) {
        if (this.zzYmt) {
            zzYEI zzyei = new zzYEI();
            zzyei.zzZAL = str;
            zzyei.zzXqg = zzyef;
            this.zzYmu.zzYe7().zzZ(zzyei);
            this.zzYmu.zzXql = zzyef.getSize();
        } else {
            zzYEI zzyei2 = new zzYEI();
            zzyei2.zzZAL = str;
            zzyei2.zzXqg = zzyef;
            this.zzYmu.zzYe6().zzZ(zzyei2);
            this.zzYmu.zzXqk = zzyef.getSize();
            this.zzYmu.zzXqj = zzyef.getSize();
        }
        this.zzYqv.zzZ(str, zzyef, zzy5, z, null);
    }

    public final boolean zzZ4n() {
        return this.zzYqv.zzZ4n();
    }
}
