package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.aspose.words.ref.Ref;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzWK {
    public static zzWT zzM(zzWT zzwt) {
        if (((zzYIC) ((zzYIA) zzwt.zzZZJ()).zza9()) == ((zzYIC) ((zzWV) zzwt.zza9()).zza9())) {
            if (((zzWT) zzwt.zzYo1()) == null) {
                if (((zzWV) zzwt.zza9()).zz6n() == null) {
                    return null;
                }
                return (zzWT) ((zzWV) zzwt.zza9()).zz6n().zz6x();
            }
            if (((zzWV) zzwt.zza9()).zz6m() != 1 || ((zzYIC) ((zzYIA) ((zzWT) zzwt.zzYo1()).zzZZJ()).zza9()) == ((zzYIC) ((zzWV) zzwt.zza9()).zza9())) {
                return (zzWT) zzwt.zzYo1();
            }
        }
        zzwt.zza9();
        return (zzWT) ((zzWV) zzwt.zza9()).zz6n().zz6x();
    }

    private static int zzN(zzWT zzwt) throws Exception {
        return zzYI9.zzI(zzwt).getY() - ((zzYIA) zzwt.zzZZJ()).getY();
    }

    public static zzWT zzO(zzWT zzwt) throws Exception {
        Ref ref = new Ref(null);
        Ref ref2 = new Ref(null);
        zzZ(zzwt, false, 0, ref, ref2);
        zzWT zzwt2 = (zzWT) ref.get();
        ref2.get();
        return zzwt2;
    }

    private static void zzP(zzWT zzwt) throws Exception {
        zzwt.zzYG(false);
        zzWT zzwt2 = (zzWT) zzwt.zzYo1();
        while (zzwt2 != null) {
            if (zzwt2.isEmpty()) {
                zzwt2.zzZZJ().zzY((zzYMD) zzwt2, false);
                zzwt2.zza9().zzB(zzwt2);
            } else {
                zzwt.zzY8l();
            }
            zzwt2 = (zzWT) zzwt.zzYo1();
        }
    }

    public static void zzQ(zzWT zzwt) throws Exception {
        zzwt.zz5P();
        while (((zzWT) zzwt.zzYo1()) != null) {
            if (((zzWT) zzwt.zzYo1()).isEmpty()) {
                zzwt.zzYo1().zzZZJ().zzY(zzwt.zzYo1(), true);
                zzwt.zzYo1().zza9().zzB(zzwt.zzYo1());
            } else {
                if (!zzwt.isEmpty() && zzwt.zz6w().zz60() == 8) {
                    zzYIA zzyia = (zzYIA) zzwt.zz6w();
                    zzYI9.zzA(zzyia);
                    if (zzyia.zzZXN() != null && zzyia.zzZXN().zzZZJ() == zzwt) {
                        zzyia.zzZXN().unregister();
                    }
                }
                zzwt.merge();
            }
        }
    }

    private static void zzR(zzWT zzwt) throws Exception {
        if (((zzWV) zzwt.zza9()).zz6m() == 0 || ((zzWV) zzwt.zza9()).zz6m() == 1 || !((zzYIA) zzwt.zzZZJ()).zzYnZ()) {
            return;
        }
        zzWT zzwtZzO = zzO(zzwt);
        zzwtZzO.zzZZJ();
        zzwt.zzZZJ();
        if (((zzYIA) zzwtZzO.zzZZJ()) == ((zzYIA) zzwt.zzZZJ())) {
            zzY(zzwtZzO, false);
        }
    }

    public static zzWT zzX(zzWT zzwt, int i) throws Exception {
        Ref ref = new Ref(null);
        Ref ref2 = new Ref(null);
        zzZ(zzwt, true, i, ref, ref2);
        zzWT zzwt2 = (zzWT) ref.get();
        ref2.get();
        return zzwt2;
    }

    public static void zzY(zzWT zzwt, boolean z) throws Exception {
        zzYMD.zzr(zzwt);
        zzwt.zzYH(!z);
        if (!z) {
            zzQ(zzwt);
        }
        zzR(zzwt);
        if (!zzwt.zzYTn()) {
            ((zzWV) zzwt.zza9()).zz6c();
        }
        if (((zzWV) zzwt.zza9()).zz6c()) {
            zzwt.zzYTm();
        }
        if (!zzwt.isEmpty()) {
            new zzYBK().zzZ((zzYBL) zzwt, 1073741823, true, false);
        }
        zzwt.zzYU(true);
        zzYMD.zzq(zzwt);
    }

    public static void zzZ(zzWT zzwt, int i) throws Exception {
        if (!zzwt.zzYTn()) {
            ((zzY6N) ((zzYIC) ((zzWV) zzwt.zza9()).zza9()).zza9()).zzY6a().isFloating();
        }
        zzZ(zzwt, i - ((zzYIA) zzwt.zzZZJ()).zzYjM(), false);
    }

    private static void zzZ(zzWT zzwt, int i, boolean z) throws Exception {
        int iZz6m;
        zzYIC zzyic;
        zzwt.zzYj(true);
        zzwt.zzMG(0);
        zzWT zzwt2 = new zzWT();
        ((zzWV) zzwt.zza9()).zzZ(zzwt, null, zzwt2, true);
        if (!zzwt.isEmpty() && !zzwt.isVirtual() && !((zzWV) zzwt.zza9()).zz6c() && ((iZz6m = ((zzWV) zzwt.zza9()).zz6m()) == 0 ? ((zzYIC) ((zzWV) zzwt.zza9()).zza9()).zzYk1().getHeightRule() != 1 : !(iZz6m != 1 || !z || (((zzYIC) ((zzWV) zzwt.zza9()).zz6k().zza9()) == (zzyic = (zzYIC) zzYI9.zzI(zzwt).zza9()) && zzyic.zzYk1().getHeightRule() == 1)))) {
            zzZ(zzwt, i, zzwt2);
            zzYI9.zzY(zzwt, ((zzYIA) zzwt.zzZZJ()).zzYjC());
            zzYMI.zzY(zzwt, true);
        }
        zzwt.zzYj(false);
    }

    private static zzYMD zzY(zzYMD zzymd, int i) throws Exception {
        zzYIA zzyia;
        zzYIA zzyia2 = (zzYIA) com.aspose.words.internal.zzZKW.zzZ(zzymd, zzYIA.class);
        if (zzyia2 != null) {
            zzyia2.zzZXN();
        }
        if (zzyia2 != null && (!((zzYIC) zzyia2.zza9()).zzYk1().zzYLA() || zzYIB.zzZ(zzyia2, true, true) <= i - zzyia2.getY())) {
            if (((((zzY6N) ((zzYIC) zzyia2.zza9()).zza9()).zzhk() && ((zzYIC) zzyia2.zza9()).zzYk1().getHeightRule() == 0) ? zzYIB.zzZ(zzyia2, false, false, false) : zzyia2.zz56()) > i - zzyia2.getY() && !zzymd.zzYnZ()) {
                return (!zzymd.zza7().zzZYM() || (zzyia = (zzYIA) com.aspose.words.internal.zzZKW.zzZ(zzyia2.zz5Y(), zzYIA.class)) == null || !((zzYIC) zzyia.zza9()).zzBz() || zzyia.zzYnZ()) ? zzymd : zzyia;
            }
            if (zzYI6.zzU(zzyia2, i - zzyia2.getY()) <= 0) {
                return zzyia2.zzYnZ() ? zzymd.zz5Z() : zzymd;
            }
            zzyia2.zz5Z();
            return (zzYIA) zzyia2.zzYo1();
        }
        if (zzymd.zzYnZ()) {
            if (((zzWV) zzymd.zzZZJ().zza9()).zz6m() == 1 && zzymd.zza7().zzZYM()) {
                zzWT zzwt = (zzWT) zzymd.zzZZJ();
                z = !(((zzYIC) ((zzYIA) zzwt.zzZZJ()).zza9()) == ((zzYIC) ((zzWV) zzwt.zza9()).zz6k().zza9()));
            }
            if (!z) {
                return zzymd.zz5Z();
            }
        }
        return zzymd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r0 = (com.aspose.words.zzZNG) r4.zzZXN();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r0.zzVI(false).getBottom() > r9) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r0 = zzZ(r0, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzZ(zzWT zzwt, int i, zzWT zzwt2) throws Exception {
        int i2;
        int iZz0t;
        zzZNG zzzng;
        zzYMD zzymdZz6x = zzwt.zz6x();
        int i3 = 0;
        boolean z = !zzwt.zza7().zzZYM() && ((zzYIC) ((zzWV) zzwt.zza9()).zza9()).zzYjZ();
        zzwt.zzOA(0);
        loop0: while (true) {
            i2 = 0;
            while (true) {
                if (zzymdZz6x == null) {
                    break loop0;
                }
                if (zzymdZz6x.zz60() == 8) {
                    zzYIA zzyia = (zzYIA) zzymdZz6x;
                    if (zzyia.zzZXN() != null) {
                        break;
                    } else {
                        iZz0t = Math.max(0, zzyia.zzYjM() - zzyia.zzYjL());
                    }
                } else if (z) {
                    zzZ55 zzz55 = (zzZ55) zzymdZz6x;
                    iZz0t = zzz55.zz0t() - zzz55.getHeight();
                } else {
                    iZz0t = 0;
                }
                int bottom = zzymdZz6x.getBottom();
                if (zzymdZz6x.zz60() == 32 && zzymdZz6x.zza7().zzZYM()) {
                    bottom = ((zzZ55) com.aspose.words.internal.zzZKW.zzZ(zzymdZz6x, zzZ55.class)).zzYPM();
                }
                if (iZz0t + bottom > i) {
                    zzymdZz6x = zzY(zzymdZz6x, i);
                    break loop0;
                } else {
                    i2 = bottom - i;
                    zzymdZz6x = zzymdZz6x.zz5Z();
                }
            }
            zzymdZz6x = zzzng.zzZ91().zz5Z();
        }
        i3 = i2;
        if (i3 > 0) {
            zzwt.zzOA(i3);
        }
        if (zzymdZz6x != null) {
            zzwt.zzZ(zzymdZz6x, (zzTF) zzwt2);
            zzZ(i, zzwt, zzwt2);
        }
    }

    private static void zzY(zzWT zzwt, Ref<ArrayList<zzWT>> ref, Ref<ArrayList<zzWT>> ref2) {
        ref.set(new ArrayList<>());
        ref2.set(new ArrayList<>());
        zzWT zzwt2 = (zzWT) zzwt.zza4().zz6l().zz6x();
        zzWT zzwtZzM = zzwt2;
        while (true) {
            if (zzwt2 == null && zzwtZzM == null) {
                return;
            }
            if (zzwt2 != null && zzwtZzM != null && ((zzYIA) zzwt2.zzZZJ()) != ((zzYIA) zzwtZzM.zzZZJ())) {
                zzwt2.zzY(zzwtZzM.zzZZJ());
            }
            if (zzwt2 != null) {
                com.aspose.words.internal.zzZQG.zzZ(ref.get(), zzwt2);
            }
            if (zzwtZzM != null) {
                com.aspose.words.internal.zzZQG.zzZ(ref2.get(), zzwtZzM);
            }
            if (zzwt == zzwt2 || zzwt == zzwtZzM) {
                return;
            }
            if (zzwt2 != null) {
                zzwt2 = (zzWT) zzwt2.zzYo1();
            }
            if (zzwtZzM != null) {
                zzYIA zzyia = (zzYIA) zzwtZzM.zzZZJ();
                do {
                    zzwtZzM = zzM(zzwtZzM);
                    if (zzwtZzM == null || zzyia.zzZZJ() != zzwtZzM.zzZZJ().zzZZJ()) {
                        break;
                    }
                } while (zzwt != zzwtZzM);
                return;
            }
        }
    }

    private static void zzY(zzWT zzwt, int i) throws Exception {
        zzwt.zza9();
        zzZ(zzwt, i, true);
    }

    private static void zzZ(int i, zzWT zzwt, zzWT zzwt2) throws Exception {
        zzY5N zzy5nZzYG = zzwt.zzYG(false);
        if (zzy5nZzYG != null && zzy5nZzYG.zzXVP()) {
            new zzYBK().zzZ((zzYBL) zzwt, i, true, false);
        }
        zzY5N zzy5nZzYG2 = zzwt.zzZ8m().zzYG(false);
        if (zzy5nZzYG2 != null) {
            zzy5nZzYG2.zzD(zzwt2);
        }
    }

    private static zzYMD zzZ(zzZNG zzzng, int i) throws Exception {
        boolean zZzZ7F = zzzng.zzZ7F();
        zzXR zzxrZzVI = zzzng.zzVI(false);
        int y = i - zzxrZzVI.getY();
        if (!zZzZ7F && zzzng.zzZ7E() && !zzzng.zzBt(zzxrZzVI.getY()) && zzzng.zzBs(y)) {
            zzzng.zz5S();
            return zzzng.zzZ91().zz5Z();
        }
        if (zzzng.zzZ93().zzYnZ()) {
            return zzzng.zzZ91().zz5Z();
        }
        return zzzng.zzZ93();
    }

    public static void zzZ(zzWT zzwt, Ref<zzWT> ref, Ref<zzWT> ref2) throws Exception {
        zzZ(zzwt, false, 0, ref, ref2);
    }

    private static zzWT zzZ(zzWT zzwt, zzWT zzwt2, int i) throws Exception {
        zzwt2.zz5K();
        zzWT zzwt3 = (zzWT) ((zzWV) zzwt2.zza9()).zz6l().zz6w();
        if (((zzYIA) zzwt3.zzZZJ()) != ((zzYIA) zzwt2.zzZZJ())) {
            zzwt = zzwt3;
        }
        int iZzN = i + zzN(zzwt);
        zzYIA zzyia = (zzYIA) ((zzWV) zzwt.zza9()).zzX(zzwt);
        zzyia.zzYj(true);
        zzY(zzwt, iZzN);
        zzWT zzwt4 = (zzWT) zzwt.zzYo1();
        zzwt4.zzZZJ();
        zzyia.zzYj(false);
        zzwt4.zzYnY();
        zzwt4.zzY(zzwt2.zzZZJ());
        if (((zzYIA) zzwt4.zzZZJ()).zz6x() == ((zzWT) zzwt4.zzYo1())) {
            ((zzYIA) zzwt4.zzZZJ()).zzZ(zzwt4);
        }
        zzwt4.zzZZJ();
        ((zzYIA) zzwt4.zzZZJ()).isActive();
        zzP(zzwt4);
        zzwt4.zzYTn();
        return zzwt4;
    }

    public static zzWV zzZ(zzWV zzwv, zzYIC zzyic) {
        while (zzwv != null) {
            if (((zzYIC) zzwv.zza9()) == zzyic) {
                return zzwv;
            }
            zzwv = zzwv.zz6n();
        }
        return null;
    }

    private static void zzZ(zzWT zzwt, boolean z, int i, Ref<zzWT> ref, Ref<zzWT> ref2) throws Exception {
        zzwt.zza9();
        ((zzYIA) zzwt.zzZZJ()).zza9();
        ((zzWV) zzwt.zza9()).zza9();
        zzwt.isVirtual();
        Ref ref3 = new Ref(null);
        Ref ref4 = new Ref(null);
        zzY(zzwt, ref3, ref4);
        ArrayList arrayList = (ArrayList) ref3.get();
        ArrayList arrayList2 = (ArrayList) ref4.get();
        int size = arrayList.size();
        ref2.set((zzWT) C21505OooO0Oo.OooO00o(1, arrayList2));
        if (arrayList.size() == arrayList2.size()) {
            ref.set((zzWT) C21505OooO0Oo.OooO00o(1, arrayList));
            if (ref.get() != null) {
                ref2.get();
            }
            if (!z || arrayList.size() == 1) {
                return;
            }
            ref.get();
            size--;
        }
        if (!z) {
            ref.set(null);
            return;
        }
        arrayList2.size();
        zzWT zzwt2 = (zzWT) arrayList.get(size - 1);
        while (true) {
            ref.set(zzZ(zzwt2, (zzWT) arrayList2.get(size), i));
            size++;
            if (size >= arrayList2.size()) {
                return;
            }
            i = 1073741823;
            zzwt2 = null;
        }
    }
}
