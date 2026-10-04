package io.ktor.utils.p616io.internal;

import io.ktor.utils.p616io.o00Oo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0O0 f80801OooO0O0 = new OooO0O0(null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Throwable f80802OooO00o;

    public OooO0O0(Throwable th) {
        this.f80802OooO00o = th;
    }

    public final Throwable OooO00o() {
        Throwable th = this.f80802OooO00o;
        return th == null ? new o00Oo0("The channel was closed") : th;
    }

    public final String toString() {
        return "Closed[" + OooO00o() + ']';
    }
}
