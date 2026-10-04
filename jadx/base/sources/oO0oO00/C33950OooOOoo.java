package oO0oO00;

import java.lang.ref.SoftReference;
import o0000OOo.C24217OooO0O0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: oO0oO00.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33950OooOOoo<T> implements InterfaceC33990o000000o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<InterfaceC34595OooO0Oo<?>, InterfaceC33911OooO0OO<T>> f122156OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33952OooOo00<C33943OooOO0o<T>> f122157OooO0O0 = new C33952OooOo00<>();

    /* JADX WARN: Multi-variable type inference failed */
    public C33950OooOOoo(InterfaceC32507OooOO0o<? super InterfaceC34595OooO0Oo<?>, ? extends InterfaceC33911OooO0OO<T>> interfaceC32507OooOO0o) {
        this.f122156OooO00o = interfaceC32507OooOO0o;
    }

    @Override // oO0oO00.InterfaceC33990o000000o
    public final InterfaceC33911OooO0OO<T> OooO00o(InterfaceC34595OooO0Oo<Object> interfaceC34595OooO0Oo) {
        Object obj = this.f122157OooO0O0.get(C24217OooO0O0.OooO0Oo(interfaceC34595OooO0Oo));
        kotlin.jvm.internal.OooOOO0.OooO0o(obj, "get(...)");
        C33988OoooooO c33988OoooooO = (C33988OoooooO) obj;
        T t = c33988OoooooO.f122219OooO00o.get();
        if (t == null) {
            synchronized (c33988OoooooO) {
                t = c33988OoooooO.f122219OooO00o.get();
                if (t == null) {
                    t = (T) new C33943OooOO0o(this.f122156OooO00o.invoke(interfaceC34595OooO0Oo));
                    c33988OoooooO.f122219OooO00o = new SoftReference<>(t);
                }
            }
        }
        return t.f122149OooO00o;
    }
}
