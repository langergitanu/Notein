package com.aspose.slides.internal.p532yu;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.du */
/* JADX INFO: loaded from: classes5.dex */
public class C12953du {

    /* JADX INFO: renamed from: k4 */
    public C12902b1 f43537k4;

    /* JADX INFO: renamed from: kk */
    public int f43538kk;

    /* JADX INFO: renamed from: to */
    public boolean f43539to = false;

    /* JADX INFO: renamed from: x1 */
    public int f43540x1;

    public C12953du(C12902b1 c12902b1, int i) {
        this.f43537k4 = c12902b1;
        this.f43538kk = i;
        this.f43540x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12902b1 m60252k4() {
        return this.f43537k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60253k4(int i) {
        this.f43538kk = i;
        this.f43540x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60254k4(int i, C12939d4 c12939d4) {
        int i2 = this.f43538kk;
        if (i != i2 - 1) {
            if (i == i2 && this.f43539to) {
                this.f43539to = false;
                return;
            }
            return;
        }
        if (this.f43537k4.m23347kk() == c12939d4.m60157k4() && c12939d4.m60159to()) {
            this.f43537k4 = c12939d4.m60157k4();
            this.f43538kk = -1;
            this.f43540x1 = -1;
        } else if (this.f43537k4.m23347kk() != null) {
            this.f43537k4 = (C12902b1) this.f43537k4.m23347kk();
            this.f43538kk--;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m60255k4(String str, String str2, int i, C12939d4 c12939d4) {
        if (C13068kk.m61055k4(this.f43537k4)) {
            return false;
        }
        if (this.f43539to) {
            this.f43539to = false;
        }
        if (!C13009h4.m60660k4(this.f43537k4.m23342du(), this.f43537k4.m23341c5(), str, str2)) {
            return false;
        }
        int i2 = this.f43538kk;
        if (i2 == -1) {
            m60253k4(i);
        } else if (i > i2) {
            return false;
        }
        if (this.f43537k4 == c12939d4.m60160x1()) {
            this.f43539to = true;
            return true;
        }
        C12902b1 c12902b1 = (C12902b1) this.f43537k4.m60055k4();
        if (C13068kk.m61055k4(c12902b1)) {
            this.f43539to = true;
            return false;
        }
        this.f43537k4 = c12902b1;
        this.f43538kk++;
        return false;
    }
}
