package oO00Ooo;

import java.util.Arrays;

/* JADX INFO: renamed from: oO00Ooo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32306OooOo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C32306OooOo0 f116221OooO0O0 = new C32306OooOo0((byte) 0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte f116222OooO00o;

    public C32306OooOo0(byte b) {
        this.f116222OooO00o = b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C32306OooOo0) && this.f116222OooO00o == ((C32306OooOo0) obj).f116222OooO00o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new byte[]{this.f116222OooO00o});
    }

    public final String toString() {
        return androidx.appcompat.app.OooOOO.OooO00o(new StringBuilder("TraceOptions{sampled="), "}", (this.f116222OooO00o & 1) != 0);
    }
}
