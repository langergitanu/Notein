package OoooO0;

import OoooO0.AbstractC21143OooO0O0;
import OoooO00.InterfaceC21151OooO0OO;
import OoooOO0.C21174OooO0OO;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0<E> extends AbstractC21143OooO0O0<E> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooOO0 f61367OooOo = new OooOO0(new Object[0]);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Object[] f61368OooOo0o;

    public OooOO0(Object[] objArr) {
        this.f61368OooOo0o = objArr;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0
    public final int OooO0O0() {
        return this.f61368OooOo0o.length;
    }

    @Override // java.util.List, OoooO00.InterfaceC21151OooO0OO
    public final InterfaceC21151OooO0OO<E> add(int i, E e) {
        Object[] objArr = this.f61368OooOo0o;
        C21174OooO0OO.OooO0O0(i, objArr.length);
        if (i == objArr.length) {
            return add((Object) e);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            Oooo.OooO0OO.OooOO0(objArr, 0, objArr2, i, 6);
            Oooo.OooO0OO.OooO0oo(objArr, i + 1, objArr2, i, objArr.length);
            objArr2[i] = e;
            return new OooOO0(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, size)");
        Oooo.OooO0OO.OooO0oo(objArr, i + 1, objArrCopyOf, i, objArr.length - 1);
        objArrCopyOf[i] = e;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new C21146OooO0o0(objArrCopyOf, objArr.length + 1, 0, objArr3);
    }

    @Override // OoooO0.AbstractC21143OooO0O0, java.util.Collection, java.util.List, OoooO00.InterfaceC21151OooO0OO
    public final InterfaceC21151OooO0OO<E> addAll(Collection<? extends E> collection) {
        Object[] objArr = this.f61368OooOo0o;
        if (collection.size() + objArr.length > 32) {
            OooO0o oooO0oBuilder = builder();
            oooO0oBuilder.addAll(collection);
            return oooO0oBuilder.OooO0o0();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
        int length = objArr.length;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new OooOO0(objArrCopyOf);
    }

    @Override // OoooO00.InterfaceC21151OooO0OO
    public final OooO0o builder() {
        return new OooO0o(this, null, this.f61368OooOo0o, 0);
    }

    @Override // java.util.List
    public final E get(int i) {
        C21174OooO0OO.OooO00o(i, OooO0O0());
        return (E) this.f61368OooOo0o[i];
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List
    public final int indexOf(Object obj) {
        return OooOOO.Oooo000(this.f61368OooOo0o, obj);
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f61368OooOo0o;
        OooOOO0.OooO0oO(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List
    public final ListIterator<E> listIterator(int i) {
        Object[] objArr = this.f61368OooOo0o;
        C21174OooO0OO.OooO0O0(i, objArr.length);
        return new C21144OooO0OO(objArr, i, objArr.length);
    }

    @Override // OoooO00.InterfaceC21151OooO0OO
    public final InterfaceC21151OooO0OO o00Oo0(AbstractC21143OooO0O0.OooO00o oooO00o) {
        Object[] objArr = this.f61368OooOo0o;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) oooO00o.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, size)");
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f61367OooOo : new OooOO0(Oooo.OooO0OO.OooOOO0(objArrCopyOf, 0, length));
    }

    @Override // OoooO00.InterfaceC21151OooO0OO
    public final InterfaceC21151OooO0OO<E> removeAt(int i) {
        Object[] objArr = this.f61368OooOo0o;
        C21174OooO0OO.OooO00o(i, objArr.length);
        if (objArr.length == 1) {
            return f61367OooOo;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
        Oooo.OooO0OO.OooO0oo(objArr, i, objArrCopyOf, i + 1, objArr.length);
        return new OooOO0(objArrCopyOf);
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.List, OoooO00.InterfaceC21151OooO0OO
    public final InterfaceC21151OooO0OO<E> set(int i, E e) {
        Object[] objArr = this.f61368OooOo0o;
        C21174OooO0OO.OooO00o(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i] = e;
        return new OooOO0(objArrCopyOf);
    }

    @Override // java.util.Collection, java.util.List, OoooO00.InterfaceC21151OooO0OO
    public final InterfaceC21151OooO0OO<E> add(E e) {
        Object[] objArr = this.f61368OooOo0o;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[objArr.length] = e;
            return new OooOO0(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e;
        return new C21146OooO0o0(objArr, objArr.length + 1, 0, objArr2);
    }
}
