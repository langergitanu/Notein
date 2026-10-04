package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYNE {
    private ArrayList<zzUZ> zzXI7;
    private zzYN8 zzYBS;
    private ArrayList<zzZNO> zzYxW = zzYqC();

    public zzYNE(zzYN8 zzyn8) {
        this.zzYBS = zzyn8;
        zzYN8 zzyn82 = this.zzYBS;
        this.zzXI7 = zzyn82.zzT((zzUZ) zzyn82.zz6x(), this.zzYBS.zzYql());
    }

    public static com.aspose.words.internal.zzZQ5 zzV(zzUZ zzuz, int i) throws Exception {
        zzUZ zzuzZz0H = zzuz.zz0H();
        zzUZ zzuz2 = (zzUZ) zzuz.zzYo0();
        int right = (zzuz2 == null || zzuz2.zz0H() != zzuzZz0H) ? 0 : zzuz2.getRight();
        return new com.aspose.words.internal.zzZQ5(right, zzuz.getY(), (zzz(zzuz) ? ((zzYN8) zzuz.zzZZJ()).getRight() : zzuz.getRight()) - right, i - zzuz.getY());
    }

    public static zzYMD zzY(zzYMD zzymd, zzYMD zzymd2) throws Exception {
        zzZ55 zzz55 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zzymd, zzZ55.class);
        return (zzz55 == null || !zzY9R.zzlw(((zzYAU) zzz55.zz6x()).zzZo6())) ? zzymd : zzymd2;
    }

    private ArrayList<zzZNO> zzYqC() {
        ArrayList<zzZNO> arrayList = new ArrayList<>();
        zzZ(arrayList, this.zzYBS.zzYE(false));
        zzZ(arrayList, this.zzYBS.zzYF(false));
        return arrayList;
    }

    private static void zzZ(ArrayList<zzZNO> arrayList, zzZNL zzznl) {
        if (zzznl != null) {
            for (zzZNO zzzno : zzznl) {
                if (zzzno.zzbD()) {
                    com.aspose.words.internal.zzZQG.zzZ(arrayList, zzzno);
                }
            }
        }
    }

    public static boolean zzx(zzUZ zzuz) {
        return zzuz.zz09() == null || zzuz.zza7().zzZYM() || ((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).zzYLl() != 1;
    }

    public static int zzy(zzUZ zzuz) throws Exception {
        int height = zzuz.zz09() != null ? zzuz.zz09().getHeight() : 0;
        return zzuz.zz08() != null ? height + zzuz.zz08().getHeight() : height;
    }

    public static boolean zzz(zzUZ zzuz) {
        zzUZ zzuz2 = (zzUZ) zzuz.zzYo1();
        while (zzuz2 != null && zzuz2.zz0H() == zzuz.zz0H() && zzuz2.isEmpty()) {
            zzuz2 = (zzUZ) zzuz2.zzYo1();
        }
        return zzuz2 == null || zzuz2.zz0H() != zzuz.zz0H();
    }

    public abstract void zz4x() throws Exception;

    public final int zzL(com.aspose.words.internal.zzZQ5 zzzq5) throws Exception {
        int iMax = 0;
        for (zzZNO zzzno : this.zzYxW) {
            if (zzzq5.zzP(zzzno.zzVH(true).zz7G())) {
                iMax = Math.max(iMax, zzzno.zzZ8R().getBottom());
            }
        }
        return iMax;
    }

    public final ArrayList<zzUZ> zzYqD() {
        return this.zzXI7;
    }

    public final ArrayList<zzZNO> zzYqE() {
        return this.zzYxW;
    }

    public final zzYN8 zzZ8m() {
        return this.zzYBS;
    }

    public final boolean zzZYM() {
        return this.zzYBS.zza7().zzZYM();
    }
}
