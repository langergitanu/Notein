package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzMA extends zzMG {
    private long zzY2;

    @Override // com.aspose.words.internal.zzMG
    public final boolean isEmpty() {
        return false;
    }

    @Override // com.aspose.words.internal.zzMG
    public final boolean zzJR() {
        return true;
    }

    @Override // com.aspose.words.internal.zzMO
    public final void zzK0() throws Exception {
        this.zzY2 = zzJJ().zzN1();
    }

    @Override // com.aspose.words.internal.zzMG
    public final zzP5 zzc(long j) {
        zzP5 zzp5 = new zzP5(1);
        zzp5.zzR(j, this.zzY2);
        return zzp5;
    }
}
