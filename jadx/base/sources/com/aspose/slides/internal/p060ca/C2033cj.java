package com.aspose.slides.internal.p060ca;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.cj */
/* JADX INFO: loaded from: classes3.dex */
public class C2033cj {

    /* JADX INFO: renamed from: du */
    String f7045du;

    /* JADX INFO: renamed from: h4 */
    String f7046h4;

    /* JADX INFO: renamed from: k4 */
    int f7047k4;

    /* JADX INFO: renamed from: kk */
    C2038cx f7048kk;

    /* JADX INFO: renamed from: to */
    C2038cx f7049to;

    /* JADX INFO: renamed from: x1 */
    C2299sz[] f7050x1;

    public C2033cj() {
    }

    /* JADX INFO: renamed from: k4 */
    public String mo10137k4() {
        return this.f7045du;
    }

    /* JADX INFO: renamed from: kk */
    public final C2299sz[] m10333kk() {
        return this.f7050x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m10334x1() {
        return this.f7047k4;
    }

    public C2033cj(int i, AbstractC2011be abstractC2011be) {
        this(i, new C2299sz(abstractC2011be));
    }

    public C2033cj(int i, C2299sz c2299sz) {
        this(i, new C2299sz[]{c2299sz});
    }

    public C2033cj(int i, String str, AbstractC2011be abstractC2011be) {
        this(i, new C2299sz(str, abstractC2011be));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2033cj(int i, C2299sz[] c2299szArr) {
        String str = C14113y2.f47374k4;
        this(str, str, i, c2299szArr);
    }

    public C2033cj(C2038cx c2038cx, C2038cx c2038cx2, int i, C2299sz c2299sz) {
        this(c2038cx, c2038cx2, i, new C2299sz[]{c2299sz});
    }

    public C2033cj(C2038cx c2038cx, C2038cx c2038cx2, int i, C2299sz[] c2299szArr) {
        this.f7048kk = c2038cx;
        this.f7049to = c2038cx2;
        this.f7045du = c2038cx.m10344x1();
        this.f7046h4 = c2038cx2.m10344x1();
        this.f7047k4 = i;
        this.f7050x1 = c2299szArr;
    }

    public C2033cj(String str, String str2, int i, C2299sz c2299sz) {
        this(str, str2, i, new C2299sz[]{c2299sz});
    }

    public C2033cj(String str, String str2, int i, C2299sz[] c2299szArr) {
        this.f7048kk = new C2038cx(str);
        this.f7045du = str;
        this.f7049to = new C2038cx(str2);
        this.f7046h4 = str2;
        this.f7047k4 = i;
        this.f7050x1 = c2299szArr;
    }
}
