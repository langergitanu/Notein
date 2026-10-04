package oO0O0oo0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o00OOOo0.C25015OooO00o;
import o00oO0O.C25515Oooo0O0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32632OoooOO0;
import oO0Oo0o0.C33216OooO0Oo;
import oO0Oo0o0.C33220OooOO0o;
import oO0OoOO.C33277OooOOO0;
import oO0Ooo0.InterfaceC33370OooOO0;
import oO0OooO0.C33479OooO0o;
import oO0o0O00.C33560OooO00o;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;
import oOo00OOo.C34495OooO0OO;
import oOo00OOo.C34499OooO0oO;
import oOoo0.InterfaceC34602OooOO0o;
import ooo0o.InterfaceC35196OooOOo0;

/* JADX INFO: renamed from: oO0O0oo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32781OooO0OO implements oO0Oo0o0.OooOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f117758OooO0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34499OooO0oO f117759OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32795OooOOO0 f117760OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C32793OooOOO f117761OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC33370OooOO0 f117762OooO0o0;

    /* JADX INFO: renamed from: oO0O0oo0.OooO0OO$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<oO0Oo0o0.OooOO0[]> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final oO0Oo0o0.OooOO0[] invoke() {
            C32781OooO0OO c32781OooO0OO = C32781OooO0OO.this;
            C32795OooOOO0 c32795OooOOO0 = c32781OooO0OO.f117760OooO0OO;
            c32795OooOOO0.getClass();
            Collection<InterfaceC35196OooOOo0> collectionValues = ((Map) C25515Oooo0O0.OooO00o(c32795OooOOO0.f117838Oooo000, C32795OooOOO0.f117833Oooo0O0[0])).values();
            ArrayList arrayList = new ArrayList();
            for (InterfaceC35196OooOOo0 interfaceC35196OooOOo0 : collectionValues) {
                C34495OooO0OO c34495OooO0OO = c32781OooO0OO.f117759OooO0O0.f123639OooO00o;
                C33277OooOOO0 c33277OooOOO0OooO00o = c34495OooO0OO.f123609OooO0Oo.OooO00o(c32781OooO0OO.f117760OooO0OO, interfaceC35196OooOOo0);
                if (c33277OooOOO0OooO00o != null) {
                    arrayList.add(c33277OooOOO0OooO00o);
                }
            }
            return (oO0Oo0o0.OooOO0[]) C33560OooO00o.OooO0O0(arrayList).toArray(new oO0Oo0o0.OooOO0[0]);
        }
    }

    static {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f117758OooO0o = new InterfaceC34602OooOO0o[]{oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(C32781OooO0OO.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public C32781OooO0OO(C34499OooO0oO c34499OooO0oO, oO0O0ooO.OooOo00 oooOo00, C32795OooOOO0 packageFragment) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(packageFragment, "packageFragment");
        this.f117759OooO0O0 = c34499OooO0oO;
        this.f117760OooO0OO = packageFragment;
        this.f117761OooO0Oo = new C32793OooOOO(c34499OooO0oO, oooOo00, packageFragment);
        this.f117762OooO0o0 = c34499OooO0oO.f123639OooO00o.f123606OooO00o.OooO00o(new OooO00o());
    }

    public final void OooO(C33479OooO0o name, oOo0o0oO.OooO0O0 location) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(location, "location");
        C34495OooO0OO c34495OooO0OO = this.f117759OooO0O0.f123639OooO00o;
        C25015OooO00o.OooO0O0(c34495OooO0OO.f123617OooOOO, location, this.f117760OooO0OO, name);
    }

    @Override // oO0Oo0o0.OooOO0
    public final Set<C33479OooO0o> OooO00o() {
        oO0Oo0o0.OooOO0[] oooOO0ArrOooO0oo = OooO0oo();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (oO0Oo0o0.OooOO0 oooOO02 : oooOO0ArrOooO0oo) {
            C34431OooOo0.OooOo0o(linkedHashSet, oooOO02.OooO00o());
        }
        linkedHashSet.addAll(this.f117761OooO0Oo.OooO00o());
        return linkedHashSet;
    }

    @Override // oO0Oo0o0.OooOO0
    public final Collection OooO0O0(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        OooO(name, oooO0O0);
        oO0Oo0o0.OooOO0[] oooOO0ArrOooO0oo = OooO0oo();
        this.f117761OooO0Oo.getClass();
        Collection collectionOooO00o = C34434OooOoO.f123453OooOo0o;
        for (oO0Oo0o0.OooOO0 oooOO02 : oooOO0ArrOooO0oo) {
            collectionOooO00o = C33560OooO00o.OooO00o(collectionOooO00o, oooOO02.OooO0O0(name, oooO0O0));
        }
        return collectionOooO00o == null ? C34438OooOoo0.f123458OooOo0o : collectionOooO00o;
    }

    @Override // oO0Oo0o0.OooOO0
    public final Set<C33479OooO0o> OooO0OO() {
        oO0Oo0o0.OooOO0[] oooOO0ArrOooO0oo = OooO0oo();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (oO0Oo0o0.OooOO0 oooOO02 : oooOO0ArrOooO0oo) {
            C34431OooOo0.OooOo0o(linkedHashSet, oooOO02.OooO0OO());
        }
        linkedHashSet.addAll(this.f117761OooO0Oo.OooO0OO());
        return linkedHashSet;
    }

    @Override // oO0Oo0o0.OooOO0
    public final Set<C33479OooO0o> OooO0Oo() {
        HashSet hashSetOooO00o = C33220OooOO0o.OooO00o(oOo000Oo.OooOOO.OooOo0o(OooO0oo()));
        if (hashSetOooO00o == null) {
            return null;
        }
        hashSetOooO00o.addAll(this.f117761OooO0Oo.OooO0Oo());
        return hashSetOooO00o;
    }

    @Override // oO0Oo0o0.OooOO0
    public final Collection<InterfaceC32632OoooOO0> OooO0o(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        OooO(name, oooO0O0);
        oO0Oo0o0.OooOO0[] oooOO0ArrOooO0oo = OooO0oo();
        Collection<InterfaceC32632OoooOO0> collectionOooO0o = this.f117761OooO0Oo.OooO0o(name, oooO0O0);
        for (oO0Oo0o0.OooOO0 oooOO02 : oooOO0ArrOooO0oo) {
            collectionOooO0o = C33560OooO00o.OooO00o(collectionOooO0o, oooOO02.OooO0o(name, oooO0O0));
        }
        return collectionOooO0o == null ? C34438OooOoo0.f123458OooOo0o : collectionOooO0o;
    }

    @Override // oO0Oo0o0.OooOOO0
    public final Collection<oO0O0OO.OooOO0O> OooO0o0(C33216OooO0Oo kindFilter, InterfaceC32507OooOO0o<? super C33479OooO0o, Boolean> nameFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kindFilter, "kindFilter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
        oO0Oo0o0.OooOO0[] oooOO0ArrOooO0oo = OooO0oo();
        Collection<oO0O0OO.OooOO0O> collectionOooO0o0 = this.f117761OooO0Oo.OooO0o0(kindFilter, nameFilter);
        for (oO0Oo0o0.OooOO0 oooOO02 : oooOO0ArrOooO0oo) {
            collectionOooO0o0 = C33560OooO00o.OooO00o(collectionOooO0o0, oooOO02.OooO0o0(kindFilter, nameFilter));
        }
        return collectionOooO0o0 == null ? C34438OooOoo0.f123458OooOo0o : collectionOooO0o0;
    }

    @Override // oO0Oo0o0.OooOOO0
    public final InterfaceC32598OooO0oo OooO0oO(C33479OooO0o name, oOo0o0oO.OooO0O0 location) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(location, "location");
        OooO(name, location);
        C32793OooOOO c32793OooOOO = this.f117761OooO0Oo;
        c32793OooOOO.getClass();
        InterfaceC32598OooO0oo interfaceC32598OooO0oo = null;
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooOo0o = c32793OooOOO.OooOo0o(name, null);
        if (interfaceC32596OooO0o0OooOo0o != null) {
            return interfaceC32596OooO0o0OooOo0o;
        }
        for (oO0Oo0o0.OooOO0 oooOO02 : OooO0oo()) {
            InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0oO = oooOO02.OooO0oO(name, location);
            if (interfaceC32598OooO0ooOooO0oO != null) {
                if (!(interfaceC32598OooO0ooOooO0oO instanceof oO0O0OO.OooO) || !((oO0O0OO.OooO) interfaceC32598OooO0ooOooO0oO).o00Oo0()) {
                    return interfaceC32598OooO0ooOooO0oO;
                }
                if (interfaceC32598OooO0oo == null) {
                    interfaceC32598OooO0oo = interfaceC32598OooO0ooOooO0oO;
                }
            }
        }
        return interfaceC32598OooO0oo;
    }

    public final oO0Oo0o0.OooOO0[] OooO0oo() {
        return (oO0Oo0o0.OooOO0[]) C25515Oooo0O0.OooO00o(this.f117762OooO0o0, f117758OooO0o[0]);
    }

    public final String toString() {
        return "scope for " + this.f117760OooO0OO;
    }
}
