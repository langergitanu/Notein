package com.aspose.words;

import com.google.firebase.messaging.Constants;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzDA extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(Constants.MessagePayloadKeys.FROM, "to", "ext", "cxnSp", "sp", "grpSp", "pic", "graphicFrame", "x", "cx", "y", TranslateLanguage.WELSH, "absSizeAnchor", "relSizeAnchor");
    private zzZXT zzZfi;

    private zzDA(zzZXT zzzxt) {
        this.zzZfi = zzzxt;
    }

    private static void zzE(zzZXT zzzxt) throws Exception {
        zzDA zzda = new zzDA(zzzxt);
        while (zzzxt.zzZsD().zzQ("userShapes")) {
            zzda.zzZI6();
        }
    }

    private static int zzRh(String str) {
        return zzUR.zzTP(str) != 12 ? 1 : 0;
    }

    public static void zzZ(zzZXT zzzxt, String str) throws Exception {
        zzzxt.zzNK(str);
        zzE(zzzxt);
        zzzxt.zzZmi();
    }

    private long zzZI5() {
        String localName = this.zzZfi.zzZsD().getLocalName();
        float fZzZ = (float) this.zzZfi.zzZsD().zzZ("cx", 0.0d);
        double dZzZ = this.zzZfi.zzZsD().zzZ(TranslateLanguage.WELSH, 0.0d);
        while (true) {
            float f = (float) dZzZ;
            while (this.zzZfi.zzZsD().zzQ(localName)) {
                switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                    case 8:
                    case 9:
                        fZzZ = (float) com.aspose.words.internal.zzJB.parseDouble(this.zzZfi.zzZsD().readString());
                        break;
                    case 10:
                    case 11:
                        break;
                    default:
                        zz39.zzK(this.zzZfi.zzZsD());
                        break;
                }
            }
            return com.aspose.words.internal.zzZPY.zzG(fZzZ, f);
            dZzZ = com.aspose.words.internal.zzJB.parseDouble(this.zzZfi.zzZsD().readString());
        }
    }

    private void zzZI6() throws Exception {
        String localName = this.zzZfi.zzZsD().getLocalName();
        ShapeBase shapeBaseZzG = null;
        long jZzZI5 = 0;
        long jZzZI52 = 0;
        while (this.zzZfi.zzZsD().zzQ(localName)) {
            switch (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName())) {
                case 0:
                    jZzZI5 = zzZI5();
                    break;
                case 1:
                case 2:
                    jZzZI52 = zzZI5();
                    break;
                case 3:
                case 4:
                    shapeBaseZzG = zz1S.zzG(this.zzZfi);
                    break;
                case 5:
                    shapeBaseZzG = zzBJ.zzx(this.zzZfi);
                    break;
                case 6:
                    shapeBaseZzG = zz3U.zzG(this.zzZfi);
                    break;
                case 7:
                    zz39.zzL(this.zzZfi.zzZsD());
                    break;
                default:
                    zz39.zzK(this.zzZfi.zzZsD());
                    break;
            }
        }
        if (shapeBaseZzG != null) {
            if (shapeBaseZzG.isGroup() && !shapeBaseZzG.hasChildNodes()) {
                shapeBaseZzG.remove();
                return;
            }
            shapeBaseZzG.zzXh(jZzZI5);
            shapeBaseZzG.zzXg(jZzZI52);
            shapeBaseZzG.zzm7(zzRh(localName));
        }
    }
}
