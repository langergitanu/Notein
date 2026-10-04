package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.h4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13009h4 {

    /* JADX INFO: renamed from: k4 */
    private ArrayList f43705k4 = new ArrayList();

    /* JADX INFO: renamed from: kk */
    private C13060k4 f43706kk;

    /* JADX INFO: renamed from: x1 */
    private C12939d4 f43707x1;

    public C13009h4(C12939d4 c12939d4, C13060k4 c13060k4) {
        this.f43707x1 = c12939d4;
        this.f43706kk = c13060k4;
        if (c12939d4.m60159to()) {
            return;
        }
        m60662k4(1);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12939d4 m60661k4() {
        return this.f43707x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m60664kk() {
        this.f43705k4.removeAt(m60666x1() - 1);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m60666x1() {
        return this.f43705k4.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60662k4(int i) {
        this.f43705k4.addItem(new C12953du(this.f43707x1.m60157k4(), i));
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m60665kk(String str, String str2, int i) {
        if (!this.f43707x1.m60158kk() || !m60660k4(this.f43707x1.m60160x1().m23342du(), this.f43707x1.m60160x1().m23341c5(), str, str2)) {
            return false;
        }
        if (this.f43707x1.m60160x1().m23347kk() == null) {
            return this.f43707x1.m60159to() || i == 1;
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.f43705k4.size(); i2++) {
            C12953du c12953du = (C12953du) this.f43705k4.get_Item(i2);
            if (c12953du.f43539to && c12953du.m60252k4() == this.f43707x1.m60160x1().m23347kk()) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m60667x1(String str, String str2, int i) {
        if (this.f43707x1.m60159to() && m60660k4(this.f43707x1.m60157k4().m23342du(), this.f43707x1.m60157k4().m23341c5(), str, str2)) {
            m60662k4(-1);
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.f43705k4.size(); i2++) {
            if (((C12953du) this.f43705k4.get_Item(i2)).m60255k4(str, str2, i, this.f43707x1)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m60663k4(String str, String str2, int i) {
        if (this.f43707x1.m60156du()) {
            return;
        }
        for (int i2 = 0; i2 < this.f43705k4.size(); i2++) {
            ((C12953du) this.f43705k4.get_Item(i2)).m60254k4(i, this.f43707x1);
        }
        if (this.f43707x1.m60159to() && m60660k4(this.f43707x1.m60157k4().m23342du(), this.f43707x1.m60157k4().m23341c5(), str, str2)) {
            m60664kk();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m60660k4(String str, String str2, String str3, String str4) {
        if (str2 == null) {
            if (str4 != null && str4.length() != 0) {
                return false;
            }
        } else if (str2.length() != 0 && !C14113y2.m67363du(str2, str4)) {
            return false;
        }
        return str.length() == 0 || C14113y2.m67363du(str, str3);
    }
}
