package oO00Oo;

import OooO0Oo.C20398OooO0O0;
import java.nio.ByteBuffer;
import o00OooO.C25139OooOOOo;
import o00OooO0.C25150OooO00o;
import oO00Oo0.C32266OooO0Oo;
import oO0o0O0o.C33580OooO00o;

/* JADX INFO: renamed from: oO00Oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32252OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f115839OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final EnumC32257OooO0o0 f115840OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final byte[] f115841OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f115842OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f115843OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f115844OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ByteBuffer f115845OooO0oO;

    /* JADX INFO: renamed from: oO00Oo.OooO0O0$OooO00o */
    public static final class OooO00o extends AbstractC32252OooO0O0 {
    }

    /* JADX INFO: renamed from: oO00Oo.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C20211OooO0O0 extends AbstractC32252OooO0O0 {
        public C20211OooO0O0(byte[] bArr) {
            super(true, EnumC32257OooO0o0.f115867OooOoo, bArr, false, false, false);
        }

        public C20211OooO0O0(C32251OooO00o c32251OooO00o) {
            oO00Oo0.OooO0OO oooO0OO = new oO00Oo0.OooO0OO(null);
            try {
                C25139OooOOOo.OooO0o0(oooO0OO, c32251OooO00o.f115832OooO00o);
                String str = c32251OooO00o.f115833OooO0O0;
                C25150OooO00o.OooO(oooO0OO, str, 0, str.length(), C33580OooO00o.f121231OooO0O0);
                C32266OooO0Oo packet = oooO0OO.ooOO();
                kotlin.jvm.internal.OooOOO0.OooO0oO(packet, "packet");
                this(C25150OooO00o.OooO0oO(packet));
            } catch (Throwable th) {
                oooO0OO.close();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: oO00Oo.OooO0O0$OooO0OO */
    public static final class OooO0OO extends AbstractC32252OooO0O0 {
    }

    /* JADX INFO: renamed from: oO00Oo.OooO0O0$OooO0Oo, reason: case insensitive filesystem */
    public static final class C32253OooO0Oo extends AbstractC32252OooO0O0 {
    }

    /* JADX INFO: renamed from: oO00Oo.OooO0O0$OooO0o0 */
    public static final class OooO0o0 extends AbstractC32252OooO0O0 {
    }

    public AbstractC32252OooO0O0(boolean z, EnumC32257OooO0o0 enumC32257OooO0o0, byte[] bArr, boolean z2, boolean z3, boolean z4) {
        this.f115839OooO00o = z;
        this.f115840OooO0O0 = enumC32257OooO0o0;
        this.f115841OooO0OO = bArr;
        this.f115842OooO0Oo = z2;
        this.f115844OooO0o0 = z3;
        this.f115843OooO0o = z4;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        kotlin.jvm.internal.OooOOO0.OooO0o(byteBufferWrap, "wrap(data)");
        this.f115845OooO0oO = byteBufferWrap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame ");
        sb.append(this.f115840OooO0O0);
        sb.append(" (fin=");
        sb.append(this.f115839OooO00o);
        sb.append(", buffer len = ");
        return C20398OooO0O0.OooO00o(')', sb, this.f115841OooO0OO.length);
    }
}
