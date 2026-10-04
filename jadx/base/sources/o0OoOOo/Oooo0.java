package o0OoOOo;

import android.media.audiofx.Visualizer;
import java.util.List;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo0 implements Visualizer.OnDataCaptureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ long f103353OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103354OooO0O0;

    public Oooo0(long j, com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o) {
        this.f103353OooO00o = j;
        this.f103354OooO0O0 = oooO0o;
    }

    @Override // android.media.audiofx.Visualizer.OnDataCaptureListener
    public final void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i) {
    }

    @Override // android.media.audiofx.Visualizer.OnDataCaptureListener
    public final void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        if (System.currentTimeMillis() - this.f103353OooO00o >= 100 && bArr != null) {
            float[] fArr = new float[7];
            int length = bArr.length / 7;
            int i2 = 0;
            while (true) {
                float f = 1.0f;
                if (i2 >= 7) {
                    break;
                }
                int i3 = i2 * length;
                float fAbs = 0.0f;
                for (int i4 = i3; i4 < (i2 == 6 ? bArr.length : (i2 + 1) * length); i4++) {
                    fAbs += Math.abs((int) bArr[i4]);
                }
                float fPow = (float) Math.pow((fAbs / (r5 - i3)) / 128.0f, 1.5f);
                if (fPow <= 1.0f) {
                    f = fPow;
                }
                fArr[i2] = f;
                i2++;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= 7) {
                    for (int i6 = 0; i6 < 7; i6++) {
                        oO0O00o.OooO0OO.f116801OooOo0o.getClass();
                        float fNextFloat = oO0O00o.OooO0OO.f116800OooOo.OooO0O0().nextFloat();
                        if (fNextFloat < 0.2f) {
                            fNextFloat = 0.2f;
                        }
                        if (fNextFloat > 0.8f) {
                            fNextFloat = 0.8f;
                        }
                        fArr[i6] = fNextFloat;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                    c20358OooO00o.OooO00o("detectPlayerWaveform. barHeights: " + oOo000Oo.OooOOO.OoooO0O(fArr), new Object[0]);
                } else if (fArr[i5] != 1.0f) {
                    break;
                } else {
                    i5++;
                }
            }
            C33781o00o0O c33781o00o0O = this.f103354OooO0O0.f74236OooOOoo;
            List<Float> listOoooO0O = oOo000Oo.OooOOO.OoooO0O(fArr);
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, listOoooO0O);
        }
    }
}
