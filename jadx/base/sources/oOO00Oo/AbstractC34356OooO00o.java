package oOO00Oo;

import java.io.ObjectStreamException;
import java.io.Serializable;
import oOO00OOo.C34354OooO0Oo;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: renamed from: oOO00Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34356OooO00o implements InterfaceC34352OooO0O0, Serializable {
    private static final long serialVersionUID = -2529255052481744503L;

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooO0O0(Object obj, String str) {
        OooOo0O(3, new Object[]{obj});
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooO0OO(Object obj, String str) {
        OooOo0O(5, new Object[]{obj});
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooO0o(Object obj, String str, Object obj2) {
        OooOo0(obj, str, 3, obj2);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooO0o0(Object obj, String str, Object obj2) {
        OooOo0(obj, str, 1, obj2);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooO0oO(String str) {
        OooOo0O(3, null);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooO0oo(String str) {
        OooOo0O(5, null);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooOOO(Object obj, String str) {
        OooOo0O(1, new Object[]{obj});
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooOOO0(Object obj, String str, Object obj2) {
        OooOo0(obj, str, 5, obj2);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooOOOO(Object obj, String str, Object obj2) {
        OooOo0(obj, str, 2, obj2);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooOOOo(Object obj, String str, Object obj2) {
        OooOo0(obj, str, 4, obj2);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooOOo(String str) {
        OooOo0O(4, null);
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooOOo0(Object obj, String str) {
        OooOo0O(2, new Object[]{obj});
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooOOoo(String str) {
        OooOo0O(2, null);
    }

    public final void OooOo0(Object obj, String str, int i, Object obj2) {
        if (obj2 instanceof Throwable) {
            OooOo0O(i, new Object[]{obj});
        } else {
            OooOo0O(i, new Object[]{obj, obj2});
        }
    }

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public final void OooOo00(Object obj, String str) {
        OooOo0O(4, new Object[]{obj});
    }

    public abstract void OooOo0O(int i, Object[] objArr);

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public String getName() {
        return null;
    }

    public Object readResolve() throws ObjectStreamException {
        return C34354OooO0Oo.OooO0OO(getName());
    }
}
