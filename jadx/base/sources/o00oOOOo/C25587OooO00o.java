package o00oOOOo;

import androidx.appcompat.widget.C21532OooOOo;
import kotlin.jvm.internal.OooOOO0;
import o00o0OOO.InterfaceC25397OooO00o;

/* JADX INFO: renamed from: o00oOOOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25587OooO00o implements InterfaceC25397OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f87285OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f87286OooO0O0;

    public C25587OooO00o(int i, boolean z) {
        this.f87285OooO00o = z;
        this.f87286OooO0O0 = C21532OooOOo.OooO0OO(i, "anim://");
    }

    @Override // o00o0OOO.InterfaceC25397OooO00o
    public final String OooO00o() {
        return this.f87286OooO0O0;
    }

    @Override // o00o0OOO.InterfaceC25397OooO00o
    public final boolean OooO0O0() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (!this.f87285OooO00o) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !C25587OooO00o.class.equals(obj.getClass())) {
            return false;
        }
        return OooOOO0.OooO0O0(this.f87286OooO0O0, ((C25587OooO00o) obj).f87286OooO0O0);
    }

    public final int hashCode() {
        return !this.f87285OooO00o ? super.hashCode() : this.f87286OooO0O0.hashCode();
    }
}
