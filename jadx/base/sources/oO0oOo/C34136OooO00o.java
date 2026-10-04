package oO0oOo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34136OooO00o extends IOException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final RuntimeException f122675OooOo0o;

    public C34136OooO00o(String str, RuntimeException runtimeException) {
        super(str);
        this.f122675OooOo0o = runtimeException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f122675OooOo0o;
    }
}
