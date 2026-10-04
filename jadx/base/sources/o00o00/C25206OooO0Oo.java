package o00o00;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.orion.notein.global.R;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.OooOOO0;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.EnumC25114OooO0OO;
import o00Ooo0o.InterfaceC25122OooOO0o;
import o00OooO.InterfaceC25145OooOo0o;
import o00o0O0.C25308OooO00o;

/* JADX INFO: renamed from: o00o00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25206OooO0Oo implements InterfaceC25122OooOO0o {
    public static void OooO0OO(ContextWrapper contextWrapper, CharSequence message) {
        OooOOO0.OooO0oO(message, "message");
        OooO0o0(contextWrapper, 1, message);
    }

    public static void OooO0Oo(Context context, String str) {
        Toast toastMakeText = Toast.makeText(context, str, 0);
        toastMakeText.setGravity(48, 0, (int) (context.getResources().getDisplayMetrics().heightPixels * 0.25f));
        toastMakeText.show();
    }

    public static void OooO0o(Context context, int i) {
        OooOOO0.OooO0oO(context, "<this>");
        String string = context.getString(i);
        OooOOO0.OooO0o(string, "getString(...)");
        OooO0o0(context, 0, string);
    }

    public static final void OooO0o0(Context context, int i, CharSequence charSequence) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        OooOOO0.OooO0o(layoutInflaterFrom, "from(...)");
        View viewInflate = layoutInflaterFrom.inflate(R.layout.view_custom_toast, (ViewGroup) null);
        viewInflate.setBackground(context.getDrawable(R.drawable.bg_round_btn_black_logout));
        View viewFindViewById = viewInflate.findViewById(R.id.message);
        OooOOO0.OooO0o0(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById;
        textView.setText(charSequence);
        textView.setTextColor(context.getColor(R.color.white));
        Toast toast = new Toast(context);
        toast.setView(viewInflate);
        toast.setDuration(i);
        toast.setGravity(48, 0, (int) (context.getResources().getDisplayMetrics().heightPixels * 0.5f));
        toast.show();
    }

    public static void OooO0oO(Context context, String message) {
        OooOOO0.OooO0oO(context, "<this>");
        OooOOO0.OooO0oO(message, "message");
        OooO0o0(context, 0, message);
    }

    @Override // o00Ooo0o.InterfaceC25115OooO0Oo
    public boolean OooO00o(Object obj, File file, C25111OooO c25111OooO) throws Throwable {
        try {
            C25308OooO00o.OooO0Oo(((OooO0OO) ((InterfaceC25145OooOo0o) obj).get()).f85820OooOo0o.f85829OooO00o.f85832OooO00o.f85239OooO0Oo.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // o00Ooo0o.InterfaceC25122OooOO0o
    public EnumC25114OooO0OO OooO0O0(C25111OooO c25111OooO) {
        return EnumC25114OooO0OO.f85380OooOo0o;
    }
}
