package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.wg */
/* JADX INFO: loaded from: classes3.dex */
public class C2347wg {

    /* JADX INFO: renamed from: k4 */
    private int f8152k4;

    /* JADX INFO: renamed from: kk */
    private C2064eb f8153kk;

    /* JADX INFO: renamed from: x1 */
    private int f8154x1;

    public C2347wg(int i, int i2, C2064eb c2064eb) {
        this(c2064eb);
        this.f8152k4 = i;
        this.f8154x1 = i2;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m11598du() {
        return ((this.f8152k4 & 65535) == 3 && (this.f8154x1 & 65535) == 4) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public int mo10360k4(int i) {
        return 0;
    }

    /* JADX INFO: renamed from: kk */
    public final int m11599kk() {
        return this.f8152k4;
    }

    /* JADX INFO: renamed from: to */
    public final int m11600to() {
        return this.f8154x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C2064eb m11601x1() {
        return this.f8153kk;
    }

    public C2347wg(C2064eb c2064eb) {
        this.f8153kk = c2064eb;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo10525k4(int i, int i2) {
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m11602x1(int i) {
        return ((this.f8152k4 & 65535) == 3 && (this.f8154x1 & 65535) == 4) ? AbstractC6747ar.m26638k4(AbstractC6747ar.m26643rv(), C2266qq.m11310k4("big5"), AbstractC6747ar.m26643rv().m26683x1(new char[]{(char) (i & 65535)})) : C14069jd.m66778k4((short) i);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo10361k4(C2212n9 c2212n9) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo10527k4(byte[][] bArr, long[] jArr) {
        bArr[0] = new byte[0];
        jArr[0] = 0;
    }
}
