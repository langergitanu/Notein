package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p431ty.C11242x1;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GeometryShape extends Shape implements IGeometryShape {

    /* JADX INFO: renamed from: du */
    ShapeStyle f2388du;

    /* JADX INFO: renamed from: k4 */
    private final C0735a7 f2389k4;

    /* JADX INFO: renamed from: x1 */
    private AdjustValueCollection f2390x1;

    public GeometryShape(InterfaceC14397rj interfaceC14397rj, C14435s6 c14435s6, IBaseShapeLock iBaseShapeLock) {
        super(interfaceC14397rj, c14435s6, iBaseShapeLock);
        this.f2388du = null;
        this.f2390x1 = AdjustValueCollection.f188k4;
        this.f2389k4 = new C0735a7(this);
        this.f3300c5 = new LineFormat(this);
    }

    /* JADX INFO: renamed from: k4 */
    public static Dictionary<Integer, Integer> m1582k4(boolean z, int... iArr) {
        if (!z) {
            return m1583k4(iArr);
        }
        Dictionary<Integer, Integer> dictionaryM1583k4 = m1583k4(C3085sv.m13094k4(AbstractC14106wy.getValues(C7019kk.m27443k4((Class<?>) ShapeType.class))));
        for (int i : iArr) {
            dictionaryM1583k4.removeItemByKey(Integer.valueOf(i));
        }
        return dictionaryM1583k4;
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: R_ */
    public C12025x6[] mo1215R_() {
        ShapeFrame shapeFrameM5631fa = m2546bz().m5631fa();
        float x = shapeFrameM5631fa.getX();
        float y = shapeFrameM5631fa.getY();
        float width = shapeFrameM5631fa.getWidth();
        float height = shapeFrameM5631fa.getHeight();
        C12025x6[] c12025x6ArrM3333x1 = (C14064he.m66715kk(x) || C14064he.m66715kk(y) || C14064he.m66715kk(width) || C14064he.m66715kk(height)) ? null : this.f2389k4.m3333x1(x, y, width, height);
        return c12025x6ArrM3333x1 != null ? c12025x6ArrM3333x1 : super.mo1215R_();
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: S_ */
    public float[] mo1216S_() {
        ShapeFrame shapeFrameM5631fa = m2546bz().m5631fa();
        float width = shapeFrameM5631fa.getWidth();
        float height = shapeFrameM5631fa.getHeight();
        float[] fArrM3325k4 = (C14064he.m66715kk(width) || C14064he.m66715kk(height)) ? null : this.f2389k4.m3325k4(width, height);
        return fArrM3325k4 != null ? fArrM3325k4 : super.mo1216S_();
    }

    @Override // com.aspose.slides.IGeometryShape
    public final IShapeElement[] createShapeElements() {
        ShapeFrame shapeFrameM5631fa = m2546bz().m5631fa();
        float x = shapeFrameM5631fa.getX();
        float y = shapeFrameM5631fa.getY();
        float width = shapeFrameM5631fa.getWidth();
        float height = shapeFrameM5631fa.getHeight();
        if (C14064he.m66715kk(x) || C14064he.m66715kk(y) || C14064he.m66715kk(width) || C14064he.m66715kk(height)) {
            return null;
        }
        return m1590x6().m3327k4(this, x, y, width, height);
    }

    @Override // com.aspose.slides.IGeometryShape
    public final IAdjustValueCollection getAdjustments() {
        if (C14067j2.m66729x1(this.f2390x1, AdjustValueCollection.f188k4) || this.f2390x1 == null) {
            this.f2390x1 = new AdjustValueCollection(this);
        }
        return this.f2390x1;
    }

    @Override // com.aspose.slides.IGeometryShape
    public final IGeometryPath[] getGeometryPaths() {
        return this.f2389k4.m3326k4(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // com.aspose.slides.IGeometryShape
    public final IShapeStyle getShapeStyle() {
        return this.f2388du;
    }

    public int getShapeType() {
        return this.f2389k4.m3308ck();
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: ix */
    public IFillFormatEffectiveData mo1585ix() {
        return this.f3303dy.getEffective();
    }

    /* JADX INFO: renamed from: ks */
    public final C0833bw m1586ks() {
        return (C0833bw) m2546bz();
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: ne */
    public ILineFormatEffectiveData mo1587ne() {
        return m2571lr().getEffective();
    }

    /* JADX INFO: renamed from: rv */
    public final void m1588rv() {
        this.f2388du = new ShapeStyle(this);
    }

    @Override // com.aspose.slides.IGeometryShape
    public final void setGeometryPath(IGeometryPath iGeometryPath) {
        setGeometryPaths(new IGeometryPath[]{iGeometryPath});
    }

    @Override // com.aspose.slides.IGeometryShape
    public final void setGeometryPaths(IGeometryPath[] iGeometryPathArr) {
        if (iGeometryPathArr.length == 0) {
            throw new ArgumentException("No paths found");
        }
        this.f2389k4.m3320k4(new f7k[iGeometryPathArr.length]);
        float fM6045x1 = 0.0f;
        float fM6045x12 = 0.0f;
        for (int i = 0; i < iGeometryPathArr.length; i++) {
            f7k f7kVar = new f7k();
            IGeometryPath iGeometryPath = iGeometryPathArr[i];
            if (C7019kk.m27469x1(iGeometryPath, GeometryPath.class)) {
                GeometryPath geometryPath = (GeometryPath) iGeometryPath;
                f7kVar.m6036k4(geometryPath.getFillMode());
                f7kVar.m6039k4(geometryPath.getStroke());
            }
            if (iGeometryPath.getPathData().length == 0) {
                throw new ArgumentException("Empty path found");
            }
            for (int i2 = 0; i2 < iGeometryPath.getPathData().length; i2++) {
                if (iGeometryPath.getPathData()[i2].getPathCommand() == 3) {
                    new List();
                    float[] segmentData = iGeometryPath.getPathData()[i2].getSegmentData();
                    List list = new List();
                    list.addItem(Long.valueOf(C7019kk.m27438h4(Float.valueOf(segmentData[0] * 12700.0f), 13)));
                    list.addItem(Long.valueOf(C7019kk.m27438h4(Float.valueOf(segmentData[1] * 12700.0f), 13)));
                    list.addItem(Long.valueOf(C7019kk.m27438h4(Float.valueOf(segmentData[2] * 60000.0f), 13)));
                    list.addItem(Long.valueOf(C7019kk.m27438h4(Float.valueOf(segmentData[3] * 60000.0f), 13)));
                    f7kVar.m6040k4(new byte[]{iGeometryPath.getPathData()[i2].getPathCommand()}, C3085sv.m13068h4(list));
                } else if (iGeometryPath.getPathData()[i2].getPathCommand() == 0) {
                    f7kVar.m6040k4(new byte[]{0}, (long[]) null);
                } else {
                    List list2 = new List();
                    float[] segmentData2 = iGeometryPath.getPathData()[i2].getSegmentData();
                    for (int i3 = 0; i3 < iGeometryPath.getPathData()[i2].getSegmentData().length; i3 += 2) {
                        list2.addItem(new C12025x6(segmentData2[i3], segmentData2[i3 + 1]));
                    }
                    m1584k4((C12025x6[]) list2.toArray(new C12025x6[0]), iGeometryPath.getPathData()[i2].getPathCommand(), f7kVar);
                }
            }
            f7kVar.m6047x1(C7019kk.m27438h4(Float.valueOf(getHeight() * 12700.0f), 13));
            f7kVar.m6037k4(C7019kk.m27438h4(Float.valueOf(getWidth() * 12700.0f), 13));
            if (f7kVar.m6045x1() > fM6045x1) {
                fM6045x1 = f7kVar.m6045x1();
            }
            if (f7kVar.m6042kk() > fM6045x12) {
                fM6045x12 = f7kVar.m6045x1();
            }
            this.f2389k4.m3311h4()[i] = f7kVar;
        }
        this.f2389k4.m3317k4(0);
    }

    public void setShapeType(int i) {
        this.f2389k4.m3331x1(i);
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: to */
    public C14435s6 mo272to() {
        return (C14435s6) super.mo272to();
    }

    /* JADX INFO: renamed from: u4 */
    public final void m1589u4() {
        this.f2388du = null;
    }

    /* JADX INFO: renamed from: x6 */
    public final C0735a7 m1590x6() {
        if (this.f2389k4.m3308ck() != -1) {
            return this.f2389k4;
        }
        Shape[] shapeArrM2547c6 = m2547c6();
        C0735a7 c0735a7 = this.f2389k4;
        for (Shape shape : shapeArrM2547c6) {
            GeometryShape geometryShape = (GeometryShape) C7019kk.m27452k4((Object) shape, GeometryShape.class);
            if (geometryShape != null && geometryShape.m1591yj().m3308ck() != -1) {
                return geometryShape.m1591yj();
            }
        }
        return c0735a7;
    }

    /* JADX INFO: renamed from: yj */
    public final C0735a7 m1591yj() {
        return this.f2389k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static Dictionary<Integer, Integer> m1583k4(int... iArr) {
        Dictionary<Integer, Integer> dictionary = new Dictionary<>(iArr.length);
        for (int i = 0; i < iArr.length; i++) {
            dictionary.addItem(Integer.valueOf(iArr[i]), Integer.valueOf(iArr[i]));
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    private void m1584k4(C12025x6[] c12025x6Arr, byte b, f7k f7kVar) {
        List list = new List();
        List list2 = new List();
        list.addItem(Byte.valueOf(b));
        for (int i = 0; i < c12025x6Arr.length; i++) {
            list2.addItem(new C12025x6(c12025x6Arr[i].m56897x1() + getX(), c12025x6Arr[i].m56895kk() + getY()).Clone());
        }
        f7k f7kVar2 = new f7k(list, C11242x1.m54227k4((C12025x6[]) list2.toArray(new C12025x6[0]), ((ShapeFrame) getFrame()).m2660k4().Clone(), new C11913yj()));
        f7kVar.m6040k4(f7kVar2.m6043m9(), f7kVar2.m6041k4());
    }
}
