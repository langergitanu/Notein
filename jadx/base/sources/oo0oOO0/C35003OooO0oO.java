package oo0oOO0;

import android.content.Context;
import o00oOOo.InterfaceC25590OooO00o;

/* JADX INFO: renamed from: oo0oOO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C35003OooO0oO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static C35003OooO0oO f125701OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C34997OooO00o f125702OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C34998OooO0O0 f125703OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C35002OooO0o0 f125704OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C35001OooO0o f125705OooO0Oo;

    public static synchronized C35003OooO0oO OooO00o(Context context, InterfaceC25590OooO00o interfaceC25590OooO00o) {
        try {
            if (f125701OooO0o0 == null) {
                C35003OooO0oO c35003OooO0oO = new C35003OooO0oO();
                Context applicationContext = context.getApplicationContext();
                c35003OooO0oO.f125702OooO00o = new C34997OooO00o(applicationContext, interfaceC25590OooO00o);
                c35003OooO0oO.f125703OooO0O0 = new C34998OooO0O0(applicationContext, interfaceC25590OooO00o);
                c35003OooO0oO.f125704OooO0OO = new C35002OooO0o0(applicationContext, interfaceC25590OooO00o);
                c35003OooO0oO.f125705OooO0Oo = new C35001OooO0o(applicationContext, interfaceC25590OooO00o);
                f125701OooO0o0 = c35003OooO0oO;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f125701OooO0o0;
    }
}
