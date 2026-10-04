package o000ooOO;

import OoooooO.C21445Oooo;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o000oo.C24649OooO00o;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o000oooo.C24767OooO0o0;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32463OooO;
import oO00ooOO.C32466OooO0OO;
import oO0o0O0o.C33591OooOOO;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34449Oooo0oo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f83926OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f83927OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractSet f83928OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AbstractSet f83929OooO0Oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f83930OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f83931OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f83932OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f83933OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f83934OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final String f83935OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f83936OooO0oO;

        public OooO00o(String name, String type, boolean z, int i, String str, int i2) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
            kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
            this.f83930OooO00o = name;
            this.f83931OooO0O0 = type;
            this.f83932OooO0OO = z;
            this.f83933OooO0Oo = i;
            this.f83935OooO0o0 = str;
            this.f83934OooO0o = i2;
            String upperCase = type.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
            this.f83936OooO0oO = C33599OooOo0O.OooOoOO(upperCase, "INT", false) ? 3 : (C33599OooOo0O.OooOoOO(upperCase, "CHAR", false) || C33599OooOo0O.OooOoOO(upperCase, "CLOB", false) || C33599OooOo0O.OooOoOO(upperCase, "TEXT", false)) ? 2 : C33599OooOo0O.OooOoOO(upperCase, "BLOB", false) ? 5 : (C33599OooOo0O.OooOoOO(upperCase, "REAL", false) || C33599OooOo0O.OooOoOO(upperCase, "FLOA", false) || C33599OooOo0O.OooOoOO(upperCase, "DOUB", false)) ? 4 : 1;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof OooO00o) {
                    OooO00o oooO00o = (OooO00o) obj;
                    if ((this.f83933OooO0Oo > 0) == (oooO00o.f83933OooO0Oo > 0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83930OooO00o, oooO00o.f83930OooO00o) && this.f83932OooO0OO == oooO00o.f83932OooO0OO) {
                        int i = oooO00o.f83934OooO0o;
                        String str = oooO00o.f83935OooO0o0;
                        int i2 = this.f83934OooO0o;
                        String str2 = this.f83935OooO0o0;
                        if ((i2 != 1 || i != 2 || str2 == null || C24744OooOOo.OooO00o(str2, str)) && ((i2 != 2 || i != 1 || str == null || C24744OooOOo.OooO00o(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : C24744OooOOo.OooO00o(str2, str))) && this.f83936OooO0oO == oooO00o.f83936OooO0oO))) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((((this.f83930OooO00o.hashCode() * 31) + this.f83936OooO0oO) * 31) + (this.f83932OooO0OO ? 1231 : 1237)) * 31) + this.f83933OooO0Oo;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
            sb.append(this.f83930OooO00o);
            sb.append("',\n            |   type = '");
            sb.append(this.f83931OooO0O0);
            sb.append("',\n            |   affinity = '");
            sb.append(this.f83936OooO0oO);
            sb.append("',\n            |   notNull = '");
            sb.append(this.f83932OooO0OO);
            sb.append("',\n            |   primaryKeyPosition = '");
            sb.append(this.f83933OooO0Oo);
            sb.append("',\n            |   defaultValue = '");
            String str = this.f83935OooO0o0;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'\n            |}\n        ");
            return C33591OooOOO.OooO0oO(C33591OooOOO.OooO(sb.toString()));
        }
    }

    public static final class OooO0O0 {
        /* JADX WARN: Finally extract failed */
        public static OooOOOO OooO00o(InterfaceC24747OooO0O0 connection, String str) throws Exception {
            Map mapOooO0O0;
            C32463OooO c32463OooOOooO0Oo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(connection, "connection");
            InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo("PRAGMA table_info(`" + str + "`)");
            try {
                long j = 0;
                if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                    int iOooO00o = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, "name");
                    int iOooO00o2 = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, C18437z2.f56754h);
                    int iOooO00o3 = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, "notnull");
                    int iOooO00o4 = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, "pk");
                    int iOooO00o5 = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, "dflt_value");
                    C32466OooO0OO c32466OooO0OO = new C32466OooO0OO();
                    do {
                        String strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO00o);
                        c32466OooO0OO.put(strO000OoO, new OooO00o(strO000OoO, interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO00o2), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO00o3) != 0, (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO00o4), interfaceC24749OooO0OoO0ooOOo.isNull(iOooO00o5) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO00o5), 2));
                    } while (interfaceC24749OooO0OoO0ooOOo.o00oO0o());
                    mapOooO0O0 = c32466OooO0OO.OooO0O0();
                    interfaceC24749OooO0OoO0ooOOo.close();
                } else {
                    mapOooO0O0 = C34436OooOoOO.f123455OooOo0o;
                    interfaceC24749OooO0OoO0ooOOo.close();
                }
                interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo("PRAGMA foreign_key_list(`" + str + "`)");
                try {
                    int iOooO00o6 = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO00o7 = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, "seq");
                    int iOooO00o8 = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, "table");
                    int iOooO00o9 = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, "on_delete");
                    int iOooO00o10 = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, "on_update");
                    List<OooO> listOooO00o = OooOOO.OooO00o(interfaceC24749OooO0OoO0ooOOo);
                    interfaceC24749OooO0OoO0ooOOo.reset();
                    C32463OooO c32463OooO = new C32463OooO();
                    while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        if (interfaceC24749OooO0OoO0ooOOo.getLong(iOooO00o7) == j) {
                            int i = (int) interfaceC24749OooO0OoO0ooOOo.getLong(iOooO00o6);
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            int i2 = iOooO00o6;
                            ArrayList<OooO> arrayList3 = new ArrayList();
                            for (Object obj : listOooO00o) {
                                int i3 = iOooO00o7;
                                List<OooO> list = listOooO00o;
                                if (((OooO) obj).f83867OooOo0o == i) {
                                    arrayList3.add(obj);
                                }
                                iOooO00o7 = i3;
                                listOooO00o = list;
                            }
                            int i4 = iOooO00o7;
                            List<OooO> list2 = listOooO00o;
                            for (OooO oooO : arrayList3) {
                                arrayList.add(oooO.f83869OooOoO0);
                                arrayList2.add(oooO.f83868OooOoO);
                            }
                            c32463OooO.add(new OooO0OO(interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO00o8), interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO00o9), arrayList, interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO00o10), arrayList2));
                            iOooO00o6 = i2;
                            iOooO00o7 = i4;
                            listOooO00o = list2;
                            j = 0;
                        }
                    }
                    C32463OooO c32463OooOOooO0Oo2 = C34449Oooo0oo.OooO0Oo(c32463OooO);
                    interfaceC24749OooO0OoO0ooOOo.close();
                    interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo("PRAGMA index_list(`" + str + "`)");
                    try {
                        int iOooO00o11 = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, "name");
                        int iOooO00o12 = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, "origin");
                        int iOooO00o13 = OooOOO0.OooO00o(interfaceC24749OooO0OoO0ooOOo, "unique");
                        if (iOooO00o11 != -1 && iOooO00o12 != -1 && iOooO00o13 != -1) {
                            C32463OooO c32463OooO2 = new C32463OooO();
                            while (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                                if ("c".equals(interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO00o12))) {
                                    C24742OooO0Oo c24742OooO0OoOooO0O0 = OooOOO.OooO0O0(connection, interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO00o11), interfaceC24749OooO0OoO0ooOOo.getLong(iOooO00o13) == 1);
                                    if (c24742OooO0OoOooO0O0 == null) {
                                        interfaceC24749OooO0OoO0ooOOo.close();
                                    } else {
                                        c32463OooO2.add(c24742OooO0OoOooO0O0);
                                    }
                                }
                            }
                            c32463OooOOooO0Oo = C34449Oooo0oo.OooO0Oo(c32463OooO2);
                            interfaceC24749OooO0OoO0ooOOo.close();
                            return new OooOOOO(str, mapOooO0O0, c32463OooOOooO0Oo2, c32463OooOOooO0Oo);
                        }
                        interfaceC24749OooO0OoO0ooOOo.close();
                        c32463OooOOooO0Oo = null;
                        return new OooOOOO(str, mapOooO0O0, c32463OooOOooO0Oo2, c32463OooOOooO0Oo);
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f83937OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f83938OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f83939OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final List<String> f83940OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final List<String> f83941OooO0o0;

        public OooO0OO(String referenceTable, String onDelete, List columnNames, String onUpdate, List referenceColumnNames) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(referenceTable, "referenceTable");
            kotlin.jvm.internal.OooOOO0.OooO0oO(onDelete, "onDelete");
            kotlin.jvm.internal.OooOOO0.OooO0oO(onUpdate, "onUpdate");
            kotlin.jvm.internal.OooOOO0.OooO0oO(columnNames, "columnNames");
            kotlin.jvm.internal.OooOOO0.OooO0oO(referenceColumnNames, "referenceColumnNames");
            this.f83937OooO00o = referenceTable;
            this.f83938OooO0O0 = onDelete;
            this.f83939OooO0OO = onUpdate;
            this.f83940OooO0Oo = columnNames;
            this.f83941OooO0o0 = referenceColumnNames;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83937OooO00o, oooO0OO.f83937OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83938OooO0O0, oooO0OO.f83938OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83939OooO0OO, oooO0OO.f83939OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83940OooO0Oo, oooO0OO.f83940OooO0Oo)) {
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83941OooO0o0, oooO0OO.f83941OooO0o0);
            }
            return false;
        }

        public final int hashCode() {
            return this.f83941OooO0o0.hashCode() + C21445Oooo.OooO00o(this.f83940OooO0Oo, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f83937OooO00o.hashCode() * 31, 31, this.f83938OooO0O0), 31, this.f83939OooO0OO), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
            sb.append(this.f83937OooO00o);
            sb.append("',\n            |   onDelete = '");
            sb.append(this.f83938OooO0O0);
            sb.append("',\n            |   onUpdate = '");
            sb.append(this.f83939OooO0OO);
            sb.append("',\n            |   columnNames = {");
            C33591OooOOO.OooO0oO(OooOo.o000oOoO(OooOo.ooOO(this.f83940OooO0Oo), ",", null, null, null, 62));
            C33591OooOOO.OooO0oO("},");
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            sb.append(c32460OooOooO);
            sb.append("\n            |   referenceColumnNames = {");
            C33591OooOOO.OooO0oO(OooOo.o000oOoO(OooOo.ooOO(this.f83941OooO0o0), ",", null, null, null, 62));
            C33591OooOOO.OooO0oO(" }");
            sb.append(c32460OooOooO);
            sb.append("\n            |}\n        ");
            return C33591OooOOO.OooO0oO(C33591OooOOO.OooO(sb.toString()));
        }
    }

    public OooOOOO(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(foreignKeys, "foreignKeys");
        this.f83926OooO00o = str;
        this.f83927OooO0O0 = map;
        this.f83928OooO0OO = foreignKeys;
        this.f83929OooO0Oo = abstractSet;
    }

    public static final OooOOOO OooO00o(InterfaceC24747OooO0O0 interfaceC24747OooO0O0, String str) {
        return OooO0O0.OooO00o(interfaceC24747OooO0O0, str);
    }

    public static final OooOOOO OooO0O0(C24767OooO0o0 c24767OooO0o0, String str) {
        return OooO0O0.OooO00o(new C24649OooO00o(c24767OooO0o0), str);
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOOO)) {
            return false;
        }
        OooOOOO oooOOOO = (OooOOOO) obj;
        if (!this.f83926OooO00o.equals(oooOOOO.f83926OooO00o) || !this.f83927OooO0O0.equals(oooOOOO.f83927OooO0O0) || !kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83928OooO0OO, oooOOOO.f83928OooO0OO)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f83929OooO0Oo;
        if (abstractSet2 == null || (abstractSet = oooOOOO.f83929OooO0Oo) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f83928OooO0OO.hashCode() + ((this.f83927OooO0O0.hashCode() + (this.f83926OooO00o.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.f83926OooO00o);
        sb.append("',\n            |    columns = {");
        sb.append(C24744OooOOo.OooO0O0(OooOo.o00O0O(this.f83927OooO0O0.values(), new C24743OooOOOo())));
        sb.append("\n            |    foreignKeys = {");
        sb.append(C24744OooOOo.OooO0O0(this.f83928OooO0OO));
        sb.append("\n            |    indices = {");
        AbstractSet abstractSet = this.f83929OooO0Oo;
        sb.append(C24744OooOOo.OooO0O0(abstractSet != null ? OooOo.o00O0O(abstractSet, new C24745OooOOo0(0)) : C34434OooOoO.f123453OooOo0o));
        sb.append("\n            |}\n        ");
        return C33591OooOOO.OooO(sb.toString());
    }

    /* JADX INFO: renamed from: o000ooOO.OooOOOO$OooO0Oo, reason: case insensitive filesystem */
    public static final class C24742OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f83942OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f83943OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final List<String> f83944OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final List<String> f83945OooO0Oo;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public C24742OooO0Oo(String name, boolean z, List<String> columns, List<String> orders) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
            kotlin.jvm.internal.OooOOO0.OooO0oO(columns, "columns");
            kotlin.jvm.internal.OooOOO0.OooO0oO(orders, "orders");
            this.f83942OooO00o = name;
            this.f83943OooO0O0 = z;
            this.f83944OooO0OO = columns;
            this.f83945OooO0Oo = orders;
            List<String> arrayList = orders;
            if (arrayList.isEmpty()) {
                int size = columns.size();
                arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add("ASC");
                }
            }
            this.f83945OooO0Oo = (List) arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C24742OooO0Oo) {
                C24742OooO0Oo c24742OooO0Oo = (C24742OooO0Oo) obj;
                if (this.f83943OooO0O0 == c24742OooO0Oo.f83943OooO0O0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83944OooO0OO, c24742OooO0Oo.f83944OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f83945OooO0Oo, c24742OooO0Oo.f83945OooO0Oo)) {
                    String str = this.f83942OooO00o;
                    boolean zOooOoO0 = C33595OooOOo.OooOoO0(str, "index_", false);
                    String str2 = c24742OooO0Oo.f83942OooO00o;
                    return zOooOoO0 ? C33595OooOOo.OooOoO0(str2, "index_", false) : str.equals(str2);
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f83942OooO00o;
            return this.f83945OooO0Oo.hashCode() + C21445Oooo.OooO00o(this.f83944OooO0OO, (((C33595OooOOo.OooOoO0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f83943OooO0O0 ? 1 : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
            sb.append(this.f83942OooO00o);
            sb.append("',\n            |   unique = '");
            sb.append(this.f83943OooO0O0);
            sb.append("',\n            |   columns = {");
            C33591OooOOO.OooO0oO(OooOo.o000oOoO(this.f83944OooO0OO, ",", null, null, null, 62));
            C33591OooOOO.OooO0oO("},");
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            sb.append(c32460OooOooO);
            sb.append("\n            |   orders = {");
            C33591OooOOO.OooO0oO(OooOo.o000oOoO(this.f83945OooO0Oo, ",", null, null, null, 62));
            C33591OooOOO.OooO0oO(" }");
            sb.append(c32460OooOooO);
            sb.append("\n            |}\n        ");
            return C33591OooOOO.OooO0oO(C33591OooOOO.OooO(sb.toString()));
        }

        public C24742OooO0Oo(String str, List columns) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(columns, "columns");
            int size = columns.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add("ASC");
            }
            this(str, false, columns, arrayList);
        }
    }
}
