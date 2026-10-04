package com.aspose.slides.internal.p022ai;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ai.fa */
/* JADX INFO: loaded from: classes3.dex */
public class C1374fa extends AbstractC1370c5 {

    /* JADX INFO: renamed from: du */
    private static final String[] f5955du = {"lr-tb", "rl-tb", "tb-lr", "tb-rl"};

    /* JADX INFO: renamed from: h4 */
    private static final int[] f5956h4 = {79, 121, 205, 140};

    /* JADX INFO: renamed from: k4 */
    public static final C1374fa f5957k4;

    /* JADX INFO: renamed from: kk */
    public static final C1374fa f5958kk;

    /* JADX INFO: renamed from: m9 */
    private static final C1374fa[] f5959m9;

    /* JADX INFO: renamed from: to */
    public static final C1374fa f5960to;

    /* JADX INFO: renamed from: x1 */
    public static final C1374fa f5961x1;

    static {
        C1374fa c1374fa = new C1374fa(0);
        f5957k4 = c1374fa;
        C1374fa c1374fa2 = new C1374fa(1);
        f5961x1 = c1374fa2;
        C1374fa c1374fa3 = new C1374fa(2);
        f5958kk = c1374fa3;
        C1374fa c1374fa4 = new C1374fa(3);
        f5960to = c1374fa4;
        f5959m9 = new C1374fa[]{c1374fa, c1374fa2, c1374fa3, c1374fa4};
    }

    private C1374fa(int i) {
        super(f5955du[i], f5956h4[i]);
    }

    /* JADX INFO: renamed from: k4 */
    public static C1374fa m8142k4(int i) {
        int i2 = 0;
        while (true) {
            C1374fa[] c1374faArr = f5959m9;
            if (i2 >= c1374faArr.length) {
                throw new ArgumentException(C14113y2.m67408k4("Illegal writing mode: ", C14057f9.m66591x1(i)));
            }
            if (c1374faArr[i2].m8127x1() == i) {
                return c1374faArr[i2];
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m8144kk() {
        int iM8127x1 = m8127x1();
        return (iM8127x1 == 140 || iM8127x1 == 205) ? false : true;
    }

    public String toString() {
        return m8126k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8143k4(InterfaceC1372du interfaceC1372du) {
        C1378kk c1378kk;
        C1378kk c1378kk2;
        C1378kk c1378kk3;
        int iM8127x1 = m8127x1();
        if (iM8127x1 != 121) {
            if (iM8127x1 == 140) {
                c1378kk = C1378kk.f5980kk;
                c1378kk3 = C1378kk.f5983x1;
                c1378kk2 = C1378kk.f5979k4;
            } else if (iM8127x1 != 205) {
                c1378kk = C1378kk.f5979k4;
            } else {
                c1378kk = C1378kk.f5980kk;
                c1378kk3 = C1378kk.f5979k4;
                c1378kk2 = C1378kk.f5983x1;
            }
            C1378kk c1378kk4 = c1378kk3;
            C1378kk c1378kk5 = c1378kk2;
            C1378kk c1378kk6 = c1378kk;
            interfaceC1372du.mo8131k4(c1378kk);
            interfaceC1372du.mo8134x1(c1378kk4);
            interfaceC1372du.mo8132kk(c1378kk6);
            interfaceC1372du.mo8133to(c1378kk4);
            interfaceC1372du.mo8129du(c1378kk5);
            interfaceC1372du.mo8130k4(this);
        }
        c1378kk = C1378kk.f5983x1;
        c1378kk3 = C1378kk.f5980kk;
        c1378kk2 = C1378kk.f5982to;
        C1378kk c1378kk42 = c1378kk3;
        C1378kk c1378kk52 = c1378kk2;
        C1378kk c1378kk62 = c1378kk;
        interfaceC1372du.mo8131k4(c1378kk);
        interfaceC1372du.mo8134x1(c1378kk42);
        interfaceC1372du.mo8132kk(c1378kk62);
        interfaceC1372du.mo8133to(c1378kk42);
        interfaceC1372du.mo8129du(c1378kk52);
        interfaceC1372du.mo8130k4(this);
    }
}
