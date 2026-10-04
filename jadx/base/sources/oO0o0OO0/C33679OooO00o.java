package oO0o0OO0;

import com.aspose.slides.PatternStyle;
import java.io.Serializable;
import kotlin.jvm.internal.OooOOO0;
import o00000.OooOo00;
import oO0o0O0o.C33580OooO00o;

/* JADX INFO: renamed from: oO0o0OO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33679OooO00o implements Comparable<C33679OooO00o>, Serializable {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final C33679OooO00o f121415OooOoO0 = new C33679OooO00o(0, 0);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final long f121416OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final long f121417OooOo0o;

    public C33679OooO00o(long j, long j2) {
        this.f121417OooOo0o = j;
        this.f121416OooOo = j2;
    }

    private final Object writeReplace() {
        return new C33680OooO0O0(this.f121417OooOo0o, this.f121416OooOo);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C33679OooO00o c33679OooO00o) {
        C33679OooO00o other = c33679OooO00o;
        OooOOO0.OooO0oO(other, "other");
        long j = this.f121417OooOo0o;
        long j2 = other.f121417OooOo0o;
        return j != j2 ? Long.compareUnsigned(j, j2) : Long.compareUnsigned(this.f121416OooOo, other.f121416OooOo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33679OooO00o)) {
            return false;
        }
        C33679OooO00o c33679OooO00o = (C33679OooO00o) obj;
        return this.f121417OooOo0o == c33679OooO00o.f121417OooOo0o && this.f121416OooOo == c33679OooO00o.f121416OooOo;
    }

    public final int hashCode() {
        return Long.hashCode(this.f121417OooOo0o ^ this.f121416OooOo);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        OooOo00.OooO0O0(this.f121417OooOo0o, 0, 0, 4, bArr);
        bArr[8] = PatternStyle.DottedGrid;
        OooOo00.OooO0O0(this.f121417OooOo0o, 9, 4, 6, bArr);
        bArr[13] = PatternStyle.DottedGrid;
        OooOo00.OooO0O0(this.f121417OooOo0o, 14, 6, 8, bArr);
        bArr[18] = PatternStyle.DottedGrid;
        OooOo00.OooO0O0(this.f121416OooOo, 19, 0, 2, bArr);
        bArr[23] = PatternStyle.DottedGrid;
        OooOo00.OooO0O0(this.f121416OooOo, 24, 2, 8, bArr);
        return new String(bArr, C33580OooO00o.f121231OooO0O0);
    }
}
