package oo0o0Oo;

import OooOoO.C20505OooO0OO;
import OooOoO.C20509OooO0oo;
import OooOooo.C20785Oooo00o;

/* JADX INFO: renamed from: oo0o0Oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34683OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34679OooO00o f124911OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f124912OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f124913OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f124914OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f124915OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f124916OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f124917OooO0oO;

    public C34683OooO0o(C34679OooO00o c34679OooO00o, int i, int i2, int i3, int i4, float f, float f2) {
        this.f124911OooO00o = c34679OooO00o;
        this.f124912OooO0O0 = i;
        this.f124913OooO0OO = i2;
        this.f124914OooO0Oo = i3;
        this.f124916OooO0o0 = i4;
        this.f124915OooO0o = f;
        this.f124917OooO0oO = f2;
    }

    public final int OooO00o(int i) {
        int i2 = this.f124913OooO0OO;
        int i3 = this.f124912OooO0O0;
        return oO0O00oo.OooOO0.OooO0o(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34683OooO0o)) {
            return false;
        }
        C34683OooO0o c34683OooO0o = (C34683OooO0o) obj;
        return this.f124911OooO00o.equals(c34683OooO0o.f124911OooO00o) && this.f124912OooO0O0 == c34683OooO0o.f124912OooO0O0 && this.f124913OooO0OO == c34683OooO0o.f124913OooO0OO && this.f124914OooO0Oo == c34683OooO0o.f124914OooO0Oo && this.f124916OooO0o0 == c34683OooO0o.f124916OooO0o0 && Float.compare(this.f124915OooO0o, c34683OooO0o.f124915OooO0o) == 0 && Float.compare(this.f124917OooO0oO, c34683OooO0o.f124917OooO0oO) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f124917OooO0oO) + C20509OooO0oo.OooO0OO(this.f124915OooO0o, C20785Oooo00o.OooO00o(this.f124916OooO0o0, C20785Oooo00o.OooO00o(this.f124914OooO0Oo, C20785Oooo00o.OooO00o(this.f124913OooO0OO, C20785Oooo00o.OooO00o(this.f124912OooO0O0, this.f124911OooO00o.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f124911OooO00o);
        sb.append(", startIndex=");
        sb.append(this.f124912OooO0O0);
        sb.append(", endIndex=");
        sb.append(this.f124913OooO0OO);
        sb.append(", startLineIndex=");
        sb.append(this.f124914OooO0Oo);
        sb.append(", endLineIndex=");
        sb.append(this.f124916OooO0o0);
        sb.append(", top=");
        sb.append(this.f124915OooO0o);
        sb.append(", bottom=");
        return C20505OooO0OO.OooO0O0(sb, this.f124917OooO0oO, ')');
    }
}
