package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZLN implements Cloneable {
    private byte[] zzTZ;

    public zzZLN() {
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzZLN.class) {
            return false;
        }
        return zzZ((zzZLN) obj);
    }

    public final byte[] getData() {
        return this.zzTZ;
    }

    public int hashCode() {
        return (int) (((long) com.aspose.words.internal.zzS5.zzJ(this.zzTZ)) & 4294967295L);
    }

    public final boolean zzZ(zzZLN zzzln) {
        return com.aspose.words.internal.zzZ1.zzZ(this.zzTZ, zzzln.zzTZ);
    }

    public zzZLN(byte[] bArr) {
        this.zzTZ = bArr;
    }

    public zzZLN(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        this.zzTZ = zzzox.zzn(i);
    }
}
