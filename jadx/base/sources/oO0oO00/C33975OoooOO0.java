package oO0oO00;

import java.util.List;
import o0000OOo.C24217OooO0O0;
import oOoo0.C34607OooOOo;
import oOoo0.InterfaceC34595OooO0Oo;
import oOoo0.InterfaceC34597OooO0o0;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: renamed from: oO0oO00.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33975OoooOO0 implements InterfaceC34606OooOOOo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34606OooOOOo f122199OooOo0o;

    public C33975OoooOO0(InterfaceC34606OooOOOo origin) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(origin, "origin");
        this.f122199OooOo0o = origin;
    }

    @Override // oOoo0.InterfaceC34606OooOOOo
    public final InterfaceC34597OooO0o0 OooO0O0() {
        return this.f122199OooOo0o.OooO0O0();
    }

    @Override // oOoo0.InterfaceC34606OooOOOo
    public final boolean OooO0oO() {
        return this.f122199OooOo0o.OooO0oO();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C33975OoooOO0 c33975OoooOO0 = obj instanceof C33975OoooOO0 ? (C33975OoooOO0) obj : null;
        InterfaceC34606OooOOOo interfaceC34606OooOOOo = c33975OoooOO0 != null ? c33975OoooOO0.f122199OooOo0o : null;
        InterfaceC34606OooOOOo interfaceC34606OooOOOo2 = this.f122199OooOo0o;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC34606OooOOOo2, interfaceC34606OooOOOo)) {
            return false;
        }
        InterfaceC34597OooO0o0 interfaceC34597OooO0o0OooO0O0 = interfaceC34606OooOOOo2.OooO0O0();
        if (!(interfaceC34597OooO0o0OooO0O0 instanceof InterfaceC34595OooO0Oo)) {
            return false;
        }
        InterfaceC34606OooOOOo interfaceC34606OooOOOo3 = obj instanceof InterfaceC34606OooOOOo ? (InterfaceC34606OooOOOo) obj : null;
        InterfaceC34597OooO0o0 interfaceC34597OooO0o0OooO0O02 = interfaceC34606OooOOOo3 != null ? interfaceC34606OooOOOo3.OooO0O0() : null;
        if (interfaceC34597OooO0o0OooO0O02 == null || !(interfaceC34597OooO0o0OooO0O02 instanceof InterfaceC34595OooO0Oo)) {
            return false;
        }
        return C24217OooO0O0.OooO0Oo((InterfaceC34595OooO0Oo) interfaceC34597OooO0o0OooO0O0).equals(C24217OooO0O0.OooO0Oo((InterfaceC34595OooO0Oo) interfaceC34597OooO0o0OooO0O02));
    }

    @Override // oOoo0.InterfaceC34606OooOOOo
    public final List<C34607OooOOo> getArguments() {
        return this.f122199OooOo0o.getArguments();
    }

    public final int hashCode() {
        return this.f122199OooOo0o.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f122199OooOo0o;
    }
}
