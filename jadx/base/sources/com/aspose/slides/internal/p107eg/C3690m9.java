package com.aspose.slides.internal.p107eg;

import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p275mi.AbstractC6389dy;
import com.aspose.slides.internal.p275mi.AbstractC6395x1;
import com.aspose.slides.internal.p275mi.C6393m9;
import com.aspose.slides.internal.p275mi.C6394to;
import com.aspose.slides.internal.p558zz.C13637dy;
import com.aspose.slides.internal.p558zz.C13641m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.eg.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C3690m9 extends C6393m9 {

    /* JADX INFO: renamed from: kk */
    private int f10252kk;

    /* JADX INFO: renamed from: to */
    private int f10253to;

    /* JADX INFO: renamed from: com.aspose.slides.internal.eg.m9$k4 */
    public static class k4 extends AbstractC6389dy {

        /* JADX INFO: renamed from: k4 */
        private int f10254k4;

        /* JADX INFO: renamed from: x1 */
        private int f10255x1;

        public k4(C6394to c6394to, C13637dy c13637dy) {
            super(c6394to, c13637dy);
            this.f10254k4 = -1;
            this.f10255x1 = -1;
        }

        /* JADX INFO: renamed from: k4 */
        public static k4 m14994k4(C6394to c6394to, C13637dy c13637dy) {
            return new k4(c6394to, c13637dy);
        }

        /* JADX INFO: renamed from: x1 */
        public final void m14996x1(int i) {
            if (i < 0) {
                throw new InvalidOperationException("Number of glyphs can't be negative.");
            }
            this.f10255x1 = i;
            ((C3690m9) m26222yj()).f10253to = i;
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: k4 */
        public AbstractC6395x1 mo14947k4(C13641m9 c13641m9) {
            return new C3690m9(m26228up(), c13641m9, this.f10254k4, this.f10255x1);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m14995k4(int i) {
            if (i < 0) {
                throw new InvalidOperationException("Number of metrics can't be negative.");
            }
            this.f10254k4 = i;
            ((C3690m9) m26222yj()).f10252kk = i;
        }
    }

    private C3690m9(C6394to c6394to, C13641m9 c13641m9, int i, int i2) {
        super(c6394to, c13641m9);
        this.f10252kk = i;
        this.f10253to = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m14992k4(int i) {
        if (i > this.f10252kk) {
            throw new IndexOutOfRangeException();
        }
        return this.f18176k4.m62997du(i * 4);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m14993x1(int i) {
        int i2 = this.f10252kk;
        return i < i2 ? m14992k4(i) : m14992k4(i2 - 1);
    }
}
