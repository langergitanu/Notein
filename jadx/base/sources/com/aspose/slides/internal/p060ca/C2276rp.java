package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.rp */
/* JADX INFO: loaded from: classes3.dex */
public class C2276rp implements InterfaceC2203mx {

    /* JADX INFO: renamed from: k4 */
    private C2132iq f7835k4;

    /* JADX INFO: renamed from: x1 */
    private C2291sf f7837x1 = null;

    /* JADX INFO: renamed from: kk */
    private C2291sf f7836kk = null;

    public C2276rp(C2132iq c2132iq) {
        this.f7835k4 = c2132iq;
    }

    /* JADX INFO: renamed from: kk */
    private InterfaceC2186m3 m11345kk(int i, int i2) {
        C2409zi c2409zi = (C2409zi) this.f7835k4.m10758x1().m10551ix().m11132kk().m10461k4(i);
        int iM11482k4 = c2409zi.m11482k4();
        if (iM11482k4 == 1) {
            return new C2242pa(c2409zi, i2);
        }
        if (iM11482k4 == 3) {
            return new C2252pu(c2409zi, i2);
        }
        if (iM11482k4 == 4) {
            return new C2298sx(c2409zi, i2);
        }
        if (iM11482k4 == 5) {
            return new C2202mu(c2409zi, i2, this);
        }
        if (iM11482k4 == 6) {
            return new C2321uh(c2409zi, i2, this);
        }
        throw new C2228oa(C14113y2.m67402k4("Unsupported lookup type: {0}", Integer.valueOf(c2409zi.m11482k4())));
    }

    /* JADX INFO: renamed from: x1 */
    private InterfaceC2186m3 m11346x1(int i, int i2) {
        C2124i3 c2124i3 = (C2124i3) this.f7835k4.m10758x1().m10575ne().m10376kk().m10461k4(i);
        int iM11482k4 = c2124i3.m11482k4();
        if (iM11482k4 == 1) {
            return new C2360x2(c2124i3, i2);
        }
        if (iM11482k4 == 2) {
            return new C2114hh(c2124i3, i2);
        }
        if (iM11482k4 == 4) {
            return new C2035cl(c2124i3, i2);
        }
        if (iM11482k4 == 8) {
            return new C2314tx(c2124i3, i2, this);
        }
        throw new C2228oa(C14113y2.m67402k4("Unsupported lookup type: {0}", Integer.valueOf(c2124i3.m11482k4())));
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2203mx
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC2186m3 mo11134k4(int i, int i2) {
        if (i == 0) {
            return m11346x1(i2, i);
        }
        if (i == 1) {
            return m11345kk(i2, i);
        }
        throw new ArgumentOutOfRangeException("FeatType", Integer.valueOf(i), null);
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC2375xt m11347k4(int i) {
        if (i == 0) {
            C2291sf c2291sf = this.f7837x1;
            if (c2291sf != null) {
                return c2291sf;
            }
            C2291sf c2291sf2 = new C2291sf(this.f7835k4.m10758x1().m10575ne().m10956x1(), i, this);
            this.f7837x1 = c2291sf2;
            return c2291sf2;
        }
        if (i != 1) {
            throw new ArgumentOutOfRangeException("featType", Integer.valueOf(i), null);
        }
        C2291sf c2291sf3 = this.f7836kk;
        if (c2291sf3 != null) {
            return c2291sf3;
        }
        C2291sf c2291sf4 = new C2291sf(this.f7835k4.m10758x1().m10551ix().m10956x1(), i, this);
        this.f7836kk = c2291sf4;
        return c2291sf4;
    }
}
