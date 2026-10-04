package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p407st.C10357al;
import com.aspose.slides.internal.p407st.C10409du;
import com.aspose.slides.internal.p407st.C10486iy;
import com.aspose.slides.internal.p407st.C10562nk;
import com.aspose.slides.internal.p407st.C10573oa;
import com.aspose.slides.internal.p407st.C10721xv;
import com.aspose.slides.internal.p407st.C10742z2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class q6e {
    /* JADX INFO: renamed from: k4 */
    private static byte m69434k4(long j) {
        int i = (int) j;
        if (i == 0) {
            return (byte) 0;
        }
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                return (byte) -1;
            }
        }
        return b;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m69440x1(com.aspose.slides.internal.p332p7.zv9 zv9Var, C10721xv c10721xv) {
        if (zv9Var == null) {
            throw new ArgumentNullException();
        }
        if (c10721xv == null) {
            throw new ArgumentNullException();
        }
        C10573oa c10573oa = new C10573oa();
        c10721xv.m50513yj().addItem(c10573oa);
        if (zv9Var.m45966k4() != -1) {
            c10573oa.m51422k4(true);
            c10573oa.m51421k4(m69435k4(zv9Var.m45966k4()) & 65535);
        } else {
            c10573oa.m51422k4(false);
        }
        if (C14113y2.m67411k4(zv9Var.m45970x1())) {
            c10573oa.m51425x1(false);
        } else {
            c10573oa.m51425x1(true);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m69435k4(byte b) {
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69436k4(com.aspose.slides.internal.p332p7.zv9 zv9Var, C10357al c10357al, m4c m4cVar) {
        if (c10357al == null || c10357al.m50708m9() == null) {
            throw new InvalidOperationException();
        }
        C10721xv c10721xvM50708m9 = c10357al.m50708m9();
        l1y.m64242k4(zv9Var.m45969kk(), c10357al, c10721xvM50708m9.m52016du(), m4cVar);
        m69439k4(zv9Var, c10721xvM50708m9);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69437k4(com.aspose.slides.internal.p332p7.zv9 zv9Var, C10409du c10409du, gi8 gi8Var) {
        if (zv9Var == null) {
            return;
        }
        if (c10409du == null) {
            throw new InvalidOperationException();
        }
        C10721xv c10721xv = new C10721xv();
        c10409du.m50513yj().addItem(c10721xv);
        m69440x1(zv9Var, c10721xv);
        if (c10721xv.m52018x1().m51423kk()) {
            C10742z2 c10742z2 = new C10742z2(zv9Var.m45970x1());
            c10742z2.m51409um().m51920k4((short) 1);
            c10721xv.m50513yj().addItem(c10742z2);
        }
        C10486iy c10486iy = new C10486iy();
        c10721xv.m50513yj().addItem(c10486iy);
        ubb.m71612k4(zv9Var.m45969kk(), c10486iy, gi8Var);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69438k4(com.aspose.slides.internal.p332p7.zv9 zv9Var, C10562nk c10562nk, m4c m4cVar) {
        if (c10562nk == null || c10562nk.m50708m9() == null) {
            throw new InvalidOperationException();
        }
        C10721xv c10721xvM50708m9 = c10562nk.m50708m9();
        l1y.m64245k4(zv9Var.m45969kk(), c10562nk, c10721xvM50708m9.m52016du(), m4cVar);
        m69439k4(zv9Var, c10721xvM50708m9);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69439k4(com.aspose.slides.internal.p332p7.zv9 zv9Var, C10721xv c10721xv) {
        if (c10721xv == null) {
            throw new InvalidOperationException();
        }
        if (c10721xv.m52018x1().m51426x1()) {
            zv9Var.m45967k4(m69434k4(c10721xv.m52018x1().m51424to()));
        }
        zv9Var.m45968k4(c10721xv.m52017to() == null ? null : c10721xv.m52017to().m52123du());
    }
}
