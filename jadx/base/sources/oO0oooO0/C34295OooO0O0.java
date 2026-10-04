package oO0oooO0;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oooO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34295OooO0O0 extends IOException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final RuntimeException f123132OooOo0o;

    public C34295OooO0O0(String str, RuntimeException runtimeException) {
        super(str);
        this.f123132OooOo0o = runtimeException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f123132OooOo0o;
    }
}
