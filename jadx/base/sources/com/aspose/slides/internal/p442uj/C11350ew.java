package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p019ac.C1354um;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3558bv;
import com.aspose.slides.internal.p183ij.C4968cj;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p206jj.C5493uz;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p319ok.C7102du;
import com.aspose.slides.internal.p319ok.C7105h4;
import com.aspose.slides.internal.p498xe.C12505dy;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.internal.p509xs.AbstractC12603k4;
import com.huawei.hms.network.embedded.C18177fb;
import o00OoOo.C25068OooO00o;

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.ew */
/* JADX INFO: loaded from: classes4.dex */
public class C11350ew extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        long position = abstractC3150x6.getPosition() - 8;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C4968cj c4968cj = new C4968cj(c5061vwArr[0]);
        c4968cj.m20872k4((C12521uz) C25068OooO00o.OooO00o(c3134k4));
        c4968cj.m20867k4(c3134k4.m13386x6());
        c4968cj.m20887x1(c3134k4.m13386x6());
        c4968cj.m20875kk(c3134k4.m13386x6());
        c4968cj.m20883to(c3134k4.m13386x6());
        long[] jArr = {0};
        boolean zM14471k4 = C3558bv.m14471k4(jArr, c3134k4.m13384uz());
        long j = jArr[0];
        if (!zM14471k4) {
            C6005k4.m24263kk("Invalid RasterOperation value for EmfStretchBlt");
            return false;
        }
        c4968cj.m20868k4(j);
        c4968cj.m20857du(c3134k4.m13386x6());
        c4968cj.m20863h4(c3134k4.m13386x6());
        c4968cj.m20869k4((C1354um) new C5493uz().m22583k4(c3134k4));
        c4968cj.m20871k4((C12505dy) new C7102du().m27622k4(c3134k4));
        c4968cj.m20888x1(c3134k4.m13384uz() & 4294967295L);
        c4968cj.m20876kk(c3134k4.m13384uz());
        c4968cj.m20884to(c3134k4.m13384uz());
        c4968cj.m20858du(c3134k4.m13384uz());
        c4968cj.m20864h4(c3134k4.m13384uz());
        c4968cj.m20879m9(c3134k4.m13386x6());
        c4968cj.m20860dy(c3134k4.m13386x6());
        c4968cj.m20870k4(new C7105h4(position, c4968cj.m21560lr(), c4968cj.m20861fa(), c4968cj.m20885up(), c4968cj.m20890yj(), c4968cj.m20877ks(), (int) (c4968cj.m20856ck() & C18177fb.f54859s)).m27627k4(c3134k4));
        c5061vwArr[0] = c4968cj;
        return true;
    }
}
