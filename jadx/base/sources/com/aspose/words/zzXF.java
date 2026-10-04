package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzXF extends zzZLN implements zzZ8Q {
    public zzXF() {
    }

    public static zzXF zzZ(com.aspose.words.internal.zzZOX zzzox, boolean z) throws Exception {
        return new zzXF(zzzox.zzn(z ? zzzox.readByte() & 255 : zzzox.zzXa()));
    }

    @Override // com.aspose.words.zzZ8Q
    public final int zz7b() {
        if (getData().length == 0) {
            return 0;
        }
        return getData().length + 1;
    }

    public zzXF(byte[] bArr) {
        super(bArr);
    }

    @Override // com.aspose.words.zzZ8Q
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow, boolean z) throws Exception {
        if (z) {
            zzzow.writeByte((byte) getData().length);
        } else {
            zzzow.zzK((short) getData().length);
        }
        zzzow.writeBytes(getData());
    }
}
