package o00OO00O;

import androidx.fragment.app.C21904OooOoo0;
import java.lang.reflect.Array;
import kotlin.jvm.internal.C24039Oooo0o0;
import o0Oo0o00.o0OOO0o;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33620OooOo;
import oO0o0OO.o0Oo0oo;
import oO0o0Ooo.C33835OooOOo;
import oOO000o.C34329OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f84748OooO00o = 0;

    public static float OooO00o(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float OooO0O0(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static oOO000o.OooO00o OooO0OO(oOO000o.OooO0O0 oooO0O0, C34329OooO0o0 c34329OooO0o0) {
        int i;
        int i2 = oooO0O0.f123238OooO00o;
        int i3 = 1;
        int i4 = 1 << i2;
        int[] iArr = c34329OooO0o0.f123248OooO0OO;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            length = -1;
        }
        int i5 = 0;
        Class cls = Integer.TYPE;
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, length, i4);
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, length, i4);
        int i6 = 0;
        while (i6 < i4) {
            int[] iArr4 = iArr3[0];
            int[] iArr5 = c34329OooO0o0.f123248OooO0OO;
            int i7 = c34329OooO0o0.f123247OooO0O0;
            int iOooO0OO = iArr5[i7];
            int i8 = i7 - i3;
            while (i8 >= 0) {
                iOooO0OO = c34329OooO0o0.f123248OooO0OO[i8] ^ o0OOO0o.OooO0OO(iOooO0OO, i6, c34329OooO0o0.f123246OooO00o.f123239OooO0O0);
                i8--;
                i3 = i3;
            }
            iArr4[i6] = oooO0O0.OooO00o(iOooO0OO);
            i6++;
            i3 = i3;
        }
        int i9 = i3;
        while (true) {
            i = oooO0O0.f123239OooO0O0;
            if (i3 >= length) {
                break;
            }
            for (int i10 = 0; i10 < i4; i10++) {
                iArr3[i3][i10] = o0OOO0o.OooO0OO(iArr3[i3 - 1][i10], i10, i);
            }
            i3++;
        }
        for (int i11 = 0; i11 < length; i11++) {
            for (int i12 = i5; i12 < i4; i12++) {
                int i13 = i5;
                while (i13 <= i11) {
                    int[] iArr6 = iArr2[i11];
                    iArr6[i12] = o0OOO0o.OooO0OO(iArr3[i13][i12], c34329OooO0o0.OooO0Oo((length + i13) - i11), i) ^ iArr6[i12];
                    i13++;
                    i5 = i5;
                }
            }
        }
        int i14 = i5;
        int i15 = i4 + 31;
        int[] iArr7 = new int[2];
        iArr7[i9] = i15 >>> 5;
        iArr7[i14] = length * i2;
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) cls, iArr7);
        for (int i16 = i14; i16 < i4; i16++) {
            int i17 = i16 >>> 5;
            int i18 = i9 << (i16 & 31);
            for (int i19 = i14; i19 < length; i19++) {
                int i20 = iArr2[i19][i16];
                for (int i21 = i14; i21 < i2; i21++) {
                    if (((i20 >>> i21) & 1) != 0) {
                        int[] iArr9 = iArr8[(((i19 + 1) * i2) - i21) - 1];
                        iArr9[i17] = iArr9[i17] ^ i18;
                    }
                }
            }
        }
        oOO000o.OooO00o oooO00o = new oOO000o.OooO00o();
        int[] iArr10 = iArr8[i14];
        if (iArr10.length != (i15 >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        oooO00o.f123235OooO0O0 = i4;
        oooO00o.f123234OooO00o = iArr8.length;
        oooO00o.f123237OooO0Oo = iArr10.length;
        int i22 = (i4 & 31) == 0 ? -1 : (i9 << r1) - 1;
        for (int i23 = i14; i23 < oooO00o.f123234OooO00o; i23++) {
            int[] iArr11 = iArr8[i23];
            int i24 = oooO00o.f123237OooO0Oo - 1;
            iArr11[i24] = iArr11[i24] & i22;
        }
        oooO00o.f123236OooO0OO = iArr8;
        return oooO00o;
    }

    public static int OooO0Oo(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float fOooO00o = OooO00o(((i >> 16) & 255) / 255.0f);
        float fOooO00o2 = OooO00o(((i >> 8) & 255) / 255.0f);
        float fOooO00o3 = OooO00o((i & 255) / 255.0f);
        float fOooO00o4 = OooO00o(((i2 >> 16) & 255) / 255.0f);
        float fOooO00o5 = OooO00o(((i2 >> 8) & 255) / 255.0f);
        float fOooO00o6 = OooO00o((i2 & 255) / 255.0f);
        float fOooO0O0 = OooOO0.OooO0OO.OooO0O0(f3, f2, f, f2);
        float fOooO0O02 = OooOO0.OooO0OO.OooO0O0(fOooO00o4, fOooO00o, f, fOooO00o);
        float fOooO0O03 = OooOO0.OooO0OO.OooO0O0(fOooO00o5, fOooO00o2, f, fOooO00o2);
        float fOooO0O04 = OooOO0.OooO0OO.OooO0O0(fOooO00o6, fOooO00o3, f, fOooO00o3);
        float fOooO0O05 = OooO0O0(fOooO0O02) * 255.0f;
        float fOooO0O06 = OooO0O0(fOooO0O03) * 255.0f;
        return Math.round(OooO0O0(fOooO0O04) * 255.0f) | (Math.round(fOooO0O05) << 16) | (Math.round(fOooO0O0 * 255.0f) << 24) | (Math.round(fOooO0O06) << 8);
    }

    public static final Object OooO0o0(C33835OooOOo c33835OooOOo, C33835OooOOo c33835OooOOo2, InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        Object c33620OooOo;
        Object objOoooO0;
        try {
            if (interfaceC32508OooOOOo == null) {
                c33620OooOo = C21904OooOoo0.OooO0oo(interfaceC32508OooOOOo, c33835OooOOo2, c33835OooOOo);
            } else {
                C24039Oooo0o0.OooO0o0(2, interfaceC32508OooOOOo);
                c33620OooOo = interfaceC32508OooOOOo.invoke(c33835OooOOo2, c33835OooOOo);
            }
        } catch (Throwable th) {
            c33620OooOo = new C33620OooOo(false, th);
        }
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (c33620OooOo == enumC32485OooO00o || (objOoooO0 = c33835OooOOo.OoooO0(c33620OooOo)) == o0Oo0oo.f121383OooO0O0) {
            return enumC32485OooO00o;
        }
        if (objOoooO0 instanceof C33620OooOo) {
            throw ((C33620OooOo) objOoooO0).f121304OooO00o;
        }
        return o0Oo0oo.OooO00o(objOoooO0);
    }
}
