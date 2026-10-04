package oO0O0O0;

import java.lang.reflect.Type;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32625Oooo0o0;
import oO0O0OO.InterfaceC32629OoooO0;
import oO0O0OO.OooO0O0;

/* JADX INFO: renamed from: oO0O0O0.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32565OooOooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Type> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32561OooOoo f117028OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32565OooOooO(C32561OooOoo c32561OooOoo) {
        super(0);
        this.f117028OooOo0o = c32561OooOoo;
    }

    @Override // oO0O000o.OooO00o
    public final Type invoke() {
        C32561OooOoo c32561OooOoo = this.f117028OooOo0o;
        InterfaceC32625Oooo0o0 interfaceC32625Oooo0o0OooO = c32561OooOoo.OooO();
        boolean z = interfaceC32625Oooo0o0OooO instanceof InterfaceC32629OoooO0;
        AbstractC32538OooO0oO<?> abstractC32538OooO0oO = c32561OooOoo.f117008OooOo0o;
        if (!z || !kotlin.jvm.internal.OooOOO0.OooO0O0(C32585OoooOoo.OooO0oO(abstractC32538OooO0oO.OooOOO()), interfaceC32625Oooo0o0OooO) || abstractC32538OooO0oO.OooOOO().getKind() != OooO0O0.OooO00o.f117221OooOo) {
            return abstractC32538OooO0oO.OooOO0O().OooO00o().get(c32561OooOoo.f117007OooOo);
        }
        oO0O0OO.OooOO0O oooOO0OOooO0Oo = abstractC32538OooO0oO.OooOOO().OooO0Oo();
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooOO0OOooO0Oo, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class<?> clsOooOO0 = C32585OoooOoo.OooOO0((InterfaceC32596OooO0o0) oooOO0OOooO0Oo);
        if (clsOooOO0 != null) {
            return clsOooOO0;
        }
        throw new C32579OoooO0O("Cannot determine receiver Java type of inherited declaration: " + interfaceC32625Oooo0o0OooO);
    }
}
