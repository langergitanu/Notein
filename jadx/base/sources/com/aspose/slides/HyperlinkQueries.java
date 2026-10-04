package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class HyperlinkQueries implements IHyperlinkQueries, InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC14397rj f2478k4;

    /* JADX INFO: renamed from: com.aspose.slides.HyperlinkQueries$k4 */
    public static abstract class AbstractC0447k4 extends AbstractC14085qw {
        private AbstractC0447k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public abstract boolean mo1706k4(IHyperlinkContainer iHyperlinkContainer);
    }

    public HyperlinkQueries(InterfaceC14397rj interfaceC14397rj) {
        this.f2478k4 = interfaceC14397rj;
    }

    /* JADX INFO: renamed from: k4 */
    private List<IHyperlinkContainer> m1705k4(Object obj, AbstractC0447k4 abstractC0447k4) {
        IGenericEnumerator<IPortion> it;
        IGenericEnumerator<IParagraph> it2;
        boolean zM27456k4;
        List<IHyperlinkContainer> list = new List<>();
        if (C7019kk.m27469x1(obj, TextFrame.class)) {
            it2 = ((TextFrame) obj).getParagraphs().iterator();
            while (it2.hasNext()) {
                try {
                    IParagraph next = it2.next();
                    if (abstractC0447k4.mo1706k4(next.getParagraphFormat().getDefaultPortionFormat())) {
                        list.addItem(next.getParagraphFormat().getDefaultPortionFormat());
                    }
                    it = next.getPortions().iterator();
                    while (it.hasNext()) {
                        try {
                            IPortion next2 = it.next();
                            if (abstractC0447k4.mo1706k4(((Portion) next2).m2295x1())) {
                                list.addItem(next2.getPortionFormat());
                            }
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                } finally {
                }
            }
            if (zM27456k4) {
                return list;
            }
        } else if (C7019kk.m27469x1(obj, IShape.class)) {
            IShape iShape = (IShape) obj;
            if (abstractC0447k4.mo1706k4(iShape)) {
                list.addItem(iShape);
            }
            if (C7019kk.m27469x1(iShape, AutoShape.class)) {
                AutoShape autoShape = (AutoShape) iShape;
                if (autoShape.getTextFrame() != null) {
                    list.addRange(m1705k4(autoShape.getTextFrame(), abstractC0447k4));
                    return list;
                }
            } else if (C7019kk.m27469x1(iShape, GroupShape.class)) {
                it2 = ((GroupShape) iShape).getShapes().iterator();
                while (it2.hasNext()) {
                    try {
                        list.addRange(m1705k4(it2.next(), abstractC0447k4));
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                    return list;
                }
            } else if (C7019kk.m27469x1(iShape, ITable.class)) {
                Table table = (Table) iShape;
                for (int i = 0; i < table.getColumns().size(); i++) {
                    for (int i2 = 0; i2 < table.getRows().size(); i2++) {
                        if (table.m2869k4(i, i2).getTextFrame() != null) {
                            list.addRange(m1705k4(table.m2869k4(i, i2).getTextFrame(), abstractC0447k4));
                        }
                    }
                }
            } else if (C7019kk.m27469x1(iShape, ISmartArt.class)) {
                it2 = ((ISmartArt) iShape).getAllNodes().iterator();
                while (it2.hasNext()) {
                    try {
                        IGenericEnumerator<ISmartArtShape> it3 = ((SmartArtNode) it2.next()).getShapes().iterator();
                        while (it3.hasNext()) {
                            try {
                                list.addRange(m1705k4(it3.next(), abstractC0447k4));
                            } finally {
                                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                    it3.dispose();
                                }
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                    return list;
                }
            } else if (C7019kk.m27469x1(iShape, ILegacyDiagram.class)) {
                it = ((LegacyDiagram) iShape).m1858kk().getShapes().iterator();
                while (it.hasNext()) {
                    try {
                        list.addRange(m1705k4(it.next(), abstractC0447k4));
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                    return list;
                }
            }
        } else if (C7019kk.m27469x1(obj, BaseSlide.class)) {
            IGenericEnumerator<IShape> it4 = ((BaseSlide) obj).getShapes().iterator();
            while (it4.hasNext()) {
                try {
                    list.addRange(m1705k4(it4.next(), abstractC0447k4));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                        it4.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                it4.dispose();
                return list;
            }
        } else {
            if (!C7019kk.m27469x1(obj, Presentation.class)) {
                throw new ArgumentException();
            }
            IGenericEnumerator<ISlide> it5 = ((Presentation) obj).getSlides().iterator();
            while (it5.hasNext()) {
                try {
                    list.addRange(m1705k4(it5.next(), abstractC0447k4));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                        it5.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                it5.dispose();
            }
        }
        return list;
    }

    @Override // com.aspose.slides.IHyperlinkQueries
    public final IGenericList<IHyperlinkContainer> getAnyHyperlinks() {
        return m1705k4(this.f2478k4, new AbstractC0447k4() { // from class: com.aspose.slides.HyperlinkQueries.3
            @Override // com.aspose.slides.HyperlinkQueries.AbstractC0447k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo1706k4(IHyperlinkContainer iHyperlinkContainer) {
                return (iHyperlinkContainer.getHyperlinkClick() == null && iHyperlinkContainer.getHyperlinkMouseOver() == null) ? false : true;
            }
        });
    }

    @Override // com.aspose.slides.IHyperlinkQueries
    public final IGenericList<IHyperlinkContainer> getHyperlinkClicks() {
        return m1705k4(this.f2478k4, new AbstractC0447k4() { // from class: com.aspose.slides.HyperlinkQueries.1
            @Override // com.aspose.slides.HyperlinkQueries.AbstractC0447k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo1706k4(IHyperlinkContainer iHyperlinkContainer) {
                return iHyperlinkContainer.getHyperlinkClick() != null;
            }
        });
    }

    @Override // com.aspose.slides.IHyperlinkQueries
    public final IGenericList<IHyperlinkContainer> getHyperlinkMouseOvers() {
        return m1705k4(this.f2478k4, new AbstractC0447k4() { // from class: com.aspose.slides.HyperlinkQueries.2
            @Override // com.aspose.slides.HyperlinkQueries.AbstractC0447k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo1706k4(IHyperlinkContainer iHyperlinkContainer) {
                return iHyperlinkContainer.getHyperlinkMouseOver() != null;
            }
        });
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2478k4;
    }

    @Override // com.aspose.slides.IHyperlinkQueries
    public final void removeAllHyperlinks() {
        IGenericEnumerator<IHyperlinkContainer> it = getAnyHyperlinks().iterator();
        while (it.hasNext()) {
            try {
                IHyperlinkContainer next = it.next();
                next.getHyperlinkManager().removeHyperlinkClick();
                next.getHyperlinkManager().removeHyperlinkMouseOver();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
