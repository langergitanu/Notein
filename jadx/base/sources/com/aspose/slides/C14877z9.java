package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p159h0.C4441dy;
import com.aspose.slides.internal.p159h0.C4448h4;
import com.aspose.slides.internal.p159h0.C4457m9;
import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.z9 */
/* JADX INFO: loaded from: classes3.dex */
class C14877z9 {

    /* JADX INFO: renamed from: kk */
    private static final Dictionary<Integer, k4> f50498kk;

    /* JADX INFO: renamed from: k4 */
    public static final C4459os f50497k4 = new C4459os(1.0f, 1.0f);

    /* JADX INFO: renamed from: x1 */
    public static final C4459os f50499x1 = new C4459os(8.0f, 8.0f);

    /* JADX INFO: renamed from: com.aspose.slides.z9$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private C4459os[] f50500k4;

        /* JADX INFO: renamed from: x1 */
        private boolean[] f50501x1;

        public k4(C4459os[] c4459osArr, boolean[] zArr) {
            m74348k4(c4459osArr);
            m74349k4(zArr);
        }

        /* JADX INFO: renamed from: k4 */
        private void m74348k4(C4459os[] c4459osArr) {
            this.f50500k4 = c4459osArr;
        }

        /* JADX INFO: renamed from: x1 */
        public final boolean[] m74351x1() {
            return this.f50501x1;
        }

        /* JADX INFO: renamed from: k4 */
        private void m74349k4(boolean[] zArr) {
            this.f50501x1 = zArr;
        }

        /* JADX INFO: renamed from: k4 */
        public final C4459os[] m74350k4() {
            return this.f50500k4;
        }
    }

    static {
        Dictionary<Integer, k4> dictionary = new Dictionary<>();
        f50498kk = dictionary;
        dictionary.addItem(0, new k4(C4457m9.k4.m18267k4(), C4457m9.k4.m18268x1()));
        dictionary.addItem(1, new k4(C4457m9.x1.m18275k4(), C4457m9.x1.m18276x1()));
        dictionary.addItem(2, new k4(C4457m9.kk.m18269k4(), C4457m9.kk.m18270x1()));
        dictionary.addItem(3, new k4(C4457m9.to.m18273k4(), C4457m9.to.m18274x1()));
        dictionary.addItem(4, new k4(C4457m9.du.m18257k4(), C4457m9.du.m18258x1()));
        dictionary.addItem(5, new k4(C4457m9.h4.m18263k4(), C4457m9.h4.m18264x1()));
        dictionary.addItem(6, new k4(C4457m9.m9.m18271k4(), C4457m9.m9.m18272x1()));
        dictionary.addItem(7, new k4(C4457m9.dy.m18259k4(), C4457m9.dy.m18260x1()));
        dictionary.addItem(8, new k4(C4457m9.c5.m18253k4(), C4457m9.c5.m18254x1()));
        dictionary.addItem(9, new k4(C4457m9.jd.m18265k4(), C4457m9.jd.m18266x1()));
        dictionary.addItem(10, new k4(C4457m9.ck.m18255k4(), C4457m9.ck.m18256x1()));
        dictionary.addItem(11, new k4(C4457m9.fa.m18261k4(), C4457m9.fa.m18262x1()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4441dy m74347k4(a1f a1fVar) {
        C4448h4 c4448h4;
        C4448h4 c4448h42;
        if (a1fVar.m3161m9() != null) {
            k4[] k4VarArr = {null};
            boolean zTryGetValue = f50498kk.tryGetValue(Integer.valueOf(a1fVar.m3161m9().getBevelType()), k4VarArr);
            k4 k4Var = k4VarArr[0];
            if (zTryGetValue) {
                double width = a1fVar.m3161m9().getWidth();
                C4459os c4459os = f50497k4;
                c4448h4 = new C4448h4((float) (width < ((double) c4459os.m18285k4()) ? C14116yg.m67501x1(a1fVar.m3161m9().getWidth()) : a1fVar.m3161m9().getWidth()), (float) (a1fVar.m3161m9().getHeight() < ((double) c4459os.m18290x1()) ? C14116yg.m67501x1(a1fVar.m3161m9().getHeight()) : a1fVar.m3161m9().getHeight()), k4Var.m74350k4(), k4Var.m74351x1());
            } else {
                c4448h4 = null;
            }
        }
        if (a1fVar.m3149dy() != null) {
            k4[] k4VarArr2 = {null};
            boolean zTryGetValue2 = f50498kk.tryGetValue(Integer.valueOf(a1fVar.m3149dy().getBevelType()), k4VarArr2);
            k4 k4Var2 = k4VarArr2[0];
            c4448h42 = zTryGetValue2 ? new C4448h4((float) C14116yg.m67501x1(a1fVar.m3149dy().getWidth()), (float) C14116yg.m67501x1(a1fVar.m3149dy().getHeight()), k4Var2.m74350k4(), k4Var2.m74351x1()) : null;
        }
        if (c4448h4 == null && c4448h42 == null) {
            return null;
        }
        return new C4441dy(c4448h4, c4448h42);
    }
}
