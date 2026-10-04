package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class alz {
    /* JADX INFO: renamed from: k4 */
    public static <T> List<T> m3663k4(Class<T> cls, IPresentation iPresentation) {
        List<T> list = new List<>();
        IGenericEnumerator<ISlide> it = iPresentation.getSlides().iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<IShape> it2 = it.next().getShapes().iterator();
                while (it2.hasNext()) {
                    try {
                        IShape next = it2.next();
                        if (C7019kk.m27469x1(next, cls)) {
                            list.addItem(next);
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        IGenericEnumerator<ILayoutSlide> it3 = iPresentation.getLayoutSlides().iterator();
        while (it3.hasNext()) {
            try {
                IGenericEnumerator<IShape> it4 = it3.next().getShapes().iterator();
                while (it4.hasNext()) {
                    try {
                        IShape next2 = it4.next();
                        if (C7019kk.m27469x1(next2, cls)) {
                            list.addItem(next2);
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
        IGenericEnumerator<IMasterSlide> it5 = iPresentation.getMasters().iterator();
        while (it5.hasNext()) {
            try {
                IGenericEnumerator<IShape> it6 = it5.next().getShapes().iterator();
                while (it6.hasNext()) {
                    try {
                        IShape next3 = it6.next();
                        if (C7019kk.m27469x1(next3, cls)) {
                            list.addItem(next3);
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it6, (Class<IDisposable>) IDisposable.class)) {
                            it6.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it6, (Class<IDisposable>) IDisposable.class)) {
                    it6.dispose();
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
            it5.dispose();
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static C12009k4 m3664k4(IShape iShape) {
        List.Enumerator it;
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) iShape, AutoShape.class);
        if (autoShape == null || C14113y2.m67411k4(autoShape.getTextFrame().getText())) {
            return C7019kk.m27469x1(iShape, IConnector.class) ? ((Connector) iShape).m2553k4(2, 1.0f, 1.0f) : ((Shape) iShape).m2549e0();
        }
        List list = new List();
        IGenericEnumerator<IParagraph> it2 = autoShape.getTextFrame().getParagraphs().iterator();
        while (it2.hasNext()) {
            try {
                list.addItem(new Paragraph((Paragraph) it2.next()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        try {
            autoShape.getTextFrame().getParagraphs().clear();
            C12009k4 c12009k4M2549e0 = autoShape.m2549e0();
            it = list.iterator();
            while (it.hasNext()) {
                try {
                    autoShape.getTextFrame().getParagraphs().add((Paragraph) it.next());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return c12009k4M2549e0;
        } catch (Throwable th) {
            it = list.iterator();
            while (it.hasNext()) {
                try {
                    autoShape.getTextFrame().getParagraphs().add((Paragraph) it.next());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static String m3665k4(Shape shape, C12016rv c12016rv) {
        int iM27462to = C7019kk.m27462to(Float.valueOf(shape.getX()), 13);
        int iM27462to2 = C7019kk.m27462to(Float.valueOf(shape.getY()), 13);
        int iM27462to3 = C7019kk.m27462to(Float.valueOf(shape.getWidth()), 13);
        int iM27462to4 = C7019kk.m27462to(Float.valueOf(shape.getHeight()), 13);
        if (C7019kk.m27469x1(shape, Connector.class) && iM27462to4 == 0) {
            iM27462to4 = C7019kk.m27462to(Double.valueOf(((Connector) C7019kk.m27452k4((Object) shape, Connector.class)).getLineFormat().getWidth()), 14);
        }
        return C14113y2.m67402k4("left: {0}px; top: {1}px; width: {2}px; height: {3}px;", Integer.valueOf(iM27462to), Integer.valueOf(iM27462to2), Integer.valueOf(iM27462to3), Integer.valueOf(iM27462to4));
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> String m3666k4(T t, TemplateContext<T> templateContext) {
        String resourcePath;
        if (!C7019kk.m27469x1(t, Shape.class)) {
            throw new InvalidOperationException("Object of Shape class expected");
        }
        if (((Boolean) templateContext.getGlobal().get("embedImages")).booleanValue()) {
            Shape shape = (Shape) C7019kk.m27452k4((Object) t, Shape.class);
            C3152yj c3152yj = new C3152yj();
            try {
                C12009k4 c12009k4M3664k4 = m3664k4(shape);
                try {
                    c12009k4M3664k4.m56333k4(c3152yj, C3977ck.m15681jd());
                    String strM67408k4 = C14113y2.m67408k4("'data:image/png;base64, ", C14080ne.m66952k4(c3152yj.toArray()), "'");
                    c12009k4M3664k4.dispose();
                    return strM67408k4;
                } catch (Throwable th) {
                    if (c12009k4M3664k4 != null) {
                        c12009k4M3664k4.dispose();
                    }
                    throw th;
                }
            } finally {
                c3152yj.dispose();
            }
        }
        String str = (String) templateContext.getGlobal().get("slidesPath");
        try {
            resourcePath = templateContext.getOutput().getResourcePath(C7019kk.m27452k4((Object) t, Shape.class));
        } catch (ArgumentException e) {
            if (!C7019kk.m27469x1(t, OleObjectFrame.class) || ((OleObjectFrame) C7019kk.m27452k4((Object) t, OleObjectFrame.class)).getSubstitutePictureFormat() == null || ((OleObjectFrame) C7019kk.m27452k4((Object) t, OleObjectFrame.class)).getSubstitutePictureFormat().getPicture() == null) {
                throw e;
            }
            resourcePath = templateContext.getOutput().getResourcePath(((OleObjectFrame) C7019kk.m27452k4((Object) t, OleObjectFrame.class)).getSubstitutePictureFormat().getPicture().getImage());
        }
        return m3667k4(resourcePath, str);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m3667k4(String str, String str2) {
        if (!C3141rv.m13409m9(str)) {
            str = C14113y2.m67408k4("C:\\", str);
        }
        if (!C3141rv.m13409m9(str2)) {
            str2 = C14113y2.m67408k4("C:\\", str2);
        }
        if (!C14113y2.m67424kk(str2, "\\")) {
            str2 = C14113y2.m67400k4(str2, "\\");
        }
        return C14113y2.m67393k4(C14062gk.m66625ck(new C14062gk(str2).m66685k4(new C14062gk(str)).toString()), IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
    }
}
