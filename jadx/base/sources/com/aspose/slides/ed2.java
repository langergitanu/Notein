package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ParagraphFormat;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ed2 extends DomObject<BaseSlide> {

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<ParagraphFormat.AbstractC0555k4> f4741k4;

    /* JADX INFO: renamed from: kk */
    private ParagraphFormat.AbstractC0555k4 f4742kk;

    /* JADX INFO: renamed from: to */
    private ParagraphFormat.AbstractC0555k4 f4743to;

    /* JADX INFO: renamed from: x1 */
    final AbstractC7018k4<ParagraphFormat.AbstractC0555k4> f4744x1;

    public ed2(BaseSlide baseSlide) {
        super(baseSlide);
        this.f4741k4 = new AbstractC7018k4<ParagraphFormat.AbstractC0555k4>() { // from class: com.aspose.slides.ed2.1
            {
                ed2.this.f4742kk = new ParagraphFormat.AbstractC0555k4() { // from class: com.aspose.slides.ed2.1.1
                };
            }
        };
        this.f4744x1 = new AbstractC7018k4<ParagraphFormat.AbstractC0555k4>() { // from class: com.aspose.slides.ed2.2
            {
                ed2.this.f4743to = new ParagraphFormat.AbstractC0555k4() { // from class: com.aspose.slides.ed2.2.1
                };
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final List<Long> m5434k4() {
        List<Long> list = new List<>();
        List.Enumerator<Shape> it = ((BaseSlide) this.f2127h4).m385dy().iterator();
        while (it.hasNext()) {
            try {
                Shape next = it.next();
                if (next.getPlaceholder() != null) {
                    list.addItem(Long.valueOf(next.getPlaceholder().getIndex()));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final Shape m5439x1(Placeholder placeholder) {
        return ((BaseSlide) this.f2127h4).m391k4(placeholder.getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0019  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Shape m5435k4(IPlaceholder iPlaceholder, Placeholder placeholder) {
        byte type = iPlaceholder.getType();
        if (type == 0) {
            type = 0;
        } else if (type == 1) {
            type = 1;
        } else if (type != 2) {
            if (type != 3 && type != 15) {
                switch (type) {
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        type = 1;
                        break;
                }
            } else {
                type = 1;
            }
        }
        return ((BaseSlide) this.f2127h4).m391k4(type);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5440x1(IShape iShape) {
        AutoShape autoShape;
        final TextFrame textFrame;
        if (iShape.getPlaceholder() == null || ((BaseSlide) iShape.getSlide()).f1084x1 != this || (autoShape = (AutoShape) C7019kk.m27452k4((Object) iShape, AutoShape.class)) == null || (textFrame = (TextFrame) autoShape.getTextFrame()) == null) {
            return;
        }
        ((TextStyle) textFrame.getTextFrameFormat().getTextStyle()).f3547k4.mo27432x1(new ParagraphFormat.AbstractC0555k4() { // from class: com.aspose.slides.ed2.7
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.PlaceholderCollection.ParagraphChanged(Aspose.Slides.ParagraphFormat)";
            }
        });
        this.f4744x1.mo27432x1(new ParagraphFormat.AbstractC0555k4() { // from class: com.aspose.slides.ed2.8
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(textFrame.f3519k4) + "Aspose.Slides.TextFrameFormat.OnParentPropertiesChanded(Aspose.Slides.ParagraphFormat)";
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final Shape m5436k4(Placeholder placeholder) {
        return ((BaseSlide) this.f2127h4).m406x1(placeholder.getIndex());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5437k4(BaseSlide baseSlide) {
        AutoShape autoShape;
        List.Enumerator<Shape> it = baseSlide.m385dy().iterator();
        while (it.hasNext()) {
            try {
                Shape next = it.next();
                if (((Placeholder) next.getPlaceholder()) != null && (autoShape = (AutoShape) C7019kk.m27452k4((Object) next, AutoShape.class)) != null && autoShape.getTextFrame() != null) {
                    final TextFrame textFrame = (TextFrame) autoShape.getTextFrame();
                    ((TextStyle) textFrame.getTextFrameFormat().getTextStyle()).f3547k4.mo27432x1(new ParagraphFormat.AbstractC0555k4() { // from class: com.aspose.slides.ed2.3
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return "Aspose.Slides.PlaceholderCollection.ParagraphChanged(Aspose.Slides.ParagraphFormat)";
                        }
                    });
                    this.f4744x1.mo27432x1(new ParagraphFormat.AbstractC0555k4() { // from class: com.aspose.slides.ed2.4
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(textFrame.f3519k4) + "Aspose.Slides.TextFrameFormat.OnParentPropertiesChanded(Aspose.Slides.ParagraphFormat)";
                        }
                    });
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5438k4(IShape iShape) {
        final TextFrame textFrame;
        if (iShape.getPlaceholder() == null || ((BaseSlide) iShape.getSlide()).f1084x1 != this || !C7019kk.m27469x1(iShape, AutoShape.class) || (textFrame = (TextFrame) ((AutoShape) iShape).getTextFrame()) == null) {
            return;
        }
        ((TextStyle) textFrame.getTextFrameFormat().getTextStyle()).f3547k4.mo27429k4(new ParagraphFormat.AbstractC0555k4() { // from class: com.aspose.slides.ed2.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.PlaceholderCollection.ParagraphChanged(Aspose.Slides.ParagraphFormat)";
            }
        });
        this.f4744x1.mo27429k4(new ParagraphFormat.AbstractC0555k4() { // from class: com.aspose.slides.ed2.6
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(textFrame.f3519k4) + "Aspose.Slides.TextFrameFormat.OnParentPropertiesChanded(Aspose.Slides.ParagraphFormat)";
            }
        });
    }
}
