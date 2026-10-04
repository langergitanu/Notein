package com.aspose.slides.internal.p462vj;

import Oooo0oO.C21034OooOOOo;
import com.aspose.slides.OooO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p022ai.C1374fa;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.ts */
/* JADX INFO: loaded from: classes4.dex */
public class C11670ts {

    /* JADX INFO: renamed from: du */
    private C1374fa f39383du;

    /* JADX INFO: renamed from: dy */
    private int f39384dy;

    /* JADX INFO: renamed from: h4 */
    private int f39385h4;

    /* JADX INFO: renamed from: k4 */
    private int f39386k4;

    /* JADX INFO: renamed from: kk */
    private int f39387kk;

    /* JADX INFO: renamed from: m9 */
    private int f39388m9;

    /* JADX INFO: renamed from: to */
    private int f39389to;

    /* JADX INFO: renamed from: x1 */
    private int f39390x1;

    public C11670ts(int i, int i2, int i3, int i4, C1374fa c1374fa) {
        this.f39386k4 = i;
        this.f39390x1 = i2;
        this.f39387kk = i3;
        this.f39389to = i4;
        this.f39383du = c1374fa;
        int iM54933kk = m54933kk(i4);
        this.f39385h4 = iM54933kk;
        this.f39388m9 = i - iM54933kk;
        this.f39384dy = i2 - iM54933kk;
    }

    /* JADX INFO: renamed from: kk */
    private int m54933kk(int i) {
        if (i == 6) {
            return 0;
        }
        if (i == 24) {
            int i2 = this.f39386k4;
            int i3 = this.f39390x1;
            return C21034OooOOOo.OooO00o(i2, i3, 2, i3);
        }
        if (i == 56) {
            return OooO.OooO00o(this.f39386k4 * 0.8f, 14);
        }
        if (i != 59) {
            if (i == 82) {
                return OooO.OooO00o(this.f39386k4 * 0.5f, 14);
            }
            if (i == 84) {
                return this.f39387kk / 2;
            }
            if (i != 141) {
                if (i == 142) {
                    return this.f39386k4;
                }
                throw new ArgumentException(C14057f9.m66591x1(i));
            }
        }
        return this.f39390x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m54935k4() {
        return this.f39389to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C1374fa m54938x1() {
        return this.f39383du;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m54936k4(int i) {
        if (!m54934kk()) {
            if (i != 20) {
                switch (i) {
                }
            }
            throw new ArgumentException(C14113y2.m67408k4("Baseline ", C14057f9.m66591x1(i), " only supported for horizontal writing modes"));
        }
        if (i != 4) {
            if (i != 6) {
                if (i != 14) {
                    if (i != 20) {
                        if (i != 24 && i != 56 && i != 59 && i != 82 && i != 84) {
                            switch (i) {
                                case 141:
                                case 142:
                                case 143:
                                case 144:
                                    break;
                                case 145:
                                    break;
                                default:
                                    throw new ArgumentException(C14057f9.m66591x1(i));
                            }
                        }
                    }
                }
                return this.f39388m9;
            }
            return m54933kk(i) - this.f39385h4;
        }
        return this.f39384dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final C11670ts m54939x1(int i) {
        return new C11670ts(this.f39386k4, this.f39390x1, this.f39387kk, i, this.f39383du);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54937k4(int i, int i2) {
        this.f39388m9 = i;
        this.f39384dy = i2;
    }

    /* JADX INFO: renamed from: kk */
    private boolean m54934kk() {
        return this.f39383du.m8144kk();
    }
}
