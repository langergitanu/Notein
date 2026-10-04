package ooOOoOO0;

import java.nio.charset.CharacterCodingException;
import java.util.Iterator;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oOo00O0O.AbstractC34457OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo00<T> implements Iterator<T>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C35139Oooo00o f126132OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC34457OooO0OO f126133OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f126134OooOoO = true;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC33911OooO0OO f126135OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f126136OooOoOO;

    public OooOo00(AbstractC34457OooO0OO abstractC34457OooO0OO, C35139Oooo00o c35139Oooo00o, InterfaceC33911OooO0OO interfaceC33911OooO0OO) {
        this.f126133OooOo0o = abstractC34457OooO0OO;
        this.f126132OooOo = c35139Oooo00o;
        this.f126135OooOoO0 = interfaceC33911OooO0OO;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f126136OooOoOO) {
            return false;
        }
        C35139Oooo00o c35139Oooo00o = this.f126132OooOo;
        if (c35139Oooo00o.OooOo() != 9) {
            if (c35139Oooo00o.OooOo() != 10 || this.f126136OooOoOO) {
                return true;
            }
            c35139Oooo00o.OooOOoo((byte) 9, true);
            throw null;
        }
        this.f126136OooOoOO = true;
        c35139Oooo00o.OooO0oO((byte) 9);
        if (c35139Oooo00o.OooOo() == 10) {
            return false;
        }
        if (c35139Oooo00o.OooOo() != 8) {
            c35139Oooo00o.OooOOOo();
            return false;
        }
        AbstractC35114OooO00o.OooOOo(c35139Oooo00o, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6);
        throw null;
    }

    @Override // java.util.Iterator
    public final T next() throws CharacterCodingException {
        boolean z = this.f126134OooOoO;
        C35139Oooo00o c35139Oooo00o = this.f126132OooOo;
        if (z) {
            this.f126134OooOoO = false;
        } else {
            c35139Oooo00o.OooO0oo(',');
        }
        EnumC35144Oooo0oO enumC35144Oooo0oO = EnumC35144Oooo0oO.f126195OooOoO0;
        InterfaceC33911OooO0OO interfaceC33911OooO0OO = this.f126135OooOoO0;
        return (T) new Oooo0(this.f126133OooOo0o, enumC35144Oooo0oO, c35139Oooo00o, interfaceC33911OooO0OO.getDescriptor(), null).OooOooo(interfaceC33911OooO0OO);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
