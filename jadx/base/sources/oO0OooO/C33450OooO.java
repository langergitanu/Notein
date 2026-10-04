package oO0OooO;

import java.util.List;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.AbstractC33354o00o0O;
import oO0Ooo.C33339OoooOOO;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0OooO.C33460OooOO0O;
import oO0OooO.C33460OooOO0O.OooO0O0;
import oO0Oooo.C33509OooO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0OooO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33450OooO extends AbstractC33328Oooo0O0 implements oO0o0000.OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final oO0o0000.OooO0O0 f120906OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AbstractC33354o00o0O f120907OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C33460OooOO0O f120908OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C33339OoooOOO f120909OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final boolean f120910OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final boolean f120911OooOoo0;

    /* JADX WARN: Illegal instructions before constructor call */
    public C33450OooO(oO0o0000.OooO0O0 oooO0O0, C33460OooOO0O c33460OooOO0O, AbstractC33354o00o0O abstractC33354o00o0O, C33339OoooOOO c33339OoooOOO, boolean z, int i) {
        if ((i & 8) != 0) {
            C33339OoooOOO.f120598OooOo.getClass();
            c33339OoooOOO = C33339OoooOOO.f120599OooOoO0;
        }
        this(oooO0O0, c33460OooOO0O, abstractC33354o00o0O, c33339OoooOOO, (i & 16) != 0 ? false : z, false);
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final oO0Oo0o0.OooOO0 OooOOO0() {
        return C33509OooO.OooO00o(1, true, new String[0]);
    }

    @Override // oO0Ooo.AbstractC33354o00o0O
    /* JADX INFO: renamed from: o0000, reason: merged with bridge method [inline-methods] */
    public final C33450OooO o00000O(AbstractC33457OooO0oO kotlinTypeRefiner) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        C33460OooOO0O c33460OooOO0O = this.f120908OooOoO0;
        c33460OooOO0O.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        InterfaceC33348OooooOO interfaceC33348OooooOOOooO0O0 = c33460OooOO0O.f120919OooO00o.OooO0O0(kotlinTypeRefiner);
        C33460OooOO0O.OooO0O0 oooO0O0 = c33460OooOO0O.f120920OooO0O0 != null ? c33460OooOO0O.new OooO0O0(kotlinTypeRefiner) : null;
        C33460OooOO0O c33460OooOO0O2 = c33460OooOO0O.f120921OooO0OO;
        if (c33460OooOO0O2 == null) {
            c33460OooOO0O2 = c33460OooOO0O;
        }
        C33460OooOO0O c33460OooOO0O3 = new C33460OooOO0O(interfaceC33348OooooOOOooO0O0, oooO0O0, c33460OooOO0O2, c33460OooOO0O.f120922OooO0Oo);
        AbstractC33354o00o0O abstractC33354o00o0O = this.f120907OooOoO;
        return new C33450OooO(this.f120906OooOo, c33460OooOO0O3, abstractC33354o00o0O != null ? kotlinTypeRefiner.Oooo0o0(abstractC33354o00o0O).o00000OO() : null, this.f120909OooOoOO, this.f120911OooOoo0, 32);
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final InterfaceC33342OoooOo0 o00000() {
        return this.f120908OooOoO0;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final List<InterfaceC33348OooooOO> o000000O() {
        return C34434OooOoO.f123453OooOo0o;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final C33339OoooOOO o000000o() {
        return this.f120909OooOoOO;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final boolean o00000O0() {
        return this.f120911OooOoo0;
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0, oO0Ooo.AbstractC33354o00o0O
    public final AbstractC33354o00o0O o00000Oo(boolean z) {
        return new C33450OooO(this.f120906OooOo, this.f120908OooOoO0, this.f120907OooOoO, this.f120909OooOoOO, z, 32);
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oO */
    public final AbstractC33328Oooo0O0 o00000Oo(boolean z) {
        return new C33450OooO(this.f120906OooOo, this.f120908OooOoO0, this.f120907OooOoO, this.f120909OooOoOO, z, 32);
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oo */
    public final AbstractC33328Oooo0O0 o0000Ooo(C33339OoooOOO newAttributes) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(newAttributes, "newAttributes");
        return new C33450OooO(this.f120906OooOo, this.f120908OooOoO0, this.f120907OooOoO, newAttributes, this.f120911OooOoo0, this.f120910OooOoo);
    }

    public C33450OooO(oO0o0000.OooO0O0 captureStatus, C33460OooOO0O constructor, AbstractC33354o00o0O abstractC33354o00o0O, C33339OoooOOO attributes, boolean z, boolean z2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(captureStatus, "captureStatus");
        kotlin.jvm.internal.OooOOO0.OooO0oO(constructor, "constructor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(attributes, "attributes");
        this.f120906OooOo = captureStatus;
        this.f120908OooOoO0 = constructor;
        this.f120907OooOoO = abstractC33354o00o0O;
        this.f120909OooOoOO = attributes;
        this.f120911OooOoo0 = z;
        this.f120910OooOoo = z2;
    }
}
