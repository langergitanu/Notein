package o0OOO0O0;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ocr.datasource.AiOcrSessionLocalDataSource$deleteSession$2", m80623f = "AiOcrSessionLocalDataSource.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL, 59}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C27002OooO0oO f93909OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33895OooO00o f93910OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f93911OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f93912OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27002OooO0oO f93913OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f93914OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(C27002OooO0oO c27002OooO0oO, String str, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f93913OooOoOO = c27002OooO0oO;
        this.f93914OooOoo0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO00o(this.f93913OooOoOO, this.f93914OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        String str;
        C27002OooO0oO c27002OooO0oO;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93911OooOoO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27002OooO0oO c27002OooO0oO2 = this.f93913OooOoOO;
                interfaceC33895OooO00o = c27002OooO0oO2.f93950OooO0OO;
                this.f93910OooOo0o = interfaceC33895OooO00o;
                this.f93909OooOo = c27002OooO0oO2;
                str = this.f93914OooOoo0;
                this.f93912OooOoO0 = str;
                this.f93911OooOoO = 1;
                if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
                    c27002OooO0oO = c27002OooO0oO2;
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = this.f93910OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    th = th;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            String str2 = this.f93912OooOoO0;
            c27002OooO0oO = this.f93909OooOo;
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = this.f93910OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            str = str2;
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            this.f93910OooOo0o = interfaceC33895OooO00o;
            this.f93909OooOo = null;
            this.f93912OooOoO0 = null;
            this.f93911OooOoO = 2;
            if (C27002OooO0oO.OooO00o(c27002OooO0oO, str, this) != enumC32485OooO00o) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        } catch (Throwable th2) {
            th = th2;
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }
}
