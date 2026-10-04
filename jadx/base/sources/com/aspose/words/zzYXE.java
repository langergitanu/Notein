package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXE {
    public static void zzZ(com.aspose.words.internal.zzZOW zzzow, zzYXF zzyxf) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzyxf.zzZ(new com.aspose.words.internal.zzZOW(zzzor));
        zzzow.zzl(((int) zzzor.getLength()) + 20);
        byte[] bArrZzWy = zzzor.zzWy();
        zzzow.writeBytes(zzyxf.zzZ9R().toByteArray());
        zzzow.zzV(bArrZzWy, 0, bArrZzWy.length);
    }
}
