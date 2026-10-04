package o00oo00O;

import androidx.core.view.PointerIconCompat;
import java.util.LinkedHashSet;
import o00o0OOO.InterfaceC25397OooO00o;
import o00o0Ooo.C25431OooO0oo;
import o00oOOOo.C25587OooO00o;
import o00oo.InterfaceC25636OooO0Oo;
import o00oo0O0.InterfaceC25665OooOO0;

/* JADX INFO: renamed from: o00oo00O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25649OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25587OooO00o f87547OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25665OooOO0<InterfaceC25397OooO00o, InterfaceC25636OooO0Oo> f87548OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashSet<InterfaceC25397OooO00o> f87550OooO0Oo = new LinkedHashSet<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25648OooO0O0 f87549OooO0OO = new C25648OooO0O0(this);

    /* JADX INFO: renamed from: o00oo00O.OooO0OO$OooO00o */
    public static class OooO00o implements InterfaceC25397OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C25587OooO00o f87551OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f87552OooO0O0;

        public OooO00o(C25587OooO00o c25587OooO00o, int i) {
            this.f87551OooO00o = c25587OooO00o;
            this.f87552OooO0O0 = i;
        }

        @Override // o00o0OOO.InterfaceC25397OooO00o
        public final String OooO00o() {
            return null;
        }

        @Override // o00o0OOO.InterfaceC25397OooO00o
        public final boolean OooO0O0() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f87552OooO0O0 == oooO00o.f87552OooO0O0 && this.f87551OooO00o.equals(oooO00o.f87551OooO00o);
        }

        public final int hashCode() {
            return (this.f87551OooO00o.hashCode() * PointerIconCompat.TYPE_ALL_SCROLL) + this.f87552OooO0O0;
        }

        public final String toString() {
            C25431OooO0oo.OooO00o oooO00oOooO0O0 = C25431OooO0oo.OooO0O0(this);
            oooO00oOooO0O0.OooO0OO(this.f87551OooO00o, "imageCacheKey");
            oooO00oOooO0O0.OooO00o("frameIndex", this.f87552OooO0O0);
            return oooO00oOooO0O0.toString();
        }
    }

    public C25649OooO0OO(C25587OooO00o c25587OooO00o, InterfaceC25665OooOO0 interfaceC25665OooOO0) {
        this.f87547OooO00o = c25587OooO00o;
        this.f87548OooO0O0 = interfaceC25665OooOO0;
    }
}
