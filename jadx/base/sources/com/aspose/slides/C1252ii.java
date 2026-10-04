package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10724y1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.ii */
/* JADX INFO: loaded from: classes3.dex */
class C1252ii extends C14856yp {
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ac  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m7636k4(qah qahVar) {
        ri7 ri7Var;
        int[] iArr;
        ri7 ri7VarM69481du = qahVar.m69481du();
        C10462h9 c10462h9 = (C10462h9) C7019kk.m27452k4((Object) qahVar.m69489kk(), C10462h9.class);
        AutoShape autoShapeM2615fa = (AutoShape) C7019kk.m27452k4((Object) ri7VarM69481du.m70148u4(), AutoShape.class);
        if (autoShapeM2615fa == null) {
            autoShapeM2615fa = qahVar.m69491m9().m2615fa();
            ri7VarM69481du.m70143k4(autoShapeM2615fa);
        }
        C14856yp.m73972x1(qahVar);
        autoShapeM2615fa.m284k4(autoShapeM2615fa.mo1638uz().m72307ck().m52025c5() == 202);
        int iM5902k4 = f6b.m5902k4(c10462h9.mo50864to().m52025c5());
        C10724y1 c10724y1Mo50864to = c10462h9.mo50864to();
        if (iM5902k4 == 0) {
            if (c10724y1Mo50864to.m52025c5() == 0 || c10462h9.mo50864to().m52025c5() == 100) {
                new C14888zk(autoShapeM2615fa.m1591yj(), c10462h9);
                if (autoShapeM2615fa.m1591yj().m3311h4() == null) {
                    ri7VarM69481du.m70139ck();
                    ri7VarM69481du.m70149up().m64738wl().removeItemByKey(Long.valueOf(qahVar.m69479c5()));
                    return;
                }
            } else {
                C14856yp.m73970k4(autoShapeM2615fa.m1591yj(), AutoShapeImp.m290k4(c10462h9.mo50864to().m52025c5()), c10462h9);
            }
        } else if (c10724y1Mo50864to.m52031dy()) {
            autoShapeM2615fa.m1591yj().m3331x1(iM5902k4);
        }
        if (!ri7VarM69481du.m70141ix().m63998up()) {
            C14680vi.m72289k4(autoShapeM2615fa.getFillFormat(), ri7VarM69481du);
            tcp.m71097k4(autoShapeM2615fa.getLineFormat(), f6b.m5993x1(autoShapeM2615fa.getShapeType()), false, ri7VarM69481du);
            C14200nt.m68199k4(autoShapeM2615fa.getEffectFormat(), ri7VarM69481du);
            qo7.m69721k4(autoShapeM2615fa.getThreeDFormat(), false, ri7VarM69481du);
        }
        if (autoShapeM2615fa.m1591yj().m3334x1() != null) {
            IShapeFrame frame = autoShapeM2615fa.getFrame();
            AutoShapeImp autoShapeImpM290k4 = AutoShapeImp.m290k4(c10462h9.mo50864to().m52025c5());
            if (autoShapeImpM290k4 == null || autoShapeImpM290k4.m294k4() == null) {
                iArr = new int[autoShapeM2615fa.m1591yj().m3334x1().length];
            } else {
                iArr = new int[C14116yg.m67483k4(autoShapeM2615fa.m1591yj().m3334x1().length, autoShapeImpM290k4.m294k4().length)];
                AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) autoShapeImpM290k4.m294k4()), AbstractC14092to.m67208k4((Object) iArr), autoShapeImpM290k4.m294k4().length);
            }
            for (int i = 0; i < iArr.length; i++) {
                C10609qn c10609qn = c10462h9.mo50859du() != null ? (C10609qn) C7019kk.m27452k4((Object) c10462h9.mo50859du().m51263x1().m50923k4(i + StyleIdentifier.LIST_TABLE_6_COLORFUL), C10609qn.class) : null;
                if (c10609qn != null) {
                    iArr[i] = (int) c10609qn.m51597ar();
                }
            }
            for (int i2 = 0; i2 < autoShapeM2615fa.m1591yj().m3334x1().length; i2++) {
                autoShapeM2615fa.m1591yj().m3334x1()[i2] = new C13791lr(C14113y2.m67408k4("adj", C14057f9.m66591x1(i2)), 0L);
            }
            f6b.m5911k4(autoShapeM2615fa.m1591yj().m3334x1(), autoShapeM2615fa.m1591yj().m3308ck(), iArr, frame.getWidth(), frame.getHeight());
            if (iM5902k4 == 89) {
                double dM64511x1 = autoShapeM2615fa.m1591yj().m3334x1()[0].m64511x1() % 360.0f;
                double dM64511x12 = autoShapeM2615fa.m1591yj().m3334x1()[1].m64511x1() % 360.0f;
                double d = (dM64511x1 / 180.0d) * 3.141592653589793d;
                double d2 = (dM64511x12 / 180.0d) * 3.141592653589793d;
                double dM67470dy = (C14116yg.m67470dy(d) / 2.0d) + 0.5d;
                double dM67495m9 = (C14116yg.m67495m9(d) / 2.0d) + 0.5d;
                double dM67470dy2 = (C14116yg.m67470dy(d2) / 2.0d) + 0.5d;
                ri7Var = ri7VarM69481du;
                double dM67495m92 = (C14116yg.m67495m9(d2) / 2.0d) + 0.5d;
                double dM67491kk = C14116yg.m67491kk(dM67470dy, dM67470dy2);
                double dM67491kk2 = C14116yg.m67491kk(dM67495m9, dM67495m92);
                double dM67502x1 = C14116yg.m67502x1(dM67470dy, dM67470dy2);
                double dM67502x12 = C14116yg.m67502x1(dM67495m9, dM67495m92);
                if (dM67491kk > 0.5d) {
                    dM67491kk = 0.5d;
                }
                if (dM67502x1 < 0.5d) {
                    dM67502x1 = 0.5d;
                }
                if (dM67491kk2 > 0.5d) {
                    dM67491kk2 = 0.5d;
                }
                double d3 = dM67502x12 >= 0.5d ? dM67502x12 : 0.5d;
                if (dM64511x1 > dM64511x12) {
                    dM64511x12 += 360.0d;
                }
                if (dM64511x12 > 360.0d) {
                    dM67502x1 = 1.0d;
                }
                if (dM64511x1 < 90.0d && dM64511x12 > 90.0d) {
                    d3 = 1.0d;
                }
                if (dM64511x1 < 180.0d && dM64511x12 > 180.0d) {
                    dM67491kk = 0.0d;
                }
                if (dM64511x1 < 270.0d && dM64511x12 > 270.0d) {
                    dM67491kk2 = 0.0d;
                }
                double width = ((double) frame.getWidth()) / (dM67502x1 - dM67491kk);
                double height = ((double) frame.getHeight()) / (d3 - dM67491kk2);
                autoShapeM2615fa.setFrame(new ShapeFrame(((double) frame.getX()) - (dM67491kk * width), ((double) frame.getY()) - (dM67491kk2 * height), width, height, frame.getFlipH(), frame.getFlipV(), frame.getRotation()));
            } else {
                ri7Var = ri7VarM69481du;
            }
        }
        m7637k4(ri7Var);
        autoShapeM2615fa.mo277dy();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7637k4(ri7 ri7Var) {
        if (((AutoShape) C7019kk.m27452k4((Object) ri7Var.m70148u4(), AutoShape.class)) == null) {
            return;
        }
        ljv.m64415k4(ri7Var.m70141ix());
        ri7Var.m70141ix().m63991k4();
    }
}
