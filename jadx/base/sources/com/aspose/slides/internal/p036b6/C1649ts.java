package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.EditingLanguage;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.ts */
/* JADX INFO: loaded from: classes3.dex */
public class C1649ts extends C1634k4 {
    public C1649ts(long j, long j2, long j3) {
        super("name", j, j2, j3);
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public long mo8701k4(C1627f9 c1627f9) {
        Dictionary<String, Object> dictionaryM8777k4 = c1627f9.m8777k4("name");
        List list = new List();
        Dictionary.Enumerator<String, Object> it = dictionaryM8777k4.iterator();
        int length = 6;
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                Integer[] numArr = {65535};
                C1662xk.m9039x1().m9040k4().tryGetValue(next.getKey(), numArr);
                int iIntValue = numArr[0].intValue();
                byte[] bArrMo26677to = AbstractC6747ar.m26635ix().mo26677to((String) next.getValue());
                byte[] bArrM9018k4 = C1656vj.m9018k4((String) next.getValue());
                if ((iIntValue & 65535) != 65535) {
                    C1621c6 c1621c6 = new C1621c6(1, 0, 0, iIntValue, 0, 0);
                    c1621c6.m8729k4(bArrMo26677to);
                    C1621c6 c1621c62 = new C1621c6(3, 1, EditingLanguage.ENGLISH_US, iIntValue, 0, 0);
                    c1621c62.m8729k4(bArrM9018k4);
                    list.addItem(c1621c6);
                    list.addItem(c1621c62);
                    length = bArrMo26677to.length + 24 + bArrM9018k4.length + length;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        list.sort();
        c1627f9.m8775h4().get_Item("name").m8840k4("names", list.toArray(new C1621c6[0]));
        return ((long) length) & 4294967295L;
    }

    public C1649ts(Dictionary<String, Object> dictionary) {
        super("name");
        this.f6307dy = dictionary;
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public Dictionary<String, Object> mo8703k4(C1636kp c1636kp, C1627f9 c1627f9) {
        int i;
        int i2;
        int i3;
        int i4;
        c1636kp.m8868k4(this.f6313x1);
        c1636kp.m8874to();
        int iM8874to = c1636kp.m8874to();
        int iM8874to2 = c1636kp.m8874to();
        List list = new List();
        int i5 = 0;
        while (true) {
            i = 65535;
            i2 = iM8874to & 65535;
            if (i5 >= i2) {
                break;
            }
            list.addItem(new C1621c6(c1636kp.m8874to(), c1636kp.m8874to(), c1636kp.m8874to(), c1636kp.m8874to(), c1636kp.m8874to(), c1636kp.m8874to()));
            i5++;
        }
        long j = 4294967295L;
        long j2 = (this.f6313x1 & 4294967295L) + ((long) (iM8874to2 & 65535));
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i3 = EditingLanguage.ENGLISH_US;
            i4 = 3;
            if (i6 >= i2) {
                break;
            }
            C1621c6 c1621c6 = (C1621c6) list.get_Item(i6);
            long j3 = j;
            int i8 = i;
            int i9 = i2;
            c1621c6.m8729k4(c1636kp.m8869k4(((j2 & j) + ((long) (c1621c6.m8726h4() & i))) & j3, c1621c6.m8725du() & i));
            if (i7 == 0 && c1621c6.m8727k4() == 3 && c1621c6.m8733x1() == 1 && (c1621c6.m8730kk() & i8) == 1033) {
                i7 = 1;
            }
            i6++;
            i = i8;
            i2 = i9;
            j = j3;
        }
        int i10 = i;
        int i11 = i2;
        if (i7 == 0) {
            i4 = 1;
            i3 = 0;
        }
        Dictionary<String, Object> dictionary = new Dictionary<>();
        for (int i12 = 0; i12 < i11; i12++) {
            C1621c6 c1621c62 = (C1621c6) list.get_Item(i12);
            if (c1621c62.m8727k4() == i4 && c1621c62.m8733x1() == i7 && c1621c62.m8730kk() == i3 && C1662xk.m9039x1().m9041k4(c1621c62.m8732to())) {
                String strM9042x1 = C1662xk.m9039x1().m9042x1(c1621c62.m8732to());
                int i13 = i3 & i10;
                byte[] bArrM8731m9 = c1621c62.m8731m9();
                dictionary.addItem(strM9042x1, i13 == 0 ? C1656vj.m9017k4(bArrM8731m9) : C1656vj.m9020x1(bArrM8731m9));
            }
        }
        return dictionary;
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public void mo8702k4(C1655vh c1655vh, C1627f9 c1627f9) {
        C1621c6[] c1621c6Arr = (C1621c6[]) C7019kk.m27458kk(c1627f9.m8775h4().get_Item("name").m8837k4("names"), C1621c6[].class);
        c1655vh.m8995k4(0);
        c1655vh.m8995k4(c1621c6Arr.length & 65535);
        c1655vh.m8995k4(((c1621c6Arr.length * 12) + 6) & 65535);
        int length = 0;
        for (C1621c6 c1621c6 : c1621c6Arr) {
            c1655vh.m8995k4(c1621c6.m8727k4());
            c1655vh.m8995k4(c1621c6.m8733x1());
            c1655vh.m8995k4(c1621c6.m8730kk());
            c1655vh.m8995k4(c1621c6.m8732to());
            c1655vh.m8995k4(c1621c6.m8731m9().length & 65535);
            c1655vh.m8995k4(length & 65535);
            length += c1621c6.m8731m9().length;
        }
        for (C1621c6 c1621c62 : c1621c6Arr) {
            c1655vh.m9007k4(c1621c62.m8731m9());
        }
    }
}
