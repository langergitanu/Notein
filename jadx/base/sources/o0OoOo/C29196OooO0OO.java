package o0OoOo;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import com.google.firebase.firestore.util.OooOOO;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OoOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29196OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f103556OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f103557OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f103558OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f103559OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f103560OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f103561OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f103562OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final List<Float> f103563OooO0oo;

    public C29196OooO0OO(String id, String name, long j, long j2, boolean z, boolean z2, boolean z3, List<Float> list) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(name, "name");
        this.f103556OooO00o = id;
        this.f103557OooO0O0 = name;
        this.f103558OooO0OO = j;
        this.f103559OooO0Oo = j2;
        this.f103561OooO0o0 = z;
        this.f103560OooO0o = z2;
        this.f103562OooO0oO = z3;
        this.f103563OooO0oo = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29196OooO0OO)) {
            return false;
        }
        C29196OooO0OO c29196OooO0OO = (C29196OooO0OO) obj;
        return OooOOO0.OooO0O0(this.f103556OooO00o, c29196OooO0OO.f103556OooO00o) && OooOOO0.OooO0O0(this.f103557OooO0O0, c29196OooO0OO.f103557OooO0O0) && this.f103558OooO0OO == c29196OooO0OO.f103558OooO0OO && this.f103559OooO0Oo == c29196OooO0OO.f103559OooO0Oo && this.f103561OooO0o0 == c29196OooO0OO.f103561OooO0o0 && this.f103560OooO0o == c29196OooO0OO.f103560OooO0o && this.f103562OooO0oO == c29196OooO0OO.f103562OooO0oO && OooOOO0.OooO0O0(this.f103563OooO0oo, c29196OooO0OO.f103563OooO0oo);
    }

    public final int hashCode() {
        int iOooO0O0 = o00000.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f103556OooO00o.hashCode() * 31, 31, this.f103557OooO0O0), 31, this.f103558OooO0OO), 31, this.f103559OooO0Oo), 31, this.f103561OooO0o0), 31, this.f103560OooO0o), 31, this.f103562OooO0oO);
        List<Float> list = this.f103563OooO0oo;
        return iOooO0O0 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFileVO(id=");
        sb.append(this.f103556OooO00o);
        sb.append(", name=");
        sb.append(this.f103557OooO0O0);
        sb.append(", duration=");
        sb.append(this.f103558OooO0OO);
        sb.append(", createdTime=");
        sb.append(this.f103559OooO0Oo);
        sb.append(", isPlaying=");
        sb.append(this.f103561OooO0o0);
        sb.append(", isSelected=");
        sb.append(this.f103560OooO0o);
        sb.append(", isInSelectionMode=");
        sb.append(this.f103562OooO0oO);
        sb.append(", waveformData=");
        return OooOOO.OooO0O0(")", sb, this.f103563OooO0oo);
    }
}
