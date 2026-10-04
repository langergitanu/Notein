package oOo00OOo;

import com.facebook.soloader.OooOo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32436OooO0o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32622Oooo0O0;
import oO0O0oO0.C32754OooOoo0;
import oO0O0oo0.C32795OooOOO0;
import oO0O0ooO.OooOo00;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33358OooO00o;
import oO0OooO0.C33477OooO0OO;
import oOo000Oo.C34434OooOoO;
import oOo00OOo.InterfaceC34501OooOO0;

/* JADX INFO: renamed from: oOo00OOo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34497OooO0o implements InterfaceC32622Oooo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34499OooO0oO f123630OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC33358OooO00o<C33477OooO0OO, C32795OooOOO0> f123631OooO0O0;

    /* JADX INFO: renamed from: oOo00OOo.OooO0o$OooO00o */
    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<C32795OooOOO0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooOo00 f123632OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOo00 oooOo00) {
            super(0);
            this.f123632OooOo = oooOo00;
        }

        @Override // oO0O000o.OooO00o
        public final C32795OooOOO0 invoke() {
            return new C32795OooOOO0(C34497OooO0o.this.f123630OooO00o, this.f123632OooOo);
        }
    }

    public C34497OooO0o(C34495OooO0OO c34495OooO0OO) {
        this.f123630OooO00o = new C34499OooO0oO(c34495OooO0OO, InterfaceC34501OooOO0.OooO00o.f123649OooO00o, new C32436OooO0o(null));
        this.f123631OooO0O0 = c34495OooO0OO.f123606OooO00o.OooO0OO();
    }

    @Override // oO0O0OO.InterfaceC32622Oooo0O0
    public final void OooO00o(C33477OooO0OO fqName, ArrayList arrayList) {
        OooOOO0.OooO0oO(fqName, "fqName");
        arrayList.add(OooO0Oo(fqName));
    }

    @Override // oO0O0OO.InterfaceC32621Oooo00o
    public final List<C32795OooOOO0> OooO0O0(C33477OooO0OO fqName) {
        OooOOO0.OooO0oO(fqName, "fqName");
        return OooOo.OooO0oO(OooO0Oo(fqName));
    }

    @Override // oO0O0OO.InterfaceC32622Oooo0O0
    public final boolean OooO0OO(C33477OooO0OO fqName) {
        OooOOO0.OooO0oO(fqName, "fqName");
        this.f123630OooO00o.f123639OooO00o.f123607OooO0O0.getClass();
        new C32754OooOoo0(fqName);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C32795OooOOO0 OooO0Oo(C33477OooO0OO fqName) throws Throwable {
        this.f123630OooO00o.f123639OooO00o.f123607OooO0O0.getClass();
        OooOOO0.OooO0oO(fqName, "fqName");
        OooO00o oooO00o = new OooO00o(new C32754OooOoo0(fqName));
        C33361OooO0Oo.OooO0O0 oooO0O0 = (C33361OooO0Oo.OooO0O0) this.f123631OooO0O0;
        oooO0O0.getClass();
        V vInvoke = oooO0O0.invoke(new C33361OooO0Oo.C33362OooO0o0(fqName, oooO00o));
        if (vInvoke != 0) {
            return (C32795OooOOO0) vInvoke;
        }
        C33361OooO0Oo.OooO0O0.OooO00o(3);
        throw null;
    }

    @Override // oO0O0OO.InterfaceC32621Oooo00o
    public final Collection OooOOOo(C33477OooO0OO fqName, InterfaceC32507OooOO0o nameFilter) {
        OooOOO0.OooO0oO(fqName, "fqName");
        OooOOO0.OooO0oO(nameFilter, "nameFilter");
        List<C33477OooO0OO> listInvoke = OooO0Oo(fqName).f117840Oooo00o.invoke();
        if (listInvoke == null) {
            listInvoke = C34434OooOoO.f123453OooOo0o;
        }
        return listInvoke;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f123630OooO00o.f123639OooO00o.f123619OooOOOO;
    }
}
