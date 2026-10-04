package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2V implements zzYV8 {
    private byte[] zzWkv;
    private boolean zzWkw;
    private int[][] zzWkx = null;
    private int zzWky;
    private static final zzYS8 zzWkE = new zzYS7(new byte[16]);
    private static final byte[] zzWkD = {99, 124, 119, 123, -14, 107, 111, -59, PatternStyle.Wave, 1, 103, PatternStyle.Sphere, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, PatternStyle.DiagonalCross, 63, -9, -52, PatternStyle.DownwardDiagonal, -91, -27, -15, 113, -40, PatternStyle.Horizontal, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, UnsignedBytes.MAX_POWER_OF_TWO, -30, -21, 39, -78, 117, 9, -125, PatternStyle.Weave, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, PatternStyle.Shingle, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, PatternStyle.Cross, -123, 69, -7, 2, Ascii.DEL, 80, 60, -97, -88, 81, -93, SignedBytes.MAX_POWER_OF_TWO, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, PatternStyle.Plaid, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, PatternStyle.Vertical, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, PatternStyle.Divot, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, PatternStyle.UpwardDiagonal, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, PatternStyle.DottedGrid, 15, -80, 84, -69, 22};
    private static final byte[] zzWkC = {82, 9, 106, -43, PatternStyle.Wave, PatternStyle.DiagonalCross, -91, 56, -65, SignedBytes.MAX_POWER_OF_TWO, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, PatternStyle.Shingle, -1, -121, PatternStyle.DownwardDiagonal, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, PatternStyle.Vertical, -90, -62, 35, 61, -18, 76, -107, 11, 66, -6, -61, 78, 8, PatternStyle.Divot, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, PatternStyle.Weave, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, PatternStyle.UpwardDiagonal, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, PatternStyle.Cross, -120, 7, -57, PatternStyle.Horizontal, -79, 18, 16, 89, 39, UnsignedBytes.MAX_POWER_OF_TWO, -20, 95, 96, 81, Ascii.DEL, -87, 25, -75, 74, 13, PatternStyle.DottedGrid, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, PatternStyle.Plaid, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, PatternStyle.Sphere, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] zzWkB = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, 179, 125, 250, 239, 197, 145};
    private static final int[] zzWkA = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};
    private static final int[] zzWkz = {1353184337, 1399144830, -1012656358, -1772214470, -882136261, -247096033, -1420232020, -1828461749, 1442459680, -160598355, -1854485368, 625738485, -52959921, -674551099, -2143013594, -1885117771, 1230680542, 1729870373, -1743852987, -507445667, 41234371, 317738113, -1550367091, -956705941, -413167869, -1784901099, -344298049, -631680363, 763608788, -752782248, 694804553, 1154009486, 1787413109, 2021232372, 1799248025, -579749593, -1236278850, 397248752, 1722556617, -1271214467, 407560035, -2110711067, 1613975959, 1165972322, -529046351, -2068943941, 480281086, -1809118983, 1483229296, 436028815, -2022908268, -1208452270, 601060267, -503166094, 1468997603, 715871590, 120122290, 63092015, -1703164538, -1526188077, -226023376, -1297760477, -1167457534, 1552029421, 723308426, -1833666137, -252573709, -1578997426, -839591323, -708967162, 526529745, -1963022652, -1655493068, -1604979806, 853641733, 1978398372, 971801355, -1427152832, 111112542, 1360031421, -108388034, 1023860118, -1375387939, 1186850381, -1249028975, 90031217, 1876166148, -15380384, 620468249, -1746289194, -868007799, 2006899047, -1119688528, -2004121337, 945494503, -605108103, 1191869601, -384875908, -920746760, 0, -2088337399, 1223502642, -1401941730, 1316117100, -67170563, 1446544655, 517320253, 658058550, 1691946762, 564550760, -783000677, 976107044, -1318647284, 266819475, -761860428, -1634624741, 1338359936, -1574904735, 1766553434, 370807324, 179999714, -450191168, 1138762300, 488053522, 185403662, -1379431438, -1180125651, -928440812, -2061897385, 1275557295, -1143105042, -44007517, -1624899081, -1124765092, -985962940, 880737115, 1982415755, -590994485, 1761406390, 1676797112, -891538985, 277177154, 1076008723, 538035844, 2099530373, -130171950, 288553390, 1839278535, 1261411869, -214912292, -330136051, -790380169, 1813426987, -1715900247, -95906799, 577038663, -997393240, 440397984, -668172970, -275762398, -951170681, -1043253031, -22885748, 906744984, -813566554, 685669029, 646887386, -1530942145, -459458004, 227702864, -1681105046, 1648787028, -1038905866, -390539120, 1593260334, -173030526, -1098883681, 2090061929, -1456614033, -1290656305, 999926984, -1484974064, 1852021992, 2075868123, 158869197, -199730834, 28809964, -1466282109, 1701746150, 2129067946, 147831841, -420997649, -644094022, -835293366, -737566742, -696471511, -1347247055, 824393514, 815048134, -1067015627, 935087732, -1496677636, -1328508704, 366520115, 1251476721, -136647615, 240176511, 804688151, -1915335306, 1303441219, 1414376140, -553347356, -474623586, 461924940, -1205916479, 2136040774, 82468509, 1563790337, 1937016826, 776014843, 1511876531, 1389550482, 861278441, 323475053, -1939744870, 2047648055, -1911228327, -1992551445, -299390514, 902390199, -303751967, 1018251130, 1507840668, 1064563285, 2043548696, -1086863501, -355600557, 1537932639, 342834655, -2032450440, -2114736182, 1053059257, 741614648, 1598071746, 1925389590, 203809468, -1958134744, 1100287487, 1895934009, -558691320, -1662733096, -1866377628, 1636092795, 1890988757, 1952214088, 1113045200};

    private static int zzUK(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    private int[][] zzX(byte[] bArr, boolean z) {
        int i;
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i2 = length >>> 2;
        this.zzWky = i2 + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i2 + 7, 4);
        if (i2 == 4) {
            i = 1;
            int iZzZL = zzYGN.zzZL(bArr, 0);
            iArr[0][0] = iZzZL;
            int iZzZL2 = zzYGN.zzZL(bArr, 4);
            iArr[0][1] = iZzZL2;
            int iZzZL3 = zzYGN.zzZL(bArr, 8);
            iArr[0][2] = iZzZL3;
            int iZzZL4 = zzYGN.zzZL(bArr, 12);
            iArr[0][3] = iZzZL4;
            for (int i3 = 1; i3 <= 10; i3++) {
                iZzZL ^= zzfS(zzUK(iZzZL4, 8)) ^ zzWkB[i3 - 1];
                int[] iArr2 = iArr[i3];
                iArr2[0] = iZzZL;
                iZzZL2 ^= iZzZL;
                iArr2[1] = iZzZL2;
                iZzZL3 ^= iZzZL2;
                iArr2[2] = iZzZL3;
                iZzZL4 ^= iZzZL3;
                iArr2[3] = iZzZL4;
            }
        } else if (i2 == 6) {
            i = 1;
            int iZzZL5 = zzYGN.zzZL(bArr, 0);
            iArr[0][0] = iZzZL5;
            int iZzZL6 = zzYGN.zzZL(bArr, 4);
            iArr[0][1] = iZzZL6;
            int iZzZL7 = zzYGN.zzZL(bArr, 8);
            iArr[0][2] = iZzZL7;
            int iZzZL8 = zzYGN.zzZL(bArr, 12);
            iArr[0][3] = iZzZL8;
            int iZzZL9 = zzYGN.zzZL(bArr, 16);
            iArr[1][0] = iZzZL9;
            int iZzZL10 = zzYGN.zzZL(bArr, 20);
            iArr[1][1] = iZzZL10;
            int iZzfS = iZzZL5 ^ (zzfS(zzUK(iZzZL10, 8)) ^ 1);
            int[] iArr3 = iArr[1];
            iArr3[2] = iZzfS;
            int i4 = iZzZL6 ^ iZzfS;
            iArr3[3] = i4;
            int i5 = iZzZL7 ^ i4;
            int[] iArr4 = iArr[2];
            iArr4[0] = i5;
            int i6 = iZzZL8 ^ i5;
            iArr4[1] = i6;
            int i7 = iZzZL9 ^ i6;
            iArr4[2] = i7;
            int i8 = iZzZL10 ^ i7;
            iArr4[3] = i8;
            int i9 = 2;
            for (int i10 = 3; i10 < 12; i10 += 3) {
                int iZzfS2 = iZzfS ^ (zzfS(zzUK(i8, 8)) ^ i9);
                int[] iArr5 = iArr[i10];
                iArr5[0] = iZzfS2;
                int i11 = i4 ^ iZzfS2;
                iArr5[1] = i11;
                int i12 = i5 ^ i11;
                iArr5[2] = i12;
                int i13 = i6 ^ i12;
                iArr5[3] = i13;
                int i14 = i7 ^ i13;
                int i15 = i10 + 1;
                int[] iArr6 = iArr[i15];
                iArr6[0] = i14;
                int i16 = i8 ^ i14;
                iArr6[1] = i16;
                int iZzfS3 = zzfS(zzUK(i16, 8)) ^ (i9 << 1);
                i9 <<= 2;
                iZzfS = iZzfS2 ^ iZzfS3;
                int[] iArr7 = iArr[i15];
                iArr7[2] = iZzfS;
                i4 = i11 ^ iZzfS;
                iArr7[3] = i4;
                i5 = i12 ^ i4;
                int[] iArr8 = iArr[i10 + 2];
                iArr8[0] = i5;
                i6 = i13 ^ i5;
                iArr8[1] = i6;
                i7 = i14 ^ i6;
                iArr8[2] = i7;
                i8 = i16 ^ i7;
                iArr8[3] = i8;
            }
            int iZzfS4 = (zzfS(zzUK(i8, 8)) ^ 128) ^ iZzfS;
            int[] iArr9 = iArr[12];
            iArr9[0] = iZzfS4;
            int i17 = iZzfS4 ^ i4;
            iArr9[1] = i17;
            int i18 = i17 ^ i5;
            iArr9[2] = i18;
            iArr9[3] = i18 ^ i6;
        } else {
            if (i2 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int iZzZL11 = zzYGN.zzZL(bArr, 0);
            iArr[0][0] = iZzZL11;
            int iZzZL12 = zzYGN.zzZL(bArr, 4);
            iArr[0][1] = iZzZL12;
            int iZzZL13 = zzYGN.zzZL(bArr, 8);
            iArr[0][2] = iZzZL13;
            int iZzZL14 = zzYGN.zzZL(bArr, 12);
            iArr[0][3] = iZzZL14;
            int iZzZL15 = zzYGN.zzZL(bArr, 16);
            iArr[1][0] = iZzZL15;
            int iZzZL16 = zzYGN.zzZL(bArr, 20);
            iArr[1][1] = iZzZL16;
            int iZzZL17 = zzYGN.zzZL(bArr, 24);
            iArr[1][2] = iZzZL17;
            int iZzZL18 = zzYGN.zzZL(bArr, 28);
            iArr[1][3] = iZzZL18;
            int i19 = 1;
            i = 1;
            for (int i20 = 2; i20 < 14; i20 += 2) {
                int iZzfS5 = zzfS(zzUK(iZzZL18, 8)) ^ i19;
                i19 <<= 1;
                iZzZL11 ^= iZzfS5;
                int[] iArr10 = iArr[i20];
                iArr10[0] = iZzZL11;
                iZzZL12 ^= iZzZL11;
                iArr10[1] = iZzZL12;
                iZzZL13 ^= iZzZL12;
                iArr10[2] = iZzZL13;
                iZzZL14 ^= iZzZL13;
                iArr10[3] = iZzZL14;
                iZzZL15 ^= zzfS(iZzZL14);
                int[] iArr11 = iArr[i20 + 1];
                iArr11[0] = iZzZL15;
                iZzZL16 ^= iZzZL15;
                iArr11[1] = iZzZL16;
                iZzZL17 ^= iZzZL16;
                iArr11[2] = iZzZL17;
                iZzZL18 ^= iZzZL17;
                iArr11[3] = iZzZL18;
            }
            int iZzfS6 = (zzfS(zzUK(iZzZL18, 8)) ^ i19) ^ iZzZL11;
            int[] iArr12 = iArr[14];
            iArr12[0] = iZzfS6;
            int i21 = iZzfS6 ^ iZzZL12;
            iArr12[1] = i21;
            int i22 = i21 ^ iZzZL13;
            iArr12[2] = i22;
            iArr12[3] = i22 ^ iZzZL14;
        }
        if (!z) {
            for (int i23 = i; i23 < this.zzWky; i23++) {
                for (int i24 = 0; i24 < 4; i24++) {
                    int[] iArr13 = iArr[i23];
                    iArr13[i24] = zzfT(iArr13[i24]);
                }
            }
        }
        return iArr;
    }

    private static int zzfS(int i) {
        byte[] bArr = zzWkD;
        return (bArr[(i >> 24) & 255] << 24) | (bArr[i & 255] & 255) | ((bArr[(i >> 8) & 255] & 255) << 8) | ((bArr[(i >> 16) & 255] & 255) << 16);
    }

    private static int zzfT(int i) {
        int iZzUK = zzUK(i, 8) ^ i;
        int iZzfV = i ^ zzfV(iZzUK);
        int iZzfU = iZzUK ^ zzfU(iZzfV);
        return iZzfV ^ (iZzfU ^ zzUK(iZzfU, 16));
    }

    private static int zzfU(int i) {
        int i2 = (1061109567 & i) << 2;
        int i3 = i & (-1061109568);
        int i4 = i3 ^ (i3 >>> 1);
        return (i4 >>> 5) ^ (i2 ^ (i4 >>> 2));
    }

    private static int zzfV(int i) {
        return (((i & (-2139062144)) >>> 7) * 27) ^ ((2139062143 & i) << 1);
    }

    public final void finalize() throws Throwable {
        zzZ(true, zzWkE);
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int getBlockSize() {
        return 16;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void reset() {
    }

    @Override // com.aspose.words.internal.zzYV8
    public final String zzXGi() {
        return AES256KeyLoader.AES_ALGORITHM;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int zzY(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[][] iArr = this.zzWkx;
        if (iArr == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new zzYV0("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new zzYUO("output buffer too short");
        }
        if (this.zzWkw) {
            zzZ(bArr, i, iArr, bArr2, i2);
            return 16;
        }
        zzY(bArr, i, iArr, bArr2, i2);
        return 16;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        if (!(zzyv3 instanceof zzYS8)) {
            throw new IllegalArgumentException("invalid parameter passed to AES init - ".concat(zzyv3.getClass().getName()));
        }
        this.zzWkx = zzX(((zzYS8) zzyv3).getKey(), z);
        this.zzWkw = z;
        if (z) {
            this.zzWkv = zzYGU.zzVI(zzWkD);
        } else {
            this.zzWkv = zzYGU.zzVI(zzWkC);
        }
    }

    private static void zzZ(int i, int i2, int i3, int i4, byte[] bArr, int i5) {
        bArr[i5] = (byte) i;
        bArr[i5 + 1] = (byte) (i >> 8);
        bArr[i5 + 2] = (byte) (i >> 16);
        bArr[i5 + 3] = (byte) (i >> 24);
        bArr[i5 + 4] = (byte) i2;
        bArr[i5 + 5] = (byte) (i2 >> 8);
        bArr[i5 + 6] = (byte) (i2 >> 16);
        bArr[i5 + 7] = (byte) (i2 >> 24);
        bArr[i5 + 8] = (byte) i3;
        bArr[i5 + 9] = (byte) (i3 >> 8);
        bArr[i5 + 10] = (byte) (i3 >> 16);
        bArr[i5 + 11] = (byte) (i3 >> 24);
        bArr[i5 + 12] = (byte) i4;
        bArr[i5 + 13] = (byte) (i4 >> 8);
        bArr[i5 + 14] = (byte) (i4 >> 16);
        bArr[i5 + 15] = (byte) (i4 >> 24);
    }

    private void zzY(byte[] bArr, int i, int[][] iArr, byte[] bArr2, int i2) {
        int i3 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << 24);
        int i4 = this.zzWky;
        int[] iArr2 = iArr[i4];
        char c = 0;
        int i5 = i3 ^ iArr2[0];
        int i6 = 1;
        int i7 = ((((bArr[i + 4] & 255) | ((bArr[i + 5] & 255) << 8)) | ((bArr[i + 6] & 255) << 16)) | (bArr[i + 7] << 24)) ^ iArr2[1];
        char c2 = 2;
        int i8 = ((((bArr[i + 8] & 255) | ((bArr[i + 9] & 255) << 8)) | ((bArr[i + 10] & 255) << 16)) | (bArr[i + 11] << 24)) ^ iArr2[2];
        int i9 = i4 - 1;
        int iZzUK = iArr2[3] ^ ((((bArr[i + 12] & 255) | ((bArr[i + 13] & 255) << 8)) | ((bArr[i + 14] & 255) << 16)) | (bArr[i + 15] << 24));
        while (i9 > i6) {
            int[] iArr3 = zzWkz;
            int iZzUK2 = (((iArr3[i5 & 255] ^ zzUK(iArr3[(iZzUK >> 8) & 255], 24)) ^ zzUK(iArr3[(i8 >> 16) & 255], 16)) ^ zzUK(iArr3[(i7 >> 24) & 255], 8)) ^ iArr[i9][c];
            char c3 = c;
            int iZzUK3 = (((zzUK(iArr3[(i5 >> 8) & 255], 24) ^ iArr3[i7 & 255]) ^ zzUK(iArr3[(iZzUK >> 16) & 255], 16)) ^ zzUK(iArr3[(i8 >> 24) & 255], 8)) ^ iArr[i9][i6];
            int i10 = i6;
            int iZzUK4 = (((zzUK(iArr3[(i7 >> 8) & 255], 24) ^ iArr3[i8 & 255]) ^ zzUK(iArr3[(i5 >> 16) & 255], 16)) ^ zzUK(iArr3[(iZzUK >> 24) & 255], 8)) ^ iArr[i9][c2];
            int iZzUK5 = zzUK(iArr3[(i5 >> 24) & 255], 8) ^ (zzUK(iArr3[(i7 >> 16) & 255], 16) ^ (iArr3[iZzUK & 255] ^ zzUK(iArr3[(i8 >> 8) & 255], 24)));
            int i11 = i9 - 1;
            int i12 = iZzUK5 ^ iArr[i9][3];
            int iZzUK6 = (((iArr3[iZzUK2 & 255] ^ zzUK(iArr3[(i12 >> 8) & 255], 24)) ^ zzUK(iArr3[(iZzUK4 >> 16) & 255], 16)) ^ zzUK(iArr3[(iZzUK3 >> 24) & 255], 8)) ^ iArr[i11][c3];
            int iZzUK7 = (((iArr3[iZzUK3 & 255] ^ zzUK(iArr3[(iZzUK2 >> 8) & 255], 24)) ^ zzUK(iArr3[(i12 >> 16) & 255], 16)) ^ zzUK(iArr3[(iZzUK4 >> 24) & 255], 8)) ^ iArr[i11][i10];
            char c4 = c2;
            int iZzUK8 = (((zzUK(iArr3[(iZzUK3 >> 8) & 255], 24) ^ iArr3[iZzUK4 & 255]) ^ zzUK(iArr3[(iZzUK2 >> 16) & 255], 16)) ^ zzUK(iArr3[(i12 >> 24) & 255], 8)) ^ iArr[i11][c4];
            i9 -= 2;
            iZzUK = (((iArr3[i12 & 255] ^ zzUK(iArr3[(iZzUK4 >> 8) & 255], 24)) ^ zzUK(iArr3[(iZzUK3 >> 16) & 255], 16)) ^ zzUK(iArr3[(iZzUK2 >> 24) & 255], 8)) ^ iArr[i11][3];
            i5 = iZzUK6;
            i7 = iZzUK7;
            i8 = iZzUK8;
            c = c3;
            i6 = i10;
            c2 = c4;
        }
        char c5 = c;
        int i13 = i6;
        char c6 = c2;
        int[] iArr4 = zzWkz;
        int iZzUK9 = (((iArr4[i5 & 255] ^ zzUK(iArr4[(iZzUK >> 8) & 255], 24)) ^ zzUK(iArr4[(i8 >> 16) & 255], 16)) ^ zzUK(iArr4[(i7 >> 24) & 255], 8)) ^ iArr[i9][c5];
        int iZzUK10 = (((iArr4[i7 & 255] ^ zzUK(iArr4[(i5 >> 8) & 255], 24)) ^ zzUK(iArr4[(iZzUK >> 16) & 255], 16)) ^ zzUK(iArr4[(i8 >> 24) & 255], 8)) ^ iArr[i9][i13];
        int iZzUK11 = (((iArr4[i8 & 255] ^ zzUK(iArr4[(i7 >> 8) & 255], 24)) ^ zzUK(iArr4[(i5 >> 16) & 255], 16)) ^ zzUK(iArr4[(iZzUK >> 24) & 255], 8)) ^ iArr[i9][c6];
        int iZzUK12 = (zzUK(iArr4[(i5 >> 24) & 255], 8) ^ (zzUK(iArr4[(i7 >> 16) & 255], 16) ^ (iArr4[iZzUK & 255] ^ zzUK(iArr4[(i8 >> 8) & 255], 24)))) ^ iArr[i9][3];
        byte[] bArr3 = zzWkC;
        int i14 = bArr3[iZzUK9 & 255] & 255;
        byte[] bArr4 = this.zzWkv;
        int i15 = ((i14 ^ ((bArr4[(iZzUK12 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iZzUK11 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iZzUK10 >> 24) & 255] << 24);
        int[] iArr5 = iArr[c5];
        zzZ(i15 ^ iArr5[c5], ((((bArr4[iZzUK10 & 255] & 255) ^ ((bArr4[(iZzUK9 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iZzUK12 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iZzUK11 >> 24) & 255] << 24)) ^ iArr5[i13], ((((bArr4[iZzUK11 & 255] & 255) ^ ((bArr3[(iZzUK10 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iZzUK9 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iZzUK12 >> 24) & 255] << 24)) ^ iArr5[c6], ((((bArr3[iZzUK12 & 255] & 255) ^ ((bArr4[(iZzUK11 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iZzUK10 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iZzUK9 >> 24) & 255] << 24)) ^ iArr5[3], bArr2, i2);
    }

    private void zzZ(byte[] bArr, int i, int[][] iArr, byte[] bArr2, int i2) {
        int i3 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << 24);
        char c = 0;
        int[] iArr2 = iArr[0];
        int i4 = i3 ^ iArr2[0];
        int i5 = 1;
        int i6 = ((((bArr[i + 4] & 255) | ((bArr[i + 5] & 255) << 8)) | ((bArr[i + 6] & 255) << 16)) | (bArr[i + 7] << 24)) ^ iArr2[1];
        char c2 = 2;
        int i7 = ((((bArr[i + 8] & 255) | ((bArr[i + 9] & 255) << 8)) | ((bArr[i + 10] & 255) << 16)) | (bArr[i + 11] << 24)) ^ iArr2[2];
        int iZzUK = iArr2[3] ^ ((((bArr[i + 12] & 255) | ((bArr[i + 13] & 255) << 8)) | ((bArr[i + 14] & 255) << 16)) | (bArr[i + 15] << 24));
        int i8 = 1;
        while (i8 < this.zzWky - i5) {
            int[] iArr3 = zzWkA;
            int iZzUK2 = (((iArr3[i4 & 255] ^ zzUK(iArr3[(i6 >> 8) & 255], 24)) ^ zzUK(iArr3[(i7 >> 16) & 255], 16)) ^ zzUK(iArr3[(iZzUK >> 24) & 255], 8)) ^ iArr[i8][c];
            char c3 = c;
            int iZzUK3 = (((zzUK(iArr3[(i7 >> 8) & 255], 24) ^ iArr3[i6 & 255]) ^ zzUK(iArr3[(iZzUK >> 16) & 255], 16)) ^ zzUK(iArr3[(i4 >> 24) & 255], 8)) ^ iArr[i8][i5];
            int i9 = i5;
            int iZzUK4 = (((zzUK(iArr3[(iZzUK >> 8) & 255], 24) ^ iArr3[i7 & 255]) ^ zzUK(iArr3[(i4 >> 16) & 255], 16)) ^ zzUK(iArr3[(i6 >> 24) & 255], 8)) ^ iArr[i8][c2];
            int iZzUK5 = ((zzUK(iArr3[(i4 >> 8) & 255], 24) ^ iArr3[iZzUK & 255]) ^ zzUK(iArr3[(i6 >> 16) & 255], 16)) ^ zzUK(iArr3[(i7 >> 24) & 255], 8);
            int i10 = i8 + 1;
            int i11 = iZzUK5 ^ iArr[i8][3];
            int iZzUK6 = (((iArr3[iZzUK2 & 255] ^ zzUK(iArr3[(iZzUK3 >> 8) & 255], 24)) ^ zzUK(iArr3[(iZzUK4 >> 16) & 255], 16)) ^ zzUK(iArr3[(i11 >> 24) & 255], 8)) ^ iArr[i10][c3];
            int iZzUK7 = (((iArr3[iZzUK3 & 255] ^ zzUK(iArr3[(iZzUK4 >> 8) & 255], 24)) ^ zzUK(iArr3[(i11 >> 16) & 255], 16)) ^ zzUK(iArr3[(iZzUK2 >> 24) & 255], 8)) ^ iArr[i10][i9];
            char c4 = c2;
            int iZzUK8 = (((zzUK(iArr3[(i11 >> 8) & 255], 24) ^ iArr3[iZzUK4 & 255]) ^ zzUK(iArr3[(iZzUK2 >> 16) & 255], 16)) ^ zzUK(iArr3[(iZzUK3 >> 24) & 255], 8)) ^ iArr[i10][c4];
            i8 += 2;
            iZzUK = (((iArr3[i11 & 255] ^ zzUK(iArr3[(iZzUK2 >> 8) & 255], 24)) ^ zzUK(iArr3[(iZzUK3 >> 16) & 255], 16)) ^ zzUK(iArr3[(iZzUK4 >> 24) & 255], 8)) ^ iArr[i10][3];
            i4 = iZzUK6;
            i6 = iZzUK7;
            i7 = iZzUK8;
            c = c3;
            i5 = i9;
            c2 = c4;
        }
        char c5 = c;
        int i12 = i5;
        char c6 = c2;
        int[] iArr4 = zzWkA;
        int iZzUK9 = (((iArr4[i4 & 255] ^ zzUK(iArr4[(i6 >> 8) & 255], 24)) ^ zzUK(iArr4[(i7 >> 16) & 255], 16)) ^ zzUK(iArr4[(iZzUK >> 24) & 255], 8)) ^ iArr[i8][c5];
        int iZzUK10 = (((iArr4[i6 & 255] ^ zzUK(iArr4[(i7 >> 8) & 255], 24)) ^ zzUK(iArr4[(iZzUK >> 16) & 255], 16)) ^ zzUK(iArr4[(i4 >> 24) & 255], 8)) ^ iArr[i8][i12];
        int iZzUK11 = (((iArr4[i7 & 255] ^ zzUK(iArr4[(iZzUK >> 8) & 255], 24)) ^ zzUK(iArr4[(i4 >> 16) & 255], 16)) ^ zzUK(iArr4[(i6 >> 24) & 255], 8)) ^ iArr[i8][c6];
        int iZzUK12 = (((zzUK(iArr4[(i4 >> 8) & 255], 24) ^ iArr4[iZzUK & 255]) ^ zzUK(iArr4[(i6 >> 16) & 255], 16)) ^ zzUK(iArr4[(i7 >> 24) & 255], 8)) ^ iArr[i8][3];
        byte[] bArr3 = zzWkD;
        int i13 = (bArr3[iZzUK9 & 255] & 255) ^ ((bArr3[(iZzUK10 >> 8) & 255] & 255) << 8);
        byte[] bArr4 = this.zzWkv;
        int i14 = (i13 ^ ((bArr4[(iZzUK11 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iZzUK12 >> 24) & 255] << 24);
        int[] iArr5 = iArr[i8 + 1];
        zzZ(i14 ^ iArr5[c5], ((((bArr4[iZzUK10 & 255] & 255) ^ ((bArr3[(iZzUK11 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iZzUK12 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iZzUK9 >> 24) & 255] << 24)) ^ iArr5[i12], ((((bArr4[iZzUK11 & 255] & 255) ^ ((bArr3[(iZzUK12 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iZzUK9 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iZzUK10 >> 24) & 255] << 24)) ^ iArr5[c6], ((((bArr4[iZzUK12 & 255] & 255) ^ ((bArr4[(iZzUK9 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iZzUK10 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iZzUK11 >> 24) & 255] << 24)) ^ iArr5[3], bArr2, i2);
    }
}
