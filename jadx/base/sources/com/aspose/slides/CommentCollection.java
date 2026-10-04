package com.aspose.slides;

import android.graphics.PointF;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14074ks;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18293o1;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class CommentCollection extends DomObject<CommentAuthor> implements ICommentCollection {

    /* JADX INFO: renamed from: k4 */
    private final List<IComment> f2027k4;

    public CommentCollection(CommentAuthor commentAuthor) {
        super(commentAuthor);
        this.f2027k4 = new List<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static int m1185x1(IComment iComment, IComment iComment2) {
        return C14084qq.m67076du(((Comment) iComment).m1163k4().Clone(), ((Comment) iComment2).m1163k4().Clone());
    }

    @Override // com.aspose.slides.ICommentCollection
    public final IComment addComment(String str, ISlide iSlide, PointF pointF, Date date) {
        return m1187k4(str, iSlide, C12025x6.m56882k4(pointF), C14084qq.m67093k4(date));
    }

    @Override // com.aspose.slides.ICommentCollection
    public final IModernComment addModernComment(String str, ISlide iSlide, IShape iShape, PointF pointF, Date date) {
        return m1189k4(str, iSlide, iShape, C12025x6.m56882k4(pointF), C14084qq.m67093k4(date));
    }

    @Override // com.aspose.slides.ICommentCollection
    public final void clear() {
        for (int size = this.f2027k4.size() - 1; size >= 0; size--) {
            this.f2027k4.get_Item(size).remove();
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f2027k4.copyTo(abstractC14092to, i);
    }

    public final IComment findCommentByIdx(int i) {
        List.Enumerator<IComment> it = this.f2027k4.iterator();
        while (it.hasNext()) {
            try {
                Comment comment = (Comment) it.next();
                if ((comment.m1168to().m7379k4() & 4294967295L) == i) {
                    return comment;
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

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.ICommentCollection
    public final IComment get_Item(int i) {
        return this.f2027k4.get_Item(i);
    }

    @Override // com.aspose.slides.ICommentCollection
    public final IComment insertComment(int i, String str, ISlide iSlide, PointF pointF, Date date) {
        return m1186k4(i, str, iSlide, C12025x6.m56882k4(pointF), C14084qq.m67093k4(date));
    }

    @Override // com.aspose.slides.ICommentCollection
    public final IModernComment insertModernComment(int i, String str, ISlide iSlide, IShape iShape, PointF pointF, Date date) {
        return m1188k4(i, str, iSlide, iShape, C12025x6.m56882k4(pointF), C14084qq.m67093k4(date));
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IComment> iterator() {
        return this.f2027k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IComment> iteratorJava() {
        return this.f2027k4.iteratorJava();
    }

    @Override // com.aspose.slides.ICommentCollection
    public final void remove(IComment iComment) {
        if (iComment == null) {
            throw new ArgumentNullException();
        }
        iComment.remove();
    }

    @Override // com.aspose.slides.ICommentCollection
    public final void removeAt(int i) {
        this.f2027k4.get_Item(i).remove();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f2027k4.size();
    }

    @Override // com.aspose.slides.ICommentCollection
    public final IComment[] toArray() {
        return this.f2027k4.toArray(new IComment[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private Comment m1183k4(String str, Slide slide, C12025x6 c12025x6, C14084qq c14084qq) {
        if (slide == null) {
            throw new ArgumentNullException("slide", "slide can't be null.");
        }
        if (slide.getPresentation() != m1190k4()) {
            throw new PptxEditException("Can't add comment to a slide from another presentation.");
        }
        Comment comment = new Comment(this, (CommentAuthor) this.f2127h4, str, slide, c12025x6.Clone(), c14084qq.Clone());
        slide.m2696k4((IComment) comment);
        return comment;
    }

    @Override // com.aspose.slides.ICommentCollection
    public final IComment[] toArray(int i, int i2) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("startIndex");
        }
        if (i2 < 0 || i + i2 > size()) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        Comment[] commentArr = new Comment[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            commentArr[i3] = (Comment) this.f2027k4.get_Item(i3 + i);
        }
        return commentArr;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1192x1() {
        this.f2027k4.sort(new AbstractC14074ks<IComment>() { // from class: com.aspose.slides.CommentCollection.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.CommentCollection.CompareByCreatedTime(Aspose.Slides.IComment,Aspose.Slides.IComment)";
            }

            @Override // com.aspose.slides.p559ms.System.AbstractC14074ks
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public int mo1193k4(IComment iComment, IComment iComment2) {
                return CommentCollection.m1185x1(iComment, iComment2);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public IComment m1186k4(int i, String str, ISlide iSlide, C12025x6 c12025x6, C14084qq c14084qq) {
        Comment commentM1183k4 = m1183k4(str, (Slide) iSlide, c12025x6.Clone(), c14084qq.Clone());
        this.f2027k4.insertItem(i, commentM1183k4);
        return commentM1183k4;
    }

    /* JADX INFO: renamed from: k4 */
    public IComment m1187k4(String str, ISlide iSlide, C12025x6 c12025x6, C14084qq c14084qq) {
        Comment commentM1183k4 = m1183k4(str, (Slide) iSlide, c12025x6.Clone(), c14084qq.Clone());
        this.f2027k4.addItem(commentM1183k4);
        return commentM1183k4;
    }

    /* JADX INFO: renamed from: k4 */
    public IModernComment m1188k4(int i, String str, ISlide iSlide, IShape iShape, C12025x6 c12025x6, C14084qq c14084qq) {
        ModernComment modernCommentM1184k4 = m1184k4(str, (Slide) iSlide, (Shape) iShape, c12025x6.Clone(), c14084qq.Clone());
        this.f2027k4.insertItem(i, modernCommentM1184k4);
        return modernCommentM1184k4;
    }

    /* JADX INFO: renamed from: k4 */
    public IModernComment m1189k4(String str, ISlide iSlide, IShape iShape, C12025x6 c12025x6, C14084qq c14084qq) {
        ModernComment modernCommentM1184k4 = m1184k4(str, (Slide) iSlide, (Shape) iShape, c12025x6.Clone(), c14084qq.Clone());
        this.f2027k4.addItem(modernCommentM1184k4);
        return modernCommentM1184k4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private ModernComment m1184k4(String str, Slide slide, Shape shape, C12025x6 c12025x6, C14084qq c14084qq) {
        if (slide == null) {
            throw new ArgumentNullException("slide", "slide can't be null.");
        }
        if (slide.getPresentation() != m1190k4()) {
            throw new PptxEditException("Can't add comment to a slide from another presentation.");
        }
        ModernComment modernComment = new ModernComment(this, (CommentAuthor) this.f2127h4, str, slide, shape, c12025x6.Clone(), c14084qq.Clone());
        slide.m2696k4((IComment) modernComment);
        return modernComment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final Presentation m1190k4() {
        return (Presentation) ((CommentAuthor) this.f2127h4).m1170du().getPresentation();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1191k4(Comment comment) {
        this.f2027k4.removeItem(comment);
    }
}
