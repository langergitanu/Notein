package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.lr */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6155lr {

    /* JADX INFO: renamed from: du */
    private AbstractC6211yd f17386du;

    /* JADX INFO: renamed from: h4 */
    private boolean f17387h4;

    /* JADX INFO: renamed from: k4 */
    protected boolean f17388k4;

    /* JADX INFO: renamed from: kk */
    protected boolean f17389kk;

    /* JADX INFO: renamed from: to */
    private String f17390to;

    /* JADX INFO: renamed from: x1 */
    protected boolean f17391x1;

    public AbstractC6155lr(AbstractC6211yd abstractC6211yd, String str) {
        this.f17386du = abstractC6211yd;
        this.f17390to = str;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC6155lr m24907k4(InterfaceC6173qw interfaceC6173qw, AbstractC6211yd abstractC6211yd, String str, AbstractC6123ca abstractC6123ca) {
        if (!"Object".equals(abstractC6123ca.mo24774to())) {
            throw new C6158m4(interfaceC6173qw.mo24981wl().m25165h4("The target object has to be an instance of an object"));
        }
        C6116bs c6116bs = (C6116bs) abstractC6123ca;
        if ((c6116bs.mo25066to("value") || c6116bs.mo25066to("writable")) && (c6116bs.mo25066to("set") || c6116bs.mo25066to("get"))) {
            throw new C6158m4(interfaceC6173qw.mo24981wl().m25165h4("The property cannot be both writable and have get/set accessors or cannot have both a value and an accessor defined"));
        }
        AbstractC6155lr c6165o9 = c6116bs.mo25066to("value") ? new C6165o9(abstractC6211yd, str, c6116bs.mo25032k4("value")) : new C6126dc(interfaceC6173qw, abstractC6211yd, str);
        AbstractC6123ca[] abstractC6123caArr = {null};
        boolean zMo25038k4 = c6116bs.mo25038k4("enumerable", abstractC6123caArr);
        AbstractC6123ca abstractC6123ca2 = abstractC6123caArr[0];
        if (zMo25038k4) {
            c6165o9.m24911k4(abstractC6123ca2.mo24772k4());
        }
        abstractC6123caArr[0] = abstractC6123ca2;
        boolean zMo25038k42 = c6116bs.mo25038k4("configurable", abstractC6123caArr);
        AbstractC6123ca abstractC6123ca3 = abstractC6123caArr[0];
        if (zMo25038k42) {
            c6165o9.m24915x1(abstractC6123ca3.mo24772k4());
        }
        abstractC6123caArr[0] = abstractC6123ca3;
        boolean zMo25038k43 = c6116bs.mo25038k4("writable", abstractC6123caArr);
        AbstractC6123ca abstractC6123ca4 = abstractC6123caArr[0];
        if (zMo25038k43) {
            c6165o9.m24912kk(abstractC6123ca4.mo24772k4());
        }
        abstractC6123caArr[0] = abstractC6123ca4;
        boolean zMo25038k44 = c6116bs.mo25038k4("get", abstractC6123caArr);
        AbstractC6123ca abstractC6123ca5 = abstractC6123caArr[0];
        if (zMo25038k44) {
            C6198wp c6198wp = (C6198wp) C7019kk.m27452k4((Object) abstractC6123ca5, C6198wp.class);
            if (c6198wp == null) {
                throw new C6158m4(interfaceC6173qw.mo24981wl().m25165h4("The getter has to be a function"));
            }
            ((C6126dc) c6165o9).m24801k4(c6198wp);
        }
        abstractC6123caArr[0] = abstractC6123ca5;
        boolean zMo25038k45 = c6116bs.mo25038k4("set", abstractC6123caArr);
        AbstractC6123ca abstractC6123ca6 = abstractC6123caArr[0];
        if (!zMo25038k45) {
            return c6165o9;
        }
        C6198wp c6198wp2 = (C6198wp) C7019kk.m27452k4((Object) abstractC6123ca6, C6198wp.class);
        if (c6198wp2 == null) {
            throw new C6158m4(interfaceC6173qw.mo24981wl().m25165h4("The setter has to be a function"));
        }
        ((C6126dc) c6165o9).m24804x1(c6198wp2);
        return c6165o9;
    }

    /* JADX INFO: renamed from: c5 */
    public abstract AbstractC6155lr mo24796c5();

    /* JADX INFO: renamed from: du */
    public final AbstractC6211yd m24908du() {
        return this.f17386du;
    }

    /* JADX INFO: renamed from: dy */
    public void m24909dy() {
        mo24860to(true);
    }

    /* JADX INFO: renamed from: h4 */
    public boolean mo24859h4() {
        return this.f17387h4;
    }

    /* JADX INFO: renamed from: jd */
    public abstract int mo24799jd();

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC6123ca mo24800k4(AbstractC6211yd abstractC6211yd);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo24802k4(AbstractC6211yd abstractC6211yd, AbstractC6123ca abstractC6123ca);

    /* JADX INFO: renamed from: kk */
    public final void m24912kk(boolean z) {
        this.f17389kk = z;
    }

    /* JADX INFO: renamed from: m9 */
    public abstract boolean mo24803m9();

    /* JADX INFO: renamed from: to */
    public void mo24860to(boolean z) {
        this.f17387h4 = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24915x1(boolean z) {
        this.f17391x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m24910k4() {
        return this.f17390to;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24913kk() {
        return this.f17391x1;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m24914to() {
        return this.f17389kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m24916x1() {
        return this.f17388k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24911k4(boolean z) {
        this.f17388k4 = z;
    }
}
