package com.aspose.slides.internal.p083di;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p138fu.C4123dy;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.di.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3163k4 extends C3165x1 {

    /* JADX INFO: renamed from: k4 */
    private final Stack<C11896dy> f9393k4 = new Stack<>();

    /* JADX INFO: renamed from: x1 */
    private C12018u4 f9394x1;

    /* JADX INFO: renamed from: k4 */
    public final C12018u4 m13514k4() {
        return this.f9394x1;
    }

    @Override // com.aspose.slides.internal.p083di.C3165x1, com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13516x1(C10971um c10971um) {
        if (m13532x1() != null) {
            this.f9393k4.push(m13532x1());
        }
        super.mo13516x1(c10971um);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13515k4(C10971um c10971um) {
        if (c10971um.mo52909to() != null) {
            C11913yj c11913yjM16495k4 = C4123dy.m16495k4(c10971um.mo52909to());
            try {
                m13532x1().m55577x1(c11913yjM16495k4);
            } finally {
                if (c11913yjM16495k4 != null) {
                    c11913yjM16495k4.dispose();
                }
            }
        }
        C12018u4 c12018u4 = this.f9394x1;
        if (c12018u4 == null) {
            this.f9394x1 = new C12018u4(m13532x1());
        } else {
            c12018u4.m56758kk(m13532x1());
        }
        if (this.f9393k4.size() != 0) {
            m13531k4(this.f9393k4.pop());
        }
    }
}
