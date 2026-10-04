package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7C implements zzZ93 {
    @Override // com.aspose.words.zzZ93
    public final byte[] zzZ(byte[] bArr, Document document, zzYB5 zzyb5, zzYB5 zzyb52, int i) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(bArr);
        try {
            zzY7R zzy7rZzZ = zzY7I.zzV(zzzor, document).zzZ(zzyb5, zzyb52);
            com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
            try {
                zzy7rZzZ.zzZ(zzzor2, i);
                return zzzor2.zzWy();
            } finally {
                zzzor2.close();
            }
        } finally {
            zzzor.close();
        }
    }
}
