package o0OoO0oo;

import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.view.View;
import com.aspose.slides.C22212OooOoO0;
import com.orion.editor.PDFView;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.overscroll.OverScrollImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24030OooOoo;
import o0OoO0oo.o00Oo00;
import o0Ooo0.AbstractViewOnTouchListenerC29320OooO0OO;
import o0Ooo0.C29318OooO00o;
import o0Ooo0.C29319OooO0O0;
import o0Ooo0.C29323OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0oO0.InterfaceC33930OooO00o;
import oO0oO0.InterfaceC33931OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initOverScrollBounceEffectDecorator$1", m80623f = "NoteEditorFragment.kt", m80624l = {4539}, m80625m = "invokeSuspend")
public final class o00Oo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102299OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102300OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f102301OooOoO0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initOverScrollBounceEffectDecorator$1$1$1", m80623f = "NoteEditorFragment.kt", m80624l = {4591}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102302OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f102303OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C24030OooOoo f102304OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteEditorFragment noteEditorFragment, C24030OooOoo c24030OooOoo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f102302OooOo = noteEditorFragment;
            this.f102304OooOoO0 = c24030OooOoo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f102302OooOo, this.f102304OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102303OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment = this.f102302OooOo;
                List<Page> pages = ((NoteContent) noteEditorFragment.OoooOO0().f73592OoooOoo.f121747OooOo0o.getValue()).getPages();
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
                Iterator<T> it = pages.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Page) it.next()).getId());
                }
                String str = (String) oOo000Oo.OooOo.OoooOOo(arrayList);
                C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                this.f102303OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28895o00Ooo0(c23344OooOOoOoooOO0, str, null), this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            this.f102304OooOoO0.f80938OooOo0o = true;
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(int i, NoteEditorFragment noteEditorFragment, Continuation continuation) {
        super(2, continuation);
        this.f102299OooOo = noteEditorFragment;
        this.f102301OooOoO0 = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00Oo00(this.f102301OooOoO0, this.f102299OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o00Oo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102300OooOo0o;
        final NoteEditorFragment noteEditorFragment = this.f102299OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28694OooOO0O c28694OooOO0O = (C28694OooOO0O) noteEditorFragment.OoooOO0().f73606o00o0O.f121747OooOo0o.getValue();
            if (c28694OooOO0O != null && c28694OooOO0O.f101666OooO) {
                return C32460OooOooO.f116667OooO00o;
            }
            C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
            this.f102300OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28917o00o00oo(c23344OooOOoOoooOO0, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        boolean z = !((Boolean) obj).booleanValue();
        boolean zBooleanValue = ((Boolean) noteEditorFragment.OoooOO0().f73575Oooo00O.f121747OooOo0o.getValue()).booleanValue();
        AbstractViewOnTouchListenerC29320OooO0OO abstractViewOnTouchListenerC29320OooO0OO = noteEditorFragment.f72999OooOoo;
        if (abstractViewOnTouchListenerC29320OooO0OO != null) {
            if (abstractViewOnTouchListenerC29320OooO0OO.f103978OooOoo0 != abstractViewOnTouchListenerC29320OooO0OO.f103975OooOoO0) {
                Log.w("OverScrollDecor", "Decorator detached while over-scroll is in effect. You might want to add a precondition of that getCurrentState()==STATE_IDLE, first.");
            }
            C29318OooO00o c29318OooO00o = abstractViewOnTouchListenerC29320OooO0OO.f103972OooOo;
            c29318OooO00o.OooO00o().setOnTouchListener(null);
            c29318OooO00o.OooO00o().setOverScrollMode(0);
        }
        PDFView pDFView = noteEditorFragment.f73015OoooO0;
        if (pDFView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        C29318OooO00o c29318OooO00o2 = new C29318OooO00o(pDFView, z, zBooleanValue);
        noteEditorFragment.f73001OooOooO = c29318OooO00o2;
        final int i2 = this.f102301OooOoO0;
        noteEditorFragment.f72999OooOoo = i2 == 0 ? new C29323OooO0Oo(c29318OooO00o2) : new C29319OooO0O0(c29318OooO00o2);
        final C24030OooOoo c24030OooOoo = new C24030OooOoo();
        final C24030OooOoo c24030OooOoo2 = new C24030OooOoo();
        AbstractViewOnTouchListenerC29320OooO0OO abstractViewOnTouchListenerC29320OooO0OO2 = noteEditorFragment.f72999OooOoo;
        if (abstractViewOnTouchListenerC29320OooO0OO2 != null) {
            abstractViewOnTouchListenerC29320OooO0OO2.f103977OooOoo = new InterfaceC33930OooO00o() { // from class: o0OoO0oo.o00OoOoO
                @Override // oO0oO0.InterfaceC33930OooO00o
                public final void OooO00o(int i3, int i4) {
                    C24030OooOoo c24030OooOoo3 = c24030OooOoo2;
                    NoteEditorFragment noteEditorFragment2 = noteEditorFragment;
                    if (i4 != 0) {
                        if (i4 == 3 && i3 != 1) {
                            C24030OooOoo c24030OooOoo4 = c24030OooOoo;
                            if (c24030OooOoo4.f80938OooOo0o) {
                                c24030OooOoo4.f80938OooOo0o = false;
                                C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment2, "getViewLifecycleOwner(...)"), null, null, new o00Oo00.OooO00o(noteEditorFragment2, c24030OooOoo3, null), 3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i3 == 3 && c24030OooOoo3.f80938OooOo0o) {
                        c24030OooOoo3.f80938OooOo0o = false;
                        PDFView pDFView2 = noteEditorFragment2.f73015OoooO0;
                        if (pDFView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                        int pageCount = pDFView2.getPageCount();
                        PDFView pDFView3 = noteEditorFragment2.f73015OoooO0;
                        if (pDFView3 != null) {
                            pDFView3.Oooo0O0(pageCount);
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                            throw null;
                        }
                    }
                }
            };
        }
        final int iOooO0o = Oooo0.o000000O.OooO0o(160);
        AbstractViewOnTouchListenerC29320OooO0OO abstractViewOnTouchListenerC29320OooO0OO3 = noteEditorFragment.f72999OooOoo;
        if (abstractViewOnTouchListenerC29320OooO0OO3 != null) {
            abstractViewOnTouchListenerC29320OooO0OO3.f103979OooOooO = new InterfaceC33931OooO0O0() { // from class: o0OoO0oo.o00Oo000
                @Override // oO0oO0.InterfaceC33931OooO0O0
                public final void OooO00o(int i3, float f) {
                    float fAbs = Math.abs(f);
                    float f2 = iOooO0o;
                    C24030OooOoo c24030OooOoo3 = c24030OooOoo;
                    NoteEditorFragment noteEditorFragment2 = noteEditorFragment;
                    int i4 = i2;
                    if (fAbs > f2 && i3 == 2) {
                        c24030OooOoo3.f80938OooOo0o = true;
                        NoteEditorFragment.Oooo00O(noteEditorFragment2, 0, i4);
                        return;
                    }
                    float fAbs2 = Math.abs(f) / f2;
                    OverScrollImageView overScrollImageView = noteEditorFragment2.f73021OoooOo0;
                    if (overScrollImageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivAddPageIndicator");
                        throw null;
                    }
                    overScrollImageView.setProgress(fAbs2);
                    OverScrollImageView overScrollImageView2 = noteEditorFragment2.f73021OoooOo0;
                    if (overScrollImageView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivAddPageIndicator");
                        throw null;
                    }
                    Drawable drawable = overScrollImageView2.getDrawable();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
                    Drawable drawableFindDrawableByLayerId = ((LayerDrawable) drawable).findDrawableByLayerId(R.id.clip);
                    kotlin.jvm.internal.OooOOO0.OooO0o0(drawableFindDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.ClipDrawable");
                    ((ClipDrawable) drawableFindDrawableByLayerId).setLevel((int) (fAbs2 * 10000));
                    if (i4 == 0) {
                        View view = noteEditorFragment2.f73019OoooOOO;
                        if (view == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("addPageIndicator");
                            throw null;
                        }
                        view.setTranslationX(0.0f);
                        View view2 = noteEditorFragment2.f73019OoooOOO;
                        if (view2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("addPageIndicator");
                            throw null;
                        }
                        view2.setTranslationY(f + Oooo0.o000000O.OooO0o(120));
                    } else {
                        View view3 = noteEditorFragment2.f73019OoooOOO;
                        if (view3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("addPageIndicator");
                            throw null;
                        }
                        view3.setTranslationY(0.0f);
                        View view4 = noteEditorFragment2.f73019OoooOOO;
                        if (view4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("addPageIndicator");
                            throw null;
                        }
                        view4.setTranslationX(f + Oooo0.o000000O.OooO0o(120));
                    }
                    c24030OooOoo3.f80938OooOo0o = false;
                    NoteEditorFragment.Oooo00O(noteEditorFragment2, 1, i4);
                }
            };
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
