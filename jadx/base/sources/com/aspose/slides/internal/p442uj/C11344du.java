package com.aspose.slides.internal.p442uj;

import com.aspose.slides.internal.p019ac.C1354um;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p100e4.C3558bv;
import com.aspose.slides.internal.p183ij.C4976du;
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

/* JADX INFO: renamed from: com.aspose.slides.internal.uj.du */
/* JADX INFO: loaded from: classes4.dex */
public class C11344du extends AbstractC12603k4 {
    @Override // com.aspose.slides.internal.p509xs.AbstractC12603k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo54490k4(C5061vw[] c5061vwArr, AbstractC3150x6 abstractC3150x6) {
        long position = abstractC3150x6.getPosition() - 8;
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        C4976du c4976du = new C4976du(c5061vwArr[0]);
        c4976du.m20966k4((C12521uz) C25068OooO00o.OooO00o(c3134k4));
        c4976du.m20961k4(c3134k4.m13386x6());
        c4976du.m20979x1(c3134k4.m13386x6());
        c4976du.m20969kk(c3134k4.m13386x6());
        c4976du.m20975to(c3134k4.m13386x6());
        long[] jArr = {0};
        boolean zM14471k4 = C3558bv.m14471k4(jArr, c3134k4.m13384uz());
        long j = jArr[0];
        if (!zM14471k4) {
            C6005k4.m24263kk("Invalid RasterOperation value for EmfBitBlt");
            return false;
        }
        c4976du.m20962k4(j);
        c4976du.m20952du(c3134k4.m13386x6());
        c4976du.m20957h4(c3134k4.m13386x6());
        c4976du.m20963k4((C1354um) new C5493uz().m22583k4(c3134k4));
        c4976du.m20965k4((C12505dy) new C7102du().m27622k4(c3134k4));
        c4976du.m20980x1(c3134k4.m13384uz() & 4294967295L);
        c4976du.m20970kk(c3134k4.m13384uz());
        c4976du.m20976to(c3134k4.m13384uz());
        c4976du.m20953du(c3134k4.m13384uz());
        c4976du.m20958h4(c3134k4.m13384uz());
        c4976du.m20964k4(new C7105h4(position, c4976du.m21560lr(), c4976du.m20955fa(), c4976du.m20977up(), c4976du.m20981yj(), c4976du.m20971ks(), (int) (c4976du.m20951ck() & C18177fb.f54859s)).m27627k4(c3134k4));
        c5061vwArr[0] = c4976du;
        return true;
    }
}
