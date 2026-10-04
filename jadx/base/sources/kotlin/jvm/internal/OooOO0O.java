package kotlin.jvm.internal;

import oOoo0.InterfaceC34594OooO0OO;
import oOoo0.InterfaceC34598OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public class OooOO0O extends AbstractC24015OooO0Oo implements OooOO0, InterfaceC34598OooO0oO {
    private final int arity;
    private final int flags;

    public OooOO0O(int i) {
        this(i, AbstractC24015OooO0Oo.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public InterfaceC34594OooO0OO computeReflected() {
        return C24035Oooo00o.f80943OooO00o.OooO00o(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooOO0O) {
            OooOO0O oooOO0O = (OooOO0O) obj;
            return getName().equals(oooOO0O.getName()) && getSignature().equals(oooOO0O.getSignature()) && this.flags == oooOO0O.flags && this.arity == oooOO0O.arity && OooOOO0.OooO0O0(getBoundReceiver(), oooOO0O.getBoundReceiver()) && OooOOO0.OooO0O0(getOwner(), oooOO0O.getOwner());
        }
        if (obj instanceof InterfaceC34598OooO0oO) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.OooOO0
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // oOoo0.InterfaceC34598OooO0oO
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // oOoo0.InterfaceC34598OooO0oO
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // oOoo0.InterfaceC34598OooO0oO
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // oOoo0.InterfaceC34598OooO0oO
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo, oOoo0.InterfaceC34594OooO0OO
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC34594OooO0OO interfaceC34594OooO0OOCompute = compute();
        if (interfaceC34594OooO0OOCompute != this) {
            return interfaceC34594OooO0OOCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public OooOO0O(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public InterfaceC34598OooO0oO getReflected() {
        return (InterfaceC34598OooO0oO) super.getReflected();
    }

    public OooOO0O(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
