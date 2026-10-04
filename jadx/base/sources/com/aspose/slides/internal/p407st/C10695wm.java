package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.wm */
/* JADX INFO: loaded from: classes4.dex */
public class C10695wm {

    /* JADX INFO: renamed from: du */
    private long f37472du;

    /* JADX INFO: renamed from: k4 */
    private byte f37473k4;

    /* JADX INFO: renamed from: kk */
    private int f37474kk;

    /* JADX INFO: renamed from: to */
    private int f37475to;

    /* JADX INFO: renamed from: x1 */
    private short f37476x1;

    public C10695wm() {
    }

    /* JADX INFO: renamed from: du */
    public final int m51914du() {
        return this.f37475to;
    }

    /* JADX INFO: renamed from: h4 */
    public final long m51915h4() {
        return this.f37472du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51916k4(byte b) {
        this.f37473k4 = b;
    }

    /* JADX INFO: renamed from: kk */
    public final short m51922kk() {
        return this.f37476x1;
    }

    /* JADX INFO: renamed from: to */
    public final int m51923to() {
        return C3085sv.m13071k4(this.f37474kk);
    }

    public String toString() {
        return C14113y2.m67402k4("RecordHeader, Type:0x{0:X} [{1}], Version:{2}, Instance:{3}, Length:0x{4:X}", Integer.valueOf(this.f37474kk), AbstractC14106wy.getName(C7019kk.m27443k4((Class<?>) C10400dg.class), Integer.valueOf(this.f37474kk)), Byte.valueOf(this.f37473k4), Short.valueOf(this.f37476x1), Integer.valueOf(this.f37475to));
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m51924x1() {
        return this.f37473k4;
    }

    public C10695wm(C3134k4 c3134k4) {
        m51918k4(c3134k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51917k4(int i) {
        this.f37474kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51925x1(int i) {
        this.f37475to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51918k4(C3134k4 c3134k4) {
        this.f37472du = c3134k4.m13371ck().getPosition();
        int iM13386x6 = c3134k4.m13386x6();
        this.f37473k4 = (byte) (iM13386x6 & 15);
        this.f37476x1 = (short) ((65520 & iM13386x6) >> 4);
        this.f37474kk = (int) ((((long) iM13386x6) & 4294901760L) >> 16);
        this.f37475to = (int) c3134k4.m13384uz();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51919k4(C3149x1 c3149x1) {
        c3149x1.m13455x1((this.f37473k4 & 255) | (this.f37476x1 << 4) | ((this.f37474kk & 65535) << 16));
        c3149x1.m13455x1(this.f37475to);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51920k4(short s) {
        this.f37476x1 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m51921k4() {
        return (this.f37473k4 & 255) == 15;
    }
}
