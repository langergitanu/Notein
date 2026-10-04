package com.aspose.slides.internal.p112en;

import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p255lq.C6221x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p482wr.C12252dq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.en.dy */
/* JADX INFO: loaded from: classes.dex */
public class C3767dy implements InterfaceC3764c5 {
    @Override // com.aspose.slides.internal.p112en.InterfaceC3764c5
    /* JADX INFO: renamed from: k4 */
    public final C3769h4 mo15090k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62, C7187kk c7187kk, int i) {
        C7187kk c7187kk2;
        C7185jd c7185jdM27799k4 = c7187kk.m27799k4(C7182dy.f19379d4, C7182dy.f19587q3);
        if (C7019kk.m27469x1(c7185jdM27799k4, C7187kk.class)) {
            c7187kk2 = (C7187kk) c7185jdM27799k4;
        } else {
            if (C7019kk.m27469x1(c7185jdM27799k4, C7186k4.class)) {
                C7186k4 c7186k4 = (C7186k4) c7185jdM27799k4;
                if (i < c7186k4.m27778k4()) {
                    c7187kk2 = (C7187kk) C7019kk.m27452k4((Object) c7186k4.m27787x1(i), C7187kk.class);
                }
            } else if (c7185jdM27799k4 != null) {
                throw new IOException(C14113y2.m67402k4("Error: Expected CosArray or CosDictionary!", new Object[0]));
            }
            c7187kk2 = null;
        }
        int iM27790c5 = c7187kk2 != null ? c7187kk2.m27790c5(C7182dy.f19529mh) : -1;
        try {
            if (iM27790c5 <= 1 || c7187kk2 == null) {
                m15091k4(abstractC3150x6, abstractC3150x62);
            } else {
                int iM67507x1 = C14116yg.m67507x1(c7187kk2.m27796k4(C7182dy.f19449he, 1), 32);
                int iM27796k4 = c7187kk2.m27796k4(C7182dy.f19366c6, 8);
                int iM27796k42 = c7187kk2.m27796k4(C7182dy.f19713y2, 1);
                C3152yj c3152yj = new C3152yj();
                m15091k4(abstractC3150x6, c3152yj);
                C3152yj c3152yj2 = new C3152yj(C6221x1.m25205k4(c3152yj));
                C3775up.m15099k4(iM27790c5, iM67507x1, iM27796k4, iM27796k42, c3152yj2, abstractC3150x62, 4096);
                abstractC3150x62.flush();
                c3152yj.dispose();
                c3152yj2.dispose();
            }
            return new C3769h4(c7187kk);
        } catch (FormatException e) {
            throw new IOException("Error occured in a Decode Flate filter", e);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    private void m15091k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62) {
        int i;
        C12252dq c12252dq = new C12252dq(abstractC3150x6, 1, 0, 1950, false);
        byte[] bArr = new byte[4092];
        do {
            try {
                i = c12252dq.read(bArr, 0, 4092);
                if (i > 0) {
                    abstractC3150x62.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                c12252dq.close();
                throw th;
            }
        } while (i > 0);
        c12252dq.close();
        abstractC3150x62.flush();
    }
}
