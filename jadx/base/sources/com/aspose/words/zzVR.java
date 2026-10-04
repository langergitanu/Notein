package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVR {
    private int zzZwW;
    private int zzZwX;

    private zzVR(int i, int i2) {
        this.zzZwX = i;
        this.zzZwW = i2;
    }

    public static zzVR zzN(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (!"ITSP".equals(new String(zzzox.zzQG(4)))) {
            throw new IllegalStateException("Expected directory header start signature 'ITSP' here but got something else.");
        }
        zzzox.zzq().zzH(zzzox.zzq().getPosition() + 12);
        int iZzXb = zzzox.zzXb();
        zzzox.zzq().zzH(zzzox.zzq().getPosition() + 12);
        int iZzXc = zzzox.zzXc();
        zzzox.zzq().zzH(zzzox.zzq().getPosition() + 48);
        return new zzVR(iZzXb, iZzXc);
    }

    public final int zz1t() {
        return this.zzZwW;
    }

    public final int zz1u() {
        return this.zzZwX;
    }
}
