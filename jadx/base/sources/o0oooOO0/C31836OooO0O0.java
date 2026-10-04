package o0oooOO0;

import com.aspose.slides.PatternStyle;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: o0oooOO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31836OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f113462OooO00o = {PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Vertical, PatternStyle.Cross, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, PatternStyle.DiagonalCross, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final char[] f113463OooO0O0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static char[] OooO00o(short s) {
        char[] cArr = f113463OooO0O0;
        return new char[]{cArr[(s >> 12) & 15], cArr[(s >> 8) & 15], cArr[(s >> 4) & 15], cArr[s & 15]};
    }

    public static void OooO0O0(byte b, OutputStream outputStream) throws IOException {
        byte[] bArr = f113462OooO00o;
        outputStream.write(bArr[(b & 240) >> 4]);
        outputStream.write(bArr[b & 15]);
    }
}
