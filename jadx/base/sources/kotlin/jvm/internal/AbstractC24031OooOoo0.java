package kotlin.jvm.internal;

import oOoo0.InterfaceC34594OooO0OO;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: kotlin.jvm.internal.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC24031OooOoo0 extends AbstractC24015OooO0Oo implements InterfaceC34602OooOO0o {
    private final boolean syntheticJavaProperty;

    public AbstractC24031OooOoo0() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public InterfaceC34594OooO0OO compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC24031OooOoo0) {
            AbstractC24031OooOoo0 abstractC24031OooOoo0 = (AbstractC24031OooOoo0) obj;
            return getOwner().equals(abstractC24031OooOoo0.getOwner()) && getName().equals(abstractC24031OooOoo0.getName()) && getSignature().equals(abstractC24031OooOoo0.getSignature()) && OooOOO0.OooO0O0(getBoundReceiver(), abstractC24031OooOoo0.getBoundReceiver());
        }
        if (obj instanceof InterfaceC34602OooOO0o) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // oOoo0.InterfaceC34602OooOO0o
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // oOoo0.InterfaceC34602OooOO0o
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC34594OooO0OO interfaceC34594OooO0OOCompute = compute();
        if (interfaceC34594OooO0OOCompute != this) {
            return interfaceC34594OooO0OOCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public InterfaceC34602OooOO0o getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (InterfaceC34602OooOO0o) super.getReflected();
    }

    public AbstractC24031OooOoo0(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    public AbstractC24031OooOoo0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }
}
