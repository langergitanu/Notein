package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZT4 implements zzH3 {
    private static zzZT4 zz6z = new zzZT4();
    private zzZXH zz6A = zzJF.zzHi();

    private zzZT4() {
    }

    public static zzZT4 zzmF() {
        return zz6z;
    }

    @Override // com.aspose.words.internal.zzGQ
    public final zzZXH zzN(String str, int i) {
        return this.zz6A;
    }

    @Override // com.aspose.words.internal.zzGQ
    public final zzZXH zzO(String str, int i) {
        return this.zz6A;
    }

    @Override // com.aspose.words.internal.zzH3
    public final zzPM zzY(String str, float f, int i) {
        return new zzPM(f, i, this.zz6A);
    }

    @Override // com.aspose.words.internal.zzGQ
    public final zzZXH zzZ(zzZXH zzzxh, int i, boolean z) {
        return null;
    }
}
