package oO0oOooO;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: oO0oOooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C34218OooO00o extends IOException {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final GeneralSecurityException f122926OooOo0o;

    public C34218OooO00o(GeneralSecurityException generalSecurityException) {
        super("Error finalising cipher");
        this.f122926OooOo0o = generalSecurityException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f122926OooOo0o;
    }
}
