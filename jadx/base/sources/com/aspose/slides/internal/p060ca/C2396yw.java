package com.aspose.slides.internal.p060ca;

import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.yw */
/* JADX INFO: loaded from: classes3.dex */
public class C2396yw extends C2068ei {

    /* JADX INFO: renamed from: to */
    private boolean f8324to = false;

    /* JADX INFO: renamed from: du */
    private Object f8322du = new Object();

    /* JADX INFO: renamed from: kk */
    private C2129ii f8323kk = new C2129ii();

    /* JADX INFO: renamed from: k4 */
    public final C2068ei m11777k4() {
        C2068ei c2068ei = new C2068ei();
        Iterator<T> it = m10468h4().m10362k4().iterator();
        while (it.hasNext()) {
            c2068ei.m10468h4().m10362k4().m11513k4((InterfaceC2196mi) it.next());
        }
        c2068ei.m10470k4(m10479m9());
        c2068ei.m10483x1(m10466dy());
        c2068ei.m10473k4(m10467fa());
        c2068ei.m10484x1(m10464ck());
        c2068ei.m10478kk(m10463c5());
        c2068ei.m10481to(m10469jd());
        return c2068ei;
    }

    @Override // com.aspose.slides.internal.p060ca.C2068ei
    /* JADX INFO: renamed from: kk */
    public C2117hn mo10477kk() {
        if (!this.f8324to) {
            synchronized (this.f8322du) {
                try {
                    if (!this.f8324to) {
                        int i = 0;
                        int i2 = 0;
                        for (C2411zm c2411zm : m11778x1()) {
                            i += ((C2216ni) c2411zm.m11827k4().mo10477kk()).f7672to;
                            i2 += ((C2216ni) c2411zm.m11827k4().mo10477kk()).f7669k4;
                        }
                        C2216ni c2216niM11176kk = C2216ni.m11176kk();
                        c2216niM11176kk.f7666du = new double[i];
                        c2216niM11176kk.f7668h4 = new double[i];
                        c2216niM11176kk.f7670kk = new byte[i];
                        c2216niM11176kk.f7671m9 = new boolean[i];
                        c2216niM11176kk.f7667dy = new boolean[i];
                        c2216niM11176kk.f7673x1 = new int[i2];
                        for (C2411zm c2411zm2 : m11778x1()) {
                            C2372xo c2372xoM11828x1 = c2411zm2.m11828x1();
                            C2216ni c2216ni = (C2216ni) c2411zm2.m11827k4().mo10477kk();
                            for (int i3 = 0; i3 < c2216ni.f7672to; i3++) {
                                double[] dArr = {0.0d};
                                double[] dArr2 = {0.0d};
                                c2372xoM11828x1.m11689k4(c2216ni.f7666du[i3], c2216ni.f7668h4[i3], dArr, dArr2);
                                double d = dArr[0];
                                double d2 = dArr2[0];
                                double[] dArr3 = c2216niM11176kk.f7666du;
                                int i4 = c2216niM11176kk.f7672to;
                                dArr3[i3 + i4] = d;
                                c2216niM11176kk.f7668h4[i3 + i4] = d2;
                                c2216niM11176kk.f7670kk[i3 + i4] = c2216ni.f7670kk[i3];
                                c2216niM11176kk.f7671m9[i3 + i4] = c2216ni.f7671m9[i3];
                                c2216niM11176kk.f7667dy[i4 + i3] = c2216ni.f7667dy[i3];
                            }
                            int i5 = 0;
                            while (true) {
                                int[] iArr = c2216ni.f7673x1;
                                if (i5 < iArr.length) {
                                    c2216niM11176kk.f7673x1[c2216niM11176kk.f7669k4 + i5] = (c2216niM11176kk.f7672to + (iArr[i5] & 65535)) & 65535;
                                    i5++;
                                }
                            }
                            c2216niM11176kk.f7672to += c2216ni.f7672to;
                            c2216niM11176kk.f7669k4 += c2216ni.f7669k4;
                        }
                        this.f7161x1 = c2216niM11176kk;
                        this.f8324to = true;
                    }
                } finally {
                }
            }
        }
        return this.f7161x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C2129ii m11778x1() {
        return this.f8323kk;
    }

    @Override // com.aspose.slides.internal.p060ca.C2068ei
    /* JADX INFO: renamed from: k4 */
    public void mo10475k4(C2117hn c2117hn) {
        this.f7161x1 = c2117hn;
    }
}
