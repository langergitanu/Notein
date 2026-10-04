package com.aspose.words.internal;

import com.aspose.words.EditingLanguage;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class zz0B {
    private int zzdV;
    private zz0D zzdW;
    private zzZOZ zzdX;
    public static zzZOZ zzdU = new zzZOZ("F29F85E0-4FF9-1068-AB91-08002B27B3D9");
    public static zzZOZ zzdT = new zzZOZ("D5CDD502-2E9C-101B-9397-08002B2CF9AE");
    public static zzZOZ zzdS = new zzZOZ("D5CDD505-2E9C-101B-9397-08002B2CF9AE");
    public static String zzdR = new zzZOZ().toString();

    private zz0B(zzZOZ zzzoz) {
        zzZOZ zzzoz2 = zzZOZ.zzZXP;
        this.zzdX = zzzoz;
        this.zzdW = new zz0D();
    }

    private static int zzT(ArrayList<zz0F> arrayList, int i) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            zz0F zz0f = arrayList.get(i2);
            if (zz0f.zze0 == i) {
                return zz0f.zzdZ;
            }
        }
        return -1;
    }

    private static String zzU(zzZOX zzzox, int i) throws Exception {
        if (i != 1200) {
            return zzV(zzzox, i);
        }
        String strZzW = zzW(zzzox);
        zzZYQ.zzV(zzzox.zzq(), 4);
        return strZzW;
    }

    private static String zzV(zzZOX zzzox, int i) throws Exception {
        int iZzXc = zzzox.zzXc();
        if (!zzZYQ.zzT(zzzox, iZzXc)) {
            iZzXc = 0;
        }
        return zzZKN.zzT(zzZO0.zzQz(i).zzR(zzzox.zzn(iZzXc), 0, iZzXc), (char) 0);
    }

    private static Object[] zzW(zzZOX zzzox, int i) throws Exception {
        int iZzXc = zzzox.zzXc();
        Object[] objArr = new Object[iZzXc];
        for (int i2 = 0; i2 < iZzXc; i2++) {
            objArr[i2] = zzY(zzzox, i);
        }
        boolean z = true;
        for (int i3 = 0; i3 < iZzXc; i3++) {
            Object obj = objArr[i3];
            z &= zzAN.zzZP((long) i3) ? (obj instanceof Integer) && ((Integer) obj).intValue() > 0 : obj instanceof String;
        }
        if (z) {
            return objArr;
        }
        return null;
    }

    private static String[] zzX(zzZOX zzzox, int i) throws Exception {
        int iZzXc = zzzox.zzXc();
        String[] strArr = new String[iZzXc];
        for (int i2 = 0; i2 < iZzXc; i2++) {
            strArr[i2] = zzU(zzzox, i);
        }
        return strArr;
    }

    private static Object zzY(zzZOX zzzox, int i) throws Exception {
        int iZzXc = zzzox.zzXc();
        if (iZzXc == 2) {
            return Short.valueOf(zzzox.zzXa());
        }
        if (iZzXc == 3) {
            return Integer.valueOf(zzzox.zzXc());
        }
        if (iZzXc == 5) {
            return Double.valueOf(Double.longBitsToDouble(zzzox.zzX8()));
        }
        if (iZzXc == 8) {
            return zzdR;
        }
        if (iZzXc == 11) {
            return Boolean.valueOf(zzzox.zzXa() != 0);
        }
        if (iZzXc == 19) {
            return Integer.valueOf(zzzox.zzXc());
        }
        if (iZzXc == 4108) {
            return zzW(zzzox, i);
        }
        if (iZzXc == 30) {
            return zzV(zzzox, i);
        }
        if (iZzXc == 31) {
            String strZzW = zzW(zzzox);
            zzZYQ.zzV(zzzox.zzq(), 4);
            return strZzW;
        }
        if (iZzXc == 64) {
            long jZzX8 = zzzox.zzX8();
            zzZQ9 zzzq9 = zzZQ9.zz35;
            return (jZzX8 <= zzzq9.zzkP() || jZzX8 > zzZQ9.zz34.zzkP()) ? zzzq9 : zzR1.zzZ(jZzX8, "ticks");
        }
        if (iZzXc == 65) {
            return zzzox.zzn(zzzox.zzXc());
        }
        if (iZzXc != 4126) {
            if (iZzXc != 4127) {
                return null;
            }
            return zzX(zzzox, i);
        }
        if (i == 1200) {
            i = 1252;
        }
        return zzX(zzzox, i);
    }

    private static void zzZ(zzZOX zzzox, HashMap<Integer, String> map, int i) throws Exception {
        int iZzXc = zzzox.zzXc();
        for (int i2 = 0; i2 < iZzXc && zzZYQ.zzT(zzzox, 4); i2++) {
            int iZzXc2 = zzzox.zzXc();
            String strZzU = zzU(zzzox, i);
            if (!zzZYD.zzXk(strZzU)) {
                return;
            }
            zzZQF.zzY(map, Integer.valueOf(iZzXc2), strZzU);
        }
    }

    public final byte[] toByteArray() throws Exception {
        zzZOR zzzor = new zzZOR();
        zzZOW zzzow = new zzZOW(zzzor);
        int count = this.zzdW.getCount() * 8;
        int i = count + 16;
        boolean z = this.zzdW.zzs9() || this.zzdX.equals(zzdS);
        if (z) {
            i = count + 24;
        }
        zzzor.zzH(i);
        ArrayList arrayList = new ArrayList();
        if (z) {
            zzZQG.zzZ((ArrayList<zz0F>) arrayList, new zz0F(0, (int) zzzor.getPosition()));
            zzZ(zzzow, this.zzdW, this.zzdV);
        }
        zzZQG.zzZ((ArrayList<zz0F>) arrayList, new zz0F(1, (int) zzzor.getPosition()));
        zzZ(zzzow, Short.valueOf((short) this.zzdV), this.zzdV, true);
        for (int i2 = 0; i2 < this.zzdW.getCount(); i2++) {
            zz0E zz0eZzTd = this.zzdW.zzTd(i2);
            zzZQG.zzZ((ArrayList<zz0F>) arrayList, new zz0F(zz0eZzTd.getId(), (int) zzzor.getPosition()));
            zzZ(zzzow, zz0eZzTd.getValue(), this.zzdV, true);
        }
        zzzor.zzH(0L);
        zzzow.zzl((int) zzzor.getLength());
        zzzow.zzl(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((zz0F) arrayList.get(i3)).zzZ(zzzow);
        }
        return zzzor.zzWy();
    }

    public final zzZOZ zzs5() {
        return this.zzdX;
    }

    public final zz0D zzs6() {
        return this.zzdW;
    }

    public zz0B(zzZOZ zzzoz, byte b) {
        this(zzzoz);
        this.zzdV = 1200;
    }

    private static String zzW(zzZOX zzzox) throws Exception {
        int iZzXc = zzzox.zzXc() * 2;
        String strZzR = zzZO0.zzhU().zzR(zzzox.zzn(iZzXc), 0, iZzXc - 2);
        return zzZYD.zzXk(strZzR) ? zzZKN.zzT(strZzR, (char) 0) : strZzR;
    }

    public zz0B(zzZOZ zzzoz, zzZOX zzzox) throws Exception {
        this(zzzoz);
        long position = zzzox.zzq().getPosition();
        zzzox.zzXc();
        int iZzXc = zzzox.zzXc();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iZzXc; i++) {
            zzZQG.zzZ((ArrayList<zz0F>) arrayList, new zz0F(zzzox));
        }
        this.zzdV = 1252;
        int iZzT = zzT(arrayList, 1);
        if (iZzT != -1) {
            zzzox.zzq().zzH(((long) iZzT) + position);
            Object objZzY = zzY(zzzox, 0);
            if (objZzY instanceof Short) {
                this.zzdV = ((Short) objZzY).shortValue() & 65535;
            }
        }
        HashMap map = new HashMap();
        int iZzT2 = zzT(arrayList, 0);
        if (iZzT2 != -1) {
            zzzox.zzq().zzH(((long) iZzT2) + position);
            try {
                zzZ(zzzox, (HashMap<Integer, String>) map, this.zzdV);
            } catch (Exception unused) {
                map.clear();
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            zz0F zz0f = (zz0F) arrayList.get(i2);
            long j = ((long) zz0f.zze0) & 268435455;
            if (j >= 2 && j <= 2147483647L) {
                zzzox.zzq().zzH(((long) zz0f.zzdZ) + position);
                Object objZzY2 = zzY(zzzox, this.zzdV);
                if (objZzY2 != null) {
                    this.zzdW.zzZ(new zz0E(zz0f.zze0, (String) zzQW.zzZ(map, Integer.valueOf(zz0f.zze0)), objZzY2));
                }
            }
        }
    }

    private static void zzZ(zzZOW zzzow, zz0D zz0d, int i) throws Exception {
        zzzow.zzl(zz0d.zzs8());
        for (int i2 = 0; i2 < zz0d.getCount(); i2++) {
            zz0E zz0eZzTd = zz0d.zzTd(i2);
            if (zz0eZzTd.zzsa()) {
                zzzow.zzl(zz0eZzTd.getId());
                zzY(zzzow, zz0eZzTd.getName(), i);
            }
        }
    }

    private static void zzZ(zzZOW zzzow, Object obj, int i, boolean z) throws Exception {
        String str = (String) zzZKW.zzZ(obj, String.class);
        if (str != null) {
            if (i == 1200) {
                zzzow.zzl(31);
            } else {
                zzzow.zzl(30);
            }
            zzY(zzzow, str, i);
        } else if (obj instanceof Short) {
            zzzow.zzl(2);
            zzzow.zzK(((Short) obj).shortValue());
        } else {
            boolean z2 = obj instanceof Integer;
            if (z2) {
                zzzow.zzl(3);
                zzzow.zzl(((Integer) obj).intValue());
            } else if (z2) {
                zzzow.zzl(19);
                zzzow.zzl(((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                zzzow.zzl(5);
                zzzow.writeDouble(((Double) obj).doubleValue());
            } else {
                if (obj instanceof Boolean) {
                    zzzow.zzl(11);
                    zzzow.zzK((short) (((Boolean) obj).booleanValue() ? -1 : 0));
                } else if (obj instanceof zzZQ9) {
                    zzzow.zzl(64);
                    zzZQ9 zzzq9 = (zzZQ9) obj;
                    if (!zzZQ9.zzZ(zzzq9, zzZQ9.zz35)) {
                        zzzow.zzQ(zzR1.zzZ(zzzq9, "dateTime"));
                    } else {
                        zzzow.zzQ(0L);
                    }
                } else if (obj instanceof byte[]) {
                    zzzow.zzl(65);
                    byte[] bArr = (byte[]) obj;
                    zzzow.zzl(bArr.length);
                    zzzow.writeBytes(bArr);
                } else if (obj instanceof String[]) {
                    if (i == 1200) {
                        zzzow.zzl(4127);
                    } else {
                        zzzow.zzl(4126);
                    }
                    String[] strArr = (String[]) obj;
                    zzzow.zzl(strArr.length);
                    int length = strArr.length;
                    while (i < length) {
                        zzY(zzzow, strArr[i], i);
                        i++;
                    }
                } else if (obj instanceof Object[]) {
                    zzzow.zzl(EditingLanguage.FRENCH_SWITZERLAND);
                    Object[] objArr = (Object[]) obj;
                    zzzow.zzl(objArr.length);
                    for (Object obj2 : objArr) {
                        zzZ(zzzow, obj2, i, false);
                    }
                } else {
                    throw new UnsupportedOperationException("Do not know how to write a property value of this type.");
                }
            }
        }
        if (z) {
            zzZYQ.zzV(zzzow.zzq(), 4);
        }
    }

    private static void zzY(zzZOW zzzow, String str, int i) throws Exception {
        if (i == 1200) {
            zzZ(zzzow, str);
            zzZYQ.zzV(zzzow.zzq(), 4);
        } else {
            zzZ(zzzow, str, i);
        }
    }

    private static void zzZ(zzZOW zzzow, String str, int i) throws Exception {
        byte[] bytes = zzZO0.zzQz(i).getBytes(zzZKN.zzQ(str, (char) 0));
        zzzow.zzl(bytes.length);
        zzzow.writeBytes(bytes);
    }

    private static void zzZ(zzZOW zzzow, String str) throws Exception {
        zzzow.zzl(str.length() + 1);
        zzzow.writeBytes(zzZO0.zzhU().getBytes(str));
        zzzow.zzK((short) 0);
    }
}
