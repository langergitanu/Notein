package oO0O0O0;

import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import o0Oo0ooO.C28461OooooOO;
import oO0O0O0.AbstractC32536OooO0o0;
import oO0O0OO.C32602OooOOo0;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0O0oO0.C32730OooO0Oo;
import oO0OO0Oo.C32921OooO0o0;
import oO0OO0Oo.C32922OooO0oO;
import oO0OO0Oo.InterfaceC32918OooO0OO;
import oO0OOO.AbstractC32933OooO0Oo;
import oO0OOO.C32936OooO0oo;
import oO0OOO0.OooO00o;
import oO0OOOO0.AbstractC32954OooO0oo;
import oO0OoOO.C33263OooO0Oo;
import oO0OoOO.C33276OooOOO;
import oO0OooO0.C33479OooO0o;
import oO0OooO0.C33481OooO0oO;
import oO0o0O0o.C33599OooOo0O;
import ooOOO0Oo.C35046OooOoOO;
import ooo0o.C35193OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0o {

    public static final class OooO00o extends OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Field f116899OooO00o;

        public OooO00o(Field field) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(field, "field");
            this.f116899OooO00o = field;
        }

        @Override // oO0O0O0.OooO0o
        public final String OooO00o() {
            StringBuilder sb = new StringBuilder();
            Field field = this.f116899OooO00o;
            String name = field.getName();
            kotlin.jvm.internal.OooOOO0.OooO0o(name, "field.name");
            sb.append(C35046OooOoOO.OooO00o(name));
            sb.append("()");
            Class<?> type = field.getType();
            kotlin.jvm.internal.OooOOO0.OooO0o(type, "field.type");
            sb.append(C32730OooO0Oo.OooO0O0(type));
            return sb.toString();
        }
    }

    public static final class OooO0O0 extends OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Method f116900OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Method f116901OooO0O0;

        public OooO0O0(Method getterMethod, Method method) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(getterMethod, "getterMethod");
            this.f116900OooO00o = getterMethod;
            this.f116901OooO0O0 = method;
        }

        @Override // oO0O0O0.OooO0o
        public final String OooO00o() {
            return C28461OooooOO.OooO00o(this.f116900OooO00o);
        }
    }

    public static final class OooO0OO extends OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC32627Oooo0oo f116902OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final oO0OO00.OooOOO0 f116903OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO00o.OooO0OO f116904OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final InterfaceC32918OooO0OO f116905OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final String f116906OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final C32922OooO0oO f116907OooO0o0;

        public OooO0OO(InterfaceC32627Oooo0oo interfaceC32627Oooo0oo, oO0OO00.OooOOO0 proto, OooO00o.OooO0OO oooO0OO, InterfaceC32918OooO0OO nameResolver, C32922OooO0oO typeTable) {
            String string;
            C35193OooOO0o c35193OooOO0o;
            String string2;
            kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
            kotlin.jvm.internal.OooOOO0.OooO0oO(nameResolver, "nameResolver");
            kotlin.jvm.internal.OooOOO0.OooO0oO(typeTable, "typeTable");
            this.f116902OooO00o = interfaceC32627Oooo0oo;
            this.f116903OooO0O0 = proto;
            this.f116904OooO0OO = oooO0OO;
            this.f116905OooO0Oo = nameResolver;
            this.f116907OooO0o0 = typeTable;
            if ((oooO0OO.f118866OooOo & 4) == 4) {
                string2 = nameResolver.getString(oooO0OO.f118870OooOoOO.f118858OooOoO0).concat(nameResolver.getString(oooO0OO.f118870OooOoOO.f118857OooOoO));
            } else {
                AbstractC32933OooO0Oo.OooO00o oooO00oOooO0O0 = C32936OooO0oo.OooO0O0(proto, nameResolver, typeTable, true);
                if (oooO00oOooO0O0 == null) {
                    throw new C32579OoooO0O("No field signature for property: " + interfaceC32627Oooo0oo);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(C35046OooOoOO.OooO00o(oooO00oOooO0O0.f118816OooO00o));
                oO0O0OO.OooOO0O oooOO0OOooO0Oo = interfaceC32627Oooo0oo.OooO0Oo();
                kotlin.jvm.internal.OooOOO0.OooO0o(oooOO0OOooO0Oo, "descriptor.containingDeclaration");
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC32627Oooo0oo.getVisibility(), C32602OooOOo0.f117241OooO0Oo) && (oooOO0OOooO0Oo instanceof C33263OooO0Oo)) {
                    AbstractC32954OooO0oo.C32956OooO0o0<oO0OO00.OooO0O0, Integer> classModuleName = oO0OOO0.OooO00o.f118828OooO;
                    kotlin.jvm.internal.OooOOO0.OooO0o(classModuleName, "classModuleName");
                    Integer num = (Integer) C32921OooO0o0.OooO00o(((C33263OooO0Oo) oooOO0OOooO0Oo).f120398OooOoOO, classModuleName);
                    string = "$".concat(C33481OooO0oO.f120982OooO00o.OooO0OO(num != null ? nameResolver.getString(num.intValue()) : "main", C18115b5.CONNECTOR));
                } else if (!kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC32627Oooo0oo.getVisibility(), C32602OooOOo0.f117238OooO00o) || !(oooOO0OOooO0Oo instanceof InterfaceC32620Oooo00O) || (c35193OooOO0o = ((C33276OooOOO) interfaceC32627Oooo0oo).f120475OoooOoo) == null || c35193OooOO0o.f126368OooO0OO == null) {
                    string = "";
                } else {
                    StringBuilder sb2 = new StringBuilder("$");
                    String strOooO0o0 = c35193OooOO0o.f126367OooO0O0.OooO0o0();
                    kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0o0, "className.internalName");
                    sb2.append(C33479OooO0o.OooO0o0(C33599OooOo0O.OoooOoo(IOUtils.DIR_SEPARATOR_UNIX, strOooO0o0, strOooO0o0)).OooO0O0());
                    string = sb2.toString();
                }
                sb.append(string);
                sb.append("()");
                sb.append(oooO00oOooO0O0.f118817OooO0O0);
                string2 = sb.toString();
            }
            this.f116906OooO0o = string2;
        }

        @Override // oO0O0O0.OooO0o
        public final String OooO00o() {
            return this.f116906OooO0o;
        }
    }

    /* JADX INFO: renamed from: oO0O0O0.OooO0o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C32535OooO0Oo extends OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC32536OooO0o0.C20241OooO0o0 f116908OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AbstractC32536OooO0o0.C20241OooO0o0 f116909OooO0O0;

        public C32535OooO0Oo(AbstractC32536OooO0o0.C20241OooO0o0 c20241OooO0o0, AbstractC32536OooO0o0.C20241OooO0o0 c20241OooO0o02) {
            this.f116908OooO00o = c20241OooO0o0;
            this.f116909OooO0O0 = c20241OooO0o02;
        }

        @Override // oO0O0O0.OooO0o
        public final String OooO00o() {
            return this.f116908OooO00o.f116918OooO0O0;
        }
    }

    public abstract String OooO00o();
}
