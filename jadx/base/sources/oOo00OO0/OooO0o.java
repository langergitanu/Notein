package oOo00OO0;

import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00O0o0.C32192OooOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O00oo.C32520OooO0oo;
import oO0O00oo.OooO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo000;
import oOo00OO0.C34479OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long[] f123559OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f123560OooO0O0;

    public static final class OooO00o extends OooOOOO implements InterfaceC32507OooOO0o<C32192OooOo0, Integer> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f123561OooOo0o = new OooO00o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Integer invoke(C32192OooOo0 c32192OooOo0) {
            C32192OooOo0 it = c32192OooOo0;
            OooOOO0.OooO0oO(it, "it");
            return Integer.valueOf(it.f115542OooO00o.length());
        }
    }

    public static final class OooO0O0 extends OooOOOO implements InterfaceC32508OooOOOo<C32192OooOo0, Integer, Character> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f123562OooOo0o = new OooO0O0(2);

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Character invoke(C32192OooOo0 c32192OooOo0, Integer num) {
            C32192OooOo0 m = c32192OooOo0;
            int iIntValue = num.intValue();
            OooOOO0.OooO0oO(m, "m");
            return Character.valueOf(m.f115542OooO00o.charAt(iIntValue));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[PHI: r7
      0x0049: PHI (r7v2 long) = (r7v1 long), (r7v0 long) binds: [B:18:0x0057, B:13:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        long j;
        C34479OooO0OO.OooO00o.OooO00o(C32192OooOo0.f115541OooO0o0, OooO00o.f123561OooOo0o, OooO0O0.f123562OooOo0o);
        OooO oooO = new OooO(0, 255, 1);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(oooO, 10));
        Iterator<Integer> it = oooO.iterator();
        while (((C32520OooO0oo) it).f116817OooOoO0) {
            int iNextInt = ((Oooo000) it).nextInt();
            if (48 > iNextInt || iNextInt >= 58) {
                long j2 = iNextInt;
                long j3 = 97;
                if (j2 < 97 || j2 > 102) {
                    j3 = 65;
                    j = (j2 < 65 || j2 > 70) ? -1L : (j2 - j3) + ((long) 10);
                }
            } else {
                j = ((long) iNextInt) - 48;
            }
            arrayList.add(Long.valueOf(j));
        }
        f123559OooO00o = OooOo.o0ooOOo(arrayList);
        OooO oooO2 = new OooO(0, 15, 1);
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(oooO2, 10));
        Iterator<Integer> it2 = oooO2.iterator();
        while (((C32520OooO0oo) it2).f116817OooOoO0) {
            int iNextInt2 = ((Oooo000) it2).nextInt();
            arrayList2.add(Byte.valueOf((byte) (iNextInt2 < 10 ? iNextInt2 + 48 : (char) (((char) (iNextInt2 + 97)) - '\n'))));
        }
        f123560OooO0O0 = OooOo.o00o0O(arrayList2);
    }

    public static boolean OooO00o(CharSequence charSequence, String str) {
        int length = charSequence.length();
        OooOOO0.OooO0oO(charSequence, "<this>");
        if (length == str.length()) {
            for (int i = 0; i < length; i++) {
                int iCharAt = charSequence.charAt(i);
                if (65 <= iCharAt && iCharAt < 91) {
                    iCharAt += 32;
                }
                int iCharAt2 = str.charAt(i);
                if (65 <= iCharAt2 && iCharAt2 < 91) {
                    iCharAt2 += 32;
                }
                if (iCharAt == iCharAt2) {
                }
            }
            return true;
        }
        return false;
    }

    public static final int OooO0O0(CharSequence charSequence, int i, int i2) {
        OooOOO0.OooO0oO(charSequence, "<this>");
        int i3 = 0;
        while (i < i2) {
            int iCharAt = charSequence.charAt(i);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            i3 = (i3 * 31) + iCharAt;
            i++;
        }
        return i3;
    }

    public static final long OooO0OO(StringBuilder sb) {
        int length = sb.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            int iCharAt = sb.charAt(i) & 65535;
            long j2 = iCharAt < 255 ? f123559OooO00o[iCharAt] : -1L;
            if (j2 == -1) {
                throw new NumberFormatException("Invalid HEX number: " + ((Object) sb) + ", wrong digit: " + sb.charAt(i));
            }
            j = (j << 4) | j2;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0Oo(InterfaceC23990Oooooo interfaceC23990Oooooo, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C34482OooO0oO c34482OooO0oO;
        int i2;
        byte[] bArr;
        if (abstractC32479OooO0OO instanceof C34482OooO0oO) {
            c34482OooO0oO = (C34482OooO0oO) abstractC32479OooO0OO;
            int i3 = c34482OooO0oO.f123569OooOoo0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c34482OooO0oO.f123569OooOoo0 = i3 - Integer.MIN_VALUE;
            } else {
                c34482OooO0oO = new C34482OooO0oO(abstractC32479OooO0OO);
            }
        }
        Object obj = c34482OooO0oO.f123568OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c34482OooO0oO.f123569OooOoo0;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (i <= 0) {
                throw new IllegalArgumentException("Does only work for positive numbers");
            }
            int i5 = 0;
            while (true) {
                i2 = i5 + 1;
                bArr = f123560OooO0O0;
                if (i5 < 8) {
                    int i6 = i >>> 28;
                    i <<= 4;
                    if (i6 != 0) {
                        byte b = bArr[i6];
                        c34482OooO0oO.f123565OooOo0o = interfaceC23990Oooooo;
                        c34482OooO0oO.f123564OooOo = bArr;
                        c34482OooO0oO.f123567OooOoO0 = i;
                        c34482OooO0oO.f123566OooOoO = i2;
                        c34482OooO0oO.f123569OooOoo0 = 1;
                        if (interfaceC23990Oooooo.OooO0o0(b, c34482OooO0oO) != enumC32485OooO00o) {
                        }
                    } else {
                        i5 = i2;
                    }
                }
            }
            return enumC32485OooO00o;
        }
        if (i4 != 1 && i4 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i7 = c34482OooO0oO.f123566OooOoO;
        i = c34482OooO0oO.f123567OooOoO0;
        byte[] bArr2 = c34482OooO0oO.f123564OooOo;
        InterfaceC23990Oooooo interfaceC23990Oooooo2 = c34482OooO0oO.f123565OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        bArr = bArr2;
        i2 = i7;
        interfaceC23990Oooooo = interfaceC23990Oooooo2;
        while (true) {
            int i8 = i2 + 1;
            if (i2 >= 8) {
                return C32460OooOooO.f116667OooO00o;
            }
            int i9 = i >>> 28;
            i <<= 4;
            byte b2 = bArr[i9];
            c34482OooO0oO.f123565OooOo0o = interfaceC23990Oooooo;
            c34482OooO0oO.f123564OooOo = bArr;
            c34482OooO0oO.f123567OooOoO0 = i;
            c34482OooO0oO.f123566OooOoO = i8;
            c34482OooO0oO.f123569OooOoo0 = 2;
            if (interfaceC23990Oooooo.OooO0o0(b2, c34482OooO0oO) == enumC32485OooO00o) {
                break;
            }
            i2 = i8;
        }
        return enumC32485OooO00o;
    }
}
