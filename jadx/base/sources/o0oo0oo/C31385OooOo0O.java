package o0oo0oo;

import Oooo0oO.o0Oo0oo;
import android.util.Log;
import com.aspose.slides.internal.p332p7.C22236OooO0Oo;
import java.io.IOException;
import java.lang.reflect.Array;
import o0oo0oo.C31383OooOo0;

/* JADX INFO: renamed from: o0oo0oo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31385OooOo0O extends C31400Oooo0o0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C31383OooOo0[] f112071OooO0o;

    @Override // o0oo0oo.C31400Oooo0o0
    public final void OooO00o(C31401Oooo0oO c31401Oooo0oO, AbstractC31397Oooo0O0 abstractC31397Oooo0O0) throws IOException {
        int iOooo0OO;
        int iOoOO = abstractC31397Oooo0O0.ooOO();
        if (iOoOO != 0) {
            iOoOO = (iOoOO << 16) | abstractC31397Oooo0O0.ooOO();
        }
        if (iOoOO == 0) {
            iOooo0OO = abstractC31397Oooo0O0.ooOO();
        } else if (iOoOO == 1) {
            iOooo0OO = (int) abstractC31397Oooo0O0.Oooo0OO();
        } else {
            C22236OooO0Oo.OooO00o(iOoOO, "Skipped kerning table due to an unsupported kerning table version: ", "PdfBox-Android");
            iOooo0OO = 0;
        }
        if (iOooo0OO > 0) {
            this.f112071OooO0o = new C31383OooOo0[iOooo0OO];
            for (int i = 0; i < iOooo0OO; i++) {
                C31383OooOo0 c31383OooOo0 = new C31383OooOo0();
                if (iOoOO == 0) {
                    int iOoOO2 = abstractC31397Oooo0O0.ooOO();
                    if (iOoOO2 != 0) {
                        Log.i("PdfBox-Android", "Unsupported kerning sub-table version: " + iOoOO2);
                    } else {
                        int iOoOO3 = abstractC31397Oooo0O0.ooOO();
                        if (iOoOO3 < 6) {
                            throw new IOException(o0Oo0oo.OooO0O0(iOoOO3, "Kerning sub-table too short, got ", " bytes, expect 6 or more."));
                        }
                        int iOoOO4 = (abstractC31397Oooo0O0.ooOO() & 65280) >> 8;
                        if (iOoOO4 == 0) {
                            C31383OooOo0.OooO00o oooO00o = new C31383OooOo0.OooO00o();
                            int iOoOO5 = abstractC31397Oooo0O0.ooOO();
                            abstractC31397Oooo0O0.ooOO();
                            abstractC31397Oooo0O0.ooOO();
                            abstractC31397Oooo0O0.ooOO();
                            oooO00o.f112069OooOo0o = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iOoOO5, 3);
                            for (int i2 = 0; i2 < iOoOO5; i2++) {
                                int iOoOO6 = abstractC31397Oooo0O0.ooOO();
                                int iOoOO7 = abstractC31397Oooo0O0.ooOO();
                                short sOooo000 = abstractC31397Oooo0O0.Oooo000();
                                int[] iArr = oooO00o.f112069OooOo0o[i2];
                                iArr[0] = iOoOO6;
                                iArr[1] = iOoOO7;
                                iArr[2] = sOooo000;
                            }
                        } else if (iOoOO4 == 2) {
                            Log.i("PdfBox-Android", "Kerning subtable format 2 not yet supported.");
                        } else {
                            C22236OooO0Oo.OooO00o(iOoOO4, "Skipped kerning subtable due to an unsupported kerning subtable version: ", "PdfBox-Android");
                        }
                    }
                } else {
                    if (iOoOO != 1) {
                        throw new IllegalStateException();
                    }
                    Log.i("PdfBox-Android", "Kerning subtable format 1 not yet supported.");
                }
                this.f112071OooO0o[i] = c31383OooOo0;
            }
        }
        this.f112121OooO0Oo = true;
    }
}
