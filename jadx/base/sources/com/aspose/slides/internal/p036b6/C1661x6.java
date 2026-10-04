package com.aspose.slides.internal.p036b6;

import android.support.v4.media.session.PlaybackStateCompat;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.x6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1661x6 extends C1634k4 {
    public C1661x6(long j, long j2, long j3) {
        super("CFF", j, j2, j3);
    }

    /* JADX INFO: renamed from: k4 */
    private long m9034k4(List<Object> list) {
        if (list.size() < 1240) {
            return 107L;
        }
        if (list.size() < 33900) {
            return 1131L;
        }
        return PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
    }

    /* JADX INFO: renamed from: x1 */
    private C1652up m9038x1(C1636kp c1636kp, long j) {
        return m9037k4(c1636kp, j, false);
    }

    /* JADX INFO: renamed from: k4 */
    private long m9035k4(C1636kp c1636kp, long j) {
        long jM8870kk = 0;
        for (int i = 0; i < (j & 4294967295L); i++) {
            jM8870kk = ((((jM8870kk & 4294967295L) << 8) & 4294967295L) + ((long) (c1636kp.m8870kk() & 255))) & 4294967295L;
        }
        return jM8870kk;
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public Dictionary<String, Object> mo8703k4(C1636kp c1636kp, C1627f9 c1627f9) {
        C1652up c1652up;
        Dictionary<String, Object[]> dictionaryM8887x1;
        int i;
        String[] strArrM8886kk;
        String[] strArrM8891x1;
        Dictionary<String, Object> dictionary = new Dictionary<>();
        c1636kp.m8868k4(this.f6313x1);
        C1628fa c1628faM9036k4 = m9036k4(c1636kp);
        C1652up c1652upM9038x1 = m9038x1(c1636kp, m9037k4(c1636kp, c1628faM9036k4.m8795x1(), true).m8970k4());
        C1652up c1652upM9037k4 = m9037k4(c1636kp, c1652upM9038x1.m8970k4(), true);
        C1652up c1652upM9038x12 = m9038x1(c1636kp, c1652upM9037k4.m8970k4());
        char c = 0;
        Object[] array = c1652upM9038x12.m8973x1().toArray(new Object[0]);
        long jM9034k4 = m9034k4(c1652upM9038x12.m8973x1());
        dictionary.addItem("head", c1628faM9036k4);
        dictionary.addItem("gsubrs", array);
        dictionary.addItem("gsubrsBias", Long.valueOf(jM9034k4));
        C1636kp c1636kp2 = new C1636kp((byte[]) C7019kk.m27452k4(c1652upM9038x1.m8973x1().get_Item(0), byte[].class));
        Dictionary<String, Object[]> dictionaryM8883k4 = C1637ks.m8883k4(c1636kp2, 0L, c1636kp2.m8877x1(), c1652upM9037k4.m8973x1().toArray(new Object[0]));
        Object obj = dictionaryM8883k4.get_Item("private")[0];
        if (obj == null) {
            obj = 0;
        }
        Class cls = Integer.TYPE;
        int iIntValue = ((Integer) C7019kk.m27464to(obj, cls)).intValue();
        if (iIntValue != 0) {
            int iIntValue2 = ((Integer) C7019kk.m27464to(dictionaryM8883k4.get_Item("private")[1], cls)).intValue() + ((int) this.f6313x1);
            c1652up = c1652upM9037k4;
            i = iIntValue2;
            dictionaryM8887x1 = C1637ks.m8887x1(c1636kp, ((long) iIntValue2) & 4294967295L, ((long) iIntValue) & 4294967295L, c1652up.m8973x1().toArray(new Object[0]));
            dictionary.addItem("defaultWidthX", dictionaryM8887x1.get_Item("defaultWidthX")[0]);
            dictionary.addItem("nominalWidthX", dictionaryM8887x1.get_Item("nominalWidthX")[0]);
        } else {
            c1652up = c1652upM9037k4;
            dictionary.addItem("defaultWidthX", 0);
            dictionary.addItem("nominalWidthX", 0);
            dictionaryM8887x1 = null;
            i = 0;
        }
        if (dictionaryM8887x1 == null || !dictionaryM8887x1.containsKey("subrs") || dictionaryM8887x1.get_Item("subrs").length <= 0 || ((Integer) C7019kk.m27464to(dictionaryM8887x1.get_Item("subrs")[0], cls)).intValue() == 0) {
            dictionary.addItem("subrs", new Object[0]);
            dictionary.addItem("subrsBias", 0);
        } else {
            C1652up c1652upM9038x13 = m9038x1(c1636kp, ((long) (((Integer) C7019kk.m27464to(dictionaryM8887x1.get_Item("subrs")[0], cls)).intValue() + i)) & 4294967295L);
            Object[] array2 = c1652upM9038x13.m8973x1().toArray(new Object[0]);
            long jM9034k42 = m9034k4(c1652upM9038x13.m8973x1());
            dictionary.addItem("subrs", array2);
            dictionary.addItem("subrsBias", Long.valueOf(jM9034k42));
        }
        C1652up c1652upM9038x14 = m9038x1(c1636kp, ((this.f6313x1 & 4294967295L) + ((long) ((Integer) dictionaryM8883k4.get_Item("charStrings")[0]).intValue())) & 4294967295L);
        long size = c1652upM9038x14.m8973x1().size();
        long j = size & 4294967295L;
        if (((Integer) C7019kk.m27464to(dictionaryM8883k4.get_Item("charset")[0], cls)).intValue() < 3) {
            strArrM8886kk = C1643rv.m8903k4();
        } else {
            c = 0;
            strArrM8886kk = C1637ks.m8886kk(c1636kp, ((this.f6313x1 & 4294967295L) + ((long) ((Integer) dictionaryM8883k4.get_Item("charset")[0]).intValue())) & 4294967295L, j, c1652up.m8973x1().toArray(new Object[0]));
        }
        dictionary.addItem("charset", strArrM8886kk);
        if (((Integer) C7019kk.m27464to(dictionaryM8883k4.get_Item("encoding")[c], cls)).intValue() == 0) {
            strArrM8891x1 = C1639m9.m8890k4();
        } else {
            strArrM8891x1 = ((Integer) C7019kk.m27464to(dictionaryM8883k4.get_Item("encoding")[c], cls)).intValue() == 1 ? C1639m9.m8891x1() : C1637ks.m8885k4(c1636kp, ((this.f6313x1 & 4294967295L) + ((long) ((Integer) dictionaryM8883k4.get_Item("encoding")[c]).intValue())) & 4294967295L);
        }
        dictionary.addItem("encoding", strArrM8891x1);
        List list = new List();
        for (long j2 = 0; (j2 & 4294967295L) < (size & 4294967295L); j2++) {
            int i2 = (int) j2;
            C1625dy c1625dyM8828k4 = C1633jd.m8828k4(c1652upM9038x14.m8973x1().get_Item(i2), dictionary, j2);
            c1625dyM8828k4.m8762k4(strArrM8886kk[i2]);
            list.addItem(c1625dyM8828k4);
        }
        c1627f9.m8782k4((C1625dy[]) list.toArray(new C1625dy[0]));
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    private C1628fa m9036k4(C1636kp c1636kp) {
        C1628fa c1628fa = new C1628fa();
        c1628fa.m8792k4(c1636kp.m8865k4());
        c1628fa.m8797x1(((c1628fa.m8790k4() & 4294967295L) + 4) & 4294967295L);
        c1628fa.m8791k4(c1636kp.m8870kk());
        c1628fa.m8796x1(c1636kp.m8870kk());
        c1628fa.m8793kk(c1636kp.m8870kk());
        c1628fa.m8794to(c1636kp.m8870kk());
        return c1628fa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.aspose.slides.internal.b6.up] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.aspose.slides.internal.n9.ar] */
    /* JADX INFO: renamed from: k4 */
    private C1652up m9037k4(C1636kp c1636kp, long j, boolean z) {
        c1636kp.m8868k4(j & 4294967295L);
        long jM8865k4 = c1636kp.m8865k4();
        List list = new List();
        List list2 = new List();
        int iM8874to = c1636kp.m8874to() & 65535;
        if (iM8874to != 0) {
            byte bM8870kk = c1636kp.m8870kk();
            int i = iM8874to + 1;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                list.addItem(Long.valueOf(m9035k4(c1636kp, bM8870kk & 255)));
            }
            while (i2 < iM8874to) {
                int i4 = i2 + 1;
                ?? M8879x1 = c1636kp.m8879x1(((((Long) list.get_Item(i4)).longValue() & 4294967295L) - (((Long) list.get_Item(i2)).longValue() & 4294967295L)) & 4294967295L);
                if (z) {
                    M8879x1 = AbstractC6747ar.m26635ix().m26681x1(M8879x1);
                }
                list2.addItem(M8879x1);
                i2 = i4;
            }
        }
        ?? c1652up = new C1652up();
        c1652up.m8972k4(list2);
        c1652up.m8971k4(jM8865k4);
        c1652up.m8974x1(c1636kp.m8865k4());
        return c1652up;
    }
}
