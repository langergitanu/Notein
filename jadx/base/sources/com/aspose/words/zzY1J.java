package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1J implements zzZBK {
    private static zzY12 zzZ(byte[] bArr, Document document) throws Exception {
        zzY12 zzy12ZzU = zzY11.zzU(new com.aspose.words.internal.zzZOO(new com.aspose.words.internal.zzZOR(bArr, 0, bArr[bArr.length + (-1)] == 0 ? bArr.length - 1 : bArr.length)).zzq(), document);
        zzy12ZzU.zzIh();
        return zzy12ZzU;
    }

    @Override // com.aspose.words.zzZBK
    public final OfficeMath zzr(byte[] bArr, int i) throws Exception {
        com.aspose.words.internal.zzZO0 zzzo0ZzYyY;
        try {
            Document document = new Document(0);
            zzY12 zzy12ZzZ = zzZ(bArr, document);
            if (FileFormatUtil.zzC6(i)) {
                zzzo0ZzYyY = zzy12ZzZ.zzYyY() != null ? zzy12ZzZ.zzYyY() : com.aspose.words.internal.zzZO0.zzhR();
                try {
                    document = (Document) zzZ(com.aspose.words.internal.zzZO0.zzZ(com.aspose.words.internal.zzZO0.zzhV(), zzzo0ZzYyY, bArr), new Document(0)).getDocument();
                } catch (Exception unused) {
                    zzzo0ZzYyY = null;
                }
            } else {
                zzzo0ZzYyY = null;
            }
            OfficeMath officeMath = (OfficeMath) document.getFirstSection().getBody().getFirstParagraph().getFirstChild();
            officeMath.zzK(zzzo0ZzYyY);
            return officeMath;
        } catch (Exception unused2) {
            return null;
        }
    }
}
