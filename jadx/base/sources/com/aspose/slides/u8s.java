package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3100wp;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.AbstractC11747gf;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.AbstractC11840w6;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11749gk;
import com.aspose.slides.internal.p464vq.C11759j5;
import com.aspose.slides.internal.p464vq.C11775m2;
import com.aspose.slides.internal.p464vq.C11783na;
import com.aspose.slides.internal.p464vq.C11785nh;
import com.aspose.slides.internal.p464vq.C11787nv;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11826u5;
import com.aspose.slides.internal.p464vq.C11858y9;
import com.aspose.slides.internal.p464vq.C11862yn;
import com.aspose.slides.internal.p464vq.C11863yo;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p505xn.C12563k4;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.EditingLanguage;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class u8s extends AbstractC11840w6 {

    /* JADX INFO: renamed from: ak */
    private int f49245ak;

    /* JADX INFO: renamed from: ar */
    private int f49246ar;

    /* JADX INFO: renamed from: b3 */
    private int f49247b3;

    /* JADX INFO: renamed from: bv */
    private int f49248bv;

    /* JADX INFO: renamed from: bz */
    private int f49249bz;

    /* JADX INFO: renamed from: c5 */
    private final Dictionary<C14047bz, C11791os> f49250c5;

    /* JADX INFO: renamed from: c6 */
    private int f49251c6;

    /* JADX INFO: renamed from: ck */
    private final Dictionary<IVideo, C11791os> f49252ck;

    /* JADX INFO: renamed from: dq */
    private int f49253dq;

    /* JADX INFO: renamed from: du */
    private int f49254du;

    /* JADX INFO: renamed from: dy */
    private final Dictionary<ITheme, C11791os> f49255dy;

    /* JADX INFO: renamed from: e0 */
    private int f49256e0;

    /* JADX INFO: renamed from: fa */
    private final Dictionary<ICustomXmlPart, C11709bg> f49257fa;

    /* JADX INFO: renamed from: g8 */
    private Dictionary<C14047bz, C14047bz> f49258g8;

    /* JADX INFO: renamed from: h4 */
    private final Dictionary<IBaseSlide, String> f49259h4;

    /* JADX INFO: renamed from: ix */
    private int f49260ix;

    /* JADX INFO: renamed from: jd */
    private final Dictionary<IAudio, C11791os> f49261jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f49262k4;

    /* JADX INFO: renamed from: kk */
    private final InterruptionToken f49263kk;

    /* JADX INFO: renamed from: ks */
    private int f49264ks;

    /* JADX INFO: renamed from: lr */
    private int f49265lr;

    /* JADX INFO: renamed from: m9 */
    private final Dictionary<IBaseSlide, C11791os> f49266m9;

    /* JADX INFO: renamed from: ne */
    private int f49267ne;

    /* JADX INFO: renamed from: qm */
    private final int[] f49268qm;

    /* JADX INFO: renamed from: qq */
    private int f49269qq;

    /* JADX INFO: renamed from: rv */
    private int f49270rv;

    /* JADX INFO: renamed from: to */
    private IPptxOptions f49271to;

    /* JADX INFO: renamed from: ts */
    private int f49272ts;

    /* JADX INFO: renamed from: u4 */
    private int f49273u4;

    /* JADX INFO: renamed from: um */
    private int f49274um;

    /* JADX INFO: renamed from: up */
    private int f49275up;

    /* JADX INFO: renamed from: uz */
    private int f49276uz;

    /* JADX INFO: renamed from: v4 */
    private int f49277v4;

    /* JADX INFO: renamed from: wl */
    private int f49278wl;

    /* JADX INFO: renamed from: wy */
    private int f49279wy;

    /* JADX INFO: renamed from: x1 */
    private final IPresentation f49280x1;

    /* JADX INFO: renamed from: x6 */
    private int f49281x6;

    /* JADX INFO: renamed from: xk */
    private int f49282xk;

    /* JADX INFO: renamed from: yd */
    private int f49283yd;

    /* JADX INFO: renamed from: yj */
    private int f49284yj;

    public u8s(C11785nh c11785nh, IPresentation iPresentation, int[] iArr, IPptxOptions iPptxOptions, InterruptionToken interruptionToken) {
        super(c11785nh);
        int i = 0;
        this.f49254du = 0;
        this.f49277v4 = EditingLanguage.HEBREW;
        this.f49280x1 = iPresentation;
        this.f49271to = iPptxOptions;
        this.f49263kk = interruptionToken;
        this.f49259h4 = new Dictionary<>();
        this.f49266m9 = new Dictionary<>();
        this.f49250c5 = new Dictionary<>();
        this.f49261jd = new Dictionary<>();
        this.f49252ck = new Dictionary<>();
        this.f49255dy = new Dictionary<>();
        this.f49257fa = new Dictionary<>();
        this.f49258g8 = new Dictionary<>();
        m71546k4(false);
        if (iArr != null) {
            this.f49268qm = iArr;
            return;
        }
        this.f49268qm = new int[iPresentation.getSlides().size()];
        while (i < iPresentation.getSlides().size()) {
            int i2 = i + 1;
            this.f49268qm[i] = i2;
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ak */
    public final int m71521ak() {
        int i = this.f49267ne + 1;
        this.f49267ne = i;
        return i;
    }

    /* JADX INFO: renamed from: ar */
    public final int m71522ar() {
        return this.f49279wy;
    }

    /* JADX INFO: renamed from: b3 */
    public final int m71523b3() {
        int i = this.f49270rv + 1;
        this.f49270rv = i;
        return i;
    }

    /* JADX INFO: renamed from: bv */
    public final int m71524bv() {
        int i = this.f49253dq + 1;
        this.f49253dq = i;
        return i;
    }

    /* JADX INFO: renamed from: bz */
    public final InterruptionToken m71525bz() {
        return this.f49263kk;
    }

    /* JADX INFO: renamed from: c5 */
    public final IPresentation m71526c5() {
        return this.f49280x1;
    }

    /* JADX INFO: renamed from: c6 */
    public final int m71527c6() {
        int i = this.f49272ts + 1;
        this.f49272ts = i;
        return i;
    }

    /* JADX INFO: renamed from: ck */
    public final int m71528ck() {
        int i = this.f49278wl + 1;
        this.f49278wl = i;
        return i;
    }

    /* JADX INFO: renamed from: dq */
    public final int m71529dq() {
        int i = this.f49260ix + 1;
        this.f49260ix = i;
        return i;
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11840w6
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public final C11785nh mo4812qm() {
        return (C11785nh) super.mo4812qm();
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m71531dy() {
        return this.f49262k4;
    }

    /* JADX INFO: renamed from: e0 */
    public final int m71532e0() {
        int i = this.f49249bz + 1;
        this.f49249bz = i;
        return i;
    }

    /* JADX INFO: renamed from: fa */
    public final int m71533fa() {
        int i = this.f49269qq + 1;
        this.f49269qq = i;
        return i;
    }

    /* JADX INFO: renamed from: h4 */
    public final Dictionary<ICustomXmlPart, C11709bg> m71534h4() {
        return this.f49257fa;
    }

    /* JADX INFO: renamed from: ix */
    public final int m71535ix() {
        return this.f49265lr;
    }

    /* JADX INFO: renamed from: jd */
    public final int m71536jd() {
        int i = this.f49276uz + 1;
        this.f49276uz = i;
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public final IAudio m71537k4(C11791os c11791os) {
        Dictionary.Enumerator<IAudio, C11791os> it = this.f49261jd.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (next.getValue() == c11791os) {
                    return (IAudio) next.getKey();
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

    /* JADX INFO: renamed from: kk */
    public final Dictionary<IBaseSlide, C11791os> m71548kk() {
        return this.f49266m9;
    }

    /* JADX INFO: renamed from: ks */
    public final int m71550ks() {
        int i = this.f49248bv + 1;
        this.f49248bv = i;
        return i;
    }

    /* JADX INFO: renamed from: lr */
    public final int m71551lr() {
        int i = this.f49284yj + 1;
        this.f49284yj = i;
        return i;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m71552m9() {
        return this.f49254du;
    }

    /* JADX INFO: renamed from: ne */
    public final int m71553ne() {
        int i = this.f49265lr + 1;
        this.f49265lr = i;
        return i;
    }

    /* JADX INFO: renamed from: qq */
    public final int m71554qq() {
        int i = this.f49282xk + 1;
        this.f49282xk = i;
        return i;
    }

    /* JADX INFO: renamed from: rv */
    public final int m71555rv() {
        int i = this.f49251c6 + 1;
        this.f49251c6 = i;
        return i;
    }

    /* JADX INFO: renamed from: to */
    public final Dictionary<ITheme, C11791os> m71556to() {
        return this.f49255dy;
    }

    /* JADX INFO: renamed from: ts */
    public final int m71557ts() {
        int i = this.f49256e0 + 1;
        this.f49256e0 = i;
        return i;
    }

    /* JADX INFO: renamed from: u4 */
    public final int m71558u4() {
        int i = this.f49283yd + 1;
        this.f49283yd = i;
        return i;
    }

    /* JADX INFO: renamed from: um */
    public final int m71559um() {
        int i = this.f49245ak + 1;
        this.f49245ak = i;
        return i;
    }

    /* JADX INFO: renamed from: up */
    public final int m71560up() {
        int i = this.f49246ar + 1;
        this.f49246ar = i;
        return i;
    }

    /* JADX INFO: renamed from: uz */
    public final int m71561uz() {
        int i = this.f49247b3 + 1;
        this.f49247b3 = i;
        return i;
    }

    /* JADX INFO: renamed from: v4 */
    public final int m71562v4() {
        int i = this.f49275up + 1;
        this.f49275up = i;
        return i;
    }

    /* JADX INFO: renamed from: wl */
    public final int m71563wl() {
        int i = this.f49279wy + 1;
        this.f49279wy = i;
        return i;
    }

    /* JADX INFO: renamed from: wy */
    public final int m71564wy() {
        int i = this.f49281x6 + 1;
        this.f49281x6 = i;
        return i;
    }

    /* JADX INFO: renamed from: x1 */
    public final Dictionary<IBaseSlide, String> m71565x1() {
        return this.f49259h4;
    }

    /* JADX INFO: renamed from: x6 */
    public final int m71570x6() {
        int i = this.f49277v4 + 1;
        this.f49277v4 = i;
        return i;
    }

    /* JADX INFO: renamed from: xk */
    public final int m71571xk() {
        int i = this.f49273u4 + 1;
        this.f49273u4 = i;
        return i;
    }

    /* JADX INFO: renamed from: yd */
    public final int m71572yd() {
        int i = this.f49264ks + 1;
        this.f49264ks = i;
        return i;
    }

    /* JADX INFO: renamed from: yj */
    public final int m71573yj() {
        int i = this.f49274um + 1;
        this.f49274um = i;
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11791os m71538k4(IAudio iAudio) {
        return !this.f49261jd.containsKey(iAudio) ? m71566x1(iAudio) : this.f49261jd.get_Item(iAudio);
    }

    /* JADX INFO: renamed from: kk */
    public final C11791os m71549kk(IPPImage iPPImage) {
        PPImage pPImage = (PPImage) iPPImage;
        AbstractC11747gf abstractC11747gfM2137x1 = pPImage.m2137x1();
        C11791os c11791osM55394k4 = mo4812qm().m55394k4(C14113y2.m67408k4("/ppt/media/image{0}.", abstractC11747gfM2137x1.mo55336to()), new AbstractC11760jd.k4() { // from class: com.aspose.slides.u8s.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextImageFileNumber()";
            }

            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
            /* JADX INFO: renamed from: k4 */
            public int mo5039k4() {
                return u8s.this.m71558u4();
            }
        }, abstractC11747gfM2137x1);
        int iM71552m9 = m71552m9();
        if (iM71552m9 == 0) {
            c11791osM55394k4.m55421k4(pPImage.m2125du());
        } else if (iM71552m9 != 1) {
            if (iM71552m9 != 2) {
                throw new Exception();
            }
            c11791osM55394k4.m55421k4(pPImage.m2125du());
        } else {
            c11791osM55394k4.m55422k4(true);
        }
        this.f49250c5.addItem(pPImage.m2127fa().Clone(), c11791osM55394k4);
        return c11791osM55394k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C11791os m71566x1(IAudio iAudio) {
        String strM72978k4;
        Audio audio = (Audio) iAudio;
        if (C14113y2.m67411k4(audio.m255k4().m72978k4()) || C14113y2.m67448x1(audio.m255k4().m72978k4(), "media")) {
            strM72978k4 = "media{0}";
        } else {
            int iM67418kk = C14113y2.m67418kk(audio.m255k4().m72978k4(), FilenameUtils.EXTENSION_SEPARATOR);
            strM72978k4 = iM67418kk == -1 ? audio.m255k4().m72978k4() : C14113y2.m67408k4(C14113y2.m67443x1(audio.m255k4().m72978k4(), 0, iM67418kk), "{0}");
        }
        C11791os c11791osM55394k4 = mo4812qm().m55394k4(C14113y2.m67408k4("/ppt/media/", strM72978k4, ".", audio.m254h4()), new AbstractC11760jd.k4() { // from class: com.aspose.slides.u8s.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextAudioVideoFileNumber()";
            }

            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
            /* JADX INFO: renamed from: k4 */
            public int mo5039k4() {
                return u8s.this.m71561uz();
            }
        }, C11826u5.m55410k4(audio.getContentType()));
        int iM71552m9 = m71552m9();
        if (iM71552m9 == 0) {
            c11791osM55394k4.m55423k4(iAudio.getBinaryData());
        } else if (iM71552m9 != 1) {
            if (iM71552m9 != 2) {
                throw new Exception();
            }
            c11791osM55394k4.m55423k4(iAudio.getBinaryData());
        } else {
            c11791osM55394k4.m55422k4(true);
        }
        this.f49261jd.addItem(iAudio, c11791osM55394k4);
        return c11791osM55394k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11791os m71539k4(IPPImage iPPImage) {
        PPImage pPImage = (PPImage) iPPImage;
        return !this.f49250c5.containsKey(pPImage.m2127fa().Clone()) ? m71549kk(iPPImage) : this.f49250c5.get_Item(pPImage.m2127fa().Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public final C11791os m71567x1(IPPImage iPPImage) {
        C11791os[] c11791osArr = {null};
        boolean zTryGetValue = this.f49250c5.tryGetValue(((PPImage) iPPImage).m2127fa().Clone(), c11791osArr);
        C11791os c11791os = c11791osArr[0];
        if (zTryGetValue) {
            return c11791os;
        }
        int iM71552m9 = m71552m9();
        if (iM71552m9 == 0 || iM71552m9 == 1 || iM71552m9 == 2) {
            return m71549kk(iPPImage);
        }
        throw new Exception();
    }

    /* JADX INFO: renamed from: k4 */
    public final C11791os m71540k4(ISlidesPicture iSlidesPicture) {
        boolean z;
        C11791os c11791os;
        ISvgImage svgImage = iSlidesPicture.getImage().getSvgImage();
        PictureFrame pictureFrame = (PictureFrame) C7019kk.m27452k4((Object) ((Picture) iSlidesPicture).getParent_Immediate().getParent_Immediate(), PictureFrame.class);
        if (pictureFrame != null) {
            SvgImage svgImage2 = (SvgImage) svgImage;
            if (svgImage2.m2855k4() && (svgImage = pictureFrame.m2260ck()) == null) {
                svgImage = svgImage2.m2854k4(pictureFrame);
            }
        }
        IGenericEnumerator<IPPImage> it = iSlidesPicture.getPresentation().getImages().iterator();
        do {
            try {
                if (!it.hasNext()) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    ((ImageCollection) iSlidesPicture.getPresentation().getImages()).m1732k4(iSlidesPicture.getImage());
                    return m71567x1(((ImageCollection) iSlidesPicture.getPresentation().getImages()).m1719k4(svgImage, 4.0f));
                }
                IPPImage next = it.next();
                C11791os[] c11791osArr = {null};
                z = next.getSvgImage() != null && this.f49250c5.tryGetValue(((PPImage) next).m2127fa().Clone(), c11791osArr) && C12563k4.m58597k4(next.getSvgImage().getSvgData(), svgImage.getSvgData());
                c11791os = c11791osArr[0];
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        } while (!z);
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return c11791os;
    }

    /* JADX INFO: renamed from: x1 */
    public final C11791os m71568x1(IVideo iVideo) {
        Video video = (Video) iVideo;
        C11791os c11791osM55394k4 = mo4812qm().m55394k4(C14113y2.m67408k4("/ppt/media/media{0}.", video.m3064to()), new AbstractC11760jd.k4() { // from class: com.aspose.slides.u8s.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextAudioVideoFileNumber()";
            }

            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
            /* JADX INFO: renamed from: k4 */
            public int mo5039k4() {
                return u8s.this.m71561uz();
            }
        }, C11826u5.m55410k4(video.getContentType()));
        int iM71552m9 = m71552m9();
        if (iM71552m9 == 0) {
            c11791osM55394k4.m55421k4(video.m3060du());
        } else if (iM71552m9 != 1) {
            if (iM71552m9 != 2) {
                throw new Exception();
            }
            c11791osM55394k4.m55421k4(video.m3060du());
        } else {
            c11791osM55394k4.m55422k4(true);
        }
        this.f49252ck.addItem(iVideo, c11791osM55394k4);
        return c11791osM55394k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11791os m71541k4(IVideo iVideo) {
        return !this.f49252ck.containsKey(iVideo) ? m71568x1(iVideo) : this.f49252ck.get_Item(iVideo);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m71569x1(int i) {
        this.f49265lr = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final C11791os m71542k4(C12009k4 c12009k4) {
        C3977ck c3977ckMo15750ck = c12009k4.mo15750ck();
        AbstractC11747gf c11783na = new C11783na();
        if (c3977ckMo15750ck.equals(C3977ck.m15681jd())) {
            c11783na = new C11749gk();
        } else if (c3977ckMo15750ck.equals(C3977ck.m15678dy())) {
            c11783na = new C11858y9();
        } else if (c3977ckMo15750ck.equals(C3977ck.m15684to())) {
            c11783na = new C11759j5();
        } else if (c3977ckMo15750ck.equals(C3977ck.m15679fa())) {
            c11783na = new C11862yn();
        } else if (c3977ckMo15750ck.equals(C3977ck.m15680h4())) {
            c11783na = new C11787nv();
        } else if (c3977ckMo15750ck.equals(C3977ck.m15676ck())) {
            c11783na = new C11863yo();
        } else if (c3977ckMo15750ck.equals(C3977ck.m15682kk())) {
            c11783na = new C11775m2();
        } else if (c3977ckMo15750ck.equals(C3977ck.m15675c5())) {
            c11783na = new C11749gk();
            c3977ckMo15750ck = C3977ck.m15681jd();
        }
        C11791os c11791osM55394k4 = mo4812qm().m55394k4(C14113y2.m67408k4("/ppt/media/image{0}.", c11783na.mo55336to()), new AbstractC11760jd.k4() { // from class: com.aspose.slides.u8s.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextImageFileNumber()";
            }

            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
            /* JADX INFO: renamed from: k4 */
            public int mo5039k4() {
                return u8s.this.m71558u4();
            }
        }, c11783na);
        C3152yj c3152yj = new C3152yj();
        try {
            c12009k4.m56333k4(c3152yj, c3977ckMo15750ck);
            c11791osM55394k4.m55423k4(c3152yj.toArray());
            return c11791osM55394k4;
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71543k4(int i) {
        this.f49254du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71544k4(gnb gnbVar) {
        int iM71552m9 = m71552m9();
        if (iM71552m9 != 0) {
            if (iM71552m9 != 1) {
                if (iM71552m9 != 2) {
                    throw new Exception();
                }
                return;
            }
            Dictionary.Enumerator<IVideo, C11791os> it = this.f49250c5.iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair next = it.next();
                    PPImage pPImageM1728k4 = ((ImageCollection) m71526c5().getImages()).m1728k4(((C14047bz) next.getKey()).Clone());
                    if (pPImageM1728k4 != null) {
                        gnbVar.m6797x1().addItem(next.getValue(), pPImageM1728k4);
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
            Dictionary.Enumerator<IAudio, C11791os> it2 = this.f49261jd.iterator();
            while (it2.hasNext()) {
                try {
                    KeyValuePair next2 = it2.next();
                    gnbVar.m6788kk().addItem(next2.getValue(), next2.getKey());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
            it = this.f49252ck.iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair next3 = it.next();
                    gnbVar.m6794to().addItem(next3.getValue(), next3.getKey());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            int iM71552m92 = m71552m9();
            if (iM71552m92 != 0) {
                if (iM71552m92 == 1) {
                    gnbVar.m6783k4();
                } else if (iM71552m92 != 2) {
                    throw new Exception();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71545k4(String str, int i) {
        IPptxOptions iPptxOptions = this.f49271to;
        if (iPptxOptions == null || iPptxOptions.getWarningCallback() == null) {
            return;
        }
        new C3100wp(str, i).sendWarning(this.f49271to.getWarningCallback());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71546k4(boolean z) {
        this.f49262k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final int[] m71547k4() {
        return this.f49268qm;
    }
}
