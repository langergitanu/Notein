package com.aspose.slides.internal.p374qz;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p075d5.AbstractC3024x1;
import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p183ij.C5062w6;
import com.aspose.slides.internal.p214k0.C5567k4;
import com.aspose.slides.internal.p214k0.C5569to;
import com.aspose.slides.internal.p227kg.C5673k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.qz.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9966k4 extends AbstractC3024x1 {

    /* JADX INFO: renamed from: k4 */
    private C5062w6 f35996k4;

    /* JADX INFO: renamed from: x1 */
    private C5673k4 f35997x1;

    @Override // com.aspose.slides.internal.p436u8.AbstractC11290x1
    public int as_() {
        if (m49083jd() == null || m49083jd().m21562k4() == null) {
            return Integer.MIN_VALUE;
        }
        return m49083jd().m21562k4().m7827ck().m56681to();
    }

    @Override // com.aspose.slides.internal.p436u8.AbstractC11290x1
    public int at_() {
        if (m49083jd() == null || m49083jd().m21562k4() == null) {
            return Integer.MIN_VALUE;
        }
        return m49083jd().m21562k4().m7827ck().m56666dy();
    }

    @Override // com.aspose.slides.internal.p436u8.AbstractC11290x1
    /* JADX INFO: renamed from: c5 */
    public float mo21939c5() {
        return ((this.f35996k4.m21562k4().m7829dy().m58236x1() & 4294967295L) * 25.4f) / (this.f35996k4.m21562k4().m7825c5().m58236x1() & 4294967295L);
    }

    /* JADX INFO: renamed from: ck */
    public final C5673k4 m49082ck() {
        return this.f35997x1;
    }

    @Override // com.aspose.slides.internal.p436u8.AbstractC11290x1
    /* JADX INFO: renamed from: dy */
    public float mo21941dy() {
        return ((this.f35996k4.m21562k4().m7829dy().m58232k4() & 4294967295L) * 25.4f) / (this.f35996k4.m21562k4().m7825c5().m58232k4() & 4294967295L);
    }

    @Override // com.aspose.slides.internal.p436u8.AbstractC11290x1
    /* JADX INFO: renamed from: h4 */
    public int mo21943h4() {
        if (m49083jd() == null || m49083jd().m21562k4() == null) {
            return Integer.MIN_VALUE;
        }
        return m49083jd().m21562k4().m7827ck().m56663c5();
    }

    /* JADX INFO: renamed from: jd */
    public final C5062w6 m49083jd() {
        return this.f35996k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49084k4(C5062w6 c5062w6) {
        this.f35996k4 = c5062w6;
    }

    @Override // com.aspose.slides.internal.p075d5.AbstractC3024x1
    /* JADX INFO: renamed from: kk */
    public C12014ne mo12731kk() {
        return this.f35996k4.m21562k4().m7834k4().m58249dy();
    }

    @Override // com.aspose.slides.internal.p436u8.AbstractC11290x1
    /* JADX INFO: renamed from: m9 */
    public int mo21949m9() {
        if (m49083jd() == null || m49083jd().m21562k4() == null) {
            return Integer.MIN_VALUE;
        }
        return m49083jd().m21562k4().m7827ck().m56683x1();
    }

    @Override // com.aspose.slides.internal.p075d5.AbstractC3024x1, com.aspose.slides.internal.p436u8.AbstractC11290x1
    /* JADX INFO: renamed from: to */
    public C12009k4 mo12732to() {
        return new C5567k4(this, C5569to.m22895k4()).mo22885to();
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        IGenericEnumerator<C3023to> it = m12729k4().iterator();
        while (it.hasNext()) {
            try {
                c6765kp.m26810x1(((C5061vw) it.next()).toString());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.internal.p075d5.AbstractC3024x1
    /* JADX INFO: renamed from: x1 */
    public int mo12733x1() {
        if (m49082ck() == null || m49082ck().m23131k4() == null) {
            return 3;
        }
        return m49082ck().m23131k4().m53179kk() ? 5 : 4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49085k4(C5673k4 c5673k4) {
        this.f35997x1 = c5673k4;
    }
}
