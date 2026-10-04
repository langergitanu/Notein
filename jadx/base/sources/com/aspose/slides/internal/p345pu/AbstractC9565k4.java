package com.aspose.slides.internal.p345pu;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.internal.p266m5.C6318kk;
import com.aspose.slides.internal.p370qv.AbstractC9947x1;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p475wh.C12003du;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.pu.k4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9565k4<T extends AbstractC9947x1> implements InterfaceC9562fa<T> {

    /* JADX INFO: renamed from: k4 */
    protected C11906rv f34546k4;

    public AbstractC9565k4(C11906rv c11906rv) {
        this.f34546k4 = c11906rv;
    }

    /* JADX INFO: renamed from: k4 */
    public int m46713k4(int i) {
        return Math.min(255, Math.max(0, i));
    }

    /* JADX INFO: renamed from: k4 */
    public int m46714k4(int i, double d) {
        return m46713k4((int) (((double) (i & 255)) * d));
    }

    /* JADX INFO: renamed from: k4 */
    public int m46715k4(int i, int i2, double d) {
        if (d < 0.0d) {
            d = 0.0d;
        }
        double d2 = d > 1.0d ? 1.0d : d;
        return m46713k4((int) C21532OooOOo.OooO0O0(1.0d, d2, i2 & 255, ((double) (i & 255)) * d2));
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m46716k4(int i, int i2, int i3, int i4) {
        return C12003du.m56398k4(m46713k4(i), m46713k4(i2), m46713k4(i3), m46713k4(i4));
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m46717k4(C12003du c12003du, double d) {
        return C12003du.m56398k4(m46714k4(c12003du.m56501c5(), d), m46714k4(c12003du.m56507jd(), d), m46714k4(c12003du.m56502ck(), d), m46714k4(c12003du.m56505fa(), d));
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m46718k4(C12003du[] c12003duArr, double d) {
        return c12003duArr[(int) Math.round(Math.max(0.0d, Math.min(1.0d, d)) * ((double) (c12003duArr.length - 1)))];
    }

    /* JADX INFO: renamed from: k4 */
    public List<C12003du[]> m46719k4(C12003du[] c12003duArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < c12003duArr.length - 1) {
            C12003du c12003du = c12003duArr[i];
            i++;
            arrayList.add(m46720k4(c12003du, c12003duArr[i]));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du[] m46720k4(C12003du c12003du, C12003du c12003du2) {
        return new C6318kk(256).m25871k4(c12003du, c12003du2);
    }
}
