package com.aspose.slides.internal.p454v0;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p086dl.C3180k4;
import com.aspose.slides.internal.p123f5.C3858kk;
import com.aspose.slides.internal.p123f5.C3861x1;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4051ts;
import com.aspose.slides.internal.p132fj.C4053um;
import com.aspose.slides.internal.p146g9.C4227du;
import com.aspose.slides.internal.p146g9.C4230to;
import com.aspose.slides.internal.p216k2.C5575kk;
import com.aspose.slides.internal.p298nh.AbstractC6890h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.internal.p543z9.C13464ck;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.v0.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11600k4 extends AbstractC12536x1 {

    /* JADX INFO: renamed from: k4 */
    private C4053um f39162k4;

    /* JADX INFO: renamed from: kk */
    private C3858kk f39163kk = null;

    /* JADX INFO: renamed from: x1 */
    private C4051ts f39164x1;

    /* JADX INFO: renamed from: ne */
    private void m54627ne() {
        if (this.f39163kk == null) {
            this.f39163kk = new C3861x1(this, C4230to.m17042x1()).m15563k4();
        }
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: E_ */
    public int mo13497E_() {
        m54627ne();
        return (mo13625x1() == 2 ? this.f39163kk.m15550x1() : this.f39163kk.m15549to()).m56681to();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: F_ */
    public int mo13498F_() {
        m54627ne();
        return (mo13625x1() == 2 ? this.f39163kk.m15550x1() : this.f39163kk.m15549to()).m56666dy();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: a_ */
    public void mo13499a_(AbstractC3150x6 abstractC3150x6) {
        new C5575kk(abstractC3150x6).m22907x1(this);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: c5 */
    public float mo13500c5() {
        if (mo13625x1() != 2 || (m54629fa().m16096kk() & 65535) <= 0) {
            return 72.0f;
        }
        return m54629fa().m16096kk() & 65535;
    }

    /* JADX INFO: renamed from: ck */
    public final C4053um m54628ck() {
        return this.f39162k4;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: dy */
    public float mo13501dy() {
        if (mo13625x1() != 2 || (m54629fa().m16096kk() & 65535) <= 0) {
            return 72.0f;
        }
        return m54629fa().m16096kk() & 65535;
    }

    /* JADX INFO: renamed from: fa */
    public final C4051ts m54629fa() {
        return this.f39164x1;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: h4 */
    public int mo13502h4() {
        m54627ne();
        return ((mo13625x1() == 2 || mo13625x1() == 1) ? this.f39163kk.m15550x1() : this.f39163kk.m15549to()).m56663c5();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: jd */
    public AbstractC6890h4 mo13503jd() {
        throw new NotSupportedException("Unable to create graphics from wmf metafile.");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54630k4(C3858kk c3858kk) {
        this.f39163kk = c3858kk;
    }

    @Override // com.aspose.slides.internal.p500xi.AbstractC12536x1
    /* JADX INFO: renamed from: kk */
    public C12014ne mo13623kk() {
        m54627ne();
        return this.f39163kk.m15549to();
    }

    /* JADX INFO: renamed from: ks */
    public final C3180k4[] m54633ks() {
        List list = new List();
        IGenericEnumerator<C12535to> it = m58364k4().iterator();
        byte[] bArr = null;
        byte[] bArr2 = null;
        int length = 0;
        int length2 = 0;
        while (it.hasNext()) {
            try {
                C4047sv c4047sv = (C4047sv) it.next();
                if (C7019kk.m27469x1(c4047sv, C13464ck.class)) {
                    C13464ck c13464ck = (C13464ck) C7019kk.m27452k4((Object) c4047sv, C13464ck.class);
                    if (c13464ck.m62625ix()) {
                        if (bArr == null) {
                            bArr = new byte[c13464ck.m62637u4().length];
                        } else {
                            byte[] bArr3 = new byte[bArr.length + c13464ck.m62637u4().length];
                            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                            bArr = bArr3;
                        }
                        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c13464ck.m62637u4()), 0, AbstractC14092to.m67208k4((Object) bArr), length2, c13464ck.m62637u4().length);
                        length2 += c13464ck.m62637u4().length;
                    } else {
                        if (bArr2 == null) {
                            bArr2 = new byte[(int) c13464ck.m62622fa()];
                        }
                        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c13464ck.m62638up()), 0, AbstractC14092to.m67208k4((Object) bArr2), length, c13464ck.m62638up().length);
                        length += c13464ck.m62638up().length;
                        if (length == (c13464ck.m62622fa() & 4294967295L)) {
                            list.addItem((C3180k4) AbstractC12536x1.m58363k4(new C3152yj(bArr2)));
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
                list.addItem((C3180k4) AbstractC12536x1.m58363k4(new C3152yj(bArr)));
            } catch (RuntimeException unused) {
            }
        }
        return (C3180k4[]) list.toArray(new C3180k4[0]);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: m9 */
    public int mo13504m9() {
        m54627ne();
        return ((mo13625x1() == 2 || mo13625x1() == 1) ? this.f39163kk.m15550x1() : this.f39163kk.m15549to()).m56683x1();
    }

    /* JADX INFO: renamed from: rv */
    public final C3858kk m54634rv() {
        m54627ne();
        return this.f39163kk;
    }

    @Override // com.aspose.slides.internal.p500xi.AbstractC12536x1, com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: to */
    public C12009k4 mo13505to() {
        return new C4227du(this, C4230to.m17042x1()).mo17032to();
    }

    /* JADX INFO: renamed from: up */
    public final float m54635up() {
        m54627ne();
        return this.f39163kk.m15549to().m56663c5();
    }

    @Override // com.aspose.slides.internal.p500xi.AbstractC12536x1
    /* JADX INFO: renamed from: x1 */
    public int mo13625x1() {
        return (m54629fa() == null || m54629fa().m16098x1().m57808k4() == m54629fa().m16098x1().m57810kk() || m54629fa().m16098x1().m57814x1() == m54629fa().m16098x1().m57812to()) ? 1 : 2;
    }

    /* JADX INFO: renamed from: x6 */
    public final void m54636x6() {
        long jM16120x1 = m54628ck().m16120x1() & 65535;
        for (int i = 0; i < m58364k4().size(); i++) {
            C4047sv c4047sv = (C4047sv) m58364k4().get_Item(i);
            c4047sv.m16062kk((2 * jM16120x1) & 4294967295L);
            jM16120x1 += c4047sv.m16068yj() & 4294967295L;
        }
        m54628ck().m16114k4(jM16120x1 & 4294967295L);
    }

    /* JADX INFO: renamed from: yj */
    public final float m54637yj() {
        m54627ne();
        return this.f39163kk.m15549to().m56683x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54631k4(C4051ts c4051ts) {
        this.f39164x1 = c4051ts;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54632k4(C4053um c4053um) {
        this.f39162k4 = c4053um;
    }
}
