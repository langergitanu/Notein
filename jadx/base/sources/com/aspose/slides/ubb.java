package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10357al;
import com.aspose.slides.internal.p407st.C10391cu;
import com.aspose.slides.internal.p407st.C10409du;
import com.aspose.slides.internal.p407st.C10427ep;
import com.aspose.slides.internal.p407st.C10486iy;
import com.aspose.slides.internal.p407st.C10562nk;
import com.aspose.slides.internal.p407st.C10574od;
import com.aspose.slides.internal.p407st.C10592pm;
import com.aspose.slides.internal.p407st.C10606qj;
import com.aspose.slides.internal.p407st.C10623rr;
import com.aspose.slides.internal.p407st.C10693wk;
import com.aspose.slides.internal.p407st.C10720xu;
import com.aspose.slides.internal.p407st.C10742z2;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes3.dex */
class ubb {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f49295k4 = new C7017h4("tmAbs", "tmPct");

    /* JADX INFO: renamed from: c5 */
    private static byte m71593c5(C10592pm c10592pm, a3u a3uVar) {
        if (c10592pm == null) {
            a3uVar.m3185k4("TimePropertyList4TimeNodeContainer is not exists.", 0);
            return (byte) -1;
        }
        C10391cu c10391cu = (C10391cu) C7019kk.m27452k4((Object) c10592pm.m51494k4(5), C10391cu.class);
        if (c10391cu == null) {
            return (byte) -1;
        }
        int iM50572du = c10391cu.m50572du();
        if (iM50572du != 0) {
            return iM50572du != 2 ? (byte) -1 : (byte) 2;
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: du */
    private static byte m71594du(C10592pm c10592pm, a3u a3uVar) {
        if (c10592pm == null) {
            a3uVar.m3185k4("TimePropertyList4TimeNodeContainer is not exists.", 0);
            return (byte) -1;
        }
        C10574od c10574od = (C10574od) C7019kk.m27452k4((Object) c10592pm.m51494k4(21), C10574od.class);
        if (c10574od == null) {
            return (byte) -1;
        }
        return c10574od.m51427du() ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: renamed from: dy */
    private static byte m71596dy(C10592pm c10592pm, a3u a3uVar) {
        switch (m71603k4(c10592pm, 11, a3uVar)) {
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            default:
                return (byte) -1;
        }
    }

    /* JADX INFO: renamed from: h4 */
    private static byte m71597h4(C10592pm c10592pm, a3u a3uVar) {
        if (c10592pm == null) {
            a3uVar.m3185k4("TimePropertyList4TimeNodeContainer is not exists.", 0);
            return (byte) -1;
        }
        C10574od c10574od = (C10574od) C7019kk.m27452k4((Object) c10592pm.m51494k4(13), C10574od.class);
        if (c10574od == null) {
            return (byte) -1;
        }
        return c10574od.m51427du() ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: renamed from: jd */
    private static byte m71598jd(C10592pm c10592pm, a3u a3uVar) {
        switch (m71603k4(c10592pm, 20, a3uVar)) {
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            case 7:
                return (byte) 6;
            case 8:
                return (byte) 7;
            case 9:
                return (byte) 8;
            default:
                return (byte) -1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static float m71599k4(long j) {
        int i = (int) j;
        if (i == 0) {
            return 0.0f;
        }
        if (i == 1073741824) {
            return 2.0f;
        }
        if (i == 1077936128) {
            return 3.0f;
        }
        if (i == 1082130432) {
            return 4.0f;
        }
        if (i == 1084227584) {
            return 5.0f;
        }
        if (i != 1092616192) {
            return i != 2139095039 ? 1.0f : Float.POSITIVE_INFINITY;
        }
        return 10.0f;
    }

    /* JADX INFO: renamed from: kk */
    private static byte m71616kk(C10693wk c10693wk) {
        int iM51903to = (int) c10693wk.m51903to();
        if (iM51903to == 1) {
            return (byte) 0;
        }
        if (iM51903to == 2) {
            return (byte) 1;
        }
        if (iM51903to != 3) {
            return iM51903to != 4 ? (byte) -1 : (byte) 3;
        }
        return (byte) 2;
    }

    /* JADX INFO: renamed from: m9 */
    private static byte m71622m9(C10592pm c10592pm, a3u a3uVar) {
        if (c10592pm == null) {
            a3uVar.m3185k4("TimePropertyList4TimeNodeContainer is not exists.", 0);
            return (byte) -1;
        }
        C10391cu c10391cu = (C10391cu) C7019kk.m27452k4((Object) c10592pm.m51494k4(2), C10391cu.class);
        if (c10391cu == null) {
            return (byte) -1;
        }
        return c10391cu.m50572du() == 0 ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: renamed from: to */
    private static String m71623to(C10592pm c10592pm, a3u a3uVar) {
        if (c10592pm == null) {
            a3uVar.m3185k4("TimePropertyList4TimeNodeContainer is not exists.", 0);
            return null;
        }
        C10742z2 c10742z2 = (C10742z2) C7019kk.m27452k4((Object) c10592pm.m51494k4(17), C10742z2.class);
        if (c10742z2 == null) {
            return null;
        }
        return c10742z2.m52123du();
    }

    /* JADX INFO: renamed from: x1 */
    private static byte m71625x1(long j) {
        int i = (int) j;
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                return (byte) 0;
            }
        }
        return b;
    }

    /* JADX INFO: renamed from: du */
    public static int m71595du(C10592pm c10592pm) {
        C10391cu c10391cu;
        if (c10592pm == null || (c10391cu = (C10391cu) C7019kk.m27452k4((Object) c10592pm.m51494k4(15), C10391cu.class)) == null) {
            return 1;
        }
        return c10391cu.m50572du();
    }

    /* JADX INFO: renamed from: k4 */
    public static float m71600k4(C10693wk c10693wk) {
        if (c10693wk.m51893c5()) {
            return c10693wk.m51894du() / 1000.0f;
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: kk */
    private static long m71617kk(byte b) {
        if (b == 0) {
            return 0L;
        }
        if (b == 1) {
            return 1L;
        }
        if (b == 2) {
            return 2L;
        }
        throw new ArgumentOutOfRangeException(C18437z2.f56754h);
    }

    /* JADX INFO: renamed from: to */
    public static boolean m71624to(C10592pm c10592pm) {
        C10574od c10574od;
        if (c10592pm == null || (c10574od = (C10574od) C7019kk.m27452k4((Object) c10592pm.m51494k4(26), C10574od.class)) == null) {
            return false;
        }
        return c10574od.m51427du();
    }

    /* JADX INFO: renamed from: x1 */
    private static byte m71626x1(C10693wk c10693wk) {
        if (!c10693wk.m51902m9()) {
            return (byte) -1;
        }
        int iM51905x1 = (int) c10693wk.m51905x1();
        if (iM51905x1 != 0) {
            if (iM51905x1 == 1) {
                return (byte) 0;
            }
            if (iM51905x1 == 2) {
                return (byte) 1;
            }
            if (iM51905x1 != 3) {
                return (byte) -1;
            }
        }
        return (byte) 2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m71601k4(byte b) {
        switch (b) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                throw new NotImplementedException();
        }
    }

    /* JADX INFO: renamed from: kk */
    private static long m71618kk(float f) {
        if (f == 1.0f) {
            return 1065353216L;
        }
        if (C14064he.m66703du(f)) {
            return 2139095039L;
        }
        if (f == 2.0f) {
            return 1073741824L;
        }
        if (f == 3.0f) {
            return 1077936128L;
        }
        if (f == 4.0f) {
            return 1082130432L;
        }
        if (f == 5.0f) {
            return 1084227584L;
        }
        if (f == 10.0f) {
            return 1092616192L;
        }
        return f == 0.0f ? 0L : 1065353216L;
    }

    /* JADX INFO: renamed from: x1 */
    public static float m71627x1(C10592pm c10592pm) {
        C10427ep c10427ep;
        if (c10592pm == null || (c10427ep = (C10427ep) C7019kk.m27452k4((Object) c10592pm.m51494k4(22), C10427ep.class)) == null) {
            return 0.8f;
        }
        return c10427ep.m50772du();
    }

    /* JADX INFO: renamed from: k4 */
    public static int m71602k4(float f) {
        if (C14064he.m66703du(f)) {
            return -1;
        }
        return C14080ne.m66995m9(Float.valueOf(f * 1000.0f));
    }

    /* JADX INFO: renamed from: kk */
    private static String m71619kk(C10592pm c10592pm, a3u a3uVar) {
        if (c10592pm == null) {
            a3uVar.m3185k4("TimePropertyList4TimeNodeContainer is not exists.", 0);
            return null;
        }
        C10742z2 c10742z2 = (C10742z2) C7019kk.m27452k4((Object) c10592pm.m51494k4(16), C10742z2.class);
        if (c10742z2 == null) {
            return null;
        }
        return c10742z2.m52123du();
    }

    /* JADX INFO: renamed from: x1 */
    private static int m71628x1(byte b) {
        if (b != 0) {
            if (b == 1) {
                return 2;
            }
            if (b == 2) {
                return 3;
            }
            if (b == 3) {
                return 4;
            }
            if (b == 4) {
                return 5;
            }
            if (b == 5) {
                return 6;
            }
            throw new NotImplementedException();
        }
        return 1;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m71603k4(C10592pm c10592pm, int i, a3u a3uVar) {
        if (c10592pm == null) {
            a3uVar.m3185k4("TimePropertyList4TimeNodeContainer is not exists.", 0);
            return -1;
        }
        C10391cu c10391cu = (C10391cu) C7019kk.m27452k4((Object) c10592pm.m51494k4(i), C10391cu.class);
        if (c10391cu == null) {
            return -1;
        }
        return c10391cu.m50572du();
    }

    /* JADX INFO: renamed from: kk */
    public static void m71620kk(com.aspose.slides.internal.p332p7.lmh lmhVar, C10409du c10409du) {
        if (lmhVar != null && m71614k4(lmhVar)) {
            if (!C14113y2.m67411k4(lmhVar.m36282ck())) {
                C10720xu c10720xu = new C10720xu();
                c10720xu.m52012k4(0L);
                c10720xu.m52015x1(m71618kk(C13670j2.m63183k4(lmhVar.m36282ck())));
                c10409du.m50513yj().addItem(c10720xu);
            }
            if (!C14113y2.m67411k4(lmhVar.m36288fa())) {
                C10720xu c10720xu2 = new C10720xu();
                c10720xu2.m52012k4(1L);
                c10720xu2.m52015x1(C13850af.m65124ne(lmhVar.m36288fa()));
                c10409du.m50513yj().addItem(c10720xu2);
            }
            if (lmhVar.m36318up() != 100.0f) {
                C10720xu c10720xu3 = new C10720xu();
                c10720xu3.m52012k4(2L);
                c10720xu3.m52015x1(C14069jd.m66784x1(C14069jd.m66774k4(lmhVar.m36318up() / 100.0f), 0));
                c10409du.m50513yj().addItem(c10720xu3);
            }
            if (lmhVar.m36330yj() != 0.0f) {
                C10720xu c10720xu4 = new C10720xu();
                c10720xu4.m52012k4(3L);
                c10720xu4.m52015x1(C14069jd.m66784x1(C14069jd.m66774k4(lmhVar.m36330yj() / 100.0f), 0));
                c10409du.m50513yj().addItem(c10720xu4);
            }
            if (lmhVar.m36306ks() != 0.0f) {
                C10720xu c10720xu5 = new C10720xu();
                c10720xu5.m52012k4(4L);
                c10720xu5.m52015x1(C14069jd.m66784x1(C14069jd.m66774k4(lmhVar.m36306ks() / 100.0f), 0));
                c10409du.m50513yj().addItem(c10720xu5);
            }
            if (lmhVar.m36312rv()) {
                C10720xu c10720xu6 = new C10720xu();
                c10720xu6.m52012k4(5L);
                c10720xu6.m52015x1((lmhVar.m36312rv() ? 1L : 0L) & 4294967295L);
                c10409du.m50513yj().addItem(c10720xu6);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static long m71629x1(C10592pm c10592pm, a3u a3uVar) {
        long jM71603k4 = m71603k4(c10592pm, 10, a3uVar);
        return jM71603k4 == -1 ? jM71603k4 : jM71603k4 - (-2147483648L);
    }

    /* JADX INFO: renamed from: k4 */
    private static long m71604k4(C10592pm c10592pm, a3u a3uVar) {
        long jM71603k4 = m71603k4(c10592pm, 9, a3uVar);
        return jM71603k4 == -1 ? jM71603k4 : jM71603k4 - (-2147483648L);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m71621kk(C10592pm c10592pm) {
        C10574od c10574od;
        if (c10592pm == null || (c10574od = (C10574od) C7019kk.m27452k4((Object) c10592pm.m51494k4(23), C10574od.class)) == null) {
            return false;
        }
        return c10574od.m51427du();
    }

    /* JADX INFO: renamed from: x1 */
    public static String m71630x1(float f) {
        return C14064he.m66703du(f) ? "indefinite" : C13850af.m65104k4(C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(f * 1000.0f)), 14));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71605k4(com.aspose.slides.internal.p332p7.lmh lmhVar, AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2> abstractC4685kk, AbstractC4685kk<com.aspose.slides.internal.p332p7.ei2> abstractC4685kk2, C10409du c10409du, m4c m4cVar) {
        if (lmhVar == null) {
            return;
        }
        m71609k4(lmhVar, c10409du.m50710x1(), m4cVar.m64712du());
        m71608k4(lmhVar, c10409du.m50709to(), m4cVar.m64712du());
        g3j.m6409k4(abstractC4685kk, c10409du.m50707jd(), m4cVar);
        g3j.m6409k4(abstractC4685kk2, c10409du.m50703ck(), m4cVar);
        m71611k4(lmhVar, c10409du.m50702c5());
        C10562nk c10562nk = (C10562nk) C7019kk.m27452k4((Object) c10409du, C10562nk.class);
        if (c10562nk == null) {
            return;
        }
        if (c10562nk.m51378uz() != null) {
            c7w.m4512k4(lmhVar.m36301kk(), c10562nk.m51378uz(), m4cVar);
        }
        C10623rr c10623rrM51377u4 = c10562nk.m51377u4();
        if (c10623rrM51377u4 != null) {
            com.aspose.slides.internal.p332p7.eza ezaVarM36313to = lmhVar.m36313to();
            int iM51633du = (int) c10623rrM51377u4.m51633du();
            if (iM51633du == 0) {
                ((com.aspose.slides.internal.p332p7.ks4) ezaVarM36313to.m31495k4("tmAbs").m29542x1()).m35665k4(m71630x1(C14069jd.m66766dy(C14069jd.m66776k4(c10623rrM51377u4.m51642x1()), 0)));
            } else if (iM51633du == 1) {
                ((com.aspose.slides.internal.p332p7.fko) ezaVarM36313to.m31495k4("tmPct").m29542x1()).m31809k4(C14069jd.m66766dy(C14069jd.m66776k4(c10623rrM51377u4.m51642x1()), 0));
            }
            ezaVarM36313to.m31496k4(m71625x1(c10623rrM51377u4.m51636kk()));
            ezaVarM36313to.m31497k4((c10623rrM51377u4.m51639to() & 4294967295L) == 0);
        }
        if (c10562nk.m51375qq() != null && c10562nk.m51375qq().length > 0) {
            vij.m72297k4(lmhVar.m36283du(), c10562nk.m51375qq(), false, m4cVar);
        }
        if (c10562nk.m51379wl() == null || c10562nk.m51379wl().length <= 0) {
            return;
        }
        com.aspose.slides.internal.p332p7.rqz rqzVar = new com.aspose.slides.internal.p332p7.rqz();
        vij.m72296k4(rqzVar, c10562nk.m51379wl(), m4cVar);
        if (rqzVar.m40177k4().size() > 0) {
            lmhVar.m36298k4(rqzVar);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m71631x1(com.aspose.slides.internal.p332p7.lmh lmhVar, C10409du c10409du) {
        if (lmhVar == null || lmhVar.m36279b3() == null) {
            return;
        }
        com.aspose.slides.internal.p332p7.eza ezaVarM36279b3 = lmhVar.m36279b3();
        C10623rr c10623rr = new C10623rr();
        c10409du.m50513yj().addItem(c10623rr);
        c10623rr.m51643x1(m71617kk(ezaVarM36279b3.m31494k4()));
        c10623rr.m51644x1(true);
        c10623rr.m51637kk(((long) (!ezaVarM36279b3.m31499x1() ? 1 : 0)) & 4294967295L);
        c10623rr.m51635k4(true);
        int iM27428k4 = f49295k4.m27428k4(ezaVarM36279b3.m31498kk().m29539k4());
        if (iM27428k4 != 0) {
            if (iM27428k4 != 1) {
                c10623rr.m51643x1(0L);
                return;
            }
            c10623rr.m51640to(1L);
            c10623rr.m51641to(true);
            c10623rr.m51634k4(C14069jd.m66784x1(C14069jd.m66774k4(((com.aspose.slides.internal.p332p7.fko) ezaVarM36279b3.m31498kk().m29542x1()).m31808k4()), 0));
            c10623rr.m51638kk(true);
            return;
        }
        c10623rr.m51640to(0L);
        c10623rr.m51641to(true);
        float[] fArr = {0.0f};
        boolean zM66714k4 = C14064he.m66714k4(((com.aspose.slides.internal.p332p7.ks4) ezaVarM36279b3.m31498kk().m29542x1()).m35664k4(), fArr);
        float f = fArr[0];
        if (zM66714k4) {
            c10623rr.m51634k4(C14069jd.m66784x1(C14069jd.m66774k4(f / 100.0f), 0));
        } else {
            c10623rr.m51634k4(C14069jd.m66784x1(C14069jd.m66785x1(10), 0));
            c10623rr.m51638kk(true);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71606k4(com.aspose.slides.internal.p332p7.lmh lmhVar, C10409du c10409du) {
        if (lmhVar == null) {
            return;
        }
        C10592pm c10592pm = new C10592pm();
        c10409du.m50513yj().addItem(c10592pm);
        if (lmhVar.m36319uz() != -1) {
            C10391cu c10391cu = new C10391cu(lmhVar.m36319uz() == 1 ? 0 : 1);
            c10391cu.m51409um().m51920k4((short) 2);
            c10592pm.m50513yj().addItem(c10391cu);
        }
        if (C7019kk.m27469x1(c10409du, C10357al.class)) {
            C10391cu c10391cu2 = new C10391cu(1);
            c10391cu2.m51409um().m51920k4((short) 6);
            c10592pm.m50513yj().addItem(c10391cu2);
        }
        if (lmhVar.m36308m9() != -2147483649L) {
            C10391cu c10391cu3 = new C10391cu((int) lmhVar.m36308m9());
            c10391cu3.m51409um().m51920k4((short) 9);
            c10592pm.m50513yj().addItem(c10391cu3);
        }
        if (lmhVar.m36286dy() != -1) {
            C10391cu c10391cu4 = new C10391cu(m71628x1(lmhVar.m36286dy()));
            c10391cu4.m51409um().m51920k4((short) 11);
            c10592pm.m50513yj().addItem(c10391cu4);
        }
        if (lmhVar.m36281c5() != -2147483649L) {
            C10391cu c10391cu5 = new C10391cu((int) lmhVar.m36281c5());
            c10391cu5.m51409um().m51920k4((short) 10);
            c10592pm.m50513yj().addItem(c10391cu5);
        }
        if ((lmhVar.m36311qq() & 4294967295L) != 4294967295L) {
            C10391cu c10391cu6 = new C10391cu((int) lmhVar.m36311qq());
            c10391cu6.m51409um().m51920k4((short) 19);
            c10592pm.m50513yj().addItem(c10391cu6);
        }
        if (!C14113y2.m67411k4(lmhVar.m36316u4())) {
            C10742z2 c10742z2 = new C10742z2(lmhVar.m36316u4());
            c10742z2.m51409um().m51920k4((short) 17);
            c10592pm.m50513yj().addItem(c10742z2);
        }
        if (!C14113y2.m67411k4(lmhVar.m36291ix())) {
            C10742z2 c10742z22 = new C10742z2(lmhVar.m36291ix());
            c10742z22.m51409um().m51920k4((short) 16);
            c10592pm.m50513yj().addItem(c10742z22);
        }
        if (lmhVar.m36317um() != -1) {
            C10391cu c10391cu7 = new C10391cu(m71601k4(lmhVar.m36317um()));
            c10391cu7.m51409um().m51920k4((short) 20);
            c10592pm.m50513yj().addItem(c10391cu7);
        }
        if (lmhVar.m36278ar() != -1) {
            C10574od c10574od = new C10574od(lmhVar.m36278ar() == 1);
            c10574od.m51409um().m51920k4((short) 13);
            c10592pm.m50513yj().addItem(c10574od);
        }
        if (lmhVar.m36280bv() != -1) {
            C10574od c10574od2 = new C10574od(lmhVar.m36280bv() == 1);
            c10574od2.m51409um().m51920k4((short) 21);
            c10592pm.m50513yj().addItem(c10574od2);
        }
        if (lmhVar.m36321wl() != -1) {
            C10391cu c10391cu8 = new C10391cu(lmhVar.m36321wl() != 2 ? 0 : 2);
            c10391cu8.m51409um().m51920k4((short) 5);
            c10592pm.m50513yj().addItem(c10391cu8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m71607k4(com.aspose.slides.internal.p332p7.lmh lmhVar, C10409du c10409du, int i) {
        if (lmhVar == null) {
            return;
        }
        C10693wk c10693wk = new C10693wk();
        c10409du.m50513yj().addItem(c10693wk);
        c10693wk.m51897k4(i);
        if (C14113y2.m67411k4(lmhVar.m36292jd())) {
            c10693wk.m51904to(false);
            c10693wk.m51906x1(0);
        } else {
            c10693wk.m51904to(true);
            c10693wk.m51906x1(m71602k4(C13670j2.m63183k4(lmhVar.m36292jd())));
        }
        long j = 0;
        if (lmhVar.m36328x6() != -1) {
            c10693wk.m51908x1(true);
            byte bM36328x6 = lmhVar.m36328x6();
            if (bM36328x6 == 0) {
                c10693wk.m51898k4(1L);
            } else if (bM36328x6 == 1) {
                c10693wk.m51898k4(2L);
            } else {
                if (bM36328x6 != 2) {
                    throw new NotImplementedException();
                }
                c10693wk.m51898k4(3L);
            }
        } else {
            c10693wk.m51908x1(false);
            c10693wk.m51898k4(0L);
        }
        if (lmhVar.m36310ne() != -1) {
            c10693wk.m51899k4(true);
            byte bM36310ne = lmhVar.m36310ne();
            if (bM36310ne == 0) {
                c10693wk.m51907x1(1L);
            } else if (bM36310ne == 1) {
                c10693wk.m51907x1(2L);
            } else if (bM36310ne == 2) {
                c10693wk.m51907x1(3L);
            } else {
                if (bM36310ne != 3) {
                    throw new NotImplementedException();
                }
                j = 4;
            }
            if (i != 3) {
                c10693wk.m51901kk(true);
                return;
            } else {
                c10693wk.m51901kk(false);
                return;
            }
        }
        c10693wk.m51899k4(false);
        c10693wk.m51907x1(j);
        if (i != 3) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71608k4(com.aspose.slides.internal.p332p7.lmh lmhVar, C10592pm c10592pm, a3u a3uVar) {
        lmhVar.m36294k4(m71596dy(c10592pm, a3uVar));
        long jM71604k4 = m71604k4(c10592pm, a3uVar) - 2147483648L;
        byte bM36286dy = lmhVar.m36286dy();
        if (bM36286dy == 0 || bM36286dy == 1 ? jM71604k4 == 32 || jM71604k4 == 33 || jM71604k4 == 44 || jM71604k4 == 46 || jM71604k4 == 57 : bM36286dy == 2 && ((jM71604k4 > 10 && jM71604k4 < 14) || jM71604k4 == 17 || jM71604k4 == 29)) {
            jM71604k4 = 0;
        }
        lmhVar.m36297k4(jM71604k4);
        lmhVar.m36326x1(m71629x1(c10592pm, a3uVar) - 2147483648L);
        lmhVar.m36315to(m71619kk(c10592pm, a3uVar));
        lmhVar.m36285du(m71623to(c10592pm, a3uVar));
        lmhVar.m36314to(m71622m9(c10592pm, a3uVar));
        lmhVar.m36304kk(((long) m71603k4(c10592pm, 19, a3uVar)) & 4294967295L);
        lmhVar.m36290h4(m71597h4(c10592pm, a3uVar));
        lmhVar.m36309m9(m71598jd(c10592pm, a3uVar));
        lmhVar.m36287dy(m71594du(c10592pm, a3uVar));
        lmhVar.m36284du(m71593c5(c10592pm, a3uVar));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71609k4(com.aspose.slides.internal.p332p7.lmh lmhVar, C10693wk c10693wk, a3u a3uVar) {
        if (c10693wk == null) {
            a3uVar.m3185k4("TimeNodeAtom is not exists.", 0);
            return;
        }
        if (c10693wk.m51893c5()) {
            lmhVar.m36299k4(m71630x1(m71600k4(c10693wk)));
        }
        if (c10693wk.m51902m9()) {
            lmhVar.m36324x1(m71626x1(c10693wk));
        }
        if (c10693wk.m51896h4()) {
            lmhVar.m36302kk(m71616kk(c10693wk));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71610k4(com.aspose.slides.internal.p332p7.lmh lmhVar, C10720xu c10720xu) {
        int iM52014x1 = (int) c10720xu.m52014x1();
        if (iM52014x1 == 0) {
            lmhVar.m36327x1(m71630x1(m71599k4(c10720xu.m52013kk())));
            return;
        }
        if (iM52014x1 == 1) {
            lmhVar.m36305kk(m71630x1(C14069jd.m66766dy(C14069jd.m66776k4(c10720xu.m52013kk()), 0)));
            return;
        }
        if (iM52014x1 == 2) {
            lmhVar.m36295k4(C14069jd.m66766dy(C14069jd.m66776k4(c10720xu.m52013kk()), 0) * 100.0f);
            return;
        }
        if (iM52014x1 == 3) {
            lmhVar.m36325x1(C14069jd.m66766dy(C14069jd.m66776k4(c10720xu.m52013kk()), 0) * 100.0f);
        } else if (iM52014x1 == 4) {
            lmhVar.m36303kk(C14069jd.m66766dy(C14069jd.m66776k4(c10720xu.m52013kk()), 0) * 100.0f);
        } else {
            if (iM52014x1 != 5) {
                return;
            }
            lmhVar.m36300k4((c10720xu.m52013kk() & 4294967295L) != 0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71611k4(com.aspose.slides.internal.p332p7.lmh lmhVar, C10720xu[] c10720xuArr) {
        lmhVar.m36327x1(m71630x1(1.0f));
        lmhVar.m36295k4(100.0f);
        lmhVar.m36325x1(0.0f);
        lmhVar.m36303kk(0.0f);
        lmhVar.m36300k4(false);
        if (c10720xuArr != null) {
            for (C10720xu c10720xu : c10720xuArr) {
                m71610k4(lmhVar, c10720xu);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71612k4(com.aspose.slides.internal.p332p7.no7 no7Var, C10486iy c10486iy, gi8 gi8Var) {
        if (no7Var == null) {
            throw new ArgumentNullException();
        }
        if (c10486iy == null) {
            throw new ArgumentNullException();
        }
        l1y.m64243k4(no7Var, c10486iy);
        l1y.m64246x1(no7Var, c10486iy);
        fut.m6321k4(no7Var.m37771m9(), c10486iy, gi8Var);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71613k4(com.aspose.slides.internal.p332p7.rvh rvhVar, C10409du c10409du) {
        if (rvhVar == null) {
            return;
        }
        if (rvhVar.m40580kk() == -1 && rvhVar.m40582to() == -1 && rvhVar.m40575du() == -1) {
            return;
        }
        C10606qj c10606qj = new C10606qj();
        c10409du.m50513yj().addItem(c10606qj);
        if (rvhVar.m40580kk() != -1) {
            c10606qj.m51566k4(true);
            c10606qj.m51565k4(((long) (rvhVar.m40580kk() == 1 ? 1 : 0)) & 4294967295L);
        } else {
            c10606qj.m51566k4(false);
            c10606qj.m51565k4(0L);
        }
        if (rvhVar.m40575du() != -1) {
            c10606qj.m51570x1(true);
            c10606qj.m51569x1(((long) (rvhVar.m40575du() == 0 ? 0 : 1)) & 4294967295L);
        } else {
            c10606qj.m51570x1(false);
            c10606qj.m51569x1(0L);
        }
        if (rvhVar.m40582to() != -1) {
            c10606qj.m51568kk(true);
            c10606qj.m51567kk(((long) (rvhVar.m40582to() != 0 ? 1 : 0)) & 4294967295L);
        } else {
            c10606qj.m51568kk(false);
            c10606qj.m51567kk(0L);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m71614k4(com.aspose.slides.internal.p332p7.lmh lmhVar) {
        return ("1000".equals(lmhVar.m36282ck()) && C14113y2.m67411k4(lmhVar.m36288fa()) && lmhVar.m36318up() == 100.0f && lmhVar.m36330yj() == 0.0f && lmhVar.m36306ks() == 0.0f && !lmhVar.m36312rv()) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m71615k4(C10592pm c10592pm) {
        C10574od c10574od;
        if (c10592pm == null || (c10574od = (C10574od) C7019kk.m27452k4((Object) c10592pm.m51494k4(18), C10574od.class)) == null) {
            return false;
        }
        return c10574od.m51427du();
    }
}
