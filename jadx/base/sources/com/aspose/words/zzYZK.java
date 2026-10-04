package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZK {
    private int[] zzY03;
    private zzZAF zzY04;

    public zzYZK(MailMerge mailMerge, zzZAF zzzaf) throws Exception {
        mailMerge.getDocument().getFieldOptions().isBidiTextSupportedOnUpdate();
        zzzaf.zzZhb();
        int fieldCount = zzzaf.getFieldCount();
        if (fieldCount < 0) {
            zzYDR();
        }
        this.zzY04 = zzzaf;
        this.zzY03 = fieldCount > 1 ? new int[fieldCount - 1] : null;
        clearCache();
    }

    private int zzY(zzZAF zzzaf, int i) throws Exception {
        int i2 = i;
        int iZzZm = -1;
        while (iZzZm == -1 && i2 != 0) {
            i2--;
            if (zzzaf == this.zzY04 && (iZzZm = this.zzY03[i2]) != -1) {
                break;
            }
            Ref<Object> ref = new Ref<>(null);
            boolean zZzZ = zzzaf.zzZ(i2, ref);
            Object obj = ref.get();
            if (!zZzZ) {
                zzYDR();
            }
            iZzZm = zzZm(obj);
        }
        if (iZzZm == -1) {
            iZzZm = 0;
        }
        if (zzzaf == this.zzY04 && this.zzY03 != null) {
            while (i2 < i) {
                this.zzY03[i2] = iZzZm;
                i2++;
            }
        }
        return iZzZm;
    }

    private static void zzYDR() {
        throw new IllegalStateException("Implementation of IMailMergeDataSourceCore is not valid.");
    }

    private static int zzZm(Object obj) {
        if (obj != null && !com.aspose.words.internal.zzZQB.zz1(obj)) {
            String string = obj.toString();
            for (int length = string.length() - 1; length >= 0; length--) {
                int iZzc = com.aspose.words.internal.zzZVU.zzc(string.charAt(length));
                if (iZzc == 0) {
                    return 0;
                }
                if (iZzc == 1 || iZzc == 2) {
                    return 1;
                }
                if (iZzc == 10) {
                    return 0;
                }
            }
        }
        return -1;
    }

    public final void clearCache() {
        if (this.zzY03 == null) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr = this.zzY03;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = -1;
            i++;
        }
    }

    public final int zzZ(zzZAF zzzaf, String str, boolean z) throws Exception {
        zzzaf.zzZhb();
        if (!z) {
            return -1;
        }
        int iZzMq = zzzaf.zzMq(str);
        if (!zzZ2M.zzZ(zzzaf, iZzMq)) {
            zzYDR();
        }
        return zzY(zzzaf, iZzMq);
    }
}
