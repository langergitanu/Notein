package ooOOoOoo;

import java.util.Iterator;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: ooOOoOoo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC35157OooO00o<K, V> implements Iterable<V>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: ooOOoOoo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static abstract class AbstractC20382OooO00o<K, V, T extends V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC34595OooO0Oo<? extends K> f126225OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f126226OooO0O0;

        public AbstractC20382OooO00o(InterfaceC34595OooO0Oo<? extends K> interfaceC34595OooO0Oo, int i) {
            this.f126225OooO00o = interfaceC34595OooO0Oo;
            this.f126226OooO0O0 = i;
        }
    }

    public abstract AbstractC35159OooO0OO<V> OooO0O0();

    public final boolean isEmpty() {
        return ((AbstractC35162OooO0o0) this).f126231OooOo0o.OooO0O0() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return OooO0O0().iterator();
    }
}
