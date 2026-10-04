package o0oo0oo;

import Oooo0oO.C21034OooOOOo;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: o0oo0oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31368OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public short f112009OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public short f112010OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AbstractC31358OooO f112011OooO0OO = null;

    public final Path OooO00o() {
        AbstractC31358OooO abstractC31358OooO = this.f112011OooO0OO;
        int iOooO0o0 = abstractC31358OooO.OooO0o0();
        C31371OooOOO0[] c31371OooOOO0Arr = new C31371OooOOO0[iOooO0o0];
        int i = 0;
        int i2 = 0;
        int iOooO0oO = -1;
        while (true) {
            boolean z = true;
            if (i >= iOooO0o0) {
                break;
            }
            if (iOooO0oO == -1) {
                iOooO0oO = abstractC31358OooO.OooO0oO(i2);
            }
            boolean z2 = iOooO0oO == i;
            if (z2) {
                i2++;
                iOooO0oO = -1;
            }
            short sOooO0o = abstractC31358OooO.OooO0o(i);
            short sOooO0O0 = abstractC31358OooO.OooO0O0(i);
            if ((abstractC31358OooO.OooO0OO(i) & 1) == 0) {
                z = false;
            }
            c31371OooOOO0Arr[i] = new C31371OooOOO0(sOooO0o, sOooO0O0, z, z2);
            i++;
        }
        Path path = new Path();
        int i3 = 0;
        for (int i4 = 0; i4 < iOooO0o0; i4++) {
            C31371OooOOO0 c31371OooOOO0 = c31371OooOOO0Arr[i4];
            if (c31371OooOOO0.f112016OooO0Oo) {
                C31371OooOOO0 c31371OooOOO02 = c31371OooOOO0Arr[i3];
                ArrayList arrayList = new ArrayList();
                for (int i5 = i3; i5 <= i4; i5++) {
                    arrayList.add(c31371OooOOO0Arr[i5]);
                }
                if (c31371OooOOO0Arr[i3].f112015OooO0OO) {
                    arrayList.add(c31371OooOOO02);
                } else if (c31371OooOOO0Arr[i4].f112015OooO0OO) {
                    arrayList.add(0, c31371OooOOO0);
                } else {
                    int i6 = c31371OooOOO02.f112013OooO00o;
                    int iOooO00o = C21034OooOOOo.OooO00o(c31371OooOOO0.f112013OooO00o, i6, 2, i6);
                    int i7 = c31371OooOOO02.f112014OooO0O0;
                    C31371OooOOO0 c31371OooOOO03 = new C31371OooOOO0(iOooO00o, C21034OooOOOo.OooO00o(c31371OooOOO0.f112014OooO0O0, i7, 2, i7), true, false);
                    arrayList.add(0, c31371OooOOO03);
                    arrayList.add(c31371OooOOO03);
                }
                C31371OooOOO0 c31371OooOOO04 = (C31371OooOOO0) arrayList.get(0);
                path.moveTo(c31371OooOOO04.f112013OooO00o, c31371OooOOO04.f112014OooO0O0);
                int size = arrayList.size();
                int i8 = 1;
                while (i8 < size) {
                    C31371OooOOO0 c31371OooOOO05 = (C31371OooOOO0) arrayList.get(i8);
                    if (c31371OooOOO05.f112015OooO0OO) {
                        path.lineTo(c31371OooOOO05.f112013OooO00o, c31371OooOOO05.f112014OooO0O0);
                    } else {
                        int i9 = i8 + 1;
                        if (((C31371OooOOO0) arrayList.get(i9)).f112015OooO0OO) {
                            C31371OooOOO0 c31371OooOOO06 = (C31371OooOOO0) arrayList.get(i9);
                            path.quadTo(c31371OooOOO05.f112013OooO00o, c31371OooOOO05.f112014OooO0O0, c31371OooOOO06.f112013OooO00o, c31371OooOOO06.f112014OooO0O0);
                            i8 = i9;
                        } else {
                            C31371OooOOO0 c31371OooOOO07 = (C31371OooOOO0) arrayList.get(i9);
                            int i10 = c31371OooOOO05.f112013OooO00o;
                            int iOooO00o2 = C21034OooOOOo.OooO00o(c31371OooOOO07.f112013OooO00o, i10, 2, i10);
                            path.quadTo(i10, c31371OooOOO05.f112014OooO0O0, iOooO00o2, C21034OooOOOo.OooO00o(c31371OooOOO07.f112014OooO0O0, r7, 2, r7));
                        }
                    }
                    i8++;
                }
                path.close();
                i3 = i4 + 1;
            }
        }
        return path;
    }
}
