package com.orion.notein.p607ui.noteeditor.toolbar;

import OooO0o.C20424OooO0Oo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.domain.models.note.AudioSyncRecord;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.OooO0OO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.ViewOnClickListenerC26348o000oOoO;
import o0Oo0O0.C28050OooO0OO;
import o0OoOOo.C29164Oooo0oO;
import o0OoOo.C29194OooO00o;
import o0OoOo.C29196OooO0OO;
import o0OoOo.C29197OooO0Oo;
import o0o000oo.o000oOoO;
import o0o000oo.o00Ooo;
import o0o00Oo0.C29908OooO00o;
import o0o00Oo0.C29909OooO0O0;
import o0ooOOoo.InterfaceC31661OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbar/ImmersiveToolbarChildFragment;", "Lcom/orion/notein/ui/noteeditor/toolbar/BaseToolbarChildFragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImmersiveToolbarChildFragment extends Hilt_ImmersiveToolbarChildFragment {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public final OooO00o f76668OoooooO = new OooO00o();

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public ViewGroup f76669Ooooooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public View f76670o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public ImageView f76671ooOO;

    public final class OooO00o extends Handler {
        public OooO00o() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message msg) {
            OooOOO0.OooO0oO(msg, "msg");
            if (msg.what == 0) {
                Object obj = msg.obj;
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Boolean");
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                ImmersiveToolbarChildFragment immersiveToolbarChildFragment = ImmersiveToolbarChildFragment.this;
                if (!zBooleanValue) {
                    immersiveToolbarChildFragment.OooooOO(31, C34434OooOoO.f123453OooOo0o);
                    return;
                }
                C29194OooO00o c29194OooO00o = (C29194OooO00o) immersiveToolbarChildFragment.Oooo000().f74239OooOo00.f121747OooOo0o.getValue();
                if (c29194OooO00o != null && c29194OooO00o.f103550OooO0oO) {
                    Iterable iterable = (Iterable) immersiveToolbarChildFragment.Oooo000().f74243OooOoO0.f121747OooOo0o.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : iterable) {
                        if (((AudioSyncRecord) obj2).getAudioPosition() >= c29194OooO00o.f103546OooO0OO) {
                            arrayList.add(obj2);
                        }
                    }
                    immersiveToolbarChildFragment.OooooOO(31, arrayList);
                }
                sendMessageDelayed(Message.obtain(this, 0, bool), 100L);
            }
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ ImmersiveToolbarChildFragment f76673OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f76674OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ View f76675OooOoO0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$9", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {133}, m80625m = "invokeSuspend")
        public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImmersiveToolbarChildFragment f76676OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76677OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$9$1", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteMeta, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ImmersiveToolbarChildFragment f76678OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76678OooOo0o = immersiveToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO00o(this.f76678OooOo0o, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(NoteMeta noteMeta, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(noteMeta, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    this.f76678OooOo0o.o0OoOo0();
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO(ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation<? super OooO> continuation) {
                super(2, continuation);
                this.f76676OooOo = immersiveToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO(this.f76676OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76677OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImmersiveToolbarChildFragment immersiveToolbarChildFragment = this.f76676OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = immersiveToolbarChildFragment.Oooo0OO();
                    OooO00o oooO00o = new OooO00o(immersiveToolbarChildFragment, null);
                    this.f76677OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(Oooo0OO2.f73395OoooOo0, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$1", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {70}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImmersiveToolbarChildFragment f76679OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76680OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$1$1", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19391OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<OooO0OO.OooO00o, List<? extends C29908OooO00o>, Continuation<? super C32460OooOooO>, Object> {
                @Override // oO0O000o.InterfaceC32510OooOOo0
                public final Object invoke(OooO0OO.OooO00o oooO00o, List<? extends C29908OooO00o> list, Continuation<? super C32460OooOooO> continuation) {
                    return new C19391OooO00o(3, continuation).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$OooO0O0$OooO00o$OooO0O0, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$1$2", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19392OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32460OooOooO, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ImmersiveToolbarChildFragment f76681OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19392OooO0O0(ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation<? super C19392OooO0O0> continuation) {
                    super(2, continuation);
                    this.f76681OooOo0o = immersiveToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19392OooO0O0(this.f76681OooOo0o, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32460OooOooO c32460OooOooO, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19392OooO0O0) create(c32460OooOooO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    ImmersiveToolbarChildFragment immersiveToolbarChildFragment = this.f76681OooOo0o;
                    if (immersiveToolbarChildFragment.Oooo0OO().f73422o00Ooo.f121747OooOo0o.getValue() == OooO0OO.OooO00o.f73444OooOoOO) {
                        immersiveToolbarChildFragment.Oooo000().Oooo0();
                    }
                    immersiveToolbarChildFragment.o0OoOo0();
                    ImmersiveToolbarChildFragment.Ooooooo(immersiveToolbarChildFragment);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f76679OooOo = immersiveToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f76679OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76680OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImmersiveToolbarChildFragment immersiveToolbarChildFragment = this.f76679OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = immersiveToolbarChildFragment.Oooo0OO();
                    o00Ooo o00oooOooo0oo = immersiveToolbarChildFragment.Oooo0oo();
                    InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(new C33763OoooOOO(Oooo0OO2.f73422o00Ooo, o00oooOooo0oo.f105940OooOo00, new C19391OooO00o(3, null)), 200L);
                    C19392OooO0O0 c19392OooO0O0 = new C19392OooO0O0(immersiveToolbarChildFragment, null);
                    this.f76680OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(interfaceC33721OooO0oOooOO0O, c19392OooO0O0, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$2", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {82}, m80625m = "invokeSuspend")
        public static final class C19393OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImmersiveToolbarChildFragment f76682OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76683OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ View f76684OooOoO0;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$OooO0O0$OooO0O0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$2$1", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ View f76685OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f76686OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ ImmersiveToolbarChildFragment f76687OooOoO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(View view, ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76685OooOo = view;
                    this.f76687OooOoO0 = immersiveToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76685OooOo, this.f76687OooOoO0, continuation);
                    oooO00o.f76686OooOo0o = ((Boolean) obj).booleanValue();
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
                    this.f76685OooOo.setVisibility(!this.f76686OooOo0o ? 0 : 8);
                    RecyclerView.AbstractC22062OooO0oO adapter = this.f76687OooOoO0.Oooo0o().getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19393OooO0O0(View view, ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation continuation) {
                super(2, continuation);
                this.f76682OooOo = immersiveToolbarChildFragment;
                this.f76684OooOoO0 = view;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19393OooO0O0(this.f76684OooOoO0, this.f76682OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19393OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76683OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImmersiveToolbarChildFragment immersiveToolbarChildFragment = this.f76682OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = immersiveToolbarChildFragment.Oooo0OO();
                    OooO00o oooO00o = new OooO00o(this.f76684OooOoO0, immersiveToolbarChildFragment, null);
                    this.f76683OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(Oooo0OO2.f73423o00o0O, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$3", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {89}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImmersiveToolbarChildFragment f76688OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76689OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$3$1", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ ImmersiveToolbarChildFragment f76690OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76691OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76690OooOo = immersiveToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76690OooOo, continuation);
                    oooO00o.f76691OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    String noteId = (String) this.f76691OooOo0o;
                    com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo000 = this.f76690OooOo.Oooo000();
                    OooOOO0.OooO0oO(noteId, "noteId");
                    C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0oOooo000), null, null, new C29164Oooo0oO(oooO0oOooo000, noteId, null), 3);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f76688OooOo = immersiveToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f76688OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76689OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImmersiveToolbarChildFragment immersiveToolbarChildFragment = this.f76688OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = immersiveToolbarChildFragment.Oooo0OO();
                    OooO00o oooO00o = new OooO00o(immersiveToolbarChildFragment, null);
                    this.f76689OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(Oooo0OO2.f73397OoooOoo, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$OooO0O0$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$4", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {95}, m80625m = "invokeSuspend")
        public static final class C23602OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImmersiveToolbarChildFragment f76692OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76693OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$OooO0O0$OooO0Oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$4$1", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29196OooO0OO>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ ImmersiveToolbarChildFragment f76694OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76695OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76694OooOo = immersiveToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76694OooOo, continuation);
                    oooO00o.f76695OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C29196OooO0OO> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List<C29196OooO0OO> list = (List) this.f76695OooOo0o;
                    ImmersiveToolbarChildFragment immersiveToolbarChildFragment = this.f76694OooOo;
                    if (immersiveToolbarChildFragment.f76496OoooOO0.containsKey(new Integer(8))) {
                        InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) C20424OooO0Oo.OooO0Oo(8, immersiveToolbarChildFragment.f76496OoooOO0);
                        Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                        InterfaceC31661OooO0oO interfaceC31661OooO0oO = value instanceof InterfaceC31661OooO0oO ? (InterfaceC31661OooO0oO) value : null;
                        C29194OooO00o c29194OooO00o = (C29194OooO00o) immersiveToolbarChildFragment.Oooo000().f74239OooOo00.f121747OooOo0o.getValue();
                        if (interfaceC31661OooO0oO != null) {
                            interfaceC31661OooO0oO.OooOOoo(list, c29194OooO00o, true);
                        }
                    }
                    ImmersiveToolbarChildFragment.Ooooooo(immersiveToolbarChildFragment);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23602OooO0Oo(ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation<? super C23602OooO0Oo> continuation) {
                super(2, continuation);
                this.f76692OooOo = immersiveToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23602OooO0Oo(this.f76692OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23602OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76693OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImmersiveToolbarChildFragment immersiveToolbarChildFragment = this.f76692OooOo;
                    com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo000 = immersiveToolbarChildFragment.Oooo000();
                    OooO00o oooO00o = new OooO00o(immersiveToolbarChildFragment, null);
                    this.f76693OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0oOooo000.f74248OooOooo, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$6", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {117}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImmersiveToolbarChildFragment f76696OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76697OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$6$1", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C29194OooO00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ ImmersiveToolbarChildFragment f76698OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76699OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76698OooOo = immersiveToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76698OooOo, continuation);
                    oooO00o.f76699OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C29194OooO00o c29194OooO00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c29194OooO00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C29194OooO00o c29194OooO00o = (C29194OooO00o) this.f76699OooOo0o;
                    ImmersiveToolbarChildFragment immersiveToolbarChildFragment = this.f76698OooOo;
                    List<C29196OooO0OO> list = (List) immersiveToolbarChildFragment.Oooo000().f74248OooOooo.f121747OooOo0o.getValue();
                    LinkedHashMap linkedHashMap = immersiveToolbarChildFragment.f76496OoooOO0;
                    if (linkedHashMap.containsKey(8)) {
                        InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) linkedHashMap.get(8);
                        Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                        InterfaceC31661OooO0oO interfaceC31661OooO0oO = value instanceof InterfaceC31661OooO0oO ? (InterfaceC31661OooO0oO) value : null;
                        if (interfaceC31661OooO0oO != null) {
                            interfaceC31661OooO0oO.OooOOoo(list, c29194OooO00o, false);
                        }
                    }
                    if (c29194OooO00o == null || c29194OooO00o.f103551OooO0oo) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("ImmersiveToolbarChildFragment");
                        c20358OooO00o.OooO00o("onActiveAudioFileChanged: vo is null or has error", new Object[0]);
                    } else {
                        OooO00o oooO00o = immersiveToolbarChildFragment.f76668OoooooO;
                        if (!c29194OooO00o.f103550OooO0oO) {
                            oooO00o.removeCallbacksAndMessages(null);
                            oooO00o.sendMessage(Message.obtain(oooO00o, 0, Boolean.FALSE));
                        } else if (!oooO00o.hasMessages(0)) {
                            oooO00o.sendMessage(Message.obtain(oooO00o, 0, Boolean.TRUE));
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f76696OooOo = immersiveToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f76696OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76697OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImmersiveToolbarChildFragment immersiveToolbarChildFragment = this.f76696OooOo;
                    com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo000 = immersiveToolbarChildFragment.Oooo000();
                    OooO00o oooO00o = new OooO00o(immersiveToolbarChildFragment, null);
                    this.f76697OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0oOooo000.f74239OooOo00, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$5", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {107}, m80625m = "invokeSuspend")
        public static final class OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImmersiveToolbarChildFragment f76700OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76701OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$5$1", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29197OooO0Oo>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ ImmersiveToolbarChildFragment f76702OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76703OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76702OooOo = immersiveToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76702OooOo, continuation);
                    oooO00o.f76703OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C29197OooO0Oo> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List<C29197OooO0Oo> list = (List) this.f76703OooOo0o;
                    ImmersiveToolbarChildFragment immersiveToolbarChildFragment = this.f76702OooOo;
                    if (immersiveToolbarChildFragment.f76496OoooOO0.containsKey(new Integer(8))) {
                        InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) C20424OooO0Oo.OooO0Oo(8, immersiveToolbarChildFragment.f76496OoooOO0);
                        Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                        InterfaceC31661OooO0oO interfaceC31661OooO0oO = value instanceof InterfaceC31661OooO0oO ? (InterfaceC31661OooO0oO) value : null;
                        if (interfaceC31661OooO0oO != null) {
                            interfaceC31661OooO0oO.OooO0Oo(list);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o0(ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation<? super OooO0o0> continuation) {
                super(2, continuation);
                this.f76700OooOo = immersiveToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o0(this.f76700OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76701OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImmersiveToolbarChildFragment immersiveToolbarChildFragment = this.f76700OooOo;
                    com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo000 = immersiveToolbarChildFragment.Oooo000();
                    OooO00o oooO00o = new OooO00o(immersiveToolbarChildFragment, null);
                    this.f76701OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0oOooo000.f74244OooOoOO, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$OooO0O0$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$7", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {123}, m80625m = "invokeSuspend")
        public static final class C23603OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImmersiveToolbarChildFragment f76704OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76705OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$OooO0O0$OooO0oO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$7$1", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends AudioSyncRecord>, Continuation<? super C32460OooOooO>, Object> {
                public OooO00o() {
                    throw null;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO00o(2, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends AudioSyncRecord> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23603OooO0oO(ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation<? super C23603OooO0oO> continuation) {
                super(2, continuation);
                this.f76704OooOo = immersiveToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23603OooO0oO(this.f76704OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23603OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76705OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo000 = this.f76704OooOo.Oooo000();
                    OooO00o oooO00o = new OooO00o(2, null);
                    this.f76705OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0oOooo000.f74243OooOoO0, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$OooO0O0$OooO0oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$8", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {127}, m80625m = "invokeSuspend")
        public static final class C23604OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ImmersiveToolbarChildFragment f76706OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76707OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$OooO0O0$OooO0oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ImmersiveToolbarChildFragment$initViews$1$8$1", m80623f = "ImmersiveToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ImmersiveToolbarChildFragment f76708OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76708OooOo0o = immersiveToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO00o(this.f76708OooOo0o, continuation);
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
                    ImmersiveToolbarChildFragment.Ooooooo(this.f76708OooOo0o);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23604OooO0oo(ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation<? super C23604OooO0oo> continuation) {
                super(2, continuation);
                this.f76706OooOo = immersiveToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23604OooO0oo(this.f76706OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23604OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76707OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ImmersiveToolbarChildFragment immersiveToolbarChildFragment = this.f76706OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = immersiveToolbarChildFragment.Oooo0OO();
                    OooO00o oooO00o = new OooO00o(immersiveToolbarChildFragment, null);
                    this.f76707OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(Oooo0OO2.f73424o00oO0O, oooO00o, this) == enumC32485OooO00o) {
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
        public OooO0O0(View view, ImmersiveToolbarChildFragment immersiveToolbarChildFragment, Continuation continuation) {
            super(2, continuation);
            this.f76673OooOo = immersiveToolbarChildFragment;
            this.f76675OooOoO0 = view;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f76675OooOoO0, this.f76673OooOo, continuation);
            oooO0O0.f76674OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f76674OooOo0o;
            ImmersiveToolbarChildFragment immersiveToolbarChildFragment = this.f76673OooOo;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(immersiveToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19393OooO0O0(this.f76675OooOoO0, immersiveToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(immersiveToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23602OooO0Oo(immersiveToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o0(immersiveToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(immersiveToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23603OooO0oO(immersiveToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23604OooO0oo(immersiveToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO(immersiveToolbarChildFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void Ooooooo(ImmersiveToolbarChildFragment immersiveToolbarChildFragment) {
        boolean z;
        boolean z2 = true;
        boolean z3 = immersiveToolbarChildFragment.Oooo0OO().f73422o00Ooo.f121747OooOo0o.getValue() == OooO0OO.OooO00o.f73444OooOoOO;
        List list = (List) immersiveToolbarChildFragment.Oooo000().f74248OooOooo.f121747OooOo0o.getValue();
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z = false;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((C29196OooO0OO) it.next()).f103561OooO0o0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        boolean zBooleanValue = ((Boolean) immersiveToolbarChildFragment.Oooo0OO().f73424o00oO0O.f121747OooOo0o.getValue()).booleanValue();
        ImageView imageView = immersiveToolbarChildFragment.f76671ooOO;
        if (imageView == null) {
            OooOOO0.OooOOOO("btnPlayAudio");
            throw null;
        }
        imageView.setVisibility((!z3 || list.isEmpty()) ? 8 : 0);
        ImageView imageView2 = immersiveToolbarChildFragment.f76671ooOO;
        if (imageView2 == null) {
            OooOOO0.OooOOOO("btnPlayAudio");
            throw null;
        }
        if (!z && !zBooleanValue) {
            z2 = false;
        }
        imageView2.setActivated(z2);
        if (z) {
            ImageView imageView3 = immersiveToolbarChildFragment.f76671ooOO;
            if (imageView3 != null) {
                imageView3.setImageResource(R.drawable.ic_ni_tools_pause_audio_immersive_selector);
                return;
            } else {
                OooOOO0.OooOOOO("btnPlayAudio");
                throw null;
            }
        }
        ImageView imageView4 = immersiveToolbarChildFragment.f76671ooOO;
        if (imageView4 != null) {
            imageView4.setImageResource(R.drawable.ic_ni_tools_play_audio_immersive_selector);
        } else {
            OooOOO0.OooOOOO("btnPlayAudio");
            throw null;
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment
    public final void OoooOOO(Integer num) {
        Oooo00O().setVisibility((num == null || (Oooo0OO().f73422o00Ooo.f121747OooOo0o.getValue() == OooO0OO.OooO00o.f73444OooOoOO)) ? 8 : 0);
        if (num == null) {
            return;
        }
        if (num.intValue() == 0) {
            Oooo00O().setImageResource(R.drawable.ic_ni_tools_sytuls_immersive_selector);
        } else if (num.intValue() == 1) {
            Oooo00O().setImageResource(R.drawable.ic_ni_tools_finger_immersive_selector);
        } else if (num.intValue() == 2) {
            Oooo00O().setImageResource(R.drawable.ic_ni_tools_tap_reading_immersive_selector);
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment
    public final void OoooOOo(List<C29909OooO0O0> items) {
        OooOOO0.OooO0oO(items, "items");
        super.OoooOOo(items);
        o0OoOo0();
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment
    public final void OoooOoo(View view) {
        this.f76669Ooooooo = (ViewGroup) view.findViewById(R.id.cl_tools);
        super.OoooOoo(view);
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment
    public final void Ooooo00(View view) {
        ImageView imageView = (ImageView) view.findViewById(R.id.btn_play_audio_immersive);
        this.f76671ooOO = imageView;
        if (imageView == null) {
            OooOOO0.OooOOOO("btnPlayAudio");
            throw null;
        }
        C28050OooO0OO.OooO00o(imageView, 500L, new ViewOnClickListenerC26348o000oOoO(this, 1));
        View viewFindViewById = view.findViewById(R.id.btn_enable_full_screen);
        this.f76670o0OoOo0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnEnableFullScreen");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new o000oOoO(this, 0));
        super.Ooooo00(view);
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(Oooo0O0()), null, null, new OooO0O0(view, this, null), 3);
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment
    public final void OooooO0(View view, InterfaceC21987OooOoo interfaceC21987OooOoo) {
        o00Ooo o00oooOooo0oo = Oooo0oo();
        Boolean bool = Boolean.TRUE;
        C33781o00o0O c33781o00o0O = o00oooOooo0oo.f105930OooOO0O;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, bool);
        this.f76482Oooo0 = interfaceC21987OooOoo;
        this.f76486Oooo0O0 = view;
        Ooooo00(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0OoOo0() {
        Object next;
        Object next2;
        RecyclerView.AbstractC22062OooO0oO adapter;
        NoteMeta noteMeta = (NoteMeta) Oooo0OO().f73395OoooOo0.f121747OooOo0o.getValue();
        boolean z = noteMeta != null && noteMeta.getUnboundedNote();
        boolean z2 = Oooo0OO().f73422o00Ooo.f121747OooOo0o.getValue() == OooO0OO.OooO00o.f73444OooOoOO;
        List list = (List) Oooo0oo().f105942OooOo0o.f121747OooOo0o.getValue();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((C29909OooO0O0) next).f106118OooO00o == 1) {
                    break;
                }
            }
        }
        C29909OooO0O0 c29909OooO0O0 = (C29909OooO0O0) next;
        ImageView imageView = this.f76488Oooo0o;
        if (imageView == null) {
            OooOOO0.OooOOOO("btnUndo");
            throw null;
        }
        imageView.setVisibility((c29909OooO0O0 != null ? c29909OooO0O0.f106121OooO0Oo : true) && !z2 ? 0 : 8);
        ImageView imageView2 = this.f76490Oooo0oO;
        if (imageView2 == null) {
            OooOOO0.OooOOOO("btnRedo");
            throw null;
        }
        imageView2.setVisibility((c29909OooO0O0 != null ? c29909OooO0O0.f106121OooO0Oo : true) && !z2 ? 0 : 8);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (((C29909OooO0O0) next2).f106118OooO00o == 0) {
                    break;
                }
            }
        }
        C29909OooO0O0 c29909OooO0O02 = (C29909OooO0O0) next2;
        ImageView imageView3 = this.f76487Oooo0OO;
        if (imageView3 == null) {
            OooOOO0.OooOOOO("btnTiledPage");
            throw null;
        }
        imageView3.setVisibility((c29909OooO0O02 != null ? c29909OooO0O02.f106121OooO0Oo : true) && !z2 && !z ? 0 : 8);
        Oooo00O().setVisibility(!z2 && Oooo0OO().f73381Oooo00o.f121747OooOo0o.getValue() != 0 ? 0 : 8);
        View view = this.f76670o0OoOo0;
        if (view == null) {
            OooOOO0.OooOOOO("btnEnableFullScreen");
            throw null;
        }
        view.setVisibility(z2 ? 0 : 8);
        ViewGroup viewGroup = this.f76669Ooooooo;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("clTools");
            throw null;
        }
        boolean z3 = viewGroup.getVisibility() == 0;
        ViewGroup viewGroup2 = this.f76669Ooooooo;
        if (viewGroup2 == null) {
            OooOOO0.OooOOOO("clTools");
            throw null;
        }
        viewGroup2.setVisibility((z2 || ((Collection) Oooo0oo().f105940OooOo00.f121747OooOo0o.getValue()).isEmpty()) ? false : true ? 0 : 8);
        if (z3 || (adapter = Oooo0o().getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }
}
