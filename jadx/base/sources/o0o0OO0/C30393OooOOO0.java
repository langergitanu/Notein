package o0o0OO0;

import com.aspose.words.StyleIdentifier;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0Oo.C33166OooO0O0;
import oO0Oo.C33173OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o0OO0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$createTextPageWithImages$1", m80623f = "AiOcrViewModel.kt", m80624l = {StyleIdentifier.TOC_HEADING, 270, StyleIdentifier.TABLE_GRID_LIGHT, StyleIdentifier.GRID_TABLE_4}, m80625m = "invokeSuspend")
public final class C30393OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f108486OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f108487OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f108488OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f108489OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108490OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ List<String> f108491OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30393OooOOO0(C30394OooOOOO c30394OooOOOO, List<String> list, Continuation<? super C30393OooOOO0> continuation) {
        super(2, continuation);
        this.f108490OooOoOO = c30394OooOOOO;
        this.f108491OooOoo0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30393OooOOO0(this.f108490OooOoOO, this.f108491OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30393OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009b, code lost:
    
        if (r1.emit((java.lang.String) r15, r14) != r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091 A[PHI: r15
      0x0091: PHI (r15v13 java.lang.Object) = (r15v12 java.lang.Object), (r15v0 java.lang.Object) binds: [B:31:0x008e, B:11:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        String strOooO0o;
        String str3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108488OooOoO;
        C30394OooOOOO c30394OooOOOO = this.f108490OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f108488OooOoO = 1;
            obj = c30394OooOOOO.OooOO0O(this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i == 2) {
                strOooO0o = this.f108489OooOoO0;
                String str4 = this.f108486OooOo;
                str = this.f108487OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str3 = str4;
                String str5 = strOooO0o;
                String str6 = str;
                this.f108487OooOo0o = null;
                this.f108486OooOo = null;
                this.f108489OooOoO0 = null;
                this.f108488OooOoO = 3;
                C33173OooOO0o c33173OooOO0o = c30394OooOOOO.f108498OooOO0;
                c33173OooOO0o.f120039OooO.set(false);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C33166OooO0O0(this.f108491OooOoo0, c33173OooOO0o, str6, str5, str3, null), this);
                if (obj != enumC32485OooO00o) {
                    C33772OooooOo c33772OooooOo = c30394OooOOOO.f108509OooOo0;
                    this.f108488OooOoO = 4;
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
            C33772OooooOo c33772OooooOo2 = c30394OooOOOO.f108509OooOo0;
            this.f108488OooOoO = 4;
        }
        str = (String) obj;
        if (str != null && (str2 = (String) c30394OooOOOO.f108503OooOOOO.getValue()) != null) {
            strOooO0o = C30394OooOOOO.OooO0o(c30394OooOOOO);
            this.f108487OooOo0o = str;
            this.f108486OooOo = str2;
            this.f108489OooOoO0 = strOooO0o;
            this.f108488OooOoO = 2;
            if (C30394OooOOOO.OooO0oo(c30394OooOOOO, this) != enumC32485OooO00o) {
                str3 = str2;
                String str52 = strOooO0o;
                String str62 = str;
                this.f108487OooOo0o = null;
                this.f108486OooOo = null;
                this.f108489OooOoO0 = null;
                this.f108488OooOoO = 3;
                C33173OooOO0o c33173OooOO0o2 = c30394OooOOOO.f108498OooOO0;
                c33173OooOO0o2.f120039OooO.set(false);
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C33166OooO0O0(this.f108491OooOoo0, c33173OooOO0o2, str62, str52, str3, null), this);
                if (obj != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
