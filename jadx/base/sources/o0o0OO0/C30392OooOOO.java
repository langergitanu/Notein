package o0o0OO0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0Oo.C33167OooO0OO;
import oO0Oo.C33173OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o0OO0.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.viewmodel.AiOcrViewModel$createTextPageWithNotePages$1", m80623f = "AiOcrViewModel.kt", m80624l = {382, 386, 388, 392}, m80625m = "invokeSuspend")
public final class C30392OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f108479OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f108480OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f108481OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f108482OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C30394OooOOOO f108483OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C32443OooOOO<Integer, Integer> f108484OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f108485OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30392OooOOO(C30394OooOOOO c30394OooOOOO, String str, C32443OooOOO<Integer, Integer> c32443OooOOO, Continuation<? super C30392OooOOO> continuation) {
        super(2, continuation);
        this.f108483OooOoOO = c30394OooOOOO;
        this.f108485OooOoo0 = str;
        this.f108484OooOoo = c32443OooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30392OooOOO(this.f108483OooOoOO, this.f108485OooOoo0, this.f108484OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30392OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r3.emit((java.lang.String) r2, r17) != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b A[PHI: r2
      0x009b: PHI (r2v11 java.lang.Object) = (r2v10 java.lang.Object), (r2v16 java.lang.Object) binds: [B:31:0x0098, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
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
        int i = this.f108481OooOoO;
        C30394OooOOOO c30394OooOOOO = this.f108483OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f108481OooOoO = 1;
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
                String str5 = this.f108482OooOoO0;
                String str6 = this.f108479OooOo;
                str = this.f108480OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str4 = str5;
                str3 = str6;
                String str7 = str;
                this.f108480OooOo0o = null;
                this.f108479OooOo = null;
                this.f108482OooOoO0 = null;
                this.f108481OooOoO = 3;
                C33173OooOO0o c33173OooOO0o = c30394OooOOOO.f108498OooOO0;
                c33173OooOO0o.f120039OooO.set(false);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C33167OooO0OO(c33173OooOO0o, this.f108485OooOoo0, this.f108484OooOoo, str7, str4, str3, null), this);
                if (objOooO0o != enumC32485OooO00o) {
                    C33772OooooOo c33772OooooOo = c30394OooOOOO.f108509OooOo0;
                    this.f108481OooOoO = 4;
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
            this.f108481OooOoO = 4;
        }
        str = (String) objOooOO0O;
        if (str != null && (str2 = (String) c30394OooOOOO.f108503OooOOOO.getValue()) != null) {
            String strOooO0o = C30394OooOOOO.OooO0o(c30394OooOOOO);
            this.f108480OooOo0o = str;
            this.f108479OooOo = str2;
            this.f108482OooOoO0 = strOooO0o;
            this.f108481OooOoO = 2;
            if (C30394OooOOOO.OooO0oo(c30394OooOOOO, this) != enumC32485OooO00o) {
                str3 = str2;
                str4 = strOooO0o;
                String str72 = str;
                this.f108480OooOo0o = null;
                this.f108479OooOo = null;
                this.f108482OooOoO0 = null;
                this.f108481OooOoO = 3;
                C33173OooOO0o c33173OooOO0o2 = c30394OooOOOO.f108498OooOO0;
                c33173OooOO0o2.f120039OooO.set(false);
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C33167OooO0OO(c33173OooOO0o2, this.f108485OooOoo0, this.f108484OooOoo, str72, str4, str3, null), this);
                if (objOooO0o != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
