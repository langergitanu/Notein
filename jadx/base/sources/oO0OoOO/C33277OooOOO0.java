package oO0OoOO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o00OOOo0.C25015OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0OO00.C32887OooO0oo;
import oO0OO00.C32891OooOOo0;
import oO0OO00.C32892OooOOoo;
import oO0OO00.C32895OooOo0O;
import oO0OO0Oo.AbstractC32916OooO00o;
import oO0OO0Oo.C32922OooO0oO;
import oO0OO0Oo.C32923OooO0oo;
import oO0OO0Oo.InterfaceC32918OooO0OO;
import oO0Oo0o0.C33216OooO0Oo;
import oO0OoO0.C33239OooOO0o;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.OooOo;
import ooOOOoOo.InterfaceC35102OooO0O0;
import ooo0o.C35193OooOO0o;

/* JADX INFO: renamed from: oO0OoOO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33277OooOOO0 extends AbstractC33273OooOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33477OooO0OO f120476OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC32620Oooo00O f120477OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f120478OooO0oo;

    public C33277OooOOO0(InterfaceC32620Oooo00O packageDescriptor, oO0OO00.OooOO0O proto, InterfaceC32918OooO0OO nameResolver, AbstractC32916OooO00o metadataVersion, C35193OooOO0o c35193OooOO0o, C33239OooOO0o components, String debugName, oO0O000o.OooO00o classNames) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(packageDescriptor, "packageDescriptor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameResolver, "nameResolver");
        kotlin.jvm.internal.OooOOO0.OooO0oO(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.OooOOO0.OooO0oO(components, "components");
        kotlin.jvm.internal.OooOOO0.OooO0oO(debugName, "debugName");
        kotlin.jvm.internal.OooOOO0.OooO0oO(classNames, "classNames");
        C32892OooOOoo c32892OooOOoo = proto.f118267OooOoo;
        kotlin.jvm.internal.OooOOO0.OooO0o(c32892OooOOoo, "proto.typeTable");
        C32922OooO0oO c32922OooO0oO = new C32922OooO0oO(c32892OooOOoo);
        C32923OooO0oo c32923OooO0oo = C32923OooO0oo.f118802OooO0O0;
        C32895OooOo0O c32895OooOo0O = proto.f118269OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0o(c32895OooOo0O, "proto.versionRequirementTable");
        oO0OoO0.OooOOO oooOOOOooO00o = components.OooO00o(packageDescriptor, nameResolver, c32922OooO0oO, C32923OooO0oo.OooO00o.OooO00o(c32895OooOo0O), metadataVersion, c35193OooOO0o);
        List<C32887OooO0oo> list = proto.f118264OooOoO;
        kotlin.jvm.internal.OooOOO0.OooO0o(list, "proto.functionList");
        List<oO0OO00.OooOOO0> list2 = proto.f118266OooOoOO;
        kotlin.jvm.internal.OooOOO0.OooO0o(list2, "proto.propertyList");
        List<C32891OooOOo0> list3 = proto.f118268OooOoo0;
        kotlin.jvm.internal.OooOOO0.OooO0o(list3, "proto.typeAliasList");
        super(oooOOOOooO00o, list, list2, list3, classNames);
        this.f120477OooO0oO = packageDescriptor;
        this.f120478OooO0oo = debugName;
        this.f120476OooO = packageDescriptor.OooO0OO();
    }

    @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOOO0
    public final Collection OooO0o0(C33216OooO0Oo kindFilter, InterfaceC32507OooOO0o nameFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kindFilter, "kindFilter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
        Collection collectionOooO = OooO(kindFilter, nameFilter);
        Iterable<InterfaceC35102OooO0O0> iterable = this.f120445OooO0O0.f120289OooO00o.f120278OooOO0O;
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC35102OooO0O0> it = iterable.iterator();
        while (it.hasNext()) {
            C34431OooOo0.OooOo0o(arrayList, it.next().OooO00o(this.f120476OooO));
        }
        return OooOo.OooooOO(collectionOooO, arrayList);
    }

    @Override // oO0OoOO.AbstractC33273OooOO0o, oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOOO0
    public final InterfaceC32598OooO0oo OooO0oO(C33479OooO0o name, oOo0o0oO.OooO0O0 location) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(location, "location");
        C25015OooO00o.OooO0O0(this.f120445OooO0O0.f120289OooO00o.f120268OooO, location, this.f120477OooO0oO, name);
        return super.OooO0oO(name, location);
    }

    @Override // oO0OoOO.AbstractC33273OooOO0o
    public final void OooO0oo(ArrayList arrayList, InterfaceC32507OooOO0o nameFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
    }

    @Override // oO0OoOO.AbstractC33273OooOO0o
    public final C33476OooO0O0 OooOO0o(C33479OooO0o name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        return new C33476OooO0O0(this.f120476OooO, name);
    }

    @Override // oO0OoOO.AbstractC33273OooOO0o
    public final Set<C33479OooO0o> OooOOO() {
        return C34438OooOoo0.f123458OooOo0o;
    }

    @Override // oO0OoOO.AbstractC33273OooOO0o
    public final Set<C33479OooO0o> OooOOOO() {
        return C34438OooOoo0.f123458OooOo0o;
    }

    @Override // oO0OoOO.AbstractC33273OooOO0o
    public final Set<C33479OooO0o> OooOOOo() {
        return C34438OooOoo0.f123458OooOo0o;
    }

    @Override // oO0OoOO.AbstractC33273OooOO0o
    public final boolean OooOOo0(C33479OooO0o name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        if (super.OooOOo0(name)) {
            return true;
        }
        Iterable<InterfaceC35102OooO0O0> iterable = this.f120445OooO0O0.f120289OooO00o.f120278OooOO0O;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<InterfaceC35102OooO0O0> it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next().OooO0O0(this.f120476OooO, name)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f120478OooO0oo;
    }
}
