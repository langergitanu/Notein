package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3108y2;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class xky {
    /* JADX INFO: renamed from: k4 */
    private static IFillFormatEffectiveData m73454k4(Shape shape) {
        Slide slide;
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) shape, AutoShape.class);
        IFillFormatEffectiveData fillFormat = (autoShape == null || !autoShape.getUseBackgroundFill() || autoShape.getFillFormat().getFillType() != -1 || (slide = (Slide) C7019kk.m27452k4((Object) autoShape.getSlide(), Slide.class)) == null) ? null : ((Background) slide.getBackground()).getEffective().getFillFormat();
        return fillFormat == null ? ((FillFormat) shape.getFillFormat()).getEffective() : fillFormat;
    }

    /* JADX INFO: renamed from: kk */
    private static void m73469kk(Shape shape, com.aspose.slides.internal.p332p7.rsv rsvVar, pkv pkvVar) {
        nhv.m68032k4(shape.getLineFormat().getEffective(), rsvVar, pkvVar);
    }

    /* JADX INFO: renamed from: to */
    private static TextFrame m73471to(GeometryShape geometryShape) {
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) geometryShape, AutoShape.class);
        if (autoShape != null) {
            return autoShape.m288x1();
        }
        SmartArtShape smartArtShape = (SmartArtShape) C7019kk.m27452k4((Object) geometryShape, SmartArtShape.class);
        if (smartArtShape != null) {
            return (TextFrame) smartArtShape.getTextFrame();
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m73473x1(GeometryShape geometryShape, com.aspose.slides.internal.p332p7.vtn vtnVar, pkv pkvVar) {
        final com.aspose.slides.internal.p332p7.lzc lzcVar;
        if (wgi.m72731kk(vtnVar.m43305to())) {
            lzcVar = pkvVar.m4421kk().get_Item(vtnVar.m43305to());
        } else {
            com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("pr", 10);
            vtnVar.m43302kk(lzcVarM69128k4.m36546k4());
            lzcVar = lzcVarM69128k4;
        }
        m73465k4(geometryShape, (com.aspose.slides.internal.p332p7.rsv) wgi.m72713k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVar.m36550to(), new C7394ca.k4() { // from class: com.aspose.slides.xky.14
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(lzcVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_StyleElementData.AddStyleProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return lzcVar.m36545k4(str);
            }
        }), pkvVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m73455k4(Connector connector, com.aspose.slides.internal.p332p7.p9u p9uVar, pkv pkvVar) {
        int i;
        final com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("gr", 9);
        p9uVar.m38712du(lzcVarM69128k4.m36546k4());
        com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72713k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVarM69128k4.m36550to(), new C7394ca.k4() { // from class: com.aspose.slides.xky.7
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(lzcVarM69128k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_StyleElementData.AddStyleProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return lzcVarM69128k4.m36545k4(str);
            }
        });
        int shapeType = connector.getShapeType();
        if (shapeType != 1) {
            switch (shapeType) {
                case 96:
                    i = 3;
                    p9uVar.m38718k4(i);
                    break;
                case 97:
                case 98:
                case 99:
                case 100:
                    p9uVar.m38718k4(1);
                    break;
                case 101:
                case 102:
                case 103:
                case 104:
                    i = 4;
                    p9uVar.m38718k4(i);
                    break;
            }
        }
        IShapeFrame frame = connector.getFrame();
        C4317dy c4317dy = new C4317dy(frame.getFlipH() == 1 ? -1.0f : 1.0f, 0.0f, 0.0f, frame.getFlipV() == 1 ? -1.0f : 1.0f, frame.getFlipH() == 1 ? frame.getCenterX() * 2.0f : 0.0f, frame.getFlipV() == 1 ? frame.getCenterY() * 2.0f : 0.0f);
        if (!C14064he.m66715kk(frame.getRotation())) {
            c4317dy.m17339k4((frame.getFlipH() == 1) ^ (frame.getFlipV() == 1) ? -frame.getRotation() : frame.getRotation(), new C12025x6(frame.getCenterX(), frame.getCenterY()), 0);
        }
        C3108y2.m13229x1(c4317dy).m55775k4(new C12025x6[]{new C12025x6(connector.getX(), connector.getY()), new C12025x6(connector.getWidth() + connector.getX(), connector.getHeight() + connector.getY())});
        p9uVar.m38719k4(wgi.m72717k4(r3[0].m56897x1()));
        p9uVar.m38726x1(wgi.m72717k4(r3[0].m56895kk()));
        p9uVar.m38721kk(wgi.m72717k4(r3[1].m56897x1()));
        p9uVar.m38724to(wgi.m72717k4(r3[1].m56895kk()));
        m73465k4(connector, rsvVar, pkvVar);
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m73470kk(GeometryShape geometryShape) {
        TextFrame textFrameM73471to;
        return (geometryShape.getShapeType() > -1 || (textFrameM73471to = m73471to(geometryShape)) == null || "".equals(textFrameM73471to.m2901c5())) ? false : true;
    }

    /* JADX INFO: renamed from: to */
    private static void m73472to(Shape shape, com.aspose.slides.internal.p332p7.rsv rsvVar, pkv pkvVar) {
        C13832me.m64865k4(shape.getEffectFormat().getEffective(), rsvVar, pkvVar.m69130x1());
    }

    /* JADX INFO: renamed from: x1 */
    private static void m73474x1(Shape shape, com.aspose.slides.internal.p332p7.rsv rsvVar, pkv pkvVar) {
        C14909zq.m74729k4(m73454k4(shape), new jlf(rsvVar), pkvVar.m69130x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73456k4(GeometryShape geometryShape, C7394ca.k4 k4Var, pkv pkvVar) {
        com.aspose.slides.internal.p332p7.vyd vydVarM68231k4 = C14203nw.m68231k4(geometryShape.getShapeType());
        if (vydVarM68231k4 == null) {
            if (geometryShape.m1591yj().m3311h4() != null && geometryShape.m1591yj().m3311h4().length > 0) {
                m73458k4(geometryShape, (com.aspose.slides.internal.p332p7.h7e) k4Var.mo2788k4("custom-shape").m29542x1(), pkvVar);
                return;
            }
            if (geometryShape.m1591yj().m3308ck() != -1) {
                int iM3308ck = geometryShape.m1591yj().m3308ck();
                IGeometryPath[] geometryPaths = geometryShape.getGeometryPaths();
                for (int i = 0; i < geometryPaths.length; i++) {
                    IGeometryPath iGeometryPath = geometryPaths[i];
                    for (IPathSegment iPathSegment : iGeometryPath.getPathData()) {
                        if (iPathSegment.getPathCommand() == 3) {
                            geometryPaths[i] = ShapeUtil.m2665k4(ShapeUtil.m2666k4(iGeometryPath));
                        }
                    }
                }
                geometryShape.setGeometryPaths(geometryPaths);
                m73458k4(geometryShape, (com.aspose.slides.internal.p332p7.h7e) k4Var.mo2788k4("custom-shape").m29542x1(), pkvVar);
                geometryShape.m1591yj().m3317k4(iM3308ck);
                return;
            }
            return;
        }
        final com.aspose.slides.internal.p332p7.h7e h7eVar = (com.aspose.slides.internal.p332p7.h7e) k4Var.mo2788k4("custom-shape").m29542x1();
        final com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("gr", 9);
        h7eVar.m33189h4(lzcVarM69128k4.m36546k4());
        l3r.m64280k4(geometryShape, h7eVar);
        com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72713k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVarM69128k4.m36550to(), new C7394ca.k4() { // from class: com.aspose.slides.xky.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(lzcVarM69128k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_StyleElementData.AddStyleProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return lzcVarM69128k4.m36545k4(str);
            }
        });
        m73465k4(geometryShape, rsvVar, pkvVar);
        TextFrame textFrameM73471to = m73471to(geometryShape);
        if (textFrameM73471to != null) {
            dcz.m5048k4(textFrameM73471to, new C7394ca.k4() { // from class: com.aspose.slides.xky.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(h7eVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfdraw_CT_CustomShapeElementData.AddTextElements(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return h7eVar.m33191k4(str);
                }
            }, h7eVar.m33186dy(), pkvVar);
        }
        String strM67400k4 = C14113y2.f47374k4;
        if (geometryShape.m1591yj().m3334x1() != null) {
            for (int i2 : f6b.m5913k4(geometryShape.m1591yj().m3334x1(), geometryShape.getShapeType(), geometryShape.getRawFrame().getWidth(), geometryShape.getRawFrame().getHeight())) {
                strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67408k4(" ", C13850af.m65103k4(i2)));
            }
        }
        String strM67440x1 = C14113y2.m67440x1(strM67400k4);
        if (C14113y2.m67411k4(strM67440x1)) {
            strM67440x1 = null;
        }
        vydVarM68231k4.m43423to(strM67440x1);
        rsvVar.m40518x1((byte) 0);
        h7eVar.m33193k4(vydVarM68231k4);
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m73475x1(GeometryShape geometryShape) {
        if (geometryShape.getShapeType() == 5) {
            return (geometryShape.getPlaceholder() == null && m73471to(geometryShape) == null) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73457k4(GeometryShape geometryShape, final com.aspose.slides.internal.p332p7.er2 er2Var, pkv pkvVar) {
        final com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("gr", 9);
        er2Var.m31238h4(lzcVarM69128k4.m36546k4());
        er2Var.m31247x1(wgi.m72717k4(geometryShape.getX()));
        er2Var.m31242kk(wgi.m72717k4(geometryShape.getY()));
        er2Var.m31245to(wgi.m72717k4(geometryShape.getWidth() + geometryShape.getX()));
        er2Var.m31235du(wgi.m72717k4(geometryShape.getHeight() + geometryShape.getY()));
        m73465k4(geometryShape, (com.aspose.slides.internal.p332p7.rsv) wgi.m72713k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVarM69128k4.m36550to(), new C7394ca.k4() { // from class: com.aspose.slides.xky.15
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(lzcVarM69128k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_StyleElementData.AddStyleProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return lzcVarM69128k4.m36545k4(str);
            }
        }), pkvVar);
        TextFrame textFrameM73471to = m73471to(geometryShape);
        if (textFrameM73471to != null) {
            dcz.m5048k4(textFrameM73471to, new C7394ca.k4() { // from class: com.aspose.slides.xky.16
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(er2Var) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfdraw_CT_LineElementData.AddTextElements(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return er2Var.m31239k4(str);
                }
            }, er2Var.m31243m9(), pkvVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73458k4(GeometryShape geometryShape, final com.aspose.slides.internal.p332p7.h7e h7eVar, pkv pkvVar) {
        final com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("gr", 9);
        h7eVar.m33189h4(lzcVarM69128k4.m36546k4());
        l3r.m64280k4(geometryShape, h7eVar);
        com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72713k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVarM69128k4.m36550to(), new C7394ca.k4() { // from class: com.aspose.slides.xky.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(lzcVarM69128k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_StyleElementData.AddStyleProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return lzcVarM69128k4.m36545k4(str);
            }
        });
        m73465k4(geometryShape, rsvVar, pkvVar);
        TextFrame textFrameM73471to = m73471to(geometryShape);
        if (textFrameM73471to != null) {
            dcz.m5048k4(textFrameM73471to, new C7394ca.k4() { // from class: com.aspose.slides.xky.6
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(h7eVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfdraw_CT_CustomShapeElementData.AddTextElements(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return h7eVar.m33191k4(str);
                }
            }, h7eVar.m33186dy(), pkvVar);
        }
        if (geometryShape.m1591yj().m3311h4() != null && geometryShape.m1591yj().m3311h4().length > 0) {
            C14203nw.m68232k4(geometryShape, h7eVar.m33192k4(), pkvVar);
        }
        rsvVar.m40518x1((byte) 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73459k4(GeometryShape geometryShape, final com.aspose.slides.internal.p332p7.sd3 sd3Var, pkv pkvVar) {
        final com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("gr", 9);
        sd3Var.m40948h4(lzcVarM69128k4.m36546k4());
        l3r.m64281k4(geometryShape, sd3Var);
        m73465k4(geometryShape, (com.aspose.slides.internal.p332p7.rsv) wgi.m72713k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVarM69128k4.m36550to(), new C7394ca.k4() { // from class: com.aspose.slides.xky.11
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(lzcVarM69128k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_StyleElementData.AddStyleProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return lzcVarM69128k4.m36545k4(str);
            }
        }), pkvVar);
        TextFrame textFrameM73471to = m73471to(geometryShape);
        if (textFrameM73471to != null) {
            dcz.m5048k4(textFrameM73471to, new C7394ca.k4() { // from class: com.aspose.slides.xky.12
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(sd3Var) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfdraw_CT_EllipseElementData.AddTextElements(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return sd3Var.m40950k4(str);
                }
            }, sd3Var.m40954m9(), pkvVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73460k4(GeometryShape geometryShape, com.aspose.slides.internal.p332p7.vtn vtnVar, pkv pkvVar) {
        vtnVar.m43310x1(pkvVar.m69128k4("gr", 9).m36546k4());
        l3r.m64282k4(geometryShape, vtnVar);
        TextFrame textFrameM73471to = m73471to(geometryShape);
        com.aspose.slides.internal.p332p7.pb4 pb4Var = (com.aspose.slides.internal.p332p7.pb4) vtnVar.m43297k4("text-box").m29542x1();
        if (textFrameM73471to == null) {
            throw new NullReferenceException("TextFrame can't be null here.");
        }
        if (!C14113y2.m67411k4(textFrameM73471to.m2901c5())) {
            dcz.m5050k4(textFrameM73471to, pb4Var, vtnVar, pkvVar);
        }
        m73473x1(geometryShape, vtnVar, pkvVar);
        if (vtnVar.m43301kk() == null) {
            return;
        }
        final com.aspose.slides.internal.p332p7.lzc lzcVar = pkvVar.m4421kk().get_Item(vtnVar.m43301kk());
        com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72713k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVar.m36550to(), new C7394ca.k4() { // from class: com.aspose.slides.xky.13
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(lzcVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_StyleElementData.AddStyleProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return lzcVar.m36545k4(str);
            }
        });
        if (geometryShape.getPlaceholder() != null) {
            if (C7019kk.m27469x1(geometryShape.getSlide(), Slide.class)) {
                vtnVar.m43299k4((byte) 0);
                vtnVar.m43309x1((byte) 1);
            }
            vtnVar.m43300k4(q9u.f48271m9.get_Item(Byte.valueOf(geometryShape.getPlaceholder().getType())).intValue());
        } else if (rsvVar != null) {
            rsvVar.m40480k4(1);
            rsvVar.m40472h4(1);
        }
        if (rsvVar != null) {
            rsvVar.m40518x1((byte) 0);
            rsvVar.m40479k4((byte) 0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73461k4(GeometryShape geometryShape, final com.aspose.slides.internal.p332p7.yxk yxkVar, pkv pkvVar) {
        final com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("gr", 9);
        yxkVar.m45253h4(lzcVarM69128k4.m36546k4());
        l3r.m64283k4(geometryShape, yxkVar);
        m73465k4(geometryShape, (com.aspose.slides.internal.p332p7.rsv) wgi.m72713k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVarM69128k4.m36550to(), new C7394ca.k4() { // from class: com.aspose.slides.xky.9
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(lzcVarM69128k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_StyleElementData.AddStyleProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return lzcVarM69128k4.m36545k4(str);
            }
        }), pkvVar);
        TextFrame textFrameM73471to = m73471to(geometryShape);
        if (textFrameM73471to != null) {
            dcz.m5048k4(textFrameM73471to, new C7394ca.k4() { // from class: com.aspose.slides.xky.10
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(yxkVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfdraw_CT_RectElementData.AddTextElements(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return yxkVar.m45255k4(str);
                }
            }, yxkVar.m45259m9(), pkvVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73462k4(GroupShape groupShape, final com.aspose.slides.internal.p332p7.pnk pnkVar, pkv pkvVar) {
        IGenericEnumerator<IShape> it = groupShape.getShapes().iterator();
        while (it.hasNext()) {
            try {
                m73463k4(it.next(), new C7394ca.k4() { // from class: com.aspose.slides.xky.8
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(pnkVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfdraw_CT_GElementData.AddShape(System.String)";
                    }

                    @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                    /* JADX INFO: renamed from: k4 */
                    public C7394ca mo2788k4(String str) {
                        return pnkVar.m39021k4(str);
                    }
                }, pkvVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73463k4(IShape iShape, C7394ca.k4 k4Var, pkv pkvVar) {
        GeometryShape geometryShape = (SmartArtShape) C7019kk.m27452k4((Object) iShape, SmartArtShape.class);
        if (C7019kk.m27469x1(iShape, AutoShape.class) || geometryShape != null) {
            if (geometryShape == null) {
                geometryShape = (GeometryShape) iShape;
            }
            if (geometryShape.getShapeType() == 5 && m73471to(geometryShape) == null && iShape.getPlaceholder() == null) {
                m73461k4(geometryShape, (com.aspose.slides.internal.p332p7.yxk) k4Var.mo2788k4(DrawToolFactory.LASSO_TYPE_RECT).m29542x1(), pkvVar);
                return;
            }
            if (geometryShape.getShapeType() == 35) {
                m73459k4(geometryShape, (com.aspose.slides.internal.p332p7.sd3) k4Var.mo2788k4("ellipse").m29542x1(), pkvVar);
                return;
            }
            if (m73468k4(geometryShape) && (iShape.getPlaceholder() != null || geometryShape.getFillFormat().getFillType() != 2)) {
                m73460k4(geometryShape, (com.aspose.slides.internal.p332p7.vtn) k4Var.mo2788k4("frame").m29542x1(), pkvVar);
                return;
            }
            if (geometryShape.getShapeType() == 1) {
                m73457k4(geometryShape, (com.aspose.slides.internal.p332p7.er2) k4Var.mo2788k4("line").m29542x1(), pkvVar);
                return;
            } else if (geometryShape.getShapeType() == 0) {
                m73458k4(geometryShape, (com.aspose.slides.internal.p332p7.h7e) k4Var.mo2788k4("custom-shape").m29542x1(), pkvVar);
                return;
            } else {
                m73456k4(geometryShape, k4Var, pkvVar);
                return;
            }
        }
        if (C7019kk.m27469x1(iShape, Connector.class)) {
            m73455k4((Connector) iShape, (com.aspose.slides.internal.p332p7.p9u) k4Var.mo2788k4("connector").m29542x1(), pkvVar);
            return;
        }
        if (C7019kk.m27469x1(iShape, IPictureFrame.class)) {
            com.aspose.slides.internal.p332p7.vtn vtnVar = (com.aspose.slides.internal.p332p7.vtn) k4Var.mo2788k4("frame").m29542x1();
            vtnVar.m43310x1("standard");
            IAudioFrame iAudioFrame = (IAudioFrame) C7019kk.m27452k4((Object) iShape, IAudioFrame.class);
            if (iAudioFrame != null) {
                yp7.m73978k4(iAudioFrame, vtnVar, pkvVar.m69130x1());
                return;
            }
            IVideoFrame iVideoFrame = (IVideoFrame) C7019kk.m27452k4((Object) iShape, IVideoFrame.class);
            if (iVideoFrame != null) {
                yp7.m73980k4(iVideoFrame, vtnVar, pkvVar.m69130x1());
                return;
            } else {
                m73464k4((PictureFrame) iShape, vtnVar, pkvVar);
                return;
            }
        }
        if (C7019kk.m27469x1(iShape, Table.class)) {
            com.aspose.slides.internal.p332p7.vtn vtnVar2 = (com.aspose.slides.internal.p332p7.vtn) k4Var.mo2788k4("frame").m29542x1();
            vtnVar2.m43310x1(pkvVar.m69128k4("gr", 9).m36546k4());
            l3r.m64282k4(iShape, vtnVar2);
            m73466k4((Table) iShape, (com.aspose.slides.internal.p332p7.n6p) vtnVar2.m43297k4("table").m29542x1(), pkvVar);
            return;
        }
        if (C7019kk.m27469x1(iShape, OleObjectFrame.class)) {
            com.aspose.slides.internal.p332p7.vtn vtnVar3 = (com.aspose.slides.internal.p332p7.vtn) k4Var.mo2788k4("frame").m29542x1();
            final com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("gr", 9);
            vtnVar3.m43310x1(lzcVarM69128k4.m36546k4());
            l3r.m64282k4(iShape, vtnVar3);
            com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72713k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVarM69128k4.m36550to(), new C7394ca.k4() { // from class: com.aspose.slides.xky.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(lzcVarM69128k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_StyleElementData.AddStyleProperties(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return lzcVarM69128k4.m36545k4(str);
                }
            });
            vtnVar3.m43310x1(lzcVarM69128k4.m36546k4());
            OleObjectFrame oleObjectFrame = (OleObjectFrame) iShape;
            m73465k4(oleObjectFrame, rsvVar, pkvVar);
            f6h.m6024k4(oleObjectFrame, vtnVar3, pkvVar.m69130x1());
            return;
        }
        if (!C7019kk.m27469x1(iShape, Chart.class) && !C7019kk.m27469x1(iShape, Ink.class)) {
            if (C7019kk.m27469x1(iShape, GroupShape.class) || C7019kk.m27469x1(iShape, SmartArt.class)) {
                SmartArt smartArt = (SmartArt) C7019kk.m27452k4((Object) iShape, SmartArt.class);
                GroupShape groupShapeM3354kk = smartArt != null ? smartArt.m2785up().m3354kk() : (GroupShape) iShape;
                if (groupShapeM3354kk.getShapes() != null) {
                    m73462k4(groupShapeM3354kk, (com.aspose.slides.internal.p332p7.pnk) k4Var.mo2788k4("g").m29542x1(), pkvVar);
                    return;
                }
                return;
            }
            return;
        }
        PPImage pPImage = (PPImage) iShape.getPresentation().getImages().addImage(new SvgImage(k3x.m63618k4((Shape) iShape)));
        try {
            PictureFrame pictureFrame = new PictureFrame((InterfaceC14397rj) iShape.getSlide().getShapes());
            pictureFrame.getPictureFormat().setPictureFillMode(1);
            pictureFrame.m1591yj().m3331x1(5);
            pictureFrame.setFrame(new ShapeFrame(iShape.getX(), iShape.getY(), iShape.getWidth(), iShape.getHeight(), (byte) 0, (byte) 0, 0.0f));
            pictureFrame.getPictureFormat().getPicture().setImage(pPImage);
            m73464k4(pictureFrame, (com.aspose.slides.internal.p332p7.vtn) k4Var.mo2788k4("frame").m29542x1(), pkvVar);
            ((ImageCollection) iShape.getPresentation().getImages()).m1732k4((IPPImage) pPImage);
            if (pPImage != null) {
                pPImage.dispose();
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73464k4(PictureFrame pictureFrame, com.aspose.slides.internal.p332p7.vtn vtnVar, pkv pkvVar) {
        String strM2056k4;
        String strM66952k4;
        final com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("gr", 9);
        vtnVar.m43310x1(lzcVarM69128k4.m36546k4());
        l3r.m64282k4(pictureFrame, vtnVar);
        com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72713k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVarM69128k4.m36550to(), new C7394ca.k4() { // from class: com.aspose.slides.xky.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(lzcVarM69128k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_StyleElementData.AddStyleProperties(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return lzcVarM69128k4.m36545k4(str);
            }
        });
        m73465k4(pictureFrame, rsvVar, pkvVar);
        ISlidesPicture picture = pictureFrame.getPictureFormat().getPicture();
        com.aspose.slides.internal.p332p7.cuq cuqVar = (com.aspose.slides.internal.p332p7.cuq) vtnVar.m43297k4("image").m29542x1();
        PPImage pPImage = (PPImage) picture.getImage();
        ImageCollection imageCollection = (ImageCollection) picture.getPresentation().getImages();
        if (!C14113y2.m67411k4(picture.getLinkPathLong()) && pPImage == null) {
            picture.setImage(imageCollection.m1726k4(picture.getLinkPathLong(), (Dictionary<String, IPPImage>) null));
        }
        if (pPImage != null && !tta.m71309k4(picture.getImageTransform()) && (picture.getImageTransform().size() > 1 || !C7019kk.m27469x1(picture.getImageTransform().get_Item(0), AlphaModulateFixed.class))) {
            FillFormat fillFormat = new FillFormat(pictureFrame);
            fillFormat.setFillType((byte) 4);
            ((PictureFillFormat) fillFormat.getPictureFillFormat()).m2252k4((PictureFillFormat) pictureFrame.getPictureFormat());
            byte[] bArrM27674du = ((ku2) fillFormat.m1454dy().getPictureFillFormat().getPicture()).m64176k4((kg7) null, new C7134m9[]{null}).m27674du();
            if (pkvVar.m69130x1().m2048fa()) {
                strM66952k4 = C14080ne.m66952k4(bArrM27674du);
                cuqVar.m29928x1(strM66952k4);
            } else {
                cuqVar.m29924k4(1);
                cuqVar.m29927x1(1);
                strM2056k4 = pkvVar.m69130x1().m2052k4(PPImage.m2114k4(bArrM27674du), PPImage.m2121x1(bArrM27674du).mo55273k4(), bArrM27674du, null);
                cuqVar.m29925k4(strM2056k4);
            }
        } else if (pkvVar.m69130x1().m2048fa()) {
            if (!C14113y2.m67411k4(picture.getLinkPathLong()) && picture.getImage() == null) {
                picture.setImage(imageCollection.m1726k4(picture.getLinkPathLong(), (Dictionary<String, IPPImage>) null));
            }
            strM66952k4 = pPImage != null ? C14080ne.m66952k4(pPImage.getBinaryData()) : C14080ne.m66952k4(imageCollection.m1717k4().getBinaryData());
            cuqVar.m29928x1(strM66952k4);
        } else {
            cuqVar.m29924k4(1);
            cuqVar.m29927x1(1);
            if (pPImage != null) {
                strM2056k4 = pkvVar.m69130x1().m2056k4(pPImage);
            } else if (C14113y2.m67411k4(picture.getLinkPathLong())) {
                strM2056k4 = pkvVar.m69130x1().m2056k4((PPImage) imageCollection.m1717k4());
            } else {
                strM2056k4 = picture.getLinkPathLong();
                try {
                    strM2056k4 = new C14062gk(strM2056k4).m66697x1();
                } catch (RuntimeException e) {
                    C3085sv.m13082k4(e);
                }
            }
            cuqVar.m29925k4(strM2056k4);
        }
        m73467k4(rsvVar, pictureFrame);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73465k4(Shape shape, com.aspose.slides.internal.p332p7.rsv rsvVar, pkv pkvVar) {
        m73474x1(shape, rsvVar, pkvVar);
        m73469kk(shape, rsvVar, pkvVar);
        m73472to(shape, rsvVar, pkvVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73466k4(Table table, com.aspose.slides.internal.p332p7.n6p n6pVar, pkv pkvVar) {
        qca.m69537k4(table, n6pVar, pkvVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x009e, code lost:
    
        r2 = (com.aspose.slides.AlphaModulateFixed) r2;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m73467k4(com.aspose.slides.internal.p332p7.rsv rsvVar, PictureFrame pictureFrame) {
        AlphaModulateFixed alphaModulateFixed;
        PictureFillFormat pictureFillFormat = (PictureFillFormat) pictureFrame.getPictureFormat();
        PPImage pPImage = (PPImage) pictureFillFormat.getPicture().getImage();
        xmh xmhVarClone = xmh.m73497x1(pictureFillFormat.m2256to().m69114k4(), 100.0d).Clone();
        if (pPImage != null && xmh.m73498x1(xmhVarClone, xmh.f50156k4)) {
            float width = (pPImage.getWidth() / pPImage.m2123c5().m56897x1()) * 2.54f;
            double height = (pPImage.getHeight() / pPImage.m2123c5().m56895kk()) * 2.54f;
            double d = width;
            rsvVar.m40505um(C14113y2.m67391k4(C11697x1.m55250kk(), "rect({0}cm, {1}cm, {2}cm, {3}cm)", Double.valueOf(xmhVarClone.f50158kk * height), Double.valueOf(xmhVarClone.f50159to * d), Double.valueOf(height * xmhVarClone.f50157du), Double.valueOf(d * xmhVarClone.f50160x1)));
        }
        IGenericEnumerator<IImageTransformOperation> it = pictureFillFormat.getPicture().getImageTransform().iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    alphaModulateFixed = null;
                    break;
                } else {
                    IImageTransformOperation next = it.next();
                    if (C7019kk.m27469x1(next, AlphaModulateFixed.class)) {
                        break;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (alphaModulateFixed != null) {
            rsvVar.m40455c5(C14113y2.m67402k4("{0}%", Float.valueOf(alphaModulateFixed.getAmount())));
        }
        String strM67400k4 = pictureFrame.getFrame().getFlipH() == 1 ? C14113y2.m67400k4("", "horizontal") : "";
        if (pictureFrame.getFrame().getFlipV() == 1) {
            strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67408k4(" ", "vertical"));
        }
        if (C14113y2.m67411k4(strM67400k4)) {
            return;
        }
        rsvVar.m40448ar(C14113y2.m67440x1(strM67400k4));
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m73468k4(GeometryShape geometryShape) {
        return m73475x1(geometryShape) || m73470kk(geometryShape);
    }
}
