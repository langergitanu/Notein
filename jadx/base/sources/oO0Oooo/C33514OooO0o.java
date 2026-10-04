package oO0Oooo;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.AbstractC33354o00o0O;
import oO0Ooo.C33339OoooOOO;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0OooO.AbstractC33457OooO0oO;

/* JADX INFO: renamed from: oO0Oooo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33514OooO0o extends AbstractC33328Oooo0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC33342OoooOo0 f121044OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final EnumC33517OooO0oo f121045OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C33515OooO0o0 f121046OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final List<InterfaceC33348OooooOO> f121047OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final String[] f121048OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final boolean f121049OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final String f121050OooOooO;

    public C33514OooO0o(InterfaceC33342OoooOo0 constructor, C33515OooO0o0 memberScope, EnumC33517OooO0oo kind, List arguments, boolean z, String... formatParams) {
        OooOOO0.OooO0oO(constructor, "constructor");
        OooOOO0.OooO0oO(memberScope, "memberScope");
        OooOOO0.OooO0oO(kind, "kind");
        OooOOO0.OooO0oO(arguments, "arguments");
        OooOOO0.OooO0oO(formatParams, "formatParams");
        this.f121044OooOo = constructor;
        this.f121046OooOoO0 = memberScope;
        this.f121045OooOoO = kind;
        this.f121047OooOoOO = arguments;
        this.f121049OooOoo0 = z;
        this.f121048OooOoo = formatParams;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f121050OooOooO = String.format(kind.f121086OooOo0o, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final oO0Oo0o0.OooOO0 OooOOO0() {
        return this.f121046OooOoO0;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final InterfaceC33342OoooOo0 o00000() {
        return this.f121044OooOo;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final List<InterfaceC33348OooooOO> o000000O() {
        return this.f121047OooOoOO;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final C33339OoooOOO o000000o() {
        C33339OoooOOO.f120598OooOo.getClass();
        return C33339OoooOOO.f120599OooOoO0;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final AbstractC33320OooOoo o00000O(AbstractC33457OooO0oO kotlinTypeRefiner) {
        OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final boolean o00000O0() {
        return this.f121049OooOoo0;
    }

    @Override // oO0Ooo.AbstractC33354o00o0O
    /* JADX INFO: renamed from: o00000o0 */
    public final AbstractC33354o00o0O o00000O(AbstractC33457OooO0oO kotlinTypeRefiner) {
        OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oO */
    public final AbstractC33328Oooo0O0 o00000Oo(boolean z) {
        String[] strArr = this.f121048OooOoo;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return new C33514OooO0o(this.f121044OooOo, this.f121046OooOoO0, this.f121045OooOoO, this.f121047OooOoOO, z, strArr2);
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oo */
    public final AbstractC33328Oooo0O0 o0000Ooo(C33339OoooOOO newAttributes) {
        OooOOO0.OooO0oO(newAttributes, "newAttributes");
        return this;
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0, oO0Ooo.AbstractC33354o00o0O
    public final AbstractC33354o00o0O o0000Ooo(C33339OoooOOO newAttributes) {
        OooOOO0.OooO0oO(newAttributes, "newAttributes");
        return this;
    }
}
