package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYF6 extends zzYEX {
    private com.aspose.words.internal.zzZON zzXrT;

    public zzYF6(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        this(zzzop, (byte) 0);
    }

    @Override // com.aspose.words.zzYEX
    public final void flush() throws Exception {
        this.zzXrT.flush();
    }

    @Override // com.aspose.words.zzYEX
    public final void write(String str) throws Exception {
        this.zzXrT.write(str);
    }

    @Override // com.aspose.words.zzYEX
    public final void zzE(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        zzzor.zzZH(this.zzXrT.zzq());
    }

    @Override // com.aspose.words.zzYEX
    public final void zzZR(char c) throws Exception {
        this.zzXrT.zzZR(c);
    }

    private zzYF6(com.aspose.words.internal.zzZOP zzzop, byte b) throws Exception {
        this.zzXrT = new com.aspose.words.internal.zzZON(zzzop, zzYEX.zzXrh, 4096);
    }
}
