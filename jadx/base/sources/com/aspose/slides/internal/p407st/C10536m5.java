package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18163eb;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.m5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10536m5 extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    boolean f37215k4 = true;

    /* JADX INFO: renamed from: x1 */
    private int f37217x1 = 65535;

    /* JADX INFO: renamed from: kk */
    private final List<C10752zi> f37216kk = new List<>();

    public C10536m5() {
        m51409um().m51917k4(4003);
        m51409um().m51916k4((byte) 0);
        m51409um().m51920k4((short) 4);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        int size = m51276to().size();
        int iM52145k4 = 2;
        for (int i = 0; i < size; i++) {
            iM52145k4 += m51276to().get_Item(i).m52145k4(m51409um().m51922kk());
        }
        return iM52145k4;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m51275kk() {
        return this.f37215k4;
    }

    /* JADX INFO: renamed from: to */
    public final List<C10752zi> m51276to() {
        return this.f37216kk;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(C14113y2.m67402k4("TextMasterStyleAtom: Header.Instance: {0}; Levels count: {1}", Short.valueOf(m51409um().m51922kk()), Integer.valueOf(m51276to().size())));
        for (int i = 0; i < m51276to().size(); i++) {
            c6765kp.m26804kk();
            c6765kp.m26792k4(C14113y2.m67402k4("{0}: {1}", Integer.valueOf(i), m51276to().get_Item(i)));
        }
        return C14113y2.m67401k4(c6765kp.toString(), IOUtils.LINE_SEPARATOR_UNIX, "\n  ");
    }

    /* JADX INFO: renamed from: x1 */
    public final int m51277x1() {
        int i = this.f37217x1;
        return (i & 65535) == 65535 ? m51276to().size() & 65535 : i;
    }

    public C10536m5(int i) {
        m51409um().m51917k4(4003);
        m51409um().m51916k4((byte) 0);
        m51272k4(i, true);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0075. Please report as an issue. */
    /* JADX INFO: renamed from: k4 */
    public final void m51272k4(int i, boolean z) {
        int i2;
        C10752zi c10752zi;
        C10546mr c10546mrM52146k4;
        C14093tq<Short> c14093tq;
        C10597pu c10597puM52151x1;
        C14093tq<Short> c14093tq2;
        C10597pu c10597puM52151x12;
        C14093tq<Short> c14093tq3;
        m51409um().m51920k4((short) i);
        m51276to().clear();
        if (!z) {
            switch (i) {
                case 0:
                    C10752zi c10752zi2 = new C10752zi();
                    c10752zi2.m52146k4().m51315k4((byte) 0);
                    c10752zi2.m52146k4().m51339x1((byte) 1);
                    c10752zi2.m52146k4().m51321kk((byte) 1);
                    c10752zi2.m52146k4().m51331to((byte) 1);
                    c10752zi2.m52146k4().m51318k4(new C14093tq<>((short) 8226));
                    c10752zi2.m52146k4().m51340x1(new C14093tq<>(0));
                    c10752zi2.m52146k4().m51322kk(new C14093tq<>((short) 100));
                    c10752zi2.m52146k4().m51317k4(new C10661u4(4278190080L));
                    c10752zi2.m52146k4().m51332to(new C14093tq<>(1));
                    c10752zi2.m52146k4().m51303du(new C14093tq<>((short) 100));
                    c10752zi2.m52146k4().m51310h4(new C14093tq<>((short) 0));
                    c10752zi2.m52146k4().m51327m9(new C14093tq<>((short) 0));
                    c10752zi2.m52146k4().m51305dy(new C14093tq<>((short) 0));
                    c10752zi2.m52146k4().m51298c5(new C14093tq<>((short) 0));
                    c10752zi2.m52146k4().m51313jd(new C14093tq<>((short) 576));
                    c10752zi2.m52146k4().m51316k4(new C10475i3());
                    c10752zi2.m52146k4().m51300ck(new C14093tq<>(0));
                    c10752zi2.m52146k4().m51302du((byte) 1);
                    c10752zi2.m52146k4().m51309h4((byte) 1);
                    c10752zi2.m52146k4().m51326m9((byte) 1);
                    c10752zi2.m52146k4().m51307fa(new C14093tq<>(0));
                    i2 = 0;
                    c10752zi2.m52151x1().m51522k4((byte) 0);
                    c10752zi2.m52151x1().m51539x1((byte) 0);
                    c10752zi2.m52151x1().m51527kk((byte) 0);
                    c10752zi2.m52151x1().m51535to((byte) 0);
                    c10752zi2.m52151x1().m51513du((byte) 0);
                    c10752zi2.m52151x1().m51518h4((byte) 0);
                    c10752zi2.m52151x1().m51531m9((byte) 0);
                    c10752zi2.m52151x1().m51528kk(new C14093tq<>(65535));
                    c10752zi2.m52151x1().m51536to(new C14093tq<>(65535));
                    c10752zi2.m52151x1().m51514du(new C14093tq<>(65535));
                    c10752zi2.m52151x1().m51519h4(new C14093tq<>((short) 44));
                    c10752zi2.m52151x1().m51523k4(new C10661u4(50331648L));
                    c10752zi2.m52151x1().m51532m9(new C14093tq<>((short) 0));
                    m51276to().addItem(c10752zi2);
                    break;
                case 1:
                    C10752zi c10752zi3 = new C10752zi();
                    c10752zi3.m52146k4().m51315k4((byte) 1);
                    c10752zi3.m52146k4().m51339x1((byte) 1);
                    c10752zi3.m52146k4().m51321kk((byte) 1);
                    c10752zi3.m52146k4().m51331to((byte) 1);
                    c10752zi3.m52146k4().m51318k4(new C14093tq<>((short) 8226));
                    c10752zi3.m52146k4().m51340x1(new C14093tq<>(0));
                    c10752zi3.m52146k4().m51322kk(new C14093tq<>((short) 100));
                    c10752zi3.m52146k4().m51317k4(new C10661u4(4278190080L));
                    c10752zi3.m52146k4().m51332to(new C14093tq<>(0));
                    c10752zi3.m52146k4().m51303du(new C14093tq<>((short) 100));
                    c10752zi3.m52146k4().m51310h4(new C14093tq<>((short) 20));
                    c10752zi3.m52146k4().m51327m9(new C14093tq<>((short) 0));
                    c10752zi3.m52146k4().m51305dy(new C14093tq<>((short) 216));
                    c10752zi3.m52146k4().m51298c5(new C14093tq<>((short) 0));
                    c10752zi3.m52146k4().m51313jd(new C14093tq<>((short) 576));
                    c10752zi3.m52146k4().m51316k4(new C10475i3());
                    c10752zi3.m52146k4().m51300ck(new C14093tq<>(0));
                    c10752zi3.m52146k4().m51302du((byte) 1);
                    c10752zi3.m52146k4().m51309h4((byte) 1);
                    c10752zi3.m52146k4().m51326m9((byte) 1);
                    c10752zi3.m52146k4().m51307fa(new C14093tq<>(0));
                    c10752zi3.m52151x1().m51522k4((byte) 0);
                    c10752zi3.m52151x1().m51539x1((byte) 0);
                    c10752zi3.m52151x1().m51527kk((byte) 0);
                    c10752zi3.m52151x1().m51535to((byte) 0);
                    c10752zi3.m52151x1().m51513du((byte) 0);
                    c10752zi3.m52151x1().m51518h4((byte) 0);
                    c10752zi3.m52151x1().m51531m9((byte) 0);
                    c10752zi3.m52151x1().m51540x1(new C14093tq<>(0));
                    c10752zi3.m52151x1().m51528kk(new C14093tq<>(65535));
                    c10752zi3.m52151x1().m51536to(new C14093tq<>(65535));
                    c10752zi3.m52151x1().m51514du(new C14093tq<>(65535));
                    c10752zi3.m52151x1().m51519h4(new C14093tq<>((short) 32));
                    c10752zi3.m52151x1().m51523k4(new C10661u4(C18163eb.f54662y));
                    c10752zi3.m52151x1().m51532m9(new C14093tq<>((short) 0));
                    m51276to().addItem(c10752zi3);
                    C10752zi c10752zi4 = new C10752zi();
                    c10752zi4.m52146k4().m51318k4(new C14093tq<>((short) 8211));
                    c10752zi4.m52146k4().m51305dy(new C14093tq<>((short) 468));
                    c10752zi4.m52146k4().m51298c5(new C14093tq<>((short) 288));
                    c10752zi4.m52151x1().m51519h4(new C14093tq<>((short) 28));
                    m51276to().addItem(c10752zi4);
                    C10752zi c10752zi5 = new C10752zi();
                    c10752zi5.m52146k4().m51318k4(new C14093tq<>((short) 8226));
                    c10752zi5.m52146k4().m51305dy(new C14093tq<>((short) 720));
                    c10752zi5.m52146k4().m51298c5(new C14093tq<>((short) 576));
                    c10752zi5.m52151x1().m51519h4(new C14093tq<>((short) 24));
                    m51276to().addItem(c10752zi5);
                    C10752zi c10752zi6 = new C10752zi();
                    c10752zi6.m52146k4().m51318k4(new C14093tq<>((short) 8211));
                    c10752zi6.m52146k4().m51305dy(new C14093tq<>((short) 1008));
                    c10752zi6.m52146k4().m51298c5(new C14093tq<>((short) 864));
                    c10752zi6.m52151x1().m51519h4(new C14093tq<>((short) 20));
                    m51276to().addItem(c10752zi6);
                    c10752zi = new C10752zi();
                    c10752zi.m52146k4().m51318k4(new C14093tq<>((short) 187));
                    c10752zi.m52146k4().m51305dy(new C14093tq<>((short) 1296));
                    c10546mrM52146k4 = c10752zi.m52146k4();
                    c14093tq = new C14093tq<>((short) 1152);
                    c10546mrM52146k4.m51298c5(c14093tq);
                    m51276to().addItem(c10752zi);
                    i2 = 0;
                    break;
                case 2:
                    C10752zi c10752zi7 = new C10752zi();
                    c10752zi7.m52146k4().m51315k4((byte) 0);
                    c10752zi7.m52146k4().m51339x1((byte) 0);
                    c10752zi7.m52146k4().m51321kk((byte) 0);
                    c10752zi7.m52146k4().m51331to((byte) 0);
                    c10752zi7.m52146k4().m51318k4(new C14093tq<>((short) 8226));
                    c10752zi7.m52146k4().m51340x1(new C14093tq<>(0));
                    c10752zi7.m52146k4().m51322kk(new C14093tq<>((short) 100));
                    c10752zi7.m52146k4().m51317k4(new C10661u4(4278190080L));
                    c10752zi7.m52146k4().m51332to(new C14093tq<>(0));
                    c10752zi7.m52146k4().m51303du(new C14093tq<>((short) 100));
                    c10752zi7.m52146k4().m51310h4(new C14093tq<>((short) 30));
                    c10752zi7.m52146k4().m51327m9(new C14093tq<>((short) 0));
                    c10752zi7.m52146k4().m51305dy(new C14093tq<>((short) 0));
                    c10752zi7.m52146k4().m51298c5(new C14093tq<>((short) 0));
                    c10752zi7.m52146k4().m51313jd(new C14093tq<>((short) 288));
                    c10752zi7.m52146k4().m51316k4(new C10475i3());
                    c10752zi7.m52146k4().m51300ck(new C14093tq<>(0));
                    c10752zi7.m52146k4().m51302du((byte) 0);
                    c10752zi7.m52146k4().m51309h4((byte) 1);
                    c10752zi7.m52146k4().m51326m9((byte) 0);
                    c10752zi7.m52146k4().m51307fa(new C14093tq<>(0));
                    c10752zi7.m52151x1().m51522k4((byte) 0);
                    c10752zi7.m52151x1().m51539x1((byte) 0);
                    c10752zi7.m52151x1().m51527kk((byte) 0);
                    c10752zi7.m52151x1().m51535to((byte) 0);
                    c10752zi7.m52151x1().m51513du((byte) 0);
                    c10752zi7.m52151x1().m51518h4((byte) 0);
                    c10752zi7.m52151x1().m51531m9((byte) 0);
                    c10752zi7.m52151x1().m51540x1(new C14093tq<>(0));
                    c10752zi7.m52151x1().m51528kk(new C14093tq<>(65535));
                    c10752zi7.m52151x1().m51536to(new C14093tq<>(65535));
                    c10752zi7.m52151x1().m51514du(new C14093tq<>(65535));
                    c10752zi7.m52151x1().m51519h4(new C14093tq<>((short) 12));
                    c10752zi7.m52151x1().m51523k4(new C10661u4(C18163eb.f54662y));
                    c10752zi7.m52151x1().m51532m9(new C14093tq<>((short) 0));
                    m51276to().addItem(c10752zi7);
                    C10752zi c10752zi8 = new C10752zi();
                    c10752zi8.m52146k4().m51305dy(new C14093tq<>((short) 288));
                    c10752zi8.m52146k4().m51298c5(new C14093tq<>((short) 288));
                    m51276to().addItem(c10752zi8);
                    C10752zi c10752zi9 = new C10752zi();
                    c10752zi9.m52146k4().m51305dy(new C14093tq<>((short) 576));
                    c10752zi9.m52146k4().m51298c5(new C14093tq<>((short) 576));
                    m51276to().addItem(c10752zi9);
                    C10752zi c10752zi10 = new C10752zi();
                    c10752zi10.m52146k4().m51305dy(new C14093tq<>((short) 864));
                    c10752zi10.m52146k4().m51298c5(new C14093tq<>((short) 864));
                    m51276to().addItem(c10752zi10);
                    c10752zi = new C10752zi();
                    c10752zi.m52146k4().m51305dy(new C14093tq<>((short) 1152));
                    c10546mrM52146k4 = c10752zi.m52146k4();
                    c14093tq = new C14093tq<>((short) 1152);
                    c10546mrM52146k4.m51298c5(c14093tq);
                    m51276to().addItem(c10752zi);
                    i2 = 0;
                    break;
                case 3:
                default:
                    i2 = 0;
                    break;
                case 4:
                    C10752zi c10752zi11 = new C10752zi();
                    c10752zi11.m52146k4().m51315k4((byte) 0);
                    c10752zi11.m52146k4().m51339x1((byte) 1);
                    c10752zi11.m52146k4().m51321kk((byte) 1);
                    c10752zi11.m52146k4().m51331to((byte) 1);
                    c10752zi11.m52146k4().m51318k4(new C14093tq<>((short) 8226));
                    c10752zi11.m52146k4().m51340x1(new C14093tq<>(0));
                    c10752zi11.m52146k4().m51322kk(new C14093tq<>((short) 100));
                    c10752zi11.m52146k4().m51317k4(new C10661u4(4278190080L));
                    c10752zi11.m52146k4().m51332to(new C14093tq<>(0));
                    c10752zi11.m52146k4().m51303du(new C14093tq<>((short) 100));
                    c10752zi11.m52146k4().m51310h4(new C14093tq<>((short) 0));
                    c10752zi11.m52146k4().m51327m9(new C14093tq<>((short) 0));
                    c10752zi11.m52146k4().m51305dy(new C14093tq<>((short) 0));
                    c10752zi11.m52146k4().m51298c5(new C14093tq<>((short) 0));
                    c10752zi11.m52146k4().m51313jd(new C14093tq<>((short) 576));
                    c10752zi11.m52146k4().m51316k4(new C10475i3());
                    c10752zi11.m52146k4().m51300ck(new C14093tq<>(0));
                    c10752zi11.m52146k4().m51302du((byte) 1);
                    c10752zi11.m52146k4().m51309h4((byte) 1);
                    c10752zi11.m52146k4().m51326m9((byte) 1);
                    c10752zi11.m52146k4().m51307fa(new C14093tq<>(0));
                    c10752zi11.m52151x1().m51522k4((byte) 0);
                    c10752zi11.m52151x1().m51539x1((byte) 0);
                    c10752zi11.m52151x1().m51527kk((byte) 0);
                    c10752zi11.m52151x1().m51535to((byte) 0);
                    c10752zi11.m52151x1().m51513du((byte) 0);
                    c10752zi11.m52151x1().m51518h4((byte) 0);
                    c10752zi11.m52151x1().m51531m9((byte) 0);
                    c10752zi11.m52151x1().m51540x1(new C14093tq<>(65535));
                    c10752zi11.m52151x1().m51528kk(new C14093tq<>(65535));
                    c10752zi11.m52151x1().m51536to(new C14093tq<>(65535));
                    c10752zi11.m52151x1().m51514du(new C14093tq<>(65535));
                    c10752zi11.m52151x1().m51519h4(new C14093tq<>((short) 18));
                    c10752zi11.m52151x1().m51523k4(new C10661u4(C18163eb.f54662y));
                    c10752zi11.m52151x1().m51532m9(new C14093tq<>((short) 0));
                    m51276to().addItem(c10752zi11);
                    C10752zi c10752zi12 = new C10752zi();
                    c10752zi12.m52146k4().m51305dy(new C14093tq<>((short) 288));
                    c10752zi12.m52146k4().m51298c5(new C14093tq<>((short) 288));
                    m51276to().addItem(c10752zi12);
                    C10752zi c10752zi13 = new C10752zi();
                    c10752zi13.m52146k4().m51305dy(new C14093tq<>((short) 576));
                    c10752zi13.m52146k4().m51298c5(new C14093tq<>((short) 576));
                    m51276to().addItem(c10752zi13);
                    C10752zi c10752zi14 = new C10752zi();
                    c10752zi14.m52146k4().m51305dy(new C14093tq<>((short) 864));
                    c10752zi14.m52146k4().m51298c5(new C14093tq<>((short) 864));
                    m51276to().addItem(c10752zi14);
                    c10752zi = new C10752zi();
                    c10752zi.m52146k4().m51305dy(new C14093tq<>((short) 1152));
                    c10546mrM52146k4 = c10752zi.m52146k4();
                    c14093tq = new C14093tq<>((short) 1152);
                    c10546mrM52146k4.m51298c5(c14093tq);
                    m51276to().addItem(c10752zi);
                    i2 = 0;
                    break;
                case 5:
                    C10752zi c10752zi15 = new C10752zi();
                    c10752zi15.m52146k4().m51315k4((byte) 0);
                    c10752zi15.m52146k4().m51339x1((byte) 0);
                    c10752zi15.m52146k4().m51321kk((byte) 0);
                    c10752zi15.m52146k4().m51331to((byte) 0);
                    c10752zi15.m52146k4().m51332to(new C14093tq<>(1));
                    c10752zi15.m52146k4().m51305dy(new C14093tq<>((short) 0));
                    m51276to().addItem(c10752zi15);
                    C10752zi c10752zi16 = new C10752zi();
                    c10752zi16.m52146k4().m51332to(new C14093tq<>(1));
                    c10752zi16.m52146k4().m51305dy(new C14093tq<>((short) 288));
                    m51276to().addItem(c10752zi16);
                    C10752zi c10752zi17 = new C10752zi();
                    c10752zi17.m52146k4().m51315k4((byte) 0);
                    c10752zi17.m52146k4().m51339x1((byte) 0);
                    c10752zi17.m52146k4().m51321kk((byte) 0);
                    c10752zi17.m52146k4().m51331to((byte) 0);
                    c10752zi17.m52146k4().m51332to(new C14093tq<>(1));
                    c10752zi17.m52146k4().m51305dy(new C14093tq<>((short) 576));
                    m51276to().addItem(c10752zi17);
                    C10752zi c10752zi18 = new C10752zi();
                    c10752zi18.m52146k4().m51315k4((byte) 0);
                    c10752zi18.m52146k4().m51339x1((byte) 0);
                    c10752zi18.m52146k4().m51321kk((byte) 0);
                    c10752zi18.m52146k4().m51331to((byte) 0);
                    c10752zi18.m52146k4().m51332to(new C14093tq<>(1));
                    c10752zi18.m52146k4().m51305dy(new C14093tq<>((short) 864));
                    m51276to().addItem(c10752zi18);
                    c10752zi = new C10752zi();
                    c10752zi.m52146k4().m51315k4((byte) 0);
                    c10752zi.m52146k4().m51339x1((byte) 0);
                    c10752zi.m52146k4().m51321kk((byte) 0);
                    c10752zi.m52146k4().m51331to((byte) 0);
                    c10752zi.m52146k4().m51332to(new C14093tq<>(1));
                    c10752zi.m52146k4().m51305dy(new C14093tq<>((short) 1152));
                    m51276to().addItem(c10752zi);
                    i2 = 0;
                    break;
                case 6:
                    c10752zi = new C10752zi();
                    m51276to().addItem(c10752zi);
                    i2 = 0;
                    break;
                case 7:
                    C10752zi c10752zi19 = new C10752zi();
                    c10752zi19.m52151x1().m51519h4(new C14093tq<>((short) 28));
                    m51276to().addItem(c10752zi19);
                    C10752zi c10752zi20 = new C10752zi();
                    c10752zi20.m52151x1().m51519h4(new C14093tq<>((short) 24));
                    m51276to().addItem(c10752zi20);
                    C10752zi c10752zi21 = new C10752zi();
                    c10752zi21.m52151x1().m51519h4(new C14093tq<>((short) 20));
                    m51276to().addItem(c10752zi21);
                    C10752zi c10752zi22 = new C10752zi();
                    c10752zi22.m52151x1().m51519h4(new C14093tq<>((short) 18));
                    m51276to().addItem(c10752zi22);
                    c10752zi = new C10752zi();
                    c10597puM52151x1 = c10752zi.m52151x1();
                    c14093tq2 = new C14093tq<>((short) 18);
                    c10597puM52151x1.m51519h4(c14093tq2);
                    m51276to().addItem(c10752zi);
                    i2 = 0;
                    break;
                case 8:
                    C10752zi c10752zi23 = new C10752zi();
                    c10752zi23.m52151x1().m51519h4(new C14093tq<>((short) 24));
                    m51276to().addItem(c10752zi23);
                    C10752zi c10752zi24 = new C10752zi();
                    c10752zi24.m52151x1().m51519h4(new C14093tq<>((short) 20));
                    m51276to().addItem(c10752zi24);
                    C10752zi c10752zi25 = new C10752zi();
                    c10752zi25.m52151x1().m51519h4(new C14093tq<>((short) 18));
                    m51276to().addItem(c10752zi25);
                    C10752zi c10752zi26 = new C10752zi();
                    c10752zi26.m52151x1().m51519h4(new C14093tq<>((short) 16));
                    m51276to().addItem(c10752zi26);
                    c10752zi = new C10752zi();
                    c10597puM52151x1 = c10752zi.m52151x1();
                    c14093tq2 = new C14093tq<>((short) 16);
                    c10597puM52151x1.m51519h4(c14093tq2);
                    m51276to().addItem(c10752zi);
                    i2 = 0;
                    break;
            }
        } else {
            switch (i) {
                case 0:
                    c10752zi = new C10752zi();
                    c10752zi.m52146k4().m51315k4((byte) 0);
                    c10752zi.m52146k4().m51339x1((byte) 1);
                    c10752zi.m52146k4().m51321kk((byte) 1);
                    c10752zi.m52146k4().m51331to((byte) 1);
                    c10752zi.m52146k4().m51318k4(new C14093tq<>((short) 8226));
                    c10752zi.m52146k4().m51340x1(new C14093tq<>(0));
                    c10752zi.m52146k4().m51322kk(new C14093tq<>((short) 100));
                    c10752zi.m52146k4().m51317k4(new C10661u4(4278190080L));
                    c10752zi.m52146k4().m51332to(new C14093tq<>(1));
                    c10752zi.m52146k4().m51303du(new C14093tq<>((short) 100));
                    c10752zi.m52146k4().m51310h4(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51327m9(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51305dy(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51298c5(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51313jd(new C14093tq<>((short) 576));
                    c10752zi.m52146k4().m51316k4(new C10475i3());
                    c10752zi.m52146k4().m51300ck(new C14093tq<>(0));
                    c10752zi.m52146k4().m51302du((byte) 1);
                    c10752zi.m52146k4().m51309h4((byte) 1);
                    c10752zi.m52146k4().m51326m9((byte) 1);
                    c10752zi.m52146k4().m51307fa(new C14093tq<>(0));
                    c10752zi.m52151x1().m51522k4((byte) 0);
                    c10752zi.m52151x1().m51539x1((byte) 0);
                    c10752zi.m52151x1().m51527kk((byte) 0);
                    c10752zi.m52151x1().m51535to((byte) 0);
                    c10752zi.m52151x1().m51513du((byte) 0);
                    c10752zi.m52151x1().m51518h4((byte) 0);
                    c10752zi.m52151x1().m51531m9((byte) 0);
                    c10752zi.m52151x1().m51528kk(new C14093tq<>(65535));
                    c10752zi.m52151x1().m51536to(new C14093tq<>(65535));
                    c10752zi.m52151x1().m51514du(new C14093tq<>(65535));
                    c10752zi.m52151x1().m51519h4(new C14093tq<>((short) 44));
                    c10752zi.m52151x1().m51523k4(new C10661u4(50331648L));
                    c10597puM52151x12 = c10752zi.m52151x1();
                    c14093tq3 = new C14093tq<>((short) 0);
                    c10597puM52151x12.m51532m9(c14093tq3);
                    m51276to().addItem(c10752zi);
                    break;
                case 1:
                    c10752zi = new C10752zi();
                    c10752zi.m52146k4().m51315k4((byte) 1);
                    c10752zi.m52146k4().m51339x1((byte) 1);
                    c10752zi.m52146k4().m51321kk((byte) 1);
                    c10752zi.m52146k4().m51331to((byte) 1);
                    c10752zi.m52146k4().m51318k4(new C14093tq<>((short) 8226));
                    c10752zi.m52146k4().m51340x1(new C14093tq<>(0));
                    c10752zi.m52146k4().m51322kk(new C14093tq<>((short) 100));
                    c10752zi.m52146k4().m51317k4(new C10661u4(4278190080L));
                    c10752zi.m52146k4().m51332to(new C14093tq<>(0));
                    c10752zi.m52146k4().m51303du(new C14093tq<>((short) 100));
                    c10752zi.m52146k4().m51310h4(new C14093tq<>((short) 20));
                    c10752zi.m52146k4().m51327m9(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51305dy(new C14093tq<>((short) 216));
                    c10752zi.m52146k4().m51298c5(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51313jd(new C14093tq<>((short) 576));
                    c10752zi.m52146k4().m51316k4(new C10475i3());
                    c10752zi.m52146k4().m51300ck(new C14093tq<>(0));
                    c10752zi.m52146k4().m51302du((byte) 1);
                    c10752zi.m52146k4().m51309h4((byte) 1);
                    c10752zi.m52146k4().m51326m9((byte) 1);
                    c10752zi.m52146k4().m51307fa(new C14093tq<>(0));
                    c10752zi.m52151x1().m51522k4((byte) 0);
                    c10752zi.m52151x1().m51539x1((byte) 0);
                    c10752zi.m52151x1().m51527kk((byte) 0);
                    c10752zi.m52151x1().m51535to((byte) 0);
                    c10752zi.m52151x1().m51513du((byte) 0);
                    c10752zi.m52151x1().m51518h4((byte) 0);
                    c10752zi.m52151x1().m51531m9((byte) 0);
                    c10752zi.m52151x1().m51519h4(new C14093tq<>((short) 32));
                    c10752zi.m52151x1().m51523k4(new C10661u4(C18163eb.f54662y));
                    c10597puM52151x12 = c10752zi.m52151x1();
                    c14093tq3 = new C14093tq<>((short) 0);
                    c10597puM52151x12.m51532m9(c14093tq3);
                    m51276to().addItem(c10752zi);
                    break;
                case 2:
                    c10752zi = new C10752zi();
                    c10752zi.m52146k4().m51315k4((byte) 1);
                    c10752zi.m52146k4().m51339x1((byte) 1);
                    c10752zi.m52146k4().m51321kk((byte) 1);
                    c10752zi.m52146k4().m51331to((byte) 1);
                    c10752zi.m52146k4().m51318k4(new C14093tq<>((short) 8226));
                    c10752zi.m52146k4().m51340x1(new C14093tq<>(0));
                    c10752zi.m52146k4().m51322kk(new C14093tq<>((short) 100));
                    c10752zi.m52146k4().m51317k4(new C10661u4(4278190080L));
                    c10752zi.m52146k4().m51332to(new C14093tq<>(0));
                    c10752zi.m52146k4().m51303du(new C14093tq<>((short) 100));
                    c10752zi.m52146k4().m51310h4(new C14093tq<>((short) 30));
                    c10752zi.m52146k4().m51327m9(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51305dy(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51298c5(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51313jd(new C14093tq<>((short) 576));
                    c10752zi.m52146k4().m51316k4(new C10475i3());
                    c10752zi.m52146k4().m51300ck(new C14093tq<>(0));
                    c10752zi.m52146k4().m51302du((byte) 1);
                    c10752zi.m52146k4().m51309h4((byte) 1);
                    c10752zi.m52146k4().m51326m9((byte) 1);
                    c10752zi.m52146k4().m51307fa(new C14093tq<>(0));
                    c10752zi.m52151x1().m51522k4((byte) 0);
                    c10752zi.m52151x1().m51539x1((byte) 0);
                    c10752zi.m52151x1().m51527kk((byte) 0);
                    c10752zi.m52151x1().m51535to((byte) 0);
                    c10752zi.m52151x1().m51513du((byte) 0);
                    c10752zi.m52151x1().m51518h4((byte) 0);
                    c10752zi.m52151x1().m51531m9((byte) 0);
                    c10752zi.m52151x1().m51540x1(new C14093tq<>(0));
                    c10752zi.m52151x1().m51528kk(new C14093tq<>(65535));
                    c10752zi.m52151x1().m51536to(new C14093tq<>(65535));
                    c10752zi.m52151x1().m51514du(new C14093tq<>(65535));
                    c10752zi.m52151x1().m51519h4(new C14093tq<>((short) 12));
                    c10752zi.m52151x1().m51523k4(new C10661u4(C18163eb.f54662y));
                    c10597puM52151x12 = c10752zi.m52151x1();
                    c14093tq3 = new C14093tq<>((short) 0);
                    c10597puM52151x12.m51532m9(c14093tq3);
                    m51276to().addItem(c10752zi);
                    break;
                case 4:
                    C10752zi c10752zi27 = new C10752zi();
                    c10752zi27.m52146k4().m51315k4((byte) 0);
                    c10752zi27.m52146k4().m51339x1((byte) 1);
                    c10752zi27.m52146k4().m51321kk((byte) 1);
                    c10752zi27.m52146k4().m51331to((byte) 1);
                    c10752zi27.m52146k4().m51318k4(new C14093tq<>((short) 8226));
                    c10752zi27.m52146k4().m51340x1(new C14093tq<>(0));
                    c10752zi27.m52146k4().m51322kk(new C14093tq<>((short) 100));
                    c10752zi27.m52146k4().m51317k4(new C10661u4(4278190080L));
                    c10752zi27.m52146k4().m51332to(new C14093tq<>(0));
                    c10752zi27.m52146k4().m51303du(new C14093tq<>((short) 100));
                    c10752zi27.m52146k4().m51310h4(new C14093tq<>((short) 0));
                    c10752zi27.m52146k4().m51327m9(new C14093tq<>((short) 0));
                    c10752zi27.m52146k4().m51305dy(new C14093tq<>((short) 0));
                    c10752zi27.m52146k4().m51298c5(new C14093tq<>((short) 0));
                    c10752zi27.m52146k4().m51313jd(new C14093tq<>((short) 576));
                    c10752zi27.m52146k4().m51316k4(new C10475i3());
                    c10752zi27.m52146k4().m51300ck(new C14093tq<>(0));
                    c10752zi27.m52146k4().m51302du((byte) 1);
                    c10752zi27.m52146k4().m51309h4((byte) 1);
                    c10752zi27.m52146k4().m51326m9((byte) 1);
                    c10752zi27.m52146k4().m51307fa(new C14093tq<>(0));
                    c10752zi27.m52151x1().m51522k4((byte) 0);
                    c10752zi27.m52151x1().m51539x1((byte) 0);
                    c10752zi27.m52151x1().m51527kk((byte) 0);
                    c10752zi27.m52151x1().m51535to((byte) 0);
                    c10752zi27.m52151x1().m51513du((byte) 0);
                    c10752zi27.m52151x1().m51518h4((byte) 0);
                    c10752zi27.m52151x1().m51531m9((byte) 0);
                    c10752zi27.m52151x1().m51540x1(new C14093tq<>(0));
                    c10752zi27.m52151x1().m51528kk(new C14093tq<>(65535));
                    c10752zi27.m52151x1().m51536to(new C14093tq<>(65535));
                    c10752zi27.m52151x1().m51514du(new C14093tq<>(65535));
                    c10752zi27.m52151x1().m51519h4(new C14093tq<>((short) 18));
                    c10752zi27.m52151x1().m51523k4(new C10661u4(C18163eb.f54662y));
                    c10752zi27.m52151x1().m51532m9(new C14093tq<>((short) 0));
                    m51276to().addItem(c10752zi27);
                    C10752zi c10752zi28 = new C10752zi();
                    c10752zi28.m52146k4().m51305dy(new C14093tq<>((short) 288));
                    c10752zi28.m52146k4().m51298c5(new C14093tq<>((short) 288));
                    m51276to().addItem(c10752zi28);
                    C10752zi c10752zi29 = new C10752zi();
                    c10752zi29.m52146k4().m51305dy(new C14093tq<>((short) 576));
                    c10752zi29.m52146k4().m51298c5(new C14093tq<>((short) 576));
                    m51276to().addItem(c10752zi29);
                    C10752zi c10752zi30 = new C10752zi();
                    c10752zi30.m52146k4().m51305dy(new C14093tq<>((short) 864));
                    c10752zi30.m52146k4().m51298c5(new C14093tq<>((short) 864));
                    m51276to().addItem(c10752zi30);
                    c10752zi = new C10752zi();
                    c10752zi.m52146k4().m51305dy(new C14093tq<>((short) 1152));
                    c10752zi.m52146k4().m51298c5(new C14093tq<>((short) 1152));
                    m51276to().addItem(c10752zi);
                    break;
                case 5:
                    c10752zi = new C10752zi();
                    c10752zi.m52146k4().m51315k4((byte) 0);
                    c10752zi.m52146k4().m51339x1((byte) 1);
                    c10752zi.m52146k4().m51321kk((byte) 1);
                    c10752zi.m52146k4().m51331to((byte) 1);
                    c10752zi.m52146k4().m51318k4(new C14093tq<>((short) 8226));
                    c10752zi.m52146k4().m51340x1(new C14093tq<>(0));
                    c10752zi.m52146k4().m51322kk(new C14093tq<>((short) 100));
                    c10752zi.m52146k4().m51317k4(new C10661u4(4278190080L));
                    c10752zi.m52146k4().m51332to(new C14093tq<>(1));
                    c10752zi.m52146k4().m51303du(new C14093tq<>((short) 100));
                    c10752zi.m52146k4().m51310h4(new C14093tq<>((short) 20));
                    c10752zi.m52146k4().m51327m9(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51305dy(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51298c5(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51313jd(new C14093tq<>((short) 576));
                    c10752zi.m52146k4().m51316k4(new C10475i3());
                    c10752zi.m52146k4().m51300ck(new C14093tq<>(0));
                    c10752zi.m52146k4().m51302du((byte) 1);
                    c10752zi.m52146k4().m51309h4((byte) 1);
                    c10752zi.m52146k4().m51326m9((byte) 1);
                    c10752zi.m52146k4().m51307fa(new C14093tq<>(0));
                    c10752zi.m52151x1().m51522k4((byte) 0);
                    c10752zi.m52151x1().m51539x1((byte) 0);
                    c10752zi.m52151x1().m51527kk((byte) 0);
                    c10752zi.m52151x1().m51535to((byte) 0);
                    c10752zi.m52151x1().m51513du((byte) 0);
                    c10752zi.m52151x1().m51518h4((byte) 0);
                    c10752zi.m52151x1().m51531m9((byte) 0);
                    c10752zi.m52151x1().m51528kk(new C14093tq<>(65535));
                    c10752zi.m52151x1().m51536to(new C14093tq<>(65535));
                    c10752zi.m52151x1().m51514du(new C14093tq<>(65535));
                    c10752zi.m52151x1().m51519h4(new C14093tq<>((short) 32));
                    c10752zi.m52151x1().m51523k4(new C10661u4(50331648L));
                    c10597puM52151x12 = c10752zi.m52151x1();
                    c14093tq3 = new C14093tq<>((short) 0);
                    c10597puM52151x12.m51532m9(c14093tq3);
                    m51276to().addItem(c10752zi);
                    break;
                case 6:
                    c10752zi = new C10752zi();
                    c10752zi.m52146k4().m51315k4((byte) 0);
                    c10752zi.m52146k4().m51339x1((byte) 1);
                    c10752zi.m52146k4().m51321kk((byte) 1);
                    c10752zi.m52146k4().m51331to((byte) 1);
                    c10752zi.m52146k4().m51318k4(new C14093tq<>((short) 8226));
                    c10752zi.m52146k4().m51340x1(new C14093tq<>(0));
                    c10752zi.m52146k4().m51322kk(new C14093tq<>((short) 100));
                    c10752zi.m52146k4().m51317k4(new C10661u4(4278190080L));
                    c10752zi.m52146k4().m51332to(new C14093tq<>(1));
                    c10752zi.m52146k4().m51303du(new C14093tq<>((short) 100));
                    c10752zi.m52146k4().m51310h4(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51327m9(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51305dy(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51298c5(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51313jd(new C14093tq<>((short) 576));
                    c10752zi.m52146k4().m51316k4(new C10475i3());
                    c10752zi.m52146k4().m51300ck(new C14093tq<>(0));
                    c10752zi.m52146k4().m51302du((byte) 1);
                    c10752zi.m52146k4().m51309h4((byte) 1);
                    c10752zi.m52146k4().m51326m9((byte) 1);
                    c10752zi.m52146k4().m51307fa(new C14093tq<>(0));
                    c10752zi.m52151x1().m51522k4((byte) 0);
                    c10752zi.m52151x1().m51539x1((byte) 0);
                    c10752zi.m52151x1().m51527kk((byte) 0);
                    c10752zi.m52151x1().m51535to((byte) 0);
                    c10752zi.m52151x1().m51513du((byte) 0);
                    c10752zi.m52151x1().m51518h4((byte) 0);
                    c10752zi.m52151x1().m51531m9((byte) 0);
                    c10752zi.m52151x1().m51528kk(new C14093tq<>(65535));
                    c10752zi.m52151x1().m51536to(new C14093tq<>(65535));
                    c10752zi.m52151x1().m51514du(new C14093tq<>(65535));
                    c10752zi.m52151x1().m51519h4(new C14093tq<>((short) 44));
                    c10752zi.m52151x1().m51523k4(new C10661u4(50331648L));
                    c10597puM52151x12 = c10752zi.m52151x1();
                    c14093tq3 = new C14093tq<>((short) 0);
                    c10597puM52151x12.m51532m9(c14093tq3);
                    m51276to().addItem(c10752zi);
                    break;
                case 7:
                    C10752zi c10752zi31 = new C10752zi();
                    c10752zi31.m52146k4().m51315k4((byte) 1);
                    c10752zi31.m52146k4().m51339x1((byte) 1);
                    c10752zi31.m52146k4().m51321kk((byte) 1);
                    c10752zi31.m52146k4().m51331to((byte) 1);
                    c10752zi31.m52146k4().m51318k4(new C14093tq<>((short) 8226));
                    c10752zi31.m52146k4().m51340x1(new C14093tq<>(0));
                    c10752zi31.m52146k4().m51322kk(new C14093tq<>((short) 100));
                    c10752zi31.m52146k4().m51317k4(new C10661u4(4278190080L));
                    c10752zi31.m52146k4().m51332to(new C14093tq<>(0));
                    c10752zi31.m52146k4().m51303du(new C14093tq<>((short) 100));
                    c10752zi31.m52146k4().m51310h4(new C14093tq<>((short) 20));
                    c10752zi31.m52146k4().m51327m9(new C14093tq<>((short) 0));
                    c10752zi31.m52146k4().m51305dy(new C14093tq<>((short) 216));
                    c10752zi31.m52146k4().m51298c5(new C14093tq<>((short) 0));
                    c10752zi31.m52146k4().m51313jd(new C14093tq<>((short) 576));
                    c10752zi31.m52146k4().m51316k4(new C10475i3());
                    c10752zi31.m52146k4().m51300ck(new C14093tq<>(0));
                    c10752zi31.m52146k4().m51302du((byte) 1);
                    c10752zi31.m52146k4().m51309h4((byte) 1);
                    c10752zi31.m52146k4().m51326m9((byte) 1);
                    c10752zi31.m52146k4().m51307fa(new C14093tq<>(0));
                    c10752zi31.m52151x1().m51522k4((byte) 0);
                    c10752zi31.m52151x1().m51539x1((byte) 0);
                    c10752zi31.m52151x1().m51527kk((byte) 0);
                    c10752zi31.m52151x1().m51535to((byte) 0);
                    c10752zi31.m52151x1().m51513du((byte) 0);
                    c10752zi31.m52151x1().m51518h4((byte) 0);
                    c10752zi31.m52151x1().m51531m9((byte) 0);
                    c10752zi31.m52151x1().m51540x1(new C14093tq<>(0));
                    c10752zi31.m52151x1().m51528kk(new C14093tq<>(65535));
                    c10752zi31.m52151x1().m51536to(new C14093tq<>(65535));
                    c10752zi31.m52151x1().m51514du(new C14093tq<>(65535));
                    c10752zi31.m52151x1().m51519h4(new C14093tq<>((short) 28));
                    c10752zi31.m52151x1().m51523k4(new C10661u4(C18163eb.f54662y));
                    c10752zi31.m52151x1().m51532m9(new C14093tq<>((short) 0));
                    m51276to().addItem(c10752zi31);
                    C10752zi c10752zi32 = new C10752zi();
                    c10752zi32.m52146k4().m51318k4(new C14093tq<>((short) 8211));
                    c10752zi32.m52146k4().m51305dy(new C14093tq<>((short) 468));
                    c10752zi32.m52146k4().m51298c5(new C14093tq<>((short) 288));
                    c10752zi32.m52151x1().m51519h4(new C14093tq<>((short) 24));
                    m51276to().addItem(c10752zi32);
                    C10752zi c10752zi33 = new C10752zi();
                    c10752zi33.m52146k4().m51318k4(new C14093tq<>((short) 8226));
                    c10752zi33.m52146k4().m51305dy(new C14093tq<>((short) 720));
                    c10752zi33.m52146k4().m51298c5(new C14093tq<>((short) 576));
                    c10752zi33.m52151x1().m51519h4(new C14093tq<>((short) 20));
                    m51276to().addItem(c10752zi33);
                    C10752zi c10752zi34 = new C10752zi();
                    c10752zi34.m52146k4().m51318k4(new C14093tq<>((short) 8211));
                    c10752zi34.m52146k4().m51305dy(new C14093tq<>((short) 1008));
                    c10752zi34.m52146k4().m51298c5(new C14093tq<>((short) 864));
                    c10752zi34.m52151x1().m51519h4(new C14093tq<>((short) 18));
                    m51276to().addItem(c10752zi34);
                    c10752zi = new C10752zi();
                    c10752zi.m52146k4().m51318k4(new C14093tq<>((short) 187));
                    c10752zi.m52146k4().m51305dy(new C14093tq<>((short) 1296));
                    c10752zi.m52146k4().m51298c5(new C14093tq<>((short) 1152));
                    c10752zi.m52151x1().m51519h4(new C14093tq<>((short) 18));
                    m51276to().addItem(c10752zi);
                    break;
                case 8:
                    c10752zi = new C10752zi();
                    c10752zi.m52146k4().m51315k4((byte) 1);
                    c10752zi.m52146k4().m51339x1((byte) 1);
                    c10752zi.m52146k4().m51321kk((byte) 1);
                    c10752zi.m52146k4().m51331to((byte) 1);
                    c10752zi.m52146k4().m51318k4(new C14093tq<>((short) 8226));
                    c10752zi.m52146k4().m51340x1(new C14093tq<>(0));
                    c10752zi.m52146k4().m51322kk(new C14093tq<>((short) 100));
                    c10752zi.m52146k4().m51317k4(new C10661u4(4278190080L));
                    c10752zi.m52146k4().m51332to(new C14093tq<>(0));
                    c10752zi.m52146k4().m51303du(new C14093tq<>((short) 100));
                    c10752zi.m52146k4().m51310h4(new C14093tq<>((short) 20));
                    c10752zi.m52146k4().m51327m9(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51305dy(new C14093tq<>((short) 216));
                    c10752zi.m52146k4().m51298c5(new C14093tq<>((short) 0));
                    c10752zi.m52146k4().m51313jd(new C14093tq<>((short) 576));
                    c10752zi.m52146k4().m51316k4(new C10475i3());
                    c10752zi.m52146k4().m51300ck(new C14093tq<>(0));
                    c10752zi.m52146k4().m51302du((byte) 1);
                    c10752zi.m52146k4().m51309h4((byte) 1);
                    c10752zi.m52146k4().m51326m9((byte) 1);
                    c10752zi.m52146k4().m51307fa(new C14093tq<>(0));
                    c10752zi.m52151x1().m51522k4((byte) 0);
                    c10752zi.m52151x1().m51539x1((byte) 0);
                    c10752zi.m52151x1().m51527kk((byte) 0);
                    c10752zi.m52151x1().m51535to((byte) 0);
                    c10752zi.m52151x1().m51513du((byte) 0);
                    c10752zi.m52151x1().m51518h4((byte) 0);
                    c10752zi.m52151x1().m51531m9((byte) 0);
                    c10752zi.m52151x1().m51540x1(new C14093tq<>(0));
                    c10752zi.m52151x1().m51528kk(new C14093tq<>(65535));
                    c10752zi.m52151x1().m51536to(new C14093tq<>(65535));
                    c10752zi.m52151x1().m51514du(new C14093tq<>(65535));
                    c10752zi.m52151x1().m51519h4(new C14093tq<>((short) 24));
                    c10752zi.m52151x1().m51523k4(new C10661u4(C18163eb.f54662y));
                    c10597puM52151x12 = c10752zi.m52151x1();
                    c14093tq3 = new C14093tq<>((short) 0);
                    c10597puM52151x12.m51532m9(c14093tq3);
                    m51276to().addItem(c10752zi);
                    break;
            }
            i2 = 0;
        }
        for (int i3 = i2; i3 < m51276to().size(); i3++) {
            m51276to().get_Item(i3).m52147k4(i3 & 65535);
        }
        this.f37215k4 = true;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37217x1 = c3134k4.m13382u4();
        m51276to().clear();
        for (int i = 0; i < (this.f37217x1 & 65535); i++) {
            C10752zi c10752zi = new C10752zi();
            c10752zi.m52148k4(c3134k4, m51409um().m51922kk());
            m51276to().addItem(c10752zi);
        }
        this.f37215k4 = false;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        int size = m51276to().size();
        c3149x1.m13448k4((short) size);
        for (int i = 0; i < size; i++) {
            m51276to().get_Item(i).m52149k4(c3149x1, i, m51409um().m51922kk());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51273k4(C10536m5 c10536m5, boolean z) {
        if (c10536m5 == null) {
            return;
        }
        if (!z) {
            if (m51409um().m51922kk() != c10536m5.m51409um().m51922kk()) {
                throw new ArgumentException("Current and specified TextMasterStyle atoms have different text types.");
            }
            if (m51409um().m51922kk() != 0 && m51409um().m51922kk() != 1 && m51409um().m51922kk() != 4) {
                throw new InvalidOperationException("Only Title, Body and Other text tipes can be updated.");
            }
        }
        for (int i = 0; i < (c10536m5.m51277x1() & 65535); i++) {
            if (m51276to().size() > i) {
                m51276to().get_Item(i).m52150k4(c10536m5.m51276to().get_Item(i));
            } else {
                C10752zi c10752zi = new C10752zi(0);
                c10752zi.m52150k4(c10536m5.m51276to().get_Item(i));
                m51276to().addItem(c10752zi);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51274k4(boolean z) {
        this.f37215k4 = z;
    }
}
