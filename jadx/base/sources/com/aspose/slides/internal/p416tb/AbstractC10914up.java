package com.aspose.slides.internal.p416tb;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p443ul.C11445kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.up */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10914up {

    /* JADX INFO: renamed from: k4 */
    private String f37960k4;

    /* JADX INFO: renamed from: kk */
    private final int f37961kk;

    /* JADX INFO: renamed from: x1 */
    protected C10898dy f37962x1;

    public AbstractC10914up(C10898dy c10898dy) {
        this.f37962x1 = c10898dy;
        this.f37961kk = c10898dy.m52457k4();
    }

    /* JADX INFO: renamed from: c5 */
    public final String m52565c5() {
        return C14113y2.m67402k4("{0} 0 R", Integer.valueOf(this.f37961kk));
    }

    /* JADX INFO: renamed from: ck */
    public final String m52566ck() {
        if (this.f37960k4 == null && m52568jd()) {
            this.f37960k4 = mo9129up();
        }
        return this.f37960k4;
    }

    /* JADX INFO: renamed from: dy */
    public final int m52567dy() {
        return this.f37961kk;
    }

    /* JADX INFO: renamed from: fa */
    public int mo9118fa() {
        return 0;
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m52568jd() {
        return mo9118fa() != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo9082k4(C10922yj c10922yj);

    /* JADX INFO: renamed from: m9 */
    public final C10898dy m52569m9() {
        return this.f37962x1;
    }

    /* JADX INFO: renamed from: up */
    public String mo9129up() {
        if (m52568jd()) {
            return C14113y2.m67402k4("{0}{1}", C10913um.m52554kk(mo9118fa()), Integer.valueOf(this.f37962x1.m52459kk().m52557k4(mo9118fa()) + 1));
        }
        throw new InvalidOperationException("Tried to generate a resource name not being a resource.");
    }

    /* JADX INFO: renamed from: yj */
    public final C11445kk m52570yj() {
        if (this.f37962x1.m52464x1().m52620ks()) {
            return this.f37962x1.m52450c5().m54510k4(m52567dy(), 0);
        }
        return null;
    }
}
