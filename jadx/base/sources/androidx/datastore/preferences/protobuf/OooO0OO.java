package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C21805OooOoO;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO<E> extends AbstractList<E> implements C21805OooOoO.OooO0OO<E> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f64409OooOo0o;

    public OooO0OO(boolean z) {
        this.f64409OooOo0o = z;
    }

    public final void OooO0O0() {
        if (!this.f64409OooOo0o) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        OooO0O0();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        OooO0O0();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.C21805OooOoO.OooO0OO
    public final boolean isModifiable() {
        return this.f64409OooOo0o;
    }

    @Override // androidx.datastore.preferences.protobuf.C21805OooOoO.OooO0OO
    public final void makeImmutable() {
        if (this.f64409OooOo0o) {
            this.f64409OooOo0o = false;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract E remove(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        OooO0O0();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        OooO0O0();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        OooO0O0();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        OooO0O0();
        return super.addAll(i, collection);
    }
}
