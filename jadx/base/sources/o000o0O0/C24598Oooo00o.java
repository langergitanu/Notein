package o000o0O0;

import android.view.View;
import com.orion.notein.global.R;
import java.lang.ref.WeakReference;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o000o0O0.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24598Oooo00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<View, C24572OooOO0o> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C24598Oooo00o f83361OooOo0o = new C24598Oooo00o(1);

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C24572OooOO0o invoke(View view) {
        View it = view;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        Object tag = it.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (C24572OooOO0o) ((WeakReference) tag).get();
        }
        if (tag instanceof C24572OooOO0o) {
            return (C24572OooOO0o) tag;
        }
        return null;
    }
}
