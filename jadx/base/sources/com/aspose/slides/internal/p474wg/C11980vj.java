package com.aspose.slides.internal.p474wg;

import com.aspose.slides.Collections.Specialized.HybridDictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p029au.AbstractC1562k4;
import com.aspose.slides.internal.p179i9.C4802k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18358t1;
import com.microsoft.identity.common.java.AuthenticationConstants;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.vj */
/* JADX INFO: loaded from: classes5.dex */
public class C11980vj {

    /* JADX INFO: renamed from: du */
    static int f40438du;

    /* JADX INFO: renamed from: h4 */
    static int f40441h4;

    /* JADX INFO: renamed from: jd */
    private static int f40442jd;

    /* JADX INFO: renamed from: kk */
    static AbstractC1562k4 f40444kk;

    /* JADX INFO: renamed from: ks */
    private static AbstractC11940h4 f40445ks;

    /* JADX INFO: renamed from: m9 */
    static C4802k4 f40446m9;

    /* JADX INFO: renamed from: rv */
    private static AbstractC11940h4 f40447rv;

    /* JADX INFO: renamed from: to */
    static boolean f40448to;

    /* JADX INFO: renamed from: x1 */
    static boolean f40450x1;

    /* JADX INFO: renamed from: dy */
    private static final HybridDictionary f40439dy = new HybridDictionary();

    /* JADX INFO: renamed from: c5 */
    private static InterfaceC11929dq f40436c5 = new C11976up();

    /* JADX INFO: renamed from: ck */
    private static int f40437ck = 100000;

    /* JADX INFO: renamed from: fa */
    private static int f40440fa = 0;

    /* JADX INFO: renamed from: up */
    private static boolean f40449up = false;

    /* JADX INFO: renamed from: yj */
    private static int f40451yj = 240;

    /* JADX INFO: renamed from: k4 */
    static boolean f40443k4 = false;

    /* JADX INFO: renamed from: com.aspose.slides.internal.wg.vj$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private C14062gk f40452k4;

        /* JADX INFO: renamed from: kk */
        private boolean f40453kk;

        /* JADX INFO: renamed from: x1 */
        private C14062gk f40454x1;

        public k4(C14062gk c14062gk, C14062gk c14062gk2, boolean z) {
            this.f40452k4 = c14062gk;
            this.f40454x1 = c14062gk2;
            this.f40453kk = z;
        }

        public boolean equals(Object obj) {
            k4 k4Var = (k4) C7019kk.m27452k4(obj, k4.class);
            if (obj != null && this.f40452k4.equals(k4Var.f40452k4) && this.f40453kk == k4Var.f40453kk && m56258k4() == k4Var.m56258k4()) {
                return !m56258k4() || this.f40454x1.equals(k4Var.f40454x1);
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = (this.f40452k4.hashCode() + ((713 + (this.f40453kk ? 1 : 0)) * 31)) * 31;
            C14062gk c14062gk = this.f40454x1;
            return iHashCode + (c14062gk != null ? c14062gk.hashCode() : 0);
        }

        /* JADX INFO: renamed from: k4 */
        public boolean m56258k4() {
            return this.f40454x1 != null;
        }
    }

    static {
        f40442jd = 2;
        C4802k4 c4802k4 = new C4802k4(null);
        f40446m9 = c4802k4;
        f40442jd = C7019kk.m27462to(Long.valueOf(c4802k4.m19872k4(C18358t1.g.f56183c)), 10);
    }

    /* JADX INFO: renamed from: du */
    public static AbstractC11940h4 m56251du() {
        return f40445ks;
    }

    /* JADX INFO: renamed from: h4 */
    public static AbstractC11940h4 m56252h4() {
        return f40447rv;
    }

    @Deprecated
    /* JADX INFO: renamed from: k4 */
    public static InterfaceC11929dq m56253k4() {
        return f40436c5;
    }

    /* JADX INFO: renamed from: kk */
    public static int m56255kk() {
        return f40451yj;
    }

    /* JADX INFO: renamed from: to */
    public static AbstractC1562k4 m56256to() {
        return f40444kk;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m56257x1() {
        return f40449up;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11934f9 m56254k4(C14062gk c14062gk, InterfaceC11968sv interfaceC11968sv) {
        boolean z;
        if (c14062gk == null) {
            throw new ArgumentNullException("address");
        }
        C14062gk c14062gk2 = new C14062gk(C14113y2.m67408k4(c14062gk.m66689ks(), "://", c14062gk.m66688kk()));
        boolean z2 = false;
        if (interfaceC11968sv == null || interfaceC11968sv.mo56113x1(c14062gk)) {
            z = false;
        } else {
            boolean zEquals = AuthenticationConstants.HTTPS_PROTOCOL_STRING.equals(c14062gk.m66689ks());
            c14062gk = interfaceC11968sv.mo56112k4(c14062gk);
            if (!"http".equals(c14062gk.m66689ks()) && !zEquals) {
                throw new NotSupportedException("Proxy scheme not supported.");
            }
            z = true;
            if (zEquals && "http".equals(c14062gk.m66689ks())) {
                z2 = true;
            } else {
                z2 = true;
                z = false;
            }
        }
        C14062gk c14062gk3 = new C14062gk(C14113y2.m67408k4(c14062gk.m66689ks(), "://", c14062gk.m66688kk()));
        k4 k4Var = new k4(c14062gk2, z2 ? c14062gk3 : null, z);
        HybridDictionary hybridDictionary = f40439dy;
        synchronized (hybridDictionary) {
            try {
                C11934f9 c11934f9 = (C11934f9) C7019kk.m27452k4(hybridDictionary.get_Item(k4Var), C11934f9.class);
                if (c11934f9 != null) {
                    return c11934f9;
                }
                if (f40440fa > 0 && hybridDictionary.size() >= f40440fa) {
                    throw new InvalidOperationException("maximum number of service points reached");
                }
                C11934f9 c11934f92 = new C11934f9(c14062gk3, C7019kk.m27462to(Long.valueOf(f40446m9.m19872k4(c14062gk3.toString())), 10), f40437ck);
                c11934f92.m55954k4(f40443k4);
                c11934f92.m55964x1(f40450x1);
                c11934f92.m55961to(z2);
                c11934f92.m55945du(z);
                c11934f92.m55955k4(f40448to, f40438du, f40441h4);
                hybridDictionary.addItem(k4Var, c11934f92);
                return c11934f92;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
