package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12567ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class AudioFrame extends PictureFrame implements IAudioFrame {

    /* JADX INFO: renamed from: ix */
    private int f208ix;

    /* JADX INFO: renamed from: k4 */
    String f209k4;

    /* JADX INFO: renamed from: kk */
    int f210kk;

    /* JADX INFO: renamed from: ks */
    private boolean f211ks;

    /* JADX INFO: renamed from: ne */
    private int f212ne;

    /* JADX INFO: renamed from: rv */
    private int f213rv;

    /* JADX INFO: renamed from: to */
    boolean f214to;

    /* JADX INFO: renamed from: u4 */
    private int f215u4;

    /* JADX INFO: renamed from: uz */
    private boolean f216uz;

    /* JADX INFO: renamed from: wl */
    private boolean f217wl;

    /* JADX INFO: renamed from: x1 */
    String f218x1;

    /* JADX INFO: renamed from: x6 */
    private int f219x6;

    /* JADX INFO: renamed from: yj */
    private Audio f220yj;

    public AudioFrame(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj, new C14174na());
        this.f209k4 = "";
        this.f218x1 = "";
        m2560k4(new bwt(this));
    }

    @Override // com.aspose.slides.IAudioFrame
    public final int getAudioCdEndTrack() {
        return this.f208ix;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final int getAudioCdEndTrackTime() {
        return this.f215u4;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final int getAudioCdStartTrack() {
        return this.f219x6;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final int getAudioCdStartTrackTime() {
        return this.f212ne;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final boolean getEmbedded() {
        return this.f220yj != null;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final IAudio getEmbeddedAudio() {
        return this.f220yj;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final boolean getHideAtShowing() {
        return this.f214to;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final String getLinkPathLong() {
        return (getEmbedded() || mo272to().m67908k4() == 2) ? "" : this.f209k4;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final boolean getPlayAcrossSlides() {
        return this.f216uz;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final boolean getPlayLoopMode() {
        return this.f211ks;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final int getPlayMode() {
        return this.f210kk;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final boolean getRewindAudio() {
        return this.f217wl;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final int getVolume() {
        return this.f213rv;
    }

    @Override // com.aspose.slides.PictureFrame, com.aspose.slides.GeometryShape
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C14174na mo272to() {
        return (C14174na) super.mo272to();
    }

    @Override // com.aspose.slides.IAudioFrame
    public final void setAudioCdEndTrack(int i) {
        this.f208ix = i;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final void setAudioCdEndTrackTime(int i) {
        this.f215u4 = i;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final void setAudioCdStartTrack(int i) {
        this.f219x6 = i;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final void setAudioCdStartTrackTime(int i) {
        this.f212ne = i;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final void setEmbeddedAudio(IAudio iAudio) {
        if (iAudio != null && getPresentation() != ((Audio) iAudio).m253du()) {
            throw new PptxEditException("Can't assign Audio object from the another presentation.");
        }
        this.f220yj = (Audio) iAudio;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final void setHideAtShowing(boolean z) {
        this.f214to = z;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final void setLinkPathLong(String str) {
        if (getEmbedded() || mo272to().m67908k4() == 2) {
            return;
        }
        if (str != null && (C12567ne.f42086x1 || C12567ne.f42084kk)) {
            str = C14113y2.m67401k4(str, "\\", "/");
        }
        this.f209k4 = str;
        this.f218x1 = C3141rv.m13403k4(this.f209k4);
    }

    @Override // com.aspose.slides.IAudioFrame
    public final void setPlayAcrossSlides(boolean z) {
        this.f216uz = z;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final void setPlayLoopMode(boolean z) {
        this.f211ks = z;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final void setPlayMode(int i) {
        IGenericEnumerator<ISequence> it;
        this.f210kk = i;
        if (i == 0) {
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
            getSlide().getTimeline().getMainSequence().addEffect(this, 56, 0, 0);
            return;
        }
        if (i == 1) {
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
            getSlide().getTimeline().getInteractiveSequences().add(this).addEffect(this, 56, 0, 1);
            return;
        }
        if (i != 2) {
            if (i != 3) {
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
            return;
        }
        getSlide().getTimeline().getMainSequence().removeByShape(this);
        IGenericEnumerator<ISequence> it3 = getSlide().getTimeline().getInteractiveSequences().iterator();
        while (it3.hasNext()) {
            try {
                ((Sequence) it3.next()).removeByShape(this);
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
        getSlide().getTimeline().getMainSequence().addEffect(this, 56, 0, 0);
        this.f210kk = 0;
        setPlayAcrossSlides(true);
    }

    @Override // com.aspose.slides.IAudioFrame
    public final void setRewindAudio(boolean z) {
        this.f217wl = z;
    }

    @Override // com.aspose.slides.IAudioFrame
    public final void setVolume(int i) {
        this.f213rv = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m273x1() {
        getPictureFormat().getPicture().setImage(((ImageCollection) getPresentation().getImages()).m1739x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m270k4(AbstractC3150x6 abstractC3150x6) {
        this.f220yj = (Audio) ((AudioCollection) getPresentation().getAudios()).m263k4(abstractC3150x6);
        return true;
    }
}
