package com.aspose.slides.internal.p104ec;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.C3125bv;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p356qb.C9820h4;
import com.aspose.slides.internal.p505xn.C12555c5;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.tq */
/* JADX INFO: loaded from: classes3.dex */
public class C3644tq {

    /* JADX INFO: renamed from: k4 */
    private final int f10107k4;

    /* JADX INFO: renamed from: x1 */
    private C3639s7 f10108x1;

    public C3644tq(int i, String str) {
        this.f10107k4 = i;
        C3639s7 c3639s7 = new C3639s7();
        this.f10108x1 = c3639s7;
        c3639s7.m14791k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final C3639s7 m14804k4() {
        return this.f10108x1;
    }

    public C3644tq(C9820h4 c9820h4, int i) {
        if (c9820h4 == null) {
            throw new ArgumentNullException();
        }
        this.f10107k4 = i;
        this.f10108x1 = new C3639s7();
        C3144um c3144um = new C3144um(C3624kk.m14768k4(c9820h4.m48413x1(), i));
        try {
            this.f10108x1.m14790k4(c3144um);
        } finally {
            c3144um.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14805k4(C9820h4 c9820h4) {
        C3125bv c3125bv = new C3125bv();
        try {
            this.f10108x1.m14789k4(c3125bv);
            if (c9820h4.m48409k4(C12555c5.m58552k4(this.f10107k4).mo26677to(c3125bv.toString()))) {
            } else {
                throw new C3632nv("Could not write project properties");
            }
        } finally {
            c3125bv.dispose();
        }
    }
}
