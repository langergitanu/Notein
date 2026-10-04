package com.aspose.words;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zz8Q extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(NoteMeta.PROPERTY_TITLE, "desc", "catLst", "styleLbl", "scene3d", "extLst", "style", "txPr", "sp3d", "flatTx");
    private zzYU4 zzZ7n;
    private zzYO3 zzZ88;
    private zzZXT zzZfi;

    private zz8Q(zzZXT zzzxt, zzYO3 zzyo3) {
        this.zzZfi = zzzxt;
        this.zzZ7n = zzzxt.zzZsD();
        this.zzZ88 = zzyo3;
    }

    public static zz8S zzY(zzZXT zzzxt, zzYO3 zzyo3) throws Exception {
        return new zz8Q(zzzxt, zzyo3).zzZCs();
    }

    private zz7R zzZCp() {
        zz7R zz7r = new zz7R();
        zz7r.zzXU(this.zzZ7n.zzS("z", this.zzZ88));
        return zz7r;
    }

    private zz8M zzZCq() throws Exception {
        zz8M zz8m = new zz8M();
        while (this.zzZ7n.zzQ("txPr")) {
            int iZzTP = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP == 8) {
                zz8m.zzZ(zz2R.zzW(this.zzZfi, this.zzZ88));
            } else if (iZzTP != 9) {
                zz39.zzK(this.zzZ7n);
            } else {
                zz8m.zzZ(zzZCp());
            }
        }
        return zz8m;
    }

    private zz18 zzZCr() throws Exception {
        zz18 zz18Var = new zz18();
        zz18Var.setName(this.zzZ7n.zzV("name", ""));
        while (this.zzZ7n.zzQ("styleLbl")) {
            switch (zzUR.zzTP(this.zzZ7n.getLocalName())) {
                case 4:
                    zz18Var.zzX(zz2R.zzX(this.zzZfi, this.zzZ88));
                    break;
                case 5:
                    zz18Var.setExtensions(zz81.zzd(this.zzZfi));
                    break;
                case 6:
                    zz18Var.zzZ(zz1J.zzQ(this.zzZ7n, this.zzZ88));
                    break;
                case 7:
                    zz18Var.zzZ(zzZCq());
                    break;
                case 8:
                    zz18Var.zzX(zz2R.zzW(this.zzZfi, this.zzZ88));
                    break;
                default:
                    zz39.zzK(this.zzZ7n);
                    break;
            }
        }
        return zz18Var;
    }

    private zz8S zzZCs() throws Exception {
        if (!"styleDef".equals(this.zzZ7n.getLocalName())) {
            return null;
        }
        zz8S zz8s = new zz8S();
        zz8s.zzT6(this.zzZ7n.zzV("uniqueId", ""));
        zz8s.zzQA(this.zzZ7n.zzV("minVer", ""));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        while (this.zzZ7n.zzQ("styleDef")) {
            int iZzTP = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP == 0) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz8T>) arrayList2, zzAP.zzQ(this.zzZ7n));
            } else if (iZzTP == 1) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz8T>) arrayList3, zzAP.zzQ(this.zzZ7n));
            } else if (iZzTP == 2) {
                zz8s.zzZ(zzAP.zzP(this.zzZ7n));
            } else if (iZzTP == 3) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz18>) arrayList, zzZCr());
            } else if (iZzTP == 4) {
                zz8s.zzX(zz2R.zzX(this.zzZfi, this.zzZ88));
            } else if (iZzTP != 5) {
                zz39.zzK(this.zzZ7n);
            } else {
                zz8s.setExtensions(zz81.zzd(this.zzZfi));
            }
        }
        zz8s.zzZ((zz18[]) arrayList.toArray(new zz18[0]));
        zz8s.zzZ((zz8T[]) arrayList2.toArray(new zz8T[0]));
        zz8s.zzY((zz8T[]) arrayList3.toArray(new zz8T[0]));
        return zz8s;
    }
}
