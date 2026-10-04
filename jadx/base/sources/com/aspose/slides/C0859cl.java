package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.cl */
/* JADX INFO: loaded from: classes3.dex */
class C0859cl {

    /* JADX INFO: renamed from: dy */
    private final Format f4339dy;

    /* JADX INFO: renamed from: k4 */
    private final C13726kf f4341k4;

    /* JADX INFO: renamed from: kk */
    private final ShapeStyle f4342kk;

    /* JADX INFO: renamed from: x1 */
    private final ChartTextFormat f4345x1;

    /* JADX INFO: renamed from: to */
    private final jbq f4344to = new jbq();

    /* JADX INFO: renamed from: du */
    private final jbq f4338du = new jbq();

    /* JADX INFO: renamed from: h4 */
    private final jbq f4340h4 = new jbq();

    /* JADX INFO: renamed from: m9 */
    private final jbq f4343m9 = new jbq();

    public C0859cl(C13726kf c13726kf) {
        this.f4341k4 = c13726kf;
        this.f4339dy = new Format(c13726kf.m63812to());
        this.f4342kk = new ShapeStyle(c13726kf.m63812to());
        this.f4345x1 = new ChartTextFormat(c13726kf.m63812to());
    }

    /* JADX INFO: renamed from: du */
    public final jbq m4612du() {
        return this.f4338du;
    }

    /* JADX INFO: renamed from: dy */
    public final C13726kf m4613dy() {
        return this.f4341k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final jbq m4614h4() {
        return this.f4340h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final ShapeStyle m4615k4() {
        return this.f4342kk;
    }

    /* JADX INFO: renamed from: kk */
    public final ChartTextFormat m4617kk() {
        return this.f4345x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final jbq m4618m9() {
        return this.f4343m9;
    }

    /* JADX INFO: renamed from: to */
    public final jbq m4619to() {
        return this.f4344to;
    }

    /* JADX INFO: renamed from: x1 */
    public final Format m4620x1() {
        return this.f4339dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4616k4(IFormat iFormat, int i) {
        Format formatM6906k4;
        Format format = (Format) C7019kk.m27452k4((Object) iFormat, Format.class);
        if (format == null || (formatM6906k4 = m4613dy().m63812to().m515rv().m6906k4(i)) == null) {
            return;
        }
        format.m1555k4((IFormat) formatM6906k4);
    }
}
