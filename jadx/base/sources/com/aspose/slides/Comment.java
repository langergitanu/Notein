package com.aspose.slides;

import android.graphics.PointF;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14084qq;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class Comment implements IComment, InterfaceC14397rj {

    /* JADX INFO: renamed from: c5 */
    private IComment f2008c5;

    /* JADX INFO: renamed from: dy */
    private CommentAuthor f2010dy;

    /* JADX INFO: renamed from: h4 */
    private C12025x6 f2011h4;

    /* JADX INFO: renamed from: k4 */
    private int f2012k4;

    /* JADX INFO: renamed from: m9 */
    private Slide f2014m9;

    /* JADX INFO: renamed from: to */
    private String f2015to;

    /* JADX INFO: renamed from: x1 */
    private CommentCollection f2016x1;

    /* JADX INFO: renamed from: kk */
    private C1235i1 f2013kk = new C1235i1();

    /* JADX INFO: renamed from: du */
    private C14084qq f2009du = new C14084qq();

    public Comment(CommentCollection commentCollection, CommentAuthor commentAuthor, String str, Slide slide, C12025x6 c12025x6, C14084qq c14084qq) {
        C12025x6 c12025x62 = new C12025x6();
        this.f2011h4 = c12025x62;
        this.f2016x1 = commentCollection;
        this.f2010dy = commentAuthor;
        this.f2015to = str;
        this.f2014m9 = slide;
        c12025x6.CloneTo(c12025x62);
        c14084qq.CloneTo(this.f2009du);
        long jM7036kk = (commentAuthor.m1175x1().m7036kk() & 4294967295L) + 1;
        commentAuthor.m1175x1().m7039x1(jM7036kk);
        m1168to().m7380k4(jM7036kk);
    }

    @Override // com.aspose.slides.IComment
    public final ICommentAuthor getAuthor() {
        return this.f2010dy;
    }

    @Override // com.aspose.slides.IComment
    public final Date getCreatedTime() {
        return C14084qq.m67108kk(m1163k4());
    }

    @Override // com.aspose.slides.IComment
    public final IComment getParentComment() {
        return this.f2008c5;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public InterfaceC14397rj getParent_Immediate() {
        return this.f2016x1;
    }

    @Override // com.aspose.slides.IComment
    public final PointF getPosition() {
        return (PointF) C12025x6.m56887x1(m1169x1());
    }

    @Override // com.aspose.slides.IComment
    public final ISlide getSlide() {
        return this.f2014m9;
    }

    @Override // com.aspose.slides.IComment
    public final String getText() {
        return this.f2015to;
    }

    /* JADX INFO: renamed from: k4 */
    public C14084qq m1163k4() {
        return this.f2009du;
    }

    /* JADX INFO: renamed from: kk */
    public final int m1167kk() {
        return this.f2012k4;
    }

    @Override // com.aspose.slides.IComment
    public final void remove() {
        CommentCollection commentCollection = this.f2016x1;
        if (commentCollection == null) {
            throw new PptxEditException("Comment is already removed from collection.");
        }
        synchronized (commentCollection.getSyncRoot()) {
            try {
                IComment[] slideComments = getSlide().getSlideComments(null);
                for (int i = 0; i < slideComments.length; i++) {
                    if (slideComments[i].getParentComment() == this) {
                        slideComments[i].remove();
                    }
                }
                this.f2016x1.m1191k4(this);
                ((Slide) getSlide()).m2718x1(this);
                this.f2016x1 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.aspose.slides.IComment
    public final void setCreatedTime(Date date) {
        m1166k4(C14084qq.m67093k4(date));
    }

    @Override // com.aspose.slides.IComment
    public final void setParentComment(IComment iComment) {
        IComment parentComment = iComment;
        while (parentComment.getParentComment() != null) {
            parentComment = parentComment.getParentComment();
            if (C14067j2.m66729x1(this, parentComment)) {
                throw new PptxEditException("Setting this value leads to a circular reference!");
            }
        }
        this.f2008c5 = iComment;
    }

    @Override // com.aspose.slides.IComment
    public final void setPosition(PointF pointF) {
        m1165k4(C12025x6.m56882k4(pointF));
    }

    @Override // com.aspose.slides.IComment
    public final void setText(String str) {
        this.f2015to = str;
    }

    /* JADX INFO: renamed from: to */
    public final C1235i1 m1168to() {
        return this.f2013kk;
    }

    /* JADX INFO: renamed from: x1 */
    public C12025x6 m1169x1() {
        return this.f2011h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1164k4(int i) {
        this.f2012k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m1165k4(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f2011h4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m1166k4(C14084qq c14084qq) {
        c14084qq.CloneTo(this.f2009du);
    }
}
