package o0OOoo;

import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.page.Page;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32445OooOOOO;
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
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o0OOoo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.page.RecoverPageUseCase$recoverPage$2", m80623f = "RecoverPageUseCase.kt", m80624l = {35, 38, 42}, m80625m = "invokeSuspend")
public final class C27828OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f98309OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f98310OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f98311OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Page f98312OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f98313OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f98314OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27821OooO f98315OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f98316OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27828OooO0oO(C27821OooO c27821OooO, String str, String str2, Continuation<? super C27828OooO0oO> continuation) {
        super(2, continuation);
        this.f98315OooOoo0 = c27821OooO;
        this.f98314OooOoo = str;
        this.f98316OooOooO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27828OooO0oO c27828OooO0oO = new C27828OooO0oO(this.f98315OooOoo0, this.f98314OooOoo, this.f98316OooOooO, continuation);
        c27828OooO0oO.f98313OooOoOO = obj;
        return c27828OooO0oO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>> continuation) {
        return ((C27828OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0087 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:8:0x001c, B:37:0x00a5, B:15:0x0036, B:31:0x0083, B:33:0x0087, B:38:0x00bf, B:39:0x00d4, B:18:0x0042, B:25:0x0067, B:27:0x006b, B:40:0x00d5, B:41:0x00ea, B:21:0x0053), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:8:0x001c, B:37:0x00a5, B:15:0x0036, B:31:0x0083, B:33:0x0087, B:38:0x00bf, B:39:0x00d4, B:18:0x0042, B:25:0x0067, B:27:0x006b, B:40:0x00d5, B:41:0x00ea, B:21:0x0053), top: B:45:0x000c }] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        C27821OooO c27821OooO;
        String str;
        String str2;
        Page page;
        String str3;
        C27821OooO c27821OooO2;
        Page page2;
        String str4;
        String str5;
        C27821OooO c27821OooO3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98311OooOoO;
        try {
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27821OooO = this.f98315OooOoo0;
            String str6 = this.f98314OooOoo;
            str = this.f98316OooOooO;
            C27449o00O0OoO c27449o00O0OoO = c27821OooO.f98278OooO00o;
            this.f98313OooOoOO = c27821OooO;
            this.f98310OooOo0o = str6;
            this.f98309OooOo = str;
            this.f98311OooOoO = 1;
            Object objOoooO0 = c27449o00O0OoO.OoooO0(str6, str, this);
            if (objOoooO0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            str2 = str6;
            obj = objOoooO0;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = this.f98309OooOo;
                    str5 = this.f98310OooOo0o;
                    c27821OooO3 = (C27821OooO) this.f98313OooOoOO;
                    C32446OooOOOo.OooO0O0(obj);
                    Set setOooOO0 = C34449Oooo0oo.OooOO0(str5);
                    c27821OooO3.getClass();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C27829OooO0oo(c27821OooO3, setOooOO0, str4, null), 3);
                    objOooO00o = C32460OooOooO.f116667OooO00o;
                    return new C32445OooOOOO(objOooO00o);
                }
                page = this.f98312OooOoO0;
                str = this.f98309OooOo;
                str3 = this.f98310OooOo0o;
                c27821OooO2 = (C27821OooO) this.f98313OooOoOO;
                C32446OooOOOo.OooO0O0(obj);
                page2 = (Page) obj;
                if (page2 != null) {
                    throw new IllegalStateException(("No history page found for: " + str3).toString());
                }
                Page pageOooO00o = C27821OooO.OooO00o(c27821OooO2, page, page2);
                C27449o00O0OoO c27449o00O0OoO2 = c27821OooO2.f98278OooO00o;
                List listOooO0oO = OooOo.OooO0oO(pageOooO00o);
                this.f98313OooOoOO = c27821OooO2;
                this.f98310OooOo0o = str3;
                this.f98309OooOo = str;
                this.f98312OooOoO0 = null;
                this.f98311OooOoO = 3;
                if (c27449o00O0OoO2.OoooO0O(str, listOooO0oO, this) != enumC32485OooO00o) {
                    str4 = str;
                    str5 = str3;
                    c27821OooO3 = c27821OooO2;
                    Set setOooOO02 = C34449Oooo0oo.OooOO0(str5);
                    c27821OooO3.getClass();
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C27829OooO0oo(c27821OooO3, setOooOO02, str4, null), 3);
                    objOooO00o = C32460OooOooO.f116667OooO00o;
                    return new C32445OooOOOO(objOooO00o);
                }
                return enumC32485OooO00o;
            }
            str = this.f98309OooOo;
            str2 = this.f98310OooOo0o;
            c27821OooO = (C27821OooO) this.f98313OooOoOO;
            C32446OooOOOo.OooO0O0(obj);
        }
        Page page3 = (Page) obj;
        if (page3 == null) {
            throw new IllegalStateException(("Page not found: " + str2).toString());
        }
        Ooooo00.OooO oooO = c27821OooO.f98280OooO0OO;
        this.f98313OooOoOO = c27821OooO;
        this.f98310OooOo0o = str2;
        this.f98309OooOo = str;
        this.f98312OooOoO0 = page3;
        this.f98311OooOoO = 2;
        Object objOooO00o2 = oooO.OooO00o(str, str2, this);
        if (objOooO00o2 == enumC32485OooO00o) {
            return enumC32485OooO00o;
        }
        page = page3;
        obj = objOooO00o2;
        str3 = str2;
        c27821OooO2 = c27821OooO;
        page2 = (Page) obj;
        if (page2 != null) {
        }
    }
}
