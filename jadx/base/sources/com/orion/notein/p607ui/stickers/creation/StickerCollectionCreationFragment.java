package com.orion.notein.p607ui.stickers.creation;

import OooOoOO.C20519OooO0Oo;
import Oooo0.C20855OooooOO;
import Oooo0.o000000O;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.image.ImportImagesFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o;
import com.orion.notein.p607ui.stickers.creation.StickerCollectionCreationFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
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
import o0Oo0oOo.o00Ooo;
import o0OoO0.C28513OooO0oO;
import o0OoO000.o0O0O00;
import o0OoO000.o0OO00O;
import o0OoO000.oo0o0Oo;
import o0o000OO.ViewOnClickListenerC29749OooO00o;
import o0oOOooO.C30887OooO0oo;
import o0oOOooo.C30901OooO0OO;
import o0oOOooo.C30904OooO0o0;
import o0oOOooo.C30906OooO0oo;
import o0oOoOo.C31078OoooOo0;
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
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOOO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/stickers/creation/StickerCollectionCreationFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class StickerCollectionCreationFragment extends Hilt_StickerCollectionCreationFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ImportImagesFragment f79438OooOooO = new ImportImagesFragment();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C24568OooO0oO f79439OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f79440Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextView f79441Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public RecyclerView f79442Oooo00o;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79443OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79443OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79443OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.creation.StickerCollectionCreationFragment$onViewCreated$2$1$1", m80623f = "StickerCollectionCreationFragment.kt", m80624l = {69}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79445OooOo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return StickerCollectionCreationFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79445OooOo0o;
            StickerCollectionCreationFragment stickerCollectionCreationFragment = StickerCollectionCreationFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C30906OooO0oo c30906OooO0ooOooOoo0 = stickerCollectionCreationFragment.OooOoo0();
                this.f79445OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30904OooO0o0(c30906OooO0ooOooOoo0, null), this);
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
                C21030OooOO0o.OooO0OO(stickerCollectionCreationFragment).OooOOo0();
            } else {
                Context context = stickerCollectionCreationFragment.getContext();
                if (context != null) {
                    C28513OooO0oO.OooO00o(context, R.string.sticker_collection_creation_failed, "getString(...)", context);
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.creation.StickerCollectionCreationFragment$onViewCreated$8", m80623f = "StickerCollectionCreationFragment.kt", m80624l = {155}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79447OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C30887OooO0oo f79448OooOoO0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.creation.StickerCollectionCreationFragment$onViewCreated$8$1", m80623f = "StickerCollectionCreationFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ StickerCollectionCreationFragment f79449OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f79450OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ C30887OooO0oo f79451OooOoO0;

            /* JADX INFO: renamed from: com.orion.notein.ui.stickers.creation.StickerCollectionCreationFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.creation.StickerCollectionCreationFragment$onViewCreated$8$1$1", m80623f = "StickerCollectionCreationFragment.kt", m80624l = {157}, m80625m = "invokeSuspend")
            public static final class C19524OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ StickerCollectionCreationFragment f79452OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79453OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.stickers.creation.StickerCollectionCreationFragment$OooO0O0$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.creation.StickerCollectionCreationFragment$onViewCreated$8$1$1$1", m80623f = "StickerCollectionCreationFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
                public static final class C19525OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public final /* synthetic */ StickerCollectionCreationFragment f79454OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ boolean f79455OooOo0o;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C19525OooO00o(StickerCollectionCreationFragment stickerCollectionCreationFragment, Continuation<? super C19525OooO00o> continuation) {
                        super(2, continuation);
                        this.f79454OooOo = stickerCollectionCreationFragment;
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                        C19525OooO00o c19525OooO00o = new C19525OooO00o(this.f79454OooOo, continuation);
                        c19525OooO00o.f79455OooOo0o = ((Boolean) obj).booleanValue();
                        return c19525OooO00o;
                    }

                    @Override // oO0O000o.InterfaceC32508OooOOOo
                    public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return ((C19525OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        boolean z = this.f79455OooOo0o;
                        TextView textView = this.f79454OooOo.f79441Oooo00O;
                        if (textView != null) {
                            textView.setEnabled(z);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        OooOOO0.OooOOOO("btnConfirm");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19524OooO00o(StickerCollectionCreationFragment stickerCollectionCreationFragment, Continuation<? super C19524OooO00o> continuation) {
                    super(2, continuation);
                    this.f79452OooOo = stickerCollectionCreationFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19524OooO00o(this.f79452OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19524OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79453OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        StickerCollectionCreationFragment stickerCollectionCreationFragment = this.f79452OooOo;
                        C30906OooO0oo c30906OooO0ooOooOoo0 = stickerCollectionCreationFragment.OooOoo0();
                        C19525OooO00o c19525OooO00o = new C19525OooO00o(stickerCollectionCreationFragment, null);
                        this.f79453OooOo0o = 1;
                        if (C25252OooO0Oo.OooO0oO(c30906OooO0ooOooOoo0.f110469OooO, c19525OooO00o, this) == enumC32485OooO00o) {
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

            /* JADX INFO: renamed from: com.orion.notein.ui.stickers.creation.StickerCollectionCreationFragment$OooO0O0$OooO00o$OooO0O0, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.creation.StickerCollectionCreationFragment$onViewCreated$8$1$2", m80623f = "StickerCollectionCreationFragment.kt", m80624l = {163}, m80625m = "invokeSuspend")
            public static final class C19526OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ StickerCollectionCreationFragment f79456OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79457OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ C30887OooO0oo f79458OooOoO0;

                /* JADX INFO: renamed from: com.orion.notein.ui.stickers.creation.StickerCollectionCreationFragment$OooO0O0$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.creation.StickerCollectionCreationFragment$onViewCreated$8$1$2$1", m80623f = "StickerCollectionCreationFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
                public static final class C19527OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31078OoooOo0>, Continuation<? super C32460OooOooO>, Object> {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public final /* synthetic */ C30887OooO0oo f79459OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ Object f79460OooOo0o;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C19527OooO00o(C30887OooO0oo c30887OooO0oo, Continuation<? super C19527OooO00o> continuation) {
                        super(2, continuation);
                        this.f79459OooOo = c30887OooO0oo;
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                        C19527OooO00o c19527OooO00o = new C19527OooO00o(this.f79459OooOo, continuation);
                        c19527OooO00o.f79460OooOo0o = obj;
                        return c19527OooO00o;
                    }

                    @Override // oO0O000o.InterfaceC32508OooOOOo
                    public final Object invoke(List<? extends C31078OoooOo0> list, Continuation<? super C32460OooOooO> continuation) {
                        return ((C19527OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        List<C31078OoooOo0> list = (List) this.f79460OooOo0o;
                        C34406OooO00o.f123390OooO00o.OooO00o("addUris: " + list, new Object[0]);
                        this.f79459OooOo.OooO0OO(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19526OooO0O0(StickerCollectionCreationFragment stickerCollectionCreationFragment, C30887OooO0oo c30887OooO0oo, Continuation<? super C19526OooO0O0> continuation) {
                    super(2, continuation);
                    this.f79456OooOo = stickerCollectionCreationFragment;
                    this.f79458OooOoO0 = c30887OooO0oo;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19526OooO0O0(this.f79456OooOo, this.f79458OooOoO0, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19526OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79457OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        C30906OooO0oo c30906OooO0ooOooOoo0 = this.f79456OooOo.OooOoo0();
                        C19527OooO00o c19527OooO00o = new C19527OooO00o(this.f79458OooOoO0, null);
                        this.f79457OooOo0o = 1;
                        if (C25252OooO0Oo.OooO0oO(c30906OooO0ooOooOoo0.f110474OooO0oo, c19527OooO00o, this) == enumC32485OooO00o) {
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
            public OooO00o(StickerCollectionCreationFragment stickerCollectionCreationFragment, C30887OooO0oo c30887OooO0oo, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f79449OooOo = stickerCollectionCreationFragment;
                this.f79451OooOoO0 = c30887OooO0oo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f79449OooOo, this.f79451OooOoO0, continuation);
                oooO00o.f79450OooOo0o = obj;
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
                InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f79450OooOo0o;
                StickerCollectionCreationFragment stickerCollectionCreationFragment = this.f79449OooOo;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19524OooO00o(stickerCollectionCreationFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19526OooO0O0(stickerCollectionCreationFragment, this.f79451OooOoO0, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C30887OooO0oo c30887OooO0oo, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f79448OooOoO0 = c30887OooO0oo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return StickerCollectionCreationFragment.this.new OooO0O0(this.f79448OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79447OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
                C30887OooO0oo c30887OooO0oo = this.f79448OooOoO0;
                StickerCollectionCreationFragment stickerCollectionCreationFragment = StickerCollectionCreationFragment.this;
                OooO00o oooO00o = new OooO00o(stickerCollectionCreationFragment, c30887OooO0oo, null);
                this.f79447OooOo0o = 1;
                if (C22005OoooOO0.OooO00o(stickerCollectionCreationFragment, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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

    public static final class OooO0OO implements OooO00o.InterfaceC19367OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public ArrayList f79461OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ C30887OooO0oo f79463OooO0OO;

        public OooO0OO(C30887OooO0oo c30887OooO0oo) {
            this.f79463OooO0OO = c30887OooO0oo;
        }

        @Override // com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o.InterfaceC19367OooO00o
        public final void OooO00o() {
        }

        @Override // com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o.InterfaceC19367OooO00o
        public final void OooO0O0() {
            ArrayList arrayList = this.f79461OooO00o;
            if (arrayList == null || arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                C30906OooO0oo c30906OooO0ooOooOoo0 = StickerCollectionCreationFragment.this.OooOoo0();
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C31078OoooOo0) it.next()).f110914OooO00o);
                }
                C33781o00o0O c33781o00o0O = c30906OooO0ooOooOoo0.f110473OooO0oO;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, arrayList2);
            }
            this.f79461OooO00o = null;
        }

        @Override // com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o.InterfaceC19367OooO00o
        public final void onMove(int i, int i2) {
            ArrayList arrayList = this.f79461OooO00o;
            if (arrayList == null || arrayList.isEmpty()) {
                this.f79461OooO00o = OooOo.o0ooOoO((Collection) StickerCollectionCreationFragment.this.OooOoo0().f110474OooO0oo.f121747OooOo0o.getValue());
            }
            if (i < i2) {
                while (i < i2) {
                    ArrayList arrayList2 = this.f79461OooO00o;
                    OooOOO0.OooO0Oo(arrayList2);
                    int i3 = i + 1;
                    Collections.swap(arrayList2, i, i3);
                    i = i3;
                }
            } else {
                int i4 = i2 + 1;
                if (i4 <= i) {
                    while (true) {
                        ArrayList arrayList3 = this.f79461OooO00o;
                        OooOOO0.OooO0Oo(arrayList3);
                        Collections.swap(arrayList3, i, i - 1);
                        if (i == i4) {
                            break;
                        } else {
                            i--;
                        }
                    }
                }
            }
            ArrayList arrayList4 = this.f79461OooO00o;
            OooOOO0.OooO0Oo(arrayList4);
            this.f79463OooO0OO.OooO0OO(arrayList4);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.stickers.creation.StickerCollectionCreationFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23846OooO0Oo implements TextWatcher {
        public C23846OooO0Oo() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String string;
            C30906OooO0oo c30906OooO0ooOooOoo0 = StickerCollectionCreationFragment.this.OooOoo0();
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            C33781o00o0O c33781o00o0O = c30906OooO0ooOooOoo0.f110471OooO0o;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, string);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return StickerCollectionCreationFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.stickers.creation.StickerCollectionCreationFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23847OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public C23847OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            StickerCollectionCreationFragment stickerCollectionCreationFragment = StickerCollectionCreationFragment.this;
            Bundle arguments = stickerCollectionCreationFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + stickerCollectionCreationFragment + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.stickers.creation.StickerCollectionCreationFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23848OooO0oO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0o f79467OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23848OooO0oO(OooO0o oooO0o) {
            super(0);
            this.f79467OooOo0o = oooO0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f79467OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.stickers.creation.StickerCollectionCreationFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23849OooO0oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79468OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23849OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79468OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f79468OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f79469OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79469OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79469OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? StickerCollectionCreationFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public StickerCollectionCreationFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f79439OooOooo = new C24568OooO0oO(oooo0.OooO0O0(C30901OooO0OO.class), new C23847OooO0o0());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23848OooO0oO(new OooO0o()));
        this.f79440Oooo000 = new C22026ooOO(oooo0.OooO0O0(C30906OooO0oo.class), new C23849OooO0oo(interfaceC32440OooOO0OooO0O0), new OooOO0(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0));
    }

    public final C30906OooO0oo OooOoo0() {
        return (C30906OooO0oo) this.f79440Oooo000.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_sticker_set_creation_dialog, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.btn_cancel).setOnClickListener(new o0OO00O(this, 6));
        TextView textView = (TextView) view.findViewById(R.id.btn_confirm);
        textView.setOnClickListener(new oo0o0Oo(this, 6));
        this.f79441Oooo00O = textView;
        EditText editText = (EditText) view.findViewById(R.id.et_title);
        OooOOO0.OooO0Oo(editText);
        editText.addTextChangedListener(new C23846OooO0Oo());
        View viewFindViewById = view.findViewById(R.id.cl_add_from_gallery);
        View viewFindViewById2 = view.findViewById(R.id.cl_add_from_file_manager);
        viewFindViewById.setOnClickListener(new o0O0O00(this, 4));
        viewFindViewById2.setOnClickListener(new o00Ooo(this, 5));
        this.f79442Oooo00o = (RecyclerView) view.findViewById(R.id.rv_preview);
        view.post(new Runnable() { // from class: o0oOOooo.OooO00o
            @Override // java.lang.Runnable
            public final void run() {
                StickerCollectionCreationFragment stickerCollectionCreationFragment = this.f110451OooOo0o;
                stickerCollectionCreationFragment.OooOoo0().OooO0o0(OooOOO.OoooOO0(((C30901OooO0OO) stickerCollectionCreationFragment.f79439OooOooo.getValue()).f110453OooO00o));
                View view2 = view;
                int width = (view2.getWidth() - (o000000O.OooO0o(26) * 2)) / stickerCollectionCreationFragment.getResources().getDimensionPixelSize(R.dimen.sticker_preview_item_size);
                C34406OooO00o.f123390OooO00o.OooO00o(C20855OooooOO.OooO0OO(view2.getWidth(), width, "post view width: ", ", spanCount: "), new Object[0]);
                RecyclerView recyclerView = stickerCollectionCreationFragment.f79442Oooo00o;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new GridLayoutManager(stickerCollectionCreationFragment.requireContext(), width));
                } else {
                    OooOOO0.OooOOOO("rvPreview");
                    throw null;
                }
            }
        });
        C30887OooO0oo c30887OooO0oo = new C30887OooO0oo();
        c30887OooO0oo.f110381OooO0O0 = new ViewOnClickListenerC29749OooO00o(this, 3);
        RecyclerView recyclerView = this.f79442Oooo00o;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("rvPreview");
            throw null;
        }
        recyclerView.setAdapter(c30887OooO0oo);
        C22041OooOOo c22041OooOOo = new C22041OooOOo(new com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o(new OooO0OO(c30887OooO0oo), 15));
        RecyclerView recyclerView2 = this.f79442Oooo00o;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("rvPreview");
            throw null;
        }
        c22041OooOOo.OooO0o(recyclerView2);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(c30887OooO0oo, null), 3);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        Fragment fragmentOooOooo = getChildFragmentManager().OooOooo(this.f79438OooOooO.getClass().getSimpleName());
        if (fragmentOooOooo != null) {
            this.f79438OooOooO = (ImportImagesFragment) fragmentOooOooo;
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(childFragmentManager, childFragmentManager);
        ImportImagesFragment importImagesFragment = this.f79438OooOooO;
        oooO00oOooO0OO.OooO0Oo(0, importImagesFragment, importImagesFragment.getClass().getSimpleName(), 1);
        oooO00oOooO0OO.OooO0oo();
    }
}
