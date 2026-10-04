package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class CommentAuthorCollection extends DomObject<Presentation> implements ICommentAuthorCollection {

    /* JADX INFO: renamed from: k4 */
    List<ICommentAuthor> f2024k4;

    /* JADX INFO: renamed from: kk */
    private long f2025kk;

    /* JADX INFO: renamed from: x1 */
    CommentAuthor f2026x1;

    public CommentAuthorCollection(Presentation presentation) {
        super(presentation);
        this.f2024k4 = new List<>();
    }

    /* JADX INFO: renamed from: kk */
    private CommentAuthor m1176kk() {
        CommentAuthorCollection commentAuthorCollection;
        if (this.f2026x1 == null) {
            commentAuthorCollection = this;
            commentAuthorCollection.f2026x1 = new CommentAuthor(commentAuthorCollection, 0L, "Unknown User", "");
        } else {
            commentAuthorCollection = this;
        }
        return commentAuthorCollection.f2026x1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(4:62|26|(2:28|80)(1:79)|31)|23|24|60) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b1, code lost:
    
        r14 = r0;
     */
    @Override // com.aspose.slides.ICommentAuthorCollection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ICommentAuthor addAuthor(String str, String str2) throws Throwable {
        Throwable th;
        Throwable th2;
        synchronized (this.f2024k4.getSyncRoot()) {
            try {
                try {
                    List.Enumerator<ICommentAuthor> it = this.f2024k4.iterator();
                    while (it.hasNext()) {
                        try {
                            try {
                                CommentAuthor commentAuthor = (CommentAuthor) it.next();
                                if (C14113y2.m67363du(commentAuthor.getName(), str) && C14113y2.m67363du(commentAuthor.getInitials(), str2)) {
                                    throw new PptxEditException(C14113y2.m67402k4("The author with name '{0}' and initials '{1}' already added", str, str2));
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    throw th2;
                                }
                                it.dispose();
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        try {
                            it.dispose();
                        } catch (Throwable th5) {
                            th = th5;
                            throw th;
                        }
                    }
                    List.Enumerator<ICommentAuthor> it2 = this.f2024k4.iterator();
                    while (it2.hasNext()) {
                        try {
                            CommentAuthor commentAuthor2 = (CommentAuthor) it2.next();
                            long jM1174to = commentAuthor2.m1174to() & 4294967295L;
                            long jM1174to2 = this.f2025kk;
                            if (jM1174to >= (jM1174to2 & 4294967295L)) {
                                jM1174to2 = ((commentAuthor2.m1174to() & 4294967295L) + 1) & 4294967295L;
                            }
                            this.f2025kk = jM1174to2;
                        } catch (Throwable th6) {
                            Throwable th7 = th6;
                            if (!C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                throw th7;
                            }
                            it2.dispose();
                            throw th7;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    long j = this.f2025kk;
                    this.f2025kk = 1 + j;
                    CommentAuthor commentAuthor3 = new CommentAuthor(this, j, str, str2);
                    this.f2024k4.addItem(commentAuthor3);
                    return commentAuthor3;
                } catch (Throwable th8) {
                    th = th8;
                    th = th;
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                th = th;
                throw th;
            }
        }
    }

    @Override // com.aspose.slides.ICommentAuthorCollection
    public final void clear() {
        for (ICommentAuthor iCommentAuthor : toArray()) {
            iCommentAuthor.remove();
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f2024k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.ICommentAuthorCollection
    public final ICommentAuthor[] findByName(String str) {
        List list = new List();
        List.Enumerator<ICommentAuthor> it = this.f2024k4.iterator();
        while (it.hasNext()) {
            try {
                ICommentAuthor next = it.next();
                if (C14113y2.m67363du(next.getName(), str)) {
                    list.addItem(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return (ICommentAuthor[]) list.toArray(new ICommentAuthor[0]);
    }

    @Override // com.aspose.slides.ICommentAuthorCollection
    public final ICommentAuthor[] findByNameAndInitials(String str, String str2) {
        List list = new List();
        List.Enumerator<ICommentAuthor> it = this.f2024k4.iterator();
        while (it.hasNext()) {
            try {
                ICommentAuthor next = it.next();
                if (C14113y2.m67363du(next.getName(), str) && C14113y2.m67363du(next.getInitials(), str2)) {
                    list.addItem(next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return (ICommentAuthor[]) list.toArray(new ICommentAuthor[0]);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.ICommentAuthorCollection
    public final ICommentAuthor get_Item(int i) {
        return this.f2024k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ICommentAuthor> iterator() {
        return this.f2024k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<ICommentAuthor> iteratorJava() {
        return this.f2024k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m1177k4() {
        return this.f2024k4.size() - m1181x1();
    }

    @Override // com.aspose.slides.ICommentAuthorCollection
    public final void remove(ICommentAuthor iCommentAuthor) {
        if (iCommentAuthor == null) {
            throw new ArgumentNullException();
        }
        iCommentAuthor.remove();
    }

    @Override // com.aspose.slides.ICommentAuthorCollection
    public final void removeAt(int i) {
        get_Item(i).remove();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f2024k4.size();
    }

    @Override // com.aspose.slides.ICommentAuthorCollection
    public final ICommentAuthor[] toArray() {
        return this.f2024k4.toArray(new ICommentAuthor[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m1181x1() {
        List.Enumerator<ICommentAuthor> it = this.f2024k4.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                if (((CommentAuthor) it.next()).m1171k4() > 0) {
                    i++;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public final CommentAuthor m1178k4(int i) {
        List.Enumerator<ICommentAuthor> it = this.f2024k4.iterator();
        while (it.hasNext()) {
            try {
                CommentAuthor commentAuthor = (CommentAuthor) it.next();
                if ((commentAuthor.m1174to() & 4294967295L) == i) {
                    return commentAuthor;
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

    /* JADX INFO: renamed from: k4 */
    public final CommentAuthor m1179k4(C14047bz c14047bz) {
        List.Enumerator<ICommentAuthor> it = this.f2024k4.iterator();
        while (it.hasNext()) {
            try {
                CommentAuthor commentAuthor = (CommentAuthor) it.next();
                if (C14047bz.m66535k4(commentAuthor.m1173kk().m73863k4(), c14047bz)) {
                    return commentAuthor;
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
        return m1176kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m1180k4(ICommentAuthor iCommentAuthor) {
        return this.f2024k4.removeItem(iCommentAuthor);
    }
}
