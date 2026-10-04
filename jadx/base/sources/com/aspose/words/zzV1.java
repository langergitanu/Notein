package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzV1 {
    private zzUZ zzZvA;

    public static boolean zzV(zzUZ zzuz) {
        return (zzuz.zz09() == null || zzuz.zz09().isEmpty() || (!zzuz.isEmpty() && zzYVN.zzv(zzuz.zz09().zz6x()).zzqh(2) == zzuz)) ? false : true;
    }

    private static int zzW(zzUZ zzuz) throws Exception {
        for (zzUZ zzuz2 = zzuz; zzuz2 != null && zzuz2.zz0H() == zzuz.zz0H(); zzuz2 = (zzUZ) zzuz2.zzYo1()) {
            if (zzV(zzuz2)) {
                return zzW(((zzYVQ) zzuz2.zz09().zz6x()).zz6x()) + zzuz2.zz09().zzYzr();
            }
            if (!zzuz2.isEmpty()) {
                return zzW(zzuz2.zz6x());
            }
            if (zzuz2.zz08() != null && !zzuz2.zz08().isEmpty()) {
                return zzW(((zzYVQ) zzuz2.zz08().zz6x()).zz6x()) + zzuz2.zz08().zzYzr();
            }
        }
        return 0;
    }

    public static boolean zzX(zzUZ zzuz) throws Exception {
        if (zzuz.zz0p() || zzuz.zz0j()) {
            return false;
        }
        zzZ2D zzz2d = (zzZ2D) ((zzZ2D) zzuz.zza9()).zzYTp();
        boolean z = zzuz.zz0l() && zzz2d != null && zzz2d.zzYJ4();
        if (z) {
            z = ((zzZ35) zzz2d.zzYTt()).getSectionStart() == 0 || zzuz.zz0a().isEmpty();
        }
        if (!z) {
            return false;
        }
        zzuz.zzNc(Math.min(((zzYN8) zzuz.zzZZJ()).zzYqn() - zzuz.getY(), zzZ(zzuz, true)));
        return !zzuz.zz03() && ((zzZ2D) zzuz.zza9()).zza7().zzYMR() && zzuz.zz0a() != zzuz && zzuz.zz0i();
    }

    private static void zzZ(zzUZ zzuz, int i) throws Exception {
        zzY44.zzo(zzuz);
        zzuz.zzNc(i);
        zzuz.zz0a().setHeight(1073741823);
        zzUY zzuy = new zzUY();
        while (true) {
            for (zzUZ zzuz2 = zzuz; zzuz2 != null && zzuz2.zz0H() == zzuz; zzuz2 = (zzUZ) zzuz2.zzYo1()) {
                boolean zZzX = zzuy.zzX(zzuz2, zzuz2.getHeight());
                if (!zZzX) {
                    zzuz2.isActive();
                }
                if (zZzX) {
                    break;
                }
            }
            return;
        }
    }

    public final zzUZ zz0H() {
        return this.zzZvA;
    }

    public final void zzY(zzUZ zzuz) throws Exception {
        int iZzZ;
        zzUZ zzuzZz0H = zzuz.zz0H();
        this.zzZvA = zzuzZz0H;
        int iZzW = zzW(zzuzZz0H);
        int i = Integer.MAX_VALUE;
        while (true) {
            iZzZ = zzZ(this.zzZvA, true);
            int iZzZ2 = zzZ(this.zzZvA, false);
            if (iZzZ <= iZzW || iZzZ2 <= iZzW) {
                break;
            }
            zzZ(this.zzZvA, iZzZ2 - 1);
            this.zzZvA.zza9();
            int iZzZ3 = zzZ(this.zzZvA, true);
            int iZzZ4 = zzZ(this.zzZvA, false);
            if (iZzZ4 > i || (iZzZ <= iZzZ3 && iZzZ2 <= iZzZ4)) {
                break;
            } else {
                i = iZzZ4;
            }
        }
        zzZ(this.zzZvA, iZzZ);
        zzUZ zzuz2 = this.zzZvA;
        zzuz2.zzNc(Math.min(zzZ(zzuz2, true), this.zzZvA.getHeight()));
        int iZzYqn = ((zzYN8) this.zzZvA.zzZZJ()).zzYqn() - this.zzZvA.getY();
        if (iZzYqn < this.zzZvA.getHeight()) {
            this.zzZvA.zzNc(iZzYqn);
        }
        this.zzZvA = null;
    }

    private static int zzZ(zzUZ zzuz, boolean z) throws Exception {
        int iMax = 0;
        for (zzUZ zzuzZz0H = zzuz.zz0H(); zzuzZz0H != null && zzuzZz0H.zz0H() == zzuz.zz0H(); zzuzZz0H = (zzUZ) zzuzZz0H.zzYo1()) {
            iMax = Math.max(iMax, zzYBJ.zzX(zzuzZz0H, z));
        }
        return iMax;
    }

    private static int zzW(zzYMD zzymd) throws Exception {
        int iZz60 = zzymd.zz60();
        if (iZz60 == 8) {
            return ((zzYIA) zzymd).zzYjR();
        }
        if (iZz60 == 32) {
            return zzYBJ.zzU((zzTC) zzymd, false);
        }
        throw new IllegalStateException("Unexpected part type.");
    }
}
