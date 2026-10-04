package o00000O0;

import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o00O0o0o.C24941OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f81237OooO00o;

    public OooO00o(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.f81237OooO00o = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    public void OooO00o(Exception exc) {
        C24941OooO0oo c24941OooO0oo = (C24941OooO0oo) this.f81237OooO00o;
        synchronized (c24941OooO0oo.f84624OooO00o) {
            try {
                if (c24941OooO0oo.f84625OooO0O0) {
                    throw new IllegalStateException("Cannot set the error on a completed task.");
                }
                c24941OooO0oo.f84625OooO0O0 = true;
                c24941OooO0oo.f84629OooO0o0 = exc;
                c24941OooO0oo.f84624OooO00o.notifyAll();
                c24941OooO0oo.OooO0o0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String OooO0O0() {
        String languageTag = ((Locale) this.f81237OooO00o).toLanguageTag();
        OooOOO0.OooO0o(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    public OooO00o() {
        this.f81237OooO00o = new C24941OooO0oo();
    }

    public OooO00o(Locale locale) {
        this.f81237OooO00o = locale;
    }
}
