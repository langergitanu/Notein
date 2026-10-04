package com.aspose.slides.internal.p229ki;

import com.aspose.slides.Collections.ArrayList;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.kk */
/* JADX INFO: loaded from: classes.dex */
public class C5711kk extends AbstractC5746v4 {

    /* JADX INFO: renamed from: k4 */
    public static int[] f15747k4 = {0, 0, 0, 3, 1, 1, 1, 1, 2, 0, 2, 2, 2, 1, 2, 2, 1, 1, 1, 0, 1, 1, 2, 0, 0, 0, 0, 5};

    /* JADX INFO: renamed from: du */
    private String f15748du;

    /* JADX INFO: renamed from: kk */
    private ArrayList f15749kk;

    /* JADX INFO: renamed from: to */
    private String f15750to;

    /* JADX INFO: renamed from: x1 */
    private int f15751x1;

    public C5711kk(int i, ArrayList arrayList) {
        this.f15750to = null;
        this.f15748du = null;
        this.f15751x1 = i;
        this.f15749kk = new ArrayList(arrayList);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5746v4
    public int ad_() {
        return 4;
    }

    /* JADX INFO: renamed from: du */
    public final String m23295du() {
        return this.f15748du;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m23296h4() {
        return this.f15750to;
    }

    /* JADX INFO: renamed from: kk */
    public final int m23297kk() {
        return this.f15751x1;
    }

    /* JADX INFO: renamed from: to */
    public final ArrayList m23298to() {
        return this.f15749kk;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5746v4
    /* JADX INFO: renamed from: x1 */
    public int mo23217x1() {
        return f15747k4[this.f15751x1];
    }

    public C5711kk(int i, AbstractC5746v4 abstractC5746v4) {
        this.f15750to = null;
        this.f15748du = null;
        this.f15751x1 = i;
        ArrayList arrayList = new ArrayList();
        this.f15749kk = arrayList;
        arrayList.addItem(abstractC5746v4);
    }

    public C5711kk(String str, String str2, ArrayList arrayList) {
        this.f15751x1 = 27;
        this.f15748du = str;
        this.f15750to = str2;
        this.f15749kk = new ArrayList(arrayList);
    }
}
