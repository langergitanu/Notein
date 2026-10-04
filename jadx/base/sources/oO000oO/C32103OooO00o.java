package oO000oO;

import java.io.IOException;
import java.net.ConnectException;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oO000oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32103OooO00o extends ConnectException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final IOException f115083OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32103OooO00o(String message, IOException iOException) {
        super(message);
        OooOOO0.OooO0oO(message, "message");
        this.f115083OooOo0o = iOException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f115083OooOo0o;
    }
}
