package o00OooO;

import androidx.fragment.app.C21929Ooooo0o;
import java.security.MessageDigest;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00o0O0.C25309OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOOO implements InterfaceC25116OooO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C25111OooO f85546OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f85547OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f85548OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f85549OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Class<?> f85550OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Class<?> f85551OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC25116OooO0o f85552OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C25309OooO0O0 f85553OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f85554OooOO0;

    public OooOOOO(Object obj, InterfaceC25116OooO0o interfaceC25116OooO0o, int i, int i2, C25309OooO0O0 c25309OooO0O0, Class cls, Class cls2, C25111OooO c25111OooO) {
        C21929Ooooo0o.OooO0OO(obj, "Argument must not be null");
        this.f85547OooO0O0 = obj;
        C21929Ooooo0o.OooO0OO(interfaceC25116OooO0o, "Signature must not be null");
        this.f85552OooO0oO = interfaceC25116OooO0o;
        this.f85548OooO0OO = i;
        this.f85549OooO0Oo = i2;
        C21929Ooooo0o.OooO0OO(c25309OooO0O0, "Argument must not be null");
        this.f85553OooO0oo = c25309OooO0O0;
        C21929Ooooo0o.OooO0OO(cls, "Resource class must not be null");
        this.f85551OooO0o0 = cls;
        C21929Ooooo0o.OooO0OO(cls2, "Transcode class must not be null");
        this.f85550OooO0o = cls2;
        C21929Ooooo0o.OooO0OO(c25111OooO, "Argument must not be null");
        this.f85546OooO = c25111OooO;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final void OooO00o(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOOOO)) {
            return false;
        }
        OooOOOO oooOOOO = (OooOOOO) obj;
        return this.f85547OooO0O0.equals(oooOOOO.f85547OooO0O0) && this.f85552OooO0oO.equals(oooOOOO.f85552OooO0oO) && this.f85549OooO0Oo == oooOOOO.f85549OooO0Oo && this.f85548OooO0OO == oooOOOO.f85548OooO0OO && this.f85553OooO0oo.equals(oooOOOO.f85553OooO0oo) && this.f85551OooO0o0.equals(oooOOOO.f85551OooO0o0) && this.f85550OooO0o.equals(oooOOOO.f85550OooO0o) && this.f85546OooO.equals(oooOOOO.f85546OooO);
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final int hashCode() {
        if (this.f85554OooOO0 == 0) {
            int iHashCode = this.f85547OooO0O0.hashCode();
            this.f85554OooOO0 = iHashCode;
            int iHashCode2 = ((((this.f85552OooO0oO.hashCode() + (iHashCode * 31)) * 31) + this.f85548OooO0OO) * 31) + this.f85549OooO0Oo;
            this.f85554OooOO0 = iHashCode2;
            int iHashCode3 = this.f85553OooO0oo.hashCode() + (iHashCode2 * 31);
            this.f85554OooOO0 = iHashCode3;
            int iHashCode4 = this.f85551OooO0o0.hashCode() + (iHashCode3 * 31);
            this.f85554OooOO0 = iHashCode4;
            int iHashCode5 = this.f85550OooO0o.hashCode() + (iHashCode4 * 31);
            this.f85554OooOO0 = iHashCode5;
            this.f85554OooOO0 = this.f85546OooO.f85368OooO0O0.hashCode() + (iHashCode5 * 31);
        }
        return this.f85554OooOO0;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f85547OooO0O0 + ", width=" + this.f85548OooO0OO + ", height=" + this.f85549OooO0Oo + ", resourceClass=" + this.f85551OooO0o0 + ", transcodeClass=" + this.f85550OooO0o + ", signature=" + this.f85552OooO0oO + ", hashCode=" + this.f85554OooOO0 + ", transformations=" + this.f85553OooO0oo + ", options=" + this.f85546OooO + '}';
    }
}
