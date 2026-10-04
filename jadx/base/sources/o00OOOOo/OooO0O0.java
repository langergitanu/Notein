package o00OOOOo;

import android.content.Context;
import android.text.TextUtils;
import o00OOOOo.OooO00o;
import o00Oo0oO.C25052OooO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Context f84886OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f84887OooOo0o;

    public OooO0O0(String str, Context context) {
        this.f84887OooOo0o = str;
        this.f84886OooOo = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String value;
        if (TextUtils.isEmpty(this.f84887OooOo0o) || OooO00o.OooO0O0.OooO0O0(this.f84886OooOo, this.f84887OooOo0o)) {
            for (int i = 0; i < 4; i++) {
                Context context = this.f84886OooOo;
                synchronized (OooO00o.C19664OooO00o.class) {
                    value = null;
                    if (context != null) {
                        OooO00o.C19664OooO00o.C19665OooO00o c19665OooO00oOooO00o = OooO00o.C19664OooO00o.OooO00o(context);
                        if (!c19665OooO00oOooO00o.f84885OooO00o.isEmpty()) {
                            try {
                                value = c19665OooO00oOooO00o.f84885OooO00o.entrySet().iterator().next().getValue();
                            } catch (Throwable th) {
                                C25052OooO0Oo.OooO00o(th);
                            }
                        }
                    }
                }
                if (TextUtils.isEmpty(value) || !OooO00o.OooO0O0.OooO0O0(this.f84886OooOo, value)) {
                    return;
                }
            }
        }
    }
}
