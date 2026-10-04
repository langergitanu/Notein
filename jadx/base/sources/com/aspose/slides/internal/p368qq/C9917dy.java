package com.aspose.slides.internal.p368qq;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6337h4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.qq.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C9917dy implements InterfaceC9938x6 {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f35797kk;

    /* JADX INFO: renamed from: x1 */
    private static final C11068dy<AbstractC5788h4> f35798x1;

    /* JADX INFO: renamed from: k4 */
    private final C6337h4 f35799k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f35798x1 = c11068dy;
        c11068dy.m53499k4("repeating", C5813x1.k4.f16011fe);
        c11068dy.m53499k4("numeric", C5813x1.k4.f16173l0);
        c11068dy.m53499k4("alphabetic", C5813x1.k4.f16139jw);
        c11068dy.m53499k4("symbolic", C5813x1.k4.f16212mh);
        c11068dy.m53499k4("additive", C5813x1.k4.f16470vm);
        c11068dy.m53499k4("non-repeating", C5813x1.k4.f15956dd);
        f35797kk = new C7017h4(C18437z2.f56754h, "suffix", RequestParameters.PREFIX, "glyphs", "fallback");
    }

    public C9917dy(C6337h4 c6337h4) {
        this.f35799k4 = c6337h4;
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9938x6
    /* JADX INFO: renamed from: k4 */
    public final void mo48819k4(String str, InterfaceC9933up interfaceC9933up, boolean z) {
        int iM27428k4 = f35797kk.m27428k4(C14113y2.m67361du(str));
        if (iM27428k4 == 0) {
            if (interfaceC9933up.mo48850k4() != 35) {
                throw C9919h4.m48827k4(interfaceC9933up.mo48850k4());
            }
            AbstractC5788h4 abstractC5788h4M53498k4 = f35798x1.m53498k4(interfaceC9933up.mo48784c5());
            if (abstractC5788h4M53498k4 == null) {
                throw C9919h4.m48833x1(interfaceC9933up.mo48784c5());
            }
            this.f35799k4.m25948kk(((AbstractC5803to) abstractC5788h4M53498k4).mo23706x1());
            return;
        }
        if (iM27428k4 == 1) {
            if (interfaceC9933up.mo48850k4() != 36) {
                throw C9919h4.m48827k4(interfaceC9933up.mo48850k4());
            }
            this.f35799k4.m25941du(interfaceC9933up.mo48784c5());
            return;
        }
        if (iM27428k4 == 2) {
            if (interfaceC9933up.mo48850k4() != 36) {
                throw C9919h4.m48827k4(interfaceC9933up.mo48850k4());
            }
            this.f35799k4.m25950to(interfaceC9933up.mo48784c5());
        } else {
            if (iM27428k4 == 3) {
                while (interfaceC9933up.mo48850k4() == 36) {
                    this.f35799k4.m25943fa().addItem(interfaceC9933up.mo48784c5());
                    interfaceC9933up = interfaceC9933up.mo48851kk();
                    if (interfaceC9933up == null) {
                        return;
                    }
                }
                throw C9919h4.m48827k4(interfaceC9933up.mo48850k4());
            }
            if (iM27428k4 != 4) {
                this.f35799k4.m23401a_().m26022to().m26004to().mo48786k4(new C9930to(C14113y2.m67402k4("Invalid property name '{0}'.", str)));
            } else {
                if (interfaceC9933up.mo48850k4() != 36) {
                    throw C9919h4.m48827k4(interfaceC9933up.mo48850k4());
                }
                this.f35799k4.m25945h4(((AbstractC5803to) f35798x1.m53498k4(interfaceC9933up.mo48784c5())).mo23706x1());
            }
        }
    }
}
