package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class zzWT extends zzYBL {
    private zzZNL zzZA0;
    private zzZNL zzZA1;
    private zzY5N zzZA2;
    private int zzZzZ;

    private zzZNL zzYE(boolean z) {
        if (this.zzZA0 == null && z) {
            this.zzZA0 = new zzZNL();
        }
        return this.zzZA0;
    }

    private static int zzZ(Iterable<zzZNO> iterable, com.aspose.words.internal.zzZQ5 zzzq5, int i) throws Exception {
        if (iterable == null) {
            return 0;
        }
        boolean zIsEmpty = zzzq5.isEmpty();
        int iMax = Integer.MIN_VALUE;
        for (zzZNO zzzno : iterable) {
            if (zIsEmpty || zzzno.zzVH(true).zzP(zzzq5)) {
                iMax = Math.max(iMax, zzzno.zzZZJ().zza7().zzZYM() ? zzzno.zzVH(false).getBottom() : zzzno.zzVI(false).getBottom());
            }
        }
        if (iMax > i) {
            return iMax - i;
        }
        return 0;
    }

    private com.aspose.words.internal.zzG zzx(ArrayList<com.aspose.words.internal.zzZL> arrayList) throws Exception {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzW(zzr(zzg.zzZO()));
        zzg.zzZ(arrayList);
        return zzg;
    }

    @Override // com.aspose.words.zzYMD
    public final int getContentHeight() throws Exception {
        if (isVirtual() || ((zzWV) zza9()).zz6o() != null) {
            return 0;
        }
        return zzWU.zzZ(this);
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final int getHeight() throws Exception {
        if (super.getHeight() == Integer.MIN_VALUE) {
            super.setHeight(zzWU.zzT(this));
        }
        return super.getHeight();
    }

    @Override // com.aspose.words.zzYMD
    public final int getY() {
        return zzZZJ().zz5W();
    }

    public final boolean isShared() {
        return ((zzWV) zza9()).zz6m() == 1 && zzZZJ().zza9() != zza9().zza9();
    }

    public final boolean isSink() {
        int iZz6m = ((zzWV) zza9()).zz6m();
        return iZz6m != 2 ? iZz6m == 3 : zzZZJ().zzYnY();
    }

    public final boolean isVirtual() {
        zza9();
        return ((zzWV) zza9()).zzYTn();
    }

    @Override // com.aspose.words.zzYMD
    public final void remove() throws Exception {
        if (((zzYIA) zzZZJ()) == null || !((zzYIA) zzZZJ()).zzYjU()) {
            return;
        }
        zzYIA zzyia = (zzYIA) zzZZJ();
        for (zzYMD zzymd : ((zzYIA) zzZZJ()).zzZ((zzYMD) null, (zzYMD) null)) {
            zzyia.zzY(zzymd, true);
            zzymd.zza9().zzB(zzymd);
        }
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final void setHeight(int i) throws Exception {
        zzMG(0);
        super.setHeight(i);
    }

    public final boolean zz5J() {
        return (((zzWV) zza9()).zz6o() == null || ((zzYIA) zzZZJ()).zzYnZ()) ? false : true;
    }

    public final boolean zz5K() {
        int iZz6m = ((zzWV) zza9()).zz6m();
        if (iZz6m == 0 || iZz6m == 1) {
            return false;
        }
        return zzZZJ().zzYnZ();
    }

    public final int zz5L() throws Exception {
        return zzZ(zzYF(false), com.aspose.words.internal.zzZQ5.zz2U, ((zzYIA) zzZZJ()).zzYjN());
    }

    public final zzZNL zz5M() {
        return zzYE(true);
    }

    public final zzZNL zz5N() {
        return zzYF(true);
    }

    public final zzY5N zz5O() {
        return zzYG(true);
    }

    public final void zz5P() {
        zzab();
        zzab().zzZ((zzYBL) this);
    }

    public final int zz5Q() {
        return this.zzZzZ;
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final zzYMD zz5R() {
        zzWT zzwt = (zzWT) super.zz5R();
        zzwt.zzZA1 = null;
        zzwt.zzZA2 = null;
        return zzwt;
    }

    public final void zz5S() throws Exception {
        zzWT zzwtZzO;
        setHeight(((zzYIA) zzZZJ()).getHeight());
        if (!isSink() || (zzwtZzO = zzWK.zzO(this)) == null) {
            return;
        }
        zzwtZzO.setHeight(zzWU.zzU(zzwtZzO));
    }

    @Override // com.aspose.words.zzTF
    public final boolean zz5T() {
        return ((zzWV) zza9()).zz6a();
    }

    @Override // com.aspose.words.zzTF
    public final int zz5U() {
        return ((zzYIA) zzZZJ()).zzYjM();
    }

    @Override // com.aspose.words.zzTF
    public final int zz5V() {
        return zzWU.zzT((zzWV) zza9());
    }

    @Override // com.aspose.words.zzTF
    public final int zz5W() {
        return ((zzYIA) zzZZJ()).zzYjN();
    }

    @Override // com.aspose.words.zzTF
    public final int zz5X() {
        return zzWU.zzV((zzWV) zza9());
    }

    @Override // com.aspose.words.zzYMD
    public final zzYMD zz5Y() {
        zza9();
        zzZZJ();
        if (((zzWT) zzYo0()) != null && ((zzYIA) ((zzWT) zzYo0()).zzZZJ()) == ((zzYIA) zzZZJ())) {
            return (zzWT) zzYo0();
        }
        if (((zzWV) ((zzWV) zza9()).zzYTo()) == null) {
            return null;
        }
        ((zzWV) zza9()).zza9();
        for (zzZ6T zzz6tZzYTo = (zzWV) ((zzWV) zza9()).zzYTo(); zzz6tZzYTo != null; zzz6tZzYTo = zzz6tZzYTo.zzYTo()) {
            for (zzYMD zzymdZz6w = zzz6tZzYTo.zz6w(); zzymdZz6w != null && (zzymdZz6w.zza9() == zzz6tZzYTo || zzymdZz6w.zza9() == null); zzymdZz6w = zzymdZz6w.zzYo0()) {
                if (zzymdZz6w.zzZZJ() == ((zzYIA) zzZZJ())) {
                    return zzymdZz6w;
                }
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzYMD
    public final zzYMD zz5Z() {
        zza9();
        zzZZJ();
        if (((zzWT) zzYo1()) != null && ((zzYIA) ((zzWT) zzYo1()).zzZZJ()) == ((zzYIA) zzZZJ())) {
            return (zzWT) zzYo1();
        }
        if (((zzWV) ((zzWV) zza9()).zzYTp()) == null) {
            return null;
        }
        ((zzWV) zza9()).zza9();
        for (zzZ6T zzz6tZzYTp = (zzWV) ((zzWV) zza9()).zzYTp(); zzz6tZzYTp != null; zzz6tZzYTp = zzz6tZzYTp.zzYTp()) {
            for (zzYMD zzymdZz6x = zzz6tZzYTp.zz6x(); zzymdZz6x != null && (zzymdZz6x.zza9() == zzz6tZzYTp || zzymdZz6x.zza9() == null); zzymdZz6x = zzymdZz6x.zzYo1()) {
                if (zzymdZz6x.zza9() == zzz6tZzYTp && zzymdZz6x.zzZZJ() == zzZZJ()) {
                    return zzymdZz6x;
                }
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzYMD
    public final int zz60() {
        return 16;
    }

    public final int zzM(com.aspose.words.internal.zzZQ5 zzzq5) throws Exception {
        return zzZ(zzZNL.zzF(zzYE(false)), zzzq5, zzzq5.getY());
    }

    public final void zzOA(int i) {
        this.zzZzZ = i;
    }

    public final void zzOz(int i) throws Exception {
        int iZz5V = i + zz5V() + zz5X();
        if (getWidth() == iZz5V || isEmpty()) {
            return;
        }
        int width = getWidth();
        setWidth(iZz5V);
        int x = getX();
        zzNd(5);
        zzWK.zzY(this, true);
        setWidth(width);
        setX(x);
    }

    public final zzZNL zzYF(boolean z) {
        if (this.zzZA1 == null && z) {
            this.zzZA1 = new zzZNL();
        }
        return this.zzZA1;
    }

    public final zzY5N zzYG(boolean z) {
        if (this.zzZA2 == null && z) {
            this.zzZA2 = new zzY5N(this);
        }
        return this.zzZA2;
    }

    public final void zzYH(boolean z) throws Exception {
        setX(zzWU.zzX((zzWV) zza9()));
        if (z) {
            setWidth(((zzWV) zza9()).getWidth());
        }
        setHeight(1073741823);
        if (zz5T()) {
            setX(zzYEK.zzE(this));
        }
    }

    @Override // com.aspose.words.zzYS
    public final zzWV zza4() {
        return (zzWV) zza9();
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final com.aspose.words.internal.zzZL zzbF() throws Exception {
        if (super.zzbF() == null) {
            zzqh(2048);
            if (isVirtual()) {
                return null;
            }
            com.aspose.words.internal.zzG zzgZzZ = zz5.zzZ((zzYMD) this, false);
            boolean z = ((zzWV) zza9()).zz6m() == 0 || ((zzWV) zza9()).zz6m() == 1;
            if (!isVirtual() && z) {
                com.aspose.words.internal.zzZQ4 zzzq4ZzX = zzWU.zzX(this);
                zzgZzZ.zzZ(com.aspose.words.internal.zzP8.zzM(zzzq4ZzX));
                zzYCM.zzZ(zzzq4ZzX, zz5.zzZ(((zzZ3B) ((zzWV) zza9()).zzYTt()).zzYMW()), new zzZ71(zzgZzZ, zza8()));
            }
            ArrayList<com.aspose.words.internal.zzZL> arrayListZzZ = zz5.zzZ(this);
            Ref ref = new Ref(null);
            Ref ref2 = new Ref(null);
            zz5.zzZ(this, (Ref<ArrayList<com.aspose.words.internal.zzZL>>) ref, (Ref<ArrayList<com.aspose.words.internal.zzZL>>) ref2);
            ArrayList arrayList = (ArrayList) ref.get();
            ArrayList<com.aspose.words.internal.zzZL> arrayList2 = (ArrayList) ref2.get();
            if (z) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList2, (Iterable) arrayListZzZ);
            }
            com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList2, (Iterable) arrayList);
            if (((zzWV) zza9()).zz6c()) {
                com.aspose.words.internal.zzG zzgZzx = zzx(arrayList2);
                arrayList2.clear();
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzG>) arrayList2, zzgZzx);
            }
            zzgZzZ.zzZ(arrayList2);
            super.zzF(zzgZzZ);
        }
        return super.zzbF();
    }

    public final com.aspose.words.internal.zzP9 zzr(com.aspose.words.internal.zzP9 zzp9) throws Exception {
        com.aspose.words.internal.zzP9 zzp92 = zzp9 == null ? new com.aspose.words.internal.zzP9() : zzp9.zzOh();
        com.aspose.words.internal.zzZQ4 zzzq4ZzS = zzWU.zzS(this);
        int orientation = ((zzZ3B) ((zzWV) zza9()).zzYTt()).getOrientation();
        if (orientation != 1) {
            if (orientation == 3) {
                zzp92.zzZ(-90.0f, com.aspose.words.internal.zzZPY.zzG(zzzq4ZzS.getX(), zzzq4ZzS.getY()), 1);
                zzp92.zzY(0.0f, zzzq4ZzS.getHeight(), 1);
                return zzp92;
            }
            if (orientation != 5) {
                return zzp92;
            }
        }
        zzp92.zzZ(90.0f, com.aspose.words.internal.zzZPY.zzG(zzzq4ZzS.getX(), zzzq4ZzS.getY()), 1);
        zzp92.zzY(zzzq4ZzS.getWidth(), 0.0f, 1);
        return zzp92;
    }
}
