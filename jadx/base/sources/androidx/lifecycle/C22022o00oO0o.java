package androidx.lifecycle;

import android.view.View;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: androidx.lifecycle.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22022o00oO0o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<View, View> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C22022o00oO0o f65692OooOo0o = new C22022o00oO0o(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final View invoke(View view) {
        View view2 = view;
        kotlin.jvm.internal.OooOOO0.OooO0oO(view2, "view");
        Object parent = view2.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
