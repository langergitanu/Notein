package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.facebook.common.callercontext.ContextChain;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class mxr {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<String, AbstractC14159k4> f47453k4;

    /* JADX INFO: renamed from: com.aspose.slides.mxr$k4 */
    public static abstract class AbstractC14159k4 extends AbstractC14085qw {
        private AbstractC14159k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public abstract Shape mo67810k4(ShapeCollection shapeCollection, Object obj, wxb wxbVar);
    }

    static {
        Dictionary<String, AbstractC14159k4> dictionary = new Dictionary<>();
        f47453k4 = dictionary;
        dictionary.set_Item(DrawToolFactory.LASSO_TYPE_RECT, new AbstractC14159k4() { // from class: com.aspose.slides.mxr.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ShapeOdpDeserialization.LoadRectShape(Aspose.Slides.ShapeCollection,System.Object,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext)";
            }

            @Override // com.aspose.slides.mxr.AbstractC14159k4
            /* JADX INFO: renamed from: k4 */
            public Shape mo67810k4(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
                return mxr.m67770fa(shapeCollection, obj, wxbVar);
            }
        });
        dictionary.set_Item("ellipse", new AbstractC14159k4() { // from class: com.aspose.slides.mxr.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ShapeOdpDeserialization.LoadEllipseShape(Aspose.Slides.ShapeCollection,System.Object,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext)";
            }

            @Override // com.aspose.slides.mxr.AbstractC14159k4
            /* JADX INFO: renamed from: k4 */
            public Shape mo67810k4(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
                return mxr.m67803up(shapeCollection, obj, wxbVar);
            }
        });
        dictionary.set_Item("circle", new AbstractC14159k4() { // from class: com.aspose.slides.mxr.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ShapeOdpDeserialization.LoadCircleShape(Aspose.Slides.ShapeCollection,System.Object,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext)";
            }

            @Override // com.aspose.slides.mxr.AbstractC14159k4
            /* JADX INFO: renamed from: k4 */
            public Shape mo67810k4(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
                return mxr.m67809yj(shapeCollection, obj, wxbVar);
            }
        });
        dictionary.set_Item("frame", new AbstractC14159k4() { // from class: com.aspose.slides.mxr.6
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ShapeOdpDeserialization.LoadFrameShape(Aspose.Slides.ShapeCollection,System.Object,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext)";
            }

            @Override // com.aspose.slides.mxr.AbstractC14159k4
            /* JADX INFO: renamed from: k4 */
            public Shape mo67810k4(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
                return mxr.m67797ks(shapeCollection, obj, wxbVar);
            }
        });
        dictionary.set_Item("line", new AbstractC14159k4() { // from class: com.aspose.slides.mxr.7
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ShapeOdpDeserialization.LoadLineShape(Aspose.Slides.ShapeCollection,System.Object,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext)";
            }

            @Override // com.aspose.slides.mxr.AbstractC14159k4
            /* JADX INFO: renamed from: k4 */
            public Shape mo67810k4(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
                return mxr.m67800rv(shapeCollection, obj, wxbVar);
            }
        });
        dictionary.set_Item("path", new AbstractC14159k4() { // from class: com.aspose.slides.mxr.8
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ShapeOdpDeserialization.LoadPathShape(Aspose.Slides.ShapeCollection,System.Object,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext)";
            }

            @Override // com.aspose.slides.mxr.AbstractC14159k4
            /* JADX INFO: renamed from: k4 */
            public Shape mo67810k4(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
                return mxr.m67808x6(shapeCollection, obj, wxbVar);
            }
        });
        dictionary.set_Item("polygon", new AbstractC14159k4() { // from class: com.aspose.slides.mxr.9
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ShapeOdpDeserialization.LoadPolygonShape(Aspose.Slides.ShapeCollection,System.Object,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext)";
            }

            @Override // com.aspose.slides.mxr.AbstractC14159k4
            /* JADX INFO: renamed from: k4 */
            public Shape mo67810k4(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
                return mxr.m67799ne(shapeCollection, obj, wxbVar);
            }
        });
        dictionary.set_Item("custom-shape", new AbstractC14159k4() { // from class: com.aspose.slides.mxr.10
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ShapeOdpDeserialization.LoadCustomShape(Aspose.Slides.ShapeCollection,System.Object,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext)";
            }

            @Override // com.aspose.slides.mxr.AbstractC14159k4
            /* JADX INFO: renamed from: k4 */
            public Shape mo67810k4(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
                return mxr.m67772ix(shapeCollection, obj, wxbVar);
            }
        });
        dictionary.set_Item("connector", new AbstractC14159k4() { // from class: com.aspose.slides.mxr.11
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ShapeOdpDeserialization.LoadConnectorShape(Aspose.Slides.ShapeCollection,System.Object,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext)";
            }

            @Override // com.aspose.slides.mxr.AbstractC14159k4
            /* JADX INFO: renamed from: k4 */
            public Shape mo67810k4(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
                return mxr.m67802u4(shapeCollection, obj, wxbVar);
            }
        });
        dictionary.set_Item("g", new AbstractC14159k4() { // from class: com.aspose.slides.mxr.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ShapeOdpDeserialization.LoadGroupShape(Aspose.Slides.ShapeCollection,System.Object,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext)";
            }

            @Override // com.aspose.slides.mxr.AbstractC14159k4
            /* JADX INFO: renamed from: k4 */
            public Shape mo67810k4(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
                return mxr.m67804uz(shapeCollection, obj, wxbVar);
            }
        });
        dictionary.set_Item("table:table", new AbstractC14159k4() { // from class: com.aspose.slides.mxr.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.OdpSerialization.PartParser.ShapeOdpDeserialization.LoadTable(Aspose.Slides.ShapeCollection,System.Object,Aspose.Slides.OdpSerialization.OdpStylesDeserializationContext)";
            }

            @Override // com.aspose.slides.mxr.AbstractC14159k4
            /* JADX INFO: renamed from: k4 */
            public Shape mo67810k4(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
                return mxr.m67805wl(shapeCollection, obj, wxbVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fa */
    public static Shape m67770fa(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.yxk yxkVar = (com.aspose.slides.internal.p332p7.yxk) C7019kk.m27452k4(obj, com.aspose.slides.internal.p332p7.yxk.class);
        if (yxkVar == null) {
            throw new InvalidOperationException();
        }
        C12007ix c12007ixClone = wgi.m72716k4(yxkVar.m45256k4(), yxkVar.m45263x1(), yxkVar.m45257kk(), yxkVar.m45261to()).Clone();
        AutoShape autoShape = (AutoShape) shapeCollection.addAutoShape(5, c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), true);
        nh5 nh5Var = new nh5(yxkVar);
        yup.m74101k4((TextFrame) autoShape.getTextFrame(), wxbVar);
        yup.m74099k4((TextFrame) autoShape.getTextFrame(), nh5Var, wxbVar);
        m67790k4((TextFrame) autoShape.getTextFrame(), new nh5(yxkVar), yxkVar.m45248ck(), wxbVar, gga.m6641x1());
        m67783k4(autoShape, yxkVar.m45259m9(), wxbVar);
        m67783k4(autoShape, yxkVar.m45251dy(), wxbVar);
        m67784k4((IShape) autoShape, yxkVar.m45252h4(), wxbVar);
        if (wgi.m72731kk(yxkVar.m45247c5())) {
            m67786k4((Shape) autoShape, yxkVar.m45247c5(), wxbVar);
        }
        m67794k4(yxkVar.m45249du(), autoShape, wxbVar);
        return autoShape;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ix */
    public static Shape m67772ix(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.h7e h7eVar = (com.aspose.slides.internal.p332p7.h7e) C7019kk.m27452k4(obj, com.aspose.slides.internal.p332p7.h7e.class);
        if (h7eVar == null) {
            throw new InvalidOperationException();
        }
        Shape shapeM7728k4 = C1259in.m7728k4(shapeCollection, h7eVar, wxbVar);
        if (wgi.m72731kk(h7eVar.m33190jd())) {
            m67786k4(shapeM7728k4, h7eVar.m33190jd(), wxbVar);
        }
        m67794k4(h7eVar.m33188h4(), shapeM7728k4, wxbVar);
        return shapeM7728k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m67774k4(com.aspose.slides.internal.p332p7.pb4 pb4Var, com.aspose.slides.internal.p332p7.vtn vtnVar, wxb wxbVar, List<C7394ca>[] listArr) {
        listArr[0] = pb4Var.m38779k4();
        if (!dmj.m5159k4(vtnVar, pb4Var, wxbVar.m72957k4().m69951k4().getDocumentProperties().getNameOfApplication())) {
            return 1;
        }
        listArr[0] = dmj.m5158k4(listArr[0]);
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ks */
    public static Shape m67797ks(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.vtn vtnVar = (com.aspose.slides.internal.p332p7.vtn) C7019kk.m27452k4(obj, com.aspose.slides.internal.p332p7.vtn.class);
        if (vtnVar == null) {
            throw new InvalidOperationException();
        }
        Shape shapeM67778k4 = m67778k4(shapeCollection, vtnVar, wxbVar);
        if (shapeM67778k4 == null) {
            shapeM67778k4 = m67806x1(shapeCollection, vtnVar, wxbVar);
        }
        return m67775k4(shapeM67778k4, vtnVar, wxbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ne */
    public static Shape m67799ne(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.z4k z4kVar = (com.aspose.slides.internal.p332p7.z4k) C7019kk.m27452k4(obj, com.aspose.slides.internal.p332p7.z4k.class);
        if (z4kVar == null) {
            throw new InvalidOperationException();
        }
        C12007ix c12007ixClone = wgi.m72716k4(z4kVar.m45481x1(), z4kVar.m45478kk(), z4kVar.m45480to(), z4kVar.m45473du()).Clone();
        AutoShape autoShape = (AutoShape) shapeCollection.addAutoShape(1, c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), true);
        C0733a5.m3234k4(autoShape, z4kVar);
        m67783k4(autoShape, z4kVar.m45471c5(), wxbVar);
        m67783k4(autoShape, z4kVar.m45476jd(), wxbVar);
        m67784k4((IShape) autoShape, z4kVar.m45474dy(), wxbVar);
        if (wgi.m72731kk(z4kVar.m45472ck())) {
            m67786k4((Shape) autoShape, z4kVar.m45472ck(), wxbVar);
        }
        m67794k4(z4kVar.m45479m9(), autoShape, wxbVar);
        return autoShape;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: rv */
    public static Shape m67800rv(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.er2 er2Var = (com.aspose.slides.internal.p332p7.er2) C7019kk.m27452k4(obj, com.aspose.slides.internal.p332p7.er2.class);
        if (er2Var == null) {
            throw new InvalidOperationException();
        }
        C12007ix c12007ixClone = m67781k4((float) wgi.m72703h4(er2Var.m31240k4()), (float) wgi.m72703h4(er2Var.m31241kk()), (float) wgi.m72703h4(er2Var.m31246x1()), (float) wgi.m72703h4(er2Var.m31244to())).Clone();
        AutoShape autoShape = (AutoShape) shapeCollection.addAutoShape(1, c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), C14116yg.m67480k4(c12007ixClone.m56575x1()), true);
        if (c12007ixClone.m56575x1() < 0.0f) {
            ShapeFrame shapeFrameM2593xk = autoShape.m2593xk();
            autoShape.m2559k4(new ShapeFrame(shapeFrameM2593xk.getX(), shapeFrameM2593xk.getY(), shapeFrameM2593xk.getWidth(), shapeFrameM2593xk.getHeight(), shapeFrameM2593xk.getFlipH(), (byte) 1, shapeFrameM2593xk.getRotation()));
        }
        m67783k4(autoShape, er2Var.m31243m9(), wxbVar);
        m67783k4(autoShape, er2Var.m31236dy(), wxbVar);
        m67784k4((IShape) autoShape, er2Var.m31237h4(), wxbVar);
        m67794k4(er2Var.m31234du(), autoShape, wxbVar);
        return autoShape;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public static Shape m67802u4(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.p9u p9uVar = (com.aspose.slides.internal.p332p7.p9u) C7019kk.m27452k4(obj, com.aspose.slides.internal.p332p7.p9u.class);
        if (p9uVar == null) {
            throw new InvalidOperationException();
        }
        Shape shapeM74781k4 = C14912zs.m74781k4(shapeCollection, p9uVar, wxbVar);
        m67784k4((IShape) shapeM74781k4, p9uVar.m38710ck(), wxbVar);
        m67794k4(p9uVar.m38716jd(), shapeM74781k4, wxbVar);
        return shapeM74781k4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: up */
    public static Shape m67803up(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.sd3 sd3Var = (com.aspose.slides.internal.p332p7.sd3) C7019kk.m27452k4(obj, com.aspose.slides.internal.p332p7.sd3.class);
        if (sd3Var == null) {
            throw new InvalidOperationException();
        }
        C12007ix c12007ixClone = wgi.m72716k4(sd3Var.m40951k4(), sd3Var.m40958x1(), sd3Var.m40952kk(), sd3Var.m40956to()).Clone();
        AutoShape autoShape = (AutoShape) shapeCollection.addAutoShape(35, c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), true);
        nh5 nh5Var = new nh5(sd3Var);
        yup.m74101k4((TextFrame) autoShape.getTextFrame(), wxbVar);
        yup.m74099k4((TextFrame) autoShape.getTextFrame(), nh5Var, wxbVar);
        m67790k4((TextFrame) autoShape.getTextFrame(), new nh5(sd3Var), sd3Var.m40943ck(), wxbVar, gga.m6641x1());
        m67783k4(autoShape, sd3Var.m40954m9(), wxbVar);
        m67783k4(autoShape, sd3Var.m40946dy(), wxbVar);
        m67784k4((IShape) autoShape, sd3Var.m40947h4(), wxbVar);
        if (wgi.m72731kk(sd3Var.m40942c5())) {
            m67786k4((Shape) autoShape, sd3Var.m40942c5(), wxbVar);
        }
        m67794k4(sd3Var.m40944du(), autoShape, wxbVar);
        return autoShape;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: uz */
    public static Shape m67804uz(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.pnk pnkVar = (com.aspose.slides.internal.p332p7.pnk) C7019kk.m27452k4(obj, com.aspose.slides.internal.p332p7.pnk.class);
        if (pnkVar == null) {
            throw new InvalidOperationException();
        }
        GroupShape groupShape = (GroupShape) shapeCollection.addGroupShape();
        m67794k4(pnkVar.m39024x1(), groupShape, wxbVar);
        if (wgi.m72731kk(pnkVar.m39022k4())) {
            groupShape.setName(pnkVar.m39022k4());
        }
        List.Enumerator<C7394ca> it = pnkVar.m39023kk().iterator();
        while (it.hasNext()) {
            try {
                m67788k4((ShapeCollection) groupShape.getShapes(), it.next(), wxbVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: wl */
    public static Shape m67805wl(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.z4k z4kVar = (com.aspose.slides.internal.p332p7.z4k) C7019kk.m27452k4(obj, com.aspose.slides.internal.p332p7.z4k.class);
        if (z4kVar == null) {
            throw new InvalidOperationException();
        }
        C12007ix c12007ixClone = wgi.m72716k4(z4kVar.m45481x1(), z4kVar.m45478kk(), z4kVar.m45480to(), z4kVar.m45473du()).Clone();
        AutoShape autoShape = (AutoShape) shapeCollection.addAutoShape(1, c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), true);
        C0733a5.m3234k4(autoShape, z4kVar);
        m67783k4(autoShape, z4kVar.m45471c5(), wxbVar);
        m67784k4((IShape) autoShape, z4kVar.m45474dy(), wxbVar);
        m67794k4(z4kVar.m45479m9(), autoShape, wxbVar);
        return autoShape;
    }

    /* JADX INFO: renamed from: x1 */
    private static Shape m67806x1(ShapeCollection shapeCollection, com.aspose.slides.internal.p332p7.vtn vtnVar, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.vtn vtnVar2;
        wxb wxbVar2;
        C12007ix c12007ixClone = wgi.m72716k4(vtnVar.m43291dy(), vtnVar.m43286c5(), vtnVar.m43296jd(), vtnVar.m43288ck()).Clone();
        AutoShape autoShape = (AutoShape) shapeCollection.addAutoShape(5, c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), false);
        autoShape.addTextFrame("");
        com.aspose.slides.internal.p332p7.pb4 pb4VarM67780k4 = m67780k4(vtnVar.m43311yj());
        if (pb4VarM67780k4 != null) {
            vtnVar2 = vtnVar;
            wxbVar2 = wxbVar;
            m67787k4(shapeCollection, autoShape, new nh5(vtnVar), pb4VarM67780k4, vtnVar2, wxbVar2);
        } else {
            vtnVar2 = vtnVar;
            wxbVar2 = wxbVar;
        }
        m67783k4(autoShape, vtnVar2.m43301kk(), wxbVar2);
        m67783k4(autoShape, vtnVar2.m43305to(), wxbVar2);
        m67784k4((IShape) autoShape, vtnVar2.m43308x1(), wxbVar2);
        return autoShape;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x6 */
    public static Shape m67808x6(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.tzu tzuVar = (com.aspose.slides.internal.p332p7.tzu) C7019kk.m27452k4(obj, com.aspose.slides.internal.p332p7.tzu.class);
        if (tzuVar == null) {
            throw new InvalidOperationException();
        }
        C12007ix c12007ixClone = wgi.m72716k4(tzuVar.m42055x1(), tzuVar.m42052kk(), tzuVar.m42054to(), tzuVar.m42047du()).Clone();
        AutoShape autoShape = (AutoShape) shapeCollection.addAutoShape(0, c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), true);
        C0733a5.m3233k4(autoShape, tzuVar, wxbVar);
        m67783k4(autoShape, tzuVar.m42045c5(), wxbVar);
        m67783k4(autoShape, tzuVar.m42050jd(), wxbVar);
        m67784k4((IShape) autoShape, tzuVar.m42048dy(), wxbVar);
        if (wgi.m72731kk(tzuVar.m42046ck())) {
            m67786k4((Shape) autoShape, tzuVar.m42046ck(), wxbVar);
        }
        m67794k4(tzuVar.m42053m9(), autoShape, wxbVar);
        return autoShape;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: yj */
    public static Shape m67809yj(ShapeCollection shapeCollection, Object obj, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.fmt fmtVar = (com.aspose.slides.internal.p332p7.fmt) C7019kk.m27452k4(obj, com.aspose.slides.internal.p332p7.fmt.class);
        if (fmtVar == null) {
            throw new InvalidOperationException();
        }
        C12007ix c12007ixClone = wgi.m72716k4(fmtVar.m31912k4(), fmtVar.m31916x1(), fmtVar.m31913kk(), fmtVar.m31915to()).Clone();
        AutoShape autoShape = (AutoShape) shapeCollection.addAutoShape(35, c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), true);
        nh5 nh5Var = new nh5(fmtVar);
        yup.m74101k4((TextFrame) autoShape.getTextFrame(), wxbVar);
        yup.m74099k4((TextFrame) autoShape.getTextFrame(), nh5Var, wxbVar);
        m67790k4((TextFrame) autoShape.getTextFrame(), new nh5(fmtVar), fmtVar.m31907ck(), wxbVar, gga.m6641x1());
        m67783k4(autoShape, fmtVar.m31914m9(), wxbVar);
        m67783k4(autoShape, fmtVar.m31909dy(), wxbVar);
        m67784k4((IShape) autoShape, fmtVar.m31910h4(), wxbVar);
        if (wgi.m72731kk(fmtVar.m31906c5())) {
            m67786k4((Shape) autoShape, fmtVar.m31906c5(), wxbVar);
        }
        m67794k4(fmtVar.m31908du(), autoShape, wxbVar);
        return autoShape;
    }

    /* JADX INFO: renamed from: k4 */
    private static Shape m67775k4(Shape shape, com.aspose.slides.internal.p332p7.vtn vtnVar, wxb wxbVar) {
        m67793k4(vtnVar, shape, wxbVar);
        if (wgi.m72731kk(vtnVar.m43289du())) {
            m67786k4(shape, vtnVar.m43289du(), wxbVar);
        }
        m67794k4(vtnVar.m43298k4(), shape, wxbVar);
        return shape;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Shape m67776k4(ShapeCollection shapeCollection, com.aspose.slides.internal.p332p7.vtn vtnVar, com.aspose.slides.internal.p332p7.cuq cuqVar, wxb wxbVar) {
        byte[] bArrM66934jd;
        IPPImage iPPImageAddImage;
        Shape shape;
        C12007ix c12007ixClone = wgi.m72716k4(vtnVar.m43291dy(), vtnVar.m43286c5(), vtnVar.m43296jd(), vtnVar.m43288ck()).Clone();
        if (wgi.m72731kk(cuqVar.m29926x1())) {
            try {
                bArrM66934jd = C14080ne.m66934jd(cuqVar.m29926x1());
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
            }
            iPPImageAddImage = (bArrM66934jd == null || bArrM66934jd.length <= 0) ? null : wxbVar.m72957k4().m69951k4().getImages().addImage(bArrM66934jd);
        }
        if (iPPImageAddImage == null) {
            iPPImageAddImage = wxbVar.m72957k4().m69949k4(cuqVar.m29923k4());
        }
        IPPImage iPPImage = iPPImageAddImage;
        if (iPPImage != null) {
            Shape shape2 = (Shape) shapeCollection.addPictureFrame(5, c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), iPPImage);
            PictureFrame pictureFrame = (PictureFrame) shape2;
            ((GeometryShape) pictureFrame).f2388du = null;
            pictureFrame.getLineFormat().getFillFormat().setFillType((byte) 0);
            ((Picture) pictureFrame.getPictureFormat().getPicture()).m2241x1().m63575k4(true);
            shape = shape2;
        } else {
            PictureFrame pictureFrameM2653x6 = shapeCollection.m2653x6();
            pictureFrameM2653x6.setFrame(new ShapeFrame(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), (byte) 0, (byte) 0, 0.0f));
            ((GeometryShape) pictureFrameM2653x6).f2388du = null;
            pictureFrameM2653x6.setShapeType(5);
            pictureFrameM2653x6.getLineFormat().getFillFormat().setFillType((byte) 0);
            pictureFrameM2653x6.getPictureFormat().setPictureFillMode(1);
            try {
                C14062gk c14062gk = new C14062gk(cuqVar.m29923k4());
                ((Picture) pictureFrameM2653x6.getPictureFormat().getPicture()).m2239k4(c14062gk.m66679dy() ? c14062gk.m66677ck() : c14062gk.m66697x1());
                shape = pictureFrameM2653x6;
            } catch (RuntimeException e2) {
                ((Picture) pictureFrameM2653x6.getPictureFormat().getPicture()).m2239k4(cuqVar.m29923k4());
                C3085sv.m13082k4(e2);
                shape = pictureFrameM2653x6;
            }
        }
        if (wgi.m72731kk(vtnVar.m43294h4())) {
            shape.setName(vtnVar.m43294h4());
        }
        return shape;
    }

    /* JADX INFO: renamed from: k4 */
    private static Shape m67777k4(ShapeCollection shapeCollection, com.aspose.slides.internal.p332p7.vtn vtnVar, com.aspose.slides.internal.p332p7.n6p n6pVar, wxb wxbVar) {
        Table table = (Table) ei2.m5548k4(shapeCollection, vtnVar, n6pVar, wxbVar);
        m67784k4((IShape) table, vtnVar.m43308x1(), wxbVar);
        return table;
    }

    /* JADX INFO: renamed from: k4 */
    private static Shape m67778k4(ShapeCollection shapeCollection, com.aspose.slides.internal.p332p7.vtn vtnVar, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.n6p n6pVar = (com.aspose.slides.internal.p332p7.n6p) wgi.m72712k4(com.aspose.slides.internal.p332p7.n6p.class, "table", vtnVar.m43311yj());
        if (n6pVar != null) {
            return m67777k4(shapeCollection, vtnVar, n6pVar, wxbVar);
        }
        com.aspose.slides.internal.p332p7.ez3 ez3Var = (com.aspose.slides.internal.p332p7.ez3) wgi.m72712k4(com.aspose.slides.internal.p332p7.ez3.class, "object-ole", vtnVar.m43311yj());
        if (ez3Var != null) {
            return ge2.m6511k4(shapeCollection, vtnVar, ez3Var, wxbVar.m72957k4());
        }
        com.aspose.slides.internal.p332p7.vcq vcqVar = (com.aspose.slides.internal.p332p7.vcq) wgi.m72712k4(com.aspose.slides.internal.p332p7.vcq.class, "object", vtnVar.m43311yj());
        if (vcqVar != null) {
            Chart chartM7398k4 = C1237i3.m7398k4(shapeCollection, vtnVar, vcqVar, wxbVar.m72957k4());
            return chartM7398k4 != null ? chartM7398k4 : ge2.m6512k4(shapeCollection, vtnVar, vcqVar, wxbVar.m72957k4());
        }
        com.aspose.slides.internal.p332p7.gqr gqrVar = (com.aspose.slides.internal.p332p7.gqr) wgi.m72712k4(com.aspose.slides.internal.p332p7.gqr.class, "plugin", vtnVar.m43311yj());
        if (gqrVar != null) {
            return (Shape) yp7.m73974k4(shapeCollection, vtnVar, gqrVar, wxbVar.m72957k4());
        }
        com.aspose.slides.internal.p332p7.cuq cuqVar = (com.aspose.slides.internal.p332p7.cuq) wgi.m72712k4(com.aspose.slides.internal.p332p7.cuq.class, "image", vtnVar.m43311yj());
        if (cuqVar == null) {
            return null;
        }
        Shape shapeM67776k4 = m67776k4(shapeCollection, vtnVar, cuqVar, wxbVar);
        if (C7019kk.m27469x1(shapeM67776k4, PictureFrame.class)) {
            PictureFrame pictureFrame = (PictureFrame) shapeM67776k4;
            m67785k4(pictureFrame, cuqVar, vtnVar.m43301kk(), wxbVar);
            m67785k4(pictureFrame, cuqVar, vtnVar.m43305to(), wxbVar);
        } else {
            AutoShape autoShape = (AutoShape) shapeM67776k4;
            m67783k4(autoShape, vtnVar.m43301kk(), wxbVar);
            m67783k4(autoShape, vtnVar.m43305to(), wxbVar);
        }
        m67784k4((IShape) shapeM67776k4, vtnVar.m43308x1(), wxbVar);
        return shapeM67776k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static com.aspose.slides.internal.p332p7.pb4 m67780k4(IGenericEnumerable<C7394ca> iGenericEnumerable) {
        IGenericEnumerator<C7394ca> it = iGenericEnumerable.iterator();
        com.aspose.slides.internal.p332p7.pb4 pb4Var = null;
        while (it.hasNext() && (pb4Var = (com.aspose.slides.internal.p332p7.pb4) C7019kk.m27452k4((Object) it.next().m29542x1(), com.aspose.slides.internal.p332p7.pb4.class)) == null) {
            try {
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return pb4Var;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12007ix m67781k4(float f, float f2, float f3, float f4) {
        float f5 = f3 > f4 ? f2 : f;
        float f6 = f3 > f4 ? f4 : f3;
        float f7 = f3 > f4 ? f - f2 : f2 - f;
        float f8 = f4 - f3;
        if (f8 < 0.0f && f7 < 0.0f) {
            f5 += f7;
            f7 *= -1.0f;
        }
        return new C12007ix(f5, f6, f7, f8);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67782k4(AutoShape autoShape, nh5 nh5Var, wxb wxbVar) {
        if (wgi.m72731kk(nh5Var.m68026k4())) {
            wr8.m72893k4(autoShape, nh5Var, wxbVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67783k4(AutoShape autoShape, String str, wxb wxbVar) {
        if (wgi.m72731kk(str)) {
            wr8.m72894k4(autoShape, str, wxbVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67784k4(IShape iShape, String str, wxb wxbVar) {
        if (wgi.m72731kk(str) && wxbVar.m72960x1().m69236ck().containsKey(str) && wxbVar.m72960x1().m69236ck().get_Item(str).m44030x1() == 4) {
            iShape.setHidden(true);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67785k4(PictureFrame pictureFrame, com.aspose.slides.internal.p332p7.cuq cuqVar, String str, wxb wxbVar) {
        if (wgi.m72731kk(str)) {
            wr8.m72899k4(pictureFrame, cuqVar, str, wxbVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m67786k4(Shape shape, String str, wxb wxbVar) {
        ada adaVar = new ada(new ge7(str));
        adaVar.m3502k4(new xlm(adaVar, shape, wxbVar));
        adaVar.m3501k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m67787k4(ShapeCollection shapeCollection, AutoShape autoShape, nh5 nh5Var, com.aspose.slides.internal.p332p7.pb4 pb4Var, com.aspose.slides.internal.p332p7.vtn vtnVar, wxb wxbVar) {
        nh5 nh5Var2;
        wxb wxbVar2;
        autoShape.m284k4(true);
        yup.m74101k4((TextFrame) autoShape.getTextFrame(), wxbVar);
        List[] listArr = {null};
        int iM67774k4 = m67774k4(pb4Var, vtnVar, wxbVar, (List<C7394ca>[]) listArr);
        List.Enumerator it = listArr[0].iterator();
        while (it.hasNext()) {
            try {
                C7394ca c7394ca = (C7394ca) it.next();
                com.aspose.slides.internal.p332p7.lxj lxjVar = (com.aspose.slides.internal.p332p7.lxj) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.lxj.class);
                if (lxjVar != null) {
                    gga ggaVarM6640k4 = gga.m6640k4(nh5Var.m68026k4(), 10);
                    m67783k4(autoShape, nh5Var.m68026k4(), wxbVar);
                    nh5Var2 = nh5Var;
                    wxbVar2 = wxbVar;
                    m67791k4(autoShape.m288x1(), nh5Var2, lxjVar, wxbVar2, iM67774k4, ggaVarM6640k4);
                    if (vtnVar.m43293fa() == 2) {
                        m67782k4(autoShape, nh5Var2, wxbVar2);
                    }
                    m67783k4(autoShape, nh5Var2.m68028x1(), wxbVar2);
                } else {
                    nh5Var2 = nh5Var;
                    wxbVar2 = wxbVar;
                    Dictionary<String, AbstractC14159k4> dictionary = f47453k4;
                    if (dictionary.containsKey(c7394ca.m29539k4())) {
                        dictionary.get_Item(c7394ca.m29539k4()).mo67810k4(shapeCollection, c7394ca.m29542x1(), wxbVar2);
                    } else if (ContextChain.TAG_PRODUCT.equals(c7394ca.m29539k4())) {
                        gga ggaVarM6641x1 = gga.m6641x1();
                        if (wgi.m72731kk(nh5Var2.m68026k4())) {
                            ggaVarM6641x1 = gga.m6640k4(nh5Var2.m68026k4(), 10);
                        } else if (wgi.m72731kk(nh5Var2.m68028x1())) {
                            ggaVarM6641x1 = gga.m6640k4(nh5Var2.m68028x1(), 9);
                        }
                        m67790k4((TextFrame) autoShape.getTextFrame(), nh5Var2, (IGenericList<C7394ca>) AbstractC14092to.m67204k4((Object[]) new C7394ca[]{c7394ca}), wxbVar2, ggaVarM6641x1);
                    }
                }
                nh5Var = nh5Var2;
                wxbVar = wxbVar2;
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67788k4(ShapeCollection shapeCollection, C7394ca c7394ca, wxb wxbVar) {
        if (c7394ca == null) {
            throw new ArgumentNullException("shape");
        }
        Dictionary<String, AbstractC14159k4> dictionary = f47453k4;
        if (dictionary.containsKey(c7394ca.m29539k4())) {
            dictionary.get_Item(c7394ca.m29539k4()).mo67810k4(shapeCollection, c7394ca.m29542x1(), wxbVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67789k4(TextFrame textFrame, com.aspose.slides.internal.p332p7.lxj lxjVar, com.aspose.slides.internal.p332p7.w7y w7yVar, wxb wxbVar, gga ggaVar) {
        if (textFrame == null) {
            throw new ArgumentNullException("textFrame");
        }
        if (lxjVar == null) {
            throw new ArgumentNullException("listElement");
        }
        if (lxjVar.m36515to() == null) {
            throw new InvalidOperationException();
        }
        Object[] objArrM72729k4 = wgi.m72729k4(ContextChain.TAG_PRODUCT, lxjVar.m36515to().m39030k4());
        int length = objArrM72729k4.length;
        com.aspose.slides.internal.p332p7.ok7[] ok7VarArr = new com.aspose.slides.internal.p332p7.ok7[length];
        for (int i = 0; i < objArrM72729k4.length; i++) {
            ok7VarArr[i] = (com.aspose.slides.internal.p332p7.ok7) objArrM72729k4[i];
        }
        for (int i2 = 0; i2 < length; i2++) {
            com.aspose.slides.internal.p332p7.ok7 ok7Var = ok7VarArr[i2];
            if (ok7Var == null) {
                throw new InvalidOperationException();
            }
            Paragraph paragraphM74091k4 = yup.m74091k4(textFrame, ok7Var, w7yVar, wxbVar, ggaVar);
            yup.m74093k4(paragraphM74091k4, w7yVar, 1, wxbVar);
            paragraphM74091k4.getParagraphFormat().getBullet().setType((byte) 1);
            paragraphM74091k4.getParagraphFormat().getBullet().setChar(ControlChar.SPACE_CHAR);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67790k4(TextFrame textFrame, nh5 nh5Var, IGenericList<C7394ca> iGenericList, wxb wxbVar, gga ggaVar) {
        yup.m74097k4(textFrame, nh5Var, iGenericList, (com.aspose.slides.internal.p332p7.w7y) null, 0, wxbVar, ggaVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m67791k4(TextFrame textFrame, nh5 nh5Var, com.aspose.slides.internal.p332p7.lxj lxjVar, wxb wxbVar, int i, gga ggaVar) {
        if (nh5Var == null) {
            throw new ArgumentNullException("propertiesProviderContext");
        }
        if (lxjVar == null) {
            throw new ArgumentNullException("listElementData");
        }
        yup.m74099k4(textFrame, nh5Var, wxbVar);
        com.aspose.slides.internal.p332p7.w7y w7yVar = wxbVar.m4422to().containsKey(lxjVar.m36514kk()) ? wxbVar.m4422to().get_Item(lxjVar.m36514kk()) : null;
        if (lxjVar.m36515to() != null) {
            m67789k4(textFrame, lxjVar, w7yVar, wxbVar, ggaVar);
        }
        uan.m71588k4(textFrame, nh5Var, lxjVar, w7yVar, i, wxbVar, ggaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m67792k4(TextFrame textFrame, nh5 nh5Var, com.aspose.slides.internal.p332p7.pb4 pb4Var, com.aspose.slides.internal.p332p7.vtn vtnVar, wxb wxbVar) {
        TextFrame textFrame2;
        nh5 nh5Var2;
        wxb wxbVar2;
        yup.m74101k4(textFrame, wxbVar);
        List[] listArr = {null};
        int iM67774k4 = m67774k4(pb4Var, vtnVar, wxbVar, (List<C7394ca>[]) listArr);
        List.Enumerator it = listArr[0].iterator();
        while (it.hasNext()) {
            try {
                C7394ca c7394ca = (C7394ca) it.next();
                com.aspose.slides.internal.p332p7.lxj lxjVar = (com.aspose.slides.internal.p332p7.lxj) C7019kk.m27452k4((Object) c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.lxj.class);
                if (lxjVar != null) {
                    textFrame2 = textFrame;
                    nh5Var2 = nh5Var;
                    wxbVar2 = wxbVar;
                    m67791k4(textFrame2, nh5Var2, lxjVar, wxbVar2, iM67774k4, gga.m6640k4(nh5Var.m68026k4(), 10));
                } else {
                    textFrame2 = textFrame;
                    nh5Var2 = nh5Var;
                    wxbVar2 = wxbVar;
                    if (ContextChain.TAG_PRODUCT.equals(c7394ca.m29539k4())) {
                        m67790k4(textFrame2, nh5Var2, (IGenericList<C7394ca>) AbstractC14092to.m67204k4((Object[]) new C7394ca[]{c7394ca}), wxbVar2, gga.m6640k4(nh5Var2.m68026k4(), 10));
                    }
                }
                textFrame = textFrame2;
                nh5Var = nh5Var2;
                wxbVar = wxbVar2;
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m67793k4(com.aspose.slides.internal.p332p7.vtn vtnVar, Shape shape, wxb wxbVar) {
        TextFrame textFrameM288x1;
        if (m67795k4(vtnVar)) {
            byte bByteValue = q9u.f48266du.get_Item(Integer.valueOf(vtnVar.m43293fa())).byteValue();
            if (C7019kk.m27469x1(shape, AutoShape.class) && ((bByteValue == 0 || bByteValue == 3) && (textFrameM288x1 = ((AutoShape) shape).m288x1()) != null)) {
                if (textFrameM288x1.getTextFrameFormat().getAnchoringType() == -1) {
                    textFrameM288x1.getTextFrameFormat().setAnchoringType((byte) 1);
                }
                IGenericEnumerator<IParagraph> it = textFrameM288x1.getParagraphs().iterator();
                while (it.hasNext()) {
                    try {
                        Paragraph paragraph = (Paragraph) it.next();
                        if (paragraph.getParagraphFormat().getAlignment() == -1) {
                            paragraph.getParagraphFormat().setAlignment(1);
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
            if (!BaseSlideHeaderFooterManager.m411k4(bByteValue)) {
                wxbVar.m72956h4().m7267k4(bByteValue);
            }
            long jM7270m9 = wxbVar.m72956h4().m7270m9();
            Placeholder placeholder = new Placeholder((byte) 0, (byte) 0, bByteValue, jM7270m9, false);
            shape.m2554k4(placeholder.getOrientation(), placeholder.getSize(), placeholder.getType(), jM7270m9, placeholder.m2273x1());
            wxbVar.m72956h4().m7268k4(wxbVar.m72956h4().m7270m9() + 1);
            wxbVar.m72956h4().m7265h4().set_Item(Integer.valueOf(vtnVar.m43293fa()), shape);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m67794k4(String str, Shape shape, wxb wxbVar) {
        if (wgi.m72731kk(str)) {
            wxbVar.m72959m9().addItem(str, shape);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m67795k4(com.aspose.slides.internal.p332p7.vtn vtnVar) {
        return (vtnVar.m43293fa() == 0 || vtnVar.m43293fa() == 11) ? false : true;
    }
}
