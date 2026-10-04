package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.yn */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5768yn extends AbstractC5728qw {

    /* JADX INFO: renamed from: c5 */
    private int f15825c5;

    /* JADX INFO: renamed from: du */
    private boolean f15826du;

    /* JADX INFO: renamed from: dy */
    private String f15827dy;

    /* JADX INFO: renamed from: h4 */
    private String f15828h4;

    /* JADX INFO: renamed from: k4 */
    public AbstractC5728qw f15829k4;

    /* JADX INFO: renamed from: m9 */
    private String f15830m9;

    /* JADX INFO: renamed from: to */
    protected int f15831to;

    /* JADX INFO: renamed from: x1 */
    protected AbstractC10925du f15832x1;

    public AbstractC5768yn(AbstractC5728qw abstractC5728qw) {
        String str = C14113y2.f47374k4;
        this.f15828h4 = str;
        this.f15830m9 = str;
        this.f15827dy = str;
        this.f15829k4 = abstractC5728qw;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f15831to = 0;
        this.f15832x1 = null;
        this.f15829k4.mo23138c5();
    }

    /* JADX INFO: renamed from: fa */
    public final String m23365fa() {
        return this.f15828h4;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: h4 */
    public int mo23141h4() {
        return 3;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: jd */
    public double mo23317jd() {
        if (C14067j2.m66727k4(this.f15829k4) != C7019kk.m27443k4((Class<?>) C5763y4.class)) {
            return 0.5d;
        }
        if (this.f15828h4.length() != 0) {
            return 0.0d;
        }
        return this.f15830m9.length() != 0 ? -0.25d : -0.5d;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        m23294ck();
        mo23138c5();
        this.f15829k4.mo23148k4(abstractC10929m9);
        return this;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: kk */
    public AbstractC10925du mo21834kk() {
        return this.f15832x1;
    }

    /* JADX INFO: renamed from: ks */
    public final int m23366ks() {
        return this.f15825c5;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2, com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: to */
    public int mo21835to() {
        return this.f15831to;
    }

    /* JADX INFO: renamed from: up */
    public final String m23367up() {
        return this.f15827dy;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean mo23355x1(AbstractC10925du abstractC10925du) {
        if (m23366ks() != abstractC10925du.mo21857kk() && m23366ks() != 9) {
            if (m23366ks() != 4) {
                return false;
            }
            if (abstractC10925du.mo21857kk() != 6 && abstractC10925du.mo21857kk() != 5) {
                return false;
            }
        }
        if (m23368yj()) {
            return (C14113y2.m67363du(this.f15828h4, abstractC10925du.mo21867to()) || this.f15828h4.length() == 0) && C14113y2.m67363du(this.f15827dy, abstractC10925du.mo21841du());
        }
        return true;
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m23368yj() {
        return this.f15826du;
    }

    public AbstractC5768yn(AbstractC5728qw abstractC5728qw, String str, String str2, int i) {
        this.f15829k4 = abstractC5728qw;
        this.f15828h4 = str;
        this.f15830m9 = str2;
        this.f15825c5 = i;
        this.f15826du = (str2.length() == 0 && str.length() == 0) ? false : true;
        this.f15827dy = C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public void mo23149k4(AbstractC7201m9 abstractC7201m9) {
        this.f15827dy = abstractC7201m9.mo13292k4(this.f15830m9);
        this.f15829k4.mo23149k4(abstractC7201m9);
    }

    public AbstractC5768yn(AbstractC5768yn abstractC5768yn) {
        super(abstractC5768yn);
        this.f15829k4 = AbstractC5728qw.m23314k4(abstractC5768yn.f15829k4);
        this.f15828h4 = abstractC5768yn.f15828h4;
        this.f15830m9 = abstractC5768yn.f15830m9;
        this.f15827dy = abstractC5768yn.f15827dy;
        this.f15825c5 = abstractC5768yn.f15825c5;
        this.f15826du = abstractC5768yn.f15826du;
        this.f15831to = abstractC5768yn.f15831to;
        this.f15832x1 = abstractC5768yn.f15832x1;
    }
}
