package com.aspose.slides.internal.p104ec;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p356qb.C9820h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.ck */
/* JADX INFO: loaded from: classes3.dex */
public class C3604ck {

    /* JADX INFO: renamed from: k4 */
    private C3659xk f10008k4;

    /* JADX INFO: renamed from: kk */
    private C3600bz f10009kk;

    /* JADX INFO: renamed from: x1 */
    private C3612g8 f10010x1;

    public C3604ck(int i, String str) {
        this.f10008k4 = new C3659xk(i, str);
        this.f10010x1 = new C3612g8(C7019kk.m27462to(Integer.valueOf(i), 8));
        this.f10009kk = new C3600bz(C7019kk.m27462to(Integer.valueOf(i), 8));
    }

    /* JADX INFO: renamed from: k4 */
    public C3659xk m14706k4() {
        return this.f10008k4;
    }

    /* JADX INFO: renamed from: kk */
    public C3600bz m14710kk() {
        return this.f10009kk;
    }

    /* JADX INFO: renamed from: x1 */
    public C3612g8 m14711x1() {
        return this.f10010x1;
    }

    public C3604ck(C9820h4 c9820h4) {
        if (c9820h4 == null) {
            throw new ArgumentNullException();
        }
        this.f10008k4 = new C3659xk();
        C3152yj c3152yj = new C3152yj(C3628m2.m14773k4(c9820h4.m48413x1()));
        try {
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            try {
                m14704k4(c3134k4);
            } finally {
                c3134k4.dispose();
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C3664yj m14707k4(String str) {
        C3664yj c3664yj = new C3664yj(C7019kk.m27462to(Integer.valueOf(this.f10008k4.m14839k4().m14815x1()), 8), str);
        this.f10009kk.m14700x1().addItem(c3664yj);
        return c3664yj;
    }

    /* JADX INFO: renamed from: x1 */
    public void m14712x1(String str) {
        this.f10009kk.m14699k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    private void m14704k4(C3134k4 c3134k4) {
        this.f10008k4.mo14692k4(c3134k4);
        C3612g8 c3612g8 = new C3612g8(C7019kk.m27462to(Integer.valueOf(this.f10008k4.m14839k4().m14815x1()), 8));
        this.f10010x1 = c3612g8;
        c3612g8.mo14692k4(c3134k4);
        C3600bz c3600bz = new C3600bz(C7019kk.m27462to(Integer.valueOf(this.f10008k4.m14839k4().m14815x1()), 8));
        this.f10009kk = c3600bz;
        c3600bz.mo14692k4(c3134k4);
        if (C7019kk.m27457kk(Integer.valueOf(c3134k4.m13382u4()), 8) != 16) {
            throw new C3620j5();
        }
        if (C7019kk.m27435du(Long.valueOf(c3134k4.m13384uz()), 10) != 0) {
            throw new C3620j5();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m14705k4(C3149x1 c3149x1) {
        this.f10008k4.mo14697k4(c3149x1);
        this.f10010x1.mo14697k4(c3149x1);
        this.f10009kk.mo14697k4(c3149x1);
        c3149x1.m13446k4(C7019kk.m27457kk((Object) 16, 9));
        c3149x1.m13447k4(C7019kk.m27435du((Object) 0, 9));
    }

    /* JADX INFO: renamed from: k4 */
    public void m14708k4(C3653w6 c3653w6) {
        this.f10010x1.m14734k4().addItem(c3653w6);
    }

    /* JADX INFO: renamed from: k4 */
    public void m14709k4(C9820h4 c9820h4) {
        C3152yj c3152yj = new C3152yj();
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            try {
                m14705k4(c3149x1);
                c9820h4.m48409k4(C3628m2.m14776x1(c3152yj.toArray()));
            } finally {
                c3149x1.dispose();
            }
        } finally {
            c3152yj.dispose();
        }
    }
}
