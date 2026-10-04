package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseHeaderFooterManager implements IBaseHeaderFooterManager, InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC14397rj f1051k4;

    public BaseHeaderFooterManager(InterfaceC14397rj interfaceC14397rj) {
        if (interfaceC14397rj == null) {
            throw new ArgumentNullException("parentImmediate");
        }
        this.f1051k4 = interfaceC14397rj;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m341k4(AutoShape autoShape, AutoShape autoShape2) {
        if (autoShape == null || autoShape2 == null) {
            return;
        }
        IParagraphCollection paragraphs = autoShape2.getTextFrame().getParagraphs();
        paragraphs.clear();
        IGenericEnumerator<IParagraph> it = autoShape.getTextFrame().getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                paragraphs.add(new Paragraph((Paragraph) it.next()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        ((TextFrameFormat) autoShape2.getTextFrame().getTextFrameFormat()).m2952k4((TextFrameFormat) autoShape.getTextFrame().getTextFrameFormat());
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1051k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m342k4(BaseSlide baseSlide) {
        baseSlide.f1084x1.m5437k4(baseSlide);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m343k4(BaseSlide baseSlide, byte b) {
        if (baseSlide == null) {
            return;
        }
        for (int size = baseSlide.getShapes().size() - 1; size >= 0; size--) {
            IShape iShape = baseSlide.getShapes().get_Item(size);
            if (iShape.getPlaceholder() != null && iShape.getPlaceholder().getType() == b) {
                baseSlide.getShapes().removeAt(size);
                baseSlide.f1084x1.m5438k4(iShape);
            }
        }
        m342k4(baseSlide);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m344k4(BaseSlide baseSlide, BaseSlide baseSlide2, byte b) {
        if (baseSlide == null || baseSlide2 == null) {
            return;
        }
        IGenericEnumerator<IShape> it = baseSlide2.getShapes().iterator();
        while (it.hasNext()) {
            try {
                Shape shape = (Shape) it.next();
                if (shape.getPlaceholder() != null && shape.getPlaceholder().getType() == b) {
                    m345k4(baseSlide, shape);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    public static void m345k4(BaseSlide baseSlide, Shape shape) {
        AutoShape autoShape;
        boolean z;
        Object objM27452k4;
        if (baseSlide == null || shape == null) {
            return;
        }
        byte type = shape.getPlaceholder().getType();
        IGenericEnumerator<IPortion> it = baseSlide.getShapes().iterator();
        while (it.hasNext()) {
            try {
                Shape shape2 = (Shape) it.next();
                if (shape2.getPlaceholder() != null) {
                    z = true;
                    if (shape2.getPlaceholder().getType() == type && shape2.getPlaceholder().getIndex() == shape.getPlaceholder().getIndex()) {
                        objM27452k4 = C7019kk.m27452k4((Object) shape2, (Class<Object>) AutoShape.class);
                    } else if (shape2.getPlaceholder().getType() == type && shape2.getPlaceholder().getIndex() == 4294967295L) {
                        baseSlide.f1084x1.m5438k4(shape2);
                        shape2.addPlaceholder(shape.getPlaceholder());
                        objM27452k4 = C7019kk.m27452k4((Object) shape2, (Class<Object>) AutoShape.class);
                    }
                    autoShape = (AutoShape) objM27452k4;
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        autoShape = null;
        z = false;
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (!z) {
            AutoShape autoShapeM2612ck = ((ShapeCollection) baseSlide.getShapes()).m2612ck();
            autoShapeM2612ck.m2574ss();
            autoShapeM2612ck.setName(shape.getName());
            autoShapeM2612ck.addPlaceholder(shape.getPlaceholder());
            autoShape = (AutoShape) C7019kk.m27452k4((Object) autoShapeM2612ck, AutoShape.class);
            if (type == 0) {
                autoShapeM2612ck.addTextFrame("");
                AutoShape autoShape2 = (AutoShape) C7019kk.m27452k4((Object) shape, AutoShape.class);
                if (autoShape != null && autoShape2 != null && autoShape2.getTextFrame() != null && autoShape2.getTextFrame().getParagraphs().getCount() > 0) {
                    IParagraphCollection paragraphs = autoShape2.getTextFrame().getParagraphs();
                    if (paragraphs.get_Item(0).getPortions().getCount() > 0) {
                        autoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().clear();
                    }
                    it = paragraphs.get_Item(0).getPortions().iterator();
                    while (it.hasNext()) {
                        try {
                            Portion portion = (Portion) it.next();
                            Portion portion2 = new Portion(portion.getText());
                            portion2.m2287k4(portion);
                            if (portion.m2291kk()) {
                                portion2.addField(portion.getField().getType());
                            }
                            autoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().add(portion2);
                            ((ParagraphFormat) autoShape.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat()).m2196k4((ParagraphFormat) paragraphs.get_Item(0).getParagraphFormat());
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            } else if (type < 9) {
                autoShape.addTextFrame("");
            }
        }
        if (autoShape != null && (type == 4 || type == 6 || type == 5)) {
            m341k4((AutoShape) C7019kk.m27452k4((Object) shape, AutoShape.class), autoShape);
        }
        m342k4(baseSlide);
    }
}
