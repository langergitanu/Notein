package com.aspose.slides.internal.p238kt;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.Xml.C13981tl;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.lr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5945lr {

    /* JADX INFO: renamed from: c5 */
    private C5925e0 f16800c5;

    /* JADX INFO: renamed from: du */
    private String f16801du;

    /* JADX INFO: renamed from: dy */
    private C5912ak f16802dy;

    /* JADX INFO: renamed from: h4 */
    private C5914b3 f16803h4;

    /* JADX INFO: renamed from: k4 */
    public C13981tl f16804k4 = null;

    /* JADX INFO: renamed from: kk */
    private String f16805kk;

    /* JADX INFO: renamed from: m9 */
    private C5977x6 f16806m9;

    /* JADX INFO: renamed from: to */
    private String f16807to;

    /* JADX INFO: renamed from: x1 */
    private String f16808x1;

    /* JADX INFO: renamed from: c5 */
    public String m24050c5() {
        return this.f16801du;
    }

    /* JADX INFO: renamed from: ck */
    public C5914b3 m24051ck() {
        return this.f16803h4;
    }

    /* JADX INFO: renamed from: du */
    public void m24052du(String str) {
        this.f16807to = str;
        this.f16804k4 = null;
    }

    /* JADX INFO: renamed from: dy */
    public String m24054dy() {
        return this.f16807to;
    }

    /* JADX INFO: renamed from: fa */
    public C5912ak m24055fa() {
        if (this.f16802dy == null) {
            this.f16802dy = new C5912ak();
        }
        return this.f16802dy;
    }

    /* JADX INFO: renamed from: h4 */
    public String m24056h4() {
        return this.f16808x1;
    }

    /* JADX INFO: renamed from: jd */
    public final C5925e0 m24058jd() {
        if (this.f16800c5 == null) {
            this.f16800c5 = new C5925e0();
        }
        return this.f16800c5;
    }

    /* JADX INFO: renamed from: k4 */
    public void m24059k4(C5914b3 c5914b3) {
        this.f16803h4 = c5914b3;
        this.f16804k4 = null;
    }

    /* JADX INFO: renamed from: kk */
    public void m24062kk(String str) {
        this.f16808x1 = str;
        this.f16804k4 = null;
    }

    /* JADX INFO: renamed from: m9 */
    public String m24063m9() {
        return this.f16805kk;
    }

    /* JADX INFO: renamed from: to */
    public void m24064to(String str) {
        this.f16805kk = str;
        this.f16804k4 = null;
    }

    /* JADX INFO: renamed from: up */
    public C5977x6 m24065up() {
        if (this.f16806m9 == null) {
            this.f16806m9 = new C5977x6();
        }
        return this.f16806m9;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m24053du() {
        return this.f16804k4 != null;
    }

    /* JADX INFO: renamed from: h4 */
    public void m24057h4(String str) {
        this.f16801du = str;
        this.f16804k4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24060k4(C5925e0 c5925e0) {
        this.f16800c5 = c5925e0;
    }

    /* JADX INFO: renamed from: k4 */
    public void m24061k4(C5977x6 c5977x6) {
        if (c5977x6 == null) {
            throw new ArgumentNullException("value");
        }
        this.f16806m9 = c5977x6;
        this.f16804k4 = null;
    }
}
