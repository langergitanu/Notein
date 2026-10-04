package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ8 extends zzYY6 {
    private int zzZEe;

    public zzZ8(int i) {
        this.zzZEe = i;
    }

    private static String zzYE(int i, int i2) {
        return com.aspose.words.internal.zzZKN.format("kindle:pos:fid:{0}:off:{1}", zzYR.zzC(i, 4), zzYR.zzC(i2, 10));
    }

    @Override // com.aspose.words.zzYY6
    public final String getNewValue() {
        return zzYE(zzaL(), zzYCC());
    }

    @Override // com.aspose.words.zzYY6
    public final String zzaH() {
        return zzaI();
    }

    @Override // com.aspose.words.zzYY6
    public final String zzaI() {
        return zzYE(0, this.zzZEe);
    }
}
