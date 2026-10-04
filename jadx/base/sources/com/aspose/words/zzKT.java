package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzKT extends zzYKC {
    private com.aspose.words.internal.zzOS zzZDi;
    private com.aspose.words.internal.zzOS zzZDk;

    public zzKT() {
        zz9W();
    }

    private void zz9W() {
        this.zzZDk = new com.aspose.words.internal.zzOS();
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzOS>) zzp5.zzNY(), this.zzZDk);
        com.aspose.words.internal.zzZQG.zzZ(zzYmo().zzZ0().zzO7(), zzp5);
        this.zzZDi = new com.aspose.words.internal.zzOS();
        com.aspose.words.internal.zzP5 zzp52 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzOS>) zzp52.zzNY(), this.zzZDi);
        com.aspose.words.internal.OooO00o.OooO00o(zzYmm(), zzp52);
    }

    @Override // com.aspose.words.zzYKC
    public final void zzZ(int i, com.aspose.words.internal.zzOS zzos) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            OooO0o.OooO00o(zzos, 1, this.zzZDi.zzNu());
            OooO0o.OooO00o(zzos, 1, this.zzZDk.zzNu());
            return;
        }
        OooO0o.OooO00o(zzos, 5, this.zzZDi.zzNu());
        OooO0o.OooO00o(zzos, 0, this.zzZDi.zzNu());
        OooO0o.OooO00o(zzos, 1, this.zzZDi.zzNu());
        OooO0o.OooO00o(zzos, 3, this.zzZDk.zzNu());
        OooO0o.OooO00o(zzos, 4, this.zzZDk.zzNu());
        OooO0o.OooO00o(zzos, 5, this.zzZDk.zzNu());
    }
}
