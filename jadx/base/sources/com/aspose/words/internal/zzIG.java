package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzIG {
    private static char[][] zzxY = {new char[]{1488, 1489, 1490, 1491, 1492, 1493, 1494, 1495, 1496}, new char[]{1497, 1499, 1500, 1502, 1504, 1505, 1506, 1508, 1510}, new char[]{1511, 1512, 1513}};

    private static String zzV(ArrayList<Integer> arrayList, int i) {
        if (i == 1 && arrayList.get(i).intValue() == 1) {
            int iIntValue = arrayList.get(i - 1).intValue();
            if (iIntValue == 5) {
                return "טו";
            }
            if (iIntValue == 6) {
                return "טז";
            }
        }
        return null;
    }

    public static String zzZX(long j) {
        int iZzZv = zz7H.zzZv(j);
        StringBuilder sb = new StringBuilder();
        zzZNH.zzU(sb, zzZKN.zzS((char) 1514, iZzZv / 22));
        int i = iZzZv % 22;
        if (i > 0) {
            sb.append("אבגדהוזחטיכלמנסעפצקרש".charAt(i - 1));
        }
        return sb.toString();
    }

    public static String zzZY(long j) {
        if (j == 0) {
            return "";
        }
        ArrayList<Integer> arrayListZzQ = zzIU.zzQ(zz7H.zzZv(j), 1);
        StringBuilder sb = new StringBuilder();
        for (int size = arrayListZzQ.size() - 1; size >= 0; size--) {
            String strZzV = zzV(arrayListZzQ, size);
            if (strZzV != null) {
                zzZNH.zzU(sb, strZzV);
                return sb.toString();
            }
            int iIntValue = arrayListZzQ.get(size).intValue();
            if (iIntValue != 0) {
                sb.append(zzxY[size][iIntValue - 1]);
            }
        }
        return sb.toString();
    }
}
