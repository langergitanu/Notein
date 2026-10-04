package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzWS extends zzWT {
    private byte[] zzTZ;

    private zzWS() {
    }

    private static int zzV(zzWK zzwk) throws Exception {
        return (zzwk.zzUU() * 3) + 1;
    }

    private static int zzW(zzWK zzwk) throws Exception {
        return (zzwk.zzUU() * 2) + 2;
    }

    private static int zzY(zzWK zzwk) throws Exception {
        long position = zzwk.zzq().getPosition();
        short sZzUU = zzwk.zzUU();
        int i = sZzUU & 127;
        boolean z = (sZzUU & 128) != 0;
        int iZzX = zzX(zzwk, i);
        if (!z) {
            return iZzX;
        }
        zzwk.zzq().zzH(position + ((long) iZzX));
        return iZzX + zzV(zzwk);
    }

    public static zzWS zzZ(zzWK zzwk) throws Exception {
        zzWS zzws = new zzWS();
        long position = zzwk.zzq().getPosition();
        int iZzY = zzY(zzwk);
        zzwk.zzq().zzH(position);
        zzws.zzTZ = zzwk.zzn(iZzY);
        return zzws;
    }

    @Override // com.aspose.words.internal.zzWT
    public final int getDataSize() {
        return this.zzTZ.length;
    }

    @Override // com.aspose.words.internal.zzWT
    public final void zzX(zzWJ zzwj) throws Exception {
        zzwj.writeBytes(this.zzTZ);
    }

    @Override // com.aspose.words.internal.zzWT
    public final int zzZw(int i) {
        return i;
    }

    private static int zzX(zzWK zzwk, int i) throws Exception {
        if (i == 0) {
            return zzX(zzwk);
        }
        if (i == 1) {
            return zzW(zzwk);
        }
        throw new IllegalStateException("Unknown CFF encoding format.");
    }

    private static int zzX(zzWK zzwk) throws Exception {
        return zzwk.zzUU() + 2;
    }
}
