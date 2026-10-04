package com.aspose.slides.internal.p309o2;

import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p348q1.C9612x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.o2.du */
/* JADX INFO: loaded from: classes4.dex */
public class C6968du extends AbstractC6972x1 {

    /* JADX INFO: renamed from: k4 */
    private C7186k4 f18962k4;

    /* JADX INFO: renamed from: kk */
    private C7186k4 f18963kk;

    /* JADX INFO: renamed from: x1 */
    private C7186k4 f18964x1;

    public C6968du(C7185jd c7185jd) {
        super(c7185jd);
    }

    /* JADX INFO: renamed from: k4 */
    public final C7186k4 m27240k4() {
        if (this.f18962k4 == null) {
            this.f18962k4 = (C7186k4) m27273m9().mo27768h4(C7182dy.f19690x0);
        }
        return this.f18962k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C7186k4 m27242kk() {
        if (this.f18964x1 == null) {
            this.f18964x1 = (C7186k4) m27273m9().mo27768h4(C7182dy.f19736zd);
        }
        return this.f18964x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7186k4 m27243x1() {
        if (this.f18963kk == null) {
            this.f18963kk = (C7186k4) m27273m9().mo27768h4(C7182dy.f19596qm);
        }
        return this.f18963kk;
    }

    /* JADX INFO: renamed from: kk */
    private C9612x1 m27239kk(int i) {
        return new C9612x1(m27242kk(), i);
    }

    @Override // com.aspose.slides.internal.p309o2.AbstractC6972x1
    /* JADX INFO: renamed from: k4 */
    public float[] mo27241k4(float[] fArr) {
        AbstractC6972x1 abstractC6972x1M27263k4;
        float f = fArr[0];
        C9612x1 c9612x1M27274x1 = m27274x1(0);
        float fM46940k4 = c9612x1M27274x1.m46940k4();
        float fM46941x1 = c9612x1M27274x1.m46941x1();
        float fM27269k4 = m27269k4(f, fM46940k4, fM46941x1);
        C7186k4 c7186k4M27240k4 = m27240k4();
        if (c7186k4M27240k4.m27778k4() == 1) {
            abstractC6972x1M27263k4 = AbstractC6972x1.m27263k4(c7186k4M27240k4.m27785kk(0));
            C9612x1 c9612x1M27239kk = m27239kk(0);
            fM27269k4 = m27270k4(fM27269k4, fM46940k4, fM46941x1, c9612x1M27239kk.m46940k4(), c9612x1M27239kk.m46941x1());
        } else {
            float[] fArrM27788x1 = m27243x1().m27788x1();
            int length = fArrM27788x1.length;
            float[] fArr2 = new float[length + 2];
            fArr2[0] = c9612x1M27274x1.m46940k4();
            int i = length + 1;
            fArr2[i] = c9612x1M27274x1.m46941x1();
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4(fArrM27788x1), 0, AbstractC14092to.m67208k4(fArr2), 1, length);
            for (int i2 = 0; i2 < i; i2++) {
                if (fM27269k4 >= fArr2[i2]) {
                    int i3 = i2 + 1;
                    float f2 = fArr2[i3];
                    if (fM27269k4 < f2 || (i2 == length && fM27269k4 == f2)) {
                        abstractC6972x1M27263k4 = AbstractC6972x1.m27263k4(c7186k4M27240k4.m27785kk(i2));
                        C9612x1 c9612x1M27239kk2 = m27239kk(i2);
                        fM27269k4 = m27270k4(fM27269k4, fArr2[i2], fArr2[i3], c9612x1M27239kk2.m46940k4(), c9612x1M27239kk2.m46941x1());
                        break;
                    }
                }
            }
            abstractC6972x1M27263k4 = null;
        }
        return m27275x1(abstractC6972x1M27263k4.mo27241k4(new float[]{fM27269k4}));
    }
}
