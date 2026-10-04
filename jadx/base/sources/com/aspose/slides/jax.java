package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10458gz;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class jax {
    /* JADX INFO: renamed from: k4 */
    public static void m63269k4(qah qahVar) {
        Shape shapeM73645k4;
        if (qahVar.m69494up() && qahVar.m69482dy() != 1 && (shapeM73645k4 = C14823xy.m73645k4(qahVar)) != null) {
            sil silVar = (sil) C7019kk.m27452k4((Object) qahVar.m69481du(), sil.class);
            if (silVar != null && C7019kk.m27452k4((Object) shapeM73645k4, GroupShape.class) == null) {
                List.Enumerator<qah> it = silVar.m70642h4().iterator();
                while (it.hasNext()) {
                    try {
                        it.next().m69488k4(false);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
            ShapeFrame shapeFrameM2593xk = shapeM73645k4.m2593xk();
            hi8.m7176k4(qahVar);
            if (shapeM73645k4.m2593xk().m2660k4().m56568kk()) {
                shapeM73645k4.m2559k4(shapeFrameM2593xk);
            }
            GeometryShape geometryShape = (GeometryShape) C7019kk.m27452k4((Object) shapeM73645k4, GeometryShape.class);
            if (geometryShape != null && geometryShape.m1591yj().m3308ck() == -1) {
                geometryShape.m1591yj().m3331x1(5);
            }
            Shape shape = (Shape) qahVar.m69481du().m70148u4();
            if (((ShapeFrame) shape.getRawFrame()).m2660k4().m56568kk()) {
                AbstractC10458gz abstractC10458gzM69489kk = qahVar.m69489kk();
                if (abstractC10458gzM69489kk == null) {
                    return;
                }
                tbp tbpVar = new tbp();
                tbp tbpVar2 = new tbp();
                C1258im c1258im = new C1258im();
                tbp[] tbpVarArr = {tbpVar};
                tbp[] tbpVarArr2 = {tbpVar2};
                C1258im[] c1258imArr = {c1258im};
                xbk.m73301k4(abstractC10458gzM69489kk, tbpVarArr, tbpVarArr2, c1258imArr);
                tbpVarArr[0].CloneTo(tbpVar);
                tbpVarArr2[0].CloneTo(tbpVar2);
                c1258imArr[0].CloneTo(c1258im);
                shape.mo2564k4(tbpVar.Clone(), tbpVar2.Clone(), c1258im.Clone());
            }
            shapeM73645k4.mo277dy();
            return;
        }
        String strM67408k4 = C14113y2.f47374k4;
        int iM69482dy = qahVar.m69482dy();
        if (iM69482dy == 1) {
            C14916zv.m74842k4(qahVar);
            strM67408k4 = "Group ";
        } else if (iM69482dy == 3) {
            C1252ii.m7636k4(qahVar);
            IAutoShape iAutoShape = (IAutoShape) C7019kk.m27452k4((Object) qahVar.m69481du().m70148u4(), IAutoShape.class);
            strM67408k4 = (iAutoShape.getTextFrame() == null || ((TextFrame) iAutoShape.getTextFrame()).m2908jd().m2957ks() != 1) ? iAutoShape.isTextBox() ? "Text Box " : C14113y2.m67408k4(C14042ak.m66410k4(ShapeType.class, iAutoShape.getShapeType()), " ") : "WordArt ";
        } else if (iM69482dy != 4) {
            switch (iM69482dy) {
                case 7:
                    ls7.m64552x1(qahVar);
                    break;
                case 8:
                    C13644io.m63019k4(qahVar);
                    break;
                case 9:
                    afo.m3544kk(qahVar);
                    strM67408k4 = "Picture ";
                    break;
                case 10:
                case 11:
                case 12:
                    C14765x5.m73109k4(qahVar);
                    AudioFrame audioFrame = (AudioFrame) C7019kk.m27452k4((Object) qahVar.m69481du().m70148u4(), AudioFrame.class);
                    if (audioFrame != null && !C14113y2.m67411k4(audioFrame.f218x1)) {
                        strM67408k4 = audioFrame.f218x1;
                    }
                    break;
                case 13:
                    knz.m64053k4(qahVar);
                    VideoFrame videoFrame = (VideoFrame) C7019kk.m27452k4((Object) qahVar.m69481du().m70148u4(), VideoFrame.class);
                    if (videoFrame != null && !C14113y2.m67411k4(videoFrame.f3668x1)) {
                        strM67408k4 = videoFrame.f3668x1;
                    }
                    break;
                case 14:
                    afp.m3558x1(qahVar);
                    strM67408k4 = "Object ";
                    break;
                case 15:
                    afp.m3555kk(qahVar);
                    break;
                default:
                    k3x.m63633to(qahVar);
                    break;
            }
        } else {
            rx0.m70389x1(qahVar);
            strM67408k4 = "Table ";
        }
        if (C14113y2.m67411k4(strM67408k4)) {
            return;
        }
        IShape iShape = (IShape) qahVar.m69481du().m70148u4();
        if (C14113y2.m67411k4(iShape.getName())) {
            if (C7019kk.m27469x1(iShape, IAudioFrame.class) || C7019kk.m27469x1(iShape, IVideoFrame.class)) {
                iShape.setName(strM67408k4);
                return;
            }
            int[] iArr = {0};
            boolean zM66590k4 = C14057f9.m66590k4(C14113y2.m67422kk(C14114y9.m67460k4(qahVar.m69479c5(), "X4"), r9.length() - 2), iArr);
            int i = iArr[0];
            if (zM66590k4) {
                iShape.setName(C14113y2.m67408k4(strM67408k4, C14057f9.m66591x1(i)));
            }
        }
    }
}
