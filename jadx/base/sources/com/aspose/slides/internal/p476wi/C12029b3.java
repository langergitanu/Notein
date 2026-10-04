package com.aspose.slides.internal.p476wi;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p288n1.AbstractC6681k4;
import com.aspose.slides.internal.p318oh.C7043b3;
import com.aspose.slides.internal.p318oh.C7061jd;
import com.aspose.slides.internal.p318oh.C7064kp;
import com.aspose.slides.internal.p318oh.C7069os;
import com.aspose.slides.internal.p318oh.C7072qw;
import com.aspose.slides.internal.p318oh.C7077sv;
import com.aspose.slides.internal.p318oh.C7086v4;
import com.aspose.slides.internal.p318oh.C7090wl;
import com.aspose.slides.internal.p318oh.C7092wy;
import com.aspose.slides.internal.p421tk.C10988bz;
import com.aspose.slides.internal.p421tk.C11040xk;
import com.aspose.slides.internal.p501xj.C12537k4;
import com.aspose.slides.internal.p539z4.AbstractC13365c6;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.wi.b3 */
/* JADX INFO: loaded from: classes5.dex */
public class C12029b3 extends AbstractC6681k4 {
    /* JADX INFO: renamed from: k4 */
    private AbstractC13365c6 m56942k4(byte b, byte[] bArr) {
        AbstractC13373f9 abstractC13373f9M27582k4;
        C3134k4 c3134k4 = new C3134k4(new C3152yj(bArr));
        switch (b) {
            case 0:
                throw new C12537k4("The object is not a valid object.");
            case 1:
                abstractC13373f9M27582k4 = new C7061jd(bArr.length).m27582k4(c3134k4);
                break;
            case 2:
                abstractC13373f9M27582k4 = new C7064kp(bArr.length).m27585k4(c3134k4);
                break;
            case 3:
                abstractC13373f9M27582k4 = new C7077sv().m27598k4(c3134k4);
                break;
            case 4:
                abstractC13373f9M27582k4 = new C7072qw().m27593k4(c3134k4);
                break;
            case 5:
                abstractC13373f9M27582k4 = new C7092wy().m27613k4(c3134k4);
                break;
            case 6:
                abstractC13373f9M27582k4 = new C7086v4().m27607k4(c3134k4);
                break;
            case 7:
                abstractC13373f9M27582k4 = new C7069os().m27590k4(c3134k4);
                break;
            case 8:
                abstractC13373f9M27582k4 = new C7043b3().m27565k4(c3134k4);
                break;
            case 9:
                abstractC13373f9M27582k4 = new C7090wl().m27611k4(c3134k4);
                break;
            default:
                throw new C12537k4("Unknown object type: " + (b & 255));
        }
        return (AbstractC13365c6) abstractC13373f9M27582k4;
    }

    @Override // com.aspose.slides.internal.p288n1.AbstractC6681k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo26430k4(C10988bz[] c10988bzArr, AbstractC3150x6 abstractC3150x6) {
        C11040xk c11040xk = new C11040xk(c10988bzArr[0]);
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        if (!c11040xk.m53444kk()) {
            byte[] bArrM13372dy = c3134k4.m13372dy(c11040xk.av_());
            if (c11040xk.m53204ks().m23132kk().containsKey(Integer.valueOf(c11040xk.m53445m9() & 255))) {
                byte[] bArr = c11040xk.m53204ks().m23132kk().get_Item(Integer.valueOf(c11040xk.m53445m9() & 255));
                int length = bArr.length;
                byte[] bArr2 = new byte[c11040xk.av_() + length];
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, bArr.length);
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrM13372dy), 0, AbstractC14092to.m67208k4((Object) bArr2), length, bArrM13372dy.length);
                c11040xk.m53204ks().m23132kk().removeItemByKey(Integer.valueOf(c11040xk.m53445m9() & 255));
                bArrM13372dy = bArr2;
            }
            c11040xk.m53440k4(m56942k4(c11040xk.m53446to(), bArrM13372dy));
            c10988bzArr[0] = c11040xk;
            return true;
        }
        c11040xk.m53443kk(c3134k4.m13386x6());
        byte[] bArrM13372dy2 = c3134k4.m13372dy(c11040xk.av_() - 4);
        c11040xk.m53441k4(bArrM13372dy2);
        if (!c11040xk.m53204ks().m23132kk().containsKey(Integer.valueOf(c11040xk.m53445m9() & 255))) {
            if (bArrM13372dy2.length < c11040xk.m53439dy()) {
                c11040xk.m53204ks().m23132kk().addItem(Integer.valueOf(c11040xk.m53445m9() & 255), bArrM13372dy2);
                c10988bzArr[0] = c11040xk;
                return true;
            }
            if (bArrM13372dy2.length != c11040xk.m53439dy()) {
                throw new C12537k4("Object reading error. Was read more bytes than the object size.");
            }
            c11040xk.m53440k4(m56942k4(c11040xk.m53446to(), bArrM13372dy2));
            c10988bzArr[0] = c11040xk;
            return true;
        }
        byte[] bArr3 = c11040xk.m53204ks().m23132kk().get_Item(Integer.valueOf(c11040xk.m53445m9() & 255));
        int length2 = bArr3.length;
        int length3 = bArr3.length + bArrM13372dy2.length;
        byte[] bArr4 = new byte[length3];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr3), 0, AbstractC14092to.m67208k4((Object) bArr4), 0, bArr3.length);
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrM13372dy2), 0, AbstractC14092to.m67208k4((Object) bArr4), length2, bArrM13372dy2.length);
        if (length3 < c11040xk.m53439dy()) {
            c11040xk.m53204ks().m23132kk().set_Item(Integer.valueOf(c11040xk.m53445m9() & 255), bArr4);
            c10988bzArr[0] = c11040xk;
            return true;
        }
        if (length3 != c11040xk.m53439dy()) {
            throw new C12537k4("Object reading error. Was read more bytes than the object size.");
        }
        c11040xk.m53440k4(m56942k4(c11040xk.m53446to(), bArr4));
        c11040xk.m53204ks().m23132kk().removeItemByKey(Integer.valueOf(c11040xk.m53445m9() & 255));
        c10988bzArr[0] = c11040xk;
        return true;
    }
}
