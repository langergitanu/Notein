package com.orion.notein.p607ui.noteeditor.audio;

import OooO0oO.C20439OooO0oo;
import OooOoOO.C20519OooO0Oo;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.note.AudioSyncRecord;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.audio.view.WaveBarsStreamView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000OO00.C24456OooOOOo;
import o000OO00.C24469OooOoO;
import o000o00.AbstractC24555OooO00o;
import o0OoOOo.C29132OooO0o0;
import o0OoOOo.C29142OooOOO0;
import o0ooOOoo.InterfaceC31661OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/audio/AudioBarChildFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AudioBarChildFragment extends Hilt_AudioBarChildFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f74158OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f74159OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public InterfaceC21987OooOoo f74160OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f74161OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ViewGroup f74162Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f74163Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public ImageView f74164Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ImageView f74165Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f74166Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f74167Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f74168Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public SeekBar f74169Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public ViewGroup f74170Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TextView f74171Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TextView f74172Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final SimpleDateFormat f74173OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public TextView f74174OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public WaveBarsStreamView f74175OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final OooO00o f74176OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public InterfaceC31661OooO0oO f74177OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f74178OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f74179OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final C32447OooOOo f74180o000oOoO;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f74181OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74181OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74181OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? AudioBarChildFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public final class OooO00o extends Handler {
        public OooO00o() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message msg) {
            NoteEditorContainerFragment noteEditorContainerFragment;
            OooOOO0.OooO0oO(msg, "msg");
            if (msg.what == 0) {
                Object obj = msg.obj;
                OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.Boolean");
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                AudioBarChildFragment audioBarChildFragment = AudioBarChildFragment.this;
                if (!zBooleanValue) {
                    C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
                    Fragment parentFragment = audioBarChildFragment.getParentFragment();
                    noteEditorContainerFragment = parentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment : null;
                    if (noteEditorContainerFragment != null) {
                        noteEditorContainerFragment.Oooo0OO(31, c34434OooOoO);
                        return;
                    }
                    return;
                }
                Iterable iterable = (Iterable) audioBarChildFragment.OooOoo0().f74243OooOoO0.f121747OooOo0o.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    int audioPosition = ((AudioSyncRecord) obj2).getAudioPosition();
                    SeekBar seekBar = audioBarChildFragment.f74169Oooo0o;
                    if (seekBar == null) {
                        OooOOO0.OooOOOO("playerProgress");
                        throw null;
                    }
                    if (audioPosition >= seekBar.getProgress()) {
                        arrayList.add(obj2);
                    }
                }
                Fragment parentFragment2 = audioBarChildFragment.getParentFragment();
                noteEditorContainerFragment = parentFragment2 instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment2 : null;
                if (noteEditorContainerFragment != null) {
                    noteEditorContainerFragment.Oooo0OO(31, arrayList);
                }
                sendMessageDelayed(Message.obtain(this, 0, bool), 100L);
            }
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C24456OooOOOo f74184OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C24456OooOOOo c24456OooOOOo) {
            super(0);
            this.f74184OooOo0o = c24456OooOOOo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f74184OooOo0o.invoke();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74185OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74185OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f74185OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23387OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74186OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23387OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74186OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74186OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C29132OooO0o0 f74187OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C29132OooO0o0 c29132OooO0o0) {
            super(0);
            this.f74187OooOo0o = c29132OooO0o0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f74187OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23388OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f74188OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23388OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74188OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74188OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? AudioBarChildFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23389OooO0oO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74190OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23389OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74190OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f74190OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23390OooO0oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74191OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23390OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74191OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74191OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public AudioBarChildFragment() {
        C24456OooOOOo c24456OooOOOo = new C24456OooOOOo(this, 1);
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0O0(c24456OooOOOo));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f74159OooOoo0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.OooO0OO.class), new OooO0OO(interfaceC32440OooOO0OooO0O0), new C23388OooO0o0(interfaceC32440OooOO0OooO0O0), new C23387OooO0Oo(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new OooO0o(new C29132OooO0o0(this, 0)));
        this.f74158OooOoo = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.audio.OooO0o.class), new C23389OooO0oO(interfaceC32440OooOO0OooO0O02), new OooO(interfaceC32440OooOO0OooO0O02), new C23390OooO0oo(interfaceC32440OooOO0OooO0O02));
        this.f74176OoooO0O = new OooO00o();
        this.f74173OoooO = new SimpleDateFormat("mm:ss", Locale.getDefault());
        this.f74180o000oOoO = C20519OooO0Oo.OooO0OO(new C24469OooOoO(this, 1));
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20439OooO0oo(), new com.google.android.datatransport.runtime.scheduling.jobscheduling.OooOOOO(this, 2));
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f74179OoooOOo = oooO0O0RegisterForActivityResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoO(AudioBarChildFragment audioBarChildFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29142OooOOO0 c29142OooOOO0;
        boolean zBooleanValue;
        audioBarChildFragment.getClass();
        if (abstractC32479OooO0OO instanceof C29142OooOOO0) {
            c29142OooOOO0 = (C29142OooOOO0) abstractC32479OooO0OO;
            int i2 = c29142OooOOO0.f103304OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29142OooOOO0.f103304OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c29142OooOOO0 = new C29142OooOOO0(audioBarChildFragment, abstractC32479OooO0OO);
            }
        }
        C29142OooOOO0 c29142OooOOO02 = c29142OooOOO0;
        Object objShowNonVipFeatureLimitedDialog$default = c29142OooOOO02.f103303OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c29142OooOOO02.f103304OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = audioBarChildFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c29142OooOOO02.f103304OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c29142OooOOO02, 6, null);
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

    public final com.orion.notein.p607ui.noteeditor.OooO0OO OooOoOO() {
        return (com.orion.notein.p607ui.noteeditor.OooO0OO) this.f74159OooOoo0.getValue();
    }

    public final com.orion.notein.p607ui.noteeditor.audio.OooO0o OooOoo0() {
        return (com.orion.notein.p607ui.noteeditor.audio.OooO0o) this.f74158OooOoo.getValue();
    }
}
