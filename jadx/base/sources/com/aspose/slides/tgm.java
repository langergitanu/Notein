package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8601qh;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: loaded from: classes3.dex */
class tgm {
    /* JADX INFO: renamed from: k4 */
    public static void m71152k4(IGeometryShape iGeometryShape, C8601qh c8601qh) {
        if (c8601qh == null) {
            return;
        }
        ((GeometryShape) iGeometryShape).m1588rv();
        IShapeStyle shapeStyle = iGeometryShape.getShapeStyle();
        if (c8601qh.m39495k4() != null) {
            C1246ib.m7610k4(shapeStyle.getLineColor(), c8601qh.m39495k4().m40769x1());
            shapeStyle.setLineStyleIndex((int) (c8601qh.m39495k4().m40765k4() & C18177fb.f54859s));
        }
        if (c8601qh.m39498x1() != null) {
            C1246ib.m7610k4(shapeStyle.getFillColor(), c8601qh.m39498x1().m40769x1());
            shapeStyle.setFillStyleIndex((short) c8601qh.m39498x1().m40765k4());
        }
        if (c8601qh.m39496kk() != null) {
            C1246ib.m7610k4(shapeStyle.getEffectColor(), c8601qh.m39496kk().m40769x1());
            shapeStyle.setEffectStyleIndex(c8601qh.m39496kk().m40765k4());
        }
        if (c8601qh.m39497to() != null) {
            C1246ib.m7610k4(shapeStyle.getFontColor(), c8601qh.m39497to().m32942x1());
            shapeStyle.setFontCollectionIndex(c8601qh.m39497to().m32938k4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71153k4(IShapeStyle iShapeStyle, AbstractC4685kk<C8601qh> abstractC4685kk) {
        if (iShapeStyle == null) {
            return;
        }
        final C8601qh c8601qhInvoke = abstractC4685kk.invoke();
        C1246ib.m7609k4(iShapeStyle.getLineColor(), new C7394ca.k4() { // from class: com.aspose.slides.tgm.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8601qhInvoke.m39495k4()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_StyleMatrixReferenceElementData.AddColor(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c8601qhInvoke.m39495k4().m40766k4(str);
            }
        });
        c8601qhInvoke.m39495k4().m40767k4(iShapeStyle.getLineStyleIndex() & 65535);
        C1246ib.m7609k4(iShapeStyle.getFillColor(), new C7394ca.k4() { // from class: com.aspose.slides.tgm.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8601qhInvoke.m39498x1()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_StyleMatrixReferenceElementData.AddColor(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c8601qhInvoke.m39498x1().m40766k4(str);
            }
        });
        c8601qhInvoke.m39498x1().m40767k4(((long) iShapeStyle.getFillStyleIndex()) & 4294967295L);
        C1246ib.m7609k4(iShapeStyle.getEffectColor(), new C7394ca.k4() { // from class: com.aspose.slides.tgm.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8601qhInvoke.m39496kk()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_StyleMatrixReferenceElementData.AddColor(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c8601qhInvoke.m39496kk().m40766k4(str);
            }
        });
        c8601qhInvoke.m39496kk().m40767k4(iShapeStyle.getEffectStyleIndex());
        C1246ib.m7609k4(iShapeStyle.getFontColor(), new C7394ca.k4() { // from class: com.aspose.slides.tgm.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8601qhInvoke.m39497to()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_FontReferenceElementData.AddColor(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c8601qhInvoke.m39497to().m32939k4(str);
            }
        });
        c8601qhInvoke.m39497to().m32940k4(iShapeStyle.getFontCollectionIndex());
    }
}
