package OooOoO;

import com.aspose.slides.internal.p071cz.C2839ny;
import java.util.List;
import o0Oo0oOo.o00Oo0;
import oO00o00o.InterfaceC32331OooO0OO;
import oO0OOOoO.C33008OooO;

/* JADX INFO: renamed from: OooOoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C20503OooO00o implements InterfaceC32331OooO0OO {
    public static double OooO00o(C2839ny c2839ny, double d) {
        return c2839ny.m12213h4().m12521x1().m12484x1() / d;
    }

    public static float OooO0O0(float f, float f2, float f3, float f4) {
        return ((f - f2) / f3) + f4;
    }

    @Override // oO00o00o.InterfaceC32331OooO0OO
    public Object apply(Object obj) {
        List list = (List) obj;
        o00Oo0.OooO00o(list, "source is null");
        return new C33008OooO(list);
    }
}
