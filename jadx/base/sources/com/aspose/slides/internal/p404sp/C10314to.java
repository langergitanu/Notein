package com.aspose.slides.internal.p404sp;

import com.aspose.slides.internal.p136fr.C4113k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p505xn.C12575x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.sp.to */
/* JADX INFO: loaded from: classes4.dex */
public class C10314to {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f36739to = new C7017h4("activeborder", "activecaption", "appworkspace", "background", "buttonface", "buttonhighlight", "buttonshadow", "buttontext", "captiontext", "graytext", "highlight", "highlighttext", "inactiveborder", "inactivecaption", "inactivecaptiontext", "infobackground", "infotext", "menu", "menutext", "scrollbar", "threeddarkshadow", "threedface", "threedhighlight", "threedlightshadow", "threedshadow", "window", "windowframe", "windowtext");

    /* JADX INFO: renamed from: k4 */
    private String f36740k4;

    /* JADX INFO: renamed from: kk */
    private C12003du f36741kk = new C12003du();

    /* JADX INFO: renamed from: x1 */
    private int f36742x1;

    public C10314to(C12003du c12003du) {
        m50294k4(c12003du.Clone());
        m50293k4(1);
    }

    /* JADX INFO: renamed from: k4 */
    public static C10314to m50289k4(String str) {
        return m50290k4(str, 1.0f);
    }

    /* JADX INFO: renamed from: x1 */
    private static C12003du m50291x1(String str) {
        switch (f36739to.m27428k4(C14113y2.m67361du(str))) {
            case 0:
                return C12575x1.m58689k4();
            case 1:
                return C12575x1.m58704x1();
            case 2:
                return C12575x1.m58697to();
            case 3:
                return C12575x1.m58707yj();
            case 4:
                return C12575x1.m58683du();
            case 5:
                return C12575x1.m58686h4();
            case 6:
                return C12575x1.m58693m9();
            case 7:
                return C12575x1.m58700up();
            case 8:
                return C12575x1.m58690kk();
            case 9:
                return C12575x1.m58691ks();
            case 10:
                return C12575x1.m58696rv();
            case 11:
                return C12575x1.m58705x6();
            case 12:
                return C12575x1.m58687ix();
            case 13:
                return C12575x1.m58698u4();
            case 14:
                return C12575x1.m58701uz();
            case 15:
                return C12575x1.m58703wl();
            case 16:
                return C12575x1.m58695qq();
            case 17:
                return C12575x1.m58679ar();
            case 18:
                return C12575x1.m58699um();
            case 19:
                return C12575x1.m58680bv();
            case 20:
                return C12575x1.m58688jd();
            case 21:
                return C12575x1.m58684dy();
            case 22:
                return C12575x1.m58682ck();
            case 23:
                return C12575x1.m58685fa();
            case 24:
                return C12575x1.m58681c5();
            case 25:
                return C12575x1.m58702v4();
            case 26:
                return C12575x1.m58692lr();
            case 27:
                return C12575x1.m58706yd();
            default:
                return C12003du.m56402k4(str);
        }
    }

    public String toString() {
        String str = this.f36740k4;
        return str != null ? str : C14113y2.m67402k4("#{0}{1}{2}", C14098up.m67321k4(m50292k4().m56507jd(), "X2", C11697x1.m55250kk()), C14098up.m67321k4(m50292k4().m56502ck(), "X2", C11697x1.m55250kk()), C14098up.m67321k4(m50292k4().m56505fa(), "X2", C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: k4 */
    public static C10314to m50290k4(String str, float f) {
        C12003du c12003duClone;
        String strM67440x1 = str;
        C10314to c10314to = new C10314to(C12003du.m56458up().Clone());
        c10314to.f36740k4 = strM67440x1;
        if (strM67440x1 != null) {
            try {
                strM67440x1 = C14113y2.m67440x1(strM67440x1);
            } catch (RuntimeException e) {
                if (!C4113k4.f11284k4) {
                    throw e;
                }
            }
        }
        if ("none".equals(C14113y2.m67368h4(strM67440x1))) {
            return c10314to;
        }
        int iM27462to = C7019kk.m27462to(Float.valueOf(255.0f * f), 13);
        if (C14113y2.m67448x1(C14113y2.m67368h4(strM67440x1), "rgb(")) {
            String strM67401k4 = C14113y2.m67401k4(strM67440x1, "rgb(", C14113y2.f47374k4);
            if (C14113y2.m67424kk(C14113y2.m67368h4(strM67401k4), ")")) {
                strM67401k4 = C14113y2.m67401k4(strM67401k4, ")", C14113y2.f47374k4);
            }
            String[] strArrM67417k4 = C14113y2.m67417k4(strM67401k4, new String[]{","}, 1);
            c12003duClone = C12003du.m56398k4(iM27462to, !C14113y2.m67424kk(strArrM67417k4[0], "%") ? C14080ne.m67015to(strArrM67417k4[0]) : C7019kk.m27462to(Double.valueOf(C14116yg.m67497to((C14080ne.m66988m9(C14113y2.m67362du(strArrM67417k4[0], '%')) * 255.0d) / 100.0d)), 14), !C14113y2.m67424kk(strArrM67417k4[1], "%") ? C14080ne.m67015to(strArrM67417k4[1]) : C7019kk.m27462to(Double.valueOf(C14116yg.m67497to((C14080ne.m66988m9(C14113y2.m67362du(strArrM67417k4[1], '%')) * 255.0d) / 100.0d)), 14), !C14113y2.m67424kk(strArrM67417k4[2], "%") ? C14080ne.m67015to(strArrM67417k4[2]) : C7019kk.m27462to(Double.valueOf(C14116yg.m67497to((C14080ne.m66988m9(C14113y2.m67362du(strArrM67417k4[2], '%')) * 255.0d) / 100.0d)), 14)).Clone();
        } else if (C14113y2.m67448x1(C14113y2.m67368h4(strM67440x1), "#") && strM67440x1.length() == 7) {
            String strM67401k42 = C14113y2.m67401k4(strM67440x1, "#", C14113y2.f47374k4);
            String[] strArr = {C14113y2.m67443x1(strM67401k42, 0, 2), C14113y2.m67443x1(strM67401k42, 2, 2), C14113y2.m67443x1(strM67401k42, 4, 2)};
            c12003duClone = C12003du.m56398k4(iM27462to, C14057f9.m66583k4(strArr[0], 512), C14057f9.m66583k4(strArr[1], 512), C14057f9.m66583k4(strArr[2], 512)).Clone();
        } else if (C14113y2.m67448x1(C14113y2.m67368h4(strM67440x1), "#") && strM67440x1.length() == 4) {
            String strM67401k43 = C14113y2.m67401k4(strM67440x1, "#", C14113y2.f47374k4);
            String[] strArr2 = {C14113y2.m67408k4(C14113y2.m67443x1(strM67401k43, 0, 1), C14113y2.m67443x1(strM67401k43, 0, 1)), C14113y2.m67408k4(C14113y2.m67443x1(strM67401k43, 1, 1), C14113y2.m67443x1(strM67401k43, 1, 1)), C14113y2.m67408k4(C14113y2.m67443x1(strM67401k43, 2, 1), C14113y2.m67443x1(strM67401k43, 2, 1))};
            c12003duClone = C12003du.m56398k4(iM27462to, C14057f9.m66583k4(strArr2[0], 512), C14057f9.m66583k4(strArr2[1], 512), C14057f9.m66583k4(strArr2[2], 512)).Clone();
        } else {
            C12003du c12003duClone2 = m50291x1(strM67440x1).Clone();
            c12003duClone = C12003du.m56398k4(iM27462to, c12003duClone2.m56507jd() & 255, c12003duClone2.m56502ck() & 255, c12003duClone2.m56505fa() & 255).Clone();
        }
        c10314to.m50294k4(c12003duClone);
        return c10314to;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12003du m50292k4() {
        return this.f36741kk.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50293k4(int i) {
        this.f36742x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50294k4(C12003du c12003du) {
        this.f36741kk = c12003du.Clone();
    }
}
