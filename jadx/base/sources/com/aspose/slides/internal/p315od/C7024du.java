package com.aspose.slides.internal.p315od;

import com.aspose.slides.internal.p340pm.C9466kk;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.od.du */
/* JADX INFO: loaded from: classes4.dex */
public class C7024du {

    /* JADX INFO: renamed from: k4 */
    public float f19088k4;

    /* JADX INFO: renamed from: kk */
    public float f19089kk;

    /* JADX INFO: renamed from: to */
    public float f19090to;

    /* JADX INFO: renamed from: x1 */
    public float f19091x1;

    /* JADX INFO: renamed from: k4 */
    public C9466kk.k4 m27472k4(float f, float f2, float f3, float f4) {
        float f5 = this.f19088k4;
        float f6 = f + f5;
        float f7 = this.f19091x1;
        float f8 = f2 + f7;
        float f9 = this.f19089kk;
        float f10 = f + f9;
        float f11 = this.f19090to;
        float f12 = f2 + f11;
        float f13 = f + f3;
        float f14 = f2 + f4;
        return C9466kk.m46515k4(new C12025x6((f10 + f6) / 2.0f, (f12 + f8) / 2.0f), new C12025x6(((f5 + f13) + (f13 + f9)) / 2.0f, ((f7 + f14) + (f14 + f11)) / 2.0f), new C12025x6(f6, f8));
    }

    /* JADX INFO: renamed from: x1 */
    public void m27475x1() {
        float f = this.f19088k4;
        this.f19088k4 = this.f19089kk;
        this.f19089kk = f;
        float f2 = this.f19091x1;
        this.f19091x1 = this.f19090to;
        this.f19090to = f2;
    }

    /* JADX INFO: renamed from: k4 */
    public void m27473k4() {
        this.f19088k4 = 0.0f;
        this.f19091x1 = 0.0f;
        this.f19089kk = 0.0f;
        this.f19090to = 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public void m27474k4(C7024du c7024du) {
        c7024du.f19088k4 = this.f19088k4;
        c7024du.f19091x1 = this.f19091x1;
        c7024du.f19089kk = this.f19089kk;
        c7024du.f19090to = this.f19090to;
    }
}
