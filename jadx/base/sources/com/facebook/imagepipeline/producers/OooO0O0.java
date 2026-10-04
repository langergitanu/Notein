package com.facebook.imagepipeline.producers;

import o00o0o00.C25438OooO00o;
import o00o0o00.C25439OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OooO0O0<T> implements OooO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f67281OooO00o = false;

    public static boolean OooO0Oo(int i) {
        return (i & 1) == 1;
    }

    public static boolean OooO0o0(int i) {
        return !OooO0Oo(i);
    }

    public static boolean OooOO0O(int i, int i2) {
        return (i & i2) == i2;
    }

    public abstract void OooO(float f);

    @Override // com.facebook.imagepipeline.producers.OooO
    public final synchronized void OooO00o(int i, Object obj) {
        if (this.f67281OooO00o) {
            return;
        }
        this.f67281OooO00o = OooO0Oo(i);
        try {
            OooO0oo(i, obj);
        } catch (Exception e) {
            OooOO0(e);
        }
    }

    @Override // com.facebook.imagepipeline.producers.OooO
    public final synchronized void OooO0O0() {
        if (this.f67281OooO00o) {
            return;
        }
        this.f67281OooO00o = true;
        try {
            OooO0o();
        } catch (Exception e) {
            OooOO0(e);
        }
    }

    @Override // com.facebook.imagepipeline.producers.OooO
    public final synchronized void OooO0OO(float f) {
        if (this.f67281OooO00o) {
            return;
        }
        try {
            OooO(f);
        } catch (Exception e) {
            OooOO0(e);
        }
    }

    public abstract void OooO0o();

    public abstract void OooO0oO(Throwable th);

    public abstract void OooO0oo(int i, Object obj);

    public final void OooOO0(Exception exc) {
        Class<?> cls = getClass();
        if (C25438OooO00o.f86720OooO00o.OooO00o(6)) {
            C25439OooO0O0.OooO0OO(6, cls.getSimpleName(), "unhandled exception", exc);
        }
    }

    @Override // com.facebook.imagepipeline.producers.OooO
    public final synchronized void onFailure(Throwable th) {
        if (this.f67281OooO00o) {
            return;
        }
        this.f67281OooO00o = true;
        try {
            OooO0oO(th);
        } catch (Exception e) {
            OooOO0(e);
        }
    }
}
