package com.orion.notein.p607ui.stickers;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o00o00O0.C25252OooO0Oo;
import o0Oo0O0.C28050OooO0OO;
import o0OoO0.C28513OooO0oO;
import o0OoOoo.ViewOnClickListenerC29219OooO0OO;
import o0Ooo0oo.ViewOnClickListenerC29467OooOooO;
import o0Ooo0oo.ViewOnClickListenerC29468OooOooo;
import o0oOOooO.C30880OooO00o;
import o0oOOooO.C30885OooO0o0;
import o0oOOooO.C30886OooO0oO;
import o0oOOooO.C30888OooOO0;
import o0oOOooO.C30898OooOo00;
import o0oOoOo.C31077OoooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.OooOOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/stickers/AddToStickerCollectionDialogFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AddToStickerCollectionDialogFragment extends Hilt_AddToStickerCollectionDialogFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C24568OooO0oO f79400OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C22026ooOO f79401OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public RecyclerView f79402Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f79403Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public RecyclerView f79404Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C30885OooO0o0 f79405Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public C30886OooO0oO f79406Oooo0O0;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f79407OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79407OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79407OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? AddToStickerCollectionDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.AddToStickerCollectionDialogFragment$onViewCreated$2$1", m80623f = "AddToStickerCollectionDialogFragment.kt", m80624l = {64}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79410OooOo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return AddToStickerCollectionDialogFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79410OooOo0o;
            AddToStickerCollectionDialogFragment addToStickerCollectionDialogFragment = AddToStickerCollectionDialogFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C30898OooOo00 c30898OooOo00 = (C30898OooOo00) addToStickerCollectionDialogFragment.f79401OooOooo.getValue();
                List listOoooOO0 = OooOOO.OoooOO0(((C30880OooO00o) addToStickerCollectionDialogFragment.f79400OooOooO.getValue()).f110362OooO00o);
                this.f79410OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30888OooOO0(c30898OooOo00, listOoooOO0, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                C21030OooOO0o.OooO0OO(addToStickerCollectionDialogFragment).OooOOo0();
            } else {
                Context context = addToStickerCollectionDialogFragment.getContext();
                if (context != null) {
                    C28513OooO0oO.OooO00o(context, R.string.sticker_add_uris_to_collection_failed, "getString(...)", context);
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 implements RecyclerView.InterfaceC22069OooOOoo {
        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC22069OooOOoo
        public final void OooO00o(RecyclerView recyclerView, MotionEvent e) {
            OooOOO0.OooO0oO(e, "e");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC22069OooOOoo
        public final boolean OooO0OO(RecyclerView recyclerView, MotionEvent motionEvent) {
            ViewParent parent = recyclerView.getParent();
            if (parent == null) {
                return false;
            }
            parent.requestDisallowInterceptTouchEvent(true);
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC22069OooOOoo
        public final void OooO0o0(boolean z) {
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.AddToStickerCollectionDialogFragment$onViewCreated$5", m80623f = "AddToStickerCollectionDialogFragment.kt", m80624l = {118}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79412OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.AddToStickerCollectionDialogFragment$onViewCreated$5$1", m80623f = "AddToStickerCollectionDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AddToStickerCollectionDialogFragment f79413OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f79414OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.stickers.AddToStickerCollectionDialogFragment$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.AddToStickerCollectionDialogFragment$onViewCreated$5$1$1", m80623f = "AddToStickerCollectionDialogFragment.kt", m80624l = {120}, m80625m = "invokeSuspend")
            public static final class C19521OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ AddToStickerCollectionDialogFragment f79415OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79416OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.stickers.AddToStickerCollectionDialogFragment$OooO0OO$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.AddToStickerCollectionDialogFragment$onViewCreated$5$1$1$1", m80623f = "AddToStickerCollectionDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
                public static final class C19522OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public final /* synthetic */ AddToStickerCollectionDialogFragment f79417OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ boolean f79418OooOo0o;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C19522OooO00o(AddToStickerCollectionDialogFragment addToStickerCollectionDialogFragment, Continuation<? super C19522OooO00o> continuation) {
                        super(2, continuation);
                        this.f79417OooOo = addToStickerCollectionDialogFragment;
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                        C19522OooO00o c19522OooO00o = new C19522OooO00o(this.f79417OooOo, continuation);
                        c19522OooO00o.f79418OooOo0o = ((Boolean) obj).booleanValue();
                        return c19522OooO00o;
                    }

                    @Override // oO0O000o.InterfaceC32508OooOOOo
                    public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return ((C19522OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        boolean z = this.f79418OooOo0o;
                        View view = this.f79417OooOo.f79403Oooo000;
                        if (view != null) {
                            view.setEnabled(z);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        OooOOO0.OooOOOO("btnConfirm");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19521OooO00o(AddToStickerCollectionDialogFragment addToStickerCollectionDialogFragment, Continuation<? super C19521OooO00o> continuation) {
                    super(2, continuation);
                    this.f79415OooOo = addToStickerCollectionDialogFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19521OooO00o(this.f79415OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19521OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79416OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        AddToStickerCollectionDialogFragment addToStickerCollectionDialogFragment = this.f79415OooOo;
                        C30898OooOo00 c30898OooOo00 = (C30898OooOo00) addToStickerCollectionDialogFragment.f79401OooOooo.getValue();
                        C19522OooO00o c19522OooO00o = new C19522OooO00o(addToStickerCollectionDialogFragment, null);
                        this.f79416OooOo0o = 1;
                        if (C25252OooO0Oo.OooO0oO(c30898OooOo00.f110447OooOOoo, c19522OooO00o, this) == enumC32485OooO00o) {
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

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.AddToStickerCollectionDialogFragment$onViewCreated$5$1$2", m80623f = "AddToStickerCollectionDialogFragment.kt", m80624l = {125}, m80625m = "invokeSuspend")
            public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ AddToStickerCollectionDialogFragment f79419OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79420OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.stickers.AddToStickerCollectionDialogFragment$OooO0OO$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.AddToStickerCollectionDialogFragment$onViewCreated$5$1$2$1", m80623f = "AddToStickerCollectionDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
                public static final class C19523OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31077OoooOOo>, Continuation<? super C32460OooOooO>, Object> {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public final /* synthetic */ AddToStickerCollectionDialogFragment f79421OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ Object f79422OooOo0o;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C19523OooO00o(AddToStickerCollectionDialogFragment addToStickerCollectionDialogFragment, Continuation<? super C19523OooO00o> continuation) {
                        super(2, continuation);
                        this.f79421OooOo = addToStickerCollectionDialogFragment;
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                        C19523OooO00o c19523OooO00o = new C19523OooO00o(this.f79421OooOo, continuation);
                        c19523OooO00o.f79422OooOo0o = obj;
                        return c19523OooO00o;
                    }

                    @Override // oO0O000o.InterfaceC32508OooOOOo
                    public final Object invoke(List<? extends C31077OoooOOo> list, Continuation<? super C32460OooOooO> continuation) {
                        return ((C19523OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        List list = (List) this.f79422OooOo0o;
                        C30886OooO0oO c30886OooO0oO = this.f79421OooOo.f79406Oooo0O0;
                        if (c30886OooO0oO != null) {
                            c30886OooO0oO.OooO0Oo(list);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        OooOOO0.OooOOOO("stickerCollectionAdapter");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0O0(AddToStickerCollectionDialogFragment addToStickerCollectionDialogFragment, Continuation<? super OooO0O0> continuation) {
                    super(2, continuation);
                    this.f79419OooOo = addToStickerCollectionDialogFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO0O0(this.f79419OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79420OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        AddToStickerCollectionDialogFragment addToStickerCollectionDialogFragment = this.f79419OooOo;
                        C30898OooOo00 c30898OooOo00 = (C30898OooOo00) addToStickerCollectionDialogFragment.f79401OooOooo.getValue();
                        C19523OooO00o c19523OooO00o = new C19523OooO00o(addToStickerCollectionDialogFragment, null);
                        this.f79420OooOo0o = 1;
                        if (C25252OooO0Oo.OooO0oO(c30898OooOo00.f110448OooOo0, c19523OooO00o, this) == enumC32485OooO00o) {
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
            public OooO00o(AddToStickerCollectionDialogFragment addToStickerCollectionDialogFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f79413OooOo = addToStickerCollectionDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f79413OooOo, continuation);
                oooO00o.f79414OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f79414OooOo0o;
                AddToStickerCollectionDialogFragment addToStickerCollectionDialogFragment = this.f79413OooOo;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19521OooO00o(addToStickerCollectionDialogFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(addToStickerCollectionDialogFragment, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return AddToStickerCollectionDialogFragment.this.new OooO0OO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79412OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
                AddToStickerCollectionDialogFragment addToStickerCollectionDialogFragment = AddToStickerCollectionDialogFragment.this;
                OooO00o oooO00o = new OooO00o(addToStickerCollectionDialogFragment, null);
                this.f79412OooOo0o = 1;
                if (C22005OoooOO0.OooO00o(addToStickerCollectionDialogFragment, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.stickers.AddToStickerCollectionDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23842OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public C23842OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            AddToStickerCollectionDialogFragment addToStickerCollectionDialogFragment = AddToStickerCollectionDialogFragment.this;
            Bundle arguments = addToStickerCollectionDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + addToStickerCollectionDialogFragment + " has null arguments");
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23843OooO0o0 f79424OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C23843OooO0o0 c23843OooO0o0) {
            super(0);
            this.f79424OooOo0o = c23843OooO0o0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f79424OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.stickers.AddToStickerCollectionDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23843OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23843OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return AddToStickerCollectionDialogFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.stickers.AddToStickerCollectionDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23844OooO0oO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79426OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23844OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79426OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f79426OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.stickers.AddToStickerCollectionDialogFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23845OooO0oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79427OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23845OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79427OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79427OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public AddToStickerCollectionDialogFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f79400OooOooO = new C24568OooO0oO(oooo0.OooO0O0(C30880OooO00o.class), new C23842OooO0Oo());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0o(new C23843OooO0o0()));
        this.f79401OooOooo = new C22026ooOO(oooo0.OooO0O0(C30898OooOo00.class), new C23844OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0), new C23845OooO0oo(interfaceC32440OooOO0OooO0O0));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_sticker_set_dialog, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.btn_cancel).setOnClickListener(new ViewOnClickListenerC29219OooO0OO(this, 4));
        View viewFindViewById = view.findViewById(R.id.btn_confirm);
        this.f79403Oooo000 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 1000L, new ViewOnClickListenerC29467OooOooO(this, 3));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_preview);
        this.f79404Oooo00O = recyclerView;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("rvPreview");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        C30885OooO0o0 c30885OooO0o0 = new C30885OooO0o0(C30885OooO0o0.OooO00o.f110365OooO00o);
        this.f79405Oooo00o = c30885OooO0o0;
        RecyclerView recyclerView2 = this.f79404Oooo00O;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("rvPreview");
            throw null;
        }
        recyclerView2.setAdapter(c30885OooO0o0);
        C30885OooO0o0 c30885OooO0o02 = this.f79405Oooo00o;
        if (c30885OooO0o02 == null) {
            OooOOO0.OooOOOO("previewImageAdapter");
            throw null;
        }
        c30885OooO0o02.OooO0Oo(OooOOO.OoooOO0(((C30880OooO00o) this.f79400OooOooO.getValue()).f110362OooO00o));
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.rv_sticker_set);
        this.f79402Oooo0 = recyclerView3;
        if (recyclerView3 == null) {
            OooOOO0.OooOOOO("rvStickerCollection");
            throw null;
        }
        recyclerView3.setLayoutManager(new GridLayoutManager(requireContext(), 6));
        C30886OooO0oO c30886OooO0oO = new C30886OooO0oO(null, null, true);
        this.f79406Oooo0O0 = c30886OooO0oO;
        c30886OooO0oO.f110370OooO0o0 = new ViewOnClickListenerC29468OooOooo(this, 3);
        RecyclerView recyclerView4 = this.f79402Oooo0;
        if (recyclerView4 == null) {
            OooOOO0.OooOOOO("rvStickerCollection");
            throw null;
        }
        recyclerView4.setAdapter(c30886OooO0oO);
        RecyclerView recyclerView5 = this.f79402Oooo0;
        if (recyclerView5 == null) {
            OooOOO0.OooOOOO("rvStickerCollection");
            throw null;
        }
        recyclerView5.addOnItemTouchListener(new OooO0O0());
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0OO(null), 3);
    }
}
