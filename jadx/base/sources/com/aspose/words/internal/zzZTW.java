package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZTW extends zzZU0 {
    private long[][] zz6I;

    @Override // com.aspose.words.internal.zzZU0
    public final boolean isEmpty() {
        return this.zz6I.length == 0;
    }

    @Override // com.aspose.words.internal.zzZU0
    public final zzP8 zzJL() {
        return zz9K.zzZ(this.zz6I, true);
    }

    @Override // com.aspose.words.internal.zzZUN
    public final void zzK0() throws Exception {
        this.zz6I = zzmY().zzMS();
    }

    public final long[][] zzmN() {
        return this.zz6I;
    }
}
