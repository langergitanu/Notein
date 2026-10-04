package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzCA {
    private static zzCM zzW(zzCF zzcf, int i) {
        int valueType = zzcf.getValueType();
        return valueType != 3 ? valueType != 4 ? zzDG.zzRk(zzDG.zzY(zzcf, i)) : zzZ((zzEB) zzcf) : zzZ((zzEA) zzcf);
    }

    public static zzCK zzY(zzCF zzcf, float f, float f2, int i, zzCL zzcl, zzD9 zzd9, zzDI zzdi, boolean z) throws Exception {
        zzCM zzcmZzW = zzW(zzcf, i);
        zzCV zzcv = new zzCV(zzcl, zzd9, zzdi.zzZIC().zzZMQ().zzZM7(), zzdi.zzZIC().zzZMQ().zzZM3(), zzdi.zzZIC().zzZMN(), f);
        zzCK zzckZzZ = zzCK.zzZ(zzcmZzW, zzcv, zzdi, false, z);
        if (com.aspose.words.internal.zzAN.zzf(f2)) {
            return zzckZzZ;
        }
        String stringValue = zzcf.getStringValue();
        if (zzcf.getValueType() == 3) {
            zzckZzZ = zzCK.zzZ(zzDG.zzRk(stringValue), zzcv, zzdi, false);
        }
        return zzDG.zzZ(stringValue, f2, zzckZzZ, zzcv, zzdi);
    }

    public static zzCK zzZ(zzCF zzcf, float f, zzCL zzcl, zzD9 zzd9, zzDI zzdi) throws Exception {
        return zzZ(zzcf, f, 0.0f, 22, zzcl, zzd9, zzdi, true);
    }

    private static zzCK zzZ(zzCF zzcf, float f, float f2, int i, zzCL zzcl, zzD9 zzd9, zzDI zzdi, boolean z) throws Exception {
        return zzY(zzcf, Math.max(f, zzZ(zzcf, i, zzcl, zzdi)), 0.0f, i, zzcl, zzd9, zzdi, z);
    }

    private static zzCK zzZ(zzCF zzcf, float f, int i, zzCL zzcl, zzD9 zzd9, zzDI zzdi) throws Exception {
        return zzZ(zzcf, f, 0.0f, i, zzcl, zzd9, zzdi, false);
    }

    private static zzCM zzZ(zzEB zzeb) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < zzeb.zzZLe().size(); i++) {
            if (zzeb.zzZLe().get(i) != null) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzE7.zzZ(((Double) zzeb.zzZLe().get(i)).doubleValue(), 1.0d, zzeb.zzKJ(i)));
            } else {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Object>) arrayList, (Object) null);
            }
        }
        return zzDG.zzM(arrayList);
    }

    private static zzCM zzZ(zzEA zzea) {
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = zzea.zzZLe().iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, (String) it.next());
        }
        return zzDG.zzM(arrayList);
    }

    public static long zzZ(zzCF zzcf, float f, int i, zzCL zzcl, zzDI zzdi) throws Exception {
        return zzZ(zzcf, f, i, zzcl, new zzD9(), zzdi).zzZGm().getSize();
    }

    public static float zzZ(zzCF zzcf, int i, zzCL zzcl, zzDI zzdi) throws Exception {
        return zzDG.zzX(zzDG.zzY(zzcf, i), zzcl, zzdi);
    }

    public static float zzZ(String str, zzCL zzcl, zzDI zzdi, float f) throws Exception {
        float fZzYB = f - com.aspose.words.internal.zzSA.zzYB(4);
        String[] strArrSplit = new com.aspose.words.internal.zzZNR("(?<=[^\\w])").split(str);
        int length = strArrSplit.length;
        float[] fArr = new float[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            fArr[i] = zzDG.zzZ(strArrSplit[i], zzcl, zzdi);
        }
        float fMax = fArr[0];
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = 0.0f;
            for (int i3 = i2; i3 < length; i3++) {
                float f3 = fArr[i3];
                if (f2 + f3 < fZzYB) {
                    f2 += f3;
                }
            }
            fMax = Math.max(fMax, f2);
        }
        return fMax + 91440.0f + 91440.0f;
    }
}
