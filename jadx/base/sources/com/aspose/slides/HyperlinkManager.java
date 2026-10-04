package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class HyperlinkManager implements IHyperlinkManager, InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    private IHyperlinkContainer f2477k4;

    public HyperlinkManager(IHyperlinkContainer iHyperlinkContainer) {
        this.f2477k4 = iHyperlinkContainer;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return (InterfaceC14397rj) this.f2477k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final IHyperlinkContainer m1704k4() {
        return this.f2477k4;
    }

    @Override // com.aspose.slides.IHyperlinkManager
    public final void removeHyperlinkClick() {
        m1704k4().setHyperlinkClick(null);
    }

    @Override // com.aspose.slides.IHyperlinkManager
    public final void removeHyperlinkMouseOver() {
        m1704k4().setHyperlinkMouseOver(null);
    }

    @Override // com.aspose.slides.IHyperlinkManager
    public final IHyperlink setExternalHyperlinkClick(String str) {
        Hyperlink hyperlink = new Hyperlink(str);
        m1704k4().setHyperlinkClick(hyperlink);
        IParagraph[] iParagraphArr = {null};
        boolean zM63959k4 = kke.m63959k4(IParagraph.class, (InterfaceC14397rj) this.f2477k4, iParagraphArr);
        IParagraph iParagraph = iParagraphArr[0];
        if (zM63959k4) {
            ((Paragraph) iParagraph).m2156dy();
        }
        return hyperlink;
    }

    @Override // com.aspose.slides.IHyperlinkManager
    public final IHyperlink setExternalHyperlinkMouseOver(String str) {
        Hyperlink hyperlink = new Hyperlink(str);
        m1704k4().setHyperlinkMouseOver(hyperlink);
        return hyperlink;
    }

    @Override // com.aspose.slides.IHyperlinkManager
    public final IHyperlink setInternalHyperlinkClick(ISlide iSlide) {
        Hyperlink hyperlink = new Hyperlink(iSlide);
        m1704k4().setHyperlinkClick(hyperlink);
        return hyperlink;
    }

    @Override // com.aspose.slides.IHyperlinkManager
    public final IHyperlink setInternalHyperlinkMouseOver(ISlide iSlide) {
        Hyperlink hyperlink = new Hyperlink(iSlide);
        m1704k4().setHyperlinkMouseOver(hyperlink);
        return hyperlink;
    }

    @Override // com.aspose.slides.IHyperlinkManager
    public final IHyperlink setMacroHyperlinkClick(String str) {
        String strM67402k4 = C14113y2.m67402k4("{0}{1}", "ppaction://macro?name=", str);
        Hyperlink hyperlink = new Hyperlink(strM67402k4);
        hyperlink.m1695k4(strM67402k4);
        m1704k4().setHyperlinkClick(hyperlink);
        return hyperlink;
    }
}
