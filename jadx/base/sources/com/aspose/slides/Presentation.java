package com.aspose.slides;

import android.graphics.Bitmap;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.android.Size;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.OperationCanceledException;
import com.aspose.slides.internal.p060ca.C2033cj;
import com.aspose.slides.internal.p060ca.C2132iq;
import com.aspose.slides.internal.p060ca.C2182lv;
import com.aspose.slides.internal.p060ca.C2284s2;
import com.aspose.slides.internal.p060ca.C2350wl;
import com.aspose.slides.internal.p071cz.C2862pr;
import com.aspose.slides.internal.p077d8.C3048e0;
import com.aspose.slides.internal.p077d8.C3065k4;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3088tq;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p104ec.C3662y9;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p353q7.C9762c6;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p356qb.C9816ck;
import com.aspose.slides.internal.p356qb.C9820h4;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.C10372bq;
import com.aspose.slides.internal.p407st.C10528lr;
import com.aspose.slides.internal.p407st.C10591pk;
import com.aspose.slides.internal.p407st.C10646tb;
import com.aspose.slides.internal.p407st.C10755zn;
import com.aspose.slides.internal.p464vq.C11848x3;
import com.aspose.slides.internal.p466vu.AbstractC11874k4;
import com.aspose.slides.internal.p466vu.C11875x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p479wm.C12210k4;
import com.aspose.slides.internal.p482wr.C12275wy;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.internal.p541z6.C13444fa;
import com.aspose.slides.internal.p541z6.C13445h4;
import com.aspose.slides.internal.p541z6.C13450to;
import com.aspose.slides.internal.p541z6.C13452x1;
import com.aspose.slides.internal.p541z6.InterfaceC13443dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.aspose.slides.qy7;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class Presentation implements IPresentation, InterfaceC14397rj {

    /* JADX INFO: renamed from: h4 */
    static final ParagraphFormat f3062h4;

    /* JADX INFO: renamed from: ak */
    private final CustomXmlPartCollection f3064ak;

    /* JADX INFO: renamed from: ar */
    private final t4w f3065ar;

    /* JADX INFO: renamed from: b3 */
    private final NotesSize f3066b3;

    /* JADX INFO: renamed from: bv */
    private final AudioCollection f3067bv;

    /* JADX INFO: renamed from: bz */
    private boolean f3068bz;

    /* JADX INFO: renamed from: c5 */
    private AbstractC3150x6 f3069c5;

    /* JADX INFO: renamed from: c6 */
    private DocumentProperties f3070c6;

    /* JADX INFO: renamed from: ck */
    private ProtectionManager f3071ck;

    /* JADX INFO: renamed from: dq */
    private MasterTheme f3072dq;

    /* JADX INFO: renamed from: du */
    final Dictionary<Long, C0957en<MasterSlide>> f3073du;

    /* JADX INFO: renamed from: dy */
    private C2132iq f3074dy;

    /* JADX INFO: renamed from: e0 */
    private long f3075e0;

    /* JADX INFO: renamed from: em */
    private Object f3076em;

    /* JADX INFO: renamed from: f9 */
    private x3j f3077f9;

    /* JADX INFO: renamed from: fa */
    private final SlideCollection f3078fa;

    /* JADX INFO: renamed from: g8 */
    private ISaveOptions f3079g8;

    /* JADX INFO: renamed from: gi */
    private int f3080gi;

    /* JADX INFO: renamed from: ix */
    private final C12210k4<C7134m9, C7131h4> f3081ix;

    /* JADX INFO: renamed from: j2 */
    private int f3082j2;

    /* JADX INFO: renamed from: jd */
    private InterfaceC13443dy f3083jd;

    /* JADX INFO: renamed from: k4 */
    int f3084k4;

    /* JADX INFO: renamed from: kk */
    TextStyle f3085kk;

    /* JADX INFO: renamed from: kp */
    private ViewProperties f3086kp;

    /* JADX INFO: renamed from: ks */
    private final SectionCollection f3087ks;

    /* JADX INFO: renamed from: lr */
    private final DigitalSignatureCollection f3088lr;

    /* JADX INFO: renamed from: m9 */
    private final C1209hm f3089m9;

    /* JADX INFO: renamed from: ne */
    private final C12210k4<C7134m9, C7131h4> f3090ne;

    /* JADX INFO: renamed from: os */
    private String f3091os;

    /* JADX INFO: renamed from: qm */
    private final LoadOptions f3092qm;

    /* JADX INFO: renamed from: qq */
    private final s8a f3093qq;

    /* JADX INFO: renamed from: qw */
    private List<PictureFrame> f3094qw;

    /* JADX INFO: renamed from: rv */
    private final FontsManager f3095rv;

    /* JADX INFO: renamed from: s7 */
    private o8s f3096s7;

    /* JADX INFO: renamed from: ss */
    private HyperlinkQueries f3097ss;

    /* JADX INFO: renamed from: sv */
    private C14084qq f3098sv;

    /* JADX INFO: renamed from: t6 */
    private dim f3099t6;

    /* JADX INFO: renamed from: to */
    CommentAuthorCollection f3100to;

    /* JADX INFO: renamed from: tq */
    private boolean f3101tq;

    /* JADX INFO: renamed from: ts */
    private final long f3102ts;

    /* JADX INFO: renamed from: u4 */
    private final Dictionary<C7134m9, Integer> f3103u4;

    /* JADX INFO: renamed from: um */
    private final ImageCollection f3104um;

    /* JADX INFO: renamed from: up */
    private final GlobalLayoutSlideCollection f3105up;

    /* JADX INFO: renamed from: uz */
    private final C1197hf f3106uz;

    /* JADX INFO: renamed from: v4 */
    private final VideoCollection f3107v4;

    /* JADX INFO: renamed from: vh */
    private final xnd f3108vh;

    /* JADX INFO: renamed from: vj */
    private C3662y9 f3109vj;

    /* JADX INFO: renamed from: w6 */
    private final Dictionary<Long, Object> f3110w6;

    /* JADX INFO: renamed from: wl */
    private final C1143gg f3111wl;

    /* JADX INFO: renamed from: wp */
    private long f3112wp;

    /* JADX INFO: renamed from: wy */
    private final CustomData f3113wy;

    /* JADX INFO: renamed from: x1 */
    String f3114x1;

    /* JADX INFO: renamed from: x6 */
    private C13452x1 f3115x6;

    /* JADX INFO: renamed from: xk */
    private PresentationHeaderFooterManager f3116xk;

    /* JADX INFO: renamed from: xw */
    private IVbaProject f3117xw;

    /* JADX INFO: renamed from: yd */
    private final SlideSize f3118yd;

    /* JADX INFO: renamed from: yj */
    private final MasterSlideCollection f3119yj;

    /* JADX INFO: renamed from: zj */
    private SlideShowSettings f3120zj;

    /* JADX INFO: renamed from: ai */
    private static final char[] f3061ai = {IOUtils.DIR_SEPARATOR_UNIX, FilenameUtils.EXTENSION_SEPARATOR};

    /* JADX INFO: renamed from: ri */
    private static final long[] f3063ri = {0};

    static {
        FontData fontData = C13827mb.f46185k4;
        ParagraphFormat paragraphFormat = new ParagraphFormat(null);
        paragraphFormat.setMarginLeft(0.0f);
        paragraphFormat.setMarginRight(0.0f);
        paragraphFormat.setIndent(0.0f);
        BulletFormat bulletFormatM2206x1 = paragraphFormat.m2206x1();
        bulletFormatM2206x1.setHeight(100.0f);
        bulletFormatM2206x1.setNumberedBulletStartWith((short) 1);
        bulletFormatM2206x1.setType((byte) 0);
        bulletFormatM2206x1.setBulletHardColor((byte) 0);
        bulletFormatM2206x1.setBulletHardFont((byte) 0);
        paragraphFormat.setAlignment(0);
        paragraphFormat.setDefaultTabSize(72.0f);
        paragraphFormat.setEastAsianLineBreak((byte) 0);
        paragraphFormat.setFontAlignment(0);
        paragraphFormat.setHangingPunctuation((byte) 1);
        paragraphFormat.setLatinLineBreak((byte) 0);
        paragraphFormat.setRightToLeft((byte) 0);
        paragraphFormat.setSpaceAfter(0.0f);
        paragraphFormat.setSpaceBefore(0.0f);
        paragraphFormat.setSpaceWithin(100.0f);
        FontData fontData2 = new FontData("Arial");
        PortionFormat portionFormatM2204to = paragraphFormat.m2204to();
        portionFormatM2204to.setFontHeight(18.0f);
        portionFormatM2204to.getFillFormat().setFillType((byte) 1);
        portionFormatM2204to.getFillFormat().getSolidFillColor().setSchemeColor(12);
        portionFormatM2204to.setEscapement(0.0f);
        portionFormatM2204to.setKerningMinimalSize(12.0f);
        portionFormatM2204to.setComplexScriptFont(fontData2);
        portionFormatM2204to.setEastAsianFont(fontData2);
        portionFormatM2204to.setLatinFont(fontData2);
        portionFormatM2204to.setSymbolFont(new FontData("Wingdings"));
        portionFormatM2204to.setFontBold((byte) 0);
        portionFormatM2204to.setFontItalic((byte) 0);
        portionFormatM2204to.setFontUnderline((byte) 0);
        portionFormatM2204to.setHardUnderlineFill((byte) 0);
        portionFormatM2204to.setHardUnderlineLine((byte) 0);
        portionFormatM2204to.setKumimoji((byte) 0);
        portionFormatM2204to.setProofDisabled((byte) 0);
        portionFormatM2204to.setNormaliseHeight((byte) 0);
        portionFormatM2204to.setStrikethroughType((byte) 0);
        portionFormatM2204to.setTextCapType((byte) 0);
        portionFormatM2204to.setSpacing(0.0f);
        f3062h4 = paragraphFormat;
    }

    public Presentation() {
        this(new LoadOptions());
    }

    /* JADX INFO: renamed from: ak */
    private void m2320ak() {
        ((PresentationHeaderFooterManager) getHeaderFooterManager()).m2429kk();
    }

    /* JADX INFO: renamed from: b3 */
    private C14670va m2321b3() {
        C14670va c14670va = new C14670va();
        C14084qq c14084qqM1347x1 = this.f3070c6.m1347x1();
        C14084qq c14084qq = C14084qq.f47299x1;
        if (!c14084qqM1347x1.equals(c14084qq.Clone())) {
            c14670va.m72158x1(this.f3070c6.m1347x1().Clone());
        }
        if (!this.f3070c6.m1345to().equals(c14084qq.Clone())) {
            c14670va.m72126k4(this.f3070c6.m1345to().Clone());
        }
        if (!this.f3070c6.m1342kk().equals(c14084qq.Clone())) {
            c14670va.m72141kk(this.f3070c6.m1342kk().Clone());
        }
        if (!this.f3070c6.m1334k4().m66821kk(new C14077m4())) {
            c14670va.m72125k4(this.f3070c6.m1334k4().Clone());
        }
        c14670va.m72142kk(this.f3070c6.getAuthor());
        c14670va.m72122jd(this.f3070c6.getCategory());
        c14670va.m72113du(this.f3070c6.getComments());
        c14670va.m72109c5(this.f3070c6.getCompany());
        c14670va.m72150to(this.f3070c6.getKeywords());
        c14670va.m72119h4(this.f3070c6.getLastSavedBy());
        c14670va.m72115dy(this.f3070c6.getManager());
        c14670va.m72111ck(this.f3070c6.getNameOfApplication());
        c14670va.m72124k4(this.f3070c6.getRevisionNumber());
        c14670va.m72159x1(this.f3070c6.getSubject());
        c14670va.m72117fa(this.f3070c6.getApplicationTemplate());
        c14670va.m72127k4(this.f3070c6.getTitle());
        c14670va.m72153up(this.f3070c6.getHyperlinkBase());
        gij.m6709k4(this.f3070c6, c14670va);
        return c14670va;
    }

    /* JADX INFO: renamed from: dq */
    private void m2322dq() {
        if (this.f3101tq) {
            throw C1153gn.m6771k4();
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m2335kk(AbstractC3150x6 abstractC3150x6) {
        this.f3071ck.encrypt(this.f3092qm.getPassword());
        this.f3071ck.m2465k4(abstractC3150x6);
        C3152yj c3152yjM68017k4 = ng8.m68017k4(abstractC3150x6, this.f3092qm.getPassword());
        c3152yjM68017k4.seek(0L, 0);
        try {
            InterfaceC13443dy interfaceC13443dyM62576k4 = this.f3115x6.m62576k4(c3152yjM68017k4);
            try {
                m2341x1(interfaceC13443dyM62576k4.mo18614x1(), false);
                interfaceC13443dyM62576k4.dispose();
            } catch (Throwable th) {
                if (interfaceC13443dyM62576k4 != null) {
                    interfaceC13443dyM62576k4.dispose();
                }
                throw th;
            }
        } finally {
            c3152yjM68017k4.dispose();
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m2336lr() {
        getCustomData().getTags().remove("AS_TITLE");
        getCustomData().getTags().add("AS_TITLE", BuildVersionInfo.Product);
        getCustomData().getTags().remove("AS_VERSION");
        getCustomData().getTags().add("AS_VERSION", "24.6");
        getCustomData().getTags().remove("AS_RELEASE_DATE");
        getCustomData().getTags().add("AS_RELEASE_DATE", "2024.06.30");
        getCustomData().getTags().remove("AS_OS");
        getCustomData().getTags().add("AS_OS", C14052dq.m66573to().toString());
    }

    /* JADX INFO: renamed from: v4 */
    private void m2338v4() {
        Dictionary.Enumerator<C7134m9, C7131h4> it = this.f3081ix.m56976x1().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (((C7131h4) next.getValue()).m27680x1()) {
                    ((C7131h4) next.getValue()).m27678kk().dispose();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f3081ix.m56974kk();
    }

    /* JADX INFO: renamed from: wy */
    private void m2339wy() {
        this.f3112wp++;
    }

    /* JADX INFO: renamed from: yd */
    private void m2344yd() {
        IGenericEnumerator<ICommentAuthor> it = this.f3100to.iterator();
        while (it.hasNext()) {
            try {
                ((CommentCollection) ((CommentAuthor) it.next()).getComments()).m1192x1();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ar */
    public final C12210k4<C7134m9, C7131h4> m2345ar() {
        return this.f3090ne;
    }

    /* JADX INFO: renamed from: bv */
    public final xnd m2346bv() {
        return this.f3108vh;
    }

    /* JADX INFO: renamed from: c5 */
    public C14084qq m2347c5() {
        return this.f3098sv;
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m2348ck() {
        return this.f3068bz;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m2331k4(true);
    }

    /* JADX INFO: renamed from: du */
    public final LoadOptions m2349du() {
        return this.f3092qm;
    }

    /* JADX INFO: renamed from: dy */
    public final String m2350dy() {
        return this.f3091os;
    }

    /* JADX INFO: renamed from: fa */
    public final o8s m2351fa() {
        return this.f3096s7;
    }

    @Override // com.aspose.slides.IPresentation
    public final ICustomXmlPart[] getAllCustomXmlParts() {
        return this.f3064ak.m1285k4().toArray(new ICustomXmlPart[0]);
    }

    @Override // com.aspose.slides.IPresentation
    public final IAudioCollection getAudios() {
        return this.f3067bv;
    }

    @Override // com.aspose.slides.IPresentation
    public final ICommentAuthorCollection getCommentAuthors() {
        return this.f3100to;
    }

    @Override // com.aspose.slides.IPresentation
    public final Date getCurrentDateTime() {
        return C14084qq.m67108kk(m2347c5());
    }

    @Override // com.aspose.slides.IPresentation
    public final ICustomData getCustomData() {
        return this.f3113wy;
    }

    @Override // com.aspose.slides.IPresentation
    public final ITextStyle getDefaultTextStyle() {
        return this.f3085kk;
    }

    @Override // com.aspose.slides.IPresentation
    public final IDigitalSignatureCollection getDigitalSignatures() {
        return this.f3088lr;
    }

    @Override // com.aspose.slides.IPresentation
    public final IDocumentProperties getDocumentProperties() {
        return this.f3070c6;
    }

    @Override // com.aspose.slides.IPresentation
    public final int getFirstSlideNumber() {
        return this.f3080gi;
    }

    @Override // com.aspose.slides.IPresentation
    public final IFontsManager getFontsManager() {
        return this.f3095rv;
    }

    @Override // com.aspose.slides.IPresentation
    public final IPresentationHeaderFooterManager getHeaderFooterManager() {
        if (this.f3116xk == null) {
            PresentationHeaderFooterManager presentationHeaderFooterManager = new PresentationHeaderFooterManager(this);
            this.f3116xk = presentationHeaderFooterManager;
            presentationHeaderFooterManager.m2423k4();
        }
        return this.f3116xk;
    }

    @Override // com.aspose.slides.IPresentation
    public final IHyperlinkQueries getHyperlinkQueries() {
        if (this.f3097ss == null) {
            this.f3097ss = new HyperlinkQueries(this);
        }
        return this.f3097ss;
    }

    @Override // com.aspose.slides.IPresentation
    public final IImageCollection getImages() {
        return this.f3104um;
    }

    @Override // com.aspose.slides.IPresentation
    public final IGlobalLayoutSlideCollection getLayoutSlides() {
        return this.f3105up;
    }

    @Override // com.aspose.slides.IPresentation
    public final IMasterHandoutSlideManager getMasterHandoutSlideManager() {
        return this.f3065ar;
    }

    @Override // com.aspose.slides.IPresentation
    public final IMasterNotesSlideManager getMasterNotesSlideManager() {
        return this.f3093qq;
    }

    @Override // com.aspose.slides.IPresentation
    public final IMasterTheme getMasterTheme() {
        m2322dq();
        return this.f3072dq;
    }

    @Override // com.aspose.slides.IPresentation
    public final IMasterSlideCollection getMasters() {
        return this.f3119yj;
    }

    @Override // com.aspose.slides.IPresentation
    public final INotesSize getNotesSize() {
        return this.f3066b3;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return null;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        return this;
    }

    @Override // com.aspose.slides.IPresentation
    public final IProtectionManager getProtectionManager() {
        return this.f3071ck;
    }

    @Override // com.aspose.slides.IPresentation
    public final ISectionCollection getSections() {
        return this.f3087ks;
    }

    @Override // com.aspose.slides.IPresentation
    public final IBaseSlide getSlideById(long j) {
        m2322dq();
        for (int i = 0; i < getSlides().size(); i++) {
            if (getSlides().get_Item(i).getSlideId() == j) {
                return getSlides().get_Item(i);
            }
        }
        for (int i2 = 0; i2 < getMasters().size(); i2++) {
            if (getMasters().get_Item(i2).getSlideId() == j) {
                return getMasters().get_Item(i2);
            }
            IMasterLayoutSlideCollection layoutSlides = getMasters().get_Item(i2).getLayoutSlides();
            for (int i3 = 0; i3 < layoutSlides.size(); i3++) {
                if (layoutSlides.get_Item(i3).getSlideId() == j) {
                    return layoutSlides.get_Item(i3);
                }
            }
        }
        return null;
    }

    public final SlideShowSettings getSlideShowSettings() {
        return this.f3120zj;
    }

    @Override // com.aspose.slides.IPresentation
    public final ISlideSize getSlideSize() {
        return this.f3118yd;
    }

    @Override // com.aspose.slides.IPresentation
    public final ISlideCollection getSlides() {
        return this.f3078fa;
    }

    @Override // com.aspose.slides.IPresentation
    public final int getSourceFormat() {
        m2322dq();
        return this.f3084k4;
    }

    @Override // com.aspose.slides.IPresentation
    @Deprecated
    public final Bitmap[] getThumbnails(IRenderingOptions iRenderingOptions) {
        return C3085sv.m13095k4(m2378k4(iRenderingOptions));
    }

    @Override // com.aspose.slides.IPresentation
    public final IVbaProject getVbaProject() {
        return this.f3117xw;
    }

    @Override // com.aspose.slides.IPresentation
    public final IVideoCollection getVideos() {
        return this.f3107v4;
    }

    @Override // com.aspose.slides.IPresentation
    public final IViewProperties getViewProperties() {
        if (this.f3086kp == null) {
            this.f3086kp = new ViewProperties(this);
        }
        return this.f3086kp;
    }

    /* JADX INFO: renamed from: h4 */
    public final ISaveOptions m2352h4() {
        return this.f3079g8;
    }

    @Override // com.aspose.slides.IPresentation
    public final void highlightRegex(Pattern pattern, Integer num, IFindResultCallback iFindResultCallback) {
        m2371k4(C12380dy.m57968k4(pattern), C12003du.m56401k4(num), iFindResultCallback);
    }

    @Override // com.aspose.slides.IPresentation
    public final void highlightText(String str, Integer num) {
        m2376k4(str, C12003du.m56401k4(num));
    }

    /* JADX INFO: renamed from: ix */
    public final long m2353ix() {
        long j;
        synchronized (this) {
            j = this.f3075e0;
            this.f3075e0 = 1 + j;
        }
        return j;
    }

    /* JADX INFO: renamed from: jd */
    public final long m2354jd() {
        return this.f3112wp;
    }

    @Override // com.aspose.slides.IPresentation
    public final void joinPortionsWithSameFormatting() {
        m2322dq();
        IGenericEnumerator<ISlide> it = getMasters().iterator();
        while (it.hasNext()) {
            try {
                it.next().joinPortionsWithSameFormatting();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (getMasterNotesSlideManager().getMasterNotesSlide() != null) {
            getMasterNotesSlideManager().getMasterNotesSlide().joinPortionsWithSameFormatting();
        }
        if (getMasterHandoutSlideManager().getMasterHandoutSlide() != null) {
            getMasterHandoutSlideManager().getMasterHandoutSlide().joinPortionsWithSameFormatting();
        }
        IGenericEnumerator<ILayoutSlide> it2 = getLayoutSlides().iterator();
        while (it2.hasNext()) {
            try {
                it2.next().joinPortionsWithSameFormatting();
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it = getSlides().iterator();
        while (it.hasNext()) {
            try {
                it.next().joinPortionsWithSameFormatting();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m2355k4(C7134m9 c7134m9) {
        if (!this.f3103u4.containsKey(c7134m9)) {
            this.f3103u4.addItem(c7134m9, 0);
        }
        Dictionary<C7134m9, Integer> dictionary = this.f3103u4;
        dictionary.set_Item(c7134m9, Integer.valueOf(dictionary.get_Item(c7134m9).intValue() + 1));
        return this.f3103u4.get_Item(c7134m9).intValue();
    }

    /* JADX INFO: renamed from: ks */
    public final C1197hf m2385ks() {
        return this.f3106uz;
    }

    /* JADX INFO: renamed from: m9 */
    public final List<PictureFrame> m2386m9() {
        return this.f3094qw;
    }

    /* JADX INFO: renamed from: ne */
    public final CustomXmlPartCollection m2387ne() {
        return this.f3064ak;
    }

    /* JADX INFO: renamed from: qq */
    public final C13452x1 m2388qq() {
        return this.f3115x6;
    }

    @Override // com.aspose.slides.IPresentation
    public final void replaceRegex(Pattern pattern, String str, IFindResultCallback iFindResultCallback) {
        m2372k4(C12380dy.m57968k4(pattern), str, iFindResultCallback);
    }

    @Override // com.aspose.slides.IPresentation
    public final void replaceText(String str, String str2, ITextSearchOptions iTextSearchOptions, IFindResultCallback iFindResultCallback) {
        SlideUtil.m2768k4(this, str, str2, iTextSearchOptions, iFindResultCallback);
    }

    /* JADX INFO: renamed from: rv */
    public final C1143gg m2389rv() {
        return this.f3111wl;
    }

    @Override // com.aspose.slides.IPresentation
    public final void save(IXamlOptions iXamlOptions) {
        m2322dq();
        if (iXamlOptions != null) {
            this.f3079g8 = iXamlOptions;
            if (C14113y2.m67411k4(iXamlOptions.getDefaultRegularFont())) {
                m2385ks().m7126k4((String) null);
            } else {
                m2385ks().m7126k4(iXamlOptions.getDefaultRegularFont());
            }
        }
        C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
        try {
            try {
                v7f.m72086k4(c14047bzClone.Clone());
                int size = getSlides().size();
                int[] iArr = new int[size];
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    iArr[i] = i2;
                    i = i2;
                }
                m2320ak();
                XamlOptions xamlOptions = (XamlOptions) C7019kk.m27452k4((Object) iXamlOptions, XamlOptions.class);
                if (xamlOptions == null) {
                    xamlOptions = new XamlOptions();
                    xamlOptions.m3115x1(1);
                }
                int iM3092c5 = xamlOptions.m3092c5();
                if (iM3092c5 == 0) {
                    nlw.m68086x1(this, iArr, xamlOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                } else if (iM3092c5 == 1) {
                    nlw.m68082k4(this, iArr, xamlOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                }
                v7f.m72090x1(c14047bzClone.Clone());
                v7f.m72090x1(c14047bzClone.Clone());
                this.f3079g8 = null;
            } catch (OperationCanceledException unused) {
                v7f.m72090x1(c14047bzClone.Clone());
                v7f.m72090x1(c14047bzClone.Clone());
                this.f3079g8 = null;
            } catch (C3065k4 e) {
                v7f.m72090x1(c14047bzClone.Clone());
                throw new PptxException("Saving aborted.", e);
            }
        } catch (Throwable th) {
            v7f.m72090x1(c14047bzClone.Clone());
            this.f3079g8 = null;
            throw th;
        }
    }

    @Override // com.aspose.slides.IPresentation
    public final void setCurrentDateTime(Date date) {
        m2373k4(C14084qq.m67093k4(date));
    }

    @Override // com.aspose.slides.IPresentation
    public final void setFirstSlideNumber(int i) {
        m2322dq();
        if (i < 0) {
            throw new ArgumentOutOfRangeException("value", "Must equal or greater than zero");
        }
        this.f3080gi = i;
    }

    @Override // com.aspose.slides.IPresentation
    public final void setVbaProject(IVbaProject iVbaProject) {
        m2322dq();
        this.f3117xw = iVbaProject;
        this.f3109vj = iVbaProject != null ? ((VbaProject) iVbaProject).m3054x1() : null;
    }

    /* JADX INFO: renamed from: to */
    public final long m2390to() {
        Dictionary<Long, Object> dictionary = this.f3110w6;
        int i = this.f3082j2 + 1;
        this.f3082j2 = i;
        dictionary.addItem(Long.valueOf(((long) i) & 4294967295L), null);
        return ((long) this.f3082j2) & 4294967295L;
    }

    /* JADX INFO: renamed from: u4 */
    public final Slide m2391u4() {
        Slide slideM72072k4 = v3t.m72072k4(this);
        slideM72072k4.m2708ne().m5302k4(m2351fa().m68353ar());
        return slideM72072k4;
    }

    /* JADX INFO: renamed from: um */
    public final C12210k4<C7134m9, C7131h4> m2392um() {
        return this.f3081ix;
    }

    /* JADX INFO: renamed from: up */
    public final x3j m2393up() {
        return this.f3077f9;
    }

    /* JADX INFO: renamed from: uz */
    public final oyy m2394uz() {
        return m2351fa().m68389u4();
    }

    /* JADX INFO: renamed from: wl */
    public final C14258ow m2395wl() {
        return new C14258ow((FontsManager) getFontsManager());
    }

    /* JADX INFO: renamed from: x1 */
    public final C3662y9 m2396x1() {
        return this.f3109vj;
    }

    /* JADX INFO: renamed from: x6 */
    public final Object m2399x6() {
        return this.f3076em;
    }

    /* JADX INFO: renamed from: yj */
    public final dim m2400yj() {
        return this.f3099t6;
    }

    public Presentation(LoadOptions loadOptions) {
        this(loadOptions, (C1209hm) null);
        kye.m64232k4(this);
        m2336lr();
        C3048e0.m12897k4().m12902k4(1L);
    }

    /* JADX INFO: renamed from: du */
    private void m2323du(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("seekableStream");
        }
        if (!abstractC3150x6.canSeek()) {
            throw new InvalidOperationException();
        }
        try {
            this.f3068bz = true;
            abstractC3150x6.setPosition(0L);
            kye.m64232k4(this);
            new ubs().m71648k4(this, abstractC3150x6, (InterruptionToken) this.f3092qm.getInterruptionToken(), true);
            m2336lr();
        } finally {
            this.f3068bz = false;
            ((PresentationHeaderFooterManager) getHeaderFooterManager()).m2431x1();
        }
    }

    /* JADX INFO: renamed from: to */
    private void m2337to(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("seekableStream");
        }
        if (!abstractC3150x6.canSeek()) {
            throw new InvalidOperationException();
        }
        try {
            this.f3068bz = true;
            new kjx().m63949k4(this, abstractC3150x6, (InterruptionToken) this.f3092qm.getInterruptionToken());
            m2336lr();
        } finally {
            this.f3068bz = false;
            ((PresentationHeaderFooterManager) getHeaderFooterManager()).m2431x1();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private C13444fa m2340x1(String str) {
        return new C13444fa(this.f3115x6, this.f3069c5, str, new C13444fa.k4() { // from class: com.aspose.slides.Presentation.3
            @Override // com.aspose.slides.internal.p541z6.C13444fa.k4
            /* JADX INFO: renamed from: k4 */
            public void mo2401k4(AbstractC3150x6 abstractC3150x6) {
                Presentation.this.f3069c5 = abstractC3150x6;
            }
        });
    }

    @Override // com.aspose.slides.IPresentation
    public final IImage[] getImages(IRenderingOptions iRenderingOptions) {
        return Images.m1767k4(m2378k4(iRenderingOptions));
    }

    @Override // com.aspose.slides.IPresentation
    @Deprecated
    public final Bitmap[] getThumbnails(IRenderingOptions iRenderingOptions, float f, float f2) {
        return C3085sv.m13095k4(m2379k4(iRenderingOptions, f, f2));
    }

    @Override // com.aspose.slides.IPresentation
    public final void highlightText(String str, Integer num, ITextSearchOptions iTextSearchOptions, IFindResultCallback iFindResultCallback) {
        m2377k4(str, C12003du.m56401k4(num), iTextSearchOptions, iFindResultCallback);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m2356k4(long j) {
        if ((4294967295L & j) <= this.f3082j2) {
            return this.f3110w6.containsKey(Long.valueOf(j)) ? m2390to() : j;
        }
        this.f3082j2 = (int) j;
        return j;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m2384kk() {
        return this.f3082j2 != -1;
    }

    @Override // com.aspose.slides.IPresentation
    public final void save(OutputStream outputStream, final int i) {
        C11875x1.m55458k4(new AbstractC11874k4(outputStream) { // from class: com.aspose.slides.Presentation.1
            @Override // com.aspose.slides.internal.p466vu.AbstractC11874k4
            /* JADX INFO: renamed from: k4 */
            public void mo1976k4(AbstractC3150x6 abstractC3150x6) {
                Presentation.this.m2363k4(abstractC3150x6, i);
            }
        });
    }

    public Presentation(LoadOptions loadOptions, C1209hm c1209hm) {
        this.f3084k4 = 1;
        this.f3114x1 = null;
        this.f3069c5 = null;
        this.f3083jd = null;
        this.f3066b3 = new NotesSize();
        this.f3073du = new Dictionary<>();
        this.f3068bz = false;
        this.f3098sv = C14084qq.m67081jd().Clone();
        this.f3112wp = 0L;
        this.f3080gi = 1;
        this.f3096s7 = new o8s();
        this.f3077f9 = new x3j();
        this.f3099t6 = new dim();
        this.f3108vh = new xnd();
        this.f3094qw = new List<>();
        this.f3101tq = false;
        this.f3082j2 = -1;
        this.f3110w6 = new Dictionary<>();
        this.f3089m9 = c1209hm;
        if (loadOptions == null) {
            loadOptions = new LoadOptions();
        } else {
            m2374k4(loadOptions.m1919k4());
        }
        this.f3092qm = loadOptions;
        C1197hf c1197hf = new C1197hf(loadOptions);
        this.f3106uz = c1197hf;
        C1143gg c1143gg = new C1143gg();
        this.f3111wl = c1143gg;
        if (C2862pr.m12466k4() != null) {
            C2862pr.m12466k4().m12473x1();
        }
        this.f3095rv = new FontsManager(c1197hf, c1143gg.m6639k4(), this);
        this.f3081ix = new C12210k4<>(C7134m9.class, C7131h4.class);
        this.f3090ne = new C12210k4<>(C7134m9.class, C7131h4.class);
        this.f3103u4 = new Dictionary<>();
        IBlobManagementOptions blobManagementOptions = loadOptions.getBlobManagementOptions();
        boolean zIsTemporaryFilesAllowed = blobManagementOptions.isTemporaryFilesAllowed();
        boolean z = !zIsTemporaryFilesAllowed;
        C13450to c13450to = new C13450to(!zIsTemporaryFilesAllowed ? new C13445h4() : new C13445h4(blobManagementOptions.getTempFilesRootPath()));
        c13450to.m62568k4(z);
        c13450to.m62572x1(blobManagementOptions.getMaxBlobsBytesInMemory());
        this.f3115x6 = new C13452x1(c13450to);
        this.f3113wy = new CustomData(this);
        this.f3064ak = new CustomXmlPartCollection(this);
        this.f3104um = new ImageCollection(this);
        this.f3067bv = new AudioCollection(this);
        this.f3107v4 = new VideoCollection(this);
        this.f3078fa = new SlideCollection(this);
        this.f3087ks = new SectionCollection(this);
        this.f3105up = new GlobalLayoutSlideCollection(this);
        this.f3119yj = new MasterSlideCollection(this);
        this.f3100to = new CommentAuthorCollection(this);
        this.f3088lr = new DigitalSignatureCollection(this);
        this.f3093qq = new s8a(this);
        this.f3065ar = new t4w(this);
        long[] jArr = f3063ri;
        synchronized (AbstractC14092to.m67208k4(jArr).getSyncRoot()) {
            long j = jArr[0];
            jArr[0] = 1 + j;
            this.f3102ts = j;
            this.f3075e0 = C7019kk.m27461m9(Long.valueOf(j), 10) << 32;
        }
        this.f3085kk = new TextStyle(this);
        this.f3070c6 = new DocumentProperties(this);
        m2351fa().m68374k4(new oyy(this));
        this.f3072dq = new MasterTheme(this);
        this.f3071ck = new ProtectionManager(this);
        this.f3118yd = new SlideSize(this);
        m2362k4(new SlideShowSettings(this, null));
        if (C14113y2.m67411k4(loadOptions.getDefaultTextLanguage())) {
            return;
        }
        m2375k4(loadOptions.getDefaultTextLanguage());
    }

    /* JADX INFO: renamed from: x1 */
    private void m2341x1(AbstractC3150x6 abstractC3150x6, boolean z) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("seekableStream");
        }
        if (!abstractC3150x6.canSeek()) {
            throw new InvalidOperationException();
        }
        try {
            this.f3068bz = true;
            if (z) {
                new xqj().m73567k4(this, abstractC3150x6, this.f3089m9, (InterruptionToken) this.f3092qm.getInterruptionToken());
            } else if (ubs.m71647x1(abstractC3150x6)) {
                abstractC3150x6.setPosition(0L);
                kye.m64232k4(this);
                new ubs().m71648k4(this, abstractC3150x6, (InterruptionToken) this.f3092qm.getInterruptionToken(), false);
            } else {
                abstractC3150x6.setPosition(0L);
                new kjx().m63949k4(this, abstractC3150x6, (InterruptionToken) this.f3092qm.getInterruptionToken());
                m2344yd();
            }
            m2336lr();
            this.f3068bz = false;
            ((PresentationHeaderFooterManager) getHeaderFooterManager()).m2431x1();
        } catch (Throwable th) {
            this.f3068bz = false;
            ((PresentationHeaderFooterManager) getHeaderFooterManager()).m2431x1();
            throw th;
        }
    }

    @Override // com.aspose.slides.IPresentation
    public final IImage[] getImages(IRenderingOptions iRenderingOptions, float f, float f2) {
        return Images.m1767k4(m2379k4(iRenderingOptions, f, f2));
    }

    @Override // com.aspose.slides.IPresentation
    @Deprecated
    public final Bitmap[] getThumbnails(IRenderingOptions iRenderingOptions, Size size) {
        return C3085sv.m13095k4(m2380k4(iRenderingOptions, C12023wl.m56855k4(size)));
    }

    /* JADX INFO: renamed from: k4 */
    public final C2132iq m2357k4() {
        if (this.f3074dy == null) {
            qy7.C14366k4 c14366k4 = new qy7.C14366k4();
            c14366k4.f48495k4 = "Cambria Math";
            c14366k4.f48498x1 = 18.0f;
            c14366k4.f48496kk = false;
            C14251ot c14251otM69882b3 = new qy7(this, 72.0f, c14366k4.Clone()).m69882b3();
            C2033cj[] c2033cjArrMo10154k4 = new C2182lv(new C2350wl(C12565ks.m58632x1(c14251otM69882b3.m68819x1().m23120k4().m48233um().mo47984x1()))).mo10154k4();
            for (int i = 0; i < c2033cjArrMo10154k4.length; i++) {
                if (C14113y2.m67363du(c2033cjArrMo10154k4[i].mo10137k4(), c14251otM69882b3.f47923k4)) {
                    this.f3074dy = (C2132iq) new C2284s2().mo11021k4(c2033cjArrMo10154k4[i]);
                }
            }
        }
        return this.f3074dy;
    }

    @Override // com.aspose.slides.IPresentation
    public final void save(OutputStream outputStream, final int i, final ISaveOptions iSaveOptions) {
        C11875x1.m55458k4(new AbstractC11874k4(outputStream) { // from class: com.aspose.slides.Presentation.2
            @Override // com.aspose.slides.internal.p466vu.AbstractC11874k4
            /* JADX INFO: renamed from: k4 */
            public void mo1976k4(AbstractC3150x6 abstractC3150x6) {
                Presentation.this.m2365k4(abstractC3150x6, i, iSaveOptions);
            }
        });
    }

    public Presentation(AbstractC3150x6 abstractC3150x6) {
        this(abstractC3150x6, new LoadOptions());
    }

    /* JADX INFO: renamed from: x1 */
    private void m2342x1(C9816ck c9816ck) {
        if (c9816ck == null) {
            throw new ArgumentNullException("fileSystem");
        }
        try {
            this.f3068bz = true;
            new gni(this).m6839k4(c9816ck, (InterruptionToken) this.f3092qm.getInterruptionToken());
            m2344yd();
            m2336lr();
        } finally {
            this.f3068bz = false;
            ((PresentationHeaderFooterManager) getHeaderFooterManager()).m2431x1();
        }
    }

    @Override // com.aspose.slides.IPresentation
    public final IImage[] getImages(IRenderingOptions iRenderingOptions, Size size) {
        return m2397x1(iRenderingOptions, C12023wl.m56855k4(size));
    }

    @Override // com.aspose.slides.IPresentation
    @Deprecated
    public final Bitmap[] getThumbnails(IRenderingOptions iRenderingOptions, int[] iArr) {
        return C3085sv.m13095k4(m2381k4(iRenderingOptions, iArr));
    }

    @Override // com.aspose.slides.IPresentation
    public final void save(OutputStream outputStream, final int[] iArr, final int i) {
        C11875x1.m55458k4(new AbstractC11874k4(outputStream) { // from class: com.aspose.slides.Presentation.4
            @Override // com.aspose.slides.internal.p466vu.AbstractC11874k4
            /* JADX INFO: renamed from: k4 */
            public void mo1976k4(AbstractC3150x6 abstractC3150x6) {
                Presentation.this.m2366k4(abstractC3150x6, iArr, i);
            }
        });
    }

    public Presentation(AbstractC3150x6 abstractC3150x6, LoadOptions loadOptions) {
        this(loadOptions, (C1209hm) null);
        try {
            try {
                this.f3095rv.m1549k4().m64804k4(true);
                m2327k4(abstractC3150x6, false);
            } catch (C3065k4 e) {
                throw new PptxReadException("Presentation reading aborted.", e);
            }
        } finally {
            this.f3095rv.m1549k4().m64804k4(false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static String m2325k4(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) ((bArr[(bArr.length - i) - 1] & 255) ^ ((bArr.length - 1) - i));
        }
        return AbstractC6747ar.m26635ix().m26681x1(bArr2);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m2343x1(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6.getLength() < 90) {
            return false;
        }
        byte[] bArr = new byte[90];
        abstractC3150x6.read(bArr, 0, 90);
        abstractC3150x6.seek(-90L, 1);
        String strM26681x1 = AbstractC6747ar.m26635ix().m26681x1(bArr);
        if (strM26681x1.indexOf("<") > 0) {
            strM26681x1 = strM26681x1.substring(strM26681x1.indexOf("<"));
        }
        return C14113y2.m67448x1(strM26681x1, "<?xml version=\"1.0\"") && C14113y2.m67359c5(strM26681x1, "office:document");
    }

    @Override // com.aspose.slides.IPresentation
    public final IImage[] getImages(IRenderingOptions iRenderingOptions, int[] iArr) {
        return Images.m1767k4(m2381k4(iRenderingOptions, iArr));
    }

    @Override // com.aspose.slides.IPresentation
    @Deprecated
    public final Bitmap[] getThumbnails(IRenderingOptions iRenderingOptions, int[] iArr, float f, float f2) {
        return C3085sv.m13095k4(m2382k4(iRenderingOptions, iArr, f, f2));
    }

    @Override // com.aspose.slides.IPresentation
    public final void save(OutputStream outputStream, final int[] iArr, final int i, final ISaveOptions iSaveOptions) {
        C11875x1.m55458k4(new AbstractC11874k4(outputStream) { // from class: com.aspose.slides.Presentation.5
            @Override // com.aspose.slides.internal.p466vu.AbstractC11874k4
            /* JADX INFO: renamed from: k4 */
            public void mo1976k4(AbstractC3150x6 abstractC3150x6) {
                Presentation.this.m2367k4(abstractC3150x6, iArr, i, iSaveOptions);
            }
        });
    }

    public Presentation(InputStream inputStream) {
        this(AbstractC3150x6.fromJava(inputStream));
    }

    @Override // com.aspose.slides.IPresentation
    public final IImage[] getImages(IRenderingOptions iRenderingOptions, int[] iArr, float f, float f2) {
        return Images.m1767k4(m2382k4(iRenderingOptions, iArr, f, f2));
    }

    @Override // com.aspose.slides.IPresentation
    @Deprecated
    public final Bitmap[] getThumbnails(IRenderingOptions iRenderingOptions, int[] iArr, Size size) {
        return C3085sv.m13095k4(m2383k4(iRenderingOptions, iArr, C12023wl.m56855k4(size)));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2358k4(float f, float f2) {
        IGenericEnumerator<ISlide> it = getMasters().iterator();
        while (it.hasNext()) {
            try {
                ((MasterSlide) it.next()).mo408x1(f, f2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = getSlides().iterator();
        while (it.hasNext()) {
            try {
                ((Slide) it.next()).mo408x1(f, f2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.IPresentation
    public final void save(String str, int i) {
        m2322dq();
        C13444fa c13444faM2340x1 = m2340x1(str);
        try {
            m2365k4(c13444faM2340x1.m62553k4(), i, (ISaveOptions) null);
            c13444faM2340x1.dispose();
        } catch (Throwable th) {
            if (c13444faM2340x1 != null) {
                c13444faM2340x1.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public IImage[] m2397x1(IRenderingOptions iRenderingOptions, C12023wl c12023wl) {
        return Images.m1767k4(m2380k4(iRenderingOptions, c12023wl.Clone()));
    }

    public Presentation(InputStream inputStream, LoadOptions loadOptions) {
        this(AbstractC3150x6.fromJava(inputStream), loadOptions);
    }

    @Override // com.aspose.slides.IPresentation
    public final IImage[] getImages(IRenderingOptions iRenderingOptions, int[] iArr, Size size) {
        return m2398x1(iRenderingOptions, iArr, C12023wl.m56855k4(size));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2359k4(float f, float f2, float f3) {
        IGenericEnumerator<IMasterSlide> it = getMasters().iterator();
        while (it.hasNext()) {
            try {
                MasterSlide masterSlide = (MasterSlide) it.next();
                masterSlide.mo393k4(f, f2, f3);
                IGenericEnumerator<ILayoutSlide> it2 = masterSlide.getLayoutSlides().iterator();
                while (it2.hasNext()) {
                    try {
                        ((LayoutSlide) it2.next()).mo393k4(f, f2, f3);
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (((MasterNotesSlide) getMasterNotesSlideManager().getMasterNotesSlide()) != null) {
            ((MasterNotesSlide) getMasterNotesSlideManager().getMasterNotesSlide()).m1931ix();
        }
        IGenericEnumerator<ISlide> it3 = getSlides().iterator();
        while (it3.hasNext()) {
            try {
                ((Slide) it3.next()).mo393k4(f, f2, f3);
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.IPresentation
    public final void save(String str, int i, ISaveOptions iSaveOptions) {
        m2322dq();
        C13444fa c13444faM2340x1 = m2340x1(str);
        try {
            m2365k4(c13444faM2340x1.m62553k4(), i, iSaveOptions);
            c13444faM2340x1.dispose();
        } catch (Throwable th) {
            if (c13444faM2340x1 != null) {
                c13444faM2340x1.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public IImage[] m2398x1(IRenderingOptions iRenderingOptions, int[] iArr, C12023wl c12023wl) {
        return Images.m1767k4(m2383k4(iRenderingOptions, iArr, c12023wl.Clone()));
    }

    public Presentation(String str) {
        this(str, new LoadOptions());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2360k4(IMasterTheme iMasterTheme) {
        this.f3072dq = (MasterTheme) iMasterTheme;
    }

    @Override // com.aspose.slides.IPresentation
    public final void save(String str, int[] iArr, int i) {
        m2322dq();
        C13444fa c13444faM2340x1 = m2340x1(str);
        try {
            m2366k4(c13444faM2340x1.m62553k4(), iArr, i);
            c13444faM2340x1.dispose();
        } catch (Throwable th) {
            if (c13444faM2340x1 != null) {
                c13444faM2340x1.dispose();
            }
            throw th;
        }
    }

    public Presentation(String str, LoadOptions loadOptions) {
        this(loadOptions, (C1209hm) null);
        m2330k4(str, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2361k4(ISaveOptions iSaveOptions) {
        this.f3079g8 = iSaveOptions;
    }

    @Override // com.aspose.slides.IPresentation
    public final void save(String str, int[] iArr, int i, ISaveOptions iSaveOptions) {
        m2322dq();
        C13444fa c13444faM2340x1 = m2340x1(str);
        try {
            m2367k4(c13444faM2340x1.m62553k4(), iArr, i, iSaveOptions);
            c13444faM2340x1.dispose();
        } catch (Throwable th) {
            if (c13444faM2340x1 != null) {
                c13444faM2340x1.dispose();
            }
            throw th;
        }
    }

    public Presentation(String str, LoadOptions loadOptions, C1209hm c1209hm) {
        this(loadOptions, c1209hm);
        m2330k4(str, true);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2362k4(SlideShowSettings slideShowSettings) {
        this.f3120zj = slideShowSettings;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m2326k4(C1197hf c1197hf, boolean z) {
        if (!C2862pr.m12466k4().m12471kk() && !z) {
            String[] strArrM48034k4 = C9763ck.m48030to().m48034k4();
            List<byte[]> listM1529k4 = FontsLoader.m1529k4();
            for (String str : strArrM48034k4) {
                C2862pr.m12466k4().m12470k4(str);
            }
            List.Enumerator<byte[]> it = listM1529k4.iterator();
            while (it.hasNext()) {
                try {
                    C2862pr.m12466k4().m12468k4(new C2182lv(new C2350wl(it.next())));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        if (C2862pr.m12466k4().m12472to() || !c1197hf.m7119du()) {
            return;
        }
        IGenericEnumerator<KeyValuePair<String, C1141ge>> it2 = c1197hf.m7122k4().iterator();
        while (it2.hasNext()) {
            try {
                IGenericEnumerator<KeyValuePair<TKey, TValue>> it3 = it2.next().getValue().m6502h4().iterator();
                while (it3.hasNext()) {
                    try {
                        C2862pr.m12466k4().m12469k4(FontsManager.m1538k4((byte[]) ((KeyValuePair) it3.next()).getValue()));
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m2363k4(AbstractC3150x6 abstractC3150x6, int i) {
        m2322dq();
        m2365k4(abstractC3150x6, i, (ISaveOptions) null);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2364k4(AbstractC3150x6 abstractC3150x6, int i, IPptxOptions iPptxOptions) {
        m2320ak();
        if (this.f3071ck.isOnlyDocumentPropertiesLoaded()) {
            throw new PptxException(C14113y2.m67408k4("If PPTX presentation is loaded with LoadOptions.OnlyLoadDocumentProperties ", "then saving this peresentation with modified document properties make no sense ", "because public document properties of a encrypted PPTX presentation are a secondary copy ", "of a base encrypted document properties. And we cannot modify encrypted document properties ", "without valid password."));
        }
        fbk fbkVar = new fbk();
        if (i == 6) {
            fbkVar.m6110x1(this, abstractC3150x6, i, iPptxOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
            return;
        }
        if (!this.f3071ck.isEncrypted() || (!this.f3071ck.isWriteProtected() && this.f3071ck.getEncryptionPassword() == null)) {
            fbkVar.m6109k4(this, abstractC3150x6, i, iPptxOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
            return;
        }
        this.f3071ck.m2464k4();
        C3152yj c3152yj = new C3152yj();
        try {
            fbkVar.m6109k4(this, c3152yj, i, iPptxOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
            c3152yj.seek(0L, 0);
            ng8.m68020k4(c3152yj, this.f3071ck.getEncryptionPassword(), abstractC3150x6, !this.f3071ck.getEncryptDocumentProperties() ? m2321b3() : null);
            c3152yj.dispose();
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m2365k4(AbstractC3150x6 abstractC3150x6, int i, ISaveOptions iSaveOptions) {
        m2322dq();
        if (iSaveOptions != null) {
            this.f3079g8 = iSaveOptions;
            if (C14113y2.m67411k4(iSaveOptions.getDefaultRegularFont())) {
                m2385ks().m7126k4((String) null);
            } else {
                m2385ks().m7126k4(iSaveOptions.getDefaultRegularFont());
            }
        }
        C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
        try {
            try {
                v7f.m72086k4(c14047bzClone.Clone());
                int size = getSlides().size();
                int[] iArr = new int[size];
                int i2 = 0;
                while (i2 < size) {
                    int i3 = i2 + 1;
                    iArr[i2] = i3;
                    i2 = i3;
                }
                switch (i) {
                    case 0:
                    case 19:
                    case 20:
                        new gij(this, iArr, (InterruptionToken) this.f3092qm.getInterruptionToken()).m6734k4(abstractC3150x6, iSaveOptions);
                        break;
                    case 1:
                        m2320ak();
                        PdfOptions pdfOptions = (PdfOptions) C7019kk.m27452k4((Object) iSaveOptions, PdfOptions.class);
                        if (pdfOptions == null) {
                            pdfOptions = new PdfOptions();
                        }
                        if ((((NotesCommentsLayoutingOptions) pdfOptions.getNotesCommentsLayouting()).m2029x1() && !C7019kk.m27469x1(pdfOptions.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) || C7019kk.m27469x1(pdfOptions.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)) {
                            kmn.m64040x1(this, abstractC3150x6, pdfOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        } else {
                            kmn.m64023k4(this, abstractC3150x6, pdfOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        }
                        break;
                    case 2:
                        m2320ak();
                        XpsOptions xpsOptions = (XpsOptions) C7019kk.m27452k4((Object) iSaveOptions, XpsOptions.class);
                        if (xpsOptions == null) {
                            xpsOptions = new XpsOptions();
                        }
                        kmn.m64026k4(this, abstractC3150x6, xpsOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        break;
                    case 3:
                        m2364k4(abstractC3150x6, 0, (IPptxOptions) C7019kk.m27452k4((Object) iSaveOptions, PptxOptions.class));
                        break;
                    case 4:
                        m2364k4(abstractC3150x6, 2, (IPptxOptions) C7019kk.m27452k4((Object) iSaveOptions, PptxOptions.class));
                        break;
                    case 5:
                        m2320ak();
                        TiffOptions tiffOptions = (TiffOptions) C7019kk.m27452k4((Object) iSaveOptions, TiffOptions.class);
                        if (tiffOptions == null) {
                            tiffOptions = new TiffOptions();
                        }
                        if ((((NotesCommentsLayoutingOptions) tiffOptions.getNotesCommentsLayouting()).m2029x1() && !C7019kk.m27469x1(tiffOptions.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) || C7019kk.m27469x1(tiffOptions.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)) {
                            kmn.m64042x1(this, abstractC3150x6, tiffOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        } else {
                            kmn.m64025k4(this, abstractC3150x6, tiffOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        }
                        break;
                    case 6:
                        m2328k4(abstractC3150x6, false, false);
                        break;
                    case 7:
                        m2364k4(abstractC3150x6, 1, (IPptxOptions) C7019kk.m27452k4((Object) iSaveOptions, PptxOptions.class));
                        break;
                    case 8:
                    case 12:
                    case 14:
                    case 16:
                    case 18:
                    default:
                        throw new PptxException("This export format is not implemented for PPTX yet.");
                    case 9:
                        m2364k4(abstractC3150x6, 3, (IPptxOptions) C7019kk.m27452k4((Object) iSaveOptions, PptxOptions.class));
                        break;
                    case 10:
                        m2364k4(abstractC3150x6, 4, (IPptxOptions) C7019kk.m27452k4((Object) iSaveOptions, PptxOptions.class));
                        break;
                    case 11:
                        m2364k4(abstractC3150x6, 5, (IPptxOptions) C7019kk.m27452k4((Object) iSaveOptions, PptxOptions.class));
                        break;
                    case 13:
                        m2320ak();
                        HtmlOptions htmlOptions = (HtmlOptions) C7019kk.m27452k4((Object) iSaveOptions, HtmlOptions.class);
                        if (htmlOptions == null) {
                            htmlOptions = new HtmlOptions();
                        }
                        if ((((NotesCommentsLayoutingOptions) htmlOptions.getNotesCommentsLayouting()).m2029x1() && !C7019kk.m27469x1(htmlOptions.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) || C7019kk.m27469x1(htmlOptions.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)) {
                            kmn.m64039x1(this, abstractC3150x6, htmlOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        } else {
                            kmn.m64021k4(this, abstractC3150x6, htmlOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        }
                        break;
                    case 15:
                        m2320ak();
                        SwfOptions swfOptions = (SwfOptions) C7019kk.m27452k4((Object) iSaveOptions, SwfOptions.class);
                        if (swfOptions == null) {
                            swfOptions = new SwfOptions();
                        }
                        if (!((NotesCommentsLayoutingOptions) swfOptions.getNotesCommentsLayouting()).m2029x1()) {
                            kmn.m64024k4(this, abstractC3150x6, swfOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        } else {
                            kmn.m64041x1(this, abstractC3150x6, swfOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        }
                        break;
                    case 17:
                        m2328k4(abstractC3150x6, true, false);
                        break;
                    case 21:
                        m2328k4(abstractC3150x6, true, true);
                        break;
                    case 22:
                        tqy.m71292k4(this, abstractC3150x6, AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) iArr)), (GifOptions) C7019kk.m27452k4((Object) iSaveOptions, GifOptions.class));
                        break;
                    case 23:
                        m2320ak();
                        Html5Options html5Options = (Html5Options) C7019kk.m27452k4((Object) iSaveOptions, Html5Options.class);
                        if (html5Options == null) {
                            html5Options = new Html5Options();
                        }
                        kmn.m64020k4(this, abstractC3150x6, html5Options, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        break;
                    case 24:
                        MarkdownSaveOptions markdownSaveOptions = (MarkdownSaveOptions) C7019kk.m27452k4((Object) iSaveOptions, MarkdownSaveOptions.class);
                        if (markdownSaveOptions == null) {
                            markdownSaveOptions = new MarkdownSaveOptions();
                        }
                        jxj.m63565k4(this, abstractC3150x6, iArr, markdownSaveOptions);
                        break;
                    case 25:
                        m2364k4(abstractC3150x6, 6, (IPptxOptions) C7019kk.m27452k4((Object) iSaveOptions, PptxOptions.class));
                        break;
                }
                v7f.m72084k4(c14047bzClone.Clone(), abstractC3150x6);
                v7f.m72090x1(c14047bzClone.Clone());
                this.f3079g8 = null;
            } catch (OperationCanceledException unused) {
                v7f.m72090x1(c14047bzClone.Clone());
                v7f.m72090x1(c14047bzClone.Clone());
                this.f3079g8 = null;
            } catch (C3065k4 e) {
                v7f.m72090x1(c14047bzClone.Clone());
                throw new PptxException("Saving aborted.", e);
            }
        } catch (Throwable th) {
            v7f.m72090x1(c14047bzClone.Clone());
            this.f3079g8 = null;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[Catch: all -> 0x0044, RuntimeException -> 0x0047, x3 -> 0x004a, PptxReadException -> 0x004d, OperationCanceledException -> 0x00f7, TryCatch #3 {PptxReadException -> 0x004d, blocks: (B:10:0x002e, B:12:0x0035, B:14:0x003f, B:48:0x00a8, B:50:0x00b8, B:51:0x00c9, B:23:0x0050, B:25:0x0056, B:26:0x005a, B:28:0x0060, B:29:0x0064, B:31:0x0076, B:33:0x007c, B:36:0x0083, B:37:0x0087, B:38:0x008b, B:40:0x0093, B:45:0x009f, B:47:0x00a5), top: B:78:0x002e, outer: #1 }] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m2327k4(AbstractC3150x6 abstractC3150x6, boolean z) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        InterfaceC13443dy interfaceC13443dyM62576k4 = this.f3115x6.m62576k4(abstractC3150x6);
        this.f3083jd = interfaceC13443dyM62576k4;
        AbstractC3150x6 abstractC3150x6Mo18614x1 = interfaceC13443dyM62576k4.mo18614x1();
        try {
            if (abstractC3150x6Mo18614x1.getLength() == 0) {
                throw new ArgumentException("The stream is empty.", "stream");
            }
            if (abstractC3150x6Mo18614x1.getPosition() == abstractC3150x6Mo18614x1.getLength()) {
                throw new ArgumentException("The presentation stream position is set to the end of stream. For properly loading set the stream.Position to the stream beginning.", "stream");
            }
            C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
            try {
                try {
                    try {
                        int i = abstractC3150x6Mo18614x1.readByte();
                        boolean zM51480kk = true;
                        if (i > 0) {
                            abstractC3150x6Mo18614x1.seek(-1L, 1);
                            if (((byte) i) == 80) {
                                m2341x1(abstractC3150x6Mo18614x1, z);
                            } else if (m2333k4(abstractC3150x6Mo18614x1)) {
                                m2337to(abstractC3150x6Mo18614x1);
                            } else if (m2343x1(abstractC3150x6Mo18614x1)) {
                                m2323du(abstractC3150x6Mo18614x1);
                            } else {
                                C9816ck c9816ckM6834x1 = gni.m6834x1(abstractC3150x6Mo18614x1);
                                C9820h4 c9820h4 = (C9820h4) c9816ckM6834x1.m48360k4().m48344to("PowerPoint Document");
                                if (c9820h4 == null) {
                                    if (this.f3092qm.getOnlyLoadDocumentProperties() || !this.f3092qm.m1923x1()) {
                                        zM51480kk = false;
                                    }
                                    if (!zM51480kk) {
                                        zM51480kk = C10591pk.m51480kk(c9816ckM6834x1);
                                    }
                                    if (zM51480kk) {
                                        m2335kk(abstractC3150x6Mo18614x1);
                                    }
                                } else if (C10591pk.m51479k4(c9816ckM6834x1, c9820h4) || C10591pk.m51480kk(c9816ckM6834x1)) {
                                    m2329k4(c9816ckM6834x1, c9820h4);
                                }
                                m2342x1(c9816ckM6834x1);
                            }
                            double dM72084k4 = v7f.m72084k4(c14047bzClone.Clone(), abstractC3150x6Mo18614x1);
                            C3048e0.m12897k4().m12902k4(dM72084k4 > 20.0d ? 1 + C7019kk.m27438h4(Double.valueOf(C14116yg.m67490kk((dM72084k4 - 20.0d) / 20.0d)), 14) : 1L);
                        }
                    } catch (PptxReadException e) {
                        if (!m2332k4((Exception) e)) {
                            v7f.m72090x1(c14047bzClone.Clone());
                            throw e;
                        }
                    }
                } catch (C11848x3 e2) {
                    if (!m2332k4((Exception) e2)) {
                        v7f.m72090x1(c14047bzClone.Clone());
                        throw e2;
                    }
                }
            } catch (OperationCanceledException unused) {
                v7f.m72090x1(c14047bzClone.Clone());
            } catch (RuntimeException e3) {
                v7f.m72090x1(c14047bzClone.Clone());
                throw e3;
            }
            abstractC3150x6Mo18614x1.dispose();
        } catch (Throwable th) {
            if (abstractC3150x6Mo18614x1 != null) {
                abstractC3150x6Mo18614x1.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m2328k4(AbstractC3150x6 abstractC3150x6, boolean z, boolean z2) {
        m2320ak();
        if (z2) {
            if (this.f3071ck.isEncrypted()) {
                throw new InvalidOperationException("Fodp format does not support saving with a password.");
            }
            new lzc().m64641k4(this, abstractC3150x6, (InterruptionToken) this.f3092qm.getInterruptionToken());
            return;
        }
        if (this.f3071ck.isEncrypted()) {
            this.f3071ck.m2464k4();
        }
        C12275wy c12275wy = new C12275wy();
        try {
            new lzc().m64642k4(this, c12275wy, z, (InterruptionToken) this.f3092qm.getInterruptionToken());
            c12275wy.m57507x1(abstractC3150x6);
        } finally {
            c12275wy.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m2366k4(AbstractC3150x6 abstractC3150x6, int[] iArr, int i) {
        m2322dq();
        m2367k4(abstractC3150x6, iArr, i, (ISaveOptions) null);
    }

    /* JADX INFO: renamed from: k4 */
    public void m2367k4(AbstractC3150x6 abstractC3150x6, int[] iArr, int i, ISaveOptions iSaveOptions) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        if (iArr == null) {
            throw new ArgumentNullException("slides");
        }
        if (iArr.length == 0) {
            throw new ArgumentException("'slides' array is empty", "slides");
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 < 1 || i3 > getSlides().size()) {
                throw new ArgumentOutOfRangeException("slides", C14113y2.m67402k4("'slides' array contains {0} slide position, which is not present in the presentation.", Integer.valueOf(iArr[i2])));
            }
        }
        if (iSaveOptions != null) {
            this.f3079g8 = iSaveOptions;
            if (C14113y2.m67411k4(iSaveOptions.getDefaultRegularFont())) {
                m2385ks().m7126k4((String) null);
            } else {
                m2385ks().m7126k4(iSaveOptions.getDefaultRegularFont());
            }
        }
        C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
        try {
            try {
                v7f.m72086k4(c14047bzClone.Clone());
                switch (i) {
                    case 0:
                    case 3:
                    case 4:
                    case 6:
                    case 7:
                    case 9:
                    case 10:
                    case 11:
                    case 17:
                    case 19:
                    case 20:
                    case 25:
                        throw new InvalidOperationException("Saving with specified slide positions is not possible for PPTX, PPTM, PPSX, PPSM, POTX, POTM, PPT, POT, ODP, PPS, OTP, XML formats. Use cloning for them.");
                    case 1:
                        m2320ak();
                        PdfOptions pdfOptions = (PdfOptions) C7019kk.m27452k4((Object) iSaveOptions, PdfOptions.class);
                        if (pdfOptions == null) {
                            pdfOptions = new PdfOptions();
                        }
                        if ((!((NotesCommentsLayoutingOptions) pdfOptions.getNotesCommentsLayouting()).m2029x1() || C7019kk.m27469x1(pdfOptions.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) && !C7019kk.m27469x1(pdfOptions.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)) {
                            kmn.m64029k4(this, abstractC3150x6, iArr, pdfOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        } else {
                            kmn.m64044x1(this, abstractC3150x6, iArr, pdfOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        }
                        break;
                    case 2:
                        m2320ak();
                        XpsOptions xpsOptions = (XpsOptions) C7019kk.m27452k4((Object) iSaveOptions, XpsOptions.class);
                        if (xpsOptions == null) {
                            xpsOptions = new XpsOptions();
                        }
                        kmn.m64032k4(this, abstractC3150x6, iArr, xpsOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        break;
                    case 5:
                        m2320ak();
                        TiffOptions tiffOptions = (TiffOptions) C7019kk.m27452k4((Object) iSaveOptions, TiffOptions.class);
                        if (tiffOptions == null) {
                            tiffOptions = new TiffOptions();
                        }
                        if ((!((NotesCommentsLayoutingOptions) tiffOptions.getNotesCommentsLayouting()).m2029x1() || C7019kk.m27469x1(tiffOptions.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) && !C7019kk.m27469x1(tiffOptions.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)) {
                            kmn.m64046x1(this, abstractC3150x6, iArr, tiffOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        } else {
                            kmn.m64031k4(this, abstractC3150x6, iArr, tiffOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        }
                        break;
                    case 8:
                    case 12:
                    case 14:
                    case 16:
                    case 18:
                    case 21:
                    default:
                        throw new PptxException("This export format is not implemented for PPTX yet.");
                    case 13:
                        m2320ak();
                        HtmlOptions htmlOptions = (HtmlOptions) C7019kk.m27452k4((Object) iSaveOptions, HtmlOptions.class);
                        if (htmlOptions == null) {
                            htmlOptions = new HtmlOptions();
                        }
                        if ((!((NotesCommentsLayoutingOptions) htmlOptions.getNotesCommentsLayouting()).m2029x1() || C7019kk.m27469x1(htmlOptions.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) && !C7019kk.m27469x1(htmlOptions.getSlidesLayoutOptions(), NotesCommentsLayoutingOptions.class)) {
                            kmn.m64028k4(this, abstractC3150x6, iArr, htmlOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        } else {
                            kmn.m64043x1(this, abstractC3150x6, iArr, htmlOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        }
                        break;
                    case 15:
                        m2320ak();
                        SwfOptions swfOptions = (SwfOptions) C7019kk.m27452k4((Object) iSaveOptions, SwfOptions.class);
                        if (swfOptions == null) {
                            swfOptions = new SwfOptions();
                        }
                        if (((NotesCommentsLayoutingOptions) swfOptions.getNotesCommentsLayouting()).m2029x1()) {
                            kmn.m64045x1(this, abstractC3150x6, iArr, swfOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        } else {
                            kmn.m64030k4(this, abstractC3150x6, iArr, swfOptions, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        }
                        break;
                    case 22:
                        m2320ak();
                        tqy.m71292k4(this, abstractC3150x6, AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) iArr)), (GifOptions) C7019kk.m27452k4((Object) iSaveOptions, GifOptions.class));
                        break;
                    case 23:
                        m2320ak();
                        Html5Options html5Options = (Html5Options) C7019kk.m27452k4((Object) iSaveOptions, Html5Options.class);
                        if (html5Options == null) {
                            html5Options = new Html5Options();
                        }
                        kmn.m64027k4(this, abstractC3150x6, iArr, html5Options, (InterruptionToken) this.f3092qm.getInterruptionToken());
                        break;
                    case 24:
                        MarkdownSaveOptions markdownSaveOptions = (MarkdownSaveOptions) C7019kk.m27452k4((Object) iSaveOptions, MarkdownSaveOptions.class);
                        if (markdownSaveOptions == null) {
                            markdownSaveOptions = new MarkdownSaveOptions();
                        }
                        jxj.m63565k4(this, abstractC3150x6, iArr, markdownSaveOptions);
                        break;
                }
                v7f.m72084k4(c14047bzClone.Clone(), abstractC3150x6);
                v7f.m72090x1(c14047bzClone.Clone());
                this.f3079g8 = null;
            } catch (C3065k4 e) {
                v7f.m72090x1(c14047bzClone.Clone());
                throw new PptxException("Saving aborted.", e);
            }
        } catch (Throwable th) {
            v7f.m72090x1(c14047bzClone.Clone());
            this.f3079g8 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2368k4(C3662y9 c3662y9) {
        this.f3109vj = c3662y9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2369k4(C7134m9 c7134m9, C7134m9 c7134m92, C7131h4 c7131h4) {
        this.f3081ix.m56971k4(c7134m9, c7131h4);
        this.f3090ne.m56971k4(c7134m92, c7131h4);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(7:35|3|38|4|36|5|6)|32|18|33|19|40|20|30|31|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        r0 = r6;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        com.aspose.slides.internal.p077d8.C3085sv.m13082k4(r0);
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2370k4(C9816ck c9816ck) throws Throwable {
        C3088tq c3088tq;
        C3152yj c3152yj;
        try {
            try {
                try {
                    c3152yj = new C3152yj(((C9820h4) c9816ck.m48360k4().m48344to("\u0005SummaryInformation")).m48410k4());
                    try {
                        c3088tq = new C3088tq(c3152yj);
                        try {
                            c3152yj.close();
                            c3152yj.dispose();
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (RuntimeException e) {
                    e = e;
                    C3085sv.m13082k4(e);
                    c3152yj = new C3152yj(((C9820h4) c9816ck.m48360k4().m48344to("\u0005DocumentSummaryInformation")).m48410k4());
                    C3088tq c3088tq2 = new C3088tq(c3152yj);
                    C14670va c14670va = new C14670va(c3088tq2, c3088tq);
                    DocumentProperties documentProperties = new DocumentProperties(this);
                    this.f3070c6 = documentProperties;
                    documentProperties.setAuthor(c14670va.m72140kk());
                    this.f3070c6.setCategory(c14670va.m72161yj());
                    this.f3070c6.setComments(c14670va.m72112du());
                    this.f3070c6.setCompany(c14670va.m72152up());
                    this.f3070c6.m1336k4(c14670va.m72108c5().Clone());
                    this.f3070c6.setKeywords(c14670va.m72149to());
                    this.f3070c6.m1343kk(c14670va.m72144m9().Clone());
                    this.f3070c6.setLastSavedBy(c14670va.m72118h4());
                    this.f3070c6.m1346to(c14670va.m72121jd().Clone());
                    this.f3070c6.setManager(c14670va.m72116fa());
                    this.f3070c6.setNameOfApplication(c14670va.m72143ks());
                    this.f3070c6.setRevisionNumber(c14670va.m72160x6());
                    this.f3070c6.setSubject(c14670va.m72156x1());
                    this.f3070c6.setApplicationTemplate(c14670va.m72148rv());
                    this.f3070c6.setTitle(c14670va.m72123k4());
                    this.f3070c6.m1335k4(c14670va.m72114dy().Clone());
                    this.f3070c6.setHyperlinkBase(c14670va.m72120ix());
                    return;
                }
            } catch (RuntimeException e2) {
                e = e2;
                c3088tq = null;
                C3085sv.m13082k4(e);
                c3152yj = new C3152yj(((C9820h4) c9816ck.m48360k4().m48344to("\u0005DocumentSummaryInformation")).m48410k4());
                C3088tq c3088tq22 = new C3088tq(c3152yj);
                C14670va c14670va2 = new C14670va(c3088tq22, c3088tq);
                DocumentProperties documentProperties2 = new DocumentProperties(this);
                this.f3070c6 = documentProperties2;
                documentProperties2.setAuthor(c14670va2.m72140kk());
                this.f3070c6.setCategory(c14670va2.m72161yj());
                this.f3070c6.setComments(c14670va2.m72112du());
                this.f3070c6.setCompany(c14670va2.m72152up());
                this.f3070c6.m1336k4(c14670va2.m72108c5().Clone());
                this.f3070c6.setKeywords(c14670va2.m72149to());
                this.f3070c6.m1343kk(c14670va2.m72144m9().Clone());
                this.f3070c6.setLastSavedBy(c14670va2.m72118h4());
                this.f3070c6.m1346to(c14670va2.m72121jd().Clone());
                this.f3070c6.setManager(c14670va2.m72116fa());
                this.f3070c6.setNameOfApplication(c14670va2.m72143ks());
                this.f3070c6.setRevisionNumber(c14670va2.m72160x6());
                this.f3070c6.setSubject(c14670va2.m72156x1());
                this.f3070c6.setApplicationTemplate(c14670va2.m72148rv());
                this.f3070c6.setTitle(c14670va2.m72123k4());
                this.f3070c6.m1335k4(c14670va2.m72114dy().Clone());
                this.f3070c6.setHyperlinkBase(c14670va2.m72120ix());
                return;
            }
            C3088tq c3088tq222 = new C3088tq(c3152yj);
            C14670va c14670va22 = new C14670va(c3088tq222, c3088tq);
            DocumentProperties documentProperties22 = new DocumentProperties(this);
            this.f3070c6 = documentProperties22;
            documentProperties22.setAuthor(c14670va22.m72140kk());
            this.f3070c6.setCategory(c14670va22.m72161yj());
            this.f3070c6.setComments(c14670va22.m72112du());
            this.f3070c6.setCompany(c14670va22.m72152up());
            this.f3070c6.m1336k4(c14670va22.m72108c5().Clone());
            this.f3070c6.setKeywords(c14670va22.m72149to());
            this.f3070c6.m1343kk(c14670va22.m72144m9().Clone());
            this.f3070c6.setLastSavedBy(c14670va22.m72118h4());
            this.f3070c6.m1346to(c14670va22.m72121jd().Clone());
            this.f3070c6.setManager(c14670va22.m72116fa());
            this.f3070c6.setNameOfApplication(c14670va22.m72143ks());
            this.f3070c6.setRevisionNumber(c14670va22.m72160x6());
            this.f3070c6.setSubject(c14670va22.m72156x1());
            this.f3070c6.setApplicationTemplate(c14670va22.m72148rv());
            this.f3070c6.setTitle(c14670va22.m72123k4());
            this.f3070c6.m1335k4(c14670va22.m72114dy().Clone());
            this.f3070c6.setHyperlinkBase(c14670va22.m72120ix());
            return;
        } finally {
            c3152yj.dispose();
        }
        c3152yj = new C3152yj(((C9820h4) c9816ck.m48360k4().m48344to("\u0005DocumentSummaryInformation")).m48410k4());
    }

    /* JADX INFO: renamed from: k4 */
    private void m2329k4(C9816ck c9816ck, C9820h4 c9820h4) {
        byte[] bArrM48410k4 = c9820h4.m48410k4();
        C3152yj c3152yj = new C3152yj(bArrM48410k4);
        try {
            C10646tb.m51735k4(c9816ck, bArrM48410k4, (C10372bq) C10591pk.m51474k4(c3152yj, C10528lr.m51214k4(c9816ck).m51218x1() & 4294967295L, (AbstractC10571o4) null), (C10755zn) C10591pk.m51474k4(c3152yj, r3.m50475kk(), (AbstractC10571o4) null), this.f3092qm.getPassword(), m2349du().getOnlyLoadDocumentProperties(), new boolean[]{false});
            this.f3071ck.encrypt(this.f3092qm.getPassword());
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m2371k4(C12380dy c12380dy, C12003du c12003du, IFindResultCallback iFindResultCallback) {
        SlideUtil.m2765k4(this, c12380dy, c12003du.Clone(), iFindResultCallback);
    }

    /* JADX INFO: renamed from: k4 */
    public void m2372k4(C12380dy c12380dy, String str, IFindResultCallback iFindResultCallback) {
        SlideUtil.m2766k4(this, c12380dy, str, iFindResultCallback);
    }

    /* JADX INFO: renamed from: k4 */
    public void m2373k4(C14084qq c14084qq) {
        m2322dq();
        if (C14084qq.m67078dy(this.f3098sv, c14084qq)) {
            m2339wy();
        }
        c14084qq.CloneTo(this.f3098sv);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2374k4(Object obj) {
        this.f3076em = obj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2375k4(String str) {
        this.f3091os = str;
    }

    /* JADX INFO: renamed from: k4 */
    public void m2376k4(String str, C12003du c12003du) {
        m2377k4(str, c12003du.Clone(), new TextSearchOptions(), (IFindResultCallback) null);
    }

    /* JADX INFO: renamed from: k4 */
    public void m2377k4(String str, C12003du c12003du, ITextSearchOptions iTextSearchOptions, IFindResultCallback iFindResultCallback) {
        SlideUtil.m2767k4(this, str, c12003du.Clone(), iTextSearchOptions, iFindResultCallback);
    }

    /* JADX INFO: renamed from: k4 */
    private void m2330k4(String str, boolean z) {
        this.f3114x1 = C3141rv.m13406kk(str);
        try {
            try {
                this.f3095rv.m1549k4().m64804k4(true);
                if (this.f3092qm.getBlobManagementOptions().getPresentationLockingBehavior() == 0) {
                    C3130fa c3130fa = new C3130fa(str, 3, 1, 1);
                    try {
                        m2327k4(c3130fa, z);
                        c3130fa.dispose();
                    } catch (Throwable th) {
                        c3130fa.dispose();
                        throw th;
                    }
                } else {
                    C3130fa c3130fa2 = new C3130fa(str, 3, 1, 1);
                    this.f3069c5 = c3130fa2;
                    m2327k4(c3130fa2, z);
                }
                this.f3095rv.m1549k4().m64804k4(false);
            } catch (C3065k4 e) {
                throw new PptxReadException("Presentation reading aborted.", e);
            }
        } catch (Throwable th2) {
            this.f3095rv.m1549k4().m64804k4(false);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m2331k4(boolean z) {
        if (this.f3101tq) {
            return;
        }
        if (z) {
            this.f3094qw.clear();
            C13452x1 c13452x1 = this.f3115x6;
            if (c13452x1 != null) {
                c13452x1.dispose();
                this.f3115x6 = null;
            }
            AbstractC3150x6 abstractC3150x6 = this.f3069c5;
            if (abstractC3150x6 != null) {
                abstractC3150x6.dispose();
                this.f3069c5 = null;
            }
            C2862pr.m12466k4().m12473x1();
            this.f3106uz.m7122k4().dispose();
            this.f3106uz.m7131m9();
            C9762c6.m48021k4().m48064m9();
            this.f3106uz.m7120dy();
            m2338v4();
            this.f3083jd = null;
            SlideCollection slideCollection = this.f3078fa;
            if (slideCollection != null) {
                IGenericEnumerator<ISlide> it = slideCollection.iterator();
                while (it.hasNext()) {
                    IBaseSlide iBaseSlide = (ISlide) it.next();
                    if (iBaseSlide != null && iBaseSlide.getShapes() != null) {
                        iBaseSlide.getShapes().clear();
                        ((BaseSlide) iBaseSlide).f1084x1 = null;
                    }
                }
                this.f3078fa.m2739x1();
            }
            this.f3105up.m1853x1();
            MasterSlideCollection masterSlideCollection = this.f3119yj;
            if (masterSlideCollection != null) {
                IGenericEnumerator<IMasterSlide> it2 = masterSlideCollection.iterator();
                while (it2.hasNext()) {
                    IBaseSlide iBaseSlide2 = (IMasterSlide) it2.next();
                    IGenericEnumerator<IShape> it3 = iBaseSlide2.getShapes().iterator();
                    while (it3.hasNext()) {
                        IShape next = it3.next();
                        if (next instanceof GroupShape) {
                            ((GroupShape) next).f2428k4.clear();
                        }
                    }
                    ((BaseSlide) iBaseSlide2).f1084x1 = null;
                }
                this.f3119yj.m1950x1();
            }
            this.f3087ks.clear();
            this.f3115x6 = null;
            this.f3104um.m1716du();
            this.f3067bv.m267k4();
            this.f3107v4.m3072k4();
            this.f3088lr.clear();
            this.f3113wy.m1277x1();
            this.f3064ak.clear();
            this.f3085kk = null;
            this.f3072dq = null;
            this.f3100to = null;
            this.f3116xk = null;
            this.f3070c6 = null;
            this.f3073du.clear();
            this.f3097ss = null;
            this.f3086kp = null;
            this.f3096s7 = null;
            this.f3077f9 = null;
            this.f3099t6 = null;
            this.f3117xw = null;
            this.f3109vj = null;
            this.f3106uz.m7131m9();
            this.f3106uz.m7120dy();
            this.f3090ne.m56974kk();
            this.f3081ix.m56974kk();
            Dictionary<C7134m9, Integer> dictionary = this.f3103u4;
            if (dictionary != null) {
                dictionary.clear();
            }
            C13736km.m64003x1();
            sxo.m70841lr();
        }
        this.f3101tq = true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m2332k4(Exception exception) {
        for (Throwable innerException = exception.getInnerException(); innerException != null; innerException = innerException.getCause()) {
            if (C7019kk.m27469x1(innerException, OperationCanceledException.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m2333k4(AbstractC3150x6 abstractC3150x6) {
        XmlDocument xmlDocument = new XmlDocument();
        try {
            xmlDocument.load(abstractC3150x6);
            return "progid=\"PowerPoint.Show\"".equals(xmlDocument.getChildNodes().m65457kk(1).getInnerText());
        } catch (RuntimeException unused) {
            return false;
        } finally {
            abstractC3150x6.seek(0L, 0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int[] m2334k4(ctm ctmVar, byte[][] bArr) {
        int[] iArr = r1s.f48529k4;
        bArr[0] = null;
        if (ctmVar != null) {
            long[] jArr = {2015915340, 7653065307L, 9145307430L, 3014753096L, 5407453107L, 3147635709L, 6735417534L, 4576956709L};
            long j = jArr[0] + jArr[1];
            long j2 = jArr[2] + jArr[3];
            long j3 = jArr[4] + jArr[5];
            if (((((j ^ ((long) ctmVar.hashCode())) ^ j2) ^ j3) ^ (jArr[6] + jArr[7])) == ctmVar.f4438kk) {
                bArr[0] = (byte[]) C7019kk.m27458kk(ctmVar.f4439x1, byte[].class);
                return (int[]) ctmVar.f4437k4;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4[] m2378k4(IRenderingOptions iRenderingOptions) {
        C12009k4[] c12009k4ArrM4779k4;
        m2322dq();
        if (C14113y2.m67411k4(iRenderingOptions.getDefaultRegularFont())) {
            m2385ks().m7126k4((String) null);
        } else {
            m2385ks().m7126k4(iRenderingOptions.getDefaultRegularFont());
        }
        try {
            if (C7019kk.m27469x1(iRenderingOptions.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) {
                c12009k4ArrM4779k4 = C14660v1.m72033k4(this, iRenderingOptions);
            } else {
                int size = getSlides().size();
                int[] iArr = new int[size];
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    iArr[i] = i2;
                    i = i2;
                }
                c12009k4ArrM4779k4 = C0866cq.m4779k4(this, iRenderingOptions.getNotesCommentsLayouting(), iArr);
            }
            return c12009k4ArrM4779k4;
        } finally {
            m2385ks().m7126k4((String) null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4[] m2379k4(IRenderingOptions iRenderingOptions, float f, float f2) {
        C12009k4[] c12009k4ArrM4780k4;
        m2322dq();
        if (C14113y2.m67411k4(iRenderingOptions.getDefaultRegularFont())) {
            m2385ks().m7126k4((String) null);
        } else {
            m2385ks().m7126k4(iRenderingOptions.getDefaultRegularFont());
        }
        try {
            if (C7019kk.m27469x1(iRenderingOptions.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) {
                c12009k4ArrM4780k4 = C14660v1.m72034k4(this, iRenderingOptions, f, f2);
            } else {
                int size = getSlides().size();
                int[] iArr = new int[size];
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    iArr[i] = i2;
                    i = i2;
                }
                c12009k4ArrM4780k4 = C0866cq.m4780k4(this, iRenderingOptions.getNotesCommentsLayouting(), iArr, f, f2);
            }
            return c12009k4ArrM4780k4;
        } finally {
            m2385ks().m7126k4((String) null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4[] m2380k4(IRenderingOptions iRenderingOptions, C12023wl c12023wl) {
        C12009k4[] c12009k4ArrM4781k4;
        m2322dq();
        if (C14113y2.m67411k4(iRenderingOptions.getDefaultRegularFont())) {
            m2385ks().m7126k4((String) null);
        } else {
            m2385ks().m7126k4(iRenderingOptions.getDefaultRegularFont());
        }
        try {
            if (C7019kk.m27469x1(iRenderingOptions.getSlidesLayoutOptions(), HandoutLayoutingOptions.class)) {
                c12009k4ArrM4781k4 = C14660v1.m72035k4(this, iRenderingOptions, c12023wl.Clone());
            } else {
                int size = getSlides().size();
                int[] iArr = new int[size];
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    iArr[i] = i2;
                    i = i2;
                }
                c12009k4ArrM4781k4 = C0866cq.m4781k4(this, iRenderingOptions.getNotesCommentsLayouting(), iArr, c12023wl.Clone());
            }
            return c12009k4ArrM4781k4;
        } finally {
            m2385ks().m7126k4((String) null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4[] m2381k4(IRenderingOptions iRenderingOptions, int[] iArr) {
        m2322dq();
        if (C14113y2.m67411k4(iRenderingOptions.getDefaultRegularFont())) {
            m2385ks().m7126k4((String) null);
        } else {
            m2385ks().m7126k4(iRenderingOptions.getDefaultRegularFont());
        }
        try {
            return C7019kk.m27469x1(iRenderingOptions.getSlidesLayoutOptions(), HandoutLayoutingOptions.class) ? C14660v1.m72033k4(this, iRenderingOptions) : C0866cq.m4779k4(this, iRenderingOptions.getNotesCommentsLayouting(), iArr);
        } finally {
            m2385ks().m7126k4((String) null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4[] m2382k4(IRenderingOptions iRenderingOptions, int[] iArr, float f, float f2) {
        m2322dq();
        if (C14113y2.m67411k4(iRenderingOptions.getDefaultRegularFont())) {
            m2385ks().m7126k4((String) null);
        } else {
            m2385ks().m7126k4(iRenderingOptions.getDefaultRegularFont());
        }
        try {
            return C7019kk.m27469x1(iRenderingOptions.getSlidesLayoutOptions(), HandoutLayoutingOptions.class) ? C14660v1.m72034k4(this, iRenderingOptions, f, f2) : C0866cq.m4780k4(this, iRenderingOptions.getNotesCommentsLayouting(), iArr, f, f2);
        } finally {
            m2385ks().m7126k4((String) null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4[] m2383k4(IRenderingOptions iRenderingOptions, int[] iArr, C12023wl c12023wl) {
        if (C14113y2.m67411k4(iRenderingOptions.getDefaultRegularFont())) {
            m2385ks().m7126k4((String) null);
        } else {
            m2385ks().m7126k4(iRenderingOptions.getDefaultRegularFont());
        }
        try {
            return C7019kk.m27469x1(iRenderingOptions.getSlidesLayoutOptions(), HandoutLayoutingOptions.class) ? C14660v1.m72035k4(this, iRenderingOptions, c12023wl.Clone()) : C0866cq.m4781k4(this, iRenderingOptions.getNotesCommentsLayouting(), iArr, c12023wl.Clone());
        } finally {
            m2385ks().m7126k4((String) null);
        }
    }
}
