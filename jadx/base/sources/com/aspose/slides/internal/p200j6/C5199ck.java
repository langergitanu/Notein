package com.aspose.slides.internal.p200j6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p309o2.AbstractC6972x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p348q1.C9609k4;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.j6.ck */
/* JADX INFO: loaded from: classes.dex */
public class C5199ck extends AbstractC5200du {

    /* JADX INFO: renamed from: k4 */
    private C7186k4 f14202k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC6972x1 f14203kk;

    /* JADX INFO: renamed from: to */
    private C5210to f14204to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC5200du f14205x1;

    public C5199ck() {
        C7186k4 c7186k4 = new C7186k4();
        this.f14202k4 = c7186k4;
        c7186k4.m27783k4(C7182dy.f19628sq);
        this.f14202k4.m27783k4(C7185jd.m27775dy());
        this.f14202k4.m27783k4(C7185jd.m27775dy());
        this.f14202k4.m27783k4(C7185jd.m27775dy());
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: du */
    public int mo8467du() {
        return m22201x1().size();
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC6972x1 m22198h4() {
        C7185jd c7185jdM27787x1;
        if (this.f14203kk == null && (c7185jdM27787x1 = this.f14202k4.m27787x1(3)) != null) {
            this.f14203kk = AbstractC6972x1.m27263k4(c7185jdM27787x1);
        }
        return this.f14203kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7186k4 m22199k4(List<C7185jd> list) {
        AbstractC6972x1 abstractC6972x1M22198h4 = m22198h4();
        C7186k4 c7186k4 = new C7186k4();
        List.Enumerator<C7185jd> it = list.iterator();
        while (it.hasNext()) {
            try {
                c7186k4.m27783k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return abstractC6972x1M22198h4.m27271k4(c7186k4);
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: kk */
    public C5210to mo8469kk() {
        if (this.f14204to == null) {
            int iMo8467du = mo8467du();
            float[] fArr = new float[iMo8467du];
            for (int i = 0; i < iMo8467du; i++) {
                fArr[i] = 1.0f;
            }
            this.f14204to = new C5210to(fArr, this);
        }
        return this.f14204to;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC5200du m22200m9() {
        C7185jd c7185jdM27787x1;
        if (this.f14205x1 == null && (c7185jdM27787x1 = this.f14202k4.m27787x1(2)) != null) {
            this.f14205x1 = C5203h4.m22209k4(c7185jdM27787x1);
        }
        return this.f14205x1;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: to */
    public String mo8470to() {
        return m22196k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final List<String> m22201x1() {
        C7186k4 c7186k4 = (C7186k4) this.f14202k4.m27787x1(1);
        if (c7186k4 != null) {
            return C9609k4.m46928kk(c7186k4);
        }
        return null;
    }

    public C5199ck(C7186k4 c7186k4) {
        this.f14202k4 = c7186k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m22196k4() {
        return "DeviceN";
    }

    /* JADX INFO: renamed from: x1 */
    private float[] m22197x1(float[] fArr) {
        return this.f14205x1.mo8468k4(this.f14203kk.mo27241k4(fArr));
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: k4 */
    public float[] mo8468k4(float[] fArr) {
        return m22197x1(fArr);
    }
}
