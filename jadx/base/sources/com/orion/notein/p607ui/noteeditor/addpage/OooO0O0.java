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
import o0OoOO00.C28988OooO;
import o0OoOO00.C28997OooOO0;
import o0OoOO00.C28998OooOO0O;
import o0OoOO00.C28999OooOO0o;
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
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageDialogFragment$observeUiEvents$1", m80623f = "AddPageDialogFragment.kt", m80624l = {72}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AddPageDialogFragment f73845OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f73846OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageDialogFragment$observeUiEvents$1$1", m80623f = "AddPageDialogFragment.kt", m80624l = {73}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AddPageDialogFragment f73847OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73848OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19268OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ AddPageDialogFragment f73849OooOo0o;

            public C19268OooO00o(AddPageDialogFragment addPageDialogFragment) {
                this.f73849OooOo0o = addPageDialogFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                OooO0OO.OooO00o oooO00o = (OooO0OO.OooO00o) obj;
                AddPageDialogFragment addPageDialogFragment = this.f73849OooOo0o;
                if (oooO00o instanceof OooO0OO.OooO00o.C19269OooO00o) {
                    addPageDialogFragment.dismissAllowingStateLoss();
                } else if (oooO00o instanceof OooO0OO.OooO00o.C19270OooO0OO) {
                    OooO0OO.OooO00o.C19270OooO0OO c19270OooO0OO = (OooO0OO.OooO00o.C19270OooO0OO) oooO00o;
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(addPageDialogFragment), new C28998OooOO0O(c19270OooO0OO.f73872OooO00o, c19270OooO0OO.f73873OooO0O0));
                } else if (oooO00o instanceof OooO0OO.OooO00o.OooO0O0) {
                    String key = ((OooO0OO.OooO00o.OooO0O0) oooO00o).f73871OooO00o;
                    OooOOO0.OooO0oO(key, "key");
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(addPageDialogFragment), new C28988OooO(key));
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
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(addPageDialogFragment), new C28997OooOO0(pdfUri, key2, noteId, pageId));
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
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(addPageDialogFragment), new C28999OooOO0o(0));
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AddPageDialogFragment addPageDialogFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f73847OooOo = addPageDialogFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f73847OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73848OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AddPageDialogFragment addPageDialogFragment = this.f73847OooOo;
                OooO0OO oooO0OO = (OooO0OO) addPageDialogFragment.f73789Oooo00O.getValue();
                C19268OooO00o c19268OooO00o = new C19268OooO00o(addPageDialogFragment);
                this.f73848OooOo0o = 1;
                if (oooO0OO.f73866OooOOoo.f121746OooOo0o.collect(c19268OooO00o, this) == enumC32485OooO00o) {
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
    public OooO0O0(AddPageDialogFragment addPageDialogFragment, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f73845OooOo = addPageDialogFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0O0(this.f73845OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f73846OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AddPageDialogFragment addPageDialogFragment = this.f73845OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = addPageDialogFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(addPageDialogFragment, null);
            this.f73846OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(viewLifecycleOwner, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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
