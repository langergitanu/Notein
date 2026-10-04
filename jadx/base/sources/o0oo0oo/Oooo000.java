package o0oo0oo;

import Oooo0.C20856OooooOo;
import android.util.Log;
import androidx.core.view.InputDeviceCompat;
import com.aspose.words.StyleIdentifier;
import java.io.IOException;
import o0oo0ooo.C31413OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo000 extends C31400Oooo0o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public String[] f112104OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f112105OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f112106OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f112107OooO0oo;

    @Override // o0oo0oo.C31400Oooo0o0
    public final void OooO00o(C31401Oooo0oO c31401Oooo0oO, AbstractC31397Oooo0O0 abstractC31397Oooo0O0) throws IOException {
        String[] strArr;
        this.f112105OooO0o = abstractC31397Oooo0O0.OooOOoo();
        this.f112106OooO0oO = abstractC31397Oooo0O0.OooOOoo();
        abstractC31397Oooo0O0.Oooo000();
        abstractC31397Oooo0O0.Oooo000();
        this.f112107OooO0oo = abstractC31397Oooo0O0.Oooo0OO();
        abstractC31397Oooo0O0.Oooo0OO();
        abstractC31397Oooo0O0.Oooo0OO();
        abstractC31397Oooo0O0.Oooo0OO();
        abstractC31397Oooo0O0.Oooo0OO();
        float f = this.f112105OooO0o;
        int i = 0;
        if (f == 1.0f) {
            String[] strArr2 = new String[StyleIdentifier.COLORFUL_LIST_ACCENT_6];
            this.f112104OooO = strArr2;
            System.arraycopy(C31403OoooO0.f112130OooO00o, 0, strArr2, 0, StyleIdentifier.COLORFUL_LIST_ACCENT_6);
        } else if (f == 2.0f) {
            int iOoOO = abstractC31397Oooo0O0.ooOO();
            int[] iArr = new int[iOoOO];
            this.f112104OooO = new String[iOoOO];
            int iMax = Integer.MIN_VALUE;
            for (int i2 = 0; i2 < iOoOO; i2++) {
                int iOoOO2 = abstractC31397Oooo0O0.ooOO();
                iArr[i2] = iOoOO2;
                if (iOoOO2 <= 32767) {
                    iMax = Math.max(iMax, iOoOO2);
                }
            }
            if (iMax >= 258) {
                int i3 = iMax - 257;
                strArr = new String[i3];
                int i4 = 0;
                while (i4 < i3) {
                    try {
                        strArr[i4] = abstractC31397Oooo0O0.Oooo00o(abstractC31397Oooo0O0.readUnsignedByte(), C31413OooO0O0.f112169OooO00o);
                        i4++;
                    } catch (IOException e) {
                        Log.w("PdfBox-Android", C20856OooooOo.OooO0O0("Error reading names in PostScript table at entry ", i4, " of ", ", setting remaining entries to .notdef", i3), e);
                        while (i4 < i3) {
                            strArr[i4] = ".notdef";
                            i4++;
                        }
                    }
                }
            } else {
                strArr = null;
            }
            while (i < iOoOO) {
                int i5 = iArr[i];
                if (i5 >= 0 && i5 < 258) {
                    this.f112104OooO[i] = C31403OoooO0.f112130OooO00o[i5];
                } else if (i5 < 258 || i5 > 32767) {
                    this.f112104OooO[i] = ".undefined";
                } else {
                    this.f112104OooO[i] = strArr[i5 - 258];
                }
                i++;
            }
        } else if (f == 2.5f) {
            int iOooo0OO = c31401Oooo0oO.Oooo0OO();
            int[] iArr2 = new int[iOooo0OO];
            int i6 = 0;
            while (i6 < iOooo0OO) {
                int i7 = abstractC31397Oooo0O0.read();
                if (i7 > 127) {
                    i7 += InputDeviceCompat.SOURCE_ANY;
                }
                int i8 = i6 + 1;
                iArr2[i6] = i7 + i8;
                i6 = i8;
            }
            this.f112104OooO = new String[iOooo0OO];
            while (true) {
                String[] strArr3 = this.f112104OooO;
                if (i >= strArr3.length) {
                    break;
                }
                int i9 = iArr2[i];
                if (i9 < 0 || i9 >= 258) {
                    Log.d("PdfBox-Android", "incorrect glyph name index " + i9 + ", valid numbers 0..258");
                } else {
                    String str = C31403OoooO0.f112130OooO00o[i9];
                    if (str != null) {
                        strArr3[i] = str;
                    }
                }
                i++;
            }
        } else if (f == 3.0f) {
            Log.d("PdfBox-Android", "No PostScript name information is provided for the font " + this.f112122OooO0o0.getName());
        }
        this.f112121OooO0Oo = true;
    }
}
