package com.aspose.slides.internal.p180ib;

import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p044bq.C1837kk;
import com.aspose.slides.internal.p044bq.InterfaceC1838to;
import com.aspose.slides.internal.p067cu.C2629du;
import com.aspose.slides.internal.p067cu.C2630k4;
import com.aspose.slides.internal.p140fz.C4150m9;
import com.aspose.slides.internal.p140fz.InterfaceC4146h4;
import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p203je.C5443k4;
import com.aspose.slides.internal.p203je.C5444x1;
import com.aspose.slides.internal.p219k6.C5617du;
import com.aspose.slides.internal.p219k6.C5619kk;
import com.aspose.slides.internal.p219k6.C5621x1;
import com.aspose.slides.internal.p219k6.InterfaceC5620to;
import com.aspose.slides.internal.p417td.C10923k4;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p538z2.C13355k4;
import com.aspose.slides.internal.p538z2.C13356x1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ib.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4807kk {

    /* JADX INFO: renamed from: k4 */
    private C4808m9 f13410k4;

    /* JADX INFO: renamed from: x1 */
    private final C13355k4 f13411x1 = m19904x1();

    public C4807kk(C4808m9 c4808m9) {
        this.f13410k4 = c4808m9;
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC4809to m19895k4(C4810x1 c4810x1) {
        return C10923k4.m52679k4(this.f13410k4.m19911kk(), c4810x1);
    }

    /* JADX INFO: renamed from: kk */
    private List<InterfaceC5620to> m19902kk() {
        C12026yj c12026yjM19879k4 = this.f13410k4.m19913x1().m19879k4();
        float fM56930ne = c12026yjM19879k4.m56930ne() / 2.0f;
        if (!C4150m9.m16605k4(c12026yjM19879k4)) {
            return Arrays.asList(m19898k4(c12026yjM19879k4, fM56930ne, fM56930ne));
        }
        ArrayList arrayList = new ArrayList();
        float[] fArrM56910du = c12026yjM19879k4.m56910du();
        for (int i = 0; i < fArrM56910du.length - 1; i++) {
            if (i % 2 == 0) {
                arrayList.add(m19898k4(c12026yjM19879k4, Math.abs(0.5f - fArrM56910du[i]) * 2.0f * fM56930ne, Math.abs(0.5f - fArrM56910du[i + 1]) * 2.0f * fM56930ne));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x1 */
    private C2629du m19903x1(C11896dy c11896dy) {
        return new C2630k4(this.f13410k4.m19913x1()).m12017k4(c11896dy);
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC4809to m19896k4(C11896dy c11896dy, InterfaceC4809to interfaceC4809to) {
        C5443k4 c5443k4M22270k4 = C5444x1.m22270k4(this.f13410k4.m19913x1().m19879k4(), c11896dy, interfaceC4809to);
        return c5443k4M22270k4 != null ? c5443k4M22270k4 : interfaceC4809to;
    }

    /* JADX INFO: renamed from: x1 */
    private C13355k4 m19904x1() {
        if (!m19901k4(this.f13410k4.m19906k4().m55568ne())) {
            return new C13355k4();
        }
        C11896dy[] c11896dyArrM55561k4 = this.f13410k4.m19906k4().m55561k4(false);
        C13355k4 c13355k4 = new C13355k4();
        for (C11896dy c11896dy : c11896dyArrM55561k4) {
            if (!c11896dy.m55568ne().mo8359kk(null).mo17821x1()) {
                c13355k4.m62021k4(m19899k4(c11896dy));
            }
        }
        return c13355k4;
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC4809to m19897k4(C11896dy c11896dy, InterfaceC4809to interfaceC4809to, InterfaceC1838to interfaceC1838to) {
        InterfaceC4146h4 interfaceC4146h4M16601k4 = C4150m9.m16601k4(this.f13410k4.m19913x1(), c11896dy);
        return new C1837kk(this.f13410k4.m19913x1(), this.f13410k4.m19912to(), interfaceC4809to, interfaceC1838to, interfaceC4146h4M16601k4.mo16592k4() ? interfaceC4146h4M16601k4.mo16594x1() : Collections.singletonList(interfaceC4146h4M16601k4), m19902kk());
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC5620to m19898k4(C12026yj c12026yj, float f, float f2) {
        int iM56941yj = c12026yj.m56941yj();
        if (iM56941yj != 0) {
            if (iM56941yj == 1) {
                return new C5621x1();
            }
            if (iM56941yj == 2) {
                return new C5619kk(f, f2, c12026yj.m56940x6());
            }
            if (iM56941yj != 3) {
                throw new InvalidEnumArgumentException("LineJoin");
            }
        }
        return new C5617du(c12026yj);
    }

    /* JADX INFO: renamed from: k4 */
    public C13355k4 m19905k4() {
        return this.f13411x1;
    }

    /* JADX INFO: renamed from: k4 */
    private C13356x1 m19899k4(C11896dy c11896dy) {
        C12026yj c12026yjM19879k4 = this.f13410k4.m19913x1().m19879k4();
        C4805h4 c4805h4 = new C4805h4(c12026yjM19879k4);
        try {
            c11896dy.m55526dy();
            C2629du c2629duM19903x1 = m19903x1(c11896dy);
            if (c12026yjM19879k4.m56912fa() == 255 && c2629duM19903x1.m12001h4() != null) {
                c12026yjM19879k4.m56938x1(c2629duM19903x1.m12001h4());
            }
            if (c12026yjM19879k4.m56934up() == 255 && c2629duM19903x1.m12008m9() != null) {
                c12026yjM19879k4.m56921k4(c2629duM19903x1.m12008m9());
            }
            boolean zM55569rv = c11896dy.m55569rv();
            C4810x1 c4810x1 = new C4810x1();
            InterfaceC4809to interfaceC4809toM19895k4 = m19895k4(c4810x1);
            C4810x1 c4810x12 = new C4810x1();
            InterfaceC4809to interfaceC4809toM19895k42 = m19895k4(c4810x12);
            C4810x1 c4810x13 = new C4810x1();
            C4803du.m19874k4(c2629duM19903x1.m12002k4(), m19896k4(c11896dy, m19897k4(c11896dy, interfaceC4809toM19895k4, new C4806k4(this.f13410k4, c11896dy, zM55569rv, c2629duM19903x1, interfaceC4809toM19895k42, m19895k4(c4810x13), interfaceC4809toM19895k4))));
            C13356x1 c13356x1 = new C13356x1();
            c13356x1.f44711k4 = c4810x1.m19914kk();
            c13356x1.f44713x1 = c4810x12.m19914kk();
            c13356x1.f44712kk = c4810x13.m19914kk();
            c4805h4.m19883k4(c12026yjM19879k4);
            return c13356x1;
        } catch (Throwable th) {
            c4805h4.m19883k4(c12026yjM19879k4);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19900k4(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19901k4(InterfaceC1565x1 interfaceC1565x1) {
        float[] fArr = new float[6];
        InterfaceC4413v4 interfaceC4413v4Mo8359kk = interfaceC1565x1.mo8359kk(null);
        while (!interfaceC4413v4Mo8359kk.mo17821x1()) {
            int iMo17818k4 = interfaceC4413v4Mo8359kk.mo17818k4(fArr);
            if (iMo17818k4 != 0 && iMo17818k4 != 1) {
                if (iMo17818k4 != 2) {
                    if (iMo17818k4 != 3) {
                        continue;
                    } else if (!m19900k4(fArr[4]) || !m19900k4(fArr[5])) {
                        return false;
                    }
                }
                if (!m19900k4(fArr[2]) || !m19900k4(fArr[3])) {
                    return false;
                }
                if (m19900k4(fArr[0])) {
                }
                return false;
            }
            if (m19900k4(fArr[0]) || !m19900k4(fArr[1])) {
                return false;
            }
            interfaceC4413v4Mo8359kk.mo17820kk();
        }
        return true;
    }
}
