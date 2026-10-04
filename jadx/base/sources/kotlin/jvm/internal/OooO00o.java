package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class OooO00o implements OooOO0, Serializable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Class f80922OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Object f80923OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final String f80924OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final String f80925OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final boolean f80926OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int f80927OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f80928OooOoo0;

    public OooO00o(String str, int i, Class cls) {
        this(i, AbstractC24015OooO0Oo.NO_RECEIVER, cls, "<init>", str, 4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return this.f80926OooOoOO == oooO00o.f80926OooOoOO && this.f80928OooOoo0 == oooO00o.f80928OooOoo0 && this.f80927OooOoo == oooO00o.f80927OooOoo && OooOOO0.OooO0O0(this.f80923OooOo0o, oooO00o.f80923OooOo0o) && OooOOO0.OooO0O0(this.f80922OooOo, oooO00o.f80922OooOo) && this.f80925OooOoO0.equals(oooO00o.f80925OooOoO0) && this.f80924OooOoO.equals(oooO00o.f80924OooOoO);
    }

    @Override // kotlin.jvm.internal.OooOO0
    public final int getArity() {
        return this.f80928OooOoo0;
    }

    public final int hashCode() {
        Object obj = this.f80923OooOo0o;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f80922OooOo;
        return ((((com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.f80925OooOoO0), 31, this.f80924OooOoO) + (this.f80926OooOoOO ? 1231 : 1237)) * 31) + this.f80928OooOoo0) * 31) + this.f80927OooOoo;
    }

    public final String toString() {
        return C24035Oooo00o.f80943OooO00o.OooO(this);
    }

    public OooO00o(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.f80923OooOo0o = obj;
        this.f80922OooOo = cls;
        this.f80925OooOoO0 = str;
        this.f80924OooOoO = str2;
        this.f80926OooOoOO = false;
        this.f80928OooOoo0 = i;
        this.f80927OooOoo = i2 >> 1;
    }
}
