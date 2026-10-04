package com.aspose.slides;

import android.content.Context;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.xi */
/* JADX INFO: loaded from: classes3.dex */
class C14787xi {

    /* JADX INFO: renamed from: ak */
    private double f50081ak;

    /* JADX INFO: renamed from: ar */
    private final C14365qy f50082ar;

    /* JADX INFO: renamed from: b3 */
    private float f50083b3;

    /* JADX INFO: renamed from: ck */
    private Axis f50086ck;

    /* JADX INFO: renamed from: dq */
    private int f50087dq;

    /* JADX INFO: renamed from: fa */
    private boolean f50090fa;

    /* JADX INFO: renamed from: jd */
    private C14245oo f50093jd;

    /* JADX INFO: renamed from: lr */
    private int f50097lr;

    /* JADX INFO: renamed from: ne */
    private double f50099ne;

    /* JADX INFO: renamed from: qq */
    private C12013m9 f50100qq;

    /* JADX INFO: renamed from: um */
    private boolean f50104um;

    /* JADX INFO: renamed from: up */
    private boolean f50105up;

    /* JADX INFO: renamed from: v4 */
    private int f50107v4;

    /* JADX INFO: renamed from: wl */
    private C14697vp f50108wl;

    /* JADX INFO: renamed from: wy */
    private double f50109wy;

    /* JADX INFO: renamed from: x6 */
    private double f50111x6;

    /* JADX INFO: renamed from: xk */
    private int f50112xk;

    /* JADX INFO: renamed from: yd */
    private int f50113yd;

    /* JADX INFO: renamed from: yj */
    private int f50114yj;

    /* JADX INFO: renamed from: ks */
    private boolean f50096ks = true;

    /* JADX INFO: renamed from: rv */
    private boolean f50101rv = true;

    /* JADX INFO: renamed from: ix */
    private int f50092ix = 1;

    /* JADX INFO: renamed from: u4 */
    private boolean f50103u4 = true;

    /* JADX INFO: renamed from: uz */
    private int f50106uz = 1;

    /* JADX INFO: renamed from: k4 */
    float f50094k4 = 0.0f;

    /* JADX INFO: renamed from: x1 */
    float f50110x1 = 0.0f;

    /* JADX INFO: renamed from: kk */
    float f50095kk = 0.0f;

    /* JADX INFO: renamed from: to */
    float f50102to = 0.0f;

    /* JADX INFO: renamed from: du */
    float f50088du = 0.0f;

    /* JADX INFO: renamed from: h4 */
    float f50091h4 = 0.0f;

    /* JADX INFO: renamed from: m9 */
    List<Object> f50098m9 = new List<>();

    /* JADX INFO: renamed from: dy */
    int f50089dy = 0;

    /* JADX INFO: renamed from: c5 */
    boolean f50085c5 = true;

    /* JADX INFO: renamed from: bv */
    private C12023wl f50084bv = new C12023wl();

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C14787xi(Axis axis, C14365qy c14365qy, int i) {
        this.f50090fa = true;
        this.f50082ar = c14365qy;
        if (axis == null) {
            return;
        }
        this.f50114yj = i;
        this.f50086ck = axis;
        if (axis.hasTitle()) {
            this.f50093jd = new C14245oo((ChartTitle) axis.getTitle(), c14365qy, false);
        }
        TextFrameFormat textFrameFormat = (TextFrameFormat) axis.getTextFormat().getTextBlockFormat();
        float rotationAngle = textFrameFormat.getRotationAngle();
        if (!C14064he.m66715kk(rotationAngle) && rotationAngle != -1000.0f) {
            this.f50090fa = false;
            m73394k4(C7019kk.m27462to(Float.valueOf(((TextFrameFormat) axis.getTextFormat().getTextBlockFormat()).getRotationAngle()), 13) * (-1));
        }
        byte bM2958lr = textFrameFormat.m2958lr();
        if (bM2958lr == 1) {
            this.f50090fa = false;
            m73397k4(true);
        } else if (bM2958lr == 2) {
            this.f50090fa = false;
            m73397k4(true);
            m73394k4(m73386h4() + 270);
        } else if (bM2958lr == 3 || bM2958lr == 4 || bM2958lr == 5) {
        }
        m73402kk(axis.getLabelOffset() & 65535);
        if (("".equals(axis.getNumberFormat()) && "General".equals(axis.getNumberFormat())) || axis.isNumberFormatLinkedToSource()) {
            this.f50105up = true;
        }
        m73392k4(axis.getCrossAt());
        m73414to(axis.getMinValue());
        m73381du(axis.getMaxValue());
        m73415to(axis.getMajorUnitScale());
        m73382du(axis.getMinorUnitScale());
        if (!axis.isAutomaticMajorUnit()) {
            if (!axis.isLogarithmic() || axis.getMajorUnit() >= axis.getLogBase()) {
                m73404kk(false);
                m73409m9(axis.getMajorUnit());
            } else {
                m73404kk(true);
            }
        }
        if (!axis.isAutomaticMinorUnit()) {
            m73416to(false);
            m73387h4(axis.getMinorUnit());
        }
        m73388h4((int) axis.getTickLabelSpacing());
        m73383du(axis.isAutomaticTickLabelSpacing());
        this.f50108wl = new C14697vp(this);
        this.f50100qq = c14365qy.m69834fa().m509k4(this.f50086ck.getTextFormat());
    }

    /* JADX INFO: renamed from: xk */
    private C12003du m73372xk() {
        return m73371k4(0.75d, (byte) 0);
    }

    /* JADX INFO: renamed from: ak */
    public final int m73373ak() {
        return m73407m9(m73384dy().getBaseUnitScale());
    }

    /* JADX INFO: renamed from: ar */
    public final double m73374ar() {
        return this.f50111x6;
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m73375b3() {
        boolean z = m73419up() == 0 && this.f50082ar.m69834fa().getChartData().getCategories() != null && this.f50082ar.m69834fa().getChartData().getCategories().getGroupingLevelCount() > 1;
        if (m73384dy() == null || z) {
            return true;
        }
        return m73384dy().getAxisBetweenCategories();
    }

    /* JADX INFO: renamed from: bv */
    public final int m73376bv() {
        return this.f50092ix;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m73377c5() {
        return this.f50090fa;
    }

    /* JADX INFO: renamed from: ck */
    public final int m73378ck() {
        return this.f50113yd;
    }

    /* JADX INFO: renamed from: dq */
    public final double m73379dq() {
        return C14116yg.m67469du(10.0d, -(m73384dy().getDisplayUnit() == 0 ? 0 : m73384dy().getDisplayUnit() + 1));
    }

    /* JADX INFO: renamed from: du */
    public final C12023wl m73380du() {
        return this.f50084bv.Clone();
    }

    /* JADX INFO: renamed from: dy */
    public final Axis m73384dy() {
        return this.f50086ck;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m73385fa() {
        return this.f50105up;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m73386h4() {
        return this.f50107v4;
    }

    /* JADX INFO: renamed from: ix */
    public final double m73389ix() {
        return this.f50081ak;
    }

    /* JADX INFO: renamed from: jd */
    public final int m73390jd() {
        return this.f50097lr;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m73391k4(double d) {
        return C14116yg.m67476k4(d, m73384dy().getLogBase());
    }

    /* JADX INFO: renamed from: kk */
    public final double m73399kk(double d) {
        if (d > m73432yj()) {
            d = m73432yj();
        }
        return d < m73405ks() ? m73405ks() : d;
    }

    /* JADX INFO: renamed from: ks */
    public final double m73405ks() {
        return m73384dy().isLogarithmic() ? m73391k4(m73410ne()) : m73410ne();
    }

    /* JADX INFO: renamed from: lr */
    public final int m73406lr() {
        return this.f50106uz;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m73407m9(int i) {
        if (m73375b3() || m73423wy().m69834fa().hasDataTable()) {
            return C0841c4.m4455k4(i, C7019kk.m27462to(Double.valueOf(m73389ix()), 14), C7019kk.m27462to(Double.valueOf(m73410ne()), 14), C7019kk.m27462to(Double.valueOf(m73389ix()), 14), false) + 1;
        }
        int iM4455k4 = C0841c4.m4455k4(i, C7019kk.m27462to(Double.valueOf(m73389ix()), 14), C7019kk.m27462to(Double.valueOf(m73410ne()), 14), C7019kk.m27462to(Double.valueOf(m73389ix()), 14), false);
        if (iM4455k4 == 0) {
            return 1;
        }
        return iM4455k4;
    }

    /* JADX INFO: renamed from: ne */
    public final double m73410ne() {
        return this.f50109wy;
    }

    /* JADX INFO: renamed from: qq */
    public final boolean m73411qq() {
        return this.f50101rv;
    }

    /* JADX INFO: renamed from: rv */
    public final double m73412rv() {
        return m73384dy().isLogarithmic() ? m73391k4(m73430x6()) : m73430x6();
    }

    /* JADX INFO: renamed from: to */
    public final C12003du m73413to() {
        Chart chartM69834fa = this.f50082ar.m69834fa();
        return chartM69834fa.m507k4(this.f50086ck.getTextFormat(), chartM69834fa.m506k4(chartM69834fa.getStyle() + 1 <= 40 ? (byte) 0 : (byte) 1).Clone().Clone());
    }

    /* JADX INFO: renamed from: u4 */
    public final int m73417u4() {
        return this.f50087dq;
    }

    /* JADX INFO: renamed from: um */
    public final double m73418um() {
        return this.f50099ne;
    }

    /* JADX INFO: renamed from: up */
    public final int m73419up() {
        return this.f50114yj;
    }

    /* JADX INFO: renamed from: uz */
    public final int m73420uz() {
        return this.f50112xk;
    }

    /* JADX INFO: renamed from: v4 */
    public final boolean m73421v4() {
        return this.f50103u4;
    }

    /* JADX INFO: renamed from: wl */
    public final boolean m73422wl() {
        return this.f50096ks;
    }

    /* JADX INFO: renamed from: wy */
    public final C14365qy m73423wy() {
        return this.f50082ar;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m73424x1(double d) {
        return C14116yg.m67469du(m73384dy().getLogBase(), d);
    }

    /* JADX INFO: renamed from: x6 */
    public final float m73430x6() {
        return this.f50083b3;
    }

    /* JADX INFO: renamed from: yd */
    public final C14697vp m73431yd() {
        return this.f50108wl;
    }

    /* JADX INFO: renamed from: yj */
    public final double m73432yj() {
        return m73384dy().isLogarithmic() ? m73391k4(m73389ix()) : m73389ix();
    }

    /* JADX INFO: renamed from: dy */
    private C12003du m73369dy(double d) {
        return m73371k4(d, (byte) 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m73370k4(C14787xi c14787xi, int i) {
        if (c14787xi.m73375b3() || c14787xi.m73423wy().m69834fa().hasDataTable() || (i = i - 1) != 0) {
            return i;
        }
        return 1;
    }

    /* JADX INFO: renamed from: du */
    public final void m73381du(double d) {
        this.f50081ak = d;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m73387h4(double d) {
        this.f50111x6 = d;
        m73416to(false);
    }

    /* JADX INFO: renamed from: kk */
    public final C12013m9 m73400kk() {
        return C12013m9.m56630k4(m73425x1().m56651x1(), (m73425x1().m56639dy() * 0.75f) / im9.m7679k4(), m73425x1().m56642jd());
    }

    /* JADX INFO: renamed from: m9 */
    public final C14245oo m73408m9() {
        return this.f50093jd;
    }

    /* JADX INFO: renamed from: to */
    public final void m73414to(double d) {
        this.f50109wy = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12013m9 m73425x1() {
        return this.f50100qq;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX INFO: renamed from: k4 */
    private C12003du m73371k4(double d, byte b) {
        im9.m7690k4(this.f50082ar.m69834fa().m506k4(b).Clone().Clone(), d);
        return Context.getPackageManager();
    }

    /* JADX INFO: renamed from: du */
    public final void m73382du(int i) {
        this.f50112xk = i;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m73388h4(int i) {
        if (i > 0) {
            this.f50092ix = i;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m73401kk(float f, float f2, float f3, float f4) {
        C12003du c12003duClone = m73369dy(this.f50082ar.m69834fa().getStyle() + 1 <= 40 ? 0.5d : 0.9d).Clone();
        im9.m7710k4(new C12025x6(f, f2), new C12025x6(f3, f4), c12003duClone.Clone(), (LineFormat) m73384dy().getMinorGridLinesFormat().getLine(), this.f50082ar, (LineFormat) C7019kk.m27452k4((Object) this.f50082ar.m69834fa().m513ks().m63816uz().m4620x1().getLine(), LineFormat.class));
    }

    /* JADX INFO: renamed from: m9 */
    public final void m73409m9(double d) {
        this.f50099ne = d;
        if (d > 0.0d) {
            this.f50096ks = false;
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m73415to(int i) {
        this.f50087dq = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73426x1(float f, float f2, float f3, float f4) {
        C12003du c12003duClone = m73372xk().Clone();
        azo azoVarM7683k4 = im9.m7683k4(c12003duClone.Clone(), (LineFormat) m73384dy().getMajorGridLinesFormat().getLine(), this.f50082ar, 1.0f, (LineFormat) C7019kk.m27452k4((Object) this.f50082ar.m69834fa().m513ks().m63813u4().m4620x1().getLine(), LineFormat.class));
        azoVarM7683k4.m3914kk((byte) 2);
        C11896dy c11896dy = new C11896dy();
        try {
            c11896dy.m55547k4(new C12025x6(f, f2), new C12025x6(f3, f4));
            this.f50082ar.m69870wy().mo64338k4((C11896dy) c11896dy.deepClone(), azoVarM7683k4, new C0962es(C12003du.f40505to.Clone()));
        } finally {
            c11896dy.dispose();
        }
    }

    /* JADX INFO: renamed from: du */
    public final void m73383du(boolean z) {
        this.f50103u4 = z;
    }

    /* JADX INFO: renamed from: kk */
    public final void m73402kk(int i) {
        this.f50113yd = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m73416to(boolean z) {
        this.f50101rv = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73427x1(int i) {
        this.f50097lr = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m73403kk(C11896dy c11896dy, float f, float f2) {
        azo azoVarM7683k4 = im9.m7683k4(m73369dy(this.f50082ar.m69834fa().getStyle() + 1 <= 40 ? 0.5d : 0.9d).Clone().Clone(), (LineFormat) m73384dy().getMinorGridLinesFormat().getLine(), this.f50082ar, 1.0f, (LineFormat) C7019kk.m27452k4((Object) this.f50082ar.m69834fa().m513ks().m63816uz().m4620x1().getLine(), LineFormat.class));
        C1236i2 c1236i2M69832dy = this.f50082ar.m69832dy();
        C12007ix c12007ixClone = this.f50082ar.m69855qm().Clone();
        if (this.f50082ar.m69834fa().getRotation3D().getRightAngleAxes()) {
            c11896dy.m55523c5().CloneTo(c12007ixClone);
        }
        c1236i2M69832dy.m7391k4(c12007ixClone.Clone(), (C0962es) null, azoVarM7683k4, c11896dy, f, f2);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73428x1(C11896dy c11896dy, float f, float f2) {
        C12003du c12003duClone = m73372xk().Clone();
        azo azoVarM7683k4 = im9.m7683k4(c12003duClone.Clone(), (LineFormat) m73384dy().getMajorGridLinesFormat().getLine(), this.f50082ar, 1.0f, (LineFormat) C7019kk.m27452k4((Object) this.f50082ar.m69834fa().m513ks().m63813u4().m4620x1().getLine(), LineFormat.class));
        azoVarM7683k4.m3914kk((byte) 2);
        C1236i2 c1236i2M69832dy = this.f50082ar.m69832dy();
        C12007ix c12007ixClone = this.f50082ar.m69855qm().Clone();
        if (this.f50082ar.m69834fa().getRotation3D().getRightAngleAxes()) {
            c11896dy.m55523c5().CloneTo(c12007ixClone);
        }
        c1236i2M69832dy.m7391k4(c12007ixClone.Clone(), (C0962es) null, azoVarM7683k4, c11896dy, f, f2);
    }

    /* JADX INFO: renamed from: kk */
    public final void m73404kk(boolean z) {
        this.f50096ks = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73429x1(boolean z) {
        this.f50090fa = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73392k4(float f) {
        this.f50083b3 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73393k4(float f, float f2, float f3, float f4) {
        byte beginArrowheadStyle;
        C12003du c12003duClone = m73372xk().Clone();
        azo azoVarM7683k4 = im9.m7683k4(c12003duClone.Clone(), (LineFormat) m73384dy().getFormat().getLine(), this.f50082ar, 1.0f, (LineFormat) C7019kk.m27452k4((Object) this.f50082ar.m69834fa().m513ks().m63817v4().m4620x1().getLine(), LineFormat.class));
        int i = this.f50114yj;
        if (i == 0 || i == 1) {
            azoVarM7683k4.m3900du(m73384dy().getFormat().getLine().getEndArrowheadStyle());
            beginArrowheadStyle = m73384dy().getFormat().getLine().getBeginArrowheadStyle();
        } else {
            azoVarM7683k4.m3900du(m73384dy().getFormat().getLine().getBeginArrowheadStyle());
            beginArrowheadStyle = m73384dy().getFormat().getLine().getEndArrowheadStyle();
        }
        azoVarM7683k4.m3921to(beginArrowheadStyle);
        C11896dy c11896dy = new C11896dy();
        try {
            c11896dy.m55547k4(new C12025x6(f, f2), new C12025x6(f3, f4));
            this.f50082ar.m69870wy().mo64338k4((C11896dy) c11896dy.deepClone(), azoVarM7683k4, new C0962es(C12003du.f40505to.Clone()));
        } finally {
            c11896dy.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73394k4(int i) {
        this.f50107v4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73395k4(C11896dy c11896dy, float f, float f2) {
        byte beginArrowheadStyle;
        C12003du c12003duClone = m73372xk().Clone();
        azo azoVarM7683k4 = im9.m7683k4(c12003duClone.Clone(), (LineFormat) m73384dy().getFormat().getLine(), this.f50082ar, 1.0f, (LineFormat) C7019kk.m27452k4((Object) this.f50082ar.m69834fa().m513ks().m63817v4().m4620x1().getLine(), LineFormat.class));
        int i = this.f50114yj;
        if (i == 0 || i == 1) {
            azoVarM7683k4.m3900du(m73384dy().getFormat().getLine().getEndArrowheadStyle());
            beginArrowheadStyle = m73384dy().getFormat().getLine().getBeginArrowheadStyle();
        } else {
            azoVarM7683k4.m3900du(m73384dy().getFormat().getLine().getBeginArrowheadStyle());
            beginArrowheadStyle = m73384dy().getFormat().getLine().getEndArrowheadStyle();
        }
        azoVarM7683k4.m3921to(beginArrowheadStyle);
        C12007ix c12007ixClone = this.f50082ar.m69855qm().Clone();
        C11896dy c11896dy2 = (C11896dy) c11896dy.deepClone();
        try {
            if (this.f50082ar.m69834fa().getRotation3D().getRightAngleAxes()) {
                c11896dy.m55523c5().CloneTo(c12007ixClone);
            }
            this.f50082ar.m69832dy().m7391k4(c12007ixClone.Clone(), (C0962es) null, azoVarM7683k4, c11896dy2, f, f2);
            if (c11896dy2 != null) {
                c11896dy2.dispose();
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73396k4(C12023wl c12023wl) {
        this.f50084bv = c12023wl.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73397k4(boolean z) {
        this.f50104um = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m73398k4() {
        return this.f50104um;
    }
}
