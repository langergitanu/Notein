package OooO0Oo;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21986OooOoOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.C24019OooOO0o;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34426OooOO0o;

/* JADX INFO: renamed from: OooO0Oo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20418OooOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Runnable f58227OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34426OooOO0o<AbstractC20413OooOo0O> f58228OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AbstractC20413OooOo0O f58229OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OnBackInvokedCallback f58230OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f58231OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OnBackInvokedDispatcher f58232OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f58233OooO0oO;

    /* JADX INFO: renamed from: OooO0Oo.OooOoo$OooO00o */
    public static final class OooO00o {
        public static void OooO00o(Object dispatcher, Object callback) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(dispatcher, "dispatcher");
            kotlin.jvm.internal.OooOOO0.OooO0oO(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) callback);
        }

        public static void OooO0O0(Object dispatcher, Object callback) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(dispatcher, "dispatcher");
            kotlin.jvm.internal.OooOOO0.OooO0oO(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* JADX INFO: renamed from: OooO0Oo.OooOoo$OooO0O0 */
    public static final class OooO0O0 {
    }

    /* JADX INFO: renamed from: OooO0Oo.OooOoo$OooO0OO */
    public final class OooO0OO implements InterfaceC21986OooOoOO, InterfaceC20399OooO0Oo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AbstractC20413OooOo0O f58234OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final AbstractC21979OooOOo0 f58235OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C20418OooOoo f58236OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public C20419OooO0Oo f58237OooOoO0;

        public OooO0OO(C20418OooOoo c20418OooOoo, AbstractC21979OooOOo0 abstractC21979OooOOo0, AbstractC20413OooOo0O onBackPressedCallback) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(onBackPressedCallback, "onBackPressedCallback");
            this.f58236OooOoO = c20418OooOoo;
            this.f58235OooOo0o = abstractC21979OooOOo0;
            this.f58234OooOo = onBackPressedCallback;
            abstractC21979OooOOo0.OooO00o(this);
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
        @Override // androidx.lifecycle.InterfaceC21986OooOoOO
        public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
            if (oooO00o != AbstractC21979OooOOo0.OooO00o.ON_START) {
                if (oooO00o != AbstractC21979OooOOo0.OooO00o.ON_STOP) {
                    if (oooO00o == AbstractC21979OooOOo0.OooO00o.ON_DESTROY) {
                        cancel();
                        return;
                    }
                    return;
                } else {
                    C20419OooO0Oo c20419OooO0Oo = this.f58237OooOoO0;
                    if (c20419OooO0Oo != null) {
                        c20419OooO0Oo.cancel();
                        return;
                    }
                    return;
                }
            }
            C20418OooOoo c20418OooOoo = this.f58236OooOoO;
            c20418OooOoo.getClass();
            AbstractC20413OooOo0O onBackPressedCallback = this.f58234OooOo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(onBackPressedCallback, "onBackPressedCallback");
            c20418OooOoo.f58228OooO0O0.addLast(onBackPressedCallback);
            C20419OooO0Oo c20419OooO0Oo2 = new C20419OooO0Oo(c20418OooOoo, onBackPressedCallback);
            onBackPressedCallback.addCancellable(c20419OooO0Oo2);
            c20418OooOoo.OooO0o0();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(new C20423OooOooo(0, c20418OooOoo, C20418OooOoo.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0));
            this.f58237OooOoO0 = c20419OooO0Oo2;
        }

        @Override // OooO0Oo.InterfaceC20399OooO0Oo
        public final void cancel() {
            this.f58235OooOo0o.OooO0OO(this);
            this.f58234OooOo.removeCancellable(this);
            C20419OooO0Oo c20419OooO0Oo = this.f58237OooOoO0;
            if (c20419OooO0Oo != null) {
                c20419OooO0Oo.cancel();
            }
            this.f58237OooOoO0 = null;
        }
    }

    /* JADX INFO: renamed from: OooO0Oo.OooOoo$OooO0Oo, reason: case insensitive filesystem */
    public final class C20419OooO0Oo implements InterfaceC20399OooO0Oo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C20418OooOoo f58238OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final AbstractC20413OooOo0O f58239OooOo0o;

        public C20419OooO0Oo(C20418OooOoo c20418OooOoo, AbstractC20413OooOo0O onBackPressedCallback) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(onBackPressedCallback, "onBackPressedCallback");
            this.f58238OooOo = c20418OooOoo;
            this.f58239OooOo0o = onBackPressedCallback;
        }

        @Override // OooO0Oo.InterfaceC20399OooO0Oo
        public final void cancel() {
            C20418OooOoo c20418OooOoo = this.f58238OooOo;
            C34426OooOO0o<AbstractC20413OooOo0O> c34426OooOO0o = c20418OooOoo.f58228OooO0O0;
            AbstractC20413OooOo0O abstractC20413OooOo0O = this.f58239OooOo0o;
            c34426OooOO0o.remove(abstractC20413OooOo0O);
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c20418OooOoo.f58229OooO0OO, abstractC20413OooOo0O)) {
                abstractC20413OooOo0O.handleOnBackCancelled();
                c20418OooOoo.f58229OooO0OO = null;
            }
            abstractC20413OooOo0O.removeCancellable(this);
            oO0O000o.OooO00o<C32460OooOooO> enabledChangedCallback$activity_release = abstractC20413OooOo0O.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            abstractC20413OooOo0O.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* JADX INFO: renamed from: OooO0Oo.OooOoo$OooO0o0, reason: case insensitive filesystem */
    public /* synthetic */ class C20420OooO0o0 extends C24019OooOO0o implements oO0O000o.OooO00o<C32460OooOooO> {
        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            ((C20418OooOoo) this.receiver).OooO0o0();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C20418OooOoo(Runnable runnable) {
        OnBackInvokedCallback c20422OooOooO;
        this.f58227OooO00o = runnable;
        this.f58228OooO0O0 = new C34426OooOO0o<>();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                c20422OooOooO = new C20422OooOooO(new C20414OooOo0o(this, 0), new OooOo(this, 0), new C20416OooOoO0(this), new C20415OooOoO(this));
            } else {
                final C20417OooOoOO c20417OooOoOO = new C20417OooOoOO(this);
                c20422OooOooO = new OnBackInvokedCallback() { // from class: OooO0Oo.OooOoo0
                    public final void onBackInvoked() {
                        c20417OooOoOO.invoke();
                    }
                };
            }
            this.f58230OooO0Oo = c20422OooOooO;
        }
    }

    public final void OooO00o(InterfaceC21987OooOoo owner, AbstractC20413OooOo0O onBackPressedCallback) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(owner, "owner");
        kotlin.jvm.internal.OooOOO0.OooO0oO(onBackPressedCallback, "onBackPressedCallback");
        AbstractC21979OooOOo0 lifecycle = owner.getLifecycle();
        if (lifecycle.OooO0O0() == AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
            return;
        }
        onBackPressedCallback.addCancellable(new OooO0OO(this, lifecycle, onBackPressedCallback));
        OooO0o0();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new C20420OooO0o0(0, this, C20418OooOoo.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0));
    }

    public final void OooO0O0() {
        AbstractC20413OooOo0O abstractC20413OooOo0OPrevious;
        AbstractC20413OooOo0O abstractC20413OooOo0O = this.f58229OooO0OO;
        if (abstractC20413OooOo0O == null) {
            C34426OooOO0o<AbstractC20413OooOo0O> c34426OooOO0o = this.f58228OooO0O0;
            ListIterator<AbstractC20413OooOo0O> listIterator = c34426OooOO0o.listIterator(c34426OooOO0o.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC20413OooOo0OPrevious = null;
                    break;
                } else {
                    abstractC20413OooOo0OPrevious = listIterator.previous();
                    if (abstractC20413OooOo0OPrevious.getIsEnabled()) {
                        break;
                    }
                }
            }
            abstractC20413OooOo0O = abstractC20413OooOo0OPrevious;
        }
        this.f58229OooO0OO = null;
        if (abstractC20413OooOo0O != null) {
            abstractC20413OooOo0O.handleOnBackCancelled();
        }
    }

    public final void OooO0OO() {
        AbstractC20413OooOo0O abstractC20413OooOo0OPrevious;
        AbstractC20413OooOo0O abstractC20413OooOo0O = this.f58229OooO0OO;
        if (abstractC20413OooOo0O == null) {
            C34426OooOO0o<AbstractC20413OooOo0O> c34426OooOO0o = this.f58228OooO0O0;
            ListIterator<AbstractC20413OooOo0O> listIterator = c34426OooOO0o.listIterator(c34426OooOO0o.OooO0O0());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC20413OooOo0OPrevious = null;
                    break;
                } else {
                    abstractC20413OooOo0OPrevious = listIterator.previous();
                    if (abstractC20413OooOo0OPrevious.getIsEnabled()) {
                        break;
                    }
                }
            }
            abstractC20413OooOo0O = abstractC20413OooOo0OPrevious;
        }
        this.f58229OooO0OO = null;
        if (abstractC20413OooOo0O != null) {
            abstractC20413OooOo0O.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f58227OooO00o;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void OooO0Oo(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f58232OooO0o0;
        OnBackInvokedCallback onBackInvokedCallback = this.f58230OooO0Oo;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z && !this.f58231OooO0o) {
            OooO00o.OooO00o(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f58231OooO0o = true;
        } else {
            if (z || !this.f58231OooO0o) {
                return;
            }
            OooO00o.OooO0O0(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f58231OooO0o = false;
        }
    }

    public final void OooO0o0() {
        boolean z = this.f58233OooO0oO;
        boolean z2 = false;
        C34426OooOO0o<AbstractC20413OooOo0O> c34426OooOO0o = this.f58228OooO0O0;
        if (c34426OooOO0o == null || !c34426OooOO0o.isEmpty()) {
            Iterator<AbstractC20413OooOo0O> it = c34426OooOO0o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().getIsEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f58233OooO0oO = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        OooO0Oo(z2);
    }

    public C20418OooOoo() {
        this(null);
    }
}
