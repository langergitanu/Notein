package com.orion.notein.p607ui.noteeditor.propertypanel.preview;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
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
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.internal.p332p7.C22236OooO0Oo;
import com.aspose.words.StyleIdentifier;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.Label;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.search.TextSearchResult;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.export.ExportRequest;
import com.orion.notein.p607ui.label.ItemData;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.C23558OooO0oo;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.EditorPreviewFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.NoteTnNavigatorView;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.PagePreviewVO;
import com.orion.notein.p607ui.notelist.OooO00o;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o00o00O0.C25252OooO0Oo;
import o0O0o0oO.ViewOnClickListenerC26035OooOooo;
import o0O0oooO.o0OoOo0;
import o0OOo0o.C27430o000oo;
import o0OOo0o.C27449o00O0OoO;
import o0Oo00o.C28025OooO0O0;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oo.C28039OooO00o;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o0o.C28242OooOo0;
import o0Oo0o0o.ViewOnClickListenerC28239OooOOo;
import o0Oo0o0o.ViewOnClickListenerC28240OooOOo0;
import o0OoO0oo.C28777o0000oO0;
import o0OoO0oo.C28778o0000oOO;
import o0OoOOO0.RunnableC29075Oooo;
import o0Ooo00O.ViewOnClickListenerC29368OooO0OO;
import o0Ooooo.C29663OooO00o;
import o0Ooooo.C29664OooO0O0;
import o0Ooooo.C29669OooO0oO;
import o0Ooooo.C29677OooOOOo;
import o0Ooooo.C29678OooOOo;
import o0Ooooo.RunnableC29668OooO0o0;
import o0Ooooo.ViewOnContextClickListenerC29665OooO0OO;
import o0OooooO.C29718OooO0O0;
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
import oO0OOooo.C33163OooO0oO;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.Oooo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/preview/EditorPreviewFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class EditorPreviewFragment extends Hilt_EditorPreviewFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f75898OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f75899OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public TextView f75900OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public TextView f75901OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public C23558OooO0oo f75902Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public EditText f75903Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f75904Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ImageView f75905Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f75906Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public ImageView f75907Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ViewGroup f75908Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextView f75909Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public TextView f75910Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public com.orion.notein.p607ui.notelist.OooO00o f75911Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public RecyclerView f75912Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f75913OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ViewGroup f75914OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public NoteTnNavigatorView f75915OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public C29718OooO0O0 f75916OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final Handler f75917OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final C29664OooO0O0 f75918o000oOoO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$5$3", m80623f = "EditorPreviewFragment.kt", m80624l = {235, 236}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75920OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ PagePreviewVO f75921OooOoO0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$5$3$1", m80623f = "EditorPreviewFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75922OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f75922OooOo0o = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f75922OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C29718OooO0O0 c29718OooO0O0 = this.f75922OooOo0o.f75916OoooO0O;
                if (c29718OooO0O0 != null) {
                    c29718OooO0O0.OooO00o();
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(PagePreviewVO pagePreviewVO, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f75921OooOoO0 = pagePreviewVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorPreviewFragment.this.new OooO(this.f75921OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        
            if (oO0o0OO.C33609OooO0oo.OooO0o(r8, r1, r7) == r0) goto L18;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75920OooOo0o;
            EditorPreviewFragment editorPreviewFragment = EditorPreviewFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = editorPreviewFragment.OooOoo();
                String id = this.f75921OooOoO0.getId();
                this.f75920OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29677OooOOOo(oooO0OOOooOoo, id, null), this);
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
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
            OooO00o oooO00o = new OooO00o(editorPreviewFragment, null);
            this.f75920OooOo0o = 2;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onResume$1$1", m80623f = "EditorPreviewFragment.kt", m80624l = {128}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f75923OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75924OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ EditorPreviewFragment f75925OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f75926OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ int f75927OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, EditorPreviewFragment editorPreviewFragment, int i, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f75923OooOo = str;
            this.f75926OooOoO0 = str2;
            this.f75925OooOoO = editorPreviewFragment;
            this.f75927OooOoOO = i;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f75923OooOo, this.f75926OooOoO0, this.f75925OooOoO, this.f75927OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75924OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String str = this.f75923OooOo;
                if (str.length() > 0) {
                    String str2 = this.f75926OooOoO0;
                    if (str2.length() > 0) {
                        com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = this.f75925OooOoO.OooOoo();
                        this.f75924OooOo0o = 1;
                        if (oooO0OOOooOoo.OooO0o0(str, this.f75927OooOoOO, str2, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
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

    public static final class OooO0O0 implements TextWatcher {
        public OooO0O0() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = EditorPreviewFragment.this.OooOoo();
            String strValueOf = String.valueOf(charSequence);
            C33781o00o0O c33781o00o0O = oooO0OOOooOoo.f76081OooOo;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, strValueOf);
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$1$1", m80623f = "EditorPreviewFragment.kt", m80624l = {156}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75930OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f75931OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f75931OooOoO0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorPreviewFragment.this.new OooO0OO(this.f75931OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75930OooOo0o;
            EditorPreviewFragment editorPreviewFragment = EditorPreviewFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f75930OooOo0o = 1;
                obj = EditorPreviewFragment.OooOoOO(editorPreviewFragment, 30, this);
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
            ItemData itemData = new ItemData(null, this.f75931OooOoO0, null, 0, 5);
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = editorPreviewFragment.requireActivity();
            kotlin.jvm.internal.OooOOO0.OooO0o0(activityC21897OooOo0RequireActivity, "null cannot be cast to non-null type com.orion.notein.MainActivity");
            ((MainActivity) activityC21897OooOo0RequireActivity).openLabelPicker(new ItemData[]{itemData});
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23536OooO0Oo implements NoteTnNavigatorView.OooO0O0 {
        public C23536OooO0Oo() {
        }

        @Override // com.orion.notein.ui.noteeditor.propertypanel.preview.NoteTnNavigatorView.OooO0O0
        public final void OooO00o(float f, float f2) {
            Fragment parentFragment = EditorPreviewFragment.this.getParentFragment();
            Fragment parentFragment2 = parentFragment != null ? parentFragment.getParentFragment() : null;
            NoteEditorContainerFragment noteEditorContainerFragment = parentFragment2 instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment2 : null;
            if (noteEditorContainerFragment != null) {
                noteEditorContainerFragment.Oooo0OO(18, new C32443OooOOO(0, new PointF(-f, -f2)));
            }
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14", m80623f = "EditorPreviewFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f75934OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$17", m80623f = "EditorPreviewFragment.kt", m80624l = {688}, m80625m = "invokeSuspend")
        public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75935OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75936OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75937OooOo0o;

                public OooO00o(EditorPreviewFragment editorPreviewFragment) {
                    this.f75937OooOo0o = editorPreviewFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    TextView textView = this.f75937OooOo0o.f75909Oooo0o;
                    if (textView != null) {
                        textView.setVisibility(zBooleanValue ? 0 : 8);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("pageTextCacheUpdatingTipsView");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooO> continuation) {
                super(2, continuation);
                this.f75935OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO(this.f75935OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75936OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPreviewFragment editorPreviewFragment = this.f75935OooOo;
                    InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(editorPreviewFragment.OooOoo().f76092OooOooo, 1000L);
                    OooO00o oooO00o = new OooO00o(editorPreviewFragment);
                    this.f75936OooOo0o = 1;
                    if (interfaceC33721OooO0oOooOO0O.collect(oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$1", m80623f = "EditorPreviewFragment.kt", m80624l = {493}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75938OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75939OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$1$1", m80623f = "EditorPreviewFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19371OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends Label>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75940OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f75941OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19371OooO00o(EditorPreviewFragment editorPreviewFragment, Continuation<? super C19371OooO00o> continuation) {
                    super(2, continuation);
                    this.f75940OooOo = editorPreviewFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19371OooO00o c19371OooO00o = new C19371OooO00o(this.f75940OooOo, continuation);
                    c19371OooO00o.f75941OooOo0o = obj;
                    return c19371OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends Label> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19371OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f75941OooOo0o;
                    C34406OooO00o.f123390OooO00o.OooO00o("labels: " + list, new Object[0]);
                    int size = list.size();
                    EditorPreviewFragment editorPreviewFragment = this.f75940OooOo;
                    if (size == 0) {
                        ImageView imageView = editorPreviewFragment.f75905Oooo00O;
                        if (imageView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnAddLabel");
                            throw null;
                        }
                        imageView.setImageResource(R.drawable.ic_add_label);
                    } else if (size != 1) {
                        ImageView imageView2 = editorPreviewFragment.f75905Oooo00O;
                        if (imageView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnAddLabel");
                            throw null;
                        }
                        imageView2.setImageResource(R.drawable.ic_color_label);
                    } else {
                        ImageView imageView3 = editorPreviewFragment.f75905Oooo00O;
                        if (imageView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnAddLabel");
                            throw null;
                        }
                        imageView3.setImageResource(R.drawable.ic_label);
                        int color = ((Label) list.get(0)).getColor();
                        ImageView imageView4 = editorPreviewFragment.f75905Oooo00O;
                        if (imageView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnAddLabel");
                            throw null;
                        }
                        imageView4.setColorFilter(color);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f75938OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f75938OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75939OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPreviewFragment editorPreviewFragment = this.f75938OooOo;
                    com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = editorPreviewFragment.OooOoo();
                    C19371OooO00o c19371OooO00o = new C19371OooO00o(editorPreviewFragment, null);
                    this.f75939OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f76074OooOOO, c19371OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$10", m80623f = "EditorPreviewFragment.kt", m80624l = {569}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75942OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75943OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75944OooOo0o;

                public OooO00o(EditorPreviewFragment editorPreviewFragment) {
                    this.f75944OooOo0o = editorPreviewFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    EditorPreviewFragment editorPreviewFragment = this.f75944OooOo0o;
                    TextView textView = editorPreviewFragment.f75901OooOooo;
                    if (textView != null) {
                        textView.setText(editorPreviewFragment.getString(R.string.total_pages, new Integer(iIntValue)));
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("pageNumber");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f75942OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f75942OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75943OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPreviewFragment editorPreviewFragment = this.f75942OooOo;
                    com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = editorPreviewFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(editorPreviewFragment);
                    this.f75943OooOo0o = 1;
                    if (oooO0OOOooOoo.f76079OooOOo0.collect(oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$11", m80623f = "EditorPreviewFragment.kt", m80624l = {575}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75945OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75946OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75947OooOo0o;

                public OooO00o(EditorPreviewFragment editorPreviewFragment) {
                    this.f75947OooOo0o = editorPreviewFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String str = (String) obj;
                    TextView textView = this.f75947OooOo0o.f75904Oooo000;
                    if (textView != null) {
                        textView.setText(str);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO(C17625c.f52155b);
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f75945OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f75945OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75946OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPreviewFragment editorPreviewFragment = this.f75945OooOo;
                    com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = editorPreviewFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(editorPreviewFragment);
                    this.f75946OooOo0o = 1;
                    if (oooO0OOOooOoo.f76082OooOo0.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$12", m80623f = "EditorPreviewFragment.kt", m80624l = {581}, m80625m = "invokeSuspend")
        public static final class C23537OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75948OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75949OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooO0Oo$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75950OooOo0o;

                public OooO00o(EditorPreviewFragment editorPreviewFragment) {
                    this.f75950OooOo0o = editorPreviewFragment;
                }

                /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    EditorPreviewFragment editorPreviewFragment = this.f75950OooOo0o;
                    if (iIntValue == 0) {
                        RecyclerView recyclerView = editorPreviewFragment.f75912Oooo0oo;
                        if (recyclerView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("thumbnailList");
                            throw null;
                        }
                        recyclerView.setVisibility(0);
                        TextView textView = editorPreviewFragment.f75910Oooo0o0;
                        if (textView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("searchingTipsView");
                            throw null;
                        }
                        textView.setVisibility(8);
                    } else if (iIntValue == 1) {
                        RecyclerView recyclerView2 = editorPreviewFragment.f75912Oooo0oo;
                        if (recyclerView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("thumbnailList");
                            throw null;
                        }
                        recyclerView2.setVisibility(4);
                        TextView textView2 = editorPreviewFragment.f75910Oooo0o0;
                        if (textView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("searchingTipsView");
                            throw null;
                        }
                        textView2.setText(editorPreviewFragment.getString(R.string.search_state_searching));
                        TextView textView3 = editorPreviewFragment.f75910Oooo0o0;
                        if (textView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("searchingTipsView");
                            throw null;
                        }
                        textView3.setVisibility(0);
                    } else if (iIntValue == 2) {
                        RecyclerView recyclerView3 = editorPreviewFragment.f75912Oooo0oo;
                        if (recyclerView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("thumbnailList");
                            throw null;
                        }
                        recyclerView3.setVisibility(4);
                        TextView textView4 = editorPreviewFragment.f75910Oooo0o0;
                        if (textView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("searchingTipsView");
                            throw null;
                        }
                        textView4.setText(editorPreviewFragment.getString(R.string.search_state_no_match));
                        TextView textView5 = editorPreviewFragment.f75910Oooo0o0;
                        if (textView5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("searchingTipsView");
                            throw null;
                        }
                        textView5.setVisibility(0);
                    } else if (iIntValue == 3) {
                    }
                    EditorPreviewFragment.OooOoO(editorPreviewFragment);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23537OooO0Oo(EditorPreviewFragment editorPreviewFragment, Continuation<? super C23537OooO0Oo> continuation) {
                super(2, continuation);
                this.f75948OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23537OooO0Oo(this.f75948OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23537OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75949OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                EditorPreviewFragment editorPreviewFragment = this.f75948OooOo;
                com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = editorPreviewFragment.OooOoo();
                OooO00o oooO00o = new OooO00o(editorPreviewFragment);
                this.f75949OooOo0o = 1;
                oooO0OOOooOoo.f76085OooOo0o.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooO0o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$14", m80623f = "EditorPreviewFragment.kt", m80624l = {617}, m80625m = "invokeSuspend")
        public static final class C19372OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75951OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75952OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooO0o$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75953OooOo0o;

                public OooO00o(EditorPreviewFragment editorPreviewFragment) {
                    this.f75953OooOo0o = editorPreviewFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    final List<T> list = (List) obj;
                    final EditorPreviewFragment editorPreviewFragment = this.f75953OooOo0o;
                    C23558OooO0oo c23558OooO0oo = editorPreviewFragment.f75902Oooo;
                    if (c23558OooO0oo == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tnAdapter");
                        throw null;
                    }
                    final int itemCount = c23558OooO0oo.getItemCount();
                    C23558OooO0oo c23558OooO0oo2 = editorPreviewFragment.f75902Oooo;
                    if (c23558OooO0oo2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tnAdapter");
                        throw null;
                    }
                    List<T> list2 = c23558OooO0oo2.f66021OooO00o.f65811OooO0o;
                    kotlin.jvm.internal.OooOOO0.OooO0o(list2, "getCurrentList(...)");
                    final PagePreviewVO pagePreviewVO = (PagePreviewVO) oOo000Oo.OooOo.Oooo(list2);
                    final PagePreviewVO pagePreviewVO2 = (PagePreviewVO) oOo000Oo.OooOo.Oooo(list);
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(pagePreviewVO2 != null ? pagePreviewVO2.getNoteId() : null, editorPreviewFragment.OooOoo().f76075OooOOO0.getValue())) {
                        C23558OooO0oo c23558OooO0oo3 = editorPreviewFragment.f75902Oooo;
                        if (c23558OooO0oo3 != null) {
                            c23558OooO0oo3.OooO0o0(list, new Runnable() { // from class: o0Ooooo.OooO0o
                                @Override // java.lang.Runnable
                                public final void run() {
                                    EditorPreviewFragment editorPreviewFragment2 = editorPreviewFragment;
                                    EditorPreviewFragment.OooOoO(editorPreviewFragment2);
                                    PagePreviewVO pagePreviewVO3 = pagePreviewVO;
                                    Boolean boolValueOf = pagePreviewVO3 != null ? Boolean.valueOf(pagePreviewVO3.isSearchResult()) : null;
                                    PagePreviewVO pagePreviewVO4 = pagePreviewVO2;
                                    boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(boolValueOf, pagePreviewVO4 != null ? Boolean.valueOf(pagePreviewVO4.isSearchResult()) : null);
                                    boolean zOooO0O02 = kotlin.jvm.internal.OooOOO0.OooO0O0(pagePreviewVO3 != null ? pagePreviewVO3.getNoteId() : null, pagePreviewVO4 != null ? pagePreviewVO4.getNoteId() : null);
                                    int i = 0;
                                    boolean z = !zOooO0O02 || itemCount == 0;
                                    if (!zOooO0O0 || z) {
                                        Iterator it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                i = -1;
                                                break;
                                            } else if (((PagePreviewVO) it.next()).isCurrent()) {
                                                break;
                                            } else {
                                                i++;
                                            }
                                        }
                                        if (i == -1) {
                                            return;
                                        }
                                        RecyclerView recyclerView = editorPreviewFragment2.f75912Oooo0oo;
                                        if (recyclerView == null) {
                                            kotlin.jvm.internal.OooOOO0.OooOOOO("thumbnailList");
                                            throw null;
                                        }
                                        RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
                                        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                                        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                                        if (i > linearLayoutManager.findLastCompletelyVisibleItemPosition() || i < iFindFirstCompletelyVisibleItemPosition) {
                                            RecyclerView recyclerView2 = editorPreviewFragment2.f75912Oooo0oo;
                                            if (recyclerView2 != null) {
                                                recyclerView2.scrollToPosition(i);
                                            } else {
                                                kotlin.jvm.internal.OooOOO0.OooOOOO("thumbnailList");
                                                throw null;
                                            }
                                        }
                                    }
                                }
                            });
                            return C32460OooOooO.f116667OooO00o;
                        }
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tnAdapter");
                        throw null;
                    }
                    C23558OooO0oo c23558OooO0oo4 = editorPreviewFragment.f75902Oooo;
                    if (c23558OooO0oo4 != null) {
                        c23558OooO0oo4.OooO0o0(C34434OooOoO.f123453OooOo0o, new RunnableC29668OooO0o0(editorPreviewFragment, 0));
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("tnAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19372OooO0o(EditorPreviewFragment editorPreviewFragment, Continuation<? super C19372OooO0o> continuation) {
                super(2, continuation);
                this.f75951OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19372OooO0o(this.f75951OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19372OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75952OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPreviewFragment editorPreviewFragment = this.f75951OooOo;
                    com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = editorPreviewFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(editorPreviewFragment);
                    this.f75952OooOo0o = 1;
                    if (oooO0OOOooOoo.f76090OooOoo0.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$13", m80623f = "EditorPreviewFragment.kt", m80624l = {604}, m80625m = "invokeSuspend")
        public static final class C23538OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75954OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75955OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooO0o0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$13$1", m80623f = "EditorPreviewFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends TextSearchResult>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75956OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f75957OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75956OooOo = editorPreviewFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75956OooOo, continuation);
                    oooO00o.f75957OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends TextSearchResult> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f75957OooOo0o;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj2 : list) {
                        Integer num = new Integer(((TextSearchResult) obj2).getPageIndex());
                        Object arrayList = linkedHashMap.get(num);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(num, arrayList);
                        }
                        ((List) arrayList).add(obj2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(Oooo0.OooO0Oo(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        Object key = entry.getKey();
                        List list2 = (List) entry.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            C34431OooOo0.OooOo0o(arrayList2, ((TextSearchResult) it.next()).getTextRectList());
                        }
                        linkedHashMap2.put(key, arrayList2);
                    }
                    Fragment parentFragment = this.f75956OooOo.getParentFragment();
                    Fragment parentFragment2 = parentFragment != null ? parentFragment.getParentFragment() : null;
                    NoteEditorContainerFragment noteEditorContainerFragment = parentFragment2 instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment2 : null;
                    if (noteEditorContainerFragment != null) {
                        noteEditorContainerFragment.Oooo0OO(20, linkedHashMap2);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23538OooO0o0(EditorPreviewFragment editorPreviewFragment, Continuation<? super C23538OooO0o0> continuation) {
                super(2, continuation);
                this.f75954OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23538OooO0o0(this.f75954OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23538OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75955OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPreviewFragment editorPreviewFragment = this.f75954OooOo;
                    com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = editorPreviewFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(editorPreviewFragment, null);
                    this.f75955OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f76086OooOoO, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$15", m80623f = "EditorPreviewFragment.kt", m80624l = {657}, m80625m = "invokeSuspend")
        public static final class C23539OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75958OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75959OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooO0oO$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75960OooOo0o;

                public OooO00o(EditorPreviewFragment editorPreviewFragment) {
                    this.f75960OooOo0o = editorPreviewFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    EditorPreviewFragment editorPreviewFragment = this.f75960OooOo0o;
                    C23558OooO0oo c23558OooO0oo = editorPreviewFragment.f75902Oooo;
                    if (c23558OooO0oo == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("tnAdapter");
                        throw null;
                    }
                    List<T> list = c23558OooO0oo.f66021OooO00o.f65811OooO0o;
                    kotlin.jvm.internal.OooOOO0.OooO0o(list, "getCurrentList(...)");
                    Iterator<T> it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (((PagePreviewVO) it.next()).getIndex() == iIntValue) {
                            break;
                        }
                        i++;
                    }
                    if (i != -1) {
                        C23558OooO0oo c23558OooO0oo2 = editorPreviewFragment.f75902Oooo;
                        if (c23558OooO0oo2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("tnAdapter");
                            throw null;
                        }
                        if (c23558OooO0oo2.getItemCount() > i) {
                            RecyclerView recyclerView = editorPreviewFragment.f75912Oooo0oo;
                            if (recyclerView == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("thumbnailList");
                                throw null;
                            }
                            RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
                            kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                            int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                            if (i > linearLayoutManager.findLastCompletelyVisibleItemPosition() + 3 || i < iFindFirstCompletelyVisibleItemPosition - 3) {
                                RecyclerView recyclerView2 = editorPreviewFragment.f75912Oooo0oo;
                                if (recyclerView2 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("thumbnailList");
                                    throw null;
                                }
                                recyclerView2.scrollToPosition(i);
                            } else {
                                RecyclerView recyclerView3 = editorPreviewFragment.f75912Oooo0oo;
                                if (recyclerView3 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("thumbnailList");
                                    throw null;
                                }
                                recyclerView3.smoothScrollToPosition(i);
                            }
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23539OooO0oO(EditorPreviewFragment editorPreviewFragment, Continuation<? super C23539OooO0oO> continuation) {
                super(2, continuation);
                this.f75958OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23539OooO0oO(this.f75958OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23539OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75959OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPreviewFragment editorPreviewFragment = this.f75958OooOo;
                    com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = editorPreviewFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(editorPreviewFragment);
                    this.f75959OooOo0o = 1;
                    if (oooO0OOOooOoo.f76080OooOOoo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooO0oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$16", m80623f = "EditorPreviewFragment.kt", m80624l = {677}, m80625m = "invokeSuspend")
        public static final class C23540OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75961OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75962OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooO0oo$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75963OooOo0o;

                public OooO00o(EditorPreviewFragment editorPreviewFragment) {
                    this.f75963OooOo0o = editorPreviewFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    if (((Number) obj).intValue() == 1) {
                        EditorPreviewFragment editorPreviewFragment = this.f75963OooOo0o;
                        EditText editText = editorPreviewFragment.f75903Oooo0;
                        if (editText == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                            throw null;
                        }
                        editText.setText("");
                        EditText editText2 = editorPreviewFragment.f75903Oooo0;
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
            public C23540OooO0oo(EditorPreviewFragment editorPreviewFragment, Continuation<? super C23540OooO0oo> continuation) {
                super(2, continuation);
                this.f75961OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23540OooO0oo(this.f75961OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23540OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75962OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                EditorPreviewFragment editorPreviewFragment = this.f75961OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooOoo0 = editorPreviewFragment.OooOoo0();
                OooO00o oooO00o = new OooO00o(editorPreviewFragment);
                this.f75962OooOo0o = 1;
                oooO0OOOooOoo0.f73408o000000.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$2", m80623f = "EditorPreviewFragment.kt", m80624l = {512}, m80625m = "invokeSuspend")
        public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75964OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75965OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$2$1", m80623f = "EditorPreviewFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75966OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ int f75967OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75966OooOo = editorPreviewFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75966OooOo, continuation);
                    oooO00o.f75967OooOo0o = ((Number) obj).intValue();
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    this.f75966OooOo.f75913OoooO = this.f75967OooOo0o;
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOO0(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooOO0> continuation) {
                super(2, continuation);
                this.f75964OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOO0(this.f75964OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75965OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPreviewFragment editorPreviewFragment = this.f75964OooOo;
                    com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = editorPreviewFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(editorPreviewFragment, null);
                    this.f75965OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f76076OooOOOO, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$3", m80623f = "EditorPreviewFragment.kt", m80624l = {518}, m80625m = "invokeSuspend")
        public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75968OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75969OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$3$1", m80623f = "EditorPreviewFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75970OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f75971OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75970OooOo = editorPreviewFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75970OooOo, continuation);
                    oooO00o.f75971OooOo0o = ((Boolean) obj).booleanValue();
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
                    boolean z = this.f75971OooOo0o;
                    EditorPreviewFragment editorPreviewFragment = this.f75970OooOo;
                    ImageView imageView = editorPreviewFragment.f75907Oooo0O0;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("ivClear");
                        throw null;
                    }
                    imageView.setVisibility(z ? 0 : 8);
                    EditorPreviewFragment.OooOoO(editorPreviewFragment);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOO0O(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooOO0O> continuation) {
                super(2, continuation);
                this.f75968OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOO0O(this.f75968OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75969OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPreviewFragment editorPreviewFragment = this.f75968OooOo;
                    com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = editorPreviewFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(editorPreviewFragment, null);
                    this.f75969OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f76087OooOoO0, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooOO0o, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$4", m80623f = "EditorPreviewFragment.kt", m80624l = {525}, m80625m = "invokeSuspend")
        public static final class C23541OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75972OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75973OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooOO0o$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75974OooOo0o;

                public OooO00o(EditorPreviewFragment editorPreviewFragment) {
                    this.f75974OooOo0o = editorPreviewFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String noteId = (String) obj;
                    EditorPreviewFragment editorPreviewFragment = this.f75974OooOo0o;
                    EditText editText = editorPreviewFragment.f75903Oooo0;
                    if (editText == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                        throw null;
                    }
                    editText.setText("");
                    com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = editorPreviewFragment.OooOoo();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                    C33781o00o0O c33781o00o0O = oooO0OOOooOoo.f76073OooOO0o;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, noteId);
                    Fragment parentFragment = editorPreviewFragment.getParentFragment();
                    Fragment parentFragment2 = parentFragment != null ? parentFragment.getParentFragment() : null;
                    NoteEditorContainerFragment noteEditorContainerFragment = parentFragment2 instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment2 : null;
                    if (noteEditorContainerFragment != null) {
                        noteEditorContainerFragment.Oooo0OO(19, null);
                    }
                    InterfaceC21987OooOoo viewLifecycleOwner = editorPreviewFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO00o(editorPreviewFragment, noteId, null), 3);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23541OooOO0o(EditorPreviewFragment editorPreviewFragment, Continuation<? super C23541OooOO0o> continuation) {
                super(2, continuation);
                this.f75972OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23541OooOO0o(this.f75972OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23541OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75973OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPreviewFragment editorPreviewFragment = this.f75972OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooOoo0 = editorPreviewFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(editorPreviewFragment);
                    this.f75973OooOo0o = 1;
                    if (oooO0OOOooOoo0.f73397OoooOoo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$6", m80623f = "EditorPreviewFragment.kt", m80624l = {543}, m80625m = "invokeSuspend")
        public static final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75975OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75976OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$6$1", m80623f = "EditorPreviewFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75977OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f75978OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75977OooOo = editorPreviewFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75977OooOo, continuation);
                    oooO00o.f75978OooOo0o = ((Boolean) obj).booleanValue();
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
                    boolean z = this.f75978OooOo0o;
                    EditorPreviewFragment editorPreviewFragment = this.f75977OooOo;
                    NoteTnNavigatorView noteTnNavigatorView = editorPreviewFragment.f75915OoooO00;
                    if (noteTnNavigatorView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteTnNavigatorView");
                        throw null;
                    }
                    noteTnNavigatorView.setVisibility(z ? 0 : 8);
                    ViewGroup viewGroup = editorPreviewFragment.f75908Oooo0OO;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(z ? 8 : 0);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("thumbListViewGroup");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOOO(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooOOO> continuation) {
                super(2, continuation);
                this.f75975OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOOO(this.f75975OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75976OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPreviewFragment editorPreviewFragment = this.f75975OooOo;
                    com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = editorPreviewFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(editorPreviewFragment, null);
                    this.f75976OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f76088OooOoOO, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$5", m80623f = "EditorPreviewFragment.kt", m80624l = {536}, m80625m = "invokeSuspend")
        public static final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75979OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75980OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$5$1", m80623f = "EditorPreviewFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteContent, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75981OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f75982OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75981OooOo = editorPreviewFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75981OooOo, continuation);
                    oooO00o.f75982OooOo0o = obj;
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
                    NoteContent noteContent = (NoteContent) this.f75982OooOo0o;
                    if (noteContent != null) {
                        z = noteContent.getUnboundedNote();
                    }
                    ViewGroup viewGroup = this.f75981OooOo.f75914OoooO0;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(z ? 8 : 0);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnTiledPageWrapper");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOOO0(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooOOO0> continuation) {
                super(2, continuation);
                this.f75979OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOOO0(this.f75979OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75980OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPreviewFragment editorPreviewFragment = this.f75979OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooOoo0 = editorPreviewFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(editorPreviewFragment, null);
                    this.f75980OooOo0o = 1;
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$7", m80623f = "EditorPreviewFragment.kt", m80624l = {550}, m80625m = "invokeSuspend")
        public static final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75983OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75984OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$7$1", m80623f = "EditorPreviewFragment.kt", m80624l = {551}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<OooO0OO.OooO0O0, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public /* synthetic */ Object f75985OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f75986OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75987OooOoO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75987OooOoO0 = editorPreviewFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75987OooOoO0, continuation);
                    oooO00o.f75985OooOo = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(OooO0OO.OooO0O0 oooO0O0, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(oooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f75986OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        OooO0OO.OooO0O0 oooO0O0 = (OooO0OO.OooO0O0) this.f75985OooOo;
                        NoteTnNavigatorView noteTnNavigatorView = this.f75987OooOoO0.f75915OoooO00;
                        if (noteTnNavigatorView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noteTnNavigatorView");
                            throw null;
                        }
                        this.f75986OooOo0o = 1;
                        if (noteTnNavigatorView.OooO0O0(oooO0O0, this) == enumC32485OooO00o) {
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
            public OooOOOO(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooOOOO> continuation) {
                super(2, continuation);
                this.f75983OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOOOO(this.f75983OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75984OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPreviewFragment editorPreviewFragment = this.f75983OooOo;
                    com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = editorPreviewFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(editorPreviewFragment, null);
                    this.f75984OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f76091OooOooO, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooOOOo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$8", m80623f = "EditorPreviewFragment.kt", m80624l = {557}, m80625m = "invokeSuspend")
        public static final class C23542OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75988OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75989OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooOOOo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$8$1", m80623f = "EditorPreviewFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends String, ? extends RectF>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75990OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f75991OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f75990OooOo = editorPreviewFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f75990OooOo, continuation);
                    oooO00o.f75991OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32443OooOOO<? extends String, ? extends RectF> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f75991OooOo0o;
                    String noteId = (String) c32443OooOOO.f116638OooOo0o;
                    RectF visibleBounds = (RectF) c32443OooOOO.f116637OooOo;
                    com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = this.f75990OooOo.OooOoo();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                    kotlin.jvm.internal.OooOOO0.OooO0oO(visibleBounds, "visibleBounds");
                    C32443OooOOO c32443OooOOO2 = new C32443OooOOO(noteId, visibleBounds);
                    C33781o00o0O c33781o00o0O = oooO0OOOooOoo.f76089OooOoo;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, c32443OooOOO2);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23542OooOOOo(EditorPreviewFragment editorPreviewFragment, Continuation<? super C23542OooOOOo> continuation) {
                super(2, continuation);
                this.f75988OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23542OooOOOo(this.f75988OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23542OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75989OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPreviewFragment editorPreviewFragment = this.f75988OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooOoo0 = editorPreviewFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(editorPreviewFragment, null);
                    this.f75989OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo0.f73416o00000oO, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooOOo0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$14$9", m80623f = "EditorPreviewFragment.kt", m80624l = {563}, m80625m = "invokeSuspend")
        public static final class C23543OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f75992OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f75993OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o$OooOOo0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ EditorPreviewFragment f75994OooOo0o;

                public OooO00o(EditorPreviewFragment editorPreviewFragment) {
                    this.f75994OooOo0o = editorPreviewFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String str = (String) obj;
                    TextView textView = this.f75994OooOo0o.f75900OooOooO;
                    if (textView != null) {
                        textView.setText(str);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteName");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23543OooOOo0(EditorPreviewFragment editorPreviewFragment, Continuation<? super C23543OooOOo0> continuation) {
                super(2, continuation);
                this.f75992OooOo = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23543OooOOo0(this.f75992OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23543OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f75993OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    EditorPreviewFragment editorPreviewFragment = this.f75992OooOo;
                    com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = editorPreviewFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(editorPreviewFragment);
                    this.f75993OooOo0o = 1;
                    if (oooO0OOOooOoo.f76078OooOOo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0o oooO0o = EditorPreviewFragment.this.new OooO0o(continuation);
            oooO0o.f75934OooOo0o = obj;
            return oooO0o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f75934OooOo0o;
            EditorPreviewFragment editorPreviewFragment = EditorPreviewFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(editorPreviewFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0(editorPreviewFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0O(editorPreviewFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23541OooOO0o(editorPreviewFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOO0(editorPreviewFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOO(editorPreviewFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOOO(editorPreviewFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23542OooOOOo(editorPreviewFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23543OooOOo0(editorPreviewFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(editorPreviewFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(editorPreviewFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23537OooO0Oo(editorPreviewFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23538OooO0o0(editorPreviewFragment, null), 3);
            C21030OooOO0o.OooO0OO(editorPreviewFragment).OooO0O0(editorPreviewFragment.f75918o000oOoO);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19372OooO0o(editorPreviewFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23539OooO0oO(editorPreviewFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23540OooO0oo(editorPreviewFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO(editorPreviewFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23544OooO0o0 implements NoteTnNavigatorView.OooO00o {
        public C23544OooO0o0() {
        }

        @Override // com.orion.notein.ui.noteeditor.propertypanel.preview.NoteTnNavigatorView.OooO00o
        public final void OooO00o(View v, PagePreviewVO pagePreviewVO) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
            EditorPreviewFragment editorPreviewFragment = EditorPreviewFragment.this;
            EditText editText = editorPreviewFragment.f75903Oooo0;
            if (editText == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                throw null;
            }
            editText.clearFocus();
            C29718OooO0O0 c29718OooO0O0 = editorPreviewFragment.f75916OoooO0O;
            if (c29718OooO0O0 != null) {
                c29718OooO0O0.OooO0O0(v, pagePreviewVO);
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$5$1", m80623f = "EditorPreviewFragment.kt", m80624l = {205}, m80625m = "invokeSuspend")
    public static final class C23545OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f75997OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ PagePreviewVO f75998OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23545OooO0oO(PagePreviewVO pagePreviewVO, Continuation<? super C23545OooO0oO> continuation) {
            super(2, continuation);
            this.f75998OooOoO0 = pagePreviewVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorPreviewFragment.this.new C23545OooO0oO(this.f75998OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23545OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f75997OooOo0o;
            EditorPreviewFragment editorPreviewFragment = EditorPreviewFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f75997OooOo0o = 1;
                obj = EditorPreviewFragment.OooOoOO(editorPreviewFragment, 30, this);
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
            PagePreviewVO pagePreviewVO = this.f75998OooOoO0;
            ItemData itemData = new ItemData(null, pagePreviewVO.getNoteId(), pagePreviewVO.getId(), 2, 1);
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = editorPreviewFragment.requireActivity();
            kotlin.jvm.internal.OooOOO0.OooO0o0(activityC21897OooOo0RequireActivity, "null cannot be cast to non-null type com.orion.notein.MainActivity");
            ((MainActivity) activityC21897OooOo0RequireActivity).openLabelPicker(new ItemData[]{itemData});
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$5$2", m80623f = "EditorPreviewFragment.kt", m80624l = {218, 226, 228}, m80625m = "invokeSuspend")
    public static final class C23546OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f76000OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ PagePreviewVO f76001OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooO0oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$5$2$1", m80623f = "EditorPreviewFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f76002OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(EditorPreviewFragment editorPreviewFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f76002OooOo0o = editorPreviewFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f76002OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C29718OooO0O0 c29718OooO0O0 = this.f76002OooOo0o.f75916OoooO0O;
                if (c29718OooO0O0 != null) {
                    c29718OooO0O0.OooO00o();
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23546OooO0oo(PagePreviewVO pagePreviewVO, Continuation<? super C23546OooO0oo> continuation) {
            super(2, continuation);
            this.f76001OooOoO0 = pagePreviewVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorPreviewFragment.this.new C23546OooO0oo(this.f76001OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23546OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
        
            if (oO0o0OO.C33609OooO0oo.OooO0o(r10, r1, r9) != r0) goto L37;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f76000OooOo0o;
            EditorPreviewFragment editorPreviewFragment = EditorPreviewFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f76000OooOo0o = 1;
                obj = EditorPreviewFragment.OooOoOO(editorPreviewFragment, 43, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i == 1) {
                C32446OooOOOo.OooO0O0(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
                OooO00o oooO00o = new OooO00o(editorPreviewFragment, null);
                this.f76000OooOo0o = 3;
            }
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = editorPreviewFragment.OooOoo();
            PagePreviewVO pagePreviewVO = this.f76001OooOoO0;
            String pageId = pagePreviewVO.getId();
            kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((Page) oOo000Oo.OooOo.OoooOOo((List) oooO0OOOooOoo.f76077OooOOOo.f121747OooOo0o.getValue())).getId(), pageId)) {
                EditorPreviewFragment.OooOooO(editorPreviewFragment, pagePreviewVO.getIndex() - 1, null, 6);
            }
            com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo2 = editorPreviewFragment.OooOoo();
            String id = pagePreviewVO.getId();
            this.f76000OooOo0o = 2;
            String str = (String) oooO0OOOooOoo2.f76075OooOOO0.getValue();
            C27449o00O0OoO c27449o00O0OoO = oooO0OOOooOoo2.f76066OooO0Oo;
            c27449o00O0OoO.getClass();
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(id);
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27430o000oo(c27449o00O0OoO, str, listOooO0oO, null), this);
            if (objOooO0o != enumC32485OooO00o) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o != enumC32485OooO00o) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o != enumC32485OooO00o) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o != enumC32485OooO00o) {
                C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                AbstractC33687OooO0oO abstractC33687OooO0oO2 = C33833OooOOOO.f121946OooO00o;
                OooO00o oooO00o2 = new OooO00o(editorPreviewFragment, null);
                this.f76000OooOo0o = 3;
            }
            return enumC32485OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$5$4", m80623f = "EditorPreviewFragment.kt", m80624l = {243}, m80625m = "invokeSuspend")
    public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f76004OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ PagePreviewVO f76005OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(PagePreviewVO pagePreviewVO, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f76005OooOoO0 = pagePreviewVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorPreviewFragment.this.new OooOO0(this.f76005OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f76004OooOo0o;
            EditorPreviewFragment editorPreviewFragment = EditorPreviewFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f76004OooOo0o = 1;
                obj = EditorPreviewFragment.OooOoOO(editorPreviewFragment, 40, this);
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
                C29718OooO0O0 c29718OooO0O0 = editorPreviewFragment.f75916OoooO0O;
                if (c29718OooO0O0 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
                    throw null;
                }
                c29718OooO0O0.OooO00o();
                PagePreviewVO pagePreviewVO = this.f76005OooOoO0;
                String pageId = pagePreviewVO.getId();
                int index = pagePreviewVO.getIndex();
                kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(editorPreviewFragment), new C28778o0000oOO(index, pageId));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$5$5", m80623f = "EditorPreviewFragment.kt", m80624l = {StyleIdentifier.SUBTLE_EMPHASIS, StyleIdentifier.BIBLIOGRAPHY}, m80625m = "invokeSuspend")
    public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f76006OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C33163OooO0oO f76007OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ PagePreviewVO f76008OooOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(PagePreviewVO pagePreviewVO, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f76008OooOoO = pagePreviewVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorPreviewFragment.this.new OooOO0O(this.f76008OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        
            if (r8 == r0) goto L25;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Context context;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f76006OooOo;
            PagePreviewVO pagePreviewVO = this.f76008OooOoO;
            EditorPreviewFragment editorPreviewFragment = EditorPreviewFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C29718OooO0O0 c29718OooO0O0 = editorPreviewFragment.f75916OoooO0O;
                if (c29718OooO0O0 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
                    throw null;
                }
                c29718OooO0O0.OooO00o();
                context = editorPreviewFragment.getContext();
                if (context == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                this.f76007OooOo0o = (C33163OooO0oO) context;
                this.f76006OooOo = 1;
                obj = EditorPreviewFragment.OooOoOO(editorPreviewFragment, 36, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                File file = (File) obj;
                CharSequence string = (CharSequence) editorPreviewFragment.OooOoo().f76078OooOOo.f121747OooOo0o.getValue();
                if (C33599OooOo0O.Oooo0o0(string)) {
                    string = editorPreviewFragment.getString(R.string.app_name);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                }
                String str = ((String) string) + (pagePreviewVO.getIndex() + 1);
                String str2 = (String) editorPreviewFragment.OooOoo().f76075OooOOO0.getValue();
                String absolutePath = file.getAbsolutePath();
                kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                ExportRequest.PageExport pageExport = new ExportRequest.PageExport(absolutePath, str2, str);
                ActivityC21897OooOo0 activity = editorPreviewFragment.getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    mainActivity.openExportOptions(pageExport);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            context = this.f76007OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(pagePreviewVO.getId());
            this.f76007OooOo0o = null;
            this.f76006OooOo = 2;
            obj = ExportBottomSheetFragment.f71509OoooOoO.OooO00o(context, listOooO0oO, this);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooOO0o, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$5$6", m80623f = "EditorPreviewFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL}, m80625m = "invokeSuspend")
    public static final class C23547OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f76011OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ PagePreviewVO f76012OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23547OooOO0o(PagePreviewVO pagePreviewVO, Continuation<? super C23547OooOO0o> continuation) {
            super(2, continuation);
            this.f76012OooOoO0 = pagePreviewVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return EditorPreviewFragment.this.new C23547OooOO0o(this.f76012OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23547OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f76011OooOo0o;
            EditorPreviewFragment editorPreviewFragment = EditorPreviewFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f76011OooOo0o = 1;
                obj = EditorPreviewFragment.OooOoOO(editorPreviewFragment, 41, this);
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
                C29718OooO0O0 c29718OooO0O0 = editorPreviewFragment.f75916OoooO0O;
                if (c29718OooO0O0 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
                    throw null;
                }
                c29718OooO0O0.OooO00o();
                PagePreviewVO pagePreviewVO = this.f76012OooOoO0;
                String pageId = pagePreviewVO.getId();
                int index = pagePreviewVO.getIndex();
                kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(editorPreviewFragment), new C28777o0000oO0(index, pageId));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooOOO {
        public OooOOO() {
        }
    }

    public static final class OooOOO0 implements OooO00o.InterfaceC19403OooO00o {

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$6$onClicked$1", m80623f = "EditorPreviewFragment.kt", m80624l = {303}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f76015OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76016OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ ItemData f76017OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(EditorPreviewFragment editorPreviewFragment, ItemData itemData, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f76015OooOo = editorPreviewFragment;
                this.f76017OooOoO0 = itemData;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f76015OooOo, this.f76017OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76016OooOo0o;
                EditorPreviewFragment editorPreviewFragment = this.f76015OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    editorPreviewFragment.OooOoo0().Oooo0o(1);
                    com.orion.notein.p607ui.notelist.OooO00o oooO00o = editorPreviewFragment.f75911Oooo0oO;
                    if (oooO00o == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("itemLabelListPopupWindow");
                        throw null;
                    }
                    oooO00o.OooO00o();
                    this.f76016OooOo0o = 1;
                    obj = EditorPreviewFragment.OooOoOO(editorPreviewFragment, 30, this);
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
                ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = editorPreviewFragment.requireActivity();
                kotlin.jvm.internal.OooOOO0.OooO0o0(activityC21897OooOo0RequireActivity, "null cannot be cast to non-null type com.orion.notein.MainActivity");
                ((MainActivity) activityC21897OooOo0RequireActivity).openLabelPicker(new ItemData[]{this.f76017OooOoO0});
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooOOO0() {
        }

        @Override // com.orion.notein.p607ui.notelist.OooO00o.InterfaceC19403OooO00o
        public final void OooO00o(ItemData itemData) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(itemData, "itemData");
            EditorPreviewFragment editorPreviewFragment = EditorPreviewFragment.this;
            InterfaceC21987OooOoo viewLifecycleOwner = editorPreviewFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(editorPreviewFragment, itemData, null), 3);
        }
    }

    public static final class OooOOOO extends C22041OooOOo.AbstractC22044OooO0oO {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f76019OooO0o0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$onViewCreated$callback$1$clearView$1", m80623f = "EditorPreviewFragment.kt", m80624l = {479}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ EditorPreviewFragment f76020OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76021OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ OooOOOO f76022OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ PagePreviewVO f76023OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(EditorPreviewFragment editorPreviewFragment, PagePreviewVO pagePreviewVO, OooOOOO oooOOOO, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f76020OooOo = editorPreviewFragment;
                this.f76023OooOoO0 = pagePreviewVO;
                this.f76022OooOoO = oooOOOO;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f76020OooOo, this.f76023OooOoO0, this.f76022OooOoO, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76021OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OOOooOoo = this.f76020OooOo.OooOoo();
                    int i2 = this.f76022OooOoO.f76019OooO0o0;
                    this.f76021OooOo0o = 1;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29678OooOOo(this.f76023OooOoO0, oooO0OOOooOoo, i2, null), this);
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
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooOOOO() {
            super(3);
            this.f76019OooO0o0 = -1;
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final void OooO0OO(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
            kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
            super.OooO0OO(recyclerView, viewHolder);
            if (this.f76019OooO0o0 == -1) {
                return;
            }
            Object tag = viewHolder.itemView.getTag();
            kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.propertypanel.preview.PagePreviewVO");
            EditorPreviewFragment editorPreviewFragment = EditorPreviewFragment.this;
            InterfaceC21987OooOoo viewLifecycleOwner = editorPreviewFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(editorPreviewFragment, (PagePreviewVO) tag, this, null), 3);
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22044OooO0oO, androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final int OooO0oo(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
            kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
            Object tag = viewHolder.itemView.getTag();
            kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.propertypanel.preview.PagePreviewVO");
            if (((PagePreviewVO) tag).isSearchResult()) {
                return 0;
            }
            return C22041OooOOo.AbstractC22042OooO0Oo.OooOO0O(3);
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final boolean OooOOO0(RecyclerView recyclerView, RecyclerView.AbstractC22078OooOooO viewHolder, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
            kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
            C23558OooO0oo.OooO00o oooO00o = (C23558OooO0oo.OooO00o) abstractC22078OooOooO;
            this.f76019OooO0o0 = oooO00o.getAdapterPosition();
            C22236OooO0Oo.OooO00o(oooO00o.getAdapterPosition(), "dropTarget ", "EditorPreviewFragment");
            EditorPreviewFragment editorPreviewFragment = EditorPreviewFragment.this;
            List list = (List) editorPreviewFragment.OooOoo().f76090OooOoo0.f121747OooOo0o.getValue();
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = oooO00o.getAdapterPosition();
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
            C23558OooO0oo c23558OooO0oo = editorPreviewFragment.f75902Oooo;
            if (c23558OooO0oo != null) {
                c23558OooO0oo.notifyItemMoved(adapterPosition, adapterPosition2);
                return true;
            }
            kotlin.jvm.internal.OooOOO0.OooOOOO("tnAdapter");
            throw null;
        }

        @Override // androidx.recyclerview.widget.C22041OooOOo.AbstractC22042OooO0Oo
        public final void OooOOOO(RecyclerView.AbstractC22078OooOooO viewHolder) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(viewHolder, "viewHolder");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooOOOo, reason: case insensitive filesystem */
    public static final class C23548OooOOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23548OooOOOo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return EditorPreviewFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooOOo, reason: case insensitive filesystem */
    public static final class C23549OooOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76025OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23549OooOOo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76025OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f76025OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooOOo0, reason: case insensitive filesystem */
    public static final class C23550OooOOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23548OooOOOo f76026OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23550OooOOo0(C23548OooOOOo c23548OooOOOo) {
            super(0);
            this.f76026OooOo0o = c23548OooOOOo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f76026OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooOOoo, reason: case insensitive filesystem */
    public static final class C23551OooOOoo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76027OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23551OooOOoo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76027OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76027OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f76028OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76028OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76028OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? EditorPreviewFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooOo0, reason: case insensitive filesystem */
    public static final class C23552OooOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C29663OooO00o f76030OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23552OooOo0(C29663OooO00o c29663OooO00o) {
            super(0);
            this.f76030OooOo0o = c29663OooO00o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f76030OooOo0o.invoke();
        }
    }

    public static final class OooOo00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f76031OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76031OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76031OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? EditorPreviewFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooOo0O, reason: case insensitive filesystem */
    public static final class C23553OooOo0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76033OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23553OooOo0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76033OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f76033OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewFragment$OooOo0o, reason: case insensitive filesystem */
    public static final class C23554OooOo0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76034OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23554OooOo0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76034OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76034OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [o0Ooooo.OooO0O0] */
    public EditorPreviewFragment() {
        C23548OooOOOo c23548OooOOOo = new C23548OooOOOo();
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23550OooOOo0(c23548OooOOOo));
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f75899OooOoo0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO.class), new C23549OooOOo(interfaceC32440OooOO0OooO0O0), new OooOo00(interfaceC32440OooOO0OooO0O0), new C23551OooOOoo(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23552OooOo0(new C29663OooO00o(this)));
        this.f75898OooOoo = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.OooO0OO.class), new C23553OooOo0O(interfaceC32440OooOO0OooO0O02), new OooOo(interfaceC32440OooOO0OooO0O02), new C23554OooOo0o(interfaceC32440OooOO0OooO0O02));
        this.f75917OoooOO0 = new Handler(Looper.getMainLooper());
        this.f75918o000oOoO = new C24572OooOO0o.OooO0O0() { // from class: o0Ooooo.OooO0O0
            @Override // o000o0O0.C24572OooOO0o.OooO0O0
            public final void OooO00o(C24572OooOO0o controller, C24583OooOo0o destination, Bundle bundle) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(controller, "controller");
                kotlin.jvm.internal.OooOOO0.OooO0oO(destination, "destination");
                EditText editText = this.f105182OooO00o.f75903Oooo0;
                if (editText != null) {
                    editText.clearFocus();
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
            }
        };
    }

    public static final void OooOoO(EditorPreviewFragment editorPreviewFragment) {
        EditText editText = editorPreviewFragment.f75903Oooo0;
        if (editText == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
            throw null;
        }
        if (editText.hasFocus() && C28039OooO00o.OooO0Oo()) {
            editorPreviewFragment.f75917OoooOO0.postDelayed(new RunnableC29075Oooo(editorPreviewFragment, 1), 100L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoOO(EditorPreviewFragment editorPreviewFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29669OooO0oO c29669OooO0oO;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C29669OooO0oO) {
            c29669OooO0oO = (C29669OooO0oO) abstractC32479OooO0OO;
            int i2 = c29669OooO0oO.f105194OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29669OooO0oO.f105194OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c29669OooO0oO = new C29669OooO0oO(editorPreviewFragment, abstractC32479OooO0OO);
            }
        }
        C29669OooO0oO c29669OooO0oO2 = c29669OooO0oO;
        Object objShowNonVipFeatureLimitedDialog$default = c29669OooO0oO2.f105193OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c29669OooO0oO2.f105194OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = editorPreviewFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c29669OooO0oO2.f105194OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c29669OooO0oO2, 6, null);
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

    public static void OooOooO(EditorPreviewFragment editorPreviewFragment, int i, Point point, int i2) {
        if ((i2 & 2) != 0) {
            point = new Point(0, 0);
        }
        boolean z = (i2 & 4) != 0;
        Fragment parentFragment = editorPreviewFragment.getParentFragment();
        Fragment parentFragment2 = parentFragment != null ? parentFragment.getParentFragment() : null;
        NoteEditorContainerFragment noteEditorContainerFragment = parentFragment2 instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment2 : null;
        if (noteEditorContainerFragment == null) {
            return;
        }
        noteEditorContainerFragment.Oooo0o0(BundleKt.bundleOf(new C32443OooOOO("page_index", Integer.valueOf(i)), new C32443OooOOO("offset_x", Integer.valueOf(point.x)), new C32443OooOOO("offset_y", Integer.valueOf(point.y)), new C32443OooOOO("isCenter", Boolean.valueOf(z))));
    }

    public final com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO OooOoo() {
        return (com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO) this.f75899OooOoo0.getValue();
    }

    public final com.orion.notein.p607ui.noteeditor.OooO0OO OooOoo0() {
        return (com.orion.notein.p607ui.noteeditor.OooO0OO) this.f75898OooOoo.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_property_preview, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C21030OooOO0o.OooO0OO(this).OooOo0o(this.f75918o000oOoO);
        this.f75917OoooOO0.removeCallbacksAndMessages(null);
        C29718OooO0O0 c29718OooO0O0 = this.f75916OoooO0O;
        if (c29718OooO0O0 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
            throw null;
        }
        c29718OooO0O0.OooO00o();
        com.orion.notein.p607ui.notelist.OooO00o oooO00o = this.f75911Oooo0oO;
        if (oooO00o != null) {
            oooO00o.OooO00o();
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("itemLabelListPopupWindow");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            view.requestLayout();
        }
        requireActivity().getSupportFragmentManager().Oooooo0("rename", this, new C28242OooOo0(this, 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f75900OooOooO = (TextView) view.findViewById(R.id.note_name);
        ImageView imageView = (ImageView) view.findViewById(R.id.btn_add_label);
        this.f75905Oooo00O = imageView;
        if (imageView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnAddLabel");
            throw null;
        }
        imageView.setOnClickListener(new ViewOnClickListenerC26035OooOooo(this, 2));
        this.f75901OooOooo = (TextView) view.findViewById(R.id.page_number);
        this.f75904Oooo000 = (TextView) view.findViewById(R.id.creation_time);
        View viewFindViewById = view.findViewById(R.id.note_name_wrapper);
        this.f75906Oooo00o = viewFindViewById;
        if (viewFindViewById == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteNameWrapper");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC29368OooO0OO(this, 1));
        EditText editText = (EditText) view.findViewById(R.id.search_box);
        this.f75903Oooo0 = editText;
        if (editText == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
            throw null;
        }
        editText.addTextChangedListener(new OooO0O0());
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_clear_search);
        this.f75907Oooo0O0 = imageView2;
        if (imageView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("ivClear");
            throw null;
        }
        C28025OooO0O0.OooO00o(imageView2);
        ImageView imageView3 = this.f75907Oooo0O0;
        if (imageView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("ivClear");
            throw null;
        }
        imageView3.setOnClickListener(new ViewOnClickListenerC28240OooOOo0(this, 2));
        this.f75904Oooo000 = (TextView) view.findViewById(R.id.creation_time);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f75916OoooO0O = new C29718OooO0O0(contextRequireContext, new ViewOnClickListenerC28239OooOOo(this, 1));
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
        this.f75911Oooo0oO = new com.orion.notein.p607ui.notelist.OooO00o(contextRequireContext2, new OooOOO0());
        C23558OooO0oo c23558OooO0oo = new C23558OooO0oo(C23558OooO0oo.OooO0O0.f76130OooO00o);
        this.f75902Oooo = c23558OooO0oo;
        c23558OooO0oo.f76123OooO0O0 = new OooOOO();
        c23558OooO0oo.f76124OooO0OO = new ViewOnContextClickListenerC29665OooO0OO(this);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.thumbnail_list);
        C23558OooO0oo c23558OooO0oo2 = this.f75902Oooo;
        if (c23558OooO0oo2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("tnAdapter");
            throw null;
        }
        recyclerView.setAdapter(c23558OooO0oo2);
        recyclerView.setItemAnimator(null);
        this.f75912Oooo0oo = recyclerView;
        this.f75910Oooo0o0 = (TextView) view.findViewById(R.id.tv_searching);
        this.f75909Oooo0o = (TextView) view.findViewById(R.id.tv_page_text_cache_updating_tips);
        this.f75914OoooO0 = (ViewGroup) view.findViewById(R.id.cl_btn_tiled);
        View viewFindViewById2 = view.findViewById(R.id.tv_page_tiled);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById2);
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new o0OoOo0(this, 3));
        NoteTnNavigatorView noteTnNavigatorView = (NoteTnNavigatorView) view.findViewById(R.id.tn_navigator);
        this.f75915OoooO00 = noteTnNavigatorView;
        if (noteTnNavigatorView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteTnNavigatorView");
            throw null;
        }
        noteTnNavigatorView.setOnNavigatorWindowMovedListener(new C23536OooO0Oo());
        NoteTnNavigatorView noteTnNavigatorView2 = this.f75915OoooO00;
        if (noteTnNavigatorView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteTnNavigatorView");
            throw null;
        }
        noteTnNavigatorView2.setOnButtonClickedListener(new C23544OooO0o0());
        NoteTnNavigatorView noteTnNavigatorView3 = this.f75915OoooO00;
        if (noteTnNavigatorView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteTnNavigatorView");
            throw null;
        }
        noteTnNavigatorView3.setOnContextClickListener(new View.OnContextClickListener() { // from class: o0Ooooo.OooO0Oo
            @Override // android.view.View.OnContextClickListener
            public final boolean onContextClick(View view2) {
                EditorPreviewFragment editorPreviewFragment = this.f105184OooO00o;
                NoteTnNavigatorView noteTnNavigatorView4 = editorPreviewFragment.f75915OoooO00;
                if (noteTnNavigatorView4 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteTnNavigatorView");
                    throw null;
                }
                PagePreviewVO pagePreviewVO = noteTnNavigatorView4.getPagePreviewVO();
                if (pagePreviewVO == null) {
                    return false;
                }
                EditText editText2 = editorPreviewFragment.f75903Oooo0;
                if (editText2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
                editText2.clearFocus();
                C29718OooO0O0 c29718OooO0O0 = editorPreviewFragment.f75916OoooO0O;
                if (c29718OooO0O0 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
                    throw null;
                }
                kotlin.jvm.internal.OooOOO0.OooO0Oo(view2);
                c29718OooO0O0.OooO0O0(view2, pagePreviewVO);
                return true;
            }
        });
        this.f75908Oooo0OO = (ViewGroup) view.findViewById(R.id.fl_thumbnail_list);
        C22041OooOOo c22041OooOOo = new C22041OooOOo(new OooOOOO());
        RecyclerView recyclerView2 = this.f75912Oooo0oo;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("thumbnailList");
            throw null;
        }
        c22041OooOOo.OooO0o(recyclerView2);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0o(null), 3);
    }
}
