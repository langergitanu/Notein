package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.C21885OooO0Oo;
import java.util.ArrayList;
import java.util.Iterator;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f64973OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C21885OooO0Oo.C21887OooO0oO f64974OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f64975OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(ViewGroup viewGroup, C21885OooO0Oo.C21887OooO0oO c21887OooO0oO, Object obj) {
        super(0);
        this.f64974OooOo0o = c21887OooO0oO;
        this.f64973OooOo = obj;
        this.f64975OooOoO0 = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    @Override // oO0O000o.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C32460OooOooO invoke() {
        final C21885OooO0Oo.C21887OooO0oO c21887OooO0oO = this.f64974OooOo0o;
        ArrayList arrayList = c21887OooO0oO.f64933OooO0OO;
        AbstractC21921OoooOO0 abstractC21921OoooOO0 = c21887OooO0oO.f64935OooO0o;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((C21885OooO0Oo.C21888OooO0oo) it.next()).f64930OooO00o.f65093OooO0oO) {
                    if (FragmentManager.Oooo0o(2)) {
                        Log.v("FragmentManager", "Completing animating immediately");
                    }
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    abstractC21921OoooOO0.OooOo0(((C21885OooO0Oo.C21888OooO0oo) c21887OooO0oO.f64933OooO0OO.get(0)).f64930OooO00o.f65089OooO0OO, this.f64973OooOo, cancellationSignal, new Runnable() { // from class: androidx.fragment.app.OooOO0o
                        @Override // java.lang.Runnable
                        public final void run() {
                            C21885OooO0Oo.C21887OooO0oO this$0 = c21887OooO0oO;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                            if (FragmentManager.Oooo0o(2)) {
                                Log.v("FragmentManager", "Transition for all operations has completed");
                            }
                            Iterator it2 = this$0.f64933OooO0OO.iterator();
                            while (it2.hasNext()) {
                                ((C21885OooO0Oo.C21888OooO0oo) it2.next()).f64930OooO00o.OooO0OO(this$0);
                            }
                        }
                    });
                    cancellationSignal.cancel();
                }
            }
            if (FragmentManager.Oooo0o(2)) {
                Log.v("FragmentManager", "Animating to start");
            }
            Object obj = c21887OooO0oO.f64946OooOOo0;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(obj);
            abstractC21921OoooOO0.OooO0Oo(obj, new OooOO0O(c21887OooO0oO, this.f64975OooOoO0));
        } else {
            if (FragmentManager.Oooo0o(2)) {
            }
            Object obj2 = c21887OooO0oO.f64946OooOOo0;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(obj2);
            abstractC21921OoooOO0.OooO0Oo(obj2, new OooOO0O(c21887OooO0oO, this.f64975OooOoO0));
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
