package oO0O0oO0;

import oO0O0ooO.InterfaceC32827OooOOO0;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: renamed from: oO0O0oO0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32749OooOo0o extends AbstractC32731OooO0o implements InterfaceC32827OooOOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Enum<?> f117693OooO0O0;

    public C32749OooOo0o(C33479OooO0o c33479OooO0o, Enum<?> r2) {
        super(c33479OooO0o);
        this.f117693OooO0O0 = r2;
    }

    @Override // oO0O0ooO.InterfaceC32827OooOOO0
    public final C33476OooO0O0 OooO0Oo() {
        Class<?> enumClass = this.f117693OooO0O0.getClass();
        if (!enumClass.isEnum()) {
            enumClass = enumClass.getEnclosingClass();
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(enumClass, "enumClass");
        return C32730OooO0Oo.OooO00o(enumClass);
    }

    @Override // oO0O0ooO.InterfaceC32827OooOOO0
    public final C33479OooO0o getEntryName() {
        return C33479OooO0o.OooO0o0(this.f117693OooO0O0.name());
    }
}
