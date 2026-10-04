package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzPX {
    public static boolean zzZ(zzPL zzpl, zzPL zzpl2) {
        if (zzpl.zzPH() != zzpl2.zzPH()) {
            return false;
        }
        int iZzPH = zzpl.zzPH();
        if (iZzPH == 3) {
            return zzZ((zzPA) zzpl, (zzPA) zzpl2, false);
        }
        if (iZzPH == 4) {
            return zzZ((zzOP) zzpl, (zzOP) zzpl2, false);
        }
        if (iZzPH != 5) {
            return false;
        }
        return zzZ((zzP0) zzpl, (zzP0) zzpl2);
    }

    public static boolean zzZ(zzPA zzpa, zzPA zzpa2, boolean z) {
        return zzZ((zzPL) zzpa, (zzPL) zzpa2, false) && zzPV.zzZ(zzpa.zzOv(), zzpa2.zzOv()) && zzPV.zzZ(zzpa.zzOu(), zzpa2.zzOu()) && zzpa.zzOw().equals(zzpa2.zzOw());
    }

    private static boolean zzZ(zzOP zzop, zzOP zzop2, boolean z) {
        return zzZ((zzPL) zzop, (zzPL) zzop2, false) && zzop.zzNo() == zzop2.zzNo() && zzop.zzZj().equals(zzop2.zzZj()) && zzPP.zzZ(zzop.zzNs(), zzop2.zzNs()) && zzPQ.zzZ(zzop.zzNp(), zzop2.zzNp()) && zzPP.zzZ(zzop.zzNr(), zzop2.zzNr()) && zzPQ.zzZ(zzop.zzNq(), zzop2.zzNq());
    }

    private static boolean zzZ(zzP0 zzp0, zzP0 zzp02) {
        if (zzZ((zzPL) zzp0, (zzPL) zzp02, true) && zzPV.zzZ(zzp0.zzNT(), zzp02.zzNT()) && zzZPY.zzD(zzp0.zzNV(), zzp02.zzNV()) && zzZ(zzp0.zzNU(), zzp02.zzNU())) {
            return zzZ(zzp0.zzUu(), zzp02.zzUu());
        }
        return false;
    }

    private static boolean zzZ(zzPL zzpl, zzPL zzpl2, boolean z) {
        return (!z || zzP9.zzY(zzpl.zzNb(), zzpl2.zzNb())) && zzpl.zzNa() == zzpl2.zzNa() && zzZ1.zzZ(zzpl.zzON(), zzpl2.zzON()) && zzZ1.zzZ(zzpl.zzOO(), zzpl2.zzOO()) && zzZ(zzpl.zzOP(), zzpl2.zzOP());
    }

    private static boolean zzZ(zzP8 zzp8, zzP8 zzp82) {
        if (zzp8 == zzp82) {
            return true;
        }
        if (zzp8 == null || zzp82 == null || zzp8.zzO6() != zzp82.zzO6() || zzp8.zzO7().size() != zzp82.zzO7().size()) {
            return false;
        }
        for (int i = 0; i < zzp8.zzO7().size(); i++) {
            if (zzp8.zzO7().get(i).zzNY().size() != zzp82.zzO7().get(i).zzNY().size() || zzp8.zzO7().get(i).isClosed() != zzp82.zzO7().get(i).isClosed()) {
                return false;
            }
            for (int i2 = 0; i2 < zzp8.zzO7().get(i).zzNY().size(); i2++) {
                if (!zzp8.zzO7().get(i).zzNY().get(i2).zzZ(zzp82.zzO7().get(i).zzNY().get(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean zzZ(zzPI[] zzpiArr, zzPI[] zzpiArr2) {
        if (zzpiArr == zzpiArr2) {
            return true;
        }
        if (zzpiArr == null || zzpiArr2 == null || zzpiArr.length != zzpiArr2.length) {
            return false;
        }
        for (int i = 0; i < zzpiArr.length; i++) {
            if (!zzPI.zzZ(zzpiArr[i], zzpiArr2[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzZ(zzPV[] zzpvArr, zzPV[] zzpvArr2) {
        if (zzpvArr == zzpvArr2) {
            return true;
        }
        if (zzpvArr == null || zzpvArr2 == null || zzpvArr.length != zzpvArr2.length) {
            return false;
        }
        for (int i = 0; i < zzpvArr.length; i++) {
            if (!zzPV.zzZ(zzpvArr[i], zzpvArr2[i])) {
                return false;
            }
        }
        return true;
    }
}
