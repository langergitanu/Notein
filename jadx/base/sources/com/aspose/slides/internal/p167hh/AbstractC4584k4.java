package com.aspose.slides.internal.p167hh;

/* JADX INFO: renamed from: com.aspose.slides.internal.hh.k4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4584k4 {

    /* JADX INFO: renamed from: k4 */
    protected String f12797k4;

    /* JADX INFO: renamed from: kk */
    protected float f12798kk;

    /* JADX INFO: renamed from: to */
    protected int f12799to;

    /* JADX INFO: renamed from: x1 */
    protected String f12800x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.hh.k4$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private final int f12801k4;

        /* JADX INFO: renamed from: kk */
        private final int f12802kk;

        /* JADX INFO: renamed from: to */
        private final int f12803to;

        /* JADX INFO: renamed from: x1 */
        private final int f12804x1;

        public k4(int i, int i2, int i3, int i4) {
            this.f12801k4 = i;
            this.f12804x1 = i2;
            this.f12802kk = i3;
            this.f12803to = i4;
        }

        /* JADX INFO: renamed from: k4 */
        public int m18939k4() {
            return this.f12801k4;
        }

        /* JADX INFO: renamed from: kk */
        public final int m18940kk() {
            return this.f12802kk;
        }

        /* JADX INFO: renamed from: to */
        public final int m18941to() {
            return this.f12803to;
        }

        /* JADX INFO: renamed from: x1 */
        public final int m18942x1() {
            return this.f12804x1;
        }
    }

    public AbstractC4584k4(String str, String str2, float f, int i) {
        this.f12797k4 = str;
        this.f12800x1 = str2;
        this.f12798kk = f;
        this.f12799to = i;
    }

    /* JADX INFO: renamed from: c5 */
    public abstract float mo18923c5();

    /* JADX INFO: renamed from: du */
    public boolean m18924du() {
        return (this.f12799to & 1) != 0;
    }

    /* JADX INFO: renamed from: dy */
    public boolean m18925dy() {
        return (this.f12799to & 4) != 0;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m18926h4() {
        return (this.f12799to & 2) != 0;
    }

    /* JADX INFO: renamed from: jd */
    public abstract k4 mo18927jd();

    /* JADX INFO: renamed from: k4 */
    public abstract float mo18928k4(char c, float f);

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC4584k4 mo18929k4(float f);

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC4584k4 mo18930k4(float f, int i);

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC4584k4 mo18931k4(int i);

    /* JADX INFO: renamed from: k4 */
    public String m18932k4() {
        return this.f12797k4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo18933k4(char c);

    /* JADX INFO: renamed from: kk */
    public float m18934kk() {
        return this.f12798kk;
    }

    /* JADX INFO: renamed from: m9 */
    public boolean m18935m9() {
        return (this.f12799to & 8) != 0;
    }

    /* JADX INFO: renamed from: to */
    public int m18936to() {
        return this.f12799to;
    }

    /* JADX INFO: renamed from: x1 */
    public String m18937x1() {
        return this.f12800x1;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract boolean mo18938x1(int i);
}
