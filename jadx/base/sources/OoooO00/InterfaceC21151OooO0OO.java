package OoooO00;

import OoooO0.AbstractC21143OooO0O0;
import OoooO0.OooO0o;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: OoooO00.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC21151OooO0OO<E> extends List, Collection, oO0O00.OooO00o {
    @Override // OoooO00.InterfaceC21151OooO0OO
    InterfaceC21151OooO0OO<E> add(int i, E e);

    @Override // java.util.List, OoooO00.InterfaceC21151OooO0OO
    InterfaceC21151OooO0OO<E> add(E e);

    @Override // java.util.List, OoooO00.InterfaceC21151OooO0OO
    InterfaceC21151OooO0OO<E> addAll(Collection<? extends E> collection);

    OooO0o builder();

    InterfaceC21151OooO0OO o00Oo0(AbstractC21143OooO0O0.OooO00o oooO00o);

    @Override // java.util.List, OoooO00.InterfaceC21151OooO0OO
    InterfaceC21151OooO0OO<E> remove(E e);

    @Override // java.util.List, OoooO00.InterfaceC21151OooO0OO
    InterfaceC21151OooO0OO<E> removeAll(Collection<? extends E> collection);

    InterfaceC21151OooO0OO<E> removeAt(int i);

    @Override // OoooO00.InterfaceC21151OooO0OO
    InterfaceC21151OooO0OO<E> set(int i, E e);
}
