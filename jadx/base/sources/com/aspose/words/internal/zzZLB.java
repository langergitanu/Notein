package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: loaded from: classes5.dex */
final class zzZLB {
    private static final int zzZQA = 4;
    private static final int zzZQB = 10;
    private static final int zzZQC = 8;
    private static short zzZQs = 7;
    private static final int zzZQt = 6;
    private static final int zzZQu = 5;
    private static final int zzZQv = 3;
    private static final int zzZQw = 2;
    private static final int zzZQx = 8;
    private static final int zzZQy = 7;
    private static final int zzZQz = 5;
    private final int zzZQp;
    private final int zzZQq;
    private final zzZQ9 zzZQr;

    /* JADX INFO: renamed from: com.aspose.words.internal.zzZLB$1 */
    public static /* synthetic */ class C158861 {
        static final /* synthetic */ int[] zzZQn;
        static final /* synthetic */ int[] zzZQo;

        static {
            int[] iArr = new int[zzY.values().length];
            zzZQn = iArr;
            try {
                iArr[zzY.Date.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzZQn[zzY.Time.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzZQn[zzY.DateTime.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[zzZ.zzfB().length];
            zzZQo = iArr2;
            try {
                iArr2[zzZ.Time$4668e8ac - 1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zzZQo[zzZ.Date$4668e8ac - 1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class zzX {
        public static final int LocalEastOfZulu$7ad03990 = 4;
        public static final int LocalWestOfZulu$7ad03990 = 3;
        public static final int Unspecified$7ad03990 = 1;
        public static final int Zulu$7ad03990 = 2;
        private static final /* synthetic */ int[] zzZQk = {1, 2, 3, 4};
    }

    public enum zzY {
        DateTime,
        Time,
        Date,
        GYearMonth,
        GYear,
        GMonthDay,
        GDay,
        GMonth,
        AllXsd
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class zzZ {
        public static final int Date$4668e8ac = 3;
        public static final int DateTime$4668e8ac = 1;
        public static final int GDay$4668e8ac = 7;
        public static final int GMonth$4668e8ac = 8;
        public static final int GMonthDay$4668e8ac = 6;
        public static final int GYear$4668e8ac = 5;
        public static final int GYearMonth$4668e8ac = 4;
        public static final int Time$4668e8ac = 2;
        private static final /* synthetic */ int[] zzZQm = {1, 2, 3, 4, 5, 6, 7, 8};

        public static int[] zzfB() {
            return (int[]) zzZQm.clone();
        }
    }

    public zzZLB(zzZQ9 zzzq9, zzY zzy) {
        if (zzzq9 == null) {
            throw new IllegalArgumentException("dateTime");
        }
        this.zzZQr = zzzq9;
        this.zzZQq = zzZ(zzy);
        if (zzzq9.zzkR() == 0 || zzzq9.zzkR() != 1) {
            this.zzZQp = zzX.Unspecified$7ad03990;
        } else {
            this.zzZQp = zzX.Zulu$7ad03990;
        }
    }

    private void zzK(StringBuilder sb) {
        char[] cArr = new char[zzZQC];
        zzV(cArr, 0, this.zzZQr.getHour());
        cArr[zzZQw] = ':';
        zzV(cArr, zzZQv, this.zzZQr.getMinute());
        cArr[zzZQu] = ':';
        zzV(cArr, zzZQt, this.zzZQr.getSecond());
        sb.append(cArr);
        int iZzfC = zzfC();
        if (iZzfC != 0) {
            int i = zzZQs;
            while (iZzfC % 10 == 0) {
                i--;
                iZzfC /= 10;
            }
            char[] cArr2 = new char[i + 1];
            cArr2[0] = FilenameUtils.EXTENSION_SEPARATOR;
            zzY(cArr2, 1, iZzfC, i);
            sb.append(cArr2);
        }
    }

    private void zzL(StringBuilder sb) {
        char[] cArr = new char[zzZQB];
        zzY(cArr, 0, this.zzZQr.getYear(), 4);
        cArr[zzZQA] = '-';
        zzV(cArr, zzZQz, this.zzZQr.getMonth());
        cArr[zzZQy] = '-';
        zzV(cArr, zzZQx, this.zzZQr.getDay());
        sb.append(cArr);
    }

    private void zzM(StringBuilder sb) {
        if (this.zzZQp == zzX.Zulu$7ad03990) {
            sb.append('Z');
        }
    }

    private static void zzV(char[] cArr, int i, int i2) {
        cArr[i] = (char) ((i2 / 10) + 48);
        cArr[i + 1] = (char) ((i2 % 10) + 48);
    }

    private static void zzY(char[] cArr, int i, int i2, int i3) {
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return;
            }
            cArr[i + i4] = (char) ((i2 % 10) + 48);
            i2 /= 10;
            i3 = i4;
        }
    }

    private static int zzZ(zzY zzy) {
        int i = C158861.zzZQn[zzy.ordinal()];
        if (i == 1) {
            return zzZ.Date$4668e8ac;
        }
        if (i == 2) {
            return zzZ.Time$4668e8ac;
        }
        if (i == 3) {
            return zzZ.DateTime$4668e8ac;
        }
        zzZHV.zzN("The default DateTimeTypeCode.DateTime is used but the code " + zzy + ". Please implement the absent functionality");
        return zzZ.DateTime$4668e8ac;
    }

    private int zzfC() {
        return (int) (this.zzZQr.zzkP() - new zzZQ9(this.zzZQr.getYear(), this.zzZQr.getMonth(), this.zzZQr.getDay(), this.zzZQr.getHour(), this.zzZQr.getMinute(), this.zzZQr.getSecond()).zzkP());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = C158861.zzZQo[this.zzZQq - 1];
        if (i == 1) {
            zzK(sb);
        } else if (i != 2) {
            zzL(sb);
            sb.append('T');
            zzK(sb);
        } else {
            zzL(sb);
        }
        zzM(sb);
        return sb.toString();
    }
}
