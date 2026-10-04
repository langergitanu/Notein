package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;
import java.lang.ref.SoftReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZHB extends zzZHF {
    static final ThreadLocal<SoftReference<zzZFL>> zzWQ1;
    static final HashMap<String, Integer> zzWQo;
    zzZFL zzWQ0;
    Object[] zzWQ2;
    protected int zzWQl;
    final boolean zzWQn;

    static {
        HashMap<String, Integer> map = new HashMap<>(8);
        zzWQo = map;
        OooO.OooO0O0(1, map, "com.aspose.javax.xml.stream.isRepairingNamespaces", 4, "javax.xml.stream.isNamespaceAware");
        OooO.OooO0O0(2, map, "org.codehaus.stax2.automaticEmptyElements", 3, "org.codehaus.stax2.autoCloseOutput");
        OooO.OooO0O0(5, map, "org.codehaus.stax2.automaticNsPrefix", 6, "org.codehaus.stax2.textEscaper");
        OooO.OooO0O0(7, map, "org.codehaus.stax2.attrValueEscaper", 8, "javax.xml.stream.reporter");
        OooO.OooO0O0(10, map, "com.ctc.wstx.useDoubleQuotesInXmlDecl", 11, "com.ctc.wstx.outputCDataAsText");
        OooO.OooO0O0(12, map, "com.ctc.wstx.copyDefaultAttrs", 13, "com.ctc.wstx.outputEscapeCr");
        OooO.OooO0O0(14, map, "com.ctc.wstx.addSpaceAfterEmptyElem", 15, "com.ctc.wstx.automaticEndElements");
        OooO.OooO0O0(21, map, "com.ctc.wstx.outputInvalidCharHandler", 22, "com.ctc.wstx.outputEmptyElementHandler");
        OooO.OooO0O0(16, map, "com.ctc.wstx.outputValidateStructure", 17, "com.ctc.wstx.outputValidateContent");
        OooO.OooO0O0(18, map, "com.ctc.wstx.outputValidateAttr", 19, "com.ctc.wstx.outputValidateNames");
        OooO.OooO0O0(20, map, "com.ctc.wstx.outputFixContent", 30, "com.ctc.wstx.outputUnderlyingStream");
        map.put("com.ctc.wstx.outputUnderlyingStream", zzZE5.zzgh(30));
        zzWQ1 = new ThreadLocal<>();
    }

    private zzZHB(zzZHB zzzhb, boolean z, int i, Object[] objArr) {
        super(zzzhb);
        this.zzWQ0 = null;
        this.zzWQn = z;
        this.zzWQl = i;
        this.zzWQ2 = objArr;
        SoftReference<zzZFL> softReference = zzWQ1.get();
        if (softReference != null) {
            this.zzWQ0 = softReference.get();
        }
    }

    private void zzP8(boolean z) {
        zzYW(4096, z);
    }

    private void zzP9(boolean z) {
        zzYW(1024, z);
    }

    private void zzPa(boolean z) {
        zzYW(2048, z);
    }

    private void zzPb(boolean z) {
        zzYW(512, z);
    }

    private void zzPg(boolean z) {
        zzYW(16384, z);
    }

    private void zzPh(boolean z) {
        zzYW(8192, z);
    }

    public static zzZHB zzXPg() {
        return new zzZHB(null, false, 933, null);
    }

    private static zzZFL zzXPh() {
        zzZFL zzzfl = new zzZFL();
        zzWQ1.set(new SoftReference<>(zzzfl));
        return zzzfl;
    }

    private void zzYW(int i, boolean z) {
        if (z) {
            this.zzWQl = i | this.zzWQl;
        } else {
            this.zzWQl = (~i) & this.zzWQl;
        }
    }

    private final void zzZM(int i, Object obj) {
        if (this.zzWQ2 == null) {
            this.zzWQ2 = new Object[6];
        }
        this.zzWQ2[i] = obj;
    }

    private final Object zzh0(int i) {
        Object[] objArr = this.zzWQ2;
        if (objArr == null) {
            return null;
        }
        return objArr[i];
    }

    private final boolean zzh1(int i) {
        return (this.zzWQl & i) == i;
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
        if (i == 30 || i == 31) {
            throw new IllegalStateException("Can not access per-stream-writer properties via factory");
        }
        switch (i) {
            case 1:
                return zzh1(2) ? Boolean.TRUE : Boolean.FALSE;
            case 2:
                return zzh1(4) ? Boolean.TRUE : Boolean.FALSE;
            case 3:
                return zzh1(8192) ? Boolean.TRUE : Boolean.FALSE;
            case 4:
                return zzh1(1) ? Boolean.TRUE : Boolean.FALSE;
            case 5:
                return zzXPb();
            case 6:
                return zzXPa();
            case 7:
                return zzXP9();
            case 8:
                return zzXP8();
            default:
                switch (i) {
                    case 10:
                        return zzh1(16384) ? Boolean.TRUE : Boolean.FALSE;
                    case 11:
                        return zzh1(8) ? Boolean.TRUE : Boolean.FALSE;
                    case 12:
                        return zzh1(16) ? Boolean.TRUE : Boolean.FALSE;
                    case 13:
                        return zzh1(32) ? Boolean.TRUE : Boolean.FALSE;
                    case 14:
                        return zzh1(64) ? Boolean.TRUE : Boolean.FALSE;
                    case 15:
                        return zzh1(128) ? Boolean.TRUE : Boolean.FALSE;
                    case 16:
                        return zzh1(256) ? Boolean.TRUE : Boolean.FALSE;
                    case 17:
                        return zzh1(512) ? Boolean.TRUE : Boolean.FALSE;
                    case 18:
                        return zzh1(2048) ? Boolean.TRUE : Boolean.FALSE;
                    case 19:
                        return zzh1(1024) ? Boolean.TRUE : Boolean.FALSE;
                    case 20:
                        return zzh1(4096) ? Boolean.TRUE : Boolean.FALSE;
                    case 21:
                        return zzXP7();
                    case 22:
                        return zzXP6();
                    default:
                        throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Internal error: no handler for property with internal id ", "."));
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

    public final void zzPc(boolean z) {
        zzYW(256, z);
    }

    public final void zzPd(boolean z) {
        zzYW(128, z);
    }

    public final void zzPe(boolean z) {
        zzYW(64, true);
    }

    public final void zzPf(boolean z) {
        zzYW(32, false);
    }

    public final void zzPi(boolean z) {
        zzYW(4, true);
    }

    public final byte[] zzXP3() {
        byte[] bArrZzgN;
        zzZFL zzzfl = this.zzWQ0;
        return (zzzfl == null || (bArrZzgN = zzzfl.zzgN(4000)) == null) ? new byte[4000] : bArrZzgN;
    }

    public final char[] zzXP4() {
        char[] cArrZzgO;
        zzZFL zzzfl = this.zzWQ0;
        return (zzzfl == null || (cArrZzgO = zzzfl.zzgO(1000)) == null) ? new char[1000] : cArrZzgO;
    }

    public final char[] zzXP5() {
        char[] cArrZzgP;
        zzZFL zzzfl = this.zzWQ0;
        return (zzzfl == null || (cArrZzgP = zzzfl.zzgP(512)) == null) ? new char[512] : cArrZzgP;
    }

    public final zzZHE zzXP6() {
        return (zzZHE) zzh0(5);
    }

    public final zzZHD zzXP7() {
        return (zzZHD) zzh0(4);
    }

    public final zzZQU zzXP8() {
        return (zzZQU) zzh0(3);
    }

    public final zzYFS zzXP9() {
        return (zzYFS) zzh0(2);
    }

    public final boolean zzXPP() {
        return zzh1(1);
    }

    public final int zzXPQ() {
        return this.zzWQl;
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

    public final zzYFS zzXPa() {
        return (zzYFS) zzh0(1);
    }

    public final String zzXPb() {
        String str = (String) zzh0(0);
        return str == null ? "wstxns" : str;
    }

    public final boolean zzXPc() {
        return zzh1(128);
    }

    public final boolean zzXPd() {
        return zzh1(8192);
    }

    public final boolean zzXPe() {
        return zzh1(2);
    }

    public final zzZHB zzXPf() {
        Object[] objArr;
        Object[] objArr2 = this.zzWQ2;
        if (objArr2 != null) {
            int length = objArr2.length;
            objArr = new Object[length];
            System.arraycopy(objArr2, 0, objArr, 0, length);
        } else {
            objArr = null;
        }
        return new zzZHB(this, this.zzWQn, this.zzWQl, objArr);
    }

    public final void zzXPj() {
        zzPa(false);
        zzPb(false);
        zzP9(false);
    }

    public final void zzXt(byte[] bArr) {
        if (this.zzWQ0 == null) {
            this.zzWQ0 = zzXPh();
        }
        this.zzWQ0.zzXs(bArr);
    }

    public final void zzY(zzYFS zzyfs) {
        zzZM(2, zzyfs);
    }

    @Override // com.aspose.words.internal.zzZHF
    public final boolean zzZ(String str, int i, Object obj) {
        if (i == 30 || i == 31) {
            throw new IllegalStateException("Can not modify per-stream-writer properties via factory");
        }
        switch (i) {
            case 1:
                zzYW(2, zzZE8.zzF(str, obj));
                return true;
            case 2:
                zzYW(4, zzZE8.zzF(str, obj));
                return true;
            case 3:
                zzPh(zzZE8.zzF(str, obj));
                return true;
            case 4:
                zzYW(1, zzZE8.zzF(str, obj));
                return true;
            case 5:
                zzZM(0, obj.toString());
                return true;
            case 6:
                zzZM(1, (zzYFS) obj);
                return true;
            case 7:
                zzZM(2, (zzYFS) obj);
                return true;
            case 8:
                zzZM(3, (zzZQU) obj);
                return true;
            default:
                switch (i) {
                    case 10:
                        zzPg(zzZE8.zzF(str, obj));
                        return true;
                    case 11:
                        zzYW(8, zzZE8.zzF(str, obj));
                        return true;
                    case 12:
                        zzYW(16, zzZE8.zzF(str, obj));
                        return true;
                    case 13:
                        zzYW(32, zzZE8.zzF(str, obj));
                        return true;
                    case 14:
                        zzYW(64, zzZE8.zzF(str, obj));
                        return true;
                    case 15:
                        zzPd(zzZE8.zzF(str, obj));
                        return true;
                    case 16:
                        zzPc(zzZE8.zzF(str, obj));
                        return true;
                    case 17:
                        zzPb(zzZE8.zzF(str, obj));
                        return true;
                    case 18:
                        zzPa(zzZE8.zzF(str, obj));
                        return true;
                    case 19:
                        zzP9(zzZE8.zzF(str, obj));
                        return true;
                    case 20:
                        zzP8(zzZE8.zzF(str, obj));
                        return true;
                    case 21:
                        zzZM(4, (zzZHD) obj);
                        return true;
                    case 22:
                        zzZM(5, (zzZHE) obj);
                        return true;
                    default:
                        throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Internal error: no handler for property with internal id ", "."));
                }
        }
    }

    @Override // com.aspose.words.internal.zzZHF
    public final int zzy7(String str) {
        Integer num = zzWQo.get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final void zzZ(zzYFS zzyfs) {
        zzZM(1, zzyfs);
    }
}
