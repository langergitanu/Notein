package o00OOoo;

import android.content.Context;
import android.content.SharedPreferences;
import o00OOOo.C25014OooO0o0;

/* JADX INFO: renamed from: o00OOoo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25018OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f84947OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public SharedPreferences f84948OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public SharedPreferences.Editor f84949OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f84950OooO0Oo;

    public C25018OooO00o(Context context, String str) {
        this.f84948OooO0O0 = null;
        this.f84947OooO00o = str;
        this.f84950OooO0Oo = context;
        if (context != null) {
            this.f84948OooO0O0 = context.getSharedPreferences(str, 0);
        }
    }

    public final String OooO00o(String str) {
        SharedPreferences sharedPreferences = this.f84948OooO0O0;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!C25014OooO0o0.OooO0O0(string)) {
                return string;
            }
        }
        return "";
    }

    public final void OooO0O0() {
        Context context;
        System.currentTimeMillis();
        SharedPreferences.Editor editor = this.f84949OooO0OO;
        if (editor != null) {
            editor.commit();
        }
        if (this.f84948OooO0O0 == null || (context = this.f84950OooO0Oo) == null) {
            return;
        }
        this.f84948OooO0O0 = context.getSharedPreferences(this.f84947OooO00o, 0);
    }

    public final void OooO0OO(String str) {
        SharedPreferences sharedPreferences;
        if (C25014OooO0o0.OooO0O0(str) || str.equals("t")) {
            return;
        }
        if (this.f84949OooO0OO == null && (sharedPreferences = this.f84948OooO0O0) != null) {
            this.f84949OooO0OO = sharedPreferences.edit();
        }
        SharedPreferences.Editor editor = this.f84949OooO0OO;
        if (editor != null) {
            editor.remove(str);
        }
    }
}
