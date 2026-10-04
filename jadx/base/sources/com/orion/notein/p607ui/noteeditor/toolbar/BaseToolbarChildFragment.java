package com.orion.notein.p607ui.noteeditor.toolbar;

import OooO0o.C20424OooO0Oo;
import OooO0oO.C20438OooO0oO;
import OooO0oO.C20439OooO0oo;
import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.C22194OoooOOo;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.aspose.words.EditingLanguage;
import com.lzf.easyfloat.data.FloatConfig;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.NoteinFirebaseUser;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.export.ExportRequest;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.audio.AbstractC23415OooO0o0;
import com.orion.notein.p607ui.noteeditor.audio.OooO0OO;
import com.orion.notein.p607ui.noteeditor.screenshot.OooO00o;
import com.orion.notein.p607ui.noteeditor.screenshot.ScreenCaptureForegroundService;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.popup.insertfile.InsertFileBottomSheetDialog;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import o000o00.AbstractC24555OooO00o;
import o00Oo0oO.C25052OooO0Oo;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0O0O0o.C25871OooO00o;
import o0O0OO0.OooO00o;
import o0O0ooo0.C26242OooO0oo;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0OOo0O.C27279OooO00o;
import o0OOo0O.C27280OooO0O0;
import o0OOoo.C27822OooO00o;
import o0OOoo.C27823OooO0O0;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oO.C28038OooO0Oo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0Ooo.ViewOnClickListenerC28136OooO0O0;
import o0Oo0o00.C28186Oooo0o0;
import o0Oo0o00.C28201OooooO0;
import o0Oo0o00.ViewOnClickListenerC28147OooO;
import o0Oo0o00.ViewOnClickListenerC28151OooO0Oo;
import o0Oo0o00.ViewOnClickListenerC28152OooO0o;
import o0Oo0o00.ViewOnClickListenerC28153OooO0o0;
import o0Oo0o00.ViewOnClickListenerC28155OooO0oo;
import o0Oo0o00.ViewOnClickListenerC28158OooOO0o;
import o0OoO0OO.C28619OooOOo0;
import o0OoO0o.C28659OooOOo;
import o0OoO0oO.ViewOnClickListenerC28681OooOO0O;
import o0OoO0oo.C28698OooOOOO;
import o0OoO0oo.C28745o000;
import o0OoO0oo.C28755o00000o0;
import o0OoO0oo.C28764o0000OOO;
import o0OoO0oo.C28765o0000OOo;
import o0OoO0oo.C28783o000O000;
import o0OoOO00.C29006OooOOoo;
import o0OoOO00.ViewOnClickListenerC29029OoooO00;
import o0OoOOO0.C29042OooO0O0;
import o0OoOOO0.ViewOnClickListenerC29047OooO0oO;
import o0OoOOoO.C29192OooO0o0;
import o0OoOo.C29196OooO0OO;
import o0Ooo.C29252OooO;
import o0Ooo.C29264OooOOO;
import o0Ooo.C29267OooOOo;
import o0Oooo.C29601OooOOO;
import o0o00.C29719OooO00o;
import o0o000.C29726OooO0oo;
import o0o0000o.C29728OooO0Oo;
import o0o000oo.C29811OooOO0o;
import o0o000oo.C29826OooOoOO;
import o0o000oo.C29828OooOoo0;
import o0o000oo.C29831Oooo;
import o0o000oo.C29840Oooo0oO;
import o0o000oo.C29841Oooo0oo;
import o0o000oo.C29844OoooO00;
import o0o000oo.C29845OoooO0O;
import o0o000oo.ViewOnClickListenerC29843OoooO0;
import o0o000oo.o00Ooo;
import o0o00O.InterfaceC29862OooO00o;
import o0o00O0.DialogC29865OooO00o;
import o0o00O00.C29869OooO0Oo;
import o0o00O00.C29870OooO0o0;
import o0o00O0O.C29873OooO0Oo;
import o0o00O0O.DialogC29872OooO0O0;
import o0o00O0o.InterfaceC29879OooO0o;
import o0o00OO0.C29883OooO0OO;
import o0o00OOO.InterfaceC29884OooO00o;
import o0o00OOo.C29887OooO0O0;
import o0o00OOo.DialogC29886OooO00o;
import o0o00OOo.InterfaceC29892OooO0oO;
import o0o00Oo0.C29908OooO00o;
import o0o00Oo0.C29909OooO0O0;
import o0oOOooO.C30889OooOO0O;
import o0oOOooO.C30898OooOo00;
import o0oOo0o0.C30983OooO0o;
import o0oOoOo.C31044OooOOOo;
import o0oOoOo.C31077OoooOOo;
import o0oOoOo.C31079OoooOoO;
import o0oOoo0.C31113OooO0O0;
import o0ooO.EnumC31414OooO00o;
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
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33781o00o0O;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbar/BaseToolbarChildFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class BaseToolbarChildFragment extends Hilt_BaseToolbarChildFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f76477OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f76478OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f76479OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C22026ooOO f76480OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public RecyclerView f76481Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public InterfaceC21987OooOoo f76482Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f76483Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f76484Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C22026ooOO f76485Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f76486Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ImageView f76487Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ImageView f76488Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public ImageView f76489Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ImageView f76490Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ConstraintLayout f76491Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ImageView f76492OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ImageView f76493OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public C29719OooO00o f76494OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ImageView f76495OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final LinkedHashMap f76496OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final OooO00o f76497OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public OooO0O0 f76498OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.screenshot.OooO00o f76499OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f76500OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final OooOO0O f76501OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f76502Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f76503Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final OooO0o.OooO0O0<String> f76504OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final OooO0o.OooO0O0<String> f76505OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public C28755o00000o0 f76506o000oOoO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f76508OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooO, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$17", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1273}, m80625m = "invokeSuspend")
        public static final class C19388OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76509OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76510OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$17$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<com.orion.notein.p607ui.noteeditor.audio.OooO0OO, Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public /* synthetic */ boolean f76511OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0OO f76512OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76513OooOoO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(3, continuation);
                    this.f76513OooOoO0 = baseToolbarChildFragment;
                }

                @Override // oO0O000o.InterfaceC32510OooOOo0
                public final Object invoke(com.orion.notein.p607ui.noteeditor.audio.OooO0OO oooO0OO, Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    boolean zBooleanValue = bool.booleanValue();
                    OooO00o oooO00o = new OooO00o(this.f76513OooOoO0, continuation);
                    oooO00o.f76512OooOo0o = oooO0OO;
                    oooO00o.f76511OooOo = zBooleanValue;
                    return oooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    com.orion.notein.p607ui.noteeditor.audio.OooO0OO oooO0OO = this.f76512OooOo0o;
                    boolean z = this.f76511OooOo;
                    boolean z2 = oooO0OO instanceof OooO0OO.C23396OooO0oo;
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76513OooOoO0;
                    baseToolbarChildFragment.Oooo0oo().OooO0o(9, z2 || z);
                    o00Ooo o00oooOooo0oo = baseToolbarChildFragment.Oooo0oo();
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    C33781o00o0O c33781o00o0O = o00oooOooo0oo.f105937OooOOo0;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, boolValueOf);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooO$OooO0O0 */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$17$2", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32460OooOooO, Continuation<? super C32460OooOooO>, Object> {
                public OooO0O0() {
                    throw null;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO0O0(2, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32460OooOooO c32460OooOooO, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO0O0) create(c32460OooOooO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19388OooO(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C19388OooO> continuation) {
                super(2, continuation);
                this.f76509OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19388OooO(this.f76509OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19388OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76510OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76509OooOo;
                    com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo000 = baseToolbarChildFragment.Oooo000();
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
                    C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(oooO0oOooo000.f74227OooOO0, Oooo0OO2.f73424o00oO0O, new OooO00o(baseToolbarChildFragment, null));
                    OooO0O0 oooO0O0 = new OooO0O0(2, null);
                    this.f76510OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33763OoooOOO, oooO0O0, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {EditingLanguage.QUECHUA_BOLIVIA}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76514OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76515OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$1$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19389OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76516OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f76517OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19389OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C19389OooO00o> continuation) {
                    super(2, continuation);
                    this.f76516OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19389OooO00o c19389OooO00o = new C19389OooO00o(this.f76516OooOo, continuation);
                    c19389OooO00o.f76517OooOo0o = ((Boolean) obj).booleanValue();
                    return c19389OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((C19389OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    boolean z = this.f76517OooOo0o;
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76516OooOo;
                    if (z) {
                        C28050OooO0OO.OooO00o(baseToolbarChildFragment.Oooo00O(), 500L, new ViewOnClickListenerC29047OooO0oO(baseToolbarChildFragment, 1));
                    } else {
                        C28050OooO0OO.OooO00o(baseToolbarChildFragment.Oooo00O(), 500L, new ViewOnClickListenerC29843OoooO0(baseToolbarChildFragment, 0));
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f76514OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f76514OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76515OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76514OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
                    C19389OooO00o c19389OooO00o = new C19389OooO00o(baseToolbarChildFragment, null);
                    this.f76515OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(Oooo0OO2.f73376OooOooo, c19389OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$10", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1202}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76518OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76519OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$10$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31079OoooOoO>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76520OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76521OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76520OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76520OooOo, continuation);
                    oooO00o.f76521OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C31079OoooOoO> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f76521OooOo0o;
                    InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) C20424OooO0Oo.OooO0Oo(3, this.f76520OooOo.f76496OoooOO0);
                    Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                    C29192OooO0o0 c29192OooO0o0 = value instanceof C29192OooO0o0 ? (C29192OooO0o0) value : null;
                    if (c29192OooO0o0 != null) {
                        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                        c29192OooO0o0.f103531OooO0o0.OooO0Oo(list);
                        c29192OooO0o0.f103536OooOO0o.setVisibility(list.isEmpty() ? 0 : 8);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f76518OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f76518OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76519OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76518OooOo;
                    C30898OooOo00 c30898OooOo00Oooo0oO = baseToolbarChildFragment.Oooo0oO();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76519OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30898OooOo00Oooo0oO.f110445OooOOo, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$11", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1209}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76522OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76523OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$11$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Boolean, ? extends Integer>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76524OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76525OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76524OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76524OooOo, continuation);
                    oooO00o.f76525OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32443OooOOO<? extends Boolean, ? extends Integer> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f76525OooOo0o;
                    boolean zBooleanValue = ((Boolean) c32443OooOOO.f116638OooOo0o).booleanValue();
                    int iIntValue = ((Number) c32443OooOOO.f116637OooOo).intValue();
                    InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) C20424OooO0Oo.OooO0Oo(3, this.f76524OooOo.f76496OoooOO0);
                    Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                    C29192OooO0o0 c29192OooO0o0 = value instanceof C29192OooO0o0 ? (C29192OooO0o0) value : null;
                    if (c29192OooO0o0 != null) {
                        View view = c29192OooO0o0.f103525OooO;
                        TextView textView = c29192OooO0o0.f103533OooO0oo;
                        TextView textView2 = c29192OooO0o0.f103535OooOO0O;
                        if (zBooleanValue) {
                            textView.setText(R.string.cancel_multi_select);
                            textView2.setVisibility(0);
                            Context context = c29192OooO0o0.f103526OooO00o;
                            textView2.setTextColor(iIntValue > 0 ? ContextCompat.getColor(context, R.color.item_text_group_name_color) : ContextCompat.getColor(context, R.color.item_text_name_color_disable));
                            view.setVisibility(8);
                        } else {
                            textView.setText(R.string.multi_select);
                            textView2.setVisibility(8);
                            view.setVisibility(0);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f76522OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f76522OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76523OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76522OooOo;
                    C30898OooOo00 c30898OooOo00Oooo0oO = baseToolbarChildFragment.Oooo0oO();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76523OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30898OooOo00Oooo0oO.f110441OooOOO, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$12", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1216}, m80625m = "invokeSuspend")
        public static final class C23570OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76526OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76527OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooO0Oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$12$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31077OoooOOo>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76528OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76529OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76528OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76528OooOo, continuation);
                    oooO00o.f76529OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C31077OoooOOo> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f76529OooOo0o;
                    InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) C20424OooO0Oo.OooO0Oo(3, this.f76528OooOo.f76496OoooOO0);
                    Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                    C29192OooO0o0 c29192OooO0o0 = value instanceof C29192OooO0o0 ? (C29192OooO0o0) value : null;
                    if (c29192OooO0o0 != null) {
                        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                        c29192OooO0o0.f103534OooOO0.OooO0Oo(list);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23570OooO0Oo(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C23570OooO0Oo> continuation) {
                super(2, continuation);
                this.f76526OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23570OooO0Oo(this.f76526OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23570OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76527OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76526OooOo;
                    C30898OooOo00 c30898OooOo00Oooo0oO = baseToolbarChildFragment.Oooo0oO();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76527OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30898OooOo00Oooo0oO.f110449OooOo00, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$14", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1230}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76530OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76531OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$14$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<OooO0OO.OooO00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76532OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76533OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76532OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76532OooOo, continuation);
                    oooO00o.f76533OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(OooO0OO.OooO00o oooO00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(oooO00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    OooO0OO.OooO00o oooO00o = (OooO0OO.OooO00o) this.f76533OooOo0o;
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76532OooOo;
                    baseToolbarChildFragment.Oooo0oo().OooO0o(3, oooO00o == OooO0OO.OooO00o.f73440OooOo);
                    baseToolbarChildFragment.Oooo0oo().OooO0o(7, oooO00o == OooO0OO.OooO00o.f73443OooOoO0);
                    baseToolbarChildFragment.Oooo0oo().OooO0o(6, oooO00o == OooO0OO.OooO00o.f73442OooOoO);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f76530OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f76530OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76531OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76530OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76531OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(Oooo0OO2.f73422o00Ooo, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$13", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1223}, m80625m = "invokeSuspend")
        public static final class C23571OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76534OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76535OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooO0o0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$13$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends String, ? extends Boolean>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76536OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76537OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76536OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76536OooOo, continuation);
                    oooO00o.f76537OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32443OooOOO<? extends String, ? extends Boolean> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f76537OooOo0o;
                    String string = (String) c32443OooOOO.f116638OooOo0o;
                    boolean zBooleanValue = ((Boolean) c32443OooOOO.f116637OooOo).booleanValue();
                    InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) C20424OooO0Oo.OooO0Oo(3, this.f76536OooOo.f76496OoooOO0);
                    Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                    C29192OooO0o0 c29192OooO0o0 = value instanceof C29192OooO0o0 ? (C29192OooO0o0) value : null;
                    if (c29192OooO0o0 != null) {
                        if (string == null) {
                            string = c29192OooO0o0.f103526OooO00o.getString(R.string.sticker_latest_used);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        }
                        c29192OooO0o0.f103532OooO0oO.setText(string);
                        c29192OooO0o0.f103530OooO0o.setVisibility(zBooleanValue ? 0 : 8);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23571OooO0o0(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C23571OooO0o0> continuation) {
                super(2, continuation);
                this.f76534OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23571OooO0o0(this.f76534OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23571OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76535OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76534OooOo;
                    C30898OooOo00 c30898OooOo00Oooo0oO = baseToolbarChildFragment.Oooo0oO();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76535OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30898OooOo00Oooo0oO.f110444OooOOOo, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$15", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1246}, m80625m = "invokeSuspend")
        public static final class C23572OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76538OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76539OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooO0oO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$15$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76540OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76541OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76540OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76540OooOo, continuation);
                    oooO00o.f76541OooOo0o = obj;
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
                    Boolean bool = (Boolean) this.f76541OooOo0o;
                    if (bool == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    this.f76540OooOo.Oooo0oo().OooO0o(2, bool.booleanValue());
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23572OooO0oO(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C23572OooO0oO> continuation) {
                super(2, continuation);
                this.f76538OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23572OooO0oO(this.f76538OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23572OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76539OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76538OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76539OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(Oooo0OO2.f73373OooOoo, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooO0oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$16", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1255}, m80625m = "invokeSuspend")
        public static final class C23573OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76542OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76543OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooO0oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$16$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76544OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f76545OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76544OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76544OooOo, continuation);
                    oooO00o.f76545OooOo0o = ((Boolean) obj).booleanValue();
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
                    boolean z = this.f76545OooOo0o;
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76544OooOo;
                    if (baseToolbarChildFragment.f76496OoooOO0.containsKey(new Integer(1))) {
                        InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) C20424OooO0Oo.OooO0Oo(1, baseToolbarChildFragment.f76496OoooOO0);
                        Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                        InterfaceC29892OooO0oO interfaceC29892OooO0oO = value instanceof InterfaceC29892OooO0oO ? (InterfaceC29892OooO0oO) value : null;
                        if (interfaceC29892OooO0oO != null) {
                            interfaceC29892OooO0oO.OooOOOO(z);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23573OooO0oo(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C23573OooO0oo> continuation) {
                super(2, continuation);
                this.f76542OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23573OooO0oo(this.f76542OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23573OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76543OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76542OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76543OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(Oooo0OO2.f73411o00000O, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$18", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1277}, m80625m = "invokeSuspend")
        public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76546OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76547OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$18$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC23415OooO0o0, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76548OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76549OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76548OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76548OooOo, continuation);
                    oooO00o.f76549OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(AbstractC23415OooO0o0 abstractC23415OooO0o0, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(abstractC23415OooO0o0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    boolean z = ((AbstractC23415OooO0o0) this.f76549OooOo0o) instanceof AbstractC23415OooO0o0.C23417OooO0oO;
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76548OooOo;
                    baseToolbarChildFragment.Oooo0oo().OooO0o(8, z);
                    o00Ooo o00oooOooo0oo = baseToolbarChildFragment.Oooo0oo();
                    Boolean boolValueOf = Boolean.valueOf(z);
                    C33781o00o0O c33781o00o0O = o00oooOooo0oo.f105936OooOOo;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, boolValueOf);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOO0(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooOO0> continuation) {
                super(2, continuation);
                this.f76546OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOO0(this.f76546OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76547OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76546OooOo;
                    com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo000 = baseToolbarChildFragment.Oooo000();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76547OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0oOooo000.f74231OooOOO0, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$19", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1285}, m80625m = "invokeSuspend")
        public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76550OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76551OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$19$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29196OooO0OO>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76552OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76553OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76552OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76552OooOo, continuation);
                    oooO00o.f76553OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C29196OooO0OO> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f76553OooOo0o;
                    o00Ooo o00oooOooo0oo = this.f76552OooOo.Oooo0oo();
                    Boolean boolValueOf = Boolean.valueOf(!list.isEmpty());
                    C33781o00o0O c33781o00o0O = o00oooOooo0oo.f105938OooOOoo;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, boolValueOf);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOO0O(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooOO0O> continuation) {
                super(2, continuation);
                this.f76550OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOO0O(this.f76550OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76551OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76550OooOo;
                    com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo000 = baseToolbarChildFragment.Oooo000();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76551OooOo0o = 1;
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooOO0o, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$2", m80623f = "BaseToolbarChildFragment.kt", m80624l = {EditingLanguage.BRETON}, m80625m = "invokeSuspend")
        public static final class C23574OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76554OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76555OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooOO0o$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$2$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Boolean, Boolean, Continuation<? super C32443OooOOO<? extends Boolean, ? extends Boolean>>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public /* synthetic */ boolean f76556OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f76557OooOo0o;

                @Override // oO0O000o.InterfaceC32510OooOOo0
                public final Object invoke(Boolean bool, Boolean bool2, Continuation<? super C32443OooOOO<? extends Boolean, ? extends Boolean>> continuation) {
                    boolean zBooleanValue = bool.booleanValue();
                    boolean zBooleanValue2 = bool2.booleanValue();
                    OooO00o oooO00o = new OooO00o(3, continuation);
                    oooO00o.f76557OooOo0o = zBooleanValue;
                    oooO00o.f76556OooOo = zBooleanValue2;
                    return oooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return new C32443OooOOO(Boolean.valueOf(this.f76556OooOo), Boolean.valueOf(this.f76557OooOo0o));
                }
            }

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooOO0o$OooO0O0 */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$2$2", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Boolean, ? extends Boolean>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76558OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76559OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0O0(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO0O0> continuation) {
                    super(2, continuation);
                    this.f76558OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO0O0 oooO0O0 = new OooO0O0(this.f76558OooOo, continuation);
                    oooO0O0.f76559OooOo0o = obj;
                    return oooO0O0;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32443OooOOO<? extends Boolean, ? extends Boolean> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO0O0) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f76559OooOo0o;
                    boolean zBooleanValue = ((Boolean) c32443OooOOO.f116638OooOo0o).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) c32443OooOOO.f116637OooOo).booleanValue();
                    if (zBooleanValue) {
                        this.f76558OooOo.Oooo0oo().OooO0o(10, zBooleanValue2);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23574OooOO0o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C23574OooOO0o> continuation) {
                super(2, continuation);
                this.f76554OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23574OooOO0o(this.f76554OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23574OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76555OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76554OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO3 = baseToolbarChildFragment.Oooo0OO();
                    C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(Oooo0OO2.f73380Oooo00O, Oooo0OO3.f73376OooOooo, new OooO00o(3, null));
                    OooO0O0 oooO0O0 = new OooO0O0(baseToolbarChildFragment, null);
                    this.f76555OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33763OoooOOO, oooO0O0, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$3", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1158}, m80625m = "invokeSuspend")
        public static final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76560OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76561OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$3$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29908OooO00o>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76562OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76563OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76562OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76562OooOo, continuation);
                    oooO00o.f76563OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C29908OooO00o> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f76563OooOo0o;
                    C29719OooO00o c29719OooO00o = this.f76562OooOo.f76494OoooO00;
                    if (c29719OooO00o != null) {
                        c29719OooO00o.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("toolsAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOOO(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooOOO> continuation) {
                super(2, continuation);
                this.f76560OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOOO(this.f76560OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76561OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76560OooOo;
                    o00Ooo o00oooOooo0oo = baseToolbarChildFragment.Oooo0oo();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76561OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(o00oooOooo0oo.f105940OooOo00, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$20", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1291}, m80625m = "invokeSuspend")
        public static final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76564OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76565OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$20$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32460OooOooO, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76566OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76566OooOo0o = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO00o(this.f76566OooOo0o, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32460OooOooO c32460OooOooO, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c32460OooOooO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76566OooOo0o;
                    if (baseToolbarChildFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                        ViewOnClickListenerC26311Ooooooo viewOnClickListenerC26311Ooooooo = new ViewOnClickListenerC26311Ooooooo();
                        ViewOnClickListenerC28681OooOO0O viewOnClickListenerC28681OooOO0O = new ViewOnClickListenerC28681OooOO0O(baseToolbarChildFragment, 3);
                        String string = baseToolbarChildFragment.getString(R.string.upgrade_now);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        String string2 = baseToolbarChildFragment.getString(R.string.title_upgrade_to_vip_recorder_limited);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        String string3 = baseToolbarChildFragment.getString(R.string.content_upgrade_to_vip_recorder_limited);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                        new TipsDialogFragment(string2, string3, viewOnClickListenerC26311Ooooooo, viewOnClickListenerC28681OooOO0O, null, string, 0, null, 384).show(baseToolbarChildFragment.getChildFragmentManager(), "TipsDialogFragment");
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOOO0(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooOOO0> continuation) {
                super(2, continuation);
                this.f76564OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOOO0(this.f76564OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76565OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76564OooOo;
                    com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo000 = baseToolbarChildFragment.Oooo000();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76565OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0oOooo000.f74261OoooO00, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$4", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1163}, m80625m = "invokeSuspend")
        public static final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76567OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76568OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$4$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C29728OooO0Oo, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76569OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76570OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76569OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76569OooOo, continuation);
                    oooO00o.f76570OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C29728OooO0Oo c29728OooO0Oo, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c29728OooO0Oo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    this.f76569OooOo.Oooo0oo().OooO0o(19, ((C29728OooO0Oo) this.f76570OooOo0o).f105431OooO00o);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOOOO(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooOOOO> continuation) {
                super(2, continuation);
                this.f76567OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOOOO(this.f76567OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76568OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76567OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76568OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(Oooo0OO2.f73431o0OoOo0, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooOOOo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$5", m80623f = "BaseToolbarChildFragment.kt", m80624l = {EditingLanguage.SCOTTISH_GAELIC}, m80625m = "invokeSuspend")
        public static final class C23575OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76571OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76572OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooOOOo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$5$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C29909OooO0O0>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76573OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76574OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76573OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76573OooOo, continuation);
                    oooO00o.f76574OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C29909OooO0O0> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    this.f76573OooOo.OoooOOo((List) this.f76574OooOo0o);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23575OooOOOo(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C23575OooOOOo> continuation) {
                super(2, continuation);
                this.f76571OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23575OooOOOo(this.f76571OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23575OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76572OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76571OooOo;
                    o00Ooo o00oooOooo0oo = baseToolbarChildFragment.Oooo0oo();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76572OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(o00oooOooo0oo.f105942OooOo0o, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooOOo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$7", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1181}, m80625m = "invokeSuspend")
        public static final class C23576OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76575OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76576OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooOOo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$7$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76577OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f76578OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76577OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76577OooOo, continuation);
                    oooO00o.f76578OooOo0o = ((Boolean) obj).booleanValue();
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
                    boolean z = this.f76578OooOo0o;
                    InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) C20424OooO0Oo.OooO0Oo(2, this.f76577OooOo.f76496OoooOO0);
                    Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                    o0OoO.OooO0o oooO0o = value instanceof o0OoO.OooO0o ? (o0OoO.OooO0o) value : null;
                    if (oooO0o != null) {
                        View view = oooO0o.f101038OooO0oo;
                        View view2 = oooO0o.f101036OooO0o0;
                        View view3 = oooO0o.f101034OooO0Oo;
                        TextView textView = oooO0o.f101037OooO0oO;
                        if (z) {
                            textView.setText(R.string.cancel_multi_select);
                            view3.setVisibility(8);
                            view2.setVisibility(8);
                            view.setVisibility(0);
                        } else {
                            textView.setText(R.string.multi_select);
                            view3.setVisibility(0);
                            view2.setVisibility(0);
                            view.setVisibility(8);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23576OooOOo(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C23576OooOOo> continuation) {
                super(2, continuation);
                this.f76575OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23576OooOOo(this.f76575OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23576OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76576OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76575OooOo;
                    C28698OooOOOO c28698OooOOOOOooo0o0 = baseToolbarChildFragment.Oooo0o0();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76576OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c28698OooOOOOOooo0o0.f101692OooO0o, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooOOo0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$6", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1175}, m80625m = "invokeSuspend")
        public static final class C23577OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76579OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76580OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooOOo0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$6$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76581OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f76582OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76581OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76581OooOo, continuation);
                    oooO00o.f76582OooOo0o = ((Boolean) obj).booleanValue();
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
                    this.f76581OooOo.Oooo0oo().OooO0o(11, this.f76582OooOo0o);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23577OooOOo0(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C23577OooOOo0> continuation) {
                super(2, continuation);
                this.f76579OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23577OooOOo0(this.f76579OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23577OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76580OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76579OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76580OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(Oooo0OO2.f73434o0ooOoO, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooOOoo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$8", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1188}, m80625m = "invokeSuspend")
        public static final class C23578OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76583OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76584OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO$OooOOoo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$8$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31044OooOOOo>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76585OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76586OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76585OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76585OooOo, continuation);
                    oooO00o.f76586OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C31044OooOOOo> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f76586OooOo0o;
                    InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) C20424OooO0Oo.OooO0Oo(2, this.f76585OooOo.f76496OoooOO0);
                    Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                    o0OoO.OooO0o oooO0o = value instanceof o0OoO.OooO0o ? (o0OoO.OooO0o) value : null;
                    if (oooO0o != null) {
                        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                        C34406OooO00o.f123390OooO00o.OooO00o("list: size: " + list.size() + " " + oOo000Oo.OooOo.o000oOoO(list, null, null, null, new o0OoO.OooO00o(), 31) + " }}", new Object[0]);
                        oooO0o.f101040OooOO0O.OooO0Oo(list);
                        oooO0o.f101041OooOO0o.setVisibility(list.isEmpty() ? 0 : 8);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23578OooOOoo(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C23578OooOOoo> continuation) {
                super(2, continuation);
                this.f76583OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23578OooOOoo(this.f76583OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23578OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76584OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76583OooOo;
                    C28698OooOOOO c28698OooOOOOOooo0o0 = baseToolbarChildFragment.Oooo0o0();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76584OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c28698OooOOOOOooo0o0.f101696OooOO0, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$9", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1195}, m80625m = "invokeSuspend")
        public static final class OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76587OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76588OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initTools$4$9$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Set<? extends Uri>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76589OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76590OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76589OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76589OooOo, continuation);
                    oooO00o.f76590OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Set<? extends Uri> set, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(set, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    Set set = (Set) this.f76590OooOo0o;
                    InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) C20424OooO0Oo.OooO0Oo(2, this.f76589OooOo.f76496OoooOO0);
                    Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
                    o0OoO.OooO0o oooO0o = value instanceof o0OoO.OooO0o ? (o0OoO.OooO0o) value : null;
                    if (oooO0o != null) {
                        int size = set.size();
                        oooO0o.f101030OooO.setEnabled(size > 0);
                        oooO0o.f101039OooOO0.setEnabled(size > 0);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOo00(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooOo00> continuation) {
                super(2, continuation);
                this.f76587OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOo00(this.f76587OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76588OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76587OooOo;
                    C28698OooOOOO c28698OooOOOOOooo0o0 = baseToolbarChildFragment.Oooo0o0();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76588OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c28698OooOOOOOooo0o0.f101690OooO, oooO00o, this) == enumC32485OooO00o) {
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

        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO oooO = BaseToolbarChildFragment.this.new OooO(continuation);
            oooO.f76508OooOo0o = obj;
            return oooO;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f76508OooOo0o;
            BaseToolbarChildFragment baseToolbarChildFragment = BaseToolbarChildFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23574OooOO0o(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOO(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOOO(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23575OooOOOo(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23577OooOOo0(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23576OooOOo(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23578OooOOoo(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOo00(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23570OooO0Oo(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23571OooO0o0(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23572OooO0oO(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23573OooO0oo(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19388OooO(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0O(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOOO0(baseToolbarChildFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public final class OooO00o extends Handler {
        public OooO00o() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message msg) {
            int i;
            boolean z;
            kotlin.jvm.internal.OooOOO0.OooO0oO(msg, "msg");
            int i2 = msg.what;
            final BaseToolbarChildFragment baseToolbarChildFragment = BaseToolbarChildFragment.this;
            if (i2 == 0) {
                removeMessages(0);
                RecyclerView.OooOOOO layoutManager = baseToolbarChildFragment.Oooo0o().getLayoutManager();
                kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                final int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                RecyclerView.AbstractC22062OooO0oO adapter = baseToolbarChildFragment.Oooo0o().getAdapter();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(adapter);
                final int itemCount = adapter.getItemCount();
                boolean z2 = iFindLastVisibleItemPosition < itemCount + (-1);
                boolean z3 = iFindFirstCompletelyVisibleItemPosition > 0;
                if (z2) {
                    baseToolbarChildFragment.Oooo0().setEnabled(true);
                    C28050OooO0OO.OooO00o(baseToolbarChildFragment.Oooo0(), 500L, new View.OnClickListener() { // from class: o0o000oo.OooOOOO
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            baseToolbarChildFragment.Oooo0o().smoothScrollToPosition(Math.min(iFindLastVisibleItemPosition + 1, itemCount - 1));
                        }
                    });
                    return;
                } else {
                    if (z3) {
                        baseToolbarChildFragment.Oooo0().setEnabled(false);
                        return;
                    }
                    return;
                }
            }
            if (i2 != 1) {
                return;
            }
            removeMessages(1);
            RecyclerView.AbstractC22062OooO0oO adapter2 = baseToolbarChildFragment.Oooo0o().getAdapter();
            int itemCount2 = adapter2 != null ? adapter2.getItemCount() : 0;
            if (itemCount2 == 0) {
                return;
            }
            int paddingRight = baseToolbarChildFragment.Oooo0o().getPaddingRight() + baseToolbarChildFragment.Oooo0o().getPaddingLeft();
            Boolean bool = (Boolean) baseToolbarChildFragment.Oooo0oo().f105930OooOO0O.getValue();
            int dimensionPixelSize = bool != null ? bool.booleanValue() : true ? baseToolbarChildFragment.getResources().getDimensionPixelSize(R.dimen.immersive_toolbar_item_width) : baseToolbarChildFragment.getResources().getDimensionPixelSize(R.dimen.toolbar_item_width);
            ConstraintLayout constraintLayout = baseToolbarChildFragment.f76491Oooo0oo;
            if (constraintLayout == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clMiddleContainer");
                throw null;
            }
            int width = constraintLayout.getWidth();
            if (width < (itemCount2 * dimensionPixelSize) + paddingRight) {
                baseToolbarChildFragment.Oooo0().setVisibility(0);
                int i3 = ((width - baseToolbarChildFragment.Oooo0().getLayoutParams().width) - paddingRight) / dimensionPixelSize;
                z = i3 < 1;
                if (i3 < 0) {
                    i3 = 0;
                }
                i = (i3 * dimensionPixelSize) + paddingRight;
            } else {
                baseToolbarChildFragment.Oooo0().setVisibility(8);
                i = -2;
                z = false;
            }
            ConstraintLayout constraintLayout2 = baseToolbarChildFragment.f76491Oooo0oo;
            if (constraintLayout2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("clMiddleContainer");
                throw null;
            }
            constraintLayout2.setVisibility(z ? 4 : 0);
            if (i != baseToolbarChildFragment.Oooo0o().getLayoutParams().width) {
                baseToolbarChildFragment.Oooo0o().getLayoutParams().width = i;
                baseToolbarChildFragment.Oooo0o().requestLayout();
                sendEmptyMessageDelayed(0, 100L);
            }
        }
    }

    public static final class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Boolean boolValueOf;
            boolean z;
            C33781o00o0O c33781o00o0O = BaseToolbarChildFragment.this.Oooo0o0().f101694OooO0oO;
            Boolean bool = Boolean.TRUE;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
            InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) BaseToolbarChildFragment.this.f76496OoooOO0.get(2);
            Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
            o0OoO.OooO0o oooO0o = value instanceof o0OoO.OooO0o ? (o0OoO.OooO0o) value : null;
            if (oooO0o != null) {
                ImageView imageView = BaseToolbarChildFragment.this.f76492OoooO;
                if (imageView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnPanel");
                    throw null;
                }
                synchronized (oooO0o) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i = 0;
                    z = false;
                    if (jCurrentTimeMillis - oooO0o.f101043OooOOO0 >= 500) {
                        View contentView = oooO0o.f101033OooO0OO.getContentView();
                        int width = oooO0o.f101033OooO0OO.getWidth();
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(width), width == -2 ? 0 : 1073741824);
                        int height = oooO0o.f101033OooO0OO.getHeight();
                        if (height != -2) {
                            i = 1073741824;
                        }
                        contentView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(height), i));
                        oooO0o.f101033OooO0OO.showAsDropDown(imageView, (-(contentView.getMeasuredWidth() - imageView.getWidth())) - oooO0o.f101044OooOOOO, o000000O.OooO0o(11));
                        oooO0o.f101043OooOOO0 = jCurrentTimeMillis;
                        z = true;
                    }
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(boolValueOf, bool)) {
                BaseToolbarChildFragment.this.Oooo0oo().OooO0o(100, true);
            }
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(BaseToolbarChildFragment.this.Oooo0O0()), null, null, BaseToolbarChildFragment.this.new OooO0OO(null), 3);
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$handleOnImageBtnClicked$1$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return BaseToolbarChildFragment.this.new OooO0OO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C28698OooOOOO c28698OooOOOOOooo0o0 = BaseToolbarChildFragment.this.Oooo0o0();
            Boolean bool = Boolean.FALSE;
            C33781o00o0O c33781o00o0O = c28698OooOOOOOooo0o0.f101693OooO0o0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
            C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
            C33781o00o0O c33781o00o0O2 = c28698OooOOOOOooo0o0.f101695OooO0oo;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, c34438OooOoo0);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$handleOnInsertAudioBtnClicked$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1602}, m80625m = "invokeSuspend")
    public static final class C23579OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f76595OooOo0o;

        public C23579OooO0Oo(Continuation<? super C23579OooO0Oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return BaseToolbarChildFragment.this.new C23579OooO0Oo(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23579OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f76595OooOo0o;
            BaseToolbarChildFragment baseToolbarChildFragment = BaseToolbarChildFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f76595OooOo0o = 1;
                obj = BaseToolbarChildFragment.OooOooo(baseToolbarChildFragment, 34, this);
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
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/*");
            baseToolbarChildFragment.f76500OoooOoO.OooO00o(intent);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$handleOnPageMarginBtnClicked$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1909}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f76597OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f76598OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteContent f76599OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(NoteContent noteContent, String str, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f76599OooOoO0 = noteContent;
            this.f76598OooOoO = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return BaseToolbarChildFragment.this.new OooO0o(this.f76599OooOoO0, this.f76598OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f76597OooOo0o;
            BaseToolbarChildFragment baseToolbarChildFragment = BaseToolbarChildFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f76597OooOo0o = 1;
                obj = BaseToolbarChildFragment.OooOooo(baseToolbarChildFragment, 31, this);
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
            Context contextRequireContext = baseToolbarChildFragment.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(baseToolbarChildFragment), o0oo000O.OooOO0O.OooO00o(contextRequireContext) ? R.id.pagePaddingDialogFragment : R.id.pagePaddingBottomSheetDialogFragment, BundleKt.bundleOf(new C32443OooOOO("note_id", this.f76599OooOoO0.getId()), new C32443OooOOO("page_id", this.f76598OooOoO)));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$handleOnPageConfigBtnClicked$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1878, 1882}, m80625m = "invokeSuspend")
    public static final class C23580OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f76600OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f76601OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ View f76602OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ boolean f76604OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23580OooO0o0(View view, boolean z, Continuation<? super C23580OooO0o0> continuation) {
            super(2, continuation);
            this.f76602OooOoO = view;
            this.f76604OooOoOO = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return BaseToolbarChildFragment.this.new C23580OooO0o0(this.f76602OooOoO, this.f76604OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23580OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strOooOO0;
            boolean zBooleanValue;
            Object objOooO0o;
            boolean z;
            o0o00O0O.OooO0o oooO0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f76600OooOo;
            boolean zBooleanValue2 = true;
            BaseToolbarChildFragment baseToolbarChildFragment = BaseToolbarChildFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
                this.f76600OooOo = 1;
                NoteContent noteContent = (NoteContent) Oooo0OO2.f73396OoooOoO.f121747OooOo0o.getValue();
                if (noteContent == null || (strOooOO0 = Oooo0OO2.OooOO0()) == null) {
                    obj = Boolean.FALSE;
                } else {
                    String id = noteContent.getId();
                    C22194OoooOOo c22194OoooOOo = Oooo0OO2.f73363OooOOo0;
                    c22194OoooOOo.getClass();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27823OooO0O0(c22194OoooOOo, strOooOO0, id, null), this);
                }
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.f76601OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                zBooleanValue2 = ((Boolean) obj).booleanValue();
                zBooleanValue = z;
                if (!zBooleanValue || zBooleanValue2) {
                    InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) baseToolbarChildFragment.f76496OoooOO0.get(11);
                    Object value = interfaceC32440OooOO0 == null ? interfaceC32440OooOO0.getValue() : null;
                    oooO0o = value instanceof o0o00O0O.OooO0o ? (o0o00O0O.OooO0o) value : null;
                    if (oooO0o != null) {
                        oooO0o.OooO0oo(zBooleanValue, zBooleanValue2);
                    }
                    if (oooO0o != null) {
                        oooO0o.OooO0OO(this.f76602OooOoO, this.f76604OooOoOO);
                    }
                } else {
                    BaseToolbarChildFragment.OooOooO(baseToolbarChildFragment);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            if (!zBooleanValue) {
                com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO3 = baseToolbarChildFragment.Oooo0OO();
                this.f76601OooOo0o = zBooleanValue;
                this.f76600OooOo = 2;
                NoteContent noteContent2 = (NoteContent) Oooo0OO3.f73396OoooOoO.f121747OooOo0o.getValue();
                if (noteContent2 == null) {
                    objOooO0o = Boolean.FALSE;
                } else {
                    String id2 = noteContent2.getId();
                    C22194OoooOOo c22194OoooOOo2 = Oooo0OO3.f73363OooOOo0;
                    c22194OoooOOo2.getClass();
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27822OooO00o(c22194OoooOOo2, id2, null), this);
                }
                if (objOooO0o != enumC32485OooO00o) {
                    z = zBooleanValue;
                    obj = objOooO0o;
                    zBooleanValue2 = ((Boolean) obj).booleanValue();
                    zBooleanValue = z;
                }
                return enumC32485OooO00o;
            }
            if (zBooleanValue) {
                InterfaceC32440OooOO0 interfaceC32440OooOO02 = (InterfaceC32440OooOO0) baseToolbarChildFragment.f76496OoooOO0.get(11);
                if (interfaceC32440OooOO02 == null) {
                }
                if (value instanceof o0o00O0O.OooO0o) {
                }
                if (oooO0o != null) {
                }
                if (oooO0o != null) {
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$handleOnStickerBtnClicked$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {1674, 1682}, m80625m = "invokeSuspend")
    public static final class C23581OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f76606OooOo0o;

        public C23581OooO0oO(Continuation<? super C23581OooO0oO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return BaseToolbarChildFragment.this.new C23581OooO0oO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23581OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        
            if (oO0o0OO.C33644OoooO0.OooO00o(300, r13) == r0) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C29192OooO0o0 c29192OooO0o0;
            Boolean boolValueOf;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f76606OooOo0o;
            BaseToolbarChildFragment baseToolbarChildFragment = BaseToolbarChildFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f76606OooOo0o = 1;
                obj = BaseToolbarChildFragment.OooOooo(baseToolbarChildFragment, 14, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                C30898OooOo00 c30898OooOo00Oooo0oO = baseToolbarChildFragment.Oooo0oO();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30898OooOo00Oooo0oO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30889OooOO0O(null, c30898OooOo00Oooo0oO), 2);
                InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) C20424OooO0Oo.OooO0Oo(3, baseToolbarChildFragment.f76496OoooOO0);
                Object value = interfaceC32440OooOO0 == null ? interfaceC32440OooOO0.getValue() : null;
                c29192OooO0o0 = !(value instanceof C29192OooO0o0) ? (C29192OooO0o0) value : null;
                if (c29192OooO0o0 == null) {
                    ImageView imageView = baseToolbarChildFragment.f76492OoooO;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnPanel");
                        throw null;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    boolean z = false;
                    if (jCurrentTimeMillis - c29192OooO0o0.f103538OooOOO0 >= 500) {
                        PopupWindow popupWindow = c29192OooO0o0.f103529OooO0Oo;
                        View contentView = popupWindow.getContentView();
                        int width = popupWindow.getWidth();
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(width), width == -2 ? 0 : 1073741824);
                        int height = popupWindow.getHeight();
                        contentView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(height), height != -2 ? 1073741824 : 0));
                        popupWindow.showAsDropDown(imageView, (-(contentView.getMeasuredWidth() - imageView.getWidth())) - c29192OooO0o0.f103537OooOOO, o000000O.OooO0o(11));
                        c29192OooO0o0.f103538OooOOO0 = jCurrentTimeMillis;
                        z = true;
                    }
                    boolValueOf = Boolean.valueOf(z);
                } else {
                    boolValueOf = null;
                }
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(boolValueOf, Boolean.TRUE)) {
                    baseToolbarChildFragment.Oooo0oo().OooO0o(101, true);
                }
                C30898OooOo00 c30898OooOo00Oooo0oO2 = baseToolbarChildFragment.Oooo0oO();
                Boolean bool = Boolean.FALSE;
                C33781o00o0O c33781o00o0O = c30898OooOo00Oooo0oO2.f110438OooOO0;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, bool);
                C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
                C33781o00o0O c33781o00o0O2 = c30898OooOo00Oooo0oO2.f110440OooOO0o;
                c33781o00o0O2.getClass();
                c33781o00o0O2.OooOO0(null, c34438OooOoo0);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            if (((Number) baseToolbarChildFragment.Oooo0OO().f73408o000000.getValue()).intValue() == 0) {
                baseToolbarChildFragment.Oooo0OO().Oooo0o(1);
                this.f76606OooOo0o = 2;
            }
            C30898OooOo00 c30898OooOo00Oooo0oO3 = baseToolbarChildFragment.Oooo0oO();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(c30898OooOo00Oooo0oO3);
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30889OooOO0O(null, c30898OooOo00Oooo0oO3), 2);
            InterfaceC32440OooOO0 interfaceC32440OooOO02 = (InterfaceC32440OooOO0) C20424OooO0Oo.OooO0Oo(3, baseToolbarChildFragment.f76496OoooOO0);
            if (interfaceC32440OooOO02 == null) {
            }
            if (!(value instanceof C29192OooO0o0)) {
            }
            if (c29192OooO0o0 == null) {
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(boolValueOf, Boolean.TRUE)) {
            }
            C30898OooOo00 c30898OooOo00Oooo0oO22 = baseToolbarChildFragment.Oooo0oO();
            Boolean bool2 = Boolean.FALSE;
            C33781o00o0O c33781o00o0O3 = c30898OooOo00Oooo0oO22.f110438OooOO0;
            c33781o00o0O3.getClass();
            c33781o00o0O3.OooOO0(null, bool2);
            C34438OooOoo0 c34438OooOoo02 = C34438OooOoo0.f123458OooOo0o;
            C33781o00o0O c33781o00o0O22 = c30898OooOo00Oooo0oO22.f110440OooOO0o;
            c33781o00o0O22.getClass();
            c33781o00o0O22.OooOO0(null, c34438OooOoo02);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23582OooO0oo extends RecyclerView.OooOo00 {
        public C23582OooO0oo() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOo00
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                BaseToolbarChildFragment.this.f76497OoooOOO.sendEmptyMessage(0);
            }
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initViews$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ BaseToolbarChildFragment f76608OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f76609OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ View f76610OooOoO0;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initViews$1$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {244}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76611OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76612OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initViews$1$1$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19390OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76613OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76614OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19390OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super C19390OooO00o> continuation) {
                    super(2, continuation);
                    this.f76613OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19390OooO00o c19390OooO00o = new C19390OooO00o(this.f76613OooOo, continuation);
                    c19390OooO00o.f76614OooOo0o = obj;
                    return c19390OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19390OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    String id = (String) this.f76614OooOo0o;
                    o00Ooo o00oooOooo0oo = this.f76613OooOo.Oooo0oo();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
                    C33781o00o0O c33781o00o0O = o00oooOooo0oo.f105933OooOOO0;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, id);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f76611OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f76611OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76612OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76611OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
                    C19390OooO00o c19390OooO00o = new C19390OooO00o(baseToolbarChildFragment, null);
                    this.f76612OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(Oooo0OO2.f73397OoooOoo, c19390OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initViews$1$2", m80623f = "BaseToolbarChildFragment.kt", m80624l = {250}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76615OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76616OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initViews$1$2$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteinFirebaseUser, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76617OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f76618OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76617OooOo = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76617OooOo, continuation);
                    oooO00o.f76618OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(NoteinFirebaseUser noteinFirebaseUser, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(noteinFirebaseUser, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) this.f76618OooOo0o;
                    o00Ooo o00oooOooo0oo = this.f76617OooOo.Oooo0oo();
                    String id = noteinFirebaseUser != null ? noteinFirebaseUser.getId() : null;
                    if (id == null) {
                        id = "";
                    }
                    C33781o00o0O c33781o00o0O = o00oooOooo0oo.f105931OooOO0o;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, id);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f76615OooOo = baseToolbarChildFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f76615OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76616OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76615OooOo;
                    C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) baseToolbarChildFragment.f76477OooOoo.getValue();
                    OooO00o oooO00o = new OooO00o(baseToolbarChildFragment, null);
                    this.f76616OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c26320o0000OoO.f90227OooOoOO, oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initViews$1$3", m80623f = "BaseToolbarChildFragment.kt", m80624l = {256}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ BaseToolbarChildFragment f76619OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76620OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ View f76621OooOoO0;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$initViews$1$3$1", m80623f = "BaseToolbarChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ View f76622OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f76623OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public final /* synthetic */ BaseToolbarChildFragment f76624OooOoO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(View view, BaseToolbarChildFragment baseToolbarChildFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f76622OooOo = view;
                    this.f76624OooOoO0 = baseToolbarChildFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f76622OooOo, this.f76624OooOoO0, continuation);
                    oooO00o.f76623OooOo0o = ((Boolean) obj).booleanValue();
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
                    this.f76622OooOo.setVisibility(this.f76623OooOo0o ? 0 : 8);
                    BaseToolbarChildFragment.OooOoOO(this.f76624OooOoO0);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(View view, BaseToolbarChildFragment baseToolbarChildFragment, Continuation continuation) {
                super(2, continuation);
                this.f76619OooOo = baseToolbarChildFragment;
                this.f76621OooOoO0 = view;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f76621OooOoO0, this.f76619OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76620OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    BaseToolbarChildFragment baseToolbarChildFragment = this.f76619OooOo;
                    com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO2 = baseToolbarChildFragment.Oooo0OO();
                    OooO00o oooO00o = new OooO00o(this.f76621OooOoO0, baseToolbarChildFragment, null);
                    this.f76620OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(Oooo0OO2.f73426o00ooo, oooO00o, this) == enumC32485OooO00o) {
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
        public OooOO0(View view, BaseToolbarChildFragment baseToolbarChildFragment, Continuation continuation) {
            super(2, continuation);
            this.f76608OooOo = baseToolbarChildFragment;
            this.f76610OooOoO0 = view;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooOO0 oooOO02 = new OooOO0(this.f76610OooOoO0, this.f76608OooOo, continuation);
            oooOO02.f76609OooOo0o = obj;
            return oooOO02;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f76609OooOo0o;
            BaseToolbarChildFragment baseToolbarChildFragment = this.f76608OooOo;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(baseToolbarChildFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(this.f76610OooOoO0, baseToolbarChildFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooOO0O implements OooO00o.InterfaceC19380OooO00o {
        public OooOO0O() {
        }

        @Override // com.orion.notein.p607ui.noteeditor.screenshot.OooO00o.InterfaceC19380OooO00o
        public final void OooO00o(Uri uri) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ToolbarChildFragment");
            c20358OooO00o.OooO0o0("ScreenShot, onScreenshotSuccess: " + uri, new Object[0]);
            BaseToolbarChildFragment.this.OooooOO(4, uri);
        }

        @Override // com.orion.notein.p607ui.noteeditor.screenshot.OooO00o.InterfaceC19380OooO00o
        public final void OooO0O0() {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ToolbarChildFragment");
            c20358OooO00o.OooO0o0("ScreenShot, onScreenshotFail", new Object[0]);
            Context context = BaseToolbarChildFragment.this.getContext();
            if (context != null) {
                C25206OooO0Oo.OooO0oO(context, "截图失败");
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23583OooOO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23583OooOO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return BaseToolbarChildFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooOOO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return BaseToolbarChildFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooOOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooOOO0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return BaseToolbarChildFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooOOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooOOOO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return BaseToolbarChildFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooOOOo, reason: case insensitive filesystem */
    public static final class C23584OooOOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23584OooOOOo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return BaseToolbarChildFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooOOo, reason: case insensitive filesystem */
    public static final class C23585OooOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76631OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23585OooOOo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76631OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f76631OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooOOo0, reason: case insensitive filesystem */
    public static final class C23586OooOOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23586OooOOo0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return BaseToolbarChildFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooOOoo, reason: case insensitive filesystem */
    public static final class C23587OooOOoo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76633OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23587OooOOoo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76633OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76633OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f76634OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76634OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76634OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? BaseToolbarChildFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooOo0, reason: case insensitive filesystem */
    public static final class C23588OooOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C27279OooO00o f76636OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23588OooOo0(C27279OooO00o c27279OooO00o) {
            super(0);
            this.f76636OooOo0o = c27279OooO00o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f76636OooOo0o.invoke();
        }
    }

    public static final class OooOo00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f76637OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76637OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76637OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? BaseToolbarChildFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooOo0O, reason: case insensitive filesystem */
    public static final class C23589OooOo0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76639OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23589OooOo0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76639OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f76639OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooOo0o, reason: case insensitive filesystem */
    public static final class C23590OooOo0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76640OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23590OooOo0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76640OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76640OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooOoO, reason: case insensitive filesystem */
    public static final class C23591OooOoO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76641OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23591OooOoO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76641OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f76641OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooOoO0, reason: case insensitive filesystem */
    public static final class C23592OooOoO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C27280OooO0O0 f76642OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23592OooOoO0(C27280OooO0O0 c27280OooO0O0) {
            super(0);
            this.f76642OooOo0o = c27280OooO0O0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f76642OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooOoOO, reason: case insensitive filesystem */
    public static final class C23593OooOoOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76643OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23593OooOoOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76643OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76643OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooOoo, reason: case insensitive filesystem */
    public static final class C23594OooOoo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f76644OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23594OooOoo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76644OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76644OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? BaseToolbarChildFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooOoo0, reason: case insensitive filesystem */
    public static final class C23595OooOoo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C29601OooOOO f76646OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23595OooOoo0(C29601OooOOO c29601OooOOO) {
            super(0);
            this.f76646OooOo0o = c29601OooOOO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f76646OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooOooO, reason: case insensitive filesystem */
    public static final class C23596OooOooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76647OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23596OooOooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76647OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f76647OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$OooOooo, reason: case insensitive filesystem */
    public static final class C23597OooOooo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76648OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23597OooOooo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76648OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76648OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class Oooo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76649OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76649OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76649OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class Oooo000 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f76650OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76650OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76650OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? BaseToolbarChildFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$Oooo00O, reason: case insensitive filesystem */
    public static final class C23598Oooo00O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C26242OooO0oo f76652OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23598Oooo00O(C26242OooO0oo c26242OooO0oo) {
            super(0);
            this.f76652OooOo0o = c26242OooO0oo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f76652OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$Oooo00o, reason: case insensitive filesystem */
    public static final class C23599Oooo00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76653OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23599Oooo00o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76653OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f76653OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$Oooo0O0, reason: case insensitive filesystem */
    public static final class C23600Oooo0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f76654OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23600Oooo0O0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76654OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76654OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? BaseToolbarChildFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbar.BaseToolbarChildFragment$Oooo0OO, reason: case insensitive filesystem */
    public static final class C23601Oooo0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C28659OooOOo f76656OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23601Oooo0OO(C28659OooOOo c28659OooOOo) {
            super(0);
            this.f76656OooOo0o = c28659OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f76656OooOo0o.invoke();
        }
    }

    public BaseToolbarChildFragment() {
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f76478OooOoo0 = new C22026ooOO(oooo0.OooO0O0(C28201OooooO0.class), new C23583OooOO0o(), new OooOOO(), new OooOOO0());
        this.f76477OooOoo = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooOOOO(), new C23586OooOOo0(), new C23584OooOOOo());
        C29601OooOOO c29601OooOOO = new C29601OooOOO(this, 1);
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23595OooOoo0(c29601OooOOO));
        this.f76479OooOooO = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.OooO0OO.class), new C23596OooOooO(interfaceC32440OooOO0OooO0O0), new Oooo000(interfaceC32440OooOO0OooO0O0), new C23597OooOooo(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23598Oooo00O(new C26242OooO0oo(this, 1)));
        this.f76480OooOooo = new C22026ooOO(oooo0.OooO0O0(C28698OooOOOO.class), new C23599Oooo00o(interfaceC32440OooOO0OooO0O02), new C23600Oooo0O0(interfaceC32440OooOO0OooO0O02), new Oooo0(interfaceC32440OooOO0OooO0O02));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O03 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23601Oooo0OO(new C28659OooOOo(this, 1)));
        this.f76483Oooo000 = new C22026ooOO(oooo0.OooO0O0(C30898OooOo00.class), new C23585OooOOo(interfaceC32440OooOO0OooO0O03), new OooOo00(interfaceC32440OooOO0OooO0O03), new C23587OooOOoo(interfaceC32440OooOO0OooO0O03));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O04 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23588OooOo0(new C27279OooO00o(this, 1)));
        this.f76484Oooo00O = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.audio.OooO0o.class), new C23589OooOo0O(interfaceC32440OooOO0OooO0O04), new OooOo(interfaceC32440OooOO0OooO0O04), new C23590OooOo0o(interfaceC32440OooOO0OooO0O04));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O05 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23592OooOoO0(new C27280OooO0O0(this, 1)));
        this.f76485Oooo00o = new C22026ooOO(oooo0.OooO0O0(o00Ooo.class), new C23591OooOoO(interfaceC32440OooOO0OooO0O05), new C23594OooOoo(interfaceC32440OooOO0OooO0O05), new C23593OooOoOO(interfaceC32440OooOO0OooO0O05));
        this.f76496OoooOO0 = new LinkedHashMap();
        this.f76497OoooOOO = new OooO00o();
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20439OooO0oo(), new C29042OooO0O0(this, 1));
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f76500OoooOoO = oooO0O0RegisterForActivityResult;
        this.f76501OoooOoo = new OooOO0O();
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult2 = registerForActivityResult(new C20439OooO0oo(), new C29811OooOO0o(this, 0));
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult2, "registerForActivityResult(...)");
        this.f76502Ooooo00 = oooO0O0RegisterForActivityResult2;
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult3 = registerForActivityResult(new C20439OooO0oo(), new OooO0o.OooO00o() { // from class: o0o000oo.OooOOO0
            @Override // OooO0o.OooO00o
            public final void OooO0O0(Object obj) {
                ActivityResult result = (ActivityResult) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                com.orion.notein.p607ui.noteeditor.screenshot.OooO00o oooO00o = this.f105785OooOo0o.f76499OoooOo0;
                if (oooO00o != null) {
                    C29726OooO0oo c29726OooO0oo = oooO00o.f76238OooO0o0;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "ScreenShotWindow", "ScreenShot, onUserGrantToScreenshot, resultCode: ");
                    int i = result.f62240OooOo0o;
                    sbOooO0O0.append(i);
                    sbOooO0O0.append(", data: ");
                    Intent intent = result.f62239OooOo;
                    sbOooO0O0.append(intent);
                    sbOooO0O0.append(", roiInfoValue: ");
                    sbOooO0O0.append(c29726OooO0oo);
                    c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
                    if (i != -1 || intent == null || c29726OooO0oo == null) {
                        oooO00o.f76234OooO0O0.OooO0O0();
                        return;
                    }
                    ActivityC21897OooOo0 activityC21897OooOo0 = oooO00o.f76233OooO00o;
                    Intent intent2 = new Intent(activityC21897OooOo0, (Class<?>) ScreenCaptureForegroundService.class);
                    intent2.putExtra("user_grant_op_result", result);
                    intent2.putExtra("roi", c29726OooO0oo.f105406OooO00o);
                    Size size = c29726OooO0oo.f105407OooO0O0;
                    int[] iArr = {size.getWidth(), size.getHeight()};
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    intent2.putExtra("screen_size", iArr);
                    activityC21897OooOo0.startForegroundService(intent2);
                    activityC21897OooOo0.bindService(intent2, oooO00o.f76237OooO0o, 1);
                }
            }
        });
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult3, "registerForActivityResult(...)");
        this.f76503Ooooo0o = oooO0O0RegisterForActivityResult3;
        OooO0o.OooO0O0<String> oooO0O0RegisterForActivityResult4 = registerForActivityResult(new C20438OooO0oO(), new OooO0o.OooO00o() { // from class: o0o000oo.OooOOO
            @Override // OooO0o.OooO00o
            public final void OooO0O0(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                BaseToolbarChildFragment baseToolbarChildFragment = this.f105784OooOo0o;
                baseToolbarChildFragment.OoooOo0(C34438OooOoo0.f123458OooOo0o);
                if (zBooleanValue) {
                    baseToolbarChildFragment.Oooo0OO().OooOooo(false);
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment.Oooo0O0()), null, null, new C29829OooOooO(baseToolbarChildFragment, null), 3);
                    return;
                }
                String string = baseToolbarChildFragment.getString(R.string.request_permission_title_record_audio);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                String string2 = baseToolbarChildFragment.getString(R.string.request_permission_content_record_audio);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(baseToolbarChildFragment), new C28783o000O000(string, string2));
            }
        });
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult4, "registerForActivityResult(...)");
        this.f76504OooooO0 = oooO0O0RegisterForActivityResult4;
        OooO0o.OooO0O0<String> oooO0O0RegisterForActivityResult5 = registerForActivityResult(new C20438OooO0oO(), new C28186Oooo0o0(this, 1));
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult5, "registerForActivityResult(...)");
        this.f76505OooooOO = oooO0O0RegisterForActivityResult5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOoOO(BaseToolbarChildFragment baseToolbarChildFragment) {
        int i = 0;
        if (!((Boolean) baseToolbarChildFragment.Oooo0OO().f73426o00ooo.f121747OooOo0o.getValue()).booleanValue()) {
            baseToolbarChildFragment.Oooo0OO().OoooO0O(C34429OooOOo0.OooOO0o(0, 1), false);
            return;
        }
        Integer num = (Integer) baseToolbarChildFragment.Oooo0OO().f73381Oooo00o.f121747OooOo0o.getValue();
        if (num == null || num.intValue() != 1) {
            if (num == null || num.intValue() != 2) {
                return;
            } else {
                i = 1;
            }
        }
        baseToolbarChildFragment.Oooo0OO().OoooO0O(com.facebook.soloader.OooOo.OooO0oO(Integer.valueOf(i)), true);
    }

    public static final void OooOoo(BaseToolbarChildFragment baseToolbarChildFragment) {
        InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) baseToolbarChildFragment.f76496OoooOO0.get(1);
        Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
        InterfaceC29892OooO0oO interfaceC29892OooO0oO = value instanceof InterfaceC29892OooO0oO ? (InterfaceC29892OooO0oO) value : null;
        if (interfaceC29892OooO0oO != null) {
            interfaceC29892OooO0oO.OooO00o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        if (r13 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        if (r13 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoo0(BaseToolbarChildFragment baseToolbarChildFragment, Context context, NoteContent noteContent, int i, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C29826OooOoOO c29826OooOoOO;
        File file;
        ExportRequest noteExport;
        baseToolbarChildFragment.getClass();
        if (abstractC32479OooO0OO instanceof C29826OooOoOO) {
            c29826OooOoOO = (C29826OooOoOO) abstractC32479OooO0OO;
            int i2 = c29826OooOoOO.f105816OooOoo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29826OooOoOO.f105816OooOoo = i2 - Integer.MIN_VALUE;
            } else {
                c29826OooOoOO = new C29826OooOoOO(baseToolbarChildFragment, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c29826OooOoOO.f105815OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c29826OooOoOO.f105816OooOoo;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            String id = i == 1 ? noteContent.getPages().get(noteContent.getSavedPageIndex()).getId() : null;
            ExportBottomSheetFragment.OooO00o oooO00o = ExportBottomSheetFragment.f71509OoooOoO;
            if (i == 0) {
                List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(noteContent.getId());
                c29826OooOoOO.f105812OooOo0o = baseToolbarChildFragment;
                c29826OooOoOO.f105811OooOo = noteContent;
                c29826OooOoOO.f105814OooOoO0 = str;
                c29826OooOoOO.f105813OooOoO = i;
                c29826OooOoOO.f105816OooOoo = 1;
                objOooO00o = oooO00o.OooO00o(context, listOooO0oO, c29826OooOoOO);
            } else if (i != 1 || id == null || id.length() == 0) {
                file = null;
            } else {
                List listOooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(id);
                c29826OooOoOO.f105812OooOo0o = baseToolbarChildFragment;
                c29826OooOoOO.f105811OooOo = noteContent;
                c29826OooOoOO.f105814OooOoO0 = str;
                c29826OooOoOO.f105813OooOoO = i;
                c29826OooOoOO.f105816OooOoo = 2;
                objOooO00o = oooO00o.OooO00o(context, listOooO0oO2, c29826OooOoOO);
            }
        }
        if (i3 == 1) {
            i = c29826OooOoOO.f105813OooOoO;
            str = c29826OooOoOO.f105814OooOoO0;
            noteContent = c29826OooOoOO.f105811OooOo;
            baseToolbarChildFragment = c29826OooOoOO.f105812OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            file = (File) objOooO00o;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO00o);
                return objOooO00o;
            }
            i = c29826OooOoOO.f105813OooOoO;
            str = c29826OooOoOO.f105814OooOoO0;
            noteContent = c29826OooOoOO.f105811OooOo;
            baseToolbarChildFragment = c29826OooOoOO.f105812OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            file = (File) objOooO00o;
        }
        if (file == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        if (i == 0) {
            String absolutePath = file.getAbsolutePath();
            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
            noteExport = new ExportRequest.NoteExport(absolutePath, str);
        } else if (i != 1) {
            noteExport = null;
        } else {
            String absolutePath2 = file.getAbsolutePath();
            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath2, "getAbsolutePath(...)");
            noteExport = new ExportRequest.PageExport(absolutePath2, noteContent.getId(), str);
        }
        if (noteExport == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
        C29828OooOoo0 c29828OooOoo0 = new C29828OooOoo0(baseToolbarChildFragment, noteExport, null);
        c29826OooOoOO.f105812OooOo0o = null;
        c29826OooOoOO.f105811OooOo = null;
        c29826OooOoOO.f105814OooOoO0 = null;
        c29826OooOoOO.f105816OooOoo = 3;
        Object objOooO0o = C33609OooO0oo.OooO0o(abstractC33687OooO0oO, c29828OooOoo0, c29826OooOoOO);
        return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOooO(BaseToolbarChildFragment baseToolbarChildFragment) {
        NoteContent noteContent = (NoteContent) baseToolbarChildFragment.Oooo0OO().f73396OoooOoO.f121747OooOo0o.getValue();
        String strOooOO0 = baseToolbarChildFragment.Oooo0OO().OooOO0();
        if (noteContent == null || strOooOO0 == null) {
            return;
        }
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(baseToolbarChildFragment), new C28745o000(noteContent.getId(), strOooOO0));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOooo(BaseToolbarChildFragment baseToolbarChildFragment, int i, Continuation continuation) {
        C29845OoooO0O c29845OoooO0O;
        boolean zBooleanValue;
        baseToolbarChildFragment.getClass();
        if (continuation instanceof C29845OoooO0O) {
            c29845OoooO0O = (C29845OoooO0O) continuation;
            int i2 = c29845OoooO0O.f105877OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29845OoooO0O.f105877OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c29845OoooO0O = new C29845OoooO0O(baseToolbarChildFragment, continuation);
            }
        }
        C29845OoooO0O c29845OoooO0O2 = c29845OoooO0O;
        Object objShowNonVipFeatureLimitedDialog$default = c29845OoooO0O2.f105876OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c29845OoooO0O2.f105877OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = baseToolbarChildFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c29845OoooO0O2.f105877OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c29845OoooO0O2, 6, null);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo() {
        o000o0O0.OooOo c28764o0000OOO;
        NoteContent noteContent = (NoteContent) Oooo0OO().f73396OoooOoO.f121747OooOo0o.getValue();
        String strOooOO0 = Oooo0OO().OooOO0();
        if (noteContent == null || strOooOO0 == null || noteContent.getUnboundedNote()) {
            return;
        }
        Ooooo0o();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        if (o0oo000O.OooOO0O.OooO00o(contextRequireContext)) {
            String noteId = noteContent.getId();
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
            c28764o0000OOO = new C28765o0000OOo(noteId, strOooOO0);
        } else {
            String noteId2 = noteContent.getId();
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId2, "noteId");
            c28764o0000OOO = new C28764o0000OOO(noteId2, strOooOO0);
        }
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this), c28764o0000OOO);
    }

    public final ImageView Oooo0() {
        ImageView imageView = this.f76493OoooO0;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("btnNextTools");
        throw null;
    }

    public final com.orion.notein.p607ui.noteeditor.audio.OooO0o Oooo000() {
        return (com.orion.notein.p607ui.noteeditor.audio.OooO0o) this.f76484Oooo00O.getValue();
    }

    public final ImageView Oooo00O() {
        ImageView imageView = this.f76489Oooo0o0;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("btnInputType");
        throw null;
    }

    public final ImageView Oooo00o() {
        ImageView imageView = this.f76495OoooO0O;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("btnMore");
        throw null;
    }

    public final InterfaceC21987OooOoo Oooo0O0() {
        InterfaceC21987OooOoo interfaceC21987OooOoo = this.f76482Oooo0;
        if (interfaceC21987OooOoo != null) {
            return interfaceC21987OooOoo;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
        throw null;
    }

    public final com.orion.notein.p607ui.noteeditor.OooO0OO Oooo0OO() {
        return (com.orion.notein.p607ui.noteeditor.OooO0OO) this.f76479OooOooO.getValue();
    }

    public final RecyclerView Oooo0o() {
        RecyclerView recyclerView = this.f76481Oooo;
        if (recyclerView != null) {
            return recyclerView;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("rvTools");
        throw null;
    }

    public final C28698OooOOOO Oooo0o0() {
        return (C28698OooOOOO) this.f76480OooOooo.getValue();
    }

    public final C30898OooOo00 Oooo0oO() {
        return (C30898OooOo00) this.f76483Oooo000.getValue();
    }

    public final o00Ooo Oooo0oo() {
        return (o00Ooo) this.f76485Oooo00o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OoooO(View view, boolean z) {
        if (view == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ToolbarChildFragment");
            c20358OooO00o.OooOO0O("handleOnPageConfigBtnClicked called with null view", new Object[0]);
            return;
        }
        NoteContent noteContent = (NoteContent) Oooo0OO().f73396OoooOoO.f121747OooOo0o.getValue();
        String strOooOO0 = Oooo0OO().OooOO0();
        if (noteContent == null || strOooOO0 == null) {
            return;
        }
        Ooooo0o();
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new C23580OooO0o0(view, z, null), 3);
    }

    public final void OoooO0() {
        Ooooo0o();
        OoooOo0(C34438OooOoo0.f123458OooOo0o);
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(Oooo0O0()), null, null, new C23579OooO0Oo(null), 3);
    }

    public final void OoooO00() {
        Ooooo0o();
        OoooOo0(C34449Oooo0oo.OooOO0(2));
        this.f76498OoooOOo = new OooO0O0();
        Context context = getContext();
        if (context == null) {
            return;
        }
        String str = (Build.VERSION.SDK_INT < 33 || context.getApplicationInfo().targetSdkVersion < 33) ? "android.permission.READ_EXTERNAL_STORAGE" : "android.permission.READ_MEDIA_IMAGES";
        if (ContextCompat.checkSelfPermission(requireContext(), str) == 0) {
            OooO0O0 oooO0O0 = this.f76498OoooOOo;
            if (oooO0O0 != null) {
                oooO0O0.run();
            }
            this.f76498OoooOOo = null;
            return;
        }
        String string = getString(R.string.request_read_external_permission_title);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        String string2 = getString(R.string.request_read_external_permission_to_import_image_file);
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
        Oooooo(string, string2);
        this.f76505OooooOO.OooO00o(str);
    }

    public void OoooO0O(View view) {
        Ooooo0o();
        Oooo0oo().OooO0o(4, !((Set) Oooo0oo().f105934OooOOOO.getValue()).contains(4));
        InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) this.f76496OoooOO0.get(9);
        Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
        C29883OooO0OO c29883OooO0OO = value instanceof C29883OooO0OO ? (C29883OooO0OO) value : null;
        if (c29883OooO0OO != null) {
            if (!C30983OooO0o.OooO00o(view, "getContext(...)")) {
                if (System.currentTimeMillis() - c29883OooO0OO.f106022OooO0Oo < 500) {
                    return;
                }
                ((PopupWindow) c29883OooO0OO.f106021OooO0OO.getValue()).showAsDropDown(view, 0, 0, GravityCompat.END);
            } else {
                FragmentManager childFragmentManager = C21929Ooooo0o.OooO0Oo(view).getChildFragmentManager();
                kotlin.jvm.internal.OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
                InsertFileBottomSheetDialog insertFileBottomSheetDialog = new InsertFileBottomSheetDialog();
                insertFileBottomSheetDialog.f76726OooOoO0 = c29883OooO0OO.f106019OooO00o;
                c29883OooO0OO.f106020OooO0O0 = insertFileBottomSheetDialog;
                insertFileBottomSheetDialog.show(childFragmentManager, "InsertFileBottomSheetDialog");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OoooOO0() {
        NoteContent noteContent = (NoteContent) Oooo0OO().f73396OoooOoO.f121747OooOo0o.getValue();
        String strOooOO0 = Oooo0OO().OooOO0();
        if (noteContent == null || strOooOO0 == null || noteContent.getUnboundedNote()) {
            return;
        }
        Ooooo0o();
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(Oooo0O0()), null, null, new OooO0o(noteContent, strOooOO0, null), 3);
    }

    public void OoooOOO(Integer num) {
        Oooo00O().setVisibility(num != null ? 0 : 8);
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

    public void OoooOOo(List<C29909OooO0O0> items) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(items, "items");
        LinkedHashMap linkedHashMap = this.f76496OoooOO0;
        if (linkedHashMap.containsKey(1)) {
            InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) linkedHashMap.get(1);
            Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
            InterfaceC29892OooO0oO interfaceC29892OooO0oO = value instanceof InterfaceC29892OooO0oO ? (InterfaceC29892OooO0oO) value : null;
            if (interfaceC29892OooO0oO != null) {
                interfaceC29892OooO0oO.OooO0o(items);
            }
        }
    }

    public final void OoooOo0(Set<Integer> set) {
        for (Map.Entry entry : this.f76496OoooOO0.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) entry.getValue();
            if (!set.contains(Integer.valueOf(iIntValue))) {
                Object value = interfaceC32440OooOO0.getValue();
                if (value instanceof C31113OooO0O0) {
                    ((C31113OooO0O0) value).dismiss();
                } else if (value instanceof InterfaceC29892OooO0oO) {
                    ((InterfaceC29892OooO0oO) value).OooO00o();
                } else if (value instanceof InterfaceC29879OooO0o) {
                    ((InterfaceC29879OooO0o) value).hide();
                } else if (value instanceof o0OoO.OooO0o) {
                    o0OoO.OooO0o oooO0o = (o0OoO.OooO0o) value;
                    synchronized (oooO0o) {
                        oooO0o.f101033OooO0OO.dismiss();
                    }
                } else if (value instanceof C29192OooO0o0) {
                    ((C29192OooO0o0) value).f103529OooO0Oo.dismiss();
                } else if (value instanceof InterfaceC29862OooO00o) {
                    ((InterfaceC29862OooO00o) value).OooO00o();
                } else if (value instanceof C29869OooO0Oo) {
                    ((C29869OooO0Oo) value).OooO00o();
                } else if (value instanceof InterfaceC29884OooO00o) {
                    ((InterfaceC29884OooO00o) value).OooO00o();
                } else if (value instanceof o0o00O0O.OooO0o) {
                    ((o0o00O0O.OooO0o) value).hide();
                } else if (value instanceof C29883OooO0OO) {
                    C29883OooO0OO c29883OooO0OO = (C29883OooO0OO) value;
                    InsertFileBottomSheetDialog insertFileBottomSheetDialog = c29883OooO0OO.f106020OooO0O0;
                    if (insertFileBottomSheetDialog != null) {
                        insertFileBottomSheetDialog.dismissAllowingStateLoss();
                    } else {
                        ((PopupWindow) c29883OooO0OO.f106021OooO0OO.getValue()).dismiss();
                    }
                } else if (value instanceof o0o00O0.OooO0o) {
                    ((o0o00O0.OooO0o) value).OooO00o();
                } else if (value instanceof C29870OooO0o0) {
                    PopupWindow popupWindow = ((C29870OooO0o0) value).f105997OooO00o;
                    if (popupWindow.isShowing()) {
                        popupWindow.dismiss();
                    }
                }
            }
        }
    }

    public void OoooOoo(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_tools);
        kotlin.jvm.internal.OooOOO0.OooO0oO(recyclerView, "<set-?>");
        this.f76481Oooo = recyclerView;
        Boolean bool = (Boolean) Oooo0oo().f105930OooOO0O.getValue();
        C29719OooO00o c29719OooO00o = new C29719OooO00o(bool != null ? bool.booleanValue() : true);
        this.f76494OoooO00 = c29719OooO00o;
        c29719OooO00o.f105372OooO0OO = new ViewOnClickListenerC28147OooO(this, 3);
        RecyclerView recyclerViewOooo0o = Oooo0o();
        C29719OooO00o c29719OooO00o2 = this.f76494OoooO00;
        if (c29719OooO00o2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolsAdapter");
            throw null;
        }
        recyclerViewOooo0o.setAdapter(c29719OooO00o2);
        Oooo0o().addOnScrollListener(new C23582OooO0oo());
        ImageView imageView = (ImageView) view.findViewById(R.id.btn_next_tools);
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageView, "<set-?>");
        this.f76493OoooO0 = imageView;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.cl_middle);
        kotlin.jvm.internal.OooOOO0.OooO0oO(constraintLayout, "<set-?>");
        this.f76491Oooo0oo = constraintLayout;
        constraintLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0o000oo.OooO0oO
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f105777OooOo0o.f76497OoooOOO.sendEmptyMessageDelayed(1, 0L);
            }
        });
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(Oooo0O0()), null, null, new OooO(null), 3);
    }

    public void Ooooo00(View view) {
        LinkedHashMap linkedHashMap = this.f76496OoooOO0;
        linkedHashMap.clear();
        linkedHashMap.put(0, C20519OooO0Oo.OooO0OO(new C28619OooOOo0(view, 2)));
        linkedHashMap.put(1, C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0o000oo.OooO0OO
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                InterfaceC29892OooO0oO c29887OooO0O0;
                BaseToolbarChildFragment baseToolbarChildFragment = this.f105773OooOo0o;
                Context contextRequireContext = baseToolbarChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                if (C28038OooO0Oo.OooO0O0(contextRequireContext)) {
                    Context contextRequireContext2 = baseToolbarChildFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                    c29887OooO0O0 = new DialogC29886OooO00o(contextRequireContext2);
                } else {
                    Context contextRequireContext3 = baseToolbarChildFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext3, "requireContext(...)");
                    c29887OooO0O0 = new C29887OooO0O0(contextRequireContext3);
                }
                c29887OooO0O0.OooOO0O(new C29825OooOoO0(baseToolbarChildFragment));
                c29887OooO0O0.OooOOOO(((Boolean) baseToolbarChildFragment.Oooo0OO().f73411o00000O.f121747OooOo0o.getValue()).booleanValue());
                c29887OooO0O0.OooO0o((List) baseToolbarChildFragment.Oooo0oo().f105942OooOo0o.f121747OooOo0o.getValue());
                return c29887OooO0O0;
            }
        }));
        linkedHashMap.put(2, C20519OooO0Oo.OooO0OO(new o0Oooo.OooOo00(this, 1)));
        int i = 2;
        linkedHashMap.put(3, C20519OooO0Oo.OooO0OO(new C29264OooOOO(this, i)));
        linkedHashMap.put(4, C20519OooO0Oo.OooO0OO(new C29006OooOOoo(this, i)));
        linkedHashMap.put(5, C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0o000oo.OooO0Oo
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                BaseToolbarChildFragment baseToolbarChildFragment = this.f105774OooOo0o;
                Context contextRequireContext = baseToolbarChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                InterfaceC29862OooO00o oooO0O0 = C28038OooO0Oo.OooO0O0(contextRequireContext) ? new o0o00O.OooO0O0(contextRequireContext) : new o0o00O.OooO0OO(contextRequireContext);
                oooO0O0.OooO0oO(new C29823OooOo0o(baseToolbarChildFragment));
                return oooO0O0;
            }
        }));
        linkedHashMap.put(6, C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0o000oo.OooO0o0
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                final BaseToolbarChildFragment baseToolbarChildFragment = this.f105776OooOo0o;
                Context contextRequireContext = baseToolbarChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                final C29869OooO0Oo c29869OooO0Oo = new C29869OooO0Oo(contextRequireContext);
                c29869OooO0Oo.OooO0Oo(new View.OnClickListener() { // from class: o0o000oo.OooO0oo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        BaseToolbarChildFragment baseToolbarChildFragment2 = baseToolbarChildFragment;
                        baseToolbarChildFragment2.Ooooo0o();
                        baseToolbarChildFragment2.OoooOo0(C34438OooOoo0.f123458OooOo0o);
                        int i2 = c29869OooO0Oo.f105988OooOO0;
                        if (view2.getId() != R.id.btn_do_not_show_again) {
                            return;
                        }
                        baseToolbarChildFragment2.Oooo0OO().OooOOo0(i2);
                    }
                });
                c29869OooO0Oo.OooO0OO(new PopupWindow.OnDismissListener() { // from class: o0o000oo.OooO
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        baseToolbarChildFragment.Oooo0OO().OooOoo0(c29869OooO0Oo.f105988OooOO0);
                    }
                });
                return c29869OooO0Oo;
            }
        }));
        linkedHashMap.put(7, C20519OooO0Oo.OooO0OO(new o0O0ooo0.OooOOO0(this, i)));
        int i2 = 1;
        linkedHashMap.put(8, C20519OooO0Oo.OooO0OO(new C29267OooOOo(this, i2)));
        linkedHashMap.put(9, C20519OooO0Oo.OooO0OO(new o0O0ooo0.OooOOOO(this, i2)));
        linkedHashMap.put(10, C20519OooO0Oo.OooO0OO(new C29252OooO(this, i2)));
        linkedHashMap.put(11, C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0o000oo.OooO00o
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                BaseToolbarChildFragment baseToolbarChildFragment = this.f105771OooOo0o;
                Context contextRequireContext = baseToolbarChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C29821OooOo00 c29821OooOo00 = new C29821OooOo00(baseToolbarChildFragment);
                return C28038OooO0Oo.OooO0O0(contextRequireContext) ? new DialogC29872OooO0O0(contextRequireContext, c29821OooOo00) : new C29873OooO0Oo(contextRequireContext, c29821OooOo00);
            }
        }));
        linkedHashMap.put(21, C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0o000oo.OooO0O0
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                o0o00O0.OooO0o oooO0OO;
                BaseToolbarChildFragment baseToolbarChildFragment = this.f105772OooOo0o;
                Context contextRequireContext = baseToolbarChildFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                if (C28038OooO0Oo.OooO0O0(contextRequireContext)) {
                    Context contextRequireContext2 = baseToolbarChildFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                    oooO0OO = new DialogC29865OooO00o(contextRequireContext2);
                } else {
                    Context contextRequireContext3 = baseToolbarChildFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext3, "requireContext(...)");
                    oooO0OO = new o0o00O0.OooO0OO(contextRequireContext3);
                }
                oooO0OO.OooOOO(new o0OO0o.OooO0OO(baseToolbarChildFragment));
                return oooO0OO;
            }
        }));
        ImageView imageView = (ImageView) view.findViewById(R.id.btn_home);
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageView, "<set-?>");
        C28050OooO0OO.OooO00o(imageView, 500L, new ViewOnClickListenerC28136OooO0O0(this, 3));
        ImageView imageView2 = (ImageView) view.findViewById(R.id.btn_note_switch);
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageView2, "<set-?>");
        C28050OooO0OO.OooO00o(imageView2, 500L, new ViewOnClickListenerC28155OooO0oo(this, 2));
        ImageView imageView3 = (ImageView) view.findViewById(R.id.btn_tiled_page);
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageView3, "<set-?>");
        this.f76487Oooo0OO = imageView3;
        C28050OooO0OO.OooO00o(imageView3, 500L, new ViewOnClickListenerC29029OoooO00(this, 1));
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(Oooo0O0()), null, null, new C29831Oooo(this, null), 3);
        ImageView imageView4 = (ImageView) view.findViewById(R.id.btn_input_type);
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageView4, "<set-?>");
        this.f76489Oooo0o0 = imageView4;
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(Oooo0O0()), null, null, new C29840Oooo0oO(this, null), 3);
        ImageView imageView5 = (ImageView) view.findViewById(R.id.btn_undo);
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageView5, "<set-?>");
        this.f76488Oooo0o = imageView5;
        C28050OooO0OO.OooO00o(imageView5, 100L, new ViewOnClickListenerC28151OooO0Oo(this, 1));
        ImageView imageView6 = (ImageView) view.findViewById(R.id.btn_redo);
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageView6, "<set-?>");
        this.f76490Oooo0oO = imageView6;
        C28050OooO0OO.OooO00o(imageView6, 100L, new ViewOnClickListenerC28153OooO0o0(this, 1));
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(Oooo0O0()), null, null, new C29844OoooO00(this, null), 3);
        OoooOoo(view);
        ImageView imageView7 = (ImageView) view.findViewById(R.id.btn_more);
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageView7, "<set-?>");
        this.f76495OoooO0O = imageView7;
        C28050OooO0OO.OooO00o(Oooo00o(), 500L, new ViewOnClickListenerC28152OooO0o(this, 1));
        ImageView imageView8 = (ImageView) view.findViewById(R.id.btn_menu);
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageView8, "<set-?>");
        this.f76492OoooO = imageView8;
        C28050OooO0OO.OooO00o(imageView8, 500L, new ViewOnClickListenerC28158OooOO0o(this, 3));
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(Oooo0O0()), null, null, new C29841Oooo0oo(this, null), 3);
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(Oooo0O0()), null, null, new OooOO0(view, this, null), 3);
    }

    public final void Ooooo0o() {
        Fragment parentFragment = getParentFragment();
        NoteEditorContainerFragment noteEditorContainerFragment = parentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment : null;
        if (noteEditorContainerFragment != null) {
            NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
        }
    }

    public void OooooO0(View view, InterfaceC21987OooOoo interfaceC21987OooOoo) {
        this.f76482Oooo0 = interfaceC21987OooOoo;
        this.f76486Oooo0O0 = view;
        Ooooo00(view);
    }

    public final void OooooOO(int i, Object obj) {
        Fragment parentFragment = getParentFragment();
        NoteEditorContainerFragment noteEditorContainerFragment = parentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment : null;
        if (noteEditorContainerFragment != null) {
            noteEditorContainerFragment.Oooo0OO(i, obj);
        }
    }

    public final void OooooOo(int i) {
        InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) this.f76496OoooOO0.get(6);
        Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
        if ((value instanceof C29869OooO0Oo) && ((C29869OooO0Oo) value).OooO0o0(Oooo00O(), i, 80)) {
            Oooo0OO().OooOOo(i);
        }
    }

    public final void Oooooo(String str, String str2) {
        InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) this.f76496OoooOO0.get(0);
        Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
        C31113OooO0O0 c31113OooO0O0 = value instanceof C31113OooO0O0 ? (C31113OooO0O0) value : null;
        if (c31113OooO0O0 == null) {
            return;
        }
        View view = this.f76486Oooo0O0;
        if (view != null) {
            c31113OooO0O0.OooO00o(view, str, str2);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
    }

    public final void Oooooo0() {
        ActivityC21897OooOo0 activity = getActivity();
        if (activity == null) {
            return;
        }
        com.orion.notein.p607ui.noteeditor.screenshot.OooO00o oooO00o = this.f76499OoooOo0;
        if (oooO00o != null) {
            oooO00o.OooO0OO();
        }
        this.f76499OoooOo0 = null;
        com.orion.notein.p607ui.noteeditor.screenshot.OooO00o oooO00o2 = new com.orion.notein.p607ui.noteeditor.screenshot.OooO00o(activity, this.f76501OoooOoo, this.f76503Ooooo0o);
        this.f76499OoooOo0 = oooO00o2;
        C25871OooO00o c25871OooO00o = new C25871OooO00o(activity);
        FloatConfig floatConfig = (FloatConfig) c25871OooO00o.f88281OooO0O0;
        floatConfig.setFloatTag("ScreenShotWindow");
        floatConfig.setLayoutId(Integer.valueOf(R.layout.layout_screenshot_window));
        floatConfig.setInvokeView(null);
        floatConfig.setShowPattern(EnumC31414OooO00o.f112174OooOo);
        floatConfig.setWidthMatch(true);
        floatConfig.setHeightMatch(true);
        o0O0OO0.OooO00o oooO00o3 = new o0O0OO0.OooO00o();
        OooO00o.C19727OooO00o c19727OooO00o = new OooO00o.C19727OooO00o();
        c19727OooO00o.f88336OooO00o = new o0o000.OooO(oooO00o2);
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        oooO00o3.f88335OooO00o = c19727OooO00o;
        floatConfig.setFloatCallbacks(oooO00o3);
        if (floatConfig.getLayoutId() == null && floatConfig.getLayoutView() == null) {
            c25871OooO00o.OooO00o("No layout exception. You need to set up the layout file.");
            return;
        }
        if (floatConfig.getShowPattern() == EnumC31414OooO00o.f112175OooOo0o) {
            c25871OooO00o.OooO0O0();
        } else if (C25052OooO0Oo.OooO0OO(activity)) {
            c25871OooO00o.OooO0O0();
        } else {
            o0O0OO0O.OooO0O0.f88338OooOo0o = c25871OooO00o;
            activity.getFragmentManager().beginTransaction().add(new o0O0OO0O.OooO0O0(), activity.getLocalClassName()).commitAllowingStateLoss();
        }
    }

    public final void o000oOoO() {
        Ooooo0o();
        OoooOo0(C34449Oooo0oo.OooOO0(3));
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(Oooo0O0()), null, null, new C23581OooO0oO(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        OoooOo0(C34438OooOoo0.f123458OooOo0o);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("ToolbarChildFragment");
        c20358OooO00o.OooO00o("ToolbarChildFragment destroyed", new Object[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        OoooOo0(C34438OooOoo0.f123458OooOo0o);
        this.f76496OoooOO0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.orion.notein.p607ui.noteeditor.screenshot.OooO00o oooO00o = this.f76499OoooOo0;
        if (oooO00o != null) {
            oooO00o.OooO0OO();
        }
    }
}
