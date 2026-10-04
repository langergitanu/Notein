package com.orion.notein.p607ui.noteeditor.propertypanel.outline;

import OooOo.C20485OooOoO;
import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.OooO00o;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o000O0oo.RunnableC24436OooOoOO;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0O0o0oO.ViewOnClickListenerC26057OooooO0;
import o0O0o0oO.ViewOnClickListenerC26070ooOO;
import o0O0o0oO.o00O0O;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oo.C28039OooO00o;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o0o.ViewOnClickListenerC28251OooOooo;
import o0OoO000.C28524OooO0O0;
import o0OoO000.ViewOnClickListenerC28523OooO00o;
import o0OoO000.ViewOnClickListenerC28526OooO0o0;
import o0OoO0oo.C28781o0000oo0;
import o0OoO0oo.C28782o0000ooO;
import o0OoO0oo.C28978o0ooOOo;
import o0OoOOOo.ViewOnClickListenerC29113OooOo0O;
import o0OoooOo.C29661OooOoo0;
import o0Ooooo0.C29699OooO0OO;
import o0Ooooo0.C29705OooOO0;
import o0Ooooo0.C29708OooOO0O;
import o0Ooooo0.C29710OooOOO;
import o0Ooooo0.C29713OooOOOo;
import o0Ooooo0.ViewOnClickListenerC29697OooO00o;
import o0o0O0o.C30294OooO0OO;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O00oo.C32520OooO0oo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.Oooo000;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/outline/EditorOutlineFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class EditorOutlineFragment extends Hilt_EditorOutlineFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f75794OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f75795OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f75796OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public ViewGroup f75797OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f75798Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public EditText f75799Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f75800Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public ImageView f75801Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public RecyclerView f75802Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final com.orion.notein.p607ui.noteeditor.propertypanel.outline.OooO00o f75803Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Handler f75804Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public C30294OooO0OO f75805Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public C29661OooOoo0 f75806Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final C28978o0ooOOo f75807Oooo0oo;

    public static final class OooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23533OooO0oo f75808OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(C23533OooO0oo c23533OooO0oo) {
            super(0);
            this.f75808OooOo0o = c23533OooO0oo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f75808OooOo0o.invoke();
        }
    }

    public static final class OooO00o implements TextWatcher {
        public OooO00o() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C29705OooOO0 c29705OooOO0OooOooO = EditorOutlineFragment.this.OooOooO();
            String strValueOf = String.valueOf(charSequence);
            C33781o00o0O c33781o00o0O = c29705OooOO0OooOooO.f105296OooOO0o;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, strValueOf);
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$onViewCreated$11", m80623f = "EditorOutlineFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f75811OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$onViewCreated$11$1", m80623f = "EditorOutlineFragment.kt", m80624l = {423}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorOutlineFragment f75812OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75813OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19368OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorOutlineFragment f75814OooOo0o;

                public C19368OooO00o(EditorOutlineFragment editorOutlineFragment) {
                    this.f75814OooOo0o = editorOutlineFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String noteId = (String) obj;
                    EditorOutlineFragment editorOutlineFragment = this.f75814OooOo0o;
                    EditText editText = editorOutlineFragment.f75799Oooo000;
                    if (editText == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                        throw null;
                    }
                    editText.setText("");
                    C29705OooOO0 c29705OooOO0OooOooO = editorOutlineFragment.OooOooO();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                    C33781o00o0O c33781o00o0O = c29705OooOO0OooOooO.f105292OooO0oO;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, noteId);
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c29705OooOO0OooOooO);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29710OooOOO(noteId, null, c29705OooOO0OooOooO), 2);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(EditorOutlineFragment editorOutlineFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f75812OooOo = editorOutlineFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f75812OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75813OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorOutlineFragment editorOutlineFragment = this.f75812OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooOoo = editorOutlineFragment.OooOoo();
                    C19368OooO00o c19368OooO00o = new C19368OooO00o(editorOutlineFragment);
                    this.f75813OooOo0o = 1;
                    if (oooO0OOOooOoo.f73397OoooOoo.f121747OooOo0o.collect(c19368OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$onViewCreated$11$2", m80623f = "EditorOutlineFragment.kt", m80624l = {430}, m80625m = "invokeSuspend")
        public static final class C19369OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorOutlineFragment f75815OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75816OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$OooO0O0$OooO0O0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorOutlineFragment f75817OooOo0o;

                public OooO00o(EditorOutlineFragment editorOutlineFragment) {
                    this.f75817OooOo0o = editorOutlineFragment;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    int i;
                    List<T> list = (List) obj;
                    final EditorOutlineFragment editorOutlineFragment = this.f75817OooOo0o;
                    TextView textView = editorOutlineFragment.f75798Oooo0;
                    if (textView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("emptyView");
                        throw null;
                    }
                    if (list.isEmpty()) {
                        EditText editText = editorOutlineFragment.f75799Oooo000;
                        if (editText == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                            throw null;
                        }
                        Editable text = editText.getText();
                        kotlin.jvm.internal.OooOOO0.OooO0o(text, "getText(...)");
                        if (text.length() > 0) {
                            i = 0;
                        }
                    } else {
                        i = 8;
                    }
                    textView.setVisibility(i);
                    editorOutlineFragment.f75803Oooo0OO.OooO0o0(list, new Runnable() { // from class: o0Ooooo0.OooO0O0
                        @Override // java.lang.Runnable
                        public final void run() {
                            EditorOutlineFragment.OooOoO(editorOutlineFragment);
                        }
                    });
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19369OooO0O0(EditorOutlineFragment editorOutlineFragment, Continuation<? super C19369OooO0O0> continuation) {
                super(2, continuation);
                this.f75815OooOo = editorOutlineFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19369OooO0O0(this.f75815OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19369OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75816OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorOutlineFragment editorOutlineFragment = this.f75815OooOo;
                    C29705OooOO0 c29705OooOO0OooOooO = editorOutlineFragment.OooOooO();
                    OooO00o oooO00o = new OooO00o(editorOutlineFragment);
                    this.f75816OooOo0o = 1;
                    if (c29705OooOO0OooOooO.f105297OooOOO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$onViewCreated$11$3", m80623f = "EditorOutlineFragment.kt", m80624l = {439}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorOutlineFragment f75818OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75819OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorOutlineFragment f75820OooOo0o;

                public OooO00o(EditorOutlineFragment editorOutlineFragment) {
                    this.f75820OooOo0o = editorOutlineFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    if (((Number) obj).intValue() == 1) {
                        EditorOutlineFragment editorOutlineFragment = this.f75820OooOo0o;
                        EditText editText = editorOutlineFragment.f75799Oooo000;
                        if (editText == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                            throw null;
                        }
                        editText.setText("");
                        EditText editText2 = editorOutlineFragment.f75799Oooo000;
                        if (editText2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                            throw null;
                        }
                        editText2.clearFocus();
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(EditorOutlineFragment editorOutlineFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f75818OooOo = editorOutlineFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f75818OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75819OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                EditorOutlineFragment editorOutlineFragment = this.f75818OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooOoo = editorOutlineFragment.OooOoo();
                OooO00o oooO00o = new OooO00o(editorOutlineFragment);
                this.f75819OooOo0o = 1;
                oooO0OOOooOoo.f73408o000000.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$OooO0O0$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$onViewCreated$11$4", m80623f = "EditorOutlineFragment.kt", m80624l = {448}, m80625m = "invokeSuspend")
        public static final class C23529OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorOutlineFragment f75821OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75822OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$OooO0O0$OooO0Oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$onViewCreated$11$4$1", m80623f = "EditorOutlineFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteContent, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorOutlineFragment f75823OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f75824OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorOutlineFragment editorOutlineFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75823OooOo = editorOutlineFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75823OooOo, continuation);
                    oooO00o.f75824OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(NoteContent noteContent, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(noteContent, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                @Override // oO00ooo.AbstractC32477OooO00o
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    boolean z;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    NoteContent noteContent = (NoteContent) this.f75824OooOo0o;
                    if (noteContent != null) {
                        z = noteContent.getUnboundedNote();
                    }
                    EditorOutlineFragment editorOutlineFragment = this.f75823OooOo;
                    ViewGroup viewGroup = editorOutlineFragment.f75797OooOooo;
                    if (viewGroup == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("searchViewWrapper");
                        throw null;
                    }
                    viewGroup.setVisibility(!z ? 0 : 8);
                    View view = editorOutlineFragment.f75800Oooo00O;
                    if (view != null) {
                        view.setVisibility(z ? 8 : 0);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnTiledPage");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23529OooO0Oo(EditorOutlineFragment editorOutlineFragment, Continuation<? super C23529OooO0Oo> continuation) {
                super(2, continuation);
                this.f75821OooOo = editorOutlineFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23529OooO0Oo(this.f75821OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23529OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75822OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorOutlineFragment editorOutlineFragment = this.f75821OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooOoo = editorOutlineFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(editorOutlineFragment, null);
                    this.f75822OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f73396OoooOoO, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$onViewCreated$11$6", m80623f = "EditorOutlineFragment.kt", m80624l = {462}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorOutlineFragment f75825OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75826OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$onViewCreated$11$6$1", m80623f = "EditorOutlineFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorOutlineFragment f75827OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f75828OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorOutlineFragment editorOutlineFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75827OooOo = editorOutlineFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75827OooOo, continuation);
                    oooO00o.f75828OooOo0o = ((Boolean) obj).booleanValue();
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    boolean z = this.f75828OooOo0o;
                    EditorOutlineFragment editorOutlineFragment = this.f75827OooOo;
                    ImageView imageView = editorOutlineFragment.f75801Oooo00o;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivClearSearch");
                        throw null;
                    }
                    imageView.setVisibility(z ? 0 : 8);
                    EditorOutlineFragment.OooOoO(editorOutlineFragment);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(EditorOutlineFragment editorOutlineFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f75825OooOo = editorOutlineFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f75825OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75826OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorOutlineFragment editorOutlineFragment = this.f75825OooOo;
                    C29705OooOO0 c29705OooOO0OooOooO = editorOutlineFragment.OooOooO();
                    OooO00o oooO00o = new OooO00o(editorOutlineFragment, null);
                    this.f75826OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c29705OooOO0OooOooO.f105298OooOOO0, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$onViewCreated$11$5", m80623f = "EditorOutlineFragment.kt", m80624l = {456}, m80625m = "invokeSuspend")
        public static final class OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorOutlineFragment f75829OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75830OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$onViewCreated$11$5$1", m80623f = "EditorOutlineFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends SortKeyVO>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorOutlineFragment f75831OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f75832OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorOutlineFragment editorOutlineFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75831OooOo = editorOutlineFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75831OooOo, continuation);
                    oooO00o.f75832OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends SortKeyVO> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List<SortKeyVO> list = (List) this.f75832OooOo0o;
                    C30294OooO0OO c30294OooO0OO = this.f75831OooOo.f75805Oooo0o0;
                    if (c30294OooO0OO != null) {
                        c30294OooO0OO.OooO0OO(list);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o0(EditorOutlineFragment editorOutlineFragment, Continuation<? super OooO0o0> continuation) {
                super(2, continuation);
                this.f75829OooOo = editorOutlineFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o0(this.f75829OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75830OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorOutlineFragment editorOutlineFragment = this.f75829OooOo;
                    C29705OooOO0 c29705OooOO0OooOooO = editorOutlineFragment.OooOooO();
                    OooO00o oooO00o = new OooO00o(editorOutlineFragment, null);
                    this.f75830OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c29705OooOO0OooOooO.f105299OooOOOO, oooO00o, this) == enumC32485OooO00o) {
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

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = EditorOutlineFragment.this.new OooO0O0(continuation);
            oooO0O0.f75811OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f75811OooOo0o;
            EditorOutlineFragment editorOutlineFragment = EditorOutlineFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(editorOutlineFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19369OooO0O0(editorOutlineFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(editorOutlineFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23529OooO0Oo(editorOutlineFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o0(editorOutlineFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(editorOutlineFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$onViewCreated$2$1$1", m80623f = "EditorOutlineFragment.kt", m80624l = {103}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75834OooOo0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorOutlineFragment.this.new OooO0OO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75834OooOo0o;
            EditorOutlineFragment editorOutlineFragment = EditorOutlineFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f75834OooOo0o = 1;
                obj = EditorOutlineFragment.OooOoo0(editorOutlineFragment, 40, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                String string = editorOutlineFragment.getString(R.string.clear_outline);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                String string2 = editorOutlineFragment.getString(R.string.alert_clear_outline);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                new TipsDialogFragment(string, string2, new ViewOnClickListenerC26311Ooooooo(), new ViewOnClickListenerC28526OooO0o0(editorOutlineFragment, 1)).show(editorOutlineFragment.getChildFragmentManager(), "TipsDialogFragment");
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$onViewCreated$5$1$1$1", m80623f = "EditorOutlineFragment.kt", m80624l = {146}, m80625m = "invokeSuspend")
    public static final class C23530OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75836OooOo0o;

        public C23530OooO0Oo(Continuation<? super C23530OooO0Oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorOutlineFragment.this.new C23530OooO0Oo(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23530OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75836OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f75836OooOo0o = 1;
                if (EditorOutlineFragment.OooOoo0(EditorOutlineFragment.this, 8, this) == enumC32485OooO00o) {
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$onViewCreated$9$2", m80623f = "EditorOutlineFragment.kt", m80624l = {191}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75838OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ OutlineVO f75839OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(OutlineVO outlineVO, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f75839OooOoO0 = outlineVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorOutlineFragment.this.new OooO0o(this.f75839OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75838OooOo0o;
            EditorOutlineFragment editorOutlineFragment = EditorOutlineFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f75838OooOo0o = 1;
                obj = EditorOutlineFragment.OooOoo0(editorOutlineFragment, 40, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(editorOutlineFragment), new C28782o0000ooO(this.f75839OooOoO0));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$onViewCreated$9$1", m80623f = "EditorOutlineFragment.kt", m80624l = {181}, m80625m = "invokeSuspend")
    public static final class C23531OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75841OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ OutlineVO f75842OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23531OooO0o0(OutlineVO outlineVO, Continuation<? super C23531OooO0o0> continuation) {
            super(2, continuation);
            this.f75842OooOoO0 = outlineVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorOutlineFragment.this.new C23531OooO0o0(this.f75842OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23531OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75841OooOo0o;
            EditorOutlineFragment editorOutlineFragment = EditorOutlineFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f75841OooOo0o = 1;
                obj = EditorOutlineFragment.OooOoo0(editorOutlineFragment, 40, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                OutlineVO outlineVO = this.f75842OooOoO0;
                String outlineId = outlineVO.getId();
                boolean hasChildren = outlineVO.getHasChildren();
                kotlin.jvm.internal.OooOOO0.OooO0oO(outlineId, "outlineId");
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(editorOutlineFragment), new C28781o0000oo0(outlineId, hasChildren));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23532OooO0oO extends C22041OooOOo.AbstractC22044OooO0oO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public OooO00o.OooO0O0 f75843OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f75844OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final String f75845OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f75846OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f75847OooO0oo;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$OooO0oO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$onViewCreated$callback$1$clearView$1$1", m80623f = "EditorOutlineFragment.kt", m80624l = {404, 405}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorOutlineFragment f75849OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75850OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ OutlineVO f75851OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ OutlineVO f75852OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public final /* synthetic */ C23532OooO0oO f75853OooOoOO;

            /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
            public final /* synthetic */ int f75854OooOoo0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(EditorOutlineFragment editorOutlineFragment, OutlineVO outlineVO, OutlineVO outlineVO2, C23532OooO0oO c23532OooO0oO, int i, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f75849OooOo = editorOutlineFragment;
                this.f75852OooOoO0 = outlineVO;
                this.f75851OooOoO = outlineVO2;
                this.f75853OooOoOO = c23532OooO0oO;
                this.f75854OooOoo0 = i;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f75849OooOo, this.f75852OooOoO0, this.f75851OooOoO, this.f75853OooOoOO, this.f75854OooOoo0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
            
                if (r12 == r0) goto L21;
             */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75850OooOo0o;
                EditorOutlineFragment editorOutlineFragment = this.f75849OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C29705OooOO0 c29705OooOO0OooOooO = editorOutlineFragment.OooOooO();
                    this.f75850OooOo0o = 1;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29713OooOOOo(null, c29705OooOO0OooOooO), this);
                    if (objOooO0o != obj2) {
                        objOooO0o = C32460OooOooO.f116667OooO00o;
                    }
                    if (objOooO0o != obj2) {
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
                C29705OooOO0 c29705OooOO0OooOooO2 = editorOutlineFragment.OooOooO();
                int i2 = this.f75853OooOoOO.f75847OooO0oo;
                this.f75850OooOo0o = 2;
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29708OooOO0O(c29705OooOO0OooOooO2, this.f75852OooOoO0, this.f75854OooOoo0, this.f75851OooOoO, i2, null), this);
                if (objOooO0o2 != obj2) {
                    objOooO0o2 = C32460OooOooO.f116667OooO00o;
                }
            }
        }

        public C23532OooO0oO() {
            super(3);
            this.f75845OooO0o0 = "callback";
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final RecyclerView.AbstractC22078OooOooO OooO0O0(RecyclerView.AbstractC22078OooOooO selected, ArrayList dropTargets, int i, int i2) {
            int top;
            int i3;
            kotlin.jvm.internal.OooOOO0.OooO0oO(selected, "selected");
            kotlin.jvm.internal.OooOOO0.OooO0oO(dropTargets, "dropTargets");
            int height = selected.itemView.getHeight() + i2;
            selected.itemView.getTop();
            RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = null;
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            for (int size = dropTargets.size(); i5 < size; size = i3) {
                RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO2 = (RecyclerView.AbstractC22078OooOooO) dropTargets.get(i5);
                if (abstractC22078OooOooO2.getItemViewType() != 0) {
                    i3 = size;
                } else {
                    Object tag = abstractC22078OooOooO2.itemView.getTag();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.propertypanel.outline.OutlineVO");
                    OutlineVO outlineVO = (OutlineVO) tag;
                    top = i2 - abstractC22078OooOooO2.itemView.getTop();
                    String str = outlineVO.getTitle() + ": top:" + abstractC22078OooOooO2.itemView.getTop() + " curY " + i2 + ", diff " + top;
                    String str2 = this.f75845OooO0o0;
                    Log.d(str2, str);
                    if (top > 0) {
                        i3 = size;
                        Log.d(str2, outlineVO.getTitle() + ": top:" + abstractC22078OooOooO2.itemView.getTop() + " curY " + i2 + ", score " + top);
                        if (top > i4) {
                            double d = top;
                            if (d < ((double) abstractC22078OooOooO2.itemView.getHeight()) * 0.3d) {
                                this.f75844OooO0o = 1;
                                Log.d(str2, "dropTarget dropPos = DROP_BEFORE 1");
                                this.f75847OooO0oo = 0;
                                this.f75846OooO0oO = true;
                            } else if (d < ((double) abstractC22078OooOooO2.itemView.getHeight()) * 0.7d) {
                                this.f75847OooO0oo = 1;
                                Log.d(str2, "dropTarget dropPos = DROP_BEFORE 2");
                                this.f75844OooO0o = 0;
                                this.f75846OooO0oO = false;
                            } else {
                                this.f75844OooO0o = 1;
                                Log.d(str2, "dropTarget dropPos = DROP_AFTER 3");
                                this.f75847OooO0oo = 1;
                                this.f75846OooO0oO = false;
                            }
                            abstractC22078OooOooO = abstractC22078OooOooO2;
                        }
                        i5++;
                        i4 = top;
                    } else {
                        i3 = size;
                        int bottom = abstractC22078OooOooO2.itemView.getBottom() - height;
                        Log.d(str2, outlineVO.getTitle() + ": top:" + abstractC22078OooOooO2.itemView.getBottom() + " bottom " + height + ", score " + bottom);
                        double d2 = (double) bottom;
                        if (d2 < ((double) abstractC22078OooOooO2.itemView.getHeight()) * 0.3d) {
                            this.f75844OooO0o = 1;
                            Log.d(str2, "dropTarget dropPos = DROP_AFTER 4");
                            this.f75847OooO0oo = 1;
                            this.f75846OooO0oO = true;
                        } else if (d2 < ((double) abstractC22078OooOooO2.itemView.getHeight()) * 0.7d) {
                            this.f75847OooO0oo = 0;
                            Log.d(str2, "dropTarget dropType = 1");
                            this.f75844OooO0o = 0;
                            this.f75846OooO0oO = false;
                        } else {
                            this.f75844OooO0o = 1;
                            Log.d(str2, "dropTarget dropPos = DROP_BEFORE 5");
                            this.f75847OooO0oo = 0;
                            this.f75846OooO0oO = false;
                        }
                        top = bottom;
                        abstractC22078OooOooO = abstractC22078OooOooO2;
                        i5++;
                        i4 = top;
                    }
                }
                top = i4;
                i5++;
                i4 = top;
            }
            return abstractC22078OooOooO;
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final void OooO0OO(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder) {
            C23532OooO0oO c23532OooO0oO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
            kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
            super.OooO0OO(recyclerView, viewHolder);
            EditorOutlineFragment editorOutlineFragment = EditorOutlineFragment.this;
            EditorOutlineFragment.OooOoOO(editorOutlineFragment, false);
            OooO00o.OooO0O0 oooO0O0 = this.f75843OooO;
            if (oooO0O0 != null) {
                View view = oooO0O0.itemView;
                view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.item_bg_secondary_color_normal));
                int i = this.f75844OooO0o;
                Object tag = viewHolder.itemView.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.propertypanel.outline.OutlineVO");
                OutlineVO outlineVO = (OutlineVO) tag;
                Object tag2 = oooO0O0.itemView.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.propertypanel.outline.OutlineVO");
                OutlineVO outlineVO2 = (OutlineVO) tag2;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(outlineVO.getId(), outlineVO2.getId())) {
                    return;
                }
                StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(this.f75847OooO0oo, "clearView-dropTarget ", outlineVO2.getTitle(), ",dropPos ", " dropType ");
                sbOooO0OO.append(i);
                Log.d(this.f75845OooO0o0, sbOooO0OO.toString());
                InterfaceC21987OooOoo viewLifecycleOwner = editorOutlineFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                c23532OooO0oO = this;
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(editorOutlineFragment, outlineVO, outlineVO2, c23532OooO0oO, i, null), 3);
            } else {
                c23532OooO0oO = this;
            }
            c23532OooO0oO.f75843OooO = null;
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final float OooO0oO(RecyclerView.AbstractC22078OooOooO viewHolder) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
            return 0.1f;
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22044OooO0oO, androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final int OooO0oo(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
            kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
            if (viewHolder.getItemViewType() != 0) {
                return 0;
            }
            Object tag = viewHolder.itemView.getTag();
            kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.propertypanel.outline.OutlineVO");
            if (((OutlineVO) tag).getSearchQuery().length() > 0) {
                return 0;
            }
            return C22041OooOOo.AbstractC22042OooO0Oo.OooOO0O(this.f65993OooO0Oo);
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final void OooOOO(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
            Log.d(this.f75845OooO0o0, "onSelectedChanged");
            EditorOutlineFragment editorOutlineFragment = EditorOutlineFragment.this;
            if (abstractC22078OooOooO != null) {
                Object tag = ((OooO00o.OooO0O0) abstractC22078OooOooO).itemView.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.propertypanel.outline.OutlineVO");
                OutlineVO outlineVO = (OutlineVO) tag;
                if (outlineVO.getExpand()) {
                    editorOutlineFragment.OooOooO().OooO0oO(outlineVO);
                }
            }
            EditorOutlineFragment.OooOoOO(editorOutlineFragment, i == 2);
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final boolean OooOOO0(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
            kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
            abstractC22078OooOooO.getAdapterPosition();
            OooO00o.OooO0O0 oooO0O0 = this.f75843OooO;
            if (oooO0O0 != null) {
                View view = oooO0O0.itemView;
                view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.item_bg_secondary_color_normal));
            }
            OooO00o.OooO0O0 oooO0O02 = (OooO00o.OooO0O0) abstractC22078OooOooO;
            View view2 = oooO0O02.itemView;
            view2.setBackgroundColor(ContextCompat.getColor(view2.getContext(), R.color.item_bg_secondary_color_normal));
            if (this.f75846OooO0oO) {
                EditorOutlineFragment editorOutlineFragment = EditorOutlineFragment.this;
                List list = (List) editorOutlineFragment.OooOooO().f105297OooOOO.f121747OooOo0o.getValue();
                int adapterPosition = viewHolder.getAdapterPosition();
                int adapterPosition2 = oooO0O02.getAdapterPosition();
                if (adapterPosition < adapterPosition2) {
                    int i = adapterPosition;
                    while (i < adapterPosition2) {
                        int i2 = i + 1;
                        Collections.swap(list, i, i2);
                        i = i2;
                    }
                } else {
                    int i3 = adapterPosition2 + 1;
                    if (i3 <= adapterPosition) {
                        int i4 = adapterPosition;
                        while (true) {
                            Collections.swap(list, i4, i4 - 1);
                            if (i4 == i3) {
                                break;
                            }
                            i4--;
                        }
                    }
                }
                editorOutlineFragment.f75803Oooo0OO.notifyItemMoved(adapterPosition, adapterPosition2);
            }
            if (this.f75844OooO0o == 0) {
                View view3 = oooO0O02.itemView;
                view3.setBackgroundColor(ContextCompat.getColor(view3.getContext(), R.color.item_bg_color_pressed));
            }
            this.f75843OooO = oooO0O02;
            return true;
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final void OooOOOO(RecyclerView.AbstractC22078OooOooO viewHolder) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23533OooO0oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23533OooO0oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return EditorOutlineFragment.this;
        }
    }

    public static final class OooOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75856OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75856OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f75856OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75857OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75857OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75857OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23534OooOO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f75858OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23534OooOO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75858OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75858OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? EditorOutlineFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class OooOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75860OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75860OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f75860OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C28524OooO0O0 f75861OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(C28524OooO0O0 c28524OooO0O0) {
            super(0);
            this.f75861OooOo0o = c28524OooO0O0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f75861OooOo0o.invoke();
        }
    }

    public static final class OooOOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75862OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75862OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75862OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineFragment$OooOOOo, reason: case insensitive filesystem */
    public static final class C23535OooOOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f75863OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23535OooOOOo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75863OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75863OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? EditorOutlineFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public EditorOutlineFragment() {
        C23533OooO0oo c23533OooO0oo = new C23533OooO0oo();
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO(c23533OooO0oo));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f75795OooOoo0 = new C22026ooOO(oooo0.OooO0O0(C29705OooOO0.class), new OooOO0(interfaceC32440OooOO0OooO0O0), new C23534OooOO0o(interfaceC32440OooOO0OooO0O0), new OooOO0O(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooOOO0(new C28524OooO0O0(this, 1)));
        this.f75794OooOoo = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.OooO0OO.class), new OooOOO(interfaceC32440OooOO0OooO0O02), new C23535OooOOOo(interfaceC32440OooOO0OooO0O02), new OooOOOO(interfaceC32440OooOO0OooO0O02));
        this.f75803Oooo0OO = new com.orion.notein.p607ui.noteeditor.propertypanel.outline.OooO00o(OooO00o.OooO0OO.f75885OooO00o);
        this.f75804Oooo0o = new Handler(Looper.getMainLooper());
        this.f75807Oooo0oo = new C28978o0ooOOo(this, 1);
    }

    public static final void OooOoO(EditorOutlineFragment editorOutlineFragment) {
        EditText editText = editorOutlineFragment.f75799Oooo000;
        if (editText == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
            throw null;
        }
        if (editText.hasFocus() && C28039OooO00o.OooO0Oo()) {
            editorOutlineFragment.f75804Oooo0o.postDelayed(new RunnableC24436OooOoOO(editorOutlineFragment, 1), 50L);
        }
    }

    public static final void OooOoOO(EditorOutlineFragment editorOutlineFragment, boolean z) {
        TextView textView;
        editorOutlineFragment.f75803Oooo0OO.f75878OooO0OO = z;
        RecyclerView recyclerView = editorOutlineFragment.f75802Oooo0O0;
        if (recyclerView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("outline");
            throw null;
        }
        Iterator<Integer> it = new oO0O00oo.OooO(0, recyclerView.getChildCount(), 1).iterator();
        while (((C32520OooO0oo) it).f116817OooOoO0) {
            int iNextInt = ((Oooo000) it).nextInt();
            RecyclerView recyclerView2 = editorOutlineFragment.f75802Oooo0O0;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("outline");
                throw null;
            }
            View childAt = recyclerView2.getChildAt(iNextInt);
            if (childAt != null && (textView = (TextView) childAt.findViewById(R.id.title)) != null) {
                textView.setMaxLines(z ? 1 : 4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoo0(EditorOutlineFragment editorOutlineFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29699OooO0OO c29699OooO0OO;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C29699OooO0OO) {
            c29699OooO0OO = (C29699OooO0OO) abstractC32479OooO0OO;
            int i2 = c29699OooO0OO.f105283OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29699OooO0OO.f105283OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c29699OooO0OO = new C29699OooO0OO(editorOutlineFragment, abstractC32479OooO0OO);
            }
        }
        C29699OooO0OO c29699OooO0OO2 = c29699OooO0OO;
        Object objShowNonVipFeatureLimitedDialog$default = c29699OooO0OO2.f105282OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c29699OooO0OO2.f105283OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = editorOutlineFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c29699OooO0OO2.f105283OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c29699OooO0OO2, 6, null);
            if (objShowNonVipFeatureLimitedDialog$default == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
        }
        zBooleanValue = ((Boolean) objShowNonVipFeatureLimitedDialog$default).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    public final com.orion.notein.p607ui.noteeditor.OooO0OO OooOoo() {
        return (com.orion.notein.p607ui.noteeditor.OooO0OO) this.f75794OooOoo.getValue();
    }

    public final C29705OooOO0 OooOooO() {
        return (C29705OooOO0) this.f75795OooOoo0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_property_outline, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C21030OooOO0o.OooO0OO(this).OooOo0o(this.f75807Oooo0oo);
        C30294OooO0OO c30294OooO0OO = this.f75805Oooo0o0;
        if (c30294OooO0OO != null) {
            c30294OooO0OO.OooO00o();
        }
        this.f75804Oooo0o.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            view.requestLayout();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.guide);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById);
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC26057OooooO0(this, 3));
        TextView textView = (TextView) view.findViewById(R.id.tv_clear);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(textView);
        C28050OooO0OO.OooO00o(textView, 500L, new ViewOnClickListenerC28251OooOooo(this, 2));
        View viewFindViewById2 = view.findViewById(R.id.tv_page_tiled);
        TextView textView2 = (TextView) viewFindViewById2;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(textView2);
        C28050OooO0OO.OooO00o(textView2, 500L, new o0Oo0o0o.Oooo000(this, 2));
        this.f75800Oooo00O = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.guide);
        this.f75796OooOooO = viewFindViewById3;
        if (viewFindViewById3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnNewbieGuide");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC29113OooOo0O(this, 1));
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_sort);
        imageView.setOnClickListener(new ViewOnClickListenerC26070ooOO(1, this, imageView));
        this.f75797OooOooo = (ViewGroup) view.findViewById(R.id.cl_search);
        EditText editText = (EditText) view.findViewById(R.id.search_box);
        this.f75799Oooo000 = editText;
        if (editText == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
            throw null;
        }
        editText.addTextChangedListener(new OooO00o());
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_clear_search);
        this.f75801Oooo00o = imageView2;
        if (imageView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("ivClearSearch");
            throw null;
        }
        imageView2.setOnClickListener(new o00O0O(this, 3));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.outline);
        com.orion.notein.p607ui.noteeditor.propertypanel.outline.OooO00o oooO00o = this.f75803Oooo0OO;
        recyclerView.setAdapter(oooO00o);
        recyclerView.setItemAnimator(null);
        this.f75802Oooo0O0 = recyclerView;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f75806Oooo0oO = new C29661OooOoo0(contextRequireContext, new ViewOnClickListenerC29697OooO00o(this, 0));
        oooO00o.f75877OooO0O0 = new ViewOnClickListenerC28523OooO00o(this, 1);
        C22041OooOOo c22041OooOOo = new C22041OooOOo(new C23532OooO0oO());
        RecyclerView recyclerView2 = this.f75802Oooo0O0;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("outline");
            throw null;
        }
        c22041OooOOo.OooO0o(recyclerView2);
        this.f75798Oooo0 = (TextView) view.findViewById(R.id.tv_empty);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(null), 3);
        C21030OooOO0o.OooO0OO(this).OooO0O0(this.f75807Oooo0oo);
    }
}
