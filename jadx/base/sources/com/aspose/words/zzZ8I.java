package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ8I {
    public static com.aspose.words.internal.zzZOP zzW(String str, Document document) throws Exception {
        if (document != null && !com.aspose.words.internal.zzZVR.zzWF(str)) {
            str = document.zzOb(com.aspose.words.internal.zzZVR.zzWt(str));
        }
        return com.aspose.words.internal.zzZXR.zzX0(str);
    }

    private static byte[] zzX(String str, DocumentBase documentBase) throws Exception {
        try {
            com.aspose.words.internal.zzZOP zzzopZzW = zzW(str, (Document) com.aspose.words.internal.zzZKW.zzZ(documentBase, Document.class));
            try {
                byte[] bArrZzZX = com.aspose.words.internal.zzZYQ.zzZX(zzzopZzW);
                if (zzzopZzW != null) {
                    try {
                        zzzopZzW.close();
                    } catch (Exception unused) {
                        return bArrZzZX;
                    }
                }
                return bArrZzZX;
            } catch (Throwable th) {
                if (zzzopZzW != null) {
                    zzzopZzW.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static com.aspose.words.internal.zzZOP zzY(String str, DocumentBase documentBase) throws Exception {
        return new com.aspose.words.internal.zzZOR(zzZ(str, documentBase));
    }

    public static byte[] zzZ(String str, DocumentBase documentBase) throws Exception {
        if (documentBase == null || documentBase.getResourceLoadingCallback() == null) {
            return zzX(str, documentBase);
        }
        ResourceLoadingArgs resourceLoadingArgs = new ResourceLoadingArgs("", str, 0);
        int iResourceLoading = documentBase.getResourceLoadingCallback().resourceLoading(resourceLoadingArgs);
        if (iResourceLoading == 0) {
            return zzX(str, documentBase);
        }
        if (iResourceLoading == 1) {
            return com.aspose.words.internal.zzEF.zzDL();
        }
        if (iResourceLoading != 2) {
            return null;
        }
        return resourceLoadingArgs.getData();
    }
}
