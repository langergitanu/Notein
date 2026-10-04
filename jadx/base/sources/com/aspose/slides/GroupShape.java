package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class GroupShape extends Shape implements IGroupShape {

    /* JADX INFO: renamed from: k4 */
    final ShapeCollection f2428k4;

    /* JADX INFO: renamed from: kk */
    private tbp f2429kk;

    /* JADX INFO: renamed from: to */
    private tbp f2430to;

    /* JADX INFO: renamed from: x1 */
    private tbp f2431x1;

    public GroupShape(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj, new C14260oy(), new GroupShapeLock());
        this.f2431x1 = new tbp();
        this.f2429kk = new tbp();
        this.f2430to = tbp.f49089to.Clone();
        this.f2428k4 = new ShapeCollection(this);
        m2562k4(new nd1());
        m2560k4(new C0812bc(this));
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: P_ */
    public final nd1 mo1214P_() {
        return super.mo1214P_();
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: Q_ */
    public void mo1642Q_() {
        IGenericEnumerator<IShape> it = this.f2428k4.iterator();
        while (it.hasNext()) {
            try {
                ((Shape) it.next()).mo1642Q_();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        super.mo1642Q_();
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: R_ */
    public C12025x6[] mo1215R_() {
        return null;
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: S_ */
    public float[] mo1216S_() {
        return null;
    }

    /* JADX INFO: renamed from: ck */
    public final tbp m1643ck() {
        super.mo1214P_();
        return this.f2430to;
    }

    @Override // com.aspose.slides.IGroupShape
    public final IGroupShapeLock getGroupShapeLock() {
        return (IGroupShapeLock) super.getShapeLock();
    }

    @Override // com.aspose.slides.Shape, com.aspose.slides.IShape
    public ILineFormat getLineFormat() {
        return null;
    }

    @Override // com.aspose.slides.IGroupShape
    public final IShapeCollection getShapes() {
        return this.f2428k4;
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final C14260oy mo272to() {
        return (C14260oy) super.mo272to();
    }

    /* JADX INFO: renamed from: kk */
    public final tbp m1649kk() {
        return this.f2431x1;
    }

    /* JADX INFO: renamed from: rv */
    public final void m1651rv() {
        if (m2594xw() == null || getShapes().size() <= 0) {
            return;
        }
        synchronized (this) {
            C12007ix c12007ixClone = m1653up().Clone();
            m1641x1(new tbp(c12007ixClone.m56557jd(), c12007ixClone.m56551ck()), new tbp(c12007ixClone.m56550c5(), c12007ixClone.m56575x1()));
        }
    }

    /* JADX INFO: renamed from: to */
    public final tbp m1652to() {
        super.mo1214P_();
        return this.f2429kk;
    }

    /* JADX INFO: renamed from: up */
    public final C12007ix m1653up() {
        if (getShapes().size() == 0) {
            return C12007ix.f40519k4;
        }
        C12007ix c12007ixClone = ((Shape) this.f2428k4.get_Item(0)).m2551g8().Clone();
        for (int i = 1; i < this.f2428k4.size(); i++) {
            C12007ix.m56549x1(c12007ixClone.Clone(), ((Shape) this.f2428k4.get_Item(i)).m2551g8().Clone()).CloneTo(c12007ixClone);
        }
        return c12007ixClone;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1654x1(tbp tbpVar) {
        super.mo1214P_();
        tbpVar.CloneTo(this.f2429kk);
        m1640k4(this.f2429kk.Clone(), m2575sv().Clone());
    }

    /* JADX INFO: renamed from: yj */
    public final tbp m1655yj() {
        boolean zM2572qm = m2572qm();
        tbp tbpVarClone = m1643ck().Clone();
        for (GroupShape groupShapeM2573s7 = m2573s7(); groupShapeM2573s7 != null; groupShapeM2573s7 = groupShapeM2573s7.m2573s7()) {
            tbp tbpVarClone2 = groupShapeM2573s7.m1643ck().Clone();
            if (zM2572qm) {
                tbpVarClone2.m71065kk();
            }
            tbpVarClone.f49090k4 *= tbpVarClone2.f49090k4;
            tbpVarClone.f49091x1 *= tbpVarClone2.f49091x1;
            zM2572qm ^= groupShapeM2573s7.m2572qm();
        }
        return tbpVarClone;
    }

    /* JADX INFO: renamed from: x1 */
    private void m1641x1(tbp tbpVar, tbp tbpVar2) {
        nd1 nd1VarMo1214P_ = mo1214P_();
        if (m2594xw() == null || getShapes().size() <= 0) {
            return;
        }
        tbp tbpVarClone = tbp.m71054k4(tbpVar, tbp.m71053k4(tbpVar2, 2)).Clone();
        tbp tbpVarClone2 = tbp.m71054k4(m1649kk(), tbp.m71053k4(m1652to(), 2)).Clone();
        if (C14116yg.m67475k4((tbpVarClone.f49091x1 - tbpVarClone2.f49091x1) * ((double) (nd1VarMo1214P_.m67980du() != 1 ? 1 : -1))) + C14116yg.m67475k4((tbpVarClone.f49090k4 - tbpVarClone2.f49090k4) * ((double) (nd1VarMo1214P_.m67989to() == 1 ? -1 : 1))) > 1.0E-4d) {
            tbp tbpVarClone3 = m2566kk(((Shape) getShapes().get_Item(0)).m2546bz().m5634k4(tbpVarClone.f49090k4, tbpVarClone.f49091x1)).Clone().f47615k4.m68629x1().Clone();
            tbp tbpVarClone4 = m1643ck().Clone();
            double d = tbpVarClone4.f49090k4 * tbpVar2.f49090k4;
            double d2 = tbpVarClone4.f49091x1 * tbpVar2.f49091x1;
            tbpVarClone3.f49090k4 -= d / 2.0d;
            tbpVarClone3.f49091x1 -= d2 / 2.0d;
            nd1VarMo1214P_.m67987k4(tbpVarClone3.Clone());
            m2555k4(d, d2);
            m1647k4(tbpVar.Clone());
            m1654x1(tbpVar2.Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final tbp m1645k4(oju ojuVar, oju ojuVar2, boolean z) {
        tbp tbpVarClone = m1655yj().Clone();
        nd1 nd1VarMo1214P_ = super.mo1214P_();
        tbp tbpVarClone2 = tbp.m71054k4(m1649kk(), tbp.m71053k4(m1652to(), 2)).Clone();
        float f = ojuVar2.f47836k4;
        double d = ((((((double) f) - tbpVarClone2.f49090k4) * tbpVarClone.f49090k4) + ((double) ojuVar.f47836k4)) - ((double) f)) * ((double) (nd1VarMo1214P_.m67989to() == 1 ? -1 : 1));
        float f2 = ojuVar2.f47837x1;
        double d2 = ((((((double) f2) - tbpVarClone2.f49091x1) * tbpVarClone.f49091x1) + ((double) ojuVar.f47837x1)) - ((double) f2)) * ((double) (nd1VarMo1214P_.m67980du() != 1 ? 1 : -1));
        float fM67988kk = !z ? nd1VarMo1214P_.m67988kk() : 0.0f;
        double d3 = ((double) ((C14064he.m66715kk(fM67988kk) ? 0.0f : fM67988kk) / 180.0f)) * 3.141592653589793d;
        double dM67470dy = C14116yg.m67470dy(d3);
        double dM67495m9 = C14116yg.m67495m9(d3);
        return tbp.m71054k4(tbp.m71054k4(new tbp((d * dM67470dy) - (d2 * dM67495m9), (d2 * dM67470dy) + (d * dM67495m9)), nd1VarMo1214P_.m67982k4()), tbp.m71053k4(m2575sv(), 2));
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: kk */
    public void mo1650kk(tbp tbpVar) {
        super.mo1650kk(tbpVar.Clone());
        m1640k4(this.f2429kk.Clone(), tbpVar.Clone());
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: k4 */
    public void mo1646k4(float f, float f2) {
        IGenericEnumerator<IShape> it = this.f2428k4.iterator();
        while (it.hasNext()) {
            try {
                ((Shape) it.next()).mo1646k4(f, f2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: k4 */
    public void mo282k4(float f, float f2, float f3) {
        IGenericEnumerator<IShape> it = this.f2428k4.iterator();
        while (it.hasNext()) {
            try {
                ((Shape) it.next()).mo282k4(f, f2, f3);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1647k4(tbp tbpVar) {
        tbpVar.CloneTo(this.f2431x1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m1640k4(tbp tbpVar, tbp tbpVar2) {
        double d;
        tbp tbpVar3 = this.f2430to;
        double d2 = 1.0d;
        if (C14116yg.m67475k4(tbpVar2.f49090k4 - tbpVar.f49090k4) >= 0.001d) {
            double d3 = tbpVar.f49090k4;
            if (d3 != 0.0d) {
                double d4 = tbpVar2.f49090k4;
                d = d4 == 0.0d ? 1.0d : d4 / d3;
            }
        }
        tbpVar3.f49090k4 = d;
        tbp tbpVar4 = this.f2430to;
        if (C14116yg.m67475k4(tbpVar2.f49091x1 - tbpVar.f49091x1) >= 0.001d) {
            double d5 = tbpVar.f49091x1;
            if (d5 != 0.0d) {
                double d6 = tbpVar2.f49091x1;
                if (d6 != 0.0d) {
                    d2 = d6 / d5;
                }
            }
        }
        tbpVar4.f49091x1 = d2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1648k4(tbp tbpVar, tbp tbpVar2, C1258im c1258im, tbp tbpVar3) {
        nd1 nd1VarMo1214P_ = super.mo1214P_();
        nd1VarMo1214P_.m67987k4(tbpVar.Clone());
        mo1650kk(tbpVar2.Clone());
        nd1VarMo1214P_.m67986k4(c1258im.Clone());
        tbpVar3.CloneTo(this.f2429kk);
        m1640k4(this.f2429kk.Clone(), tbpVar2.Clone());
    }
}
