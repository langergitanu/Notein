package com.aspose.slides.internal.p333p8;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7181du;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.InterfaceC7193yj;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.p8.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C9424dy implements InterfaceC7193yj {

    /* JADX INFO: renamed from: k4 */
    private final C7186k4 f34301k4;

    public C9424dy(float f, float f2) {
        this(0.0f, 0.0f, f, f2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C9424dy m46136k4() {
        return new C9424dy(612.0f, 792.0f);
    }

    @Override // com.aspose.slides.internal.p329p4.InterfaceC7193yj
    /* JADX INFO: renamed from: c5 */
    public final C7185jd mo8461c5() {
        return this.f34301k4;
    }

    /* JADX INFO: renamed from: du */
    public final float m46137du() {
        return ((C7179c5) this.f34301k4.m27785kk(1)).m27753to();
    }

    /* JADX INFO: renamed from: h4 */
    public final float m46138h4() {
        return ((C7179c5) this.f34301k4.m27785kk(2)).m27753to();
    }

    /* JADX INFO: renamed from: kk */
    public final float m46139kk() {
        return m46140m9() - m46137du();
    }

    /* JADX INFO: renamed from: m9 */
    public final float m46140m9() {
        return ((C7179c5) this.f34301k4.m27785kk(3)).m27753to();
    }

    /* JADX INFO: renamed from: to */
    public final float m46141to() {
        return ((C7179c5) this.f34301k4.m27785kk(0)).m27753to();
    }

    /* JADX INFO: renamed from: x1 */
    public final float m46142x1() {
        return m46138h4() - m46141to();
    }

    public C9424dy(float f, float f2, float f3, float f4) {
        C7186k4 c7186k4 = new C7186k4();
        this.f34301k4 = c7186k4;
        c7186k4.m27783k4(new C7181du(f));
        c7186k4.m27783k4(new C7181du(f2));
        c7186k4.m27783k4(new C7181du(f + f3));
        c7186k4.m27783k4(new C7181du(f2 + f4));
    }

    public C9424dy(C7186k4 c7186k4) {
        if (c7186k4.m27778k4() != 4) {
            throw new ArgumentException("Array size is not valid.");
        }
        float[] fArrM27788x1 = c7186k4.m27788x1();
        C7186k4 c7186k42 = new C7186k4();
        this.f34301k4 = c7186k42;
        c7186k42.m27783k4(new C7179c5(C14116yg.m67504x1(fArrM27788x1[0], fArrM27788x1[2])));
        c7186k42.m27783k4(new C7179c5(C14116yg.m67504x1(fArrM27788x1[1], fArrM27788x1[3])));
        c7186k42.m27783k4(new C7179c5(C14116yg.m67481k4(fArrM27788x1[0], fArrM27788x1[2])));
        c7186k42.m27783k4(new C7179c5(C14116yg.m67481k4(fArrM27788x1[1], fArrM27788x1[3])));
    }
}
