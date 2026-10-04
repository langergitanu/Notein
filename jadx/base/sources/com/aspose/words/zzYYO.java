package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYO extends zzR {
    @Override // com.aspose.words.zzR
    public final com.aspose.words.internal.zz7K zzZ(com.aspose.words.internal.zz7K zz7k, double d) {
        return zz7k.hasValue() ? new com.aspose.words.internal.zz7K(Math.min(zz7k.getValue(), d)) : new com.aspose.words.internal.zz7K(d);
    }

    @Override // com.aspose.words.zzR
    public final zzTL zzbW() {
        return new zzZVZ(0.0d);
    }

    @Override // com.aspose.words.zzR
    public final com.aspose.words.internal.zz7K zzbX() {
        return com.aspose.words.internal.zz7K.zznU;
    }

    @Override // com.aspose.words.zzR
    public final com.aspose.words.internal.zz7K zzZ(com.aspose.words.internal.zz7K zz7k, int i) {
        return zz7k.hasValue() ? zz7k : new com.aspose.words.internal.zz7K(0.0d);
    }
}
