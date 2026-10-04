package oO0O0Oo0;

import java.util.List;
import o0Oo0o00.o0OOO0o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.AbstractC32600OooOOOo;
import oO0O0OO.AbstractC32601OooOOo;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32636OoooOoO;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0OO.o000oOoO;
import oO0OoOO.C33279OooOOOo;
import oO0Ooo.AbstractC33354o00o0O;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo.o00Oo0;
import oO0OooO0.C33479OooO0o;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32670OooO0oo extends AbstractC32675OooOOoo implements InterfaceC32636OoooOoO {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AbstractC32600OooOOOo f117394OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final OooO f117395OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public List<? extends InterfaceC32637OoooOoo> f117396OooOoo0;

    /* JADX INFO: renamed from: oO0O0Oo0.OooO0oo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC33354o00o0O, Boolean> {
        public OooO00o() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
        @Override // oO0O000o.InterfaceC32507OooOO0o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(AbstractC33354o00o0O abstractC33354o00o0O) {
            boolean z;
            AbstractC33354o00o0O type = abstractC33354o00o0O;
            kotlin.jvm.internal.OooOOO0.OooO0o(type, "type");
            if (!o0OOO0o.OooO0O0(type)) {
                InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = type.o00000().OooO0OO();
                z = (interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32637OoooOoo) && !kotlin.jvm.internal.OooOOO0.OooO0O0(((InterfaceC32637OoooOoo) interfaceC32598OooO0ooOooO0OO).OooO0Oo(), AbstractC32670OooO0oo.this);
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC32670OooO0oo(oO0O0OO.OooOO0O containingDeclaration, InterfaceC34588OooO0oO interfaceC34588OooO0oO, C33479OooO0o c33479OooO0o, AbstractC32600OooOOOo visibilityImpl) {
        o000oOoO.OooO00o oooO00o = oO0O0OO.o000oOoO.f117308OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.OooOOO0.OooO0oO(visibilityImpl, "visibilityImpl");
        super(containingDeclaration, interfaceC34588OooO0oO, c33479OooO0o, oooO00o);
        this.f117394OooOoOO = visibilityImpl;
        this.f117395OooOoo = new OooO(this);
    }

    @Override // oO0O0OO.InterfaceC32598OooO0oo
    public final InterfaceC33342OoooOo0 OooO() {
        return this.f117395OooOoo;
    }

    @Override // oO0O0Oo0.AbstractC32675OooOOoo, oO0O0Oo0.AbstractC32673OooOOo, oO0O0OO.OooOO0O
    /* JADX INFO: renamed from: OooO00o */
    public final InterfaceC32598OooO0oo o000OOo() {
        return this;
    }

    @Override // oO0O0OO.OooO
    public final List<InterfaceC32637OoooOoo> OooOOOO() {
        List list = this.f117396OooOoo0;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("declaredTypeParametersImpl");
        throw null;
    }

    @Override // oO0O0OO.OooO
    public final boolean OooOo00() {
        return o00Oo0.OooO0Oo(((C33279OooOOOo) this).o0ooOOo(), new OooO00o(), null);
    }

    @Override // oO0O0OO.InterfaceC32612OooOoO
    public final boolean OooooO0() {
        return false;
    }

    @Override // oO0O0OO.OooOOOO, oO0O0OO.InterfaceC32612OooOoO
    public final AbstractC32601OooOOo getVisibility() {
        return this.f117394OooOoOO;
    }

    @Override // oO0O0OO.InterfaceC32612OooOoO
    public final boolean isExternal() {
        return false;
    }

    @Override // oO0O0Oo0.AbstractC32675OooOOoo
    public final oO0O0OO.OooOOO o000OOo() {
        return this;
    }

    @Override // oO0O0OO.InterfaceC32612OooOoO
    public final boolean o00Oo0() {
        return false;
    }

    @Override // oO0O0OO.OooOO0O
    public final <R, D> R o0O0O00(oO0O0OO.OooOOO0<R, D> oooOOO0, D d) {
        return (R) oooOOO0.OooO0o0(this, d);
    }

    @Override // oO0O0Oo0.AbstractC32673OooOOo
    public final String toString() {
        return "typealias " + getName().OooO0O0();
    }

    @Override // oO0O0Oo0.AbstractC32675OooOOoo, oO0O0Oo0.AbstractC32673OooOOo, oO0O0OO.OooOO0O
    /* JADX INFO: renamed from: OooO00o */
    public final oO0O0OO.OooOO0O o000OOo() {
        return this;
    }
}
