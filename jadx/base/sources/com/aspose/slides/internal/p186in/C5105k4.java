package com.aspose.slides.internal.p186in;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1756ts;
import com.aspose.slides.internal.p042bn.C1758um;
import com.aspose.slides.internal.p075d5.AbstractC3024x1;
import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p197j1.C5157jd;
import com.aspose.slides.internal.p214k0.C5566du;
import com.aspose.slides.internal.p214k0.C5569to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p374qz.C9966k4;
import com.aspose.slides.internal.p441ui.C11317kk;
import com.aspose.slides.internal.p441ui.C11320x1;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.in.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5105k4 extends AbstractC3024x1 {

    /* JADX INFO: renamed from: k4 */
    private C1758um f14065k4;

    /* JADX INFO: renamed from: kk */
    private C11317kk f14066kk = null;

    /* JADX INFO: renamed from: x1 */
    private C1756ts f14067x1;

    /* JADX INFO: renamed from: rv */
    private void m21938rv() {
        if (this.f14066kk == null) {
            this.f14066kk = new C11320x1(this, C5569to.m22895k4()).m54489k4();
        }
    }

    @Override // com.aspose.slides.internal.p436u8.AbstractC11290x1
    public int as_() {
        m21938rv();
        return (mo12733x1() == 2 ? this.f14066kk.m54477x1() : this.f14066kk.m54476kk()).m56681to();
    }

    @Override // com.aspose.slides.internal.p436u8.AbstractC11290x1
    public int at_() {
        m21938rv();
        return (mo12733x1() == 2 ? this.f14066kk.m54477x1() : this.f14066kk.m54476kk()).m56666dy();
    }

    @Override // com.aspose.slides.internal.p436u8.AbstractC11290x1
    /* JADX INFO: renamed from: c5 */
    public float mo21939c5() {
        if (mo12733x1() == 2) {
            return m21940ck().m9431x1() & 65535;
        }
        return 72.0f;
    }

    /* JADX INFO: renamed from: ck */
    public final C1756ts m21940ck() {
        return this.f14067x1;
    }

    @Override // com.aspose.slides.internal.p436u8.AbstractC11290x1
    /* JADX INFO: renamed from: dy */
    public float mo21941dy() {
        if (mo12733x1() == 2) {
            return m21940ck().m9431x1() & 65535;
        }
        return 72.0f;
    }

    /* JADX INFO: renamed from: fa */
    public final float m21942fa() {
        m21938rv();
        return this.f14066kk.m54476kk().m56663c5();
    }

    @Override // com.aspose.slides.internal.p436u8.AbstractC11290x1
    /* JADX INFO: renamed from: h4 */
    public int mo21943h4() {
        m21938rv();
        return (mo12733x1() == 2 ? this.f14066kk.m54477x1() : this.f14066kk.m54476kk()).m56663c5();
    }

    /* JADX INFO: renamed from: jd */
    public final C1758um m21944jd() {
        return this.f14065k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21945k4(C1756ts c1756ts) {
        this.f14067x1 = c1756ts;
    }

    @Override // com.aspose.slides.internal.p075d5.AbstractC3024x1
    /* JADX INFO: renamed from: kk */
    public C12014ne mo12731kk() {
        m21938rv();
        return this.f14066kk.m54476kk();
    }

    /* JADX INFO: renamed from: ks */
    public final C11317kk m21948ks() {
        m21938rv();
        return this.f14066kk;
    }

    @Override // com.aspose.slides.internal.p436u8.AbstractC11290x1
    /* JADX INFO: renamed from: m9 */
    public int mo21949m9() {
        m21938rv();
        return (mo12733x1() == 2 ? this.f14066kk.m54477x1() : this.f14066kk.m54476kk()).m56683x1();
    }

    @Override // com.aspose.slides.internal.p075d5.AbstractC3024x1, com.aspose.slides.internal.p436u8.AbstractC11290x1
    /* JADX INFO: renamed from: to */
    public C12009k4 mo12732to() {
        return new C5566du(this, C5569to.m22895k4()).mo22885to();
    }

    /* JADX INFO: renamed from: up */
    public final float m21950up() {
        m21938rv();
        return this.f14066kk.m54476kk().m56683x1();
    }

    @Override // com.aspose.slides.internal.p075d5.AbstractC3024x1
    /* JADX INFO: renamed from: x1 */
    public int mo12733x1() {
        return (m21940ck() == null || m21940ck().m9425k4().m58224k4() == m21940ck().m9425k4().m58226kk() || m21940ck().m9425k4().m58230x1() == m21940ck().m9425k4().m58228to()) ? 1 : 2;
    }

    /* JADX INFO: renamed from: yj */
    public final C9966k4[] m21951yj() {
        List list = new List();
        IGenericEnumerator<C3023to> it = m12729k4().iterator();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int length = 0;
        int length2 = 0;
        while (it.hasNext()) {
            try {
                C1752sv c1752sv = (C1752sv) it.next();
                if (C7019kk.m27469x1(c1752sv, C5157jd.class)) {
                    C5157jd c5157jd = (C5157jd) C7019kk.m27452k4((Object) c1752sv, C5157jd.class);
                    if (c5157jd.m22047jd()) {
                        if (bArr == null) {
                            bArr = new byte[c5157jd.m22040ck().length];
                        } else {
                            byte[] bArr3 = new byte[bArr.length + c5157jd.m22040ck().length];
                            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                            bArr = bArr3;
                        }
                        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c5157jd.m22040ck()), 0, AbstractC14092to.m67208k4((Object) bArr), length2, c5157jd.m22040ck().length);
                        length2 += c5157jd.m22040ck().length;
                    } else {
                        if (bArr2 == null) {
                            bArr2 = new byte[(int) c5157jd.m22042dy()];
                        }
                        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c5157jd.m22039c5()), 0, AbstractC14092to.m67208k4((Object) bArr2), length, c5157jd.m22039c5().length);
                        length += c5157jd.m22039c5().length;
                        if (length == (c5157jd.m22042dy() & 4294967295L)) {
                            list.addItem((C9966k4) AbstractC3024x1.m12727k4(new C3152yj(bArr2)));
                            bArr2 = null;
                            length = 0;
                        }
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (bArr != null && bArr.length > 0) {
            try {
                list.addItem((C9966k4) AbstractC3024x1.m12727k4(new C3152yj(bArr)));
            } catch (RuntimeException unused) {
            }
        }
        return (C9966k4[]) list.toArray(new C9966k4[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21946k4(C1758um c1758um) {
        this.f14065k4 = c1758um;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21947k4(C11317kk c11317kk) {
        this.f14066kk = c11317kk;
    }
}
