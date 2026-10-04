package com.aspose.slides.internal.p116ev;

import com.aspose.slides.internal.p275mi.AbstractC6388du;
import com.aspose.slides.internal.p558zz.C13641m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ev.to */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3803to extends AbstractC6388du {

    /* JADX INFO: renamed from: du */
    private int f10359du;

    /* JADX INFO: renamed from: kk */
    protected Object f10360kk;

    /* JADX INFO: renamed from: to */
    private int f10361to;

    /* JADX INFO: renamed from: x1 */
    protected volatile boolean f10362x1;

    public AbstractC3803to(C13641m9 c13641m9, int i, int i2, int i3) {
        super(c13641m9, i, i2);
        this.f10362x1 = false;
        this.f10360kk = new Object();
        this.f10361to = i3;
        if (this.f18176k4.m63014k4() == 0) {
            this.f10359du = 0;
        } else {
            this.f10359du = this.f18176k4.m62999h4(0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m15205k4(C13641m9 c13641m9, int i, int i2) {
        return (i2 != 0 && c13641m9.m62999h4(i) < 0) ? 1 : 0;
    }

    /* JADX INFO: renamed from: c5 */
    public final int m15207c5() {
        return this.f18176k4.m62999h4(6);
    }

    /* JADX INFO: renamed from: ck */
    public final int m15208ck() {
        return this.f18176k4.m62999h4(8);
    }

    /* JADX INFO: renamed from: du */
    public abstract int mo15174du();

    /* JADX INFO: renamed from: dy */
    public final int m15209dy() {
        return this.f18176k4.m62999h4(2);
    }

    /* JADX INFO: renamed from: h4 */
    public abstract C13641m9 mo15175h4();

    /* JADX INFO: renamed from: jd */
    public final int m15210jd() {
        return this.f18176k4.m62999h4(4);
    }

    /* JADX INFO: renamed from: kk */
    public abstract void mo15178kk();

    /* JADX INFO: renamed from: m9 */
    public final int m15211m9() {
        return this.f10359du;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC3803to m15206k4(C3799h4 c3799h4, C13641m9 c13641m9, int i, int i2) {
        return m15205k4(c13641m9, i, i2) == 0 ? new C3798dy(c13641m9, i, i2) : new C3800k4(c13641m9, i, i2);
    }
}
