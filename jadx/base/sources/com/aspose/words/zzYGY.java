package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGY {
    private String zzXv2;
    private int zzp8;

    public zzYGY(String str) {
        this.zzXv2 = str;
    }

    private int zzYi9() {
        if (this.zzp8 == this.zzXv2.length()) {
            return -1;
        }
        String str = this.zzXv2;
        int i = this.zzp8;
        this.zzp8 = i + 1;
        return com.aspose.words.internal.zzZYD.zzm(str.charAt(i));
    }

    public final byte readByte() {
        return (byte) (((byte) (zzYi9() << 4)) | ((byte) zzYi9()));
    }

    public final byte[] readBytes() {
        int length = this.zzXv2.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = readByte();
        }
        return bArr;
    }

    public final short zzXa() {
        return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
    }

    public final int zzXc() {
        return (readByte() & 255) | ((readByte() & 255) << 8) | ((readByte() & 255) << 16) | ((readByte() & 255) << 24);
    }

    public final byte[] zzn(int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = readByte();
        }
        return bArr;
    }
}
