package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzTF extends zzYMD {
    private int zzVL = Integer.MIN_VALUE;
    private int zzVN = Integer.MIN_VALUE;
    private zzYMD zzZA6;
    private zzYMD zzZA7;
    private com.aspose.words.internal.zzZL zzZFE;
    private int zzZst;
    private boolean zzZsu;
    private boolean zzZsv;

    private void zzT(zzYMD zzymd) {
        zzymd.zzY(this);
        if (this.zzZA6 == null || zzymd.zz5Y() == this.zzZA6) {
            this.zzZA6 = zzymd;
        }
        if (this.zzZA7 == null || zzymd.zz5Z() == this.zzZA7) {
            this.zzZA7 = zzymd;
        }
    }

    @Override // com.aspose.words.zzYMD
    public int getHeight() throws Exception {
        return this.zzVN;
    }

    @Override // com.aspose.words.zzYMD
    public int getWidth() throws Exception {
        return this.zzVL;
    }

    public final boolean isEmpty() {
        return this.zzZA7 == null;
    }

    @Override // com.aspose.words.zzYMD
    public void setHeight(int i) throws Exception {
        this.zzVN = i;
    }

    @Override // com.aspose.words.zzYMD
    public final void setWidth(int i) {
        this.zzVL = i;
    }

    @Override // com.aspose.words.zzYMD
    public zzYMD zz5R() {
        zzTF zztf = (zzTF) super.zz5R();
        zztf.zzZA7 = null;
        zztf.zzZA6 = null;
        return zztf;
    }

    public boolean zz5T() {
        return false;
    }

    public int zz5U() {
        return 0;
    }

    public int zz5V() throws Exception {
        return 0;
    }

    public int zz5W() {
        return 0;
    }

    public int zz5X() {
        return 0;
    }

    public final zzYMD zz6w() {
        return this.zzZA6;
    }

    public final zzYMD zz6x() {
        return this.zzZA7;
    }

    @Override // com.aspose.words.zzYMD
    public void zzF(com.aspose.words.internal.zzZL zzzl) {
        this.zzZFE = zzzl;
    }

    public void zzMG(int i) throws Exception {
        this.zzZst = i;
    }

    @Override // com.aspose.words.zzYMD
    public boolean zzNd(int i) throws Exception {
        if ((!zzac() && (i & 4) == 0) || this.zzZsv) {
            return true;
        }
        zzF(null);
        if ((i & 2) != 0) {
            if (zzZZJ() != null) {
                zzZZJ().zzNd(i);
            }
            if (zzaa() != null) {
                zzaa().zzZoU();
            }
        }
        if ((i & 1) != 0) {
            zzYU(false);
        }
        if ((i & 4) != 0 && zz60() != 32) {
            for (zzYMD zzymdZz5Z = this.zzZA7; zzymdZz5Z != null; zzymdZz5Z = zzymdZz5Z.zz5Z()) {
                zzymdZz5Z.zzNd(i | 1);
            }
        }
        return false;
    }

    public final boolean zzS(zzYMD zzymd) {
        while (zzymd != null) {
            if (zzymd == this) {
                return true;
            }
            zzymd = zzymd.zzZZJ();
        }
        return false;
    }

    public void zzU(zzYMD zzymd) throws Exception {
        zzymd.zza9();
        zzymd.zzNd(1);
        zzNd(3);
        zzT(zzymd);
    }

    public final void zzV(zzZ6T zzz6t) {
        zzab();
        zzab().zzZ(zzz6t, new zzY0B(this), this);
    }

    public void zzY(zzYMD zzymd, boolean z) throws Exception {
        zzymd.zza9();
        zzymd.zzP(this);
        zzNd(3);
        if (this.zzZA7 == zzymd) {
            this.zzZA7 = zzymd.zz5Z();
        }
        if (this.zzZA6 == zzymd) {
            this.zzZA6 = zzymd.zz5Y();
        }
        zzymd.zzY(null);
        if (z && isEmpty()) {
            remove();
        }
    }

    @Override // com.aspose.words.zzYS
    public void zzYU(boolean z) {
        this.zzZsu = z;
    }

    public final void zzYj(boolean z) {
        this.zzZsv = z;
    }

    public void zzZ(zzYMD zzymd, zzTF zztf) throws Exception {
        if (zztf == this) {
            return;
        }
        if (zztf == null) {
            zztf = zz0s();
        }
        zztf.zzNd(4);
        int iZzYjN = zzymd.zz60() == 8 ? ((zzYIA) zzymd).zzYjN() : 0;
        boolean z = true;
        for (zzTF zztf2 = (zzTF) zztf.zzYo0(); z && zztf2 != null; zztf2 = (zzTF) zztf2.zzYo0()) {
            while (z) {
                zzYMD zzymd2 = zztf2.zzZA6;
                if (zzymd2 != null) {
                    if (zzymd2 == zzymd) {
                        z = false;
                    }
                    zzymd2.zzO(zztf);
                }
            }
        }
        if (zzymd.zz60() != 8 || iZzYjN == ((zzYIA) zzymd).zzYjN()) {
            return;
        }
        zzymd.zzNd(5);
    }

    @Override // com.aspose.words.zzYMD
    public final void zzZXO() {
        super.zzZXO();
        for (zzYMD zzymdZz5Z = this.zzZA7; zzymdZz5Z != null; zzymdZz5Z = zzymdZz5Z.zz5Z()) {
            zzymdZz5Z.zzZXO();
        }
    }

    public final boolean zzZXP() throws Exception {
        zzYMD zzymd;
        zzYAS zzyas;
        if (isEmpty() || (zzymd = this.zzZA7) != this.zzZA6 || (zzyas = (zzYAS) com.aspose.words.internal.zzZKW.zzZ(zzymd, zzYAS.class)) == null) {
            return false;
        }
        if (zzyas.zzZo6() != 21857 || zza9().zzaa().zzbD()) {
            return zzyas.zzZo6() == 21858 || zzyas.zzZo6() == 21860 || zzyas.zzZo6() == 21857 || zzyas.zzZo6() == 21859 || zzyas.zzZo6() == 21861;
        }
        return false;
    }

    public int zzZXQ() {
        return this.zzZst;
    }

    public final boolean zzZXR() {
        return this.zzZsv;
    }

    public final int zzZXS() throws Exception {
        return zzZXT() - zz5X();
    }

    public final int zzZXT() throws Exception {
        return getWidth() - zz5V();
    }

    public final int zzZXU() throws Exception {
        zzYMD zzymd = this.zzZA7;
        while (zzymd.zzac()) {
            zzYMD zzymdZz5Z = zzymd.zz5Z();
            if (zzymdZz5Z == null || !zzymdZz5Z.zzac()) {
                return Math.max(zzymd.getHeight(), zzymd.zz0t()) + zzymd.getY();
            }
            zzymd = zzymdZz5Z;
        }
        return 0;
    }

    @Override // com.aspose.words.zzYS
    public boolean zzac() {
        return this.zzZsu;
    }

    @Override // com.aspose.words.zzYMD
    public com.aspose.words.internal.zzZL zzbF() throws Exception {
        return this.zzZFE;
    }

    public final void zzZ(zzYMD zzymd) {
        this.zzZA7 = zzymd;
    }

    public final ArrayList<zzYMD> zzZ(zzYMD zzymd, zzYMD zzymd2) {
        if (zzymd == null) {
            zzymd = this.zzZA7;
        }
        ArrayList<zzYMD> arrayList = new ArrayList<>();
        while (zzymd != null && zzymd2 != zzymd && this == zzymd.zzZZJ()) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzymd);
            zzymd = zzymd.zz5Z();
        }
        return arrayList;
    }

    public final void zzY(zzYMD zzymd, zzTF zztf) throws Exception {
        if (zzymd.zzZZJ() == zztf) {
            return;
        }
        boolean z = true;
        if (zz60() == 2 && ((zzUZ) this).zz0H() == ((zzUZ) zztf).zz0H()) {
            z = false;
        }
        zzY(zzymd, z);
        zztf.zzU(zzymd);
    }

    public final void zzY(zzYMD zzymd) {
        this.zzZA6 = zzymd;
    }

    public final void zzY(zzZNO zzzno) {
        zzab();
        zzab().zzZ(zzzno.zzZ92().zza9(), zzzno.zzV(this), this);
    }
}
