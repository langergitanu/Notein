package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5D {
    private static com.aspose.words.internal.zzXN zzV(Document document, ThumbnailGeneratingOptions thumbnailGeneratingOptions) throws Exception {
        com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN((int) thumbnailGeneratingOptions.zzXVo(), (int) (thumbnailGeneratingOptions.zzXVo() >>> 32));
        com.aspose.words.internal.zzIY zziy = new com.aspose.words.internal.zzIY(zzxn);
        try {
            com.aspose.words.internal.zzIY.zzGJ();
            document.renderToSize(0, zziy.zzGH(), 0.0f, 0.0f, (int) thumbnailGeneratingOptions.zzXVo(), (int) (thumbnailGeneratingOptions.zzXVo() >>> 32));
            return zzxn;
        } finally {
            zziy.dispose();
        }
    }

    private static com.aspose.words.internal.zzXN zzW(Document document, ThumbnailGeneratingOptions thumbnailGeneratingOptions) throws Exception {
        NodeCollection nodeCollection = new NodeCollection((CompositeNode) document, (zzYWD) new zzZ8F(), true);
        if (nodeCollection.getCount() == 0) {
            return null;
        }
        return zzZ(nodeCollection.get(0).getNodeType() == 18 ? ((Shape) nodeCollection.get(0)).getImageData().toByteArray() : null, thumbnailGeneratingOptions);
    }

    private static com.aspose.words.internal.zzXN zzX(Document document, ThumbnailGeneratingOptions thumbnailGeneratingOptions) throws Exception {
        com.aspose.words.internal.zzXN zzxnZzW = !thumbnailGeneratingOptions.getGenerateFromFirstPage() ? zzW(document, thumbnailGeneratingOptions) : null;
        return zzxnZzW != null ? zzxnZzW : zzV(document, thumbnailGeneratingOptions);
    }

    private static byte[] zzY(Document document, ThumbnailGeneratingOptions thumbnailGeneratingOptions) throws Exception {
        com.aspose.words.internal.zzXN zzxnZzX = zzX(document, thumbnailGeneratingOptions);
        try {
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            try {
                zzxnZzX.zzZ(zzzor, 6);
                byte[] bArrZzWy = zzzor.zzWy();
                zzxnZzX.dispose();
                return bArrZzWy;
            } finally {
                zzzor.close();
            }
        } catch (Throwable th) {
            if (zzxnZzX != null) {
                zzxnZzX.dispose();
            }
            throw th;
        }
    }

    public static void zzZ(Document document, ThumbnailGeneratingOptions thumbnailGeneratingOptions) throws Exception {
        if (document == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: document");
        }
        if (thumbnailGeneratingOptions == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: options");
        }
        byte[] bArrZzY = zzY(document, thumbnailGeneratingOptions);
        if (bArrZzY != null) {
            document.getBuiltInDocumentProperties().setThumbnail(bArrZzY);
        }
    }

    private static com.aspose.words.internal.zzXN zzZ(byte[] bArr, ThumbnailGeneratingOptions thumbnailGeneratingOptions) throws Exception {
        if (bArr == null) {
            return null;
        }
        com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(bArr);
        try {
            int iZzXVo = (int) thumbnailGeneratingOptions.zzXVo();
            int iZzXVo2 = (int) (thumbnailGeneratingOptions.zzXVo() >>> 32);
            com.aspose.words.internal.zzXN zzxn2 = new com.aspose.words.internal.zzXN(iZzXVo, iZzXVo2);
            zzxn.zzZ(new com.aspose.words.internal.zzZQ5(0, 0, zzxn.getWidth(), zzxn.getHeight()), zzxn2, new com.aspose.words.internal.zzZQ5(0, 0, iZzXVo, iZzXVo2));
            return zzxn2;
        } finally {
            zzxn.dispose();
        }
    }
}
