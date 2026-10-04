package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5X extends zzY87 {
    private String zzZi;

    public zzY5X(com.aspose.words.internal.zzZO0 zzzo0, String str, String str2, String str3) {
        super(zzzo0, str, str2);
        this.zzZi = str3;
    }

    public final String getText() {
        return this.zzZi;
    }

    @Override // com.aspose.words.zzY87
    public final com.aspose.words.internal.zzZOR zz9P() throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        com.aspose.words.internal.zzZON zzzon = new com.aspose.words.internal.zzZON(zzzor, zzY1F());
        zzzon.write(this.zzZi);
        zzzon.flush();
        zzzor.zzH(0L);
        return zzzor;
    }
}
