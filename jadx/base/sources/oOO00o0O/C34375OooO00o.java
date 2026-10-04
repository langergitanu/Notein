package oOO00o0O;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: renamed from: oOO00o0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34375OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static C34375OooO00o f123360OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public SharedPreferences f123361OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Context f123362OooO0O0;

    public static synchronized C34375OooO00o OooO0O0(Context context) {
        try {
            if (f123360OooO0OO == null) {
                C34375OooO00o c34375OooO00o = new C34375OooO00o();
                c34375OooO00o.f123361OooO00o = context.getSharedPreferences("HonorAccount", 0);
                c34375OooO00o.f123362OooO0O0 = context.getApplicationContext();
                f123360OooO0OO = c34375OooO00o;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f123360OooO0OO;
    }

    public final String OooO00o(String str) {
        SharedPreferences sharedPreferences = this.f123361OooO00o;
        String string = sharedPreferences != null ? sharedPreferences.getString(str, "") : "";
        if (!str.equals("rkey")) {
            String strOooO00o = o0O00.OooO00o.OooO00o(this.f123362OooO0O0, string);
            if (!TextUtils.isEmpty(strOooO00o)) {
                return strOooO00o;
            }
        }
        return string;
    }

    public final void OooO0OO(String str) {
        SharedPreferences.Editor editorEdit = this.f123361OooO00o.edit();
        if (editorEdit != null) {
            editorEdit.remove(str).commit();
        }
    }

    public final void OooO0Oo(String str, String str2) {
        SharedPreferences.Editor editorEdit = this.f123361OooO00o.edit();
        if (editorEdit != null) {
            editorEdit.putString(str, o0O00.OooO00o.OooO0O0(this.f123362OooO0O0, str2)).commit();
        }
    }
}
