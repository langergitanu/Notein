package com.aspose.slides.internal.p200j6;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p033b2.C1576x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7184h4;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p329p4.InterfaceC7193yj;
import com.aspose.slides.internal.p333p8.C9421c5;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.j6.du */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5200du implements InterfaceC7193yj {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC5200du m22202k4(C7185jd c7185jd) {
        return m22203k4(c7185jd, null);
    }

    @Override // com.aspose.slides.internal.p329p4.InterfaceC7193yj
    /* JADX INFO: renamed from: c5 */
    public C7185jd mo8461c5() {
        return C7182dy.m27765x1(mo8470to());
    }

    /* JADX INFO: renamed from: du */
    public abstract int mo8467du();

    /* JADX INFO: renamed from: k4 */
    public abstract float[] mo8468k4(float[] fArr);

    /* JADX INFO: renamed from: kk */
    public abstract C5210to mo8469kk();

    /* JADX INFO: renamed from: to */
    public abstract String mo8470to();

    /* JADX INFO: renamed from: k4 */
    public static AbstractC5200du m22203k4(C7185jd c7185jd, C9421c5 c9421c5) {
        return m22204k4(c7185jd, c9421c5, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC5200du m22204k4(C7185jd c7185jd, C9421c5 c9421c5, boolean z) {
        if (C7019kk.m27469x1(c7185jd, C7184h4.class)) {
            return m22203k4(((C7184h4) C7019kk.m27452k4((Object) c7185jd, C7184h4.class)).m27772kk(), c9421c5);
        }
        if (C7019kk.m27469x1(c7185jd, C7182dy.class)) {
            C7182dy c7182dy = (C7182dy) c7185jd;
            if (c9421c5 != null) {
                if (c7182dy.equals(C7182dy.f19335af)) {
                    C7182dy c7182dy2 = C7182dy.f19648u1;
                    if (!c9421c5.m46103x1(c7182dy2)) {
                        if (c7182dy.equals(C7182dy.f19650u5)) {
                            c7182dy2 = C7182dy.f19723yn;
                            if (!c9421c5.m46103x1(c7182dy2)) {
                                if (c7182dy.equals(C7182dy.f19693x3)) {
                                    c7182dy2 = C7182dy.f19719yg;
                                    if (!c9421c5.m46103x1(c7182dy2)) {
                                        c7182dy2 = null;
                                    }
                                }
                            }
                        }
                    }
                    if (c9421c5.m46103x1(c7182dy2) && !z) {
                        return c9421c5.m46096k4().get_Item(c7182dy2.m27766k4());
                    }
                }
            }
            if (c7182dy == C7182dy.f19335af) {
                return C5201dy.f14206k4;
            }
            if (c7182dy == C7182dy.f19650u5) {
                return C5202fa.f14208k4;
            }
            if (c7182dy == C7182dy.f19693x3) {
                return C5204jd.f14210k4;
            }
            if (c7182dy == C7182dy.f19507l6) {
                return new C1576x1((C7187kk) c9421c5.mo8461c5());
            }
            if (c9421c5 == null) {
                throw new ArgumentException(C14113y2.m67408k4("Unknown color space: ", c7182dy.m27766k4()));
            }
            if (c9421c5.m46103x1(c7182dy)) {
                return c9421c5.m46096k4().get_Item(c7182dy.m27766k4());
            }
            throw new ArgumentException(C14113y2.m67408k4("Missing color space: ", c7182dy.m27766k4()));
        }
        if (!C7019kk.m27469x1(c7185jd, C7186k4.class)) {
            if (C7019kk.m27469x1(c7185jd, C7187kk.class)) {
                C7187kk c7187kk = (C7187kk) c7185jd;
                C7182dy c7182dy3 = C7182dy.f19487jw;
                if (c7187kk.m27805k4(c7182dy3)) {
                    return m22204k4(c7187kk.mo27768h4(c7182dy3), c9421c5, z);
                }
            }
            throw new ArgumentException("Expected a name or array but got: " + c7185jd);
        }
        C7186k4 c7186k4 = (C7186k4) c7185jd;
        if (c7186k4.m27778k4() == 0) {
            throw new ArgumentException("Colorspace array is empty");
        }
        C7185jd c7185jdM27787x1 = c7186k4.m27787x1(0);
        if (!C7019kk.m27469x1(c7185jdM27787x1, C7182dy.class)) {
            throw new ArgumentException("First element in colorspace array must be a name");
        }
        C7182dy c7182dy4 = (C7182dy) c7185jdM27787x1;
        if (c7182dy4 == C7182dy.f19633t6) {
            return new C5212x1(c7186k4);
        }
        if (c7182dy4 == C7182dy.f19710xw) {
            return new C5206kk(c7186k4);
        }
        if (c7182dy4 == C7182dy.f19628sq) {
            return new C5199ck(c7186k4);
        }
        if (c7182dy4 == C7182dy.f19732z6) {
            return new C5214yj(c7186k4, c9421c5);
        }
        if (c7182dy4 == C7182dy.f19583pr) {
            return new C5213x6(c7186k4);
        }
        if (c7182dy4 == C7182dy.f19707xt) {
            return C5211up.m22227k4(c7186k4, c9421c5);
        }
        if (c7182dy4 == C7182dy.f19404eg) {
            return new C5207ks(c7186k4);
        }
        if (c7182dy4 == C7182dy.f19507l6) {
            return c7186k4.m27778k4() == 1 ? new C1576x1((C7187kk) c9421c5.mo8461c5()) : new C1576x1((C7187kk) c9421c5.mo8461c5(), m22202k4(c7186k4.m27785kk(1)));
        }
        if (c7182dy4 == C7182dy.f19335af || c7182dy4 == C7182dy.f19650u5 || c7182dy4 == C7182dy.f19693x3) {
            return m22204k4(c7182dy4, c9421c5, z);
        }
        throw new ArgumentException("Invalid color space kind: " + c7182dy4);
    }
}
