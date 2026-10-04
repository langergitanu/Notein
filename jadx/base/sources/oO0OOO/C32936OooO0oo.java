package oO0OOO;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO0OO00.C32887OooO0oo;
import oO0OO00.C32889OooOOOo;
import oO0OO00.OooO0O0;
import oO0OO00.OooOO0O;
import oO0OO00.OooOo00;
import oO0OO0Oo.C32917OooO0O0;
import oO0OO0Oo.C32920OooO0o;
import oO0OO0Oo.C32921OooO0o0;
import oO0OO0Oo.C32922OooO0oO;
import oO0OO0Oo.InterfaceC32918OooO0OO;
import oO0OOO.AbstractC32933OooO0Oo;
import oO0OOO0.OooO00o;
import oO0OOOO0.AbstractC32954OooO0oo;
import oO0OOOO0.C32951OooO0Oo;
import oO0OOOO0.InterfaceC32958OooOOOo;
import oO0OOOO0.OooOO0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO0OOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32936OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final oO0OOOO0.OooO0o f118827OooO00o;

    static {
        oO0OOOO0.OooO0o oooO0o = new oO0OOOO0.OooO0o();
        oooO0o.OooO00o(oO0OOO0.OooO00o.f118829OooO00o);
        oooO0o.OooO00o(oO0OOO0.OooO00o.f118830OooO0O0);
        oooO0o.OooO00o(oO0OOO0.OooO00o.f118831OooO0OO);
        oooO0o.OooO00o(oO0OOO0.OooO00o.f118832OooO0Oo);
        oooO0o.OooO00o(oO0OOO0.OooO00o.f118834OooO0o0);
        oooO0o.OooO00o(oO0OOO0.OooO00o.f118833OooO0o);
        oooO0o.OooO00o(oO0OOO0.OooO00o.f118835OooO0oO);
        oooO0o.OooO00o(oO0OOO0.OooO00o.f118836OooO0oo);
        oooO0o.OooO00o(oO0OOO0.OooO00o.f118828OooO);
        oooO0o.OooO00o(oO0OOO0.OooO00o.f118837OooOO0);
        oooO0o.OooO00o(oO0OOO0.OooO00o.f118838OooOO0O);
        oooO0o.OooO00o(oO0OOO0.OooO00o.f118839OooOO0o);
        oooO0o.OooO00o(oO0OOO0.OooO00o.f118841OooOOO0);
        oooO0o.OooO00o(oO0OOO0.OooO00o.f118840OooOOO);
        f118827OooO00o = oooO0o;
    }

    public static AbstractC32933OooO0Oo.OooO0O0 OooO00o(oO0OO00.OooO0OO proto, InterfaceC32918OooO0OO nameResolver, C32922OooO0oO typeTable) {
        String strO000oOoO;
        OooOOO0.OooO0oO(proto, "proto");
        OooOOO0.OooO0oO(nameResolver, "nameResolver");
        OooOOO0.OooO0oO(typeTable, "typeTable");
        AbstractC32954OooO0oo.C32956OooO0o0<oO0OO00.OooO0OO, OooO00o.OooO0O0> constructorSignature = oO0OOO0.OooO00o.f118829OooO00o;
        OooOOO0.OooO0o(constructorSignature, "constructorSignature");
        OooO00o.OooO0O0 oooO0O0 = (OooO00o.OooO0O0) C32921OooO0o0.OooO00o(proto, constructorSignature);
        String string = (oooO0O0 == null || (oooO0O0.f118855OooOo & 1) != 1) ? "<init>" : nameResolver.getString(oooO0O0.f118858OooOoO0);
        if (oooO0O0 == null || (oooO0O0.f118855OooOo & 2) != 2) {
            List<OooOo00> list = proto.f118147OooOoOO;
            OooOOO0.OooO0o(list, "proto.valueParameterList");
            List<OooOo00> list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            for (OooOo00 it : list2) {
                OooOOO0.OooO0o(it, "it");
                String strOooO0o0 = OooO0o0(C32920OooO0o.OooO0o0(it, typeTable), nameResolver);
                if (strOooO0o0 == null) {
                    return null;
                }
                arrayList.add(strOooO0o0);
            }
            strO000oOoO = OooOo.o000oOoO(arrayList, "", "(", ")V", null, 56);
        } else {
            strO000oOoO = nameResolver.getString(oooO0O0.f118857OooOoO);
        }
        return new AbstractC32933OooO0Oo.OooO0O0(string, strO000oOoO);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x0052: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0054 A[HIDDEN]
          (r4v2 java.lang.String) from 0x0055: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x0052, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static oO0OOO.AbstractC32933OooO0Oo.OooO00o OooO0O0(oO0OO00.OooOOO0 r4, oO0OO0Oo.InterfaceC32918OooO0OO r5, oO0OO0Oo.C32922OooO0oO r6, boolean r7) {
        /*
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.OooOOO0.OooO0oO(r4, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.OooOOO0.OooO0oO(r5, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.OooOOO0.OooO0oO(r6, r0)
            oO0OOOO0.OooO0oo$OooO0o0<oO0OO00.OooOOO0, oO0OOO0.OooO00o$OooO0OO> r0 = oO0OOO0.OooO00o.f118832OooO0Oo
            java.lang.String r1 = "propertySignature"
            kotlin.jvm.internal.OooOOO0.OooO0o(r0, r1)
            java.lang.Object r0 = oO0OO0Oo.C32921OooO0o0.OooO00o(r4, r0)
            oO0OOO0.OooO00o$OooO0OO r0 = (oO0OOO0.OooO00o.OooO0OO) r0
            r1 = 0
            if (r0 != 0) goto L20
            goto L54
        L20:
            int r2 = r0.f118866OooOo
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L29
            oO0OOO0.OooO00o$OooO00o r0 = r0.f118869OooOoO0
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L2f
            if (r7 == 0) goto L2f
            goto L54
        L2f:
            if (r0 == 0) goto L39
            int r7 = r0.f118844OooOo
            r7 = r7 & r3
            if (r7 != r3) goto L39
            int r7 = r0.f118847OooOoO0
            goto L3b
        L39:
            int r7 = r4.f118326OooOoo0
        L3b:
            if (r0 == 0) goto L4a
            int r2 = r0.f118844OooOo
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L4a
            int r4 = r0.f118846OooOoO
            java.lang.String r4 = r5.getString(r4)
            goto L55
        L4a:
            oO0OO00.OooOOOo r4 = oO0OO0Oo.C32920OooO0o.OooO0Oo(r4, r6)
            java.lang.String r4 = OooO0o0(r4, r5)
            if (r4 != 0) goto L55
        L54:
            return r1
        L55:
            oO0OOO.OooO0Oo$OooO00o r6 = new oO0OOO.OooO0Oo$OooO00o
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oO0OOO.C32936OooO0oo.OooO0O0(oO0OO00.OooOOO0, oO0OO0Oo.OooO0OO, oO0OO0Oo.OooO0oO, boolean):oO0OOO.OooO0Oo$OooO00o");
    }

    public static AbstractC32933OooO0Oo.OooO0O0 OooO0OO(C32887OooO0oo proto, InterfaceC32918OooO0OO nameResolver, C32922OooO0oO typeTable) {
        String strOooO0OO;
        OooOOO0.OooO0oO(proto, "proto");
        OooOOO0.OooO0oO(nameResolver, "nameResolver");
        OooOOO0.OooO0oO(typeTable, "typeTable");
        AbstractC32954OooO0oo.C32956OooO0o0<C32887OooO0oo, OooO00o.OooO0O0> methodSignature = oO0OOO0.OooO00o.f118830OooO0O0;
        OooOOO0.OooO0o(methodSignature, "methodSignature");
        OooO00o.OooO0O0 oooO0O0 = (OooO00o.OooO0O0) C32921OooO0o0.OooO00o(proto, methodSignature);
        int i = (oooO0O0 == null || (oooO0O0.f118855OooOo & 1) != 1) ? proto.f118230OooOoo0 : oooO0O0.f118858OooOoO0;
        if (oooO0O0 == null || (oooO0O0.f118855OooOo & 2) != 2) {
            List listOooOOO0 = C34429OooOOo0.OooOOO0(C32920OooO0o.OooO0O0(proto, typeTable));
            List<OooOo00> list = proto.f118239Oooo0OO;
            OooOOO0.OooO0o(list, "proto.valueParameterList");
            List<OooOo00> list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            for (OooOo00 it : list2) {
                OooOOO0.OooO0o(it, "it");
                arrayList.add(C32920OooO0o.OooO0o0(it, typeTable));
            }
            ArrayList arrayListOooooOO = OooOo.OooooOO(listOooOOO0, arrayList);
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO, 10));
            Iterator it2 = arrayListOooooOO.iterator();
            while (it2.hasNext()) {
                String strOooO0o0 = OooO0o0((C32889OooOOOo) it2.next(), nameResolver);
                if (strOooO0o0 == null) {
                    return null;
                }
                arrayList2.add(strOooO0o0);
            }
            String strOooO0o02 = OooO0o0(C32920OooO0o.OooO0OO(proto, typeTable), nameResolver);
            if (strOooO0o02 == null) {
                return null;
            }
            strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), OooOo.o000oOoO(arrayList2, "", "(", ")", null, 56), strOooO0o02);
        } else {
            strOooO0OO = nameResolver.getString(oooO0O0.f118857OooOoO);
        }
        return new AbstractC32933OooO0Oo.OooO0O0(nameResolver.getString(i), strOooO0OO);
    }

    public static final boolean OooO0Oo(oO0OO00.OooOOO0 proto) {
        OooOOO0.OooO0oO(proto, "proto");
        C32917OooO0O0.OooO00o oooO00o = OooO0OO.f118815OooO00o;
        Object objOooO0o = proto.OooO0o(oO0OOO0.OooO00o.f118834OooO0o0);
        OooOOO0.OooO0o(objOooO0o, "proto.getExtension(JvmProtoBuf.flags)");
        return oooO00o.OooO0OO(((Number) objOooO0o).intValue()).booleanValue();
    }

    public static final C32443OooOOO<OooO0o, oO0OO00.OooO0O0> OooO0o(String[] strArr, String[] strings) throws OooOO0 {
        OooOOO0.OooO0oO(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(OooO00o.OooO00o(strArr));
        OooO0o oooO0oOooO0oO = OooO0oO(byteArrayInputStream, strings);
        OooO0O0.OooO00o oooO00o = oO0OO00.OooO0O0.f118075Oooooo0;
        oooO00o.getClass();
        C32951OooO0Oo c32951OooO0Oo = new C32951OooO0Oo(byteArrayInputStream);
        InterfaceC32958OooOOOo interfaceC32958OooOOOo = (InterfaceC32958OooOOOo) oooO00o.OooO00o(c32951OooO0Oo, f118827OooO00o);
        try {
            c32951OooO0Oo.OooO00o(0);
            oO0OOOO0.OooO0O0.OooO0O0(interfaceC32958OooOOOo);
            return new C32443OooOOO<>(oooO0oOooO0oO, (oO0OO00.OooO0O0) interfaceC32958OooOOOo);
        } catch (OooOO0 e) {
            e.f119095OooOo0o = interfaceC32958OooOOOo;
            throw e;
        }
    }

    public static String OooO0o0(C32889OooOOOo c32889OooOOOo, InterfaceC32918OooO0OO interfaceC32918OooO0OO) {
        if (c32889OooOOOo.OooOO0O()) {
            return OooO0O0.OooO0O0(interfaceC32918OooO0OO.OooO00o(c32889OooOOOo.f118372OooOooo));
        }
        return null;
    }

    public static OooO0o OooO0oO(ByteArrayInputStream byteArrayInputStream, String[] strings) {
        OooO00o.C32937OooO0Oo c32937OooO0Oo = (OooO00o.C32937OooO0Oo) OooO00o.C32937OooO0Oo.f118882OooOooO.OooO0OO(byteArrayInputStream, f118827OooO00o);
        OooOOO0.OooO0o(c32937OooO0Oo, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        OooOOO0.OooO0oO(strings, "strings");
        List<Integer> list = c32937OooO0Oo.f118886OooOoO0;
        Set setO0OO00O = list.isEmpty() ? C34438OooOoo0.f123458OooOo0o : OooOo.o0OO00O(list);
        List<OooO00o.C32937OooO0Oo.OooO0OO> list2 = c32937OooO0Oo.f118883OooOo;
        OooOOO0.OooO0o(list2, "types.recordList");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (OooO00o.C32937OooO0Oo.OooO0OO oooO0OO : list2) {
            int i = oooO0OO.f118897OooOoO0;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(oooO0OO);
            }
        }
        arrayList.trimToSize();
        return new OooO0o(strings, setO0OO00O, arrayList);
    }

    public static final C32443OooOOO<OooO0o, OooOO0O> OooO0oo(String[] data, String[] strings) throws OooOO0 {
        OooOOO0.OooO0oO(data, "data");
        OooOOO0.OooO0oO(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(OooO00o.OooO00o(data));
        OooO0o oooO0oOooO0oO = OooO0oO(byteArrayInputStream, strings);
        OooOO0O.OooO00o oooO00o = OooOO0O.f118262Oooo00o;
        oooO00o.getClass();
        C32951OooO0Oo c32951OooO0Oo = new C32951OooO0Oo(byteArrayInputStream);
        InterfaceC32958OooOOOo interfaceC32958OooOOOo = (InterfaceC32958OooOOOo) oooO00o.OooO00o(c32951OooO0Oo, f118827OooO00o);
        try {
            c32951OooO0Oo.OooO00o(0);
            oO0OOOO0.OooO0O0.OooO0O0(interfaceC32958OooOOOo);
            return new C32443OooOOO<>(oooO0oOooO0oO, (OooOO0O) interfaceC32958OooOOOo);
        } catch (OooOO0 e) {
            e.f119095OooOo0o = interfaceC32958OooOOOo;
            throw e;
        }
    }
}
