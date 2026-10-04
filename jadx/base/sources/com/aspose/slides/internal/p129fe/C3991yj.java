package com.aspose.slides.internal.p129fe;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p075d5.AbstractC3024x1;
import com.aspose.slides.internal.p183ij.C5062w6;
import com.aspose.slides.internal.p186in.C5105k4;
import com.aspose.slides.internal.p374qz.C9966k4;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.fe.yj */
/* JADX INFO: loaded from: classes.dex */
public final class C3991yj {

    /* JADX INFO: renamed from: k4 */
    C3987rv f10888k4;

    /* JADX INFO: renamed from: x1 */
    C3985ks f10889x1;

    public C3991yj(AbstractC3024x1 abstractC3024x1) {
        if (!(abstractC3024x1 instanceof C5105k4)) {
            this.f10889x1 = new C3985ks();
            C9966k4 c9966k4 = (C9966k4) abstractC3024x1;
            C5062w6 c5062w6M49083jd = c9966k4.m49083jd();
            this.f10889x1.f10857h4 = (int) (((double) c9966k4.as_()) + 0.5d);
            this.f10889x1.f10861m9 = (int) (((double) c9966k4.at_()) + 0.5d);
            this.f10889x1.f10855dy = (int) (((double) c9966k4.mo21943h4()) + 0.5d);
            this.f10889x1.f10852c5 = (int) (((double) c9966k4.mo21949m9()) + 0.5d);
            this.f10889x1.f10862to = c9966k4.mo21941dy();
            this.f10889x1.f10854du = c9966k4.mo21939c5();
            this.f10889x1.f10859k4 = abstractC3024x1.mo12733x1();
            this.f10889x1.f10863x1 = c5062w6M49083jd.m21560lr();
            C3985ks c3985ks = this.f10889x1;
            c3985ks.f10860kk = 1;
            c3985ks.f10858jd = c5062w6M49083jd.m21560lr() + 80;
            C3985ks c3985ks2 = this.f10889x1;
            c3985ks2.f10853ck = 0;
            c3985ks2.f10856fa = 0;
            return;
        }
        C5105k4 c5105k4 = (C5105k4) abstractC3024x1;
        C3987rv c3987rv = new C3987rv();
        this.f10888k4 = c3987rv;
        c3987rv.f10865c5 = c5105k4.mo21949m9();
        this.f10888k4.f10868dy = c5105k4.mo21943h4();
        this.f10888k4.f10870h4 = c5105k4.as_();
        this.f10888k4.f10874m9 = c5105k4.at_();
        this.f10888k4.f10872k4 = abstractC3024x1.mo12733x1();
        this.f10888k4.f10877x1 = ((int) c5105k4.m21944jd().m9451to()) * 2;
        this.f10888k4.f10875to = c5105k4.mo21941dy();
        this.f10888k4.f10867du = c5105k4.mo21939c5();
        C3987rv c3987rv2 = this.f10888k4;
        c3987rv2.f10869fa = 0;
        c3987rv2.f10876up = 0;
        c3987rv2.f10873kk = c5105k4.m21944jd().m9448kk();
        this.f10888k4.f10866ck = ((int) (c5105k4.m21944jd().m9451to() + ((long) c5105k4.m21944jd().m9453x1()))) * 2;
        this.f10888k4.f10871jd = new C3980fa(c5105k4.m21944jd());
    }

    /* JADX INFO: renamed from: k4 */
    public C12014ne m15765k4() {
        if (m15766x1()) {
            C3987rv c3987rv = this.f10888k4;
            return new C12014ne(c3987rv.f10870h4, c3987rv.f10874m9, c3987rv.f10868dy, c3987rv.f10865c5);
        }
        C3985ks c3985ks = this.f10889x1;
        return new C12014ne(c3985ks.f10857h4, c3985ks.f10861m9, c3985ks.f10855dy, c3985ks.f10852c5);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m15766x1() {
        C3987rv c3987rv = this.f10888k4;
        if (c3987rv == null && this.f10889x1 == null) {
            throw new ArgumentException("Invalid state");
        }
        if (c3987rv == null) {
            return false;
        }
        int i = c3987rv.f10872k4;
        return i == 1 || i == 2;
    }
}
