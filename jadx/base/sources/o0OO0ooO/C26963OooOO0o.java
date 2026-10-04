package o0OO0ooO;

import com.orion.notein.domain.models.material.Material;

/* JADX INFO: renamed from: o0OO0ooO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26963OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Material f93665OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f93666OooO0O0;

    public C26963OooOO0o(Material material, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(material, "material");
        this.f93665OooO00o = material;
        this.f93666OooO0O0 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26963OooOO0o)) {
            return false;
        }
        C26963OooOO0o c26963OooOO0o = (C26963OooOO0o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f93665OooO00o, c26963OooOO0o.f93665OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f93666OooO0O0, c26963OooOO0o.f93666OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = this.f93665OooO00o.hashCode() * 31;
        String str = this.f93666OooO0O0;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MaterialListItem(material=" + this.f93665OooO00o + ", summary=" + this.f93666OooO0O0 + ")";
    }
}
