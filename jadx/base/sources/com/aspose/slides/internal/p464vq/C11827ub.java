package com.aspose.slides.internal.p464vq;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p532yu.C13129ny;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.ub */
/* JADX INFO: loaded from: classes4.dex */
public class C11827ub extends AbstractC11714bv {

    /* JADX INFO: renamed from: k4 */
    public static final C11801r5 f39880k4 = new C11801r5("http://schemas.openxmlformats.org/officeDocument/2006/relationships/vmlDrawing");

    /* JADX INFO: renamed from: kk */
    public static final C13129ny f39881kk;

    /* JADX INFO: renamed from: to */
    public static final SortedList<String, String> f39882to;

    /* JADX INFO: renamed from: x1 */
    public static final String[] f39883x1;

    static {
        String[] strArr = {""};
        f39883x1 = strArr;
        f39881kk = AbstractC11739f5.m55334k4(strArr);
        SortedList<String, String> sortedList = new SortedList<>();
        f39882to = sortedList;
        sortedList.addItem("mv", "urn:schemas-microsoft-com:mac:vml");
        sortedList.addItem("x", "urn:schemas-microsoft-com:office:excel");
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11714bv, com.aspose.slides.internal.p464vq.AbstractC11739f5
    /* JADX INFO: renamed from: du */
    public SortedList<String, String> mo55298du() {
        return f39882to;
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11739f5
    /* JADX INFO: renamed from: h4 */
    public boolean mo55335h4() {
        return true;
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11812sq
    /* JADX INFO: renamed from: k4 */
    public String mo55273k4() {
        return "application/vnd.openxmlformats-officedocument.vmlDrawing";
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11739f5
    /* JADX INFO: renamed from: to */
    public C13129ny mo55274to() {
        return f39881kk;
    }

    @Override // com.aspose.slides.internal.p464vq.AbstractC11812sq
    /* JADX INFO: renamed from: x1 */
    public C11801r5 mo55275x1() {
        return f39880k4;
    }
}
