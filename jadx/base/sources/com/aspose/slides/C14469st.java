package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.st */
/* JADX INFO: loaded from: classes3.dex */
class C14469st extends otz {

    /* JADX INFO: renamed from: k4 */
    private C0886d8 f48915k4;

    public C14469st(C0886d8 c0886d8) {
        this.f48915k4 = c0886d8;
        m68829k4(c0886d8.m4988jd().getMarker(), this.f48915k4.m5012up());
    }

    @Override // com.aspose.slides.otz
    /* JADX INFO: renamed from: dy */
    public boolean mo6841dy() {
        return ChartTypeCharacterizer.m757du(this.f48915k4.m5012up().m64945h4().getType());
    }

    @Override // com.aspose.slides.otz
    /* JADX INFO: renamed from: k4 */
    public void mo6842k4(C11896dy c11896dy) {
        C0886d8 c0886d8;
        if (mo6841dy()) {
            this.f48915k4.m4998k4(false);
            m68830k4(this.f48915k4.m4987ix(), this.f48915k4.m5012up().m64941c5(), C12003du.f40505to.Clone(), m68828jd(), new C14093tq<>());
            c0886d8 = this.f48915k4;
        } else {
            if (ChartTypeCharacterizer.isChartTypeBubble(this.f48915k4.m5012up().m64945h4().getType())) {
                c11896dy.m55542k4(m68826c5().Clone());
            } else {
                c11896dy.m55578x1(m68826c5().Clone());
            }
            this.f48915k4.m4998k4(false);
            this.f48915k4.m5000kk(c11896dy);
            this.f48915k4.m4992k4(c11896dy);
            c0886d8 = this.f48915k4;
        }
        c0886d8.m4998k4(true);
    }

    @Override // com.aspose.slides.otz
    /* JADX INFO: renamed from: m9 */
    public LineFormat mo6843m9() {
        return this.f48915k4.m4987ix();
    }

    @Override // com.aspose.slides.otz
    /* JADX INFO: renamed from: to */
    public int mo6844to() {
        if (otz.m68825k4(this.f48915k4.m5012up())) {
            return 0;
        }
        return m68827ck() ? 2 : 1;
    }
}
