package com.aspose.slides.internal.p104ec;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p356qb.AbstractC9818dy;
import com.aspose.slides.internal.p356qb.C9815c5;
import com.aspose.slides.internal.p356qb.C9816ck;
import com.aspose.slides.internal.p356qb.C9820h4;
import com.aspose.slides.internal.p356qb.C9826to;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3662y9 {

    /* JADX INFO: renamed from: du */
    private C3644tq f10151du;

    /* JADX INFO: renamed from: k4 */
    private C3617ig f10152k4;

    /* JADX INFO: renamed from: kk */
    private C9820h4 f10153kk;

    /* JADX INFO: renamed from: to */
    private C3640ss f10154to;

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, C3621jd> f10155x1 = new Dictionary<>();

    public C3662y9(int i, String str) {
        this.f10152k4 = new C3617ig(i, str);
        this.f10154to = new C3640ss(C7019kk.m27462to(Integer.valueOf(i), 8));
        this.f10151du = new C3644tq(C7019kk.m27462to(Integer.valueOf(i), 8), str);
    }

    /* JADX INFO: renamed from: c5 */
    private void m14841c5(C9816ck c9816ck) {
        if (this.f10153kk == null) {
            return;
        }
        c9816ck.m48360k4().m48340du(this.f10153kk);
    }

    /* JADX INFO: renamed from: ck */
    private void m14842ck(C9816ck c9816ck) {
        if (this.f10154to == null) {
            return;
        }
        C9820h4 c9820h4 = new C9820h4("PROJECTwm");
        this.f10154to.m14795k4(c9820h4);
        c9816ck.m48360k4().m48340du(c9820h4);
    }

    /* JADX INFO: renamed from: du */
    private void m14843du(C9816ck c9816ck) {
        Iterator<KeyValuePair<TKey, TValue>> it = this.f10155x1.iterator();
        while (it.hasNext()) {
            ((C3621jd) ((KeyValuePair) it.next()).getValue()).m14762k4(c9816ck.m48360k4());
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m14844dy(C9816ck c9816ck) {
        AbstractC9818dy abstractC9818dyM48344to = c9816ck.m48360k4().m48344to("PROJECTlk");
        this.f10153kk = abstractC9818dyM48344to instanceof C9820h4 ? (C9820h4) abstractC9818dyM48344to : null;
    }

    /* JADX INFO: renamed from: h4 */
    private void m14845h4(C9816ck c9816ck) {
        if (c9816ck.m48360k4().m48344to("PROJECT") == null) {
            throw new C3620j5("Can't read VBA project");
        }
        AbstractC9818dy abstractC9818dyM48344to = c9816ck.m48360k4().m48344to("PROJECT");
        this.f10151du = new C3644tq(abstractC9818dyM48344to instanceof C9820h4 ? (C9820h4) abstractC9818dyM48344to : null, this.f10152k4.m14754k4().m14706k4().m14839k4().m14815x1());
    }

    /* JADX INFO: renamed from: jd */
    private void m14846jd(C9816ck c9816ck) {
        AbstractC9818dy abstractC9818dyM48344to = c9816ck.m48360k4().m48344to("PROJECTwm");
        C9820h4 c9820h4 = abstractC9818dyM48344to instanceof C9820h4 ? (C9820h4) abstractC9818dyM48344to : null;
        if (c9820h4 != null) {
            this.f10154to = new C3640ss(c9820h4, this.f10152k4.m14754k4().m14706k4().m14839k4().m14815x1());
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m14848kk(C9816ck c9816ck) {
        C9815c5 c9815c5 = new C9815c5("VBA");
        this.f10152k4.m14756k4(c9815c5);
        c9816ck.m48360k4().m48340du(c9815c5);
    }

    /* JADX INFO: renamed from: m9 */
    private void m14849m9(C9816ck c9816ck) {
        C9820h4 c9820h4 = new C9820h4("PROJECT");
        this.f10151du.m14805k4(c9820h4);
        c9816ck.m48360k4().m48340du(c9820h4);
    }

    /* JADX INFO: renamed from: to */
    private void m14850to(C9816ck c9816ck) {
        List.Enumerator<C3664yj> it = this.f10152k4.m14754k4().m14710kk().m14700x1().iterator();
        while (it.hasNext()) {
            C3664yj next = it.next();
            if (next.m14861kk().mo14689k4() == 34) {
                AbstractC9818dy abstractC9818dyM48344to = c9816ck.m48360k4().m48344to(next.m14860k4().m14786x1());
                C9815c5 c9815c5 = abstractC9818dyM48344to instanceof C9815c5 ? (C9815c5) abstractC9818dyM48344to : null;
                if (c9815c5 != null) {
                    this.f10155x1.addItem(next.m14860k4().m14786x1(), new C3621jd(c9815c5, this.f10152k4.m14754k4().m14706k4().m14839k4().m14815x1()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C3647um m14853k4(String str) {
        C3647um c3647umM14755k4 = this.f10152k4.m14755k4(str);
        this.f10151du.m14804k4().m14794x1(str);
        this.f10154to.m14796k4(str);
        return c3647umM14755k4;
    }

    /* JADX INFO: renamed from: x1 */
    public C3617ig m14858x1() {
        return this.f10152k4;
    }

    public C3662y9(C9816ck c9816ck) {
        m14847k4(c9816ck);
    }

    /* JADX INFO: renamed from: x1 */
    private static C9816ck m14851x1(AbstractC3150x6 abstractC3150x6) {
        try {
            return new C9816ck(abstractC3150x6);
        } catch (C9826to e) {
            throw new C3620j5("Can't read VBA project", e);
        } catch (RuntimeException e2) {
            throw new C3620j5("Can't read VBA project.", new Exception(e2.getCause()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m14854k4(AbstractC3150x6 abstractC3150x6) {
        C9816ck c9816ck = new C9816ck();
        m14848kk(c9816ck);
        m14843du(c9816ck);
        m14849m9(c9816ck);
        m14841c5(c9816ck);
        m14842ck(c9816ck);
        c9816ck.m48362x1(abstractC3150x6);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m14857kk() {
        return this.f10151du.m14804k4().m14792k4();
    }

    public C3662y9(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            m14847k4(m14851x1(c3152yj));
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m14847k4(C9816ck c9816ck) {
        m14852x1(c9816ck);
        m14850to(c9816ck);
        m14845h4(c9816ck);
        m14844dy(c9816ck);
        m14846jd(c9816ck);
    }

    /* JADX INFO: renamed from: x1 */
    private void m14852x1(C9816ck c9816ck) {
        AbstractC9818dy abstractC9818dyM48344to = c9816ck.m48360k4().m48344to("VBA");
        C9815c5 c9815c5 = abstractC9818dyM48344to instanceof C9815c5 ? (C9815c5) abstractC9818dyM48344to : null;
        if (c9815c5 == null) {
            throw new C3620j5("Can't read VBA project");
        }
        this.f10152k4 = new C3617ig(c9815c5);
    }

    /* JADX INFO: renamed from: k4 */
    public void m14855k4(String str, String str2) {
        this.f10152k4.m14757k4(str, str2);
    }

    /* JADX INFO: renamed from: x1 */
    public void m14859x1(String str) {
        this.f10152k4.m14759x1(str);
        this.f10151du.m14804k4().m14793kk(str);
        this.f10154to.m14797x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m14856k4() {
        C3152yj c3152yj = new C3152yj();
        try {
            m14854k4(c3152yj);
            return c3152yj.toArray();
        } finally {
            c3152yj.dispose();
        }
    }
}
