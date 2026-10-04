package o000o0O0;

import android.view.View;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o000o0O0.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24597Oooo00O extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<View, View> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C24597Oooo00O f83360OooOo0o = new C24597Oooo00O(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final View invoke(View view) {
        View it = view;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
