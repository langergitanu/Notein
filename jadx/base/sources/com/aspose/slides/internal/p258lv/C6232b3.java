package com.aspose.slides.internal.p258lv;

import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p420th.C10963ks;
import com.aspose.slides.internal.p505xn.C12566m9;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.b3 */
/* JADX INFO: loaded from: classes4.dex */
public class C6232b3 extends C6257wy {
    public C6232b3(C6258x1 c6258x1) {
        super(c6258x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25237k4(C10963ks c10963ks, short s) {
        C6260yd c6260yd = new C6260yd(m25385m9());
        c6260yd.m25413k4();
        m25384h4().m25293x1(s);
        m25384h4().m25284k4(C12566m9.m58636c5(c10963ks.m52998ne().m56571to()), C12566m9.m58636c5(c10963ks.m52998ne().m56556h4()), C12566m9.m58636c5(c10963ks.m52998ne().m56554dy()), C12566m9.m58636c5(c10963ks.m52998ne().m56558k4()));
        C4317dy c4317dy = new C4317dy();
        c4317dy.m17349x1(C12566m9.m58636c5(c10963ks.m52982jd().m56897x1()), C12566m9.m58636c5(c10963ks.m52982jd().m56895kk()), 0);
        m25384h4().m25286k4(c4317dy);
        C9790ts c9790tsM23120k4 = c10963ks.m53005x1().m23120k4();
        C6239h4 c6239h4M25400kk = m25385m9().m25400kk(c9790tsM23120k4);
        int length = c10963ks.m52977ck().length();
        int[] iArr = new int[length];
        int[] iArr2 = new int[c10963ks.m52977ck().length()];
        int i = 0;
        while (i < c10963ks.m52977ck().length()) {
            boolean zM67514du = C14117yj.m67514du(c10963ks.m52977ck().charAt(0));
            int iCharAt = c10963ks.m52977ck().charAt(i);
            if (i < c10963ks.m52977ck().length() - 1 && zM67514du) {
                iCharAt = C14117yj.m67525k4(c10963ks.m52977ck().charAt(i), c10963ks.m52977ck().charAt(i + 1));
            }
            iArr[i] = c6239h4M25400kk.m25263k4(iCharAt);
            iArr2[i] = c6239h4M25400kk.m25264k4(iCharAt, c10963ks.m53005x1().m23114dy());
            if (zM67514du) {
                i++;
            }
            i++;
        }
        int iM25275k4 = C6242k4.m25275k4(iArr);
        int iM25275k42 = C6242k4.m25275k4(iArr2);
        m25384h4().m25282k4(((byte) iM25275k4) & 255);
        m25384h4().m25282k4(((byte) iM25275k42) & 255);
        m25384h4().m25294x1(1, 1, false);
        m25384h4().m25294x1(0, 3, false);
        m25384h4().m25294x1(1, 1, false);
        m25384h4().m25294x1(1, 1, false);
        m25384h4().m25294x1(0, 1, false);
        m25384h4().m25294x1(0, 1, false);
        m25384h4().m25293x1(m25385m9().m25405x1(c9790tsM23120k4));
        m25384h4().m25287k4(c10963ks.m52995kk());
        m25384h4().m25293x1((short) C12566m9.m58636c5(c10963ks.m53005x1().m23114dy()));
        m25384h4().m25282k4(((byte) length) & 255);
        for (int i2 = 0; i2 < length; i2++) {
            m25384h4().m25294x1(iArr[i2], iM25275k4, false);
            m25384h4().m25285k4(iArr2[i2], iM25275k42, false);
        }
        m25384h4().m25294x1(0, 8, false);
        m25384h4().m25280k4();
        c6260yd.m25414k4(11);
    }
}
