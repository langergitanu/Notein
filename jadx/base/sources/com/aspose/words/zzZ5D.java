package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ5D {
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[LOOP:0: B:3:0x000c->B:10:0x002d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[EDGE_INSN: B:14:0x0032->B:11:0x0032 BREAK  A[LOOP:0: B:3:0x000c->B:10:0x002d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzYAU zzO(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        zzyau.zzY6N().zzYKO().isVisible();
        zzYAU zzyau3 = zzyau;
        while (zzyau != null) {
            if (!zzyau.zzY75()) {
                if (zzyau != zzyau2) {
                    break;
                }
                zzyau = zzyau.zzY6U();
            } else {
                if (!com.aspose.words.internal.zzZKO.zzA(zzyau.zzY6N().zzYKO(), zzyau3.zzY6N().zzYKO())) {
                    break;
                }
                zzyau3 = zzyau;
                if (zzyau != zzyau2) {
                }
            }
        }
        return zzyau3;
    }

    public static void zzP(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        if (zzyau2 != zzyau && zzY9R.zzmW(zzyau2.zzZo6())) {
            zzyau2 = zzyau2.zzY6V();
        }
        boolean zZzYMH = zzyau.zza7().zzYMH();
        while (!zZzYMH && zzm(zzyau2)) {
            if (zzyau2.zzY6N() != null && zzyau2.zzY6N().zzYKO().isVisible()) {
                if (zzyau2 != zzyau && com.aspose.words.internal.zzZKO.zzA(((zzYAU) zzyau2.zzYo0()).zzY6N().zzYKO(), zzyau2.zzY6N().zzYKO())) {
                    zzyau2.zzY6V().zzQC(true);
                }
                zzyau2.zzQC(false);
                zzyau2.zzQD(false);
            }
            zzyau2.zzQB(true);
            if (zzyau2 == zzyau) {
                return;
            } else {
                zzyau2 = zzyau2.zzY6V();
            }
        }
        if (zzyau2.zzY6N().zzYKO().isVisible()) {
            zzyau2.zzQC(true);
        }
    }

    public static boolean zzQ(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        boolean zZzYMH = zzyau.zza7().zzYMH();
        Ref ref = new Ref(null);
        boolean zZzZ = zzZ(zzyau, zzyau2, zZzYMH, ref);
        zzYAU zzyau3 = (zzYAU) ref.get();
        if (zZzZ) {
            return false;
        }
        while (zzyau != null && ((!zzyau.zzY6F() || zZzYMH) && !zzY9R.zzmW(zzyau.zzZo6()))) {
            if (zzyau.zzY75() && zzyau.zzY6N() != null && zzyau.zzY6N().zzYKO().isVisible()) {
                zzYAU zzyauZzO = zzO(zzyau, zzyau3);
                if (((zzZ55) zzyau.zzZZJ()).zz5T()) {
                    zzyau.zzQD(false);
                    zzyauZzO.zzQC(false);
                    zzyau.zzQC(true);
                    zzyauZzO.zzQD(true);
                } else {
                    zzyau.zzQC(false);
                    zzyauZzO.zzQD(false);
                    zzyau.zzQD(true);
                    zzyauZzO.zzQC(true);
                }
                while (zzyau != zzyauZzO) {
                    zzyau = zzyau.zzY6U();
                    if (zzyau != zzyauZzO) {
                        zzyau.zzQD(false);
                        zzyau.zzQC(false);
                    }
                }
            }
            if (zzyau == zzyau2 || zzyau == zzyau3) {
                break;
            }
            zzyau = zzyau.zzY6U();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzZ(zzYAU zzyau, zzYAU zzyau2, boolean z, Ref<zzYAU> ref) throws Exception {
        zzZ55 zzz55 = (zzZ55) zzyau.zzZZJ();
        zzz55.zzUR(true);
        ref.set(null);
        if (zzY9R.zzmW(zzyau2.zzZo6())) {
            if (zzyau == zzyau2) {
                return true;
            }
            zzyau2 = zzyau2.zzY6V();
        }
        while (zzyau2 != null) {
            if (zzz55.zzYQh()) {
                if (zzm(zzyau2)) {
                    zzyau2.zzQB(true);
                } else {
                    zzz55.zzUR(false);
                }
            }
            if (!zzz55.zzYQh() || z) {
                if (ref.get() == null && zzyau2.zzY6N() != null && zzyau2.zzY6N().zzYKO().isVisible()) {
                    ref.set(zzyau2);
                }
                if (ref.get() != null && !zzz55.zzYQh()) {
                    break;
                }
                if (zzyau2 == zzyau) {
                    break;
                }
                zzyau2 = zzyau2.zzY6V();
            }
        }
        return ref.get() == null;
    }

    private static boolean zzm(zzYAU zzyau) throws Exception {
        zzYAH zzyah = (zzYAH) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzYAH.class);
        if (zzyah == null || zzyah.getFieldType() != 70) {
            return zzyau.zzY7r() == 2048 || zzyau.zzZo6() == 0 || zzY9R.zzmW(zzyau.zzZo6()) || zzyau.zzY74();
        }
        return false;
    }
}
