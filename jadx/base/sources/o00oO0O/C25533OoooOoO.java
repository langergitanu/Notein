package o00oO0O;

import o0000Ooo.C24227OooO00o;
import oo000o.AbstractC34655Oooo0o;
import oo000o.InterfaceC34630OooOO0;
import oo000o.InterfaceC34641OooOo0O;

/* JADX INFO: renamed from: o00oO0O.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25533OoooOoO implements InterfaceC34641OooOo0O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final EnumC25535Ooooo00 f87106OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34630OooOO0 f87107OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final EnumC25536Ooooo0o f87108OooOoO0;

    public C25533OoooOoO(InterfaceC34630OooOO0 measurable, EnumC25535Ooooo00 enumC25535Ooooo00, EnumC25536Ooooo0o enumC25536Ooooo0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        this.f87107OooOo0o = measurable;
        this.f87106OooOo = enumC25535Ooooo00;
        this.f87108OooOoO0 = enumC25536Ooooo0o;
    }

    @Override // oo000o.InterfaceC34630OooOO0
    public final Object OooO0OO() {
        return this.f87107OooOo0o.OooO0OO();
    }

    @Override // oo000o.InterfaceC34630OooOO0
    public final int OooOOoo(int i) {
        return this.f87107OooOo0o.OooOOoo(i);
    }

    @Override // oo000o.InterfaceC34630OooOO0
    public final int Oooo00O(int i) {
        return this.f87107OooOo0o.Oooo00O(i);
    }

    @Override // oo000o.InterfaceC34630OooOO0
    public final int OoooO(int i) {
        return this.f87107OooOo0o.OoooO(i);
    }

    @Override // oo000o.InterfaceC34630OooOO0
    public final int OooooOO(int i) {
        return this.f87107OooOo0o.OooooOO(i);
    }

    @Override // oo000o.InterfaceC34641OooOo0O
    public final AbstractC34655Oooo0o o00ooo(long j) {
        EnumC25536Ooooo0o enumC25536Ooooo0o = EnumC25536Ooooo0o.f87113OooOo0o;
        EnumC25535Ooooo00 enumC25535Ooooo00 = EnumC25535Ooooo00.f87109OooOo;
        EnumC25535Ooooo00 enumC25535Ooooo002 = this.f87106OooOo;
        EnumC25536Ooooo0o enumC25536Ooooo0o2 = this.f87108OooOoO0;
        InterfaceC34630OooOO0 interfaceC34630OooOO0 = this.f87107OooOo0o;
        if (enumC25536Ooooo0o2 == enumC25536Ooooo0o) {
            return new C25534OoooOoo(enumC25535Ooooo002 == enumC25535Ooooo00 ? interfaceC34630OooOO0.OooooOO(C24227OooO00o.OooO0oO(j)) : interfaceC34630OooOO0.OoooO(C24227OooO00o.OooO0oO(j)), C24227OooO00o.OooO0oO(j));
        }
        return new C25534OoooOoo(C24227OooO00o.OooO0oo(j), enumC25535Ooooo002 == enumC25535Ooooo00 ? interfaceC34630OooOO0.OooOOoo(C24227OooO00o.OooO0oo(j)) : interfaceC34630OooOO0.Oooo00O(C24227OooO00o.OooO0oo(j)));
    }
}
