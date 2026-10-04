package com.google.firebase.inappmessaging.internal;

import android.view.MenuItem;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.inappmessaging.internal.RateLimitProto;
import com.google.firebase.inappmessaging.model.RateLimit;
import com.orion.notein.global.R;
import o000o0O0.C24565OooO0O0;
import o000o0O0.C24583OooOo0o;
import o000o0O0.C24585OooOoO0;
import o000o0O0.C24586OooOoOO;
import o000o0O0.C24587OooOoo;
import o000o0Oo.C24610OooO0O0;
import oO00o00o.InterfaceC32331OooO0OO;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22759OoooOOO implements InterfaceC32331OooO0OO, NavigationView.OnNavigationItemSelectedListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68552OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68553OooOo0o;

    public /* synthetic */ C22759OoooOOO(Object obj, Object obj2) {
        this.f68553OooOo0o = obj;
        this.f68552OooOo = obj2;
    }

    @Override // oO00o00o.InterfaceC32331OooO0OO
    public Object apply(Object obj) {
        return ((RateLimiterClient) this.f68553OooOo0o).lambda$increment$4((RateLimit) this.f68552OooOo, (RateLimitProto.RateLimit) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNavigationItemSelected(MenuItem item) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        C24583OooOo0o c24583OooOo0oOooO0oO;
        C24586OooOoOO c24586OooOoOO = (C24586OooOoOO) this.f68553OooOo0o;
        NavigationView navigationView = (NavigationView) this.f68552OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
        C24583OooOo0o c24583OooOo0oOooO0oO2 = c24586OooOoOO.OooO0oO();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c24583OooOo0oOooO0oO2);
        C24585OooOoO0 c24585OooOoO0 = c24583OooOo0oOooO0oO2.f83295OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c24585OooOoO0);
        if (c24585OooOoO0.OooOO0(item.getItemId(), true) instanceof C24565OooO0O0.OooO00o) {
            i = R.anim.nav_default_enter_anim;
            i2 = R.anim.nav_default_exit_anim;
            i3 = R.anim.nav_default_pop_enter_anim;
            i4 = R.anim.nav_default_pop_exit_anim;
        } else {
            i = R.animator.nav_default_enter_anim;
            i2 = R.animator.nav_default_exit_anim;
            i3 = R.animator.nav_default_pop_enter_anim;
            i4 = R.animator.nav_default_pop_exit_anim;
        }
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        if ((item.getOrder() & 196608) == 0) {
            int i10 = C24585OooOoO0.f83310Oooo0O0;
            i5 = C24585OooOoO0.OooO00o.OooO00o(c24586OooOoOO.OooO()).f83302OooOooO;
            z = true;
        } else {
            i5 = -1;
            z = false;
        }
        try {
            c24586OooOoOO.OooOOO0(item.getItemId(), null, new C24587OooOoo(true, true, i5, false, z, i6, i7, i8, i9));
            c24583OooOo0oOooO0oO = c24586OooOoOO.OooO0oO();
        } catch (IllegalArgumentException unused) {
        }
        if (c24583OooOo0oOooO0oO != null) {
            z2 = C24610OooO0O0.OooOO0(c24583OooOo0oOooO0oO, item.getItemId());
        }
        if (z2) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof androidx.customview.widget.OooO0OO) {
                ((androidx.customview.widget.OooO0OO) parent).close();
            } else {
                BottomSheetBehavior bottomSheetBehaviorOooO = C24610OooO0O0.OooO(navigationView);
                if (bottomSheetBehaviorOooO != null) {
                    bottomSheetBehaviorOooO.setState(5);
                }
            }
        }
        return z2;
    }
}
