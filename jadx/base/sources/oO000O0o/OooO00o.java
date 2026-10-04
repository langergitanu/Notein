package oO000O0o;

import android.content.Context;
import com.facebook.soloader.OooOo;
import com.google.common.collect.ImmutableSet;
import o00o0OOO.C25400OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: oO000O0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC20187OooO00o {
        ImmutableSet OooO0Oo();
    }

    public static boolean OooO00o(Context context) {
        ImmutableSet immutableSetOooO0Oo = ((InterfaceC20187OooO00o) OooOo.OooO0o0(context, InterfaceC20187OooO00o.class)).OooO0Oo();
        C25400OooO0Oo.OooO00o(immutableSetOooO0Oo.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (immutableSetOooO0Oo.isEmpty()) {
            return true;
        }
        return ((Boolean) immutableSetOooO0Oo.iterator().next()).booleanValue();
    }
}
