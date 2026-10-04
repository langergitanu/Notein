package oO0O0OO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0OOOo.C32982OooO;
import oO0Oo00.C33194OooO0O0;
import oO0Oo00.C33196OooO0Oo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0Oooo.C33509OooO;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0O.C33576OooOOOo;
import oO0o0O0O.C33578OooOOo0;
import oO0o0O0O.InterfaceC33569OooO0oo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0O0OO.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32638Ooooo00 {

    /* JADX INFO: renamed from: oO0O0OO.Ooooo00$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<OooOO0O, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f117293OooOo0o = new OooO00o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(OooOO0O oooOO0O) {
            OooOO0O it = oooOO0O;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return Boolean.valueOf(it instanceof oO0O0OO.OooO00o);
        }
    }

    /* JADX INFO: renamed from: oO0O0OO.Ooooo00$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<OooOO0O, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f117294OooOo0o = new OooO0O0(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(OooOO0O oooOO0O) {
            OooOO0O it = oooOO0O;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return Boolean.valueOf(!(it instanceof OooOO0));
        }
    }

    /* JADX INFO: renamed from: oO0O0OO.Ooooo00$OooO0OO */
    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<OooOO0O, InterfaceC33569OooO0oo<? extends InterfaceC32637OoooOoo>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0OO f117295OooOo0o = new OooO0OO(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final InterfaceC33569OooO0oo<? extends InterfaceC32637OoooOoo> invoke(OooOO0O oooOO0O) {
            OooOO0O it = oooOO0O;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            List<InterfaceC32637OoooOoo> typeParameters = ((oO0O0OO.OooO00o) it).getTypeParameters();
            kotlin.jvm.internal.OooOOO0.OooO0o(typeParameters, "it as CallableDescriptor).typeParameters");
            return oOo000Oo.OooOo.OooOooo(typeParameters);
        }
    }

    public static final C32624Oooo0o OooO00o(AbstractC33328Oooo0O0 abstractC33328Oooo0O0, OooO oooO, int i) {
        if (oooO == null || C33509OooO.OooO0o(oooO)) {
            return null;
        }
        int size = oooO.OooOOOO().size() + i;
        if (oooO.OooOo00()) {
            List<InterfaceC33348OooooOO> listSubList = abstractC33328Oooo0O0.o000000O().subList(i, size);
            OooOO0O oooOO0OOooO0Oo = oooO.OooO0Oo();
            return new C32624Oooo0o(oooO, listSubList, OooO00o(abstractC33328Oooo0O0, oooOO0OOooO0Oo instanceof OooO ? (OooO) oooOO0OOooO0Oo : null, size));
        }
        if (size != abstractC33328Oooo0O0.o000000O().size()) {
            C32982OooO.OooOOOO(oooO);
        }
        return new C32624Oooo0o(oooO, abstractC33328Oooo0O0.o000000O().subList(i, abstractC33328Oooo0O0.o000000O().size()), null);
    }

    public static final List<InterfaceC32637OoooOoo> OooO0O0(OooO oooO) {
        List<InterfaceC32637OoooOoo> parameters;
        Object next;
        InterfaceC33342OoooOo0 interfaceC33342OoooOo0OooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO, "<this>");
        List<InterfaceC32637OoooOoo> declaredTypeParameters = oooO.OooOOOO();
        kotlin.jvm.internal.OooOOO0.OooO0o(declaredTypeParameters, "declaredTypeParameters");
        if (!oooO.OooOo00() && !(oooO.OooO0Oo() instanceof oO0O0OO.OooO00o)) {
            return declaredTypeParameters;
        }
        int i = C33194OooO0O0.f120130OooO00o;
        C33196OooO0Oo c33196OooO0Oo = C33196OooO0Oo.f120134OooOo0o;
        InterfaceC33569OooO0oo interfaceC33569OooO0ooOooOO0o = C33576OooOOOo.OooOO0o(C33574OooOOO0.OooO(oooO, c33196OooO0Oo), 1);
        OooO00o predicate = OooO00o.f117293OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(predicate, "predicate");
        List listOooOo0 = C33576OooOOOo.OooOo0(C33576OooOOOo.OooOOOo(C33576OooOOOo.OooOOO0(new C33578OooOOo0(interfaceC33569OooO0ooOooOO0o, predicate), OooO0O0.f117294OooOo0o), OooO0OO.f117295OooOo0o));
        Iterator it = C33576OooOOOo.OooOO0o(C33574OooOOO0.OooO(oooO, c33196OooO0Oo), 1).iterator();
        while (true) {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof InterfaceC32596OooO0o0) {
                break;
            }
        }
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = (InterfaceC32596OooO0o0) next;
        if (interfaceC32596OooO0o0 != null && (interfaceC33342OoooOo0OooO = interfaceC32596OooO0o0.OooO()) != null) {
            parameters = interfaceC33342OoooOo0OooO.getParameters();
        }
        if (parameters == null) {
            parameters = C34434OooOoO.f123453OooOo0o;
        }
        if (listOooOo0.isEmpty() && parameters.isEmpty()) {
            List<InterfaceC32637OoooOoo> declaredTypeParameters2 = oooO.OooOOOO();
            kotlin.jvm.internal.OooOOO0.OooO0o(declaredTypeParameters2, "declaredTypeParameters");
            return declaredTypeParameters2;
        }
        ArrayList<InterfaceC32637OoooOoo> arrayListOooooOO = oOo000Oo.OooOo.OooooOO(listOooOo0, parameters);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO, 10));
        for (InterfaceC32637OoooOoo it2 : arrayListOooooOO) {
            kotlin.jvm.internal.OooOOO0.OooO0o(it2, "it");
            arrayList.add(new oO0O0OO.OooO0OO(it2, oooO, declaredTypeParameters.size()));
        }
        return oOo000Oo.OooOo.OooooOO(declaredTypeParameters, arrayList);
    }
}
