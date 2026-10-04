package o00ooO0;

import android.util.SparseIntArray;
import o00o0o0o.InterfaceC25445OooO0OO;
import o00ooO0.AbstractC25738OooO0oO;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OooOo extends AbstractC25738OooO0oO<InterfaceC25747OooOo0o> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int[] f87867OooOO0;

    public OooOo(InterfaceC25445OooO0OO interfaceC25445OooO0OO, Oooo000 oooo000, InterfaceC25755Oooo00O interfaceC25755Oooo00O) {
        super(interfaceC25445OooO0OO, oooo000, interfaceC25755Oooo00O);
        SparseIntArray sparseIntArray = oooo000.f87901OooO0OO;
        sparseIntArray.getClass();
        this.f87867OooOO0 = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f87867OooOO0;
            if (i >= iArr.length) {
                this.f87833OooO0O0.getClass();
                this.f87831OooO.getClass();
                return;
            } else {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            }
        }
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final void OooO0OO(InterfaceC25747OooOo0o interfaceC25747OooOo0o) {
        InterfaceC25747OooOo0o interfaceC25747OooOo0o2 = interfaceC25747OooOo0o;
        interfaceC25747OooOo0o2.getClass();
        interfaceC25747OooOo0o2.close();
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final int OooO0o(InterfaceC25747OooOo0o interfaceC25747OooOo0o) {
        InterfaceC25747OooOo0o interfaceC25747OooOo0o2 = interfaceC25747OooOo0o;
        interfaceC25747OooOo0o2.getClass();
        return interfaceC25747OooOo0o2.getSize();
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final int OooO0o0(int i) {
        if (i <= 0) {
            throw new AbstractC25738OooO0oO.OooO0O0(Integer.valueOf(i));
        }
        for (int i2 : this.f87867OooOO0) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final int OooO0oO(int i) {
        return i;
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final boolean OooOO0(InterfaceC25747OooOo0o interfaceC25747OooOo0o) {
        interfaceC25747OooOo0o.getClass();
        return !r1.isClosed();
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    /* JADX INFO: renamed from: OooOOO0, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC25747OooOo0o OooO00o(int i);
}
