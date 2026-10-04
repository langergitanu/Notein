package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p332p7.AbstractC8917u4;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7815h2;
import com.aspose.slides.internal.p332p7.C8151l1;
import com.aspose.slides.internal.p332p7.C8655r6;
import com.aspose.slides.internal.p332p7.dti;
import com.aspose.slides.internal.p332p7.hyf;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.cn */
/* JADX INFO: loaded from: classes3.dex */
class C0861cn {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f4383k4 = new C7017h4("arc", "curve", "image", "line", "oval", "polyline", DrawToolFactory.LASSO_TYPE_RECT, "roundrect", "shape");

    /* JADX INFO: renamed from: com.aspose.slides.cn$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public final float f4384k4;

        /* JADX INFO: renamed from: kk */
        public final float f4385kk;

        /* JADX INFO: renamed from: to */
        public final float f4386to;

        /* JADX INFO: renamed from: x1 */
        public final float f4387x1;

        public k4(float f, float f2, float f3, float f4) {
            this.f4384k4 = f;
            this.f4387x1 = f2;
            this.f4385kk = f3;
            this.f4386to = f4;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.cn$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: k4 */
        private final C8151l1 f4388k4;

        /* JADX INFO: renamed from: kk */
        private AbstractC8917u4 f4389kk;

        /* JADX INFO: renamed from: x1 */
        private final List<x1> f4390x1 = new List<>();

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
        
            r4.f4389kk = r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public x1(x1 x1Var, C8151l1 c8151l1, IGenericEnumerable<AbstractC8917u4> iGenericEnumerable) {
            this.f4388k4 = c8151l1;
            IGenericEnumerator<AbstractC8917u4> it = iGenericEnumerable.iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC8917u4 next = it.next();
                    if (C14113y2.m67363du(next.mo29890k4(), C14113y2.m67422kk(c8151l1.m35816k4(), 1))) {
                        break;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: x1 */
        private int m4684x1() {
            int iMo29880du = this.f4389kk.mo29880du();
            if (iMo29880du == 1) {
                return 2;
            }
            if (iMo29880du != 2) {
                return iMo29880du != 3 ? 1 : 3;
            }
            return 4;
        }

        /* JADX INFO: renamed from: k4 */
        public final C8151l1 m4685k4() {
            return this.f4388k4;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m4686k4(ISmartArtNodeCollection iSmartArtNodeCollection, IShapeCollection iShapeCollection) {
            if (this.f4389kk != null) {
                ISmartArtNode iSmartArtNodeAddNode = iSmartArtNodeCollection.addNode();
                long[] jArr = {0};
                boolean zM4682k4 = C0861cn.m4682k4(this.f4389kk.mo29890k4(), jArr);
                long j = jArr[0];
                if (zM4682k4) {
                    IGenericEnumerator<IShape> it = iShapeCollection.iterator();
                    while (it.hasNext()) {
                        try {
                            AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) it.next(), AutoShape.class);
                            if (autoShape != null && autoShape.mo268du().m69039ix() == j && autoShape.m288x1() != null && !C14113y2.m67363du(autoShape.m288x1().getText(), C14113y2.f47374k4)) {
                                iSmartArtNodeAddNode.getTextFrame().setText(autoShape.m288x1().getText());
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                }
                iSmartArtNodeAddNode.setAssistant(this.f4389kk.mo29886h4() == 2);
                iSmartArtNodeAddNode.setOrganizationChartLayout(m4684x1());
                List.Enumerator<x1> it2 = this.f4390x1.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().m4686k4(iSmartArtNodeAddNode.getChildNodes(), iShapeCollection);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: k4 */
        public final void m4687k4(C8655r6 c8655r6, IGenericEnumerable<AbstractC8917u4> iGenericEnumerable) {
            for (C8151l1 c8151l1 : c8655r6.m39897x1()) {
                if (m4685k4() != c8151l1 && C14113y2.m67363du(c8151l1.m35820x1(), m4685k4().m35816k4())) {
                    x1 x1Var = new x1(this, c8151l1, iGenericEnumerable);
                    this.f4390x1.addItem(x1Var);
                    x1Var.m4687k4(c8655r6, iGenericEnumerable);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m4668k4(com.aspose.slides.internal.p332p7.l3s l3sVar) {
        if (l3sVar == null) {
            return 78;
        }
        int iMo35889jd = l3sVar.mo35889jd();
        if (iMo35889jd == 3) {
            return 17;
        }
        if (iMo35889jd == 4) {
            return 114;
        }
        if (iMo35889jd == 5) {
            return 16;
        }
        if (iMo35889jd != 6) {
            return iMo35889jd != 7 ? 78 : 18;
        }
        return 20;
    }

    /* JADX INFO: renamed from: x1 */
    private static List<AbstractC8917u4> m4683x1(com.aspose.slides.internal.p332p7.l3s l3sVar) {
        List<AbstractC8917u4> list = new List<>();
        List.Enumerator<C7394ca> it = l3sVar.mo29877c5().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f4383k4.m27428k4(next.m29539k4())) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        list.addItem((AbstractC8917u4) next.m29542x1());
                        break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private static AutoShape m4669k4(int i, AbstractC8917u4 abstractC8917u4, ShapeCollection shapeCollection, k4 k4Var, gnb gnbVar) {
        AutoShape autoShapeM2615fa = shapeCollection.m2615fa();
        autoShapeM2615fa.setShapeType(i);
        autoShapeM2615fa.addTextFrame("");
        ((TextFrame) autoShapeM2615fa.getTextFrame()).f3519k4.m2970x1((byte) 0);
        autoShapeM2615fa.getTextFrame().getTextFrameFormat().setAnchoringType((byte) 1);
        autoShapeM2615fa.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().setAlignment(1);
        m4676k4(autoShapeM2615fa, abstractC8917u4, k4Var);
        C14273pb.m68993k4(autoShapeM2615fa.getFillFormat(), autoShapeM2615fa.getLineFormat(), abstractC8917u4, gnbVar);
        nee.m67999k4(autoShapeM2615fa, abstractC8917u4, gnbVar);
        m4675k4(autoShapeM2615fa, abstractC8917u4);
        return autoShapeM2615fa;
    }

    /* JADX INFO: renamed from: k4 */
    private static Dictionary<String, hyf> m4670k4(IGenericEnumerable<com.aspose.slides.internal.p332p7.l3s> iGenericEnumerable) {
        Dictionary<String, hyf> dictionary = new Dictionary<>();
        IGenericEnumerator<com.aspose.slides.internal.p332p7.l3s> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                List.Enumerator<C7394ca> it2 = it.next().mo29877c5().iterator();
                while (it2.hasNext()) {
                    try {
                        C7394ca next = it2.next();
                        if ("shapetype".equals(next.m29539k4())) {
                            hyf hyfVar = (hyf) next.m29542x1();
                            dictionary.addItem(hyfVar.mo29890k4(), hyfVar);
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    private static C8151l1 m4671k4(List<C8151l1> list, boolean z, String str) {
        for (int i = 0; i < list.size(); i++) {
            C8151l1 c8151l1 = list.get_Item(i);
            if (str == null && C14113y2.m67363du(c8151l1.m35820x1(), c8151l1.m35816k4())) {
                list.removeAt(i);
                return c8151l1;
            }
            if (z) {
                if (C14113y2.m67363du(c8151l1.m35820x1(), str)) {
                    list.removeAt(i);
                    return c8151l1;
                }
            } else if (C14113y2.m67363du(c8151l1.m35816k4(), str)) {
                list.removeAt(i);
                return c8151l1;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4672k4(GeometryShape geometryShape) {
        if (Connector.f2031k4.containsKey(Integer.valueOf(geometryShape.getShapeType()))) {
            geometryShape.getLineFormat().setWidth(geometryShape.getLineFormat().getWidth() * 2.0d);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4673k4(IGroupShape iGroupShape, com.aspose.slides.internal.p332p7.l3s l3sVar, IGenericEnumerable<com.aspose.slides.internal.p332p7.l3s> iGenericEnumerable, gnb gnbVar) {
        AbstractC7361bz abstractC7361bzM29542x1;
        long[] jArrM71506k4 = C14618u7.m71506k4(l3sVar.mo29893kk(), 10000L);
        float width = iGroupShape.getRawFrame().getWidth();
        float f = width / (jArrM71506k4.length == 2 ? jArrM71506k4[0] : 1000L);
        float height = iGroupShape.getRawFrame().getHeight() / (jArrM71506k4.length == 2 ? jArrM71506k4[1] : 1000L);
        long[] jArrM71506k42 = C14618u7.m71506k4(l3sVar.mo29901to(), 0L);
        k4 k4Var = new k4(iGroupShape.getRawFrame().getX() - ((jArrM71506k42.length == 2 ? jArrM71506k42[0] : 0L) * f), iGroupShape.getRawFrame().getY() - ((jArrM71506k42.length == 2 ? jArrM71506k42[1] : 0L) * height), f, height);
        Dictionary<String, hyf> dictionaryM4670k4 = m4670k4(iGenericEnumerable);
        ShapeCollection shapeCollection = (ShapeCollection) iGroupShape.getShapes();
        List.Enumerator<C7394ca> it = l3sVar.mo29877c5().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f4383k4.m27428k4(next.m29539k4())) {
                    case 0:
                    case 1:
                    case 2:
                    case 5:
                        abstractC7361bzM29542x1 = next.m29542x1();
                        break;
                    case 3:
                        m4679k4((com.aspose.slides.internal.p332p7.h5e) next.m29542x1(), shapeCollection, k4Var, gnbVar);
                        continue;
                    case 4:
                        m4681k4((com.aspose.slides.internal.p332p7.srb) next.m29542x1(), shapeCollection, k4Var, gnbVar);
                        continue;
                    case 6:
                        abstractC7361bzM29542x1 = next.m29542x1();
                        break;
                    case 7:
                        m4680k4((com.aspose.slides.internal.p332p7.rsm) next.m29542x1(), shapeCollection, k4Var, gnbVar);
                        continue;
                    case 8:
                        m4677k4((dti) next.m29542x1(), shapeCollection, k4Var, gnbVar, dictionaryM4670k4);
                        continue;
                    default:
                        continue;
                }
                m4678k4((com.aspose.slides.internal.p332p7.gof) abstractC7361bzM29542x1, shapeCollection, k4Var, gnbVar);
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m4674k4(ISmartArt iSmartArt, com.aspose.slides.internal.p332p7.l3s l3sVar, IShapeCollection iShapeCollection) {
        C7815h2 c7815h2 = (C7815h2) l3sVar.m42084k4("diagram");
        if (c7815h2 != null) {
            int i = 0;
            iSmartArt.setReversed(c7815h2.m33031k4() == 1 || c7815h2.m33031k4() == 3);
            if (c7815h2.m33037x1() != null) {
                while (iSmartArt.getNodes().size() > 0) {
                    iSmartArt.getNodes().removeNode(iSmartArt.getNodes().get_Item(0));
                }
                List<AbstractC8917u4> listM4683x1 = m4683x1(l3sVar);
                C8655r6 c8655r6M33037x1 = c7815h2.m33037x1();
                x1 x1Var = null;
                if (l3sVar.mo35889jd() == 2 || l3sVar.mo35889jd() == 3) {
                    C8151l1[] c8151l1ArrM39897x1 = c8655r6M33037x1.m39897x1();
                    int length = c8151l1ArrM39897x1.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        C8151l1 c8151l1 = c8151l1ArrM39897x1[i];
                        if (C14113y2.m67363du(c8151l1.m35816k4(), c8151l1.m35820x1())) {
                            x1 x1Var2 = new x1(null, c8151l1, listM4683x1);
                            x1Var2.m4687k4(c8655r6M33037x1, listM4683x1);
                            x1Var = x1Var2;
                            break;
                        }
                        i++;
                    }
                    if (x1Var != null) {
                        x1Var.m4686k4(iSmartArt.getNodes(), iShapeCollection);
                        return;
                    }
                    return;
                }
                if (l3sVar.mo35889jd() != 4) {
                    if (l3sVar.mo35889jd() != 6 && l3sVar.mo35889jd() != 7) {
                        C8151l1[] c8151l1ArrM39897x12 = c8655r6M33037x1.m39897x1();
                        int length2 = c8151l1ArrM39897x12.length;
                        while (i < length2) {
                            new x1(null, c8151l1ArrM39897x12[i], listM4683x1).m4686k4(iSmartArt.getNodes(), iShapeCollection);
                            i++;
                        }
                        return;
                    }
                    C8151l1[] c8151l1ArrM39897x13 = c8655r6M33037x1.m39897x1();
                    int length3 = c8151l1ArrM39897x13.length;
                    while (i < length3) {
                        C8151l1 c8151l12 = c8151l1ArrM39897x13[i];
                        if (!C14113y2.m67363du(c8151l12.m35816k4(), c8151l12.m35820x1())) {
                            new x1(null, c8151l12, listM4683x1).m4686k4(iSmartArt.getNodes(), iShapeCollection);
                        }
                        i++;
                    }
                    return;
                }
                List list = new List();
                List list2 = new List(AbstractC14092to.m67204k4((Object[]) c8655r6M33037x1.m39897x1()));
                C8151l1 c8151l1M4671k4 = m4671k4((List<C8151l1>) list2, false, (String) null);
                if (c8151l1M4671k4 != null) {
                    list.addItem(new x1(null, m4671k4((List<C8151l1>) list2, false, c8151l1M4671k4.m35820x1()), listM4683x1));
                    while (true) {
                        c8151l1M4671k4 = m4671k4((List<C8151l1>) list2, true, c8151l1M4671k4.m35816k4());
                        if (c8151l1M4671k4 == null) {
                            break;
                        } else {
                            list.addItem(new x1(null, c8151l1M4671k4, listM4683x1));
                        }
                    }
                }
                List.Enumerator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((x1) it.next()).m4686k4(iSmartArt.getNodes(), iShapeCollection);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4675k4(Shape shape, AbstractC8917u4 abstractC8917u4) {
        long[] jArr = {0};
        boolean zM4682k4 = m4682k4(abstractC8917u4.mo29890k4(), jArr);
        long j = jArr[0];
        if (zM4682k4) {
            shape.mo272to().m69040k4(j);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4676k4(Shape shape, AbstractC8917u4 abstractC8917u4, k4 k4Var) {
        float f;
        float f2;
        float f3;
        float f4;
        ShapeFrame shapeFrameM74119k4 = yw9.m74119k4(abstractC8917u4.mo29904x1());
        float x = shapeFrameM74119k4.getX();
        float y = shapeFrameM74119k4.getY();
        float width = shapeFrameM74119k4.getWidth();
        float height = shapeFrameM74119k4.getHeight();
        float rotation = shapeFrameM74119k4.getRotation();
        byte flipH = shapeFrameM74119k4.getFlipH();
        byte flipV = shapeFrameM74119k4.getFlipV();
        if (C14064he.m66715kk(rotation) || C14116yg.m67480k4(rotation) != 270.0f) {
            float f5 = k4Var.f4385kk;
            f = k4Var.f4384k4 + (x * f5);
            float f6 = k4Var.f4386to;
            f2 = (y * f6) + k4Var.f4387x1;
            f3 = width * f5;
            f4 = height * f6;
        } else {
            float f7 = (width / 2.0f) + x;
            float f8 = k4Var.f4385kk;
            float f9 = (f7 * f8) + k4Var.f4384k4;
            float f10 = (height / 2.0f) + y;
            float f11 = k4Var.f4386to;
            f3 = width * f11;
            f4 = height * f8;
            f = f9 - (f3 / 2.0f);
            f2 = ((f10 * f11) + k4Var.f4387x1) - (f4 / 2.0f);
            flipH = flipV;
            flipV = flipH;
        }
        nd1 nd1VarMo1214P_ = shape.mo1214P_();
        nd1VarMo1214P_.m67987k4(new tbp(f, f2));
        shape.m2555k4(f3, f4);
        nd1VarMo1214P_.m67985k4(rotation, flipH, flipV);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4677k4(dti dtiVar, ShapeCollection shapeCollection, k4 k4Var, gnb gnbVar, Dictionary<String, hyf> dictionary) {
        AutoShape autoShapeM2615fa = shapeCollection.m2615fa();
        m4676k4(autoShapeM2615fa, dtiVar, k4Var);
        String strMo30641x6 = dtiVar.mo30641x6();
        if (strMo30641x6 != null && strMo30641x6.length() > 0) {
            strMo30641x6 = C14113y2.m67422kk(strMo30641x6, 1);
        }
        hyf hyfVar = dictionary.containsKey(strMo30641x6) ? dictionary.get_Item(strMo30641x6) : null;
        C14618u7.m71504k4(autoShapeM2615fa, dtiVar, hyfVar);
        C14273pb.m68994k4(autoShapeM2615fa.getFillFormat(), autoShapeM2615fa.getLineFormat(), dtiVar, hyfVar, gnbVar);
        nee.m67999k4(autoShapeM2615fa, dtiVar, gnbVar);
        m4675k4(autoShapeM2615fa, dtiVar);
        m4672k4(autoShapeM2615fa);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4678k4(com.aspose.slides.internal.p332p7.gof gofVar, ShapeCollection shapeCollection, k4 k4Var, gnb gnbVar) {
        m4669k4(5, gofVar, shapeCollection, k4Var, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4679k4(com.aspose.slides.internal.p332p7.h5e h5eVar, ShapeCollection shapeCollection, k4 k4Var, gnb gnbVar) {
        AutoShape autoShapeM2615fa = shapeCollection.m2615fa();
        autoShapeM2615fa.setShapeType(1);
        long[] jArrM71506k4 = C14618u7.m71506k4(h5eVar.mo29896ks(), 10L);
        long[] jArrM71506k42 = C14618u7.m71506k4(h5eVar.mo29900rv(), 10L);
        if (jArrM71506k4.length == 2 && jArrM71506k42.length == 2) {
            float fM67492kk = C14116yg.m67492kk(jArrM71506k4[0], jArrM71506k42[0]);
            float fM67486k4 = C14116yg.m67486k4(jArrM71506k4[0], jArrM71506k42[0]);
            float fM67492kk2 = C14116yg.m67492kk(jArrM71506k4[1], jArrM71506k42[1]);
            float fM67486k42 = C14116yg.m67486k4(jArrM71506k4[1], jArrM71506k42[1]);
            ShapeFrame shapeFrameM74119k4 = yw9.m74119k4(h5eVar.mo29904x1());
            byte flipH = jArrM71506k4[0] > jArrM71506k42[0] ? (byte) 1 : (byte) 0;
            byte flipV = jArrM71506k4[1] <= jArrM71506k42[1] ? (byte) 0 : (byte) 1;
            if (shapeFrameM74119k4.getFlipH() != -1) {
                flipH = shapeFrameM74119k4.getFlipH();
            }
            if (shapeFrameM74119k4.getFlipV() != -1) {
                flipV = shapeFrameM74119k4.getFlipV();
            }
            nd1 nd1VarMo1214P_ = autoShapeM2615fa.mo1214P_();
            double d = (fM67486k4 - fM67492kk) * k4Var.f4385kk;
            double d2 = (fM67486k42 - fM67492kk2) * k4Var.f4386to;
            nd1VarMo1214P_.m67987k4(new tbp((fM67492kk * k4Var.f4385kk) + k4Var.f4384k4, (fM67492kk2 * k4Var.f4386to) + k4Var.f4387x1));
            autoShapeM2615fa.m2555k4(d, d2);
            nd1VarMo1214P_.m67985k4(0.0f, flipH, flipV);
            C14273pb.m68993k4(autoShapeM2615fa.getFillFormat(), autoShapeM2615fa.getLineFormat(), h5eVar, gnbVar);
            m4675k4(autoShapeM2615fa, h5eVar);
            m4672k4(autoShapeM2615fa);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4680k4(com.aspose.slides.internal.p332p7.rsm rsmVar, ShapeCollection shapeCollection, k4 k4Var, gnb gnbVar) {
        m4669k4(26, rsmVar, shapeCollection, k4Var, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4681k4(com.aspose.slides.internal.p332p7.srb srbVar, ShapeCollection shapeCollection, k4 k4Var, gnb gnbVar) {
        m4669k4(35, srbVar, shapeCollection, k4Var, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m4682k4(String str, long[] jArr) {
        jArr[0] = 0;
        return !C14113y2.m67411k4(str) && str.length() > 2 && C14114y9.m67463k4(C14113y2.m67422kk(str, 2), jArr);
    }
}
