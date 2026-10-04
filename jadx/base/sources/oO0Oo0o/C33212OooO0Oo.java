package oO0Oo0o;

import kotlin.jvm.internal.OooOOO0;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;

/* JADX INFO: renamed from: oO0Oo0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33212OooO0Oo implements OooO0o, InterfaceC33215OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC32596OooO0o0 f120181OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32596OooO0o0 f120182OooO0O0;

    public C33212OooO0Oo(InterfaceC32596OooO0o0 classDescriptor) {
        OooOOO0.OooO0oO(classDescriptor, "classDescriptor");
        this.f120181OooO00o = classDescriptor;
        this.f120182OooO0O0 = classDescriptor;
    }

    @Override // oO0Oo0o.InterfaceC33215OooO0oo
    public final InterfaceC32596OooO0o0 OooO0oo() {
        return this.f120181OooO00o;
    }

    public final boolean equals(Object obj) {
        C33212OooO0Oo c33212OooO0Oo = obj instanceof C33212OooO0Oo ? (C33212OooO0Oo) obj : null;
        return OooOOO0.OooO0O0(this.f120181OooO00o, c33212OooO0Oo != null ? c33212OooO0Oo.f120181OooO00o : null);
    }

    @Override // oO0Oo0o.OooO0o
    public final AbstractC33320OooOoo getType() {
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOOO = this.f120181OooO00o.OooOOO();
        OooOOO0.OooO0o(abstractC33328Oooo0O0OooOOO, "classDescriptor.defaultType");
        return abstractC33328Oooo0O0OooOOO;
    }

    public final int hashCode() {
        return this.f120181OooO00o.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOOO = this.f120181OooO00o.OooOOO();
        OooOOO0.OooO0o(abstractC33328Oooo0O0OooOOO, "classDescriptor.defaultType");
        sb.append(abstractC33328Oooo0O0OooOOO);
        sb.append('}');
        return sb.toString();
    }
}
