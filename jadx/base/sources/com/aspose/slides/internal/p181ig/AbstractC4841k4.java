package com.aspose.slides.internal.p181ig;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p213jw.C5536c5;
import com.aspose.slides.internal.p213jw.C5556up;
import com.aspose.slides.internal.p213jw.C5560wy;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p435u5.C11283h4;
import com.aspose.slides.internal.p517y2.InterfaceC12770jd;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ig.k4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4841k4 extends AbstractC4830gf {

    /* JADX INFO: renamed from: du */
    private k4 f13461du;

    /* JADX INFO: renamed from: h4 */
    private C5560wy f13462h4;

    /* JADX INFO: renamed from: k4 */
    protected C6765kp f13463k4;

    /* JADX INFO: renamed from: kk */
    private boolean f13464kk;

    /* JADX INFO: renamed from: to */
    private x1 f13465to;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ig.k4$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private C6765kp f13466k4;

        /* JADX INFO: renamed from: x1 */
        private C6765kp f13467x1;

        public k4() {
            this.f13466k4 = new C6765kp();
            this.f13467x1 = new C6765kp();
        }

        /* JADX INFO: renamed from: k4 */
        public final String m20103k4() {
            return this.f13466k4.toString();
        }

        /* JADX INFO: renamed from: x1 */
        public final String m20107x1() {
            C6765kp c6765kp = this.f13467x1;
            if (c6765kp == null) {
                return null;
            }
            return c6765kp.toString();
        }

        public k4(String str, String str2) {
            this();
            this.f13466k4.m26792k4(str);
            this.f13467x1.m26792k4(str2);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m20104k4(char c) {
            if (!C14117yj.m67517dy(c)) {
                c = C14117yj.m67538rv(c);
            }
            this.f13466k4.m26780k4(c);
        }

        /* JADX INFO: renamed from: x1 */
        public final void m20108x1(char c) {
            if (this.f13467x1 == null) {
                this.f13467x1 = new C6765kp();
            }
            this.f13467x1.m26780k4(c);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m20105k4(String str) {
            C6765kp c6765kp = this.f13466k4;
            c6765kp.m26809x1(0, c6765kp.m26807x1());
            this.f13466k4.m26792k4(str);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m20106k4(char[] cArr) {
            if (this.f13467x1 == null) {
                this.f13467x1 = new C6765kp();
            }
            this.f13467x1.m26798k4(cArr);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ig.k4$x1 */
    public static class x1 extends List<k4> {
        /* JADX INFO: renamed from: k4 */
        public final boolean m20109k4(String str) {
            Iterator<k4> it = iterator();
            while (it.hasNext()) {
                if (C14113y2.m67363du(it.next().m20103k4(), str)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: x1 */
        public final String m20111x1(String str) {
            for (k4 k4Var : this) {
                if (C14113y2.m67363du(k4Var.m20103k4(), str)) {
                    return k4Var.m20107x1();
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m20110k4(String... strArr) {
            Iterator<k4> it = iterator();
            while (it.hasNext()) {
                if (C11283h4.m54242k4(it.next().m20103k4(), strArr)) {
                    return true;
                }
            }
            return false;
        }
    }

    public AbstractC4841k4(int i) {
        super(i);
        this.f13463k4 = new C6765kp();
        this.f13465to = new x1();
    }

    /* JADX INFO: renamed from: du */
    public final void m20089du() {
        k4 k4Var = new k4();
        this.f13461du = k4Var;
        this.f13465to.addItem(k4Var);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m20090k4() {
        return this.f13463k4.toString();
    }

    /* JADX INFO: renamed from: kk */
    public final x1 m20098kk() {
        return this.f13465to;
    }

    /* JADX INFO: renamed from: to */
    public final C5560wy m20100to() {
        if (this.f13462h4 == null) {
            this.f13462h4 = C5560wy.m22847k4(m20090k4());
        }
        return this.f13462h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m20101x1(char c) {
        this.f13461du.m20104k4(c);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20091k4(char c) {
        if (!C14117yj.m67517dy(c)) {
            c = C14117yj.m67538rv(c);
        }
        this.f13463k4.m26780k4(c);
    }

    /* JADX INFO: renamed from: kk */
    public final void m20099kk(char c) {
        this.f13461du.m20108x1(c);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m20102x1() {
        return this.f13464kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20092k4(InterfaceC12770jd interfaceC12770jd) {
        List list = new List();
        int i = 0;
        while (i < this.f13465to.size()) {
            k4 k4Var = this.f13465to.get_Item(i);
            String strM20103k4 = k4Var.m20103k4();
            if (list.containsItem(strM20103k4)) {
                if (interfaceC12770jd != null) {
                    interfaceC12770jd.m59452k4(new C5536c5((byte) 2, C14113y2.m67402k4("Duplicate attribute name '{0}'", strM20103k4), "", null, null, new C5556up(-1L, -1L, 0L, -1L, null, null)));
                }
                this.f13465to.removeAt(i);
                i--;
            } else {
                list.addItem(k4Var.m20103k4());
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20093k4(String str) {
        C6765kp c6765kp = this.f13463k4;
        c6765kp.m26809x1(0, c6765kp.m26807x1());
        this.f13463k4.m26792k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20094k4(String str, String str2) {
        if (this.f13465to == null) {
            this.f13465to = new x1();
        }
        k4 k4Var = new k4(str, str2);
        this.f13461du = k4Var;
        this.f13465to.addItem(k4Var);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20095k4(boolean z) {
        this.f13464kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20096k4(char[] cArr) {
        this.f13461du.m20106k4(cArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20097k4(C5560wy c5560wy) {
        return m20100to().m22850k4(c5560wy);
    }
}
