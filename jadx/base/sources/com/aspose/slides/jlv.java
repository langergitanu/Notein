package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7379c5;
import com.aspose.slides.internal.p332p7.AbstractC8333ne;
import com.aspose.slides.internal.p332p7.AbstractC8714rv;
import com.aspose.slides.internal.p332p7.AbstractC9290yj;
import com.aspose.slides.internal.p332p7.C7359bx;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7822h5;
import com.aspose.slides.internal.p332p7.C8247m7;
import com.aspose.slides.internal.p332p7.C8299mz;
import com.aspose.slides.internal.p332p7.C8776si;
import com.aspose.slides.internal.p332p7.C9271yc;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class jlv extends ywb {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f45535k4 = new C7017h4("relSizeAnchor", "absSizeAnchor", "sp", "grpSp", "cxnSp", "pic", "graphicFrame");

    public jlv(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63432k4(IChart iChart, bjs bjsVar) {
        ShapeCollection shapeCollection;
        C7394ca c7394caM44916kk;
        float fM67477k4;
        float fM67477k42;
        tbp tbpVar;
        nd1 nd1Var;
        float fM28296k4;
        float fM28298x1;
        int i;
        PictureFrame pictureFrame;
        jlv jlvVar = this;
        jlvVar.mo3469k4(new String[0]);
        while (jlvVar.m55443jd().mo65026h4()) {
            int i2 = 1;
            if (jlvVar.m55443jd().mo65028jd() == 1 && "userShapes".equals(jlvVar.m55443jd().mo65023fa())) {
                C7359bx c7359bx = new C7359bx(jlvVar.m55443jd());
                Chart chart = (Chart) iChart;
                nd1 nd1VarMo1214P_ = chart.mo1214P_();
                tbp tbpVarClone = chart.m2575sv().Clone();
                GroupShape groupShape = (GroupShape) iChart.getUserShapes();
                ShapeCollection shapeCollection2 = (ShapeCollection) groupShape.getShapes();
                List.Enumerator<C7394ca> it = c7359bx.m29210k4().iterator();
                while (it.hasNext()) {
                    try {
                        C7394ca next = it.next();
                        C7017h4 c7017h4 = f45535k4;
                        int iM27428k4 = c7017h4.m27428k4(next.m29539k4());
                        if (iM27428k4 == 0) {
                            shapeCollection = shapeCollection2;
                            C9271yc c9271yc = (C9271yc) next.m29542x1();
                            c7394caM44916kk = c9271yc.m44916kk();
                            fM67477k4 = (float) C14116yg.m67477k4(tbpVarClone.f49090k4 * c9271yc.m44915k4().m30091k4(), 7);
                            fM67477k42 = (float) C14116yg.m67477k4(tbpVarClone.f49091x1 * c9271yc.m44915k4().m30093x1(), 7);
                            float fM67477k43 = (float) C14116yg.m67477k4((tbpVarClone.f49090k4 * c9271yc.m44917x1().m30091k4()) - ((double) fM67477k4), 7);
                            tbpVar = tbpVarClone;
                            nd1Var = nd1VarMo1214P_;
                            float fM67477k44 = (float) C14116yg.m67477k4((tbpVarClone.f49091x1 * c9271yc.m44917x1().m30093x1()) - ((double) fM67477k42), 7);
                            if (fM67477k44 < 0.0f) {
                                fM67477k44 = 0.0f;
                            }
                            fM28296k4 = fM67477k43 >= 0.0f ? fM67477k43 : 0.0f;
                            fM28298x1 = fM67477k44;
                        } else {
                            if (iM27428k4 != i2) {
                                throw new Exception(C14113y2.m67408k4("Unknown element \"", next.m29539k4(), "\""));
                            }
                            C7822h5 c7822h5 = (C7822h5) next.m29542x1();
                            c7394caM44916kk = c7822h5.m33078kk();
                            fM67477k4 = (float) C14116yg.m67477k4(tbpVarClone.f49090k4 * c7822h5.m33077k4().m30091k4(), 7);
                            shapeCollection = shapeCollection2;
                            float fM67477k45 = (float) C14116yg.m67477k4(tbpVarClone.f49091x1 * c7822h5.m33077k4().m30093x1(), 7);
                            fM28296k4 = (float) c7822h5.m33079x1().m28296k4();
                            fM28298x1 = (float) c7822h5.m33079x1().m28298x1();
                            tbpVar = tbpVarClone;
                            nd1Var = nd1VarMo1214P_;
                            fM67477k42 = fM67477k45;
                        }
                        if (c7394caM44916kk == null) {
                            shapeCollection2 = shapeCollection;
                            nd1VarMo1214P_ = nd1Var;
                            tbpVarClone = tbpVar;
                            i2 = 1;
                        } else {
                            int iM27428k42 = c7017h4.m27428k4(c7394caM44916kk.m29539k4());
                            if (iM27428k42 != 2) {
                                if (iM27428k42 == 3) {
                                    i = 1;
                                    C14490t8.m70985k4(shapeCollection.m2646up(), (C8247m7) c7394caM44916kk.m29542x1(), bjsVar);
                                } else if (iM27428k42 == 4) {
                                    i = 1;
                                    AbstractC7379c5 abstractC7379c5 = (AbstractC7379c5) c7394caM44916kk.m29542x1();
                                    Connector connectorM2644rv = shapeCollection.m2644rv();
                                    C13771lc.m64352k4(connectorM2644rv, abstractC7379c5, bjsVar);
                                    pictureFrame = connectorM2644rv;
                                } else if (iM27428k42 == 5) {
                                    i = 1;
                                    AbstractC8714rv abstractC8714rv = (AbstractC8714rv) c7394caM44916kk.m29542x1();
                                    PictureFrame pictureFrameM2653x6 = shapeCollection.m2653x6();
                                    r3b.m70018k4(pictureFrameM2653x6, abstractC8714rv, bjsVar);
                                    pictureFrame = pictureFrameM2653x6;
                                } else {
                                    if (iM27428k42 != 6) {
                                        throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394caM44916kk.m29539k4(), "\""));
                                    }
                                    i = 1;
                                    bjsVar.m4229k4().m6785k4("graphicFrame Chart UserShapes loading is not implemented yet.", 1);
                                }
                                i2 = i;
                                shapeCollection2 = shapeCollection;
                                nd1VarMo1214P_ = nd1Var;
                                tbpVarClone = tbpVar;
                            } else {
                                i = 1;
                                AbstractC8333ne abstractC8333ne = (AbstractC8333ne) c7394caM44916kk.m29542x1();
                                AutoShape autoShapeM2615fa = shapeCollection.m2615fa();
                                C0894dc.m5040k4(autoShapeM2615fa, abstractC8333ne, bjsVar);
                                pictureFrame = autoShapeM2615fa;
                            }
                            m63430k4(pictureFrame, fM67477k4, fM67477k42, fM28296k4, fM28298x1);
                            i2 = i;
                            shapeCollection2 = shapeCollection;
                            nd1VarMo1214P_ = nd1Var;
                            tbpVarClone = tbpVar;
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                tbp tbpVar2 = tbpVarClone;
                nd1 nd1Var2 = nd1VarMo1214P_;
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                nd1 nd1VarMo1214P_2 = groupShape.mo1214P_();
                nd1VarMo1214P_2.m67987k4(nd1Var2.m67982k4().Clone());
                groupShape.mo1650kk(tbpVar2.Clone());
                nd1VarMo1214P_2.m67985k4(nd1Var2.m67988kk(), nd1Var2.m67989to(), nd1Var2.m67980du());
                groupShape.m1647k4(tbp.f49088kk.Clone());
                groupShape.m1654x1(tbpVar2.Clone());
            }
            jlvVar = this;
        }
        mo55330fa();
    }

    public jlv(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m63433k4(IChart iChart, C14786xh c14786xh) {
        mo55332up();
        C7359bx c7359bx = new C7359bx();
        IGroupShape userShapes = iChart.getUserShapes();
        u8s u8sVarM70580k4 = c14786xh.m73359k4().m70580k4();
        IGenericEnumerator<IShape> it = userShapes.getShapes().iterator();
        while (it.hasNext()) {
            try {
                Shape shape = (Shape) it.next();
                C9271yc c9271yc = (C9271yc) c7359bx.m29211k4("relSizeAnchor").m29542x1();
                m63431k4(c9271yc, shape, iChart.getWidth(), iChart.getHeight());
                if (C7019kk.m27469x1(shape, IAutoShape.class)) {
                    AbstractC8333ne abstractC8333ne = (AbstractC8333ne) c9271yc.m44914k4("sp").m29542x1();
                    IAutoShape iAutoShape = (IAutoShape) shape;
                    if (iAutoShape.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat().getFontHeight() == 11.0f) {
                        iAutoShape.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat().setFontHeight(Float.NaN);
                    }
                    C0894dc.m5041k4(iAutoShape, abstractC8333ne, c14786xh.m73359k4(), c14786xh);
                } else if (C7019kk.m27469x1(shape, IGroupShape.class)) {
                    C14490t8.m70986k4((IGroupShape) shape, (AbstractC9290yj) c9271yc.m44914k4("grpSp").m29542x1(), c14786xh.m73359k4(), c14786xh);
                } else if (C7019kk.m27469x1(shape, IConnector.class)) {
                    C13771lc.m64353k4((IConnector) shape, (C8299mz) c9271yc.m44914k4("cxnSp").m29542x1(), u8sVarM70580k4);
                } else {
                    if (!C7019kk.m27469x1(shape, IPictureFrame.class)) {
                        throw new NotImplementedException();
                    }
                    r3b.m70019k4((IPictureFrame) shape, (C8776si) c9271yc.m44914k4("pic").m29542x1(), u8sVarM70580k4);
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
        c7359bx.mo6846k4(null, m55442ck(), "userShapes");
        mo55333yj();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63430k4(Shape shape, float f, float f2, float f3, float f4) {
        nd1 nd1VarMo1214P_ = shape.mo1214P_();
        if (!shape.m2572qm()) {
            nd1VarMo1214P_.m67987k4(new tbp(f, f2));
            shape.m2555k4(f3, f4);
            return;
        }
        float f5 = f + f3;
        C12025x6[] c12025x6Arr = {new C12025x6(f, f2), new C12025x6(f5, f2), new C12025x6(f5, f2 + f4)};
        C4317dy c4317dy = new C4317dy();
        c4317dy.m17338k4(-90.0f, new C12025x6((f3 / 2.0f) + f, (f4 / 2.0f) + f2));
        c4317dy.m17342k4(c12025x6Arr);
        double dM67480k4 = C14116yg.m67480k4(c12025x6Arr[2].m56897x1() - c12025x6Arr[1].m56897x1());
        double dM67480k42 = C14116yg.m67480k4(c12025x6Arr[0].m56895kk() - c12025x6Arr[1].m56895kk());
        nd1VarMo1214P_.m67987k4(new tbp(c12025x6Arr[1].m56897x1(), c12025x6Arr[1].m56895kk()));
        shape.m2555k4(dM67480k4, dM67480k42);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63431k4(C9271yc c9271yc, Shape shape, float f, float f2) {
        oju ojuVarClone = shape.mo1214P_().m67982k4().m71061du().Clone();
        oju ojuVarClone2 = shape.m2575sv().m71061du().Clone();
        if (shape.m2572qm()) {
            C12025x6[] c12025x6Arr = {new C12025x6(ojuVarClone.f47836k4, ojuVarClone.f47837x1), new C12025x6(ojuVarClone.f47836k4 + ojuVarClone2.f47836k4, ojuVarClone.f47837x1), new C12025x6(ojuVarClone.f47836k4, ojuVarClone.f47837x1 + ojuVarClone2.f47837x1)};
            C4317dy c4317dy = new C4317dy();
            c4317dy.m17338k4(90.0f, new C12025x6((ojuVarClone2.f47836k4 / 2.0f) + ojuVarClone.f47836k4, (ojuVarClone2.f47837x1 / 2.0f) + ojuVarClone.f47837x1));
            c4317dy.m17342k4(c12025x6Arr);
            ojuVarClone.f47836k4 = c12025x6Arr[2].m56897x1();
            ojuVarClone.f47837x1 = c12025x6Arr[2].m56895kk();
            ojuVarClone2.f47836k4 = C14116yg.m67480k4(c12025x6Arr[2].m56897x1() - c12025x6Arr[0].m56897x1());
            ojuVarClone2.f47837x1 = C14116yg.m67480k4(c12025x6Arr[1].m56895kk() - c12025x6Arr[0].m56895kk());
        }
        c9271yc.m44915k4().m30092k4(C14116yg.m67477k4(ojuVarClone.f47836k4 / f, 5));
        c9271yc.m44915k4().m30094x1(C14116yg.m67477k4(ojuVarClone.f47837x1 / f2, 5));
        c9271yc.m44917x1().m30092k4(C14116yg.m67477k4((ojuVarClone.f47836k4 + ojuVarClone2.f47836k4) / f, 5));
        c9271yc.m44917x1().m30094x1(C14116yg.m67477k4((ojuVarClone.f47837x1 + ojuVarClone2.f47837x1) / f2, 5));
    }
}
