package oO0O0Oo0;

import OooOoOO.C20519OooO0Oo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import oO00ooO.C32447OooOOo;
import oO0O0OO.AbstractC32601OooOOo;
import oO0O0OO.C32602OooOOo0;
import oO0O0OO.InterfaceC32599OooOO0o;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0OO.OooO0O0;
import oO0O0OO.o000oOoO;
import oO0O0o.C32715OooO0o0;
import oO0OOo.AbstractC33038OooO0oO;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.C33356ooOO;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34428OooOOo;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0O0Oo0.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32705Ooooo00 extends AbstractC32706Ooooo0o implements InterfaceC32641OooooOO {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final boolean f117585OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f117586OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final boolean f117587OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final boolean f117588OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final AbstractC33320OooOoo f117589Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final InterfaceC32641OooooOO f117590Oooo00O;

    /* JADX INFO: renamed from: oO0O0Oo0.Ooooo00$OooO00o */
    public static final class OooO00o extends C32705Ooooo00 {

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public final C32447OooOOo f117591Oooo00o;

        public OooO00o(InterfaceC32609OooOo0 interfaceC32609OooOo0, InterfaceC32641OooooOO interfaceC32641OooooOO, int i, InterfaceC34588OooO0oO interfaceC34588OooO0oO, C33479OooO0o c33479OooO0o, AbstractC33320OooOoo abstractC33320OooOoo, boolean z, boolean z2, boolean z3, AbstractC33320OooOoo abstractC33320OooOoo2, oO0O0OO.o000oOoO o000oooo2, oO0O000o.OooO00o oooO00o) {
            super(interfaceC32609OooOo0, interfaceC32641OooooOO, i, interfaceC34588OooO0oO, c33479OooO0o, abstractC33320OooOoo, z, z2, z3, abstractC33320OooOoo2, o000oooo2);
            this.f117591Oooo00o = C20519OooO0Oo.OooO0OO(oooO00o);
        }

        @Override // oO0O0Oo0.C32705Ooooo00, oO0O0OO.InterfaceC32641OooooOO
        public final InterfaceC32641OooooOO OoooO0(C32715OooO0o0 c32715OooO0o0, C33479OooO0o c33479OooO0o, int i) {
            InterfaceC34588OooO0oO annotations = getAnnotations();
            kotlin.jvm.internal.OooOOO0.OooO0o(annotations, "annotations");
            AbstractC33320OooOoo type = getType();
            kotlin.jvm.internal.OooOOO0.OooO0o(type, "type");
            boolean zOooo0o = Oooo0o();
            o000oOoO.OooO00o oooO00o = oO0O0OO.o000oOoO.f117308OooO00o;
            C32704OoooOoo c32704OoooOoo = new C32704OoooOoo(this);
            return new OooO00o(c32715OooO0o0, null, i, annotations, c33479OooO0o, type, zOooo0o, this.f117587OooOooO, this.f117588OooOooo, this.f117589Oooo000, oooO00o, c32704OoooOoo);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32705Ooooo00(oO0O0OO.OooO00o containingDeclaration, InterfaceC32641OooooOO interfaceC32641OooooOO, int i, InterfaceC34588OooO0oO annotations, C33479OooO0o name, AbstractC33320OooOoo outType, boolean z, boolean z2, boolean z3, AbstractC33320OooOoo abstractC33320OooOoo, oO0O0OO.o000oOoO source) {
        super(containingDeclaration, annotations, name, outType, source);
        kotlin.jvm.internal.OooOOO0.OooO0oO(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.OooOOO0.OooO0oO(annotations, "annotations");
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(outType, "outType");
        kotlin.jvm.internal.OooOOO0.OooO0oO(source, "source");
        this.f117586OooOoo0 = i;
        this.f117585OooOoo = z;
        this.f117587OooOooO = z2;
        this.f117588OooOooo = z3;
        this.f117589Oooo000 = abstractC33320OooOoo;
        this.f117590Oooo00O = interfaceC32641OooooOO == null ? this : interfaceC32641OooooOO;
    }

    @Override // oO0O0OO.InterfaceC32634OoooOOo
    public final InterfaceC32599OooOO0o OooO0O0(C33356ooOO substitutor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(substitutor, "substitutor");
        if (substitutor.f120634OooO00o.OooO0o0()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // oO0O0OO.OooO00o
    public final Collection<InterfaceC32641OooooOO> OooOO0o() {
        Collection<? extends oO0O0OO.OooO00o> collectionOooOO0o = OooO0Oo().OooOO0o();
        kotlin.jvm.internal.OooOOO0.OooO0o(collectionOooOO0o, "containingDeclaration.overriddenDescriptors");
        Collection<? extends oO0O0OO.OooO00o> collection = collectionOooOO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((oO0O0OO.OooO00o) it.next()).OooO0o().get(this.f117586OooOoo0));
        }
        return arrayList;
    }

    @Override // oO0O0OO.InterfaceC32642OooooOo
    public final boolean OooOoOO() {
        return false;
    }

    @Override // oO0O0OO.InterfaceC32641OooooOO
    public final boolean Oooo0o() {
        if (!this.f117585OooOoo) {
            return false;
        }
        OooO0O0.OooO00o kind = ((oO0O0OO.OooO0O0) OooO0Oo()).getKind();
        kind.getClass();
        return kind != OooO0O0.OooO00o.f117221OooOo;
    }

    @Override // oO0O0OO.InterfaceC32641OooooOO
    public InterfaceC32641OooooOO OoooO0(C32715OooO0o0 c32715OooO0o0, C33479OooO0o c33479OooO0o, int i) {
        InterfaceC34588OooO0oO annotations = getAnnotations();
        kotlin.jvm.internal.OooOOO0.OooO0o(annotations, "annotations");
        AbstractC33320OooOoo type = getType();
        kotlin.jvm.internal.OooOOO0.OooO0o(type, "type");
        boolean zOooo0o = Oooo0o();
        o000oOoO.OooO00o oooO00o = oO0O0OO.o000oOoO.f117308OooO00o;
        return new C32705Ooooo00(c32715OooO0o0, null, i, annotations, c33479OooO0o, type, zOooo0o, this.f117587OooOooO, this.f117588OooOooo, this.f117589Oooo000, oooO00o);
    }

    @Override // oO0O0OO.InterfaceC32641OooooOO
    public final int getIndex() {
        return this.f117586OooOoo0;
    }

    @Override // oO0O0OO.OooOOOO, oO0O0OO.InterfaceC32612OooOoO
    public final AbstractC32601OooOOo getVisibility() {
        C32602OooOOo0.OooO LOCAL = C32602OooOOo0.f117242OooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0o(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // oO0O0OO.InterfaceC32641OooooOO
    public final boolean o00oO0O() {
        return this.f117587OooOooO;
    }

    @Override // oO0O0OO.InterfaceC32642OooooOo
    public final /* bridge */ /* synthetic */ AbstractC33038OooO0oO o00ooo() {
        return null;
    }

    @Override // oO0O0OO.OooOO0O
    public final <R, D> R o0O0O00(oO0O0OO.OooOOO0<R, D> oooOOO0, D d) {
        return (R) oooOOO0.OooOO0(this, d);
    }

    @Override // oO0O0OO.InterfaceC32641OooooOO
    public final AbstractC33320OooOoo o0ooOoO() {
        return this.f117589Oooo000;
    }

    @Override // oO0O0OO.InterfaceC32641OooooOO
    public final boolean oo000o() {
        return this.f117588OooOooo;
    }

    @Override // oO0O0Oo0.AbstractC32675OooOOoo, oO0O0OO.OooOO0O
    public final oO0O0OO.OooO00o OooO0Oo() {
        oO0O0OO.OooOO0O oooOO0OOooO0Oo = super.OooO0Oo();
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooOO0OOooO0Oo, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (oO0O0OO.OooO00o) oooOO0OOooO0Oo;
    }

    @Override // oO0O0Oo0.AbstractC32675OooOOoo
    /* JADX INFO: renamed from: OooO00o */
    public final InterfaceC32641OooooOO o000OOo() {
        InterfaceC32641OooooOO interfaceC32641OooooOO = this.f117590Oooo00O;
        return interfaceC32641OooooOO == this ? this : interfaceC32641OooooOO.o000OOo();
    }
}
