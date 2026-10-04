package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVK {
    private long[] zzZx6;
    private long zzZx8;

    private zzVK(long j, long[] jArr) {
        this.zzZx8 = j;
        this.zzZx6 = jArr;
    }

    public static zzVK zzZ(byte[] bArr, long j, long j2) throws Exception {
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(new com.aspose.words.internal.zzZOR(bArr));
        zzVN zzvnZzM = zzVN.zzM(zzzox);
        zzzox.zzq().zzH(zzvnZzM.zz1h());
        long[] jArr = new long[zzvnZzM.getBlockCount() + 1];
        for (int i = 0; i < zzvnZzM.getBlockCount(); i++) {
            jArr[i] = zzzox.zzX8() + j + j2;
        }
        jArr[zzvnZzM.getBlockCount()] = j + j2 + zzvnZzM.zz1g();
        return new zzVK(zzvnZzM.zz1f(), jArr);
    }

    public final long[] zz19() {
        return this.zzZx6;
    }

    public final long zz1f() {
        return this.zzZx8;
    }
}
