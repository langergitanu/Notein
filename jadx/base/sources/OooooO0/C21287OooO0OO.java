package OooooO0;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.OooOOO0;
import oO00OOoo.C32250OooO0O0;
import oO00Oo0.C32269OooO0oo;
import oO00Oo0O.C32271OooO00o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: OooooO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21287OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f61713OooO00o = 0;

    public static final void OooO00o(C32271OooO00o c32271OooO00o, byte[] bArr, int i, int i2) throws EOFException {
        int i3 = c32271OooO00o.f115945OooO0O0;
        if (c32271OooO00o.f115946OooO0OO - i3 < i2) {
            throw new EOFException("Not enough bytes to read a byte array of size " + i2 + FilenameUtils.EXTENSION_SEPARATOR);
        }
        ByteBuffer copyTo = c32271OooO00o.f115944OooO00o;
        OooOOO0.OooO0oO(copyTo, "$this$copyTo");
        if (!copyTo.hasArray() || copyTo.isReadOnly()) {
            copyTo.duplicate().get(bArr, i, i2);
        } else {
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i3, bArr, i, i2);
        }
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        c32271OooO00o.OooO0OO(i2);
    }

    public static final String OooO0O0(float f) {
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final void OooO0OO(C32271OooO00o c32271OooO00o, byte[] source, int i, int i2) throws C32269OooO0oo {
        OooOOO0.OooO0oO(source, "source");
        int i3 = c32271OooO00o.f115946OooO0OO;
        int i4 = c32271OooO00o.f115949OooO0o0 - i3;
        if (i4 < i2) {
            throw new C32269OooO0oo("byte array", i2, i4);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(source, i, i2).slice().order(ByteOrder.BIG_ENDIAN);
        OooOOO0.OooO0o(byteBufferOrder, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        ByteBuffer byteBuffer = C32250OooO0O0.f115830OooO00o;
        C32250OooO0O0.OooO00o(byteBufferOrder, c32271OooO00o.f115944OooO00o, 0, i2, i3);
        c32271OooO00o.OooO00o(i2);
    }
}
