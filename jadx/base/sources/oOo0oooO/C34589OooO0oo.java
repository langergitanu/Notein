package oOo0oooO;

import java.util.Iterator;
import java.util.List;
import oO0OooO0.C33477OooO0OO;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oOo0oooO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34589OooO0oo implements InterfaceC34588OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final List<OooO0OO> f123920OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public C34589OooO0oo(List<? extends OooO0OO> list) {
        this.f123920OooOo0o = list;
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final OooO0OO OooOOO0(C33477OooO0OO c33477OooO0OO) {
        return InterfaceC34588OooO0oO.OooO0O0.OooO00o(this, c33477OooO0OO);
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final boolean Oooo000(C33477OooO0OO c33477OooO0OO) {
        return InterfaceC34588OooO0oO.OooO0O0.OooO0O0(this, c33477OooO0OO);
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final boolean isEmpty() {
        return this.f123920OooOo0o.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<OooO0OO> iterator() {
        return this.f123920OooOo0o.iterator();
    }

    public final String toString() {
        return this.f123920OooOo0o.toString();
    }
}
