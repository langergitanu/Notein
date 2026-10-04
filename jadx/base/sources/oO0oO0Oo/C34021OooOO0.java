package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34021OooOO0 extends IOException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final IllegalArgumentException f122328OooOo0o;

    public C34021OooOO0(String str, IllegalArgumentException illegalArgumentException) {
        super(str);
        this.f122328OooOo0o = illegalArgumentException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f122328OooOo0o;
    }
}
