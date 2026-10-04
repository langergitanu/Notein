package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY41 {
    private com.aspose.words.internal.zzIM<Integer> zzX0L = new com.aspose.words.internal.zzIM<>();

    public static int zzXUb() {
        return Math.abs(com.aspose.words.internal.zzZZS.zzY(new Object[0]).hashCode());
    }

    public final int zzji(int i) {
        return !this.zzX0L.add(Integer.valueOf(i)) ? zzji(zzXUb()) : i;
    }
}
