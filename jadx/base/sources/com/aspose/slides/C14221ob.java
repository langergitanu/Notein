package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p159h0.C4430ar;
import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.internal.p159h0.C4473um;
import com.aspose.slides.internal.p159h0.C4479w6;
import com.aspose.slides.internal.p159h0.C4489zj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.ob */
/* JADX INFO: loaded from: classes3.dex */
final class C14221ob extends AbstractC14780xb {
    public C14221ob(float f) {
        super(f, 100.0f);
    }

    /* JADX INFO: renamed from: k4 */
    private C12009k4 m68432k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, GeometryShape geometryShape, TextFrame textFrame, C4459os c4459os, C4459os c4459os2, C12007ix[] c12007ixArr) {
        oju ojuVarClone = textFrame.f3523to.mo64296kk().Clone();
        float fM67504x1 = C14116yg.m67504x1(ojuVarClone.f47836k4, ojuVarClone.f47837x1);
        float f = 2.0f * fM67504x1;
        c12007ixArr[0] = new C12007ix(c4459os.m18285k4() - fM67504x1, c4459os.m18290x1() - fM67504x1, c4459os2.m18285k4() + f, c4459os2.m18290x1() + f);
        AbstractC12008jd abstractC12008jdM74608ar = abstractC14897zn.m74608ar();
        C12009k4 c12009k4 = new C12009k4(C7019kk.m27462to(Float.valueOf((c12007ixArr[0].m56550c5() * (abstractC12008jdM74608ar != null ? abstractC12008jdM74608ar.mo17577u4().m55776k4()[0] : 1.0f)) + 0.5f), 13), C7019kk.m27462to(Float.valueOf((c12007ixArr[0].m56575x1() * (abstractC12008jdM74608ar != null ? abstractC12008jdM74608ar.mo17577u4().m55776k4()[3] : 1.0f)) + 0.5f), 13), 2498570);
        c12009k4.m56332k4(96.0f, 96.0f);
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            abstractC12008jdM56582k4.mo17517k4(C12003du.m56458up().Clone());
            abstractC12008jdM56582k4.dispose();
            omq omqVar = new omq(c12009k4, c12007ixArr[0].m56550c5(), c12007ixArr[0].m56575x1());
            try {
                oju ojuVarClone2 = textFrame.f3523to.mo64300x1().Clone();
                omqVar.m74632x1(new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, (-ojuVarClone2.f47836k4) + fM67504x1, (-ojuVarClone2.f47837x1) + fM67504x1));
                textFrame.f3523to.mo64295k4(omqVar, kg7Var);
                return c12009k4;
            } finally {
                omqVar.dispose();
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m68433k4(TextFrame textFrame) {
        a1f a1fVarM4291k4 = bp9.m4291k4(textFrame);
        float fM3152k4 = a1fVarM4291k4 != null ? a1fVarM4291k4.m3152k4() : 0.0f;
        return a1fVarM4291k4 != null ? C14116yg.m67480k4(fM3152k4) < Float.MIN_VALUE && a1fVarM4291k4.m3161m9() == null : C14116yg.m67480k4(fM3152k4) < Float.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX INFO: renamed from: k4 */
    public final boolean m68434k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, GeometryShape geometryShape, TextFrame textFrame) {
        C14221ob c14221ob;
        char c;
        float f;
        ?? r19;
        C4459os c4459os;
        GeometryShape geometryShape2;
        C12009k4 c12009k4M6173k4;
        if (C14113y2.m67411k4(textFrame.m2901c5())) {
            return false;
        }
        C14562th c14562thM71269k4 = C14570tp.m71269k4(geometryShape);
        C14562th c14562thM71271k4 = C14570tp.m71271k4(textFrame);
        if (c14562thM71271k4 == null && c14562thM71269k4 == null) {
            return false;
        }
        float[] fArrM71272k4 = c14562thM71269k4 != null ? C14570tp.m71272k4(c14562thM71269k4.m71169kk(), c14562thM71269k4.m71168k4(), c14562thM71269k4.m71170x1()) : C14570tp.m71272k4(c14562thM71271k4.m71169kk(), c14562thM71271k4.m71168k4(), c14562thM71271k4.m71170x1());
        if (fArrM71272k4 == null) {
            return false;
        }
        a1f a1fVarM4288k4 = bp9.m4288k4(geometryShape);
        float fM3163x1 = (a1fVarM4288k4 == null || c14562thM71269k4 == null) ? 0.0f : a1fVarM4288k4.m3163x1();
        C4473um c4473umClone = ck8.m4611x1(fArrM71272k4).Clone();
        C12007ix c12007ix = new C12007ix();
        C12007ix[] c12007ixArr = {c12007ix};
        jq6.m63490k4(textFrame.f3523to, new ShapeFrame[]{null}, c12007ixArr, kg7Var);
        c12007ixArr[0].CloneTo(c12007ix);
        kg7Var.m63842k4(new C12007ix(0.0f, 0.0f, geometryShape.getWidth(), geometryShape.getHeight()));
        C12007ix c12007ix2 = new C12007ix();
        C4459os c4459os2 = new C4459os();
        if (textFrame.m2926m9()) {
            c14221ob = this;
            c = 0;
            f = 2.0f;
            r19 = 1;
            c4459os = c4459os2;
            C1099fg c1099fg = new C1099fg(null);
            try {
                C12007ix[] c12007ixArr2 = {c12007ix2};
                geometryShape2 = geometryShape;
                c12009k4M6173k4 = c1099fg.m6173k4(kg7Var, geometryShape2, textFrame, c12007ixArr2);
                c12007ixArr2[0].CloneTo(c12007ix2);
                (c14562thM71269k4 == null ? new C4459os(C22205OooOOo.OooO00o(c12007ix2, 2.0f, c12007ix2.m56557jd()), C22203OooOO0o.OooO0O0(c12007ix2, 2.0f, c12007ix2.m56551ck())) : new C4459os((geometryShape2.getWidth() / 2.0f) + geometryShape2.getX(), (geometryShape2.getHeight() / 2.0f) + geometryShape2.getY())).CloneTo(c4459os);
            } finally {
                c1099fg.dispose();
            }
        } else {
            InterfaceC13762l4 interfaceC13762l4 = textFrame.f3523to;
            oju ojuVarClone = interfaceC13762l4.mo64300x1().Clone();
            pj5 pj5VarClone = textFrame.m2903du().Clone();
            c = 0;
            r19 = 1;
            C4459os c4459os3 = new C4459os(c12007ix.m56557jd() + pj5VarClone.f48081x1 + ojuVarClone.f47836k4, c12007ix.m56551ck() + pj5VarClone.f48079kk + ojuVarClone.f47837x1);
            C4459os c4459os4 = new C4459os(interfaceC13762l4.mo64296kk().f47836k4, jq6.m63493kk(interfaceC13762l4));
            (c14562thM71269k4 == null ? new C4459os((c4459os4.m18285k4() / 2.0f) + c4459os3.m18285k4(), (c4459os4.m18290x1() / 2.0f) + c4459os3.m18290x1()) : new C4459os((geometryShape.getWidth() / 2.0f) + geometryShape.getX(), (geometryShape.getHeight() / 2.0f) + geometryShape.getY())).CloneTo(c4459os2);
            C12007ix[] c12007ixArr3 = {c12007ix2};
            c4459os = c4459os2;
            f = 2.0f;
            c12009k4M6173k4 = m68432k4(abstractC14897zn, kg7Var, geometryShape, textFrame, c4459os3.Clone(), c4459os4.Clone(), c12007ixArr3);
            c14221ob = this;
            c12007ixArr3[0].CloneTo(c12007ix2);
            geometryShape2 = geometryShape;
        }
        tfm tfmVar = new tfm();
        tfmVar.m71141kk(1);
        tfmVar.m71139k4(c12009k4M6173k4);
        tfmVar.m71147x1(c12009k4M6173k4);
        if (c14221ob.m73299x1()) {
            c4459os = new C4459os(geometryShape2.getParentGroup().getFrame().getCenterX(), geometryShape2.getParentGroup().getFrame().getCenterY());
        }
        tfmVar.m71138k4(c14221ob.m73287k4(c4459os.Clone(), fM3163x1, c12007ix2.Clone(), true, c14221ob.f50035x1));
        C4489zj c4489zj = new C4489zj(c12007ix2.m56550c5() / f, c12007ix2.m56575x1() / f, 0.0f);
        C4489zj c4489zj2 = new C4489zj();
        C4489zj c4489zj3 = new C4489zj();
        C4489zj[] c4489zjArr = {c4489zj2};
        C4489zj[] c4489zjArr2 = {c4489zj3};
        tfmVar.m71143m9().m18396k4(c4473umClone.Clone(), c4489zjArr, c4489zjArr2);
        c4489zjArr[c].CloneTo(c4489zj2);
        c4489zjArr2[c].CloneTo(c4489zj3);
        float fM18506k4 = c4489zj.m18506k4();
        float fM67480k4 = C14116yg.m67480k4(c4489zj2.m18506k4());
        float fM67480k42 = C14116yg.m67480k4(c4489zj3.m18506k4());
        float[] fArr = new float[2];
        fArr[c] = fM67480k4;
        fArr[r19] = fM67480k42;
        c4489zj.m18507k4(C4479w6.m18405k4(fM18506k4, fArr));
        float fM18511x1 = c4489zj.m18511x1();
        float fM67480k43 = C14116yg.m67480k4(c4489zj2.m18511x1());
        float fM67480k44 = C14116yg.m67480k4(c4489zj3.m18511x1());
        float[] fArr2 = new float[2];
        fArr2[c] = fM67480k43;
        fArr2[r19] = fM67480k44;
        c4489zj.m18512x1(C4479w6.m18405k4(fM18511x1, fArr2));
        List<tfm> list = new List<>();
        list.addItem(tfmVar);
        List<C4430ar> list2 = new List<>();
        list2.addItem(txr.m71438k4());
        m73293k4(abstractC14897zn, geometryShape2, list, c4473umClone.Clone(), c4459os.Clone(), c4489zj.Clone(), 1, fArrM71272k4, list2);
        m73292k4(list);
        return r19;
    }
}
