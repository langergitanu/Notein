package com.aspose.slides.internal.p159h0;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.vh */
/* JADX INFO: loaded from: classes.dex */
final class C4477vh {
    /* JADX INFO: renamed from: k4 */
    public static void m18398k4(C4444f9 c4444f9, C4474up c4474up, boolean z) {
        C4488yj c4488yjM18187x1;
        C4474up c4474up2;
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < 3 && c4474up.m18388x1()[i] != null; i2++) {
                if (c4474up.m18388x1()[i].m18432x1()[i2] != c4474up) {
                    if (c4474up.m18388x1()[i].m18432x1()[i2].m18388x1()[0] == c4474up.m18388x1()[i]) {
                        c4474up.m18388x1()[i].m18432x1()[i2].m18388x1()[0] = null;
                        if (!z && c4474up.m18388x1()[i].m18432x1()[i2].m18388x1()[1] == null) {
                            c4488yjM18187x1 = c4444f9.m18187x1();
                            c4474up2 = c4474up.m18388x1()[i].m18432x1()[i2];
                            c4488yjM18187x1.m18495x1(c4474up2);
                        }
                    } else if (c4474up.m18388x1()[i].m18432x1()[i2].m18388x1()[1] == c4474up.m18388x1()[i]) {
                        c4474up.m18388x1()[i].m18432x1()[i2].m18388x1()[1] = null;
                        if (!z && c4474up.m18388x1()[i].m18432x1()[i2].m18388x1()[0] == null) {
                            c4488yjM18187x1 = c4444f9.m18187x1();
                            c4474up2 = c4474up.m18388x1()[i].m18432x1()[i2];
                            c4488yjM18187x1.m18495x1(c4474up2);
                        }
                    }
                }
            }
            for (int i3 = 0; i3 < 3; i3++) {
                if (c4474up.m18388x1()[i] != null) {
                    c4474up.m18388x1()[i].m18427k4()[i3].m18309to().m18328x1(c4474up.m18388x1()[i]);
                }
            }
            c4444f9.m18186to().m18328x1(c4474up.m18388x1()[i]);
        }
        c4444f9.m18187x1().m18495x1(c4474up);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18399k4(C4444f9 c4444f9, C4481wp c4481wp, boolean z) {
        C4488yj c4488yjM18187x1;
        C4474up c4474up;
        for (int i = 0; i < 3; i++) {
            if (c4481wp == c4481wp.m18432x1()[i].m18388x1()[0]) {
                c4481wp.m18432x1()[i].m18388x1()[0] = null;
                if (!z && c4481wp.m18432x1()[i].m18388x1()[1] == null) {
                    c4488yjM18187x1 = c4444f9.m18187x1();
                    c4474up = c4481wp.m18432x1()[i];
                    c4488yjM18187x1.m18495x1(c4474up);
                }
            } else if (c4481wp == c4481wp.m18432x1()[i].m18388x1()[1]) {
                c4481wp.m18432x1()[i].m18388x1()[1] = null;
                if (!z && c4481wp.m18432x1()[i].m18388x1()[0] == null) {
                    c4488yjM18187x1 = c4444f9.m18187x1();
                    c4474up = c4481wp.m18432x1()[i];
                    c4488yjM18187x1.m18495x1(c4474up);
                }
            }
        }
        for (int i2 = 0; i2 < 3; i2++) {
            c4481wp.m18427k4()[i2].m18309to().m18328x1(c4481wp);
        }
        c4444f9.m18186to().m18328x1(c4481wp);
    }
}
