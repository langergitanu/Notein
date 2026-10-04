package o00oOOOO;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import kotlin.jvm.internal.OooOOO0;
import o00O00oO.OooOO0O;
import o00o0o.AbstractC25434OooO00o;
import o00o0o00.C25438OooO00o;
import o00oOOO0.InterfaceC25581OooO00o;
import o00oOOo0.C25593OooO0O0;
import o00oOOo0.InterfaceC25592OooO00o;
import o00oOooO.C25631OooO00o;
import o00oo00O.C25647OooO00o;
import o00oo0OO.AbstractC25682OooO0O0;

/* JADX INFO: renamed from: o00oOOOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25585OooO00o implements InterfaceC25581OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Bitmap.Config f87273OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC25682OooO0O0 f87274OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC25586OooO0O0 f87275OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0O f87276OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f87277OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C25631OooO00o f87278OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC25592OooO00o f87279OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C25593OooO0O0 f87280OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Paint f87281OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Rect f87282OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f87283OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f87284OooOOO0;

    public C25585OooO00o(AbstractC25682OooO0O0 platformBitmapFactory, InterfaceC25586OooO0O0 interfaceC25586OooO0O0, OooOO0O oooOO0O, C25631OooO00o c25631OooO00o, boolean z, InterfaceC25592OooO00o interfaceC25592OooO00o, C25593OooO0O0 c25593OooO0O0) {
        OooOOO0.OooO0oO(platformBitmapFactory, "platformBitmapFactory");
        this.f87274OooO0O0 = platformBitmapFactory;
        this.f87275OooO0OO = interfaceC25586OooO0O0;
        this.f87276OooO0Oo = oooOO0O;
        this.f87278OooO0o0 = c25631OooO00o;
        this.f87277OooO0o = z;
        this.f87279OooO0oO = interfaceC25592OooO00o;
        this.f87280OooO0oo = c25593OooO0O0;
        this.f87273OooO = Bitmap.Config.ARGB_8888;
        this.f87281OooOO0 = new Paint(6);
        new Path();
        new Matrix();
        OooO0oO();
    }

    @Override // o00oOOO0.InterfaceC25584OooO0Oo
    public final int OooO00o() {
        return this.f87276OooO0Oo.OooO00o();
    }

    @Override // o00oOOO0.InterfaceC25584OooO0Oo
    public final int OooO0O0() {
        return this.f87276OooO0Oo.OooO0O0();
    }

    @Override // o00oOOO0.InterfaceC25584OooO0Oo
    public final int OooO0OO(int i) {
        return this.f87276OooO0Oo.OooO0OO(i);
    }

    public final void OooO0Oo() {
        if (!this.f87277OooO0o) {
            this.f87275OooO0OO.clear();
            return;
        }
        InterfaceC25592OooO00o interfaceC25592OooO00o = this.f87279OooO0oO;
        if (interfaceC25592OooO00o != null) {
            interfaceC25592OooO00o.OooO0O0();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean OooO0o(Canvas canvas, int i, int i2) throws Throwable {
        AbstractC25434OooO00o<Bitmap> abstractC25434OooO00oOooO0o;
        boolean zOooO0o0;
        boolean zOooO00o;
        boolean zOooO00o2;
        AbstractC25434OooO00o<Bitmap> abstractC25434OooO00o = null;
        try {
            boolean z = false;
            int i3 = 1;
            if (this.f87277OooO0o) {
                InterfaceC25592OooO00o interfaceC25592OooO00o = this.f87279OooO0oO;
                AbstractC25434OooO00o<Bitmap> abstractC25434OooO00oOooO00o = interfaceC25592OooO00o != null ? interfaceC25592OooO00o.OooO00o(i, canvas.getWidth(), canvas.getHeight()) : null;
                if (abstractC25434OooO00oOooO00o != null) {
                    try {
                        if (abstractC25434OooO00oOooO00o.Oooo00o()) {
                            Bitmap bitmapOooo000 = abstractC25434OooO00oOooO00o.Oooo000();
                            Rect rect = this.f87282OooOO0O;
                            Paint paint = this.f87281OooOO0;
                            if (rect == null) {
                                canvas.drawBitmap(bitmapOooo000, 0.0f, 0.0f, paint);
                            } else {
                                rect.width();
                                rect.height();
                                canvas.drawBitmap(bitmapOooo000, (Rect) null, rect, paint);
                            }
                            abstractC25434OooO00oOooO00o.close();
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        abstractC25434OooO00o = abstractC25434OooO00oOooO00o;
                        AbstractC25434OooO00o.OooOooo(abstractC25434OooO00o);
                        throw th;
                    }
                }
                if (interfaceC25592OooO00o != null) {
                    interfaceC25592OooO00o.OooO0Oo(canvas.getWidth(), canvas.getHeight());
                }
                AbstractC25434OooO00o.OooOooo(abstractC25434OooO00oOooO00o);
                return false;
            }
            InterfaceC25586OooO0O0 interfaceC25586OooO0O0 = this.f87275OooO0OO;
            if (i2 != 0) {
                C25631OooO00o c25631OooO00o = this.f87278OooO0o0;
                if (i2 == 1) {
                    abstractC25434OooO00oOooO0o = interfaceC25586OooO0O0.OooO0O0();
                    if (abstractC25434OooO00oOooO0o == null || !abstractC25434OooO00oOooO0o.Oooo00o()) {
                        zOooO00o = false;
                    } else {
                        zOooO00o = c25631OooO00o.OooO00o(i, abstractC25434OooO00oOooO0o.Oooo000());
                        if (!zOooO00o) {
                            abstractC25434OooO00oOooO0o.close();
                        }
                    }
                    if (zOooO00o && OooO0o0(i, abstractC25434OooO00oOooO0o, canvas, 1)) {
                        z = true;
                    }
                    zOooO0o0 = z;
                    i3 = 2;
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            abstractC25434OooO00oOooO0o = interfaceC25586OooO0O0.OooO00o();
                            zOooO0o0 = OooO0o0(i, abstractC25434OooO00oOooO0o, canvas, 3);
                            i3 = -1;
                        }
                        return false;
                    }
                    try {
                        abstractC25434OooO00oOooO0o = this.f87274OooO0O0.OooO00o(this.f87283OooOO0o, this.f87284OooOOO0, this.f87273OooO);
                        if (abstractC25434OooO00oOooO0o.Oooo00o()) {
                            zOooO00o2 = c25631OooO00o.OooO00o(i, abstractC25434OooO00oOooO0o.Oooo000());
                            if (!zOooO00o2) {
                                abstractC25434OooO00oOooO0o.close();
                            }
                        } else {
                            zOooO00o2 = false;
                        }
                        if (zOooO00o2 && OooO0o0(i, abstractC25434OooO00oOooO0o, canvas, 2)) {
                            z = true;
                        }
                        zOooO0o0 = z;
                        i3 = 3;
                    } catch (RuntimeException e) {
                        C25438OooO00o.OooO0oO(C25585OooO00o.class, "Failed to create frame bitmap", e);
                    }
                }
            } else {
                abstractC25434OooO00oOooO0o = interfaceC25586OooO0O0.OooO0o(i);
                zOooO0o0 = OooO0o0(i, abstractC25434OooO00oOooO0o, canvas, 0);
            }
            AbstractC25434OooO00o.OooOooo(abstractC25434OooO00oOooO0o);
            return (zOooO0o0 || i3 == -1) ? zOooO0o0 : OooO0o(canvas, i, i3);
        } catch (Throwable th2) {
            th = th2;
            AbstractC25434OooO00o.OooOooo(abstractC25434OooO00o);
            throw th;
        }
    }

    public final boolean OooO0o0(int i, AbstractC25434OooO00o<Bitmap> abstractC25434OooO00o, Canvas canvas, int i2) {
        if (abstractC25434OooO00o == null || !AbstractC25434OooO00o.ooOO(abstractC25434OooO00o)) {
            return false;
        }
        Bitmap bitmapOooo000 = abstractC25434OooO00o.Oooo000();
        Rect rect = this.f87282OooOO0O;
        Paint paint = this.f87281OooOO0;
        if (rect == null) {
            canvas.drawBitmap(bitmapOooo000, 0.0f, 0.0f, paint);
        } else {
            rect.width();
            rect.height();
            canvas.drawBitmap(bitmapOooo000, (Rect) null, rect, paint);
        }
        if (i2 == 3 || this.f87277OooO0o) {
            return true;
        }
        this.f87275OooO0OO.OooO0OO(i, abstractC25434OooO00o);
        return true;
    }

    public final void OooO0oO() {
        C25631OooO00o c25631OooO00o = this.f87278OooO0o0;
        int width = ((C25647OooO00o) c25631OooO00o.f87483OooO0O0).f87537OooO0OO.getWidth();
        this.f87283OooOO0o = width;
        if (width == -1) {
            Rect rect = this.f87282OooOO0O;
            this.f87283OooOO0o = rect != null ? rect.width() : -1;
        }
        int height = ((C25647OooO00o) c25631OooO00o.f87483OooO0O0).f87537OooO0OO.getHeight();
        this.f87284OooOOO0 = height;
        if (height == -1) {
            Rect rect2 = this.f87282OooOO0O;
            this.f87284OooOOO0 = rect2 != null ? rect2.height() : -1;
        }
    }
}
