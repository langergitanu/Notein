package o0O0OOO0;

import Oooo0.OooOo00;
import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O.EnumC33551OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
public class OooO00o implements o0O0OO0.OooO0O0 {
    public static final double OooO0O0(double d, EnumC33551OooO0OO enumC33551OooO0OO, EnumC33551OooO0OO targetUnit) {
        OooOOO0.OooO0oO(targetUnit, "targetUnit");
        long jConvert = targetUnit.f121158OooOo0o.convert(1L, enumC33551OooO0OO.f121158OooOo0o);
        return jConvert > 0 ? d * jConvert : d / r8.convert(1L, r9);
    }

    public static final long OooO0OO(long j, EnumC33551OooO0OO sourceUnit, EnumC33551OooO0OO targetUnit) {
        OooOOO0.OooO0oO(sourceUnit, "sourceUnit");
        OooOOO0.OooO0oO(targetUnit, "targetUnit");
        return targetUnit.f121158OooOo0o.convert(j, sourceUnit.f121158OooOo0o);
    }

    @Override // o0O0OO0.OooO0O0
    public int OooO00o(Context context) {
        Point point = new Point();
        Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
        int i = point.x;
        int i2 = point.y;
        return i > i2 ? i2 : i2 - OooOo00.OooOO0o(context);
    }
}
