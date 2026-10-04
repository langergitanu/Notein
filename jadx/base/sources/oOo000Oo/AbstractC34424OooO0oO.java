package oOo000Oo;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: oOo000Oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34424OooO0oO<E> extends AbstractList<E> implements List<E>, oO0O00.OooO0OO {
    public abstract int OooO0O0();

    public abstract E OooO0Oo(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i) {
        return OooO0Oo(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return OooO0O0();
    }
}
