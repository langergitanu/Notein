package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefInt;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ57 {

    public static class zzZ {
        private com.aspose.words.internal.zzZQC<zzYAU> zzE8;
        private LinkedList<zzYAU> zzYJ7;
        private boolean zzYdE;

        public zzZ(boolean z) {
            this.zzYdE = z;
            if (z) {
                this.zzE8 = new com.aspose.words.internal.zzZQC<>();
            } else {
                this.zzYJ7 = new LinkedList<>();
            }
        }

        public final int getCount() {
            return this.zzYdE ? this.zzE8.size() : this.zzYJ7.size();
        }

        public final void zz5(zzYAU zzyau) {
            if (this.zzYdE) {
                this.zzE8.push(zzyau);
            } else {
                this.zzYJ7.addLast(zzyau);
            }
        }

        public final zzYAU zzYQG() {
            return this.zzYdE ? this.zzE8.pop() : this.zzYJ7.removeFirst();
        }
    }

    private static boolean zz6(zzYAU zzyau) throws Exception {
        if (zzY9R.zzmS(zzyau.zzZo6()) || zzyau.zzZo6() == 21537 || zzyau.zzZo6() == 21515 || zzyau.zzZo6() == 21639) {
            return false;
        }
        if (zzY9R.zzmT(zzyau.zzZo6()) && (zzyau.zzaa() instanceof zzYVI)) {
            return false;
        }
        if (zzyau.zzZo6() == 21514 && zzyau.zzY6S().zza7().getDoNotExpandShiftReturn()) {
            return false;
        }
        if (zzyau.zzZo6() == 21514 && ((zzZ55) zzyau.zzZZJ()).zzYPV()) {
            return false;
        }
        if (!zzyau.zza7().zzZYM() && zzyau.zzY6S().zza7().getDoNotExpandShiftReturn() && (zzyau.zzZo6() == 21858 || zzyau.zzZo6() == 21857 || zzyau.zzZo6() == 21860 || zzyau.zzZo6() == 21859)) {
            return false;
        }
        if (zzyau.zza7().zzZYM()) {
            return (zzyau.zzZo6() == 21858 || zzyau.zzZo6() == 21857 || zzyau.zzZo6() == 21860 || zzyau.zzZo6() == 21859 || zzyau.zzZo6() == 21779) ? false : true;
        }
        return true;
    }

    private static boolean zz7(zzYAU zzyau) throws Exception {
        return zzyau.zzZo6() == 10782 && zzyau.zza7().zzYMB();
    }

    private static boolean zz8(zzYAU zzyau) throws Exception {
        return zzyau.zza7().zzYMB() && zzyau.zzY6D() && !com.aspose.words.internal.zzUX.zzI(zzyau.getText().charAt(0));
    }

    private static boolean zz9(zzYAU zzyau) throws Exception {
        if (zzyau.zzZf5()) {
            return false;
        }
        return zzyau.zzZo6() == 10754 || zz7(zzyau) || zz8(zzyau);
    }

    public static void zzN(zzZ55 zzz55, int i) throws Exception {
        if (zz6(zzz55.zzYQc()) || zzz55.zzYPT()) {
            Ref ref = new Ref(null);
            Ref ref2 = new Ref(null);
            zzZ(zzz55, (Ref<zzYAU>) ref, (Ref<zzYAU>) ref2);
            zzYAU zzyau = (zzYAU) ref.get();
            zzYAU zzyau2 = (zzYAU) ref2.get();
            if (zzyau == null || zzyau2 == null) {
                return;
            }
            RefInt refInt = new RefInt(0);
            zzZ zzZ2 = zzZ(zzyau, zzyau2, zzz55.zzYPT(), refInt);
            int i2 = refInt.get();
            if (i2 == 0) {
                return;
            }
            zzZ(zzZ2, i / i2, zzz55.zz5T());
        }
    }

    private static void zzZ(zzZ55 zzz55, Ref<zzYAU> ref, Ref<zzYAU> ref2) throws Exception {
        ref.set(null);
        ref2.set(null);
        for (zzYAU zzyauZzYQl = zzz55.zzYQl(); zzyauZzYQl != null; zzyauZzYQl = zzyauZzYQl.zzY6Q()) {
            if (zzyauZzYQl.zzY75() && zzyauZzYQl.zzY72() == null && !zzyauZzYQl.zzYRO() && (ref.get() != null || zzyauZzYQl.zzZo6() != 10754)) {
                if (zzyauZzYQl.zzZo6() == 12803) {
                    ref.set(null);
                    ref2.set(null);
                } else {
                    if (ref.get() == null) {
                        ref.set(zzyauZzYQl);
                    }
                    if (zzZ5H.zzs(zzyauZzYQl)) {
                        ref2.set(zzyauZzYQl);
                    }
                }
            }
        }
    }

    private static zzZ zzZ(zzYAU zzyau, zzYAU zzyau2, boolean z, RefInt refInt) throws Exception {
        refInt.set(0);
        boolean zZz5T = ((zzZ55) zzyau.zzZZJ()).zz5T();
        zzYAU zzyauZzY6V = zZz5T ? zzyau2 : zzyau;
        if (!zZz5T) {
            zzyau = zzyau2;
        }
        zzZ zzz = new zzZ(zZz5T);
        zzYAU zzyau3 = null;
        while (zzyauZzY6V != zzyau) {
            if (zzyauZzY6V.zzZo6() != 0 && zzyauZzY6V.zzY72() == null) {
                if (zz9(zzyauZzY6V)) {
                    refInt.set(refInt.get() + zzyauZzY6V.getLength());
                    if (zzyau3 != null && (zzyau3 instanceof zzY9S) && (zz8(zzyauZzY6V) || zz7(zzyauZzY6V))) {
                        zz9(zzyau3);
                        zzz.zz5(zzyau3);
                        com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
                    }
                    zzz.zz5(zzyauZzY6V);
                    zzyau3 = null;
                } else {
                    zzyau3 = zzyauZzY6V;
                }
            }
            zzyauZzY6V = zZz5T ? zzyauZzY6V.zzY6V() : zzyauZzY6V.zzY6U();
        }
        if (zz8(zzyau)) {
            refInt.set((refInt.get() + zzyau.getLength()) - 1);
            if ((!z || zzyau.getLength() != 1) && zzyau3 != null && (zzyau3 instanceof zzY9S)) {
                zzz.zz5(zzyau3);
                com.aspose.words.internal.OooO0o.OooO00o(1, refInt);
            }
            if (zzyau.getLength() > 1) {
                zzz.zz5(zzyau);
            }
        }
        return zzz;
    }

    private static void zzZ(zzZ zzz, int i, boolean z) throws Exception {
        int x;
        zzYAU zzyauZzYQG = zzz.zzYQG();
        if (z) {
            x = zzyauZzYQG.getRight();
        } else {
            x = zzyauZzYQG.getX();
        }
        int iZze = x;
        zzYAU zzyauZzYQG2 = zzyauZzYQG;
        while (zzyauZzYQG != null) {
            if (zzyauZzYQG == zzyauZzYQG2) {
                if (zz9(zzyauZzYQG)) {
                    zzyauZzYQG.zzlU(zzyauZzYQG.zzY78() + i);
                } else {
                    zzYAN.zzO(zzyauZzYQG, i);
                }
                zzyauZzYQG2 = zzz.getCount() == 0 ? null : zzz.zzYQG();
            }
            if (z) {
                zzyauZzYQG.setX(iZze - zzyauZzYQG.getWidth());
                iZze = zzyauZzYQG.getX();
            } else {
                zzyauZzYQG.setX(iZze);
                iZze = zzZ59.zze(zzyauZzYQG);
            }
            zzyauZzYQG = zzyauZzYQG.zzY6Q();
        }
    }
}
