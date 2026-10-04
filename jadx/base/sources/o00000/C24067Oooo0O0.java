package o00000;

import oo0o0Oo.C34680OooO0O0;
import oo0o0Oo.C34696OooOOoo;

/* JADX INFO: renamed from: o00000.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24067Oooo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f81092OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f81093OooO0O0 = 0;

    public static final C34680OooO0O0 OooO00o(Oooo0 oooo0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooo0, "<this>");
        C34680OooO0O0 c34680OooO0O0 = oooo0.f81083OooO00o;
        c34680OooO0O0.getClass();
        long j = oooo0.f81084OooO0O0;
        return c34680OooO0O0.subSequence(C34696OooOOoo.OooO0Oo(j), C34696OooOOoo.OooO0OO(j));
    }

    public static final C34680OooO0O0 OooO0O0(Oooo0 oooo0, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooo0, "<this>");
        long j = oooo0.f81084OooO0O0;
        int iOooO0OO = C34696OooOOoo.OooO0OO(j);
        int iOooO0OO2 = C34696OooOOoo.OooO0OO(j) + i;
        C34680OooO0O0 c34680OooO0O0 = oooo0.f81083OooO00o;
        return c34680OooO0O0.subSequence(iOooO0OO, Math.min(iOooO0OO2, c34680OooO0O0.f124887OooOo0o.length()));
    }

    public static final C34680OooO0O0 OooO0OO(Oooo0 oooo0, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooo0, "<this>");
        long j = oooo0.f81084OooO0O0;
        return oooo0.f81083OooO00o.subSequence(Math.max(0, C34696OooOOoo.OooO0Oo(j) - i), C34696OooOOoo.OooO0Oo(j));
    }
}
