package o0oooooO;

import o0ooooo.C31875OooO0O0;
import o0oooooO.AbstractC31887OooO0O0;

/* JADX INFO: renamed from: o0oooooO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31890OooO0o<T extends AbstractC31887OooO0O0<T>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f113596OooO00o;

    /* JADX INFO: renamed from: o0oooooO.OooO0o$OooO00o */
    public static class OooO00o<T extends AbstractC31887OooO0O0<T>> extends AbstractC31890OooO0o<T> {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C31875OooO0O0 f113597OooO0O0;

        public OooO00o(String str, int i, int i2) {
            super(str);
            this.f113597OooO0O0 = new C31875OooO0O0(C31875OooO0O0.OooO00o(i), C31875OooO0O0.OooO00o(i2), C31875OooO0O0.OooO00o(0));
        }

        @Override // o0oooooO.AbstractC31890OooO0o
        public final String OooO00o() {
            return this.f113596OooO00o + " requires YubiKey " + this.f113597OooO0O0 + " or later";
        }

        @Override // o0oooooO.AbstractC31890OooO0o
        public final boolean OooO0O0(C31875OooO0O0 c31875OooO0O0) {
            if (c31875OooO0O0.f113574OooOo0o == 0) {
                return true;
            }
            C31875OooO0O0 c31875OooO0O02 = this.f113597OooO0O0;
            return c31875OooO0O0.OooO0O0(c31875OooO0O02.f113574OooOo0o, c31875OooO0O02.f113573OooOo, c31875OooO0O02.f113575OooOoO0) >= 0;
        }
    }

    public AbstractC31890OooO0o(String str) {
        this.f113596OooO00o = str;
    }

    public String OooO00o() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.f113596OooO00o, " is not supported by this YubiKey");
    }

    public abstract boolean OooO0O0(C31875OooO0O0 c31875OooO0O0);
}
