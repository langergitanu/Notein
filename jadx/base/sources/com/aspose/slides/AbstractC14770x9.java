package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.x9 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC14770x9 implements Comparable<AbstractC14770x9> {

    /* JADX INFO: renamed from: c5 */
    private int f50013c5;

    /* JADX INFO: renamed from: du */
    private float f50014du;

    /* JADX INFO: renamed from: h4 */
    private float f50016h4;

    /* JADX INFO: renamed from: kk */
    private boolean f50018kk;

    /* JADX INFO: renamed from: to */
    private boolean f50020to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC14770x9 f50021x1;

    /* JADX INFO: renamed from: m9 */
    private oju f50019m9 = new oju();

    /* JADX INFO: renamed from: dy */
    private boolean f50015dy = true;

    /* JADX INFO: renamed from: k4 */
    private final List<AbstractC14770x9> f50017k4 = new List<>();

    /* JADX INFO: renamed from: c5 */
    private int m73195c5() {
        int iMo3480O_ = mo3480O_();
        for (AbstractC14770x9 abstractC14770x9M73228yd = m73228yd(); abstractC14770x9M73228yd != null; abstractC14770x9M73228yd = abstractC14770x9M73228yd.m73228yd()) {
            if (abstractC14770x9M73228yd.mo3480O_() > iMo3480O_ && iMo3480O_ == 0) {
                iMo3480O_ = abstractC14770x9M73228yd.mo3480O_();
            }
        }
        return iMo3480O_;
    }

    /* JADX INFO: renamed from: dy */
    private boolean m73197dy() {
        boolean zMo3221T_ = mo3221T_();
        for (AbstractC14770x9 abstractC14770x9M73228yd = m73228yd(); zMo3221T_ && abstractC14770x9M73228yd != null; abstractC14770x9M73228yd = abstractC14770x9M73228yd.m73228yd()) {
            zMo3221T_ = abstractC14770x9M73228yd.mo3221T_();
        }
        return zMo3221T_;
    }

    /* JADX INFO: renamed from: m9 */
    private List<AbstractC14770x9> m73201m9() {
        List<AbstractC14770x9> list = new List<>();
        list.addItem(this);
        m73199k4(list);
        for (int i = 0; i < list.size(); i++) {
            list.get_Item(i).f50013c5 = i;
        }
        list.sort();
        return list;
    }

    /* JADX INFO: renamed from: to */
    private void m73202to() {
        this.f50018kk = true;
        this.f50020to = false;
    }

    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 0;
    }

    /* JADX INFO: renamed from: T_ */
    public boolean mo3221T_() {
        return this.f50015dy;
    }

    /* JADX INFO: renamed from: U_ */
    public void mo5524U_() {
    }

    /* JADX INFO: renamed from: V_ */
    public void mo3030V_() {
    }

    /* JADX INFO: renamed from: ak */
    public final float m73203ak() {
        return this.f50019m9.f47837x1;
    }

    /* JADX INFO: renamed from: b3 */
    public final AbstractC14770x9[] m73204b3() {
        return this.f50017k4.toArray(new AbstractC14770x9[0]);
    }

    /* JADX INFO: renamed from: bz */
    public final float m73205bz() {
        return this.f50014du;
    }

    /* JADX INFO: renamed from: c6 */
    public final float m73206c6() {
        AbstractC14770x9 abstractC14770x9 = this.f50021x1;
        return abstractC14770x9 != null ? abstractC14770x9.m73206c6() + this.f50016h4 : this.f50016h4;
    }

    /* JADX INFO: renamed from: dq */
    public final oju m73207dq() {
        return this.f50019m9;
    }

    /* JADX INFO: renamed from: du */
    public final void m73208du(float f) {
        this.f50014du = f;
        if (f < -50000.0f) {
            this.f50014du = -50000.0f;
        }
        if (this.f50014du > 50000.0f) {
            this.f50014du = 50000.0f;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final C12007ix m73209e0() {
        return new C12007ix(m73227xk(), m73206c6(), m73225wy(), m73203ak());
    }

    /* JADX INFO: renamed from: fa */
    public final void m73210fa(C14713vw c14713vw) {
        m73200kk(c14713vw);
        m73196du(c14713vw);
        m73198h4(c14713vw);
        m73202to();
    }

    /* JADX INFO: renamed from: g8 */
    public final void m73211g8() {
        List.Enumerator<AbstractC14770x9> it = m73201m9().iterator();
        while (it.hasNext()) {
            try {
                AbstractC14770x9 next = it.next();
                if (next.m73197dy()) {
                    next.mo3482x1();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m73212h4(float f) {
        this.f50016h4 = f;
        if (f < -50000.0f) {
            this.f50016h4 = -50000.0f;
        }
        if (this.f50016h4 > 50000.0f) {
            this.f50016h4 = 50000.0f;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final <T extends AbstractC14770x9> T m73213k4(Class<T> cls) {
        T t = null;
        for (AbstractC14770x9 abstractC14770x9 = this.f50021x1; abstractC14770x9 != null && t == null; abstractC14770x9 = abstractC14770x9.f50021x1) {
            t = (T) C7019kk.m27452k4((Object) abstractC14770x9, (Class) cls);
        }
        return t;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC14770x9 abstractC14770x9) {
        int iM73195c5 = m73195c5();
        int iM73195c52 = abstractC14770x9.m73195c5();
        if (iM73195c5 != iM73195c52) {
            return iM73195c5 > iM73195c52 ? 1 : -1;
        }
        int i = this.f50013c5;
        int i2 = abstractC14770x9.f50013c5;
        if (i == i2) {
            return 0;
        }
        return i > i2 ? 1 : -1;
    }

    /* JADX INFO: renamed from: lr */
    public final AbstractC1202hh m73218lr() {
        return (AbstractC1202hh) m73213k4(AbstractC1202hh.class);
    }

    /* JADX INFO: renamed from: qm */
    public final float m73219qm() {
        return this.f50016h4;
    }

    /* JADX INFO: renamed from: ss */
    public final void m73220ss() {
        this.f50020to = true;
    }

    /* JADX INFO: renamed from: sv */
    public final void m73221sv() {
        List.Enumerator<AbstractC14770x9> it = m73201m9().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo3030V_();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ts */
    public final C12025x6 m73223ts() {
        return new C12025x6((m73225wy() / 2.0f) + m73227xk(), (m73203ak() / 2.0f) + m73206c6());
    }

    /* JADX INFO: renamed from: wp */
    public final void m73224wp() {
        this.f50017k4.clear();
    }

    /* JADX INFO: renamed from: wy */
    public final float m73225wy() {
        return this.f50019m9.f47836k4;
    }

    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
    }

    /* JADX INFO: renamed from: xk */
    public final float m73227xk() {
        AbstractC14770x9 abstractC14770x9 = this.f50021x1;
        return abstractC14770x9 != null ? abstractC14770x9.m73227xk() + this.f50014du : this.f50014du;
    }

    /* JADX INFO: renamed from: yd */
    public final AbstractC14770x9 m73228yd() {
        return this.f50021x1;
    }

    /* JADX INFO: renamed from: du */
    private void m73196du(C14713vw c14713vw) {
        mo3231x1(c14713vw);
    }

    /* JADX INFO: renamed from: h4 */
    private void m73198h4(C14713vw c14713vw) {
        mo3230to(c14713vw);
    }

    /* JADX INFO: renamed from: k4 */
    private void m73199k4(List<AbstractC14770x9> list) {
        List.Enumerator<AbstractC14770x9> it = this.f50017k4.iterator();
        while (it.hasNext()) {
            try {
                AbstractC14770x9 next = it.next();
                list.addItem(next);
                next.m73199k4(list);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m73217kk(float f) {
        this.f50019m9.f47836k4 = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m73222to(float f) {
        this.f50019m9.f47837x1 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
    }

    /* JADX INFO: renamed from: kk */
    private void m73200kk(C14713vw c14713vw) {
        this.f50020to = false;
        this.f50018kk = false;
        mo3225k4(c14713vw);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73214k4(oju ojuVar) {
        ojuVar.CloneTo(this.f50019m9);
    }

    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73226x1(AbstractC14770x9 abstractC14770x9) {
        abstractC14770x9.f50021x1 = null;
        this.f50017k4.removeItem(abstractC14770x9);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
    }

    /* JADX INFO: renamed from: x1 */
    public void mo63967x1(boolean z) {
        this.f50015dy = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73215k4(AbstractC14770x9 abstractC14770x9) {
        abstractC14770x9.f50021x1 = this;
        this.f50017k4.addItem(abstractC14770x9);
    }
}
