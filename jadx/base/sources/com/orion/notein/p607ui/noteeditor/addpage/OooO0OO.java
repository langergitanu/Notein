package com.orion.notein.p607ui.noteeditor.addpage;

import Oooo0.o000000O;
import android.net.Uri;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.PaperColors;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0OO.C26427Oooo0O0;
import o0OO00o0.C26577o000oo0O;
import o0OO00o0.o00OO0;
import o0OOO0OO.C27020OooOoO0;
import o0OOOO00.C27095OooOo0O;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27499o00Ooo0;
import o0OOo0o.C27570o00oOoo0;
import o0OOo0o.o00000O;
import o0OOo0o.o000OO;
import o0OOoo0o.C27869OooOOO;
import o0OoOO00.C29011OooOoO;
import o0OoOO00.C29013OooOoOO;
import o0OoOO00.C29014OooOoo;
import o0OoOO00.C29015OooOoo0;
import o0OoOO00.C29021Oooo0O0;
import o0OoOO00.C29022Oooo0OO;
import o0OoOO00.Oooo0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33768Ooooo00;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33779o00Oo0;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0OoO.C33799OooOO0O;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addpage/OooO0OO;", "Landroidx/lifecycle/Ooooooo;", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class OooO0OO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final int f73850OooOo0o = o000000O.OooO0o(130);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C27095OooOo0O f73851OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27449o00O0OoO f73852OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C27499o00Ooo0 f73853OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C27570o00oOoo0 f73854OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000OO f73855OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C27020OooOoO0 f73856OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C26427Oooo0O0 f73857OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C27869OooOOO f73858OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33781o00o0O f73859OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final InterfaceC33721OooO0o<NoteContent> f73860OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C33781o00o0O f73861OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final InterfaceC33721OooO0o<Page> f73862OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C33769Ooooo0o f73863OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C33772OooooOo f73864OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C33781o00o0O f73865OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C33768Ooooo00 f73866OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final C33769Ooooo0o f73867OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final InterfaceC33721OooO0o<Page> f73868OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final C33769Ooooo0o f73869OooOo0O;

    public static abstract class OooO00o {

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19269OooO00o extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final C19269OooO00o f73870OooO00o = new C19269OooO00o();
        }

        public static final class OooO0O0 extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f73871OooO00o;

            public OooO0O0(String str) {
                this.f73871OooO00o = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OooO0O0) && OooOOO0.OooO0O0(this.f73871OooO00o, ((OooO0O0) obj).f73871OooO00o);
            }

            public final int hashCode() {
                return this.f73871OooO00o.hashCode();
            }

            public final String toString() {
                return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("OpenImportPdf(requestKey="), this.f73871OooO00o, ")");
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.OooO0OO$OooO00o$OooO0OO, reason: collision with other inner class name */
        public static final class C19270OooO0OO extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f73872OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final String f73873OooO0O0;

            public C19270OooO0OO(String noteId, String pageId) {
                OooOOO0.OooO0oO(noteId, "noteId");
                OooOOO0.OooO0oO(pageId, "pageId");
                this.f73872OooO00o = noteId;
                this.f73873OooO0O0 = pageId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C19270OooO0OO)) {
                    return false;
                }
                C19270OooO0OO c19270OooO0OO = (C19270OooO0OO) obj;
                return OooOOO0.OooO0O0(this.f73872OooO00o, c19270OooO0OO.f73872OooO00o) && OooOOO0.OooO0O0(this.f73873OooO0O0, c19270OooO0OO.f73873OooO0O0);
            }

            public final int hashCode() {
                return this.f73873OooO0O0.hashCode() + (this.f73872OooO00o.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OpenPaperConfig(noteId=");
                sb.append(this.f73872OooO00o);
                sb.append(", pageId=");
                return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f73873OooO0O0, ")");
            }
        }

        public static final class OooO0Oo extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f73874OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final String f73875OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final String f73876OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final Uri f73877OooO0Oo;

            public OooO0Oo(String noteId, String pageId, Uri uri) {
                OooOOO0.OooO0oO(noteId, "noteId");
                OooOOO0.OooO0oO(pageId, "pageId");
                this.f73874OooO00o = "add_pdf_page";
                this.f73875OooO0O0 = noteId;
                this.f73876OooO0OO = pageId;
                this.f73877OooO0Oo = uri;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OooO0Oo)) {
                    return false;
                }
                OooO0Oo oooO0Oo = (OooO0Oo) obj;
                return OooOOO0.OooO0O0(this.f73874OooO00o, oooO0Oo.f73874OooO00o) && OooOOO0.OooO0O0(this.f73875OooO0O0, oooO0Oo.f73875OooO0O0) && OooOOO0.OooO0O0(this.f73876OooO0OO, oooO0Oo.f73876OooO0OO) && OooOOO0.OooO0O0(this.f73877OooO0Oo, oooO0Oo.f73877OooO0Oo);
            }

            public final int hashCode() {
                return this.f73877OooO0Oo.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f73874OooO00o.hashCode() * 31, 31, this.f73875OooO0O0), 31, this.f73876OooO0OO);
            }

            public final String toString() {
                return "OpenPdfPageSelector(requestKey=" + this.f73874OooO00o + ", noteId=" + this.f73875OooO0O0 + ", pageId=" + this.f73876OooO0OO + ", pdfUri=" + this.f73877OooO0Oo + ")";
            }
        }

        public static final class OooO0o extends OooO00o {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OooO0o)) {
                    return false;
                }
                ((OooO0o) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "ShowPermissionTips(title=null, content=null)";
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addpage.OooO0OO$OooO00o$OooO0o0, reason: case insensitive filesystem */
        public static final class C23364OooO0o0 extends OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final C23364OooO0o0 f73878OooO00o = new C23364OooO0o0();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageViewModel$emitHostEvent$1", m80623f = "AddPageViewModel.kt", m80624l = {151}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f73880OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ OooO00o f73881OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(OooO00o oooO00o, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f73881OooOoO0 = oooO00o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new OooO0O0(this.f73881OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f73880OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33772OooooOo c33772OooooOo = OooO0OO.this.f73864OooOOo;
                this.f73880OooOo0o = 1;
                if (c33772OooooOo.emit(this.f73881OooOoO0, this) == enumC32485OooO00o) {
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

    public OooO0OO(C27449o00O0OoO c27449o00O0OoO, C27570o00oOoo0 c27570o00oOoo0, C27499o00Ooo0 pdfFileUseCase, o000OO o000oo2, C27020OooOoO0 c27020OooOoO0, C27095OooOo0O c27095OooOo0O, C26427Oooo0O0 c26427Oooo0O0, C27869OooOOO c27869OooOOO, C26577o000oo0O c26577o000oo0O, o00000O getRemoteConfigUseCase) {
        OooOOO0.OooO0oO(pdfFileUseCase, "pdfFileUseCase");
        OooOOO0.OooO0oO(getRemoteConfigUseCase, "getRemoteConfigUseCase");
        this.f73852OooO0Oo = c27449o00O0OoO;
        this.f73854OooO0o0 = c27570o00oOoo0;
        this.f73853OooO0o = pdfFileUseCase;
        this.f73855OooO0oO = o000oo2;
        this.f73856OooO0oo = c27020OooOoO0;
        this.f73851OooO = c27095OooOo0O;
        this.f73857OooOO0 = c26427Oooo0O0;
        this.f73858OooOO0O = c27869OooOOO;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o("");
        this.f73859OooOO0o = c33781o00o0OOooO00o;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o("");
        this.f73861OooOOO0 = c33781o00o0OOooO00o2;
        o00OO0 o00oo02 = new o00OO0(c33781o00o0OOooO00o, this, 1);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        InterfaceC33721OooO0o<NoteContent> interfaceC33721OooO0oOooOo0O = C25252OooO0Oo.OooOo0O(o00oo02, executorC33873OooO0O0);
        this.f73860OooOOO = interfaceC33721OooO0oOooOo0O;
        InterfaceC33721OooO0o<Page> interfaceC33721OooO0oOooOo0O2 = C25252OooO0Oo.OooOo0O(C25252OooO0Oo.OooOo(new C29015OooOoo0(this, null), c33781o00o0OOooO00o2), executorC33873OooO0O0);
        this.f73862OooOOOO = interfaceC33721OooO0oOooOo0O2;
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(new Oooo0(interfaceC33721OooO0oOooOo0O2), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), Integer.valueOf(PaperColors.INSTANCE.getCOLOR_01()));
        this.f73863OooOOOo = c33769Ooooo0oOooOoO0;
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o(0);
        this.f73865OooOOo0 = c33781o00o0OOooO00o3;
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 1, 5);
        this.f73864OooOOo = c33772OooooOoOooO0O0;
        this.f73866OooOOoo = C25252OooO0Oo.OooO0O0(c33772OooooOoOooO0O0);
        InterfaceC33721OooO0o<Page> interfaceC33721OooO0oOooOo0O3 = C25252OooO0Oo.OooOo0O(new C33763OoooOOO(interfaceC33721OooO0oOooOo0O, interfaceC33721OooO0oOooOo0O2, new C29011OooOoO(this, null)), executorC33873OooO0O0);
        this.f73868OooOo00 = interfaceC33721OooO0oOooOo0O3;
        C33799OooOO0O c33799OooOO0OOooOo = C25252OooO0Oo.OooOo(new C29013OooOoOO(this, null), interfaceC33721OooO0oOooOo0O3);
        C29021Oooo0O0 c29021Oooo0O0 = new C29021Oooo0O0(c27095OooOo0O.OooO0Oo());
        C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(interfaceC33721OooO0oOooOo0O3, c33799OooOO0OOooOo, new C29014OooOoo(this, null));
        C33822OooO0OO c33822OooO0OOOooO0oO = C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0);
        C33779o00Oo0 c33779o00Oo0OooO00o = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(c33763OoooOOO, c33822OooO0OOOooO0oO, c33779o00Oo0OooO00o, c34434OooOoO);
        this.f73867OooOo0 = c33769Ooooo0oOooOoO02;
        this.f73869OooOo0O = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO(c33769Ooooo0oOooOoO02, c29021Oooo0O0, c33781o00o0OOooO00o3, c33769Ooooo0oOooOoO0, new C29022Oooo0OO(this, null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
    }

    public static final C32443OooOOO OooO0o0(OooO0OO oooO0OO, PaperSpec paperSpec, PaperTheme paperTheme) {
        oooO0OO.getClass();
        float height = f73850OooOo0o / paperSpec.getHeight();
        return paperTheme.getOrientation() == PaperOrientation.VERTICAL ? new C32443OooOOO(Integer.valueOf(oO0O00O.OooO00o.OooO0O0(paperSpec.getWidth() * height)), Integer.valueOf(oO0O00O.OooO00o.OooO0O0(paperSpec.getHeight() * height))) : new C32443OooOOO(Integer.valueOf(oO0O00O.OooO00o.OooO0O0(paperSpec.getHeight() * height)), Integer.valueOf(oO0O00O.OooO00o.OooO0O0(paperSpec.getWidth() * height)));
    }

    public final void OooO0o(OooO00o oooO00o) {
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new OooO0O0(oooO00o, null), 3);
    }

    public final void OooO0oO() {
        OooO0o(OooO00o.C19269OooO00o.f73870OooO00o);
    }
}
