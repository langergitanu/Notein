package o0OOoO;

import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.note.Comment;
import com.orion.notein.domain.models.page.Quote;
import com.orion.notein.domain.models.page.QuoteTextAnno;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o000O00.C24378OooOoO0;
import o000o0Oo.C24610OooO0O0;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.C26477OooO0oO;
import o0OO00o0.C26479OooOO0o;
import o0OO00o0.OooOOO;
import o0OO00o0.OooOo00;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOoO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27710OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo00 f97721OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f97722OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC27309OooOoO f97723OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27129OoooOOO f97724OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C24378OooOoO0 f97725OooO0o0;

    public C27710OooO0oo(OooOo00 oooOo00, InterfaceC27313OooOoo0 noteMetaRepo, InterfaceC27309OooOoO noteContentRepo, C27129OoooOOO c27129OoooOOO, C24378OooOoO0 c24378OooOoO0) {
        OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        OooOOO0.OooO0oO(noteContentRepo, "noteContentRepo");
        this.f97721OooO00o = oooOo00;
        this.f97722OooO0O0 = noteMetaRepo;
        this.f97723OooO0OO = noteContentRepo;
        this.f97724OooO0Oo = c27129OoooOOO;
        this.f97725OooO0o0 = c24378OooOoO0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
    
        if (r2.OooO0oO(r0, r1, r3) != r4) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(C27710OooO0oo c27710OooO0oo, String str, String str2, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27706OooO0Oo c27706OooO0Oo;
        Object objOooO0O0;
        String str4;
        String str5;
        String str6;
        C27710OooO0oo c27710OooO0oo2;
        String str7;
        String str8;
        QuoteTextAnno quoteTextAnno;
        C27710OooO0oo c27710OooO0oo3 = c27710OooO0oo;
        c27710OooO0oo3.getClass();
        if (abstractC32479OooO0OO instanceof C27706OooO0Oo) {
            c27706OooO0Oo = (C27706OooO0Oo) abstractC32479OooO0OO;
            int i = c27706OooO0Oo.f97706OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27706OooO0Oo.f97706OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27706OooO0Oo = new C27706OooO0Oo(c27710OooO0oo3, abstractC32479OooO0OO);
            }
        }
        Object obj = c27706OooO0Oo.f97703OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27706OooO0Oo.f97706OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27706OooO0Oo.f97702OooOo0o = c27710OooO0oo3;
            c27706OooO0Oo.f97701OooOo = str2;
            c27706OooO0Oo.f97704OooOoO0 = str3;
            c27706OooO0Oo.f97706OooOoo0 = 1;
            objOooO0O0 = c27710OooO0oo3.f97725OooO0o0.OooO0O0(str, str3, c27706OooO0Oo);
            if (objOooO0O0 != enumC32485OooO00o) {
                str4 = str3;
                str5 = str2;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            str7 = c27706OooO0Oo.f97704OooOoO0;
            str5 = c27706OooO0Oo.f97701OooOo;
            c27710OooO0oo2 = c27706OooO0Oo.f97702OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            str8 = str5;
            quoteTextAnno = (QuoteTextAnno) obj;
            if (quoteTextAnno == null && !OooOOO0.OooO0O0(quoteTextAnno.getText(), str8)) {
                QuoteTextAnno quoteTextAnnoCopy$default = QuoteTextAnno.copy$default(quoteTextAnno, null, null, 0, str8, 0L, 23, null);
                C24378OooOoO0 c24378OooOoO0 = c27710OooO0oo2.f97725OooO0o0;
                List listOooO0oO = OooOo.OooO0oO(quoteTextAnnoCopy$default);
                c27706OooO0Oo.f97702OooOo0o = null;
                c27706OooO0Oo.f97701OooOo = null;
                c27706OooO0Oo.f97704OooOoO0 = null;
                c27706OooO0Oo.f97706OooOoo0 = 3;
            }
            return C32460OooOooO.f116667OooO00o;
        }
        String str9 = c27706OooO0Oo.f97704OooOoO0;
        str5 = c27706OooO0Oo.f97701OooOo;
        C27710OooO0oo c27710OooO0oo4 = c27706OooO0Oo.f97702OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        str4 = str9;
        c27710OooO0oo3 = c27710OooO0oo4;
        objOooO0O0 = obj;
        Quote quote = (Quote) objOooO0O0;
        if (quote == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        List<String> annoItemIdList = quote.getAnnoItemIdList();
        if (annoItemIdList == null || (str6 = (String) oOo000Oo.OooOo.Oooo(annoItemIdList)) == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        C24378OooOoO0 c24378OooOoO02 = c27710OooO0oo3.f97725OooO0o0;
        c27706OooO0Oo.f97702OooOo0o = c27710OooO0oo3;
        c27706OooO0Oo.f97701OooOo = str5;
        c27706OooO0Oo.f97704OooOoO0 = str4;
        c27706OooO0Oo.f97706OooOoo0 = 2;
        Object objOooO0o0 = c24378OooOoO02.OooO0o0(str6, str4, c27706OooO0Oo);
        if (objOooO0o0 != enumC32485OooO00o) {
            c27710OooO0oo2 = c27710OooO0oo3;
            str7 = str4;
            obj = objOooO0o0;
            str8 = str5;
            quoteTextAnno = (QuoteTextAnno) obj;
            if (quoteTextAnno == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            QuoteTextAnno quoteTextAnnoCopy$default2 = QuoteTextAnno.copy$default(quoteTextAnno, null, null, 0, str8, 0L, 23, null);
            C24378OooOoO0 c24378OooOoO03 = c27710OooO0oo2.f97725OooO0o0;
            List listOooO0oO2 = OooOo.OooO0oO(quoteTextAnnoCopy$default2);
            c27706OooO0Oo.f97702OooOo0o = null;
            c27706OooO0Oo.f97701OooOo = null;
            c27706OooO0Oo.f97704OooOoO0 = null;
            c27706OooO0Oo.f97706OooOoo0 = 3;
        }
        return enumC32485OooO00o;
    }

    public final Object OooO0O0(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27705OooO0OO(this, list, str, null), abstractC32479OooO0OO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final InterfaceC33721OooO0o<List<Comment>> OooO0OO(String noteId) {
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO oooOOOOooO0O0 = this.f97721OooO00o.OooO0O0(noteId);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C25252OooO0Oo.OooOo0O(oooOOOOooO0O0, ExecutorC33873OooO0O0.f122045OooOoO0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r7.OooO0o0(r9, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, String str2, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27707OooO0o c27707OooO0o;
        C27710OooO0oo c27710OooO0oo;
        if (abstractC32479OooO0OO instanceof C27707OooO0o) {
            c27707OooO0o = (C27707OooO0o) abstractC32479OooO0OO;
            int i = c27707OooO0o.f97711OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27707OooO0o.f97711OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27707OooO0o = new C27707OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27707OooO0o.f97710OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27707OooO0o.f97711OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27707OooO0o.f97708OooOo0o = this;
            c27707OooO0o.f97707OooOo = str3;
            c27707OooO0o.f97711OooOoOO = 1;
            C26479OooOO0o c26479OooOO0o = this.f97721OooO00o.f91041OooO00o;
            c26479OooOO0o.getClass();
            Object objOooO00o = c26479OooOO0o.OooO00o(str3, new C26477OooO0oO(str, str2, null));
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o != enumC32485OooO00o) {
                c27710OooO0oo = this;
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
        str3 = c27707OooO0o.f97707OooOo;
        c27710OooO0oo = c27707OooO0o.f97708OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        c27707OooO0o.f97708OooOo0o = null;
        c27707OooO0o.f97707OooOo = null;
        c27707OooO0o.f97711OooOoOO = 2;
    }

    public final Object OooO0o0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        if (!C24610OooO0O0.f83393OooO00o) {
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27709OooO0oO(this, str, null), abstractC32479OooO0OO);
            return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("CommentUseCase");
        c20358OooO00o.OooOO0O("skipNoteMetaWriteInEditor enabled, skip noteId=%s", str);
        return C32460OooOooO.f116667OooO00o;
    }
}
