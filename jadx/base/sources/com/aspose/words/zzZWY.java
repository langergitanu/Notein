package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWY {
    public static void zzU(zzZXR zzzxr) throws Exception {
        DocumentBase document = zzzxr.getDocument();
        if (document.zzZq1().getCount() == 0 || zzzxr.getCompliance() == 0) {
            return;
        }
        zzZYD zzzydZzJ = zzzxr.zzJ("people.xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.people+xml", zzzxr.zzZmp().zzZkx());
        zzzxr.zzY(zzzydZzJ);
        zzzydZzJ.zzNU("w15:people");
        Iterator<zzYLT> it = document.zzZq1().iterator();
        while (it.hasNext()) {
            zzZ(it.next(), zzzxr);
        }
        zzzydZzJ.endDocument();
        zzzxr.zzZlX();
    }

    private static void zzZ(zzYLT zzylt, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("w15:person");
        zzzydZzZlV.zz0("w15:author", zzylt.getAuthor());
        zzzydZzZlV.zzY("w15:presenceInfo");
        zzzydZzZlV.zz0("w15:providerId", zzZXP.zzEO(zzylt.zzYnt()));
        zzzydZzZlV.zzX("w15:userId", zzylt.zzYns());
        zzzydZzZlV.zzp();
        zzzydZzZlV.zzp();
    }
}
