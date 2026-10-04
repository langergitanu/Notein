package com.aspose.slides.internal.p213jw;

import com.aspose.slides.internal.p517y2.InterfaceC12789yj;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.yj */
/* JADX INFO: loaded from: classes.dex */
public class C5565yj implements InterfaceC12789yj {

    /* JADX INFO: renamed from: du */
    private String f15322du;

    /* JADX INFO: renamed from: k4 */
    public C5552rv f15323k4;

    /* JADX INFO: renamed from: kk */
    private String f15324kk;

    /* JADX INFO: renamed from: to */
    private String f15325to;

    /* JADX INFO: renamed from: x1 */
    private String f15326x1;

    public C5565yj(String str, String str2, String str3, C5552rv c5552rv) {
        this.f15322du = str;
        this.f15326x1 = str2;
        this.f15325to = str3;
        this.f15323k4 = c5552rv;
    }

    /* JADX INFO: renamed from: du */
    public final String m22873du() {
        return this.f15322du;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m22874h4() {
        if (C14113y2.m67411k4(m22873du())) {
            return true;
        }
        if (!C14113y2.m67411k4(m22878to().m22805to().mo13292k4(m22873du())) && (this.f15323k4.mo22779h4().mo22735x1("xhtml", C14113y2.f47374k4) || this.f15323k4.mo22669x6(m22877kk()))) {
            return true;
        }
        String strM67402k4 = C14113y2.m67402k4("{0}:{1}", this.f15322du, this.f15326x1);
        this.f15326x1 = strM67402k4;
        this.f15324kk = strM67402k4;
        this.f15322du = C14113y2.f47374k4;
        this.f15325to = null;
        return false;
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12789yj
    /* JADX INFO: renamed from: k4 */
    public final String mo22875k4() {
        return this.f15326x1;
    }

    /* JADX INFO: renamed from: kk */
    public final String m22877kk() {
        if (this.f15325to == null) {
            this.f15325to = m22878to().mo22650ne(m22873du());
        }
        return this.f15325to;
    }

    /* JADX INFO: renamed from: to */
    public final C5552rv m22878to() {
        return this.f15323k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m22879x1() {
        String str;
        String str2;
        if (this.f15324kk == null) {
            if (this.f15322du.length() <= 0) {
                str = this.f15326x1;
            } else {
                if (this.f15326x1.length() > 0) {
                    String strM67408k4 = C14113y2.m67408k4(this.f15322du, C18241k5.f55433h, this.f15326x1);
                    synchronized (this.f15323k4.m22796kk()) {
                        try {
                            if (this.f15324kk == null) {
                                this.f15324kk = this.f15323k4.m22796kk().mo65266k4(strM67408k4);
                            }
                            str2 = this.f15324kk;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return str2;
                }
                str = this.f15322du;
            }
            this.f15324kk = str;
        }
        return this.f15324kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m22876k4(String str) {
        this.f15322du = str;
    }
}
