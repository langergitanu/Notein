package com.orion.notein.p607ui.noteeditor;

import OooO0Oo.AbstractC20413OooOo0O;
import OooO0Oo.RunnableC20410OooOOo0;
import OooO0oO.C20439OooO0oo;
import OooOoOO.C20519OooO0Oo;
import Oooo0.C20860Ooooooo;
import Oooo0oO.C21030OooOO0o;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.OooO0OO;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.C21904OooOoo0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.fragment.app.InterfaceC21913Oooo0o0;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.aspose.words.EditingLanguage;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.C22584OooO0oo;
import com.google.firebase.firestore.util.RunnableC22710OooO0Oo;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.App;
import com.orion.notein.MainActivity;
import com.orion.notein.NotesRoleEntryActivity;
import com.orion.notein.domain.models.note.Comment;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.note.Outline;
import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.DualLinkSource;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.image.ImportImagesFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment.C23214OooO0oO;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment.C23215OooO0oo;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment.C23216OooOO0o;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.C23384OooO0o0;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import com.orion.notein.p607ui.noteeditor.audio.view.WaveBarsStreamView;
import com.orion.notein.p607ui.noteeditor.captureeditor.CaptureEditorPanel;
import com.orion.notein.p607ui.noteeditor.editortab.LatestOpenedNoteTabFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.OooO0O0;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.ImmersiveToolbarChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.ToolbarChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.colorpicker.EyeDropperView;
import com.orion.notein.p607ui.noteeditor.toolbox.favorite.FavoriteToolBox;
import com.orion.notein.p607ui.noteeditor.view.NoteEditorContainer;
import com.orion.notein.p607ui.p609vo.FavoritePenVO;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import com.orion.notein.ui.noteeditor.NoteEditorContainerFragment.OooO;
import com.orion.notein.ui.noteeditor.NoteEditorContainerFragment.OooO0o;
import com.orion.notein.ui.noteeditor.NoteEditorContainerFragment.OooOO0;
import com.orion.notein.ui.noteeditor.NoteEditorContainerFragment.OooOO0O;
import com.orion.notein.ui.noteeditor.NoteEditorContainerFragment.OooOOO;
import com.orion.notein.ui.noteeditor.NoteEditorContainerFragment.OooOOO0;
import com.vivo.penengine.impl.VivoStylusGestureManagerImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import o0000oOO.AbstractC24338OooO0o0;
import o000O0oo.C24427OooOOOo;
import o000O0oo.RunnableC24438OooOoo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o00oOOO0.C25582OooO0O0;
import o0O0o0oO.ViewOnClickListenerC26036Oooo;
import o0O0o0oO.ViewOnClickListenerC26053OoooOoO;
import o0O0oO.ViewOnClickListenerC26091OooO00o;
import o0O0oo0O.ViewOnClickListenerC26210OooO00o;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.C26342o000Oo0O;
import o0OOo0o.C27424o000o0o;
import o0OOoO0O.C27745OooOo0;
import o0Oo00o.C28025OooO0O0;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oO.C28038OooO0Oo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0Ooo.ViewOnClickListenerC28136OooO0O0;
import o0Oo0o00.C28201OooooO0;
import o0Oo0o0o.C28237OooOOOO;
import o0Oo0o0o.C28242OooOo0;
import o0Oo0oO0.ViewOnClickListenerC28288OooO;
import o0Oo0ooO.ViewOnClickListenerC28408OooO0O0;
import o0Oo0ooO.ViewOnClickListenerC28413OooO0oO;
import o0OoO0.C28511OooO0o;
import o0OoO000.ViewOnClickListenerC28535OooOo0;
import o0OoO0OO.ViewOnClickListenerC28603OooO00o;
import o0OoO0OO.ViewOnClickListenerC28610OooO0oo;
import o0OoO0oo.C28693OooOO0;
import o0OoO0oo.C28698OooOOOO;
import o0OoO0oo.C28739OooooOO;
import o0OoO0oo.C28740OooooOo;
import o0OoO0oo.C28741Oooooo;
import o0OoO0oo.C28742Oooooo0;
import o0OoO0oo.C28747o00000;
import o0OoO0oo.C28749o000000O;
import o0OoO0oo.C28751o00000O;
import o0OoO0oo.C28752o00000O0;
import o0OoO0oo.C28753o00000OO;
import o0OoO0oo.C28754o00000Oo;
import o0OoO0oo.C28755o00000o0;
import o0OoO0oo.C28760o0000O00;
import o0OoO0oo.C28763o0000OO0;
import o0OoO0oo.C28769o0000Ooo;
import o0OoO0oo.C28772o0000o;
import o0OoO0oo.C28793o000OOoO;
import o0OoO0oo.C28796o000Oo00;
import o0OoO0oo.C28800o000OoOO;
import o0OoO0oo.C28801o000OoOo;
import o0OoO0oo.C28802o000Ooo;
import o0OoO0oo.C28803o000Ooo0;
import o0OoO0oo.C28804o000OooO;
import o0OoO0oo.C28829o000ooo0;
import o0OoO0oo.C28833o00O00o;
import o0OoO0oo.C28834o00O00oO;
import o0OoO0oo.C28874o00Oo00o;
import o0OoO0oo.C28961o00oOoOO;
import o0OoO0oo.C28969o00ooo;
import o0OoO0oo.C28975o0OoOo0;
import o0OoO0oo.C28977o0ooOO0;
import o0OoO0oo.C28978o0ooOOo;
import o0OoO0oo.C28982oo0o0Oo;
import o0OoO0oo.RunnableC28761o0000O0O;
import o0OoO0oo.RunnableC28780o0000oo;
import o0OoO0oo.RunnableC28872o00Oo0;
import o0OoO0oo.o000O;
import o0OoO0oo.o000OO00;
import o0OoO0oo.o000OOo0;
import o0OoOO00.C29006OooOOoo;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOOo.C29120OooOooO;
import o0OoOOo.C29135OooOO0;
import o0OoOOo.C29140OooOO0O;
import o0OoOOo.C29141OooOO0o;
import o0OoOOo.RunnableC29174OoooOoO;
import o0OoOOo.ViewOnClickListenerC29131OooO0o;
import o0OoOOo.ViewOnClickListenerC29133OooO0oO;
import o0OoOoo0.C29250OooOoO0;
import o0Ooo.C29285Oooo0o;
import o0Ooo.C29286Oooo0o0;
import o0Ooo.C29317OooooO0;
import o0Ooo.ViewOnClickListenerC29256OooO0Oo;
import o0Ooo.ViewOnClickListenerC29259OooO0oO;
import o0Ooo.ViewOnHoverListenerC29266OooOOOo;
import o0Ooo0oo.C29547o000OO0O;
import o0Ooo0oo.C29568oo000o;
import o0Ooo0oo.InterfaceC29545o000O0oo;
import o0o00Oo.C29895OooO0O0;
import o0o00Oo.C29899OooO0o0;
import o0o00Oo.C29901OooO0oo;
import o0o00Oo.C29904OooOOo;
import o0o00Oo.C29906OooOOoo;
import o0o00o0O.C29947OooO0OO;
import o0o00o0O.C29948OooO0Oo;
import o0o00o0O.C29949OooO0o;
import o0o00o0O.C29950OooO0o0;
import o0o00o0O.C29953OooOO0o;
import o0o00oOO.C30026OooO00o;
import o0o00oOO.C30027OooO0O0;
import o0oOOooO.C30898OooOo00;
import o0oo00oO.C31210OooO0OO;
import o0oo00oO.InterfaceC31209OooO0O0;
import o0oo00oO.InterfaceC31211OooO0Oo;
import o0oo00oO.InterfaceC31214OooO0oo;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32435OooO0Oo;
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
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33596OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/NoteEditorContainerFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteEditorContainerFragment extends Hilt_NoteEditorContainerFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f72807OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f72808OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f72809OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C24568OooO0oO f72810OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TextStyleBarChildFragment f72811Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public PenBarChildFragment f72812Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public DrawerLayout f72813Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public ConstraintLayout f72814Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public LatestOpenedNoteTabFragment f72815Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public PenBoxChildFragment f72816Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final C22026ooOO f72817Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final C22026ooOO f72818Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public AudioBarChildFragment f72819Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ImmersiveToolbarChildFragment f72820Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ToolbarChildFragment f72821Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final C22026ooOO f72822OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public LockNoteFragment f72823OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final C22026ooOO f72824OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ImportImagesFragment f72825OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public C31210OooO0OO f72826OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public Uri f72827OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public View f72828OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public View f72829OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public View f72830OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public NoteEditorContainer f72831OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public View f72832Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public FavoriteToolBox f72833Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public ConstraintLayout f72834OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public EyeDropperView f72835OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public View f72836OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public View f72837Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public View f72838Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public TextStyleBox f72839OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final C28969o00ooo f72840Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Handler f72841o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final C23212OooO0Oo f72842o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public long f72843o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public int f72844o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f72845o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public final C28978o0ooOOo f72846o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final OooO00o f72847o0OoOo0;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final OooO0O0 f72848oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final o00oO0O f72849ooOO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onResume$13$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f72850OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f72850OooOo = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorContainerFragment.this.new OooO(this.f72850OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            NoteEditorContainerFragment.this.Oooo0OO(14, this.f72850OooOo);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO00o extends BroadcastReceiver {
        public OooO00o() {
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onReceive(Context context, Intent intent) {
            String action;
            AbstractC24338OooO0o0.OooO00o<Integer> oooO00o;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("doubleClickReceiver");
            c20358OooO00o.OooO0o0("onReceive: " + intent, new Object[0]);
            NoteEditorContainerFragment noteEditorContainerFragment = NoteEditorContainerFragment.this;
            if (noteEditorContainerFragment.Oooo0o()) {
                if (intent == null || (action = intent.getAction()) == null) {
                    action = "";
                }
                int iHashCode = action.hashCode();
                if (iHashCode != -1280735189) {
                    if (iHashCode != -183461727) {
                        if (iHashCode == 67235801 && action.equals("com.hihonor.stylus.action.STYLUS_DOUBLE_CLICK")) {
                            oooO00o = App.f69548Oooo000;
                        }
                    } else if (action.equals("com.oplus.ipemanager.action.PENCIL_DOUBLE_CLICK")) {
                        oooO00o = App.f69554Oooo0o0;
                    }
                    oooO00o = App.f69548Oooo000;
                } else if (!action.equals("com.huawei.stylus.action.BUTTON_DOUBLE_PRESSED")) {
                    oooO00o = App.f69548Oooo000;
                }
                noteEditorContainerFragment.Oooo000().OooOo00(oooO00o, new C27745OooOo0(noteEditorContainerFragment, 1));
            }
        }
    }

    public static final class OooO0O0 implements DrawerLayout.InterfaceC21850OooO0Oo {
        public OooO0O0() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC21850OooO0Oo
        public final void onDrawerClosed(View drawerView) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(drawerView, "drawerView");
            com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = NoteEditorContainerFragment.this.Oooo00O();
            Boolean bool = Boolean.FALSE;
            C33781o00o0O c33781o00o0O = oooO0OOOooo00O.f73437ooOO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC21850OooO0Oo
        public final void onDrawerOpened(View drawerView) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(drawerView, "drawerView");
            com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = NoteEditorContainerFragment.this.Oooo00O();
            Boolean bool = Boolean.TRUE;
            C33781o00o0O c33781o00o0O = oooO0OOOooo00O.f73437ooOO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC21850OooO0Oo
        public final void onDrawerSlide(View drawerView, float f) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(drawerView, "drawerView");
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC21850OooO0Oo
        public final void onDrawerStateChanged(int i) {
        }
    }

    public static final class OooO0OO implements InterfaceC21913Oooo0o0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC32507OooOO0o<Fragment, C32460OooOooO> f72854OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Fragment f72855OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ NoteEditorContainerFragment f72856OooOoO0;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Fragment fragment, InterfaceC32507OooOO0o<? super Fragment, C32460OooOooO> interfaceC32507OooOO0o, NoteEditorContainerFragment noteEditorContainerFragment) {
            this.f72855OooOo0o = fragment;
            this.f72854OooOo = interfaceC32507OooOO0o;
            this.f72856OooOoO0 = noteEditorContainerFragment;
        }

        @Override // androidx.fragment.app.InterfaceC21913Oooo0o0
        public final void OooO00o(FragmentManager fragmentManager, Fragment fragment) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(fragmentManager, "fragmentManager");
            Fragment fragment2 = this.f72855OooOo0o;
            if (fragment.equals(fragment2)) {
                this.f72854OooOo.invoke(fragment2);
                this.f72856OooOoO0.getChildFragmentManager().f64814OooOOo0.remove(this);
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23212OooO0Oo implements MainActivity.OooO0O0 {
        public C23212OooO0Oo() {
        }

        @Override // com.orion.notein.MainActivity.OooO0O0
        public final void OooO00o(int i) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteEditorFragment");
            c20358OooO00o.OooO00o("Keyboard event received: code=%d", Integer.valueOf(i));
            NoteEditorContainerFragment noteEditorContainerFragment = NoteEditorContainerFragment.this;
            PenBarChildFragment penBarChildFragment = noteEditorContainerFragment.f72812Oooo0;
            if (penBarChildFragment != null && penBarChildFragment.OooooO0()) {
                c20358OooO00o.OooOOO0("doubleClickReceiver");
                c20358OooO00o.OooO0o0("onReceive: penbar isPopupWindowShow", new Object[0]);
                return;
            }
            PenBoxChildFragment penBoxChildFragment = noteEditorContainerFragment.f72816Oooo0O0;
            if (penBoxChildFragment != null && penBoxChildFragment.Ooooo00()) {
                c20358OooO00o.OooOOO0("doubleClickReceiver");
                c20358OooO00o.OooO0o0("onReceive: penbox isPopupWindowShow", new Object[0]);
                return;
            }
            EyeDropperView eyeDropperView = noteEditorContainerFragment.f72835OooooOO;
            if (eyeDropperView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("eyeDropperView");
                throw null;
            }
            if (eyeDropperView.getVisibility() == 0) {
                return;
            }
            if (i == 92) {
                NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
                noteEditorContainerFragment.Oooo0OO(34, null);
            } else if (i == 93) {
                NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
                noteEditorContainerFragment.Oooo0OO(35, null);
            }
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onResume$10$1$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {670, 674, 680}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public NoteEditorContainerFragment f72858OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public List f72859OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public C32443OooOOO f72860OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public Iterator f72861OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f72862OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ String f72863OooOoo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f72863OooOoo = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorContainerFragment.this.new OooO0o(this.f72863OooOoo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
        
            if (r14 == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00d6, code lost:
        
            if (r14.OooO(r11, r13) == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0124, code lost:
        
            if (r14 == r0) goto L44;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d6 -> B:34:0x00d9). Please report as a decompilation issue!!! */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list;
            Iterator it;
            NoteEditorContainerFragment noteEditorContainerFragment;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72862OooOoOO;
            String str = this.f72863OooOoo;
            NoteEditorContainerFragment noteEditorContainerFragment2 = NoteEditorContainerFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment2.Oooo00O();
                this.f72862OooOoOO = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28800o000OoOO(oooO0OOOooo00O, str, null), this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C32443OooOOO c32443OooOOO = this.f72860OooOoO;
                    it = this.f72861OooOoO0;
                    noteEditorContainerFragment = this.f72858OooOo;
                    list = this.f72859OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    noteEditorContainerFragment.Oooo0OO(12, c32443OooOOO);
                    if (it.hasNext()) {
                        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O2 = noteEditorContainerFragment2.Oooo00O();
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((Outline) it2.next()).getId());
                        }
                        this.f72859OooOo0o = null;
                        this.f72858OooOo = null;
                        this.f72861OooOoO0 = null;
                        this.f72860OooOoO = null;
                        this.f72862OooOoOO = 3;
                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28796o000Oo00(oooO0OOOooo00O2, str, arrayList, null), this);
                        if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                            objOooO0o = C32460OooOooO.f116667OooO00o;
                        }
                    } else {
                        c32443OooOOO = (C32443OooOOO) it.next();
                        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O3 = noteEditorContainerFragment.Oooo00O();
                        String str2 = (String) c32443OooOOO.f116637OooOo;
                        this.f72859OooOo0o = list;
                        this.f72858OooOo = noteEditorContainerFragment;
                        this.f72861OooOoO0 = it;
                        this.f72860OooOoO = c32443OooOOO;
                        this.f72862OooOoOO = 2;
                    }
                    return enumC32485OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            List list3 = (List) obj;
            ArrayList<Outline> arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                String quoteId = ((Outline) obj2).getQuoteId();
                if (quoteId != null && quoteId.length() != 0) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            for (Outline outline : arrayList2) {
                String pageId = outline.getPageId();
                String quoteId2 = outline.getQuoteId();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(quoteId2);
                arrayList3.add(new C32443OooOOO(pageId, quoteId2));
            }
            list = list3;
            it = arrayList3.iterator();
            noteEditorContainerFragment = noteEditorContainerFragment2;
            if (it.hasNext()) {
            }
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23213OooO0o0 extends AbstractC20413OooOo0O {
        public C23213OooO0o0() {
            super(true);
        }

        @Override // OooO0Oo.AbstractC20413OooOo0O
        public final void handleOnBackPressed() {
            NoteEditorContainerFragment noteEditorContainerFragment = NoteEditorContainerFragment.this;
            if (((Number) noteEditorContainerFragment.Oooo00O().f73408o000000.getValue()).intValue() == 0) {
                noteEditorContainerFragment.Oooo00O().Oooo0o(1);
                return;
            }
            if (System.currentTimeMillis() - noteEditorContainerFragment.f72843o00Oo0 < 2000) {
                C21030OooOO0o.OooO0OO(noteEditorContainerFragment).OooOOo0();
                return;
            }
            Context contextRequireContext = noteEditorContainerFragment.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            String string = noteEditorContainerFragment.getString(R.string.toast_exit_app_double_check);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
            noteEditorContainerFragment.f72843o00Oo0 = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onResume$11$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {692, 696, 701}, m80625m = "invokeSuspend")
    public static final class C23214OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public NoteEditorContainerFragment f72866OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public List f72867OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public C32443OooOOO f72868OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public Iterator f72869OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f72870OooOoOO;

        public C23214OooO0oO(Continuation<? super C23214OooO0oO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorContainerFragment.this.new C23214OooO0oO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23214OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            if (r13 == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00d4, code lost:
        
            if (r13.OooO(r10, r12) == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
        
            if (r13 == r0) goto L44;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d4 -> B:34:0x00d7). Please report as a decompilation issue!!! */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list;
            Iterator it;
            NoteEditorContainerFragment noteEditorContainerFragment;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72870OooOoOO;
            NoteEditorContainerFragment noteEditorContainerFragment2 = NoteEditorContainerFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment2.Oooo00O();
                this.f72870OooOoOO = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28801o000OoOo(oooO0OOOooo00O, null), this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C32443OooOOO c32443OooOOO = this.f72868OooOoO;
                    it = this.f72869OooOoO0;
                    noteEditorContainerFragment = this.f72866OooOo;
                    list = this.f72867OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    noteEditorContainerFragment.Oooo0OO(12, c32443OooOOO);
                    if (it.hasNext()) {
                        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O2 = noteEditorContainerFragment2.Oooo00O();
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((Outline) it2.next()).getId());
                        }
                        this.f72867OooOo0o = null;
                        this.f72866OooOo = null;
                        this.f72869OooOoO0 = null;
                        this.f72868OooOoO = null;
                        this.f72870OooOoOO = 3;
                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28796o000Oo00(oooO0OOOooo00O2, null, arrayList, null), this);
                        if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                            objOooO0o = C32460OooOooO.f116667OooO00o;
                        }
                    } else {
                        c32443OooOOO = (C32443OooOOO) it.next();
                        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O3 = noteEditorContainerFragment.Oooo00O();
                        String str = (String) c32443OooOOO.f116637OooOo;
                        this.f72867OooOo0o = list;
                        this.f72866OooOo = noteEditorContainerFragment;
                        this.f72869OooOoO0 = it;
                        this.f72868OooOoO = c32443OooOOO;
                        this.f72870OooOoOO = 2;
                    }
                    return enumC32485OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            List list3 = (List) obj;
            ArrayList<Outline> arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                String quoteId = ((Outline) obj2).getQuoteId();
                if (quoteId != null && quoteId.length() != 0) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            for (Outline outline : arrayList2) {
                String pageId = outline.getPageId();
                String quoteId2 = outline.getQuoteId();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(quoteId2);
                arrayList3.add(new C32443OooOOO(pageId, quoteId2));
            }
            list = list3;
            it = arrayList3.iterator();
            noteEditorContainerFragment = noteEditorContainerFragment2;
            if (it.hasNext()) {
            }
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onResume$12$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {712}, m80625m = "invokeSuspend")
    public static final class C23215OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72873OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f72874OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f72875OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23215OooO0oo(String str, String str2, Continuation<? super C23215OooO0oo> continuation) {
            super(2, continuation);
            this.f72875OooOoO0 = str;
            this.f72874OooOoO = str2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorContainerFragment.this.new C23215OooO0oo(this.f72875OooOoO0, this.f72874OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23215OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72873OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = NoteEditorContainerFragment.this.Oooo00O();
                this.f72873OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28834o00O00oO(oooO0OOOooo00O, this.f72875OooOoO0, this.f72874OooOoO, null), this);
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onResume$14$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorContainerFragment.this.new OooOO0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            NoteEditorContainerFragment noteEditorContainerFragment = NoteEditorContainerFragment.this;
            Context context = noteEditorContainerFragment.getContext();
            if (context != null) {
                ((C29051OooOO0o) noteEditorContainerFragment.f72824OoooO00.getValue()).OooO0oO(context);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onResume$5$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {583}, m80625m = "invokeSuspend")
    public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72878OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f72879OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f72880OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ String f72881OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(String str, String str2, String str3, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f72880OooOoO0 = str;
            this.f72879OooOoO = str2;
            this.f72881OooOoOO = str3;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorContainerFragment.this.new OooOO0O(this.f72880OooOoO0, this.f72879OooOoO, this.f72881OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72878OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = NoteEditorContainerFragment.this.Oooo00O();
                this.f72878OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o000O(oooO0OOOooo00O, this.f72880OooOoO0, this.f72879OooOoO, this.f72881OooOoOO, null), this);
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOO0o, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onResume$6$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {594, 602, 607}, m80625m = "invokeSuspend")
    public static final class C23216OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public NoteEditorContainerFragment f72882OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public List f72883OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public C32443OooOOO f72884OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public Iterator f72885OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f72886OooOoOO;

        public C23216OooOO0o(Continuation<? super C23216OooOO0o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorContainerFragment.this.new C23216OooOO0o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23216OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
        
            if (r13 == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00d4, code lost:
        
            if (r13.OooO(r10, r12) == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
        
            if (r13 == r0) goto L44;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00d4 -> B:34:0x00d7). Please report as a decompilation issue!!! */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list;
            Iterator it;
            NoteEditorContainerFragment noteEditorContainerFragment;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72886OooOoOO;
            NoteEditorContainerFragment noteEditorContainerFragment2 = NoteEditorContainerFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment2.Oooo00O();
                this.f72886OooOoOO = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28804o000OooO(oooO0OOOooo00O, null), this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    C32443OooOOO c32443OooOOO = this.f72884OooOoO;
                    it = this.f72885OooOoO0;
                    noteEditorContainerFragment = this.f72882OooOo;
                    list = this.f72883OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    noteEditorContainerFragment.Oooo0OO(12, c32443OooOOO);
                    if (it.hasNext()) {
                        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O2 = noteEditorContainerFragment2.Oooo00O();
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((Comment) it2.next()).getId());
                        }
                        this.f72883OooOo0o = null;
                        this.f72882OooOo = null;
                        this.f72885OooOoO0 = null;
                        this.f72884OooOoO = null;
                        this.f72886OooOoOO = 3;
                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28793o000OOoO(oooO0OOOooo00O2, arrayList, null), this);
                        if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                            objOooO0o = C32460OooOooO.f116667OooO00o;
                        }
                    } else {
                        c32443OooOOO = (C32443OooOOO) it.next();
                        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O3 = noteEditorContainerFragment.Oooo00O();
                        String str = (String) c32443OooOOO.f116637OooOo;
                        this.f72883OooOo0o = list;
                        this.f72882OooOo = noteEditorContainerFragment;
                        this.f72885OooOoO0 = it;
                        this.f72884OooOoO = c32443OooOOO;
                        this.f72886OooOoOO = 2;
                    }
                    return enumC32485OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            List list3 = (List) obj;
            ArrayList<Comment> arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                String quoteId = ((Comment) obj2).getQuoteId();
                if (quoteId != null && quoteId.length() != 0) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            for (Comment comment : arrayList2) {
                String pageId = comment.getPageId();
                String quoteId2 = comment.getQuoteId();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(quoteId2);
                arrayList3.add(new C32443OooOOO(pageId, quoteId2));
            }
            list = list3;
            it = arrayList3.iterator();
            noteEditorContainerFragment = noteEditorContainerFragment2;
            if (it.hasNext()) {
            }
            return enumC32485OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onResume$8$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {641}, m80625m = "invokeSuspend")
    public static final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72889OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f72890OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f72891OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(String str, String str2, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f72891OooOoO0 = str;
            this.f72890OooOoO = str2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorContainerFragment.this.new OooOOO(this.f72891OooOoO0, this.f72890OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72889OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = NoteEditorContainerFragment.this.Oooo00O();
                this.f72889OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28833o00O00o(oooO0OOOooo00O, this.f72891OooOoO0, this.f72890OooOoO, null), this);
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onResume$7$1$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {620, 622, 628}, m80625m = "invokeSuspend")
    public static final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public NoteEditorContainerFragment f72892OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Comment f72893OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f72894OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public String f72895OooOoO0;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ String f72897OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(String str, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f72897OooOoo0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorContainerFragment.this.new OooOOO0(this.f72897OooOoo0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
        
            if (r9 == r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Comment comment;
            String quoteId;
            NoteEditorContainerFragment noteEditorContainerFragment;
            Object objOooO0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72894OooOoO;
            String str = this.f72897OooOoo0;
            NoteEditorContainerFragment noteEditorContainerFragment2 = NoteEditorContainerFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment2.Oooo00O();
                this.f72894OooOoO = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28803o000Ooo0(oooO0OOOooo00O, str, null), this);
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
                quoteId = this.f72895OooOoO0;
                noteEditorContainerFragment = this.f72892OooOo;
                comment = this.f72893OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                noteEditorContainerFragment.Oooo0OO(12, new C32443OooOOO(comment.getPageId(), quoteId));
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O2 = noteEditorContainerFragment2.Oooo00O();
                this.f72893OooOo0o = null;
                this.f72892OooOo = null;
                this.f72895OooOoO0 = null;
                this.f72894OooOoO = 3;
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o000OOo0(oooO0OOOooo00O2, str, null), this);
                if (objOooO0o != enumC32485OooO00o) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
            }
            comment = (Comment) obj;
            quoteId = comment.getQuoteId();
            if (quoteId != null) {
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O3 = noteEditorContainerFragment2.Oooo00O();
                this.f72893OooOo0o = comment;
                this.f72892OooOo = noteEditorContainerFragment2;
                this.f72895OooOoO0 = quoteId;
                this.f72894OooOoO = 2;
                if (oooO0OOOooo00O3.OooO(quoteId, this) != enumC32485OooO00o) {
                    noteEditorContainerFragment = noteEditorContainerFragment2;
                    noteEditorContainerFragment.Oooo0OO(12, new C32443OooOOO(comment.getPageId(), quoteId));
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O22 = noteEditorContainerFragment2.Oooo00O();
                    this.f72893OooOo0o = null;
                    this.f72892OooOo = null;
                    this.f72895OooOoO0 = null;
                    this.f72894OooOoO = 3;
                    C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o000OOo0(oooO0OOOooo00O22, str, null), this);
                    if (objOooO0o != enumC32485OooO00o) {
                    }
                }
            } else {
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O222 = noteEditorContainerFragment2.Oooo00O();
                this.f72893OooOo0o = null;
                this.f72892OooOo = null;
                this.f72895OooOoO0 = null;
                this.f72894OooOoO = 3;
                C33874OooO0OO c33874OooO0OO222 = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o000OOo0(oooO0OOOooo00O222, str, null), this);
                if (objOooO0o != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onResume$9$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {657}, m80625m = "invokeSuspend")
    public static final class OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72899OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f72900OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f72901OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ String f72902OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(String str, String str2, String str3, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f72901OooOoO0 = str;
            this.f72900OooOoO = str2;
            this.f72902OooOoOO = str3;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorContainerFragment.this.new OooOOOO(this.f72901OooOoO0, this.f72900OooOoO, this.f72902OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72899OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = NoteEditorContainerFragment.this.Oooo00O();
                this.f72899OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o000OO00(oooO0OOOooo00O, this.f72901OooOoO0, this.f72900OooOoO, this.f72902OooOoOO, null), this);
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOOo, reason: case insensitive filesystem */
    public static final class C23217OooOOOo implements EyeDropperView.OooO00o {
        public C23217OooOOOo() {
        }

        @Override // com.orion.notein.ui.noteeditor.toolbox.colorpicker.EyeDropperView.OooO00o
        public final void OooO00o(int i) {
            NoteEditorContainerFragment noteEditorContainerFragment = NoteEditorContainerFragment.this;
            androidx.lifecycle.OooOo oooOoOooO00o = C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)");
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28749o000000O(noteEditorContainerFragment, i, null), 2);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$5", m80623f = "NoteEditorContainerFragment.kt", m80624l = {1008}, m80625m = "invokeSuspend")
    public static final class C23218OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72905OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$5$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {1009}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f72906OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f72907OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$5$1$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19253OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends String, ? extends Long>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorContainerFragment f72908OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19253OooO00o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C19253OooO00o> continuation) {
                    super(2, continuation);
                    this.f72908OooOo0o = noteEditorContainerFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19253OooO00o(this.f72908OooOo0o, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32443OooOOO<? extends String, ? extends Long> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19253OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f72908OooOo0o;
                    if (noteEditorContainerFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") != null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    String string = noteEditorContainerFragment.getString(R.string.tips);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    String string2 = noteEditorContainerFragment.getString(R.string.too_many_strokes_warning);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                    new TipsDialogFragment(string, string2, null, null).show(noteEditorContainerFragment.getChildFragmentManager(), "TipsDialogFragment");
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f72906OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f72906OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f72907OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f72906OooOo;
                    InterfaceC33721OooO0o interfaceC33721OooO0oOooOO0O = C25252OooO0Oo.OooOO0O(noteEditorContainerFragment.Oooo00O().f73429o0OOO0o, 1000L);
                    C19253OooO00o c19253OooO00o = new C19253OooO00o(noteEditorContainerFragment, null);
                    this.f72907OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(interfaceC33721OooO0oOooOO0O, c19253OooO00o, this) == enumC32485OooO00o) {
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

        public C23218OooOOo(Continuation<? super C23218OooOOo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorContainerFragment.this.new C23218OooOOo(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23218OooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72905OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
                NoteEditorContainerFragment noteEditorContainerFragment = NoteEditorContainerFragment.this;
                OooO00o oooO00o = new OooO00o(noteEditorContainerFragment, null);
                this.f72905OooOo0o = 1;
                if (C22005OoooOO0.OooO00o(noteEditorContainerFragment, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$4", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23219OooOOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f72910OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$4$9", m80623f = "NoteEditorContainerFragment.kt", m80624l = {1003}, m80625m = "invokeSuspend")
        public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f72911OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f72912OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$4$9$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Insets, Continuation<? super C32460OooOooO>, Object> {
                public OooO00o() {
                    throw null;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO00o(2, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Insets insets, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(insets, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO> continuation) {
                super(2, continuation);
                this.f72911OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO(this.f72911OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f72912OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = this.f72911OooOo.Oooo00O();
                    OooO00o oooO00o = new OooO00o(2, null);
                    this.f72912OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooo00O.f73365OooOo, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$4$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {908}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f72913OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f72914OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19254OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorContainerFragment f72915OooOo0o;

                public C19254OooO00o(NoteEditorContainerFragment noteEditorContainerFragment) {
                    this.f72915OooOo0o = noteEditorContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    Object next;
                    C28693OooOO0 c28693OooOO0 = (C28693OooOO0) obj;
                    if (c28693OooOO0 == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    try {
                        C32443OooOOO<DualLinkSource, DualLinkRef> c32443OooOOOOooO00o = c28693OooOO0.OooO00o();
                        DualLinkSource dualLinkSource = c32443OooOOOOooO00o.f116638OooOo0o;
                        DualLinkRef ref = c32443OooOOOOooO00o.f116637OooOo;
                        int i = c28693OooOO0.f101655OooO0O0;
                        int i2 = c28693OooOO0.f101662OooOO0;
                        NoteEditorContainerFragment noteEditorContainerFragment = this.f72915OooOo0o;
                        ActivityC21897OooOo0 activity = noteEditorContainerFragment.getActivity();
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(String.valueOf(activity != null ? activity.hashCode() : 0), c28693OooOO0.f101653OooO)) {
                            RectF rectF = c28693OooOO0.f101661OooO0oo;
                            if (rectF != null) {
                                dualLinkSource.getBounds().set(rectF);
                            }
                        } else if (i == -1) {
                            List<Integer> list = NoteEditorContainer.f76968Oooo0o;
                            ArrayList arrayList = new ArrayList();
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Fragment fragmentOooOooO = noteEditorContainerFragment.getChildFragmentManager().OooOooO(((Number) it.next()).intValue());
                                NoteEditorFragment noteEditorFragment = fragmentOooOooO instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO : null;
                                if (noteEditorFragment != null) {
                                    arrayList.add(noteEditorFragment);
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0((String) ((NoteEditorFragment) next).OoooOO0().f73589OoooOOo.getValue(), c28693OooOO0.f101656OooO0OO)) {
                                    break;
                                }
                            }
                            NoteEditorFragment noteEditorFragment2 = (NoteEditorFragment) next;
                            if (noteEditorFragment2 != null) {
                                noteEditorFragment2.OooooO0(dualLinkSource);
                                CaptureEditorPanel captureEditorPanel = noteEditorFragment2.f73027OooooOO;
                                if (captureEditorPanel == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("captureEditorPanel");
                                    throw null;
                                }
                                captureEditorPanel.setVisibility(8);
                            }
                        } else {
                            Integer num = (Integer) oOo000Oo.OooOo.OoooO00(i, NoteEditorContainer.f76968Oooo0o);
                            if (num != null) {
                                Fragment fragmentOooOooO2 = noteEditorContainerFragment.getChildFragmentManager().OooOooO(num.intValue());
                                NoteEditorFragment noteEditorFragment3 = fragmentOooOooO2 instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO2 : null;
                                if (noteEditorFragment3 != null) {
                                    noteEditorFragment3.OooooO0(dualLinkSource);
                                }
                            }
                        }
                        Integer num2 = (Integer) oOo000Oo.OooOo.OoooO00(i2, NoteEditorContainer.f76968Oooo0o);
                        if (num2 != null) {
                            Fragment fragmentOooOooO3 = noteEditorContainerFragment.getChildFragmentManager().OooOooO(num2.intValue());
                            NoteEditorFragment noteEditorFragment4 = fragmentOooOooO3 instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO3 : null;
                            if (noteEditorFragment4 != null) {
                                kotlin.jvm.internal.OooOOO0.OooO0oO(ref, "ref");
                                C34406OooO00o.f123390OooO00o.OooO00o("dual-link insertDualLinkRef " + noteEditorFragment4, new Object[0]);
                                InterfaceC21987OooOoo viewLifecycleOwner = noteEditorFragment4.getViewLifecycleOwner();
                                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28874o00Oo00o(ref, noteEditorFragment4, null), 3);
                            }
                        }
                        c28693OooOO0.OooO0O0(0);
                        return C32460OooOooO.f116667OooO00o;
                    } catch (Exception unused) {
                        c28693OooOO0.OooO0O0(0);
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f72913OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f72913OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f72914OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorContainerFragment noteEditorContainerFragment = this.f72913OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment.Oooo00O();
                C19254OooO00o c19254OooO00o = new C19254OooO00o(noteEditorContainerFragment);
                this.f72914OooOo0o = 1;
                oooO0OOOooo00O.f73370OooOoO.collect(c19254OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$4$2", m80623f = "NoteEditorContainerFragment.kt", m80624l = {961}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f72916OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f72917OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO0O0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$4$2$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorContainerFragment f72918OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f72918OooOo0o = noteEditorContainerFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f72918OooOo0o, continuation);
                    ((Boolean) obj).getClass();
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
                    this.f72918OooOo0o.getClass();
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f72916OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f72916OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f72917OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f72916OooOo;
                    C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) noteEditorContainerFragment.f72807OooOoo.getValue();
                    OooO00o oooO00o = new OooO00o(noteEditorContainerFragment, null);
                    this.f72917OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c26320o0000OoO.f90249OoooOOo, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$4$3", m80623f = "NoteEditorContainerFragment.kt", m80624l = {967}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f72919OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f72920OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO0OO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$4$3$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteMeta, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f72921OooOo0o;

                public OooO00o() {
                    throw null;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(2, continuation);
                    oooO00o.f72921OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(NoteMeta noteMeta, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(noteMeta, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    NoteMeta noteMeta = (NoteMeta) this.f72921OooOo0o;
                    C34406OooO00o.f123390OooO00o.OooO00o("focusedNoteMeta: " + noteMeta, new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f72919OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f72919OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f72920OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = this.f72919OooOo.Oooo00O();
                    OooO00o oooO00o = new OooO00o(2, null);
                    this.f72920OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooo00O.f73395OoooOo0, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$4$4", m80623f = "NoteEditorContainerFragment.kt", m80624l = {973}, m80625m = "invokeSuspend")
        public static final class C23220OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f72922OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f72923OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO0Oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$4$4$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteContent, Continuation<? super C32460OooOooO>, Object> {
                public OooO00o() {
                    throw null;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO00o(2, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(NoteContent noteContent, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(noteContent, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23220OooO0Oo(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C23220OooO0Oo> continuation) {
                super(2, continuation);
                this.f72922OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23220OooO0Oo(this.f72922OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23220OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f72923OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = this.f72922OooOo.Oooo00O();
                    OooO00o oooO00o = new OooO00o(2, null);
                    this.f72923OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooo00O.f73396OoooOoO, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO0o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$4$6", m80623f = "NoteEditorContainerFragment.kt", m80624l = {984}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f72924OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f72925OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO0o$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorContainerFragment f72926OooOo0o;

                public OooO00o(NoteEditorContainerFragment noteEditorContainerFragment) {
                    this.f72926OooOo0o = noteEditorContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List<FavoritePenVO> list = (List) obj;
                    FavoriteToolBox favoriteToolBox = this.f72926OooOo0o.f72833Ooooo0o;
                    if (favoriteToolBox != null) {
                        favoriteToolBox.OooO0o0(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("favoritePenBox");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f72924OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f72924OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f72925OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f72924OooOo;
                    com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo000 = noteEditorContainerFragment.Oooo000();
                    OooO00o oooO00o = new OooO00o(noteEditorContainerFragment);
                    this.f72925OooOo0o = 1;
                    if (oooO0O0Oooo000.f75205ooOO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$4$5", m80623f = "NoteEditorContainerFragment.kt", m80624l = {978}, m80625m = "invokeSuspend")
        public static final class C23221OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f72927OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f72928OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO0o0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorContainerFragment f72929OooOo0o;

                public OooO00o(NoteEditorContainerFragment noteEditorContainerFragment) {
                    this.f72929OooOo0o = noteEditorContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    FavoriteToolBox.OooO00o oooO00o = (FavoriteToolBox.OooO00o) obj;
                    if (oooO00o != null) {
                        FavoriteToolBox favoriteToolBox = this.f72929OooOo0o.f72833Ooooo0o;
                        if (favoriteToolBox == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("favoritePenBox");
                            throw null;
                        }
                        Log.d("FavoriteToolBox", "onMetadataChanged " + oooO00o);
                        if (favoriteToolBox.f76899Oooo00O.compareAndSet(false, true)) {
                            favoriteToolBox.postDelayed(new RunnableC20410OooOOo0(favoriteToolBox, oooO00o, 1), 300L);
                        } else {
                            boolean z = favoriteToolBox.getVisibility() == 0;
                            boolean z2 = oooO00o.f76902OooO00o;
                            if (z2 != z && !z2) {
                                favoriteToolBox.OooO0OO(false);
                            }
                            favoriteToolBox.setVisibility(z2 ? 0 : 8);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23221OooO0o0(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C23221OooO0o0> continuation) {
                super(2, continuation);
                this.f72927OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23221OooO0o0(this.f72927OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23221OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f72928OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f72927OooOo;
                    com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo000 = noteEditorContainerFragment.Oooo000();
                    OooO00o oooO00o = new OooO00o(noteEditorContainerFragment);
                    this.f72928OooOo0o = 1;
                    if (oooO0O0Oooo000.f75197Ooooooo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$4$7", m80623f = "NoteEditorContainerFragment.kt", m80624l = {990}, m80625m = "invokeSuspend")
        public static final class C23222OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f72930OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f72931OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO0oO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$4$7$1", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32460OooOooO, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteEditorContainerFragment f72932OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f72932OooOo0o = noteEditorContainerFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO00o(this.f72932OooOo0o, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32460OooOooO c32460OooOooO, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c32460OooOooO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f72932OooOo0o;
                    String string = noteEditorContainerFragment.getString(R.string.login_and_use_unbounded_note);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteEditorContainerFragment), new C28772o0000o(string));
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23222OooO0oO(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C23222OooO0oO> continuation) {
                super(2, continuation);
                this.f72930OooOo = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23222OooO0oO(this.f72930OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23222OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f72931OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f72930OooOo;
                    C33772OooooOo c33772OooooOo = noteEditorContainerFragment.Oooo00O().f73375OooOooO;
                    OooO00o oooO00o = new OooO00o(noteEditorContainerFragment, null);
                    this.f72931OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33772OooooOo, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOo0$OooO0oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$4$8", m80623f = "NoteEditorContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C23223OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteEditorContainerFragment f72933OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23223OooO0oo(NoteEditorContainerFragment noteEditorContainerFragment, Continuation<? super C23223OooO0oo> continuation) {
                super(2, continuation);
                this.f72933OooOo0o = noteEditorContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23223OooO0oo(this.f72933OooOo0o, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23223OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C30027OooO0O0 c30027OooO0O0 = (C30027OooO0O0) this.f72933OooOo0o.f72822OoooO.getValue();
                C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c30027OooO0O0), null, null, new C30026OooO00o(c30027OooO0O0, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public C23219OooOOo0(Continuation<? super C23219OooOOo0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C23219OooOOo0 c23219OooOOo0 = NoteEditorContainerFragment.this.new C23219OooOOo0(continuation);
            c23219OooOOo0.f72910OooOo0o = obj;
            return c23219OooOOo0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23219OooOOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f72910OooOo0o;
            NoteEditorContainerFragment noteEditorContainerFragment = NoteEditorContainerFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(noteEditorContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(noteEditorContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(noteEditorContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23220OooO0Oo(noteEditorContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23221OooO0o0(noteEditorContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(noteEditorContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23222OooO0oO(noteEditorContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23223OooO0oo(noteEditorContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO(noteEditorContainerFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOOoo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$onViewCreated$6", m80623f = "NoteEditorContainerFragment.kt", m80624l = {EditingLanguage.DANISH}, m80625m = "invokeSuspend")
    public static final class C23224OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72935OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Uri f72936OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23224OooOOoo(Uri uri, Continuation<? super C23224OooOOoo> continuation) {
            super(2, continuation);
            this.f72936OooOoO0 = uri;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteEditorContainerFragment.this.new C23224OooOOoo(this.f72936OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23224OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72935OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f72935OooOo0o = 1;
                if (C33644OoooO0.OooO00o(1000L, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(this.f72936OooOoO0);
            NoteEditorContainerFragment noteEditorContainerFragment = NoteEditorContainerFragment.this;
            noteEditorContainerFragment.Oooo0OO(1, listOooO0oO);
            noteEditorContainerFragment.f72827OoooOOO = null;
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooOo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return NoteEditorContainerFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOo0, reason: case insensitive filesystem */
    public static final class C23225OooOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23225OooOo0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return NoteEditorContainerFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooOo00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooOo00() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return NoteEditorContainerFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOo0O, reason: case insensitive filesystem */
    public static final class C23226OooOo0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23226OooOo0O() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return NoteEditorContainerFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOo0o, reason: case insensitive filesystem */
    public static final class C23227OooOo0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23227OooOo0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return NoteEditorContainerFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOoO, reason: case insensitive filesystem */
    public static final class C23228OooOoO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public C23228OooOoO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            NoteEditorContainerFragment noteEditorContainerFragment = NoteEditorContainerFragment.this;
            Bundle arguments = noteEditorContainerFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + noteEditorContainerFragment + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOoO0, reason: case insensitive filesystem */
    public static final class C23229OooOoO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23229OooOoO0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return NoteEditorContainerFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOoOO, reason: case insensitive filesystem */
    public static final class C23230OooOoOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72944OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23230OooOoOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72944OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72944OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorContainerFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOoo, reason: case insensitive filesystem */
    public static final class C23231OooOoo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23232OooOoo0 f72946OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23231OooOoo(C23232OooOoo0 c23232OooOoo0) {
            super(0);
            this.f72946OooOo0o = c23232OooOoo0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72946OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOoo0, reason: case insensitive filesystem */
    public static final class C23232OooOoo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23232OooOoo0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return NoteEditorContainerFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOooO, reason: case insensitive filesystem */
    public static final class C23233OooOooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72948OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23233OooOooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72948OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72948OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooOooo, reason: case insensitive filesystem */
    public static final class C23234OooOooo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72949OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23234OooOooo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72949OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72949OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$Oooo, reason: case insensitive filesystem */
    public static final class C23235Oooo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72950OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23235Oooo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72950OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72950OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class Oooo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72951OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72951OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72951OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class Oooo000 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72952OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72952OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72952OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorContainerFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$Oooo00O, reason: case insensitive filesystem */
    public static final class C23236Oooo00O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23236Oooo00O() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return NoteEditorContainerFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$Oooo00o, reason: case insensitive filesystem */
    public static final class C23237Oooo00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23236Oooo00O f72955OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23237Oooo00o(C23236Oooo00O c23236Oooo00O) {
            super(0);
            this.f72955OooOo0o = c23236Oooo00O;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72955OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$Oooo0O0, reason: case insensitive filesystem */
    public static final class C23238Oooo0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72956OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23238Oooo0O0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72956OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72956OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$Oooo0OO, reason: case insensitive filesystem */
    public static final class C23239Oooo0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23239Oooo0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return NoteEditorContainerFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$Oooo0o, reason: case insensitive filesystem */
    public static final class C23240Oooo0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23240Oooo0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return NoteEditorContainerFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$Oooo0o0, reason: case insensitive filesystem */
    public static final class C23241Oooo0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72959OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23241Oooo0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72959OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72959OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorContainerFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$Oooo0oO, reason: case insensitive filesystem */
    public static final class C23242Oooo0oO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23240Oooo0o f72961OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23242Oooo0oO(C23240Oooo0o c23240Oooo0o) {
            super(0);
            this.f72961OooOo0o = c23240Oooo0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72961OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$Oooo0oo, reason: case insensitive filesystem */
    public static final class C23243Oooo0oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72962OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23243Oooo0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72962OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72962OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OoooO, reason: case insensitive filesystem */
    public static final class C23244OoooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72963OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23244OoooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72963OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72963OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OoooO0, reason: case insensitive filesystem */
    public static final class C23245OoooO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23245OoooO0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return NoteEditorContainerFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OoooO00, reason: case insensitive filesystem */
    public static final class C23246OoooO00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72965OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23246OoooO00(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72965OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72965OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorContainerFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OoooO0O, reason: case insensitive filesystem */
    public static final class C23247OoooO0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23245OoooO0 f72967OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23247OoooO0O(C23245OoooO0 c23245OoooO0) {
            super(0);
            this.f72967OooOo0o = c23245OoooO0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72967OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OoooOO0, reason: case insensitive filesystem */
    public static final class C23248OoooOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72968OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23248OoooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72968OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72968OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OoooOOO, reason: case insensitive filesystem */
    public static final class C23249OoooOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72969OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23249OoooOOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72969OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72969OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorContainerFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OoooOOo, reason: case insensitive filesystem */
    public static final class C23250OoooOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23250OoooOOo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return NoteEditorContainerFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OoooOo0, reason: case insensitive filesystem */
    public static final class C23251OoooOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23250OoooOOo f72972OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23251OoooOo0(C23250OoooOOo c23250OoooOOo) {
            super(0);
            this.f72972OooOo0o = c23250OoooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72972OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OoooOoO, reason: case insensitive filesystem */
    public static final class C23252OoooOoO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72973OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23252OoooOoO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72973OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72973OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OoooOoo, reason: case insensitive filesystem */
    public static final class C23253OoooOoo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72974OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23253OoooOoo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72974OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72974OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$Ooooo00, reason: case insensitive filesystem */
    public static final class C23254Ooooo00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72975OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23254Ooooo00(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72975OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72975OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorContainerFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$Ooooo0o, reason: case insensitive filesystem */
    public static final class C23255Ooooo0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23255Ooooo0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return NoteEditorContainerFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooooO0, reason: case insensitive filesystem */
    public static final class C23256OooooO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23255Ooooo0o f72978OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23256OooooO0(C23255Ooooo0o c23255Ooooo0o) {
            super(0);
            this.f72978OooOo0o = c23255Ooooo0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72978OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooooOO, reason: case insensitive filesystem */
    public static final class C23257OooooOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72979OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23257OooooOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72979OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72979OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OooooOo, reason: case insensitive filesystem */
    public static final class C23258OooooOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72980OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23258OooooOo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72980OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72980OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$Oooooo, reason: case insensitive filesystem */
    public static final class C23259Oooooo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72981OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23259Oooooo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72981OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72981OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorContainerFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$Oooooo0, reason: case insensitive filesystem */
    public static final class C23260Oooooo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72983OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23260Oooooo0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72983OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72983OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$OoooooO, reason: case insensitive filesystem */
    public static final class C23261OoooooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23261OoooooO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return NoteEditorContainerFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$Ooooooo, reason: case insensitive filesystem */
    public static final class C23262Ooooooo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23261OoooooO f72985OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23262Ooooooo(C23261OoooooO c23261OoooooO) {
            super(0);
            this.f72985OooOo0o = c23261OoooooO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72985OooOo0o.invoke();
        }
    }

    public static final class o000oOoO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23239Oooo0OO f72986OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(C23239Oooo0OO c23239Oooo0OO) {
            super(0);
            this.f72986OooOo0o = c23239Oooo0OO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72986OooOo0o.invoke();
        }
    }

    public static final class o00O0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72987OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72987OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72987OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorContainerFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class o00Oo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72989OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72989OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72989OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class o00Ooo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72990OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72990OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72990OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteEditorContainerFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$o00o0O, reason: case insensitive filesystem */
    public static final class C23263o00o0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23263o00o0O() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return NoteEditorContainerFragment.this;
        }
    }

    public static final class o00oO0O implements MainActivity.OooO0OO {
        public o00oO0O() {
        }

        @Override // com.orion.notein.MainActivity.OooO0OO
        public final void OooO00o(InterfaceC31214OooO0oo.C31216OooO0o0 c31216OooO0o0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "NoteEditorFragment", "Stylus event received: ");
            InterfaceC31214OooO0oo.OooO00o oooO00o = c31216OooO0o0.f111333OooO00o;
            sbOooO0O0.append(oooO00o);
            c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
            final NoteEditorContainerFragment noteEditorContainerFragment = NoteEditorContainerFragment.this;
            if (noteEditorContainerFragment.Oooo0o()) {
                switch (oooO00o.ordinal()) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo000 = noteEditorContainerFragment.Oooo000();
                        C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(oooO0O0Oooo000), oooO0O0Oooo000.f75201o00Ooo, null, new C29547o000OO0O(oooO0O0Oooo000, c31216OooO0o0, null), 2);
                        break;
                    case 7:
                        noteEditorContainerFragment.requireActivity().runOnUiThread(new RunnableC28780o0000oo(noteEditorContainerFragment, 0));
                        break;
                    case 8:
                        noteEditorContainerFragment.requireActivity().runOnUiThread(new Runnable() { // from class: o0OoO0oo.o0000oO
                            @Override // java.lang.Runnable
                            public final void run() {
                                NoteEditorContainerFragment noteEditorContainerFragment2 = noteEditorContainerFragment;
                                NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment2);
                                noteEditorContainerFragment2.Oooo0OO(35, null);
                            }
                        });
                        break;
                    case 9:
                        noteEditorContainerFragment.requireActivity().runOnUiThread(new RunnableC22710OooO0Oo(noteEditorContainerFragment, 2));
                        break;
                    case 10:
                        noteEditorContainerFragment.requireActivity().runOnUiThread(new Runnable() { // from class: o0OoO0oo.o0000O0
                            @Override // java.lang.Runnable
                            public final void run() {
                                NoteEditorContainerFragment noteEditorContainerFragment2 = noteEditorContainerFragment;
                                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment2.Oooo00O();
                                Context contextRequireContext = noteEditorContainerFragment2.requireContext();
                                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                                InterfaceC29545o000O0oo interfaceC29545o000O0oo = oooO0OOOooo00O.Oooo0oo(contextRequireContext) ? noteEditorContainerFragment2.f72816Oooo0O0 : noteEditorContainerFragment2.f72812Oooo0;
                                if (interfaceC29545o000O0oo != null) {
                                    interfaceC29545o000O0oo.OooOOO0();
                                }
                            }
                        });
                        break;
                    case 11:
                        break;
                    case 12:
                        noteEditorContainerFragment.requireActivity().runOnUiThread(new RunnableC28761o0000O0O(noteEditorContainerFragment, 0));
                        break;
                    case 13:
                        noteEditorContainerFragment.requireActivity().runOnUiThread(new Runnable() { // from class: o0OoO0oo.o000OO
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo0002 = noteEditorContainerFragment.Oooo000();
                                C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(oooO0O0Oooo0002), oooO0O0Oooo0002.f75201o00Ooo, null, new C29568oo000o(oooO0O0Oooo0002, false, null), 2);
                            }
                        });
                        break;
                    default:
                        c20358OooO00o.OooOOO0("NoteEditorFragment");
                        c20358OooO00o.OooO00o("Stylus action not handled: " + oooO00o, new Object[0]);
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$o00oO0o, reason: case insensitive filesystem */
    public static final class C23264o00oO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72994OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23264o00oO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72994OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72994OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$o00ooo, reason: case insensitive filesystem */
    public static final class C23265o00ooo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23263o00o0O f72995OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23265o00ooo(C23263o00o0O c23263o00o0O) {
            super(0);
            this.f72995OooOo0o = c23263o00o0O;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72995OooOo0o.invoke();
        }
    }

    public static final class o0OoOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72996OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72996OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72996OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class oo000o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72997OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72997OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72997OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.NoteEditorContainerFragment$ooOO, reason: case insensitive filesystem */
    public static final class C23266ooOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72998OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23266ooOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72998OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72998OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [o0OoO0oo.o00ooo] */
    public NoteEditorContainerFragment() {
        C23239Oooo0OO c23239Oooo0OO = new C23239Oooo0OO();
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new o000oOoO(c23239Oooo0OO));
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f72808OooOoo0 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.OooO0OO.class), new C23260Oooooo0(interfaceC32440OooOO0OooO0O0), new o00Ooo(interfaceC32440OooOO0OooO0O0), new o00Oo0(interfaceC32440OooOO0OooO0O0));
        this.f72807OooOoo = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooOo00(), new C23226OooOo0O(), new C23225OooOo0());
        this.f72809OooOooO = new C22026ooOO(oooo0.OooO0O0(C28201OooooO0.class), new C23227OooOo0o(), new C23229OooOoO0(), new OooOo());
        this.f72810OooOooo = new C24568OooO0oO(oooo0.OooO0O0(C28763o0000OO0.class), new C23228OooOoO());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23265o00ooo(new C23263o00o0O()));
        new C22026ooOO(oooo0.OooO0O0(C29250OooOoO0.class), new oo000o(interfaceC32440OooOO0OooO0O02), new C23230OooOoOO(interfaceC32440OooOO0OooO0O02), new C23264o00oO0o(interfaceC32440OooOO0OooO0O02));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O03 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23231OooOoo(new C23232OooOoo0()));
        this.f72817Oooo0OO = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.class), new C23233OooOooO(interfaceC32440OooOO0OooO0O03), new Oooo000(interfaceC32440OooOO0OooO0O03), new C23234OooOooo(interfaceC32440OooOO0OooO0O03));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O04 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23237Oooo00o(new C23236Oooo00O()));
        this.f72818Oooo0o = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.noteeditor.audio.OooO0o.class), new Oooo0(interfaceC32440OooOO0OooO0O04), new C23241Oooo0o0(interfaceC32440OooOO0OooO0O04), new C23238Oooo0O0(interfaceC32440OooOO0OooO0O04));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O05 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23242Oooo0oO(new C23240Oooo0o()));
        new C22026ooOO(oooo0.OooO0O0(o0o000oo.o00Ooo.class), new C23243Oooo0oo(interfaceC32440OooOO0OooO0O05), new C23246OoooO00(interfaceC32440OooOO0OooO0O05), new C23235Oooo(interfaceC32440OooOO0OooO0O05));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O06 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23247OoooO0O(new C23245OoooO0()));
        this.f72824OoooO00 = new C22026ooOO(oooo0.OooO0O0(C29051OooOO0o.class), new C23244OoooO(interfaceC32440OooOO0OooO0O06), new C23249OoooOOO(interfaceC32440OooOO0OooO0O06), new C23248OoooOO0(interfaceC32440OooOO0OooO0O06));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O07 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23251OoooOo0(new C23250OoooOOo()));
        new C22026ooOO(oooo0.OooO0O0(C28698OooOOOO.class), new C23252OoooOoO(interfaceC32440OooOO0OooO0O07), new C23254Ooooo00(interfaceC32440OooOO0OooO0O07), new C23253OoooOoo(interfaceC32440OooOO0OooO0O07));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O08 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23256OooooO0(new C23255Ooooo0o()));
        new C22026ooOO(oooo0.OooO0O0(C30898OooOo00.class), new C23257OooooOO(interfaceC32440OooOO0OooO0O08), new C23259Oooooo(interfaceC32440OooOO0OooO0O08), new C23258OooooOo(interfaceC32440OooOO0OooO0O08));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O09 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23262Ooooooo(new C23261OoooooO()));
        this.f72822OoooO = new C22026ooOO(oooo0.OooO0O0(C30027OooO0O0.class), new o0OoOo0(interfaceC32440OooOO0OooO0O09), new o00O0O(interfaceC32440OooOO0OooO0O09), new C23266ooOO(interfaceC32440OooOO0OooO0O09));
        this.f72840Ooooooo = new VivoStylusGestureManagerImpl.OnGestureCallback() { // from class: o0OoO0oo.o00ooo
            @Override // com.vivo.penengine.impl.VivoStylusGestureManagerImpl.OnGestureCallback
            public final boolean onGesture(int i) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o, "VivoStylusGestureManager", "OnGestureCallback: gesture = ", i), new Object[0]);
                if (i == 2) {
                    final NoteEditorContainerFragment noteEditorContainerFragment = this.f102636OooO00o;
                    if (noteEditorContainerFragment.Oooo0o()) {
                        noteEditorContainerFragment.Oooo000().OooOo00(App.f69553Oooo0o, new oO0O000o.OooO00o() { // from class: o0OoO0oo.o00Ooo
                            @Override // oO0O000o.OooO00o
                            public final Object invoke() {
                                NoteEditorContainerFragment noteEditorContainerFragment2 = noteEditorContainerFragment;
                                noteEditorContainerFragment2.requireActivity().runOnUiThread(new RunnableC24438OooOoo0(noteEditorContainerFragment2, 1));
                                return C32460OooOooO.f116667OooO00o;
                            }
                        });
                    }
                }
                return false;
            }
        };
        this.f72847o0OoOo0 = new OooO00o();
        this.f72849ooOO = new o00oO0O();
        this.f72842o00O0O = new C23212OooO0Oo();
        this.f72844o00Ooo = 1;
        kotlin.jvm.internal.OooOOO0.OooO0o(registerForActivityResult(new C20439OooO0oo(), new C28977o0ooOO0(this, 0)), "registerForActivityResult(...)");
        this.f72846o00ooo = new C28978o0ooOOo(this, 0);
        this.f72848oo000o = new OooO0O0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOoOO(NoteEditorContainerFragment noteEditorContainerFragment) {
        NoteContent noteContent = (NoteContent) noteEditorContainerFragment.Oooo00O().f73396OoooOoO.f121747OooOo0o.getValue();
        if (noteContent == null) {
            return;
        }
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteEditorContainerFragment), new C28802o000Ooo(noteContent.getId(), noteContent.getSavedPageIndex()));
    }

    public static final void OooOoo(NoteEditorContainerFragment noteEditorContainerFragment) {
        Oooo0(noteEditorContainerFragment);
        OooO0O0.OooO00o oooO00o = (OooO0O0.OooO00o) noteEditorContainerFragment.Oooo00O().f73410o000000o.getValue();
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment.Oooo00O();
        OooO0O0.OooO00o oooO00o2 = OooO0O0.OooO00o.f75496OooOo;
        C33781o00o0O c33781o00o0O = oooO0OOOooo00O.f73409o000000O;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, oooO00o2);
        int iIntValue = ((Number) noteEditorContainerFragment.Oooo00O().f73408o000000.getValue()).intValue();
        if (iIntValue == 0 && oooO00o == oooO00o2) {
            noteEditorContainerFragment.Oooo00O().Oooo0o(1);
        } else if (iIntValue == 1) {
            noteEditorContainerFragment.Oooo00O().Oooo0o(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoo0(NoteEditorContainerFragment noteEditorContainerFragment, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28760o0000O00 c28760o0000O00;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C28760o0000O00) {
            c28760o0000O00 = (C28760o0000O00) abstractC32479OooO0OO;
            int i2 = c28760o0000O00.f101855OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c28760o0000O00.f101855OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c28760o0000O00 = new C28760o0000O00(noteEditorContainerFragment, abstractC32479OooO0OO);
            }
        }
        C28760o0000O00 c28760o0000O002 = c28760o0000O00;
        Object objShowNonVipFeatureLimitedDialog$default = c28760o0000O002.f101854OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c28760o0000O002.f101855OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = noteEditorContainerFragment.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c28760o0000O002.f101855OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c28760o0000O002, 6, null);
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

    public static void Oooo0(NoteEditorContainerFragment noteEditorContainerFragment) {
        noteEditorContainerFragment.Oooo00O().Oooo0oO(OooO0OO.OooO00o.f73441OooOo0o);
        noteEditorContainerFragment.Oooo0OO(8, null);
    }

    public static void Oooo0oO(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.setMargins(i, i2, i3, i4);
        view.setLayoutParams(marginLayoutParams);
    }

    public static /* synthetic */ void Oooo0oo(View view, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i = 0;
        }
        if ((i5 & 4) != 0) {
            i2 = 0;
        }
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        if ((i5 & 16) != 0) {
            i4 = 0;
        }
        Oooo0oO(view, i, i2, i3, i4);
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment
    public final void OooOoO0(View view) {
    }

    public final boolean OooOooO() {
        ActivityC21897OooOo0 activity = getActivity();
        NotesRoleEntryActivity notesRoleEntryActivity = activity instanceof NotesRoleEntryActivity ? (NotesRoleEntryActivity) activity : null;
        if (notesRoleEntryActivity == null) {
            return true;
        }
        return notesRoleEntryActivity.OoooO();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C28763o0000OO0 OooOooo() {
        return (C28763o0000OO0) this.f72810OooOooo.getValue();
    }

    public final com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 Oooo000() {
        return (com.orion.notein.p607ui.noteeditor.penbar.OooO0O0) this.f72817Oooo0OO.getValue();
    }

    public final com.orion.notein.p607ui.noteeditor.OooO0OO Oooo00O() {
        return (com.orion.notein.p607ui.noteeditor.OooO0OO) this.f72808OooOoo0.getValue();
    }

    public final void Oooo00o(Fragment fragment, InterfaceC32507OooOO0o<? super Fragment, C32460OooOooO> interfaceC32507OooOO0o) {
        if (fragment.isAdded()) {
            interfaceC32507OooOO0o.invoke(fragment);
        } else {
            getChildFragmentManager().f64814OooOOo0.add(new OooO0OO(fragment, interfaceC32507OooOO0o, this));
        }
    }

    public final void Oooo0O0(String noteId, List<? extends InterfaceC31284OooO0O0> newItemList, List<? extends InterfaceC31284OooO0O0> removeItemList) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(newItemList, "newItemList");
        kotlin.jvm.internal.OooOOO0.OooO0oO(removeItemList, "removeItemList");
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = (com.orion.notein.p607ui.noteeditor.audio.OooO0o) this.f72818Oooo0o.getValue();
        oooO0o.f74259Oooo0oo.post(new RunnableC29174OoooOoO(oooO0o, noteId, newItemList, removeItemList, System.currentTimeMillis()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo0OO(int i, Object obj) {
        int iIntValue = ((Number) Oooo00O().f73394OoooOOo.f121747OooOo0o.getValue()).intValue();
        if (iIntValue == -1) {
            return;
        }
        try {
            FragmentManager childFragmentManager = getChildFragmentManager();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(childFragmentManager);
            Fragment fragmentOooOooO = childFragmentManager.OooOooO(iIntValue);
            NoteEditorFragment noteEditorFragment = fragmentOooOooO instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO : null;
            if (noteEditorFragment == null) {
                return;
            }
            Message.obtain(noteEditorFragment.f73044o00000oo, i, obj).sendToTarget();
        } catch (IllegalStateException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteEditorFragment");
            c20358OooO00o.OooO0OO("sendMessageToFocusedEditor: ".concat(C32435OooO0Oo.OooO0O0(e)), new Object[0]);
        }
    }

    public final boolean Oooo0o() {
        if (getActivity() instanceof MainActivity) {
            ActivityC21897OooOo0 activity = getActivity();
            kotlin.jvm.internal.OooOOO0.OooO0o0(activity, "null cannot be cast to non-null type com.orion.notein.MainActivity");
            if (!((MainActivity) activity).getIsTopResumedActivity()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("doubleClickReceiver");
                c20358OooO00o.OooO0o0("onReceive: not top activity", new Object[0]);
                return false;
            }
        }
        PenBarChildFragment penBarChildFragment = this.f72812Oooo0;
        if (penBarChildFragment != null && penBarChildFragment.OooooO0()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("doubleClickReceiver");
            c20358OooO00o2.OooO0o0("onReceive: penbar isPopupWindowShow", new Object[0]);
            return false;
        }
        PenBoxChildFragment penBoxChildFragment = this.f72816Oooo0O0;
        if (penBoxChildFragment != null && penBoxChildFragment.Ooooo00()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("doubleClickReceiver");
            c20358OooO00o3.OooO0o0("onReceive: penbar isPopupWindowShow", new Object[0]);
            return false;
        }
        EyeDropperView eyeDropperView = this.f72835OooooOO;
        if (eyeDropperView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("eyeDropperView");
            throw null;
        }
        if (eyeDropperView.getVisibility() != 0) {
            return true;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o4.OooOOO0("doubleClickReceiver");
        c20358OooO00o4.OooO0o0("onReceive: eyeDropperView isVisible", new Object[0]);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo0o0(Bundle bundle) {
        int iIntValue = ((Number) Oooo00O().f73394OoooOOo.f121747OooOo0o.getValue()).intValue();
        if (iIntValue == -1) {
            return;
        }
        Fragment fragmentOooOooO = getChildFragmentManager().OooOooO(iIntValue);
        NoteEditorFragment noteEditorFragment = fragmentOooOooO instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO : null;
        if (noteEditorFragment == null) {
            return;
        }
        Message messageObtain = Message.obtain(noteEditorFragment.f73044o00000oo, 5, null);
        messageObtain.setData(bundle);
        messageObtain.sendToTarget();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = Oooo00O();
        String str = OooOooo().f101859OooO00o;
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(oooO0OOOooo00O);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28829o000ooo0(oooO0OOOooo00O, str, null), 2);
        requireActivity().getOnBackPressedDispatcher().OooO00o(this, new C23213OooO0o0());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_note_editor, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C31210OooO0OO c31210OooO0OO = this.f72826OoooOO0;
        if (c31210OooO0OO == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penCapabilityManager");
            throw null;
        }
        c31210OooO0OO.OooO00o();
        InterfaceC31211OooO0Oo interfaceC31211OooO0Oo = c31210OooO0OO.f111297OooO00o;
        InterfaceC31209OooO0O0 interfaceC31209OooO0O0 = interfaceC31211OooO0Oo != null ? (InterfaceC31209OooO0O0) interfaceC31211OooO0Oo.OooO00o(InterfaceC31211OooO0Oo.OooO00o.f111302OooOoO) : null;
        if (interfaceC31209OooO0O0 != null) {
            interfaceC31209OooO0O0.OooO0O0(null);
        }
        TextStyleBox textStyleBox = this.f72839OoooooO;
        if (textStyleBox != null) {
            textStyleBox.OooOO0O();
        }
        this.f72844o00Ooo = 1;
        DrawerLayout drawerLayout = this.f72813Oooo000;
        if (drawerLayout == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("drawer");
            throw null;
        }
        drawerLayout.OooOOo(this.f72848oo000o);
        LockNoteFragment lockNoteFragment = this.f72823OoooO0;
        if (lockNoteFragment != null) {
            Oooo00o(lockNoteFragment, new C28740OooooOo());
        }
        this.f72815Oooo00o = null;
        this.f72812Oooo0 = null;
        this.f72816Oooo0O0 = null;
        this.f72821Oooo0oo = null;
        this.f72820Oooo0oO = null;
        this.f72811Oooo = null;
        this.f72819Oooo0o0 = null;
        this.f72823OoooO0 = null;
        this.f72825OoooO0O = null;
        Handler handler = this.f72841o000oOoO;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f72841o000oOoO = null;
        C21030OooOO0o.OooO0OO(this).OooOo0o(this.f72846o00ooo);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = requireActivity();
        kotlin.jvm.internal.OooOOO0.OooO0o0(activityC21897OooOo0RequireActivity, "null cannot be cast to non-null type com.orion.notein.MainActivity");
        MainActivity mainActivity = (MainActivity) activityC21897OooOo0RequireActivity;
        mainActivity.removeKeyEventListener(this.f72842o00O0O);
        mainActivity.removeStylusEventListener(this.f72849ooOO);
        requireActivity().unregisterReceiver(this.f72847o0OoOo0);
        VivoStylusGestureManagerImpl.getInstance(requireContext()).unregisterGestureCallback(this.f72840Ooooooo);
        LockNoteFragment lockNoteFragment = this.f72823OoooO0;
        if (lockNoteFragment != null) {
            Oooo00o(lockNoteFragment, new C27424o000o0o(1));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f72841o000oOoO == null) {
            this.f72841o000oOoO = new Handler(Looper.getMainLooper());
        }
        Handler handler = this.f72841o000oOoO;
        if (handler != null) {
            handler.postDelayed(new RunnableC28872o00Oo0(this, 0), 2000L);
        }
        ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = requireActivity();
        kotlin.jvm.internal.OooOOO0.OooO0o0(activityC21897OooOo0RequireActivity, "null cannot be cast to non-null type com.orion.notein.MainActivity");
        MainActivity mainActivity = (MainActivity) activityC21897OooOo0RequireActivity;
        mainActivity.registerKeyEventListener(this.f72842o00O0O);
        mainActivity.registerStylusEventListener(this.f72849ooOO);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.stylus.action.BUTTON_DOUBLE_PRESSED");
        intentFilter.addAction("com.hihonor.stylus.action.STYLUS_DOUBLE_CLICK");
        intentFilter.addAction("com.oplus.ipemanager.action.PENCIL_DOUBLE_CLICK");
        requireActivity().registerReceiver(this.f72847o0OoOo0, intentFilter, 2);
        VivoStylusGestureManagerImpl.getInstance(requireContext()).registerGestureCallback(this.f72840Ooooooo);
        requireActivity().getSupportFragmentManager().Oooooo0("color_set_rename", this, new C22584OooO0oo(this));
        requireActivity().getSupportFragmentManager().Oooooo0("jump_to_page", this, new C28237OooOOOO(this));
        requireActivity().getSupportFragmentManager().Oooooo0("set_ruler_angle", this, new InterfaceC21912Oooo0o() { // from class: o0OoO0oo.OoooOOo
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                NoteEditorContainerFragment noteEditorContainerFragment = this.f101778OooOo0o;
                NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
                int i = bundle.getInt("angle_deg", -1);
                if (i >= 0) {
                    noteEditorContainerFragment.Oooo0OO(37, Integer.valueOf(i));
                }
            }
        });
        requireActivity().getSupportFragmentManager().Oooooo0("clear_page", this, new InterfaceC21912Oooo0o() { // from class: o0OoO0oo.OoooOo0
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                NoteEditorContainerFragment noteEditorContainerFragment = this.f101779OooOo0o;
                NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
                noteEditorContainerFragment.Oooo0OO(9, Boolean.valueOf(bundle.getBoolean("clear_quotes", false)));
            }
        });
        requireActivity().getSupportFragmentManager().Oooooo0("create_comment", this, new InterfaceC21912Oooo0o() { // from class: o0OoO0oo.OoooOoO
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                String id;
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                NoteEditorContainerFragment noteEditorContainerFragment = this.f101780OooOo0o;
                NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
                String string = bundle.getString(NoteMeta.PROPERTY_TITLE);
                String str2 = string == null ? "" : string;
                String string2 = bundle.getString("page_id");
                String str3 = string2 == null ? "" : string2;
                NoteContent noteContent = (NoteContent) noteEditorContainerFragment.Oooo00O().f73396OoooOoO.f121747OooOo0o.getValue();
                String str4 = (noteContent == null || (id = noteContent.getId()) == null) ? "" : id;
                androidx.lifecycle.OooOo oooOoOooO00o = C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)");
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, noteEditorContainerFragment.new OooOO0O(str4, str3, str2, null), 2);
            }
        });
        requireActivity().getSupportFragmentManager().Oooooo0("clear_comment", this, new InterfaceC21912Oooo0o() { // from class: o0OoO0oo.OoooOoo
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "<unused var>");
                NoteEditorContainerFragment noteEditorContainerFragment = this.f101781OooOo0o;
                NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
                InterfaceC21987OooOoo viewLifecycleOwner = noteEditorContainerFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, noteEditorContainerFragment.new C23216OooOO0o(null), 2);
            }
        });
        requireActivity().getSupportFragmentManager().Oooooo0("delete_comment", this, new InterfaceC21912Oooo0o() { // from class: o0OoO0oo.Ooooo00
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                NoteEditorContainerFragment noteEditorContainerFragment = this.f101782OooOo0o;
                NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
                String string = bundle.getString("comment_id");
                if (string != null) {
                    androidx.lifecycle.OooOo oooOoOooO00o = C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)");
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, noteEditorContainerFragment.new OooOOO0(string, null), 2);
                }
            }
        });
        requireActivity().getSupportFragmentManager().Oooooo0("update_comment", this, new InterfaceC21912Oooo0o() { // from class: o0OoO0oo.Ooooo0o
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                String string = bundle.getString("comment_id");
                if (string == null) {
                    string = "";
                }
                String string2 = bundle.getString("comment_title");
                String str2 = string2 != null ? string2 : "";
                NoteEditorContainerFragment noteEditorContainerFragment = this.f101783OooOo0o;
                androidx.lifecycle.OooOo oooOoOooO00o = C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)");
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, noteEditorContainerFragment.new OooOOO(string, str2, null), 2);
            }
        });
        requireActivity().getSupportFragmentManager().Oooooo0("create_outline", this, new C28242OooOo0(this, 1));
        requireActivity().getSupportFragmentManager().Oooooo0("delete_outline", this, new InterfaceC21912Oooo0o() { // from class: o0OoO0oo.OooooO0
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                NoteEditorContainerFragment noteEditorContainerFragment = this.f101784OooOo0o;
                NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
                String string = bundle.getString("outline_id");
                if (string != null) {
                    androidx.lifecycle.OooOo oooOoOooO00o = C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)");
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, noteEditorContainerFragment.new OooO0o(string, null), 2);
                }
            }
        });
        requireActivity().getSupportFragmentManager().Oooooo0("clear_outline", this, new InterfaceC21912Oooo0o() { // from class: o0OoO0oo.o0ooOoO
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "<unused var>");
                NoteEditorContainerFragment noteEditorContainerFragment = this.f102679OooOo0o;
                NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
                InterfaceC21987OooOoo viewLifecycleOwner = noteEditorContainerFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, noteEditorContainerFragment.new C23214OooO0oO(null), 3);
            }
        });
        requireActivity().getSupportFragmentManager().Oooooo0("update_outline", this, new InterfaceC21912Oooo0o() { // from class: o0OoO0oo.o0OOO0o
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                String string = bundle.getString("outline_id");
                if (string == null) {
                    string = "";
                }
                String string2 = bundle.getString("outline_title");
                String str2 = string2 != null ? string2 : "";
                NoteEditorContainerFragment noteEditorContainerFragment = this.f102645OooOo0o;
                androidx.lifecycle.OooOo oooOoOooO00o = C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)");
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, noteEditorContainerFragment.new C23215OooO0oo(string, str2, null), 2);
            }
        });
        requireActivity().getSupportFragmentManager().Oooooo0("delete_font", this, new InterfaceC21912Oooo0o() { // from class: o0OoO0oo.o0Oo0oo
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                String string = bundle.getString("font_name");
                if (string == null) {
                    string = "";
                }
                NoteEditorContainerFragment noteEditorContainerFragment = this.f102646OooOo0o;
                androidx.lifecycle.OooOo oooOoOooO00o = C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)");
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, noteEditorContainerFragment.new OooO(string, null), 2);
            }
        });
        requireActivity().getSupportFragmentManager().Oooooo0("import_font_done", this, new InterfaceC21912Oooo0o() { // from class: o0OoO0oo.OoooO
            @Override // androidx.fragment.app.InterfaceC21912Oooo0o
            public final void OooO0OO(Bundle bundle, String str) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "<unused var>");
                NoteEditorContainerFragment noteEditorContainerFragment = this.f101767OooOo0o;
                C33609OooO0oo.OooO0OO(C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)"), null, null, noteEditorContainerFragment.new OooOO0(null), 3);
            }
        });
        C21904OooOoo0.OooO0oO(this, "key_result_page_padding", new InterfaceC32508OooOOOo() { // from class: o0OoO0oo.OoooOO0
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                Bundle extras = (Bundle) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO((String) obj, "<unused var>");
                kotlin.jvm.internal.OooOOO0.OooO0oO(extras, "extras");
                String string = extras.getString("note_id");
                if (string == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                NoteEditorContainerFragment noteEditorContainerFragment = this.f101776OooOo0o;
                Integer num = (Integer) oOo000Oo.OooOo.OoooO00(noteEditorContainerFragment.Oooo00O().OooOOO0().indexOf(string), NoteEditorContainer.f76968Oooo0o);
                if (num == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                Fragment fragmentOooOooO = noteEditorContainerFragment.getChildFragmentManager().OooOooO(num.intValue());
                NoteEditorFragment noteEditorFragment = fragmentOooOooO instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO : null;
                if (noteEditorFragment == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                NoteEditorFragment.HandlerC23270OooO0oo handlerC23270OooO0oo = noteEditorFragment.f73044o00000oo;
                handlerC23270OooO0oo.sendMessage(handlerC23270OooO0oo.obtainMessage(27, null));
                return C32460OooOooO.f116667OooO00o;
            }
        });
        C21904OooOoo0.OooO0oO(this, "hyperlink_nav_result", new InterfaceC32508OooOOOo() { // from class: o0OoO0oo.o000oOoO
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                String string;
                String string2;
                Integer num;
                Bundle extras = (Bundle) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO((String) obj, "<unused var>");
                kotlin.jvm.internal.OooOOO0.OooO0oO(extras, "extras");
                String string3 = extras.getString("source_note_id");
                if (string3 != null && (string = extras.getString("note_id")) != null && (string2 = extras.getString("page_id")) != null) {
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f102026OooOo0o;
                    int iIndexOf = noteEditorContainerFragment.Oooo00O().OooOOO0().indexOf(string3);
                    if (iIndexOf != -1 && (num = (Integer) oOo000Oo.OooOo.OoooO00(iIndexOf, NoteEditorContainer.f76968Oooo0o)) != null) {
                        Fragment fragmentOooOooO = noteEditorContainerFragment.getChildFragmentManager().OooOooO(num.intValue());
                        NoteEditorFragment noteEditorFragment = fragmentOooOooO instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO : null;
                        if (noteEditorFragment == null) {
                            return C32460OooOooO.f116667OooO00o;
                        }
                        C32443OooOOO c32443OooOOO = new C32443OooOOO(string, string2);
                        NoteEditorFragment.HandlerC23270OooO0oo handlerC23270OooO0oo = noteEditorFragment.f73044o00000oo;
                        handlerC23270OooO0oo.sendMessage(handlerC23270OooO0oo.obtainMessage(30, c32443OooOOO));
                        return C32460OooOooO.f116667OooO00o;
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        C21904OooOoo0.OooO0oO(this, "template_changed", new InterfaceC32508OooOOOo() { // from class: o0OoO0oo.OoooOOO
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                Bundle extras = (Bundle) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO((String) obj, "<unused var>");
                kotlin.jvm.internal.OooOOO0.OooO0oO(extras, "extras");
                String string = extras.getString("note_id");
                if (string != null && extras.getString("page_id") != null) {
                    NoteEditorContainerFragment noteEditorContainerFragment = this.f101777OooOo0o;
                    Integer num = (Integer) oOo000Oo.OooOo.OoooO00(noteEditorContainerFragment.Oooo00O().OooOOO0().indexOf(string), NoteEditorContainer.f76968Oooo0o);
                    if (num == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    Fragment fragmentOooOooO = noteEditorContainerFragment.getChildFragmentManager().OooOooO(num.intValue());
                    NoteEditorFragment noteEditorFragment = fragmentOooOooO instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO : null;
                    if (noteEditorFragment == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    NoteEditorFragment.HandlerC23270OooO0oo handlerC23270OooO0oo = noteEditorFragment.f73044o00000oo;
                    handlerC23270OooO0oo.sendMessage(handlerC23270OooO0oo.obtainMessage(27, null));
                    return C32460OooOooO.f116667OooO00o;
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        ActivityC21897OooOo0 activityC21897OooOo0RequireActivity2 = requireActivity();
        kotlin.jvm.internal.OooOOO0.OooO0o0(activityC21897OooOo0RequireActivity2, "null cannot be cast to non-null type com.orion.notein.MainActivity");
        ((MainActivity) activityC21897OooOo0RequireActivity2).setDrawerEnable(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(outState, "outState");
        super.onSaveInstanceState(outState);
        Uri uri = this.f72827OoooOOO;
        if (uri == null) {
            ImportImagesFragment importImagesFragment = this.f72825OoooO0O;
            uri = importImagesFragment != null ? importImagesFragment.f71857OooOoo : null;
        }
        if (uri != null) {
            outState.putParcelable("camera_output_uri", uri);
        }
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object next;
        OooO0OO.OooO00o oooO00o;
        Object next2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        int i = getResources().getConfiguration().orientation;
        Oooo00O().f73368OooOo0O = OooOooo().f101860OooO0O0;
        String str = OooOooo().f101862OooO0Oo;
        Integer numOooOOO0 = str != null ? C33596OooOOo0.OooOOO0(str) : null;
        C26342o000Oo0O.f90392OooO00o.getClass();
        C26342o000Oo0O.OooO0oo("NoteEditorContainerFragment handleXiaomiScreenRelayJumping, pageId: " + numOooOOO0);
        if (numOooOOO0 != null) {
            Fragment fragmentOooOooO = getChildFragmentManager().OooOooO(R.id.note_editor_fragment_1);
            NoteEditorFragment noteEditorFragment = fragmentOooOooO instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO : null;
            Fragment fragmentOooOooO2 = getChildFragmentManager().OooOooO(R.id.note_editor_fragment_2);
            NoteEditorFragment noteEditorFragment2 = fragmentOooOooO2 instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO2 : null;
            C26342o000Oo0O.OooO0oo("NoteEditorContainer handleXiaomiScreenRelayJumping, pageIndex: " + numOooOOO0 + ", f1 hash: " + (noteEditorFragment != null ? noteEditorFragment.hashCode() : 0) + ", f2: " + (noteEditorFragment2 != null ? noteEditorFragment2.hashCode() : 0));
            if (noteEditorFragment != null && noteEditorFragment.isVisible()) {
                noteEditorFragment.ooOO(numOooOOO0.intValue());
            }
            if (noteEditorFragment2 != null && noteEditorFragment2.isVisible()) {
                noteEditorFragment2.ooOO(numOooOOO0.intValue());
            }
        }
        String str2 = OooOooo().f101863OooO0o0;
        C34406OooO00o.f123390OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("NoteEditorContainerFragment setOpeningPageId, pageId: ", str2), new Object[0]);
        if (str2 != null) {
            Fragment fragmentOooOooO3 = getChildFragmentManager().OooOooO(R.id.note_editor_fragment_1);
            NoteEditorFragment noteEditorFragment3 = fragmentOooOooO3 instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO3 : null;
            Fragment fragmentOooOooO4 = getChildFragmentManager().OooOooO(R.id.note_editor_fragment_2);
            NoteEditorFragment noteEditorFragment4 = fragmentOooOooO4 instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO4 : null;
            if (noteEditorFragment3 != null && noteEditorFragment3.isVisible()) {
                C33781o00o0O c33781o00o0O = noteEditorFragment3.OoooOO0().f73591OoooOoO;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, str2);
            }
            if (noteEditorFragment4 != null && noteEditorFragment4.isVisible()) {
                C33781o00o0O c33781o00o0O2 = noteEditorFragment4.OoooOO0().f73591OoooOoO;
                c33781o00o0O2.getClass();
                c33781o00o0O2.OooOO0(null, str2);
            }
        }
        NavEditorLayoutInfo navEditorLayoutInfo = OooOooo().f101861OooO0OO;
        if (navEditorLayoutInfo != null) {
            com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = Oooo00O();
            C33781o00o0O c33781o00o0O3 = oooO0OOOooo00O.f73389OoooO0;
            Iterator it = ((Iterable) c33781o00o0O3.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    next2 = it.next();
                    if (((C28961o00oOoOO) next2).f102615OooO00o.length() > 0) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            if (next2 == null) {
                List<String> noteIdList = navEditorLayoutInfo.getNoteIdList();
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(noteIdList, 10));
                Iterator<T> it2 = noteIdList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C28961o00oOoOO((String) it2.next(), "", new PointF(0.0f, 0.0f), null));
                }
                c33781o00o0O3.OooOO0(null, arrayList);
                C32443OooOOO c32443OooOOO = new C32443OooOOO(Integer.valueOf(navEditorLayoutInfo.getLayoutType()), navEditorLayoutInfo.getIndicatorBias());
                C33781o00o0O c33781o00o0O4 = oooO0OOOooo00O.f73386Oooo0oO;
                c33781o00o0O4.getClass();
                c33781o00o0O4.OooOO0(null, c32443OooOOO);
                Integer numValueOf = Integer.valueOf(navEditorLayoutInfo.getFocusIndex());
                C33781o00o0O c33781o00o0O5 = oooO0OOOooo00O.f73419o000oOoO;
                c33781o00o0O5.getClass();
                c33781o00o0O5.OooOO0(null, numValueOf);
            }
        } else {
            com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O2 = Oooo00O();
            String str3 = OooOooo().f101859OooO00o;
            C33781o00o0O c33781o00o0O6 = oooO0OOOooo00O2.f73389OoooO0;
            Iterator it3 = ((Iterable) c33781o00o0O6.getValue()).iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (((C28961o00oOoOO) next).f102615OooO00o.length() > 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next == null) {
                String[] strArr = new String[2];
                for (int i2 = 0; i2 < 2; i2++) {
                    strArr[i2] = "";
                }
                strArr[0] = str3;
                ArrayList arrayList2 = new ArrayList(2);
                int i3 = 0;
                for (int i4 = 2; i3 < i4; i4 = 2) {
                    arrayList2.add(new C28961o00oOoOO(strArr[i3], "", new PointF(0.0f, 0.0f), null));
                    i3++;
                }
                c33781o00o0O6.OooOO0(null, arrayList2);
                C32443OooOOO c32443OooOOO2 = new C32443OooOOO(0, null);
                C33781o00o0O c33781o00o0O7 = oooO0OOOooo00O2.f73386Oooo0oO;
                c33781o00o0O7.getClass();
                c33781o00o0O7.OooOO0(null, c32443OooOOO2);
                C33781o00o0O c33781o00o0O8 = oooO0OOOooo00O2.f73419o000oOoO;
                c33781o00o0O8.getClass();
                c33781o00o0O8.OooOO0(null, 0);
                oooO0OOOooo00O2.OoooO(str3);
            }
        }
        DrawerLayout drawerLayout = (DrawerLayout) view;
        this.f72813Oooo000 = drawerLayout;
        drawerLayout.OooO00o(this.f72848oo000o);
        this.f72814Oooo00O = (ConstraintLayout) view.findViewById(R.id.content);
        this.f72834OooooO0 = (ConstraintLayout) view.findViewById(R.id.editor_panel);
        this.f72837Oooooo = view.findViewById(R.id.editor_property_panel);
        EyeDropperView eyeDropperView = (EyeDropperView) view.findViewById(R.id.eyedropper);
        this.f72835OooooOO = eyeDropperView;
        if (eyeDropperView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("eyeDropperView");
            throw null;
        }
        eyeDropperView.f76860OooOo = view;
        if (eyeDropperView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("eyeDropperView");
            throw null;
        }
        eyeDropperView.setEventListener(new C23217OooOOOo());
        C31210OooO0OO c31210OooO0OO = this.f72826OoooOO0;
        if (c31210OooO0OO == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penCapabilityManager");
            throw null;
        }
        c31210OooO0OO.OooO00o();
        InterfaceC31211OooO0Oo interfaceC31211OooO0Oo = c31210OooO0OO.f111297OooO00o;
        InterfaceC31209OooO0O0 interfaceC31209OooO0O0 = interfaceC31211OooO0Oo != null ? (InterfaceC31209OooO0O0) interfaceC31211OooO0Oo.OooO00o(InterfaceC31211OooO0Oo.OooO00o.f111302OooOoO) : null;
        if (interfaceC31209OooO0O0 != null) {
            interfaceC31209OooO0O0.OooO0O0(new C25582OooO0O0(this));
        }
        View viewFindViewById = view.findViewById(R.id.editor_switch_panel_container);
        this.f72836OooooOo = viewFindViewById;
        if (viewFindViewById == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("noteSwitchPanelContainer");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC26036Oooo(this, 2));
        this.f72838Oooooo0 = view.findViewById(R.id.editor_switch_panel);
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O3 = Oooo00O();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        boolean zOooo0oo = oooO0OOOooo00O3.Oooo0oo(contextRequireContext);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.top_bar_group);
        if (viewStub != null) {
            if (zOooo0oo) {
                viewStub.setLayoutResource(R.layout.top_bar_group_note_editor_immersive);
            } else {
                viewStub.setLayoutResource(R.layout.top_bar_group_note_editor);
            }
            this.f72828OoooOOo = viewStub.inflate();
        } else {
            this.f72828OoooOOo = view.findViewById(R.id.top_bar_group);
        }
        if (!zOooo0oo) {
            View view2 = this.f72828OoooOOo;
            if (view2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("topBarGroup");
                throw null;
            }
            this.f72829OoooOo0 = view2;
        }
        androidx.constraintlayout.widget.OooO0OO oooO0OO = new androidx.constraintlayout.widget.OooO0OO();
        ConstraintLayout constraintLayout = this.f72814Oooo00O;
        if (constraintLayout == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO(FirebaseAnalytics.Param.CONTENT);
            throw null;
        }
        oooO0OO.OooO0o0(constraintLayout);
        if (zOooo0oo) {
            View view3 = this.f72837Oooooo;
            if (view3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("propertyPanel");
                throw null;
            }
            oooO0OO.OooO0o(view3.getId(), 3, 0, 3);
            View view4 = this.f72837Oooooo;
            if (view4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("propertyPanel");
                throw null;
            }
            oooO0OO.OooO0o(view4.getId(), 4, 0, 4);
            ConstraintLayout constraintLayout2 = this.f72834OooooO0;
            if (constraintLayout2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editorPanel");
                throw null;
            }
            oooO0OO.OooO0o(constraintLayout2.getId(), 3, 0, 3);
            ConstraintLayout constraintLayout3 = this.f72834OooooO0;
            if (constraintLayout3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editorPanel");
                throw null;
            }
            oooO0OO.OooO0o(constraintLayout3.getId(), 4, 0, 4);
            View view5 = this.f72828OoooOOo;
            if (view5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("topBarGroup");
                throw null;
            }
            oooO0OO.OooO0o(view5.getId(), 1, 0, 1);
            View view6 = this.f72828OoooOOo;
            if (view6 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("topBarGroup");
                throw null;
            }
            int id = view6.getId();
            View view7 = this.f72837Oooooo;
            if (view7 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("propertyPanel");
                throw null;
            }
            oooO0OO.OooO0o(id, 2, view7.getId(), 1);
            View view8 = this.f72828OoooOOo;
            if (view8 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("topBarGroup");
                throw null;
            }
            oooO0OO.OooOO0(view8.getId()).f64014OooO0o0.f64033OooO0OO = 0;
            Context context = getContext();
            if (context == null || !C28038OooO0Oo.OooO0O0(context)) {
                View view9 = this.f72828OoooOOo;
                if (view9 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("topBarGroup");
                    throw null;
                }
                oooO0OO.OooO0o(view9.getId(), 3, 0, 3);
                View view10 = this.f72828OoooOOo;
                if (view10 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("topBarGroup");
                    throw null;
                }
                int id2 = view10.getId();
                HashMap<Integer, OooO0OO.OooO00o> map = oooO0OO.f64007OooO0o;
                if (map.containsKey(Integer.valueOf(id2)) && (oooO00o = map.get(Integer.valueOf(id2))) != null) {
                    OooO0OO.OooO0O0 oooO0O0 = oooO00o.f64014OooO0o0;
                    oooO0O0.f64044OooOOOO = -1;
                    oooO0O0.f64045OooOOOo = -1;
                    oooO0O0.f64066Oooo0O0 = 0;
                    oooO0O0.f64074OoooO00 = Integer.MIN_VALUE;
                }
                View view11 = this.f72828OoooOOo;
                if (view11 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("topBarGroup");
                    throw null;
                }
                oooO0OO.OooOO0(view11.getId()).f64014OooO0o0.f64034OooO0Oo = -2;
            } else {
                View view12 = this.f72828OoooOOo;
                if (view12 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("topBarGroup");
                    throw null;
                }
                oooO0OO.OooO0o(view12.getId(), 3, 0, 3);
                View view13 = this.f72828OoooOOo;
                if (view13 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("topBarGroup");
                    throw null;
                }
                oooO0OO.OooO0o(view13.getId(), 4, 0, 4);
                View view14 = this.f72828OoooOOo;
                if (view14 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("topBarGroup");
                    throw null;
                }
                oooO0OO.OooOO0(view14.getId()).f64014OooO0o0.f64034OooO0Oo = 0;
            }
        } else {
            View view15 = this.f72837Oooooo;
            if (view15 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("propertyPanel");
                throw null;
            }
            int id3 = view15.getId();
            View view16 = this.f72828OoooOOo;
            if (view16 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("topBarGroup");
                throw null;
            }
            oooO0OO.OooO0o(id3, 3, view16.getId(), 4);
            View view17 = this.f72837Oooooo;
            if (view17 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("propertyPanel");
                throw null;
            }
            oooO0OO.OooO0o(view17.getId(), 4, 0, 4);
            ConstraintLayout constraintLayout4 = this.f72834OooooO0;
            if (constraintLayout4 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editorPanel");
                throw null;
            }
            int id4 = constraintLayout4.getId();
            View view18 = this.f72828OoooOOo;
            if (view18 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("topBarGroup");
                throw null;
            }
            oooO0OO.OooO0o(id4, 3, view18.getId(), 4);
            ConstraintLayout constraintLayout5 = this.f72834OooooO0;
            if (constraintLayout5 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editorPanel");
                throw null;
            }
            oooO0OO.OooO0o(constraintLayout5.getId(), 4, 0, 4);
            View view19 = this.f72828OoooOOo;
            if (view19 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("topBarGroup");
                throw null;
            }
            oooO0OO.OooO0o(view19.getId(), 1, 0, 1);
            View view20 = this.f72828OoooOOo;
            if (view20 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("topBarGroup");
                throw null;
            }
            oooO0OO.OooO0o(view20.getId(), 2, 0, 2);
            View view21 = this.f72828OoooOOo;
            if (view21 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("topBarGroup");
                throw null;
            }
            oooO0OO.OooOO0(view21.getId()).f64014OooO0o0.f64033OooO0OO = 0;
        }
        ConstraintLayout constraintLayout6 = this.f72814Oooo00O;
        if (constraintLayout6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO(FirebaseAnalytics.Param.CONTENT);
            throw null;
        }
        oooO0OO.OooO0O0(constraintLayout6);
        View viewFindViewById2 = view.findViewById(R.id.btn_disable_full_screen);
        this.f72830OoooOoO = viewFindViewById2;
        if (viewFindViewById2 != null) {
            C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new ViewOnClickListenerC26053OoooOoO(this, 2));
        }
        C33609OooO0oo.OooO0OO(C28982oo0o0Oo.OooO00o(this, "getViewLifecycleOwner(...)"), null, null, new C28769o0000Ooo(this, null), 3);
        NoteEditorContainer noteEditorContainer = (NoteEditorContainer) view.findViewById(R.id.editor_container);
        this.f72831OoooOoo = noteEditorContainer;
        if (noteEditorContainer == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editorContainer");
            throw null;
        }
        noteEditorContainer.setEditorContainerEventListener(new C28747o00000(this));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28752o00000O0(this, null), 3);
        FavoriteToolBox favoriteToolBox = (FavoriteToolBox) drawerLayout.findViewById(R.id.favorite_tool_box);
        this.f72833Ooooo0o = favoriteToolBox;
        if (favoriteToolBox == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("favoritePenBox");
            throw null;
        }
        favoriteToolBox.setToolBoxListener(new com.orion.notein.p607ui.noteeditor.OooO00o(this));
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O4 = Oooo00O();
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
        if (oooO0OOOooo00O4.Oooo0oo(contextRequireContext2)) {
            TextStyleBox textStyleBox = (TextStyleBox) view.findViewById(R.id.text_style_box);
            this.f72839OoooooO = textStyleBox;
            if (textStyleBox != null) {
                C29051OooOO0o c29051OooOO0o = (C29051OooOO0o) this.f72824OoooO00.getValue();
                androidx.lifecycle.OooOo oooOoOooO00o = C28982oo0o0Oo.OooO00o(this, "getViewLifecycleOwner(...)");
                textStyleBox.f74153OoooO = c29051OooOO0o;
                textStyleBox.f74157OoooOO0 = oooOoOooO00o;
                textStyleBox.f74149Oooo0o.OooO0OO(c29051OooOO0o, oooOoOooO00o, new C23384OooO0o0(c29051OooOO0o, textStyleBox), new C25582OooO0O0(textStyleBox));
                C33609OooO0oo.OooO0OO(oooOoOooO00o, null, null, new C29120OooOooO(c29051OooOO0o, textStyleBox, null), 3);
            }
            TextStyleBox textStyleBox2 = this.f72839OoooooO;
            if (textStyleBox2 != null) {
                textStyleBox2.setTextStyleBoxListener(new com.orion.notein.p607ui.noteeditor.OooO0O0(this));
            }
            C33609OooO0oo.OooO0OO(C28982oo0o0Oo.OooO00o(this, "getViewLifecycleOwner(...)"), null, null, new C28754o00000Oo(this, null), 3);
        }
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O5 = Oooo00O();
        Context contextRequireContext3 = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext3, "requireContext(...)");
        final boolean zOooo0oo2 = oooO0OOOooo00O5.Oooo0oo(contextRequireContext3);
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O6 = Oooo00O();
        Context context2 = view.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context2, "getContext(...)");
        final int dimensionPixelSize = oooO0OOOooo00O6.Oooo0oo(context2) ? view.getContext().getResources().getDimensionPixelSize(R.dimen.note_editor_default_padding_top_immersive) : view.getContext().getResources().getDimensionPixelSize(R.dimen.note_editor_default_padding_top);
        ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: o0OoO0oo.OoooooO
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
                kotlin.jvm.internal.OooOOO0.OooO0oO(insets, "insets");
                Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
                kotlin.jvm.internal.OooOOO0.OooO0o(insets2, "getInsets(...)");
                int iMax = Math.max(insets2.top, dimensionPixelSize);
                NoteEditorContainerFragment noteEditorContainerFragment = this;
                boolean z = zOooo0oo2;
                int i5 = (z || !((Boolean) noteEditorContainerFragment.Oooo00O().f73423o00o0O.f121747OooOo0o.getValue()).booleanValue()) ? iMax : 0;
                View view22 = noteEditorContainerFragment.f72828OoooOOo;
                if (view22 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("topBarGroup");
                    throw null;
                }
                view22.setPadding(insets2.left, i5, insets2.right, 0);
                View view23 = noteEditorContainerFragment.f72838Oooooo0;
                if (view23 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteSwitchPanel");
                    throw null;
                }
                view23.setPadding(insets2.left, iMax, 0, insets2.bottom);
                View view24 = noteEditorContainerFragment.f72830OoooOoO;
                if (view24 != null) {
                    ViewGroup.LayoutParams layoutParams = view24.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = iMax;
                    view24.setLayoutParams(marginLayoutParams);
                }
                if (z) {
                    View view25 = noteEditorContainerFragment.f72837Oooooo;
                    if (view25 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("propertyPanel");
                        throw null;
                    }
                    view25.setPadding(0, iMax, insets2.right, insets2.bottom);
                }
                C33781o00o0O c33781o00o0O9 = noteEditorContainerFragment.Oooo00O().f73369OooOo0o;
                c33781o00o0O9.getClass();
                c33781o00o0O9.OooOO0(null, insets2);
                return WindowInsetsCompat.CONSUMED;
            }
        });
        C21030OooOO0o.OooO0OO(this).OooO0O0(this.f72846o00ooo);
        Context context3 = getContext();
        if (context3 != null && C28038OooO0Oo.OooO0O0(context3)) {
            Oooo00O().Oooo0OO(0, null);
        }
        C33609OooO0oo.OooO0OO(C28982oo0o0Oo.OooO00o(this, "getViewLifecycleOwner(...)"), null, null, new C23219OooOOo0(null), 3);
        C33609OooO0oo.OooO0OO(C28982oo0o0Oo.OooO00o(this, "getViewLifecycleOwner(...)"), null, null, new C23218OooOOo(null), 3);
        if (bundle == null || !bundle.containsKey("camera_output_uri")) {
            return;
        }
        Uri uri = (Uri) bundle.getParcelable("camera_output_uri");
        this.f72827OoooOOO = uri;
        if (uri != null) {
            C28982oo0o0Oo.OooO00o(this, "getViewLifecycleOwner(...)").OooO0O0(new C23224OooOOoo(uri, null));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = Oooo00O();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        final boolean zOooo0oo = oooO0OOOooo00O.Oooo0oo(contextRequireContext);
        C24427OooOOOo c24427OooOOOo = new C24427OooOOOo(this, 2);
        if (zOooo0oo) {
            PenBoxChildFragment penBoxChildFragment = new PenBoxChildFragment();
            c24427OooOOOo.invoke(penBoxChildFragment);
            this.f72816Oooo0O0 = penBoxChildFragment;
            ImmersiveToolbarChildFragment immersiveToolbarChildFragment = new ImmersiveToolbarChildFragment();
            c24427OooOOOo.invoke(immersiveToolbarChildFragment);
            this.f72820Oooo0oO = immersiveToolbarChildFragment;
        } else {
            PenBarChildFragment penBarChildFragment = new PenBarChildFragment();
            c24427OooOOOo.invoke(penBarChildFragment);
            this.f72812Oooo0 = penBarChildFragment;
            ToolbarChildFragment toolbarChildFragment = new ToolbarChildFragment();
            c24427OooOOOo.invoke(toolbarChildFragment);
            this.f72821Oooo0oo = toolbarChildFragment;
        }
        TextStyleBarChildFragment textStyleBarChildFragment = new TextStyleBarChildFragment();
        c24427OooOOOo.invoke(textStyleBarChildFragment);
        this.f72811Oooo = textStyleBarChildFragment;
        AudioBarChildFragment audioBarChildFragment = new AudioBarChildFragment();
        c24427OooOOOo.invoke(audioBarChildFragment);
        this.f72819Oooo0o0 = audioBarChildFragment;
        LockNoteFragment lockNoteFragment = new LockNoteFragment();
        c24427OooOOOo.invoke(lockNoteFragment);
        this.f72823OoooO0 = lockNoteFragment;
        ImportImagesFragment importImagesFragment = new ImportImagesFragment();
        c24427OooOOOo.invoke(importImagesFragment);
        this.f72825OoooO0O = importImagesFragment;
        LatestOpenedNoteTabFragment latestOpenedNoteTabFragment = new LatestOpenedNoteTabFragment();
        c24427OooOOOo.invoke(latestOpenedNoteTabFragment);
        this.f72815Oooo00o = latestOpenedNoteTabFragment;
        Fragment fragment = this.f72823OoooO0;
        if (fragment == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteEditorFragment");
            c20358OooO00o.OooO0OO("removeMarkTimeIfNotReachLimit lockNoteFragment is null", new Object[0]);
        } else {
            Oooo00o(fragment, new C28511OooO0o(this, 1));
        }
        final C28753o00000OO c28753o00000OO = new C28753o00000OO(this);
        if (zOooo0oo) {
            View view = getView();
            final View viewFindViewById = view != null ? view.findViewById(R.id.pen_box) : null;
            Fragment fragment2 = this.f72816Oooo0O0;
            if (fragment2 == null || viewFindViewById == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("NoteEditorFragment");
                c20358OooO00o2.OooO0OO("initPenBarView penBoxChildFragment is null or fragmentView is null. " + fragment2 + ", " + viewFindViewById, new Object[0]);
            } else {
                Oooo00o(fragment2, new InterfaceC32507OooOO0o() { // from class: o0OoO0oo.Ooooooo
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View$OnLayoutChangeListener, o0Ooo.OooOOO0] */
                    @Override // oO0O000o.InterfaceC32507OooOO0o
                    public final Object invoke(Object obj) {
                        Fragment it = (Fragment) obj;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                        final PenBoxChildFragment penBoxChildFragment2 = (PenBoxChildFragment) it;
                        final InterfaceC21987OooOoo viewLifecycleOwner = this.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        final View view2 = viewFindViewById;
                        C28753o00000OO c28753o00000OO2 = c28753o00000OO;
                        penBoxChildFragment2.f75364Oooo000 = viewLifecycleOwner;
                        C33781o00o0O c33781o00o0O = penBoxChildFragment2.Oooo0o().f75152OooOOOo;
                        c33781o00o0O.getClass();
                        c33781o00o0O.OooOO0(null, 0);
                        penBoxChildFragment2.f75365Oooo00O = view2;
                        view2.setFocusableInTouchMode(true);
                        View view3 = penBoxChildFragment2.f75365Oooo00O;
                        if (view3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view3.setVisibility(0);
                        penBoxChildFragment2.f75376OoooO0O = view2.findViewById(R.id.toolbox_icon_wrapper);
                        penBoxChildFragment2.f75373OoooO = (ImageView) view2.findViewById(R.id.toolbox_icon);
                        penBoxChildFragment2.f75377OoooOO0 = (ImageView) view2.findViewById(R.id.toolbox_tape_pen_tint);
                        penBoxChildFragment2.f75402o000oOoO = (ImageView) view2.findViewById(R.id.toolbox_icon_tint);
                        penBoxChildFragment2.f75366Oooo00o = view2.findViewById(R.id.toolbox_panel);
                        penBoxChildFragment2.f75363Oooo0 = view2.findViewById(R.id.handle);
                        penBoxChildFragment2.f75367Oooo0O0 = view2.findViewById(R.id.toolbox_panel_wrapper);
                        View view4 = penBoxChildFragment2.f75376OoooO0O;
                        if (view4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
                            throw null;
                        }
                        Rect rect = new Rect(0, 0, Oooo0.o000000O.OooO0o(60), Oooo0.o000000O.OooO0o(60));
                        View view5 = penBoxChildFragment2.f75363Oooo0;
                        if (view5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
                            throw null;
                        }
                        view4.setTouchDelegate(new TouchDelegate(rect, view5));
                        penBoxChildFragment2.f75404o00Oo0.post(new androidx.fragment.app.OooOO0(penBoxChildFragment2, 2));
                        View view6 = penBoxChildFragment2.f75363Oooo0;
                        if (view6 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
                            throw null;
                        }
                        view6.setOnTouchListener(penBoxChildFragment2.f75372Oooo0oo);
                        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.pen_list);
                        recyclerView.setItemAnimator(null);
                        C29901OooO0oo c29901OooO0oo = penBoxChildFragment2.f75375OoooO00;
                        recyclerView.setAdapter(c29901OooO0oo);
                        c29901OooO0oo.f106080OooO0O0 = new View.OnClickListener() { // from class: o0Ooo.OooO0o0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view7) {
                                int i = PenBoxChildFragment.f75355o0000Ooo;
                                PenBoxChildFragment penBoxChildFragment3 = penBoxChildFragment2;
                                Integer num = (Integer) penBoxChildFragment3.Oooo0o().f75160OooOo0o.f121747OooOo0o.getValue();
                                if (num != null) {
                                    int iIntValue = num.intValue();
                                    Object tag = view7.getTag();
                                    kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenVO");
                                    PenVO penVO = (PenVO) tag;
                                    Object obj2 = null;
                                    if (!penVO.getSelected()) {
                                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C29303Oooo0oO(penVO, penBoxChildFragment3, null), 3);
                                        return;
                                    }
                                    Iterator it2 = ((Iterable) penBoxChildFragment3.Oooo0o().f75193OooooOo.f121747OooOo0o.getValue()).iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        Object next = it2.next();
                                        if (((PenWidthVO) next).getSelected()) {
                                            obj2 = next;
                                            break;
                                        }
                                    }
                                    PenWidthVO penWidthVO = (PenWidthVO) obj2;
                                    switch (penVO.getType()) {
                                        case 0:
                                        case 1:
                                            List<PenVO> list = (List) penBoxChildFragment3.Oooo0o().f75172Oooo00o.f121747OooOo0o.getValue();
                                            List<PenColorVO> list2 = (List) penBoxChildFragment3.Oooo0o().f75188OoooOoo.f121747OooOo0o.getValue();
                                            if (penWidthVO != null) {
                                                penBoxChildFragment3.OoooOO0();
                                                C29950OooO0o0 c29950OooO0o0 = penBoxChildFragment3.f75411o0OO00O;
                                                if (c29950OooO0o0 != null) {
                                                    c29950OooO0o0.OooO0oO(view7, iIntValue, penVO, list, list2, penWidthVO);
                                                }
                                            } else {
                                                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o3.OooOOO0("PenBoxChildFragment");
                                                c20358OooO00o3.OooO0OO("TOOL_BALLPOINT_PEN, TOOL_FOUNTAIN_PEN, TOOL_PENCIL penWidthVO is null", new Object[0]);
                                            }
                                            break;
                                        case 2:
                                        case 9:
                                            List<PenVO> list3 = (List) penBoxChildFragment3.Oooo0o().f75173Oooo0O0.f121747OooOo0o.getValue();
                                            List<PenColorVO> list4 = (List) penBoxChildFragment3.Oooo0o().f75188OoooOoo.f121747OooOo0o.getValue();
                                            if (penWidthVO != null) {
                                                penBoxChildFragment3.OoooO();
                                                C29948OooO0Oo c29948OooO0Oo = penBoxChildFragment3.f75394o000000O;
                                                if (c29948OooO0Oo != null) {
                                                    c29948OooO0Oo.OooO0oO(view7, iIntValue, penVO, list3, list4, penWidthVO);
                                                }
                                            } else {
                                                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o4.OooOOO0("PenBoxChildFragment");
                                                c20358OooO00o4.OooO0OO("TOOL_HIGHLIGHTER_PEN, TOOL_HIGHLIGHTER_PEN_RECT penWidthVO is null", new Object[0]);
                                            }
                                            break;
                                        case 3:
                                            String string = penVO.getExtra().getString("penPressToEraser");
                                            if (string == null) {
                                                string = TelemetryEventStrings.Value.TRUE;
                                            }
                                            string.equals(TelemetryEventStrings.Value.TRUE);
                                            String string2 = penVO.getExtra().getString("eraseHighlighterOnly");
                                            String str = TelemetryEventStrings.Value.FALSE;
                                            if (string2 == null) {
                                                string2 = TelemetryEventStrings.Value.FALSE;
                                            }
                                            string2.equals(TelemetryEventStrings.Value.TRUE);
                                            String string3 = penVO.getExtra().getString("eraseTapeOnly");
                                            if (string3 != null) {
                                                str = string3;
                                            }
                                            str.equals(TelemetryEventStrings.Value.TRUE);
                                            penVO.getExtra().getFloat("eraserPressure");
                                            if (penWidthVO != null) {
                                                penBoxChildFragment3.OoooO0O();
                                                C29947OooO0OO c29947OooO0OO = penBoxChildFragment3.f75392o00000;
                                                if (c29947OooO0OO != null) {
                                                    c29947OooO0OO.OooO0o0(view7, iIntValue, penWidthVO);
                                                }
                                            } else {
                                                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o5.OooOOO0("PenBoxChildFragment");
                                                c20358OooO00o5.OooO0OO("TOOL_ERASER penWidthVO is null", new Object[0]);
                                            }
                                            break;
                                        case 4:
                                            penBoxChildFragment3.OoooooO(view7);
                                            break;
                                        case 5:
                                            C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o6.OooOOO0("PenBoxChildFragment");
                                            c20358OooO00o6.OooOO0O("TOOL_SHAPE_PEN is not supported", new Object[0]);
                                            break;
                                        case 6:
                                            C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o7.OooOOO0("PenBoxChildFragment");
                                            c20358OooO00o7.OooOO0O("TOOL_HL_SHAPE_PEN is not supported", new Object[0]);
                                            break;
                                        case 7:
                                            List list5 = (List) penBoxChildFragment3.Oooo0o().f75188OoooOoo.f121747OooOo0o.getValue();
                                            if (penWidthVO != null) {
                                                penBoxChildFragment3.o000oOoO();
                                                C29949OooO0o c29949OooO0o = penBoxChildFragment3.f75398o00000OO;
                                                if (c29949OooO0o != null) {
                                                    penVO.getColor();
                                                    c29949OooO0o.OooO0o0(view7, iIntValue, list5, penWidthVO);
                                                }
                                            } else {
                                                C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o8.OooOOO0("PenBoxChildFragment");
                                                c20358OooO00o8.OooO0OO("TOOL_LASER_PEN penWidthVO is null", new Object[0]);
                                            }
                                            break;
                                        case 8:
                                            String string4 = penVO.getExtra().getString(C18437z2.f56754h);
                                            if (string4 != null) {
                                                Integer.parseInt(string4);
                                            }
                                            List list6 = (List) penBoxChildFragment3.Oooo0o().f75188OoooOoo.f121747OooOo0o.getValue();
                                            if (penWidthVO != null) {
                                                penBoxChildFragment3.OoooOoo();
                                                C29953OooOO0o c29953OooOO0o = penBoxChildFragment3.f75396o00000O;
                                                if (c29953OooOO0o != null) {
                                                    c29953OooOO0o.OooO0o(view7, iIntValue, list6, penWidthVO);
                                                }
                                            } else {
                                                C34406OooO00o.C20358OooO00o c20358OooO00o9 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o9.OooOOO0("PenBoxChildFragment");
                                                c20358OooO00o9.OooO0OO("TOOL_VECTOR_PEN penWidthVO is null", new Object[0]);
                                            }
                                            break;
                                        case 10:
                                        case 12:
                                            List<PenVO> list7 = (List) penBoxChildFragment3.Oooo0o().f75169Oooo0.f121747OooOo0o.getValue();
                                            List<PenColorVO> list8 = (List) penBoxChildFragment3.Oooo0o().f75188OoooOoo.f121747OooOo0o.getValue();
                                            if (penWidthVO != null) {
                                                penBoxChildFragment3.OoooOo0();
                                                o0o00o0O.OooO oooO = penBoxChildFragment3.f75393o000000;
                                                if (oooO != null) {
                                                    oooO.OooO0Oo(view7, iIntValue, penVO, list7, list8, penWidthVO);
                                                }
                                            } else {
                                                C34406OooO00o.C20358OooO00o c20358OooO00o10 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o10.OooOOO0("PenBoxChildFragment");
                                                c20358OooO00o10.OooO0OO("pencil penWidthVO is null", new Object[0]);
                                            }
                                            break;
                                        case 11:
                                            List<PenColorVO> list9 = (List) penBoxChildFragment3.Oooo0o().f75188OoooOoo.f121747OooOo0o.getValue();
                                            if (penWidthVO != null) {
                                                penBoxChildFragment3.OoooOoO();
                                                o0o00o0O.OooOO0O oooOO0O = penBoxChildFragment3.f75410o0O0O00;
                                                if (oooOO0O != null) {
                                                    oooOO0O.OooO0o0(view7, iIntValue, list9, penWidthVO);
                                                }
                                            } else {
                                                C34406OooO00o.C20358OooO00o c20358OooO00o11 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o11.OooOOO0("PenBoxChildFragment");
                                                c20358OooO00o11.OooO0OO("TOOL_TAPE_PEN penWidthVO is null", new Object[0]);
                                            }
                                            break;
                                        default:
                                            C34406OooO00o.C20358OooO00o c20358OooO00o12 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o12.OooOOO0("PenBoxChildFragment");
                                            c20358OooO00o12.OooOO0O(C21532OooOOo.OooO0OO(penVO.getType(), "Unknown pen type: "), new Object[0]);
                                            break;
                                    }
                                }
                            }
                        };
                        penBoxChildFragment2.f75362Oooo = recyclerView;
                        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        penBoxChildFragment2.f75374OoooO0 = marginLayoutParams != null ? new C29317OooooO0(marginLayoutParams.getMarginStart(), marginLayoutParams.getMarginEnd()) : new C29317OooooO0(0, 0);
                        C29899OooO0o0 c29899OooO0o0 = new C29899OooO0o0(Oooo0.o000000O.OooO0o(4), 0, false);
                        RecyclerView recyclerView2 = penBoxChildFragment2.f75362Oooo;
                        if (recyclerView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("penListView");
                            throw null;
                        }
                        recyclerView2.addItemDecoration(c29899OooO0o0);
                        RecyclerView recyclerView3 = (RecyclerView) view2.findViewById(R.id.color_list);
                        penBoxChildFragment2.f75378OoooOOO = recyclerView3;
                        if (recyclerView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("penColorListView");
                            throw null;
                        }
                        C29904OooOOo c29904OooOOo = penBoxChildFragment2.f75379OoooOOo;
                        recyclerView3.setAdapter(c29904OooOOo);
                        c29904OooOOo.f106100OooO0O0 = new ViewOnClickListenerC28603OooO00o(penBoxChildFragment2, 2);
                        ImageView imageView = (ImageView) view2.findViewById(R.id.color_set_favorite);
                        penBoxChildFragment2.f75380OoooOo0 = imageView;
                        if (imageView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("colorSetFavorite");
                            throw null;
                        }
                        imageView.setOnClickListener(new View.OnClickListener() { // from class: o0Ooo.OooO0o
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view7) {
                                int i = PenBoxChildFragment.f75355o0000Ooo;
                                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C29304Oooo0oo(penBoxChildFragment2, null), 3);
                            }
                        });
                        RecyclerView recyclerView4 = penBoxChildFragment2.f75378OoooOOO;
                        if (recyclerView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("penColorListView");
                            throw null;
                        }
                        RecyclerView.OooOOOO layoutManager = recyclerView4.getLayoutManager();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                        int i = ((GridLayoutManager) layoutManager).f65751OooOo;
                        int iOooO0o = Oooo0.o000000O.OooO0o(6);
                        RecyclerView recyclerView5 = penBoxChildFragment2.f75378OoooOOO;
                        if (recyclerView5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("penColorListView");
                            throw null;
                        }
                        recyclerView5.addItemDecoration(new C29895OooO0O0(i, iOooO0o));
                        RecyclerView recyclerView6 = (RecyclerView) view2.findViewById(R.id.pen_width_list);
                        penBoxChildFragment2.f75381OoooOoO = recyclerView6;
                        if (recyclerView6 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthListView");
                            throw null;
                        }
                        recyclerView6.addItemDecoration(new C29899OooO0o0(Oooo0.o000000O.OooO0o(11), 0, false));
                        RecyclerView recyclerView7 = penBoxChildFragment2.f75381OoooOoO;
                        if (recyclerView7 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthListView");
                            throw null;
                        }
                        C29906OooOOoo c29906OooOOoo = penBoxChildFragment2.f75382OoooOoo;
                        recyclerView7.setAdapter(c29906OooOOoo);
                        c29906OooOOoo.f106105OooO0O0 = new ViewOnClickListenerC29259OooO0oO(0, penBoxChildFragment2, viewLifecycleOwner);
                        penBoxChildFragment2.f75384Ooooo0o = view2.findViewById(R.id.cl_eraser_type);
                        ImageView imageView2 = (ImageView) view2.findViewById(R.id.eraser_type_pixel);
                        imageView2.setOnClickListener(new ViewOnClickListenerC28408OooO0O0(penBoxChildFragment2, 3));
                        penBoxChildFragment2.f75385OooooO0 = imageView2;
                        ImageView imageView3 = (ImageView) view2.findViewById(R.id.eraser_type_stroke);
                        imageView3.setOnClickListener(new ViewOnClickListenerC28610OooO0oo(penBoxChildFragment2, 1));
                        penBoxChildFragment2.f75386OooooOO = imageView3;
                        ImageView imageView4 = (ImageView) view2.findViewById(R.id.eraser_type_lasso);
                        imageView4.setOnClickListener(new ViewOnClickListenerC28413OooO0oO(penBoxChildFragment2, 2));
                        penBoxChildFragment2.f75387OooooOo = imageView4;
                        penBoxChildFragment2.f75390OoooooO = view2.findViewById(R.id.lasso_type_list);
                        ImageView imageView5 = (ImageView) view2.findViewById(R.id.lasso_free);
                        imageView5.setOnClickListener(new ViewOnClickListenerC26210OooO00o(penBoxChildFragment2, 3));
                        penBoxChildFragment2.f75391Ooooooo = imageView5;
                        ImageView imageView6 = (ImageView) view2.findViewById(R.id.lasso_rect);
                        imageView6.setOnClickListener(new ViewOnClickListenerC28136OooO0O0(penBoxChildFragment2, 2));
                        penBoxChildFragment2.f75414o0OoOo0 = imageView6;
                        ImageView imageView7 = (ImageView) view2.findViewById(R.id.lasso_capture);
                        imageView7.setOnClickListener(new View.OnClickListener() { // from class: o0Ooo.OooO0OO
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view7) {
                                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C29284Oooo0OO(penBoxChildFragment2, null), 3);
                            }
                        });
                        penBoxChildFragment2.f75420ooOO = imageView7;
                        ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.fl_show_favorite_toolbox);
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewGroup);
                        C28050OooO0OO.OooO00o(viewGroup, 500L, new ViewOnClickListenerC29256OooO0Oo(penBoxChildFragment2, 0));
                        penBoxChildFragment2.f75403o00O0O = viewGroup;
                        C28025OooO0O0.OooO00o(viewGroup);
                        penBoxChildFragment2.f75389Oooooo0 = view2.findViewById(R.id.divider1);
                        penBoxChildFragment2.f75388Oooooo = view2.findViewById(R.id.divider2);
                        penBoxChildFragment2.f75368Oooo0OO = view2.findViewById(R.id.toolbox_2nd_part);
                        penBoxChildFragment2.f75406o00o0O = c28753o00000OO2;
                        View view7 = penBoxChildFragment2.f75365Oooo00O;
                        if (view7 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        view7.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0Ooo.OooOO0O
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // android.view.View.OnFocusChangeListener
                            public final void onFocusChange(View view8, boolean z) {
                                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                                PenBoxChildFragment penBoxChildFragment3 = penBoxChildFragment2;
                                Integer num = (Integer) penBoxChildFragment3.Oooo0o().f75157OooOo0.f121747OooOo0o.getValue();
                                Integer num2 = (Integer) penBoxChildFragment3.Oooo0o().f75160OooOo0o.f121747OooOo0o.getValue();
                                if (num != null && num.intValue() == 0) {
                                    if (((Boolean) ((C32443OooOOO) penBoxChildFragment3.Oooo0o().f75185OoooOOo.f121747OooOo0o.getValue()).f116638OooOo0o).booleanValue()) {
                                        if (z) {
                                            return;
                                        }
                                        view2.requestFocus();
                                        return;
                                    } else if ((num2 != null && num2.intValue() == 0) || ((num2 != null && num2.intValue() == 2) || ((num2 != null && num2.intValue() == 6) || (num2 != null && num2.intValue() == 4)))) {
                                        penBoxChildFragment3.Oooo0o().OooOO0(1);
                                    }
                                }
                                if (z || !kotlin.jvm.internal.OooOOO0.OooO0O0(penBoxChildFragment3.Oooo00O().f73373OooOoo.f121747OooOo0o.getValue(), Boolean.FALSE)) {
                                    return;
                                }
                                penBoxChildFragment3.OoooO00(false, true);
                            }
                        });
                        LinkedHashMap linkedHashMap = penBoxChildFragment2.f75371Oooo0oO;
                        linkedHashMap.clear();
                        linkedHashMap.put(0, C20519OooO0Oo.OooO0OO(new C29006OooOOoo(penBoxChildFragment2, 1)));
                        ViewOnHoverListenerC29266OooOOOo viewOnHoverListenerC29266OooOOOo = new ViewOnHoverListenerC29266OooOOOo();
                        View view8 = penBoxChildFragment2.f75363Oooo0;
                        if (view8 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("moveHandle");
                            throw null;
                        }
                        view8.setOnHoverListener(viewOnHoverListenerC29266OooOOOo);
                        View view9 = penBoxChildFragment2.f75376OoooO0O;
                        if (view9 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
                            throw null;
                        }
                        view9.setOnHoverListener(viewOnHoverListenerC29266OooOOOo);
                        View view10 = penBoxChildFragment2.f75365Oooo00O;
                        if (view10 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                            throw null;
                        }
                        Object parent = view10.getParent();
                        View view11 = parent instanceof View ? (View) parent : 0;
                        if (view11 != 0 && (penBoxChildFragment2.f75370Oooo0o0 != view11 || penBoxChildFragment2.f75369Oooo0o == null)) {
                            penBoxChildFragment2.Oooooo0();
                            ?? r2 = new View.OnLayoutChangeListener() { // from class: o0Ooo.OooOOO0
                                @Override // android.view.View.OnLayoutChangeListener
                                public final void onLayoutChange(View view12, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                                    int i10 = PenBoxChildFragment.f75355o0000Ooo;
                                    if (i4 - i2 == i8 - i6 && i5 - i3 == i9 - i7) {
                                        return;
                                    }
                                    PenBoxChildFragment penBoxChildFragment3 = penBoxChildFragment2;
                                    View view13 = penBoxChildFragment3.f75365Oooo00O;
                                    if (view13 == null) {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                        throw null;
                                    }
                                    o000O000.OooOO0 oooOO02 = penBoxChildFragment3.f75405o00Ooo;
                                    view13.removeCallbacks(oooOO02);
                                    View view14 = penBoxChildFragment3.f75365Oooo00O;
                                    if (view14 != null) {
                                        view14.post(oooOO02);
                                    } else {
                                        kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
                                        throw null;
                                    }
                                }
                            };
                            view11.addOnLayoutChangeListener(r2);
                            penBoxChildFragment2.f75370Oooo0o0 = view11;
                            penBoxChildFragment2.f75369Oooo0o = r2;
                        }
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C29286Oooo0o0(penBoxChildFragment2, null), 3);
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C29285Oooo0o(penBoxChildFragment2, null), 3);
                        return C32460OooOooO.f116667OooO00o;
                    }
                });
                C33609OooO0oo.OooO0OO(C28982oo0o0Oo.OooO00o(this, "getViewLifecycleOwner(...)"), null, null, new C28751o00000O(this, null, zOooo0oo), 3);
            }
        } else {
            View view2 = getView();
            View viewFindViewById2 = view2 != null ? view2.findViewById(R.id.pen_bar) : null;
            this.f72832Ooooo00 = viewFindViewById2;
            Fragment fragment3 = this.f72812Oooo0;
            if (fragment3 == null || viewFindViewById2 == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("NoteEditorFragment");
                c20358OooO00o3.OooO0OO("initPenBarView penBarChildFragment is null or fragmentView is null. " + fragment3 + ", " + viewFindViewById2, new Object[0]);
            } else {
                Oooo00o(fragment3, new C28975o0OoOo0(viewFindViewById2, this, c28753o00000OO, 0));
                C33609OooO0oo.OooO0OO(C28982oo0o0Oo.OooO00o(this, "getViewLifecycleOwner(...)"), null, null, new C28751o00000O(this, null, zOooo0oo), 3);
            }
        }
        C28755o00000o0 c28755o00000o0 = new C28755o00000o0(this);
        View view3 = getView();
        View viewFindViewById3 = view3 != null ? view3.findViewById(R.id.tool_bar) : null;
        if (viewFindViewById3 == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("NoteEditorFragment");
            c20358OooO00o4.OooO0OO("toolbarView is null", new Object[0]);
        } else {
            BaseToolbarChildFragment baseToolbarChildFragment = zOooo0oo ? this.f72820Oooo0oO : this.f72821Oooo0oo;
            if (baseToolbarChildFragment == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o5.OooOOO0("NoteEditorFragment");
                c20358OooO00o5.OooO0OO("initToolbarView toolbarChildFragment is null", new Object[0]);
            } else {
                Oooo00o(baseToolbarChildFragment, new C28739OooooOO(0, viewFindViewById3, this));
                baseToolbarChildFragment.f76506o000oOoO = c28755o00000o0;
            }
        }
        Fragment fragment4 = this.f72811Oooo;
        if (fragment4 == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o6.OooOOO0("NoteEditorFragment");
            c20358OooO00o6.OooO0OO("initTextStyleBarView textStyleBarChildFragment is null", new Object[0]);
        } else if (!zOooo0oo) {
            View view4 = getView();
            View viewFindViewById4 = view4 != null ? view4.findViewById(R.id.text_style_bar) : null;
            if (viewFindViewById4 != null) {
                Oooo00o(fragment4, new C28742Oooooo0(0, viewFindViewById4, this));
            }
        }
        Fragment fragment5 = this.f72819Oooo0o0;
        if (fragment5 == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o7.OooOOO0("NoteEditorFragment");
            c20358OooO00o7.OooO0OO("initAudioBarView audioBarChildFragment is null", new Object[0]);
        } else {
            View view5 = getView();
            final View viewFindViewById5 = view5 != null ? view5.findViewById(R.id.audio_bar) : null;
            if (viewFindViewById5 != null) {
                Oooo00o(fragment5, new InterfaceC32507OooOO0o() { // from class: o0OoO0oo.ooOO
                    @Override // oO0O000o.InterfaceC32507OooOO0o
                    public final Object invoke(Object obj) {
                        Fragment it = (Fragment) obj;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                        AudioBarChildFragment audioBarChildFragment2 = (AudioBarChildFragment) it;
                        InterfaceC21987OooOoo viewLifecycleOwner = this.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        View view6 = viewFindViewById5;
                        audioBarChildFragment2.f74178OoooOOO = zOooo0oo;
                        audioBarChildFragment2.f74160OooOooO = viewLifecycleOwner;
                        audioBarChildFragment2.f74161OooOooo = view6;
                        ImageView imageView = (ImageView) view6.findViewById(R.id.btn_media_play);
                        audioBarChildFragment2.f74164Oooo000 = imageView;
                        if (imageView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnPlay");
                            throw null;
                        }
                        C28050OooO0OO.OooO00o(imageView, 500L, new ViewOnClickListenerC28288OooO(audioBarChildFragment2, 2));
                        ImageView imageView2 = (ImageView) view6.findViewById(R.id.btn_media_stop_recording);
                        audioBarChildFragment2.f74165Oooo00O = imageView2;
                        if (imageView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnStopRecording");
                            throw null;
                        }
                        C28050OooO0OO.OooO00o(imageView2, 500L, new ViewOnClickListenerC28535OooOo0(audioBarChildFragment2, 1));
                        View viewFindViewById6 = view6.findViewById(R.id.btn_media_forward_15s);
                        audioBarChildFragment2.f74166Oooo00o = viewFindViewById6;
                        if (viewFindViewById6 != null) {
                            C28050OooO0OO.OooO00o(viewFindViewById6, 500L, new o0Oo0oO0.OooOO0(audioBarChildFragment2, 2));
                        }
                        View viewFindViewById7 = view6.findViewById(R.id.btn_media_backward_15s);
                        audioBarChildFragment2.f74163Oooo0 = viewFindViewById7;
                        if (viewFindViewById7 != null) {
                            C28050OooO0OO.OooO00o(viewFindViewById7, 500L, new ViewOnClickListenerC29131OooO0o(audioBarChildFragment2, 0));
                        }
                        View viewFindViewById8 = view6.findViewById(R.id.btn_media_more);
                        audioBarChildFragment2.f74167Oooo0O0 = viewFindViewById8;
                        if (viewFindViewById8 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnMore");
                            throw null;
                        }
                        C28050OooO0OO.OooO00o(viewFindViewById8, 500L, new ViewOnClickListenerC29133OooO0oO(audioBarChildFragment2, 0));
                        View viewFindViewById9 = view6.findViewById(R.id.btn_hide);
                        audioBarChildFragment2.f74168Oooo0OO = viewFindViewById9;
                        if (viewFindViewById9 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnHide");
                            throw null;
                        }
                        C28050OooO0OO.OooO00o(viewFindViewById9, 500L, new ViewOnClickListenerC26091OooO00o(audioBarChildFragment2, 2));
                        audioBarChildFragment2.f74170Oooo0o0 = (ViewGroup) view6.findViewById(R.id.cl_player_progress_bar);
                        SeekBar seekBar = (SeekBar) view6.findViewById(R.id.media_seek_bar);
                        audioBarChildFragment2.f74169Oooo0o = seekBar;
                        if (seekBar == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("playerProgress");
                            throw null;
                        }
                        seekBar.setOnSeekBarChangeListener(new com.orion.notein.p607ui.noteeditor.audio.OooO00o(audioBarChildFragment2));
                        audioBarChildFragment2.f74171Oooo0oO = (TextView) view6.findViewById(R.id.tv_media_current_time);
                        audioBarChildFragment2.f74172Oooo0oo = (TextView) view6.findViewById(R.id.tv_media_total_time);
                        audioBarChildFragment2.f74162Oooo = (ViewGroup) view6.findViewById(R.id.cl_recorder_progress_bar);
                        WaveBarsStreamView waveBarsStreamView = (WaveBarsStreamView) view6.findViewById(R.id.iv_recorder_progress);
                        audioBarChildFragment2.f74175OoooO00 = waveBarsStreamView;
                        if (waveBarsStreamView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("recorderProgress");
                            throw null;
                        }
                        waveBarsStreamView.setOnAmplitudeUpdateListener(new C29140OooOO0O(audioBarChildFragment2));
                        audioBarChildFragment2.f74174OoooO0 = (TextView) view6.findViewById(R.id.tv_recorder_total_time);
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C29141OooOO0o(audioBarChildFragment2, null), 3);
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C29135OooOO0(audioBarChildFragment2, null), 3);
                        return C32460OooOooO.f116667OooO00o;
                    }
                });
            }
        }
        Fragment fragment6 = this.f72815Oooo00o;
        if (fragment6 == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o8.OooOOO0("NoteEditorFragment");
            c20358OooO00o8.OooO0OO("initLatestOpenedNoteTabView latestOpenedNoteTabFragment is null", new Object[0]);
        } else {
            if (zOooo0oo) {
                return;
            }
            View view6 = getView();
            View viewFindViewById6 = view6 != null ? view6.findViewById(R.id.tab_bar) : null;
            if (viewFindViewById6 != null) {
                Oooo00o(fragment6, new C28741Oooooo(0, viewFindViewById6, this));
            }
        }
    }
}
