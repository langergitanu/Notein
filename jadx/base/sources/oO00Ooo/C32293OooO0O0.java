package oO00Ooo;

import oO00Ooo.AbstractC32292OooO00o;

/* JADX INFO: renamed from: oO00Ooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32293OooO0O0 extends AbstractC32292OooO00o.AbstractC20214OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Long f116176OooO00o;

    public C32293OooO0O0(Long l) {
        this.f116176OooO00o = l;
    }

    @Override // oO00Ooo.AbstractC32292OooO00o.AbstractC20214OooO00o
    public final Long OooO00o() {
        return this.f116176OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC32292OooO00o.AbstractC20214OooO00o) {
            return this.f116176OooO00o.equals(((AbstractC32292OooO00o.AbstractC20214OooO00o) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return this.f116176OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AttributeValueLong{longValue=" + this.f116176OooO00o + "}";
    }
}
