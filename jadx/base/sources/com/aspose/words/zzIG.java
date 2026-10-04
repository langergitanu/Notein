package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzIG extends zzIH {
    private static long zzY6(long j) {
        return com.aspose.words.internal.zzZPY.zzG(com.aspose.words.internal.zzZPY.zzYC(j), Float.intBitsToFloat((int) j));
    }

    private static long zzY7(long j) {
        return com.aspose.words.internal.zzZPW.zzG(com.aspose.words.internal.zzZPW.zzYz(j), Float.intBitsToFloat((int) j));
    }

    @Override // com.aspose.words.zzIH
    public final long zzY8(long j) {
        return zzY7(j);
    }

    @Override // com.aspose.words.zzIH
    public final long zzY9(long j) {
        return zzY7(j);
    }

    @Override // com.aspose.words.zzIH
    public final zzI3 zzYa(int i, int i2) {
        if (i == 0) {
            return new zzI1();
        }
        if (i == 1) {
            return new zzI0();
        }
        if (i == 2) {
            return new zzI2();
        }
        throw new IllegalStateException("Unexpected node alignment.");
    }

    @Override // com.aspose.words.zzIH
    public final com.aspose.words.internal.zzZQ4 zzZX(com.aspose.words.internal.zzZQ4 zzzq4) {
        return new com.aspose.words.internal.zzZQ4(zzY6(zzzq4.zzZE()), zzY7(zzzq4.getSize()));
    }
}
