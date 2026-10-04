package oO0O0ooo;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import o000oo0.C24684Oooo;
import o0Oo0o0o.C28258Oooo0o0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0Oo0.EnumC33191OooO0Oo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34437OooOoo;
import oOo000Oo.C34439OooOooO;
import oOo000Oo.C34440OooOooo;
import oOo000Oo.Oooo0;
import ooo0o.C35199OooOo0O;

/* JADX INFO: renamed from: oO0O0ooo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32874OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashMap f117961OooO00o = new LinkedHashMap();

    /* JADX INFO: renamed from: oO0O0ooo.OooOo0$OooO00o */
    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f117962OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ C32874OooOo0 f117963OooO0O0;

        /* JADX INFO: renamed from: oO0O0ooo.OooOo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public final class C20260OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f117964OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final ArrayList f117965OooO0O0 = new ArrayList();

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public C32443OooOOO<String, C32873OooOo> f117966OooO0OO = new C32443OooOOO<>("V", null);

            public C20260OooO00o(OooO00o oooO00o, String str) {
                this.f117964OooO00o = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void OooO00o(String type, C32847OooO0oo... c32847OooO0ooArr) {
                C32873OooOo c32873OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
                ArrayList arrayList = this.f117965OooO0O0;
                if (c32847OooO0ooArr.length == 0) {
                    c32873OooOo = null;
                } else {
                    C34439OooOooO c34439OooOooO = new C34439OooOooO(new C28258Oooo0o0(c32847OooO0ooArr, 1));
                    int iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(c34439OooOooO, 10));
                    if (iOooO0Oo < 16) {
                        iOooO0Oo = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                    Iterator it = c34439OooOooO.iterator();
                    while (true) {
                        C34440OooOooo c34440OooOooo = (C34440OooOooo) it;
                        if (!c34440OooOooo.f123461OooOo0o.hasNext()) {
                            break;
                        }
                        C34437OooOoo c34437OooOoo = (C34437OooOoo) c34440OooOooo.next();
                        linkedHashMap.put(Integer.valueOf(c34437OooOoo.f123456OooO00o), (C32847OooO0oo) c34437OooOoo.f123457OooO0O0);
                    }
                    c32873OooOo = new C32873OooOo(linkedHashMap);
                }
                arrayList.add(new C32443OooOOO(type, c32873OooOo));
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void OooO0O0(String type, C32847OooO0oo... c32847OooO0ooArr) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
                C34439OooOooO c34439OooOooO = new C34439OooOooO(new C28258Oooo0o0(c32847OooO0ooArr, 1));
                int iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(c34439OooOooO, 10));
                if (iOooO0Oo < 16) {
                    iOooO0Oo = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                Iterator it = c34439OooOooO.iterator();
                while (true) {
                    C34440OooOooo c34440OooOooo = (C34440OooOooo) it;
                    if (!c34440OooOooo.f123461OooOo0o.hasNext()) {
                        this.f117966OooO0OO = new C32443OooOOO<>(type, new C32873OooOo(linkedHashMap));
                        return;
                    } else {
                        C34437OooOoo c34437OooOoo = (C34437OooOoo) c34440OooOooo.next();
                        linkedHashMap.put(Integer.valueOf(c34437OooOoo.f123456OooO00o), (C32847OooO0oo) c34437OooOoo.f123457OooO0O0);
                    }
                }
            }

            public final void OooO0OO(EnumC33191OooO0Oo type) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
                String strOooO0OO = type.OooO0OO();
                kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO, "type.desc");
                this.f117966OooO0OO = new C32443OooOOO<>(strOooO0OO, null);
            }
        }

        public OooO00o(C32874OooOo0 c32874OooOo0, String className) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(className, "className");
            this.f117963OooO0O0 = c32874OooOo0;
            this.f117962OooO00o = className;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO00o(String str, InterfaceC32507OooOO0o<? super C20260OooO00o, C32460OooOooO> interfaceC32507OooOO0o) {
            LinkedHashMap linkedHashMap = this.f117963OooO0O0.f117961OooO00o;
            C20260OooO00o c20260OooO00o = new C20260OooO00o(this, str);
            interfaceC32507OooOO0o.invoke(c20260OooO00o);
            ArrayList arrayList = c20260OooO00o.f117965OooO0O0;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((C32443OooOOO) it.next()).f116638OooOo0o);
            }
            String ret = c20260OooO00o.f117966OooO0OO.f116638OooOo0o;
            String str2 = c20260OooO00o.f117964OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(ret, "ret");
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append('(');
            sb.append(oOo000Oo.OooOo.o000oOoO(arrayList2, "", null, null, C35199OooOo0O.f126386OooOo0o, 30));
            sb.append(')');
            if (ret.length() > 1) {
                ret = C24684Oooo.OooO00o(';', "L", ret);
            }
            sb.append(ret);
            String jvmDescriptor = sb.toString();
            String internalName = this.f117962OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(internalName, "internalName");
            kotlin.jvm.internal.OooOOO0.OooO0oO(jvmDescriptor, "jvmDescriptor");
            String str3 = internalName + FilenameUtils.EXTENSION_SEPARATOR + jvmDescriptor;
            C32873OooOo c32873OooOo = c20260OooO00o.f117966OooO0OO.f116637OooOo;
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add((C32873OooOo) ((C32443OooOOO) it2.next()).f116637OooOo);
            }
            linkedHashMap.put(str3, new C32851OooOOO(c32873OooOo, arrayList3));
        }
    }
}
