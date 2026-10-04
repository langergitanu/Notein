package ooOOOOOo;

import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: ooOOOOOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35053OooO00o extends IllegalStateException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f125904OooOo0o;

    public C35053OooO00o(OooO0OO call) {
        OooOOO0.OooO0oO(call, "call");
        this.f125904OooOo0o = "Response already received: " + call;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f125904OooOo0o;
    }
}
