package o0000oO0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0000o.C24246OooO0o0;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24334OooO0O0;
import o0000oOO.C24340OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: o0000oO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", m80623f = "SharedPreferencesMigration.android.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C24330OooO0oO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<C24246OooO0o0, AbstractC24338OooO0o0, Continuation<? super AbstractC24338OooO0o0>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ AbstractC24338OooO0o0 f81907OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ C24246OooO0o0 f81908OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(C24246OooO0o0 c24246OooO0o0, AbstractC24338OooO0o0 abstractC24338OooO0o0, Continuation<? super AbstractC24338OooO0o0> continuation) {
        C24330OooO0oO c24330OooO0oO = new C24330OooO0oO(3, continuation);
        c24330OooO0oO.f81908OooOo0o = c24246OooO0o0;
        c24330OooO0oO.f81907OooOo = abstractC24338OooO0o0;
        return c24330OooO0oO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C24246OooO0o0 c24246OooO0o0 = this.f81908OooOo0o;
        AbstractC24338OooO0o0 abstractC24338OooO0o0 = this.f81907OooOo;
        Set<AbstractC24338OooO0o0.OooO00o<?>> setKeySet = abstractC24338OooO0o0.OooO00o().keySet();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC24338OooO0o0.OooO00o) it.next()).f81922OooO00o);
        }
        Map<String, ?> all = c24246OooO0o0.f81517OooO00o.getAll();
        OooOOO0.OooO0o(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            Set<String> set = c24246OooO0o0.f81518OooO0O0;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Oooo0.OooO0Oo(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = OooOo.o0OO00O((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        C24334OooO0O0 c24334OooO0O0OooO0Oo = abstractC24338OooO0o0.OooO0Oo();
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String str = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                c24334OooO0O0OooO0Oo.OooO0oo(C24340OooO0oo.OooO00o(str), value2);
            } else if (value2 instanceof Float) {
                c24334OooO0O0OooO0Oo.OooO0oo(C24340OooO0oo.OooO0O0(str), value2);
            } else if (value2 instanceof Integer) {
                c24334OooO0O0OooO0Oo.OooO0oo(C24340OooO0oo.OooO0OO(str), value2);
            } else if (value2 instanceof Long) {
                c24334OooO0O0OooO0Oo.OooO0oo(C24340OooO0oo.OooO0Oo(str), value2);
            } else if (value2 instanceof String) {
                c24334OooO0O0OooO0Oo.OooO0oo(C24340OooO0oo.OooO0o0(str), value2);
            } else if (value2 instanceof Set) {
                AbstractC24338OooO0o0.OooO00o<Set<String>> oooO00oOooO0o = C24340OooO0oo.OooO0o(str);
                OooOOO0.OooO0o0(value2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                c24334OooO0O0OooO0Oo.OooO0oo(oooO00oOooO0o, (Set) value2);
            }
        }
        return new C24334OooO0O0(C34444Oooo0O0.OooOOOO(c24334OooO0O0OooO0Oo.OooO00o()), true);
    }
}
