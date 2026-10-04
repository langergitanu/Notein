package com.aspose.slides.internal.p175i1;

import com.aspose.slides.p559ms.System.C14112xw;

/* JADX INFO: renamed from: com.aspose.slides.internal.i1.k4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4786k4 {

    /* JADX INFO: renamed from: k4 */
    public static final AbstractC4786k4 f13368k4 = m19846k4((Object) null);

    /* JADX INFO: renamed from: kk */
    private final int f13369kk;

    /* JADX INFO: renamed from: to */
    private final int f13370to;

    /* JADX INFO: renamed from: x1 */
    private Object f13371x1;

    public AbstractC4786k4(Object obj, int i, int i2) {
        this.f13371x1 = obj;
        this.f13369kk = i;
        this.f13370to = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m19844k4(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    /* JADX INFO: renamed from: du */
    public C14112xw m19848du() {
        return new C14112xw(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC4786k4 abstractC4786k4 = (AbstractC4786k4) obj;
            if (this.f13370to == abstractC4786k4.f13370to) {
                Object obj2 = this.f13371x1;
                Object obj3 = abstractC4786k4.f13371x1;
                if (obj2 != null ? obj2 == obj3 : obj3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    public void m19849h4() {
        C4789to.m19857k4(Integer.valueOf(this.f13369kk));
    }

    public int hashCode() {
        return Long.valueOf(m19852to()).hashCode();
    }

    /* JADX INFO: renamed from: kk */
    public int m19851kk() {
        return this.f13370to;
    }

    /* JADX INFO: renamed from: to */
    public long m19852to() {
        return m19844k4(m19853x1(), m19851kk());
    }

    /* JADX INFO: renamed from: x1 */
    public int m19853x1() {
        return this.f13369kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC4786k4 m19845k4(long j) {
        int i = (int) (j >> 32);
        return C4782du.m19842k4(C4789to.m19856k4(i), i, (int) j);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC4786k4 m19846k4(Object obj) {
        return m19847k4(obj, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC4786k4 m19847k4(Object obj, int i) {
        return C4782du.m19842k4(obj, obj == null ? 0 : C4789to.m19854k4(obj), i);
    }

    /* JADX INFO: renamed from: k4 */
    public Object m19850k4() {
        return this.f13371x1;
    }
}
