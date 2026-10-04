package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class oca {

    /* JADX INFO: renamed from: du */
    private int f47734du;

    /* JADX INFO: renamed from: k4 */
    private int f47736k4 = 0;

    /* JADX INFO: renamed from: x1 */
    private int f47740x1 = 0;

    /* JADX INFO: renamed from: kk */
    private int f47737kk = 0;

    /* JADX INFO: renamed from: to */
    private int f47739to = 0;

    /* JADX INFO: renamed from: h4 */
    private List<String> f47735h4 = new List<>();

    /* JADX INFO: renamed from: m9 */
    private List<String> f47738m9 = new List<>();

    public oca(IPresentation iPresentation) {
        this.f47734du = 0;
        this.f47734du = iPresentation.getSlides().size();
        boolean z = (iPresentation.getAudios().size() == 0 && iPresentation.getVideos().size() == 0) ? false : true;
        for (int i = 0; i < this.f47734du; i++) {
            ISlide iSlide = iPresentation.getSlides().get_Item(i);
            if (iSlide.getHidden()) {
                this.f47736k4++;
            }
            if (iSlide.getNotesSlideManager().getNotesSlide() != null) {
                this.f47740x1++;
            }
            if (z) {
                this.f47739to += m68443k4(iSlide.getShapes());
            }
            String[] strArr = {null};
            this.f47737kk += m68444k4(iSlide.getShapes(), strArr);
            String str = strArr[0];
            this.f47735h4.addItem(C14113y2.m67411k4(str) ? "PowerPoint Presentation" : C12380dy.m57972k4(str, "[\\u0000-\\u0008\\u000B\\u000C\\u000E-\\u001F]", ""));
        }
        IGenericEnumerator<IFontData> it = ((Presentation) iPresentation).m2389rv().m6639k4().m64810to().iterator();
        while (it.hasNext()) {
            try {
                this.f47738m9.addItem(it.next().getFontName());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: du */
    public final int m68446du() {
        return this.f47739to;
    }

    /* JADX INFO: renamed from: h4 */
    public final List<String> m68447h4() {
        return this.f47738m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m68448k4() {
        return this.f47736k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m68449kk() {
        return this.f47740x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final List<String> m68450m9() {
        return this.f47735h4;
    }

    /* JADX INFO: renamed from: to */
    public final int m68451to() {
        return this.f47737kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m68452x1() {
        return this.f47734du;
    }

    /* JADX INFO: renamed from: k4 */
    private int m68443k4(IShapeCollection iShapeCollection) {
        IGenericEnumerator<IShape> it = iShapeCollection.iterator();
        int iM68443k4 = 0;
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                if (C7019kk.m27469x1(next, GroupShape.class)) {
                    iM68443k4 += m68443k4(((GroupShape) next).getShapes());
                } else if (C7019kk.m27469x1(next, AudioFrame.class) || C7019kk.m27469x1(next, VideoFrame.class)) {
                    iM68443k4++;
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
        return iM68443k4;
    }

    /* JADX INFO: renamed from: k4 */
    private int m68444k4(IShapeCollection iShapeCollection, String[] strArr) {
        int iM68445k4;
        strArr[0] = null;
        IGenericEnumerator<ISmartArtNode> it = iShapeCollection.iterator();
        int iM68445k42 = 0;
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) next, AutoShape.class);
                if (autoShape == null) {
                    GroupShape groupShape = (GroupShape) C7019kk.m27452k4((Object) next, GroupShape.class);
                    if (groupShape != null) {
                        String[] strArr2 = {null};
                        iM68445k42 += m68444k4(groupShape.getShapes(), strArr2);
                        String str = strArr2[0];
                        if (str != null) {
                            strArr[0] = str;
                        }
                    } else {
                        Chart chart = (Chart) C7019kk.m27452k4((Object) next, Chart.class);
                        if (chart == null || chart.getUserShapes() == null) {
                            SmartArt smartArt = (SmartArt) C7019kk.m27452k4((Object) next, SmartArt.class);
                            if (smartArt != null) {
                                it = smartArt.getAllNodes().iterator();
                                while (it.hasNext()) {
                                    try {
                                        iM68445k42 += m68445k4(((SmartArtNode) it.next()).m2796k4().m71867k4());
                                    } finally {
                                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                            it.dispose();
                                        }
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                            } else {
                                continue;
                            }
                        } else {
                            iM68445k4 = m68444k4(chart.getUserShapes().getShapes(), new String[]{null});
                            iM68445k42 += iM68445k4;
                        }
                    }
                } else if (autoShape.getTextFrame() != null) {
                    if (strArr[0] == null && autoShape.getPlaceholder() != null && (autoShape.getPlaceholder().getType() == 0 || autoShape.getPlaceholder().getType() == 2)) {
                        strArr[0] = autoShape.m288x1().m2901c5();
                    }
                    iM68445k4 = m68445k4(autoShape.getTextFrame());
                    iM68445k42 += iM68445k4;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        return iM68445k42;
    }

    /* JADX INFO: renamed from: k4 */
    private int m68445k4(ITextFrame iTextFrame) {
        IGenericEnumerator<IParagraph> it = iTextFrame.getParagraphs().iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                IParagraph next = it.next();
                if (next.getPortions().getCount() == 1) {
                    if (((Portion) next.getPortions().get_Item(0)).m2292m9()) {
                        i++;
                    }
                } else if (next.getPortions().getCount() != 0) {
                    i++;
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
        return i;
    }
}
