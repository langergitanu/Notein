package oO0oO00;

import java.util.concurrent.ConcurrentHashMap;
import o0000OOo.C24217OooO0O0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: oO0oO00.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33954OooOo0o<T> implements InterfaceC33990o000000o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<InterfaceC34595OooO0Oo<?>, InterfaceC33911OooO0OO<T>> f122161OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap<Class<?>, C33943OooOO0o<T>> f122162OooO0O0 = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public C33954OooOo0o(InterfaceC32507OooOO0o<? super InterfaceC34595OooO0Oo<?>, ? extends InterfaceC33911OooO0OO<T>> interfaceC32507OooOO0o) {
        this.f122161OooO00o = interfaceC32507OooOO0o;
    }

    @Override // oO0oO00.InterfaceC33990o000000o
    public final InterfaceC33911OooO0OO<T> OooO00o(InterfaceC34595OooO0Oo<Object> interfaceC34595OooO0Oo) {
        C33943OooOO0o<T> c33943OooOO0oPutIfAbsent;
        ConcurrentHashMap<Class<?>, C33943OooOO0o<T>> concurrentHashMap = this.f122162OooO0O0;
        Class<?> clsOooO0Oo = C24217OooO0O0.OooO0Oo(interfaceC34595OooO0Oo);
        C33943OooOO0o<T> c33943OooOO0o = concurrentHashMap.get(clsOooO0Oo);
        if (c33943OooOO0o == null && (c33943OooOO0oPutIfAbsent = concurrentHashMap.putIfAbsent(clsOooO0Oo, (c33943OooOO0o = new C33943OooOO0o<>(this.f122161OooO00o.invoke(interfaceC34595OooO0Oo))))) != null) {
            c33943OooOO0o = c33943OooOO0oPutIfAbsent;
        }
        return c33943OooOO0o.f122149OooO00o;
    }
}
