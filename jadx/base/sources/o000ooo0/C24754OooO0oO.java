package o000ooo0;

import android.view.View;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o000ooo0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24754OooO0oO extends OooOOOO implements InterfaceC32507OooOO0o<View, InterfaceC24753OooO0o0> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C24754OooO0oO f83960OooOo0o = new C24754OooO0oO(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final InterfaceC24753OooO0o0 invoke(View view) {
        View view2 = view;
        OooOOO0.OooO0oO(view2, "view");
        Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
        if (tag instanceof InterfaceC24753OooO0o0) {
            return (InterfaceC24753OooO0o0) tag;
        }
        return null;
    }
}
