package oO0oo0Oo;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;
import oOO000oO.C34336OooO0o;

/* JADX INFO: renamed from: oO0oo0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34246OooO00o extends BasicPermission {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f122999OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f123000OooOo0o;

    public C34246OooO00o(String str) {
        super("BC", str);
        this.f123000OooOo0o = str;
        StringTokenizer stringTokenizer = new StringTokenizer(C34336OooO0o.OooO0O0(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (strNextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (strNextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (strNextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (strNextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (strNextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (strNextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (strNextToken.equals("all")) {
                i = 63;
            }
        }
        if (i == 0) {
            throw new IllegalArgumentException("unknown permissions passed to mask");
        }
        this.f122999OooOo = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34246OooO00o) {
            C34246OooO00o c34246OooO00o = (C34246OooO00o) obj;
            if (this.f122999OooOo == c34246OooO00o.f122999OooOo && getName().equals(c34246OooO00o.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final String getActions() {
        return this.f123000OooOo0o;
    }

    public final int hashCode() {
        return getName().hashCode() + this.f122999OooOo;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof C34246OooO00o) || !getName().equals(permission.getName())) {
            return false;
        }
        int i = ((C34246OooO00o) permission).f122999OooOo;
        return (this.f122999OooOo & i) == i;
    }
}
