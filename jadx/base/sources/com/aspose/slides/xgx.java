package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3038bv;
import com.aspose.slides.internal.p077d8.C3041c6;
import com.aspose.slides.internal.p077d8.C3052g8;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3092um;
import com.aspose.slides.internal.p077d8.C3095v4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p332p7.AbstractC9290yj;
import com.aspose.slides.internal.p332p7.C8065k9;
import com.aspose.slides.internal.p332p7.C8082kf;
import com.aspose.slides.internal.p332p7.C8256md;
import com.aspose.slides.internal.p332p7.C8490p3;
import com.aspose.slides.internal.p332p7.C8549pu;
import com.aspose.slides.internal.p332p7.C8967uo;
import com.aspose.slides.internal.p332p7.C9178x7;
import com.aspose.slides.internal.p332p7.C9365zg;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11780n0;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11823tw;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class xgx extends C14665v6 {
    public xgx(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: kk */
    private void m73355kk(Slide slide) {
        C11709bg[] c11709bgArrM55309k4 = mo3471m9().m55338u4().m55309k4(C11780n0.f39791k4);
        if (c11709bgArrM55309k4.length > 0) {
            new dfx(c11709bgArrM55309k4[0].m55296x1(), mo3471m9()).m5091k4(slide);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m73356x1(Slide slide) {
        C11709bg[] c11709bgArrM55309k4 = mo3471m9().m55338u4().m55309k4(C11823tw.f39875k4);
        if (c11709bgArrM55309k4.length > 0) {
            new C14161mz(c11709bgArrM55309k4[0].m55296x1(), mo3471m9()).m67841k4(slide);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73357k4(ISlide iSlide) {
        mo55332up();
        C8967uo c8967uo = new C8967uo();
        rq8 rq8VarM2708ne = ((Slide) iSlide).m2708ne();
        mo3468h4().m71548kk().addItem(iSlide, mo3467du());
        m72079k4(iSlide.getShapes(), m72080x1());
        C14869z1.m74189k4(iSlide, c8967uo.m42514m9(), m72080x1());
        if (c8967uo.m42508jd() == null) {
            c8967uo.m42512kk();
        }
        C13670j2.m63195k4(iSlide.getTimeline(), iSlide.getShapes(), c8967uo.m42508jd(), new gi8(m72080x1().m70580k4(), m72080x1().m70576du()));
        c8967uo.m42508jd().m31094k4(rq8VarM2708ne.m5306kk());
        C14349qj.m69677x1(((BaseThemeManager) iSlide.getThemeManager()).m423to(), c8967uo.m42509k4());
        qas.m69499k4(iSlide.getSlideShowTransition(), c8967uo.m42516x1(), mo3468h4());
        c8967uo.m42513kk(!iSlide.getHidden());
        c8967uo.m42511k4(iSlide.getShowMasterShapes());
        c8967uo.m42510k4(rq8VarM2708ne.m70261c5());
        c8967uo.m42517x1(rq8VarM2708ne.m70262dy());
        C12015qq c12015qqClone = ((SlideSize) iSlide.getPresentation().getSlideSize()).m2755k4().Clone();
        m73354k4(c8967uo.m42514m9().m34899h4(), c12015qqClone.m56699x1(), c12015qqClone.m56697kk(), "TextBox", m72080x1());
        c8967uo.mo6846k4(null, m55442ck(), "sld");
        mo55333yj();
    }

    public xgx(C11791os c11791os, u8s u8sVar, IBaseSlide iBaseSlide) {
        super(c11791os, u8sVar, iBaseSlide);
    }

    /* JADX INFO: renamed from: k4 */
    private void m73352k4(ISlide iSlide, C8967uo c8967uo) {
        rq8 rq8VarM2708ne = ((Slide) iSlide).m2708ne();
        yqd yqdVar = new yqd(m72077k4().m4229k4(), m72077k4().m4237to());
        if (c8967uo.m42508jd() == null) {
            c8967uo.m42512kk();
        }
        rq8VarM2708ne.m5304k4(c8967uo.m42508jd());
        C13670j2.m63196k4(iSlide.getTimeline(), c8967uo.m42508jd(), yqdVar);
        C6005k4.m24261k4(c8967uo.m42508jd() != null);
        rq8VarM2708ne.m5305k4(c8967uo.m42508jd().m31098to());
        rq8VarM2708ne.m5303k4(c8967uo.m42508jd().m31092du());
        rq8VarM2708ne.m70264to(c8967uo.m42504ck());
        rq8VarM2708ne.m70263k4(c8967uo.m42505du());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73358k4(Slide slide) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "sld".equals(m55443jd().mo65023fa())) {
                C8967uo c8967uo = new C8967uo(m55443jd());
                C14349qj.m69671k4(slide.getThemeManager(), c8967uo.m42506dy());
                C14576tt.m71303k4(slide.getThemeManager(), mo3471m9());
                C14869z1.m74188k4(slide, c8967uo.m42514m9(), m72077k4());
                qas.m69498k4(slide.getSlideShowTransition(), c8967uo.m42503c5(), mo3471m9());
                slide.setHidden(true ^ c8967uo.m42507h4());
                slide.setShowMasterShapes(c8967uo.m42515to());
                m73356x1(slide);
                m73355kk(slide);
                m73352k4(slide, c8967uo);
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73353k4(AbstractC9290yj abstractC9290yj, double d, double d2, String str, String[] strArr, sdp sdpVar) {
        com.aspose.slides.internal.p332p7.dm6 dm6Var = (com.aspose.slides.internal.p332p7.dm6) abstractC9290yj.mo28598k4("sp").m29542x1();
        dm6Var.mo30435k4().mo30406k4().m31575k4(sdpVar.m70585to());
        dm6Var.mo30435k4().mo30406k4().m31577k4(str);
        dm6Var.mo30435k4().mo30408x1().m40999k4(true);
        dm6Var.mo30435k4().mo30408x1().m40997k4();
        dm6Var.mo30435k4().mo30408x1().m41000kk().m38763x1(true);
        dm6Var.mo30435k4().mo30408x1().m41000kk().m38757kk(true);
        dm6Var.mo30435k4().mo30408x1().m41000kk().m38745du(true);
        dm6Var.mo30435k4().mo30408x1().m41000kk().m38755k4(true);
        dm6Var.mo30441x1().m35376k4();
        dm6Var.mo30441x1().m35373h4().m43000k4();
        dm6Var.mo30441x1().m35373h4().m42999h4().m45890k4(d);
        dm6Var.mo30441x1().m35373h4().m42999h4().m45892x1(d2);
        dm6Var.mo30441x1().m35373h4().m43006x1();
        dm6Var.mo30441x1().m35373h4().m43004m9().m28297k4(504.8324409448819d);
        dm6Var.mo30441x1().m35373h4().m43004m9().m28299x1(123.59527559055118d);
        C9365zg c9365zg = (C9365zg) dm6Var.mo30441x1().m35384kk("prstGeom").m29542x1();
        c9365zg.m45599k4(5);
        c9365zg.m45598k4();
        dm6Var.mo30441x1().m35390x1("noFill");
        dm6Var.mo30434h4();
        dm6Var.mo30432du().m42374kk().m29258k4(1);
        dm6Var.mo30432du().m42374kk().m29243du((byte) 0);
        dm6Var.mo30432du().m42374kk().m29268m9((byte) 1);
        dm6Var.mo30432du().m42374kk().m29246dy((byte) 1);
        dm6Var.mo30432du().m42374kk().m29253k4("spAutoFit");
        dm6Var.mo30432du().m42373k4();
        dm6Var.mo30432du().m42375to().m37565x1();
        dm6Var.mo30432du().m42375to().m37552fa().m36125x1(1);
        dm6Var.mo30432du().m42375to().m37552fa().m36098k4();
        ((C9178x7) dm6Var.mo30432du().m42375to().m37552fa().m36126x6().m43741k4("spcPct").m29542x1()).m44232k4(150.0f);
        dm6Var.mo30432du().m42375to().m37552fa().m36122x1();
        ((C9178x7) dm6Var.mo30432du().m42375to().m37552fa().m36109ne().m43741k4("spcPct").m29542x1()).m44232k4(0.0f);
        dm6Var.mo30432du().m42375to().m37552fa().m36103kk();
        ((C9178x7) dm6Var.mo30432du().m42375to().m37552fa().m36095ix().m43741k4("spcPct").m29542x1()).m44232k4(0.0f);
        dm6Var.mo30432du().m42375to().m37552fa().m36091du();
        dm6Var.mo30432du().m42375to().m37552fa().m36117um().m43964du("en-US");
        dm6Var.mo30432du().m42375to().m37552fa().m36117um().m43977k4(32.0f);
        dm6Var.mo30432du().m42375to().m37552fa().m36117um().m44007x1((byte) 1);
        dm6Var.mo30432du().m42375to().m37552fa().m36117um().m43979k4(false);
        dm6Var.mo30432du().m42375to().m37552fa().m36117um().m44009x1(false);
        dm6Var.mo30432du().m42375to().m37552fa().m36117um().m43966dy((byte) 1);
        C8065k9 c8065k9 = (C8065k9) ((C8256md) dm6Var.mo30432du().m42375to().m37552fa().m36117um().m44005x1("solidFill").m29542x1()).m36800k4("prstClr").m29542x1();
        c8065k9.m35214k4(113);
        ((C8082kf) c8065k9.m35213k4("lumOff").m29542x1()).m35326k4(30.0f);
        ((C8082kf) c8065k9.m35213k4("alpha").m29542x1()).m35326k4(40.0f);
        C8490p3 c8490p3 = (C8490p3) dm6Var.mo30432du().m42375to().m37552fa().m36117um().m43974k4("effectLst").m29542x1();
        c8490p3.m38593du();
        c8490p3.m38604up().m45159k4(4.0d);
        c8490p3.m38604up().m45168x1(3.0d);
        c8490p3.m38604up().m45158k4((byte) 2);
        c8490p3.m38604up().m45161k4(false);
        C8065k9 c8065k92 = (C8065k9) c8490p3.m38604up().m45157k4("prstClr").m29542x1();
        c8065k92.m35214k4(7);
        ((C8082kf) c8065k92.m35213k4("alpha").m29542x1()).m35326k4(80.0f);
        dm6Var.mo30432du().m42375to().m37552fa().m36117um().m43981kk();
        dm6Var.mo30432du().m42375to().m37552fa().m36117um().m43961dq().m44662k4("Calibri");
        dm6Var.mo30432du().m42375to().m37552fa().m36117um().m43961dq().m44661k4((byte) 34);
        dm6Var.mo30432du().m42375to().m37552fa().m36117um().m43961dq().m44666x1((byte) 0);
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            dm6Var.mo30432du().m42376x1();
            dm6Var.mo30432du().m42372du()[i].m44646k4().m36125x1(2);
            ((C8549pu) dm6Var.mo30432du().m42372du()[i].m44645k4("r").m29542x1()).m39136k4(str2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73354k4(AbstractC9290yj abstractC9290yj, float f, float f2, String str, sdp sdpVar) {
        String[][] strArr = {null};
        byte[][] bArr = {null};
        int[] iArrM2334k4 = Presentation.m2334k4((ctm) ((Presentation) sdpVar.m70580k4().m71526c5()).m2399x6(), bArr);
        byte[] bArr2 = bArr[0];
        strArr[0] = C3038bv.m12798to();
        if (Arrays.equals(iArrM2334k4, r1s.f48531x1) && bArr2 != null && bArr2.length > 0) {
            strArr[0] = C14113y2.m67417k4(Presentation.m2325k4(bArr2), new String[]{IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX, "\r", "\n\r"}, 0);
        }
        int[] iArrM12821x1 = C3052g8.f9069k4;
        if (C3041c6.m12821x1() == C3052g8.f9070x1) {
            try {
                C3041c6.m12809k4().m12825to();
                iArrM12821x1 = C3041c6.m12821x1();
            } catch (IllegalStateException e) {
                int[] iArr = C3052g8.f9069k4;
                C3085sv.m13082k4(e);
                iArrM12821x1 = iArr;
            }
        }
        String[] strArr2 = strArr[0];
        if ((Arrays.equals(C3038bv.m12793k4(), C3095v4.f9211x1) && C3092um.m13135k4() != null && (C3092um.m13135k4() instanceof C3038bv)) || Arrays.equals(iArrM2334k4, r1s.f48530kk) || Arrays.equals(iArrM12821x1, C3052g8.f9070x1)) {
            return;
        }
        m73353k4(abstractC9290yj, ((double) (f - 504.8f)) / 2.0d, ((double) (f2 - 123.6f)) / 2.0d, str, strArr2, sdpVar);
    }
}
