package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXV extends zzYXU implements IResourceLoadingCallback {
    public zzYXV(com.aspose.words.internal.zzZOP zzzop, Document document) {
        super(zzzop, document);
    }

    private static int zzTu(String str) {
        int i = com.aspose.words.internal.zzJB.parseInt(str);
        if (i != 0) {
            return i;
        }
        return -1;
    }

    @Override // com.aspose.words.IResourceLoadingCallback
    public final int resourceLoading(ResourceLoadingArgs resourceLoadingArgs) throws Exception {
        int iZzTu;
        byte[] bArrZzP3;
        if (!com.aspose.words.internal.zzJB.zzZp(resourceLoadingArgs.getUri()) || (iZzTu = zzTu(resourceLoadingArgs.getUri())) <= 0 || (bArrZzP3 = zzP3(iZzTu - 1)) == null) {
            resourceLoadingArgs.setData(null);
            return 2;
        }
        resourceLoadingArgs.setData(bArrZzP3);
        return 2;
    }

    @Override // com.aspose.words.zzYXU
    public final byte[] zzP3(int i) throws Exception {
        int iZzu8 = zzYCi().zzu8(i);
        if (zzYCj().zztT(iZzu8)) {
            return zzYCj().zzY(zzYCk(), iZzu8);
        }
        return null;
    }

    @Override // com.aspose.words.zzYXU
    public final void zzYG(byte[] bArr) throws Exception {
        String strZzZn = zzYCi().zzQZ().zzZn(bArr);
        zzYYI zzyyi = new zzYYI(zzYCi().zzQZ());
        zzyyi.zzHO(strZzZn);
        String strZzZ = zzyyi.zzZ(new com.aspose.words.internal.zzXE(bArr), 0);
        zzZFF zzzff = new zzZFF(this, getDocument().getWarningCallback());
        zzZFH zzzfh = new zzZFH();
        zzzfh.zzYmC = true;
        zzZFI zzzfi = new zzZFI(zzzfh, 50, zzzff);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(zzYCi().zzQZ().getBytes(strZzZ));
        try {
            zzzfi.zzZ(zzzor, zzYCi().zzQZ(), getDocument());
        } finally {
            zzzor.close();
        }
    }

    @Override // com.aspose.words.zzYXU
    public final void zzan() {
        if (zzYCi().zzYCN() >= 8) {
            throw new IllegalStateException("MOBI reader doesn't support newer AZW3 documents.");
        }
    }
}
