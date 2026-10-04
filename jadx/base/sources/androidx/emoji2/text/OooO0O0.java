package androidx.emoji2.text;

import OooOoo.C20632OoooOOo;
import android.os.Build;
import androidx.emoji2.text.OooO0OO;
import java.util.ArrayList;
import o000O000.C24381OooO0oO;
import o000O000.C24382OooO0oo;
import o000O000.C24385OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends OooO0OO.AbstractC21866OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO.OooO00o f64704OooO00o;

    public OooO0O0(OooO0OO.OooO00o oooO00o) {
        this.f64704OooO00o = oooO00o;
    }

    @Override // androidx.emoji2.text.OooO0OO.AbstractC21866OooO0oo
    public final void OooO00o(Throwable th) {
        this.f64704OooO00o.f64718OooO00o.OooO0o0(th);
    }

    @Override // androidx.emoji2.text.OooO0OO.AbstractC21866OooO0oo
    public final void OooO0O0(C24385OooOO0o c24385OooOO0o) {
        OooO0OO.OooO00o oooO00o = this.f64704OooO00o;
        oooO00o.f64717OooO0OO = c24385OooOO0o;
        C24385OooOO0o c24385OooOO0o2 = oooO00o.f64717OooO0OO;
        OooO0OO oooO0OO = oooO00o.f64718OooO00o;
        oooO00o.f64716OooO0O0 = new C24382OooO0oo(c24385OooOO0o2, oooO0OO.f64714OooO0oO, oooO0OO.f64707OooO, Build.VERSION.SDK_INT >= 34 ? C24381OooO0oO.OooO00o() : C20632OoooOOo.OooO0O0());
        OooO0OO oooO0OO2 = oooO00o.f64718OooO00o;
        oooO0OO2.getClass();
        ArrayList arrayList = new ArrayList();
        oooO0OO2.f64708OooO00o.writeLock().lock();
        try {
            oooO0OO2.f64710OooO0OO = 1;
            arrayList.addAll(oooO0OO2.f64709OooO0O0);
            oooO0OO2.f64709OooO0O0.clear();
            oooO0OO2.f64708OooO00o.writeLock().unlock();
            oooO0OO2.f64711OooO0Oo.post(new OooO0OO.OooO0o(arrayList, oooO0OO2.f64710OooO0OO, null));
        } catch (Throwable th) {
            oooO0OO2.f64708OooO00o.writeLock().unlock();
            throw th;
        }
    }
}
