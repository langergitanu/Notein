package com.orion.notein.p607ui.notelist;

import Oooo0.o000000O;
import Oooo0o0.C21009OooOooO;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.aspose.words.StyleIdentifier;
import com.google.firebase.crashlytics.internal.common.C22568OooOOo0;
import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.notelist.NoteListFragment;
import com.orion.notein.p607ui.notelist.OooO0OO;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.NoteVOFilter;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import com.orion.notein.ui.notelist.NoteListFragment.OooO0OO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.C26325o0000o0o;
import o0O0oooO.ViewOnClickListenerC26282Oooo;
import o0Oo0o00.C28201OooooO0;
import o0Oo0o00.ViewOnClickListenerC28181Oooo00O;
import o0Oo0ooO.C28422OooOOo;
import o0OoO0oo.ViewOnClickListenerC28702OooOOoo;
import o0o00oOo.C30031OooO0OO;
import o0o00oOo.C30035OooO0oO;
import o0o00oOo.C30046OooOoO;
import o0o00oOo.C30048OooOoOO;
import o0o00oOo.C30051OooOooO;
import o0o00oOo.C30071OoooOoo;
import o0o00oOo.C30082o00000Oo;
import o0o0O00.C30201OooOOO0;
import o0o0O00.C30214OooOoOO;
import o0oOoOo.C31040OooOO0o;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/NoteListFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteListFragment extends Hilt_NoteListFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f77011OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f77012OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f77013OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public NoteVOFilter f77014OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TextView f77015Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public C30051OooOooO f77016Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f77017Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public RecyclerView f77018Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C30035OooO0oO f77019Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public com.orion.notein.p607ui.notelist.OooO00o f77020Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public o0o0O0.OooO f77021Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public RecyclerView f77022Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public C30082o00000Oo f77023Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o0o0O000.OooO0OO f77024Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ImageView f77025Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final C30031OooO0OO f77026OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public TextView f77027OoooO00;

    public static final class OooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return NoteListFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f77029OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f77030OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f77031OooOoO0;

        /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
            java.lang.IllegalArgumentException: Illegal Capacity: -1
            	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
            	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
            	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        static {
            /*
                com.orion.notein.ui.notelist.NoteListFragment$OooO00o r0 = new com.orion.notein.ui.notelist.NoteListFragment$OooO00o
                java.lang.String r1 = "PRESERVE"
                r2 = 0
                r0.<init>(r1, r2)
                com.orion.notein.ui.notelist.NoteListFragment.OooO00o.f77030OooOo0o = r0
                com.orion.notein.ui.notelist.NoteListFragment$OooO00o r1 = new com.orion.notein.ui.notelist.NoteListFragment$OooO00o
                java.lang.String r2 = "RESTORE"
                r3 = 1
                r1.<init>(r2, r3)
                com.orion.notein.ui.notelist.NoteListFragment.OooO00o.f77029OooOo = r1
                com.orion.notein.ui.notelist.NoteListFragment$OooO00o r2 = new com.orion.notein.ui.notelist.NoteListFragment$OooO00o
                java.lang.String r3 = "RESET"
                r4 = 2
                r2.<init>(r3, r4)
                com.orion.notein.ui.notelist.NoteListFragment$OooO00o[] r0 = new com.orion.notein.ui.notelist.NoteListFragment.OooO00o[]{r0, r1, r2}
                com.orion.notein.ui.notelist.NoteListFragment.OooO00o.f77031OooOoO0 = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.ui.notelist.NoteListFragment.OooO00o.<clinit>():void");
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f77031OooOoO0.clone();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onResume$1$1", m80623f = "NoteListFragment.kt", m80624l = {154}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f77032OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77033OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ NoteListFragment f77034OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f77035OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ int f77036OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, String str2, NoteListFragment noteListFragment, int i, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f77032OooOo = str;
            this.f77035OooOoO0 = str2;
            this.f77034OooOoO = noteListFragment;
            this.f77036OooOoOO = i;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(this.f77032OooOo, this.f77035OooOoO0, this.f77034OooOoO, this.f77036OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            ActivityC21897OooOo0 activity;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77033OooOo0o;
            NoteListFragment noteListFragment = this.f77034OooOoO;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String str = this.f77032OooOo;
                if (str.length() > 0) {
                    String str2 = this.f77035OooOoO0;
                    if (str2.length() > 0) {
                        com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListFragment.OooOoo();
                        this.f77033OooOo0o = 1;
                        obj = oooO0OOOooOoo.OooOo0O(str, this.f77036OooOoOO, str2, this);
                        if (obj == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            if (!((Boolean) obj).booleanValue() && (activity = noteListFragment.getActivity()) != null) {
                String string = noteListFragment.getString(R.string.rename_fail);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(activity, string);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onResume$2$1", m80623f = "NoteListFragment.kt", m80624l = {172}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77038OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ Bundle f77039OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f77040OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, Bundle bundle, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f77040OooOoO0 = str;
            this.f77039OooOoO = bundle;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteListFragment.this.new OooO0OO(this.f77040OooOoO0, this.f77039OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77038OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = NoteListFragment.this.OooOoo();
                this.f77038OooOo0o = 1;
                if (oooO0OOOooOoo.OooOo00(this.f77039OooOoO, this.f77040OooOoO0) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$10$1$1", m80623f = "NoteListFragment.kt", m80624l = {385}, m80625m = "invokeSuspend")
    public static final class C23622OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f77041OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C30046OooOoO f77042OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ NoteListFragment f77043OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ View f77044OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23622OooO0Oo(View view, NoteListFragment noteListFragment, Continuation<? super C23622OooO0Oo> continuation) {
            super(2, continuation);
            this.f77044OooOoO0 = view;
            this.f77043OooOoO = noteListFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C23622OooO0Oo(this.f77044OooOoO0, this.f77043OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23622OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [oO0O000o.OooO00o] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r1v2, types: [o0o00oOo.OooOoO] */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            ?? r0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77041OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Object tag = this.f77044OooOoO0.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.FolderColorVO");
                final NoteListFragment noteListFragment = this.f77043OooOoO;
                final int i2 = ((C31040OooOO0o) tag).f110821OooO00o;
                ?? r1 = new oO0O000o.OooO00o() { // from class: o0o00oOo.OooOoO
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        noteListFragment.OooOoo().OooOooO(i2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                };
                if (i2 == 0) {
                    r1.invoke();
                    return C32460OooOooO.f116667OooO00o;
                }
                this.f77042OooOo0o = r1;
                this.f77041OooOo = 1;
                obj = NoteListFragment.OooOoO(noteListFragment, 24, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                r0 = r1;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C30046OooOoO c30046OooOoO = this.f77042OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                r0 = c30046OooOoO;
            }
            if (!((Boolean) obj).booleanValue()) {
                r0.invoke();
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$4$2", m80623f = "NoteListFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_2}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77046OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteVO f77047OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(NoteVO noteVO, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f77047OooOoO0 = noteVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteListFragment.this.new OooO0o(this.f77047OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77046OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = NoteListFragment.this.OooOoo();
                this.f77046OooOo0o = 1;
                if (oooO0OOOooOoo.Oooo00o(this.f77047OooOoO0, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$11", m80623f = "NoteListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23623OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f77049OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$11$9", m80623f = "NoteListFragment.kt", m80624l = {542}, m80625m = "invokeSuspend")
        public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListFragment f77050OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77051OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$11$9$1", m80623f = "NoteListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ NoteListFragment f77052OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f77053OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(NoteListFragment noteListFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f77052OooOo = noteListFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f77052OooOo, continuation);
                    oooO00o.f77053OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(num, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    Integer num = (Integer) this.f77053OooOo0o;
                    NoteListFragment noteListFragment = this.f77052OooOo;
                    if (num != null) {
                        RecyclerView recyclerView = noteListFragment.f77022Oooo0o;
                        if (recyclerView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("folderColorList");
                            throw null;
                        }
                        NoteVOFilter noteVOFilter = C30214OooOoOO.f107601OooO0o;
                        recyclerView.setVisibility(num.intValue() == C30214OooOoOO.f107602OooO0oO.getIndex() ? 0 : 8);
                    } else {
                        RecyclerView recyclerView2 = noteListFragment.f77022Oooo0o;
                        if (recyclerView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("folderColorList");
                            throw null;
                        }
                        NoteVOFilter noteVOFilter2 = noteListFragment.f77014OooOooo;
                        if (noteVOFilter2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("filterVO");
                            throw null;
                        }
                        int index = noteVOFilter2.getIndex();
                        NoteVOFilter noteVOFilter3 = C30214OooOoOO.f107601OooO0o;
                        recyclerView2.setVisibility(index == C30214OooOoOO.f107602OooO0oO.getIndex() ? 0 : 8);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO(NoteListFragment noteListFragment, Continuation<? super OooO> continuation) {
                super(2, continuation);
                this.f77050OooOo = noteListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO(this.f77050OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77051OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteListFragment noteListFragment = this.f77050OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(noteListFragment, null);
                    this.f77051OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f77158Oooo0oo, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$11$1", m80623f = "NoteListFragment.kt", m80624l = {402}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListFragment f77054OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77055OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$11$1$1", m80623f = "NoteListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19401OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ NoteListFragment f77056OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ int f77057OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19401OooO00o(NoteListFragment noteListFragment, Continuation<? super C19401OooO00o> continuation) {
                    super(2, continuation);
                    this.f77056OooOo = noteListFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19401OooO00o c19401OooO00o = new C19401OooO00o(this.f77056OooOo, continuation);
                    c19401OooO00o.f77057OooOo0o = ((Number) obj).intValue();
                    return c19401OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19401OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    int i = this.f77057OooOo0o;
                    NoteListFragment noteListFragment = this.f77056OooOo;
                    if (i != 0) {
                        ImageView imageView = noteListFragment.f77025Oooo0oo;
                        if (imageView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("emptyBg");
                            throw null;
                        }
                        imageView.setImageResource(R.drawable.bg_label_list_empty);
                        ImageView imageView2 = noteListFragment.f77025Oooo0oo;
                        if (imageView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("emptyBg");
                            throw null;
                        }
                        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                        layoutParams.height = o000000O.OooO0o(120);
                        layoutParams.width = o000000O.OooO0o(120);
                        ImageView imageView3 = noteListFragment.f77025Oooo0oo;
                        if (imageView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("emptyBg");
                            throw null;
                        }
                        imageView3.setLayoutParams(layoutParams);
                        int color = noteListFragment.requireContext().getColor(R.color.title_bar_text_color);
                        TextView textView = noteListFragment.f77015Oooo;
                        if (textView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noNotes");
                            throw null;
                        }
                        textView.setText(noteListFragment.getString(R.string.fragment_note_list_no_files));
                        TextView textView2 = noteListFragment.f77015Oooo;
                        if (textView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noNotes");
                            throw null;
                        }
                        textView2.setTextColor(color);
                        String string = noteListFragment.getString(((C28422OooOOo) ((List) noteListFragment.OooOoo().f77153Oooo0O0.f121747OooOo0o.getValue()).get(i)).f100770OooO0O0);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        int color2 = noteListFragment.requireContext().getColor(R.color.edit_text_hint_color);
                        TextView textView3 = noteListFragment.f77027OoooO00;
                        if (textView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noNotesTips");
                            throw null;
                        }
                        textView3.setText(noteListFragment.getString(R.string.fragment_note_list_no_files_tips, string));
                        TextView textView4 = noteListFragment.f77027OoooO00;
                        if (textView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noNotesTips");
                            throw null;
                        }
                        textView4.setTextColor(color2);
                    } else {
                        ImageView imageView4 = noteListFragment.f77025Oooo0oo;
                        if (imageView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("emptyBg");
                            throw null;
                        }
                        imageView4.setImageResource(R.drawable.bg_list_empty);
                        ImageView imageView5 = noteListFragment.f77025Oooo0oo;
                        if (imageView5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("emptyBg");
                            throw null;
                        }
                        ViewGroup.LayoutParams layoutParams2 = imageView5.getLayoutParams();
                        layoutParams2.height = o000000O.OooO0o(200);
                        layoutParams2.width = o000000O.OooO0o(250);
                        ImageView imageView6 = noteListFragment.f77025Oooo0oo;
                        if (imageView6 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("emptyBg");
                            throw null;
                        }
                        imageView6.setLayoutParams(layoutParams2);
                        TextView textView5 = noteListFragment.f77015Oooo;
                        if (textView5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noNotes");
                            throw null;
                        }
                        textView5.setText(noteListFragment.getString(R.string.list_no_notes));
                        int color3 = noteListFragment.requireContext().getColor(R.color.color_primary_blue);
                        TextView textView6 = noteListFragment.f77015Oooo;
                        if (textView6 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noNotes");
                            throw null;
                        }
                        textView6.setTextColor(color3);
                        TextView textView7 = noteListFragment.f77027OoooO00;
                        if (textView7 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noNotesTips");
                            throw null;
                        }
                        textView7.setText(noteListFragment.getString(R.string.note_list_no_notes));
                        TextView textView8 = noteListFragment.f77027OoooO00;
                        if (textView8 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noNotesTips");
                            throw null;
                        }
                        textView8.setTextColor(color3);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteListFragment noteListFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77054OooOo = noteListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f77054OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77055OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteListFragment noteListFragment = this.f77054OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListFragment.OooOoo();
                    C19401OooO00o c19401OooO00o = new C19401OooO00o(noteListFragment, null);
                    this.f77055OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f77149Oooo0, c19401OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$11$2", m80623f = "NoteListFragment.kt", m80624l = {440}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListFragment f77058OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77059OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO0O0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$11$2$1", m80623f = "NoteListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ NoteListFragment f77060OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f77061OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(NoteListFragment noteListFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f77060OooOo = noteListFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f77060OooOo, continuation);
                    oooO00o.f77061OooOo0o = ((Boolean) obj).booleanValue();
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
                    boolean z = this.f77061OooOo0o;
                    C34406OooO00o.f123390OooO00o.OooO00o(com.aspose.slides.internal.p332p7.OooO0O0.OooO0O0("firstLaunch:", z), new Object[0]);
                    if (z) {
                        NoteListFragment noteListFragment = this.f77060OooOo;
                        C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) noteListFragment.f77011OooOoo.getValue();
                        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c26320o0000OoO);
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
                        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, executorC33873OooO0O0, null, new C26325o0000o0o(null, c26320o0000OoO), 2);
                        com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListFragment.OooOoo();
                        Context contextRequireContext = noteListFragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0OOOooOoo), executorC33873OooO0O0, null, new C30071OoooOoo(oooO0OOOooOoo, contextRequireContext, null), 2);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(NoteListFragment noteListFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f77058OooOo = noteListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f77058OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77059OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteListFragment noteListFragment = this.f77058OooOo;
                    InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(((C26320o0000OoO) noteListFragment.f77011OooOoo.getValue()).f90226OooOoO0, 1000L);
                    OooO00o oooO00o = new OooO00o(noteListFragment, null);
                    this.f77059OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(interfaceC33721OooO0oOooOO0O, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$11$3", m80623f = "NoteListFragment.kt", m80624l = {451}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListFragment f77062OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77063OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO0OO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$11$3$1", m80623f = "NoteListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends NoteVO>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ NoteListFragment f77064OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f77065OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(NoteListFragment noteListFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f77064OooOo = noteListFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f77064OooOo, continuation);
                    oooO00o.f77065OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends NoteVO> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    String name;
                    final OooO00o oooO00o;
                    Object next;
                    int iIndexOf;
                    String name2;
                    String name3;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f77065OooOo0o;
                    final ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        final NoteListFragment noteListFragment = this.f77064OooOo;
                        if (!zHasNext) {
                            NoteVO noteVO = (NoteVO) ((C32443OooOOO) noteListFragment.OooOoo().f77161OoooO00.getValue()).f116638OooOo0o;
                            String str = "Desktop";
                            if (noteListFragment.OooOoo().OooOOO0() != null) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("NoteListFragment");
                                if (noteVO == null || (name3 = noteVO.getName()) == null) {
                                    name3 = "Desktop";
                                }
                                c20358OooO00o.OooO00o(C22237OooO0o0.OooO00o("ScrollPos: RESTORE for ", name3, C18241k5.f55433h, noteVO != null ? noteVO.getId() : null), new Object[0]);
                                oooO00o = OooO00o.f77029OooOo;
                            } else {
                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o2.OooOOO0("NoteListFragment");
                                if (noteVO == null || (name = noteVO.getName()) == null) {
                                    name = "Desktop";
                                }
                                c20358OooO00o2.OooO00o(C22237OooO0o0.OooO00o("ScrollPos: PRESERVE for ", name, C18241k5.f55433h, noteVO != null ? noteVO.getId() : null), new Object[0]);
                                oooO00o = OooO00o.f77030OooOo0o;
                            }
                            RecyclerView recyclerView = noteListFragment.f77018Oooo00O;
                            if (recyclerView == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                                throw null;
                            }
                            RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
                            kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                            Boolean bool = (Boolean) noteListFragment.OooOoo().f77164OoooOOO.f121747OooOo0o.getValue();
                            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                            NoteVO noteVO2 = (NoteVO) ((C32443OooOOO) noteListFragment.OooOoo().f77161OoooO00.getValue()).f116638OooOo0o;
                            if (noteVO2 != null && (name2 = noteVO2.getName()) != null) {
                                str = name2;
                            }
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3.OooOOO0("NoteListFragment");
                            c20358OooO00o3.OooO00o("updateNoteList: folder=" + str + ", listMode=" + zBooleanValue + ", behavior=" + oooO00o + ", size=" + arrayList.size(), new Object[0]);
                            c20358OooO00o3.OooOOO0("NoteListFragment");
                            c20358OooO00o3.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("list: ", OooOo.o000oOoO(arrayList, null, null, null, new o0OOo0o.OooOO0(1), 31)), new Object[0]);
                            C30035OooO0oO c30035OooO0oO = noteListFragment.f77019Oooo00o;
                            if (c30035OooO0oO == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                                throw null;
                            }
                            c30035OooO0oO.OooO0o0(arrayList, new Runnable() { // from class: o0o00oOo.OooOO0O
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                    StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o4, "NoteListFragment", "submitList: applying ");
                                    NoteListFragment.OooO00o oooO00o2 = oooO00o;
                                    sbOooO0O0.append(oooO00o2);
                                    c20358OooO00o4.OooO00o(sbOooO0O0.toString(), new Object[0]);
                                    int iOrdinal = oooO00o2.ordinal();
                                    if (iOrdinal == 0) {
                                        c20358OooO00o4.OooOOO0("NoteListFragment");
                                        c20358OooO00o4.OooO00o("PRESERVE: no scroll action", new Object[0]);
                                        return;
                                    }
                                    final NoteListFragment noteListFragment2 = noteListFragment;
                                    if (iOrdinal != 1) {
                                        if (iOrdinal != 2) {
                                            throw new C32442OooOO0o();
                                        }
                                        if (arrayList.isEmpty()) {
                                            return;
                                        }
                                        c20358OooO00o4.OooOOO0("NoteListFragment");
                                        c20358OooO00o4.OooO00o("RESET: scrolling to top", new Object[0]);
                                        RecyclerView recyclerView2 = noteListFragment2.f77018Oooo00O;
                                        if (recyclerView2 != null) {
                                            recyclerView2.scrollToPosition(0);
                                            return;
                                        } else {
                                            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                                            throw null;
                                        }
                                    }
                                    final OooO0OO.OooO0o oooO0oOooOOO0 = noteListFragment2.OooOoo().OooOOO0();
                                    if (oooO0oOooOOO0 == null) {
                                        c20358OooO00o4.OooOOO0("NoteListFragment");
                                        c20358OooO00o4.OooO00o("RESTORE: no saved position", new Object[0]);
                                        return;
                                    }
                                    c20358OooO00o4.OooOOO0("NoteListFragment");
                                    c20358OooO00o4.OooO00o("RESTORE: restoring saved position", new Object[0]);
                                    RecyclerView recyclerView3 = noteListFragment2.f77018Oooo00O;
                                    if (recyclerView3 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                                        throw null;
                                    }
                                    recyclerView3.post(new Runnable() { // from class: o0o00oOo.OooOOO
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            NoteListFragment noteListFragment3 = noteListFragment2;
                                            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o5.OooOOO0("NoteListFragment");
                                            OooO0OO.OooO0o oooO0o = oooO0oOooOOO0;
                                            StringBuilder sb = new StringBuilder("ScrollPos: restore position=");
                                            int i = oooO0o.f77198OooO00o;
                                            sb.append(i);
                                            sb.append(", offset=");
                                            int i2 = oooO0o.f77199OooO0O0;
                                            sb.append(i2);
                                            c20358OooO00o5.OooO00o(sb.toString(), new Object[0]);
                                            RecyclerView recyclerView4 = noteListFragment3.f77018Oooo00O;
                                            if (recyclerView4 == null) {
                                                kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                                                throw null;
                                            }
                                            RecyclerView.OooOOOO layoutManager2 = recyclerView4.getLayoutManager();
                                            kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                                            ((GridLayoutManager) layoutManager2).scrollToPositionWithOffset(i, i2);
                                        }
                                    });
                                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListFragment2.OooOoo();
                                    NoteVO noteVO3 = (NoteVO) ((C32443OooOOO) oooO0OOOooOoo.f77161OoooO00.getValue()).f116638OooOo0o;
                                    C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(oooO0OOOooOoo), null, null, new C30057Oooo0OO(oooO0OOOooOoo, noteVO3 != null ? noteVO3.getId() : null, null), 3);
                                }
                            });
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                if (((NoteVO) next).isImportedFromFileManager()) {
                                    break;
                                }
                            }
                            NoteVO noteVO3 = (NoteVO) next;
                            if (noteVO3 != null && (iIndexOf = arrayList.indexOf(noteVO3)) >= 0) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o4.OooOOO0("NoteListFragment");
                                c20358OooO00o4.OooO00o(androidx.core.app.OooO.OooO00o(iIndexOf, "scrollToPosition(", "): newlyImportNote ", noteVO3.getName()), new Object[0]);
                                RecyclerView recyclerView2 = noteListFragment.f77018Oooo00O;
                                if (recyclerView2 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                                    throw null;
                                }
                                recyclerView2.scrollToPosition(iIndexOf);
                                c20358OooO00o4.OooOOO0("NoteListFragment");
                                c20358OooO00o4.OooO00o(androidx.concurrent.futures.OooO00o.OooO0OO(C21009OooOooO.OooO0OO(iIndexOf, "index: ", ", newlyImportNote from file manager : ", noteVO3.getName(), ", id: "), noteVO3.getId(), "."), new Object[0]);
                            }
                            View view = noteListFragment.f77017Oooo000;
                            if (view != null) {
                                view.setVisibility(arrayList.isEmpty() ? 0 : 8);
                                return C32460OooOooO.f116667OooO00o;
                            }
                            kotlin.jvm.internal.OooOOO0.OooOOOO("emptyBackground");
                            throw null;
                        }
                        Object next2 = it.next();
                        NoteVO noteVO4 = (NoteVO) next2;
                        NoteVOFilter noteVOFilter = noteListFragment.f77014OooOooo;
                        if (noteVOFilter == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("filterVO");
                            throw null;
                        }
                        if (noteVOFilter.getFilterFunction().invoke(noteVO4).booleanValue()) {
                            arrayList.add(next2);
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(NoteListFragment noteListFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f77062OooOo = noteListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f77062OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77063OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteListFragment noteListFragment = this.f77062OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(noteListFragment, null);
                    this.f77063OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f77170Ooooo0o, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$11$4", m80623f = "NoteListFragment.kt", m80624l = {478}, m80625m = "invokeSuspend")
        public static final class C23624OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListFragment f77066OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77067OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO0Oo$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteListFragment f77068OooOo0o;

                public OooO00o(NoteListFragment noteListFragment) {
                    this.f77068OooOo0o = noteListFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    Map<String, Integer> newMap = (Map) obj;
                    C30035OooO0oO c30035OooO0oO = this.f77068OooOo0o.f77019Oooo00o;
                    if (c30035OooO0oO == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                        throw null;
                    }
                    kotlin.jvm.internal.OooOOO0.OooO0oO(newMap, "newMap");
                    Map<String, Integer> map = c30035OooO0oO.f106772OooO0o0;
                    c30035OooO0oO.f106772OooO0o0 = newMap;
                    List<T> list = c30035OooO0oO.f66021OooO00o.f65811OooO0o;
                    kotlin.jvm.internal.OooOOO0.OooO0o(list, "getCurrentList(...)");
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        String id = ((NoteVO) list.get(i)).getId();
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(map.get(id), newMap.get(id))) {
                            c30035OooO0oO.notifyItemChanged(i, "cloudSyncState");
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23624OooO0Oo(NoteListFragment noteListFragment, Continuation<? super C23624OooO0Oo> continuation) {
                super(2, continuation);
                this.f77066OooOo = noteListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23624OooO0Oo(this.f77066OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23624OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77067OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteListFragment noteListFragment = this.f77066OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(noteListFragment);
                    this.f77067OooOo0o = 1;
                    if (oooO0OOOooOoo.f77167OoooOoO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO0o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$11$6", m80623f = "NoteListFragment.kt", m80624l = {489}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListFragment f77069OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77070OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO0o$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$11$6$1", m80623f = "NoteListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31040OooOO0o>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ NoteListFragment f77071OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f77072OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(NoteListFragment noteListFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f77071OooOo = noteListFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f77071OooOo, continuation);
                    oooO00o.f77072OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C31040OooOO0o> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f77072OooOo0o;
                    o0o0O000.OooO0OO oooO0OO = this.f77071OooOo.f77024Oooo0oO;
                    if (oooO0OO != null) {
                        oooO0OO.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("folderColorAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(NoteListFragment noteListFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f77069OooOo = noteListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f77069OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77070OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteListFragment noteListFragment = this.f77069OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(noteListFragment, null);
                    this.f77070OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f77140OooOo0o, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO0o0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$11$5", m80623f = "NoteListFragment.kt", m80624l = {483}, m80625m = "invokeSuspend")
        public static final class C19402OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListFragment f77073OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77074OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO0o0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteListFragment f77075OooOo0o;

                public OooO00o(NoteListFragment noteListFragment) {
                    this.f77075OooOo0o = noteListFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    T next;
                    Iterator<T> it = ((List) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                        if (((SortKeyVO) next).getSelected()) {
                            break;
                        }
                    }
                    SortKeyVO sortKeyVO = next;
                    boolean z = (sortKeyVO != null ? sortKeyVO.getKey() : null) == com.orion.notein.p607ui.p609vo.OooO00o.f80092Oooo0;
                    C30051OooOooO c30051OooOooO = this.f77075OooOo0o.f77016Oooo0;
                    if (c30051OooOooO != null) {
                        c30051OooOooO.f106865OooOOO = z;
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("itemTouchCallback");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19402OooO0o0(NoteListFragment noteListFragment, Continuation<? super C19402OooO0o0> continuation) {
                super(2, continuation);
                this.f77073OooOo = noteListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19402OooO0o0(this.f77073OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19402OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77074OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteListFragment noteListFragment = this.f77073OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(noteListFragment);
                    this.f77074OooOo0o = 1;
                    if (oooO0OOOooOoo.f77159OoooO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$11$7", m80623f = "NoteListFragment.kt", m80624l = {497}, m80625m = "invokeSuspend")
        public static final class C23625OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListFragment f77076OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77077OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO0oO$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ NoteListFragment f77078OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ C24034Oooo00O<NoteVO> f77079OooOo0o;

                public OooO00o(C24034Oooo00O<NoteVO> c24034Oooo00O, NoteListFragment noteListFragment) {
                    this.f77079OooOo0o = c24034Oooo00O;
                    this.f77078OooOo = noteListFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v3, types: [T, com.orion.notein.ui.vo.NoteVO] */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    NoteListFragment noteListFragment;
                    RecyclerView recyclerView;
                    OooO0OO.OooO0o oooO0oOooOooO;
                    ?? r11 = (T) ((NoteVO) ((C32443OooOOO) obj).f116638OooOo0o);
                    C24034Oooo00O<NoteVO> c24034Oooo00O = this.f77079OooOo0o;
                    NoteVO noteVO = c24034Oooo00O.f80942OooOo0o;
                    String id = noteVO != null ? noteVO.getId() : null;
                    String id2 = r11 != 0 ? r11.getId() : null;
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(id, id2) && (recyclerView = (noteListFragment = this.f77078OooOo).f77018Oooo00O) != null && recyclerView.getLayoutManager() != null && (oooO0oOooOooO = noteListFragment.OooOooO()) != null) {
                        noteListFragment.OooOoo().f77143OooOoOO.put(id, oooO0oOooOooO);
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("NoteListViewModel");
                        c20358OooO00o.OooO00o("ScrollPos: saveForFolder " + oooO0oOooOooO + " for " + id, new Object[0]);
                        c20358OooO00o.OooOOO0("NoteListFragment");
                        NoteVO noteVO2 = c24034Oooo00O.f80942OooOo0o;
                        String name = noteVO2 != null ? noteVO2.getName() : null;
                        String name2 = r11 != 0 ? r11.getName() : null;
                        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("ScrollPos: changed from ", name, C18241k5.f55433h, id, " to ");
                        OooOO0.OooO0OO.OooO0o0(sbOooO0O0, name2, C18241k5.f55433h, id2, ", saved ");
                        sbOooO0O0.append(oooO0oOooOooO);
                        c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
                    }
                    c24034Oooo00O.f80942OooOo0o = r11;
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23625OooO0oO(NoteListFragment noteListFragment, Continuation<? super C23625OooO0oO> continuation) {
                super(2, continuation);
                this.f77076OooOo = noteListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23625OooO0oO(this.f77076OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23625OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77077OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                NoteListFragment noteListFragment = this.f77076OooOo;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListFragment.OooOoo();
                OooO00o oooO00o = new OooO00o(c24034Oooo00O, noteListFragment);
                this.f77077OooOo0o = 1;
                oooO0OOOooOoo.f77161OoooO00.collect(oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO0oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$11$8", m80623f = "NoteListFragment.kt", m80624l = {515}, m80625m = "invokeSuspend")
        public static final class C23626OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListFragment f77080OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77081OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0o0$OooO0oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$11$8$1", m80623f = "NoteListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ NoteListFragment f77082OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f77083OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(NoteListFragment noteListFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f77082OooOo = noteListFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f77082OooOo, continuation);
                    oooO00o.f77083OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(bool, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    Boolean bool = (Boolean) this.f77083OooOo0o;
                    if (bool == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    NoteListFragment noteListFragment = this.f77082OooOo;
                    if (zBooleanValue) {
                        RecyclerView recyclerView = noteListFragment.f77018Oooo00O;
                        if (recyclerView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                            throw null;
                        }
                        recyclerView.addItemDecoration(noteListFragment.f77026OoooO0);
                    } else {
                        RecyclerView recyclerView2 = noteListFragment.f77018Oooo00O;
                        if (recyclerView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                            throw null;
                        }
                        recyclerView2.removeItemDecoration(noteListFragment.f77026OoooO0);
                    }
                    RecyclerView recyclerView3 = noteListFragment.f77018Oooo00O;
                    if (recyclerView3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                        throw null;
                    }
                    recyclerView3.setVisibility(0);
                    C30051OooOooO c30051OooOooO = noteListFragment.f77016Oooo0;
                    if (c30051OooOooO == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("itemTouchCallback");
                        throw null;
                    }
                    c30051OooOooO.f106860OooO0oO = bool.booleanValue();
                    C30035OooO0oO c30035OooO0oO = noteListFragment.f77019Oooo00o;
                    if (c30035OooO0oO == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                        throw null;
                    }
                    if (Boolean.valueOf(c30035OooO0oO.f106771OooO0Oo).equals(bool)) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C30035OooO0oO c30035OooO0oO2 = noteListFragment.f77019Oooo00o;
                    if (c30035OooO0oO2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                        throw null;
                    }
                    c30035OooO0oO2.f106771OooO0Oo = bool.booleanValue();
                    C30035OooO0oO c30035OooO0oO3 = noteListFragment.f77019Oooo00o;
                    if (c30035OooO0oO3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
                        throw null;
                    }
                    c30035OooO0oO3.notifyDataSetChanged();
                    noteListFragment.OooOooo();
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23626OooO0oo(NoteListFragment noteListFragment, Continuation<? super C23626OooO0oo> continuation) {
                super(2, continuation);
                this.f77080OooOo = noteListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23626OooO0oo(this.f77080OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23626OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77081OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteListFragment noteListFragment = this.f77080OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(noteListFragment, null);
                    this.f77081OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f77164OoooOOO, oooO00o, this) == enumC32485OooO00o) {
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

        public C23623OooO0o0(Continuation<? super C23623OooO0o0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C23623OooO0o0 c23623OooO0o0 = NoteListFragment.this.new C23623OooO0o0(continuation);
            c23623OooO0o0.f77049OooOo0o = obj;
            return c23623OooO0o0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23623OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f77049OooOo0o;
            NoteListFragment noteListFragment = NoteListFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(noteListFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(noteListFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(noteListFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23624OooO0Oo(noteListFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19402OooO0o0(noteListFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(noteListFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23625OooO0oO(noteListFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23626OooO0oo(noteListFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO(noteListFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$4$3", m80623f = "NoteListFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_4_ACCENT_1}, m80625m = "invokeSuspend")
    public static final class C23627OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77085OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteVO f77086OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23627OooO0oO(NoteVO noteVO, Continuation<? super C23627OooO0oO> continuation) {
            super(2, continuation);
            this.f77086OooOoO0 = noteVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteListFragment.this.new C23627OooO0oO(this.f77086OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23627OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77085OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = NoteListFragment.this.OooOoo();
                this.f77085OooOo0o = 1;
                if (oooO0OOOooOoo.OooOo0(this.f77086OooOoO0, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$4$4", m80623f = "NoteListFragment.kt", m80624l = {304, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4}, m80625m = "invokeSuspend")
    public static final class C23628OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77088OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteVO f77089OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooO0oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListFragment$onViewCreated$4$4$1", m80623f = "NoteListFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteListFragment f77090OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteListFragment noteListFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77090OooOo0o = noteListFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f77090OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                Fragment parentFragment = this.f77090OooOo0o.getParentFragment();
                kotlin.jvm.internal.OooOOO0.OooO0o0(parentFragment, "null cannot be cast to non-null type com.orion.notein.ui.notelist.documents.NoteListContainerFragment");
                ((NoteListContainerFragment) parentFragment).Oooo000();
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23628OooO0oo(NoteVO noteVO, Continuation<? super C23628OooO0oo> continuation) {
            super(2, continuation);
            this.f77089OooOoO0 = noteVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteListFragment.this.new C23628OooO0oo(this.f77089OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23628OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (oO0o0OO.C33609OooO0oo.OooO0o(r6, r1, r5) == r0) goto L15;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77088OooOo0o;
            NoteListFragment noteListFragment = NoteListFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListFragment.OooOoo();
                this.f77088OooOo0o = 1;
                if (oooO0OOOooOoo.OooOoO0(this.f77089OooOoO0, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
            OooO00o oooO00o = new OooO00o(noteListFragment, null);
            this.f77088OooOo0o = 2;
        }
    }

    public static final class OooOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooOO0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return NoteListFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooOO0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooOO0O() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return NoteListFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23629OooOO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23629OooOO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return NoteListFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooOOO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return NoteListFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooOOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooOOO0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return NoteListFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooOOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooOOOO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return NoteListFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooOOOo, reason: case insensitive filesystem */
    public static final class C23630OooOOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23630OooOOOo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return NoteListFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.NoteListFragment$OooOOo0, reason: case insensitive filesystem */
    public static final class C23631OooOOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23631OooOOo0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return NoteListFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public NoteListFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f77012OooOoo0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.notelist.OooO0OO.class), new OooO(), new OooOO0O(), new OooOO0());
        this.f77011OooOoo = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new C23629OooOO0o(), new OooOOO(), new OooOOO0());
        this.f77013OooOooO = new C22026ooOO(oooo0.OooO0O0(C28201OooooO0.class), new OooOOOO(), new C23631OooOOo0(), new C23630OooOOOo());
        this.f77026OoooO0 = new C30031OooO0OO(o000000O.OooO0o(300));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO(NoteListFragment noteListFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30048OooOoOO c30048OooOoOO;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C30048OooOoOO) {
            c30048OooOoOO = (C30048OooOoOO) abstractC32479OooO0OO;
            int i2 = c30048OooOoOO.f106851OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30048OooOoOO.f106851OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c30048OooOoOO = new C30048OooOoOO(noteListFragment, abstractC32479OooO0OO);
            }
        }
        C30048OooOoOO c30048OooOoOO2 = c30048OooOoOO;
        Object objShowNonVipFeatureLimitedDialog$default = c30048OooOoOO2.f106850OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30048OooOoOO2.f106851OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = noteListFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30048OooOoOO2.f106851OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c30048OooOoOO2, 6, null);
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

    public final int OooOoOO(Context context) {
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(OooOoo().f77164OoooOOO.f121747OooOo0o.getValue(), Boolean.TRUE)) {
            return 1;
        }
        return Math.max(1, (context.getResources().getConfiguration().screenWidthDp - 56) / 138);
    }

    public final com.orion.notein.p607ui.notelist.OooO0OO OooOoo() {
        return (com.orion.notein.p607ui.notelist.OooO0OO) this.f77012OooOoo0.getValue();
    }

    public final LockNoteFragment OooOoo0() {
        Fragment fragmentOooOooo = getChildFragmentManager().OooOooo("LockNoteFragment");
        if (fragmentOooOooo != null) {
            return (LockNoteFragment) fragmentOooOooo;
        }
        LockNoteFragment lockNoteFragment = new LockNoteFragment();
        FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(childFragmentManager, childFragmentManager);
        oooO00oOooO0OO.OooO0Oo(0, lockNoteFragment, "LockNoteFragment", 1);
        oooO00oOooO0OO.OooOO0O();
        return lockNoteFragment;
    }

    public final OooO0OO.OooO0o OooOooO() {
        RecyclerView recyclerView = this.f77018Oooo00O;
        if (recyclerView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
            throw null;
        }
        RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1) {
            return null;
        }
        View viewFindViewByPosition = gridLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        int top = viewFindViewByPosition != null ? viewFindViewByPosition.getTop() : 0;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o, "NoteListFragment", "ScrollPos: save position=", iFindFirstVisibleItemPosition, ", offset=");
        sbOooO00o.append(top);
        c20358OooO00o.OooO00o(sbOooO00o.toString(), new Object[0]);
        return new OooO0OO.OooO0o(iFindFirstVisibleItemPosition, top);
    }

    public final void OooOooo() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        RecyclerView recyclerView = this.f77018Oooo00O;
        if (recyclerView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
            throw null;
        }
        RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int iOooOoOO = OooOoOO(context);
        if (gridLayoutManager.f65751OooOo != iOooOoOO) {
            RecyclerView recyclerView2 = this.f77018Oooo00O;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
                throw null;
            }
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(requireContext(), iOooOoOO);
            gridLayoutManager2.scrollToPosition(gridLayoutManager.findFirstVisibleItemPosition());
            recyclerView2.setLayoutManager(gridLayoutManager2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_note_list, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Oooo0O0.OooOO0.OooO00o(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        OooOooo();
        requireActivity().getSupportFragmentManager().Oooooo0("rename", this, new C22568OooOOo0(this));
        requireActivity().getSupportFragmentManager().Oooooo0("pdf_password", this, new InterfaceC21912Oooo0o() { // from class: o0o00oOo.OooOOo
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                String string = bundle.getString("id");
                if (string == null) {
                    string = "";
                }
                String string2 = bundle.getString("password");
                Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO("password", string2 != null ? string2 : ""));
                NoteListFragment noteListFragment = this.f106817OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = noteListFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, noteListFragment.new OooO0OO(string, bundleBundleOf, null), 3);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        Bundle arguments = getArguments();
        if (arguments == null) {
            this.f77014OooOooo = new NoteVOFilter(0, "All");
        } else {
            if (!arguments.containsKey("filter")) {
                arguments = null;
            }
            if (arguments != null) {
                Serializable serializable = arguments.getSerializable("filter");
                kotlin.jvm.internal.OooOOO0.OooO0o0(serializable, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVOFilter");
                this.f77014OooOooo = (NoteVOFilter) serializable;
            }
        }
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f77020Oooo0O0 = new com.orion.notein.p607ui.notelist.OooO00o(contextRequireContext, new com.orion.notein.p607ui.notelist.OooO0O0(this));
        C30201OooOOO0 c30201OooOOO0 = new C30201OooOOO0(this, new oO0O000o.OooO00o() { // from class: o0o00oOo.OooOOoo
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                return this.f106819OooOo0o.OooOoo0();
            }
        }, OooOoo(), (C28201OooooO0) this.f77013OooOooO.getValue());
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
        this.f77021Oooo0OO = new o0o0O0.OooO(contextRequireContext2, c30201OooOOO0);
        Context contextRequireContext3 = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext3, "requireContext(...)");
        this.f77023Oooo0o0 = new C30082o00000Oo(contextRequireContext3, new ViewOnClickListenerC28702OooOOoo(this, 3));
        kotlin.jvm.internal.OooOOO0.OooO0o(requireContext(), "requireContext(...)");
        new AtomicBoolean(false);
        this.f77017Oooo000 = view.findViewById(R.id.empty_bg_wrapper);
        this.f77018Oooo00O = (RecyclerView) view.findViewById(R.id.item_list);
        C30035OooO0oO c30035OooO0oO = new C30035OooO0oO();
        this.f77019Oooo00o = c30035OooO0oO;
        c30035OooO0oO.f106769OooO0O0 = new ViewOnClickListenerC28181Oooo00O(this, 2);
        c30035OooO0oO.f106770OooO0OO = new View.OnContextClickListener() { // from class: o0o00oOo.OooOOOO
            @Override // android.view.View.OnContextClickListener
            public final boolean onContextClick(View view2) {
                Object tag = view2.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                NoteVO noteVO = (NoteVO) tag;
                if (noteVO.getInSelectMode()) {
                    return false;
                }
                int type = noteVO.getType();
                NoteListFragment noteListFragment = this.f106815OooO00o;
                if (type == 0 || type == 1) {
                    o0o0O0.OooO oooO = noteListFragment.f77021Oooo0OO;
                    if (oooO == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                        throw null;
                    }
                    if (oooO.OooO0O0()) {
                        o0o0O0.OooO oooO2 = noteListFragment.f77021Oooo0OO;
                        if (oooO2 != null) {
                            oooO2.OooO00o();
                            return true;
                        }
                        kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                        throw null;
                    }
                    o0o0O0.OooO oooO3 = noteListFragment.f77021Oooo0OO;
                    if (oooO3 != null) {
                        oooO3.OooO0OO(view2, noteVO);
                        return true;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                    throw null;
                }
                if (type != 3) {
                    return false;
                }
                C30082o00000Oo c30082o00000Oo = noteListFragment.f77023Oooo0o0;
                if (c30082o00000Oo == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("notePlaceholderItemMoreMenu");
                    throw null;
                }
                if (c30082o00000Oo.OooO0OO()) {
                    C30082o00000Oo c30082o00000Oo2 = noteListFragment.f77023Oooo0o0;
                    if (c30082o00000Oo2 != null) {
                        c30082o00000Oo2.OooO00o();
                        return true;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("notePlaceholderItemMoreMenu");
                    throw null;
                }
                C30082o00000Oo c30082o00000Oo3 = noteListFragment.f77023Oooo0o0;
                if (c30082o00000Oo3 != null) {
                    c30082o00000Oo3.OooO0Oo(view2, noteVO);
                    return true;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("notePlaceholderItemMoreMenu");
                throw null;
            }
        };
        RecyclerView recyclerView = this.f77018Oooo00O;
        if (recyclerView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
            throw null;
        }
        Context context = recyclerView.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), OooOoOO(context)));
        C30035OooO0oO c30035OooO0oO2 = this.f77019Oooo00o;
        if (c30035OooO0oO2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteAdapter");
            throw null;
        }
        recyclerView.setAdapter(c30035OooO0oO2);
        recyclerView.setItemAnimator(null);
        C30051OooOooO c30051OooOooO = new C30051OooOooO();
        this.f77016Oooo0 = c30051OooOooO;
        c30051OooOooO.f106859OooO0o0 = new InterfaceC32510OooOOo0() { // from class: o0o00oOo.OooOOOo
            /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
            @Override // oO0O000o.InterfaceC32510OooOOo0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Object next;
                NoteVO src = (NoteVO) obj;
                NoteVO dst = (NoteVO) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO(src, "src");
                kotlin.jvm.internal.OooOOO0.OooO0oO(dst, "dst");
                NoteListFragment noteListFragment = this.f106816OooOo0o;
                int type = dst.getType();
                if (type != 0) {
                    if (type == 1) {
                        InterfaceC21987OooOoo viewLifecycleOwner = noteListFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30045OooOo0o(noteListFragment, src, dst, null, zBooleanValue), 3);
                    }
                } else if (zBooleanValue) {
                    Iterator it = ((Iterable) noteListFragment.OooOoo().f77172OooooOO.f121747OooOo0o.getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((NoteVO) next).getType() != 0) {
                            break;
                        }
                    }
                    if (next != null) {
                        Context contextRequireContext4 = noteListFragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext4, "requireContext(...)");
                        String string = noteListFragment.getString(R.string.unsupported_operation);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0Oo(contextRequireContext4, string);
                    } else {
                        InterfaceC21987OooOoo viewLifecycleOwner2 = noteListFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner2);
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooOo(noteListFragment, dst, src, null, zBooleanValue), 2);
                    }
                } else if (src.getType() != 0) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
        };
        c30051OooOooO.f106858OooO0o = new InterfaceC32510OooOOo0() { // from class: o0o00oOo.OooOOo0
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                NoteVO src = (NoteVO) obj;
                NoteVO noteVO = (NoteVO) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO(src, "src");
                NoteListFragment noteListFragment = this.f106818OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = noteListFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30047OooOoO0(noteListFragment, noteVO, src, null, zBooleanValue), 2);
                return C32460OooOooO.f116667OooO00o;
            }
        };
        C22041OooOOo c22041OooOOo = new C22041OooOOo(c30051OooOooO);
        RecyclerView recyclerView2 = this.f77018Oooo00O;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteList");
            throw null;
        }
        c22041OooOOo.OooO0o(recyclerView2);
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.rv_folder_color_list);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(recyclerView3);
        NoteVOFilter noteVOFilter = this.f77014OooOooo;
        if (noteVOFilter == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("filterVO");
            throw null;
        }
        recyclerView3.setVisibility(noteVOFilter.getIndex() != C30214OooOoOO.f107602OooO0oO.getIndex() ? 8 : 0);
        this.f77022Oooo0o = recyclerView3;
        o0o0O000.OooO0OO oooO0OO = new o0o0O000.OooO0OO(R.layout.item_list_folder_color);
        oooO0OO.f107632OooO0OO = new ViewOnClickListenerC26282Oooo(this, 3);
        this.f77024Oooo0oO = oooO0OO;
        RecyclerView recyclerView4 = this.f77022Oooo0o;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("folderColorList");
            throw null;
        }
        recyclerView4.setAdapter(oooO0OO);
        this.f77025Oooo0oo = (ImageView) view.findViewById(R.id.empty_bg);
        this.f77015Oooo = (TextView) view.findViewById(R.id.tv_no_notes);
        this.f77027OoooO00 = (TextView) view.findViewById(R.id.txt_empty_tips);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C23623OooO0o0(null), 3);
    }
}
