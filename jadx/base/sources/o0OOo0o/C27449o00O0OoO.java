package o0OOo0o;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Size;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.fragment.app.C21904OooOoo0;
import com.aspose.slides.C22227OoooO;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.data.p602db.entity.PageConverter;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.AudioFile;
import com.orion.notein.domain.models.note.Comment;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.note.NotePlaceHolder;
import com.orion.notein.domain.models.note.Outline;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.DualLinkSource;
import com.orion.notein.domain.models.page.HyperLink;
import com.orion.notein.domain.models.page.INoteinDisplayItem;
import com.orion.notein.domain.models.page.Image;
import com.orion.notein.domain.models.page.LayeredDisplayItems;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.page.Quote;
import com.orion.notein.domain.models.page.Shape;
import com.orion.notein.domain.models.page.Stroke;
import com.orion.notein.domain.models.page.TextBox;
import com.orion.notein.domain.models.papertheme.LocalResPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.notein.domain.models.pdf.DuplicatedPdfResult;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.LayerInfo;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o000OoO.C24536OooO0Oo;
import o000o0Oo.C24610OooO0O0;
import o000oo0.C24691Oooo0oO;
import o000oooo.C24761OooO;
import o00o00O0.C25252OooO0Oo;
import o00o00Oo.C25261OooO0o0;
import o00ooO0.C25749OooOoO0;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0O0oooO.C26264OooOOO0;
import o0OO.C26417OooOoO;
import o0OO.C26427Oooo0O0;
import o0OO000o.C26454OooO0Oo;
import o0OO00o0.C26479OooOO0o;
import o0OO00o0.C26493OooOooo;
import o0OO00o0.C26501Oooo0oO;
import o0OO00o0.C26515OooooO0;
import o0OO00o0.C26517OooooOo;
import o0OO00o0.C26588o00O00oO;
import o0OO00o0.C26596o00O0o0;
import o0OO00o0.C26613o00OOOoO;
import o0OO00o0.C26620o00Oo00o;
import o0OO00o0.C26643o00Ooo0O;
import o0OO00o0.C26647o00OooOO;
import o0OO00o0.C26649o00OoooO;
import o0OO00o0.C26670o00o0OOo;
import o0OO00o0.C26676o00o0o00;
import o0OO00o0.C26681o00o0oOO;
import o0OO00o0.C26690oOooo0o;
import o0OO00o0.C26691ooOO;
import o0OOO0OO.C27014OooOOo0;
import o0OOO0OO.C27015OooOOoo;
import o0OOO0OO.C27020OooOoO0;
import o0OOOO00.C27095OooOo0O;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27292OooO0oO;
import o0OOo0Oo.InterfaceC27301OooOOo;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0Oo.InterfaceC27314OooOooO;
import o0OOo0Oo.InterfaceC27318Oooo00o;
import o0OOo0Oo.InterfaceC27323Oooo0oO;
import o0OOoOo.C27788OooO0o;
import o0OOoOo0.C27798OooO0o0;
import o0OOoOo0.C27819OooOoo;
import o0OOooo0.C27982OooO0O0;
import o0OOooo0.C27986OooO0o0;
import o0OOooo0.C27988OooO0oo;
import o0OOooo0.C27994OooOOOO;
import o0OOoooO.C28009OooOOOO;
import o0oOo0o0.C30982OooO0Oo;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o0OOo0o.o00O0OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27449o00O0OoO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final InterfaceC27323Oooo0oO f96034OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27309OooOoO f96035OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f96036OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27129OoooOOO f96037OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C28009OooOOOO f96038OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27020OooOoO0 f96039OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C26417OooOoO f96040OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C26681o00o0oOO f96041OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C26427Oooo0O0 f96042OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C26620o00Oo00o f96043OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final InterfaceC27292OooO0oO f96044OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o0OO00o0.OooOo00 f96045OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C26264OooOOO0 f96046OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C26596o00O0o0 f96047OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C27095OooOo0O f96048OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final InterfaceC27314OooOooO f96049OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C30982OooO0Oo f96050OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C26649o00OoooO f96051OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C26515OooooO0 f96052OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C27499o00Ooo0 f96053OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final InterfaceC27301OooOOo f96054OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final InterfaceC27318Oooo00o f96055OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final C26454OooO0Oo f96056OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C27585o00ooO0 f96057OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C27994OooOOOO f96058OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C27788OooO0o f96059OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f96060OooOoOO;

    /* JADX INFO: renamed from: o0OOo0o.o00O0OoO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase", m80623f = "NoteUseCase.kt", m80624l = {1258, 1258}, m80625m = "getNoteContentByIdSync")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f96061OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C27449o00O0OoO f96062OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f96063OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C27449o00O0OoO f96064OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
            super(continuation);
            this.f96064OooOoO0 = c27449o00O0OoO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f96061OooOo = obj;
            this.f96063OooOoO |= Integer.MIN_VALUE;
            return this.f96064OooOoO0.OooOoO0(null, this);
        }
    }

    /* JADX INFO: renamed from: o0OOo0o.o00O0OoO$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase", m80623f = "NoteUseCase.kt", m80624l = {1234}, m80625m = "getNoteMetaByIdSync")
    public static final class OooO0O0 extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27449o00O0OoO f96065OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f96066OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f96067OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
            super(continuation);
            this.f96065OooOo = c27449o00O0OoO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f96066OooOo0o = obj;
            this.f96067OooOoO0 |= Integer.MIN_VALUE;
            return this.f96065OooOo.OooOoOO(null, this);
        }
    }

    /* JADX INFO: renamed from: o0OOo0o.o00O0OoO$OooO0OO */
    public static final class OooO0OO implements InterfaceC33721OooO0o<List<? extends Page>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Set f96068OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f96069OooOo0o;

        /* JADX INFO: renamed from: o0OOo0o.o00O0OoO$OooO0OO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ Set f96070OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f96071OooOo0o;

            /* JADX INFO: renamed from: o0OOo0o.o00O0OoO$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$getSortedPages$$inlined$map$1$2", m80623f = "NoteUseCase.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19863OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f96072OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f96073OooOo0o;

                public C19863OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f96073OooOo0o = obj;
                    this.f96072OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, Set set) {
                this.f96071OooOo0o = interfaceC33723OooO0oO;
                this.f96070OooOo = set;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19863OooO00o c19863OooO00o;
                if (continuation instanceof C19863OooO00o) {
                    c19863OooO00o = (C19863OooO00o) continuation;
                    int i = c19863OooO00o.f96072OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19863OooO00o.f96072OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19863OooO00o = new C19863OooO00o(continuation);
                    }
                }
                Object obj2 = c19863OooO00o.f96073OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19863OooO00o.f96072OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    List listO00O0O = oOo000Oo.OooOo.o00O0O((List) obj, new C27450OooO0Oo(this.f96070OooOo));
                    c19863OooO00o.f96072OooOo = 1;
                    if (this.f96071OooOo0o.emit(listO00O0O, c19863OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0OO(InterfaceC33721OooO0o interfaceC33721OooO0o, Set set) {
            this.f96069OooOo0o = interfaceC33721OooO0o;
            this.f96068OooOo = set;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends Page>> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f96069OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f96068OooOo), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0OOo0o.o00O0OoO$OooO0Oo, reason: case insensitive filesystem */
    public static final class C27450OooO0Oo<T> implements Comparator {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Set f96075OooOo0o;

        public C27450OooO0Oo(Set set) {
            this.f96075OooOo0o = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Set set = this.f96075OooOo0o;
            return C24536OooO0Oo.OooO0O0(Integer.valueOf(oOo000Oo.OooOo.OoooO0(set, ((Page) t).getId())), Integer.valueOf(oOo000Oo.OooOo.OoooO0(set, ((Page) t2).getId())));
        }
    }

    /* JADX INFO: renamed from: o0OOo0o.o00O0OoO$OooO0o0, reason: case insensitive filesystem */
    public static final class C27451OooO0o0 implements InterfaceC33721OooO0o<NoteContent> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27449o00O0OoO f96076OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f96077OooOo0o;

        /* JADX INFO: renamed from: o0OOo0o.o00O0OoO$OooO0o0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C27449o00O0OoO f96078OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f96079OooOo0o;

            /* JADX INFO: renamed from: o0OOo0o.o00O0OoO$OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$safeGetNoteContentById$$inlined$map$1$2", m80623f = "NoteUseCase.kt", m80624l = {51, 52, 50}, m80625m = "emit")
            public static final class C19864OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f96080OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f96081OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public InterfaceC33723OooO0oO f96083OooOoO0;

                /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
                public Object f96084OooOoOO;

                public C19864OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f96081OooOo0o = obj;
                    this.f96080OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C27449o00O0OoO c27449o00O0OoO) {
                this.f96079OooOo0o = interfaceC33723OooO0oO;
                this.f96078OooOo = c27449o00O0OoO;
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
            
                if (r2.emit(r9, r0) != r1) goto L35;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19864OooO00o c19864OooO00o;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
                OooO00o<T> oooO00o;
                NoteContent noteContent;
                if (continuation instanceof C19864OooO00o) {
                    c19864OooO00o = (C19864OooO00o) continuation;
                    int i = c19864OooO00o.f96080OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19864OooO00o.f96080OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19864OooO00o = new C19864OooO00o(continuation);
                    }
                }
                Object obj2 = c19864OooO00o.f96081OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19864OooO00o.f96080OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    NoteContent noteContent2 = (NoteContent) obj;
                    interfaceC33723OooO0oO = this.f96079OooOo0o;
                    if (noteContent2 != null) {
                        c19864OooO00o.f96083OooOoO0 = this;
                        c19864OooO00o.f96084OooOoOO = interfaceC33723OooO0oO;
                        c19864OooO00o.f96080OooOo = 1;
                        Object objOooO0o = this.f96078OooOo.OooO0o(noteContent2, c19864OooO00o);
                        if (objOooO0o != enumC32485OooO00o) {
                            interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                            obj2 = objOooO0o;
                            oooO00o = this;
                        }
                        return enumC32485OooO00o;
                    }
                    interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                    noteContent = null;
                    c19864OooO00o.f96083OooOoO0 = null;
                    c19864OooO00o.f96084OooOoOO = null;
                    c19864OooO00o.f96080OooOo = 3;
                } else if (i2 == 1) {
                    InterfaceC33723OooO0oO interfaceC33723OooO0oO3 = (InterfaceC33723OooO0oO) c19864OooO00o.f96084OooOoOO;
                    OooO00o<T> oooO00o2 = (OooO00o) c19864OooO00o.f96083OooOoO0;
                    C32446OooOOOo.OooO0O0(obj2);
                    interfaceC33723OooO0oO2 = interfaceC33723OooO0oO3;
                    oooO00o = oooO00o2;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    noteContent = (NoteContent) c19864OooO00o.f96084OooOoOO;
                    interfaceC33723OooO0oO2 = c19864OooO00o.f96083OooOoO0;
                    C32446OooOOOo.OooO0O0(obj2);
                    c19864OooO00o.f96083OooOoO0 = null;
                    c19864OooO00o.f96084OooOoOO = null;
                    c19864OooO00o.f96080OooOo = 3;
                }
                NoteContent noteContent3 = (NoteContent) obj2;
                if (noteContent3 != null) {
                    C27585o00ooO0 c27585o00ooO0 = oooO00o.f96078OooOo.f96057OooOo0o;
                    c19864OooO00o.f96083OooOoO0 = interfaceC33723OooO0oO2;
                    c19864OooO00o.f96084OooOoOO = noteContent3;
                    c19864OooO00o.f96080OooOo = 2;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27581o00oo0o(noteContent3, c27585o00ooO0, null), c19864OooO00o) != enumC32485OooO00o) {
                        noteContent = noteContent3;
                        c19864OooO00o.f96083OooOoO0 = null;
                        c19864OooO00o.f96084OooOoOO = null;
                        c19864OooO00o.f96080OooOo = 3;
                    }
                    return enumC32485OooO00o;
                }
                interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                noteContent = null;
                c19864OooO00o.f96083OooOoO0 = null;
                c19864OooO00o.f96084OooOoOO = null;
                c19864OooO00o.f96080OooOo = 3;
            }
        }

        public C27451OooO0o0(InterfaceC33721OooO0o interfaceC33721OooO0o, C27449o00O0OoO c27449o00O0OoO) {
            this.f96077OooOo0o = interfaceC33721OooO0o;
            this.f96076OooOo = c27449o00O0OoO;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super NoteContent> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f96077OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f96076OooOo), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    public C27449o00O0OoO(InterfaceC27309OooOoO noteContentRepo, InterfaceC27313OooOoo0 noteMetaRepo, C27129OoooOOO c27129OoooOOO, C28009OooOOOO c28009OooOOOO, C26417OooOoO c26417OooOoO, C27020OooOoO0 c27020OooOoO0, C26681o00o0oOO c26681o00o0oOO, C26427Oooo0O0 c26427Oooo0O0, InterfaceC27323Oooo0oO strokeRepo, C26620o00Oo00o c26620o00Oo00o, InterfaceC27292OooO0oO audioRepo, o0OO00o0.OooOo00 oooOo00, C26596o00O0o0 c26596o00O0o0, C26264OooOOO0 c26264OooOOO0, C27095OooOo0O c27095OooOo0O, InterfaceC27314OooOooO notePlaceholderRepo, C26649o00OoooO c26649o00OoooO, C30982OooO0Oo multiWindowHelper, C26515OooooO0 c26515OooooO0, InterfaceC27318Oooo00o pageLayerRepo, InterfaceC27301OooOOo hyperLinkRepo, C26454OooO0Oo noteContentDatabaseProvider, C27585o00ooO0 c27585o00ooO0, C27499o00Ooo0 pdfFileUseCase, C27819OooOoo c27819OooOoo, C27798OooO0o0 c27798OooO0o0, C27788OooO0o deleteLatestOpenedNoteUseCase, C27994OooOOOO c27994OooOOOO, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteContentRepo, "noteContentRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(strokeRepo, "strokeRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(audioRepo, "audioRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(notePlaceholderRepo, "notePlaceholderRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(multiWindowHelper, "multiWindowHelper");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageLayerRepo, "pageLayerRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(hyperLinkRepo, "hyperLinkRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteContentDatabaseProvider, "noteContentDatabaseProvider");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pdfFileUseCase, "pdfFileUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(deleteLatestOpenedNoteUseCase, "deleteLatestOpenedNoteUseCase");
        this.f96035OooO00o = noteContentRepo;
        this.f96036OooO0O0 = noteMetaRepo;
        this.f96037OooO0OO = c27129OoooOOO;
        this.f96038OooO0Oo = c28009OooOOOO;
        this.f96040OooO0o0 = c26417OooOoO;
        this.f96039OooO0o = c27020OooOoO0;
        this.f96041OooO0oO = c26681o00o0oOO;
        this.f96042OooO0oo = c26427Oooo0O0;
        this.f96034OooO = strokeRepo;
        this.f96043OooOO0 = c26620o00Oo00o;
        this.f96044OooOO0O = audioRepo;
        this.f96045OooOO0o = oooOo00;
        this.f96047OooOOO0 = c26596o00O0o0;
        this.f96046OooOOO = c26264OooOOO0;
        this.f96048OooOOOO = c27095OooOo0O;
        this.f96049OooOOOo = notePlaceholderRepo;
        this.f96051OooOOo0 = c26649o00OoooO;
        this.f96050OooOOo = multiWindowHelper;
        this.f96052OooOOoo = c26515OooooO0;
        this.f96055OooOo00 = pageLayerRepo;
        this.f96054OooOo0 = hyperLinkRepo;
        this.f96056OooOo0O = noteContentDatabaseProvider;
        this.f96057OooOo0o = c27585o00ooO0;
        this.f96053OooOo = pdfFileUseCase;
        this.f96059OooOoO0 = deleteLatestOpenedNoteUseCase;
        this.f96058OooOoO = c27994OooOOOO;
        this.f96060OooOoOO = abstractApplicationC26277OooOoOO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ef, code lost:
    
        if (r2 == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0104, code lost:
    
        if (r1.OoooOoO(r0, false, r3) != r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7 A[PHI: r0 r1
      0x00f7: PHI (r0v4 java.lang.String) = (r0v3 java.lang.String), (r0v6 java.lang.String) binds: [B:30:0x00b4, B:34:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x00f7: PHI (r1v4 o0OOo0o.o00O0OoO) = (r1v3 o0OOo0o.o00O0OoO), (r1v5 o0OOo0o.o00O0OoO) binds: [B:30:0x00b4, B:34:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C27449o00O0OoO c27449o00O0OoO, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27431o000oo0 c27431o000oo0;
        C27449o00O0OoO c27449o00O0OoO2;
        String str2;
        int i;
        PdfInfo pdfInfo;
        NoteMeta noteMeta;
        C27449o00O0OoO c27449o00O0OoO3 = c27449o00O0OoO;
        String str3 = str;
        c27449o00O0OoO3.getClass();
        if (abstractC32479OooO0OO instanceof C27431o000oo0) {
            c27431o000oo0 = (C27431o000oo0) abstractC32479OooO0OO;
            int i2 = c27431o000oo0.f95788OooOoo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27431o000oo0.f95788OooOoo = i2 - Integer.MIN_VALUE;
            } else {
                c27431o000oo0 = new C27431o000oo0(c27449o00O0OoO3, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0o = c27431o000oo0.f95787OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27431o000oo0.f95788OooOoo;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0o);
            c27431o000oo0.f95784OooOo0o = c27449o00O0OoO3;
            c27431o000oo0.f95783OooOo = str3;
            c27431o000oo0.f95788OooOoo = 1;
            objOooOO0o = c27449o00O0OoO3.f96035OooO00o.OooOO0o(str3, c27431o000oo0);
            if (objOooOO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i3 == 1) {
            String str4 = c27431o000oo0.f95783OooOo;
            C27449o00O0OoO c27449o00O0OoO4 = c27431o000oo0.f95784OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0o);
            str3 = str4;
            c27449o00O0OoO3 = c27449o00O0OoO4;
        } else {
            if (i3 == 2) {
                int i4 = c27431o000oo0.f95785OooOoO;
                PdfInfo pdfInfo2 = c27431o000oo0.f95786OooOoO0;
                String str5 = c27431o000oo0.f95783OooOo;
                C27449o00O0OoO c27449o00O0OoO5 = c27431o000oo0.f95784OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0o);
                i = i4;
                pdfInfo = pdfInfo2;
                str2 = str5;
                c27449o00O0OoO2 = c27449o00O0OoO5;
                noteMeta = (NoteMeta) objOooOO0o;
                if (noteMeta == null) {
                    InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c27449o00O0OoO2.f96036OooO0O0;
                    NoteMeta[] noteMetaArr = {NoteMeta.copy$default(noteMeta, null, null, null, null, null, false, null, 0, 0, false, pdfInfo, i, 0L, 0L, null, false, false, false, 0L, 521215, null)};
                    c27431o000oo0.f95784OooOo0o = c27449o00O0OoO2;
                    c27431o000oo0.f95783OooOo = str2;
                    c27431o000oo0.f95786OooOoO0 = null;
                    c27431o000oo0.f95788OooOoo = 3;
                    objOooOO0o = interfaceC27313OooOoo0.OooOo0O(noteMetaArr, c27431o000oo0);
                } else {
                    c27431o000oo0.f95784OooOo0o = null;
                    c27431o000oo0.f95783OooOo = null;
                    c27431o000oo0.f95786OooOoO0 = null;
                    c27431o000oo0.f95788OooOoo = 4;
                }
                return enumC32485OooO00o;
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooOO0o);
                return C32460OooOooO.f116667OooO00o;
            }
            str2 = c27431o000oo0.f95783OooOo;
            c27449o00O0OoO2 = c27431o000oo0.f95784OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0o);
            ((Boolean) objOooOO0o).getClass();
            c27431o000oo0.f95784OooOo0o = null;
            c27431o000oo0.f95783OooOo = null;
            c27431o000oo0.f95786OooOoO0 = null;
            c27431o000oo0.f95788OooOoo = 4;
        }
        NoteContent noteContent = (NoteContent) objOooOO0o;
        if (noteContent != null) {
            String strOooO0Oo = c27449o00O0OoO3.f96037OooO0OO.OooO0Oo();
            PdfInfo pdfInfo3 = noteContent.getPdfInfo();
            int size = noteContent.getPages().size();
            c27431o000oo0.f95784OooOo0o = c27449o00O0OoO3;
            c27431o000oo0.f95783OooOo = str3;
            c27431o000oo0.f95786OooOoO0 = pdfInfo3;
            c27431o000oo0.f95785OooOoO = size;
            c27431o000oo0.f95788OooOoo = 2;
            Object objOooO0oo = c27449o00O0OoO3.f96036OooO0O0.OooO0oo(str3, strOooO0Oo, c27431o000oo0);
            if (objOooO0oo != enumC32485OooO00o) {
                String str6 = str3;
                c27449o00O0OoO2 = c27449o00O0OoO3;
                str2 = str6;
                i = size;
                objOooOO0o = objOooO0oo;
                pdfInfo = pdfInfo3;
                noteMeta = (NoteMeta) objOooOO0o;
                if (noteMeta == null) {
                }
            }
            return enumC32485OooO00o;
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(C27449o00O0OoO c27449o00O0OoO, Image image, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        oo00o oo00oVar;
        Image image2;
        String str2;
        Image image3;
        C27449o00O0OoO c27449o00O0OoO2;
        String str3;
        C27449o00O0OoO c27449o00O0OoO3 = c27449o00O0OoO;
        c27449o00O0OoO3.getClass();
        if (abstractC32479OooO0OO instanceof oo00o) {
            oo00oVar = (oo00o) abstractC32479OooO0OO;
            int i = oo00oVar.f97022OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo00oVar.f97022OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                oo00oVar = new oo00o(c27449o00O0OoO3, abstractC32479OooO0OO);
            }
        }
        Object objValueOf = oo00oVar.f97019OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo00oVar.f97022OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objValueOf);
            String uri = image.getUri();
            oo00oVar.f97018OooOo0o = c27449o00O0OoO3;
            image2 = image;
            oo00oVar.f97017OooOo = image2;
            str2 = str;
            oo00oVar.f97020OooOoO0 = str2;
            oo00oVar.f97022OooOoo0 = 1;
            objValueOf = Boolean.valueOf(C31190OooO0oo.OooOOoo(uri));
            if (objValueOf != enumC32485OooO00o) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Image image4 = (Image) oo00oVar.f97018OooOo0o;
                C32446OooOOOo.OooO0O0(objValueOf);
                return image4;
            }
            str3 = oo00oVar.f97020OooOoO0;
            Image image5 = oo00oVar.f97017OooOo;
            C27449o00O0OoO c27449o00O0OoO4 = (C27449o00O0OoO) oo00oVar.f97018OooOo0o;
            C32446OooOOOo.OooO0O0(objValueOf);
            image3 = image5;
            c27449o00O0OoO2 = c27449o00O0OoO4;
            Image imageCopy$default = Image.copy$default(image3, null, null, (String) objValueOf, null, null, 0.0f, 0L, 0L, false, 507, null);
            C26596o00O0o0 c26596o00O0o0 = c27449o00O0OoO2.f96047OooOOO0;
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(imageCopy$default);
            oo00oVar.f97018OooOo0o = imageCopy$default;
            oo00oVar.f97017OooOo = null;
            oo00oVar.f97020OooOoO0 = null;
            oo00oVar.f97022OooOoo0 = 3;
            return c26596o00O0o0.OooOOoo(str3, listOooO0oO, oo00oVar) != enumC32485OooO00o ? enumC32485OooO00o : imageCopy$default;
        }
        String str4 = oo00oVar.f97020OooOoO0;
        image2 = oo00oVar.f97017OooOo;
        C27449o00O0OoO c27449o00O0OoO5 = (C27449o00O0OoO) oo00oVar.f97018OooOo0o;
        C32446OooOOOo.OooO0O0(objValueOf);
        str2 = str4;
        c27449o00O0OoO3 = c27449o00O0OoO5;
        if (((Boolean) objValueOf).booleanValue()) {
            return image2;
        }
        RectF bounds = image2.getBounds();
        Number f = bounds != null ? new Float(bounds.width()) : new Integer(0);
        RectF bounds2 = image2.getBounds();
        Number f2 = bounds2 != null ? new Float(bounds2.height()) : new Integer(0);
        C26596o00O0o0 c26596o00O0o02 = c27449o00O0OoO3.f96047OooOOO0;
        String id = image2.getId();
        int iIntValue = f.intValue();
        int iIntValue2 = f2.intValue();
        oo00oVar.f97018OooOo0o = c27449o00O0OoO3;
        oo00oVar.f97017OooOo = image2;
        oo00oVar.f97020OooOoO0 = str2;
        oo00oVar.f97022OooOoo0 = 2;
        objValueOf = c26596o00O0o02.OooOOo(id, iIntValue, iIntValue2, oo00oVar);
        if (objValueOf != enumC32485OooO00o) {
            image3 = image2;
            c27449o00O0OoO2 = c27449o00O0OoO3;
            str3 = str2;
            Image imageCopy$default2 = Image.copy$default(image3, null, null, (String) objValueOf, null, null, 0.0f, 0L, 0L, false, 507, null);
            C26596o00O0o0 c26596o00O0o03 = c27449o00O0OoO2.f96047OooOOO0;
            List listOooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(imageCopy$default2);
            oo00oVar.f97018OooOo0o = imageCopy$default2;
            oo00oVar.f97017OooOo = null;
            oo00oVar.f97020OooOoO0 = null;
            oo00oVar.f97022OooOoo0 = 3;
            if (c26596o00O0o03.OooOOoo(str3, listOooO0oO2, oo00oVar) != enumC32485OooO00o) {
            }
        }
    }

    public static void OooOOO(Page page) {
        String tnPath = page.getTnPath();
        if (tnPath.length() <= 0) {
            tnPath = null;
        }
        if (tnPath != null) {
            File file = new File(tnPath);
            File file2 = file.exists() ? file : null;
            if (file2 != null) {
                file2.delete();
            }
        }
    }

    public static C32460OooOooO OooOOOo(PdfInfo pdfInfo) {
        String pdfPath = pdfInfo.getPdfPath();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteUseCase");
        c20358OooO00o.OooOO0O("deletePdfFile, pdfInfo: " + pdfInfo + ", filePath: " + pdfPath, new Object[0]);
        c20358OooO00o.OooOOO0("NoteUseCase");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        kotlin.jvm.internal.OooOOO0.OooO0o(stackTrace, "getStackTrace(...)");
        c20358OooO00o.OooOO0O(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("deletePdfFile, stackTrace: ", oOo000Oo.OooOo.o000oOoO(oOo000Oo.OooOOO.Oooo0oo(stackTrace), IOUtils.LINE_SEPARATOR_UNIX, null, null, new C27424o000o0o(0), 30)), new Object[0]);
        if (pdfPath.length() > 0) {
            File file = new File(pdfPath);
            if (file.exists()) {
                file.delete();
                c20358OooO00o.OooOOO0("NoteUseCase");
                c20358OooO00o.OooOO0O("deletePdfFile, file deleted: ".concat(pdfPath), new Object[0]);
            } else {
                c20358OooO00o.OooOOO0("NoteUseCase");
                c20358OooO00o.OooOO0O("deletePdfFile, file not exists: ".concat(pdfPath), new Object[0]);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public static ArrayList Oooo0o0(String str, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        List list3 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list3) {
            String layerId = ((INoteinDisplayItem) obj).getLayerId();
            Object arrayList2 = linkedHashMap.get(layerId);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(layerId, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        kotlin.jvm.internal.Oooo000 oooo000 = new kotlin.jvm.internal.Oooo000();
        oooo000.f80941OooOo0o = System.currentTimeMillis();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            List list4 = (List) linkedHashMap.get((String) it.next());
            if (list4 != null) {
                List<INoteinDisplayItem> list5 = list4;
                Iterator it2 = list5.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                long creationTime = ((INoteinDisplayItem) it2.next()).getCreationTime();
                while (it2.hasNext()) {
                    long creationTime2 = ((INoteinDisplayItem) it2.next()).getCreationTime();
                    if (creationTime > creationTime2) {
                        creationTime = creationTime2;
                    }
                }
                ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list5, 10));
                for (INoteinDisplayItem iNoteinDisplayItem : list5) {
                    arrayList3.add(iNoteinDisplayItem.deepCopy(iNoteinDisplayItem.getId(), str, (iNoteinDisplayItem.getCreationTime() - creationTime) + oooo000.f80941OooOo0o + 1));
                }
                Iterator it3 = arrayList3.iterator();
                if (!it3.hasNext()) {
                    throw new NoSuchElementException();
                }
                Long lValueOf = Long.valueOf(((INoteinDisplayItem) it3.next()).getCreationTime());
                while (it3.hasNext()) {
                    Long lValueOf2 = Long.valueOf(((INoteinDisplayItem) it3.next()).getCreationTime());
                    if (lValueOf.compareTo(lValueOf2) < 0) {
                        lValueOf = lValueOf2;
                    }
                }
                oooo000.f80941OooOo0o = lValueOf.longValue();
                arrayList.addAll(arrayList3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list3) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((INoteinDisplayItem) obj2).getLayerId(), "none")) {
                arrayList4.add(obj2);
            }
        }
        return oOo000Oo.OooOo.OooooOO(arrayList, arrayList4);
    }

    public static /* synthetic */ Object OoooOoo(C27449o00O0OoO c27449o00O0OoO, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return c27449o00O0OoO.OoooOoO(str, true, abstractC32479OooO0OO);
    }

    public final Object OooO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27439o000ooo0(str, str2, null, this), abstractC32479OooO0OO);
    }

    public final Object OooO0OO(NoteContent noteContent, Page page, int i, AbstractC32476OooO abstractC32476OooO) {
        Object objOooO0Oo = OooO0Oo(noteContent, com.facebook.soloader.OooOo.OooO0oO(page), i, true, abstractC32476OooO);
        return objOooO0Oo == EnumC32485OooO00o.f116726OooOo0o ? objOooO0Oo : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0141, code lost:
    
        if (r8.OoooOoO(r1, true, r3) == r4) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(NoteContent noteContent, List list, int i, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27429o000oOoo c27429o000oOoo;
        int i2;
        C27449o00O0OoO c27449o00O0OoO;
        NoteContent noteContent2;
        List list2;
        C27020OooOoO0 c27020OooOoO0;
        String id;
        int i3;
        List list3;
        C27449o00O0OoO c27449o00O0OoO2;
        NoteContent noteContentCopy;
        C27449o00O0OoO c27449o00O0OoO3;
        String id2;
        int size;
        C27449o00O0OoO c27449o00O0OoO4;
        NoteContent noteContent3;
        List list4 = list;
        if (abstractC32479OooO0OO instanceof C27429o000oOoo) {
            c27429o000oOoo = (C27429o000oOoo) abstractC32479OooO0OO;
            int i4 = c27429o000oOoo.f95776OooOoo;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c27429o000oOoo.f95776OooOoo = i4 - Integer.MIN_VALUE;
            } else {
                c27429o000oOoo = new C27429o000oOoo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27429o000oOoo.f95775OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i5 = c27429o000oOoo.f95776OooOoo;
        if (i5 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (z) {
                c27429o000oOoo.f95772OooOo0o = this;
                c27429o000oOoo.f95771OooOo = noteContent;
                c27429o000oOoo.f95774OooOoO0 = list4;
                i2 = i;
                c27429o000oOoo.f95773OooOoO = i2;
                c27429o000oOoo.f95776OooOoo = 1;
                Serializable serializableOooO0O0 = this.f96057OooOo0o.OooO0O0(list4, true, c27429o000oOoo);
                if (serializableOooO0O0 != enumC32485OooO00o) {
                    noteContent2 = noteContent;
                    obj = serializableOooO0O0;
                    c27449o00O0OoO = this;
                }
                return enumC32485OooO00o;
            }
            i2 = i;
            c27449o00O0OoO = this;
            noteContent2 = noteContent;
            list2 = list4;
            c27020OooOoO0 = c27449o00O0OoO.f96039OooO0o;
            id = noteContent2.getId();
            c27429o000oOoo.f95772OooOo0o = c27449o00O0OoO;
            c27429o000oOoo.f95771OooOo = noteContent2;
            c27429o000oOoo.f95774OooOoO0 = list2;
            c27429o000oOoo.f95773OooOoO = i2;
            c27429o000oOoo.f95776OooOoo = 2;
            if (c27020OooOoO0.OooO00o(id, list4, c27429o000oOoo) != enumC32485OooO00o) {
                i3 = i2;
                list3 = list2;
                c27449o00O0OoO2 = c27449o00O0OoO;
                ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(noteContent2.getPages());
                arrayListO0ooOoO.addAll(i3, list3);
                noteContentCopy = noteContent2.copy((24571 & 1) != 0 ? noteContent2.id : null, (24571 & 2) != 0 ? noteContent2.defaultPage : null, (24571 & 4) != 0 ? noteContent2.pages : arrayListO0ooOoO, (24571 & 8) != 0 ? noteContent2.pageLayerIds : null, (24571 & 16) != 0 ? noteContent2.outlines : null, (24571 & 32) != 0 ? noteContent2.pdfInfo : null, (24571 & 64) != 0 ? noteContent2.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent2.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent2.zoom : 0.0f, (24571 & 512) != 0 ? noteContent2.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent2.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent2.unboundedNote : false, (24571 & 4096) != 0 ? noteContent2.creationTime : 0L, (24571 & 8192) != 0 ? noteContent2.lastModificationTime : System.currentTimeMillis(), (24571 & 16384) != 0 ? noteContent2.extras : null);
                c27429o000oOoo.f95772OooOo0o = c27449o00O0OoO2;
                c27429o000oOoo.f95771OooOo = noteContent2;
                c27429o000oOoo.f95774OooOoO0 = noteContentCopy;
                c27429o000oOoo.f95773OooOoO = i3;
                c27429o000oOoo.f95776OooOoo = 3;
                if (c27449o00O0OoO2.OoooOOo(noteContentCopy, c27429o000oOoo) != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
        if (i5 == 1) {
            int i6 = c27429o000oOoo.f95773OooOoO;
            List list5 = (List) c27429o000oOoo.f95774OooOoO0;
            noteContent2 = c27429o000oOoo.f95771OooOo;
            c27449o00O0OoO = c27429o000oOoo.f95772OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            i2 = i6;
            list4 = list5;
        } else {
            if (i5 == 2) {
                i3 = c27429o000oOoo.f95773OooOoO;
                list3 = (List) c27429o000oOoo.f95774OooOoO0;
                NoteContent noteContent4 = c27429o000oOoo.f95771OooOo;
                C27449o00O0OoO c27449o00O0OoO5 = c27429o000oOoo.f95772OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c27449o00O0OoO2 = c27449o00O0OoO5;
                noteContent2 = noteContent4;
                ArrayList arrayListO0ooOoO2 = oOo000Oo.OooOo.o0ooOoO(noteContent2.getPages());
                arrayListO0ooOoO2.addAll(i3, list3);
                noteContentCopy = noteContent2.copy((24571 & 1) != 0 ? noteContent2.id : null, (24571 & 2) != 0 ? noteContent2.defaultPage : null, (24571 & 4) != 0 ? noteContent2.pages : arrayListO0ooOoO2, (24571 & 8) != 0 ? noteContent2.pageLayerIds : null, (24571 & 16) != 0 ? noteContent2.outlines : null, (24571 & 32) != 0 ? noteContent2.pdfInfo : null, (24571 & 64) != 0 ? noteContent2.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent2.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent2.zoom : 0.0f, (24571 & 512) != 0 ? noteContent2.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent2.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent2.unboundedNote : false, (24571 & 4096) != 0 ? noteContent2.creationTime : 0L, (24571 & 8192) != 0 ? noteContent2.lastModificationTime : System.currentTimeMillis(), (24571 & 16384) != 0 ? noteContent2.extras : null);
                c27429o000oOoo.f95772OooOo0o = c27449o00O0OoO2;
                c27429o000oOoo.f95771OooOo = noteContent2;
                c27429o000oOoo.f95774OooOoO0 = noteContentCopy;
                c27429o000oOoo.f95773OooOoO = i3;
                c27429o000oOoo.f95776OooOoo = 3;
                if (c27449o00O0OoO2.OoooOOo(noteContentCopy, c27429o000oOoo) != enumC32485OooO00o) {
                    c27449o00O0OoO3 = c27449o00O0OoO2;
                    id2 = noteContentCopy.getId();
                    size = noteContentCopy.getPages().size();
                    c27429o000oOoo.f95772OooOo0o = c27449o00O0OoO3;
                    c27429o000oOoo.f95771OooOo = noteContent2;
                    c27429o000oOoo.f95774OooOoO0 = null;
                    c27429o000oOoo.f95773OooOoO = i3;
                    c27429o000oOoo.f95776OooOoo = 4;
                    if (c27449o00O0OoO3.Ooooo00(size, id2, c27429o000oOoo) != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i5 == 3) {
                i3 = c27429o000oOoo.f95773OooOoO;
                noteContentCopy = (NoteContent) c27429o000oOoo.f95774OooOoO0;
                NoteContent noteContent5 = c27429o000oOoo.f95771OooOo;
                c27449o00O0OoO3 = c27429o000oOoo.f95772OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                noteContent2 = noteContent5;
                id2 = noteContentCopy.getId();
                size = noteContentCopy.getPages().size();
                c27429o000oOoo.f95772OooOo0o = c27449o00O0OoO3;
                c27429o000oOoo.f95771OooOo = noteContent2;
                c27429o000oOoo.f95774OooOoO0 = null;
                c27429o000oOoo.f95773OooOoO = i3;
                c27429o000oOoo.f95776OooOoo = 4;
                if (c27449o00O0OoO3.Ooooo00(size, id2, c27429o000oOoo) != enumC32485OooO00o) {
                    c27449o00O0OoO4 = c27449o00O0OoO3;
                    noteContent3 = noteContent2;
                    if (i3 == 0) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i5 != 4) {
                if (i5 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            i3 = c27429o000oOoo.f95773OooOoO;
            noteContent3 = c27429o000oOoo.f95771OooOo;
            c27449o00O0OoO4 = c27429o000oOoo.f95772OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            if (i3 == 0) {
                return C32460OooOooO.f116667OooO00o;
            }
            String id3 = noteContent3.getId();
            c27429o000oOoo.f95772OooOo0o = null;
            c27429o000oOoo.f95771OooOo = null;
            c27429o000oOoo.f95776OooOoo = 5;
        }
        List list6 = (List) obj;
        list2 = list4;
        list4 = list6;
        c27020OooOoO0 = c27449o00O0OoO.f96039OooO0o;
        id = noteContent2.getId();
        c27429o000oOoo.f95772OooOo0o = c27449o00O0OoO;
        c27429o000oOoo.f95771OooOo = noteContent2;
        c27429o000oOoo.f95774OooOoO0 = list2;
        c27429o000oOoo.f95773OooOoO = i2;
        c27429o000oOoo.f95776OooOoo = 2;
        if (c27020OooOoO0.OooO00o(id, list4, c27429o000oOoo) != enumC32485OooO00o) {
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(NoteContent noteContent, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27433o000oo0O c27433o000oo0O;
        String id;
        NoteContent noteContent2;
        if (abstractC32479OooO0OO instanceof C27433o000oo0O) {
            c27433o000oo0O = (C27433o000oo0O) abstractC32479OooO0OO;
            int i = c27433o000oo0O.f95799OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27433o000oo0O.f95799OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27433o000oo0O = new C27433o000oo0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c27433o000oo0O.f95798OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27433o000oo0O.f95799OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            PdfInfo pdfInfo = noteContent.getPdfInfo();
            if (pdfInfo == null || (id = pdfInfo.getId()) == null) {
                return noteContent;
            }
            String id2 = noteContent.getId();
            c27433o000oo0O.f95796OooOo0o = noteContent;
            c27433o000oo0O.f95795OooOo = noteContent;
            c27433o000oo0O.f95799OooOoOO = 1;
            objOooO0OO = this.f96042OooO0oo.OooO0OO(id, id2, c27433o000oo0O);
            if (objOooO0OO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            noteContent2 = noteContent;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            noteContent = c27433o000oo0O.f95795OooOo;
            noteContent2 = c27433o000oo0O.f95796OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
        }
        noteContent.setPdfInfo((PdfInfo) objOooO0OO);
        return noteContent2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e2, code lost:
    
        if (r1.OooOo0O(r4, r2) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27432o000oo00 c27432o000oo00;
        String str2;
        C27449o00O0OoO c27449o00O0OoO;
        if (abstractC32479OooO0OO instanceof C27432o000oo00) {
            c27432o000oo00 = (C27432o000oo00) abstractC32479OooO0OO;
            int i = c27432o000oo00.f95794OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27432o000oo00.f95794OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27432o000oo00 = new C27432o000oo00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27432o000oo00.f95793OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27432o000oo00.f95794OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27432o000oo00.f95791OooOo0o = this;
            c27432o000oo00.f95790OooOo = str;
            c27432o000oo00.f95794OooOoOO = 1;
            Serializable serializableOooO = this.f96036OooO0O0.OooO(c27432o000oo00);
            if (serializableOooO != enumC32485OooO00o) {
                str2 = str;
                obj = serializableOooO;
                c27449o00O0OoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        String str3 = c27432o000oo00.f95790OooOo;
        C27449o00O0OoO c27449o00O0OoO2 = c27432o000oo00.f95791OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        str2 = str3;
        c27449o00O0OoO = c27449o00O0OoO2;
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = arrayList;
            arrayList2.add(NoteMeta.copy$default((NoteMeta) it.next(), null, str2, null, null, null, false, null, 0, 0, false, null, 0, 0L, 0L, null, false, false, false, 0L, 524285, null));
            arrayList = arrayList2;
        }
        InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c27449o00O0OoO.f96036OooO0O0;
        NoteMeta[] noteMetaArr = (NoteMeta[]) arrayList.toArray(new NoteMeta[0]);
        NoteMeta[] noteMetaArr2 = (NoteMeta[]) Arrays.copyOf(noteMetaArr, noteMetaArr.length);
        c27432o000oo00.f95791OooOo0o = null;
        c27432o000oo00.f95790OooOo = null;
        c27432o000oo00.f95794OooOoOO = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:461:0x14cf, code lost:
    
        r0 = r49;
        r25 = r1;
        r22 = r14;
        r14 = r15;
        r15 = r24;
        r49 = r28;
        r1 = r50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0e45 A[LOOP:12: B:106:0x0e3f->B:108:0x0e45, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0ec4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0eeb A[LOOP:13: B:114:0x0ee5->B:116:0x0eeb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0f3d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x1105 A[LOOP:16: B:138:0x10ff->B:140:0x1105, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x1173  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x119e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x122c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x125e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x132b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x1385  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x13b9 A[LOOP:21: B:186:0x13b3->B:188:0x13b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x1451  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x14a7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x14d5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x15b5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x15b8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x15c7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x164c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x16c1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x16df  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x1730  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x1752  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x17a4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x17c2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x1813  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x1831  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x1882  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x189f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x18fe  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x1905  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x1926  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x1973  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x1976  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x19bc  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x19ee  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x1a1e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x1a32  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x1ab2  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x1afe  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x1b83  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x1c56  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x1d58  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x1d6a  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x1d7c  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x1d84  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x1dad A[LOOP:4: B:399:0x1da7->B:401:0x1dad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x1dcc  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x1df6 A[LOOP:6: B:409:0x1df0->B:411:0x1df6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x1e52  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x1e72  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x1eb5  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x1ed3  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x1edd  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x1f81  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0ff6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:556:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:557:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:559:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:560:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:561:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:564:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:565:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:567:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:568:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0bae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0bf8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0c70  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0cbb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0d84  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0d9b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0dbf  */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v400 */
    /* JADX WARN: Type inference failed for: r1v405 */
    /* JADX WARN: Type inference failed for: r1v407 */
    /* JADX WARN: Type inference failed for: r1v484 */
    /* JADX WARN: Type inference failed for: r1v485 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x0dd3 -> B:318:0x1a2d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:316:0x1a1e -> B:317:0x1a24). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:391:0x1d58 -> B:392:0x1d5d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:393:0x1d6a -> B:394:0x1d7a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0be1 -> B:70:0x0be9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0cd5 -> B:92:0x0d59). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0d36 -> B:91:0x0d3d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0d84 -> B:94:0x0d90). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(List list, String str, Note note, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27434o000oo0o c27434o000oo0o;
        List list2;
        Note note2;
        int i2;
        Object objOooOo;
        C27449o00O0OoO c27449o00O0OoO;
        Note note3;
        String str2;
        int i3;
        List<String> list3;
        Note note4;
        String str3;
        List list4;
        Map linkedHashMap;
        List list5;
        Note note5;
        List<String> list6;
        Iterator it;
        C27449o00O0OoO c27449o00O0OoO2;
        String str4;
        Collection collection;
        int i4;
        String str5;
        String str6;
        String str7;
        List<String> list7;
        Iterator it2;
        LinkedHashMap linkedHashMap2;
        C27434o000oo0o c27434o000oo0o2;
        List list8;
        C27449o00O0OoO c27449o00O0OoO3;
        int i5;
        String str8;
        String str9;
        List list9;
        Map map;
        List list10;
        List<String> list11;
        Collection collection2;
        String str10;
        Object obj;
        String str11;
        LinkedHashMap linkedHashMap3;
        int i6;
        Object next;
        String str12;
        List list12;
        Map map2;
        Iterator it3;
        C27434o000oo0o c27434o000oo0o3;
        Page page;
        String str13;
        EnumC32485OooO00o enumC32485OooO00o;
        List list13;
        Page page2;
        int i7;
        String str14;
        C27449o00O0OoO c27449o00O0OoO4;
        List list14;
        Object obj2;
        Page page3;
        Page page4;
        Note note6;
        int i8;
        Page page5;
        List list15;
        Map map3;
        List list16;
        Page page6;
        Iterator it4;
        C27449o00O0OoO c27449o00O0OoO5;
        Object obj3;
        String str15;
        LinkedHashMap linkedHashMap4;
        String str16;
        List<String> list17;
        Map map4;
        C27434o000oo0o c27434o000oo0o4;
        Page page7;
        List list18;
        EnumC32485OooO00o enumC32485OooO00o2;
        String str17;
        String str18;
        Map map5;
        Iterator it5;
        List list19;
        C27449o00O0OoO c27449o00O0OoO6;
        int i9;
        ?? r1;
        List list20;
        int i10;
        Page page8;
        Iterator it6;
        C27449o00O0OoO c27449o00O0OoO7;
        EnumC32485OooO00o enumC32485OooO00o3;
        Map map6;
        int i11;
        List arrayList;
        String str19;
        List list21;
        Object obj4;
        Map map7;
        List list22;
        int i12;
        List list23;
        Page page9;
        C27449o00O0OoO c27449o00O0OoO8;
        EnumC32485OooO00o enumC32485OooO00o4;
        Map map8;
        List list24;
        String str20;
        List list25;
        C27449o00O0OoO c27449o00O0OoO9;
        List list26;
        List list27;
        Map map9;
        EnumC32485OooO00o enumC32485OooO00o5;
        Collection collection3;
        List list28;
        Iterator it7;
        Iterator it8;
        Map map10;
        int i13;
        int i14;
        Iterator it9;
        C27449o00O0OoO c27449o00O0OoO10;
        EnumC32485OooO00o enumC32485OooO00o6;
        Page page10;
        List list29;
        List list30;
        List list31;
        Object obj5;
        int i15;
        List list32;
        Page page11;
        C27449o00O0OoO c27449o00O0OoO11;
        EnumC32485OooO00o enumC32485OooO00o7;
        List list33;
        List list34;
        C27434o000oo0o c27434o000oo0o5;
        Map map11;
        Object obj6;
        String str21;
        int i16;
        Page page12;
        C27449o00O0OoO c27449o00O0OoO12;
        String str22;
        Object obj7;
        EnumC32485OooO00o enumC32485OooO00o8;
        List list35;
        int i17;
        Map map12;
        List list36;
        String str23;
        String str24;
        C27449o00O0OoO c27449o00O0OoO13;
        EnumC32485OooO00o enumC32485OooO00o9;
        Iterator it10;
        Map map13;
        int i18;
        Page page13;
        List list37;
        String str25;
        List list38;
        List list39;
        int i19;
        C27434o000oo0o c27434o000oo0o6;
        Object obj8;
        List list40;
        C27449o00O0OoO c27449o00O0OoO14;
        EnumC32485OooO00o enumC32485OooO00o10;
        Iterator it11;
        Map map14;
        List list41;
        int i20;
        List list42;
        Object obj9;
        List list43;
        Page page14;
        String str26;
        int i21;
        List list44;
        String str27;
        Object obj10;
        Iterator it12;
        List list45;
        C27449o00O0OoO c27449o00O0OoO15;
        EnumC32485OooO00o enumC32485OooO00o11;
        List list46;
        Page page15;
        String str28;
        Map map15;
        List list47;
        List list48;
        List list49;
        C27449o00O0OoO c27449o00O0OoO16;
        List list50;
        String str29;
        Iterator it13;
        Map map16;
        EnumC32485OooO00o enumC32485OooO00o12;
        List list51;
        List list52;
        Map map17;
        Note note7;
        String str30;
        String str31;
        C27449o00O0OoO c27449o00O0OoO17;
        String str32;
        Image image;
        Page page16;
        C27434o000oo0o c27434o000oo0o7;
        List list53;
        List list54;
        Iterator it14;
        EnumC32485OooO00o enumC32485OooO00o13;
        int i22;
        List list55;
        Iterator it15;
        List list56;
        Collection collection4;
        Object objOooO0oO;
        Map map18;
        int i23;
        List listOooo0o0;
        C27449o00O0OoO c27449o00O0OoO18;
        int i24;
        List list57;
        Map map19;
        List list58;
        Map map20;
        Object obj11;
        EnumC32485OooO00o enumC32485OooO00o14;
        List list59;
        Iterator it16;
        Page page17;
        List list60;
        int i25;
        EnumC32485OooO00o enumC32485OooO00o15;
        List list61;
        List list62;
        Map map21;
        int i26;
        Map map22;
        List list63;
        Iterator it17;
        List list64;
        int i27;
        EnumC32485OooO00o enumC32485OooO00o16;
        List list65;
        List list66;
        Map map23;
        List list67;
        List list68;
        List list69;
        int i28;
        EnumC32485OooO00o enumC32485OooO00o17;
        List list70;
        List list71;
        Map map24;
        List list72;
        List list73;
        int i29;
        EnumC32485OooO00o enumC32485OooO00o18;
        List list74;
        List list75;
        List list76;
        List list77;
        int i30;
        List list78;
        C27449o00O0OoO c27449o00O0OoO19;
        EnumC32485OooO00o enumC32485OooO00o19;
        List list79;
        Map map25;
        int i31;
        List list80;
        List list81;
        int i32;
        List list82;
        Iterator it18;
        C27449o00O0OoO c27449o00O0OoO20;
        int i33;
        String str33;
        EnumC32485OooO00o enumC32485OooO00o20;
        List list83;
        List list84;
        List list85;
        Map map26;
        List list86;
        C27449o00O0OoO c27449o00O0OoO21;
        EnumC32485OooO00o enumC32485OooO00o21;
        List list87;
        List list88;
        Map map27;
        C27449o00O0OoO c27449o00O0OoO22;
        List list89;
        EnumC32485OooO00o enumC32485OooO00o22;
        List<String> list90;
        C27994OooOOOO c27994OooOOOO;
        Map map28;
        Note note8;
        C27449o00O0OoO c27449o00O0OoO23;
        List<String> list91;
        Object objOooO00o;
        Object objOooO00o2;
        Object objOooO0O0;
        EnumC32485OooO00o enumC32485OooO00o23;
        Object objOooO0o;
        EnumC32485OooO00o enumC32485OooO00o24;
        ArrayList arrayList2;
        C26264OooOOO0 c26264OooOOO0;
        EnumC32485OooO00o enumC32485OooO00o25;
        ArrayList arrayList3;
        C26649o00OoooO c26649o00OoooO;
        Object objOooO0O02;
        ArrayList arrayList4;
        Iterator it19;
        InterfaceC27323Oooo0oO interfaceC27323Oooo0oO;
        HyperLink hyperLinkCopy$default;
        String destination;
        C27449o00O0OoO c27449o00O0OoO24;
        Iterator it20;
        List list92;
        Page page18;
        List list93;
        List list94;
        Iterator it21;
        Collection collection5;
        Image image2;
        Iterator it22;
        List list95;
        Object objOooOO0O;
        Object objOooO0OO;
        EnumC32485OooO00o enumC32485OooO00o26;
        Iterator it23;
        Object objOooO0O03;
        String str34;
        Iterator it24;
        Serializable serializableOooO0OO;
        EnumC32485OooO00o enumC32485OooO00o27;
        Iterator it25;
        String str35;
        Iterator it26;
        Serializable serializableOooO0Oo;
        EnumC32485OooO00o enumC32485OooO00o28;
        Iterator it27;
        Image image3;
        Collection collection6;
        List list96;
        Page page19;
        String str36;
        int i34;
        Object objOooO0oO2;
        Iterator it28;
        Iterator it29;
        Serializable serializableOooOOO0;
        EnumC32485OooO00o enumC32485OooO00o29;
        List list97;
        List list98;
        List list99;
        List list100;
        String str37;
        Map map29;
        Note note9;
        C27449o00O0OoO c27449o00O0OoO25;
        ?? r12;
        List list101;
        List list102;
        String str38;
        Collection arrayList5;
        Iterator it30;
        C27434o000oo0o c27434o000oo0o8;
        int i35;
        int i36;
        C27449o00O0OoO c27449o00O0OoO26;
        List list103;
        List list104;
        List list105;
        C27449o00O0OoO c27449o00O0OoO27;
        List list106;
        Iterator it31;
        Collection collection7;
        List list107;
        List list108;
        Map map30;
        String str39;
        Note note10;
        C27449o00O0OoO c27449o00O0OoO28;
        String str40;
        List list109;
        EnumC32485OooO00o enumC32485OooO00o30;
        EnumC32485OooO00o enumC32485OooO00o31;
        List list110;
        String str41;
        int i37;
        List list111;
        List list112;
        Iterator it32;
        Iterator it33;
        Iterator it34;
        List list113;
        String str42;
        List list114;
        List list115;
        Iterator it35;
        Collection collection8;
        Map map31;
        List list116;
        Note note11;
        C27020OooOoO0 c27020OooOoO0;
        C27449o00O0OoO c27449o00O0OoO29;
        int i38;
        String str43;
        List list117;
        List list118;
        DuplicatedPdfResult duplicatedPdfResult;
        int i39;
        List list119;
        List list120;
        List list121;
        List list122;
        List list123;
        Object objOooOO0o;
        List list124;
        List list125;
        C27449o00O0OoO c27449o00O0OoO30;
        Note note12;
        C27449o00O0OoO c27449o00O0OoO31;
        List list126;
        NoteContent noteContentOooO00o;
        C27449o00O0OoO c27449o00O0OoO32;
        String id;
        int size;
        String id2;
        String str44 = str;
        if (abstractC32479OooO0OO instanceof C27434o000oo0o) {
            c27434o000oo0o = (C27434o000oo0o) abstractC32479OooO0OO;
            int i40 = c27434o000oo0o.f95824OoooOO0;
            if ((i40 & Integer.MIN_VALUE) != 0) {
                c27434o000oo0o.f95824OoooOO0 = i40 - Integer.MIN_VALUE;
            } else {
                c27434o000oo0o = new C27434o000oo0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooo0 = c27434o000oo0o.f95823OoooO0O;
        C21904OooOoo0.OooO0Oo();
        EnumC32485OooO00o enumC32485OooO00o32 = EnumC32485OooO00o.f116726OooOo0o;
        String str45 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
        String str46 = "";
        String str47 = "toString(...)";
        switch (c27434o000oo0o.f95824OoooOO0) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooo0);
                c27434o000oo0o.f95801OooOo0o = this;
                list2 = list;
                c27434o000oo0o.f95800OooOo = list2;
                c27434o000oo0o.f95803OooOoO0 = str44;
                note2 = note;
                c27434o000oo0o.f95802OooOoO = note2;
                i2 = i;
                c27434o000oo0o.f95822OoooO00 = i2;
                c27434o000oo0o.f95824OoooOO0 = 1;
                objOooOo = OooOo(str44, c27434o000oo0o);
                if (objOooOo != enumC32485OooO00o32) {
                    c27449o00O0OoO = this;
                    note3 = (Note) objOooOo;
                    if (note3 != null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    List<String> pageLayerIds = note3.getPageLayerIds();
                    String id3 = note2.getId();
                    List<String> pageLayerIds2 = note2.getPageLayerIds();
                    c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO;
                    c27434o000oo0o.f95800OooOo = list2;
                    c27434o000oo0o.f95803OooOoO0 = str44;
                    c27434o000oo0o.f95802OooOoO = note2;
                    c27434o000oo0o.f95804OooOoOO = pageLayerIds;
                    c27434o000oo0o.f95806OooOoo0 = id3;
                    c27434o000oo0o.f95822OoooO00 = i2;
                    c27434o000oo0o.f95824OoooOO0 = 2;
                    Object objOooo000 = c27449o00O0OoO.Oooo000(id3, pageLayerIds2, c27434o000oo0o);
                    if (objOooo000 != enumC32485OooO00o32) {
                        str2 = str44;
                        i3 = i2;
                        list3 = pageLayerIds;
                        note4 = note2;
                        str3 = id3;
                        list4 = list2;
                        objOooo0 = objOooo000;
                        linkedHashMap = new LinkedHashMap();
                        List list127 = list4;
                        int i41 = i3;
                        ArrayList arrayList6 = new ArrayList(C34428OooOOo.OooOOoo(list127, 10));
                        Iterator it36 = list127.iterator();
                        list5 = (List) objOooo0;
                        note5 = note4;
                        list6 = list3;
                        it = it36;
                        c27449o00O0OoO2 = c27449o00O0OoO;
                        str4 = str3;
                        collection = arrayList6;
                        i4 = i41;
                        if (!it.hasNext()) {
                            str8 = str47;
                            String str48 = (String) it.next();
                            str9 = str45;
                            C26620o00Oo00o c26620o00Oo00o = c27449o00O0OoO2.f96043OooOO0;
                            c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO2;
                            c27434o000oo0o.f95800OooOo = list4;
                            c27434o000oo0o.f95803OooOoO0 = str2;
                            c27434o000oo0o.f95802OooOoO = note5;
                            c27434o000oo0o.f95804OooOoOO = list6;
                            c27434o000oo0o.f95806OooOoo0 = str4;
                            c27434o000oo0o.f95805OooOoo = list5;
                            c27434o000oo0o.f95807OooOooO = linkedHashMap;
                            c27434o000oo0o.f95808OooOooo = collection;
                            c27434o000oo0o.f95811Oooo000 = it;
                            c27434o000oo0o.f95812Oooo00O = collection;
                            c27434o000oo0o.f95822OoooO00 = i4;
                            int i42 = i4;
                            c27434o000oo0o.f95824OoooOO0 = 3;
                            Serializable serializableOooO0OO2 = c26620o00Oo00o.OooO0OO(str48, str2, c27434o000oo0o);
                            if (serializableOooO0OO2 != enumC32485OooO00o32) {
                                list9 = list4;
                                map = linkedHashMap;
                                list10 = list5;
                                list11 = list6;
                                objOooo0 = serializableOooO0OO2;
                                collection2 = collection;
                                i4 = i42;
                                collection.add((List) objOooo0);
                                collection = collection2;
                                list5 = list10;
                                list6 = list11;
                                list4 = list9;
                                linkedHashMap = map;
                                str45 = str9;
                                str47 = str8;
                                if (!it.hasNext()) {
                                    int i43 = i4;
                                    str5 = str45;
                                    str6 = str47;
                                    ArrayList arrayListOooOo00 = C34428OooOOo.OooOo00((List) collection);
                                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayListOooOo00, 10))));
                                    Iterator it37 = arrayListOooOo00.iterator();
                                    while (it37.hasNext()) {
                                        C32443OooOOO c32443OooOOOOooO0Oo = C25749OooOoO0.OooO0Oo(((Outline) it37.next()).getId(), UUID.randomUUID().toString());
                                        linkedHashMap5.put(c32443OooOOOOooO0Oo.OooO0O0(), c32443OooOOOOooO0Oo.OooO0OO());
                                    }
                                    linkedHashMap.putAll(linkedHashMap5);
                                    List list128 = list4;
                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list128, 10))));
                                    str7 = str2;
                                    list7 = list6;
                                    it2 = list128.iterator();
                                    linkedHashMap2 = linkedHashMap6;
                                    c27434o000oo0o2 = c27434o000oo0o;
                                    list8 = list5;
                                    c27449o00O0OoO3 = c27449o00O0OoO2;
                                    i5 = i43;
                                    list18 = arrayListOooOo00;
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        str12 = (String) next;
                                        str11 = str46;
                                        C27020OooOoO0 c27020OooOoO02 = c27449o00O0OoO3.f96039OooO0o;
                                        c27434o000oo0o2.f95801OooOo0o = c27449o00O0OoO3;
                                        c27434o000oo0o2.f95800OooOo = str7;
                                        c27434o000oo0o2.f95803OooOoO0 = note5;
                                        c27434o000oo0o2.f95802OooOoO = list7;
                                        c27434o000oo0o2.f95804OooOoOO = str4;
                                        c27434o000oo0o2.f95806OooOoo0 = list8;
                                        c27434o000oo0o2.f95805OooOoo = linkedHashMap;
                                        c27434o000oo0o2.f95807OooOooO = list18;
                                        c27434o000oo0o2.f95808OooOooo = linkedHashMap2;
                                        c27434o000oo0o2.f95811Oooo000 = it2;
                                        c27434o000oo0o2.f95812Oooo00O = str12;
                                        c27434o000oo0o2.f95813Oooo00o = linkedHashMap2;
                                        c27434o000oo0o2.f95810Oooo0 = next;
                                        List list129 = list18;
                                        c27434o000oo0o2.f95814Oooo0O0 = null;
                                        c27434o000oo0o2.f95815Oooo0OO = null;
                                        c27434o000oo0o2.f95822OoooO00 = i5;
                                        c27434o000oo0o2.f95824OoooOO0 = 4;
                                        Object objOooO0Oo = c27020OooOoO02.OooO0Oo(str12, str7, c27434o000oo0o2);
                                        if (objOooO0Oo != enumC32485OooO00o32) {
                                            obj = objOooO0Oo;
                                            i6 = i5;
                                            linkedHashMap3 = linkedHashMap2;
                                            str10 = str4;
                                            c27434o000oo0o3 = c27434o000oo0o2;
                                            it3 = it2;
                                            list12 = list129;
                                            map2 = linkedHashMap3;
                                            EnumC32485OooO00o enumC32485OooO00o33 = enumC32485OooO00o32;
                                            page = (Page) obj;
                                            if (page == null) {
                                                i7 = i6;
                                                page.setId(UUID.randomUUID().toString());
                                                page.setNoteId(str10);
                                                if (page.getTnPath().length() == 0) {
                                                    note6 = note5;
                                                    enumC32485OooO00o = enumC32485OooO00o33;
                                                    i8 = i7;
                                                    page5 = page;
                                                    list15 = list12;
                                                    map3 = linkedHashMap;
                                                    list16 = list8;
                                                    page6 = page5;
                                                    it4 = it3;
                                                    c27449o00O0OoO5 = c27449o00O0OoO3;
                                                    obj3 = next;
                                                    str15 = str11;
                                                    linkedHashMap4 = linkedHashMap3;
                                                    str16 = str7;
                                                    list17 = list7;
                                                    map4 = map2;
                                                    c27434o000oo0o4 = c27434o000oo0o3;
                                                    page7 = page6;
                                                    page6.setTnPath(str15);
                                                    page7.setInTrashBin(false);
                                                    page7.setRecoverIndex(-1);
                                                    String str49 = str11;
                                                    page7.setRecoverNoteId(str49);
                                                    page7.setRecoverNoteTitle(str49);
                                                    page7.setHistoryPageIdList(null);
                                                    c27449o00O0OoO3 = c27449o00O0OoO5;
                                                    list8 = list16;
                                                    c27434o000oo0o2 = c27434o000oo0o4;
                                                    map2 = map4;
                                                    list7 = list17;
                                                    str7 = str16;
                                                    linkedHashMap2 = linkedHashMap4;
                                                    next = obj3;
                                                    it3 = it4;
                                                    linkedHashMap = map3;
                                                    note5 = note6;
                                                    page2 = page5;
                                                    str13 = str10;
                                                    i5 = i8;
                                                    list13 = list15;
                                                    map2.put(next, page2);
                                                    enumC32485OooO00o32 = enumC32485OooO00o;
                                                    it2 = it3;
                                                    str46 = str11;
                                                    str4 = str13;
                                                    list18 = list13;
                                                    if (it2.hasNext()) {
                                                        List list130 = list18;
                                                        enumC32485OooO00o2 = enumC32485OooO00o32;
                                                        boolean z = !kotlin.jvm.internal.OooOOO0.OooO0O0(str7, str4);
                                                        String str50 = str4;
                                                        str17 = str7;
                                                        str18 = str50;
                                                        map5 = linkedHashMap2;
                                                        it5 = linkedHashMap2.entrySet().iterator();
                                                        list19 = list8;
                                                        c27449o00O0OoO6 = c27449o00O0OoO3;
                                                        i9 = i5;
                                                        r1 = z;
                                                        list20 = list130;
                                                        if (!it5.hasNext()) {
                                                            Map.Entry entry = (Map.Entry) it5.next();
                                                            str19 = (String) entry.getKey();
                                                            Page page20 = (Page) entry.getValue();
                                                            if (page20 != null) {
                                                                EnumC32485OooO00o enumC32485OooO00o34 = enumC32485OooO00o2;
                                                                arrayList = new ArrayList();
                                                                i11 = r1 == true ? 1 : 0;
                                                                InterfaceC27323Oooo0oO interfaceC27323Oooo0oO2 = c27449o00O0OoO6.f96034OooO;
                                                                c27434o000oo0o2.f95801OooOo0o = c27449o00O0OoO6;
                                                                c27434o000oo0o2.f95800OooOo = str17;
                                                                c27434o000oo0o2.f95803OooOoO0 = note5;
                                                                c27434o000oo0o2.f95802OooOoO = list7;
                                                                c27434o000oo0o2.f95804OooOoOO = str18;
                                                                c27434o000oo0o2.f95806OooOoo0 = list19;
                                                                c27434o000oo0o2.f95805OooOoo = linkedHashMap;
                                                                c27434o000oo0o2.f95807OooOooO = list20;
                                                                c27434o000oo0o2.f95808OooOooo = map5;
                                                                c27434o000oo0o2.f95811Oooo000 = it5;
                                                                c27434o000oo0o2.f95812Oooo00O = str19;
                                                                c27434o000oo0o2.f95813Oooo00o = page20;
                                                                c27434o000oo0o2.f95810Oooo0 = arrayList;
                                                                Iterator it38 = it5;
                                                                c27434o000oo0o2.f95814Oooo0O0 = null;
                                                                c27434o000oo0o2.f95815Oooo0OO = null;
                                                                c27434o000oo0o2.f95822OoooO00 = i9;
                                                                c27434o000oo0o2.f95821OoooO0 = i11 == true ? 1 : 0;
                                                                c27434o000oo0o2.f95824OoooOO0 = 6;
                                                                Object objOooO0oo = interfaceC27323Oooo0oO2.OooO0oo(str19, str17, c27434o000oo0o2);
                                                                enumC32485OooO00o28 = enumC32485OooO00o34;
                                                                if (objOooO0oo != enumC32485OooO00o28) {
                                                                    enumC32485OooO00o3 = enumC32485OooO00o28;
                                                                    list21 = list19;
                                                                    map6 = map5;
                                                                    page8 = page20;
                                                                    it6 = it38;
                                                                    obj4 = objOooO0oo;
                                                                    c27449o00O0OoO7 = c27449o00O0OoO6;
                                                                    c27434o000oo0o = c27434o000oo0o2;
                                                                    i10 = i9;
                                                                    map7 = linkedHashMap;
                                                                    list22 = list20;
                                                                    Iterable iterable = (Iterable) obj4;
                                                                    int i44 = i10;
                                                                    Page page21 = page8;
                                                                    String str51 = str19;
                                                                    ArrayList arrayList7 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
                                                                    it29 = iterable.iterator();
                                                                    while (it29.hasNext()) {
                                                                        Stroke stroke = (Stroke) it29.next();
                                                                        Iterator it39 = it29;
                                                                        INoteinDisplayItem iNoteinDisplayItemDeepCopy = stroke.deepCopy(C24761OooO.OooO00o(str6), stroke.layerId, stroke.creationTime);
                                                                        kotlin.jvm.internal.OooOOO0.OooO0o0(iNoteinDisplayItemDeepCopy, "null cannot be cast to non-null type com.orion.notein.domain.models.page.Stroke");
                                                                        arrayList7.add(Stroke.copy$default((Stroke) iNoteinDisplayItemDeepCopy, null, page21.getId(), null, 0L, null, null, 61, null));
                                                                        it29 = it39;
                                                                        str18 = str18;
                                                                        it6 = it6;
                                                                    }
                                                                    arrayList.addAll(arrayList7);
                                                                    C26596o00O0o0 c26596o00O0o0 = c27449o00O0OoO7.f96047OooOOO0;
                                                                    c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO7;
                                                                    c27434o000oo0o.f95800OooOo = str17;
                                                                    c27434o000oo0o.f95803OooOoO0 = note5;
                                                                    c27434o000oo0o.f95802OooOoO = list7;
                                                                    c27434o000oo0o.f95804OooOoOO = str18;
                                                                    c27434o000oo0o.f95806OooOoo0 = list21;
                                                                    c27434o000oo0o.f95805OooOoo = map7;
                                                                    c27434o000oo0o.f95807OooOooO = list22;
                                                                    c27434o000oo0o.f95808OooOooo = map6;
                                                                    c27434o000oo0o.f95811Oooo000 = it6;
                                                                    str20 = str51;
                                                                    c27434o000oo0o.f95812Oooo00O = str20;
                                                                    page9 = page21;
                                                                    c27434o000oo0o.f95813Oooo00o = page9;
                                                                    c27434o000oo0o.f95810Oooo0 = arrayList;
                                                                    i12 = i44;
                                                                    c27434o000oo0o.f95822OoooO00 = i12;
                                                                    c27449o00O0OoO8 = c27449o00O0OoO7;
                                                                    c27434o000oo0o.f95821OoooO0 = i11 == true ? 1 : 0 ? 1 : 0;
                                                                    c27434o000oo0o.f95824OoooOO0 = 7;
                                                                    serializableOooOOO0 = c26596o00O0o0.OooOOO0(str20, str17, c27434o000oo0o);
                                                                    enumC32485OooO00o4 = enumC32485OooO00o3;
                                                                    if (serializableOooOOO0 != enumC32485OooO00o4) {
                                                                        return enumC32485OooO00o4;
                                                                    }
                                                                    Map map32 = map7;
                                                                    objOooo0 = serializableOooOOO0;
                                                                    map8 = map32;
                                                                    List list131 = arrayList;
                                                                    list24 = list21;
                                                                    list23 = list131;
                                                                    list25 = list22;
                                                                    Iterable iterable2 = (Iterable) objOooo0;
                                                                    Map map33 = map8;
                                                                    C27434o000oo0o c27434o000oo0o9 = c27434o000oo0o;
                                                                    Map map34 = map6;
                                                                    ArrayList arrayList8 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
                                                                    it28 = iterable2.iterator();
                                                                    while (it28.hasNext()) {
                                                                        arrayList8.add(Image.copy$default((Image) it28.next(), C24761OooO.OooO00o(str6), page9.getId(), null, null, null, 0.0f, 0L, 0L, false, 508, null));
                                                                    }
                                                                    ArrayList arrayList9 = new ArrayList(C34428OooOOo.OooOOoo(arrayList8, 10));
                                                                    Iterator it40 = it6;
                                                                    it7 = arrayList8.iterator();
                                                                    c27449o00O0OoO9 = c27449o00O0OoO8;
                                                                    i13 = i12;
                                                                    list27 = list24;
                                                                    it8 = it40;
                                                                    c27434o000oo0o = c27434o000oo0o9;
                                                                    enumC32485OooO00o5 = enumC32485OooO00o4;
                                                                    list28 = list23;
                                                                    list26 = list25;
                                                                    map10 = map34;
                                                                    collection3 = arrayList9;
                                                                    map9 = map33;
                                                                    while (true) {
                                                                        if (!it7.hasNext()) {
                                                                            Collection collection9 = collection3;
                                                                            Page page22 = page9;
                                                                            int i45 = i13;
                                                                            enumC32485OooO00o28 = enumC32485OooO00o5;
                                                                            list30 = list28;
                                                                            list30.addAll((List) collection9);
                                                                            C26649o00OoooO c26649o00OoooO2 = c27449o00O0OoO9.f96051OooOOo0;
                                                                            c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO9;
                                                                            c27434o000oo0o.f95800OooOo = str17;
                                                                            c27434o000oo0o.f95803OooOoO0 = note5;
                                                                            c27434o000oo0o.f95802OooOoO = list7;
                                                                            c27434o000oo0o.f95804OooOoOO = str18;
                                                                            c27434o000oo0o.f95806OooOoo0 = list27;
                                                                            c27434o000oo0o.f95805OooOoo = map9;
                                                                            c27434o000oo0o.f95807OooOooO = list26;
                                                                            c27434o000oo0o.f95808OooOooo = map10;
                                                                            c27434o000oo0o.f95811Oooo000 = it8;
                                                                            c27434o000oo0o.f95812Oooo00O = str20;
                                                                            C27449o00O0OoO c27449o00O0OoO33 = c27449o00O0OoO9;
                                                                            c27434o000oo0o.f95813Oooo00o = page22;
                                                                            c27434o000oo0o.f95810Oooo0 = list30;
                                                                            c27434o000oo0o.f95814Oooo0O0 = null;
                                                                            c27434o000oo0o.f95815Oooo0OO = null;
                                                                            c27434o000oo0o.f95817Oooo0o0 = null;
                                                                            c27434o000oo0o.f95816Oooo0o = null;
                                                                            c27434o000oo0o.f95822OoooO00 = i45;
                                                                            c27434o000oo0o.f95821OoooO0 = i11 == true ? 1 : 0 ? 1 : 0;
                                                                            c27434o000oo0o.f95824OoooOO0 = 9;
                                                                            Serializable serializableOooO0OO3 = c26649o00OoooO2.OooO0OO(str20, str17, c27434o000oo0o);
                                                                            if (serializableOooO0OO3 != enumC32485OooO00o28) {
                                                                                obj5 = serializableOooO0OO3;
                                                                                enumC32485OooO00o6 = enumC32485OooO00o28;
                                                                                page10 = page22;
                                                                                list31 = list27;
                                                                                i14 = i45;
                                                                                it9 = it8;
                                                                                list29 = list26;
                                                                                c27449o00O0OoO10 = c27449o00O0OoO33;
                                                                            }
                                                                            break;
                                                                        } else {
                                                                            it27 = it7;
                                                                            image3 = (Image) it7.next();
                                                                            collection6 = collection3;
                                                                            C26596o00O0o0 c26596o00O0o02 = c27449o00O0OoO9.f96047OooOOO0;
                                                                            list96 = list28;
                                                                            File file = new File(image3.getUri());
                                                                            String str52 = image3.id;
                                                                            c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO9;
                                                                            c27434o000oo0o.f95800OooOo = str17;
                                                                            c27434o000oo0o.f95803OooOoO0 = note5;
                                                                            c27434o000oo0o.f95802OooOoO = list7;
                                                                            c27434o000oo0o.f95804OooOoOO = str18;
                                                                            c27434o000oo0o.f95806OooOoo0 = list27;
                                                                            c27434o000oo0o.f95805OooOoo = map9;
                                                                            c27434o000oo0o.f95807OooOooO = list26;
                                                                            c27434o000oo0o.f95808OooOooo = map10;
                                                                            c27434o000oo0o.f95811Oooo000 = it8;
                                                                            c27434o000oo0o.f95812Oooo00O = str20;
                                                                            c27434o000oo0o.f95813Oooo00o = page9;
                                                                            page19 = page9;
                                                                            c27434o000oo0o.f95810Oooo0 = list96;
                                                                            str36 = str20;
                                                                            c27434o000oo0o.f95814Oooo0O0 = collection6;
                                                                            c27434o000oo0o.f95815Oooo0OO = it27;
                                                                            c27434o000oo0o.f95817Oooo0o0 = image3;
                                                                            c27434o000oo0o.f95816Oooo0o = collection6;
                                                                            i34 = i13;
                                                                            c27434o000oo0o.f95822OoooO00 = i34;
                                                                            c27434o000oo0o.f95821OoooO0 = i11 == true ? 1 : 0 ? 1 : 0;
                                                                            c27434o000oo0o.f95824OoooOO0 = 8;
                                                                            objOooO0oO2 = c26596o00O0o02.OooO0oO(file, str18, str52, c27434o000oo0o);
                                                                            enumC32485OooO00o28 = enumC32485OooO00o5;
                                                                            if (objOooO0oO2 != enumC32485OooO00o28) {
                                                                                C27434o000oo0o c27434o000oo0o10 = c27434o000oo0o;
                                                                                Map map35 = map9;
                                                                                String str53 = str17;
                                                                                Map map36 = map10;
                                                                                Note note13 = note5;
                                                                                boolean z2 = i11 == true ? 1 : 0;
                                                                                Iterator it41 = it8;
                                                                                collection6.add(Image.copy$default(image3, null, null, (String) objOooO0oO2, null, null, 0.0f, 0L, 0L, false, 507, null));
                                                                                map9 = map35;
                                                                                c27434o000oo0o = c27434o000oo0o10;
                                                                                enumC32485OooO00o5 = enumC32485OooO00o28;
                                                                                collection3 = collection6;
                                                                                list28 = list96;
                                                                                it7 = it27;
                                                                                page9 = page19;
                                                                                str20 = str36;
                                                                                it8 = it41;
                                                                                str17 = str53;
                                                                                map10 = map36;
                                                                                note5 = note13;
                                                                                i11 = z2 ? 1 : 0;
                                                                                i13 = i34;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                return enumC32485OooO00o28;
                                                            }
                                                            map28 = linkedHashMap;
                                                            map22 = map5;
                                                            enumC32485OooO00o22 = enumC32485OooO00o2;
                                                            list101 = list20;
                                                            r12 = r1;
                                                            enumC32485OooO00o2 = enumC32485OooO00o22;
                                                            map5 = map22;
                                                            linkedHashMap = map28;
                                                            list20 = list101;
                                                            r1 = r12;
                                                            if (!it5.hasNext()) {
                                                                enumC32485OooO00o29 = enumC32485OooO00o2;
                                                                List listOooo0o02 = oOo000Oo.OooOo.Oooo0o0(map5.values());
                                                                ArrayList arrayList10 = new ArrayList();
                                                                for (Object obj12 : listOooo0o02) {
                                                                    if (!(((Page) obj12).getPaperTheme() instanceof PdfPaperTheme)) {
                                                                        arrayList10.add(obj12);
                                                                    }
                                                                }
                                                                C34406OooO00o.f123390OooO00o.OooO00o(androidx.core.app.OooO.OooO00o(arrayList10.size(), "batchInsertSourcePagesToTargetNote, inserted no pdf pages' size is ", ", dstNoteId: ", str18), new Object[0]);
                                                                C27020OooOoO0 c27020OooOoO03 = c27449o00O0OoO6.f96039OooO0o;
                                                                c27434o000oo0o2.f95801OooOo0o = c27449o00O0OoO6;
                                                                c27434o000oo0o2.f95800OooOo = str17;
                                                                c27434o000oo0o2.f95803OooOoO0 = note5;
                                                                c27434o000oo0o2.f95802OooOoO = str18;
                                                                c27434o000oo0o2.f95804OooOoOO = list19;
                                                                c27434o000oo0o2.f95806OooOoo0 = linkedHashMap;
                                                                c27434o000oo0o2.f95805OooOoo = list20;
                                                                c27434o000oo0o2.f95807OooOooO = listOooo0o02;
                                                                c27434o000oo0o2.f95808OooOooo = arrayList10;
                                                                c27434o000oo0o2.f95811Oooo000 = null;
                                                                c27434o000oo0o2.f95812Oooo00O = null;
                                                                c27434o000oo0o2.f95813Oooo00o = null;
                                                                c27434o000oo0o2.f95810Oooo0 = null;
                                                                c27434o000oo0o2.f95814Oooo0O0 = null;
                                                                c27434o000oo0o2.f95815Oooo0OO = null;
                                                                c27434o000oo0o2.f95822OoooO00 = i9;
                                                                c27434o000oo0o2.f95824OoooOO0 = 27;
                                                                if (c27020OooOoO03.OooO00o(str18, arrayList10, c27434o000oo0o2) == enumC32485OooO00o29) {
                                                                    return enumC32485OooO00o29;
                                                                }
                                                                list97 = listOooo0o02;
                                                                list98 = arrayList10;
                                                                list99 = list20;
                                                                list100 = list19;
                                                                str37 = str18;
                                                                map29 = linkedHashMap;
                                                                note9 = note5;
                                                                c27449o00O0OoO25 = c27449o00O0OoO6;
                                                                c27434o000oo0o = c27434o000oo0o2;
                                                                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str17, str37)) {
                                                                    ArrayList arrayList11 = new ArrayList();
                                                                    for (Object obj13 : list97) {
                                                                        if (((Page) obj13).getPaperTheme() instanceof PdfPaperTheme) {
                                                                            arrayList11.add(obj13);
                                                                        }
                                                                    }
                                                                    C27020OooOoO0 c27020OooOoO04 = c27449o00O0OoO25.f96039OooO0o;
                                                                    c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO25;
                                                                    c27434o000oo0o.f95800OooOo = note9;
                                                                    c27434o000oo0o.f95803OooOoO0 = str37;
                                                                    c27434o000oo0o.f95802OooOoO = list100;
                                                                    c27434o000oo0o.f95804OooOoOO = map29;
                                                                    c27434o000oo0o.f95806OooOoo0 = list99;
                                                                    c27434o000oo0o.f95805OooOoo = list97;
                                                                    c27434o000oo0o.f95807OooOooO = list98;
                                                                    c27434o000oo0o.f95808OooOooo = arrayList11;
                                                                    c27434o000oo0o.f95822OoooO00 = i9;
                                                                    c27434o000oo0o.f95824OoooOO0 = 28;
                                                                    if (c27020OooOoO04.OooO00o(str37, arrayList11, c27434o000oo0o) == enumC32485OooO00o29) {
                                                                        return enumC32485OooO00o29;
                                                                    }
                                                                    c27449o00O0OoO26 = c27449o00O0OoO25;
                                                                    list104 = arrayList11;
                                                                    list103 = list99;
                                                                    list105 = list100;
                                                                    c27449o00O0OoO27 = c27449o00O0OoO26;
                                                                    list112 = list104;
                                                                    list111 = list103;
                                                                    ArrayList arrayListOooooOO = oOo000Oo.OooOo.OooooOO(list98, list112);
                                                                    ArrayList arrayList12 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO, 10));
                                                                    it32 = arrayListOooooOO.iterator();
                                                                    while (it32.hasNext()) {
                                                                        arrayList12.add(((Page) it32.next()).getId());
                                                                    }
                                                                    ArrayList arrayList13 = new ArrayList();
                                                                    for (Object obj14 : list97) {
                                                                        if (arrayList12.contains(((Page) obj14).getId())) {
                                                                            arrayList13.add(obj14);
                                                                        }
                                                                    }
                                                                    ArrayList arrayList14 = new ArrayList(C34428OooOOo.OooOOoo(arrayList13, 10));
                                                                    it33 = arrayList13.iterator();
                                                                    while (it33.hasNext()) {
                                                                        arrayList14.add(new Page(((Page) it33.next()).getId(), null, null, null, null, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524286, null));
                                                                    }
                                                                    ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(note9.getPages());
                                                                    arrayListO0ooOoO.addAll(i9, arrayList14);
                                                                    ArrayList arrayList15 = new ArrayList();
                                                                    for (Object obj15 : list111) {
                                                                        if (((Outline) obj15).getParentId() == null) {
                                                                            arrayList15.add(obj15);
                                                                        }
                                                                    }
                                                                    ArrayList arrayList16 = new ArrayList();
                                                                    it34 = arrayList15.iterator();
                                                                    while (it34.hasNext()) {
                                                                        String str54 = (String) map29.get(((Outline) it34.next()).getId());
                                                                        if (str54 != null) {
                                                                            arrayList16.add(str54);
                                                                        }
                                                                    }
                                                                    List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(note9.getOutlines());
                                                                    c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO27;
                                                                    c27434o000oo0o.f95800OooOo = note9;
                                                                    c27434o000oo0o.f95803OooOoO0 = str37;
                                                                    c27434o000oo0o.f95802OooOoO = list105;
                                                                    c27434o000oo0o.f95804OooOoOO = arrayListO0ooOoO;
                                                                    c27434o000oo0o.f95806OooOoo0 = null;
                                                                    c27434o000oo0o.f95805OooOoo = null;
                                                                    c27434o000oo0o.f95807OooOooO = null;
                                                                    c27434o000oo0o.f95808OooOooo = null;
                                                                    c27434o000oo0o.f95811Oooo000 = null;
                                                                    c27434o000oo0o.f95812Oooo00O = null;
                                                                    c27434o000oo0o.f95824OoooOO0 = 32;
                                                                    objOooo0 = c27449o00O0OoO27.Oooo0(arrayList16, str37, listO0ooOO0, c27434o000oo0o);
                                                                    if (objOooo0 == enumC32485OooO00o29) {
                                                                        return enumC32485OooO00o29;
                                                                    }
                                                                    list113 = arrayListO0ooOoO;
                                                                    str42 = str37;
                                                                    List list132 = (List) objOooo0;
                                                                    InterfaceC27309OooOoO interfaceC27309OooOoO = c27449o00O0OoO27.f96035OooO00o;
                                                                    c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO27;
                                                                    c27434o000oo0o.f95800OooOo = note9;
                                                                    c27434o000oo0o.f95803OooOoO0 = str42;
                                                                    c27434o000oo0o.f95802OooOoO = list105;
                                                                    c27434o000oo0o.f95804OooOoOO = list113;
                                                                    c27434o000oo0o.f95806OooOoo0 = list132;
                                                                    c27434o000oo0o.f95824OoooOO0 = 33;
                                                                    objOooOO0o = interfaceC27309OooOoO.OooOO0o(str42, c27434o000oo0o);
                                                                    if (objOooOO0o != enumC32485OooO00o29) {
                                                                        return enumC32485OooO00o29;
                                                                    }
                                                                    list124 = list132;
                                                                    objOooo0 = objOooOO0o;
                                                                    list125 = list113;
                                                                    c27449o00O0OoO30 = c27449o00O0OoO27;
                                                                    note12 = note9;
                                                                    if (objOooo0 != null) {
                                                                        List list133 = list125;
                                                                        Page page23 = (Page) oOo000Oo.OooOo.Oooo(list133);
                                                                        List list134 = list105;
                                                                        ArrayList arrayList17 = new ArrayList(C34428OooOOo.OooOOoo(list134, 10));
                                                                        Iterator it42 = list134.iterator();
                                                                        while (it42.hasNext()) {
                                                                            arrayList17.add(((PageLayer) it42.next()).getId());
                                                                        }
                                                                        Note noteCopy$default = Note.copy$default(note12, null, null, null, null, null, false, page23, list133, arrayList17, list124, 0L, 0L, null, null, false, 0, null, 0.0f, null, false, false, 2096191, null);
                                                                        C34406OooO00o.f123390OooO00o.OooO00o("batchInsertSourcePagesToTargetNote, dupTargetNote: " + noteCopy$default, new Object[0]);
                                                                        c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO30;
                                                                        c27434o000oo0o.f95800OooOo = str42;
                                                                        c27449o00O0OoO31 = null;
                                                                        c27434o000oo0o.f95803OooOoO0 = null;
                                                                        c27434o000oo0o.f95802OooOoO = null;
                                                                        c27434o000oo0o.f95804OooOoOO = null;
                                                                        c27434o000oo0o.f95806OooOoo0 = null;
                                                                        c27434o000oo0o.f95824OoooOO0 = 37;
                                                                        if (c27449o00O0OoO30.OooOO0(noteCopy$default, c27434o000oo0o) == enumC32485OooO00o29) {
                                                                            return enumC32485OooO00o29;
                                                                        }
                                                                        c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO31;
                                                                        c27434o000oo0o.f95800OooOo = c27449o00O0OoO31;
                                                                        c27434o000oo0o.f95824OoooOO0 = 38;
                                                                        if (OoooOoo(c27449o00O0OoO30, str42, c27434o000oo0o) == enumC32485OooO00o29) {
                                                                            return enumC32485OooO00o29;
                                                                        }
                                                                        return C32460OooOooO.f116667OooO00o;
                                                                    }
                                                                    List list135 = list105;
                                                                    ArrayList arrayList18 = new ArrayList(C34428OooOOo.OooOOoo(list135, 10));
                                                                    Iterator it43 = list135.iterator();
                                                                    while (it43.hasNext()) {
                                                                        arrayList18.add(((PageLayer) it43.next()).getId());
                                                                    }
                                                                    Note noteCopy$default2 = Note.copy$default(note12, null, null, null, null, null, false, null, list125, arrayList18, list124, 0L, 0L, null, null, false, 0, null, 0.0f, null, false, false, 2096255, null);
                                                                    list126 = list125;
                                                                    noteContentOooO00o = o0oOO.OooO00o(noteCopy$default2);
                                                                    c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO30;
                                                                    c27434o000oo0o.f95800OooOo = list126;
                                                                    c27434o000oo0o.f95803OooOoO0 = noteContentOooO00o;
                                                                    c27449o00O0OoO32 = null;
                                                                    c27434o000oo0o.f95802OooOoO = null;
                                                                    c27434o000oo0o.f95804OooOoOO = null;
                                                                    c27434o000oo0o.f95806OooOoo0 = null;
                                                                    c27434o000oo0o.f95824OoooOO0 = 34;
                                                                    if (c27449o00O0OoO30.OoooOOo(noteContentOooO00o, c27434o000oo0o) == enumC32485OooO00o29) {
                                                                        return enumC32485OooO00o29;
                                                                    }
                                                                    id = noteContentOooO00o.getId();
                                                                    size = list126.size();
                                                                    c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO30;
                                                                    c27434o000oo0o.f95800OooOo = noteContentOooO00o;
                                                                    c27434o000oo0o.f95803OooOoO0 = c27449o00O0OoO32;
                                                                    c27434o000oo0o.f95824OoooOO0 = 35;
                                                                    if (c27449o00O0OoO30.Ooooo00(size, id, c27434o000oo0o) == enumC32485OooO00o29) {
                                                                        return enumC32485OooO00o29;
                                                                    }
                                                                    id2 = noteContentOooO00o.getId();
                                                                    c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO32;
                                                                    c27434o000oo0o.f95800OooOo = c27449o00O0OoO32;
                                                                    c27434o000oo0o.f95824OoooOO0 = 36;
                                                                    if (OoooOoo(c27449o00O0OoO30, id2, c27434o000oo0o) == enumC32485OooO00o29) {
                                                                        return enumC32485OooO00o29;
                                                                    }
                                                                    return C32460OooOooO.f116667OooO00o;
                                                                }
                                                                ArrayList arrayList19 = new ArrayList();
                                                                for (Object obj16 : list97) {
                                                                    if (((Page) obj16).getPaperTheme() instanceof PdfPaperTheme) {
                                                                        arrayList19.add(obj16);
                                                                    }
                                                                }
                                                                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                                                for (Object obj17 : arrayList19) {
                                                                    PaperTheme paperTheme = ((Page) obj17).getPaperTheme();
                                                                    String str55 = str5;
                                                                    kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme, str55);
                                                                    PdfInfo pdfInfo = ((PdfPaperTheme) paperTheme).getPdfInfo();
                                                                    Object obj18 = linkedHashMap7.get(pdfInfo);
                                                                    if (obj18 == null) {
                                                                        i36 = i9;
                                                                        ArrayList arrayList20 = new ArrayList();
                                                                        linkedHashMap7.put(pdfInfo, arrayList20);
                                                                        obj18 = arrayList20;
                                                                    } else {
                                                                        i36 = i9;
                                                                    }
                                                                    ((List) obj18).add(obj17);
                                                                    i9 = i36;
                                                                    str5 = str55;
                                                                }
                                                                str38 = str5;
                                                                int i46 = i9;
                                                                arrayList5 = new ArrayList();
                                                                it30 = linkedHashMap7.entrySet().iterator();
                                                                c27434o000oo0o8 = c27434o000oo0o;
                                                                i35 = i46;
                                                                list121 = list99;
                                                                if (!it30.hasNext()) {
                                                                    Map.Entry entry2 = (Map.Entry) it30.next();
                                                                    PdfInfo pdfInfo2 = (PdfInfo) entry2.getKey();
                                                                    list106 = (List) entry2.getValue();
                                                                    List list136 = list106;
                                                                    EnumC32485OooO00o enumC32485OooO00o35 = enumC32485OooO00o29;
                                                                    LinkedHashMap linkedHashMap8 = new LinkedHashMap(oO0O00oo.OooOO0.OooO0OO(oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list136, 10))));
                                                                    Iterator it44 = list136.iterator();
                                                                    while (it44.hasNext()) {
                                                                        Page page24 = (Page) it44.next();
                                                                        Iterator it45 = it44;
                                                                        PaperTheme paperTheme2 = page24.getPaperTheme();
                                                                        kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme2, str38);
                                                                        C32443OooOOO c32443OooOOOOooO0Oo2 = C25749OooOoO0.OooO0Oo(C25261OooO0o0.OooO0OO(((PdfPaperTheme) paperTheme2).getPageNum()), page24.getId());
                                                                        linkedHashMap8.put(c32443OooOOOOooO0Oo2.OooO0O0(), c32443OooOOOOooO0Oo2.OooO0OO());
                                                                        it44 = it45;
                                                                        str38 = str38;
                                                                    }
                                                                    str40 = str38;
                                                                    C27499o00Ooo0 c27499o00Ooo0 = c27449o00O0OoO25.f96053OooOo;
                                                                    Uri uriFromFile = Uri.fromFile(new File(pdfInfo2.getPdfPath()));
                                                                    List listO0ooOO02 = oOo000Oo.OooOo.o0ooOO0(linkedHashMap8.keySet());
                                                                    String password = pdfInfo2.getPassword();
                                                                    c27434o000oo0o8.f95801OooOo0o = c27449o00O0OoO25;
                                                                    c27434o000oo0o8.f95800OooOo = note9;
                                                                    c27434o000oo0o8.f95803OooOoO0 = str37;
                                                                    c27434o000oo0o8.f95802OooOoO = list100;
                                                                    c27434o000oo0o8.f95804OooOoOO = map29;
                                                                    c27434o000oo0o8.f95806OooOoo0 = list121;
                                                                    c27434o000oo0o8.f95805OooOoo = list97;
                                                                    c27434o000oo0o8.f95807OooOooO = list98;
                                                                    c27434o000oo0o8.f95808OooOooo = arrayList5;
                                                                    c27434o000oo0o8.f95811Oooo000 = it30;
                                                                    c27434o000oo0o8.f95812Oooo00O = list106;
                                                                    c27434o000oo0o8.f95822OoooO00 = i35;
                                                                    c27434o000oo0o8.f95824OoooOO0 = 29;
                                                                    c27499o00Ooo0.getClass();
                                                                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                                                    Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27488o00OoO00(c27499o00Ooo0, listO0ooOO02, uriFromFile, password, null), c27434o000oo0o8);
                                                                    enumC32485OooO00o30 = enumC32485OooO00o35;
                                                                    if (objOooO0o2 == enumC32485OooO00o30) {
                                                                        return enumC32485OooO00o30;
                                                                    }
                                                                    List list137 = list98;
                                                                    it31 = it30;
                                                                    list109 = list100;
                                                                    list108 = list97;
                                                                    collection7 = arrayList5;
                                                                    objOooo0 = objOooO0o2;
                                                                    c27449o00O0OoO28 = c27449o00O0OoO25;
                                                                    str39 = str37;
                                                                    list118 = list121;
                                                                    list107 = list137;
                                                                    note10 = note9;
                                                                    map30 = map29;
                                                                    duplicatedPdfResult = (DuplicatedPdfResult) objOooo0;
                                                                    if (duplicatedPdfResult == null) {
                                                                        String duplicatedPdfPath = duplicatedPdfResult.getDuplicatedPdfPath();
                                                                        Map<Integer, Integer> srcPageNumberToDstPageNumber = duplicatedPdfResult.getSrcPageNumberToDstPageNumber();
                                                                        List list138 = list106;
                                                                        int i47 = i35;
                                                                        EnumC32485OooO00o enumC32485OooO00o36 = enumC32485OooO00o30;
                                                                        ArrayList arrayList21 = new ArrayList(C34428OooOOo.OooOOoo(list138, 10));
                                                                        Iterator it46 = list138.iterator();
                                                                        PdfInfo pdfInfo3 = null;
                                                                        while (it46.hasNext()) {
                                                                            Page page25 = (Page) it46.next();
                                                                            Iterator it47 = it46;
                                                                            PaperTheme paperTheme3 = page25.getPaperTheme();
                                                                            PdfInfo pdfInfo4 = pdfInfo3;
                                                                            String str56 = str40;
                                                                            kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme3, str56);
                                                                            PdfPaperTheme pdfPaperTheme = (PdfPaperTheme) paperTheme3;
                                                                            PdfInfo pdfInfo5 = pdfPaperTheme.getPdfInfo();
                                                                            int pageNum = pdfPaperTheme.getPageNum();
                                                                            PdfInfo pdfInfoCopy$default = PdfInfo.copy$default(pdfInfo5, null, duplicatedPdfPath, null, null, 13, null);
                                                                            PdfInfo pdfInfo6 = pdfInfo4 == null ? pdfInfoCopy$default : pdfInfo4;
                                                                            Integer num = srcPageNumberToDstPageNumber.get(C25261OooO0o0.OooO0OO(pageNum));
                                                                            page25.setPaperTheme(new PdfPaperTheme(null, pdfInfoCopy$default, num != null ? num.intValue() : 0, pdfPaperTheme.getOrientation(), pdfPaperTheme.getName(), pdfPaperTheme.getMyTemplateId()));
                                                                            page25.setSource(2);
                                                                            arrayList21.add(page25);
                                                                            it46 = it47;
                                                                            str40 = str56;
                                                                            pdfInfo3 = pdfInfo6;
                                                                        }
                                                                        PdfInfo pdfInfo7 = pdfInfo3;
                                                                        str41 = str40;
                                                                        if (pdfInfo7 != null) {
                                                                            C26427Oooo0O0 c26427Oooo0O0 = c27449o00O0OoO28.f96042OooO0oo;
                                                                            c27434o000oo0o8.f95801OooOo0o = c27449o00O0OoO28;
                                                                            c27434o000oo0o8.f95800OooOo = note10;
                                                                            c27434o000oo0o8.f95803OooOoO0 = str39;
                                                                            c27434o000oo0o8.f95802OooOoO = list109;
                                                                            c27434o000oo0o8.f95804OooOoOO = map30;
                                                                            c27434o000oo0o8.f95806OooOoo0 = list118;
                                                                            c27434o000oo0o8.f95805OooOoo = list108;
                                                                            c27434o000oo0o8.f95807OooOooO = list107;
                                                                            c27434o000oo0o8.f95808OooOooo = collection7;
                                                                            c27434o000oo0o8.f95811Oooo000 = it31;
                                                                            c27434o000oo0o8.f95812Oooo00O = arrayList21;
                                                                            i37 = i47;
                                                                            c27434o000oo0o8.f95822OoooO00 = i37;
                                                                            c27434o000oo0o8.f95824OoooOO0 = 30;
                                                                            enumC32485OooO00o31 = enumC32485OooO00o36;
                                                                            list110 = arrayList21;
                                                                            list114 = list118;
                                                                            if (c26427Oooo0O0.OooO00o(pdfInfo7, str39, c27434o000oo0o8) != enumC32485OooO00o31) {
                                                                            }
                                                                            return enumC32485OooO00o31;
                                                                        }
                                                                        i37 = i47;
                                                                        enumC32485OooO00o31 = enumC32485OooO00o36;
                                                                        list110 = arrayList21;
                                                                        list114 = list118;
                                                                        Iterator it48 = it31;
                                                                        list115 = list109;
                                                                        List list139 = list108;
                                                                        it35 = it48;
                                                                        List list140 = list114;
                                                                        collection8 = collection7;
                                                                        map31 = map30;
                                                                        list116 = list107;
                                                                        note11 = note10;
                                                                        List list141 = list140;
                                                                        c27020OooOoO0 = c27449o00O0OoO28.f96039OooO0o;
                                                                        c27434o000oo0o8.f95801OooOo0o = c27449o00O0OoO28;
                                                                        c27434o000oo0o8.f95800OooOo = note11;
                                                                        c27434o000oo0o8.f95803OooOoO0 = str39;
                                                                        c27434o000oo0o8.f95802OooOoO = list115;
                                                                        c27434o000oo0o8.f95804OooOoOO = map31;
                                                                        c27434o000oo0o8.f95806OooOoo0 = list141;
                                                                        c27434o000oo0o8.f95805OooOoo = list139;
                                                                        c27434o000oo0o8.f95807OooOooO = list116;
                                                                        c27434o000oo0o8.f95808OooOooo = collection8;
                                                                        c27434o000oo0o8.f95811Oooo000 = it35;
                                                                        c27434o000oo0o8.f95812Oooo00O = list110;
                                                                        c27434o000oo0o8.f95822OoooO00 = i37;
                                                                        c27434o000oo0o8.f95824OoooOO0 = 31;
                                                                        if (c27020OooOoO0.OooO00o(str39, list110, c27434o000oo0o8) != enumC32485OooO00o31) {
                                                                            c27449o00O0OoO29 = c27449o00O0OoO28;
                                                                            i38 = i37;
                                                                            str43 = str39;
                                                                            list117 = list139;
                                                                            list123 = list110;
                                                                            list122 = list141;
                                                                            arrayList5 = collection8;
                                                                            str37 = str43;
                                                                            i39 = i38;
                                                                            list120 = list123;
                                                                            map29 = map31;
                                                                            list97 = list117;
                                                                            c27449o00O0OoO25 = c27449o00O0OoO29;
                                                                            it30 = it35;
                                                                            list100 = list115;
                                                                            list98 = list116;
                                                                            note9 = note11;
                                                                            list119 = list122;
                                                                            if (list120 != null) {
                                                                                arrayList5.add(list120);
                                                                            }
                                                                            enumC32485OooO00o29 = enumC32485OooO00o31;
                                                                            str38 = str41;
                                                                            i35 = i39;
                                                                            list121 = list119;
                                                                            if (!it30.hasNext()) {
                                                                                ArrayList arrayListOooOo002 = C34428OooOOo.OooOo00((List) arrayList5);
                                                                                i9 = i35;
                                                                                c27434o000oo0o = c27434o000oo0o8;
                                                                                list105 = list100;
                                                                                c27449o00O0OoO27 = c27449o00O0OoO25;
                                                                                list112 = arrayListOooOo002;
                                                                                list111 = list121;
                                                                                ArrayList arrayListOooooOO2 = oOo000Oo.OooOo.OooooOO(list98, list112);
                                                                                ArrayList arrayList122 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO2, 10));
                                                                                it32 = arrayListOooooOO2.iterator();
                                                                                while (it32.hasNext()) {
                                                                                }
                                                                                ArrayList arrayList132 = new ArrayList();
                                                                                while (r6.hasNext()) {
                                                                                }
                                                                                ArrayList arrayList142 = new ArrayList(C34428OooOOo.OooOOoo(arrayList132, 10));
                                                                                it33 = arrayList132.iterator();
                                                                                while (it33.hasNext()) {
                                                                                }
                                                                                ArrayList arrayListO0ooOoO2 = oOo000Oo.OooOo.o0ooOoO(note9.getPages());
                                                                                arrayListO0ooOoO2.addAll(i9, arrayList142);
                                                                                ArrayList arrayList152 = new ArrayList();
                                                                                while (r5.hasNext()) {
                                                                                }
                                                                                ArrayList arrayList162 = new ArrayList();
                                                                                it34 = arrayList152.iterator();
                                                                                while (it34.hasNext()) {
                                                                                }
                                                                                List listO0ooOO03 = oOo000Oo.OooOo.o0ooOO0(note9.getOutlines());
                                                                                c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO27;
                                                                                c27434o000oo0o.f95800OooOo = note9;
                                                                                c27434o000oo0o.f95803OooOoO0 = str37;
                                                                                c27434o000oo0o.f95802OooOoO = list105;
                                                                                c27434o000oo0o.f95804OooOoOO = arrayListO0ooOoO2;
                                                                                c27434o000oo0o.f95806OooOoo0 = null;
                                                                                c27434o000oo0o.f95805OooOoo = null;
                                                                                c27434o000oo0o.f95807OooOooO = null;
                                                                                c27434o000oo0o.f95808OooOooo = null;
                                                                                c27434o000oo0o.f95811Oooo000 = null;
                                                                                c27434o000oo0o.f95812Oooo00O = null;
                                                                                c27434o000oo0o.f95824OoooOO0 = 32;
                                                                                objOooo0 = c27449o00O0OoO27.Oooo0(arrayList162, str37, listO0ooOO03, c27434o000oo0o);
                                                                                if (objOooo0 == enumC32485OooO00o29) {
                                                                                }
                                                                            }
                                                                        }
                                                                        return enumC32485OooO00o31;
                                                                    }
                                                                    EnumC32485OooO00o enumC32485OooO00o37 = enumC32485OooO00o30;
                                                                    i39 = i35;
                                                                    enumC32485OooO00o31 = enumC32485OooO00o37;
                                                                    str41 = str40;
                                                                    arrayList5 = collection7;
                                                                    list97 = list108;
                                                                    map29 = map30;
                                                                    note9 = note10;
                                                                    list100 = list109;
                                                                    it30 = it31;
                                                                    list98 = list107;
                                                                    list119 = list118;
                                                                    str37 = str39;
                                                                    c27449o00O0OoO25 = c27449o00O0OoO28;
                                                                    list120 = null;
                                                                    if (list120 != null) {
                                                                    }
                                                                    enumC32485OooO00o29 = enumC32485OooO00o31;
                                                                    str38 = str41;
                                                                    i35 = i39;
                                                                    list121 = list119;
                                                                    if (!it30.hasNext()) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    String strOooO0Oo = Oooo0oO.o0Oo0oo.OooO0Oo(str7, C18115b5.CONNECTOR, str12);
                                                    String strOooO0Oo2 = Oooo0oO.o0Oo0oo.OooO0Oo(str10, C18115b5.CONNECTOR, page.getId());
                                                    C26681o00o0oOO c26681o00o0oOO = c27449o00O0OoO3.f96041OooO0oO;
                                                    c27434o000oo0o3.f95801OooOo0o = c27449o00O0OoO3;
                                                    c27434o000oo0o3.f95800OooOo = str7;
                                                    c27434o000oo0o3.f95803OooOoO0 = note5;
                                                    c27434o000oo0o3.f95802OooOoO = list7;
                                                    c27434o000oo0o3.f95804OooOoOO = str10;
                                                    c27434o000oo0o3.f95806OooOoo0 = list8;
                                                    c27434o000oo0o3.f95805OooOoo = linkedHashMap;
                                                    c27434o000oo0o3.f95807OooOooO = list12;
                                                    c27434o000oo0o3.f95808OooOooo = linkedHashMap3;
                                                    c27434o000oo0o3.f95811Oooo000 = it3;
                                                    c27434o000oo0o3.f95812Oooo00O = page;
                                                    c27434o000oo0o3.f95813Oooo00o = page;
                                                    c27434o000oo0o3.f95810Oooo0 = page;
                                                    c27434o000oo0o3.f95814Oooo0O0 = map2;
                                                    c27434o000oo0o3.f95815Oooo0OO = next;
                                                    str14 = str10;
                                                    c27434o000oo0o3.f95822OoooO00 = i7;
                                                    c27434o000oo0o3.f95824OoooOO0 = 5;
                                                    String strOooO00o = c26681o00o0oOO.OooO00o(strOooO0Oo, strOooO0Oo2);
                                                    enumC32485OooO00o = enumC32485OooO00o33;
                                                    if (strOooO00o == enumC32485OooO00o) {
                                                        return enumC32485OooO00o;
                                                    }
                                                    c27449o00O0OoO4 = c27449o00O0OoO3;
                                                    list14 = list12;
                                                    obj2 = next;
                                                    objOooo0 = strOooO00o;
                                                    page3 = page;
                                                    page4 = page3;
                                                    str15 = (String) objOooo0;
                                                    C27434o000oo0o c27434o000oo0o11 = c27434o000oo0o3;
                                                    page7 = page3;
                                                    i8 = i7;
                                                    page5 = page4;
                                                    linkedHashMap4 = linkedHashMap3;
                                                    str16 = str7;
                                                    list17 = list7;
                                                    map4 = map2;
                                                    c27434o000oo0o4 = c27434o000oo0o11;
                                                    List list142 = list8;
                                                    c27449o00O0OoO5 = c27449o00O0OoO4;
                                                    str10 = str14;
                                                    note6 = note5;
                                                    map3 = linkedHashMap;
                                                    it4 = it3;
                                                    obj3 = obj2;
                                                    page6 = page;
                                                    list16 = list142;
                                                    list15 = list14;
                                                    page6.setTnPath(str15);
                                                    page7.setInTrashBin(false);
                                                    page7.setRecoverIndex(-1);
                                                    String str492 = str11;
                                                    page7.setRecoverNoteId(str492);
                                                    page7.setRecoverNoteTitle(str492);
                                                    page7.setHistoryPageIdList(null);
                                                    c27449o00O0OoO3 = c27449o00O0OoO5;
                                                    list8 = list16;
                                                    c27434o000oo0o2 = c27434o000oo0o4;
                                                    map2 = map4;
                                                    list7 = list17;
                                                    str7 = str16;
                                                    linkedHashMap2 = linkedHashMap4;
                                                    next = obj3;
                                                    it3 = it4;
                                                    linkedHashMap = map3;
                                                    note5 = note6;
                                                    page2 = page5;
                                                    str13 = str10;
                                                    i5 = i8;
                                                    list13 = list15;
                                                    map2.put(next, page2);
                                                    enumC32485OooO00o32 = enumC32485OooO00o;
                                                    it2 = it3;
                                                    str46 = str11;
                                                    str4 = str13;
                                                    list18 = list13;
                                                    if (it2.hasNext()) {
                                                    }
                                                }
                                            } else {
                                                int i48 = i6;
                                                str13 = str10;
                                                enumC32485OooO00o = enumC32485OooO00o33;
                                                list13 = list12;
                                                c27434o000oo0o2 = c27434o000oo0o3;
                                                linkedHashMap2 = linkedHashMap3;
                                                i5 = i48;
                                                page2 = null;
                                                map2.put(next, page2);
                                                enumC32485OooO00o32 = enumC32485OooO00o;
                                                it2 = it3;
                                                str46 = str11;
                                                str4 = str13;
                                                list18 = list13;
                                                if (it2.hasNext()) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return enumC32485OooO00o32;
            case 1:
                int i49 = c27434o000oo0o.f95822OoooO00;
                note2 = (Note) c27434o000oo0o.f95802OooOoO;
                String str57 = (String) c27434o000oo0o.f95803OooOoO0;
                List list143 = (List) c27434o000oo0o.f95800OooOo;
                C27449o00O0OoO c27449o00O0OoO34 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                i2 = i49;
                str44 = str57;
                objOooOo = objOooo0;
                list2 = list143;
                c27449o00O0OoO = c27449o00O0OoO34;
                note3 = (Note) objOooOo;
                if (note3 != null) {
                }
                break;
            case 2:
                i3 = c27434o000oo0o.f95822OoooO00;
                str3 = (String) c27434o000oo0o.f95806OooOoo0;
                list3 = (List) c27434o000oo0o.f95804OooOoOO;
                note4 = (Note) c27434o000oo0o.f95802OooOoO;
                str2 = (String) c27434o000oo0o.f95803OooOoO0;
                list4 = (List) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                linkedHashMap = new LinkedHashMap();
                List list1272 = list4;
                int i412 = i3;
                ArrayList arrayList62 = new ArrayList(C34428OooOOo.OooOOoo(list1272, 10));
                Iterator it362 = list1272.iterator();
                list5 = (List) objOooo0;
                note5 = note4;
                list6 = list3;
                it = it362;
                c27449o00O0OoO2 = c27449o00O0OoO;
                str4 = str3;
                collection = arrayList62;
                i4 = i412;
                if (!it.hasNext()) {
                }
                break;
            case 3:
                int i50 = c27434o000oo0o.f95822OoooO00;
                collection = (Collection) c27434o000oo0o.f95812Oooo00O;
                it = c27434o000oo0o.f95811Oooo000;
                collection2 = (Collection) c27434o000oo0o.f95808OooOooo;
                Map map37 = (Map) c27434o000oo0o.f95807OooOooO;
                list10 = (List) c27434o000oo0o.f95805OooOoo;
                str4 = (String) c27434o000oo0o.f95806OooOoo0;
                list11 = (List) c27434o000oo0o.f95804OooOoOO;
                note5 = (Note) c27434o000oo0o.f95802OooOoO;
                String str58 = (String) c27434o000oo0o.f95803OooOoO0;
                List list144 = (List) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO2 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                str8 = "toString(...)";
                i4 = i50;
                map = map37;
                str9 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                str2 = str58;
                list9 = list144;
                collection.add((List) objOooo0);
                collection = collection2;
                list5 = list10;
                list6 = list11;
                list4 = list9;
                linkedHashMap = map;
                str45 = str9;
                str47 = str8;
                if (!it.hasNext()) {
                }
                break;
            case 4:
                int i51 = c27434o000oo0o.f95822OoooO00;
                Object obj19 = c27434o000oo0o.f95810Oooo0;
                Map map38 = (Map) c27434o000oo0o.f95813Oooo00o;
                String str59 = (String) c27434o000oo0o.f95812Oooo00O;
                Iterator it49 = c27434o000oo0o.f95811Oooo000;
                LinkedHashMap linkedHashMap9 = (LinkedHashMap) c27434o000oo0o.f95808OooOooo;
                List list145 = (List) c27434o000oo0o.f95807OooOooO;
                linkedHashMap = (Map) c27434o000oo0o.f95805OooOoo;
                List list146 = (List) c27434o000oo0o.f95806OooOoo0;
                String str60 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list147 = (List) c27434o000oo0o.f95802OooOoO;
                Note note14 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str61 = (String) c27434o000oo0o.f95800OooOo;
                C27449o00O0OoO c27449o00O0OoO35 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                str10 = str60;
                obj = objOooo0;
                c27449o00O0OoO3 = c27449o00O0OoO35;
                str11 = "";
                linkedHashMap3 = linkedHashMap9;
                str6 = "toString(...)";
                i6 = i51;
                next = obj19;
                str12 = str59;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                list12 = list145;
                str7 = str61;
                map2 = map38;
                it3 = it49;
                list7 = list147;
                c27434o000oo0o3 = c27434o000oo0o;
                list8 = list146;
                note5 = note14;
                EnumC32485OooO00o enumC32485OooO00o332 = enumC32485OooO00o32;
                page = (Page) obj;
                if (page == null) {
                }
                break;
            case 5:
                int i52 = c27434o000oo0o.f95822OoooO00;
                obj2 = c27434o000oo0o.f95815Oooo0OO;
                Map map39 = (Map) c27434o000oo0o.f95814Oooo0O0;
                Page page26 = (Page) c27434o000oo0o.f95810Oooo0;
                Page page27 = (Page) c27434o000oo0o.f95813Oooo00o;
                page4 = (Page) c27434o000oo0o.f95812Oooo00O;
                it3 = c27434o000oo0o.f95811Oooo000;
                LinkedHashMap linkedHashMap10 = (LinkedHashMap) c27434o000oo0o.f95808OooOooo;
                List list148 = (List) c27434o000oo0o.f95807OooOooO;
                Map map40 = (Map) c27434o000oo0o.f95805OooOoo;
                List list149 = (List) c27434o000oo0o.f95806OooOoo0;
                String str62 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list150 = (List) c27434o000oo0o.f95802OooOoO;
                Note note15 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str63 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO4 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                str14 = str62;
                page3 = page27;
                list14 = list148;
                i7 = i52;
                note5 = note15;
                list7 = list150;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                str6 = "toString(...)";
                str7 = str63;
                enumC32485OooO00o = enumC32485OooO00o32;
                page = page26;
                str11 = "";
                linkedHashMap3 = linkedHashMap10;
                linkedHashMap = map40;
                map2 = map39;
                c27434o000oo0o3 = c27434o000oo0o;
                list8 = list149;
                str15 = (String) objOooo0;
                C27434o000oo0o c27434o000oo0o112 = c27434o000oo0o3;
                page7 = page3;
                i8 = i7;
                page5 = page4;
                linkedHashMap4 = linkedHashMap3;
                str16 = str7;
                list17 = list7;
                map4 = map2;
                c27434o000oo0o4 = c27434o000oo0o112;
                List list1422 = list8;
                c27449o00O0OoO5 = c27449o00O0OoO4;
                str10 = str14;
                note6 = note5;
                map3 = linkedHashMap;
                it4 = it3;
                obj3 = obj2;
                page6 = page;
                list16 = list1422;
                list15 = list14;
                page6.setTnPath(str15);
                page7.setInTrashBin(false);
                page7.setRecoverIndex(-1);
                String str4922 = str11;
                page7.setRecoverNoteId(str4922);
                page7.setRecoverNoteTitle(str4922);
                page7.setHistoryPageIdList(null);
                c27449o00O0OoO3 = c27449o00O0OoO5;
                list8 = list16;
                c27434o000oo0o2 = c27434o000oo0o4;
                map2 = map4;
                list7 = list17;
                str7 = str16;
                linkedHashMap2 = linkedHashMap4;
                next = obj3;
                it3 = it4;
                linkedHashMap = map3;
                note5 = note6;
                page2 = page5;
                str13 = str10;
                i5 = i8;
                list13 = list15;
                map2.put(next, page2);
                enumC32485OooO00o32 = enumC32485OooO00o;
                it2 = it3;
                str46 = str11;
                str4 = str13;
                list18 = list13;
                if (it2.hasNext()) {
                }
                break;
            case 6:
                int i53 = c27434o000oo0o.f95821OoooO0;
                i10 = c27434o000oo0o.f95822OoooO00;
                List list151 = (List) c27434o000oo0o.f95810Oooo0;
                page8 = (Page) c27434o000oo0o.f95813Oooo00o;
                String str64 = (String) c27434o000oo0o.f95812Oooo00O;
                it6 = c27434o000oo0o.f95811Oooo000;
                Map map41 = (Map) c27434o000oo0o.f95808OooOooo;
                List list152 = (List) c27434o000oo0o.f95807OooOooO;
                Map map42 = (Map) c27434o000oo0o.f95805OooOoo;
                List list153 = (List) c27434o000oo0o.f95806OooOoo0;
                String str65 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list154 = (List) c27434o000oo0o.f95802OooOoO;
                Note note16 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str66 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO7 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                enumC32485OooO00o3 = enumC32485OooO00o32;
                map6 = map41;
                str6 = "toString(...)";
                i11 = i53;
                arrayList = list151;
                str19 = str64;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                list21 = list153;
                str18 = str65;
                list7 = list154;
                note5 = note16;
                obj4 = objOooo0;
                map7 = map42;
                list22 = list152;
                str17 = str66;
                Iterable iterable3 = (Iterable) obj4;
                int i442 = i10;
                Page page212 = page8;
                String str512 = str19;
                ArrayList arrayList72 = new ArrayList(C34428OooOOo.OooOOoo(iterable3, 10));
                it29 = iterable3.iterator();
                while (it29.hasNext()) {
                }
                arrayList.addAll(arrayList72);
                C26596o00O0o0 c26596o00O0o03 = c27449o00O0OoO7.f96047OooOOO0;
                c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO7;
                c27434o000oo0o.f95800OooOo = str17;
                c27434o000oo0o.f95803OooOoO0 = note5;
                c27434o000oo0o.f95802OooOoO = list7;
                c27434o000oo0o.f95804OooOoOO = str18;
                c27434o000oo0o.f95806OooOoo0 = list21;
                c27434o000oo0o.f95805OooOoo = map7;
                c27434o000oo0o.f95807OooOooO = list22;
                c27434o000oo0o.f95808OooOooo = map6;
                c27434o000oo0o.f95811Oooo000 = it6;
                str20 = str512;
                c27434o000oo0o.f95812Oooo00O = str20;
                page9 = page212;
                c27434o000oo0o.f95813Oooo00o = page9;
                c27434o000oo0o.f95810Oooo0 = arrayList;
                i12 = i442;
                c27434o000oo0o.f95822OoooO00 = i12;
                c27449o00O0OoO8 = c27449o00O0OoO7;
                c27434o000oo0o.f95821OoooO0 = i11 == true ? 1 : 0 ? 1 : 0;
                c27434o000oo0o.f95824OoooOO0 = 7;
                serializableOooOOO0 = c26596o00O0o03.OooOOO0(str20, str17, c27434o000oo0o);
                enumC32485OooO00o4 = enumC32485OooO00o3;
                if (serializableOooOOO0 != enumC32485OooO00o4) {
                }
                break;
            case 7:
                int i54 = c27434o000oo0o.f95821OoooO0;
                i12 = c27434o000oo0o.f95822OoooO00;
                list23 = (List) c27434o000oo0o.f95810Oooo0;
                page9 = (Page) c27434o000oo0o.f95813Oooo00o;
                String str67 = (String) c27434o000oo0o.f95812Oooo00O;
                it6 = c27434o000oo0o.f95811Oooo000;
                Map map43 = (Map) c27434o000oo0o.f95808OooOooo;
                List list155 = (List) c27434o000oo0o.f95807OooOooO;
                Map map44 = (Map) c27434o000oo0o.f95805OooOoo;
                List list156 = (List) c27434o000oo0o.f95806OooOoo0;
                String str68 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list157 = (List) c27434o000oo0o.f95802OooOoO;
                Note note17 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str69 = (String) c27434o000oo0o.f95800OooOo;
                C27449o00O0OoO c27449o00O0OoO36 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                c27449o00O0OoO8 = c27449o00O0OoO36;
                enumC32485OooO00o4 = enumC32485OooO00o32;
                map6 = map43;
                str6 = "toString(...)";
                map8 = map44;
                list24 = list156;
                i11 = i54;
                note5 = note17;
                str20 = str67;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                list25 = list155;
                str18 = str68;
                list7 = list157;
                str17 = str69;
                Iterable iterable22 = (Iterable) objOooo0;
                Map map332 = map8;
                C27434o000oo0o c27434o000oo0o92 = c27434o000oo0o;
                Map map342 = map6;
                ArrayList arrayList82 = new ArrayList(C34428OooOOo.OooOOoo(iterable22, 10));
                it28 = iterable22.iterator();
                while (it28.hasNext()) {
                }
                ArrayList arrayList92 = new ArrayList(C34428OooOOo.OooOOoo(arrayList82, 10));
                Iterator it402 = it6;
                it7 = arrayList82.iterator();
                c27449o00O0OoO9 = c27449o00O0OoO8;
                i13 = i12;
                list27 = list24;
                it8 = it402;
                c27434o000oo0o = c27434o000oo0o92;
                enumC32485OooO00o5 = enumC32485OooO00o4;
                list28 = list23;
                list26 = list25;
                map10 = map342;
                collection3 = arrayList92;
                map9 = map332;
                while (true) {
                    if (!it7.hasNext()) {
                    }
                    collection6.add(Image.copy$default(image3, null, null, (String) objOooO0oO2, null, null, 0.0f, 0L, 0L, false, 507, null));
                    map9 = map35;
                    c27434o000oo0o = c27434o000oo0o10;
                    enumC32485OooO00o5 = enumC32485OooO00o28;
                    collection3 = collection6;
                    list28 = list96;
                    it7 = it27;
                    page9 = page19;
                    str20 = str36;
                    it8 = it41;
                    str17 = str53;
                    map10 = map36;
                    note5 = note13;
                    i11 = z2 ? 1 : 0;
                    i13 = i34;
                }
                return enumC32485OooO00o28;
            case 8:
                int i55 = c27434o000oo0o.f95821OoooO0;
                int i56 = c27434o000oo0o.f95822OoooO00;
                Collection collection10 = c27434o000oo0o.f95816Oooo0o;
                Image image4 = (Image) c27434o000oo0o.f95817Oooo0o0;
                Iterator it50 = (Iterator) c27434o000oo0o.f95815Oooo0OO;
                Collection collection11 = (Collection) c27434o000oo0o.f95814Oooo0O0;
                List list158 = (List) c27434o000oo0o.f95810Oooo0;
                Page page28 = (Page) c27434o000oo0o.f95813Oooo00o;
                String str70 = (String) c27434o000oo0o.f95812Oooo00O;
                Iterator it51 = c27434o000oo0o.f95811Oooo000;
                Map map45 = (Map) c27434o000oo0o.f95808OooOooo;
                List list159 = (List) c27434o000oo0o.f95807OooOooO;
                Map map46 = (Map) c27434o000oo0o.f95805OooOoo;
                List list160 = (List) c27434o000oo0o.f95806OooOoo0;
                String str71 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list161 = (List) c27434o000oo0o.f95802OooOoO;
                Note note18 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str72 = (String) c27434o000oo0o.f95800OooOo;
                C27449o00O0OoO c27449o00O0OoO37 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                c27449o00O0OoO9 = c27449o00O0OoO37;
                list26 = list159;
                list27 = list160;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                str18 = str71;
                str6 = "toString(...)";
                list7 = list161;
                C27434o000oo0o c27434o000oo0o12 = c27434o000oo0o;
                collection10.add(Image.copy$default(image4, null, null, (String) objOooo0, null, null, 0.0f, 0L, 0L, false, 507, null));
                map9 = map46;
                c27434o000oo0o = c27434o000oo0o12;
                enumC32485OooO00o5 = enumC32485OooO00o32;
                collection3 = collection11;
                list28 = list158;
                it7 = it50;
                page9 = page28;
                str20 = str70;
                it8 = it51;
                str17 = str72;
                map10 = map45;
                note5 = note18;
                i11 = i55;
                i13 = i56;
                while (true) {
                    if (!it7.hasNext()) {
                    }
                    collection6.add(Image.copy$default(image3, null, null, (String) objOooO0oO2, null, null, 0.0f, 0L, 0L, false, 507, null));
                    map9 = map35;
                    c27434o000oo0o = c27434o000oo0o10;
                    enumC32485OooO00o5 = enumC32485OooO00o28;
                    collection3 = collection6;
                    list28 = list96;
                    it7 = it27;
                    page9 = page19;
                    str20 = str36;
                    it8 = it41;
                    str17 = str53;
                    map10 = map36;
                    note5 = note13;
                    i11 = z2 ? 1 : 0;
                    i13 = i34;
                }
                return enumC32485OooO00o28;
            case 9:
                int i57 = c27434o000oo0o.f95821OoooO0;
                i14 = c27434o000oo0o.f95822OoooO00;
                List list162 = (List) c27434o000oo0o.f95810Oooo0;
                Page page29 = (Page) c27434o000oo0o.f95813Oooo00o;
                String str73 = (String) c27434o000oo0o.f95812Oooo00O;
                it9 = c27434o000oo0o.f95811Oooo000;
                Map map47 = (Map) c27434o000oo0o.f95808OooOooo;
                List list163 = (List) c27434o000oo0o.f95807OooOooO;
                Map map48 = (Map) c27434o000oo0o.f95805OooOoo;
                List list164 = (List) c27434o000oo0o.f95806OooOoo0;
                String str74 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list165 = (List) c27434o000oo0o.f95802OooOoO;
                Note note19 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str75 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO10 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                enumC32485OooO00o6 = enumC32485OooO00o32;
                page10 = page29;
                str6 = "toString(...)";
                list29 = list163;
                i11 = i57;
                str17 = str75;
                list30 = list162;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                list31 = list164;
                str18 = str74;
                note5 = note19;
                obj5 = objOooo0;
                map9 = map48;
                map10 = map47;
                str20 = str73;
                list7 = list165;
                Iterable iterable4 = (Iterable) obj5;
                int i58 = i14;
                Page page30 = page10;
                String str76 = str20;
                ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(iterable4, 10));
                Iterator it52 = iterable4.iterator();
                while (it52.hasNext()) {
                    arrayList22.add(Shape.copy$default((Shape) it52.next(), C24761OooO.OooO00o(str6), page30.getId(), 0, 0.0f, null, 0, 0, 0, false, 0, null, 0L, 4092, null));
                }
                list30.addAll(arrayList22);
                C26264OooOOO0 c26264OooOOO02 = c27449o00O0OoO10.f96046OooOOO;
                c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO10;
                c27434o000oo0o.f95800OooOo = str17;
                c27434o000oo0o.f95803OooOoO0 = note5;
                c27434o000oo0o.f95802OooOoO = list7;
                c27434o000oo0o.f95804OooOoOO = str18;
                c27434o000oo0o.f95806OooOoo0 = list31;
                c27434o000oo0o.f95805OooOoo = map9;
                c27434o000oo0o.f95807OooOooO = list29;
                c27434o000oo0o.f95808OooOooo = map10;
                c27434o000oo0o.f95811Oooo000 = it9;
                str21 = str76;
                c27434o000oo0o.f95812Oooo00O = str21;
                c27434o000oo0o.f95813Oooo00o = page30;
                c27434o000oo0o.f95810Oooo0 = list30;
                i15 = i58;
                c27434o000oo0o.f95822OoooO00 = i15;
                C27449o00O0OoO c27449o00O0OoO38 = c27449o00O0OoO10;
                c27434o000oo0o.f95821OoooO0 = i11 == true ? 1 : 0 ? 1 : 0;
                c27434o000oo0o.f95824OoooOO0 = 10;
                Serializable serializableOooO0Oo2 = c26264OooOOO02.OooO0Oo(str21, str17, c27434o000oo0o);
                EnumC32485OooO00o enumC32485OooO00o38 = enumC32485OooO00o6;
                if (serializableOooO0Oo2 == enumC32485OooO00o38) {
                    return enumC32485OooO00o38;
                }
                obj6 = serializableOooO0Oo2;
                enumC32485OooO00o7 = enumC32485OooO00o38;
                list34 = list31;
                list32 = list30;
                c27449o00O0OoO11 = c27449o00O0OoO38;
                page11 = page30;
                c27434o000oo0o5 = c27434o000oo0o;
                map11 = map9;
                list33 = list29;
                Iterable iterable5 = (Iterable) obj6;
                int i59 = i15;
                Page page31 = page11;
                String str77 = str21;
                ArrayList arrayList23 = new ArrayList(C34428OooOOo.OooOOoo(iterable5, 10));
                it26 = iterable5.iterator();
                while (it26.hasNext()) {
                    arrayList23.add(TextBox.copy$default((TextBox) it26.next(), C24761OooO.OooO00o(str6), page31.getId(), null, 0.0f, 0.0f, 0.0f, null, 0.0f, 0, null, 0L, 0, null, 8188, null));
                }
                list32.addAll(arrayList23);
                o0OO00o0.OooOo00 oooOo00 = c27449o00O0OoO11.f96045OooOO0o;
                c27434o000oo0o5.f95801OooOo0o = c27449o00O0OoO11;
                c27434o000oo0o5.f95800OooOo = str17;
                c27434o000oo0o5.f95803OooOoO0 = note5;
                c27434o000oo0o5.f95802OooOoO = list7;
                c27434o000oo0o5.f95804OooOoOO = str18;
                c27434o000oo0o5.f95806OooOoo0 = list34;
                c27434o000oo0o5.f95805OooOoo = map11;
                c27434o000oo0o5.f95807OooOooO = list33;
                c27434o000oo0o5.f95808OooOooo = map10;
                c27434o000oo0o5.f95811Oooo000 = it9;
                str23 = str77;
                c27434o000oo0o5.f95812Oooo00O = str23;
                page12 = page31;
                c27434o000oo0o5.f95813Oooo00o = page12;
                c27434o000oo0o5.f95810Oooo0 = list32;
                i16 = i59;
                c27434o000oo0o5.f95822OoooO00 = i16;
                C27449o00O0OoO c27449o00O0OoO39 = c27449o00O0OoO11;
                c27434o000oo0o5.f95821OoooO0 = i11 == true ? 1 : 0;
                c27434o000oo0o5.f95824OoooOO0 = 11;
                serializableOooO0Oo = oooOo00.OooO0Oo(str23, str17, c27434o000oo0o5);
                enumC32485OooO00o25 = enumC32485OooO00o7;
                if (serializableOooO0Oo != enumC32485OooO00o25) {
                    enumC32485OooO00o8 = enumC32485OooO00o25;
                    obj7 = serializableOooO0Oo;
                    str22 = str18;
                    i17 = i11;
                    map12 = map11;
                    list36 = list34;
                    c27449o00O0OoO12 = c27449o00O0OoO39;
                    list35 = list33;
                    Iterable iterable6 = (Iterable) obj7;
                    int i60 = i17;
                    int i61 = i16;
                    List list166 = list32;
                    ArrayList arrayList24 = new ArrayList(C34428OooOOo.OooOOoo(iterable6, 10));
                    it24 = iterable6.iterator();
                    while (it24.hasNext()) {
                        Comment comment = (Comment) it24.next();
                        String string = UUID.randomUUID().toString();
                        map12.put(comment.getId(), string);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "also(...)");
                        String quoteId = comment.getQuoteId();
                        if (quoteId != null) {
                            it25 = it24;
                            String string2 = UUID.randomUUID().toString();
                            map12.put(quoteId, string2);
                            str35 = string2;
                        } else {
                            it25 = it24;
                            str35 = null;
                        }
                        arrayList24.add(Comment.copy$default(comment, string, null, page12.getId(), str22, str35, 0L, 0L, null, 226, null));
                        it24 = it25;
                    }
                    String str78 = str22;
                    C26620o00Oo00o c26620o00Oo00o2 = c27449o00O0OoO12.f96043OooOO0;
                    c27434o000oo0o5.f95801OooOo0o = c27449o00O0OoO12;
                    c27434o000oo0o5.f95800OooOo = str17;
                    c27434o000oo0o5.f95803OooOoO0 = note5;
                    c27434o000oo0o5.f95802OooOoO = list7;
                    c27434o000oo0o5.f95804OooOoOO = str78;
                    c27434o000oo0o5.f95806OooOoo0 = list36;
                    c27434o000oo0o5.f95805OooOoo = map12;
                    c27434o000oo0o5.f95807OooOooO = list35;
                    c27434o000oo0o5.f95808OooOooo = map10;
                    c27434o000oo0o5.f95811Oooo000 = it9;
                    c27434o000oo0o5.f95812Oooo00O = str23;
                    c27434o000oo0o5.f95813Oooo00o = page12;
                    c27434o000oo0o5.f95810Oooo0 = list166;
                    c27434o000oo0o5.f95814Oooo0O0 = arrayList24;
                    C27449o00O0OoO c27449o00O0OoO40 = c27449o00O0OoO12;
                    c27434o000oo0o5.f95822OoooO00 = i61;
                    c27434o000oo0o5.f95821OoooO0 = i60 == true ? 1 : 0;
                    c27434o000oo0o5.f95824OoooOO0 = 12;
                    serializableOooO0OO = c26620o00Oo00o2.OooO0OO(str23, str17, c27434o000oo0o5);
                    enumC32485OooO00o27 = enumC32485OooO00o8;
                    if (serializableOooO0OO != enumC32485OooO00o27) {
                        return enumC32485OooO00o27;
                    }
                    obj8 = serializableOooO0OO;
                    str24 = str78;
                    c27449o00O0OoO13 = c27449o00O0OoO40;
                    c27434o000oo0o6 = c27434o000oo0o5;
                    it10 = it9;
                    list38 = list166;
                    i19 = i61;
                    i18 = i60 == true ? 1 : 0;
                    enumC32485OooO00o9 = enumC32485OooO00o27;
                    map13 = map10;
                    str25 = str23;
                    page13 = page12;
                    list39 = arrayList24;
                    list37 = list35;
                    Iterable iterable7 = (Iterable) obj8;
                    int i62 = i19;
                    List list167 = list39;
                    List list168 = list38;
                    ArrayList arrayList25 = new ArrayList(C34428OooOOo.OooOOoo(iterable7, 10));
                    it23 = iterable7.iterator();
                    while (it23.hasNext()) {
                        Outline outline = (Outline) it23.next();
                        String quoteId2 = outline.getQuoteId();
                        if (quoteId2 != null) {
                            String string3 = UUID.randomUUID().toString();
                            map12.put(quoteId2, string3);
                            str34 = string3;
                        } else {
                            str34 = null;
                        }
                        Object obj20 = map12.get(outline.getId());
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(obj20);
                        String str79 = (String) obj20;
                        String id4 = page13.getId();
                        String str80 = (String) map12.get(outline.getParentId());
                        List<String> children = outline.getChildren();
                        ArrayList arrayList26 = new ArrayList();
                        Iterator it53 = children.iterator();
                        while (it53.hasNext()) {
                            Iterator it54 = it23;
                            String str81 = (String) map12.get((String) it53.next());
                            if (str81 != null) {
                                arrayList26.add(str81);
                            }
                            it23 = it54;
                        }
                        arrayList25.add(Outline.copy$default(outline, str79, null, str80, id4, str24, str34, arrayList26, 0L, 0L, 386, null));
                        it23 = it23;
                    }
                    str27 = str24;
                    ArrayList arrayList27 = new ArrayList();
                    C27994OooOOOO c27994OooOOOO2 = c27449o00O0OoO13.f96058OooOoO;
                    c27434o000oo0o6.f95801OooOo0o = c27449o00O0OoO13;
                    c27434o000oo0o6.f95800OooOo = str17;
                    c27434o000oo0o6.f95803OooOoO0 = note5;
                    c27434o000oo0o6.f95802OooOoO = list7;
                    c27434o000oo0o6.f95804OooOoOO = str27;
                    c27434o000oo0o6.f95806OooOoo0 = list36;
                    c27434o000oo0o6.f95805OooOoo = map12;
                    c27434o000oo0o6.f95807OooOooO = list37;
                    c27434o000oo0o6.f95808OooOooo = map13;
                    c27434o000oo0o6.f95811Oooo000 = it10;
                    c27434o000oo0o6.f95812Oooo00O = str25;
                    c27434o000oo0o6.f95813Oooo00o = page13;
                    C27449o00O0OoO c27449o00O0OoO41 = c27449o00O0OoO13;
                    c27434o000oo0o6.f95810Oooo0 = list168;
                    c27434o000oo0o6.f95814Oooo0O0 = list167;
                    c27434o000oo0o6.f95815Oooo0OO = arrayList25;
                    c27434o000oo0o6.f95817Oooo0o0 = arrayList27;
                    c27434o000oo0o6.f95822OoooO00 = i62;
                    int i63 = i18;
                    c27434o000oo0o6.f95821OoooO0 = i63 == true ? 1 : 0;
                    c27434o000oo0o6.f95824OoooOO0 = 13;
                    objOooO0O03 = c27994OooOOOO2.OooO0O0(str25, str17, c27434o000oo0o6);
                    enumC32485OooO00o12 = enumC32485OooO00o9;
                    if (objOooO0O03 != enumC32485OooO00o12) {
                        obj9 = objOooO0O03;
                        it11 = it10;
                        enumC32485OooO00o10 = enumC32485OooO00o12;
                        page14 = page13;
                        str26 = str25;
                        list41 = list167;
                        map14 = map13;
                        list44 = arrayList25;
                        c27449o00O0OoO14 = c27449o00O0OoO41;
                        i20 = i63 == true ? 1 : 0;
                        i21 = i62;
                        list40 = arrayList27;
                        list43 = list168;
                        list42 = list37;
                        List list169 = (List) obj9;
                        List list170 = list44;
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        List list171 = list41;
                        int size2 = list169.size();
                        String str82 = str26;
                        Iterator it55 = it11;
                        Map map49 = map14;
                        c20358OooO00o.OooO00o(androidx.core.app.OooO.OooO00o(size2, "batchInsertSrcPagesToDstNote, quotes: ", ", ", oOo000Oo.OooOo.o000oOoO(list169, null, null, null, new InterfaceC32507OooOO0o() { // from class: o0OOo0o.o000o0o0
                            @Override // oO0O000o.InterfaceC32507OooOO0o
                            public final Object invoke(Object obj21) {
                                Quote it56 = (Quote) obj21;
                                kotlin.jvm.internal.OooOOO0.OooO0oO(it56, "it");
                                return Oooo0oO.o0Oo0oo.OooO0Oo(it56.id, C18115b5.CONNECTOR, it56.getText());
                            }
                        }, 31)), new Object[0]);
                        Iterable<Quote> iterable8 = (Iterable) obj9;
                        for (Quote quote : iterable8) {
                            List<String> annoItemIdList = quote.getAnnoItemIdList();
                            if (annoItemIdList != null && !annoItemIdList.isEmpty()) {
                                list40.addAll(quote.getAnnoItemIdList());
                            }
                        }
                        ArrayList arrayList28 = new ArrayList(C34428OooOOo.OooOOoo(iterable8, 10));
                        for (Quote quote2 : iterable8) {
                            Object obj21 = map12.get(quote2.getId());
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(obj21);
                            String str83 = (String) obj21;
                            String id5 = page14.getId();
                            Object obj22 = map12.get(quote2.getLinkId());
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(obj22);
                            arrayList28.add(Quote.copy$default(quote2, str83, id5, 0, 0, 0, null, null, null, null, 0, (String) obj22, null, 0L, false, false, 31740, null));
                        }
                        list43.addAll(arrayList28);
                        C27994OooOOOO c27994OooOOOO3 = c27449o00O0OoO14.f96058OooOoO;
                        c27434o000oo0o6.f95801OooOo0o = c27449o00O0OoO14;
                        c27434o000oo0o6.f95800OooOo = str17;
                        c27434o000oo0o6.f95803OooOoO0 = note5;
                        c27434o000oo0o6.f95802OooOoO = list7;
                        c27434o000oo0o6.f95804OooOoOO = str27;
                        c27434o000oo0o6.f95806OooOoo0 = list36;
                        c27434o000oo0o6.f95805OooOoo = map12;
                        c27434o000oo0o6.f95807OooOooO = list42;
                        c27434o000oo0o6.f95808OooOooo = map49;
                        c27434o000oo0o6.f95811Oooo000 = it55;
                        c27434o000oo0o6.f95812Oooo00O = str82;
                        Page page32 = page14;
                        c27434o000oo0o6.f95813Oooo00o = page32;
                        c27434o000oo0o6.f95810Oooo0 = list43;
                        C27449o00O0OoO c27449o00O0OoO42 = c27449o00O0OoO14;
                        c27434o000oo0o6.f95814Oooo0O0 = list171;
                        c27434o000oo0o6.f95815Oooo0OO = list170;
                        c27434o000oo0o6.f95817Oooo0o0 = null;
                        c27434o000oo0o6.f95822OoooO00 = i21;
                        c27434o000oo0o6.f95821OoooO0 = i20 == true ? 1 : 0 ? 1 : 0;
                        c27434o000oo0o6.f95824OoooOO0 = 14;
                        objOooO0OO = c27994OooOOOO3.OooO0OO(list40, str17, c27434o000oo0o6);
                        enumC32485OooO00o26 = enumC32485OooO00o10;
                        if (objOooO0OO != enumC32485OooO00o26) {
                            return enumC32485OooO00o26;
                        }
                        list48 = list43;
                        it12 = it55;
                        obj10 = objOooO0OO;
                        enumC32485OooO00o11 = enumC32485OooO00o26;
                        map15 = map49;
                        str28 = str82;
                        page15 = page32;
                        c27449o00O0OoO15 = c27449o00O0OoO42;
                        list46 = list170;
                        list47 = list171;
                        list45 = list42;
                        List list172 = (List) obj10;
                        C26515OooooO0 c26515OooooO0 = c27449o00O0OoO15.f96052OooOOoo;
                        c27434o000oo0o6.f95801OooOo0o = c27449o00O0OoO15;
                        c27434o000oo0o6.f95800OooOo = str17;
                        c27434o000oo0o6.f95803OooOoO0 = note5;
                        c27434o000oo0o6.f95802OooOoO = list7;
                        c27434o000oo0o6.f95804OooOoOO = str27;
                        c27434o000oo0o6.f95806OooOoo0 = list36;
                        c27434o000oo0o6.f95805OooOoo = map12;
                        c27434o000oo0o6.f95807OooOooO = list45;
                        c27434o000oo0o6.f95808OooOooo = map15;
                        c27434o000oo0o6.f95811Oooo000 = it12;
                        c27434o000oo0o6.f95812Oooo00O = str28;
                        c27434o000oo0o6.f95813Oooo00o = page15;
                        c27434o000oo0o6.f95810Oooo0 = list48;
                        c27434o000oo0o6.f95814Oooo0O0 = list47;
                        C27449o00O0OoO c27449o00O0OoO43 = c27449o00O0OoO15;
                        c27434o000oo0o6.f95815Oooo0OO = list46;
                        c27434o000oo0o6.f95817Oooo0o0 = list172;
                        c27434o000oo0o6.f95822OoooO00 = i21;
                        c27434o000oo0o6.f95821OoooO0 = i20 == true ? 1 : 0 ? 1 : 0;
                        c27434o000oo0o6.f95824OoooOO0 = 15;
                        objOooOO0O = c26515OooooO0.OooOO0O(str28, str17, c27434o000oo0o6);
                        enumC32485OooO00o12 = enumC32485OooO00o11;
                        if (objOooOO0O != enumC32485OooO00o12) {
                            it13 = it12;
                            objOooo0 = objOooOO0O;
                            str29 = str28;
                            c27449o00O0OoO16 = c27449o00O0OoO43;
                            map16 = map15;
                            list49 = list172;
                            list51 = list47;
                            list52 = list45;
                            list50 = list46;
                            Collection arrayList29 = new ArrayList();
                            List list173 = list51;
                            page18 = page15;
                            it21 = it13;
                            EnumC32485OooO00o enumC32485OooO00o39 = enumC32485OooO00o12;
                            list93 = list50;
                            list56 = list49;
                            c27434o000oo0o7 = c27434o000oo0o6;
                            list94 = list48;
                            List list174 = list173;
                            it22 = ((Iterable) objOooo0).iterator();
                            map18 = map16;
                            if (it22.hasNext()) {
                                List list175 = list93;
                                Image item = ((DualLinkRef) it22.next()).getItem();
                                if (item != null) {
                                    String strOooO00o2 = C24761OooO.OooO00o(str6);
                                    C26596o00O0o0 c26596o00O0o04 = c27449o00O0OoO16.f96047OooOOO0;
                                    List list176 = list174;
                                    File file2 = new File(item.getUri());
                                    c27434o000oo0o7.f95801OooOo0o = c27449o00O0OoO16;
                                    c27434o000oo0o7.f95800OooOo = str17;
                                    c27434o000oo0o7.f95803OooOoO0 = note5;
                                    c27434o000oo0o7.f95802OooOoO = list7;
                                    c27434o000oo0o7.f95804OooOoOO = str27;
                                    c27434o000oo0o7.f95806OooOoo0 = list36;
                                    c27434o000oo0o7.f95805OooOoo = map12;
                                    c27434o000oo0o7.f95807OooOooO = list52;
                                    c27434o000oo0o7.f95808OooOooo = map18;
                                    c27434o000oo0o7.f95811Oooo000 = it21;
                                    c27434o000oo0o7.f95812Oooo00O = str29;
                                    c27434o000oo0o7.f95813Oooo00o = page18;
                                    c27434o000oo0o7.f95810Oooo0 = list94;
                                    c27434o000oo0o7.f95814Oooo0O0 = list176;
                                    str31 = str29;
                                    c27434o000oo0o7.f95815Oooo0OO = list175;
                                    c27434o000oo0o7.f95817Oooo0o0 = list56;
                                    c27434o000oo0o7.f95816Oooo0o = arrayList29;
                                    Iterator it56 = it22;
                                    c27434o000oo0o7.f95818Oooo0oO = it56;
                                    c27434o000oo0o7.f95819Oooo0oo = item;
                                    c27434o000oo0o7.f95809Oooo = strOooO00o2;
                                    c27434o000oo0o7.f95822OoooO00 = i21;
                                    c27434o000oo0o7.f95821OoooO0 = i20 == true ? 1 : 0 ? 1 : 0;
                                    c27434o000oo0o7.f95824OoooOO0 = 16;
                                    objOooO0oO = c26596o00O0o04.OooO0oO(file2, str27, strOooO00o2, c27434o000oo0o7);
                                    enumC32485OooO00o13 = enumC32485OooO00o39;
                                    if (objOooO0oO != enumC32485OooO00o13) {
                                        list53 = list94;
                                        note7 = note5;
                                        list54 = list176;
                                        str32 = strOooO00o2;
                                        c27449o00O0OoO17 = c27449o00O0OoO16;
                                        it14 = it21;
                                        page16 = page18;
                                        i22 = i20 == true ? 1 : 0;
                                        collection4 = arrayList29;
                                        map17 = map12;
                                        str30 = str17;
                                        list95 = list175;
                                        it15 = it56;
                                        image = item;
                                        list55 = list52;
                                        Image imageCopy$default = Image.copy$default(image, str32, page16.getId(), (String) objOooO0oO, note7.getActivatedPageLayerId(), null, 0.0f, 0L, 0L, false, 496, null);
                                        Collection collection12 = collection4;
                                        page18 = page16;
                                        collection5 = collection12;
                                        c27449o00O0OoO24 = c27449o00O0OoO17;
                                        it20 = it15;
                                        image2 = imageCopy$default;
                                        list93 = list95;
                                        map12 = map17;
                                        str17 = str30;
                                        i20 = i22;
                                        it21 = it14;
                                        list94 = list53;
                                        list52 = list55;
                                        list92 = list54;
                                        String str84 = str31;
                                        if (image2 != null) {
                                            collection5.add(image2);
                                            str29 = str84;
                                            arrayList29 = collection5;
                                            enumC32485OooO00o39 = enumC32485OooO00o13;
                                            list174 = list92;
                                            note5 = note7;
                                            it22 = it20;
                                            c27449o00O0OoO16 = c27449o00O0OoO24;
                                        } else {
                                            str29 = str84;
                                            arrayList29 = collection5;
                                            enumC32485OooO00o39 = enumC32485OooO00o13;
                                            list174 = list92;
                                            note5 = note7;
                                            it22 = it20;
                                            c27449o00O0OoO16 = c27449o00O0OoO24;
                                        }
                                        if (it22.hasNext()) {
                                            String str85 = str29;
                                            List list177 = list93;
                                            List list178 = list174;
                                            enumC32485OooO00o13 = enumC32485OooO00o39;
                                            list94.addAll((List) arrayList29);
                                            InterfaceC27301OooOOo interfaceC27301OooOOo = c27449o00O0OoO16.f96054OooOo0;
                                            c27434o000oo0o7.f95801OooOo0o = c27449o00O0OoO16;
                                            c27434o000oo0o7.f95800OooOo = str17;
                                            c27434o000oo0o7.f95803OooOoO0 = note5;
                                            c27434o000oo0o7.f95802OooOoO = list7;
                                            c27434o000oo0o7.f95804OooOoOO = str27;
                                            c27434o000oo0o7.f95806OooOoo0 = list36;
                                            c27434o000oo0o7.f95805OooOoo = map12;
                                            c27434o000oo0o7.f95807OooOooO = list52;
                                            c27434o000oo0o7.f95808OooOooo = map18;
                                            c27434o000oo0o7.f95811Oooo000 = it21;
                                            c27434o000oo0o7.f95812Oooo00O = page18;
                                            c27434o000oo0o7.f95813Oooo00o = list94;
                                            c27434o000oo0o7.f95810Oooo0 = list178;
                                            C27449o00O0OoO c27449o00O0OoO44 = c27449o00O0OoO16;
                                            c27434o000oo0o7.f95814Oooo0O0 = list177;
                                            c27434o000oo0o7.f95815Oooo0OO = list56;
                                            c27434o000oo0o7.f95817Oooo0o0 = null;
                                            c27434o000oo0o7.f95816Oooo0o = null;
                                            c27434o000oo0o7.f95818Oooo0oO = null;
                                            c27434o000oo0o7.f95819Oooo0oo = null;
                                            c27434o000oo0o7.f95809Oooo = null;
                                            c27434o000oo0o7.f95822OoooO00 = i21;
                                            c27434o000oo0o7.f95821OoooO0 = i20 == true ? 1 : 0 ? 1 : 0;
                                            c27434o000oo0o7.f95824OoooOO0 = 17;
                                            Serializable serializableOooO0o0 = interfaceC27301OooOOo.OooO0o0(str85, str17, c27434o000oo0o7);
                                            if (serializableOooO0o0 != enumC32485OooO00o13) {
                                                obj11 = serializableOooO0o0;
                                                map20 = map12;
                                                page17 = page18;
                                                i24 = i20 == true ? 1 : 0;
                                                c27449o00O0OoO18 = c27449o00O0OoO44;
                                                list57 = list177;
                                                list60 = list178;
                                                enumC32485OooO00o14 = enumC32485OooO00o13;
                                                listOooo0o0 = list94;
                                                list58 = list52;
                                                i23 = i21;
                                                map19 = map18;
                                                it16 = it21;
                                                list59 = list56;
                                                int i64 = i23;
                                                ArrayList arrayList30 = new ArrayList();
                                                List list179 = list57;
                                                for (HyperLink hyperLink : (Iterable) obj11) {
                                                    List list180 = list59;
                                                    List list181 = list179;
                                                    if (hyperLink.getType() == 1) {
                                                        Page page33 = (Page) map19.get(hyperLink.getDestination());
                                                        if (page33 == null || (destination = page33.getId()) == null) {
                                                            destination = hyperLink.getDestination();
                                                        }
                                                        hyperLinkCopy$default = HyperLink.copy$default(hyperLink, C24761OooO.OooO00o(str6), page17.getId(), 0, destination, null, null, 0L, 116, null);
                                                    } else {
                                                        hyperLinkCopy$default = HyperLink.copy$default(hyperLink, C24761OooO.OooO00o(str6), page17.getId(), 0, null, null, null, 0L, 124, null);
                                                    }
                                                    if (hyperLinkCopy$default != null) {
                                                        arrayList30.add(hyperLinkCopy$default);
                                                    }
                                                    list59 = list180;
                                                    list179 = list181;
                                                }
                                                List list182 = list59;
                                                List list183 = list179;
                                                listOooo0o0.addAll(arrayList30);
                                                if (i24 != 0) {
                                                    String activatedPageLayerId = note5.getActivatedPageLayerId();
                                                    c27449o00O0OoO18.getClass();
                                                    listOooo0o0 = Oooo0o0(activatedPageLayerId, listOooo0o0, list7);
                                                }
                                                arrayList4 = new ArrayList();
                                                it19 = listOooo0o0.iterator();
                                                while (it19.hasNext()) {
                                                    Object next2 = it19.next();
                                                    Iterator it57 = it19;
                                                    if (next2 instanceof Stroke) {
                                                        arrayList4.add(next2);
                                                    }
                                                    it19 = it57;
                                                }
                                                interfaceC27323Oooo0oO = c27449o00O0OoO18.f96034OooO;
                                                c27434o000oo0o7.f95801OooOo0o = c27449o00O0OoO18;
                                                c27434o000oo0o7.f95800OooOo = str17;
                                                c27434o000oo0o7.f95803OooOoO0 = note5;
                                                c27434o000oo0o7.f95802OooOoO = list7;
                                                c27434o000oo0o7.f95804OooOoOO = str27;
                                                c27434o000oo0o7.f95806OooOoo0 = list36;
                                                c27434o000oo0o7.f95805OooOoo = map20;
                                                c27434o000oo0o7.f95807OooOooO = list58;
                                                c27434o000oo0o7.f95808OooOooo = map19;
                                                c27434o000oo0o7.f95811Oooo000 = it16;
                                                c27434o000oo0o7.f95812Oooo00O = list60;
                                                List list184 = list183;
                                                c27434o000oo0o7.f95813Oooo00o = list184;
                                                Map map50 = map20;
                                                c27434o000oo0o7.f95810Oooo0 = list182;
                                                c27434o000oo0o7.f95814Oooo0O0 = listOooo0o0;
                                                c27434o000oo0o7.f95815Oooo0OO = null;
                                                c27434o000oo0o7.f95822OoooO00 = i64;
                                                int i65 = i24;
                                                c27434o000oo0o7.f95821OoooO0 = i65 == true ? 1 : 0;
                                                c27434o000oo0o7.f95824OoooOO0 = 18;
                                                enumC32485OooO00o25 = enumC32485OooO00o14;
                                                if (interfaceC27323Oooo0oO.OooO0o(arrayList4, str27, false, c27434o000oo0o7) != enumC32485OooO00o25) {
                                                    enumC32485OooO00o15 = enumC32485OooO00o25;
                                                    list62 = list58;
                                                    i25 = i64;
                                                    list61 = list182;
                                                    map22 = map19;
                                                    it17 = it16;
                                                    map21 = map50;
                                                    i26 = i65 == true ? 1 : 0;
                                                    list63 = list184;
                                                    list64 = list60;
                                                    int i66 = i25;
                                                    ArrayList arrayList31 = new ArrayList();
                                                    for (Object obj23 : listOooo0o0) {
                                                        List list185 = listOooo0o0;
                                                        List list186 = list61;
                                                        if (obj23 instanceof Image) {
                                                            arrayList31.add(obj23);
                                                        }
                                                        listOooo0o0 = list185;
                                                        list61 = list186;
                                                    }
                                                    List list187 = list61;
                                                    List list188 = listOooo0o0;
                                                    C26596o00O0o0 c26596o00O0o05 = c27449o00O0OoO18.f96047OooOOO0;
                                                    c27434o000oo0o7.f95801OooOo0o = c27449o00O0OoO18;
                                                    c27434o000oo0o7.f95800OooOo = str17;
                                                    c27434o000oo0o7.f95803OooOoO0 = note5;
                                                    c27434o000oo0o7.f95802OooOoO = list7;
                                                    c27434o000oo0o7.f95804OooOoOO = str27;
                                                    c27434o000oo0o7.f95806OooOoo0 = list36;
                                                    c27434o000oo0o7.f95805OooOoo = map21;
                                                    c27434o000oo0o7.f95807OooOooO = list62;
                                                    c27434o000oo0o7.f95808OooOooo = map22;
                                                    c27434o000oo0o7.f95811Oooo000 = it17;
                                                    c27434o000oo0o7.f95812Oooo00O = list64;
                                                    c27434o000oo0o7.f95813Oooo00o = list63;
                                                    list69 = list187;
                                                    c27434o000oo0o7.f95810Oooo0 = list69;
                                                    List list189 = list62;
                                                    c27434o000oo0o7.f95814Oooo0O0 = list188;
                                                    c27434o000oo0o7.f95822OoooO00 = i66;
                                                    c27434o000oo0o7.f95821OoooO0 = i26 == true ? 1 : 0 ? 1 : 0;
                                                    c27434o000oo0o7.f95824OoooOO0 = 19;
                                                    objOooO0O02 = c26596o00O0o05.OooO0O0(arrayList31, str27, false, c27434o000oo0o7);
                                                    enumC32485OooO00o32 = enumC32485OooO00o15;
                                                    if (objOooO0O02 != enumC32485OooO00o32) {
                                                        map23 = map21;
                                                        enumC32485OooO00o16 = enumC32485OooO00o32;
                                                        list66 = list189;
                                                        i27 = i66;
                                                        list65 = list188;
                                                        list67 = list63;
                                                        list68 = list64;
                                                        int i67 = i27;
                                                        arrayList3 = new ArrayList();
                                                        for (Object obj24 : list65) {
                                                            List list190 = list65;
                                                            List list191 = list69;
                                                            if (obj24 instanceof Shape) {
                                                                arrayList3.add(obj24);
                                                            }
                                                            list65 = list190;
                                                            list69 = list191;
                                                        }
                                                        List list192 = list65;
                                                        c26649o00OoooO = c27449o00O0OoO18.f96051OooOOo0;
                                                        c27434o000oo0o7.f95801OooOo0o = c27449o00O0OoO18;
                                                        c27434o000oo0o7.f95800OooOo = str17;
                                                        c27434o000oo0o7.f95803OooOoO0 = note5;
                                                        c27434o000oo0o7.f95802OooOoO = list7;
                                                        c27434o000oo0o7.f95804OooOoOO = str27;
                                                        c27434o000oo0o7.f95806OooOoo0 = list36;
                                                        c27434o000oo0o7.f95805OooOoo = map23;
                                                        c27434o000oo0o7.f95807OooOooO = list66;
                                                        c27434o000oo0o7.f95808OooOooo = map22;
                                                        c27434o000oo0o7.f95811Oooo000 = it17;
                                                        c27434o000oo0o7.f95812Oooo00O = list68;
                                                        c27434o000oo0o7.f95813Oooo00o = list67;
                                                        c27434o000oo0o7.f95810Oooo0 = list69;
                                                        Map map51 = map23;
                                                        c27434o000oo0o7.f95814Oooo0O0 = list192;
                                                        c27434o000oo0o7.f95822OoooO00 = i67;
                                                        c27434o000oo0o7.f95821OoooO0 = i26 == true ? 1 : 0 ? 1 : 0;
                                                        c27434o000oo0o7.f95824OoooOO0 = 20;
                                                        enumC32485OooO00o25 = enumC32485OooO00o16;
                                                        if (c26649o00OoooO.OooO0O0(arrayList3, str27, false, c27434o000oo0o7) != enumC32485OooO00o25) {
                                                            enumC32485OooO00o17 = enumC32485OooO00o25;
                                                            list71 = list66;
                                                            map24 = map51;
                                                            i28 = i67;
                                                            list70 = list192;
                                                            list72 = list67;
                                                            list73 = list68;
                                                            int i68 = i28;
                                                            arrayList2 = new ArrayList();
                                                            for (Object obj25 : list70) {
                                                                List list193 = list70;
                                                                List list194 = list69;
                                                                if (obj25 instanceof TextBox) {
                                                                    arrayList2.add(obj25);
                                                                }
                                                                list70 = list193;
                                                                list69 = list194;
                                                            }
                                                            List list195 = list70;
                                                            c26264OooOOO0 = c27449o00O0OoO18.f96046OooOOO;
                                                            c27434o000oo0o7.f95801OooOo0o = c27449o00O0OoO18;
                                                            c27434o000oo0o7.f95800OooOo = str17;
                                                            c27434o000oo0o7.f95803OooOoO0 = note5;
                                                            c27434o000oo0o7.f95802OooOoO = list7;
                                                            c27434o000oo0o7.f95804OooOoOO = str27;
                                                            c27434o000oo0o7.f95806OooOoo0 = list36;
                                                            c27434o000oo0o7.f95805OooOoo = map24;
                                                            c27434o000oo0o7.f95807OooOooO = list71;
                                                            c27434o000oo0o7.f95808OooOooo = map22;
                                                            c27434o000oo0o7.f95811Oooo000 = it17;
                                                            c27434o000oo0o7.f95812Oooo00O = list73;
                                                            c27434o000oo0o7.f95813Oooo00o = list72;
                                                            c27434o000oo0o7.f95810Oooo0 = list69;
                                                            List list196 = list71;
                                                            c27434o000oo0o7.f95814Oooo0O0 = list195;
                                                            c27434o000oo0o7.f95822OoooO00 = i68;
                                                            c27434o000oo0o7.f95821OoooO0 = i26 == true ? 1 : 0 ? 1 : 0;
                                                            c27434o000oo0o7.f95824OoooOO0 = 21;
                                                            enumC32485OooO00o25 = enumC32485OooO00o17;
                                                            if (c26264OooOOO0.OooO0O0(arrayList2, str27, false, c27434o000oo0o7) != enumC32485OooO00o25) {
                                                                list74 = list195;
                                                                enumC32485OooO00o18 = enumC32485OooO00o25;
                                                                list75 = list196;
                                                                i29 = i68;
                                                                list76 = list72;
                                                                list77 = list73;
                                                                int i69 = i29;
                                                                ArrayList arrayList32 = new ArrayList();
                                                                for (Object obj26 : list74) {
                                                                    List list197 = list74;
                                                                    List list198 = list69;
                                                                    if (obj26 instanceof Quote) {
                                                                        arrayList32.add(obj26);
                                                                    }
                                                                    list74 = list197;
                                                                    list69 = list198;
                                                                }
                                                                list78 = list74;
                                                                C27994OooOOOO c27994OooOOOO4 = c27449o00O0OoO18.f96058OooOoO;
                                                                c27434o000oo0o7.f95801OooOo0o = c27449o00O0OoO18;
                                                                c27434o000oo0o7.f95800OooOo = str17;
                                                                c27434o000oo0o7.f95803OooOoO0 = note5;
                                                                c27434o000oo0o7.f95802OooOoO = list7;
                                                                c27434o000oo0o7.f95804OooOoOO = str27;
                                                                c27434o000oo0o7.f95806OooOoo0 = list36;
                                                                c27434o000oo0o7.f95805OooOoo = map24;
                                                                c27434o000oo0o7.f95807OooOooO = list75;
                                                                c27434o000oo0o7.f95808OooOooo = map22;
                                                                c27434o000oo0o7.f95811Oooo000 = it17;
                                                                c27434o000oo0o7.f95812Oooo00O = list77;
                                                                c27434o000oo0o7.f95813Oooo00o = list76;
                                                                c27434o000oo0o7.f95810Oooo0 = list69;
                                                                List list199 = list75;
                                                                c27434o000oo0o7.f95814Oooo0O0 = list78;
                                                                c27434o000oo0o7.f95822OoooO00 = i69;
                                                                c27434o000oo0o7.f95821OoooO0 = i26 == true ? 1 : 0;
                                                                c27434o000oo0o7.f95824OoooOO0 = 22;
                                                                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                                                                C27449o00O0OoO c27449o00O0OoO45 = c27449o00O0OoO18;
                                                                Map map52 = map24;
                                                                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27982OooO0O0(c27994OooOOOO4, arrayList32, str27, null), c27434o000oo0o7);
                                                                if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                                                                    objOooO0o = C32460OooOooO.f116667OooO00o;
                                                                }
                                                                enumC32485OooO00o24 = enumC32485OooO00o18;
                                                                if (objOooO0o != enumC32485OooO00o24) {
                                                                    return enumC32485OooO00o24;
                                                                }
                                                                enumC32485OooO00o19 = enumC32485OooO00o24;
                                                                i31 = i26;
                                                                list79 = list199;
                                                                i30 = i69;
                                                                c27449o00O0OoO19 = c27449o00O0OoO45;
                                                                map25 = map52;
                                                                list80 = list76;
                                                                list81 = list77;
                                                                int i70 = i31;
                                                                ArrayList arrayList33 = new ArrayList();
                                                                for (Object obj27 : list78) {
                                                                    int i71 = i30;
                                                                    List list200 = list69;
                                                                    if (obj27 instanceof HyperLink) {
                                                                        arrayList33.add(obj27);
                                                                    }
                                                                    i30 = i71;
                                                                    list69 = list200;
                                                                }
                                                                int i72 = i30;
                                                                InterfaceC27301OooOOo interfaceC27301OooOOo2 = c27449o00O0OoO19.f96054OooOo0;
                                                                c27434o000oo0o7.f95801OooOo0o = c27449o00O0OoO19;
                                                                c27434o000oo0o7.f95800OooOo = str17;
                                                                c27434o000oo0o7.f95803OooOoO0 = note5;
                                                                c27434o000oo0o7.f95802OooOoO = list7;
                                                                c27434o000oo0o7.f95804OooOoOO = str27;
                                                                c27434o000oo0o7.f95806OooOoo0 = list36;
                                                                c27434o000oo0o7.f95805OooOoo = map25;
                                                                c27434o000oo0o7.f95807OooOooO = list79;
                                                                c27434o000oo0o7.f95808OooOooo = map22;
                                                                c27434o000oo0o7.f95811Oooo000 = it17;
                                                                c27434o000oo0o7.f95812Oooo00O = list81;
                                                                c27434o000oo0o7.f95813Oooo00o = list80;
                                                                c27434o000oo0o7.f95810Oooo0 = list69;
                                                                C27449o00O0OoO c27449o00O0OoO46 = c27449o00O0OoO19;
                                                                c27434o000oo0o7.f95814Oooo0O0 = null;
                                                                c27434o000oo0o7.f95822OoooO00 = i72;
                                                                c27434o000oo0o7.f95821OoooO0 = i70 == true ? 1 : 0;
                                                                c27434o000oo0o7.f95824OoooOO0 = 23;
                                                                objOooO0O0 = interfaceC27301OooOOo2.OooO0O0(str27, arrayList33, c27434o000oo0o7);
                                                                enumC32485OooO00o23 = enumC32485OooO00o19;
                                                                if (objOooO0O0 != enumC32485OooO00o23) {
                                                                    return enumC32485OooO00o23;
                                                                }
                                                                List list201 = list80;
                                                                map26 = map25;
                                                                c27449o00O0OoO20 = c27449o00O0OoO46;
                                                                list83 = list201;
                                                                Iterator it58 = it17;
                                                                list85 = list36;
                                                                c27434o000oo0o = c27434o000oo0o7;
                                                                list82 = list69;
                                                                it18 = it58;
                                                                enumC32485OooO00o20 = enumC32485OooO00o23;
                                                                str33 = str27;
                                                                i33 = i70 == true ? 1 : 0;
                                                                i32 = i72;
                                                                list84 = list79;
                                                                list86 = list81;
                                                                C26620o00Oo00o c26620o00Oo00o3 = c27449o00O0OoO20.f96043OooOO0;
                                                                c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO20;
                                                                c27434o000oo0o.f95800OooOo = str17;
                                                                c27434o000oo0o.f95803OooOoO0 = note5;
                                                                c27434o000oo0o.f95802OooOoO = list7;
                                                                c27434o000oo0o.f95804OooOoOO = str33;
                                                                c27434o000oo0o.f95806OooOoo0 = list85;
                                                                c27434o000oo0o.f95805OooOoo = map26;
                                                                c27434o000oo0o.f95807OooOooO = list84;
                                                                c27434o000oo0o.f95808OooOooo = map22;
                                                                c27434o000oo0o.f95811Oooo000 = it18;
                                                                c27434o000oo0o.f95812Oooo00O = list86;
                                                                c27434o000oo0o.f95813Oooo00o = list82;
                                                                C27449o00O0OoO c27449o00O0OoO47 = c27449o00O0OoO20;
                                                                c27434o000oo0o.f95810Oooo0 = null;
                                                                c27434o000oo0o.f95822OoooO00 = i32;
                                                                c27434o000oo0o.f95821OoooO0 = i33 == true ? 1 : 0;
                                                                c27434o000oo0o.f95824OoooOO0 = 24;
                                                                objOooO00o2 = c26620o00Oo00o3.OooO00o(str33, list83, c27434o000oo0o);
                                                                enumC32485OooO00o22 = enumC32485OooO00o20;
                                                                if (objOooO00o2 != enumC32485OooO00o22) {
                                                                    enumC32485OooO00o21 = enumC32485OooO00o22;
                                                                    c27449o00O0OoO21 = c27449o00O0OoO47;
                                                                    list87 = list84;
                                                                    list88 = list86;
                                                                    o0OO00o0.OooOo00 oooOo002 = c27449o00O0OoO21.f96045OooOO0o;
                                                                    c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO21;
                                                                    c27434o000oo0o.f95800OooOo = str17;
                                                                    c27434o000oo0o.f95803OooOoO0 = note5;
                                                                    c27434o000oo0o.f95802OooOoO = list7;
                                                                    c27434o000oo0o.f95804OooOoOO = str33;
                                                                    c27434o000oo0o.f95806OooOoo0 = list85;
                                                                    c27434o000oo0o.f95805OooOoo = map26;
                                                                    c27434o000oo0o.f95807OooOooO = list87;
                                                                    c27434o000oo0o.f95808OooOooo = map22;
                                                                    c27434o000oo0o.f95811Oooo000 = it18;
                                                                    c27434o000oo0o.f95812Oooo00O = list82;
                                                                    C27449o00O0OoO c27449o00O0OoO48 = c27449o00O0OoO21;
                                                                    c27434o000oo0o.f95813Oooo00o = null;
                                                                    c27434o000oo0o.f95822OoooO00 = i32;
                                                                    c27434o000oo0o.f95821OoooO0 = i33 == true ? 1 : 0;
                                                                    c27434o000oo0o.f95824OoooOO0 = 25;
                                                                    objOooO00o = oooOo002.OooO00o(str33, list88, c27434o000oo0o);
                                                                    enumC32485OooO00o22 = enumC32485OooO00o21;
                                                                    if (objOooO00o != enumC32485OooO00o22) {
                                                                        List<String> list202 = list7;
                                                                        list89 = list87;
                                                                        list90 = list202;
                                                                        map27 = map26;
                                                                        c27449o00O0OoO22 = c27449o00O0OoO48;
                                                                        c27994OooOOOO = c27449o00O0OoO22.f96058OooOoO;
                                                                        c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO22;
                                                                        c27434o000oo0o.f95800OooOo = str17;
                                                                        c27434o000oo0o.f95803OooOoO0 = note5;
                                                                        c27434o000oo0o.f95802OooOoO = list90;
                                                                        c27434o000oo0o.f95804OooOoOO = str33;
                                                                        c27434o000oo0o.f95806OooOoo0 = list85;
                                                                        c27434o000oo0o.f95805OooOoo = map27;
                                                                        c27434o000oo0o.f95807OooOooO = list89;
                                                                        c27434o000oo0o.f95808OooOooo = map22;
                                                                        c27434o000oo0o.f95811Oooo000 = it18;
                                                                        C27449o00O0OoO c27449o00O0OoO49 = c27449o00O0OoO22;
                                                                        c27434o000oo0o.f95812Oooo00O = null;
                                                                        c27434o000oo0o.f95822OoooO00 = i32;
                                                                        c27434o000oo0o.f95821OoooO0 = i33 == true ? 1 : 0;
                                                                        c27434o000oo0o.f95824OoooOO0 = 26;
                                                                        if (c27994OooOOOO.OooO0Oo(str33, list82, c27434o000oo0o) != enumC32485OooO00o22) {
                                                                            it5 = it18;
                                                                            map28 = map27;
                                                                            note8 = note5;
                                                                            c27449o00O0OoO23 = c27449o00O0OoO49;
                                                                            list91 = list90;
                                                                            list102 = list89;
                                                                            str18 = str33;
                                                                            i9 = i32;
                                                                            list19 = list85;
                                                                            c27434o000oo0o2 = c27434o000oo0o;
                                                                            c27449o00O0OoO6 = c27449o00O0OoO23;
                                                                            r12 = i33;
                                                                            list101 = list102;
                                                                            list7 = list91;
                                                                            note5 = note8;
                                                                            enumC32485OooO00o2 = enumC32485OooO00o22;
                                                                            map5 = map22;
                                                                            linkedHashMap = map28;
                                                                            list20 = list101;
                                                                            r1 = r12;
                                                                            if (!it5.hasNext()) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                return enumC32485OooO00o22;
                                                            }
                                                        }
                                                    }
                                                    return enumC32485OooO00o32;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    it20 = it22;
                                    str31 = str29;
                                    List list203 = list174;
                                    enumC32485OooO00o13 = enumC32485OooO00o39;
                                    c27449o00O0OoO24 = c27449o00O0OoO16;
                                    note7 = note5;
                                    collection5 = arrayList29;
                                    list93 = list175;
                                    list92 = list203;
                                    image2 = null;
                                    list52 = list52;
                                    String str842 = str31;
                                    if (image2 != null) {
                                    }
                                    if (it22.hasNext()) {
                                    }
                                }
                            }
                            return enumC32485OooO00o13;
                        }
                    }
                    return enumC32485OooO00o12;
                }
                return enumC32485OooO00o25;
            case 10:
                int i73 = c27434o000oo0o.f95821OoooO0;
                i15 = c27434o000oo0o.f95822OoooO00;
                list32 = (List) c27434o000oo0o.f95810Oooo0;
                page11 = (Page) c27434o000oo0o.f95813Oooo00o;
                String str86 = (String) c27434o000oo0o.f95812Oooo00O;
                it9 = c27434o000oo0o.f95811Oooo000;
                Map map53 = (Map) c27434o000oo0o.f95808OooOooo;
                List list204 = (List) c27434o000oo0o.f95807OooOooO;
                Map map54 = (Map) c27434o000oo0o.f95805OooOoo;
                List list205 = (List) c27434o000oo0o.f95806OooOoo0;
                String str87 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list206 = (List) c27434o000oo0o.f95802OooOoO;
                Note note20 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str88 = (String) c27434o000oo0o.f95800OooOo;
                C27449o00O0OoO c27449o00O0OoO50 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                c27449o00O0OoO11 = c27449o00O0OoO50;
                enumC32485OooO00o7 = enumC32485OooO00o32;
                str6 = "toString(...)";
                list33 = list204;
                list34 = list205;
                i11 = i73;
                note5 = note20;
                str17 = str88;
                c27434o000oo0o5 = c27434o000oo0o;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                map11 = map54;
                str18 = str87;
                obj6 = objOooo0;
                map10 = map53;
                str21 = str86;
                list7 = list206;
                Iterable iterable52 = (Iterable) obj6;
                int i592 = i15;
                Page page312 = page11;
                String str772 = str21;
                ArrayList arrayList232 = new ArrayList(C34428OooOOo.OooOOoo(iterable52, 10));
                it26 = iterable52.iterator();
                while (it26.hasNext()) {
                }
                list32.addAll(arrayList232);
                o0OO00o0.OooOo00 oooOo003 = c27449o00O0OoO11.f96045OooOO0o;
                c27434o000oo0o5.f95801OooOo0o = c27449o00O0OoO11;
                c27434o000oo0o5.f95800OooOo = str17;
                c27434o000oo0o5.f95803OooOoO0 = note5;
                c27434o000oo0o5.f95802OooOoO = list7;
                c27434o000oo0o5.f95804OooOoOO = str18;
                c27434o000oo0o5.f95806OooOoo0 = list34;
                c27434o000oo0o5.f95805OooOoo = map11;
                c27434o000oo0o5.f95807OooOooO = list33;
                c27434o000oo0o5.f95808OooOooo = map10;
                c27434o000oo0o5.f95811Oooo000 = it9;
                str23 = str772;
                c27434o000oo0o5.f95812Oooo00O = str23;
                page12 = page312;
                c27434o000oo0o5.f95813Oooo00o = page12;
                c27434o000oo0o5.f95810Oooo0 = list32;
                i16 = i592;
                c27434o000oo0o5.f95822OoooO00 = i16;
                C27449o00O0OoO c27449o00O0OoO392 = c27449o00O0OoO11;
                c27434o000oo0o5.f95821OoooO0 = i11 == true ? 1 : 0;
                c27434o000oo0o5.f95824OoooOO0 = 11;
                serializableOooO0Oo = oooOo003.OooO0Oo(str23, str17, c27434o000oo0o5);
                enumC32485OooO00o25 = enumC32485OooO00o7;
                if (serializableOooO0Oo != enumC32485OooO00o25) {
                }
                return enumC32485OooO00o25;
            case 11:
                int i74 = c27434o000oo0o.f95821OoooO0;
                i16 = c27434o000oo0o.f95822OoooO00;
                list32 = (List) c27434o000oo0o.f95810Oooo0;
                page12 = (Page) c27434o000oo0o.f95813Oooo00o;
                String str89 = (String) c27434o000oo0o.f95812Oooo00O;
                it9 = c27434o000oo0o.f95811Oooo000;
                Map map55 = (Map) c27434o000oo0o.f95808OooOooo;
                List list207 = (List) c27434o000oo0o.f95807OooOooO;
                Map map56 = (Map) c27434o000oo0o.f95805OooOoo;
                List list208 = (List) c27434o000oo0o.f95806OooOoo0;
                String str90 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list209 = (List) c27434o000oo0o.f95802OooOoO;
                Note note21 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str91 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO12 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                str22 = str90;
                obj7 = objOooo0;
                enumC32485OooO00o8 = enumC32485OooO00o32;
                str6 = "toString(...)";
                list35 = list207;
                i17 = i74;
                str17 = str91;
                c27434o000oo0o5 = c27434o000oo0o;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                map12 = map56;
                list36 = list208;
                note5 = note21;
                map10 = map55;
                str23 = str89;
                list7 = list209;
                Iterable iterable62 = (Iterable) obj7;
                int i602 = i17;
                int i612 = i16;
                List list1662 = list32;
                ArrayList arrayList242 = new ArrayList(C34428OooOOo.OooOOoo(iterable62, 10));
                it24 = iterable62.iterator();
                while (it24.hasNext()) {
                }
                String str782 = str22;
                C26620o00Oo00o c26620o00Oo00o22 = c27449o00O0OoO12.f96043OooOO0;
                c27434o000oo0o5.f95801OooOo0o = c27449o00O0OoO12;
                c27434o000oo0o5.f95800OooOo = str17;
                c27434o000oo0o5.f95803OooOoO0 = note5;
                c27434o000oo0o5.f95802OooOoO = list7;
                c27434o000oo0o5.f95804OooOoOO = str782;
                c27434o000oo0o5.f95806OooOoo0 = list36;
                c27434o000oo0o5.f95805OooOoo = map12;
                c27434o000oo0o5.f95807OooOooO = list35;
                c27434o000oo0o5.f95808OooOooo = map10;
                c27434o000oo0o5.f95811Oooo000 = it9;
                c27434o000oo0o5.f95812Oooo00O = str23;
                c27434o000oo0o5.f95813Oooo00o = page12;
                c27434o000oo0o5.f95810Oooo0 = list1662;
                c27434o000oo0o5.f95814Oooo0O0 = arrayList242;
                C27449o00O0OoO c27449o00O0OoO402 = c27449o00O0OoO12;
                c27434o000oo0o5.f95822OoooO00 = i612;
                c27434o000oo0o5.f95821OoooO0 = i602 == true ? 1 : 0;
                c27434o000oo0o5.f95824OoooOO0 = 12;
                serializableOooO0OO = c26620o00Oo00o22.OooO0OO(str23, str17, c27434o000oo0o5);
                enumC32485OooO00o27 = enumC32485OooO00o8;
                if (serializableOooO0OO != enumC32485OooO00o27) {
                }
                break;
            case 12:
                int i75 = c27434o000oo0o.f95821OoooO0;
                int i76 = c27434o000oo0o.f95822OoooO00;
                List list210 = (List) c27434o000oo0o.f95814Oooo0O0;
                List list211 = (List) c27434o000oo0o.f95810Oooo0;
                Page page34 = (Page) c27434o000oo0o.f95813Oooo00o;
                String str92 = (String) c27434o000oo0o.f95812Oooo00O;
                Iterator it59 = c27434o000oo0o.f95811Oooo000;
                Map map57 = (Map) c27434o000oo0o.f95808OooOooo;
                List list212 = (List) c27434o000oo0o.f95807OooOooO;
                Map map58 = (Map) c27434o000oo0o.f95805OooOoo;
                List list213 = (List) c27434o000oo0o.f95806OooOoo0;
                String str93 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list214 = (List) c27434o000oo0o.f95802OooOoO;
                Note note22 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str94 = (String) c27434o000oo0o.f95800OooOo;
                C27449o00O0OoO c27449o00O0OoO51 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                str24 = str93;
                c27449o00O0OoO13 = c27449o00O0OoO51;
                enumC32485OooO00o9 = enumC32485OooO00o32;
                it10 = it59;
                map13 = map57;
                i18 = i75;
                str17 = str94;
                page13 = page34;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                str6 = "toString(...)";
                list37 = list212;
                map12 = map58;
                list7 = list214;
                note5 = note22;
                str25 = str92;
                list38 = list211;
                list39 = list210;
                i19 = i76;
                c27434o000oo0o6 = c27434o000oo0o;
                list36 = list213;
                obj8 = objOooo0;
                Iterable iterable72 = (Iterable) obj8;
                int i622 = i19;
                List list1672 = list39;
                List list1682 = list38;
                ArrayList arrayList252 = new ArrayList(C34428OooOOo.OooOOoo(iterable72, 10));
                it23 = iterable72.iterator();
                while (it23.hasNext()) {
                }
                str27 = str24;
                ArrayList arrayList272 = new ArrayList();
                C27994OooOOOO c27994OooOOOO22 = c27449o00O0OoO13.f96058OooOoO;
                c27434o000oo0o6.f95801OooOo0o = c27449o00O0OoO13;
                c27434o000oo0o6.f95800OooOo = str17;
                c27434o000oo0o6.f95803OooOoO0 = note5;
                c27434o000oo0o6.f95802OooOoO = list7;
                c27434o000oo0o6.f95804OooOoOO = str27;
                c27434o000oo0o6.f95806OooOoo0 = list36;
                c27434o000oo0o6.f95805OooOoo = map12;
                c27434o000oo0o6.f95807OooOooO = list37;
                c27434o000oo0o6.f95808OooOooo = map13;
                c27434o000oo0o6.f95811Oooo000 = it10;
                c27434o000oo0o6.f95812Oooo00O = str25;
                c27434o000oo0o6.f95813Oooo00o = page13;
                C27449o00O0OoO c27449o00O0OoO412 = c27449o00O0OoO13;
                c27434o000oo0o6.f95810Oooo0 = list1682;
                c27434o000oo0o6.f95814Oooo0O0 = list1672;
                c27434o000oo0o6.f95815Oooo0OO = arrayList252;
                c27434o000oo0o6.f95817Oooo0o0 = arrayList272;
                c27434o000oo0o6.f95822OoooO00 = i622;
                int i632 = i18;
                c27434o000oo0o6.f95821OoooO0 = i632 == true ? 1 : 0;
                c27434o000oo0o6.f95824OoooOO0 = 13;
                objOooO0O03 = c27994OooOOOO22.OooO0O0(str25, str17, c27434o000oo0o6);
                enumC32485OooO00o12 = enumC32485OooO00o9;
                if (objOooO0O03 != enumC32485OooO00o12) {
                }
                return enumC32485OooO00o12;
            case 13:
                int i77 = c27434o000oo0o.f95821OoooO0;
                int i78 = c27434o000oo0o.f95822OoooO00;
                list40 = (List) c27434o000oo0o.f95817Oooo0o0;
                List list215 = (List) c27434o000oo0o.f95815Oooo0OO;
                List list216 = (List) c27434o000oo0o.f95814Oooo0O0;
                List list217 = (List) c27434o000oo0o.f95810Oooo0;
                Page page35 = (Page) c27434o000oo0o.f95813Oooo00o;
                String str95 = (String) c27434o000oo0o.f95812Oooo00O;
                Iterator it60 = c27434o000oo0o.f95811Oooo000;
                Map map59 = (Map) c27434o000oo0o.f95808OooOooo;
                List list218 = (List) c27434o000oo0o.f95807OooOooO;
                Map map60 = (Map) c27434o000oo0o.f95805OooOoo;
                List list219 = (List) c27434o000oo0o.f95806OooOoo0;
                String str96 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list220 = (List) c27434o000oo0o.f95802OooOoO;
                Note note23 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str97 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO14 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                enumC32485OooO00o10 = enumC32485OooO00o32;
                it11 = it60;
                map14 = map59;
                note5 = note23;
                list41 = list216;
                i20 = i77;
                list7 = list220;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                str6 = "toString(...)";
                list42 = list218;
                map12 = map60;
                obj9 = objOooo0;
                list43 = list217;
                page14 = page35;
                str26 = str95;
                str17 = str97;
                i21 = i78;
                list44 = list215;
                str27 = str96;
                c27434o000oo0o6 = c27434o000oo0o;
                list36 = list219;
                List list1692 = (List) obj9;
                List list1702 = list44;
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                List list1712 = list41;
                int size22 = list1692.size();
                String str822 = str26;
                Iterator it552 = it11;
                Map map492 = map14;
                c20358OooO00o2.OooO00o(androidx.core.app.OooO.OooO00o(size22, "batchInsertSrcPagesToDstNote, quotes: ", ", ", oOo000Oo.OooOo.o000oOoO(list1692, null, null, null, new InterfaceC32507OooOO0o() { // from class: o0OOo0o.o000o0o0
                    @Override // oO0O000o.InterfaceC32507OooOO0o
                    public final Object invoke(Object obj212) {
                        Quote it562 = (Quote) obj212;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(it562, "it");
                        return Oooo0oO.o0Oo0oo.OooO0Oo(it562.id, C18115b5.CONNECTOR, it562.getText());
                    }
                }, 31)), new Object[0]);
                Iterable<Quote> iterable82 = (Iterable) obj9;
                while (r4.hasNext()) {
                }
                ArrayList arrayList282 = new ArrayList(C34428OooOOo.OooOOoo(iterable82, 10));
                while (r0.hasNext()) {
                }
                list43.addAll(arrayList282);
                C27994OooOOOO c27994OooOOOO32 = c27449o00O0OoO14.f96058OooOoO;
                c27434o000oo0o6.f95801OooOo0o = c27449o00O0OoO14;
                c27434o000oo0o6.f95800OooOo = str17;
                c27434o000oo0o6.f95803OooOoO0 = note5;
                c27434o000oo0o6.f95802OooOoO = list7;
                c27434o000oo0o6.f95804OooOoOO = str27;
                c27434o000oo0o6.f95806OooOoo0 = list36;
                c27434o000oo0o6.f95805OooOoo = map12;
                c27434o000oo0o6.f95807OooOooO = list42;
                c27434o000oo0o6.f95808OooOooo = map492;
                c27434o000oo0o6.f95811Oooo000 = it552;
                c27434o000oo0o6.f95812Oooo00O = str822;
                Page page322 = page14;
                c27434o000oo0o6.f95813Oooo00o = page322;
                c27434o000oo0o6.f95810Oooo0 = list43;
                C27449o00O0OoO c27449o00O0OoO422 = c27449o00O0OoO14;
                c27434o000oo0o6.f95814Oooo0O0 = list1712;
                c27434o000oo0o6.f95815Oooo0OO = list1702;
                c27434o000oo0o6.f95817Oooo0o0 = null;
                c27434o000oo0o6.f95822OoooO00 = i21;
                c27434o000oo0o6.f95821OoooO0 = i20 == true ? 1 : 0 ? 1 : 0;
                c27434o000oo0o6.f95824OoooOO0 = 14;
                objOooO0OO = c27994OooOOOO32.OooO0OO(list40, str17, c27434o000oo0o6);
                enumC32485OooO00o26 = enumC32485OooO00o10;
                if (objOooO0OO != enumC32485OooO00o26) {
                }
                break;
            case 14:
                int i79 = c27434o000oo0o.f95821OoooO0;
                int i80 = c27434o000oo0o.f95822OoooO00;
                List list221 = (List) c27434o000oo0o.f95815Oooo0OO;
                List list222 = (List) c27434o000oo0o.f95814Oooo0O0;
                List list223 = (List) c27434o000oo0o.f95810Oooo0;
                Page page36 = (Page) c27434o000oo0o.f95813Oooo00o;
                String str98 = (String) c27434o000oo0o.f95812Oooo00O;
                Iterator it61 = c27434o000oo0o.f95811Oooo000;
                Map map61 = (Map) c27434o000oo0o.f95808OooOooo;
                List list224 = (List) c27434o000oo0o.f95807OooOooO;
                Map map62 = (Map) c27434o000oo0o.f95805OooOoo;
                List list225 = (List) c27434o000oo0o.f95806OooOoo0;
                String str99 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list226 = (List) c27434o000oo0o.f95802OooOoO;
                Note note24 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str100 = (String) c27434o000oo0o.f95800OooOo;
                C27449o00O0OoO c27449o00O0OoO52 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                map12 = map62;
                obj10 = objOooo0;
                it12 = it61;
                str17 = str100;
                i20 = i79;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                str6 = "toString(...)";
                list45 = list224;
                note5 = note24;
                c27449o00O0OoO15 = c27449o00O0OoO52;
                enumC32485OooO00o11 = enumC32485OooO00o32;
                i21 = i80;
                list46 = list221;
                page15 = page36;
                str28 = str98;
                map15 = map61;
                c27434o000oo0o6 = c27434o000oo0o;
                list47 = list222;
                list48 = list223;
                list36 = list225;
                str27 = str99;
                list7 = list226;
                List list1722 = (List) obj10;
                C26515OooooO0 c26515OooooO02 = c27449o00O0OoO15.f96052OooOOoo;
                c27434o000oo0o6.f95801OooOo0o = c27449o00O0OoO15;
                c27434o000oo0o6.f95800OooOo = str17;
                c27434o000oo0o6.f95803OooOoO0 = note5;
                c27434o000oo0o6.f95802OooOoO = list7;
                c27434o000oo0o6.f95804OooOoOO = str27;
                c27434o000oo0o6.f95806OooOoo0 = list36;
                c27434o000oo0o6.f95805OooOoo = map12;
                c27434o000oo0o6.f95807OooOooO = list45;
                c27434o000oo0o6.f95808OooOooo = map15;
                c27434o000oo0o6.f95811Oooo000 = it12;
                c27434o000oo0o6.f95812Oooo00O = str28;
                c27434o000oo0o6.f95813Oooo00o = page15;
                c27434o000oo0o6.f95810Oooo0 = list48;
                c27434o000oo0o6.f95814Oooo0O0 = list47;
                C27449o00O0OoO c27449o00O0OoO432 = c27449o00O0OoO15;
                c27434o000oo0o6.f95815Oooo0OO = list46;
                c27434o000oo0o6.f95817Oooo0o0 = list1722;
                c27434o000oo0o6.f95822OoooO00 = i21;
                c27434o000oo0o6.f95821OoooO0 = i20 == true ? 1 : 0 ? 1 : 0;
                c27434o000oo0o6.f95824OoooOO0 = 15;
                objOooOO0O = c26515OooooO02.OooOO0O(str28, str17, c27434o000oo0o6);
                enumC32485OooO00o12 = enumC32485OooO00o11;
                if (objOooOO0O != enumC32485OooO00o12) {
                }
                return enumC32485OooO00o12;
            case 15:
                int i81 = c27434o000oo0o.f95821OoooO0;
                int i82 = c27434o000oo0o.f95822OoooO00;
                list49 = (List) c27434o000oo0o.f95817Oooo0o0;
                List list227 = (List) c27434o000oo0o.f95815Oooo0OO;
                List list228 = (List) c27434o000oo0o.f95814Oooo0O0;
                List list229 = (List) c27434o000oo0o.f95810Oooo0;
                Page page37 = (Page) c27434o000oo0o.f95813Oooo00o;
                String str101 = (String) c27434o000oo0o.f95812Oooo00O;
                Iterator it62 = c27434o000oo0o.f95811Oooo000;
                Map map63 = (Map) c27434o000oo0o.f95808OooOooo;
                List list230 = (List) c27434o000oo0o.f95807OooOooO;
                Map map64 = (Map) c27434o000oo0o.f95805OooOoo;
                List list231 = (List) c27434o000oo0o.f95806OooOoo0;
                String str102 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list232 = (List) c27434o000oo0o.f95802OooOoO;
                Note note25 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str103 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO16 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                list50 = list227;
                str29 = str101;
                it13 = it62;
                map16 = map63;
                note5 = note25;
                str17 = str103;
                str27 = str102;
                i21 = i82;
                list48 = list229;
                i20 = i81;
                c27434o000oo0o6 = c27434o000oo0o;
                enumC32485OooO00o12 = enumC32485OooO00o32;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                page15 = page37;
                map12 = map64;
                list36 = list231;
                list51 = list228;
                list7 = list232;
                str6 = "toString(...)";
                list52 = list230;
                Collection arrayList292 = new ArrayList();
                List list1732 = list51;
                page18 = page15;
                it21 = it13;
                EnumC32485OooO00o enumC32485OooO00o392 = enumC32485OooO00o12;
                list93 = list50;
                list56 = list49;
                c27434o000oo0o7 = c27434o000oo0o6;
                list94 = list48;
                List list1742 = list1732;
                it22 = ((Iterable) objOooo0).iterator();
                map18 = map16;
                if (it22.hasNext()) {
                }
                return enumC32485OooO00o13;
            case 16:
                int i83 = c27434o000oo0o.f95821OoooO0;
                int i84 = c27434o000oo0o.f95822OoooO00;
                String str104 = c27434o000oo0o.f95809Oooo;
                Image image5 = c27434o000oo0o.f95819Oooo0oo;
                Iterator it63 = c27434o000oo0o.f95818Oooo0oO;
                Collection collection13 = c27434o000oo0o.f95816Oooo0o;
                List list233 = (List) c27434o000oo0o.f95817Oooo0o0;
                List list234 = (List) c27434o000oo0o.f95815Oooo0OO;
                List list235 = (List) c27434o000oo0o.f95814Oooo0O0;
                List list236 = (List) c27434o000oo0o.f95810Oooo0;
                Page page38 = (Page) c27434o000oo0o.f95813Oooo00o;
                String str105 = (String) c27434o000oo0o.f95812Oooo00O;
                Iterator it64 = c27434o000oo0o.f95811Oooo000;
                Map map65 = (Map) c27434o000oo0o.f95808OooOooo;
                List list237 = (List) c27434o000oo0o.f95807OooOooO;
                map17 = (Map) c27434o000oo0o.f95805OooOoo;
                List list238 = (List) c27434o000oo0o.f95806OooOoo0;
                String str106 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list239 = (List) c27434o000oo0o.f95802OooOoO;
                note7 = (Note) c27434o000oo0o.f95803OooOoO0;
                str30 = (String) c27434o000oo0o.f95800OooOo;
                C27449o00O0OoO c27449o00O0OoO53 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                str31 = str105;
                c27449o00O0OoO17 = c27449o00O0OoO53;
                str32 = str104;
                image = image5;
                str27 = str106;
                page16 = page38;
                c27434o000oo0o7 = c27434o000oo0o;
                list53 = list236;
                list36 = list238;
                i21 = i84;
                list54 = list235;
                it14 = it64;
                enumC32485OooO00o13 = enumC32485OooO00o32;
                str6 = "toString(...)";
                i22 = i83;
                list55 = list237;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                it15 = it63;
                list7 = list239;
                list56 = list233;
                collection4 = collection13;
                objOooO0oO = objOooo0;
                map18 = map65;
                list95 = list234;
                Image imageCopy$default2 = Image.copy$default(image, str32, page16.getId(), (String) objOooO0oO, note7.getActivatedPageLayerId(), null, 0.0f, 0L, 0L, false, 496, null);
                Collection collection122 = collection4;
                page18 = page16;
                collection5 = collection122;
                c27449o00O0OoO24 = c27449o00O0OoO17;
                it20 = it15;
                image2 = imageCopy$default2;
                list93 = list95;
                map12 = map17;
                str17 = str30;
                i20 = i22;
                it21 = it14;
                list94 = list53;
                list52 = list55;
                list92 = list54;
                String str8422 = str31;
                if (image2 != null) {
                }
                if (it22.hasNext()) {
                }
                return enumC32485OooO00o13;
            case 17:
                int i85 = c27434o000oo0o.f95821OoooO0;
                i23 = c27434o000oo0o.f95822OoooO00;
                List list240 = (List) c27434o000oo0o.f95815Oooo0OO;
                List list241 = (List) c27434o000oo0o.f95814Oooo0O0;
                List list242 = (List) c27434o000oo0o.f95810Oooo0;
                listOooo0o0 = (List) c27434o000oo0o.f95813Oooo00o;
                Page page39 = (Page) c27434o000oo0o.f95812Oooo00O;
                Iterator it65 = c27434o000oo0o.f95811Oooo000;
                Map map66 = (Map) c27434o000oo0o.f95808OooOooo;
                List list243 = (List) c27434o000oo0o.f95807OooOooO;
                Map map67 = (Map) c27434o000oo0o.f95805OooOoo;
                List list244 = (List) c27434o000oo0o.f95806OooOoo0;
                String str107 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list245 = (List) c27434o000oo0o.f95802OooOoO;
                Note note26 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str108 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO18 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                str27 = str107;
                i24 = i85;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                list57 = list241;
                str6 = "toString(...)";
                map19 = map66;
                list58 = list243;
                note5 = note26;
                map20 = map67;
                obj11 = objOooo0;
                enumC32485OooO00o14 = enumC32485OooO00o32;
                list59 = list240;
                it16 = it65;
                str17 = str108;
                c27434o000oo0o7 = c27434o000oo0o;
                list36 = list244;
                page17 = page39;
                list60 = list242;
                list7 = list245;
                int i642 = i23;
                ArrayList arrayList302 = new ArrayList();
                List list1792 = list57;
                while (r20.hasNext()) {
                }
                List list1822 = list59;
                List list1832 = list1792;
                listOooo0o0.addAll(arrayList302);
                if (i24 != 0) {
                }
                arrayList4 = new ArrayList();
                it19 = listOooo0o0.iterator();
                while (it19.hasNext()) {
                }
                interfaceC27323Oooo0oO = c27449o00O0OoO18.f96034OooO;
                c27434o000oo0o7.f95801OooOo0o = c27449o00O0OoO18;
                c27434o000oo0o7.f95800OooOo = str17;
                c27434o000oo0o7.f95803OooOoO0 = note5;
                c27434o000oo0o7.f95802OooOoO = list7;
                c27434o000oo0o7.f95804OooOoOO = str27;
                c27434o000oo0o7.f95806OooOoo0 = list36;
                c27434o000oo0o7.f95805OooOoo = map20;
                c27434o000oo0o7.f95807OooOooO = list58;
                c27434o000oo0o7.f95808OooOooo = map19;
                c27434o000oo0o7.f95811Oooo000 = it16;
                c27434o000oo0o7.f95812Oooo00O = list60;
                List list1842 = list1832;
                c27434o000oo0o7.f95813Oooo00o = list1842;
                Map map502 = map20;
                c27434o000oo0o7.f95810Oooo0 = list1822;
                c27434o000oo0o7.f95814Oooo0O0 = listOooo0o0;
                c27434o000oo0o7.f95815Oooo0OO = null;
                c27434o000oo0o7.f95822OoooO00 = i642;
                int i652 = i24;
                c27434o000oo0o7.f95821OoooO0 = i652 == true ? 1 : 0;
                c27434o000oo0o7.f95824OoooOO0 = 18;
                enumC32485OooO00o25 = enumC32485OooO00o14;
                if (interfaceC27323Oooo0oO.OooO0o(arrayList4, str27, false, c27434o000oo0o7) != enumC32485OooO00o25) {
                }
                return enumC32485OooO00o25;
            case 18:
                int i86 = c27434o000oo0o.f95821OoooO0;
                i25 = c27434o000oo0o.f95822OoooO00;
                List list246 = (List) c27434o000oo0o.f95814Oooo0O0;
                List list247 = (List) c27434o000oo0o.f95810Oooo0;
                List list248 = (List) c27434o000oo0o.f95813Oooo00o;
                List list249 = (List) c27434o000oo0o.f95812Oooo00O;
                Iterator it66 = c27434o000oo0o.f95811Oooo000;
                Map map68 = (Map) c27434o000oo0o.f95808OooOooo;
                List list250 = (List) c27434o000oo0o.f95807OooOooO;
                Map map69 = (Map) c27434o000oo0o.f95805OooOoo;
                List list251 = (List) c27434o000oo0o.f95806OooOoo0;
                String str109 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list252 = (List) c27434o000oo0o.f95802OooOoO;
                Note note27 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str110 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO18 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                enumC32485OooO00o15 = enumC32485OooO00o32;
                list61 = list247;
                list62 = list250;
                map21 = map69;
                i26 = i86;
                str27 = str109;
                note5 = note27;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                map22 = map68;
                str17 = str110;
                list63 = list248;
                str6 = "toString(...)";
                list7 = list252;
                it17 = it66;
                list64 = list249;
                listOooo0o0 = list246;
                c27434o000oo0o7 = c27434o000oo0o;
                list36 = list251;
                int i662 = i25;
                ArrayList arrayList312 = new ArrayList();
                while (r21.hasNext()) {
                }
                List list1872 = list61;
                List list1882 = listOooo0o0;
                C26596o00O0o0 c26596o00O0o052 = c27449o00O0OoO18.f96047OooOOO0;
                c27434o000oo0o7.f95801OooOo0o = c27449o00O0OoO18;
                c27434o000oo0o7.f95800OooOo = str17;
                c27434o000oo0o7.f95803OooOoO0 = note5;
                c27434o000oo0o7.f95802OooOoO = list7;
                c27434o000oo0o7.f95804OooOoOO = str27;
                c27434o000oo0o7.f95806OooOoo0 = list36;
                c27434o000oo0o7.f95805OooOoo = map21;
                c27434o000oo0o7.f95807OooOooO = list62;
                c27434o000oo0o7.f95808OooOooo = map22;
                c27434o000oo0o7.f95811Oooo000 = it17;
                c27434o000oo0o7.f95812Oooo00O = list64;
                c27434o000oo0o7.f95813Oooo00o = list63;
                list69 = list1872;
                c27434o000oo0o7.f95810Oooo0 = list69;
                List list1892 = list62;
                c27434o000oo0o7.f95814Oooo0O0 = list1882;
                c27434o000oo0o7.f95822OoooO00 = i662;
                c27434o000oo0o7.f95821OoooO0 = i26 == true ? 1 : 0 ? 1 : 0;
                c27434o000oo0o7.f95824OoooOO0 = 19;
                objOooO0O02 = c26596o00O0o052.OooO0O0(arrayList312, str27, false, c27434o000oo0o7);
                enumC32485OooO00o32 = enumC32485OooO00o15;
                if (objOooO0O02 != enumC32485OooO00o32) {
                }
                return enumC32485OooO00o32;
            case 19:
                int i87 = c27434o000oo0o.f95821OoooO0;
                i27 = c27434o000oo0o.f95822OoooO00;
                List list253 = (List) c27434o000oo0o.f95814Oooo0O0;
                List list254 = (List) c27434o000oo0o.f95810Oooo0;
                List list255 = (List) c27434o000oo0o.f95813Oooo00o;
                List list256 = (List) c27434o000oo0o.f95812Oooo00O;
                Iterator it67 = c27434o000oo0o.f95811Oooo000;
                Map map70 = (Map) c27434o000oo0o.f95808OooOooo;
                List list257 = (List) c27434o000oo0o.f95807OooOooO;
                Map map71 = (Map) c27434o000oo0o.f95805OooOoo;
                List list258 = (List) c27434o000oo0o.f95806OooOoo0;
                String str111 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list259 = (List) c27434o000oo0o.f95802OooOoO;
                Note note28 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str112 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO18 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                enumC32485OooO00o16 = enumC32485OooO00o32;
                list65 = list253;
                list66 = list257;
                map23 = map71;
                i26 = i87;
                note5 = note28;
                c27434o000oo0o7 = c27434o000oo0o;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                map22 = map70;
                str17 = str112;
                list36 = list258;
                list67 = list255;
                str6 = "toString(...)";
                list7 = list259;
                it17 = it67;
                list68 = list256;
                list69 = list254;
                str27 = str111;
                int i672 = i27;
                arrayList3 = new ArrayList();
                while (r21.hasNext()) {
                }
                List list1922 = list65;
                c26649o00OoooO = c27449o00O0OoO18.f96051OooOOo0;
                c27434o000oo0o7.f95801OooOo0o = c27449o00O0OoO18;
                c27434o000oo0o7.f95800OooOo = str17;
                c27434o000oo0o7.f95803OooOoO0 = note5;
                c27434o000oo0o7.f95802OooOoO = list7;
                c27434o000oo0o7.f95804OooOoOO = str27;
                c27434o000oo0o7.f95806OooOoo0 = list36;
                c27434o000oo0o7.f95805OooOoo = map23;
                c27434o000oo0o7.f95807OooOooO = list66;
                c27434o000oo0o7.f95808OooOooo = map22;
                c27434o000oo0o7.f95811Oooo000 = it17;
                c27434o000oo0o7.f95812Oooo00O = list68;
                c27434o000oo0o7.f95813Oooo00o = list67;
                c27434o000oo0o7.f95810Oooo0 = list69;
                Map map512 = map23;
                c27434o000oo0o7.f95814Oooo0O0 = list1922;
                c27434o000oo0o7.f95822OoooO00 = i672;
                c27434o000oo0o7.f95821OoooO0 = i26 == true ? 1 : 0 ? 1 : 0;
                c27434o000oo0o7.f95824OoooOO0 = 20;
                enumC32485OooO00o25 = enumC32485OooO00o16;
                if (c26649o00OoooO.OooO0O0(arrayList3, str27, false, c27434o000oo0o7) != enumC32485OooO00o25) {
                }
                return enumC32485OooO00o25;
            case 20:
                int i88 = c27434o000oo0o.f95821OoooO0;
                i28 = c27434o000oo0o.f95822OoooO00;
                List list260 = (List) c27434o000oo0o.f95814Oooo0O0;
                List list261 = (List) c27434o000oo0o.f95810Oooo0;
                List list262 = (List) c27434o000oo0o.f95813Oooo00o;
                List list263 = (List) c27434o000oo0o.f95812Oooo00O;
                Iterator it68 = c27434o000oo0o.f95811Oooo000;
                Map map72 = (Map) c27434o000oo0o.f95808OooOooo;
                List list264 = (List) c27434o000oo0o.f95807OooOooO;
                Map map73 = (Map) c27434o000oo0o.f95805OooOoo;
                List list265 = (List) c27434o000oo0o.f95806OooOoo0;
                String str113 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list266 = (List) c27434o000oo0o.f95802OooOoO;
                Note note29 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str114 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO18 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                enumC32485OooO00o17 = enumC32485OooO00o32;
                list70 = list260;
                list71 = list264;
                map24 = map73;
                i26 = i88;
                note5 = note29;
                c27434o000oo0o7 = c27434o000oo0o;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                map22 = map72;
                str17 = str114;
                list36 = list265;
                list72 = list262;
                str6 = "toString(...)";
                list7 = list266;
                it17 = it68;
                list73 = list263;
                list69 = list261;
                str27 = str113;
                int i682 = i28;
                arrayList2 = new ArrayList();
                while (r21.hasNext()) {
                }
                List list1952 = list70;
                c26264OooOOO0 = c27449o00O0OoO18.f96046OooOOO;
                c27434o000oo0o7.f95801OooOo0o = c27449o00O0OoO18;
                c27434o000oo0o7.f95800OooOo = str17;
                c27434o000oo0o7.f95803OooOoO0 = note5;
                c27434o000oo0o7.f95802OooOoO = list7;
                c27434o000oo0o7.f95804OooOoOO = str27;
                c27434o000oo0o7.f95806OooOoo0 = list36;
                c27434o000oo0o7.f95805OooOoo = map24;
                c27434o000oo0o7.f95807OooOooO = list71;
                c27434o000oo0o7.f95808OooOooo = map22;
                c27434o000oo0o7.f95811Oooo000 = it17;
                c27434o000oo0o7.f95812Oooo00O = list73;
                c27434o000oo0o7.f95813Oooo00o = list72;
                c27434o000oo0o7.f95810Oooo0 = list69;
                List list1962 = list71;
                c27434o000oo0o7.f95814Oooo0O0 = list1952;
                c27434o000oo0o7.f95822OoooO00 = i682;
                c27434o000oo0o7.f95821OoooO0 = i26 == true ? 1 : 0 ? 1 : 0;
                c27434o000oo0o7.f95824OoooOO0 = 21;
                enumC32485OooO00o25 = enumC32485OooO00o17;
                if (c26264OooOOO0.OooO0O0(arrayList2, str27, false, c27434o000oo0o7) != enumC32485OooO00o25) {
                }
                return enumC32485OooO00o25;
            case 21:
                int i89 = c27434o000oo0o.f95821OoooO0;
                i29 = c27434o000oo0o.f95822OoooO00;
                List list267 = (List) c27434o000oo0o.f95814Oooo0O0;
                List list268 = (List) c27434o000oo0o.f95810Oooo0;
                List list269 = (List) c27434o000oo0o.f95813Oooo00o;
                List list270 = (List) c27434o000oo0o.f95812Oooo00O;
                Iterator it69 = c27434o000oo0o.f95811Oooo000;
                Map map74 = (Map) c27434o000oo0o.f95808OooOooo;
                List list271 = (List) c27434o000oo0o.f95807OooOooO;
                Map map75 = (Map) c27434o000oo0o.f95805OooOoo;
                List list272 = (List) c27434o000oo0o.f95806OooOoo0;
                String str115 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list273 = (List) c27434o000oo0o.f95802OooOoO;
                Note note30 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str116 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO18 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                enumC32485OooO00o18 = enumC32485OooO00o32;
                list74 = list267;
                list75 = list271;
                map24 = map75;
                i26 = i89;
                note5 = note30;
                c27434o000oo0o7 = c27434o000oo0o;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                map22 = map74;
                str17 = str116;
                list36 = list272;
                list76 = list269;
                str6 = "toString(...)";
                list7 = list273;
                it17 = it69;
                list77 = list270;
                list69 = list268;
                str27 = str115;
                int i692 = i29;
                ArrayList arrayList322 = new ArrayList();
                while (r21.hasNext()) {
                }
                list78 = list74;
                C27994OooOOOO c27994OooOOOO42 = c27449o00O0OoO18.f96058OooOoO;
                c27434o000oo0o7.f95801OooOo0o = c27449o00O0OoO18;
                c27434o000oo0o7.f95800OooOo = str17;
                c27434o000oo0o7.f95803OooOoO0 = note5;
                c27434o000oo0o7.f95802OooOoO = list7;
                c27434o000oo0o7.f95804OooOoOO = str27;
                c27434o000oo0o7.f95806OooOoo0 = list36;
                c27434o000oo0o7.f95805OooOoo = map24;
                c27434o000oo0o7.f95807OooOooO = list75;
                c27434o000oo0o7.f95808OooOooo = map22;
                c27434o000oo0o7.f95811Oooo000 = it17;
                c27434o000oo0o7.f95812Oooo00O = list77;
                c27434o000oo0o7.f95813Oooo00o = list76;
                c27434o000oo0o7.f95810Oooo0 = list69;
                List list1992 = list75;
                c27434o000oo0o7.f95814Oooo0O0 = list78;
                c27434o000oo0o7.f95822OoooO00 = i692;
                c27434o000oo0o7.f95821OoooO0 = i26 == true ? 1 : 0;
                c27434o000oo0o7.f95824OoooOO0 = 22;
                C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
                C27449o00O0OoO c27449o00O0OoO452 = c27449o00O0OoO18;
                Map map522 = map24;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27982OooO0O0(c27994OooOOOO42, arrayList322, str27, null), c27434o000oo0o7);
                if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                }
                enumC32485OooO00o24 = enumC32485OooO00o18;
                if (objOooO0o != enumC32485OooO00o24) {
                }
                break;
            case 22:
                int i90 = c27434o000oo0o.f95821OoooO0;
                i30 = c27434o000oo0o.f95822OoooO00;
                List list274 = (List) c27434o000oo0o.f95814Oooo0O0;
                List list275 = (List) c27434o000oo0o.f95810Oooo0;
                List list276 = (List) c27434o000oo0o.f95813Oooo00o;
                List list277 = (List) c27434o000oo0o.f95812Oooo00O;
                Iterator it70 = c27434o000oo0o.f95811Oooo000;
                Map map76 = (Map) c27434o000oo0o.f95808OooOooo;
                List list278 = (List) c27434o000oo0o.f95807OooOooO;
                Map map77 = (Map) c27434o000oo0o.f95805OooOoo;
                List list279 = (List) c27434o000oo0o.f95806OooOoo0;
                String str117 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list280 = (List) c27434o000oo0o.f95802OooOoO;
                Note note31 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str118 = (String) c27434o000oo0o.f95800OooOo;
                C27449o00O0OoO c27449o00O0OoO54 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                C27434o000oo0o c27434o000oo0o13 = c27434o000oo0o;
                list36 = list279;
                list78 = list274;
                c27434o000oo0o7 = c27434o000oo0o13;
                c27449o00O0OoO19 = c27449o00O0OoO54;
                enumC32485OooO00o19 = enumC32485OooO00o32;
                list79 = list278;
                map25 = map77;
                i31 = i90;
                note5 = note31;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                map22 = map76;
                str17 = str118;
                list80 = list276;
                str6 = "toString(...)";
                list7 = list280;
                it17 = it70;
                list81 = list277;
                list69 = list275;
                str27 = str117;
                int i702 = i31;
                ArrayList arrayList332 = new ArrayList();
                while (r20.hasNext()) {
                }
                int i722 = i30;
                InterfaceC27301OooOOo interfaceC27301OooOOo22 = c27449o00O0OoO19.f96054OooOo0;
                c27434o000oo0o7.f95801OooOo0o = c27449o00O0OoO19;
                c27434o000oo0o7.f95800OooOo = str17;
                c27434o000oo0o7.f95803OooOoO0 = note5;
                c27434o000oo0o7.f95802OooOoO = list7;
                c27434o000oo0o7.f95804OooOoOO = str27;
                c27434o000oo0o7.f95806OooOoo0 = list36;
                c27434o000oo0o7.f95805OooOoo = map25;
                c27434o000oo0o7.f95807OooOooO = list79;
                c27434o000oo0o7.f95808OooOooo = map22;
                c27434o000oo0o7.f95811Oooo000 = it17;
                c27434o000oo0o7.f95812Oooo00O = list81;
                c27434o000oo0o7.f95813Oooo00o = list80;
                c27434o000oo0o7.f95810Oooo0 = list69;
                C27449o00O0OoO c27449o00O0OoO462 = c27449o00O0OoO19;
                c27434o000oo0o7.f95814Oooo0O0 = null;
                c27434o000oo0o7.f95822OoooO00 = i722;
                c27434o000oo0o7.f95821OoooO0 = i702 == true ? 1 : 0;
                c27434o000oo0o7.f95824OoooOO0 = 23;
                objOooO0O0 = interfaceC27301OooOOo22.OooO0O0(str27, arrayList332, c27434o000oo0o7);
                enumC32485OooO00o23 = enumC32485OooO00o19;
                if (objOooO0O0 != enumC32485OooO00o23) {
                }
                break;
            case 23:
                int i91 = c27434o000oo0o.f95821OoooO0;
                i32 = c27434o000oo0o.f95822OoooO00;
                list82 = (List) c27434o000oo0o.f95810Oooo0;
                List list281 = (List) c27434o000oo0o.f95813Oooo00o;
                List list282 = (List) c27434o000oo0o.f95812Oooo00O;
                it18 = c27434o000oo0o.f95811Oooo000;
                Map map78 = (Map) c27434o000oo0o.f95808OooOooo;
                List list283 = (List) c27434o000oo0o.f95807OooOooO;
                Map map79 = (Map) c27434o000oo0o.f95805OooOoo;
                List list284 = (List) c27434o000oo0o.f95806OooOoo0;
                String str119 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list285 = (List) c27434o000oo0o.f95802OooOoO;
                Note note32 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str120 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO20 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                i33 = i91;
                str33 = str119;
                enumC32485OooO00o20 = enumC32485OooO00o32;
                list83 = list281;
                str6 = "toString(...)";
                list84 = list283;
                list85 = list284;
                str17 = str120;
                note5 = note32;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                map26 = map79;
                map22 = map78;
                list86 = list282;
                list7 = list285;
                C26620o00Oo00o c26620o00Oo00o32 = c27449o00O0OoO20.f96043OooOO0;
                c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO20;
                c27434o000oo0o.f95800OooOo = str17;
                c27434o000oo0o.f95803OooOoO0 = note5;
                c27434o000oo0o.f95802OooOoO = list7;
                c27434o000oo0o.f95804OooOoOO = str33;
                c27434o000oo0o.f95806OooOoo0 = list85;
                c27434o000oo0o.f95805OooOoo = map26;
                c27434o000oo0o.f95807OooOooO = list84;
                c27434o000oo0o.f95808OooOooo = map22;
                c27434o000oo0o.f95811Oooo000 = it18;
                c27434o000oo0o.f95812Oooo00O = list86;
                c27434o000oo0o.f95813Oooo00o = list82;
                C27449o00O0OoO c27449o00O0OoO472 = c27449o00O0OoO20;
                c27434o000oo0o.f95810Oooo0 = null;
                c27434o000oo0o.f95822OoooO00 = i32;
                c27434o000oo0o.f95821OoooO0 = i33 == true ? 1 : 0;
                c27434o000oo0o.f95824OoooOO0 = 24;
                objOooO00o2 = c26620o00Oo00o32.OooO00o(str33, list83, c27434o000oo0o);
                enumC32485OooO00o22 = enumC32485OooO00o20;
                if (objOooO00o2 != enumC32485OooO00o22) {
                }
                return enumC32485OooO00o22;
            case 24:
                int i92 = c27434o000oo0o.f95821OoooO0;
                i32 = c27434o000oo0o.f95822OoooO00;
                list82 = (List) c27434o000oo0o.f95813Oooo00o;
                List list286 = (List) c27434o000oo0o.f95812Oooo00O;
                Iterator it71 = c27434o000oo0o.f95811Oooo000;
                Map map80 = (Map) c27434o000oo0o.f95808OooOooo;
                List list287 = (List) c27434o000oo0o.f95807OooOooO;
                Map map81 = (Map) c27434o000oo0o.f95805OooOoo;
                List list288 = (List) c27434o000oo0o.f95806OooOoo0;
                String str121 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list289 = (List) c27434o000oo0o.f95802OooOoO;
                Note note33 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str122 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO21 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                i33 = i92;
                enumC32485OooO00o21 = enumC32485OooO00o32;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                list87 = list287;
                str6 = "toString(...)";
                map26 = map81;
                list85 = list288;
                str33 = str121;
                note5 = note33;
                str17 = str122;
                list88 = list286;
                map22 = map80;
                it18 = it71;
                list7 = list289;
                o0OO00o0.OooOo00 oooOo0022 = c27449o00O0OoO21.f96045OooOO0o;
                c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO21;
                c27434o000oo0o.f95800OooOo = str17;
                c27434o000oo0o.f95803OooOoO0 = note5;
                c27434o000oo0o.f95802OooOoO = list7;
                c27434o000oo0o.f95804OooOoOO = str33;
                c27434o000oo0o.f95806OooOoo0 = list85;
                c27434o000oo0o.f95805OooOoo = map26;
                c27434o000oo0o.f95807OooOooO = list87;
                c27434o000oo0o.f95808OooOooo = map22;
                c27434o000oo0o.f95811Oooo000 = it18;
                c27434o000oo0o.f95812Oooo00O = list82;
                C27449o00O0OoO c27449o00O0OoO482 = c27449o00O0OoO21;
                c27434o000oo0o.f95813Oooo00o = null;
                c27434o000oo0o.f95822OoooO00 = i32;
                c27434o000oo0o.f95821OoooO0 = i33 == true ? 1 : 0;
                c27434o000oo0o.f95824OoooOO0 = 25;
                objOooO00o = oooOo0022.OooO00o(str33, list88, c27434o000oo0o);
                enumC32485OooO00o22 = enumC32485OooO00o21;
                if (objOooO00o != enumC32485OooO00o22) {
                }
                return enumC32485OooO00o22;
            case 25:
                int i93 = c27434o000oo0o.f95821OoooO0;
                i32 = c27434o000oo0o.f95822OoooO00;
                list82 = (List) c27434o000oo0o.f95812Oooo00O;
                Iterator it72 = c27434o000oo0o.f95811Oooo000;
                Map map82 = (Map) c27434o000oo0o.f95808OooOooo;
                List list290 = (List) c27434o000oo0o.f95807OooOooO;
                map27 = (Map) c27434o000oo0o.f95805OooOoo;
                List list291 = (List) c27434o000oo0o.f95806OooOoo0;
                String str123 = (String) c27434o000oo0o.f95804OooOoOO;
                List<String> list292 = (List) c27434o000oo0o.f95802OooOoO;
                Note note34 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str124 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO22 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                i33 = i93;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                str6 = "toString(...)";
                list85 = list291;
                str33 = str123;
                str17 = str124;
                map22 = map82;
                list89 = list290;
                it18 = it72;
                enumC32485OooO00o22 = enumC32485OooO00o32;
                list90 = list292;
                note5 = note34;
                c27994OooOOOO = c27449o00O0OoO22.f96058OooOoO;
                c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO22;
                c27434o000oo0o.f95800OooOo = str17;
                c27434o000oo0o.f95803OooOoO0 = note5;
                c27434o000oo0o.f95802OooOoO = list90;
                c27434o000oo0o.f95804OooOoOO = str33;
                c27434o000oo0o.f95806OooOoo0 = list85;
                c27434o000oo0o.f95805OooOoo = map27;
                c27434o000oo0o.f95807OooOooO = list89;
                c27434o000oo0o.f95808OooOooo = map22;
                c27434o000oo0o.f95811Oooo000 = it18;
                C27449o00O0OoO c27449o00O0OoO492 = c27449o00O0OoO22;
                c27434o000oo0o.f95812Oooo00O = null;
                c27434o000oo0o.f95822OoooO00 = i32;
                c27434o000oo0o.f95821OoooO0 = i33 == true ? 1 : 0;
                c27434o000oo0o.f95824OoooOO0 = 26;
                if (c27994OooOOOO.OooO0Oo(str33, list82, c27434o000oo0o) != enumC32485OooO00o22) {
                }
                return enumC32485OooO00o22;
            case 26:
                int i94 = c27434o000oo0o.f95821OoooO0;
                i32 = c27434o000oo0o.f95822OoooO00;
                it5 = c27434o000oo0o.f95811Oooo000;
                Map map83 = (Map) c27434o000oo0o.f95808OooOooo;
                List list293 = (List) c27434o000oo0o.f95807OooOooO;
                map28 = (Map) c27434o000oo0o.f95805OooOoo;
                List list294 = (List) c27434o000oo0o.f95806OooOoo0;
                String str125 = (String) c27434o000oo0o.f95804OooOoOO;
                list91 = (List) c27434o000oo0o.f95802OooOoO;
                note8 = (Note) c27434o000oo0o.f95803OooOoO0;
                String str126 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO23 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                i33 = i94;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                str6 = "toString(...)";
                list85 = list294;
                str33 = str125;
                str17 = str126;
                map22 = map83;
                enumC32485OooO00o22 = enumC32485OooO00o32;
                list102 = list293;
                str18 = str33;
                i9 = i32;
                list19 = list85;
                c27434o000oo0o2 = c27434o000oo0o;
                c27449o00O0OoO6 = c27449o00O0OoO23;
                r12 = i33;
                list101 = list102;
                list7 = list91;
                note5 = note8;
                enumC32485OooO00o2 = enumC32485OooO00o22;
                map5 = map22;
                linkedHashMap = map28;
                list20 = list101;
                r1 = r12;
                if (!it5.hasNext()) {
                }
                break;
            case 27:
                int i95 = c27434o000oo0o.f95822OoooO00;
                List list295 = (List) c27434o000oo0o.f95808OooOooo;
                List list296 = (List) c27434o000oo0o.f95807OooOooO;
                List list297 = (List) c27434o000oo0o.f95805OooOoo;
                Map map84 = (Map) c27434o000oo0o.f95806OooOoo0;
                list100 = (List) c27434o000oo0o.f95804OooOoOO;
                str37 = (String) c27434o000oo0o.f95802OooOoO;
                note9 = (Note) c27434o000oo0o.f95803OooOoO0;
                str17 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO25 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                i9 = i95;
                enumC32485OooO00o29 = enumC32485OooO00o32;
                str5 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                map29 = map84;
                list99 = list297;
                list97 = list296;
                list98 = list295;
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(str17, str37)) {
                }
                break;
            case 28:
                int i96 = c27434o000oo0o.f95822OoooO00;
                List list298 = (List) c27434o000oo0o.f95808OooOooo;
                list98 = (List) c27434o000oo0o.f95807OooOooO;
                list97 = (List) c27434o000oo0o.f95805OooOoo;
                List list299 = (List) c27434o000oo0o.f95806OooOoo0;
                map29 = (Map) c27434o000oo0o.f95804OooOoOO;
                list100 = (List) c27434o000oo0o.f95802OooOoO;
                str37 = (String) c27434o000oo0o.f95803OooOoO0;
                note9 = (Note) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO26 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                i9 = i96;
                enumC32485OooO00o29 = enumC32485OooO00o32;
                list104 = list298;
                list103 = list299;
                list105 = list100;
                c27449o00O0OoO27 = c27449o00O0OoO26;
                list112 = list104;
                list111 = list103;
                ArrayList arrayListOooooOO22 = oOo000Oo.OooOo.OooooOO(list98, list112);
                ArrayList arrayList1222 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO22, 10));
                it32 = arrayListOooooOO22.iterator();
                while (it32.hasNext()) {
                }
                ArrayList arrayList1322 = new ArrayList();
                while (r6.hasNext()) {
                }
                ArrayList arrayList1422 = new ArrayList(C34428OooOOo.OooOOoo(arrayList1322, 10));
                it33 = arrayList1322.iterator();
                while (it33.hasNext()) {
                }
                ArrayList arrayListO0ooOoO22 = oOo000Oo.OooOo.o0ooOoO(note9.getPages());
                arrayListO0ooOoO22.addAll(i9, arrayList1422);
                ArrayList arrayList1522 = new ArrayList();
                while (r5.hasNext()) {
                }
                ArrayList arrayList1622 = new ArrayList();
                it34 = arrayList1522.iterator();
                while (it34.hasNext()) {
                }
                List listO0ooOO032 = oOo000Oo.OooOo.o0ooOO0(note9.getOutlines());
                c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO27;
                c27434o000oo0o.f95800OooOo = note9;
                c27434o000oo0o.f95803OooOoO0 = str37;
                c27434o000oo0o.f95802OooOoO = list105;
                c27434o000oo0o.f95804OooOoOO = arrayListO0ooOoO22;
                c27434o000oo0o.f95806OooOoo0 = null;
                c27434o000oo0o.f95805OooOoo = null;
                c27434o000oo0o.f95807OooOooO = null;
                c27434o000oo0o.f95808OooOooo = null;
                c27434o000oo0o.f95811Oooo000 = null;
                c27434o000oo0o.f95812Oooo00O = null;
                c27434o000oo0o.f95824OoooOO0 = 32;
                objOooo0 = c27449o00O0OoO27.Oooo0(arrayList1622, str37, listO0ooOO032, c27434o000oo0o);
                if (objOooo0 == enumC32485OooO00o29) {
                }
                break;
            case 29:
                int i97 = c27434o000oo0o.f95822OoooO00;
                list106 = (List) c27434o000oo0o.f95812Oooo00O;
                it31 = c27434o000oo0o.f95811Oooo000;
                collection7 = (Collection) c27434o000oo0o.f95808OooOooo;
                list107 = (List) c27434o000oo0o.f95807OooOooO;
                list108 = (List) c27434o000oo0o.f95805OooOoo;
                List list300 = (List) c27434o000oo0o.f95806OooOoo0;
                map30 = (Map) c27434o000oo0o.f95804OooOoOO;
                List list301 = (List) c27434o000oo0o.f95802OooOoO;
                str39 = (String) c27434o000oo0o.f95803OooOoO0;
                note10 = (Note) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO28 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                str40 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                list109 = list301;
                enumC32485OooO00o30 = enumC32485OooO00o32;
                c27434o000oo0o8 = c27434o000oo0o;
                i35 = i97;
                list118 = list300;
                duplicatedPdfResult = (DuplicatedPdfResult) objOooo0;
                if (duplicatedPdfResult == null) {
                }
                break;
            case 30:
                int i98 = c27434o000oo0o.f95822OoooO00;
                List list302 = (List) c27434o000oo0o.f95812Oooo00O;
                it31 = c27434o000oo0o.f95811Oooo000;
                collection7 = (Collection) c27434o000oo0o.f95808OooOooo;
                list107 = (List) c27434o000oo0o.f95807OooOooO;
                list108 = (List) c27434o000oo0o.f95805OooOoo;
                List list303 = (List) c27434o000oo0o.f95806OooOoo0;
                map30 = (Map) c27434o000oo0o.f95804OooOoOO;
                List list304 = (List) c27434o000oo0o.f95802OooOoO;
                str39 = (String) c27434o000oo0o.f95803OooOoO0;
                note10 = (Note) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO28 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                c27434o000oo0o8 = c27434o000oo0o;
                enumC32485OooO00o31 = enumC32485OooO00o32;
                list110 = list302;
                str41 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                list109 = list304;
                i37 = i98;
                list114 = list303;
                Iterator it482 = it31;
                list115 = list109;
                List list1392 = list108;
                it35 = it482;
                List list1402 = list114;
                collection8 = collection7;
                map31 = map30;
                list116 = list107;
                note11 = note10;
                List list1412 = list1402;
                c27020OooOoO0 = c27449o00O0OoO28.f96039OooO0o;
                c27434o000oo0o8.f95801OooOo0o = c27449o00O0OoO28;
                c27434o000oo0o8.f95800OooOo = note11;
                c27434o000oo0o8.f95803OooOoO0 = str39;
                c27434o000oo0o8.f95802OooOoO = list115;
                c27434o000oo0o8.f95804OooOoOO = map31;
                c27434o000oo0o8.f95806OooOoo0 = list1412;
                c27434o000oo0o8.f95805OooOoo = list1392;
                c27434o000oo0o8.f95807OooOooO = list116;
                c27434o000oo0o8.f95808OooOooo = collection8;
                c27434o000oo0o8.f95811Oooo000 = it35;
                c27434o000oo0o8.f95812Oooo00O = list110;
                c27434o000oo0o8.f95822OoooO00 = i37;
                c27434o000oo0o8.f95824OoooOO0 = 31;
                if (c27020OooOoO0.OooO00o(str39, list110, c27434o000oo0o8) != enumC32485OooO00o31) {
                }
                return enumC32485OooO00o31;
            case 31:
                int i99 = c27434o000oo0o.f95822OoooO00;
                List list305 = (List) c27434o000oo0o.f95812Oooo00O;
                it35 = c27434o000oo0o.f95811Oooo000;
                collection8 = (Collection) c27434o000oo0o.f95808OooOooo;
                list116 = (List) c27434o000oo0o.f95807OooOooO;
                list117 = (List) c27434o000oo0o.f95805OooOoo;
                List list306 = (List) c27434o000oo0o.f95806OooOoo0;
                map31 = (Map) c27434o000oo0o.f95804OooOoOO;
                list115 = (List) c27434o000oo0o.f95802OooOoO;
                str43 = (String) c27434o000oo0o.f95803OooOoO0;
                note11 = (Note) c27434o000oo0o.f95800OooOo;
                C27449o00O0OoO c27449o00O0OoO55 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                c27434o000oo0o8 = c27434o000oo0o;
                enumC32485OooO00o31 = enumC32485OooO00o32;
                list123 = list305;
                str41 = "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme";
                c27449o00O0OoO29 = c27449o00O0OoO55;
                i38 = i99;
                list122 = list306;
                arrayList5 = collection8;
                str37 = str43;
                i39 = i38;
                list120 = list123;
                map29 = map31;
                list97 = list117;
                c27449o00O0OoO25 = c27449o00O0OoO29;
                it30 = it35;
                list100 = list115;
                list98 = list116;
                note9 = note11;
                list119 = list122;
                if (list120 != null) {
                }
                enumC32485OooO00o29 = enumC32485OooO00o31;
                str38 = str41;
                i35 = i39;
                list121 = list119;
                if (!it30.hasNext()) {
                }
                break;
            case 32:
                List list307 = (List) c27434o000oo0o.f95804OooOoOO;
                List list308 = (List) c27434o000oo0o.f95802OooOoO;
                str42 = (String) c27434o000oo0o.f95803OooOoO0;
                Note note35 = (Note) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO27 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                list105 = list308;
                note9 = note35;
                list113 = list307;
                enumC32485OooO00o29 = enumC32485OooO00o32;
                List list1322 = (List) objOooo0;
                InterfaceC27309OooOoO interfaceC27309OooOoO2 = c27449o00O0OoO27.f96035OooO00o;
                c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO27;
                c27434o000oo0o.f95800OooOo = note9;
                c27434o000oo0o.f95803OooOoO0 = str42;
                c27434o000oo0o.f95802OooOoO = list105;
                c27434o000oo0o.f95804OooOoOO = list113;
                c27434o000oo0o.f95806OooOoo0 = list1322;
                c27434o000oo0o.f95824OoooOO0 = 33;
                objOooOO0o = interfaceC27309OooOoO2.OooOO0o(str42, c27434o000oo0o);
                if (objOooOO0o != enumC32485OooO00o29) {
                }
                break;
            case 33:
                List list309 = (List) c27434o000oo0o.f95806OooOoo0;
                List list310 = (List) c27434o000oo0o.f95804OooOoOO;
                List list311 = (List) c27434o000oo0o.f95802OooOoO;
                String str127 = (String) c27434o000oo0o.f95803OooOoO0;
                Note note36 = (Note) c27434o000oo0o.f95800OooOo;
                C27449o00O0OoO c27449o00O0OoO56 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                list124 = list309;
                enumC32485OooO00o29 = enumC32485OooO00o32;
                list125 = list310;
                list105 = list311;
                str42 = str127;
                note12 = note36;
                c27449o00O0OoO30 = c27449o00O0OoO56;
                if (objOooo0 != null) {
                }
                break;
            case 34:
                NoteContent noteContent = (NoteContent) c27434o000oo0o.f95803OooOoO0;
                List list312 = (List) c27434o000oo0o.f95800OooOo;
                C27449o00O0OoO c27449o00O0OoO57 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                noteContentOooO00o = noteContent;
                enumC32485OooO00o29 = enumC32485OooO00o32;
                list126 = list312;
                c27449o00O0OoO30 = c27449o00O0OoO57;
                c27449o00O0OoO32 = null;
                id = noteContentOooO00o.getId();
                size = list126.size();
                c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO30;
                c27434o000oo0o.f95800OooOo = noteContentOooO00o;
                c27434o000oo0o.f95803OooOoO0 = c27449o00O0OoO32;
                c27434o000oo0o.f95824OoooOO0 = 35;
                if (c27449o00O0OoO30.Ooooo00(size, id, c27434o000oo0o) == enumC32485OooO00o29) {
                }
                id2 = noteContentOooO00o.getId();
                c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO32;
                c27434o000oo0o.f95800OooOo = c27449o00O0OoO32;
                c27434o000oo0o.f95824OoooOO0 = 36;
                if (OoooOoo(c27449o00O0OoO30, id2, c27434o000oo0o) == enumC32485OooO00o29) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 35:
                NoteContent noteContent2 = (NoteContent) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO30 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                noteContentOooO00o = noteContent2;
                enumC32485OooO00o29 = enumC32485OooO00o32;
                c27449o00O0OoO32 = null;
                id2 = noteContentOooO00o.getId();
                c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO32;
                c27434o000oo0o.f95800OooOo = c27449o00O0OoO32;
                c27434o000oo0o.f95824OoooOO0 = 36;
                if (OoooOoo(c27449o00O0OoO30, id2, c27434o000oo0o) == enumC32485OooO00o29) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 36:
                C32446OooOOOo.OooO0O0(objOooo0);
                return C32460OooOooO.f116667OooO00o;
            case 37:
                String str128 = (String) c27434o000oo0o.f95800OooOo;
                c27449o00O0OoO30 = c27434o000oo0o.f95801OooOo0o;
                C32446OooOOOo.OooO0O0(objOooo0);
                str42 = str128;
                enumC32485OooO00o29 = enumC32485OooO00o32;
                c27449o00O0OoO31 = null;
                c27434o000oo0o.f95801OooOo0o = c27449o00O0OoO31;
                c27434o000oo0o.f95800OooOo = c27449o00O0OoO31;
                c27434o000oo0o.f95824OoooOO0 = 38;
                if (OoooOoo(c27449o00O0OoO30, str42, c27434o000oo0o) == enumC32485OooO00o29) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 38:
                C32446OooOOOo.OooO0O0(objOooo0);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object OooO0oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27437o000ooOO(this, str, null), abstractC32479OooO0OO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        if (r11.OooOOO0((com.orion.notein.domain.models.note.NoteMeta) r12, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(Note note, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27440o000oooO c27440o000oooO;
        String strOooO0Oo;
        Note note2;
        C27449o00O0OoO c27449o00O0OoO;
        if (abstractC32479OooO0OO instanceof C27440o000oooO) {
            c27440o000oooO = (C27440o000oooO) abstractC32479OooO0OO;
            int i = c27440o000oooO.f95859OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27440o000oooO.f95859OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27440o000oooO = new C27440o000oooO(this, abstractC32479OooO0OO);
            }
        }
        Object objO000oOoO = c27440o000oooO.f95856OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27440o000oooO.f95859OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objO000oOoO);
            strOooO0Oo = this.f96037OooO0OO.OooO0Oo();
            NoteContent noteContentOooO00o = o0oOO.OooO00o(note);
            noteContentOooO00o.setUnboundedNote(note.getUnboundedNote());
            noteContentOooO00o.getExtras().putString(NoteContent.EXTRA_APP_VERSION_CODE_STRING, "394");
            c27440o000oooO.f95855OooOo0o = this;
            c27440o000oooO.f95854OooOo = note;
            c27440o000oooO.f95857OooOoO0 = strOooO0Oo;
            c27440o000oooO.f95859OooOoo0 = 1;
            if (this.f96035OooO00o.OooO0Oo(noteContentOooO00o, c27440o000oooO) != enumC32485OooO00o) {
                note2 = note;
                c27449o00O0OoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            String str = c27440o000oooO.f95857OooOoO0;
            note2 = c27440o000oooO.f95854OooOo;
            C27449o00O0OoO c27449o00O0OoO2 = c27440o000oooO.f95855OooOo0o;
            C32446OooOOOo.OooO0O0(objO000oOoO);
            strOooO0Oo = str;
            c27449o00O0OoO = c27449o00O0OoO2;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objO000oOoO);
                return C32460OooOooO.f116667OooO00o;
            }
            c27449o00O0OoO = c27440o000oooO.f95855OooOo0o;
            C32446OooOOOo.OooO0O0(objO000oOoO);
            InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c27449o00O0OoO.f96036OooO0O0;
            c27440o000oooO.f95855OooOo0o = null;
            c27440o000oooO.f95859OooOoo0 = 3;
        }
        c27440o000oooO.f95855OooOo0o = c27449o00O0OoO;
        c27440o000oooO.f95854OooOo = null;
        c27440o000oooO.f95857OooOoO0 = null;
        c27440o000oooO.f95859OooOoo0 = 2;
        objO000oOoO = c27449o00O0OoO.o000oOoO(note2, strOooO0Oo, c27440o000oooO);
        if (objO000oOoO != enumC32485OooO00o) {
            InterfaceC27313OooOoo0 interfaceC27313OooOoo02 = c27449o00O0OoO.f96036OooO0O0;
            c27440o000oooO.f95855OooOo0o = null;
            c27440o000oooO.f95859OooOoo0 = 3;
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r7.OoooOo0(r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(String str, ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00 o00Var;
        C27449o00O0OoO c27449o00O0OoO;
        if (abstractC32479OooO0OO instanceof o00) {
            o00Var = (o00) abstractC32479OooO0OO;
            int i = o00Var.f95324OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00Var.f95324OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o00Var = new o00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o00Var.f95323OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00Var.f95324OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00Var.f95321OooOo0o = this;
            o00Var.f95320OooOo = str;
            o00Var.f95324OooOoOO = 1;
            if (this.f96039OooO0o.OooO00o(str, arrayList, o00Var) != enumC32485OooO00o) {
                c27449o00O0OoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        str = o00Var.f95320OooOo;
        c27449o00O0OoO = o00Var.f95321OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        o00Var.f95321OooOo0o = null;
        o00Var.f95320OooOo = null;
        o00Var.f95324OooOoOO = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r7.OoooOo0(r8, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0o(Image image, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00O000 o00o0002;
        C27449o00O0OoO c27449o00O0OoO;
        if (abstractC32479OooO0OO instanceof o00O000) {
            o00o0002 = (o00O000) abstractC32479OooO0OO;
            int i = o00o0002.f95881OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o0002.f95881OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o00o0002 = new o00O000(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o00o0002.f95880OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00o0002.f95881OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00o0002.f95878OooOo0o = this;
            o00o0002.f95877OooOo = str;
            o00o0002.f95881OooOoOO = 1;
            C26596o00O0o0 c26596o00O0o0 = this.f96047OooOOO0;
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(image.getId());
            C26588o00O00oO c26588o00O00oO = c26596o00O0o0.f91720OooO00o;
            c26588o00O00oO.getClass();
            Object objOooO00o = c26588o00O00oO.OooO00o(str, new o0OO00o0.o0O0ooO(listOooO0oO, null));
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                c27449o00O0OoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        str = o00o0002.f95877OooOo;
        c27449o00O0OoO = o00o0002.f95878OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        o00o0002.f95878OooOo0o = null;
        o00o0002.f95877OooOo = null;
        o00o0002.f95881OooOoOO = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x018c, code lost:
    
        if (r10.OooO0oO(r9, r8, r0) != r1) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9 A[PHI: r2 r8 r9
      0x00d9: PHI (r2v6 o0OOo0o.o00O0OoO) = (r2v4 o0OOo0o.o00O0OoO), (r2v7 o0OOo0o.o00O0OoO) binds: [B:36:0x00d5, B:18:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r8v6 java.lang.String) = (r8v4 java.lang.String), (r8v7 java.lang.String) binds: [B:36:0x00d5, B:18:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r9v6 java.lang.String) = (r9v4 java.lang.String), (r9v7 java.lang.String) binds: [B:36:0x00d5, B:18:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102 A[PHI: r2 r8 r9
      0x0102: PHI (r2v8 o0OOo0o.o00O0OoO) = (r2v6 o0OOo0o.o00O0OoO), (r2v9 o0OOo0o.o00O0OoO) binds: [B:45:0x00fe, B:17:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0102: PHI (r8v8 java.lang.String) = (r8v6 java.lang.String), (r8v9 java.lang.String) binds: [B:45:0x00fe, B:17:0x005b] A[DONT_GENERATE, DONT_INLINE]
      0x0102: PHI (r9v8 java.lang.String) = (r9v6 java.lang.String), (r9v9 java.lang.String) binds: [B:45:0x00fe, B:17:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123 A[PHI: r2 r8 r9
      0x0123: PHI (r2v10 o0OOo0o.o00O0OoO) = (r2v8 o0OOo0o.o00O0OoO), (r2v11 o0OOo0o.o00O0OoO) binds: [B:51:0x011f, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r8v10 java.lang.String) = (r8v8 java.lang.String), (r8v11 java.lang.String) binds: [B:51:0x011f, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r9v10 java.lang.String) = (r9v8 java.lang.String), (r9v11 java.lang.String) binds: [B:51:0x011f, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149 A[PHI: r2 r8 r9
      0x0149: PHI (r2v12 o0OOo0o.o00O0OoO) = (r2v10 o0OOo0o.o00O0OoO), (r2v13 o0OOo0o.o00O0OoO) binds: [B:60:0x0146, B:15:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r8v12 java.lang.String) = (r8v10 java.lang.String), (r8v13 java.lang.String) binds: [B:60:0x0146, B:15:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r9v12 java.lang.String) = (r9v10 java.lang.String), (r9v13 java.lang.String) binds: [B:60:0x0146, B:15:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0169 A[PHI: r2 r8 r9
      0x0169: PHI (r2v14 o0OOo0o.o00O0OoO) = (r2v12 o0OOo0o.o00O0OoO), (r2v15 o0OOo0o.o00O0OoO) binds: [B:66:0x0166, B:14:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r8v14 java.lang.String) = (r8v12 java.lang.String), (r8v15 java.lang.String) binds: [B:66:0x0166, B:14:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0169: PHI (r9v14 java.lang.String) = (r9v12 java.lang.String), (r9v15 java.lang.String) binds: [B:66:0x0166, B:14:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017c A[PHI: r2 r8 r9
      0x017c: PHI (r2v16 o0OOo0o.o00O0OoO) = (r2v14 o0OOo0o.o00O0OoO), (r2v18 o0OOo0o.o00O0OoO) binds: [B:69:0x0179, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x017c: PHI (r8v16 java.lang.String) = (r8v14 java.lang.String), (r8v18 java.lang.String) binds: [B:69:0x0179, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x017c: PHI (r9v16 java.lang.String) = (r9v14 java.lang.String), (r9v17 java.lang.String) binds: [B:69:0x0179, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        oOO00O ooo00o;
        C27449o00O0OoO c27449o00O0OoO;
        C26596o00O0o0 c26596o00O0o0;
        String str3;
        String str4;
        Object objOooO00o;
        Object objOooO0O0;
        Object objOooO0o;
        Object objOooO00o2;
        Object objOooO0o2;
        C26515OooooO0 c26515OooooO0;
        if (abstractC32479OooO0OO instanceof oOO00O) {
            ooo00o = (oOO00O) abstractC32479OooO0OO;
            int i = ooo00o.f97007OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ooo00o.f97007OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                ooo00o = new oOO00O(this, abstractC32479OooO0OO);
            }
        }
        Object obj = ooo00o.f97004OooOoO;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        switch (ooo00o.f97007OooOoo0) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                ooo00o.f97003OooOo0o = this;
                ooo00o.f97002OooOo = str;
                ooo00o.f97005OooOoO0 = str2;
                ooo00o.f97007OooOoo0 = 1;
                if (this.f96034OooO.OooO0o0(str, str2, ooo00o) != obj2) {
                    c27449o00O0OoO = this;
                    c26596o00O0o0 = c27449o00O0OoO.f96047OooOOO0;
                    ooo00o.f97003OooOo0o = c27449o00O0OoO;
                    ooo00o.f97002OooOo = str;
                    ooo00o.f97005OooOoO0 = str2;
                    ooo00o.f97007OooOoo0 = 2;
                    if (c26596o00O0o0.OooO0o(str, str2, ooo00o) != obj2) {
                        String str5 = str2;
                        str3 = str;
                        str4 = str5;
                        C26649o00OoooO c26649o00OoooO = c27449o00O0OoO.f96051OooOOo0;
                        ooo00o.f97003OooOo0o = c27449o00O0OoO;
                        ooo00o.f97002OooOo = str3;
                        ooo00o.f97005OooOoO0 = str4;
                        ooo00o.f97007OooOoo0 = 3;
                        C26647o00OooOO c26647o00OooOO = c26649o00OoooO.f91973OooO00o;
                        c26647o00OooOO.getClass();
                        objOooO00o = c26647o00OooOO.OooO00o(str4, new C26643o00Ooo0O(str3, null));
                        if (objOooO00o != obj2) {
                            objOooO00o = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooO00o != obj2) {
                            objOooO00o = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooO00o != obj2) {
                            C26264OooOOO0 c26264OooOOO0 = c27449o00O0OoO.f96046OooOOO;
                            ooo00o.f97003OooOo0o = c27449o00O0OoO;
                            ooo00o.f97002OooOo = str3;
                            ooo00o.f97005OooOoO0 = str4;
                            ooo00o.f97007OooOoo0 = 4;
                            C26676o00o0o00 c26676o00o0o00 = (C26676o00o0o00) c26264OooOOO0.f89720OooO00o;
                            c26676o00o0o00.getClass();
                            objOooO0O0 = c26676o00o0o00.OooO0O0(str4, new C26670o00o0OOo(str3, null));
                            if (objOooO0O0 != obj2) {
                                objOooO0O0 = C32460OooOooO.f116667OooO00o;
                            }
                            if (objOooO0O0 != obj2) {
                                objOooO0O0 = C32460OooOooO.f116667OooO00o;
                            }
                            if (objOooO0O0 != obj2) {
                                o0OO00o0.OooOo00 oooOo00 = c27449o00O0OoO.f96045OooOO0o;
                                ooo00o.f97003OooOo0o = c27449o00O0OoO;
                                ooo00o.f97002OooOo = str3;
                                ooo00o.f97005OooOoO0 = str4;
                                ooo00o.f97007OooOoo0 = 5;
                                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OO00o0.OooOOO0(oooOo00, str3, str4, null), ooo00o);
                                if (objOooO0o != obj2) {
                                    objOooO0o = C32460OooOooO.f116667OooO00o;
                                }
                                if (objOooO0o != obj2) {
                                    C26620o00Oo00o c26620o00Oo00o = c27449o00O0OoO.f96043OooOO0;
                                    ooo00o.f97003OooOo0o = c27449o00O0OoO;
                                    ooo00o.f97002OooOo = str3;
                                    ooo00o.f97005OooOoO0 = str4;
                                    ooo00o.f97007OooOoo0 = 6;
                                    C26613o00OOOoO c26613o00OOOoO = c26620o00Oo00o.f91878OooO00o;
                                    c26613o00OOOoO.getClass();
                                    objOooO00o2 = c26613o00OOOoO.OooO00o(str4, new o0OO00o0.o00OOO0O(str3, null));
                                    if (objOooO00o2 != obj2) {
                                        objOooO00o2 = C32460OooOooO.f116667OooO00o;
                                    }
                                    if (objOooO00o2 != obj2) {
                                        objOooO00o2 = C32460OooOooO.f116667OooO00o;
                                    }
                                    if (objOooO00o2 != obj2) {
                                        C27994OooOOOO c27994OooOOOO = c27449o00O0OoO.f96058OooOoO;
                                        ooo00o.f97003OooOo0o = c27449o00O0OoO;
                                        ooo00o.f97002OooOo = str3;
                                        ooo00o.f97005OooOoO0 = str4;
                                        ooo00o.f97007OooOoo0 = 7;
                                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                                        objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27986OooO0o0(c27994OooOOOO, str3, str4, null), ooo00o);
                                        if (objOooO0o2 != obj2) {
                                            objOooO0o2 = C32460OooOooO.f116667OooO00o;
                                        }
                                        if (objOooO0o2 != obj2) {
                                            c26515OooooO0 = c27449o00O0OoO.f96052OooOOoo;
                                            ooo00o.f97003OooOo0o = c27449o00O0OoO;
                                            ooo00o.f97002OooOo = str3;
                                            ooo00o.f97005OooOoO0 = str4;
                                            ooo00o.f97007OooOoo0 = 8;
                                            if (c26515OooooO0.OooO0Oo(str3, str4, ooo00o) != obj2) {
                                                C26515OooooO0 c26515OooooO02 = c27449o00O0OoO.f96052OooOOoo;
                                                ooo00o.f97003OooOo0o = null;
                                                ooo00o.f97002OooOo = null;
                                                ooo00o.f97005OooOoO0 = null;
                                                ooo00o.f97007OooOoo0 = 9;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return obj2;
            case 1:
                str2 = ooo00o.f97005OooOoO0;
                str = ooo00o.f97002OooOo;
                c27449o00O0OoO = ooo00o.f97003OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c26596o00O0o0 = c27449o00O0OoO.f96047OooOOO0;
                ooo00o.f97003OooOo0o = c27449o00O0OoO;
                ooo00o.f97002OooOo = str;
                ooo00o.f97005OooOoO0 = str2;
                ooo00o.f97007OooOoo0 = 2;
                if (c26596o00O0o0.OooO0o(str, str2, ooo00o) != obj2) {
                }
                return obj2;
            case 2:
                str4 = ooo00o.f97005OooOoO0;
                str3 = ooo00o.f97002OooOo;
                c27449o00O0OoO = ooo00o.f97003OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C26649o00OoooO c26649o00OoooO2 = c27449o00O0OoO.f96051OooOOo0;
                ooo00o.f97003OooOo0o = c27449o00O0OoO;
                ooo00o.f97002OooOo = str3;
                ooo00o.f97005OooOoO0 = str4;
                ooo00o.f97007OooOoo0 = 3;
                C26647o00OooOO c26647o00OooOO2 = c26649o00OoooO2.f91973OooO00o;
                c26647o00OooOO2.getClass();
                objOooO00o = c26647o00OooOO2.OooO00o(str4, new C26643o00Ooo0O(str3, null));
                if (objOooO00o != obj2) {
                }
                if (objOooO00o != obj2) {
                }
                if (objOooO00o != obj2) {
                }
                return obj2;
            case 3:
                str4 = ooo00o.f97005OooOoO0;
                str3 = ooo00o.f97002OooOo;
                c27449o00O0OoO = ooo00o.f97003OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C26264OooOOO0 c26264OooOOO02 = c27449o00O0OoO.f96046OooOOO;
                ooo00o.f97003OooOo0o = c27449o00O0OoO;
                ooo00o.f97002OooOo = str3;
                ooo00o.f97005OooOoO0 = str4;
                ooo00o.f97007OooOoo0 = 4;
                C26676o00o0o00 c26676o00o0o002 = (C26676o00o0o00) c26264OooOOO02.f89720OooO00o;
                c26676o00o0o002.getClass();
                objOooO0O0 = c26676o00o0o002.OooO0O0(str4, new C26670o00o0OOo(str3, null));
                if (objOooO0O0 != obj2) {
                }
                if (objOooO0O0 != obj2) {
                }
                if (objOooO0O0 != obj2) {
                }
                return obj2;
            case 4:
                str4 = ooo00o.f97005OooOoO0;
                str3 = ooo00o.f97002OooOo;
                c27449o00O0OoO = ooo00o.f97003OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                o0OO00o0.OooOo00 oooOo002 = c27449o00O0OoO.f96045OooOO0o;
                ooo00o.f97003OooOo0o = c27449o00O0OoO;
                ooo00o.f97002OooOo = str3;
                ooo00o.f97005OooOoO0 = str4;
                ooo00o.f97007OooOoo0 = 5;
                C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OO00o0.OooOOO0(oooOo002, str3, str4, null), ooo00o);
                if (objOooO0o != obj2) {
                }
                if (objOooO0o != obj2) {
                }
                return obj2;
            case 5:
                str4 = ooo00o.f97005OooOoO0;
                str3 = ooo00o.f97002OooOo;
                c27449o00O0OoO = ooo00o.f97003OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C26620o00Oo00o c26620o00Oo00o2 = c27449o00O0OoO.f96043OooOO0;
                ooo00o.f97003OooOo0o = c27449o00O0OoO;
                ooo00o.f97002OooOo = str3;
                ooo00o.f97005OooOoO0 = str4;
                ooo00o.f97007OooOoo0 = 6;
                C26613o00OOOoO c26613o00OOOoO2 = c26620o00Oo00o2.f91878OooO00o;
                c26613o00OOOoO2.getClass();
                objOooO00o2 = c26613o00OOOoO2.OooO00o(str4, new o0OO00o0.o00OOO0O(str3, null));
                if (objOooO00o2 != obj2) {
                }
                if (objOooO00o2 != obj2) {
                }
                if (objOooO00o2 != obj2) {
                }
                return obj2;
            case 6:
                str4 = ooo00o.f97005OooOoO0;
                str3 = ooo00o.f97002OooOo;
                c27449o00O0OoO = ooo00o.f97003OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C27994OooOOOO c27994OooOOOO2 = c27449o00O0OoO.f96058OooOoO;
                ooo00o.f97003OooOo0o = c27449o00O0OoO;
                ooo00o.f97002OooOo = str3;
                ooo00o.f97005OooOoO0 = str4;
                ooo00o.f97007OooOoo0 = 7;
                C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27986OooO0o0(c27994OooOOOO2, str3, str4, null), ooo00o);
                if (objOooO0o2 != obj2) {
                }
                if (objOooO0o2 != obj2) {
                }
                return obj2;
            case 7:
                str4 = ooo00o.f97005OooOoO0;
                str3 = ooo00o.f97002OooOo;
                c27449o00O0OoO = ooo00o.f97003OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                c26515OooooO0 = c27449o00O0OoO.f96052OooOOoo;
                ooo00o.f97003OooOo0o = c27449o00O0OoO;
                ooo00o.f97002OooOo = str3;
                ooo00o.f97005OooOoO0 = str4;
                ooo00o.f97007OooOoo0 = 8;
                if (c26515OooooO0.OooO0Oo(str3, str4, ooo00o) != obj2) {
                }
                return obj2;
            case 8:
                str4 = ooo00o.f97005OooOoO0;
                str3 = ooo00o.f97002OooOo;
                c27449o00O0OoO = ooo00o.f97003OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C26515OooooO0 c26515OooooO022 = c27449o00O0OoO.f96052OooOOoo;
                ooo00o.f97003OooOo0o = null;
                ooo00o.f97002OooOo = null;
                ooo00o.f97005OooOoO0 = null;
                ooo00o.f97007OooOoo0 = 9;
                break;
            case 9:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0625, code lost:
    
        if (r5.OoooOo0(r0, r2) != r4) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x024c, code lost:
    
        if (r1 == r4) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02c1, code lost:
    
        if (r1 == r4) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0354, code lost:
    
        if (r1 == r4) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0619 A[PHI: r0 r2 r5 r13
      0x0619: PHI (r0v54 java.lang.String) = (r0v44 java.lang.String), (r0v57 java.lang.String) binds: [B:169:0x0616, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0619: PHI (r2v18 o0OOo0o.o00O00OO) = (r2v15 o0OOo0o.o00O00OO), (r2v2 o0OOo0o.o00O00OO) binds: [B:169:0x0616, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0619: PHI (r5v69 o0OOo0o.o00O0OoO) = (r5v61 o0OOo0o.o00O0OoO), (r5v70 o0OOo0o.o00O0OoO) binds: [B:169:0x0616, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0619: PHI (r13v28 o0OOo0o.o00O0OoO) = (r13v25 o0OOo0o.o00O0OoO), (r13v29 o0OOo0o.o00O0OoO) binds: [B:169:0x0616, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0361  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x05e1 -> B:156:0x055a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x01c9 -> B:33:0x01d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x024c -> B:55:0x0250). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x0354 -> B:92:0x0358). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOO(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00O00OO o00o00oo2;
        C27449o00O0OoO c27449o00O0OoO;
        String str2;
        Collection arrayList;
        Iterator it;
        C27449o00O0OoO c27449o00O0OoO2;
        String str3;
        List list2;
        C27449o00O0OoO c27449o00O0OoO3;
        Object objOooO0Oo;
        Collection collection;
        o00O00OO o00o00oo3;
        Iterator it2;
        List list3;
        Iterator it3;
        C27449o00O0OoO c27449o00O0OoO4;
        List list4;
        String str4;
        List list5;
        Collection collection2;
        Page page;
        List list6;
        List list7;
        List list8;
        String str5;
        List list9;
        C27449o00O0OoO c27449o00O0OoO5;
        boolean usingOwnPdf;
        List list10;
        String str6;
        C27449o00O0OoO c27449o00O0OoO6;
        List list11;
        Collection arrayList2;
        List list12;
        C27449o00O0OoO c27449o00O0OoO7;
        String str7;
        List list13;
        List list14;
        Iterator it4;
        List list15;
        Iterator it5;
        List list16;
        boolean z;
        PdfInfo pdfInfo;
        Iterator it6;
        List list17;
        C27449o00O0OoO c27449o00O0OoO8;
        C27020OooOoO0 c27020OooOoO0;
        Set setO0OO00O;
        C27449o00O0OoO c27449o00O0OoO9;
        C26427Oooo0O0 c26427Oooo0O0;
        String id;
        List list18 = list;
        if (abstractC32479OooO0OO instanceof o00O00OO) {
            o00o00oo2 = (o00O00OO) abstractC32479OooO0OO;
            int i = o00o00oo2.f95922Oooo00o;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o00oo2.f95922Oooo00o = i - Integer.MIN_VALUE;
                c27449o00O0OoO = this;
            } else {
                c27449o00O0OoO = this;
                o00o00oo2 = new o00O00OO(c27449o00O0OoO, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oo = o00o00oo2.f95920Oooo000;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (o00o00oo2.f95922Oooo00o) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooO0oo);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                str2 = str;
                StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "NoteUseCase", "deletePagesPermanently, noteId: ", str2, ", toDeletePageIds: ");
                sbOooO00o.append(list18);
                c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
                c20358OooO00o.OooOOO0("NoteUseCase");
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                kotlin.jvm.internal.OooOOO0.OooO0o(stackTrace, "getStackTrace(...)");
                c20358OooO00o.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("deletePagesPermanently, stackTrace: ", oOo000Oo.OooOo.o000oOoO(oOo000Oo.OooOOO.Oooo0oo(stackTrace), IOUtils.LINE_SEPARATOR_UNIX, null, null, new C24691Oooo0oO(1), 30)), new Object[0]);
                arrayList = new ArrayList();
                it = list18.iterator();
                c27449o00O0OoO2 = c27449o00O0OoO;
                if (it.hasNext()) {
                    String str8 = (String) it.next();
                    o00o00oo2.f95912OooOo0o = c27449o00O0OoO2;
                    o00o00oo2.f95911OooOo = list18;
                    o00o00oo2.f95914OooOoO0 = str2;
                    o00o00oo2.f95913OooOoO = arrayList;
                    o00o00oo2.f95915OooOoOO = it;
                    o00o00oo2.f95917OooOoo0 = str8;
                    o00o00oo2.f95922Oooo00o = 1;
                    if (c27449o00O0OoO2.OooOOO0(str8, str2, o00o00oo2) != enumC32485OooO00o) {
                        C27449o00O0OoO c27449o00O0OoO10 = c27449o00O0OoO2;
                        list2 = list18;
                        str3 = str8;
                        c27449o00O0OoO3 = c27449o00O0OoO10;
                        C27020OooOoO0 c27020OooOoO02 = c27449o00O0OoO3.f96039OooO0o;
                        o00o00oo2.f95912OooOo0o = c27449o00O0OoO3;
                        o00o00oo2.f95911OooOo = list2;
                        o00o00oo2.f95914OooOoO0 = str2;
                        o00o00oo2.f95913OooOoO = arrayList;
                        o00o00oo2.f95915OooOoOO = it;
                        o00o00oo2.f95917OooOoo0 = null;
                        o00o00oo2.f95922Oooo00o = 2;
                        objOooO0Oo = c27020OooOoO02.OooO0Oo(str3, str2, o00o00oo2);
                        if (objOooO0Oo != enumC32485OooO00o) {
                            Iterator it7 = it;
                            objOooO0oo = objOooO0Oo;
                            list18 = list2;
                            collection = arrayList;
                            o00o00oo3 = o00o00oo2;
                            it2 = it7;
                            page = (Page) objOooO0oo;
                            if (page == null) {
                                c27449o00O0OoO3.getClass();
                                OooOOO(page);
                            } else {
                                page = null;
                            }
                            if (page != null) {
                                collection.add(page);
                            }
                            it = it2;
                            o00o00oo2 = o00o00oo3;
                            arrayList = collection;
                            c27449o00O0OoO2 = c27449o00O0OoO3;
                            if (it.hasNext()) {
                                List list19 = (List) arrayList;
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it8 = list19.iterator();
                                while (it8.hasNext()) {
                                    List<String> historyPageIdList = ((Page) it8.next()).getHistoryPageIdList();
                                    String str9 = historyPageIdList != null ? (String) oOo000Oo.OooOo.Oooo(historyPageIdList) : null;
                                    if (str9 != null) {
                                        arrayList3.add(str9);
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList();
                                list3 = list18;
                                it3 = arrayList3.iterator();
                                c27449o00O0OoO4 = c27449o00O0OoO2;
                                list4 = arrayList3;
                                str4 = str2;
                                list5 = list19;
                                collection2 = arrayList4;
                                if (it3.hasNext()) {
                                    List list20 = (List) collection2;
                                    String strOooO0Oo = c27449o00O0OoO4.f96037OooO0OO.OooO0Oo();
                                    o00o00oo2.f95912OooOo0o = c27449o00O0OoO4;
                                    o00o00oo2.f95911OooOo = list3;
                                    o00o00oo2.f95914OooOoO0 = str4;
                                    o00o00oo2.f95913OooOoO = list5;
                                    o00o00oo2.f95915OooOoOO = list4;
                                    o00o00oo2.f95917OooOoo0 = list20;
                                    o00o00oo2.f95916OooOoo = null;
                                    o00o00oo2.f95922Oooo00o = 4;
                                    objOooO0oo = c27449o00O0OoO4.f96036OooO0O0.OooO0oo(str4, strOooO0Oo, o00o00oo2);
                                    if (objOooO0oo != enumC32485OooO00o) {
                                        list6 = list20;
                                        list7 = list4;
                                        list8 = list5;
                                        str5 = str4;
                                        list9 = list3;
                                        c27449o00O0OoO5 = c27449o00O0OoO4;
                                        NoteMeta noteMeta = (NoteMeta) objOooO0oo;
                                        usingOwnPdf = noteMeta == null ? noteMeta.getUsingOwnPdf() : true;
                                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o2.OooOOO0("NoteUseCase");
                                        c20358OooO00o2.OooO0o0("deletePagesPermanently, noteMeta: " + noteMeta, new Object[0]);
                                        if (usingOwnPdf) {
                                            list10 = list7;
                                            str6 = str5;
                                            c27449o00O0OoO6 = c27449o00O0OoO5;
                                            c27020OooOoO0 = c27449o00O0OoO6.f96039OooO0o;
                                            setO0OO00O = oOo000Oo.OooOo.o0OO00O(oOo000Oo.OooOo.OooooOO(list9, list10));
                                            o00o00oo2.f95912OooOo0o = c27449o00O0OoO6;
                                            o00o00oo2.f95911OooOo = str6;
                                            c27449o00O0OoO9 = null;
                                            o00o00oo2.f95914OooOoO0 = null;
                                            o00o00oo2.f95913OooOoO = null;
                                            o00o00oo2.f95915OooOoOO = null;
                                            o00o00oo2.f95917OooOoo0 = null;
                                            o00o00oo2.f95916OooOoo = null;
                                            o00o00oo2.f95918OooOooO = null;
                                            o00o00oo2.f95919OooOooo = null;
                                            o00o00oo2.f95922Oooo00o = 9;
                                            if (c27020OooOoO0.OooO0O0(str6, setO0OO00O, o00o00oo2) != enumC32485OooO00o) {
                                                o00o00oo2.f95912OooOo0o = c27449o00O0OoO9;
                                                o00o00oo2.f95911OooOo = c27449o00O0OoO9;
                                                o00o00oo2.f95922Oooo00o = 10;
                                            }
                                        } else {
                                            C27020OooOoO0 c27020OooOoO03 = c27449o00O0OoO5.f96039OooO0o;
                                            o00o00oo2.f95912OooOo0o = c27449o00O0OoO5;
                                            o00o00oo2.f95911OooOo = list9;
                                            o00o00oo2.f95914OooOoO0 = str5;
                                            o00o00oo2.f95913OooOoO = list8;
                                            o00o00oo2.f95915OooOoOO = list7;
                                            o00o00oo2.f95917OooOoo0 = list6;
                                            o00o00oo2.f95922Oooo00o = 5;
                                            objOooO0oo = c27020OooOoO03.OooO0oO(str5, o00o00oo2);
                                        }
                                    }
                                } else {
                                    String str10 = (String) it3.next();
                                    C27020OooOoO0 c27020OooOoO04 = c27449o00O0OoO4.f96039OooO0o;
                                    o00o00oo2.f95912OooOo0o = c27449o00O0OoO4;
                                    o00o00oo2.f95911OooOo = list3;
                                    o00o00oo2.f95914OooOoO0 = str4;
                                    o00o00oo2.f95913OooOoO = list5;
                                    o00o00oo2.f95915OooOoOO = list4;
                                    o00o00oo2.f95917OooOoo0 = collection2;
                                    o00o00oo2.f95916OooOoo = it3;
                                    o00o00oo2.f95922Oooo00o = 3;
                                    objOooO0oo = c27020OooOoO04.OooO0Oo(str10, str4, o00o00oo2);
                                }
                                break;
                            }
                        }
                    }
                    return enumC32485OooO00o;
                }
                break;
            case 1:
                str3 = (String) o00o00oo2.f95917OooOoo0;
                Iterator it9 = (Iterator) o00o00oo2.f95915OooOoOO;
                Collection collection3 = o00o00oo2.f95913OooOoO;
                str2 = o00o00oo2.f95914OooOoO0;
                List list21 = (List) o00o00oo2.f95911OooOo;
                C27449o00O0OoO c27449o00O0OoO11 = o00o00oo2.f95912OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo);
                it = it9;
                arrayList = collection3;
                list2 = list21;
                c27449o00O0OoO3 = c27449o00O0OoO11;
                C27020OooOoO0 c27020OooOoO022 = c27449o00O0OoO3.f96039OooO0o;
                o00o00oo2.f95912OooOo0o = c27449o00O0OoO3;
                o00o00oo2.f95911OooOo = list2;
                o00o00oo2.f95914OooOoO0 = str2;
                o00o00oo2.f95913OooOoO = arrayList;
                o00o00oo2.f95915OooOoOO = it;
                o00o00oo2.f95917OooOoo0 = null;
                o00o00oo2.f95922Oooo00o = 2;
                objOooO0Oo = c27020OooOoO022.OooO0Oo(str3, str2, o00o00oo2);
                if (objOooO0Oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                Iterator it10 = (Iterator) o00o00oo2.f95915OooOoOO;
                Collection collection4 = o00o00oo2.f95913OooOoO;
                String str11 = o00o00oo2.f95914OooOoO0;
                List list22 = (List) o00o00oo2.f95911OooOo;
                c27449o00O0OoO3 = o00o00oo2.f95912OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo);
                o00O00OO o00o00oo4 = o00o00oo2;
                it2 = it10;
                list18 = list22;
                str2 = str11;
                collection = collection4;
                o00o00oo3 = o00o00oo4;
                page = (Page) objOooO0oo;
                if (page == null) {
                }
                if (page != null) {
                }
                it = it2;
                o00o00oo2 = o00o00oo3;
                arrayList = collection;
                c27449o00O0OoO2 = c27449o00O0OoO3;
                if (it.hasNext()) {
                }
                break;
            case 3:
                it3 = (Iterator) o00o00oo2.f95916OooOoo;
                collection2 = (Collection) o00o00oo2.f95917OooOoo0;
                list4 = (List) o00o00oo2.f95915OooOoOO;
                list5 = (List) o00o00oo2.f95913OooOoO;
                str4 = o00o00oo2.f95914OooOoO0;
                list3 = (List) o00o00oo2.f95911OooOo;
                c27449o00O0OoO4 = o00o00oo2.f95912OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo);
                Page page2 = (Page) objOooO0oo;
                if (page2 != null) {
                    collection2.add(page2);
                }
                if (it3.hasNext()) {
                }
                return enumC32485OooO00o;
            case 4:
                list6 = (List) o00o00oo2.f95917OooOoo0;
                list7 = (List) o00o00oo2.f95915OooOoOO;
                list8 = (List) o00o00oo2.f95913OooOoO;
                str5 = o00o00oo2.f95914OooOoO0;
                list9 = (List) o00o00oo2.f95911OooOo;
                c27449o00O0OoO5 = o00o00oo2.f95912OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo);
                NoteMeta noteMeta2 = (NoteMeta) objOooO0oo;
                if (noteMeta2 == null) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("NoteUseCase");
                c20358OooO00o22.OooO0o0("deletePagesPermanently, noteMeta: " + noteMeta2, new Object[0]);
                if (usingOwnPdf) {
                }
                break;
            case 5:
                list6 = (List) o00o00oo2.f95917OooOoo0;
                list7 = (List) o00o00oo2.f95915OooOoOO;
                list8 = (List) o00o00oo2.f95913OooOoO;
                str5 = o00o00oo2.f95914OooOoO0;
                list9 = (List) o00o00oo2.f95911OooOo;
                c27449o00O0OoO5 = o00o00oo2.f95912OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj : (Iterable) objOooO0oo) {
                    if (!list9.contains(((Page) obj).getId())) {
                        arrayList5.add(obj);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it11 = arrayList5.iterator();
                while (it11.hasNext()) {
                    List<String> historyPageIdList2 = ((Page) it11.next()).getHistoryPageIdList();
                    String str12 = historyPageIdList2 != null ? (String) oOo000Oo.OooOo.Oooo(historyPageIdList2) : null;
                    if (str12 != null) {
                        arrayList6.add(str12);
                    }
                }
                C27449o00O0OoO c27449o00O0OoO12 = c27449o00O0OoO5;
                list11 = list7;
                arrayList2 = new ArrayList();
                list12 = list8;
                c27449o00O0OoO7 = c27449o00O0OoO12;
                str7 = str5;
                list13 = list9;
                list14 = list6;
                it4 = arrayList6.iterator();
                list15 = arrayList5;
                if (!it4.hasNext()) {
                    String str13 = (String) it4.next();
                    C27020OooOoO0 c27020OooOoO05 = c27449o00O0OoO7.f96039OooO0o;
                    o00o00oo2.f95912OooOo0o = c27449o00O0OoO7;
                    o00o00oo2.f95911OooOo = list13;
                    o00o00oo2.f95914OooOoO0 = str7;
                    o00o00oo2.f95913OooOoO = list12;
                    o00o00oo2.f95915OooOoOO = list11;
                    o00o00oo2.f95917OooOoo0 = list14;
                    o00o00oo2.f95916OooOoo = list15;
                    o00o00oo2.f95918OooOooO = arrayList2;
                    o00o00oo2.f95919OooOooo = it4;
                    o00o00oo2.f95922Oooo00o = 6;
                    objOooO0oo = c27020OooOoO05.OooO0Oo(str13, str7, o00o00oo2);
                } else {
                    ArrayList arrayListOooooOO = oOo000Oo.OooOo.OooooOO(list15, (List) arrayList2);
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj2 : arrayListOooooOO) {
                        if (((Page) obj2).getPaperTheme() instanceof PdfPaperTheme) {
                            arrayList7.add(obj2);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj3 : arrayList7) {
                        PaperTheme paperTheme = ((Page) obj3).getPaperTheme();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme");
                        PdfInfo pdfInfo2 = ((PdfPaperTheme) paperTheme).getPdfInfo();
                        Object arrayList8 = linkedHashMap.get(pdfInfo2);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            linkedHashMap.put(pdfInfo2, arrayList8);
                        }
                        ((List) arrayList8).add(obj3);
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("NoteUseCase");
                    c20358OooO00o3.OooO0o0("deletePagesPermanently, reservedPdfInfoToPagesMap keys: " + linkedHashMap.keySet(), new Object[0]);
                    ArrayList arrayListOooooOO2 = oOo000Oo.OooOo.OooooOO(list12, list14);
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj4 : arrayListOooooOO2) {
                        if (((Page) obj4).getPaperTheme() instanceof PdfPaperTheme) {
                            arrayList9.add(obj4);
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj5 : arrayList9) {
                        PaperTheme paperTheme2 = ((Page) obj5).getPaperTheme();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme2, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme");
                        PdfInfo pdfInfo3 = ((PdfPaperTheme) paperTheme2).getPdfInfo();
                        Object arrayList10 = linkedHashMap2.get(pdfInfo3);
                        if (arrayList10 == null) {
                            arrayList10 = new ArrayList();
                            linkedHashMap2.put(pdfInfo3, arrayList10);
                        }
                        ((List) arrayList10).add(obj5);
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4.OooOOO0("NoteUseCase");
                    c20358OooO00o4.OooO0o0("deletePagesPermanently, toDeletePdfInfoMap keys: " + linkedHashMap2.keySet(), new Object[0]);
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    Iterator it12 = linkedHashMap2.entrySet().iterator();
                    while (it12.hasNext()) {
                        Map.Entry entry = (Map.Entry) it12.next();
                        PdfInfo pdfInfo4 = (PdfInfo) entry.getKey();
                        Set setKeySet = linkedHashMap.keySet();
                        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
                            z = false;
                        } else {
                            Iterator it13 = setKeySet.iterator();
                            while (it13.hasNext()) {
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PdfInfo) it13.next()).getId(), pdfInfo4.getId())) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        boolean zContains = linkedHashMap.keySet().contains(pdfInfo4);
                        C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o5.OooOOO0("NoteUseCase");
                        LinkedHashMap linkedHashMap4 = linkedHashMap;
                        Iterator it14 = it12;
                        c20358OooO00o5.OooO0o0("deletePagesPermanently, pdfInfo: " + pdfInfo4 + ", isReservedById: " + z + ", isReservedByEquals: " + zContains, new Object[0]);
                        if (!z) {
                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                        }
                        linkedHashMap = linkedHashMap4;
                        it12 = it14;
                    }
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                        List list23 = (List) entry2.getValue();
                        if (!(list23 instanceof Collection) || !list23.isEmpty()) {
                            Iterator it15 = list23.iterator();
                            while (it15.hasNext()) {
                                if (((Page) it15.next()).getSource() == 1) {
                                }
                                break;
                            }
                        }
                        linkedHashMap5.put(entry2.getKey(), entry2.getValue());
                    }
                    it5 = linkedHashMap5.entrySet().iterator();
                    list16 = list11;
                    list9 = list13;
                    if (it5.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) it5.next();
                        PdfInfo pdfInfo5 = (PdfInfo) entry3.getKey();
                        List list24 = (List) entry3.getValue();
                        C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o6.OooOOO0("NoteUseCase");
                        c20358OooO00o6.OooOO0O("deletePagesPermanently, DELETING pdfInfo: " + pdfInfo5 + ", firstPage: " + oOo000Oo.OooOo.Oooo(list24), new Object[0]);
                        o00o00oo2.f95912OooOo0o = c27449o00O0OoO7;
                        o00o00oo2.f95911OooOo = list9;
                        o00o00oo2.f95914OooOoO0 = str7;
                        o00o00oo2.f95913OooOoO = list16;
                        o00o00oo2.f95915OooOoOO = it5;
                        o00o00oo2.f95917OooOoo0 = pdfInfo5;
                        o00o00oo2.f95916OooOoo = null;
                        o00o00oo2.f95918OooOooO = null;
                        o00o00oo2.f95919OooOooo = null;
                        o00o00oo2.f95922Oooo00o = 7;
                        c27449o00O0OoO7.getClass();
                        if (OooOOOo(pdfInfo5) != enumC32485OooO00o) {
                            List list25 = list16;
                            it6 = it5;
                            pdfInfo = pdfInfo5;
                            list17 = list25;
                            c27449o00O0OoO8 = c27449o00O0OoO7;
                            c26427Oooo0O0 = c27449o00O0OoO8.f96042OooO0oo;
                            id = pdfInfo.getId();
                            o00o00oo2.f95912OooOo0o = c27449o00O0OoO8;
                            o00o00oo2.f95911OooOo = list9;
                            o00o00oo2.f95914OooOoO0 = str7;
                            o00o00oo2.f95913OooOoO = list17;
                            o00o00oo2.f95915OooOoOO = it6;
                            o00o00oo2.f95917OooOoo0 = null;
                            o00o00oo2.f95922Oooo00o = 8;
                            if (c26427Oooo0O0.OooO0O0(id, str7, o00o00oo2) != enumC32485OooO00o) {
                                it5 = it6;
                                list16 = list17;
                                c27449o00O0OoO7 = c27449o00O0OoO8;
                                if (it5.hasNext()) {
                                    list10 = list16;
                                    c27449o00O0OoO6 = c27449o00O0OoO7;
                                    str6 = str7;
                                    c27020OooOoO0 = c27449o00O0OoO6.f96039OooO0o;
                                    setO0OO00O = oOo000Oo.OooOo.o0OO00O(oOo000Oo.OooOo.OooooOO(list9, list10));
                                    o00o00oo2.f95912OooOo0o = c27449o00O0OoO6;
                                    o00o00oo2.f95911OooOo = str6;
                                    c27449o00O0OoO9 = null;
                                    o00o00oo2.f95914OooOoO0 = null;
                                    o00o00oo2.f95913OooOoO = null;
                                    o00o00oo2.f95915OooOoOO = null;
                                    o00o00oo2.f95917OooOoo0 = null;
                                    o00o00oo2.f95916OooOoo = null;
                                    o00o00oo2.f95918OooOooO = null;
                                    o00o00oo2.f95919OooOooo = null;
                                    o00o00oo2.f95922Oooo00o = 9;
                                    if (c27020OooOoO0.OooO0O0(str6, setO0OO00O, o00o00oo2) != enumC32485OooO00o) {
                                    }
                                }
                            }
                        }
                        return enumC32485OooO00o;
                    }
                }
                break;
            case 6:
                it4 = o00o00oo2.f95919OooOooo;
                arrayList2 = o00o00oo2.f95918OooOooO;
                list15 = (List) o00o00oo2.f95916OooOoo;
                list14 = (List) o00o00oo2.f95917OooOoo0;
                list11 = (List) o00o00oo2.f95915OooOoOO;
                list12 = (List) o00o00oo2.f95913OooOoO;
                str7 = o00o00oo2.f95914OooOoO0;
                list13 = (List) o00o00oo2.f95911OooOo;
                c27449o00O0OoO7 = o00o00oo2.f95912OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo);
                Page page3 = (Page) objOooO0oo;
                if (page3 != null) {
                    arrayList2.add(page3);
                }
                if (!it4.hasNext()) {
                }
                break;
            case 7:
                pdfInfo = (PdfInfo) o00o00oo2.f95917OooOoo0;
                it6 = (Iterator) o00o00oo2.f95915OooOoOO;
                list17 = (List) o00o00oo2.f95913OooOoO;
                String str14 = o00o00oo2.f95914OooOoO0;
                list9 = (List) o00o00oo2.f95911OooOo;
                c27449o00O0OoO8 = o00o00oo2.f95912OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo);
                str7 = str14;
                c26427Oooo0O0 = c27449o00O0OoO8.f96042OooO0oo;
                id = pdfInfo.getId();
                o00o00oo2.f95912OooOo0o = c27449o00O0OoO8;
                o00o00oo2.f95911OooOo = list9;
                o00o00oo2.f95914OooOoO0 = str7;
                o00o00oo2.f95913OooOoO = list17;
                o00o00oo2.f95915OooOoOO = it6;
                o00o00oo2.f95917OooOoo0 = null;
                o00o00oo2.f95922Oooo00o = 8;
                if (c26427Oooo0O0.OooO0O0(id, str7, o00o00oo2) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 8:
                it5 = (Iterator) o00o00oo2.f95915OooOoOO;
                list16 = (List) o00o00oo2.f95913OooOoO;
                String str15 = o00o00oo2.f95914OooOoO0;
                List list26 = (List) o00o00oo2.f95911OooOo;
                C27449o00O0OoO c27449o00O0OoO13 = o00o00oo2.f95912OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo);
                str7 = str15;
                c27449o00O0OoO7 = c27449o00O0OoO13;
                list9 = list26;
                if (it5.hasNext()) {
                }
                break;
            case 9:
                str6 = (String) o00o00oo2.f95911OooOo;
                c27449o00O0OoO6 = o00o00oo2.f95912OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo);
                c27449o00O0OoO9 = null;
                o00o00oo2.f95912OooOo0o = c27449o00O0OoO9;
                o00o00oo2.f95911OooOo = c27449o00O0OoO9;
                o00o00oo2.f95922Oooo00o = 10;
                break;
            case 10:
                C32446OooOOOo.OooO0O0(objOooO0oo);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final InterfaceC33721OooO0o<List<NoteMeta>> OooOOo(String userId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        o0OOO00o.OooO0O0 oooO0O0OooOo0o = this.f96036OooO0O0.OooOo0o(userId);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C25252OooO0Oo.OooOo0O(oooO0O0OooOo0o, ExecutorC33873OooO0O0.f122045OooOoO0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x05cc, code lost:
    
        if (r3 != r5) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x06d9, code lost:
    
        if (r3 != r5) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0890, code lost:
    
        if (r3 == r5) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0971, code lost:
    
        if (r3 == r5) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0bfc, code lost:
    
        if (OoooOoo(r2, r1, r4) != r5) goto L322;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0460 A[PHI: r1 r2 r6 r7
      0x0460: PHI (r1v18 java.util.List) = (r1v15 java.util.List), (r1v20 java.util.List) binds: [B:98:0x045c, B:45:0x02ed] A[DONT_GENERATE, DONT_INLINE]
      0x0460: PHI (r2v14 java.lang.String) = (r2v11 java.lang.String), (r2v16 java.lang.String) binds: [B:98:0x045c, B:45:0x02ed] A[DONT_GENERATE, DONT_INLINE]
      0x0460: PHI (r6v11 java.lang.String) = (r6v9 java.lang.String), (r6v12 java.lang.String) binds: [B:98:0x045c, B:45:0x02ed] A[DONT_GENERATE, DONT_INLINE]
      0x0460: PHI (r7v11 o0OOo0o.o00O0OoO) = (r7v9 o0OOo0o.o00O0OoO), (r7v12 o0OOo0o.o00O0OoO) binds: [B:98:0x045c, B:45:0x02ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x048f A[PHI: r1 r2 r6 r7
      0x048f: PHI (r1v21 java.util.List) = (r1v18 java.util.List), (r1v23 java.util.List) binds: [B:107:0x048b, B:44:0x02dc] A[DONT_GENERATE, DONT_INLINE]
      0x048f: PHI (r2v17 java.lang.String) = (r2v14 java.lang.String), (r2v19 java.lang.String) binds: [B:107:0x048b, B:44:0x02dc] A[DONT_GENERATE, DONT_INLINE]
      0x048f: PHI (r6v13 java.lang.String) = (r6v11 java.lang.String), (r6v14 java.lang.String) binds: [B:107:0x048b, B:44:0x02dc] A[DONT_GENERATE, DONT_INLINE]
      0x048f: PHI (r7v13 o0OOo0o.o00O0OoO) = (r7v11 o0OOo0o.o00O0OoO), (r7v14 o0OOo0o.o00O0OoO) binds: [B:107:0x048b, B:44:0x02dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04be A[PHI: r1 r2 r6 r7
      0x04be: PHI (r1v24 java.util.List) = (r1v21 java.util.List), (r1v26 java.util.List) binds: [B:116:0x04ba, B:43:0x02cb] A[DONT_GENERATE, DONT_INLINE]
      0x04be: PHI (r2v20 java.lang.String) = (r2v17 java.lang.String), (r2v22 java.lang.String) binds: [B:116:0x04ba, B:43:0x02cb] A[DONT_GENERATE, DONT_INLINE]
      0x04be: PHI (r6v15 java.lang.String) = (r6v13 java.lang.String), (r6v16 java.lang.String) binds: [B:116:0x04ba, B:43:0x02cb] A[DONT_GENERATE, DONT_INLINE]
      0x04be: PHI (r7v15 o0OOo0o.o00O0OoO) = (r7v13 o0OOo0o.o00O0OoO), (r7v16 o0OOo0o.o00O0OoO) binds: [B:116:0x04ba, B:43:0x02cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04d7 A[PHI: r1 r2 r6 r7
      0x04d7: PHI (r1v27 java.util.List) = (r1v24 java.util.List), (r1v34 java.util.List) binds: [B:119:0x04d3, B:42:0x02ba] A[DONT_GENERATE, DONT_INLINE]
      0x04d7: PHI (r2v23 java.lang.String) = (r2v20 java.lang.String), (r2v25 java.lang.String) binds: [B:119:0x04d3, B:42:0x02ba] A[DONT_GENERATE, DONT_INLINE]
      0x04d7: PHI (r6v17 java.lang.String) = (r6v15 java.lang.String), (r6v18 java.lang.String) binds: [B:119:0x04d3, B:42:0x02ba] A[DONT_GENERATE, DONT_INLINE]
      0x04d7: PHI (r7v17 o0OOo0o.o00O0OoO) = (r7v15 o0OOo0o.o00O0OoO), (r7v18 o0OOo0o.o00O0OoO) binds: [B:119:0x04d3, B:42:0x02ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04ee A[LOOP:5: B:122:0x04e8->B:124:0x04ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x068a A[PHI: r1 r2 r6 r7
      0x068a: PHI (r1v65 java.util.List) = (r1v62 java.util.List), (r1v67 java.util.List) binds: [B:157:0x0686, B:34:0x021d] A[DONT_GENERATE, DONT_INLINE]
      0x068a: PHI (r2v54 java.lang.String) = (r2v51 java.lang.String), (r2v56 java.lang.String) binds: [B:157:0x0686, B:34:0x021d] A[DONT_GENERATE, DONT_INLINE]
      0x068a: PHI (r6v40 java.lang.String) = (r6v38 java.lang.String), (r6v41 java.lang.String) binds: [B:157:0x0686, B:34:0x021d] A[DONT_GENERATE, DONT_INLINE]
      0x068a: PHI (r7v41 o0OOo0o.o00O0OoO) = (r7v39 o0OOo0o.o00O0OoO), (r7v42 o0OOo0o.o00O0OoO) binds: [B:157:0x0686, B:34:0x021d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x06a3 A[PHI: r1 r2 r6 r7
      0x06a3: PHI (r1v68 java.util.List) = (r1v65 java.util.List), (r1v70 java.util.List) binds: [B:160:0x069f, B:33:0x020c] A[DONT_GENERATE, DONT_INLINE]
      0x06a3: PHI (r2v57 java.lang.String) = (r2v54 java.lang.String), (r2v59 java.lang.String) binds: [B:160:0x069f, B:33:0x020c] A[DONT_GENERATE, DONT_INLINE]
      0x06a3: PHI (r6v42 java.lang.String) = (r6v40 java.lang.String), (r6v43 java.lang.String) binds: [B:160:0x069f, B:33:0x020c] A[DONT_GENERATE, DONT_INLINE]
      0x06a3: PHI (r7v43 o0OOo0o.o00O0OoO) = (r7v41 o0OOo0o.o00O0OoO), (r7v44 o0OOo0o.o00O0OoO) binds: [B:160:0x069f, B:33:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x07d7 A[PHI: r1 r2 r6 r7
      0x07d7: PHI (r1v92 java.util.List) = (r1v89 java.util.List), (r1v94 java.util.List) binds: [B:193:0x07d3, B:26:0x0199] A[DONT_GENERATE, DONT_INLINE]
      0x07d7: PHI (r2v78 java.lang.String) = (r2v75 java.lang.String), (r2v80 java.lang.String) binds: [B:193:0x07d3, B:26:0x0199] A[DONT_GENERATE, DONT_INLINE]
      0x07d7: PHI (r6v59 java.lang.String) = (r6v57 java.lang.String), (r6v60 java.lang.String) binds: [B:193:0x07d3, B:26:0x0199] A[DONT_GENERATE, DONT_INLINE]
      0x07d7: PHI (r7v60 o0OOo0o.o00O0OoO) = (r7v58 o0OOo0o.o00O0OoO), (r7v61 o0OOo0o.o00O0OoO) binds: [B:193:0x07d3, B:26:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0807 A[PHI: r1 r2 r6 r7
      0x0807: PHI (r1v95 java.util.List) = (r1v92 java.util.List), (r1v97 java.util.List) binds: [B:202:0x0803, B:25:0x0188] A[DONT_GENERATE, DONT_INLINE]
      0x0807: PHI (r2v81 java.lang.String) = (r2v78 java.lang.String), (r2v83 java.lang.String) binds: [B:202:0x0803, B:25:0x0188] A[DONT_GENERATE, DONT_INLINE]
      0x0807: PHI (r6v61 java.lang.String) = (r6v59 java.lang.String), (r6v62 java.lang.String) binds: [B:202:0x0803, B:25:0x0188] A[DONT_GENERATE, DONT_INLINE]
      0x0807: PHI (r7v62 o0OOo0o.o00O0OoO) = (r7v60 o0OOo0o.o00O0OoO), (r7v63 o0OOo0o.o00O0OoO) binds: [B:202:0x0803, B:25:0x0188] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0826 A[PHI: r1 r2 r3 r6 r7
      0x0826: PHI (r1v98 java.util.List) = (r1v95 java.util.List), (r1v100 java.util.List) binds: [B:205:0x0822, B:24:0x0177] A[DONT_GENERATE, DONT_INLINE]
      0x0826: PHI (r2v84 java.lang.String) = (r2v81 java.lang.String), (r2v88 java.lang.String) binds: [B:205:0x0822, B:24:0x0177] A[DONT_GENERATE, DONT_INLINE]
      0x0826: PHI (r3v95 java.lang.Object) = (r3v94 java.lang.Object), (r3v1 java.lang.Object) binds: [B:205:0x0822, B:24:0x0177] A[DONT_GENERATE, DONT_INLINE]
      0x0826: PHI (r6v63 java.lang.String) = (r6v61 java.lang.String), (r6v66 java.lang.String) binds: [B:205:0x0822, B:24:0x0177] A[DONT_GENERATE, DONT_INLINE]
      0x0826: PHI (r7v64 o0OOo0o.o00O0OoO) = (r7v62 o0OOo0o.o00O0OoO), (r7v67 o0OOo0o.o00O0OoO) binds: [B:205:0x0822, B:24:0x0177] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0925 A[LOOP:4: B:242:0x091f->B:244:0x0925, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0a99  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0aea  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0b11 A[LOOP:0: B:298:0x0b0b->B:300:0x0b11, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0b60  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0b72  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0b84  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0bb4  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0bce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0206 A[PHI: r1 r2 r3 r6 r7
      0x0206: PHI (r1v71 java.util.List) = (r1v68 java.util.List), (r1v75 java.util.List) binds: [B:163:0x06b8, B:31:0x01f7] A[DONT_GENERATE, DONT_INLINE]
      0x0206: PHI (r2v60 java.lang.String) = (r2v57 java.lang.String), (r2v63 java.lang.String) binds: [B:163:0x06b8, B:31:0x01f7] A[DONT_GENERATE, DONT_INLINE]
      0x0206: PHI (r3v69 java.lang.Object) = (r3v68 java.lang.Object), (r3v1 java.lang.Object) binds: [B:163:0x06b8, B:31:0x01f7] A[DONT_GENERATE, DONT_INLINE]
      0x0206: PHI (r6v44 java.lang.String) = (r6v42 java.lang.String), (r6v46 java.lang.String) binds: [B:163:0x06b8, B:31:0x01f7] A[DONT_GENERATE, DONT_INLINE]
      0x0206: PHI (r7v45 o0OOo0o.o00O0OoO) = (r7v43 o0OOo0o.o00O0OoO), (r7v47 o0OOo0o.o00O0OoO) binds: [B:163:0x06b8, B:31:0x01f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03ab A[PHI: r1 r2 r3 r6
      0x03ab: PHI (r1v11 java.lang.String) = (r1v8 java.lang.String), (r1v14 java.lang.String) binds: [B:69:0x03a7, B:47:0x030f] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r2v8 java.lang.String) = (r2v6 java.lang.String), (r2v10 java.lang.String) binds: [B:69:0x03a7, B:47:0x030f] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r3v17 java.lang.Object) = (r3v16 java.lang.Object), (r3v1 java.lang.Object) binds: [B:69:0x03a7, B:47:0x030f] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r6v6 o0OOo0o.o00O0OoO) = (r6v4 o0OOo0o.o00O0OoO), (r6v8 o0OOo0o.o00O0OoO) binds: [B:69:0x03a7, B:47:0x030f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03ee A[LOOP:8: B:81:0x03e8->B:83:0x03ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x042a  */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v60, types: [java.lang.String, o0OOo0o.o00O0OoO] */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x056b -> B:40:0x02a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x0624 -> B:151:0x062a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x0733 -> B:29:0x01de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x0758 -> B:179:0x075b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:249:0x0971 -> B:251:0x0975). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:304:0x0b60 -> B:305:0x0b68). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27442o00O00Oo c27442o00O00Oo;
        C27449o00O0OoO c27449o00O0OoO;
        Object objOooO0O0;
        String str3;
        String str4;
        ArrayList arrayList;
        C27020OooOoO0 c27020OooOoO0;
        C27449o00O0OoO c27449o00O0OoO2;
        String str5;
        String str6;
        List list;
        Iterator it;
        C27020OooOoO0 c27020OooOoO02;
        Set setO0OO00O;
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o;
        Object objOooO00o2;
        EnumC32485OooO00o enumC32485OooO00o2;
        InterfaceC27292OooO0oO interfaceC27292OooO0oO;
        Iterator it2;
        Serializable serializableOooOOO;
        List list2;
        List list3;
        Collection arrayList2;
        String str7;
        String str8;
        C27449o00O0OoO c27449o00O0OoO3;
        Iterator it3;
        List list4;
        String str9;
        String str10;
        C27449o00O0OoO c27449o00O0OoO4;
        Image image;
        Collection collection;
        List list5;
        Collection arrayList3;
        C27449o00O0OoO c27449o00O0OoO5;
        String str11;
        Iterator it4;
        String str12;
        List list6;
        String str13;
        String str14;
        C27449o00O0OoO c27449o00O0OoO6;
        AudioFile audioFile;
        String str15;
        String str16;
        Collection collection2;
        C26515OooooO0 c26515OooooO0;
        InterfaceC27318Oooo00o interfaceC27318Oooo00o;
        C27449o00O0OoO c27449o00O0OoO7;
        String str17;
        String str18;
        List list7;
        NoteContent noteContent;
        String str19;
        String str20;
        C27449o00O0OoO c27449o00O0OoO8;
        Collection arrayList4;
        NoteContent noteContent2;
        List list8;
        Iterator it5;
        List list9;
        String str21;
        String str22;
        C27449o00O0OoO c27449o00O0OoO9;
        DualLinkRef dualLinkRef;
        Image item;
        Image imageCopy$default;
        Object objOooO00o3;
        EnumC32485OooO00o enumC32485OooO00o3;
        Object objOooO00o4;
        EnumC32485OooO00o enumC32485OooO00o4;
        NoteMeta noteMeta;
        String str23;
        C27449o00O0OoO c27449o00O0OoO10;
        PdfInfo pdfInfoCopy$default;
        List list10;
        String str24;
        NoteMeta noteMeta2;
        PdfInfo pdfInfo;
        String id;
        PdfInfo pdfInfo2;
        PdfInfo pdfInfo3;
        NoteContent noteContent3;
        ArrayList arrayList5;
        List<Page> pages;
        Iterator<T> it6;
        PdfInfo pdfInfo4;
        Iterator it7;
        String str25;
        String str26;
        C27449o00O0OoO c27449o00O0OoO11;
        NoteMeta noteMeta3;
        Collection collection3;
        List list11;
        List list12;
        NoteMeta noteMeta4;
        String str27;
        String str28;
        PdfInfo pdfInfoCopy$default2;
        Iterator it8;
        Collection collection4;
        List list13;
        List list14;
        List list15;
        PdfInfo pdfInfo5;
        Collection collection5;
        NoteMeta noteMeta5;
        List list16;
        C27449o00O0OoO c27449o00O0OoO12;
        Collection collection6;
        String str29;
        PdfInfo pdfInfo6;
        List list17;
        Collection collection7;
        List list18;
        NoteMeta noteMeta6;
        List list19;
        PdfInfo pdfInfo7;
        C27449o00O0OoO c27449o00O0OoO13;
        Collection collection8;
        String str30;
        C27449o00O0OoO c27449o00O0OoO14;
        String str31;
        PdfInfo pdfInfo8;
        List list20;
        Collection collection9;
        ArrayList arrayList6;
        String str32;
        Iterator it9;
        C27020OooOoO0 c27020OooOoO03;
        Collection collection10;
        C26427Oooo0O0 c26427Oooo0O0;
        NoteMeta noteMetaCopy$default;
        String str33;
        ?? r12;
        String str34 = str;
        String str35 = str2;
        if (abstractC32479OooO0OO instanceof C27442o00O00Oo) {
            c27442o00O00Oo = (C27442o00O00Oo) abstractC32479OooO0OO;
            int i = c27442o00O00Oo.f95937Oooo0OO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27442o00O00Oo.f95937Oooo0OO = i - Integer.MIN_VALUE;
            } else {
                c27442o00O00Oo = new C27442o00O00Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = c27442o00O00Oo.f95932Oooo0;
        C21904OooOoo0.OooO0Oo();
        EnumC32485OooO00o enumC32485OooO00o5 = EnumC32485OooO00o.f116726OooOo0o;
        String str36 = "NoteUseCase";
        switch (c27442o00O00Oo.f95937Oooo0OO) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooO0oO);
                if (!this.f96056OooOo0O.OooO0o0(str34, str35)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NoteUseCase");
                    c20358OooO00o.OooO0OO("duplicateNote failed, duplicated database error.", new Object[0]);
                    return C25261OooO0o0.OooO0O0(false);
                }
                c27442o00O00Oo.f95924OooOo0o = this;
                c27442o00O00Oo.f95923OooOo = str34;
                c27442o00O00Oo.f95926OooOoO0 = str35;
                c27442o00O00Oo.f95937Oooo0OO = 1;
                if (this.f96035OooO00o.OooO0O0(str35, str34, c27442o00O00Oo) != enumC32485OooO00o5) {
                    c27449o00O0OoO = this;
                    C27020OooOoO0 c27020OooOoO04 = c27449o00O0OoO.f96039OooO0o;
                    c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO;
                    c27442o00O00Oo.f95923OooOo = str34;
                    c27442o00O00Oo.f95926OooOoO0 = str35;
                    c27442o00O00Oo.f95937Oooo0OO = 2;
                    C27015OooOOoo c27015OooOOoo = c27020OooOoO04.f94064OooO00o;
                    c27015OooOOoo.getClass();
                    objOooO0O0 = c27015OooOOoo.OooO0O0(str35, new o0OOO0OO.OooOOOO(str34, str35, null));
                    if (objOooO0O0 != enumC32485OooO00o5) {
                        objOooO0O0 = C32460OooOooO.f116667OooO00o;
                    }
                    if (objOooO0O0 != enumC32485OooO00o5) {
                        objOooO0O0 = C32460OooOooO.f116667OooO00o;
                    }
                    if (objOooO0O0 != enumC32485OooO00o5) {
                        String str37 = str35;
                        str3 = str34;
                        str4 = str37;
                        C27020OooOoO0 c27020OooOoO05 = c27449o00O0OoO.f96039OooO0o;
                        c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO;
                        c27442o00O00Oo.f95923OooOo = str3;
                        c27442o00O00Oo.f95926OooOoO0 = str4;
                        c27442o00O00Oo.f95937Oooo0OO = 3;
                        objOooO0oO = c27020OooOoO05.OooO0oO(str4, c27442o00O00Oo);
                        if (objOooO0oO != enumC32485OooO00o5) {
                            List list21 = (List) objOooO0oO;
                            ArrayList<Page> arrayList7 = new ArrayList();
                            for (Object obj : list21) {
                                List<String> historyPageIdList = ((Page) obj).getHistoryPageIdList();
                                if (historyPageIdList != null && !historyPageIdList.isEmpty()) {
                                    arrayList7.add(obj);
                                }
                            }
                            arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList7, 10));
                            for (Page page : arrayList7) {
                                page.setHistoryPageIdList(null);
                                arrayList.add(page);
                            }
                            c27020OooOoO0 = c27449o00O0OoO.f96039OooO0o;
                            c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO;
                            c27442o00O00Oo.f95923OooOo = str3;
                            c27442o00O00Oo.f95926OooOoO0 = str4;
                            c27442o00O00Oo.f95925OooOoO = list21;
                            c27442o00O00Oo.f95937Oooo0OO = 4;
                            if (c27020OooOoO0.OooOO0(str4, arrayList, c27442o00O00Oo) != enumC32485OooO00o5) {
                                c27449o00O0OoO2 = c27449o00O0OoO;
                                str5 = str3;
                                str6 = str4;
                                list = list21;
                                ArrayList arrayList8 = new ArrayList();
                                it = list.iterator();
                                while (it.hasNext()) {
                                    List<String> historyPageIdList2 = ((Page) it.next()).getHistoryPageIdList();
                                    String str38 = historyPageIdList2 != null ? (String) oOo000Oo.OooOo.Oooo(historyPageIdList2) : null;
                                    if (str38 != null) {
                                        arrayList8.add(str38);
                                    }
                                }
                                c27020OooOoO02 = c27449o00O0OoO2.f96039OooO0o;
                                setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList8);
                                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO2;
                                c27442o00O00Oo.f95923OooOo = str5;
                                c27442o00O00Oo.f95926OooOoO0 = str6;
                                c27442o00O00Oo.f95925OooOoO = list;
                                c27442o00O00Oo.f95937Oooo0OO = 5;
                                if (c27020OooOoO02.OooO0O0(str6, setO0OO00O, c27442o00O00Oo) != enumC32485OooO00o5) {
                                    C26620o00Oo00o c26620o00Oo00o = c27449o00O0OoO2.f96043OooOO0;
                                    c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO2;
                                    c27442o00O00Oo.f95923OooOo = str5;
                                    c27442o00O00Oo.f95926OooOoO0 = str6;
                                    c27442o00O00Oo.f95925OooOoO = list;
                                    c27442o00O00Oo.f95937Oooo0OO = 6;
                                    C26613o00OOOoO c26613o00OOOoO = c26620o00Oo00o.f91878OooO00o;
                                    c26613o00OOOoO.getClass();
                                    objOooO00o = c26613o00OOOoO.OooO00o(str6, new C26690oOooo0o(str5, str6, null));
                                    enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                                    if (objOooO00o != enumC32485OooO00o) {
                                        objOooO00o = C32460OooOooO.f116667OooO00o;
                                    }
                                    if (objOooO00o != enumC32485OooO00o) {
                                        objOooO00o = C32460OooOooO.f116667OooO00o;
                                    }
                                    if (objOooO00o != enumC32485OooO00o5) {
                                        o0OO00o0.OooOo00 oooOo00 = c27449o00O0OoO2.f96045OooOO0o;
                                        c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO2;
                                        c27442o00O00Oo.f95923OooOo = str5;
                                        c27442o00O00Oo.f95926OooOoO0 = str6;
                                        c27442o00O00Oo.f95925OooOoO = list;
                                        c27442o00O00Oo.f95937Oooo0OO = 7;
                                        C26479OooOO0o c26479OooOO0o = oooOo00.f91041OooO00o;
                                        c26479OooOO0o.getClass();
                                        objOooO00o2 = c26479OooOO0o.OooO00o(str6, new o0OO00o0.OooOO0O(str5, str6, null));
                                        enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                                        if (objOooO00o2 != enumC32485OooO00o2) {
                                            objOooO00o2 = C32460OooOooO.f116667OooO00o;
                                        }
                                        if (objOooO00o2 != enumC32485OooO00o2) {
                                            objOooO00o2 = C32460OooOooO.f116667OooO00o;
                                        }
                                        if (objOooO00o2 != enumC32485OooO00o5) {
                                            interfaceC27292OooO0oO = c27449o00O0OoO2.f96044OooOO0O;
                                            c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO2;
                                            c27442o00O00Oo.f95923OooOo = str5;
                                            c27442o00O00Oo.f95926OooOoO0 = str6;
                                            c27442o00O00Oo.f95925OooOoO = list;
                                            c27442o00O00Oo.f95937Oooo0OO = 8;
                                            if (interfaceC27292OooO0oO.OooO0oo(str6, str5, c27442o00O00Oo) != enumC32485OooO00o5) {
                                                List list22 = list;
                                                ArrayList arrayList9 = new ArrayList(C34428OooOOo.OooOOoo(list22, 10));
                                                it2 = list22.iterator();
                                                while (it2.hasNext()) {
                                                    arrayList9.add(((Page) it2.next()).getId());
                                                }
                                                C26596o00O0o0 c26596o00O0o0 = c27449o00O0OoO2.f96047OooOOO0;
                                                Set setO0OO00O2 = oOo000Oo.OooOo.o0OO00O(arrayList9);
                                                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO2;
                                                c27442o00O00Oo.f95923OooOo = str5;
                                                c27442o00O00Oo.f95926OooOoO0 = str6;
                                                c27442o00O00Oo.f95925OooOoO = arrayList9;
                                                c27442o00O00Oo.f95937Oooo0OO = 9;
                                                serializableOooOOO = c26596o00O0o0.OooOOO(str6, setO0OO00O2, c27442o00O00Oo);
                                                if (serializableOooOOO != enumC32485OooO00o5) {
                                                    objOooO0oO = serializableOooOOO;
                                                    list2 = arrayList9;
                                                    Iterable iterable = (Iterable) objOooO0oO;
                                                    list3 = list2;
                                                    arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
                                                    str7 = str6;
                                                    str8 = str5;
                                                    c27449o00O0OoO3 = c27449o00O0OoO2;
                                                    it3 = iterable.iterator();
                                                    if (!it3.hasNext()) {
                                                        image = (Image) it3.next();
                                                        C26596o00O0o0 c26596o00O0o02 = c27449o00O0OoO3.f96047OooOOO0;
                                                        File file = new File(image.getUri());
                                                        String str39 = image.id;
                                                        c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO3;
                                                        c27442o00O00Oo.f95923OooOo = str8;
                                                        c27442o00O00Oo.f95926OooOoO0 = str7;
                                                        c27442o00O00Oo.f95925OooOoO = list3;
                                                        c27442o00O00Oo.f95927OooOoOO = arrayList2;
                                                        c27442o00O00Oo.f95929OooOoo0 = it3;
                                                        c27442o00O00Oo.f95928OooOoo = image;
                                                        c27442o00O00Oo.f95930OooOooO = arrayList2;
                                                        c27442o00O00Oo.f95937Oooo0OO = 10;
                                                        objOooO0oO = c26596o00O0o02.OooO0oO(file, str7, str39, c27442o00O00Oo);
                                                        if (objOooO0oO != enumC32485OooO00o5) {
                                                            collection = arrayList2;
                                                            arrayList2.add(Image.copy$default(image, null, null, (String) objOooO0oO, null, null, 0.0f, 0L, 0L, false, 507, null));
                                                            arrayList2 = collection;
                                                            if (!it3.hasNext()) {
                                                                C26596o00O0o0 c26596o00O0o03 = c27449o00O0OoO3.f96047OooOOO0;
                                                                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO3;
                                                                c27442o00O00Oo.f95923OooOo = str8;
                                                                c27442o00O00Oo.f95926OooOoO0 = str7;
                                                                c27442o00O00Oo.f95925OooOoO = list3;
                                                                c27442o00O00Oo.f95927OooOoOO = null;
                                                                c27442o00O00Oo.f95929OooOoo0 = null;
                                                                c27442o00O00Oo.f95928OooOoo = null;
                                                                c27442o00O00Oo.f95930OooOooO = null;
                                                                c27442o00O00Oo.f95937Oooo0OO = 11;
                                                                if (c26596o00O0o03.OooOOoo(str7, (List) arrayList2, c27442o00O00Oo) != enumC32485OooO00o5) {
                                                                    list4 = list3;
                                                                    str9 = str7;
                                                                    str10 = str8;
                                                                    c27449o00O0OoO4 = c27449o00O0OoO3;
                                                                    InterfaceC27292OooO0oO interfaceC27292OooO0oO2 = c27449o00O0OoO4.f96044OooOO0O;
                                                                    c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO4;
                                                                    c27442o00O00Oo.f95923OooOo = str10;
                                                                    c27442o00O00Oo.f95926OooOoO0 = str9;
                                                                    c27442o00O00Oo.f95925OooOoO = list4;
                                                                    c27442o00O00Oo.f95937Oooo0OO = 12;
                                                                    objOooO0oO = interfaceC27292OooO0oO2.OooO00o(str9, c27442o00O00Oo);
                                                                }
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return enumC32485OooO00o5;
            case 1:
                String str40 = (String) c27442o00O00Oo.f95926OooOoO0;
                String str41 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                str35 = str40;
                str34 = str41;
                C27020OooOoO0 c27020OooOoO042 = c27449o00O0OoO.f96039OooO0o;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO;
                c27442o00O00Oo.f95923OooOo = str34;
                c27442o00O00Oo.f95926OooOoO0 = str35;
                c27442o00O00Oo.f95937Oooo0OO = 2;
                C27015OooOOoo c27015OooOOoo2 = c27020OooOoO042.f94064OooO00o;
                c27015OooOOoo2.getClass();
                objOooO0O0 = c27015OooOOoo2.OooO0O0(str35, new o0OOO0OO.OooOOOO(str34, str35, null));
                if (objOooO0O0 != enumC32485OooO00o5) {
                }
                if (objOooO0O0 != enumC32485OooO00o5) {
                }
                if (objOooO0O0 != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 2:
                str4 = (String) c27442o00O00Oo.f95926OooOoO0;
                str3 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                C27020OooOoO0 c27020OooOoO052 = c27449o00O0OoO.f96039OooO0o;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO;
                c27442o00O00Oo.f95923OooOo = str3;
                c27442o00O00Oo.f95926OooOoO0 = str4;
                c27442o00O00Oo.f95937Oooo0OO = 3;
                objOooO0oO = c27020OooOoO052.OooO0oO(str4, c27442o00O00Oo);
                if (objOooO0oO != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 3:
                str4 = (String) c27442o00O00Oo.f95926OooOoO0;
                str3 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                List list212 = (List) objOooO0oO;
                ArrayList<Page> arrayList72 = new ArrayList();
                while (r7.hasNext()) {
                }
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList72, 10));
                while (r10.hasNext()) {
                }
                c27020OooOoO0 = c27449o00O0OoO.f96039OooO0o;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO;
                c27442o00O00Oo.f95923OooOo = str3;
                c27442o00O00Oo.f95926OooOoO0 = str4;
                c27442o00O00Oo.f95925OooOoO = list212;
                c27442o00O00Oo.f95937Oooo0OO = 4;
                if (c27020OooOoO0.OooOO0(str4, arrayList, c27442o00O00Oo) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 4:
                list = c27442o00O00Oo.f95925OooOoO;
                str6 = (String) c27442o00O00Oo.f95926OooOoO0;
                str5 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO2 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                ArrayList arrayList82 = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                }
                c27020OooOoO02 = c27449o00O0OoO2.f96039OooO0o;
                setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList82);
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO2;
                c27442o00O00Oo.f95923OooOo = str5;
                c27442o00O00Oo.f95926OooOoO0 = str6;
                c27442o00O00Oo.f95925OooOoO = list;
                c27442o00O00Oo.f95937Oooo0OO = 5;
                if (c27020OooOoO02.OooO0O0(str6, setO0OO00O, c27442o00O00Oo) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 5:
                list = c27442o00O00Oo.f95925OooOoO;
                str6 = (String) c27442o00O00Oo.f95926OooOoO0;
                str5 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO2 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                C26620o00Oo00o c26620o00Oo00o2 = c27449o00O0OoO2.f96043OooOO0;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO2;
                c27442o00O00Oo.f95923OooOo = str5;
                c27442o00O00Oo.f95926OooOoO0 = str6;
                c27442o00O00Oo.f95925OooOoO = list;
                c27442o00O00Oo.f95937Oooo0OO = 6;
                C26613o00OOOoO c26613o00OOOoO2 = c26620o00Oo00o2.f91878OooO00o;
                c26613o00OOOoO2.getClass();
                objOooO00o = c26613o00OOOoO2.OooO00o(str6, new C26690oOooo0o(str5, str6, null));
                enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooO00o != enumC32485OooO00o) {
                }
                if (objOooO00o != enumC32485OooO00o) {
                }
                if (objOooO00o != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 6:
                list = c27442o00O00Oo.f95925OooOoO;
                str6 = (String) c27442o00O00Oo.f95926OooOoO0;
                str5 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO2 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                o0OO00o0.OooOo00 oooOo002 = c27449o00O0OoO2.f96045OooOO0o;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO2;
                c27442o00O00Oo.f95923OooOo = str5;
                c27442o00O00Oo.f95926OooOoO0 = str6;
                c27442o00O00Oo.f95925OooOoO = list;
                c27442o00O00Oo.f95937Oooo0OO = 7;
                C26479OooOO0o c26479OooOO0o2 = oooOo002.f91041OooO00o;
                c26479OooOO0o2.getClass();
                objOooO00o2 = c26479OooOO0o2.OooO00o(str6, new o0OO00o0.OooOO0O(str5, str6, null));
                enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooO00o2 != enumC32485OooO00o2) {
                }
                if (objOooO00o2 != enumC32485OooO00o2) {
                }
                if (objOooO00o2 != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 7:
                list = c27442o00O00Oo.f95925OooOoO;
                str6 = (String) c27442o00O00Oo.f95926OooOoO0;
                str5 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO2 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                interfaceC27292OooO0oO = c27449o00O0OoO2.f96044OooOO0O;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO2;
                c27442o00O00Oo.f95923OooOo = str5;
                c27442o00O00Oo.f95926OooOoO0 = str6;
                c27442o00O00Oo.f95925OooOoO = list;
                c27442o00O00Oo.f95937Oooo0OO = 8;
                if (interfaceC27292OooO0oO.OooO0oo(str6, str5, c27442o00O00Oo) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 8:
                list = c27442o00O00Oo.f95925OooOoO;
                str6 = (String) c27442o00O00Oo.f95926OooOoO0;
                str5 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO2 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                List list222 = list;
                ArrayList arrayList92 = new ArrayList(C34428OooOOo.OooOOoo(list222, 10));
                it2 = list222.iterator();
                while (it2.hasNext()) {
                }
                C26596o00O0o0 c26596o00O0o04 = c27449o00O0OoO2.f96047OooOOO0;
                Set setO0OO00O22 = oOo000Oo.OooOo.o0OO00O(arrayList92);
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO2;
                c27442o00O00Oo.f95923OooOo = str5;
                c27442o00O00Oo.f95926OooOoO0 = str6;
                c27442o00O00Oo.f95925OooOoO = arrayList92;
                c27442o00O00Oo.f95937Oooo0OO = 9;
                serializableOooOOO = c26596o00O0o04.OooOOO(str6, setO0OO00O22, c27442o00O00Oo);
                if (serializableOooOOO != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 9:
                list2 = c27442o00O00Oo.f95925OooOoO;
                str6 = (String) c27442o00O00Oo.f95926OooOoO0;
                str5 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO2 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                Iterable iterable2 = (Iterable) objOooO0oO;
                list3 = list2;
                arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
                str7 = str6;
                str8 = str5;
                c27449o00O0OoO3 = c27449o00O0OoO2;
                it3 = iterable2.iterator();
                if (!it3.hasNext()) {
                }
                return enumC32485OooO00o5;
            case 10:
                arrayList2 = (Collection) c27442o00O00Oo.f95930OooOooO;
                image = (Image) c27442o00O00Oo.f95928OooOoo;
                it3 = (Iterator) c27442o00O00Oo.f95929OooOoo0;
                collection = (Collection) c27442o00O00Oo.f95927OooOoOO;
                list3 = c27442o00O00Oo.f95925OooOoO;
                str7 = (String) c27442o00O00Oo.f95926OooOoO0;
                str8 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO3 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                arrayList2.add(Image.copy$default(image, null, null, (String) objOooO0oO, null, null, 0.0f, 0L, 0L, false, 507, null));
                arrayList2 = collection;
                if (!it3.hasNext()) {
                }
                return enumC32485OooO00o5;
            case 11:
                list4 = c27442o00O00Oo.f95925OooOoO;
                str9 = (String) c27442o00O00Oo.f95926OooOoO0;
                str10 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO4 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                InterfaceC27292OooO0oO interfaceC27292OooO0oO22 = c27449o00O0OoO4.f96044OooOO0O;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO4;
                c27442o00O00Oo.f95923OooOo = str10;
                c27442o00O00Oo.f95926OooOoO0 = str9;
                c27442o00O00Oo.f95925OooOoO = list4;
                c27442o00O00Oo.f95937Oooo0OO = 12;
                objOooO0oO = interfaceC27292OooO0oO22.OooO00o(str9, c27442o00O00Oo);
                break;
            case 12:
                list4 = c27442o00O00Oo.f95925OooOoO;
                str9 = (String) c27442o00O00Oo.f95926OooOoO0;
                str10 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO4 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                Iterable iterable3 = (Iterable) objOooO0oO;
                String str42 = str9;
                list5 = list4;
                arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(iterable3, 10));
                c27449o00O0OoO5 = c27449o00O0OoO4;
                str11 = str10;
                it4 = iterable3.iterator();
                str12 = str42;
                if (it4.hasNext()) {
                    AudioFile audioFile2 = (AudioFile) it4.next();
                    InterfaceC27292OooO0oO interfaceC27292OooO0oO3 = c27449o00O0OoO5.f96044OooOO0O;
                    File file2 = new File(audioFile2.getFilePath());
                    String id2 = audioFile2.getId();
                    c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO5;
                    c27442o00O00Oo.f95923OooOo = str11;
                    c27442o00O00Oo.f95926OooOoO0 = str12;
                    c27442o00O00Oo.f95925OooOoO = list5;
                    c27442o00O00Oo.f95927OooOoOO = arrayList3;
                    c27442o00O00Oo.f95929OooOoo0 = it4;
                    c27442o00O00Oo.f95928OooOoo = audioFile2;
                    c27442o00O00Oo.f95930OooOooO = arrayList3;
                    c27442o00O00Oo.f95937Oooo0OO = 13;
                    Object objOooO0oO2 = interfaceC27292OooO0oO3.OooO0oO(file2, str12, id2, c27442o00O00Oo);
                    if (objOooO0oO2 != enumC32485OooO00o5) {
                        audioFile = audioFile2;
                        str15 = str12;
                        objOooO0oO = objOooO0oO2;
                        str16 = str11;
                        collection2 = arrayList3;
                        arrayList3.add(AudioFile.copy$default(audioFile, null, (String) objOooO0oO, null, 0L, 0.0f, 0L, 0L, 125, null));
                        arrayList3 = collection2;
                        str12 = str15;
                        str11 = str16;
                        if (it4.hasNext()) {
                            InterfaceC27292OooO0oO interfaceC27292OooO0oO4 = c27449o00O0OoO5.f96044OooOO0O;
                            c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO5;
                            c27442o00O00Oo.f95923OooOo = str11;
                            c27442o00O00Oo.f95926OooOoO0 = str12;
                            c27442o00O00Oo.f95925OooOoO = list5;
                            c27442o00O00Oo.f95927OooOoOO = null;
                            c27442o00O00Oo.f95929OooOoo0 = null;
                            c27442o00O00Oo.f95928OooOoo = null;
                            c27442o00O00Oo.f95930OooOooO = null;
                            c27442o00O00Oo.f95937Oooo0OO = 14;
                            if (interfaceC27292OooO0oO4.OooOO0(str12, (List) arrayList3, c27442o00O00Oo) != enumC32485OooO00o5) {
                                list6 = list5;
                                str13 = str12;
                                str14 = str11;
                                c27449o00O0OoO6 = c27449o00O0OoO5;
                                c26515OooooO0 = c27449o00O0OoO6.f96052OooOOoo;
                                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO6;
                                c27442o00O00Oo.f95923OooOo = str14;
                                c27442o00O00Oo.f95926OooOoO0 = str13;
                                c27442o00O00Oo.f95925OooOoO = list6;
                                c27442o00O00Oo.f95937Oooo0OO = 15;
                                if (c26515OooooO0.OooOOOo(str13, str14, c27442o00O00Oo) != enumC32485OooO00o5) {
                                    interfaceC27318Oooo00o = c27449o00O0OoO6.f96055OooOo00;
                                    c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO6;
                                    c27442o00O00Oo.f95923OooOo = str14;
                                    c27442o00O00Oo.f95926OooOoO0 = str13;
                                    c27442o00O00Oo.f95925OooOoO = list6;
                                    c27442o00O00Oo.f95937Oooo0OO = 16;
                                    if (interfaceC27318Oooo00o.OooO0O0(str13, str14, c27442o00O00Oo) != enumC32485OooO00o5) {
                                        InterfaceC27309OooOoO interfaceC27309OooOoO = c27449o00O0OoO6.f96035OooO00o;
                                        c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO6;
                                        c27442o00O00Oo.f95923OooOo = str14;
                                        c27442o00O00Oo.f95926OooOoO0 = str13;
                                        c27442o00O00Oo.f95925OooOoO = list6;
                                        c27442o00O00Oo.f95937Oooo0OO = 17;
                                        objOooO0oO = interfaceC27309OooOoO.OooOO0o(str14, c27442o00O00Oo);
                                        if (objOooO0oO != enumC32485OooO00o5) {
                                            c27449o00O0OoO7 = c27449o00O0OoO6;
                                            str17 = str14;
                                            str18 = str13;
                                            list7 = list6;
                                            kotlin.jvm.internal.OooOOO0.OooO0Oo(objOooO0oO);
                                            noteContent = (NoteContent) objOooO0oO;
                                            C26515OooooO0 c26515OooooO02 = c27449o00O0OoO7.f96052OooOOoo;
                                            c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO7;
                                            c27442o00O00Oo.f95923OooOo = str17;
                                            c27442o00O00Oo.f95926OooOoO0 = str18;
                                            c27442o00O00Oo.f95925OooOoO = list7;
                                            c27442o00O00Oo.f95927OooOoOO = noteContent;
                                            c27442o00O00Oo.f95937Oooo0OO = 18;
                                            objOooO0oO = c26515OooooO02.OooOO0(str18, c27442o00O00Oo);
                                        }
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
                return enumC32485OooO00o5;
            case 13:
                arrayList3 = (Collection) c27442o00O00Oo.f95930OooOooO;
                AudioFile audioFile3 = (AudioFile) c27442o00O00Oo.f95928OooOoo;
                it4 = (Iterator) c27442o00O00Oo.f95929OooOoo0;
                collection2 = (Collection) c27442o00O00Oo.f95927OooOoOO;
                List list23 = c27442o00O00Oo.f95925OooOoO;
                str15 = (String) c27442o00O00Oo.f95926OooOoO0;
                str16 = c27442o00O00Oo.f95923OooOo;
                C27449o00O0OoO c27449o00O0OoO15 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                audioFile = audioFile3;
                list5 = list23;
                c27449o00O0OoO5 = c27449o00O0OoO15;
                arrayList3.add(AudioFile.copy$default(audioFile, null, (String) objOooO0oO, null, 0L, 0.0f, 0L, 0L, 125, null));
                arrayList3 = collection2;
                str12 = str15;
                str11 = str16;
                if (it4.hasNext()) {
                }
                return enumC32485OooO00o5;
            case 14:
                list6 = c27442o00O00Oo.f95925OooOoO;
                str13 = (String) c27442o00O00Oo.f95926OooOoO0;
                str14 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO6 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                c26515OooooO0 = c27449o00O0OoO6.f96052OooOOoo;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO6;
                c27442o00O00Oo.f95923OooOo = str14;
                c27442o00O00Oo.f95926OooOoO0 = str13;
                c27442o00O00Oo.f95925OooOoO = list6;
                c27442o00O00Oo.f95937Oooo0OO = 15;
                if (c26515OooooO0.OooOOOo(str13, str14, c27442o00O00Oo) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 15:
                list6 = c27442o00O00Oo.f95925OooOoO;
                str13 = (String) c27442o00O00Oo.f95926OooOoO0;
                str14 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO6 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                interfaceC27318Oooo00o = c27449o00O0OoO6.f96055OooOo00;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO6;
                c27442o00O00Oo.f95923OooOo = str14;
                c27442o00O00Oo.f95926OooOoO0 = str13;
                c27442o00O00Oo.f95925OooOoO = list6;
                c27442o00O00Oo.f95937Oooo0OO = 16;
                if (interfaceC27318Oooo00o.OooO0O0(str13, str14, c27442o00O00Oo) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 16:
                list6 = c27442o00O00Oo.f95925OooOoO;
                str13 = (String) c27442o00O00Oo.f95926OooOoO0;
                str14 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO6 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                InterfaceC27309OooOoO interfaceC27309OooOoO2 = c27449o00O0OoO6.f96035OooO00o;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO6;
                c27442o00O00Oo.f95923OooOo = str14;
                c27442o00O00Oo.f95926OooOoO0 = str13;
                c27442o00O00Oo.f95925OooOoO = list6;
                c27442o00O00Oo.f95937Oooo0OO = 17;
                objOooO0oO = interfaceC27309OooOoO2.OooOO0o(str14, c27442o00O00Oo);
                if (objOooO0oO != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 17:
                list6 = c27442o00O00Oo.f95925OooOoO;
                str13 = (String) c27442o00O00Oo.f95926OooOoO0;
                str14 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO6 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                c27449o00O0OoO7 = c27449o00O0OoO6;
                str17 = str14;
                str18 = str13;
                list7 = list6;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(objOooO0oO);
                noteContent = (NoteContent) objOooO0oO;
                C26515OooooO0 c26515OooooO022 = c27449o00O0OoO7.f96052OooOOoo;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO7;
                c27442o00O00Oo.f95923OooOo = str17;
                c27442o00O00Oo.f95926OooOoO0 = str18;
                c27442o00O00Oo.f95925OooOoO = list7;
                c27442o00O00Oo.f95927OooOoOO = noteContent;
                c27442o00O00Oo.f95937Oooo0OO = 18;
                objOooO0oO = c26515OooooO022.OooOO0(str18, c27442o00O00Oo);
                break;
            case 18:
                noteContent = (NoteContent) c27442o00O00Oo.f95927OooOoOO;
                list7 = c27442o00O00Oo.f95925OooOoO;
                str18 = (String) c27442o00O00Oo.f95926OooOoO0;
                str17 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO7 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                str19 = str18;
                str20 = str17;
                c27449o00O0OoO8 = c27449o00O0OoO7;
                arrayList4 = new ArrayList();
                noteContent2 = noteContent;
                list8 = list7;
                it5 = ((Iterable) objOooO0oO).iterator();
                if (!it5.hasNext()) {
                    List list24 = list8;
                    List list25 = (List) arrayList4;
                    C34406OooO00o.f123390OooO00o.OooO00o("duplicate note, refImages: " + list25, new Object[0]);
                    C26596o00O0o0 c26596o00O0o05 = c27449o00O0OoO8.f96047OooOOO0;
                    c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO8;
                    c27442o00O00Oo.f95923OooOo = str20;
                    c27442o00O00Oo.f95926OooOoO0 = str19;
                    c27442o00O00Oo.f95925OooOoO = list24;
                    c27442o00O00Oo.f95927OooOoOO = null;
                    c27442o00O00Oo.f95929OooOoo0 = null;
                    c27442o00O00Oo.f95928OooOoo = null;
                    c27442o00O00Oo.f95930OooOooO = null;
                    c27442o00O00Oo.f95931OooOooo = null;
                    c27442o00O00Oo.f95937Oooo0OO = 20;
                    if (c26596o00O0o05.OooO0O0(list25, str19, false, c27442o00O00Oo) != enumC32485OooO00o5) {
                        list9 = list24;
                        str21 = str19;
                        str22 = str20;
                        c27449o00O0OoO9 = c27449o00O0OoO8;
                        C26515OooooO0 c26515OooooO03 = c27449o00O0OoO9.f96052OooOOoo;
                        c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO9;
                        c27442o00O00Oo.f95923OooOo = str22;
                        c27442o00O00Oo.f95926OooOoO0 = str21;
                        c27442o00O00Oo.f95925OooOoO = list9;
                        c27442o00O00Oo.f95937Oooo0OO = 21;
                        C26501Oooo0oO c26501Oooo0oO = c26515OooooO03.f91177OooO0O0;
                        c26501Oooo0oO.getClass();
                        objOooO00o3 = c26501Oooo0oO.OooO00o(str21, new C26493OooOooo(str21, null));
                        enumC32485OooO00o3 = EnumC32485OooO00o.f116726OooOo0o;
                        if (objOooO00o3 != enumC32485OooO00o3) {
                            objOooO00o3 = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooO00o3 != enumC32485OooO00o3) {
                            objOooO00o3 = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooO00o3 != enumC32485OooO00o5) {
                            C26515OooooO0 c26515OooooO04 = c27449o00O0OoO9.f96052OooOOoo;
                            c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO9;
                            c27442o00O00Oo.f95923OooOo = str22;
                            c27442o00O00Oo.f95926OooOoO0 = str21;
                            c27442o00O00Oo.f95925OooOoO = list9;
                            c27442o00O00Oo.f95937Oooo0OO = 22;
                            C26691ooOO c26691ooOO = c26515OooooO04.f91176OooO00o;
                            c26691ooOO.getClass();
                            objOooO00o4 = c26691ooOO.OooO00o(str21, new C26517OooooOo(str21, null));
                            enumC32485OooO00o4 = EnumC32485OooO00o.f116726OooOo0o;
                            if (objOooO00o4 != enumC32485OooO00o4) {
                                objOooO00o4 = C32460OooOooO.f116667OooO00o;
                            }
                            if (objOooO00o4 != enumC32485OooO00o4) {
                                objOooO00o4 = C32460OooOooO.f116667OooO00o;
                            }
                            if (objOooO00o4 != enumC32485OooO00o5) {
                                String strOooO0Oo = c27449o00O0OoO9.f96037OooO0OO.OooO0Oo();
                                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO9;
                                c27442o00O00Oo.f95923OooOo = str22;
                                c27442o00O00Oo.f95926OooOoO0 = str21;
                                c27442o00O00Oo.f95925OooOoO = list9;
                                c27442o00O00Oo.f95937Oooo0OO = 23;
                                objOooO0oO = c27449o00O0OoO9.f96036OooO0O0.OooO0oo(str22, strOooO0Oo, c27442o00O00Oo);
                                if (objOooO0oO != enumC32485OooO00o5) {
                                    noteMeta = (NoteMeta) objOooO0oO;
                                    C34406OooO00o.f123390OooO00o.OooO00o("duplicate note, old note meta: " + noteMeta, new Object[0]);
                                    if (noteMeta != null || (pdfInfo = noteMeta.getPdfInfo()) == null || (id = pdfInfo.getId()) == null) {
                                        str23 = str22;
                                        c27449o00O0OoO10 = c27449o00O0OoO9;
                                        pdfInfoCopy$default = null;
                                        list10 = list9;
                                        str24 = str21;
                                        noteMeta2 = noteMeta;
                                        InterfaceC27309OooOoO interfaceC27309OooOoO3 = c27449o00O0OoO10.f96035OooO00o;
                                        c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO10;
                                        c27442o00O00Oo.f95923OooOo = str23;
                                        c27442o00O00Oo.f95926OooOoO0 = str24;
                                        c27442o00O00Oo.f95925OooOoO = list10;
                                        c27442o00O00Oo.f95927OooOoOO = noteMeta2;
                                        c27442o00O00Oo.f95929OooOoo0 = pdfInfoCopy$default;
                                        c27442o00O00Oo.f95937Oooo0OO = 26;
                                        objOooO0oO = interfaceC27309OooOoO3.OooOO0o(str24, c27442o00O00Oo);
                                        if (objOooO0oO != enumC32485OooO00o5) {
                                            pdfInfo3 = pdfInfoCopy$default;
                                            noteContent3 = (NoteContent) objOooO0oO;
                                            arrayList5 = new ArrayList();
                                            if (pdfInfo3 != null) {
                                                arrayList5.add(pdfInfo3.getPdfPath());
                                            }
                                            if (noteContent3 != null && (pages = noteContent3.getPages()) != null) {
                                                List<Page> list26 = pages;
                                                ArrayList arrayList10 = new ArrayList(C34428OooOOo.OooOOoo(list26, 10));
                                                it6 = list26.iterator();
                                                while (it6.hasNext()) {
                                                    arrayList10.add(((Page) it6.next()).getId());
                                                }
                                                ArrayList arrayList11 = new ArrayList();
                                                String str43 = str24;
                                                pdfInfo4 = pdfInfo3;
                                                it7 = arrayList10.iterator();
                                                str25 = str43;
                                                str26 = str23;
                                                c27449o00O0OoO11 = c27449o00O0OoO10;
                                                noteMeta3 = noteMeta2;
                                                collection3 = arrayList11;
                                                list11 = list10;
                                                list12 = arrayList5;
                                                if (it7.hasNext()) {
                                                    String str44 = (String) it7.next();
                                                    C27020OooOoO0 c27020OooOoO06 = c27449o00O0OoO11.f96039OooO0o;
                                                    c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO11;
                                                    c27442o00O00Oo.f95923OooOo = str26;
                                                    c27442o00O00Oo.f95926OooOoO0 = str25;
                                                    c27442o00O00Oo.f95925OooOoO = list11;
                                                    c27442o00O00Oo.f95927OooOoOO = noteMeta3;
                                                    c27442o00O00Oo.f95929OooOoo0 = pdfInfo4;
                                                    c27442o00O00Oo.f95928OooOoo = list12;
                                                    c27442o00O00Oo.f95930OooOooO = collection3;
                                                    c27442o00O00Oo.f95931OooOooo = it7;
                                                    c27442o00O00Oo.f95937Oooo0OO = 27;
                                                    objOooO0oO = c27020OooOoO06.OooO0Oo(str44, str25, c27442o00O00Oo);
                                                    break;
                                                } else {
                                                    List list27 = (List) collection3;
                                                    if (list27 != null) {
                                                        ArrayList arrayList12 = new ArrayList();
                                                        for (Object obj2 : list27) {
                                                            if (((Page) obj2).getPaperTheme() instanceof PdfPaperTheme) {
                                                                arrayList12.add(obj2);
                                                            }
                                                        }
                                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                        for (Object obj3 : arrayList12) {
                                                            PaperTheme paperTheme = ((Page) obj3).getPaperTheme();
                                                            kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme");
                                                            PdfInfo pdfInfo9 = ((PdfPaperTheme) paperTheme).getPdfInfo();
                                                            Object arrayList13 = linkedHashMap.get(pdfInfo9);
                                                            if (arrayList13 == null) {
                                                                arrayList13 = new ArrayList();
                                                                linkedHashMap.put(pdfInfo9, arrayList13);
                                                            }
                                                            ((List) arrayList13).add(obj3);
                                                        }
                                                        ArrayList arrayList14 = new ArrayList(linkedHashMap.size());
                                                        str28 = str25;
                                                        pdfInfoCopy$default2 = pdfInfo4;
                                                        it8 = linkedHashMap.entrySet().iterator();
                                                        collection4 = arrayList14;
                                                        list13 = list11;
                                                        list14 = list12;
                                                        if (it8.hasNext()) {
                                                            Map.Entry entry = (Map.Entry) it8.next();
                                                            pdfInfo5 = (PdfInfo) entry.getKey();
                                                            list15 = (List) entry.getValue();
                                                            if (pdfInfoCopy$default2 != null) {
                                                                list20 = list13;
                                                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(pdfInfo5.getId(), pdfInfoCopy$default2.getId())) {
                                                                    list17 = list15;
                                                                    pdfInfo8 = pdfInfoCopy$default2;
                                                                    collection9 = collection4;
                                                                    c26427Oooo0O0 = c27449o00O0OoO11.f96042OooO0oo;
                                                                    c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO11;
                                                                    c27442o00O00Oo.f95923OooOo = str26;
                                                                    c27442o00O00Oo.f95926OooOoO0 = str28;
                                                                    Collection collection11 = collection9;
                                                                    c27442o00O00Oo.f95925OooOoO = list20;
                                                                    c27442o00O00Oo.f95927OooOoOO = noteMeta3;
                                                                    c27442o00O00Oo.f95929OooOoo0 = pdfInfo8;
                                                                    c27442o00O00Oo.f95928OooOoo = list14;
                                                                    c27442o00O00Oo.f95930OooOooO = collection4;
                                                                    c27442o00O00Oo.f95931OooOooo = it8;
                                                                    c27442o00O00Oo.f95933Oooo000 = list17;
                                                                    c27442o00O00Oo.f95934Oooo00O = pdfInfoCopy$default2;
                                                                    c27442o00O00Oo.f95935Oooo00o = collection11;
                                                                    c27442o00O00Oo.f95937Oooo0OO = 29;
                                                                    if (c26427Oooo0O0.OooO00o(pdfInfoCopy$default2, str28, c27442o00O00Oo) != enumC32485OooO00o5) {
                                                                        list18 = list14;
                                                                        pdfInfo6 = pdfInfoCopy$default2;
                                                                        c27449o00O0OoO13 = c27449o00O0OoO11;
                                                                        list19 = list20;
                                                                        pdfInfo7 = pdfInfo8;
                                                                        noteMeta6 = noteMeta3;
                                                                        collection7 = collection4;
                                                                        collection8 = collection11;
                                                                        List list28 = list17;
                                                                        PdfInfo pdfInfo10 = pdfInfo6;
                                                                        str32 = str36;
                                                                        List list29 = list19;
                                                                        arrayList6 = new ArrayList(C34428OooOOo.OooOOoo(list28, 10));
                                                                        for (it9 = list28.iterator(); it9.hasNext(); it9 = it9) {
                                                                            Page page2 = (Page) it9.next();
                                                                            PaperTheme paperTheme2 = page2.getPaperTheme();
                                                                            kotlin.jvm.internal.OooOOO0.OooO0o0(paperTheme2, "null cannot be cast to non-null type com.orion.notein.domain.models.papertheme.PdfPaperTheme");
                                                                            ((PdfPaperTheme) paperTheme2).getPdfInfo().setPdfPath(pdfInfo10.getPdfPath());
                                                                            arrayList6.add(page2);
                                                                        }
                                                                        c27020OooOoO03 = c27449o00O0OoO13.f96039OooO0o;
                                                                        c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO13;
                                                                        c27442o00O00Oo.f95923OooOo = str26;
                                                                        c27442o00O00Oo.f95926OooOoO0 = str28;
                                                                        c27442o00O00Oo.f95925OooOoO = list29;
                                                                        c27442o00O00Oo.f95927OooOoOO = noteMeta6;
                                                                        c27442o00O00Oo.f95929OooOoo0 = pdfInfo7;
                                                                        c27442o00O00Oo.f95928OooOoo = list18;
                                                                        c27442o00O00Oo.f95930OooOooO = collection7;
                                                                        c27442o00O00Oo.f95931OooOooo = it8;
                                                                        c27442o00O00Oo.f95933Oooo000 = collection8;
                                                                        c27442o00O00Oo.f95934Oooo00O = null;
                                                                        c27442o00O00Oo.f95935Oooo00o = null;
                                                                        c27442o00O00Oo.f95937Oooo0OO = 30;
                                                                        if (c27020OooOoO03.OooOO0(str28, arrayList6, c27442o00O00Oo) != enumC32485OooO00o5) {
                                                                            PdfInfo pdfInfo11 = pdfInfo7;
                                                                            c27449o00O0OoO11 = c27449o00O0OoO13;
                                                                            pdfInfoCopy$default2 = pdfInfo11;
                                                                            list14 = list18;
                                                                            collection10 = collection7;
                                                                            list13 = list29;
                                                                            noteMeta3 = noteMeta6;
                                                                            collection8.add(C32460OooOooO.f116667OooO00o);
                                                                            collection4 = collection10;
                                                                            str36 = str32;
                                                                            if (it8.hasNext()) {
                                                                                noteMeta4 = noteMeta3;
                                                                                str27 = str28;
                                                                                str30 = str27;
                                                                                c27449o00O0OoO14 = c27449o00O0OoO11;
                                                                                NoteMeta noteMeta7 = noteMeta4;
                                                                                noteMetaCopy$default = noteMeta7 == null ? NoteMeta.copy$default(noteMeta7, str30, null, null, null, null, false, "", 0, 0, false, null, 0, 0L, 0L, null, false, true, false, 0L, 458686, null) : null;
                                                                                str33 = str30;
                                                                                C34406OooO00o.f123390OooO00o.OooO00o("duplicate note, start to create noteMeta: " + noteMetaCopy$default, new Object[0]);
                                                                                if (noteMetaCopy$default != null) {
                                                                                    InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c27449o00O0OoO14.f96036OooO0O0;
                                                                                    c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO14;
                                                                                    c27442o00O00Oo.f95923OooOo = str33;
                                                                                    r12 = 0;
                                                                                    c27442o00O00Oo.f95926OooOoO0 = null;
                                                                                    c27442o00O00Oo.f95925OooOoO = null;
                                                                                    c27442o00O00Oo.f95927OooOoOO = null;
                                                                                    c27442o00O00Oo.f95929OooOoo0 = null;
                                                                                    c27442o00O00Oo.f95928OooOoo = null;
                                                                                    c27442o00O00Oo.f95930OooOooO = null;
                                                                                    c27442o00O00Oo.f95931OooOooo = null;
                                                                                    c27442o00O00Oo.f95933Oooo000 = null;
                                                                                    c27442o00O00Oo.f95937Oooo0OO = 32;
                                                                                    if (interfaceC27313OooOoo0.OooOOO0(noteMetaCopy$default, c27442o00O00Oo) != enumC32485OooO00o5) {
                                                                                        c27442o00O00Oo.f95924OooOo0o = r12;
                                                                                        c27442o00O00Oo.f95923OooOo = r12;
                                                                                        c27442o00O00Oo.f95937Oooo0OO = 33;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                return C25261OooO0o0.OooO0O0(true);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                list20 = list13;
                                                            }
                                                            C27499o00Ooo0 c27499o00Ooo0 = c27449o00O0OoO11.f96053OooOo;
                                                            String pdfPath = pdfInfo5.getPdfPath();
                                                            c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO11;
                                                            c27442o00O00Oo.f95923OooOo = str26;
                                                            c27442o00O00Oo.f95926OooOoO0 = str28;
                                                            str29 = str26;
                                                            c27442o00O00Oo.f95925OooOoO = list20;
                                                            c27442o00O00Oo.f95927OooOoOO = noteMeta3;
                                                            c27442o00O00Oo.f95929OooOoo0 = pdfInfoCopy$default2;
                                                            c27442o00O00Oo.f95928OooOoo = list14;
                                                            c27442o00O00Oo.f95930OooOooO = collection4;
                                                            c27442o00O00Oo.f95931OooOooo = it8;
                                                            c27442o00O00Oo.f95933Oooo000 = pdfInfo5;
                                                            c27442o00O00Oo.f95934Oooo00O = list15;
                                                            c27442o00O00Oo.f95935Oooo00o = collection4;
                                                            c27442o00O00Oo.f95937Oooo0OO = 28;
                                                            objOooO0oO = c27499o00Ooo0.OooO00o(pdfPath, c27442o00O00Oo);
                                                            if (objOooO0oO != enumC32485OooO00o5) {
                                                                collection6 = collection4;
                                                                noteMeta5 = noteMeta3;
                                                                collection5 = collection6;
                                                                c27449o00O0OoO12 = c27449o00O0OoO11;
                                                                list16 = list20;
                                                                PdfInfo pdfInfo12 = pdfInfo5;
                                                                str31 = (String) objOooO0oO;
                                                                if (str31 != null) {
                                                                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                                                    c20358OooO00o2.OooOOO0(str36);
                                                                    c20358OooO00o2.OooO0OO("duplicatedNote failed, duplicate pdf failed!", new Object[0]);
                                                                    Iterator it10 = list14.iterator();
                                                                    while (it10.hasNext()) {
                                                                        File file3 = new File((String) it10.next());
                                                                        if (file3.exists()) {
                                                                            file3.delete();
                                                                        }
                                                                    }
                                                                    return C25261OooO0o0.OooO0O0(false);
                                                                }
                                                                list14.add(str31);
                                                                PdfInfo pdfInfo13 = pdfInfoCopy$default2;
                                                                pdfInfoCopy$default2 = PdfInfo.copy$default(pdfInfo12, null, str31, null, null, 13, null);
                                                                pdfInfo8 = pdfInfo13;
                                                                list17 = list15;
                                                                list20 = list16;
                                                                collection9 = collection6;
                                                                c27449o00O0OoO11 = c27449o00O0OoO12;
                                                                collection4 = collection5;
                                                                noteMeta3 = noteMeta5;
                                                                str26 = str29;
                                                                c26427Oooo0O0 = c27449o00O0OoO11.f96042OooO0oo;
                                                                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO11;
                                                                c27442o00O00Oo.f95923OooOo = str26;
                                                                c27442o00O00Oo.f95926OooOoO0 = str28;
                                                                Collection collection112 = collection9;
                                                                c27442o00O00Oo.f95925OooOoO = list20;
                                                                c27442o00O00Oo.f95927OooOoOO = noteMeta3;
                                                                c27442o00O00Oo.f95929OooOoo0 = pdfInfo8;
                                                                c27442o00O00Oo.f95928OooOoo = list14;
                                                                c27442o00O00Oo.f95930OooOooO = collection4;
                                                                c27442o00O00Oo.f95931OooOooo = it8;
                                                                c27442o00O00Oo.f95933Oooo000 = list17;
                                                                c27442o00O00Oo.f95934Oooo00O = pdfInfoCopy$default2;
                                                                c27442o00O00Oo.f95935Oooo00o = collection112;
                                                                c27442o00O00Oo.f95937Oooo0OO = 29;
                                                                if (c26427Oooo0O0.OooO00o(pdfInfoCopy$default2, str28, c27442o00O00Oo) != enumC32485OooO00o5) {
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        noteMeta2 = noteMeta3;
                                                        str24 = str25;
                                                        c27449o00O0OoO10 = c27449o00O0OoO11;
                                                    }
                                                }
                                            }
                                            noteMeta4 = noteMeta2;
                                            str27 = str24;
                                            c27449o00O0OoO11 = c27449o00O0OoO10;
                                            str30 = str27;
                                            c27449o00O0OoO14 = c27449o00O0OoO11;
                                            NoteMeta noteMeta72 = noteMeta4;
                                            if (noteMeta72 == null) {
                                            }
                                            str33 = str30;
                                            C34406OooO00o.f123390OooO00o.OooO00o("duplicate note, start to create noteMeta: " + noteMetaCopy$default, new Object[0]);
                                            if (noteMetaCopy$default != null) {
                                            }
                                            return C25261OooO0o0.OooO0O0(true);
                                        }
                                    } else {
                                        C26427Oooo0O0 c26427Oooo0O02 = c27449o00O0OoO9.f96042OooO0oo;
                                        c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO9;
                                        c27442o00O00Oo.f95923OooOo = str22;
                                        c27442o00O00Oo.f95926OooOoO0 = str21;
                                        c27442o00O00Oo.f95925OooOoO = list9;
                                        c27442o00O00Oo.f95927OooOoOO = noteMeta;
                                        c27442o00O00Oo.f95937Oooo0OO = 24;
                                        Object objOooO0OO = c26427Oooo0O02.OooO0OO(id, str22, c27442o00O00Oo);
                                        if (objOooO0OO != enumC32485OooO00o5) {
                                            str23 = str22;
                                            c27449o00O0OoO10 = c27449o00O0OoO9;
                                            list10 = list9;
                                            str24 = str21;
                                            noteMeta2 = noteMeta;
                                            objOooO0oO = objOooO0OO;
                                            pdfInfo2 = (PdfInfo) objOooO0oO;
                                            if (pdfInfo2 != null) {
                                                C27499o00Ooo0 c27499o00Ooo02 = c27449o00O0OoO10.f96053OooOo;
                                                String pdfPath2 = pdfInfo2.getPdfPath();
                                                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO10;
                                                c27442o00O00Oo.f95923OooOo = str23;
                                                c27442o00O00Oo.f95926OooOoO0 = str24;
                                                c27442o00O00Oo.f95925OooOoO = list10;
                                                c27442o00O00Oo.f95927OooOoOO = noteMeta2;
                                                c27442o00O00Oo.f95929OooOoo0 = pdfInfo2;
                                                c27442o00O00Oo.f95937Oooo0OO = 25;
                                                objOooO0oO = c27499o00Ooo02.OooO00o(pdfPath2, c27442o00O00Oo);
                                            }
                                            InterfaceC27309OooOoO interfaceC27309OooOoO32 = c27449o00O0OoO10.f96035OooO00o;
                                            c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO10;
                                            c27442o00O00Oo.f95923OooOo = str23;
                                            c27442o00O00Oo.f95926OooOoO0 = str24;
                                            c27442o00O00Oo.f95925OooOoO = list10;
                                            c27442o00O00Oo.f95927OooOoOO = noteMeta2;
                                            c27442o00O00Oo.f95929OooOoo0 = pdfInfoCopy$default;
                                            c27442o00O00Oo.f95937Oooo0OO = 26;
                                            objOooO0oO = interfaceC27309OooOoO32.OooOO0o(str24, c27442o00O00Oo);
                                            if (objOooO0oO != enumC32485OooO00o5) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                } else {
                    dualLinkRef = (DualLinkRef) it5.next();
                    item = dualLinkRef.getItem();
                    if (item != null) {
                        C26596o00O0o0 c26596o00O0o06 = c27449o00O0OoO8.f96047OooOOO0;
                        File file4 = new File(item.getUri());
                        String str45 = item.id;
                        c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO8;
                        c27442o00O00Oo.f95923OooOo = str20;
                        c27442o00O00Oo.f95926OooOoO0 = str19;
                        List list30 = list8;
                        c27442o00O00Oo.f95925OooOoO = list30;
                        c27442o00O00Oo.f95927OooOoOO = noteContent2;
                        c27442o00O00Oo.f95929OooOoo0 = arrayList4;
                        c27442o00O00Oo.f95928OooOoo = it5;
                        c27442o00O00Oo.f95930OooOooO = dualLinkRef;
                        c27442o00O00Oo.f95931OooOooo = item;
                        c27442o00O00Oo.f95937Oooo0OO = 19;
                        objOooO0oO = c26596o00O0o06.OooO0oO(file4, str19, str45, c27442o00O00Oo);
                        if (objOooO0oO != enumC32485OooO00o5) {
                            list8 = list30;
                            imageCopy$default = Image.copy$default(item, null, dualLinkRef.getPageId(), (String) objOooO0oO, noteContent2.getActivatedPageLayerId(), null, 0.0f, 0L, 0L, false, 497, null);
                            if (imageCopy$default != null) {
                                arrayList4.add(imageCopy$default);
                            }
                            if (!it5.hasNext()) {
                            }
                        }
                    } else {
                        imageCopy$default = null;
                        if (imageCopy$default != null) {
                        }
                        if (!it5.hasNext()) {
                        }
                    }
                }
                return enumC32485OooO00o5;
            case 19:
                item = (Image) c27442o00O00Oo.f95931OooOooo;
                dualLinkRef = (DualLinkRef) c27442o00O00Oo.f95930OooOooO;
                it5 = (Iterator) c27442o00O00Oo.f95928OooOoo;
                arrayList4 = (Collection) c27442o00O00Oo.f95929OooOoo0;
                noteContent2 = (NoteContent) c27442o00O00Oo.f95927OooOoOO;
                list8 = c27442o00O00Oo.f95925OooOoO;
                str19 = (String) c27442o00O00Oo.f95926OooOoO0;
                str20 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO8 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                imageCopy$default = Image.copy$default(item, null, dualLinkRef.getPageId(), (String) objOooO0oO, noteContent2.getActivatedPageLayerId(), null, 0.0f, 0L, 0L, false, 497, null);
                if (imageCopy$default != null) {
                }
                if (!it5.hasNext()) {
                }
                return enumC32485OooO00o5;
            case 20:
                list9 = c27442o00O00Oo.f95925OooOoO;
                str21 = (String) c27442o00O00Oo.f95926OooOoO0;
                str22 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO9 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                C26515OooooO0 c26515OooooO032 = c27449o00O0OoO9.f96052OooOOoo;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO9;
                c27442o00O00Oo.f95923OooOo = str22;
                c27442o00O00Oo.f95926OooOoO0 = str21;
                c27442o00O00Oo.f95925OooOoO = list9;
                c27442o00O00Oo.f95937Oooo0OO = 21;
                C26501Oooo0oO c26501Oooo0oO2 = c26515OooooO032.f91177OooO0O0;
                c26501Oooo0oO2.getClass();
                objOooO00o3 = c26501Oooo0oO2.OooO00o(str21, new C26493OooOooo(str21, null));
                enumC32485OooO00o3 = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooO00o3 != enumC32485OooO00o3) {
                }
                if (objOooO00o3 != enumC32485OooO00o3) {
                }
                if (objOooO00o3 != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 21:
                list9 = c27442o00O00Oo.f95925OooOoO;
                str21 = (String) c27442o00O00Oo.f95926OooOoO0;
                str22 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO9 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                C26515OooooO0 c26515OooooO042 = c27449o00O0OoO9.f96052OooOOoo;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO9;
                c27442o00O00Oo.f95923OooOo = str22;
                c27442o00O00Oo.f95926OooOoO0 = str21;
                c27442o00O00Oo.f95925OooOoO = list9;
                c27442o00O00Oo.f95937Oooo0OO = 22;
                C26691ooOO c26691ooOO2 = c26515OooooO042.f91176OooO00o;
                c26691ooOO2.getClass();
                objOooO00o4 = c26691ooOO2.OooO00o(str21, new C26517OooooOo(str21, null));
                enumC32485OooO00o4 = EnumC32485OooO00o.f116726OooOo0o;
                if (objOooO00o4 != enumC32485OooO00o4) {
                }
                if (objOooO00o4 != enumC32485OooO00o4) {
                }
                if (objOooO00o4 != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 22:
                list9 = c27442o00O00Oo.f95925OooOoO;
                str21 = (String) c27442o00O00Oo.f95926OooOoO0;
                str22 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO9 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                String strOooO0Oo2 = c27449o00O0OoO9.f96037OooO0OO.OooO0Oo();
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO9;
                c27442o00O00Oo.f95923OooOo = str22;
                c27442o00O00Oo.f95926OooOoO0 = str21;
                c27442o00O00Oo.f95925OooOoO = list9;
                c27442o00O00Oo.f95937Oooo0OO = 23;
                objOooO0oO = c27449o00O0OoO9.f96036OooO0O0.OooO0oo(str22, strOooO0Oo2, c27442o00O00Oo);
                if (objOooO0oO != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 23:
                list9 = c27442o00O00Oo.f95925OooOoO;
                str21 = (String) c27442o00O00Oo.f95926OooOoO0;
                str22 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO9 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                noteMeta = (NoteMeta) objOooO0oO;
                C34406OooO00o.f123390OooO00o.OooO00o("duplicate note, old note meta: " + noteMeta, new Object[0]);
                if (noteMeta != null) {
                    break;
                }
                str23 = str22;
                c27449o00O0OoO10 = c27449o00O0OoO9;
                pdfInfoCopy$default = null;
                list10 = list9;
                str24 = str21;
                noteMeta2 = noteMeta;
                InterfaceC27309OooOoO interfaceC27309OooOoO322 = c27449o00O0OoO10.f96035OooO00o;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO10;
                c27442o00O00Oo.f95923OooOo = str23;
                c27442o00O00Oo.f95926OooOoO0 = str24;
                c27442o00O00Oo.f95925OooOoO = list10;
                c27442o00O00Oo.f95927OooOoOO = noteMeta2;
                c27442o00O00Oo.f95929OooOoo0 = pdfInfoCopy$default;
                c27442o00O00Oo.f95937Oooo0OO = 26;
                objOooO0oO = interfaceC27309OooOoO322.OooOO0o(str24, c27442o00O00Oo);
                if (objOooO0oO != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 24:
                NoteMeta noteMeta8 = (NoteMeta) c27442o00O00Oo.f95927OooOoOO;
                List list31 = c27442o00O00Oo.f95925OooOoO;
                String str46 = (String) c27442o00O00Oo.f95926OooOoO0;
                String str47 = c27442o00O00Oo.f95923OooOo;
                C27449o00O0OoO c27449o00O0OoO16 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                c27449o00O0OoO10 = c27449o00O0OoO16;
                str23 = str47;
                str24 = str46;
                list10 = list31;
                noteMeta2 = noteMeta8;
                pdfInfo2 = (PdfInfo) objOooO0oO;
                if (pdfInfo2 != null) {
                }
                InterfaceC27309OooOoO interfaceC27309OooOoO3222 = c27449o00O0OoO10.f96035OooO00o;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO10;
                c27442o00O00Oo.f95923OooOo = str23;
                c27442o00O00Oo.f95926OooOoO0 = str24;
                c27442o00O00Oo.f95925OooOoO = list10;
                c27442o00O00Oo.f95927OooOoOO = noteMeta2;
                c27442o00O00Oo.f95929OooOoo0 = pdfInfoCopy$default;
                c27442o00O00Oo.f95937Oooo0OO = 26;
                objOooO0oO = interfaceC27309OooOoO3222.OooOO0o(str24, c27442o00O00Oo);
                if (objOooO0oO != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 25:
                pdfInfo2 = (PdfInfo) c27442o00O00Oo.f95929OooOoo0;
                noteMeta2 = (NoteMeta) c27442o00O00Oo.f95927OooOoOO;
                list10 = c27442o00O00Oo.f95925OooOoO;
                str24 = (String) c27442o00O00Oo.f95926OooOoO0;
                str23 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO10 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                String str48 = (String) objOooO0oO;
                C34406OooO00o.f123390OooO00o.OooO00o("duplicate pdf success, newPdfPath: " + str48 + ", oldPdfInfo: " + pdfInfo2, new Object[0]);
                pdfInfoCopy$default = (str48 == null || str48.length() == 0) ? null : PdfInfo.copy$default(pdfInfo2, null, str48, null, null, 13, null);
                InterfaceC27309OooOoO interfaceC27309OooOoO32222 = c27449o00O0OoO10.f96035OooO00o;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO10;
                c27442o00O00Oo.f95923OooOo = str23;
                c27442o00O00Oo.f95926OooOoO0 = str24;
                c27442o00O00Oo.f95925OooOoO = list10;
                c27442o00O00Oo.f95927OooOoOO = noteMeta2;
                c27442o00O00Oo.f95929OooOoo0 = pdfInfoCopy$default;
                c27442o00O00Oo.f95937Oooo0OO = 26;
                objOooO0oO = interfaceC27309OooOoO32222.OooOO0o(str24, c27442o00O00Oo);
                if (objOooO0oO != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 26:
                pdfInfo3 = (PdfInfo) c27442o00O00Oo.f95929OooOoo0;
                noteMeta2 = (NoteMeta) c27442o00O00Oo.f95927OooOoOO;
                list10 = c27442o00O00Oo.f95925OooOoO;
                str24 = (String) c27442o00O00Oo.f95926OooOoO0;
                str23 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO10 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                noteContent3 = (NoteContent) objOooO0oO;
                arrayList5 = new ArrayList();
                if (pdfInfo3 != null) {
                }
                if (noteContent3 != null) {
                    List<Page> list262 = pages;
                    ArrayList arrayList102 = new ArrayList(C34428OooOOo.OooOOoo(list262, 10));
                    it6 = list262.iterator();
                    while (it6.hasNext()) {
                    }
                    ArrayList arrayList112 = new ArrayList();
                    String str432 = str24;
                    pdfInfo4 = pdfInfo3;
                    it7 = arrayList102.iterator();
                    str25 = str432;
                    str26 = str23;
                    c27449o00O0OoO11 = c27449o00O0OoO10;
                    noteMeta3 = noteMeta2;
                    collection3 = arrayList112;
                    list11 = list10;
                    list12 = arrayList5;
                    if (it7.hasNext()) {
                    }
                }
                noteMeta4 = noteMeta2;
                str27 = str24;
                c27449o00O0OoO11 = c27449o00O0OoO10;
                str30 = str27;
                c27449o00O0OoO14 = c27449o00O0OoO11;
                NoteMeta noteMeta722 = noteMeta4;
                if (noteMeta722 == null) {
                }
                str33 = str30;
                C34406OooO00o.f123390OooO00o.OooO00o("duplicate note, start to create noteMeta: " + noteMetaCopy$default, new Object[0]);
                if (noteMetaCopy$default != null) {
                }
                return C25261OooO0o0.OooO0O0(true);
            case 27:
                it7 = (Iterator) c27442o00O00Oo.f95931OooOooo;
                collection3 = (Collection) c27442o00O00Oo.f95930OooOooO;
                list12 = (List) c27442o00O00Oo.f95928OooOoo;
                pdfInfo4 = (PdfInfo) c27442o00O00Oo.f95929OooOoo0;
                noteMeta3 = (NoteMeta) c27442o00O00Oo.f95927OooOoOO;
                list11 = c27442o00O00Oo.f95925OooOoO;
                str25 = (String) c27442o00O00Oo.f95926OooOoO0;
                str26 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO11 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                Page page3 = (Page) objOooO0oO;
                if (page3 != null) {
                    collection3.add(page3);
                }
                if (it7.hasNext()) {
                }
                break;
            case 28:
                Collection collection12 = c27442o00O00Oo.f95935Oooo00o;
                list15 = (List) c27442o00O00Oo.f95934Oooo00O;
                pdfInfo5 = (PdfInfo) c27442o00O00Oo.f95933Oooo000;
                it8 = (Iterator) c27442o00O00Oo.f95931OooOooo;
                collection5 = (Collection) c27442o00O00Oo.f95930OooOooO;
                list14 = (List) c27442o00O00Oo.f95928OooOoo;
                pdfInfoCopy$default2 = (PdfInfo) c27442o00O00Oo.f95929OooOoo0;
                noteMeta5 = (NoteMeta) c27442o00O00Oo.f95927OooOoOO;
                list16 = c27442o00O00Oo.f95925OooOoO;
                str28 = (String) c27442o00O00Oo.f95926OooOoO0;
                String str49 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO12 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                collection6 = collection12;
                str29 = str49;
                PdfInfo pdfInfo122 = pdfInfo5;
                str31 = (String) objOooO0oO;
                if (str31 != null) {
                }
                break;
            case 29:
                Collection collection13 = c27442o00O00Oo.f95935Oooo00o;
                pdfInfo6 = (PdfInfo) c27442o00O00Oo.f95934Oooo00O;
                list17 = (List) c27442o00O00Oo.f95933Oooo000;
                it8 = (Iterator) c27442o00O00Oo.f95931OooOooo;
                collection7 = (Collection) c27442o00O00Oo.f95930OooOooO;
                List list32 = (List) c27442o00O00Oo.f95928OooOoo;
                PdfInfo pdfInfo14 = (PdfInfo) c27442o00O00Oo.f95929OooOoo0;
                NoteMeta noteMeta9 = (NoteMeta) c27442o00O00Oo.f95927OooOoOO;
                List list33 = c27442o00O00Oo.f95925OooOoO;
                str28 = (String) c27442o00O00Oo.f95926OooOoO0;
                String str50 = c27442o00O00Oo.f95923OooOo;
                C27449o00O0OoO c27449o00O0OoO17 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                list18 = list32;
                noteMeta6 = noteMeta9;
                list19 = list33;
                str26 = str50;
                pdfInfo7 = pdfInfo14;
                c27449o00O0OoO13 = c27449o00O0OoO17;
                collection8 = collection13;
                List list282 = list17;
                PdfInfo pdfInfo102 = pdfInfo6;
                str32 = str36;
                List list292 = list19;
                arrayList6 = new ArrayList(C34428OooOOo.OooOOoo(list282, 10));
                while (it9.hasNext()) {
                }
                c27020OooOoO03 = c27449o00O0OoO13.f96039OooO0o;
                c27442o00O00Oo.f95924OooOo0o = c27449o00O0OoO13;
                c27442o00O00Oo.f95923OooOo = str26;
                c27442o00O00Oo.f95926OooOoO0 = str28;
                c27442o00O00Oo.f95925OooOoO = list292;
                c27442o00O00Oo.f95927OooOoOO = noteMeta6;
                c27442o00O00Oo.f95929OooOoo0 = pdfInfo7;
                c27442o00O00Oo.f95928OooOoo = list18;
                c27442o00O00Oo.f95930OooOooO = collection7;
                c27442o00O00Oo.f95931OooOooo = it8;
                c27442o00O00Oo.f95933Oooo000 = collection8;
                c27442o00O00Oo.f95934Oooo00O = null;
                c27442o00O00Oo.f95935Oooo00o = null;
                c27442o00O00Oo.f95937Oooo0OO = 30;
                if (c27020OooOoO03.OooOO0(str28, arrayList6, c27442o00O00Oo) != enumC32485OooO00o5) {
                }
                return enumC32485OooO00o5;
            case 30:
                collection8 = (Collection) c27442o00O00Oo.f95933Oooo000;
                Iterator it11 = (Iterator) c27442o00O00Oo.f95931OooOooo;
                collection10 = (Collection) c27442o00O00Oo.f95930OooOooO;
                List list34 = (List) c27442o00O00Oo.f95928OooOoo;
                PdfInfo pdfInfo15 = (PdfInfo) c27442o00O00Oo.f95929OooOoo0;
                NoteMeta noteMeta10 = (NoteMeta) c27442o00O00Oo.f95927OooOoOO;
                List list35 = c27442o00O00Oo.f95925OooOoO;
                String str51 = (String) c27442o00O00Oo.f95926OooOoO0;
                String str52 = c27442o00O00Oo.f95923OooOo;
                C27449o00O0OoO c27449o00O0OoO18 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                c27449o00O0OoO11 = c27449o00O0OoO18;
                pdfInfoCopy$default2 = pdfInfo15;
                str32 = "NoteUseCase";
                list13 = list35;
                list14 = list34;
                str26 = str52;
                noteMeta3 = noteMeta10;
                str28 = str51;
                it8 = it11;
                collection8.add(C32460OooOooO.f116667OooO00o);
                collection4 = collection10;
                str36 = str32;
                if (it8.hasNext()) {
                }
                break;
            case 31:
                noteMeta4 = (NoteMeta) c27442o00O00Oo.f95926OooOoO0;
                String str53 = c27442o00O00Oo.f95923OooOo;
                C27449o00O0OoO c27449o00O0OoO19 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                str30 = str53;
                c27449o00O0OoO14 = c27449o00O0OoO19;
                NoteMeta noteMeta7222 = noteMeta4;
                if (noteMeta7222 == null) {
                }
                str33 = str30;
                C34406OooO00o.f123390OooO00o.OooO00o("duplicate note, start to create noteMeta: " + noteMetaCopy$default, new Object[0]);
                if (noteMetaCopy$default != null) {
                }
                return C25261OooO0o0.OooO0O0(true);
            case 32:
                str33 = c27442o00O00Oo.f95923OooOo;
                c27449o00O0OoO14 = c27442o00O00Oo.f95924OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                r12 = 0;
                c27442o00O00Oo.f95924OooOo0o = r12;
                c27442o00O00Oo.f95923OooOo = r12;
                c27442o00O00Oo.f95937Oooo0OO = 33;
                break;
            case 33:
                C32446OooOOOo.OooO0O0(objOooO0oO);
                return C25261OooO0o0.OooO0O0(true);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0100, code lost:
    
        if (r13 == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOoo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00O0O00 o00o0o002;
        C27449o00O0OoO c27449o00O0OoO;
        DualLinkRef ref;
        DualLinkSource dualLinkSource;
        Object obj;
        C27449o00O0OoO c27449o00O0OoO2;
        if (abstractC32479OooO0OO instanceof o00O0O00) {
            o00o0o002 = (o00O0O00) abstractC32479OooO0OO;
            int i = o00o0o002.f95977OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o0o002.f95977OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                o00o0o002 = new o00O0O00(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = o00o0o002.f95974OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00o0o002.f95977OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO0);
            o00o0o002.f95973OooOo0o = this;
            o00o0o002.f95977OooOoo0 = 1;
            objOooOOO0 = this.f96052OooOOoo.OooOOO0(str, str2, o00o0o002);
            if (objOooOOO0 != enumC32485OooO00o) {
                c27449o00O0OoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ref = o00o0o002.f95975OooOoO0;
                dualLinkSource = (DualLinkSource) o00o0o002.f95972OooOo;
                c27449o00O0OoO = (C27449o00O0OoO) o00o0o002.f95973OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO0);
                if (((Boolean) objOooOOO0).booleanValue()) {
                    String noteId = ref.getNoteId();
                    o00o0o002.f95973OooOo0o = c27449o00O0OoO;
                    o00o0o002.f95972OooOo = dualLinkSource;
                    o00o0o002.f95975OooOoO0 = ref;
                    o00o0o002.f95977OooOoo0 = 3;
                    objOooOOO0 = c27449o00O0OoO.OooO0oo(noteId, o00o0o002);
                    if (objOooOOO0 != enumC32485OooO00o) {
                        obj = objOooOOO0;
                        DualLinkSource dualLinkSource2 = dualLinkSource;
                        c27449o00O0OoO2 = c27449o00O0OoO;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                return null;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref = (DualLinkRef) o00o0o002.f95973OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooOOO0);
                    if (((Boolean) objOooOOO0).booleanValue()) {
                        return ref;
                    }
                    return null;
                }
                ref = (DualLinkRef) o00o0o002.f95972OooOo;
                c27449o00O0OoO2 = (C27449o00O0OoO) o00o0o002.f95973OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO0);
                if (((Boolean) objOooOOO0).booleanValue()) {
                    String pageId = ref.getPageId();
                    String noteId2 = ref.getNoteId();
                    o00o0o002.f95973OooOo0o = ref;
                    o00o0o002.f95972OooOo = null;
                    o00o0o002.f95977OooOoo0 = 5;
                    objOooOOO0 = c27449o00O0OoO2.OooO(pageId, noteId2, o00o0o002);
                }
                return null;
            }
            ref = o00o0o002.f95975OooOoO0;
            dualLinkSource = (DualLinkSource) o00o0o002.f95972OooOo;
            c27449o00O0OoO = (C27449o00O0OoO) o00o0o002.f95973OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO0);
            obj = objOooOOO0;
            DualLinkSource dualLinkSource22 = dualLinkSource;
            c27449o00O0OoO2 = c27449o00O0OoO;
            if (((Boolean) obj).booleanValue()) {
                String pageId2 = dualLinkSource22.getPageId();
                String noteId3 = dualLinkSource22.getNoteId();
                o00o0o002.f95973OooOo0o = c27449o00O0OoO2;
                o00o0o002.f95972OooOo = ref;
                o00o0o002.f95975OooOoO0 = null;
                o00o0o002.f95977OooOoo0 = 4;
                objOooOOO0 = c27449o00O0OoO2.OooO(pageId2, noteId3, o00o0o002);
                if (objOooOOO0 != enumC32485OooO00o) {
                    if (((Boolean) objOooOOO0).booleanValue()) {
                    }
                }
                return enumC32485OooO00o;
            }
            return null;
        }
        C27449o00O0OoO c27449o00O0OoO3 = (C27449o00O0OoO) o00o0o002.f95973OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOO0);
        c27449o00O0OoO = c27449o00O0OoO3;
        DualLinkSource dualLinkSource3 = (DualLinkSource) objOooOOO0;
        if (dualLinkSource3 != null && (ref = dualLinkSource3.getRef()) != null) {
            String noteId4 = dualLinkSource3.getNoteId();
            o00o0o002.f95973OooOo0o = c27449o00O0OoO;
            o00o0o002.f95972OooOo = dualLinkSource3;
            o00o0o002.f95975OooOoO0 = ref;
            o00o0o002.f95977OooOoo0 = 2;
            Object objOooO0oo = c27449o00O0OoO.OooO0oo(noteId4, o00o0o002);
            if (objOooO0oo != enumC32485OooO00o) {
                objOooOOO0 = objOooO0oo;
                dualLinkSource = dualLinkSource3;
                if (((Boolean) objOooOOO0).booleanValue()) {
                }
            }
            return enumC32485OooO00o;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        oo0oOO0 oo0ooo0;
        C27449o00O0OoO c27449o00O0OoO;
        NoteMeta noteMeta;
        NoteContent noteContent;
        if (abstractC32479OooO0OO instanceof oo0oOO0) {
            oo0ooo0 = (oo0oOO0) abstractC32479OooO0OO;
            int i = oo0ooo0.f97048OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo0ooo0.f97048OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oo0ooo0 = new oo0oOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oo = oo0ooo0.f97047OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo0ooo0.f97048OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oo);
            String strOooO0Oo = this.f96037OooO0OO.OooO0Oo();
            oo0ooo0.f97045OooOo0o = this;
            oo0ooo0.f97044OooOo = str;
            oo0ooo0.f97048OooOoOO = 1;
            objOooO0oo = this.f96036OooO0O0.OooO0oo(str, strOooO0Oo, oo0ooo0);
            if (objOooO0oo != enumC32485OooO00o) {
                c27449o00O0OoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            noteMeta = (NoteMeta) oo0ooo0.f97045OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oo);
            noteContent = (NoteContent) objOooO0oo;
            if (noteContent != null) {
                return o0oOO.OooO0O0(noteMeta, noteContent);
            }
            return null;
        }
        str = oo0ooo0.f97044OooOo;
        c27449o00O0OoO = (C27449o00O0OoO) oo0ooo0.f97045OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0oo);
        NoteMeta noteMeta2 = (NoteMeta) objOooO0oo;
        if (noteMeta2 != null) {
            InterfaceC27309OooOoO interfaceC27309OooOoO = c27449o00O0OoO.f96035OooO00o;
            oo0ooo0.f97045OooOo0o = noteMeta2;
            oo0ooo0.f97044OooOo = null;
            oo0ooo0.f97048OooOoOO = 2;
            Object objOooOO0o = interfaceC27309OooOoO.OooOO0o(str, oo0ooo0);
            if (objOooOO0o != enumC32485OooO00o) {
                objOooO0oo = objOooOO0o;
                noteMeta = noteMeta2;
                noteContent = (NoteContent) objOooO0oo;
                if (noteContent != null) {
                }
            }
            return enumC32485OooO00o;
        }
        return null;
    }

    public final InterfaceC33721OooO0o<List<NoteMeta>> OooOo0(String userId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        o0OOO00o.OooO0OO oooO0OOOooO0o = this.f96036OooO0O0.OooO0o(userId);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C25252OooO0Oo.OooOo0O(oooO0OOOooO0o, ExecutorC33873OooO0O0.f122045OooOoO0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f7, code lost:
    
        if (r12 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo00(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00O0O0O o00o0o0o2;
        C27449o00O0OoO c27449o00O0OoO;
        DualLinkRef dualLinkRef;
        DualLinkSource source;
        if (abstractC32479OooO0OO instanceof o00O0O0O) {
            o00o0o0o2 = (o00O0O0O) abstractC32479OooO0OO;
            int i = o00o0o0o2.f95983OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o0o0o2.f95983OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                o00o0o0o2 = new o00O0O0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oo = o00o0o0o2.f95980OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00o0o0o2.f95983OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oo);
            o00o0o0o2.f95979OooOo0o = this;
            o00o0o0o2.f95983OooOoo0 = 1;
            objOooO0oo = this.f96052OooOOoo.OooO0oo(str, str2, o00o0o0o2);
            if (objOooO0oo != enumC32485OooO00o) {
                c27449o00O0OoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                source = o00o0o0o2.f95981OooOoO0;
                dualLinkRef = o00o0o0o2.f95978OooOo;
                c27449o00O0OoO = (C27449o00O0OoO) o00o0o0o2.f95979OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo);
                if (((Boolean) objOooO0oo).booleanValue()) {
                    String noteId = dualLinkRef.getNoteId();
                    o00o0o0o2.f95979OooOo0o = c27449o00O0OoO;
                    o00o0o0o2.f95978OooOo = dualLinkRef;
                    o00o0o0o2.f95981OooOoO0 = source;
                    o00o0o0o2.f95983OooOoo0 = 3;
                    objOooO0oo = c27449o00O0OoO.OooO0oo(noteId, o00o0o0o2);
                    if (objOooO0oo != enumC32485OooO00o) {
                        if (((Boolean) objOooO0oo).booleanValue()) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                return null;
            }
            if (i2 == 3) {
                source = o00o0o0o2.f95981OooOoO0;
                dualLinkRef = o00o0o0o2.f95978OooOo;
                c27449o00O0OoO = (C27449o00O0OoO) o00o0o0o2.f95979OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo);
                if (((Boolean) objOooO0oo).booleanValue()) {
                    String pageId = source.getPageId();
                    String noteId2 = source.getNoteId();
                    o00o0o0o2.f95979OooOo0o = c27449o00O0OoO;
                    o00o0o0o2.f95978OooOo = dualLinkRef;
                    o00o0o0o2.f95981OooOoO0 = source;
                    o00o0o0o2.f95983OooOoo0 = 4;
                    objOooO0oo = c27449o00O0OoO.OooO(pageId, noteId2, o00o0o0o2);
                    if (objOooO0oo != enumC32485OooO00o) {
                        if (((Boolean) objOooO0oo).booleanValue()) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                return null;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                source = (DualLinkSource) o00o0o0o2.f95979OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo);
                if (((Boolean) objOooO0oo).booleanValue()) {
                    return source;
                }
                return null;
            }
            source = o00o0o0o2.f95981OooOoO0;
            dualLinkRef = o00o0o0o2.f95978OooOo;
            c27449o00O0OoO = (C27449o00O0OoO) o00o0o0o2.f95979OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oo);
            if (((Boolean) objOooO0oo).booleanValue()) {
                String pageId2 = dualLinkRef.getPageId();
                String noteId3 = dualLinkRef.getNoteId();
                o00o0o0o2.f95979OooOo0o = source;
                o00o0o0o2.f95978OooOo = null;
                o00o0o0o2.f95981OooOoO0 = null;
                o00o0o0o2.f95983OooOoo0 = 5;
                objOooO0oo = c27449o00O0OoO.OooO(pageId2, noteId3, o00o0o0o2);
            }
            return null;
        }
        C27449o00O0OoO c27449o00O0OoO2 = (C27449o00O0OoO) o00o0o0o2.f95979OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0oo);
        c27449o00O0OoO = c27449o00O0OoO2;
        dualLinkRef = (DualLinkRef) objOooO0oo;
        if (dualLinkRef != null && (source = dualLinkRef.getSource()) != null) {
            String noteId4 = source.getNoteId();
            o00o0o0o2.f95979OooOo0o = c27449o00O0OoO;
            o00o0o0o2.f95978OooOo = dualLinkRef;
            o00o0o0o2.f95981OooOoO0 = source;
            o00o0o0o2.f95983OooOoo0 = 2;
            objOooO0oo = c27449o00O0OoO.OooO0oo(noteId4, o00o0o0o2);
            if (objOooO0oo != enumC32485OooO00o) {
                if (((Boolean) objOooO0oo).booleanValue()) {
                }
            }
            return enumC32485OooO00o;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo0O(NoteContent noteContent, Page page, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27446o00O0OOo c27446o00O0OOo;
        Page page2;
        Page defaultPage;
        Page page3;
        C27449o00O0OoO c27449o00O0OoO;
        String id;
        Page page4;
        String str;
        NoteContent noteContent2 = noteContent;
        if (abstractC32479OooO0OO instanceof C27446o00O0OOo) {
            c27446o00O0OOo = (C27446o00O0OOo) abstractC32479OooO0OO;
            int i = c27446o00O0OOo.f96022OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27446o00O0OOo.f96022OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27446o00O0OOo = new C27446o00O0OOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c27446o00O0OOo.f96019OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27446o00O0OOo.f96022OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
            int source = page.getSource();
            if (source == -1) {
                page2 = page;
                defaultPage = noteContent2.getDefaultPage();
                if (defaultPage == null && (id = defaultPage.getId()) != null) {
                    String id2 = noteContent2.getId();
                    c27446o00O0OOo.f96018OooOo0o = this;
                    c27446o00O0OOo.f96017OooOo = noteContent2;
                    c27446o00O0OOo.f96020OooOoO0 = page2;
                    c27446o00O0OOo.f96022OooOoo0 = 2;
                    objOooO0Oo = this.f96039OooO0o.OooO0Oo(id, id2, c27446o00O0OOo);
                    if (objOooO0Oo != enumC32485OooO00o) {
                        c27449o00O0OoO = this;
                        page3 = (Page) objOooO0Oo;
                    }
                    return enumC32485OooO00o;
                }
                page3 = null;
                c27449o00O0OoO = this;
            } else {
                if (source == 0) {
                    page4 = page;
                    c27446o00O0OOo.f96018OooOo0o = page4;
                    c27446o00O0OOo.f96017OooOo = string;
                    c27446o00O0OOo.f96022OooOoo0 = 1;
                    Object objOooOo0o = OooOo0o(noteContent2, page4, c27446o00O0OOo);
                    if (objOooOo0o != enumC32485OooO00o) {
                        str = string;
                        objOooO0Oo = objOooOo0o;
                        return Page.copy$default(page4, str, null, null, null, (PaperTheme) objOooO0Oo, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524270, null);
                    }
                    return enumC32485OooO00o;
                }
                if (source == 1) {
                    return Page.copy$default(page, string, null, null, null, page.getPaperTheme(), null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524270, null);
                }
                if (source != 2) {
                    throw new IllegalArgumentException(C21532OooOOo.OooO0OO(page.getSource(), "Unknown page source: "));
                }
                page2 = page;
                defaultPage = noteContent2.getDefaultPage();
                if (defaultPage == null) {
                }
                page3 = null;
                c27449o00O0OoO = this;
            }
        } else {
            if (i2 == 1) {
                String str2 = (String) c27446o00O0OOo.f96017OooOo;
                Page page5 = (Page) c27446o00O0OOo.f96018OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                str = str2;
                page4 = page5;
                return Page.copy$default(page4, str, null, null, null, (PaperTheme) objOooO0Oo, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524270, null);
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Page page6 = c27446o00O0OOo.f96020OooOoO0;
            NoteContent noteContent3 = (NoteContent) c27446o00O0OOo.f96017OooOo;
            c27449o00O0OoO = (C27449o00O0OoO) c27446o00O0OOo.f96018OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            page2 = page6;
            noteContent2 = noteContent3;
            page3 = (Page) objOooO0Oo;
        }
        Page page7 = page3;
        Page page8 = page2;
        if (page7 != null) {
            return Page.copy$default(page7, C24761OooO.OooO00o("toString(...)"), null, null, null, null, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524286, null);
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteUseCase");
        c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("getNextPage: Unable to find default page for note: ", noteContent2.getId()), new Object[0]);
        return Page.copy$default(page8, C24761OooO.OooO00o("toString(...)"), null, null, null, c27449o00O0OoO.f96048OooOOOO.OooOO0(page8.getPaperOrientation()), null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524270, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo0o(NoteContent noteContent, Page page, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27448o00O0Oo0 c27448o00O0Oo0;
        C27449o00O0OoO c27449o00O0OoO;
        String id;
        Page page2;
        if (abstractC32479OooO0OO instanceof C27448o00O0Oo0) {
            c27448o00O0Oo0 = (C27448o00O0Oo0) abstractC32479OooO0OO;
            int i = c27448o00O0Oo0.f96033OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27448o00O0Oo0.f96033OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27448o00O0Oo0 = new C27448o00O0Oo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c27448o00O0Oo0.f96032OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27448o00O0Oo0.f96033OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            PaperTheme paperTheme = page.getPaperTheme();
            if (paperTheme != null) {
                C34406OooO00o.f123390OooO00o.OooO00o("getPageTheme: theme is ".concat(paperTheme.getClass().getSimpleName()), new Object[0]);
            }
            page2 = null;
            if (!(paperTheme instanceof LocalResPaperTheme)) {
                if (paperTheme instanceof PdfPaperTheme) {
                    PdfInfo pdfInfo = noteContent.getPdfInfo();
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(pdfInfo != null ? pdfInfo.getPdfPath() : null, ((PdfPaperTheme) paperTheme).getPdfInfo().getPdfPath())) {
                        return this.f96048OooOOOO.OooOO0(page.getPaperOrientation());
                    }
                }
                return paperTheme;
            }
            Page defaultPage = noteContent.getDefaultPage();
            if (defaultPage == null || (id = defaultPage.getId()) == null) {
                c27449o00O0OoO = this;
                return page2 != null ? c27449o00O0OoO.f96048OooOOOO.OooOO0(page.getPaperOrientation()) : page2.getPaperTheme();
            }
            String id2 = noteContent.getId();
            c27448o00O0Oo0.f96030OooOo0o = this;
            c27448o00O0Oo0.f96029OooOo = page;
            c27448o00O0Oo0.f96033OooOoOO = 1;
            objOooO0Oo = this.f96039OooO0o.OooO0Oo(id, id2, c27448o00O0Oo0);
            if (objOooO0Oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27449o00O0OoO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            page = c27448o00O0Oo0.f96029OooOo;
            c27449o00O0OoO = c27448o00O0Oo0.f96030OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
        }
        page2 = (Page) objOooO0Oo;
        if (page2 != null) {
        }
    }

    public final InterfaceC33721OooO0o<NoteMeta> OooOoO(String noteId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        String userId = this.f96037OooO0OO.OooO0Oo();
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        return this.f96036OooO0O0.OooO0O0(noteId, userId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoO0(String str, Continuation<? super NoteContent> continuation) {
        OooO00o oooO00o;
        C27449o00O0OoO c27449o00O0OoO;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f96063OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f96063OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation, this);
            }
        }
        Object objOooOO0o = oooO00o.f96061OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f96063OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0o);
            oooO00o.f96062OooOo0o = this;
            oooO00o.f96063OooOoO = 1;
            objOooOO0o = this.f96035OooO00o.OooOO0o(str, oooO00o);
            if (objOooOO0o != enumC32485OooO00o) {
                c27449o00O0OoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOO0o);
            return (NoteContent) objOooOO0o;
        }
        c27449o00O0OoO = oooO00o.f96062OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOO0o);
        NoteContent noteContent = (NoteContent) objOooOO0o;
        if (noteContent == null) {
            return null;
        }
        oooO00o.f96062OooOo0o = null;
        oooO00o.f96063OooOoO = 2;
        objOooOO0o = c27449o00O0OoO.OooO0o(noteContent, oooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOoOO(String str, Continuation<? super NoteMeta> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f96067OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f96067OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation, this);
            }
        }
        Object objOooO0oo = oooO0O0.f96066OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0O0.f96067OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oo);
            String strOooO0Oo = this.f96037OooO0OO.OooO0Oo();
            oooO0O0.f96067OooOoO0 = 1;
            objOooO0oo = this.f96036OooO0O0.OooO0oo(str, strOooO0Oo, oooO0O0);
            if (objOooO0oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0oo);
        }
        C34406OooO00o.f123390OooO00o.OooO00o("getNoteMetaByIdSync: " + ((NoteMeta) objOooO0oo), new Object[0]);
        return objOooO0oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0 A[LOOP:0: B:36:0x00ba->B:38:0x00c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOoo(List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27558o00oOOo c27558o00oOOo;
        C27449o00O0OoO c27449o00O0OoO;
        Map map;
        if (abstractC32479OooO0OO instanceof C27558o00oOOo) {
            c27558o00oOOo = (C27558o00oOOo) abstractC32479OooO0OO;
            int i = c27558o00oOOo.f96681OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27558o00oOOo.f96681OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27558o00oOOo = new C27558o00oOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOOO = c27558o00oOOo.f96680OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27558o00oOOo.f96681OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOOO);
            String strOooO0Oo = this.f96037OooO0OO.OooO0Oo();
            c27558o00oOOo.f96678OooOo0o = this;
            c27558o00oOOo.f96677OooOo = list;
            c27558o00oOOo.f96681OooOoOO = 1;
            objOooOOOO = this.f96036OooO0O0.OooOOOO(strOooO0Oo, list, c27558o00oOOo);
            if (objOooOOOO != enumC32485OooO00o) {
                c27449o00O0OoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) c27558o00oOOo.f96678OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOOO);
            List list2 = (List) objOooOOOO;
            int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list2, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo >= 16 ? iOooO0Oo : 16);
            for (Object obj : list2) {
                linkedHashMap.put(((NoteContent) obj).getId(), obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                NoteMeta noteMeta = (NoteMeta) entry.getValue();
                NoteContent noteContent = (NoteContent) linkedHashMap.get(str);
                Note noteOooO0O0 = noteContent == null ? null : o0oOO.OooO0O0(noteMeta, noteContent);
                if (noteOooO0O0 != null) {
                    arrayList.add(noteOooO0O0);
                }
            }
            return arrayList;
        }
        list = c27558o00oOOo.f96677OooOo;
        c27449o00O0OoO = (C27449o00O0OoO) c27558o00oOOo.f96678OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOOO);
        List list3 = (List) objOooOOOO;
        int iOooO0Oo2 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list3, 10));
        if (iOooO0Oo2 < 16) {
            iOooO0Oo2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo2);
        for (Object obj2 : list3) {
            linkedHashMap2.put(((NoteMeta) obj2).getId(), obj2);
        }
        InterfaceC27309OooOoO interfaceC27309OooOoO = c27449o00O0OoO.f96035OooO00o;
        c27558o00oOOo.f96678OooOo0o = linkedHashMap2;
        c27558o00oOOo.f96677OooOo = null;
        c27558o00oOOo.f96681OooOoOO = 2;
        objOooOOOO = interfaceC27309OooOoO.OooO0oo(list, c27558o00oOOo);
        if (objOooOOOO != enumC32485OooO00o) {
            map = linkedHashMap2;
            List list22 = (List) objOooOOOO;
            int iOooO0Oo3 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list22, 10));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(iOooO0Oo3 >= 16 ? iOooO0Oo3 : 16);
            while (r12.hasNext()) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (r11.hasNext()) {
            }
            return arrayList2;
        }
        return enumC32485OooO00o;
    }

    public final InterfaceC33721OooO0o<List<NoteMeta>> OooOoo0(String str, String userId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        o0OOO00o.OooO oooOOooO0oO = this.f96036OooO0O0.OooO0oO(str, userId);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C25252OooO0Oo.OooOo0O(oooOOooO0oO, ExecutorC33873OooO0O0.f122045OooOoO0);
    }

    public final Object OooOooO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27453o00O0o(this, str, null), abstractC32479OooO0OO);
    }

    public final InterfaceC33721OooO0o OooOooo(String str) {
        C27459o00O0oOO c27459o00O0oOO = new C27459o00O0oOO(this.f96036OooO0O0.OooOo0o(str), 0);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C25252OooO0Oo.OooOo0O(c27459o00O0oOO, ExecutorC33873OooO0O0.f122045OooOoO0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e2, code lost:
    
        if (r1.OooOo0O(r4, r2) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00OOOO o00oooo2;
        String str2;
        C27449o00O0OoO c27449o00O0OoO;
        if (abstractC32479OooO0OO instanceof o00OOOO) {
            o00oooo2 = (o00OOOO) abstractC32479OooO0OO;
            int i = o00oooo2.f96211OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oooo2.f96211OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o00oooo2 = new o00OOOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o00oooo2.f96210OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00oooo2.f96211OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00oooo2.f96208OooOo0o = this;
            o00oooo2.f96207OooOo = str;
            o00oooo2.f96211OooOoOO = 1;
            Serializable serializableOooOOo0 = this.f96036OooO0O0.OooOOo0(o00oooo2);
            if (serializableOooOOo0 != enumC32485OooO00o) {
                str2 = str;
                obj = serializableOooOOo0;
                c27449o00O0OoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        String str3 = o00oooo2.f96207OooOo;
        C27449o00O0OoO c27449o00O0OoO2 = o00oooo2.f96208OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        str2 = str3;
        c27449o00O0OoO = c27449o00O0OoO2;
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = arrayList;
            arrayList2.add(NoteMeta.copy$default((NoteMeta) it.next(), null, str2, null, null, null, false, null, 0, 0, false, null, 0, 0L, 0L, null, false, false, false, 0L, 524285, null));
            arrayList = arrayList2;
        }
        InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c27449o00O0OoO.f96036OooO0O0;
        NoteMeta[] noteMetaArr = (NoteMeta[]) arrayList.toArray(new NoteMeta[0]);
        NoteMeta[] noteMetaArr2 = (NoteMeta[]) Arrays.copyOf(noteMetaArr, noteMetaArr.length);
        o00oooo2.f96208OooOo0o = null;
        o00oooo2.f96207OooOo = null;
        o00oooo2.f96211OooOoOO = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6 A[Catch: Exception -> 0x0073, LOOP:9: B:38:0x00b0->B:40:0x00b6, LOOP_END, TryCatch #4 {Exception -> 0x0073, blocks: (B:64:0x0155, B:66:0x0159, B:68:0x0166, B:69:0x017b, B:71:0x0181, B:72:0x018f, B:76:0x01a2, B:77:0x01ab, B:79:0x01b1, B:80:0x01cc, B:81:0x01e3, B:83:0x01e9, B:84:0x01fc, B:86:0x0202, B:88:0x0223, B:89:0x0227, B:101:0x026e, B:103:0x0272, B:104:0x027f, B:106:0x0285, B:108:0x02ab, B:109:0x02af, B:121:0x02e4, B:123:0x02e8, B:124:0x02f1, B:126:0x02f7, B:131:0x0310, B:134:0x031a, B:136:0x0320, B:138:0x0330, B:139:0x0335, B:129:0x030c, B:112:0x02bb, B:115:0x02c6, B:116:0x02cd, B:119:0x02de, B:92:0x0233, B:95:0x023e, B:96:0x024f, B:99:0x0268, B:140:0x0339, B:141:0x034c, B:143:0x0352, B:20:0x006f, B:34:0x0095, B:37:0x00a5, B:38:0x00b0, B:40:0x00b6, B:41:0x00c8, B:42:0x00d4, B:44:0x00da, B:46:0x00e8, B:47:0x00ec, B:48:0x00f5, B:50:0x00fb, B:52:0x0109, B:53:0x010d, B:54:0x011a, B:56:0x0120, B:57:0x0130, B:60:0x0137), top: B:165:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da A[Catch: Exception -> 0x0073, TryCatch #4 {Exception -> 0x0073, blocks: (B:64:0x0155, B:66:0x0159, B:68:0x0166, B:69:0x017b, B:71:0x0181, B:72:0x018f, B:76:0x01a2, B:77:0x01ab, B:79:0x01b1, B:80:0x01cc, B:81:0x01e3, B:83:0x01e9, B:84:0x01fc, B:86:0x0202, B:88:0x0223, B:89:0x0227, B:101:0x026e, B:103:0x0272, B:104:0x027f, B:106:0x0285, B:108:0x02ab, B:109:0x02af, B:121:0x02e4, B:123:0x02e8, B:124:0x02f1, B:126:0x02f7, B:131:0x0310, B:134:0x031a, B:136:0x0320, B:138:0x0330, B:139:0x0335, B:129:0x030c, B:112:0x02bb, B:115:0x02c6, B:116:0x02cd, B:119:0x02de, B:92:0x0233, B:95:0x023e, B:96:0x024f, B:99:0x0268, B:140:0x0339, B:141:0x034c, B:143:0x0352, B:20:0x006f, B:34:0x0095, B:37:0x00a5, B:38:0x00b0, B:40:0x00b6, B:41:0x00c8, B:42:0x00d4, B:44:0x00da, B:46:0x00e8, B:47:0x00ec, B:48:0x00f5, B:50:0x00fb, B:52:0x0109, B:53:0x010d, B:54:0x011a, B:56:0x0120, B:57:0x0130, B:60:0x0137), top: B:165:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb A[Catch: Exception -> 0x0073, TryCatch #4 {Exception -> 0x0073, blocks: (B:64:0x0155, B:66:0x0159, B:68:0x0166, B:69:0x017b, B:71:0x0181, B:72:0x018f, B:76:0x01a2, B:77:0x01ab, B:79:0x01b1, B:80:0x01cc, B:81:0x01e3, B:83:0x01e9, B:84:0x01fc, B:86:0x0202, B:88:0x0223, B:89:0x0227, B:101:0x026e, B:103:0x0272, B:104:0x027f, B:106:0x0285, B:108:0x02ab, B:109:0x02af, B:121:0x02e4, B:123:0x02e8, B:124:0x02f1, B:126:0x02f7, B:131:0x0310, B:134:0x031a, B:136:0x0320, B:138:0x0330, B:139:0x0335, B:129:0x030c, B:112:0x02bb, B:115:0x02c6, B:116:0x02cd, B:119:0x02de, B:92:0x0233, B:95:0x023e, B:96:0x024f, B:99:0x0268, B:140:0x0339, B:141:0x034c, B:143:0x0352, B:20:0x006f, B:34:0x0095, B:37:0x00a5, B:38:0x00b0, B:40:0x00b6, B:41:0x00c8, B:42:0x00d4, B:44:0x00da, B:46:0x00e8, B:47:0x00ec, B:48:0x00f5, B:50:0x00fb, B:52:0x0109, B:53:0x010d, B:54:0x011a, B:56:0x0120, B:57:0x0130, B:60:0x0137), top: B:165:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0120 A[Catch: Exception -> 0x0073, LOOP:12: B:54:0x011a->B:56:0x0120, LOOP_END, TryCatch #4 {Exception -> 0x0073, blocks: (B:64:0x0155, B:66:0x0159, B:68:0x0166, B:69:0x017b, B:71:0x0181, B:72:0x018f, B:76:0x01a2, B:77:0x01ab, B:79:0x01b1, B:80:0x01cc, B:81:0x01e3, B:83:0x01e9, B:84:0x01fc, B:86:0x0202, B:88:0x0223, B:89:0x0227, B:101:0x026e, B:103:0x0272, B:104:0x027f, B:106:0x0285, B:108:0x02ab, B:109:0x02af, B:121:0x02e4, B:123:0x02e8, B:124:0x02f1, B:126:0x02f7, B:131:0x0310, B:134:0x031a, B:136:0x0320, B:138:0x0330, B:139:0x0335, B:129:0x030c, B:112:0x02bb, B:115:0x02c6, B:116:0x02cd, B:119:0x02de, B:92:0x0233, B:95:0x023e, B:96:0x024f, B:99:0x0268, B:140:0x0339, B:141:0x034c, B:143:0x0352, B:20:0x006f, B:34:0x0095, B:37:0x00a5, B:38:0x00b0, B:40:0x00b6, B:41:0x00c8, B:42:0x00d4, B:44:0x00da, B:46:0x00e8, B:47:0x00ec, B:48:0x00f5, B:50:0x00fb, B:52:0x0109, B:53:0x010d, B:54:0x011a, B:56:0x0120, B:57:0x0130, B:60:0x0137), top: B:165:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137 A[Catch: Exception -> 0x0073, TryCatch #4 {Exception -> 0x0073, blocks: (B:64:0x0155, B:66:0x0159, B:68:0x0166, B:69:0x017b, B:71:0x0181, B:72:0x018f, B:76:0x01a2, B:77:0x01ab, B:79:0x01b1, B:80:0x01cc, B:81:0x01e3, B:83:0x01e9, B:84:0x01fc, B:86:0x0202, B:88:0x0223, B:89:0x0227, B:101:0x026e, B:103:0x0272, B:104:0x027f, B:106:0x0285, B:108:0x02ab, B:109:0x02af, B:121:0x02e4, B:123:0x02e8, B:124:0x02f1, B:126:0x02f7, B:131:0x0310, B:134:0x031a, B:136:0x0320, B:138:0x0330, B:139:0x0335, B:129:0x030c, B:112:0x02bb, B:115:0x02c6, B:116:0x02cd, B:119:0x02de, B:92:0x0233, B:95:0x023e, B:96:0x024f, B:99:0x0268, B:140:0x0339, B:141:0x034c, B:143:0x0352, B:20:0x006f, B:34:0x0095, B:37:0x00a5, B:38:0x00b0, B:40:0x00b6, B:41:0x00c8, B:42:0x00d4, B:44:0x00da, B:46:0x00e8, B:47:0x00ec, B:48:0x00f5, B:50:0x00fb, B:52:0x0109, B:53:0x010d, B:54:0x011a, B:56:0x0120, B:57:0x0130, B:60:0x0137), top: B:165:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0159 A[Catch: Exception -> 0x0073, TryCatch #4 {Exception -> 0x0073, blocks: (B:64:0x0155, B:66:0x0159, B:68:0x0166, B:69:0x017b, B:71:0x0181, B:72:0x018f, B:76:0x01a2, B:77:0x01ab, B:79:0x01b1, B:80:0x01cc, B:81:0x01e3, B:83:0x01e9, B:84:0x01fc, B:86:0x0202, B:88:0x0223, B:89:0x0227, B:101:0x026e, B:103:0x0272, B:104:0x027f, B:106:0x0285, B:108:0x02ab, B:109:0x02af, B:121:0x02e4, B:123:0x02e8, B:124:0x02f1, B:126:0x02f7, B:131:0x0310, B:134:0x031a, B:136:0x0320, B:138:0x0330, B:139:0x0335, B:129:0x030c, B:112:0x02bb, B:115:0x02c6, B:116:0x02cd, B:119:0x02de, B:92:0x0233, B:95:0x023e, B:96:0x024f, B:99:0x0268, B:140:0x0339, B:141:0x034c, B:143:0x0352, B:20:0x006f, B:34:0x0095, B:37:0x00a5, B:38:0x00b0, B:40:0x00b6, B:41:0x00c8, B:42:0x00d4, B:44:0x00da, B:46:0x00e8, B:47:0x00ec, B:48:0x00f5, B:50:0x00fb, B:52:0x0109, B:53:0x010d, B:54:0x011a, B:56:0x0120, B:57:0x0130, B:60:0x0137), top: B:165:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0166 A[Catch: Exception -> 0x0073, TryCatch #4 {Exception -> 0x0073, blocks: (B:64:0x0155, B:66:0x0159, B:68:0x0166, B:69:0x017b, B:71:0x0181, B:72:0x018f, B:76:0x01a2, B:77:0x01ab, B:79:0x01b1, B:80:0x01cc, B:81:0x01e3, B:83:0x01e9, B:84:0x01fc, B:86:0x0202, B:88:0x0223, B:89:0x0227, B:101:0x026e, B:103:0x0272, B:104:0x027f, B:106:0x0285, B:108:0x02ab, B:109:0x02af, B:121:0x02e4, B:123:0x02e8, B:124:0x02f1, B:126:0x02f7, B:131:0x0310, B:134:0x031a, B:136:0x0320, B:138:0x0330, B:139:0x0335, B:129:0x030c, B:112:0x02bb, B:115:0x02c6, B:116:0x02cd, B:119:0x02de, B:92:0x0233, B:95:0x023e, B:96:0x024f, B:99:0x0268, B:140:0x0339, B:141:0x034c, B:143:0x0352, B:20:0x006f, B:34:0x0095, B:37:0x00a5, B:38:0x00b0, B:40:0x00b6, B:41:0x00c8, B:42:0x00d4, B:44:0x00da, B:46:0x00e8, B:47:0x00ec, B:48:0x00f5, B:50:0x00fb, B:52:0x0109, B:53:0x010d, B:54:0x011a, B:56:0x0120, B:57:0x0130, B:60:0x0137), top: B:165:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v14, types: [T, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0(ArrayList arrayList, String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27466o00OO0o0 c27466o00OO0o0;
        ArrayList arrayList2;
        List list2;
        List<String> list3;
        List list4;
        C26620o00Oo00o c26620o00Oo00o;
        C27449o00O0OoO c27449o00O0OoO;
        int iOooO0Oo;
        Iterator it;
        ArrayList arrayList3;
        Iterator it2;
        List list5;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Map map;
        NoteContent noteContent;
        Object next;
        int iIntValue;
        Object next2;
        Integer num;
        String str2 = str;
        if (abstractC32479OooO0OO instanceof C27466o00OO0o0) {
            c27466o00OO0o0 = (C27466o00OO0o0) abstractC32479OooO0OO;
            int i = c27466o00OO0o0.f96172OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27466o00OO0o0.f96172OooOooo = i - Integer.MIN_VALUE;
            } else {
                c27466o00OO0o0 = new C27466o00OO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c27466o00OO0o0.f96169OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27466o00OO0o0.f96172OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            try {
                c26620o00Oo00o = this.f96043OooOO0;
                c27466o00OO0o0.f96165OooOo0o = this;
                arrayList2 = arrayList;
                try {
                    c27466o00OO0o0.f96164OooOo = arrayList2;
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                arrayList2 = arrayList;
            }
            try {
                c27466o00OO0o0.f96167OooOoO0 = str2;
                list2 = list;
            } catch (Exception e3) {
                e = e3;
                list2 = list;
                List list6 = list2;
                list3 = arrayList2;
                list4 = list6;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteUseCase");
                c20358OooO00o.OooO0Oo(e, "insertOutlinesToNote error.", new Object[0]);
                return oOo000Oo.OooOo.OooooOO(list4, list3);
            }
            try {
                c27466o00OO0o0.f96166OooOoO = list2;
                c27466o00OO0o0.f96172OooOooo = 1;
                objOooO0O0 = c26620o00Oo00o.OooO0O0(str2, c27466o00OO0o0);
                if (objOooO0O0 != enumC32485OooO00o) {
                    list3 = arrayList2;
                    list4 = list2;
                    c27449o00O0OoO = this;
                    List list7 = (List) objOooO0O0;
                    List list8 = list7;
                    iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list8, 10));
                    if (iOooO0Oo < 16) {
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                    while (r14.hasNext()) {
                    }
                    ArrayList arrayList6 = new ArrayList();
                    it = list4.iterator();
                    while (it.hasNext()) {
                    }
                    arrayList3 = new ArrayList();
                    while (r14.hasNext()) {
                    }
                    ArrayList arrayList7 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                    it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                    }
                    if (!arrayList3.isEmpty()) {
                    }
                }
                return enumC32485OooO00o;
            } catch (Exception e4) {
                e = e4;
                List list62 = list2;
                list3 = arrayList2;
                list4 = list62;
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("NoteUseCase");
                c20358OooO00o2.OooO0Oo(e, "insertOutlinesToNote error.", new Object[0]);
                return oOo000Oo.OooOo.OooooOO(list4, list3);
            }
        }
        if (i2 == 1) {
            list4 = (List) c27466o00OO0o0.f96166OooOoO;
            str2 = (String) c27466o00OO0o0.f96167OooOoO0;
            list3 = c27466o00OO0o0.f96164OooOo;
            c27449o00O0OoO = (C27449o00O0OoO) c27466o00OO0o0.f96165OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                List list72 = (List) objOooO0O0;
                List list82 = list72;
                iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list82, 10));
                if (iOooO0Oo < 16) {
                    iOooO0Oo = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo);
                for (Object obj : list82) {
                    linkedHashMap2.put(((Outline) obj).getId(), obj);
                }
                ArrayList arrayList62 = new ArrayList();
                it = list4.iterator();
                while (it.hasNext()) {
                    Outline outline = (Outline) linkedHashMap2.get((String) it.next());
                    if (outline != null) {
                        arrayList62.add(outline);
                    }
                }
                arrayList3 = new ArrayList();
                for (Object obj2 : arrayList62) {
                    if (((Outline) obj2).getParentId() == null) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList72 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList72.add(((Outline) it2.next()).getId());
                }
                if (!arrayList3.isEmpty()) {
                    return list3;
                }
                InterfaceC27309OooOoO interfaceC27309OooOoO = c27449o00O0OoO.f96035OooO00o;
                c27466o00OO0o0.f96165OooOo0o = list3;
                c27466o00OO0o0.f96164OooOo = list4;
                c27466o00OO0o0.f96167OooOoO0 = list72;
                c27466o00OO0o0.f96166OooOoO = linkedHashMap2;
                c27466o00OO0o0.f96168OooOoOO = arrayList3;
                c27466o00OO0o0.f96170OooOoo0 = arrayList72;
                c27466o00OO0o0.f96172OooOooo = 2;
                Object objOooOO0o = interfaceC27309OooOoO.OooOO0o(str2, c27466o00OO0o0);
                if (objOooOO0o != enumC32485OooO00o) {
                    list5 = list72;
                    arrayList4 = arrayList3;
                    objOooO0O0 = objOooOO0o;
                    arrayList5 = arrayList72;
                    map = linkedHashMap2;
                    noteContent = (NoteContent) objOooO0O0;
                    if (noteContent != null) {
                    }
                }
                return enumC32485OooO00o;
            } catch (Exception e5) {
                e = e5;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList5 = c27466o00OO0o0.f96170OooOoo0;
            arrayList4 = c27466o00OO0o0.f96168OooOoOO;
            Map map2 = (Map) c27466o00OO0o0.f96166OooOoO;
            list5 = (List) c27466o00OO0o0.f96167OooOoO0;
            List list9 = c27466o00OO0o0.f96164OooOo;
            List list10 = (List) c27466o00OO0o0.f96165OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                map = map2;
                list3 = list10;
                noteContent = (NoteContent) objOooO0O0;
                if (noteContent != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("NoteUseCase");
                    c20358OooO00o3.OooOO0O("insertOutlinesToNote failed, noteContent is null", new Object[0]);
                    return arrayList5;
                }
                List<Page> pages = noteContent.getPages();
                ArrayList arrayList8 = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
                Iterator<T> it3 = pages.iterator();
                while (it3.hasNext()) {
                    arrayList8.add(((Page) it3.next()).getId());
                }
                List<Outline> list11 = list5;
                int iOooO0Oo2 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list11, 10));
                final LinkedHashMap linkedHashMap3 = new LinkedHashMap(iOooO0Oo2 < 16 ? 16 : iOooO0Oo2);
                for (Outline outline2 : list11) {
                    linkedHashMap3.put(outline2.getId(), new Integer(arrayList8.indexOf(outline2.getPageId())));
                }
                InterfaceC32507OooOO0o interfaceC32507OooOO0o = new InterfaceC32507OooOO0o() { // from class: o0OOo0o.o000o0oO
                    @Override // oO0O000o.InterfaceC32507OooOO0o
                    public final Object invoke(Object obj3) {
                        String outlineId = (String) obj3;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(outlineId, "outlineId");
                        Integer num2 = (Integer) linkedHashMap3.get(outlineId);
                        return Integer.valueOf(num2 != null ? num2.intValue() : 0);
                    }
                };
                C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
                c24034Oooo00O.f80942OooOo0o = oOo000Oo.OooOo.o0ooOO0(arrayList4);
                for (String str3 : list3) {
                    Iterable iterable = (Iterable) c24034Oooo00O.f80942OooOo0o;
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj3 : iterable) {
                        if (((Number) interfaceC32507OooOO0o.invoke(((Outline) obj3).getId())).intValue() <= ((Number) interfaceC32507OooOO0o.invoke(str3)).intValue()) {
                            arrayList9.add(obj3);
                        }
                    }
                    Iterator it4 = arrayList9.iterator();
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (it4.hasNext()) {
                            int iIntValue2 = ((Number) interfaceC32507OooOO0o.invoke(((Outline) next).getId())).intValue();
                            do {
                                Object next3 = it4.next();
                                int iIntValue3 = ((Number) interfaceC32507OooOO0o.invoke(((Outline) next3).getId())).intValue();
                                if (iIntValue2 < iIntValue3) {
                                    next = next3;
                                    iIntValue2 = iIntValue3;
                                }
                            } while (it4.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    Outline outline3 = (Outline) next;
                    if (outline3 != null) {
                        Iterable iterable2 = (Iterable) c24034Oooo00O.f80942OooOo0o;
                        ArrayList arrayList10 = new ArrayList();
                        for (Object obj4 : iterable2) {
                            if (((Number) interfaceC32507OooOO0o.invoke(((Outline) obj4).getId())).intValue() == ((Number) interfaceC32507OooOO0o.invoke(outline3.getId())).intValue()) {
                                arrayList10.add(obj4);
                            }
                        }
                        Iterator it5 = arrayList10.iterator();
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            if (it5.hasNext()) {
                                long creationTime = ((Outline) next2).getCreationTime();
                                do {
                                    Object next4 = it5.next();
                                    long creationTime2 = ((Outline) next4).getCreationTime();
                                    if (creationTime < creationTime2) {
                                        next2 = next4;
                                        creationTime = creationTime2;
                                    }
                                } while (it5.hasNext());
                            }
                        } else {
                            next2 = null;
                        }
                        Outline outline4 = (Outline) next2;
                        if (outline4 != null) {
                            Iterator it6 = ((List) c24034Oooo00O.f80942OooOo0o).iterator();
                            int i3 = 0;
                            while (true) {
                                if (!it6.hasNext()) {
                                    i3 = -1;
                                    break;
                                }
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((Outline) it6.next()).getId(), outline4.getId())) {
                                    break;
                                }
                                i3++;
                            }
                            num = new Integer(i3);
                        } else {
                            num = null;
                        }
                        iIntValue = num != null ? num.intValue() : -1;
                    }
                    ?? O0ooOoO = oOo000Oo.OooOo.o0ooOoO((Collection) c24034Oooo00O.f80942OooOo0o);
                    Outline outline5 = (Outline) map.get(str3);
                    if (outline5 != null) {
                        O0ooOoO.add(iIntValue + 1, outline5);
                    }
                    c24034Oooo00O.f80942OooOo0o = O0ooOoO;
                }
                Iterable iterable3 = (Iterable) c24034Oooo00O.f80942OooOo0o;
                ArrayList arrayList11 = new ArrayList(C34428OooOOo.OooOOoo(iterable3, 10));
                Iterator it7 = iterable3.iterator();
                while (it7.hasNext()) {
                    arrayList11.add(((Outline) it7.next()).getId());
                }
                return arrayList11;
            } catch (Exception e6) {
                e = e6;
                list4 = list9;
                list3 = list10;
            }
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o22.OooOOO0("NoteUseCase");
        c20358OooO00o22.OooO0Oo(e, "insertOutlinesToNote error.", new Object[0]);
        return oOo000Oo.OooOo.OooooOO(list4, list3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo000(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27463o00O0ooo c27463o00O0ooo;
        if (abstractC32479OooO0OO instanceof C27463o00O0ooo) {
            c27463o00O0ooo = (C27463o00O0ooo) abstractC32479OooO0OO;
            int i = c27463o00O0ooo.f96124OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27463o00O0ooo.f96124OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27463o00O0ooo = new C27463o00O0ooo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = c27463o00O0ooo.f96122OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27463o00O0ooo.f96124OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO0);
            c27463o00O0ooo.f96123OooOo0o = list;
            c27463o00O0ooo.f96124OooOoO = 1;
            objOooOOO0 = this.f96055OooOo00.OooOOO0(str, list, c27463o00O0ooo);
            if (objOooOOO0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = c27463o00O0ooo.f96123OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO0);
        }
        return oOo000Oo.OooOo.o00O0O((Iterable) objOooOOO0, new C27461o00O0oo(list));
    }

    public final InterfaceC33721OooO0o Oooo00O(String noteId, Set set) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        OooO0OO oooO0OO = new OooO0OO(this.f96039OooO0o.OooO0o(noteId, set), set);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C25252OooO0Oo.OooOo0O(oooO0OO, ExecutorC33873OooO0O0.f122045OooOoO0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo00o(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27464o00OO00o c27464o00OO00o;
        if (abstractC32479OooO0OO instanceof C27464o00OO00o) {
            c27464o00OO00o = (C27464o00OO00o) abstractC32479OooO0OO;
            int i = c27464o00OO00o.f96142OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27464o00OO00o.f96142OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27464o00OO00o = new C27464o00OO00o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = c27464o00OO00o.f96140OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27464o00OO00o.f96142OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oO);
            c27464o00OO00o.f96141OooOo0o = list;
            c27464o00OO00o.f96142OooOoO = 1;
            objOooO0oO = this.f96039OooO0o.OooO0oO(str, c27464o00OO00o);
            if (objOooO0oO == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = c27464o00OO00o.f96141OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oO);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) objOooO0oO) {
            if (list.contains(((Page) obj2).getId())) {
                arrayList.add(obj2);
            }
        }
        return oOo000Oo.OooOo.o00O0O(arrayList, new o00OO00O(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0O0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27465o00OO0o c27465o00OO0o;
        C27449o00O0OoO c27449o00O0OoO;
        String str2;
        NoteMeta noteMeta;
        Note noteOooO0O0;
        if (abstractC32479OooO0OO instanceof C27465o00OO0o) {
            c27465o00OO0o = (C27465o00OO0o) abstractC32479OooO0OO;
            int i = c27465o00OO0o.f96163OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27465o00OO0o.f96163OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27465o00OO0o = new C27465o00OO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oo = c27465o00OO0o.f96160OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27465o00OO0o.f96163OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oo);
            String strOooO0Oo = this.f96037OooO0OO.OooO0Oo();
            c27465o00OO0o.f96159OooOo0o = this;
            c27465o00OO0o.f96158OooOo = str;
            c27465o00OO0o.f96163OooOoo0 = 1;
            objOooO0oo = this.f96036OooO0O0.OooO0oo(str, strOooO0Oo, c27465o00OO0o);
            if (objOooO0oo != enumC32485OooO00o) {
                c27449o00O0OoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            noteMeta = c27465o00OO0o.f96161OooOoO0;
            str2 = c27465o00OO0o.f96158OooOo;
            C32446OooOOOo.OooO0O0(objOooO0oo);
            NoteContent noteContent = (NoteContent) objOooO0oo;
            noteOooO0O0 = noteContent == null ? o0oOO.OooO0O0(noteMeta, noteContent) : null;
            if (noteOooO0O0 == null) {
                return noteOooO0O0;
            }
            str = str2;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteUseCase");
            c20358OooO00o.OooOO0O("loadNoteSync: Unable to find note by id: %s", str);
            return null;
        }
        str = c27465o00OO0o.f96158OooOo;
        c27449o00O0OoO = c27465o00OO0o.f96159OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0oo);
        NoteMeta noteMeta2 = (NoteMeta) objOooO0oo;
        if (noteMeta2 != null) {
            InterfaceC27309OooOoO interfaceC27309OooOoO = c27449o00O0OoO.f96035OooO00o;
            c27465o00OO0o.f96159OooOo0o = c27449o00O0OoO;
            c27465o00OO0o.f96158OooOo = str;
            c27465o00OO0o.f96161OooOoO0 = noteMeta2;
            c27465o00OO0o.f96163OooOoo0 = 2;
            Object objOooOO0o = interfaceC27309OooOoO.OooOO0o(str, c27465o00OO0o);
            if (objOooOO0o != enumC32485OooO00o) {
                str2 = str;
                noteMeta = noteMeta2;
                objOooO0oo = objOooOO0o;
                NoteContent noteContent2 = (NoteContent) objOooO0oo;
                if (noteContent2 == null) {
                }
                if (noteOooO0O0 == null) {
                }
            }
            return enumC32485OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("NoteUseCase");
        c20358OooO00o2.OooOO0O("loadNoteSync: Unable to find note by id: %s", str);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x056e, code lost:
    
        if (r3 == r9) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04d6 A[PHI: r0 r1 r2 r4 r5 r6 r10 r12 r15 r16 r19
      0x04d6: PHI (r0v24 java.lang.Object) = (r0v16 java.lang.Object), (r0v30 java.lang.Object) binds: [B:14:0x008e, B:114:0x04d2] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r1v18 int) = (r1v15 int), (r1v19 int) binds: [B:14:0x008e, B:114:0x04d2] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r2v25 java.util.List) = (r2v21 java.util.List), (r2v26 java.util.List) binds: [B:14:0x008e, B:114:0x04d2] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r4v31 com.orion.notein.domain.models.page.Page) = (r4v26 com.orion.notein.domain.models.page.Page), (r4v33 com.orion.notein.domain.models.page.Page) binds: [B:14:0x008e, B:114:0x04d2] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r5v22 java.util.Iterator) = (r5v18 java.util.Iterator), (r5v24 java.util.Iterator) binds: [B:14:0x008e, B:114:0x04d2] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r6v34 java.util.List) = (r6v29 java.util.List), (r6v36 java.util.List) binds: [B:14:0x008e, B:114:0x04d2] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r10v25 java.util.List) = (r10v20 java.util.List), (r10v27 java.util.List) binds: [B:14:0x008e, B:114:0x04d2] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r12v20 java.lang.String) = (r12v16 java.lang.String), (r12v21 java.lang.String) binds: [B:14:0x008e, B:114:0x04d2] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r15v15 o0OOo0o.o00O0OoO) = (r15v11 o0OOo0o.o00O0OoO), (r15v17 o0OOo0o.o00O0OoO) binds: [B:14:0x008e, B:114:0x04d2] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r16v15 int) = (r16v12 int), (r16v16 int) binds: [B:14:0x008e, B:114:0x04d2] A[DONT_GENERATE, DONT_INLINE]
      0x04d6: PHI (r19v14 int) = (r19v11 int), (r19v15 int) binds: [B:14:0x008e, B:114:0x04d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0630 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ec A[PHI: r1 r2 r3 r4 r5 r6 r10 r12 r15 r16 r17 r19
      0x03ec: PHI (r1v21 int) = (r1v12 int), (r1v22 int) binds: [B:17:0x0106, B:94:0x03e8] A[DONT_GENERATE, DONT_INLINE]
      0x03ec: PHI (r2v28 java.util.List) = (r2v15 java.util.List), (r2v29 java.util.List) binds: [B:17:0x0106, B:94:0x03e8] A[DONT_GENERATE, DONT_INLINE]
      0x03ec: PHI (r3v48 java.lang.Object) = (r3v1 java.lang.Object), (r3v66 java.lang.Object) binds: [B:17:0x0106, B:94:0x03e8] A[DONT_GENERATE, DONT_INLINE]
      0x03ec: PHI (r4v35 com.orion.notein.domain.models.page.Page) = (r4v20 com.orion.notein.domain.models.page.Page), (r4v36 com.orion.notein.domain.models.page.Page) binds: [B:17:0x0106, B:94:0x03e8] A[DONT_GENERATE, DONT_INLINE]
      0x03ec: PHI (r5v26 java.util.Iterator) = (r5v15 java.util.Iterator), (r5v27 java.util.Iterator) binds: [B:17:0x0106, B:94:0x03e8] A[DONT_GENERATE, DONT_INLINE]
      0x03ec: PHI (r6v45 java.util.List) = (r6v23 java.util.List), (r6v46 java.util.List) binds: [B:17:0x0106, B:94:0x03e8] A[DONT_GENERATE, DONT_INLINE]
      0x03ec: PHI (r10v29 java.util.List) = (r10v14 java.util.List), (r10v30 java.util.List) binds: [B:17:0x0106, B:94:0x03e8] A[DONT_GENERATE, DONT_INLINE]
      0x03ec: PHI (r12v23 java.lang.String) = (r12v10 java.lang.String), (r12v24 java.lang.String) binds: [B:17:0x0106, B:94:0x03e8] A[DONT_GENERATE, DONT_INLINE]
      0x03ec: PHI (r15v19 o0OOo0o.o00O0OoO) = (r15v8 o0OOo0o.o00O0OoO), (r15v20 o0OOo0o.o00O0OoO) binds: [B:17:0x0106, B:94:0x03e8] A[DONT_GENERATE, DONT_INLINE]
      0x03ec: PHI (r16v18 int) = (r16v9 int), (r16v19 int) binds: [B:17:0x0106, B:94:0x03e8] A[DONT_GENERATE, DONT_INLINE]
      0x03ec: PHI (r17v16 int) = (r17v9 int), (r17v17 int) binds: [B:17:0x0106, B:94:0x03e8] A[DONT_GENERATE, DONT_INLINE]
      0x03ec: PHI (r19v17 int) = (r19v8 int), (r19v18 int) binds: [B:17:0x0106, B:94:0x03e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0425 A[PHI: r1 r2 r3 r4 r5 r6 r10 r12 r15 r16 r17 r19
      0x0425: PHI (r1v20 int) = (r1v13 int), (r1v21 int) binds: [B:16:0x00df, B:97:0x0421] A[DONT_GENERATE, DONT_INLINE]
      0x0425: PHI (r2v27 java.util.List) = (r2v17 java.util.List), (r2v28 java.util.List) binds: [B:16:0x00df, B:97:0x0421] A[DONT_GENERATE, DONT_INLINE]
      0x0425: PHI (r3v33 java.lang.Object) = (r3v1 java.lang.Object), (r3v58 java.lang.Object) binds: [B:16:0x00df, B:97:0x0421] A[DONT_GENERATE, DONT_INLINE]
      0x0425: PHI (r4v34 com.orion.notein.domain.models.page.Page) = (r4v22 com.orion.notein.domain.models.page.Page), (r4v35 com.orion.notein.domain.models.page.Page) binds: [B:16:0x00df, B:97:0x0421] A[DONT_GENERATE, DONT_INLINE]
      0x0425: PHI (r5v25 java.util.Iterator) = (r5v16 java.util.Iterator), (r5v26 java.util.Iterator) binds: [B:16:0x00df, B:97:0x0421] A[DONT_GENERATE, DONT_INLINE]
      0x0425: PHI (r6v37 java.util.List) = (r6v25 java.util.List), (r6v45 java.util.List) binds: [B:16:0x00df, B:97:0x0421] A[DONT_GENERATE, DONT_INLINE]
      0x0425: PHI (r10v28 java.util.List) = (r10v16 java.util.List), (r10v29 java.util.List) binds: [B:16:0x00df, B:97:0x0421] A[DONT_GENERATE, DONT_INLINE]
      0x0425: PHI (r12v22 java.lang.String) = (r12v12 java.lang.String), (r12v23 java.lang.String) binds: [B:16:0x00df, B:97:0x0421] A[DONT_GENERATE, DONT_INLINE]
      0x0425: PHI (r15v18 o0OOo0o.o00O0OoO) = (r15v9 o0OOo0o.o00O0OoO), (r15v19 o0OOo0o.o00O0OoO) binds: [B:16:0x00df, B:97:0x0421] A[DONT_GENERATE, DONT_INLINE]
      0x0425: PHI (r16v17 int) = (r16v10 int), (r16v18 int) binds: [B:16:0x00df, B:97:0x0421] A[DONT_GENERATE, DONT_INLINE]
      0x0425: PHI (r17v15 int) = (r17v10 int), (r17v16 int) binds: [B:16:0x00df, B:97:0x0421] A[DONT_GENERATE, DONT_INLINE]
      0x0425: PHI (r19v16 int) = (r19v9 int), (r19v17 int) binds: [B:16:0x00df, B:97:0x0421] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x053e -> B:132:0x0578). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x056e -> B:131:0x0571). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0284 -> B:56:0x0285). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x033d -> B:165:0x067a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0359 -> B:133:0x0580). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0OO(int i, String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27467o00OO0oO c27467o00OO0oO;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        List list2;
        Object objOooOO0o;
        C27449o00O0OoO c27449o00O0OoO;
        NoteContent noteContent;
        int i7;
        int i8;
        String str2;
        int i9;
        List list3;
        Collection arrayList;
        int i10;
        C27449o00O0OoO c27449o00O0OoO2;
        List list4;
        String str3;
        Iterator it;
        int i11;
        Iterator it2;
        int i12;
        List list5;
        int i13;
        Collection collection;
        Page page;
        C32443OooOOO<Integer, Integer> unrotatedPageSize;
        List arrayList2;
        Page page2;
        Object objOooO0o;
        List list6;
        Object objOooO0o2;
        Page page3;
        C27449o00O0OoO c27449o00O0OoO3;
        Iterator it3;
        List list7;
        List list8;
        Object objOooO0o3;
        Iterator it4;
        Iterator it5;
        List list9;
        INoteinDisplayItem iNoteinDisplayItemDeepCopy;
        List<LayeredDisplayItems> displayItemsIfSet;
        ArrayList arrayList3;
        int i14;
        oO0O00oo.OooO oooO;
        int i15;
        List<INoteinDisplayItem> items;
        oO0O00oo.OooO oooO2;
        Page page4;
        int i16;
        Iterator it6;
        Iterator it7;
        int i17;
        int i18 = i;
        String str4 = str;
        int i19 = 1;
        if (abstractC32479OooO0OO instanceof C27467o00OO0oO) {
            c27467o00OO0oO = (C27467o00OO0oO) abstractC32479OooO0OO;
            int i20 = c27467o00OO0oO.f96182Oooo0;
            if ((i20 & Integer.MIN_VALUE) != 0) {
                c27467o00OO0oO.f96182Oooo0 = i20 - Integer.MIN_VALUE;
            } else {
                c27467o00OO0oO = new C27467o00OO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c27467o00OO0oO.f96184Oooo00O;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i21 = c27467o00OO0oO.f96182Oooo0;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        int i22 = 0;
        switch (i21) {
            case 0:
                i2 = 16;
                i3 = 8;
                i4 = 4;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                i5 = (i18 & 8) != 0 ? 1 : 0;
                i6 = (i18 & 16) != 0 ? 1 : 0;
                c27467o00OO0oO.f96174OooOo0o = this;
                list2 = list;
                c27467o00OO0oO.f96173OooOo = list2;
                c27467o00OO0oO.f96176OooOoO0 = str4;
                c27467o00OO0oO.f96180OooOooO = i18;
                c27467o00OO0oO.f96181OooOooo = i5;
                c27467o00OO0oO.f96183Oooo000 = i6;
                c27467o00OO0oO.f96182Oooo0 = 1;
                objOooOO0o = this.f96035OooO00o.OooOO0o(str4, c27467o00OO0oO);
                if (objOooOO0o != enumC32485OooO00o) {
                    c27449o00O0OoO = this;
                    noteContent = (NoteContent) objOooOO0o;
                    if (noteContent != null) {
                        return c34434OooOoO;
                    }
                    List<String> pageLayerIds = noteContent.getPageLayerIds();
                    c27467o00OO0oO.f96174OooOo0o = c27449o00O0OoO;
                    c27467o00OO0oO.f96173OooOo = list2;
                    c27467o00OO0oO.f96176OooOoO0 = str4;
                    c27467o00OO0oO.f96180OooOooO = i18;
                    c27467o00OO0oO.f96181OooOooo = i5;
                    c27467o00OO0oO.f96183Oooo000 = i6;
                    c27467o00OO0oO.f96182Oooo0 = 2;
                    Object objOooo000 = c27449o00O0OoO.Oooo000(str4, pageLayerIds, c27467o00OO0oO);
                    if (objOooo000 != enumC32485OooO00o) {
                        int i23 = i6;
                        i7 = i18;
                        i8 = i23;
                        List list10 = list2;
                        str2 = str4;
                        i9 = i5;
                        objOooO0Oo = objOooo000;
                        list3 = list10;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : (Iterable) objOooO0Oo) {
                            PageLayer pageLayer = (PageLayer) obj;
                            if (i9 != 0 || pageLayer.getVisible()) {
                                arrayList4.add(obj);
                            }
                        }
                        List list11 = list3;
                        int i24 = i7;
                        arrayList = new ArrayList(C34428OooOOo.OooOOoo(list11, 10));
                        i10 = i24;
                        c27449o00O0OoO2 = c27449o00O0OoO;
                        list4 = arrayList4;
                        str3 = str2;
                        it = list11.iterator();
                        if (!it.hasNext()) {
                            String str5 = (String) it.next();
                            C27020OooOoO0 c27020OooOoO0 = c27449o00O0OoO2.f96039OooO0o;
                            c27467o00OO0oO.f96174OooOo0o = c27449o00O0OoO2;
                            c27467o00OO0oO.f96173OooOo = str3;
                            c27467o00OO0oO.f96176OooOoO0 = list4;
                            i13 = i19;
                            c27467o00OO0oO.f96175OooOoO = arrayList;
                            c27467o00OO0oO.f96177OooOoOO = it;
                            c27467o00OO0oO.f96179OooOoo0 = arrayList;
                            c27467o00OO0oO.f96180OooOooO = i10;
                            c27467o00OO0oO.f96181OooOooo = i8;
                            c27467o00OO0oO.f96182Oooo0 = 3;
                            objOooO0Oo = c27020OooOoO0.OooO0Oo(str5, str3, c27467o00OO0oO);
                            if (objOooO0Oo != enumC32485OooO00o) {
                                collection = arrayList;
                                page = (Page) objOooO0Oo;
                                if (page == null) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o.OooOOO0("NoteUseCase");
                                    c20358OooO00o.OooO0OO("Unable to find page by id", new Object[i22]);
                                }
                                if (i8 == 0 && page != null && (unrotatedPageSize = page.getUnrotatedPageSize()) != null) {
                                    int iIntValue = unrotatedPageSize.f116638OooOo0o.intValue();
                                    int iIntValue2 = unrotatedPageSize.f116637OooOo.intValue();
                                    Rect unrotatedPaperPadding = page.getUnrotatedPaperPadding();
                                    int i25 = (iIntValue - unrotatedPaperPadding.left) - unrotatedPaperPadding.right;
                                    int i26 = (iIntValue2 - unrotatedPaperPadding.top) - unrotatedPaperPadding.bottom;
                                    if (page.getOrientation() != PaperOrientation.VERTICAL) {
                                        page.setPaperSpec(PaperSpec.copy$default(page.getPaperSpec(), null, null, false, i25, i26, null, null, 0, 0, 487, null));
                                    } else {
                                        page.setPaperSpec(PaperSpec.copy$default(page.getPaperSpec(), null, null, false, i26, i25, null, null, 0, 0, 487, null));
                                    }
                                    page.setOriginPaperPadding(new Rect());
                                }
                                arrayList.add(page);
                                arrayList = collection;
                                i19 = i13;
                                i22 = 0;
                                if (!it.hasNext()) {
                                    i11 = i19;
                                    List list12 = (List) arrayList;
                                    it2 = list12.iterator();
                                    i12 = i10;
                                    list5 = list12;
                                    if (!it2.hasNext()) {
                                        int iOooO0o = Oooo0.o000000O.OooO0o(i11);
                                        oO0O00oo.OooO oooOOooOO0 = C34429OooOOo0.OooOO0(list5);
                                        int i27 = 0;
                                        while (i27 < oooOOooOO0.f116811OooOo) {
                                            Page page5 = (Page) oOo000Oo.OooOo.OoooO00(i27, list5);
                                            if (page5 == null) {
                                                i14 = iOooO0o;
                                                oooO = oooOOooOO0;
                                                i15 = i11;
                                            } else {
                                                Page page6 = (Page) oOo000Oo.OooOo.OoooO00(i27 + 1, list5);
                                                if (page6 == null || (displayItemsIfSet = page6.getDisplayItemsIfSet()) == null) {
                                                    i14 = iOooO0o;
                                                    oooO = oooOOooOO0;
                                                    i15 = 1;
                                                } else {
                                                    List<LayeredDisplayItems> list13 = displayItemsIfSet;
                                                    int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list13, 10));
                                                    int i28 = i2;
                                                    if (iOooO0Oo < i28) {
                                                        iOooO0Oo = i28;
                                                    }
                                                    LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                                                    for (Object obj2 : list13) {
                                                        linkedHashMap.put(((LayeredDisplayItems) obj2).getLayer().getId(), obj2);
                                                    }
                                                    List<LayeredDisplayItems> displayItemsIfSet2 = page5.getDisplayItemsIfSet();
                                                    if (displayItemsIfSet2 != null) {
                                                        List<LayeredDisplayItems> list14 = displayItemsIfSet2;
                                                        arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list14, 10));
                                                        for (LayeredDisplayItems layeredDisplayItemsCopy$default : list14) {
                                                            String id = layeredDisplayItemsCopy$default.getLayer().getId();
                                                            List<INoteinDisplayItem> items2 = layeredDisplayItemsCopy$default.getItems();
                                                            if (linkedHashMap.containsKey(id)) {
                                                                LayeredDisplayItems layeredDisplayItems = (LayeredDisplayItems) linkedHashMap.get(id);
                                                                if (layeredDisplayItems == null || (items = layeredDisplayItems.getItems()) == null) {
                                                                    items = c34434OooOoO;
                                                                }
                                                                o0oo000O.OooOO0.f111232OooO00o.getClass();
                                                                ArrayList arrayListOooO0o0 = o0oo000O.OooOO0.OooO0o0(page6, items);
                                                                ArrayList<INoteinDisplayItem> arrayList5 = new ArrayList();
                                                                for (Object obj3 : arrayListOooO0o0) {
                                                                    oO0O00oo.OooO oooO3 = oooOOooOO0;
                                                                    Page page7 = page6;
                                                                    if (((INoteinDisplayItem) obj3).getBoundingBox(1.0f).top < (-iOooO0o)) {
                                                                        arrayList5.add(obj3);
                                                                    }
                                                                    oooOOooOO0 = oooO3;
                                                                    page6 = page7;
                                                                }
                                                                oooO2 = oooOOooOO0;
                                                                page4 = page6;
                                                                c27449o00O0OoO2.getClass();
                                                                C32443OooOOO<Integer, Integer> rotatedPageSize = page5.getRotatedPageSize();
                                                                Size size = new Size(rotatedPageSize.f116638OooOo0o.intValue(), rotatedPageSize.f116637OooOo.intValue());
                                                                C32443OooOOO<Integer, Integer> rotatedPageSize2 = page4.getRotatedPageSize();
                                                                PointF pointF = new PointF((size.getWidth() - new Size(rotatedPageSize2.f116638OooOo0o.intValue(), rotatedPageSize2.f116637OooOo.intValue()).getWidth()) / 2.0f, size.getHeight() + iOooO0o);
                                                                Iterator it8 = arrayList5.iterator();
                                                                while (it8.hasNext()) {
                                                                    ((INoteinDisplayItem) it8.next()).offset(pointF.x, pointF.y);
                                                                    iOooO0o = iOooO0o;
                                                                }
                                                                i16 = iOooO0o;
                                                                List<INoteinDisplayItem> list15 = items2;
                                                                o0oo000O.OooOO0.f111232OooO00o.getClass();
                                                                Rect rotatedPaperPadding = page5.getRotatedPaperPadding();
                                                                if (rotatedPaperPadding.left != 0 || rotatedPaperPadding.top != 0) {
                                                                    Iterator it9 = arrayList5.iterator();
                                                                    while (it9.hasNext()) {
                                                                        ((INoteinDisplayItem) it9.next()).offset(-rotatedPaperPadding.left, -rotatedPaperPadding.top);
                                                                    }
                                                                }
                                                                if (page5.getRotationDirection() != Page.RotationDirection.ROTATION_0) {
                                                                    Size sizeOooOO0o = o0oo000O.OooOO0.OooOO0o(page5);
                                                                    Page.RotationDirection rotationDirectionInversePageRotationDirection = page5.inversePageRotationDirection();
                                                                    Matrix matrixOooOO0O = o0oo000O.OooOO0.OooOO0O(rotationDirectionInversePageRotationDirection, sizeOooOO0o.getWidth(), sizeOooOO0o.getHeight());
                                                                    for (INoteinDisplayItem iNoteinDisplayItem : arrayList5) {
                                                                        o0oo000O.OooOO0.f111232OooO00o.getClass();
                                                                        o0oo000O.OooOO0.OooOOOO(iNoteinDisplayItem, rotationDirectionInversePageRotationDirection, matrixOooOO0O);
                                                                    }
                                                                }
                                                                layeredDisplayItemsCopy$default = LayeredDisplayItems.copy$default(layeredDisplayItemsCopy$default, null, oOo000Oo.OooOo.OooooOO(list15, arrayList5), 1, null);
                                                            } else {
                                                                i16 = iOooO0o;
                                                                oooO2 = oooOOooOO0;
                                                                page4 = page6;
                                                            }
                                                            arrayList3.add(layeredDisplayItemsCopy$default);
                                                            oooOOooOO0 = oooO2;
                                                            page6 = page4;
                                                            iOooO0o = i16;
                                                        }
                                                    } else {
                                                        arrayList3 = null;
                                                    }
                                                    i14 = iOooO0o;
                                                    oooO = oooOOooOO0;
                                                    i15 = 1;
                                                    page5.setDisplayItemsIfSet(arrayList3);
                                                    i27 += i15;
                                                    iOooO0o = i14;
                                                    i11 = i15;
                                                    i2 = 16;
                                                    oooOOooOO0 = oooO;
                                                }
                                            }
                                            i27 += i15;
                                            iOooO0o = i14;
                                            i11 = i15;
                                            i2 = 16;
                                            oooOOooOO0 = oooO;
                                        }
                                        return oOo000Oo.OooOo.Oooo0o0(list5);
                                    }
                                    page2 = (Page) it2.next();
                                    if (page2 != null) {
                                        if ((i12 & 1) == 0) {
                                            page2.setPaperTheme(c27449o00O0OoO2.f96048OooOOOO.OooO0oO(page2.getPaperOrientation()));
                                        }
                                        arrayList2 = new ArrayList();
                                        if ((i12 & 4) != 0) {
                                            String id2 = page2.getId();
                                            c27467o00OO0oO.f96174OooOo0o = c27449o00O0OoO2;
                                            c27467o00OO0oO.f96173OooOo = str3;
                                            c27467o00OO0oO.f96176OooOoO0 = list4;
                                            c27467o00OO0oO.f96175OooOoO = list5;
                                            c27467o00OO0oO.f96177OooOoOO = it2;
                                            c27467o00OO0oO.f96179OooOoo0 = page2;
                                            c27467o00OO0oO.f96178OooOoo = arrayList2;
                                            c27467o00OO0oO.f96180OooOooO = i12;
                                            c27467o00OO0oO.f96182Oooo0 = i4;
                                            c27449o00O0OoO2.getClass();
                                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00OO0(id2, str3, null, c27449o00O0OoO2), c27467o00OO0oO);
                                            if (objOooO0o != enumC32485OooO00o) {
                                                ArrayList arrayList6 = new ArrayList();
                                                for (Object obj4 : (Iterable) objOooO0o) {
                                                    DrawRecord record = ((Stroke) obj4).getRecord();
                                                    if (record == null || record.getPenType() != 11) {
                                                        arrayList6.add(obj4);
                                                    }
                                                }
                                                arrayList2.addAll(arrayList6);
                                                String id3 = page2.getId();
                                                c27467o00OO0oO.f96174OooOo0o = c27449o00O0OoO2;
                                                c27467o00OO0oO.f96173OooOo = str3;
                                                c27467o00OO0oO.f96176OooOoO0 = list4;
                                                c27467o00OO0oO.f96175OooOoO = list5;
                                                c27467o00OO0oO.f96177OooOoOO = it2;
                                                c27467o00OO0oO.f96179OooOoo0 = page2;
                                                c27467o00OO0oO.f96178OooOoo = arrayList2;
                                                c27467o00OO0oO.f96180OooOooO = i12;
                                                c27467o00OO0oO.f96182Oooo0 = 5;
                                                c27449o00O0OoO2.getClass();
                                                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                                                objOooO0Oo = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O0OO(id3, str3, null, c27449o00O0OoO2), c27467o00OO0oO);
                                                if (objOooO0Oo != enumC32485OooO00o) {
                                                    arrayList2.addAll((List) objOooO0Oo);
                                                    String id4 = page2.getId();
                                                    c27467o00OO0oO.f96174OooOo0o = c27449o00O0OoO2;
                                                    c27467o00OO0oO.f96173OooOo = str3;
                                                    c27467o00OO0oO.f96176OooOoO0 = list4;
                                                    c27467o00OO0oO.f96175OooOoO = list5;
                                                    c27467o00OO0oO.f96177OooOoOO = it2;
                                                    c27467o00OO0oO.f96179OooOoo0 = page2;
                                                    c27467o00OO0oO.f96178OooOoo = arrayList2;
                                                    c27467o00OO0oO.f96180OooOooO = i12;
                                                    c27467o00OO0oO.f96182Oooo0 = 6;
                                                    c27449o00O0OoO2.getClass();
                                                    C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                                                    objOooO0Oo = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O0O0(id4, str3, null, c27449o00O0OoO2), c27467o00OO0oO);
                                                    if (objOooO0Oo != enumC32485OooO00o) {
                                                        ArrayList arrayList7 = new ArrayList();
                                                        it4 = ((Iterable) objOooO0Oo).iterator();
                                                        while (it4.hasNext()) {
                                                            DualLinkRef dualLinkRef = (DualLinkRef) it4.next();
                                                            Image item = dualLinkRef.getItem();
                                                            if (item != null) {
                                                                it5 = it4;
                                                                list9 = list5;
                                                                iNoteinDisplayItemDeepCopy = item.deepCopy(item.id, dualLinkRef.getLayerId(), dualLinkRef.creationTime);
                                                            } else {
                                                                it5 = it4;
                                                                list9 = list5;
                                                                iNoteinDisplayItemDeepCopy = null;
                                                            }
                                                            if (iNoteinDisplayItemDeepCopy != null) {
                                                                arrayList7.add(iNoteinDisplayItemDeepCopy);
                                                            }
                                                            it4 = it5;
                                                            list5 = list9;
                                                        }
                                                        List list16 = list5;
                                                        arrayList2.addAll(arrayList7);
                                                        String id5 = page2.getId();
                                                        c27467o00OO0oO.f96174OooOo0o = c27449o00O0OoO2;
                                                        c27467o00OO0oO.f96173OooOo = str3;
                                                        c27467o00OO0oO.f96176OooOoO0 = list4;
                                                        c27467o00OO0oO.f96175OooOoO = list16;
                                                        c27467o00OO0oO.f96177OooOoOO = it2;
                                                        c27467o00OO0oO.f96179OooOoo0 = page2;
                                                        c27467o00OO0oO.f96178OooOoo = arrayList2;
                                                        c27467o00OO0oO.f96180OooOooO = i12;
                                                        c27467o00OO0oO.f96182Oooo0 = 7;
                                                        c27449o00O0OoO2.getClass();
                                                        C33874OooO0OO c33874OooO0OO4 = C33649OoooOOo.f121328OooO00o;
                                                        objOooO0Oo = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00OO0O(id5, str3, null, c27449o00O0OoO2), c27467o00OO0oO);
                                                        if (objOooO0Oo != enumC32485OooO00o) {
                                                            list6 = list16;
                                                            arrayList2.addAll((List) objOooO0Oo);
                                                            String id6 = page2.getId();
                                                            c27467o00OO0oO.f96174OooOo0o = c27449o00O0OoO2;
                                                            c27467o00OO0oO.f96173OooOo = str3;
                                                            c27467o00OO0oO.f96176OooOoO0 = list4;
                                                            c27467o00OO0oO.f96175OooOoO = list6;
                                                            c27467o00OO0oO.f96177OooOoOO = it2;
                                                            c27467o00OO0oO.f96179OooOoo0 = page2;
                                                            c27467o00OO0oO.f96178OooOoo = arrayList2;
                                                            c27467o00OO0oO.f96180OooOooO = i12;
                                                            c27467o00OO0oO.f96182Oooo0 = i3;
                                                            c27449o00O0OoO2.getClass();
                                                            C33874OooO0OO c33874OooO0OO5 = C33649OoooOOo.f121328OooO00o;
                                                            objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27460o00O0oOo(id6, str3, null, c27449o00O0OoO2), c27467o00OO0oO);
                                                            if (objOooO0o2 != enumC32485OooO00o) {
                                                                ArrayList arrayList8 = new ArrayList();
                                                                for (Object obj5 : (Iterable) objOooO0o2) {
                                                                    if (!((Shape) obj5).getTapeLike()) {
                                                                        arrayList8.add(obj5);
                                                                    }
                                                                }
                                                                arrayList2.addAll(arrayList8);
                                                                String id7 = page2.getId();
                                                                c27467o00OO0oO.f96174OooOo0o = c27449o00O0OoO2;
                                                                c27467o00OO0oO.f96173OooOo = str3;
                                                                c27467o00OO0oO.f96176OooOoO0 = list4;
                                                                c27467o00OO0oO.f96175OooOoO = list6;
                                                                c27467o00OO0oO.f96177OooOoOO = it2;
                                                                c27467o00OO0oO.f96179OooOoo0 = page2;
                                                                c27467o00OO0oO.f96178OooOoo = arrayList2;
                                                                c27467o00OO0oO.f96180OooOooO = i12;
                                                                c27467o00OO0oO.f96182Oooo0 = 9;
                                                                c27449o00O0OoO2.getClass();
                                                                C33874OooO0OO c33874OooO0OO6 = C33649OoooOOo.f121328OooO00o;
                                                                objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O0OO0(id7, str3, null, c27449o00O0OoO2), c27467o00OO0oO);
                                                                if (objOooO0o3 != enumC32485OooO00o) {
                                                                    List list17 = list4;
                                                                    page3 = page2;
                                                                    c27449o00O0OoO3 = c27449o00O0OoO2;
                                                                    it3 = it2;
                                                                    list7 = list6;
                                                                    list8 = list17;
                                                                    arrayList2.addAll((List) objOooO0o3);
                                                                    if ((i12 & 1) != 0) {
                                                                        String id8 = page3.getId();
                                                                        c27467o00OO0oO.f96174OooOo0o = c27449o00O0OoO3;
                                                                        c27467o00OO0oO.f96173OooOo = str3;
                                                                        c27467o00OO0oO.f96176OooOoO0 = list8;
                                                                        c27467o00OO0oO.f96175OooOoO = list7;
                                                                        c27467o00OO0oO.f96177OooOoOO = it3;
                                                                        c27467o00OO0oO.f96179OooOoo0 = page3;
                                                                        c27467o00OO0oO.f96178OooOoo = arrayList2;
                                                                        c27467o00OO0oO.f96180OooOooO = i12;
                                                                        c27467o00OO0oO.f96182Oooo0 = 10;
                                                                        C27994OooOOOO c27994OooOOOO = c27449o00O0OoO3.f96058OooOoO;
                                                                        C33874OooO0OO c33874OooO0OO7 = C33649OoooOOo.f121328OooO00o;
                                                                        objOooO0Oo = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27988OooO0oo(c27994OooOOOO, id8, str3, null), c27467o00OO0oO);
                                                                    }
                                                                    Iterator it10 = it3;
                                                                    c27449o00O0OoO2 = c27449o00O0OoO3;
                                                                    page2 = page3;
                                                                    list4 = list8;
                                                                    list5 = list7;
                                                                    it2 = it10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        String str6 = str3;
                                        if (arrayList2.size() > i11) {
                                            C34431OooOo0.OooOooO(arrayList2, new C27468o00OO0oo());
                                        }
                                        List list18 = list4;
                                        ArrayList arrayList9 = new ArrayList(C34428OooOOo.OooOOoo(list18, 10));
                                        it6 = list18.iterator();
                                        while (it6.hasNext()) {
                                            PageLayer pageLayer2 = (PageLayer) it6.next();
                                            ArrayList arrayList10 = new ArrayList();
                                            for (Object obj6 : arrayList2) {
                                                Iterator it11 = it6;
                                                int i29 = i12;
                                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((INoteinDisplayItem) obj6).getLayerId(), pageLayer2.getId())) {
                                                    arrayList10.add(obj6);
                                                }
                                                it6 = it11;
                                                i12 = i29;
                                            }
                                            arrayList9.add(new LayeredDisplayItems(pageLayer2, arrayList10));
                                            it6 = it6;
                                        }
                                        int i30 = i12;
                                        PageLayer pageLayer3 = new PageLayer("none", str6, true, null, null, 16, null);
                                        it7 = arrayList9.iterator();
                                        i17 = 0;
                                        while (true) {
                                            if (!it7.hasNext()) {
                                                i17 = -1;
                                            } else if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((LayeredDisplayItems) it7.next()).getLayer().getId(), LayerInfo.PAPER_THEME_LAYER_ID)) {
                                                i17++;
                                            }
                                        }
                                        if (i17 == -1) {
                                            page2.setDisplayItemsIfSet(arrayList9);
                                            i11 = 1;
                                        } else {
                                            ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(arrayList9);
                                            ArrayList arrayList11 = new ArrayList();
                                            for (Object obj7 : arrayList2) {
                                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((INoteinDisplayItem) obj7).getLayerId(), pageLayer3.getId())) {
                                                    arrayList11.add(obj7);
                                                }
                                            }
                                            i11 = 1;
                                            arrayListO0ooOoO.add(i17 + 1, new LayeredDisplayItems(pageLayer3, arrayList11));
                                            page2.setDisplayItemsIfSet(arrayListO0ooOoO);
                                        }
                                        i12 = i30;
                                        str3 = str6;
                                    }
                                    i3 = 8;
                                    i4 = 4;
                                    if (!it2.hasNext()) {
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                i2 = 16;
                i3 = 8;
                i4 = 4;
                int i31 = c27467o00OO0oO.f96183Oooo000;
                int i32 = c27467o00OO0oO.f96181OooOooo;
                int i33 = c27467o00OO0oO.f96180OooOooO;
                String str7 = (String) c27467o00OO0oO.f96176OooOoO0;
                List list19 = (List) c27467o00OO0oO.f96173OooOo;
                c27449o00O0OoO = c27467o00OO0oO.f96174OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                i6 = i31;
                i18 = i33;
                i5 = i32;
                str4 = str7;
                list2 = list19;
                objOooOO0o = objOooO0Oo;
                noteContent = (NoteContent) objOooOO0o;
                if (noteContent != null) {
                }
                break;
            case 2:
                i2 = 16;
                i3 = 8;
                i4 = 4;
                i8 = c27467o00OO0oO.f96183Oooo000;
                i9 = c27467o00OO0oO.f96181OooOooo;
                i7 = c27467o00OO0oO.f96180OooOooO;
                str2 = (String) c27467o00OO0oO.f96176OooOoO0;
                list3 = (List) c27467o00OO0oO.f96173OooOo;
                c27449o00O0OoO = c27467o00OO0oO.f96174OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                ArrayList arrayList42 = new ArrayList();
                while (r3.hasNext()) {
                }
                List list112 = list3;
                int i242 = i7;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list112, 10));
                i10 = i242;
                c27449o00O0OoO2 = c27449o00O0OoO;
                list4 = arrayList42;
                str3 = str2;
                it = list112.iterator();
                if (!it.hasNext()) {
                }
                break;
            case 3:
                i2 = 16;
                i3 = 8;
                i4 = 4;
                i8 = c27467o00OO0oO.f96181OooOooo;
                i10 = c27467o00OO0oO.f96180OooOooO;
                arrayList = (Collection) c27467o00OO0oO.f96179OooOoo0;
                it = c27467o00OO0oO.f96177OooOoOO;
                collection = c27467o00OO0oO.f96175OooOoO;
                list4 = (List) c27467o00OO0oO.f96176OooOoO0;
                str3 = (String) c27467o00OO0oO.f96173OooOo;
                c27449o00O0OoO2 = c27467o00OO0oO.f96174OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                i13 = 1;
                page = (Page) objOooO0Oo;
                if (page == null) {
                }
                if (i8 == 0) {
                    int iIntValue3 = unrotatedPageSize.f116638OooOo0o.intValue();
                    int iIntValue22 = unrotatedPageSize.f116637OooOo.intValue();
                    Rect unrotatedPaperPadding2 = page.getUnrotatedPaperPadding();
                    int i252 = (iIntValue3 - unrotatedPaperPadding2.left) - unrotatedPaperPadding2.right;
                    int i262 = (iIntValue22 - unrotatedPaperPadding2.top) - unrotatedPaperPadding2.bottom;
                    if (page.getOrientation() != PaperOrientation.VERTICAL) {
                    }
                    page.setOriginPaperPadding(new Rect());
                }
                arrayList.add(page);
                arrayList = collection;
                i19 = i13;
                i22 = 0;
                if (!it.hasNext()) {
                }
                break;
            case 4:
                i2 = 16;
                i3 = 8;
                i12 = c27467o00OO0oO.f96180OooOooO;
                arrayList2 = c27467o00OO0oO.f96178OooOoo;
                page2 = (Page) c27467o00OO0oO.f96179OooOoo0;
                it2 = c27467o00OO0oO.f96177OooOoOO;
                list5 = (List) c27467o00OO0oO.f96175OooOoO;
                list4 = (List) c27467o00OO0oO.f96176OooOoO0;
                str3 = (String) c27467o00OO0oO.f96173OooOo;
                c27449o00O0OoO2 = c27467o00OO0oO.f96174OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                objOooO0o = objOooO0Oo;
                i11 = 1;
                ArrayList arrayList62 = new ArrayList();
                while (r0.hasNext()) {
                }
                arrayList2.addAll(arrayList62);
                String id32 = page2.getId();
                c27467o00OO0oO.f96174OooOo0o = c27449o00O0OoO2;
                c27467o00OO0oO.f96173OooOo = str3;
                c27467o00OO0oO.f96176OooOoO0 = list4;
                c27467o00OO0oO.f96175OooOoO = list5;
                c27467o00OO0oO.f96177OooOoOO = it2;
                c27467o00OO0oO.f96179OooOoo0 = page2;
                c27467o00OO0oO.f96178OooOoo = arrayList2;
                c27467o00OO0oO.f96180OooOooO = i12;
                c27467o00OO0oO.f96182Oooo0 = 5;
                c27449o00O0OoO2.getClass();
                C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
                objOooO0Oo = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O0OO(id32, str3, null, c27449o00O0OoO2), c27467o00OO0oO);
                if (objOooO0Oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                i2 = 16;
                i3 = 8;
                i12 = c27467o00OO0oO.f96180OooOooO;
                arrayList2 = c27467o00OO0oO.f96178OooOoo;
                page2 = (Page) c27467o00OO0oO.f96179OooOoo0;
                it2 = c27467o00OO0oO.f96177OooOoOO;
                list5 = (List) c27467o00OO0oO.f96175OooOoO;
                list4 = (List) c27467o00OO0oO.f96176OooOoO0;
                str3 = (String) c27467o00OO0oO.f96173OooOo;
                c27449o00O0OoO2 = c27467o00OO0oO.f96174OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                i11 = 1;
                arrayList2.addAll((List) objOooO0Oo);
                String id42 = page2.getId();
                c27467o00OO0oO.f96174OooOo0o = c27449o00O0OoO2;
                c27467o00OO0oO.f96173OooOo = str3;
                c27467o00OO0oO.f96176OooOoO0 = list4;
                c27467o00OO0oO.f96175OooOoO = list5;
                c27467o00OO0oO.f96177OooOoOO = it2;
                c27467o00OO0oO.f96179OooOoo0 = page2;
                c27467o00OO0oO.f96178OooOoo = arrayList2;
                c27467o00OO0oO.f96180OooOooO = i12;
                c27467o00OO0oO.f96182Oooo0 = 6;
                c27449o00O0OoO2.getClass();
                C33874OooO0OO c33874OooO0OO32 = C33649OoooOOo.f121328OooO00o;
                objOooO0Oo = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O0O0(id42, str3, null, c27449o00O0OoO2), c27467o00OO0oO);
                if (objOooO0Oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 6:
                i2 = 16;
                i3 = 8;
                i12 = c27467o00OO0oO.f96180OooOooO;
                arrayList2 = c27467o00OO0oO.f96178OooOoo;
                page2 = (Page) c27467o00OO0oO.f96179OooOoo0;
                it2 = c27467o00OO0oO.f96177OooOoOO;
                list5 = (List) c27467o00OO0oO.f96175OooOoO;
                list4 = (List) c27467o00OO0oO.f96176OooOoO0;
                str3 = (String) c27467o00OO0oO.f96173OooOo;
                c27449o00O0OoO2 = c27467o00OO0oO.f96174OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                i11 = 1;
                ArrayList arrayList72 = new ArrayList();
                it4 = ((Iterable) objOooO0Oo).iterator();
                while (it4.hasNext()) {
                }
                List list162 = list5;
                arrayList2.addAll(arrayList72);
                String id52 = page2.getId();
                c27467o00OO0oO.f96174OooOo0o = c27449o00O0OoO2;
                c27467o00OO0oO.f96173OooOo = str3;
                c27467o00OO0oO.f96176OooOoO0 = list4;
                c27467o00OO0oO.f96175OooOoO = list162;
                c27467o00OO0oO.f96177OooOoOO = it2;
                c27467o00OO0oO.f96179OooOoo0 = page2;
                c27467o00OO0oO.f96178OooOoo = arrayList2;
                c27467o00OO0oO.f96180OooOooO = i12;
                c27467o00OO0oO.f96182Oooo0 = 7;
                c27449o00O0OoO2.getClass();
                C33874OooO0OO c33874OooO0OO42 = C33649OoooOOo.f121328OooO00o;
                objOooO0Oo = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00OO0O(id52, str3, null, c27449o00O0OoO2), c27467o00OO0oO);
                if (objOooO0Oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 7:
                i2 = 16;
                i3 = 8;
                i12 = c27467o00OO0oO.f96180OooOooO;
                arrayList2 = c27467o00OO0oO.f96178OooOoo;
                page2 = (Page) c27467o00OO0oO.f96179OooOoo0;
                it2 = c27467o00OO0oO.f96177OooOoOO;
                list6 = (List) c27467o00OO0oO.f96175OooOoO;
                list4 = (List) c27467o00OO0oO.f96176OooOoO0;
                str3 = (String) c27467o00OO0oO.f96173OooOo;
                c27449o00O0OoO2 = c27467o00OO0oO.f96174OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                i11 = 1;
                arrayList2.addAll((List) objOooO0Oo);
                String id62 = page2.getId();
                c27467o00OO0oO.f96174OooOo0o = c27449o00O0OoO2;
                c27467o00OO0oO.f96173OooOo = str3;
                c27467o00OO0oO.f96176OooOoO0 = list4;
                c27467o00OO0oO.f96175OooOoO = list6;
                c27467o00OO0oO.f96177OooOoOO = it2;
                c27467o00OO0oO.f96179OooOoo0 = page2;
                c27467o00OO0oO.f96178OooOoo = arrayList2;
                c27467o00OO0oO.f96180OooOooO = i12;
                c27467o00OO0oO.f96182Oooo0 = i3;
                c27449o00O0OoO2.getClass();
                C33874OooO0OO c33874OooO0OO52 = C33649OoooOOo.f121328OooO00o;
                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27460o00O0oOo(id62, str3, null, c27449o00O0OoO2), c27467o00OO0oO);
                if (objOooO0o2 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 8:
                i2 = 16;
                i12 = c27467o00OO0oO.f96180OooOooO;
                arrayList2 = c27467o00OO0oO.f96178OooOoo;
                page2 = (Page) c27467o00OO0oO.f96179OooOoo0;
                it2 = c27467o00OO0oO.f96177OooOoOO;
                list6 = (List) c27467o00OO0oO.f96175OooOoO;
                list4 = (List) c27467o00OO0oO.f96176OooOoO0;
                str3 = (String) c27467o00OO0oO.f96173OooOo;
                c27449o00O0OoO2 = c27467o00OO0oO.f96174OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                objOooO0o2 = objOooO0Oo;
                i11 = 1;
                ArrayList arrayList82 = new ArrayList();
                while (r0.hasNext()) {
                }
                arrayList2.addAll(arrayList82);
                String id72 = page2.getId();
                c27467o00OO0oO.f96174OooOo0o = c27449o00O0OoO2;
                c27467o00OO0oO.f96173OooOo = str3;
                c27467o00OO0oO.f96176OooOoO0 = list4;
                c27467o00OO0oO.f96175OooOoO = list6;
                c27467o00OO0oO.f96177OooOoOO = it2;
                c27467o00OO0oO.f96179OooOoo0 = page2;
                c27467o00OO0oO.f96178OooOoo = arrayList2;
                c27467o00OO0oO.f96180OooOooO = i12;
                c27467o00OO0oO.f96182Oooo0 = 9;
                c27449o00O0OoO2.getClass();
                C33874OooO0OO c33874OooO0OO62 = C33649OoooOOo.f121328OooO00o;
                objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O0OO0(id72, str3, null, c27449o00O0OoO2), c27467o00OO0oO);
                if (objOooO0o3 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 9:
                i2 = 16;
                i12 = c27467o00OO0oO.f96180OooOooO;
                arrayList2 = c27467o00OO0oO.f96178OooOoo;
                Page page8 = (Page) c27467o00OO0oO.f96179OooOoo0;
                Iterator it12 = c27467o00OO0oO.f96177OooOoOO;
                List list20 = (List) c27467o00OO0oO.f96175OooOoO;
                List list21 = (List) c27467o00OO0oO.f96176OooOoO0;
                str3 = (String) c27467o00OO0oO.f96173OooOo;
                C27449o00O0OoO c27449o00O0OoO4 = c27467o00OO0oO.f96174OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                page3 = page8;
                c27449o00O0OoO3 = c27449o00O0OoO4;
                it3 = it12;
                list7 = list20;
                list8 = list21;
                objOooO0o3 = objOooO0Oo;
                i11 = 1;
                arrayList2.addAll((List) objOooO0o3);
                if ((i12 & 1) != 0) {
                }
                Iterator it102 = it3;
                c27449o00O0OoO2 = c27449o00O0OoO3;
                page2 = page3;
                list4 = list8;
                list5 = list7;
                it2 = it102;
                String str62 = str3;
                if (arrayList2.size() > i11) {
                }
                List list182 = list4;
                ArrayList arrayList92 = new ArrayList(C34428OooOOo.OooOOoo(list182, 10));
                it6 = list182.iterator();
                while (it6.hasNext()) {
                }
                int i302 = i12;
                PageLayer pageLayer32 = new PageLayer("none", str62, true, null, null, 16, null);
                it7 = arrayList92.iterator();
                i17 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                    }
                    i17++;
                }
                if (i17 == -1) {
                }
                i12 = i302;
                str3 = str62;
                i3 = 8;
                i4 = 4;
                if (!it2.hasNext()) {
                }
                break;
            case 10:
                i12 = c27467o00OO0oO.f96180OooOooO;
                arrayList2 = c27467o00OO0oO.f96178OooOoo;
                page3 = (Page) c27467o00OO0oO.f96179OooOoo0;
                it3 = c27467o00OO0oO.f96177OooOoOO;
                i2 = 16;
                list7 = (List) c27467o00OO0oO.f96175OooOoO;
                list8 = (List) c27467o00OO0oO.f96176OooOoO0;
                str3 = (String) c27467o00OO0oO.f96173OooOo;
                c27449o00O0OoO3 = c27467o00OO0oO.f96174OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                i11 = 1;
                arrayList2.addAll((List) objOooO0Oo);
                Iterator it1022 = it3;
                c27449o00O0OoO2 = c27449o00O0OoO3;
                page2 = page3;
                list4 = list8;
                list5 = list7;
                it2 = it1022;
                String str622 = str3;
                if (arrayList2.size() > i11) {
                }
                List list1822 = list4;
                ArrayList arrayList922 = new ArrayList(C34428OooOOo.OooOOoo(list1822, 10));
                it6 = list1822.iterator();
                while (it6.hasNext()) {
                }
                int i3022 = i12;
                PageLayer pageLayer322 = new PageLayer("none", str622, true, null, null, 16, null);
                it7 = arrayList922.iterator();
                i17 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                    }
                    i17++;
                }
                if (i17 == -1) {
                }
                i12 = i3022;
                str3 = str622;
                i3 = 8;
                i4 = 4;
                if (!it2.hasNext()) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x011d, code lost:
    
        if (r2.OooO(r5, r3) != r4) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0o(NoteMeta noteMeta, Folder folder, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        oo0O oo0o;
        NoteMeta noteMeta2;
        C27449o00O0OoO c27449o00O0OoO;
        C27449o00O0OoO c27449o00O0OoO2;
        NoteMeta noteMeta3;
        C27585o00ooO0 c27585o00ooO0;
        String parentId;
        Folder folder2;
        Object obj;
        C27449o00O0OoO c27449o00O0OoO3;
        Folder folder3 = folder;
        if (abstractC32479OooO0OO instanceof oo0O) {
            oo0o = (oo0O) abstractC32479OooO0OO;
            int i = oo0o.f97031OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo0o.f97031OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                oo0o = new oo0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = oo0o.f97028OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo0o.f97031OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            String id = folder3 != null ? folder3.getId() : null;
            oo0o.f97027OooOo0o = this;
            noteMeta2 = noteMeta;
            oo0o.f97026OooOo = noteMeta2;
            oo0o.f97029OooOoO0 = folder3;
            oo0o.f97031OooOoo0 = 1;
            objOooO00o = this.f96040OooO0o0.OooO00o(id, oo0o);
            if (objOooO00o != enumC32485OooO00o) {
                c27449o00O0OoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            folder3 = (Folder) oo0o.f97029OooOoO0;
            noteMeta2 = (NoteMeta) oo0o.f97026OooOo;
            c27449o00O0OoO = (C27449o00O0OoO) oo0o.f97027OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        } else {
            if (i2 == 2) {
                folder3 = (Folder) oo0o.f97029OooOoO0;
                noteMeta3 = (NoteMeta) oo0o.f97026OooOo;
                c27449o00O0OoO2 = (C27449o00O0OoO) oo0o.f97027OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                ((Boolean) objOooO00o).getClass();
                c27585o00ooO0 = c27449o00O0OoO2.f96057OooOo0o;
                parentId = noteMeta3.getParentId();
                oo0o.f97027OooOo0o = c27449o00O0OoO2;
                oo0o.f97026OooOo = folder3;
                oo0o.f97029OooOoO0 = objOooO00o;
                oo0o.f97031OooOoo0 = 3;
                if (c27585o00ooO0.OooO(parentId, oo0o) != enumC32485OooO00o) {
                    folder2 = folder3;
                    obj = objOooO00o;
                    c27449o00O0OoO3 = c27449o00O0OoO2;
                    C27585o00ooO0 c27585o00ooO02 = c27449o00O0OoO3.f96057OooOo0o;
                    if (folder2 == null) {
                    }
                    oo0o.f97027OooOo0o = obj;
                    oo0o.f97026OooOo = null;
                    oo0o.f97029OooOoO0 = null;
                    oo0o.f97031OooOoo0 = 4;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO00o);
                return C32460OooOooO.f116667OooO00o;
            }
            obj = oo0o.f97029OooOoO0;
            folder2 = (Folder) oo0o.f97026OooOo;
            c27449o00O0OoO3 = (C27449o00O0OoO) oo0o.f97027OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            C27585o00ooO0 c27585o00ooO022 = c27449o00O0OoO3.f96057OooOo0o;
            String id2 = folder2 == null ? folder2.getId() : null;
            oo0o.f97027OooOo0o = obj;
            oo0o.f97026OooOo = null;
            oo0o.f97029OooOoO0 = null;
            oo0o.f97031OooOoo0 = 4;
        }
        NoteMeta noteMeta4 = noteMeta2;
        NoteMeta noteMetaCopy$default = NoteMeta.copy$default(noteMeta4, null, null, null, folder3 != null ? folder3.getId() : null, null, false, null, 0, 0, false, null, 0, 0L, System.currentTimeMillis(), new Integer(((Number) objOooO00o).intValue()), false, false, false, 0L, 499703, null);
        oo0o.f97027OooOo0o = c27449o00O0OoO;
        oo0o.f97026OooOo = noteMeta4;
        oo0o.f97029OooOoO0 = folder3;
        oo0o.f97031OooOoo0 = 2;
        objOooO00o = c27449o00O0OoO.f96036OooO0O0.OooOo0O(new NoteMeta[]{noteMetaCopy$default}, oo0o);
        if (objOooO00o != enumC32485OooO00o) {
            c27449o00O0OoO2 = c27449o00O0OoO;
            noteMeta3 = noteMeta4;
            ((Boolean) objOooO00o).getClass();
            c27585o00ooO0 = c27449o00O0OoO2.f96057OooOo0o;
            parentId = noteMeta3.getParentId();
            oo0o.f97027OooOo0o = c27449o00O0OoO2;
            oo0o.f97026OooOo = folder3;
            oo0o.f97029OooOoO0 = objOooO00o;
            oo0o.f97031OooOoo0 = 3;
            if (c27585o00ooO0.OooO(parentId, oo0o) != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x017a, code lost:
    
        if (r0.OooO0o(r4, r2) == r3) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8 A[Catch: Exception -> 0x0062, TRY_LEAVE, TryCatch #0 {Exception -> 0x0062, blocks: (B:32:0x009d, B:34:0x00a3, B:37:0x00aa, B:40:0x00c0, B:42:0x00c8, B:19:0x005e), top: B:64:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0109 -> B:58:0x015c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x010f -> B:58:0x015c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0127 -> B:54:0x012a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0oO(String[] strArr, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00OOOO0 o00oooo02;
        String[] strArr2;
        C27449o00O0OoO c27449o00O0OoO;
        Iterator it;
        String[] strArr3;
        C27449o00O0OoO c27449o00O0OoO2;
        NotePlaceHolder notePlaceHolder;
        String string;
        String filePath;
        if (abstractC32479OooO0OO instanceof o00OOOO0) {
            o00oooo02 = (o00OOOO0) abstractC32479OooO0OO;
            int i = o00oooo02.f96219OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oooo02.f96219OooOooO = i - Integer.MIN_VALUE;
            } else {
                o00oooo02 = new o00OOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = o00oooo02.f96218OooOoo0;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00oooo02.f96219OooOooO;
        int i3 = 2;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            Set setOoooOo0 = oOo000Oo.OooOOO.OoooOo0(strArr);
            o00oooo02.f96213OooOo0o = this;
            strArr2 = strArr;
            o00oooo02.f96212OooOo = strArr2;
            o00oooo02.f96219OooOooO = 1;
            objOooO0OO = this.f96049OooOOOo.OooO0OO(setOoooOo0, o00oooo02);
            if (objOooO0OO != obj) {
                c27449o00O0OoO = this;
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                filePath = o00oooo02.f96216OooOoOO;
                notePlaceHolder = (NotePlaceHolder) o00oooo02.f96214OooOoO;
                it = o00oooo02.f96215OooOoO0;
                strArr3 = o00oooo02.f96212OooOo;
                c27449o00O0OoO2 = o00oooo02.f96213OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooO0OO);
                } catch (Exception e) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NoteUseCase");
                    c20358OooO00o.OooO0Oo(e, "remove placeholder file error.", new Object[0]);
                    string = notePlaceHolder.getExtras().getString("folder_tree_file");
                    if (string != null) {
                    }
                    i3 = 2;
                    if (!it.hasNext()) {
                    }
                    return obj;
                }
                if (((Boolean) objOooO0OO).booleanValue()) {
                }
                string = notePlaceHolder.getExtras().getString("folder_tree_file");
                if (string != null) {
                }
                i3 = 2;
                if (!it.hasNext()) {
                }
                return obj;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0OO);
                return C32460OooOooO.f116667OooO00o;
            }
            string = (String) o00oooo02.f96214OooOoO;
            Iterator it2 = o00oooo02.f96215OooOoO0;
            String[] strArr4 = o00oooo02.f96212OooOo;
            C27449o00O0OoO c27449o00O0OoO3 = o00oooo02.f96213OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
            if (((Boolean) objOooO0OO).booleanValue()) {
                boolean zDelete = new File(string).delete();
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("NoteUseCase");
                c20358OooO00o2.OooO0o0("delete placeholder file result: " + zDelete + ", deleted tempFolderTreePath: " + string, new Object[0]);
            }
            c27449o00O0OoO2 = c27449o00O0OoO3;
            strArr3 = strArr4;
            it = it2;
            i3 = 2;
            if (!it.hasNext()) {
                notePlaceHolder = (NotePlaceHolder) it.next();
                filePath = notePlaceHolder.getFilePath();
                if (filePath == null || filePath.length() == 0) {
                    string = notePlaceHolder.getExtras().getString("folder_tree_file");
                    if (string != null && string.length() != 0) {
                        C27499o00Ooo0 c27499o00Ooo0 = c27449o00O0OoO2.f96053OooOo;
                        o00oooo02.f96213OooOo0o = c27449o00O0OoO2;
                        o00oooo02.f96212OooOo = strArr3;
                        o00oooo02.f96215OooOoO0 = it;
                        o00oooo02.f96214OooOoO = string;
                        o00oooo02.f96216OooOoOO = null;
                        o00oooo02.f96219OooOooO = 3;
                        objOooO0OO = c27499o00Ooo0.OooO0Oo(string);
                        if (objOooO0OO != obj) {
                            it2 = it;
                            strArr4 = strArr3;
                            c27449o00O0OoO3 = c27449o00O0OoO2;
                            if (((Boolean) objOooO0OO).booleanValue()) {
                            }
                            c27449o00O0OoO2 = c27449o00O0OoO3;
                            strArr3 = strArr4;
                            it = it2;
                        }
                    }
                    i3 = 2;
                    if (!it.hasNext()) {
                        InterfaceC27314OooOooO interfaceC27314OooOooO = c27449o00O0OoO2.f96049OooOOOo;
                        String[] strArr5 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
                        o00oooo02.f96213OooOo0o = null;
                        o00oooo02.f96212OooOo = null;
                        o00oooo02.f96215OooOoO0 = null;
                        o00oooo02.f96214OooOoO = null;
                        o00oooo02.f96216OooOoOO = null;
                        o00oooo02.f96219OooOooO = 4;
                    }
                } else {
                    C27499o00Ooo0 c27499o00Ooo02 = c27449o00O0OoO2.f96053OooOo;
                    o00oooo02.f96213OooOo0o = c27449o00O0OoO2;
                    o00oooo02.f96212OooOo = strArr3;
                    o00oooo02.f96215OooOoO0 = it;
                    o00oooo02.f96214OooOoO = notePlaceHolder;
                    o00oooo02.f96216OooOoOO = filePath;
                    o00oooo02.f96219OooOooO = i3;
                    objOooO0OO = c27499o00Ooo02.OooO0Oo(filePath);
                    if (objOooO0OO == obj) {
                    }
                    if (((Boolean) objOooO0OO).booleanValue()) {
                        boolean zDelete2 = new File(filePath).delete();
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("NoteUseCase");
                        c20358OooO00o3.OooO0o0("delete placeholder file result: " + zDelete2 + ", deleted pdfFilePath: " + filePath, new Object[0]);
                    }
                    string = notePlaceHolder.getExtras().getString("folder_tree_file");
                    if (string != null) {
                        C27499o00Ooo0 c27499o00Ooo03 = c27449o00O0OoO2.f96053OooOo;
                        o00oooo02.f96213OooOo0o = c27449o00O0OoO2;
                        o00oooo02.f96212OooOo = strArr3;
                        o00oooo02.f96215OooOoO0 = it;
                        o00oooo02.f96214OooOoO = string;
                        o00oooo02.f96216OooOoOO = null;
                        o00oooo02.f96219OooOooO = 3;
                        objOooO0OO = c27499o00Ooo03.OooO0Oo(string);
                        if (objOooO0OO != obj) {
                        }
                    }
                    i3 = 2;
                    if (!it.hasNext()) {
                    }
                }
            }
            return obj;
        }
        strArr2 = o00oooo02.f96212OooOo;
        c27449o00O0OoO = o00oooo02.f96213OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0OO);
        it = ((Iterable) objOooO0OO).iterator();
        strArr3 = strArr2;
        c27449o00O0OoO2 = c27449o00O0OoO;
        if (!it.hasNext()) {
        }
        return obj;
    }

    public final Object Oooo0oo(NoteMeta noteMeta, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooOo0O = this.f96036OooO0O0.OooOo0O(new NoteMeta[]{NoteMeta.copy$default(noteMeta, null, null, str, null, null, false, null, 0, 0, false, null, 0, 0L, 0L, null, false, false, false, 0L, 524283, null)}, abstractC32479OooO0OO);
        return objOooOo0O == EnumC32485OooO00o.f116726OooOo0o ? objOooOo0O : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e1, code lost:
    
        if (r2.OooOO0(r4, r0, r5) != r6) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0047, B:65:0x01c3, B:67:0x01ca, B:20:0x0058, B:60:0x017d, B:62:0x0182, B:23:0x006f, B:48:0x0126, B:50:0x012a, B:51:0x013f, B:53:0x0145, B:54:0x0153, B:56:0x015d, B:26:0x0080, B:40:0x00e0, B:42:0x00e4, B:44:0x0105, B:29:0x008c, B:36:0x00c2, B:32:0x0098), top: B:73:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0047, B:65:0x01c3, B:67:0x01ca, B:20:0x0058, B:60:0x017d, B:62:0x0182, B:23:0x006f, B:48:0x0126, B:50:0x012a, B:51:0x013f, B:53:0x0145, B:54:0x0153, B:56:0x015d, B:26:0x0080, B:40:0x00e0, B:42:0x00e4, B:44:0x0105, B:29:0x008c, B:36:0x00c2, B:32:0x0098), top: B:73:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0047, B:65:0x01c3, B:67:0x01ca, B:20:0x0058, B:60:0x017d, B:62:0x0182, B:23:0x006f, B:48:0x0126, B:50:0x012a, B:51:0x013f, B:53:0x0145, B:54:0x0153, B:56:0x015d, B:26:0x0080, B:40:0x00e0, B:42:0x00e4, B:44:0x0105, B:29:0x008c, B:36:0x00c2, B:32:0x0098), top: B:73:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0182 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:12:0x0037, B:17:0x0047, B:65:0x01c3, B:67:0x01ca, B:20:0x0058, B:60:0x017d, B:62:0x0182, B:23:0x006f, B:48:0x0126, B:50:0x012a, B:51:0x013f, B:53:0x0145, B:54:0x0153, B:56:0x015d, B:26:0x0080, B:40:0x00e0, B:42:0x00e4, B:44:0x0105, B:29:0x008c, B:36:0x00c2, B:32:0x0098), top: B:73:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooO(Bitmap bitmap, String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27471o00OOOoO c27471o00OOOoO;
        C27449o00O0OoO c27449o00O0OoO;
        Object objOooO0Oo;
        String str3;
        String str4;
        C27449o00O0OoO c27449o00O0OoO2;
        Page page;
        String str5;
        Page page2;
        String str6;
        NoteContent noteContent;
        String str7;
        String str8;
        C27449o00O0OoO c27449o00O0OoO3;
        NoteMeta noteMeta;
        String str9 = str;
        String str10 = str2;
        if (abstractC32479OooO0OO instanceof C27471o00OOOoO) {
            c27471o00OOOoO = (C27471o00OOOoO) abstractC32479OooO0OO;
            int i = c27471o00OOOoO.f96240OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27471o00OOOoO.f96240OooOooO = i - Integer.MIN_VALUE;
            } else {
                c27471o00OOOoO = new C27471o00OOOoO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c27471o00OOOoO.f96239OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        try {
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteUseCase");
            c20358OooO00o.OooO0Oo(e, "saveTn failed", new Object[0]);
        }
        switch (c27471o00OOOoO.f96240OooOooO) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooO0O0);
                C26681o00o0oOO c26681o00o0oOO = this.f96041OooO0oO;
                String str11 = str10 + C18115b5.CONNECTOR + str9;
                c27471o00OOOoO.f96234OooOo0o = this;
                c27471o00OOOoO.f96233OooOo = str9;
                c27471o00OOOoO.f96236OooOoO0 = str10;
                c27471o00OOOoO.f96240OooOooO = 1;
                objOooO0O0 = c26681o00o0oOO.OooO0O0(bitmap, str11, c27471o00OOOoO);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c27449o00O0OoO = this;
                String str12 = (String) objOooO0O0;
                C27020OooOoO0 c27020OooOoO0 = c27449o00O0OoO.f96039OooO0o;
                c27471o00OOOoO.f96234OooOo0o = c27449o00O0OoO;
                c27471o00OOOoO.f96233OooOo = str9;
                c27471o00OOOoO.f96236OooOoO0 = str10;
                c27471o00OOOoO.f96235OooOoO = str12;
                c27471o00OOOoO.f96240OooOooO = 2;
                objOooO0Oo = c27020OooOoO0.OooO0Oo(str9, str10, c27471o00OOOoO);
                if (objOooO0Oo != enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                C27449o00O0OoO c27449o00O0OoO4 = c27449o00O0OoO;
                str3 = str9;
                str4 = str12;
                objOooO0O0 = objOooO0Oo;
                c27449o00O0OoO2 = c27449o00O0OoO4;
                page = (Page) objOooO0O0;
                if (page != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("NoteUseCase");
                    c20358OooO00o2.OooO0OO("saveTn failed, page is null, pageId is " + str3 + ", noteId is " + str10, new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                page.setTnPath(str4);
                InterfaceC27309OooOoO interfaceC27309OooOoO = c27449o00O0OoO2.f96035OooO00o;
                c27471o00OOOoO.f96234OooOo0o = c27449o00O0OoO2;
                c27471o00OOOoO.f96233OooOo = str3;
                c27471o00OOOoO.f96236OooOoO0 = str10;
                c27471o00OOOoO.f96235OooOoO = str4;
                c27471o00OOOoO.f96237OooOoOO = page;
                c27471o00OOOoO.f96240OooOooO = 3;
                Object objOooOO0o = interfaceC27309OooOoO.OooOO0o(str10, c27471o00OOOoO);
                if (objOooOO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                String str13 = str10;
                str5 = str4;
                page2 = page;
                objOooO0O0 = objOooOO0o;
                str6 = str13;
                noteContent = (NoteContent) objOooO0O0;
                if (noteContent != null) {
                    List<Page> pages = noteContent.getPages();
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
                    Iterator<T> it = pages.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Page) it.next()).getId());
                    }
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(str3, oOo000Oo.OooOo.Oooo0oO(arrayList))) {
                        String strOooO0Oo = c27449o00O0OoO2.f96037OooO0OO.OooO0Oo();
                        InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c27449o00O0OoO2.f96036OooO0O0;
                        c27471o00OOOoO.f96234OooOo0o = c27449o00O0OoO2;
                        c27471o00OOOoO.f96233OooOo = str6;
                        c27471o00OOOoO.f96236OooOoO0 = str5;
                        c27471o00OOOoO.f96235OooOoO = page2;
                        c27471o00OOOoO.f96237OooOoOO = null;
                        c27471o00OOOoO.f96240OooOooO = 4;
                        objOooO0O0 = interfaceC27313OooOoo0.OooO0oo(str6, strOooO0Oo, c27471o00OOOoO);
                        if (objOooO0O0 != enumC32485OooO00o) {
                            str7 = str5;
                            str8 = str6;
                            c27449o00O0OoO3 = c27449o00O0OoO2;
                            noteMeta = (NoteMeta) objOooO0O0;
                            if (noteMeta != null) {
                                InterfaceC27313OooOoo0 interfaceC27313OooOoo02 = c27449o00O0OoO3.f96036OooO0O0;
                                NoteMeta[] noteMetaArr = {NoteMeta.copy$default(noteMeta, null, null, null, null, null, false, str7, 0, 0, false, null, 0, 0L, 0L, null, false, false, false, 0L, 524223, null)};
                                c27471o00OOOoO.f96234OooOo0o = c27449o00O0OoO3;
                                c27471o00OOOoO.f96233OooOo = str8;
                                c27471o00OOOoO.f96236OooOoO0 = page2;
                                c27471o00OOOoO.f96235OooOoO = null;
                                c27471o00OOOoO.f96240OooOooO = 5;
                                objOooO0O0 = interfaceC27313OooOoo02.OooOo0O(noteMetaArr, c27471o00OOOoO);
                                if (objOooO0O0 == enumC32485OooO00o) {
                                }
                                ((Boolean) objOooO0O0).getClass();
                            }
                            c27449o00O0OoO2 = c27449o00O0OoO3;
                            str6 = str8;
                        }
                    }
                    return enumC32485OooO00o;
                }
                C27020OooOoO0 c27020OooOoO02 = c27449o00O0OoO2.f96039OooO0o;
                List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(page2);
                c27471o00OOOoO.f96234OooOo0o = null;
                c27471o00OOOoO.f96233OooOo = null;
                c27471o00OOOoO.f96236OooOoO0 = null;
                c27471o00OOOoO.f96235OooOoO = null;
                c27471o00OOOoO.f96237OooOoOO = null;
                c27471o00OOOoO.f96240OooOooO = 6;
                break;
            case 1:
                String str14 = (String) c27471o00OOOoO.f96236OooOoO0;
                String str15 = c27471o00OOOoO.f96233OooOo;
                c27449o00O0OoO = c27471o00OOOoO.f96234OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O0);
                str10 = str14;
                str9 = str15;
                String str122 = (String) objOooO0O0;
                C27020OooOoO0 c27020OooOoO03 = c27449o00O0OoO.f96039OooO0o;
                c27471o00OOOoO.f96234OooOo0o = c27449o00O0OoO;
                c27471o00OOOoO.f96233OooOo = str9;
                c27471o00OOOoO.f96236OooOoO0 = str10;
                c27471o00OOOoO.f96235OooOoO = str122;
                c27471o00OOOoO.f96240OooOooO = 2;
                objOooO0Oo = c27020OooOoO03.OooO0Oo(str9, str10, c27471o00OOOoO);
                if (objOooO0Oo != enumC32485OooO00o) {
                }
                break;
            case 2:
                str4 = (String) c27471o00OOOoO.f96235OooOoO;
                str10 = (String) c27471o00OOOoO.f96236OooOoO0;
                str3 = c27471o00OOOoO.f96233OooOo;
                c27449o00O0OoO2 = c27471o00OOOoO.f96234OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O0);
                page = (Page) objOooO0O0;
                if (page != null) {
                }
                break;
            case 3:
                page2 = c27471o00OOOoO.f96237OooOoOO;
                str5 = (String) c27471o00OOOoO.f96235OooOoO;
                str6 = (String) c27471o00OOOoO.f96236OooOoO0;
                str3 = c27471o00OOOoO.f96233OooOo;
                c27449o00O0OoO2 = c27471o00OOOoO.f96234OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O0);
                noteContent = (NoteContent) objOooO0O0;
                if (noteContent != null) {
                }
                C27020OooOoO0 c27020OooOoO022 = c27449o00O0OoO2.f96039OooO0o;
                List listOooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(page2);
                c27471o00OOOoO.f96234OooOo0o = null;
                c27471o00OOOoO.f96233OooOo = null;
                c27471o00OOOoO.f96236OooOoO0 = null;
                c27471o00OOOoO.f96235OooOoO = null;
                c27471o00OOOoO.f96237OooOoOO = null;
                c27471o00OOOoO.f96240OooOooO = 6;
                break;
            case 4:
                page2 = (Page) c27471o00OOOoO.f96235OooOoO;
                String str16 = (String) c27471o00OOOoO.f96236OooOoO0;
                String str17 = c27471o00OOOoO.f96233OooOo;
                C27449o00O0OoO c27449o00O0OoO5 = c27471o00OOOoO.f96234OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O0);
                str7 = str16;
                str8 = str17;
                c27449o00O0OoO3 = c27449o00O0OoO5;
                noteMeta = (NoteMeta) objOooO0O0;
                if (noteMeta != null) {
                }
                c27449o00O0OoO2 = c27449o00O0OoO3;
                str6 = str8;
                C27020OooOoO0 c27020OooOoO0222 = c27449o00O0OoO2.f96039OooO0o;
                List listOooO0oO22 = com.facebook.soloader.OooOo.OooO0oO(page2);
                c27471o00OOOoO.f96234OooOo0o = null;
                c27471o00OOOoO.f96233OooOo = null;
                c27471o00OOOoO.f96236OooOoO0 = null;
                c27471o00OOOoO.f96235OooOoO = null;
                c27471o00OOOoO.f96237OooOoOO = null;
                c27471o00OOOoO.f96240OooOooO = 6;
                break;
            case 5:
                page2 = (Page) c27471o00OOOoO.f96236OooOoO0;
                str8 = c27471o00OOOoO.f96233OooOo;
                c27449o00O0OoO3 = c27471o00OOOoO.f96234OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O0);
                ((Boolean) objOooO0O0).getClass();
                c27449o00O0OoO2 = c27449o00O0OoO3;
                str6 = str8;
                C27020OooOoO0 c27020OooOoO02222 = c27449o00O0OoO2.f96039OooO0o;
                List listOooO0oO222 = com.facebook.soloader.OooOo.OooO0oO(page2);
                c27471o00OOOoO.f96234OooOo0o = null;
                c27471o00OOOoO.f96233OooOo = null;
                c27471o00OOOoO.f96236OooOoO0 = null;
                c27471o00OOOoO.f96235OooOoO = null;
                c27471o00OOOoO.f96237OooOoOO = null;
                c27471o00OOOoO.f96240OooOooO = 6;
                break;
            case 6:
                C32446OooOOOo.OooO0O0(objOooO0O0);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object OoooO0(String str, String str2, AbstractC32476OooO abstractC32476OooO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00OOOOo(str, str2, null, this), abstractC32476OooO);
    }

    public final InterfaceC33721OooO0o<NoteContent> OoooO00(String noteId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        C27451OooO0o0 c27451OooO0o0 = new C27451OooO0o0(this.f96035OooO00o.OooO00o(noteId), this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C25252OooO0Oo.OooOo0O(c27451OooO0o0, ExecutorC33873OooO0O0.f122045OooOoO0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r7.OoooOo0(r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooO0O(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27470o00OOOo0 c27470o00OOOo0;
        C27449o00O0OoO c27449o00O0OoO;
        if (abstractC32479OooO0OO instanceof C27470o00OOOo0) {
            c27470o00OOOo0 = (C27470o00OOOo0) abstractC32479OooO0OO;
            int i = c27470o00OOOo0.f96232OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27470o00OOOo0.f96232OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27470o00OOOo0 = new C27470o00OOOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27470o00OOOo0.f96231OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27470o00OOOo0.f96232OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27470o00OOOo0.f96229OooOo0o = this;
            c27470o00OOOo0.f96228OooOo = str;
            c27470o00OOOo0.f96232OooOoOO = 1;
            if (this.f96039OooO0o.OooOO0(str, list, c27470o00OOOo0) != enumC32485OooO00o) {
                c27449o00O0OoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        str = c27470o00OOOo0.f96228OooOo;
        c27449o00O0OoO = c27470o00OOOo0.f96229OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        c27470o00OOOo0.f96229OooOo0o = null;
        c27470o00OOOo0.f96228OooOo = null;
        c27470o00OOOo0.f96232OooOoOO = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r7.OoooOo0(r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooOO0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27473o00OOooO c27473o00OOooO;
        C27449o00O0OoO c27449o00O0OoO;
        if (abstractC32479OooO0OO instanceof C27473o00OOooO) {
            c27473o00OOooO = (C27473o00OOooO) abstractC32479OooO0OO;
            int i = c27473o00OOooO.f96251OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27473o00OOooO.f96251OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27473o00OOooO = new C27473o00OOooO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27473o00OOooO.f96250OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27473o00OOooO.f96251OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C27474o00OOooo c27474o00OOooo = new C27474o00OOooo(str, str2, null, this);
            c27473o00OOooO.f96248OooOo0o = this;
            c27473o00OOooO.f96247OooOo = str2;
            c27473o00OOooO.f96251OooOoOO = 1;
            if (C33609OooO0oo.OooO0o(executorC33873OooO0O0, c27474o00OOooo, c27473o00OOooO) != enumC32485OooO00o) {
                c27449o00O0OoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        str2 = c27473o00OOooO.f96247OooOo;
        c27449o00O0OoO = c27473o00OOooO.f96248OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        c27473o00OOooO.f96248OooOo0o = null;
        c27473o00OOooO.f96247OooOo = null;
        c27473o00OOooO.f96251OooOoOO = 2;
    }

    public final Object OoooOOO(NoteMeta noteMeta, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooOo0O = this.f96036OooO0O0.OooOo0O(new NoteMeta[]{NoteMeta.copy$default(noteMeta, null, null, null, null, null, !noteMeta.getFavorite(), null, 0, 0, false, null, 0, 0L, 0L, null, false, false, false, 0L, 524255, null)}, abstractC32479OooO0OO);
        return objOooOo0O == EnumC32485OooO00o.f116726OooOo0o ? objOooOo0O : C32460OooOooO.f116667OooO00o;
    }

    public final Object OoooOOo(NoteContent noteContent, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27480o00Oo0O0(this, noteContent, null), abstractC32479OooO0OO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final Object OoooOo0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        if (!C24610OooO0O0.f83393OooO00o) {
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27481o00Oo0Oo(this, str, null), abstractC32479OooO0OO);
            return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteUseCase");
        c20358OooO00o.OooOO0O("skipNoteMetaWriteInEditor enabled, skip noteId=%s", str);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c5, code lost:
    
        if (r2 == r4) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[PHI: r1 r2 r5 r7
      0x0042: PHI (r1v18 java.lang.String) = (r1v13 java.lang.String), (r1v21 java.lang.String) binds: [B:63:0x0177, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r2v24 java.lang.Object) = (r2v17 java.lang.Object), (r2v1 java.lang.Object) binds: [B:63:0x0177, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r5v25 oO00ooO.OooOOO<java.lang.Integer, java.lang.Integer>) = 
      (r5v21 oO00ooO.OooOOO<java.lang.Integer, java.lang.Integer>)
      (r5v28 oO00ooO.OooOOO<java.lang.Integer, java.lang.Integer>)
     binds: [B:63:0x0177, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r7v19 o0OOo0o.o00O0OoO) = (r7v14 o0OOo0o.o00O0OoO), (r7v20 o0OOo0o.o00O0OoO) binds: [B:63:0x0177, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooOoO(String str, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27483o00Oo0o0 c27483o00Oo0o0;
        boolean z2;
        Object objOooOO0o;
        C27449o00O0OoO c27449o00O0OoO;
        NoteContent noteContent;
        List<Page> pages;
        Page page;
        Object objOooO0Oo;
        String str2;
        boolean z3;
        Page page2;
        C32443OooOOO<Integer, Integer> tnSize;
        String str3;
        C32443OooOOO<Integer, Integer> c32443OooOOO;
        Page page3;
        Page page4;
        String tnPath;
        String str4;
        C27449o00O0OoO c27449o00O0OoO2;
        String str5;
        C27449o00O0OoO c27449o00O0OoO3;
        C32443OooOOO<Integer, Integer> c32443OooOOO2;
        NoteMeta noteMeta;
        String str6 = str;
        if (abstractC32479OooO0OO instanceof C27483o00Oo0o0) {
            c27483o00Oo0o0 = (C27483o00Oo0o0) abstractC32479OooO0OO;
            int i = c27483o00Oo0o0.f96313OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27483o00Oo0o0.f96313OooOooo = i - Integer.MIN_VALUE;
            } else {
                c27483o00Oo0o0 = new C27483o00Oo0o0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo2 = c27483o00Oo0o0.f96310OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (c27483o00Oo0o0.f96313OooOooo) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooO0Oo2);
                c27483o00Oo0o0.f96306OooOo0o = this;
                c27483o00Oo0o0.f96305OooOo = str6;
                z2 = z;
                c27483o00Oo0o0.f96311OooOoo0 = z2;
                c27483o00Oo0o0.f96313OooOooo = 1;
                objOooOO0o = this.f96035OooO00o.OooOO0o(str6, c27483o00Oo0o0);
                if (objOooOO0o != enumC32485OooO00o) {
                    c27449o00O0OoO = this;
                    noteContent = (NoteContent) objOooOO0o;
                    if (noteContent != null && (pages = noteContent.getPages()) != null && (page = (Page) oOo000Oo.OooOo.Oooo(pages)) != null) {
                        C27020OooOoO0 c27020OooOoO0 = c27449o00O0OoO.f96039OooO0o;
                        String id = page.getId();
                        c27483o00Oo0o0.f96306OooOo0o = c27449o00O0OoO;
                        c27483o00Oo0o0.f96305OooOo = str6;
                        c27483o00Oo0o0.f96308OooOoO0 = page;
                        c27483o00Oo0o0.f96311OooOoo0 = z2;
                        c27483o00Oo0o0.f96313OooOooo = 2;
                        objOooO0Oo = c27020OooOoO0.OooO0Oo(id, str6, c27483o00Oo0o0);
                        if (objOooO0Oo != enumC32485OooO00o) {
                            str2 = str6;
                            z3 = z2;
                            objOooO0Oo2 = objOooO0Oo;
                            page2 = (Page) objOooO0Oo2;
                            if (page2 != null) {
                                tnSize = page2.getTnSize();
                                String tnPath2 = page2.getTnPath();
                                if (tnPath2.length() == 0) {
                                    if (z3) {
                                        C27585o00ooO0 c27585o00ooO0 = c27449o00O0OoO.f96057OooOo0o;
                                        Set setOooOO0 = C34449Oooo0oo.OooOO0(page2.getId());
                                        c27483o00Oo0o0.f96306OooOo0o = c27449o00O0OoO;
                                        c27483o00Oo0o0.f96305OooOo = str2;
                                        c27483o00Oo0o0.f96308OooOoO0 = page;
                                        c27483o00Oo0o0.f96307OooOoO = page2;
                                        c27483o00Oo0o0.f96309OooOoOO = tnSize;
                                        c27483o00Oo0o0.f96313OooOooo = 3;
                                        Serializable serializableOooO00o = c27585o00ooO0.OooO00o(setOooOO0, str2, false, c27483o00Oo0o0);
                                        if (serializableOooO00o != enumC32485OooO00o) {
                                            objOooO0Oo2 = serializableOooO00o;
                                            c32443OooOOO = tnSize;
                                            page3 = page;
                                            page4 = page2;
                                            if (((Page) ((Map) objOooO0Oo2).get(page4.getId())) == null) {
                                                C27020OooOoO0 c27020OooOoO02 = c27449o00O0OoO.f96039OooO0o;
                                                String id2 = page3.getId();
                                                c27483o00Oo0o0.f96306OooOo0o = c27449o00O0OoO;
                                                c27483o00Oo0o0.f96305OooOo = str2;
                                                c27483o00Oo0o0.f96308OooOoO0 = c32443OooOOO;
                                                c27483o00Oo0o0.f96307OooOoO = null;
                                                c27483o00Oo0o0.f96309OooOoOO = null;
                                                c27483o00Oo0o0.f96313OooOooo = 4;
                                                objOooO0Oo2 = c27020OooOoO02.OooO0Oo(id2, str2, c27483o00Oo0o0);
                                                if (objOooO0Oo2 != enumC32485OooO00o) {
                                                    str4 = str2;
                                                    c27449o00O0OoO2 = c27449o00O0OoO;
                                                    Page page5 = (Page) objOooO0Oo2;
                                                    tnPath = page5 == null ? page5.getTnPath() : null;
                                                    tnSize = c32443OooOOO;
                                                    c27449o00O0OoO = c27449o00O0OoO2;
                                                    str2 = str4;
                                                    str3 = tnPath;
                                                    str5 = str2;
                                                    c27449o00O0OoO3 = c27449o00O0OoO;
                                                    c32443OooOOO2 = tnSize;
                                                    if (str3 != null && str3.length() != 0) {
                                                        String strOooO0Oo = c27449o00O0OoO3.f96037OooO0OO.OooO0Oo();
                                                        c27483o00Oo0o0.f96306OooOo0o = c27449o00O0OoO3;
                                                        c27483o00Oo0o0.f96305OooOo = c32443OooOOO2;
                                                        c27483o00Oo0o0.f96308OooOoO0 = str3;
                                                        c27483o00Oo0o0.f96307OooOoO = null;
                                                        c27483o00Oo0o0.f96309OooOoOO = null;
                                                        c27483o00Oo0o0.f96313OooOooo = 5;
                                                        objOooO0Oo2 = c27449o00O0OoO3.f96036OooO0O0.OooO0oo(str5, strOooO0Oo, c27483o00Oo0o0);
                                                        if (objOooO0Oo2 != enumC32485OooO00o) {
                                                            String str7 = str3;
                                                            noteMeta = (NoteMeta) objOooO0Oo2;
                                                            if (noteMeta != null) {
                                                                InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c27449o00O0OoO3.f96036OooO0O0;
                                                                NoteMeta[] noteMetaArr = {NoteMeta.copy$default(noteMeta, null, null, null, null, null, false, str7, c32443OooOOO2.f116638OooOo0o.intValue(), c32443OooOOO2.f116637OooOo.intValue(), false, null, 0, 0L, 0L, null, false, false, false, 0L, 523839, null)};
                                                                c27483o00Oo0o0.f96306OooOo0o = null;
                                                                c27483o00Oo0o0.f96305OooOo = null;
                                                                c27483o00Oo0o0.f96308OooOoO0 = null;
                                                                c27483o00Oo0o0.f96313OooOooo = 6;
                                                                objOooO0Oo2 = interfaceC27313OooOoo0.OooOo0O(noteMetaArr, c27483o00Oo0o0);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                tnSize = c32443OooOOO;
                                            }
                                        }
                                    }
                                    tnPath = null;
                                    str3 = tnPath;
                                    str5 = str2;
                                    c27449o00O0OoO3 = c27449o00O0OoO;
                                    c32443OooOOO2 = tnSize;
                                    if (str3 != null) {
                                        String strOooO0Oo2 = c27449o00O0OoO3.f96037OooO0OO.OooO0Oo();
                                        c27483o00Oo0o0.f96306OooOo0o = c27449o00O0OoO3;
                                        c27483o00Oo0o0.f96305OooOo = c32443OooOOO2;
                                        c27483o00Oo0o0.f96308OooOoO0 = str3;
                                        c27483o00Oo0o0.f96307OooOoO = null;
                                        c27483o00Oo0o0.f96309OooOoOO = null;
                                        c27483o00Oo0o0.f96313OooOooo = 5;
                                        objOooO0Oo2 = c27449o00O0OoO3.f96036OooO0O0.OooO0oo(str5, strOooO0Oo2, c27483o00Oo0o0);
                                        if (objOooO0Oo2 != enumC32485OooO00o) {
                                        }
                                    }
                                    break;
                                } else {
                                    str3 = tnPath2;
                                    str5 = str2;
                                    c27449o00O0OoO3 = c27449o00O0OoO;
                                    c32443OooOOO2 = tnSize;
                                    if (str3 != null) {
                                    }
                                }
                            }
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                return enumC32485OooO00o;
            case 1:
                boolean z4 = c27483o00Oo0o0.f96311OooOoo0;
                String str8 = (String) c27483o00Oo0o0.f96305OooOo;
                C27449o00O0OoO c27449o00O0OoO4 = c27483o00Oo0o0.f96306OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo2);
                z2 = z4;
                str6 = str8;
                objOooOO0o = objOooO0Oo2;
                c27449o00O0OoO = c27449o00O0OoO4;
                noteContent = (NoteContent) objOooOO0o;
                if (noteContent != null) {
                    C27020OooOoO0 c27020OooOoO03 = c27449o00O0OoO.f96039OooO0o;
                    String id3 = page.getId();
                    c27483o00Oo0o0.f96306OooOo0o = c27449o00O0OoO;
                    c27483o00Oo0o0.f96305OooOo = str6;
                    c27483o00Oo0o0.f96308OooOoO0 = page;
                    c27483o00Oo0o0.f96311OooOoo0 = z2;
                    c27483o00Oo0o0.f96313OooOooo = 2;
                    objOooO0Oo = c27020OooOoO03.OooO0Oo(id3, str6, c27483o00Oo0o0);
                    if (objOooO0Oo != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                return C32460OooOooO.f116667OooO00o;
            case 2:
                z3 = c27483o00Oo0o0.f96311OooOoo0;
                page = (Page) c27483o00Oo0o0.f96308OooOoO0;
                str2 = (String) c27483o00Oo0o0.f96305OooOo;
                c27449o00O0OoO = c27483o00Oo0o0.f96306OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo2);
                page2 = (Page) objOooO0Oo2;
                if (page2 != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 3:
                c32443OooOOO = c27483o00Oo0o0.f96309OooOoOO;
                page4 = c27483o00Oo0o0.f96307OooOoO;
                Page page6 = (Page) c27483o00Oo0o0.f96308OooOoO0;
                String str9 = (String) c27483o00Oo0o0.f96305OooOo;
                C27449o00O0OoO c27449o00O0OoO5 = c27483o00Oo0o0.f96306OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo2);
                page3 = page6;
                str2 = str9;
                c27449o00O0OoO = c27449o00O0OoO5;
                if (((Page) ((Map) objOooO0Oo2).get(page4.getId())) == null) {
                }
                break;
            case 4:
                c32443OooOOO = (C32443OooOOO) c27483o00Oo0o0.f96308OooOoO0;
                str4 = (String) c27483o00Oo0o0.f96305OooOo;
                c27449o00O0OoO2 = c27483o00Oo0o0.f96306OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo2);
                Page page52 = (Page) objOooO0Oo2;
                if (page52 == null) {
                }
                tnSize = c32443OooOOO;
                c27449o00O0OoO = c27449o00O0OoO2;
                str2 = str4;
                str3 = tnPath;
                str5 = str2;
                c27449o00O0OoO3 = c27449o00O0OoO;
                c32443OooOOO2 = tnSize;
                if (str3 != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 5:
                str3 = (String) c27483o00Oo0o0.f96308OooOoO0;
                c32443OooOOO2 = (C32443OooOOO) c27483o00Oo0o0.f96305OooOo;
                c27449o00O0OoO3 = c27483o00Oo0o0.f96306OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo2);
                String str72 = str3;
                noteMeta = (NoteMeta) objOooO0Oo2;
                if (noteMeta != null) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 6:
                C32446OooOOOo.OooO0O0(objOooO0Oo2);
                ((Boolean) objOooO0Oo2).getClass();
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (r1 == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Ooooo00(int i, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27482o00Oo0o c27482o00Oo0o;
        int i2;
        C27449o00O0OoO c27449o00O0OoO;
        if (abstractC32479OooO0OO instanceof C27482o00Oo0o) {
            c27482o00Oo0o = (C27482o00Oo0o) abstractC32479OooO0OO;
            int i3 = c27482o00Oo0o.f96304OooOoOO;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c27482o00Oo0o.f96304OooOoOO = i3 - Integer.MIN_VALUE;
            } else {
                c27482o00Oo0o = new C27482o00Oo0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oo = c27482o00Oo0o.f96303OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c27482o00Oo0o.f96304OooOoOO;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oo);
            String strOooO0Oo = this.f96037OooO0OO.OooO0Oo();
            c27482o00Oo0o.f96301OooOo0o = this;
            i2 = i;
            c27482o00Oo0o.f96300OooOo = i2;
            c27482o00Oo0o.f96304OooOoOO = 1;
            objOooO0oo = this.f96036OooO0O0.OooO0oo(str, strOooO0Oo, c27482o00Oo0o);
            if (objOooO0oo != enumC32485OooO00o) {
                c27449o00O0OoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0oo);
            ((Boolean) objOooO0oo).getClass();
            return C32460OooOooO.f116667OooO00o;
        }
        i2 = c27482o00Oo0o.f96300OooOo;
        c27449o00O0OoO = c27482o00Oo0o.f96301OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0oo);
        int i5 = i2;
        NoteMeta noteMeta = (NoteMeta) objOooO0oo;
        if (noteMeta != null) {
            InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c27449o00O0OoO.f96036OooO0O0;
            NoteMeta[] noteMetaArr = {NoteMeta.copy$default(noteMeta, null, null, null, null, null, false, null, 0, 0, false, null, i5, 0L, 0L, null, false, false, false, 0L, 522239, null)};
            c27482o00Oo0o.f96301OooOo0o = null;
            c27482o00Oo0o.f96304OooOoOO = 2;
            objOooO0oo = interfaceC27313OooOoo0.OooOo0O(noteMetaArr, c27482o00Oo0o);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public final Object Ooooo0o(String str, long j, String str2, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        if (!C24610OooO0O0.f83393OooO00o) {
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27484o00Oo0oO(this, str, j, str2, null), abstractC32476OooO);
            return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteUseCase");
        c20358OooO00o.OooOO0O("skipNoteMetaWriteInEditor enabled, skip pageId=%s noteId=%s", str, str2);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        if (r10.OoooOo0(r12, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooooO0(List list, List list2, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27485o00Oo0oo c27485o00Oo0oo;
        C27449o00O0OoO c27449o00O0OoO;
        if (abstractC32479OooO0OO instanceof C27485o00Oo0oo) {
            c27485o00Oo0oo = (C27485o00Oo0oo) abstractC32479OooO0OO;
            int i = c27485o00Oo0oo.f96323OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27485o00Oo0oo.f96323OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27485o00Oo0oo = new C27485o00Oo0oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27485o00Oo0oo.f96322OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27485o00Oo0oo.f96323OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27485o00Oo0oo.f96320OooOo0o = this;
            c27485o00Oo0oo.f96319OooOo = str;
            c27485o00Oo0oo.f96323OooOoOO = 1;
            C27020OooOoO0 c27020OooOoO0 = this.f96039OooO0o;
            if (list.size() != list2.size()) {
                throw new IllegalArgumentException("Page IDs and directions must have the same size");
            }
            List list3 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
            int i3 = 0;
            for (Object obj2 : list3) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                arrayList.add(new PageConverter.PageRotationEntity((String) obj2, ((Page.RotationDirection) list2.get(i3)).ordinal()));
                i3 = i4;
            }
            C27015OooOOoo c27015OooOOoo = c27020OooOoO0.f94064OooO00o;
            c27015OooOOoo.getClass();
            Object objOooO0O0 = c27015OooOOoo.OooO0O0(str, new C27014OooOOo0(arrayList, null));
            EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
            if (objOooO0O0 != enumC32485OooO00o2) {
                objOooO0O0 = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0O0 != enumC32485OooO00o2) {
                objOooO0O0 = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0O0 != enumC32485OooO00o) {
                c27449o00O0OoO = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        str = c27485o00Oo0oo.f96319OooOo;
        c27449o00O0OoO = c27485o00Oo0oo.f96320OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        c27485o00Oo0oo.f96320OooOo0o = null;
        c27485o00Oo0oo.f96319OooOo = null;
        c27485o00Oo0oo.f96323OooOoOO = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o000oOoO(Note note, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00Oo00 o00oo00;
        Note note2;
        String str2;
        if (abstractC32479OooO0OO instanceof o00Oo00) {
            o00oo00 = (o00Oo00) abstractC32479OooO0OO;
            int i = o00oo00.f96268OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oo00.f96268OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o00oo00 = new o00Oo00(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = o00oo00.f96267OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00oo00.f96268OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            String id = ((Page) oOo000Oo.OooOo.Oooo0oO(note.getPages())).getId();
            String id2 = note.getId();
            o00oo00.f96265OooOo0o = note;
            o00oo00.f96264OooOo = str;
            o00oo00.f96268OooOoOO = 1;
            objOooO0Oo = this.f96039OooO0o.OooO0Oo(id, id2, o00oo00);
            if (objOooO0Oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            note2 = note;
            str2 = str;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = o00oo00.f96264OooOo;
            note2 = o00oo00.f96265OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            str2 = str3;
        }
        Page page = (Page) objOooO0Oo;
        C32443OooOOO<Integer, Integer> tnSize = page != null ? page.getTnSize() : null;
        return new NoteMeta(note2.getId(), str2, note2.getTitle(), note2.getParentId(), note2.getRecoverParentId(), note2.getFavorite(), note2.getTnPath(), tnSize != null ? tnSize.f116638OooOo0o.intValue() : 0, tnSize != null ? tnSize.f116637OooOo.intValue() : 0, note2.getInTrashBin(), note2.getPdfInfo(), note2.getPages().size(), note2.getCreationTime(), note2.getLastModificationTime(), note2.getSortKey(), note2.getUnboundedNote(), false, false, 0L, 458752, null);
    }
}
