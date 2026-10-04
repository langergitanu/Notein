package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZK {
    private static HashMap<Integer, String> zzWSM = new HashMap<>();
    private static HashMap<Integer, String> zzWSL = new HashMap<>();
    private static HashMap<Integer, String> zzWSK = new HashMap<>();
    private static HashMap<Integer, String> zzWSJ = new HashMap<>();
    private static HashMap<Integer, String> zzWSI = new HashMap<>();
    private static HashMap<String, Integer> zzWSH = new HashMap<>();
    private static HashMap<String, Integer> zzWSG = new HashMap<>();

    static {
        com.aspose.words.internal.zzZQF.zzY(zzWSM, 2, "double");
        com.aspose.words.internal.zzZQF.zzY(zzWSM, 4, "doubleAccounting");
        com.aspose.words.internal.zzZQF.zzY(zzWSM, 0, "none");
        com.aspose.words.internal.zzZQF.zzY(zzWSM, 1, "single");
        com.aspose.words.internal.zzZQF.zzY(zzWSM, 3, "singleAccounting");
        com.aspose.words.internal.zzZQF.zzY(zzWSL, 2, "center");
        com.aspose.words.internal.zzZQF.zzY(zzWSL, 3, "centerContinuous");
        com.aspose.words.internal.zzZQF.zzY(zzWSL, 6, "distributed");
        com.aspose.words.internal.zzZQF.zzY(zzWSL, 7, "fill");
        com.aspose.words.internal.zzZQF.zzY(zzWSL, 0, "general");
        com.aspose.words.internal.zzZQF.zzY(zzWSL, 5, "justify");
        com.aspose.words.internal.zzZQF.zzY(zzWSL, 1, "left");
        com.aspose.words.internal.zzZQF.zzY(zzWSL, 4, "right");
        com.aspose.words.internal.zzZQF.zzY(zzWSK, 0, "bottom");
        com.aspose.words.internal.zzZQF.zzY(zzWSK, 1, "center");
        com.aspose.words.internal.zzZQF.zzY(zzWSK, 4, "distributed");
        com.aspose.words.internal.zzZQF.zzY(zzWSK, 3, "justify");
        com.aspose.words.internal.zzZQF.zzY(zzWSK, 2, "top");
        com.aspose.words.internal.zzZQF.zzY(zzWSJ, 4, "dashDot");
        com.aspose.words.internal.zzZQF.zzY(zzWSJ, 7, "dashDotDot");
        com.aspose.words.internal.zzZQF.zzY(zzWSJ, 9, "dashed");
        com.aspose.words.internal.zzZQF.zzY(zzWSJ, 11, "dotted");
        com.aspose.words.internal.zzZQF.zzY(zzWSJ, 12, "double");
        com.aspose.words.internal.zzZQF.zzY(zzWSJ, 13, "hair");
        com.aspose.words.internal.zzZQF.zzY(zzWSJ, 2, "medium");
        com.aspose.words.internal.zzZQF.zzY(zzWSJ, 5, "mediumDashDot");
        com.aspose.words.internal.zzZQF.zzY(zzWSJ, 8, "mediumDashDotDot");
        com.aspose.words.internal.zzZQF.zzY(zzWSJ, 10, "mediumDashed");
        com.aspose.words.internal.zzZQF.zzY(zzWSJ, 0, "none");
        com.aspose.words.internal.zzZQF.zzY(zzWSJ, 6, "slantDashDot");
        com.aspose.words.internal.zzZQF.zzY(zzWSJ, 3, "thick");
        com.aspose.words.internal.zzZQF.zzY(zzWSJ, 1, "thin");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 0, "none");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 1, "solid");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 2, "mediumGray");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 3, "darkGray");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 4, "lightGray");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 5, "darkHorizontal");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 6, "darkVertical");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 7, "darkDown");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 8, "darkUp");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 9, "darkGrid");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 10, "darkTrellis");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 11, "lightHorizontal");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 12, "lightVertical");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 13, "lightDown");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 14, "lightUp");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 15, "lightGrid");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 16, "lightTrellis");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 17, "gray125");
        com.aspose.words.internal.zzZQF.zzY(zzWSI, 18, "gray0625");
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "8.5x11", 1);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "8.5x14", 5);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "5.5x8.5", 6);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "7.25x10.5", 7);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "8.5x13", 14);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "10x14", 16);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "11x17", 17);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "3.875x8.875", 19);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "4.125x9.5", 20);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "4.5x10.375", 21);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "4.75x11", 22);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "5x11.5", 23);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "17x22", 24);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "22x34", 25);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "34x44", 26);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "3.875x7.5", 37);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "3.625x6.5", 38);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "8.5x12", 40);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "9x11", 44);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "10x11", 45);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "9.275x12", 50);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "9.275x15", 51);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "11.69x18", 52);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "8.275x11", 54);
        com.aspose.words.internal.zzZQF.zzY(zzWSH, "8.5x12.69", 59);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "297x420", 8);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "210x297", 9);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "148x210", 11);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "257x364", 12);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "182x257", 13);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "215x275", 15);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "110x220", 27);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "162x229", 28);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "324x458", 29);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "229x324", 30);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "114x162", 31);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "114x229", 32);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "110x230", 36);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "250x353", 42);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "220x220", 47);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "236x322", 53);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "227x356", 57);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "305x487", 58);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "210x330", 60);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "322x445", 63);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "174x235", 64);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "201x276", 65);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "420x594", 66);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "105x148", 70);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "148x200", 82);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "128x182", 88);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "146x215", 93);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "97x151", 94);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "102x165", 96);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "102x176", 97);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "125x176", 98);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "110x208", 99);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "120x230", 101);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "160x230", 102);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "120x309", 103);
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "176x250", Integer.valueOf(StyleIdentifier.COLORFUL_LIST_ACCENT_6));
        com.aspose.words.internal.zzZQF.zzY(zzWSG, "216x340", Integer.valueOf(StyleIdentifier.PLAIN_TABLE_5));
    }

    public static int zza(double d, double d2) {
        String str = com.aspose.words.internal.zzZKN.format("{0}x{1}", com.aspose.words.internal.zzJB.zzZZ(d / 72.0d), com.aspose.words.internal.zzJB.zzZZ(d2 / 72.0d));
        RefInt refInt = new RefInt(0);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(zzWSH, str, refInt);
        int i = refInt.get();
        if (zZzZ) {
            return i;
        }
        String str2 = com.aspose.words.internal.zzZKN.format("{0}x{1}", com.aspose.words.internal.zzJB.zzZZ(com.aspose.words.internal.zzAN.zzZG(d / 2.834645669291339d)), com.aspose.words.internal.zzJB.zzZZ(com.aspose.words.internal.zzAN.zzZG(d2 / 2.834645669291339d)));
        refInt.set(i);
        boolean zZzZ2 = com.aspose.words.internal.zzZQF.zzZ(zzWSG, str2, refInt);
        int i2 = refInt.get();
        if (zZzZ2) {
            return i2;
        }
        return 0;
    }

    public static String zzhl(int i) {
        String str = zzWSI.get(Integer.valueOf(i));
        return str != null ? str : "none";
    }

    public static String zzhm(int i) {
        String str = zzWSJ.get(Integer.valueOf(i));
        return str != null ? str : "none";
    }

    public static String zzhn(int i) {
        String str = zzWSK.get(Integer.valueOf(i));
        return str != null ? str : "general";
    }

    public static String zzho(int i) {
        String str = zzWSL.get(Integer.valueOf(i));
        return str != null ? str : "general";
    }

    public static String zzhp(int i) {
        String str = zzWSM.get(Integer.valueOf(i));
        return str != null ? str : "none";
    }
}
