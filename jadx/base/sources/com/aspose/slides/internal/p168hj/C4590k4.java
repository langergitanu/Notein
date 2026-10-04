package com.aspose.slides.internal.p168hj;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p039be.AbstractC1689x1;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p416tb.AbstractC10914up;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10912u4;
import com.aspose.slides.internal.p416tb.C10921yd;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.internal.p420th.C10947ak;
import com.aspose.slides.internal.p420th.C10953ck;
import com.aspose.slides.internal.p420th.C10960jd;
import com.aspose.slides.internal.p505xn.C12571u4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.hj.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4590k4 extends AbstractC10914up {

    /* JADX INFO: renamed from: du */
    private final SortedList<String, AbstractC1689x1> f12822du;

    /* JADX INFO: renamed from: k4 */
    private boolean f12823k4;

    /* JADX INFO: renamed from: kk */
    private String f12824kk;

    /* JADX INFO: renamed from: to */
    private final SortedList<String, AbstractC4593x1> f12825to;

    public C4590k4(C10898dy c10898dy) {
        super(c10898dy);
        this.f12825to = new SortedList<>();
        this.f12822du = new C12571u4();
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC1689x1 m18964k4(C5659x1 c5659x1) {
        AbstractC1689x1 abstractC1689x1M52558k4 = this.f37962x1.m52459kk().m52558k4(c5659x1, true, m52569m9().m52464x1().m52627u4());
        this.f12822du.set_Item(abstractC1689x1M52558k4.m52566ck(), abstractC1689x1M52558k4);
        return abstractC1689x1M52558k4;
    }

    /* JADX INFO: renamed from: k4 */
    private String m18962k4() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[ ");
        IGenericEnumerator<AbstractC4593x1> it = this.f12825to.getValues().iterator();
        while (it.hasNext()) {
            try {
                c6765kpOooO00o.m26792k4(it.next().m52565c5());
                c6765kpOooO00o.m26792k4(" ");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (this.f12823k4) {
            c6765kpOooO00o.m26792k4(this.f12824kk);
            c6765kpOooO00o.m26792k4(" ");
        }
        c6765kpOooO00o.m26792k4(" ]");
        return c6765kpOooO00o.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private void m18963k4(AbstractC4593x1 abstractC4593x1) {
        abstractC4593x1.m18984du().m52533k4(abstractC4593x1);
        if (this.f12825to.containsKey(abstractC4593x1.m18988kk())) {
            throw new ArgumentException("Names must be unique.");
        }
        this.f12825to.addItem(abstractC4593x1.m18988kk(), abstractC4593x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18965k4(C10921yd c10921yd, String str) {
        if (this.f12822du.size() == 0) {
            return;
        }
        c10921yd.m52650k4(str);
        c10921yd.m52643dy();
        c10921yd.m52650k4("/Font");
        c10921yd.m52643dy();
        IGenericEnumerator<AbstractC1689x1> it = this.f12822du.getValues().iterator();
        while (it.hasNext()) {
            try {
                AbstractC1689x1 next = it.next();
                c10921yd.m52666kk(C14113y2.m67402k4("/{0}", next.m52566ck()), next.m52565c5());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c10921yd.m52640c5();
        c10921yd.m52640c5();
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        if (this.f12823k4) {
            c10922yj.m52652k4("/SigFlags", 2);
        }
        c10922yj.m52666kk("/Fields", m18962k4());
        m18965k4(c10922yj, "/DR");
        c10922yj.m52640c5();
        c10922yj.m52678x1();
        IGenericEnumerator<AbstractC4593x1> it = this.f12825to.getValues().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo9082k4(c10922yj);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18966k4(C10947ak c10947ak, C10912u4 c10912u4) {
        m18963k4(new C4588du(c10912u4, c10947ak));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18967k4(C10953ck c10953ck, C10912u4 c10912u4) {
        m18963k4(new C4592to(c10912u4, c10953ck));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18968k4(C10960jd c10960jd, C10912u4 c10912u4) {
        m18963k4(new C4591kk(c10912u4, c10960jd));
    }
}
