package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.io.EOFException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes6.dex */
public class FileFormatUtil {
    private static HashMap<Integer, Integer> zzYzB = new HashMap<>();
    private static HashMap<Integer, Integer> zzYzA = new HashMap<>();
    private static HashMap<Integer, Integer> zzYzz = new HashMap<>();
    private static HashMap<Integer, Integer> zzYzy = new HashMap<>();
    private static HashMap<Integer, Integer> zzYzx = new HashMap<>();
    private static HashMap<Integer, Integer> zzYzw = new HashMap<>();

    static {
        zzJ(13, 10, 10, 1);
        zzJ(13, 0, 0, 1);
        zzJ(14, 11, 11, 1);
        zzJ(15, 20, 20, 1);
        zzJ(15, 0, StyleIdentifier.MEDIUM_GRID_2_ACCENT_6, 1);
        zzJ(16, 21, 21, 1);
        zzJ(17, 22, 22, 1);
        zzJ(18, 23, 23, 1);
        zzJ(20, 24, 24, 1);
        zzJ(21, 25, 25, 1);
        zzJ(22, 26, 26, 1);
        zzJ(23, 27, 27, 1);
        zzJ(26, 30, 30, 1);
        zzJ(19, 31, 31, 1);
        zzJ(27, 50, 50, 1);
        zzJ(28, 45, 255, 1);
        zzJ(29, 51, 51, 1);
        zzJ(30, 54, 52, 1);
        zzJ(31, 0, 53, 1);
        zzJ(33, 53, 54, 1);
        zzJ(24, 60, 60, 1);
        zzJ(25, 61, 61, 1);
        zzJ(36, 40, 64, 1);
        zzJ(43, 47, 255, 1);
        zzJ(44, 48, 255, 1);
        zzJ(37, 41, 255, 1);
        zzJ(38, 46, 255, 1);
        zzJ(40, 42, 255, 1);
        zzJ(39, 44, 255, 1);
        zzJ(32, 52, 55, 1);
        zzJ(34, 70, 62, 1);
        zzJ(35, 73, 63, 1);
        zzJ(41, 71, 255, 1);
        zzJ(8, 100, 255, 1);
        zzJ(9, 105, 255, 1);
        zzJ(6, 101, 255, 6);
        zzJ(7, 102, 255, 7);
        zzJ(5, 104, 255, 5);
        zzJ(4, 0, 255, 4);
        zzJ(3, 0, 255, 3);
        zzJ(42, 72, 255, 1);
        zzJ(2, 103, 255, 2);
        zzJ(10, 106, 255, 8);
        zzJ(48, 80, 255, 1);
        zzJ(11, 0, 255, 9);
    }

    private FileFormatUtil() {
    }

    public static int contentTypeToLoadFormat(String str) {
        int iZzC2 = zzC2(com.aspose.words.internal.zzKE.zzZU(str));
        if (iZzC2 != 255) {
            return iZzC2;
        }
        throw new IllegalArgumentException("Cannot convert this content type to a load format.");
    }

    public static int contentTypeToSaveFormat(String str) {
        int iZzC8 = zzC8(com.aspose.words.internal.zzKE.zzZU(str));
        if (iZzC8 != 0) {
            return iZzC8;
        }
        throw new IllegalArgumentException("Cannot convert this content type to a save format.");
    }

    public static FileFormatInfo detectFileFormat(String str) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "fileName");
        com.aspose.words.internal.zzZOS zzzosZzVj = com.aspose.words.internal.zzZOU.zzVj(str);
        try {
            return zzZb(zzzosZzVj);
        } finally {
            zzzosZzVj.close();
        }
    }

    public static int extensionToSaveFormat(String str) {
        if (str != null) {
            return zzC8(com.aspose.words.internal.zzKE.zzZT(str));
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: extension");
    }

    public static String imageTypeToExtension(int i) {
        if (i == 0 || i == 1) {
            throw new IllegalArgumentException("Cannot convert this image type to a file extension.");
        }
        return "." + com.aspose.words.internal.zzKE.zzWX(zzC3(i));
    }

    public static String loadFormatToExtension(int i) {
        if (i == 12) {
            i = 10;
        }
        String strZzWX = com.aspose.words.internal.zzKE.zzWX(zzC5(i));
        if (com.aspose.words.internal.zzZYD.zzXk(strZzWX)) {
            return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o(".", strZzWX);
        }
        throw new IllegalArgumentException("Cannot convert this load format to a file extension.");
    }

    public static int loadFormatToSaveFormat(int i) {
        int iZzC8 = zzC8(zzC5(i));
        if (iZzC8 != 0) {
            return iZzC8;
        }
        throw new IllegalArgumentException("Cannot convert this load format to a save format.");
    }

    public static String saveFormatToExtension(int i) {
        String strZzWX = com.aspose.words.internal.zzKE.zzWX(zzC4(i));
        if (com.aspose.words.internal.zzZYD.zzXk(strZzWX)) {
            return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o(".", strZzWX);
        }
        throw new IllegalArgumentException("Cannot convert this save format to a file extension.");
    }

    public static int saveFormatToLoadFormat(int i) {
        int iZzC2 = zzC2(zzC4(i));
        if (iZzC2 != 255) {
            return iZzC2;
        }
        throw new IllegalArgumentException("Cannot convert this save format to a load format.");
    }

    private static int zzC2(int i) {
        return ((Integer) com.aspose.words.internal.zzQW.zzZ(zzYzy, Integer.valueOf(i), 255)).intValue();
    }

    private static int zzC3(int i) {
        return ((Integer) com.aspose.words.internal.zzQW.zzZ(zzYzz, Integer.valueOf(i), 0)).intValue();
    }

    public static int zzC4(int i) {
        return ((Integer) com.aspose.words.internal.zzQW.zzZ(zzYzA, Integer.valueOf(i), 0)).intValue();
    }

    private static int zzC5(int i) {
        return ((Integer) com.aspose.words.internal.zzQW.zzZ(zzYzB, Integer.valueOf(i), 0)).intValue();
    }

    public static boolean zzC6(int i) {
        return i == 20 || i == 21 || i == 22 || i == 23 || i == 24 || i == 25 || i == 26 || i == 27 || i == 31;
    }

    public static int zzC7(int i) {
        RefInt refInt = new RefInt(0);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(zzYzw, Integer.valueOf(i), refInt);
        int i2 = refInt.get();
        if (zZzZ) {
            return i2;
        }
        return 1;
    }

    public static int zzC8(int i) {
        RefInt refInt = new RefInt(0);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(zzYzx, Integer.valueOf(i), refInt);
        int i2 = refInt.get();
        if (zZzZ) {
            return i2;
        }
        return 0;
    }

    public static String zzC9(int i) {
        return com.aspose.words.internal.zzKE.toString(zzC4(i));
    }

    private static void zzJ(int i, int i2, int i3, int i4) {
        if (i2 != 0) {
            com.aspose.words.internal.zzZQF.zzY(zzYzx, Integer.valueOf(i), Integer.valueOf(i2));
            com.aspose.words.internal.zzZQF.zzY(zzYzA, Integer.valueOf(i2), Integer.valueOf(i));
        }
        if (i3 != 255) {
            if (!zzYzy.containsKey(Integer.valueOf(i))) {
                com.aspose.words.internal.zzZQF.zzY(zzYzy, Integer.valueOf(i), Integer.valueOf(i3));
            }
            com.aspose.words.internal.zzZQF.zzY(zzYzB, Integer.valueOf(i3), Integer.valueOf(i));
        }
        if (i4 != 1) {
            com.aspose.words.internal.zzZQF.zzY(zzYzw, Integer.valueOf(i), Integer.valueOf(i4));
            com.aspose.words.internal.zzZQF.zzY(zzYzz, Integer.valueOf(i4), Integer.valueOf(i));
        }
    }

    public static Exception zzY(Exception exc) {
        return ((exc instanceof IllegalStateException) || (exc instanceof EOFException) || (exc instanceof IndexOutOfBoundsException) || (exc instanceof IllegalArgumentException) || (exc instanceof NullPointerException) || (exc instanceof NumberFormatException) || (exc instanceof ZipException)) ? new FileCorruptedException(exc) : exc;
    }

    public static FileFormatInfo zzZb(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (zzzop == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: stream");
        }
        try {
            return new zzZOD().zzY(zzzop, null);
        } catch (Exception e) {
            throw zzY(e);
        }
    }

    public static FileFormatInfo detectFileFormat(InputStream inputStream) throws Exception {
        return zzZb(com.aspose.words.internal.zzZKB.zzW(inputStream));
    }
}
