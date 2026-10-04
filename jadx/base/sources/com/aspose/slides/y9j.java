package com.aspose.slides;

import com.alipay.share.sdk.openapi.algorithm.MD5;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p159h0.C4428ai;
import com.aspose.slides.internal.p159h0.InterfaceC4472u4;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: loaded from: classes3.dex */
class y9j implements InterfaceC4472u4 {

    /* JADX INFO: renamed from: k4 */
    private final C14839k4[] f50300k4;

    /* JADX INFO: renamed from: kk */
    private final float f50301kk;

    /* JADX INFO: renamed from: x1 */
    private final float f50302x1;

    /* JADX INFO: renamed from: com.aspose.slides.y9j$k4 */
    public static final class C14839k4 {

        /* JADX INFO: renamed from: k4 */
        private float f50303k4;

        /* JADX INFO: renamed from: kk */
        private C12003du f50304kk = new C12003du();

        /* JADX INFO: renamed from: to */
        private C4428ai f50305to = new C4428ai();

        /* JADX INFO: renamed from: x1 */
        private float f50306x1;

        public C14839k4(float f, float f2, C12003du c12003du) {
            m73780x1(f);
            m73778kk(f2);
            m73776k4(c12003du.Clone());
            m73775k4(new C4428ai((c12003du.m56505fa() & 255) / 255.0f, (c12003du.m56502ck() & 255) / 255.0f, (c12003du.m56507jd() & 255) / 255.0f, (c12003du.m56501c5() & 255) / 255.0f));
        }

        /* JADX INFO: renamed from: kk */
        private float m73777kk() {
            return this.f50306x1;
        }

        /* JADX INFO: renamed from: x1 */
        private float m73779x1() {
            return this.f50303k4;
        }

        /* JADX INFO: renamed from: k4 */
        public final C4428ai m73781k4() {
            return this.f50305to.Clone();
        }

        /* JADX INFO: renamed from: k4 */
        private void m73775k4(C4428ai c4428ai) {
            this.f50305to = c4428ai.Clone();
        }

        /* JADX INFO: renamed from: kk */
        private void m73778kk(float f) {
            this.f50306x1 = f;
        }

        /* JADX INFO: renamed from: x1 */
        private void m73780x1(float f) {
            this.f50303k4 = f;
        }

        /* JADX INFO: renamed from: k4 */
        private void m73776k4(C12003du c12003du) {
            this.f50304kk = c12003du.Clone();
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m73782k4(float f) {
            return f >= m73779x1() && f < m73777kk();
        }
    }

    public y9j(float f, float f2, int i, float f3, float f4, C12003du[] c12003duArr) {
        this.f50300k4 = m73774k4(f, f2, i, c12003duArr);
        this.f50302x1 = f3;
        this.f50301kk = f4;
    }

    /* JADX INFO: renamed from: k4 */
    private C14839k4 m73772k4(float f, float f2) {
        float f3 = this.f50301kk;
        float fOooO0O0 = OooOO0.OooO0OO.OooO0O0(this.f50302x1, f3, f2, f3);
        for (C14839k4 c14839k4 : this.f50300k4) {
            if (c14839k4.m73782k4(fOooO0O0)) {
                return c14839k4;
            }
        }
        return this.f50300k4[0];
    }

    @Override // com.aspose.slides.internal.p159h0.InterfaceC4472u4
    /* JADX INFO: renamed from: x1 */
    public final void mo18195x1() {
    }

    @Override // com.aspose.slides.internal.p159h0.InterfaceC4472u4
    /* JADX INFO: renamed from: k4 */
    public final void mo18192k4() {
    }

    @Override // com.aspose.slides.internal.p159h0.InterfaceC4472u4
    /* JADX INFO: renamed from: k4 */
    public final void mo18193k4(float f) {
    }

    @Override // com.aspose.slides.internal.p159h0.InterfaceC4472u4
    /* JADX INFO: renamed from: k4 */
    public final void mo18194k4(float f, float f2, C4428ai[] c4428aiArr) {
        m73772k4(f, f2).m73781k4().CloneTo(c4428aiArr[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du[] m73773k4(Chart chart) {
        if (chart == null) {
            throw new ArgumentNullException("chart");
        }
        if (!C14164n2.m67859x1(chart)) {
            return (C12003du[]) C22200OooO0o0.OooO00o(C12003du.class, 0);
        }
        C12003du[] c12003duArr = (C12003du[]) C22200OooO0o0.OooO00o(C12003du.class, 15);
        chart.m506k4((byte) 4).CloneTo(c12003duArr[0]);
        chart.m506k4((byte) 5).CloneTo(c12003duArr[1]);
        chart.m506k4((byte) 6).CloneTo(c12003duArr[2]);
        chart.m506k4((byte) 7).CloneTo(c12003duArr[3]);
        chart.m506k4((byte) 8).CloneTo(c12003duArr[4]);
        chart.m506k4((byte) 9).CloneTo(c12003duArr[5]);
        ColorFormat colorFormat = new ColorFormat(chart, 4, true);
        colorFormat.getColorTransform().add(16, 0.6f);
        colorFormat.m1084to().CloneTo(c12003duArr[6]);
        colorFormat.setSchemeColor(5);
        colorFormat.m1084to().CloneTo(c12003duArr[7]);
        colorFormat.setSchemeColor(6);
        colorFormat.m1084to().CloneTo(c12003duArr[8]);
        colorFormat.setSchemeColor(7);
        colorFormat.m1084to().CloneTo(c12003duArr[9]);
        colorFormat.setSchemeColor(8);
        colorFormat.m1084to().CloneTo(c12003duArr[10]);
        colorFormat.setSchemeColor(9);
        colorFormat.m1084to().CloneTo(c12003duArr[11]);
        colorFormat.getColorTransform().add(15, 0.2f);
        colorFormat.setSchemeColor(4);
        colorFormat.m1084to().CloneTo(c12003duArr[12]);
        colorFormat.setSchemeColor(5);
        colorFormat.m1084to().CloneTo(c12003duArr[13]);
        colorFormat.setSchemeColor(6);
        colorFormat.m1084to().CloneTo(c12003duArr[14]);
        return c12003duArr;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [byte[], float] */
    /* JADX WARN: Type inference failed for: r5v1, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0, types: [byte[], float] */
    /* JADX WARN: Type inference failed for: r6v1, types: [float, java.lang.String] */
    /* JADX INFO: renamed from: k4 */
    private C14839k4[] m73774k4(float f, float f2, int i, C12003du[] c12003duArr) {
        int i2 = i - 1;
        float f3 = (f - f2) / i2;
        List list = new List();
        int i3 = 0;
        while (i3 < i2) {
            C12003du c12003duClone = c12003duArr[i3].Clone();
            ?? messageDigest = MD5.getMessageDigest(i3);
            i3++;
            list.addItem(new C14839k4(messageDigest, MD5.getMessageDigest(i3), c12003duClone.Clone()));
        }
        return (C14839k4[]) list.toArray(new C14839k4[0]);
    }
}
