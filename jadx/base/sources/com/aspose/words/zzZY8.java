package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZY8 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("commentId");

    public static void zzE(zzZXT zzzxt) throws Exception {
        zzZW1 zzzw1ZzNJ = zzzxt.zzNJ(zzzxt.zzZmp().zzZkK());
        if (zzzw1ZzNJ == null) {
            return;
        }
        zzzxt.zzZqn().zzqU(16);
        while (zzzw1ZzNJ.zzQ("commentsIds")) {
            if (zzUR.zzTP(zzzw1ZzNJ.getLocalName()) != 0) {
                zzzw1ZzNJ.zzk();
            } else {
                zzzxt.zzXS(zzYU3.zzGV(zzzw1ZzNJ.zzV("paraId", "0")), zzYU3.zzGV(zzzw1ZzNJ.zzV("durableId", "0")));
            }
        }
        zzzxt.zzZmi();
    }
}
