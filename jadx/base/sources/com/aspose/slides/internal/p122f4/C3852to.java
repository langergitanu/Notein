package com.aspose.slides.internal.p122f4;

import com.aspose.slides.internal.p037b9.AbstractC1667du;
import com.aspose.slides.internal.p037b9.AbstractC1670k4;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5022nv;
import com.aspose.slides.internal.p441ui.C11318m9;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.f4.to */
/* JADX INFO: loaded from: classes.dex */
public class C3852to extends AbstractC1667du {

    /* JADX INFO: renamed from: x1 */
    private final C3845c5 f10504x1 = new C3845c5(this);

    @Override // com.aspose.slides.internal.p191it.AbstractC5125k4
    /* JADX INFO: renamed from: k4 */
    public AbstractC1670k4 mo15407k4() {
        return this.f10504x1;
    }

    @Override // com.aspose.slides.internal.p037b9.AbstractC1667du
    /* JADX INFO: renamed from: k4 */
    public void mo9059k4(C5022nv c5022nv, C4201h4 c4201h4) {
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) c4201h4.m16701k4();
        C12014ne c12014neClone = c5022nv.m21331k4().m58249dy().Clone();
        C12018u4 c12018u4M56768x1 = c4201h4.m16744s7().m56768x1();
        c12018u4M56768x1.m56773x1(c12014neClone.Clone());
        if (c12018u4M56768x1.m56775x1(abstractC12008jd)) {
            return;
        }
        C12016rv[] c12016rvArr = {c5022nv.m21359x1()[0].m58197kk(), c5022nv.m21359x1()[1].m58197kk(), c5022nv.m21359x1()[2].m58197kk()};
        C12014ne c12014ne = new C12014ne(c5022nv.m21340kk(), c5022nv.m21349to(), c5022nv.m21325h4(), c5022nv.m21344m9());
        C11913yj c11913yjM7988k4 = c5022nv.m21322dy().m7988k4();
        C12018u4 c12018u4 = new C12018u4(c12014ne.Clone());
        c12018u4.m56771x1(c11913yjM7988k4);
        C12014ne.m56661x1(c12018u4.m56749k4(abstractC12008jd).Clone()).CloneTo(c12014ne);
        c5022nv.m21317c5().m58099k4().Clone();
        C12009k4 c12009k4M9058k4 = AbstractC1667du.m9058k4(c5022nv.m21355wl().m58076x1(c4201h4.m16682ck()), c5022nv.m21347qq().m58076x1(c4201h4.m16682ck()), new C12016rv(c5022nv.m21343ks(), c5022nv.m21348rv()));
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        abstractC12008jd.mo17500k4(c4201h4.m16760vj(), 0);
        abstractC12008jd.mo17523k4(c4201h4.m16744s7(), 0);
        C11318m9.m54482k4(c12014ne.Clone(), new C12014ne(0, 0, c12009k4M9058k4.mo15760yj(), c12009k4M9058k4.mo15757m9())).CloneTo(c12014ne);
        C3976c5 c3976c5 = new C3976c5();
        try {
            c3976c5.m15673x1(3);
            abstractC12008jd.mo17476du(2);
            abstractC12008jd.mo17560kk(7);
            abstractC12008jd.mo17515k4(c12009k4M9058k4, c12016rvArr, c12014ne.Clone(), 2, c3976c5);
            c3976c5.dispose();
            abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
        } catch (Throwable th) {
            c3976c5.dispose();
            throw th;
        }
    }
}
