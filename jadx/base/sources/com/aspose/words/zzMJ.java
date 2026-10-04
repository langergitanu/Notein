package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
final class zzMJ {
    private zzQ3 zzZoS;
    private com.aspose.words.internal.zzPV zzZoT;
    private ArrayList<zzYJJ> zzZoU = new ArrayList<>();
    private zzOM zzZoV;
    private zzQJ zzZoW;
    private zzK5 zzZoX;
    private zzNY zzZoY;
    private com.aspose.words.internal.zzPV zzZqO;
    private int zzZr3;

    public zzMJ(Collection<zzLT> collection, zzK5 zzk5, zzQJ zzqj, zzOM zzom, zzQ3 zzq3, int i, com.aspose.words.internal.zzPV zzpv) {
        this.zzZoY = new zzNY(collection, i);
        this.zzZoX = zzk5;
        this.zzZoW = zzqj;
        this.zzZoV = zzom;
        this.zzZr3 = i;
        this.zzZqO = zzpv;
        this.zzZoS = zzq3;
    }

    private zzYJJ zzMi(int i) {
        return (i <= 0 || i > this.zzZoU.size()) ? zzYJJ.zzXC5 : (zzYJJ) C21505OooO0Oo.OooO00o(i, this.zzZoU);
    }

    private void zzX(zzPR zzpr) {
        if (this.zzZoU.size() == 0) {
            return;
        }
        zzON.zzZ(zzpr, zzMi(1).zzZWe());
    }

    private void zzY(zzPR zzpr, zzZBM zzzbm) {
        this.zzZoV.zzZ(zzpr, zzzbm);
    }

    private zzYJJ zzZVp() {
        return zzMi(this.zzZoU.size());
    }

    private zzPS zzn(ArrayList<zzLT> arrayList) {
        arrayList.size();
        if (arrayList.size() == 0) {
            return zzPS.zzZqo;
        }
        zzPR zzpr = new zzPR();
        this.zzZoW.clear();
        for (zzLT zzlt : arrayList) {
            for (zzMD zzmd : zzlt.zzZUV()) {
                this.zzZoW.zzZ(zzlt.zzZWe(), 0, zzmd.zzZXs());
            }
        }
        this.zzZoW.zzY(zzpr);
        this.zzZoU.size();
        zzON.zzZ(zzpr, zzMj(0));
        return zzZ(zzpr, true);
    }

    public final zzPS zzMj(int i) {
        return zzMi(1).zzMj(i);
    }

    public final void zzR(zzZBM zzzbm) {
        zzZ(zzzbm, (zzPS) null);
    }

    public final void zzZ(zzZBM zzzbm, zzPS zzps) {
        zzPR zzpr = new zzPR();
        zzNZ zznzZzY = this.zzZoY.zzY(zzzbm);
        if (!zzzbm.isImplicit()) {
            zzZ(zzpr, zzzbm, zznzZzY.zzMp(0), zzps);
        }
        zzX(zzpr);
        zzY(zzpr, zzzbm);
        zzPS zzpsZzZ = zzZ(zzpr, false);
        if ("body".equals(zzzbm.zzZTQ())) {
            this.zzZoT = zzpsZzZ.zzSB("color");
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZoU, new zzYJJ(zzpsZzZ, zznzZzY));
        zzZ(zznzZzY, 1);
        zzZ(zznzZzY, 2);
    }

    public final zzK5 zzZVq() {
        return this.zzZoX;
    }

    public final zzPS zzZVr() {
        return zzMi(1).zzZVr();
    }

    public final ArrayList<zzMD> zzZVs() {
        return zzMi(1).zzZVs();
    }

    public final void zzZVt() {
        this.zzZoU.size();
        ArrayList<zzYJJ> arrayList = this.zzZoU;
        Class.getSimpleName();
        this.zzZoY.zzZP();
    }

    public final zzPS zzZWe() {
        return zzMj(0);
    }

    private void zzZ(zzNZ zznz, int i) {
        ArrayList<zzLT> arrayListZzMp = zznz.zzMp(i);
        if (arrayListZzMp.size() > 0) {
            zzPS zzpsZzn = zzn(arrayListZzMp);
            this.zzZoU.size();
            zzMi(1).zzZ(i, zzpsZzn);
        }
    }

    private void zzZ(zzPR zzpr, zzZBM zzzbm, Iterable<zzLT> iterable, zzPS zzps) {
        zzPS zzpsZz6;
        this.zzZoW.clear();
        this.zzZoW.zzZ(this.zzZoX.zzP(zzzbm), 2, zzMA.zzZoF);
        if (this.zzZr3 == 2 && "table".equals(zzzbm.zzZTQ())) {
            com.aspose.words.internal.zzPV zzpv = this.zzZoT;
            if (zzpv == null) {
                zzpv = this.zzZqO;
            }
            if (zzpv != null) {
                zzPR zzpr2 = new zzPR();
                zzpr2.zzY(new zzM3("color", new zzQC(zzpv), (byte) 0));
                this.zzZoW.zzZ(zzpr2.zzZWe(), 2, zzMA.zzZoG);
            }
        }
        for (zzLT zzlt : iterable) {
            for (zzMD zzmd : zzlt.zzZUV()) {
                this.zzZoW.zzZ(zzlt.zzZWe(), 0, zzmd.zzZXs());
            }
        }
        zzZAL zzzal = (zzZAL) com.aspose.words.internal.zzZKW.zzZ(zzzbm, zzZAL.class);
        if (zzzal != null) {
            zzpsZz6 = zzzal.zzYXf();
        } else {
            String strZzKM = zzzbm.zzKM("style");
            zzpsZz6 = com.aspose.words.internal.zzZYD.zzXk(strZzKM) ? zzMV.zz6(strZzKM, this.zzZr3) : null;
        }
        if (zzpsZz6 != null && zzpsZz6.getCount() != 0) {
            this.zzZoW.zzZ(zzpsZz6, 0, zzMA.zzZoG);
        }
        if (zzps != null) {
            this.zzZoW.zzZ(zzps, 0, zzMA.zzZoG);
        }
        this.zzZoW.zzY(zzpr);
    }

    private zzPS zzZ(zzPR zzpr, boolean z) {
        zzPS zzpsZzZWe = zzZVp().zzZWe();
        return this.zzZoS.zzZ(zzpr.zzZWe(), zzMi(1).zzZWe(), zzpsZzZWe, z);
    }
}
