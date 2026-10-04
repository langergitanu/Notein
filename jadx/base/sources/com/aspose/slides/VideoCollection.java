package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p456v5.C11610to;
import com.aspose.slides.internal.p482wr.C12262lr;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.internal.p541z6.InterfaceC13443dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.IDisposable;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class VideoCollection extends DomObject<Presentation> implements IVideoCollection {

    /* JADX INFO: renamed from: k4 */
    private final List<IVideo> f3660k4;

    public VideoCollection(Presentation presentation) {
        super(presentation);
        this.f3660k4 = new List<>();
    }

    @Override // com.aspose.slides.IVideoCollection
    public final IVideo addVideo(IVideo iVideo) {
        Video video = (Video) iVideo;
        List.Enumerator<IVideo> it = this.f3660k4.iterator();
        while (it.hasNext()) {
            try {
                if (video == ((Video) it.next())) {
                    return iVideo;
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
        return m3071k4(video.m3065x1(), video.getContentType(), video.m3064to());
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f3660k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IVideoCollection
    public final IVideo get_Item(int i) {
        return (Video) this.f3660k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IVideo> iterator() {
        return this.f3660k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IVideo> iteratorJava() {
        return this.f3660k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public IVideo m3067k4(AbstractC3150x6 abstractC3150x6) {
        return m3071k4(C13447k4.m62559k4(abstractC3150x6), (String) null, (String) null);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f3660k4.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final Presentation m3073x1() {
        return (Presentation) this.f2127h4;
    }

    @Override // com.aspose.slides.IVideoCollection
    public final IVideo addVideo(InputStream inputStream) {
        return m3067k4(AbstractC3150x6.fromJava(inputStream));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public IVideo m3068k4(AbstractC3150x6 abstractC3150x6, int i) {
        InterfaceC13443dy interfaceC13443dyM62578k4;
        if (i == 0) {
            interfaceC13443dyM62578k4 = ((Presentation) this.f2127h4).m2388qq().m62578k4((AbstractC3150x6) C13447k4.m62561x1(abstractC3150x6), false, true);
        } else {
            if (i != 1) {
                throw new ArgumentOutOfRangeException("loadingStreamBehavior", C14042ak.m66410k4(LoadingStreamBehavior.class, i), null);
            }
            interfaceC13443dyM62578k4 = ((Presentation) this.f2127h4).m2388qq().m62576k4(abstractC3150x6);
        }
        Video video = new Video(this, interfaceC13443dyM62578k4);
        this.f3660k4.addItem(video);
        return video;
    }

    @Override // com.aspose.slides.IVideoCollection
    public final IVideo addVideo(InputStream inputStream, int i) {
        return m3068k4(AbstractC3150x6.fromJava(inputStream), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final Video m3069k4(C12262lr c12262lr, String str, String str2) {
        return m3070k4(((Presentation) this.f2127h4).m2388qq().m62580k4(c12262lr, ((Presentation) this.f2127h4).m2349du().getBlobManagementOptions().getPresentationLockingBehavior() == 1), str, str2);
    }

    @Override // com.aspose.slides.IVideoCollection
    public final IVideo addVideo(byte[] bArr) {
        return m3071k4((byte[]) bArr.clone(), (String) null, (String) null);
    }

    /* JADX INFO: renamed from: k4 */
    public final Video m3070k4(InterfaceC13443dy interfaceC13443dy, String str, String str2) {
        Video video = new Video(this, interfaceC13443dy, str, str2);
        this.f3660k4.addItem(video);
        return video;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final Video m3071k4(byte[] bArr, String str, String str2) {
        Video[] videoArr = {null};
        boolean zM3066k4 = m3066k4(bArr, videoArr);
        Video video = videoArr[0];
        if (zM3066k4) {
            return video;
        }
        Video video2 = new Video(this, ((Presentation) this.f2127h4).m2388qq().m62581k4(bArr), str, str2);
        this.f3660k4.addItem(video2);
        return video2;
    }

    /* JADX INFO: renamed from: k4 */
    public void m3072k4() {
        this.f3660k4.clear();
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m3066k4(byte[] bArr, Video[] videoArr) {
        videoArr[0] = null;
        long jM54691k4 = C11610to.m54691k4(bArr);
        List.Enumerator<IVideo> it = this.f3660k4.iterator();
        while (it.hasNext()) {
            try {
                Video video = (Video) it.next();
                if ((video.m3062k4() & 4294967295L) == (4294967295L & jM54691k4) && video.m3065x1().length == bArr.length) {
                    byte[] bArrM3065x1 = video.m3065x1();
                    for (int i = 0; i < bArr.length; i++) {
                        if ((bArr[i] & 255) != (bArrM3065x1[i] & 255)) {
                            break;
                        }
                    }
                    videoArr[0] = video;
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
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
        return false;
    }
}
