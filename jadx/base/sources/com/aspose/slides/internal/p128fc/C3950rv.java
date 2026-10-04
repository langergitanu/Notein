package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p278mq.InterfaceC6404k4;
import com.aspose.slides.internal.p278mq.InterfaceC6405kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7180ck;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p333p8.C9421c5;
import com.aspose.slides.internal.p333p8.C9424dy;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p341po.C9476to;
import com.aspose.slides.internal.p341po.InterfaceC9473k4;
import com.aspose.slides.internal.p341po.InterfaceC9474kk;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;
import com.aspose.slides.internal.p401sl.AbstractC10239m9;
import com.aspose.slides.internal.p401sl.AbstractC10240to;
import com.aspose.slides.internal.p401sl.C10237k4;
import com.aspose.slides.internal.p401sl.C10238kk;
import com.aspose.slides.internal.p469w2.C11882k4;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p544zb.AbstractC13511kk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.rv */
/* JADX INFO: loaded from: classes.dex */
public class C3950rv implements InterfaceC3941ks {

    /* JADX INFO: renamed from: du */
    private final InterfaceC6405kk f10699du;

    /* JADX INFO: renamed from: h4 */
    private final InterfaceC9474kk f10700h4;

    /* JADX INFO: renamed from: k4 */
    private InterfaceC9477x1 f10701k4;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC9473k4 f10702kk;

    /* JADX INFO: renamed from: to */
    private final InterfaceC6404k4 f10703to;

    /* JADX INFO: renamed from: x1 */
    private final Stack<C9421c5> f10704x1;

    public C3950rv(InterfaceC9477x1 interfaceC9477x1, Stack<C9421c5> stack, InterfaceC9473k4 interfaceC9473k4, InterfaceC6404k4 interfaceC6404k4, InterfaceC6405kk interfaceC6405kk, InterfaceC9474kk interfaceC9474kk) {
        this.f10701k4 = interfaceC9477x1;
        this.f10704x1 = stack;
        this.f10702kk = interfaceC9473k4;
        this.f10703to = interfaceC6404k4;
        this.f10699du = interfaceC6405kk;
        this.f10700h4 = interfaceC9474kk;
    }

    @Override // com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public final void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        C7182dy c7182dy = (C7182dy) list.get_Item(0);
        AbstractC10239m9 abstractC10239m9M46097k4 = this.f10704x1.peek().m46097k4(c7182dy);
        if (C7019kk.m27469x1(abstractC10239m9M46097k4, AbstractC10240to.class)) {
            m15654k4(c7182dy, (AbstractC10240to) C7019kk.m27452k4((Object) abstractC10239m9M46097k4, AbstractC10240to.class));
            return;
        }
        if (C7019kk.m27469x1(abstractC10239m9M46097k4, C10238kk.class)) {
            C10238kk c10238kk = (C10238kk) C7019kk.m27452k4((Object) abstractC10239m9M46097k4, C10238kk.class);
            if (C7019kk.m27469x1(c10238kk, C10237k4.class)) {
                m15655k4((C10237k4) C7019kk.m27452k4((Object) c10238kk, C10237k4.class));
            } else {
                m15656k4(c10238kk);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m15654k4(C7182dy c7182dy, AbstractC10240to abstractC10240to) {
        C11913yj c11913yjM46565k4 = this.f10701k4.mo46638k4().m46565k4();
        float fM46652k4 = C9476to.m46652k4(c11913yjM46565k4);
        float fM46657x1 = C9476to.m46657x1(c11913yjM46565k4);
        float[] fArrM55776k4 = c11913yjM46565k4.m55776k4();
        float fM67473jd = (float) C14116yg.m67473jd(fArrM55776k4[0] / fM46652k4);
        float f = fArrM55776k4[1];
        if (f < 0.0f && fArrM55776k4[2] > 0.0f) {
            fM67473jd = -fM67473jd;
        } else if (fM46652k4 >= 0.0f || fM46657x1 >= 0.0f) {
            float f2 = fArrM55776k4[0];
            if (f2 >= 0.0f || f <= 0.0f || fArrM55776k4[2] <= 0.0f) {
                if (f2 >= 0.0f || f >= 0.0f || fArrM55776k4[2] >= 0.0f) {
                    float f3 = fArrM55776k4[3];
                    if (f3 < 0.0f && f > 0.0f && fArrM55776k4[2] > 0.0f) {
                        fM67473jd -= 3.1415927f;
                    } else if (f3 < 0.0f && f < 0.0f && fArrM55776k4[2] < 0.0f) {
                        fM67473jd = 3.1415927f - fM67473jd;
                    }
                }
            }
        } else {
            fM67473jd = 3.1415927f;
        }
        C11913yj c11913yjM55760h4 = c11913yjM46565k4.m55760h4();
        c11913yjM55760h4.m55769k4(C9476to.m46654k4(this.f10702kk.mo46644k4()), 1);
        C12025x6[] c12025x6Arr = {new C12025x6(0.5f, 0.5f)};
        c11913yjM55760h4.m55775k4(c12025x6Arr);
        c11913yjM55760h4.m55767k4((float) (((double) (fM67473jd * 180.0f)) / 3.141592653589793d), c12025x6Arr[0].Clone().Clone(), 1);
        C12025x6[] c12025x6Arr2 = {new C12025x6(0.0f, 1.0f), new C12025x6(1.0f, 0.0f)};
        c11913yjM55760h4.m55775k4(c12025x6Arr2);
        boolean z = c12025x6Arr2[1].m56897x1() < c12025x6Arr2[0].m56897x1();
        boolean z2 = c12025x6Arr2[1].m56895kk() < c12025x6Arr2[0].m56895kk();
        this.f10703to.mo26269k4(c7182dy.m27766k4(), abstractC10240to, new C12007ix(new C12025x6(C14116yg.m67504x1(c12025x6Arr2[1].m56897x1(), c12025x6Arr2[0].m56897x1()), C14116yg.m67504x1(c12025x6Arr2[1].m56895kk(), c12025x6Arr2[0].m56895kk())).Clone(), new C12015qq(C14116yg.m67480k4(c12025x6Arr2[1].m56897x1() - c12025x6Arr2[0].m56897x1()), C14116yg.m67480k4(c12025x6Arr2[1].m56895kk() - c12025x6Arr2[0].m56895kk())).Clone()).Clone(), (float) (((double) ((-fM67473jd) * 180.0f)) / 3.141592653589793d), this.f10699du.mo26303x1(), z, z2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m15655k4(C10237k4 c10237k4) {
        InterfaceC9477x1 interfaceC9477x1 = this.f10701k4;
        interfaceC9477x1.mo46643x1(interfaceC9477x1.mo46638k4());
        this.f10701k4.mo46640kk();
        C7180ck c7180ckM50133yj = c10237k4.m50133yj();
        C11913yj c11913yjM46655k4 = C9476to.m46655k4(c7180ckM50133yj.mo27768h4(C7182dy.f19735zb));
        C9470du c9470duMo46638k4 = this.f10701k4.mo46638k4();
        if (c11913yjM46655k4 != null) {
            c11913yjM46655k4.m55769k4(c9470duMo46638k4.m46565k4(), 1);
            c9470duMo46638k4.m46579k4(c11913yjM46655k4);
        }
        c9470duMo46638k4.m46581k4(AbstractC13511kk.f45107k4);
        c9470duMo46638k4.m46597to(1.0f);
        c9470duMo46638k4.m46559du(1.0f);
        c9470duMo46638k4.m46578k4((C11882k4) null);
        c9470duMo46638k4.m46612x1(C12003du.f40505to.Clone());
        c9470duMo46638k4.m46580k4(C12003du.f40505to.Clone());
        this.f10701k4.mo46639k4(c9470duMo46638k4);
        C7186k4 c7186k4 = (C7186k4) C7019kk.m27452k4((Object) c7180ckM50133yj.mo27768h4(C7182dy.f19346b3), C7186k4.class);
        if (c7186k4 != null) {
            C9424dy c9424dy = new C9424dy(c7186k4);
            float fM46141to = c9424dy.m46141to();
            float fM46137du = c9424dy.m46137du();
            float fM46138h4 = c9424dy.m46138h4();
            float fM46140m9 = c9424dy.m46140m9();
            C12025x6 c12025x6Clone = C9476to.m46656k4(fM46141to, fM46137du, this.f10701k4.mo46638k4().m46565k4()).Clone();
            C12025x6 c12025x6Clone2 = C9476to.m46656k4(fM46138h4, fM46137du, this.f10701k4.mo46638k4().m46565k4()).Clone();
            C12025x6 c12025x6Clone3 = C9476to.m46656k4(fM46138h4, fM46140m9, this.f10701k4.mo46638k4().m46565k4()).Clone();
            C12025x6 c12025x6Clone4 = C9476to.m46656k4(fM46141to, fM46140m9, this.f10701k4.mo46638k4().m46565k4()).Clone();
            C11896dy c11896dy = new C11896dy();
            c11896dy.m55564kk(new C12025x6[]{new C12025x6(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk()), new C12025x6(c12025x6Clone2.m56897x1(), c12025x6Clone2.m56895kk()), new C12025x6(c12025x6Clone3.m56897x1(), c12025x6Clone3.m56895kk()), new C12025x6(c12025x6Clone4.m56897x1(), c12025x6Clone4.m56895kk())});
            c11896dy.m55567m9();
        }
        C9421c5 c9421c5M50129x1 = c10237k4.m50129x1();
        if (c9421c5M50129x1 != null) {
            this.f10704x1.push(c9421c5M50129x1);
            this.f10700h4.mo46645k4(c7180ckM50133yj);
            this.f10704x1.pop();
        } else {
            this.f10700h4.mo46645k4(c7180ckM50133yj);
        }
        this.f10701k4.mo46641to();
        this.f10701k4.mo46643x1(null);
    }

    /* JADX INFO: renamed from: k4 */
    private void m15656k4(C10238kk c10238kk) {
        this.f10701k4.mo46640kk();
        C7180ck c7180ckM50133yj = c10238kk.m50133yj();
        C11913yj c11913yjM46655k4 = C9476to.m46655k4(c7180ckM50133yj.mo27768h4(C7182dy.f19735zb));
        if (c11913yjM46655k4 != null) {
            C9470du c9470duMo46638k4 = this.f10701k4.mo46638k4();
            c11913yjM46655k4.m55769k4(c9470duMo46638k4.m46565k4(), 1);
            c9470duMo46638k4.m46579k4(c11913yjM46655k4);
            this.f10701k4.mo46639k4(c9470duMo46638k4);
        }
        C7186k4 c7186k4 = (C7186k4) C7019kk.m27452k4((Object) c7180ckM50133yj.mo27768h4(C7182dy.f19346b3), C7186k4.class);
        if (c7186k4 != null) {
            C9424dy c9424dy = new C9424dy(c7186k4);
            float fM46141to = c9424dy.m46141to();
            float fM46137du = c9424dy.m46137du();
            float fM46138h4 = c9424dy.m46138h4();
            float fM46140m9 = c9424dy.m46140m9();
            C12025x6 c12025x6Clone = C9476to.m46656k4(fM46141to, fM46137du, this.f10701k4.mo46638k4().m46565k4()).Clone();
            C12025x6 c12025x6Clone2 = C9476to.m46656k4(fM46138h4, fM46137du, this.f10701k4.mo46638k4().m46565k4()).Clone();
            C12025x6 c12025x6Clone3 = C9476to.m46656k4(fM46138h4, fM46140m9, this.f10701k4.mo46638k4().m46565k4()).Clone();
            C12025x6 c12025x6Clone4 = C9476to.m46656k4(fM46141to, fM46140m9, this.f10701k4.mo46638k4().m46565k4()).Clone();
            C11896dy c11896dy = new C11896dy();
            c11896dy.m55564kk(new C12025x6[]{new C12025x6(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk()), new C12025x6(c12025x6Clone2.m56897x1(), c12025x6Clone2.m56895kk()), new C12025x6(c12025x6Clone3.m56897x1(), c12025x6Clone3.m56895kk()), new C12025x6(c12025x6Clone4.m56897x1(), c12025x6Clone4.m56895kk())});
            c11896dy.m55567m9();
        }
        C9421c5 c9421c5M50129x1 = c10238kk.m50129x1();
        if (c9421c5M50129x1 != null) {
            this.f10704x1.push(c9421c5M50129x1);
            this.f10700h4.mo46645k4(c7180ckM50133yj);
            this.f10704x1.pop();
        } else {
            this.f10700h4.mo46645k4(c7180ckM50133yj);
        }
        this.f10701k4.mo46641to();
    }
}
