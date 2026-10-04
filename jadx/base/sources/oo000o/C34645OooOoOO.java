package oo000o;

import o0000Ooo.C24227OooO00o;

/* JADX INFO: renamed from: oo000o.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34645OooOoOO implements InterfaceC34641OooOo0O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final EnumC34646OooOoo f124828OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34630OooOO0 f124829OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final EnumC34648OooOooO f124830OooOoO0;

    public C34645OooOoOO(InterfaceC34630OooOO0 measurable, EnumC34646OooOoo enumC34646OooOoo, EnumC34648OooOooO enumC34648OooOooO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(measurable, "measurable");
        this.f124829OooOo0o = measurable;
        this.f124828OooOo = enumC34646OooOoo;
        this.f124830OooOoO0 = enumC34648OooOooO;
    }

    @Override // oo000o.InterfaceC34630OooOO0
    public final Object OooO0OO() {
        return this.f124829OooOo0o.OooO0OO();
    }

    @Override // oo000o.InterfaceC34630OooOO0
    public final int OooOOoo(int i) {
        return this.f124829OooOo0o.OooOOoo(i);
    }

    @Override // oo000o.InterfaceC34630OooOO0
    public final int Oooo00O(int i) {
        return this.f124829OooOo0o.Oooo00O(i);
    }

    @Override // oo000o.InterfaceC34630OooOO0
    public final int OoooO(int i) {
        return this.f124829OooOo0o.OoooO(i);
    }

    @Override // oo000o.InterfaceC34630OooOO0
    public final int OooooOO(int i) {
        return this.f124829OooOo0o.OooooOO(i);
    }

    @Override // oo000o.InterfaceC34641OooOo0O
    public final AbstractC34655Oooo0o o00ooo(long j) {
        EnumC34648OooOooO enumC34648OooOooO = EnumC34648OooOooO.f124835OooOo0o;
        EnumC34646OooOoo enumC34646OooOoo = EnumC34646OooOoo.f124831OooOo;
        EnumC34646OooOoo enumC34646OooOoo2 = this.f124828OooOo;
        EnumC34648OooOooO enumC34648OooOooO2 = this.f124830OooOoO0;
        InterfaceC34630OooOO0 interfaceC34630OooOO0 = this.f124829OooOo0o;
        if (enumC34648OooOooO2 == enumC34648OooOooO) {
            return new C34647OooOoo0(enumC34646OooOoo2 == enumC34646OooOoo ? interfaceC34630OooOO0.OooooOO(C24227OooO00o.OooO0oO(j)) : interfaceC34630OooOO0.OoooO(C24227OooO00o.OooO0oO(j)), C24227OooO00o.OooO0oO(j));
        }
        return new C34647OooOoo0(C24227OooO00o.OooO0oo(j), enumC34646OooOoo2 == enumC34646OooOoo ? interfaceC34630OooOO0.OooOOoo(C24227OooO00o.OooO0oo(j)) : interfaceC34630OooOO0.Oooo00O(C24227OooO00o.OooO0oo(j)));
    }
}
