package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ83 {
    private com.aspose.words.internal.zzZYG<com.aspose.words.internal.zzD5> zzYir = new com.aspose.words.internal.zzZYG<>();

    public final com.aspose.words.internal.zzD5 zzJy(String str) {
        com.aspose.words.internal.zzD5 zzd5 = this.zzYir.get(str);
        if (zzd5 != null) {
            return zzd5;
        }
        com.aspose.words.internal.zzD5 zzd52 = new com.aspose.words.internal.zzD5();
        this.zzYir.set(str, zzd52);
        return zzd52;
    }
}
