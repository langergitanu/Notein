package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.cx */
/* JADX INFO: loaded from: classes4.dex */
public class C10393cx extends AbstractC10376bv {
    public C10393cx() {
        m51409um().m51917k4(C7019kk.m27457kk((Object) 4014, 9));
    }

    /* JADX INFO: renamed from: k4 */
    public C10704x2 m50574k4(long j, short s) {
        short s2 = (short) ((s & 65520) >> 4);
        int i = 0;
        while (i < m50513yj().size()) {
            AbstractC10571o4 abstractC10571o4 = m50513yj().get_Item(i);
            C10687w2 c10687w2 = abstractC10571o4 instanceof C10687w2 ? (C10687w2) abstractC10571o4 : null;
            if (c10687w2 != null) {
                if (c10687w2.m51891x1() == j && c10687w2.m51409um().m51922kk() == s2 && i < m50513yj().size() - 1) {
                    AbstractC10571o4 abstractC10571o42 = m50513yj().get_Item(i + 1);
                    if (abstractC10571o42 instanceof C10704x2) {
                        return (C10704x2) abstractC10571o42;
                    }
                    return null;
                }
                i++;
            }
            i++;
        }
        return null;
    }
}
