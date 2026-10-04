package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14087rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.wy */
/* JADX INFO: loaded from: classes4.dex */
public class C10700wy {

    /* JADX INFO: renamed from: k4 */
    private C14084qq f37492k4 = new C14084qq();

    /* JADX INFO: renamed from: k4 */
    public final C14084qq m51952k4() {
        return this.f37492k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51953k4(C3134k4 c3134k4) {
        short sM13381rv = c3134k4.m13381rv();
        short sM13381rv2 = c3134k4.m13381rv();
        c3134k4.m13381rv();
        try {
            this.f37492k4 = new C14084qq((int) sM13381rv, (int) sM13381rv2, (int) c3134k4.m13381rv(), (int) c3134k4.m13381rv(), (int) c3134k4.m13381rv(), (int) c3134k4.m13381rv(), (int) c3134k4.m13381rv());
        } catch (RuntimeException e) {
            if (C7019kk.m27469x1(e, ArgumentOutOfRangeException.class)) {
                this.f37492k4 = new C14084qq();
            } else {
                C3085sv.m13082k4(e);
                C14087rv.m67163k4(e);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51954k4(C3149x1 c3149x1) {
        c3149x1.m13448k4((short) this.f37492k4.m67158yj());
        c3149x1.m13448k4((short) this.f37492k4.m67129dy());
        c3149x1.m13448k4((short) this.f37492k4.m67141kk());
        c3149x1.m13448k4((short) this.f37492k4.m67153x1());
        c3149x1.m13448k4((short) this.f37492k4.m67147to());
        c3149x1.m13448k4((short) this.f37492k4.m67144m9());
        c3149x1.m13448k4((short) this.f37492k4.m67126ck());
        c3149x1.m13448k4((short) this.f37492k4.m67131h4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51955k4(C14084qq c14084qq) {
        c14084qq.CloneTo(this.f37492k4);
    }
}
