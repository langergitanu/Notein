package com.aspose.slides.internal.p389s0;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.orion.notein.domain.models.backup.BackupEvent;

/* JADX INFO: renamed from: com.aspose.slides.internal.s0.to */
/* JADX INFO: loaded from: classes4.dex */
public class C10125to extends C10117c5 {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3150x6 f36271k4;

    /* JADX INFO: renamed from: x1 */
    private final C10120h4 f36272x1;

    public C10125to(AbstractC3150x6 abstractC3150x6, C10120h4 c10120h4) {
        this.f36271k4 = abstractC3150x6;
        this.f36272x1 = c10120h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49729k4() {
        AbstractC3150x6 abstractC3150x6 = this.f36271k4;
        C10120h4 c10120h4 = this.f36272x1;
        C10117c5 c10117c5M49717k4 = C10122k4.m49717k4(abstractC3150x6, c10120h4.f36262h4, c10120h4.f36258ck, c10120h4.f36261fa);
        byte[] bArr = new byte[512];
        C3134k4 c3134k4 = new C3134k4(new C3152yj(bArr), AbstractC6747ar.m26643rv());
        for (long j = 0; (4294967295L & j) < this.f36272x1.f36262h4; j++) {
            this.f36271k4.setPosition(C10121jd.m49714k4(c10117c5M49717k4.m49698x1(j), true));
            this.f36271k4.read(bArr, 0, 512);
            c3134k4.m13371ck().setPosition(0L);
            for (int i = 0; i < 128; i++) {
                m49694k4(c3134k4.m13384uz());
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m49730x1() {
        C3152yj c3152yjM49696kk = m49696kk();
        C3149x1 c3149x1 = new C3149x1(this.f36271k4, AbstractC6747ar.m26643rv());
        long jM49716x1 = C10121jd.m49716x1(this.f36271k4.getPosition(), true);
        int iM49697to = m49697to();
        int iM58609k4 = C12565ks.m58609k4(C12565ks.m58609k4(iM49697to, 128) + iM49697to, 128);
        this.f36271k4.write(c3152yjM49696kk.getBuffer(), 0, (int) c3152yjM49696kk.getLength());
        for (int i = 0; i < iM58609k4; i++) {
            c3149x1.m13447k4(4294967293L);
        }
        int iM58609k42 = C12565ks.m58609k4(iM49697to + iM58609k4, 128);
        if (iM58609k42 > 109) {
            int iM58609k43 = C12565ks.m58609k4(iM58609k42 + BackupEvent.ERROR_GUID_NOT_EXIST, 127);
            for (int i2 = 0; i2 < iM58609k43; i2++) {
                c3149x1.m13447k4(4294967293L);
            }
            for (int i3 = 0; i3 < iM58609k43; i3++) {
                c3149x1.m13447k4(4294967292L);
            }
            iM58609k42 = C12565ks.m58609k4(r4 + iM58609k43, 128);
        }
        this.f36272x1.f36262h4 = iM58609k42;
        C10121jd.m49715k4(c3149x1);
        C10122k4.m49718k4(this.f36271k4, jM49716x1, iM58609k42, this.f36272x1);
    }
}
