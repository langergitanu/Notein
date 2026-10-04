package OoooO0;

import OoooO00.C21149OooO00o;
import OoooO00.InterfaceC21151OooO0OO;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.AbstractC34421OooO0Oo;

/* JADX INFO: renamed from: OoooO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21143OooO0O0<E> extends AbstractC34421OooO0Oo<E> implements InterfaceC21151OooO0OO<E> {

    /* JADX INFO: renamed from: OoooO0.OooO0O0$OooO00o */
    public static final class OooO00o extends OooOOOO implements InterfaceC32507OooOO0o<E, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Collection<E> f61345OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Collection<? extends E> collection) {
            super(1);
            this.f61345OooOo0o = collection;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f61345OooOo0o.contains(obj));
        }
    }

    @Override // java.util.Collection, java.util.List, OoooO00.InterfaceC21151OooO0OO
    public InterfaceC21151OooO0OO<E> addAll(Collection<? extends E> collection) {
        OooO0o oooO0oBuilder = builder();
        oooO0oBuilder.addAll(collection);
        return oooO0oBuilder.OooO0o0();
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0, java.util.Collection, java.util.List
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, OoooO00.InterfaceC21151OooO0OO
    public final InterfaceC21151OooO0OO<E> remove(E e) {
        int iIndexOf = indexOf(e);
        return iIndexOf != -1 ? removeAt(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, OoooO00.InterfaceC21151OooO0OO
    public final InterfaceC21151OooO0OO<E> removeAll(Collection<? extends E> collection) {
        return o00Oo0(new OooO00o(collection));
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List
    public final List subList(int i, int i2) {
        return new C21149OooO00o(this, i, i2);
    }
}
