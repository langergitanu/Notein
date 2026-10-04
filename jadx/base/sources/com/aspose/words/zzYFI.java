package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFI {
    public static Shading zzQ(zzZS zzzs, int i) {
        Shading shading = (Shading) zzzs.zzPk(i);
        if (shading != null) {
            return shading;
        }
        Shading shading2 = new Shading();
        zzzs.zzQ(i, shading2);
        return shading2;
    }

    public static void zzY(zzYFT zzyft, Shading shading, zzYET zzyet) throws Exception {
        shading.zzZJ(zzyft.zzYgw().zzp0(zzyet.zzYeT()));
    }

    public static void zzZ(Shading shading, zzYET zzyet) throws Exception {
        shading.setTexture(zzY0C.zzVV(zzYEO.zznD(zzyet.zzYeT())));
    }

    public static void zzY(Shading shading, zzYET zzyet) throws Exception {
        shading.setTexture(zzYHY.zzCy(zzyet.getName()));
    }

    public static void zzZ(zzYFT zzyft, Shading shading, zzYET zzyet) throws Exception {
        shading.zzZK(zzyft.zzYgw().zzp0(zzyet.zzYeT()));
    }
}
