package o0OoOo;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import androidx.appcompat.app.OooOOO;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OoOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29194OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f103544OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f103545OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f103546OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Float> f103547OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f103548OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f103549OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f103550OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f103551OooO0oo;

    public C29194OooO00o(String id, String name, int i, List<Float> currentWaveform, long j, long j2, boolean z, boolean z2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(currentWaveform, "currentWaveform");
        this.f103544OooO00o = id;
        this.f103545OooO0O0 = name;
        this.f103546OooO0OO = i;
        this.f103547OooO0Oo = currentWaveform;
        this.f103549OooO0o0 = j;
        this.f103548OooO0o = j2;
        this.f103550OooO0oO = z;
        this.f103551OooO0oo = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29194OooO00o)) {
            return false;
        }
        C29194OooO00o c29194OooO00o = (C29194OooO00o) obj;
        return OooOOO0.OooO0O0(this.f103544OooO00o, c29194OooO00o.f103544OooO00o) && OooOOO0.OooO0O0(this.f103545OooO0O0, c29194OooO00o.f103545OooO0O0) && this.f103546OooO0OO == c29194OooO00o.f103546OooO0OO && OooOOO0.OooO0O0(this.f103547OooO0Oo, c29194OooO00o.f103547OooO0Oo) && this.f103549OooO0o0 == c29194OooO00o.f103549OooO0o0 && this.f103548OooO0o == c29194OooO00o.f103548OooO0o && this.f103550OooO0oO == c29194OooO00o.f103550OooO0oO && this.f103551OooO0oo == c29194OooO00o.f103551OooO0oo;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103551OooO0oo) + o00000.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(C21445Oooo.OooO00o(this.f103547OooO0Oo, C20785Oooo00o.OooO00o(this.f103546OooO0OO, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f103544OooO00o.hashCode() * 31, 31, this.f103545OooO0O0), 31), 31), 31, this.f103549OooO0o0), 31, this.f103548OooO0o), 31, this.f103550OooO0oO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivatedAudioFileVO(id=");
        sb.append(this.f103544OooO00o);
        sb.append(", name=");
        sb.append(this.f103545OooO0O0);
        sb.append(", currentPosition=");
        sb.append(this.f103546OooO0OO);
        sb.append(", currentWaveform=");
        sb.append(this.f103547OooO0Oo);
        sb.append(", duration=");
        sb.append(this.f103549OooO0o0);
        sb.append(", createdTime=");
        sb.append(this.f103548OooO0o);
        sb.append(", isPlaying=");
        sb.append(this.f103550OooO0oO);
        sb.append(", hasError=");
        return OooOOO.OooO00o(sb, ")", this.f103551OooO0oo);
    }
}
