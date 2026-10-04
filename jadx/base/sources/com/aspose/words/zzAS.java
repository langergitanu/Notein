package com.aspose.words;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzAS extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(NoteMeta.PROPERTY_TITLE, "desc", "catLst", "styleLbl", "extLst", "fillClrLst", "linClrLst", "effectClrLst", "txLinClrLst", "txFillClrLst", "txEffectClrLst");
    private zzYU4 zzZ7n;
    private zzYO3 zzZ88;
    private zzZXT zzZfi;

    private zzAS(zzZXT zzzxt, zzYO3 zzyo3) {
        this.zzZfi = zzzxt;
        this.zzZ7n = zzzxt.zzZsD();
        this.zzZ88 = zzyo3;
    }

    public static zzAT zzZ(zzZXT zzzxt, zzYO3 zzyo3) throws Exception {
        return new zzAS(zzzxt, zzyo3).zzZEI();
    }

    private zzAQ zzZEG() {
        String localName = this.zzZ7n.getLocalName();
        zzAQ zzaq = new zzAQ();
        zzaq.zzJp(zz9Z.zzQ3(this.zzZ7n.zzV("meth", "span")));
        zzaq.zzJq(zz9Z.zzQ2(this.zzZ7n.zzV("hueDir", "cw")));
        ArrayList arrayList = new ArrayList();
        while (this.zzZ7n.zzQ(localName)) {
            zzBW zzbwZzW = zzBR.zzW(this.zzZ7n, this.zzZ88);
            if (zzbwZzW != null) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzBW>) arrayList, zzbwZzW);
            }
        }
        zzaq.zzZ((zzBW[]) arrayList.toArray(new zzBW[0]));
        return zzaq;
    }

    private zzBO zzZEH() throws Exception {
        zzBO zzbo = new zzBO();
        zzbo.setName(this.zzZ7n.zzV("name", ""));
        while (this.zzZ7n.zzQ("styleLbl")) {
            switch (zzUR.zzTP(this.zzZ7n.getLocalName())) {
                case 4:
                    zzbo.setExtensions(zz81.zzd(this.zzZfi));
                    break;
                case 5:
                    zzbo.zzZ(zzZEG());
                    break;
                case 6:
                    zzbo.zzY(zzZEG());
                    break;
                case 7:
                    zzbo.zzX(zzZEG());
                    break;
                case 8:
                    zzbo.zzW(zzZEG());
                    break;
                case 9:
                    zzbo.zzV(zzZEG());
                    break;
                case 10:
                    zzbo.zzU(zzZEG());
                    break;
                default:
                    zz39.zzK(this.zzZ7n);
                    break;
            }
        }
        return zzbo;
    }

    private zzAT zzZEI() throws Exception {
        if (!"colorsDef".equals(this.zzZ7n.getLocalName())) {
            return null;
        }
        zzAT zzat = new zzAT();
        zzat.zzT6(this.zzZ7n.zzV("uniqueId", ""));
        zzat.zzQA(this.zzZ7n.zzV("minVer", ""));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        while (this.zzZ7n.zzQ("colorsDef")) {
            int iZzTP = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP == 0) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz8T>) arrayList2, zzAP.zzQ(this.zzZ7n));
            } else if (iZzTP == 1) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz8T>) arrayList3, zzAP.zzQ(this.zzZ7n));
            } else if (iZzTP == 2) {
                zzat.zzZ(zzAP.zzP(this.zzZ7n));
            } else if (iZzTP == 3) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzBO>) arrayList, zzZEH());
            } else if (iZzTP != 4) {
                zz39.zzK(this.zzZ7n);
            } else {
                zzat.setExtensions(zz81.zzd(this.zzZfi));
            }
        }
        zzat.zzZ((zzBO[]) arrayList.toArray(new zzBO[0]));
        zzat.zzZ((zz8T[]) arrayList2.toArray(new zz8T[0]));
        zzat.zzY((zz8T[]) arrayList3.toArray(new zz8T[0]));
        return zzat;
    }
}
