package com.orion.notein.p607ui.notelist.documents;

import OooO0Oo.AbstractC20413OooOo0O;
import OooO0Oo.C20398OooO0O0;
import OooO0Oo.C20418OooOoo;
import OooO0oO.C20438OooO0oO;
import OooO0oO.C20439OooO0oo;
import OooO0oO.C20440OooOO0;
import Oooo0.C20855OooooOO;
import Oooo0oO.C21030OooOO0o;
import android.app.role.RoleManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.DragAndDropPermissionsCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.C21904OooOoo0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.facebook.imagepipeline.producers.C22283Oooo0OO;
import com.facebook.imagepipeline.producers.C22285Oooo0o0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C22328OooOO0o;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.C22592OooOo0o;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.Label;
import com.orion.notein.domain.models.file.ImportFileResult;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.notelist.NoteListFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.notelist.notefilterbottomsheet.NoteFilterBottomSheetDialog;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import com.orion.notein.ui.notelist.documents.NoteListContainerFragment.OooO0o;
import io.ktor.utils.p616io.C23968Oooo00o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o0000oOO.AbstractC24338OooO0o0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24564OooO00o;
import o000o0O0.C24587OooOoo;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0O0o0oO.ViewOnClickListenerC26055Ooooo00;
import o0O0o0oO.ViewOnClickListenerC26056Ooooo0o;
import o0O0o0oO.ViewOnClickListenerC26057OooooO0;
import o0O0o0oO.ViewOnClickListenerC26058OooooOO;
import o0O0o0oO.ViewOnClickListenerC26059OooooOo;
import o0O0o0oO.o000OOo;
import o0O0o0oO.o0O0O00;
import o0O0o0oO.o0OO00O;
import o0O0o0oO.o0OOO0o;
import o0O0o0oO.o0Oo0oo;
import o0O0o0oO.oo0o0Oo;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.C26342o000Oo0O;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0OOOoo.C27205OooO0OO;
import o0Oo00o.C28026OooO0OO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.C28201OooooO0;
import o0Oo0o0o.Oooo000;
import o0Oo0o0o.ViewOnClickListenerC28251OooOooo;
import o0Oo0o0o.oo000o;
import o0Oo0ooO.C28422OooOOo;
import o0OoO000.ViewOnClickListenerC28523OooO00o;
import o0OoO000.ViewOnClickListenerC28526OooO0o0;
import o0OoO000.ViewOnClickListenerC28535OooOo0;
import o0Ooooo0.ViewOnClickListenerC29697OooO00o;
import o0o00oOo.C30033OooO0o;
import o0o00oOo.C30062OoooO;
import o0o00oo.C30100OooO0oO;
import o0o00oo.C30103OooOO0O;
import o0o00oo.C30104OooOO0o;
import o0o00oo.C30105OooOOO;
import o0o00oo.C30106OooOOO0;
import o0o00oo.C30110OooOOo0;
import o0o00oo.C30113OooOo;
import o0o00oo.C30116OooOo0O;
import o0o00oo.C30117OooOo0o;
import o0o00oo.C30118OooOoO;
import o0o00oo.C30119OooOoO0;
import o0o00oo.C30121OooOoo;
import o0o00oo.C30122OooOoo0;
import o0o00oo.C30125Oooo000;
import o0o00oo.C30126Oooo00O;
import o0o00oo.ViewOnClickListenerC30096OooO0OO;
import o0o00oo.ViewOnClickListenerC30097OooO0Oo;
import o0o0O00.C30207OooOo;
import o0o0O00.C30214OooOoOO;
import o0o0O0o.C30294OooO0OO;
import o0oOoOo.C31049OooOo0;
import o0oOoOo.o00Oo0;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OOooo.C33163OooO0oO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m80612d2 = {"Lcom/orion/notein/ui/notelist/documents/NoteListContainerFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "OooO0O0", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public class NoteListContainerFragment extends Hilt_NoteListContainerFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Uri f77335OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f77336OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f77337OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C22026ooOO f77338OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public View f77339Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public Toolbar f77340Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f77341Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public RoleManager f77342Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f77343Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f77344Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f77345Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f77346Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f77347Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f77348Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TextView f77349Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f77350OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public View f77351OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public TextView f77352OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public View f77353OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public View f77354OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public ImageView f77355OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ImageView f77356OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public ImageView f77357OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public ImageView f77358OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public C30214OooOoOO f77359OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public TextView f77360Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public NoteFilterBottomSheetDialog f77361Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public C30207OooOo f77362OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public View f77363OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public C30294OooO0OO f77364OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public ImageView f77365Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public View f77366Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public View f77367OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public View f77368Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public ImageView f77369o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public ViewGroup f77370o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public TextView f77371o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public C23645OooO0o0 f77372o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public long f77373o00o0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f77374o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public TipsDialogFragment f77375o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public C30033OooO0o f77376o0OoOo0;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final OooO0O0 f77377oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public View f77378ooOO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$13", m80623f = "NoteListContainerFragment.kt", m80624l = {834}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77380OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f77381OooOo0o;

            public OooO00o(NoteListContainerFragment noteListContainerFragment) {
                this.f77381OooOo0o = noteListContainerFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                MainActivity mainActivity;
                ImportFileResult importFileResult = (ImportFileResult) obj;
                NoteListContainerFragment noteListContainerFragment = this.f77381OooOo0o;
                int code = importFileResult.getCode();
                if (code != Integer.MIN_VALUE) {
                    if (code == -7) {
                        ActivityC21897OooOo0 activity = noteListContainerFragment.getActivity();
                        mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                        if (mainActivity != null) {
                            mainActivity.showUpgradeTipOnInFileDBVersionNotMatch();
                        }
                    } else if (code != -5) {
                        if (code == -4) {
                            Context context = noteListContainerFragment.getContext();
                            if (context != null) {
                                String string = noteListContainerFragment.getString(R.string.import_failed_vip_limit);
                                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                                C25206OooO0Oo.OooO0oO(context, string);
                            }
                            ActivityC21897OooOo0 activity2 = noteListContainerFragment.getActivity();
                            mainActivity = activity2 instanceof MainActivity ? (MainActivity) activity2 : null;
                            if (mainActivity != null) {
                                mainActivity.openMembershipPlans();
                            }
                        } else if (code == -1) {
                            Context context2 = noteListContainerFragment.getContext();
                            if (context2 != null) {
                                String string2 = noteListContainerFragment.getString(R.string.uri_permission_toast_import_file);
                                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                                C25206OooO0Oo.OooO0oO(context2, string2);
                            }
                        } else if (code == 0) {
                            Context context3 = noteListContainerFragment.getContext();
                            if (context3 != null) {
                                String string3 = noteListContainerFragment.getString(R.string.import_success);
                                kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                                C25206OooO0Oo.OooO0oO(context3, string3);
                            }
                        } else if (code != 1) {
                            Context context4 = noteListContainerFragment.getContext();
                            if (context4 != null) {
                                String string4 = noteListContainerFragment.getString(R.string.import_failed);
                                kotlin.jvm.internal.OooOOO0.OooO0o(string4, "getString(...)");
                                C25206OooO0Oo.OooO0oO(context4, string4);
                            }
                        } else {
                            Object obj2 = importFileResult.getObj();
                            kotlin.jvm.internal.OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type com.orion.notein.domain.models.note.NoteMeta");
                            NoteMeta noteMeta = (NoteMeta) obj2;
                            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteListContainerFragment), C23968Oooo00o.OooO0o0(28, noteMeta.getId(), noteMeta.getParentId(), null));
                        }
                    } else if (noteListContainerFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                        String string5 = noteListContainerFragment.getString(R.string.tips);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string5, "getString(...)");
                        String string6 = noteListContainerFragment.getString(R.string.hit_max_num_of_my_templates);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string6, "getString(...)");
                        new TipsDialogFragment(string5, string6, null, null).show(noteListContainerFragment.getChildFragmentManager(), "TipsDialogFragment");
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteListContainerFragment.this.new OooO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77380OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteListContainerFragment noteListContainerFragment = NoteListContainerFragment.this;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
                OooO00o oooO00o = new OooO00o(noteListContainerFragment);
                this.f77380OooOo0o = 1;
                if (oooO0OOOooOoo.f77169Ooooo00.collect(oooO00o, this) == enumC32485OooO00o) {
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

    public final class OooO00o implements View.OnDragListener {

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$ImageDragListener$onDrag$1", m80623f = "NoteListContainerFragment.kt", m80624l = {1654}, m80625m = "invokeSuspend")
        public static final class C19406OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f77383OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public DragAndDropPermissionsCompat f77384OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ DragEvent f77385OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ ActivityC21897OooOo0 f77386OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public final /* synthetic */ ClipDescription f77387OooOoOO;

            /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f77388OooOoo0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19406OooO00o(ActivityC21897OooOo0 activityC21897OooOo0, DragEvent dragEvent, ClipDescription clipDescription, NoteListContainerFragment noteListContainerFragment, Continuation<? super C19406OooO00o> continuation) {
                super(2, continuation);
                this.f77386OooOoO0 = activityC21897OooOo0;
                this.f77385OooOoO = dragEvent;
                this.f77387OooOoOO = clipDescription;
                this.f77388OooOoo0 = noteListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19406OooO00o(this.f77386OooOoO0, this.f77385OooOoO, this.f77387OooOoOO, this.f77388OooOoo0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19406OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                DragAndDropPermissionsCompat dragAndDropPermissionsCompatRequestDragAndDropPermissions;
                DragAndDropPermissionsCompat dragAndDropPermissionsCompat;
                Throwable th;
                DragEvent dragEvent = this.f77385OooOoO;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77383OooOo;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    dragAndDropPermissionsCompatRequestDragAndDropPermissions = null;
                    try {
                        dragAndDropPermissionsCompatRequestDragAndDropPermissions = ActivityCompat.requestDragAndDropPermissions(this.f77386OooOoO0, dragEvent);
                        if (this.f77387OooOoOO.hasMimeType("image/*")) {
                            Uri uri = dragEvent.getClipData().getItemAt(0).getUri();
                            com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = this.f77388OooOoo0.OooOoo();
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(uri);
                            this.f77384OooOo0o = dragAndDropPermissionsCompatRequestDragAndDropPermissions;
                            this.f77383OooOo = 1;
                            if (oooO0OOOooOoo.OooOOOO(uri, this) == enumC32485OooO00o) {
                                return enumC32485OooO00o;
                            }
                            dragAndDropPermissionsCompat = dragAndDropPermissionsCompatRequestDragAndDropPermissions;
                            dragAndDropPermissionsCompatRequestDragAndDropPermissions = dragAndDropPermissionsCompat;
                        }
                        if (dragAndDropPermissionsCompatRequestDragAndDropPermissions != null) {
                        }
                    } catch (Exception unused) {
                        dragAndDropPermissionsCompat = dragAndDropPermissionsCompatRequestDragAndDropPermissions;
                        if (dragAndDropPermissionsCompat != null) {
                        }
                    } catch (Throwable th2) {
                        dragAndDropPermissionsCompat = dragAndDropPermissionsCompatRequestDragAndDropPermissions;
                        th = th2;
                        if (dragAndDropPermissionsCompat != null) {
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dragAndDropPermissionsCompat = this.f77384OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(obj);
                        dragAndDropPermissionsCompatRequestDragAndDropPermissions = dragAndDropPermissionsCompat;
                        if (dragAndDropPermissionsCompatRequestDragAndDropPermissions != null) {
                            dragAndDropPermissionsCompatRequestDragAndDropPermissions.release();
                        }
                    } catch (Exception unused2) {
                        if (dragAndDropPermissionsCompat != null) {
                            dragAndDropPermissionsCompat.release();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (dragAndDropPermissionsCompat != null) {
                            dragAndDropPermissionsCompat.release();
                        }
                        throw th;
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO00o() {
        }

        @Override // android.view.View.OnDragListener
        public final boolean onDrag(View v, DragEvent event) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
            kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
            NoteListContainerFragment noteListContainerFragment = NoteListContainerFragment.this;
            ActivityC21897OooOo0 activity = noteListContainerFragment.getActivity();
            if (activity == null) {
                return false;
            }
            C34406OooO00o.f123390OooO00o.OooO00o("NoteListContainerFragment, onDrag start.", new Object[0]);
            ClipData clipData = event.getClipData();
            if (event.getAction() != 1) {
                event.getAction();
            }
            event.getAction();
            if (event.getAction() == 3 && clipData.getItemCount() != 0) {
                C33609OooO0oo.OooO0OO(OooO0O0.OooO0o.OooO00o(noteListContainerFragment, "getViewLifecycleOwner(...)"), null, null, new C19406OooO00o(activity, event, clipData.getDescription(), noteListContainerFragment, null), 3);
            }
            return true;
        }
    }

    public final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Uri f77389OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0o.OooO0O0<String> f77390OooO0O0;

        public OooO0O0(final NoteListContainerFragment noteListContainerFragment) {
            OooO0o.OooO0O0<String> oooO0O0RegisterForActivityResult = noteListContainerFragment.registerForActivityResult(new C20438OooO0oO(), new OooO0o.OooO00o() { // from class: o0o00oo.OooO
                @Override // OooO0o.OooO00o
                public final void OooO0O0(Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    NoteListContainerFragment noteListContainerFragment2 = noteListContainerFragment;
                    if (zBooleanValue) {
                        Uri uri = this.f107160OooOo0o.f77389OooO00o;
                        if (uri != null) {
                            noteListContainerFragment2.OooOoo().OooOOO(uri);
                            return;
                        }
                        return;
                    }
                    String string = noteListContainerFragment2.getString(R.string.request_permission_title_import_file);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    String string2 = noteListContainerFragment2.getString(R.string.request_permission_content_import_file);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteListContainerFragment2), new C30127Oooo00o(string, string2));
                }
            });
            kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
            this.f77390OooO0O0 = oooO0O0RegisterForActivityResult;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onCreate$1$1", m80623f = "NoteListContainerFragment.kt", m80624l = {376}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77392OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Uri f77393OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Uri uri, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f77393OooOoO0 = uri;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteListContainerFragment.this.new OooO0OO(this.f77393OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            OooO0OO oooO0OO;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77392OooOo0o;
            NoteListContainerFragment noteListContainerFragment = NoteListContainerFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f77392OooOo0o = 1;
                oooO0OO = this;
                obj = NoteListContainerFragment.Oooo00o(noteListContainerFragment, 37, 0, null, oooO0OO, 6);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                oooO0OO = this;
            }
            if (!((Boolean) obj).booleanValue()) {
                noteListContainerFragment.OooOoo().OooOOO(oooO0OO.f77393OooOoO0);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onCreate$2$1$1", m80623f = "NoteListContainerFragment.kt", m80624l = {394}, m80625m = "invokeSuspend")
    public static final class C23644OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77395OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ ArrayList<Uri> f77396OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0Oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onCreate$2$1$1$1", m80623f = "NoteListContainerFragment.kt", m80624l = {398}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f77397OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77398OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ String f77399OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ ArrayList<Uri> f77400OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteListContainerFragment noteListContainerFragment, ArrayList<Uri> arrayList, String str, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77397OooOo = noteListContainerFragment;
                this.f77400OooOoO0 = arrayList;
                this.f77399OooOoO = str;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f77397OooOo, this.f77400OooOoO0, this.f77399OooOoO, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77398OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = this.f77397OooOo.OooOoo();
                    List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(this.f77400OooOoO0);
                    this.f77398OooOo0o = 1;
                    if (oooO0OOOooOoo.OooOOo0(listO0ooOO0, this.f77399OooOoO, this) == enumC32485OooO00o) {
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
        public C23644OooO0Oo(ArrayList<Uri> arrayList, Continuation<? super C23644OooO0Oo> continuation) {
            super(2, continuation);
            this.f77396OooOoO0 = arrayList;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteListContainerFragment.this.new C23644OooO0Oo(this.f77396OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23644OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77395OooOo0o;
            ArrayList<Uri> arrayList = this.f77396OooOoO0;
            NoteListContainerFragment noteListContainerFragment = NoteListContainerFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                int size = arrayList.size();
                this.f77395OooOo0o = 1;
                obj = NoteListContainerFragment.Oooo00o(noteListContainerFragment, 37, size, null, this, 4);
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
                NoteVO noteVO = (NoteVO) ((C32443OooOOO) noteListContainerFragment.OooOoo().f77161OoooO00.getValue()).f116638OooOo0o;
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new OooO00o(noteListContainerFragment, arrayList, noteVO != null ? noteVO.getId() : null, null), 3);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onCreate$5$1", m80623f = "NoteListContainerFragment.kt", m80624l = {442, 443}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77402OooOo0o;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteListContainerFragment.this.new OooO0o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        
            if (com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment.OooOoOO(r5.f77401OooOo, r5) == r0) goto L15;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77402OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f77402OooOo0o = 1;
                if (C33644OoooO0.OooO00o(1000L, this) != enumC32485OooO00o) {
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
            this.f77402OooOo0o = 2;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23645OooO0o0 extends AbstractC20413OooOo0O {

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0o0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onCreate$3$handleOnBackPressed$1", m80623f = "NoteListContainerFragment.kt", m80624l = {422}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f77404OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77405OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ NoteVO f77406OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteListContainerFragment noteListContainerFragment, NoteVO noteVO, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77404OooOo = noteListContainerFragment;
                this.f77406OooOoO0 = noteVO;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f77404OooOo, this.f77406OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77405OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = this.f77404OooOo.OooOoo();
                    this.f77405OooOo0o = 1;
                    if (oooO0OOOooOoo.OooOoO0(this.f77406OooOoO0, this) == enumC32485OooO00o) {
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

        public C23645OooO0o0() {
            super(true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // OooO0Oo.AbstractC20413OooOo0O
        public final void handleOnBackPressed() {
            String name;
            NoteListContainerFragment noteListContainerFragment = NoteListContainerFragment.this;
            if (((Number) noteListContainerFragment.OooOoo().f77147OooOooo.getValue()).intValue() != 0) {
                noteListContainerFragment.OooOoo().Oooo000(0);
                return;
            }
            C32443OooOOO c32443OooOOO = (C32443OooOOO) noteListContainerFragment.OooOoo().f77161OoooO00.getValue();
            NoteVO noteVO = (NoteVO) c32443OooOOO.f116638OooOo0o;
            NoteVO noteVO2 = (NoteVO) c32443OooOOO.f116637OooOo;
            if (noteVO == null) {
                if (System.currentTimeMillis() - noteListContainerFragment.f77373o00o0O < 2000) {
                    noteListContainerFragment.requireActivity().finish();
                    return;
                }
                Context contextRequireContext = noteListContainerFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                String string = noteListContainerFragment.getString(R.string.toast_exit_app_double_check);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
                noteListContainerFragment.f77373o00o0O = System.currentTimeMillis();
                return;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteListContainerFragment");
            String name2 = noteVO.getName();
            if (noteVO2 == null || (name = noteVO2.getName()) == null) {
                name = "Desktop";
            }
            c20358OooO00o.OooO00o(C22237OooO0o0.OooO00o("system back: ", name2, " to ", name), new Object[0]);
            InterfaceC21987OooOoo viewLifecycleOwner = noteListContainerFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(noteListContainerFragment, noteVO2, null), 3);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$11", m80623f = "NoteListContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23646OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f77408OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0oO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$11$1", m80623f = "NoteListContainerFragment.kt", m80624l = {720}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f77409OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77410OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0oO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$11$1$1", m80623f = "NoteListContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19407OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {
                public C19407OooO00o() {
                    throw null;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19407OooO00o(2, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19407OooO00o) create(bool, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteListContainerFragment noteListContainerFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77409OooOo = noteListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f77409OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77410OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C26320o0000OoO c26320o0000OoOOooOooO = this.f77409OooOo.OooOooO();
                    C19407OooO00o c19407OooO00o = new C19407OooO00o(2, null);
                    this.f77410OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c26320o0000OoOOooOooO.f90231OooOooo, c19407OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0oO$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$11$2", m80623f = "NoteListContainerFragment.kt", m80624l = {725}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f77411OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77412OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0oO$OooO0O0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteListContainerFragment f77413OooOo0o;

                public OooO00o(NoteListContainerFragment noteListContainerFragment) {
                    this.f77413OooOo0o = noteListContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List<SortKeyVO> list = (List) obj;
                    C30294OooO0OO c30294OooO0OO = this.f77413OooOo0o.f77364OooooOo;
                    if (c30294OooO0OO != null) {
                        c30294OooO0OO.OooO0OO(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("sortPopupWindow");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(NoteListContainerFragment noteListContainerFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f77411OooOo = noteListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f77411OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77412OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteListContainerFragment noteListContainerFragment = this.f77411OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(noteListContainerFragment);
                    this.f77412OooOo0o = 1;
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0oO$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$11$3", m80623f = "NoteListContainerFragment.kt", m80624l = {730}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f77414OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77415OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0oO$OooO0OO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$11$3$1", m80623f = "NoteListContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ NoteListContainerFragment f77416OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ int f77417OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(NoteListContainerFragment noteListContainerFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f77416OooOo = noteListContainerFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f77416OooOo, continuation);
                    oooO00o.f77417OooOo0o = ((Number) obj).intValue();
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    int i = this.f77417OooOo0o;
                    NoteListContainerFragment noteListContainerFragment = this.f77416OooOo;
                    if (i == 0) {
                        View view = noteListContainerFragment.f77367OoooooO;
                        if (view == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("labelFilterColor");
                            throw null;
                        }
                        view.setVisibility(8);
                        View view2 = noteListContainerFragment.f77368Ooooooo;
                        if (view2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("labelFilterBorder");
                            throw null;
                        }
                        view2.setVisibility(8);
                        ImageView imageView = noteListContainerFragment.f77365Oooooo;
                        if (imageView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("labelFilter");
                            throw null;
                        }
                        imageView.setVisibility(0);
                        C32443OooOOO c32443OooOOO = (C32443OooOOO) noteListContainerFragment.OooOoo().f77161OoooO00.getValue();
                        NoteVO noteVO = (NoteVO) c32443OooOOO.f116638OooOo0o;
                        if (noteVO == null) {
                            View view3 = noteListContainerFragment.f77344Oooo0O0;
                            if (view3 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("btnMenu");
                                throw null;
                            }
                            view3.setVisibility(0);
                            View view4 = noteListContainerFragment.f77346Oooo0o;
                            if (view4 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("creativeLibraryEntry");
                                throw null;
                            }
                            view4.setVisibility(0);
                            TextView textView = noteListContainerFragment.f77349Oooo0oo;
                            if (textView == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("currentFolder");
                                throw null;
                            }
                            textView.setVisibility(8);
                            View view5 = noteListContainerFragment.f77339Oooo;
                            if (view5 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("btnBackToParent");
                                throw null;
                            }
                            view5.setVisibility(8);
                        }
                    } else {
                        int i2 = ((C28422OooOOo) ((List) noteListContainerFragment.OooOoo().f77153Oooo0O0.f121747OooOo0o.getValue()).get(i)).f100769OooO00o;
                        View view6 = noteListContainerFragment.f77367OoooooO;
                        if (view6 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("labelFilterColor");
                            throw null;
                        }
                        view6.setVisibility(0);
                        View view7 = noteListContainerFragment.f77368Ooooooo;
                        if (view7 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("labelFilterBorder");
                            throw null;
                        }
                        view7.setVisibility(0);
                        ImageView imageView2 = noteListContainerFragment.f77365Oooooo;
                        if (imageView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("labelFilter");
                            throw null;
                        }
                        imageView2.setVisibility(8);
                        View view8 = noteListContainerFragment.f77367OoooooO;
                        if (view8 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("labelFilterColor");
                            throw null;
                        }
                        Drawable background = view8.getBackground();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                        GradientDrawable gradientDrawable = (GradientDrawable) background;
                        gradientDrawable.setColor(i2);
                        View view9 = noteListContainerFragment.f77367OoooooO;
                        if (view9 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("labelFilterColor");
                            throw null;
                        }
                        view9.setBackground(gradientDrawable);
                        View view10 = noteListContainerFragment.f77344Oooo0O0;
                        if (view10 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnMenu");
                            throw null;
                        }
                        view10.setVisibility(8);
                        View view11 = noteListContainerFragment.f77346Oooo0o;
                        if (view11 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("creativeLibraryEntry");
                            throw null;
                        }
                        view11.setVisibility(8);
                        TextView textView2 = noteListContainerFragment.f77349Oooo0oo;
                        if (textView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("currentFolder");
                            throw null;
                        }
                        textView2.setVisibility(0);
                        View view12 = noteListContainerFragment.f77339Oooo;
                        if (view12 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnBackToParent");
                            throw null;
                        }
                        view12.setVisibility(0);
                        TextView textView3 = noteListContainerFragment.f77352OoooO00;
                        if (textView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnBackParentFolderName");
                            throw null;
                        }
                        textView3.setText(noteListContainerFragment.getString(R.string.desktop));
                        com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
                        C28422OooOOo c28422OooOOo = (C28422OooOOo) ((List) oooO0OOOooOoo.f77153Oooo0O0.f121747OooOo0o.getValue()).get(((Number) oooO0OOOooOoo.f77149Oooo0.getValue()).intValue());
                        String string = noteListContainerFragment.getResources().getString(c28422OooOOo.f100770OooO0O0);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        Label.Companion companion = Label.INSTANCE;
                        TextView textView4 = noteListContainerFragment.f77349Oooo0oo;
                        if (textView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("currentFolder");
                            throw null;
                        }
                        Context context = textView4.getContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
                        SpannableString spannableString = companion.formatSpannableString(context, string, c28422OooOOo.f100769OooO00o);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableString);
                        spannableStringBuilder.append((CharSequence) " ");
                        TextView textView5 = noteListContainerFragment.f77349Oooo0oo;
                        if (textView5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("currentFolder");
                            throw null;
                        }
                        textView5.setText(spannableStringBuilder);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(NoteListContainerFragment noteListContainerFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f77414OooOo = noteListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f77414OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77415OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteListContainerFragment noteListContainerFragment = this.f77414OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(noteListContainerFragment, null);
                    this.f77415OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f77149Oooo0, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0oO$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$11$4", m80623f = "NoteListContainerFragment.kt", m80624l = {778}, m80625m = "invokeSuspend")
        public static final class C23647OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f77418OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77419OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0oO$OooO0Oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$11$4$1", m80623f = "NoteListContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C28422OooOOo>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ NoteListContainerFragment f77420OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f77421OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(NoteListContainerFragment noteListContainerFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f77420OooOo = noteListContainerFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f77420OooOo, continuation);
                    oooO00o.f77421OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C28422OooOOo> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f77421OooOo0o;
                    C30033OooO0o c30033OooO0o = this.f77420OooOo.f77376o0OoOo0;
                    if (c30033OooO0o == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("labelFilterPopupWindow");
                        throw null;
                    }
                    kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
                    c30033OooO0o.f106763OooO0Oo.OooO0Oo(list);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23647OooO0Oo(NoteListContainerFragment noteListContainerFragment, Continuation<? super C23647OooO0Oo> continuation) {
                super(2, continuation);
                this.f77418OooOo = noteListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23647OooO0Oo(this.f77418OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23647OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77419OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteListContainerFragment noteListContainerFragment = this.f77418OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(noteListContainerFragment, null);
                    this.f77419OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f77153Oooo0O0, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0oO$OooO0o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$11$6", m80623f = "NoteListContainerFragment.kt", m80624l = {796}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f77422OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77423OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0oO$OooO0o$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$11$6$1", m80623f = "NoteListContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31049OooOo0>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ NoteListContainerFragment f77424OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f77425OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(NoteListContainerFragment noteListContainerFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f77424OooOo = noteListContainerFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f77424OooOo, continuation);
                    oooO00o.f77425OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C31049OooOo0> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List<C31049OooOo0> list = (List) this.f77425OooOo0o;
                    NoteFilterBottomSheetDialog noteFilterBottomSheetDialog = this.f77424OooOo.f77361Ooooo0o;
                    if (noteFilterBottomSheetDialog != null) {
                        noteFilterBottomSheetDialog.OooOoO(list);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(NoteListContainerFragment noteListContainerFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f77422OooOo = noteListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f77422OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77423OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteListContainerFragment noteListContainerFragment = this.f77422OooOo;
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
                    OooO00o oooO00o = new OooO00o(noteListContainerFragment, null);
                    this.f77423OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(oooO0OOOooOoo.f77155Oooo0o, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0oO$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$11$5", m80623f = "NoteListContainerFragment.kt", m80624l = {783}, m80625m = "invokeSuspend")
        public static final class C23648OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f77426OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77427OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0oO$OooO0o0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteListContainerFragment f77428OooOo0o;

                public OooO00o(NoteListContainerFragment noteListContainerFragment) {
                    this.f77428OooOo0o = noteListContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    NoteListContainerFragment noteListContainerFragment = this.f77428OooOo0o;
                    if (!zBooleanValue) {
                        TipsDialogFragment tipsDialogFragment = noteListContainerFragment.f77375o00ooo;
                        if (tipsDialogFragment == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noteDuplicatedTipsDialog");
                            throw null;
                        }
                        tipsDialogFragment.dismiss();
                    } else if (noteListContainerFragment.getChildFragmentManager().OooOooo("TipsDialogFragment- duplicate note") == null) {
                        TipsDialogFragment tipsDialogFragment2 = noteListContainerFragment.f77375o00ooo;
                        if (tipsDialogFragment2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noteDuplicatedTipsDialog");
                            throw null;
                        }
                        tipsDialogFragment2.show(noteListContainerFragment.getChildFragmentManager(), "TipsDialogFragment- duplicate note");
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23648OooO0o0(NoteListContainerFragment noteListContainerFragment, Continuation<? super C23648OooO0o0> continuation) {
                super(2, continuation);
                this.f77426OooOo = noteListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23648OooO0o0(this.f77426OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23648OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77427OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                NoteListContainerFragment noteListContainerFragment = this.f77426OooOo;
                C33772OooooOo c33772OooooOo = noteListContainerFragment.OooOoo().f77144OooOoo;
                OooO00o oooO00o = new OooO00o(noteListContainerFragment);
                this.f77427OooOo0o = 1;
                c33772OooooOo.getClass();
                C33772OooooOo.OooOO0O(c33772OooooOo, oooO00o, this);
                return enumC32485OooO00o;
            }
        }

        public C23646OooO0oO(Continuation<? super C23646OooO0oO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C23646OooO0oO c23646OooO0oO = NoteListContainerFragment.this.new C23646OooO0oO(continuation);
            c23646OooO0oO.f77408OooOo0o = obj;
            return c23646OooO0oO;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23646OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f77408OooOo0o;
            NoteListContainerFragment noteListContainerFragment = NoteListContainerFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(noteListContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(noteListContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(noteListContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23647OooO0Oo(noteListContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23648OooO0o0(noteListContainerFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(noteListContainerFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$12", m80623f = "NoteListContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23649OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f77430OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0oo$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$12$1", m80623f = "NoteListContainerFragment.kt", m80624l = {804}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f77431OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f77432OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooO0oo$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19408OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ NoteListContainerFragment f77433OooOo0o;

                public C19408OooO00o(NoteListContainerFragment noteListContainerFragment) {
                    this.f77433OooOo0o = noteListContainerFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    o00Oo0 o00oo02 = (o00Oo0) obj;
                    NoteListContainerFragment noteListContainerFragment = this.f77433OooOo0o;
                    if (o00oo02 == null) {
                        TextView textView = noteListContainerFragment.f77371o00Oo0;
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                    } else {
                        TextView textView2 = noteListContainerFragment.f77371o00Oo0;
                        int i = o00oo02.f110971OooO0o0;
                        if (textView2 != null) {
                            textView2.setText(String.valueOf(i));
                        }
                        TextView textView3 = noteListContainerFragment.f77371o00Oo0;
                        if (textView3 != null) {
                            textView3.setVisibility(i > 0 ? 0 : 8);
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteListContainerFragment noteListContainerFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77431OooOo = noteListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f77431OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f77432OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    NoteListContainerFragment noteListContainerFragment = this.f77431OooOo;
                    C26320o0000OoO c26320o0000OoOOooOooO = noteListContainerFragment.OooOooO();
                    C19408OooO00o c19408OooO00o = new C19408OooO00o(noteListContainerFragment);
                    this.f77432OooOo0o = 1;
                    if (c26320o0000OoOOooOooO.f90243OoooO.f121747OooOo0o.collect(c19408OooO00o, this) == enumC32485OooO00o) {
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

        public C23649OooO0oo(Continuation<? super C23649OooO0oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C23649OooO0oo c23649OooO0oo = NoteListContainerFragment.this.new C23649OooO0oo(continuation);
            c23649OooO0oo.f77430OooOo0o = obj;
            return c23649OooO0oo;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23649OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C33609OooO0oo.OooO0OO((InterfaceC33636Oooo00o) this.f77430OooOo0o, null, null, new OooO00o(NoteListContainerFragment.this, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$15", m80623f = "NoteListContainerFragment.kt", m80624l = {845}, m80625m = "invokeSuspend")
    public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77435OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$15$1", m80623f = "NoteListContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NoteListContainerFragment f77436OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f77437OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteListContainerFragment noteListContainerFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f77436OooOo = noteListContainerFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f77436OooOo, continuation);
                oooO00o.f77437OooOo0o = obj;
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
                Boolean bool = (Boolean) this.f77437OooOo0o;
                View view = this.f77436OooOo.f77378ooOO;
                if (view != null) {
                    view.setActivated(kotlin.jvm.internal.OooOOO0.OooO0O0(bool, Boolean.TRUE));
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnListLayout");
                throw null;
            }
        }

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteListContainerFragment.this.new OooOO0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77435OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                NoteListContainerFragment noteListContainerFragment = NoteListContainerFragment.this;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
                OooO00o oooO00o = new OooO00o(noteListContainerFragment, null);
                this.f77435OooOo0o = 1;
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

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$16", m80623f = "NoteListContainerFragment.kt", m80624l = {856, 857}, m80625m = "invokeSuspend")
    public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77439OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Uri f77440OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Uri uri, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f77440OooOoO0 = uri;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteListContainerFragment.this.new OooOO0O(this.f77440OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            if (r9 == r0) goto L15;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            OooOO0O oooOO0O;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77439OooOo0o;
            NoteListContainerFragment noteListContainerFragment = NoteListContainerFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f77439OooOo0o = 1;
                if (C33644OoooO0.OooO00o(1000L, this) == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                oooOO0O = this;
                if (!((Boolean) obj).booleanValue()) {
                    noteListContainerFragment.OooOoo().OooOOOo(com.facebook.soloader.OooOo.OooO0oO(oooOO0O.f77440OooOoO0));
                }
                noteListContainerFragment.f77335OooOoo = null;
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            this.f77439OooOo0o = 2;
            oooOO0O = this;
            obj = NoteListContainerFragment.Oooo00o(noteListContainerFragment, 37, 0, null, oooOO0O, 6);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooOO0o, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$1", m80623f = "NoteListContainerFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C23650OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        public C23650OooOO0o(Continuation<? super C23650OooOO0o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteListContainerFragment.this.new C23650OooOO0o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23650OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = NoteListContainerFragment.this.OooOoo();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C30062OoooO(oooO0OOOooOoo, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$5$1", m80623f = "NoteListContainerFragment.kt", m80624l = {661}, m80625m = "invokeSuspend")
    public static final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f77442OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public SortKeyVO f77443OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ NoteListContainerFragment f77444OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ View f77445OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(View view, NoteListContainerFragment noteListContainerFragment, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f77445OooOoO0 = view;
            this.f77444OooOoO = noteListContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooOOO(this.f77445OooOoO0, this.f77444OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            SortKeyVO sortKeyVO;
            SortKeyVO sortKeyVO2;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77442OooOo;
            NoteListContainerFragment noteListContainerFragment = this.f77444OooOoO;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Object tag = this.f77445OooOoO0.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.SortKeyVO");
                sortKeyVO = (SortKeyVO) tag;
                if (sortKeyVO.getKey() == com.orion.notein.p607ui.p609vo.OooO00o.f80092Oooo0) {
                    this.f77443OooOo0o = sortKeyVO;
                    this.f77442OooOo = 1;
                    Object objOooo00o = NoteListContainerFragment.Oooo00o(noteListContainerFragment, 8, 0, null, this, 6);
                    if (objOooo00o == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    sortKeyVO2 = sortKeyVO;
                    obj = objOooo00o;
                }
                noteListContainerFragment.OooOoo().OooOooo(sortKeyVO.getKey());
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sortKeyVO2 = this.f77443OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            sortKeyVO = sortKeyVO2;
            noteListContainerFragment.OooOoo().OooOooo(sortKeyVO.getKey());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$onViewCreated$2", m80623f = "NoteListContainerFragment.kt", m80624l = {627}, m80625m = "invokeSuspend")
    public static final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77447OooOo0o;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteListContainerFragment.this.new OooOOO0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77447OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f77447OooOo0o = 1;
                if (NoteListContainerFragment.OooOoOO(NoteListContainerFragment.this, this) == enumC32485OooO00o) {
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

    public static final class OooOOOO {
        public OooOOOO() {
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooOOOo, reason: case insensitive filesystem */
    public static final class C23651OooOOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23651OooOOOo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return NoteListContainerFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooOOo, reason: case insensitive filesystem */
    public static final class C23652OooOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23652OooOOo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return NoteListContainerFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooOOo0, reason: case insensitive filesystem */
    public static final class C23653OooOOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23653OooOOo0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return NoteListContainerFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooOOoo, reason: case insensitive filesystem */
    public static final class C23654OooOOoo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23654OooOOoo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return NoteListContainerFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooOo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return NoteListContainerFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooOo0, reason: case insensitive filesystem */
    public static final class C23655OooOo0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23655OooOo0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return NoteListContainerFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooOo00 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooOo00() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return NoteListContainerFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooOo0O, reason: case insensitive filesystem */
    public static final class C23656OooOo0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23656OooOo0O() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return NoteListContainerFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooOo0o, reason: case insensitive filesystem */
    public static final class C23657OooOo0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23657OooOo0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return NoteListContainerFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.notelist.documents.NoteListContainerFragment$OooOoO0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.documents.NoteListContainerFragment$whenFileBePassedToNotein$1", m80623f = "NoteListContainerFragment.kt", m80624l = {454}, m80625m = "invokeSuspend")
    public static final class C23658OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f77459OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Uri f77460OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23658OooOoO0(Uri uri, Continuation<? super C23658OooOoO0> continuation) {
            super(2, continuation);
            this.f77460OooOoO0 = uri;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return NoteListContainerFragment.this.new C23658OooOoO0(this.f77460OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23658OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            C23658OooOoO0 c23658OooOoO0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f77459OooOo0o;
            Uri uri = this.f77460OooOoO0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f77459OooOo0o = 1;
                c23658OooOoO0 = this;
                obj = NoteListContainerFragment.Oooo00o(NoteListContainerFragment.this, 37, 0, uri, c23658OooOoO0, 2);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                c23658OooOoO0 = this;
            }
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            NoteListContainerFragment noteListContainerFragment = NoteListContainerFragment.this;
            int iCheckSelfPermission = ContextCompat.checkSelfPermission(noteListContainerFragment.requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE");
            Context contextRequireContext = noteListContainerFragment.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            if ((contextRequireContext.getApplicationInfo().targetSdkVersion >= 30) || iCheckSelfPermission == 0) {
                noteListContainerFragment.OooOoo().OooOOO(uri);
            } else {
                OooO0O0 oooO0O0 = noteListContainerFragment.f77377oo000o;
                oooO0O0.getClass();
                oooO0O0.f77389OooO00o = uri;
                oooO0O0.f77390OooO0O0.OooO00o("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public NoteListContainerFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f77337OooOooO = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.notelist.OooO0OO.class), new C23651OooOOOo(), new C23652OooOOo(), new C23653OooOOo0());
        this.f77338OooOooo = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new C23654OooOOoo(), new C23655OooOo0(), new OooOo00());
        this.f77341Oooo000 = new C22026ooOO(oooo0.OooO0O0(C28201OooooO0.class), new C23656OooOo0O(), new OooOo(), new C23657OooOo0o());
        this.f77377oo000o = new OooO0O0(this);
        kotlin.jvm.internal.OooOOO0.OooO0o(registerForActivityResult(new C20438OooO0oO(), new com.google.firebase.remoteconfig.OooOO0O(this)), "registerForActivityResult(...)");
        kotlin.jvm.internal.OooOOO0.OooO0o(registerForActivityResult(new C20438OooO0oO(), new OooO0o.OooO00o() { // from class: o0o00oo.OooO0O0
            @Override // OooO0o.OooO00o
            public final void OooO0O0(Object obj) {
                ((Boolean) obj).getClass();
                C26320o0000OoO c26320o0000OoOOooOooO = this.f107161OooOo0o.OooOooO();
                Boolean bool = Boolean.TRUE;
                C33781o00o0O c33781o00o0O = c26320o0000OoOOooOooO.f90250OoooOo0;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, bool);
            }
        }), "registerForActivityResult(...)");
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20439OooO0oo(), new com.google.firebase.firestore.OooO0OO(this));
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f77374o00oO0o = oooO0O0RegisterForActivityResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoOO(NoteListContainerFragment noteListContainerFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C30104OooOO0o c30104OooOO0o;
        NoteListContainerFragment noteListContainerFragment2;
        Context context;
        boolean z;
        NoteListContainerFragment noteListContainerFragment3;
        if (abstractC32479OooO0OO instanceof C30104OooOO0o) {
            c30104OooOO0o = (C30104OooOO0o) abstractC32479OooO0OO;
            int i = c30104OooOO0o.f107185OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30104OooOO0o.f107185OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c30104OooOO0o = new C30104OooOO0o(noteListContainerFragment, abstractC32479OooO0OO);
            }
        }
        Object obj = c30104OooOO0o.f107182OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30104OooOO0o.f107185OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Context context2 = noteListContainerFragment.getContext();
            if (context2 == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C33163OooO0oO c33163OooO0oO = (C33163OooO0oO) context2;
            C30106OooOOO0 c30106OooOOO0 = new C30106OooOOO0(c33163OooO0oO, null);
            c30104OooOO0o.f107181OooOo0o = noteListContainerFragment;
            c30104OooOO0o.f107180OooOo = c33163OooO0oO;
            c30104OooOO0o.f107185OooOoo0 = 1;
            Object objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c30106OooOOO0, c30104OooOO0o);
            if (objOooO0o != enumC32485OooO00o) {
                noteListContainerFragment2 = noteListContainerFragment;
                context = context2;
                obj = objOooO0o;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c30104OooOO0o.f107183OooOoO0;
            noteListContainerFragment3 = c30104OooOO0o.f107181OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            Boolean bool = (Boolean) ((AbstractC24338OooO0o0) obj).OooO0OO(C27205OooO0OO.f95018OooOOo0);
            boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
            if (z && zBooleanValue) {
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteListContainerFragment3), new C24564OooO00o(R.id.action_noteListContainerFragment_to_wizardFragment));
                return C32460OooOooO.f116667OooO00o;
            }
            if (z) {
                C28026OooO0OO.OooO0OO(C21030OooOO0o.OooO0OO(noteListContainerFragment3), new C24564OooO00o(R.id.f57961x900e02bb), new C24587OooOoo(false, false, R.id.noteListContainerFragment, false, false, -1, -1, -1, -1));
                return C32460OooOooO.f116667OooO00o;
            }
            ActivityC21897OooOo0 activity = noteListContainerFragment3.getActivity();
            if (activity != null) {
                Intent intent = activity.getIntent();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(intent != null ? intent.getAction() : null, "android.intent.action.MAIN") && !activity.isChangingConfigurations()) {
                    C33609OooO0oo.OooO0OO(OooO0O0.OooO0o.OooO00o(noteListContainerFragment3, "getViewLifecycleOwner(...)"), null, null, new C30103OooOO0O(noteListContainerFragment3, null), 3);
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        context = c30104OooOO0o.f107180OooOo;
        noteListContainerFragment2 = c30104OooOO0o.f107181OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O02 = ExecutorC33873OooO0O0.f122045OooOoO0;
        C30105OooOOO c30105OooOOO = new C30105OooOOO(context, null);
        c30104OooOO0o.f107181OooOo0o = noteListContainerFragment2;
        c30104OooOO0o.f107180OooOo = null;
        c30104OooOO0o.f107183OooOoO0 = zBooleanValue2;
        c30104OooOO0o.f107185OooOoo0 = 2;
        Object objOooO0o2 = C33609OooO0oo.OooO0o(executorC33873OooO0O02, c30105OooOOO, c30104OooOO0o);
        if (objOooO0o2 != enumC32485OooO00o) {
            obj = objOooO0o2;
            z = zBooleanValue2;
            noteListContainerFragment3 = noteListContainerFragment2;
            Boolean bool2 = (Boolean) ((AbstractC24338OooO0o0) obj).OooO0OO(C27205OooO0OO.f95018OooOOo0);
            if (bool2 != null) {
            }
            if (z) {
            }
            if (z) {
            }
        }
        return enumC32485OooO00o;
    }

    public static /* synthetic */ Object Oooo00o(NoteListContainerFragment noteListContainerFragment, int i, int i2, Uri uri, AbstractC32476OooO abstractC32476OooO, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            uri = null;
        }
        return noteListContainerFragment.Oooo00O(i, i2, uri, abstractC32476OooO);
    }

    public final com.orion.notein.p607ui.notelist.OooO0OO OooOoo() {
        return (com.orion.notein.p607ui.notelist.OooO0OO) this.f77337OooOooO.getValue();
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

    public final C26320o0000OoO OooOooO() {
        return (C26320o0000OoO) this.f77338OooOooo.getValue();
    }

    public final void OooOooo(String noteId, String parentId, String pageId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(parentId, "parentId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
        C26342o000Oo0O.f90392OooO00o.getClass();
        C26342o000Oo0O.OooO0oo("navigate2NoteContainerFragment, noteId:" + noteId + ", parentId:" + parentId);
        try {
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this), C23968Oooo00o.OooO0o0(20, noteId, parentId, pageId));
        } catch (Exception e) {
            C34406OooO00o.f123390OooO00o.OooO0Oo(e, "navigate2NoteContainerFragment error", new Object[0]);
            C26342o000Oo0O c26342o000Oo0O = C26342o000Oo0O.f90392OooO00o;
            String strConcat = "navigate2NoteContainerFragment err: ".concat(C32435OooO0Oo.OooO0O0(e));
            c26342o000Oo0O.getClass();
            C26342o000Oo0O.OooO0oO(strConcat);
        }
    }

    public final void Oooo0(Uri uri) {
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(OooOooO().f90231OooOooo.getValue(), Boolean.TRUE)) {
            C33609OooO0oo.OooO0OO(OooO0O0.OooO0o.OooO00o(this, "getViewLifecycleOwner(...)"), null, null, new C23658OooOoO0(uri, null), 3);
        }
    }

    public final void Oooo000() {
        C30214OooOoOO c30214OooOoOO = this.f77359OoooOoo;
        if (c30214OooOoOO != null) {
            c30214OooOoOO.f107606OooO0OO.OooO0OO(0, false);
        } else {
            OooOoo().OooOoo(Integer.valueOf(C30214OooOoOO.f107601OooO0o.getIndex()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo00O(int i, int i2, Uri uri, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C30126Oooo00O c30126Oooo00O;
        boolean zBooleanValue;
        if (abstractC32479OooO0OO instanceof C30126Oooo00O) {
            c30126Oooo00O = (C30126Oooo00O) abstractC32479OooO0OO;
            int i3 = c30126Oooo00O.f107263OooOoO0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c30126Oooo00O.f107263OooOoO0 = i3 - Integer.MIN_VALUE;
            } else {
                c30126Oooo00O = new C30126Oooo00O(this, abstractC32479OooO0OO);
            }
        }
        Object objShowNonVipFeatureLimitedDialog = c30126Oooo00O.f107262OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c30126Oooo00O.f107263OooOoO0;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog);
            ActivityC21897OooOo0 activity = getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30126Oooo00O.f107263OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog = mainActivity.showNonVipFeatureLimitedDialog(i, i2, uri, c30126Oooo00O);
            if (objShowNonVipFeatureLimitedDialog == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog);
        }
        zBooleanValue = ((Boolean) objShowNonVipFeatureLimitedDialog).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i = newConfig.screenWidthDp;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteListContainerFragment");
        int i2 = newConfig.smallestScreenWidthDp;
        int i3 = this.f77336OooOoo0;
        StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("onConfigurationChanged: screenWidthDp=", i, ", smallestScreenWidthDp=", ", lastScreenWidthDp=", i2);
        sbOooO0O0.append(i3);
        c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
        int i4 = this.f77336OooOoo0;
        if (i4 != 0) {
            boolean z = i4 >= 480;
            boolean z2 = i >= 480;
            if (z != z2) {
                c20358OooO00o.OooOOO0("NoteListContainerFragment");
                c20358OooO00o.OooO00o("Screen width crossed threshold (480 dp), recreating activity. wasLargeScreen=" + z + ", isLargeScreen=" + z2, new Object[0]);
                ActivityC21897OooOo0 activity = getActivity();
                if (activity != null) {
                    activity.recreate();
                    return;
                }
                return;
            }
        }
        this.f77336OooOoo0 = i;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerForActivityResult(new C20440OooOO0(), new C22592OooOo0o(this));
        C21904OooOoo0.OooO0oO(this, "import_batch_pdf", new C30100OooO0oO(this, 0));
        this.f77372o00Ooo = new C23645OooO0o0();
        C20418OooOoo onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        C23645OooO0o0 c23645OooO0o0 = this.f77372o00Ooo;
        if (c23645OooO0o0 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("mBackPressedCallback");
            throw null;
        }
        onBackPressedDispatcher.OooO00o(this, c23645OooO0o0);
        registerForActivityResult(new C20439OooO0oo(), new com.google.android.datatransport.runtime.scheduling.jobscheduling.OooOOOO(this, 3));
        C21904OooOoo0.OooO0oO(this, "key_firebase_login", new InterfaceC32508OooOOOo() { // from class: o0o00oo.OooO0oo
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                kotlin.jvm.internal.OooOOO0.OooO0oO((String) obj, "<unused var>");
                kotlin.jvm.internal.OooOOO0.OooO0oO((Bundle) obj2, "<unused var>");
                NoteListContainerFragment noteListContainerFragment = this.f107173OooOo0o;
                C33609OooO0oo.OooO0OO(OooO0O0.OooO0o.OooO00o(noteListContainerFragment, "getViewLifecycleOwner(...)"), null, null, noteListContainerFragment.new OooO0o(null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        Configuration configuration = getResources().getConfiguration();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteListContainerFragment");
        c20358OooO00o.OooO00o(C20855OooooOO.OooO0OO(configuration.screenWidthDp, configuration.smallestScreenWidthDp, "onCreateView: screenWidthDp=", ", smallestScreenWidthDp="), new Object[0]);
        this.f77336OooOoo0 = configuration.screenWidthDp;
        return inflater.inflate(R.layout.fragment_note_list_container, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C30207OooOo c30207OooOo = this.f77362OooooO0;
        if (c30207OooOo != null) {
            c30207OooOo.OooO0O0();
        }
        ViewGroup viewGroup = this.f77370o00O0O;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
        }
        this.f77370o00O0O = null;
        this.f77371o00Oo0 = null;
        C30294OooO0OO c30294OooO0OO = this.f77364OooooOo;
        if (c30294OooO0OO == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("sortPopupWindow");
            throw null;
        }
        c30294OooO0OO.OooO00o();
        C30033OooO0o c30033OooO0o = this.f77376o0OoOo0;
        if (c30033OooO0o == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("labelFilterPopupWindow");
            throw null;
        }
        c30033OooO0o.OooO00o();
        Oooo0O0.OooOO0.OooO00o(this);
        super.onDestroyView();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0046  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResume() {
        String action;
        ClipData clipData;
        ClipData.Item itemAt;
        Uri uri;
        super.onResume();
        requireActivity().getSupportFragmentManager().Oooooo0("move_notes_and_folders", this, new C22328OooOO0o(this));
        Intent intent = requireActivity().getIntent();
        boolean booleanExtra = intent.getBooleanExtra("used_intent", false);
        Log.d("NoteListContainerFragment", "intent action:" + intent.getAction() + ", is used: " + booleanExtra);
        if (!booleanExtra && (action = intent.getAction()) != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1173264947) {
                uri = (iHashCode == -1173171990 && action.equals(CommonConstant.ACTION.HWID_SCHEME_URL)) ? intent.getData() : null;
            } else if (action.equals("android.intent.action.SEND") && (clipData = intent.getClipData()) != null && (itemAt = clipData.getItemAt(0)) != null) {
                uri = itemAt.getUri();
            }
        }
        if (uri != null) {
            requireActivity().getIntent().putExtra("used_intent", true);
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(uri.getScheme(), "app") || !kotlin.jvm.internal.OooOOO0.OooO0O0(uri.getHost(), "notein")) {
                Oooo0(uri);
            }
        }
        C21904OooOoo0.OooO0oO(this, "LoginTipsDialogFragment", new InterfaceC32508OooOOOo() { // from class: o0o00oo.OooO0o0
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                Bundle bundle = (Bundle) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO((String) obj, "<unused var>");
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                if (bundle.getBoolean("login_successfully")) {
                    Object obj3 = bundle.get("imported_uri");
                    Uri uri2 = obj3 instanceof Uri ? (Uri) obj3 : null;
                    if (uri2 != null) {
                        this.f107170OooOo0o.Oooo0(uri2);
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = requireActivity();
        kotlin.jvm.internal.OooOOO0.OooO0o0(activityC21897OooOo0RequireActivity, "null cannot be cast to non-null type com.orion.notein.MainActivity");
        MainActivity mainActivity = (MainActivity) activityC21897OooOo0RequireActivity;
        mainActivity.setDrawerEnable(true);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30125Oooo000(this, null), 2);
        mainActivity.showRemediationDialogIfNeeded();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(outState, "outState");
        super.onSaveInstanceState(outState);
        Uri uri = this.f77335OooOoo;
        C30207OooOo c30207OooOo = this.f77362OooooO0;
        if (uri == null && c30207OooOo != null) {
            uri = c30207OooOo.f107584OooO0O0.f107504OooO0o0;
        }
        if (uri != null) {
            outState.putParcelable("camera_output_uri_for_create_note", uri);
        }
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        Bundle arguments;
        Fragment fragmentOooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.f77342Oooo00O = C22285Oooo0o0.OooO00o(view.getContext().getSystemService(C22283Oooo0OO.OooO0O0()));
        }
        C33609OooO0oo.OooO0OO(OooO0O0.OooO0o.OooO00o(this, "getViewLifecycleOwner(...)"), null, null, new C23650OooOO0o(null), 3);
        C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new OooOOO0(null));
        String string = getString(R.string.note_copy_into);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        String string2 = getString(R.string.note_copying_and_waiting);
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
        this.f77375o00ooo = new TipsDialogFragment(string, string2, new ViewOnClickListenerC28535OooOo0(this, 3), null);
        OooOoo().Oooo00O("desktop");
        Bundle arguments2 = getArguments();
        Object obj = arguments2 != null ? arguments2.get("initial_folder") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str != null && ((C32443OooOOO) OooOoo().f77161OoooO00.getValue()).f116638OooOo0o == 0) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                arguments3.remove("initial_folder");
            }
            C33609OooO0oo.OooO0OO(OooO0O0.OooO0o.OooO00o(this, "getViewLifecycleOwner(...)"), null, null, new C30121OooOoo(this, str, null), 3);
        }
        view.setOnDragListener(new OooO00o());
        this.f77366Oooooo0 = view.findViewById(R.id.label_color_filter_section);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setPadding(0, 0, 0, 0);
        toolbar.setContentInsetsAbsolute(0, 0);
        this.f77340Oooo0 = toolbar;
        this.f77343Oooo00o = toolbar.findViewById(R.id.normal);
        View viewFindViewById = view.findViewById(R.id.btn_menu);
        this.f77344Oooo0O0 = viewFindViewById;
        if (viewFindViewById == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnMenu");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC29697OooO00o(this, 1));
        this.f77349Oooo0oo = (TextView) view.findViewById(R.id.current_folder_name);
        this.f77352OoooO00 = (TextView) view.findViewById(R.id.parent_folder_name);
        View viewFindViewById2 = view.findViewById(R.id.btn_back_to_parent);
        this.f77339Oooo = viewFindViewById2;
        if (viewFindViewById2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnBackToParent");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new o0OoO000.OooO0OO(this, 2));
        View viewFindViewById3 = view.findViewById(R.id.btn_select);
        this.f77345Oooo0OO = viewFindViewById3;
        if (viewFindViewById3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("select");
            throw null;
        }
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC30097OooO0Oo(this, 0));
        Toolbar toolbar2 = this.f77340Oooo0;
        if (toolbar2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolbar");
            throw null;
        }
        this.f77351OoooO0 = toolbar2.findViewById(R.id.select);
        Toolbar toolbar3 = this.f77340Oooo0;
        if (toolbar3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolbar");
            throw null;
        }
        TextView textView = (TextView) toolbar3.findViewById(R.id.select_all);
        this.f77350OoooO = textView;
        if (textView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("selectAll");
            throw null;
        }
        textView.setOnClickListener(new ViewOnClickListenerC28526OooO0o0(this, 3));
        View view2 = this.f77351OoooO0;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("atbSelect");
            throw null;
        }
        View viewFindViewById4 = view2.findViewById(R.id.select_finish);
        this.f77353OoooO0O = viewFindViewById4;
        if (viewFindViewById4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("selectFinish");
            throw null;
        }
        viewFindViewById4.setOnClickListener(new o0OoO000.OooO0o(this, 3));
        View viewFindViewById5 = view.findViewById(R.id.select_action);
        this.f77354OoooOO0 = viewFindViewById5;
        if (viewFindViewById5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("selectActions");
            throw null;
        }
        this.f77369o000oOoO = (ImageView) viewFindViewById5.findViewById(R.id.btn_export);
        View view3 = this.f77354OoooOO0;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("selectActions");
            throw null;
        }
        this.f77355OoooOOO = (ImageView) view3.findViewById(R.id.btn_copy);
        View view4 = this.f77354OoooOO0;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("selectActions");
            throw null;
        }
        this.f77356OoooOOo = (ImageView) view4.findViewById(R.id.btn_move);
        View view5 = this.f77354OoooOO0;
        if (view5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("selectActions");
            throw null;
        }
        this.f77357OoooOo0 = (ImageView) view5.findViewById(R.id.btn_delete);
        View view6 = this.f77354OoooOO0;
        if (view6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("selectActions");
            throw null;
        }
        this.f77358OoooOoO = (ImageView) view6.findViewById(R.id.btn_label);
        ImageView imageView = this.f77369o000oOoO;
        if (imageView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnExport");
            throw null;
        }
        imageView.setOnClickListener(new oo000o(this, 4));
        ImageView imageView2 = this.f77355OoooOOO;
        if (imageView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnCopy");
            throw null;
        }
        imageView2.setOnClickListener(new o0OOO0o(this, 4));
        ImageView imageView3 = this.f77356OoooOOo;
        if (imageView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnMove");
            throw null;
        }
        imageView3.setOnClickListener(new o0Oo0oo(this, 3));
        ImageView imageView4 = this.f77357OoooOo0;
        if (imageView4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnDelete");
            throw null;
        }
        imageView4.setOnClickListener(new o0OO00O(this, 5));
        ImageView imageView5 = this.f77358OoooOoO;
        if (imageView5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnLabel");
            throw null;
        }
        imageView5.setOnClickListener(new oo0o0Oo(this, 2));
        View viewFindViewById6 = view.findViewById(R.id.btn_search);
        this.f77347Oooo0o0 = viewFindViewById6;
        if (viewFindViewById6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO(FirebaseAnalytics.Event.SEARCH);
            throw null;
        }
        viewFindViewById6.setOnClickListener(new ViewOnClickListenerC28523OooO00o(this, 2));
        View viewFindViewById7 = view.findViewById(R.id.btn_creative_library);
        this.f77346Oooo0o = viewFindViewById7;
        if (viewFindViewById7 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("creativeLibraryEntry");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById7, 500L, new ViewOnClickListenerC26311Ooooooo());
        View viewFindViewById8 = view.findViewById(R.id.btn_settings);
        this.f77348Oooo0oO = viewFindViewById8;
        if (viewFindViewById8 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("settings");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById8, 1000L, new ViewOnClickListenerC30096OooO0OO(this, 0));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30110OooOOo0(this, null), 3);
        C30113OooOo c30113OooOo = new C30113OooOo(this, OooOoo());
        c30113OooOo.OooOOOo();
        c30113OooOo.OooOOOO();
        C30207OooOo c30207OooOo = new C30207OooOo(this, c30113OooOo);
        this.f77362OooooO0 = c30207OooOo;
        c30207OooOo.OooO00o(view, OooOooO(), OooOoo());
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30117OooOo0o(this, null), 3);
        if (((TabLayout) view.findViewById(R.id.tablayout)) != null) {
            this.f77359OoooOoo = new C30214OooOoOO(this, view, ((Number) OooOoo().f77141OooOoO.getValue()).intValue(), new C30118OooOoO(this));
            OooOoo().OooOoo(null);
        }
        ImageView imageView6 = (ImageView) view.findViewById(R.id.iv_more_note_tab);
        if (imageView6 != null) {
            imageView6.setOnClickListener(new o0O0O00(this, 5));
            TextView textView2 = (TextView) view.findViewById(R.id.tv_note_filter);
            if (textView2 != null) {
                this.f77360Ooooo00 = textView2;
                NoteListFragment noteListFragment = new NoteListFragment();
                FragmentManager childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(childFragmentManager);
                oooO00o.OooO0o0(noteListFragment, R.id.fragment_container);
                oooO00o.OooO0oo();
                OooOoo().OooOoo((Integer) OooOoo().f77141OooOoO.getValue());
                InterfaceC21987OooOoo viewLifecycleOwner3 = getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new C30119OooOoO0(this, null), 3);
            }
        }
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        if (o0oo000O.OooOO0O.OooO00o(contextRequireContext) && (fragmentOooOooO = getChildFragmentManager().OooOooO(R.id.fragment_container)) != null) {
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            childFragmentManager2.getClass();
            androidx.fragment.app.OooO00o oooO00o2 = new androidx.fragment.app.OooO00o(childFragmentManager2);
            oooO00o2.OooOOO0(fragmentOooOooO);
            oooO00o2.OooOO0O();
        }
        View viewFindViewById9 = view.findViewById(R.id.sort);
        this.f77363OooooOO = viewFindViewById9;
        if (viewFindViewById9 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnSort");
            throw null;
        }
        viewFindViewById9.setOnClickListener(new ViewOnClickListenerC26055Ooooo00(this, 4));
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
        this.f77364OooooOo = new C30294OooO0OO(contextRequireContext2, new ViewOnClickListenerC26056Ooooo0o(this, 3));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.message_wrapper);
        this.f77370o00O0O = viewGroup;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new ViewOnClickListenerC26057OooooO0(this, 5));
        }
        this.f77371o00Oo0 = (TextView) view.findViewById(R.id.tv_unread_message_count);
        View viewFindViewById10 = view.findViewById(R.id.color);
        this.f77367OoooooO = viewFindViewById10;
        if (viewFindViewById10 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("labelFilterColor");
            throw null;
        }
        viewFindViewById10.setOnClickListener(new ViewOnClickListenerC26058OooooOO(this, 4));
        this.f77368Ooooooo = view.findViewById(R.id.border);
        ImageView imageView7 = (ImageView) view.findViewById(R.id.btn_label_filter);
        this.f77365Oooooo = imageView7;
        if (imageView7 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("labelFilter");
            throw null;
        }
        imageView7.setOnClickListener(new ViewOnClickListenerC26059OooooOo(this, 3));
        Context contextRequireContext3 = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext3, "requireContext(...)");
        this.f77376o0OoOo0 = new C30033OooO0o(contextRequireContext3, new OooOOOO());
        if (i >= 34 && (arguments = getArguments()) != null && arguments.getBoolean("create_blank_note", false)) {
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                arguments4.remove("create_blank_note");
            }
            C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(this), R.id.noteEditorContainerFragment, BundleKt.bundleOf(new C32443OooOOO(NoteMeta.PROPERTY_NOTE_ID, (String) C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new C30122OooOoo0(this, null)))));
        }
        this.f77371o00Oo0 = (TextView) view.findViewById(R.id.tv_unread_message_count);
        ((ImageView) view.findViewById(R.id.iv_message)).setOnClickListener(new ViewOnClickListenerC28251OooOooo(this, 4));
        ImageView imageView8 = (ImageView) view.findViewById(R.id.iv_data_sync);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(imageView8);
        C28050OooO0OO.OooO00o(imageView8, 500L, new o000OOo(this, 3));
        C33609OooO0oo.OooO0OO(OooO0O0.OooO0o.OooO00o(this, "getViewLifecycleOwner(...)"), null, null, new C30116OooOo0O(this, imageView8, AnimationUtils.loadAnimation(requireContext(), R.anim.rotate_loop), null), 3);
        C33609OooO0oo.OooO0OO(OooO0O0.OooO0o.OooO00o(this, "getViewLifecycleOwner(...)"), null, null, new C23646OooO0oO(null), 3);
        OooO0O0.OooO0o.OooO00o(this, "getViewLifecycleOwner(...)").OooO0O0(new C23649OooO0oo(null));
        InterfaceC21987OooOoo viewLifecycleOwner4 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner4), null, null, new OooO(null), 3);
        View viewFindViewById11 = view.findViewById(R.id.btn_list_layout);
        this.f77378ooOO = viewFindViewById11;
        if (viewFindViewById11 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnListLayout");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById11, 500L, new Oooo000(this, 4));
        InterfaceC21987OooOoo viewLifecycleOwner5 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner5), null, null, new OooOO0(null), 3);
        if (bundle == null || !bundle.containsKey("camera_output_uri_for_create_note")) {
            return;
        }
        Uri uri = (Uri) bundle.getParcelable("camera_output_uri_for_create_note");
        this.f77335OooOoo = uri;
        if (uri != null) {
            C33609OooO0oo.OooO0OO(OooO0O0.OooO0o.OooO00o(this, "getViewLifecycleOwner(...)"), null, null, new OooOO0O(uri, null), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        Log.d("NoteListContainerFragment", "onViewStateRestored");
    }
}
