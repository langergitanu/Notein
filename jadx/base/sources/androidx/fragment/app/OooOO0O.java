package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC21925OoooOoO;
import androidx.fragment.app.C21885OooO0Oo;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f64969OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C21885OooO0Oo.C21887OooO0oO f64970OooOo0o;

    public /* synthetic */ OooOO0O(C21885OooO0Oo.C21887OooO0oO c21887OooO0oO, ViewGroup viewGroup) {
        this.f64970OooOo0o = c21887OooO0oO;
        this.f64969OooOo = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C21885OooO0Oo.C21887OooO0oO this$0 = this.f64970OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
        ViewGroup container = this.f64969OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(container, "$container");
        Iterator it = this$0.f64933OooO0OO.iterator();
        while (it.hasNext()) {
            AbstractC21925OoooOoO.OooO0OO oooO0OO = ((C21885OooO0Oo.C21888OooO0oo) it.next()).f64930OooO00o;
            View view = oooO0OO.f65089OooO0OO.getView();
            if (view != null) {
                oooO0OO.f65087OooO00o.OooO00o(view, container);
            }
        }
    }
}
