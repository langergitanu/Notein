package ooOOoOO0;

import java.util.Iterator;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oOo00O0O.AbstractC34457OooO0OO;

/* JADX INFO: renamed from: ooOOoOO0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35128OooOo0<T> implements Iterator<T>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C35139Oooo00o f126129OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC34457OooO0OO f126130OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC33911OooO0OO f126131OooOoO0;

    public C35128OooOo0(AbstractC34457OooO0OO abstractC34457OooO0OO, C35139Oooo00o c35139Oooo00o, InterfaceC33911OooO0OO interfaceC33911OooO0OO) {
        this.f126130OooOo0o = abstractC34457OooO0OO;
        this.f126129OooOo = c35139Oooo00o;
        this.f126131OooOoO0 = interfaceC33911OooO0OO;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f126129OooOo.OooOo() != 10;
    }

    @Override // java.util.Iterator
    public final T next() {
        EnumC35144Oooo0oO enumC35144Oooo0oO = EnumC35144Oooo0oO.f126195OooOoO0;
        InterfaceC33911OooO0OO interfaceC33911OooO0OO = this.f126131OooOoO0;
        return (T) new Oooo0(this.f126130OooOo0o, enumC35144Oooo0oO, this.f126129OooOo, interfaceC33911OooO0OO.getDescriptor(), null).OooOooo(interfaceC33911OooO0OO);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
