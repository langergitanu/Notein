package com.aspose.slides.internal.p558zz;

import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.zz.x1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13643x1 {

    /* JADX INFO: renamed from: k4 */
    public AbstractC13639k4 f45324k4;

    /* JADX INFO: renamed from: kk */
    private int f45325kk;

    /* JADX INFO: renamed from: x1 */
    private int f45326x1;

    public AbstractC13643x1(AbstractC13639k4 abstractC13639k4) {
        this.f45325kk = Integer.MAX_VALUE;
        abstractC13639k4.m62972k4();
        this.f45324k4 = abstractC13639k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m63014k4() {
        return C14116yg.m67507x1(this.f45324k4.m62972k4() - this.f45326x1, this.f45325kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m63017x1() {
        return C14116yg.m67507x1(this.f45324k4.m62980x1() - this.f45326x1, this.f45325kk);
    }

    public AbstractC13643x1(AbstractC13643x1 abstractC13643x1, int i) {
        this(abstractC13643x1.f45324k4);
        int i2 = abstractC13643x1.f45326x1 + i;
        int i3 = abstractC13643x1.f45325kk;
        m63016k4(i2, i3 != Integer.MAX_VALUE ? i3 - i : Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m63015k4(int i) {
        return i + this.f45326x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m63018x1(int i, int i2) {
        return C14116yg.m67507x1(i2, this.f45325kk - i);
    }

    public AbstractC13643x1(AbstractC13643x1 abstractC13643x1, int i, int i2) {
        this(abstractC13643x1.f45324k4);
        m63016k4(abstractC13643x1.f45326x1 + i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m63016k4(int i, int i2) {
        if (i + i2 > m63017x1() || i < 0 || i2 < 0) {
            return false;
        }
        this.f45326x1 += i;
        this.f45325kk = i2;
        return true;
    }
}
