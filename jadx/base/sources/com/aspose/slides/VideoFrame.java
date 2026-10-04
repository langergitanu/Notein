package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class VideoFrame extends PictureFrame implements IVideoFrame {

    /* JADX INFO: renamed from: ix */
    private float f3661ix;

    /* JADX INFO: renamed from: k4 */
    String f3662k4;

    /* JADX INFO: renamed from: kk */
    Video f3663kk;

    /* JADX INFO: renamed from: ks */
    boolean f3664ks;

    /* JADX INFO: renamed from: ne */
    private float f3665ne;

    /* JADX INFO: renamed from: rv */
    boolean f3666rv;

    /* JADX INFO: renamed from: to */
    boolean f3667to;

    /* JADX INFO: renamed from: x1 */
    String f3668x1;

    /* JADX INFO: renamed from: x6 */
    boolean f3669x6;

    /* JADX INFO: renamed from: yj */
    int f3670yj;

    public VideoFrame(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj, new jmb());
        this.f3662k4 = "";
        this.f3668x1 = "";
        this.f3663kk = null;
        m2560k4(new bwt(this));
    }

    @Override // com.aspose.slides.IVideoFrame
    public final IVideo getEmbeddedVideo() {
        return this.f3663kk;
    }

    @Override // com.aspose.slides.IVideoFrame
    public final boolean getFullScreenMode() {
        return this.f3667to;
    }

    @Override // com.aspose.slides.IVideoFrame
    public final boolean getHideAtShowing() {
        return this.f3664ks;
    }

    @Override // com.aspose.slides.IVideoFrame
    public final String getLinkPathLong() {
        return this.f3662k4;
    }

    @Override // com.aspose.slides.IVideoFrame
    public final boolean getPlayLoopMode() {
        return this.f3666rv;
    }

    @Override // com.aspose.slides.IVideoFrame
    public final int getPlayMode() {
        return mo268du().m63437k4();
    }

    @Override // com.aspose.slides.IVideoFrame
    public final boolean getRewindVideo() {
        return this.f3669x6;
    }

    @Override // com.aspose.slides.IVideoFrame
    public final float getTrimFromEnd() {
        return this.f3661ix;
    }

    @Override // com.aspose.slides.IVideoFrame
    public final float getTrimFromStart() {
        return this.f3665ne;
    }

    @Override // com.aspose.slides.IVideoFrame
    public final int getVolume() {
        return this.f3670yj;
    }

    @Override // com.aspose.slides.PictureFrame, com.aspose.slides.Shape
    /* JADX INFO: renamed from: jd */
    public void mo280jd() {
        float width = getWidth() / getHeight();
        super.mo280jd();
        ShapeFrame shapeFrameM2593xk = ((Slide) m2583vj()).m2687bv().m406x1(getPlaceholder().getIndex()).m2593xk();
        if (shapeFrameM2593xk.getWidth() > shapeFrameM2593xk.getHeight()) {
            setHeight(shapeFrameM2593xk.getHeight());
            setWidth(getHeight() * width);
        } else {
            setWidth(shapeFrameM2593xk.getWidth());
            setHeight(getWidth() / width);
        }
        setX(shapeFrameM2593xk.getCenterX() - (getWidth() / 2.0f));
        setY(shapeFrameM2593xk.getCenterY() - (getHeight() / 2.0f));
    }

    @Override // com.aspose.slides.PictureFrame, com.aspose.slides.GeometryShape
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final jmb mo272to() {
        return (jmb) super.mo268du();
    }

    @Override // com.aspose.slides.IVideoFrame
    public final void setEmbeddedVideo(IVideo iVideo) {
        if (iVideo != null && getPresentation() != ((Video) iVideo).m3063kk()) {
            throw new PptxEditException("Can't assign Video object from the another presentation.");
        }
        this.f3663kk = (Video) iVideo;
    }

    @Override // com.aspose.slides.IVideoFrame
    public final void setFullScreenMode(boolean z) {
        this.f3667to = z;
    }

    @Override // com.aspose.slides.IVideoFrame
    public final void setHideAtShowing(boolean z) {
        this.f3664ks = z;
    }

    @Override // com.aspose.slides.IVideoFrame
    public final void setLinkPathLong(String str) {
        if (str != null) {
            this.f3662k4 = str;
            this.f3668x1 = C3141rv.m13403k4(str);
        } else {
            this.f3668x1 = null;
            this.f3662k4 = null;
        }
    }

    @Override // com.aspose.slides.IVideoFrame
    public final void setPlayLoopMode(boolean z) {
        this.f3666rv = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    @Override // com.aspose.slides.IVideoFrame
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setPlayMode(int i) {
        IGenericEnumerator<ISequence> it;
        mo268du().m63438k4(i);
        int iM63437k4 = mo268du().m63437k4();
        if (iM63437k4 == 0) {
            getSlide().getTimeline().getMainSequence().removeByShape(this);
            it = getSlide().getTimeline().getInteractiveSequences().iterator();
            while (it.hasNext()) {
                try {
                    ((Sequence) it.next()).removeByShape(this);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            getSlide().getTimeline().getMainSequence().addEffect(this, 56, 0, 0);
        } else if (iM63437k4 == 1) {
            getSlide().getTimeline().getMainSequence().removeByShape(this);
            IGenericEnumerator<ISequence> it2 = getSlide().getTimeline().getInteractiveSequences().iterator();
            while (it2.hasNext()) {
                try {
                    ((Sequence) it2.next()).removeByShape(this);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
        } else if (iM63437k4 != 2) {
            if (iM63437k4 != 3) {
                return;
            }
            getSlide().getTimeline().getMainSequence().removeByShape(this);
            it = getSlide().getTimeline().getInteractiveSequences().iterator();
            while (it.hasNext()) {
                try {
                    ((Sequence) it.next()).removeByShape(this);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            getSlide().getTimeline().getMainSequence().addEffect(this, 56, 0, 1);
        }
        getSlide().getTimeline().getInteractiveSequences().add(this).addEffect(this, 55, 0, 1);
    }

    @Override // com.aspose.slides.IVideoFrame
    public final void setRewindVideo(boolean z) {
        this.f3669x6 = z;
    }

    @Override // com.aspose.slides.IVideoFrame
    public final void setTrimFromEnd(float f) {
        this.f3661ix = f;
    }

    @Override // com.aspose.slides.IVideoFrame
    public final void setTrimFromStart(float f) {
        this.f3665ne = f;
    }

    @Override // com.aspose.slides.IVideoFrame
    public final void setVolume(int i) {
        this.f3670yj = i;
    }
}
