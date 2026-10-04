package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p077d8.C3100wp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.AbstractC11758j2;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p482wr.C12250c6;
import com.aspose.slides.internal.p482wr.C12260kk;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class gnb extends AbstractC11758j2 {

    /* JADX INFO: renamed from: c5 */
    private final Dictionary<C11791os, IAudio> f5271c5;

    /* JADX INFO: renamed from: ck */
    private final Dictionary<C11791os, ITheme> f5272ck;

    /* JADX INFO: renamed from: du */
    private byte[] f5273du;

    /* JADX INFO: renamed from: dy */
    private final Dictionary<C11791os, IPPImage> f5274dy;

    /* JADX INFO: renamed from: fa */
    private final Dictionary<C11791os, ICustomXmlPart> f5275fa;

    /* JADX INFO: renamed from: h4 */
    private final InterruptionToken f5276h4;

    /* JADX INFO: renamed from: ix */
    private final SortedList<String, SortedList<String, C11791os>> f5277ix;

    /* JADX INFO: renamed from: jd */
    private final Dictionary<C11791os, IVideo> f5278jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f5279k4;

    /* JADX INFO: renamed from: kk */
    private Presentation f5280kk;

    /* JADX INFO: renamed from: ks */
    private final Dictionary<Long, ICommentAuthor> f5281ks;

    /* JADX INFO: renamed from: m9 */
    private final Dictionary<String, IPPImage> f5282m9;

    /* JADX INFO: renamed from: ne */
    private final List<IShape> f5283ne;

    /* JADX INFO: renamed from: rv */
    private final Dictionary<C14047bz, ICommentAuthor> f5284rv;

    /* JADX INFO: renamed from: to */
    private int f5285to;

    /* JADX INFO: renamed from: up */
    private final Dictionary<String, List<IHyperlink>> f5286up;

    /* JADX INFO: renamed from: x1 */
    private boolean f5287x1;

    /* JADX INFO: renamed from: x6 */
    private final Dictionary<String, IBaseSlide> f5288x6;

    /* JADX INFO: renamed from: yj */
    private final Dictionary<Integer, List<IHyperlink>> f5289yj;

    public gnb(IPresentation iPresentation, InterruptionToken interruptionToken) {
        this.f5285to = 0;
        this.f5283ne = new List<>();
        this.f5280kk = (Presentation) iPresentation;
        this.f5276h4 = interruptionToken;
        this.f5282m9 = new Dictionary<>();
        this.f5274dy = new Dictionary<>();
        this.f5271c5 = new Dictionary<>();
        this.f5278jd = new Dictionary<>();
        this.f5272ck = new Dictionary<>();
        this.f5275fa = new Dictionary<>();
        this.f5286up = new Dictionary<>();
        this.f5289yj = new Dictionary<>();
        this.f5281ks = new Dictionary<>();
        this.f5284rv = new Dictionary<>();
        this.f5288x6 = new Dictionary<>();
        this.f5277ix = new SortedList<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final Dictionary<C14047bz, ICommentAuthor> m6773c5() {
        return this.f5284rv;
    }

    /* JADX INFO: renamed from: ck */
    public final List<IShape> m6774ck() {
        return this.f5283ne;
    }

    /* JADX INFO: renamed from: du */
    public final int m6775du() {
        return this.f5285to;
    }

    /* JADX INFO: renamed from: dy */
    public final Dictionary<Long, ICommentAuthor> m6776dy() {
        return this.f5281ks;
    }

    /* JADX INFO: renamed from: fa */
    public final SortedList<String, SortedList<String, C11791os>> m6777fa() {
        return this.f5277ix;
    }

    /* JADX INFO: renamed from: h4 */
    public final Dictionary<String, List<IHyperlink>> m6778h4() {
        return this.f5286up;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[Catch: all -> 0x0032, TryCatch #2 {all -> 0x0032, blocks: (B:3:0x000a, B:5:0x0010, B:14:0x002c, B:15:0x0031, B:18:0x0035, B:23:0x0050, B:30:0x0072, B:32:0x0078, B:33:0x007c, B:35:0x0082, B:36:0x0085, B:19:0x003a, B:21:0x0044, B:24:0x005a, B:26:0x0060), top: B:95:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX INFO: renamed from: ix */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6779ix() {
        List.Enumerator it;
        ISlide iSlideM74864k4;
        Dictionary.Enumerator<Integer, List<IHyperlink>> it2 = m6778h4().iterator();
        while (it2.hasNext()) {
            try {
                KeyValuePair next = it2.next();
                String str = (String) next.getKey();
                int iM6775du = m6775du();
                if (iM6775du == 0) {
                    iSlideM74864k4 = !m6780jd().containsKey(str) ? (ISlide) m6780jd().get_Item(str) : null;
                } else if (iM6775du == 1 || iM6775du == 2) {
                    iSlideM74864k4 = C14918zx.m74864k4(str, this);
                } else {
                    if (iM6775du != 3) {
                        throw new ArgumentOutOfRangeException();
                    }
                    if (!m6780jd().containsKey(str)) {
                    }
                }
                it = ((List) next.getValue()).iterator();
                while (it.hasNext()) {
                    try {
                        ((Hyperlink) ((IHyperlink) it.next())).m1699to().m4794k4(iSlideM74864k4);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it2 = m6791m9().iterator();
        while (it2.hasNext()) {
            try {
                KeyValuePair next2 = it2.next();
                if (((Integer) next2.getKey()).intValue() < this.f5280kk.getSlides().size()) {
                    ISlide iSlide = this.f5280kk.getSlides().get_Item(((Integer) next2.getKey()).intValue());
                    it = ((List) next2.getValue()).iterator();
                    while (it.hasNext()) {
                        try {
                            ((Hyperlink) ((IHyperlink) it.next())).m1699to().m4794k4(iSlide);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        IGenericEnumerator<IHyperlinkContainer> it3 = this.f5280kk.getHyperlinkQueries().getHyperlinkClicks().iterator();
        while (it3.hasNext()) {
            try {
                IHyperlinkContainer next3 = it3.next();
                IHyperlink hyperlinkClick = next3.getHyperlinkClick();
                if (hyperlinkClick.getActionType() == 8 && hyperlinkClick.getTargetSlide() == null) {
                    next3.getHyperlinkManager().removeHyperlinkClick();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: jd */
    public final Dictionary<String, IBaseSlide> m6780jd() {
        return this.f5288x6;
    }

    /* JADX INFO: renamed from: k4 */
    public final IPPImage m6781k4(C11791os c11791os) {
        if (c11791os == null) {
            m6785k4("Empty image part.", 1);
            return ((ImageCollection) this.f5280kk.getImages()).m1717k4();
        }
        if (C14113y2.m67424kk(C14113y2.m67368h4(c11791os.m55427x1()), ".svg")) {
            return null;
        }
        if ((!C14113y2.m67424kk(C14113y2.m67368h4(c11791os.m55427x1()), ".pdf") || C3099wl.m13187k4(c11791os.m55426to())) && !C14113y2.m67424kk(C14113y2.m67368h4(c11791os.m55427x1()), ".webp") && !C14113y2.m67424kk(C14113y2.m67368h4(c11791os.m55427x1()), ".pict")) {
            return !this.f5274dy.containsKey(c11791os) ? m6772du(c11791os) : this.f5274dy.get_Item(c11791os);
        }
        ((ImageCollection) m6801yj().getImages()).m1736kk(c11791os.m55427x1());
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final Dictionary<C11791os, IAudio> m6788kk() {
        return this.f5271c5;
    }

    /* JADX INFO: renamed from: ks */
    public final InterruptionToken m6790ks() {
        return this.f5276h4;
    }

    /* JADX INFO: renamed from: m9 */
    public final Dictionary<Integer, List<IHyperlink>> m6791m9() {
        return this.f5289yj;
    }

    /* JADX INFO: renamed from: ne */
    public final boolean m6792ne() {
        return this.f5287x1;
    }

    /* JADX INFO: renamed from: rv */
    public final byte[] m6793rv() {
        return this.f5273du;
    }

    /* JADX INFO: renamed from: to */
    public final Dictionary<C11791os, IVideo> m6794to() {
        return this.f5278jd;
    }

    /* JADX INFO: renamed from: up */
    public final Dictionary<C11791os, ITheme> m6796up() {
        return this.f5272ck;
    }

    /* JADX INFO: renamed from: x1 */
    public final Dictionary<C11791os, IPPImage> m6797x1() {
        return this.f5274dy;
    }

    /* JADX INFO: renamed from: x6 */
    public final boolean m6800x6() {
        return this.f5279k4;
    }

    /* JADX INFO: renamed from: yj */
    public final Presentation m6801yj() {
        return this.f5280kk;
    }

    public gnb(IPresentation iPresentation, InterruptionToken interruptionToken, boolean z) {
        this(iPresentation, interruptionToken);
        m6799x1(z);
    }

    /* JADX INFO: renamed from: du */
    private IPPImage m6772du(C11791os c11791os) {
        try {
            IPPImage iPPImageAddImage = c11791os.m55416dy() == null ? m6801yj().getImages().addImage(c11791os.m55426to()) : ((ImageCollection) m6801yj().getImages()).m1725k4(c11791os.m55416dy());
            this.f5274dy.addItem(c11791os, iPPImageAddImage);
            c11791os.m55422k4(true);
            return iPPImageAddImage;
        } catch (C12250c6 unused) {
            c11791os.m55422k4(true);
            m6785k4(C14113y2.m67402k4("Embedded image is corrupted: {0}", c11791os.m55427x1()), 1);
            return null;
        } catch (C12260kk e) {
            m6785k4(C14113y2.m67402k4("Error occured loading image: {0}", e.getMessage()), 1);
            return null;
        } catch (Exception e2) {
            C3085sv.m13082k4(e2);
            ((ImageCollection) m6801yj().getImages()).m1741x1(c11791os.m55427x1());
            return null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final IPPImage m6782k4(String str) {
        return ((ImageCollection) this.f5280kk.getImages()).m1726k4(str, this.f5282m9);
    }

    /* JADX INFO: renamed from: kk */
    public final IVideo m6789kk(C11791os c11791os) {
        if (this.f5278jd.containsKey(c11791os)) {
            return this.f5278jd.get_Item(c11791os);
        }
        Video videoM3071k4 = c11791os.m55416dy() == null ? ((VideoCollection) m6801yj().getVideos()).m3071k4(c11791os.m55426to(), (String) null, (String) null) : ((VideoCollection) m6801yj().getVideos()).m3069k4(c11791os.m55416dy(), (String) null, (String) null);
        this.f5278jd.addItem(c11791os, videoM3071k4);
        c11791os.m55422k4(true);
        return videoM3071k4;
    }

    /* JADX INFO: renamed from: to */
    public final ICustomXmlPart m6795to(C11791os c11791os) {
        if (this.f5275fa.containsKey(c11791os)) {
            return this.f5275fa.get_Item(c11791os);
        }
        CustomXmlPart customXmlPart = new CustomXmlPart(m6801yj(), c11791os.m55426to(), C14047bz.m66536x1().Clone(), new String[0]);
        this.f5275fa.addItem(c11791os, customXmlPart);
        c11791os.m55422k4(true);
        return customXmlPart;
    }

    /* JADX INFO: renamed from: x1 */
    public final IAudio m6798x1(C11791os c11791os) {
        IAudio[] iAudioArr = {null};
        boolean zTryGetValue = this.f5271c5.tryGetValue(c11791os, iAudioArr);
        IAudio iAudio = iAudioArr[0];
        if (zTryGetValue) {
            return iAudio;
        }
        AudioCollection audioCollection = (AudioCollection) m6801yj().getAudios();
        IVideo[] iVideoArr = {null};
        Audio audio = (Audio) (this.f5278jd.tryGetValue(c11791os, iVideoArr) ? audioCollection.m266k4(((Video) iVideoArr[0]).m3060du()) : c11791os.m55416dy() == null ? audioCollection.addAudio(c11791os.m55426to()) : audioCollection.m265k4(c11791os.m55416dy()));
        audio.setContentType(c11791os.m55372fa().mo55273k4());
        int iM67418kk = C14113y2.m67418kk(c11791os.m55427x1(), FilenameUtils.EXTENSION_SEPARATOR);
        audio.m256k4(iM67418kk >= 0 ? C14113y2.m67422kk(c11791os.m55427x1(), iM67418kk + 1) : null);
        audio.m255k4().m72979k4(C14113y2.m67401k4(c11791os.m55427x1(), "/ppt/media/", ""));
        this.f5271c5.addItem(c11791os, audio);
        c11791os.m55422k4(true);
        return audio;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6783k4() {
        IGenericEnumerator<ICommentAuthor> it = m6801yj().getCommentAuthors().iterator();
        while (it.hasNext()) {
            try {
                ICommentAuthor next = it.next();
                m6776dy().addItem(Long.valueOf(((CommentAuthor) next).m1175x1().m7032k4()), next);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m6799x1(boolean z) {
        this.f5287x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6784k4(int i) {
        this.f5285to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6785k4(String str, int i) {
        if (m6801yj().m2349du() == null || m6801yj().m2349du().getWarningCallback() == null) {
            return;
        }
        new C3100wp(str, i).sendWarning(m6801yj().m2349du().getWarningCallback());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6786k4(boolean z) {
        this.f5279k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6787k4(byte[] bArr) {
        this.f5273du = bArr;
    }
}
