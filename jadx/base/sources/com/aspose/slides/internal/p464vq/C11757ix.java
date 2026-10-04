package com.aspose.slides.internal.p464vq;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p532yu.C13129ny;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.ix */
/* JADX INFO: loaded from: classes4.dex */
public class C11757ix extends AbstractC11842wp {

    /* JADX INFO: renamed from: k4 */
    public static final C11801r5 f39758k4 = new C11801r5("http://schemas.openxmlformats.org/officeDocument/2006/relationships/chart");

    /* JADX INFO: renamed from: kk */
    public static final C13129ny f39759kk;

    /* JADX INFO: renamed from: to */
    private static final SortedList<String, String> f39760to;

    /* JADX INFO: renamed from: x1 */
    public static final String[] f39761x1;

    static {
        String[] strArr = {""};
        f39761x1 = strArr;
        f39759kk = AbstractC11739f5.m55334k4(strArr);
        SortedList<String, String> sortedList = new SortedList<>();
        f39760to = sortedList;
        sortedList.addItem("c14", "http://schemas.microsoft.com/office/drawing/2007/8/2/chart");
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11714bv, com.aspose.slides.internal.p464vq.AbstractC11739f5
    /* JADX INFO: renamed from: du */
    public SortedList<String, String> mo55298du() {
        return f39760to;
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11812sq
    /* JADX INFO: renamed from: k4 */
    public String mo55273k4() {
        return "application/vnd.openxmlformats-officedocument.drawingml.chart+xml";
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11739f5
    /* JADX INFO: renamed from: to */
    public C13129ny mo55274to() {
        return f39759kk;
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11812sq
    /* JADX INFO: renamed from: x1 */
    public C11801r5 mo55275x1() {
        return f39758k4;
    }
}
