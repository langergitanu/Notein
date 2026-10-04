package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
final class dnd extends er8 {
    public dnd(OleObjectFrame oleObjectFrame) {
        super(oleObjectFrame);
    }

    /* JADX INFO: renamed from: k4 */
    public final OleObjectFrame m5190k4() {
        return (OleObjectFrame) m5629du();
    }

    @Override // com.aspose.slides.er8
    /* JADX INFO: renamed from: k4 */
    public void mo4131k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) {
        cxj cxjVar;
        C12007ix c12007ixClone;
        if (m5629du().getHidden()) {
            return;
        }
        ShapeFrame shapeFrameM5631fa = m5631fa();
        float x = shapeFrameM5631fa.getX();
        float y = shapeFrameM5631fa.getY();
        float width = shapeFrameM5631fa.getWidth();
        float height = shapeFrameM5631fa.getHeight();
        if (C14064he.m66715kk(x) || C14064he.m66715kk(y) || C14064he.m66715kk(width) || C14064he.m66715kk(height)) {
            return;
        }
        abstractC14897zn.m74622kk(new C4317dy());
        ajz ajzVar = new ajz(shapeFrameM5631fa.cloneT(), new C4317dy(), null, m5642m9(), kg7Var);
        C12007ix c12007ix = new C12007ix(x, y, width, height);
        abstractC14897zn.mo68794k4(c12007ix.Clone(), (azo) null, C0962es.m5659k4(ajzVar, (FillFormat) m5629du().getFillFormat()));
        PictureFillFormat pictureFillFormat = m5190k4().f2885x1;
        if (pictureFillFormat.getPicture().getImage() != null) {
            if (((PPImage) pictureFillFormat.getPicture().getImage()).m2129jd() || m5190k4().isObjectIcon()) {
                if (m5190k4().isObjectIcon()) {
                    m5190k4().f2875kk = m5190k4().m2083qq();
                    pictureFillFormat = m5190k4().f2875kk;
                }
                PictureFillFormat pictureFillFormat2 = pictureFillFormat;
                C14250os c14250os = (C14250os) C7019kk.m27452k4((Object) abstractC14897zn, C14250os.class);
                if (c14250os == null || c14250os.m68789ck()) {
                    cxjVar = new cxj(ajzVar, pictureFillFormat2);
                    if (C3099wl.m13195m9(cxjVar.m4845ar().m27679to() ? cxjVar.m4845ar().m27674du() : new byte[0]) || c14250os == null) {
                        c12007ixClone = c12007ix.Clone();
                    } else {
                        ajz ajzVar2 = new ajz(shapeFrameM5631fa.cloneT(), abstractC14897zn, null, m5642m9(), 5, kg7Var);
                        abstractC14897zn.mo68794k4(c12007ix.Clone(), (azo) null, new cxj(ajzVar2, pictureFillFormat2));
                        ajzVar = ajzVar2;
                    }
                } else {
                    c14250os.mo68793k4(pictureFillFormat2.getPicture().getImage(), c12007ix.Clone(), (qta) null);
                }
            } else {
                c12007ixClone = c12007ix.Clone();
                cxjVar = new cxj(ajzVar, pictureFillFormat);
            }
            abstractC14897zn.mo68794k4(c12007ixClone, (azo) null, cxjVar);
        }
        ILineFormat lineFormat = m5629du().getLineFormat();
        if (!lineFormat.isFormatNotDefined()) {
            float width2 = C14044b3.m66437kk(lineFormat.getWidth()) ? 0.0f : (float) lineFormat.getWidth();
            float f = width2 / 2.0f;
            abstractC14897zn.mo68794k4(new C12007ix(x - f, y - f, width + width2, height + width2), new azo(ajzVar, (LineFormat) lineFormat), (C0962es) null);
        }
        abstractC14897zn.m74626rv();
    }
}
