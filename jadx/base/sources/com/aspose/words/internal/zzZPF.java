package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZPF {
    private static char zzZYZ;
    private static int[][] zzZZ0;
    private static zzZ[] zzZZ1;

    public static class zzZ {
        int token;
        int value;

        public zzZ(int i, int i2) {
            this.token = i;
            this.value = i2;
        }
    }

    static {
        zzZ[] zzzArr = {new zzZ(4, 1), new zzZ(4, 2), new zzZ(4, 3), new zzZ(4, 4), new zzZ(4, 5), new zzZ(5, 6), new zzZ(5, 7), new zzZ(4, 8), new zzZ(7, 9), new zzZ(3, 10), new zzZ(-1, -1), new zzZ(3, 20), new zzZ(3, 30), new zzZ(-1, -1), new zzZ(3, 40), new zzZ(-1, -1), new zzZ(3, 50), new zzZ(3, 60), new zzZ(3, 70), new zzZ(-1, -1), new zzZ(3, 80), new zzZ(-1, -1), new zzZ(3, 90), new zzZ(2, 100), new zzZ(1, 200), new zzZ(1, 300), new zzZ(0, 400)};
        zzZZ1 = zzzArr;
        zzZZ0 = new int[][]{new int[]{1, 10, 10, 9, 8, 8, 8, 14, -1, -1}, new int[]{2, 3, 3, 4, -1, -1, -1, 15, 100, 11}, new int[]{-1, -1, 13, 4, -1, -1, -1, 15, -1, 12}, new int[]{-1, -1, -1, 6, -1, -1, -1, 15, -1, 5}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, 7}, new int[]{-1, -1, -1, 100, 100, 100, 100, 100, -1, -1}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, 7}, new int[]{-1, -1, -1, -1, 100, 100, 100, 100, -1, -1}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 100, -1}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 100, 7}, new int[]{-1, -1, -1, 4, -1, -1, -1, 15, 100, 5}, new int[]{100, 100, 100, 100, 100, 100, 100, 100, -1, -1}, new int[]{-1, -1, 100, 100, 100, 100, 100, 100, -1, -1}, new int[]{-1, -1, -1, 6, -1, -1, -1, 15, -1, 5}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 100, 16}, new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, 16}, new int[]{-1, -1, -1, -1, -1, 100, 100, -1, -1, -1}};
        zzZYZ = (char) (zzzArr.length + 1487);
    }

    public static String toString(int i) {
        StringBuilder sb = new StringBuilder();
        if (i > 5000) {
            i -= 5000;
        }
        int i2 = i / 100;
        char c = 1510;
        if (i2 > 0) {
            i -= i2 * 100;
            for (int i3 = 0; i3 < i2 / 4; i3++) {
                sb.append((char) 1514);
            }
            int i4 = i2 % 4;
            if (i4 > 0) {
                sb.append((char) (i4 + 1510));
            }
        }
        int i5 = i / 10;
        int i6 = i % 10;
        switch (i5) {
            case 0:
            default:
                c = 0;
                break;
            case 1:
                c = 1497;
                break;
            case 2:
                c = 1499;
                break;
            case 3:
                c = 1500;
                break;
            case 4:
                c = 1502;
                break;
            case 5:
                c = 1504;
                break;
            case 6:
                c = 1505;
                break;
            case 7:
                c = 1506;
                break;
            case 8:
                c = 1508;
                break;
            case 9:
                break;
        }
        char c2 = i6 > 0 ? (char) (i6 + 1487) : (char) 0;
        char c3 = 1496;
        if (c2 == 1492 && c == 1497) {
            c = 1496;
            c2 = 1493;
        }
        if (c2 == 1493 && c == 1497) {
            c2 = 1494;
        } else {
            c3 = c;
        }
        if (c3 != 0) {
            sb.append(c3);
        }
        if (c2 != 0) {
            sb.append(c2);
        }
        if (sb.length() > 1) {
            sb.insert(sb.length() - 1, '\"');
        } else {
            sb.append('\'');
        }
        return sb.toString();
    }

    public static int zzZ(char c, zzZPE zzzpe) {
        zzZ zzz;
        int i;
        int i2;
        if (c == '\'') {
            i2 = 8;
        } else {
            if (c != '\"') {
                int i3 = c - 1488;
                if (i3 >= 0) {
                    zzZ[] zzzArr = zzZZ1;
                    if (i3 >= zzzArr.length || (i = (zzz = zzzArr[i3]).token) == -1) {
                        return 1;
                    }
                    zzzpe.zzZYY += zzz.value;
                    i2 = i;
                }
                return 1;
            }
            i2 = 9;
        }
        int i4 = zzZZ0[zzzpe.state][i2];
        zzzpe.state = i4;
        if (i4 == -1) {
            return 0;
        }
        return i4 == 100 ? 2 : 3;
    }

    public static boolean zzZW(char c) {
        return (c < 1488 || c > zzZYZ) ? c == '\'' || c == '\"' : zzZZ1[c - 1488].value >= 0;
    }
}
