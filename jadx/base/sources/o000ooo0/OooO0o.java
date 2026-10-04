package o000ooo0;

import android.view.View;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends OooOOOO implements InterfaceC32507OooOO0o<View, View> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO0o f83959OooOo0o = new OooO0o(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final View invoke(View view) {
        View view2 = view;
        OooOOO0.OooO0oO(view2, "view");
        Object parent = view2.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
