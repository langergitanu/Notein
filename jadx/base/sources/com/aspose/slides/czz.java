package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p159h0.C4441dy;
import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.internal.p159h0.C4473um;
import com.aspose.slides.internal.p159h0.C4476v4;
import com.aspose.slides.internal.p159h0.C4479w6;
import com.aspose.slides.internal.p159h0.C4489zj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class czz extends AbstractC14780xb {

    /* JADX INFO: renamed from: kk */
    private static final C4459os f4514kk = new C4459os(1.0f, 1.0f);

    /* JADX INFO: renamed from: to */
    private static final C4459os f4515to = new C4459os(8.0f, 8.0f);

    public czz(float f) {
        super(f, 100.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m4889k4(TextFrame textFrame) {
        if (textFrame == null) {
            return false;
        }
        IGenericEnumerator<IParagraph> it = textFrame.getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<IPortion> it2 = it.next().getPortions().iterator();
                while (it2.hasNext()) {
                    try {
                        if (!it2.next().getPortionFormat().getEffective().getEffectFormat().isNoEffects()) {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            return true;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return false;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m4890kk(TextFrame textFrame) {
        return textFrame.m2908jd().getKeepTextFlat();
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m4891x1(TextFrame textFrame) {
        a1f a1fVarM4291k4 = bp9.m4291k4(textFrame);
        return (a1fVarM4291k4 == null || a1fVarM4291k4.m3161m9() == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4892k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, GeometryShape geometryShape, TextFrame textFrame) {
        boolean z;
        C12007ix c12007ix;
        float f;
        C11896dy[] c11896dyArr;
        int i;
        List list;
        azo azoVar;
        C4459os c4459os;
        C4459os c4459os2;
        if (C14113y2.m67411k4(textFrame.m2901c5())) {
            return false;
        }
        C14562th c14562thM71269k4 = C14570tp.m71269k4(geometryShape);
        C14562th c14562thM71271k4 = C14570tp.m71271k4(textFrame);
        if (c14562thM71271k4 == null && c14562thM71269k4 == null) {
            return false;
        }
        a1f a1fVarM4288k4 = bp9.m4288k4(geometryShape);
        a1f a1fVarM4291k4 = bp9.m4291k4(textFrame);
        if (a1fVarM4291k4 != null) {
            float width = geometryShape.getWidth();
            C4459os c4459os3 = f4515to;
            if (width >= c4459os3.m18285k4() || geometryShape.getHeight() >= c4459os3.m18290x1()) {
                if (a1fVarM4291k4.m3161m9() != null) {
                    double width2 = a1fVarM4291k4.m3161m9().getWidth();
                    C4459os c4459os4 = f4514kk;
                    if (width2 <= c4459os4.m18285k4() || a1fVarM4291k4.m3161m9().getHeight() <= c4459os4.m18290x1()) {
                        a1fVarM4291k4.m3155k4((IShapeBevel) null);
                    }
                }
                if (a1fVarM4291k4.m3149dy() != null) {
                    double width3 = a1fVarM4291k4.m3149dy().getWidth();
                    C4459os c4459os5 = f4514kk;
                    if (width3 <= c4459os5.m18285k4() || a1fVarM4291k4.m3149dy().getHeight() <= c4459os5.m18290x1()) {
                    }
                }
                z = a1fVarM4291k4.m3161m9() != null;
            } else {
                a1fVarM4291k4.m3155k4((IShapeBevel) null);
            }
            a1fVarM4291k4.m3166x1((IShapeBevel) null);
            if (a1fVarM4291k4.m3161m9() != null) {
            }
        }
        float[] fArrM71273k4 = c14562thM71269k4 != null ? C14570tp.m71273k4(c14562thM71269k4.m71169kk(), c14562thM71269k4.m71168k4(), c14562thM71269k4.m71170x1(), z) : C14570tp.m71273k4(c14562thM71271k4.m71169kk(), c14562thM71271k4.m71168k4(), c14562thM71271k4.m71170x1(), z);
        if (fArrM71273k4 == null) {
            return false;
        }
        float fM3152k4 = a1fVarM4291k4 != null ? a1fVarM4291k4.m3152k4() : 0.0f;
        float fM3163x1 = (a1fVarM4288k4 == null || c14562thM71269k4 == null) ? 0.0f : a1fVarM4288k4.m3163x1() + fM3152k4;
        C14093tq<C12003du> c14093tqClone = (a1fVarM4291k4 != null ? a1fVarM4291k4.m3158kk() : new C14093tq<>()).Clone();
        int iM73277k4 = AbstractC14780xb.m73277k4(a1fVarM4291k4, false);
        boolean z2 = C14093tq.m67296x1(c14093tqClone, null) && (iM73277k4 == 2 || iM73277k4 == 3);
        C4473um c4473umClone = ck8.m4611x1(fArrM71273k4).Clone();
        C12007ix c12007ix2 = new C12007ix();
        ShapeFrame[] shapeFrameArr = {null};
        C12007ix[] c12007ixArr = {c12007ix2};
        jq6.m63490k4(textFrame.f3523to, shapeFrameArr, c12007ixArr, (kg7) null);
        ShapeFrame shapeFrame = shapeFrameArr[0];
        c12007ixArr[0].CloneTo(c12007ix2);
        C4317dy c4317dyM63485k4 = jq6.m63485k4(textFrame.f3523to, kg7Var);
        C12007ix c12007ix3 = new C12007ix();
        List[] listArr = {null};
        C12007ix[] c12007ixArr2 = {c12007ix3};
        int i2 = 0;
        float f2 = fM3152k4;
        C11896dy[] c11896dyArrM6172k4 = C1099fg.m6172k4(abstractC14897zn, kg7Var, geometryShape, textFrame, shapeFrame, c4317dyM63485k4, listArr, c12007ixArr2);
        List list2 = listArr[0];
        c12007ixArr2[0].CloneTo(c12007ix3);
        if (c11896dyArrM6172k4 == null || c11896dyArrM6172k4.length == 0) {
            return false;
        }
        C4459os c4459os6 = new C4459os();
        C12007ix c12007ix4 = new C12007ix();
        if (textFrame.m2926m9()) {
            (c14562thM71269k4 == null ? new C4459os(C22205OooOOo.OooO00o(c12007ix3, 2.0f, c12007ix3.m56557jd()), C22203OooOO0o.OooO0O0(c12007ix3, 2.0f, c12007ix3.m56551ck())) : new C4459os((geometryShape.getWidth() / 2.0f) + geometryShape.getX(), (geometryShape.getHeight() / 2.0f) + geometryShape.getY())).CloneTo(c4459os6);
            c12007ix3.CloneTo(c12007ix4);
        } else {
            InterfaceC13762l4 interfaceC13762l4 = textFrame.f3523to;
            oju ojuVarClone = interfaceC13762l4.mo64300x1().Clone();
            pj5 pj5VarClone = textFrame.m2903du().Clone();
            C4459os c4459os7 = new C4459os(geometryShape.getX() + pj5VarClone.f48081x1 + ojuVarClone.f47836k4, geometryShape.getY() + pj5VarClone.f48079kk + ojuVarClone.f47837x1);
            C4459os c4459os8 = new C4459os(interfaceC13762l4.mo64296kk().f47836k4, jq6.m63493kk(interfaceC13762l4));
            if (c14562thM71269k4 == null) {
                c4459os = c4459os8;
                c4459os2 = new C4459os((c4459os8.m18285k4() / 2.0f) + c4459os7.m18285k4(), (c4459os8.m18290x1() / 2.0f) + c4459os7.m18290x1());
            } else {
                c4459os = c4459os8;
                c4459os2 = new C4459os((geometryShape.getWidth() / 2.0f) + geometryShape.getX(), (geometryShape.getHeight() / 2.0f) + geometryShape.getY());
            }
            c4459os2.CloneTo(c4459os6);
            c12007ix4 = new C12007ix(c4459os7.m18285k4(), c4459os7.m18290x1(), c4459os.m18285k4(), c4459os.m18290x1());
        }
        if (m73299x1()) {
            c4459os6 = new C4459os(geometryShape.getParentGroup().getFrame().getCenterX(), geometryShape.getParentGroup().getFrame().getCenterY());
        }
        C4459os c4459os9 = c4459os6;
        C4489zj c4489zj = new C4489zj(c12007ix3.m56550c5() / 2.0f, c12007ix3.m56575x1() / 2.0f, f2);
        C14093tq<C12003du> c14093tqClone2 = (a1fVarM4291k4 != null ? a1fVarM4291k4.m3148du() : new C14093tq<>()).Clone();
        float fM3162to = a1fVarM4291k4 != null ? a1fVarM4291k4.m3162to() : 0.0f;
        boolean z3 = c14093tqClone2.m67302x1() && fM3162to > 0.0f;
        List<tfm> list3 = new List<>();
        int i3 = 0;
        int i4 = 0;
        while (i3 < c11896dyArrM6172k4.length) {
            C11896dy c11896dy = c11896dyArrM6172k4[i3];
            qy7 qy7Var = (qy7) list2.get_Item(i3);
            if (c11896dy.m55525du() == 0) {
                c12007ix = c12007ix4;
                f = fM3162to;
                c11896dyArr = c11896dyArrM6172k4;
            } else {
                tfm tfmVar = new tfm();
                tfmVar.m71141kk(iM73277k4);
                c12007ix = c12007ix4;
                f = fM3162to;
                if (C7019kk.m27469x1(qy7Var.m69907kk(), C14478sy.class)) {
                    c11896dyArr = c11896dyArrM6172k4;
                    ((C14478sy) C7019kk.m27452k4((Object) qy7Var.m69907kk(), C14478sy.class)).m71129kk(c12007ix.Clone());
                } else {
                    c11896dyArr = c11896dyArrM6172k4;
                }
                if (C7019kk.m27469x1(qy7Var.m69917to().f4054h4, C14478sy.class)) {
                    ((C14478sy) C7019kk.m27452k4((Object) qy7Var.m69917to().f4054h4, C14478sy.class)).m71129kk(c12007ix.Clone());
                }
                C0962es c0962esM69907kk = qy7Var.m69907kk();
                if (c0962esM69907kk != null && c0962esM69907kk.m5681to() != 0 && c0962esM69907kk.m5681to() != -1) {
                    if (qy7Var.m69917to() == null || !qy7Var.m69917to().m3903h4()) {
                        azoVar = null;
                    } else {
                        azo azoVarCloneT = qy7Var.m69917to().cloneT();
                        azoVarCloneT.m3909k4(((double) (qy7Var.m69909ks() / 96.0f)) * azoVarCloneT.m3906k4());
                        azoVar = azoVarCloneT;
                    }
                    tfmVar.m71139k4(c0962esM69907kk.m5681to() != 1 ? AbstractC14780xb.m73283k4(abstractC14897zn, c11896dy, c0962esM69907kk, azoVar, (C11913yj) null, (azo) null, this.f50033k4) : AbstractC14780xb.m73281k4(c0962esM69907kk.m5676k4().Clone()));
                    if (z3) {
                        tfmVar.m71147x1(tfmVar.m71132du());
                        tfmVar.m71139k4(AbstractC14780xb.m73283k4(abstractC14897zn, c11896dy, c0962esM69907kk, (azo) null, (C11913yj) null, new azo(c14093tqClone2.m67297k4().Clone(), (qy7Var.m69909ks() / 48.0f) * f), this.f50033k4));
                    }
                }
                C14093tq c14093tq = null;
                if (!z3) {
                    tfmVar.m71147x1(C14093tq.m67296x1(c14093tqClone, null) ? AbstractC14780xb.m73281k4(c14093tqClone.m67297k4().Clone()) : tfmVar.m71132du());
                    c14093tq = null;
                }
                if (C14093tq.m67295k4(c14093tqClone, c14093tq)) {
                    azo azoVarM69917to = qy7Var.m69917to();
                    if (azoVarM69917to != null && azoVarM69917to.m3903h4() && azoVarM69917to.m3901dy() != null && azoVarM69917to.m3901dy().m5681to() != 0 && azoVarM69917to.m3901dy().m5681to() != -1) {
                        azoVarM69917to.m3916m9().Clone();
                        tfmVar.m71147x1(azoVarM69917to.m3901dy().m5681to() != 1 ? AbstractC14780xb.m73283k4(abstractC14897zn, c11896dy, azoVarM69917to.m3901dy(), (azo) null, (C11913yj) null, (azo) null, this.f50033k4) : AbstractC14780xb.m73281k4(azoVarM69917to.m3916m9().Clone()));
                    }
                    if (tfmVar.m71132du() == null) {
                        tfmVar.m71139k4(tfmVar.m71134h4());
                    }
                }
                if (tfmVar.m71132du() != null || tfmVar.m71134h4() != null) {
                    C4441dy c4441dyM74347k4 = ((float) ((qy7) list2.get_Item(i3)).m69909ks()) >= 40.0f ? C14877z9.m74347k4(a1fVarM4291k4) : null;
                    int i5 = c4441dyM74347k4 != null ? 1 : i2;
                    tfmVar.m71136k4(6);
                    tfmVar.m71146x1(i2);
                    tfmVar.m71138k4(new C4476v4(c11896dy, fM3163x1, f2, tfmVar.m71135k4(), tfmVar.m71145x1(), c4441dyM74347k4, z2, false, new C14093tq(c4459os9.Clone())));
                    list3.addItem(tfmVar);
                    C4489zj c4489zj2 = new C4489zj();
                    C4489zj c4489zj3 = new C4489zj();
                    i = i3;
                    C4489zj[] c4489zjArr = {c4489zj2};
                    list = list2;
                    C4489zj[] c4489zjArr2 = {c4489zj3};
                    tfmVar.m71143m9().m18396k4(c4473umClone.Clone(), c4489zjArr, c4489zjArr2);
                    c4489zjArr[0].CloneTo(c4489zj2);
                    c4489zjArr2[0].CloneTo(c4489zj3);
                    c4489zj.m18507k4(C4479w6.m18405k4(c4489zj.m18506k4(), C14116yg.m67480k4(c4489zj2.m18506k4()), C14116yg.m67480k4(c4489zj3.m18506k4())));
                    c4489zj.m18512x1(C4479w6.m18405k4(c4489zj.m18511x1(), C14116yg.m67480k4(c4489zj2.m18511x1()), C14116yg.m67480k4(c4489zj3.m18511x1())));
                    c4489zj.m18509kk(C4479w6.m18405k4(c4489zj.m18508kk(), C14116yg.m67480k4(c4489zj2.m18508kk()), C14116yg.m67480k4(c4489zj3.m18508kk())));
                    i4 = i5;
                }
                i3 = i + 1;
                list2 = list;
                c12007ix4 = c12007ix;
                fM3162to = f;
                c11896dyArrM6172k4 = c11896dyArr;
                i2 = 0;
            }
            i = i3;
            list = list2;
            i3 = i + 1;
            list2 = list;
            c12007ix4 = c12007ix;
            fM3162to = f;
            c11896dyArrM6172k4 = c11896dyArr;
            i2 = 0;
        }
        if (m4889k4(textFrame)) {
            C12007ix c12007ix5 = new C12007ix();
            C1099fg c1099fg = new C1099fg(null);
            try {
                C12007ix[] c12007ixArr3 = {c12007ix5};
                C12009k4 c12009k4M6174k4 = c1099fg.m6174k4(kg7Var, geometryShape, textFrame, c12007ixArr3, true);
                c12007ixArr3[0].CloneTo(c12007ix5);
                C4459os c4459osClone = (c14562thM71269k4 == null ? new C4459os(C22205OooOOo.OooO00o(c12007ix5, 2.0f, c12007ix5.m56557jd()), C22203OooOO0o.OooO0O0(c12007ix5, 2.0f, c12007ix5.m56551ck())) : new C4459os((geometryShape.getWidth() / 2.0f) + geometryShape.getX(), (geometryShape.getHeight() / 2.0f) + geometryShape.getY())).Clone();
                tfm tfmVar2 = new tfm();
                tfmVar2.m71141kk(0);
                tfmVar2.m71139k4(c12009k4M6174k4);
                tfmVar2.m71147x1(c12009k4M6174k4);
                C4317dy c4317dy = new C4317dy();
                float fM3152k42 = fM3163x1 - a1fVarM4291k4.m3152k4();
                if (a1fVarM4291k4.m3161m9() != null) {
                    fM3152k42 -= (float) a1fVarM4291k4.m3161m9().getHeight();
                }
                tfmVar2.m71138k4(m73288k4(c4459osClone.Clone(), fM3152k42, c12007ix5.Clone(), false, this.f50035x1, c4317dy));
                C4489zj c4489zj4 = new C4489zj();
                C4489zj c4489zj5 = new C4489zj();
                C4489zj[] c4489zjArr3 = {c4489zj4};
                C4489zj[] c4489zjArr4 = {c4489zj5};
                tfmVar2.m71143m9().m18396k4(c4473umClone.Clone(), c4489zjArr3, c4489zjArr4);
                c4489zjArr3[0].CloneTo(c4489zj4);
                c4489zjArr4[0].CloneTo(c4489zj5);
                c4489zj.m18507k4(C4479w6.m18405k4(c4489zj.m18506k4(), C14116yg.m67480k4(c4489zj4.m18506k4()), C14116yg.m67480k4(c4489zj5.m18506k4())));
                c4489zj.m18512x1(C4479w6.m18405k4(c4489zj.m18511x1(), C14116yg.m67480k4(c4489zj4.m18511x1()), C14116yg.m67480k4(c4489zj5.m18511x1())));
                c4489zj.m18509kk(C4479w6.m18405k4(c4489zj.m18508kk(), C14116yg.m67480k4(c4489zj4.m18508kk()), C14116yg.m67480k4(c4489zj5.m18508kk())));
                list3.addItem(tfmVar2);
            } finally {
                c1099fg.dispose();
            }
        }
        if (list3.size() == 0) {
            return true;
        }
        if (a1fVarM4291k4 != null) {
            a1fVarM4288k4 = a1fVarM4291k4;
        }
        m73293k4(abstractC14897zn, geometryShape, list3, c4473umClone.Clone(), c4459os9.Clone(), c4489zj.Clone(), iM73277k4, fArrM71273k4, txr.m71437k4(a1fVarM4288k4, i4));
        m73292k4(list3);
        return true;
    }
}
