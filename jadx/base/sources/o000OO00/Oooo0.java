package o000OO00;

import OooOo.C20481OooOOoo;
import Oooo0oO.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f82763OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f82764OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C20481OooOOoo<Oooo0> f82759OooO0OO = new C20481OooOOoo<>((Object) null);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Oooo0 f82760OooO0Oo = new Oooo0(0, "ANY");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Oooo0 f82762OooO0o0 = new Oooo0(1, "ACCUMULATE");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Oooo0 f82761OooO0o = new Oooo0(2, "DISCARD");

    public Oooo0(int i, String str) {
        this.f82763OooO00o = i;
        this.f82764OooO0O0 = str;
        C20481OooOOoo<Oooo0> c20481OooOOoo = f82759OooO0OO;
        if (c20481OooOOoo.OooO00o(i)) {
            throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate SelfOverlap value: ", ".").toString());
        }
        c20481OooOOoo.OooO0oO(i, this);
    }

    public final String toString() {
        return "SelfOverlap." + this.f82764OooO0O0;
    }
}
