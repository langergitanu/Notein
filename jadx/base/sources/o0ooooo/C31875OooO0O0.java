package o0ooooo;

import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o0ooooo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31875OooO0O0 implements Comparable<C31875OooO0O0> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final byte f113573OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte f113574OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final byte f113575OooOoO0;

    static {
        Pattern.compile("\\b(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\b");
    }

    public C31875OooO0O0(byte b, byte b2, byte b3) {
        this.f113574OooOo0o = b;
        this.f113573OooOo = b2;
        this.f113575OooOoO0 = b3;
    }

    public static byte OooO00o(int i) {
        if (i < 0 || i > 127) {
            throw new IllegalArgumentException("Version component out of supported range (0-127)");
        }
        return (byte) i;
    }

    public final int OooO0O0(int i, int i2, int i3) {
        return Integer.compare((this.f113574OooOo0o << 16) | (this.f113573OooOo << 8) | this.f113575OooOoO0, (i << 16) | (i2 << 8) | i3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C31875OooO0O0 c31875OooO0O0) {
        C31875OooO0O0 c31875OooO0O02 = c31875OooO0O0;
        return OooO0O0(c31875OooO0O02.f113574OooOo0o, c31875OooO0O02.f113573OooOo, c31875OooO0O02.f113575OooOoO0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C31875OooO0O0.class == obj.getClass()) {
            C31875OooO0O0 c31875OooO0O0 = (C31875OooO0O0) obj;
            if (this.f113574OooOo0o == c31875OooO0O0.f113574OooOo0o && this.f113573OooOo == c31875OooO0O0.f113573OooOo && this.f113575OooOoO0 == c31875OooO0O0.f113575OooOoO0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Byte.valueOf(this.f113574OooOo0o), Byte.valueOf(this.f113573OooOo), Byte.valueOf(this.f113575OooOoO0));
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        return (this.f113574OooOo0o & 255) + "." + (this.f113573OooOo & 255) + "." + (this.f113575OooOoO0 & 255);
    }
}
