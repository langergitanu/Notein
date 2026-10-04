package com.aspose.slides.internal.p314oc;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.oc.h4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7017h4 {

    /* JADX INFO: renamed from: k4 */
    static final /* synthetic */ boolean f19074k4 = true;

    /* JADX INFO: renamed from: kk */
    private final k4[] f19075kk;

    /* JADX INFO: renamed from: to */
    private final int f19076to;

    /* JADX INFO: renamed from: x1 */
    private final String[] f19077x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.oc.h4$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: kk */
        static final /* synthetic */ boolean f19078kk = true;

        /* JADX INFO: renamed from: k4 */
        final String f19079k4;

        /* JADX INFO: renamed from: x1 */
        final int f19080x1;

        public k4(String str, int i) {
            if (!f19078kk && str == null) {
                throw new AssertionError();
            }
            this.f19079k4 = str;
            this.f19080x1 = i;
        }
    }

    public C7017h4(String... strArr) {
        String str;
        int i;
        k4[] k4VarArr;
        this.f19077x1 = strArr;
        int iM27427x1 = m27427x1(strArr.length);
        this.f19075kk = new k4[iM27427x1];
        this.f19076to = iM27427x1 - 1;
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.f19077x1;
            if (i2 >= strArr2.length) {
                return;
            }
            str = strArr2[i2];
            if (!f19074k4 && str == null) {
                throw new AssertionError("The map doesn't accept null keys.");
            }
            int iM27426k4 = m27426k4(str.hashCode());
            while (true) {
                i = this.f19076to & iM27426k4;
                k4VarArr = this.f19075kk;
                k4 k4Var = k4VarArr[i];
                if (k4Var == null) {
                    break;
                } else {
                    if (k4Var.f19079k4.equals(str)) {
                        throw new IllegalArgumentException("duplicate key: ".concat(str));
                    }
                    iM27426k4++;
                }
            }
            k4VarArr[i] = new k4(str, i2);
            i2++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m27426k4(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    /* JADX INFO: renamed from: x1 */
    private static int m27427x1(int i) {
        if (i < 536870912) {
            return Integer.highestOneBit(i) << 2;
        }
        if (f19074k4 || i < 1073741824) {
            return 1073741824;
        }
        throw new AssertionError("collection too large");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f19077x1.length * 16);
        sb.append('{');
        for (String str : this.f19077x1) {
            sb.append(str);
            sb.append(" : ");
            sb.append(m27428k4(str));
            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public int m27428k4(String str) {
        if (str == null) {
            return -1;
        }
        int iM27426k4 = m27426k4(str.hashCode());
        while (true) {
            k4 k4Var = this.f19075kk[this.f19076to & iM27426k4];
            if (k4Var == null) {
                return -1;
            }
            if (k4Var.f19079k4.equals(str)) {
                return k4Var.f19080x1;
            }
            iM27426k4++;
        }
    }
}
