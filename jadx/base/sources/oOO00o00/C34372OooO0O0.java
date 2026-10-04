package oOO00o00;

import android.content.Context;
import oOO00o0.C34370OooO0o0;

/* JADX INFO: renamed from: oOO00o00.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34372OooO0O0 implements InterfaceC34371OooO00o {
    @Override // oOO00o00.InterfaceC34371OooO00o
    public final void OooO00o(Context context, int i) {
        if (i >= 3) {
            C34370OooO0o0.OooO0OO("PropertiesGrade", "newVersion is less then oldVersion, onUpgrade error");
        } else {
            C34370OooO0o0.OooO0Oo("PropertiesGrade", "update settings.properties when version update");
        }
    }
}
