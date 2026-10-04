package o00o00;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooOO.C25159OooO0oO;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0 implements InterfaceC25121OooOO0O<InputStream, OooO0OO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f85854OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f85855OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C25159OooO0oO f85856OooO0OO;

    public OooOO0(ArrayList arrayList, OooO00o oooO00o, C25159OooO0oO c25159OooO0oO) {
        this.f85854OooO00o = arrayList;
        this.f85855OooO0O0 = oooO00o;
        this.f85856OooO0OO = c25159OooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC25145OooOo0o<OooO0OO> OooO00o(InputStream inputStream, int i, int i2, C25111OooO c25111OooO) throws IOException {
        byte[] byteArray;
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            bArr = new byte[16384];
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        while (true) {
            int i3 = inputStream2.read(bArr);
            if (i3 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i3);
            if (byteArray != null) {
                return null;
            }
            return this.f85855OooO0O0.OooO00o(ByteBuffer.wrap(byteArray), i, i2, c25111OooO);
        }
        byteArrayOutputStream.flush();
        byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray != null) {
        }
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final boolean OooO0O0(InputStream inputStream, C25111OooO c25111OooO) throws IOException {
        return !((Boolean) c25111OooO.OooO0OO(OooO.f85808OooO0O0)).booleanValue() && com.bumptech.glide.load.OooO00o.OooO0O0(this.f85854OooO00o, inputStream, this.f85856OooO0OO) == ImageHeaderParser.ImageType.GIF;
    }
}
