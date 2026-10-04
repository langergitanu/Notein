package oO0O0O0;

import OooO0o.C20424OooO0Oo;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import oO0O0OO.AbstractC32601OooOOo;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0OooO0.C33479OooO0o;
import oO0o0O0o.C33587OooO0oo;
import oO0o0O0o.C33588OooOO0;

/* JADX INFO: renamed from: oO0O0O0.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32571Oooo0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC32627Oooo0oo> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC32570Oooo0O0<Object> f117069OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32571Oooo0OO(AbstractC32570Oooo0O0<Object> abstractC32570Oooo0O0) {
        super(0);
        this.f117069OooOo0o = abstractC32570Oooo0O0;
    }

    @Override // oO0O000o.OooO00o
    public final InterfaceC32627Oooo0oo invoke() {
        AbstractC32570Oooo0O0<Object> abstractC32570Oooo0O0 = this.f117069OooOo0o;
        AbstractC32552OooOOo abstractC32552OooOOo = abstractC32570Oooo0O0.f117054OooOoo0;
        abstractC32552OooOOo.getClass();
        String name = abstractC32570Oooo0O0.f117053OooOoo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        String signature = abstractC32570Oooo0O0.f117055OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(signature, "signature");
        C33588OooOO0 c33588OooOO0 = AbstractC32552OooOOo.f116975OooOo0o;
        c33588OooOO0.getClass();
        Matcher matcher = c33588OooOO0.f121262OooOo0o.matcher(signature);
        kotlin.jvm.internal.OooOOO0.OooO0o(matcher, "matcher(...)");
        C33587OooO0oo c33587OooO0oo = !matcher.matches() ? null : new C33587OooO0oo(matcher, signature);
        if (c33587OooO0oo != null) {
            String str = (String) ((C33587OooO0oo.OooO00o) c33587OooO0oo.OooO00o()).get(1);
            InterfaceC32627Oooo0oo interfaceC32627Oooo0ooOooOOOO = abstractC32552OooOOo.OooOOOO(Integer.parseInt(str));
            if (interfaceC32627Oooo0ooOooOOOO != null) {
                return interfaceC32627Oooo0ooOooOOOO;
            }
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Local property #", str, " not found in ");
            sbOooO0o0.append(abstractC32552OooOOo.OooO());
            throw new C32579OoooO0O(sbOooO0o0.toString());
        }
        Collection<InterfaceC32627Oooo0oo> collectionOooOOo = abstractC32552OooOOo.OooOOo(C33479OooO0o.OooO0o0(name));
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionOooOOo) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(C32583OoooOo0.OooO0O0((InterfaceC32627Oooo0oo) obj).OooO00o(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
            sbOooO0O0.append(abstractC32552OooOOo);
            throw new C32579OoooO0O(sbOooO0O0.toString());
        }
        if (arrayList.size() == 1) {
            return (InterfaceC32627Oooo0oo) oOo000Oo.OooOo.OoooooO(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            AbstractC32601OooOOo visibility = ((InterfaceC32627Oooo0oo) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        TreeMap treeMap = new TreeMap(new C32553OooOOo0(C32555OooOo0.f116985OooOo0o));
        treeMap.putAll(linkedHashMap);
        Collection collectionValues = treeMap.values();
        kotlin.jvm.internal.OooOOO0.OooO0o(collectionValues, "properties\n             …\n                }.values");
        List list = (List) oOo000Oo.OooOo.OoooOOO(collectionValues);
        if (list.size() == 1) {
            return (InterfaceC32627Oooo0oo) oOo000Oo.OooOo.Oooo0oO(list);
        }
        String strO000oOoO = oOo000Oo.OooOo.o000oOoO(abstractC32552OooOOo.OooOOo(C33479OooO0o.OooO0o0(name)), IOUtils.LINE_SEPARATOR_UNIX, null, null, OooOo00.f116986OooOo0o, 30);
        StringBuilder sbOooO0O02 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
        sbOooO0O02.append(abstractC32552OooOOo);
        sbOooO0O02.append(':');
        sbOooO0O02.append(strO000oOoO.length() == 0 ? " no members found" : IOUtils.LINE_SEPARATOR_UNIX.concat(strO000oOoO));
        throw new C32579OoooO0O(sbOooO0O02.toString());
    }
}
