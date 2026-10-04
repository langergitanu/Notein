package o00O;

import android.graphics.PointF;
import com.facebook.common.callercontext.ContextChain;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import o00O0oo0.C24971OooOO0o;
import o00OO000.OooO0OO;
import o00OO00O.C24985OooO0oO;

/* JADX INFO: renamed from: o00O.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24791OooOooo implements InterfaceC24795Oooo0OO<C24971OooOO0o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C24791OooOooo f84051OooO00o = new C24791OooOooo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0OO.OooO00o f84052OooO0O0 = OooO0OO.OooO00o.OooO00o("c", "v", ContextChain.TAG_INFRA, "o");

    @Override // o00O.InterfaceC24795Oooo0OO
    public final C24971OooOO0o OooO00o(o00OO000.OooO0OO oooO0OO, float f) throws IOException {
        if (oooO0OO.ooOO() == OooO0OO.OooO0O0.f84726OooOo0o) {
            oooO0OO.OooO00o();
        }
        oooO0OO.OooO0OO();
        ArrayList arrayListOooO0OO = null;
        ArrayList arrayListOooO0OO2 = null;
        ArrayList arrayListOooO0OO3 = null;
        boolean zOooo000 = false;
        while (oooO0OO.OooOooo()) {
            int iO0Oo0oo = oooO0OO.o0Oo0oo(f84052OooO0O0);
            if (iO0Oo0oo == 0) {
                zOooo000 = oooO0OO.Oooo000();
            } else if (iO0Oo0oo == 1) {
                arrayListOooO0OO = C24779OooOOo.OooO0OO(oooO0OO, f);
            } else if (iO0Oo0oo == 2) {
                arrayListOooO0OO2 = C24779OooOOo.OooO0OO(oooO0OO, f);
            } else if (iO0Oo0oo != 3) {
                oooO0OO.o00000OO();
                oooO0OO.o00000oO();
            } else {
                arrayListOooO0OO3 = C24779OooOOo.OooO0OO(oooO0OO, f);
            }
        }
        oooO0OO.OooOOo0();
        if (oooO0OO.ooOO() == OooO0OO.OooO0O0.f84725OooOo) {
            oooO0OO.OooOOO0();
        }
        if (arrayListOooO0OO == null || arrayListOooO0OO2 == null || arrayListOooO0OO3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListOooO0OO.isEmpty()) {
            return new C24971OooOO0o(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListOooO0OO.size();
        PointF pointF = (PointF) arrayListOooO0OO.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListOooO0OO.get(i);
            int i2 = i - 1;
            arrayList.add(new o00000O0.OooO0O0(C24985OooO0oO.OooO00o((PointF) arrayListOooO0OO.get(i2), (PointF) arrayListOooO0OO3.get(i2)), C24985OooO0oO.OooO00o(pointF2, (PointF) arrayListOooO0OO2.get(i)), pointF2));
        }
        if (zOooo000) {
            PointF pointF3 = (PointF) arrayListOooO0OO.get(0);
            int i3 = size - 1;
            arrayList.add(new o00000O0.OooO0O0(C24985OooO0oO.OooO00o((PointF) arrayListOooO0OO.get(i3), (PointF) arrayListOooO0OO3.get(i3)), C24985OooO0oO.OooO00o(pointF3, (PointF) arrayListOooO0OO2.get(0)), pointF3));
        }
        return new C24971OooOO0o(pointF, zOooo000, arrayList);
    }
}
