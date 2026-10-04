package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3038bv;
import com.aspose.slides.internal.p077d8.C3041c6;
import com.aspose.slides.internal.p077d8.C3052g8;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3092um;
import com.aspose.slides.internal.p077d8.C3095v4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.qy7;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.aspose.slides.n5 */
/* JADX INFO: loaded from: classes3.dex */
class C14168n5 {

    /* JADX INFO: renamed from: k4 */
    public final BaseSlide f47477k4;

    public C14168n5(BaseSlide baseSlide) {
        if (baseSlide == null) {
            throw new ArgumentNullException("slide");
        }
        this.f47477k4 = baseSlide;
    }

    /* JADX INFO: renamed from: k4 */
    public final Presentation m67872k4() {
        return (Presentation) this.f47477k4.getPresentation();
    }

    /* JADX INFO: renamed from: k4 */
    public final C0962es m67873k4(Background background, ShapeFrame shapeFrame, AbstractC14897zn abstractC14897zn, kg7 kg7Var) {
        if (background == null) {
            return null;
        }
        ajz ajzVar = abstractC14897zn != null ? new ajz(shapeFrame.cloneT(), abstractC14897zn, null, this.f47477k4, 5, kg7Var) : new ajz(shapeFrame.cloneT(), null, null, this.f47477k4, kg7Var);
        C14329q6 c14329q6M337m9 = background.m337m9();
        C0962es c0962esM5664k4 = C0962es.m5664k4(ajzVar, (C14176nc) c14329q6M337m9.getFillFormat());
        if (C7019kk.m27469x1(c0962esM5664k4, C14478sy.class)) {
            ((C14478sy) C7019kk.m27452k4((Object) c0962esM5664k4, C14478sy.class)).m70889k4(c14329q6M337m9.m69429m9());
        }
        return c0962esM5664k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67874k4(AbstractC14897zn abstractC14897zn) {
        Presentation presentationM67872k4 = m67872k4();
        String[][] strArr = {null};
        byte[][] bArr = {null};
        int[] iArrM2334k4 = Presentation.m2334k4((ctm) presentationM67872k4.m2399x6(), bArr);
        byte[] bArr2 = bArr[0];
        strArr[0] = C3038bv.m12798to();
        if (Arrays.equals(iArrM2334k4, r1s.f48531x1) && bArr2 != null && bArr2.length > 0) {
            strArr[0] = C14113y2.m67417k4(Presentation.m2325k4(bArr2), new String[]{IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX, "\r", "\n\r"}, 0);
        }
        int[] iArrM12821x1 = C3052g8.f9069k4;
        if (C3041c6.m12821x1() == C3052g8.f9070x1) {
            try {
                C3041c6.m12809k4().m12825to();
                iArrM12821x1 = C3041c6.m12821x1();
            } catch (IllegalStateException e) {
                int[] iArr = C3052g8.f9069k4;
                C3085sv.m13082k4(e);
                iArrM12821x1 = iArr;
            }
        }
        String[] strArr2 = strArr[0];
        if ((Arrays.equals(C3038bv.m12793k4(), C3095v4.f9211x1) && C3092um.m13135k4() != null && (C3092um.m13135k4() instanceof C3038bv)) || Arrays.equals(iArrM2334k4, r1s.f48530kk) || Arrays.equals(iArrM12821x1, C3052g8.f9070x1)) {
            return;
        }
        qy7.C14366k4 c14366k4 = new qy7.C14366k4();
        c14366k4.f48495k4 = "Arial";
        c14366k4.f48498x1 = 24.0f;
        c14366k4.f48496kk = true;
        m67871k4(abstractC14897zn, presentationM67872k4, strArr2, c14366k4.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m67871k4(AbstractC14897zn abstractC14897zn, Presentation presentation, String[] strArr, qy7.C14366k4 c14366k4) {
        qy7 qy7Var = new qy7(presentation, 72.0f, c14366k4.Clone());
        qy7Var.m69901k4(C12003du.m56398k4(192, 255, 216, 207).Clone());
        qy7Var.m69904k4(true);
        qy7Var.m69902k4(new C14093tq<>(Boolean.TRUE));
        C12015qq[] c12015qqArr = (C12015qq[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12015qq.class), strArr.length));
        float fM56697kk = 0.0f;
        C12025x6 c12025x6 = new C12025x6(0.0f, 0.0f);
        for (int i = 0; i < strArr.length; i++) {
            abstractC14897zn.m74611k4(strArr[i], qy7Var).CloneTo(c12015qqArr[i]);
            fM56697kk += c12015qqArr[i].m56697kk();
        }
        c12025x6.m56898x1((abstractC14897zn.mo67708dy() - fM56697kk) / 2.0f);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            c12025x6.m56891k4((abstractC14897zn.mo67711m9() - c12015qqArr[i2].m56699x1()) / 2.0f);
            abstractC14897zn.mo64343k4(strArr[i2], new C12007ix(c12025x6.Clone(), c12015qqArr[i2].Clone()), qy7Var);
            c12025x6.m56898x1(c12015qqArr[i2].m56697kk() + c12025x6.m56895kk());
        }
    }
}
