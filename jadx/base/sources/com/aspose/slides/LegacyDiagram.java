package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class LegacyDiagram extends GraphicalObject implements ILegacyDiagram {

    /* JADX INFO: renamed from: k4 */
    private GroupShape f2588k4;

    public LegacyDiagram(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj, new nml());
        m2560k4((er8) null);
    }

    @Override // com.aspose.slides.ILegacyDiagram
    public final IGroupShape convertToGroupShape() {
        if (m2573s7() == null) {
            throw new InvalidOperationException("ParentGroup can not be null.");
        }
        IGroupShape iGroupShapeAddGroupShape = m2573s7().getShapes().addGroupShape();
        IGenericEnumerator<IShape> it = this.f2588k4.getShapes().iterator();
        while (it.hasNext()) {
            try {
                iGroupShapeAddGroupShape.getShapes().addClone(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return iGroupShapeAddGroupShape;
    }

    @Override // com.aspose.slides.ILegacyDiagram
    public final ISmartArt convertToSmartArt() {
        if (m2573s7() == null) {
            throw new InvalidOperationException("ParentGroup can not be null.");
        }
        ShapeCollection shapeCollection = (ShapeCollection) m2573s7().getShapes();
        ShapeFrame shapeFrameM2593xk = m2593xk();
        ISmartArt iSmartArtAddSmartArt = shapeCollection.addSmartArt(shapeFrameM2593xk.getX(), shapeFrameM2593xk.getY(), shapeFrameM2593xk.getWidth(), shapeFrameM2593xk.getHeight(), C0861cn.m4668k4(mo272to().m68092k4()));
        C0861cn.m4674k4(iSmartArtAddSmartArt, mo272to().m68092k4(), m1858kk().getShapes());
        return iSmartArtAddSmartArt;
    }

    @Override // com.aspose.slides.GraphicalObject
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final nml mo272to() {
        return (nml) super.mo272to();
    }

    /* JADX INFO: renamed from: kk */
    public final GroupShape m1858kk() {
        if (this.f2588k4 == null) {
            this.f2588k4 = new GroupShape(this);
        }
        nd1 nd1VarMo1214P_ = mo1214P_();
        nd1 nd1VarMo1214P_2 = this.f2588k4.mo1214P_();
        nd1VarMo1214P_2.m67987k4(nd1VarMo1214P_.m67982k4().Clone());
        this.f2588k4.mo1650kk(m2575sv().Clone());
        nd1VarMo1214P_2.m67985k4(nd1VarMo1214P_.m67988kk(), nd1VarMo1214P_.m67989to(), nd1VarMo1214P_.m67980du());
        return this.f2588k4;
    }
}
