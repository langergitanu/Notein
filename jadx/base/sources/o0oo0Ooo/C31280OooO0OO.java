package o0oo0Ooo;

import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.OooOOO0;
import oO0O00oo.OooOO0;
import oOo000Oo.OooOOO;

/* JADX INFO: renamed from: o0oo0Ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31280OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float[] f111686OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final float[][] f111687OooO0O0 = {new float[]{0.001f, 0.604f, 0.032f, 0.83f, 0.001f, 0.806f, 0.001f, 0.712f}, new float[]{0.001f, 0.529f, 0.159f, 0.788f, 0.001f, 0.591f, 0.002f, 0.599f}, new float[]{0.001f, 0.437f, 0.152f, 0.743f, 0.001f, 0.4f, 0.047f, 0.529f}, new float[]{0.003f, 0.418f, 0.274f, 0.723f, 0.005f, 0.272f, 0.025f, 0.487f}, new float[]{0.001f, 0.398f, 0.272f, 0.714f, 0.005f, 0.267f, 0.241f, 0.517f}, new float[]{0.002f, 0.312f, 0.328f, 0.64f, 0.001f, 0.186f, 0.232f, 0.57f}};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final float[] f111688OooO0OO = {0.3f, 0.5f, 0.7f, 1.0f, 1.2f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final float[][] f111689OooO0Oo = {new float[]{0.001f, 0.4078f, 0.001f, 0.6942f}, new float[]{0.001f, 0.2175f, 0.135f, 0.5679f}, new float[]{0.0045f, 0.0573f, 0.1154f, 0.3807f}, new float[]{0.3333f, 0.3333f, 0.6667f, 0.6667f}, new float[]{0.0431f, 0.0125f, 0.3284f, 0.1943f}, new float[]{0.0421f, 0.0016f, 0.3761f, 0.064f}, new float[]{0.3352f, 0.0f, 0.6685f, 0.337f}};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final float f111690OooO0o0;

    static {
        float[] fArr = {0.05f, 0.1f, 0.15f, 0.2f, 0.25f, 0.3f};
        f111686OooO00o = fArr;
        f111690OooO0o0 = OooOOO.OooOoOO(fArr);
    }

    public static float[] OooO00o(float f, float[] fArr, float[][] fArr2) {
        float fOooOoOO = OooOOO.OooOoOO(fArr);
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        float fOooO0o0 = OooOO0.OooO0o0(f, fOooOoOO, fArr[fArr.length - 1]);
        if (fOooO0o0 <= OooOOO.OooOoOO(fArr)) {
            float[] fArr3 = (float[]) OooOOO.OooOoo0(fArr2);
            float[] fArrCopyOf = Arrays.copyOf(fArr3, fArr3.length);
            OooOOO0.OooO0o(fArrCopyOf, "copyOf(...)");
            return fArrCopyOf;
        }
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (fOooO0o0 >= fArr[fArr.length - 1]) {
            float[] fArr4 = (float[]) OooOOO.Oooo0OO(fArr2);
            float[] fArrCopyOf2 = Arrays.copyOf(fArr4, fArr4.length);
            OooOOO0.OooO0o(fArrCopyOf2, "copyOf(...)");
            return fArrCopyOf2;
        }
        int length = fArr.length - 1;
        int i = 0;
        while (i < length) {
            float f2 = fArr[i];
            int i2 = i + 1;
            float f3 = fArr[i2];
            if (fOooO0o0 <= f3 && f2 <= fOooO0o0) {
                float f4 = (fOooO0o0 - f2) / (f3 - f2);
                float[] fArr5 = fArr2[i];
                float[] fArr6 = fArr2[i2];
                int length2 = fArr5.length;
                float[] fArr7 = new float[length2];
                for (int i3 = 0; i3 < length2; i3++) {
                    float f5 = fArr5[i3];
                    fArr7[i3] = OooOO0.OooO0OO.OooO0O0(fArr6[i3], f5, f4, f5);
                }
                return fArr7;
            }
            i = i2;
        }
        float[] fArr8 = (float[]) OooOOO.Oooo0OO(fArr2);
        float[] fArrCopyOf3 = Arrays.copyOf(fArr8, fArr8.length);
        OooOOO0.OooO0o(fArrCopyOf3, "copyOf(...)");
        return fArrCopyOf3;
    }
}
