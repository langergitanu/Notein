package com.aspose.slides.internal.p086dl;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.OooO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p047bu.C1855x1;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p146g9.C4228k4;
import com.aspose.slides.internal.p146g9.C4230to;
import com.aspose.slides.internal.p171hq.C4659ts;
import com.aspose.slides.internal.p216k2.C5574k4;
import com.aspose.slides.internal.p251li.C6040ak;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6092wl;
import com.aspose.slides.internal.p260ly.C6268c5;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p298nh.AbstractC6890h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p349q3.C9724w6;
import com.aspose.slides.internal.p349q3.C9735xk;
import com.aspose.slides.internal.p349q3.C9743yj;
import com.aspose.slides.internal.p411sz.C10802k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p488x0.C12348um;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.dl.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3180k4 extends AbstractC12536x1 {

    /* JADX INFO: renamed from: k4 */
    private C9724w6 f9452k4;

    /* JADX INFO: renamed from: x1 */
    private C10802k4 f9453x1;

    public C3180k4() {
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: E_ */
    public int mo13497E_() {
        if (m13619ck() == null || m13619ck().m47769k4() == null) {
            return Integer.MIN_VALUE;
        }
        return m13619ck().m47769k4().m25437ix().m56681to();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: F_ */
    public int mo13498F_() {
        if (m13619ck() == null || m13619ck().m47769k4() == null) {
            return Integer.MIN_VALUE;
        }
        return m13619ck().m47769k4().m25437ix().m56666dy();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: a_ */
    public void mo13499a_(AbstractC3150x6 abstractC3150x6) {
        m13624up();
        new C5574k4(abstractC3150x6).m22907x1(this);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: c5 */
    public float mo13500c5() {
        return ((this.f9452k4.m47769k4().m25448rv().m57820x1() & 4294967295L) * 25.4f) / (this.f9452k4.m47769k4().m25455x6().m57820x1() & 4294967295L);
    }

    /* JADX INFO: renamed from: ck */
    public final C9724w6 m13619ck() {
        return this.f9452k4;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: dy */
    public float mo13501dy() {
        return ((this.f9452k4.m47769k4().m25448rv().m57816k4() & 4294967295L) * 25.4f) / (this.f9452k4.m47769k4().m25455x6().m57816k4() & 4294967295L);
    }

    /* JADX INFO: renamed from: fa */
    public final C10802k4 m13620fa() {
        return this.f9453x1;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: h4 */
    public int mo13502h4() {
        if (m13619ck() == null || m13619ck().m47769k4() == null) {
            return Integer.MIN_VALUE;
        }
        return m13619ck().m47769k4().m25437ix().m56663c5();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: jd */
    public AbstractC6890h4 mo13503jd() {
        if (m58364k4().size() <= 4) {
            return new C1855x1(this);
        }
        throw new ArgumentException("Unable to create graphics from a not empty metafile");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13621k4(C9724w6 c9724w6) {
        this.f9452k4 = c9724w6;
    }

    @Override // com.aspose.slides.internal.p500xi.AbstractC12536x1
    /* JADX INFO: renamed from: kk */
    public C12014ne mo13623kk() {
        return this.f9452k4.m47769k4().m25449to().m57842dy();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: m9 */
    public int mo13504m9() {
        if (m13619ck() == null || m13619ck().m47769k4() == null) {
            return Integer.MIN_VALUE;
        }
        return m13619ck().m47769k4().m25437ix().m56683x1();
    }

    @Override // com.aspose.slides.internal.p500xi.AbstractC12536x1, com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: to */
    public C12009k4 mo13505to() {
        return new C4228k4(this, C4230to.m17042x1()).mo17032to();
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        IGenericEnumerator<C12535to> it = m58364k4().iterator();
        while (it.hasNext()) {
            try {
                c6765kp.m26810x1(((C9723vw) it.next()).toString());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: up */
    public final void m13624up() {
        m13619ck().m47769k4().m25436h4(((long) m58364k4().size()) & 4294967295L);
        int iM47766lr = 0;
        for (int i = 0; i < m58364k4().size(); i++) {
            C9723vw c9723vw = (C9723vw) m58364k4().get_Item(i);
            c9723vw.m47764fa(iM47766lr);
            iM47766lr += c9723vw.m47766lr();
        }
        m13619ck().m47769k4().m25431du(((long) iM47766lr) & 4294967295L);
    }

    @Override // com.aspose.slides.internal.p500xi.AbstractC12536x1
    /* JADX INFO: renamed from: x1 */
    public int mo13625x1() {
        if (m13620fa() == null || m13620fa().m52376k4() == null) {
            return 3;
        }
        return m13620fa().m52376k4().m24412kk() ? 5 : 4;
    }

    public C3180k4(int i, int i2) {
        super(i, i2);
        C9724w6 c9724w6 = new C9724w6(this);
        this.f9452k4 = c9724w6;
        c9724w6.m47763ck(1L);
        this.f9452k4.m47762c5(88);
        this.f9452k4.m47770k4(new C6268c5());
        this.f9452k4.m47769k4().m25441k4(new C12350uz());
        this.f9452k4.m47769k4().m25439k4(1179469088);
        this.f9452k4.m47769k4().m25450to(65536L);
        this.f9452k4.m47769k4().m25431du(88L);
        this.f9452k4.m47769k4().m25436h4(1L);
        this.f9452k4.m47769k4().m25452x1(1);
        this.f9452k4.m47769k4().m25443kk(0);
        this.f9452k4.m47769k4().m25446m9(0L);
        this.f9452k4.m47769k4().m25433dy(0L);
        this.f9452k4.m47769k4().m25429c5(0L);
        this.f9452k4.m47769k4().m25440k4(new C12348um(1600L, 900L));
        this.f9452k4.m47769k4().m25453x1(C12530dy.m58329k4(this.f9452k4.m47769k4().m25448rv()));
        this.f9452k4.m47769k4().m25454x1(new C12350uz(0, 0, OooO.OooO00o(((((this.f9452k4.m47769k4().m25455x6().m57816k4() & 4294967295L) * 100.0f) * i) / (this.f9452k4.m47769k4().m25448rv().m57816k4() & 4294967295L)) - 35.0f, 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67497to((((this.f9452k4.m47769k4().m25455x6().m57820x1() & 4294967295L) * 100.0f) * i2) / (this.f9452k4.m47769k4().m25448rv().m57820x1() & 4294967295L))), 14) - 35));
        m58364k4().addItem(this.f9452k4);
        m13624up();
        C9743yj c9743yj = new C9743yj();
        c9743yj.m47762c5(44);
        c9743yj.m47292to(32L);
        c9743yj.m47885k4(726027589L);
        C6040ak c6040ak = new C6040ak();
        c6040ak.mo24437k4((short) 0);
        c6040ak.mo24448x1(28);
        c6040ak.mo24435k4(16);
        c6040ak.m24409k4(false);
        c6040ak.m24415x1(true);
        c6040ak.m24407k4(1L);
        c6040ak.m24411kk(96);
        c6040ak.m24413to(96);
        c6040ak.m24408k4(new C4659ts());
        c9743yj.m47886k4(new C6045bz[]{c6040ak});
        m58364k4().addItem(c9743yj);
        m13624up();
        C9743yj c9743yj2 = new C9743yj();
        c9743yj2.m47762c5(28);
        c9743yj2.m47292to(16L);
        c9743yj2.m47885k4(726027589L);
        C6092wl c6092wl = new C6092wl();
        c6092wl.mo24437k4((short) 0);
        c6092wl.mo24448x1(12);
        c9743yj2.m47886k4(new C6045bz[]{c6092wl});
        m58364k4().addItem(c9743yj2);
        m13624up();
        C9735xk c9735xk = new C9735xk(this);
        c9735xk.m47763ck(14L);
        c9735xk.m47762c5(20);
        c9735xk.m47840k4(0L);
        c9735xk.m47847x1(0L);
        c9735xk.m47843kk(20L);
        m58364k4().addItem(c9735xk);
        m13624up();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13622k4(C10802k4 c10802k4) {
        this.f9453x1 = c10802k4;
    }
}
