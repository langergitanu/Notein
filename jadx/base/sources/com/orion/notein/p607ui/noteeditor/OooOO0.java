package com.orion.notein.p607ui.noteeditor;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.core.util.Pair;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.notein.global.R;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0O0o00.o000O000;
import o0O0oOO.C26112OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$imageProvider$1$getImageBitmap$2", m80623f = "NoteEditorFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Bitmap>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ RectF f73518OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f73519OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(NoteEditorFragment noteEditorFragment, RectF rectF, Continuation<? super OooOO0> continuation) {
        super(2, continuation);
        this.f73519OooOo0o = noteEditorFragment;
        this.f73518OooOo = rectF;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOO0(this.f73519OooOo0o, this.f73518OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Bitmap> continuation) {
        return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        float f;
        RectF rectF;
        Bitmap bitmapCreateBitmap;
        float f2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        PDFView pDFView = this.f73519OooOo0o.f73015OoooO0;
        if (pDFView == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        RectF rectF2 = this.f73518OooOo;
        if (rectF2.width() < 10.0f || rectF2.height() < 10.0f) {
            return null;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((int) rectF2.width(), (int) rectF2.height(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap2.eraseColor(pDFView.getResources().getColor(R.color.editor_bg_color));
        Pair<Integer, Integer> pairOooOOOo = pDFView.f69170OooOooO.OooOOOo(rectF2);
        int iIntValue = pairOooOOOo.second.intValue();
        for (int iIntValue2 = pairOooOOOo.first.intValue(); iIntValue2 <= iIntValue; iIntValue2++) {
            float fOooOo0O = pDFView.OooOo0O(2, iIntValue2);
            AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
            C26112OooO0oo c26112OooO0ooOooOo00 = abstractC22830OooO0Oo instanceof o000O000 ? abstractC22830OooO0Oo.OooOo00(iIntValue2) : abstractC22830OooO0Oo.OooOO0O(iIntValue2);
            float f3 = c26112OooO0ooOooOo00.f89149OooO00o / fOooOo0O;
            float f4 = c26112OooO0ooOooOo00.f89150OooO0O0 / fOooOo0O;
            Pair<Float, Float> pairOooOOO = pDFView.f69170OooOooO.OooOOO(iIntValue2);
            RectF rectF3 = new RectF(-pairOooOOO.first.floatValue(), -pairOooOOO.second.floatValue(), (-pairOooOOO.first.floatValue()) + f3, (-pairOooOOO.second.floatValue()) + f4);
            if (rectF3.contains(rectF2)) {
                f = 0.0f;
                rectF = rectF2;
                bitmapCreateBitmap = bitmapCreateBitmap2;
                f2 = 0.0f;
            } else {
                rectF = new RectF(Math.max(rectF2.left, rectF3.left), Math.max(rectF2.top, rectF3.top), Math.min(rectF2.right, rectF3.right), Math.min(rectF2.bottom, rectF3.bottom));
                int iCeil = (int) Math.ceil(rectF.width());
                int iCeil2 = (int) Math.ceil(rectF.height());
                if (iCeil <= 0 || iCeil2 <= 0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("PDFView");
                    c20358OooO00o.OooO0o0("Skip page, tiny or invalid render area: %s", rectF.toString());
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
                    f = rectF.left - rectF2.left;
                    f2 = rectF.top - rectF2.top;
                }
            }
            RectF rectF4 = new RectF(rectF);
            rectF4.offset(pairOooOOO.first.floatValue(), pairOooOOO.second.floatValue());
            RectF rectF5 = new RectF(rectF4);
            rectF5.left *= fOooOo0O;
            rectF5.top *= fOooOo0O;
            rectF5.right *= fOooOo0O;
            rectF5.bottom *= fOooOo0O;
            pDFView.f69170OooOooO.getClass();
            Bitmap bitmap = bitmapCreateBitmap;
            pDFView.Ooooo0o(bitmap, iIntValue2, rectF5, null, 15);
            if (bitmap != bitmapCreateBitmap2) {
                Canvas canvas = new Canvas(bitmapCreateBitmap2);
                canvas.drawBitmap(bitmap, f, f2, (Paint) null);
                canvas.setBitmap(null);
                bitmap.recycle();
            }
        }
        return bitmapCreateBitmap2;
    }
}
