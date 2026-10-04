package com.miui.penengine.p597f;

import android.content.Context;
import com.miui.penengine.facade.algorithm.JNIPathEstimateInterface;
import com.miui.penengine.p594c.C18759b;
import com.miui.penengine.p595d.C18763c;
import o00OoOoo.C25071OooO00o;

/* JADX INFO: renamed from: com.miui.penengine.f.i */
/* JADX INFO: loaded from: classes9.dex */
public class C18784i {

    /* JADX INFO: renamed from: b */
    public static final String f57338b = "i";

    /* JADX INFO: renamed from: a */
    public final InterfaceC18778c f57339a;

    public C18784i(Context context) {
        this(new C18785j(context));
    }

    /* JADX INFO: renamed from: a */
    public void m80436a(C18763c c18763c) {
        if (c18763c == null) {
            return;
        }
        try {
            this.f57339a.mo80387a(c18763c);
        } catch (Exception e) {
            C25071OooO00o.OooO0O0(e, "addPoint error ", f57338b);
        }
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC18778c m80437b() {
        return this.f57339a;
    }

    /* JADX INFO: renamed from: c */
    public C18781f m80439c() {
        C18781f[] c18781fArrM80440d = m80440d();
        if (c18781fArrM80440d != null) {
            return c18781fArrM80440d[c18781fArrM80440d.length - 1];
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public C18781f[] m80440d() {
        try {
            return this.f57339a.mo80388a();
        } catch (Exception e) {
            C25071OooO00o.OooO0O0(e, "getPredictPoints error ", f57338b);
            return null;
        }
    }

    public C18784i(InterfaceC18778c interfaceC18778c) {
        this.f57339a = interfaceC18778c;
        C18759b.m80277c(f57338b, "Use " + interfaceC18778c.getClass().getSimpleName() + ", version " + interfaceC18778c.mo80389b());
    }

    /* JADX INFO: renamed from: b */
    public void m80438b(long j) {
        this.f57339a.mo80386a(j);
    }

    /* JADX INFO: renamed from: a */
    public void m80433a() {
        JNIPathEstimateInterface.destroy();
    }

    /* JADX INFO: renamed from: a */
    public void m80435a(long j) {
        this.f57339a.mo80391b(j);
    }

    /* JADX INFO: renamed from: a */
    public void m80434a(int i) {
        this.f57339a.mo80390b(i);
    }
}
