package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.vt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13255vt extends AbstractC12998ga implements Cloneable {

    /* JADX INFO: renamed from: k4 */
    private AbstractC12998ga f44429k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC12998ga f44430x1;

    /* JADX INFO: renamed from: k4 */
    public final void m61639k4(AbstractC12998ga abstractC12998ga) {
        this.f44429k4 = abstractC12998ga;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC12998ga m61640kk() {
        return this.f44430x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC12998ga m61641x1() {
        return this.f44429k4;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12998ga
    /* JADX INFO: renamed from: k4 */
    public void mo60040k4(AbstractC13255vt abstractC13255vt, C12930cj c12930cj, C12979f7 c12979f7) {
        this.f44429k4.mo60040k4(this, c12930cj, c12979f7);
        AbstractC12998ga abstractC12998ga = this.f44430x1;
        if (abstractC12998ga != null) {
            abstractC12998ga.mo60040k4(this, c12930cj, c12979f7);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61642x1(AbstractC12998ga abstractC12998ga) {
        this.f44430x1 = abstractC12998ga;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61643x1(AbstractC13255vt abstractC13255vt, C12930cj c12930cj, C12979f7 c12979f7) {
        Stack stack = new Stack();
        AbstractC13255vt abstractC13255vt2 = this;
        while (true) {
            if (!C7019kk.m27469x1(abstractC13255vt2.f44429k4, C12981fa.class) && !C7019kk.m27469x1(abstractC13255vt2.f44429k4, C13053jm.class)) {
                break;
            }
            stack.push(abstractC13255vt2);
            abstractC13255vt2 = (AbstractC13255vt) abstractC13255vt2.f44429k4;
        }
        abstractC13255vt2.f44429k4.mo60040k4(abstractC13255vt2, c12930cj, c12979f7);
        while (true) {
            AbstractC12998ga abstractC12998ga = abstractC13255vt2.f44430x1;
            if (abstractC12998ga != null) {
                abstractC12998ga.mo60040k4(abstractC13255vt2, c12930cj, c12979f7);
            }
            if (stack.size() == 0) {
                return;
            } else {
                abstractC13255vt2 = (AbstractC13255vt) stack.pop();
            }
        }
    }
}
