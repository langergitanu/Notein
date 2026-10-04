package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: renamed from: com.aspose.slides.d2 */
/* JADX INFO: loaded from: classes3.dex */
final class C0878d2 extends er8 {
    public C0878d2(Chart chart) {
        super(chart);
    }

    /* JADX INFO: renamed from: to */
    private void m4895to() {
        nd1 nd1VarMo1214P_ = m5629du().mo1214P_();
        nd1 nd1VarMo1214P_2 = m4897k4().m521yj().mo1214P_();
        nd1VarMo1214P_2.m67987k4(new tbp(m5629du().getX(), m5629du().getY()));
        m4897k4().m521yj().m2555k4(m5629du().getWidth(), m5629du().getHeight());
        nd1VarMo1214P_2.m67985k4(nd1VarMo1214P_.m67988kk(), nd1VarMo1214P_.m67989to(), nd1VarMo1214P_.m67980du());
    }

    /* JADX INFO: renamed from: k4 */
    public final Chart m4897k4() {
        return (Chart) m5629du();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m4898x1() {
        m4895to();
    }

    /* JADX INFO: renamed from: x1 */
    private void m4896x1(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) {
        if (m4897k4().m521yj() != null) {
            m4895to();
            C14851yl c14851yl = new C14851yl();
            AbstractC14897zn[] abstractC14897znArr = {abstractC14897zn};
            c14851yl.m73926k4(abstractC14897znArr, ((ShapeFrame) m5629du().getFrame()).m2660k4().Clone());
            AbstractC14897zn abstractC14897zn2 = abstractC14897znArr[0];
            m4897k4().m521yj().m2546bz().mo4131k4(abstractC14897zn2, kg7Var, interruptionToken);
            abstractC14897znArr[0] = abstractC14897zn2;
            c14851yl.m73925k4(abstractC14897znArr);
        }
    }

    @Override // com.aspose.slides.er8
    /* JADX INFO: renamed from: k4 */
    public void mo4131k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) {
        float f;
        if (m5629du().getHidden()) {
            return;
        }
        interruptionToken.throwIfInterruptionRequested();
        C14365qy c14365qy = new C14365qy(m4897k4(), abstractC14897zn, kg7Var);
        ShapeFrame shapeFrameM5631fa = m5631fa();
        float x = shapeFrameM5631fa.getX();
        float y = shapeFrameM5631fa.getY();
        float width = shapeFrameM5631fa.getWidth();
        float height = shapeFrameM5631fa.getHeight();
        if (C14064he.m66715kk(x) || C14064he.m66715kk(y) || C14064he.m66715kk(width) || C14064he.m66715kk(height)) {
            return;
        }
        if (shapeFrameM5631fa.getWidth() == 0.0f && shapeFrameM5631fa.getHeight() == 0.0f) {
            return;
        }
        float f2 = 1.0f;
        if (shapeFrameM5631fa.getFlipH() == 1) {
            f = 1.0f;
            f2 = -1.0f;
        } else {
            f = 1.0f;
        }
        C4317dy c4317dy = new C4317dy(f2, 0.0f, 0.0f, shapeFrameM5631fa.getFlipV() == 1 ? -1.0f : f, shapeFrameM5631fa.getFlipH() == 1 ? shapeFrameM5631fa.getCenterX() * 2.0f : 0.0f, shapeFrameM5631fa.getFlipV() == 1 ? shapeFrameM5631fa.getCenterY() * 2.0f : 0.0f);
        if (!C14064he.m66715kk(shapeFrameM5631fa.getRotation())) {
            c4317dy.m17339k4((shapeFrameM5631fa.getFlipH() == 1) ^ (shapeFrameM5631fa.getFlipV() == 1) ? -shapeFrameM5631fa.getRotation() : shapeFrameM5631fa.getRotation(), new C12025x6(shapeFrameM5631fa.getCenterX(), shapeFrameM5631fa.getCenterY()), 0);
        }
        abstractC14897zn.m74622kk(c4317dy);
        if (m4897k4().m512kk()) {
            if (c14365qy.m69865up().size() != 0) {
                new C0974f2(c14365qy).m7147du();
            }
        } else if (m4897k4().getType() == 81) {
            if (m5629du().m2581um() != null) {
                m5629du().m2581um().m2546bz().mo4131k4(abstractC14897zn, kg7Var, interruptionToken);
            }
        } else {
            if (!ChartTypeCharacterizer.is3DChart(m4897k4().getType())) {
                throw new NotImplementedException("Chart type is not supported for rendering");
            }
            if (C14164n2.m67854k4(m4897k4())) {
                new C0897dd(c14365qy).m5063k4();
            } else {
                C14728w8.m72661x1(c14365qy);
            }
        }
        m4896x1(abstractC14897zn, kg7Var, interruptionToken);
        abstractC14897zn.m74626rv();
    }
}
