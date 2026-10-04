package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.dn */
/* JADX INFO: loaded from: classes4.dex */
public class C10405dn {

    /* JADX INFO: renamed from: k4 */
    private int f36945k4;

    /* JADX INFO: renamed from: x1 */
    private short f36946x1;

    public C10405dn() {
        this.f36945k4 = 0;
        this.f36946x1 = (short) 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m50690k4() {
        return this.f36945k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m50694kk() {
        return 4;
    }

    public String toString() {
        return C14113y2.m67402k4("[ Scheme: {0} / StartNum: {1} ]", AbstractC14106wy.getName(C7019kk.m27443k4((Class<?>) C10455gr.class), Integer.valueOf(this.f36945k4)), Short.valueOf(this.f36946x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final short m50695x1() {
        return this.f36946x1;
    }

    public C10405dn(byte b, short s) {
        this.f36945k4 = b == -1 ? (byte) 0 : b;
        this.f36946x1 = s <= 0 ? (short) 1 : s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50691k4(C3134k4 c3134k4) {
        this.f36945k4 = c3134k4.m13381rv();
        this.f36946x1 = c3134k4.m13381rv();
    }

    public C10405dn(int i, short s) {
        this.f36945k4 = i;
        this.f36946x1 = s <= 0 ? (short) 1 : s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50692k4(C3149x1 c3149x1) {
        c3149x1.m13448k4((short) this.f36945k4);
        c3149x1.m13448k4(this.f36946x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m50693k4(C10405dn c10405dn) {
        return this.f36945k4 == c10405dn.f36945k4 && this.f36946x1 == c10405dn.f36946x1;
    }
}
