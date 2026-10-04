package com.airbnb.lottie;

import java.util.Arrays;

/* JADX INFO: renamed from: com.airbnb.lottie.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22150OooOo0o<V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final V f66812OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Throwable f66813OooO0O0;

    public C22150OooOo0o(V v) {
        this.f66812OooO00o = v;
        this.f66813OooO0O0 = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22150OooOo0o)) {
            return false;
        }
        C22150OooOo0o c22150OooOo0o = (C22150OooOo0o) obj;
        V v = this.f66812OooO00o;
        if (v != null && v.equals(c22150OooOo0o.f66812OooO00o)) {
            return true;
        }
        Throwable th = this.f66813OooO0O0;
        if (th == null || c22150OooOo0o.f66813OooO0O0 == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f66812OooO00o, this.f66813OooO0O0});
    }

    public C22150OooOo0o(Throwable th) {
        this.f66813OooO0O0 = th;
        this.f66812OooO00o = null;
    }
}
