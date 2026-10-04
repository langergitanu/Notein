package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.q6 */
/* JADX INFO: loaded from: classes3.dex */
class C14329q6 extends AbstractC0858ck<Background, C14329q6> implements IBackgroundEffectiveData {

    /* JADX INFO: renamed from: ck */
    private static final C14329q6 f48251ck = m69424dy();

    /* JADX INFO: renamed from: c5 */
    private int f48252c5;

    /* JADX INFO: renamed from: du */
    private C14176nc f48253du;

    /* JADX INFO: renamed from: dy */
    private final C14811xp f48254dy;

    /* JADX INFO: renamed from: h4 */
    private final C14176nc f48255h4;

    /* JADX INFO: renamed from: jd */
    private IShape f48256jd;

    /* JADX INFO: renamed from: kk */
    private byte f48257kk;

    /* JADX INFO: renamed from: m9 */
    private final C14754wx f48258m9;

    /* JADX INFO: renamed from: to */
    private C14176nc f48259to;

    public C14329q6(Background background) {
        super(background);
        this.f48259to = new C14176nc(this);
        this.f48255h4 = C14176nc.m67921up();
        this.f48258m9 = new C14754wx(this);
        this.f48257kk = (byte) -1;
        this.f48254dy = new C14811xp();
        this.f48252c5 = 0;
    }

    /* JADX INFO: renamed from: dy */
    private static C14329q6 m69424dy() {
        C14329q6 c14329q6 = new C14329q6(null);
        c14329q6.f48257kk = (byte) 1;
        c14329q6.f48259to = C14176nc.m67919rv();
        return c14329q6;
    }

    /* JADX INFO: renamed from: k4 */
    public static C14329q6 m69425k4(Background background) {
        IBaseSlide iBaseSlideM2687bv;
        IBaseSlide masterSlide;
        IPresentationComponent parent_IPresentationComponent = background.getParent_IPresentationComponent();
        if (C7019kk.m27469x1(parent_IPresentationComponent, Slide.class)) {
            iBaseSlideM2687bv = ((Slide) parent_IPresentationComponent).m2687bv();
        } else {
            if (C7019kk.m27469x1(parent_IPresentationComponent, NotesSlide.class)) {
                masterSlide = ((NotesSlide) parent_IPresentationComponent).m403rv().getMasterNotesSlideManager().getMasterNotesSlide();
            } else if (C7019kk.m27469x1(parent_IPresentationComponent, LayoutSlide.class)) {
                masterSlide = ((LayoutSlide) parent_IPresentationComponent).getMasterSlide();
            } else {
                if (C7019kk.m27469x1(parent_IPresentationComponent, MasterSlide.class) || C7019kk.m27469x1(parent_IPresentationComponent, MasterNotesSlide.class) || C7019kk.m27469x1(parent_IPresentationComponent, MasterHandoutSlide.class)) {
                    return f48251ck;
                }
                iBaseSlideM2687bv = null;
            }
            iBaseSlideM2687bv = (BaseSlide) masterSlide;
        }
        return iBaseSlideM2687bv != null ? ((Background) iBaseSlideM2687bv.getBackground()).m337m9() : f48251ck;
    }

    @Override // com.aspose.slides.IBackgroundEffectiveData
    public final IEffectFormatEffectiveData getEffectFormat() {
        return this.f48258m9;
    }

    @Override // com.aspose.slides.IBackgroundEffectiveData
    public final IFillFormatEffectiveData getFillFormat() {
        byte b = this.f48257kk;
        if (b == 1) {
            return this.f48259to;
        }
        if (b == 0) {
            return this.f48253du;
        }
        throw new Exception("Unknown/NotDefined effective background type.");
    }

    /* JADX INFO: renamed from: h4 */
    public final byte m69426h4() {
        return this.f48257kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final IShape m69429m9() {
        return this.f48256jd;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        this.f48259to.mo4833k4(iBaseSlide, dm6Var);
        this.f48258m9.mo4833k4(iBaseSlide, dm6Var);
        this.f48254dy.m73524k4(iBaseSlide, dm6Var);
        if (this.f48257kk == 0) {
            if ((this.f48252c5 & 65535) > 0) {
                this.f48253du = (C14176nc) ((C0874cy) iBaseSlide.createThemeEffective().getFormatScheme()).m4880k4(iBaseSlide, this.f48254dy.m73522k4().Clone()).get_Item((this.f48252c5 & 65535) - 1);
                return;
            }
            C14176nc c14176nc = this.f48255h4;
            this.f48253du = c14176nc;
            c14176nc.mo4833k4(iBaseSlide, dm6Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, Background background) {
        ColorFormat colorFormat;
        C14754wx c14754wx;
        EffectFormat effectFormat;
        C14329q6 c14329q6 = (C14329q6) interfaceC14672vc;
        this.f48257kk = c14329q6.f48257kk;
        this.f48259to.m67934k4((InterfaceC14672vc) c14329q6.f48259to);
        this.f48258m9.m72948k4((InterfaceC14672vc) c14329q6.f48258m9);
        this.f48252c5 = c14329q6.f48252c5;
        this.f48256jd = c14329q6.f48256jd;
        boolean z = background.getType() != -1;
        if (z) {
            colorFormat = (ColorFormat) background.getStyleColor();
            this.f48259to.m67936kk((FillFormat) background.getFillFormat());
        } else {
            colorFormat = null;
        }
        if (background.getType() != 1) {
            if (background.getType() == 0) {
                c14754wx = this.f48258m9;
                effectFormat = new EffectFormat(background);
            }
            if (z) {
                if (background.getType() != -1) {
                    this.f48257kk = background.getType();
                }
                if ((background.getStyleIndex() & 65535) != 0) {
                    this.f48252c5 = background.getStyleIndex();
                }
                this.f48256jd = background.m338to().m4210to();
            }
            this.f48254dy.m73527k4(c14329q6.f48254dy, colorFormat);
        }
        c14754wx = this.f48258m9;
        effectFormat = (EffectFormat) background.getEffectFormat();
        c14754wx.m72951x1(effectFormat);
        if (z) {
        }
        this.f48254dy.m73527k4(c14329q6.f48254dy, colorFormat);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(C14329q6 c14329q6) {
        if (c14329q6 != null && m69426h4() == c14329q6.m69426h4()) {
            return getFillFormat().equals(c14329q6.getFillFormat());
        }
        return false;
    }
}
