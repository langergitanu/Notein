package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOI extends zzYOE {
    private byte[] zzXJn;

    public zzYOI() {
    }

    public static zzYOI zzN(com.aspose.words.internal.zzAA zzaa) throws Exception {
        if (zzaa.containsKey("\u0001Ole10Native")) {
            return new zzYOI(new com.aspose.words.internal.zzZOX(zzaa.zzYu("\u0001Ole10Native")));
        }
        return null;
    }

    @Override // com.aspose.words.zzYOE
    public final String getName() {
        return "\u0001Ole10Native";
    }

    public final void zzXW(byte[] bArr) {
        this.zzXJn = bArr;
    }

    public final byte[] zzYrG() {
        return this.zzXJn;
    }

    @Override // com.aspose.words.zzYOE
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzl(this.zzXJn.length);
        zzzow.writeBytes(this.zzXJn);
    }

    private zzYOI(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzXJn = zzzox.zzn(zzzox.zzXc());
    }
}
