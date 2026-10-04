package com.aspose.slides.internal.p037b9;

import android.content.pm.PackageManager;
import com.aspose.slides.C22221Oooo0O0;
import com.aspose.slides.OooO0o;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C5004k4;
import com.aspose.slides.internal.p183ij.C5014m9;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p191it.AbstractC5125k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.b9.x1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1674x1 extends AbstractC5125k4 {
    @Override // com.aspose.slides.internal.p191it.AbstractC5125k4
    /* JADX INFO: renamed from: du */
    public void mo9056du(C5061vw c5061vw, C4201h4 c4201h4) {
        mo9078k4((C5004k4) c5061vw, c4201h4);
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [float, int] */
    /* JADX WARN: Type inference failed for: r5v5, types: [float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.content.pm.PackageInfo, int] */
    /* JADX INFO: renamed from: k4 */
    public final long m9077k4(long j, long j2, C5014m9 c5014m9, boolean z) {
        int iOooO0O0;
        int iOooO0O02;
        int iOooO0O03;
        byte bOooO00o;
        long j3;
        long j4 = j & 4294967295L;
        byte b = (byte) ((j4 >> 24) & 4294967295L);
        long j5 = j2 & 4294967295L;
        byte b2 = (byte) ((j5 >> 24) & 4294967295L);
        byte b3 = (byte) ((j4 >> 16) & 4294967295L);
        byte b4 = (byte) ((j5 >> 16) & 4294967295L);
        byte b5 = (byte) ((j4 >> 8) & 4294967295L);
        byte b6 = (byte) ((j5 >> 8) & 4294967295L);
        byte b7 = (byte) (j & 4294967295L);
        byte b8 = (byte) (j2 & 4294967295L);
        ?? M21262to = (c5014m9.m21262to() & 255) / 255.0f;
        if (c5014m9.m21256du() == 0) {
            float f = (b3 & 255) * M21262to;
            float f2 = b4 & 255;
            float f3 = 1.0f - M21262to;
            iOooO0O0 = C22221Oooo0O0.OooO0O0(f2, f3, f, 13);
            iOooO0O02 = C22221Oooo0O0.OooO0O0(b6 & 255, f3, (b5 & 255) * M21262to, 13);
            iOooO0O03 = C22221Oooo0O0.OooO0O0(b8 & 255, f3, (b7 & 255) * M21262to, 13);
            if (z) {
                bOooO00o = OooO0o.OooO00o(b2 & 255, f3, (b & 255) * M21262to, 13);
                j3 = ((bOooO00o & 255) << 24) | (iOooO0O0 << 16) | (iOooO0O02 << 8) | iOooO0O03;
            }
            j3 = ((long) (iOooO0O0 << 16)) | 4278190080L | ((long) (iOooO0O02 << 8)) | ((long) iOooO0O03);
        } else {
            float f4 = (b3 & 255) * M21262to;
            ?? r5 = b & 255;
            float f5 = 1.0f - (r5 / 255.0f);
            iOooO0O0 = C22221Oooo0O0.OooO0O0(f5, b4 & 255, f4, 13);
            iOooO0O02 = C22221Oooo0O0.OooO0O0(f5, b6 & 255, (b5 & 255) * M21262to, 13);
            iOooO0O03 = C22221Oooo0O0.OooO0O0(f5, b8 & 255, (b7 & 255) * M21262to, 13);
            if (z) {
                float packageInfo = (float) PackageManager.getPackageInfo((String) r5, (int) M21262to);
                bOooO00o = OooO0o.OooO00o(1.0f - (packageInfo / 255.0f), b2 & 255, packageInfo, 13);
                j3 = ((bOooO00o & 255) << 24) | (iOooO0O0 << 16) | (iOooO0O02 << 8) | iOooO0O03;
            }
            j3 = ((long) (iOooO0O0 << 16)) | 4278190080L | ((long) (iOooO0O02 << 8)) | ((long) iOooO0O03);
        }
        return j3 & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo9078k4(C5004k4 c5004k4, C4201h4 c4201h4);
}
