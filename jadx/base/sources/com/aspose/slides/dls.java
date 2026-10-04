package com.aspose.slides;

import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
class dls {
    /* JADX INFO: renamed from: k4 */
    private static ColorFormat m5137k4(Background background) {
        if (background.getType() == 0) {
            return (ColorFormat) background.getStyleColor();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static ColorFormat m5138k4(Cell cell, InterfaceC14376r6 interfaceC14376r6) {
        IColorFormat iColorFormatM71662m9;
        if (C7019kk.m27469x1(interfaceC14376r6, TextStyle.class) || C7019kk.m27469x1(interfaceC14376r6, TextFrameFormat.class) || C7019kk.m27469x1(interfaceC14376r6, ParagraphFormat.class) || C7019kk.m27469x1(interfaceC14376r6, PortionFormat.class) || C7019kk.m27469x1(interfaceC14376r6, BulletFormat.class)) {
            if (cell.m464fa().m73908x1() == null || cell.m464fa().m73908x1().m71662m9().getColorType() != 3) {
                return null;
            }
            iColorFormatM71662m9 = cell.m464fa().m73908x1().m71662m9();
        } else {
            if ((!C7019kk.m27469x1(interfaceC14376r6, FillFormat.class) && !C7019kk.m27469x1(interfaceC14376r6, LineFormat.class) && !C7019kk.m27469x1(interfaceC14376r6, CellFormat.class)) || cell.m464fa().m73904k4() == null || cell.m464fa().m73904k4().m6069to() != 2) {
                return null;
            }
            iColorFormatM71662m9 = cell.m464fa().m73904k4().m6068kk();
        }
        return (ColorFormat) iColorFormatM71662m9;
    }

    /* JADX INFO: renamed from: k4 */
    private static ColorFormat m5139k4(IGeometryShape iGeometryShape, InterfaceC14376r6 interfaceC14376r6) {
        IColorFormat fontColor;
        if (C7019kk.m27469x1(interfaceC14376r6, FillFormat.class)) {
            if (iGeometryShape.getShapeStyle() == null) {
                return null;
            }
            fontColor = iGeometryShape.getShapeStyle().getFillColor();
        } else if (C7019kk.m27469x1(interfaceC14376r6, LineFormat.class)) {
            if (iGeometryShape.getShapeStyle() == null) {
                return null;
            }
            fontColor = iGeometryShape.getShapeStyle().getLineColor();
        } else if (C7019kk.m27469x1(interfaceC14376r6, EffectFormat.class)) {
            if (iGeometryShape.getShapeStyle() == null) {
                return null;
            }
            fontColor = iGeometryShape.getShapeStyle().getEffectColor();
        } else {
            if (!C7019kk.m27469x1(interfaceC14376r6, TextFrameFormat.class) && !C7019kk.m27469x1(interfaceC14376r6, TextStyle.class) && !C7019kk.m27469x1(interfaceC14376r6, ParagraphFormat.class) && !C7019kk.m27469x1(interfaceC14376r6, PortionFormat.class) && !C7019kk.m27469x1(interfaceC14376r6, BulletFormat.class)) {
                if (C7019kk.m27469x1(interfaceC14376r6, ThreeDFormat.class)) {
                    return null;
                }
                C7019kk.m27469x1(interfaceC14376r6, ImageTransformOperation.class);
                return null;
            }
            if (iGeometryShape.getShapeStyle() == null) {
                return null;
            }
            fontColor = iGeometryShape.getShapeStyle().getFontColor();
        }
        return (ColorFormat) fontColor;
    }

    /* JADX INFO: renamed from: k4 */
    public static ColorFormat m5140k4(InterfaceC14376r6 interfaceC14376r6) {
        Paragraph paragraphM2282fa;
        TextFrame textFrameM2179kk;
        ParagraphCollection paragraphCollectionM2154ck;
        IPresentationComponent parent_IPresentationComponent = interfaceC14376r6.getParent_IPresentationComponent();
        if (!C7019kk.m27469x1(parent_IPresentationComponent, TextFrame.class) && !C7019kk.m27469x1(parent_IPresentationComponent, Paragraph.class) && !C7019kk.m27469x1(parent_IPresentationComponent, Portion.class) && !C7019kk.m27469x1(parent_IPresentationComponent, Field.class)) {
            if (C7019kk.m27469x1(parent_IPresentationComponent, Cell.class)) {
                return m5138k4((Cell) parent_IPresentationComponent, interfaceC14376r6);
            }
            if (C7019kk.m27469x1(parent_IPresentationComponent, GeometryShape.class)) {
                return m5139k4((IGeometryShape) parent_IPresentationComponent, interfaceC14376r6);
            }
            if (C7019kk.m27469x1(parent_IPresentationComponent, Background.class)) {
                return m5137k4((Background) parent_IPresentationComponent);
            }
            return null;
        }
        if (C7019kk.m27469x1(parent_IPresentationComponent, TextFrame.class)) {
            textFrameM2179kk = (TextFrame) parent_IPresentationComponent;
        } else {
            if (C7019kk.m27469x1(parent_IPresentationComponent, Paragraph.class)) {
                paragraphM2282fa = (Paragraph) parent_IPresentationComponent;
            } else {
                Portion portionM1446kk = C7019kk.m27469x1(parent_IPresentationComponent, Portion.class) ? (Portion) parent_IPresentationComponent : C7019kk.m27469x1(parent_IPresentationComponent, Field.class) ? ((Field) parent_IPresentationComponent).m1446kk() : null;
                if (portionM1446kk == null) {
                    throw new NullReferenceException("Portion couldn't be empty.");
                }
                paragraphM2282fa = portionM1446kk.m2282fa();
            }
            textFrameM2179kk = (paragraphM2282fa == null || (paragraphCollectionM2154ck = paragraphM2282fa.m2154ck()) == null) ? null : paragraphCollectionM2154ck.m2179kk();
        }
        if (textFrameM2179kk == null) {
            return null;
        }
        InterfaceC14397rj parent_Immediate = textFrameM2179kk.getParent_Immediate();
        if (C7019kk.m27469x1(parent_Immediate, GeometryShape.class)) {
            return m5139k4((GeometryShape) parent_Immediate, interfaceC14376r6);
        }
        if (C7019kk.m27469x1(parent_Immediate, Cell.class)) {
            return m5138k4((Cell) parent_Immediate, interfaceC14376r6);
        }
        return null;
    }
}
