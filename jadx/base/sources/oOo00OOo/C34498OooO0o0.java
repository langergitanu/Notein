package oOo00OOo;

import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0OoO0oo.C28819o000oOoo;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0O0o.OooOOO;
import oO0O0oOO.C32763OooO0OO;
import oO0O0ooO.InterfaceC32815OooO00o;
import oO0O0ooO.InterfaceC32818OooO0Oo;
import oO0Ooo0.InterfaceC33357OooO;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oO0o0O0O.C33567OooO0o0;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0O.C33576OooOOOo;
import oO0o0O0O.C33577OooOOo;
import oO0o0O0O.InterfaceC33569OooO0oo;
import oOo000Oo.OooOOO;
import oOo000Oo.OooOo;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oOo00OOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34498OooO0o0 implements InterfaceC34588OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC32818OooO0Oo f123634OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34499OooO0oO f123635OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC33357OooO<InterfaceC32815OooO00o, oOo0oooO.OooO0OO> f123636OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f123637OooOoO0;

    /* JADX INFO: renamed from: oOo00OOo.OooO0o0$OooO00o */
    public static final class OooO00o extends OooOOOO implements InterfaceC32507OooOO0o<InterfaceC32815OooO00o, oOo0oooO.OooO0OO> {
        public OooO00o() {
            super(1);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final oOo0oooO.OooO0OO invoke(InterfaceC32815OooO00o interfaceC32815OooO00o) {
            InterfaceC32815OooO00o annotation = interfaceC32815OooO00o;
            OooOOO0.OooO0oO(annotation, "annotation");
            C33479OooO0o c33479OooO0o = C32763OooO0OO.f117722OooO00o;
            C34498OooO0o0 c34498OooO0o0 = C34498OooO0o0.this;
            return C32763OooO0OO.OooO0O0(annotation, c34498OooO0o0.f123635OooOo0o, c34498OooO0o0.f123637OooOoO0);
        }
    }

    public C34498OooO0o0(C34499OooO0oO c, InterfaceC32818OooO0Oo annotationOwner, boolean z) {
        OooOOO0.OooO0oO(c, "c");
        OooOOO0.OooO0oO(annotationOwner, "annotationOwner");
        this.f123635OooOo0o = c;
        this.f123634OooOo = annotationOwner;
        this.f123637OooOoO0 = z;
        this.f123636OooOoO = c.f123639OooO00o.f123606OooO00o.OooO0o0(new OooO00o());
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final oOo0oooO.OooO0OO OooOOO0(C33477OooO0OO fqName) {
        oOo0oooO.OooO0OO oooO0OOInvoke;
        OooOOO0.OooO0oO(fqName, "fqName");
        InterfaceC32818OooO0Oo interfaceC32818OooO0Oo = this.f123634OooOo;
        InterfaceC32815OooO00o interfaceC32815OooO00oOooOOO0 = interfaceC32818OooO0Oo.OooOOO0(fqName);
        if (interfaceC32815OooO00oOooOOO0 != null && (oooO0OOInvoke = this.f123636OooOoO.invoke(interfaceC32815OooO00oOooOOO0)) != null) {
            return oooO0OOInvoke;
        }
        C33479OooO0o c33479OooO0o = C32763OooO0OO.f117722OooO00o;
        return C32763OooO0OO.OooO00o(fqName, interfaceC32818OooO0Oo, this.f123635OooOo0o);
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final boolean Oooo000(C33477OooO0OO c33477OooO0OO) {
        return InterfaceC34588OooO0oO.OooO0O0.OooO0O0(this, c33477OooO0OO);
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final boolean isEmpty() {
        return this.f123634OooOo.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<oOo0oooO.OooO0OO> iterator() {
        InterfaceC32818OooO0Oo interfaceC32818OooO0Oo = this.f123634OooOo;
        C33577OooOOo c33577OooOOoOooOOoo = C33576OooOOOo.OooOOoo(OooOo.OooOooo(interfaceC32818OooO0Oo.getAnnotations()), this.f123636OooOoO);
        C33479OooO0o c33479OooO0o = C32763OooO0OO.f117722OooO00o;
        return new C33567OooO0o0.OooO00o(C33576OooOOOo.OooOOO(C33574OooOOO0.OooO0oo(OooOOO.OooOo(new InterfaceC33569OooO0oo[]{c33577OooOOoOooOOoo, OooOOO.OooOo(new Object[]{C32763OooO0OO.OooO00o(OooOOO.OooO00o.f117162OooOOO0, interfaceC32818OooO0Oo, this.f123635OooOo0o)})})), new C28819o000oOoo(1)));
    }
}
