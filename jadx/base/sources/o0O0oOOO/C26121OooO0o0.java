package o0O0oOOO;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0O0oOOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26121OooO0o0 implements o0O0oo00.OooO0O0<Canvas> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Canvas f89173OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Context f89174OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f89175OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f89176OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f89177OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f89178OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f89179OooO0oO;

    public C26121OooO0o0() {
    }

    public static void OooO0Oo(C26121OooO0o0 c26121OooO0o0, Canvas canvas, Context context, float f, float f2, int i) {
        c26121OooO0o0.getClass();
        OooOOO0.OooO0oO(canvas, "canvas");
        c26121OooO0o0.f89173OooO00o = canvas;
        c26121OooO0o0.f89174OooO0O0 = context;
        c26121OooO0o0.f89177OooO0o = 0.0f;
        c26121OooO0o0.f89179OooO0oO = 0.0f;
    }

    @Override // o0O0oo00.OooO0O0
    public final Context OooO00o() {
        return this.f89174OooO0O0;
    }

    @Override // o0O0oo00.OooO0O0
    public final boolean OooO0O0() {
        return this.f89176OooO0Oo;
    }

    public final Canvas OooO0OO() {
        Canvas canvas = this.f89173OooO00o;
        if (canvas != null) {
            return canvas;
        }
        OooOOO0.OooOOOO("canvas");
        throw null;
    }

    @Override // o0O0oo00.OooO0O0
    public final void clear() {
        OooO0OO().drawColor(0, PorterDuff.Mode.CLEAR);
    }

    @Override // o0O0oo00.OooO0O0
    public final C32443OooOOO<Float, Float> getOffset() {
        return new C32443OooOOO<>(Float.valueOf(this.f89177OooO0o), Float.valueOf(this.f89179OooO0oO));
    }

    @Override // o0O0oo00.OooO0O0
    public final C32443OooOOO<Float, Float> getSize() {
        return new C32443OooOOO<>(Float.valueOf(OooO0OO().getWidth()), Float.valueOf(OooO0OO().getHeight()));
    }

    @Override // o0O0oo00.OooO0O0
    public final Canvas getTarget() {
        return OooO0OO();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26121OooO0o0(Canvas canvas, Context context) {
        this();
        OooOOO0.OooO0oO(canvas, "canvas");
        OooO0Oo(this, canvas, context, 0.0f, 0.0f, 60);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26121OooO0o0(Canvas canvas, Context context, float f, float f2) {
        this();
        OooOOO0.OooO0oO(canvas, "canvas");
        OooO0Oo(this, canvas, context, f, f2, 48);
    }

    public C26121OooO0o0(Canvas canvas, Context context, float f, float f2, int i) {
        this();
        this.f89173OooO00o = canvas;
        this.f89174OooO0O0 = context;
        this.f89177OooO0o = f;
        this.f89179OooO0oO = f2;
    }
}
