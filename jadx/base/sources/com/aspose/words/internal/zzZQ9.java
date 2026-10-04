package com.aspose.words.internal;

import Oooo0.C20855OooooOO;
import Oooo0oO.C21034OooOOOo;
import com.aspose.words.StyleIdentifier;
import com.aspose.words.ref.Ref;
import com.google.common.primitives.Longs;
import com.huawei.hms.network.embedded.C18168f2;
import com.huawei.hms.network.embedded.C18385v2;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQ9 implements Comparable<Object> {
    static final /* synthetic */ boolean zzVr = true;
    private long zz33;
    private static final int[] zz37 = {0, 31, 59, 90, 120, 151, 181, 212, 243, StyleIdentifier.GRID_TABLE_1_LIGHT, 304, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_1, StyleIdentifier.LIST_TABLE_2_ACCENT_6};
    private static final int[] zz36 = {0, 31, 60, 91, 121, 152, 182, 213, 244, StyleIdentifier.GRID_TABLE_2, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_1, StyleIdentifier.LIST_TABLE_3_ACCENT_6};
    public static final zzZQ9 zz35 = new zzZQ9(0, 0);
    public static final zzZQ9 zz34 = new zzZQ9(3155378975999999999L, 0);
    private static zzZQ9 zz32 = new zzZQ9(1582, 10, 5);

    public zzZQ9() {
        this.zz33 = 0L;
    }

    private static boolean isLeapYear(int i) {
        if (i <= 0 || i > 9999) {
            throw new IllegalArgumentException("year");
        }
        if (i % 4 == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }

    private static long zzE(int i, int i2, int i3) {
        if (i < 0 || i >= 24 || i2 < 0 || i2 >= 60 || i3 < 0 || i3 >= 60) {
            throw new IllegalArgumentException("ArgumentOutOfRange_BadHourMinuteSecond");
        }
        return zzZNF.zzE(i, i2, i3);
    }

    private static long zzF(int i, int i2, int i3) {
        if (i > 0 && i <= 9999 && i2 > 0 && i2 <= 12) {
            int[] iArr = isLeapYear(i) ? zz36 : zz37;
            if (i3 > 0) {
                if (i3 <= iArr[i2] - iArr[i2 - 1]) {
                    int i4 = i - 1;
                    return ((long) (((((i4 / 400) + (((i4 / 4) + (i4 * StyleIdentifier.LIST_TABLE_2_ACCENT_6)) - (i4 / 100))) + r0) + i3) - 1)) * 864000000000L;
                }
            }
        }
        throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, i2, "Year = ", ", Month = "));
    }

    public static Date zzJ(zzZQ9 zzzq9) {
        if (zzzq9 == null) {
            return null;
        }
        return zzzq9.zzkF().zzkH();
    }

    public static zzZQ9 zzQO() {
        return zzkQ().zzkK();
    }

    private int zzRn(int i) {
        int iZzkV = (int) (zzkV() / 864000000000L);
        int i2 = iZzkV / 146097;
        int i3 = iZzkV - (146097 * i2);
        int i4 = i3 / 36524;
        if (i4 == 4) {
            i4 = 3;
        }
        int i5 = i3 - (36524 * i4);
        int i6 = i5 / 1461;
        int i7 = i5 - (i6 * 1461);
        int i8 = i7 / StyleIdentifier.LIST_TABLE_2_ACCENT_6;
        if (i8 == 4) {
            i8 = 3;
        }
        if (i == 0) {
            return (i6 * 4) + (i4 * 100) + (i2 * 400) + i8 + 1;
        }
        int i9 = i7 - (i8 * StyleIdentifier.LIST_TABLE_2_ACCENT_6);
        if (i == 1) {
            return i9 + 1;
        }
        int[] iArr = (i8 != 3 || (i6 == 24 && i4 != 3)) ? zz37 : zz36;
        int i10 = i9 >> 6;
        while (i9 >= iArr[i10]) {
            i10++;
        }
        return i == 2 ? i10 : (i9 - iArr[i10 - 1]) + 1;
    }

    private zzZQ9 zzU(double d, int i) {
        long j = (long) ((((double) i) * d) + (d >= 0.0d ? 0.5d : -0.5d));
        if (j <= -315537897600000L || j >= 315537897600000L) {
            throw new IllegalArgumentException("value");
        }
        return zzYL(j * 10000);
    }

    public static boolean zzV(zzZQ9 zzzq9, zzZQ9 zzzq92) {
        if (zzzq9 == zzzq92) {
            return true;
        }
        return (zzzq9 == null || zzzq92 == null || zzzq9.zzkV() < zzzq92.zzkV()) ? false : true;
    }

    public static zzZQ9 zzVS(String str) {
        return zzf(str);
    }

    public static boolean zzW(zzZQ9 zzzq9, zzZQ9 zzzq92) {
        return (zzzq9 == zzzq92 || zzzq9 == null || zzzq92 == null || zzzq9.zzkV() <= zzzq92.zzkV()) ? false : true;
    }

    public static boolean zzX(zzZQ9 zzzq9, zzZQ9 zzzq92) {
        if (zzzq9 == zzzq92) {
            return true;
        }
        return (zzzq9 == null || zzzq92 == null || zzzq9.zzkV() > zzzq92.zzkV()) ? false : true;
    }

    public static boolean zzY(zzZQ9 zzzq9, zzZQ9 zzzq92) {
        return (zzzq9 == zzzq92 || zzzq9 == null || zzzq92 == null || zzzq9.zzkV() >= zzzq92.zzkV()) ? false : true;
    }

    private static int zzYH(long j) {
        int offset = zzZNG.getTimeZone().getOffset(j);
        if ("Europe/Moscow".equals(zzZNG.getTimeZone().getID())) {
            int offset2 = zzZNG.getTimeZone().getOffset(j - ((long) offset));
            if (offset == 10800000 && offset2 == 14400000) {
                return 14400000;
            }
            if (offset == 14400000 && offset2 == 10800000) {
                return 10800000;
            }
        }
        return offset;
    }

    private static long zzYI(long j) {
        long j2 = j + 62135596800000L;
        if (j2 < 0) {
            j2 = 0;
        }
        return j2 * 10000;
    }

    private static double zzYJ(long j) {
        if (j == 0) {
            return 0.0d;
        }
        if (j < 864000000000L) {
            j += 599264352000000000L;
        }
        if (j < 31241376000000000L) {
            throw new IllegalStateException("Arg_OleAutDateInvalid");
        }
        long j2 = (j - 599264352000000000L) / 10000;
        if (j2 < 0) {
            long j3 = j2 % C18385v2.f56338j;
            if (j3 != 0) {
                j2 -= (j3 + C18385v2.f56338j) * 2;
            }
        }
        return j2 / 8.64E7d;
    }

    public static zzZQ9 zzYK(long j) {
        if (j < 0 || j > 2650467743999999999L) {
            throw new IllegalArgumentException("fileTime");
        }
        return new zzZQ9(j + 504911232000000000L, 1L);
    }

    private static zzZQ9 zzYM(long j) {
        zzZQ9 zzzq9 = new zzZQ9();
        zzzq9.zz33 = j;
        return zzzq9;
    }

    private zzZQ9 zzZ(zzZNF zzznf) {
        return zzYL(zzznf.zzZVO);
    }

    public static zzZQ9 zzZg(double d) {
        return new zzZQ9(zzZh(d), 0L);
    }

    private static long zzZh(double d) {
        if (d >= 2958466.0d || d <= -657435.0d) {
            throw new IllegalArgumentException("Arg_OleAutDateInvalid");
        }
        long j = (long) ((8.64E7d * d) + (d >= 0.0d ? 0.5d : -0.5d));
        if (j < 0) {
            j -= (j % C18385v2.f56338j) * 2;
        }
        long j2 = j + 59926435200000L;
        if (j2 < 0 || j2 >= 315537897600000L) {
            throw new IllegalArgumentException("Arg_OleAutDateScale");
        }
        return j2 * 10000;
    }

    public static int zzZn(int i, int i2) {
        if (i2 <= 0 || i2 > 12) {
            throw new IllegalArgumentException("month");
        }
        int[] iArr = isLeapYear(i) ? zz36 : zz37;
        return iArr[i2] - iArr[i2 - 1];
    }

    public static zzZQ9 zzf(String str) {
        return zzZPM.zzZ(str, zzZP0.zzj3(), 0);
    }

    public static zzZQ9 zzkN() {
        return zzkQ().zzkK().zzkT();
    }

    private static zzZQ9 zzkQ() {
        return zzYM(zzYI(System.currentTimeMillis()) | Longs.MAX_POWER_OF_TWO);
    }

    private long zzkU() {
        return this.zz33 & (-4611686018427387904L);
    }

    private long zzkV() {
        return this.zz33 & 4611686018427387903L;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        if (obj == null) {
            return 1;
        }
        if (!(obj instanceof zzZQ9)) {
            throw new IllegalArgumentException("Arg_MustBeDateTime");
        }
        long jZzkV = ((zzZQ9) obj).zzkV();
        long jZzkV2 = zzkV();
        if (jZzkV2 > jZzkV) {
            return 1;
        }
        return jZzkV2 < jZzkV ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzZQ9) && zzZ(this, (zzZQ9) obj);
    }

    public final int getDay() {
        return zzRn(3);
    }

    public final int getHour() {
        return (int) ((zzkV() / 36000000000L) % 24);
    }

    public final int getMillisecond() {
        return (int) ((zzkV() / 10000) % 1000);
    }

    public final int getMinute() {
        return (int) ((zzkV() / 600000000) % 60);
    }

    public final int getMonth() {
        return zzRn(2);
    }

    public final int getSecond() {
        return (int) ((zzkV() / 10000000) % 60);
    }

    public final int getYear() {
        return zzRn(0);
    }

    public final int hashCode() {
        long jZzkV = zzkV();
        return ((int) (jZzkV >> 32)) ^ ((int) jZzkV);
    }

    public final String toString() {
        try {
            return zzZPO.zzZ(this, (String) null, zzZP0.zzj3());
        } catch (Exception e) {
            zzZHV.zzZ(e);
            return "DateTime wrong";
        }
    }

    public final int zzK(zzZQ9 zzzq9) {
        long jZzkV = zzzq9.zzkV();
        long jZzkV2 = zzkV();
        if (jZzkV2 > jZzkV) {
            return 1;
        }
        return jZzkV2 < jZzkV ? -1 : 0;
    }

    public final zzZQ9 zzRo(int i) {
        if (i < -10000 || i > 10000) {
            throw new IllegalArgumentException("years");
        }
        return zzRp(i * 12);
    }

    public final zzZQ9 zzRp(int i) {
        int i2;
        int iOooO00o;
        if (i < -120000 || i > 120000) {
            throw new IllegalArgumentException("months");
        }
        int iZzRn = zzRn(0);
        int iZzRn2 = zzRn(2);
        int iZzRn3 = zzRn(3);
        int i3 = (iZzRn2 - 1) + i;
        if (i3 >= 0) {
            i2 = (i3 % 12) + 1;
            iOooO00o = (i3 / 12) + iZzRn;
        } else {
            i2 = ((i3 + 1) % 12) + 12;
            iOooO00o = C21034OooOOOo.OooO00o(i3, 11, 12, iZzRn);
        }
        if (iOooO00o <= 0 || iOooO00o > 9999) {
            throw new IllegalArgumentException("months");
        }
        int iZzZn = zzZn(iOooO00o, i2);
        if (iZzRn3 > iZzZn) {
            iZzRn3 = iZzZn;
        }
        return zzYM(zzkU() | ((zzkV() % 864000000000L) + zzF(iOooO00o, i2, iZzRn3)));
    }

    public final zzZQ9 zzYL(long j) {
        long jZzkV = zzkV();
        if (j > 3155378975999999999L - jZzkV || j < 0 - jZzkV) {
            throw new IllegalArgumentException("value");
        }
        return zzYM(zzkU() | (jZzkV + j));
    }

    public final zzZQ9 zzZi(double d) {
        return zzU(d, 1000);
    }

    public final zzZQ9 zzZj(double d) {
        return zzU(d, C18168f2.f54714c);
    }

    public final zzZQ9 zzkF() {
        if (zzkU() == Longs.MAX_POWER_OF_TWO) {
            return this;
        }
        long jZzkV = zzkV() - zzkJ();
        return jZzkV > 3155378975999999999L ? new zzZQ9(3155378975999999999L, 1L) : jZzkV < 0 ? new zzZQ9(0L, 1L) : new zzZQ9(jZzkV, 1L);
    }

    public final String zzkG() {
        return zzZPO.zzZ(this, "d", zzZP0.zzj3());
    }

    public final Date zzkH() {
        long jZzkI = -62135769599766L;
        if (!zz35.equals(this)) {
            if (zzkV() < zz32.zzkV()) {
                int iZzRn = zzRn(0);
                if (zzRn(2) < 3) {
                    iZzRn--;
                }
                jZzkI = (-62135769599766L) + ((zzkV() + (((long) ((iZzRn / 100) - (iZzRn / 400))) * 864000000000L)) / 10000);
            } else {
                jZzkI = zzkI();
                if (zzkU() != Longs.MAX_POWER_OF_TWO) {
                    jZzkI -= (long) zzYH(jZzkI);
                }
            }
        }
        return new Date(jZzkI);
    }

    public final long zzkI() {
        return (zzkV() / 10000) - 62135596800000L;
    }

    public final long zzkJ() {
        return ((long) zzZNG.getTimeZone().getOffset(zzkI())) * 10000;
    }

    public final zzZQ9 zzkK() {
        if (zzkU() == Long.MIN_VALUE) {
            return this;
        }
        long jZzkJ = zzkJ() + zzkV();
        return jZzkJ > 3155378975999999999L ? new zzZQ9(3155378975999999999L, 2L) : jZzkJ < 0 ? new zzZQ9(0L, 2L) : new zzZQ9(jZzkJ, 2L);
    }

    public final long zzkL() {
        long jZzkV = ((zzkU() & Long.MIN_VALUE) != 0 ? zzkF().zzkV() : zzkV()) - 504911232000000000L;
        if (jZzkV >= 0) {
            return jZzkV;
        }
        throw new IllegalArgumentException("ArgumentOutOfRange_FileTimeInvalid");
    }

    public final double zzkM() {
        return zzYJ(zzkV());
    }

    public final zzZNF zzkO() {
        return new zzZNF(zzkV() % 864000000000L);
    }

    public final long zzkP() {
        return zzkV();
    }

    public final long zzkR() {
        long jZzkU = zzkU();
        if (jZzkU == 0) {
            return 0L;
        }
        return jZzkU == Longs.MAX_POWER_OF_TWO ? 1L : 2L;
    }

    public final int zzkS() {
        return (int) (((zzkV() / 864000000000L) + 1) % 7);
    }

    public final zzZQ9 zzkT() {
        long jZzkV = zzkV();
        return zzYM((jZzkV - (jZzkV % 864000000000L)) | zzkU());
    }

    public static zzZQ9 zzY(zzZQ9 zzzq9, int i) {
        return new zzZQ9(zzzq9.zzkV(), i);
    }

    public static zzZQ9 zzZ(zzZQ9 zzzq9, zzZNF zzznf) {
        return zzzq9.zzZ(zzznf);
    }

    public zzZQ9(long j) {
        if (j >= 0 && j <= 3155378975999999999L) {
            this.zz33 = j;
            return;
        }
        throw new IllegalArgumentException("ticks");
    }

    public static zzZNF zzU(zzZQ9 zzzq9, zzZQ9 zzzq92) {
        return new zzZNF(zzzq9.zzkV() - zzzq92.zzkV());
    }

    public static boolean zzZ(zzZQ9 zzzq9, zzZQ9 zzzq92) {
        if (zzzq9 == zzzq92) {
            return true;
        }
        return (zzzq9 == null || zzzq92 == null || zzzq9.zzkV() != zzzq92.zzkV()) ? false : true;
    }

    public final String zzY(String str, zzZPC zzzpc) {
        return zzZPO.zzZ(this, str, zzZP0.zzZ(zzzpc));
    }

    public static zzZQ9 zzZ(zzZQ9 zzzq9, long j) {
        return new zzZQ9(zzzq9.zzkV(), j);
    }

    public final String toString(String str) {
        return zzZPO.zzZ(this, str, zzZP0.zzj3());
    }

    public final zzZQ9 zzY(zzZNF zzznf) {
        long jZzkV = zzkV();
        long j = zzznf.zzZVO;
        if (jZzkV >= j && jZzkV - 3155378975999999999L <= j) {
            return zzYM((jZzkV - j) | zzkU());
        }
        throw new IllegalArgumentException();
    }

    public static zzZQ9 zzZ(Date date) {
        return new zzZQ9(zzYI(date.getTime()), 1L).zzkK();
    }

    public zzZQ9(long j, long j2) {
        if (j < 0 || j > 3155378975999999999L) {
            throw new IllegalArgumentException("ticks");
        }
        if (j2 >= 0 && j2 <= 2) {
            this.zz33 = j | (j2 << 62);
            return;
        }
        throw new IllegalArgumentException("kind");
    }

    public static zzZQ9[] zzZ(Date[] dateArr) {
        zzZQ9[] zzzq9Arr = new zzZQ9[dateArr.length];
        for (int i = 0; i < dateArr.length; i++) {
            zzzq9Arr[i] = zzZ(dateArr[i]);
        }
        return zzzq9Arr;
    }

    public zzZQ9(int i, int i2, int i3) {
        this.zz33 = zzF(i, i2, i3);
    }

    public static zzZQ9 zzZ(Calendar calendar) {
        long timeInMillis = calendar.getTimeInMillis();
        return new zzZQ9(zzYI(timeInMillis + ((long) calendar.getTimeZone().getOffset(timeInMillis))), 2L);
    }

    public zzZQ9(int i, int i2, int i3, int i4, int i5, int i6) {
        this.zz33 = zzF(i, i2, i3) + zzE(i4, i5, i6);
    }

    public static zzZQ9 zzZ(String str, zzZPC zzzpc, int i) {
        return zzZPM.zzZ(str, zzZP0.zzZ(zzzpc), i);
    }

    public zzZQ9(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long jZzF = zzF(i, i2, i3) + zzE(i4, i5, i6);
        if (i7 < 0 || i7 >= 1000) {
            throw new IllegalArgumentException("millisecond");
        }
        long j = (((long) i7) * 10000) + jZzF;
        if (j >= 0 && j <= 3155378975999999999L) {
            this.zz33 = j;
            return;
        }
        throw new IllegalArgumentException("Arg_DateTimeRange");
    }

    public static boolean zzZ(String str, zzZPC zzzpc, Ref<zzZQ9> ref) {
        ref.set(zzZPM.zzZ(str, zzZP0.zzZ(zzzpc), 24));
        return !zzZ(ref.get(), zz35);
    }

    public static boolean zzZ(String str, String str2, zzZPC zzzpc, Ref<zzZQ9> ref) {
        return zzZ(str, new String[]{str2}, zzzpc, 128, ref);
    }

    public static boolean zzZ(String str, String[] strArr, zzZPC zzzpc, int i, Ref<zzZQ9> ref) {
        ref.set(zzZPM.zzZ(str, strArr, zzZP0.zzZ(zzzpc), i));
        return !zzZ(ref.get(), zz35);
    }

    public zzZQ9(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        long jZzF = zzF(i, i2, i3) + zzE(i4, i5, i6);
        if (i7 < 0 || i7 >= 1000) {
            throw new IllegalArgumentException("millisecond");
        }
        long j2 = (((long) i7) * 10000) + jZzF;
        if (j2 < 0 || j2 > 3155378975999999999L) {
            throw new IllegalArgumentException("Arg_DateTimeRange");
        }
        if (j >= 0 && j <= 2) {
            this.zz33 = (j << 62) | j2;
            return;
        }
        throw new IllegalArgumentException("Argument_InvalidDateTimeKind");
    }

    public static zzZQ9 zzZ(String str, String str2, zzZPC zzzpc) {
        return zzZPM.zzZ(str, str2, zzZP0.zzZ(zzzpc), 0);
    }

    public static zzZQ9 zzZ(String str, String[] strArr, zzZPC zzzpc) {
        return zzZPM.zzZ(str, strArr, zzZP0.zzZ(zzzpc), 16);
    }
}
