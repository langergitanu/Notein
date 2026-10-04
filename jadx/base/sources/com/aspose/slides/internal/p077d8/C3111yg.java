package com.aspose.slides.internal.p077d8;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.yg */
/* JADX INFO: loaded from: classes3.dex */
public class C3111yg {

    /* JADX INFO: renamed from: k4 */
    private final byte[] f9240k4;

    /* JADX INFO: renamed from: kk */
    private String f9241kk;

    /* JADX INFO: renamed from: to */
    private boolean f9242to;

    /* JADX INFO: renamed from: x1 */
    private String f9243x1;

    public C3111yg(byte[] bArr) {
        this.f9240k4 = bArr;
        String[] strArr = {this.f9243x1};
        String[] strArr2 = {this.f9241kk};
        boolean zM13261k4 = m13261k4(strArr, strArr2);
        String str = strArr[0];
        this.f9243x1 = str;
        String str2 = strArr2[0];
        this.f9241kk = str2;
        if (zM13261k4) {
            this.f9242to = true;
            return;
        }
        strArr[0] = str;
        strArr2[0] = str2;
        boolean zM13262x1 = m13262x1(strArr, strArr2);
        this.f9243x1 = strArr[0];
        this.f9241kk = strArr2[0];
        if (zM13262x1) {
            this.f9242to = true;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m13263k4() {
        return this.f9242to;
    }

    /* JADX INFO: renamed from: kk */
    public final String m13264kk() {
        return this.f9241kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m13265x1() {
        return this.f9243x1;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m13261k4(String[] strArr, String[] strArr2) {
        strArr[0] = null;
        strArr2[0] = null;
        C3113yn c3113yn = new C3113yn(this.f9240k4);
        if (!c3113yn.m13277k4()) {
            return false;
        }
        strArr[0] = c3113yn.m13279x1();
        strArr2[0] = c3113yn.m13278kk();
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m13262x1(String[] strArr, String[] strArr2) {
        strArr[0] = null;
        strArr2[0] = null;
        C3090u1 c3090u1 = new C3090u1(this.f9240k4);
        if (!c3090u1.m13130k4()) {
            return false;
        }
        strArr[0] = c3090u1.m13132x1();
        strArr2[0] = c3090u1.m13131kk();
        return true;
    }
}
