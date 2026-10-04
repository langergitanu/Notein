package oO000oO;

import java.net.SocketTimeoutException;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oO000oO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32104OooO0O0 extends SocketTimeoutException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Throwable f115084OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32104OooO0O0(String message, Throwable th) {
        super(message);
        OooOOO0.OooO0oO(message, "message");
        this.f115084OooOo0o = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f115084OooOo0o;
    }
}
