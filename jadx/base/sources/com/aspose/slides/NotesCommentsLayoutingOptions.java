package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: loaded from: classes3.dex */
public class NotesCommentsLayoutingOptions implements INotesCommentsLayoutingOptions {

    /* JADX INFO: renamed from: du */
    private boolean f2840du;

    /* JADX INFO: renamed from: to */
    private C12003du f2843to = new C12003du();

    /* JADX INFO: renamed from: k4 */
    private int f2841k4 = 0;

    /* JADX INFO: renamed from: x1 */
    private int f2844x1 = 0;

    /* JADX INFO: renamed from: kk */
    private int f2842kk = 150;

    public NotesCommentsLayoutingOptions() {
        C12003du.m56495z7().CloneTo(this.f2843to);
        this.f2840du = false;
    }

    @Override // com.aspose.slides.INotesCommentsLayoutingOptions
    public final Integer getCommentsAreaColor() {
        return (Integer) C12003du.m56473x1(m2026k4());
    }

    @Override // com.aspose.slides.INotesCommentsLayoutingOptions
    public final int getCommentsAreaWidth() {
        return this.f2842kk;
    }

    @Override // com.aspose.slides.INotesCommentsLayoutingOptions
    public final int getCommentsPosition() {
        return this.f2844x1;
    }

    @Override // com.aspose.slides.INotesCommentsLayoutingOptions
    public final int getNotesPosition() {
        return this.f2841k4;
    }

    @Override // com.aspose.slides.INotesCommentsLayoutingOptions
    public final boolean getShowCommentsByNoAuthor() {
        return this.f2840du;
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m2026k4() {
        return this.f2843to;
    }

    @Override // com.aspose.slides.INotesCommentsLayoutingOptions
    public final void setCommentsAreaColor(Integer num) {
        m2028k4(C12003du.m56401k4(num));
    }

    @Override // com.aspose.slides.INotesCommentsLayoutingOptions
    public final void setCommentsAreaWidth(int i) {
        this.f2842kk = i;
        if (i < 150) {
            this.f2842kk = 150;
        }
    }

    @Override // com.aspose.slides.INotesCommentsLayoutingOptions
    public final void setCommentsPosition(int i) {
        this.f2844x1 = i;
    }

    @Override // com.aspose.slides.INotesCommentsLayoutingOptions
    public final void setNotesPosition(int i) {
        this.f2841k4 = i;
    }

    @Override // com.aspose.slides.INotesCommentsLayoutingOptions
    public final void setShowCommentsByNoAuthor(boolean z) {
        this.f2840du = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m2029x1() {
        return (getNotesPosition() == 0 && getCommentsPosition() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2027k4(INotesCommentsLayoutingOptions iNotesCommentsLayoutingOptions) {
        setShowCommentsByNoAuthor(iNotesCommentsLayoutingOptions.getShowCommentsByNoAuthor());
        setNotesPosition(iNotesCommentsLayoutingOptions.getNotesPosition());
        setCommentsPosition(iNotesCommentsLayoutingOptions.getCommentsPosition());
        m2028k4(((NotesCommentsLayoutingOptions) iNotesCommentsLayoutingOptions).m2026k4().Clone());
        setCommentsAreaWidth(iNotesCommentsLayoutingOptions.getCommentsAreaWidth());
    }

    /* JADX INFO: renamed from: k4 */
    public void m2028k4(C12003du c12003du) {
        c12003du.CloneTo(this.f2843to);
    }
}
