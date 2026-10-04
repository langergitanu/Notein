package o0Oo0O00;

import Oooo0.C20857Oooooo;
import android.content.Context;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.Oooo0;
import o0000o0O.OooOO0;
import o0000oO0.C24326OooO0OO;
import o0000oOO.AbstractC24338OooO0o0;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: o0Oo0O00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28051OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f99445OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C24326OooO0OO f99446OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C24326OooO0OO f99447OooO0OO;

    static {
        C24028OooOoO0 c24028OooOoO0 = new C24028OooOoO0(C28051OooO00o.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f99445OooO00o = new InterfaceC34602OooOO0o[]{oooo0.OooO0oO(c24028OooOoO0), oooo0.OooO0oO(new C24028OooOoO0(C28051OooO00o.class, "ignoreLoginStatusDataStore", "getIgnoreLoginStatusDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
        f99446OooO0O0 = C20857Oooooo.OooO0o("notein-sp", null, 14);
        f99447OooO0OO = C20857Oooooo.OooO0o("notein-ignore-login-status-sp", null, 14);
    }

    public static final OooOO0<AbstractC24338OooO0o0> OooO00o(Context context) {
        OooOOO0.OooO0oO(context, "<this>");
        return f99446OooO0O0.getValue(context, f99445OooO00o[0]);
    }

    public static final OooOO0<AbstractC24338OooO0o0> OooO0O0(Context context) {
        OooOOO0.OooO0oO(context, "<this>");
        return f99447OooO0OO.getValue(context, f99445OooO00o[1]);
    }
}
