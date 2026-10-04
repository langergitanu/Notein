package oO00ooO;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: oO00ooO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32431OooO implements Comparable<C32431OooO> {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final C32431OooO f116622OooOoOO = new C32431OooO(2, 1, 21);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f116623OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f116624OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f116625OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f116626OooOoO0;

    public C32431OooO(int i, int i2, int i3) {
        this.f116624OooOo0o = i;
        this.f116623OooOo = i2;
        this.f116626OooOoO0 = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.f116625OooOoO = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + FilenameUtils.EXTENSION_SEPARATOR + i2 + FilenameUtils.EXTENSION_SEPARATOR + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(C32431OooO c32431OooO) {
        C32431OooO other = c32431OooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        return this.f116625OooOoO - other.f116625OooOoO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C32431OooO c32431OooO = obj instanceof C32431OooO ? (C32431OooO) obj : null;
        return c32431OooO != null && this.f116625OooOoO == c32431OooO.f116625OooOoO;
    }

    public final int hashCode() {
        return this.f116625OooOoO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f116624OooOo0o);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(this.f116623OooOo);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(this.f116626OooOoO0);
        return sb.toString();
    }
}
