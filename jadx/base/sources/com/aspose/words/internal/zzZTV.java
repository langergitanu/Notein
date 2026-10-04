package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZTV extends zzZU0 {
    private long[] zzDl;

    @Override // com.aspose.words.internal.zzZU0
    public final boolean isEmpty() {
        return this.zzDl.length <= 1;
    }

    @Override // com.aspose.words.internal.zzZU0
    public final zzP8 zzJL() {
        return zz9K.zzY(this.zzDl, true);
    }

    public final long[] zzJx() {
        return this.zzDl;
    }

    @Override // com.aspose.words.internal.zzZUN
    public final void zzK0() throws Exception {
        this.zzDl = zzmY().zzMU();
    }
}
