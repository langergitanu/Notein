package oO0Ooo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o0Oo0o00.o0OOO0o;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32636OoooOoO;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Oo0o0.OooOO0;
import oO0Ooo.C33334OoooO;
import oO0Ooo.C33339OoooOOO;
import oO0Oooo.C33509OooO;
import oO0Oooo.EnumC33517OooO0oo;
import oO0o000.C33536OooO00o;
import oO0o000.C33537OooO0O0;
import oO0o000.C33538OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: oO0Ooo.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33337OoooO0O {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static C33339OoooOOO OooO0O0(AbstractC33354o00o0O abstractC33354o00o0O, C33339OoooOOO c33339OoooOOO) {
        if (o0OOO0o.OooO0O0(abstractC33354o00o0O)) {
            return abstractC33354o00o0O.o000000o();
        }
        C33339OoooOOO other = abstractC33354o00o0O.o000000o();
        c33339OoooOOO.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        if (c33339OoooOOO.isEmpty() && other.isEmpty()) {
            return c33339OoooOOO;
        }
        ArrayList arrayList = new ArrayList();
        Collection<Integer> collectionValues = C33339OoooOOO.f120598OooOo.f126294OooO00o.values();
        kotlin.jvm.internal.OooOOO0.OooO0o(collectionValues, "idPerType.values");
        Iterator<Integer> it = collectionValues.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            AbstractC33338OoooOO0 abstractC33338OoooOO0 = (AbstractC33338OoooOO0) c33339OoooOOO.f126231OooOo0o.get(iIntValue);
            AbstractC33338OoooOO0 abstractC33338OoooOO02 = (AbstractC33338OoooOO0) other.f126231OooOo0o.get(iIntValue);
            Oooo0.OooOo00.OooOO0(arrayList, abstractC33338OoooOO0 == null ? abstractC33338OoooOO02 != null ? abstractC33338OoooOO02.OooO00o(abstractC33338OoooOO0) : null : abstractC33338OoooOO0.OooO00o(abstractC33338OoooOO02));
        }
        return C33339OoooOOO.OooO00o.OooO0OO(arrayList);
    }

    public final void OooO00o(InterfaceC34588OooO0oO interfaceC34588OooO0oO, InterfaceC34588OooO0oO interfaceC34588OooO0oO2) {
        HashSet hashSet = new HashSet();
        Iterator<oOo0oooO.OooO0OO> it = interfaceC34588OooO0oO.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().OooO0OO());
        }
        Iterator<oOo0oooO.OooO0OO> it2 = interfaceC34588OooO0oO2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(it2.next().OooO0OO());
        }
    }

    public final AbstractC33328Oooo0O0 OooO0OO(C33334OoooO c33334OoooO, C33339OoooOOO c33339OoooOOO, boolean z, int i, boolean z2) {
        InterfaceC32636OoooOoO interfaceC32636OoooOoO = c33334OoooO.f120594OooO0O0;
        InterfaceC33348OooooOO interfaceC33348OooooOOOooO0Oo = OooO0Oo(new C33351Oooooo0(1, interfaceC32636OoooOoO.o0ooOOo()), c33334OoooO, null, i);
        AbstractC33320OooOoo type = interfaceC33348OooooOOOooO0Oo.getType();
        kotlin.jvm.internal.OooOOO0.OooO0o(type, "expandedProjection.type");
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO00o = C33353Ooooooo.OooO00o(type);
        if (o0OOO0o.OooO0O0(abstractC33328Oooo0O0OooO00o)) {
            return abstractC33328Oooo0O0OooO00o;
        }
        interfaceC33348OooooOOOooO0Oo.OooO0OO();
        OooO00o(abstractC33328Oooo0O0OooO00o.getAnnotations(), C33304OooOO0o.OooO00o(c33339OoooOOO));
        if (!o0OOO0o.OooO0O0(abstractC33328Oooo0O0OooO00o)) {
            abstractC33328Oooo0O0OooO00o = C33353Ooooooo.OooO0Oo(abstractC33328Oooo0O0OooO00o, null, OooO0O0(abstractC33328Oooo0O0OooO00o, c33339OoooOOO), 1);
        }
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOO0 = o00Oo0.OooOO0(abstractC33328Oooo0O0OooO00o, z);
        if (!z2) {
            return abstractC33328Oooo0O0OooOO0;
        }
        InterfaceC33342OoooOo0 interfaceC33342OoooOo0OooO = interfaceC32636OoooOoO.OooO();
        kotlin.jvm.internal.OooOOO0.OooO0o(interfaceC33342OoooOo0OooO, "descriptor.typeConstructor");
        return C33332Oooo0oO.OooO0OO(abstractC33328Oooo0O0OooOO0, C33322OooOooO.OooO0o(c33334OoooO.f120595OooO0OO, OooOO0.OooO0O0.f120222OooO0O0, c33339OoooOOO, interfaceC33342OoooOo0OooO, z));
    }

    public final InterfaceC33348OooooOO OooO0Oo(InterfaceC33348OooooOO interfaceC33348OooooOO, C33334OoooO c33334OoooO, InterfaceC32637OoooOoo interfaceC32637OoooOoo, int i) {
        int iOooOo0;
        AbstractC33320OooOoo abstractC33320OooOooOooO0Oo;
        InterfaceC32636OoooOoO typeAlias = c33334OoooO.f120594OooO0O0;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + typeAlias.getName());
        }
        if (interfaceC33348OooooOO.OooO00o()) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC32637OoooOoo);
            return o00Oo0.OooOO0O(interfaceC32637OoooOoo);
        }
        AbstractC33320OooOoo type = interfaceC33348OooooOO.getType();
        kotlin.jvm.internal.OooOOO0.OooO0o(type, "underlyingProjection.type");
        InterfaceC33342OoooOo0 constructor = type.o00000();
        kotlin.jvm.internal.OooOOO0.OooO0oO(constructor, "constructor");
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = constructor.OooO0OO();
        InterfaceC33348OooooOO interfaceC33348OooooOO2 = interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32637OoooOoo ? c33334OoooO.f120596OooO0Oo.get(interfaceC32598OooO0ooOooO0OO) : null;
        if (interfaceC33348OooooOO2 != null) {
            if (interfaceC33348OooooOO2.OooO00o()) {
                kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC32637OoooOoo);
                return o00Oo0.OooOO0O(interfaceC32637OoooOoo);
            }
            AbstractC33354o00o0O abstractC33354o00o0OO00000OO = interfaceC33348OooooOO2.getType().o00000OO();
            int iOooO0OO = interfaceC33348OooooOO2.OooO0OO();
            com.aspose.slides.Oooo0.OooO0OO(iOooO0OO, "argument.projectionKind");
            int iOooO0OO2 = interfaceC33348OooooOO.OooO0OO();
            com.aspose.slides.Oooo0.OooO0OO(iOooO0OO2, "underlyingProjection.projectionKind");
            if (iOooO0OO2 != iOooO0OO && iOooO0OO2 != 1) {
                if (iOooO0OO == 1) {
                    iOooO0OO = iOooO0OO2;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(typeAlias, "typeAlias");
                }
            }
            if (interfaceC32637OoooOoo == null || (iOooOo0 = interfaceC32637OoooOoo.OooOo0()) == 0) {
                iOooOo0 = 1;
            }
            if (iOooOo0 != iOooO0OO && iOooOo0 != 1) {
                if (iOooO0OO == 1) {
                    iOooO0OO = 1;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(typeAlias, "typeAlias");
                }
            }
            OooO00o(type.getAnnotations(), abstractC33354o00o0OO00000OO.getAnnotations());
            if (abstractC33354o00o0OO00000OO instanceof C33313OooOo0) {
                C33313OooOo0 c33313OooOo0 = (C33313OooOo0) abstractC33354o00o0OO00000OO;
                C33339OoooOOO newAttributes = OooO0O0(c33313OooOo0, type.o000000o());
                kotlin.jvm.internal.OooOOO0.OooO0oO(newAttributes, "newAttributes");
                abstractC33320OooOooOooO0Oo = new C33313OooOo0(C33538OooO0OO.OooO0o0(c33313OooOo0.f120555OooOoO0), newAttributes);
            } else {
                AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooOO0 = o00Oo0.OooOO0(C33353Ooooooo.OooO00o(abstractC33354o00o0OO00000OO), type.o00000O0());
                C33339OoooOOO c33339OoooOOOO000000o = type.o000000o();
                boolean zOooO0O0 = o0OOO0o.OooO0O0(abstractC33328Oooo0O0OooOO0);
                abstractC33320OooOooOooO0Oo = abstractC33328Oooo0O0OooOO0;
                if (!zOooO0O0) {
                    abstractC33320OooOooOooO0Oo = C33353Ooooooo.OooO0Oo(abstractC33328Oooo0O0OooOO0, null, OooO0O0(abstractC33328Oooo0O0OooOO0, c33339OoooOOOO000000o), 1);
                }
            }
            return new C33351Oooooo0(iOooO0OO, abstractC33320OooOooOooO0Oo);
        }
        AbstractC33354o00o0O abstractC33354o00o0OO00000OO2 = interfaceC33348OooooOO.getType().o00000OO();
        if (!C33315OooOo0O.OooO00o(abstractC33354o00o0OO00000OO2)) {
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO00o = C33353Ooooooo.OooO00o(abstractC33354o00o0OO00000OO2);
            if (!o0OOO0o.OooO0O0(abstractC33328Oooo0O0OooO00o)) {
                C33537OooO0O0 predicate = C33537OooO0O0.f121137OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(predicate, "predicate");
                if (o00Oo0.OooO0Oo(abstractC33328Oooo0O0OooO00o, predicate, null)) {
                    InterfaceC33342OoooOo0 interfaceC33342OoooOo0O00000 = abstractC33328Oooo0O0OooO00o.o00000();
                    InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO2 = interfaceC33342OoooOo0O00000.OooO0OO();
                    interfaceC33342OoooOo0O00000.getParameters().size();
                    abstractC33328Oooo0O0OooO00o.o000000O().size();
                    if (!(interfaceC32598OooO0ooOooO0OO2 instanceof InterfaceC32637OoooOoo)) {
                        int i2 = 0;
                        if (!(interfaceC32598OooO0ooOooO0OO2 instanceof InterfaceC32636OoooOoO)) {
                            AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0o0 = OooO0o0(abstractC33328Oooo0O0OooO00o, c33334OoooO, i);
                            C33356ooOO.OooO0Oo(abstractC33328Oooo0O0OooO0o0);
                            for (Object obj : abstractC33328Oooo0O0OooO0o0.o000000O()) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    C34429OooOOo0.OooOOo();
                                    throw null;
                                }
                                InterfaceC33348OooooOO interfaceC33348OooooOO3 = (InterfaceC33348OooooOO) obj;
                                if (!interfaceC33348OooooOO3.OooO00o()) {
                                    AbstractC33320OooOoo type2 = interfaceC33348OooooOO3.getType();
                                    kotlin.jvm.internal.OooOOO0.OooO0o(type2, "substitutedArgument.type");
                                    C33536OooO00o predicate2 = C33536OooO00o.f121136OooOo0o;
                                    kotlin.jvm.internal.OooOOO0.OooO0oO(predicate2, "predicate");
                                    if (!o00Oo0.OooO0Oo(type2, predicate2, null)) {
                                        abstractC33328Oooo0O0OooO00o.o000000O().get(i2);
                                        abstractC33328Oooo0O0OooO00o.o00000().getParameters().get(i2);
                                    }
                                }
                                i2 = i3;
                            }
                            return new C33351Oooooo0(interfaceC33348OooooOO.OooO0OO(), abstractC33328Oooo0O0OooO0o0);
                        }
                        InterfaceC32636OoooOoO interfaceC32636OoooOoO = (InterfaceC32636OoooOoO) interfaceC32598OooO0ooOooO0OO2;
                        if (c33334OoooO.OooO00o(interfaceC32636OoooOoO)) {
                            EnumC33517OooO0oo enumC33517OooO0oo = EnumC33517OooO0oo.RECURSIVE_TYPE_ALIAS;
                            String str = interfaceC32636OoooOoO.getName().f120981OooOo0o;
                            kotlin.jvm.internal.OooOOO0.OooO0o(str, "typeDescriptor.name.toString()");
                            return new C33351Oooooo0(1, C33509OooO.OooO0OO(enumC33517OooO0oo, str));
                        }
                        List<InterfaceC33348OooooOO> listO000000O = abstractC33328Oooo0O0OooO00o.o000000O();
                        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listO000000O, 10));
                        for (Object obj2 : listO000000O) {
                            int i4 = i2 + 1;
                            if (i2 < 0) {
                                C34429OooOOo0.OooOOo();
                                throw null;
                            }
                            arrayList.add(OooO0Oo((InterfaceC33348OooooOO) obj2, c33334OoooO, interfaceC33342OoooOo0O00000.getParameters().get(i2), i + 1));
                            i2 = i4;
                        }
                        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0OO = OooO0OO(C33334OoooO.OooO00o.OooO00o(c33334OoooO, interfaceC32636OoooOoO, arrayList), abstractC33328Oooo0O0OooO00o.o000000o(), abstractC33328Oooo0O0OooO00o.o00000O0(), i + 1, false);
                        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0o02 = OooO0o0(abstractC33328Oooo0O0OooO00o, c33334OoooO, i);
                        if (!C33315OooOo0O.OooO00o(abstractC33328Oooo0O0OooO0OO)) {
                            abstractC33328Oooo0O0OooO0OO = C33332Oooo0oO.OooO0OO(abstractC33328Oooo0O0OooO0OO, abstractC33328Oooo0O0OooO0o02);
                        }
                        return new C33351Oooooo0(interfaceC33348OooooOO.OooO0OO(), abstractC33328Oooo0O0OooO0OO);
                    }
                }
            }
        }
        return interfaceC33348OooooOO;
    }

    public final AbstractC33328Oooo0O0 OooO0o0(AbstractC33328Oooo0O0 abstractC33328Oooo0O0, C33334OoooO c33334OoooO, int i) {
        InterfaceC33342OoooOo0 interfaceC33342OoooOo0O00000 = abstractC33328Oooo0O0.o00000();
        List<InterfaceC33348OooooOO> listO000000O = abstractC33328Oooo0O0.o000000O();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listO000000O, 10));
        int i2 = 0;
        for (Object obj : listO000000O) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            InterfaceC33348OooooOO interfaceC33348OooooOO = (InterfaceC33348OooooOO) obj;
            InterfaceC33348OooooOO interfaceC33348OooooOOOooO0Oo = OooO0Oo(interfaceC33348OooooOO, c33334OoooO, interfaceC33342OoooOo0O00000.getParameters().get(i2), i + 1);
            if (!interfaceC33348OooooOOOooO0Oo.OooO00o()) {
                interfaceC33348OooooOOOooO0Oo = new C33351Oooooo0(interfaceC33348OooooOOOooO0Oo.OooO0OO(), o00Oo0.OooO(interfaceC33348OooooOOOooO0Oo.getType(), interfaceC33348OooooOO.getType().o00000O0()));
            }
            arrayList.add(interfaceC33348OooooOOOooO0Oo);
            i2 = i3;
        }
        return C33353Ooooooo.OooO0Oo(abstractC33328Oooo0O0, arrayList, null, 2);
    }
}
