package oo000o;

import o0000Ooo.C24227OooO00o;

/* JADX INFO: renamed from: oo000o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34626OooO0o implements InterfaceC34641OooOo0O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final EnumC34632OooOO0o f124807OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34630OooOO0 f124808OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final EnumC34634OooOOO0 f124809OooOoO0;

    public C34626OooO0o(InterfaceC34630OooOO0 measurable, EnumC34632OooOO0o enumC34632OooOO0o, EnumC34634OooOOO0 enumC34634OooOOO0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        this.f124808OooOo0o = measurable;
        this.f124807OooOo = enumC34632OooOO0o;
        this.f124809OooOoO0 = enumC34634OooOOO0;
    }

    @Override // oo000o.InterfaceC34630OooOO0
    public final Object OooO0OO() {
        return this.f124808OooOo0o.OooO0OO();
    }

    @Override // oo000o.InterfaceC34630OooOO0
    public final int OooOOoo(int i) {
        return this.f124808OooOo0o.OooOOoo(i);
    }

    @Override // oo000o.InterfaceC34630OooOO0
    public final int Oooo00O(int i) {
        return this.f124808OooOo0o.Oooo00O(i);
    }

    @Override // oo000o.InterfaceC34630OooOO0
    public final int OoooO(int i) {
        return this.f124808OooOo0o.OoooO(i);
    }

    @Override // oo000o.InterfaceC34630OooOO0
    public final int OooooOO(int i) {
        return this.f124808OooOo0o.OooooOO(i);
    }

    @Override // oo000o.InterfaceC34641OooOo0O
    public final AbstractC34655Oooo0o o00ooo(long j) {
        EnumC34634OooOOO0 enumC34634OooOOO0 = EnumC34634OooOOO0.f124817OooOo0o;
        EnumC34632OooOO0o enumC34632OooOO0o = EnumC34632OooOO0o.f124811OooOo;
        EnumC34632OooOO0o enumC34632OooOO0o2 = this.f124807OooOo;
        EnumC34634OooOOO0 enumC34634OooOOO02 = this.f124809OooOoO0;
        InterfaceC34630OooOO0 interfaceC34630OooOO0 = this.f124808OooOo0o;
        if (enumC34634OooOOO02 == enumC34634OooOOO0) {
            return new C34628OooO0oO(enumC34632OooOO0o2 == enumC34632OooOO0o ? interfaceC34630OooOO0.OooooOO(C24227OooO00o.OooO0oO(j)) : interfaceC34630OooOO0.OoooO(C24227OooO00o.OooO0oO(j)), C24227OooO00o.OooO0oO(j));
        }
        return new C34628OooO0oO(C24227OooO00o.OooO0oo(j), enumC34632OooOO0o2 == enumC34632OooOO0o ? interfaceC34630OooOO0.OooOOoo(C24227OooO00o.OooO0oo(j)) : interfaceC34630OooOO0.Oooo00O(C24227OooO00o.OooO0oo(j)));
    }
}
