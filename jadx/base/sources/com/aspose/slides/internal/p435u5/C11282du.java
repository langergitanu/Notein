package com.aspose.slides.internal.p435u5;

import com.aspose.slides.internal.p314oc.C7016dy;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12017to;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: renamed from: com.aspose.slides.internal.u5.du */
/* JADX INFO: loaded from: classes4.dex */
public class C11282du {

    /* JADX INFO: renamed from: x1 */
    private static final C7016dy<C11282du> f38858x1 = new C7016dy<>(null);

    /* JADX INFO: renamed from: k4 */
    private final C12009k4 f38859k4 = new C12009k4(1, 1);

    private C11282du() {
    }

    /* JADX INFO: renamed from: k4 */
    public static C11282du m54238k4() {
        C7016dy<C11282du> c7016dy = f38858x1;
        if (c7016dy.get() == null) {
            c7016dy.set(new C11282du());
        }
        return c7016dy.get();
    }

    /* JADX INFO: renamed from: k4 */
    private static C12015qq m54239k4(AbstractC12008jd abstractC12008jd, String str, C12013m9 c12013m9) {
        C12019um c12019um = new C12019um(C12019um.m56799c5());
        C12007ix c12007ix = new C12007ix(0.0f, 0.0f, 1000.0f, 1000.0f);
        c12019um.m56814k4(new C12017to[]{new C12017to(0, str.length())});
        C12007ix c12007ixClone = abstractC12008jd.mo17558k4(str, c12013m9, c12007ix.Clone(), c12019um)[0].m56749k4(abstractC12008jd).Clone();
        return new C12015qq(c12007ixClone.m56550c5() - c12007ixClone.m56557jd(), c12007ixClone.m56575x1() - c12007ixClone.m56551ck());
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m54240k4(String str, float f, int i) {
        C11284k4.m54245k4(str, CommonConstant.KEY_FAMILY_NAME);
        C12015qq c12015qq = new C12015qq();
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) this.f38859k4);
        try {
            C12013m9 c12013m9M56632k4 = C12013m9.m56632k4(str, f, i);
            try {
                abstractC12008jdM56582k4.mo17487k4("QWERTYUIOPASDFGHJKLZXCVBNM ", c12013m9M56632k4).CloneTo(c12015qq);
                abstractC12008jdM56582k4.dispose();
                return new C12015qq(C11287to.m54256x1(c12015qq.m56699x1() / 27), C11287to.m54256x1(c12015qq.m56697kk()));
            } finally {
                if (c12013m9M56632k4 != null) {
                    c12013m9M56632k4.dispose();
                }
            }
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m54241k4(String str, String str2, float f, int i) {
        C11284k4.m54245k4(str, "word");
        C11284k4.m54245k4(str2, "fontFamily");
        C12015qq c12015qq = new C12015qq();
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) this.f38859k4);
        try {
            C12013m9 c12013m9M56632k4 = C12013m9.m56632k4(str2, f, i);
            try {
                abstractC12008jdM56582k4.mo17487k4(str, c12013m9M56632k4).CloneTo(c12015qq);
                if (!C14113y2.m67411k4(C14113y2.m67440x1(str))) {
                    m54239k4(abstractC12008jdM56582k4, str, c12013m9M56632k4).CloneTo(c12015qq);
                }
                C12015qq c12015qq2 = new C12015qq(C11287to.m54256x1(c12015qq.m56699x1()), C11287to.m54256x1(c12015qq.m56697kk()));
                if (c12013m9M56632k4 != null) {
                    c12013m9M56632k4.dispose();
                }
                abstractC12008jdM56582k4.dispose();
                return c12015qq2;
            } catch (Throwable th) {
                if (c12013m9M56632k4 != null) {
                    c12013m9M56632k4.dispose();
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th2;
        }
    }
}
