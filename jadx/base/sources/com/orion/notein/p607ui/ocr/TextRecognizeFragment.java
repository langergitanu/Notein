package com.orion.notein.p607ui.ocr;

import OooO0oO.C20433OooO0OO;
import OooO0oO.C20436OooO0o0;
import OooO0oO.C20439OooO0oo;
import OooO0oO.C20440OooOO0;
import OooOoOO.C20519OooO0Oo;
import Oooo0.C20860Ooooooo;
import Oooo0.o000000O;
import Oooo0oO.C21030OooOO0o;
import android.content.ClipData;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.text.Spannable;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.C21904OooOoo0;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.aspose.words.StyleIdentifier;
import com.facebook.soloader.OooOo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.inappmessaging.internal.C22734OooOOoo;
import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorList;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.ocr.view.AiOcrRichEditor;
import com.orion.notein.p607ui.widget.CustomConstraintLayout;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfPasswordException;
import com.shockwave.pdfium.PdfiumCore;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24564OooO00o;
import o000o0O0.C24568OooO0oO;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o00Ooo.C25086OooOo0O;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o00o00o.C25275OooO0O0;
import o0O0oo0O.ViewOnClickListenerC26210OooO00o;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oO.C28036OooO0O0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0OO0.C28065OooO0O0;
import o0Oo0OO0.C28069OooO0o0;
import o0Oo0OO0.C28071OooO0oo;
import o0Oo0Ooo.ViewOnClickListenerC28136OooO0O0;
import o0Oo0Ooo.ViewOnClickListenerC28137OooO0OO;
import o0Oo0oOo.ViewOnClickListenerC28369o00000oO;
import o0Oo0oOo.o00000O0;
import o0Oo0oOo.o000OOo;
import o0Oo0oOo.o0ooOOo;
import o0Oo0ooO.ViewOnClickListenerC28407OooO00o;
import o0Oo0ooO.ViewOnClickListenerC28408OooO0O0;
import o0Oo0ooO.ViewOnClickListenerC28412OooO0o0;
import o0Oo0ooO.ViewOnClickListenerC28413OooO0oO;
import o0OoO000.ViewOnClickListenerC28583o0000OoO;
import o0OoO000.ViewOnClickListenerC28585o0000o;
import o0OoO000.ViewOnClickListenerC28586o0000o0;
import o0OoO000.ViewOnClickListenerC28588o0000o0o;
import o0OoO000.ViewOnClickListenerC28591o0000oOO;
import o0OoO0OO.ViewOnClickListenerC28603OooO00o;
import o0OoO0OO.ViewOnClickListenerC28609OooO0oO;
import o0OoO0OO.ViewOnClickListenerC28610OooO0oo;
import o0OoO0oo.ViewOnClickListenerC28958o00oOo0o;
import o0OoOO00.ViewOnClickListenerC28989OooO00o;
import o0Ooo0oo.ViewOnClickListenerC29543o000O0o0;
import o0OooOoo.ViewOnClickListenerC29578OooO00o;
import o0o000oO.ViewOnClickListenerC29777OooO00o;
import o0o0O.C30174OooO00o;
import o0o0O.C30177OooO0oO;
import o0o0O0.ViewOnClickListenerC30181OooO0o0;
import o0o0OO0.C30386OooO0o0;
import o0o0OO0.C30390OooOO0O;
import o0o0OO0.C30392OooOOO;
import o0o0OO0.C30393OooOOO0;
import o0o0OO0.C30394OooOOOO;
import o0o0OoO0.C30676OooO0o;
import o0oOOoOO.C30847OooO0Oo;
import o0oOoOo.C31030OooO00o;
import o0oOoOo.C31088OoooooO;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OO.OooO;
import oO0OO.OooO00o;
import oO0OOooo.C33163OooO0oO;
import oO0Oo.C33178OooOo0;
import oO0Oo.C33179OooOo0O;
import oO0Oo.C33181OooOoO;
import oO0Oo.C33183OooOoOO;
import oO0Oo.C33184OooOoo;
import oO0Oo.C33185OooOoo0;
import oO0Oo.C33186OooOooO;
import oO0Oo.C33187OooOooo;
import oO0Oo.C33189Oooo00o;
import oO0Oo.OooOo00;
import oO0Oo.Oooo000;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m80612d2 = {"Lcom/orion/notein/ui/ocr/TextRecognizeFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "OooO0OO", "OooO00o", "OooO0O0", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TextRecognizeFragment extends Hilt_TextRecognizeFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f78163OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C24568OooO0oO f78164OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f78165OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f78166OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public View f78167Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f78168Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public ViewGroup f78169Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f78170Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f78171Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f78172Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f78173Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Spinner f78174Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f78175Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f78176Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TextView f78177Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public oO0OO.OooO00o f78178OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public AiOcrEditorListContainer f78179OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ViewGroup f78180OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public RecyclerView f78181OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final oO0OO.OooO f78182OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public View f78183OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public View f78184OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public View f78185OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public TextView f78186OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public TextView f78187OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public View f78188Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public View f78189Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public View f78190OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public View f78191OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public o0o0O.OooO0OO f78192OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public o0o0O.OooO0O0 f78193Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public View f78194Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public C25086OooOo0O f78195OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public boolean f78196Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public ViewGroup f78197o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public C30174OooO00o f78198o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public final o0ooOOo f78199o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public final OooO0OO f78200o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f78201o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public final OooO0O0 f78202o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public final OooO0o.OooO0O0<Uri> f78203o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public Uri f78204o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final Handler f78205o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public final OooO0o.OooO0O0<OooO0o.OooOO0> f78206o0ooOO0;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public final OooO00o f78207oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public RunnableC23723OooO0oO f78208ooOO;

    public static final class OooO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return TextRecognizeFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public final class OooO00o implements OooO0o.OooO00o<Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f78211OooOo0o;

        public OooO00o() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // OooO0o.OooO00o
        public final void OooO0O0(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            TextRecognizeFragment textRecognizeFragment = TextRecognizeFragment.this;
            Uri uri = textRecognizeFragment.f78204o00ooo;
            textRecognizeFragment.f78204o00ooo = null;
            if (zBooleanValue && uri != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String) textRecognizeFragment.Oooo00O().f108513OooOoO.f121747OooOo0o.getValue(), Locale.getDefault());
                InterfaceC21987OooOoo viewLifecycleOwner = textRecognizeFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.ocr.OooO00o(this, textRecognizeFragment, simpleDateFormat, uri, null), 3);
                return;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("cameraLauncher");
            c20358OooO00o.OooO0o0("No media selected. result: " + zBooleanValue, new Object[0]);
        }
    }

    public final class OooO0O0 implements OooO0o.OooO00o<List<? extends Uri>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f78213OooOo0o;

        public OooO0O0() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // OooO0o.OooO00o
        public final void OooO0O0(List<? extends Uri> list) {
            List<? extends Uri> result = list;
            kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
            if (result.isEmpty()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("importMediaLauncher");
                c20358OooO00o.OooO0o0("No media selected", new Object[0]);
                return;
            }
            TextRecognizeFragment textRecognizeFragment = TextRecognizeFragment.this;
            Context contextRequireContext = textRecognizeFragment.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            Iterator<T> it = result.iterator();
            while (it.hasNext()) {
                contextRequireContext.getContentResolver().takePersistableUriPermission((Uri) it.next(), 1);
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String) textRecognizeFragment.Oooo00O().f108513OooOoO.f121747OooOo0o.getValue(), Locale.getDefault());
            InterfaceC21987OooOoo viewLifecycleOwner = textRecognizeFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.ocr.OooO0OO(this, textRecognizeFragment, simpleDateFormat, result, null), 3);
        }
    }

    public final class OooO0OO implements OooO0o.OooO00o<ActivityResult> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f78214OooOo = true;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f78215OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$ImportPdfCallback$onActivityResult$1", m80623f = "TextRecognizeFragment.kt", m80624l = {1312}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C24572OooOO0o f78217OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78218OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ Oooo000 f78219OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(C24572OooOO0o c24572OooOO0o, Oooo000 oooo000, Continuation continuation) {
                super(2, continuation);
                this.f78217OooOo = c24572OooOO0o;
                this.f78219OooOoO0 = oooo000;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f78217OooOo, this.f78219OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78218OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f78218OooOo0o = 1;
                    if (C33644OoooO0.OooO00o(1000L, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                C28026OooO0OO.OooO0O0(this.f78217OooOo, this.f78219OooOoO0);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$ImportPdfCallback$onActivityResult$2", m80623f = "TextRecognizeFragment.kt", m80624l = {1322, 1330}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextRecognizeFragment f78220OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78221OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public final /* synthetic */ OooO0OO f78222OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ Uri f78223OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public final /* synthetic */ String f78224OooOoOO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(TextRecognizeFragment textRecognizeFragment, Uri uri, OooO0OO oooO0OO, String str, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f78220OooOo = textRecognizeFragment;
                this.f78223OooOoO0 = uri;
                this.f78222OooOoO = oooO0OO;
                this.f78224OooOoOO = str;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f78220OooOo, this.f78223OooOoO0, this.f78222OooOoO, this.f78224OooOoOO, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
            
                if (r0 == r2) goto L51;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:
            
                if (r0 == r2) goto L51;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
            @Override // oO00ooo.AbstractC32477OooO00o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                String string;
                AiOcrSession aiOcrSession;
                Object objOooO0o;
                Object objOooO0o2;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78221OooOo0o;
                TextRecognizeFragment textRecognizeFragment = this.f78220OooOo;
                OooO0OO oooO0OO = this.f78222OooOoO;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    Context contextRequireContext = textRecognizeFragment.requireContext();
                    Uri uri = this.f78223OooOoO0;
                    if (FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme())) {
                        try {
                            Cursor cursorQuery = contextRequireContext.getContentResolver().query(uri, null, null, null, null);
                            if (cursorQuery != null) {
                                try {
                                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndex("_display_name")) : null;
                                    if (cursorQuery != null) {
                                        try {
                                            cursorQuery.close();
                                        } catch (Exception e) {
                                            e = e;
                                            Log.e("UriUtils", "Error getting file name: " + e);
                                        }
                                    }
                                } finally {
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            string = null;
                            Log.e("UriUtils", "Error getting file name: " + e);
                            if (string == null) {
                            }
                            String str = string;
                            if (oooO0OO.f78215OooOo0o) {
                            }
                            return enumC32485OooO00o;
                        }
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        string = uri.getPath();
                        int iLastIndexOf = string != null ? string.lastIndexOf(47) : -1;
                        if (iLastIndexOf != -1) {
                            string = string.substring(iLastIndexOf + 1);
                        }
                    }
                    String str2 = string;
                    if (oooO0OO.f78215OooOo0o) {
                        AiOcrSession aiOcrSession2 = (AiOcrSession) textRecognizeFragment.Oooo00O().f108506OooOOo0.f121747OooOo0o.getValue();
                        if (aiOcrSession2 != null) {
                            C30394OooOOOO c30394OooOOOOOooo00O = textRecognizeFragment.Oooo00O();
                            String id = aiOcrSession2.getId();
                            List listOooO0oO = OooOo.OooO0oO(uri);
                            this.f78221OooOo0o = 2;
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30386OooO0o0(c30394OooOOOOOooo00O, id, 1, listOooO0oO, this.f78224OooOoOO, null), this);
                        } else {
                            aiOcrSession = null;
                        }
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(str2);
                        List listOooO0oO2 = OooOo.OooO0oO(uri);
                        this.f78221OooOo0o = 1;
                        C30394OooOOOO c30394OooOOOOOooo00O2 = textRecognizeFragment.Oooo00O();
                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                        objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30390OooOO0O(c30394OooOOOOOooo00O2, str2, 1, listOooO0oO2, this.f78224OooOoOO, null), this);
                    }
                    return enumC32485OooO00o;
                }
                if (i == 1) {
                    C32446OooOOOo.OooO0O0(obj);
                    objOooO0o2 = obj;
                    aiOcrSession = (AiOcrSession) objOooO0o2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    objOooO0o = obj;
                    aiOcrSession = (AiOcrSession) objOooO0o;
                }
                if (aiOcrSession == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("ImportPdfCallback");
                    c20358OooO00o.OooO0OO(com.aspose.slides.internal.p332p7.OooO0O0.OooO0O0("Failed to create session. createNewSession=", oooO0OO.f78215OooOo0o), new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                if (oooO0OO.f78214OooOo) {
                    TextRecognizeFragment.OooOoOO(textRecognizeFragment, aiOcrSession);
                } else {
                    String str3 = (String) oOo000Oo.OooOo.Oooo0oO(aiOcrSession.getInputSource().getSourceUris());
                    Context context = textRecognizeFragment.getContext();
                    if (context != null) {
                        C32443OooOOO c32443OooOOO = (C32443OooOOO) textRecognizeFragment.Oooo00O().f108501OooOOO.f121747OooOo0o.getValue();
                        int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                        ((Number) c32443OooOOO.f116637OooOo).intValue();
                        if (iIntValue <= 0) {
                            textRecognizeFragment.Oooo00o(true);
                        } else {
                            InterfaceC21987OooOoo viewLifecycleOwner = textRecognizeFragment.getViewLifecycleOwner();
                            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C33183OooOoOO(textRecognizeFragment, (C33163OooO0oO) context, str3, this.f78224OooOoOO, null), 3);
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0OO() {
        }

        public final void OooO00o(Uri uri, String str) {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
            TextRecognizeFragment textRecognizeFragment = TextRecognizeFragment.this;
            Context context = textRecognizeFragment.getContext();
            if (context != null && (parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r")) != null) {
                try {
                    PdfiumCore pdfiumCore = new PdfiumCore(context);
                    try {
                        PdfDocument pdfDocumentNewDocument = pdfiumCore.newDocument(parcelFileDescriptorOpenFileDescriptor, str);
                        if (pdfDocumentNewDocument != null) {
                            pdfiumCore.closeDocument(pdfDocumentNewDocument);
                        }
                    } catch (PdfPasswordException unused) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        Oooo000 oooo000 = new Oooo000(uri.toString());
                        C24572OooOO0o c24572OooOO0oOooO0OO = C21030OooOO0o.OooO0OO(textRecognizeFragment);
                        C24583OooOo0o c24583OooOo0oOooO0oO = c24572OooOO0oOooO0OO.OooO0oO();
                        if (c24583OooOo0oOooO0oO != null && c24583OooOo0oOooO0oO.f83302OooOooO == R.id.textRecognizeFragment) {
                            C28026OooO0OO.OooO0O0(c24572OooOO0oOooO0OO, oooo000);
                            return;
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("TextRecognizeFragment");
                        c20358OooO00o.OooO0OO("Failed to navigate to PdfPasswordDialogFragment", new Object[0]);
                        InterfaceC21987OooOoo viewLifecycleOwner = textRecognizeFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(c24572OooOO0oOooO0OO, oooo000, null), 3);
                        return;
                    } catch (Exception e) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("TextRecognizeFragment");
                        c20358OooO00o2.OooO0O0(e);
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        oO0O000.OooO00o.OooO00o(parcelFileDescriptorOpenFileDescriptor, th);
                        throw th2;
                    }
                }
            }
            InterfaceC21987OooOoo viewLifecycleOwner2 = textRecognizeFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new OooO0O0(textRecognizeFragment, uri, this, str, null), 3);
        }

        @Override // OooO0o.OooO00o
        public final void OooO0O0(ActivityResult activityResult) {
            ClipData.Item itemAt;
            ActivityResult result = activityResult;
            kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
            Intent intent = result.f62239OooOo;
            if (intent == null) {
                return;
            }
            Uri data = intent.getData();
            if (data == null) {
                ClipData clipData = intent.getClipData();
                data = (clipData == null || (itemAt = clipData.getItemAt(0)) == null) ? null : itemAt.getUri();
                if (data == null) {
                    return;
                }
            }
            OooO00o(data, null);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.TextRecognizeFragment$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$handleInsertPageAction$1", m80623f = "TextRecognizeFragment.kt", m80624l = {720}, m80625m = "invokeSuspend")
    public static final class C23718OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78226OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ int f78227OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ AiOcrSessionInputSource f78228OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ int f78229OooOoOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23718OooO0Oo(AiOcrSessionInputSource aiOcrSessionInputSource, int i, int i2, Continuation<? super C23718OooO0Oo> continuation) {
            super(2, continuation);
            this.f78228OooOoO0 = aiOcrSessionInputSource;
            this.f78227OooOoO = i;
            this.f78229OooOoOO = i2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return TextRecognizeFragment.this.new C23718OooO0Oo(this.f78228OooOoO0, this.f78227OooOoO, this.f78229OooOoOO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23718OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f78226OooOo0o;
            TextRecognizeFragment textRecognizeFragment = TextRecognizeFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f78226OooOo0o = 1;
                obj = TextRecognizeFragment.OooOoo(textRecognizeFragment, this);
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
                TextRecognizeFragment.OooOoo0(textRecognizeFragment, "100008");
                return C32460OooOooO.f116667OooO00o;
            }
            AiOcrSessionInputSource aiOcrSessionInputSource = this.f78228OooOoO0;
            int sourceType = aiOcrSessionInputSource.getSourceType();
            int i2 = this.f78229OooOoOO;
            int i3 = this.f78227OooOoO;
            if (sourceType == 0) {
                List<String> uriStrList = aiOcrSessionInputSource.getSourceUris().subList(i3, i2);
                C30394OooOOOO c30394OooOOOOOooo00O = textRecognizeFragment.Oooo00O();
                kotlin.jvm.internal.OooOOO0.OooO0oO(uriStrList, "uriStrList");
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30394OooOOOOOooo00O);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30393OooOOO0(c30394OooOOOOOooo00O, uriStrList, null), 2);
            } else if (sourceType == 1) {
                textRecognizeFragment.Oooo00O().OooO((String) oOo000Oo.OooOo.Oooo0oO(aiOcrSessionInputSource.getSourceUris()), new C32443OooOOO<>(new Integer(i3), new Integer(i2)), aiOcrSessionInputSource.getPdfPassword());
            } else if (sourceType != 3) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("TextRecognizeFragment");
                c20358OooO00o.OooO0OO(C21532OooOOo.OooO0OO(aiOcrSessionInputSource.getSourceType(), "Unsupported input source type: "), new Object[0]);
            } else {
                C30394OooOOOO c30394OooOOOOOooo00O2 = textRecognizeFragment.Oooo00O();
                String noteId = (String) oOo000Oo.OooOo.Oooo0oO(aiOcrSessionInputSource.getSourceUris());
                C32443OooOOO c32443OooOOO = new C32443OooOOO(new Integer(i3), new Integer(i2));
                kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(c30394OooOOOOOooo00O2);
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30392OooOOO(c30394OooOOOOOooo00O2, noteId, c32443OooOOO, null), 2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$onViewCreated$11", m80623f = "TextRecognizeFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f78231OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$onViewCreated$11$1", m80623f = "TextRecognizeFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextRecognizeFragment f78232OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78233OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.ocr.TextRecognizeFragment$OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$onViewCreated$11$1$1", m80623f = "TextRecognizeFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19437OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ TextRecognizeFragment f78234OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78235OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19437OooO00o(TextRecognizeFragment textRecognizeFragment, Continuation<? super C19437OooO00o> continuation) {
                    super(2, continuation);
                    this.f78234OooOo = textRecognizeFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19437OooO00o c19437OooO00o = new C19437OooO00o(this.f78234OooOo, continuation);
                    c19437OooO00o.f78235OooOo0o = obj;
                    return c19437OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19437OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    String str = (String) this.f78235OooOo0o;
                    boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(str, "599997");
                    TextRecognizeFragment textRecognizeFragment = this.f78234OooOo;
                    View view = textRecognizeFragment.f78190OooooO0;
                    if (view == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnRecords");
                        throw null;
                    }
                    view.setEnabled(!zOooO0O0);
                    if (zOooO0O0) {
                        View view2 = textRecognizeFragment.f78176Oooo0oO;
                        if (view2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("loadingView");
                            throw null;
                        }
                        view2.setVisibility(0);
                        TextView textView = textRecognizeFragment.f78177Oooo0oo;
                        if (textView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("tvLoading");
                            throw null;
                        }
                        textView.setText(textRecognizeFragment.getString(R.string.wait_to_generate_ocr_result));
                        View view3 = textRecognizeFragment.f78183OoooOOO;
                        if (view3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnCopy");
                            throw null;
                        }
                        view3.setEnabled(false);
                        View view4 = textRecognizeFragment.f78184OoooOOo;
                        if (view4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnRetry");
                            throw null;
                        }
                        view4.setEnabled(false);
                        View view5 = textRecognizeFragment.f78185OoooOo0;
                        if (view5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnEdit");
                            throw null;
                        }
                        view5.setEnabled(false);
                        View view6 = textRecognizeFragment.f78189Ooooo0o;
                        if (view6 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnExport");
                            throw null;
                        }
                        view6.setEnabled(false);
                        TextView textView2 = textRecognizeFragment.f78187OoooOoo;
                        if (textView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnChangeInputSource");
                            throw null;
                        }
                        textView2.setEnabled(false);
                        TextView textView3 = textRecognizeFragment.f78186OoooOoO;
                        if (textView3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinuePage");
                            throw null;
                        }
                        textView3.setEnabled(false);
                    } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, "0")) {
                        View view7 = textRecognizeFragment.f78176Oooo0oO;
                        if (view7 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("loadingView");
                            throw null;
                        }
                        view7.setVisibility(8);
                        View view8 = textRecognizeFragment.f78183OoooOOO;
                        if (view8 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnCopy");
                            throw null;
                        }
                        view8.setEnabled(true);
                        View view9 = textRecognizeFragment.f78184OoooOOo;
                        if (view9 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnRetry");
                            throw null;
                        }
                        view9.setEnabled(true);
                        View view10 = textRecognizeFragment.f78185OoooOo0;
                        if (view10 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnEdit");
                            throw null;
                        }
                        view10.setEnabled(true);
                        View view11 = textRecognizeFragment.f78189Ooooo0o;
                        if (view11 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnExport");
                            throw null;
                        }
                        view11.setEnabled(true);
                        TextView textView4 = textRecognizeFragment.f78187OoooOoo;
                        if (textView4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnChangeInputSource");
                            throw null;
                        }
                        textView4.setEnabled(true);
                        TextView textView5 = textRecognizeFragment.f78186OoooOoO;
                        if (textView5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinuePage");
                            throw null;
                        }
                        textView5.setEnabled(true);
                    } else {
                        TextRecognizeFragment.OooOoo0(textRecognizeFragment, str);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TextRecognizeFragment textRecognizeFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f78232OooOo = textRecognizeFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f78232OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78233OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TextRecognizeFragment textRecognizeFragment = this.f78232OooOo;
                    C30394OooOOOO c30394OooOOOOOooo00O = textRecognizeFragment.Oooo00O();
                    C19437OooO00o c19437OooO00o = new C19437OooO00o(textRecognizeFragment, null);
                    this.f78233OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30394OooOOOOOooo00O.f108511OooOo0O, c19437OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$onViewCreated$11$2", m80623f = "TextRecognizeFragment.kt", m80624l = {300}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextRecognizeFragment f78236OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78237OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$onViewCreated$11$2$1", m80623f = "TextRecognizeFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends String, ? extends String>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ TextRecognizeFragment f78238OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78239OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(TextRecognizeFragment textRecognizeFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f78238OooOo = textRecognizeFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f78238OooOo, continuation);
                    oooO00o.f78239OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32443OooOOO<? extends String, ? extends String> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f78239OooOo0o;
                    String str = (String) c32443OooOOO.f116638OooOo0o;
                    String str2 = (String) c32443OooOOO.f116637OooOo;
                    TextRecognizeFragment textRecognizeFragment = this.f78238OooOo;
                    String strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("<style>\nhtml, body {\nmargin: 30px;\n}\n</style>\n", str2);
                    WebView webView = new WebView(textRecognizeFragment.requireActivity());
                    webView.setWebViewClient(new C33181OooOoO(textRecognizeFragment, str));
                    webView.loadDataWithBaseURL(null, strOooO00o, "text/HTML", "UTF-8", null);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(TextRecognizeFragment textRecognizeFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f78236OooOo = textRecognizeFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f78236OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78237OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TextRecognizeFragment textRecognizeFragment = this.f78236OooOo;
                    C33772OooooOo c33772OooooOo = textRecognizeFragment.Oooo00O().f108510OooOo00;
                    OooO00o oooO00o = new OooO00o(textRecognizeFragment, null);
                    this.f78237OooOo0o = 1;
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$onViewCreated$11$3", m80623f = "TextRecognizeFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_4}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextRecognizeFragment f78240OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78241OooOo0o;

            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$onViewCreated$11$3$1", m80623f = "TextRecognizeFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C32443OooOOO<? extends C31088OoooooO.OooO00o, ? extends List<? extends C31088OoooooO>>>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ TextRecognizeFragment f78242OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78243OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(TextRecognizeFragment textRecognizeFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f78242OooOo = textRecognizeFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f78242OooOo, continuation);
                    oooO00o.f78243OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C32443OooOOO<? extends C31088OoooooO.OooO00o, ? extends List<? extends C31088OoooooO>>> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    this.f78242OooOo.f78182OoooOO0.OooO0Oo((List) this.f78243OooOo0o);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(TextRecognizeFragment textRecognizeFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f78240OooOo = textRecognizeFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f78240OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78241OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TextRecognizeFragment textRecognizeFragment = this.f78240OooOo;
                    C30394OooOOOO c30394OooOOOOOooo00O = textRecognizeFragment.Oooo00O();
                    OooO00o oooO00o = new OooO00o(textRecognizeFragment, null);
                    this.f78241OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30394OooOOOOOooo00O.f108505OooOOo, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.ocr.TextRecognizeFragment$OooO0o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$onViewCreated$11$4", m80623f = "TextRecognizeFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_5}, m80625m = "invokeSuspend")
        public static final class C23719OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextRecognizeFragment f78244OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78245OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.ocr.TextRecognizeFragment$OooO0o$OooO0Oo$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$onViewCreated$11$4$1", m80623f = "TextRecognizeFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ TextRecognizeFragment f78246OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ int f78247OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(TextRecognizeFragment textRecognizeFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f78246OooOo = textRecognizeFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f78246OooOo, continuation);
                    oooO00o.f78247OooOo0o = ((Number) obj).intValue();
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
                    int i = this.f78247OooOo0o;
                    RecyclerView recyclerView = this.f78246OooOo.f78181OoooO0O;
                    if (recyclerView != null) {
                        recyclerView.scrollToPosition(i);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editorList");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23719OooO0Oo(TextRecognizeFragment textRecognizeFragment, Continuation<? super C23719OooO0Oo> continuation) {
                super(2, continuation);
                this.f78244OooOo = textRecognizeFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23719OooO0Oo(this.f78244OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23719OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78245OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TextRecognizeFragment textRecognizeFragment = this.f78244OooOo;
                    C33772OooooOo c33772OooooOo = textRecognizeFragment.Oooo00O().f108518OooOooO;
                    OooO00o oooO00o = new OooO00o(textRecognizeFragment, null);
                    this.f78245OooOo0o = 1;
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

        /* JADX INFO: renamed from: com.orion.notein.ui.ocr.TextRecognizeFragment$OooO0o$OooO0o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$onViewCreated$11$6", m80623f = "TextRecognizeFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_3_ACCENT_1}, m80625m = "invokeSuspend")
        public static final class C19438OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextRecognizeFragment f78248OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78249OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.ocr.TextRecognizeFragment$OooO0o$OooO0o$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$onViewCreated$11$6$1", m80623f = "TextRecognizeFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31030OooO00o>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ TextRecognizeFragment f78250OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78251OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(TextRecognizeFragment textRecognizeFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f78250OooOo = textRecognizeFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f78250OooOo, continuation);
                    oooO00o.f78251OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C31030OooO00o> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f78251OooOo0o;
                    final TextRecognizeFragment textRecognizeFragment = this.f78250OooOo;
                    oO0OO.OooO00o oooO00o = textRecognizeFragment.f78178OoooO;
                    if (oooO00o != null) {
                        oooO00o.OooO0o0(list, new Runnable() { // from class: oO0Oo.OooOoO0
                            @Override // java.lang.Runnable
                            public final void run() {
                                TextRecognizeFragment textRecognizeFragment2 = textRecognizeFragment;
                                oO0OO.OooO00o oooO00o2 = textRecognizeFragment2.f78178OoooO;
                                if (oooO00o2 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("adapter");
                                    throw null;
                                }
                                boolean z = oooO00o2.getItemCount() > 0;
                                View view = textRecognizeFragment2.f78183OoooOOO;
                                if (view == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnCopy");
                                    throw null;
                                }
                                view.setEnabled(z);
                                View view2 = textRecognizeFragment2.f78185OoooOo0;
                                if (view2 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnEdit");
                                    throw null;
                                }
                                view2.setEnabled(z);
                                View view3 = textRecognizeFragment2.f78184OoooOOo;
                                if (view3 == null) {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnRetry");
                                    throw null;
                                }
                                view3.setEnabled(z);
                                View view4 = textRecognizeFragment2.f78189Ooooo0o;
                                if (view4 != null) {
                                    view4.setEnabled(z);
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnExport");
                                    throw null;
                                }
                            }
                        });
                        return C32460OooOooO.f116667OooO00o;
                    }
                    kotlin.jvm.internal.OooOOO0.OooOOOO("adapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19438OooO0o(TextRecognizeFragment textRecognizeFragment, Continuation<? super C19438OooO0o> continuation) {
                super(2, continuation);
                this.f78248OooOo = textRecognizeFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19438OooO0o(this.f78248OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19438OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78249OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TextRecognizeFragment textRecognizeFragment = this.f78248OooOo;
                    C30394OooOOOO c30394OooOOOOOooo00O = textRecognizeFragment.Oooo00O();
                    OooO00o oooO00o = new OooO00o(textRecognizeFragment, null);
                    this.f78249OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30394OooOOOOOooo00O.f108514OooOoO0, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.ocr.TextRecognizeFragment$OooO0o$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$onViewCreated$11$5", m80623f = "TextRecognizeFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_4_ACCENT_6}, m80625m = "invokeSuspend")
        public static final class C23720OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextRecognizeFragment f78252OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78253OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.ocr.TextRecognizeFragment$OooO0o$OooO0o0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$onViewCreated$11$5$1", m80623f = "TextRecognizeFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AiOcrSession, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ TextRecognizeFragment f78254OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78255OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(TextRecognizeFragment textRecognizeFragment, Continuation<? super OooO00o> continuation) {
                    super(2, continuation);
                    this.f78254OooOo = textRecognizeFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(this.f78254OooOo, continuation);
                    oooO00o.f78255OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(AiOcrSession aiOcrSession, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(aiOcrSession, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    AiOcrSessionInputSource inputSource;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    AiOcrSession aiOcrSession = (AiOcrSession) this.f78255OooOo0o;
                    TextRecognizeFragment textRecognizeFragment = this.f78254OooOo;
                    if (aiOcrSession != null && (inputSource = aiOcrSession.getInputSource()) != null) {
                        textRecognizeFragment.getClass();
                        if (inputSource.getSourceType() == 0) {
                            int size = inputSource.getSourceUris().size();
                            TextView textView = textRecognizeFragment.f78186OoooOoO;
                            if (textView == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinuePage");
                                throw null;
                            }
                            textView.setVisibility(size > 0 ? 0 : 8);
                        } else {
                            TextView textView2 = textRecognizeFragment.f78186OoooOoO;
                            if (textView2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinuePage");
                                throw null;
                            }
                            textView2.setVisibility(0);
                        }
                    }
                    boolean z = aiOcrSession != null;
                    if (!z) {
                        AiOcrEditorListContainer aiOcrEditorListContainer = textRecognizeFragment.f78179OoooO0;
                        if (aiOcrEditorListContainer == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("editorListContainer");
                            throw null;
                        }
                        AiOcrRichEditor aiOcrRichEditor = aiOcrEditorListContainer.f78424OooOoO0;
                        if (aiOcrRichEditor != null) {
                            aiOcrRichEditor.setText((CharSequence) null);
                        }
                        AiOcrRichEditor aiOcrRichEditor2 = aiOcrEditorListContainer.f78424OooOoO0;
                        if (aiOcrRichEditor2 != null) {
                            aiOcrRichEditor2.clearFocus();
                        }
                    }
                    textRecognizeFragment.Oooo0oO(!z);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23720OooO0o0(TextRecognizeFragment textRecognizeFragment, Continuation<? super C23720OooO0o0> continuation) {
                super(2, continuation);
                this.f78252OooOo = textRecognizeFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23720OooO0o0(this.f78252OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23720OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78253OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TextRecognizeFragment textRecognizeFragment = this.f78252OooOo;
                    C30394OooOOOO c30394OooOOOOOooo00O = textRecognizeFragment.Oooo00O();
                    OooO00o oooO00o = new OooO00o(textRecognizeFragment, null);
                    this.f78253OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30394OooOOOOOooo00O.f108506OooOOo0, oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.ocr.TextRecognizeFragment$OooO0o$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$onViewCreated$11$7", m80623f = "TextRecognizeFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3}, m80625m = "invokeSuspend")
        public static final class C23721OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TextRecognizeFragment f78256OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78257OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.ocr.TextRecognizeFragment$OooO0o$OooO0oO$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.TextRecognizeFragment$onViewCreated$11$7$1", m80623f = "TextRecognizeFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Integer, ? extends Integer>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78258OooOo0o;

                public OooO00o() {
                    throw null;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(2, continuation);
                    oooO00o.f78258OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32443OooOOO<? extends Integer, ? extends Integer> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f78258OooOo0o;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("TextRecognizeFragment");
                    c20358OooO00o.OooO0o0("AiQuotaUsage: " + c32443OooOOO, new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23721OooO0oO(TextRecognizeFragment textRecognizeFragment, Continuation<? super C23721OooO0oO> continuation) {
                super(2, continuation);
                this.f78256OooOo = textRecognizeFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23721OooO0oO(this.f78256OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23721OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78257OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C30394OooOOOO c30394OooOOOOOooo00O = this.f78256OooOo.Oooo00O();
                    OooO00o oooO00o = new OooO00o(2, null);
                    this.f78257OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30394OooOOOOOooo00O.f108501OooOOO, oooO00o, this) == enumC32485OooO00o) {
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

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0o oooO0o = TextRecognizeFragment.this.new OooO0o(continuation);
            oooO0o.f78231OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f78231OooOo0o;
            TextRecognizeFragment textRecognizeFragment = TextRecognizeFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(textRecognizeFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(textRecognizeFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(textRecognizeFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23719OooO0Oo(textRecognizeFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23720OooO0o0(textRecognizeFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19438OooO0o(textRecognizeFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23721OooO0oO(textRecognizeFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.TextRecognizeFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23722OooO0o0 implements CustomConstraintLayout.OooO00o {
        public C23722OooO0o0() {
        }

        @Override // com.orion.notein.ui.widget.CustomConstraintLayout.OooO00o
        public final void OooO00o(MotionEvent motionEvent) {
            TextRecognizeFragment textRecognizeFragment = TextRecognizeFragment.this;
            if (motionEvent.getAction() != 0) {
                return;
            }
            textRecognizeFragment.f78196Ooooooo = false;
        }

        @Override // com.orion.notein.ui.widget.CustomConstraintLayout.OooO00o
        public final void OooO0O0(MotionEvent motionEvent, final boolean z) {
            View view;
            final TextRecognizeFragment textRecognizeFragment = TextRecognizeFragment.this;
            final int action = motionEvent.getAction();
            if ((action == 0 || action == 1) && (view = textRecognizeFragment.getView()) != null) {
                view.post(new Runnable() { // from class: oO0Oo.OooOOOo
                    @Override // java.lang.Runnable
                    public final void run() {
                        TextRecognizeFragment textRecognizeFragment2 = textRecognizeFragment;
                        if (!z) {
                            textRecognizeFragment2.Oooo0o0();
                        } else {
                            if (action != 1 || textRecognizeFragment2.f78196Ooooooo) {
                                return;
                            }
                            textRecognizeFragment2.Oooo0o0();
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.TextRecognizeFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class RunnableC23723OooO0oO implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ boolean f78260OooOo;

        public RunnableC23723OooO0oO(boolean z) {
            this.f78260OooOo = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextRecognizeFragment textRecognizeFragment = TextRecognizeFragment.this;
            ViewGroup viewGroup = textRecognizeFragment.f78169Oooo000;
            if (viewGroup == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("homePage");
                throw null;
            }
            boolean z = this.f78260OooOo;
            viewGroup.setVisibility(z ? 0 : 8);
            View view = textRecognizeFragment.f78170Oooo00O;
            if (view != null) {
                view.setActivated(!z);
            } else {
                kotlin.jvm.internal.OooOOO0.OooOOOO("btnHomePage");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.TextRecognizeFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23724OooO0oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23724OooO0oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return TextRecognizeFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooOO0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return TextRecognizeFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooOO0O extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o000o0O0.OooOO0> {
        public OooOO0O() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o000o0O0.OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(TextRecognizeFragment.this).OooO0o(R.id.textRecognizeFragment);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.TextRecognizeFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23725OooOO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78265OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23725OooOO0o(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78265OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((o000o0O0.OooOO0) this.f78265OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78266OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78266OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = TextRecognizeFragment.this.requireActivity();
            kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((o000o0O0.OooOO0) this.f78266OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    public static final class OooOOO0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78268OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78268OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((o000o0O0.OooOO0) this.f78268OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooOOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooOOOO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            TextRecognizeFragment textRecognizeFragment = TextRecognizeFragment.this;
            Bundle arguments = textRecognizeFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + textRecognizeFragment + " has null arguments");
        }
    }

    public TextRecognizeFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f78164OooOoo0 = new C24568OooO0oO(oooo0.OooO0O0(C33186OooOooO.class), new OooOOOO());
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new OooOO0O());
        this.f78163OooOoo = new C22026ooOO(oooo0.OooO0O0(C30394OooOOOO.class), new C23725OooOO0o(c32447OooOOoOooO0OO), new OooOOO(c32447OooOOoOooO0OO), new OooOOO0(c32447OooOOoOooO0OO));
        this.f78165OooOooO = new C22026ooOO(oooo0.OooO0O0(o0Oo0O.OooOOO.class), new C23724OooO0oo(), new OooOO0(), new OooO());
        this.f78182OoooOO0 = new oO0OO.OooO(OooO.OooO00o.f117980OooO00o);
        this.f78205o0OoOo0 = new Handler(Looper.getMainLooper());
        this.f78199o00Oo0 = new o0ooOOo(this);
        OooO0OO oooO0OO = new OooO0OO();
        this.f78200o00Ooo = oooO0OO;
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20439OooO0oo(), oooO0OO);
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f78201o00o0O = oooO0O0RegisterForActivityResult;
        OooO00o oooO00o = new OooO00o();
        this.f78207oo000o = oooO00o;
        OooO0o.OooO0O0<Uri> oooO0O0RegisterForActivityResult2 = registerForActivityResult(new C20440OooOO0(), oooO00o);
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult2, "registerForActivityResult(...)");
        this.f78203o00oO0o = oooO0O0RegisterForActivityResult2;
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f78202o00oO0O = oooO0O0;
        int i = Build.VERSION.SDK_INT;
        OooO0o.OooO0O0<OooO0o.OooOO0> oooO0O0RegisterForActivityResult3 = registerForActivityResult(new C20433OooO0OO((i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit()), oooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0RegisterForActivityResult3, "registerForActivityResult(...)");
        this.f78206o0ooOO0 = oooO0O0RegisterForActivityResult3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOoOO(TextRecognizeFragment textRecognizeFragment, AiOcrSession aiOcrSession) {
        C32443OooOOO c32443OooOOO = (C32443OooOOO) textRecognizeFragment.Oooo00O().f108501OooOOO.f121747OooOo0o.getValue();
        int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
        ((Number) c32443OooOOO.f116637OooOo).intValue();
        if (iIntValue <= 0) {
            textRecognizeFragment.Oooo00o(true);
            return;
        }
        AiOcrSessionInputSource input = aiOcrSession.getInputSource();
        kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(textRecognizeFragment), new C33187OooOooo(input, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOoo(TextRecognizeFragment textRecognizeFragment, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33184OooOoo c33184OooOoo;
        C28065OooO0O0 c28065OooO0O0;
        textRecognizeFragment.getClass();
        if (abstractC32479OooO0OO instanceof C33184OooOoo) {
            c33184OooOoo = (C33184OooOoo) abstractC32479OooO0OO;
            int i = c33184OooOoo.f120090OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33184OooOoo.f120090OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c33184OooOoo = new C33184OooOoo(textRecognizeFragment, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c33184OooOoo.f120089OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33184OooOoo.f120090OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            o0Oo0O.OooOOO oooOOO = (o0Oo0O.OooOOO) textRecognizeFragment.f78165OooOooO.getValue();
            c33184OooOoo.f120090OooOoO0 = 1;
            objOooO0o = oooOOO.OooO0o("aiocr", c33184OooOoo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        C28071OooO0oo c28071OooO0oo = (C28071OooO0oo) objOooO0o;
        C28069OooO0o0 c28069OooO0o0 = c28071OooO0oo.f99514OooO0OO;
        String str = (c28069OooO0o0 == null || (c28065OooO0O0 = c28069OooO0o0.f99504OooO0O0) == null) ? null : c28065OooO0O0.f99487OooO00o;
        if (str == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TextRecognizeFragment");
            c20358OooO00o.OooO0OO("Failed to get appRecognitionVerdict", new Object[0]);
            return Boolean.FALSE;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o2, "TextRecognizeFragment", "appRecognitionVerdict: ");
        sbOooO0O0.append(c28071OooO0oo.f99514OooO0OO);
        c20358OooO00o2.OooO0o0(sbOooO0O0.toString(), new Object[0]);
        return Boolean.valueOf(str.equals("UNRECOGNIZED_VERSION"));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void OooOoo0(TextRecognizeFragment textRecognizeFragment, String str) {
        textRecognizeFragment.getClass();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0OO(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "TextRecognizeFragment", "onRecognizeFailed: ", str), new Object[0]);
        View view = textRecognizeFragment.f78176Oooo0oO;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("loadingView");
            throw null;
        }
        view.setVisibility(8);
        oO0OO.OooO00o oooO00o = textRecognizeFragment.f78178OoooO;
        if (oooO00o == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("adapter");
            throw null;
        }
        boolean z = oooO00o.getItemCount() > 0;
        View view2 = textRecognizeFragment.f78183OoooOOO;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnCopy");
            throw null;
        }
        view2.setEnabled(z);
        View view3 = textRecognizeFragment.f78185OoooOo0;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnEdit");
            throw null;
        }
        view3.setEnabled(z);
        View view4 = textRecognizeFragment.f78189Ooooo0o;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnExport");
            throw null;
        }
        view4.setEnabled(z);
        View view5 = textRecognizeFragment.f78184OoooOOo;
        if (view5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnRetry");
            throw null;
        }
        view5.setEnabled(z);
        TextView textView = textRecognizeFragment.f78186OoooOoO;
        if (textView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinuePage");
            throw null;
        }
        textView.setEnabled(true);
        TextView textView2 = textRecognizeFragment.f78187OoooOoo;
        if (textView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnChangeInputSource");
            throw null;
        }
        textView2.setEnabled(true);
        switch (str.hashCode()) {
            case 1448635040:
                if (str.equals("100001")) {
                    Context context = textRecognizeFragment.getContext();
                    if (context != null) {
                        String string = textRecognizeFragment.getString(R.string.error_toast_internal_error);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0OO((ContextWrapper) context, string);
                        return;
                    }
                    return;
                }
                break;
            case 1448635047:
                if (str.equals("100008")) {
                    Context context2 = textRecognizeFragment.getContext();
                    if (context2 != null) {
                        String string2 = textRecognizeFragment.getString(R.string.error_toast_app_check_failed);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                        C25206OooO0Oo.OooO0OO((ContextWrapper) context2, string2);
                        return;
                    }
                    return;
                }
                break;
            case 1457223782:
                if (str.equals("199997")) {
                    Context context3 = textRecognizeFragment.getContext();
                    if (context3 != null) {
                        String string3 = textRecognizeFragment.getString(R.string.error_toast_app_min_version);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                        C25206OooO0Oo.OooO0OO((ContextWrapper) context3, string3);
                        return;
                    }
                    return;
                }
                break;
            case 1457223783:
                if (str.equals("199998")) {
                    Context context4 = textRecognizeFragment.getContext();
                    if (context4 != null) {
                        String string4 = textRecognizeFragment.getString(R.string.error_toast_no_user);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string4, "getString(...)");
                        C25206OooO0Oo.OooO0OO((ContextWrapper) context4, string4);
                        return;
                    }
                    return;
                }
                break;
            case 1457223784:
                if (str.equals("199999")) {
                    Context context5 = textRecognizeFragment.getContext();
                    if (context5 != null) {
                        String string5 = textRecognizeFragment.getString(R.string.error_toast_network_error);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string5, "getString(...)");
                        C25206OooO0Oo.OooO0OO((ContextWrapper) context5, string5);
                        return;
                    }
                    return;
                }
                break;
            case 1563151644:
                if (str.equals("500001")) {
                    textRecognizeFragment.Oooo0o();
                    return;
                }
                break;
            case 1563151648:
                if (str.equals("500005")) {
                    textRecognizeFragment.Oooo00o(false);
                    return;
                }
                break;
            case 1563151650:
                if (str.equals("500007")) {
                    Context context6 = textRecognizeFragment.getContext();
                    if (context6 != null) {
                        String string6 = textRecognizeFragment.getString(R.string.error_toast_invalid_image);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string6, "getString(...)");
                        C25206OooO0Oo.OooO0OO((ContextWrapper) context6, string6);
                        return;
                    }
                    return;
                }
                break;
            case 1563151652:
                if (str.equals("500009")) {
                    Context context7 = textRecognizeFragment.getContext();
                    if (context7 != null) {
                        String string7 = textRecognizeFragment.getString(R.string.error_toast_safety_check);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string7, "getString(...)");
                        C25206OooO0Oo.OooO0OO((ContextWrapper) context7, string7);
                        return;
                    }
                    return;
                }
                break;
            case 1571740387:
                if (str.equals("599998")) {
                    return;
                }
                break;
        }
        Context context8 = textRecognizeFragment.getContext();
        if (context8 != null) {
            String string8 = textRecognizeFragment.getString(R.string.error_toast_unknown_error);
            kotlin.jvm.internal.OooOOO0.OooO0o(string8, "getString(...)");
            C25206OooO0Oo.OooO0OO((ContextWrapper) context8, string8);
        }
    }

    public static /* synthetic */ void Oooo0O0(TextRecognizeFragment textRecognizeFragment, int i, boolean z, int i2) {
        boolean z2 = (i2 & 2) != 0;
        if ((i2 & 4) != 0) {
            z = true;
        }
        textRecognizeFragment.Oooo0(i, z2, z);
    }

    public final void OooOooO() {
        View view = getView();
        kotlin.jvm.internal.OooOOO0.OooO0o0(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        androidx.constraintlayout.widget.OooO0OO oooO0OO = new androidx.constraintlayout.widget.OooO0OO();
        oooO0OO.OooO0o0(constraintLayout);
        ViewGroup viewGroup = this.f78180OoooO00;
        if (viewGroup == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("recordsWrapper");
            throw null;
        }
        oooO0OO.OooOO0(viewGroup.getId()).f64011OooO0OO.f64110OooO0O0 = 8;
        oooO0OO.OooO0O0(constraintLayout);
        TransitionManager.beginDelayedTransition(constraintLayout);
        View view2 = this.f78190OooooO0;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnRecords");
            throw null;
        }
        view2.setActivated(false);
        View view3 = this.f78191OooooOO;
        if (view3 != null) {
            view3.setVisibility(8);
        }
    }

    public final void OooOooo() {
        AiOcrEditorListContainer aiOcrEditorListContainer = this.f78179OoooO0;
        if (aiOcrEditorListContainer == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editorListContainer");
            throw null;
        }
        C32443OooOOO<String, Spannable> focusedEditorContent = aiOcrEditorListContainer.getFocusedEditorContent();
        if (focusedEditorContent == null) {
            return;
        }
        Oooo00O().OooOOO(focusedEditorContent.f116638OooOo0o, focusedEditorContent.f116637OooOo, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo0(int i, boolean z, boolean z2) {
        Uri uriForFile;
        C32443OooOOO c32443OooOOO = (C32443OooOOO) Oooo00O().f108501OooOOO.f121747OooOo0o.getValue();
        int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
        ((Number) c32443OooOOO.f116637OooOo).intValue();
        if (iIntValue <= 0) {
            Oooo00o(true);
            return;
        }
        Oooo00O();
        if (i == 0) {
            this.f78202o00oO0O.f78213OooOo0o = z2;
            this.f78206o0ooOO0.OooO00o(OooO0o.OooOO0O.OooO00o(C20436OooO0o0.C20437OooO0Oo.f58277OooO00o));
            return;
        }
        if (i == 1) {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("application/pdf");
            OooO0OO oooO0OO = this.f78200o00Ooo;
            oooO0OO.f78215OooOo0o = z2;
            oooO0OO.f78214OooOo = z;
            this.f78201o00o0O.OooO00o(intent);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this), new C33189Oooo00o(z2));
            return;
        }
        String strOooO0O0 = C22200OooO0o0.OooO0O0(System.currentTimeMillis(), "photo-", ".jpg");
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", strOooO0O0);
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            uriForFile = requireActivity().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        } else {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            File externalCacheDir = requireActivity().getExternalCacheDir();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(externalCacheDir);
            C31190OooO0oo.OooO0o(externalCacheDir);
            uriForFile = FileProvider.getUriForFile(contextRequireContext, C28036OooO0O0.OooO0O0(contextRequireContext), new File(externalCacheDir.getAbsolutePath(), strOooO0O0));
        }
        this.f78204o00ooo = uriForFile;
        this.f78207oo000o.f78211OooOo0o = z2;
        this.f78203o00oO0o.OooO00o(uriForFile);
    }

    public final void Oooo000() {
        Oooo0oo(true);
        View view = this.f78185OoooOo0;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnEdit");
            throw null;
        }
        view.setActivated(false);
        AiOcrEditorListContainer aiOcrEditorListContainer = this.f78179OoooO0;
        if (aiOcrEditorListContainer == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editorListContainer");
            throw null;
        }
        AiOcrRichEditor aiOcrRichEditor = aiOcrEditorListContainer.f78424OooOoO0;
        if (aiOcrRichEditor != null) {
            aiOcrRichEditor.setSelection(0);
        }
        AiOcrRichEditor aiOcrRichEditor2 = aiOcrEditorListContainer.f78424OooOoO0;
        if (aiOcrRichEditor2 != null) {
            aiOcrRichEditor2.clearFocus();
        }
        AiOcrEditorList aiOcrEditorList = aiOcrEditorListContainer.f78421OooOo;
        if (aiOcrEditorList == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editorList");
            throw null;
        }
        aiOcrEditorList.setInterceptTouchEvents(true);
        ViewGroup viewGroup = aiOcrEditorListContainer.f78425OooOoOO;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penBarContainer");
            throw null;
        }
    }

    public final C30394OooOOOO Oooo00O() {
        return (C30394OooOOOO) this.f78163OooOoo.getValue();
    }

    public final void Oooo00o(boolean z) {
        if (z) {
            Oooo0o();
            return;
        }
        if (getChildFragmentManager().OooOooo("TipsDialogFragment") != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TextRecognizeFragment");
            c20358OooO00o.OooO00o("handleAiQuotaExceeded: TipsDialogFragment is already shown", new Object[0]);
        } else {
            String string = getString(R.string.title_dialog_ai_quota_used_up);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            String string2 = getString(R.string.content_dialog_ai_quota_used_up);
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
            new TipsDialogFragment(string, string2, new ViewOnClickListenerC26311Ooooooo(), new o00000O0(this, 5), null, getString(R.string.purchase), 0, null, 384).show(getChildFragmentManager(), "TipsDialogFragment");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo0OO(Bundle bundle) {
        C32443OooOOO c32443OooOOO = (C32443OooOOO) Oooo00O().f108501OooOOO.f121747OooOo0o.getValue();
        int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
        ((Number) c32443OooOOO.f116637OooOo).intValue();
        if (iIntValue <= 0) {
            Oooo00o(true);
            return;
        }
        AiOcrSession aiOcrSession = (AiOcrSession) Oooo00O().f108506OooOOo0.f121747OooOo0o.getValue();
        if (aiOcrSession == null) {
            return;
        }
        String string = bundle.getString("input_source_id");
        AiOcrSessionInputSource inputSource = aiOcrSession.getInputSource();
        AiOcrSessionInputSource aiOcrSessionInputSource = kotlin.jvm.internal.OooOOO0.OooO0O0(inputSource.getId(), string) ? inputSource : null;
        if (aiOcrSessionInputSource == null) {
            return;
        }
        int i = bundle.getInt("page_start_index", -1);
        int i2 = bundle.getInt("page_end_index", -1);
        if (i != -1 && i2 > i) {
            InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C23718OooO0Oo(aiOcrSessionInputSource, i, i2, null), 3);
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO00o = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o, "TextRecognizeFragment", "handleInsertPageAction. Invalid page index: ", i, ", ");
            sbOooO00o.append(i2);
            c20358OooO00o.OooO0OO(sbOooO00o.toString(), new Object[0]);
        }
    }

    public final void Oooo0o() {
        C24564OooO00o c24564OooO00o = new C24564OooO00o(R.id.action_textRecognizeFragment_to_aiQuotaPayDialogFragment);
        C24572OooOO0o c24572OooOO0oOooO0OO = C21030OooOO0o.OooO0OO(this);
        C24583OooOo0o c24583OooOo0oOooO0oO = c24572OooOO0oOooO0OO.OooO0oO();
        if (c24583OooOo0oOooO0oO != null && c24583OooOo0oOooO0oO.f83302OooOooO == R.id.textRecognizeFragment) {
            C28026OooO0OO.OooO0O0(c24572OooOO0oOooO0OO, c24564OooO00o);
            return;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("TextRecognizeFragment");
        c20358OooO00o.OooO0OO("Failed to navigate to AiQuotaPayDialogFragment", new Object[0]);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new oO0Oo.OooOo(c24572OooOO0oOooO0OO, c24564OooO00o, null), 3);
    }

    public final void Oooo0o0() {
        AiOcrEditorListContainer aiOcrEditorListContainer = this.f78179OoooO0;
        if (aiOcrEditorListContainer == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editorListContainer");
            throw null;
        }
        aiOcrEditorListContainer.OooO0OO();
        C30174OooO00o c30174OooO00o = this.f78198o00O0O;
        if (c30174OooO00o != null) {
            c30174OooO00o.OooO00o();
        }
        o0o0O.OooO0OO oooO0OO = this.f78192OooooOo;
        if (oooO0OO == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("sessionItemMoreMenu");
            throw null;
        }
        oooO0OO.OooO00o();
        o0o0O.OooO0O0 oooO0O0 = this.f78193Oooooo;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o();
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("quotaUsagePopupMenu");
            throw null;
        }
    }

    public final void Oooo0oO(boolean z) {
        RunnableC23723OooO0oO runnableC23723OooO0oO = this.f78208ooOO;
        Handler handler = this.f78205o0OoOo0;
        if (runnableC23723OooO0oO != null) {
            handler.removeCallbacks(runnableC23723OooO0oO);
        }
        RunnableC23723OooO0oO runnableC23723OooO0oO2 = new RunnableC23723OooO0oO(z);
        this.f78208ooOO = runnableC23723OooO0oO2;
        handler.postDelayed(runnableC23723OooO0oO2, 100L);
    }

    public final void Oooo0oo(boolean z) {
        Spinner spinner = this.f78174Oooo0o;
        if (spinner == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("langSelector");
            throw null;
        }
        spinner.setVisibility(z ? 0 : 8);
        View view = this.f78194Oooooo0;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnQuotaUsage");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C21904OooOoo0.OooO0oO(this, "insert_page_selection", new InterfaceC32508OooOOOo() { // from class: oO0Oo.OooOOO0
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                Bundle bundle2 = (Bundle) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO((String) obj, "<unused var>");
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle2, "bundle");
                this.f120050OooOo0o.Oooo0OO(bundle2);
                return C32460OooOooO.f116667OooO00o;
            }
        });
        C21904OooOoo0.OooO0oO(this, "replace_page_selection", new InterfaceC32508OooOOOo() { // from class: oO0Oo.OooOOO
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                Bundle bundle2 = (Bundle) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO((String) obj, "<unused var>");
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle2, "bundle");
                TextRecognizeFragment textRecognizeFragment = this.f120049OooOo0o;
                AiOcrSession aiOcrSession = (AiOcrSession) textRecognizeFragment.Oooo00O().f108506OooOOo0.f121747OooOo0o.getValue();
                if (aiOcrSession == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("TextRecognizeFragment");
                    c20358OooO00o.OooO0OO("replace_page_selection failed, currentSession is null", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                if (aiOcrSession.getPageIds().isEmpty()) {
                    textRecognizeFragment.Oooo0OO(bundle2);
                } else {
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) textRecognizeFragment.Oooo00O().f108501OooOOO.f121747OooOo0o.getValue();
                    int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                    ((Number) c32443OooOOO.f116637OooOo).intValue();
                    if (iIntValue <= 0) {
                        textRecognizeFragment.Oooo00o(true);
                    } else {
                        AiOcrSession aiOcrSession2 = (AiOcrSession) textRecognizeFragment.Oooo00O().f108506OooOOo0.f121747OooOo0o.getValue();
                        if (aiOcrSession2 != null) {
                            String string = bundle2.getString("input_source_id");
                            AiOcrSessionInputSource inputSource = aiOcrSession2.getInputSource();
                            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(inputSource.getId(), string)) {
                                inputSource = null;
                            }
                            if (inputSource != null) {
                                int i = bundle2.getInt("page_start_index", -1);
                                if (i == -1) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o2.OooO0OO(C20860Ooooooo.OooO0OO(c20358OooO00o2, "TextRecognizeFragment", "Invalid page index: ", i), new Object[0]);
                                } else {
                                    int i2 = bundle2.getInt("dst_text_page_index", -1);
                                    if (i2 == -1) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o3.OooO0OO(C20860Ooooooo.OooO0OO(c20358OooO00o3, "TextRecognizeFragment", "Invalid dstTextPageIndex: ", i2), new Object[0]);
                                    } else {
                                        InterfaceC21987OooOoo viewLifecycleOwner = textRecognizeFragment.getViewLifecycleOwner();
                                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C33177OooOOoo(textRecognizeFragment, inputSource, i, i2, null), 3);
                                    }
                                }
                            }
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        C21904OooOoo0.OooO0oO(this, "import_note", new InterfaceC32508OooOOOo() { // from class: oO0Oo.OooOOOO
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                Bundle bundle2 = (Bundle) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO((String) obj, "<unused var>");
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle2, "bundle");
                String string = bundle2.getString("note_id");
                if (string == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                boolean z = bundle2.getBoolean("create_new_session", false);
                TextRecognizeFragment textRecognizeFragment = this.f120051OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = textRecognizeFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C33175OooOOo(z, textRecognizeFragment, string, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        });
        requireActivity().getSupportFragmentManager().Oooooo0("pdf_password", this, new C22734OooOOoo(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_text_recognize_aiocr_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Window window;
        super.onDestroyView();
        ActivityC21897OooOo0 activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
        this.f78205o0OoOo0.removeCallbacksAndMessages(null);
        Oooo0o0();
        C25086OooOo0O c25086OooOo0O = this.f78195OoooooO;
        if (c25086OooOo0O != null) {
            c25086OooOo0O.OooO0Oo();
        }
        OooOooo();
        C30394OooOOOO c30394OooOOOOOooo00O = Oooo00O();
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30394OooOOOOOooo00O), null, null, new o0o0OO0.OooOo(c30394OooOOOOOooo00O, C34436OooOoOO.f123455OooOo0o, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(outState, "outState");
        super.onSaveInstanceState(outState);
        Uri uri = this.f78204o00ooo;
        if (uri != null) {
            outState.putParcelable("key_take_photo_uri", uri);
            outState.putBoolean("key_create_new_session_for_camera", this.f78207oo000o.f78211OooOo0o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        ActivityC21897OooOo0 activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        this.f78166OooOooo = view.findViewById(R.id.empty_view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.home_page);
        this.f78169Oooo000 = viewGroup;
        if (viewGroup == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("homePage");
            throw null;
        }
        viewGroup.setClickable(true);
        View viewFindViewById = view.findViewById(R.id.btn_return_home);
        this.f78170Oooo00O = viewFindViewById;
        if (viewFindViewById == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnHomePage");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC29578OooO00o(this, 6));
        View viewFindViewById2 = view.findViewById(R.id.ll_import_from_camera);
        this.f78171Oooo00o = viewFindViewById2;
        if (viewFindViewById2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("homeBtnImportCamera");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new ViewOnClickListenerC29777OooO00o(this, 4));
        View viewFindViewById3 = view.findViewById(R.id.ll_import_from_gallery);
        this.f78168Oooo0 = viewFindViewById3;
        if (viewFindViewById3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("homeBtnImportGallery");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC28586o0000o0(this, 8));
        View viewFindViewById4 = view.findViewById(R.id.ll_import_from_pdf_page);
        this.f78172Oooo0O0 = viewFindViewById4;
        if (viewFindViewById4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("homeBtnImportPdfPage");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById4, 500L, new ViewOnClickListenerC28588o0000o0o(this, 4));
        View viewFindViewById5 = view.findViewById(R.id.ll_import_from_pdf);
        this.f78173Oooo0OO = viewFindViewById5;
        if (viewFindViewById5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("homeBtnImportPdf");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById5, 500L, new ViewOnClickListenerC28585o0000o(this, 4));
        View viewFindViewById6 = view.findViewById(R.id.ll_import_from_note);
        this.f78175Oooo0o0 = viewFindViewById6;
        if (viewFindViewById6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("homeBtnImportNote");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById6, 500L, new ViewOnClickListenerC28958o00oOo0o(this, 6));
        C24568OooO0oO c24568OooO0oO = this.f78164OooOoo0;
        Oooo0oO(((C33186OooOooO) c24568OooO0oO.getValue()).f120094OooO00o == null);
        Spinner spinner = (Spinner) view.findViewById(R.id.spinner_lang);
        this.f78174Oooo0o = spinner;
        if (spinner == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("langSelector");
            throw null;
        }
        spinner.setOnItemSelectedListener(new C33178OooOo0(this));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C33179OooOo0O(this, null), 3);
        View viewFindViewById7 = view.findViewById(R.id.btn_close);
        this.f78188Ooooo00 = viewFindViewById7;
        if (viewFindViewById7 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnClose");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById7, 500L, new ViewOnClickListenerC28583o0000OoO(this, 6));
        this.f78176Oooo0oO = view.findViewById(R.id.fl_loading);
        this.f78177Oooo0oo = (TextView) view.findViewById(R.id.tv_loading);
        View viewFindViewById8 = view.findViewById(R.id.btn_cancel_ocr);
        this.f78167Oooo = viewFindViewById8;
        if (viewFindViewById8 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnCancelOcr");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById8, 500L, new ViewOnClickListenerC28603OooO00o(this, 8));
        this.f78180OoooO00 = (ViewGroup) view.findViewById(R.id.fl_sessions_wrapper);
        this.f78197o000oOoO = (ViewGroup) view.findViewById(R.id.cl_op_bar_wrapper);
        View viewFindViewById9 = view.findViewById(R.id.btn_copy);
        this.f78183OoooOOO = viewFindViewById9;
        if (viewFindViewById9 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnCopy");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById9, 500L, new ViewOnClickListenerC28989OooO00o(this, 6));
        View viewFindViewById10 = view.findViewById(R.id.btn_retry);
        this.f78184OoooOOo = viewFindViewById10;
        if (viewFindViewById10 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnRetry");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById10, 500L, new ViewOnClickListenerC28407OooO00o(this, 7));
        View viewFindViewById11 = view.findViewById(R.id.btn_edit);
        this.f78185OoooOo0 = viewFindViewById11;
        if (viewFindViewById11 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnEdit");
            throw null;
        }
        viewFindViewById11.setActivated(false);
        View view2 = this.f78185OoooOo0;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnEdit");
            throw null;
        }
        C28050OooO0OO.OooO00o(view2, 500L, new ViewOnClickListenerC28408OooO0O0(this, 9));
        View viewFindViewById12 = view.findViewById(R.id.btn_export);
        this.f78189Ooooo0o = viewFindViewById12;
        if (viewFindViewById12 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnExport");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById12, 500L, new ViewOnClickListenerC28609OooO0oO(this, 4));
        View viewFindViewById13 = view.findViewById(R.id.btn_records);
        this.f78190OooooO0 = viewFindViewById13;
        if (viewFindViewById13 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnRecords");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById13, 500L, new ViewOnClickListenerC28610OooO0oo(this, 7));
        TextView textView = (TextView) view.findViewById(R.id.btn_continue_conversion);
        this.f78186OoooOoO = textView;
        if (textView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinuePage");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView, 500L, new ViewOnClickListenerC28413OooO0oO(this, 8));
        TextView textView2 = (TextView) view.findViewById(R.id.btn_append_new_doc);
        this.f78187OoooOoo = textView2;
        if (textView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnChangeInputSource");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView2, 500L, new ViewOnClickListenerC26210OooO00o(this, 8));
        View view3 = this.f78183OoooOOO;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnCopy");
            throw null;
        }
        view3.setEnabled(false);
        View view4 = this.f78185OoooOo0;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnEdit");
            throw null;
        }
        view4.setEnabled(false);
        View view5 = this.f78189Ooooo0o;
        if (view5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnExport");
            throw null;
        }
        view5.setEnabled(false);
        View view6 = this.f78184OoooOOo;
        if (view6 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnRetry");
            throw null;
        }
        view6.setEnabled(false);
        final AiOcrEditorListContainer aiOcrEditorListContainer = (AiOcrEditorListContainer) view.findViewById(R.id.cl_editor_wrapper);
        this.f78179OoooO0 = aiOcrEditorListContainer;
        if (aiOcrEditorListContainer == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editorListContainer");
            throw null;
        }
        final C30394OooOOOO c30394OooOOOOOooo00O = Oooo00O();
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        final androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner2);
        aiOcrEditorListContainer.f78422OooOo0o = c30394OooOOOOOooo00O;
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.card_pen_bar_container);
        aiOcrEditorListContainer.f78425OooOoOO = viewGroup2;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penBarContainer");
            throw null;
        }
        viewGroup2.setVisibility(8);
        aiOcrEditorListContainer.f78421OooOo = (AiOcrEditorList) view.findViewById(R.id.rv_editor_wrapper);
        View viewFindViewById14 = view.findViewById(R.id.btn_text_style_menu);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById14);
        C28050OooO0OO.OooO00o(viewFindViewById14, 500L, new ViewOnClickListenerC28369o00000oO(1, aiOcrEditorListContainer, viewFindViewById14));
        aiOcrEditorListContainer.f78427OooOoo0 = viewFindViewById14;
        aiOcrEditorListContainer.f78426OooOoo = (ImageView) view.findViewById(R.id.tv_text_align);
        View viewFindViewById15 = view.findViewById(R.id.btn_text_align_menu);
        if (viewFindViewById15 != null) {
            C28050OooO0OO.OooO00o(viewFindViewById15, 500L, new ViewOnClickListenerC28412OooO0o0(1, aiOcrEditorListContainer, viewFindViewById15));
        } else {
            viewFindViewById15 = null;
        }
        aiOcrEditorListContainer.f78428OooOooO = viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.btn_text_bold);
        aiOcrEditorListContainer.f78429OooOooo = viewFindViewById16;
        if (viewFindViewById16 != null) {
            viewFindViewById16.setOnClickListener(new ViewOnClickListenerC28610OooO0oo(aiOcrEditorListContainer, 4));
        }
        View viewFindViewById17 = view.findViewById(R.id.btn_text_italic);
        aiOcrEditorListContainer.f78432Oooo000 = viewFindViewById17;
        if (viewFindViewById17 != null) {
            viewFindViewById17.setOnClickListener(new ViewOnClickListenerC28413OooO0oO(aiOcrEditorListContainer, 5));
        }
        View viewFindViewById18 = view.findViewById(R.id.btn_text_underline);
        aiOcrEditorListContainer.f78433Oooo00O = viewFindViewById18;
        if (viewFindViewById18 != null) {
            viewFindViewById18.setOnClickListener(new ViewOnClickListenerC26210OooO00o(aiOcrEditorListContainer, 5));
        }
        View viewFindViewById19 = view.findViewById(R.id.btn_text_strikethrough);
        aiOcrEditorListContainer.f78434Oooo00o = viewFindViewById19;
        if (viewFindViewById19 != null) {
            viewFindViewById19.setOnClickListener(new ViewOnClickListenerC28136OooO0O0(aiOcrEditorListContainer, 5));
        }
        View viewFindViewById20 = view.findViewById(R.id.btn_text_image);
        aiOcrEditorListContainer.f78431Oooo0 = viewFindViewById20;
        if (viewFindViewById20 != null) {
            viewFindViewById20.setOnClickListener(new ViewOnClickListenerC28137OooO0OO(aiOcrEditorListContainer, 4));
        }
        View viewFindViewById21 = view.findViewById(R.id.btn_text_link);
        aiOcrEditorListContainer.f78435Oooo0O0 = viewFindViewById21;
        if (viewFindViewById21 != null) {
            viewFindViewById21.setOnClickListener(new ViewOnClickListenerC28586o0000o0(aiOcrEditorListContainer, 5));
        }
        aiOcrEditorListContainer.f78438Oooo0o0 = (TextView) view.findViewById(R.id.tv_text_color);
        final View viewFindViewById22 = view.findViewById(R.id.btn_text_color_menu);
        if (viewFindViewById22 != null) {
            C28050OooO0OO.OooO00o(viewFindViewById22, 500L, new View.OnClickListener() { // from class: o0o0OoO0.OooO00o
                /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view7) {
                    boolean z;
                    AiOcrEditorListContainer aiOcrEditorListContainer2 = aiOcrEditorListContainer;
                    View view8 = viewFindViewById22;
                    AiOcrEditorListContainer.OooO00o oooO00o = aiOcrEditorListContainer2.eventListener;
                    if (oooO00o != null) {
                        oooO00o.OooO00o();
                    }
                    if (aiOcrEditorListContainer2.f78444OoooO0O == null) {
                        ViewOnClickListenerC28958o00oOo0o viewOnClickListenerC28958o00oOo0o = new ViewOnClickListenerC28958o00oOo0o(aiOcrEditorListContainer2, 4);
                        Context context = aiOcrEditorListContainer2.getContext();
                        OooOOO0.OooO0o(context, "getContext(...)");
                        C30177OooO0oO c30177OooO0oO = new C30177OooO0oO(context, viewOnClickListenerC28958o00oOo0o);
                        aiOcrEditorListContainer2.f78444OoooO0O = c30177OooO0oO;
                        c30177OooO0oO.f107428OooO0Oo = new C30673OooO0O0(aiOcrEditorListContainer2);
                        C30394OooOOOO c30394OooOOOO = aiOcrEditorListContainer2.f78422OooOo0o;
                        if (c30394OooOOOO == null) {
                            OooOOO0.OooOOOO("viewModel");
                            throw null;
                        }
                        c30177OooO0oO.OooO0OO((Map) c30394OooOOOO.f108520Oooo0.getValue());
                    }
                    C30177OooO0oO c30177OooO0oO2 = aiOcrEditorListContainer2.f78444OoooO0O;
                    if (c30177OooO0oO2 == null) {
                        z = false;
                    } else {
                        PopupWindow popupWindow = c30177OooO0oO2.f107427OooO0OO;
                        if (popupWindow == null ? false : popupWindow.isShowing()) {
                            z = true;
                        }
                    }
                    if (z) {
                        C30177OooO0oO c30177OooO0oO3 = aiOcrEditorListContainer2.f78444OoooO0O;
                        if (c30177OooO0oO3 != null) {
                            c30177OooO0oO3.OooO00o();
                            return;
                        }
                        return;
                    }
                    aiOcrEditorListContainer2.OooO0OO();
                    TextView textView3 = aiOcrEditorListContainer2.f78438Oooo0o0;
                    if (textView3 == null) {
                        return;
                    }
                    C30177OooO0oO c30177OooO0oO4 = aiOcrEditorListContainer2.f78444OoooO0O;
                    if (c30177OooO0oO4 != null) {
                        synchronized (c30177OooO0oO4) {
                            try {
                                if (c30177OooO0oO4.f107431OooO0oO.compareAndSet(false, true)) {
                                    c30177OooO0oO4.OooO0O0();
                                }
                                Rect rect = new Rect();
                                textView3.getGlobalVisibleRect(rect);
                                PopupWindow popupWindow2 = c30177OooO0oO4.f107427OooO0OO;
                                if (popupWindow2 == null) {
                                    OooOOO0.OooOOOO("popupWindow");
                                    throw null;
                                }
                                popupWindow2.showAtLocation(textView3, 0, rect.left, rect.bottom + o000000O.OooO0o(10));
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    view8.setActivated(true);
                }
            });
        } else {
            viewFindViewById22 = null;
        }
        aiOcrEditorListContainer.f78436Oooo0OO = viewFindViewById22;
        View viewFindViewById23 = view.findViewById(R.id.btn_text_copy);
        aiOcrEditorListContainer.f78437Oooo0o = viewFindViewById23;
        if (viewFindViewById23 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnTextCopy");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById23, 500L, new ViewOnClickListenerC28585o0000o(aiOcrEditorListContainer, 2));
        View viewFindViewById24 = view.findViewById(R.id.btn_text_cut);
        aiOcrEditorListContainer.f78439Oooo0oO = viewFindViewById24;
        if (viewFindViewById24 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnTextCut");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById24, 500L, new ViewOnClickListenerC28989OooO00o(aiOcrEditorListContainer, 4));
        View viewFindViewById25 = view.findViewById(R.id.btn_text_paste);
        aiOcrEditorListContainer.f78440Oooo0oo = viewFindViewById25;
        if (viewFindViewById25 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnTextPaste");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById25, 500L, new ViewOnClickListenerC28407OooO00o(aiOcrEditorListContainer, 4));
        C33609OooO0oo.OooO0OO(oooOoOooO00o, null, null, new C30676OooO0o(c30394OooOOOOOooo00O, aiOcrEditorListContainer, null), 3);
        aiOcrEditorListContainer.f78430Oooo = ((TextRecognizeFragment) C21929Ooooo0o.OooO0Oo(aiOcrEditorListContainer)).registerForActivityResult(new C20436OooO0o0(), new OooO0o.OooO00o() { // from class: o0o0OoO0.OooO0o0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // OooO0o.OooO00o
            public final void OooO0O0(Object obj) {
                Uri uri = (Uri) obj;
                int i = AiOcrEditorListContainer.f78420OoooOOO;
                if (uri == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("addMediaIntoPageLauncher");
                    c20358OooO00o.OooO0o0("No media selected", new Object[0]);
                    return;
                }
                C30394OooOOOO c30394OooOOOO = c30394OooOOOOOooo00O;
                AiOcrSession aiOcrSession = (AiOcrSession) c30394OooOOOO.f108506OooOOo0.f121747OooOo0o.getValue();
                if (aiOcrSession == null) {
                    return;
                }
                AiOcrEditorListContainer aiOcrEditorListContainer2 = aiOcrEditorListContainer;
                aiOcrEditorListContainer2.getContext().getContentResolver().takePersistableUriPermission(uri, 1);
                C33609OooO0oo.OooO0OO(oooOoOooO00o, null, null, new C30678OooO0oO(c30394OooOOOO, aiOcrSession, uri, aiOcrEditorListContainer2, null), 3);
            }
        });
        AiOcrEditorListContainer aiOcrEditorListContainer2 = this.f78179OoooO0;
        if (aiOcrEditorListContainer2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editorListContainer");
            throw null;
        }
        aiOcrEditorListContainer2.setEventListener(new OooOo00(this));
        oO0OO.OooO00o oooO00o = new oO0OO.OooO00o(OooO00o.C20261OooO00o.f117985OooO00o);
        this.f78178OoooO = oooO00o;
        oooO00o.f117984OooO0O0 = new C25275OooO0O0(this);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_editor_wrapper);
        this.f78181OoooO0O = recyclerView;
        if (recyclerView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editorList");
            throw null;
        }
        oO0OO.OooO00o oooO00o2 = this.f78178OoooO;
        if (oooO00o2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("adapter");
            throw null;
        }
        recyclerView.setAdapter(oooO00o2);
        ViewOnClickListenerC28591o0000oOO viewOnClickListenerC28591o0000oOO = new ViewOnClickListenerC28591o0000oOO(this, 5);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        this.f78193Oooooo = new o0o0O.OooO0O0(contextRequireContext, viewOnClickListenerC28591o0000oOO, false);
        View viewFindViewById26 = view.findViewById(R.id.btn_quota_usage);
        this.f78194Oooooo0 = viewFindViewById26;
        if (viewFindViewById26 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnQuotaUsage");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById26, 500L, new ViewOnClickListenerC30181OooO0o0(this, 3));
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
        this.f78192OooooOo = new o0o0O.OooO0OO(contextRequireContext2, new o000OOo(this, 4));
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.rv_sessions);
        if (recyclerView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rvSessions");
            throw null;
        }
        oO0OO.OooO oooO = this.f78182OoooOO0;
        recyclerView2.setAdapter(oooO);
        oooO.f117979OooO0O0 = new ViewOnClickListenerC29543o000O0o0(this, 3);
        View viewFindViewById27 = view.findViewById(R.id.v_click_mask);
        this.f78191OooooOO = viewFindViewById27;
        if (viewFindViewById27 != null) {
            viewFindViewById27.setOnClickListener(new o0Oo0oOo.o000000O(this, 5));
        }
        ((CustomConstraintLayout) view).setDispatchEventListener(new C23722OooO0o0());
        this.f78195OoooooO = C30847OooO0Oo.OooO00o(requireActivity(), this.f78199o00Oo0);
        InterfaceC21987OooOoo viewLifecycleOwner3 = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new OooO0o(null), 3);
        OooOooO();
        Oooo000();
        Oooo0oo(true);
        if (bundle != null && bundle.containsKey("key_take_photo_uri") && this.f78204o00ooo == null) {
            Uri uri = (Uri) bundle.getParcelable("key_take_photo_uri");
            if (uri != null) {
                boolean z = bundle.getBoolean("key_create_new_session_for_camera", true);
                OooO00o oooO00o3 = this.f78207oo000o;
                oooO00o3.f78211OooOo0o = z;
                TextRecognizeFragment textRecognizeFragment = TextRecognizeFragment.this;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String) textRecognizeFragment.Oooo00O().f108513OooOoO.f121747OooOo0o.getValue(), Locale.getDefault());
                InterfaceC21987OooOoo viewLifecycleOwner4 = textRecognizeFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner4), null, null, new com.orion.notein.p607ui.ocr.OooO0O0(oooO00o3, textRecognizeFragment, simpleDateFormat, uri, null), 3);
            }
        } else {
            String str = ((C33186OooOooO) c24568OooO0oO.getValue()).f120094OooO00o;
            if (str != null) {
                InterfaceC21987OooOoo viewLifecycleOwner5 = getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner5), null, null, new C33185OooOoo0(this, str, null), 3);
            }
        }
        View view7 = this.f78166OooOooo;
        if (view7 != null) {
            view7.setVisibility(8);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("emptyView");
            throw null;
        }
    }
}
