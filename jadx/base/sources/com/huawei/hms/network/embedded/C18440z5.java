package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.z5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18440z5 extends OutputStream {

    /* JADX INFO: renamed from: b */
    public static final String f56802b = "CronetOutputStream";

    /* JADX INFO: renamed from: c */
    public static final double f56803c = 8192.0d;

    /* JADX INFO: renamed from: a */
    public final C18200h6 f56804a;

    public C18440z5(C18200h6 c18200h6) {
        this.f56804a = c18200h6;
    }

    /* JADX INFO: renamed from: a */
    private void m80032a(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        try {
            int iCeil = (int) Math.ceil(((double) i3) / 8192.0d);
            byte[][] bArr2 = new byte[iCeil][];
            for (int i4 = 0; i4 < iCeil; i4++) {
                int i5 = (int) (((double) i4) * 8192.0d);
                int i6 = (int) (((double) i5) + 8192.0d);
                if (i6 > i3) {
                    i6 = i3;
                }
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i5, i6);
                bArr2[i4] = bArrCopyOfRange;
                this.f56804a.put(bArrCopyOfRange);
            }
        } catch (InterruptedException unused) {
            Logger.m76967w(f56802b, "An error occurred when cronet upload data or split byte.");
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(StringUtils.getBytes(String.valueOf(i)));
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        m80032a(bArr, i, i2);
    }
}
