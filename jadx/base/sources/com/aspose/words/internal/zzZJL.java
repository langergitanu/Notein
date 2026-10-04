package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;
import com.aspose.slides.AutoShapeImpBase;
import com.aspose.slides.PatternStyle;
import com.aspose.words.StyleIdentifier;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJL extends zzZJN {
    private byte[] buffer;
    private byte[] data;

    /* JADX INFO: renamed from: w */
    private int f51312w;
    private int zz4p;
    private int zzVz;
    private int[] zzZL5;
    private int[] zzZL6;
    private int zzZL8;
    private int zzZL9;
    private int zzZLa;
    private int zzZLb;
    private int zzZM6;
    private int zzZM7;
    private int zzZMa;
    static int[] zzZLk = {0, 1, 3, 7, 15, 31, 63, 127, 255};
    static int[] zzZLj = {0, 128, 192, 224, 240, StyleIdentifier.LIGHT_GRID_ACCENT_6, StyleIdentifier.MEDIUM_LIST_2_ACCENT_6, StyleIdentifier.MEDIUM_GRID_2_ACCENT_6, 255};
    public static final byte[] zzZLi = {0, UnsignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, -64, 32, -96, 96, -32, 16, -112, 80, -48, PatternStyle.Wave, -80, 112, -16, 8, -120, 72, -56, 40, -88, 104, -24, 24, -104, 88, -40, 56, -72, 120, -8, 4, -124, 68, -60, 36, -92, 100, -28, 20, -108, 84, -44, PatternStyle.DownwardDiagonal, -76, 116, -12, 12, -116, 76, -52, PatternStyle.Weave, -84, 108, -20, 28, -100, 92, -36, 60, -68, 124, -4, 2, -126, 66, -62, 34, -94, 98, -30, 18, -110, 82, -46, PatternStyle.Vertical, -78, 114, -14, 10, -118, 74, -54, PatternStyle.Plaid, -86, 106, -22, 26, -102, 90, -38, 58, -70, 122, -6, 6, -122, 70, -58, 38, -90, 102, -26, 22, -106, 86, -42, PatternStyle.DiagonalCross, -74, 118, -10, 14, -114, 78, -50, PatternStyle.Divot, -82, 110, -18, 30, -98, 94, -34, 62, -66, 126, -2, 1, -127, 65, -63, 33, -95, 97, -31, 17, -111, 81, -47, PatternStyle.Horizontal, -79, 113, -15, 9, -119, 73, -55, 41, -87, 105, -23, 25, -103, 89, -39, 57, -71, 121, -7, 5, -123, 69, -59, 37, -91, 101, -27, 21, -107, 85, -43, PatternStyle.UpwardDiagonal, -75, 117, -11, 13, -115, 77, -51, PatternStyle.DottedGrid, -83, 109, -19, 29, -99, 93, -35, 61, -67, 125, -3, 3, -125, 67, -61, 35, -93, 99, -29, 19, -109, 83, -45, PatternStyle.Cross, -77, 115, -13, 11, -117, 75, -53, PatternStyle.Sphere, -85, 107, -21, 27, -101, 91, -37, 59, -69, 123, -5, 7, -121, 71, -57, 39, -89, 103, -25, 23, -105, 87, -41, 55, -73, 119, -9, 15, -113, 79, -49, PatternStyle.Shingle, -81, 111, -17, 31, -97, 95, -33, 63, -65, Ascii.DEL, -1};
    static short[] zzZLh = {6430, 6400, 6400, 6400, 3225, 3225, 3225, 3225, 944, 944, 944, 944, 976, 976, 976, 976, 1456, 1456, 1456, 1456, 1488, 1488, 1488, 1488, 718, 718, 718, 718, 718, 718, 718, 718, 750, 750, 750, 750, 750, 750, 750, 750, 1520, 1520, 1520, 1520, 1552, 1552, 1552, 1552, 428, 428, 428, 428, 428, 428, 428, 428, 428, 428, 428, 428, 428, 428, 428, 428, 654, 654, 654, 654, 654, 654, 654, 654, 1072, 1072, 1072, 1072, 1104, 1104, 1104, 1104, 1136, 1136, 1136, 1136, 1168, 1168, 1168, 1168, 1200, 1200, 1200, 1200, 1232, 1232, 1232, 1232, 622, 622, 622, 622, 622, 622, 622, 622, 1008, 1008, 1008, 1008, 1040, 1040, 1040, 1040, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 396, 396, 396, 396, 396, 396, 396, 396, 396, 396, 396, 396, 396, 396, 396, 396, 1712, 1712, 1712, 1712, 1744, 1744, 1744, 1744, 846, 846, 846, 846, 846, 846, 846, 846, 1264, 1264, 1264, 1264, 1296, 1296, 1296, 1296, 1328, 1328, 1328, 1328, 1360, 1360, 1360, 1360, 1392, 1392, 1392, 1392, 1424, 1424, 1424, 1424, 686, 686, 686, 686, 686, 686, 686, 686, 910, 910, 910, 910, 910, 910, 910, 910, 1968, 1968, 1968, 1968, 2000, 2000, 2000, 2000, 2032, 2032, 2032, 2032, 16, 16, 16, 16, 10257, 10257, 10257, 10257, 12305, 12305, 12305, 12305, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, AutoShapeImpBase.CDSpecialValues.adjust4Value, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 362, 878, 878, 878, 878, 878, 878, 878, 878, 1904, 1904, 1904, 1904, 1936, 1936, 1936, 1936, -18413, -18413, -16365, -16365, -14317, -14317, -10221, -10221, 590, 590, 590, 590, 590, 590, 590, 590, 782, 782, 782, 782, 782, 782, 782, 782, 1584, 1584, 1584, 1584, 1616, 1616, 1616, 1616, 1648, 1648, 1648, 1648, 1680, 1680, 1680, 1680, 814, 814, 814, 814, 814, 814, 814, 814, 1776, 1776, 1776, 1776, 1808, 1808, 1808, 1808, 1840, 1840, 1840, 1840, 1872, 1872, 1872, 1872, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, 6157, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, -12275, 14353, 14353, 14353, 14353, 16401, 16401, 16401, 16401, 22547, 22547, 24595, 24595, 20497, 20497, 20497, 20497, 18449, 18449, 18449, 18449, 26643, 26643, 28691, 28691, 30739, 30739, -32749, -32749, -30701, -30701, -28653, -28653, -26605, -26605, -24557, -24557, -22509, -22509, -20461, -20461, 8207, 8207, 8207, 8207, 8207, 8207, 8207, 8207, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 72, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 104, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 4107, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 266, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 298, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 524, 556, 556, 556, 556, 556, 556, 556, 556, 556, 556, 556, 556, 556, 556, 556, 556, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 136, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 168, 460, 460, 460, 460, 460, 460, 460, 460, 460, 460, 460, 460, 460, 460, 460, 460, 492, 492, 492, 492, 492, 492, 492, 492, 492, 492, 492, 492, 492, 492, 492, 492, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 2059, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 200, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 
    232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232, 232};
    static short[] zzZLg = {28679, 28679, 31752, -32759, -31735, -30711, -29687, -28663, 29703, 29703, 30727, 30727, -27639, -26615, -25591, -24567};
    static short[] zzZLf = {3226, 6412, 200, 168, 38, 38, 134, 134, 100, 100, 100, 100, 68, 68, 68, 68};
    static short[] zzZLe = {292, 260, 226, 226};
    static short[] zzZLd = {62, 62, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 3225, 588, 588, 588, 588, 588, 588, 588, 588, 1680, 1680, 20499, 22547, 24595, 26643, 1776, 1776, 1808, 1808, -24557, -22509, -20461, -18413, 1904, 1904, 1936, 1936, -16365, -14317, 782, 782, 782, 782, 814, 814, 814, 814, -12269, -10221, 10257, 10257, 12305, 12305, 14353, 14353, 16403, 18451, 1712, 1712, 1744, 1744, 28691, 30739, -32749, -30701, -28653, -26605, 2061, 2061, 2061, 2061, 2061, 2061, 2061, 2061, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 424, 750, 750, 750, 750, 1616, 1616, 1648, 1648, 1424, 1424, 1456, 1456, 1488, 1488, 1520, 1520, 1840, 1840, 1872, 1872, 1968, 1968, 8209, 8209, 524, 524, 524, 524, 524, 524, 524, 524, 556, 556, 556, 556, 556, 556, 556, 556, 1552, 1552, 1584, 1584, 2000, 2000, 2032, 2032, 976, 976, 1008, 1008, 1040, 1040, 1072, 1072, 1296, 1296, 1328, 1328, 718, 718, 718, 718, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 456, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 326, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 358, 490, 490, 490, 490, 490, 490, 490, 490, 490, 490, 490, 490, 490, 490, 490, 490, 4113, 4113, 6161, 6161, 848, 848, 880, 880, 912, 912, 944, 944, 622, 622, 622, 622, 654, 654, 654, 654, 1104, 1104, 1136, 1136, 1168, 1168, 1200, 1200, 1232, 1232, 1264, 1264, 686, 686, 686, 686, 1360, 1360, 1392, 1392, 12, 12, 12, 12, 12, 12, 12, 12, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390, 390};
    static byte[] zzZLc = {80, 88, 23, 71, 30, 30, 62, 62, 4, 4, 4, 4, 4, 4, 4, 4, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, 35, PatternStyle.Cross, PatternStyle.Cross, PatternStyle.Cross, PatternStyle.Cross, PatternStyle.Cross, PatternStyle.Cross, PatternStyle.Cross, PatternStyle.Cross, PatternStyle.Cross, PatternStyle.Cross, PatternStyle.Cross, PatternStyle.Cross, PatternStyle.Cross, PatternStyle.Cross, PatternStyle.Cross, PatternStyle.Cross, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41};
    private int zzZL7 = 0;
    private int zzZL4 = 0;
    private int zzZL3 = -1;
    private int zzZL2 = -1;
    private int zzZL1 = -1;

    private static void warning(String str) {
        System.out.println("WARN: " + str);
    }

    private void zzPI(int i) {
        if (i > 8) {
            this.zzZLa -= i / 8;
            i %= 8;
        }
        int i2 = this.zzZLb - i;
        if (i2 >= 0) {
            this.zzZLb = i2;
        } else {
            this.zzZLa--;
            this.zzZLb = i2 + 8;
        }
    }

    private int zzPJ(int i) throws IOException {
        byte b;
        byte b2;
        byte[] bArr = this.data;
        int length = bArr.length - 1;
        int i2 = this.zzZLa;
        int i3 = this.zzZMa;
        if (i3 == 1) {
            b2 = bArr[i2];
            b = i2 == length ? (byte) 0 : bArr[i2 + 1];
        } else {
            if (i3 != 2) {
                throw new IOException("Invalid FillOrder");
            }
            byte[] bArr2 = zzZLi;
            byte b3 = bArr2[bArr[i2] & 255];
            b = i2 == length ? (byte) 0 : bArr2[bArr[i2 + 1] & 255];
            b2 = b3;
        }
        int i4 = this.zzZLb;
        int i5 = 8 - i4;
        int i6 = i - i5;
        int i7 = i5 - i;
        if (i7 < 0) {
            int i8 = ((zzZLk[i5] & b2) << (-i7)) | ((b & zzZLj[i6]) >>> (8 - i6));
            this.zzZLa = i2 + 1;
            this.zzZLb = i6;
            return i8;
        }
        int i9 = (zzZLk[i5] & b2) >>> i7;
        int i10 = i4 + i;
        this.zzZLb = i10;
        if (i10 == 8) {
            this.zzZLb = 0;
            this.zzZLa = i2 + 1;
        }
        return i9;
    }

    private int zzPK(int i) throws IOException {
        byte b;
        byte b2;
        byte b3;
        int i2;
        int i3;
        byte[] bArr = this.data;
        int length = bArr.length - 1;
        int i4 = this.zzZLa;
        int i5 = this.zzZMa;
        if (i5 == 1) {
            b3 = bArr[i4];
            if (i4 == length) {
                b2 = 0;
                b = 0;
            } else {
                int i6 = i4 + 1;
                if (i6 == length) {
                    b2 = bArr[i6];
                    b = 0;
                } else {
                    byte b4 = bArr[i6];
                    b = bArr[i4 + 2];
                    b2 = b4;
                }
            }
        } else {
            if (i5 != 2) {
                throw new IOException("Invalid FillOrder");
            }
            byte[] bArr2 = zzZLi;
            byte b5 = bArr2[bArr[i4] & 255];
            if (i4 == length) {
                b3 = b5;
                b2 = 0;
                b = 0;
            } else {
                int i7 = i4 + 1;
                if (i7 == length) {
                    b2 = bArr2[bArr[i7] & 255];
                    b3 = b5;
                    b = 0;
                } else {
                    byte b6 = bArr2[bArr[i7] & 255];
                    b = bArr2[bArr[i4 + 2] & 255];
                    b2 = b6;
                    b3 = b5;
                }
            }
        }
        int i8 = 8 - this.zzZLb;
        int i9 = i - i8;
        if (i9 > 8) {
            i3 = i9 - 8;
            i2 = 8;
        } else {
            i2 = i9;
            i3 = 0;
        }
        this.zzZLa = i4 + 1;
        int i10 = (b3 & zzZLk[i8]) << i9;
        int[] iArr = zzZLj;
        int i11 = (b2 & iArr[i2]) >>> (8 - i2);
        if (i3 != 0) {
            i11 = (i11 << i3) | ((b & iArr[i3]) >>> (8 - i3));
            this.zzZLa = i4 + 2;
            this.zzZLb = i3;
        } else if (i2 == 8) {
            this.zzZLb = 0;
            this.zzZLa = i4 + 2;
        } else {
            this.zzZLb = i2;
        }
        return i10 | i11;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [byte[], java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v8, types: [byte[], java.lang.StringBuilder] */
    private void zzPL(int i) throws IOException {
        this.zzZL7 = 0;
        int i2 = 0;
        boolean z = true;
        while (true) {
            if (i2 >= this.f51312w) {
                break;
            }
            int i3 = i2;
            while (z && i3 < this.f51312w) {
                int iZzPK = zzPK(10);
                short s = zzZLh[iZzPK];
                int i4 = s & 1;
                int i5 = (s >>> 1) & 15;
                if (i5 == 12) {
                    short s2 = zzZLg[zzPJ(2) | ((iZzPK << 2) & 12)];
                    i3 += (s2 >>> 4) & 4095;
                    zzPI(4 - ((s2 >>> 1) & 7));
                } else if (i5 == 0) {
                    warning("Error 0");
                } else {
                    if (i5 == 15) {
                        warning(C21023OooO0Oo.OooO0OO(" expected pixels.", this.f51312w, ByteArrayOutputStream.toByteArray()));
                        return;
                    }
                    i3 += (s >>> 5) & 2047;
                    zzPI(10 - i5);
                    if (i4 == 0) {
                        int[] iArr = this.zzZL5;
                        int i6 = this.zzZL7;
                        this.zzZL7 = i6 + 1;
                        iArr[i6] = i3;
                        z = false;
                    }
                }
            }
            if (i3 == this.f51312w) {
                int i7 = i3 - i2;
                if (z && i7 != 0 && i7 % 64 == 0 && zzPK(8) != 53) {
                    warning("Missing zero white run length terminating code!");
                    zzPI(8);
                }
                i2 = i3;
            } else {
                i2 = i3;
                while (!z && i2 < this.f51312w) {
                    short s3 = zzZLf[zzPJ(4)];
                    int i8 = (s3 >>> 1) & 15;
                    int i9 = (s3 >>> 5) & 2047;
                    if (i9 == 100) {
                        short s4 = zzZLd[zzPK(9)];
                        int i10 = s4 & 1;
                        int i11 = (s4 >>> 1) & 15;
                        int i12 = (s4 >>> 5) & 2047;
                        if (i11 == 12) {
                            zzPI(5);
                            short s5 = zzZLg[zzPJ(4)];
                            int i13 = (s5 >>> 1) & 7;
                            int i14 = (s5 >>> 4) & 4095;
                            zzYT(i2, i14);
                            i2 += i14;
                            zzPI(4 - i13);
                        } else {
                            if (i11 == 15) {
                                warning(C21023OooO0Oo.OooO0OO(" expected pixels.", this.f51312w, ByteArrayOutputStream.toByteArray()));
                                return;
                            }
                            zzYT(i2, i12);
                            i2 += i12;
                            zzPI(9 - i11);
                            if (i10 == 0) {
                                int[] iArr2 = this.zzZL5;
                                int i15 = this.zzZL7;
                                this.zzZL7 = i15 + 1;
                                iArr2[i15] = i2;
                            }
                        }
                    } else if (i9 == 200) {
                        short s6 = zzZLe[zzPJ(2)];
                        int i16 = (s6 >>> 5) & 2047;
                        zzYT(i2, i16);
                        i2 += i16;
                        zzPI(2 - ((s6 >>> 1) & 15));
                        int[] iArr3 = this.zzZL5;
                        int i17 = this.zzZL7;
                        this.zzZL7 = i17 + 1;
                        iArr3[i17] = i2;
                    } else {
                        zzYT(i2, i9);
                        i2 += i9;
                        zzPI(4 - i8);
                        int[] iArr4 = this.zzZL5;
                        int i18 = this.zzZL7;
                        this.zzZL7 = i18 + 1;
                        iArr4[i18] = i2;
                    }
                    z = true;
                }
                if (i2 == this.f51312w) {
                    int i19 = i2 - i3;
                    if (!z && i19 != 0 && i19 % 64 == 0 && zzPK(10) != 55) {
                        warning("Missing zero black run length terminating code!");
                        zzPI(10);
                    }
                }
            }
        }
        int[] iArr5 = this.zzZL5;
        int i20 = this.zzZL7;
        this.zzZL7 = i20 + 1;
        iArr5[i20] = i2;
    }

    private void zzYT(int i, int i2) {
        int i3 = i + this.zzZL8;
        int i4 = i2 + i3;
        int i5 = i3 >> 3;
        int i6 = i3 & 7;
        if (i6 > 0) {
            int i7 = 1 << (7 - i6);
            byte b = this.buffer[i5];
            while (i7 > 0 && i3 < i4) {
                b = (byte) (b | i7);
                i7 >>= 1;
                i3++;
            }
            this.buffer[i5] = b;
        }
        int i8 = i3 >> 3;
        while (i3 < i4 - 7) {
            this.buffer[i8] = -1;
            i3 += 8;
            i8++;
        }
        while (i3 < i4) {
            int i9 = i3 >> 3;
            byte[] bArr = this.buffer;
            bArr[i9] = (byte) (bArr[i9] | (1 << (7 - (i3 & 7))));
            i3++;
        }
    }

    private void zzZ(int i, boolean z, int[] iArr) throws IOException {
        int[] iArr2 = this.zzZL6;
        int i2 = this.zzZL7;
        int i3 = this.zzZL4;
        int i4 = i3 > 0 ? i3 - 1 : 0;
        int i5 = z ? i4 & (-2) : i4 | 1;
        while (true) {
            if (i5 >= i2) {
                break;
            }
            int i6 = iArr2[i5];
            if (i6 > i) {
                this.zzZL4 = i5;
                iArr[0] = i6;
                break;
            }
            i5 += 2;
        }
        int i7 = i5 + 1;
        if (i7 < i2) {
            iArr[1] = iArr2[i7];
        }
    }

    private int zzdl() throws IOException {
        int length = this.data.length * 8;
        int i = length - 1;
        int i2 = length - 13;
        int i3 = (this.zzZLa * 8) + this.zzZLb;
        while (i3 <= i2) {
            int iZzPK = zzPK(12);
            i3 += 12;
            while (iZzPK != 1 && i3 < i) {
                iZzPK = ((iZzPK & 2047) << 1) | (1 & zzPJ(1));
                i3++;
            }
            if (iZzPK == 1) {
                if (this.zzZL3 != 1) {
                    return 1;
                }
                if (i3 < i) {
                    return zzPJ(1);
                }
            }
        }
        throw new EOFException();
    }

    private int zzdm() throws IOException {
        boolean z = false;
        int i = 0;
        while (!z) {
            short s = zzZLf[zzPJ(4)];
            int i2 = (s >>> 1) & 15;
            int i3 = (s >>> 5) & 2047;
            if (i3 == 100) {
                short s2 = zzZLd[zzPK(9)];
                int i4 = s2 & 1;
                int i5 = (s2 >>> 1) & 15;
                int i6 = (s2 >>> 5) & 2047;
                if (i5 == 12) {
                    zzPI(5);
                    short s3 = zzZLg[zzPJ(4)];
                    i += (s3 >>> 4) & 4095;
                    zzPI(4 - ((s3 >>> 1) & 7));
                } else {
                    if (i5 == 15) {
                        throw new IOException("Error 2");
                    }
                    i += i6;
                    zzPI(9 - i5);
                    if (i4 == 0) {
                    }
                }
            } else if (i3 == 200) {
                short s4 = zzZLe[zzPJ(2)];
                i += (s4 >>> 5) & 2047;
                zzPI(2 - ((s4 >>> 1) & 15));
            } else {
                i += i3;
                zzPI(4 - i2);
            }
            z = true;
        }
        return i;
    }

    private int zzdn() throws IOException {
        boolean z = true;
        int i = 0;
        while (z) {
            int iZzPK = zzPK(10);
            short s = zzZLh[iZzPK];
            int i2 = s & 1;
            int i3 = (s >>> 1) & 15;
            if (i3 == 12) {
                short s2 = zzZLg[((iZzPK << 2) & 12) | zzPJ(2)];
                i += (s2 >>> 4) & 4095;
                zzPI(4 - ((s2 >>> 1) & 7));
            } else {
                if (i3 == 0) {
                    throw new IOException("Error 0");
                }
                if (i3 == 15) {
                    throw new IOException("Error 1");
                }
                i += (s >>> 5) & 2047;
                zzPI(10 - i3);
                if (i2 == 0) {
                    z = false;
                }
            }
        }
        return i;
    }

    private void zzdo() throws IOException {
        for (int i = 0; i < this.zz4p; i++) {
            zzPL(this.zzZLH + i);
            if (this.zzZLb != 0) {
                this.zzZLa++;
                this.zzZLb = 0;
            }
            this.zzZL8 += this.zzZL9;
        }
    }

    private synchronized void zzdp() throws IOException {
        int i;
        try {
            int i2 = this.zz4p;
            int[] iArr = new int[2];
            int[] iArr2 = this.zzZL5;
            this.zzZL7 = 1;
            int i3 = this.f51312w;
            int i4 = 0;
            iArr2[0] = i3;
            this.zzZL7 = 1 + 1;
            iArr2[1] = i3;
            int i5 = 0;
            while (i5 < i2) {
                int[] iArr3 = this.zzZL6;
                this.zzZL6 = this.zzZL5;
                this.zzZL5 = iArr3;
                this.zzZL4 = i4;
                int i6 = -1;
                boolean z = true;
                int iZzdn = i4;
                int i7 = iZzdn;
                while (true) {
                    i = this.f51312w;
                    if (iZzdn >= i) {
                        break;
                    }
                    zzZ(i6, z, iArr);
                    int i8 = iArr[i4];
                    int i9 = iArr[1];
                    byte b = zzZLc[zzPJ(7)];
                    int i10 = (b & 120) >>> 3;
                    int i11 = b & 7;
                    if (i10 == 0) {
                        if (!z) {
                            int i12 = this.f51312w;
                            if (i9 > i12) {
                                warning("Decoded row " + (this.zzZLH + i5) + " too long; ignoring extra samples.");
                                i9 = i12;
                            }
                            zzYT(iZzdn, i9 - iZzdn);
                        }
                        iZzdn = i9;
                        zzPI(7 - i11);
                    } else if (i10 == 1) {
                        zzPI(7 - i11);
                        if (z) {
                            int iZzdn2 = iZzdn + zzdn();
                            int i13 = i7 + 1;
                            iArr3[i7] = iZzdn2;
                            int iZzdm = zzdm();
                            int i14 = this.f51312w;
                            if (iZzdm > i14 - iZzdn2) {
                                iZzdm = i14 - iZzdn2;
                                warning("Decoded row " + (this.zzZLH + i5) + " too long; ignoring extra samples.");
                            }
                            zzYT(iZzdn2, iZzdm);
                            iZzdn = iZzdn2 + iZzdm;
                            i7 += 2;
                            iArr3[i13] = iZzdn;
                        } else {
                            int iZzdm2 = zzdm();
                            int i15 = this.f51312w;
                            if (iZzdm2 > i15 - iZzdn) {
                                iZzdm2 = i15 - iZzdn;
                                warning("Decoded row " + (this.zzZLH + i5) + " too long; ignoring extra samples.");
                            }
                            zzYT(iZzdn, iZzdm2);
                            int i16 = iZzdn + iZzdm2;
                            int i17 = i7 + 1;
                            iArr3[i7] = i16;
                            iZzdn = i16 + zzdn();
                            i7 += 2;
                            iArr3[i17] = iZzdn;
                        }
                    } else if (i10 <= 8) {
                        int i18 = (i10 - 5) + i8;
                        int i19 = i7 + 1;
                        iArr3[i7] = i18;
                        if (!z) {
                            int i20 = this.f51312w;
                            if (i18 > i20) {
                                warning("Decoded row " + (this.zzZLH + i5) + " too long; ignoring extra samples.");
                                i18 = i20;
                            }
                            zzYT(iZzdn, i18 - iZzdn);
                        }
                        iZzdn = i18;
                        z = !z;
                        zzPI(7 - i11);
                        i7 = i19;
                    } else {
                        if (i10 == 11) {
                            int iZzPJ = zzPJ(3);
                            if (iZzPJ != 7) {
                                warning("Unsupported entrance code " + iZzPJ + " for extension mode at line " + (this.zzZLH + i5) + ".");
                            }
                            boolean z2 = false;
                            int i21 = 0;
                            while (!z2) {
                                while (zzPJ(1) != 1) {
                                    i21++;
                                }
                                if (i21 > 5) {
                                    i21 -= 6;
                                    if (!z && i21 > 0) {
                                        iArr3[i7] = iZzdn;
                                        i7++;
                                    }
                                    iZzdn += i21;
                                    if (i21 > 0) {
                                        z = true;
                                    }
                                    if (zzPJ(1) == 0) {
                                        if (!z) {
                                            iArr3[i7] = iZzdn;
                                            i7++;
                                        }
                                        z = true;
                                    } else {
                                        if (z) {
                                            iArr3[i7] = iZzdn;
                                            i7++;
                                        }
                                        z = false;
                                    }
                                    z2 = true;
                                }
                                if (i21 == 5) {
                                    if (!z) {
                                        iArr3[i7] = iZzdn;
                                        i7++;
                                    }
                                    iZzdn += i21;
                                    z = true;
                                } else {
                                    int i22 = iZzdn + i21;
                                    iArr3[i7] = i22;
                                    zzYT(i22, 1);
                                    iZzdn = i22 + 1;
                                    i7++;
                                    z = false;
                                }
                            }
                        } else {
                            warning("Unknown coding mode encountered at line " + (this.zzZLH + i5) + ".");
                        }
                        i4 = 0;
                    }
                    i6 = iZzdn;
                    i4 = 0;
                }
                if (i7 <= i) {
                    iArr3[i7] = iZzdn;
                    i7++;
                }
                this.zzZL7 = i7;
                this.zzZL8 += this.zzZL9;
                i5++;
                i4 = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        r3 = new java.lang.StringBuilder("Unknown coding mode encountered at line ");
        r3.append(r17.zzZLH + r8);
        r3.append(": read ");
        r3.append(r9);
        r3.append(" of ");
        warning(Oooo0oO.C21023OooO0Oo.OooO0OO(" expected pixels.", r17.f51312w, r3));
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0103, code lost:
    
        if (r7 == 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0105, code lost:
    
        r7 = zzdl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0109, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010c, code lost:
    
        warning("Sync loss at line " + (r17.zzZLH + r8) + ": read " + r8 + " of " + r2 + " lines.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0131, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0132, code lost:
    
        r8 = r8 + (r3 - 1);
        zzPI(13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzdq() throws IOException {
        int iZzdn;
        int i = this.zz4p;
        int[] iArr = new int[2];
        if (this.data.length < 2) {
            throw new IOException("Insufficient data to read initial EOL.");
        }
        if (zzPK(12) != 1) {
            warning("T.4 compressed data should begin with EOL.");
        }
        zzPI(12);
        int iZzdl = 0;
        int i2 = -1;
        while (iZzdl != 1) {
            try {
                iZzdl = zzdl();
                i2++;
            } catch (EOFException unused) {
                throw new IOException("No reference line present.");
            }
        }
        zzPL(this.zzZLH);
        int i3 = i2 + 1;
        this.zzZL8 += this.zzZL9;
        while (i3 < i) {
            try {
                int iZzdl2 = zzdl();
                if (iZzdl2 == 0) {
                    int[] iArr2 = this.zzZL6;
                    this.zzZL6 = this.zzZL5;
                    this.zzZL5 = iArr2;
                    this.zzZL4 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    boolean z = true;
                    int i6 = -1;
                    while (true) {
                        if (i4 >= this.f51312w) {
                            break;
                        }
                        zzZ(i6, z, iArr);
                        int i7 = iArr[0];
                        int i8 = iArr[1];
                        byte b = zzZLc[zzPJ(7)];
                        int i9 = (b & 120) >>> 3;
                        int i10 = 7 & b;
                        if (i9 != 0) {
                            if (i9 != 1) {
                                if (i9 > 8) {
                                    break;
                                }
                                i6 = i7 + (i9 - 5);
                                int i11 = i5 + 1;
                                this.zzZL5[i5] = i6;
                                if (!z) {
                                    zzYT(i4, i6 - i4);
                                }
                                z = !z;
                                zzPI(7 - i10);
                                i4 = i6;
                                i5 = i11;
                            } else {
                                zzPI(7 - i10);
                                if (z) {
                                    int iZzdn2 = i4 + zzdn();
                                    int i12 = i5 + 1;
                                    this.zzZL5[i5] = iZzdn2;
                                    int iZzdm = zzdm();
                                    zzYT(iZzdn2, iZzdm);
                                    iZzdn = iZzdn2 + iZzdm;
                                    i5 += 2;
                                    this.zzZL5[i12] = iZzdn;
                                } else {
                                    int iZzdm2 = zzdm();
                                    zzYT(i4, iZzdm2);
                                    int i13 = i4 + iZzdm2;
                                    int i14 = i5 + 1;
                                    this.zzZL5[i5] = i13;
                                    iZzdn = i13 + zzdn();
                                    i5 += 2;
                                    this.zzZL5[i14] = iZzdn;
                                }
                                i6 = iZzdn;
                                i4 = i6;
                            }
                        } else {
                            if (!z) {
                                zzYT(i4, i8 - i4);
                            }
                            zzPI(7 - i10);
                            i4 = i8;
                            i6 = i4;
                        }
                    }
                    this.zzZL5[i5] = i4;
                    this.zzZL7 = i5 + 1;
                } else {
                    zzPL(this.zzZLH + i3);
                }
                this.zzZL8 += this.zzZL9;
                i3++;
            } catch (EOFException unused2) {
                StringBuilder sb = new StringBuilder("Input exhausted before EOL found at line ");
                sb.append(this.zzZLH + i3);
                sb.append(": read 0 of ");
                warning(C21023OooO0Oo.OooO0OO(" expected pixels.", this.f51312w, sb));
                return;
            }
        }
    }

    @Override // com.aspose.words.internal.zzZJN
    public final void zzX(byte[] bArr, int i, int i2, int i3) throws Exception {
        this.buffer = bArr;
        int i4 = this.zzZLG;
        this.f51312w = i4;
        this.zz4p = this.zzZLF;
        this.zzZL9 = i3 * 8;
        this.zzZL8 = i * 8;
        this.data = new byte[this.zz8r];
        this.zzZLb = 0;
        this.zzZLa = 0;
        this.zzZL6 = new int[i4 + 1];
        this.zzZL5 = new int[i4 + 1];
        this.zzN5.zzH(this.zzDs);
        this.zzZMs.readFully(this.data);
        try {
            int i5 = this.zzVz;
            if (i5 == 2) {
                zzdo();
                return;
            }
            if (i5 == 3) {
                zzdq();
            } else if (i5 == 4) {
                this.zzZL2 = (this.zzZM6 & 2) >> 1;
                zzdp();
            } else {
                throw new IOException("Unknown compression type " + this.zzVz);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Ignoring exception:\n " + e.getMessage());
        }
    }

    @Override // com.aspose.words.internal.zzZJN
    public final void zzdu() {
        super.zzdu();
        int iZzWL = this.zzZMD.zzWL() == -1 ? 2 : this.zzZMD.zzWL();
        this.zzVz = iZzWL;
        int iZzdE = 0;
        if (iZzWL == 2) {
            this.zzZMa = 1;
            this.zzZM7 = 0;
            this.zzZL3 = 0;
            this.zzZL2 = 0;
            this.zzZL1 = 0;
        } else {
            this.zzZMa = this.zzZMD.zzdM() == -1 ? 1 : this.zzZMD.zzdM();
            int iZzdF = this.zzZMD.zzdF() == -1 ? 0 : this.zzZMD.zzdF();
            this.zzZM7 = iZzdF;
            this.zzZL3 = iZzdF & 1;
            this.zzZL2 = (iZzdF & 2) >> 1;
            this.zzZL1 = (iZzdF & 4) >> 2;
            if (this.zzZMD.zzdE() != -1) {
                iZzdE = this.zzZMD.zzdE();
            }
        }
        this.zzZM6 = iZzdE;
    }
}
