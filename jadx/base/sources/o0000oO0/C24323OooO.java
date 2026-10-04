package o0000oO0;

import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.OooOOO0;
import o0000o.C24245OooO0Oo;

/* JADX INFO: renamed from: o0000oO0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24323OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final LinkedHashSet f81887OooO00o = new LinkedHashSet();

    public static o0000o.OooO0O0 OooO00o(Context context, String sharedPreferencesName) {
        LinkedHashSet keysToMigrate = f81887OooO00o;
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(sharedPreferencesName, "sharedPreferencesName");
        OooOOO0.OooO0oO(keysToMigrate, "keysToMigrate");
        return new o0000o.OooO0O0(context, sharedPreferencesName, C24245OooO0Oo.f81516OooO00o, new C24331OooO0oo(keysToMigrate, null), new C24330OooO0oO(3, null));
    }
}
