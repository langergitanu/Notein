package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZW3 {
    public static void zzY(zzZXR zzzxr, boolean z) throws Exception {
        int i;
        DocumentBase document = zzzxr.getDocument();
        zzZZF zzzzfZzZpV = document.zzZpV();
        zzZYD zzzydZzJ = zzzxr.zzJ("webSettings.xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.webSettings+xml", zzzxr.zzZmp().zzZkP());
        zzzydZzJ.zzZmV();
        if (document.getNodeType() == 1 && z) {
            zzYUH.zzY((Document) document, zzzydZzJ);
        }
        zzzydZzJ.zzYz("w:encoding", zzzzfZzZpV.zzYVH);
        if (document.getNodeType() == 1) {
            zzYV3.zzZ((Document) document, zzzydZzJ, true, zzzxr.zzZmp().zzZko());
        }
        if (zzzzfZzZpV.zzYVG) {
            zzzydZzJ.zzY("w:optimizeForBrowser");
            if (zzzxr.getCompliance() != 0 && (i = zzzzfZzZpV.zzYVF) != 0) {
                zzzydZzJ.zz0("target", zzZXQ.zzFk(i));
            }
            zzzydZzJ.zzp();
        }
        zzzydZzJ.zze("w:relyOnVML", zzzzfZzZpV.zzYVE);
        zzzydZzJ.zze("w:allowPNG", zzzzfZzZpV.zzYVD);
        zzzydZzJ.zze("w:doNotRelyOnCSS", zzzzfZzZpV.zzYVC);
        zzzydZzJ.zze("w:doNotSaveAsSingleFile", zzzzfZzZpV.zzYVB);
        zzzydZzJ.zze("w:doNotOrganizeInFolder", zzzzfZzZpV.zzYVA);
        zzzydZzJ.zze("w:doNotUseLongFileNames", zzzzfZzZpV.zzYVz);
        int i2 = zzzzfZzZpV.zzYVy;
        if (i2 != 96) {
            zzzydZzJ.zzZl("w:pixelsPerInch", i2);
        }
        int i3 = zzzzfZzZpV.zzYVx;
        if (i3 != 3) {
            zzzydZzJ.zzYz("w:targetScreenSz", zzY8T.zzkP(i3));
        }
        zzzydZzJ.endDocument();
    }
}
