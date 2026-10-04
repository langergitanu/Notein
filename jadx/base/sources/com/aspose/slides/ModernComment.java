package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14084qq;

/* JADX INFO: loaded from: classes3.dex */
public final class ModernComment extends Comment implements IModernComment, InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private int f2806du;

    /* JADX INFO: renamed from: h4 */
    private byte f2807h4;

    /* JADX INFO: renamed from: k4 */
    private CommentCollection f2808k4;

    /* JADX INFO: renamed from: kk */
    private Shape f2809kk;

    /* JADX INFO: renamed from: m9 */
    private C14047bz f2810m9;

    /* JADX INFO: renamed from: to */
    private int f2811to;

    /* JADX INFO: renamed from: x1 */
    private qsu f2812x1;

    public ModernComment(CommentCollection commentCollection, CommentAuthor commentAuthor, String str, Slide slide, Shape shape, C12025x6 c12025x6, C14084qq c14084qq) {
        super(commentCollection, commentAuthor, str, slide, c12025x6.Clone(), c14084qq.Clone());
        this.f2812x1 = new qsu();
        this.f2810m9 = new C14047bz();
        this.f2809kk = shape;
        m2010k4(C14047bz.m66536x1().Clone());
    }

    /* JADX INFO: renamed from: du */
    public final C14047bz m2008du() {
        return this.f2810m9;
    }

    @Override // com.aspose.slides.Comment, com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2808k4;
    }

    @Override // com.aspose.slides.IModernComment
    public final IShape getShape() {
        return this.f2809kk;
    }

    @Override // com.aspose.slides.IModernComment
    public final byte getStatus() {
        return this.f2807h4;
    }

    @Override // com.aspose.slides.IModernComment
    public final int getTextSelectionLength() {
        return this.f2806du;
    }

    @Override // com.aspose.slides.IModernComment
    public final int getTextSelectionStart() {
        return this.f2811to;
    }

    /* JADX INFO: renamed from: h4 */
    public final qsu m2009h4() {
        return this.f2812x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2010k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f2810m9);
    }

    @Override // com.aspose.slides.IModernComment
    public final void setStatus(byte b) {
        this.f2807h4 = b;
    }

    @Override // com.aspose.slides.IModernComment
    public final void setTextSelectionLength(int i) {
        this.f2806du = i;
    }

    @Override // com.aspose.slides.IModernComment
    public final void setTextSelectionStart(int i) {
        this.f2811to = i;
    }
}
