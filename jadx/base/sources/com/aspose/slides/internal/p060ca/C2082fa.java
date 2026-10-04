package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.fa */
/* JADX INFO: loaded from: classes3.dex */
public class C2082fa extends AbstractC2281rv implements InterfaceC2067eg {

    /* JADX INFO: renamed from: du */
    private C2142jd f7196du;

    /* JADX INFO: renamed from: h4 */
    private List<Byte> f7197h4;

    /* JADX INFO: renamed from: m9 */
    private Stack<Double> f7198m9;

    public C2082fa(C2120hx c2120hx, AbstractC2281rv abstractC2281rv) {
        super(c2120hx, abstractC2281rv);
        this.f7515x1 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("dup")};
        this.f7511k4 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("|\r"), AbstractC6747ar.m26650yj().mo26677to("|\n"), AbstractC6747ar.m26650yj().mo26677to("NP\r"), AbstractC6747ar.m26650yj().mo26677to("NP\n"), AbstractC6747ar.m26650yj().mo26677to("put\r"), AbstractC6747ar.m26650yj().mo26677to("put\n"), AbstractC6747ar.m26650yj().mo26677to("put")};
        m10978k4(new AbstractC2167ks[]{new C2144jf(this, c2120hx.m10701k4()), new C2369xi(this, c2120hx.m10701k4()), new C2391yl(c2120hx, this)});
    }

    /* JADX INFO: renamed from: k4 */
    public final C2142jd m10516k4() {
        return this.f7196du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        this.f7198m9 = new Stack<>();
        this.f7196du = new C2142jd();
        this.f7197h4 = new List<>();
        super.mo10227kk();
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2067eg
    /* JADX INFO: renamed from: x1 */
    public final Stack<Double> mo10228x1() {
        return this.f7198m9;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        this.f7197h4.addItem(Byte.valueOf(this.f7514to[i]));
        super.mo10225k4(i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks, com.aspose.slides.internal.p060ca.InterfaceC2191m8
    /* JADX INFO: renamed from: k4 */
    public void mo10226k4(Object obj) {
        C2144jf c2144jf = (C2144jf) C7019kk.m27452k4(obj, C2144jf.class);
        if (c2144jf != null) {
            if (this.f7196du.m10818x1() == Integer.MIN_VALUE) {
                this.f7196du.m10815k4(C7019kk.m27462to(Double.valueOf(c2144jf.m10840k4()), 14));
            }
            mo10228x1().push(Double.valueOf(c2144jf.m10840k4()));
        } else {
            C2391yl c2391yl = (C2391yl) C7019kk.m27452k4(obj, C2391yl.class);
            if (c2391yl != null) {
                this.f7196du.m10816k4(c2391yl.m11774x6());
            } else {
                C2369xi c2369xi = (C2369xi) C7019kk.m27452k4(obj, C2369xi.class);
                if (c2369xi != null) {
                    this.f7196du.m10816k4(AbstractC6747ar.m26650yj().mo26677to(c2369xi.m11681k4()));
                }
            }
        }
        super.mo10226k4(obj);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public byte[] mo10279k4(int i, int[] iArr) {
        C2142jd c2142jd;
        int i2;
        byte[] bArrMo10279k4 = super.mo10279k4(i, iArr);
        if (bArrMo10279k4 == null) {
            return bArrMo10279k4;
        }
        if (C2266qq.m11312k4(bArrMo10279k4, AbstractC6747ar.m26650yj().mo26677to("|\r")) || C2266qq.m11312k4(bArrMo10279k4, AbstractC6747ar.m26650yj().mo26677to("|\n")) || C2266qq.m11312k4(bArrMo10279k4, AbstractC6747ar.m26650yj().mo26677to("NP\r")) || C2266qq.m11312k4(bArrMo10279k4, AbstractC6747ar.m26650yj().mo26677to("NP\n"))) {
            c2142jd = this.f7196du;
            i2 = 3;
        } else {
            c2142jd = this.f7196du;
            i2 = 2;
        }
        c2142jd.m10819x1(i2);
        return bArrMo10279k4;
    }
}
