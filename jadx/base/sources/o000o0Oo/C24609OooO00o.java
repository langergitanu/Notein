package o000o0Oo;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o000o0O0.C24586OooOoOO;

/* JADX INFO: renamed from: o000o0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24609OooO00o implements C24572OooOO0o.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ WeakReference<NavigationView> f83391OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C24586OooOoOO f83392OooO0O0;

    public C24609OooO00o(WeakReference weakReference, C24586OooOoOO c24586OooOoOO) {
        this.f83391OooO00o = weakReference;
        this.f83392OooO0O0 = c24586OooOoOO;
    }

    @Override // o000o0O0.C24572OooOO0o.OooO0O0
    public final void OooO00o(C24572OooOO0o controller, C24583OooOo0o destination, Bundle bundle) {
        OooOOO0.OooO0oO(controller, "controller");
        OooOOO0.OooO0oO(destination, "destination");
        NavigationView navigationView = this.f83391OooO00o.get();
        if (navigationView == null) {
            this.f83392OooO0O0.OooOo0o(this);
            return;
        }
        Menu menu = navigationView.getMenu();
        OooOOO0.OooO0o(menu, "view.menu");
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menu.getItem(i);
            OooOOO0.OooO0OO(item, "getItem(index)");
            item.setChecked(C24610OooO0O0.OooOO0(destination, item.getItemId()));
        }
    }
}
