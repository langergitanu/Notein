package com.orion.notein.p607ui.noteeditor.hyperlinkeditor;

import android.widget.ImageView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkResizeEditor$initByViewModel$1", m80623f = "HyperLinkResizeEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f74546OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f74547OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ HyperLinkResizeEditor f74548OooOoO0;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkResizeEditor$initByViewModel$1$1", m80623f = "HyperLinkResizeEditor.kt", m80624l = {63}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f74549OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74550OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ HyperLinkResizeEditor f74551OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.hyperlinkeditor.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.hyperlinkeditor.HyperLinkResizeEditor$initByViewModel$1$1$1", m80623f = "HyperLinkResizeEditor.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19299OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<OooO0OO.OooO0O0, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ HyperLinkResizeEditor f74552OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19299OooO00o(HyperLinkResizeEditor hyperLinkResizeEditor, Continuation<? super C19299OooO00o> continuation) {
                super(2, continuation);
                this.f74552OooOo0o = hyperLinkResizeEditor;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19299OooO00o(this.f74552OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(OooO0OO.OooO0O0 oooO0O0, Continuation<? super C32460OooOooO> continuation) {
                return ((C19299OooO00o) create(oooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                HyperLinkResizeEditor hyperLinkResizeEditor = this.f74552OooOo0o;
                ImageView imageView = hyperLinkResizeEditor.f74507OooOoO;
                if (imageView != null) {
                    imageView.setBackground(hyperLinkResizeEditor.getContext().getDrawable(R.drawable.bg_hyperlink_editor_border));
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("border");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO0OO oooO0OO, HyperLinkResizeEditor hyperLinkResizeEditor, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f74549OooOo = oooO0OO;
            this.f74551OooOoO0 = hyperLinkResizeEditor;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f74549OooOo, this.f74551OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74550OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO0OO oooO0OO = this.f74549OooOo;
                C19299OooO00o c19299OooO00o = new C19299OooO00o(this.f74551OooOoO0, null);
                this.f74550OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0OO.f74562OooOO0o, c19299OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(OooO0OO oooO0OO, HyperLinkResizeEditor hyperLinkResizeEditor, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f74546OooOo = oooO0OO;
        this.f74548OooOoO0 = hyperLinkResizeEditor;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO0O0 oooO0O0 = new OooO0O0(this.f74546OooOo, this.f74548OooOoO0, continuation);
        oooO0O0.f74547OooOo0o = obj;
        return oooO0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f74547OooOo0o, null, null, new OooO00o(this.f74546OooOo, this.f74548OooOoO0, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
