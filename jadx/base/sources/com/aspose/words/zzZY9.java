package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZY9 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("commentExtensible");

    public static void zzE(zzZXT zzzxt) throws Exception {
        zzZW1 zzzw1ZzNJ = zzzxt.zzNJ(zzzxt.zzZmp().zzZkJ());
        if (zzzw1ZzNJ == null) {
            return;
        }
        zzzxt.zzZqn().zzqU(17);
        while (zzzw1ZzNJ.zzQ("commentsExtensible")) {
            if (zzUR.zzTP(zzzw1ZzNJ.getLocalName()) != 0) {
                zzzw1ZzNJ.zzk();
            } else {
                zzZR(zzzxt);
            }
        }
        zzzxt.zzZmi();
    }

    private static void zzZR(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzUS zzusZzFx = zzzxt.zzFx(zzYU3.zzGV(zzyu4ZzZsD.zzV("durableId", "0")));
        if (zzusZzFx != null) {
            zzusZzFx.zzu(com.aspose.words.internal.zzJB.zzZy(zzyu4ZzZsD.zzV("dateUtc", "")));
            zzusZzFx.zzYk(zzyu4ZzZsD.zzX("intelligentPlaceholder", false));
        }
        while (zzyu4ZzZsD.zzQ("commentExtensible")) {
            zzyu4ZzZsD.zzk();
        }
    }
}
