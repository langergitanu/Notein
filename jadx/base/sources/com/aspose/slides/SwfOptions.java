package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p258lv.C6244ks;

/* JADX INFO: loaded from: classes3.dex */
public class SwfOptions extends SaveOptions implements ISwfOptions {

    /* JADX INFO: renamed from: x1 */
    private boolean f3487x1;

    /* JADX INFO: renamed from: kk */
    private NotesCommentsLayoutingOptions f3486kk = new NotesCommentsLayoutingOptions();

    /* JADX INFO: renamed from: k4 */
    private final C6244ks f3485k4 = new C6244ks();

    @Override // com.aspose.slides.ISwfOptions
    public final boolean getCompressed() {
        return this.f3485k4.m25322k4();
    }

    @Override // com.aspose.slides.ISwfOptions
    public final boolean getEnableContextMenu() {
        return this.f3485k4.m25325ks();
    }

    @Override // com.aspose.slides.ISwfOptions
    public final int getJpegQuality() {
        return this.f3485k4.m25303bv();
    }

    @Override // com.aspose.slides.ISwfOptions
    public final byte[] getLogoImageBytes() {
        return this.f3485k4.m25328ne();
    }

    @Override // com.aspose.slides.ISwfOptions
    public final String getLogoLink() {
        return this.f3485k4.m25315ix();
    }

    @Override // com.aspose.slides.ISwfOptions
    public final INotesCommentsLayoutingOptions getNotesCommentsLayouting() {
        return this.f3486kk;
    }

    @Override // com.aspose.slides.ISwfOptions
    public final boolean getShowBottomPane() {
        return this.f3485k4.m25307ck();
    }

    @Override // com.aspose.slides.ISwfOptions
    public final boolean getShowFullScreen() {
        return this.f3485k4.m25327m9();
    }

    @Override // com.aspose.slides.ISwfOptions
    public final boolean getShowHiddenSlides() {
        return this.f3487x1;
    }

    @Override // com.aspose.slides.ISwfOptions
    public final boolean getShowLeftPane() {
        return this.f3485k4.m25312fa();
    }

    @Override // com.aspose.slides.ISwfOptions
    public final boolean getShowPageBorder() {
        return this.f3485k4.m25314h4();
    }

    @Override // com.aspose.slides.ISwfOptions
    public final boolean getShowPageStepper() {
        return this.f3485k4.m25311dy();
    }

    @Override // com.aspose.slides.ISwfOptions
    public final boolean getShowSearch() {
        return this.f3485k4.m25305c5();
    }

    @Override // com.aspose.slides.ISwfOptions
    public final boolean getShowTopPane() {
        return this.f3485k4.m25317jd();
    }

    @Override // com.aspose.slides.ISwfOptions
    public final boolean getStartOpenLeftPane() {
        return this.f3485k4.m25335up();
    }

    @Override // com.aspose.slides.ISwfOptions
    public final boolean getViewerIncluded() {
        return this.f3485k4.m25340x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final C6244ks m2859k4() {
        return this.f3485k4;
    }

    @Override // com.aspose.slides.ISwfOptions
    public final void setCompressed(boolean z) {
        this.f3485k4.m25320k4(z);
    }

    @Override // com.aspose.slides.ISwfOptions
    public final void setEnableContextMenu(boolean z) {
        this.f3485k4.m25306ck(z);
    }

    @Override // com.aspose.slides.ISwfOptions
    public final void setJpegQuality(int i) {
        if (i < 0 || i > 100) {
            throw new ArgumentException("value");
        }
        this.f3485k4.m25338x1(i);
    }

    @Override // com.aspose.slides.ISwfOptions
    public final void setLogoImageBytes(byte[] bArr) {
        this.f3485k4.m25321k4(bArr);
    }

    @Override // com.aspose.slides.ISwfOptions
    public final void setLogoLink(String str) {
        this.f3485k4.m25319k4(str);
    }

    @Override // com.aspose.slides.ISwfOptions
    public final void setShowBottomPane(boolean z) {
        this.f3485k4.m25310dy(z);
    }

    @Override // com.aspose.slides.ISwfOptions
    public final void setShowFullScreen(boolean z) {
        this.f3485k4.m25332to(z);
    }

    @Override // com.aspose.slides.ISwfOptions
    public final void setShowHiddenSlides(boolean z) {
        this.f3487x1 = z;
    }

    @Override // com.aspose.slides.ISwfOptions
    public final void setShowLeftPane(boolean z) {
        this.f3485k4.m25304c5(z);
    }

    @Override // com.aspose.slides.ISwfOptions
    public final void setShowPageBorder(boolean z) {
        this.f3485k4.m25324kk(z);
    }

    @Override // com.aspose.slides.ISwfOptions
    public final void setShowPageStepper(boolean z) {
        this.f3485k4.m25309du(z);
    }

    @Override // com.aspose.slides.ISwfOptions
    public final void setShowSearch(boolean z) {
        this.f3485k4.m25313h4(z);
    }

    @Override // com.aspose.slides.ISwfOptions
    public final void setShowTopPane(boolean z) {
        this.f3485k4.m25326m9(z);
    }

    @Override // com.aspose.slides.ISwfOptions
    public final void setStartOpenLeftPane(boolean z) {
        this.f3485k4.m25316jd(z);
    }

    @Override // com.aspose.slides.ISwfOptions
    public final void setViewerIncluded(boolean z) {
        this.f3485k4.m25339x1(z);
    }
}
