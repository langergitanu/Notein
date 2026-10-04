package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class ForEach {

    public interface ForEachLayoutSlideCallback {
        void invoke(LayoutSlide layoutSlide, int i);
    }

    public interface ForEachMasterSlideCallback {
        void invoke(MasterSlide masterSlide, int i);
    }

    public interface ForEachParagraphCallback {
        void invoke(Paragraph paragraph, BaseSlide baseSlide, int i);
    }

    public interface ForEachPortionCallback {
        void invoke(Portion portion, Paragraph paragraph, BaseSlide baseSlide, int i);
    }

    public interface ForEachShapeCallback {
        void invoke(Shape shape, BaseSlide baseSlide, int i);
    }

    public interface ForEachSlideCallback {
        void invoke(Slide slide, int i);
    }

    public static void layoutSlide(Presentation presentation, ForEachLayoutSlideCallback forEachLayoutSlideCallback) {
        agh.m3573k4(presentation, "pres");
        agh.m3573k4(forEachLayoutSlideCallback, "forEachLayoutSlide");
        for (int i = 0; i < presentation.getLayoutSlides().size(); i++) {
            forEachLayoutSlideCallback.invoke((LayoutSlide) presentation.getLayoutSlides().get_Item(i), i);
        }
    }

    public static void masterSlide(Presentation presentation, ForEachMasterSlideCallback forEachMasterSlideCallback) {
        agh.m3573k4(presentation, "pres");
        agh.m3573k4(forEachMasterSlideCallback, "forEachMasterSlide");
        for (int i = 0; i < presentation.getMasters().size(); i++) {
            forEachMasterSlideCallback.invoke((MasterSlide) presentation.getMasters().get_Item(i), i);
        }
    }

    public static void paragraph(Presentation presentation, ForEachParagraphCallback forEachParagraphCallback) {
        paragraph(presentation, false, forEachParagraphCallback);
    }

    public static void portion(Presentation presentation, ForEachPortionCallback forEachPortionCallback) {
        portion(presentation, false, forEachPortionCallback);
    }

    public static void shape(BaseSlide baseSlide, ForEachShapeCallback forEachShapeCallback) {
        for (int i = 0; i < baseSlide.getShapes().size(); i++) {
            forEachShapeCallback.invoke((Shape) baseSlide.getShapes().get_Item(i), baseSlide, i);
        }
    }

    public static void slide(Presentation presentation, ForEachSlideCallback forEachSlideCallback) {
        agh.m3573k4(presentation, "pres");
        agh.m3573k4(forEachSlideCallback, "forEachSlide");
        for (int i = 0; i < presentation.getSlides().size(); i++) {
            forEachSlideCallback.invoke((Slide) presentation.getSlides().get_Item(i), i);
        }
    }

    public static void paragraph(Presentation presentation, boolean z, final ForEachParagraphCallback forEachParagraphCallback) {
        agh.m3573k4(presentation, "pres");
        agh.m3573k4(forEachParagraphCallback, "forEachParagraph");
        shape(presentation, z, new ForEachShapeCallback() { // from class: com.aspose.slides.ForEach.4
            @Override // com.aspose.slides.ForEach.ForEachShapeCallback
            public void invoke(Shape shape, BaseSlide baseSlide, int i) {
                AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) shape, AutoShape.class);
                if (autoShape == null || autoShape.getTextFrame() == null) {
                    return;
                }
                for (int i2 = 0; i2 < autoShape.getTextFrame().getParagraphs().getCount(); i2++) {
                    forEachParagraphCallback.invoke((Paragraph) autoShape.getTextFrame().getParagraphs().get_Item(i2), baseSlide, i2);
                }
            }
        });
    }

    public static void portion(Presentation presentation, boolean z, final ForEachPortionCallback forEachPortionCallback) {
        agh.m3573k4(presentation, "pres");
        agh.m3573k4(forEachPortionCallback, "forEachPortion");
        paragraph(presentation, z, new ForEachParagraphCallback() { // from class: com.aspose.slides.ForEach.5
            @Override // com.aspose.slides.ForEach.ForEachParagraphCallback
            public void invoke(Paragraph paragraph, BaseSlide baseSlide, int i) {
                for (int i2 = 0; i2 < paragraph.getPortions().getCount(); i2++) {
                    forEachPortionCallback.invoke((Portion) paragraph.getPortions().get_Item(i2), paragraph, baseSlide, i2);
                }
            }
        });
    }

    public static void shape(Presentation presentation, ForEachShapeCallback forEachShapeCallback) {
        shape(presentation, false, forEachShapeCallback);
    }

    public static void shape(Presentation presentation, final boolean z, final ForEachShapeCallback forEachShapeCallback) {
        agh.m3573k4(presentation, "pres");
        agh.m3573k4(forEachShapeCallback, "forEachShape");
        slide(presentation, new ForEachSlideCallback() { // from class: com.aspose.slides.ForEach.1
            @Override // com.aspose.slides.ForEach.ForEachSlideCallback
            public void invoke(Slide slide, int i) {
                NotesSlide notesSlide;
                ForEach.shape(slide, forEachShapeCallback);
                if (!z || (notesSlide = (NotesSlide) C7019kk.m27452k4((Object) slide.getNotesSlideManager().getNotesSlide(), NotesSlide.class)) == null) {
                    return;
                }
                ForEach.shape(notesSlide, forEachShapeCallback);
            }
        });
        layoutSlide(presentation, new ForEachLayoutSlideCallback() { // from class: com.aspose.slides.ForEach.2
            @Override // com.aspose.slides.ForEach.ForEachLayoutSlideCallback
            public void invoke(LayoutSlide layoutSlide, int i) {
                ForEach.shape(layoutSlide, forEachShapeCallback);
            }
        });
        masterSlide(presentation, new ForEachMasterSlideCallback() { // from class: com.aspose.slides.ForEach.3
            @Override // com.aspose.slides.ForEach.ForEachMasterSlideCallback
            public void invoke(MasterSlide masterSlide, int i) {
                ForEach.shape(masterSlide, forEachShapeCallback);
            }
        });
    }
}
