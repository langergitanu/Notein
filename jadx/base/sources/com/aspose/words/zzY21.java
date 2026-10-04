package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY21 implements com.aspose.words.internal.zzF4 {
    private IWarningCallback zzZG0;

    public zzY21(IWarningCallback iWarningCallback) {
        this.zzZG0 = iWarningCallback;
    }

    @Override // com.aspose.words.internal.zzF4
    public final void zzZ(int i, int i2, String str) {
        if (this.zzZG0 == null) {
            return;
        }
        OooO00o.OooO0O0(this.zzZG0, WarningInfo.zzib(i), WarningInfo.zzia(i2), str);
    }

    @Override // com.aspose.words.internal.zzF4
    public final void zzZ(int i, int i2, String str, Object obj) {
        if (this.zzZG0 == null) {
            return;
        }
        zzZ(i, i2, com.aspose.words.internal.zzZKN.format(str, obj));
    }
}
