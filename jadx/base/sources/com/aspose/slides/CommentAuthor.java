package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class CommentAuthor implements ICommentAuthor, InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private C1186h5 f2017du = new C1186h5();

    /* JADX INFO: renamed from: h4 */
    private C14846yg f2018h4 = new C14846yg();

    /* JADX INFO: renamed from: k4 */
    private CommentAuthorCollection f2019k4;

    /* JADX INFO: renamed from: kk */
    private String f2020kk;

    /* JADX INFO: renamed from: m9 */
    private CommentCollection f2021m9;

    /* JADX INFO: renamed from: to */
    private String f2022to;

    /* JADX INFO: renamed from: x1 */
    private IPresentationComponent f2023x1;

    public CommentAuthor(CommentAuthorCollection commentAuthorCollection, long j, String str, String str2) {
        this.f2019k4 = commentAuthorCollection;
        m1172k4(j);
        this.f2020kk = str;
        this.f2022to = str2;
        this.f2021m9 = new CommentCollection(this);
        this.f2018h4.m73864k4(C14047bz.m66536x1().Clone());
    }

    /* JADX INFO: renamed from: du */
    public final IPresentationComponent m1170du() {
        IPresentationComponent iPresentationComponent = this.f2023x1;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f2019k4, iPresentationComponentArr);
            this.f2023x1 = iPresentationComponentArr[0];
        }
        return this.f2023x1;
    }

    @Override // com.aspose.slides.ICommentAuthor
    public final ICommentCollection getComments() {
        return this.f2021m9;
    }

    @Override // com.aspose.slides.ICommentAuthor
    public final String getInitials() {
        return this.f2022to;
    }

    @Override // com.aspose.slides.ICommentAuthor
    public final String getName() {
        return this.f2020kk;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2019k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m1171k4() {
        IGenericEnumerator<IComment> it = this.f2021m9.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                if (C7019kk.m27469x1(it.next(), IModernComment.class)) {
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

    /* JADX INFO: renamed from: kk */
    public final C14846yg m1173kk() {
        return this.f2018h4;
    }

    @Override // com.aspose.slides.ICommentAuthor
    public final void remove() {
        CommentAuthorCollection commentAuthorCollection = this.f2019k4;
        if (commentAuthorCollection == null) {
            throw new PptxEditException("Author is already removed from collection.");
        }
        synchronized (commentAuthorCollection.getSyncRoot()) {
            this.f2019k4.m1180k4(this);
            this.f2019k4 = null;
        }
    }

    @Override // com.aspose.slides.ICommentAuthor
    public final void setInitials(String str) {
        this.f2022to = str;
    }

    @Override // com.aspose.slides.ICommentAuthor
    public final void setName(String str) {
        this.f2020kk = str;
    }

    /* JADX INFO: renamed from: to */
    public final long m1174to() {
        return m1175x1().m7032k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final C1186h5 m1175x1() {
        return this.f2017du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1172k4(long j) {
        m1175x1().m7034k4(j);
    }
}
