package oO0Oo0o;

import o0ooOO0.AbstractC31500OooO00o;
import oO0O0Oo0.AbstractC32675OooOOoo;
import oO0Ooo.AbstractC33320OooOoo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO extends AbstractC31500OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC32675OooOOoo f120180OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO0OO(oO0O0OO.OooO00o oooO00o, AbstractC33320OooOoo abstractC33320OooOoo, OooO0o oooO0o) {
        super(abstractC33320OooOoo, oooO0o);
        if (abstractC33320OooOoo == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f120180OooO0OO = (AbstractC32675OooOOoo) oooO00o;
    }

    public final String toString() {
        return getType() + ": Ext {" + this.f120180OooO0OO + "}";
    }
}
