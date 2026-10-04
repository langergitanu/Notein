package com.aspose.words;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes6.dex */
final class zzYO7 extends zzYOE {
    private String zzCx;
    private int zzXIT;
    private com.aspose.words.internal.zzZOZ zzXIU;
    private com.aspose.words.internal.zzZQ9 zzXIX = com.aspose.words.internal.zzZQ9.zzQO();
    private com.aspose.words.internal.zzZQ9 zzXIW = com.aspose.words.internal.zzZQ9.zzQO();
    private com.aspose.words.internal.zzZQ9 zzXIV = com.aspose.words.internal.zzZQ9.zzQO();

    public zzYO7(int i) {
        this.zzXIT = i;
    }

    @Override // com.aspose.words.zzYOE
    public final String getName() {
        return "\u0001Ole";
    }

    public final void setPath(String str) {
        this.zzCx = str;
    }

    public final void zz6(com.aspose.words.internal.zzZQ9 zzzq9) {
        this.zzXIV = zzzq9;
    }

    public final void zz7(com.aspose.words.internal.zzZQ9 zzzq9) {
        this.zzXIW = zzzq9;
    }

    public final void zz8(com.aspose.words.internal.zzZQ9 zzzq9) {
        this.zzXIX = zzzq9;
    }

    public final void zzK(com.aspose.words.internal.zzZOZ zzzoz) {
        this.zzXIU = zzzoz;
    }

    @Override // com.aspose.words.zzYOE
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzYXF zzy3q;
        zzzow.zzl(InputDeviceCompat.SOURCE_HDMI);
        zzzow.zzl(this.zzXIT == 2 ? 1 : 0);
        zzzow.zzl(2);
        zzzow.zzl(0);
        zzzow.zzl(0);
        if (this.zzXIT == 2) {
            zzzow.zzl(0);
            if (com.aspose.words.internal.zzZVR.zzWF(this.zzCx)) {
                zzy3q = new zzY3Q(this.zzCx);
            } else {
                zzZOA zzzoa = new zzZOA();
                zzzoa.zzLw(this.zzCx);
                zzy3q = zzzoa;
            }
            zzYXE.zzZ(zzzow, zzy3q);
            zzzow.zzl(-1);
            zzzow.writeBytes(this.zzXIU.toByteArray());
            zzzow.zzl(0);
            zzzow.zzl(0);
            zzzow.zzQ(com.aspose.words.internal.zzR1.zzZ(this.zzXIX, (String) null));
            zzzow.zzQ(com.aspose.words.internal.zzR1.zzZ(this.zzXIW, (String) null));
            zzzow.zzQ(com.aspose.words.internal.zzR1.zzZ(this.zzXIV, (String) null));
        }
    }
}
