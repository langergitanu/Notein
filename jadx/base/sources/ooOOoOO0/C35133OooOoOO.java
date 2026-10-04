package ooOOoOO0;

import OooO0o.C20424OooO0Oo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C24035Oooo00o;
import o000OO00.C24452OooO0o0;
import oO0o.AbstractC33525OooO0OO;
import oO0o.InterfaceC33531OooO0o0;
import oO0oO00.o00oO0O;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.C34449Oooo0oo;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.C34461OooO0oo;
import oOo00O0O.C34474OooOoo0;
import ooOOoOO0.OooOOO;

/* JADX INFO: renamed from: ooOOoOO0.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C35133OooOoOO extends AbstractC35115OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f126145OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C34474OooOoo0 f126146OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC33531OooO0o0 f126147OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f126148OooO0oo;

    public /* synthetic */ C35133OooOoOO(AbstractC34457OooO0OO abstractC34457OooO0OO, C34474OooOoo0 c34474OooOoo0, String str, int i) {
        this(abstractC34457OooO0OO, c34474OooOoo0, (i & 4) != 0 ? null : str, (InterfaceC33531OooO0o0) null);
    }

    @Override // ooOOoOO0.AbstractC35115OooO0O0, oO0oO000.OooO0OO
    public final oO0oO000.OooO00o OooO00o(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        InterfaceC33531OooO0o0 interfaceC33531OooO0o0 = this.f126147OooO0oO;
        if (descriptor != interfaceC33531OooO0o0) {
            return super.OooO00o(descriptor);
        }
        oOo00O0O.OooOO0O oooOO0OO000oOoO = o000oOoO();
        String strOooO0oo = interfaceC33531OooO0o0.OooO0oo();
        if (oooOO0OO000oOoO instanceof C34474OooOoo0) {
            return new C35133OooOoOO(this.f126103OooO0OO, (C34474OooOoo0) oooOO0OO000oOoO, this.f126104OooO0Oo, interfaceC33531OooO0o0);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        sb.append(oooo0.OooO0O0(C34474OooOoo0.class).OooOO0());
        sb.append(", but had ");
        sb.append(oooo0.OooO0O0(oooOO0OO000oOoO.getClass()).OooOO0());
        sb.append(" as the serialized body of ");
        sb.append(strOooO0oo);
        sb.append(" at element: ");
        sb.append(OoooO());
        throw OoooO0O.OooOo.OooO0o0(oooOO0OO000oOoO.toString(), -1, sb.toString());
    }

    @Override // ooOOoOO0.AbstractC35115OooO0O0, oO0oO000.OooO00o
    public void OooO0O0(InterfaceC33531OooO0o0 descriptor) {
        Set setOooO0oo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        C34461OooO0oo c34461OooO0oo = this.f126105OooO0o0;
        if (c34461OooO0oo.f123513OooO0O0 || (descriptor.getKind() instanceof AbstractC33525OooO0OO)) {
            return;
        }
        AbstractC34457OooO0OO abstractC34457OooO0OO = this.f126103OooO0OO;
        C35129OooOo0O.OooO0OO(descriptor, abstractC34457OooO0OO);
        if (c34461OooO0oo.f123511OooO) {
            Set<String> setOooO00o = o00oO0O.OooO00o(descriptor);
            kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC34457OooO0OO, "<this>");
            Map map = (Map) abstractC34457OooO0OO.f123493OooO0OO.OooO00o(descriptor, C35129OooOo0O.f126137OooO00o);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = C34438OooOoo0.f123458OooOo0o;
            }
            setOooO0oo = C34449Oooo0oo.OooO0oo(setOooO00o, setKeySet);
        } else {
            setOooO0oo = o00oO0O.OooO00o(descriptor);
        }
        for (String key : OoooOOO().f123538OooOo0o.keySet()) {
            if (!setOooO0oo.contains(key) && !kotlin.jvm.internal.OooOOO0.OooO0O0(key, this.f126104OooO0Oo)) {
                String input = OoooOOO().toString();
                kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
                kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
                StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Encountered an unknown key '", key, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                sbOooO0o0.append((Object) OoooO0O.OooOo.OooOOOO(-1, input));
                throw OoooO0O.OooOo.OooO0Oo(-1, sbOooO0o0.toString());
            }
        }
    }

    @Override // oO0oO000.OooO00o
    public int OooOo0o(InterfaceC33531OooO0o0 descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        while (this.f126148OooO0oo < descriptor.OooO0o0()) {
            int i = this.f126148OooO0oo;
            this.f126148OooO0oo = i + 1;
            String nestedName = OoooO00(descriptor, i);
            kotlin.jvm.internal.OooOOO0.OooO0oO(nestedName, "nestedName");
            int i2 = this.f126148OooO0oo - 1;
            this.f126145OooO = false;
            if (!OoooOOO().containsKey(nestedName)) {
                boolean z = (this.f126103OooO0OO.f123491OooO00o.f123517OooO0o0 || descriptor.OooO(i2) || !descriptor.OooO0Oo(i2).OooO0O0()) ? false : true;
                this.f126145OooO = z;
                if (z) {
                }
            }
            this.f126105OooO0o0.getClass();
            return i2;
        }
        return -1;
    }

    @Override // ooOOoOO0.AbstractC35115OooO0O0, oO0oO000.OooO0OO
    public final boolean OooOoo0() {
        return !this.f126145OooO && super.OooOoo0();
    }

    @Override // oO0oO00.o0OoOo0
    public String OoooO00(InterfaceC33531OooO0o0 descriptor, int i) {
        Object next;
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        AbstractC34457OooO0OO abstractC34457OooO0OO = this.f126103OooO0OO;
        C35129OooOo0O.OooO0OO(descriptor, abstractC34457OooO0OO);
        String strOooO0o = descriptor.OooO0o(i);
        if (this.f126105OooO0o0.f123511OooO && !OoooOOO().f123538OooOo0o.keySet().contains(strOooO0o)) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC34457OooO0OO, "<this>");
            OooOOO.OooO00o<Map<String, Integer>> oooO00o = C35129OooOo0O.f126137OooO00o;
            C24452OooO0o0 c24452OooO0o0 = new C24452OooO0o0(2, descriptor, abstractC34457OooO0OO);
            OooOOO oooOOO = abstractC34457OooO0OO.f123493OooO0OO;
            oooOOO.getClass();
            Object objOooO00o = oooOOO.OooO00o(descriptor, oooO00o);
            if (objOooO00o == null) {
                objOooO00o = c24452OooO0o0.invoke();
                ConcurrentHashMap concurrentHashMap = oooOOO.f126122OooO00o;
                Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(descriptor, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(oooO00o, objOooO00o);
            }
            Map map = (Map) objOooO00o;
            Iterator<T> it = OoooOOO().f123538OooOo0o.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) map.get((String) next);
                if (num != null && num.intValue() == i) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strOooO0o;
    }

    @Override // ooOOoOO0.AbstractC35115OooO0O0
    public oOo00O0O.OooOO0O OoooOO0(String tag) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(tag, "tag");
        return (oOo00O0O.OooOO0O) C34444Oooo0O0.OooO0oO(tag, OoooOOO());
    }

    @Override // ooOOoOO0.AbstractC35115OooO0O0
    /* JADX INFO: renamed from: OoooOoO, reason: merged with bridge method [inline-methods] */
    public C34474OooOoo0 OoooOOO() {
        return this.f126146OooO0o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35133OooOoOO(AbstractC34457OooO0OO json, C34474OooOoo0 value, String str, InterfaceC33531OooO0o0 interfaceC33531OooO0o0) {
        super(json, value, str);
        kotlin.jvm.internal.OooOOO0.OooO0oO(json, "json");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        this.f126146OooO0o = value;
        this.f126147OooO0oO = interfaceC33531OooO0o0;
    }
}
