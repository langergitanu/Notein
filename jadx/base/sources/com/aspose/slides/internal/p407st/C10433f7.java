package com.aspose.slides.internal.p407st;

import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.f7 */
/* JADX INFO: loaded from: classes4.dex */
public class C10433f7 extends AbstractC10376bv {
    public C10433f7() {
        m51409um().m51917k4(EditingLanguage.ENGLISH_US);
    }

    /* JADX INFO: renamed from: du */
    public AbstractC10376bv m50779du(long j) {
        C10662u5 c10662u5;
        C10572o9 c10572o9M51796x1;
        for (int i = 0; i < m50513yj().size(); i++) {
            if ((m50513yj().get_Item(i) instanceof C10662u5) && (c10572o9M51796x1 = (c10662u5 = (C10662u5) m50513yj().get_Item(i)).m51796x1()) != null && c10572o9M51796x1.m51419x1() == j) {
                return c10662u5;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h4 */
    public C10580ou m50780h4(long j) {
        int i = 0;
        while (true) {
            if (i >= m50513yj().size()) {
                return null;
            }
            AbstractC10571o4 abstractC10571o4 = m50513yj().get_Item(i);
            C10580ou c10580ou = abstractC10571o4 instanceof C10580ou ? (C10580ou) abstractC10571o4 : null;
            if (c10580ou != null && c10580ou.m51449x1() != null && c10580ou.m51449x1().m50448x1() == j) {
                return c10580ou;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public InterfaceC10392cw m50781k4(long j) {
        int i = 0;
        while (true) {
            if (i >= m50513yj().size()) {
                return null;
            }
            Object obj = m50513yj().get_Item(i);
            InterfaceC10392cw interfaceC10392cw = obj instanceof InterfaceC10392cw ? (InterfaceC10392cw) obj : null;
            if (interfaceC10392cw != null && interfaceC10392cw.mo50535to() != null && interfaceC10392cw.mo50535to().m50732kk() == j) {
                return interfaceC10392cw;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC10376bv m50782kk(long j) {
        C10366b5 c10366b5;
        C10572o9 c10572o9M50455x1;
        for (int i = 0; i < m50513yj().size(); i++) {
            if (m50513yj().get_Item(i) instanceof C10617r7) {
                C10617r7 c10617r7 = (C10617r7) m50513yj().get_Item(i);
                C10572o9 c10572o9M51618x1 = c10617r7.m51618x1();
                if (c10572o9M51618x1 != null && c10572o9M51618x1.m51419x1() == j) {
                    return c10617r7;
                }
            } else if ((m50513yj().get_Item(i) instanceof C10366b5) && (c10572o9M50455x1 = (c10366b5 = (C10366b5) m50513yj().get_Item(i)).m50455x1()) != null && c10572o9M50455x1.m51419x1() == j) {
                return c10366b5;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    public AbstractC10376bv m50783to(long j) {
        C10560nh c10560nh;
        C10572o9 c10572o9M51369x1;
        for (int i = 0; i < m50513yj().size(); i++) {
            if ((m50513yj().get_Item(i) instanceof C10560nh) && (c10572o9M51369x1 = (c10560nh = (C10560nh) m50513yj().get_Item(i)).m51369x1()) != null && c10572o9M51369x1.m51419x1() == j) {
                return c10560nh;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public C10396d3 m50784x1(long j) {
        C10572o9 c10572o9M50621x1;
        int i = 0;
        while (true) {
            C10396d3 c10396d3M51968x1 = null;
            if (i >= m50513yj().size()) {
                return null;
            }
            if ((m50513yj().get_Item(i) instanceof C10375bu) || (m50513yj().get_Item(i) instanceof C10369bg) || (m50513yj().get_Item(i) instanceof C10705x3)) {
                if (m50513yj().get_Item(i) instanceof C10375bu) {
                    c10396d3M51968x1 = ((C10375bu) m50513yj().get_Item(i)).m50502x1();
                } else if (m50513yj().get_Item(i) instanceof C10369bg) {
                    c10396d3M51968x1 = ((C10369bg) m50513yj().get_Item(i)).m50466x1();
                } else if (m50513yj().get_Item(i) instanceof C10705x3) {
                    c10396d3M51968x1 = ((C10705x3) m50513yj().get_Item(i)).m51968x1();
                }
                if (c10396d3M51968x1 != null && (c10572o9M50621x1 = c10396d3M51968x1.m50621x1()) != null && c10572o9M50621x1.m51419x1() == j) {
                    return c10396d3M51968x1;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public C10404dl m50785x1() {
        return (C10404dl) m50508kk(EditingLanguage.SPANISH_SPAIN_TRADITIONAL_SORT);
    }
}
