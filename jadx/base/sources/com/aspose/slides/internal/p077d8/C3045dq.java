package com.aspose.slides.internal.p077d8;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.dq */
/* JADX INFO: loaded from: classes3.dex */
class C3045dq extends RuntimeException {

    /* JADX INFO: renamed from: k4 */
    private String f8950k4;

    /* JADX INFO: renamed from: kk */
    private String[] f8951kk;

    /* JADX INFO: renamed from: x1 */
    private int f8952x1;

    public C3045dq() {
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f8950k4;
    }

    /* JADX INFO: renamed from: k4 */
    public int m12839k4() {
        return this.f8952x1;
    }

    public C3045dq(int i, String str) {
        super(str);
        this.f8950k4 = str;
        this.f8952x1 = i;
    }

    public C3045dq(int i, String[] strArr) {
        this.f8952x1 = i;
        this.f8951kk = strArr;
    }

    public C3045dq(int i, String[] strArr, String str, Throwable th) {
        super(str, th);
        this.f8950k4 = str;
        this.f8952x1 = i;
        this.f8951kk = strArr;
    }
}
