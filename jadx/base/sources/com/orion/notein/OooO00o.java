package com.orion.notein;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.drawerlayout.widget.DrawerLayout;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24586OooOoOO;
import o000o0O0.C24587OooOoo;
import o0Oo0ooO.C28456OoooOoO;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO00o extends DrawerLayout.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MainActivity f69771OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C24586OooOoOO f69772OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ C28456OoooOoO f69773OooO0OO;

    public OooO00o(MainActivity mainActivity, C24586OooOoOO c24586OooOoOO, C28456OoooOoO c28456OoooOoO) {
        this.f69771OooO00o = mainActivity;
        this.f69772OooO0O0 = c24586OooOoOO;
        this.f69773OooO0OO = c28456OoooOoO;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.OooO0o, androidx.drawerlayout.widget.DrawerLayout.InterfaceC21850OooO0Oo
    public final void onDrawerClosed(View drawerView) {
        OooOOO0.OooO0oO(drawerView, "drawerView");
        DrawerLayout drawerLayout = this.f69771OooO00o.drawerLayout;
        if (drawerLayout == null) {
            OooOOO0.OooOOOO("drawerLayout");
            throw null;
        }
        drawerLayout.OooOOo(this);
        C24587OooOoo c24587OooOoo = new C24587OooOoo(false, false, R.id.nav_graph, true, false, -1, -1, -1, -1);
        this.f69772OooO0O0.OooOOO0(R.id.labelContainerFragment, BundleKt.bundleOf(new C32443OooOOO("labelId", Long.valueOf(this.f69773OooO0OO.f100833OooO00o))), c24587OooOoo);
    }
}
