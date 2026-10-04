package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzA2 extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("spTree");

    public static GroupShape zzu(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        GroupShape groupShapeZzx = null;
        if (!"drawing".equals(zzyu4ZzZsD.getLocalName())) {
            return null;
        }
        while (zzyu4ZzZsD.zzQ("drawing")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 0) {
                zz39.zzL(zzyu4ZzZsD);
            } else {
                groupShapeZzx = zzBJ.zzx(zzzxt);
            }
        }
        return groupShapeZzx;
    }
}
