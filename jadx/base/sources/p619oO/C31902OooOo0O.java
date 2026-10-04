package p619oO;

import oOO000oO.C34332OooO00o;
import p619oO.C31894OooO0oO;
import p619oO.OooO;

/* JADX INFO: renamed from: oO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31902OooOo0O {
    public static C31901OooOo0 OooO00o(OooOO0O oooOO0O, OooOOO oooOOO, OooO oooO) {
        double d;
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        int iCeil = oooOO0O.f113644OooO00o.f113653OooO0OO;
        byte[][] bArrOooO0OO = C31904OooOoO.OooO0OO(oooOOO.f113650OooO00o);
        C31901OooOo0[] c31901OooOo0Arr = new C31901OooOo0[bArrOooO0OO.length];
        for (int i5 = 0; i5 < bArrOooO0OO.length; i5++) {
            c31901OooOo0Arr[i5] = new C31901OooOo0(0, bArrOooO0OO[i5]);
        }
        OooO.OooO00o oooO00o = new OooO.OooO00o();
        oooO00o.f113660OooO0O0 = oooO.f113655OooO00o;
        oooO00o.f113661OooO0OO = oooO.f113656OooO0O0;
        oooO00o.f113603OooO0o0 = oooO.f113600OooO0o0;
        oooO00o.f113602OooO0o = 0;
        oooO00o.f113604OooO0oO = oooO.f113601OooO0oO;
        oooO00o.f113662OooO0Oo = oooO.f113658OooO0Oo;
        OooO oooO2 = new OooO(oooO00o);
        while (iCeil > 1) {
            int i6 = 0;
            while (true) {
                d = iCeil / 2;
                int iFloor = (int) Math.floor(d);
                i = oooO2.f113658OooO0Oo;
                i2 = oooO2.f113599OooO0o;
                i3 = oooO2.f113600OooO0o0;
                j = oooO2.f113656OooO0O0;
                i4 = oooO2.f113655OooO00o;
                if (i6 >= iFloor) {
                    break;
                }
                OooO.OooO00o oooO00o2 = new OooO.OooO00o();
                oooO00o2.f113660OooO0O0 = i4;
                oooO00o2.f113661OooO0OO = j;
                oooO00o2.f113603OooO0o0 = i3;
                oooO00o2.f113602OooO0o = i2;
                oooO00o2.f113604OooO0oO = i6;
                oooO00o2.f113662OooO0Oo = i;
                OooO oooO3 = new OooO(oooO00o2);
                int i7 = i6 * 2;
                c31901OooOo0Arr[i6] = OooO0O0(oooOO0O, c31901OooOo0Arr[i7], c31901OooOo0Arr[i7 + 1], oooO3);
                i6++;
                oooO2 = oooO3;
            }
            if (iCeil % 2 == 1) {
                c31901OooOo0Arr[(int) Math.floor(d)] = c31901OooOo0Arr[iCeil - 1];
            }
            iCeil = (int) Math.ceil(((double) iCeil) / 2.0d);
            OooO.OooO00o oooO00o3 = new OooO.OooO00o();
            oooO00o3.f113660OooO0O0 = i4;
            oooO00o3.f113661OooO0OO = j;
            oooO00o3.f113603OooO0o0 = i3;
            oooO00o3.f113602OooO0o = i2 + 1;
            oooO00o3.f113604OooO0oO = oooO2.f113601OooO0oO;
            oooO00o3.f113662OooO0Oo = i;
            oooO2 = new OooO(oooO00o3);
        }
        return c31901OooOo0Arr[0];
    }

    public static C31901OooOo0 OooO0O0(OooOO0O oooOO0O, C31901OooOo0 c31901OooOo0, C31901OooOo0 c31901OooOo02, OooOOOO oooOOOO) {
        if (c31901OooOo0 == null) {
            throw new NullPointerException("left == null");
        }
        if (c31901OooOo02 == null) {
            throw new NullPointerException("right == null");
        }
        int i = c31901OooOo02.f113700OooOo0o;
        int i2 = c31901OooOo0.f113700OooOo0o;
        if (i2 != i) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        byte[] bArrOooO00o = C34332OooO00o.OooO00o(oooOO0O.f113647OooO0Oo);
        if (oooOOOO instanceof OooO) {
            OooO oooO = (OooO) oooOOOO;
            OooO.OooO00o oooO00o = new OooO.OooO00o();
            oooO00o.f113660OooO0O0 = oooO.f113655OooO00o;
            oooO00o.f113661OooO0OO = oooO.f113656OooO0O0;
            oooO00o.f113603OooO0o0 = oooO.f113600OooO0o0;
            oooO00o.f113602OooO0o = oooO.f113599OooO0o;
            oooO00o.f113604OooO0oO = oooO.f113601OooO0oO;
            oooO00o.f113662OooO0Oo = 0;
            oooOOOO = new OooO(oooO00o);
        } else if (oooOOOO instanceof C31894OooO0oO) {
            C31894OooO0oO c31894OooO0oO = (C31894OooO0oO) oooOOOO;
            C31894OooO0oO.OooO00o oooO00o2 = new C31894OooO0oO.OooO00o();
            oooO00o2.f113660OooO0O0 = c31894OooO0oO.f113655OooO00o;
            oooO00o2.f113661OooO0OO = c31894OooO0oO.f113656OooO0O0;
            oooO00o2.f113635OooO0o0 = c31894OooO0oO.f113633OooO0o0;
            oooO00o2.f113634OooO0o = c31894OooO0oO.f113632OooO0o;
            oooO00o2.f113662OooO0Oo = 0;
            oooOOOO = new C31894OooO0oO(oooO00o2);
        }
        byte[] bArrOooO00o2 = oooOOOO.OooO00o();
        C31895OooO0oo c31895OooO0oo = oooOO0O.f113645OooO0O0;
        byte[] bArrOooO00o3 = c31895OooO0oo.OooO00o(bArrOooO00o, bArrOooO00o2);
        if (oooOOOO instanceof OooO) {
            OooO oooO2 = (OooO) oooOOOO;
            OooO.OooO00o oooO00o3 = new OooO.OooO00o();
            oooO00o3.f113660OooO0O0 = oooO2.f113655OooO00o;
            oooO00o3.f113661OooO0OO = oooO2.f113656OooO0O0;
            oooO00o3.f113603OooO0o0 = oooO2.f113600OooO0o0;
            oooO00o3.f113602OooO0o = oooO2.f113599OooO0o;
            oooO00o3.f113604OooO0oO = oooO2.f113601OooO0oO;
            oooO00o3.f113662OooO0Oo = 1;
            oooOOOO = new OooO(oooO00o3);
        } else if (oooOOOO instanceof C31894OooO0oO) {
            C31894OooO0oO c31894OooO0oO2 = (C31894OooO0oO) oooOOOO;
            C31894OooO0oO.OooO00o oooO00o4 = new C31894OooO0oO.OooO00o();
            oooO00o4.f113660OooO0O0 = c31894OooO0oO2.f113655OooO00o;
            oooO00o4.f113661OooO0OO = c31894OooO0oO2.f113656OooO0O0;
            oooO00o4.f113635OooO0o0 = c31894OooO0oO2.f113633OooO0o0;
            oooO00o4.f113634OooO0o = c31894OooO0oO2.f113632OooO0o;
            oooO00o4.f113662OooO0Oo = 1;
            oooOOOO = new C31894OooO0oO(oooO00o4);
        }
        byte[] bArrOooO00o4 = c31895OooO0oo.OooO00o(bArrOooO00o, oooOOOO.OooO00o());
        if (oooOOOO instanceof OooO) {
            OooO oooO3 = (OooO) oooOOOO;
            OooO.OooO00o oooO00o5 = new OooO.OooO00o();
            oooO00o5.f113660OooO0O0 = oooO3.f113655OooO00o;
            oooO00o5.f113661OooO0OO = oooO3.f113656OooO0O0;
            oooO00o5.f113603OooO0o0 = oooO3.f113600OooO0o0;
            oooO00o5.f113602OooO0o = oooO3.f113599OooO0o;
            oooO00o5.f113604OooO0oO = oooO3.f113601OooO0oO;
            oooO00o5.f113662OooO0Oo = 2;
            oooOOOO = new OooO(oooO00o5);
        } else if (oooOOOO instanceof C31894OooO0oO) {
            C31894OooO0oO c31894OooO0oO3 = (C31894OooO0oO) oooOOOO;
            C31894OooO0oO.OooO00o oooO00o6 = new C31894OooO0oO.OooO00o();
            oooO00o6.f113660OooO0O0 = c31894OooO0oO3.f113655OooO00o;
            oooO00o6.f113661OooO0OO = c31894OooO0oO3.f113656OooO0O0;
            oooO00o6.f113635OooO0o0 = c31894OooO0oO3.f113633OooO0o0;
            oooO00o6.f113634OooO0o = c31894OooO0oO3.f113632OooO0o;
            oooO00o6.f113662OooO0Oo = 2;
            oooOOOO = new C31894OooO0oO(oooO00o6);
        }
        byte[] bArrOooO00o5 = c31895OooO0oo.OooO00o(bArrOooO00o, oooOOOO.OooO00o());
        int i3 = oooOO0O.f113644OooO00o.f113651OooO00o;
        int i4 = i3 * 2;
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i3; i5++) {
            bArr[i5] = (byte) (C31904OooOoO.OooO0O0(c31901OooOo0.f113699OooOo)[i5] ^ bArrOooO00o4[i5]);
        }
        for (int i6 = 0; i6 < i3; i6++) {
            bArr[i6 + i3] = (byte) (C31904OooOoO.OooO0O0(c31901OooOo02.f113699OooOo)[i6] ^ bArrOooO00o5[i6]);
        }
        int length = bArrOooO00o3.length;
        int i7 = c31895OooO0oo.f113637OooO0O0;
        if (length != i7) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (i4 == i7 * 2) {
            return new C31901OooOo0(i2, c31895OooO0oo.OooO0O0(1, bArrOooO00o3, bArr));
        }
        throw new IllegalArgumentException("wrong in length");
    }
}
