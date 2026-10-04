package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYK1 {
    private static long zzA(long[] jArr) {
        long j = jArr[0];
        for (int i = 0; i < 4; i++) {
            long j2 = jArr[i];
            int i2 = (int) j;
            int i3 = (int) j2;
            if (Float.intBitsToFloat(i2) > Float.intBitsToFloat(i3) || (com.aspose.words.internal.zzAN.zzS(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)) && com.aspose.words.internal.zzZPY.zzYC(j) > com.aspose.words.internal.zzZPY.zzYC(j2))) {
                j = j2;
            }
        }
        return j;
    }

    private static com.aspose.words.internal.zzZQ4[] zzB(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) {
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList<zzYK2> arrayListZzZ3 = zzZ3(zzzq42);
        ArrayList<zzYK2> arrayListZzZ32 = zzZ3(zzzq4);
        zzYK2 zzyk2ZzZg = zzZg(arrayListZzZ3);
        zzYK2 zzyk2ZzZf = zzZf(arrayListZzZ3);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<zzYK2> it = arrayListZzZ32.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzYK2 next = it.next();
            if (!zzyk2ZzZg.zzY(next)) {
                long[] jArrZzZ = zzyk2ZzZg.zzZ(next);
                if (jArrZzZ.length > 0) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<Long>) arrayList2, Long.valueOf(jArrZzZ[0]));
                }
            }
            if (!zzyk2ZzZf.zzY(next)) {
                long[] jArrZzZ2 = zzyk2ZzZf.zzZ(next);
                if (jArrZzZ2.length > 0) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<Long>) arrayList3, Long.valueOf(jArrZzZ2[0]));
                }
            }
        }
        arrayList2.size();
        arrayList3.size();
        zzYK2 zzyk2ZzZg2 = zzZg(arrayListZzZ32);
        zzYK2 zzyk2ZzZf2 = zzZf(arrayListZzZ32);
        if (!zzS(zzzq42, zzyk2ZzZg2.zzYme()) && !zzS(zzzq42, zzyk2ZzZg2.zzYmd())) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzM = zzM(((Long) arrayList2.get(0)).longValue(), ((Long) arrayList2.get(1)).longValue(), zzyk2ZzZg2.zzYme(), zzyk2ZzZg2.zzYmd());
            if (!zzZ4(zzzq4ZzM)) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZQ4>) arrayList, zzzq4ZzM);
            }
        }
        if (!zzS(zzzq42, zzyk2ZzZf2.zzYme()) && !zzS(zzzq42, zzyk2ZzZf2.zzYmd())) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzM2 = zzM(((Long) arrayList3.get(0)).longValue(), ((Long) arrayList3.get(1)).longValue(), zzyk2ZzZf2.zzYme(), zzyk2ZzZg2.zzYmd());
            if (!zzZ4(zzzq4ZzM2)) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZQ4>) arrayList, zzzq4ZzM2);
            }
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzM3 = zzM(((Long) arrayList2.get(0)).longValue(), ((Long) arrayList3.get(0)).longValue(), zzR(((Long) arrayList2.get(0)).longValue(), zzyk2ZzZg.zzYme(), zzyk2ZzZg.zzYmd()), zzR(((Long) arrayList3.get(0)).longValue(), zzyk2ZzZf.zzYme(), zzyk2ZzZf.zzYmd()));
        if (!zzZ4(zzzq4ZzM3)) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZQ4>) arrayList, zzzq4ZzM3);
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzM4 = zzM(((Long) arrayList2.get(1)).longValue(), ((Long) arrayList3.get(1)).longValue(), zzR(((Long) arrayList2.get(1)).longValue(), zzyk2ZzZg.zzYme(), zzyk2ZzZg.zzYmd()), zzR(((Long) arrayList3.get(1)).longValue(), zzyk2ZzZf.zzYme(), zzyk2ZzZf.zzYmd()));
        if (!zzZ4(zzzq4ZzM4)) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZQ4>) arrayList, zzzq4ZzM4);
        }
        com.aspose.words.internal.zzZQ4[] zzzq4Arr = new com.aspose.words.internal.zzZQ4[arrayList.size()];
        for (i = 0; i < arrayList.size(); i++) {
            zzzq4Arr[i] = (com.aspose.words.internal.zzZQ4) arrayList.get(i);
        }
        return zzzq4Arr;
    }

    public static com.aspose.words.internal.zzZQ4[] zzC(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) {
        if (zzZ4(zzzq4) || zzZ4(zzzq42) || !zzzq4.zz9(zzzq42)) {
            return null;
        }
        return zzzq42.zza(zzzq4) ? new com.aspose.words.internal.zzZQ4[0] : zzzq4.zza(zzzq42) ? zzB(zzzq4, zzzq42) : zzB(zzzq4, com.aspose.words.internal.zzZQ4.zzU(zzzq4, zzzq42));
    }

    private static com.aspose.words.internal.zzZQ4 zzM(long j, long j2, long j3, long j4) {
        long[] jArr = {j, j2, j3, j4};
        long jZzA = zzA(jArr);
        long jZzz = zzz(jArr);
        int i = (int) jZzA;
        return new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat(i), com.aspose.words.internal.zzZPY.zzYC(jZzA), Float.intBitsToFloat((int) jZzz) - Float.intBitsToFloat(i), com.aspose.words.internal.zzZPY.zzYC(jZzz) - com.aspose.words.internal.zzZPY.zzYC(jZzA));
    }

    private static long zzR(long j, long j2, long j3) {
        int i = (int) j;
        return Math.sqrt(Math.pow((double) (com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(j2)), 2.0d) + Math.pow((double) (Float.intBitsToFloat(i) - Float.intBitsToFloat((int) j2)), 2.0d)) < Math.sqrt(Math.pow((double) (com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(j3)), 2.0d) + Math.pow((double) (Float.intBitsToFloat(i) - Float.intBitsToFloat((int) j3)), 2.0d)) ? j2 : j3;
    }

    private static boolean zzS(com.aspose.words.internal.zzZQ4 zzzq4, long j) {
        Iterator it = com.aspose.words.internal.zzZQG.zzM(com.aspose.words.internal.zzJ6.zzz(zzzq4)).iterator();
        while (it.hasNext()) {
            if (com.aspose.words.internal.zzZPY.zzD(((Long) it.next()).longValue(), j)) {
                return true;
            }
        }
        return false;
    }

    private static ArrayList<zzYK2> zzZ3(com.aspose.words.internal.zzZQ4 zzzq4) {
        ArrayList arrayListZzM = com.aspose.words.internal.zzZQG.zzM(com.aspose.words.internal.zzJ6.zzz(zzzq4));
        ArrayList<zzYK2> arrayList = new ArrayList<>();
        com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzYK2(((Long) arrayListZzM.get(0)).longValue(), ((Long) arrayListZzM.get(1)).longValue()));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzYK2(((Long) arrayListZzM.get(1)).longValue(), ((Long) arrayListZzM.get(2)).longValue()));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzYK2(((Long) arrayListZzM.get(2)).longValue(), ((Long) arrayListZzM.get(3)).longValue()));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzYK2(((Long) arrayListZzM.get(3)).longValue(), ((Long) arrayListZzM.get(0)).longValue()));
        return arrayList;
    }

    private static boolean zzZ4(com.aspose.words.internal.zzZQ4 zzzq4) {
        return zzzq4.getHeight() < 1.0E-4f || zzzq4.getWidth() < 1.0E-4f;
    }

    private static zzYK2 zzZf(ArrayList<zzYK2> arrayList) {
        zzYK2 zzyk2 = arrayList.get(0);
        for (zzYK2 zzyk22 : arrayList) {
            if (zzyk22.zzYmf() && com.aspose.words.internal.zzZPY.zzYC(zzyk22.zzYme()) > com.aspose.words.internal.zzZPY.zzYC(zzyk2.zzYme())) {
                zzyk2 = zzyk22;
            }
        }
        return zzyk2;
    }

    private static zzYK2 zzZg(ArrayList<zzYK2> arrayList) {
        zzYK2 zzyk2 = arrayList.get(0);
        for (zzYK2 zzyk22 : arrayList) {
            if (zzyk22.zzYmf() && com.aspose.words.internal.zzZPY.zzYC(zzyk22.zzYme()) < com.aspose.words.internal.zzZPY.zzYC(zzyk2.zzYme())) {
                zzyk2 = zzyk22;
            }
        }
        return zzyk2;
    }

    private static long zzz(long[] jArr) {
        long j = jArr[0];
        for (int i = 0; i < 4; i++) {
            long j2 = jArr[i];
            int i2 = (int) j;
            int i3 = (int) j2;
            if (Float.intBitsToFloat(i2) < Float.intBitsToFloat(i3) || (com.aspose.words.internal.zzAN.zzS(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)) && com.aspose.words.internal.zzZPY.zzYC(j) < com.aspose.words.internal.zzZPY.zzYC(j2))) {
                j = j2;
            }
        }
        return j;
    }
}
