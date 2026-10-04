package com.aspose.slides.internal.p166hg;

import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p174hz.C4701bs;
import com.aspose.slides.internal.p419tg.C10940kk;
import com.aspose.slides.internal.p525yi.C12824h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.kp */
/* JADX INFO: loaded from: classes.dex */
public class C4547kp {

    /* JADX INFO: renamed from: du */
    private String[] f12683du;

    /* JADX INFO: renamed from: dy */
    private int[] f12684dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f12685h4;

    /* JADX INFO: renamed from: k4 */
    private C10940kk f12686k4;

    /* JADX INFO: renamed from: kk */
    private C4701bs f12687kk = new C4701bs();

    /* JADX INFO: renamed from: m9 */
    private boolean f12688m9;

    /* JADX INFO: renamed from: to */
    private byte[] f12689to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC4751tq f12690x1;

    /* JADX INFO: renamed from: du */
    public boolean m18764du() {
        return this.f12688m9;
    }

    /* JADX INFO: renamed from: h4 */
    public void m18765h4() {
        C10940kk c10940kk = this.f12686k4;
        if (c10940kk == null || c10940kk.size() == 0) {
            this.f12690x1 = null;
            return;
        }
        C12824h4 c12824h4 = new C12824h4(this.f12686k4.get_Item(0).m52826dy().mo19591k4());
        this.f12690x1 = c12824h4;
        c12824h4.mo19639k4(this.f12686k4.get_Item(0).m52826dy().mo19642x1(false).Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public void m18766k4(C4701bs c4701bs) {
        c4701bs.CloneTo(this.f12687kk);
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC4751tq m18773kk() {
        return this.f12690x1;
    }

    /* JADX INFO: renamed from: to */
    public C4701bs m18774to() {
        return this.f12687kk;
    }

    /* JADX INFO: renamed from: x1 */
    public C10940kk m18775x1() {
        return this.f12686k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m18767k4(C10940kk c10940kk) {
        this.f12686k4 = c10940kk;
    }

    /* JADX INFO: renamed from: x1 */
    public void m18776x1(boolean z) {
        this.f12688m9 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public void m18768k4(boolean z) {
        this.f12685h4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public void m18769k4(byte[] bArr) {
        this.f12689to = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public void m18770k4(int[] iArr) {
        this.f12684dy = iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public void m18771k4(String[] strArr) {
        this.f12683du = strArr;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m18772k4() {
        return this.f12685h4;
    }
}
