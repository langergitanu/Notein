package com.aspose.slides.internal.p258lv;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p353q7.C9786ss;
import com.aspose.slides.internal.p353q7.C9787sv;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6239h4 {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<Integer, C9786ss> f17665k4;

    /* JADX INFO: renamed from: kk */
    private C9787sv f17666kk;

    /* JADX INFO: renamed from: to */
    private C9790ts f17667to;

    /* JADX INFO: renamed from: x1 */
    private int[] f17668x1;

    public C6239h4(C9790ts c9790ts) {
        this.f17667to = c9790ts;
        this.f17666kk = new C9787sv(c9790ts, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m25263k4(int i) {
        int length = m25266k4().length - 1;
        for (int i2 = 0; i2 < m25266k4().length; i2++) {
            if (m25266k4()[i2] == i) {
                return i2;
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: kk */
    public final short m25267kk() {
        return m25262x1(this.f17667to.m48177ck(), 1024.0f);
    }

    /* JADX INFO: renamed from: to */
    public final short m25269to() {
        return m25267kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final C9786ss m25270x1(int i) {
        return this.f17665k4.get_Item(Integer.valueOf(this.f17666kk.m48151k4(i)));
    }

    /* JADX INFO: renamed from: k4 */
    public final short m25264k4(int i, float f) {
        return m25262x1(this.f17667to.m48221m9().m48107x1(i).m48285kk(), f);
    }

    /* JADX INFO: renamed from: kk */
    public final short m25268kk(int i) {
        return m25262x1(this.f17667to.m48221m9().m48107x1(i).m48285kk(), 1024.0f);
    }

    /* JADX INFO: renamed from: x1 */
    public final short m25271x1() {
        return m25262x1(this.f17667to.m48191jd(), 1024.0f);
    }

    /* JADX INFO: renamed from: x1 */
    private short m25262x1(int i, float f) {
        return (short) C12566m9.m58636c5((i * f) / this.f17667to.m48175c5());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25265k4(String str) {
        int i = 0;
        while (i < str.length()) {
            int iCharAt = str.charAt(i);
            if (C14117yj.m67514du(str.charAt(i))) {
                char cCharAt = str.charAt(i);
                i++;
                iCharAt = C14117yj.m67525k4(cCharAt, str.charAt(i));
            }
            this.f17666kk.m48151k4(iCharAt);
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m25261k4(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = i; i2 < iArr.length; i2++) {
                int i3 = iArr[i2];
                int i4 = iArr[i];
                if (i3 < i4) {
                    iArr[i] = i3;
                    iArr[i2] = i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int[] m25266k4() {
        if (this.f17668x1 == null) {
            Dictionary<Integer, C9786ss> dictionaryM48153k4 = this.f17666kk.m48153k4();
            this.f17665k4 = dictionaryM48153k4;
            this.f17668x1 = new int[dictionaryM48153k4.size()];
            for (int i = 0; i < this.f17665k4.size(); i++) {
                this.f17668x1[i] = this.f17666kk.m48157x1().m58587to(this.f17666kk.m48157x1().m58583k4(Integer.valueOf(i)));
            }
            m25261k4(this.f17668x1);
        }
        return this.f17668x1;
    }
}
