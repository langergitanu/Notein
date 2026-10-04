package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3901jd;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p368qq.C9919h4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.internal.p447up.C11531dy;
import com.aspose.slides.internal.p447up.C11537ks;
import com.aspose.slides.internal.p447up.C11539rv;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.xi */
/* JADX INFO: loaded from: classes.dex */
public class C5413xi extends AbstractC3901jd {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14385k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14385k4 = c11068dy;
        C11537ks c11537ks = C5813x1.k4.f16504wy;
        c11068dy.m53499k4("normal", c11537ks);
        c11068dy.m53499k4("bold", C5813x1.k4.f16241nh);
        c11068dy.m53499k4("bolder", C5813x1.k4.f16574zb);
        c11068dy.m53499k4("lighter", C5813x1.k4.f16116j6);
        c11068dy.m53499k4("initial", c11537ks);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15588du() {
        return f14385k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15597k4(InterfaceC5808uz interfaceC5808uz, C6344m9 c6344m9, String str, C11539rv c11539rv, AbstractC5788h4 abstractC5788h4, int i) {
        AbstractC5788h4 abstractC5788h4Mo15597k4 = super.mo15597k4(interfaceC5808uz, c6344m9, str, c11539rv, abstractC5788h4, i);
        if (abstractC5788h4Mo15597k4 == C5813x1.k4.f16504wy) {
            return C5813x1.k4.f16552yj;
        }
        if (abstractC5788h4Mo15597k4 == C5813x1.k4.f16241nh) {
            return C5813x1.k4.f16512x6;
        }
        if (abstractC5788h4Mo15597k4 == C5813x1.k4.f16574zb) {
            InterfaceC5808uz interfaceC5808uzM25970k4 = C6344m9.m25970k4((InterfaceC12769ix) interfaceC5808uz);
            int iM27462to = interfaceC5808uzM25970k4 != null ? C7019kk.m27462to(Float.valueOf(((C11531dy) c6344m9.m25991k4(interfaceC5808uzM25970k4, str, i)).mo23699k4((short) 1)), 13) : 400;
            return (iM27462to == 100 || iM27462to == 200 || iM27462to == 300) ? C5813x1.k4.f16552yj : (iM27462to == 400 || iM27462to == 500) ? C5813x1.k4.f16512x6 : (iM27462to == 600 || iM27462to == 700 || iM27462to == 800 || iM27462to == 900) ? C5813x1.k4.f16109ix : C5813x1.k4.f16109ix;
        }
        if (abstractC5788h4Mo15597k4 != C5813x1.k4.f16116j6) {
            return abstractC5788h4Mo15597k4;
        }
        InterfaceC5808uz interfaceC5808uzM25970k42 = C6344m9.m25970k4((InterfaceC12769ix) interfaceC5808uz);
        int iM27462to2 = interfaceC5808uzM25970k42 != null ? C7019kk.m27462to(Float.valueOf(((C11531dy) c6344m9.m25991k4(interfaceC5808uzM25970k42, str, i)).mo23699k4((short) 1)), 13) : 400;
        return (iM27462to2 == 100 || iM27462to2 == 200 || iM27462to2 == 300 || iM27462to2 == 400 || iM27462to2 == 500) ? C5813x1.k4.f15924c5 : (iM27462to2 == 600 || iM27462to2 == 700) ? C5813x1.k4.f16552yj : (iM27462to2 == 800 || iM27462to2 == 900) ? C5813x1.k4.f16512x6 : C5813x1.k4.f15924c5;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f16504wy;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 127;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd, com.aspose.slides.internal.p126fa.AbstractC3894c5, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        short sMo48850k4 = interfaceC9933up.mo48850k4();
        if (sMo48850k4 == 12) {
            return C5813x1.k4.f16146k4;
        }
        if (sMo48850k4 == 13) {
            int iMo48834du = interfaceC9933up.mo48834du();
            if (iMo48834du == 100) {
                return C5813x1.k4.f15924c5;
            }
            if (iMo48834du == 200) {
                return C5813x1.k4.f16008fa;
            }
            if (iMo48834du == 300) {
                return C5813x1.k4.f16442up;
            }
            if (iMo48834du == 400) {
                return C5813x1.k4.f16552yj;
            }
            if (iMo48834du == 500) {
                return C5813x1.k4.f16167ks;
            }
            if (iMo48834du == 600) {
                return C5813x1.k4.f16361rv;
            }
            if (iMo48834du == 700) {
                return C5813x1.k4.f16512x6;
            }
            if (iMo48834du == 800) {
                return C5813x1.k4.f16239ne;
            }
            if (iMo48834du == 900) {
                return C5813x1.k4.f16109ix;
            }
        } else if (sMo48850k4 == 35) {
            AbstractC5788h4 abstractC5788h4M53498k4 = mo15588du().m53498k4(C14113y2.m67361du(interfaceC9933up.mo48784c5()));
            if (abstractC5788h4M53498k4 != null) {
                return abstractC5788h4M53498k4;
            }
            throw m15601k4(interfaceC9933up.mo48784c5());
        }
        throw C9919h4.m48827k4(interfaceC9933up.mo48850k4());
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "font-weight";
    }
}
