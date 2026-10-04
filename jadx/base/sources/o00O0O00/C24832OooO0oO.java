package o00O0O00;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import o0000OO0.OooO;
import o00O00oO.C24812OooO;
import o00O00oO.C24822OooOO0o;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34434OooOoO;
import oo00o.InterfaceC34660OooO00o;

/* JADX INFO: renamed from: o00O0O00.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24832OooO0oO implements InterfaceC34660OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static volatile C24832OooO0oO f84215OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ReentrantLock f84216OooO0Oo = new ReentrantLock();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SidecarCompat f84217OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CopyOnWriteArrayList<OooO0O0> f84218OooO0O0 = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: o00O0O00.OooO0oO$OooO00o */
    public final class OooO00o {
        public OooO00o() {
        }
    }

    /* JADX INFO: renamed from: o00O0O00.OooO0oO$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Activity f84220OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C24812OooO f84221OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public C24822OooOO0o f84222OooO0OO;

        public OooO0O0(Activity activity, OooO oooO, C24812OooO c24812OooO) {
            this.f84220OooO00o = activity;
            this.f84221OooO0O0 = c24812OooO;
        }
    }

    public C24832OooO0oO(SidecarCompat sidecarCompat) {
        this.f84217OooO00o = sidecarCompat;
        if (sidecarCompat != null) {
            sidecarCompat.OooO0Oo(new OooO00o());
        }
    }

    @Override // oo00o.InterfaceC34660OooO00o
    public final void OooO00o(C24812OooO c24812OooO) {
        synchronized (f84216OooO0Oo) {
            try {
                if (this.f84217OooO00o == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (OooO0O0 oooO0O0 : this.f84218OooO0O0) {
                    if (oooO0O0.f84221OooO0O0 == c24812OooO) {
                        arrayList.add(oooO0O0);
                    }
                }
                this.f84218OooO0O0.removeAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Activity activity = ((OooO0O0) it.next()).f84220OooO00o;
                    CopyOnWriteArrayList<OooO0O0> copyOnWriteArrayList = this.f84218OooO0O0;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator<OooO0O0> it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            if (it2.next().f84220OooO00o.equals(activity)) {
                                break;
                            }
                        }
                    }
                    SidecarCompat sidecarCompat = this.f84217OooO00o;
                    if (sidecarCompat != null) {
                        sidecarCompat.OooO0O0(activity);
                    }
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
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
    @Override // oo00o.InterfaceC34660OooO00o
    public final void OooO0O0(Context context, OooO oooO, C24812OooO c24812OooO) {
        OooO0O0 next;
        WindowManager.LayoutParams attributes;
        C32460OooOooO c32460OooOooO = null;
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        if (activity != null) {
            ReentrantLock reentrantLock = f84216OooO0Oo;
            reentrantLock.lock();
            try {
                SidecarCompat sidecarCompat = this.f84217OooO00o;
                if (sidecarCompat == null) {
                    c24812OooO.accept(new C24822OooOO0o(c34434OooOoO));
                    return;
                }
                CopyOnWriteArrayList<OooO0O0> copyOnWriteArrayList = this.f84218OooO0O0;
                boolean z = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator<OooO0O0> it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (it.next().f84220OooO00o.equals(activity)) {
                            z = true;
                            break;
                        }
                    }
                }
                OooO0O0 oooO0O0 = new OooO0O0(activity, oooO, c24812OooO);
                copyOnWriteArrayList.add(oooO0O0);
                if (z) {
                    Iterator<OooO0O0> it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            if (activity.equals(next.f84220OooO00o)) {
                                break;
                            }
                        }
                    }
                    OooO0O0 oooO0O02 = next;
                    C24822OooOO0o c24822OooOO0o = oooO0O02 != null ? oooO0O02.f84222OooO0OO : null;
                    if (c24822OooOO0o != null) {
                        oooO0O0.f84222OooO0OO = c24822OooOO0o;
                        oooO0O0.f84221OooO0O0.accept(c24822OooOO0o);
                    }
                } else {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        sidecarCompat.OooO0OO(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new SidecarCompat.OooO0OO(sidecarCompat, activity));
                    }
                }
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                reentrantLock.unlock();
                c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (c32460OooOooO == null) {
            c24812OooO.accept(new C24822OooOO0o(c34434OooOoO));
        }
    }
}
