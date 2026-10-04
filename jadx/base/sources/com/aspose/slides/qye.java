package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ExternalException;
import com.aspose.slides.internal.p077d8.C3100wp;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.AbstractC11721ck;
import com.aspose.slides.internal.p464vq.C11839vw;
import com.aspose.slides.internal.p482wr.C12250c6;
import com.aspose.slides.internal.p482wr.C12260kk;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.internal.p541z6.InterfaceC13443dy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class qye extends AbstractC11721ck {

    /* JADX INFO: renamed from: c5 */
    private final InterruptionToken f48499c5;

    /* JADX INFO: renamed from: du */
    private Dictionary<C11839vw, IVideo> f48500du;

    /* JADX INFO: renamed from: dy */
    private final Dictionary<C11839vw, IPPImage> f48501dy = new Dictionary<>();

    /* JADX INFO: renamed from: h4 */
    private pt0 f48502h4;

    /* JADX INFO: renamed from: k4 */
    private pt0 f48503k4;

    /* JADX INFO: renamed from: kk */
    private List<Hyperlink> f48504kk;

    /* JADX INFO: renamed from: m9 */
    private final Presentation f48505m9;

    /* JADX INFO: renamed from: to */
    private Dictionary<C11839vw, IAudio> f48506to;

    /* JADX INFO: renamed from: x1 */
    private List<C11839vw> f48507x1;

    public qye(IPresentation iPresentation, InterruptionToken interruptionToken) {
        this.f48505m9 = (Presentation) iPresentation;
        this.f48499c5 = interruptionToken;
        m69938k4(new Dictionary<>());
        m69942x1(new Dictionary<>());
        m69939k4(new List<>());
        m69943x1(new List<>());
    }

    /* JADX INFO: renamed from: c5 */
    public final Dictionary<C11839vw, IVideo> m69944c5() {
        return this.f48500du;
    }

    /* JADX INFO: renamed from: du */
    public final Dictionary<C11839vw, IPPImage> m69945du() {
        return this.f48501dy;
    }

    /* JADX INFO: renamed from: dy */
    public final Dictionary<C11839vw, IAudio> m69946dy() {
        return this.f48506to;
    }

    /* JADX INFO: renamed from: h4 */
    public final List<C11839vw> m69947h4() {
        return this.f48507x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final IPPImage m69948k4(C11839vw c11839vw) {
        if (c11839vw == null) {
            m69954k4("Empty image part.", 1);
            return ((ImageCollection) this.f48505m9.getImages()).m1717k4();
        }
        if (!C14113y2.m67424kk(C14113y2.m67368h4(c11839vw.m55427x1()), ".pdf") && !C14113y2.m67424kk(C14113y2.m67368h4(c11839vw.m55427x1()), ".pict") && !C14113y2.m67424kk(C14113y2.m67368h4(c11839vw.m55427x1()), ".svm") && !C14113y2.m67424kk(C14113y2.m67368h4(c11839vw.m55427x1()), ".webp")) {
            return !this.f48501dy.containsKey(c11839vw) ? m69941x1(c11839vw) : this.f48501dy.get_Item(c11839vw);
        }
        ((ImageCollection) m69951k4().getImages()).m1736kk(c11839vw.m55427x1());
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final pt0 m69955kk() {
        return this.f48503k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final List<Hyperlink> m69956m9() {
        return this.f48504kk;
    }

    /* JADX INFO: renamed from: to */
    public final InterruptionToken m69957to() {
        return this.f48499c5;
    }

    /* JADX INFO: renamed from: x1 */
    public final IAudio m69958x1(C11839vw c11839vw, InterfaceC13443dy interfaceC13443dy) {
        AudioCollection audioCollection = (AudioCollection) m69951k4().getAudios();
        IAudio iAudioM266k4 = interfaceC13443dy != null ? audioCollection.m266k4(interfaceC13443dy) : c11839vw.m55416dy() == null ? audioCollection.addAudio(c11839vw.m55426to()) : audioCollection.m265k4(c11839vw.m55416dy());
        Audio audio = (Audio) iAudioM266k4;
        int iM67418kk = C14113y2.m67418kk(c11839vw.m55427x1(), FilenameUtils.EXTENSION_SEPARATOR);
        audio.m256k4(iM67418kk >= 0 ? C14113y2.m67422kk(c11839vw.m55427x1(), iM67418kk + 1) : null);
        audio.m255k4().m72979k4(C14113y2.m67393k4(C14113y2.m67401k4(c11839vw.m55427x1(), "/Media/", ""), ControlChar.SPACE_CHAR, '_'));
        m69946dy().addItem(c11839vw, iAudioM266k4);
        c11839vw.m55422k4(true);
        return iAudioM266k4;
    }

    /* JADX INFO: renamed from: kk */
    private void m69940kk(String str) {
        m69954k4(C14113y2.m67402k4("GDI+ error occured loading image: {0}", str), 1);
    }

    /* JADX INFO: renamed from: x1 */
    private IPPImage m69941x1(C11839vw c11839vw) {
        String strM67402k4;
        try {
            try {
                IPPImage iPPImageM1718k4 = C14113y2.m67424kk(C14113y2.m67368h4(c11839vw.m55427x1()), ".svg") ? ((ImageCollection) m69951k4().getImages()).m1718k4(new SvgImage(c11839vw.m55426to())) : c11839vw.m55416dy() == null ? m69951k4().getImages().addImage(c11839vw.m55426to()) : ((ImageCollection) m69951k4().getImages()).m1725k4(c11839vw.m55416dy());
                this.f48501dy.addItem(c11839vw, iPPImageM1718k4);
                c11839vw.m55422k4(true);
                return iPPImageM1718k4;
            } catch (ArgumentException unused) {
                m69940kk(c11839vw.m55427x1());
                return null;
            } catch (ExternalException unused2) {
                m69940kk(c11839vw.m55427x1());
                return null;
            }
        } catch (C12250c6 unused3) {
            c11839vw.m55422k4(true);
            strM67402k4 = C14113y2.m67402k4("Embedded image is corrupted: {0}", c11839vw.m55427x1());
            m69954k4(strM67402k4, 1);
            return null;
        } catch (C12260kk e) {
            strM67402k4 = C14113y2.m67402k4("Error occured loading image: {0}", e.getMessage());
            m69954k4(strM67402k4, 1);
            return null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final IPPImage m69949k4(String str) {
        Dictionary.KeyCollection.Enumerator<C11839vw, IPPImage> it = this.f48501dy.getKeys().iterator();
        while (it.hasNext()) {
            try {
                C11839vw next = it.next();
                String strM55427x1 = next.m55427x1();
                if (!C14113y2.m67363du(strM55427x1, str) && !C14113y2.m67363du(C14113y2.m67431to(strM55427x1, IOUtils.DIR_SEPARATOR_UNIX), str)) {
                }
                IPPImage iPPImage = this.f48501dy.get_Item(next);
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                return iPPImage;
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final IVideo m69950k4(C11839vw c11839vw, InterfaceC13443dy interfaceC13443dy) {
        VideoCollection videoCollection = (VideoCollection) m69951k4().getVideos();
        Video videoM3070k4 = interfaceC13443dy != null ? videoCollection.m3070k4(interfaceC13443dy, (String) null, (String) null) : c11839vw.m55416dy() == null ? videoCollection.m3071k4(c11839vw.m55426to(), (String) null, (String) null) : videoCollection.m3069k4(c11839vw.m55416dy(), (String) null, (String) null);
        m69944c5().addItem(c11839vw, videoM3070k4);
        c11839vw.m55422k4(true);
        return videoM3070k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C11839vw m69959x1(String str) {
        List.Enumerator<C11839vw> it = m69947h4().iterator();
        while (it.hasNext()) {
            try {
                C11839vw next = it.next();
                String strM55427x1 = next.m55427x1();
                if (C14113y2.m67363du(strM55427x1, str) || C14113y2.m67363du(C14113y2.m67431to(strM55427x1, IOUtils.DIR_SEPARATOR_UNIX), str)) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final Presentation m69951k4() {
        return this.f48505m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final pt0 m69960x1() {
        return this.f48502h4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m69938k4(Dictionary<C11839vw, IAudio> dictionary) {
        this.f48506to = dictionary;
    }

    /* JADX INFO: renamed from: x1 */
    private void m69942x1(Dictionary<C11839vw, IVideo> dictionary) {
        this.f48500du = dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    private void m69939k4(List<C11839vw> list) {
        this.f48507x1 = list;
    }

    /* JADX INFO: renamed from: x1 */
    private void m69943x1(List<Hyperlink> list) {
        this.f48504kk = list;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69952k4(C11839vw c11839vw, IVideo[] iVideoArr, IAudio[] iAudioArr) {
        InterfaceC13443dy interfaceC13443dyM62581k4;
        if (m69944c5().tryGetValue(c11839vw, iVideoArr)) {
            iAudioArr[0] = null;
            return;
        }
        if (m69946dy().tryGetValue(c11839vw, iAudioArr)) {
            return;
        }
        if (c11839vw.m55416dy() != null) {
            interfaceC13443dyM62581k4 = m69951k4().m2388qq().m62580k4(c11839vw.m55416dy(), m69951k4().m2349du().getBlobManagementOptions().getPresentationLockingBehavior() == 1);
        } else {
            interfaceC13443dyM62581k4 = m69951k4().m2388qq().m62581k4(c11839vw.m55426to());
        }
        AbstractC3150x6 abstractC3150x6Mo18614x1 = interfaceC13443dyM62581k4.mo18614x1();
        try {
            int i = (int) C13447k4.f45030k4;
            byte[] bArr = new byte[i];
            abstractC3150x6Mo18614x1.read(bArr, 0, i);
            String strM6472k4 = gbd.m6472k4(bArr);
            abstractC3150x6Mo18614x1.dispose();
            if (C14113y2.m67448x1(strM6472k4, "video")) {
                iVideoArr[0] = m69950k4(c11839vw, interfaceC13443dyM62581k4);
            } else {
                iAudioArr[0] = m69958x1(c11839vw, interfaceC13443dyM62581k4);
            }
        } catch (Throwable th) {
            if (abstractC3150x6Mo18614x1 != null) {
                abstractC3150x6Mo18614x1.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69961x1(pt0 pt0Var) {
        this.f48503k4 = pt0Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69953k4(pt0 pt0Var) {
        this.f48502h4 = pt0Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69954k4(String str, int i) {
        if (m69951k4().m2349du() == null || m69951k4().m2349du().getWarningCallback() == null) {
            return;
        }
        new C3100wp(str, i).sendWarning(m69951k4().m2349du().getWarningCallback());
    }
}
