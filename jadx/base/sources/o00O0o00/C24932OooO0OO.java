package o00O0o00;

import com.google.common.util.concurrent.ListenableFuture;
import o00O0o00.AbstractC24926OooO00o;

/* JADX INFO: renamed from: o00O0o00.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24932OooO0OO<V> extends AbstractC24926OooO00o<V> {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean OooO(V v) {
        if (v == null) {
            v = (V) AbstractC24926OooO00o.f84570OooOoo;
        }
        if (!AbstractC24926OooO00o.f84571OooOoo0.OooO0O0(this, null, v)) {
            return false;
        }
        AbstractC24926OooO00o.OooO0O0(this);
        return true;
    }

    public final boolean OooOO0(Throwable th) {
        if (!AbstractC24926OooO00o.f84571OooOoo0.OooO0O0(this, null, new AbstractC24926OooO00o.OooO0OO(th))) {
            return false;
        }
        AbstractC24926OooO00o.OooO0O0(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooOO0O(ListenableFuture<? extends V> listenableFuture) {
        AbstractC24926OooO00o.OooO0OO oooO0OO;
        listenableFuture.getClass();
        Object obj = this.f84573OooOo0o;
        if (obj != null) {
            if (obj instanceof AbstractC24926OooO00o.OooO0O0) {
                listenableFuture.cancel(((AbstractC24926OooO00o.OooO0O0) obj).f84577OooO00o);
            }
        } else if (listenableFuture.isDone()) {
            if (AbstractC24926OooO00o.f84571OooOoo0.OooO0O0(this, null, AbstractC24926OooO00o.OooO0o0(listenableFuture))) {
                AbstractC24926OooO00o.OooO0O0(this);
                return true;
            }
        } else {
            AbstractC24926OooO00o.OooO0o oooO0o = new AbstractC24926OooO00o.OooO0o(this, listenableFuture);
            if (AbstractC24926OooO00o.f84571OooOoo0.OooO0O0(this, null, oooO0o)) {
                try {
                    listenableFuture.addListener(oooO0o, EnumC24931OooO0O0.f84596OooOo0o);
                    return true;
                } catch (Throwable th) {
                    try {
                        oooO0OO = new AbstractC24926OooO00o.OooO0OO(th);
                    } catch (Throwable unused) {
                        oooO0OO = AbstractC24926OooO00o.OooO0OO.f84579OooO0O0;
                    }
                    AbstractC24926OooO00o.f84571OooOoo0.OooO0O0(this, oooO0o, oooO0OO);
                    return true;
                }
            }
            obj = this.f84573OooOo0o;
            if (obj instanceof AbstractC24926OooO00o.OooO0O0) {
            }
        }
        return false;
    }
}
