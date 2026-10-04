package com.aspose.slides.internal.p107eg;

import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p275mi.AbstractC6389dy;
import com.aspose.slides.internal.p275mi.AbstractC6395x1;
import com.aspose.slides.internal.p275mi.C6393m9;
import com.aspose.slides.internal.p275mi.C6394to;
import com.aspose.slides.internal.p558zz.C13637dy;
import com.aspose.slides.internal.p558zz.C13641m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.eg.du */
/* JADX INFO: loaded from: classes3.dex */
public class C3684du extends C6393m9 {

    /* JADX INFO: renamed from: kk */
    private int f10244kk;

    /* JADX INFO: renamed from: com.aspose.slides.internal.eg.du$k4 */
    public static class k4 extends AbstractC6389dy {

        /* JADX INFO: renamed from: k4 */
        private int f10245k4;

        public k4(C6394to c6394to, C13637dy c13637dy) {
            super(c6394to, c13637dy);
            this.f10245k4 = -1;
        }

        /* JADX INFO: renamed from: k4 */
        public static k4 m14962k4(C6394to c6394to, C13637dy c13637dy) {
            return new k4(c6394to, c13637dy);
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: k4 */
        public AbstractC6395x1 mo14947k4(C13641m9 c13641m9) {
            return new C3684du(m26228up(), c13641m9, this.f10245k4);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m14963k4(int i) {
            if (i < 0) {
                throw new InvalidOperationException("Number of glyphs can't be negative.");
            }
            this.f10245k4 = i;
            ((C3684du) m26222yj()).f10244kk = i;
        }
    }

    private C3684du(C6394to c6394to, C13641m9 c13641m9, int i) {
        super(c6394to, c13641m9);
        this.f10244kk = i;
    }

    /* JADX INFO: renamed from: du */
    public final int m14957du() {
        return this.f18176k4.m62999h4(2);
    }

    /* JADX INFO: renamed from: h4 */
    public final int m14958h4() {
        return this.f18176k4.m62995c5(4);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m14959k4(int i) {
        if (i < 0 || i >= m14957du()) {
            throw new IndexOutOfRangeException();
        }
        return this.f18176k4.m63005kk((m14958h4() * i) + 8);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m14961x1(int i) {
        if (i < 0 || i >= m14957du()) {
            throw new IndexOutOfRangeException();
        }
        return this.f18176k4.m63005kk((m14958h4() * i) + 9);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m14960k4(int i, int i2) {
        if (i < 0 || i >= m14957du() || i2 < 0 || i2 >= this.f10244kk) {
            throw new IndexOutOfRangeException();
        }
        return this.f18176k4.m63005kk((m14958h4() * i) + 10 + i2);
    }
}
