package com.aspose.slides.internal.p202jd;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p126fa.AbstractC3911x1;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.internal.p447up.C11531dy;
import com.aspose.slides.internal.p447up.C11539rv;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.kk */
/* JADX INFO: loaded from: classes.dex */
public class C5306kk extends AbstractC3911x1 {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14307k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14307k4 = c11068dy;
        c11068dy.m53499k4("left-side", C5813x1.k4.f15883ak);
        c11068dy.m53499k4("far-left", C5813x1.k4.f15966dq);
        c11068dy.m53499k4("left", C5813x1.k4.f16523xk);
        c11068dy.m53499k4("center-left", C5813x1.k4.f15925c6);
        c11068dy.m53499k4("center", C5813x1.k4.f16416ts);
        c11068dy.m53499k4("center-right", C5813x1.k4.f15973e0);
        c11068dy.m53499k4("right", C5813x1.k4.f15918bz);
        c11068dy.m53499k4("far-right", C5813x1.k4.f16326qm);
        c11068dy.m53499k4("right-side", C5813x1.k4.f16034g8);
        c11068dy.m53499k4("behind", C5813x1.k4.f16392sv);
        c11068dy.m53499k4("leftwards", C5813x1.k4.f16497wp);
        c11068dy.m53499k4("rightwards", C5813x1.k4.f16389ss);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3911x1
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15607du() {
        return f14307k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15597k4(InterfaceC5808uz interfaceC5808uz, C6344m9 c6344m9, String str, C11539rv c11539rv, AbstractC5788h4 abstractC5788h4, int i) {
        boolean zM27456k4;
        if (!c11539rv.m54530to(i)) {
            IGenericEnumerator<AbstractC5788h4> it = ((C5796m9) abstractC5788h4).iterator();
            boolean z = false;
            AbstractC5788h4 abstractC5788h42 = null;
            while (it.hasNext()) {
                try {
                    AbstractC5788h4 next = it.next();
                    if (C5813x1.k4.f16392sv != next) {
                        if (((AbstractC5803to) next).m23700k4() == 21) {
                            if (C5813x1.k4.f16497wp != next && C5813x1.k4.f16389ss != next) {
                                abstractC5788h42 = next;
                            } else if (zM27456k4) {
                                return next;
                            }
                        } else if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        return next;
                    }
                    z = true;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            if (abstractC5788h42 != null) {
                if (C5813x1.k4.f15883ak == abstractC5788h42) {
                    return !z ? new C11531dy(270.0f, (short) 11) : new C11531dy(270.0f, (short) 11);
                }
                if (C5813x1.k4.f15966dq == abstractC5788h42) {
                    return !z ? new C11531dy(300.0f, (short) 11) : new C11531dy(240.0f, (short) 11);
                }
                if (C5813x1.k4.f16523xk == abstractC5788h42) {
                    return !z ? new C11531dy(320.0f, (short) 11) : new C11531dy(220.0f, (short) 11);
                }
                if (C5813x1.k4.f15925c6 == abstractC5788h42) {
                    return !z ? new C11531dy(340.0f, (short) 11) : new C11531dy(200.0f, (short) 11);
                }
                if (C5813x1.k4.f16416ts == abstractC5788h42) {
                    return !z ? new C11531dy(0.0f, (short) 11) : new C11531dy(180.0f, (short) 11);
                }
                if (C5813x1.k4.f15973e0 == abstractC5788h42) {
                    return !z ? new C11531dy(20.0f, (short) 11) : new C11531dy(160.0f, (short) 11);
                }
                if (C5813x1.k4.f15918bz == abstractC5788h42) {
                    return !z ? new C11531dy(40.0f, (short) 11) : new C11531dy(140.0f, (short) 11);
                }
                if (C5813x1.k4.f16326qm == abstractC5788h42) {
                    return !z ? new C11531dy(60.0f, (short) 11) : new C11531dy(120.0f, (short) 11);
                }
                if (C5813x1.k4.f16034g8 == abstractC5788h42) {
                    return !z ? new C11531dy(90.0f, (short) 11) : new C11531dy(90.0f, (short) 11);
                }
            }
        }
        return abstractC5788h4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        C5796m9 c5796m9 = new C5796m9();
        c5796m9.m23683x1(C5813x1.k4.f16416ts);
        return c5796m9;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 15;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3911x1, com.aspose.slides.internal.p126fa.AbstractC3902k4, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        C5796m9 c5796m9 = new C5796m9();
        do {
            c5796m9.m23683x1(super.mo15578k4(interfaceC9933up, c6344m9));
            interfaceC9933up = interfaceC9933up.mo48851kk();
        } while (interfaceC9933up != null);
        return c5796m9;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "azimuth";
    }
}
