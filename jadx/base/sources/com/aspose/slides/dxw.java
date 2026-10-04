package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
final class dxw {

    /* JADX INFO: renamed from: du */
    private PortionFormat f4689du;

    /* JADX INFO: renamed from: h4 */
    private ParagraphFormat f4690h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f4691k4;

    /* JADX INFO: renamed from: kk */
    private IFillFormat f4692kk;

    /* JADX INFO: renamed from: m9 */
    private TextFrameFormat f4693m9;

    /* JADX INFO: renamed from: to */
    private IEffectFormat f4694to;

    /* JADX INFO: renamed from: x1 */
    private ILineFormat f4695x1;

    public dxw(ILineFormat iLineFormat, IFillFormat iFillFormat) {
        this(iLineFormat, iFillFormat, null, null, null, null);
    }

    /* JADX INFO: renamed from: du */
    public final ParagraphFormat m5315du() {
        return this.f4690h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final TextFrameFormat m5316h4() {
        return this.f4693m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final ILineFormat m5317k4() {
        return this.f4695x1;
    }

    /* JADX INFO: renamed from: kk */
    public final IEffectFormat m5318kk() {
        return this.f4694to;
    }

    /* JADX INFO: renamed from: to */
    public final PortionFormat m5319to() {
        return this.f4689du;
    }

    /* JADX INFO: renamed from: x1 */
    public final IFillFormat m5320x1() {
        return this.f4692kk;
    }

    public dxw(ILineFormat iLineFormat, IFillFormat iFillFormat, IEffectFormat iEffectFormat) {
        this(iLineFormat, iFillFormat, iEffectFormat, null, null, null);
    }

    public dxw(ILineFormat iLineFormat, IFillFormat iFillFormat, IEffectFormat iEffectFormat, PortionFormat portionFormat, ParagraphFormat paragraphFormat, TextFrameFormat textFrameFormat) {
        this(iLineFormat, iFillFormat, iEffectFormat, portionFormat, paragraphFormat, textFrameFormat, false);
    }

    public dxw(ILineFormat iLineFormat, IFillFormat iFillFormat, IEffectFormat iEffectFormat, PortionFormat portionFormat, ParagraphFormat paragraphFormat, TextFrameFormat textFrameFormat, boolean z) {
        this.f4695x1 = iLineFormat;
        this.f4692kk = iFillFormat;
        this.f4694to = iEffectFormat;
        this.f4689du = portionFormat;
        this.f4690h4 = paragraphFormat;
        this.f4693m9 = textFrameFormat;
        this.f4691k4 = z;
    }

    public dxw(ParagraphFormat paragraphFormat) {
        this(null, null, null, null, paragraphFormat, null);
    }

    public dxw(PortionFormat portionFormat) {
        this(null, null, null, portionFormat, null, null);
    }

    public dxw(TextFrameFormat textFrameFormat) {
        this(null, null, null, null, null, textFrameFormat);
    }
}
