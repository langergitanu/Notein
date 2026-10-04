package o00O00o;

import Oooo0oo.AbstractC21138OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o00O00o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24810OooO0oO<T> extends AbstractC21138OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f84146OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f84147OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final EnumC24811OooO0oo f84148OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C24806OooO00o f84149OooO0Oo;

    /* JADX WARN: Multi-variable type inference failed */
    public C24810OooO0oO(Object value, EnumC24811OooO0oo verificationMode, C24806OooO00o c24806OooO00o) {
        OooOOO0.OooO0oO(value, "value");
        OooOOO0.OooO0oO(verificationMode, "verificationMode");
        this.f84146OooO00o = value;
        this.f84147OooO0O0 = "OooO00o";
        this.f84148OooO0OO = verificationMode;
        this.f84149OooO0Oo = c24806OooO00o;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final T Oooo0o() {
        return this.f84146OooO00o;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final AbstractC21138OooO0oo Oooooo0(String str, InterfaceC32507OooOO0o<? super T, Boolean> condition) {
        OooOOO0.OooO0oO(condition, "condition");
        T t = this.f84146OooO00o;
        return condition.invoke(t).booleanValue() ? this : new OooO0o(t, this.f84147OooO0O0, str, this.f84149OooO0Oo, this.f84148OooO0OO);
    }
}
