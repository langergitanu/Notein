package o0O0oOO;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import java.util.Locale;
import oO00o.AbstractC32316OooO0OO;
import oO00oO00.InterfaceC32403OooO0OO;
import oO00oOo.C32428OooO00o;
import oOO00oo.C34406OooO00o;
import oOo00ooo.C34581OooO0o;
import oOo00ooo.C34582OooO0o0;

/* JADX INFO: renamed from: o0O0oOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26106OooO0O0 {
    public static void OooO00o(Context context) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (Build.VERSION.SDK_INT >= 28) {
                clipboardManager.clearPrimaryClip();
            } else {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ClipPasteHelper");
            c20358OooO00o.OooO0Oo(e, "Clear sys clipboard error.", new Object[0]);
        }
    }

    public static AbstractC32316OooO0OO<Boolean> OooO0O0(final Context context, final String str) {
        try {
            final ClipData primaryClip = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
            return new C34581OooO0o(new C34582OooO0o0(Boolean.FALSE).OooO0O0(C32428OooO00o.f116617OooO00o), new InterfaceC32403OooO0OO() { // from class: o0O0oOO.OooO00o
                @Override // oO00oO00.InterfaceC32403OooO0OO
                public final Object apply(Object obj) {
                    String type;
                    Context context2 = context;
                    Boolean bool = (Boolean) obj;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("ClipPasteHelper");
                    c20358OooO00o.OooO00o("getSomeMimeTypePrefixObservable cur thread:%s", Thread.currentThread().getName());
                    ClipData clipData = primaryClip;
                    if (clipData == null || clipData.getDescription().getMimeTypeCount() <= 0) {
                        return bool;
                    }
                    String lowerCase = clipData.getDescription().getMimeType(0).toLowerCase(Locale.getDefault());
                    String str2 = str;
                    boolean zStartsWith = lowerCase.startsWith(str2);
                    try {
                        ClipData.Item itemAt = clipData.getItemAt(0);
                        if (!zStartsWith && itemAt != null && itemAt.getUri() != null && (type = context2.getContentResolver().getType(itemAt.getUri())) != null) {
                            zStartsWith = type.toLowerCase(Locale.getDefault()).startsWith(str2);
                        }
                    } catch (Exception e) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("ClipPasteHelper");
                        c20358OooO00o2.OooO0Oo(e, "image NOT in the sys clipboard.", new Object[0]);
                    }
                    return Boolean.valueOf(zStartsWith);
                }
            });
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ClipPasteHelper");
            c20358OooO00o.OooO0Oo(e, "getSomeMimeTypePrefixObservable, err for prefix:%s", str);
            return new C34582OooO0o0(Boolean.FALSE);
        }
    }
}
