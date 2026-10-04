package com.aspose.words.internal;

import com.aspose.words.Cluster;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZH {
    private zzF8 zzFg;
    private zzGQ zzFh;
    private boolean zzHK;
    private boolean zzYS;
    private zzPM zzYX;
    private String zzZi;
    private int zzcP;
    private zzPM zzcQ;
    private zzY3[] zzcT;
    private ArrayList<zzZZG> zzpe = new ArrayList<>();
    private zzZYE zzcS = new zzZYE("");
    private ArrayList<zzZZG> zzXf = new ArrayList<>();
    private StringBuilder zzcR = new StringBuilder();

    public static zzZZI zzZ(zzPM zzpm, String str, boolean z, boolean z2, zzGQ zzgq, zzF8 zzf8) throws Exception {
        zzZZH zzzzh = new zzZZH();
        zzzzh.zzYX = zzpm;
        zzzzh.zzZi = str;
        zzzzh.zzYS = z;
        zzzzh.zzHK = z2;
        zzzzh.zzFh = zzgq;
        zzzzh.zzFg = zzf8;
        zzzzh.zzrt();
        return new zzZZI(str, zzpm, z, zzzzh.zzpe);
    }

    private zzZZG zzZy(boolean z) throws Exception {
        String string = this.zzcR.toString();
        Cluster[] clusterArrZzZ = this.zzFg.zzZ(string, this.zzcQ, z, this.zzHK);
        if (z) {
            zzZKV.zzZ(clusterArrZzZ, clusterArrZzZ.length);
        }
        return new zzZZG(string, z, this.zzcQ, clusterArrZzZ, this.zzcP);
    }

    private void zzZz(boolean z) throws Exception {
        if (this.zzcR.length() == 0) {
            return;
        }
        zzZQG.zzZ(this.zzXf, zzZy(z));
        this.zzcR = new StringBuilder();
        this.zzcQ = null;
    }

    private void zzrt() throws Exception {
        zzZXH zzzxhZzZ;
        zzY3[] zzy3ArrZzW = zzY9.zzW(this.zzZi, this.zzYS);
        this.zzcT = zzy3ArrZzW;
        int i = -1;
        for (zzY3 zzy3 : zzy3ArrZzW) {
            this.zzXf.clear();
            this.zzcS.setText(zzy3.getText());
            while (this.zzcS.hasNext()) {
                int iIntValue = this.zzcS.next().intValue();
                i++;
                zzPM zzpm = this.zzYX;
                if (zzK5.zzZ(iIntValue, zzpm.zzPl()) && (zzzxhZzZ = this.zzFh.zzZ(this.zzYX.zzPl(), iIntValue, true)) != null) {
                    zzpm = new zzPM(zzpm.zzPg(), zzpm.zzPk(), zzzxhZzZ);
                }
                zzPM zzpm2 = this.zzcQ;
                if (zzpm2 == null) {
                    zzZ(i, zzpm);
                } else if (zzpm2.zzPl() != zzpm.zzPl()) {
                    zzZz(zzy3.zzXn());
                    zzZ(i, zzpm);
                }
                zzZNH.zzU(this.zzcR, zzZVS.zzS7(iIntValue));
            }
            zzZz(zzy3.zzXn());
            if (zzy3.zzXn()) {
                Collections.reverse(this.zzXf);
            }
            if (this.zzYS) {
                this.zzpe.addAll(0, this.zzXf);
            } else {
                zzZQG.zzZ((ArrayList) this.zzpe, (Iterable) this.zzXf);
            }
        }
    }

    private void zzZ(int i, zzPM zzpm) {
        this.zzcP = i;
        this.zzcQ = zzpm;
        this.zzcR = new StringBuilder();
    }
}
