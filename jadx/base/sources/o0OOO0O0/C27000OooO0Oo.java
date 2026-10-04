package o0OOO0O0;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: renamed from: o0OOO0O0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ocr.datasource.AiOcrSessionLocalDataSource$saveInputSource$2", m80623f = "AiOcrSessionLocalDataSource.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL, 166}, m80625m = "invokeSuspend")
public final class C27000OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AiOcrSessionInputSource>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C27002OooO0oO f93930OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33895OooO00o f93931OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public AiOcrSessionInputSource f93932OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f93933OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f93934OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f93935OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27002OooO0oO f93936OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ AiOcrSessionInputSource f93937OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27000OooO0Oo(C27002OooO0oO c27002OooO0oO, String str, AiOcrSessionInputSource aiOcrSessionInputSource, Continuation<? super C27000OooO0Oo> continuation) {
        super(2, continuation);
        this.f93936OooOoo0 = c27002OooO0oO;
        this.f93935OooOoo = str;
        this.f93937OooOooO = aiOcrSessionInputSource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27000OooO0Oo(this.f93936OooOoo0, this.f93935OooOoo, this.f93937OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AiOcrSessionInputSource> continuation) {
        return ((C27000OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        C27002OooO0oO c27002OooO0oO;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        String str;
        AiOcrSessionInputSource aiOcrSessionInputSource;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Throwable th;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93934OooOoOO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c27002OooO0oO = this.f93936OooOoo0;
                interfaceC33895OooO00o = c27002OooO0oO.f93950OooO0OO;
                this.f93931OooOo0o = interfaceC33895OooO00o;
                this.f93930OooOo = c27002OooO0oO;
                String str2 = this.f93935OooOoo;
                this.f93933OooOoO0 = str2;
                AiOcrSessionInputSource aiOcrSessionInputSource2 = this.f93937OooOooO;
                this.f93932OooOoO = aiOcrSessionInputSource2;
                this.f93934OooOoOO = 1;
                if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
                    str = str2;
                    aiOcrSessionInputSource = aiOcrSessionInputSource2;
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = this.f93931OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    AiOcrSessionInputSource aiOcrSessionInputSource3 = (AiOcrSessionInputSource) obj;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return aiOcrSessionInputSource3;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            aiOcrSessionInputSource = this.f93932OooOoO;
            str = this.f93933OooOoO0;
            c27002OooO0oO = this.f93930OooOo;
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = this.f93931OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            this.f93931OooOo0o = interfaceC33895OooO00o;
            this.f93930OooOo = null;
            this.f93933OooOoO0 = null;
            this.f93932OooOoO = null;
            this.f93934OooOoOO = 2;
            Object objOooO0O0 = C27002OooO0oO.OooO0O0(c27002OooO0oO, str, aiOcrSessionInputSource, this);
            if (objOooO0O0 != enumC32485OooO00o) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                obj = objOooO0O0;
                AiOcrSessionInputSource aiOcrSessionInputSource32 = (AiOcrSessionInputSource) obj;
                interfaceC33895OooO00o2.OooOOO0(null);
                return aiOcrSessionInputSource32;
            }
            return enumC32485OooO00o;
        } catch (Throwable th3) {
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            th = th3;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }
}
