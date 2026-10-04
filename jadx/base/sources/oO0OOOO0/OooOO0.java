package oO0OOOO0;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 extends IOException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC32958OooOOOo f119095OooOo0o;

    public OooOO0(String str) {
        super(str);
        this.f119095OooOo0o = null;
    }

    public static OooOO0 OooO00o() {
        return new OooOO0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
