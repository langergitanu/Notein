package o0Oo00o;

import Oooo0.C20857Oooooo;
import android.view.View;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.Oooo0;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: o0Oo00o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28025OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f99371OooO00o;

    static {
        C24028OooOoO0 c24028OooOoO0 = new C24028OooOoO0(C28025OooO0O0.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f99371OooO00o = new InterfaceC34602OooOO0o[]{oooo0.OooO0oO(c24028OooOoO0), oooo0.OooO0oO(new C24028OooOoO0(C28025OooO0O0.class, "ignoreLoginStatusDataStore", "getIgnoreLoginStatusDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
        C20857Oooooo.OooO0o("notein-sp", null, 14);
        C20857Oooooo.OooO0o("notein-ignore-login-status-sp", null, 14);
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    }

    public static void OooO00o(View view) {
        OooOOO0.OooO0oO(view, "<this>");
        view.setOnHoverListener(new ViewOnHoverListenerC28024OooO00o());
    }
}
