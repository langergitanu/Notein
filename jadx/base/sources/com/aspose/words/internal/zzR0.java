package com.aspose.words.internal;

import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefInt;
import com.aspose.words.ref.RefLong;

/* JADX INFO: loaded from: classes5.dex */
final class zzR0 {
    private static zzZQ9 zzB(long j) {
        return new zzZQ9((j * 10000) + 621355968000000000L, 1L);
    }

    public static int zzC(long j) {
        int i = (int) j;
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 0;
        }
        throw zz7Z.zzZ("kind", Long.valueOf(j), "Unexpected DateTimeKind value.");
    }

    private static zzZQ9 zzW(zzZQ9 zzzq9) {
        int iZzkR = (int) zzzq9.zzkR();
        return iZzkR != 0 ? iZzkR != 2 ? zzzq9 : zzzq9.zzkF() : new zzZQ9(zzzq9.zzkP(), 1L);
    }

    private static zzZQ9 zzX(zzZQ9 zzzq9) {
        int iZzkR = (int) zzzq9.zzkR();
        return iZzkR != 0 ? iZzkR != 1 ? zzzq9 : zzzq9.zzkK() : new zzZQ9(zzzq9.zzkP(), 2L);
    }

    private static boolean zzY(zzZYM zzzym, int i, Ref<zzZQ9> ref) {
        if (zzzym.get(zzzym.getStartIndex()) == '/' && zzzym.getLength() >= 9 && zzZYL.zzZ(zzzym, "/Date(") && zzZYL.zzY(zzzym, ")/") && zzX(zzzym, i, ref)) {
            return true;
        }
        ref.set(new zzZQ9());
        return false;
    }

    private static zzZQ9 zzZ(zzZQ9 zzzq9, int i) {
        if (i == 0) {
            return zzX(zzzq9);
        }
        if (i == 1) {
            return zzW(zzzq9);
        }
        if (i == 2) {
            return new zzZQ9(zzzq9.zzkP(), 0L);
        }
        if (i == 3) {
            return zzzq9;
        }
        throw new IllegalArgumentException("Invalid date time handling value.");
    }

    public static zzZQ9 zzd(String str) {
        Ref ref = new Ref(null);
        return zzY(new zzZYM(str), 3, ref) ? (zzZQ9) ref.get() : zzZQ9.zz35;
    }

    public static zzZQ9 zze(String str) {
        Ref ref = new Ref(null);
        return str != null && zzZ(new zzZYM(str), 3, (String) null, zzCB.zztB, (Ref<zzZQ9>) ref) ? (zzZQ9) ref.get() : zzZQ9.zz35;
    }

    private static boolean zzW(zzZYM zzzym, int i, Ref<zzZNF> ref) {
        boolean z = zzzym.get(i) == '-';
        RefInt refInt = new RefInt(0);
        boolean z2 = zzS9.zzZ(zzzym.zzr5(), i + 1, 2, refInt) != 1;
        int i2 = refInt.get();
        if (z2) {
            ref.set(new zzZNF());
            return false;
        }
        RefInt refInt2 = new RefInt(0);
        boolean z3 = zzzym.getLength() - i > 5 && zzS9.zzZ(zzzym.zzr5(), i + 3, 2, refInt2) != 1;
        int i3 = refInt2.get();
        if (z3) {
            ref.set(new zzZNF());
            return false;
        }
        ref.set(zzZNF.zzZ(zzZNF.zzZd(i2), zzZNF.zzZc(i3)));
        if (z) {
            ref.set(ref.get().zzhx());
        }
        return true;
    }

    private static boolean zzX(zzZYM zzzym, int i, Ref<zzZQ9> ref) {
        RefLong refLong = new RefLong(0L);
        Ref ref2 = new Ref(null);
        RefInt refInt = new RefInt(0L);
        boolean zZzZ = zzZ(zzzym, refLong, ref2, refInt);
        long j = refLong.get();
        ref2.get();
        long j2 = refInt.get();
        if (!zZzZ) {
            ref.set(new zzZQ9());
            return false;
        }
        zzZQ9 zzzq9ZzB = zzB(j);
        int i2 = (int) j2;
        if (i2 == 0) {
            ref.set(zzZQ9.zzZ(zzzq9ZzB.zzkK(), 0L));
        } else if (i2 != 2) {
            ref.set(zzzq9ZzB);
        } else {
            ref.set(zzzq9ZzB.zzkK());
        }
        ref.set(zzZ(ref.get(), i));
        return true;
    }

    private static boolean zzZ(zzZYM zzzym, int i, Ref<zzZQ9> ref) {
        zzR2 zzr2 = new zzR2();
        if (!zzr2.zzZ(zzzym.zzr5(), zzzym.getStartIndex(), zzzym.getLength())) {
            ref.set(new zzZQ9());
            return false;
        }
        zzZQ9 zzzq9ZzZ = zzZ(zzr2);
        int i2 = zzr2.zzMe;
        if (i2 == 1) {
            zzzq9ZzZ = new zzZQ9(zzzq9ZzZ.zzkP(), 1L);
        } else if (i2 == 2) {
            zzZNF zzznf = new zzZNF(zzr2.zzMg, zzr2.zzMf);
            long jZzkP = zzznf.zzkP() + zzzq9ZzZ.zzkP();
            zzZQ9 zzzq9 = zzZQ9.zz34;
            if (jZzkP <= zzzq9.zzkP()) {
                zzzq9ZzZ = new zzZQ9(jZzkP, 1L).zzkK();
            } else {
                long jZzkP2 = zzZNG.zzC(zzzq9ZzZ).zzkP() + jZzkP;
                if (jZzkP2 > zzzq9.zzkP()) {
                    jZzkP2 = zzzq9.zzkP();
                }
                zzzq9ZzZ = new zzZQ9(jZzkP2, 2L);
            }
        } else if (i2 == 3) {
            long jZzkP3 = zzzq9ZzZ.zzkP() - new zzZNF(zzr2.zzMg, zzr2.zzMf).zzkP();
            zzZQ9 zzzq92 = zzZQ9.zz35;
            if (jZzkP3 >= zzzq92.zzkP()) {
                zzzq9ZzZ = new zzZQ9(jZzkP3, 1L).zzkK();
            } else {
                long jZzkP4 = zzZNG.zzC(zzzq9ZzZ).zzkP() + jZzkP3;
                if (jZzkP4 < zzzq92.zzkP()) {
                    jZzkP4 = zzzq92.zzkP();
                }
                zzzq9ZzZ = new zzZQ9(jZzkP4, 2L);
            }
        }
        ref.set(zzZ(zzzq9ZzZ, i));
        return true;
    }

    private static zzZQ9 zzZ(zzR2 zzr2) {
        boolean z = false;
        if (zzr2.zzMk == 24) {
            zzr2.zzMk = 0;
            z = true;
        }
        zzZQ9 zzzq9ZzYL = new zzZQ9(zzr2.zzMn, zzr2.zzMm, zzr2.zzMl, zzr2.zzMk, zzr2.zzMj, zzr2.zzMi).zzYL(zzr2.zzMh);
        return z ? zzzq9ZzYL.zzZj(1.0d) : zzzq9ZzYL;
    }

    public static boolean zzZ(zzZYM zzzym, int i, String str, zzZP1 zzzp1, Ref<zzZQ9> ref) {
        if (zzzym.getLength() > 0) {
            int startIndex = zzzym.getStartIndex();
            if (zzY(zzzym, i, ref)) {
                return true;
            }
            if (zzzym.getLength() >= 19 && zzzym.getLength() <= 40 && Character.isDigit(zzzym.get(startIndex)) && zzzym.get(startIndex + 10) == 'T' && zzZ(zzzym, i, ref)) {
                return true;
            }
            if (!zzZKN.zzU3(str) && zzZ(zzzym.toString(), i, str, zzzp1, ref)) {
                return true;
            }
        }
        ref.set(new zzZQ9());
        return false;
    }

    private static boolean zzZ(zzZYM zzzym, RefLong refLong, Ref<zzZNF> ref, RefInt refInt) {
        refInt.set(1L);
        int iZzZ = zzZYL.zzZ(zzzym, '+', zzzym.getLength() - 8);
        if (iZzZ == -1) {
            iZzZ = zzZYL.zzZ(zzzym, '-', zzzym.getLength() - 8);
        }
        if (iZzZ != -1) {
            refInt.set(2L);
            if (!zzW(zzzym, zzzym.getStartIndex() + iZzZ, ref)) {
                refLong.set(0L);
                return false;
            }
        } else {
            ref.set(zzZNF.zzZVR);
            iZzZ = zzzym.getLength() - 2;
        }
        return zzS9.zzZ(zzzym.zzr5(), zzzym.getStartIndex() + 6, iZzZ + (-6), refLong) == 1;
    }

    private static boolean zzZ(String str, int i, String str2, zzZP1 zzzp1, Ref<zzZQ9> ref) {
        Ref ref2 = new Ref(null);
        boolean zZzZ = zzZQ9.zzZ(str, str2, zzzp1, ref2);
        zzZQ9 zzzq9 = (zzZQ9) ref2.get();
        if (zZzZ) {
            ref.set(zzZ(zzzq9, i));
            return true;
        }
        ref.set(new zzZQ9());
        return false;
    }
}
