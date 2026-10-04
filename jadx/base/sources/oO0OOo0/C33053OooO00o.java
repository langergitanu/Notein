package oO0OOo0;

import com.microsoft.identity.client.internal.MsalUtils;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO0Oo0o0.OooOO0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.AbstractC33354o00o0O;
import oO0Ooo.C33339OoooOOO;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0OooO.AbstractC33457OooO0oO;
import oO0Oooo.C33509OooO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0OOo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33053OooO00o extends AbstractC33328Oooo0O0 implements oO0o0000.OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC33348OooooOO f119496OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final boolean f119497OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0OO f119498OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C33339OoooOOO f119499OooOoOO;

    public C33053OooO00o(InterfaceC33348OooooOO typeProjection, OooO0OO constructor, boolean z, C33339OoooOOO attributes) {
        OooOOO0.OooO0oO(typeProjection, "typeProjection");
        OooOOO0.OooO0oO(constructor, "constructor");
        OooOOO0.OooO0oO(attributes, "attributes");
        this.f119496OooOo = typeProjection;
        this.f119498OooOoO0 = constructor;
        this.f119497OooOoO = z;
        this.f119499OooOoOO = attributes;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final OooOO0 OooOOO0() {
        return C33509OooO.OooO00o(1, true, new String[0]);
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final InterfaceC33342OoooOo0 o00000() {
        return this.f119498OooOoO0;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final List<InterfaceC33348OooooOO> o000000O() {
        return C34434OooOoO.f123453OooOo0o;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final C33339OoooOOO o000000o() {
        return this.f119499OooOoOO;
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final AbstractC33320OooOoo o00000O(AbstractC33457OooO0oO kotlinTypeRefiner) {
        OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C33053OooO00o(this.f119496OooOo.OooO0O0(kotlinTypeRefiner), this.f119498OooOoO0, this.f119497OooOoO, this.f119499OooOoOO);
    }

    @Override // oO0Ooo.AbstractC33320OooOoo
    public final boolean o00000O0() {
        return this.f119497OooOoO;
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0, oO0Ooo.AbstractC33354o00o0O
    public final AbstractC33354o00o0O o00000Oo(boolean z) {
        if (z == this.f119497OooOoO) {
            return this;
        }
        return new C33053OooO00o(this.f119496OooOo, this.f119498OooOoO0, z, this.f119499OooOoOO);
    }

    @Override // oO0Ooo.AbstractC33354o00o0O
    /* JADX INFO: renamed from: o00000o0 */
    public final AbstractC33354o00o0O o00000O(AbstractC33457OooO0oO kotlinTypeRefiner) {
        OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C33053OooO00o(this.f119496OooOo.OooO0O0(kotlinTypeRefiner), this.f119498OooOoO0, this.f119497OooOoO, this.f119499OooOoOO);
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oO */
    public final AbstractC33328Oooo0O0 o00000Oo(boolean z) {
        if (z == this.f119497OooOoO) {
            return this;
        }
        return new C33053OooO00o(this.f119496OooOo, this.f119498OooOoO0, z, this.f119499OooOoOO);
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    /* JADX INFO: renamed from: o00000oo */
    public final AbstractC33328Oooo0O0 o0000Ooo(C33339OoooOOO newAttributes) {
        OooOOO0.OooO0oO(newAttributes, "newAttributes");
        return new C33053OooO00o(this.f119496OooOo, this.f119498OooOoO0, this.f119497OooOoO, newAttributes);
    }

    @Override // oO0Ooo.AbstractC33328Oooo0O0
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f119496OooOo);
        sb.append(')');
        sb.append(this.f119497OooOoO ? MsalUtils.QUERY_STRING_SYMBOL : "");
        return sb.toString();
    }
}
