package com.orion.notein.p607ui.noteeditor.addpage;

import Oooo0oO.C21030OooOO0o;
import android.net.Uri;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.noteeditor.addpage.OooO0OO;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00o.C28026OooO0OO;
import o0OoOO00.C28991OooO0OO;
import o0OoOO00.C28992OooO0Oo;
import o0OoOO00.C28993OooO0o;
import o0OoOO00.C28994OooO0o0;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageBottomSheetDialogFragment$observeUiEvents$1", m80623f = "AddPageBottomSheetDialogFragment.kt", m80624l = {68}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AddPageBottomSheetDialogFragment f73840OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f73841OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageBottomSheetDialogFragment$observeUiEvents$1$1", m80623f = "AddPageBottomSheetDialogFragment.kt", m80624l = {69}, m80625m = "invokeSuspend")
    public static final class C19266OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AddPageBottomSheetDialogFragment f73842OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73843OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19267OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ AddPageBottomSheetDialogFragment f73844OooOo0o;

            public C19267OooO00o(AddPageBottomSheetDialogFragment addPageBottomSheetDialogFragment) {
                this.f73844OooOo0o = addPageBottomSheetDialogFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                OooO0OO.OooO00o oooO00o = (OooO0OO.OooO00o) obj;
                AddPageBottomSheetDialogFragment addPageBottomSheetDialogFragment = this.f73844OooOo0o;
                if (oooO00o instanceof OooO0OO.OooO00o.C19269OooO00o) {
                    addPageBottomSheetDialogFragment.dismissAllowingStateLoss();
                } else if (oooO00o instanceof OooO0OO.OooO00o.C19270OooO0OO) {
                    OooO0OO.OooO00o.C19270OooO0OO c19270OooO0OO = (OooO0OO.OooO00o.C19270OooO0OO) oooO00o;
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(addPageBottomSheetDialogFragment), new C28994OooO0o0(c19270OooO0OO.f73872OooO00o, c19270OooO0OO.f73873OooO0O0));
                } else if (oooO00o instanceof OooO0OO.OooO00o.OooO0O0) {
                    String key = ((OooO0OO.OooO00o.OooO0O0) oooO00o).f73871OooO00o;
                    OooOOO0.OooO0oO(key, "key");
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(addPageBottomSheetDialogFragment), new C28991OooO0OO(key));
                } else if (oooO00o instanceof OooO0OO.OooO00o.OooO0Oo) {
                    OooO0OO.OooO00o.OooO0Oo oooO0Oo = (OooO0OO.OooO00o.OooO0Oo) oooO00o;
                    String key2 = oooO0Oo.f73874OooO00o;
                    OooOOO0.OooO0oO(key2, "key");
                    String noteId = oooO0Oo.f73875OooO0O0;
                    OooOOO0.OooO0oO(noteId, "noteId");
                    String pageId = oooO0Oo.f73876OooO0OO;
                    OooOOO0.OooO0oO(pageId, "pageId");
                    Uri pdfUri = oooO0Oo.f73877OooO0Oo;
                    OooOOO0.OooO0oO(pdfUri, "pdfUri");
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(addPageBottomSheetDialogFragment), new C28992OooO0Oo(pdfUri, key2, noteId, pageId));
                } else {
                    if (oooO00o instanceof OooO0OO.OooO00o.OooO0o) {
                        ((OooO0OO.OooO00o.OooO0o) oooO00o).getClass();
                        OooOOO0.OooO0oO(null, NoteMeta.PROPERTY_TITLE);
                        OooOOO0.OooO0oO(null, FirebaseAnalytics.Param.CONTENT);
                        OooOOO0.OooO0oO(null, NoteMeta.PROPERTY_TITLE);
                        OooOOO0.OooO0oO(null, FirebaseAnalytics.Param.CONTENT);
                        throw null;
                    }
                    if (!(oooO00o instanceof OooO0OO.OooO00o.C23364OooO0o0)) {
                        throw new C32442OooOO0o();
                    }
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(addPageBottomSheetDialogFragment), new C28993OooO0o(0));
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19266OooO00o(AddPageBottomSheetDialogFragment addPageBottomSheetDialogFragment, Continuation<? super C19266OooO00o> continuation) {
            super(2, continuation);
            this.f73842OooOo = addPageBottomSheetDialogFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C19266OooO00o(this.f73842OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((C19266OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73843OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AddPageBottomSheetDialogFragment addPageBottomSheetDialogFragment = this.f73842OooOo;
                OooO0OO oooO0OO = (OooO0OO) addPageBottomSheetDialogFragment.f73778OooOooo.getValue();
                C19267OooO00o c19267OooO00o = new C19267OooO00o(addPageBottomSheetDialogFragment);
                this.f73843OooOo0o = 1;
                if (oooO0OO.f73866OooOOoo.f121746OooOo0o.collect(c19267OooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            throw new C32438OooO0oO();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(AddPageBottomSheetDialogFragment addPageBottomSheetDialogFragment, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f73840OooOo = addPageBottomSheetDialogFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO00o(this.f73840OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f73841OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AddPageBottomSheetDialogFragment addPageBottomSheetDialogFragment = this.f73840OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = addPageBottomSheetDialogFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            C19266OooO00o c19266OooO00o = new C19266OooO00o(addPageBottomSheetDialogFragment, null);
            this.f73841OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(viewLifecycleOwner, oooO0O0, c19266OooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
