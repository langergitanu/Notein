package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1I {
    public static byte[] zzX(OfficeMath officeMath, boolean z) throws Exception {
        Document document = new Document(1);
        document.getFirstSection().getBody().getFirstParagraph().zzA(officeMath);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzY0P zzy0p = new zzY0P();
        zzy0p.zzXSg();
        zzy0p.zzZ(new zzYDZ(document, zzzor, "", SaveOptions.createSaveOptions(31)));
        if (z) {
            return com.aspose.words.internal.zzZO0.zzZ(officeMath.zzYrO() != null ? officeMath.zzYrO() : com.aspose.words.internal.zzZO0.zzQz(1251), new com.aspose.words.internal.zzZNI(false), zzzor.zzWy());
        }
        return zzzor.zzWy();
    }
}
