package oO0O00oo;

import java.util.Iterator;
import o0000OOo.C24217OooO0O0;

/* JADX INFO: renamed from: oO0O00oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32519OooO0oO implements Iterable<Integer>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f116811OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f116812OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f116813OooOoO0;

    public C32519OooO0oO(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f116812OooOo0o = i;
        this.f116811OooOo = C24217OooO0O0.OooO0oo(i, i2, i3);
        this.f116813OooOoO0 = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C32519OooO0oO)) {
            return false;
        }
        if (isEmpty() && ((C32519OooO0oO) obj).isEmpty()) {
            return true;
        }
        C32519OooO0oO c32519OooO0oO = (C32519OooO0oO) obj;
        return this.f116812OooOo0o == c32519OooO0oO.f116812OooOo0o && this.f116811OooOo == c32519OooO0oO.f116811OooOo && this.f116813OooOoO0 == c32519OooO0oO.f116813OooOoO0;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f116812OooOo0o * 31) + this.f116811OooOo) * 31) + this.f116813OooOoO0;
    }

    public boolean isEmpty() {
        int i = this.f116813OooOoO0;
        int i2 = this.f116811OooOo;
        int i3 = this.f116812OooOo0o;
        return i > 0 ? i3 > i2 : i3 < i2;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new C32520OooO0oo(this.f116812OooOo0o, this.f116811OooOo, this.f116813OooOoO0);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f116811OooOo;
        int i2 = this.f116812OooOo0o;
        int i3 = this.f116813OooOoO0;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
