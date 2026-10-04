package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzJW {
    public static zzJW zzAy = new zzJW(new byte[10]);
    private byte[] zzAz;

    public zzJW(byte[] bArr) {
        bArr = bArr == null ? new byte[10] : bArr;
        this.zzAz = bArr.length != 10 ? new byte[10] : bArr;
    }

    private boolean zzZ(zzJW zzjw) {
        return zzZ1.zzZ(this.zzAz, zzjw.zzAz);
    }

    public final boolean equals(Object obj) {
        if (zzZKO.zzA(null, obj)) {
            return false;
        }
        if (zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzJW.class) {
            return false;
        }
        return zzZ((zzJW) obj);
    }

    public final byte[] getValues() {
        return this.zzAz;
    }

    public final int hashCode() {
        int i = 0;
        for (byte b : this.zzAz) {
            i = (i * 397) ^ (b & 255);
        }
        return i;
    }
}
