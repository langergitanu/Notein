package com.aspose.slides.internal.p453uz;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p297ne.C6884yj;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p423to.C11071kk;
import com.aspose.slides.internal.p447up.AbstractC11535k4;
import com.aspose.slides.internal.p478wl.C12090b1;
import com.aspose.slides.internal.p478wl.C12133k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.uz.ix */
/* JADX INFO: loaded from: classes4.dex */
public class C11578ix extends AbstractC11580k4 {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f39109du = new C7017h4("larger", "smaller", "xx-small", "x-small", "small", "medium", "large", "x-large", "xx-large", "xxx-large");

    /* JADX INFO: renamed from: k4 */
    private int f39110k4;

    /* JADX INFO: renamed from: kk */
    private C6884yj f39111kk;

    /* JADX INFO: renamed from: to */
    private int f39112to;

    /* JADX INFO: renamed from: x1 */
    private int f39113x1;

    public C11578ix(AbstractC5788h4 abstractC5788h4) {
        int i;
        super(abstractC5788h4);
        if (m54592x1()) {
            switch (f39109du.m27428k4(((AbstractC5803to) abstractC5788h4).mo23414h4())) {
                case 0:
                case 1:
                    this.f39113x1 = C11071kk.m53502k4(C7019kk.m27443k4((Class<?>) C12090b1.class), mo54591to());
                    i = 1;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    this.f39110k4 = C11071kk.m53502k4(C7019kk.m27443k4((Class<?>) C12133k4.class), mo54591to());
                    i = 0;
                    break;
                default:
                    return;
            }
        } else {
            this.f39111kk = C11598yd.m54614k4((AbstractC11535k4) abstractC5788h4);
            i = 2;
        }
        this.f39112to = i;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m54582dy() {
        return this.f39112to == 0;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m54583m9() {
        return this.f39110k4;
    }
}
