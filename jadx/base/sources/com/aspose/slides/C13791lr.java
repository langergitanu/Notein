package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.lr */
/* JADX INFO: loaded from: classes3.dex */
class C13791lr extends AbstractC14463so {

    /* JADX INFO: renamed from: k4 */
    private String f46056k4;

    /* JADX INFO: renamed from: kk */
    private boolean f46057kk;

    /* JADX INFO: renamed from: x1 */
    private long f46058x1;

    public C13791lr(C13791lr c13791lr) {
        this.f46056k4 = c13791lr.m64509kk();
        this.f46058x1 = c13791lr.m64504k4();
        this.f46057kk = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m64504k4() {
        return this.f46058x1;
    }

    /* JADX INFO: renamed from: kk */
    public final String m64509kk() {
        return this.f46056k4;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m64510to() {
        return this.f46057kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m64511x1() {
        return (float) (this.f46058x1 / 60000.0d);
    }

    public C13791lr(String str, long j) {
        this.f46056k4 = str;
        this.f46058x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64505k4(float f) {
        m64506k4(C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(((double) f) * 60000.0d)), 14));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64512x1(String str) {
        if (str.charAt(0) != 'v' && str.charAt(1) != 'a' && str.charAt(2) != 'l' && str.charAt(3) != ' ') {
            throw new PptxReadException(C14113y2.m67402k4("Error reading adjustment value: {0} = \"{1}\"", this.f46056k4, str));
        }
        int i = 4;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        this.f46058x1 = C13850af.m65122ks(C14113y2.m67422kk(str, i));
    }

    public C13791lr(String str, String str2) {
        this.f46056k4 = str;
        m64512x1(str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64506k4(long j) {
        this.f46058x1 = j;
        this.f46057kk = false;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64507k4(String str) {
        this.f46056k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64508k4(boolean z) {
        this.f46057kk = z;
    }
}
