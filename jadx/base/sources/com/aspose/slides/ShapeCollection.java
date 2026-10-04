package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.C11805rq;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18293o1;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ShapeCollection extends DomObject<GroupShape> implements IShapeCollection {

    /* JADX INFO: renamed from: x1 */
    private static final Dictionary<Integer, Integer> f3344x1 = GeometryShape.m1583k4(1, 2, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104);

    /* JADX INFO: renamed from: k4 */
    final List<IShape> f3345k4;

    public ShapeCollection(GroupShape groupShape) {
        super(groupShape);
        this.f3345k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    private AudioFrame m2606k4(int i, String str) {
        AudioFrame audioFrameM2609to = m2609to(i);
        audioFrameM2609to.setName(str);
        return audioFrameM2609to;
    }

    /* JADX INFO: renamed from: to */
    private AudioFrame m2609to(int i) {
        AudioFrame audioFrame = new AudioFrame(this);
        audioFrame.mo272to().m67909k4(i);
        audioFrame.setShapeType(5);
        audioFrame.getPictureFormat().setPictureFillMode(1);
        audioFrame.getPictureFrameLock().setRotationLocked(true);
        audioFrame.getPictureFrameLock().setAspectRatioLocked(true);
        audioFrame.m273x1();
        return audioFrame;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IAudioFrame addAudioFrameCD(float f, float f2, float f3, float f4) {
        AudioFrame audioFrameM2606k4 = m2606k4(2, "New Audio");
        m2608k4(-1, audioFrameM2606k4, f, f2, f3, f4);
        return audioFrameM2606k4;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IAudioFrame addAudioFrameEmbedded(float f, float f2, float f3, float f4, IAudio iAudio) {
        AudioFrame audioFrameM2619k4 = m2619k4(iAudio);
        m2608k4(-1, audioFrameM2619k4, f, f2, f3, f4);
        return audioFrameM2619k4;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IAudioFrame addAudioFrameLinked(float f, float f2, float f3, float f4, String str) {
        AudioFrame audioFrameM2648x1 = m2648x1(str);
        m2608k4(-1, audioFrameM2648x1, f, f2, f3, f4);
        return audioFrameM2648x1;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IAutoShape addAutoShape(int i, float f, float f2, float f3, float f4) {
        return addAutoShape(i, f, f2, f3, f4, true);
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IChart addChart(int i, float f, float f2, float f3, float f4) {
        return addChart(i, f, f2, f3, f4, true);
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IShape addClone(IShape iShape) {
        Shape shape = (Shape) sfn.m70606k4(this, iShape, (ShapeFrame) null);
        shape.m2574ss();
        if (shape.getLineFormat() != null) {
            shape.m2544b3();
        }
        return shape;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IConnector addConnector(int i, float f, float f2, float f3, float f4) {
        return addConnector(i, f, f2, f3, f4, true);
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IGroupShape addGroupShape() {
        GroupShape groupShapeM2654yj = m2654yj();
        m2608k4(-1, groupShapeM2654yj, 0.0f, 0.0f, 100.0f, 100.0f);
        return groupShapeM2654yj;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IAutoShape addMathShape(float f, float f2, float f3, float f4) {
        AutoShape autoShapeM2638kk = m2638kk(5);
        m2608k4(-1, autoShapeM2638kk, f, f2, f3, f4);
        return autoShapeM2638kk;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IOleObjectFrame addOleObjectFrame(float f, float f2, float f3, float f4, IOleEmbeddedDataInfo iOleEmbeddedDataInfo) {
        OleObjectFrame oleObjectFrameM2626k4 = m2626k4(f3, f4, iOleEmbeddedDataInfo);
        m2608k4(-1, oleObjectFrameM2626k4, f, f2, f3, f4);
        return oleObjectFrameM2626k4;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IPictureFrame addPictureFrame(int i, float f, float f2, float f3, float f4, IPPImage iPPImage) {
        PictureFrame pictureFrameM2629k4 = m2629k4(i, iPPImage, C7019kk.m27462to(Float.valueOf(f3), 13), C7019kk.m27462to(Float.valueOf(f4), 13));
        m2608k4(-1, pictureFrameM2629k4, f, f2, f3, f4);
        return pictureFrameM2629k4;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final ISectionZoomFrame addSectionZoomFrame(float f, float f2, float f3, float f4, ISection iSection) {
        return insertSectionZoomFrame(-1, f, f2, f3, f4, iSection);
    }

    @Override // com.aspose.slides.IShapeCollection
    public final ISmartArt addSmartArt(float f, float f2, float f3, float f4, int i) {
        SmartArt smartArtM2651x1 = m2651x1(i);
        m2608k4(-1, smartArtM2651x1, f, f2, f3, f4);
        smartArtM2651x1.m2778k4().m69206to();
        return smartArtM2651x1;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final ISummaryZoomFrame addSummaryZoomFrame(float f, float f2, float f3, float f4) {
        return insertSummaryZoomFrame(-1, f, f2, f3, f4);
    }

    @Override // com.aspose.slides.IShapeCollection
    public final ITable addTable(float f, float f2, double[] dArr, double[] dArr2) {
        double[] dArr3 = {0.0d};
        double[] dArr4 = {0.0d};
        Table tableM2632k4 = m2632k4(dArr, dArr2, dArr3, dArr4);
        m2608k4(-1, tableM2632k4, f, f2, (float) dArr3[0], (float) dArr4[0]);
        return tableM2632k4;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IVideoFrame addVideoFrame(float f, float f2, float f3, float f4, IVideo iVideo) {
        VideoFrame videoFrameM2633k4 = m2633k4(iVideo);
        m2608k4(-1, videoFrameM2633k4, f, f2, f3, f4);
        return videoFrameM2633k4;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IZoomFrame addZoomFrame(float f, float f2, float f3, float f4, ISlide iSlide) {
        return insertZoomFrame(-1, f, f2, f3, f4, iSlide);
    }

    /* JADX INFO: renamed from: c5 */
    public final AudioFrame m2611c5() {
        AudioFrame audioFrameM2609to = m2609to(2);
        m2636k4(audioFrameM2609to);
        axn.m3768k4(audioFrameM2609to);
        return audioFrameM2609to;
    }

    /* JADX INFO: renamed from: ck */
    public final AutoShape m2612ck() {
        AutoShape autoShape = new AutoShape(this);
        autoShape.setName("New shape");
        autoShape.getAutoShapeLock().setGroupingLocked(true);
        m2636k4(autoShape);
        return autoShape;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final void clear() {
        for (int size = size() - 1; size >= 0; size--) {
            removeAt(size);
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f3345k4.copyTo(abstractC14092to, i);
    }

    /* JADX INFO: renamed from: du */
    public final ZoomFrame m2613du() {
        ZoomFrame zoomFrame = new ZoomFrame(this);
        zoomFrame.getGraphicalObjectLock().setAspectRatioLocked(true);
        m2636k4(zoomFrame);
        axn.m3768k4(zoomFrame);
        return zoomFrame;
    }

    /* JADX INFO: renamed from: dy */
    public final VideoFrame m2614dy() {
        VideoFrame videoFrame = new VideoFrame(this);
        videoFrame.setShapeType(5);
        videoFrame.getPictureFormat().setPictureFillMode(1);
        videoFrame.setHyperlinkClick(Hyperlink.getMedia());
        m2636k4(videoFrame);
        axn.m3768k4(videoFrame);
        return videoFrame;
    }

    /* JADX INFO: renamed from: fa */
    public final AutoShape m2615fa() {
        AutoShape autoShape = new AutoShape(this);
        m2636k4(autoShape);
        axn.m3768k4(autoShape);
        return autoShape;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IGroupShape getParentGroup() {
        return (IGroupShape) this.f2127h4;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IShape get_Item(int i) {
        return this.f3345k4.get_Item(i);
    }

    /* JADX INFO: renamed from: h4 */
    public final SectionZoomFrame m2616h4() {
        SectionZoomFrame sectionZoomFrame = new SectionZoomFrame(this);
        sectionZoomFrame.getGraphicalObjectLock().setAspectRatioLocked(true);
        m2636k4(sectionZoomFrame);
        axn.m3768k4(sectionZoomFrame);
        return sectionZoomFrame;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final int indexOf(IShape iShape) {
        return this.f3345k4.indexOf(iShape);
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IAudioFrame insertAudioFrameCD(int i, float f, float f2, float f3, float f4) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index must be zero-based.");
        }
        AudioFrame audioFrameM2606k4 = m2606k4(2, "New Audio");
        m2608k4(i, audioFrameM2606k4, f, f2, f3, f4);
        return audioFrameM2606k4;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IAudioFrame insertAudioFrameEmbedded(int i, float f, float f2, float f3, float f4, IAudio iAudio) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index must be zero-based.");
        }
        AudioFrame audioFrameM2619k4 = m2619k4(iAudio);
        m2608k4(i, audioFrameM2619k4, f, f2, f3, f4);
        return audioFrameM2619k4;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IAudioFrame insertAudioFrameLinked(int i, float f, float f2, float f3, float f4, String str) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index must be zero-based.");
        }
        AudioFrame audioFrameM2648x1 = m2648x1(str);
        m2608k4(i, audioFrameM2648x1, f, f2, f3, f4);
        return audioFrameM2648x1;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IAutoShape insertAutoShape(int i, int i2, float f, float f2, float f3, float f4) {
        return insertAutoShape(i, i2, f, f2, f3, f4, true);
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IChart insertChart(int i, float f, float f2, float f3, float f4, int i2) {
        return insertChart(i, f, f2, f3, f4, i2, true);
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IShape insertClone(int i, IShape iShape) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index must be zero-based.");
        }
        IShape iShapeAddClone = addClone(iShape);
        this.f3345k4.removeItem(iShapeAddClone);
        this.f3345k4.insertItem(i, iShapeAddClone);
        return iShapeAddClone;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IConnector insertConnector(int i, int i2, float f, float f2, float f3, float f4) {
        return insertConnector(i, i2, f, f2, f3, f4, true);
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IGroupShape insertGroupShape(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index must be zero-based.");
        }
        GroupShape groupShapeM2654yj = m2654yj();
        m2608k4(i, groupShapeM2654yj, 0.0f, 0.0f, 100.0f, 100.0f);
        return groupShapeM2654yj;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IOleObjectFrame insertOleObjectFrame(int i, float f, float f2, float f3, float f4, IOleEmbeddedDataInfo iOleEmbeddedDataInfo) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index must be zero-based.");
        }
        OleObjectFrame oleObjectFrameM2626k4 = m2626k4(f3, f4, iOleEmbeddedDataInfo);
        m2608k4(i, oleObjectFrameM2626k4, f, f2, f3, f4);
        return oleObjectFrameM2626k4;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IPictureFrame insertPictureFrame(int i, int i2, float f, float f2, float f3, float f4, IPPImage iPPImage) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index must be zero-based.");
        }
        PictureFrame pictureFrameM2629k4 = m2629k4(i2, iPPImage, C7019kk.m27462to(Float.valueOf(f3), 13), C7019kk.m27462to(Float.valueOf(f4), 13));
        m2608k4(i, pictureFrameM2629k4, f, f2, f3, f4);
        return pictureFrameM2629k4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IShapeCollection
    public final ISectionZoomFrame insertSectionZoomFrame(int i, float f, float f2, float f3, float f4, ISection iSection) {
        if (iSection == null || iSection.getStartedFromSlide() == null || iSection.getStartedFromSlide().getPresentation() != ((GroupShape) this.f2127h4).getPresentation()) {
            throw new ArgumentException("Referenced slide of section does not belong to the current presentation.");
        }
        SectionZoomFrame sectionZoomFrame = new SectionZoomFrame(this);
        sectionZoomFrame.getGraphicalObjectLock().setAspectRatioLocked(true);
        sectionZoomFrame.setTargetSection(iSection);
        m2608k4(i, sectionZoomFrame, f, f2, f3, f4);
        return sectionZoomFrame;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final ISummaryZoomFrame insertSummaryZoomFrame(int i, float f, float f2, float f3, float f4) {
        SectionCollection sectionCollection = (SectionCollection) getParentGroup().getPresentation().getSections();
        if (sectionCollection.size() < 1) {
            throw new PptxEditException("There are no sections in the presentation, or the target slide does not belong to any section.");
        }
        SummaryZoomFrame summaryZoomFrame = new SummaryZoomFrame(this);
        summaryZoomFrame.getGraphicalObjectLock().setAspectRatioLocked(true);
        m2608k4(i, summaryZoomFrame, f, f2, f3, f4);
        ISection iSectionM2520k4 = sectionCollection.m2520k4((ISlide) getParentGroup().getSlide());
        if (iSectionM2520k4 == null) {
            throw new PptxEditException("There are no sections in the presentation, or the target slide does not belong to any section.");
        }
        ISummaryZoomSectionCollection summaryZoomCollection = summaryZoomFrame.getSummaryZoomCollection();
        for (int i2 = 0; i2 < getParentGroup().getPresentation().getSections().size(); i2++) {
            if (iSectionM2520k4 != getParentGroup().getPresentation().getSections().get_Item(i2)) {
                summaryZoomCollection.addSummaryZoomSection(sectionCollection.get_Item(i2));
            }
        }
        return summaryZoomFrame;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final ITable insertTable(int i, float f, float f2, double[] dArr, double[] dArr2) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index must be zero-based.");
        }
        double[] dArr3 = {0.0d};
        double[] dArr4 = {0.0d};
        Table tableM2632k4 = m2632k4(dArr, dArr2, dArr3, dArr4);
        m2608k4(i, tableM2632k4, f, f2, (float) dArr3[0], (float) dArr4[0]);
        return tableM2632k4;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IVideoFrame insertVideoFrame(int i, float f, float f2, float f3, float f4, String str) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index must be zero-based.");
        }
        VideoFrame videoFrameM2634k4 = m2634k4(str);
        m2608k4(i, videoFrameM2634k4, f, f2, f3, f4);
        return videoFrameM2634k4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IShapeCollection
    public final IZoomFrame insertZoomFrame(int i, float f, float f2, float f3, float f4, ISlide iSlide) {
        if (iSlide.getPresentation() != ((GroupShape) this.f2127h4).getPresentation()) {
            throw new ArgumentException("Referenced slide does not belong to the current presentation.");
        }
        ZoomFrame zoomFrame = new ZoomFrame(this);
        zoomFrame.getGraphicalObjectLock().setAspectRatioLocked(true);
        zoomFrame.setTargetSlide(iSlide);
        m2608k4(i, zoomFrame, f, f2, f3, f4);
        return zoomFrame;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IShape> iterator() {
        return this.f3345k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IShape> iteratorJava() {
        return this.f3345k4.iteratorJava();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ix */
    public final GroupShape m2617ix() {
        return (GroupShape) this.f2127h4;
    }

    /* JADX INFO: renamed from: jd */
    public final LegacyDiagram m2618jd() {
        LegacyDiagram legacyDiagram = new LegacyDiagram(this);
        m2636k4(legacyDiagram);
        axn.m3768k4(legacyDiagram);
        return legacyDiagram;
    }

    /* JADX INFO: renamed from: kk */
    public final AudioFrame m2637kk(String str) {
        AudioFrame audioFrameM2609to = m2609to(0);
        audioFrameM2609to.setLinkPathLong(str);
        m2636k4(audioFrameM2609to);
        axn.m3768k4(audioFrameM2609to);
        return audioFrameM2609to;
    }

    /* JADX INFO: renamed from: ks */
    public final GraphicalObject m2641ks() {
        GraphicalObject graphicalObjectM1636k4 = GraphicalObject.m1636k4(this);
        m2636k4(graphicalObjectM1636k4);
        axn.m3768k4(graphicalObjectM1636k4);
        return graphicalObjectM1636k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final SummaryZoomFrame m2642m9() {
        SummaryZoomFrame summaryZoomFrame = new SummaryZoomFrame(this);
        summaryZoomFrame.getGraphicalObjectLock().setAspectRatioLocked(true);
        m2636k4(summaryZoomFrame);
        axn.m3768k4(summaryZoomFrame);
        return summaryZoomFrame;
    }

    /* JADX INFO: renamed from: ne */
    public final Table m2643ne() {
        Table table = new Table(this);
        m2636k4(table);
        axn.m3768k4(table);
        return table;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final void remove(IShape iShape) {
        int iIndexOf = this.f3345k4.indexOf(iShape);
        if (iIndexOf >= 0) {
            removeAt(iIndexOf);
        }
    }

    @Override // com.aspose.slides.IShapeCollection
    public final void removeAt(int i) {
        Shape shape = (Shape) get_Item(i);
        if (m2617ix().getSlide() != null && m2617ix().getSlide().getTimeline() != null) {
            IGenericEnumerator<ISequence> it = m2617ix().getSlide().getTimeline().getInteractiveSequences().iterator();
            while (it.hasNext()) {
                try {
                    ((Sequence) it.next()).removeByShape(shape);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (m2617ix().getSlide().getTimeline().getMainSequence().getCount() > 0) {
                m2617ix().getSlide().getTimeline().getMainSequence().removeByShape(shape);
            }
        }
        shape.mo1642Q_();
        this.f3345k4.removeAt(i);
    }

    @Override // com.aspose.slides.IShapeCollection
    public final void reorder(int i, IShape iShape) {
        if (i < 0 || i >= size()) {
            throw new PptxEditException("Index must lay within [0..Count-1] range.");
        }
        if (((Shape) iShape).m2594xw() != this) {
            throw new PptxEditException("Trying to move a shape from other collection.");
        }
        int iIndexOf = this.f3345k4.indexOf(iShape);
        if (iIndexOf < 0) {
            throw new PptxEditException("Trying to move removed shapes.");
        }
        if (i == iIndexOf) {
            return;
        }
        synchronized (this.f3345k4.getSyncRoot()) {
            try {
                if (i < iIndexOf) {
                    while (iIndexOf > i) {
                        List<IShape> list = this.f3345k4;
                        list.set_Item(iIndexOf, list.get_Item(iIndexOf - 1));
                        iIndexOf--;
                    }
                } else {
                    while (iIndexOf < i) {
                        List<IShape> list2 = this.f3345k4;
                        int i2 = iIndexOf + 1;
                        list2.set_Item(iIndexOf, list2.get_Item(i2));
                        iIndexOf = i2;
                    }
                }
                this.f3345k4.set_Item(i, iShape);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: rv */
    public final Connector m2644rv() {
        Connector connector = new Connector(this);
        m2636k4(connector);
        axn.m3768k4(connector);
        return connector;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f3345k4.size();
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IShape[] toArray() {
        return this.f3345k4.toArray(new IShape[0]);
    }

    /* JADX INFO: renamed from: up */
    public final GroupShape m2646up() {
        GroupShape groupShape = new GroupShape(this);
        m2636k4(groupShape);
        groupShape.setFrame(new ShapeFrame(0.0f, 0.0f, 100.0f, 100.0f, (byte) 0, (byte) 0, 0.0f));
        return groupShape;
    }

    /* JADX INFO: renamed from: x1 */
    public final AudioFrame m2647x1(IAudio iAudio) {
        AudioFrame audioFrameM2609to = m2609to(1);
        audioFrameM2609to.setEmbeddedAudio(iAudio);
        m2636k4(audioFrameM2609to);
        axn.m3768k4(audioFrameM2609to);
        return audioFrameM2609to;
    }

    /* JADX INFO: renamed from: x6 */
    public final PictureFrame m2653x6() {
        PictureFrame pictureFrame = new PictureFrame(this);
        m2636k4(pictureFrame);
        axn.m3768k4(pictureFrame);
        return pictureFrame;
    }

    /* JADX INFO: renamed from: yj */
    public final GroupShape m2654yj() {
        return new GroupShape(this);
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IAudioFrame addAudioFrameEmbedded(float f, float f2, float f3, float f4, InputStream inputStream) {
        return m2624k4(f, f2, f3, f4, AbstractC3150x6.fromJava(inputStream));
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IAutoShape addAutoShape(int i, float f, float f2, float f3, float f4, boolean z) {
        AutoShape autoShapeM2649x1 = m2649x1(i, z);
        m2608k4(-1, autoShapeM2649x1, f, f2, f3, f4);
        return autoShapeM2649x1;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IChart addChart(int i, float f, float f2, float f3, float f4, boolean z) {
        Chart chartM2623k4 = m2623k4(i, z);
        m2608k4(-1, chartM2623k4, f, f2, f3, f4);
        return chartM2623k4;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IShape addClone(IShape iShape, float f, float f2) {
        if (C14064he.m66715kk(f)) {
            throw new ArgumentException("Value of x parameter must be defined (not a float.NaN).");
        }
        if (C14064he.m66715kk(f2)) {
            throw new ArgumentException("Value of y parameter must be defined (not a float.NaN).");
        }
        IShapeFrame frame = iShape.getFrame();
        Shape shape = (Shape) sfn.m70606k4(this, iShape, new ShapeFrame(f, f2, frame.getWidth(), frame.getHeight(), (byte) 0, (byte) 0, 0.0f));
        shape.m2574ss();
        return shape;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IConnector addConnector(int i, float f, float f2, float f3, float f4, boolean z) {
        Connector connectorM2639kk = m2639kk(i, z);
        m2608k4(-1, connectorM2639kk, f, f2, f3, f4);
        return connectorM2639kk;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IGroupShape addGroupShape(ISvgImage iSvgImage, float f, float f2, float f3, float f4) {
        C12007ix c12007ix = new C12007ix(f, f2, f3, f4);
        IGroupShape iGroupShapeAddGroupShape = addGroupShape();
        if (iSvgImage != null) {
            new no7().m68143k4(iGroupShapeAddGroupShape, iSvgImage.getSvgContent(), c12007ix.Clone());
        }
        return iGroupShapeAddGroupShape;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IOleObjectFrame addOleObjectFrame(float f, float f2, float f3, float f4, String str, String str2) {
        OleObjectFrame oleObjectFrameM2628k4 = m2628k4(f3, f4, str, str2);
        m2608k4(-1, oleObjectFrameM2628k4, f, f2, f3, f4);
        return oleObjectFrameM2628k4;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final ISectionZoomFrame addSectionZoomFrame(float f, float f2, float f3, float f4, ISection iSection, IPPImage iPPImage) {
        return insertSectionZoomFrame(-1, f, f2, f3, f4, iSection, iPPImage);
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IVideoFrame addVideoFrame(float f, float f2, float f3, float f4, String str) {
        VideoFrame videoFrameM2634k4 = m2634k4(str);
        m2608k4(-1, videoFrameM2634k4, f, f2, f3, f4);
        return videoFrameM2634k4;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IZoomFrame addZoomFrame(float f, float f2, float f3, float f4, ISlide iSlide, IPPImage iPPImage) {
        return insertZoomFrame(-1, f, f2, f3, f4, iSlide, iPPImage);
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IAudioFrame insertAudioFrameEmbedded(int i, float f, float f2, float f3, float f4, InputStream inputStream) {
        return m2625k4(i, f, f2, f3, f4, AbstractC3150x6.fromJava(inputStream));
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IAutoShape insertAutoShape(int i, int i2, float f, float f2, float f3, float f4, boolean z) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index must be zero-based.");
        }
        AutoShape autoShapeM2649x1 = m2649x1(i2, z);
        m2608k4(i, autoShapeM2649x1, f, f2, f3, f4);
        return autoShapeM2649x1;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IChart insertChart(int i, float f, float f2, float f3, float f4, int i2, boolean z) {
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("index must be zero-based.");
        }
        Chart chartM2623k4 = m2623k4(i, z);
        m2608k4(i2, chartM2623k4, f, f2, f3, f4);
        return chartM2623k4;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IShape insertClone(int i, IShape iShape, float f, float f2) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index must be zero-based.");
        }
        IShape iShapeAddClone = addClone(iShape, f, f2);
        this.f3345k4.removeItem(iShapeAddClone);
        this.f3345k4.insertItem(i, iShapeAddClone);
        return iShapeAddClone;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IConnector insertConnector(int i, int i2, float f, float f2, float f3, float f4, boolean z) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index must be zero-based.");
        }
        Connector connectorM2639kk = m2639kk(i2, z);
        m2608k4(i, connectorM2639kk, f, f2, f3, f4);
        return connectorM2639kk;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IOleObjectFrame insertOleObjectFrame(int i, float f, float f2, float f3, float f4, String str, String str2) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index must be zero-based.");
        }
        OleObjectFrame oleObjectFrameM2628k4 = m2628k4(f3, f4, str, str2);
        m2608k4(i, oleObjectFrameM2628k4, f, f2, f3, f4);
        return oleObjectFrameM2628k4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IShapeCollection
    public final ISectionZoomFrame insertSectionZoomFrame(int i, float f, float f2, float f3, float f4, ISection iSection, IPPImage iPPImage) {
        if (iSection == null || iSection.getStartedFromSlide() == null || iSection.getStartedFromSlide().getPresentation() != ((GroupShape) this.f2127h4).getPresentation()) {
            throw new ArgumentException("Referenced slide of section does not belong to the current presentation.");
        }
        SectionZoomFrame sectionZoomFrame = new SectionZoomFrame(this);
        sectionZoomFrame.getGraphicalObjectLock().setAspectRatioLocked(true);
        sectionZoomFrame.m2526k4(iSection);
        sectionZoomFrame.m3131x1(iSection.getStartedFromSlide());
        sectionZoomFrame.setZoomImage(iPPImage);
        m2608k4(i, sectionZoomFrame, f, f2, f3, f4);
        return sectionZoomFrame;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IShapeCollection
    public final IZoomFrame insertZoomFrame(int i, float f, float f2, float f3, float f4, ISlide iSlide, IPPImage iPPImage) {
        if (iSlide.getPresentation() != ((GroupShape) this.f2127h4).getPresentation()) {
            throw new ArgumentException("Referenced slide does not belong to the current presentation.");
        }
        ZoomFrame zoomFrame = new ZoomFrame(this);
        zoomFrame.getGraphicalObjectLock().setAspectRatioLocked(true);
        zoomFrame.m3131x1(iSlide);
        Slide slide = (Slide) iSlide;
        zoomFrame.m3130x1(slide.getSlideId());
        zoomFrame.m3122k4(slide.m389k4());
        zoomFrame.setZoomImage(iPPImage);
        m2608k4(i, zoomFrame, f, f2, f3, f4);
        return zoomFrame;
    }

    /* JADX INFO: renamed from: k4 */
    public final AudioFrame m2619k4(IAudio iAudio) {
        AudioFrame audioFrameM2606k4 = m2606k4(1, "New Audio");
        audioFrameM2606k4.setEmbeddedAudio(iAudio);
        audioFrameM2606k4.mo272to().m69038h4(C14854yo.m73950k4(audioFrameM2606k4.mo272to()));
        return audioFrameM2606k4;
    }

    /* JADX INFO: renamed from: kk */
    public final AutoShape m2638kk(int i) {
        AutoShape autoShape = new AutoShape(this);
        autoShape.setName("New math shape");
        autoShape.addTextFrame("");
        ((TextFrameFormat) autoShape.m288x1().getTextFrameFormat()).m2953k4(xmh.f50156k4.Clone());
        MathPortion mathPortion = new MathPortion();
        ((MathParagraph) mathPortion.getMathParagraph()).m1998k4(true);
        autoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().clear();
        autoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().add(mathPortion);
        autoShape.setShapeType(i);
        return autoShape;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final void reorder(int i, IShape... iShapeArr) {
        int i2;
        if (i < 0 || i > size() - iShapeArr.length) {
            throw new PptxEditException("Index must lay within [0..Count - slides.Length] range.");
        }
        if (iShapeArr.length == 0) {
            return;
        }
        Dictionary dictionary = new Dictionary(iShapeArr.length);
        for (int i3 = 0; i3 < iShapeArr.length; i3++) {
            if (((Shape) iShapeArr[i3]).m2594xw() != this) {
                throw new PptxEditException("Trying to move a shape from other presentation.");
            }
            if (dictionary.containsKey(iShapeArr[i3])) {
                throw new PptxEditException(C14113y2.m67408k4("Trying to move the same shape twice. Shape index: ", C14057f9.m66591x1(i3)));
            }
            IShape iShape = iShapeArr[i3];
            dictionary.set_Item(iShape, iShape);
        }
        int size = this.f3345k4.size();
        int length = iShapeArr.length;
        int[] iArr = new int[length];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            if (dictionary.containsKey(this.f3345k4.get_Item(i5))) {
                iArr[i4] = i5;
                i4++;
            }
        }
        if (i4 < iShapeArr.length) {
            throw new PptxEditException("Trying to move removed slide.");
        }
        synchronized (this.f3345k4.getSyncRoot()) {
            int i6 = 0;
            while (true) {
                i2 = length - 1;
                if (i6 >= i2) {
                    break;
                }
                try {
                    int i7 = i6 + 1;
                    int i8 = (iArr[i7] - i6) - 2;
                    if (i8 >= i) {
                        i8 = i - 1;
                    }
                    for (int i9 = iArr[i6] - i6; i9 <= i8; i9++) {
                        this.f3345k4.set_Item(i9, iShapeArr[i9 + i6 + 1]);
                    }
                    if (i8 == i - 1) {
                        break;
                    } else {
                        i6 = i7;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int length2 = iShapeArr.length + i;
            int i10 = length2 - 1;
            int i11 = 0;
            int i12 = i2;
            while (i11 < i2) {
                int i13 = iArr[i12 - 1] + i11 + 2;
                if (i13 <= i10) {
                    i13 = length2;
                }
                for (int i14 = iArr[i12] + i11; i14 >= i13; i14--) {
                    this.f3345k4.set_Item(i14, iShapeArr[(i14 - i11) - 1]);
                }
                if (i13 == length2) {
                    break;
                }
                i11++;
                i12--;
            }
            for (int i15 = 0; i15 < iShapeArr.length; i15++) {
                this.f3345k4.set_Item(i + i15, iShapeArr[i15]);
            }
        }
    }

    /* JADX INFO: renamed from: to */
    public final OleObjectFrame m2645to() {
        OleObjectFrame oleObjectFrame = new OleObjectFrame(this);
        oleObjectFrame.getGraphicalObjectLock().setAspectRatioLocked(true);
        m2636k4(oleObjectFrame);
        axn.m3768k4(oleObjectFrame);
        return oleObjectFrame;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IShape[] toArray(int i, int i2) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("startIndex");
        }
        if (i2 < 0 || i + i2 > size()) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        Shape[] shapeArr = new Shape[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            shapeArr[i3] = (Shape) this.f3345k4.get_Item(i3 + i);
        }
        return shapeArr;
    }

    /* JADX INFO: renamed from: x1 */
    public final AudioFrame m2648x1(String str) {
        AudioFrame audioFrameM2606k4 = m2606k4(0, "New Audio");
        audioFrameM2606k4.setLinkPathLong(str);
        return audioFrameM2606k4;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IShape addClone(IShape iShape, float f, float f2, float f3, float f4) {
        if (C14064he.m66715kk(f)) {
            throw new ArgumentException("Value of x parameter must be defined (not a float.NaN).");
        }
        if (C14064he.m66715kk(f2)) {
            throw new ArgumentException("Value of y parameter must be defined (not a float.NaN).");
        }
        if (C14064he.m66715kk(f3)) {
            throw new ArgumentException("Value of width parameter must be defined (not a float.NaN).");
        }
        if (C14064he.m66715kk(f4)) {
            throw new ArgumentException("Value of height parameter must be defined (not a float.NaN).");
        }
        Shape shape = (Shape) sfn.m70606k4(this, iShape, new ShapeFrame(f, f2, f3, f4, (byte) 0, (byte) 0, 0.0f));
        shape.m2574ss();
        return shape;
    }

    @Override // com.aspose.slides.IShapeCollection
    public final IShape insertClone(int i, IShape iShape, float f, float f2, float f3, float f4) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index must be zero-based.");
        }
        IShape iShapeAddClone = addClone(iShape, f, f2, f3, f4);
        this.f3345k4.removeItem(iShapeAddClone);
        this.f3345k4.insertItem(i, iShapeAddClone);
        return iShapeAddClone;
    }

    /* JADX INFO: renamed from: k4 */
    public final AudioFrame m2620k4(AbstractC3150x6 abstractC3150x6) {
        AudioFrame audioFrameM2606k4 = m2606k4(1, "New Audio");
        audioFrameM2606k4.m270k4(abstractC3150x6);
        audioFrameM2606k4.mo272to().m69038h4(C14854yo.m73950k4(audioFrameM2606k4.mo272to()));
        return audioFrameM2606k4;
    }

    /* JADX INFO: renamed from: kk */
    public final Connector m2639kk(int i, boolean z) {
        if (!Connector.f2031k4.containsKey(Integer.valueOf(i))) {
            throw new PptxEditException(C14113y2.m67408k4("Incorrect ShapeType value for Connector specified: ", C14042ak.m66410k4(ShapeType.class, i)));
        }
        Connector connector = new Connector(this);
        if (z) {
            connector.setName("New connector");
            connector.m1588rv();
            connector.getShapeStyle().getLineColor().setSchemeColor(4);
            connector.getShapeStyle().getFillColor().setSchemeColor(4);
            connector.getShapeStyle().getEffectColor().setSchemeColor(4);
            connector.getShapeStyle().setEffectStyleIndex(0L);
            connector.getShapeStyle().setFontCollectionIndex((byte) 1);
            connector.getShapeStyle().setLineStyleIndex(1);
            connector.getShapeStyle().setFillStyleIndex((short) 0);
            connector.getShapeStyle().getFontColor().setSchemeColor(1);
            connector.setRawFrame(new ShapeFrame(0.0f, 0.0f, 100.0f, 100.0f, (byte) 0, (byte) 0, 0.0f));
        }
        connector.setShapeType(i);
        return connector;
    }

    /* JADX INFO: renamed from: x1 */
    public final AutoShape m2649x1(int i, boolean z) {
        AutoShape autoShape = new AutoShape(this);
        if (z) {
            autoShape.setName("New shape");
            autoShape.m1588rv();
            autoShape.getShapeStyle().getLineColor().setSchemeColor(4);
            autoShape.getShapeStyle().getFillColor().setSchemeColor(4);
            autoShape.getShapeStyle().getEffectColor().setSchemeColor(4);
            autoShape.getShapeStyle().setEffectStyleIndex(0L);
            autoShape.getShapeStyle().setFontCollectionIndex((byte) 1);
            if (f3344x1.containsKey(Integer.valueOf(i))) {
                autoShape.getShapeStyle().setLineStyleIndex(1);
                autoShape.getShapeStyle().setFillStyleIndex((short) 0);
                autoShape.getShapeStyle().getFontColor().setSchemeColor(1);
            } else {
                autoShape.getShapeStyle().getLineColor().getColorTransform().add(1, 0.5f);
                autoShape.getShapeStyle().setLineStyleIndex(2);
                autoShape.getShapeStyle().setFillStyleIndex((short) 1);
                autoShape.getShapeStyle().getFontColor().setSchemeColor(14);
            }
            autoShape.addTextFrame("");
            ((TextFrame) autoShape.getTextFrame()).f3519k4.m2970x1((byte) 0);
            autoShape.getTextFrame().getTextFrameFormat().setAnchoringType((byte) 1);
            autoShape.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().setAlignment(1);
            autoShape.setRawFrame(new ShapeFrame(0.0f, 0.0f, 100.0f, 100.0f, (byte) 0, (byte) 0, 0.0f));
        }
        autoShape.setShapeType(i);
        return autoShape;
    }

    /* JADX INFO: renamed from: k4 */
    public final Chart m2621k4(int i) {
        return m2622k4(i, 0);
    }

    /* JADX INFO: renamed from: kk */
    public final SmartArt m2640kk() {
        SmartArt smartArt = new SmartArt(this);
        m2636k4(smartArt);
        axn.m3768k4(smartArt);
        return smartArt;
    }

    /* JADX INFO: renamed from: x1 */
    public final Ink m2650x1() {
        Ink ink = new Ink(this);
        m2636k4(ink);
        axn.m3768k4(ink);
        return ink;
    }

    /* JADX INFO: renamed from: k4 */
    public final Chart m2622k4(int i, int i2) {
        Chart chart = new Chart(this, i);
        chart.m519x1(i2);
        m2636k4(chart);
        axn.m3768k4(chart);
        return chart;
    }

    /* JADX INFO: renamed from: x1 */
    public final SmartArt m2651x1(int i) {
        if (i == 134) {
            throw new ArgumentException("Can't create SmartArt with Custom layout type", "layoutType");
        }
        SmartArt smartArt = new SmartArt(this, m2617ix().getPresentation(), i);
        smartArt.setName("New Diagram");
        return smartArt;
    }

    /* JADX INFO: renamed from: x1 */
    private Table m2610x1(double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4) {
        if (dArr == null) {
            throw new ArgumentNullException("columnWidths");
        }
        if (dArr2 == null) {
            throw new ArgumentNullException("rowHeights");
        }
        if (dArr.length == 0 || dArr2.length == 0) {
            throw new PptxEditException("Table must contain at least one row and one column.");
        }
        dArr3[0] = 0.0d;
        dArr4[0] = 0.0d;
        for (double d : dArr) {
            if (d > 0.0d) {
                dArr3[0] = dArr3[0] + d;
            } else {
                dArr3[0] = dArr3[0] + 2.0d;
            }
        }
        for (double d2 : dArr2) {
            if (d2 > 0.0d) {
                dArr4[0] = dArr4[0] + d2;
            } else {
                dArr4[0] = dArr4[0] + 2.0d;
            }
        }
        Table table = new Table(this);
        table.getGraphicalObjectLock().setGroupingLocked(true);
        ColumnCollection columnCollection = (ColumnCollection) table.getColumns();
        RowCollection rowCollection = (RowCollection) table.getRows();
        columnCollection.m1150k4(480.0d);
        columnCollection.m1150k4(480.0d);
        rowCollection.m2490k4(29.2d);
        rowCollection.m2490k4(29.2d);
        table.m2869k4(0, 0).getTextFrame().setText("");
        table.m2872k4(dArr, dArr2);
        C14047bz c14047bzClone = ((Presentation) m2617ix().getPresentation()).m2394uz().m68910k4().m6439x1().Clone();
        if (C14047bz.m66537x1(c14047bzClone, C14047bz.f47172k4)) {
            table.m2871k4(((Presentation) m2617ix().getPresentation()).m2394uz().m68912k4(c14047bzClone.Clone()));
        }
        return table;
    }

    /* JADX INFO: renamed from: k4 */
    public final Chart m2623k4(int i, boolean z) {
        Chart chart = new Chart(this, i);
        if (z) {
            new C14724w5().m72634k4(chart, i);
        } else if (ChartTypeCharacterizer.m767to(i)) {
            chart.m513ks().m63802k4(0);
            chart.m513ks().m63821x1(0);
        }
        chart.setName("ChartObject");
        return chart;
    }

    /* JADX INFO: renamed from: k4 */
    public IAudioFrame m2624k4(float f, float f2, float f3, float f4, AbstractC3150x6 abstractC3150x6) {
        AudioFrame audioFrameM2620k4 = m2620k4(abstractC3150x6);
        m2608k4(-1, audioFrameM2620k4, f, f2, f3, f4);
        return audioFrameM2620k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final VideoFrame m2652x1(IVideo iVideo) {
        VideoFrame videoFrame = new VideoFrame(this);
        videoFrame.setShapeType(5);
        videoFrame.getPictureFormat().setPictureFillMode(1);
        videoFrame.setHyperlinkClick(Hyperlink.getMedia());
        videoFrame.setEmbeddedVideo(iVideo);
        m2636k4(videoFrame);
        axn.m3768k4(videoFrame);
        return videoFrame;
    }

    /* JADX INFO: renamed from: k4 */
    public IAudioFrame m2625k4(int i, float f, float f2, float f3, float f4, AbstractC3150x6 abstractC3150x6) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index must be zero-based.");
        }
        AudioFrame audioFrameM2620k4 = m2620k4(abstractC3150x6);
        m2608k4(i, audioFrameM2620k4, f, f2, f3, f4);
        return audioFrameM2620k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final OleObjectFrame m2626k4(float f, float f2, IOleEmbeddedDataInfo iOleEmbeddedDataInfo) {
        String strM67361du = C14113y2.m67361du(iOleEmbeddedDataInfo.getEmbeddedFileExtension());
        String strM67408k4 = C14113y2.m67408k4(".", strM67361du);
        if (!gbd.m6466k4().containsKey(strM67361du)) {
            String str = C14113y2.f47374k4;
            IGenericEnumerator<String> it = gbd.m6466k4().getKeys().iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (C14113y2.m67363du(gbd.m6466k4().get_Item(next).m69541k4(), strM67408k4)) {
                        str = next;
                        break;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C14113y2.m67411k4(str)) {
                gbd.m6466k4().addItem(strM67361du, new qdi(strM67408k4, new C11805rq(), "0", "package"));
            } else {
                strM67361du = str;
            }
        }
        OleObjectFrame oleObjectFrameM2627k4 = m2627k4(f, f2, strM67361du);
        oleObjectFrameM2627k4.setEmbeddedData(iOleEmbeddedDataInfo);
        return oleObjectFrameM2627k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final OleObjectFrame m2627k4(float f, float f2, String str) {
        OleObjectFrame oleObjectFrame = new OleObjectFrame(this);
        oleObjectFrame.setName("OleObject");
        oleObjectFrame.getGraphicalObjectLock().setAspectRatioLocked(true);
        oleObjectFrame.setObjectProgId(str);
        Presentation presentation = (Presentation) getParentGroup().getPresentation();
        ImageCollection imageCollection = (ImageCollection) presentation.getImages();
        final C12015qq[] c12015qqArr = {m2607k4(f, f2)};
        PPImage pPImageFind = imageCollection.m1737to().find(new AbstractC14041ai<PPImage>() { // from class: com.aspose.slides.ShapeCollection.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(PPImage pPImage) {
                return pPImage.getWidth() == C7019kk.m27462to(Float.valueOf(c12015qqArr[0].m56699x1()), 13) && pPImage.getHeight() == C7019kk.m27462to(Float.valueOf(c12015qqArr[0].m56697kk()), 13);
            }
        });
        if (pPImageFind == null) {
            C12015qq c12015qqClone = C3099wl.m13184k4(96, new C12015qq(f, f2)).Clone();
            C12009k4 c12009k4 = new C12009k4(imageCollection.m1735kk().m2131k4(), C7019kk.m27462to(Float.valueOf(c12015qqClone.m56699x1()), 13), C7019kk.m27462to(Float.valueOf(c12015qqClone.m56697kk()), 13));
            try {
                C3152yj c3152yj = new C3152yj();
                try {
                    c12009k4.m56333k4(c3152yj, C3977ck.m15681jd());
                    pPImageFind = new PPImage(presentation, c3152yj.toArray());
                    c12009k4.dispose();
                    imageCollection.m1737to().addItem(pPImageFind);
                } finally {
                    c3152yj.dispose();
                }
            } catch (Throwable th) {
                c12009k4.dispose();
                throw th;
            }
        }
        oleObjectFrame.getSubstitutePictureFormat().getPicture().setImage(pPImageFind);
        return oleObjectFrame;
    }

    /* JADX INFO: renamed from: k4 */
    public final OleObjectFrame m2628k4(float f, float f2, String str, String str2) {
        OleObjectFrame oleObjectFrameM2627k4 = m2627k4(f, f2, str);
        oleObjectFrameM2627k4.setLinkPathLong(str2);
        return oleObjectFrameM2627k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final PictureFrame m2629k4(int i, IPPImage iPPImage, int i2, int i3) {
        if (!PictureFrame.f3031m9.containsKey(Integer.valueOf(i))) {
            throw new PptxEditException(C14113y2.m67408k4("Incorrect ShapeType value for PictureFrame specified: ", C14042ak.m66410k4(ShapeType.class, i)));
        }
        PictureFrame pictureFrame = new PictureFrame(this);
        pictureFrame.setShapeType(i);
        pictureFrame.getPictureFormat().setPictureFillMode(1);
        pictureFrame.setName("New picture");
        pictureFrame.setFrame(new ShapeFrame(0.0f, 0.0f, i2, i3, (byte) 0, (byte) 0, 0.0f));
        pictureFrame.m2262k4(iPPImage);
        return pictureFrame;
    }

    /* JADX INFO: renamed from: k4 */
    public final Shape m2630k4() {
        Shape shape = new Shape(this);
        m2636k4(shape);
        axn.m3768k4(shape);
        return shape;
    }

    /* JADX INFO: renamed from: k4 */
    public final Table m2631k4(double[] dArr, double[] dArr2) {
        double[] dArr3 = {0.0d};
        double[] dArr4 = {0.0d};
        Table tableM2610x1 = m2610x1(dArr, dArr2, dArr3, dArr4);
        double d = dArr3[0];
        double d2 = dArr4[0];
        m2636k4(tableM2610x1);
        axn.m3768k4(tableM2610x1);
        tableM2610x1.setFrame(new ShapeFrame(0.0d, 0.0d, d, d2, (byte) 0, (byte) 0, 0.0f));
        return tableM2610x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final Table m2632k4(double[] dArr, double[] dArr2, double[] dArr3, double[] dArr4) {
        Table tableM2610x1 = m2610x1(dArr, dArr2, dArr3, dArr4);
        tableM2610x1.setName("New Table");
        tableM2610x1.setFirstRow(true);
        tableM2610x1.setHorizontalBanding(true);
        return tableM2610x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final VideoFrame m2633k4(IVideo iVideo) {
        VideoFrame videoFrame = new VideoFrame(this);
        videoFrame.setShapeType(5);
        videoFrame.getPictureFormat().setPictureFillMode(1);
        videoFrame.setName("New video");
        videoFrame.setHyperlinkClick(Hyperlink.getMedia());
        videoFrame.setEmbeddedVideo(iVideo);
        videoFrame.mo268du().m69038h4(C14854yo.m73950k4(videoFrame.mo268du()));
        return videoFrame;
    }

    /* JADX INFO: renamed from: k4 */
    public final VideoFrame m2634k4(String str) {
        VideoFrame videoFrame = new VideoFrame(this);
        videoFrame.setShapeType(5);
        videoFrame.getPictureFormat().setPictureFillMode(1);
        videoFrame.setName("New picture");
        videoFrame.setHyperlinkClick(Hyperlink.getMedia());
        videoFrame.setLinkPathLong(str);
        videoFrame.mo268du().m69038h4(C14854yo.m73950k4(videoFrame.mo268du()));
        return videoFrame;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12015qq m2607k4(float f, float f2) {
        return C3099wl.m13184k4(96, new C12015qq(f, f2));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2635k4(int i, Shape shape) {
        this.f3345k4.insertItem(i, shape);
    }

    /* JADX INFO: renamed from: k4 */
    private void m2608k4(int i, Shape shape, float f, float f2, float f3, float f4) {
        if (C14064he.m66715kk(f)) {
            throw new ArgumentException("Value of x parameter must be defined (not a float.NaN).");
        }
        if (C14064he.m66715kk(f2)) {
            throw new ArgumentException("Value of y parameter must be defined (not a float.NaN).");
        }
        if (C14064he.m66715kk(f3)) {
            throw new ArgumentException("Value of width parameter must be defined (not a float.NaN).");
        }
        if (C14064he.m66715kk(f4)) {
            throw new ArgumentException("Value of height parameter must be defined (not a float.NaN).");
        }
        if (i == -1) {
            m2636k4(shape);
        } else {
            m2635k4(i, shape);
        }
        shape.m2574ss();
        shape.setFrame(new ShapeFrame(f, f2, f3, f4, (byte) 0, (byte) 0, 0.0f));
        shape.m2544b3();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2636k4(Shape shape) {
        this.f3345k4.addItem(shape);
    }
}
