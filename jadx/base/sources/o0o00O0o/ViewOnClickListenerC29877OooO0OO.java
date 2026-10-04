package o0o00O0o;

import android.view.View;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0o00O0o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewOnClickListenerC29877OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C29878OooO0Oo f106011OooOo0o;

    public ViewOnClickListenerC29877OooO0OO(C29878OooO0Oo c29878OooO0Oo) {
        this.f106011OooOo0o = c29878OooO0Oo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        OooOOO0.OooO0oO(v, "v");
        C29878OooO0Oo c29878OooO0Oo = this.f106011OooOo0o;
        c29878OooO0Oo.f106013OooOo0o.onClick(v);
        synchronized (c29878OooO0Oo) {
            c29878OooO0Oo.f106012OooOo.dismiss();
        }
    }
}
