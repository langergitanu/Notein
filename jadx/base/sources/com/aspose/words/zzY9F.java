package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY9F {
    private int zzVN;
    private String zzXb0;
    private short zzXb1;
    private byte zzXb2;
    private byte zzXb3;
    private short zzbn;

    public static void zzZ(com.aspose.words.internal.zzZOX zzzox, zzZLZ zzzlz) throws Exception {
        zzY9F zzy9f = new zzY9F();
        zzy9f.zzZ(zzzox);
        zzzlz.zzQ(31220, zzy9f);
    }

    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.writeByte(this.zzXb3);
        zzzow.zzK(this.zzbn);
        zzzow.writeByte(this.zzXb2);
        zzzow.zzK(this.zzXb1);
        zzzow.zzk(this.zzVN);
        byte[] bytes = com.aspose.words.internal.zzZO0.zzhX().getBytes(this.zzXb0);
        zzzow.writeByte((byte) bytes.length);
        zzzow.writeBytes(bytes);
    }

    private void zzZ(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzXb3 = zzzox.readByte();
        this.zzbn = zzzox.zzXa();
        this.zzXb2 = zzzox.readByte();
        this.zzXb1 = zzzox.zzXa();
        this.zzVN = zzzox.zzXb();
        this.zzXb0 = com.aspose.words.internal.zzZO0.zzhX().zzZn(zzzox.zzn(zzzox.readByte() & 255));
    }
}
