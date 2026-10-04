package com.aspose.words.internal;

import com.aspose.words.Cluster;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZZI {
    private float zzHi;
    private boolean zzYS;
    private boolean zzcU = zzrw();
    private ArrayList<zzZZG> zzpe;
    private zzPM zzpf;
    private String zzpg;

    public zzZZI(String str, zzPM zzpm, boolean z, ArrayList<zzZZG> arrayList) {
        this.zzpg = str;
        this.zzpf = zzpm;
        this.zzYS = z;
        this.zzpe = arrayList;
        this.zzHi = zzN(arrayList);
    }

    private static float zzN(ArrayList<zzZZG> arrayList) {
        Iterator<zzZZG> it = arrayList.iterator();
        float fZzyp = 0.0f;
        while (it.hasNext()) {
            fZzyp += it.next().zzyp();
        }
        return fZzyp;
    }

    private boolean zzrw() {
        StringBuilder sb = new StringBuilder();
        for (zzZZG zzzzg : this.zzpe) {
            if (zzzzg.zzZr() != this.zzpf || !zzzzg.zzru()) {
                return false;
            }
            for (Cluster cluster : zzzzg.zzZh()) {
                for (int i : cluster.getCodepoints()) {
                    zzZNH.zzU(sb, zzZVS.zzS7(i));
                }
            }
        }
        return zzZKN.zzX(sb.toString(), this.zzpg, zzZOF.ORDINAL$4894b8c8);
    }

    public final float getWidth() {
        return this.zzHi;
    }

    public final boolean zzZz() {
        return this.zzYS;
    }

    public final boolean zzru() {
        return this.zzcU;
    }

    public final zzPM zzrv() {
        return this.zzpf;
    }

    public final ArrayList<zzZZG> zzyD() {
        return this.zzpe;
    }

    public final String zzyE() {
        return this.zzpg;
    }
}
