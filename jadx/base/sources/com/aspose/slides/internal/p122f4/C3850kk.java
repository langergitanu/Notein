package com.aspose.slides.internal.p122f4;

import com.aspose.slides.internal.p037b9.AbstractC1667du;
import com.aspose.slides.internal.p037b9.AbstractC1670k4;
import com.aspose.slides.internal.p037b9.AbstractC1673to;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C4997j2;
import com.aspose.slides.internal.p441ui.C11318m9;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.f4.kk */
/* JADX INFO: loaded from: classes.dex */
public class C3850kk extends AbstractC1673to {

    /* JADX INFO: renamed from: x1 */
    private final C3845c5 f10502x1 = new C3845c5(this);

    @Override // com.aspose.slides.internal.p191it.AbstractC5125k4
    /* JADX INFO: renamed from: k4 */
    public AbstractC1670k4 mo15407k4() {
        return this.f10502x1;
    }

    @Override // com.aspose.slides.internal.p037b9.AbstractC1673to
    /* JADX INFO: renamed from: k4 */
    public void mo9076k4(C4997j2 c4997j2, C4201h4 c4201h4) {
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) c4201h4.m16701k4();
        C12014ne c12014neClone = c4997j2.m21128k4().m58249dy().Clone();
        C12018u4 c12018u4M56768x1 = c4201h4.m16744s7().m56768x1();
        c12018u4M56768x1.m56773x1(c12014neClone.Clone());
        if (c12018u4M56768x1.m56775x1(abstractC12008jd)) {
            return;
        }
        C12014ne c12014ne = new C12014ne(c4997j2.m21119dy(), c4997j2.m21114c5(), c4997j2.m21147to(), c4997j2.m21123h4());
        C12014ne c12014ne2 = new C12014ne(c4997j2.m21155x1(), c4997j2.m21137kk(), c4997j2.m21147to(), c4997j2.m21123h4());
        C12009k4 c12009k4M9058k4 = AbstractC1667du.m9058k4(c4997j2.m21113ar().m58076x1(c4201h4.m16682ck()), c4997j2.m21151um().m58076x1(c4201h4.m16682ck()), new C12016rv(c4997j2.m21159x6(), c4997j2.m21144ne()));
        c4997j2.m21141m9();
        C11913yj c11913yjM7988k4 = c4997j2.m21127jd().m7988k4();
        c4997j2.m21116ck().m58099k4().Clone();
        C12018u4 c12018u4 = new C12018u4(c12014ne.Clone());
        c12018u4.m56771x1(c11913yjM7988k4);
        C12014ne.m56661x1(c12018u4.m56749k4(abstractC12008jd).Clone()).CloneTo(c12014ne);
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        abstractC12008jd.mo17500k4(c4201h4.m16760vj(), 0);
        abstractC12008jd.mo17523k4(c4201h4.m16744s7(), 0);
        C11318m9.m54482k4(c12014ne.Clone(), new C12014ne(0, 0, c12009k4M9058k4.mo15760yj(), c12009k4M9058k4.mo15757m9())).CloneTo(c12014ne);
        C3976c5 c3976c5 = new C3976c5();
        try {
            c3976c5.m15673x1(3);
            abstractC12008jd.mo17476du(2);
            abstractC12008jd.mo17560kk(7);
            abstractC12008jd.mo17511k4((AbstractC12002ck) c12009k4M9058k4, c12014ne2.Clone(), c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1(), 2, c3976c5);
            c3976c5.dispose();
            abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
        } catch (Throwable th) {
            c3976c5.dispose();
            throw th;
        }
    }
}
