package o000000o;

import OooO0Oo.C20398OooO0O0;

/* JADX INFO: renamed from: o000000o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24084OooO0O0 implements InterfaceC24095OooOo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f81170OooO0O0;

    public C24084OooO0O0(int i) {
        this.f81170OooO0O0 = i;
    }

    @Override // o000000o.InterfaceC24095OooOo0
    public final C24093OooOOo0 OooO00o(C24093OooOOo0 fontWeight) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fontWeight, "fontWeight");
        int i = this.f81170OooO0O0;
        return (i == 0 || i == Integer.MAX_VALUE) ? fontWeight : new C24093OooOOo0(oO0O00oo.OooOO0.OooO0o(fontWeight.f81193OooOo0o + i, 1, 1000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24084OooO0O0) && this.f81170OooO0O0 == ((C24084OooO0O0) obj).f81170OooO0O0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f81170OooO0O0);
    }

    public final String toString() {
        return C20398OooO0O0.OooO00o(')', new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f81170OooO0O0);
    }
}
