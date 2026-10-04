package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1634k4 {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f6304jd = new C7017h4("cff", "os/2", "cmap", "head", "hhea", "hmtx", "maxp", "name", "post", "posthead", "fftm", "gdef", "gsub", "cvt", "fpgm", "gasp", "gpos", "kern", "prep", "directory", "glyf", "loca");

    /* JADX INFO: renamed from: c5 */
    private byte[] f6305c5;

    /* JADX INFO: renamed from: du */
    protected long f6306du;

    /* JADX INFO: renamed from: dy */
    protected Dictionary<String, Object> f6307dy;

    /* JADX INFO: renamed from: h4 */
    protected Dictionary<String, Integer> f6308h4;

    /* JADX INFO: renamed from: k4 */
    protected String f6309k4;

    /* JADX INFO: renamed from: kk */
    protected long f6310kk;

    /* JADX INFO: renamed from: m9 */
    protected Dictionary<String, Long> f6311m9;

    /* JADX INFO: renamed from: to */
    protected long f6312to;

    /* JADX INFO: renamed from: x1 */
    protected long f6313x1;

    public C1634k4(String str) {
        this(str, 0L, 0L, 0L);
    }

    /* JADX INFO: renamed from: du */
    public final long m8836du() {
        return this.f6312to;
    }

    /* JADX INFO: renamed from: k4 */
    public long mo8701k4(C1627f9 c1627f9) {
        long jLongValue;
        long jM8902k4;
        long j;
        Dictionary<String, Object> dictionary = this.f6307dy;
        if (dictionary == null) {
            byte[] bArr = this.f6305c5;
            if (bArr != null) {
                return ((long) bArr.length) & 4294967295L;
            }
            return 0L;
        }
        Dictionary.Enumerator<String, Object> it = dictionary.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                String str = (String) next.getKey();
                int iIntValue = this.f6308h4.get_Item((String) next.getKey()).intValue();
                if (this.f6311m9 != null) {
                    Long[] lArr = {0L};
                    this.f6311m9.tryGetValue(str, lArr);
                    jLongValue = lArr[0].longValue();
                } else {
                    jLongValue = 0;
                }
                if (iIntValue == 11 || iIntValue == 12) {
                    jM8902k4 = jLongValue & 4294967295L;
                    if (jM8902k4 == 0) {
                        throw new Exception("Data size is undefined.");
                    }
                    j = j2 & 4294967295L;
                } else {
                    j = j2 & 4294967295L;
                    jM8902k4 = C1642qq.m8902k4(iIntValue) & 4294967295L;
                }
                j2 = (j + jM8902k4) & 4294967295L;
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return j2;
    }

    /* JADX INFO: renamed from: kk */
    public final long m8841kk() {
        return this.f6306du;
    }

    /* JADX INFO: renamed from: to */
    public final long m8843to() {
        return this.f6310kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m8845x1() {
        return this.f6313x1;
    }

    public C1634k4(String str, long j, long j2, long j3) {
        this.f6309k4 = str;
        this.f6313x1 = j;
        this.f6310kk = j2;
        this.f6306du = j3;
    }

    /* JADX INFO: renamed from: k4 */
    public Dictionary<String, Object> mo8703k4(C1636kp c1636kp, C1627f9 c1627f9) {
        Dictionary<String, Object> dictionary;
        Object objValueOf;
        c1636kp.m8868k4(this.f6313x1);
        if (this.f6308h4 == null) {
            this.f6305c5 = c1636kp.m8869k4(this.f6313x1, this.f6310kk);
            Dictionary<String, Object> dictionary2 = new Dictionary<>();
            dictionary2.addItem("", this.f6305c5);
            return dictionary2;
        }
        this.f6307dy = new Dictionary<>();
        Dictionary.Enumerator<String, Integer> it = this.f6308h4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                String str = (String) next.getKey();
                int iIntValue = ((Integer) next.getValue()).intValue();
                boolean z = true;
                switch (iIntValue) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 13:
                        this.f6307dy.addItem(str, c1636kp.m8866k4(iIntValue, c1636kp.m8865k4()));
                        continue;
                    case 6:
                        dictionary = this.f6307dy;
                        objValueOf = Double.valueOf(c1636kp.m8858dy());
                        break;
                    case 7:
                    case 8:
                    default:
                        throw new Exception("Unknown data structure type.");
                    case 9:
                        dictionary = this.f6307dy;
                        objValueOf = c1636kp.m8862jd().Clone();
                        break;
                    case 10:
                        dictionary = this.f6307dy;
                        objValueOf = Character.valueOf(c1636kp.m8854c5());
                        break;
                    case 11:
                        Long[] lArr = {0L};
                        Dictionary<String, Long> dictionary3 = this.f6311m9;
                        if (dictionary3 == null || !dictionary3.tryGetValue(str, lArr)) {
                            z = false;
                        }
                        long jLongValue = lArr[0].longValue();
                        if (!z) {
                            throw new Exception(C14113y2.m67408k4("Unknown size for DataType.String structure: ", str, "."));
                        }
                        dictionary = this.f6307dy;
                        objValueOf = c1636kp.m8878x1(c1636kp.m8865k4(), jLongValue);
                        break;
                        break;
                    case 12:
                        Long[] lArr2 = {0L};
                        Dictionary<String, Long> dictionary4 = this.f6311m9;
                        if (dictionary4 == null || !dictionary4.tryGetValue(str, lArr2)) {
                            z = false;
                        }
                        long jLongValue2 = lArr2[0].longValue();
                        if (!z) {
                            throw new Exception(C14113y2.m67408k4("Unknown size for DataType.Bytes structure: ", str, "."));
                        }
                        dictionary = this.f6307dy;
                        objValueOf = c1636kp.m8869k4(c1636kp.m8865k4(), jLongValue2);
                        break;
                        break;
                }
                dictionary.addItem(str, objValueOf);
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return new Dictionary<>(this.f6307dy);
    }

    /* JADX INFO: renamed from: kk */
    public final void m8842kk(long j) {
        this.f6310kk = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m8844to(long j) {
        this.f6312to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8846x1(long j) {
        this.f6306du = j;
    }

    /* JADX INFO: renamed from: k4 */
    public static C1634k4 m8834k4(C1636kp c1636kp, C1627f9 c1627f9, String str, long j, long j2, long j3) {
        switch (f6304jd.m27428k4(C14113y2.m67368h4(str))) {
            case 0:
                return new C1661x6(j, j2, j3);
            case 1:
                int iM8876x1 = c1636kp.m8876x1(new C14093tq<>(Long.valueOf(j))) & 65535;
                return iM8876x1 == 0 ? new C1626e0(j, j2, j3) : iM8876x1 == 1 ? new C1619bz(j, j2, j3) : new C1641qm(j, j2, j3);
            case 2:
                return new C1653uz(j, j2, j3);
            case 3:
                return new C1638lr(j, j2, j3);
            case 4:
                return new C1664yd(j, j2, j3);
            case 5:
                return new C1617b3(j, j2, j3);
            case 6:
                return new C1623dq(j, j2, j3);
            case 7:
                return new C1649ts(j, j2, j3);
            case 8:
                return new C1645ss(j, j2, j3);
            case 9:
                return new C1658wp(j, j2, j3);
            case 10:
            case 11:
            case 12:
                return new C1634k4(str, j, j2, j3);
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return new C1634k4(str, j, j2, j3);
            case 19:
                throw new Exception("Can't recursively create directory table.");
            default:
                throw new Exception("Unknown table.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C1634k4 m8835k4(String str, Dictionary<String, Object> dictionary) {
        switch (f6304jd.m27428k4(C14113y2.m67368h4(str))) {
            case 1:
                int iIntValue = ((Integer) C7019kk.m27464to(dictionary.get_Item("version"), Integer.TYPE)).intValue() & 65535;
                return iIntValue == 0 ? new C1626e0(dictionary) : iIntValue == 1 ? new C1619bz(dictionary) : new C1641qm(dictionary);
            case 2:
                return new C1653uz(dictionary);
            case 3:
                return new C1638lr(dictionary);
            case 4:
                return new C1664yd(dictionary);
            case 5:
                return new C1617b3(dictionary);
            case 6:
                return new C1623dq(dictionary);
            case 7:
                return new C1649ts(dictionary);
            case 8:
                return new C1645ss(dictionary);
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                throw new NotImplementedException();
            case 19:
                return new C1616ar();
            case 20:
                return new C1654v4(dictionary);
            case 21:
                return new C1615ak(dictionary);
            default:
                throw new Exception("Unknown table.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m8837k4(String str) {
        if (this.f6307dy.containsKey(str)) {
            return this.f6307dy.get_Item(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m8838k4() {
        return this.f6309k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8839k4(long j) {
        this.f6313x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo8702k4(C1655vh c1655vh, C1627f9 c1627f9) {
        Dictionary<String, Object> dictionary = this.f6307dy;
        if (dictionary == null) {
            c1655vh.m9008k4(this.f6305c5, new C14093tq<>(0L));
            return;
        }
        Dictionary.Enumerator<String, Object> it = dictionary.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                String str = (String) next.getKey();
                Object value = next.getValue();
                int iIntValue = this.f6308h4.get_Item(str).intValue();
                boolean z = true;
                switch (iIntValue) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 13:
                        c1655vh.m8997k4(iIntValue, value, c1655vh.m8988k4());
                        break;
                    case 6:
                        c1655vh.m8993k4(((Double) C7019kk.m27464to(value, Double.TYPE)).doubleValue());
                        break;
                    case 7:
                    case 8:
                    default:
                        throw new Exception("Unknown data structure type.");
                    case 9:
                        c1655vh.m9001k4(((C14084qq) C7019kk.m27464to(value, C14084qq.class)).Clone());
                        break;
                    case 10:
                        c1655vh.m8991k4(((Character) C7019kk.m27464to(value, Character.TYPE)).charValue());
                        break;
                    case 11:
                        Long[] lArr = {0L};
                        Dictionary<String, Long> dictionary2 = this.f6311m9;
                        if (dictionary2 == null || !dictionary2.tryGetValue(str, lArr)) {
                            z = false;
                        }
                        long jLongValue = lArr[0].longValue();
                        if (!z) {
                            throw new Exception(C14113y2.m67408k4("Unknown size for DataType.String structure: ", str, "."));
                        }
                        c1655vh.m9004k4((String) value, new C14093tq<>(Long.valueOf(c1655vh.m8988k4())), jLongValue);
                        break;
                        break;
                    case 12:
                        Long[] lArr2 = {0L};
                        Dictionary<String, Long> dictionary3 = this.f6311m9;
                        if (dictionary3 == null || !dictionary3.tryGetValue(str, lArr2)) {
                            z = false;
                        }
                        lArr2[0].getClass();
                        if (!z) {
                            throw new Exception(C14113y2.m67408k4("Unknown size for DataType.Bytes structure: ", str, "."));
                        }
                        c1655vh.m9008k4((byte[]) C7019kk.m27458kk(value, byte[].class), new C14093tq<>(Long.valueOf(c1655vh.m8988k4())));
                        break;
                        break;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8840k4(String str, Object obj) {
        if (!this.f6307dy.containsKey(str)) {
            this.f6307dy.addItem(str, null);
        }
        this.f6307dy.set_Item(str, obj);
    }
}
