package OoooO0;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.OooOOO0;
import o00OOooo.C25022OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O<E> extends AbstractC21142OooO00o<E> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object[] f61369OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f61370OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f61371OooOoOO;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public OooOO0O(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.f61370OooOoO0 = i3;
        Object[] objArr2 = new Object[i3];
        this.f61369OooOoO = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f61371OooOoOO = r5;
        objArr2[0] = objArr;
        OooO0O0(i - r5, 1);
    }

    public final E OooO00o() {
        int i = this.f61344OooOo0o & 31;
        Object obj = this.f61369OooOoO[this.f61370OooOoO0 - 1];
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[i];
    }

    public final void OooO0O0(int i, int i2) {
        int i3 = (this.f61370OooOoO0 - i2) * 5;
        while (i2 < this.f61370OooOoO0) {
            Object[] objArr = this.f61369OooOoO;
            Object obj = objArr[i2 - 1];
            OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = ((Object[]) obj)[C25022OooO0O0.OooO0oo(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void OooO0Oo(int i) {
        int i2 = 0;
        while (C25022OooO0O0.OooO0oo(this.f61344OooOo0o, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            OooO0O0(this.f61344OooOo0o, ((this.f61370OooOoO0 - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eOooO00o = OooO00o();
        int i = this.f61344OooOo0o + 1;
        this.f61344OooOo0o = i;
        if (i == this.f61343OooOo) {
            this.f61371OooOoOO = true;
            return eOooO00o;
        }
        OooO0Oo(0);
        return eOooO00o;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f61344OooOo0o--;
        if (this.f61371OooOoOO) {
            this.f61371OooOoOO = false;
            return OooO00o();
        }
        OooO0Oo(31);
        return OooO00o();
    }
}
