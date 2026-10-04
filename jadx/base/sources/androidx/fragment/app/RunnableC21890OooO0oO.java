package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.AbstractC21925OoooOoO;
import androidx.fragment.app.C21885OooO0Oo;
import com.orion.editor.PDFView;

/* JADX INFO: renamed from: androidx.fragment.app.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC21890OooO0oO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f64961OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f64962OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f64963OooOoO0;

    public /* synthetic */ RunnableC21890OooO0oO(int i, Object obj, Object obj2) {
        this.f64962OooOo0o = i;
        this.f64961OooOo = obj;
        this.f64963OooOoO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f64963OooOoO0;
        Object obj2 = this.f64961OooOo;
        switch (this.f64962OooOo0o) {
            case 0:
                AbstractC21925OoooOoO.OooO0OO operation = (AbstractC21925OoooOoO.OooO0OO) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO(operation, "$operation");
                C21885OooO0Oo.C21887OooO0oO this$0 = (C21885OooO0Oo.C21887OooO0oO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                if (FragmentManager.Oooo0o(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                }
                operation.OooO0OO(this$0);
                break;
            default:
                int i = PDFView.f69162o000o00O;
                ((PDFView) obj2).Oooooo((String) obj);
                break;
        }
    }
}
