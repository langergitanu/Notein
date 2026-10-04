package androidx.lifecycle;

import android.view.View;
import com.orion.notein.global.R;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0O.C33576OooOOOo;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o {

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<View, View> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f65705OooOo0o = new OooO00o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final View invoke(View view) {
            View currentView = view;
            kotlin.jvm.internal.OooOOO0.OooO0oO(currentView, "currentView");
            Object parent = currentView.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<View, InterfaceC21987OooOoo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f65706OooOo0o = new OooO0O0(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final InterfaceC21987OooOoo invoke(View view) {
            View viewParent = view;
            kotlin.jvm.internal.OooOOO0.OooO0oO(viewParent, "viewParent");
            Object tag = viewParent.getTag(R.id.view_tree_lifecycle_owner);
            if (tag instanceof InterfaceC21987OooOoo) {
                return (InterfaceC21987OooOoo) tag;
            }
            return null;
        }
    }

    public static final InterfaceC21987OooOoo OooO00o(View view) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "<this>");
        return (InterfaceC21987OooOoo) C33576OooOOOo.OooOOOO(C33576OooOOOo.OooOo00(C33574OooOOO0.OooO(view, OooO00o.f65705OooOo0o), OooO0O0.f65706OooOo0o));
    }

    public static final void OooO0O0(View view, InterfaceC21987OooOoo interfaceC21987OooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC21987OooOoo);
    }
}
