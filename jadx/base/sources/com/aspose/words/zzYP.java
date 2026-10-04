package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYP extends zzYKC {
    private com.aspose.words.internal.zzOS zzZDi;
    private com.aspose.words.internal.zzOS zzZDj;
    private com.aspose.words.internal.zzOS zzZDk;
    private com.aspose.words.internal.zzOS zzZDl;

    public zzYP() {
        zz9W();
    }

    private void zz9W() {
        this.zzZDl = new com.aspose.words.internal.zzOS();
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzOS>) zzp5.zzNY(), this.zzZDl);
        com.aspose.words.internal.zzZQG.zzZ(zzYmp().zzZ0().zzO7(), zzp5);
        this.zzZDk = new com.aspose.words.internal.zzOS();
        com.aspose.words.internal.zzP5 zzp52 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzOS>) zzp52.zzNY(), this.zzZDk);
        com.aspose.words.internal.zzZQG.zzZ(zzYmo().zzZ0().zzO7(), zzp52);
        this.zzZDj = new com.aspose.words.internal.zzOS();
        com.aspose.words.internal.zzP5 zzp53 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzOS>) zzp53.zzNY(), this.zzZDj);
        com.aspose.words.internal.zzZQG.zzZ(zzYmn().zzZ0().zzO7(), zzp53);
        this.zzZDi = new com.aspose.words.internal.zzOS();
        com.aspose.words.internal.zzP5 zzp54 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzOS>) zzp54.zzNY(), this.zzZDi);
        com.aspose.words.internal.OooO00o.OooO00o(zzYmm(), zzp54);
    }

    @Override // com.aspose.words.zzYKC
    public final void zzZ(int i, com.aspose.words.internal.zzOS zzos) {
        if (i == 2) {
            OooO0o.OooO00o(zzos, 0, this.zzZDj.zzNu());
            OooO0o.OooO00o(zzos, 1, this.zzZDj.zzNu());
            OooO0o.OooO00o(zzos, 0, this.zzZDi.zzNu());
            OooO0o.OooO00o(zzos, 1, this.zzZDi.zzNu());
            return;
        }
        if (i == 3) {
            OooO0o.OooO00o(zzos, 1, this.zzZDj.zzNu());
            OooO0o.OooO00o(zzos, 0, this.zzZDj.zzNu());
            OooO0o.OooO00o(zzos, 0, this.zzZDk.zzNu());
            OooO0o.OooO00o(zzos, 1, this.zzZDk.zzNu());
            return;
        }
        if (i == 4) {
            OooO0o.OooO00o(zzos, 1, this.zzZDk.zzNu());
            OooO0o.OooO00o(zzos, 0, this.zzZDk.zzNu());
            OooO0o.OooO00o(zzos, 0, this.zzZDl.zzNu());
            OooO0o.OooO00o(zzos, 1, this.zzZDl.zzNu());
            return;
        }
        if (i != 5) {
            return;
        }
        OooO0o.OooO00o(zzos, 1, this.zzZDl.zzNu());
        OooO0o.OooO00o(zzos, 0, this.zzZDl.zzNu());
        OooO0o.OooO00o(zzos, 1, this.zzZDi.zzNu());
        OooO0o.OooO00o(zzos, 0, this.zzZDi.zzNu());
    }
}
