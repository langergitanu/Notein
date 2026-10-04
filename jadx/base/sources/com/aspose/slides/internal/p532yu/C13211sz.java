package com.aspose.slides.internal.p532yu;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14080ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.sz */
/* JADX INFO: loaded from: classes5.dex */
public class C13211sz {

    /* JADX INFO: renamed from: du */
    private int f44382du;

    /* JADX INFO: renamed from: h4 */
    private boolean f44383h4;

    /* JADX INFO: renamed from: k4 */
    private k4 f44384k4 = null;

    /* JADX INFO: renamed from: kk */
    private String f44385kk;

    /* JADX INFO: renamed from: to */
    private AbstractC12892ae f44386to;

    /* JADX INFO: renamed from: x1 */
    private Object f44387x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.yu.sz$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private boolean f44388k4;

        /* JADX INFO: renamed from: x1 */
        private C14046bv[] f44389x1;

        public k4() {
            this.f44388k4 = false;
            this.f44389x1 = (C14046bv[]) C22200OooO0o0.OooO00o(C14046bv.class, 1);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m61607k4(boolean z) {
            this.f44388k4 = z;
        }

        /* JADX INFO: renamed from: x1 */
        public final C14046bv[] m61609x1() {
            return this.f44389x1;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m61608k4() {
            return this.f44388k4;
        }

        public k4(int i) {
            this.f44388k4 = false;
            this.f44389x1 = (C14046bv[]) C22200OooO0o0.OooO00o(C14046bv.class, i);
        }
    }

    public C13211sz(Object obj, String str, AbstractC12892ae abstractC12892ae) {
        this.f44382du = 1;
        this.f44383h4 = false;
        this.f44387x1 = obj;
        this.f44385kk = str;
        this.f44386to = abstractC12892ae;
        if (abstractC12892ae.mo60017ck() == 1 || C7019kk.m27469x1(abstractC12892ae, C12895ak.class) || C7019kk.m27469x1(abstractC12892ae, C13253vj.class)) {
            this.f44383h4 = true;
            this.f44382du = ((AbstractC14092to) C7019kk.m27458kk(obj, AbstractC14092to.class)).m67265du();
        }
    }

    /* JADX INFO: renamed from: du */
    public final Object m61599du() {
        return this.f44387x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC12892ae m61600h4() {
        return this.f44386to;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m61601k4() {
        return this.f44382du;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m61603kk() {
        return this.f44384k4.m61608k4();
    }

    /* JADX INFO: renamed from: m9 */
    public final void m61604m9() {
        if (this.f44384k4 != null) {
            return;
        }
        int iMo60020fa = this.f44386to.mo60020fa();
        if (iMo60020fa != 14) {
            switch (iMo60020fa) {
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                    break;
                default:
                    if (this.f44383h4) {
                        this.f44384k4 = new k4(this.f44382du);
                    } else {
                        this.f44384k4 = new k4();
                    }
                    break;
            }
            return;
        }
        if (this.f44383h4) {
            this.f44384k4 = new k4(this.f44382du);
            for (int i = 0; i < this.f44382du; i++) {
                C14080ne.m67026up(((AbstractC14092to) C7019kk.m27458kk(this.f44387x1, AbstractC14092to.class)).m67275kk(i), C11683c5.m55033ck()).CloneTo(this.f44384k4.m61609x1()[i]);
            }
        } else {
            this.f44384k4 = new k4();
            C14080ne.m67026up(this.f44387x1, C11683c5.m55033ck()).CloneTo(this.f44384k4.m61609x1()[0]);
        }
        this.f44384k4.m61607k4(true);
    }

    /* JADX INFO: renamed from: to */
    public final C14046bv[] m61605to() {
        return this.f44384k4.m61609x1();
    }

    public String toString() {
        return this.f44385kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m61606x1() {
        return this.f44383h4;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m61598x1(C13211sz c13211sz) {
        for (int i = 0; i < m61601k4(); i++) {
            if (C14046bv.m66484m9(m61605to()[i], c13211sz.m61605to()[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m61602k4(C13211sz c13211sz) {
        if (m61601k4() != c13211sz.m61601k4()) {
            return false;
        }
        if (m61600h4() != c13211sz.m61600h4()) {
            if (!m61600h4().mo60035x1(c13211sz.m61600h4())) {
                return false;
            }
            c13211sz.m61604m9();
            m61604m9();
            if (m61603kk() && c13211sz.m61603kk()) {
                return m61598x1(c13211sz);
            }
        }
        if (m61606x1()) {
            if (c13211sz.m61606x1()) {
                return m61600h4().mo60034x1(m61599du(), c13211sz.m61599du()) == 0;
            }
            AbstractC14092to abstractC14092to = (AbstractC14092to) C7019kk.m27452k4(m61599du(), AbstractC14092to.class);
            C12965eg[] c12965egArr = (C12965eg[]) C7019kk.m27452k4(AbstractC14092to.m67212k4(abstractC14092to), C12965eg[].class);
            return c12965egArr != null ? c12965egArr.length == 1 && AbstractC14092to.m67208k4((Object) c12965egArr).m67275kk(0).equals(c13211sz.m61599du()) : abstractC14092to.m67265du() == 1 && abstractC14092to.m67275kk(0).equals(c13211sz.m61599du());
        }
        if (!c13211sz.m61606x1()) {
            return m61599du().equals(c13211sz.m61599du());
        }
        AbstractC14092to abstractC14092to2 = (AbstractC14092to) C7019kk.m27452k4(c13211sz.m61599du(), AbstractC14092to.class);
        C12965eg[] c12965egArr2 = (C12965eg[]) C7019kk.m27452k4(AbstractC14092to.m67212k4(abstractC14092to2), C12965eg[].class);
        return c12965egArr2 != null ? c12965egArr2.length == 1 && AbstractC14092to.m67208k4((Object) c12965egArr2).m67275kk(0).equals(m61599du()) : abstractC14092to2.m67265du() == 1 && abstractC14092to2.m67275kk(0).equals(m61599du());
    }
}
