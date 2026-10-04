package oOoo0;

import oO0O000o.InterfaceC32507OooOO0o;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: oOoo0.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC34603OooOOO<T, V> extends InterfaceC34602OooOO0o<V>, InterfaceC32507OooOO0o<T, V> {

    /* JADX INFO: renamed from: oOoo0.OooOOO$OooO00o */
    public interface OooO00o<T, V> extends InterfaceC34602OooOO0o.OooO00o<V>, InterfaceC32507OooOO0o<T, V> {
    }

    V get(T t);

    Object getDelegate(T t);

    @Override // oOoo0.InterfaceC34602OooOO0o
    OooO00o<T, V> getGetter();
}
