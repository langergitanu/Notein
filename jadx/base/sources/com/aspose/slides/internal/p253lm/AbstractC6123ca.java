package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.ca */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6123ca {

    /* JADX INFO: renamed from: kk */
    public static final AbstractC6123ca[] f17309kk = new AbstractC6123ca[0];

    /* JADX INFO: renamed from: k4 */
    private int f17310k4;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC6183tq f17311x1;

    /* JADX INFO: renamed from: C_ */
    public abstract Object mo24769C_();

    /* JADX INFO: renamed from: D_ */
    public Object mo24789D_() {
        return mo24769C_();
    }

    /* JADX INFO: renamed from: ak */
    public String mo24790ak() {
        return toString();
    }

    /* JADX INFO: renamed from: b3 */
    public final InterfaceC6183tq m24791b3() {
        return this.f17311x1;
    }

    /* JADX INFO: renamed from: dy */
    public abstract String mo24770dy();

    public boolean equals(Object obj) {
        AbstractC6123ca abstractC6123ca = (AbstractC6123ca) C7019kk.m27452k4(obj, AbstractC6123ca.class);
        if (C14067j2.m66729x1(null, abstractC6123ca)) {
            return false;
        }
        if (C14067j2.m66729x1(this, abstractC6123ca)) {
            return true;
        }
        if (!C14113y2.m67363du(mo24770dy(), abstractC6123ca.mo24770dy())) {
            return false;
        }
        if (C7019kk.m27469x1(abstractC6123ca, C6163nh.class) || C7019kk.m27469x1(abstractC6123ca, C6185u1.class)) {
            return true;
        }
        return mo24789D_().equals(abstractC6123ca.mo24789D_());
    }

    public int hashCode() {
        return mo24769C_() != null ? mo24769C_().hashCode() : super.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24792k4(InterfaceC6183tq interfaceC6183tq) {
        this.f17311x1 = interfaceC6183tq;
    }

    /* JADX INFO: renamed from: to */
    public AbstractC6123ca mo24773to(AbstractC6123ca abstractC6123ca) {
        return null;
    }

    /* JADX INFO: renamed from: to */
    public abstract String mo24774to();

    public String toString() {
        return (mo24769C_() == null ? mo24774to() : mo24769C_()).toString();
    }

    /* JADX INFO: renamed from: wy */
    public int m24794wy() {
        return C7019kk.m27462to(Double.valueOf(mo24775x1()), 14);
    }

    /* JADX INFO: renamed from: x1 */
    public double mo24775x1() {
        return 0.0d;
    }

    /* JADX INFO: renamed from: yd */
    public final int m24795yd() {
        return this.f17310k4;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo24772k4() {
        return true;
    }

    /* JADX INFO: renamed from: to */
    public final void m24793to(int i) {
        this.f17310k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC6123ca mo24776x1(InterfaceC6173qw interfaceC6173qw) {
        return C6163nh.f17403k4;
    }
}
