package com.aspose.words.internal.p560a1;

import com.aspose.words.internal.zzZHO;
import com.aspose.words.internal.zzZHU;
import com.aspose.words.internal.zzZHV;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class WindowsNativeCall {
    private static volatile WindowsNativeCall zzWRW;
    private static boolean zzWRX;

    static {
        try {
            zzWRX = new zzZHO().load();
        } catch (Throwable th) {
            zzZHV.zzY(th);
        }
        zzZHV.zzM("Is library loaded: " + zzWRX);
    }

    private WindowsNativeCall() {
    }

    public static synchronized WindowsNativeCall getInstance() {
        try {
            if (zzZHU.zzss() && zzWRX) {
                if (zzWRW == null) {
                    zzWRW = new WindowsNativeCall();
                }
                return zzWRW;
            }
            return null;
        } finally {
        }
    }

    public native void createGlobalPrinterDC(String str);

    public native void deleteGlobalPrinterDC();

    public native int getCharWidthPoints(int i, String str, float f, int i2, byte b, boolean z);

    public native int[] getCharWidthsPoints(int[] iArr, String str, float f, int i, byte b, boolean z);

    public native int getDpiY();

    public native Map<String, Byte> getFontsPitchAndFamily();

    public native double[] getPrinterFontMetrics(String str, float f, int i, byte b, boolean z);

    public native Map<String, String> readRegistryStringValues(int i, String str);
}
