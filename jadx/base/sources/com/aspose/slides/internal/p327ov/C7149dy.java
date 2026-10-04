package com.aspose.slides.internal.p327ov;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p067cu.C2629du;
import com.aspose.slides.internal.p067cu.C2631kk;
import com.aspose.slides.internal.p180ib.C4804dy;
import com.aspose.slides.internal.p327ov.InterfaceC7155to;
import com.aspose.slides.internal.p472w8.C11898h4;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.ov.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C7149dy {
    /* JADX INFO: renamed from: kk */
    private InterfaceC7155to.k4 m27725kk(C4804dy c4804dy, C2631kk c2631kk) {
        C11898h4 c11898h4M56913h4;
        C2631kk c2631kkM12019du = c2631kk.m12019du();
        if (c4804dy.m19879k4().m56934up() == 255) {
            try {
                c11898h4M56913h4 = c4804dy.m19879k4().m56913h4();
            } catch (ArgumentException unused) {
                c11898h4M56913h4 = null;
            }
        } else {
            c11898h4M56913h4 = null;
        }
        InterfaceC7155to.k4 k4VarM27723k4 = m27723k4(c4804dy, c4804dy.m19879k4().m56934up(), c11898h4M56913h4, c2631kkM12019du);
        k4VarM27723k4.f19298k4 = k4VarM27723k4.f19298k4.m12019du();
        C12025x6 c12025x6 = k4VarM27723k4.f19300to;
        if (c12025x6 != null) {
            c12025x6.m56891k4(-c12025x6.m56897x1());
            C12025x6 c12025x62 = k4VarM27723k4.f19300to;
            c12025x62.m56898x1(-c12025x62.m56895kk());
        }
        return k4VarM27723k4;
    }

    /* JADX INFO: renamed from: x1 */
    private InterfaceC7155to.k4 m27726x1(C4804dy c4804dy, C2631kk c2631kk) {
        C11898h4 c11898h4M56929m9;
        if (c4804dy.m19879k4().m56912fa() == 255) {
            try {
                c11898h4M56929m9 = c4804dy.m19879k4().m56929m9();
            } catch (ArgumentException unused) {
                c11898h4M56929m9 = null;
            }
        } else {
            c11898h4M56929m9 = null;
        }
        return m27723k4(c4804dy, c4804dy.m19879k4().m56912fa(), c11898h4M56929m9, c2631kk);
    }

    /* JADX INFO: renamed from: k4 */
    public C2629du m27727k4(C4804dy c4804dy, C2631kk c2631kk) {
        C2629du c2629du = new C2629du();
        InterfaceC7155to.k4 k4VarM27726x1 = m27726x1(c4804dy, c2631kk);
        c2629du.m12004k4(k4VarM27726x1.f19301x1);
        InterfaceC7155to.k4 k4VarM27725kk = m27725kk(c4804dy, k4VarM27726x1.f19298k4);
        c2629du.m12012x1(k4VarM27725kk.f19301x1);
        c2629du.m12003k4(k4VarM27725kk.f19298k4);
        c2629du.m12005k4(k4VarM27726x1.f19299kk);
        c2629du.m12013x1(k4VarM27726x1.f19300to);
        c2629du.m12007kk(k4VarM27725kk.f19299kk);
        c2629du.m12010to(k4VarM27725kk.f19300to);
        return c2629du;
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC7155to.k4 m27723k4(C4804dy c4804dy, int i, C11898h4 c11898h4, C2631kk c2631kk) {
        InterfaceC7155to interfaceC7155toM27724k4 = m27724k4(c4804dy, i, c11898h4);
        if (interfaceC7155toM27724k4 != null) {
            return interfaceC7155toM27724k4.mo27702k4(c2631kk);
        }
        InterfaceC7155to.k4 k4Var = new InterfaceC7155to.k4();
        k4Var.f19298k4 = c2631kk;
        return k4Var;
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC7155to m27724k4(C4804dy c4804dy, int i, C11898h4 c11898h4) {
        if (i == 20 || i == 19 || i == 18 || i == 17) {
            return new C7146c5(c4804dy, i);
        }
        if (i != 255 || c11898h4 == null) {
            return null;
        }
        return c11898h4.m55597ck() ? new C7147ck(c4804dy, c11898h4) : new C7154m9(c4804dy, c11898h4);
    }
}
