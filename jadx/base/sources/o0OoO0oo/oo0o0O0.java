package o0OoO0oo;

import android.graphics.PointF;
import com.orion.notein.data.p602db.entity.PdfInfoEntity;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.ruler.RulerOverlayView;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0o0000o.C29727OooO00o;
import o0o0000o.C29728OooO0Oo;
import o0o0000o.C29729OooO0o0;
import o0o0Oo00.C30603OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class oo0o0O0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f102705OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102706OooOo0o;

    public /* synthetic */ oo0o0O0(Object obj, int i) {
        this.f102706OooOo0o = i;
        this.f102705OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022f  */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) throws Exception {
        Throwable th;
        float f;
        int i;
        PdfInfoEntity pdfInfoEntity = null;
        String strO000OoO = null;
        Object obj2 = this.f102705OooOo;
        switch (this.f102706OooOo0o) {
            case 0:
                o0o0000o.OooO0o delta = (o0o0000o.OooO0o) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(delta, "delta");
                NoteEditorFragment noteEditorFragment = (NoteEditorFragment) obj2;
                RulerOverlayView rulerOverlayView = noteEditorFragment.f73031OoooooO;
                if (rulerOverlayView != null) {
                    int width = rulerOverlayView.getWidth();
                    RulerOverlayView rulerOverlayView2 = noteEditorFragment.f73031OoooooO;
                    if (rulerOverlayView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("rulerOverlayView");
                        throw null;
                    }
                    int height = rulerOverlayView2.getHeight();
                    if (width != 0 && height != 0) {
                        PointF pointF = noteEditorFragment.f73032Ooooooo.f105432OooO0O0;
                        PointF pointF2 = new PointF(pointF.x + delta.f105437OooO00o, pointF.y + delta.f105438OooO0O0);
                        float f2 = noteEditorFragment.f73032Ooooooo.f105434OooO0Oo;
                        C29727OooO00o c29727OooO00o = noteEditorFragment.f73065ooOO;
                        Float f3 = c29727OooO00o.f105416OooO0OO;
                        float f4 = delta.f105439OooO0OO;
                        if (f3 != null) {
                            float f5 = c29727OooO00o.f105417OooO0Oo + f4;
                            c29727OooO00o.f105417OooO0Oo = f5;
                            if (Math.abs(f5) > c29727OooO00o.f105414OooO00o) {
                                float radians = ((float) Math.toRadians(f3.floatValue())) + c29727OooO00o.f105417OooO0Oo;
                                c29727OooO00o.f105416OooO0OO = null;
                                c29727OooO00o.f105417OooO0Oo = 0.0f;
                                float f6 = ((radians - f2) + 3.1415927f) % 6.2831855f;
                                if (f6 < 0.0f) {
                                    f6 += 6.2831855f;
                                }
                                f4 = f6 - 3.1415927f;
                                th = null;
                            } else {
                                th = null;
                                f4 = 0.0f;
                            }
                        } else {
                            float degrees = ((float) Math.toDegrees(f2)) % 360.0f;
                            if (degrees < 0.0f) {
                                degrees += 360.0f;
                            }
                            th = null;
                            float f7 = Float.MAX_VALUE;
                            Float fValueOf = null;
                            for (float f8 : c29727OooO00o.f105415OooO0O0) {
                                float fOooO00o = C29727OooO00o.OooO00o(degrees, f8);
                                if (fOooO00o < f7) {
                                    fValueOf = Float.valueOf(f8);
                                    f7 = fOooO00o;
                                }
                            }
                            if (fValueOf != null) {
                                float fOooO00o2 = C29727OooO00o.OooO00o(degrees, fValueOf.floatValue());
                                float degrees2 = (float) Math.toDegrees(Math.abs(f4));
                                if (fOooO00o2 <= (degrees2 >= 0.5f ? degrees2 < 1.5f ? 5.0f : 6.0f : 0.5f)) {
                                    c29727OooO00o.f105416OooO0OO = fValueOf;
                                    c29727OooO00o.f105417OooO0Oo = 0.0f;
                                    RulerOverlayView rulerOverlayView3 = noteEditorFragment.f73031OoooooO;
                                    if (rulerOverlayView3 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rulerOverlayView");
                                        throw null;
                                    }
                                    rulerOverlayView3.performHapticFeedback(4, 1);
                                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                    float radians2 = ((((float) Math.toRadians(fValueOf.floatValue())) - f2) + 3.1415927f) % 6.2831855f;
                                    if (radians2 < 0.0f) {
                                        radians2 += 6.2831855f;
                                    }
                                    f4 = radians2 - 3.1415927f;
                                }
                            }
                        }
                        float f9 = f2 + f4;
                        PointF pointF3 = delta.f105440OooO0Oo;
                        if (pointF3 != null) {
                            PointF pointF4 = pointF3;
                            if (f4 == 0.0f) {
                                pointF4 = th;
                            }
                            if (pointF4 != 0) {
                                float f10 = noteEditorFragment.f73032Ooooooo.f105433OooO0OO / 2.0f;
                                double d = -f2;
                                f = 2.0f;
                                i = width;
                                float fCos = ((pointF4.x - pointF2.x) * ((float) Math.cos(d))) - ((pointF4.y - pointF2.y) * ((float) Math.sin(d)));
                                float f11 = f10 * noteEditorFragment.f73051o00o0O;
                                float fOooO0o0 = oO0O00oo.OooOO0.OooO0o0(fCos, -f11, f11);
                                double d2 = f2;
                                PointF pointF5 = new PointF((((float) Math.cos(d2)) * fOooO0o0) + pointF2.x, (fOooO0o0 * ((float) Math.sin(d2))) + pointF2.y);
                                float f12 = pointF2.x - pointF5.x;
                                float f13 = pointF2.y - pointF5.y;
                                double d3 = f4;
                                float fCos2 = (float) Math.cos(d3);
                                float fSin = (float) Math.sin(d3);
                                pointF2 = new PointF(((f12 * fCos2) - (f13 * fSin)) + pointF5.x, (f13 * fCos2) + (f12 * fSin) + pointF5.y);
                            } else {
                                f = 2.0f;
                                i = width;
                            }
                            float f14 = i;
                            float f15 = height;
                            PointF pointFOooo0o = noteEditorFragment.Oooo0o(f14, f15, C29729OooO0o0.f105441OooO00o, pointF2);
                            noteEditorFragment.f73032Ooooooo = C29728OooO0Oo.OooO00o(noteEditorFragment.f73032Ooooooo, false, pointFOooo0o, noteEditorFragment.Oooo0oO(f9, f14, f15, pointFOooo0o) * f, f9, 0.0f, 49);
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("NoteEditorFragment");
                            c20358OooO00o.OooOO0("Ruler transform -> center=(%.1f, %.1f) angle=%.3f length=%.1f", Float.valueOf(noteEditorFragment.f73032Ooooooo.f105432OooO0O0.x), Float.valueOf(noteEditorFragment.f73032Ooooooo.f105432OooO0O0.y), Float.valueOf(noteEditorFragment.f73032Ooooooo.f105434OooO0Oo), Float.valueOf(noteEditorFragment.f73032Ooooooo.f105433OooO0OO));
                            RulerOverlayView rulerOverlayView4 = noteEditorFragment.f73031OoooooO;
                            if (rulerOverlayView4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("rulerOverlayView");
                                throw th;
                            }
                            rulerOverlayView4.OooO0OO(noteEditorFragment.f73032Ooooooo);
                            noteEditorFragment.o00o0O();
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            case 1:
                Integer numValueOf = Integer.valueOf(Math.min(((Integer) obj).intValue(), 99));
                C33781o00o0O c33781o00o0O = ((C30603OooO0O0) obj2).f109511OooOo00;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, numValueOf);
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("select * from PdfInfoEntity where id = ?");
                String str = (String) obj2;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    int iOooO0Oo = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "id");
                    int iOooO0Oo2 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "pdf_path");
                    int iOooO0Oo3 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "tn_path");
                    int iOooO0Oo4 = o000ooOO.OooOOO0.OooO0Oo(interfaceC24749OooO0OoO0ooOOo, "password");
                    if (interfaceC24749OooO0OoO0ooOOo.o00oO0o()) {
                        String strO000OoO2 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo);
                        String strO000OoO3 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo2) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo2);
                        String strO000OoO4 = interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo3) ? null : interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo3);
                        if (!interfaceC24749OooO0OoO0ooOOo.isNull(iOooO0Oo4)) {
                            strO000OoO = interfaceC24749OooO0OoO0ooOOo.o000OoO(iOooO0Oo4);
                        }
                        pdfInfoEntity = new PdfInfoEntity(strO000OoO2, strO000OoO3, strO000OoO4, strO000OoO);
                    }
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return pdfInfoEntity;
                } catch (Throwable th2) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th2;
                }
        }
    }
}
