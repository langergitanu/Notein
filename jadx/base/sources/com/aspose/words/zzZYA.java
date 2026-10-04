package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("commentEx");

    public static void zzE(zzZXT zzzxt) throws Exception {
        zzZW1 zzzw1ZzNJ = zzzxt.zzNJ(zzzxt.zzZmp().zzZkL());
        if (zzzw1ZzNJ == null) {
            return;
        }
        while (zzzw1ZzNJ.zzQ("commentsEx")) {
            if (zzUR.zzTP(zzzw1ZzNJ.getLocalName()) != 0) {
                zzzw1ZzNJ.zzk();
            } else {
                zzzxt.zzQ(zzYU3.zzGV(zzzw1ZzNJ.zzV("paraId", "00000000")), zzYU3.zzGV(zzzw1ZzNJ.zzV("paraIdParent", "00000000")), !"0".equals(zzzw1ZzNJ.zzV("done", "0")));
            }
        }
        zzzxt.zzZmi();
    }
}
