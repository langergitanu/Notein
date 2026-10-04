package o0o0O00;

import OooO0oO.C20433OooO0OO;
import OooO0oO.C20436OooO0o0;
import OooO0oO.C20440OooOO0;
import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.aspose.words.StyleIdentifier;
import com.google.android.material.search.C22478OooOOOo;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.widget.EdgeFragment;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0Oo00o.C28026OooO0OO;
import o0o00oOo.C30059Oooo0o0;
import o0o0O00.C30207OooOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o0O00.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C30191OooO0oO implements C30207OooOo.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EdgeFragment f107500OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final com.orion.notein.p607ui.notelist.OooO0OO f107501OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0o.OooO0O0<OooO0o.OooOO0> f107502OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0o.OooO0O0<Uri> f107503OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Uri f107504OooO0o0;

    /* JADX INFO: renamed from: o0o0O00.OooO0oO$OooO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultFABActionListener$onMenuItemImportFromCameraClicked$1", m80623f = "DefaultFABActionListener.kt", m80624l = {StyleIdentifier.GRID_TABLE_2_ACCENT_2}, m80625m = "invokeSuspend")
    public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107506OooOo0o;

        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30191OooO0oO.this.new OooO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Uri uriForFile;
            OooO0o.OooO0O0<Uri> oooO0O0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107506OooOo0o;
            C30191OooO0oO c30191OooO0oO = C30191OooO0oO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f107506OooOo0o = 1;
                obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 37, this);
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
            String strOooO0O0 = C20593OooO0Oo.OooO0O0("photo-", new SimpleDateFormat("YYMMDDhhmmss").format(new Long(System.currentTimeMillis())), ".jpg");
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = c30191OooO0oO.f107500OooO00o.requireActivity();
            kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
            String packageName = activityC21897OooOo0RequireActivity.getPackageName();
            int i2 = Build.VERSION.SDK_INT;
            EdgeFragment edgeFragment = c30191OooO0oO.f107500OooO00o;
            if (i2 >= 29) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", strOooO0O0);
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                ActivityC21897OooOo0 activityC21897OooOo0RequireActivity2 = edgeFragment.requireActivity();
                kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity2, "requireActivity(...)");
                uriForFile = activityC21897OooOo0RequireActivity2.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            } else {
                Context contextRequireContext = edgeFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                ActivityC21897OooOo0 activityC21897OooOo0RequireActivity3 = edgeFragment.requireActivity();
                kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity3, "requireActivity(...)");
                File externalCacheDir = activityC21897OooOo0RequireActivity3.getExternalCacheDir();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(externalCacheDir);
                uriForFile = FileProvider.getUriForFile(contextRequireContext, packageName + ".fileProvider", new File(externalCacheDir.getAbsolutePath(), strOooO0O0));
            }
            c30191OooO0oO.f107504OooO0o0 = uriForFile;
            if (uriForFile != null && (oooO0O0 = c30191OooO0oO.f107503OooO0Oo) != null) {
                oooO0O0.OooO00o(uriForFile);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o0O00.OooO0oO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultFABActionListener$initCameraLauncher$1$1", m80623f = "DefaultFABActionListener.kt", m80624l = {72}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107508OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Uri f107509OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Uri uri, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f107509OooOoO0 = uri;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30191OooO0oO.this.new OooO00o(this.f107509OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107508OooOo0o;
            C30191OooO0oO c30191OooO0oO = C30191OooO0oO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f107508OooOo0o = 1;
                obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 37, this);
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
                c30191OooO0oO.f107501OooO0O0.OooOOOo(com.facebook.soloader.OooOo.OooO0oO(this.f107509OooOoO0));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o0O00.OooO0oO$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultFABActionListener$initMultiplePictureLauncher$1$1", m80623f = "DefaultFABActionListener.kt", m80624l = {84}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107511OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ List<Uri> f107512OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(List<Uri> list, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f107512OooOoO0 = list;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30191OooO0oO.this.new OooO0O0(this.f107512OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107511OooOo0o;
            C30191OooO0oO c30191OooO0oO = C30191OooO0oO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f107511OooOo0o = 1;
                obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 37, this);
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
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = c30191OooO0oO.f107501OooO0O0;
                List<Uri> list = this.f107512OooOoO0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(list);
                oooO0OO.OooOOOo(list);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o0O00.OooO0oO$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultFABActionListener$onFABCreateScratchClicked$1", m80623f = "DefaultFABActionListener.kt", m80624l = {98, 104, 109}, m80625m = "invokeSuspend")
    public final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107514OooOo0o;

        /* JADX INFO: renamed from: o0o0O00.OooO0oO$OooO0OO$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultFABActionListener$onFABCreateScratchClicked$1$1", m80623f = "DefaultFABActionListener.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C30191OooO0oO f107515OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ String f107516OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(String str, C30191OooO0oO c30191OooO0oO, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f107516OooOo0o = str;
                this.f107515OooOo = c30191OooO0oO;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f107516OooOo0o, this.f107515OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(this.f107515OooOo.f107500OooO00o), R.id.noteEditorContainerFragment, BundleKt.bundleOf(new C32443OooOOO(NoteMeta.PROPERTY_NOTE_ID, this.f107516OooOo0o)));
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30191OooO0oO.this.new OooO0OO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
        
            if (oO0o0OO.C33609OooO0oo.OooO0o(r1, r4, r7) != r0) goto L25;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107514OooOo0o;
            C30191OooO0oO c30191OooO0oO = C30191OooO0oO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f107514OooOo0o = 1;
                obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 37, this);
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
                OooO00o oooO00o = new OooO00o((String) obj, c30191OooO0oO, null);
                this.f107514OooOo0o = 3;
            }
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = c30191OooO0oO.f107501OooO0O0;
            String string = c30191OooO0oO.f107500OooO00o.requireContext().getString(R.string.note_title_scratch);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            this.f107514OooOo0o = 2;
            oooO0OO.getClass();
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30059Oooo0o0(oooO0OO, string, null), this);
            if (obj != enumC32485OooO00o) {
                C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                AbstractC33687OooO0oO abstractC33687OooO0oO2 = C33833OooOOOO.f121946OooO00o;
                OooO00o oooO00o2 = new OooO00o((String) obj, c30191OooO0oO, null);
                this.f107514OooOo0o = 3;
            }
            return enumC32485OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o0O00.OooO0oO$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultFABActionListener$onMenuItemCreateNoteClicked$1", m80623f = "DefaultFABActionListener.kt", m80624l = {118}, m80625m = "invokeSuspend")
    public static final class C30192OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107518OooOo0o;

        public C30192OooO0Oo(Continuation<? super C30192OooO0Oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30191OooO0oO.this.new C30192OooO0Oo(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C30192OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107518OooOo0o;
            C30191OooO0oO c30191OooO0oO = C30191OooO0oO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f107518OooOo0o = 1;
                obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 37, this);
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
                NoteVO noteVO = (NoteVO) ((C32443OooOOO) c30191OooO0oO.f107501OooO0O0.f77161OoooO00.getValue()).f116638OooOo0o;
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(c30191OooO0oO.f107500OooO00o), R.id.paperConfigDialogFragment, BundleKt.bundleOf(new C32443OooOOO("strategyType", "CREATE_NOTE"), new C32443OooOOO(Folder.PROPERTY_FOLDER_ID, noteVO != null ? noteVO.getId() : null)));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o0O00.OooO0oO$OooO0o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultFABActionListener$onMenuItemImportCajClicked$1", m80623f = "DefaultFABActionListener.kt", m80624l = {StyleIdentifier.MEDIUM_LIST_1_ACCENT_6, StyleIdentifier.MEDIUM_GRID_2_ACCENT_6}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107520OooOo0o;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30191OooO0oO.this.new OooO0o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        
            if (r7 == r0) goto L19;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107520OooOo0o;
            C30191OooO0oO c30191OooO0oO = C30191OooO0oO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f107520OooOo0o = 1;
                obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 37, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    NoteVO noteVO = (NoteVO) ((C32443OooOOO) c30191OooO0oO.f107501OooO0O0.f77161OoooO00.getValue()).f116638OooOo0o;
                    C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(c30191OooO0oO.f107500OooO00o), R.id.importBatchPdfDialogFragment, BundleKt.bundleOf(new C32443OooOOO("key", "import_batch_pdf"), new C32443OooOOO(Folder.PROPERTY_FOLDER_ID, noteVO != null ? noteVO.getId() : null), new C32443OooOOO("multi_select", new Integer(0)), new C32443OooOOO("extensions", new Integer(4))));
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f107520OooOo0o = 2;
            obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 32, this);
        }
    }

    /* JADX INFO: renamed from: o0o0O00.OooO0oO$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultFABActionListener$onMenuItemCreateUnboundedNoteClicked$1", m80623f = "DefaultFABActionListener.kt", m80624l = {133, 136}, m80625m = "invokeSuspend")
    public static final class C30193OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107522OooOo0o;

        public C30193OooO0o0(Continuation<? super C30193OooO0o0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30191OooO0oO.this.new C30193OooO0o0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C30193OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        
            if (r6 == r0) goto L19;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107522OooOo0o;
            C30191OooO0oO c30191OooO0oO = C30191OooO0oO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f107522OooOo0o = 1;
                obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 37, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    NoteVO noteVO = (NoteVO) ((C32443OooOOO) c30191OooO0oO.f107501OooO0O0.f77161OoooO00.getValue()).f116638OooOo0o;
                    C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(c30191OooO0oO.f107500OooO00o), R.id.paperConfigDialogFragment, BundleKt.bundleOf(new C32443OooOOO("strategyType", "CREATE_NOTE"), new C32443OooOOO(Folder.PROPERTY_FOLDER_ID, noteVO != null ? noteVO.getId() : null), new C32443OooOOO("unbounded", Boolean.TRUE)));
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f107522OooOo0o = 2;
            obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 12, this);
        }
    }

    /* JADX INFO: renamed from: o0o0O00.OooO0oO$OooO0oO, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultFABActionListener$onMenuItemImportDocClicked$1", m80623f = "DefaultFABActionListener.kt", m80624l = {168, 171}, m80625m = "invokeSuspend")
    public static final class C20049OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107524OooOo0o;

        public C20049OooO0oO(Continuation<? super C20049OooO0oO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30191OooO0oO.this.new C20049OooO0oO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C20049OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        
            if (r7 == r0) goto L19;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107524OooOo0o;
            C30191OooO0oO c30191OooO0oO = C30191OooO0oO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f107524OooOo0o = 1;
                obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 37, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    NoteVO noteVO = (NoteVO) ((C32443OooOOO) c30191OooO0oO.f107501OooO0O0.f77161OoooO00.getValue()).f116638OooOo0o;
                    C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(c30191OooO0oO.f107500OooO00o), R.id.importBatchPdfDialogFragment, BundleKt.bundleOf(new C32443OooOOO("key", "import_batch_pdf"), new C32443OooOOO(Folder.PROPERTY_FOLDER_ID, noteVO != null ? noteVO.getId() : null), new C32443OooOOO("multi_select", new Integer(0)), new C32443OooOOO("extensions", new Integer(2))));
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f107524OooOo0o = 2;
            obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 17, this);
        }
    }

    /* JADX INFO: renamed from: o0o0O00.OooO0oO$OooO0oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultFABActionListener$onMenuItemImportEpubClicked$1", m80623f = "DefaultFABActionListener.kt", m80624l = {231, 234}, m80625m = "invokeSuspend")
    public static final class C30194OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107526OooOo0o;

        public C30194OooO0oo(Continuation<? super C30194OooO0oo> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30191OooO0oO.this.new C30194OooO0oo(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C30194OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        
            if (r7 == r0) goto L19;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107526OooOo0o;
            C30191OooO0oO c30191OooO0oO = C30191OooO0oO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f107526OooOo0o = 1;
                obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 37, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    NoteVO noteVO = (NoteVO) ((C32443OooOOO) c30191OooO0oO.f107501OooO0O0.f77161OoooO00.getValue()).f116638OooOo0o;
                    C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(c30191OooO0oO.f107500OooO00o), R.id.importBatchPdfDialogFragment, BundleKt.bundleOf(new C32443OooOOO("key", "import_batch_pdf"), new C32443OooOOO(Folder.PROPERTY_FOLDER_ID, noteVO != null ? noteVO.getId() : null), new C32443OooOOO("multi_select", new Integer(0)), new C32443OooOOO("extensions", new Integer(3))));
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f107526OooOo0o = 2;
            obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 17, this);
        }
    }

    /* JADX INFO: renamed from: o0o0O00.OooO0oO$OooOO0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultFABActionListener$onMenuItemImportImgClicked$1", m80623f = "DefaultFABActionListener.kt", m80624l = {StyleIdentifier.PLAIN_TABLE_5, StyleIdentifier.GRID_TABLE_2}, m80625m = "invokeSuspend")
    public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107528OooOo0o;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30191OooO0oO.this.new OooOO0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            if (r7 == r0) goto L19;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            OooO0o.OooO0O0<OooO0o.OooOO0> oooO0O0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107528OooOo0o;
            C30191OooO0oO c30191OooO0oO = C30191OooO0oO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f107528OooOo0o = 1;
                obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 37, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                if (!((Boolean) obj).booleanValue() && (oooO0O0 = c30191OooO0oO.f107502OooO0OO) != null) {
                    oooO0O0.OooO00o(OooO0o.OooOO0O.OooO00o(new C20436OooO0o0.C18959OooO0o0()));
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f107528OooOo0o = 2;
            obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 37, this);
        }
    }

    /* JADX INFO: renamed from: o0o0O00.OooO0oO$OooOO0O */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultFABActionListener$onMenuItemImportPdfClicked$1", m80623f = "DefaultFABActionListener.kt", m80624l = {151}, m80625m = "invokeSuspend")
    public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107530OooOo0o;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30191OooO0oO.this.new OooOO0O(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107530OooOo0o;
            C30191OooO0oO c30191OooO0oO = C30191OooO0oO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f107530OooOo0o = 1;
                obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 37, this);
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
                NoteVO noteVO = (NoteVO) ((C32443OooOOO) c30191OooO0oO.f107501OooO0O0.f77161OoooO00.getValue()).f116638OooOo0o;
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(c30191OooO0oO.f107500OooO00o), R.id.importBatchPdfDialogFragment, BundleKt.bundleOf(new C32443OooOOO("key", "import_batch_pdf"), new C32443OooOOO(Folder.PROPERTY_FOLDER_ID, noteVO != null ? noteVO.getId() : null), new C32443OooOOO("multi_select", new Integer(0)), new C32443OooOOO("extensions", new Integer(0))));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o0O00.OooO0oO$OooOO0o, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultFABActionListener$onMenuItemImportPptClicked$1", m80623f = "DefaultFABActionListener.kt", m80624l = {188, 191}, m80625m = "invokeSuspend")
    public static final class C30195OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107532OooOo0o;

        public C30195OooOO0o(Continuation<? super C30195OooOO0o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30191OooO0oO.this.new C30195OooOO0o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C30195OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        
            if (r7 == r0) goto L19;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107532OooOo0o;
            C30191OooO0oO c30191OooO0oO = C30191OooO0oO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f107532OooOo0o = 1;
                obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 37, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    NoteVO noteVO = (NoteVO) ((C32443OooOOO) c30191OooO0oO.f107501OooO0O0.f77161OoooO00.getValue()).f116638OooOo0o;
                    C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(c30191OooO0oO.f107500OooO00o), R.id.importBatchPdfDialogFragment, BundleKt.bundleOf(new C32443OooOOO("key", "import_batch_pdf"), new C32443OooOOO(Folder.PROPERTY_FOLDER_ID, noteVO != null ? noteVO.getId() : null), new C32443OooOOO("multi_select", new Integer(0)), new C32443OooOOO("extensions", new Integer(1))));
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f107532OooOo0o = 2;
            obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 17, this);
        }
    }

    /* JADX INFO: renamed from: o0o0O00.OooO0oO$OooOOO0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.initializer.DefaultFABActionListener$onMenuItemImportXlsClicked$1", m80623f = "DefaultFABActionListener.kt", m80624l = {208, 211}, m80625m = "invokeSuspend")
    public static final class OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f107534OooOo0o;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30191OooO0oO.this.new OooOOO0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        
            if (r7 == r0) goto L19;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f107534OooOo0o;
            C30191OooO0oO c30191OooO0oO = C30191OooO0oO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f107534OooOo0o = 1;
                obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 37, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                if (!((Boolean) obj).booleanValue()) {
                    NoteVO noteVO = (NoteVO) ((C32443OooOOO) c30191OooO0oO.f107501OooO0O0.f77161OoooO00.getValue()).f116638OooOo0o;
                    C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(c30191OooO0oO.f107500OooO00o), R.id.importBatchPdfDialogFragment, BundleKt.bundleOf(new C32443OooOOO("key", "import_batch_pdf"), new C32443OooOOO(Folder.PROPERTY_FOLDER_ID, noteVO != null ? noteVO.getId() : null), new C32443OooOOO("multi_select", new Integer(0)), new C32443OooOOO("extensions", new Integer(5))));
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f107534OooOo0o = 2;
            obj = C30191OooO0oO.OooOOO0(c30191OooO0oO, 17, this);
        }
    }

    public C30191OooO0oO(EdgeFragment edgeFragment, com.orion.notein.p607ui.notelist.OooO0OO noteListViewModel) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteListViewModel, "noteListViewModel");
        this.f107500OooO00o = edgeFragment;
        this.f107501OooO0O0 = noteListViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOOO0(C30191OooO0oO c30191OooO0oO, int i, Continuation continuation) {
        C30196OooO0oo c30196OooO0oo;
        boolean zBooleanValue;
        c30191OooO0oO.getClass();
        if (continuation instanceof C30196OooO0oo) {
            c30196OooO0oo = (C30196OooO0oo) continuation;
            int i2 = c30196OooO0oo.f107537OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c30196OooO0oo.f107537OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c30196OooO0oo = new C30196OooO0oo(c30191OooO0oO, continuation);
            }
        }
        C30196OooO0oo c30196OooO0oo2 = c30196OooO0oo;
        Object objShowNonVipFeatureLimitedDialog$default = c30196OooO0oo2.f107536OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c30196OooO0oo2.f107537OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objShowNonVipFeatureLimitedDialog$default);
            ActivityC21897OooOo0 activity = c30191OooO0oO.f107500OooO00o.getActivity();
            MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
            if (mainActivity == null) {
                zBooleanValue = false;
                return Boolean.valueOf(zBooleanValue);
            }
            c30196OooO0oo2.f107537OooOoO0 = 1;
            objShowNonVipFeatureLimitedDialog$default = MainActivity.showNonVipFeatureLimitedDialog$default(mainActivity, i, 0, null, c30196OooO0oo2, 6, null);
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

    @Override // o0o0O00.C30207OooOo.OooO00o
    public final void OooO() {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(OooOOO()), null, null, new C20049OooO0oO(null), 3);
    }

    @Override // o0o0O00.C30207OooOo.OooO00o
    public void OooO00o() {
    }

    @Override // o0o0O00.C30207OooOo.OooO00o
    public final void OooO0O0() {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(OooOOO()), null, null, new OooOOO0(null), 3);
    }

    @Override // o0o0O00.C30207OooOo.OooO00o
    public final void OooO0OO() {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(OooOOO()), null, null, new C30195OooOO0o(null), 3);
    }

    @Override // o0o0O00.C30207OooOo.OooO00o
    public final void OooO0Oo() {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(OooOOO()), null, null, new C30193OooO0o0(null), 3);
    }

    @Override // o0o0O00.C30207OooOo.OooO00o
    public final void OooO0o() {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(OooOOO()), null, null, new C30194OooO0oo(null), 3);
    }

    @Override // o0o0O00.C30207OooOo.OooO00o
    public final void OooO0o0() {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(OooOOO()), null, null, new C30192OooO0Oo(null), 3);
    }

    @Override // o0o0O00.C30207OooOo.OooO00o
    public final void OooO0oO() {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(OooOOO()), null, null, new OooOO0O(null), 3);
    }

    @Override // o0o0O00.C30207OooOo.OooO00o
    public final void OooO0oo() {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(OooOOO()), null, null, new OooO0o(null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0o0O00.C30207OooOo.OooO00o
    public final void OooOO0() {
        NoteVO noteVO = (NoteVO) ((C32443OooOOO) this.f107501OooO0O0.f77161OoooO00.getValue()).f116638OooOo0o;
        C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(this.f107500OooO00o), R.id.folderCreationDialogFragment, BundleKt.bundleOf(new C32443OooOOO(Folder.PROPERTY_FOLDER_ID, noteVO != null ? noteVO.getId() : null)));
    }

    @Override // o0o0O00.C30207OooOo.OooO00o
    public final void OooOO0O() {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(OooOOO()), null, null, new OooO(null), 3);
    }

    @Override // o0o0O00.C30207OooOo.OooO00o
    public final void OooOO0o() {
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(OooOOO()), null, null, new OooOO0(null), 3);
    }

    public final InterfaceC21987OooOoo OooOOO() {
        InterfaceC21987OooOoo viewLifecycleOwner = this.f107500OooO00o.getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return viewLifecycleOwner;
    }

    public final void OooOOOO() {
        this.f107503OooO0Oo = this.f107500OooO00o.registerForActivityResult(new C20440OooOO0(), new com.google.firebase.crashlytics.OooO00o(this, 2));
    }

    public final void OooOOOo() {
        this.f107502OooO0OO = this.f107500OooO00o.registerForActivityResult(new C20433OooO0OO(9), new C22478OooOOOo(this));
    }
}
