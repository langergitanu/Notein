package com.aspose.slides.internal.p258lv;

import com.aspose.slides.internal.p151gj.C4316du;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4318fa;
import com.aspose.slides.internal.p151gj.C4324m9;
import com.aspose.slides.internal.p151gj.C4327up;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p302nm.C6922h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.du */
/* JADX INFO: loaded from: classes4.dex */
public class C6236du extends C6257wy {
    public C6236du(C6258x1 c6258x1) {
        super(c6258x1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m25251k4(C4316du c4316du) {
        m25255k4(C6922h4.m27133k4(c4316du), null, 0);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25257x1(C4328x1 c4328x1) {
        int iM17417k4 = c4328x1.m17417k4();
        if (iM17417k4 == 0) {
            m25252k4((C4318fa) c4328x1);
            return;
        }
        if (iM17417k4 == 1) {
            m25251k4((C4316du) c4328x1);
            return;
        }
        if (iM17417k4 == 2) {
            m25254k4((C4327up) c4328x1);
        } else if (iM17417k4 != 3) {
            m25252k4(new C4318fa(C5656k4.f15629ze));
        } else {
            m25253k4((C4324m9) c4328x1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m25252k4(C4318fa c4318fa) {
        m25384h4().m25282k4(0);
        m25384h4().m25295x1(c4318fa.m17352x1());
    }

    /* JADX INFO: renamed from: k4 */
    private void m25253k4(C4324m9 c4324m9) {
        m25384h4().m25282k4(16);
        C4317dy c4317dyM17345kk = c4324m9.m17385fa() != null ? c4324m9.m17385fa().m17345kk() : new C4317dy();
        c4317dyM17345kk.m17349x1((c4324m9.m17391du().m56550c5() / 2.0f) + c4324m9.m17391du().m56557jd(), (c4324m9.m17391du().m56575x1() / 2.0f) + c4324m9.m17391du().m56551ck(), 0);
        c4317dyM17345kk.m17336k4(c4324m9.m17391du().m56550c5() / 32768.0f, c4324m9.m17391du().m56575x1() / 32768.0f, 0);
        m25384h4().m25286k4(c4317dyM17345kk);
        new C6234c5(m25385m9()).m25247k4(c4324m9);
    }

    /* JADX INFO: renamed from: k4 */
    private void m25254k4(C4327up c4327up) {
        m25255k4(c4327up.m17416x1(), c4327up.m17385fa(), c4327up.m17388up());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25256k4(C4328x1 c4328x1) {
        m25384h4().m25282k4(1);
        int iM17417k4 = c4328x1.m17417k4();
        if (iM17417k4 == 0) {
            m25252k4((C4318fa) c4328x1);
            return;
        }
        if (iM17417k4 == 1) {
            m25251k4((C4316du) c4328x1);
            return;
        }
        if (iM17417k4 == 2) {
            m25254k4((C4327up) c4328x1);
        } else if (iM17417k4 != 3) {
            m25252k4(new C4318fa(C5656k4.f15629ze));
        } else {
            m25253k4((C4324m9) c4328x1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m25255k4(byte[] bArr, C4317dy c4317dy, int i) {
        if (c4317dy == null) {
            c4317dy = new C4317dy();
        }
        short sM25406x1 = m25385m9().m25406x1(bArr);
        m25384h4().m25282k4(((byte) (i == 4 ? 65 : 64)) & 255);
        m25384h4().m25293x1(sM25406x1);
        m25384h4().m25286k4(c4317dy);
    }
}
