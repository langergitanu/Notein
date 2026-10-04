package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY3Q extends zzYXF {
    private String zzZpX;

    public zzY3Q() {
    }

    @Override // com.aspose.words.zzYXF
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        com.aspose.words.internal.zzZO0 zzzo0ZzhU = com.aspose.words.internal.zzZO0.zzhU();
        String str = this.zzZpX;
        if (str == null) {
            str = "";
        }
        byte[] bytes = zzzo0ZzhU.getBytes(str);
        zzzow.zzl(bytes.length + 2);
        zzzow.writeBytes(bytes);
        zzzow.writeByte((byte) 0);
        zzzow.writeByte((byte) 0);
    }

    @Override // com.aspose.words.zzYXF
    public final com.aspose.words.internal.zzZOZ zzZ9R() {
        return zzYXF.zzXX9;
    }

    public zzY3Q(String str) {
        this.zzZpX = str;
    }
}
