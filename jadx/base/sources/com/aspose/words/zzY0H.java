package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0H extends com.aspose.words.internal.zz6 {
    public static com.aspose.words.internal.zzZG[] zzY(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzP5[] zzp5Arr, boolean z) throws Exception {
        return zzp5Arr.length % 2 == 0 ? new zzY0K().zzZ(zzg, zzzq4, zzp5Arr, z) : new zzY0F().zzZ(zzg, zzzq4, zzp5Arr, z);
    }

    public static com.aspose.words.internal.zzZG[] zzZ(com.aspose.words.internal.zzZG[] zzzgArr, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzP5[] zzp5Arr) throws Exception {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzZ(zzzgArr);
        return zzY(zzg, zzzq4, zzp5Arr, true);
    }
}
