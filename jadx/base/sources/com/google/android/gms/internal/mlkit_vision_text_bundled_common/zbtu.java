package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.aspose.slides.C22223Oooo0o;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
final class zbtu {
    private static final zbtu zbb = new zbtu(true);
    final zbwh zba = new zbwa();
    private boolean zbc;
    private boolean zbd;

    private zbtu() {
    }

    public static int zba(zbww zbwwVar, int i, Object obj) {
        int iZbd;
        int iZbD;
        int iZbD2 = zbtk.zbD(i << 3);
        if (zbwwVar == zbww.zbj) {
            zbuo.zbd((zbvm) obj);
            iZbD2 += iZbD2;
        }
        zbwx zbwxVar = zbwx.INT;
        int iZbE = 4;
        switch (zbwwVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iZbE = 8;
                return iZbD2 + iZbE;
            case 1:
                ((Float) obj).getClass();
                return iZbD2 + iZbE;
            case 2:
                iZbE = zbtk.zbE(((Long) obj).longValue());
                return iZbD2 + iZbE;
            case 3:
                iZbE = zbtk.zbE(((Long) obj).longValue());
                return iZbD2 + iZbE;
            case 4:
                iZbE = zbtk.zbE(((Integer) obj).intValue());
                return iZbD2 + iZbE;
            case 5:
                ((Long) obj).getClass();
                iZbE = 8;
                return iZbD2 + iZbE;
            case 6:
                ((Integer) obj).getClass();
                return iZbD2 + iZbE;
            case 7:
                ((Boolean) obj).getClass();
                iZbE = 1;
                return iZbD2 + iZbE;
            case 8:
                if (!(obj instanceof zbtc)) {
                    iZbE = zbtk.zbC((String) obj);
                    return iZbD2 + iZbE;
                }
                iZbd = ((zbtc) obj).zbd();
                iZbD = zbtk.zbD(iZbd);
                iZbE = iZbD + iZbd;
                return iZbD2 + iZbE;
            case 9:
                iZbE = ((zbvm) obj).zbo();
                return iZbD2 + iZbE;
            case 10:
                if (!(obj instanceof zbuv)) {
                    iZbE = zbtk.zbA((zbvm) obj);
                    return iZbD2 + iZbE;
                }
                iZbd = ((zbuv) obj).zba();
                iZbD = zbtk.zbD(iZbd);
                iZbE = iZbD + iZbd;
                return iZbD2 + iZbE;
            case 11:
                if (obj instanceof zbtc) {
                    iZbd = ((zbtc) obj).zbd();
                    iZbD = zbtk.zbD(iZbd);
                } else {
                    iZbd = ((byte[]) obj).length;
                    iZbD = zbtk.zbD(iZbd);
                }
                iZbE = iZbD + iZbd;
                return iZbD2 + iZbE;
            case 12:
                iZbE = zbtk.zbD(((Integer) obj).intValue());
                return iZbD2 + iZbE;
            case 13:
                iZbE = obj instanceof zbuh ? zbtk.zbE(((zbuh) obj).zba()) : zbtk.zbE(((Integer) obj).intValue());
                return iZbD2 + iZbE;
            case 14:
                ((Integer) obj).getClass();
                return iZbD2 + iZbE;
            case 15:
                ((Long) obj).getClass();
                iZbE = 8;
                return iZbD2 + iZbE;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iZbE = zbtk.zbD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZbD2 + iZbE;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iZbE = zbtk.zbE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZbD2 + iZbE;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zbb(zbtt zbttVar, Object obj) {
        zbww zbwwVarZbd = zbttVar.zbd();
        zbttVar.zba();
        zbttVar.zbg();
        return zba(zbwwVarZbd, 32149011, obj);
    }

    public static zbtu zbe() {
        return zbb;
    }

    public static void zbk(zbtk zbtkVar, zbww zbwwVar, int i, Object obj) throws IOException {
        if (zbwwVar == zbww.zbj) {
            zbvm zbvmVar = (zbvm) obj;
            zbuo.zbd(zbvmVar);
            zbtkVar.zbu(i, 3);
            zbvmVar.zbL(zbtkVar);
            zbtkVar.zbu(i, 4);
            return;
        }
        zbtkVar.zbu(i, zbwwVar.zba());
        zbwx zbwxVar = zbwx.INT;
        switch (zbwwVar.ordinal()) {
            case 0:
                zbtkVar.zbk(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zbtkVar.zbi(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zbtkVar.zby(((Long) obj).longValue());
                break;
            case 3:
                zbtkVar.zby(((Long) obj).longValue());
                break;
            case 4:
                zbtkVar.zbm(((Integer) obj).intValue());
                break;
            case 5:
                zbtkVar.zbk(((Long) obj).longValue());
                break;
            case 6:
                zbtkVar.zbi(((Integer) obj).intValue());
                break;
            case 7:
                zbtkVar.zbb(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zbtc)) {
                    zbtkVar.zbt((String) obj);
                } else {
                    zbtkVar.zbg((zbtc) obj);
                }
                break;
            case 9:
                ((zbvm) obj).zbL(zbtkVar);
                break;
            case 10:
                zbtkVar.zbp((zbvm) obj);
                break;
            case 11:
                if (!(obj instanceof zbtc)) {
                    byte[] bArr = (byte[]) obj;
                    zbtkVar.zbe(bArr, 0, bArr.length);
                } else {
                    zbtkVar.zbg((zbtc) obj);
                }
                break;
            case 12:
                zbtkVar.zbw(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zbuh)) {
                    zbtkVar.zbm(((Integer) obj).intValue());
                } else {
                    zbtkVar.zbm(((zbuh) obj).zba());
                }
                break;
            case 14:
                zbtkVar.zbi(((Integer) obj).intValue());
                break;
            case 15:
                zbtkVar.zbk(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zbtkVar.zbw((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zbtkVar.zby((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    private static Object zbn(Object obj) {
        if (obj instanceof zbvr) {
            return ((zbvr) obj).zbc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zbo(Map.Entry entry) {
        zbtt zbttVar = (zbtt) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zbuv;
        zbttVar.zbg();
        if (zbttVar.zbe() != zbwx.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zba.put(zbttVar, zbn(value));
            return;
        }
        Object objZbf = zbf(zbttVar);
        if (objZbf != null) {
            if (z) {
                throw null;
            }
            this.zba.put(zbttVar, objZbf instanceof zbvr ? zbttVar.zbc((zbvr) objZbf, (zbvr) value) : zbttVar.zbb(((zbvm) objZbf).zbK(), (zbvm) value).zbk());
        } else {
            this.zba.put(zbttVar, zbn(value));
            if (z) {
                this.zbd = true;
            }
        }
    }

    private static boolean zbp(Map.Entry entry) {
        zbtt zbttVar = (zbtt) entry.getKey();
        if (zbttVar.zbe() != zbwx.MESSAGE) {
            return true;
        }
        zbttVar.zbg();
        Object value = entry.getValue();
        if (value instanceof zbvn) {
            return ((zbvn) value).zbp();
        }
        if (value instanceof zbuv) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zbq(Map.Entry entry) {
        zbtt zbttVar = (zbtt) entry.getKey();
        Object value = entry.getValue();
        if (zbttVar.zbe() != zbwx.MESSAGE) {
            return zbb(zbttVar, value);
        }
        zbttVar.zbg();
        zbttVar.zbf();
        if (!(value instanceof zbuv)) {
            ((zbtt) entry.getKey()).zba();
            int iZbD = zbtk.zbD(8);
            int iZbD2 = zbtk.zbD(32149011) + zbtk.zbD(16);
            return iZbD + iZbD + iZbD2 + zbtk.zbA((zbvm) value) + zbtk.zbD(24);
        }
        ((zbtt) entry.getKey()).zba();
        int iZbD3 = zbtk.zbD(8);
        int iZbD4 = zbtk.zbD(32149011) + zbtk.zbD(16);
        int iZbD5 = zbtk.zbD(24);
        int iZba = ((zbuv) value).zba();
        return iZbD3 + iZbD3 + iZbD4 + C22223Oooo0o.OooO00o(iZba, iZba, iZbD5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zbtu) {
            return this.zba.equals(((zbtu) obj).zba);
        }
        return false;
    }

    public final int hashCode() {
        return this.zba.hashCode();
    }

    public final int zbc() {
        int iZbc = this.zba.zbc();
        int iZbq = 0;
        for (int i = 0; i < iZbc; i++) {
            iZbq += zbq(this.zba.zbg(i));
        }
        Iterator it = this.zba.zbd().iterator();
        while (it.hasNext()) {
            iZbq += zbq((Map.Entry) it.next());
        }
        return iZbq;
    }

    /* JADX INFO: renamed from: zbd, reason: merged with bridge method [inline-methods] */
    public final zbtu clone() {
        zbtu zbtuVar = new zbtu();
        int iZbc = this.zba.zbc();
        for (int i = 0; i < iZbc; i++) {
            Map.Entry entryZbg = this.zba.zbg(i);
            zbtuVar.zbj((zbtt) ((zbwb) entryZbg).zba(), entryZbg.getValue());
        }
        for (Map.Entry entry : this.zba.zbd()) {
            zbtuVar.zbj((zbtt) entry.getKey(), entry.getValue());
        }
        zbtuVar.zbd = this.zbd;
        return zbtuVar;
    }

    public final Object zbf(zbtt zbttVar) {
        Object obj = this.zba.get(zbttVar);
        if (obj instanceof zbuv) {
            throw null;
        }
        return obj;
    }

    public final Iterator zbg() {
        return this.zba.isEmpty() ? Collections.emptyIterator() : this.zbd ? new zbuu(this.zba.entrySet().iterator()) : this.zba.entrySet().iterator();
    }

    public final void zbh() {
        if (this.zbc) {
            return;
        }
        int iZbc = this.zba.zbc();
        for (int i = 0; i < iZbc; i++) {
            Map.Entry entryZbg = this.zba.zbg(i);
            if (entryZbg.getValue() instanceof zbuf) {
                ((zbuf) entryZbg.getValue()).zbB();
            }
        }
        this.zba.zba();
        this.zbc = true;
    }

    public final void zbi(zbtu zbtuVar) {
        int iZbc = zbtuVar.zba.zbc();
        for (int i = 0; i < iZbc; i++) {
            zbo(zbtuVar.zba.zbg(i));
        }
        Iterator it = zbtuVar.zba.zbd().iterator();
        while (it.hasNext()) {
            zbo((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuh) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuv) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zbj(zbtt zbttVar, Object obj) {
        boolean z;
        zbttVar.zbg();
        zbttVar.zbd();
        byte[] bArr = zbuo.zbb;
        obj.getClass();
        zbww zbwwVar = zbww.zba;
        zbwx zbwxVar = zbwx.INT;
        switch (r0.zbb()) {
            case INT:
                z = obj instanceof Integer;
                break;
            case LONG:
                z = obj instanceof Long;
                break;
            case FLOAT:
                z = obj instanceof Float;
                break;
            case DOUBLE:
                z = obj instanceof Double;
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                break;
            case STRING:
                z = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof zbtc)) {
                    break;
                }
                if (obj instanceof zbuv) {
                    this.zbd = true;
                }
                this.zba.put(zbttVar, obj);
                return;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof zbuv) {
                }
                this.zba.put(zbttVar, obj);
                return;
            case MESSAGE:
                if (!(obj instanceof zbvm)) {
                    break;
                }
                if (obj instanceof zbuv) {
                }
                this.zba.put(zbttVar, obj);
                return;
            default:
                zbttVar.zba();
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 32149011, zbttVar.zbd().zbb(), obj.getClass().getName()));
        }
    }

    public final boolean zbl() {
        return this.zbc;
    }

    public final boolean zbm() {
        int iZbc = this.zba.zbc();
        for (int i = 0; i < iZbc; i++) {
            if (!zbp(this.zba.zbg(i))) {
                return false;
            }
        }
        Iterator it = this.zba.zbd().iterator();
        while (it.hasNext()) {
            if (!zbp((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zbtu(boolean z) {
        zbh();
        zbh();
    }
}
