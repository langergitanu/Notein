package com.aspose.slides.internal.p200j6;

import com.aspose.slides.internal.p329p4.C7181du;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p348q1.C9612x1;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.j6.ks */
/* JADX INFO: loaded from: classes.dex */
public class C5207ks extends AbstractC5200du {

    /* JADX INFO: renamed from: k4 */
    private C7186k4 f14215k4;

    /* JADX INFO: renamed from: kk */
    private C5210to f14216kk;

    /* JADX INFO: renamed from: x1 */
    private C7187kk f14217x1;

    public C5207ks() {
        this.f14215k4 = new C7186k4();
        this.f14217x1 = new C7187kk();
        this.f14215k4.m27783k4(C7182dy.f19404eg);
        this.f14215k4.m27783k4(this.f14217x1);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m22217k4() {
        return "Lab";
    }

    /* JADX INFO: renamed from: m9 */
    private C7186k4 m22218m9() {
        C7186k4 c7186k4 = new C7186k4();
        c7186k4.m27783k4(new C7181du(-100.0f));
        c7186k4.m27783k4(new C7181du(100.0f));
        c7186k4.m27783k4(new C7181du(-100.0f));
        c7186k4.m27783k4(new C7181du(100.0f));
        return c7186k4;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: du */
    public int mo8467du() {
        return 3;
    }

    /* JADX INFO: renamed from: h4 */
    public final C9612x1 m22219h4() {
        C7186k4 c7186k4M27793dy = this.f14217x1.m27793dy(C7182dy.f19582pq);
        if (c7186k4M27793dy == null) {
            c7186k4M27793dy = m22218m9();
        }
        return new C9612x1(c7186k4M27793dy, 1);
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: kk */
    public C5210to mo8469kk() {
        if (this.f14216kk == null) {
            this.f14216kk = new C5210to(new float[]{0.0f, C14116yg.m67481k4(0.0f, m22220x1().m46940k4()), C14116yg.m67481k4(0.0f, m22219h4().m46940k4())}, this);
        }
        return this.f14216kk;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: to */
    public String mo8470to() {
        return m22217k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final C9612x1 m22220x1() {
        C7186k4 c7186k4M27793dy = this.f14217x1.m27793dy(C7182dy.f19582pq);
        if (c7186k4M27793dy == null) {
            c7186k4M27793dy = m22218m9();
        }
        return new C9612x1(c7186k4M27793dy, 0);
    }

    public C5207ks(C7186k4 c7186k4) {
        this.f14215k4 = c7186k4;
        this.f14217x1 = (C7187kk) c7186k4.m27787x1(1);
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: k4 */
    public float[] mo8468k4(float[] fArr) {
        return fArr;
    }
}
