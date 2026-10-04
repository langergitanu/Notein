package com.aspose.words;

import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ5A {
    private zzZYW zzYRh;
    private boolean zzYdI;

    public zzZ5A(zzZYW zzzyw, boolean z) {
        this.zzYdI = z;
        this.zzYRh = zzzyw;
    }

    private static boolean zzB(zzZ55 zzz55) throws Exception {
        for (zzYAU zzyau = (zzYAU) zzz55.zz6x(); zzyau != null; zzyau = (zzYAU) zzyau.zz5Z()) {
            if (!(zzyau instanceof zzYAT) && !zzY9R.zzmW(zzyau.zzZo6())) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzC(zzZ55 zzz55) throws Exception {
        int storyType = zzz55.zzaa().getStoryType();
        if (storyType == 1) {
            zzWT zzwtZzYnX = zzz55.zzYnX();
            if (zzwtZzYnX == null) {
                if (((zzYMM) zzz55.zza9()).zzYTp() != null || ((zzZ55) zzz55.zzYo1()) != null || zzB(zzz55) || zzY9R.zzmT(zzz55.zzYQc().zzZo6())) {
                    return zzz55.zzac();
                }
                return false;
            }
            zzwtZzYnX.isVirtual();
        } else if (storyType != 2 && storyType != 3 && storyType != 5) {
            return false;
        }
        return zzz55.zzac();
    }

    private void zzY(zzTF zztf, RefInt refInt) throws Exception {
        zzTF zztf2;
        zzYBY zzybyZzQJ;
        for (zzYMD zzymdZz6x = zztf.zz6x(); zzymdZz6x != null; zzymdZz6x = zzymdZz6x.zz5Z()) {
            if (zzymdZz6x.zz60() == 32) {
                zzZ55 zzz55 = (zzZ55) zzymdZz6x;
                if (zzC(zzz55)) {
                    com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
                }
                if (!this.zzYdI) {
                    zzY(zzz55, refInt);
                }
            } else if (zzymdZz6x.zz60() == 64) {
                zzY9X zzy9x = (zzY9X) com.aspose.words.internal.zzZKW.zzZ(zzymdZz6x, zzY9X.class);
                if (zzy9x != null && (zzybyZzQJ = zzy9x.zzQJ(false)) != null) {
                    for (zzYMD zzymdZz6x2 = zzybyZzQJ.zz6x(); zzymdZz6x2 != null; zzymdZz6x2 = zzymdZz6x2.zz5Z()) {
                        zzY((zzTF) zzymdZz6x2, refInt);
                    }
                }
            } else if ((zzymdZz6x.zz60() != 16 || !((zzWT) zzymdZz6x).isVirtual()) && (zztf2 = (zzTF) com.aspose.words.internal.zzZKW.zzZ(zzymdZz6x, zzTF.class)) != null) {
                zzY(zztf2, refInt);
            }
        }
    }

    private void zzZ(zzY9C zzy9c, RefInt refInt) throws Exception {
        if (zzy9c == null || zzy9c.zzZXZ() == null) {
            return;
        }
        zzZ((zzTF) zzy9c.zzZXZ().zz6x(), refInt);
    }

    public final int zzYQH() throws Exception {
        RefInt refInt = new RefInt(0);
        zzZ((zzYN8) this.zzYRh.zzZp0().zz6x(), refInt);
        int i = refInt.get();
        if (this.zzYdI) {
            return i;
        }
        refInt.set(i);
        zzZ(this.zzYRh.zzZoZ(), refInt);
        refInt.set(refInt.get());
        zzZ(this.zzYRh.zzZoY(), refInt);
        return refInt.get();
    }

    private void zzZ(zzTF zztf, RefInt refInt) throws Exception {
        while (zztf != null) {
            zzY(zztf, refInt);
            zztf = (zzTF) zztf.zzYo1();
        }
    }
}
