package ooOOoOO0;

import oO0o.AbstractC33525OooO0OO;
import oO0o.AbstractC33526OooO0Oo;
import oO0o.AbstractC33534OooOO0o;
import oO0o.InterfaceC33531OooO0o0;
import oO0o.OooOOO0;
import oO0oO00o.C34005OooO00o;
import oOo00O0O.AbstractC34457OooO0OO;

/* JADX INFO: renamed from: ooOOoOO0.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35145Oooo0oo {
    public static final InterfaceC33531OooO0o0 OooO00o(InterfaceC33531OooO0o0 interfaceC33531OooO0o0, C34005OooO00o module) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC33531OooO0o0, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(module, "module");
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC33531OooO0o0.getKind(), AbstractC33534OooOO0o.OooO00o.f121130OooO00o)) {
            return interfaceC33531OooO0o0.isInline() ? OooO00o(interfaceC33531OooO0o0.OooO0Oo(0), module) : interfaceC33531OooO0o0;
        }
        if (com.android.billingclient.api.OooOO0.OooO0OO(interfaceC33531OooO0o0) == null) {
            return interfaceC33531OooO0o0;
        }
        module.f122298OooOo0o.getClass();
        return interfaceC33531OooO0o0;
    }

    public static final EnumC35144Oooo0oO OooO0O0(InterfaceC33531OooO0o0 desc, AbstractC34457OooO0OO abstractC34457OooO0OO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC34457OooO0OO, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(desc, "desc");
        AbstractC33534OooOO0o kind = desc.getKind();
        if (kind instanceof AbstractC33525OooO0OO) {
            return EnumC35144Oooo0oO.f126198OooOoo0;
        }
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(kind, OooOOO0.OooO0O0.f121133OooO00o)) {
            return EnumC35144Oooo0oO.f126194OooOoO;
        }
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(kind, OooOOO0.OooO0OO.f121134OooO00o)) {
            return EnumC35144Oooo0oO.f126195OooOoO0;
        }
        InterfaceC33531OooO0o0 interfaceC33531OooO0o0OooO00o = OooO00o(desc.OooO0Oo(0), abstractC34457OooO0OO.f123492OooO0O0);
        AbstractC33534OooOO0o kind2 = interfaceC33531OooO0o0OooO00o.getKind();
        if ((kind2 instanceof AbstractC33526OooO0Oo) || kotlin.jvm.internal.OooOOO0.OooO0O0(kind2, AbstractC33534OooOO0o.OooO0O0.f121131OooO00o)) {
            return EnumC35144Oooo0oO.f126196OooOoOO;
        }
        if (abstractC34457OooO0OO.f123491OooO00o.f123515OooO0Oo) {
            return EnumC35144Oooo0oO.f126194OooOoO;
        }
        throw OoooO0O.OooOo.OooO0OO(interfaceC33531OooO0o0OooO00o);
    }
}
