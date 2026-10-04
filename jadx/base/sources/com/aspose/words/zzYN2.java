package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYN2 extends zzYN4 {
    private int[] zzXHa;

    public zzYN2(int... iArr) {
        zz4(iArr);
        this.zzXHa = (int[]) iArr.clone();
    }

    private static void zz4(int[] iArr) {
        for (int i : iArr) {
            if (i < 0) {
                throw new IllegalArgumentException("Negative page index specified.\r\nParameter name: pages");
            }
        }
    }

    @Override // com.aspose.words.zzYN4
    public final zzYN3 zzqI(int i) {
        return new zzYN1(this.zzXHa, i);
    }
}
