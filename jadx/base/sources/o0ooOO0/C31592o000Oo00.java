package o0ooOO0;

import Oooo0oO.AbstractC21043OooOoO;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.core.os.HandlerCompat;
import com.orion.notein.global.R;
import java.util.LinkedHashMap;
import o00o00O0.C25252OooO0Oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.C33703OooOOO0;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33780o00Ooo;
import oO0o0Oo.InterfaceC33788ooOO;

/* JADX INFO: renamed from: o0ooOO0.o000Oo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31592o000Oo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final LinkedHashMap f112895OooO00o = new LinkedHashMap();

    public static final InterfaceC33780o00Ooo OooO00o(Context context) {
        InterfaceC33780o00Ooo interfaceC33780o00Ooo;
        LinkedHashMap linkedHashMap = f112895OooO00o;
        synchronized (linkedHashMap) {
            try {
                Object objOooOoO0 = linkedHashMap.get(context);
                if (objOooOoO0 == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    C33695OooO0o0 c33695OooO0o0OooO00o = C33703OooOOO0.OooO00o(-1, 6, null);
                    objOooOoO0 = C25252OooO0Oo.OooOoO0(new C33770OooooO0(new o000OOo0(contentResolver, uriFor, new o000OOoO(c33695OooO0o0OooO00o, HandlerCompat.createAsync(Looper.getMainLooper())), c33695OooO0o0OooO00o, context, null)), C33633Oooo0.OooO0O0(), InterfaceC33788ooOO.OooO00o.OooO00o(3), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objOooOoO0);
                }
                interfaceC33780o00Ooo = (InterfaceC33780o00Ooo) objOooOoO0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC33780o00Ooo;
    }

    public static final AbstractC21043OooOoO OooO0O0(View view) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "<this>");
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC21043OooOoO) {
            return (AbstractC21043OooOoO) tag;
        }
        return null;
    }
}
