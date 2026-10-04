package o0o0OO0;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.ocr.AiOcrTextPage;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0Oo.C33173OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o0OO0.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$updateTextPageWithPdfPage$1", m80623f = "AiOcrViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_6, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6, StyleIdentifier.MENTION, 376}, m80625m = "invokeSuspend")
public final class C30415Oooo0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f108633OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f108634OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f108635OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f108636OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f108637OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ int f108638OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108639OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f108640OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ int f108641OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ String f108642Oooo000;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30415Oooo0O0(C30394OooOOOO c30394OooOOOO, int i, String str, int i2, String str2, Continuation<? super C30415Oooo0O0> continuation) {
        super(2, continuation);
        this.f108639OooOoo0 = c30394OooOOOO;
        this.f108638OooOoo = i;
        this.f108640OooOooO = str;
        this.f108641OooOooo = i2;
        this.f108642Oooo000 = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30415Oooo0O0(this.f108639OooOoo0, this.f108638OooOoo, this.f108640OooOooO, this.f108641OooOooo, this.f108642Oooo000, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30415Oooo0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
    
        if (r3.emit((java.lang.String) r2, r20) != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5 A[PHI: r2
      0x00c5: PHI (r2v17 java.lang.Object) = (r2v16 java.lang.Object), (r2v22 java.lang.Object) binds: [B:36:0x00c2, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooOO0O;
        String str;
        String id;
        String str2;
        String str3;
        Object objOooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108637OooOoOO;
        C30394OooOOOO c30394OooOOOO = this.f108639OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f108637OooOoOO = 1;
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
                String str4 = this.f108635OooOoO;
                String str5 = this.f108636OooOoO0;
                id = this.f108633OooOo;
                str = this.f108634OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str3 = str4;
                str2 = str5;
                String str6 = id;
                String str7 = str;
                this.f108634OooOo0o = null;
                this.f108633OooOo = null;
                this.f108636OooOoO0 = null;
                this.f108635OooOoO = null;
                this.f108637OooOoOO = 3;
                C33173OooOO0o c33173OooOO0o = c30394OooOOOO.f108498OooOO0;
                c33173OooOO0o.f120039OooO.set(false);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new oO0Oo.OooOO0O(this.f108640OooOooO, c33173OooOO0o, this.f108641OooOooo, this.f108642Oooo000, str7, str3, str6, str2, null), this);
                if (objOooO0o != enumC32485OooO00o) {
                    C33772OooooOo c33772OooooOo = c30394OooOOOO.f108509OooOo0;
                    this.f108637OooOoOO = 4;
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
            this.f108637OooOoOO = 4;
        }
        str = (String) objOooOO0O;
        if (str == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        AiOcrTextPage aiOcrTextPage = (AiOcrTextPage) oOo000Oo.OooOo.OoooO00(this.f108638OooOoo, (List) c30394OooOOOO.f108512OooOo0o.f121747OooOo0o.getValue());
        if (aiOcrTextPage == null || (id = aiOcrTextPage.getId()) == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        String str8 = (String) c30394OooOOOO.f108503OooOOOO.getValue();
        if (str8 == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        String strOooO0o = C30394OooOOOO.OooO0o(c30394OooOOOO);
        this.f108634OooOo0o = str;
        this.f108633OooOo = id;
        this.f108636OooOoO0 = str8;
        this.f108635OooOoO = strOooO0o;
        this.f108637OooOoOO = 2;
        if (C30394OooOOOO.OooO0oo(c30394OooOOOO, this) != enumC32485OooO00o) {
            str2 = str8;
            str3 = strOooO0o;
            String str62 = id;
            String str72 = str;
            this.f108634OooOo0o = null;
            this.f108633OooOo = null;
            this.f108636OooOoO0 = null;
            this.f108635OooOoO = null;
            this.f108637OooOoOO = 3;
            C33173OooOO0o c33173OooOO0o2 = c30394OooOOOO.f108498OooOO0;
            c33173OooOO0o2.f120039OooO.set(false);
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new oO0Oo.OooOO0O(this.f108640OooOooO, c33173OooOO0o2, this.f108641OooOooo, this.f108642Oooo000, str72, str3, str62, str2, null), this);
            if (objOooO0o != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
