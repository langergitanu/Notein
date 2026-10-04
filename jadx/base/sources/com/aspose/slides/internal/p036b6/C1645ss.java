package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p437u9.C11292du;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.ss */
/* JADX INFO: loaded from: classes3.dex */
public class C1645ss extends C1634k4 {
    public C1645ss(long j, long j2, long j3) {
        super("post", j, j2, j3);
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public long mo8701k4(C1627f9 c1627f9) {
        int iValueOf;
        int length = c1627f9.m8785m9().length;
        if (c1627f9.m8777k4("post").get_Item("format") == null) {
            c1627f9.m8777k4("post").set_Item("format", Double.valueOf(3.0d));
        }
        c1627f9.m8777k4("post").set_Item("maxMemType1", Long.valueOf(((long) length) & 4294967295L));
        Object obj = c1627f9.m8777k4("post").get_Item("format");
        Class cls = Double.TYPE;
        if (((Double) C7019kk.m27464to(obj, cls)).doubleValue() == 3.0d || ((Double) C7019kk.m27464to(c1627f9.m8777k4("post").get_Item("format"), cls)).doubleValue() == 1.0d) {
            return 32L;
        }
        int length2 = (length * 2) + 34;
        List list = new List();
        List list2 = new List();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 == 0) {
                iValueOf = 0;
            } else {
                C1625dy c1625dy = c1627f9.m8785m9()[i2];
                int iM9044k4 = C1663xw.m9043k4().m9044k4(c1625dy.m8764kk().size() > 0 ? c1625dy.m8764kk().get_Item(0).intValue() : 0);
                if (iM9044k4 != -1) {
                    iValueOf = Integer.valueOf(iM9044k4);
                } else {
                    String strM8752ck = c1625dy.m8752ck();
                    if (C14113y2.m67411k4(strM8752ck) || strM8752ck.charAt(0) < ' ') {
                        list2.addItem(Integer.valueOf(i + StyleIdentifier.COLORFUL_LIST_ACCENT_6));
                        list.addItem(new Byte[]{(byte) 0});
                        length2++;
                        i++;
                    } else {
                        int i3 = i + 1;
                        list2.addItem(Integer.valueOf(i + StyleIdentifier.COLORFUL_LIST_ACCENT_6));
                        byte[] bArrM9021x1 = C1656vj.m9021x1(strM8752ck);
                        list.addItem(C11292du.m54268k4(bArrM9021x1));
                        length2 += bArrM9021x1.length;
                        i = i3;
                    }
                }
            }
            list2.addItem(iValueOf);
        }
        c1627f9.m8775h4().get_Item("post").m8840k4("nameIndex", list2.toArray(new Integer[0]));
        c1627f9.m8775h4().get_Item("post").m8840k4("names", list.toArray(new Byte[0]));
        return ((long) length2) & 4294967295L;
    }

    public C1645ss(Dictionary<String, Object> dictionary) {
        super("post");
        this.f6307dy = dictionary;
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public Dictionary<String, Object> mo8703k4(C1636kp c1636kp, C1627f9 c1627f9) {
        c1636kp.m8868k4(this.f6313x1);
        double dM8858dy = c1636kp.m8858dy();
        Dictionary<String, Object> dictionaryMo8703k4 = C1634k4.m8834k4(c1636kp, c1627f9, "posthead", this.f6313x1, this.f6310kk, this.f6306du).mo8703k4(c1636kp, c1627f9);
        if (dM8858dy != 2.0d) {
            if (dM8858dy == 2.5d) {
                dictionaryMo8703k4.set_Item("format", 3);
            }
            return dictionaryMo8703k4;
        }
        int iM8874to = c1636kp.m8874to();
        List list = new List();
        for (int i = 0; i < (65535 & iM8874to); i++) {
            list.addItem(Integer.valueOf(c1636kp.m8874to()));
        }
        byte[] bArrM8869k4 = c1636kp.m8869k4(c1636kp.m8865k4(), ((this.f6310kk & 4294967295L) - (((c1636kp.m8865k4() & 4294967295L) - (this.f6313x1 & 4294967295L)) & 4294967295L)) & 4294967295L);
        dictionaryMo8703k4.set_Item("nameIndex", list);
        dictionaryMo8703k4.set_Item("names", C1656vj.m9019kk(bArrM8869k4));
        return dictionaryMo8703k4;
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public void mo8702k4(C1655vh c1655vh, C1627f9 c1627f9) {
        Dictionary<String, Object> dictionaryM8777k4 = c1627f9.m8777k4("post");
        Object obj = dictionaryM8777k4.get_Item("format");
        Class cls = Double.TYPE;
        c1655vh.m8993k4(((Double) C7019kk.m27464to(obj, cls)).doubleValue());
        c1655vh.m8993k4(((Double) C7019kk.m27464to(dictionaryM8777k4.get_Item("italicAngle"), cls)).doubleValue());
        Object obj2 = dictionaryM8777k4.get_Item("underlinePosition");
        Class cls2 = Short.TYPE;
        c1655vh.m9005k4(((Short) C7019kk.m27464to(obj2, cls2)).shortValue());
        c1655vh.m9005k4(((Short) C7019kk.m27464to(dictionaryM8777k4.get_Item("underlineThickness"), cls2)).shortValue());
        Object obj3 = dictionaryM8777k4.get_Item("isFixedPitch");
        Class cls3 = Long.TYPE;
        c1655vh.m8999k4(((Long) C7019kk.m27464to(obj3, cls3)).longValue());
        c1655vh.m8999k4(((Long) C7019kk.m27464to(dictionaryM8777k4.get_Item("minMemType42"), cls3)).longValue());
        c1655vh.m8999k4(((Long) C7019kk.m27464to(dictionaryM8777k4.get_Item("maxMemType42"), cls3)).longValue());
        c1655vh.m8999k4(((Long) C7019kk.m27464to(dictionaryM8777k4.get_Item("minMemType1"), cls3)).longValue());
        c1655vh.m8999k4(((Long) C7019kk.m27464to(dictionaryM8777k4.get_Item("maxMemType1"), cls3)).longValue());
        if (((Double) C7019kk.m27464to(dictionaryM8777k4.get_Item("format"), cls)).doubleValue() == 2.0d) {
            c1655vh.m8995k4(c1627f9.m8785m9().length & 65535);
            for (int i : (int[]) C7019kk.m27458kk(c1627f9.m8775h4().get_Item("post").m8837k4("nameIndex"), int[].class)) {
                c1655vh.m8995k4(i & 65535);
            }
            for (byte[] bArr : (byte[][]) C7019kk.m27458kk(c1627f9.m8775h4().get_Item("post").m8837k4("names"), byte[][].class)) {
                c1655vh.m9007k4(bArr);
            }
        }
    }
}
