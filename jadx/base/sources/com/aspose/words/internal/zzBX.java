package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;
import com.aspose.words.internal.zzD4;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes5.dex */
final class zzBX {
    private static zzD4 zzt7;
    private static int[] zztg = {0, 173, 69, 67, 187, 71, 186, 65, 74, 169, 76, 78, 81, 84, 87, 88, 89, 90, 96, 98, 100, 102, 104, 105, 106, 110, 114, 0, 0, 0, 0, 0, 95, 117, 120, 122, 124, 126, 225, 164, 165, 172, 168, 199, 200, 203, 196, 197, 202, 201, 198, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] zztf = {0, 173, 69, 67, 187, 71, 174, 65, 73, 169, 75, 77, 79, 82, 85, 88, 89, 90, 96, 97, 99, 101, 103, 105, 106, 107, 111, 0, 0, 0, 0, 0, 95, 115, 118, 121, 123, 125, 127, 161, 165, 172, 166, 199, 200, 203, 196, 197, 202, 201, 198, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] zzte = {0, 173, 70, 68, 187, 72, 174, 66, 73, 169, 75, 77, 79, 82, 85, 88, 89, 90, 96, 97, 99, 101, 103, 105, 106, 108, 112, 0, 0, 0, 0, 0, 95, 116, 119, 121, 123, 125, 127, 162, 165, 172, 166, 199, 200, 203, 196, 197, 202, 201, 198, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] zztd = {0, 173, 70, 68, 187, 72, 175, 66, 74, 170, 76, 78, 80, 83, 86, 88, 89, 90, 96, 98, 100, 102, 104, 105, 106, 109, 113, 0, 0, 0, 0, 0, 95, 117, 120, 122, 124, 126, 225, 163, 165, 171, 167, 199, 200, 203, 196, 197, 202, 201, 198, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] zztc = {0, 213, 69, 67, 218, 71, 217, 65, 76, 209, 80, 84, 88, 96, 100, 101, 103, 105, 107, 112, 116, 120, 126, 162, 163, 170, 174, 0, 0, 0, 0, 0, 95, 178, 182, 186, 190, 194, 198, 202, 203, 212, 208, 231, 232, 235, 228, 229, 234, 233, 230, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] zztb = {0, 213, 69, 67, 218, 71, 214, 65, 73, 209, 77, 81, 85, 89, 97, 101, 103, 105, 107, 109, 113, 117, 121, 127, 163, 167, 171, 0, 0, 0, 0, 0, 95, 175, 179, 183, 187, 191, 195, 199, 203, 212, 205, 231, 232, 235, 228, 229, 234, 233, 230, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] zzta = {0, 213, 70, 68, 219, 72, 215, 66, 74, 209, 78, 82, 86, 90, 98, 102, 104, 106, 108, 110, 114, 118, 122, 241, 164, 168, 172, 0, 0, 0, 0, 0, 95, 176, 180, 184, 188, 192, 196, 200, 204, 212, 206, 231, 232, 235, 228, 229, 234, 233, 230, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] zzt9 = {0, 213, 70, 68, 219, 72, 216, 66, 75, 210, 79, 83, 87, 92, 99, 102, 104, 106, 108, 111, 115, 119, 124, 161, 165, 169, 173, 0, 0, 0, 0, 0, 95, 177, 181, 185, 189, 193, 197, 201, 204, 211, 207, 231, 232, 235, 228, 229, 234, 233, 230, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static int[] zzt8 = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 8362, 165, 166, 167, 168, 169, 215, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, StyleIdentifier.LIGHT_LIST_ACCENT_6, 187, 188, 189, 190, 191, 1456, 1457, 1458, 1459, 1460, 1461, 1462, 1463, 1464, 1465, 1466, 1467, 1468, 1469, 1470, 1471, 1472, 1473, 1474, 1475, 1520, 1521, 1522, 1523, 1524, 217, 218, 219, 220, 221, 222, 223, 1488, 1489, 1490, 1491, 1492, 1493, 1494, 1495, 1496, 1497, 1498, 1499, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 1501, 1502, 1503, 1504, 1505, 1506, 1507, 1508, 1509, 1510, 1511, 1512, 1513, 1514, StyleIdentifier.MEDIUM_LIST_1_ACCENT_6, StyleIdentifier.MEDIUM_LIST_2_ACCENT_6, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, StyleIdentifier.MEDIUM_GRID_2_ACCENT_6, 255};

    static {
        zzD4 zzd4 = new zzD4();
        zzt7 = zzd4;
        zzd4.add(32, 32);
        zzt7.add(33, 33);
        zzt7.add(34, 34);
        zzt7.add(37, 37);
        zzt7.add(40, 40);
        zzt7.add(41, 41);
        zzt7.add(42, 42);
        zzt7.add(43, 43);
        zzt7.add(44, 94);
        zzt7.add(45, 45);
        zzt7.add(46, 46);
        zzt7.add(47, 47);
        zzt7.add(58, 58);
        zzt7.add(59, 59);
        zzt7.add(61, 61);
        zzt7.add(63, 63);
        zzt7.add(91, 91);
        zzt7.add(93, 93);
        zzt7.add(171, 35);
        zzt7.add(187, 36);
        zzt7.add(215, 38);
        zzt7.add(StyleIdentifier.LIGHT_LIST_ACCENT_6, 39);
        zzt7.add(1548, 44);
        zzt7.add(1563, 59);
        zzt7.add(1567, 63);
        zzt7.add(65269, 224);
        zzt7.add(65270, 225);
        zzt7.add(65271, 222);
        zzt7.add(65272, 223);
        zzt7.add(65273, 226);
        zzt7.add(65274, 227);
        zzt7.add(65275, 220);
        zzt7.add(65276, 221);
    }

    public static void zzX(zzZX5 zzzx5) {
        zzZ(zzzx5, zzt8);
    }

    public static void zzY(zzZX5 zzzx5) {
        zzZ(zzzx5, 61952, zztc, 3);
        zzZ(zzzx5, 61952, zztb, 0);
        zzZ(zzzx5, 61952, zzta, 1);
        zzZ(zzzx5, 61952, zzt9, 2);
        zzZ(zzzx5, 61952, zzt7);
    }

    public static void zzZ(zzZX5 zzzx5) {
        zzZ(zzzx5, 61696, zztg, 3);
        zzZ(zzzx5, 61696, zztf, 0);
        zzZ(zzzx5, 61696, zzte, 1);
        zzZ(zzzx5, 61696, zztd, 2);
        zzZ(zzzx5, 61696, zzt7);
    }

    private static void zzZ(zzZX5 zzzx5, int i, zzD4 zzd4) {
        zzD4.zzZ zzzZzCP = zzd4.zzCP();
        while (zzzZzCP.moveNext()) {
            zzZ(zzzx5, zzzZzCP.zzCL() + i, zzzZzCP.zzCM());
        }
    }

    private static void zzZ(zzZX5 zzzx5, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = 61472 + i;
            int i3 = iArr[i];
            if (i3 != 0) {
                zzZ(zzzx5, i2, i3);
            }
        }
    }

    private static void zzZ(zzZX5 zzzx5, int i, int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = i3 + 1568;
            int i5 = iArr[i3];
            int i6 = i + i5;
            if (i5 != 0) {
                zzZ(zzzx5, i6, i4, i2);
            }
        }
    }

    private static void zzZ(zzZX5 zzzx5, int i, int i2, int i3) {
        if (i3 == 3) {
            zzZ(zzzx5, i, i2);
        }
        char cZzU = zzZVW.zzU((char) i2, i3);
        if (cZzU != i2) {
            zzZ(zzzx5, i, cZzU);
        }
    }

    private static void zzZ(zzZX5 zzzx5, int i, int i2) {
        zzZX9 zzzx9ZzSy = zzzx5.zzSy(i);
        if (zzzx9ZzSy == null) {
            return;
        }
        zzzx5.zzZv(i2, zzzx9ZzSy.getGlyphIndex());
    }
}
