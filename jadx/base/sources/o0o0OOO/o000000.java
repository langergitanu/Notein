package o0o0OOO;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$selectedCoverTheme$2$1", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_3, StyleIdentifier.LIST_TABLE_4_ACCENT_3}, m80625m = "invokeSuspend")
public final class o000000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super PaperTheme>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f108985OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108986OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ PaperTheme f108987OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f108988OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ PaperOrientation f108989OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(C30520o000000o c30520o000000o, PaperTheme paperTheme, PaperOrientation paperOrientation, Continuation<? super o000000> continuation) {
        super(2, continuation);
        this.f108988OooOoO0 = c30520o000000o;
        this.f108987OooOoO = paperTheme;
        this.f108989OooOoOO = paperOrientation;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o000000 o000000Var = new o000000(this.f108988OooOoO0, this.f108987OooOoO, this.f108989OooOoOO, continuation);
        o000000Var.f108985OooOo = obj;
        return o000000Var;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super PaperTheme> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((o000000) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108986OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f108985OooOo;
            this.f108985OooOo = interfaceC33723OooO0oO;
            this.f108986OooOo0o = 1;
            obj = C30520o000000o.OooO0oo(this.f108988OooOoO0, this.f108987OooOoO, this.f108989OooOoOO, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f108985OooOo;
        C32446OooOOOo.OooO0O0(obj);
        this.f108985OooOo = null;
        this.f108986OooOo0o = 2;
    }
}
