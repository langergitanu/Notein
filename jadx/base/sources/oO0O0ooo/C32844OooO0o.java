package oO0O0ooo;

import java.util.Iterator;
import oO0OooO0.C33477OooO0OO;
import oOo000Oo.C34435OooOoO0;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0ooo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32844OooO0o implements InterfaceC34588OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33477OooO0OO f117897OooOo0o;

    public C32844OooO0o(C33477OooO0OO fqNameToMatch) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqNameToMatch, "fqNameToMatch");
        this.f117897OooOo0o = fqNameToMatch;
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final oOo0oooO.OooO0OO OooOOO0(C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        if (fqName.equals(this.f117897OooOo0o)) {
            return C32845OooO0o0.f117898OooO00o;
        }
        return null;
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final boolean Oooo000(C33477OooO0OO c33477OooO0OO) {
        return InterfaceC34588OooO0oO.OooO0O0.OooO0O0(this, c33477OooO0OO);
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<oOo0oooO.OooO0OO> iterator() {
        return C34435OooOoO0.f123454OooOo0o;
    }
}
