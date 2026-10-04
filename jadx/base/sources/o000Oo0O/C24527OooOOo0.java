package o000Oo0O;

import OooOoOO.C20519OooO0Oo;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.WeakHashMap;
import oO00ooO.C32447OooOOo;

/* JADX INFO: renamed from: o000Oo0O.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24527OooOOo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C32447OooOOo f82974OooO0O0 = C20519OooO0Oo.OooO0OO(new OooOOO());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C32447OooOOo f82975OooO0OO = C20519OooO0Oo.OooO0OO(new OooOOOO());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Paint f82976OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakHashMap<Canvas, Boolean> f82977OooO00o = new WeakHashMap<>();

    static {
        Paint paint = new Paint();
        BlendMode unused = BlendMode.DST;
        paint.setBlendMode(BlendMode.DST);
        paint.setColor(0);
        f82976OooO0Oo = paint;
    }
}
