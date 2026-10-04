package com.aspose.slides.internal.p072d2;

import android.graphics.Bitmap;
import androidx.core.view.ViewCompat;
import com.aspose.words.WarningType;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.aspose.slides.internal.d2.x1 */
/* JADX INFO: loaded from: classes3.dex */
class C3007x1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m12666k4(Bitmap bitmap, OutputStream outputStream) throws IOException {
        byte[] bArr;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        byte[] bArr2 = new byte[0];
        int i = width * 3;
        int i2 = i % 4;
        if (i2 > 0) {
            int i3 = 4 - i2;
            byte[] bArr3 = new byte[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                bArr3[i4] = -1;
            }
            bArr = bArr3;
        } else {
            bArr = bArr2;
        }
        int length = (i + bArr.length) * height;
        int i5 = length + 54;
        bitmap.getZFBVersionCode();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i5);
        m12667k4(byteBufferAllocate, i5, 54);
        m12668k4(byteBufferAllocate, width, height, length, bArr);
        m12669k4(byteBufferAllocate, width, height, bArr, new int[width * height]);
        outputStream.write(byteBufferAllocate.array());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m12667k4(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.put((byte) 66);
        byteBuffer.put((byte) 77);
        byteBuffer.put(m12670k4(i));
        byteBuffer.put(m12671k4((short) 0));
        byteBuffer.put(m12671k4((short) 0));
        byteBuffer.put(m12670k4(i2));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m12668k4(ByteBuffer byteBuffer, int i, int i2, int i3, byte[] bArr) {
        byteBuffer.put(m12670k4(40));
        byteBuffer.put(m12670k4(i + (bArr.length == 3 ? 1 : 0)));
        byteBuffer.put(m12670k4(i2));
        byteBuffer.put(m12671k4((short) 1));
        byteBuffer.put(m12671k4((short) 24));
        byteBuffer.put(m12670k4(0));
        byteBuffer.put(m12670k4(i3));
        byteBuffer.put(m12670k4(0));
        byteBuffer.put(m12670k4(0));
        byteBuffer.put(m12670k4(0));
        byteBuffer.put(m12670k4(0));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m12669k4(ByteBuffer byteBuffer, int i, int i2, byte[] bArr, int[] iArr) {
        int i3 = (i2 - 1) * i;
        int i4 = i2 * i;
        while (i2 > 0) {
            for (int i5 = i3; i5 < i4; i5++) {
                byteBuffer.put((byte) (iArr[i5] & 255));
                byteBuffer.put((byte) ((iArr[i5] & 65280) >> 8));
                byteBuffer.put((byte) ((iArr[i5] & WarningType.MINOR_FORMATTING_LOSS_CATEGORY) >> 16));
            }
            if (bArr.length > 0) {
                byteBuffer.put(bArr);
            }
            i2--;
            i4 = i3;
            i3 -= i;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m12670k4(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8), (byte) ((16711680 & i) >> 16), (byte) ((i & ViewCompat.MEASURED_STATE_MASK) >> 24)};
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m12671k4(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s & 65280) >> 8)};
    }
}
