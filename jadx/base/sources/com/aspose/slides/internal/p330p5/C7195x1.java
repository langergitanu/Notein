package com.aspose.slides.internal.p330p5;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p086dl.C3180k4;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p102e8.C3586k4;
import com.aspose.slides.internal.p102e8.C3587kk;
import com.aspose.slides.internal.p124f7.C3878yj;
import com.aspose.slides.internal.p146g9.AbstractC4231x1;
import com.aspose.slides.internal.p146g9.C4230to;
import com.aspose.slides.internal.p192iu.C5132x1;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p372qx.C9962k4;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p5.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C7195x1 extends AbstractC4231x1 {

    /* JADX INFO: renamed from: h4 */
    private C3585h4 f19770h4;

    public C7195x1(C3180k4 c3180k4, C4230to c4230to) {
        super(c3180k4, c4230to);
        C3585h4 c3585h4 = new C3585h4(new C3586k4());
        this.f19770h4 = c3585h4;
        c3585h4.m14507k4(new C3587kk(c3180k4.m13619ck().m47769k4().m25430ck() & 65535));
        this.f19770h4.m14577x6().m14597k4(0L, c3180k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10951c5 m27856k4(C12015qq c12015qq, C12007ix c12007ix) {
        C10951c5 c10951c5 = new C10951c5();
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55763k4(c12015qq.m56699x1() / c12007ix.m56550c5(), c12015qq.m56697kk() / c12007ix.m56575x1());
        c11913yj.m55786x1(-m17041x1().mo13497E_(), -m17041x1().mo13498F_(), 0);
        c10951c5.m52904k4(C9962k4.m49061k4(c11913yj));
        C10951c5 c10951c52 = new C10951c5();
        c10951c5.m52930k4(c10951c52);
        mo17031k4(c10951c52, c11913yj);
        return c10951c5;
    }

    @Override // com.aspose.slides.internal.p146g9.AbstractC4231x1
    /* JADX INFO: renamed from: k4 */
    public void mo17033k4(C11913yj c11913yj, C3585h4 c3585h4) {
        c3585h4.m14515k4(new C12009k4(1, 1));
    }

    @Override // com.aspose.slides.internal.p146g9.AbstractC4231x1, com.aspose.slides.internal.p146g9.AbstractC4229kk
    /* JADX INFO: renamed from: k4 */
    public void mo17031k4(Object obj, C11913yj c11913yj) {
        C9723vw c9723vw;
        this.f19770h4.m14508k4(m17040kk());
        this.f19770h4.m14524k4(obj);
        mo17033k4(c11913yj, this.f19770h4);
        IGenericEnumerator<C12535to> it = m17041x1().m58364k4().iterator();
        do {
            try {
                if (!it.hasNext()) {
                    break;
                }
                c9723vw = (C9723vw) it.next();
                if (!C5132x1.m21996k4(c9723vw, this.f19770h4)) {
                    throw new C6490k4(C14113y2.m67408k4("Player for ", C14042ak.m66410k4(C3878yj.class, c9723vw.m47767v4()), " was not found."));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                if (this.f19770h4.m14494g8() != null) {
                    this.f19770h4.m14494g8().dispose();
                    this.f19770h4.m14515k4((C12009k4) null);
                }
            }
        } while (c9723vw.m47767v4() != 14);
    }
}
