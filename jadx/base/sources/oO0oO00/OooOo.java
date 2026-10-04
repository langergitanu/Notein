package oO0oO00;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o0000OOo.C24217OooO0O0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOoo0.InterfaceC34595OooO0Oo;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo<T> implements InterfaceC33999o00oO0o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC32508OooOOOo<InterfaceC34595OooO0Oo<Object>, List<? extends InterfaceC34606OooOOOo>, InterfaceC33911OooO0OO<T>> f122158OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap<Class<?>, oo000o<T>> f122159OooO0O0 = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public OooOo(InterfaceC32508OooOOOo<? super InterfaceC34595OooO0Oo<Object>, ? super List<? extends InterfaceC34606OooOOOo>, ? extends InterfaceC33911OooO0OO<T>> interfaceC32508OooOOOo) {
        this.f122158OooO00o = interfaceC32508OooOOOo;
    }

    @Override // oO0oO00.InterfaceC33999o00oO0o
    public final Object OooO00o(InterfaceC34595OooO0Oo interfaceC34595OooO0Oo, ArrayList arrayList) {
        Object objOooO00o;
        oo000o<T> oo000oVarPutIfAbsent;
        ConcurrentHashMap<Class<?>, oo000o<T>> concurrentHashMap = this.f122159OooO0O0;
        Class<?> clsOooO0Oo = C24217OooO0O0.OooO0Oo(interfaceC34595OooO0Oo);
        oo000o<T> oo000oVar = concurrentHashMap.get(clsOooO0Oo);
        if (oo000oVar == null && (oo000oVarPutIfAbsent = concurrentHashMap.putIfAbsent(clsOooO0Oo, (oo000oVar = new oo000o<>()))) != null) {
            oo000oVar = oo000oVarPutIfAbsent;
        }
        oo000o<T> oo000oVar2 = oo000oVar;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C33975OoooOO0((InterfaceC34606OooOOOo) it.next()));
        }
        ConcurrentHashMap<List<C33975OoooOO0>, C32445OooOOOO<InterfaceC33911OooO0OO<T>>> concurrentHashMap2 = oo000oVar2.f122291OooO00o;
        C32445OooOOOO<InterfaceC33911OooO0OO<T>> c32445OooOOOO = concurrentHashMap2.get(arrayList2);
        if (c32445OooOOOO == null) {
            try {
                objOooO00o = (InterfaceC33911OooO0OO) this.f122158OooO00o.invoke(interfaceC34595OooO0Oo, arrayList);
            } catch (Throwable th) {
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
            C32445OooOOOO<InterfaceC33911OooO0OO<T>> c32445OooOOOO2 = new C32445OooOOOO<>(objOooO00o);
            C32445OooOOOO<InterfaceC33911OooO0OO<T>> c32445OooOOOOPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList2, c32445OooOOOO2);
            c32445OooOOOO = c32445OooOOOOPutIfAbsent == null ? c32445OooOOOO2 : c32445OooOOOOPutIfAbsent;
        }
        return c32445OooOOOO.f116639OooOo0o;
    }
}
