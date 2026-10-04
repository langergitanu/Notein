package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.gi */
/* JADX INFO: loaded from: classes.dex */
public final class C5699gi extends AbstractC5729ri {

    /* JADX INFO: renamed from: k4 */
    private int f15728k4;

    /* JADX INFO: renamed from: to */
    private AbstractC5728qw f15729to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC5728qw f15730x1;

    public C5699gi(int i, AbstractC5728qw abstractC5728qw, AbstractC5728qw abstractC5728qw2) {
        abstractC5728qw = abstractC5728qw.mo23141h4() != 0 ? new C5712kp(9, abstractC5728qw) : abstractC5728qw;
        abstractC5728qw2 = abstractC5728qw2.mo23141h4() != 0 ? new C5712kp(9, abstractC5728qw2) : abstractC5728qw2;
        this.f15728k4 = i;
        this.f15730x1 = abstractC5728qw;
        this.f15729to = abstractC5728qw2;
    }

    /* JADX INFO: renamed from: k4 */
    private static double m23278k4(int i, double d, double d2) {
        switch (i) {
            case 9:
                return d + d2;
            case 10:
                return d - d2;
            case 11:
                return d * d2;
            case 12:
                return d / d2;
            case 13:
                return d % d2;
            default:
                return 0.0d;
        }
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: h4 */
    public int mo23141h4() {
        return 0;
    }

    private C5699gi(C5699gi c5699gi) {
        super(c5699gi);
        this.f15728k4 = c5699gi.f15728k4;
        this.f15730x1 = AbstractC5728qw.m23314k4(c5699gi.f15730x1);
        this.f15729to = AbstractC5728qw.m23314k4(c5699gi.f15729to);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5699gi(this);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        return Double.valueOf(m23278k4(this.f15728k4, C13850af.m65076k4(this.f15730x1.mo23148k4(abstractC10929m9)), C13850af.m65076k4(this.f15729to.mo23148k4(abstractC10929m9))));
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public void mo23149k4(AbstractC7201m9 abstractC7201m9) {
        this.f15730x1.mo23149k4(abstractC7201m9);
        this.f15729to.mo23149k4(abstractC7201m9);
    }
}
