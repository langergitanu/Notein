package OooO;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.C21556Oooo0OO;
import com.lzf.easyfloat.data.FloatConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import o0O0O0oo.C25875OooO0O0;
import o0O0O0oo.C25877OooO0o0;
import o0oo0o0o.C31324OooO0O0;
import o0oo0o0o.C31325OooO0OO;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31450OooOOoo;
import o0ooOoo.C31676OooO0oo;
import o0ooo0.C31722OooOOo0;
import oO00ooO.C32460OooOooO;
import oOo000oo.C34453OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static int f58142OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static WeakReference f58143OooO0O0;

    public static C31722OooOOo0 OooO00o(C31325OooO0OO c31325OooO0OO) {
        boolean zEquals = c31325OooO0OO.f111848OooO0Oo.equals("FontSpecific");
        C31722OooOOo0 c31722OooOOo0 = new C31722OooOOo0();
        String str = c31325OooO0OO.f111845OooO00o;
        C31441OooOO0 c31441OooOO0OooOooo = str != null ? C31441OooOO0.OooOooo(str) : null;
        C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112335o000OoO;
        C31436OooO0Oo c31436OooO0Oo = c31722OooOOo0.f113315OooOo0o;
        c31436OooO0Oo.o000OoOO(c31441OooOO0, c31441OooOO0OooOooo);
        String str2 = c31325OooO0OO.f111846OooO0O0;
        c31436OooO0Oo.o000OoOO(C31441OooOO0.f112306o0000oOo, str2 != null ? new C31450OooOOoo(str2) : null);
        c31722OooOOo0.OooO0o(32, !zEquals);
        c31722OooOOo0.OooO0o(4, zEquals);
        c31436OooO0Oo.o000OoOO(C31441OooOO0.f112304o0000oO0, new C31676OooO0oo(c31325OooO0OO.f111847OooO0OO).f113215OooOo0o);
        c31436OooO0Oo.o000Oo0o(C31441OooOO0.f112329o000OOoO, c31325OooO0OO.f111854OooOO0O);
        c31436OooO0Oo.o000Oo0o(C31441OooOO0.f112251Oooo0OO, c31325OooO0OO.f111852OooO0oo);
        c31436OooO0Oo.o000Oo0o(C31441OooOO0.f112280o000000O, c31325OooO0OO.f111844OooO);
        float f = c31325OooO0OO.f111849OooO0o;
        c31436OooO0Oo.o000Oo0o(C31441OooOO0.f112265OoooOoo, f);
        c31722OooOOo0.f113314OooOo = f;
        c31436OooO0Oo.o000Oo0o(C31441OooOO0.f112427o00OOooo, c31325OooO0OO.f111851OooO0oO);
        Iterator it = c31325OooO0OO.f111855OooOO0o.iterator();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (it.hasNext()) {
            float f4 = ((C31324OooO0O0) it.next()).f111841OooO0O0;
            if (f4 > 0.0f) {
                f2 += f4;
                f3 += 1.0f;
            }
        }
        c31436OooO0Oo.o000Oo0o(C31441OooOO0.f112258OoooO00, f2 > 0.0f ? f2 / f3 : 0.0f);
        String str3 = c31325OooO0OO.f111850OooO0o0;
        c31436OooO0Oo.o000OoOO(C31441OooOO0.f112273OoooooO, str3 != null ? new C31450OooOOoo(str3) : null);
        c31436OooO0Oo.o000Oo0o(C31441OooOO0.f112398o00O0oOO, 0.0f);
        return c31722OooOOo0;
    }

    public static final C34453OooO0O0 OooO0O0(Enum[] entries) {
        OooOOO0.OooO0oO(entries, "entries");
        return new C34453OooO0O0(entries);
    }

    public static Drawable OooO0OO(Context context, int i) {
        return C21556Oooo0OO.OooO0O0().OooO0OO(context, i);
    }

    public static void OooO0Oo(String str, boolean z) {
        FloatConfig floatConfig;
        C25875OooO0O0 c25875OooO0O0 = C25877OooO0o0.f88312OooO00o.get(str);
        boolean needShow$easyfloat_release = true;
        if (c25875OooO0O0 != null && (floatConfig = c25875OooO0O0.f88293OooO0O0) != null) {
            needShow$easyfloat_release = floatConfig.getNeedShow$easyfloat_release();
        }
        C25875OooO0O0 c25875OooO0O0OooO0O0 = C25877OooO0o0.OooO0O0(str);
        if (c25875OooO0O0OooO0O0 == null) {
            return;
        }
        c25875OooO0O0OooO0O0.OooO0o(z ? 0 : 8, needShow$easyfloat_release);
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
    }
}
