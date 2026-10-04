package com.orion.notein.p607ui.label;

import OooOoO.C20509OooO0oo;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.orion.notein.p607ui.label.TriStateCheckBox;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: com.orion.notein.ui.label.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23132OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f71988OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f71989OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f71990OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f71991OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TriStateCheckBox.OooO00o f71992OooO0o0;

    public C23132OooO0Oo(long j, String name, int i, float f, TriStateCheckBox.OooO00o oooO00o) {
        OooOOO0.OooO0oO(name, "name");
        this.f71988OooO00o = j;
        this.f71989OooO0O0 = name;
        this.f71990OooO0OO = i;
        this.f71991OooO0Oo = f;
        this.f71992OooO0o0 = oooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23132OooO0Oo)) {
            return false;
        }
        C23132OooO0Oo c23132OooO0Oo = (C23132OooO0Oo) obj;
        return this.f71988OooO00o == c23132OooO0Oo.f71988OooO00o && OooOOO0.OooO0O0(this.f71989OooO0O0, c23132OooO0Oo.f71989OooO0O0) && this.f71990OooO0OO == c23132OooO0Oo.f71990OooO0OO && Float.compare(this.f71991OooO0Oo, c23132OooO0Oo.f71991OooO0Oo) == 0 && this.f71992OooO0o0 == c23132OooO0Oo.f71992OooO0o0;
    }

    public final int hashCode() {
        return this.f71992OooO0o0.hashCode() + C20509OooO0oo.OooO0OO(this.f71991OooO0Oo, C20785Oooo00o.OooO00o(this.f71990OooO0OO, OooO00o.OooO0O0(Long.hashCode(this.f71988OooO00o) * 31, 31, this.f71989OooO0O0), 31), 31);
    }

    public final String toString() {
        return "ItemLabelVO(id=" + this.f71988OooO00o + ", name=" + this.f71989OooO0O0 + ", color=" + this.f71990OooO0OO + ", index=" + this.f71991OooO0Oo + ", state=" + this.f71992OooO0o0 + ")";
    }
}
