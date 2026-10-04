package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ChartPortionFormat extends BasePortionFormat implements IChartPortionFormat {

    /* JADX INFO: renamed from: k4 */
    private IChartComponent f1455k4;

    /* JADX INFO: renamed from: x1 */
    private C14911zr f1456x1;

    public ChartPortionFormat(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        IChartComponent[] iChartComponentArr = {this.f1455k4};
        kke.m63959k4(IChartComponent.class, interfaceC14397rj, iChartComponentArr);
        this.f1455k4 = iChartComponentArr[0];
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new C14633uh(getParent_Immediate(), m366to(), m356du(), m357dy(), m354c5(), m359h4(), m365m9(), m367up());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    @Override // com.aspose.slides.BasePortionFormat, com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long getVersion() {
        TextFrame textFrame;
        ITextFrame textFrameForOverriding;
        long version;
        long jM74431ak = m2138ix() ? mo368x1().m74431ak() : 1L;
        if (C7019kk.m27469x1(m716rv(), ChartTitle.class)) {
            textFrameForOverriding = ((ChartTitle) C7019kk.m27452k4((Object) m716rv(), ChartTitle.class)).getTextFrameForOverriding();
        } else if (C7019kk.m27469x1(m716rv(), Trendline.class)) {
            textFrameForOverriding = ((Trendline) C7019kk.m27452k4((Object) m716rv(), Trendline.class)).getTextFrameForOverriding();
        } else {
            if (!C7019kk.m27469x1(m716rv(), DataLabelFormat.class) || !C7019kk.m27469x1(((DataLabelFormat) m716rv()).getParent_Immediate(), DataLabel.class)) {
                textFrame = null;
                if (textFrame != null || textFrame.getParagraphs().getCount() <= 0) {
                    version = 0;
                } else {
                    version = ((PortionFormat) textFrame.getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat()).getVersion();
                    if (textFrame.getParagraphs().get_Item(0).getPortions().getCount() > 0) {
                        version = ((version & 4294967295L) + (((PortionFormat) textFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat()).getVersion() & 4294967295L)) & 4294967295L;
                    }
                }
                return ((jM74431ak & 4294967295L) + (version & 4294967295L)) & 4294967295L;
            }
            textFrameForOverriding = ((DataLabel) C7019kk.m27452k4((Object) ((DataLabelFormat) m716rv()).getParent_Immediate(), DataLabel.class)).getTextFrameForOverriding();
        }
        textFrame = (TextFrame) textFrameForOverriding;
        if (textFrame != null) {
            version = 0;
        }
        return ((jM74431ak & 4294967295L) + (version & 4294967295L)) & 4294967295L;
    }

    @Override // com.aspose.slides.BasePortionFormat
    /* JADX INFO: renamed from: ks, reason: merged with bridge method [inline-methods] */
    public final C14633uh mo368x1() {
        return (C14633uh) m2144u4();
    }

    /* JADX INFO: renamed from: ne */
    public final boolean m715ne() {
        if (m2138ix()) {
            return mo368x1().m74437c6();
        }
        return true;
    }

    /* JADX INFO: renamed from: rv */
    public final IChartComponent m716rv() {
        return this.f1455k4;
    }

    /* JADX INFO: renamed from: x6 */
    public final C14911zr m717x6() {
        if (this.f1456x1 == null) {
            C14911zr c14911zrM74776to = C14911zr.m74776to(this);
            if (c14911zrM74776to != null) {
                return c14911zrM74776to;
            }
            this.f1456x1 = new C14911zr(this);
        }
        this.f1456x1.m4604k4(C14911zr.class);
        return this.f1456x1;
    }
}
