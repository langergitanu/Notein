package com.aspose.slides.internal.p302nm;

import com.aspose.slides.internal.p085dk.C3178to;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.internal.p505xn.C12567ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.nm.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6928x1 {

    /* JADX INFO: renamed from: k4 */
    private boolean f18906k4;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m27190k4(C6924k4 c6924k4, C3178to c3178to, int i) {
        for (int i2 = 0; i2 < c6924k4.m27142x1(); i2++) {
            int i3 = (c6924k4.m27139k4()[i + 1] & 255) + (c6924k4.m27139k4()[i + 2] & 255) + (c6924k4.m27139k4()[i + 3] & 255);
            if (this.f18906k4) {
                if (i3 > 500) {
                    c3178to.m13603k4();
                }
            } else if (i3 < 500) {
            }
            c3178to.m13607x1();
            i += 4;
        }
    }

    /* JADX INFO: renamed from: kk */
    private static C6924k4 m27192kk(C12009k4 c12009k4) throws Throwable {
        C12009k4 c12009k42;
        Throwable th;
        C12009k4 c12009k43 = null;
        try {
            if (c12009k4.mo15753jd() != 2498570) {
                c12009k42 = new C12009k4(c12009k4.mo15760yj(), c12009k4.mo15757m9(), 2498570);
                try {
                    c12009k42.m56332k4(C12567ne.m58657k4(c12009k4), C12567ne.m58660x1(c12009k4));
                    AbstractC12008jd abstractC12008jdM58494k4 = C12549du.m58494k4(c12009k42);
                    try {
                        abstractC12008jdM58494k4.mo17589x1(c12009k4, 0, 0);
                        abstractC12008jdM58494k4.dispose();
                        c12009k43 = c12009k42;
                    } catch (Throwable th2) {
                        if (abstractC12008jdM58494k4 != null) {
                            abstractC12008jdM58494k4.dispose();
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (c12009k42 != c12009k4 && c12009k42 != null) {
                        c12009k42.dispose();
                    }
                    throw th;
                }
            } else {
                c12009k43 = c12009k4;
            }
            C3983k4 c3983k4M56597k4 = c12009k43.m56597k4(new C12014ne(0, 0, c12009k43.mo15760yj(), c12009k43.mo15757m9()), 1, 2498570);
            C6924k4 c6924k4 = new C6924k4(c3983k4M56597k4);
            c12009k43.m56605k4(c3983k4M56597k4);
            if (c12009k43 != c12009k4) {
                c12009k43.dispose();
            }
            return c6924k4;
        } catch (Throwable th4) {
            c12009k42 = c12009k43;
            th = th4;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C12009k4 m27194x1(C12009k4 c12009k4) throws Throwable {
        this.f18906k4 = true;
        C6924k4 c6924k4M27192kk = m27192kk(c12009k4);
        C12009k4 c12009k42 = new C12009k4(c12009k4.mo15760yj(), c12009k4.mo15757m9(), 196865);
        c12009k42.m56332k4(C12567ne.m58657k4(c12009k4), C12567ne.m58660x1(c12009k4));
        C3983k4 c3983k4M56597k4 = c12009k42.m56597k4(new C12014ne(0, 0, c12009k42.mo15760yj(), c12009k42.mo15757m9()), 2, 196865);
        byte[] bArrM27191k4 = m27191k4(c6924k4M27192kk, c3983k4M56597k4.m15715du());
        C3914k4.m15621k4(bArrM27191k4, 0, c3983k4M56597k4.m15721to(), bArrM27191k4.length);
        c12009k42.m56605k4(c3983k4M56597k4);
        return c12009k42;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m27191k4(C6924k4 c6924k4, int i) {
        byte[] bArr = new byte[c6924k4.m27140kk() * i];
        C3178to c3178to = new C3178to(bArr);
        for (int i2 = 0; i2 < c6924k4.m27140kk(); i2++) {
            int iM27141to = c6924k4.m27141to() * i2;
            c3178to.m13604k4(i2 * i);
            m27190k4(c6924k4, c3178to, iM27141to);
        }
        c3178to.m13605kk();
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m27193k4(C12009k4 c12009k4) throws Throwable {
        C6924k4 c6924k4M27192kk = m27192kk(c12009k4);
        return m27191k4(c6924k4M27192kk, (c6924k4M27192kk.m27142x1() / 8) + (c6924k4M27192kk.m27142x1() % 8 > 0 ? 1 : 0));
    }
}
