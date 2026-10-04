package o00O0O;

import android.view.KeyEvent;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import io.ktor.utils.p616io.C23988OooooOO;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {
    public static final int OooO00o(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final void OooO0O0(oO00Oo0.OooO00o oooO00o, ByteBuffer dst, int i) {
        OooOOO0.OooO0oO(oooO00o, "<this>");
        OooOOO0.OooO0oO(dst, "dst");
        ByteBuffer byteBuffer = oooO00o.f115944OooO00o;
        int i2 = oooO00o.f115945OooO0O0;
        if (oooO00o.f115946OooO0OO - i2 < i) {
            throw new EOFException("Not enough bytes to read a buffer content of size " + i + FilenameUtils.EXTENSION_SEPARATOR);
        }
        int iLimit = dst.limit();
        try {
            dst.limit(dst.position() + i);
            C23988OooooOO.OooO0OO(byteBuffer, dst, i2);
            dst.limit(iLimit);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            oooO00o.OooO0OO(i);
        } catch (Throwable th) {
            dst.limit(iLimit);
            throw th;
        }
    }
}
