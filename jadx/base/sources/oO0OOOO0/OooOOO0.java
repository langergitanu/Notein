package oO0OOOO0;

import OooooO0.C21286OooO0O0;
import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0 extends AbstractList<String> implements RandomAccess, OooOOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final C32966OooOo0o f119099OooOo = new C32966OooOo0o(new OooOOO0());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f119100OooOo0o;

    public OooOOO0() {
        this.f119100OooOo0o = new ArrayList();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f119100OooOo0o.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.f119100OooOo0o.size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f119100OooOo0o.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f119100OooOo0o;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof OooO0OO) {
            OooO0OO oooO0OO = (OooO0OO) obj;
            String strOooOOOo = oooO0OO.OooOOOo();
            if (oooO0OO.OooO0oo()) {
                arrayList.set(i, strOooOOOo);
            }
            return strOooOOOo;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = OooO.f119051OooO00o;
        try {
            String str = new String(bArr, "UTF-8");
            if (C21286OooO0O0.OooO0Oo(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // oO0OOOO0.OooOOO
    public final OooO0OO getByteString(int i) {
        OooO0OO oooOOOO;
        ArrayList arrayList = this.f119100OooOo0o;
        Object obj = arrayList.get(i);
        if (obj instanceof OooO0OO) {
            oooOOOO = (OooO0OO) obj;
        } else if (obj instanceof String) {
            String str = (String) obj;
            OooOOOO oooOOOO2 = OooO0OO.f119053OooOo0o;
            try {
                oooOOOO = new OooOOOO(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            OooOOOO oooOOOO3 = OooO0OO.f119053OooOo0o;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            oooOOOO = new OooOOOO(bArr2);
        }
        if (oooOOOO != obj) {
            arrayList.set(i, oooOOOO);
        }
        return oooOOOO;
    }

    @Override // oO0OOOO0.OooOOO
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f119100OooOo0o);
    }

    @Override // oO0OOOO0.OooOOO
    public final C32966OooOo0o getUnmodifiableView() {
        return new C32966OooOo0o(this);
    }

    @Override // oO0OOOO0.OooOOO
    public final void o00000OO(OooOOOO oooOOOO) {
        this.f119100OooOo0o.add(oooOOOO);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.f119100OooOo0o.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof OooO0OO) {
            return ((OooO0OO) objRemove).OooOOOo();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = OooO.f119051OooO00o;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.f119100OooOo0o.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof OooO0OO) {
            return ((OooO0OO) obj2).OooOOOo();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = OooO.f119051OooO00o;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f119100OooOo0o.size();
    }

    public OooOOO0(OooOOO oooOOO) {
        this.f119100OooOo0o = new ArrayList(oooOOO.size());
        addAll(oooOOO);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof OooOOO) {
            collection = ((OooOOO) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f119100OooOo0o.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
