package oOO00Oo;

import java.io.ObjectStreamException;
import java.io.Serializable;
import oOO00OOo.C34354OooO0Oo;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: renamed from: oOO00Oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34359OooO0oO implements InterfaceC34352OooO0O0, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;

    @Override // oOO00OOo.InterfaceC34352OooO0O0
    public String getName() {
        return null;
    }

    public Object readResolve() throws ObjectStreamException {
        return C34354OooO0Oo.OooO0OO(getName());
    }
}
