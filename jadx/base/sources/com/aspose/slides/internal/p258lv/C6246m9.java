package com.aspose.slides.internal.p258lv;

import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C6246m9 extends C6257wy {
    public C6246m9(C6258x1 c6258x1) {
        super(c6258x1);
    }

    /* JADX INFO: renamed from: x1 */
    private void m25347x1(C9790ts c9790ts) {
        C6239h4 c6239h4M25400kk = m25385m9().m25400kk(c9790ts);
        m25384h4().m25293x1((short) c6239h4M25400kk.m25266k4().length);
        long position = m25384h4().m25292x1().m13442k4().getPosition();
        int length = c6239h4M25400kk.m25266k4().length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            m25384h4().m25291kk(0);
        }
        long position2 = m25384h4().m25292x1().m13442k4().getPosition();
        m25384h4().m25291kk(0);
        C6237dy c6237dy = new C6237dy(m25385m9());
        for (int i2 = 0; i2 < c6239h4M25400kk.m25266k4().length; i2++) {
            iArr[i2] = (int) (m25384h4().m25292x1().m13442k4().getPosition() - position);
            int i3 = c6239h4M25400kk.m25266k4()[i2];
            if (i3 != 32) {
                c6237dy.m25259k4(c6239h4M25400kk.m25270x1(i3));
            } else {
                c6237dy.m25258k4();
            }
        }
        int position3 = (int) (m25384h4().m25292x1().m13442k4().getPosition() - position);
        m25384h4().m25292x1().m13442k4().setPosition(position2);
        m25384h4().m25291kk(position3);
        m25384h4().m25292x1().m13442k4().setPosition(position);
        for (int i4 = 0; i4 < length; i4++) {
            m25384h4().m25291kk(iArr[i4]);
        }
        m25384h4().m25292x1().m13442k4().seek(0L, 2);
        for (int i5 = 0; i5 < c6239h4M25400kk.m25266k4().length; i5++) {
            m25384h4().m25293x1((short) c6239h4M25400kk.m25266k4()[i5]);
        }
        m25384h4().m25293x1(c6239h4M25400kk.m25271x1());
        m25384h4().m25293x1(c6239h4M25400kk.m25267kk());
        m25384h4().m25293x1(c6239h4M25400kk.m25269to());
        for (int i6 = 0; i6 < c6239h4M25400kk.m25266k4().length; i6++) {
            m25384h4().m25293x1(c6239h4M25400kk.m25268kk(c6239h4M25400kk.m25266k4()[i6]));
        }
        for (int i7 = 0; i7 < c6239h4M25400kk.m25266k4().length; i7++) {
            m25384h4().m25284k4(0, 0, 0, 0);
        }
        m25384h4().m25293x1(0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25348k4(C9790ts c9790ts) {
        C6260yd c6260yd = new C6260yd(m25385m9());
        c6260yd.m25413k4();
        m25384h4().m25293x1(m25385m9().m25405x1(c9790ts));
        m25384h4().m25289k4(true, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(true, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(true, false);
        m25384h4().m25289k4(true, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(false, true);
        m25384h4().m25282k4(0);
        String strM67408k4 = C14113y2.m67408k4(c9790ts.m48228to(), "_AW");
        m25384h4().m25282k4(((byte) strM67408k4.length()) & 255);
        for (int i = 0; i < strM67408k4.length(); i++) {
            m25384h4().m25282k4(((byte) strM67408k4.charAt(i)) & 255);
        }
        m25347x1(c9790ts);
        m25384h4().m25292x1().m13442k4().seek(0L, 2);
        c6260yd.m25414k4(75);
    }
}
