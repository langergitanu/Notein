package oO0000oo;

import java.io.Serializable;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: renamed from: oO0000oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31933OooO00o implements oO0000Oo.OooO0O0, Cloneable, Serializable {
    private static final long serialVersionUID = -6437800749411518984L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f113889OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f113890OooOo0o;

    public C31933OooO00o(String str, String str2) {
        C24536OooO0Oo.OooO0OO(str, "Name");
        this.f113890OooOo0o = str;
        this.f113889OooOo = str2;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oO0000Oo.OooO0O0) {
            C31933OooO00o c31933OooO00o = (C31933OooO00o) obj;
            if (this.f113890OooOo0o.equals(c31933OooO00o.f113890OooOo0o)) {
                String str = this.f113889OooOo;
                String str2 = c31933OooO00o.f113889OooOo;
                if (str == null ? str2 == null : str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // oO0000Oo.OooO0O0
    public final String getName() {
        return this.f113890OooOo0o;
    }

    @Override // oO0000Oo.OooO0O0
    public final String getValue() {
        return this.f113889OooOo;
    }

    public final int hashCode() {
        String str = this.f113890OooOo0o;
        int iHashCode = 629 + (str != null ? str.hashCode() : 0);
        String str2 = this.f113889OooOo;
        return (iHashCode * 37) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f113890OooOo0o;
        String str2 = this.f113889OooOo;
        if (str2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 1);
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }
}
