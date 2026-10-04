package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzML {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("style", "link", "base");
    private String zzZp0;
    private zzNP zzZp1;
    private zzZFF zzZp2;
    private com.aspose.words.internal.zzIM<String> zzZp3 = new com.aspose.words.internal.zzIM<>();
    private ArrayList<zzN0> zzZp4;
    private ArrayList<zzLT> zzZp5;
    private boolean zzZpf;
    private int zzZr3;

    public zzML(String str, zzZFF zzzff, int i, boolean z) {
        this.zzZp2 = zzzff;
        this.zzZp0 = str;
        if (str == null) {
            this.zzZp0 = "";
        }
        this.zzZr3 = i;
        this.zzZp1 = new zzNP();
        this.zzZpf = z;
    }

    private void zzS(zzZBM zzzbm) throws Exception {
        if (com.aspose.words.internal.zzZYD.zzi(zzzbm.getAttributeValue(C18437z2.f56754h, "text/css"), "text/css") && com.aspose.words.internal.zzZYD.zzi(zzzbm.getAttributeValue("rel", ""), "stylesheet") && !com.aspose.words.internal.zzZKN.equals(zzzbm.zzKM("disabled"), "")) {
            String strZzJT = zzZDY.zzJT(zzzbm.getAttributeValue("href", ""));
            if (strZzJT.length() <= 0 || !zzMV.zzSn(zzzbm.getAttributeValue("media", "")).zzhN()) {
                return;
            }
            zzZu(this.zzZp0, strZzJT);
        }
    }

    private void zzT(zzZBM zzzbm) throws Exception {
        String strZzKM = zzzbm.zzKM(C18437z2.f56754h);
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzKM) || com.aspose.words.internal.zzZYD.zzi(strZzKM, "text/css")) {
            zzZt(zzzbm.zzZ2F(), this.zzZp0);
        }
    }

    private void zzU(zzZBM zzzbm) throws Exception {
        int iZzTP = zzUR.zzTP(zzzbm.zzZTQ());
        if (iZzTP == 0) {
            zzT(zzzbm);
        } else if (iZzTP == 1) {
            zzS(zzzbm);
        } else {
            if (iZzTP != 2) {
                return;
            }
            this.zzZp0 = zzZDY.zzJT(zzzbm.getAttributeValue("href", ""));
        }
    }

    private void zzV(zzZBM zzzbm) throws Exception {
        zzZBM zzzbmZzZ2P = zzzbm.zzZ2P();
        while (zzzbmZzZ2P != null) {
            zzU(zzzbmZzZ2P);
            zzZBM zzzbmZzZ2P2 = zzzbmZzZ2P.zzZ2P();
            if (zzzbmZzZ2P2 == null && (zzzbmZzZ2P2 = zzzbmZzZ2P.zzZ2N()) == null) {
                for (zzZBM zzzbmZzZ2Q = zzzbmZzZ2P.zzZ2Q(); zzzbmZzZ2Q != null && zzzbmZzZ2Q != zzzbm; zzzbmZzZ2Q = zzzbmZzZ2Q.zzZ2Q()) {
                    zzzbmZzZ2P2 = zzzbmZzZ2Q.zzZ2N();
                    if (zzzbmZzZ2P2 == null) {
                    }
                }
                zzzbmZzZ2P = null;
            }
            zzzbmZzZ2P = zzzbmZzZ2P2;
        }
    }

    private void zzZ(zzMG zzmg, String str) throws Exception {
        int type = zzmg.getType();
        if (type == 0) {
            zzZ((zzLT) zzmg, str);
            return;
        }
        if (type == 1) {
            zzOS zzos = (zzOS) zzmg;
            if (zzos.zzZW1().zzhN()) {
                zzZu(str, zzos.getUrl());
                return;
            }
            return;
        }
        if (type == 2) {
            zzZ((zzNU) zzmg, str);
        } else {
            if (type != 3) {
                return;
            }
            zzZ((zzN0) zzmg, str);
        }
    }

    private void zzZVw() {
        zzLT zzlt;
        com.aspose.words.internal.zzZYG zzzyg = new com.aspose.words.internal.zzZYG();
        boolean z = false;
        for (zzLT zzlt2 : this.zzZp5) {
            for (zzMD zzmd : zzlt2.zzZUV()) {
                String strZzZXu = zzmd.zzZXu();
                zzLT zzlt3 = (zzLT) zzzyg.get(strZzZXu);
                if (zzlt3 != null) {
                    zzPR zzpr = new zzPR(zzlt3.zzZWe());
                    zzpr.zzN(zzlt2.zzZWe());
                    zzlt = new zzLT(zzlt3.zzZUV(), zzpr.zzZWe());
                    z = true;
                } else {
                    zzlt = new zzLT(zzlt2.zzZUV().length == 1 ? zzlt2.zzZUV() : new zzMD[]{zzmd}, zzlt2.zzZWe());
                }
                zzzyg.set(strZzZXu, zzlt);
            }
        }
        if (z) {
            this.zzZp5.clear();
            Iterator it = zzzyg.zzCJ().iterator();
            while (it.hasNext()) {
                this.zzZp5.add((zzLT) it.next());
            }
        }
    }

    private void zzZt(String str, String str2) throws Exception {
        Iterator<zzMG> it = zzMV.zzZ(str, this.zzZr3, this.zzZp1, this.zzZpf).iterator();
        while (it.hasNext()) {
            zzZ(it.next(), str2);
        }
    }

    private void zzZu(String str, String str2) throws Exception {
        com.aspose.words.internal.zzZYD.zzXk(str2);
        String strZz6 = com.aspose.words.internal.zzZVR.zz6(str, str2);
        if (this.zzZp3.contains(strZz6)) {
            return;
        }
        this.zzZp3.add(strZz6);
        String strZzZ2 = this.zzZp2.zzZ2(str, str2);
        if (strZzZ2 != null) {
            zzZt(strZzZ2, com.aspose.words.internal.zzZVR.zzWy(strZz6));
        }
    }

    public final void zzW(zzZBM zzzbm) throws Exception {
        this.zzZp5 = new ArrayList<>();
        this.zzZp4 = new ArrayList<>();
        zzV(zzzbm);
        zzZVw();
    }

    public final ArrayList<zzN0> zzZVu() {
        return this.zzZp4;
    }

    public final ArrayList<zzLT> zzZVv() {
        return this.zzZp5;
    }

    private void zzZ(zzNU zznu, String str) throws Exception {
        if (zznu.zzZVR().zzhN()) {
            for (zzMG zzmg : zznu.zzZVQ()) {
                zzZ(zzmg, str);
            }
        }
    }

    private void zzZ(zzN0 zzn0, String str) {
        this.zzZp4.add(zzn0.zzSq(str));
    }

    private void zzZ(zzLT zzlt, String str) {
        this.zzZp5.add(zzlt.zzSc(str));
    }
}
