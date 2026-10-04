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
public class AudioCollection extends DomObject<Presentation> implements IAudioCollection {

    /* JADX INFO: renamed from: k4 */
    private final List<IAudio> f207k4;

    public AudioCollection(Presentation presentation) {
        super(presentation);
        this.f207k4 = new List<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private Audio m261k4(byte[] bArr, String str, String str2) {
        Audio[] audioArr = {null};
        boolean zM262k4 = m262k4(bArr, audioArr);
        Audio audio = audioArr[0];
        if (zM262k4) {
            return audio;
        }
        Audio audio2 = new Audio(((Presentation) this.f2127h4).m2388qq().m62581k4(bArr), str, str2, this);
        this.f207k4.addItem(audio2);
        return audio2;
    }

    @Override // com.aspose.slides.IAudioCollection
    public final IAudio addAudio(IAudio iAudio) {
        Audio audio = (Audio) iAudio;
        List.Enumerator<IAudio> it = this.f207k4.iterator();
        while (it.hasNext()) {
            try {
                if (audio == ((Audio) it.next())) {
                    return iAudio;
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
        return m261k4(audio.m259to(), audio.getContentType(), audio.m254h4());
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f207k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IAudioCollection
    public final IAudio get_Item(int i) {
        return this.f207k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IAudio> iterator() {
        return this.f207k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IAudio> iteratorJava() {
        return this.f207k4.iteratorJava();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f207k4.size();
    }

    @Override // com.aspose.slides.IAudioCollection
    public final IAudio addAudio(InputStream inputStream) {
        return m263k4(AbstractC3150x6.fromJava(inputStream));
    }

    /* JADX INFO: renamed from: k4 */
    public IAudio m263k4(AbstractC3150x6 abstractC3150x6) {
        return m261k4(C13447k4.m62559k4(abstractC3150x6), null, null);
    }

    @Override // com.aspose.slides.IAudioCollection
    public final IAudio addAudio(InputStream inputStream, int i) {
        return m264k4(AbstractC3150x6.fromJava(inputStream), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public IAudio m264k4(AbstractC3150x6 abstractC3150x6, int i) {
        InterfaceC13443dy interfaceC13443dyM62578k4;
        if (i != 0) {
            if (i != 1) {
                throw new ArgumentOutOfRangeException("loadingStreamBehavior", C14042ak.m66410k4(LoadingStreamBehavior.class, i), null);
            }
            interfaceC13443dyM62578k4 = ((Presentation) this.f2127h4).m2388qq().m62576k4(abstractC3150x6);
        } else {
            interfaceC13443dyM62578k4 = ((Presentation) this.f2127h4).m2388qq().m62578k4((AbstractC3150x6) C13447k4.m62561x1(abstractC3150x6), false, true);
        }
        Audio audio = new Audio(interfaceC13443dyM62578k4, this);
        this.f207k4.addItem(audio);
        return audio;
    }

    @Override // com.aspose.slides.IAudioCollection
    public final IAudio addAudio(byte[] bArr) {
        return m261k4((byte[]) bArr.clone(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final IAudio m265k4(C12262lr c12262lr) {
        return m266k4(((Presentation) this.f2127h4).m2388qq().m62580k4(c12262lr, ((Presentation) this.f2127h4).m2349du().getBlobManagementOptions().getPresentationLockingBehavior() == 1));
    }

    /* JADX INFO: renamed from: k4 */
    public final IAudio m266k4(InterfaceC13443dy interfaceC13443dy) {
        Audio audio = new Audio(interfaceC13443dy, this);
        this.f207k4.addItem(audio);
        return audio;
    }

    /* JADX INFO: renamed from: k4 */
    public void m267k4() {
        this.f207k4.clear();
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m262k4(byte[] bArr, Audio[] audioArr) {
        audioArr[0] = null;
        long jM54691k4 = C11610to.m54691k4(bArr);
        List.Enumerator<IAudio> it = this.f207k4.iterator();
        while (it.hasNext()) {
            try {
                Audio audio = (Audio) it.next();
                if ((audio.m257kk() & 4294967295L) == (4294967295L & jM54691k4) && audio.m259to().length == bArr.length) {
                    byte[] bArrM259to = audio.m259to();
                    for (int i = 0; i < bArr.length; i++) {
                        if ((bArr[i] & 255) != (bArrM259to[i] & 255)) {
                            break;
                        }
                    }
                    audioArr[0] = audio;
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
