package com.aspose.slides.internal.p393s7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.s7.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C10157kk extends AbstractC10164x6 {

    /* JADX INFO: renamed from: kk */
    private float f36550kk;

    /* JADX INFO: renamed from: to */
    private String f36551to;

    /* JADX INFO: renamed from: x1 */
    private C5659x1 f36552x1;

    public C10157kk(C5659x1 c5659x1, String str) {
        this.f36552x1 = c5659x1;
        this.f36550kk = c5659x1.m23120k4().m48175c5() / 1000.0f;
        this.f36551to = str;
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: du */
    public int mo15564du(int i) {
        return C7019kk.m27462to(Float.valueOf((this.f36552x1.m23120k4().m48231u4() * i) / this.f36550kk), 13);
    }

    @Override // com.aspose.slides.internal.p393s7.AbstractC10164x6
    /* JADX INFO: renamed from: k4 */
    public int mo15566k4(int i) {
        return this.f36552x1.m23120k4().m48221m9().m48107x1(i).m48284k4();
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: kk */
    public int mo15570kk(int i) {
        return C7019kk.m27462to(Float.valueOf((this.f36552x1.m23120k4().m48189ix() * i) / this.f36550kk), 13);
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: to */
    public int mo15572to(int i) {
        return C7019kk.m27462to(Float.valueOf(((-this.f36552x1.m23120k4().m48177ck()) * i) / this.f36550kk), 13);
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: x1 */
    public int mo15574x1(int i) {
        return C7019kk.m27462to(Float.valueOf((this.f36552x1.m23120k4().m48191jd() * i) / this.f36550kk), 13);
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: du */
    public Dictionary<Integer, Dictionary<Integer, Integer>> mo15565du() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: k4 */
    public int mo15567k4(int i, int i2) {
        return C7019kk.m27462to(Float.valueOf((this.f36552x1.m23120k4().m48221m9().m48107x1((char) i).m48285kk() * i2) / this.f36550kk), 13);
    }

    @Override // com.aspose.slides.internal.p393s7.AbstractC10164x6
    /* JADX INFO: renamed from: kk */
    public String mo15571kk() {
        return this.f36552x1.m23120k4().m48228to();
    }

    @Override // com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: to */
    public boolean mo15573to() {
        return false;
    }

    @Override // com.aspose.slides.internal.p393s7.AbstractC10164x6, com.aspose.slides.internal.p393s7.InterfaceC10158ks
    /* JADX INFO: renamed from: x1 */
    public String mo15575x1() {
        return this.f36551to;
    }

    @Override // com.aspose.slides.internal.p393s7.AbstractC10164x6
    /* JADX INFO: renamed from: k4 */
    public String mo15568k4() {
        return "";
    }

    @Override // com.aspose.slides.internal.p393s7.AbstractC10164x6
    /* JADX INFO: renamed from: k4 */
    public boolean mo15569k4(char c) {
        return this.f36552x1.m23120k4().m48221m9().m48102k4(c) != null;
    }
}
