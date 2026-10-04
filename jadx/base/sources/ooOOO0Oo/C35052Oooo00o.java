package ooOOO0Oo;

import Oooo0oO.C21111o0ooOoO;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import oO00ooO.C32443OooOOO;
import oO0Oo0.EnumC33191OooO0Oo;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: ooOOO0Oo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C35052Oooo00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final LinkedHashMap f125881OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ArrayList f125882OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ArrayList f125883OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f125884OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final LinkedHashMap f125885OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Set<String> f125886OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Set<C33479OooO0o> f125887OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o.C20373OooO00o f125888OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Object f125889OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final ArrayList f125890OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final LinkedHashMap f125891OooOO0O;

    /* JADX INFO: renamed from: ooOOO0Oo.Oooo00o$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: ooOOO0Oo.Oooo00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20373OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final C33479OooO0o f125892OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final String f125893OooO0O0;

            public C20373OooO00o(C33479OooO0o c33479OooO0o, String signature) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(signature, "signature");
                this.f125892OooO00o = c33479OooO0o;
                this.f125893OooO0O0 = signature;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C20373OooO00o)) {
                    return false;
                }
                C20373OooO00o c20373OooO00o = (C20373OooO00o) obj;
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f125892OooO00o, c20373OooO00o.f125892OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f125893OooO0O0, c20373OooO00o.f125893OooO0O0);
            }

            public final int hashCode() {
                return this.f125893OooO0O0.hashCode() + (this.f125892OooO00o.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NameAndSignature(name=");
                sb.append(this.f125892OooO00o);
                sb.append(", signature=");
                return C21111o0ooOoO.OooO0OO(this.f125893OooO0O0, ')', sb);
            }
        }

        public static final C20373OooO00o OooO00o(String internalName, String str, String str2, String str3) {
            ArrayList arrayList = C35052Oooo00o.f125882OooO00o;
            C33479OooO0o c33479OooO0oOooO0o0 = C33479OooO0o.OooO0o0(str);
            String jvmDescriptor = str + '(' + str2 + ')' + str3;
            kotlin.jvm.internal.OooOOO0.OooO0oO(internalName, "internalName");
            kotlin.jvm.internal.OooOOO0.OooO0oO(jvmDescriptor, "jvmDescriptor");
            return new C20373OooO00o(c33479OooO0oOooO0o0, internalName + FilenameUtils.EXTENSION_SEPARATOR + jvmDescriptor);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ooOOO0Oo.Oooo00o$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0O0 f125894OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f125895OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f125896OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0O0 f125897OooOoO0;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("ONE_COLLECTION_PARAMETER", 0);
            f125895OooOo0o = oooO0O0;
            OooO0O0 oooO0O02 = new OooO0O0("OBJECT_PARAMETER_NON_GENERIC", 1);
            f125894OooOo = oooO0O02;
            OooO0O0 oooO0O03 = new OooO0O0("OBJECT_PARAMETER_GENERIC", 2);
            f125897OooOoO0 = oooO0O03;
            f125896OooOoO = new OooO0O0[]{oooO0O0, oooO0O02, oooO0O03};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f125896OooOoO.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ooOOO0Oo.Oooo00o$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0OO f125898OooOo;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO0OO f125899OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0OO f125900OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO00o f125901OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final /* synthetic */ OooO0OO[] f125902OooOoo0;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Object f125903OooOo0o;

        /* JADX INFO: renamed from: ooOOO0Oo.Oooo00o$OooO0OO$OooO00o */
        public static final class OooO00o extends OooO0OO {
        }

        static {
            OooO0OO oooO0OO = new OooO0OO("NULL", 0, null);
            f125898OooOo = oooO0OO;
            OooO0OO oooO0OO2 = new OooO0OO("INDEX", 1, -1);
            f125900OooOoO0 = oooO0OO2;
            OooO0OO oooO0OO3 = new OooO0OO("FALSE", 2, Boolean.FALSE);
            f125899OooOoO = oooO0OO3;
            OooO00o oooO00o = new OooO00o("MAP_GET_OR_DEFAULT", 3, null);
            f125901OooOoOO = oooO00o;
            f125902OooOoo0 = new OooO0OO[]{oooO0OO, oooO0OO2, oooO0OO3, oooO00o};
        }

        public OooO0OO(String str, int i, Object obj) {
            this.f125903OooOo0o = obj;
        }

        public static OooO0OO valueOf(String str) {
            return (OooO0OO) Enum.valueOf(OooO0OO.class, str);
        }

        public static OooO0OO[] values() {
            return (OooO0OO[]) f125902OooOoo0.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> setOoooOo0 = oOo000Oo.OooOOO.OoooOo0(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(setOoooOo0, 10));
        for (String str : setOoooOo0) {
            String strOooO0OO = EnumC33191OooO0Oo.BOOLEAN.OooO0OO();
            kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO, "BOOLEAN.desc");
            arrayList.add(OooO00o.OooO00o("java/util/Collection", str, "Ljava/util/Collection;", strOooO0OO));
        }
        f125882OooO00o = arrayList;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((OooO00o.C20373OooO00o) it.next()).f125893OooO0O0);
        }
        f125883OooO0O0 = arrayList2;
        ArrayList arrayList3 = f125882OooO00o;
        ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((OooO00o.C20373OooO00o) it2.next()).f125892OooO00o.OooO0O0());
        }
        String strConcat = "java/util/".concat("Collection");
        EnumC33191OooO0Oo enumC33191OooO0Oo = EnumC33191OooO0Oo.BOOLEAN;
        String strOooO0OO2 = enumC33191OooO0Oo.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO2, "BOOLEAN.desc");
        OooO00o.C20373OooO00o c20373OooO00oOooO00o = OooO00o.OooO00o(strConcat, "contains", "Ljava/lang/Object;", strOooO0OO2);
        OooO0OO oooO0OO = OooO0OO.f125899OooOoO;
        C32443OooOOO c32443OooOOO = new C32443OooOOO(c20373OooO00oOooO00o, oooO0OO);
        String strConcat2 = "java/util/".concat("Collection");
        String strOooO0OO3 = enumC33191OooO0Oo.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO3, "BOOLEAN.desc");
        C32443OooOOO c32443OooOOO2 = new C32443OooOOO(OooO00o.OooO00o(strConcat2, "remove", "Ljava/lang/Object;", strOooO0OO3), oooO0OO);
        String strConcat3 = "java/util/".concat("Map");
        String strOooO0OO4 = enumC33191OooO0Oo.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO4, "BOOLEAN.desc");
        C32443OooOOO c32443OooOOO3 = new C32443OooOOO(OooO00o.OooO00o(strConcat3, "containsKey", "Ljava/lang/Object;", strOooO0OO4), oooO0OO);
        String strConcat4 = "java/util/".concat("Map");
        String strOooO0OO5 = enumC33191OooO0Oo.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO5, "BOOLEAN.desc");
        C32443OooOOO c32443OooOOO4 = new C32443OooOOO(OooO00o.OooO00o(strConcat4, "containsValue", "Ljava/lang/Object;", strOooO0OO5), oooO0OO);
        String strConcat5 = "java/util/".concat("Map");
        String strOooO0OO6 = enumC33191OooO0Oo.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO6, "BOOLEAN.desc");
        C32443OooOOO c32443OooOOO5 = new C32443OooOOO(OooO00o.OooO00o(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strOooO0OO6), oooO0OO);
        C32443OooOOO c32443OooOOO6 = new C32443OooOOO(OooO00o.OooO00o("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), OooO0OO.f125901OooOoOO);
        OooO00o.C20373OooO00o c20373OooO00oOooO00o2 = OooO00o.OooO00o("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        OooO0OO oooO0OO2 = OooO0OO.f125898OooOo;
        C32443OooOOO c32443OooOOO7 = new C32443OooOOO(c20373OooO00oOooO00o2, oooO0OO2);
        C32443OooOOO c32443OooOOO8 = new C32443OooOOO(OooO00o.OooO00o("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), oooO0OO2);
        String strConcat6 = "java/util/".concat("List");
        EnumC33191OooO0Oo enumC33191OooO0Oo2 = EnumC33191OooO0Oo.INT;
        String strOooO0OO7 = enumC33191OooO0Oo2.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO7, "INT.desc");
        OooO00o.C20373OooO00o c20373OooO00oOooO00o3 = OooO00o.OooO00o(strConcat6, "indexOf", "Ljava/lang/Object;", strOooO0OO7);
        OooO0OO oooO0OO3 = OooO0OO.f125900OooOoO0;
        C32443OooOOO c32443OooOOO9 = new C32443OooOOO(c20373OooO00oOooO00o3, oooO0OO3);
        String strConcat7 = "java/util/".concat("List");
        String strOooO0OO8 = enumC33191OooO0Oo2.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO8, "INT.desc");
        Map mapOooO0oo = C34444Oooo0O0.OooO0oo(c32443OooOOO, c32443OooOOO2, c32443OooOOO3, c32443OooOOO4, c32443OooOOO5, c32443OooOOO6, c32443OooOOO7, c32443OooOOO8, c32443OooOOO9, new C32443OooOOO(OooO00o.OooO00o(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strOooO0OO8), oooO0OO3));
        f125884OooO0OO = mapOooO0oo;
        LinkedHashMap linkedHashMap = new LinkedHashMap(oOo000Oo.Oooo0.OooO0Oo(mapOooO0oo.size()));
        for (Map.Entry entry : mapOooO0oo.entrySet()) {
            linkedHashMap.put(((OooO00o.C20373OooO00o) entry.getKey()).f125893OooO0O0, entry.getValue());
        }
        f125885OooO0Oo = linkedHashMap;
        LinkedHashSet linkedHashSetOooO0oo = C34449Oooo0oo.OooO0oo(f125884OooO0OO.keySet(), f125882OooO00o);
        ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(linkedHashSetOooO0oo, 10));
        Iterator it3 = linkedHashSetOooO0oo.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((OooO00o.C20373OooO00o) it3.next()).f125892OooO00o);
        }
        f125887OooO0o0 = oOo000Oo.OooOo.o0OO00O(arrayList5);
        ArrayList arrayList6 = new ArrayList(C34428OooOOo.OooOOoo(linkedHashSetOooO0oo, 10));
        Iterator it4 = linkedHashSetOooO0oo.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((OooO00o.C20373OooO00o) it4.next()).f125893OooO0O0);
        }
        f125886OooO0o = oOo000Oo.OooOo.o0OO00O(arrayList6);
        EnumC33191OooO0Oo enumC33191OooO0Oo3 = EnumC33191OooO0Oo.INT;
        String strOooO0OO9 = enumC33191OooO0Oo3.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO9, "INT.desc");
        OooO00o.C20373OooO00o c20373OooO00oOooO00o4 = OooO00o.OooO00o("java/util/List", "removeAt", strOooO0OO9, "Ljava/lang/Object;");
        f125888OooO0oO = c20373OooO00oOooO00o4;
        String strConcat8 = "java/lang/".concat("Number");
        String strOooO0OO10 = EnumC33191OooO0Oo.BYTE.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO10, "BYTE.desc");
        C32443OooOOO c32443OooOOO10 = new C32443OooOOO(OooO00o.OooO00o(strConcat8, "toByte", "", strOooO0OO10), C33479OooO0o.OooO0o0("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strOooO0OO11 = EnumC33191OooO0Oo.SHORT.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO11, "SHORT.desc");
        C32443OooOOO c32443OooOOO11 = new C32443OooOOO(OooO00o.OooO00o(strConcat9, "toShort", "", strOooO0OO11), C33479OooO0o.OooO0o0("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strOooO0OO12 = enumC33191OooO0Oo3.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO12, "INT.desc");
        C32443OooOOO c32443OooOOO12 = new C32443OooOOO(OooO00o.OooO00o(strConcat10, "toInt", "", strOooO0OO12), C33479OooO0o.OooO0o0("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strOooO0OO13 = EnumC33191OooO0Oo.LONG.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO13, "LONG.desc");
        C32443OooOOO c32443OooOOO13 = new C32443OooOOO(OooO00o.OooO00o(strConcat11, "toLong", "", strOooO0OO13), C33479OooO0o.OooO0o0("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strOooO0OO14 = EnumC33191OooO0Oo.FLOAT.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO14, "FLOAT.desc");
        C32443OooOOO c32443OooOOO14 = new C32443OooOOO(OooO00o.OooO00o(strConcat12, "toFloat", "", strOooO0OO14), C33479OooO0o.OooO0o0("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strOooO0OO15 = EnumC33191OooO0Oo.DOUBLE.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO15, "DOUBLE.desc");
        C32443OooOOO c32443OooOOO15 = new C32443OooOOO(OooO00o.OooO00o(strConcat13, "toDouble", "", strOooO0OO15), C33479OooO0o.OooO0o0("doubleValue"));
        C32443OooOOO c32443OooOOO16 = new C32443OooOOO(c20373OooO00oOooO00o4, C33479OooO0o.OooO0o0("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strOooO0OO16 = enumC33191OooO0Oo3.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO16, "INT.desc");
        String strOooO0OO17 = EnumC33191OooO0Oo.CHAR.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO17, "CHAR.desc");
        Map mapOooO0oo2 = C34444Oooo0O0.OooO0oo(c32443OooOOO10, c32443OooOOO11, c32443OooOOO12, c32443OooOOO13, c32443OooOOO14, c32443OooOOO15, c32443OooOOO16, new C32443OooOOO(OooO00o.OooO00o(strConcat14, "get", strOooO0OO16, strOooO0OO17), C33479OooO0o.OooO0o0("charAt")));
        f125889OooO0oo = mapOooO0oo2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(oOo000Oo.Oooo0.OooO0Oo(mapOooO0oo2.size()));
        for (Map.Entry entry2 : mapOooO0oo2.entrySet()) {
            linkedHashMap2.put(((OooO00o.C20373OooO00o) entry2.getKey()).f125893OooO0O0, entry2.getValue());
        }
        f125881OooO = linkedHashMap2;
        Set setKeySet = f125889OooO0oo.keySet();
        ArrayList arrayList7 = new ArrayList(C34428OooOOo.OooOOoo(setKeySet, 10));
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((OooO00o.C20373OooO00o) it5.next()).f125892OooO00o);
        }
        f125890OooOO0 = arrayList7;
        Set<Map.Entry> setEntrySet = f125889OooO0oo.entrySet();
        ArrayList<C32443OooOOO> arrayList8 = new ArrayList(C34428OooOOo.OooOOoo(setEntrySet, 10));
        for (Map.Entry entry3 : setEntrySet) {
            arrayList8.add(new C32443OooOOO(((OooO00o.C20373OooO00o) entry3.getKey()).f125892OooO00o, entry3.getValue()));
        }
        int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList8, 10));
        if (iOooO0Oo < 16) {
            iOooO0Oo = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iOooO0Oo);
        for (C32443OooOOO c32443OooOOO17 : arrayList8) {
            linkedHashMap3.put((C33479OooO0o) c32443OooOOO17.f116637OooOo, (C33479OooO0o) c32443OooOOO17.f116638OooOo0o);
        }
        f125891OooOO0O = linkedHashMap3;
    }
}
