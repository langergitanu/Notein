package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOA extends zzYXF {
    private String zzYzq;
    private String zzYzr;

    public final void zzLw(String str) {
        this.zzYzq = str;
    }

    @Override // com.aspose.words.zzYXF
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzK((short) 0);
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYzr)) {
            zzzow.zzl(this.zzYzr.length() + 1);
            zzZZQ.zzZ(zzzow, this.zzYzr, 1251, false);
        } else {
            zzzow.zzl(0);
        }
        zzzow.zzJ((short) -1);
        zzzow.zzJ((short) -8531);
        zzzow.writeBytes(new byte[16]);
        zzzow.writeBytes(new byte[4]);
        byte[] bytes = com.aspose.words.internal.zzZO0.zzhU().getBytes(this.zzYzq);
        zzzow.zzl(bytes.length + 6);
        zzzow.zzl(bytes.length);
        zzzow.zzJ((short) 3);
        zzzow.writeBytes(bytes);
    }

    @Override // com.aspose.words.zzYXF
    public final com.aspose.words.internal.zzZOZ zzZ9R() {
        return zzYXF.zzXXb;
    }
}
