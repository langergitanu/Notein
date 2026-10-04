package com.orion.notein.p607ui.stickers.edit;

import OooOoOO.C20519OooO0Oo;
import Oooo0.C20855OooooOO;
import Oooo0.o000000O;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.content.FileProvider;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.aspose.words.WarningType;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.ShareFileFragment;
import com.orion.notein.p607ui.image.ImportImagesFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o;
import com.orion.notein.p607ui.stickers.edit.StickerCollectionEditFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0OOOo0.C27174OooO0O0;
import o0OOo0o.C27528o00o0OO;
import o0OOo0o.C27538o00o0o0O;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.ViewOnClickListenerC28147OooO;
import o0Oo0o00.ViewOnClickListenerC28150OooO0OO;
import o0Oo0o00.ViewOnClickListenerC28152OooO0o;
import o0Oo0o00.ViewOnClickListenerC28153OooO0o0;
import o0Oo0o00.ViewOnClickListenerC28154OooO0oO;
import o0Oo0o00.ViewOnClickListenerC28155OooO0oo;
import o0Oo0o00.ViewOnClickListenerC28157OooOO0O;
import o0OoO0.C28513OooO0oO;
import o0oOOooO.C30887OooO0oo;
import o0oOo00.C30933OooO0o0;
import o0oOo00.C30935OooO0oo;
import o0oOo00.C30938OooOOo;
import o0oOo00.C30939OooOOo0;
import o0oOoOo.C31078OoooOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
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
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/stickers/edit/StickerCollectionEditFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class StickerCollectionEditFragment extends Hilt_StickerCollectionEditFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C24568OooO0oO f79501OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C22026ooOO f79502OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f79503Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ImportImagesFragment f79504Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public ShareFileFragment f79505Oooo00o;

    public static final class OooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79506OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79506OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((o000o0O0.OooOO0) this.f79506OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            C30938OooOOo c30938OooOOoOooOoo0 = StickerCollectionEditFragment.this.OooOoo0();
            String strValueOf = String.valueOf(editable);
            C33781o00o0O c33781o00o0O = c30938OooOOoOooOoo0.f110572OooO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, strValueOf);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$onViewCreated$11", m80623f = "StickerCollectionEditFragment.kt", m80624l = {176}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79509OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ View f79510OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C30887OooO0oo f79511OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ View f79512OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ View f79513OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ View f79514OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final /* synthetic */ View f79515OooOooO;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$onViewCreated$11$1", m80623f = "StickerCollectionEditFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ StickerCollectionEditFragment f79516OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f79517OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ View f79518OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ C30887OooO0oo f79519OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public final /* synthetic */ View f79520OooOoOO;

            /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
            public final /* synthetic */ View f79521OooOoo;

            /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
            public final /* synthetic */ View f79522OooOoo0;

            /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
            public final /* synthetic */ View f79523OooOooO;

            /* JADX INFO: renamed from: com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$onViewCreated$11$1$1", m80623f = "StickerCollectionEditFragment.kt", m80624l = {178}, m80625m = "invokeSuspend")
            public static final class C19532OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ StickerCollectionEditFragment f79524OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79525OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ C30887OooO0oo f79526OooOoO0;

                /* JADX INFO: renamed from: com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$OooO0O0$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$onViewCreated$11$1$1$1", m80623f = "StickerCollectionEditFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
                public static final class C19533OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31078OoooOo0>, Continuation<? super C32460OooOooO>, Object> {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public final /* synthetic */ C30887OooO0oo f79527OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ Object f79528OooOo0o;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C19533OooO00o(C30887OooO0oo c30887OooO0oo, Continuation<? super C19533OooO00o> continuation) {
                        super(2, continuation);
                        this.f79527OooOo = c30887OooO0oo;
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                        C19533OooO00o c19533OooO00o = new C19533OooO00o(this.f79527OooOo, continuation);
                        c19533OooO00o.f79528OooOo0o = obj;
                        return c19533OooO00o;
                    }

                    @Override // oO0O000o.InterfaceC32508OooOOOo
                    public final Object invoke(List<? extends C31078OoooOo0> list, Continuation<? super C32460OooOooO> continuation) {
                        return ((C19533OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        this.f79527OooOo.OooO0OO((List) this.f79528OooOo0o);
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19532OooO00o(StickerCollectionEditFragment stickerCollectionEditFragment, C30887OooO0oo c30887OooO0oo, Continuation<? super C19532OooO00o> continuation) {
                    super(2, continuation);
                    this.f79524OooOo = stickerCollectionEditFragment;
                    this.f79526OooOoO0 = c30887OooO0oo;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19532OooO00o(this.f79524OooOo, this.f79526OooOoO0, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19532OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79525OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        C30938OooOOo c30938OooOOoOooOoo0 = this.f79524OooOo.OooOoo0();
                        C19533OooO00o c19533OooO00o = new C19533OooO00o(this.f79526OooOoO0, null);
                        this.f79525OooOo0o = 1;
                        if (C25252OooO0Oo.OooO0oO(c30938OooOOoOooOoo0.f110583OooOOOO, c19533OooO00o, this) == enumC32485OooO00o) {
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

            /* JADX INFO: renamed from: com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$OooO0O0$OooO00o$OooO0O0, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$onViewCreated$11$1$2", m80623f = "StickerCollectionEditFragment.kt", m80624l = {183}, m80625m = "invokeSuspend")
            public static final class C19534OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ StickerCollectionEditFragment f79529OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79530OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ View f79531OooOoO0;

                /* JADX INFO: renamed from: com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$OooO0O0$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$onViewCreated$11$1$2$1", m80623f = "StickerCollectionEditFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
                public static final class C19535OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public final /* synthetic */ View f79532OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ boolean f79533OooOo0o;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C19535OooO00o(View view, Continuation<? super C19535OooO00o> continuation) {
                        super(2, continuation);
                        this.f79532OooOo = view;
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                        C19535OooO00o c19535OooO00o = new C19535OooO00o(this.f79532OooOo, continuation);
                        c19535OooO00o.f79533OooOo0o = ((Boolean) obj).booleanValue();
                        return c19535OooO00o;
                    }

                    @Override // oO0O000o.InterfaceC32508OooOOOo
                    public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return ((C19535OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        this.f79532OooOo.setEnabled(this.f79533OooOo0o);
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19534OooO0O0(StickerCollectionEditFragment stickerCollectionEditFragment, View view, Continuation<? super C19534OooO0O0> continuation) {
                    super(2, continuation);
                    this.f79529OooOo = stickerCollectionEditFragment;
                    this.f79531OooOoO0 = view;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19534OooO0O0(this.f79529OooOo, this.f79531OooOoO0, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19534OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79530OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        C30938OooOOo c30938OooOOoOooOoo0 = this.f79529OooOo.OooOoo0();
                        C19535OooO00o c19535OooO00o = new C19535OooO00o(this.f79531OooOoO0, null);
                        this.f79530OooOo0o = 1;
                        if (C25252OooO0Oo.OooO0oO(c30938OooOOoOooOoo0.f110584OooOOOo, c19535OooO00o, this) == enumC32485OooO00o) {
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

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$onViewCreated$11$1$3", m80623f = "StickerCollectionEditFragment.kt", m80624l = {188}, m80625m = "invokeSuspend")
            public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ StickerCollectionEditFragment f79534OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79535OooOo0o;

                /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
                public final /* synthetic */ View f79536OooOoO;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ View f79537OooOoO0;

                /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
                public final /* synthetic */ View f79538OooOoOO;

                /* JADX INFO: renamed from: com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$OooO0O0$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$onViewCreated$11$1$3$1", m80623f = "StickerCollectionEditFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
                public static final class C19536OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public final /* synthetic */ View f79539OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ boolean f79540OooOo0o;

                    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
                    public final /* synthetic */ View f79541OooOoO;

                    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                    public final /* synthetic */ View f79542OooOoO0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C19536OooO00o(View view, View view2, View view3, Continuation<? super C19536OooO00o> continuation) {
                        super(2, continuation);
                        this.f79539OooOo = view;
                        this.f79542OooOoO0 = view2;
                        this.f79541OooOoO = view3;
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                        C19536OooO00o c19536OooO00o = new C19536OooO00o(this.f79539OooOo, this.f79542OooOoO0, this.f79541OooOoO, continuation);
                        c19536OooO00o.f79540OooOo0o = ((Boolean) obj).booleanValue();
                        return c19536OooO00o;
                    }

                    @Override // oO0O000o.InterfaceC32508OooOOOo
                    public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return ((C19536OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        boolean z = this.f79540OooOo0o;
                        this.f79539OooOo.setEnabled(z);
                        this.f79542OooOoO0.setEnabled(z);
                        this.f79541OooOoO.setEnabled(z);
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0OO(StickerCollectionEditFragment stickerCollectionEditFragment, View view, View view2, View view3, Continuation<? super OooO0OO> continuation) {
                    super(2, continuation);
                    this.f79534OooOo = stickerCollectionEditFragment;
                    this.f79537OooOoO0 = view;
                    this.f79536OooOoO = view2;
                    this.f79538OooOoOO = view3;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO0OO(this.f79534OooOo, this.f79537OooOoO0, this.f79536OooOoO, this.f79538OooOoOO, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79535OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        C30938OooOOo c30938OooOOoOooOoo0 = this.f79534OooOo.OooOoo0();
                        C19536OooO00o c19536OooO00o = new C19536OooO00o(this.f79537OooOoO0, this.f79536OooOoO, this.f79538OooOoOO, null);
                        this.f79535OooOo0o = 1;
                        if (C25252OooO0Oo.OooO0oO(c30938OooOOoOooOoo0.f110585OooOOo0, c19536OooO00o, this) == enumC32485OooO00o) {
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

            /* JADX INFO: renamed from: com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$OooO0O0$OooO00o$OooO0Oo, reason: case insensitive filesystem */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$onViewCreated$11$1$4", m80623f = "StickerCollectionEditFragment.kt", m80624l = {195}, m80625m = "invokeSuspend")
            public static final class C23852OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ StickerCollectionEditFragment f79543OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79544OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ View f79545OooOoO0;

                /* JADX INFO: renamed from: com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$OooO0O0$OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$onViewCreated$11$1$4$1", m80623f = "StickerCollectionEditFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
                public static final class C19537OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public final /* synthetic */ View f79546OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ boolean f79547OooOo0o;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C19537OooO00o(View view, Continuation<? super C19537OooO00o> continuation) {
                        super(2, continuation);
                        this.f79546OooOo = view;
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                        C19537OooO00o c19537OooO00o = new C19537OooO00o(this.f79546OooOo, continuation);
                        c19537OooO00o.f79547OooOo0o = ((Boolean) obj).booleanValue();
                        return c19537OooO00o;
                    }

                    @Override // oO0O000o.InterfaceC32508OooOOOo
                    public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return ((C19537OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        this.f79546OooOo.setEnabled(this.f79547OooOo0o);
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C23852OooO0Oo(StickerCollectionEditFragment stickerCollectionEditFragment, View view, Continuation<? super C23852OooO0Oo> continuation) {
                    super(2, continuation);
                    this.f79543OooOo = stickerCollectionEditFragment;
                    this.f79545OooOoO0 = view;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C23852OooO0Oo(this.f79543OooOo, this.f79545OooOoO0, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((C23852OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79544OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        C30933OooO0o0 c30933OooO0o0 = (C30933OooO0o0) this.f79543OooOo.f79503Oooo000.getValue();
                        C19537OooO00o c19537OooO00o = new C19537OooO00o(this.f79545OooOoO0, null);
                        this.f79544OooOo0o = 1;
                        if (C25252OooO0Oo.OooO0oO(c30933OooO0o0.f110520OooO0o, c19537OooO00o, this) == enumC32485OooO00o) {
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

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$onViewCreated$11$1$5", m80623f = "StickerCollectionEditFragment.kt", m80624l = {200}, m80625m = "invokeSuspend")
            public static final class OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ StickerCollectionEditFragment f79548OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79549OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$OooO0O0$OooO00o$OooO0o0$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$onViewCreated$11$1$5$1", m80623f = "StickerCollectionEditFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
                public static final class C19538OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C27174OooO0O0<File>, Continuation<? super C32460OooOooO>, Object> {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public final /* synthetic */ StickerCollectionEditFragment f79550OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ Object f79551OooOo0o;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C19538OooO00o(StickerCollectionEditFragment stickerCollectionEditFragment, Continuation<? super C19538OooO00o> continuation) {
                        super(2, continuation);
                        this.f79550OooOo = stickerCollectionEditFragment;
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                        C19538OooO00o c19538OooO00o = new C19538OooO00o(this.f79550OooOo, continuation);
                        c19538OooO00o.f79551OooOo0o = obj;
                        return c19538OooO00o;
                    }

                    @Override // oO0O000o.InterfaceC32508OooOOOo
                    public final Object invoke(C27174OooO0O0<File> c27174OooO0O0, Continuation<? super C32460OooOooO> continuation) {
                        return ((C19538OooO00o) create(c27174OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) this.f79551OooOo0o;
                        boolean z = c27174OooO0O0.f94862OooO00o;
                        StickerCollectionEditFragment stickerCollectionEditFragment = this.f79550OooOo;
                        if (!z || c27174OooO0O0.OooO0O0() == null) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("StickerCollectionFragment");
                            c20358OooO00o.OooO0o0(C22237OooO0o0.OooO00o("exportFile failed, errorCode: ", c27174OooO0O0.getErrorCode(), ", errorMsg: ", c27174OooO0O0.getErrorMsg()), new Object[0]);
                            Context context = stickerCollectionEditFragment.getContext();
                            if (context != null) {
                                String string = stickerCollectionEditFragment.getString(R.string.sticker_share_failed);
                                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                                C25206OooO0Oo.OooO0oO(context, string);
                            }
                        } else {
                            ShareFileFragment shareFileFragment = stickerCollectionEditFragment.f79505Oooo00o;
                            File file = (File) c27174OooO0O0.OooO0O0();
                            shareFileFragment.getClass();
                            kotlin.jvm.internal.OooOOO0.OooO0oO(file, "file");
                            Context context2 = shareFileFragment.getContext();
                            if (context2 != null) {
                                if (file.exists()) {
                                    Uri uriForFile = FileProvider.getUriForFile(context2, context2.getPackageName() + ".fileProvider", file);
                                    Intent intent = new Intent("android.intent.action.SEND");
                                    intent.addFlags(WarningType.HINT);
                                    intent.addFlags(1);
                                    intent.putExtra("android.intent.extra.STREAM", uriForFile);
                                    intent.putExtra("android.intent.extra.TITLE", "Introducing content previews");
                                    intent.setType(context2.getContentResolver().getType(uriForFile));
                                    try {
                                        shareFileFragment.startActivity(Intent.createChooser(intent, "Share exported file"));
                                    } catch (Exception e) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o2.OooOOO0("ShareFragment");
                                        c20358OooO00o2.OooO0Oo(e, "share file error.", new Object[0]);
                                    }
                                } else {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o3.OooOOO0("ShareFragment");
                                    c20358OooO00o3.OooOO0O("share file not exist.", new Object[0]);
                                    C28513OooO0oO.OooO00o(context2, R.string.export_fail, "getString(...)", context2);
                                }
                            }
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0o0(StickerCollectionEditFragment stickerCollectionEditFragment, Continuation<? super OooO0o0> continuation) {
                    super(2, continuation);
                    this.f79548OooOo = stickerCollectionEditFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO0o0(this.f79548OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79549OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        StickerCollectionEditFragment stickerCollectionEditFragment = this.f79548OooOo;
                        C33772OooooOo c33772OooooOo = ((C30933OooO0o0) stickerCollectionEditFragment.f79503Oooo000.getValue()).f110523OooO0oo;
                        C19538OooO00o c19538OooO00o = new C19538OooO00o(stickerCollectionEditFragment, null);
                        this.f79549OooOo0o = 1;
                        if (C25252OooO0Oo.OooO0oO(c33772OooooOo, c19538OooO00o, this) == enumC32485OooO00o) {
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
            public OooO00o(StickerCollectionEditFragment stickerCollectionEditFragment, C30887OooO0oo c30887OooO0oo, View view, View view2, View view3, View view4, View view5, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f79516OooOo = stickerCollectionEditFragment;
                this.f79519OooOoO0 = c30887OooO0oo;
                this.f79518OooOoO = view;
                this.f79520OooOoOO = view2;
                this.f79522OooOoo0 = view3;
                this.f79521OooOoo = view4;
                this.f79523OooOooO = view5;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f79516OooOo, this.f79519OooOoO0, this.f79518OooOoO, this.f79520OooOoOO, this.f79522OooOoo0, this.f79521OooOoo, this.f79523OooOooO, continuation);
                oooO00o.f79517OooOo0o = obj;
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
                InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f79517OooOo0o;
                C30887OooO0oo c30887OooO0oo = this.f79519OooOoO0;
                StickerCollectionEditFragment stickerCollectionEditFragment = this.f79516OooOo;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19532OooO00o(stickerCollectionEditFragment, c30887OooO0oo, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19534OooO0O0(stickerCollectionEditFragment, this.f79518OooOoO, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(stickerCollectionEditFragment, this.f79520OooOoOO, this.f79522OooOoo0, this.f79521OooOoo, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23852OooO0Oo(stickerCollectionEditFragment, this.f79523OooOooO, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o0(stickerCollectionEditFragment, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C30887OooO0oo c30887OooO0oo, View view, View view2, View view3, View view4, View view5, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f79511OooOoO0 = c30887OooO0oo;
            this.f79510OooOoO = view;
            this.f79512OooOoOO = view2;
            this.f79514OooOoo0 = view3;
            this.f79513OooOoo = view4;
            this.f79515OooOooO = view5;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return StickerCollectionEditFragment.this.new OooO0O0(this.f79511OooOoO0, this.f79510OooOoO, this.f79512OooOoOO, this.f79514OooOoo0, this.f79513OooOoo, this.f79515OooOooO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79509OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
                View view = this.f79515OooOooO;
                StickerCollectionEditFragment stickerCollectionEditFragment = StickerCollectionEditFragment.this;
                OooO00o oooO00o = new OooO00o(stickerCollectionEditFragment, this.f79511OooOoO0, this.f79510OooOoO, this.f79512OooOoOO, this.f79514OooOoo0, this.f79513OooOoo, view, null);
                this.f79509OooOo0o = 1;
                if (C22005OoooOO0.OooO00o(stickerCollectionEditFragment, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$onViewCreated$2$1", m80623f = "StickerCollectionEditFragment.kt", m80624l = {75}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79553OooOo0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return StickerCollectionEditFragment.this.new OooO0OO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79553OooOo0o;
            StickerCollectionEditFragment stickerCollectionEditFragment = StickerCollectionEditFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C30938OooOOo c30938OooOOoOooOoo0 = stickerCollectionEditFragment.OooOoo0();
                this.f79553OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30939OooOOo0(null, c30938OooOOoOooOoo0), this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            C21030OooOO0o.OooO0OO(stickerCollectionEditFragment).OooOOo0();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$onViewCreated$4", m80623f = "StickerCollectionEditFragment.kt", m80624l = {85}, m80625m = "invokeSuspend")
    public static final class C23853OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79555OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ EditText f79556OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23853OooO0Oo(EditText editText, Continuation<? super C23853OooO0Oo> continuation) {
            super(2, continuation);
            this.f79556OooOoO0 = editText;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return StickerCollectionEditFragment.this.new C23853OooO0Oo(this.f79556OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23853OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79555OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                StickerCollectionEditFragment stickerCollectionEditFragment = StickerCollectionEditFragment.this;
                C30938OooOOo c30938OooOOoOooOoo0 = stickerCollectionEditFragment.OooOoo0();
                String str = ((C30935OooO0oo) stickerCollectionEditFragment.f79501OooOooO.getValue()).f110536OooO00o;
                this.f79555OooOo0o = 1;
                C27538o00o0o0O c27538o00o0o0O = c30938OooOOoOooOoo0.f110573OooO0Oo;
                c27538o00o0o0O.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27528o00o0OO(c27538o00o0o0O, str, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            this.f79556OooOoO0.setText((String) obj);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0o implements OooO00o.InterfaceC19367OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public ArrayList f79557OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ C30887OooO0oo f79559OooO0OO;

        public OooO0o(C30887OooO0oo c30887OooO0oo) {
            this.f79559OooO0OO = c30887OooO0oo;
        }

        @Override // com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o.InterfaceC19367OooO00o
        public final void OooO00o() {
        }

        @Override // com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o.InterfaceC19367OooO00o
        public final void OooO0O0() {
            ArrayList arrayList = this.f79557OooO00o;
            if (arrayList == null || arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                C30938OooOOo c30938OooOOoOooOoo0 = StickerCollectionEditFragment.this.OooOoo0();
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C31078OoooOo0) it.next()).f110914OooO00o);
                }
                C33781o00o0O c33781o00o0O = c30938OooOOoOooOoo0.f110582OooOOO0;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, arrayList2);
            }
            this.f79557OooO00o = null;
        }

        @Override // com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o.InterfaceC19367OooO00o
        public final void onMove(int i, int i2) {
            ArrayList arrayList = this.f79557OooO00o;
            if (arrayList == null || arrayList.isEmpty()) {
                this.f79557OooO00o = OooOo.o0ooOoO((Collection) StickerCollectionEditFragment.this.OooOoo0().f110583OooOOOO.f121747OooOo0o.getValue());
            }
            if (i < i2) {
                while (i < i2) {
                    ArrayList arrayList2 = this.f79557OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(arrayList2);
                    int i3 = i + 1;
                    Collections.swap(arrayList2, i, i3);
                    i = i3;
                }
            } else {
                int i4 = i2 + 1;
                if (i4 <= i) {
                    while (true) {
                        ArrayList arrayList3 = this.f79557OooO00o;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(arrayList3);
                        Collections.swap(arrayList3, i, i - 1);
                        if (i == i4) {
                            break;
                        } else {
                            i--;
                        }
                    }
                }
            }
            ArrayList arrayList4 = this.f79557OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(arrayList4);
            this.f79559OooO0OO.OooO0OO(arrayList4);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$onViewCreated$7$2$1", m80623f = "StickerCollectionEditFragment.kt", m80624l = {114}, m80625m = "invokeSuspend")
    public static final class C23854OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79561OooOo0o;

        public C23854OooO0o0(Continuation<? super C23854OooO0o0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return StickerCollectionEditFragment.this.new C23854OooO0o0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23854OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79561OooOo0o;
            StickerCollectionEditFragment stickerCollectionEditFragment = StickerCollectionEditFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C30938OooOOo c30938OooOOoOooOoo0 = stickerCollectionEditFragment.OooOoo0();
                String str = ((C30935OooO0oo) stickerCollectionEditFragment.f79501OooOooO.getValue()).f110536OooO00o;
                this.f79561OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0oOo00.OooOO0(c30938OooOOoOooOoo0, str, null), this);
                if (objOooO0o != obj2) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            C21030OooOO0o.OooO0OO(stickerCollectionEditFragment).OooOOo0();
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23855OooO0oO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o000o0O0.OooOO0> {
        public C23855OooO0oO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o000o0O0.OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(StickerCollectionEditFragment.this).OooO0o(R.id.stickerCollectionEditFragment);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23856OooO0oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79563OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23856OooO0oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79563OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((o000o0O0.OooOO0) this.f79563OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79564OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79564OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = StickerCollectionEditFragment.this.requireActivity();
            kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((o000o0O0.OooOO0) this.f79564OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    public static final class OooOO0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooOO0O() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            StickerCollectionEditFragment stickerCollectionEditFragment = StickerCollectionEditFragment.this;
            Bundle arguments = stickerCollectionEditFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + stickerCollectionEditFragment + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23857OooOO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23857OooOO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return StickerCollectionEditFragment.this;
        }
    }

    public static final class OooOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79568OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79568OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f79568OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23857OooOO0o f79569OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(C23857OooOO0o c23857OooOO0o) {
            super(0);
            this.f79569OooOo0o = c23857OooOO0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f79569OooOo0o.invoke();
        }
    }

    public static final class OooOOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79570OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79570OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79570OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.stickers.edit.StickerCollectionEditFragment$OooOOOo, reason: case insensitive filesystem */
    public static final class C23858OooOOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f79571OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23858OooOOOo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79571OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79571OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? StickerCollectionEditFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public StickerCollectionEditFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f79501OooOooO = new C24568OooO0oO(oooo0.OooO0O0(C30935OooO0oo.class), new OooOO0O());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooOOO0(new C23857OooOO0o()));
        this.f79502OooOooo = new C22026ooOO(oooo0.OooO0O0(C30938OooOOo.class), new OooOOO(interfaceC32440OooOO0OooO0O0), new C23858OooOOOo(interfaceC32440OooOO0OooO0O0), new OooOOOO(interfaceC32440OooOO0OooO0O0));
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new C23855OooO0oO());
        C23856OooO0oo c23856OooO0oo = new C23856OooO0oo(c32447OooOOoOooO0OO);
        this.f79503Oooo000 = new C22026ooOO(oooo0.OooO0O0(C30933OooO0o0.class), c23856OooO0oo, new OooOO0(c32447OooOOoOooO0OO), new OooO(c32447OooOOoOooO0OO));
        this.f79504Oooo00O = new ImportImagesFragment();
        this.f79505Oooo00o = new ShareFileFragment();
    }

    public final C30938OooOOo OooOoo0() {
        return (C30938OooOOo) this.f79502OooOooo.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_sticker_set_edit_dialog, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C30938OooOOo c30938OooOOoOooOoo0 = OooOoo0();
        String str = ((C30935OooO0oo) this.f79501OooOooO.getValue()).f110536OooO00o;
        C33781o00o0O c33781o00o0O = c30938OooOOoOooOoo0.f110577OooO0oo;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, str);
        view.findViewById(R.id.btn_cancel).setOnClickListener(new ViewOnClickListenerC28150OooO0OO(this, 3));
        View viewFindViewById = view.findViewById(R.id.btn_confirm);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28153OooO0o0(this, 3));
        EditText editText = (EditText) view.findViewById(R.id.et_title);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(editText);
        editText.addTextChangedListener(new OooO00o());
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C23853OooO0Oo(editText, null), 3);
        view.findViewById(R.id.cl_add_from_gallery).setOnClickListener(new ViewOnClickListenerC28152OooO0o(this, 5));
        View viewFindViewById2 = view.findViewById(R.id.cl_add_from_file_manager);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById2);
        viewFindViewById2.setVisibility(8);
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28154OooO0oO(this, 4));
        View viewFindViewById3 = view.findViewById(R.id.cl_delete);
        View viewFindViewById4 = view.findViewById(R.id.tv_delete);
        View viewFindViewById5 = view.findViewById(R.id.iv_delete);
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC28155OooO0oo(this, 7));
        View viewFindViewById6 = view.findViewById(R.id.cl_share);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById6);
        C28050OooO0OO.OooO00o(viewFindViewById6, 1500L, new ViewOnClickListenerC28147OooO(this, 6));
        View viewFindViewById7 = view.findViewById(R.id.rv_preview);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById7, "findViewById(...)");
        final RecyclerView recyclerView = (RecyclerView) viewFindViewById7;
        view.post(new Runnable() { // from class: o0oOo00.OooO0o
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                int width = view2.getWidth() - (o000000O.OooO0o(26) * 2);
                StickerCollectionEditFragment stickerCollectionEditFragment = this;
                int dimensionPixelSize = width / stickerCollectionEditFragment.getResources().getDimensionPixelSize(R.dimen.sticker_preview_item_size);
                C34406OooO00o.f123390OooO00o.OooO00o(C20855OooooOO.OooO0OO(view2.getWidth(), dimensionPixelSize, "post view width: ", ", spanCount: "), new Object[0]);
                recyclerView.setLayoutManager(new GridLayoutManager(stickerCollectionEditFragment.requireContext(), dimensionPixelSize));
            }
        });
        C30887OooO0oo c30887OooO0oo = new C30887OooO0oo();
        recyclerView.setAdapter(c30887OooO0oo);
        c30887OooO0oo.f110381OooO0O0 = new ViewOnClickListenerC28157OooOO0O(this, 3);
        new C22041OooOOo(new com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o(new OooO0o(c30887OooO0oo), 15)).OooO0o(recyclerView);
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new OooO0O0(c30887OooO0oo, viewFindViewById, viewFindViewById3, viewFindViewById4, viewFindViewById5, viewFindViewById6, null), 3);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        Fragment fragmentOooOooo = getChildFragmentManager().OooOooo(this.f79504Oooo00O.getClass().getSimpleName());
        if (fragmentOooOooo != null) {
            this.f79504Oooo00O = (ImportImagesFragment) fragmentOooOooo;
        } else {
            FragmentManager childFragmentManager = getChildFragmentManager();
            androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(childFragmentManager, childFragmentManager);
            ImportImagesFragment importImagesFragment = this.f79504Oooo00O;
            oooO00oOooO0OO.OooO0Oo(0, importImagesFragment, importImagesFragment.getClass().getSimpleName(), 1);
            oooO00oOooO0OO.OooO0oo();
        }
        Fragment fragmentOooOooo2 = getChildFragmentManager().OooOooo(this.f79505Oooo00o.getClass().getSimpleName());
        if (fragmentOooOooo2 != null) {
            this.f79505Oooo00o = (ShareFileFragment) fragmentOooOooo2;
            return;
        }
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        androidx.fragment.app.OooO00o oooO00oOooO0OO2 = OooOOOo.OooOOO0.OooO0OO(childFragmentManager2, childFragmentManager2);
        ShareFileFragment shareFileFragment = this.f79505Oooo00o;
        oooO00oOooO0OO2.OooO0Oo(0, shareFileFragment, shareFileFragment.getClass().getSimpleName(), 1);
        oooO00oOooO0OO2.OooO0oo();
    }
}
