package oO00Ooo;

import oO00Ooo.AbstractC32292OooO00o;

/* JADX INFO: renamed from: oO00Ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32294OooO0OO extends AbstractC32292OooO00o.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f116177OooO00o;

    public C32294OooO0OO(String str) {
        this.f116177OooO00o = str;
    }

    @Override // oO00Ooo.AbstractC32292OooO00o.OooO0O0
    public final String OooO00o() {
        return this.f116177OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC32292OooO00o.OooO0O0) {
            return this.f116177OooO00o.equals(((AbstractC32292OooO00o.OooO0O0) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return this.f116177OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("AttributeValueString{stringValue="), this.f116177OooO00o, "}");
    }
}
