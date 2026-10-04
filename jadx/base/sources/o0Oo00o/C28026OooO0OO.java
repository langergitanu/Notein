package o0Oo00o;

import android.os.Bundle;
import android.util.Log;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24587OooOoo;
import o000o0O0.OooOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo00o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28026OooO0OO {
    public static final void OooO00o(C24572OooOO0o c24572OooOO0o, int i, Bundle bundle) {
        try {
            c24572OooOO0o.OooOOO0(i, bundle, null);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NavControllerExt");
            c20358OooO00o.OooO0Oo(e, "safeNavigate error", new Object[0]);
        }
    }

    public static final void OooO0O0(C24572OooOO0o c24572OooOO0o, OooOo directions) {
        OooOOO0.OooO0oO(directions, "directions");
        try {
            c24572OooOO0o.OooOOOO(directions);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NavControllerExt");
            c20358OooO00o.OooO0Oo(e, "safeNavigate error", new Object[0]);
        }
    }

    public static final void OooO0OO(C24572OooOO0o c24572OooOO0o, OooOo directions, C24587OooOoo c24587OooOoo) {
        OooOOO0.OooO0oO(directions, "directions");
        try {
            c24572OooOO0o.OooOOO0(directions.getActionId(), directions.getArguments(), c24587OooOoo);
        } catch (Exception e) {
            Log.d("NavControllerExt", "safeNavigate error. " + e.getMessage());
        }
    }
}
