package o0OoOo;

import OooOoO.C20509OooO0oo;
import OooOooo.C20785Oooo00o;
import androidx.appcompat.app.OooOOO;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0OoOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29195OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f103552OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f103553OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f103554OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f103555OooO0Oo;

    public C29195OooO0O0(String id, float f, int i, boolean z) {
        OooOOO0.OooO0oO(id, "id");
        this.f103552OooO00o = id;
        this.f103553OooO0O0 = i;
        this.f103554OooO0OO = f;
        this.f103555OooO0Oo = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29195OooO0O0)) {
            return false;
        }
        C29195OooO0O0 c29195OooO0O0 = (C29195OooO0O0) obj;
        return OooOOO0.OooO0O0(this.f103552OooO00o, c29195OooO0O0.f103552OooO00o) && this.f103553OooO0O0 == c29195OooO0O0.f103553OooO0O0 && Float.compare(this.f103554OooO0OO, c29195OooO0O0.f103554OooO0OO) == 0 && this.f103555OooO0Oo == c29195OooO0O0.f103555OooO0Oo;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103555OooO0Oo) + C20509OooO0oo.OooO0OO(this.f103554OooO0OO, C20785Oooo00o.OooO00o(this.f103553OooO0O0, this.f103552OooO00o.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivatedRecordingVO(id=");
        sb.append(this.f103552OooO00o);
        sb.append(", currentPosition=");
        sb.append(this.f103553OooO0O0);
        sb.append(", currentAmplitude=");
        sb.append(this.f103554OooO0OO);
        sb.append(", isRecording=");
        return OooOOO.OooO00o(sb, ")", this.f103555OooO0Oo);
    }
}
