package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.he */
/* JADX INFO: loaded from: classes5.dex */
public class C13910he implements IGenericEqualityComparer<String> {

    /* JADX INFO: renamed from: k4 */
    private int f46572k4 = C14052dq.m66560du();

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public boolean equals(Object obj, Object obj2) {
        return m65454k4((String) obj, (String) obj2);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public int hashCode(Object obj) {
        return m65453k4((String) obj);
    }

    /* JADX INFO: renamed from: k4 */
    public int m65453k4(String str) {
        int iCharAt = this.f46572k4;
        for (int i = 0; i < str.length(); i++) {
            iCharAt += (iCharAt << 7) ^ str.charAt(i);
        }
        int i2 = iCharAt - (iCharAt >> 17);
        int i3 = i2 - (i2 >> 11);
        return i3 - (i3 >> 5);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public int hashCodeT(String str) {
        return m65453k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m65454k4(String str, String str2) {
        return C14113y2.m67432to(str, str2, (short) 4);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public boolean equalsT(String str, String str2) {
        return m65454k4(str, str2);
    }
}
