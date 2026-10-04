package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZW4 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("frameset", "divs", "encoding", "optimizeForBrowser", "relyOnVML", "allowPNG", "doNotRelyOnCSS", "doNotSaveAsSingleFile", "doNotOrganizeInFolder", "doNotUseLongFileNames", "pixelsPerInch", "targetScreenSz");

    public static void zzE(zzZXT zzzxt) throws Exception {
        zzZW1 zzzw1ZzNJ = zzzxt.zzNJ(zzzxt.zzZmp().zzZkP());
        if (zzzw1ZzNJ == null) {
            return;
        }
        DocumentBase document = zzzxt.getDocument();
        zzZZF zzzzfZzZpV = document.zzZpV();
        while (zzzw1ZzNJ.zzQ("webSettings")) {
            switch (zzUR.zzTP(zzzw1ZzNJ.getLocalName())) {
                case 0:
                    Frameset frameset = new Frameset();
                    frameset.zzAu(2);
                    ((Document) document).zzZ(frameset);
                    zzYV4.zzZ(zzzxt, frameset, true);
                    break;
                case 1:
                    zzYUI.zzt(zzzxt);
                    break;
                case 2:
                    zzzzfZzZpV.zzYVH = zzzw1ZzNJ.zzV("val", null);
                    break;
                case 3:
                    zzzzfZzZpV.zzYVG = zzzw1ZzNJ.zzYyD();
                    while (zzzw1ZzNJ.zzi()) {
                        if ("target".equals(zzzw1ZzNJ.getLocalName())) {
                            zzzxt.zzZqn().zzYrc();
                            zzzzfZzZpV.zzYVF = zzZXQ.zzNx(zzzw1ZzNJ.getValue());
                        }
                    }
                    break;
                case 4:
                    zzzzfZzZpV.zzYVE = zzzw1ZzNJ.zzYyD();
                    break;
                case 5:
                    zzzzfZzZpV.zzYVD = zzzw1ZzNJ.zzYyD();
                    break;
                case 6:
                    zzzzfZzZpV.zzYVC = zzzw1ZzNJ.zzYyD();
                    break;
                case 7:
                    zzzzfZzZpV.zzYVB = zzzw1ZzNJ.zzYyD();
                    break;
                case 8:
                    zzzzfZzZpV.zzYVA = zzzw1ZzNJ.zzYyD();
                    break;
                case 9:
                    zzzzfZzZpV.zzYVz = zzzw1ZzNJ.zzYyD();
                    break;
                case 10:
                    zzzzfZzZpV.zzYVy = zzzw1ZzNJ.zzYyE();
                    break;
                case 11:
                    zzzzfZzZpV.zzYVx = zzY8T.zzAM(zzzw1ZzNJ.zzV("val", null));
                    break;
                default:
                    zzzw1ZzNJ.zzk();
                    break;
            }
        }
        zzzxt.zzZmi();
    }
}
