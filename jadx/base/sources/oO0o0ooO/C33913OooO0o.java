package oO0o0ooO;

import OooOoOO.C20519OooO0Oo;
import o0OoOOOo.C29103OooOO0o;
import oO00ooO.EnumC32441OooOO0O;
import oO0o.InterfaceC33531OooO0o0;
import oO0oO00.AbstractC33934OooO0O0;
import oOo000Oo.C34434OooOoO;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: oO0o0ooO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33913OooO0o<T> extends AbstractC33934OooO0O0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC34595OooO0Oo<T> f122124OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34434OooOoO f122125OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f122126OooO0OO;

    public C33913OooO0o(InterfaceC34595OooO0Oo<T> baseClass) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(baseClass, "baseClass");
        this.f122124OooO00o = baseClass;
        this.f122125OooO0O0 = C34434OooOoO.f123453OooOo0o;
        this.f122126OooO0OO = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, new C29103OooOO0o(this, 1));
    }

    @Override // oO0oO00.AbstractC33934OooO0O0
    public final InterfaceC34595OooO0Oo<T> OooO00o() {
        return this.f122124OooO00o;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return (InterfaceC33531OooO0o0) this.f122126OooO0OO.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f122124OooO00o + ')';
    }
}
