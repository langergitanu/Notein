package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p077d8.C3100wp;
import com.aspose.slides.internal.p464vq.AbstractC11758j2;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p541z6.C13452x1;

/* JADX INFO: loaded from: classes3.dex */
class hxc extends AbstractC11758j2 {

    /* JADX INFO: renamed from: fa */
    private final C13452x1 f5583fa;

    /* JADX INFO: renamed from: k4 */
    private ChartDataWorkbook f5586k4;

    /* JADX INFO: renamed from: yj */
    private final InterruptionToken f5592yj;

    /* JADX INFO: renamed from: x1 */
    private int f5591x1 = 0;

    /* JADX INFO: renamed from: jd */
    private final List<IShape> f5585jd = new List<>();

    /* JADX INFO: renamed from: kk */
    private final Dictionary<C11791os, IPPImage> f5587kk = new Dictionary<>();

    /* JADX INFO: renamed from: to */
    private final Dictionary<C11791os, IAudio> f5589to = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    private final Dictionary<C11791os, IVideo> f5581du = new Dictionary<>();

    /* JADX INFO: renamed from: h4 */
    private final Dictionary<C11791os, ITheme> f5584h4 = new Dictionary<>();

    /* JADX INFO: renamed from: m9 */
    private final Dictionary<String, List<IHyperlink>> f5588m9 = new Dictionary<>();

    /* JADX INFO: renamed from: dy */
    private final Dictionary<Long, ICommentAuthor> f5582dy = new Dictionary<>();

    /* JADX INFO: renamed from: c5 */
    private final Dictionary<String, IChartDataWorksheet> f5579c5 = new Dictionary<>();

    /* JADX INFO: renamed from: ck */
    private final SortedList<String, SortedList<String, C11791os>> f5580ck = new SortedList<>();

    /* JADX INFO: renamed from: up */
    private final x5k f5590up = new x5k();

    public hxc(IChartDataWorkbook iChartDataWorkbook, C13452x1 c13452x1, InterruptionToken interruptionToken) {
        this.f5583fa = c13452x1;
        this.f5592yj = interruptionToken;
        this.f5586k4 = (ChartDataWorkbook) iChartDataWorkbook;
    }

    /* JADX INFO: renamed from: du */
    public final InterruptionToken m7322du() {
        return this.f5592yj;
    }

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<String, IChartDataWorksheet> m7323k4() {
        return this.f5579c5;
    }

    /* JADX INFO: renamed from: kk */
    public final C13452x1 m7325kk() {
        return this.f5583fa;
    }

    /* JADX INFO: renamed from: to */
    public final x5k m7326to() {
        return this.f5590up;
    }

    /* JADX INFO: renamed from: x1 */
    public final ChartDataWorkbook m7327x1() {
        return this.f5586k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7324k4(String str, int i) {
        if (m7327x1().m688to() == null || m7327x1().m688to().m74879k4() == null) {
            return;
        }
        new C3100wp(str, i).sendWarning(m7327x1().m688to().m74879k4());
    }
}
