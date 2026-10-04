package com.aspose.slides.internal.p202jd;

import com.aspose.slides.OooO0OO;
import com.aspose.slides.internal.p126fa.AbstractC3905m9;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.internal.p447up.C11528c5;
import com.aspose.slides.internal.p447up.C11537ks;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.sq */
/* JADX INFO: loaded from: classes.dex */
public class C5371sq extends AbstractC3905m9 {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14353k4;

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f14354x1;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14353k4 = c11068dy;
        c11068dy.m53499k4("normal", C5813x1.k4.f16504wy);
        c11068dy.m53499k4("stylistic", C5813x1.k4.f16147k5);
        c11068dy.m53499k4("historical-forms", C5813x1.k4.f15946d3);
        c11068dy.m53499k4("styleset", C5813x1.k4.f15999ew);
        c11068dy.m53499k4("character-variant", C5813x1.k4.f15900b5);
        c11068dy.m53499k4("swash", C5813x1.k4.f16342r7);
        c11068dy.m53499k4("ornaments", C5813x1.k4.f16244nk);
        c11068dy.m53499k4("annotation", C5813x1.k4.f16229n3);
        f14354x1 = new C7017h4("stylistic", "styleset");
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15596du() {
        return f14353k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        if (interfaceC9933up.mo48850k4() == 41) {
            String strM67361du = C14113y2.m67361du(interfaceC9933up.mo48821m9());
            String strOooO00o = OooO0OO.OooO00o(1, 0, strM67361du, strM67361du);
            int iM27428k4 = f14354x1.m27428k4(strOooO00o);
            if (iM27428k4 == 0) {
                InterfaceC9933up interfaceC9933upMo48820dy = interfaceC9933up.mo48820dy();
                if (interfaceC9933upMo48820dy != null) {
                    return new C11528c5(strOooO00o, C11537ks.m54523kk(interfaceC9933upMo48820dy.mo48784c5()));
                }
                throw m15604kk(strOooO00o);
            }
            if (iM27428k4 == 1) {
                InterfaceC9933up interfaceC9933upMo48820dy2 = interfaceC9933up.mo48820dy();
                if (interfaceC9933upMo48820dy2 != null) {
                    return new C11528c5(strOooO00o, C11537ks.m54523kk(interfaceC9933upMo48820dy2.mo48784c5()));
                }
                throw m15604kk(strOooO00o);
            }
        }
        return super.mo15578k4(interfaceC9933up, c6344m9);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f16504wy;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 126;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "font-variant-alternates";
    }
}
