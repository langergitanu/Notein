package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8967uo;
import com.aspose.slides.internal.p407st.AbstractC10539m9;
import com.aspose.slides.internal.p407st.C10389ck;
import com.aspose.slides.internal.p407st.C10435fa;
import com.aspose.slides.internal.p407st.C10559ne;
import com.aspose.slides.internal.p407st.C10567nz;
import com.aspose.slides.internal.p407st.C10625ru;
import com.aspose.slides.internal.p407st.C10670up;
import com.aspose.slides.internal.p407st.C10714xk;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.q1 */
/* JADX INFO: loaded from: classes3.dex */
class C14323q1 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f48220k4 = new C7017h4("bldP", "bldDgm", "bldOleChart");

    /* JADX INFO: renamed from: k4 */
    private static int m69356k4(long j) {
        int i = (int) j;
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    /* JADX INFO: renamed from: kk */
    private static int m69359kk(long j) {
        int i = (int) j;
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m69360x1(long j) {
        switch ((int) j) {
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
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69357k4(com.aspose.slides.internal.p332p7.ehe eheVar, AbstractC10539m9 abstractC10539m9, gi8 gi8Var) {
        if (eheVar == null || eheVar.m31098to() == null || eheVar.m31098to().m41741k4().size() == 0) {
            return;
        }
        C10435fa c10435fa = new C10435fa();
        abstractC10539m9.m50513yj().addItem(c10435fa);
        List.Enumerator<C7394ca> it = eheVar.m31098to().m41741k4().iterator();
        long j = 0;
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f48220k4.m27428k4(next.m29539k4());
                if (iM27428k4 == 0) {
                    long[] jArr = {j};
                    C14212o2.m68319k4((com.aspose.slides.internal.p332p7.c9d) next.m29542x1(), c10435fa, jArr, gi8Var);
                    j = jArr[0];
                } else if (iM27428k4 == 1) {
                    C14212o2.m68321k4((com.aspose.slides.internal.p332p7.lkb) next.m29542x1(), c10435fa, gi8Var);
                } else if (iM27428k4 != 2) {
                    gi8Var.m6691k4("Writing of the animation build list failed.", 1);
                } else {
                    C14212o2.m68320k4((com.aspose.slides.internal.p332p7.ljk) next.m29542x1(), c10435fa, gi8Var);
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
    public static void m69358k4(C8967uo c8967uo, m4c m4cVar) {
        if (m4cVar.m64729ne() == null) {
            return;
        }
        C10567nz c10567nz = (C10567nz) m4cVar.m64729ne();
        if (c10567nz.m51389to() == null || c10567nz.m51389to().m50995ck() == null || c10567nz.m51389to().m50995ck().m50513yj() == null || c10567nz.m51389to().m50995ck().m50513yj().size() == 0 || C7019kk.m27469x1(c10567nz.m51389to().m50995ck().m50513yj().get_Item(0), C10389ck.class)) {
            return;
        }
        com.aspose.slides.internal.p332p7.tif tifVarM31099x1 = c8967uo.m42508jd().m31099x1();
        for (C10670up c10670up : c10567nz.m51389to().m50995ck().m50786x1()) {
            C10625ru c10625ru = (C10625ru) C7019kk.m27452k4((Object) c10670up, C10625ru.class);
            if (c10625ru != null && m4cVar.m64738wl().containsKey(Long.valueOf(c10625ru.m51815x1().m50556kk()))) {
                com.aspose.slides.internal.p332p7.c9d c9dVar = (com.aspose.slides.internal.p332p7.c9d) tifVarM31099x1.m41742k4("bldP").m29542x1();
                c9dVar.m29493k4(m69356k4(c10625ru.m51657to().m51771x1()));
                c9dVar.m29495k4(C13850af.m65147x1(c10625ru.m51815x1().m50556kk()));
                c9dVar.m29504x1((c10625ru.m51657to().m51769to() & 255) == 1);
                c9dVar.m29502x1(c10625ru.m51657to().m51767kk());
                c9dVar.m29497kk((c10625ru.m51657to().m51764du() & 255) == 1);
                c9dVar.m29494k4(c10625ru.m51815x1().m50558x1());
            }
            C10714xk c10714xk = (C10714xk) C7019kk.m27452k4((Object) c10670up, C10714xk.class);
            if (c10714xk != null) {
                com.aspose.slides.internal.p332p7.lkb lkbVar = (com.aspose.slides.internal.p332p7.lkb) tifVarM31099x1.m41742k4("bldDgm").m29542x1();
                lkbVar.m36215k4(C13850af.m65147x1(c10714xk.m51815x1().m50556kk()));
                lkbVar.m36214k4(m69360x1(c10714xk.m51978to().m50699x1()));
            }
            C10559ne c10559ne = (C10559ne) C7019kk.m27452k4((Object) c10670up, C10559ne.class);
            if (c10559ne != null) {
                com.aspose.slides.internal.p332p7.ljk ljkVar = (com.aspose.slides.internal.p332p7.ljk) tifVarM31099x1.m41742k4("bldOleChart").m29542x1();
                ljkVar.m36186k4(C13850af.m65147x1(c10559ne.m51815x1().m50556kk()));
                ljkVar.m36185k4(m69359kk(c10559ne.m51367to().m51971x1()));
            }
        }
    }
}
