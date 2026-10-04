package com.aspose.slides.internal.p200j6;

import OooOO0.OooO0OO;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p309o2.AbstractC6972x1;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.j6.x6 */
/* JADX INFO: loaded from: classes.dex */
public class C5213x6 extends AbstractC5200du {

    /* JADX INFO: renamed from: du */
    private AbstractC6972x1 f14233du;

    /* JADX INFO: renamed from: k4 */
    private C7186k4 f14234k4;

    /* JADX INFO: renamed from: kk */
    private Dictionary<Integer, float[]> f14235kk;

    /* JADX INFO: renamed from: to */
    private AbstractC5200du f14236to;

    /* JADX INFO: renamed from: x1 */
    private C5210to f14237x1;

    public C5213x6() {
        C7186k4 c7186k4 = new C7186k4();
        this.f14234k4 = c7186k4;
        c7186k4.m27783k4(C7182dy.f19583pr);
        this.f14234k4.m27783k4(C7182dy.m27765x1(""));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m22234k4() {
        return "Separation";
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: du */
    public int mo8467du() {
        return m22236x1().mo8467du();
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC6972x1 m22235h4() {
        return AbstractC6972x1.m27263k4(this.f14234k4.m27787x1(3));
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: kk */
    public C5210to mo8469kk() {
        if (this.f14237x1 == null) {
            this.f14237x1 = new C5210to(new float[]{1.0f}, this);
        }
        return this.f14237x1;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: to */
    public String mo8470to() {
        return m22234k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC5200du m22236x1() {
        return C5203h4.m22209k4(this.f14234k4.m27787x1(2));
    }

    public C5213x6(C7186k4 c7186k4) {
        this.f14234k4 = c7186k4;
        this.f14236to = AbstractC5200du.m22202k4(c7186k4.m27787x1(2));
        this.f14233du = AbstractC6972x1.m27263k4(this.f14234k4.m27787x1(3));
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: k4 */
    public float[] mo8468k4(float[] fArr) {
        float[] fArr2;
        if (this.f14235kk == null) {
            this.f14235kk = new Dictionary<>();
        }
        int iOooO0OO = OooO0OO.OooO0OO(fArr[0], 255.0f, 13);
        if (this.f14235kk.containsKey(Integer.valueOf(iOooO0OO)) && (fArr2 = this.f14235kk.get_Item(Integer.valueOf(iOooO0OO))) != null) {
            return fArr2;
        }
        float[] fArrMo8468k4 = this.f14236to.mo8468k4(this.f14233du.mo27241k4(fArr));
        this.f14235kk.addItem(Integer.valueOf(iOooO0OO), fArrMo8468k4);
        return fArrMo8468k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7186k4 m22237x1(C7185jd c7185jd) {
        AbstractC6972x1 abstractC6972x1M22235h4 = m22235h4();
        C7186k4 c7186k4 = new C7186k4();
        c7186k4.m27783k4(c7185jd);
        return abstractC6972x1M22235h4.m27271k4(c7186k4);
    }
}
