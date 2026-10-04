package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzED extends zzFI {
    private static int[] zzZbU = {3, 8, 10, 11, 9, 1, 7, 4, 2};

    public zzED(zzDI zzdi) {
        super(zzdi);
        zzZ(new zzF8(zzFF.zzL5(zzdi.getStyle()), zzFF.zzf(zzdi.getStyle(), false), zzFF.zzL4(zzdi.getStyle())));
    }

    public static int zzKL(int i) {
        return zzZbU[i % 9];
    }

    @Override // com.aspose.words.zzFI
    public final zzZCM zzL9(int i) {
        return zzZ(i, zzZMT().zzZMr().zzZM8());
    }

    @Override // com.aspose.words.zzFI
    public final zzZCM zzLb(int i) {
        return zzZ(i, zzZMT().zzZMs().zzZM8());
    }
}
