package o0o000OO;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.Quote;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27457o00O0o0o;
import o0o000OO.OooOO0O;
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
import oO0o0Oo.C33772OooooOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o000OO.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$switchToNeighbourQuote$1", m80623f = "TextAnnoViewModel.kt", m80624l = {250}, m80625m = "invokeSuspend")
public final class C29771Oooo00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f105650OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105651OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f105652OooOoO0;

    /* JADX INFO: renamed from: o0o000OO.Oooo00o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$switchToNeighbourQuote$1$1", m80623f = "TextAnnoViewModel.kt", m80624l = {StyleIdentifier.MEDIUM_LIST_1_ACCENT_6, StyleIdentifier.GRID_TABLE_7_COLORFUL, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f105653OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Quote f105654OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f105655OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f105656OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ String f105657OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ boolean f105658OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOO0O oooOO0O, String str, boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f105655OooOoO = oooOO0O;
            this.f105657OooOoOO = str;
            this.f105658OooOoo0 = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f105655OooOoO, this.f105657OooOoOO, this.f105658OooOoo0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x00e0, code lost:
        
            if (r3.emit(r1, r10) == r0) goto L48;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Quote quote;
            int i;
            String id;
            Quote quote2;
            Quote quote3;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = this.f105656OooOoO0;
            String str = this.f105657OooOoOO;
            OooOO0O oooOO0O = this.f105655OooOoO;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27449o00O0OoO c27449o00O0OoO = oooOO0O.f105531OooO0Oo;
                this.f105656OooOoO0 = 1;
                obj = c27449o00O0OoO.OooOoO0(str, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 == 1) {
                C32446OooOOOo.OooO0O0(obj);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                i = this.f105653OooOo;
                quote2 = this.f105654OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                o0oo000O.OooOO0 oooOO02 = o0oo000O.OooOO0.f111232OooO00o;
                List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(quote2);
                oooOO02.getClass();
                Object objOooo = oOo000Oo.OooOo.Oooo(o0oo000O.OooOO0.OooO0o0((Page) obj, listOooO0oO));
                quote3 = !(objOooo instanceof Quote) ? (Quote) objOooo : null;
                if (quote3 != null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                C33772OooooOo c33772OooooOo = oooOO0O.f105554OooOoo;
                C32443OooOOO c32443OooOOO = new C32443OooOOO(new Integer(i), quote3);
                this.f105654OooOo0o = null;
                this.f105656OooOoO0 = 3;
            }
            NoteContent noteContent = (NoteContent) obj;
            if (noteContent == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("TextAnnoViewModel");
                c20358OooO00o.OooO0OO("switchToLastQuote: noteContent is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            if (this.f105658OooOoo0) {
                OooOO0O.OooO00o oooO00o = (OooOO0O.OooO00o) oooOO0O.f105550OooOo0o.f121747OooOo0o.getValue();
                if (oooO00o == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                quote = oooO00o.f105557OooO00o;
                i = oooO00o.f105558OooO0O0;
            } else {
                OooOO0O.OooO00o oooO00o2 = (OooOO0O.OooO00o) oooOO0O.f105546OooOo.f121747OooOo0o.getValue();
                if (oooO00o2 == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                quote = oooO00o2.f105557OooO00o;
                i = oooO00o2.f105558OooO0O0;
            }
            Page page = (Page) oOo000Oo.OooOo.OoooO00(i, noteContent.getPages());
            if (page == null || (id = page.getId()) == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            C27449o00O0OoO c27449o00O0OoO2 = oooOO0O.f105531OooO0Oo;
            this.f105654OooOo0o = quote;
            this.f105653OooOo = i;
            this.f105656OooOoO0 = 2;
            c27449o00O0OoO2.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27457o00O0o0o(id, str, null, c27449o00O0OoO2), this);
            if (obj != enumC32485OooO00o) {
                quote2 = quote;
                o0oo000O.OooOO0 oooOO022 = o0oo000O.OooOO0.f111232OooO00o;
                List listOooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(quote2);
                oooOO022.getClass();
                Object objOooo2 = oOo000Oo.OooOo.Oooo(o0oo000O.OooOO0.OooO0o0((Page) obj, listOooO0oO2));
                if (!(objOooo2 instanceof Quote)) {
                }
                if (quote3 != null) {
                }
            }
            return enumC32485OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29771Oooo00o(OooOO0O oooOO0O, boolean z, Continuation<? super C29771Oooo00o> continuation) {
        super(2, continuation);
        this.f105650OooOo = oooOO0O;
        this.f105652OooOoO0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29771Oooo00o(this.f105650OooOo, this.f105652OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29771Oooo00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105651OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            OooOO0O oooOO0O = this.f105650OooOo;
            String str = (String) oooOO0O.f105540OooOOO0.getValue();
            if (str.length() == 0) {
                return C32460OooOooO.f116667OooO00o;
            }
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            OooO00o oooO00o = new OooO00o(oooOO0O, str, this.f105652OooOoO0, null);
            this.f105651OooOo0o = 1;
            if (C33609OooO0oo.OooO0o(executorC33873OooO0O0, oooO00o, this) == enumC32485OooO00o) {
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
