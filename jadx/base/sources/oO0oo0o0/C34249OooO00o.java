package oO0oo0o0;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: oO0oo0o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34249OooO00o implements PrivilegedAction {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f123001OooO00o;

    public C34249OooO00o(String str) {
        this.f123001OooO00o = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        try {
            return Class.forName(this.f123001OooO00o);
        } catch (Exception unused) {
            return null;
        }
    }
}
