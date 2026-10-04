package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZ3 {
    public static ArrayList<zzOS> zzM(ArrayList<zzOS> arrayList) {
        if (arrayList.size() < 2) {
            return arrayList;
        }
        int i = 1;
        ArrayList<zzOS> arrayList2 = new ArrayList<>(1);
        arrayList2.add(arrayList.get(0));
        while (i < arrayList.size()) {
            ArrayList<zzOS> arrayListZzT = arrayList2;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                arrayListZzT = zzT(arrayList2.get(i2), arrayList.get(i));
            }
            i++;
            arrayList2 = arrayListZzT;
        }
        return arrayList2;
    }

    private static void zzR(zzOS zzos, zzOS zzos2) {
        long j = zzos.zzNu().get(0);
        if (zzos2.zzNu().getCount() == 0 || !zzJ6.zzN(zzos2.zzNu().get(zzos2.zzNu().getCount() - 1), j)) {
            zzos2.zzNu().zzR(zzos.zzNu());
        } else {
            zzos2.zzNu().zzR(zzos.zzNu().zzZC(1, zzos.zzNu().getCount() - 1));
        }
    }

    private static ArrayList<zzOS> zzS(zzOS zzos, zzOS zzos2) {
        if (zzos.zzNu().getCount() == 0) {
            return new ArrayList<>();
        }
        zzOS zzos3 = new zzOS();
        ArrayList<zzOS> arrayList = new ArrayList<>();
        int i = 0;
        while (i <= zzos.zzNu().getCount()) {
            int i2 = i == zzos.zzNu().getCount() ? 0 : i;
            int i3 = i2 == zzos.zzNu().getCount() - 1 ? 0 : i2 + 1;
            long j = zzos.zzNu().get(i2);
            long j2 = zzos.zzNu().get(i3);
            boolean zZzk = zzos2.zzk(j);
            boolean zZzk2 = zzos2.zzk(j2);
            if (!zZzk) {
                zzos3.zzNu().add(j);
            }
            zz0Q zz0qZzZ = zzZ(new zzPB(j, j2), zzos2);
            if (zz0qZzZ.getCount() != 0 && zz0qZzZ.getCount() <= 2) {
                zzZ(j, zz0qZzZ);
                zzos3.zzNu().add(zz0qZzZ.get(0));
                if (zz0qZzZ.getCount() == 2 && zZzk2 && zZzk) {
                    zzos3.zzNu().add(zz0qZzZ.get(1));
                }
                if (zZzk2 || !zZzk) {
                    zzos3.zzNv();
                    arrayList.add(zzos3);
                    zzos3 = new zzOS();
                }
                if (zz0qZzZ.getCount() == 2 && !zZzk2 && !zZzk) {
                    zzos3.zzNu().add(zz0qZzZ.get(1));
                }
            }
            i++;
        }
        if (zzos3.zzNu().getCount() > 1) {
            zzos3.zzNv();
            arrayList.add(zzos3);
        }
        return arrayList;
    }

    private static ArrayList<zzOS> zzT(zzOS zzos, zzOS zzos2) {
        zzos.zzNw();
        zzos2.zzNw();
        return zzW(zzS(zzos, zzos2), zzS(zzos2, zzos));
    }

    private static ArrayList<zzOS> zzW(ArrayList<zzOS> arrayList, ArrayList<zzOS> arrayList2) {
        ArrayList<zzOS> arrayList3 = new ArrayList<>();
        zzOS zzos = new zzOS();
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(arrayList);
        arrayList4.add(arrayList2);
        int[] iArrZzS = zzS((ArrayList<ArrayList<zzOS>>) arrayList4, 0);
        zzOS zzosZzX = zzX(arrayList4, iArrZzS[0], iArrZzS[1]);
        while (true) {
            if (zzosZzX == null) {
                break;
            }
            zzR(zzosZzX, zzos);
            int i = iArrZzS[0] == 0 ? 1 : 0;
            int[] iArrZzZ = zzZ(zzosZzX, arrayList4, i);
            if (iArrZzZ == null) {
                zzOS zzosZzZ = zzZ((ArrayList<ArrayList<zzOS>>) arrayList4, zzos.zzNu().get(0));
                if (zzosZzZ != null) {
                    zzos.zzNu().zzZ(0, zzosZzZ.zzNu().zzZC(0, zzosZzZ.zzNu().getCount() - 1));
                    break;
                }
                zzZ(zzos, arrayList3);
                zzos = new zzOS();
                iArrZzS = zzS((ArrayList<ArrayList<zzOS>>) arrayList4, i ^ 1);
            } else {
                iArrZzS = iArrZzZ;
            }
            zzosZzX = zzX(arrayList4, iArrZzS[0], iArrZzS[1]);
        }
        zzZ(zzos, arrayList3);
        return arrayList3;
    }

    private static zzOS zzX(ArrayList<ArrayList<zzOS>> arrayList, int i, int i2) {
        if (arrayList.get(i).size() <= i2) {
            return null;
        }
        zzOS zzos = arrayList.get(i).get(i2);
        arrayList.get(i).remove(zzos);
        return zzos;
    }

    private static void zzZ(long j, zz0Q zz0q) {
        if (zz0q.getCount() >= 2 && zzJ6.zzW(j, zz0q.get(1), zzJ6.zzO(j, zz0q.get(0)))) {
            zz0q.reverse();
        }
    }

    private static int[] zzZ(zzOS zzos, ArrayList<ArrayList<zzOS>> arrayList, int i) {
        long j = zzos.zzNu().get(zzos.zzNu().getCount() - 1);
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayList<zzOS> arrayList2 = arrayList.get(i);
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                if (zzJ6.zzN(j, arrayList2.get(i3).zzNu().get(0))) {
                    return new int[]{i, i3};
                }
            }
            i = i == 0 ? 1 : 0;
        }
        return null;
    }

    private static zzOS zzZ(ArrayList<ArrayList<zzOS>> arrayList, long j) {
        zzOS zzos;
        if (arrayList.get(1).size() + arrayList.get(0).size() != 1) {
            return null;
        }
        if (arrayList.get(0).size() == 1) {
            zzos = arrayList.get(0).get(0);
        } else {
            zzos = arrayList.get(1).get(0);
        }
        if (zzJ6.zzN(j, zzos.zzNu().get(zzos.zzNu().getCount() - 1))) {
            return zzos;
        }
        return null;
    }

    private static void zzZ(zzOS zzos, ArrayList<zzOS> arrayList) {
        if (zzos.zzNu().getCount() <= 2) {
            return;
        }
        if (zzJ6.zzN(zzos.zzNu().get(0), zzos.zzNu().get(zzos.zzNu().getCount() - 1))) {
            zzos.zzNu().removeAt(zzos.zzNu().getCount() - 1);
        }
        arrayList.add(zzos);
    }

    private static zz0Q zzZ(zzPB zzpb, zzOS zzos) {
        zz0Q zz0q = new zz0Q();
        long[] jArr = new long[1];
        int i = 0;
        while (i < zzos.zzNu().getCount()) {
            if (zzPB.zzZ(zzpb, new zzPB(zzos.zzNu().get(i), zzos.zzNu().get(i < zzos.zzNu().getCount() - 1 ? i + 1 : 0)), jArr, false)) {
                zz0q.add(jArr[0]);
            }
            i++;
        }
        return zz0q;
    }

    private static int[] zzS(ArrayList<ArrayList<zzOS>> arrayList, int i) {
        if (arrayList.get(i).size() == 0) {
            i = i == 0 ? 1 : 0;
        }
        return new int[]{i, 0};
    }
}
