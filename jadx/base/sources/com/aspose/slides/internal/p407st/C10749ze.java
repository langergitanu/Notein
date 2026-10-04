package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.ze */
/* JADX INFO: loaded from: classes4.dex */
public class C10749ze extends C10355ai {

    /* JADX INFO: renamed from: k4 */
    private int f37566k4;

    /* JADX INFO: renamed from: x1 */
    private int f37567x1;

    public C10749ze(int i, int i2) {
        super(i, i2 != 0 ? i2 + 6 : i2);
    }

    /* JADX INFO: renamed from: h4 */
    private int m52130h4() {
        if ((m52131du() & 65535) != 65520) {
            return m52131du();
        }
        return 4;
    }

    /* JADX INFO: renamed from: du */
    public final int m52131du() {
        return this.f37567x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52132k4(int i, long j) {
        if (i < 0 || i >= (m52134to() & 65535)) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        if (((m52131du() & 65535) < 1 || (m52131du() & 65535) > 8) && m52131du() != 65520) {
            throw new InvalidOperationException(C14113y2.m67402k4("Size of element is {0}, but should be between 1 and 8 or 0xFFF0.", Integer.valueOf(this.f37567x1)));
        }
        int iM52130h4 = m52130h4();
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        C3110yd.m13259x1(bArr, 0, j);
        int i2 = iM52130h4 & 65535;
        System.arraycopy(bArr, 0, mo50423x1(), (i * i2) + 6, i2);
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m52133kk(int i) {
        int iM52130h4 = m52130h4() & 65535;
        byte[] bArr = new byte[iM52130h4];
        System.arraycopy(mo50423x1(), (i * iM52130h4) + 6, bArr, 0, iM52130h4);
        return bArr;
    }

    /* JADX INFO: renamed from: to */
    public final int m52134to() {
        return this.f37566k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m52135x1(int i) {
        if (i < 0 || i >= (m52134to() & 65535)) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        if (((m52131du() & 65535) < 1 || (m52131du() & 65535) > 8) && m52131du() != 65520) {
            throw new InvalidOperationException(C14113y2.m67402k4("Size of element is {0}, but should be between 1 and 8 or 0xFFF0.", Integer.valueOf(this.f37567x1)));
        }
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        int iM52130h4 = m52130h4() & 65535;
        System.arraycopy(mo50423x1(), (i * iM52130h4) + 6, bArr, 0, iM52130h4);
        return C7019kk.m27461m9(Long.valueOf(C3110yd.m13252to(bArr)), 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C10749ze(int i, int i2, int i3) {
        int i4 = i2 & 65535;
        int i5 = i3 & 65535;
        super(i, (((i5 != 65520 ? i3 : 4) & 65535) * i4) + 6);
        this.f37566k4 = i2;
        this.f37567x1 = i3;
        C3110yd.m13243k4(mo50423x1(), 0, i4);
        int i6 = 4;
        while (true) {
            int i7 = i6 & 65535;
            if (i7 >= i4) {
                break;
            }
            int i8 = i7 * 2;
            i6 = i8 & 65535;
            if ((i8 & 65535) == 0) {
                i6 = 65535;
                break;
            }
        }
        C3110yd.m13243k4(mo50423x1(), 2, i6 & 65535);
        C3110yd.m13243k4(mo50423x1(), 4, i5);
    }

    @Override // com.aspose.slides.internal.p407st.C10355ai
    /* JADX INFO: renamed from: k4 */
    public void mo50418k4(C3134k4 c3134k4) {
        if (m50421kk() == 0) {
            return;
        }
        c3134k4.m13375k4(mo50423x1(), 0, 6);
        this.f37566k4 = C3110yd.m13257x1(mo50423x1(), 0) & 65535;
        this.f37567x1 = C3110yd.m13257x1(mo50423x1(), 4) & 65535;
        m50417k4(((this.f37566k4 & 65535) * (m52130h4() & 65535)) + 6);
        c3134k4.m13375k4(mo50423x1(), 6, (this.f37566k4 & 65535) * (65535 & m52130h4()));
    }
}
