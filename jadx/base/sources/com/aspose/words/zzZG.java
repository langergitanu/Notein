package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZG extends zzR {
    @Override // com.aspose.words.zzR
    public final com.aspose.words.internal.zz7K zzZ(com.aspose.words.internal.zz7K zz7k, double d) {
        return new com.aspose.words.internal.zz7K(zz7k.zzxL() + d);
    }

    @Override // com.aspose.words.zzR
    public final boolean zzbV() {
        return false;
    }

    @Override // com.aspose.words.zzR
    public final com.aspose.words.internal.zz7K zzbX() {
        return com.aspose.words.internal.zz7K.zznU;
    }

    @Override // com.aspose.words.zzR
    public final int zzZ(int i, zzZVZ zzzvz) {
        return Math.max(super.zzZ(i, zzzvz), 2);
    }

    @Override // com.aspose.words.zzR
    public final com.aspose.words.internal.zz7K zzZ(com.aspose.words.internal.zz7K zz7k, int i) {
        if (!zz7k.hasValue()) {
            return com.aspose.words.internal.zz7K.zznU;
        }
        return new com.aspose.words.internal.zz7K(zz7k.zzxL() / ((double) i));
    }
}
