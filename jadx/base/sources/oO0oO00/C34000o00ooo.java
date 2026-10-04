package oO0oO00;

import oO00ooO.C32443OooOOO;
import oO0o.C33532OooO0oO;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;

/* JADX INFO: renamed from: oO0oO00.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34000o00ooo<K, V> extends o000oOoO<K, V, C32443OooOOO<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33532OooO0oO f122273OooO0OO;

    public C34000o00ooo(InterfaceC33911OooO0OO<K> interfaceC33911OooO0OO, InterfaceC33911OooO0OO<V> interfaceC33911OooO0OO2) {
        super(interfaceC33911OooO0OO, interfaceC33911OooO0OO2);
        this.f122273OooO0OO = oO0o.OooOO0O.OooO0O0("kotlin.Pair", new InterfaceC33531OooO0o0[0], new C33998o00o0O(0, interfaceC33911OooO0OO, interfaceC33911OooO0OO2));
    }

    @Override // oO0oO00.o000oOoO
    public final Object OooO00o(Object obj) {
        C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(c32443OooOOO, "<this>");
        return c32443OooOOO.f116638OooOo0o;
    }

    @Override // oO0oO00.o000oOoO
    public final Object OooO0O0(Object obj) {
        C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(c32443OooOOO, "<this>");
        return c32443OooOOO.f116637OooOo;
    }

    @Override // oO0oO00.o000oOoO
    public final Object OooO0OO(Object obj, Object obj2) {
        return new C32443OooOOO(obj, obj2);
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return this.f122273OooO0OO;
    }
}
