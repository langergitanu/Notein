package com.aspose.slides.internal.p258lv;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p085dk.C3175k4;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C6259x6 {

    /* JADX INFO: renamed from: du */
    private C6259x6 f17754du;

    /* JADX INFO: renamed from: k4 */
    private List<C6259x6> f17755k4 = new List<>();

    /* JADX INFO: renamed from: kk */
    private String f17756kk;

    /* JADX INFO: renamed from: to */
    private String f17757to;

    /* JADX INFO: renamed from: x1 */
    private int f17758x1;

    public C6259x6(int i, String str, String str2) {
        this.f17758x1 = i;
        this.f17756kk = str;
        this.f17757to = str2;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m25408k4() {
        return this.f17758x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C6259x6 m25411x1() {
        return this.f17754du;
    }

    /* JADX INFO: renamed from: x1 */
    private void m25407x1(C3175k4 c3175k4) {
        c3175k4.m13593x1("outline");
        c3175k4.m13590kk(NoteMeta.PROPERTY_TITLE, this.f17756kk);
        c3175k4.m13590kk("url", this.f17757to);
        m25409k4(c3175k4);
        c3175k4.m13588kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25409k4(C3175k4 c3175k4) {
        for (int i = 0; i < this.f17755k4.size(); i++) {
            this.f17755k4.get_Item(i).m25407x1(c3175k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25410k4(C6259x6 c6259x6) {
        c6259x6.m25412x1(this);
        this.f17755k4.addItem(c6259x6);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25412x1(C6259x6 c6259x6) {
        this.f17754du = c6259x6;
    }
}
