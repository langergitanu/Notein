package com.orion.notein.p607ui.noteeditor.propertypanel.comment;

import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.EditorCommentFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.ViewOnClickListenerC26282Oooo;
import o0O0oooO.ViewOnClickListenerC26290Oooo0o0;
import o0O0oooO.ViewOnClickListenerC26292Oooo0oo;
import o0O0oooO.ViewOnClickListenerC26295OoooO00;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oo.C28039OooO00o;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.ViewOnClickListenerC28179Oooo0;
import o0Oo0o00.ViewOnClickListenerC28182Oooo00o;
import o0Oo0o00.ViewOnClickListenerC28184Oooo0OO;
import o0OoO0oo.C28768o0000OoO;
import o0OoO0oo.C28773o0000o0;
import o0OoO0oo.ViewOnClickListenerC28688OooO0Oo;
import o0OoO0oo.ViewOnClickListenerC28702OooOOoo;
import o0OoooOo.C29634OooO;
import o0OoooOo.C29635OooO00o;
import o0OoooOo.C29641OooO0oO;
import o0OoooOo.C29642OooO0oo;
import o0OoooOo.C29652OooOOoo;
import o0OoooOo.C29655OooOo00;
import o0OoooOo.C29658OooOoO;
import o0OoooOo.C29661OooOoo0;
import o0OoooOo.RunnableC29640OooO0o0;
import o0o0O0o.C30294OooO0OO;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/comment/EditorCommentFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class EditorCommentFragment extends Hilt_EditorCommentFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f75717OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f75718OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f75719OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public ViewGroup f75720OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f75721Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public EditText f75722Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ImageView f75723Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f75724Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public RecyclerView f75725Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final C29635OooO00o f75726Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Handler f75727Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public C30294OooO0OO f75728Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public C29661OooOoo0 f75729Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final C29642OooO0oo f75730Oooo0oo;

    public static final class OooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23526OooO0oo f75731OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(C23526OooO0oo c23526OooO0oo) {
            super(0);
            this.f75731OooOo0o = c23526OooO0oo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f75731OooOo0o.invoke();
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
            C29652OooOOoo c29652OooOOooOooOoo = EditorCommentFragment.this.OooOoo();
            String strValueOf = String.valueOf(charSequence);
            C33781o00o0O c33781o00o0O = c29652OooOOooOooOoo.f105138OooOO0o;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, strValueOf);
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$onViewCreated$10$1", m80623f = "EditorCommentFragment.kt", m80624l = {215}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75734OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ CommentVO f75735OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(CommentVO commentVO, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f75735OooOoO0 = commentVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorCommentFragment.this.new OooO0O0(this.f75735OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75734OooOo0o;
            EditorCommentFragment editorCommentFragment = EditorCommentFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f75734OooOo0o = 1;
                obj = EditorCommentFragment.OooOoOO(editorCommentFragment, 41, this);
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
                String commentId = this.f75735OooOoO0.getId();
                kotlin.jvm.internal.OooOOO0.OooO0oO(commentId, "commentId");
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(editorCommentFragment), new C28768o0000OoO(commentId));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$onViewCreated$10$2", m80623f = "EditorCommentFragment.kt", m80624l = {225}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75737OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ CommentVO f75738OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(CommentVO commentVO, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f75738OooOoO0 = commentVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorCommentFragment.this.new OooO0OO(this.f75738OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75737OooOo0o;
            EditorCommentFragment editorCommentFragment = EditorCommentFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f75737OooOo0o = 1;
                obj = EditorCommentFragment.OooOoOO(editorCommentFragment, 41, this);
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
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(editorCommentFragment), new C28773o0000o0(this.f75738OooOoO0));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$onViewCreated$12", m80623f = "EditorCommentFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23522OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f75740OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$onViewCreated$12$1", m80623f = "EditorCommentFragment.kt", m80624l = {StyleIdentifier.COLORFUL_LIST_ACCENT_6}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorCommentFragment f75741OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75742OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0Oo$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19365OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorCommentFragment f75743OooOo0o;

                public C19365OooO00o(EditorCommentFragment editorCommentFragment) {
                    this.f75743OooOo0o = editorCommentFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String noteId = (String) obj;
                    EditorCommentFragment editorCommentFragment = this.f75743OooOo0o;
                    EditText editText = editorCommentFragment.f75722Oooo000;
                    if (editText == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                        throw null;
                    }
                    editText.setText("");
                    C29652OooOOoo c29652OooOOooOooOoo = editorCommentFragment.OooOoo();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                    C33781o00o0O c33781o00o0O = c29652OooOOooOooOoo.f105134OooO0oO;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, noteId);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(EditorCommentFragment editorCommentFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f75741OooOo = editorCommentFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f75741OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75742OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorCommentFragment editorCommentFragment = this.f75741OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooOoo0 = editorCommentFragment.OooOoo0();
                    C19365OooO00o c19365OooO00o = new C19365OooO00o(editorCommentFragment);
                    this.f75742OooOo0o = 1;
                    if (oooO0OOOooOoo0.f73397OoooOoo.f121747OooOo0o.collect(c19365OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0Oo$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$onViewCreated$12$2", m80623f = "EditorCommentFragment.kt", m80624l = {StyleIdentifier.BIBLIOGRAPHY}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorCommentFragment f75744OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75745OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0Oo$OooO0O0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorCommentFragment f75746OooOo0o;

                public OooO00o(EditorCommentFragment editorCommentFragment) {
                    this.f75746OooOo0o = editorCommentFragment;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    int i;
                    List<CommentVO> list = (List) obj;
                    EditorCommentFragment editorCommentFragment = this.f75746OooOo0o;
                    TextView textView = editorCommentFragment.f75724Oooo00o;
                    if (textView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("emptyView");
                        throw null;
                    }
                    if (list.isEmpty()) {
                        EditText editText = editorCommentFragment.f75722Oooo000;
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
                    editorCommentFragment.f75726Oooo0OO.OooO0OO(list);
                    EditorCommentFragment.OooOoO(editorCommentFragment);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(EditorCommentFragment editorCommentFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f75744OooOo = editorCommentFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f75744OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75745OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorCommentFragment editorCommentFragment = this.f75744OooOo;
                    C29652OooOOoo c29652OooOOooOooOoo = editorCommentFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(editorCommentFragment);
                    this.f75745OooOo0o = 1;
                    if (c29652OooOOooOooOoo.f105139OooOOO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0Oo$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$onViewCreated$12$3", m80623f = "EditorCommentFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_1_LIGHT}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorCommentFragment f75747OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75748OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0Oo$OooO0OO$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorCommentFragment f75749OooOo0o;

                public OooO00o(EditorCommentFragment editorCommentFragment) {
                    this.f75749OooOo0o = editorCommentFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    if (((Number) obj).intValue() == 1) {
                        EditorCommentFragment editorCommentFragment = this.f75749OooOo0o;
                        EditText editText = editorCommentFragment.f75722Oooo000;
                        if (editText == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                            throw null;
                        }
                        editText.setText("");
                        EditText editText2 = editorCommentFragment.f75722Oooo000;
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
            public OooO0OO(EditorCommentFragment editorCommentFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f75747OooOo = editorCommentFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f75747OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75748OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                EditorCommentFragment editorCommentFragment = this.f75747OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooOoo0 = editorCommentFragment.OooOoo0();
                OooO00o oooO00o = new OooO00o(editorCommentFragment);
                this.f75748OooOo0o = 1;
                oooO0OOOooOoo0.f73408o000000.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0Oo$OooO0Oo, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$onViewCreated$12$4", m80623f = "EditorCommentFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_1}, m80625m = "invokeSuspend")
        public static final class C19366OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorCommentFragment f75750OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75751OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0Oo$OooO0Oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$onViewCreated$12$4$1", m80623f = "EditorCommentFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteContent, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorCommentFragment f75752OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f75753OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorCommentFragment editorCommentFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75752OooOo = editorCommentFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75752OooOo, continuation);
                    oooO00o.f75753OooOo0o = obj;
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
                    NoteContent noteContent = (NoteContent) this.f75753OooOo0o;
                    if (noteContent != null) {
                        z = noteContent.getUnboundedNote();
                    }
                    EditorCommentFragment editorCommentFragment = this.f75752OooOo;
                    ViewGroup viewGroup = editorCommentFragment.f75720OooOooo;
                    if (viewGroup == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("searchViewWrapper");
                        throw null;
                    }
                    viewGroup.setVisibility(!z ? 0 : 8);
                    View view = editorCommentFragment.f75721Oooo0;
                    if (view != null) {
                        view.setVisibility(z ? 8 : 0);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnTiledPage");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19366OooO0Oo(EditorCommentFragment editorCommentFragment, Continuation<? super C19366OooO0Oo> continuation) {
                super(2, continuation);
                this.f75750OooOo = editorCommentFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19366OooO0Oo(this.f75750OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19366OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75751OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorCommentFragment editorCommentFragment = this.f75750OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooOoo0 = editorCommentFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(editorCommentFragment, null);
                    this.f75751OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo0.f73396OoooOoO, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0Oo$OooO0o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$onViewCreated$12$6", m80623f = "EditorCommentFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_3}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorCommentFragment f75754OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75755OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0Oo$OooO0o$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$onViewCreated$12$6$1", m80623f = "EditorCommentFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorCommentFragment f75756OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f75757OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorCommentFragment editorCommentFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75756OooOo = editorCommentFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75756OooOo, continuation);
                    oooO00o.f75757OooOo0o = ((Boolean) obj).booleanValue();
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
                    boolean z = this.f75757OooOo0o;
                    EditorCommentFragment editorCommentFragment = this.f75756OooOo;
                    ImageView imageView = editorCommentFragment.f75723Oooo00O;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivClearSearch");
                        throw null;
                    }
                    imageView.setVisibility(z ? 0 : 8);
                    EditorCommentFragment.OooOoO(editorCommentFragment);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(EditorCommentFragment editorCommentFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f75754OooOo = editorCommentFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f75754OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75755OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorCommentFragment editorCommentFragment = this.f75754OooOo;
                    C29652OooOOoo c29652OooOOooOooOoo = editorCommentFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(editorCommentFragment, null);
                    this.f75755OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c29652OooOOooOooOoo.f105140OooOOO0, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0Oo$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$onViewCreated$12$5", m80623f = "EditorCommentFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_4_ACCENT_2}, m80625m = "invokeSuspend")
        public static final class C23523OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorCommentFragment f75758OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75759OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0Oo$OooO0o0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorCommentFragment f75760OooOo0o;

                public OooO00o(EditorCommentFragment editorCommentFragment) {
                    this.f75760OooOo0o = editorCommentFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List<SortKeyVO> list = (List) obj;
                    C30294OooO0OO c30294OooO0OO = this.f75760OooOo0o.f75728Oooo0o0;
                    if (c30294OooO0OO != null) {
                        c30294OooO0OO.OooO0OO(list);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23523OooO0o0(EditorCommentFragment editorCommentFragment, Continuation<? super C23523OooO0o0> continuation) {
                super(2, continuation);
                this.f75758OooOo = editorCommentFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23523OooO0o0(this.f75758OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23523OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75759OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorCommentFragment editorCommentFragment = this.f75758OooOo;
                    C29652OooOOoo c29652OooOOooOooOoo = editorCommentFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(editorCommentFragment);
                    this.f75759OooOo0o = 1;
                    if (c29652OooOOooOooOoo.f105141OooOOOO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        public C23522OooO0Oo(Continuation<? super C23522OooO0Oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C23522OooO0Oo c23522OooO0Oo = EditorCommentFragment.this.new C23522OooO0Oo(continuation);
            c23522OooO0Oo.f75740OooOo0o = obj;
            return c23522OooO0Oo;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23522OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f75740OooOo0o;
            EditorCommentFragment editorCommentFragment = EditorCommentFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(editorCommentFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(editorCommentFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(editorCommentFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19366OooO0Oo(editorCommentFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23523OooO0o0(editorCommentFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(editorCommentFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$onViewCreated$5$1$1$1", m80623f = "EditorCommentFragment.kt", m80624l = {141}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75762OooOo0o;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorCommentFragment.this.new OooO0o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75762OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f75762OooOo0o = 1;
                if (EditorCommentFragment.OooOoOO(EditorCommentFragment.this, 8, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$onViewCreated$2$1$1", m80623f = "EditorCommentFragment.kt", m80624l = {96}, m80625m = "invokeSuspend")
    public static final class C23524OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75764OooOo0o;

        public C23524OooO0o0(Continuation<? super C23524OooO0o0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorCommentFragment.this.new C23524OooO0o0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23524OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75764OooOo0o;
            EditorCommentFragment editorCommentFragment = EditorCommentFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f75764OooOo0o = 1;
                obj = EditorCommentFragment.OooOoOO(editorCommentFragment, 41, this);
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
                return C32460OooOooO.f116667OooO00o;
            }
            String string = editorCommentFragment.getString(R.string.clear_comment);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            String string2 = editorCommentFragment.getString(R.string.alert_clear_comment);
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
            new TipsDialogFragment(string, string2, new ViewOnClickListenerC26311Ooooooo(), new ViewOnClickListenerC28702OooOOoo(editorCommentFragment, 2)).show(editorCommentFragment.getChildFragmentManager(), "TipsDialogFragment");
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23525OooO0oO implements OooO00o.InterfaceC19367OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public List<CommentVO> f75765OooO00o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0oO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$onViewCreated$9$onFinishMove$1$1", m80623f = "EditorCommentFragment.kt", m80624l = {198, 199}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorCommentFragment f75767OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75768OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ Map<String, Integer> f75769OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(EditorCommentFragment editorCommentFragment, Map<String, Integer> map, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f75767OooOo = editorCommentFragment;
                this.f75769OooOoO0 = map;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f75767OooOo, this.f75769OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
            
                if (r7 == r0) goto L21;
             */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75768OooOo0o;
                EditorCommentFragment editorCommentFragment = this.f75767OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C29652OooOOoo c29652OooOOooOooOoo = editorCommentFragment.OooOoo();
                    this.f75768OooOo0o = 1;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29655OooOo00(null, c29652OooOOooOooOoo), this);
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
                C29652OooOOoo c29652OooOOooOooOoo2 = editorCommentFragment.OooOoo();
                this.f75768OooOo0o = 2;
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29658OooOoO(c29652OooOOooOooOoo2, this.f75769OooOoO0, null), this);
                if (objOooO0o2 != obj2) {
                    objOooO0o2 = C32460OooOooO.f116667OooO00o;
                }
            }
        }

        public C23525OooO0oO() {
        }

        @Override // com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o.InterfaceC19367OooO00o
        public final void OooO00o() {
        }

        @Override // com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o.InterfaceC19367OooO00o
        public final void OooO0O0() {
            List<CommentVO> list = this.f75765OooO00o;
            if (list != null) {
                List<CommentVO> list2 = list;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                int i = 0;
                for (Object obj : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C34429OooOOo0.OooOOo();
                        throw null;
                    }
                    arrayList.add(new C32443OooOOO(((CommentVO) obj).getId(), Integer.valueOf(i)));
                    i = i2;
                }
                Map mapOooOO0o = C34444Oooo0O0.OooOO0o(arrayList);
                EditorCommentFragment editorCommentFragment = EditorCommentFragment.this;
                InterfaceC21987OooOoo viewLifecycleOwner = editorCommentFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(editorCommentFragment, mapOooOO0o, null), 3);
            }
            this.f75765OooO00o = null;
        }

        @Override // com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o.InterfaceC19367OooO00o
        public final void onMove(int i, int i2) {
            List<CommentVO> list = this.f75765OooO00o;
            EditorCommentFragment editorCommentFragment = EditorCommentFragment.this;
            if (list == null || list.isEmpty()) {
                this.f75765OooO00o = OooOo.o0ooOO0((Iterable) editorCommentFragment.OooOoo().f105139OooOOO.f121747OooOo0o.getValue());
            }
            if (i < i2) {
                while (i < i2) {
                    List<CommentVO> list2 = this.f75765OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(list2);
                    int i3 = i + 1;
                    Collections.swap(list2, i, i3);
                    i = i3;
                }
            } else {
                int i4 = i2 + 1;
                if (i4 <= i) {
                    while (true) {
                        List<CommentVO> list3 = this.f75765OooO00o;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(list3);
                        Collections.swap(list3, i, i - 1);
                        if (i == i4) {
                            break;
                        } else {
                            i--;
                        }
                    }
                }
            }
            List<CommentVO> list4 = this.f75765OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(list4);
            editorCommentFragment.f75726Oooo0OO.OooO0OO(list4);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23526OooO0oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23526OooO0oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return EditorCommentFragment.this;
        }
    }

    public static final class OooOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75771OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75771OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f75771OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75772OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75772OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75772OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23527OooOO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f75773OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23527OooOO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75773OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75773OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? EditorCommentFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class OooOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75775OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75775OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f75775OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C29641OooO0oO f75776OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(C29641OooO0oO c29641OooO0oO) {
            super(0);
            this.f75776OooOo0o = c29641OooO0oO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f75776OooOo0o.invoke();
        }
    }

    public static final class OooOOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f75777OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75777OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75777OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment$OooOOOo, reason: case insensitive filesystem */
    public static final class C23528OooOOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f75778OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23528OooOOOo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f75778OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f75778OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? EditorCommentFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [o0OoooOo.OooO0oo] */
    public EditorCommentFragment() {
        C23526OooO0oo c23526OooO0oo = new C23526OooO0oo();
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO(c23526OooO0oo));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f75718OooOoo0 = new C22026ooOO(oooo0.OooO0O0(C29652OooOOoo.class), new OooOO0(interfaceC32440OooOO0OooO0O0), new C23527OooOO0o(interfaceC32440OooOO0OooO0O0), new OooOO0O(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooOOO0(new C29641OooO0oO(this, 0)));
        this.f75717OooOoo = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.OooO0OO.class), new OooOOO(interfaceC32440OooOO0OooO0O02), new C23528OooOOOo(interfaceC32440OooOO0OooO0O02), new OooOOOO(interfaceC32440OooOO0OooO0O02));
        this.f75726Oooo0OO = new C29635OooO00o();
        this.f75727Oooo0o = new Handler(Looper.getMainLooper());
        this.f75730Oooo0oo = new C24572OooOO0o.OooO0O0() { // from class: o0OoooOo.OooO0oo
            @Override // o000o0O0.C24572OooOO0o.OooO0O0
            public final void OooO00o(C24572OooOO0o controller, C24583OooOo0o destination, Bundle bundle) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(controller, "controller");
                kotlin.jvm.internal.OooOOO0.OooO0oO(destination, "destination");
                EditText editText = this.f105103OooO00o.f75722Oooo000;
                if (editText != null) {
                    editText.clearFocus();
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
            }
        };
    }

    public static final void OooOoO(EditorCommentFragment editorCommentFragment) {
        EditText editText = editorCommentFragment.f75722Oooo000;
        if (editText == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
            throw null;
        }
        if (editText.hasFocus() && C28039OooO00o.OooO0Oo()) {
            editorCommentFragment.f75727Oooo0o.postDelayed(new RunnableC29640OooO0o0(editorCommentFragment, 0), 50L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoOO(EditorCommentFragment editorCommentFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29634OooO c29634OooO;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C29634OooO) {
            c29634OooO = (C29634OooO) abstractC32479OooO0OO;
            int i2 = c29634OooO.f105078OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29634OooO.f105078OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c29634OooO = new C29634OooO(editorCommentFragment, abstractC32479OooO0OO);
            }
        }
        C29634OooO c29634OooO2 = c29634OooO;
        Object objShowNonVipFeatureLimitedDialog$default = c29634OooO2.f105077OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c29634OooO2.f105078OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = editorCommentFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c29634OooO2.f105078OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c29634OooO2, 6, null);
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

    public final C29652OooOOoo OooOoo() {
        return (C29652OooOOoo) this.f75718OooOoo0.getValue();
    }

    public final com.orion.notein.p607ui.noteeditor.OooO0OO OooOoo0() {
        return (com.orion.notein.p607ui.noteeditor.OooO0OO) this.f75717OooOoo.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_property_comment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C21030OooOO0o.OooO0OO(this).OooOo0o(this.f75730Oooo0oo);
        C30294OooO0OO c30294OooO0OO = this.f75728Oooo0o0;
        if (c30294OooO0OO != null) {
            c30294OooO0OO.OooO00o();
        }
        this.f75727Oooo0o.removeCallbacksAndMessages(null);
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
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC28182Oooo00o(this, 2));
        TextView textView = (TextView) view.findViewById(R.id.tv_clear);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(textView);
        C28050OooO0OO.OooO00o(textView, 500L, new ViewOnClickListenerC28184Oooo0OO(this, 2));
        View viewFindViewById2 = view.findViewById(R.id.tv_page_tiled);
        TextView textView2 = (TextView) viewFindViewById2;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(textView2);
        C28050OooO0OO.OooO00o(textView2, 500L, new ViewOnClickListenerC26290Oooo0o0(this, 4));
        this.f75721Oooo0 = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.guide);
        this.f75719OooOooO = viewFindViewById3;
        if (viewFindViewById3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnNewbieGuide");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC28688OooO0Oo(this, 1));
        final ImageView imageView = (ImageView) view.findViewById(R.id.iv_sort);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o0OoooOo.OooO0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                EditorCommentFragment editorCommentFragment = this.f105098OooOo0o;
                if (editorCommentFragment.f75728Oooo0o0 == null) {
                    Context context = imageView.getContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
                    editorCommentFragment.f75728Oooo0o0 = new C30294OooO0OO(context, new ViewOnClickListenerC28179Oooo0(editorCommentFragment, 2));
                    List<SortKeyVO> list = (List) editorCommentFragment.OooOoo().f105141OooOOOO.f121747OooOo0o.getValue();
                    C30294OooO0OO c30294OooO0OO = editorCommentFragment.f75728Oooo0o0;
                    if (c30294OooO0OO != null) {
                        c30294OooO0OO.OooO0OO(list);
                    }
                }
                C30294OooO0OO c30294OooO0OO2 = editorCommentFragment.f75728Oooo0o0;
                if (c30294OooO0OO2 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view2);
                    C30294OooO0OO.OooO0O0(c30294OooO0OO2, view2, -o000000O.OooO0o(15), 4);
                }
            }
        });
        this.f75720OooOooo = (ViewGroup) view.findViewById(R.id.cl_search);
        EditText editText = (EditText) view.findViewById(R.id.search_box);
        this.f75722Oooo000 = editText;
        if (editText == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
            throw null;
        }
        editText.addTextChangedListener(new OooO00o());
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_clear_search);
        this.f75723Oooo00O = imageView2;
        if (imageView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("ivClearSearch");
            throw null;
        }
        imageView2.setOnClickListener(new ViewOnClickListenerC26292Oooo0oo(this, 3));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.comment);
        C29635OooO00o c29635OooO00o = this.f75726Oooo0OO;
        recyclerView.setAdapter(c29635OooO00o);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new androidx.recyclerview.widget.OooOOOO(recyclerView.getContext()));
        this.f75725Oooo0O0 = recyclerView;
        C22041OooOOo c22041OooOOo = new C22041OooOOo(new com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o(new C23525OooO0oO()));
        RecyclerView recyclerView2 = this.f75725Oooo0O0;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("commentList");
            throw null;
        }
        c22041OooOOo.OooO0o(recyclerView2);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f75729Oooo0oO = new C29661OooOoo0(contextRequireContext, new ViewOnClickListenerC26282Oooo(this, 2));
        ViewOnClickListenerC26295OoooO00 viewOnClickListenerC26295OoooO00 = new ViewOnClickListenerC26295OoooO00(this, 3);
        c29635OooO00o.getClass();
        c29635OooO00o.f105080OooO0O0 = viewOnClickListenerC26295OoooO00;
        this.f75724Oooo00o = (TextView) view.findViewById(R.id.tv_empty);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C23522OooO0Oo(null), 3);
        C21030OooOO0o.OooO0OO(this).OooO0O0(this.f75730Oooo0oo);
    }
}
