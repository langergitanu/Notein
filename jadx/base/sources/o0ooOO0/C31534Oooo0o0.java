package o0ooOO0;

import o00000.C24070Oooo0o0;
import o00000.InterfaceC24062OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0ooOO0.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31534Oooo0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f112729OooO00o = OooO00o.f112730OooOo0o;

    /* JADX INFO: renamed from: o0ooOO0.Oooo0o0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC24062OooOooO, C24070Oooo0o0> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f112730OooOo0o = new OooO00o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C24070Oooo0o0 invoke(InterfaceC24062OooOooO interfaceC24062OooOooO) {
            InterfaceC24062OooOooO it = interfaceC24062OooOooO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return new C24070Oooo0o0(it);
        }
    }

    public static final void OooO00o(float[] fArr, float[] fArr2) {
        float fOooO0O0 = OooO0O0(fArr2, 0, fArr, 0);
        float fOooO0O02 = OooO0O0(fArr2, 0, fArr, 1);
        float fOooO0O03 = OooO0O0(fArr2, 0, fArr, 2);
        float fOooO0O04 = OooO0O0(fArr2, 0, fArr, 3);
        float fOooO0O05 = OooO0O0(fArr2, 1, fArr, 0);
        float fOooO0O06 = OooO0O0(fArr2, 1, fArr, 1);
        float fOooO0O07 = OooO0O0(fArr2, 1, fArr, 2);
        float fOooO0O08 = OooO0O0(fArr2, 1, fArr, 3);
        float fOooO0O09 = OooO0O0(fArr2, 2, fArr, 0);
        float fOooO0O010 = OooO0O0(fArr2, 2, fArr, 1);
        float fOooO0O011 = OooO0O0(fArr2, 2, fArr, 2);
        float fOooO0O012 = OooO0O0(fArr2, 2, fArr, 3);
        float fOooO0O013 = OooO0O0(fArr2, 3, fArr, 0);
        float fOooO0O014 = OooO0O0(fArr2, 3, fArr, 1);
        float fOooO0O015 = OooO0O0(fArr2, 3, fArr, 2);
        float fOooO0O016 = OooO0O0(fArr2, 3, fArr, 3);
        fArr[0] = fOooO0O0;
        fArr[1] = fOooO0O02;
        fArr[2] = fOooO0O03;
        fArr[3] = fOooO0O04;
        fArr[4] = fOooO0O05;
        fArr[5] = fOooO0O06;
        fArr[6] = fOooO0O07;
        fArr[7] = fOooO0O08;
        fArr[8] = fOooO0O09;
        fArr[9] = fOooO0O010;
        fArr[10] = fOooO0O011;
        fArr[11] = fOooO0O012;
        fArr[12] = fOooO0O013;
        fArr[13] = fOooO0O014;
        fArr[14] = fOooO0O015;
        fArr[15] = fOooO0O016;
    }

    public static final float OooO0O0(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }
}
