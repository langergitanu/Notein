package com.aspose.slides.internal.p020ae;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7180ck;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7188ks;
import com.aspose.slides.internal.p329p4.C7189m9;
import com.aspose.slides.internal.p329p4.C7190to;
import com.aspose.slides.internal.p333p8.C9432up;

/* JADX INFO: renamed from: com.aspose.slides.internal.ae.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1362h4 extends C1364kk {

    /* JADX INFO: renamed from: k4 */
    private C7180ck f5919k4;

    /* JADX INFO: renamed from: kk */
    private int[] f5920kk;

    /* JADX INFO: renamed from: to */
    private final List<Long> f5921to;

    /* JADX INFO: renamed from: x1 */
    private C9432up f5922x1;

    public C1362h4(C7180ck c7180ck, C7190to c7190to, C9432up c9432up) {
        super(c7180ck.mo27760kk());
        this.f5919k4 = c7180ck;
        this.f5922x1 = c9432up;
        m8102k4(c7190to);
        this.f5920kk = new int[3];
        this.f5921to = new List<>();
        try {
            m8077k4(c7180ck);
        } catch (IOException unused) {
            if (m8081k4() != null) {
                m8081k4().dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private long m8076k4(byte[] bArr, int i, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j += (long) ((bArr[i3 + i] & 255) << (((i2 - i3) - 1) * 8));
        }
        return j;
    }

    @Override // com.aspose.slides.internal.p020ae.C1364kk
    /* JADX INFO: renamed from: h4 */
    public C7190to mo8078h4() {
        int iM8076k4;
        List.Enumerator<Long> it = this.f5921to.iterator();
        int[] iArr = this.f5920kk;
        byte[] bArr = new byte[iArr[0] + iArr[1] + iArr[2]];
        while (!m8081k4().m46132x1() && it.hasNext()) {
            m8081k4().m46119k4(bArr);
            long jLongValue = it.next().longValue();
            int i = this.f5920kk[0];
            int iM8076k42 = i == 0 ? 1 : (int) m8076k4(bArr, 0, i);
            if (iM8076k42 != 0) {
                int[] iArr2 = this.f5920kk;
                long jM8076k4 = m8076k4(bArr, iArr2[0], iArr2[1]);
                if (iM8076k42 == 1) {
                    int[] iArr3 = this.f5920kk;
                    iM8076k4 = (int) m8076k4(bArr, iArr3[0] + iArr3[1], iArr3[2]);
                } else {
                    iM8076k4 = 0;
                }
                C7188ks c7188ks = new C7188ks(jLongValue, iM8076k4);
                if (iM8076k42 == 1) {
                    this.f5922x1.m46192k4(c7188ks, jM8076k4);
                } else {
                    this.f5922x1.m46192k4(c7188ks, -jM8076k4);
                }
            }
        }
        if (m8081k4() != null) {
            m8081k4().dispose();
        }
        return m8101du();
    }

    /* JADX INFO: renamed from: k4 */
    private void m8077k4(C7180ck c7180ck) {
        C7186k4 c7186k4M27793dy = c7180ck.m27793dy(C7182dy.f19652ug);
        if (c7186k4M27793dy == null) {
            throw new IOException("/W array is missing in Xref stream");
        }
        for (int i = 0; i < 3; i++) {
            this.f5920kk[i] = c7186k4M27793dy.m27779k4(i, 0);
        }
        C7186k4 c7186k4M27793dy2 = c7180ck.m27793dy(C7182dy.f19386dk);
        if (c7186k4M27793dy2 == null) {
            c7186k4M27793dy2 = new C7186k4();
            c7186k4M27793dy2.m27783k4(C7189m9.m27821k4());
            c7186k4M27793dy2.m27783k4(C7189m9.m27822k4(c7180ck.m27796k4(C7182dy.f19495kf, 0)));
        }
        IGenericEnumerator<C7185jd> it = c7186k4M27793dy2.iterator();
        while (it.hasNext()) {
            C7185jd next = it.next();
            if (!C7019kk.m27469x1(next, C7179c5.class)) {
                throw new IOException("Xref stream must have integer in /Index array");
            }
            long jM27752kk = ((C7179c5) next).m27752kk();
            if (!it.hasNext()) {
                return;
            }
            C7185jd next2 = it.next();
            if (!C7019kk.m27469x1(next2, C7179c5.class)) {
                throw new IOException("Xref stream must have integer in /Index array");
            }
            int iM27752kk = ((C7179c5) next2).m27752kk();
            for (int i2 = 0; i2 < iM27752kk; i2++) {
                this.f5921to.addItem(Long.valueOf(((long) i2) + jM27752kk));
            }
        }
    }
}
