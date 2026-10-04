package o00Ooo;

import Oooo0.o0OoOo0;
import OooooO0.C21290OooO0o0;
import OooooO0.C21293OooOO0;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.C24035Oooo00o;
import oO00ooO.C32442OooOO0o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0O0O.OooO0OO;
import oO0O0O0o.OooOOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0O0OO.InterfaceC32636OoooOoO;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0Oo0.C32691Oooo0o;
import oO0OOOo.C32992OooOO0O;
import oO0Oo0.EnumC33191OooO0Oo;
import oO0Oo00.C33194OooO0O0;
import oO0Ooo.AbstractC33316OooOo0o;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.C33319OooOoOO;
import oO0Ooo.C33322OooOooO;
import oO0Ooo.C33339OoooOOO;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0OooO.InterfaceC33452OooO0O0;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33478OooO0Oo;
import oO0OooO0.C33479OooO0o;
import oO0OooO0.C33482OooO0oo;
import oO0Oooo.C33509OooO;
import oO0o000.C33538OooO0OO;
import oO0o0O0.C33555OooO0O0;
import oO0o0O0o.C33595OooOOo;
import oOo000Oo.C34428OooOOo;
import oOo0oooO.InterfaceC34588OooO0oO;
import ooOOO0Oo.C35048OooOoo0;
import ooo0o.C35201OooOoO0;
import ooo0o.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f85126OooO00o = 0;

    public static final boolean OooO00o(OooOo00 oooOo00) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooOo00, "<this>");
        return !oooOo00.f85150OooO0oO && oooOo00.f85147OooO0Oo;
    }

    public static final boolean OooO0O0(OooOo00 oooOo00) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooOo00, "<this>");
        return oooOo00.f85150OooO0oO && !oooOo00.f85147OooO0Oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String OooO0OO(InterfaceC32596OooO0o0 classDescriptor, ooo0o.OooOo typeMappingConfiguration) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(classDescriptor, "klass");
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeMappingConfiguration, "typeMappingConfiguration");
        typeMappingConfiguration.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(classDescriptor, "classDescriptor");
        oO0O0OO.OooOO0O oooOO0OOooO0Oo = classDescriptor.OooO0Oo();
        kotlin.jvm.internal.OooOOO0.OooO0o(oooOO0OOooO0Oo, "klass.containingDeclaration");
        C33479OooO0o name = classDescriptor.getName();
        if (name != null) {
            C33479OooO0o c33479OooO0o = C33482OooO0oo.f120983OooO00o;
            if (name.f120980OooOo) {
                name = C33482OooO0oo.f120985OooO0OO;
            }
        }
        String strOooO0OO = name.OooO0OO();
        if (oooOO0OOooO0Oo instanceof InterfaceC32620Oooo00O) {
            C33477OooO0OO c33477OooO0OOOooO0OO = ((InterfaceC32620Oooo00O) oooOO0OOooO0Oo).OooO0OO();
            if (c33477OooO0OOOooO0OO.OooO0Oo()) {
                return strOooO0OO;
            }
            return C33595OooOOo.OooOo0(c33477OooO0OOOooO0OO.OooO0O0(), FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX) + IOUtils.DIR_SEPARATOR_UNIX + strOooO0OO;
        }
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = oooOO0OOooO0Oo instanceof InterfaceC32596OooO0o0 ? (InterfaceC32596OooO0o0) oooOO0OOooO0Oo : null;
        if (interfaceC32596OooO0o0 == null) {
            throw new IllegalArgumentException("Unexpected container: " + oooOO0OOooO0Oo + " for " + classDescriptor);
        }
        return OooO0OO(interfaceC32596OooO0o0, typeMappingConfiguration) + '$' + strOooO0OO;
    }

    public static final boolean OooO0Oo(OooOo00 isOutOfBounds, long j) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(isOutOfBounds, "$this$isOutOfBounds");
        long j2 = isOutOfBounds.f85146OooO0OO;
        float fOooO0OO = C21290OooO0o0.OooO0OO(j2);
        float fOooO0Oo = C21290OooO0o0.OooO0Oo(j2);
        return fOooO0OO < 0.0f || fOooO0OO > ((float) ((int) (j >> 32))) || fOooO0Oo < 0.0f || fOooO0Oo > ((float) ((int) (j & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o(AbstractC33320OooOoo kotlinType, C35201OooOoO0 c35201OooOoO0, InterfaceC32510OooOOo0 writeGenericType) {
        OooOOO0.OooO0O0 oooO0O0;
        AbstractC33320OooOoo abstractC33320OooOoo;
        C35201OooOoO0 c35201OooOoO02;
        Object objOooO0o;
        int iOooO00o;
        EnumC33191OooO0Oo enumC33191OooO0Oo;
        OooOOO0.OooO0OO possiblyPrimitiveType;
        EnumC33191OooO0Oo enumC33191OooO0Oo2;
        AbstractC33316OooOo0o abstractC33316OooOo0oOooO0oO;
        ooo0o.OooOo oooOo = ooo0o.OooOo.f126384OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinType, "kotlinType");
        kotlin.jvm.internal.OooOOO0.OooO0oO(writeGenericType, "writeGenericType");
        Object oooO0O02 = null;
        if (oO0O0O0o.OooO0o.OooO(kotlinType)) {
            C32691Oooo0o c32691Oooo0o = oO0O0O0o.OooOOOO.f117205OooO00o;
            oO0O0O0o.OooO0o.OooO(kotlinType);
            oO0O0O0o.OooOO0 oooOO0OooO0o0 = C33538OooO0OO.OooO0o0(kotlinType);
            InterfaceC34588OooO0oO annotations = kotlinType.getAnnotations();
            AbstractC33320OooOoo abstractC33320OooOooOooO0o = oO0O0O0o.OooO0o.OooO0o(kotlinType);
            List<AbstractC33320OooOoo> listOooO0Oo = oO0O0O0o.OooO0o.OooO0Oo(kotlinType);
            List<InterfaceC33348OooooOO> listOooO0oO = oO0O0O0o.OooO0o.OooO0oO(kotlinType);
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooO0oO, 10));
            Iterator<T> it = listOooO0oO.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC33348OooooOO) it.next()).getType());
            }
            C33339OoooOOO.f120598OooOo.getClass();
            C33339OoooOOO c33339OoooOOO = C33339OoooOOO.f120599OooOoO0;
            InterfaceC33342OoooOo0 interfaceC33342OoooOo0OooO = oO0O0O0o.OooOOOO.f117205OooO00o.OooO();
            oO0O0O0o.OooO0o.OooO0oo(kotlinType);
            AbstractC33320OooOoo type = ((InterfaceC33348OooooOO) oOo000Oo.OooOo.OoooOOo(kotlinType.o000000O())).getType();
            kotlin.jvm.internal.OooOOO0.OooO0o(type, "arguments.last().type");
            return OooO0o(oO0O0O0o.OooO0o.OooO0O0(oooOO0OooO0o0, annotations, abstractC33320OooOooOooO0o, listOooO0Oo, oOo000Oo.OooOo.OooooOo(arrayList, C33322OooOooO.OooO0o0(c33339OoooOOO, interfaceC33342OoooOo0OooO, com.facebook.soloader.OooOo.OooO0oO(C33538OooO0OO.OooO00o(type)), false, null)), C33538OooO0OO.OooO0o0(kotlinType).OooOOO(), false).o00000Oo(kotlinType.o00000O0()), c35201OooOoO0, writeGenericType);
        }
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0oo = InterfaceC33452OooO0O0.OooO00o.OooO0oo(kotlinType);
        if (abstractC33328Oooo0O0OooO0oo == null && ((abstractC33316OooOo0oOooO0oO = InterfaceC33452OooO0O0.OooO00o.OooO0oO(kotlinType)) == null || (abstractC33328Oooo0O0OooO0oo = InterfaceC33452OooO0O0.OooO00o.Oooo0o(abstractC33316OooOo0oOooO0oO)) == null)) {
            abstractC33328Oooo0O0OooO0oo = InterfaceC33452OooO0O0.OooO00o.OooO0oo(kotlinType);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC33328Oooo0O0OooO0oo);
        }
        InterfaceC33342OoooOo0 receiver = InterfaceC33452OooO0O0.OooO00o.o000oOoO(abstractC33328Oooo0O0OooO0oo);
        if (InterfaceC33452OooO0O0.OooO00o.OooOo(receiver)) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
            if (!(receiver instanceof InterfaceC33342OoooOo0)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(receiver);
                sb.append(", ");
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb).toString());
            }
            InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = receiver.OooO0OO();
            kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC32598OooO0ooOooO0OO, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            oO0O0O0o.OooOO0O oooOO0OOooOOoo = oO0O0O0o.OooOO0.OooOOoo((InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0OO);
            if (oooOO0OOooOOoo != null) {
                switch (oooOO0OOooOOoo.ordinal()) {
                    case 0:
                        possiblyPrimitiveType = ooo0o.OooOOO0.f126370OooO00o;
                        break;
                    case 1:
                        possiblyPrimitiveType = ooo0o.OooOOO0.f126371OooO0O0;
                        break;
                    case 2:
                        possiblyPrimitiveType = ooo0o.OooOOO0.f126372OooO0OO;
                        break;
                    case 3:
                        possiblyPrimitiveType = ooo0o.OooOOO0.f126373OooO0Oo;
                        break;
                    case 4:
                        possiblyPrimitiveType = ooo0o.OooOOO0.f126375OooO0o0;
                        break;
                    case 5:
                        possiblyPrimitiveType = ooo0o.OooOOO0.f126374OooO0o;
                        break;
                    case 6:
                        possiblyPrimitiveType = ooo0o.OooOOO0.f126376OooO0oO;
                        break;
                    case 7:
                        possiblyPrimitiveType = ooo0o.OooOOO0.f126377OooO0oo;
                        break;
                    default:
                        throw new C32442OooOO0o();
                }
                if (!InterfaceC33452OooO0O0.OooO00o.Oooo00O(kotlinType)) {
                    C33477OooO0OO ENHANCED_NULLABILITY_ANNOTATION = C35048OooOoo0.f125865OooOOOo;
                    kotlin.jvm.internal.OooOOO0.OooO0o(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
                    boolean z = InterfaceC33452OooO0O0.OooO00o.OooOo00(kotlinType, ENHANCED_NULLABILITY_ANNOTATION);
                    kotlin.jvm.internal.OooOOO0.OooO0oO(possiblyPrimitiveType, "possiblyPrimitiveType");
                    if (!z || (enumC33191OooO0Oo2 = possiblyPrimitiveType.f126380OooO) == null) {
                        oooO0O02 = possiblyPrimitiveType;
                    } else {
                        String strOooO0o0 = oO0Oo0.OooO0OO.OooO0OO(enumC33191OooO0Oo2.OooO0o0()).OooO0o0();
                        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0o0, "byFqNameWithoutInnerClas…apperFqName).internalName");
                        oooO0O02 = new OooOOO0.OooO0O0(strOooO0o0);
                    }
                }
            } else {
                kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
                if (!(receiver instanceof InterfaceC33342OoooOo0)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(receiver);
                    sb2.append(", ");
                    throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb2).toString());
                }
                InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO2 = receiver.OooO0OO();
                kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC32598OooO0ooOooO0OO2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                oO0O0O0o.OooOO0O oooOO0OOooOOo0 = oO0O0O0o.OooOO0.OooOOo0((InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0OO2);
                if (oooOO0OOooOOo0 != null) {
                    StringBuilder sb3 = new StringBuilder("[");
                    EnumC33191OooO0Oo enumC33191OooO0Oo3 = (EnumC33191OooO0Oo) EnumC33191OooO0Oo.f120119Oooo0OO.get(oooOO0OOooOOo0);
                    if (enumC33191OooO0Oo3 == null) {
                        EnumC33191OooO0Oo.OooO00o(4);
                        throw null;
                    }
                    sb3.append(enumC33191OooO0Oo3.OooO0OO());
                    oooO0O02 = ooo0o.OooOOO.OooO00o(sb3.toString());
                } else {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
                    if (!(receiver instanceof InterfaceC33342OoooOo0)) {
                        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb4.append(receiver);
                        sb4.append(", ");
                        throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb4).toString());
                    }
                    InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO3 = receiver.OooO0OO();
                    if (interfaceC32598OooO0ooOooO0OO3 != null && oO0O0O0o.OooOO0.Oooo0(interfaceC32598OooO0ooOooO0OO3)) {
                        kotlin.jvm.internal.OooOOO0.OooO0oO(receiver, "$receiver");
                        if (!(receiver instanceof InterfaceC33342OoooOo0)) {
                            StringBuilder sb5 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb5.append(receiver);
                            sb5.append(", ");
                            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb5).toString());
                        }
                        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO4 = receiver.OooO0OO();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC32598OooO0ooOooO0OO4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        C33478OooO0Oo c33478OooO0OoOooO0oo = C33194OooO0O0.OooO0oo((InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0OO4);
                        String str = oO0O0O.OooO0OO.f116822OooO00o;
                        C33476OooO0O0 c33476OooO0O0OooO0o = oO0O0O.OooO0OO.OooO0o(c33478OooO0OoOooO0oo);
                        if (c33476OooO0O0OooO0o != null) {
                            if (!c35201OooOoO0.f126395OooO0oO) {
                                List<OooO0OO.OooO00o> list = oO0O0O.OooO0OO.f116833OooOOO;
                                if ((list instanceof Collection) && list.isEmpty()) {
                                    String strOooO0o02 = oO0Oo0.OooO0OO.OooO0O0(c33476OooO0O0OooO0o).OooO0o0();
                                    kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0o02, "byClassId(classId).internalName");
                                    oooO0O02 = new OooOOO0.OooO0O0(strOooO0o02);
                                } else {
                                    Iterator<T> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        if (((OooO0OO.OooO00o) it2.next()).f116835OooO00o.equals(c33476OooO0O0OooO0o)) {
                                            break;
                                        }
                                    }
                                    String strOooO0o022 = oO0Oo0.OooO0OO.OooO0O0(c33476OooO0O0OooO0o).OooO0o0();
                                    kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0o022, "byClassId(classId).internalName");
                                    oooO0O02 = new OooOOO0.OooO0O0(strOooO0o022);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (oooO0O02 != null) {
            if (c35201OooOoO0.f126389OooO00o && (oooO0O02 instanceof OooOOO0.OooO0OO) && (enumC33191OooO0Oo = ((OooOOO0.OooO0OO) oooO0O02).f126380OooO) != null) {
                String strOooO0o03 = oO0Oo0.OooO0OO.OooO0OO(enumC33191OooO0Oo.OooO0o0()).OooO0o0();
                kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0o03, "byFqNameWithoutInnerClas…apperFqName).internalName");
                oooO0O02 = new OooOOO0.OooO0O0(strOooO0o03);
            }
            writeGenericType.invoke(kotlinType, oooO0O02, c35201OooOoO0);
            return oooO0O02;
        }
        InterfaceC33342OoooOo0 interfaceC33342OoooOo0O00000 = kotlinType.o00000();
        if (interfaceC33342OoooOo0O00000 instanceof C33319OooOoOO) {
            C33319OooOoOO c33319OooOoOO = (C33319OooOoOO) interfaceC33342OoooOo0O00000;
            AbstractC33320OooOoo abstractC33320OooOoo2 = c33319OooOoOO.f120561OooO00o;
            if (abstractC33320OooOoo2 != null) {
                return OooO0o(C33538OooO0OO.OooOO0O(abstractC33320OooOoo2), c35201OooOoO0, writeGenericType);
            }
            LinkedHashSet<AbstractC33320OooOoo> types = c33319OooOoOO.f120562OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(types, "types");
            throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + oOo000Oo.OooOo.o000oOoO(types, null, null, null, null, 63));
        }
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO5 = interfaceC33342OoooOo0O00000.OooO0OO();
        if (interfaceC32598OooO0ooOooO0OO5 == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (C33509OooO.OooO0o(interfaceC32598OooO0ooOooO0OO5)) {
            return new OooOOO0.OooO0O0("error/NonExistentClass");
        }
        boolean z2 = interfaceC32598OooO0ooOooO0OO5 instanceof InterfaceC32596OooO0o0;
        boolean z3 = c35201OooOoO0.f126391OooO0OO;
        if (z2 && oO0O0O0o.OooOO0.OooOo(kotlinType)) {
            if (kotlinType.o000000O().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            InterfaceC33348OooooOO interfaceC33348OooooOO = kotlinType.o000000O().get(0);
            AbstractC33320OooOoo type2 = interfaceC33348OooooOO.getType();
            kotlin.jvm.internal.OooOOO0.OooO0o(type2, "memberProjection.type");
            if (interfaceC33348OooooOO.OooO0OO() == 2) {
                objOooO0o = new OooOOO0.OooO0O0("java/lang/Object");
            } else {
                int iOooO0OO = interfaceC33348OooooOO.OooO0OO();
                com.aspose.slides.Oooo0.OooO0OO(iOooO0OO, "memberProjection.projectionKind");
                if (z3 || ((iOooO00o = o0OoOo0.OooO00o(iOooO0OO)) == 0 ? (c35201OooOoO02 = c35201OooOoO0.f126388OooO) == null : !(iOooO00o == 1 ? (c35201OooOoO02 = c35201OooOoO0.f126396OooO0oo) != null : (c35201OooOoO02 = c35201OooOoO0.f126393OooO0o) != null))) {
                    c35201OooOoO02 = c35201OooOoO0;
                }
                objOooO0o = OooO0o(type2, c35201OooOoO02, writeGenericType);
            }
            return ooo0o.OooOOO.OooO00o("[" + ooo0o.OooOOO.OooO0O0((ooo0o.OooOOO0) objOooO0o));
        }
        if (!z2) {
            if (interfaceC32598OooO0ooOooO0OO5 instanceof InterfaceC32637OoooOoo) {
                AbstractC33320OooOoo abstractC33320OooOooOooO0o2 = C33538OooO0OO.OooO0o((InterfaceC32637OoooOoo) interfaceC32598OooO0ooOooO0OO5);
                if (kotlinType.o00000O0()) {
                    abstractC33320OooOooOooO0o2 = C33538OooO0OO.OooO(abstractC33320OooOooOooO0o2);
                }
                return OooO0o(abstractC33320OooOooOooO0o2, c35201OooOoO0, C33555OooO0O0.f121163OooO0O0);
            }
            if ((interfaceC32598OooO0ooOooO0OO5 instanceof InterfaceC32636OoooOoO) && c35201OooOoO0.f126397OooOO0) {
                return OooO0o(((InterfaceC32636OoooOoO) interfaceC32598OooO0ooOooO0OO5).o000oOoO(), c35201OooOoO0, writeGenericType);
            }
            throw new UnsupportedOperationException("Unknown type " + kotlinType);
        }
        if (C32992OooOO0O.OooO0O0(interfaceC32598OooO0ooOooO0OO5) && !c35201OooOoO0.f126390OooO0O0 && (abstractC33320OooOoo = (AbstractC33320OooOoo) o0O00O0o.OooO0O0.OooO0Oo(kotlinType, new HashSet())) != null) {
            return OooO0o(abstractC33320OooOoo, new C35201OooOoO0(c35201OooOoO0.f126389OooO00o, true, c35201OooOoO0.f126391OooO0OO, c35201OooOoO0.f126392OooO0Oo, c35201OooOoO0.f126394OooO0o0, c35201OooOoO0.f126393OooO0o, c35201OooOoO0.f126395OooO0oO, c35201OooOoO0.f126396OooO0oo, c35201OooOoO0.f126388OooO, 512), writeGenericType);
        }
        if (z3 && oO0O0O0o.OooOO0.OooO0O0((InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0OO5, OooOOO.OooO00o.f117180Oooo)) {
            oooO0O0 = new OooOOO0.OooO0O0("java/lang/Class");
        } else {
            InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0OO5;
            kotlin.jvm.internal.OooOOO0.OooO0o(interfaceC32596OooO0o0.o000OOo(), "descriptor.original");
            if (interfaceC32596OooO0o0.getKind() == oO0O0OO.OooO0o.f117231OooOoO) {
                oO0O0OO.OooOO0O oooOO0OOooO0Oo = interfaceC32596OooO0o0.OooO0Oo();
                kotlin.jvm.internal.OooOOO0.OooO0o0(oooOO0OOooO0Oo, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                interfaceC32596OooO0o0 = (InterfaceC32596OooO0o0) oooOO0OOooO0Oo;
            }
            InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO00o = interfaceC32596OooO0o0.o000OOo();
            kotlin.jvm.internal.OooOOO0.OooO0o(interfaceC32596OooO0o0OooO00o, "enumClassIfEnumEntry.original");
            String internalName = OooO0OO(interfaceC32596OooO0o0OooO00o, oooOo);
            kotlin.jvm.internal.OooOOO0.OooO0oO(internalName, "internalName");
            oooO0O0 = new OooOOO0.OooO0O0(internalName);
        }
        writeGenericType.invoke(kotlinType, oooO0O0, c35201OooOoO0);
        return oooO0O0;
    }

    public static final boolean OooO0o0(OooOo00 isOutOfBounds, long j, long j2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(isOutOfBounds, "$this$isOutOfBounds");
        if (isOutOfBounds.f85151OooO0oo != 1) {
            return OooO0Oo(isOutOfBounds, j);
        }
        long j3 = isOutOfBounds.f85146OooO0OO;
        float fOooO0OO = C21290OooO0o0.OooO0OO(j3);
        float fOooO0Oo = C21290OooO0o0.OooO0Oo(j3);
        return fOooO0OO < (-C21293OooOO0.OooO0Oo(j2)) || fOooO0OO > C21293OooOO0.OooO0Oo(j2) + ((float) ((int) (j >> 32))) || fOooO0Oo < (-C21293OooOO0.OooO0O0(j2)) || fOooO0Oo > C21293OooOO0.OooO0O0(j2) + ((float) ((int) (j & 4294967295L)));
    }

    public static final long OooO0oO(OooOo00 oooOo00, boolean z) {
        return (z || !oooOo00.OooO0O0()) ? C21290OooO0o0.OooO0o0(oooOo00.f85146OooO0OO, oooOo00.f85148OooO0o) : C21290OooO0o0.f61718OooO0O0;
    }
}
