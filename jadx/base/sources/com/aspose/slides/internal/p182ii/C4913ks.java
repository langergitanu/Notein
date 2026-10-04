package com.aspose.slides.internal.p182ii;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.C5543ix;
import com.aspose.slides.internal.p213jw.C5546kk;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p231kk.C5793kp;
import com.aspose.slides.internal.p231kk.InterfaceC5785e0;
import com.aspose.slides.internal.p231kk.InterfaceC5804ts;
import com.aspose.slides.internal.p231kk.InterfaceC5805u4;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p231kk.InterfaceC5810wl;
import com.aspose.slides.internal.p270m9.C6347rv;
import com.aspose.slides.internal.p270m9.InterfaceC6346qq;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p435u5.C11284k4;
import com.aspose.slides.internal.p447up.C11539rv;
import com.aspose.slides.internal.p517y2.InterfaceC12760ar;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p552zm.C13626k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18385v2;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ii.ks */
/* JADX INFO: loaded from: classes.dex */
public class C4913ks extends C5552rv implements InterfaceC5805u4 {

    /* JADX INFO: renamed from: ix */
    private static final C7017h4 f13491ix = new C7017h4("HEAD", "BASE", "COMMAND", "LINK", "META", "STYLE", "TITLE");

    /* JADX INFO: renamed from: fa */
    private String f13492fa;

    /* JADX INFO: renamed from: ks */
    private String f13493ks;

    /* JADX INFO: renamed from: ne */
    private InterfaceC5785e0 f13494ne;

    /* JADX INFO: renamed from: rv */
    private C6347rv f13495rv;

    /* JADX INFO: renamed from: up */
    private InterfaceC6346qq f13496up;

    /* JADX INFO: renamed from: x6 */
    private InterfaceC5804ts f13497x6;

    /* JADX INFO: renamed from: yj */
    private Dictionary<String, C11539rv> f13498yj;

    public C4913ks(C5546kk c5546kk) {
        super(c5546kk);
        this.f13498yj = new Dictionary<>();
        this.f13493ks = "DEFAULT_ELEMENT";
        this.f13495rv = new C6347rv();
    }

    /* JADX INFO: renamed from: zj */
    private C1569kk m20425zj() {
        C5543ix c5543ixM22702dy = m22803to("HTML").m22702dy("HEAD");
        if (c5543ixM22702dy == null) {
            return null;
        }
        return (C1569kk) C7019kk.m27452k4((Object) c5543ixM22702dy.m22702dy("TITLE"), C1569kk.class);
    }

    /* JADX INFO: renamed from: em */
    public final InterfaceC5785e0 m20426em() {
        if (this.f13494ne == null) {
            this.f13494ne = new C5793kp(this);
        }
        return this.f13494ne;
    }

    /* JADX INFO: renamed from: f9 */
    public final String m20427f9() {
        return null;
    }

    /* JADX INFO: renamed from: gi */
    public final String m20428gi() {
        C1569kk c1569kkM20425zj = m20425zj();
        if (c1569kkM20425zj == null) {
            return null;
        }
        return c1569kkM20425zj.mo22607e0();
    }

    /* JADX INFO: renamed from: j2 */
    public final AbstractC4908jd m20429j2() {
        return new C4894ck(mo22773ck("FORM"));
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5816yd
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC5810wl mo20430k4(InterfaceC12769ix interfaceC12769ix, String str) {
        return ((InterfaceC5808uz) interfaceC12769ix).mo8438B_();
    }

    /* JADX INFO: renamed from: os */
    public final String m20437os() {
        return this.f13492fa;
    }

    /* JADX INFO: renamed from: qw */
    public final AbstractC4908jd m20438qw() {
        IGenericDictionary<String, IGenericEnumerable<KeyValuePair<String, String>>> dictionary = new Dictionary<>(2);
        dictionary.addItem("APPLET", null);
        List list = new List(2);
        list.addItem(new KeyValuePair("classid", "clsid:CAFEEFAC-00"));
        list.addItem(new KeyValuePair("classid", "clsid:8AD9C840-044E-11D1-B3E9-00805F499D93"));
        dictionary.addItem("OBJECT", list);
        List list2 = new List(3);
        list2.addItem(new KeyValuePair(C18437z2.f56754h, "application/x-java-applet"));
        list2.addItem(new KeyValuePair(C18437z2.f56754h, "application/x-java-bean"));
        list2.addItem(new KeyValuePair(C18437z2.f56754h, "application/x-java-vm"));
        dictionary.addItem("EMBED", list2);
        return new C4894ck(m22784k4(dictionary));
    }

    /* JADX INFO: renamed from: s7 */
    public final String m20439s7() {
        return null;
    }

    /* JADX INFO: renamed from: t6 */
    public final String m20440t6() {
        return null;
    }

    /* JADX INFO: renamed from: tq */
    public final AbstractC4908jd m20441tq() {
        IGenericDictionary<String, IGenericEnumerable<KeyValuePair<String, String>>> dictionary = new Dictionary<>(2);
        KeyValuePair keyValuePair = new KeyValuePair("href", null);
        List list = new List();
        list.addItem(keyValuePair);
        dictionary.addItem(C18385v2.f56336h, list);
        dictionary.addItem("AREA", null);
        return new C4894ck(m22812x1(dictionary));
    }

    /* JADX INFO: renamed from: u4 */
    public final void m20442u4(String str) {
        C1569kk c1569kkM20425zj = m20425zj();
        if (c1569kkM20425zj == null) {
            return;
        }
        c1569kkM20425zj.mo22611ks(str);
    }

    /* JADX INFO: renamed from: uz */
    public final void m20443uz(String str) {
        this.f13492fa = str;
    }

    /* JADX INFO: renamed from: vh */
    public final AbstractC4908jd m20444vh() {
        return new C4894ck(mo22773ck("IMG"));
    }

    /* JADX INFO: renamed from: vj */
    public final C4932u4 m20445vj() {
        C5543ix c5543ixM22803to = m22803to("HTML");
        if (c5543ixM22803to == null) {
            return null;
        }
        return (C4932u4) C7019kk.m27452k4((Object) c5543ixM22803to.m22702dy("FRAMESET"), C4932u4.class);
    }

    /* JADX INFO: renamed from: w6 */
    public final AbstractC4908jd m20446w6() {
        IGenericDictionary<String, IGenericEnumerable<KeyValuePair<String, String>>> dictionary = new Dictionary<>(1);
        KeyValuePair keyValuePair = new KeyValuePair("name", null);
        List list = new List();
        list.addItem(keyValuePair);
        dictionary.addItem(C18385v2.f56336h, list);
        return new C4894ck(m22812x1(dictionary));
    }

    /* JADX INFO: renamed from: wl */
    public final InterfaceC12760ar m20447wl(String str) {
        return mo22773ck(str);
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5776b3
    /* JADX INFO: renamed from: x1 */
    public final InterfaceC5804ts mo20448x1() {
        if (this.f13497x6 == null) {
            this.f13497x6 = new C13626k4(this);
        }
        return this.f13497x6;
    }

    /* JADX INFO: renamed from: xw */
    public final C4897dy m20450xw() {
        C5543ix c5543ixM22803to = m22803to("HTML");
        if (c5543ixM22803to == null) {
            return null;
        }
        return (C4897dy) C7019kk.m27452k4((Object) c5543ixM22803to.m22702dy("BODY"), C4897dy.class);
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5805u4
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC6346qq mo20431k4() {
        return this.f13496up;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5785e0
    /* JADX INFO: renamed from: x1 */
    public final InterfaceC5810wl mo20449x1(InterfaceC12769ix interfaceC12769ix, String str) {
        InterfaceC5808uz interfaceC5808uz = (InterfaceC5808uz) interfaceC12769ix;
        C11539rv c11539rvMo8439k4 = interfaceC5808uz.mo8439k4(str);
        if (c11539rvMo8439k4 == null) {
            mo20431k4().mo25999kk(interfaceC5808uz);
            c11539rvMo8439k4 = interfaceC5808uz.mo8439k4(str);
        }
        return this.f13495rv.m26024k4(c11539rvMo8439k4, this.f13496up);
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5805u4
    /* JADX INFO: renamed from: k4 */
    public final C11539rv mo20432k4(String str) {
        String strM67371jd = C14113y2.m67411k4(str) ? this.f13493ks : C14113y2.m67371jd(str);
        if (this.f13498yj.containsKey(strM67371jd)) {
            return this.f13498yj.get_Item(strM67371jd);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20433k4(InterfaceC1566du interfaceC1566du) {
        C1569kk c1569kk = (C1569kk) C7019kk.m27452k4((Object) mo22815yj(), C1569kk.class);
        if (c1569kk != null) {
            c1569kk.mo8441k4(interfaceC1566du);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20434k4(C4897dy c4897dy) {
        C11284k4.m54244k4(c4897dy, "value");
        C4886ar c4886ar = (C4886ar) m22803to("HTML");
        C4897dy c4897dyM20450xw = m20450xw();
        if (c4897dyM20450xw != null) {
            c4886ar.m22642kk((AbstractC5535bv) c4897dyM20450xw, (AbstractC5535bv) c4897dy);
        } else {
            c4886ar.m22641kk((AbstractC5535bv) c4897dy);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20435k4(InterfaceC6346qq interfaceC6346qq) {
        this.f13496up = interfaceC6346qq;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5805u4
    /* JADX INFO: renamed from: k4 */
    public final void mo20436k4(String str, C11539rv c11539rv) {
        String strM67371jd = C14113y2.m67411k4(str) ? this.f13493ks : C14113y2.m67371jd(str);
        if (this.f13498yj.containsKey(strM67371jd)) {
            this.f13498yj.set_Item(strM67371jd, c11539rv);
        } else {
            this.f13498yj.addItem(strM67371jd, c11539rv);
        }
    }
}
