package oO0ooO;

import java.io.IOException;

/* JADX INFO: renamed from: oO0ooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34252OooO00o extends IOException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Exception f123003OooOo0o;

    public C34252OooO00o(String str, Exception exc) {
        super(str);
        this.f123003OooOo0o = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f123003OooOo0o;
    }
}
