package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJ7 {
    private boolean zzXAS;
    private boolean zzXAT;
    private boolean zzXB2;
    private int zzXB1 = 0;
    private zzYJ6[] zzXAR = {zzYJ6.zzXAL, zzYJ6.zzXAK, zzYJ6.zzXAJ, zzYJ6.zzXAI, zzYJ6.zzXAH};
    private int zzXAQ = 5;
    private float zzXAP = 0.576f;
    private HashMap<String, com.aspose.words.internal.zzPV> zzZvf = new HashMap<>();
    private com.aspose.words.internal.zzPV zzXAO = zzYJB.zzXBv;
    private com.aspose.words.internal.zzPV zzXAN = zzYJB.zzXBt;
    private com.aspose.words.internal.zzPV zzXAM = zzYJB.zzXBu;

    private com.aspose.words.internal.zzPV zzSX(String str) {
        com.aspose.words.internal.zzPV zzpv = (com.aspose.words.internal.zzPV) com.aspose.words.internal.zzQW.zzZ(this.zzZvf, str);
        if (this.zzZvf.containsKey(str) && !com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzI0)) {
            return zzpv;
        }
        com.aspose.words.internal.zzPV zzpvZzpw = zzYJB.zzpw(this.zzZvf.size());
        zzW(str, zzpvZzpw);
        return zzpvZzpw;
    }

    private static String zzU(zzYEF zzyef, int i) {
        if (i == 0) {
            if (zzyef.zzYrV()) {
                return zzyef.getInsertRevision().getAuthor();
            }
            return null;
        }
        if (i == 1) {
            if (zzyef.zzYrW()) {
                return zzyef.getDeleteRevision().getAuthor();
            }
            return null;
        }
        if (i == 2) {
            if (zzyef.zzXS4()) {
                return zzyef.getMoveFromRevision().getAuthor();
            }
            return null;
        }
        if (i == 3) {
            if (zzyef.zzXS3()) {
                return zzyef.getMoveToRevision().getAuthor();
            }
            return null;
        }
        if (i == 4 && zzyef.zz6D()) {
            return zzyef.zzYsN().getAuthor();
        }
        return null;
    }

    private void zzW(String str, com.aspose.words.internal.zzPV zzpv) {
        this.zzZvf.put(str, zzpv);
    }

    private int zzps(int i) {
        return this.zzXAR[i].zzYkP();
    }

    private com.aspose.words.internal.zzPV zzpt(int i) {
        return zzYJB.zzpx(this.zzXAR[i].getColor());
    }

    public final int getShowInBalloons() {
        return this.zzXB1;
    }

    public final void setShowInBalloons(int i) {
        this.zzXB1 = i;
    }

    public final zzYEF zzB(zzYEF zzyef) {
        String strZzU;
        com.aspose.words.internal.zzPV zzpvZzSX;
        com.aspose.words.internal.zzPV zzpvZzpt;
        if (!zzyef.hasRevisions()) {
            return zzyef;
        }
        zzYEF zzyef2 = zzyef;
        for (int i = 0; i <= 4; i++) {
            int iZzps = zzps(i);
            if (iZzps != 0 && (strZzU = zzU(zzyef, i)) != null && (zzpvZzSX = zzSX(strZzU)) != null && (zzpvZzpt = zzpt(i)) != null) {
                if (!com.aspose.words.internal.zzPV.zzZ(zzpvZzpt, com.aspose.words.internal.zzPV.zzI0)) {
                    zzpvZzSX = zzpvZzpt;
                }
                if (com.aspose.words.internal.zzZKO.zzA(zzyef2, zzyef)) {
                    zzyef2 = (zzYEF) zzyef.zzbn();
                }
                zzyef2.zzY(zzpvZzSX);
                switch (iZzps) {
                    case 2:
                        zzyef2.zzQ(60, zzZU.zzZF6);
                        zzyef2.zzY(zzZU.zzZF6);
                        break;
                    case 3:
                        zzyef2.zzQ(70, zzZU.zzZF6);
                        zzyef2.zzX(zzZU.zzZF6);
                        break;
                    case 4:
                        zzyef2.setUnderline(1);
                        zzyef2.zzZW(zzpvZzSX);
                        break;
                    case 5:
                        zzyef2.setUnderline(3);
                        zzyef2.zzZW(zzpvZzSX);
                        break;
                    case 6:
                        zzyef2.zzU(zzZU.zzZF7);
                        zzyef2.zzQ(80, zzZU.zzZF6);
                        break;
                    case 7:
                        zzyef2.zzQ(80, zzZU.zzZF7);
                        zzyef2.zzU(zzZU.zzZF6);
                        break;
                    case 8:
                        zzyef2.zzZ(zzZU.zzZF6);
                        break;
                }
            }
        }
        return zzyef2;
    }

    public final void zzRs(boolean z) {
        this.zzXB2 = z;
    }

    public final void zzRt(boolean z) {
        this.zzXAS = z;
    }

    public final void zzRu(boolean z) {
        this.zzXAT = z;
    }

    public final void zzYa(float f) {
        this.zzXAP = f;
    }

    public final boolean zzYkQ() {
        com.aspose.words.internal.zzPV zzpv;
        return (this.zzXAS || (zzpv = this.zzXAO) == null || com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzHZ) || this.zzXAQ == 0) ? false : true;
    }

    public final int zzYkR() {
        return this.zzXAQ;
    }

    public final float zzYkS() {
        return this.zzXAP;
    }

    public final com.aspose.words.internal.zzPV zzYkT() {
        return this.zzXAM;
    }

    public final com.aspose.words.internal.zzPV zzYkU() {
        return this.zzXAN;
    }

    public final com.aspose.words.internal.zzPV zzYkV() {
        return this.zzXAO;
    }

    public final boolean zzYkW() {
        return this.zzXB2;
    }

    public final boolean zzYkX() {
        return this.zzXAT;
    }

    public final void zzZ(zzYJ6[] zzyj6Arr) {
        for (int i = 0; i < 5; i++) {
            this.zzXAR[i] = zzyj6Arr[i];
        }
    }

    public final void zzZN(com.aspose.words.internal.zzPV zzpv) {
        this.zzXAM = zzpv;
        this.zzXAN = zzYJB.zzZP(zzpv);
    }

    public final void zzZO(com.aspose.words.internal.zzPV zzpv) {
        this.zzXAO = zzpv;
    }

    public final void zzpr(int i) {
        this.zzXAQ = i;
    }
}
