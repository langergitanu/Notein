package com.aspose.slides.internal.p489x1;

import com.aspose.slides.internal.p217k4.InterfaceC5591lr;

/* JADX INFO: renamed from: com.aspose.slides.internal.x1.to */
/* JADX INFO: loaded from: classes5.dex */
public class C12365to extends AbstractC12362k4 {

    /* JADX INFO: renamed from: c5 */
    public C12365to f41341c5;

    /* JADX INFO: renamed from: dy */
    protected int f41342dy;

    /* JADX INFO: renamed from: h4 */
    public InterfaceC5591lr f41343h4;

    /* JADX INFO: renamed from: jd */
    public int f41344jd;

    /* JADX INFO: renamed from: m9 */
    protected int f41345m9;

    public C12365to() {
        this.f41345m9 = -1;
        this.f41342dy = -1;
        this.f41344jd = -1;
    }

    @Override // com.aspose.slides.internal.p489x1.AbstractC12362k4, com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: c5 */
    public int mo57917c5() {
        InterfaceC5591lr interfaceC5591lr = this.f41343h4;
        if (interfaceC5591lr != null && interfaceC5591lr.mo22922to() != -1) {
            return this.f41343h4.mo22922to();
        }
        if (mo57925k4() > 0) {
            return mo57926k4(0).mo57917c5();
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: ck */
    public String mo57918ck() {
        InterfaceC5591lr interfaceC5591lr = this.f41343h4;
        if (interfaceC5591lr == null) {
            return null;
        }
        return interfaceC5591lr.mo22924x1();
    }

    @Override // com.aspose.slides.internal.p489x1.AbstractC12362k4, com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: du */
    public int mo57919du() {
        return this.f41344jd;
    }

    @Override // com.aspose.slides.internal.p489x1.AbstractC12362k4, com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: dy */
    public int mo57921dy() {
        InterfaceC5591lr interfaceC5591lr = this.f41343h4;
        if (interfaceC5591lr != null && interfaceC5591lr.mo22919kk() != 0) {
            return this.f41343h4.mo22919kk();
        }
        if (mo57925k4() > 0) {
            return mo57926k4(0).mo57921dy();
        }
        return 0;
    }

    /* JADX INFO: renamed from: fa */
    public InterfaceC5591lr m57939fa() {
        return this.f41343h4;
    }

    @Override // com.aspose.slides.internal.p489x1.AbstractC12362k4, com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: h4 */
    public InterfaceC12359fa mo57922h4() {
        return this.f41341c5;
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: jd */
    public int mo57924jd() {
        InterfaceC5591lr interfaceC5591lr = this.f41343h4;
        if (interfaceC5591lr == null) {
            return 0;
        }
        return interfaceC5591lr.mo22915k4();
    }

    @Override // com.aspose.slides.internal.p489x1.AbstractC12362k4, com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: kk */
    public boolean mo57928kk() {
        return this.f41343h4 == null;
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: ks */
    public int mo57929ks() {
        InterfaceC5591lr interfaceC5591lr;
        int i = this.f41342dy;
        return (i != -1 || (interfaceC5591lr = this.f41343h4) == null) ? i : interfaceC5591lr.mo22914h4();
    }

    @Override // com.aspose.slides.internal.p489x1.AbstractC12362k4, com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: to */
    public void mo57931to(int i) {
        this.f41344jd = i;
    }

    @Override // com.aspose.slides.internal.p489x1.AbstractC12362k4
    public String toString() {
        if (mo57928kk()) {
            return "nil";
        }
        if (mo57924jd() == 0) {
            return "<errornode>";
        }
        InterfaceC5591lr interfaceC5591lr = this.f41343h4;
        if (interfaceC5591lr == null) {
            return null;
        }
        return interfaceC5591lr.mo22924x1();
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: up */
    public InterfaceC12359fa mo57932up() {
        return new C12365to(this);
    }

    @Override // com.aspose.slides.internal.p489x1.AbstractC12362k4, com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: x1 */
    public void mo57934x1(InterfaceC12359fa interfaceC12359fa) {
        this.f41341c5 = (C12365to) interfaceC12359fa;
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: yj */
    public int mo57935yj() {
        InterfaceC5591lr interfaceC5591lr;
        int i = this.f41345m9;
        return (i != -1 || (interfaceC5591lr = this.f41343h4) == null) ? i : interfaceC5591lr.mo22914h4();
    }

    public C12365to(InterfaceC5591lr interfaceC5591lr) {
        this.f41345m9 = -1;
        this.f41342dy = -1;
        this.f41344jd = -1;
        this.f41343h4 = interfaceC5591lr;
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: du */
    public void mo57920du(int i) {
        this.f41345m9 = i;
    }

    @Override // com.aspose.slides.internal.p489x1.InterfaceC12359fa
    /* JADX INFO: renamed from: h4 */
    public void mo57923h4(int i) {
        this.f41342dy = i;
    }

    public C12365to(C12365to c12365to) {
        super(c12365to);
        this.f41345m9 = -1;
        this.f41342dy = -1;
        this.f41344jd = -1;
        this.f41343h4 = c12365to.f41343h4;
        this.f41345m9 = c12365to.f41345m9;
        this.f41342dy = c12365to.f41342dy;
    }
}
