package OooOOo0;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;

/* JADX INFO: renamed from: OooOOo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C20466OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO.OooO0O0 f58438OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ComponentName f58439OooO0O0;

    public C20466OooO0Oo(OooO0OO.OooO0O0 oooO0O0, ComponentName componentName) {
        this.f58438OooO00o = oooO0O0;
        this.f58439OooO0O0 = componentName;
    }

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
    public final C20468OooO0oO OooO00o() {
        BinderC20465OooO0OO binderC20465OooO0OO = new BinderC20465OooO0OO();
        binderC20465OooO0OO.attachInterface(binderC20465OooO0OO, "android.support.customtabs.ICustomTabsCallback");
        new Handler(Looper.getMainLooper());
        OooO0OO.OooO0O0 oooO0O0 = this.f58438OooO00o;
        try {
            if (oooO0O0.OooO0O0(binderC20465OooO0OO)) {
                return new C20468OooO0oO(oooO0O0, binderC20465OooO0OO, this.f58439OooO0O0);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
