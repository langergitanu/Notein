package o0o0OO0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.Spanned;
import androidx.core.os.HandlerCompat;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.aspose.words.StyleIdentifier;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.App;
import com.orion.notein.domain.models.NoteinFirebaseUser;
import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.domain.models.ocr.AiOcrTextPage;
import com.orion.notein.global.R;
import com.orion.notein.richeditor.api.format.RTFormat;
import com.orion.notein.richeditor.converter.ConverterSpannedToHtml;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.C26577o000oo0O;
import o0OO00o0.C26689o0ooOoO;
import o0OOo0Oo.InterfaceC27288OooO0OO;
import o0OOo0Oo.InterfaceC27289OooO0Oo;
import o0OOo0Oo.InterfaceC27315OooOooo;
import o0OOo0Oo.InterfaceC27325OoooO00;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27597o00ooo00;
import o0oOoOo.C31030OooO00o;
import o0oo0OOo.C31236OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0Oo.C33170OooO0o0;
import oO0Oo.C33173OooOO0o;
import oO0o0O0o.EnumC33590OooOO0o;
import oO0o0OO.C33609OooO0oo;
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
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0OoO.C33799OooOO0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o0OO0.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0o0OO0/OooOOOO;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C30394OooOOOO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C27597o00ooo00 f108492OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC27325OoooO00 f108493OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC27289OooO0Oo f108494OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC27288OooO0OO f108495OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC27315OooOooo f108496OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C27449o00O0OoO f108497OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33173OooOO0o f108498OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final List<Integer> f108499OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f108500OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C33769Ooooo0o f108501OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C33769Ooooo0o f108502OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C33781o00o0O f108503OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C33769Ooooo0o f108504OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C33769Ooooo0o f108505OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C33769Ooooo0o f108506OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C33772OooooOo f108507OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33781o00o0O f108508OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final C33772OooooOo f108509OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final C33772OooooOo f108510OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final C33768Ooooo00 f108511OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33769Ooooo0o f108512OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33769Ooooo0o f108513OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C33769Ooooo0o f108514OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C33781o00o0O f108515OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C33772OooooOo f108516OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C33769Ooooo0o f108517OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C33772OooooOo f108518OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Handler f108519OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C33781o00o0O f108520Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final HandlerThread f108521Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C33898OooO0Oo f108522Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C33781o00o0O f108523Oooo00o;

    /* JADX INFO: renamed from: o0o0OO0.OooOOOO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$createTextPageWithPdfPages$1", m80623f = "AiOcrViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_3, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_3, StyleIdentifier.LIST_TABLE_4_ACCENT_4}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public String f108524OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public String f108525OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f108526OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public String f108527OooOoO0;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ C32443OooOOO<Integer, Integer> f108529OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ String f108530OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final /* synthetic */ String f108531OooOooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, C32443OooOOO<Integer, Integer> c32443OooOOO, String str2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f108530OooOoo0 = str;
            this.f108529OooOoo = c32443OooOOO;
            this.f108531OooOooO = str2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30394OooOOOO.this.new OooO00o(this.f108530OooOoo0, this.f108529OooOoo, this.f108531OooOooO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
        
            if (r4.emit((java.lang.String) r2, r18) != r1) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[PHI: r2
          0x009f: PHI (r2v11 java.lang.Object) = (r2v10 java.lang.Object), (r2v16 java.lang.Object) binds: [B:31:0x009c, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOooOO0O;
            String str;
            String str2;
            String str3;
            String str4;
            Object objOooO0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f108526OooOoO;
            C30394OooOOOO c30394OooOOOO = C30394OooOOOO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f108526OooOoO = 1;
                objOooOO0O = c30394OooOOOO.OooOO0O(this);
                if (objOooOO0O != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i == 1) {
                C32446OooOOOo.OooO0O0(obj);
                objOooOO0O = obj;
            } else {
                if (i == 2) {
                    String str5 = this.f108527OooOoO0;
                    String str6 = this.f108524OooOo;
                    str = this.f108525OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    str4 = str5;
                    str3 = str6;
                    String str7 = str;
                    C33173OooOO0o c33173OooOO0o = c30394OooOOOO.f108498OooOO0;
                    this.f108525OooOo0o = null;
                    this.f108524OooOo = null;
                    this.f108527OooOoO0 = null;
                    this.f108526OooOoO = 3;
                    c33173OooOO0o.f120039OooO.set(false);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C33170OooO0o0(this.f108530OooOoo0, c33173OooOO0o, this.f108529OooOoo, str7, str4, str3, this.f108531OooOooO, null), this);
                    if (objOooO0o != enumC32485OooO00o) {
                        C33772OooooOo c33772OooooOo = c30394OooOOOO.f108509OooOo0;
                        this.f108526OooOoO = 4;
                    }
                    return enumC32485OooO00o;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return C32460OooOooO.f116667OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
                C33772OooooOo c33772OooooOo2 = c30394OooOOOO.f108509OooOo0;
                this.f108526OooOoO = 4;
            }
            str = (String) objOooOO0O;
            if (str != null && (str2 = (String) c30394OooOOOO.f108503OooOOOO.getValue()) != null) {
                String strOooO0o = C30394OooOOOO.OooO0o(c30394OooOOOO);
                this.f108525OooOo0o = str;
                this.f108524OooOo = str2;
                this.f108527OooOoO0 = strOooO0o;
                this.f108526OooOoO = 2;
                if (C30394OooOOOO.OooO0oo(c30394OooOOOO, this) != enumC32485OooO00o) {
                    str3 = str2;
                    str4 = strOooO0o;
                    String str72 = str;
                    C33173OooOO0o c33173OooOO0o2 = c30394OooOOOO.f108498OooOO0;
                    this.f108525OooOo0o = null;
                    this.f108524OooOo = null;
                    this.f108527OooOoO0 = null;
                    this.f108526OooOoO = 3;
                    c33173OooOO0o2.f120039OooO.set(false);
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C33170OooO0o0(this.f108530OooOoo0, c33173OooOO0o2, this.f108529OooOoo, str72, str4, str3, this.f108531OooOooO, null), this);
                    if (objOooO0o != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o0OO0.OooOOOO$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$exportSession$1", m80623f = "AiOcrViewModel.kt", m80624l = {699}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f108533OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ AiOcrSession f108534OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(AiOcrSession aiOcrSession, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f108534OooOoO0 = aiOcrSession;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30394OooOOOO.this.new OooO0O0(this.f108534OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f108533OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C30394OooOOOO c30394OooOOOO = C30394OooOOOO.this;
                List list = (List) c30394OooOOOO.f108512OooOo0o.f121747OooOo0o.getValue();
                EnumC33590OooOO0o[] enumC33590OooOO0oArr = EnumC33590OooOO0o.f121266OooOo0o;
                Pattern patternCompile = Pattern.compile("<style[^>]*?>[\\s\\S]*?</style>", 66);
                kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile, "compile(...)");
                StringBuilder sb = new StringBuilder();
                int i2 = 0;
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C34429OooOOo0.OooOOo();
                        throw null;
                    }
                    AiOcrTextPage aiOcrTextPage = (AiOcrTextPage) obj2;
                    if (i2 == 0) {
                        sb.append(aiOcrTextPage.getContent());
                    } else {
                        Character chValueOf = sb.length() != 0 ? Character.valueOf(sb.charAt(sb.length() - 1)) : null;
                        if (chValueOf != null && chValueOf.charValue() == '\n') {
                            sb.append("<div style=\"page-break-before: always;\"></div>\n");
                        } else {
                            sb.append("\n<div style=\"page-break-before: always;\"></div>\n");
                        }
                        String input = aiOcrTextPage.getContent();
                        kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
                        String strReplaceAll = patternCompile.matcher(input).replaceAll("");
                        kotlin.jvm.internal.OooOOO0.OooO0o(strReplaceAll, "replaceAll(...)");
                        sb.append(strReplaceAll);
                    }
                    i2 = i3;
                }
                String string = sb.toString();
                C33772OooooOo c33772OooooOo = c30394OooOOOO.f108507OooOOoo;
                C32443OooOOO c32443OooOOO = new C32443OooOOO(this.f108534OooOoO0.getTitle(), string);
                this.f108533OooOo0o = 1;
                if (c33772OooooOo.emit(c32443OooOOO, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o0OO0.OooOOOO$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$highlightTextPage$1", m80623f = "AiOcrViewModel.kt", m80624l = {760}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f108536OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Integer f108537OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Integer num, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f108537OooOoO0 = num;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30394OooOOOO.this.new OooO0OO(this.f108537OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f108536OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33772OooooOo c33772OooooOo = C30394OooOOOO.this.f108516OooOoo;
                this.f108536OooOo0o = 1;
                if (c33772OooooOo.emit(this.f108537OooOoO0, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o0OO0.OooOOOO$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$loadSession$1", m80623f = "AiOcrViewModel.kt", m80624l = {708}, m80625m = "invokeSuspend")
    public static final class C30395OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f108539OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f108540OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30395OooO0Oo(String str, Continuation<? super C30395OooO0Oo> continuation) {
            super(2, continuation);
            this.f108540OooOoO0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C30394OooOOOO.this.new C30395OooO0Oo(this.f108540OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C30395OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f108539OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f108539OooOo0o = 1;
                if (C30394OooOOOO.OooO0oO(C30394OooOOOO.this, this.f108540OooOoO0, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o0OO0.OooOOOO$OooO0o0, reason: case insensitive filesystem */
    public static final class RunnableC30396OooO0o0 implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C30394OooOOOO f108541OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Spanned f108542OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f108543OooOoO0;

        public RunnableC30396OooO0o0(Spanned spanned, C30394OooOOOO c30394OooOOOO, String str) {
            this.f108542OooOo0o = spanned;
            this.f108541OooOo = c30394OooOOOO;
            this.f108543OooOoO0 = str;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            String text = new ConverterSpannedToHtml().convert(this.f108542OooOo0o, RTFormat.HTML).getText();
            kotlin.jvm.internal.OooOOO0.OooO0Oo(text);
            C30394OooOOOO c30394OooOOOO = this.f108541OooOo;
            c30394OooOOOO.getClass();
            C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new C30401OooOo0(c30394OooOOOO, this.f108543OooOoO0, text, null));
        }
    }

    public C30394OooOOOO(InterfaceC27325OoooO00 vertexAiRepo, InterfaceC27288OooO0OO sessionRepo, InterfaceC27289OooO0Oo pageRepo, C26577o000oo0O c26577o000oo0O, InterfaceC27315OooOooo firebaseUserRepo, C27449o00O0OoO c27449o00O0OoO, C27597o00ooo00 vipFeatureUseCase, C33173OooOO0o c33173OooOO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(vertexAiRepo, "vertexAiRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(sessionRepo, "sessionRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageRepo, "pageRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(firebaseUserRepo, "firebaseUserRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(vipFeatureUseCase, "vipFeatureUseCase");
        this.f108493OooO0Oo = vertexAiRepo;
        this.f108495OooO0o0 = sessionRepo;
        this.f108494OooO0o = pageRepo;
        this.f108496OooO0oO = firebaseUserRepo;
        this.f108497OooO0oo = c27449o00O0OoO;
        this.f108492OooO = vipFeatureUseCase;
        this.f108498OooOO0 = c33173OooOO0o;
        Integer numValueOf = Integer.valueOf(R.string.auto);
        this.f108499OooOO0O = C34429OooOOo0.OooOO0o(numValueOf, Integer.valueOf(R.string.lang_en), Integer.valueOf(R.string.lang_de), Integer.valueOf(R.string.lang_spa), Integer.valueOf(R.string.lang_fra), Integer.valueOf(R.string.lang_it), Integer.valueOf(R.string.lang_jp), Integer.valueOf(R.string.lang_kor), Integer.valueOf(R.string.lang_pt), Integer.valueOf(R.string.lang_zh), Integer.valueOf(R.string.lang_cht));
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(firebaseUserRepo.getUid(), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f108502OooOOO0 = c33769Ooooo0oOooOoO0;
        this.f108501OooOOO = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(C25252OooO0Oo.OooOoO(c33769Ooooo0oOooOoO0, new C30405OooOoO(null, this)), C25252OooO0Oo.OooOoO(c33769Ooooo0oOooOoO0, new C30407OooOoOO(null, this)), new C30384OooO0Oo(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), new C32443OooOOO(0, 0));
        C33799OooOO0O c33799OooOO0OOooOoO = C25252OooO0Oo.OooOoO(c33769Ooooo0oOooOoO0, new C30409OooOoo0(null, this));
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(null);
        this.f108503OooOOOO = c33781o00o0OOooO00o;
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33799OooOO0OOooOoO, c33781o00o0OOooO00o, new C30382OooO0O0(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f108504OooOOOo = c33769Ooooo0oOooOoO02;
        this.f108506OooOOo0 = c33769Ooooo0oOooOoO02;
        C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(c33799OooOO0OOooOoO, c33769Ooooo0oOooOoO02, new C30404OooOo0o(null, this));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33779o00Oo0 c33779o00Oo0OooO00o = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        this.f108505OooOOo = C25252OooO0Oo.OooOoO0(c33763OoooOOO, interfaceC33636Oooo00oOooO00o, c33779o00Oo0OooO00o, c34434OooOoO);
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 6);
        this.f108507OooOOoo = c33772OooooOoOooO0O0;
        this.f108510OooOo00 = c33772OooooOoOooO0O0;
        C33772OooooOo c33772OooooOoOooO0O02 = C33773Oooooo.OooO0O0(0, 0, 6);
        this.f108509OooOo0 = c33772OooooOoOooO0O02;
        this.f108511OooOo0O = C25252OooO0Oo.OooO0O0(c33772OooooOoOooO0O02);
        C33769Ooooo0o c33769Ooooo0oOooOoO03 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(c33769Ooooo0oOooOoO02, new C30408OooOoo(null, this)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f108512OooOo0o = c33769Ooooo0oOooOoO03;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(null);
        this.f108508OooOo = c33781o00o0OOooO00o2;
        this.f108514OooOoO0 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33781o00o0OOooO00o2, c33769Ooooo0oOooOoO03, new C30383OooO0OO(3, null)), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f108513OooOoO = C25252OooO0Oo.OooOoO0(c26577o000oo0O.OooO0O0(App.f69576o00000), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), "yy/MM/dd");
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o(numValueOf);
        this.f108515OooOoOO = c33781o00o0OOooO00o3;
        this.f108517OooOoo0 = C25252OooO0Oo.OooOoO0(new C26689o0ooOoO(c33781o00o0OOooO00o3, this, 1), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        C33772OooooOo c33772OooooOoOooO0O03 = C33773Oooooo.OooO0O0(0, 0, 6);
        this.f108516OooOoo = c33772OooooOoOooO0O03;
        this.f108518OooOooO = c33772OooooOoOooO0O03;
        HandlerThread handlerThread = new HandlerThread("Text Recognize Session saver");
        this.f108521Oooo000 = handlerThread;
        if (!handlerThread.isAlive()) {
            handlerThread.start();
        }
        this.f108519OooOooo = new Handler(handlerThread.getLooper());
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new C30381OooO00o(null, this), 3);
        this.f108522Oooo00O = C33900OooO0o0.OooO00o();
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o(C31236OooO00o.f111404OooO00o);
        this.f108523Oooo00o = c33781o00o0OOooO00o4;
        this.f108520Oooo0 = c33781o00o0OOooO00o4;
    }

    public static final String OooO0o(C30394OooOOOO c30394OooOOOO) {
        switch (((Number) c30394OooOOOO.f108515OooOoOO.getValue()).intValue()) {
            case R.string.lang_cht /* 2131952746 */:
                return "zh-rTW";
            case R.string.lang_de /* 2131952748 */:
                return TranslateLanguage.GERMAN;
            case R.string.lang_en /* 2131952750 */:
                return TranslateLanguage.ENGLISH;
            case R.string.lang_fra /* 2131952753 */:
                return TranslateLanguage.FRENCH;
            case R.string.lang_it /* 2131952757 */:
                return TranslateLanguage.ITALIAN;
            case R.string.lang_jp /* 2131952758 */:
                return TranslateLanguage.JAPANESE;
            case R.string.lang_kor /* 2131952759 */:
                return TranslateLanguage.KOREAN;
            case R.string.lang_pt /* 2131952765 */:
                return TranslateLanguage.PORTUGUESE;
            case R.string.lang_spa /* 2131952769 */:
                return TranslateLanguage.SPANISH;
            case R.string.lang_zh /* 2131952778 */:
                return "zh-rCN";
            default:
                return "auto";
        }
    }

    public static final String OooO0o0(C30394OooOOOO c30394OooOOOO, List list) {
        EnumC33590OooOO0o[] enumC33590OooOO0oArr = EnumC33590OooOO0o.f121266OooOo0o;
        Pattern patternCompile = Pattern.compile("<style[^>]*?>[\\s\\S]*?</style>", 66);
        kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile, "compile(...)");
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String input = ((AiOcrTextPage) it.next()).getContent();
            kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
            String strReplaceAll = patternCompile.matcher(input).replaceAll("");
            kotlin.jvm.internal.OooOOO0.OooO0o(strReplaceAll, "replaceAll(...)");
            sb.append(strReplaceAll);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0oO(C30394OooOOOO c30394OooOOOO, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30402OooOo00 c30402OooOo00;
        AiOcrSession aiOcrSession;
        c30394OooOOOO.getClass();
        if (abstractC32479OooO0OO instanceof C30402OooOo00) {
            c30402OooOo00 = (C30402OooOo00) abstractC32479OooO0OO;
            int i = c30402OooOo00.f108571OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30402OooOo00.f108571OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c30402OooOo00 = new C30402OooOo00(c30394OooOOOO, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c30402OooOo00.f108570OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30402OooOo00.f108571OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c30394OooOOOO.f108500OooOO0o = 0;
            if (str == null) {
                aiOcrSession = null;
                c30394OooOOOO.f108503OooOOOO.setValue(str);
                return aiOcrSession;
            }
            c30402OooOo00.f108568OooOo0o = c30394OooOOOO;
            c30402OooOo00.f108567OooOo = str;
            c30402OooOo00.f108571OooOoOO = 1;
            objOooO0O0 = c30394OooOOOO.f108495OooO0o0.OooO0O0(str, c30402OooOo00);
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c30402OooOo00.f108567OooOo;
            c30394OooOOOO = c30402OooOo00.f108568OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        aiOcrSession = (AiOcrSession) objOooO0O0;
        c30394OooOOOO.f108503OooOOOO.setValue(str);
        return aiOcrSession;
    }

    public static final Object OooO0oo(C30394OooOOOO c30394OooOOOO, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        Object objEmit = c30394OooOOOO.f108509OooOo0.emit("599997", abstractC32476OooO);
        return objEmit == EnumC32485OooO00o.f116726OooOo0o ? objEmit : C32460OooOooO.f116667OooO00o;
    }

    public final void OooO(String uriStr, C32443OooOOO<Integer, Integer> c32443OooOOO, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(uriStr, "uriStr");
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO00o(uriStr, c32443OooOOO, str, null), 2);
    }

    @Override // androidx.lifecycle.AbstractC22019Ooooooo
    public final void OooO0OO() {
        this.f108521Oooo000.quitSafely();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOO0(String sessionId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sessionId, "sessionId");
        AiOcrSession aiOcrSession = (AiOcrSession) this.f108504OooOOOo.f121747OooOo0o.getValue();
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(aiOcrSession != null ? aiOcrSession.getId() : null, sessionId)) {
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO0O0(aiOcrSession, null), 2);
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("AiOcrViewModel");
            c20358OooO00o.OooO0OO("exportSession. Session not found: ".concat(sessionId), new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30400OooOOoo c30400OooOOoo;
        if (abstractC32479OooO0OO instanceof C30400OooOOoo) {
            c30400OooOOoo = (C30400OooOOoo) abstractC32479OooO0OO;
            int i = c30400OooOOoo.f108556OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30400OooOOoo.f108556OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c30400OooOOoo = new C30400OooOOoo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c30400OooOOoo.f108555OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30400OooOOoo.f108556OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            String str = (String) this.f108502OooOOO0.f121747OooOo0o.getValue();
            if (str != null) {
                return str;
            }
            c30400OooOOoo.f108556OooOoO0 = 1;
            objOooO0OO = this.f108496OooO0oO.OooO0OO(c30400OooOOoo);
            if (objOooO0OO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0OO);
        }
        NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) objOooO0OO;
        if (noteinFirebaseUser != null) {
            return noteinFirebaseUser.getId();
        }
        return null;
    }

    public final void OooOO0o(Integer num) {
        C33781o00o0O c33781o00o0O = this.f108508OooOo;
        if (num == null) {
            c33781o00o0O.setValue(null);
            return;
        }
        C31030OooO00o c31030OooO00o = (C31030OooO00o) oOo000Oo.OooOo.OoooO00(num.intValue(), (List) this.f108514OooOoO0.f121747OooOo0o.getValue());
        if (c31030OooO00o != null) {
            c33781o00o0O.setValue(c31030OooO00o.f110773OooO00o);
            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(this), null, null, new OooO0OO(num, null), 3);
            return;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("AiOcrViewModel");
        c20358OooO00o.OooO0OO("Failed to find selected page: " + num, new Object[0]);
    }

    public final void OooOOO(String pageId, Spanned content, long j) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(content, "content");
        Handler handler = this.f108519OooOooo;
        if (!handler.hasMessages(0, pageId)) {
            j = 0;
        }
        handler.removeCallbacksAndMessages(pageId);
        handler.sendMessageDelayed(Message.obtain(handler, 0, pageId), j);
        HandlerCompat.postDelayed(handler, new RunnableC30396OooO0o0(content, this, pageId), pageId, j);
    }

    public final void OooOOO0(String str) {
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108503OooOOOO.getValue(), str)) {
            return;
        }
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30395OooO0Oo(str, null), 2);
    }
}
