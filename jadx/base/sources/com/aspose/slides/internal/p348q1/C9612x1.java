package com.aspose.slides.internal.p348q1;

import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7181du;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.InterfaceC7193yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.q1.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9612x1 implements InterfaceC7193yj {

    /* JADX INFO: renamed from: k4 */
    private C7186k4 f34768k4;

    /* JADX INFO: renamed from: x1 */
    private int f34769x1;

    public C9612x1() {
        C7186k4 c7186k4 = new C7186k4();
        this.f34768k4 = c7186k4;
        c7186k4.m27783k4(new C7181du(0.0f));
        this.f34768k4.m27783k4(new C7181du(1.0f));
        this.f34769x1 = 0;
    }

    @Override // com.aspose.slides.internal.p329p4.InterfaceC7193yj
    /* JADX INFO: renamed from: c5 */
    public final C7185jd mo8461c5() {
        return this.f34768k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m46940k4() {
        return ((C7179c5) this.f34768k4.m27787x1(this.f34769x1 * 2)).m27753to();
    }

    /* JADX INFO: renamed from: x1 */
    public final float m46941x1() {
        return ((C7179c5) this.f34768k4.m27787x1((this.f34769x1 * 2) + 1)).m27753to();
    }

    public C9612x1(C7186k4 c7186k4, int i) {
        this.f34768k4 = c7186k4;
        this.f34769x1 = i;
    }
}
