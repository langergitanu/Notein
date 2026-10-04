package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.C6773ss;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.rv */
/* JADX INFO: loaded from: classes4.dex */
public class C10626rv extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private String f37359k4;

    public C10626rv() {
        m51409um().m51917k4(4026);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return this.f37359k4.length() * 2;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m51659x1() {
        return this.f37359k4;
    }

    public C10626rv(String str, short s) {
        if (str == null) {
            throw new ArgumentNullException();
        }
        m51409um().m51917k4(4026);
        this.f37359k4 = str;
        m51409um().m51920k4(s);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37359k4 = "";
        char[] cArrM26671k4 = new C6773ss().m26671k4(c3134k4.m13372dy(m51409um().m51914du()));
        if (cArrM26671k4 != null) {
            this.f37359k4 = C14113y2.m67405k4(cArrM26671k4);
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13450k4(new C6773ss().m26683x1(C14113y2.m67365dy(this.f37359k4)));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51658k4(String str) {
        this.f37359k4 = str;
    }
}
