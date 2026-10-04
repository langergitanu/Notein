package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzO0 extends zzNM {
    public zzO0(byte[] bArr) {
        super(bArr);
    }

    private long zzMD() throws Exception {
        zzXN zzxn = new zzXN(getBytes());
        try {
            return zzZPW.zzG(zzxn.getWidth(), zzxn.getHeight());
        } finally {
            zzxn.dispose();
        }
    }

    @Override // com.aspose.words.internal.zzNM
    public final zzZL zzME() throws Exception {
        return new zzZP(0L, zzMD(), getBytes());
    }
}
