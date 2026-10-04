package com.aspose.slides.internal.p140fz;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p180ib.C4804dy;
import com.aspose.slides.internal.p340pm.C9464du;
import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.aspose.slides.internal.fz.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C4150m9 {
    /* JADX INFO: renamed from: k4 */
    private static float m16598k4(C4804dy c4804dy, boolean z) {
        return (z ? c4804dy.m19880kk() : c4804dy.m19879k4().m56930ne()) / 2.0f;
    }

    /* JADX INFO: renamed from: kk */
    public static InterfaceC4146h4 m16607kk(C4804dy c4804dy, C11896dy c11896dy) {
        return m16600k4(c4804dy, c4804dy.m19879k4().m56934up(), false, c11896dy);
    }

    /* JADX INFO: renamed from: to */
    public static InterfaceC4146h4 m16609to(C4804dy c4804dy, C11896dy c11896dy) {
        return m16611x1(c4804dy, c11896dy, false);
    }

    /* JADX INFO: renamed from: x1 */
    public static InterfaceC4146h4 m16610x1(C4804dy c4804dy, C11896dy c11896dy) {
        return m16600k4(c4804dy, c4804dy.m19879k4().m56912fa(), true, c11896dy);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC4146h4 m16599k4(C4804dy c4804dy) {
        return m16608kk(c4804dy, false);
    }

    /* JADX INFO: renamed from: kk */
    private static InterfaceC4146h4 m16608kk(C4804dy c4804dy, boolean z) {
        float fM16598k4 = m16598k4(c4804dy, z);
        C11913yj c11913yjM56940x6 = c4804dy.m19879k4().m56940x6();
        float fM55761jd = (float) c11913yjM56940x6.m55761jd();
        float fM55784up = (float) c11913yjM56940x6.m55784up();
        float fM55759fa = (float) c11913yjM56940x6.m55759fa();
        float fM55756ck = (float) c11913yjM56940x6.m55756ck();
        return (Math.abs(fM55761jd) == 1.0f && Math.abs(fM55784up) == 1.0f && fM55759fa == 0.0f && fM55756ck == 0.0f) ? new C4153x1(fM16598k4) : (fM55759fa == 0.0f && fM55756ck == 0.0f) ? new C4144dy(fM16598k4, fM55761jd, fM55784up) : new C4142ck(C9464du.m46499k4(fM16598k4, fM55761jd, fM55759fa, fM55756ck, fM55784up));
    }

    /* JADX INFO: renamed from: x1 */
    private static InterfaceC4146h4 m16611x1(C4804dy c4804dy, C11896dy c11896dy, boolean z) {
        return m16606k4(c4804dy.m19879k4(), c11896dy) ? m16603k4(c4804dy, m16604k4(c11896dy), z) : m16608kk(c4804dy, z);
    }

    /* JADX INFO: renamed from: k4 */
    private static InterfaceC4146h4 m16600k4(C4804dy c4804dy, int i, boolean z, C11896dy c11896dy) {
        boolean zM55597ck = true;
        if ((i & 240) == 0) {
            return i == 1 ? m16602k4(c4804dy, c11896dy, false) : m16611x1(c4804dy, c11896dy, false);
        }
        if (i == 255) {
            try {
                zM55597ck = true ^ (z ? c4804dy.m19879k4().m56929m9() : c4804dy.m19879k4().m56913h4()).m55597ck();
            } catch (ArgumentException unused) {
            }
        }
        float fM16598k4 = m16598k4(c4804dy, zM55597ck);
        return m16606k4(c4804dy.m19879k4(), c11896dy) ? new C4143du(fM16598k4, m16604k4(c11896dy)) : new C4153x1(fM16598k4);
    }

    /* JADX INFO: renamed from: x1 */
    private static InterfaceC4146h4 m16612x1(C4804dy c4804dy, boolean z) {
        boolean z2;
        boolean z3;
        float fM16598k4 = m16598k4(c4804dy, z);
        C11913yj c11913yjM56940x6 = c4804dy.m19879k4().m56940x6();
        float fM55761jd = (float) c11913yjM56940x6.m55761jd();
        float fM55784up = (float) c11913yjM56940x6.m55784up();
        float fM55759fa = (float) c11913yjM56940x6.m55759fa();
        float fM55756ck = (float) c11913yjM56940x6.m55756ck();
        C9464du c9464duM46499k4 = null;
        if (fM55761jd == 1.0f && fM55784up == 1.0f && fM55759fa == 0.0f && fM55756ck == 0.0f) {
            z2 = true;
            z3 = false;
        } else if (fM55759fa == 0.0f && fM55756ck == 0.0f) {
            z3 = true;
            z2 = false;
        } else {
            c9464duM46499k4 = C9464du.m46499k4(fM16598k4, fM55761jd, fM55759fa, fM55756ck, fM55784up);
            z2 = false;
            z3 = false;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArrM56910du = c4804dy.m19879k4().m56910du();
        for (int i = 0; i < fArrM56910du.length - 1; i++) {
            if (i % 2 == 0) {
                float f = fArrM56910du[i];
                float f2 = fArrM56910du[i + 1];
                arrayList.add(z2 ? new C4151to(fM16598k4, f, f2) : z3 ? new C4141c5(fM16598k4, f, f2, fM55761jd, fM55784up) : new C4145fa(f, f2, c9464duM46499k4));
            }
        }
        return new C4149kk(m16599k4(c4804dy), arrayList);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC4146h4 m16601k4(C4804dy c4804dy, C11896dy c11896dy) {
        return m16602k4(c4804dy, c11896dy, false);
    }

    /* JADX INFO: renamed from: k4 */
    private static InterfaceC4146h4 m16602k4(C4804dy c4804dy, C11896dy c11896dy, boolean z) {
        return m16605k4(c4804dy.m19879k4()) ? m16612x1(c4804dy, z) : m16611x1(c4804dy, c11896dy, z);
    }

    /* JADX INFO: renamed from: k4 */
    private static InterfaceC4146h4 m16603k4(C4804dy c4804dy, boolean z, boolean z2) {
        float fM16598k4 = m16598k4(c4804dy, z2);
        C11913yj c11913yjM56940x6 = c4804dy.m19879k4().m56940x6();
        float fM55761jd = (float) c11913yjM56940x6.m55761jd();
        float fM55784up = (float) c11913yjM56940x6.m55784up();
        float fM55759fa = (float) c11913yjM56940x6.m55759fa();
        float fM55756ck = (float) c11913yjM56940x6.m55756ck();
        return (fM55761jd == 1.0f && fM55784up == 1.0f && fM55759fa == 0.0f && fM55756ck == 0.0f) ? new C4143du(fM16598k4, z) : (fM55759fa == 0.0f && fM55756ck == 0.0f) ? new C4147jd(fM16598k4, z, fM55761jd, fM55784up) : new C4152up(z, C9464du.m46499k4(fM16598k4, fM55761jd, fM55759fa, fM55756ck, fM55784up));
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m16604k4(C11896dy c11896dy) {
        C12025x6 c12025x6;
        C12025x6 c12025x62 = null;
        InterfaceC4413v4 interfaceC4413v4Mo8359kk = c11896dy.m55568ne().mo8359kk(null);
        float[] fArr = new float[6];
        C12025x6 c12025x63 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        while (!interfaceC4413v4Mo8359kk.mo17821x1()) {
            int iMo17818k4 = interfaceC4413v4Mo8359kk.mo17818k4(fArr);
            if (iMo17818k4 == 0) {
                f = fArr[0];
                f2 = fArr[1];
            } else if (iMo17818k4 == 1) {
                float f3 = fArr[0] - f;
                float f4 = fArr[1] - f2;
                if (c12025x62 == null) {
                    c12025x62 = new C12025x6(f3, f4);
                } else {
                    c12025x63 = new C12025x6(f3, f4);
                }
                f = fArr[0];
                f2 = fArr[1];
            } else if (iMo17818k4 == 2) {
                float f5 = fArr[0];
                float f6 = fArr[1];
                float f7 = fArr[2];
                float f8 = fArr[3];
                float f9 = f5 - f;
                float f10 = f6 - f2;
                if (f9 == 0.0f && f10 == 0.0f) {
                    f9 = f7 - f;
                    f10 = f8 - f;
                }
                float f11 = f7 - f5;
                float f12 = f8 - f6;
                if (f11 == 0.0f && f12 == 0.0f) {
                    f11 = f7 - f;
                    f12 = f8 - f2;
                }
                if (c12025x62 == null) {
                    c12025x62 = new C12025x6(f9, f10);
                    c12025x6 = new C12025x6(f11, f12);
                } else {
                    c12025x6 = new C12025x6(f11, f12);
                }
                c12025x63 = c12025x6;
                f = f7;
                f2 = f8;
            } else if (iMo17818k4 != 3) {
                if (iMo17818k4 == 4) {
                    continue;
                }
                interfaceC4413v4Mo8359kk.mo17820kk();
            } else {
                float f13 = fArr[0];
                float f14 = fArr[1];
                float f15 = fArr[2];
                float f16 = fArr[3];
                float f17 = fArr[4];
                float f18 = fArr[5];
                float f19 = f13 - f;
                float f20 = f14 - f2;
                if (f19 == 0.0f && f20 == 0.0f) {
                    f19 = f15 - f;
                    f20 = f16 - f;
                    if (f19 == 0.0f && f20 == 0.0f) {
                        f19 = f17 - f;
                        f20 = f18 - f;
                    }
                }
                float f21 = f17 - f15;
                float f22 = f18 - f16;
                if (f21 == 0.0f && f22 == 0.0f) {
                    f21 = f17 - f13;
                    f22 = f18 - f14;
                    if (f21 == 0.0f && f22 == 0.0f) {
                        f21 = f17 - f;
                        f22 = f18 - f2;
                    }
                }
                if (c12025x62 == null) {
                    c12025x62 = new C12025x6(f19, f20);
                    c12025x63 = new C12025x6(f21, f22);
                } else {
                    c12025x63 = new C12025x6(f21, f22);
                }
                f = f17;
                f2 = f18;
            }
            if (c12025x62 != null && c12025x63 != null) {
                break;
            }
            interfaceC4413v4Mo8359kk.mo17820kk();
        }
        return C9467to.m46526k4(c12025x62.m56897x1(), c12025x62.m56895kk(), c12025x63.m56897x1(), c12025x63.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m16605k4(C12026yj c12026yj) {
        float[] fArrM56910du = c12026yj.m56910du();
        return (fArrM56910du == null || fArrM56910du.length <= 1 || fArrM56910du.length % 2 == 1 || (fArrM56910du.length == 2 && fArrM56910du[0] == 0.0f && fArrM56910du[1] == 1.0f)) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m16606k4(C12026yj c12026yj, C11896dy c11896dy) {
        return (c12026yj.m56917k4() != 1 || m16605k4(c12026yj) || c11896dy.m55566ks()) ? false : true;
    }
}
