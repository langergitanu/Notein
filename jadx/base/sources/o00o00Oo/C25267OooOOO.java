package o00o00Oo;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.List;
import o000OoOO.C24539OooO0OO;
import o00o000.C25223OooOOoo;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: renamed from: o00o00Oo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25267OooOOO implements Handler.Callback {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final OooO00o f85999OooOoo0 = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0O0 f86000OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public volatile com.bumptech.glide.OooOOO0 f86001OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC25263OooO0oo f86002OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooOo.OooO00o<View, Fragment> f86003OooOoO0 = new OooOo.OooO00o<>();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C25266OooOO0o f86004OooOoOO;

    /* JADX INFO: renamed from: o00o00Oo.OooOOO$OooO00o */
    public class OooO00o implements OooO0O0 {
        @Override // o00o00Oo.C25267OooOOO.OooO0O0
        public final com.bumptech.glide.OooOOO0 OooO00o(com.bumptech.glide.OooO0OO oooO0OO, InterfaceC25255OooO interfaceC25255OooO, InterfaceC25269OooOOOO interfaceC25269OooOOOO, Context context) {
            return new com.bumptech.glide.OooOOO0(oooO0OO, interfaceC25255OooO, interfaceC25269OooOOOO, context);
        }
    }

    /* JADX INFO: renamed from: o00o00Oo.OooOOO$OooO0O0 */
    public interface OooO0O0 {
        com.bumptech.glide.OooOOO0 OooO00o(com.bumptech.glide.OooO0OO oooO0OO, InterfaceC25255OooO interfaceC25255OooO, InterfaceC25269OooOOOO interfaceC25269OooOOOO, Context context);
    }

    public C25267OooOOO(OooO0O0 oooO0O0) {
        oooO0O0 = oooO0O0 == null ? f85999OooOoo0 : oooO0O0;
        this.f86000OooOo = oooO0O0;
        this.f86004OooOoOO = new C25266OooOO0o(oooO0O0);
        this.f86002OooOoO = (C25223OooOOoo.f85904OooO0o && C25223OooOOoo.f85905OooO0o0) ? new C25262OooO0oO() : new C24539OooO0OO();
    }

    public static Activity OooO00o(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return OooO00o(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void OooO0O0(List list, OooOo.OooO00o oooO00o) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                oooO00o.put(fragment.getView(), fragment);
                OooO0O0(fragment.getChildFragmentManager().f64800OooO0OO.OooO0o(), oooO00o);
            }
        }
    }

    public final com.bumptech.glide.OooOOO0 OooO0OO(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = C25316OooOO0o.f86159OooO00o;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof ActivityC21897OooOo0) {
                return OooO0o0((ActivityC21897OooOo0) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return OooO0OO(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f86001OooOo0o == null) {
            synchronized (this) {
                try {
                    if (this.f86001OooOo0o == null) {
                        this.f86001OooOo0o = this.f86000OooOo.OooO00o(com.bumptech.glide.OooO0OO.OooO00o(context.getApplicationContext()), new C25256OooO00o(), new C25261OooO0o0(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f86001OooOo0o;
    }

    public final com.bumptech.glide.OooOOO0 OooO0Oo(Fragment fragment) {
        C21929Ooooo0o.OooO0OO(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        char[] cArr = C25316OooOO0o.f86159OooO00o;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return OooO0OO(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f86002OooOoO.OooO00o(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f86004OooOoOO.OooO00o(context, com.bumptech.glide.OooO0OO.OooO00o(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.lifecycle.OooOOo0, void] */
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
    public final com.bumptech.glide.OooOOO0 OooO0o0(ActivityC21897OooOo0 activityC21897OooOo0) {
        char[] cArr = C25316OooOO0o.f86159OooO00o;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return OooO0OO(activityC21897OooOo0.getApplicationContext());
        }
        if (activityC21897OooOo0.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f86002OooOoO.OooO00o(activityC21897OooOo0);
        Activity activityOooO00o = OooO00o(activityC21897OooOo0);
        return this.f86004OooOoOO.OooO00o(activityC21897OooOo0, com.bumptech.glide.OooO0OO.OooO00o(activityC21897OooOo0.getApplicationContext()), activityC21897OooOo0.close(), activityC21897OooOo0.getSupportFragmentManager(), activityOooO00o == null || !activityOooO00o.isFinishing());
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
