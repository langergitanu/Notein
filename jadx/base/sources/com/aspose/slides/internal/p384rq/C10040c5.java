package com.aspose.slides.internal.p384rq;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.OooOo00;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.C1572x1;
import com.aspose.slides.internal.p046bs.InterfaceC1851x1;
import com.aspose.slides.internal.p182ii.C4888bs;
import com.aspose.slides.internal.p182ii.C4891c5;
import com.aspose.slides.internal.p182ii.C4912kp;
import com.aspose.slides.internal.p182ii.C4920qm;
import com.aspose.slides.internal.p182ii.C4930tq;
import com.aspose.slides.internal.p182ii.C4936v4;
import com.aspose.slides.internal.p182ii.C4946xw;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p237ks.C5909to;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p297ne.C6884yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p405sq.C10316du;
import com.aspose.slides.internal.p405sq.C10317dy;
import com.aspose.slides.internal.p405sq.C10318h4;
import com.aspose.slides.internal.p405sq.C10319k4;
import com.aspose.slides.internal.p405sq.C10320kk;
import com.aspose.slides.internal.p405sq.C10322to;
import com.aspose.slides.internal.p405sq.C10323x1;
import com.aspose.slides.internal.p423to.C11071kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p478wl.C12087ak;
import com.aspose.slides.internal.p478wl.C12088ar;
import com.aspose.slides.internal.p478wl.C12091b3;
import com.aspose.slides.internal.p478wl.C12092b5;
import com.aspose.slides.internal.p478wl.C12094bs;
import com.aspose.slides.internal.p478wl.C12098c4;
import com.aspose.slides.internal.p478wl.C12118g8;
import com.aspose.slides.internal.p478wl.C12120gi;
import com.aspose.slides.internal.p478wl.C12122h4;
import com.aspose.slides.internal.p478wl.C12124ig;
import com.aspose.slides.internal.p478wl.C12129jd;
import com.aspose.slides.internal.p478wl.C12130jf;
import com.aspose.slides.internal.p478wl.C12134k5;
import com.aspose.slides.internal.p478wl.C12145n3;
import com.aspose.slides.internal.p478wl.C12147ne;
import com.aspose.slides.internal.p478wl.C12159qq;
import com.aspose.slides.internal.p478wl.C12164rv;
import com.aspose.slides.internal.p478wl.C12168sv;
import com.aspose.slides.internal.p478wl.C12170tl;
import com.aspose.slides.internal.p478wl.C12173ts;
import com.aspose.slides.internal.p478wl.C12186wl;
import com.aspose.slides.internal.p478wl.C12187wp;
import com.aspose.slides.internal.p478wl.C12188wt;
import com.aspose.slides.internal.p478wl.C12192x3;
import com.aspose.slides.internal.p478wl.C12202yg;
import com.aspose.slides.internal.p478wl.C12205yo;
import com.aspose.slides.internal.p478wl.C12207zd;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.rq.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10040c5 implements IGenericEnumerable<C10049m9> {

    /* JADX INFO: renamed from: kk */
    private static final AbstractC14041ai<C1569kk> f36182kk = new AbstractC14041ai<C1569kk>() { // from class: com.aspose.slides.internal.rq.c5.1
        @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public boolean invoke(C1569kk c1569kk) {
            return OooOo00.OooO0O0(c1569kk) == 6;
        }
    };

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, C10049m9> f36183k4;

    /* JADX INFO: renamed from: x1 */
    private C10043dy f36184x1;

    public C10040c5(C10043dy c10043dy) {
        this.f36183k4 = new Dictionary<>();
        this.f36184x1 = c10043dy;
    }

    /* JADX INFO: renamed from: r5 */
    private String m49362r5(String str) {
        C10049m9 c10049m9M49364zf = m49364zf(str);
        if (c10049m9M49364zf != null) {
            return c10049m9M49364zf.m49668x1();
        }
        return null;
    }

    /* JADX INFO: renamed from: zf */
    private C10049m9 m49364zf(String str) {
        if (this.f36183k4.containsKey(str)) {
            return this.f36183k4.get_Item(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: af */
    public final void m49365af(String str) {
        m49359k4("number-columns-spanned", str);
    }

    /* JADX INFO: renamed from: ai */
    public final void m49366ai(String str) {
        m49359k4("elevation", str);
    }

    /* JADX INFO: renamed from: ak */
    public final void m49367ak(String str) {
        m49359k4("border-right-width", str);
    }

    /* JADX INFO: renamed from: ar */
    public final void m49368ar(String str) {
        m49359k4("border-top-left-radius-h", str);
    }

    /* JADX INFO: renamed from: av */
    public final void m49369av(String str) {
        m49359k4("outline-color", str);
    }

    /* JADX INFO: renamed from: b1 */
    public final void m49370b1(String str) {
        m49359k4("line-stacking-strategy", str);
    }

    /* JADX INFO: renamed from: b3 */
    public final void m49371b3(String str) {
        m49359k4("border-bottom-left-radius-h", str);
    }

    /* JADX INFO: renamed from: b5 */
    public final void m49372b5(String str) {
        m49359k4("rule-style", str);
    }

    /* JADX INFO: renamed from: bg */
    public final void m49373bg(String str) {
        m49359k4("play-during", str);
    }

    /* JADX INFO: renamed from: bs */
    public final void m49374bs(String str) {
        m49359k4("external-destination", str);
    }

    /* JADX INFO: renamed from: bu */
    public final void m49375bu(String str) {
        m49359k4("padding-left", str);
    }

    /* JADX INFO: renamed from: bv */
    public final void m49376bv(String str) {
        m49359k4("border-top-right-radius-h", str);
    }

    /* JADX INFO: renamed from: bz */
    public final void m49377bz(String str) {
        m49359k4("border-width", str);
    }

    /* JADX INFO: renamed from: c4 */
    public final void m49378c4(String str) {
        m49359k4("outline-width", str);
    }

    /* JADX INFO: renamed from: c5 */
    public final String m49379c5() {
        return m49362r5("margin-left");
    }

    /* JADX INFO: renamed from: c6 */
    public final void m49381c6(String str) {
        m49359k4("border-top-color", str);
    }

    /* JADX INFO: renamed from: ca */
    public final void m49382ca(String str) {
        m49359k4("end-indent", str);
    }

    /* JADX INFO: renamed from: cj */
    public final void m49383cj(String str) {
        m49359k4("unicode-bidi", str);
    }

    /* JADX INFO: renamed from: ck */
    public final String m49384ck() {
        return m49362r5("margin-top");
    }

    /* JADX INFO: renamed from: cw */
    public final void m49386cw(String str) {
        m49359k4("word-spacing", str);
    }

    /* JADX INFO: renamed from: d3 */
    public final void m49387d3(String str) {
        m49359k4("richness", str);
    }

    /* JADX INFO: renamed from: d4 */
    public final void m49388d4(String str) {
        m49359k4("margin-top", str);
    }

    /* JADX INFO: renamed from: dc */
    public final void m49389dc(String str) {
        m49359k4("margin-right", str);
    }

    /* JADX INFO: renamed from: dl */
    public final void m49390dl(String str) {
        m49359k4("page-break-after", str);
    }

    /* JADX INFO: renamed from: dq */
    public final void m49391dq(String str) {
        m49359k4("border-spacing", str);
    }

    /* JADX INFO: renamed from: dt */
    public final void m49392dt(String str) {
        m49359k4("text-shadow", str);
    }

    /* JADX INFO: renamed from: du */
    public final String m49393du() {
        return m49362r5("font-size");
    }

    /* JADX INFO: renamed from: dw */
    public final void m49395dw(String str) {
        m49359k4("page-position", str);
    }

    /* JADX INFO: renamed from: dy */
    public final String m49396dy() {
        return m49362r5("margin-bottom");
    }

    /* JADX INFO: renamed from: e0 */
    public final void m49398e0(String str) {
        m49359k4("border-top-width", str);
    }

    /* JADX INFO: renamed from: e8 */
    public final void m49399e8(String str) {
        m49359k4("pitch-range", str);
    }

    /* JADX INFO: renamed from: ei */
    public final void m49400ei(String str) {
        m49359k4("html-body", str);
    }

    /* JADX INFO: renamed from: em */
    public final void m49401em(String str) {
        m49359k4("display-align", str);
    }

    /* JADX INFO: renamed from: ew */
    public final void m49402ew(String str) {
        m49359k4("right", str);
    }

    /* JADX INFO: renamed from: f7 */
    public final void m49403f7(String str) {
        m49359k4("page-break-before", str);
    }

    /* JADX INFO: renamed from: f9 */
    public final void m49404f9(String str) {
        m49359k4("column-gap", str);
    }

    /* JADX INFO: renamed from: fa */
    public final String m49405fa() {
        return m49362r5("padding-bottom");
    }

    /* JADX INFO: renamed from: g8 */
    public final void m49407g8(String str) {
        m49359k4("break-after", str);
    }

    /* JADX INFO: renamed from: ga */
    public final void m49408ga(String str) {
        m49359k4("vertical-align", str);
    }

    /* JADX INFO: renamed from: gf */
    public final void m49409gf(String str) {
        m49359k4("font-variant", str);
    }

    /* JADX INFO: renamed from: gi */
    public final void m49410gi(String str) {
        m49359k4("color", str);
    }

    /* JADX INFO: renamed from: gk */
    public final void m49411gk(String str) {
        m49359k4("height", str);
    }

    /* JADX INFO: renamed from: h4 */
    public final String m49412h4() {
        return m49362r5("height");
    }

    /* JADX INFO: renamed from: he */
    public final void m49414he(String str) {
        m49359k4("float", str);
    }

    /* JADX INFO: renamed from: hq */
    public final void m49415hq(String str) {
        m49359k4("white-space-collapse", str);
    }

    /* JADX INFO: renamed from: ig */
    public final void m49416ig(String str) {
        m49359k4("font-weight", str);
    }

    /* JADX INFO: renamed from: ii */
    public final void m49417ii(String str) {
        m49359k4("margin-left", str);
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C10049m9> iterator() {
        return this.f36183k4.getValues().iterator();
    }

    /* JADX INFO: renamed from: ix */
    public final String m49418ix() {
        return m49362r5("width");
    }

    /* JADX INFO: renamed from: j2 */
    public final void m49420j2(String str) {
        m49359k4("control-selected", str);
    }

    /* JADX INFO: renamed from: j5 */
    public final void m49421j5(String str) {
        m49359k4("font-size-adjust", str);
    }

    /* JADX INFO: renamed from: jd */
    public final String m49422jd() {
        return m49362r5("margin-right");
    }

    /* JADX INFO: renamed from: jf */
    public final void m49424jf(String str) {
        m49359k4("outline-style", str);
    }

    /* JADX INFO: renamed from: jm */
    public final void m49425jm(String str) {
        m49359k4("text-indent", str);
    }

    /* JADX INFO: renamed from: jw */
    public final void m49426jw(String str) {
        m49359k4("flow-name", str);
    }

    /* JADX INFO: renamed from: k1 */
    public final void m49427k1(String str) {
        m49359k4("table-layout", str);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10040c5 m49428k4(C10040c5 c10040c5) {
        IGenericEnumerator<C10049m9> it = c10040c5.iterator();
        while (it.hasNext()) {
            try {
                C10049m9 next = it.next();
                m49359k4(next.m49666k4(), next.m49668x1());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: k5 */
    public final void m49432k5(String str) {
        m49359k4(RequestParameters.POSITION, str);
    }

    /* JADX INFO: renamed from: kk */
    public final String m49433kk() {
        return m49362r5("color");
    }

    /* JADX INFO: renamed from: kp */
    public final void m49435kp(String str) {
        m49359k4("clip", str);
    }

    /* JADX INFO: renamed from: ks */
    public final String m49436ks() {
        return m49362r5("padding-top");
    }

    /* JADX INFO: renamed from: li */
    public final void m49438li(String str) {
        m49359k4("word-break", str);
    }

    /* JADX INFO: renamed from: lm */
    public final void m49439lm(String str) {
        m49359k4("overflow", str);
    }

    /* JADX INFO: renamed from: lr */
    public final void m49440lr(String str) {
        m49359k4("border-bottom-right-radius-h", str);
    }

    /* JADX INFO: renamed from: ly */
    public final void m49441ly(String str) {
        m49359k4("page-break-inside", str);
    }

    /* JADX INFO: renamed from: m2 */
    public final void m49442m2(String str) {
        m49359k4("font-size", str);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m49443m4(String str) {
        m49359k4("font-family", str);
    }

    /* JADX INFO: renamed from: m9 */
    public final String m49444m9() {
        return m49362r5("left");
    }

    /* JADX INFO: renamed from: my */
    public final void m49446my(String str) {
        m49359k4("line-height", str);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m49447n0(String str) {
        m49359k4("text-transform", str);
    }

    /* JADX INFO: renamed from: n3 */
    public final void m49448n3(String str) {
        m49359k4("src", str);
    }

    /* JADX INFO: renamed from: na */
    public final void m49449na(String str) {
        m49359k4("leader-length", str);
    }

    /* JADX INFO: renamed from: ne */
    public final String m49450ne() {
        return m49362r5("top");
    }

    /* JADX INFO: renamed from: nh */
    public final void m49452nh(String str) {
        m49359k4("padding-right", str);
    }

    /* JADX INFO: renamed from: nk */
    public final void m49453nk(String str) {
        m49359k4("scaling", str);
    }

    /* JADX INFO: renamed from: nv */
    public final void m49454nv(String str) {
        m49359k4("font-stretch", str);
    }

    /* JADX INFO: renamed from: o3 */
    public final void m49455o3(String str) {
        m49359k4("top", str);
    }

    /* JADX INFO: renamed from: o9 */
    public final void m49456o9(String str) {
        m49359k4("padding-top", str);
    }

    /* JADX INFO: renamed from: os */
    public final void m49457os(String str) {
        m49359k4(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, str);
    }

    /* JADX INFO: renamed from: ou */
    public final void m49458ou(String str) {
        m49359k4("padding", str);
    }

    /* JADX INFO: renamed from: ph */
    public final void m49459ph(String str) {
        m49359k4("background-all-page", str);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m49460q3(String str) {
        m49359k4("pitch", str);
    }

    /* JADX INFO: renamed from: q6 */
    public final void m49461q6(String str) {
        m49359k4("page-height", str);
    }

    /* JADX INFO: renamed from: qk */
    public final void m49462qk(String str) {
        m49359k4("min-height", str);
    }

    /* JADX INFO: renamed from: qm */
    public final void m49463qm(String str) {
        m49359k4("bottom", str);
    }

    /* JADX INFO: renamed from: qn */
    public final void m49464qn(String str) {
        m49359k4("max-width", str);
    }

    /* JADX INFO: renamed from: qq */
    public final void m49465qq(String str) {
        m49359k4("border-right-style", str);
    }

    /* JADX INFO: renamed from: qw */
    public final void m49466qw(String str) {
        m49359k4("control-height", str);
    }

    /* JADX INFO: renamed from: r7 */
    public final void m49467r7(String str) {
        m49359k4("rule-thickness", str);
    }

    /* JADX INFO: renamed from: ri */
    public final void m49468ri(String str) {
        m49359k4("empty-cells", str);
    }

    /* JADX INFO: renamed from: rq */
    public final void m49469rq(String str) {
        m49359k4("min-width", str);
    }

    /* JADX INFO: renamed from: rs */
    public final void m49470rs(String str) {
        m49359k4("widows", str);
    }

    /* JADX INFO: renamed from: rv */
    public final String m49471rv() {
        return m49362r5(RequestParameters.POSITION);
    }

    /* JADX INFO: renamed from: s7 */
    public final void m49473s7(String str) {
        m49359k4("column-count", str);
    }

    /* JADX INFO: renamed from: sc */
    public final void m49474sc(String str) {
        m49359k4("white-space", str);
    }

    /* JADX INFO: renamed from: so */
    public final void m49475so(String str) {
        m49359k4("width", str);
    }

    /* JADX INFO: renamed from: sq */
    public final void m49476sq(String str) {
        m49359k4("odd-or-even", str);
    }

    /* JADX INFO: renamed from: ss */
    public final void m49477ss(String str) {
        m49359k4("clear", str);
    }

    /* JADX INFO: renamed from: sv */
    public final void m49478sv(String str) {
        m49359k4("break-before", str);
    }

    /* JADX INFO: renamed from: sz */
    public final void m49479sz(String str) {
        m49359k4("visibility", str);
    }

    /* JADX INFO: renamed from: t6 */
    public final void m49480t6(String str) {
        m49359k4("column-width", str);
    }

    /* JADX INFO: renamed from: tl */
    public final void m49481tl(String str) {
        m49359k4("page-width", str);
    }

    /* JADX INFO: renamed from: to */
    public final String m49482to() {
        return m49362r5("control-width");
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        IGenericEnumerator<C10049m9> it = iterator();
        while (it.hasNext()) {
            try {
                C10049m9 next = it.next();
                c6765kp.m26796k4("{0}=\"{1}\" ", next.m49666k4(), next.m49668x1());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c6765kp.m26807x1() == 0 ? C14113y2.f47374k4 : c6765kp.m26800k4(0, c6765kp.m26807x1() - 1);
    }

    /* JADX INFO: renamed from: tq */
    public final void m49484tq(String str) {
        m49359k4("control-value", str);
    }

    /* JADX INFO: renamed from: ts */
    public final void m49485ts(String str) {
        m49359k4("border-top-style", str);
    }

    /* JADX INFO: renamed from: tw */
    public final void m49486tw(String str) {
        m49359k4("text-align-last", str);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m49487u1(String str) {
        m49359k4("left", str);
    }

    /* JADX INFO: renamed from: u4 */
    public final void m49488u4(String str) {
        m49359k4("border-left-style", str);
    }

    /* JADX INFO: renamed from: u5 */
    public final void m49489u5(String str) {
        m49359k4("orphans", str);
    }

    /* JADX INFO: renamed from: um */
    public final void m49490um(String str) {
        m49359k4("border-top-left-radius-w", str);
    }

    /* JADX INFO: renamed from: up */
    public final String m49491up() {
        return m49362r5("padding-left");
    }

    /* JADX INFO: renamed from: uw */
    public final void m49493uw(String str) {
        m49359k4("writing-mode", str);
    }

    /* JADX INFO: renamed from: uz */
    public final void m49494uz(String str) {
        m49359k4("border-left-width", str);
    }

    /* JADX INFO: renamed from: v4 */
    public final void m49495v4(String str) {
        m49359k4("border-top-right-radius-w", str);
    }

    /* JADX INFO: renamed from: vh */
    public final void m49496vh(String str) {
        m49359k4("control-type", str);
    }

    /* JADX INFO: renamed from: vj */
    public final void m49497vj(String str) {
        m49359k4("content-width", str);
    }

    /* JADX INFO: renamed from: vt */
    public final void m49498vt(String str) {
        m49359k4("max-height", str);
    }

    /* JADX INFO: renamed from: vw */
    public final void m49499vw(String str) {
        m49359k4("master-reference", str);
    }

    /* JADX INFO: renamed from: w6 */
    public final void m49500w6(String str) {
        m49359k4("control-width", str);
    }

    /* JADX INFO: renamed from: wl */
    public final void m49501wl(String str) {
        m49359k4("border-right-color", str);
    }

    /* JADX INFO: renamed from: wp */
    public final void m49502wp(String str) {
        m49359k4("caption-side", str);
    }

    /* JADX INFO: renamed from: wt */
    public final void m49503wt(String str) {
        m49359k4("text-align", str);
    }

    /* JADX INFO: renamed from: wy */
    public final void m49504wy(String str) {
        m49359k4("border-bottom-left-radius-w", str);
    }

    /* JADX INFO: renamed from: wz */
    public final void m49505wz(String str) {
        m49359k4("leader-pattern", str);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m49506x1() {
        return m49362r5("border-top-width");
    }

    /* JADX INFO: renamed from: x3 */
    public final void m49508x3(String str) {
        m49359k4("number-rows-spanned", str);
    }

    /* JADX INFO: renamed from: x5 */
    public final void m49509x5(String str) {
        m49359k4("id", str);
    }

    /* JADX INFO: renamed from: x6 */
    public final String m49510x6() {
        return m49362r5("text-align");
    }

    /* JADX INFO: renamed from: xb */
    public final void m49512xb(String str) {
        m49359k4("z-index", str);
    }

    /* JADX INFO: renamed from: xi */
    public final void m49513xi(String str) {
        m49359k4("padding-bottom", str);
    }

    /* JADX INFO: renamed from: xk */
    public final void m49514xk(String str) {
        m49359k4("border-style", str);
    }

    /* JADX INFO: renamed from: xw */
    public final void m49515xw(String str) {
        m49359k4("content-height", str);
    }

    /* JADX INFO: renamed from: y2 */
    public final void m49516y2(String str) {
        m49359k4("font", str);
    }

    /* JADX INFO: renamed from: y4 */
    public final void m49517y4(String str) {
        m49359k4("master-name", str);
    }

    /* JADX INFO: renamed from: y6 */
    public final void m49518y6(String str) {
        m49359k4("text-decoration", str);
    }

    /* JADX INFO: renamed from: y9 */
    public final void m49519y9(String str) {
        m49359k4("font-style", str);
    }

    /* JADX INFO: renamed from: yd */
    public final void m49520yd(String str) {
        m49359k4("border-bottom-right-radius-w", str);
    }

    /* JADX INFO: renamed from: yg */
    public final void m49521yg(String str) {
        m49359k4("linefeed-treatment", str);
    }

    /* JADX INFO: renamed from: yj */
    public final String m49522yj() {
        return m49362r5("padding-right");
    }

    /* JADX INFO: renamed from: yn */
    public final void m49524yn(String str) {
        m49359k4("letter-spacing", str);
    }

    /* JADX INFO: renamed from: yo */
    public final void m49525yo(String str) {
        m49359k4("isLegend", str);
    }

    /* JADX INFO: renamed from: yw */
    public final void m49526yw(String str) {
        m49359k4("margin", str);
    }

    /* JADX INFO: renamed from: z7 */
    public final void m49527z7(String str) {
        m49359k4("white-space-treatment", str);
    }

    /* JADX INFO: renamed from: zd */
    public final void m49528zd(String str) {
        m49359k4("start-indent", str);
    }

    /* JADX INFO: renamed from: ze */
    public final void m49529ze(String str) {
        m49359k4("wrap-option", str);
    }

    /* JADX INFO: renamed from: zj */
    public final void m49530zj(String str) {
        m49359k4("dominant-baseline", str);
    }

    /* JADX INFO: renamed from: zm */
    public final void m49531zm(String str) {
        m49359k4("margin-bottom", str);
    }

    public C10040c5(C10043dy c10043dy, C1569kk c1569kk, InterfaceC1851x1 interfaceC1851x1) {
        this(c10043dy, c1569kk, c1569kk.m8445t6(), interfaceC1851x1);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m49380c5(String str) {
        m49359k4("background-position-vertical", str);
    }

    /* JADX INFO: renamed from: ck */
    public final void m49385ck(String str) {
        m49359k4("baseline-shift", str);
    }

    /* JADX INFO: renamed from: du */
    public final void m49394du(String str) {
        m49359k4("background-attachment", str);
    }

    /* JADX INFO: renamed from: dy */
    public final void m49397dy(String str) {
        m49359k4("background-position-horizontal", str);
    }

    /* JADX INFO: renamed from: fa */
    public final void m49406fa(String str) {
        m49359k4("border", str);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m49413h4(String str) {
        m49359k4("background-color", str);
    }

    /* JADX INFO: renamed from: ix */
    public final void m49419ix(String str) {
        m49359k4("border-left-color", str);
    }

    /* JADX INFO: renamed from: jd */
    public final void m49423jd(String str) {
        m49359k4("background-repeat", str);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m49429k4() {
        return m49362r5("border-top-style");
    }

    /* JADX INFO: renamed from: kk */
    public final void m49434kk(String str) {
        m49359k4("azimuth", str);
    }

    /* JADX INFO: renamed from: ks */
    public final void m49437ks(String str) {
        m49359k4("border-bottom-style", str);
    }

    /* JADX INFO: renamed from: m9 */
    public final void m49445m9(String str) {
        m49359k4("background-image", str);
    }

    /* JADX INFO: renamed from: ne */
    public final void m49451ne(String str) {
        m49359k4("border-color", str);
    }

    /* JADX INFO: renamed from: rv */
    public final void m49472rv(String str) {
        m49359k4("border-bottom-width", str);
    }

    /* JADX INFO: renamed from: to */
    public final void m49483to(String str) {
        m49359k4("background", str);
    }

    /* JADX INFO: renamed from: up */
    public final void m49492up(String str) {
        m49359k4("border-bottom", str);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m49507x1(String str) {
        m49359k4("alignment-baseline", str);
    }

    /* JADX INFO: renamed from: x6 */
    public final void m49511x6(String str) {
        m49359k4("border-collapse", str);
    }

    /* JADX INFO: renamed from: yj */
    public final void m49523yj(String str) {
        m49359k4("border-bottom-color", str);
    }

    public C10040c5(C10043dy c10043dy, C1569kk c1569kk, C5909to c5909to, InterfaceC1851x1 interfaceC1851x1) {
        this(c10043dy);
        m49430k4(c1569kk, c5909to, interfaceC1851x1);
    }

    /* JADX INFO: renamed from: x1 */
    private static <TParent extends C12804k4> boolean m49363x1(Class<TParent> cls, C12804k4 c12804k4) {
        while (c12804k4 != null) {
            if (c12804k4.mo22631g8() != null) {
                if (c12804k4.mo22195u4() != null) {
                    return false;
                }
                if (c12804k4.mo22631g8().mo22608fa() == 3 && C14113y2.m67440x1(c12804k4.mo22631g8().mo22607e0()).length() != 0) {
                    return false;
                }
            }
            if (c12804k4.mo22646kp() == null || c12804k4.mo22646kp().mo22608fa() != 1) {
                return false;
            }
            c12804k4 = (C12804k4) c12804k4.mo22646kp();
            if (C7019kk.m27469x1(c12804k4, cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49430k4(C1569kk c1569kk, C5909to c5909to, InterfaceC1851x1 interfaceC1851x1) {
        String string;
        String strM50307k4;
        String strM49412h4;
        String string2;
        String string3;
        String strM50307k42;
        String strM53504k4;
        String strM53504k42;
        String str;
        String strM49418ix;
        String strM50307k43;
        String strM50307k44;
        String strM50307k45;
        m49509x5(this.f36184x1.m49632k4().m8113k4(c1569kk));
        IGenericEnumerator<Integer> it = c5909to.m23873y9().iterator();
        while (it.hasNext()) {
            try {
                int iIntValue = ((Integer) C7019kk.m27464to(it.next(), Integer.TYPE)).intValue();
                if (c5909to.m23769k4(iIntValue, c1569kk) && (!C7019kk.m27469x1(c1569kk, C4936v4.class) || (62 != iIntValue && 54 != iIntValue && 37 != iIntValue && 49 != iIntValue))) {
                    if (iIntValue == 3) {
                        m49431k4(c5909to.m23817du().toString());
                    } else if (iIntValue == 4) {
                        m49507x1(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12122h4.class), c5909to.m23826h4()));
                    } else if (iIntValue == 17) {
                        m49483to(c5909to.m23818dy().toString());
                    } else if (iIntValue == 18) {
                        m49394du(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12129jd.class), c5909to.m23818dy().m26911du()));
                    } else if (iIntValue != 20) {
                        if (iIntValue == 21) {
                            m49445m9(new C10319k4(c1569kk, interfaceC1851x1, this.f36184x1).m50306k4());
                        } else if (iIntValue == 23) {
                            m49397dy(c5909to.m23818dy().m26914kk().m54606m9().toString());
                            m49380c5(c5909to.m23818dy().m26914kk().m54605dy().toString());
                        } else if (iIntValue == 24) {
                            m49423jd(new C10323x1(c1569kk).m50313k4());
                        } else if (iIntValue == 100) {
                            m49366ai(c5909to.m23846qq().toString());
                        } else if (iIntValue != 101) {
                            switch (iIntValue) {
                                case 15:
                                    m49434kk(c5909to.m23841m9().toString());
                                    break;
                                case 26:
                                    m49385ck(c5909to.m23812c5().toString());
                                    break;
                                case 32:
                                    m49406fa(c5909to.m23831jd().toString());
                                    break;
                                case 33:
                                    m49492up(c5909to.m23831jd().m26944to().toString());
                                    break;
                                case 34:
                                    strM50307k4 = new C10320kk(c1569kk, c5909to.m23831jd().m26944to().m26917k4().Clone()).m50307k4();
                                    m49523yj(strM50307k4);
                                    break;
                                case 35:
                                    m49371b3(c5909to.m23831jd().m26943m9().m26933to().m54577m9().toString());
                                    m49504wy(c5909to.m23831jd().m26943m9().m26933to().m54576dy().toString());
                                    break;
                                case 36:
                                    m49440lr(c5909to.m23831jd().m26943m9().m26932kk().m54577m9().toString());
                                    m49520yd(c5909to.m23831jd().m26943m9().m26932kk().m54576dy().toString());
                                    break;
                                case 37:
                                    m49437ks(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12147ne.class), c5909to.m23831jd().m26944to().m26918kk()));
                                    strM50307k4 = new C10320kk(c1569kk, c5909to.m23831jd().m26944to().m26917k4().Clone()).m50307k4();
                                    m49523yj(strM50307k4);
                                    break;
                                case 38:
                                    m49472rv(c5909to.m23831jd().m26944to().m26919x1().toString());
                                    break;
                                case 39:
                                    m49511x6(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12164rv.class), c5909to.m23831jd().m26939du()));
                                    break;
                                case 65:
                                    m49463qm(c5909to.m23815ck().toString());
                                    break;
                                case 75:
                                    m49404f9(c5909to.m23869x6().m26897kk().toString());
                                    break;
                                case 82:
                                    m49480t6(c5909to.m23869x6().m26896k4().toString());
                                    break;
                                case 91:
                                    m49493uw(c5909to.m23857u4() == 0 ? "lr-tb" : "rl-tb");
                                    m49457os(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12091b3.class), c5909to.m23857u4()));
                                    break;
                                case 93:
                                    m49530zj(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12087ak.class), c5909to.m23865wl()));
                                    break;
                                case 111:
                                    if (c5909to.m23858um() != 2) {
                                        m49414he(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12118g8.class), c5909to.m23858um()));
                                    }
                                    break;
                                case 113:
                                    m49516y2(c5909to.m23810bv().toString());
                                    break;
                                case 114:
                                    m49443m4(new C10322to(c1569kk).m50312k4());
                                    break;
                                case 116:
                                    m49442m2(new C10316du(c1569kk).m50302k4());
                                    break;
                                case 117:
                                    m49421j5(c5909to.m23810bv().m26924kk().toString());
                                    break;
                                case 118:
                                    m49454nv(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12168sv.class), c5909to.m23810bv().m26925m9()));
                                    break;
                                case 119:
                                    m49519y9(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12187wp.class), c5909to.m23810bv().m26926to()));
                                    break;
                                case 121:
                                    m49409gf(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12120gi.class), c5909to.m23810bv().m26921du().m26899k4()));
                                    break;
                                case 127:
                                    m49416ig(new C10318h4(c1569kk).m50305k4());
                                    break;
                                case 142:
                                    if (c1569kk.m8445t6().m23853t6() != 2) {
                                        C1569kk c1569kk2 = (C1569kk) C7019kk.m27452k4((Object) c1569kk.mo22646kp(), C1569kk.class);
                                        if (c5909to.m23861v4().m54596m9() || c5909to.m23861v4().m54595dy().m26946k4() != 1 || c1569kk2 == null) {
                                            m49411gk(c5909to.m23861v4().toString());
                                            strM49412h4 = m49412h4();
                                        } else if (!c1569kk2.m8445t6().m23861v4().m54596m9() && c1569kk2.m8445t6().m23861v4().m54595dy().m26946k4() != 1) {
                                            m49411gk(new C6884yj((c1569kk2.m8445t6().m23861v4().m54595dy().m26948x1() / 100.0f) * c5909to.m23861v4().m54595dy().m26948x1(), c1569kk2.m8445t6().m23861v4().m54595dy().m26946k4()).toString());
                                            strM49412h4 = m49412h4();
                                        } else if (C14113y2.m67449x1(c1569kk2.mo22700du(), "body", (short) 5)) {
                                            string2 = c5909to.m23861v4().toString();
                                        }
                                        m49515xw(strM49412h4);
                                    } else {
                                        string2 = c5909to.m23861v4().toString();
                                    }
                                    m49411gk(string2);
                                    break;
                                case 150:
                                    m49487u1(c5909to.m23838lr().toString());
                                    break;
                                case 151:
                                    m49524yn(c5909to.m23874yd().toString());
                                    break;
                                case 153:
                                    m49446my(c5909to.m23808b3().toString());
                                    break;
                                case 157:
                                    m49370b1(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12094bs.class), c5909to.m23867wy().m26892k4()));
                                    break;
                                case 162:
                                    m49526yw(c5909to.m23816dq().toString());
                                    break;
                                case 163:
                                    if (!"P".equals(c1569kk.mo22700du()) || c1569kk.mo22669x6(c1569kk.mo22634jd())) {
                                        if (!c5909to.m23816dq().m26908kk().m54600m9() && c5909to.m23816dq().m26908kk().m54599dy().m26948x1() == 1.12f && c5909to.m23816dq().m26908kk().m54599dy().m26946k4() == 2 && C7019kk.m27469x1(c1569kk, C4912kp.class)) {
                                            C1572x1 c1572x1 = (C1572x1) C7019kk.m27452k4((Object) c1569kk.mo22660v4().mo22776du(), C1572x1.class);
                                            if (!m49363x1(C4930tq.class, c1569kk)) {
                                                string3 = c5909to.m23816dq().m26908kk().toString();
                                            } else if (c1572x1 == null || !c1572x1.m8460ks()) {
                                                m49531zm("auto");
                                            } else {
                                                string3 = c5909to.m23816dq().m26908kk().toString();
                                            }
                                        } else {
                                            string3 = c5909to.m23816dq().m26908kk().toString();
                                        }
                                        m49531zm(string3);
                                        break;
                                    }
                                    break;
                                case 164:
                                    if (!"P".equals(c1569kk.mo22700du()) || c1569kk.mo22669x6(c1569kk.mo22634jd())) {
                                        m49417ii(c5909to.m23816dq().m26909to().toString());
                                    }
                                    break;
                                case 165:
                                    if (!"P".equals(c1569kk.mo22700du()) || c1569kk.mo22669x6(c1569kk.mo22634jd())) {
                                        m49389dc(c5909to.m23816dq().m26910x1().toString());
                                    }
                                    break;
                                case 166:
                                    if (!"P".equals(c1569kk.mo22700du()) || c1569kk.mo22669x6(c1569kk.mo22634jd())) {
                                        if (!c5909to.m23816dq().m26907k4().m54600m9() && c5909to.m23816dq().m26907k4().m54599dy().m26948x1() == 1.12f && c5909to.m23816dq().m26907k4().m54599dy().m26946k4() == 2 && C7019kk.m27469x1(c1569kk, C4912kp.class)) {
                                            C1572x1 c1572x12 = (C1572x1) C7019kk.m27452k4((Object) c1569kk.mo22660v4().mo22776du(), C1572x1.class);
                                            if (!m49361k4(C4930tq.class, c1569kk)) {
                                                string = c5909to.m23816dq().m26907k4().toString();
                                            } else if (c1572x12 == null || !c1572x12.m8460ks()) {
                                                m49388d4("auto");
                                            } else {
                                                string = c5909to.m23816dq().m26907k4().toString();
                                            }
                                        } else {
                                            string = c5909to.m23816dq().m26907k4().toString();
                                        }
                                        m49388d4(string);
                                        break;
                                    }
                                    break;
                                case 173:
                                    m49498vt(c5909to.m23870xk().toString());
                                    break;
                                case 174:
                                    m49464qn(c5909to.m23813c6().toString());
                                    break;
                                case 175:
                                    m49462qk(c5909to.m23856ts().toString());
                                    break;
                                case 176:
                                    m49469rq(c5909to.m23819e0().toString());
                                    break;
                                case 187:
                                    m49489u5(C14057f9.m66591x1(c5909to.m23811bz()));
                                    break;
                                case 189:
                                    if (c5909to.m23845qm().m26893k4().m54571m9()) {
                                        C12003du c12003duClone = c5909to.m23818dy().m26913k4().Clone();
                                        C12003du.m56397k4(255 - (c12003duClone.m56507jd() & 255), 255 - (c12003duClone.m56502ck() & 255), 255 - (c12003duClone.m56505fa() & 255)).CloneTo(c12003duClone);
                                        strM50307k42 = new C10320kk(c1569kk, c12003duClone.Clone()).m50307k4();
                                    } else {
                                        strM50307k42 = new C10320kk(c1569kk, c5909to.m23845qm().m26893k4().m54570dy().Clone()).m50307k4();
                                    }
                                    m49369av(strM50307k42);
                                    break;
                                case 191:
                                    m49424jf(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12147ne.class), c5909to.m23845qm().m26894kk()));
                                    break;
                                case 192:
                                    m49378c4(c5909to.m23845qm().m26895x1().toString());
                                    break;
                                case 196:
                                    strM53504k4 = C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12124ig.class), c5909to.m23823g8().m26900k4());
                                    m49439lm(strM53504k4);
                                    break;
                                case 197:
                                    strM53504k4 = C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12124ig.class), c5909to.m23823g8().m26901x1());
                                    m49439lm(strM53504k4);
                                    break;
                                case 198:
                                    m49458ou(c5909to.m23852sv().toString());
                                    break;
                                case 199:
                                    m49513xi(c5909to.m23852sv().m26936kk().toString());
                                    break;
                                case 200:
                                    m49375bu(c5909to.m23852sv().m26937to().toString());
                                    break;
                                case 201:
                                    m49452nh(c5909to.m23852sv().m26938x1().toString());
                                    break;
                                case 202:
                                    m49456o9(c5909to.m23852sv().m26935k4().toString());
                                    break;
                                case 203:
                                    m49390dl(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12205yo.class), c5909to.m23866wp()));
                                    break;
                                case 204:
                                    m49403f7(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12205yo.class), c5909to.m23851ss()));
                                    break;
                                case 205:
                                    m49441ly(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12205yo.class), c5909to.m23836kp()));
                                    break;
                                case 212:
                                    m49460q3(c5909to.m23850s7().toString());
                                    break;
                                case 213:
                                    m49399e8(c5909to.m23825gi().toString());
                                    break;
                                case 214:
                                    m49373bg(c5909to.m23821f9().toString());
                                    break;
                                case 215:
                                    c5909to.m23860uz().m54594m9();
                                    if (c5909to.m23853t6() == 1) {
                                        strM53504k42 = ((c1569kk.mo22653ss() != null && c1569kk.mo22653ss().mo22608fa() == 3 && C14113y2.m67440x1(c1569kk.mo22653ss().mo22607e0()).length() == 0 && c1569kk.m22725x6() != null && c1569kk.m22725x6().mo22608fa() == 1 && C7019kk.m27469x1(c1569kk.m22725x6(), C4920qm.class) && "image/svg+xml".equals(C14113y2.m67361du(((C4920qm) c1569kk.m22725x6()).m20493m2()))) || (c1569kk.mo22653ss() != null && c1569kk.mo22653ss().mo22608fa() == 1 && C7019kk.m27469x1(c1569kk.mo22653ss(), C4920qm.class) && "image/svg+xml".equals(C14113y2.m67361du(((C4920qm) c1569kk.m22725x6()).m20493m2())))) ? "absolute" : "relative";
                                    } else if (c5909to.m23853t6() != 0) {
                                        strM53504k42 = C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12202yg.class), c5909to.m23853t6());
                                    }
                                    m49432k5(strM53504k42);
                                    break;
                                case 221:
                                    m49387d3(c5909to.m23871xw().toString());
                                    break;
                                case 222:
                                    m49402ew(c5909to.m23863vj().toString());
                                    break;
                                case 238:
                                    m49427k1(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12192x3.class), c5909to.m23862vh()));
                                    break;
                                case 240:
                                    m49503wt(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12098c4.class), c5909to.m23847qw()));
                                    break;
                                case 241:
                                    m49486tw(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12130jf.class), c5909to.m23855tq()));
                                    break;
                                case 246:
                                    m49518y6(new C10317dy(c1569kk, c5909to).m50303k4());
                                    break;
                                case StyleIdentifier.MEDIUM_GRID_2_ACCENT_6 /* 254 */:
                                    m49425jm(c5909to.m23864w6().toString());
                                    break;
                                case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                                    m49392dt(c5909to.m23844os().toString());
                                    break;
                                case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                                    m49447n0(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12170tl.class), c5909to.m23820em()));
                                    break;
                                case StyleIdentifier.SUBTLE_REFERENCE /* 262 */:
                                    m49455o3((c1569kk.m8445t6().m23853t6() != 2 || c1569kk.m8452xw() == null || !"BODY".equals(c1569kk.m8452xw().mo22700du()) || c1569kk.m8445t6().m23816dq().m26907k4().m54600m9() || c1569kk.m8445t6().m23876zj().m54596m9() || c1569kk.m8445t6().m23816dq().m26907k4().m54599dy().m26946k4() != c1569kk.m8445t6().m23876zj().m54595dy().m26946k4()) ? c5909to.m23876zj().toString() : new C6884yj((c1569kk.m8445t6().m23816dq().m26907k4().m54599dy().m26948x1() + c1569kk.m8445t6().m23876zj().m54595dy().m26948x1()) - 8.0f, c1569kk.m8445t6().m23816dq().m26907k4().m54599dy().m26946k4()).toString());
                                    break;
                                case StyleIdentifier.PLAIN_TABLE_5 /* 271 */:
                                    m49383cj(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12134k5.class), c5909to.m23805ai()));
                                    break;
                                case StyleIdentifier.TABLE_GRID_LIGHT /* 272 */:
                                    if (c1569kk.m8445t6().m23860uz().m54594m9() == 14 && c1569kk.m8445t6().m23848ri().m54573m9()) {
                                        int iM54572dy = c1569kk.m8445t6().m23848ri().m54572dy();
                                        if (iM54572dy == 3) {
                                            str = "before";
                                        } else if (iM54572dy == 5) {
                                            str = "center";
                                        } else if (iM54572dy == 6) {
                                            str = "after";
                                        }
                                        m49401em(str);
                                    }
                                    m49408ga(c5909to.m23848ri().toString());
                                    break;
                                case StyleIdentifier.GRID_TABLE_1_LIGHT /* 273 */:
                                    m49479sz(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12092b5.class), c5909to.m23814ca()));
                                    break;
                                case StyleIdentifier.GRID_TABLE_4_ACCENT_1 /* 283 */:
                                    m49474sc(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12145n3.class), c5909to.m23809bs()));
                                    if (c5909to.m23809bs() == 1) {
                                        m49415hq(TelemetryEventStrings.Value.FALSE);
                                        m49529ze("no-wrap");
                                        m49521yg("preserve");
                                        m49527z7("preserve");
                                    }
                                    break;
                                case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1 /* 284 */:
                                    m49470rs(C14057f9.m66591x1(c5909to.m23827he()));
                                    break;
                                case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_1 /* 285 */:
                                    if (!C7019kk.m27469x1(c1569kk, C4946xw.class) && !C7019kk.m27469x1(c1569kk, C4936v4.class) && !C7019kk.m27469x1(c1569kk, C4891c5.class) && !C7019kk.m27469x1(c1569kk, C4888bs.class) && c1569kk.m8445t6().m23860uz().m54594m9() != 0) {
                                        C1569kk c1569kk3 = (C1569kk) C7019kk.m27452k4((Object) c1569kk.mo22646kp(), C1569kk.class);
                                        if (c1569kk3 == null || c5909to.m23832jw().m54595dy().m26946k4() != 1 || c1569kk3.m8445t6().m23832jw().m54596m9() || c1569kk3.m8445t6().m23832jw().m54595dy().m26946k4() == 1) {
                                            m49475so(c5909to.m23832jw().toString());
                                        } else {
                                            m49475so(new C6884yj((c1569kk3.m8445t6().m23832jw().m54595dy().m26948x1() / 100.0f) * c5909to.m23832jw().m54595dy().m26948x1(), c1569kk3.m8445t6().m23832jw().m54595dy().m26946k4()).toString());
                                            strM49418ix = m49418ix();
                                            m49497vj(strM49418ix);
                                        }
                                    } else if ("IMG".equals(c1569kk.mo22700du())) {
                                        m49475so(c5909to.m23832jw().toString());
                                        strM49418ix = m49418ix();
                                        m49497vj(strM49418ix);
                                    }
                                    break;
                                case StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_1 /* 286 */:
                                    m49438li(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12207zd.class), c5909to.m23840m4()));
                                    break;
                                case StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_2 /* 287 */:
                                    m49386cw(c5909to.m23872y2().toString());
                                    break;
                                case StyleIdentifier.GRID_TABLE_2_ACCENT_2 /* 288 */:
                                    m49493uw(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12188wt.class), c5909to.m23830j5()));
                                    break;
                                case StyleIdentifier.GRID_TABLE_3_ACCENT_2 /* 289 */:
                                    m49512xb(c5909to.m23843nv().toString());
                                    break;
                                case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_2 /* 291 */:
                                    m49407g8(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12186wl.class), c5909to.m23842ne()));
                                    break;
                                case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_2 /* 292 */:
                                    m49478sv(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12186wl.class), c5909to.m23828ix()));
                                    break;
                                default:
                                    switch (iIntValue) {
                                        case 48:
                                            strM50307k43 = new C10320kk(c1569kk, c5909to.m23831jd().m26941k4().m26917k4().Clone()).m50307k4();
                                            m49419ix(strM50307k43);
                                            break;
                                        case 49:
                                            m49488u4(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12147ne.class), c5909to.m23831jd().m26941k4().m26918kk()));
                                            strM50307k43 = new C10320kk(c1569kk, c5909to.m23831jd().m26941k4().m26917k4().Clone()).m50307k4();
                                            m49419ix(strM50307k43);
                                            break;
                                        case 50:
                                            m49494uz(c5909to.m23831jd().m26941k4().m26919x1().toString());
                                            break;
                                        default:
                                            switch (iIntValue) {
                                                case 53:
                                                    strM50307k44 = new C10320kk(c1569kk, c5909to.m23831jd().m26945x1().m26917k4().Clone()).m50307k4();
                                                    m49501wl(strM50307k44);
                                                    break;
                                                case 54:
                                                    m49465qq(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12147ne.class), c5909to.m23831jd().m26945x1().m26918kk()));
                                                    strM50307k44 = new C10320kk(c1569kk, c5909to.m23831jd().m26945x1().m26917k4().Clone()).m50307k4();
                                                    m49501wl(strM50307k44);
                                                    break;
                                                case 55:
                                                    m49367ak(c5909to.m23831jd().m26945x1().m26919x1().toString());
                                                    break;
                                                case 56:
                                                    m49391dq(c5909to.m23831jd().m26940h4().toString());
                                                    break;
                                                default:
                                                    switch (iIntValue) {
                                                        case 59:
                                                            strM50307k45 = new C10320kk(c1569kk, c5909to.m23831jd().m26942kk().m26917k4().Clone()).m50307k4();
                                                            m49381c6(strM50307k45);
                                                            break;
                                                        case 60:
                                                            m49368ar(c5909to.m23831jd().m26943m9().m26931k4().m54577m9().toString());
                                                            m49490um(c5909to.m23831jd().m26943m9().m26931k4().m54576dy().toString());
                                                            break;
                                                        case 61:
                                                            m49376bv(c5909to.m23831jd().m26943m9().m26934x1().m54577m9().toString());
                                                            m49495v4(c5909to.m23831jd().m26943m9().m26934x1().m54576dy().toString());
                                                            break;
                                                        case 62:
                                                            m49485ts(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12147ne.class), c5909to.m23831jd().m26942kk().m26918kk()));
                                                            strM50307k45 = new C10320kk(c1569kk, c5909to.m23831jd().m26942kk().m26917k4().Clone()).m50307k4();
                                                            m49381c6(strM50307k45);
                                                            break;
                                                        case 63:
                                                            m49398e0(c5909to.m23831jd().m26942kk().m26919x1().toString());
                                                            break;
                                                        default:
                                                            switch (iIntValue) {
                                                                case 69:
                                                                    m49502wp(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12159qq.class), c5909to.m23822fa()));
                                                                    break;
                                                                case 70:
                                                                    m49477ss(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12088ar.class), c5909to.m23859up()));
                                                                    break;
                                                                case 71:
                                                                    m49435kp(c5909to.m23875yj().toString());
                                                                    break;
                                                                case 72:
                                                                    m49410gi(new C10320kk(c1569kk, c5909to.m23837ks().Clone()).m50307k4());
                                                                    break;
                                                                case 73:
                                                                    m49473s7(c5909to.m23869x6().m26898x1().toString());
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            m49468ri(C11071kk.m53504k4(C7019kk.m27443k4((Class<?>) C12173ts.class), c5909to.m23807ar()));
                        }
                    } else if (c1569kk.m8445t6().m23860uz().m54594m9() != 0 || !m49360k4(c1569kk, f36182kk, 2)) {
                        m49413h4(new C10320kk(c1569kk, c5909to.m23818dy().m26913k4().Clone()).m50307k4());
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49431k4(String str) {
        m49359k4("alignment-adjust", str);
    }

    /* JADX INFO: renamed from: k4 */
    private void m49359k4(String str, String str2) {
        if (C14113y2.m67411k4(str2)) {
            if (this.f36183k4.containsKey(str)) {
                this.f36183k4.removeItemByKey(str);
            }
        } else if (this.f36183k4.containsKey(str)) {
            this.f36183k4.get_Item(str).m49667k4(str2);
        } else {
            this.f36183k4.addItem(str, new C10049m9(str, str2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private boolean m49360k4(C1569kk c1569kk, AbstractC14041ai<C1569kk> abstractC14041ai, int i) {
        AbstractC5535bv abstractC5535bvMo22653ss = c1569kk.mo22653ss();
        while (abstractC5535bvMo22653ss != null && (abstractC5535bvMo22653ss.mo22608fa() != 3 || C14113y2.m67440x1(abstractC5535bvMo22653ss.mo22607e0()).length() != 0 || (abstractC5535bvMo22653ss = abstractC5535bvMo22653ss.mo22631g8()) != null)) {
            if (abstractC5535bvMo22653ss.mo22608fa() == 1 && abstractC14041ai.invoke(C7019kk.m27452k4((Object) abstractC5535bvMo22653ss, C1569kk.class))) {
                return true;
            }
            abstractC5535bvMo22653ss = abstractC5535bvMo22653ss.mo22653ss();
            i--;
            if (i <= 0) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static <TParent extends C12804k4> boolean m49361k4(Class<TParent> cls, C12804k4 c12804k4) {
        while (c12804k4 != null) {
            if (c12804k4.mo22654sv() != null) {
                if (c12804k4.mo22194ix() != null) {
                    return false;
                }
                if (c12804k4.mo22654sv().mo22608fa() == 3 && C14113y2.m67440x1(c12804k4.mo22654sv().mo22607e0()).length() != 0) {
                    return false;
                }
            }
            if (c12804k4.mo22646kp() == null || c12804k4.mo22646kp().mo22608fa() != 1) {
                return false;
            }
            c12804k4 = (C12804k4) c12804k4.mo22646kp();
            if (C7019kk.m27469x1(c12804k4, cls)) {
                return true;
            }
        }
        return false;
    }
}
