package o00OoooO;

import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.C21929Ooooo0o;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import o00Ooo0o.InterfaceC25116OooO0o;

/* JADX INFO: renamed from: o00OoooO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25183OooOO0 implements InterfaceC25116OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO0 f85711OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final URL f85712OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f85713OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public URL f85714OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f85715OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile byte[] f85716OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f85717OooO0oo;

    public C25183OooOO0(URL url) {
        OooOOO0 oooOOO0 = OooOO0O.f85718OooO00o;
        C21929Ooooo0o.OooO0OO(url, "Argument must not be null");
        this.f85712OooO0OO = url;
        this.f85713OooO0Oo = null;
        C21929Ooooo0o.OooO0OO(oooOOO0, "Argument must not be null");
        this.f85711OooO0O0 = oooOOO0;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final void OooO00o(MessageDigest messageDigest) {
        if (this.f85716OooO0oO == null) {
            this.f85716OooO0oO = OooO0OO().getBytes(InterfaceC25116OooO0o.f85383OooO00o);
        }
        messageDigest.update(this.f85716OooO0oO);
    }

    public final String OooO0OO() {
        String str = this.f85713OooO0Oo;
        if (str != null) {
            return str;
        }
        URL url = this.f85712OooO0OO;
        C21929Ooooo0o.OooO0OO(url, "Argument must not be null");
        return url.toString();
    }

    public final URL OooO0Oo() throws MalformedURLException {
        if (this.f85714OooO0o == null) {
            if (TextUtils.isEmpty(this.f85715OooO0o0)) {
                String string = this.f85713OooO0Oo;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f85712OooO0OO;
                    C21929Ooooo0o.OooO0OO(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f85715OooO0o0 = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f85714OooO0o = new URL(this.f85715OooO0o0);
        }
        return this.f85714OooO0o;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final boolean equals(Object obj) {
        if (!(obj instanceof C25183OooOO0)) {
            return false;
        }
        C25183OooOO0 c25183OooOO0 = (C25183OooOO0) obj;
        return OooO0OO().equals(c25183OooOO0.OooO0OO()) && this.f85711OooO0O0.equals(c25183OooOO0.f85711OooO0O0);
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final int hashCode() {
        if (this.f85717OooO0oo == 0) {
            int iHashCode = OooO0OO().hashCode();
            this.f85717OooO0oo = iHashCode;
            this.f85717OooO0oo = this.f85711OooO0O0.f85724OooO0O0.hashCode() + (iHashCode * 31);
        }
        return this.f85717OooO0oo;
    }

    public final String toString() {
        return OooO0OO();
    }

    public C25183OooOO0(String str, OooOOO0 oooOOO0) {
        this.f85712OooO0OO = null;
        if (!TextUtils.isEmpty(str)) {
            this.f85713OooO0Oo = str;
            C21929Ooooo0o.OooO0OO(oooOOO0, "Argument must not be null");
            this.f85711OooO0O0 = oooOOO0;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
