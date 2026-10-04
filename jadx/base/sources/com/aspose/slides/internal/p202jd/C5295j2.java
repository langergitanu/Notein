package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3894c5;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p447up.C11537ks;
import com.aspose.slides.internal.p447up.C11544yj;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.penkit.tools.DrawToolFactory;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.j2 */
/* JADX INFO: loaded from: classes.dex */
public class C5295j2 extends AbstractC3894c5 {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3894c5, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        short sMo48850k4 = interfaceC9933up.mo48850k4();
        if (sMo48850k4 == 12) {
            return C5813x1.k4.f16146k4;
        }
        if (sMo48850k4 == 35) {
            String strMo48784c5 = interfaceC9933up.mo48784c5();
            C11537ks c11537ks = C5813x1.k4.f16548yd;
            if (C14113y2.m67432to(strMo48784c5, c11537ks.mo23706x1(), (short) 3)) {
                return c11537ks;
            }
            throw m15601k4(interfaceC9933up.mo48784c5());
        }
        if (sMo48850k4 != 38) {
            throw m15600k4(interfaceC9933up);
        }
        InterfaceC9933up interfaceC9933upMo48820dy = interfaceC9933up.mo48820dy();
        if (interfaceC9933upMo48820dy == null) {
            throw m15604kk(DrawToolFactory.LASSO_TYPE_RECT);
        }
        AbstractC5803to abstractC5803toM22253x1 = m22253x1(interfaceC9933upMo48820dy, c6344m9);
        InterfaceC9933up interfaceC9933upMo48851kk = interfaceC9933upMo48820dy.mo48851kk();
        if (interfaceC9933upMo48851kk == null || interfaceC9933upMo48851kk.mo48850k4() != 0) {
            throw m15604kk(DrawToolFactory.LASSO_TYPE_RECT);
        }
        InterfaceC9933up interfaceC9933upMo48851kk2 = interfaceC9933upMo48851kk.mo48851kk();
        if (interfaceC9933upMo48851kk2 == null) {
            throw m15604kk(DrawToolFactory.LASSO_TYPE_RECT);
        }
        AbstractC5803to abstractC5803toM22253x12 = m22253x1(interfaceC9933upMo48851kk2, c6344m9);
        InterfaceC9933up interfaceC9933upMo48851kk3 = interfaceC9933upMo48851kk2.mo48851kk();
        if (interfaceC9933upMo48851kk3 == null || interfaceC9933upMo48851kk3.mo48850k4() != 0) {
            throw m15604kk(DrawToolFactory.LASSO_TYPE_RECT);
        }
        InterfaceC9933up interfaceC9933upMo48851kk4 = interfaceC9933upMo48851kk3.mo48851kk();
        if (interfaceC9933upMo48851kk4 == null) {
            throw m15604kk(DrawToolFactory.LASSO_TYPE_RECT);
        }
        AbstractC5803to abstractC5803toM22253x13 = m22253x1(interfaceC9933upMo48851kk4, c6344m9);
        InterfaceC9933up interfaceC9933upMo48851kk5 = interfaceC9933upMo48851kk4.mo48851kk();
        if (interfaceC9933upMo48851kk5 == null || interfaceC9933upMo48851kk5.mo48850k4() != 0) {
            throw m15604kk(DrawToolFactory.LASSO_TYPE_RECT);
        }
        InterfaceC9933up interfaceC9933upMo48851kk6 = interfaceC9933upMo48851kk5.mo48851kk();
        if (interfaceC9933upMo48851kk6 == null) {
            throw m15604kk(DrawToolFactory.LASSO_TYPE_RECT);
        }
        AbstractC5803to abstractC5803toM22253x14 = m22253x1(interfaceC9933upMo48851kk6, c6344m9);
        if (interfaceC9933upMo48851kk6.mo48851kk() == null) {
            return new C11544yj(abstractC5803toM22253x1, abstractC5803toM22253x12, abstractC5803toM22253x13, abstractC5803toM22253x14);
        }
        throw m15604kk(DrawToolFactory.LASSO_TYPE_RECT);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f16548yd;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 71;
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC5803to m22253x1(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        if (interfaceC9933up.mo48850k4() != 35) {
            return (AbstractC5803to) super.mo15578k4(interfaceC9933up, c6344m9);
        }
        String strMo48784c5 = interfaceC9933up.mo48784c5();
        C11537ks c11537ks = C5813x1.k4.f16548yd;
        if (C14113y2.m67432to(strMo48784c5, c11537ks.mo23706x1(), (short) 3)) {
            return c11537ks;
        }
        throw m15601k4(interfaceC9933up.mo48784c5());
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "clip";
    }
}
