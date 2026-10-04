package o0Oo0oo;

import oO0O000o.InterfaceC32508OooOOOo;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f100695OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32508OooOOOo<T, T, T> f100696OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public OooOo(String str, InterfaceC32508OooOOOo<? super T, ? super T, ? extends T> mergePolicy) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(mergePolicy, "mergePolicy");
        this.f100695OooO00o = str;
        this.f100696OooO0O0 = mergePolicy;
    }

    public final void OooO00o(InterfaceC28404OooOoO0 thisRef, InterfaceC34602OooOO0o<?> property, T t) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(thisRef, "thisRef");
        kotlin.jvm.internal.OooOOO0.OooO0oO(property, "property");
        thisRef.OooO0O0(this, t);
    }

    public final String toString() {
        return "SemanticsPropertyKey: " + this.f100695OooO00o;
    }
}
