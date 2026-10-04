package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXM {
    public static void zzQ(com.aspose.words.internal.zzXZ zzxz, int i) throws Exception {
        int i2 = i % 4;
        if (i2 == 0) {
            return;
        }
        for (int i3 = 0; i3 < 4 - i2; i3++) {
            zzxz.writeByte((byte) 0);
        }
    }

    public static String zzZ(zzZDK zzzdk, HtmlSaveOptions htmlSaveOptions) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            zzZI0 zzzi0 = new zzZI0(zzzor, htmlSaveOptions);
            zzzdk.zzZ(zzzi0);
            zzzi0.flush();
            return htmlSaveOptions.zzZ9Y().zzZn(com.aspose.words.internal.zzZYQ.zzZX(zzzor)).replace(" />", "/>");
        } finally {
            zzzor.close();
        }
    }
}
