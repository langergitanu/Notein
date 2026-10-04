package com.aspose.slides.internal.p430tx;

import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13851ai;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.gi */
/* JADX INFO: loaded from: classes4.dex */
public class C11188gi extends C11221um {

    /* JADX INFO: renamed from: c5 */
    private C11230wy f38528c5;

    /* JADX INFO: renamed from: du */
    private int f38529du;

    /* JADX INFO: renamed from: dy */
    private boolean f38530dy;

    /* JADX INFO: renamed from: h4 */
    private String f38531h4;

    /* JADX INFO: renamed from: kk */
    private String f38532kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f38533m9;

    /* JADX INFO: renamed from: to */
    private String f38534to;

    /* JADX INFO: renamed from: x1 */
    private String f38535x1;

    public C11188gi() {
        String str = C14113y2.f47374k4;
        m53792k4(str, str, str, 0, str, false);
    }

    /* JADX INFO: renamed from: du */
    public final int m53789du() {
        return this.f38529du;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m53790h4() {
        return this.f38531h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53791k4(int i) {
        this.f38529du = i;
    }

    /* JADX INFO: renamed from: kk */
    public final String m53794kk() {
        return this.f38532kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m53796m9() {
        return this.f38533m9;
    }

    /* JADX INFO: renamed from: to */
    public final String m53797to() {
        return this.f38534to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m53799x1() {
        return this.f38535x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53792k4(String str, String str2, String str3, int i, String str4, boolean z) {
        this.f38711k4 = null;
        this.f38535x1 = str;
        this.f38532kk = str2;
        this.f38534to = str3;
        this.f38529du = i;
        this.f38531h4 = str4;
        this.f38533m9 = z;
        this.f38530dy = false;
        this.f38528c5 = null;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53795kk(String str) {
        this.f38534to = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m53798to(String str) {
        this.f38531h4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53793k4(String str, String[] strArr) {
        for (C11182e0 c11182e0M53711to = this.f38711k4; c11182e0M53711to != null; c11182e0M53711to = c11182e0M53711to.m53711to()) {
            if (C13851ai.m65152k4(c11182e0M53711to.m53712x1(), str) && c11182e0M53711to.m53708k4() != null && c11182e0M53711to.m53708k4().length() > 0) {
                strArr[0] = c11182e0M53711to.m53708k4();
                return true;
            }
        }
        strArr[0] = C14113y2.f47374k4;
        return false;
    }
}
