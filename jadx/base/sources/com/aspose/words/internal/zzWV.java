package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.domain.models.backup.BackupEvent;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzWV {
    private static int[] zzTN = {15, 16, 17, 18, 19, 1236, 1237};
    private static zzD4 zzTO;

    static {
        zzD4 zzd4 = new zzD4();
        zzTO = zzd4;
        zzd4.add(1220, 0);
        zzTO.add(1230, 1);
        zzTO.add(0, 2);
        zzTO.add(1, 3);
        zzTO.add(1200, 4);
        zzTO.add(2, 5);
        zzTO.add(3, 6);
        zzTO.add(4, 7);
        zzTO.add(1201, 8);
        zzTO.add(1202, 9);
        zzTO.add(1203, 10);
        zzTO.add(1204, 11);
        zzTO.add(1205, 12);
        zzTO.add(1206, 13);
        zzTO.add(1207, 14);
        zzTO.add(13, 15);
        zzTO.add(5, 16);
        zzTO.add(1208, 17);
        zzTO.add(14, 18);
        zzTO.add(15, 19);
        zzTO.add(16, 20);
        zzTO.add(17, 21);
        zzTO.add(1221, 22);
        zzTO.add(1222, 23);
        zzTO.add(1223, 24);
        zzTO.add(1231, 25);
        zzTO.add(1232, 26);
        zzTO.add(1233, 27);
        zzTO.add(1234, 28);
        zzTO.add(1235, 29);
        zzTO.add(1237, 30);
        zzTO.add(1236, 31);
        zzTO.add(1238, 32);
        zzTO.add(18, 33);
        zzTO.add(6, 34);
        zzTO.add(7, 35);
        zzTO.add(8, 36);
        zzTO.add(9, 37);
        zzTO.add(1209, 38);
        zzTO.add(1210, 39);
        zzTO.add(1211, 40);
        zzTO.add(10, 41);
        zzTO.add(11, 42);
        zzTO.add(CommonConstant.RETCODE.NEED_UPDATE_STATICKIT, 43);
        zzTO.add(1213, 44);
        zzTO.add(1214, 45);
        zzTO.add(1217, 46);
        zzTO.add(1218, 47);
        zzTO.add(1219, 48);
        zzTO.add(20, 49);
        zzTO.add(21, 50);
        zzTO.add(19, 51);
    }

    private static int zzB(int i, int i2) {
        return (((-(i - 251)) * 256) - i2) + BackupEvent.ERROR_UID_NOT_EXIST;
    }

    private static int zzC(int i, int i2) {
        return ((i - 247) * 256) + i2 + 108;
    }

    private static boolean zzD(int i, int i2) {
        int i3 = zzTO.get(i);
        int i4 = zzTO.get(i2);
        if (zzD4.zzWm(i) && zzD4.zzWm(i2)) {
            return true;
        }
        if (zzD4.zzWm(i)) {
            return false;
        }
        return zzD4.zzWm(i2) || i3 <= i4;
    }

    public static zzWW zzO(byte[] bArr) {
        zzWU zzwu = new zzWU(bArr);
        while (!zzwu.zzUY()) {
            zzZ(zzwu);
        }
        return new zzWW(zzwu.zzVb());
    }

    private static void zzT(zzXZ zzxz, int i) throws Exception {
        zzxz.writeByte((byte) 29);
        zzxz.zzl(i);
    }

    private static void zzU(zzXZ zzxz, int i) throws Exception {
        zzxz.writeByte((byte) 28);
        zzxz.zzj((short) i);
    }

    private static void zzV(zzXZ zzxz, int i) throws Exception {
        int i2 = (-i) + BackupEvent.ERROR_UID_NOT_EXIST;
        zzxz.writeByte((byte) ((i2 / 256) + StyleIdentifier.MEDIUM_LIST_1_ACCENT_6));
        zzxz.writeByte((byte) (i2 % 256));
    }

    private static void zzW(zzXZ zzxz, int i) throws Exception {
        int i2 = i + BackupEvent.ERROR_UID_NOT_EXIST;
        zzxz.writeByte((byte) ((i2 / 256) + StyleIdentifier.LIGHT_LIST_ACCENT_6));
        zzxz.writeByte((byte) (i2 % 256));
    }

    private static void zzX(zzXZ zzxz, int i) throws Exception {
        zzxz.writeByte((byte) (i + 139));
    }

    private static void zzY(zzXZ zzxz, int i) throws Exception {
        if (i >= -107 && i <= 107) {
            zzX(zzxz, i);
            return;
        }
        if (i >= 108 && i <= 1131) {
            zzW(zzxz, i);
            return;
        }
        if (i >= -1131 && i <= -108) {
            zzV(zzxz, i);
        } else if (i < -32768 || i > 32767) {
            zzT(zzxz, i);
        } else {
            zzU(zzxz, i);
        }
    }

    public static void zzZ(zzXZ zzxz, zzWW zzww) throws Exception {
        for (int i : zzZ(zzww)) {
            zzZ(zzxz, i, zzww.zzVb().get(Integer.valueOf(i)));
        }
    }

    private static boolean zzZA(int i) {
        if (i < 0 || i > 21 || i == 12) {
            return i >= 1200 && i <= 1455;
        }
        return true;
    }

    private static boolean zzZz(int i) {
        for (int i2 : zzTN) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    private static void zzX(byte b, zzWU zzwu) {
        zzwu.zzZy(zzC(b & 255, zzwu.readByte() & 255));
    }

    private static void zzX(zzWU zzwu) {
        zzwu.zzZy(((zzwu.readByte() & 255) << 24) | ((zzwu.readByte() & 255) << 16) | ((zzwu.readByte() & 255) << 8) | (zzwu.readByte() & 255));
    }

    private static int[] zzZ(zzWW zzww) {
        boolean z;
        int size = zzww.zzVb().size();
        int[] iArr = new int[size];
        Iterator<Map.Entry<Integer, Object[]>> it = zzww.zzVb().entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().getKey().intValue();
            i++;
        }
        do {
            int i2 = 0;
            z = false;
            while (i2 < size - 1) {
                int i3 = i2 + 1;
                if (!zzD(iArr[i2], iArr[i3])) {
                    int i4 = iArr[i2];
                    iArr[i2] = iArr[i3];
                    iArr[i3] = i4;
                    z = true;
                }
                i2 = i3;
            }
        } while (z);
        return iArr;
    }

    private static ArrayList<Integer> zzV(zzWU zzwu) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true) {
            byte b = zzwu.readByte();
            int i = (b & 240) >> 4;
            int i2 = b & 15;
            if (i == 15) {
                break;
            }
            zzZQG.zzZ(arrayList, Integer.valueOf(i));
            if (i2 == 15) {
                break;
            }
            zzZQG.zzZ(arrayList, Integer.valueOf(i2));
        }
        return arrayList;
    }

    private static void zzW(byte b, zzWU zzwu) {
        zzwu.zzZy(zzB(b & 255, zzwu.readByte() & 255));
    }

    private static void zzY(byte b, zzWU zzwu) {
        zzwu.zzZy((b & 255) - 139);
    }

    private static void zzW(zzWU zzwu) {
        zzwu.zzH(zzY(zzV(zzwu)));
    }

    private static void zzY(zzWU zzwu) {
        zzwu.zzZy(((zzwu.readByte() & 255) << 8) | (zzwu.readByte() & 255));
    }

    private static double zzY(ArrayList<Integer> arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            switch (iIntValue) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    zzZNH.zzU(sb, zzJB.zzWD(iIntValue));
                    break;
                case 10:
                    sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                    break;
                case 11:
                    sb.append('E');
                    break;
                case 12:
                    zzZNH.zzU(sb, "E-");
                    break;
                case 13:
                default:
                    throw new IllegalArgumentException("Invalid nibble value.");
                case 14:
                    sb.append('-');
                    break;
            }
        }
        return zzJB.parseDouble(sb.toString());
    }

    private static void zzZ(zzWU zzwu) {
        byte b = zzwu.readByte();
        int i = b & 255;
        if (i >= 0 && i <= 21) {
            zzZ(b, zzwu);
            return;
        }
        if (i >= 32 && i <= 246) {
            zzY(b, zzwu);
            return;
        }
        if (i >= 247 && i <= 250) {
            zzX(b, zzwu);
            return;
        }
        if (i >= 251 && i <= 254) {
            zzW(b, zzwu);
            return;
        }
        if (i == 28) {
            zzY(zzwu);
        } else if (i == 29) {
            zzX(zzwu);
        } else if (i == 30) {
            zzW(zzwu);
        }
    }

    private static void zzZ(zzXZ zzxz, int i, Object[] objArr) throws Exception {
        if (zzZA(i)) {
            boolean zZzZz = zzZz(i);
            for (Object obj : objArr) {
                if (!zZzZz) {
                    zzZ(zzxz, obj);
                } else if (obj instanceof Integer) {
                    zzT(zzxz, ((Integer) obj).intValue());
                } else {
                    throw new IllegalStateException("Unsupported operand type.");
                }
            }
            zzZ(zzxz, i);
            return;
        }
        throw new IllegalStateException("Invalid operator.");
    }

    private static void zzZ(byte b, zzWU zzwu) {
        int i = b & 255;
        if (i == 12) {
            zzwu.zzZx((zzwu.readByte() & 255) + 1200);
        } else {
            zzwu.zzZx(i);
        }
    }

    private static void zzZ(zzXZ zzxz, int i) throws Exception {
        if (i >= 1200) {
            zzxz.writeByte((byte) 12);
            zzxz.writeByte((byte) (i - 1200));
        } else {
            zzxz.writeByte((byte) i);
        }
    }

    private static void zzZ(zzXZ zzxz, Object obj) throws Exception {
        if (obj instanceof Integer) {
            zzY(zzxz, ((Integer) obj).intValue());
        } else {
            if (obj instanceof Double) {
                zzZ(zzxz, ((Double) obj).doubleValue());
                return;
            }
            throw new IllegalStateException("Unsupported operand type.");
        }
    }

    private static void zzZ(zzXZ zzxz, double d) throws Exception {
        String strZzZZ = zzJB.zzZZ(d);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < strZzZZ.length()) {
            int i2 = i + 1;
            char cCharAt = strZzZZ.charAt(i);
            if (cCharAt == '-') {
                zzZQG.zzZ((ArrayList<int>) arrayList, 14);
            } else if (cCharAt == '.') {
                zzZQG.zzZ((ArrayList<int>) arrayList, 10);
            } else if (cCharAt != 'E') {
                switch (cCharAt) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        zzZQG.zzZ((ArrayList<Integer>) arrayList, Integer.valueOf(cCharAt - '0'));
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid nibble value.");
                }
            } else {
                if (strZzZZ.charAt(i2) == '-') {
                    zzZQG.zzZ((ArrayList<int>) arrayList, 12);
                } else if (strZzZZ.charAt(i2) == '+') {
                    zzZQG.zzZ((ArrayList<int>) arrayList, 11);
                } else {
                    zzZQG.zzZ((ArrayList<int>) arrayList, 11);
                }
                i += 2;
            }
            i = i2;
        }
        zzZQG.zzZ((ArrayList<int>) arrayList, 15);
        if (arrayList.size() % 2 == 1) {
            zzZQG.zzZ((ArrayList<int>) arrayList, 15);
        }
        zzxz.writeByte((byte) 30);
        for (int i3 = 0; i3 < arrayList.size() / 2; i3++) {
            int i4 = i3 * 2;
            zzxz.writeByte((byte) (((Integer) arrayList.get(i4 + 1)).intValue() | (((Integer) arrayList.get(i4)).intValue() << 4)));
        }
    }
}
