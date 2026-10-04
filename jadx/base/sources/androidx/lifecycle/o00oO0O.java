package androidx.lifecycle;

import android.view.View;
import com.orion.notein.global.R;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0O extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<View, InterfaceC22023o00ooo> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final o00oO0O f65691OooOo0o = new o00oO0O(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final InterfaceC22023o00ooo invoke(View view) {
        View view2 = view;
        kotlin.jvm.internal.OooOOO0.OooO0oO(view2, "view");
        Object tag = view2.getTag(R.id.view_tree_view_model_store_owner);
        if (tag instanceof InterfaceC22023o00ooo) {
            return (InterfaceC22023o00ooo) tag;
        }
        return null;
    }
}
