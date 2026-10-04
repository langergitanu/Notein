package com.aspose.words;

import OooOoo.C20593OooO0Oo;
import com.aspose.words.internal.C22246OooO0oo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFF {
    private IResourceLoadingCallback zzYSe;
    private IWarningCallback zzZG0;
    private HashMap<String, byte[]> zzYmB = new HashMap<>();
    private HashMap<String, byte[]> zzYmA = new HashMap<>();
    private int zzYob = 100000;

    public zzZFF() {
    }

    private void zzKg(String str) {
        if (this.zzZG0 != null) {
            if (str.length() > 256) {
                str = C22246OooO0oo.OooO00o(new StringBuilder(), str, "...", 0, 256);
            }
            this.zzZG0.warning(new WarningInfo(1, 16, C20593OooO0Oo.OooO0O0("Couldn't load a resource from '", str, "'.")));
        }
    }

    private byte[] zzKh(String str) throws Exception {
        byte[] bArrZzZX = null;
        try {
            com.aspose.words.internal.zzZOP zzzopZzC = com.aspose.words.internal.zzZXR.zzC(str, this.zzYob);
            try {
                if (zzzopZzC.getLength() > 0) {
                    bArrZzZX = com.aspose.words.internal.zzZYQ.zzZX(zzzopZzC);
                }
                zzzopZzC.close();
            } catch (Throwable th) {
                if (zzzopZzC != null) {
                    zzzopZzC.close();
                }
                throw th;
            }
        } catch (Exception unused) {
        }
        if (bArrZzZX == null) {
            zzKg(str);
        }
        return bArrZzZX;
    }

    private byte[] zzN(String str, String str2, int i) throws Exception {
        if (this.zzYmA.containsKey(str)) {
            return this.zzYmA.get(str);
        }
        if (this.zzYmB.containsKey(str2)) {
            return this.zzYmB.get(str2);
        }
        byte[] bArrZzZG = zzZG(str2, i);
        this.zzYmB.put(str2, bArrZzZG);
        return bArrZzZG;
    }

    private zzYJI zzO(String str, String str2, int i) throws Exception {
        zzYJI zzyjiZzZH;
        int iResourceLoading = 0;
        byte[] bArrZzXC = null;
        if (!com.aspose.words.internal.zzZYD.zzXk(str2)) {
            return new zzYJI(null, 0);
        }
        zzYJI zzyjiZzZH2 = zzZH(str2, i);
        if (zzyjiZzZH2 != null) {
            return zzyjiZzZH2;
        }
        String strZz6 = com.aspose.words.internal.zzZVR.zz6(str, str2);
        if (this.zzYSe != null) {
            ResourceLoadingArgs resourceLoadingArgs = new ResourceLoadingArgs(strZz6, str2, i);
            iResourceLoading = this.zzYSe.resourceLoading(resourceLoadingArgs);
            if (!com.aspose.words.internal.zzZKN.equals(resourceLoadingArgs.getUri(), strZz6)) {
                strZz6 = resourceLoadingArgs.getUri();
                if (iResourceLoading == 0 && (zzyjiZzZH = zzZH(resourceLoadingArgs.getUri(), i)) != null) {
                    return zzyjiZzZH;
                }
            }
            if (iResourceLoading == 2) {
                bArrZzXC = resourceLoadingArgs.getData();
            }
        }
        if (iResourceLoading == 0) {
            bArrZzXC = zzN(str2, strZz6, i);
        }
        if (i == 0) {
            bArrZzXC = zzY23.zzXC(bArrZzXC);
        }
        return new zzYJI(bArrZzXC, iResourceLoading);
    }

    private byte[] zzZ1(String str, String str2) throws Exception {
        if (com.aspose.words.internal.zzZQF.zzY(this.zzYmA, str2)) {
            return zzO(str, str2, 0).zzYlP();
        }
        return null;
    }

    private byte[] zzZG(String str, int i) throws Exception {
        if (i == 0) {
            if (com.aspose.words.internal.zzZVR.zzWz(str)) {
                return null;
            }
            return zzKh(str);
        }
        if (i == 1 || i == 2) {
            return zzKh(str);
        }
        return null;
    }

    private zzYJI zzZH(String str, int i) {
        zzKG zzkgZzRT = zzKG.zzRT(str);
        if (zzkgZzRT == null) {
            return null;
        }
        if (zzkgZzRT.getData().length == 0) {
            zzKg(str);
            return new zzYJI(null, 2);
        }
        byte[] bArrZzZTv = zzkgZzRT.zzZTv();
        if (i == 0 && !com.aspose.words.internal.zzEF.zzZD(bArrZzZTv)) {
            bArrZzZTv = zzkgZzRT.getData();
        }
        return new zzYJI(bArrZzZTv, 2);
    }

    public final int getWebRequestTimeout() {
        return this.zzYob;
    }

    public final void setWebRequestTimeout(int i) {
        this.zzYob = i;
    }

    public final byte[] zzM(String str, String str2, boolean z) throws Exception {
        zzYJI zzyjiZzO = zzO(str, str2, 0);
        if (zzyjiZzO.zzYlO() == 1) {
            return null;
        }
        if (zzZGZ.zzY9(zzyjiZzO.zzYlP())) {
            return zzyjiZzO.zzYlP();
        }
        if (zzyjiZzO.zzYlO() == 0) {
            byte[] bArrZzZ1 = zzZ1(str, str2);
            if (zzZGZ.zzY9(bArrZzZ1)) {
                return bArrZzZ1;
            }
        }
        if (z) {
            return com.aspose.words.internal.zzEF.zzDL();
        }
        return null;
    }

    public final void zzW(String str, byte[] bArr) {
        this.zzYmA.put(str, bArr);
    }

    public final String zzZ2(String str, String str2) throws Exception {
        zzYJI zzyjiZzO = zzO(str, str2, 1);
        if (zzyjiZzO.zzYlP() != null) {
            return com.aspose.words.internal.zzZO0.zzhV().zzZn(zzyjiZzO.zzYlP());
        }
        return null;
    }

    public final byte[] zzZ3(String str, String str2) throws Exception {
        return zzO(str, str2, 2).zzYlP();
    }

    public final byte[] zzZ4(String str, String str2) throws Exception {
        return zzM(str, str2, true);
    }

    public final void zzu(Shape shape) throws Exception {
        if (shape.getImageData().isLinkOnly()) {
            zzYJI zzyjiZzO = zzO("", shape.getImageData().getSourceFullName(), 0);
            if (com.aspose.words.internal.zzZ1.zzX(zzyjiZzO.zzYlP())) {
                int iZzYlO = zzyjiZzO.zzYlO();
                if (iZzYlO != 0) {
                    if (iZzYlO != 2) {
                        return;
                    } else {
                        shape.getImageData().setImageBytes(zzyjiZzO.zzYlP());
                    }
                }
                com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(zzyjiZzO.zzYlP());
                shape.zze(ConvertUtil.pixelToPoint(zzegZzZT.getWidth(), zzegZzZT.getHorizontalResolution()), ConvertUtil.pixelToPoint(zzegZzZT.getHeight(), zzegZzZT.getVerticalResolution()));
            }
        }
    }

    public zzZFF(IResourceLoadingCallback iResourceLoadingCallback, IWarningCallback iWarningCallback) {
        this.zzYSe = iResourceLoadingCallback;
        this.zzZG0 = iWarningCallback;
    }
}
