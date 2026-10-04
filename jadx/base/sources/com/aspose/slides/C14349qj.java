package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7341br;
import com.aspose.slides.internal.p332p7.C7585en;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.qj */
/* JADX INFO: loaded from: classes3.dex */
class C14349qj {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f48357k4 = new C7017h4("masterClrMapping", "overrideClrMapping");

    /* JADX INFO: renamed from: k4 */
    public static void m69668k4(Chart chart, AbstractC4685kk<C7341br> abstractC4685kk) {
        if (chart.m517up().m63294k4()) {
            m69676x1(chart.m517up(), abstractC4685kk.invoke());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public static void m69675x1(IThemeManager iThemeManager, C7341br c7341br) {
        m69676x1(((BaseThemeManager) iThemeManager).m423to(), c7341br);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69669k4(Chart chart, C7341br c7341br) {
        m69673k4(chart.m517up(), c7341br);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m69676x1(C13682je c13682je, C7341br c7341br) {
        c7341br.m29078k4(c13682je.m63296x1());
        c7341br.m29077k4(c13682je.m63289k4(0));
        c7341br.m29087x1(c13682je.m63289k4(1));
        c7341br.m29080kk(c13682je.m63289k4(2));
        c7341br.m29084to(c13682je.m63289k4(3));
        c7341br.m29067du(c13682je.m63289k4(4));
        c7341br.m29073h4(c13682je.m63289k4(5));
        c7341br.m29082m9(c13682je.m63289k4(6));
        c7341br.m29069dy(c13682je.m63289k4(7));
        c7341br.m29063c5(c13682je.m63289k4(8));
        c7341br.m29075jd(c13682je.m63289k4(9));
        c7341br.m29065ck(c13682je.m63289k4(10));
        c7341br.m29071fa(c13682je.m63289k4(11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m69670k4(IThemeManager iThemeManager, C7341br c7341br) {
        m69673k4(((BaseThemeManager) iThemeManager).m423to(), c7341br);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m69677x1(C13682je c13682je, C7585en c7585en) {
        if (c13682je == null || !c13682je.m63294k4()) {
            c7585en.m31163k4("masterClrMapping");
        } else {
            m69676x1(c13682je, (C7341br) c7585en.m31163k4("overrideClrMapping").m29542x1());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m69671k4(IThemeManager iThemeManager, C7585en c7585en) {
        C13682je c13682jeM423to = ((BaseThemeManager) iThemeManager).m423to();
        c13682jeM423to.m63293k4(false);
        m69674k4(c13682jeM423to, c7585en);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69672k4(C13682je c13682je, AbstractC4685kk<C7341br> abstractC4685kk) {
        if (c13682je.m63294k4()) {
            m69676x1(c13682je, abstractC4685kk.invoke());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69673k4(C13682je c13682je, C7341br c7341br) {
        c13682je.m63293k4(false);
        if (c7341br == null) {
            return;
        }
        c13682je.m63293k4(true);
        c13682je.m63291k4(c7341br.m29085up());
        c13682je.m63290k4(0, c7341br.m29076k4());
        c13682je.m63290k4(1, c7341br.m29086x1());
        c13682je.m63290k4(2, c7341br.m29079kk());
        c13682je.m63290k4(3, c7341br.m29083to());
        c13682je.m63290k4(4, c7341br.m29066du());
        c13682je.m63290k4(5, c7341br.m29072h4());
        c13682je.m63290k4(6, c7341br.m29081m9());
        c13682je.m63290k4(7, c7341br.m29068dy());
        c13682je.m63290k4(8, c7341br.m29062c5());
        c13682je.m63290k4(9, c7341br.m29074jd());
        c13682je.m63290k4(10, c7341br.m29064ck());
        c13682je.m63290k4(11, c7341br.m29070fa());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69674k4(C13682je c13682je, C7585en c7585en) {
        int iM27428k4;
        if (c7585en == null || c7585en.m31162k4() == null || (iM27428k4 = f48357k4.m27428k4(c7585en.m31162k4().m29539k4())) == 0) {
            return;
        }
        if (iM27428k4 != 1) {
            throw new Exception(C14113y2.m67408k4("Unknown element \"", c7585en.m31162k4().m29539k4(), "\""));
        }
        m69673k4(c13682je, (C7341br) c7585en.m31162k4().m29542x1());
    }
}
