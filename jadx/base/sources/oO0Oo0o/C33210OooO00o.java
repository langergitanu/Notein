package oO0Oo0o;

import kotlin.jvm.internal.OooOOO0;
import o0ooOO0.AbstractC31500OooO00o;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: renamed from: oO0Oo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33210OooO00o extends AbstractC31500OooO00o implements InterfaceC33213OooO0o0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC32596OooO0o0 f120176OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C33479OooO0o f120177OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33210OooO00o(InterfaceC32596OooO0o0 interfaceC32596OooO0o0, AbstractC33320OooOoo receiverType, C33479OooO0o c33479OooO0o) {
        super(receiverType, null);
        OooOOO0.OooO0oO(receiverType, "receiverType");
        this.f120176OooO0OO = interfaceC32596OooO0o0;
        this.f120177OooO0Oo = c33479OooO0o;
    }

    @Override // oO0Oo0o.InterfaceC33213OooO0o0
    public final C33479OooO0o OooO00o() {
        return this.f120177OooO0Oo;
    }

    public final String toString() {
        return getType() + ": Ctx { " + this.f120176OooO0OO + " }";
    }
}
