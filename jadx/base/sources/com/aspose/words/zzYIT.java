package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYIT implements com.aspose.words.internal.zzFN {
    static zzYIT zzXxA = new zzYIT();

    private zzYIT() {
    }

    public static boolean zzW(zzYIU zzyiu) {
        return zzXxA.zzZ(zzyiu);
    }

    @Override // com.aspose.words.internal.zzFN
    public final com.aspose.words.internal.zzFM zzEJ() {
        return new zzYIS();
    }

    @Override // com.aspose.words.internal.zzFN
    public final com.aspose.words.internal.zzFO zzEK() {
        return zzYIU.zzXxD;
    }

    @Override // com.aspose.words.internal.zzFN
    public final com.aspose.words.internal.zzFM zzW8(int i) {
        return new zzYIS(i);
    }

    @Override // com.aspose.words.internal.zzFN
    public final com.aspose.words.internal.zzFM zzY(com.aspose.words.internal.zzFO zzfo) {
        return new zzYIS((zzYIU) zzfo);
    }

    @Override // com.aspose.words.internal.zzFN
    public final com.aspose.words.internal.zzFO zzYT(String str) {
        return zzYIU.zzCI(str);
    }

    @Override // com.aspose.words.internal.zzFN
    public final boolean zzZ(com.aspose.words.internal.zzFO zzfo) {
        return zzfo == null || zzfo.getLength() == 0;
    }
}
