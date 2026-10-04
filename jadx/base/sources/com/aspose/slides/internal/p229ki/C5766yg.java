package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.yg */
/* JADX INFO: loaded from: classes.dex */
public final class C5766yg extends AbstractC5729ri {

    /* JADX INFO: renamed from: k4 */
    private AbstractC5728qw f15822k4;

    /* JADX INFO: renamed from: to */
    private boolean f15823to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC5728qw f15824x1;

    public C5766yg(int i, AbstractC5728qw abstractC5728qw, AbstractC5728qw abstractC5728qw2) {
        abstractC5728qw = abstractC5728qw.mo23141h4() != 2 ? new C5719my(8, abstractC5728qw) : abstractC5728qw;
        abstractC5728qw2 = abstractC5728qw2.mo23141h4() != 2 ? new C5719my(8, abstractC5728qw2) : abstractC5728qw2;
        this.f15822k4 = abstractC5728qw;
        this.f15824x1 = abstractC5728qw2;
        this.f15823to = i == 1;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: h4 */
    public int mo23141h4() {
        return 2;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5766yg(this);
    }

    private C5766yg(C5766yg c5766yg) {
        super(c5766yg);
        this.f15822k4 = AbstractC5728qw.m23314k4(c5766yg.f15822k4);
        this.f15824x1 = AbstractC5728qw.m23314k4(c5766yg.f15824x1);
        this.f15823to = c5766yg.f15823to;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        Object objMo23148k4 = this.f15822k4.mo23148k4(abstractC10929m9);
        return ((Boolean) C7019kk.m27464to(objMo23148k4, Boolean.TYPE)).booleanValue() == this.f15823to ? objMo23148k4 : this.f15824x1.mo23148k4(abstractC10929m9);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public void mo23149k4(AbstractC7201m9 abstractC7201m9) {
        this.f15822k4.mo23149k4(abstractC7201m9);
        this.f15824x1.mo23149k4(abstractC7201m9);
    }
}
