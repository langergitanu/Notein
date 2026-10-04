package com.aspose.slides.internal.p248lf;

import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.lf.m9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6033m9 implements InterfaceC6031k4 {

    /* JADX INFO: renamed from: k4 */
    private C5659x1 f17114k4;

    /* JADX INFO: renamed from: x1 */
    private final C6029du f17115x1;

    public AbstractC6033m9(C5659x1 c5659x1, C6029du c6029du) {
        this.f17114k4 = c5659x1;
        this.f17115x1 = c6029du;
        C9790ts c9790tsM23120k4 = c5659x1.m23120k4();
        for (int i = 0; i < c6029du.f17084dy.length(); i++) {
            if (c9790tsM23120k4.m48221m9().m48102k4(c6029du.f17084dy.charAt(i)) == null) {
                C12004dy[] c12004dyArrM56522k4 = C12004dy.m56522k4();
                int length = c12004dyArrM56522k4.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        c9790tsM23120k4 = C9763ck.m48030to().mo48031k4(c12004dyArrM56522k4[i2].m56527du(), c5659x1.m23125x1());
                        if (c9790tsM23120k4 != null && c9790tsM23120k4.m48221m9().m48102k4(c6029du.f17084dy.charAt(i)) != null) {
                            this.f17114k4 = new C5659x1(c5659x1.m23114dy(), c5659x1.m23125x1(), c9790tsM23120k4);
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p248lf.InterfaceC6031k4
    /* JADX INFO: renamed from: k4 */
    public final float mo24354k4(char c) {
        return this.f17114k4.m23117k4(c) + ((!C14117yj.m67534ks(c) && this.f17115x1.m24339k4() && (this.f17114k4.m23120k4().m48183dy() & 1) == 0) ? this.f17114k4.m23114dy() * 0.022f : 0.0f);
    }

    /* JADX INFO: renamed from: x1 */
    public final C6029du m24360x1() {
        return this.f17115x1;
    }

    @Override // com.aspose.slides.internal.p248lf.InterfaceC6031k4
    /* JADX INFO: renamed from: k4 */
    public final float mo24355k4(char c, char c2) {
        return 0.0f;
    }

    @Override // com.aspose.slides.internal.p248lf.InterfaceC6031k4
    /* JADX INFO: renamed from: k4 */
    public final float mo24356k4(String str) {
        return this.f17114k4.m23126x1(str).m56699x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final C5659x1 m24359k4() {
        return this.f17114k4;
    }
}
