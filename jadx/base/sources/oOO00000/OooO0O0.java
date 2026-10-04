package oOO00000;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements PrivilegedAction {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f123201OooO00o;

    public OooO0O0(String str) {
        this.f123201OooO00o = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        try {
            return Class.forName(this.f123201OooO00o);
        } catch (Exception unused) {
            return null;
        }
    }
}
