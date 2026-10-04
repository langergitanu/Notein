package o00o000o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* JADX INFO: renamed from: o00o000o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25247OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile boolean f85971OooO00o = true;

    public static Drawable OooO00o(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f85971OooO00o) {
                return OooO0O0(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return ContextCompat.getDrawable(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f85971OooO00o = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ResourcesCompat.getDrawable(context2.getResources(), i, theme);
    }

    public static Drawable OooO0O0(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            OooOO0o.OooO0OO oooO0OO = new OooOO0o.OooO0OO(context);
            oooO0OO.f58324OooO0O0 = theme;
            oooO0OO.OooO00o(theme.getResources().getConfiguration());
            context = oooO0OO;
        }
        return OooO.OooO00o.OooO0OO(context, i);
    }
}
