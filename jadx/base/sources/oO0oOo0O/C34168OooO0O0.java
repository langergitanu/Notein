package oO0oOo0O;

import java.math.BigInteger;
import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.C34066Oooooo0;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.OooOo00;
import oO0ooO0.AbstractC34262OooO0O0;
import oO0ooO0.AbstractC34265OooO0Oo;
import oO0ooO0.InterfaceC34261OooO00o;
import oO0ooO0O.AbstractC34270OooO0O0;
import oO0ooO0O.C34272OooO0Oo;
import oO0ooO0O.C34273OooO0o0;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oOo0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34168OooO0O0 extends OooOo00 implements InterfaceC34171OooO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final BigInteger f122775OooOo0o = BigInteger.valueOf(1);

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C34168OooO0O0 OooO0oo(AbstractC34039OooOooO abstractC34039OooOooO) {
        C34172OooO0o0 c34172OooO0o0;
        int iOooOo0;
        int iOooOo02;
        int iOooOo03;
        C34272OooO0Oo c34272OooO0OoOooO00o;
        AbstractC34262OooO0O0 abstractC34262OooO0O0;
        C34273OooO0o0 c34273OooO0o0;
        if (abstractC34039OooOooO == null) {
            return null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooO);
        C34168OooO0O0 c34168OooO0O0 = new C34168OooO0O0();
        if (!(abstractC34039OooOooOOooOOoo.OooOo0(0) instanceof C34029OooOOo0) || !((C34029OooOOo0) abstractC34039OooOooOOooOOoo.OooOo0(0)).OooOOoo(1)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        ((C34029OooOOo0) abstractC34039OooOooOOooOOoo.OooOo0(4)).OooOOo();
        if (abstractC34039OooOooOOooOOoo.size() == 6) {
            ((C34029OooOOo0) abstractC34039OooOooOOooOOoo.OooOo0(5)).OooOOo();
        }
        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo0 = abstractC34039OooOooOOooOOoo.OooOo0(1);
        if (interfaceC34019OooO0oOOooOo0 instanceof C34172OooO0o0) {
            c34172OooO0o0 = (C34172OooO0o0) interfaceC34019OooO0oOOooOo0;
        } else if (interfaceC34019OooO0oOOooOo0 != null) {
            AbstractC34039OooOooO abstractC34039OooOooOOooOOoo2 = AbstractC34039OooOooO.OooOOoo(interfaceC34019OooO0oOOooOo0);
            C34172OooO0o0 c34172OooO0o02 = new C34172OooO0o0();
            c34172OooO0o02.f122793OooOo0o = C34032OooOo0O.OooOo0(abstractC34039OooOooOOooOOoo2.OooOo0(0));
            c34172OooO0o02.f122792OooOo = abstractC34039OooOooOOooOOoo2.OooOo0(1).OooO0o();
            c34172OooO0o0 = c34172OooO0o02;
        } else {
            c34172OooO0o0 = null;
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo3 = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooOOooOOoo.OooOo0(2));
        C34167OooO00o c34167OooO00o = new C34167OooO00o();
        c34167OooO00o.f122774OooOoO0 = null;
        C34032OooOo0O c34032OooOo0O = c34172OooO0o0.f122793OooOo0o;
        c34167OooO00o.f122774OooOoO0 = c34032OooOo0O;
        boolean zOooOO0o = c34032OooOo0O.OooOO0o(InterfaceC34171OooO0o.f122779OooO0oo);
        AbstractC34036OooOoOO abstractC34036OooOoOO = c34172OooO0o0.f122792OooOo;
        if (zOooOO0o) {
            BigInteger bigIntegerOooOOo = ((C34029OooOOo0) abstractC34036OooOoOO).OooOOo();
            BigInteger bigInteger = new BigInteger(1, AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooOOooOOoo3.OooOo0(0)).f122362OooOo0o);
            BigInteger bigInteger2 = new BigInteger(1, AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooOOooOOoo3.OooOo0(1)).f122362OooOo0o);
            C34273OooO0o0 c34273OooO0o02 = AbstractC34270OooO0O0.f123048OooO00o;
            int iBitLength = bigIntegerOooOOo.bitLength();
            if (bigIntegerOooOOo.signum() <= 0 || iBitLength < 2) {
                throw new IllegalArgumentException("'characteristic' must be >= 2");
            }
            if (iBitLength >= 3) {
                c34273OooO0o0 = new C34273OooO0o0(bigIntegerOooOOo);
                AbstractC34262OooO0O0.C34263OooO0Oo c34263OooO0Oo = new AbstractC34262OooO0O0.C34263OooO0Oo(c34273OooO0o0);
                c34263OooO0Oo.f123020OooO0o0 = bigIntegerOooOOo;
                int iBitLength2 = bigIntegerOooOOo.bitLength();
                c34263OooO0Oo.f123019OooO0o = (iBitLength2 >= 96 || bigIntegerOooOOo.shiftRight(iBitLength2 + (-64)).longValue() != -1) ? null : InterfaceC34261OooO00o.f123009OooO0O0.shiftLeft(iBitLength2).subtract(bigIntegerOooOOo);
                c34263OooO0Oo.f123021OooO0oO = new AbstractC34265OooO0Oo.C20347OooO0Oo(c34263OooO0Oo, null, null);
                c34263OooO0Oo.f123011OooO0O0 = c34263OooO0Oo.OooO0Oo(bigInteger);
                c34263OooO0Oo.f123012OooO0OO = c34263OooO0Oo.OooO0Oo(bigInteger2);
                c34263OooO0Oo.f123013OooO0Oo = 4;
                abstractC34262OooO0O0 = c34263OooO0Oo;
            } else {
                int iIntValue = bigIntegerOooOOo.intValue();
                if (iIntValue == 2) {
                    c34273OooO0o0 = AbstractC34270OooO0O0.f123048OooO00o;
                } else if (iIntValue == 3) {
                    c34273OooO0o0 = AbstractC34270OooO0O0.f123049OooO0O0;
                }
                AbstractC34262OooO0O0.C34263OooO0Oo c34263OooO0Oo2 = new AbstractC34262OooO0O0.C34263OooO0Oo(c34273OooO0o0);
                c34263OooO0Oo2.f123020OooO0o0 = bigIntegerOooOOo;
                int iBitLength22 = bigIntegerOooOOo.bitLength();
                if (iBitLength22 >= 96) {
                    c34263OooO0Oo2.f123019OooO0o = (iBitLength22 >= 96 || bigIntegerOooOOo.shiftRight(iBitLength22 + (-64)).longValue() != -1) ? null : InterfaceC34261OooO00o.f123009OooO0O0.shiftLeft(iBitLength22).subtract(bigIntegerOooOOo);
                    c34263OooO0Oo2.f123021OooO0oO = new AbstractC34265OooO0Oo.C20347OooO0Oo(c34263OooO0Oo2, null, null);
                    c34263OooO0Oo2.f123011OooO0O0 = c34263OooO0Oo2.OooO0Oo(bigInteger);
                    c34263OooO0Oo2.f123012OooO0OO = c34263OooO0Oo2.OooO0Oo(bigInteger2);
                    c34263OooO0Oo2.f123013OooO0Oo = 4;
                    abstractC34262OooO0O0 = c34263OooO0Oo2;
                }
            }
        } else {
            if (!c34167OooO00o.f122774OooOoO0.OooOO0o(InterfaceC34171OooO0o.f122778OooO)) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            AbstractC34039OooOooO abstractC34039OooOooOOooOOoo4 = AbstractC34039OooOooO.OooOOoo(abstractC34036OooOoOO);
            int iOooOo04 = ((C34029OooOOo0) abstractC34039OooOooOOooOOoo4.OooOo0(0)).OooOo0();
            C34032OooOo0O c34032OooOo0O2 = (C34032OooOo0O) abstractC34039OooOooOOooOOoo4.OooOo0(1);
            if (c34032OooOo0O2.OooOO0o(InterfaceC34171OooO0o.f122780OooOO0)) {
                iOooOo03 = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo4.OooOo0(2)).OooOo0();
                iOooOo02 = 0;
                iOooOo0 = 0;
            } else {
                if (!c34032OooOo0O2.OooOO0o(InterfaceC34171OooO0o.f122781OooOO0O)) {
                    throw new IllegalArgumentException("This type of EC basis is not implemented");
                }
                AbstractC34039OooOooO abstractC34039OooOooOOooOOoo5 = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooOOooOOoo4.OooOo0(2));
                int iOooOo05 = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo5.OooOo0(0)).OooOo0();
                iOooOo0 = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo5.OooOo0(1)).OooOo0();
                iOooOo02 = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo5.OooOo0(2)).OooOo0();
                iOooOo03 = iOooOo05;
            }
            BigInteger bigInteger3 = new BigInteger(1, AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooOOooOOoo3.OooOo0(0)).f122362OooOo0o);
            BigInteger bigInteger4 = new BigInteger(1, AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooOOooOOoo3.OooOo0(1)).f122362OooOo0o);
            if (iOooOo03 == 0) {
                throw new IllegalArgumentException("k1 must be > 0");
            }
            if (iOooOo0 == 0) {
                if (iOooOo02 != 0) {
                    throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
                }
                c34272OooO0OoOooO00o = AbstractC34270OooO0O0.OooO00o(new int[]{0, iOooOo03, iOooOo04});
            } else {
                if (iOooOo0 <= iOooOo03) {
                    throw new IllegalArgumentException("k2 must be > k1");
                }
                if (iOooOo02 <= iOooOo0) {
                    throw new IllegalArgumentException("k3 must be > k2");
                }
                c34272OooO0OoOooO00o = AbstractC34270OooO0O0.OooO00o(new int[]{0, iOooOo03, iOooOo0, iOooOo02, iOooOo04});
            }
            AbstractC34262OooO0O0.OooO0OO oooO0OO = new AbstractC34262OooO0O0.OooO0OO(c34272OooO0OoOooO00o);
            oooO0OO.f123016OooO0o0 = iOooOo04;
            oooO0OO.f123015OooO0o = iOooOo03;
            oooO0OO.f123017OooO0oO = iOooOo0;
            oooO0OO.f123018OooO0oo = iOooOo02;
            oooO0OO.f123014OooO = new AbstractC34265OooO0Oo.OooO0OO(oooO0OO, null, null);
            oooO0OO.f123011OooO0O0 = oooO0OO.OooO0Oo(bigInteger3);
            oooO0OO.f123012OooO0OO = oooO0OO.OooO0Oo(bigInteger4);
            oooO0OO.f123013OooO0Oo = 6;
            abstractC34262OooO0O0 = oooO0OO;
        }
        c34167OooO00o.f122773OooOo0o = abstractC34262OooO0O0;
        if (abstractC34039OooOooOOooOOoo3.size() == 3) {
            c34167OooO00o.f122772OooOo = ((C34066Oooooo0) abstractC34039OooOooOOooOOoo3.OooOo0(2)).OooOOo();
        }
        InterfaceC34019OooO0oO interfaceC34019OooO0oOOooOo02 = abstractC34039OooOooOOooOOoo.OooOo0(3);
        if (!(interfaceC34019OooO0oOOooOo02 instanceof C34169OooO0OO)) {
            new C34169OooO0OO((AbstractC34033OooOo0o) interfaceC34019OooO0oOOooOo02);
        }
        C34332OooO00o.OooO00o(c34167OooO00o.f122772OooOo);
        return c34168OooO0O0;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo(6);
        c34020OooO0oo.OooO00o(new C34029OooOOo0(f122775OooOo0o));
        c34020OooO0oo.OooO00o(null);
        throw null;
    }
}
