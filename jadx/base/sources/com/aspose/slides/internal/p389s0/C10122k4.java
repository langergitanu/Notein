package com.aspose.slides.internal.p389s0;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.s0.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10122k4 {
    /* JADX INFO: renamed from: k4 */
    public static C10117c5 m49717k4(AbstractC3150x6 abstractC3150x6, int i, long j, int i2) {
        C3152yj c3152yj = new C3152yj();
        byte[] bArr = new byte[512];
        abstractC3150x6.setPosition(76L);
        int iM67507x1 = C14116yg.m67507x1(i, 109) * 4;
        abstractC3150x6.read(bArr, 0, iM67507x1);
        c3152yj.write(bArr, 0, iM67507x1);
        for (int i3 = 0; i3 < i2; i3++) {
            abstractC3150x6.setPosition(C10121jd.m49714k4(j, true));
            abstractC3150x6.read(bArr, 0, 512);
            c3152yj.write(bArr, 0, 508);
            j = ((long) ((bArr[508] & 255) | ((bArr[509] & 255) << 8) | ((bArr[510] & 255) << 16) | ((bArr[511] & 255) << 24))) & 4294967295L;
        }
        return new C10117c5(c3152yj);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m49718k4(AbstractC3150x6 abstractC3150x6, long j, int i, C10120h4 c10120h4) {
        long j2;
        long j3;
        C3149x1 c3149x1 = new C3149x1(abstractC3150x6, AbstractC6747ar.m26643rv());
        long position = abstractC3150x6.getPosition();
        abstractC3150x6.setPosition(76L);
        int iM67507x1 = C14116yg.m67507x1(i, 109);
        long j4 = j;
        int i2 = 0;
        while (true) {
            j2 = 4294967295L;
            if (i2 >= iM67507x1) {
                break;
            }
            c3149x1.m13447k4(4294967295L & j4);
            j4++;
            i2++;
        }
        C10121jd.m49715k4(c3149x1);
        abstractC3150x6.setPosition(position);
        int i3 = i - iM67507x1;
        if (i3 <= 0) {
            c10120h4.f36258ck = 4294967294L;
            c10120h4.f36261fa = 0;
            return;
        }
        c10120h4.f36258ck = C10121jd.m49716x1(abstractC3150x6.getPosition(), true);
        c10120h4.f36261fa = 0;
        while (i3 > 0) {
            int iM67507x12 = C14116yg.m67507x1(i3, 127);
            int i4 = 0;
            while (true) {
                j3 = j2;
                if (i4 >= iM67507x12) {
                    break;
                }
                c3149x1.m13447k4(j4 & j3);
                j4++;
                i4++;
                j2 = j3;
            }
            C10121jd.m49715k4(c3149x1);
            i3 -= iM67507x12;
            c10120h4.f36261fa++;
            abstractC3150x6.setPosition(abstractC3150x6.getPosition() - 4);
            if (i3 > 0) {
                c3149x1.m13447k4(((C10121jd.m49716x1(abstractC3150x6.getPosition(), true) & j3) + 1) & j3);
            } else {
                c3149x1.m13447k4(4294967294L);
            }
            j2 = j3;
        }
    }
}
