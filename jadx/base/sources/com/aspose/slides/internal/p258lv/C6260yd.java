package com.aspose.slides.internal.p258lv;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.yd */
/* JADX INFO: loaded from: classes4.dex */
public class C6260yd extends C6257wy {

    /* JADX INFO: renamed from: k4 */
    private long f17759k4;

    public C6260yd(C6258x1 c6258x1) {
        super(c6258x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25413k4() {
        this.f17759k4 = m25384h4().m25292x1().m13442k4().getPosition();
        m25384h4().m25290k4(new byte[6]);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25414k4(int i) {
        int position = (int) ((m25384h4().m25292x1().m13442k4().getPosition() - this.f17759k4) - 6);
        m25384h4().m25292x1().m13441k4((int) this.f17759k4, 0);
        m25384h4().m25283k4(i, position);
        m25384h4().m25292x1().m13441k4(0, 2);
    }
}
