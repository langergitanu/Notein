package com.aspose.words.internal;

import OooOo.C20485OooOoO;
import Oooo0oO.o0Oo0oo;
import androidx.core.location.LocationRequestCompat;
import com.aspose.words.internal.zzZHA;
import java.lang.ref.SoftReference;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZHC extends zzZHF {
    static final ThreadLocal<SoftReference<zzZFL>> zzWQ1;
    static final HashMap<String, Integer> zzWQo;
    zzZFL zzWQ0;
    Object[] zzWQ2;
    zzZQT zzWQ3;
    zzZQT zzWQ4;
    zzZQU zzWQ5;
    protected boolean zzWQ6;
    protected zzZHA.zzZ zzWQ7;
    protected URL zzWQ8;
    protected long zzWQ9;
    protected int zzWQa;
    protected int zzWQb;
    protected long zzWQc;
    protected long zzWQd;
    protected int zzWQe;
    protected int zzWQf;
    protected int zzWQg;
    protected int zzWQh;
    protected int zzWQi;
    protected int zzWQj;
    protected int zzWQk;
    protected int zzWQl;
    protected final zzZDV zzWQm;
    protected final boolean zzWQn;

    static {
        HashMap<String, Integer> map = new HashMap<>(64);
        zzWQo = map;
        OooO.OooO0O0(1, map, "com.aspose.javax.xml.stream.isCoalescing", 2, "com.aspose.javax.xml.stream.isNamespaceAware");
        OooO.OooO0O0(3, map, "com.aspose.javax.xml.stream.isReplacingEntityReferences", 4, "com.aspose.javax.xml.stream.isSupportingExternalEntities");
        OooO.OooO0O0(5, map, "com.aspose.javax.xml.stream.isValidating", 6, "com.aspose.javax.xml.stream.supportDTD");
        OooO.OooO0O0(7, map, "com.aspose.javax.xml.stream.allocator", 8, "com.aspose.javax.xml.stream.reporter");
        OooO.OooO0O0(9, map, "com.aspose.javax.xml.stream.resolver", 21, "org.codehaus.stax2.internNames");
        OooO.OooO0O0(20, map, "org.codehaus.stax2.internNsUris", 22, "http://java.sun.com/xml/stream/properties/report-cdata-event");
        OooO.OooO0O0(23, map, "org.codehaus.stax2.reportPrologWhitespace", 24, "org.codehaus.stax2.preserveLocation");
        OooO.OooO0O0(25, map, "org.codehaus.stax2.closeInputSource", 26, "org.codehaus.stax2.supportXmlId");
        OooO.OooO0O0(27, map, "org.codehaus.stax2.propDtdOverride", 42, "com.ctc.wstx.cacheDTDs");
        OooO.OooO0O0(43, map, "com.ctc.wstx.cacheDTDsByPublicId", 44, "com.ctc.wstx.lazyParsing");
        OooO.OooO0O0(45, map, "com.ctc.wstx.supportDTDPP", 46, "com.ctc.wstx.treatCharRefsAsEnts");
        OooO.OooO0O0(40, map, "com.ctc.wstx.normalizeLFs", 50, "com.ctc.wstx.inputBufferLength");
        OooO.OooO0O0(52, map, "com.ctc.wstx.minTextSegment", 60, "com.ctc.wstx.maxAttributesPerElement");
        OooO.OooO0O0(65, map, "com.ctc.wstx.maxAttributeSize", 61, "com.ctc.wstx.maxChildrenPerElement");
        OooO.OooO0O0(66, map, "com.ctc.wstx.maxTextLength", 62, "com.ctc.wstx.maxElementCount");
        OooO.OooO0O0(63, map, "com.ctc.wstx.maxElementDepth", 68, "com.ctc.wstx.maxEntityDepth");
        OooO.OooO0O0(67, map, "com.ctc.wstx.maxEntityCount", 64, "com.ctc.wstx.maxCharacters");
        map.put("com.ctc.wstx.customInternalEntities", 53);
        map.put("com.ctc.wstx.dtdResolver", zzZE5.zzgh(54));
        OooO.OooO0O0(55, map, "com.ctc.wstx.entityResolver", 56, "com.ctc.wstx.undeclaredEntityResolver");
        map.put("com.ctc.wstx.baseURL", zzZE5.zzgh(57));
        map.put("com.ctc.wstx.fragmentMode", zzZE5.zzgh(58));
        zzWQ1 = new ThreadLocal<>();
    }

    private zzZHC(zzZHC zzzhc, boolean z, zzZDV zzzdv, int i, int i2, int i3, int i4) {
        super(zzzhc);
        this.zzWQh = 1000;
        this.zzWQg = 524288;
        this.zzWQf = Integer.MAX_VALUE;
        this.zzWQe = 1000;
        this.zzWQd = LocationRequestCompat.PASSIVE_INTERVAL;
        this.zzWQc = LocationRequestCompat.PASSIVE_INTERVAL;
        this.zzWQb = Integer.MAX_VALUE;
        this.zzWQa = 500;
        this.zzWQ9 = 100000L;
        this.zzWQ7 = zzZHA.zzWPZ;
        this.zzWQ6 = false;
        this.zzWQ4 = null;
        this.zzWQ3 = null;
        this.zzWQ2 = null;
        this.zzWQ0 = null;
        this.zzWQn = z;
        this.zzWQm = zzzdv;
        this.zzWQl = i;
        this.zzWQk = i2;
        this.zzWQj = i3;
        this.zzWQi = i4;
        if (zzzhc != null) {
            this.zzWQh = zzzhc.zzWQh;
            this.zzWQg = zzzhc.zzWQg;
            this.zzWQf = zzzhc.zzWQf;
            this.zzWQd = zzzhc.zzWQd;
            this.zzWQe = zzzhc.zzWQe;
            this.zzWQc = zzzhc.zzWQc;
            this.zzWQb = zzzhc.zzWQb;
            this.zzWQa = zzzhc.zzWQa;
            this.zzWQ9 = zzzhc.zzWQ9;
        }
        SoftReference<zzZFL> softReference = zzWQ1.get();
        if (softReference != null) {
            this.zzWQ0 = softReference.get();
        }
    }

    private void zzPk(boolean z) {
        zzYW(8192, z);
    }

    private void zzPl(boolean z) {
        zzYW(4096, z);
    }

    private void zzPm(boolean z) {
        zzYW(512, z);
    }

    private void zzPn(boolean z) {
        zzYW(256, z);
    }

    private void zzPo(boolean z) {
        zzYW(2048, z);
    }

    private void zzPp(boolean z) {
        zzYW(1024, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap] */
    private void zzT(Map<String, ?> map) {
        Object map2;
        if (map == null || map.size() <= 0) {
            map2 = Collections.EMPTY_MAP;
        } else {
            int size = map.size();
            map2 = new HashMap(size + (size >> 1), 0.75f);
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                Object value = entry.getValue();
                char[] cArrZzXLL = value == null ? zzZE5.zzXLL() : value instanceof char[] ? (char[]) value : value.toString().toCharArray();
                String key = entry.getKey();
                map2.put(key, zzZG1.zzR(key, cArrZzXLL));
            }
        }
        zzZN(0, map2);
    }

    public static zzZHC zzXPT() {
        return new zzZHC(null, false, null, 2973213, 0, 4000, 64);
    }

    private static zzZFL zzXPh() {
        zzZFL zzzfl = new zzZFL();
        zzWQ1.set(new SoftReference<>(zzzfl));
        return zzzfl;
    }

    private Map<String, zzZG3> zzXPw() {
        Map map = (Map) zzh2(0);
        if (map == null) {
            return Collections.EMPTY_MAP;
        }
        int size = map.size();
        HashMap map2 = new HashMap(size + (size >> 2), 0.81f);
        for (Map.Entry entry : map.entrySet()) {
            map2.put(entry.getKey(), entry.getValue());
        }
        return map2;
    }

    private void zzYW(int i, boolean z) {
        if (z) {
            this.zzWQl |= i;
        } else {
            this.zzWQl &= ~i;
        }
        this.zzWQk = i | this.zzWQk;
    }

    private final void zzZN(int i, Object obj) {
        if (this.zzWQ2 == null) {
            this.zzWQ2 = new Object[4];
        }
        this.zzWQ2[i] = obj;
    }

    private final Object zzh2(int i) {
        Object[] objArr = this.zzWQ2;
        if (objArr == null) {
            return null;
        }
        return objArr[i];
    }

    private boolean zzh3(int i) {
        return (i & this.zzWQl) != 0;
    }

    private void zzh9(int i) {
        if (i < 8) {
            i = 8;
        }
        this.zzWQj = i;
    }

    @Override // com.aspose.words.internal.zzZHF
    public final /* bridge */ /* synthetic */ Object getProperty(String str) {
        return super.getProperty(str);
    }

    @Override // com.aspose.words.internal.zzZHF
    public final /* bridge */ /* synthetic */ boolean zzL(String str, Object obj) {
        return super.zzL(str, obj);
    }

    @Override // com.aspose.words.internal.zzZHF
    public final Object zzLv(int i) {
        if (i == 40) {
            return zzh3(16384) ? Boolean.TRUE : Boolean.FALSE;
        }
        if (i == 46) {
            return zzh3(8388608) ? Boolean.TRUE : Boolean.FALSE;
        }
        if (i == 50) {
            return zzZE5.zzgh(this.zzWQj);
        }
        switch (i) {
            case 1:
                return zzh3(2) ? Boolean.TRUE : Boolean.FALSE;
            case 2:
                return zzh3(1) ? Boolean.TRUE : Boolean.FALSE;
            case 3:
                return zzh3(4) ? Boolean.TRUE : Boolean.FALSE;
            case 4:
                return zzh3(8) ? Boolean.TRUE : Boolean.FALSE;
            case 5:
                return zzh3(32) ? Boolean.TRUE : Boolean.FALSE;
            case 6:
                return zzh3(16) ? Boolean.TRUE : Boolean.FALSE;
            case 7:
                return null;
            case 8:
                return this.zzWQ5;
            case 9:
                return this.zzWQ3;
            default:
                switch (i) {
                    case 20:
                        return zzh3(2048) ? Boolean.TRUE : Boolean.FALSE;
                    case 21:
                        return zzh3(1024) ? Boolean.TRUE : Boolean.FALSE;
                    case 22:
                        return zzh3(512) ? Boolean.TRUE : Boolean.FALSE;
                    case 23:
                        return zzh3(256) ? Boolean.TRUE : Boolean.FALSE;
                    case 24:
                        return zzh3(4096) ? Boolean.TRUE : Boolean.FALSE;
                    case 25:
                        return zzh3(8192) ? Boolean.TRUE : Boolean.FALSE;
                    case 26:
                        return !zzh3(2097152) ? "disable" : zzh3(4194304) ? "xmlidFull" : "xmlidTyping";
                    case 27:
                        return zzXPm();
                    default:
                        switch (i) {
                            case 42:
                                return zzh3(65536) ? Boolean.TRUE : Boolean.FALSE;
                            case 43:
                                return zzh3(131072) ? Boolean.TRUE : Boolean.FALSE;
                            case 44:
                                return zzh3(262144) ? Boolean.TRUE : Boolean.FALSE;
                            default:
                                switch (i) {
                                    case 52:
                                        return zzZE5.zzgh(this.zzWQi);
                                    case 53:
                                        return zzXPw();
                                    case 54:
                                        return this.zzWQ4;
                                    case 55:
                                        return this.zzWQ3;
                                    case 56:
                                        return zzXPs();
                                    case 57:
                                        return this.zzWQ8;
                                    case 58:
                                        return this.zzWQ7;
                                    default:
                                        switch (i) {
                                            case 60:
                                                return zzZE5.zzgh(this.zzWQh);
                                            case 61:
                                                return zzZE5.zzgh(this.zzWQf);
                                            case 62:
                                                return zzZE5.zzX9(this.zzWQd);
                                            case 63:
                                                return zzZE5.zzgh(this.zzWQe);
                                            case 64:
                                                return zzZE5.zzX9(this.zzWQc);
                                            case 65:
                                                return zzZE5.zzgh(this.zzWQg);
                                            case 66:
                                                return zzZE5.zzX9(this.zzWQb);
                                            case 67:
                                                return zzZE5.zzX9(this.zzWQ9);
                                            case 68:
                                                return zzZE5.zzgh(this.zzWQa);
                                            default:
                                                throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Internal error: no handler for property with internal id ", "."));
                                        }
                                }
                        }
                }
        }
    }

    public final void zzN(char[] cArr) {
        if (this.zzWQ0 == null) {
            this.zzWQ0 = zzXPh();
        }
        this.zzWQ0.zzK(cArr);
    }

    public final void zzO(char[] cArr) {
        if (this.zzWQ0 == null) {
            this.zzWQ0 = zzXPh();
        }
        this.zzWQ0.zzL(cArr);
    }

    public final void zzP(char[] cArr) {
        if (this.zzWQ0 == null) {
            this.zzWQ0 = zzXPh();
        }
        this.zzWQ0.zzM(cArr);
    }

    public final void zzPj(boolean z) {
        zzYW(16384, z);
    }

    public final void zzPq(boolean z) {
        zzYW(16, z);
    }

    public final void zzPr(boolean z) {
        zzYW(8, false);
    }

    public final void zzPs(boolean z) {
        zzYW(4, z);
    }

    public final void zzPt(boolean z) {
        zzYW(1, z);
    }

    public final void zzPu(boolean z) {
        zzYW(2, true);
    }

    public final void zzX(zzZQT zzzqt) {
        zzZN(1, zzzqt);
    }

    public final int zzXPA() {
        return this.zzWQa;
    }

    public final long zzXPB() {
        return this.zzWQd;
    }

    public final int zzXPC() {
        return this.zzWQe;
    }

    public final int zzXPD() {
        return this.zzWQf;
    }

    public final int zzXPE() {
        return this.zzWQg;
    }

    public final int zzXPF() {
        return this.zzWQh;
    }

    public final int zzXPG() {
        return this.zzWQi;
    }

    public final int zzXPH() {
        return this.zzWQj;
    }

    public final boolean zzXPI() {
        return zzh3(8388608);
    }

    public final boolean zzXPJ() {
        return zzh3(32768);
    }

    public final boolean zzXPK() {
        return zzh3(16384);
    }

    public final boolean zzXPL() {
        return zzh3(2097152);
    }

    public final boolean zzXPM() {
        return zzh3(8192);
    }

    public final boolean zzXPN() {
        return zzh3(2048);
    }

    public final boolean zzXPO() {
        return zzh3(8);
    }

    public final boolean zzXPP() {
        return zzh3(1);
    }

    public final int zzXPQ() {
        return this.zzWQl;
    }

    public final int zzXPR() {
        return this.zzWQn ? 5 : 12;
    }

    public final zzZDV zzXPS() {
        return this.zzWQm;
    }

    @Override // com.aspose.words.internal.zzZHF
    public final /* bridge */ /* synthetic */ boolean zzXPW() {
        return super.zzXPW();
    }

    @Override // com.aspose.words.internal.zzZHF
    public final /* bridge */ /* synthetic */ boolean zzXPX() {
        return super.zzXPX();
    }

    @Override // com.aspose.words.internal.zzZHF
    public final /* bridge */ /* synthetic */ boolean zzXPY() {
        return super.zzXPY();
    }

    public final char[] zzXPi() {
        char[] cArrZzgQ;
        zzZFL zzzfl = this.zzWQ0;
        return (zzzfl == null || (cArrZzgQ = zzzfl.zzgQ(128)) == null) ? new char[128] : cArrZzgQ;
    }

    public final void zzXPj() {
        zzYW(2, false);
        zzPl(false);
        zzPn(false);
        zzPo(true);
        zzYW(4194304, false);
        zzYW(65536, true);
        zzYW(262144, true);
        this.zzWQi = 16;
        zzh9(8000);
    }

    public final void zzXPk() {
        this.zzWQ6 = true;
    }

    public final void zzXPl() {
        zzYW(32768, false);
    }

    public final zzYFD zzXPm() {
        return (zzYFD) zzh2(3);
    }

    public final zzZGV zzXPn() {
        return (zzZGV) zzh2(2);
    }

    public final boolean zzXPo() {
        return this.zzWQ6;
    }

    public final boolean zzXPp() {
        return this.zzWQ7 == zzZHA.zzWPY;
    }

    public final boolean zzXPq() {
        return this.zzWQ7 == zzZHA.zzWPX;
    }

    public final URL zzXPr() {
        return this.zzWQ8;
    }

    public final zzZQT zzXPs() {
        return (zzZQT) zzh2(1);
    }

    public final zzZQT zzXPt() {
        return this.zzWQ3;
    }

    public final zzZQT zzXPu() {
        return this.zzWQ4;
    }

    public final zzZQU zzXPv() {
        return this.zzWQ5;
    }

    public final long zzXPx() {
        return this.zzWQb;
    }

    public final long zzXPy() {
        return this.zzWQc;
    }

    public final long zzXPz() {
        return this.zzWQ9;
    }

    public final void zzXt(byte[] bArr) {
        if (this.zzWQ0 == null) {
            this.zzWQ0 = zzXPh();
        }
        this.zzWQ0.zzXs(bArr);
    }

    public final void zzY(zzZQT zzzqt) {
        this.zzWQ4 = zzzqt;
    }

    public final zzZHC zzZ(zzZDV zzzdv) {
        zzZHC zzzhc = new zzZHC(this, this.zzWQn, zzzdv, this.zzWQl, this.zzWQk, this.zzWQj, this.zzWQi);
        zzzhc.zzWQ5 = this.zzWQ5;
        zzzhc.zzWQ4 = this.zzWQ4;
        zzzhc.zzWQ3 = this.zzWQ3;
        zzzhc.zzWQ8 = this.zzWQ8;
        zzzhc.zzWQ7 = this.zzWQ7;
        zzzhc.zzWQh = this.zzWQh;
        zzzhc.zzWQg = this.zzWQg;
        zzzhc.zzWQf = this.zzWQf;
        zzzhc.zzWQd = this.zzWQd;
        zzzhc.zzWQc = this.zzWQc;
        zzzhc.zzWQb = this.zzWQb;
        zzzhc.zzWQe = this.zzWQe;
        zzzhc.zzWQa = this.zzWQa;
        zzzhc.zzWQ9 = this.zzWQ9;
        Object[] objArr = this.zzWQ2;
        if (objArr != null) {
            int length = objArr.length;
            Object[] objArr2 = new Object[length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            zzzhc.zzWQ2 = objArr2;
        }
        return zzzhc;
    }

    public final byte[] zzh4(int i) {
        byte[] bArrZzgN;
        zzZFL zzzfl = this.zzWQ0;
        return (zzzfl == null || (bArrZzgN = zzzfl.zzgN(i)) == null) ? new byte[i] : bArrZzgN;
    }

    public final char[] zzh5(int i) {
        char[] cArrZzgO;
        zzZFL zzzfl = this.zzWQ0;
        return (zzzfl == null || (cArrZzgO = zzzfl.zzgO(i)) == null) ? new char[i] : cArrZzgO;
    }

    public final char[] zzh6(int i) {
        char[] cArrZzgP;
        zzZFL zzzfl = this.zzWQ0;
        return (zzzfl == null || (cArrZzgP = zzzfl.zzgP(i)) == null) ? new char[i] : cArrZzgP;
    }

    public final void zzh7(int i) {
        this.zzWQe = 2000;
    }

    public final void zzh8(int i) {
        this.zzWQg = 33554432;
    }

    public final zzZG3 zzy5(String str) {
        Map map = (Map) zzh2(0);
        if (map == null) {
            return null;
        }
        return (zzZG3) map.get(str);
    }

    @Override // com.aspose.words.internal.zzZHF
    public final int zzy7(String str) {
        Integer num = zzWQo.get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    private void zzZ(zzZQT zzzqt) {
        this.zzWQ3 = zzzqt;
        this.zzWQ4 = zzzqt;
    }

    @Override // com.aspose.words.internal.zzZHF
    public final boolean zzZ(String str, int i, Object obj) {
        boolean z;
        URL url;
        if (i == 40) {
            zzPj(zzZE8.zzF(str, obj));
        } else if (i == 46) {
            zzYW(8388608, zzZE8.zzF(str, obj));
        } else if (i != 50) {
            boolean z2 = false;
            switch (i) {
                case 1:
                    zzYW(2, zzZE8.zzF(str, obj));
                    break;
                case 2:
                    zzYW(1, zzZE8.zzF(str, obj));
                    break;
                case 3:
                    zzYW(4, zzZE8.zzF(str, obj));
                    break;
                case 4:
                    zzYW(8, zzZE8.zzF(str, obj));
                    break;
                case 5:
                    zzYW(32, zzZE8.zzF(str, obj));
                    break;
                case 6:
                    zzYW(16, zzZE8.zzF(str, obj));
                    break;
                case 7:
                    return false;
                case 8:
                    this.zzWQ5 = (zzZQU) obj;
                    break;
                case 9:
                    zzZ((zzZQT) obj);
                    break;
                default:
                    switch (i) {
                        case 20:
                            zzPo(zzZE8.zzF(str, obj));
                            break;
                        case 21:
                            zzPp(zzZE8.zzF(str, obj));
                            break;
                        case 22:
                            zzPm(zzZE8.zzF(str, obj));
                            break;
                        case 23:
                            zzPn(zzZE8.zzF(str, obj));
                            break;
                        case 24:
                            zzPl(zzZE8.zzF(str, obj));
                            break;
                        case 25:
                            zzPk(zzZE8.zzF(str, obj));
                            break;
                        case 26:
                            if ("disable".equals(obj)) {
                                z = false;
                            } else if ("xmlidTyping".equals(obj)) {
                                z = false;
                                z2 = true;
                            } else {
                                if (!"xmlidFull".equals(obj)) {
                                    throw new IllegalArgumentException(C20485OooOoO.OooO0O0("Illegal argument ('", obj, "') to set property org.codehaus.stax2.supportXmlId to: has to be one of 'disable', 'xmlidTyping' or 'xmlidFull'"));
                                }
                                z = true;
                                z2 = true;
                            }
                            zzYW(2097152, z2);
                            zzYW(4194304, z);
                            break;
                        case 27:
                            zzZN(3, (zzYFD) obj);
                            break;
                        default:
                            switch (i) {
                                case 42:
                                    zzYW(65536, zzZE8.zzF(str, obj));
                                    break;
                                case 43:
                                    zzYW(131072, zzZE8.zzF(str, obj));
                                    break;
                                case 44:
                                    zzYW(262144, zzZE8.zzF(str, obj));
                                    break;
                                default:
                                    switch (i) {
                                        case 52:
                                            this.zzWQi = zzZE8.zzE(str, obj);
                                            break;
                                        case 53:
                                            zzT((Map) obj);
                                            break;
                                        case 54:
                                            this.zzWQ4 = (zzZQT) obj;
                                            break;
                                        case 55:
                                            this.zzWQ3 = (zzZQT) obj;
                                            break;
                                        case 56:
                                            zzZN(1, (zzZQT) obj);
                                            break;
                                        case 57:
                                            if (obj == null) {
                                                url = null;
                                            } else if (obj instanceof URL) {
                                                url = (URL) obj;
                                            } else {
                                                try {
                                                    url = new URL(obj.toString());
                                                } catch (Exception e) {
                                                    throw new IllegalArgumentException(e.getMessage(), e);
                                                }
                                            }
                                            this.zzWQ8 = url;
                                            break;
                                        case 58:
                                            this.zzWQ7 = (zzZHA.zzZ) obj;
                                            break;
                                        default:
                                            switch (i) {
                                                case 60:
                                                    this.zzWQh = zzZE8.zzE(str, obj);
                                                    break;
                                                case 61:
                                                    this.zzWQf = zzZE8.zzE(str, obj);
                                                    break;
                                                case 62:
                                                    this.zzWQd = zzZE8.zzD(str, obj);
                                                    break;
                                                case 63:
                                                    this.zzWQe = zzZE8.zzE(str, obj);
                                                    break;
                                                case 64:
                                                    this.zzWQc = zzZE8.zzD(str, obj);
                                                    break;
                                                case 65:
                                                    this.zzWQg = zzZE8.zzE(str, obj);
                                                    break;
                                                case 66:
                                                    this.zzWQb = zzZE8.zzE(str, obj);
                                                    break;
                                                case 67:
                                                    this.zzWQ9 = zzZE8.zzD(str, obj);
                                                    break;
                                                case 68:
                                                    this.zzWQa = zzZE8.zzE(str, obj);
                                                    break;
                                                default:
                                                    throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Internal error: no handler for property with internal id ", "."));
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            zzh9(zzZE8.zzE(str, obj));
        }
        return true;
    }
}
