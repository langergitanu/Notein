package oO0OOo0o;

import Oooo0oO.o0Oo0oo;
import com.aspose.slides.PatternStyle;
import com.google.common.base.Charsets;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import oO0OOo0o.C33094OoooO;

/* JADX INFO: loaded from: classes10.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final o00Oo0 f119714OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final List<o00Oo0> f119715OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o00Oo0 f119716OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o00Oo0 f119717OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o00Oo0 f119718OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o00Oo0 f119719OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final o00Oo0 f119720OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final o00Oo0 f119721OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final o00Oo0 f119722OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final o00Oo0 f119723OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final o00Oo0 f119724OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final o00Oo0 f119725OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final C33094OoooO.OooO0o f119726OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final C33094OoooO.OooO0o f119727OooOOo0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f119728OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f119729OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Throwable f119730OooO0OO;

    public enum OooO00o {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final byte[] f119749OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f119750OooOo0o;

        OooO00o(int i) {
            this.f119750OooOo0o = i;
            this.f119749OooOo = Integer.toString(i).getBytes(Charsets.US_ASCII);
        }

        public final o00Oo0 OooO00o() {
            return o00Oo0.f119715OooO0Oo.get(this.f119750OooOo0o);
        }
    }

    public static final class OooO0O0 implements C33094OoooO.InterfaceC33097OooO0oO<o00Oo0> {
        @Override // oO0OOo0o.C33094OoooO.InterfaceC33097OooO0oO
        public final byte[] OooO00o(o00Oo0 o00oo02) {
            return o00oo02.f119728OooO00o.f119749OooOo;
        }

        @Override // oO0OOo0o.C33094OoooO.InterfaceC33097OooO0oO
        public final o00Oo0 OooO0O0(byte[] bArr) {
            int i;
            byte b;
            char c = 0;
            if (bArr.length == 1 && bArr[0] == 48) {
                return o00Oo0.f119717OooO0o0;
            }
            int length = bArr.length;
            if (length != 1) {
                if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                    i = (b - PatternStyle.Wave) * 10;
                    c = 1;
                }
                return o00Oo0.f119718OooO0oO.OooO0oo("Unknown code ".concat(new String(bArr, Charsets.US_ASCII)));
            }
            i = 0;
            byte b2 = bArr[c];
            if (b2 >= 48 && b2 <= 57) {
                int i2 = (b2 - PatternStyle.Wave) + i;
                List<o00Oo0> list = o00Oo0.f119715OooO0Oo;
                if (i2 < list.size()) {
                    return list.get(i2);
                }
            }
            return o00Oo0.f119718OooO0oO.OooO0oo("Unknown code ".concat(new String(bArr, Charsets.US_ASCII)));
        }
    }

    public static final class OooO0OO implements C33094OoooO.InterfaceC33097OooO0oO<String> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final byte[] f119751OooO00o = {PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Vertical, PatternStyle.Cross, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, PatternStyle.DiagonalCross, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        @Override // oO0OOo0o.C33094OoooO.InterfaceC33097OooO0oO
        public final byte[] OooO00o(String str) {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            int i = 0;
            while (i < bytes.length) {
                byte b = bytes[i];
                if (b < 32 || b >= 126 || b == 37) {
                    byte[] bArr = new byte[androidx.core.graphics.OooO0OO.OooO00o(bytes.length, i, 3, i)];
                    if (i != 0) {
                        System.arraycopy(bytes, 0, bArr, 0, i);
                    }
                    int i2 = i;
                    while (i < bytes.length) {
                        byte b2 = bytes[i];
                        if (b2 < 32 || b2 >= 126 || b2 == 37) {
                            bArr[i2] = 37;
                            byte[] bArr2 = f119751OooO00o;
                            bArr[i2 + 1] = bArr2[(b2 >> 4) & 15];
                            bArr[i2 + 2] = bArr2[b2 & 15];
                            i2 += 3;
                        } else {
                            bArr[i2] = b2;
                            i2++;
                        }
                        i++;
                    }
                    return Arrays.copyOf(bArr, i2);
                }
                i++;
            }
            return bytes;
        }

        @Override // oO0OOo0o.C33094OoooO.InterfaceC33097OooO0oO
        public final String OooO0O0(byte[] bArr) {
            for (int i = 0; i < bArr.length; i++) {
                byte b = bArr[i];
                if (b < 32 || b >= 126 || (b == 37 && i + 2 < bArr.length)) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
                    int i2 = 0;
                    while (i2 < bArr.length) {
                        if (bArr[i2] == 37 && i2 + 2 < bArr.length) {
                            try {
                                byteBufferAllocate.put((byte) Integer.parseInt(new String(bArr, i2 + 1, 2, Charsets.US_ASCII), 16));
                                i2 += 3;
                            } catch (NumberFormatException unused) {
                                byteBufferAllocate.put(bArr[i2]);
                                i2++;
                            }
                        }
                        byteBufferAllocate.put(bArr[i2]);
                        i2++;
                    }
                    return new String(byteBufferAllocate.array(), 0, byteBufferAllocate.position(), Charsets.UTF_8);
                }
            }
            return new String(bArr, 0);
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        for (OooO00o oooO00o : OooO00o.values()) {
            o00Oo0 o00oo02 = (o00Oo0) treeMap.put(Integer.valueOf(oooO00o.f119750OooOo0o), new o00Oo0(oooO00o, null, null));
            if (o00oo02 != null) {
                throw new IllegalStateException("Code value duplication between " + o00oo02.f119728OooO00o.name() + " & " + oooO00o.name());
            }
        }
        f119715OooO0Oo = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        f119717OooO0o0 = OooO00o.OK.OooO00o();
        f119716OooO0o = OooO00o.CANCELLED.OooO00o();
        f119718OooO0oO = OooO00o.UNKNOWN.OooO00o();
        OooO00o.INVALID_ARGUMENT.OooO00o();
        f119719OooO0oo = OooO00o.DEADLINE_EXCEEDED.OooO00o();
        OooO00o.NOT_FOUND.OooO00o();
        OooO00o.ALREADY_EXISTS.OooO00o();
        f119714OooO = OooO00o.PERMISSION_DENIED.OooO00o();
        f119720OooOO0 = OooO00o.UNAUTHENTICATED.OooO00o();
        f119721OooOO0O = OooO00o.RESOURCE_EXHAUSTED.OooO00o();
        f119722OooOO0o = OooO00o.FAILED_PRECONDITION.OooO00o();
        OooO00o.ABORTED.OooO00o();
        OooO00o.OUT_OF_RANGE.OooO00o();
        f119724OooOOO0 = OooO00o.UNIMPLEMENTED.OooO00o();
        f119723OooOOO = OooO00o.INTERNAL.OooO00o();
        f119725OooOOOO = OooO00o.UNAVAILABLE.OooO00o();
        OooO00o.DATA_LOSS.OooO00o();
        f119726OooOOOo = new C33094OoooO.OooO0o("grpc-status", false, new OooO0O0());
        f119727OooOOo0 = new C33094OoooO.OooO0o("grpc-message", false, new OooO0OO());
    }

    public o00Oo0(OooO00o oooO00o, String str, Throwable th) {
        this.f119728OooO00o = (OooO00o) Preconditions.checkNotNull(oooO00o, "code");
        this.f119729OooO0O0 = str;
        this.f119730OooO0OO = th;
    }

    public static String OooO0OO(o00Oo0 o00oo02) {
        String str = o00oo02.f119729OooO0O0;
        OooO00o oooO00o = o00oo02.f119728OooO00o;
        if (str == null) {
            return oooO00o.toString();
        }
        return oooO00o + ": " + o00oo02.f119729OooO0O0;
    }

    public static o00Oo0 OooO0Oo(int i) {
        if (i >= 0) {
            List<o00Oo0> list = f119715OooO0Oo;
            if (i < list.size()) {
                return list.get(i);
            }
        }
        return f119718OooO0oO.OooO0oo("Unknown code " + i);
    }

    public static o00Oo0 OooO0o0(Throwable th) {
        for (Throwable cause = (Throwable) Preconditions.checkNotNull(th, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof o00Ooo) {
                return ((o00Ooo) cause).f119753OooOo0o;
            }
            if (cause instanceof C33119o00o0O) {
                return ((C33119o00o0O) cause).f119755OooOo0o;
            }
        }
        return f119718OooO0oO.OooO0oO(th);
    }

    public final C33119o00o0O OooO00o() {
        return new C33119o00o0O(this, null);
    }

    public final o00Oo0 OooO0O0(String str) {
        if (str == null) {
            return this;
        }
        Throwable th = this.f119730OooO0OO;
        OooO00o oooO00o = this.f119728OooO00o;
        String str2 = this.f119729OooO0O0;
        return str2 == null ? new o00Oo0(oooO00o, str, th) : new o00Oo0(oooO00o, o0Oo0oo.OooO0Oo(str2, IOUtils.LINE_SEPARATOR_UNIX, str), th);
    }

    public final boolean OooO0o() {
        return OooO00o.OK == this.f119728OooO00o;
    }

    public final o00Oo0 OooO0oO(Throwable th) {
        return Objects.equal(this.f119730OooO0OO, th) ? this : new o00Oo0(this.f119728OooO00o, this.f119729OooO0O0, th);
    }

    public final o00Oo0 OooO0oo(String str) {
        return Objects.equal(this.f119729OooO0O0, str) ? this : new o00Oo0(this.f119728OooO00o, str, this.f119730OooO0OO);
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperAdd = MoreObjects.toStringHelper(this).add("code", this.f119728OooO00o.name()).add("description", this.f119729OooO0O0);
        Throwable th = this.f119730OooO0OO;
        Object stackTraceAsString = th;
        if (th != null) {
            stackTraceAsString = Throwables.getStackTraceAsString(th);
        }
        return toStringHelperAdd.add("cause", stackTraceAsString).toString();
    }
}
