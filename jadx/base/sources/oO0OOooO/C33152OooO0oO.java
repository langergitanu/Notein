package oO0OOooO;

import java.text.NumberFormat;
import java.util.Locale;
import o00O0o.C24917OooO00o;
import oO000O0.EnumC31935OooO0Oo;
import oO0OoOoO.C33290OooO00o;

/* JADX INFO: renamed from: oO0OOooO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33152OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f119881OooO00o = 0;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
        numberFormat.setMaximumFractionDigits(10);
        numberFormat.setGroupingUsed(false);
        NumberFormat numberFormat2 = NumberFormat.getInstance(Locale.getDefault());
        numberFormat2.setMaximumFractionDigits(10);
        numberFormat2.setGroupingUsed(false);
    }

    public static AbstractC33146OooO00o OooO00o(double[][] dArr) {
        double[] dArr2;
        int i = 0;
        if (dArr == null || (dArr2 = dArr[0]) == null) {
            throw new o00O0o.OooO(EnumC31935OooO0Oo.NULL_NOT_ALLOWED, new Object[0]);
        }
        if (dArr.length * dArr2.length <= 4096) {
            return new C33147OooO0O0(dArr);
        }
        int length = dArr.length;
        double[] dArr3 = dArr[0];
        int length2 = dArr3.length;
        int length3 = dArr.length;
        int length4 = dArr3.length;
        int i2 = (length3 + 51) / 52;
        int i3 = (length4 + 51) / 52;
        for (double[] dArr4 : dArr) {
            int length5 = dArr4.length;
            if (length5 != length4) {
                throw new C24917OooO00o(EnumC31935OooO0Oo.DIMENSIONS_MISMATCH_SIMPLE, length4, length5);
            }
        }
        double[][] dArr5 = new double[i2 * i3][];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = i4 * 52;
            int i7 = i6 + 52;
            int i8 = C33290OooO00o.f120515OooO00o;
            if (i7 > length3) {
                i7 = length3;
            }
            int i9 = i7 - i6;
            int i10 = i;
            while (i10 < i3) {
                int i11 = i10 * 52;
                int i12 = i11 + 52;
                if (i12 > length4) {
                    i12 = length4;
                }
                int i13 = i12 - i11;
                int i14 = length4;
                double[] dArr6 = new double[i9 * i13];
                dArr5[i5] = dArr6;
                int i15 = length3;
                int i16 = i2;
                int i17 = i6;
                int i18 = 0;
                while (i17 < i7) {
                    int i19 = i17;
                    System.arraycopy(dArr[i19], i11, dArr6, i18, i13);
                    i18 += i13;
                    i17 = i19 + 1;
                }
                i5++;
                i10++;
                length4 = i14;
                length3 = i15;
                i2 = i16;
            }
            i4++;
            i = 0;
        }
        return new C33149OooO0Oo(length, length2, dArr5);
    }

    public static void OooO0O0(AbstractC33146OooO00o abstractC33146OooO00o, int i) {
        if (i < 0 || i >= abstractC33146OooO00o.mo80628a()) {
            throw new o00O0o.OooOO0(EnumC31935OooO0Oo.COLUMN_INDEX, Integer.valueOf(i), Integer.valueOf(abstractC33146OooO00o.mo80628a() - 1));
        }
    }

    public static void OooO0OO(AbstractC33146OooO00o abstractC33146OooO00o, AbstractC33146OooO00o abstractC33146OooO00o2) {
        if (abstractC33146OooO00o.mo80628a() == abstractC33146OooO00o2.mo80632c()) {
            return;
        }
        throw new C24917OooO00o(EnumC31935OooO0Oo.DIMENSIONS_MISMATCH_SIMPLE, abstractC33146OooO00o.mo80628a(), abstractC33146OooO00o2.mo80632c());
    }

    public static void OooO0Oo(AbstractC33146OooO00o abstractC33146OooO00o, int i) {
        if (i < 0 || i >= abstractC33146OooO00o.mo80632c()) {
            throw new o00O0o.OooOO0(EnumC31935OooO0Oo.ROW_INDEX, Integer.valueOf(i), Integer.valueOf(abstractC33146OooO00o.mo80632c() - 1));
        }
    }
}
