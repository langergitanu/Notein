package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p356qb.C9820h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.gf */
/* JADX INFO: loaded from: classes3.dex */
class C3613gf {
    public C3613gf() {
    }

    /* JADX INFO: renamed from: k4 */
    private void m14735k4(C3134k4 c3134k4) {
        if (C7019kk.m27457kk(Integer.valueOf(c3134k4.m13382u4()), 8) != 25036) {
            throw new C3620j5();
        }
        c3134k4.m13382u4();
        if (C7019kk.m27462to(Byte.valueOf(c3134k4.m13387yj()), 6) != 0) {
            throw new C3620j5();
        }
        c3134k4.m13382u4();
        c3134k4.m13372dy(C7019kk.m27462to(Long.valueOf(c3134k4.m13371ck().getLength() - 7), 11));
    }

    public C3613gf(C9820h4 c9820h4) {
        C3152yj c3152yj = new C3152yj(c9820h4.m48413x1());
        try {
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            try {
                m14735k4(c3134k4);
            } finally {
                c3134k4.dispose();
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m14736k4(C9820h4 c9820h4) {
        C3152yj c3152yj = new C3152yj();
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            try {
                c3149x1.m13446k4(C7019kk.m27457kk((Object) 25036, 9));
                c3149x1.m13446k4(C7019kk.m27457kk((Object) 65535, 9));
                c3149x1.m13443k4(C7019kk.m27442k4((Object) 0, 9));
                c3149x1.m13446k4(C7019kk.m27457kk((Object) 0, 9));
                c9820h4.m48409k4(c3152yj.toArray());
            } finally {
                c3149x1.dispose();
            }
        } finally {
            c3152yj.dispose();
        }
    }
}
